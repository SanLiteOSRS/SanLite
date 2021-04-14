import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("o")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096];
	}

	WorldMapSprite(int[] var1) {
		this.tileColors = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(IIB)I",
		garbageValue = "-92"
	)
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var2 * 64 + var1];
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-2142917261"
	)
	static final void method3108() {
		if (!ViewportMouse.ViewportMouse_false0) {
			int var0 = Scene.Scene_cameraPitchSine;
			int var1 = Scene.Scene_cameraPitchCosine;
			int var2 = Scene.Scene_cameraYawSine;
			int var3 = Scene.Scene_cameraYawCosine;
			byte var4 = 50;
			short var5 = 3500;
			int var6 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var4 / Rasterizer3D.Rasterizer3D_zoom;
			int var7 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var4 / Rasterizer3D.Rasterizer3D_zoom;
			int var8 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var5 / Rasterizer3D.Rasterizer3D_zoom;
			int var9 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var5 / Rasterizer3D.Rasterizer3D_zoom;
			int var10 = Rasterizer3D.method3400(var7, var4, var1, var0);
			int var11 = Rasterizer3D.method3367(var7, var4, var1, var0);
			var7 = var10;
			var10 = Rasterizer3D.method3400(var9, var5, var1, var0);
			int var12 = Rasterizer3D.method3367(var9, var5, var1, var0);
			var9 = var10;
			var10 = Rasterizer3D.method3379(var6, var11, var3, var2);
			var11 = Rasterizer3D.method3380(var6, var11, var3, var2);
			var6 = var10;
			var10 = Rasterizer3D.method3379(var8, var12, var3, var2);
			var12 = Rasterizer3D.method3380(var8, var12, var3, var2);
			UserComparator10.field1439 = (var10 + var6) / 2;
			MusicPatchPcmStream.field2544 = (var7 + var9) / 2;
			WorldMapLabelSize.field1568 = (var11 + var12) / 2;
			ViewportMouse.field2135 = (var10 - var6) / 2;
			ViewportMouse.field2136 = (var9 - var7) / 2;
			Varps.field2580 = (var12 - var11) / 2;
			Login.field1018 = Math.abs(ViewportMouse.field2135);
			ViewportMouse.field2137 = Math.abs(ViewportMouse.field2136);
			class24.field189 = Math.abs(Varps.field2580);
		}
	}
}
