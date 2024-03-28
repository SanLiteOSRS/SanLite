import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.io.File;
import java.io.RandomAccessFile;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
public enum class129 implements class391 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	field1548(0, 0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	field1546(1, 1),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	field1545(2, 2),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	field1547(3, 3),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	field1544(4, 4);

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lbg;"
	)
	@Export("pcmPlayerProvider")
	public static class51 pcmPlayerProvider;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1689495935
	)
	final int field1549;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1487275861
	)
	final int field1550;

	class129(int var3, int var4) {
		this.field1549 = var3; // L: 147
		this.field1550 = var4; // L: 148
	} // L: 149

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "800883718"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1550; // L: 152
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)Ljava/io/File;",
		garbageValue = "27943"
	)
	@Export("getFile")
	static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) { // L: 16
			throw new RuntimeException("");
		} else {
			File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0); // L: 17
			if (var1 != null) { // L: 18
				return var1;
			} else {
				File var2 = new File(FileSystem.FileSystem_cacheDir, var0); // L: 19
				RandomAccessFile var3 = null; // L: 20

				try {
					File var4 = new File(var2.getParent()); // L: 22
					if (!var4.exists()) {
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw");
						int var5 = var3.read(); // L: 25
						var3.seek(0L);
						var3.write(var5); // L: 27
						var3.seek(0L); // L: 28
						var3.close();
						FileSystem.FileSystem_cacheFiles.put(var0, var2); // L: 30
						return var2;
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) { // L: 35
							var3.close(); // L: 36
							var3 = null;
						}
					} catch (Exception var7) { // L: 40
					}

					throw new RuntimeException(); // L: 42
				}
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZI)V",
		garbageValue = "-910811303"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		if (var1) { // L: 23
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) { // L: 24
				try {
					Desktop.getDesktop().browse(new URI(var0)); // L: 26
					return; // L: 47
				} catch (Exception var4) { // L: 29
				}
			}

			if (class31.field150.startsWith("win")) { // L: 31
				class286.method5688(var0, 0); // L: 33
			} else if (class31.field150.startsWith("mac")) { // L: 37
				class360.method6859(var0, 1, "openjs"); // L: 38
			} else {
				class286.method5688(var0, 2); // L: 41
			}
		} else {
			class286.method5688(var0, 3); // L: 44
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-43"
	)
	public static boolean method3000(int var0) {
		return (var0 >> 21 & 1) != 0; // L: 21
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-47"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) { // L: 5809
			int var3 = Canvas.getTileHeight(var0, var1, class172.Client_plane) - var2; // L: 5814
			var0 -= WorldMapLabelSize.cameraX; // L: 5815
			var3 -= MouseHandler.cameraY; // L: 5816
			var1 -= class193.cameraZ; // L: 5817
			int var4 = Rasterizer3D.Rasterizer3D_sine[UserComparator10.cameraPitch]; // L: 5818
			int var5 = Rasterizer3D.Rasterizer3D_cosine[UserComparator10.cameraPitch]; // L: 5819
			int var6 = Rasterizer3D.Rasterizer3D_sine[class17.cameraYaw]; // L: 5820
			int var7 = Rasterizer3D.Rasterizer3D_cosine[class17.cameraYaw]; // L: 5821
			int var8 = var6 * var1 + var0 * var7 >> 16; // L: 5822
			var1 = var7 * var1 - var0 * var6 >> 16; // L: 5823
			var0 = var8; // L: 5824
			var8 = var5 * var3 - var4 * var1 >> 16; // L: 5825
			var1 = var4 * var3 + var5 * var1 >> 16; // L: 5826
			if (var1 >= 50) { // L: 5828
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2; // L: 5829
				Client.viewportTempY = var8 * Client.viewportZoom / var1 + Client.viewportHeight / 2; // L: 5830
			} else {
				Client.viewportTempX = -1; // L: 5833
				Client.viewportTempY = -1; // L: 5834
			}

		} else {
			Client.viewportTempX = -1; // L: 5810
			Client.viewportTempY = -1; // L: 5811
		}
	} // L: 5812 5836

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIIIILdi;I)V",
		garbageValue = "150568763"
	)
	static void method3005(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Player var13) {
		ObjectComposition var14 = MouseRecorder.getObjectDefinition(var6); // L: 8410
		int var15;
		int var16;
		if (var4 != 1 && var4 != 3) { // L: 8413
			var15 = var14.sizeX; // L: 8418
			var16 = var14.sizeY; // L: 8419
		} else {
			var15 = var14.sizeY; // L: 8414
			var16 = var14.sizeX; // L: 8415
		}

		int var17 = (var15 >> 1) + var1; // L: 8421
		int var18 = (var15 + 1 >> 1) + var1; // L: 8422
		int var19 = (var16 >> 1) + var2; // L: 8423
		int var20 = var2 + (var16 + 1 >> 1); // L: 8424
		int[][] var21 = Tiles.Tiles_heights[var0]; // L: 8425
		int var22 = var21[var18][var20] + var21[var17][var19] + var21[var18][var19] + var21[var17][var20] >> 2; // L: 8426
		int var23 = (var1 << 7) + (var15 << 6); // L: 8427
		int var24 = (var2 << 7) + (var16 << 6); // L: 8428
		Model var25 = var14.getModel(var3, var4, var21, var23, var22, var24); // L: 8429
		if (var25 != null) { // L: 8430
			class332.method6230(var0, var1, var2, var5, -1, 0, 0, 31, var7 + 1, var8 + 1); // L: 8431
			var13.animationCycleStart = var7 + Client.cycle; // L: 8432
			var13.animationCycleEnd = var8 + Client.cycle; // L: 8433
			var13.model0 = var25; // L: 8434
			var13.field1140 = var15 * 64 + var1 * 128; // L: 8435
			var13.field1137 = var2 * 128 + var16 * 64; // L: 8436
			var13.tileHeight2 = var22; // L: 8437
			int var26;
			if (var9 > var11) { // L: 8438
				var26 = var9; // L: 8439
				var9 = var11; // L: 8440
				var11 = var26; // L: 8441
			}

			if (var10 > var12) { // L: 8443
				var26 = var10; // L: 8444
				var10 = var12; // L: 8445
				var12 = var26; // L: 8446
			}

			var13.minX = var9 + var1; // L: 8448
			var13.maxX = var11 + var1; // L: 8449
			var13.minY = var10 + var2; // L: 8450
			var13.maxY = var2 + var12; // L: 8451
		}

	} // L: 8453
}
