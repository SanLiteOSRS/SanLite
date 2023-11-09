import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ms")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("km")
	@ObfuscatedGetter(
		intValue = -2062596961
	)
	@Export("cameraYaw")
	static int cameraYaw;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 399870751
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -449650399
	)
	@Export("x")
	public int x;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 53686167
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		descriptor = "(Lms;)V"
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
		if (var1 == -1) {
			this.plane = -1;
		} else {
			this.plane = var1 >> 28 & 3;
			this.x = var1 >> 14 & 16383;
			this.y = var1 & 16383;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-110"
	)
	@Export("packed")
	public int packed() {
		return WorldMapSection1.method5518(this.plane, this.x, this.y); // L: 30
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lms;B)Z",
		garbageValue = "41"
	)
	@Export("equalsCoord")
	boolean equalsCoord(Coord var1) {
		if (this.plane != var1.plane) { // L: 45
			return false;
		} else if (this.x != var1.x) { // L: 46
			return false;
		} else {
			return this.y == var1.y; // L: 47
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1861962783"
	)
	@Export("toString")
	String toString(String var1) {
		return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63); // L: 61
	}

	public boolean equals(Object var1) {
		if (this == var1) { // L: 39
			return true;
		} else {
			return !(var1 instanceof Coord) ? false : this.equalsCoord((Coord)var1); // L: 40 41
		}
	}

	public String toString() {
		return this.toString(","); // L: 57
	}

	public int hashCode() {
		return this.packed(); // L: 53
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfj;",
		garbageValue = "987109083"
	)
	static class130[] method6086() {
		return new class130[]{class130.field1538, class130.field1529, class130.field1537, class130.field1528, class130.field1530, class130.field1533}; // L: 25
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lsx;",
		garbageValue = "-98160579"
	)
	public static class490 method6069(int var0) {
		int var1 = class488.field4966[var0]; // L: 19
		if (var1 == 1) { // L: 20
			return class490.field4981; // L: 21
		} else if (var1 == 2) { // L: 23
			return class490.field4975; // L: 24
		} else {
			return var1 == 3 ? class490.field4974 : null; // L: 26 27 29
		}
	}
}
