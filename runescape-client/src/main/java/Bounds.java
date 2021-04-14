import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("bh")
	@Export("otp")
	static String otp;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -745325341
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -356491535
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1775559987
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 877483017
	)
	@Export("highY")
	public int highY;

	public Bounds(int var1, int var2, int var3, int var4) {
		this.setLow(var1, var2);
		this.setHigh(var3, var4);
	}

	public Bounds(int var1, int var2) {
		this(0, 0, var1, var2);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(IIS)V",
		garbageValue = "-32383"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1;
		this.lowY = var2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(IIB)V",
		garbageValue = "2"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1;
		this.highY = var2;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Llj;Llj;I)V",
		garbageValue = "-281933087"
	)
	public void method5954(Bounds var1, Bounds var2) {
		this.method5955(var1, var2);
		this.method5960(var1, var2);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(Llj;Llj;I)V",
		garbageValue = "-1998327311"
	)
	void method5955(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX;
		var2.highX = this.highX;
		if (this.lowX < var1.lowX) {
			var2.highX -= var1.lowX - this.lowX;
			var2.lowX = var1.lowX;
		}

		if (var2.method5957() > var1.method5957()) {
			var2.highX -= var2.method5957() - var1.method5957();
		}

		if (var2.highX < 0) {
			var2.highX = 0;
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(Llj;Llj;I)V",
		garbageValue = "-1461929335"
	)
	void method5960(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY;
		var2.highY = this.highY;
		if (this.lowY < var1.lowY) {
			var2.highY -= var1.lowY - this.lowY;
			var2.lowY = var1.lowY;
		}

		if (var2.method5958() > var1.method5958()) {
			var2.highY -= var2.method5958() - var1.method5958();
		}

		if (var2.highY < 0) {
			var2.highY = 0;
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "0"
	)
	int method5957() {
		return this.lowX + this.highX;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1442149182"
	)
	int method5958() {
		return this.lowY + this.highY;
	}

	public String toString() {
		return null;
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		signature = "(IIIIZI)V",
		garbageValue = "-1536625645"
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
			var6 = Client.field855;
		} else if (var5 >= 100) {
			var6 = Client.field856;
		} else {
			var6 = (Client.field856 - Client.field855) * var5 / 100 + Client.field855;
		}

		int var7 = var3 * var6 * 512 / (var2 * 334);
		int var8;
		int var9;
		short var17;
		if (var7 < Client.field707) {
			var17 = Client.field707;
			var6 = var17 * var2 * 334 / (var3 * 512);
			if (var6 > Client.field742) {
				var6 = Client.field742;
				var8 = var3 * var6 * 512 / (var17 * 334);
				var9 = (var2 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216);
				}

				var0 += var9;
				var2 -= var9 * 2;
			}
		} else if (var7 > Client.field862) {
			var17 = Client.field862;
			var6 = var17 * var2 * 334 / (var3 * 512);
			if (var6 < Client.field859) {
				var6 = Client.field859;
				var8 = var17 * var2 * 334 / (var6 * 512);
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
			int[] var16 = new int[9];

			for (var9 = 0; var9 < var16.length; ++var9) {
				int var10 = var9 * 32 + 15 + 128;
				int var11 = WorldMapID.method3116(var10);
				int var12 = Rasterizer3D.Rasterizer3D_sine[var10];
				int var14 = var3 - 334;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 100) {
					var14 = 100;
				}

				int var15 = (Client.zoomWidth - Client.zoomHeight) * var14 / 100 + Client.zoomHeight;
				int var13 = var11 * var15 / 256;
				var16[var9] = var12 * var13 >> 16;
			}

			Scene.Scene_buildVisiblityMap(var16, 500, 800, var2 * 334 / var3, 334);
		}

		Client.viewportOffsetX = var0;
		Client.viewportOffsetY = var1;
		Client.viewportWidth = var2;
		Client.viewportHeight = var3;
	}
}
