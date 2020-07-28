package net.runelite.bootstrap;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum BootstrapType
{
	LIVE("Live", "live", "https://raw.githubusercontent.com/sanliteosrs/maven-repo/master/live/"),
	LIVE_BACKUP("Live Backup", "live-backup", ""),
	STAGING("Staging", "staging", "https://raw.githubusercontent.com/sanliteosrs/maven-repo/master/staging/"),
	STAGING_BACKUP("Staging Backup", "staging-backup", "");

	@Getter
	private final String name;

	@Getter
	private final String outputDir;

	@Getter
	private final String repositoryUrl;
}
