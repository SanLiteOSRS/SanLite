package net.runelite.bootstrap;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class Bootstrap
{
	private static String CLIENT_REPO_URL;

	private Artifact[] artifacts;
	private String buildCommit = ""; // This should be the build commit for the release
	String artifactId = "sanlite-client";
	String sanliteVersion = new BootstrapperProperties().getSanLiteVersion();
	String runeliteVersion = new BootstrapperProperties().getRuneLiteVersion();
	String osrsVersion = new BootstrapperProperties().getRuneScapeVersion();

	String[] client;

	private void createClientMetadata()
	{
//		client = new String[];
//		client[0] =
	}

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

	String[] dependencyHashes;

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

	Bootstrap(String repositoryUrl, String buildCommit)
	{
		CLIENT_REPO_URL = repositoryUrl;
		this.buildCommit = buildCommit;
		createArtifacts();
	}

	private static String getChecksumFile(String filepath) throws IOException, NoSuchAlgorithmException
	{
		System.out.println("Generating Hash for " + filepath);
		MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");

		try (DigestInputStream digestInputStream = new DigestInputStream(new FileInputStream(filepath), messageDigest))
		{
			// Empty loop to clear the data
			while (digestInputStream.read() != -1) ;
			messageDigest = digestInputStream.getMessageDigest();
		}

		return bytesToHex(messageDigest.digest());
	}

	private static String bytesToHex(byte[] hashInBytes)
	{
		StringBuilder stringBuilder = new StringBuilder();
		for (byte b : hashInBytes)
		{
			stringBuilder.append(String.format("%02x", b));
		}
		return stringBuilder.toString();
	}

	private void createArtifacts()
	{
		try
		{
			if (CLIENT_REPO_URL == null)
			{
				System.err.println("Client repository url is null");
				return;
			}

			artifacts = new Artifact[41];

			// Static artifacts
			artifacts[0] = new Artifact();
			artifacts[0].setHash("b12331da8683e5f107d294adeebb83ecf9124abc1db533554d2a8d3c62832d75");
			artifacts[0].setName("asm-all-6.0_BETA.jar");
			artifacts[0].setPath("https://mvn.runelite.net/org/ow2/asm/asm-all/6.0_BETA/asm-all-6.0_BETA.jar");
			artifacts[0].setSize(265176);
			artifacts[1] = new Artifact();
			artifacts[1].setHash("18c4a0095d5c1da6b817592e767bb23d29dd2f560ad74df75ff3961dbde25b79");
			artifacts[1].setName("slf4j-api-1.7.25.jar");
			artifacts[1].setPath("https://mvn.runelite.net/org/slf4j/slf4j-api/1.7.25/slf4j-api-1.7.25.jar");
			artifacts[1].setSize(41203);
			artifacts[2] = new Artifact();
			artifacts[2].setHash("fb53f8539e7fcb8f093a56e138112056ec1dc809ebb020b59d8a36a5ebac37e0");
			artifacts[2].setName("logback-classic-1.2.3.jar");
			artifacts[2].setPath("https://mvn.runelite.net/ch/qos/logback/logback-classic/1.2.3/logback-classic-1.2.3.jar");
			artifacts[2].setSize(290339);
			artifacts[3] = new Artifact();
			artifacts[3].setHash("5946d837fe6f960c02a53eda7a6926ecc3c758bbdd69aa453ee429f858217f22");
			artifacts[3].setName("logback-core-1.2.3.jar");
			artifacts[3].setPath("https://mvn.runelite.net/ch/qos/logback/logback-core/1.2.3/logback-core-1.2.3.jar");
			artifacts[3].setSize(471901);
			artifacts[4] = new Artifact();
			artifacts[4].setHash("9f0c8d50fa4b79b6ff1502dbec8502179d6b9497cacbe17a13074001aed537ec");
			artifacts[4].setName("jopt-simple-5.0.1.jar");
			artifacts[4].setPath("https://mvn.runelite.net/net/sf/jopt-simple/jopt-simple/5.0.1/jopt-simple-5.0.1.jar");
			artifacts[4].setSize(78826);
			artifacts[5] = new Artifact();
			artifacts[5].setHash("5be9a7d05ba0ccd74708bc8018ae412255f85843c0b92302e9b9befa6ed52564");
			artifacts[5].setName("guava-23.2-jre.jar");
			artifacts[5].setPath("https://mvn.runelite.net/com/google/guava/guava/23.2-jre/guava-23.2-jre.jar");
			artifacts[5].setSize(2649860);
			artifacts[6] = new Artifact();
			artifacts[6].setHash("905721a0eea90a81534abb7ee6ef4ea2e5e645fa1def0a5cd88402df1b46c9ed");
			artifacts[6].setName("jsr305-1.3.9.jar");
			artifacts[6].setPath("https://mvn.runelite.net/com/google/code/findbugs/jsr305/1.3.9/jsr305-1.3.9.jar");
			artifacts[6].setSize(33015);
			artifacts[7] = new Artifact();
			artifacts[7].setHash("cb4cfad870bf563a07199f3ebea5763f0dec440fcda0b318640b1feaa788656b");
			artifacts[7].setName("error_prone_annotations-2.0.18.jar");
			artifacts[7].setPath("https://mvn.runelite.net/com/google/errorprone/error_prone_annotations/2.0.18/error_prone_annotations-2.0.18.jar");
			artifacts[7].setSize(12078);
			artifacts[8] = new Artifact();
			artifacts[8].setHash("2994a7eb78f2710bd3d3bfb639b2c94e219cedac0d4d084d516e78c16dddecf6");
			artifacts[8].setName("j2objc-annotations-1.1.jar");
			artifacts[8].setPath("https://mvn.runelite.net/com/google/j2objc/j2objc-annotations/1.1/j2objc-annotations-1.1.jar");
			artifacts[8].setSize(8782);
			artifacts[9] = new Artifact();
			artifacts[9].setHash("2068320bd6bad744c3673ab048f67e30bef8f518996fa380033556600669905d");
			artifacts[9].setName("animal-sniffer-annotations-1.14.jar");
			artifacts[9].setPath("https://mvn.runelite.net/org/codehaus/mojo/animal-sniffer-annotations/1.14/animal-sniffer-annotations-1.14.jar");
			artifacts[9].setSize(3482);
			artifacts[10] = new Artifact();
			artifacts[10].setHash("9264c6931c431e928dc64adc842584d5f57d17b2f3aff29221f2b3fdea673dad");
			artifacts[10].setName("guice-4.1.0-no_aop.jar");
			artifacts[10].setPath("https://mvn.runelite.net/com/google/inject/guice/4.1.0/guice-4.1.0-no_aop.jar");
			artifacts[10].setSize(428603);
			artifacts[11] = new Artifact();
			artifacts[11].setHash("91c77044a50c481636c32d916fd89c9118a72195390452c81065080f957de7ff");
			artifacts[11].setName("javax.inject-1.jar");
			artifacts[11].setPath("https://mvn.runelite.net/javax/inject/javax.inject/1/javax.inject-1.jar");
			artifacts[11].setSize(2497);
			artifacts[12] = new Artifact();
			artifacts[12].setHash("0addec670fedcd3f113c5c8091d783280d23f75e3acb841b61a9cdb079376a08");
			artifacts[12].setName("aopalliance-1.0.jar");
			artifacts[12].setPath("https://mvn.runelite.net/aopalliance/aopalliance/1.0/aopalliance-1.0.jar");
			artifacts[12].setSize(4467);
			artifacts[13] = new Artifact();
			artifacts[13].setHash("233a0149fc365c9f6edbd683cfe266b19bdc773be98eabdaf6b3c924b48e7d81");
			artifacts[13].setName("gson-2.8.5.jar");
			artifacts[13].setPath("https://mvn.runelite.net/com/google/code/gson/gson/2.8.5/gson-2.8.5.jar");
			artifacts[13].setSize(241622);
			artifacts[14] = new Artifact();
			artifacts[14].setHash("0467d25f408428824d5c9c09ec60ee1f0bc341d9bf48971a77fd14939a826c83");
			artifacts[14].setName("substance-8.0.02.jar");
			artifacts[14].setPath("https://repo.runelite.net/net/runelite/pushingpixels/substance/8.0.02/substance-8.0.02.jar");
			artifacts[14].setSize(1589195);
			artifacts[15] = new Artifact();
			artifacts[15].setHash("3214e1c23d549d5d67c91da4da1ef33c5248470bb824f91cbe8f9e0beea59eef");
			artifacts[15].setName("trident-1.5.00.jar");
			artifacts[15].setPath("https://repo.runelite.net/net/runelite/pushingpixels/trident/1.5.00/trident-1.5.00.jar");
			artifacts[15].setSize(79726);
			artifacts[16] = new Artifact();
			artifacts[16].setHash("d4a57bbc1627da7c391308fd0fe910b83170fb66afd117236a5b111d2db1590b");
			artifacts[16].setName("commons-text-1.2.jar");
			artifacts[16].setPath("https://mvn.runelite.net/org/apache/commons/commons-text/1.2/commons-text-1.2.jar");
			artifacts[16].setSize(136544);
			artifacts[17] = new Artifact();
			artifacts[17].setHash("6e8dc31e046508d9953c96534edf0c2e0bfe6f468966b5b842b3f87e43b6a847");
			artifacts[17].setName("commons-lang3-3.7.jar");
			artifacts[17].setPath("https://mvn.runelite.net/org/apache/commons/commons-lang3/3.7/commons-lang3-3.7.jar");
			artifacts[17].setSize(499634);
			artifacts[18] = new Artifact();
			artifacts[18].setHash("e74603dc77b4183f108480279dbbf7fed3ac206069478636406c1fb45e83b31a");
			artifacts[18].setName("jogl-all-2.3.2.jar");
			artifacts[18].setPath("https://mvn.runelite.net/org/jogamp/jogl/jogl-all/2.3.2/jogl-all-2.3.2.jar");
			artifacts[18].setSize(3414448);
			artifacts[19] = new Artifact();
			artifacts[19].setHash("8c53b1884cef19309d34fd10a94b010136d9d6de9a88c386f46006fb47acab5d");
			artifacts[19].setName("jogl-all-2.3.2-natives-windows-amd64.jar");
			artifacts[19].setPath("https://mvn.runelite.net/org/jogamp/jogl/jogl-all/2.3.2/jogl-all-2.3.2-natives-windows-amd64.jar");
			artifacts[19].setSize(240721);
			artifacts[20] = new Artifact();
			artifacts[20].setHash("507a0e6bd1ee4e81c3dfb287783af93775864eec742988d4162f98ce0cbac9d6");
			artifacts[20].setName("jogl-all-2.3.2-natives-windows-i586.jar");
			artifacts[20].setPath("https://mvn.runelite.net/org/jogamp/jogl/jogl-all/2.3.2/jogl-all-2.3.2-natives-windows-i586.jar");
			artifacts[20].setSize(209445);
			artifacts[21] = new Artifact();
			artifacts[21].setHash("82637302ae9effdf7d6f302e1050ad6aee3b13019914ddda5b502b9faa980216");
			artifacts[21].setName("jogl-all-2.3.2-natives-linux-amd64.jar");
			artifacts[21].setPath("https://mvn.runelite.net/org/jogamp/jogl/jogl-all/2.3.2/jogl-all-2.3.2-natives-linux-amd64.jar");
			artifacts[21].setSize(224010);
			artifacts[22] = new Artifact();
			artifacts[22].setHash("f474ef2ef01be24ec811d3858b0f4bc5659076975f4a58ddd79abd787e9305c7");
			artifacts[22].setName("jogl-all-2.3.2-natives-linux-i586.jar");
			artifacts[22].setPath("https://mvn.runelite.net/org/jogamp/jogl/jogl-all/2.3.2/jogl-all-2.3.2-natives-linux-i586.jar");
			artifacts[22].setSize(217274);
			artifacts[23] = new Artifact();
			artifacts[23].setHash("084844543b18f7ff71b4c0437852bd22f0cb68d7e44c2c611c1bbea76f8c6fdf");
			artifacts[23].setName("gluegen-rt-2.3.2.jar");
			artifacts[23].setPath("https://mvn.runelite.net/org/jogamp/gluegen/gluegen-rt/2.3.2/gluegen-rt-2.3.2.jar");
			artifacts[23].setSize(345605);
			artifacts[24] = new Artifact();
			artifacts[24].setHash("3474017422eff384db466bdb56c96c61220c43133a9da6329cf1781bea16c6b6");
			artifacts[24].setName("gluegen-rt-2.3.2-natives-windows-amd64.jar");
			artifacts[24].setPath("https://mvn.runelite.net/org/jogamp/gluegen/gluegen-rt/2.3.2/gluegen-rt-2.3.2-natives-windows-amd64.jar");
			artifacts[24].setSize(8159);
			artifacts[25] = new Artifact();
			artifacts[25].setHash("4eeed9fc2ebea5b9dc48a342b9478d127e989a2e1aa7129b512a98ec75cde338");
			artifacts[25].setName("gluegen-rt-2.3.2-natives-windows-i586.jar");
			artifacts[25].setPath("https://mvn.runelite.net/org/jogamp/gluegen/gluegen-rt/2.3.2/gluegen-rt-2.3.2-natives-windows-i586.jar");
			artifacts[25].setSize(7577);
			artifacts[26] = new Artifact();
			artifacts[26].setHash("f2dfd1800202059cf7e0294db5d57755147304e6eb220a9277526dbe6842bde2");
			artifacts[26].setName("gluegen-rt-2.3.2-natives-linux-amd64.jar");
			artifacts[26].setPath("https://mvn.runelite.net/org/jogamp/gluegen/gluegen-rt/2.3.2/gluegen-rt-2.3.2-natives-linux-amd64.jar");
			artifacts[26].setSize(4149);
			artifacts[27] = new Artifact();
			artifacts[27].setHash("1365d463f98c0abec92f3ad6b35aa4b53a9599a517800cf99fdabea6712ca7ec");
			artifacts[27].setName("gluegen-rt-2.3.2-natives-linux-i586.jar");
			artifacts[27].setPath("https://mvn.runelite.net/org/jogamp/gluegen/gluegen-rt/2.3.2/gluegen-rt-2.3.2-natives-linux-i586.jar");
			artifacts[27].setSize(4130);
			artifacts[28] = new Artifact();
			artifacts[28].setHash("7b7ae00e2aa98c3b2b5ac76e793e2c9b752bf51c86c54654dbd473843a25f1aa");
			artifacts[28].setName("jbsdiff-1.0.jar");
			artifacts[28].setPath("https://mvn.runelite.net/io/sigpipe/jbsdiff/1.0/jbsdiff-1.0.jar");
			artifacts[28].setSize(24589);
			artifacts[29] = new Artifact();
			artifacts[29].setHash("55bbfe26cee9296fd5b7c0d47ce6a00ea4dd572e235b63e9bb4eaf6f802315e4");
			artifacts[29].setName("commons-compress-1.5.jar");
			artifacts[29].setPath("https://mvn.runelite.net/org/apache/commons/commons-compress/1.5/commons-compress-1.5.jar");
			artifacts[29].setSize(256241);
			artifacts[30] = new Artifact();
			artifacts[30].setHash("fbc9de96a0cc193a125b4008dbc348e9ed54e5e13fc67b8ed40e645d303cc51b");
			artifacts[30].setName("jna-4.5.1.jar");
			artifacts[30].setPath("https://mvn.runelite.net/net/java/dev/jna/jna/4.5.1/jna-4.5.1.jar");
			artifacts[30].setSize(1440662);
			artifacts[31] = new Artifact();
			artifacts[31].setHash("84c8667555ee8dd91fef44b451419f6f16f71f727d5fc475a10c2663eba83abb");
			artifacts[31].setName("jna-platform-4.5.1.jar");
			artifacts[31].setPath("https://mvn.runelite.net/net/java/dev/jna/jna-platform/4.5.1/jna-platform-4.5.1.jar");
			artifacts[31].setSize(2327547);
			artifacts[32] = new Artifact();
			artifacts[32].setHash("f55abda036da75e1af45bd43b9dfa79b2a3d90905be9cb38687c6621597a8165");
			artifacts[32].setName("okhttp-3.7.0.jar");
			artifacts[32].setPath("https://mvn.runelite.net/com/squareup/okhttp3/okhttp/3.7.0/okhttp-3.7.0.jar");
			artifacts[32].setSize(394987);
			artifacts[33] = new Artifact();
			artifacts[33].setHash("bfe7dfe483c37137966a1690f0c7d0b448ba217902c1fed202aaffdbba3291ae");
			artifacts[33].setName("okio-1.12.0.jar");
			artifacts[33].setPath("https://mvn.runelite.net/com/squareup/okio/okio/1.12.0/okio-1.12.0.jar");
			artifacts[33].setSize(81088);
			artifacts[34] = new Artifact();
			artifacts[34].setHash("9d4924588d6280c7516db3a4b7298306db5b6f0d1cdf568ce738309b5660f008");
			artifacts[34].setName("commons-csv-1.4.jar");
			artifacts[34].setPath("https://mvn.runelite.net/org/apache/commons/commons-csv/1.4/commons-csv-1.4.jar");
			artifacts[34].setSize(39978);
			artifacts[35] = new Artifact();
			artifacts[35].setHash("7e26a8d043418f2f22d5f6a3083a9a131817009ee8cd72c004e83b50d1849a7c");
			artifacts[35].setName("discord-1.1.jar");
			artifacts[35].setPath("https://repo.runelite.net/net/runelite/discord/1.1/discord-1.1.jar");
			artifacts[35].setSize(617294);

			// Dynamic artifacts
			artifacts[36] = new Artifact();
			artifacts[36].setName("client-" + runeliteVersion + ".jar");
			artifacts[36].setHash(getChecksumFile("./runelite-client/target/" + artifacts[36].getName()));
			artifacts[36].setPath(CLIENT_REPO_URL + artifacts[36].getName());
			artifacts[36].setSize(getFileSize("./runelite-client/target/" + artifacts[36].getName()));
			artifacts[37] = new Artifact();
			artifacts[37].setName("runelite-api-" + runeliteVersion + ".jar");
			artifacts[37].setHash(getChecksumFile("./runelite-api/target/" + artifacts[37].getName()));
			artifacts[37].setPath(CLIENT_REPO_URL + artifacts[37].getName());
			artifacts[37].setSize(getFileSize("./runelite-api/target/" + artifacts[37].getName()));
			artifacts[38] = new Artifact();
			artifacts[38].setName("runescape-api-" + runeliteVersion + ".jar");
			artifacts[38].setHash(getChecksumFile("./runescape-api/target/" + artifacts[38].getName()));
			artifacts[38].setPath(CLIENT_REPO_URL + artifacts[38].getName());
			artifacts[38].setSize(getFileSize("./runescape-api/target/" + artifacts[38].getName()));
			artifacts[39] = new Artifact();
			artifacts[39].setName("http-api-" + runeliteVersion + ".jar");
			artifacts[39].setHash(getChecksumFile("./http-api/target/" + artifacts[39].getName()));
			artifacts[39].setPath(CLIENT_REPO_URL + artifacts[39].getName());
			artifacts[39].setSize(getFileSize("./http-api/target/" + artifacts[39].getName()));
			artifacts[40] = new Artifact();
			artifacts[40].setName("injected-client-" + runeliteVersion + ".jar");
			artifacts[40].setHash(getChecksumFile("./injected-client/target/" + artifacts[40].getName()));
			artifacts[40].setPath(CLIENT_REPO_URL + artifacts[40].getName());
			artifacts[40].setSize(getFileSize("./injected-client/target/" + artifacts[40].getName()));
		}
		catch (IOException | NoSuchAlgorithmException e)
		{
			System.err.println("Unable to create artifacts");
			e.printStackTrace();
		}
	}

	private int getFileSize(String fileLocation)
	{
		return (int) new File(fileLocation).length();
	}
}
