import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ts")
public class class498 extends class500 {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1332316819
	)
	int field5004;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1382713073
	)
	int field5005;

	public class498(int var1, int var2, int var3, int var4) {
		super(var3, var4); // L: 8
		this.field5004 = 0; // L: 4
		this.field5005 = 0; // L: 5
		this.field5004 = var1; // L: 9
		this.field5005 = var2; // L: 10
	} // L: 11

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	public int method8666() {
		double var1 = this.method8680(); // L: 14
		return (int)Math.round((double)this.field5004 + var1 * (double)(this.field5005 - this.field5004)); // L: 15
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "99"
	)
	public static void method8662(String var0, String var1, String var2, int var3, int var4) throws IOException {
		if (var1 != null && !var1.isEmpty()) { // L: 40
			var0 = var0 + "-" + var1; // L: 41
		}

		class404.idxCount = var4; // L: 43
		class409.cacheGamebuild = var3; // L: 44

		try {
			UserComparator7.field1480 = System.getProperty("os.name"); // L: 46
		} catch (Exception var35) { // L: 48
			UserComparator7.field1480 = "Unknown"; // L: 49
		}

		class268.field2956 = UserComparator7.field1480.toLowerCase(); // L: 51
		class136.userHomeDirectory = null; // L: 52

		try {
			class136.userHomeDirectory = System.getProperty("jagex.userhome"); // L: 54
		} catch (Exception var34) { // L: 56
		}

		if (class136.userHomeDirectory == null) { // L: 57
			try {
				class136.userHomeDirectory = System.getProperty("user.home"); // L: 58
			} catch (Exception var33) { // L: 60
			}
		}

		if (class136.userHomeDirectory != null) { // L: 61
			class136.userHomeDirectory = class136.userHomeDirectory + "/";
		}

		try {
			if (class268.field2956.startsWith("win")) { // L: 63
				if (class136.userHomeDirectory == null) { // L: 64
					class136.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (class136.userHomeDirectory == null) { // L: 67
				class136.userHomeDirectory = System.getenv("HOME");
			}

			if (class136.userHomeDirectory != null) { // L: 69
				class136.userHomeDirectory = class136.userHomeDirectory + "/";
			}
		} catch (Exception var32) { // L: 71
		}

		if (class136.userHomeDirectory == null) { // L: 72
			class136.userHomeDirectory = "~/";
		}

		HealthBar.field1327 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class136.userHomeDirectory, "/tmp/", ""}; // L: 73
		class60.field423 = new String[]{".jagex_cache_" + class409.cacheGamebuild, ".file_store_" + class409.cacheGamebuild}; // L: 74
		int var19 = 0;

		label279:
		while (var19 < 4) {
			String var7 = var19 == 0 ? "" : "" + var19; // L: 78
			class193.field1986 = new File(class136.userHomeDirectory, "jagex_cl_" + var0 + "_" + var2 + var7 + ".dat"); // L: 79
			String var8 = null; // L: 80
			String var9 = null; // L: 81
			boolean var10 = false; // L: 82
			int var13;
			int var15;
			File var40;
			if (class193.field1986.exists()) { // L: 83
				try {
					AccessFile var11 = new AccessFile(class193.field1986, "rw", 10000L); // L: 86

					Buffer var12;
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
				} catch (IOException var37) { // L: 108
					var37.printStackTrace(); // L: 109
				}

				if (var8 != null) { // L: 111
					var40 = new File(var8); // L: 112
					if (!var40.exists()) { // L: 113
						var8 = null; // L: 114
					}
				}

				if (var8 != null) { // L: 117
					var40 = new File(var8, "test.dat"); // L: 118

					boolean var43;
					try {
						RandomAccessFile var20 = new RandomAccessFile(var40, "rw"); // L: 122
						var15 = var20.read(); // L: 123
						var20.seek(0L); // L: 124
						var20.write(var15); // L: 125
						var20.seek(0L); // L: 126
						var20.close(); // L: 127
						var40.delete(); // L: 128
						var43 = true; // L: 129
					} catch (Exception var31) { // L: 131
						var43 = false; // L: 132
					}

					if (!var43) { // L: 135
						var8 = null; // L: 136
					}
				}
			}

			if (var8 == null && var19 == 0) { // L: 140
				label253:
				for (int var21 = 0; var21 < class60.field423.length; ++var21) { // L: 141
					for (int var22 = 0; var22 < HealthBar.field1327.length; ++var22) { // L: 142
						File var23 = new File(HealthBar.field1327[var22] + class60.field423[var21] + File.separatorChar + var0 + File.separatorChar); // L: 143
						if (var23.exists()) { // L: 144
							File var24 = new File(var23, "test.dat"); // L: 146

							boolean var44;
							try {
								RandomAccessFile var16 = new RandomAccessFile(var24, "rw"); // L: 149
								int var17 = var16.read(); // L: 150
								var16.seek(0L); // L: 151
								var16.write(var17); // L: 152
								var16.seek(0L); // L: 153
								var16.close(); // L: 154
								var24.delete(); // L: 155
								var44 = true; // L: 156
							} catch (Exception var30) { // L: 158
								var44 = false; // L: 159
							}

							if (var44) { // L: 162
								var8 = var23.toString(); // L: 163
								var10 = true; // L: 164
								break label253; // L: 165
							}
						}
					}
				}
			}

			if (var8 == null) { // L: 171
				var8 = class136.userHomeDirectory + File.separatorChar + "jagexcache" + var7 + File.separatorChar + var0 + File.separatorChar + var2 + File.separatorChar; // L: 172
				var10 = true; // L: 173
			}

			if (var9 != null) { // L: 175
				File var39 = new File(var9); // L: 176
				var40 = new File(var8); // L: 177

				try {
					File[] var48 = var39.listFiles(); // L: 179
					File[] var46 = var48; // L: 181

					for (var15 = 0; var15 < var46.length; ++var15) { // L: 182
						File var45 = var46[var15]; // L: 183
						File var25 = new File(var40, var45.getName()); // L: 185
						boolean var18 = var45.renameTo(var25); // L: 186
						if (!var18) { // L: 187
							throw new IOException();
						}
					}
				} catch (Exception var36) { // L: 192
					var36.printStackTrace(); // L: 193
				}

				var10 = true; // L: 195
			}

			if (var10) { // L: 197
				class172.method3496(new File(var8), (File)null);
			}

			File var6 = new File(var8); // L: 198
			JagexCache.cacheDir = var6; // L: 200
			if (!JagexCache.cacheDir.exists()) { // L: 201
				JagexCache.cacheDir.mkdirs();
			}

			File[] var38 = JagexCache.cacheDir.listFiles(); // L: 202
			if (var38 != null) { // L: 203
				File[] var41 = var38; // L: 205

				for (int var26 = 0; var26 < var41.length; ++var26) { // L: 206
					File var27 = var41[var26]; // L: 207

					boolean var47;
					try {
						RandomAccessFile var42 = new RandomAccessFile(var27, "rw"); // L: 212
						var13 = var42.read(); // L: 213
						var42.seek(0L); // L: 214
						var42.write(var13); // L: 215
						var42.seek(0L); // L: 216
						var42.close(); // L: 217
						var47 = true; // L: 219
					} catch (Exception var29) { // L: 221
						var47 = false; // L: 222
					}

					if (!var47) { // L: 225
						++var19; // L: 75
						continue label279;
					}
				}
			}
			break;
		}

		File var5 = JagexCache.cacheDir; // L: 232
		FileSystem.FileSystem_cacheDir = var5; // L: 234
		if (!FileSystem.FileSystem_cacheDir.exists()) { // L: 235
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true; // L: 236
			class142.method3134(); // L: 238
			JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(class129.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0); // L: 239
			JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class129.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0); // L: 240
			UserComparator5.JagexCache_idxFiles = new BufferedFile[class404.idxCount]; // L: 241

			for (int var28 = 0; var28 < class404.idxCount; ++var28) { // L: 242
				UserComparator5.JagexCache_idxFiles[var28] = new BufferedFile(new AccessFile(class129.getFile("main_file_cache.idx" + var28), "rw", 1048576L), 6000, 0); // L: 243
			}

		}
	} // L: 245
}
