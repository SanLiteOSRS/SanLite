package net.runelite.bootstrap;

import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Slf4j
@Singleton
public class BootstrapperProperties
{
	private static final String RUNELITE_VERSION = "runelite.version";
	private static final String SANLITE_VERSION = "sanlite.version";

	private final Properties properties = new Properties();

	@Inject
	public BootstrapperProperties()
	{
		try (InputStream in = getClass().getResourceAsStream("bootstrapper.properties"))
		{
			properties.load(in);
		}
		catch (IOException ex)
		{
			log.warn("Unable to load properties", ex);
		}
	}

	public String getRuneLiteVersion()
	{
		return properties.getProperty(RUNELITE_VERSION);
	}

	public String getSanLiteVersion()
	{
		return properties.getProperty(SANLITE_VERSION);
	}
}
