import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("c")
public enum class7 implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lc;"
	)
	field26(0, 0);

	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -2134453371
	)
	@Export("clientTickTimeIdx")
	static int clientTickTimeIdx;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 655499637
	)
	final int field23;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 299082675
	)
	final int field24;

	class7(int var3, int var4) {
		this.field23 = var3;
		this.field24 = var4;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "23"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field24;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "1670201823"
	)
	public static boolean method108(int var0) {
		return var0 == WorldMapDecorationType.field2768.id;
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		signature = "(IIIIIIII)V",
		garbageValue = "-1921843394"
	)
	static final void method112(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		var5 = HorizontalAlignment.method4876(var5, var6);
		int var7 = 2048 - var3 & 2047;
		int var8 = 2048 - var4 & 2047;
		int var9 = 0;
		int var10 = 0;
		int var11 = var5;
		int var12;
		int var13;
		int var14;
		if (var7 != 0) {
			var12 = Rasterizer3D.Rasterizer3D_sine[var7];
			var13 = Rasterizer3D.Rasterizer3D_cosine[var7];
			var14 = var13 * var10 - var5 * var12 >> 16;
			var11 = var13 * var5 + var12 * var10 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			var12 = Rasterizer3D.Rasterizer3D_sine[var8];
			var13 = Rasterizer3D.Rasterizer3D_cosine[var8];
			var14 = var11 * var12 + var13 * var9 >> 16;
			var11 = var13 * var11 - var9 * var12 >> 16;
			var9 = var14;
		}

		ItemContainer.cameraX = var0 - var9;
		ChatChannel.cameraY = var1 - var10;
		WorldMapManager.cameraZ = var2 - var11;
		World.cameraPitch = var3;
		ViewportMouse.cameraYaw = var4;
		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (TileItem.oculusOrbFocalPointX >> 7 != PlayerType.localPlayer.x >> 7 || Interpreter.oculusOrbFocalPointY >> 7 != PlayerType.localPlayer.y >> 7)) {
			var12 = PlayerType.localPlayer.plane;
			var13 = FloorDecoration.baseX * 64 + (TileItem.oculusOrbFocalPointX >> 7);
			var14 = WorldMapData_0.baseY * 64 + (Interpreter.oculusOrbFocalPointY >> 7);
			class2.method42(var13, var14, var12, true);
		}

	}
}
