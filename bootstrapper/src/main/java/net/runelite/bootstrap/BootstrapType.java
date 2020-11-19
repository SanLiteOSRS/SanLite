package net.runelite.bootstrap;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum BootstrapType
{
	LIVE("Live", "live", new BootstrapperProperties().getBootstrapLiveRepo()),
	LIVE_OLD("Live old", "live-old", new BootstrapperProperties().getBootstrapLiveOldRepo()),
	LIVE_FALLBACK("Live fallback", "live-fallback", new BootstrapperProperties().getBootstrapLiveFallbackRepo()),
	STAGING("Staging", "staging", new BootstrapperProperties().getBootstrapStagingRepo()),
	STAGING_OLD("Staging old", "staging-old", new BootstrapperProperties().getBootstrapStagingOldRepo()),
	STAGING_FALLBACK("Staging fallback", "staging-fallback", new BootstrapperProperties().getBootstrapStagingFallbackRepo());

	@Getter
	private final String name;

	@Getter
	private final String outputDir;

	@Getter
	private final String repositoryUrl;
}
