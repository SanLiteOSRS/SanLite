import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mc")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("aa")
	@Export("SpriteBuffer_pixels")
	static byte[][] SpriteBuffer_pixels;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 963031109
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1225451183
	)
	@Export("x")
	public int x;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1843528111
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		descriptor = "(Lmc;)V"
	)
	public Coord(Coord var1) {
		this.plane = var1.plane; // L: 15
		this.x = var1.x; // L: 16
		this.y = var1.y; // L: 17
	} // L: 18

	public Coord(int var1, int var2, int var3) {
		this.plane = var1; // L: 9
		this.x = var2; // L: 10
		this.y = var3; // L: 11
	} // L: 12

	public Coord(int var1) {
		if (var1 == -1) { // L: 21
			this.plane = -1;
		} else {
			this.plane = var1 >> 28 & 3; // L: 23
			this.x = var1 >> 14 & 16383; // L: 24
			this.y = var1 & 16383; // L: 25
		}

	} // L: 27

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1852623783"
	)
	@Export("packed")
	public int packed() {
		int var2 = this.plane; // L: 31
		int var3 = this.x; // L: 32
		int var4 = this.y; // L: 33
		int var1 = var2 << 28 | var3 << 14 | var4; // L: 35
		return var1; // L: 37
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lmc;B)Z",
		garbageValue = "-109"
	)
	@Export("equalsCoord")
	boolean equalsCoord(Coord var1) {
		if (this.plane != var1.plane) { // L: 48
			return false;
		} else if (this.x != var1.x) { // L: 49
			return false;
		} else {
			return this.y == var1.y; // L: 50
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1357161194"
	)
	@Export("toString")
	String toString(String var1) {
		return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63); // L: 64
	}

	public boolean equals(Object var1) {
		if (this == var1) { // L: 42
			return true;
		} else {
			return !(var1 instanceof Coord) ? false : this.equalsCoord((Coord)var1); // L: 43 44
		}
	}

	public int hashCode() {
		return this.packed(); // L: 56
	}

	public String toString() {
		return this.toString(","); // L: 60
	}
}
