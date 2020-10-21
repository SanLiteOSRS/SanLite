import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -877871317
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1594066417
	)
	@Export("x")
	public int x;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1889586591
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		signature = "(Lhg;)V"
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "-78"
	)
	@Export("packed")
	public int packed() {
		return this.plane << 28 | this.x << 14 | this.y;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Lhg;I)Z",
		garbageValue = "24386397"
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "0"
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(IIB)I",
		garbageValue = "-34"
	)
	static final int method4083(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		signature = "(Lcg;B)V",
		garbageValue = "115"
	)
	static final void method4084(Actor var0) {
		int var1 = Math.max(1, var0.field1026 - Client.cycle);
		int var2 = var0.field997 * 128 + var0.field1014 * 64;
		int var3 = var0.field1016 * 128 + var0.field1014 * 64;
		var0.x += (var2 - var0.x) / var1;
		var0.y += (var3 - var0.y) / var1;
		var0.field1032 = 0;
		var0.orientation = var0.field1027;
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		signature = "(Lcg;IB)V",
		garbageValue = "-77"
	)
	static final void method4086(Actor var0, int var1) {
		class89.worldToScreen(var0.x, var0.y, var1);
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		signature = "(IIIILlp;Lhz;I)V",
		garbageValue = "-334370993"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2;
		if (var6 > 4225 && var6 < 90000) {
			int var7 = Client.camAngleY & 2047;
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7];
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7];
			int var10 = var9 * var2 + var3 * var8 >> 16;
			int var11 = var3 * var9 - var8 * var2 >> 16;
			double var12 = Math.atan2((double)var10, (double)var11);
			int var14 = var5.width / 2 - 25;
			int var15 = (int)(Math.sin(var12) * (double)var14);
			int var16 = (int)(Math.cos(var12) * (double)var14);
			byte var17 = 20;
			FontName.redHintArrowSprite.method6264(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
		} else {
			HealthBar.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5);
		}

	}
}
