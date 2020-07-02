/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
 * Copyright (c) 2018, Tomas Slusny <slusnucky@gmail.com>
 * Copyright (c) 2018 Abex
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.rs;

import com.google.common.base.Strings;
import lombok.extern.slf4j.Slf4j;
import net.runelite.client.RuneLiteProperties;
import net.runelite.client.ui.FatalErrorDialog;
import net.runelite.client.ui.SplashScreen;
import net.runelite.http.api.worlds.World;
import okhttp3.HttpUrl;

import javax.swing.*;
import java.applet.Applet;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Map;
import java.util.function.Supplier;
import okhttp3.OkHttpClient;

import static net.runelite.client.rs.ClientUpdateCheckMode.NONE;

@Slf4j
public class ClientLoader implements Supplier<Applet>
{
	private static final int NUM_ATTEMPTS = 6;
	public static boolean USE_LOCAL_INJECTED = false;

	private final OkHttpClient okHttpClient;
	private final ClientConfigLoader clientConfigLoader;
	private ClientUpdateCheckMode updateCheckMode;
	private final WorldSupplier worldSupplier;

	private Object client = null;

	private RSConfig config;

	public ClientLoader(OkHttpClient okHttpClient, ClientUpdateCheckMode updateCheckMode)
	{
		this.okHttpClient = okHttpClient;
		this.clientConfigLoader = new ClientConfigLoader(okHttpClient);
		this.updateCheckMode = updateCheckMode;
		this.worldSupplier = new WorldSupplier(okHttpClient);
	}

	@Override
	public synchronized Applet get()
	{
		if (client == null)
		{
			client = doLoad();
			SplashScreen.stage(.465, "Starting", "Starting Old School RuneScape");
		}

		if (client instanceof Throwable)
		{
			throw new RuntimeException((Throwable) client);
		}
		return (Applet) client;
	}

	private Object doLoad()
	{
		if (updateCheckMode == NONE)
		{
			return null;
		}

		try
		{
			SplashScreen.stage(0, null, "Fetching applet viewer config");
			downloadConfig();

			SplashScreen.stage(.05, null, "Waiting for other clients to start");
			switch (updateCheckMode)
			{
				case AUTO:
				case CUSTOM:
					SplashScreen.stage(.40, null, "Loading client");
					return loadRuneLite(config);
				default:
				case VANILLA:
					SplashScreen.stage(.40, null, "Loading client");
					return loadVanilla(config);
				case NONE:
					return null;
			}
		}
		catch (IOException | ClassNotFoundException | InstantiationException | IllegalAccessException e)
		{
			if (e instanceof ClassNotFoundException)
			{
				log.error("Unable to load client - class not found. This means you"
						+ " are not running RuneLite with Maven as the injected client"
						+ " is not in your classpath.");
			}

			SwingUtilities.invokeLater(() -> FatalErrorDialog.showNetErrorWindow("loading the client", e));
			return e;
		}
	}

	private void downloadConfig() throws IOException
	{
		HttpUrl url = HttpUrl.parse(RuneLiteProperties.getJavConfig());
		IOException err = null;
		for (int attempt = 0; attempt < NUM_ATTEMPTS; attempt++)
		{
			try
			{
				config = clientConfigLoader.fetch(url);

				if (Strings.isNullOrEmpty(config.getCodeBase()) || Strings.isNullOrEmpty(config.getInitialJar()) || Strings.isNullOrEmpty(config.getInitialClass()))
				{
					throw new IOException("Invalid or missing jav_config");
				}

				return;
			}
			catch (IOException e)
			{
				log.info("Failed to get jav_config from host \"{}\" ({})", url.host(), e.getMessage());
				String host = worldSupplier.get().getAddress();
				url = url.newBuilder().host(host).build();
				err = e;
			}
		}

		log.info("Falling back to backup client config");

		try
		{
			RSConfig backupConfig = clientConfigLoader.fetch(HttpUrl.parse(RuneLiteProperties.getJavConfigBackup()));

			if (Strings.isNullOrEmpty(backupConfig.getCodeBase()) || Strings.isNullOrEmpty(backupConfig.getInitialJar()) || Strings.isNullOrEmpty(backupConfig.getInitialClass()))
			{
				throw new IOException("Invalid or missing jav_config");
			}

			if (Strings.isNullOrEmpty(backupConfig.getRuneLiteGamepack()))
			{
				throw new IOException("Backup config does not have RuneLite gamepack url");
			}

			// Randomize the codebase
			World world = worldSupplier.get();
			backupConfig.setCodebase("http://" + world.getAddress() + "/");

			// Update the world applet parameter
			Map<String, String> appletProperties = backupConfig.getAppletProperties();
			appletProperties.put(backupConfig.getRuneLiteWorldParam(), Integer.toString(world.getId()));

			config = backupConfig;
		}
		catch (IOException ex)
		{
			throw err; // use error from Jagex's servers
		}
	}

	private static Applet loadRuneLite(final RSConfig config) throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		// the injected client is a runtime scoped dependency
		final Class<?> clientClass = ClientLoader.class.getClassLoader().loadClass(config.getInitialClass());
		return loadFromClass(config, clientClass);
	}

	private static Applet loadVanilla(final RSConfig config) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		final String codebase = config.getCodeBase();
		final String initialJar = config.getInitialJar();
		final String initialClass = config.getInitialClass();
		final URL url = new URL(codebase + initialJar);

		// Must set parent classloader to null, or it will pull from
		// this class's classloader first
		final URLClassLoader classloader = new URLClassLoader(new URL[] {url}, null);
		final Class<?> clientClass = classloader.loadClass(initialClass);
		return loadFromClass(config, clientClass);
	}

	private static Applet loadFromClass(final RSConfig config, final Class<?> clientClass) throws IllegalAccessException, InstantiationException
	{
		final Applet rs = (Applet) clientClass.newInstance();
		rs.setStub(new RSAppletStub(config));
		return rs;
	}
}