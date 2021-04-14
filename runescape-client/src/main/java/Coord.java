import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("ov")
	@ObfuscatedSignature(
		signature = "Lmk;"
	)
	static class338 field2591;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -227225909
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -2147189971
	)
	@Export("x")
	public int x;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 5380173
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		signature = "(Lhk;)V"
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
		garbageValue = "-1365130911"
	)
	@Export("packed")
	public int packed() {
		return this.plane << 28 | this.x << 14 | this.y;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lhk;I)Z",
		garbageValue = "-1711331725"
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-9"
	)
	@Export("toString")
	String toString(String var1) {
		return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63);
	}

	public int hashCode() {
		return this.packed();
	}

	public boolean equals(Object var1) {
		if (this == var1) {
			return true;
		} else {
			return !(var1 instanceof Coord) ? false : this.equalsCoord((Coord)var1);
		}
	}

	public String toString() {
		return this.toString(",");
	}
}
