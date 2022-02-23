package net.runelite.bootstrap;

import java.io.File;
import java.util.Map;

class Bootstrap
{
	private static String CLIENT_REPO_URL;
	private static final int STATIC_ARTIFACTS_SIZE = 37;
	private static Map<DynamicArtifact, String> CHECKSUMS;

	private Artifact[] artifacts;
	private String buildCommit = ""; // This should be the build commit for the release
	private Client client = new Client(
			"client",
			"",
			"jar",
			"net.runelite",
			new BootstrapperProperties().getRuneLiteVersion(),
			new BootstrapperProperties().getSanLiteVersion(),
			new BootstrapperProperties().getRuneScapeVersion()
	);

	String[] clientJvm9Arguments = new String[]{
			"-XX:+DisableAttachMechanism",
			"-Xmx512m",
			"-Xss2m",
			"-XX:CompileThreshold=1500",
			"-Djna.nosys=true"
	};

	String[] clientJvmArguments = new String[]{
			"-XX:+DisableAttachMechanism",
			"-Xmx512m",
			"-Xss2m",
			"-XX:CompileThreshold=1500",
			"-Xincgc",
			"-XX:+UseConcMarkSweepGC",
			"-XX:+UseParNewGC",
			"-Djna.nosys=true"
	};

	String[] launcherArguments = new String[]{
			"-XX:+DisableAttachMechanism",
			"-Drunelite.launcher.nojvm=true",
			"-Xmx512m",
			"-Xss2m",
			"-XX:CompileThreshold=1500",
			"-Xincgc",
			"-XX:+UseConcMarkSweepGC",
			"-XX:+UseParNewGC",
			"-Djna.nosys=true"
	};

	String[] launcherJvm11Arguments = new String[]{
			"-XX:+DisableAttachMechanism",
			"-Drunelite.launcher.nojvm=true",
			"-Xmx512m",
			"-Xss2m",
			"-XX:CompileThreshold=1500",
			"-Djna.nosys=true"
	};

	Bootstrap(String repositoryUrl, String buildCommit, Map<DynamicArtifact, String> checksums)
	{
		if (repositoryUrl.isEmpty())
		{
			throw new IllegalArgumentException("Client repository url is not valid");
		}

		CLIENT_REPO_URL = repositoryUrl;
		CHECKSUMS = checksums;
		this.buildCommit = buildCommit;
		createArtifacts();
	}

