import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("k")
	@Export("ByteArrayPool_alternativeSizes")
	static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = -579877889
	)
	@Export("port1")
	static int port1;
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = 604273715
	)
	@Export("port2")
	static int port2;
	@ObfuscatedName("lv")
	@ObfuscatedGetter(
		intValue = 1585489899
	)
	@Export("menuX")
	static int menuX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 252017765
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -865171177
	)
	@Export("x")
	public int x;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1194018723
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		signature = "(Lhw;)V"
	)
	public Coord(Coord var1) {
		this.plane = var1.plane;
		this.x = var1.x;
		this.y = var1.y;
	}

	public Coord(int var1, int var2, int var3) {
		this.plane = var1;
		this.x = var2;
		this.y = var3;
	}

	public Coord(int var1) {
		if (var1 == -1) {
			this.plane = -1;
		} else {
			this.plane = var1 >> 28 & 3;
			this.x = var1 >> 14 & 16383;
			this.y = var1 & 16383;
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-330056145"
	)
	@Export("packed")
	public int packed() {
		return this.plane << 28 | this.x << 14 | this.y;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(Lhw;I)Z",
		garbageValue = "824045461"
	)
	@Export("equalsCoord")
	boolean equalsCoord(Coord var1) {
		if (this.plane != var1.plane) {
			return false;
		} else if (this.x != var1.x) {
			return false;
		} else {
			return this.y == var1.y;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-40"
	)
	@Export("toString")
	String toString(String var1) {
		return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63);
	}

	public boolean equals(Object var1) {
		if (this == var1) {
			return true;
		} else {
			return !(var1 instanceof Coord) ? false : this.equalsCoord((Coord)var1);
		}
	}

	public int hashCode() {
		return this.packed();
	}

	public String toString() {
		return this.toString(",");
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		signature = "(IIIIZI)V",
		garbageValue = "1944404"
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
			var6 = Client.field873;
		} else if (var5 >= 100) {
			var6 = Client.field932;
		} else {
			var6 = (Client.field932 - Client.field873) * var5 / 100 + Client.field873;
		}

		int var7 = var3 * var6 * 512 / (var2 * 334);
		int var8;
		int var9;
		short var14;
		if (var7 < Client.field937) {
			var14 = Client.field937;
			var6 = var14 * var2 * 334 / (var3 * 512);
			if (var6 > Client.field753) {
				var6 = Client.field753;
				var8 = var3 * var6 * 512 / (var14 * 334);
				var9 = (var2 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216);
				}

				var0 += var9;
				var2 -= var9 * 2;
			}
		} else if (var7 > Client.field935) {
			var14 = Client.field935;
			var6 = var14 * var2 * 334 / (var3 * 512);
			if (var6 < Client.field865) {
				var6 = Client.field865;
				var8 = var14 * var2 * 334 / (var6 * 512);
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
			int[] var13 = new int[9];

			for (var9 = 0; var9 < var13.length; ++var9) {
				int var10 = var9 * 32 + 15 + 128;
				int var11 = MilliClock.method3587(var10);
				int var12 = Rasterizer3D.Rasterizer3D_sine[var10];
				var11 = HorizontalAlignment.method4876(var11, var3);
				var13[var9] = var11 * var12 >> 16;
			}

			Scene.Scene_buildVisiblityMap(var13, 500, 800, var2 * 334 / var3, 334);
		}

		Client.viewportOffsetX = var0;
		Client.viewportOffsetY = var1;
		Client.viewportWidth = var2;
		Client.viewportHeight = var3;
	}
}
