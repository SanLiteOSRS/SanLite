import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("lb")
	@ObfuscatedGetter(
		intValue = 377744389
	)
	@Export("cameraYaw")
	static int cameraYaw;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 117482167
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1379394921
	)
	@Export("health")
	int health;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 954587129
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1959792261
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 12
		this.health = var2; // L: 13
		this.health2 = var3; // L: 14
		this.cycleOffset = var4; // L: 15
	} // L: 16

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1277563512"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 19
		this.health = var2; // L: 20
		this.health2 = var3; // L: 21
		this.cycleOffset = var4; // L: 22
	} // L: 23

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "908009629"
	)
	public static void method2495(String var0, String var1, String var2, int var3, int var4) throws IOException {
		if (var1 != null && !var1.isEmpty()) { // L: 40
			var0 = var0 + "-" + var1; // L: 41
		}

		JagexCache.idxCount = var4; // L: 43
		class189.cacheGamebuild = var3; // L: 44

		try {
			class108.field1383 = System.getProperty("os.name"); // L: 46
		} catch (Exception var21) { // L: 48
			class108.field1383 = "Unknown"; // L: 49
		}

		class184.field1926 = class108.field1383.toLowerCase(); // L: 51
		RouteStrategy.userHomeDirectory = null; // L: 52

		try {
			RouteStrategy.userHomeDirectory = System.getProperty("jagex.userhome"); // L: 54
		} catch (Exception var20) { // L: 56
		}

		if (RouteStrategy.userHomeDirectory == null) { // L: 57
			try {
				RouteStrategy.userHomeDirectory = System.getProperty("user.home"); // L: 58
			} catch (Exception var19) { // L: 60
			}
		}

		if (RouteStrategy.userHomeDirectory != null) { // L: 61
			RouteStrategy.userHomeDirectory = RouteStrategy.userHomeDirectory + "/";
		}

		try {
			if (class184.field1926.startsWith("win")) { // L: 63
				if (RouteStrategy.userHomeDirectory == null) { // L: 64
					RouteStrategy.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (RouteStrategy.userHomeDirectory == null) { // L: 67
				RouteStrategy.userHomeDirectory = System.getenv("HOME");
			}

			if (RouteStrategy.userHomeDirectory != null) { // L: 69
				RouteStrategy.userHomeDirectory = RouteStrategy.userHomeDirectory + "/";
			}
		} catch (Exception var18) { // L: 71
		}

		if (RouteStrategy.userHomeDirectory == null) { // L: 72
			RouteStrategy.userHomeDirectory = "~/";
		}

		GrandExchangeOfferOwnWorldComparator.field494 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", RouteStrategy.userHomeDirectory, "/tmp/", ""}; // L: 73
		UserComparator3.field1458 = new String[]{".jagex_cache_" + class189.cacheGamebuild, ".file_store_" + class189.cacheGamebuild}; // L: 74
		int var13 = 0;

		label157:
		while (var13 < 4) {
			class404.cacheDir = class331.method6303(var0, var2, var13); // L: 76
			if (!class404.cacheDir.exists()) { // L: 77
				class404.cacheDir.mkdirs();
			}

			File[] var6 = class404.cacheDir.listFiles(); // L: 78
			if (var6 == null) { // L: 79
				break;
			}

			File[] var7 = var6; // L: 81
			int var8 = 0;

			while (true) {
				if (var8 >= var7.length) {
					break label157;
				}

				File var9 = var7[var8]; // L: 83

				boolean var10;
				try {
					RandomAccessFile var11 = new RandomAccessFile(var9, "rw"); // L: 88
					int var12 = var11.read(); // L: 89
					var11.seek(0L); // L: 90
					var11.write(var12); // L: 91
					var11.seek(0L); // L: 92
					var11.close(); // L: 93
					var10 = true; // L: 95
				} catch (Exception var17) { // L: 97
					var10 = false; // L: 98
				}

				if (!var10) { // L: 101
					++var13; // L: 75
					break;
				}

				++var8; // L: 82
			}
		}

		GrandExchangeOfferNameComparator.method7178(class404.cacheDir); // L: 108

		try {
			File var5 = new File(RouteStrategy.userHomeDirectory, "random.dat"); // L: 111
			int var15;
			if (var5.exists()) { // L: 112
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var5, "rw", 25L), 24, 0); // L: 113
			} else {
				label138:
				for (int var14 = 0; var14 < UserComparator3.field1458.length; ++var14) { // L: 116
					for (var15 = 0; var15 < GrandExchangeOfferOwnWorldComparator.field494.length; ++var15) { // L: 117
						File var16 = new File(GrandExchangeOfferOwnWorldComparator.field494[var15] + UserComparator3.field1458[var14] + File.separatorChar + "random.dat"); // L: 118
						if (var16.exists()) { // L: 119
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var16, "rw", 25L), 24, 0); // L: 120
							break label138; // L: 121
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) { // L: 126
				RandomAccessFile var23 = new RandomAccessFile(var5, "rw"); // L: 127
				var15 = var23.read(); // L: 128
				var23.seek(0L); // L: 129
				var23.write(var15); // L: 130
				var23.seek(0L); // L: 131
				var23.close(); // L: 132
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var5, "rw", 25L), 24, 0); // L: 133
			}
		} catch (IOException var22) { // L: 136
		}

		JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(class176.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0); // L: 138
		JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class176.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0); // L: 139
		JagexCache.JagexCache_idxFiles = new BufferedFile[JagexCache.idxCount]; // L: 140

		for (var13 = 0; var13 < JagexCache.idxCount; ++var13) { // L: 141
			JagexCache.JagexCache_idxFiles[var13] = new BufferedFile(new AccessFile(class176.getFile("main_file_cache.idx" + var13), "rw", 1048576L), 6000, 0); // L: 142
		}

	} // L: 144

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(Loz;Ljava/lang/String;B)V",
		garbageValue = "14"
	)
	static void method2491(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1); // L: 1468
		Client.archiveLoaders.add(var2); // L: 1469
		Client.field785 += var2.groupCount; // L: 1470
	} // L: 1471

	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "(Lnn;IB)Ljava/lang/String;",
		garbageValue = "23"
	)
	static String method2496(Widget var0, int var1) {
		int var3 = class405.getWidgetFlags(var0); // L: 12569
		boolean var2 = (var3 >> var1 + 1 & 1) != 0; // L: 12571
		if (!var2 && var0.onOp == null) { // L: 12573
			return null;
		} else {
			return var0.actions != null && var0.actions.length > var1 && var0.actions[var1] != null && var0.actions[var1].trim().length() != 0 ? var0.actions[var1] : null; // L: 12574 12575 12577
		}
	}
}
