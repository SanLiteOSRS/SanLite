import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
public class class30 {
	@ObfuscatedName("vx")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;

	static {
		ImageIO.setUseCache(false); // L: 12
	} // L: 13

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "1496145760"
	)
	public static void method422(String var0, String var1, String var2, int var3, int var4) throws IOException {
		if (var1 != null && !var1.isEmpty()) { // L: 40
			var0 = var0 + "-" + var1; // L: 41
		}

		class33.idxCount = var4; // L: 43
		JagexCache.cacheGamebuild = var3; // L: 44

		try {
			BufferedNetSocket.field4784 = System.getProperty("os.name"); // L: 46
		} catch (Exception var31) { // L: 48
			BufferedNetSocket.field4784 = "Unknown"; // L: 49
		}

		TaskHandler.field2320 = BufferedNetSocket.field4784.toLowerCase(); // L: 51
		class334.userHomeDirectory = null; // L: 52

		try {
			class334.userHomeDirectory = System.getProperty("jagex.userhome"); // L: 54
		} catch (Exception var30) { // L: 56
		}

		if (class334.userHomeDirectory == null) { // L: 57
			try {
				class334.userHomeDirectory = System.getProperty("user.home"); // L: 58
			} catch (Exception var29) { // L: 60
			}
		}

		if (class334.userHomeDirectory != null) { // L: 61
			class334.userHomeDirectory = class334.userHomeDirectory + "/";
		}

		try {
			if (TaskHandler.field2320.startsWith("win")) { // L: 63
				if (class334.userHomeDirectory == null) { // L: 64
					class334.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (class334.userHomeDirectory == null) { // L: 67
				class334.userHomeDirectory = System.getenv("HOME");
			}

			if (class334.userHomeDirectory != null) { // L: 69
				class334.userHomeDirectory = class334.userHomeDirectory + "/";
			}
		} catch (Exception var28) { // L: 71
		}

		if (class334.userHomeDirectory == null) { // L: 72
			class334.userHomeDirectory = "~/";
		}

		class10.field43 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class334.userHomeDirectory, "/tmp/", ""}; // L: 73
		class136.field1621 = new String[]{".jagex_cache_" + JagexCache.cacheGamebuild, ".file_store_" + JagexCache.cacheGamebuild}; // L: 74
		int var19 = 0;

		label276:
		while (var19 < 4) {
			String var7 = var19 == 0 ? "" : "" + var19; // L: 78
			JagexCache.field2331 = new File(class334.userHomeDirectory, "jagex_cl_" + var0 + "_" + var2 + var7 + ".dat"); // L: 79
			String var8 = null; // L: 80
			String var9 = null; // L: 81
			boolean var10 = false; // L: 82
			Buffer var12;
			File var36;
			if (JagexCache.field2331.exists()) { // L: 83
				try {
					AccessFile var11 = new AccessFile(JagexCache.field2331, "rw", 10000L); // L: 86

					int var13;
					for (var12 = new Buffer((int)var11.length()); var12.offset < var12.array.length; var12.offset += var13) { // L: 87 88 91
						var13 = var11.read(var12.array, var12.offset, var12.array.length - var12.offset); // L: 89
						if (var13 == -1) { // L: 90
							throw new IOException();
						}
					}

					var12.offset = 0; // L: 93
					var13 = var12.readUnsignedByte(); // L: 94
					if (var13 < 1 || var13 > 3) { // L: 95
						throw new IOException("" + var13);
					}

					int var14 = 0; // L: 96
					if (var13 > 1) { // L: 97
						var14 = var12.readUnsignedByte();
					}

					if (var13 <= 2) { // L: 98
						var8 = var12.readStringCp1252NullCircumfixed(); // L: 99
						if (var14 == 1) { // L: 100
							var9 = var12.readStringCp1252NullCircumfixed();
						}
					} else {
						var8 = var12.readCESU8(); // L: 103
						if (var14 == 1) { // L: 104
							var9 = var12.readCESU8();
						}
					}

					var11.close(); // L: 106
				} catch (IOException var33) { // L: 108
					var33.printStackTrace(); // L: 109
				}

				if (var8 != null) { // L: 111
					var36 = new File(var8); // L: 112
					if (!var36.exists()) { // L: 113
						var8 = null; // L: 114
					}
				}

				if (var8 != null) {
					var36 = new File(var8, "test.dat");
					if (!HealthBarUpdate.method2494(var36, true)) { // L: 119
						var8 = null; // L: 120
					}
				}
			}

			if (var8 == null && var19 == 0) { // L: 124
				label250:
				for (int var20 = 0; var20 < class136.field1621.length; ++var20) { // L: 125
					for (int var21 = 0; var21 < class10.field43.length; ++var21) { // L: 126
						File var22 = new File(class10.field43[var21] + class136.field1621[var20] + File.separatorChar + var0 + File.separatorChar); // L: 127
						if (var22.exists() && HealthBarUpdate.method2494(new File(var22, "test.dat"), true)) { // L: 128 129
							var8 = var22.toString(); // L: 130
							var10 = true; // L: 131
							break label250; // L: 132
						}
					}
				}
			}

			if (var8 == null) { // L: 138
				var8 = class334.userHomeDirectory + File.separatorChar + "jagexcache" + var7 + File.separatorChar + var0 + File.separatorChar + var2 + File.separatorChar; // L: 139
				var10 = true; // L: 140
			}

			File var35;
			if (var9 != null) { // L: 142
				var35 = new File(var9); // L: 143
				var36 = new File(var8); // L: 144

				try {
					File[] var38 = var35.listFiles(); // L: 146
					File[] var23 = var38; // L: 148

					for (int var15 = 0; var15 < var23.length; ++var15) { // L: 149
						File var16 = var23[var15]; // L: 150
						File var17 = new File(var36, var16.getName()); // L: 152
						boolean var18 = var16.renameTo(var17); // L: 153
						if (!var18) { // L: 154
							throw new IOException();
						}
					}
				} catch (Exception var32) {
					var32.printStackTrace();
				}

				var10 = true; // L: 162
			}

			if (var10) { // L: 164
				var35 = new File(var8); // L: 165
				var12 = null; // L: 166

				try {
					AccessFile var39 = new AccessFile(JagexCache.field2331, "rw", 10000L); // L: 170
					Buffer var40 = new Buffer(500); // L: 171
					var40.writeByte(3); // L: 172
					var40.writeByte(var12 != null ? 1 : 0); // L: 173
					var40.writeCESU8(var35.getPath()); // L: 174
					if (var12 != null) { // L: 175
						var40.writeCESU8("");
					}

					var39.write(var40.array, 0, var40.offset); // L: 176
					var39.close(); // L: 177
				} catch (IOException var27) { // L: 179
					var27.printStackTrace(); // L: 180
				}
			}

			File var6 = new File(var8); // L: 184
			class11.cacheDir = var6; // L: 186
			if (!class11.cacheDir.exists()) { // L: 187
				class11.cacheDir.mkdirs();
			}

			File[] var34 = class11.cacheDir.listFiles(); // L: 188
			if (var34 != null) { // L: 189
				File[] var37 = var34; // L: 191

				for (int var24 = 0; var24 < var37.length; ++var24) { // L: 192
					File var25 = var37[var24]; // L: 193
					if (!HealthBarUpdate.method2494(var25, false)) { // L: 195
						++var19; // L: 75
						continue label276;
					}
				}
			}
			break;
		}

		File var5 = class11.cacheDir; // L: 202
		class154.FileSystem_cacheDir = var5; // L: 204
		if (!class154.FileSystem_cacheDir.exists()) { // L: 205
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true; // L: 206
			NPCComposition.method3708(); // L: 208
			JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(ClanSettings.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0); // L: 209
			JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(ClanSettings.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0); // L: 210
			class173.JagexCache_idxFiles = new BufferedFile[class33.idxCount]; // L: 211

			for (int var26 = 0; var26 < class33.idxCount; ++var26) { // L: 212
				class173.JagexCache_idxFiles[var26] = new BufferedFile(new AccessFile(ClanSettings.getFile("main_file_cache.idx" + var26), "rw", 1048576L), 6000, 0); // L: 213
			}

		}
	} // L: 215

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-408994455"
	)
	public static void method420() {
		WorldMapElement.Ignored_cached.clear(); // L: 159
	} // L: 160

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "468440439"
	)
	static final void method416(String var0) {
		SecureRandomCallable.method2319(var0 + " is already on your friend list"); // L: 117
	} // L: 118
}
