import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
public enum class87 implements class352 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	field1069(0, -1),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	field1071(1, 1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	field1070(2, 7),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	field1076(3, 8),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	field1072(4, 9);

	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1913812595
	)
	final int field1073;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1146836647
	)
	final int field1074;

	class87(int var3, int var4) {
		this.field1073 = var3; // L: 20
		this.field1074 = var4; // L: 21
	} // L: 22

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1409646049"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1074; // L: 26
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "2129812496"
	)
	public static void method2286(String var0, String var1, int var2, int var3) throws IOException {
		class188.idxCount = var3; // L: 40
		class7.cacheGamebuild = var2; // L: 41

		try {
			ChatChannel.operatingSystemName = System.getProperty("os.name"); // L: 43
		} catch (Exception var32) { // L: 45
			ChatChannel.operatingSystemName = "Unknown"; // L: 46
		}

		class122.formattedOperatingSystemName = ChatChannel.operatingSystemName.toLowerCase(); // L: 48

		try {
			class16.userHomeDirectory = System.getProperty("user.home"); // L: 50
			if (class16.userHomeDirectory != null) { // L: 51
				class16.userHomeDirectory = class16.userHomeDirectory + "/";
			}
		} catch (Exception var31) { // L: 53
		}

		try {
			if (class122.formattedOperatingSystemName.startsWith("win")) { // L: 55
				if (class16.userHomeDirectory == null) { // L: 56
					class16.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (class16.userHomeDirectory == null) { // L: 59
				class16.userHomeDirectory = System.getenv("HOME");
			}

			if (class16.userHomeDirectory != null) { // L: 61
				class16.userHomeDirectory = class16.userHomeDirectory + "/";
			}
		} catch (Exception var30) { // L: 63
		}

		if (class16.userHomeDirectory == null) { // L: 64
			class16.userHomeDirectory = "~/";
		}

		class164.cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class16.userHomeDirectory, "/tmp/", ""}; // L: 65
		StudioGame.cacheSubPaths = new String[]{".jagex_cache_" + class7.cacheGamebuild, ".file_store_" + class7.cacheGamebuild}; // L: 66
		int var18 = 0;

		label263:
		while (var18 < 4) {
			String var6 = var18 == 0 ? "" : "" + var18; // L: 70
			ClanChannelMember.JagexCache_locationFile = new File(class16.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var6 + ".dat"); // L: 71
			String var7 = null; // L: 72
			String var8 = null; // L: 73
			boolean var9 = false; // L: 74
			int var12;
			int var14;
			File var37;
			if (ClanChannelMember.JagexCache_locationFile.exists()) { // L: 75
				try {
					AccessFile var10 = new AccessFile(ClanChannelMember.JagexCache_locationFile, "rw", 10000L); // L: 78

					Buffer var11;
					for (var11 = new Buffer((int)var10.length()); var11.offset < var11.array.length; var11.offset += var12) { // L: 79 80 83
						var12 = var10.read(var11.array, var11.offset, var11.array.length - var11.offset); // L: 81
						if (var12 == -1) { // L: 82
							throw new IOException();
						}
					}

					var11.offset = 0; // L: 85
					var12 = var11.readUnsignedByte(); // L: 86
					if (var12 < 1 || var12 > 3) { // L: 87
						throw new IOException("" + var12);
					}

					int var13 = 0; // L: 88
					if (var12 > 1) { // L: 89
						var13 = var11.readUnsignedByte();
					}

					if (var12 <= 2) { // L: 90
						var7 = var11.readStringCp1252NullCircumfixed(); // L: 91
						if (var13 == 1) { // L: 92
							var8 = var11.readStringCp1252NullCircumfixed();
						}
					} else {
						var7 = var11.readCESU8(); // L: 95
						if (var13 == 1) { // L: 96
							var8 = var11.readCESU8();
						}
					}

					var10.close(); // L: 98
				} catch (IOException var34) { // L: 100
					var34.printStackTrace(); // L: 101
				}

				if (var7 != null) { // L: 103
					var37 = new File(var7); // L: 104
					if (!var37.exists()) { // L: 105
						var7 = null; // L: 106
					}
				}

				if (var7 != null) { // L: 109
					var37 = new File(var7, "test.dat"); // L: 110

					boolean var40;
					try {
						RandomAccessFile var19 = new RandomAccessFile(var37, "rw"); // L: 114
						var14 = var19.read(); // L: 115
						var19.seek(0L); // L: 116
						var19.write(var14); // L: 117
						var19.seek(0L); // L: 118
						var19.close(); // L: 119
						var37.delete(); // L: 120
						var40 = true; // L: 121
					} catch (Exception var29) { // L: 123
						var40 = false; // L: 124
					}

					if (!var40) { // L: 127
						var7 = null; // L: 128
					}
				}
			}

			if (var7 == null && var18 == 0) { // L: 132
				label238:
				for (int var20 = 0; var20 < StudioGame.cacheSubPaths.length; ++var20) { // L: 133
					for (int var21 = 0; var21 < class164.cacheParentPaths.length; ++var21) { // L: 134
						File var22 = new File(class164.cacheParentPaths[var21] + StudioGame.cacheSubPaths[var20] + File.separatorChar + var0 + File.separatorChar); // L: 135
						if (var22.exists()) { // L: 136
							File var23 = new File(var22, "test.dat"); // L: 138

							boolean var41;
							try {
								RandomAccessFile var15 = new RandomAccessFile(var23, "rw"); // L: 141
								int var16 = var15.read(); // L: 142
								var15.seek(0L); // L: 143
								var15.write(var16); // L: 144
								var15.seek(0L); // L: 145
								var15.close(); // L: 146
								var23.delete(); // L: 147
								var41 = true; // L: 148
							} catch (Exception var28) { // L: 150
								var41 = false; // L: 151
							}

							if (var41) { // L: 154
								var7 = var22.toString(); // L: 155
								var9 = true; // L: 156
								break label238; // L: 157
							}
						}
					}
				}
			}

			if (var7 == null) { // L: 163
				var7 = class16.userHomeDirectory + File.separatorChar + "jagexcache" + var6 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar; // L: 164
				var9 = true; // L: 165
			}

			if (var8 != null) { // L: 167
				File var36 = new File(var8); // L: 168
				var37 = new File(var7); // L: 169

				try {
					File[] var45 = var36.listFiles(); // L: 171
					File[] var43 = var45; // L: 173

					for (var14 = 0; var14 < var43.length; ++var14) { // L: 174
						File var42 = var43[var14]; // L: 175
						File var24 = new File(var37, var42.getName()); // L: 177
						boolean var17 = var42.renameTo(var24); // L: 178
						if (!var17) { // L: 179
							throw new IOException();
						}
					}
				} catch (Exception var33) { // L: 184
					var33.printStackTrace(); // L: 185
				}

				var9 = true; // L: 187
			}

			if (var9) { // L: 189
				class329.method6346(new File(var7), (File)null);
			}

			File var5 = new File(var7); // L: 190
			SoundCache.cacheDir = var5; // L: 192
			if (!SoundCache.cacheDir.exists()) { // L: 193
				SoundCache.cacheDir.mkdirs();
			}

			File[] var35 = SoundCache.cacheDir.listFiles(); // L: 194
			if (var35 != null) { // L: 195
				File[] var38 = var35; // L: 197

				for (int var25 = 0; var25 < var38.length; ++var25) { // L: 198
					File var26 = var38[var25]; // L: 199

					boolean var44;
					try {
						RandomAccessFile var39 = new RandomAccessFile(var26, "rw"); // L: 204
						var12 = var39.read(); // L: 205
						var39.seek(0L); // L: 206
						var39.write(var12); // L: 207
						var39.seek(0L); // L: 208
						var39.close(); // L: 209
						var44 = true; // L: 211
					} catch (Exception var27) { // L: 213
						var44 = false; // L: 214
					}

					if (!var44) { // L: 217
						++var18; // L: 67
						continue label263;
					}
				}
			}
			break;
		}

		class126.method2965(SoundCache.cacheDir); // L: 224
		ChatChannel.method2153(); // L: 225
		JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(class126.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0); // L: 226
		JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class126.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0); // L: 227
		JagexCache.JagexCache_idxFiles = new BufferedFile[class188.idxCount]; // L: 228

		for (var18 = 0; var18 < class188.idxCount; ++var18) { // L: 229
			JagexCache.JagexCache_idxFiles[var18] = new BufferedFile(new AccessFile(class126.getFile("main_file_cache.idx" + var18), "rw", 1048576L), 6000, 0); // L: 230
		}

	} // L: 232

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1923414943"
	)
	static int method2277(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field839 - 7.0D) * 256.0D); // L: 4347
	}
}
