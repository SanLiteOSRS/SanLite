import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.SecureRandom;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "[Luk;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;

	SecureRandomCallable() {
	} // L: 42

	public Object call() {
		SecureRandom var2 = new SecureRandom();
		var2.nextInt();
		return var2;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "297617664"
	)
	public static void method2246(String var0, String var1, String var2, int var3, int var4) throws IOException {
		if (var1 != null && !var1.isEmpty()) { // L: 40
			var0 = var0 + "-" + var1; // L: 41
		}

		JagexCache.idxCount = var4; // L: 43
		JagexCache.cacheGamebuild = var3; // L: 44

		try {
			ScriptFrame.field491 = System.getProperty("os.name"); // L: 46
		} catch (Exception var31) { // L: 48
			ScriptFrame.field491 = "Unknown"; // L: 49
		}

		Messages.field1422 = ScriptFrame.field491.toLowerCase(); // L: 51
		class36.userHomeDirectory = null; // L: 52

		try {
			class36.userHomeDirectory = System.getProperty("jagex.userhome"); // L: 54
		} catch (Exception var30) { // L: 56
		}

		if (class36.userHomeDirectory == null) { // L: 57
			try {
				class36.userHomeDirectory = System.getProperty("user.home"); // L: 58
			} catch (Exception var29) { // L: 60
			}
		}

		if (class36.userHomeDirectory != null) { // L: 61
			class36.userHomeDirectory = class36.userHomeDirectory + "/";
		}

		try {
			if (Messages.field1422.startsWith("win")) { // L: 63
				if (class36.userHomeDirectory == null) { // L: 64
					class36.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (class36.userHomeDirectory == null) { // L: 67
				class36.userHomeDirectory = System.getenv("HOME");
			}

			if (class36.userHomeDirectory != null) { // L: 69
				class36.userHomeDirectory = class36.userHomeDirectory + "/";
			}
		} catch (Exception var28) { // L: 71
		}

		if (class36.userHomeDirectory == null) { // L: 72
			class36.userHomeDirectory = "~/";
		}

		class402.field4514 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class36.userHomeDirectory, "/tmp/", ""}; // L: 73
		JagexCache.field1867 = new String[]{".jagex_cache_" + JagexCache.cacheGamebuild, ".file_store_" + JagexCache.cacheGamebuild}; // L: 74
		int var19 = 0;

		label267:
		while (var19 < 4) {
			String var7 = var19 == 0 ? "" : "" + var19; // L: 78
			JagexCache.field1869 = new File(class36.userHomeDirectory, "jagex_cl_" + var0 + "_" + var2 + var7 + ".dat"); // L: 79
			String var8 = null; // L: 80
			String var9 = null; // L: 81
			boolean var10 = false; // L: 82
			int var15;
			File var36;
			if (JagexCache.field1869.exists()) { // L: 83
				try {
					AccessFile var11 = new AccessFile(JagexCache.field1869, "rw", 10000L); // L: 86

					Buffer var12;
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

				if (var8 != null) { // L: 117
					var36 = new File(var8, "test.dat"); // L: 118

					boolean var38;
					try {
						RandomAccessFile var20 = new RandomAccessFile(var36, "rw"); // L: 122
						var15 = var20.read(); // L: 123
						var20.seek(0L); // L: 124
						var20.write(var15); // L: 125
						var20.seek(0L); // L: 126
						var20.close(); // L: 127
						var36.delete(); // L: 128
						var38 = true; // L: 129
					} catch (Exception var27) { // L: 131
						var38 = false; // L: 132
					}

					if (!var38) { // L: 135
						var8 = null; // L: 136
					}
				}
			}

			if (var8 == null && var19 == 0) { // L: 140
				label242:
				for (int var21 = 0; var21 < JagexCache.field1867.length; ++var21) { // L: 141
					for (int var22 = 0; var22 < class402.field4514.length; ++var22) { // L: 142
						File var23 = new File(class402.field4514[var22] + JagexCache.field1867[var21] + File.separatorChar + var0 + File.separatorChar); // L: 143
						if (var23.exists() && Message.method1185(new File(var23, "test.dat"), true)) { // L: 144 145
							var8 = var23.toString(); // L: 146
							var10 = true; // L: 147
							break label242; // L: 148
						}
					}
				}
			}

			if (var8 == null) { // L: 154
				var8 = class36.userHomeDirectory + File.separatorChar + "jagexcache" + var7 + File.separatorChar + var0 + File.separatorChar + var2 + File.separatorChar; // L: 155
				var10 = true; // L: 156
			}

			if (var9 != null) { // L: 158
				File var35 = new File(var9); // L: 159
				var36 = new File(var8); // L: 160

				try {
					File[] var40 = var35.listFiles(); // L: 162
					File[] var39 = var40; // L: 164

					for (var15 = 0; var15 < var39.length; ++var15) { // L: 165
						File var16 = var39[var15]; // L: 166
						File var17 = new File(var36, var16.getName()); // L: 168
						boolean var18 = var16.renameTo(var17); // L: 169
						if (!var18) { // L: 170
							throw new IOException();
						}
					}
				} catch (Exception var32) { // L: 175
					var32.printStackTrace(); // L: 176
				}

				var10 = true; // L: 178
			}

			if (var10) { // L: 180
				class165.method3330(new File(var8), (File)null);
			}

			File var6 = new File(var8); // L: 181
			JagexCache.cacheDir = var6; // L: 183
			if (!JagexCache.cacheDir.exists()) { // L: 184
				JagexCache.cacheDir.mkdirs();
			}

			File[] var34 = JagexCache.cacheDir.listFiles(); // L: 185
			if (var34 != null) { // L: 186
				File[] var37 = var34; // L: 188

				for (int var24 = 0; var24 < var37.length; ++var24) { // L: 189
					File var25 = var37[var24]; // L: 190
					if (!Message.method1185(var25, false)) { // L: 192
						++var19; // L: 75
						continue label267;
					}
				}
			}
			break;
		}

		File var5 = JagexCache.cacheDir; // L: 199
		FileSystem.FileSystem_cacheDir = var5; // L: 201
		if (!FileSystem.FileSystem_cacheDir.exists()) { // L: 202
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true; // L: 203
			FileSystem.method3489(); // L: 205
			JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(class299.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0); // L: 206
			JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class299.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0); // L: 207
			DecorativeObject.JagexCache_idxFiles = new BufferedFile[JagexCache.idxCount]; // L: 208

			for (int var26 = 0; var26 < JagexCache.idxCount; ++var26) { // L: 209
				DecorativeObject.JagexCache_idxFiles[var26] = new BufferedFile(new AccessFile(class299.getFile("main_file_cache.idx" + var26), "rw", 1048576L), 6000, 0); // L: 210
			}

		}
	} // L: 212
}
