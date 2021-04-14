import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
@Implements("CollisionMap")
public class CollisionMap {
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1593965705
	)
	public static int field1535;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1207023295
	)
	@Export("xInset")
	public int xInset;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1514809971
	)
	@Export("yInset")
	public int yInset;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1497188267
	)
	@Export("xSize")
	int xSize;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 703180001
	)
	@Export("ySize")
	int ySize;
	@ObfuscatedName("ad")
	@Export("flags")
	public int[][] flags;

	public CollisionMap(int var1, int var2) {
		this.xInset = 0;
		this.yInset = 0;
		this.xSize = var1;
		this.ySize = var2;
		this.flags = new int[this.xSize][this.ySize];
		this.clear();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "147847129"
	)
	@Export("clear")
	public void clear() {
		for (int var1 = 0; var1 < this.xSize; ++var1) {
			for (int var2 = 0; var2 < this.ySize; ++var2) {
				if (var1 != 0 && var2 != 0 && var1 < this.xSize - 5 && var2 < this.ySize - 5) {
					this.flags[var1][var2] = 16777216;
				} else {
					this.flags[var1][var2] = 16777215;
				}
			}
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(IIIIZI)V",
		garbageValue = "-1236206296"
	)
	public void method2613(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		if (var3 == 0) {
			if (var4 == 0) {
				this.setFlag(var1, var2, 128);
				this.setFlag(var1 - 1, var2, 8);
			}

			if (var4 == 1) {
				this.setFlag(var1, var2, 2);
				this.setFlag(var1, var2 + 1, 32);
			}

			if (var4 == 2) {
				this.setFlag(var1, var2, 8);
				this.setFlag(var1 + 1, var2, 128);
			}

			if (var4 == 3) {
				this.setFlag(var1, var2, 32);
				this.setFlag(var1, var2 - 1, 2);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (var4 == 0) {
				this.setFlag(var1, var2, 1);
				this.setFlag(var1 - 1, var2 + 1, 16);
			}

			if (var4 == 1) {
				this.setFlag(var1, var2, 4);
				this.setFlag(var1 + 1, var2 + 1, 64);
			}

			if (var4 == 2) {
				this.setFlag(var1, var2, 16);
				this.setFlag(var1 + 1, var2 - 1, 1);
			}

			if (var4 == 3) {
				this.setFlag(var1, var2, 64);
				this.setFlag(var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				this.setFlag(var1, var2, 130);
				this.setFlag(var1 - 1, var2, 8);
				this.setFlag(var1, var2 + 1, 32);
			}

			if (var4 == 1) {
				this.setFlag(var1, var2, 10);
				this.setFlag(var1, var2 + 1, 32);
				this.setFlag(var1 + 1, var2, 128);
			}

			if (var4 == 2) {
				this.setFlag(var1, var2, 40);
				this.setFlag(var1 + 1, var2, 128);
				this.setFlag(var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				this.setFlag(var1, var2, 160);
				this.setFlag(var1, var2 - 1, 2);
				this.setFlag(var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					this.setFlag(var1, var2, 65536);
					this.setFlag(var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					this.setFlag(var1, var2, 1024);
					this.setFlag(var1, var2 + 1, 16384);
				}

				if (var4 == 2) {
					this.setFlag(var1, var2, 4096);
					this.setFlag(var1 + 1, var2, 65536);
				}

				if (var4 == 3) {
					this.setFlag(var1, var2, 16384);
					this.setFlag(var1, var2 - 1, 1024);
				}
			}

			if (var3 == 1 || var3 == 3) {
				if (var4 == 0) {
					this.setFlag(var1, var2, 512);
					this.setFlag(var1 - 1, var2 + 1, 8192);
				}

				if (var4 == 1) {
					this.setFlag(var1, var2, 2048);
					this.setFlag(var1 + 1, var2 + 1, 32768);
				}

				if (var4 == 2) {
					this.setFlag(var1, var2, 8192);
					this.setFlag(var1 + 1, var2 - 1, 512);
				}

				if (var4 == 3) {
					this.setFlag(var1, var2, 32768);
					this.setFlag(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					this.setFlag(var1, var2, 66560);
					this.setFlag(var1 - 1, var2, 4096);
					this.setFlag(var1, var2 + 1, 16384);
				}

				if (var4 == 1) {
					this.setFlag(var1, var2, 5120);
					this.setFlag(var1, var2 + 1, 16384);
					this.setFlag(var1 + 1, var2, 65536);
				}

				if (var4 == 2) {
					this.setFlag(var1, var2, 20480);
					this.setFlag(var1 + 1, var2, 65536);
					this.setFlag(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					this.setFlag(var1, var2, 81920);
					this.setFlag(var1, var2 - 1, 1024);
					this.setFlag(var1 - 1, var2, 4096);
				}
			}
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(IIIIZI)V",
		garbageValue = "-1542434714"
	)
	@Export("addGameObject")
	public void addGameObject(int var1, int var2, int var3, int var4, boolean var5) {
		int var6 = 256;
		if (var5) {
			var6 += 131072;
		}

		var1 -= this.xInset;
		var2 -= this.yInset;

		for (int var7 = var1; var7 < var3 + var1; ++var7) {
			if (var7 >= 0 && var7 < this.xSize) {
				for (int var8 = var2; var8 < var2 + var4; ++var8) {
					if (var8 >= 0 && var8 < this.ySize) {
						this.setFlag(var7, var8, var6);
					}
				}
			}
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(IIB)V",
		garbageValue = "2"
	)
	@Export("setBlockedByFloor")
	public void setBlockedByFloor(int var1, int var2) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		int[] var10000 = this.flags[var1];
		var10000[var2] |= 2097152;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "1437580764"
	)
	@Export("setBlockedByFloorDec")
	public void setBlockedByFloorDec(int var1, int var2) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		int[] var10000 = this.flags[var1];
		var10000[var2] |= 262144;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(IIII)V",
		garbageValue = "-1947097076"
	)
	@Export("setFlag")
	void setFlag(int var1, int var2, int var3) {
		int[] var10000 = this.flags[var1];
		var10000[var2] |= var3;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(IIIIZI)V",
		garbageValue = "1853032959"
	)
	public void method2616(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		if (var3 == 0) {
			if (var4 == 0) {
				this.setFlagOff(var1, var2, 128);
				this.setFlagOff(var1 - 1, var2, 8);
			}

			if (var4 == 1) {
				this.setFlagOff(var1, var2, 2);
				this.setFlagOff(var1, var2 + 1, 32);
			}

			if (var4 == 2) {
				this.setFlagOff(var1, var2, 8);
				this.setFlagOff(var1 + 1, var2, 128);
			}

			if (var4 == 3) {
				this.setFlagOff(var1, var2, 32);
				this.setFlagOff(var1, var2 - 1, 2);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (var4 == 0) {
				this.setFlagOff(var1, var2, 1);
				this.setFlagOff(var1 - 1, var2 + 1, 16);
			}

			if (var4 == 1) {
				this.setFlagOff(var1, var2, 4);
				this.setFlagOff(var1 + 1, var2 + 1, 64);
			}

			if (var4 == 2) {
				this.setFlagOff(var1, var2, 16);
				this.setFlagOff(var1 + 1, var2 - 1, 1);
			}

			if (var4 == 3) {
				this.setFlagOff(var1, var2, 64);
				this.setFlagOff(var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				this.setFlagOff(var1, var2, 130);
				this.setFlagOff(var1 - 1, var2, 8);
				this.setFlagOff(var1, var2 + 1, 32);
			}

			if (var4 == 1) {
				this.setFlagOff(var1, var2, 10);
				this.setFlagOff(var1, var2 + 1, 32);
				this.setFlagOff(var1 + 1, var2, 128);
			}

			if (var4 == 2) {
				this.setFlagOff(var1, var2, 40);
				this.setFlagOff(var1 + 1, var2, 128);
				this.setFlagOff(var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				this.setFlagOff(var1, var2, 160);
				this.setFlagOff(var1, var2 - 1, 2);
				this.setFlagOff(var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					this.setFlagOff(var1, var2, 65536);
					this.setFlagOff(var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					this.setFlagOff(var1, var2, 1024);
					this.setFlagOff(var1, var2 + 1, 16384);
				}

				if (var4 == 2) {
					this.setFlagOff(var1, var2, 4096);
					this.setFlagOff(var1 + 1, var2, 65536);
				}

				if (var4 == 3) {
					this.setFlagOff(var1, var2, 16384);
					this.setFlagOff(var1, var2 - 1, 1024);
				}
			}

			if (var3 == 1 || var3 == 3) {
				if (var4 == 0) {
					this.setFlagOff(var1, var2, 512);
					this.setFlagOff(var1 - 1, var2 + 1, 8192);
				}

				if (var4 == 1) {
					this.setFlagOff(var1, var2, 2048);
					this.setFlagOff(var1 + 1, var2 + 1, 32768);
				}

				if (var4 == 2) {
					this.setFlagOff(var1, var2, 8192);
					this.setFlagOff(var1 + 1, var2 - 1, 512);
				}

				if (var4 == 3) {
					this.setFlagOff(var1, var2, 32768);
					this.setFlagOff(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					this.setFlagOff(var1, var2, 66560);
					this.setFlagOff(var1 - 1, var2, 4096);
					this.setFlagOff(var1, var2 + 1, 16384);
				}

				if (var4 == 1) {
					this.setFlagOff(var1, var2, 5120);
					this.setFlagOff(var1, var2 + 1, 16384);
					this.setFlagOff(var1 + 1, var2, 65536);
				}

				if (var4 == 2) {
					this.setFlagOff(var1, var2, 20480);
					this.setFlagOff(var1 + 1, var2, 65536);
					this.setFlagOff(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					this.setFlagOff(var1, var2, 81920);
					this.setFlagOff(var1, var2 - 1, 1024);
					this.setFlagOff(var1 - 1, var2, 4096);
				}
			}
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(IIIIIZI)V",
		garbageValue = "792603684"
	)
	@Export("setFlagOffNonSquare")
	public void setFlagOffNonSquare(int var1, int var2, int var3, int var4, int var5, boolean var6) {
		int var7 = 256;
		if (var6) {
			var7 += 131072;
		}

		var1 -= this.xInset;
		var2 -= this.yInset;
		int var8;
		if (var5 == 1 || var5 == 3) {
			var8 = var3;
			var3 = var4;
			var4 = var8;
		}

		for (var8 = var1; var8 < var3 + var1; ++var8) {
			if (var8 >= 0 && var8 < this.xSize) {
				for (int var9 = var2; var9 < var2 + var4; ++var9) {
					if (var9 >= 0 && var9 < this.ySize) {
						this.setFlagOff(var8, var9, var7);
					}
				}
			}
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(IIIB)V",
		garbageValue = "7"
	)
	@Export("setFlagOff")
	void setFlagOff(int var1, int var2, int var3) {
		int[] var10000 = this.flags[var1];
		var10000[var2] &= ~var3;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "-1556531543"
	)
	public void method2621(int var1, int var2) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		int[] var10000 = this.flags[var1];
		var10000[var2] &= -262145;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-1545015307"
	)
	public static void method2649(String var0, String var1, int var2, int var3) throws IOException {
		JagexCache.idxCount = var3;
		class20.cacheGamebuild = var2;

		try {
			Varps.field2575 = System.getProperty("os.name");
		} catch (Exception var29) {
			Varps.field2575 = "Unknown";
		}

		Decimator.field510 = Varps.field2575.toLowerCase();

		try {
			Canvas.userHomeDirectory = System.getProperty("user.home");
			if (Canvas.userHomeDirectory != null) {
				Canvas.userHomeDirectory = Canvas.userHomeDirectory + "/";
			}
		} catch (Exception var28) {
		}

		try {
			if (Decimator.field510.startsWith("win")) {
				if (Canvas.userHomeDirectory == null) {
					Canvas.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (Canvas.userHomeDirectory == null) {
				Canvas.userHomeDirectory = System.getenv("HOME");
			}

			if (Canvas.userHomeDirectory != null) {
				Canvas.userHomeDirectory = Canvas.userHomeDirectory + "/";
			}
		} catch (Exception var27) {
		}

		if (Canvas.userHomeDirectory == null) {
			Canvas.userHomeDirectory = "~/";
		}

		IntHashTable.field4270 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Canvas.userHomeDirectory, "/tmp/", ""};
		class311.field3798 = new String[]{".jagex_cache_" + class20.cacheGamebuild, ".file_store_" + class20.cacheGamebuild};
		int var18 = 0;

		label277:
		while (var18 < 4) {
			String var6 = var18 == 0 ? "" : "" + var18;
			JagexCache.JagexCache_locationFile = new File(Canvas.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var6 + ".dat");
			String var7 = null;
			String var8 = null;
			boolean var9 = false;
			File var36;
			if (JagexCache.JagexCache_locationFile.exists()) {
				try {
					AccessFile var10 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L);

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
				} catch (IOException var32) {
					var32.printStackTrace();
				}

				if (var7 != null) {
					var36 = new File(var7);
					if (!var36.exists()) {
						var7 = null;
					}
				}

				if (var7 != null) {
					var36 = new File(var7, "test.dat");
					if (!MouseHandler.method723(var36, true)) {
						var7 = null;
					}
				}
			}

			if (var7 == null && var18 == 0) {
				label252:
				for (int var19 = 0; var19 < class311.field3798.length; ++var19) {
					for (int var20 = 0; var20 < IntHashTable.field4270.length; ++var20) {
						File var21 = new File(IntHashTable.field4270[var20] + class311.field3798[var19] + File.separatorChar + var0 + File.separatorChar);
						if (var21.exists() && MouseHandler.method723(new File(var21, "test.dat"), true)) {
							var7 = var21.toString();
							var9 = true;
							break label252;
						}
					}
				}
			}

			if (var7 == null) {
				var7 = Canvas.userHomeDirectory + File.separatorChar + "jagexcache" + var6 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
				var9 = true;
			}

			if (var8 != null) {
				File var35 = new File(var8);
				var36 = new File(var7);

				try {
					File[] var39 = var35.listFiles();
					File[] var22 = var39;

					for (int var14 = 0; var14 < var22.length; ++var14) {
						File var15 = var22[var14];
						File var16 = new File(var36, var15.getName());
						boolean var17 = var15.renameTo(var16);
						if (!var17) {
							throw new IOException();
						}
					}
				} catch (Exception var31) {
					var31.printStackTrace();
				}

				var9 = true;
			}

			if (var9) {
				BuddyRankComparator.method2475(new File(var7), (File)null);
			}

			File var5 = new File(var7);
			JagexCache.cacheDir = var5;
			if (!JagexCache.cacheDir.exists()) {
				JagexCache.cacheDir.mkdirs();
			}

			File[] var34 = JagexCache.cacheDir.listFiles();
			if (var34 != null) {
				File[] var37 = var34;

				for (int var23 = 0; var23 < var37.length; ++var23) {
					File var24 = var37[var23];
					if (!MouseHandler.method723(var24, false)) {
						++var18;
						continue label277;
					}
				}
			}
			break;
		}

		InvDefinition.method4890(JagexCache.cacheDir);

		try {
			File var4 = new File(Canvas.userHomeDirectory, "random.dat");
			int var26;
			if (var4.exists()) {
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var4, "rw", 25L), 24, 0);
			} else {
				label205:
				for (int var25 = 0; var25 < class311.field3798.length; ++var25) {
					for (var26 = 0; var26 < IntHashTable.field4270.length; ++var26) {
						File var38 = new File(IntHashTable.field4270[var26] + class311.field3798[var25] + File.separatorChar + "random.dat");
						if (var38.exists()) {
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var38, "rw", 25L), 24, 0);
							break label205;
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) {
				RandomAccessFile var33 = new RandomAccessFile(var4, "rw");
				var26 = var33.read();
				var33.seek(0L);
				var33.write(var26);
				var33.seek(0L);
				var33.close();
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var4, "rw", 25L), 24, 0);
			}
		} catch (IOException var30) {
		}

		JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(class18.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
		JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class18.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
		PendingSpawn.JagexCache_idxFiles = new BufferedFile[JagexCache.idxCount];

		for (var18 = 0; var18 < JagexCache.idxCount; ++var18) {
			PendingSpawn.JagexCache_idxFiles[var18] = new BufferedFile(new AccessFile(class18.getFile("main_file_cache.idx" + var18), "rw", 1048576L), 6000, 0);
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Lig;IB)V",
		garbageValue = "-121"
	)
	static void method2622(Archive var0, int var1) {
		if (BuddyRankComparator.NetCache_reference != null) {
			BuddyRankComparator.NetCache_reference.offset = var1 * 8 + 5;
			int var2 = BuddyRankComparator.NetCache_reference.readInt();
			int var3 = BuddyRankComparator.NetCache_reference.readInt();
			var0.loadIndex(var2, var3);
		} else {
			Canvas.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true);
			NetCache.NetCache_archives[var1] = var0;
		}
	}
}
