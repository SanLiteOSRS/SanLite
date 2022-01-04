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
	private static final String RS_VERSION = "rs.version";
	private static final String GIT_COMMIT = "git.commit";
	private static final String BOOTSTRAP_LIVE_REPO = "sanlite.bootstrap.live.repo";
	private static final String BOOTSTRAP_LIVE_OLD_REPO = "sanlite.bootstrap.live.old.repo";
	private static final String BOOTSTRAP_LIVE_FALLBACK_REPO = "sanlite.bootstrap.live.repo.fallback";
	private static final String BOOTSTRAP_STAGING_REPO = "sanlite.bootstrap.staging.repo";
	private static final String BOOTSTRAP_STAGING_OLD_REPO = "sanlite.bootstrap.staging.old.repo";
	private static final String BOOTSTRAP_STAGING_FALLBACK_REPO = "sanlite.bootstrap.staging.repo.fallback";

	private final Properties properties = new Properties();

	@Inject
	public BootstrapperProperties()
	{
		try (InputStream inputStream = getClass().getResourceAsStream("bootstrapper.properties"))
		{
			properties.load(inputStream);
		}
		catch (IOException e)
		{
			log.warn("Unable to load properties", e);
		}
	}

	String getRuneLiteVersion()
	{
		return properties.getProperty(RUNELITE_VERSION);
	}

	String getSanLiteVersion()
	{
		return properties.getProperty(SANLITE_VERSION);
	}

	String getRuneScapeVersion()
	{
		return properties.getProperty(RS_VERSION);
	}

	String getGitCommit()
	{
		return properties.getProperty(GIT_COMMIT);
	}

	String getBootstrapLiveRepo()
	{
		return properties.getProperty(BOOTSTRAP_LIVE_REPO);
	}

	String getBootstrapLiveFallbackRepo()
	{
		return properties.getProperty(BOOTSTRAP_LIVE_FALLBACK_REPO);
	}

	String getBootstrapStagingRepo()
	{
		return properties.getProperty(BOOTSTRAP_STAGING_REPO);
	}

	String getBootstrapStagingFallbackRepo()
	{
		return properties.getProperty(BOOTSTRAP_STAGING_FALLBACK_REPO);
	}
}
