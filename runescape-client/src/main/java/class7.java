import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("d")
public class class7 {
	@ObfuscatedName("vx")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	static Archive field32;
	@ObfuscatedName("a")
	ExecutorService field25;
	@ObfuscatedName("f")
	Future field33;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	final Buffer field27;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	final class3 field28;

	@ObfuscatedSignature(
		descriptor = "(Lqr;Lx;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field25 = Executors.newSingleThreadExecutor(); // L: 10
		this.field27 = var1; // L: 16
		this.field28 = var2; // L: 17
		this.method46(); // L: 18
	} // L: 19

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "417065643"
	)
	public boolean method33() {
		return this.field33.isDone(); // L: 22
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-23"
	)
	public void method34() {
		this.field25.shutdown(); // L: 26
		this.field25 = null; // L: 27
	} // L: 28

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Lqr;",
		garbageValue = "1477518174"
	)
	public Buffer method35() {
		try {
			return (Buffer)this.field33.get(); // L: 32
		} catch (Exception var2) { // L: 34
			return null; // L: 35
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "81"
	)
	void method46() {
		this.field33 = this.field25.submit(new class1(this, this.field27, this.field28));
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IS)Ljava/io/File;",
		garbageValue = "180"
	)
	public static File method50(String var0, String var1, int var2) {
		String var3 = var2 == 0 ? "" : "" + var2; // L: 40
		JagexCache.JagexCache_locationFile = new File(class37.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat"); // L: 41
		String var4 = null; // L: 42
		String var5 = null; // L: 43
		boolean var6 = false; // L: 44
		Buffer var8;
		File var26;
		if (JagexCache.JagexCache_locationFile.exists()) { // L: 45
			try {
				AccessFile var7 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L); // L: 48

				int var9;
				for (var8 = new Buffer((int)var7.length()); var8.offset < var8.array.length; var8.offset += var9) { // L: 49 50 53
					var9 = var7.read(var8.array, var8.offset, var8.array.length - var8.offset); // L: 51
					if (var9 == -1) { // L: 52
						throw new IOException();
					}
				}

				var8.offset = 0; // L: 55
				var9 = var8.readUnsignedByte(); // L: 56
				if (var9 < 1 || var9 > 3) { // L: 57
					throw new IOException("" + var9);
				}

				int var10 = 0; // L: 58
				if (var9 > 1) { // L: 59
					var10 = var8.readUnsignedByte();
				}

				if (var9 <= 2) { // L: 60
					var4 = var8.readStringCp1252NullCircumfixed(); // L: 61
					if (var10 == 1) { // L: 62
						var5 = var8.readStringCp1252NullCircumfixed();
					}
				} else {
					var4 = var8.readCESU8(); // L: 65
					if (var10 == 1) { // L: 66
						var5 = var8.readCESU8();
					}
				}

				var7.close(); // L: 68
			} catch (IOException var24) { // L: 70
				var24.printStackTrace(); // L: 71
			}

			if (var4 != null) { // L: 73
				var26 = new File(var4); // L: 74
				if (!var26.exists()) { // L: 75
					var4 = null; // L: 76
				}
			}

			if (var4 != null) { // L: 79
				var26 = new File(var4, "test.dat"); // L: 80
				if (!class31.method464(var26, true)) { // L: 81
					var4 = null; // L: 82
				}
			}
		}

		if (var4 == null && var2 == 0) { // L: 86
			label147:
			for (int var15 = 0; var15 < AbstractWorldMapIcon.cacheSubPaths.length; ++var15) { // L: 87
				for (int var16 = 0; var16 < GrandExchangeOffer.cacheParentPaths.length; ++var16) { // L: 88
					File var17 = new File(GrandExchangeOffer.cacheParentPaths[var16] + AbstractWorldMapIcon.cacheSubPaths[var15] + File.separatorChar + var0 + File.separatorChar); // L: 89
					if (var17.exists()) { // L: 90
						File var11 = new File(var17, "test.dat"); // L: 92

						boolean var27;
						try {
							RandomAccessFile var12 = new RandomAccessFile(var11, "rw"); // L: 95
							int var13 = var12.read(); // L: 96
							var12.seek(0L); // L: 97
							var12.write(var13); // L: 98
							var12.seek(0L); // L: 99
							var12.close(); // L: 100
							var11.delete(); // L: 101
							var27 = true; // L: 102
						} catch (Exception var22) { // L: 104
							var27 = false; // L: 105
						}

						if (var27) { // L: 108
							var4 = var17.toString(); // L: 109
							var6 = true; // L: 110
							break label147; // L: 111
						}
					}
				}
			}
		}

		if (var4 == null) { // L: 117
			var4 = class37.userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar; // L: 118
			var6 = true; // L: 119
		}

		File var25;
		if (var5 != null) { // L: 121
			var25 = new File(var5); // L: 122
			var26 = new File(var4); // L: 123

			try {
				File[] var29 = var25.listFiles(); // L: 125
				File[] var18 = var29; // L: 127

				for (int var19 = 0; var19 < var18.length; ++var19) { // L: 128
					File var28 = var18[var19]; // L: 129
					File var20 = new File(var26, var28.getName()); // L: 131
					boolean var14 = var28.renameTo(var20); // L: 132
					if (!var14) { // L: 133
						throw new IOException();
					}
				}
			} catch (Exception var23) { // L: 138
				var23.printStackTrace(); // L: 139
			}

			var6 = true; // L: 141
		}

		if (var6) { // L: 143
			var25 = new File(var4); // L: 144
			var8 = null; // L: 145

			try {
				AccessFile var30 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L); // L: 149
				Buffer var31 = new Buffer(500); // L: 150
				var31.writeByte(3); // L: 151
				var31.writeByte(var8 != null ? 1 : 0); // L: 152
				var31.writeCESU8(var25.getPath()); // L: 153
				if (var8 != null) { // L: 154
					var31.writeCESU8("");
				}

				var30.write(var31.array, 0, var31.offset); // L: 155
				var30.close(); // L: 156
			} catch (IOException var21) { // L: 158
				var21.printStackTrace(); // L: 159
			}
		}

		return new File(var4); // L: 163
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-673824409"
	)
	static int method49(int var0, Script var1, boolean var2) {
		return 2; // L: 3081
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(Lkn;IIIIIII)V",
		garbageValue = "-1273062084"
	)
	static final void method32(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field571) { // L: 10942
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0; // L: 10943
		}

		Client.field571 = false; // L: 10944
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !class82.mouseCam && MouseHandler.MouseHandler_currentButton == 4) { // L: 10945
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) { // L: 10946
				var0.scrollY -= 4; // L: 10947
				class143.invalidateWidget(var0); // L: 10948
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) { // L: 10950
				var0.scrollY += 4; // L: 10951
				class143.invalidateWidget(var0); // L: 10952
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) { // L: 10954
				var7 = var3 * (var3 - 32) / var4; // L: 10955
				if (var7 < 8) { // L: 10956
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2; // L: 10957
				int var9 = var3 - 32 - var7; // L: 10958
				var0.scrollY = var8 * (var4 - var3) / var9; // L: 10959
				class143.invalidateWidget(var0); // L: 10960
				Client.field571 = true; // L: 10961
			}
		}

		if (Client.mouseWheelRotation != 0) { // L: 10964
			var7 = var0.width; // L: 10965
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) { // L: 10966
				var0.scrollY += Client.mouseWheelRotation * 45; // L: 10967
				class143.invalidateWidget(var0); // L: 10968
			}
		}

	} // L: 10971

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(Lck;ZI)V",
		garbageValue = "563332048"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group; // L: 12323
		int var3 = (int)var0.key; // L: 12324
		var0.remove(); // L: 12325
		if (var1) { // L: 12326
			WorldMapAreaData.method5265(var2);
		}

		class144.method3062(var2); // L: 12327
		Widget var4 = class281.getWidget(var3); // L: 12328
		if (var4 != null) { // L: 12329
			class143.invalidateWidget(var4);
		}

		if (Client.rootInterface != -1) { // L: 12330
			DecorativeObject.runIntfCloseListeners(Client.rootInterface, 1);
		}

	} // L: 12331
}
