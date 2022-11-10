import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
public class class277 {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Llg;I)V",
		garbageValue = "596204584"
	)
	public static void method5401(AbstractArchive var0) {
		class11.ParamDefinition_archive = var0; // L: 21
	} // L: 22

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(IIIILri;Lkl;B)V",
		garbageValue = "90"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) { // L: 12472
			int var6 = Client.camAngleY & 2047; // L: 12473
			int var7 = var3 * var3 + var2 * var2; // L: 12474
			if (var7 <= 6400) { // L: 12475
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 12476
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 12477
				int var10 = var9 * var2 + var3 * var8 >> 16; // L: 12478
				int var11 = var3 * var9 - var8 * var2 >> 16; // L: 12479
				if (var7 > 2500) {
					var4.method8851(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths); // L: 12480
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2); // L: 12481
				}

			}
		}
	} // L: 12482
}
