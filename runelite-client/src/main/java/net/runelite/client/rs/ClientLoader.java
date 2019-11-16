/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
 * Copyright (c) 2018, Tomas Slusny <slusnucky@gmail.com>
 * Copyright (c) 2019 Abex
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
import net.runelite.client.ui.FatalErrorDialog;

import javax.swing.*;
import java.applet.Applet;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.function.Supplier;

import static net.runelite.client.rs.ClientUpdateCheckMode.NONE;

@Slf4j
public class ClientLoader implements Supplier<Applet>
{
	private static final int NUM_ATTEMPTS = 6;
	public static boolean USE_LOCAL_INJECTED = false;

	private ClientUpdateCheckMode updateCheckMode;
	private Object client = null;

	public ClientLoader(ClientUpdateCheckMode updateCheckMode)
	{
		this.updateCheckMode = updateCheckMode;
	}

	@Override
	public synchronized Applet get()
	{
		if (client == null)
		{
			client = doLoad();
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
			HostSupplier hostSupplier = new HostSupplier();

			String host = null;
			RSConfig config;
			for (int attempt = 0; ; attempt++)
			{
				try
				{
					config = ClientConfigLoader.fetch(host);

					if (Strings.isNullOrEmpty(config.getCodeBase()) || Strings.isNullOrEmpty(config.getInitialJar()) || Strings.isNullOrEmpty(config.getInitialClass()))
					{
						throw new IOException("Invalid or missing jav_config");
					}

					break;
				}
				catch (IOException e)
				{
					log.info("Failed to get jav_config from host \"{}\" ({})", host, e.getMessage());

					if (attempt >= NUM_ATTEMPTS)
					{
						throw e;
					}

					host = hostSupplier.get();
				}
				else
				{
					vanillaCacheIsInvalid = true;
				}
			}
			catch (Exception e)
			{
				log.info("Failed to read the vanilla cache: {}", e.toString());
				vanillaCacheIsInvalid = true;
			}
			vanilla.position(0);

			switch (updateCheckMode)
			{
				case AUTO:
				case CUSTOM:
					return loadRuneLite(config);
				default:
				case VANILLA:
					return loadVanilla(config);
				case NONE:
					return null;
			}
		}
		catch (IOException | ClassNotFoundException | InstantiationException | IllegalAccessException e)
		{
			log.info("Client is outdated!");
			updateCheckMode = VANILLA;
			return;
		}

		if (PATCHED_CACHE.exists())
		{
			byte[] diskBytes = Files.asByteSource(PATCHED_CACHE).hash(Hashing.sha512()).asBytes();
			if (!Arrays.equals(diskBytes, appliedPatchHash))
			{
				log.error("Unable to load client - class not found. This means you"
						+ " are not running RuneLite with Maven as the injected client"
						+ " is not in your classpath.");
			}
			else
			{
				log.info("Using cached patched client");
				return;
			}
		}

			SwingUtilities.invokeLater(() -> FatalErrorDialog.showNetErrorWindow("loading the client", e));
			return e;
		}
		catch (IOException e)
		{
			log.error("Unable to apply patch despite hash matching", e);
			updateCheckMode = VANILLA;
			return;
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
