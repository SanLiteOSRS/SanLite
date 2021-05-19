import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
@Implements("UserComparator5")
public class UserComparator5 extends AbstractUserComparator {
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("h")
	@Export("reversed")
	final boolean reversed;

	public UserComparator5(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Llq;Llq;I)I",
		garbageValue = "2087209771"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0) {
			if (var2.world == 0) {
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world != 0) {
			return this.reversed ? 1 : -1;
		}

		return this.compareUser(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnj;B)I",
		garbageValue = "67"
	)
	public static final int method2463(LoginType var0) {
		if (var0 == null) {
			return 12;
		} else {
			switch(var0.field4097) {
			case 4:
				return 20;
			default:
				return 12;
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-2108211230"
	)
	@Export("findAndLoadCache")
	public static void findAndLoadCache(String var0, String var1, int var2, int var3) throws IOException {
		class124.idxCount = var3;
		class310.cacheGamebuild = var2;

		try {
			class35.operatingSystemName = System.getProperty("os.name");
		} catch (Exception var31) {
			class35.operatingSystemName = "Unknown";
		}

		EnumComposition.formattedOperatingSystemName = class35.operatingSystemName.toLowerCase();

		try {
			AccessFile.userHomeDirectory = System.getProperty("user.home");
			if (AccessFile.userHomeDirectory != null) {
				AccessFile.userHomeDirectory = AccessFile.userHomeDirectory + "/";
			}
		} catch (Exception var30) {
		}

		try {
			if (EnumComposition.formattedOperatingSystemName.startsWith("win")) {
				if (AccessFile.userHomeDirectory == null) {
					AccessFile.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (AccessFile.userHomeDirectory == null) {
				AccessFile.userHomeDirectory = System.getenv("HOME");
			}

			if (AccessFile.userHomeDirectory != null) {
				AccessFile.userHomeDirectory = AccessFile.userHomeDirectory + "/";
			}
		} catch (Exception var29) {
		}

		if (AccessFile.userHomeDirectory == null) {
			AccessFile.userHomeDirectory = "~/";
		}

		class243.cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", AccessFile.userHomeDirectory, "/tmp/", ""};
		Script.cacheSubPaths = new String[]{".jagex_cache_" + class310.cacheGamebuild, ".file_store_" + class310.cacheGamebuild};
		int var18 = 0;

		File var5;
		label298:
		while (var18 < 4) {
			String var6 = var18 == 0 ? "" : "" + var18;
			JagexCache.JagexCache_locationFile = new File(AccessFile.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var6 + ".dat");
			String var7 = null;
			String var8 = null;
			boolean var9 = false;
			Buffer var11;
			File var39;
			if (JagexCache.JagexCache_locationFile.exists()) {
				try {
					AccessFile var10 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L);

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
				} catch (IOException var34) {
					var34.printStackTrace();
				}

				if (var7 != null) {
					var39 = new File(var7);
					if (!var39.exists()) {
						var7 = null;
					}
				}

				if (var7 != null) {
					var39 = new File(var7, "test.dat");
					if (!Nameable.isWriteable(var39, true)) {
						var7 = null;
					}
				}
			}

			if (var7 == null && var18 == 0) {
				label273:
				for (int var19 = 0; var19 < Script.cacheSubPaths.length; ++var19) {
					for (int var20 = 0; var20 < class243.cacheParentPaths.length; ++var20) {
						File var21 = new File(class243.cacheParentPaths[var20] + Script.cacheSubPaths[var19] + File.separatorChar + var0 + File.separatorChar);
						if (var21.exists() && Nameable.isWriteable(new File(var21, "test.dat"), true)) {
							var7 = var21.toString();
							var9 = true;
							break label273;
						}
					}
				}
			}

			if (var7 == null) {
				var7 = AccessFile.userHomeDirectory + File.separatorChar + "jagexcache" + var6 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
				var9 = true;
			}

			File var38;
			if (var8 != null) {
				var38 = new File(var8);
				var39 = new File(var7);

				try {
					File[] var41 = var38.listFiles();
					File[] var22 = var41;

					for (int var14 = 0; var14 < var22.length; ++var14) {
						File var15 = var22[var14];
						File var16 = new File(var39, var15.getName());
						boolean var17 = var15.renameTo(var16);
						if (!var17) {
							throw new IOException();
						}
					}
				} catch (Exception var33) {
					var33.printStackTrace();
				}

				var9 = true;
			}

			if (var9) {
				var38 = new File(var7);
				var11 = null;

				try {
					AccessFile var42 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L);
					Buffer var43 = new Buffer(500);
					var43.writeByte(3);
					var43.writeByte(var11 != null ? 1 : 0);
					var43.writeCESU8(var38.getPath());
					if (var11 != null) {
						var43.writeCESU8("");
					}

					var42.write(var43.array, 0, var43.offset);
					var42.close();
				} catch (IOException var28) {
					var28.printStackTrace();
				}
			}

			var5 = new File(var7);
			JagexCache.cacheDir = var5;
			if (!JagexCache.cacheDir.exists()) {
				JagexCache.cacheDir.mkdirs();
			}

			File[] var35 = JagexCache.cacheDir.listFiles();
			if (var35 != null) {
				File[] var40 = var35;

				for (int var23 = 0; var23 < var40.length; ++var23) {
					File var24 = var40[var23];
					if (!Nameable.isWriteable(var24, false)) {
						++var18;
						continue label298;
					}
				}
			}
			break;
		}

		File var4 = JagexCache.cacheDir;
		FileSystem.FileSystem_cacheDir = var4;
		if (!FileSystem.FileSystem_cacheDir.exists()) {
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true;

			try {
				var5 = new File(AccessFile.userHomeDirectory, "random.dat");
				int var26;
				if (var5.exists()) {
					JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var5, "rw", 25L), 24, 0);
				} else {
					label224:
					for (int var25 = 0; var25 < Script.cacheSubPaths.length; ++var25) {
						for (var26 = 0; var26 < class243.cacheParentPaths.length; ++var26) {
							File var37 = new File(class243.cacheParentPaths[var26] + Script.cacheSubPaths[var25] + File.separatorChar + "random.dat");
							if (var37.exists()) {
								JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var37, "rw", 25L), 24, 0);
								break label224;
							}
						}
					}
				}

				if (JagexCache.JagexCache_randomDat == null) {
					RandomAccessFile var36 = new RandomAccessFile(var5, "rw");
					var26 = var36.read();
					var36.seek(0L);
					var36.write(var26);
					var36.seek(0L);
					var36.close();
					JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var5, "rw", 25L), 24, 0);
				}
			} catch (IOException var32) {
			}

			JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(NPC.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
			JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(NPC.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
			class21.JagexCache_idxFiles = new BufferedFile[class124.idxCount];

			for (int var27 = 0; var27 < class124.idxCount; ++var27) {
				class21.JagexCache_idxFiles[var27] = new BufferedFile(new AccessFile(NPC.getFile("main_file_cache.idx" + var27), "rw", 1048576L), 6000, 0);
			}

		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljp;IB)Z",
		garbageValue = "-11"
	)
	static boolean method2465(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1);
		if (var2 == null) {
			return false;
		} else {
			class303.SpriteBuffer_decode(var2);
			return true;
		}
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "([Liv;II)V",
		garbageValue = "-1244597022"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null) {
				if (var3.type == 0) {
					if (var3.children != null) {
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
					if (var4 != null) {
						LoginType.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) {
					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onDialogAbort;
					class259.runScriptEvent(var5);
				}

				if (var1 == 1 && var3.onSubChange != null) {
					if (var3.childIndex >= 0) {
						Widget var6 = DevicePcmPlayerProvider.getWidget(var3.id);
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) {
							continue;
						}
					}

					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onSubChange;
					class259.runScriptEvent(var5);
				}
			}
		}

	}
}
