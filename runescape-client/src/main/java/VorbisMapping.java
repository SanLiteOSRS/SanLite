import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bj")
@Implements("VorbisMapping")
public class VorbisMapping {
	@ObfuscatedName("ay")
	int field342;
	@ObfuscatedName("an")
	int field344;
	@ObfuscatedName("ar")
	int[] field341;
	@ObfuscatedName("ab")
	int[] field343;

	VorbisMapping() {
		class60 var1 = VorbisSample.field354; // L: 12
		var1.method1141(16); // L: 13
		this.field342 = var1.method1145() != 0 ? var1.method1141(4) + 1 : 1; // L: 14
		if (var1.method1145() != 0) { // L: 15
			var1.method1141(8); // L: 16
		}

		var1.method1141(2); // L: 19
		if (this.field342 > 1) { // L: 20
			this.field344 = var1.method1141(4); // L: 21
		}

		this.field341 = new int[this.field342]; // L: 23
		this.field343 = new int[this.field342]; // L: 24

		for (int var2 = 0; var2 < this.field342; ++var2) { // L: 25
			var1.method1141(8); // L: 26
			this.field341[var2] = var1.method1141(8); // L: 27
			this.field343[var2] = var1.method1141(8); // L: 28
		}

	} // L: 30
}
