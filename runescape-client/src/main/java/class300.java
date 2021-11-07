import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kv")
public class class300 {
	@ObfuscatedName("j")
	static int[] field3765;
	@ObfuscatedName("h")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("i")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("s")
	int[] field3761;
	@ObfuscatedName("a")
	int[] field3760;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -204507217
	)
	int field3762;

	public class300() {
		this.spriteMap = new HashMap();
		this.bounds = new Bounds(0, 0);
		this.field3761 = new int[2048];
		this.field3760 = new int[2048];
		this.field3762 = 0;
		UserComparator6.method2513();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1928494539"
	)
	void method5487(int var1) {
		int var2 = var1 * 2 + 1;
		double var4 = (double)((float)var1 / 3.0F);
		int var6 = var1 * 2 + 1;
		double[] var7 = new double[var6];
		int var8 = -var1;

		for (int var9 = 0; var8 <= var1; ++var9) {
			var7[var9] = PacketWriter.method2425((double)var8, 0.0D, var4);
			++var8;
		}

		double[] var14 = var7;
		double var15 = var7[var1] * var7[var1];
		int[] var17 = new int[var2 * var2];
		boolean var10 = false;

		for (int var11 = 0; var11 < var2; ++var11) {
			for (int var12 = 0; var12 < var2; ++var12) {
				int var13 = var17[var12 + var2 * var11] = (int)(var14[var12] * var14[var11] / var15 * 256.0D);
				if (!var10 && var13 > 0) {
					var10 = true;
				}
			}
		}

		SpritePixels var18 = new SpritePixels(var17, var2, var2);
		this.spriteMap.put(var1, var18);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Low;",
		garbageValue = "-975153988"
	)
	SpritePixels method5488(int var1) {
		if (!this.spriteMap.containsKey(var1)) {
			this.method5487(var1);
		}

		return (SpritePixels)this.spriteMap.get(var1);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "262729"
	)
	public final void method5498(int var1, int var2) {
		if (this.field3762 < this.field3761.length) {
			this.field3761[this.field3762] = var1;
			this.field3760[this.field3762] = var2;
			++this.field3762;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1224368993"
	)
	public final void method5490() {
		this.field3762 = 0;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IILow;FB)V",
		garbageValue = "-58"
	)
	public final void method5491(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(18.0F * var4);
		SpritePixels var6 = this.method5488(var5);
		int var7 = var5 * 2 + 1;
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
		Bounds var9 = new Bounds(0, 0);
		this.bounds.setHigh(var7, var7);
		System.nanoTime();

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field3762; ++var10) {
			var11 = this.field3761[var10];
			var12 = this.field3760[var10];
			int var13 = (int)(var4 * (float)(var11 - var1)) - var5;
			int var14 = (int)((float)var3.subHeight - var4 * (float)(var12 - var2)) - var5;
			this.bounds.setLow(var13, var14);
			this.bounds.method6353(var8, var9);
			this.method5494(var6, var3, var9);
		}

		System.nanoTime();
		System.nanoTime();

		for (var10 = 0; var10 < var3.pixels.length; ++var10) {
			if (var3.pixels[var10] == 0) {
				var3.pixels[var10] = -16777216;
			} else {
				var11 = (var3.pixels[var10] + 64 - 1) / 256;
				if (var11 <= 0) {
					var3.pixels[var10] = -16777216;
				} else {
					if (var11 > field3765.length) {
						var11 = field3765.length;
					}

					var12 = field3765[var11 - 1];
					var3.pixels[var10] = -16777216 | var12;
				}
			}
		}

		System.nanoTime();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Low;Low;Lmo;B)V",
		garbageValue = "-61"
	)
	void method5494(SpritePixels var1, SpritePixels var2, Bounds var3) {
		if (var3.highX != 0 && var3.highY != 0) {
			int var4 = 0;
			int var5 = 0;
			if (var3.lowX == 0) {
				var4 = var1.subWidth - var3.highX;
			}

			if (var3.lowY == 0) {
				var5 = var1.subHeight - var3.highY;
			}

			int var6 = var4 + var5 * var1.subWidth;
			int var7 = var2.subWidth * var3.lowY + var3.lowX;

			for (int var8 = 0; var8 < var3.highY; ++var8) {
				for (int var9 = 0; var9 < var3.highX; ++var9) {
					int[] var10000 = var2.pixels;
					int var10001 = var7++;
					var10000[var10001] += var1.pixels[var6++];
				}

				var6 += var1.subWidth - var3.highX;
				var7 += var2.subWidth - var3.highX;
			}

		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-2012491010"
	)
	public static void method5507(String var0, String var1, int var2, int var3) throws IOException {
		ItemContainer.idxCount = var3;
		JagexCache.cacheGamebuild = var2;

		try {
			JagexCache.operatingSystemName = System.getProperty("os.name");
		} catch (Exception var27) {
			JagexCache.operatingSystemName = "Unknown";
		}

		class176.formattedOperatingSystemName = JagexCache.operatingSystemName.toLowerCase();

		try {
			TriBool.userHomeDirectory = System.getProperty("user.home");
			if (TriBool.userHomeDirectory != null) {
				TriBool.userHomeDirectory = TriBool.userHomeDirectory + "/";
			}
		} catch (Exception var26) {
		}

		try {
			if (class176.formattedOperatingSystemName.startsWith("win")) {
				if (TriBool.userHomeDirectory == null) {
					TriBool.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (TriBool.userHomeDirectory == null) {
				TriBool.userHomeDirectory = System.getenv("HOME");
			}

			if (TriBool.userHomeDirectory != null) {
				TriBool.userHomeDirectory = TriBool.userHomeDirectory + "/";
			}
		} catch (Exception var25) {
		}

		if (TriBool.userHomeDirectory == null) {
			TriBool.userHomeDirectory = "~/";
		}

		NPC.cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", TriBool.userHomeDirectory, "/tmp/", ""};
		AbstractRasterProvider.cacheSubPaths = new String[]{".jagex_cache_" + JagexCache.cacheGamebuild, ".file_store_" + JagexCache.cacheGamebuild};
		int var18 = 0;

		label232:
		while (var18 < 4) {
			String var6 = var18 == 0 ? "" : "" + var18;
			class351.JagexCache_locationFile = new File(TriBool.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var6 + ".dat");
			String var7 = null;
			String var8 = null;
			boolean var9 = false;
			File var32;
			if (class351.JagexCache_locationFile.exists()) {
				try {
					AccessFile var10 = new AccessFile(class351.JagexCache_locationFile, "rw", 10000L);

					Buffer var11;
					int var12;
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
				} catch (IOException var29) {
					var29.printStackTrace();
				}

				if (var7 != null) {
					var32 = new File(var7);
					if (!var32.exists()) {
						var7 = null;
					}
				}

				if (var7 != null) {
					var32 = new File(var7, "test.dat");
					if (!Varcs.method2359(var32, true)) {
						var7 = null;
					}
				}
			}

			if (var7 == null && var18 == 0) {
				label207:
				for (int var19 = 0; var19 < AbstractRasterProvider.cacheSubPaths.length; ++var19) {
					for (int var20 = 0; var20 < NPC.cacheParentPaths.length; ++var20) {
						File var21 = new File(NPC.cacheParentPaths[var20] + AbstractRasterProvider.cacheSubPaths[var19] + File.separatorChar + var0 + File.separatorChar);
						if (var21.exists() && Varcs.method2359(new File(var21, "test.dat"), true)) {
							var7 = var21.toString();
							var9 = true;
							break label207;
						}
					}
				}
			}

			if (var7 == null) {
				var7 = TriBool.userHomeDirectory + File.separatorChar + "jagexcache" + var6 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
				var9 = true;
			}

			if (var8 != null) {
				File var31 = new File(var8);
				var32 = new File(var7);

				try {
					File[] var34 = var31.listFiles();
					File[] var22 = var34;

					for (int var14 = 0; var14 < var22.length; ++var14) {
						File var15 = var22[var14];
						File var16 = new File(var32, var15.getName());
						boolean var17 = var15.renameTo(var16);
						if (!var17) {
							throw new IOException();
						}
					}
				} catch (Exception var28) {
					var28.printStackTrace();
				}

				var9 = true;
			}

			if (var9) {
				UserComparator7.method2470(new File(var7), (File)null);
			}

			File var5 = new File(var7);
			JagexCache.cacheDir = var5;
			if (!JagexCache.cacheDir.exists()) {
				JagexCache.cacheDir.mkdirs();
			}

			File[] var30 = JagexCache.cacheDir.listFiles();
			if (var30 != null) {
				File[] var33 = var30;

				for (int var23 = 0; var23 < var33.length; ++var23) {
					File var24 = var33[var23];
					if (!Varcs.method2359(var24, false)) {
						++var18;
						continue label232;
					}
				}
			}
			break;
		}

		UserComparator6.method2508(JagexCache.cacheDir);
		WorldMapData_1.method3844();
		JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(TriBool.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
		JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(TriBool.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
		WorldMapID.JagexCache_idxFiles = new BufferedFile[ItemContainer.idxCount];

		for (var18 = 0; var18 < ItemContainer.idxCount; ++var18) {
			WorldMapID.JagexCache_idxFiles[var18] = new BufferedFile(new AccessFile(TriBool.getFile("main_file_cache.idx" + var18), "rw", 1048576L), 6000, 0);
		}

	}
}