	private void createArtifacts()
	{
		artifacts = new Artifact[STATIC_ARTIFACTS_SIZE + DynamicArtifact.values().length];

		// Create static artifacts
		artifacts[0] = new Artifact();
		artifacts[0].setHash("18c4a0095d5c1da6b817592e767bb23d29dd2f560ad74df75ff3961dbde25b79");
		artifacts[0].setName("slf4j-api-1.7.25.jar");
		artifacts[0].setPath("https://mvn.runelite.net/org/slf4j/slf4j-api/1.7.25/slf4j-api-1.7.25.jar");
		artifacts[0].setSize(41203);

		artifacts[1] = new Artifact();
		artifacts[1].setHash("ad745cc243805800d1ebbf5b7deba03b37c95885e6bce71335a73f7d6d0f14ee");
		artifacts[1].setName("logback-classic-1.2.9.jar");
		artifacts[1].setPath("https://mvn.runelite.net/ch/qos/logback/logback-classic/1.2.9/logback-classic-1.2.9.jar");
		artifacts[1].setSize(233855);

		artifacts[2] = new Artifact();
		artifacts[2].setHash("4a9ef7ed809b1fbc6992bf87d404087c247e7a9766e25bb84377b58ed5c9eb58");
		artifacts[2].setName("logback-core-1.2.9.jar");
		artifacts[2].setPath("https://mvn.runelite.net/ch/qos/logback/logback-core/1.2.9/logback-core-1.2.9.jar");
		artifacts[2].setSize(454201);

		artifacts[3] = new Artifact();
		artifacts[3].setHash("9f0c8d50fa4b79b6ff1502dbec8502179d6b9497cacbe17a13074001aed537ec");
		artifacts[3].setName("jopt-simple-5.0.1.jar");
		artifacts[3].setPath("https://mvn.runelite.net/net/sf/jopt-simple/jopt-simple/5.0.1/jopt-simple-5.0.1.jar");
		artifacts[3].setSize(78826);

		artifacts[4] = new Artifact();
		artifacts[4].setHash("5be9a7d05ba0ccd74708bc8018ae412255f85843c0b92302e9b9befa6ed52564");
		artifacts[4].setName("guava-23.2-jre.jar");
		artifacts[4].setPath("https://mvn.runelite.net/com/google/guava/guava/23.2-jre/guava-23.2-jre.jar");
		artifacts[4].setSize(2649860);

		artifacts[5] = new Artifact();
		artifacts[5].setHash("9264c6931c431e928dc64adc842584d5f57d17b2f3aff29221f2b3fdea673dad");
		artifacts[5].setName("guice-4.1.0-no_aop.jar");
		artifacts[5].setPath("https://mvn.runelite.net/com/google/inject/guice/4.1.0/guice-4.1.0-no_aop.jar");
		artifacts[5].setSize(428603);

		artifacts[6] = new Artifact();
		artifacts[6].setHash("91c77044a50c481636c32d916fd89c9118a72195390452c81065080f957de7ff");
		artifacts[6].setName("javax.inject-1.jar");
		artifacts[6].setPath("https://mvn.runelite.net/javax/inject/javax.inject/1/javax.inject-1.jar");
		artifacts[6].setSize(2497);

		artifacts[7] = new Artifact();
		artifacts[7].setHash("0addec670fedcd3f113c5c8091d783280d23f75e3acb841b61a9cdb079376a08");
		artifacts[7].setName("aopalliance-1.0.jar");
		artifacts[7].setPath("https://mvn.runelite.net/aopalliance/aopalliance/1.0/aopalliance-1.0.jar");
		artifacts[7].setSize(4467);

		artifacts[8] = new Artifact();
		artifacts[8].setHash("233a0149fc365c9f6edbd683cfe266b19bdc773be98eabdaf6b3c924b48e7d81");
		artifacts[8].setName("gson-2.8.5.jar");
		artifacts[8].setPath("https://mvn.runelite.net/com/google/code/gson/gson/2.8.5/gson-2.8.5.jar");
		artifacts[8].setSize(241622);

		artifacts[9] = new Artifact();
		artifacts[9].setHash("0467d25f408428824d5c9c09ec60ee1f0bc341d9bf48971a77fd14939a826c83");
		artifacts[9].setName("substance-8.0.02.jar");
		artifacts[9].setPath("https://repo.runelite.net/net/runelite/pushingpixels/substance/8.0.02/substance-8.0.02.jar");
		artifacts[9].setSize(1589195);

		artifacts[10] = new Artifact();
		artifacts[10].setHash("3214e1c23d549d5d67c91da4da1ef33c5248470bb824f91cbe8f9e0beea59eef");
		artifacts[10].setName("trident-1.5.00.jar");
		artifacts[10].setPath("https://repo.runelite.net/net/runelite/pushingpixels/trident/1.5.00/trident-1.5.00.jar");
		artifacts[10].setSize(79726);

		artifacts[11] = new Artifact();
		artifacts[11].setHash("d4a57bbc1627da7c391308fd0fe910b83170fb66afd117236a5b111d2db1590b");
		artifacts[11].setName("commons-text-1.2.jar");
		artifacts[11].setPath("https://mvn.runelite.net/org/apache/commons/commons-text/1.2/commons-text-1.2.jar");
		artifacts[11].setSize(136544);

		artifacts[12] = new Artifact();
		artifacts[12].setHash("6e8dc31e046508d9953c96534edf0c2e0bfe6f468966b5b842b3f87e43b6a847");
		artifacts[12].setName("commons-lang3-3.7.jar");
		artifacts[12].setPath("https://mvn.runelite.net/org/apache/commons/commons-lang3/3.7/commons-lang3-3.7.jar");
		artifacts[12].setSize(499634);

		artifacts[13] = new Artifact();
		artifacts[13].setHash("100e3c65ca864732f1616d575e114e1352e6bb5b073467d42acd4c4126cfca40");
		artifacts[13].setName("jogl-all-2.4.0-rc-20200429.jar");
		artifacts[13].setPath("https://repo.runelite.net/net/runelite/jogl/jogl-all/2.4.0-rc-20200429/jogl-all-2.4.0-rc-20200429.jar");
		artifacts[13].setSize(3556304);

		artifacts[14] = new Artifact();
		artifacts[14].setHash("65512191409b98be8f435fc82dca5fe964ce79cdde5cdd09783144b5391893b2");
		artifacts[14].setName("jogl-all-2.4.0-rc-20200429-natives-windows-amd64.jar");
		artifacts[14].setPath("https://repo.runelite.net/net/runelite/jogl/jogl-all/2.4.0-rc-20200429/jogl-all-2.4.0-rc-20200429-natives-windows-amd64.jar");
		artifacts[14].setSize(227080);

		artifacts[15] = new Artifact();
		artifacts[15].setHash("e0fa809496961db1b1f840fead006a03357d1215b0464f54dd872081e2e6094b");
		artifacts[15].setName("jogl-all-2.4.0-rc-20200429-natives-windows-i586.jar");
		artifacts[15].setPath("https://repo.runelite.net/net/runelite/jogl/jogl-all/2.4.0-rc-20200429/jogl-all-2.4.0-rc-20200429-natives-windows-i586.jar");
		artifacts[15].setSize(198922);

		artifacts[16] = new Artifact();
		artifacts[16].setHash("4bad2ac72598f517f284b172827fcec591569dcf2a551b5315d58c6ddbbed94d");
		artifacts[16].setName("jogl-all-2.4.0-rc-20200429-natives-linux-amd64.jar");
		artifacts[16].setPath("https://repo.runelite.net/net/runelite/jogl/jogl-all/2.4.0-rc-20200429/jogl-all-2.4.0-rc-20200429-natives-linux-amd64.jar");
		artifacts[16].setSize(244518);

		artifacts[17] = new Artifact();
		artifacts[17].setHash("b79043af5a6f64704c1cf70264aa9acfdf8435baeb3b8196fbeb04a0192b0f41");
		artifacts[17].setName("jogl-all-natives-macosx-2.4.0-rc-20210117.jar");
		artifacts[17].setPath("https://repo.runelite.net/net/runelite/jogl/jogl-all-natives-macosx/2.4.0-rc-20210117/jogl-all-natives-macosx-2.4.0-rc-20210117.jar");
		artifacts[17].setSize(466728);

		artifacts[18] = new Artifact();
		artifacts[18].setHash("f21532326c62b8371ffe5bb5c9cdb5ae2e1c73f4893e6212f34a005a3755a58f");
		artifacts[18].setName("gluegen-rt-2.4.0-rc-20200429.jar");
		artifacts[18].setPath("https://repo.runelite.net/net/runelite/gluegen/gluegen-rt/2.4.0-rc-20200429/gluegen-rt-2.4.0-rc-20200429.jar");
		artifacts[18].setSize(360948);

		artifacts[19] = new Artifact();
		artifacts[19].setHash("b02d1c1fa3184c977e04d4abc7c944676d0591fb363885762abc5e0ced7d0b92");
		artifacts[19].setName("gluegen-rt-2.4.0-rc-20200429-natives-windows-amd64.jar");
		artifacts[19].setPath("https://repo.runelite.net/net/runelite/gluegen/gluegen-rt/2.4.0-rc-20200429/gluegen-rt-2.4.0-rc-20200429-natives-windows-amd64.jar");
		artifacts[19].setSize(8696);

		artifacts[20] = new Artifact();
		artifacts[20].setHash("337582d1ea47c240b1b58e65fdd904a2c9665e42abedf4fcf152bb669d9a3b8e");
		artifacts[20].setName("gluegen-rt-2.4.0-rc-20200429-natives-windows-i586.jar");
		artifacts[20].setPath("https://repo.runelite.net/net/runelite/gluegen/gluegen-rt/2.4.0-rc-20200429/gluegen-rt-2.4.0-rc-20200429-natives-windows-i586.jar");
		artifacts[20].setSize(7526);

		artifacts[21] = new Artifact();
		artifacts[21].setHash("785f12e6c4242450ed5bcadc541288c9ec8a9b965ee6b5cae6bff2a2c65c1e35");
		artifacts[21].setName("gluegen-rt-2.4.0-rc-20200429-natives-linux-amd64.jar");
		artifacts[21].setPath("https://repo.runelite.net/net/runelite/gluegen/gluegen-rt/2.4.0-rc-20200429/gluegen-rt-2.4.0-rc-20200429-natives-linux-amd64.jar");
		artifacts[21].setSize(4332);

		artifacts[22] = new Artifact();
		artifacts[22].setHash("b43354ca58de215423c57d428abc5c8467a1a5f0b00199aa52a67fb9729c70ef");
		artifacts[22].setName("gluegen-rt-natives-macosx-2.4.0-rc-20210117.jar");
		artifacts[22].setPath("https://repo.runelite.net/net/runelite/gluegen/gluegen-rt-natives-macosx/2.4.0-rc-20210117/gluegen-rt-natives-macosx-2.4.0-rc-20210117.jar");
		artifacts[22].setSize(6539);

		artifacts[23] = new Artifact();
		artifacts[23].setHash("ce932f3eeeb31021ae4d62108fdab23e18b7efd79833e4cd050e2d78d78c3347");
		artifacts[23].setName("archive-patcher-applier-1.2.jar");
		artifacts[23].setPath("https://repo.runelite.net/net/runelite/archive-patcher/archive-patcher-applier/1.2/archive-patcher-applier-1.2.jar");
		artifacts[23].setSize(50339);

		artifacts[24] = new Artifact();
		artifacts[24].setHash("eafcc780b445434d3c5ae7fa2fb6665de1a7560d537d2c408a8e80cd14d27161");
		artifacts[24].setName("jna-5.9.0.jar");
		artifacts[24].setPath("https://mvn.runelite.net/net/java/dev/jna/jna/5.9.0/jna-5.9.0.jar");
		artifacts[24].setSize(1729586);

		artifacts[25] = new Artifact();
		artifacts[25].setHash("1903bc6d87f3ab92023957b91f45a9c8eb3515bad030356ce977201e5141b724");
		artifacts[25].setName("jna-platform-5.9.0.jar");
		artifacts[25].setPath("https://mvn.runelite.net/net/java/dev/jna/jna-platform/5.9.0/jna-platform-5.9.0.jar");
		artifacts[25].setSize(1343236);

		artifacts[26] = new Artifact();
		artifacts[26].setHash("766ad2a0783f2687962c8ad74ceecc38a28b9f72a2d085ee438b7813e928d0c7");
		artifacts[26].setName("jsr305-3.0.2.jar");
		artifacts[26].setPath("https://mvn.runelite.net/com/google/code/findbugs/jsr305/3.0.2/jsr305-3.0.2.jar");
		artifacts[26].setSize(19936);

		artifacts[27] = new Artifact();
		artifacts[27].setHash("2570fab55515cbf881d7a4ceef49fc515490bc027057e666776a2832465aeca0");
		artifacts[27].setName("okhttp-3.14.9.jar");
		artifacts[27].setPath("https://mvn.runelite.net/com/squareup/okhttp3/okhttp/3.14.9/okhttp-3.14.9.jar");
		artifacts[27].setSize(430488);

		artifacts[28] = new Artifact();
		artifacts[28].setHash("f80ce42d2ffac47ad4c47e1d6f980d604d247ceb1a886705cf4581ab0c9fe2b8");
		artifacts[28].setName("okio-1.17.2.jar");
		artifacts[28].setPath("https://mvn.runelite.net/com/squareup/okio/okio/1.17.2/okio-1.17.2.jar");
		artifacts[28].setSize(91980);

		artifacts[29] = new Artifact();
		artifacts[29].setHash("9d4924588d6280c7516db3a4b7298306db5b6f0d1cdf568ce738309b5660f008");
		artifacts[29].setName("commons-csv-1.4.jar");
		artifacts[29].setPath("https://mvn.runelite.net/org/apache/commons/commons-csv/1.4/commons-csv-1.4.jar");
		artifacts[29].setSize(39978);

		artifacts[30] = new Artifact();
		artifacts[30].setHash("6409723fd13496386dfb1335a9794dc0919db6132522f2b7486d6734fc5df6e5");
		artifacts[30].setName("discord-1.4.jar");
		artifacts[30].setPath("https://repo.runelite.net/net/runelite/discord/1.4/discord-1.4.jar");
		artifacts[30].setSize(681590);

		artifacts[31] = new Artifact();
		artifacts[31].setHash("02f291e5d1243dc143496e3cbbb40a1ced47aa58f2d633d3e38780cd068d5074");
		artifacts[31].setName("commons-io-2.8.0.jar");
		artifacts[31].setPath("https://repo.maven.apache.org/maven2/commons-io/commons-io/2.8.0/commons-io-2.8.0.jar");
		artifacts[31].setSize(285424);

		artifacts[32] = new Artifact();
		artifacts[32].setHash("126bde4a6be269579a84a67dfc7707fd2916e0eef11b74c4de7cc61a36d2420e");
		artifacts[32].setName("jocl-1.0.jar");
		artifacts[32].setPath("https://repo.runelite.net/net/runelite/jocl/jocl/1.0/jocl-1.0.jar");
		artifacts[32].setSize(67704);

		artifacts[33] = new Artifact();
		artifacts[33].setHash("2bcb853daff68fe4faed28f871624a428c5db90f9e3ecb4286df8aeca4b93b38");
		artifacts[33].setName("jocl-1.0-macos-x64.jar");
		artifacts[33].setPath("https://repo.runelite.net/net/runelite/jocl/jocl/1.0/jocl-1.0-macos-x64.jar");
		artifacts[33].setSize(59030);

		artifacts[34] = new Artifact();
		artifacts[34].setHash("4fb96241f95970bd329ef03af1e9c94a9114e91a571523bcaf2af66bee2f2bfa");
		artifacts[34].setName("jocl-1.0-macos-arm64.jar");
		artifacts[34].setPath("https://repo.runelite.net/net/runelite/jocl/jocl/1.0/jocl-1.0-macos-arm64.jar");
		artifacts[34].setSize(59579);

		artifacts[35] = new Artifact();
		artifacts[35].setHash("9d4924588d6280c7516db3a4b7298306db5b6f0d1cdf568ce738309b5660f008");
		artifacts[35].setName("commons-csv-1.4.jar");
		artifacts[35].setPath("https://mvn.runelite.net/org/apache/commons/commons-csv/1.4/commons-csv-1.4.jar");
		artifacts[35].setSize(39978);

		artifacts[36] = new Artifact();
		artifacts[36].setHash("49132e91d30944682c7caa3d20f764d2112b59ac7ccd9cab89ca08e917c4632e");
		artifacts[36].setName("http-api-1.0.0.jar");
		artifacts[36].setPath("https://repo.runelite.net/net/runelite/arn/http-api/1.0.0/http-api-1.0.0.jar");
		artifacts[36].setSize(58112);

//		artifacts[37] = new Artifact();
//		artifacts[37].setHash("9d4924588d6280c7516db3a4b7298306db5b6f0d1cdf568ce738309b5660f008");
//		artifacts[37].setName("rsyntaxtextarea-3.1.2.jar");
//		artifacts[37].setPath("https://repo.maven.apache.org/maven2/com/fifesoft/rsyntaxtextarea/3.1.2/rsyntaxtextarea-3.1.2.jar");
//		artifacts[37].setSize(1209918);
//
//		artifacts[38] = new Artifact();
//		artifacts[38].setHash("c28575ea4256ce6fce57e820fd467b851c2bd4d816c8c51c24699ef832f91f7d");
//		artifacts[38].setName("autocomplete-3.1.1.jar");
//		artifacts[38].setPath("https://repo.maven.apache.org/maven2/com/fifesoft/autocomplete/3.1.1/autocomplete-3.1.1.jar");
//		artifacts[38].setSize(153177);

		// Create dynamic artifacts
		for (DynamicArtifact artifact : DynamicArtifact.values())
		{
			int idx = STATIC_ARTIFACTS_SIZE + artifact.ordinal();
			artifacts[idx] = new Artifact();
			artifacts[idx].setName(artifact.getFileName());
			artifacts[idx].setHash(CHECKSUMS.get(artifact));
			artifacts[idx].setPath(CLIENT_REPO_URL + artifacts[idx].getName());
			artifacts[idx].setSize(getFileSize(artifact.getFile()));
		}
	}

	private int getFileSize(File file)
	{
		return (int) file.length();
	}
}
