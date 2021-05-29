import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ar")
public final class class32 {
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -812894805
	)
	@Export("musicTrackGroupId")
	public static int musicTrackGroupId;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 646214551
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	static Archive field242;

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(Lce;IIB)V",
		garbageValue = "-92"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) {
			int var3 = LoginScreenAnimation.SequenceDefinition_get(var1).field1891;
			if (var3 == 1) {
				var0.sequenceFrame = 0;
				var0.sequenceFrameCycle = 0;
				var0.sequenceDelay = var2;
				var0.field1245 = 0;
			}

			if (var3 == 2) {
				var0.field1245 = 0;
			}
		} else if (var1 == -1 || var0.sequence == -1 || LoginScreenAnimation.SequenceDefinition_get(var1).field1885 >= LoginScreenAnimation.SequenceDefinition_get(var0.sequence).field1885) {
			var0.sequence = var1;
			var0.sequenceFrame = 0;
			var0.sequenceFrameCycle = 0;
			var0.sequenceDelay = var2;
			var0.field1245 = 0;
			var0.field1274 = var0.pathLength;
		}

	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	static final int method305() {
		if (ObjectComposition.clientPreferences.roofsHidden) {
			return class22.Client_plane;
		} else {
			int var0 = class105.getTileHeight(MouseHandler.cameraX, class105.cameraZ, class22.Client_plane);
			return var0 - SecureRandomCallable.cameraY < 800 && (Tiles.Tiles_renderFlags[class22.Client_plane][MouseHandler.cameraX >> 7][class105.cameraZ >> 7] & 4) != 0 ? class22.Client_plane : 3;
		}
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "126"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		Player.scrollBarSprites[0].drawAt(var0, var1);
		Player.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field704);
		int var5 = var3 * (var3 - 32) / var4;
		if (var5 < 8) {
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field705);
		Rasterizer2D.method6866(var0, var6 + var1 + 16, var5, Client.field707);
		Rasterizer2D.method6866(var0 + 1, var6 + var1 + 16, var5, Client.field707);
		Rasterizer2D.method6917(var0, var6 + var1 + 16, 16, Client.field707);
		Rasterizer2D.method6917(var0, var6 + var1 + 17, 16, Client.field707);
		Rasterizer2D.method6866(var0 + 15, var6 + var1 + 16, var5, Client.field706);
		Rasterizer2D.method6866(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field706);
		Rasterizer2D.method6917(var0, var6 + var5 + var1 + 15, 16, Client.field706);
		Rasterizer2D.method6917(var0 + 1, var6 + var5 + var1 + 14, 15, Client.field706);
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "-20"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Clock.loadInterface(var0)) {
			WorldMapManager.updateInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6);
		}
	}
}
