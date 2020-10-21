import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
public class class90 {
	@ObfuscatedName("gh")
	@Export("regions")
	static int[] regions;

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "4"
	)
	public static void method2138(String var0, String var1, int var2, int var3) throws IOException {
		GZipDecompressor.idxCount = var3;
		SoundSystem.cacheGamebuild = var2;

		try {
			WorldMapRegion.field277 = System.getProperty("os.name");
		} catch (Exception var33) {
			WorldMapRegion.field277 = "Unknown";
		}

		JagexCache.field2094 = WorldMapRegion.field277.toLowerCase();

		try {
			UserComparator2.userHomeDirectory = System.getProperty("user.home");
			if (UserComparator2.userHomeDirectory != null) {
				UserComparator2.userHomeDirectory = UserComparator2.userHomeDirectory + "/";
			}
		} catch (Exception var32) {
		}

		try {
			if (JagexCache.field2094.startsWith("win")) {
				if (UserComparator2.userHomeDirectory == null) {
					UserComparator2.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (UserComparator2.userHomeDirectory == null) {
				UserComparator2.userHomeDirectory = System.getenv("HOME");
			}

			if (UserComparator2.userHomeDirectory != null) {
				UserComparator2.userHomeDirectory = UserComparator2.userHomeDirectory + "/";
			}
		} catch (Exception var31) {
		}

		if (UserComparator2.userHomeDirectory == null) {
			UserComparator2.userHomeDirectory = "~/";
		}

		UserComparator4.field2005 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", UserComparator2.userHomeDirectory, "/tmp/", ""};
		class69.field570 = new String[]{".jagex_cache_" + SoundSystem.cacheGamebuild, ".file_store_" + SoundSystem.cacheGamebuild};
		int var18 = 0;

		label272:
		while (var18 < 4) {
			String var6 = var18 == 0 ? "" : "" + var18;
			JagexCache.JagexCache_locationFile = new File(UserComparator2.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var6 + ".dat");
			String var7 = null;
			String var8 = null;
			boolean var9 = false;
			Buffer var11;
			int var12;
			int var14;
			File var38;
			if (JagexCache.JagexCache_locationFile.exists()) {
				try {
					AccessFile var10 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L);

					for (var11 = new Buffer((int)var10.length()); var11.offset < var11.array.length; var11.offset += var12) {
						var12 = var10.read(var11.array, var11.offset, var11.array.length - var11.offset);
						if (var12 == -1) {
							throw new IOException();
						}
					}

					var11.offset = 0;
					var12 = var11.readUnsignedByte();
					if (var12 < 1 || var12 > 3) {
						throw new IOException("" + var12);
					}

					int var13 = 0;
					if (var12 > 1) {
						var13 = var11.readUnsignedByte();
					}

					if (var12 <= 2) {
						var7 = var11.readStringCp1252NullCircumfixed();
						if (var13 == 1) {
							var8 = var11.readStringCp1252NullCircumfixed();
						}
					} else {
						var7 = var11.readCESU8();
						if (var13 == 1) {
							var8 = var11.readCESU8();
						}
					}

					var10.close();
				} catch (IOException var35) {
					var35.printStackTrace();
				}

				if (var7 != null) {
					var38 = new File(var7);
					if (!var38.exists()) {
						var7 = null;
					}
				}

				if (var7 != null) {
					var38 = new File(var7, "test.dat");

					boolean var40;
					try {
						RandomAccessFile var19 = new RandomAccessFile(var38, "rw");
						var14 = var19.read();
						var19.seek(0L);
						var19.write(var14);
						var19.seek(0L);
						var19.close();
						var38.delete();
						var40 = true;
					} catch (Exception var30) {
						var40 = false;
					}

					if (!var40) {
						var7 = null;
					}
				}
			}

			if (var7 == null && var18 == 0) {
				label246:
				for (int var20 = 0; var20 < class69.field570.length; ++var20) {
					for (int var21 = 0; var21 < UserComparator4.field2005.length; ++var21) {
						File var22 = new File(UserComparator4.field2005[var21] + class69.field570[var20] + File.separatorChar + var0 + File.separatorChar);
						if (var22.exists()) {
							File var23 = new File(var22, "test.dat");

							boolean var42;
							try {
								RandomAccessFile var15 = new RandomAccessFile(var23, "rw");
								int var16 = var15.read();
								var15.seek(0L);
								var15.write(var16);
								var15.seek(0L);
								var15.close();
								var23.delete();
								var42 = true;
							} catch (Exception var29) {
								var42 = false;
							}

							if (var42) {
								var7 = var22.toString();
								var9 = true;
								break label246;
							}
						}
					}
				}
			}

			if (var7 == null) {
				var7 = UserComparator2.userHomeDirectory + File.separatorChar + "jagexcache" + var6 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
				var9 = true;
			}

			File var37;
			if (var8 != null) {
				var37 = new File(var8);
				var38 = new File(var7);

				try {
					File[] var47 = var37.listFiles();
					File[] var44 = var47;

					for (var14 = 0; var14 < var44.length; ++var14) {
						File var43 = var44[var14];
						File var24 = new File(var38, var43.getName());
						boolean var17 = var43.renameTo(var24);
						if (!var17) {
							throw new IOException();
						}
					}
				} catch (Exception var34) {
					var34.printStackTrace();
				}

				var9 = true;
			}

			if (var9) {
				var37 = new File(var7);
				var11 = null;

				try {
					AccessFile var48 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L);
					Buffer var45 = new Buffer(500);
					var45.writeByte(3);
					var45.writeByte(var11 != null ? 1 : 0);
					var45.writeCESU8(var37.getPath());
					if (var11 != null) {
						var45.writeCESU8("");
					}

					var48.write(var45.array, 0, var45.offset);
					var48.close();
				} catch (IOException var28) {
					var28.printStackTrace();
				}
			}

			File var5 = new File(var7);
			JagexCache.cacheDir = var5;
			if (!JagexCache.cacheDir.exists()) {
				JagexCache.cacheDir.mkdirs();
			}

			File[] var36 = JagexCache.cacheDir.listFiles();
			if (var36 != null) {
				File[] var39 = var36;

				for (int var25 = 0; var25 < var39.length; ++var25) {
					File var26 = var39[var25];

					boolean var46;
					try {
						RandomAccessFile var41 = new RandomAccessFile(var26, "rw");
						var12 = var41.read();
						var41.seek(0L);
						var41.write(var12);
						var41.seek(0L);
						var41.close();
						var46 = true;
					} catch (Exception var27) {
						var46 = false;
					}

					if (!var46) {
						++var18;
						continue label272;
					}
				}
			}
			break;
		}

		WorldMapDecoration.method406(JagexCache.cacheDir);
		GraphicsObject.method2091();
		JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(AbstractWorldMapIcon.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
		JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(AbstractWorldMapIcon.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
		JagexCache.JagexCache_idxFiles = new BufferedFile[GZipDecompressor.idxCount];

		for (var18 = 0; var18 < GZipDecompressor.idxCount; ++var18) {
			JagexCache.JagexCache_idxFiles[var18] = new BufferedFile(new AccessFile(AbstractWorldMapIcon.getFile("main_file_cache.idx" + var18), "rw", 1048576L), 6000, 0);
		}

	}
}
