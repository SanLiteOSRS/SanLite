/*
 * Copyright (c) 2021, Adam <Adam@sigterm.info>
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
package net.runelite.client;

import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;
import joptsimple.internal.Strings;
import lombok.extern.slf4j.Slf4j;
import net.runelite.http.api.RuneLiteAPI;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Slf4j
class RuntimeConfigLoader implements Supplier<RuntimeConfig>
{
	private final OkHttpClient okHttpClient;
	private final CompletableFuture<RuntimeConfig> configFuture;

	public RuntimeConfigLoader(OkHttpClient okHttpClient)
	{
		this.okHttpClient = okHttpClient;
		configFuture = fetch();
	}

	@Override
	public RuntimeConfig get()
	{
		try
		{
			return configFuture.get();
		}
		catch (InterruptedException | ExecutionException e)
		{
			log.warn("error fetching runtime config", e);
			return null;
		}
	}

	private CompletableFuture<RuntimeConfig> fetch()
	{
		CompletableFuture<RuntimeConfig> future = new CompletableFuture<>();

		String prop = System.getProperty("runelite.rtconf");
		if (!Strings.isNullOrEmpty(prop))
		{
			try
			{
				log.info("Using local runtime config");

				String strConf = new String(Files.readAllBytes(Paths.get(prop)), StandardCharsets.UTF_8);
				RuntimeConfig conf = RuneLiteAPI.GSON.fromJson(strConf, RuntimeConfig.class);
				future.complete(conf);

				String strOut = RuneLiteAPI.GSON.newBuilder()
					.setPrettyPrinting()
					.create()
					.toJson(conf);
				long missingKeys = strConf.chars().filter(i -> i == ':').count() - strOut.chars().filter(i -> i == ':').count();
				if (missingKeys != 0)
				{
					log.warn("{}", strOut);
					throw new RuntimeException("local runtime config has " + missingKeys + " unused key(s)");
				}

				return future;
			}
			catch (IOException e)
			{
				throw new RuntimeException("failed to load override runtime config", e);
			}
		}

		Request request = new Request.Builder()
			.url(RuneLiteProperties.getRuneLiteConfig())
			.build();

		okHttpClient.newCall(request).enqueue(new Callback()
		{
			@Override
			public void onFailure(Call call, IOException e)
			{
				future.completeExceptionally(e);
			}

			@Override
			public void onResponse(Call call, Response response)
			{
				try // NOPMD: UseTryWithResources
				{
					future.complete(RuneLiteAPI.GSON.fromJson(new InputStreamReader(response.body().byteStream(), StandardCharsets.UTF_8), RuntimeConfig.class));
				}
				catch (Throwable ex)
				{
					future.completeExceptionally(ex);
				}
				finally
				{
					response.close();
				}
			}
		});
		return future;
	}
}
