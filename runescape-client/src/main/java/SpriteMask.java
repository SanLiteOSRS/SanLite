import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 136807485
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1011180321
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("s")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("a")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1;
		this.height = var2;
		this.xWidths = var3;
		this.xStarts = var4;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "75"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) {
			int var3 = this.xStarts[var2];
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "-23"
	)
	static String method4998(int var0) {
		return "<img=" + var0 + ">";
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1302166518"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-404139593"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) {
			var2 = 1;
		}

		if (var3 < 1) {
			var3 = 1;
		}

		int var5 = var3 - 334;
		int var6;
		if (var5 < 0) {
			var6 = Client.field464;
		} else if (var5 >= 100) {
			var6 = Client.field550;
		} else {
			var6 = (Client.field550 - Client.field464) * var5 / 100 + Client.field464;
		}

		int var7 = var3 * var6 * 512 / (var2 * 334);
		int var8;
		int var9;
		short var15;
		if (var7 < Client.field729) {
			var15 = Client.field729;
			var6 = var15 * var2 * 334 / (var3 * 512);
			if (var6 > Client.field600) {
				var6 = Client.field600;
				var8 = var3 * var6 * 512 / (var15 * 334);
				var9 = (var2 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216);
				}

				var0 += var9;
				var2 -= var9 * 2;
			}
		} else if (var7 > Client.field730) {
			var15 = Client.field730;
			var6 = var15 * var2 * 334 / (var3 * 512);
			if (var6 < Client.field727) {
				var6 = Client.field727;
				var8 = var15 * var2 * 334 / (var6 * 512);
				var9 = (var3 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216);
				}

				var1 += var9;
				var3 -= var9 * 2;
			}
		}

		Client.viewportZoom = var3 * var6 / 334;
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) {
			int[] var14 = new int[9];

			for (var9 = 0; var9 < var14.length; ++var9) {
				int var10 = var9 * 32 + 15 + 128;
				int var11 = var10 * 3 + 600;
				int var13 = Rasterizer3D.Rasterizer3D_sine[var10];
				int var12 = class150.method2971(var11, var3);
				var14[var9] = var12 * var13 >> 16;
			}

			Scene.Scene_buildVisiblityMap(var14, 500, 800, var2 * 334 / var3, 334);
		}

		Client.viewportOffsetX = var0;
		Client.viewportOffsetY = var1;
		Client.viewportWidth = var2;
		Client.viewportHeight = var3;
	}
}
