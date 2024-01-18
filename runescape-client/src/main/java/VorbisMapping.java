import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bz")
@Implements("VorbisMapping")
public class VorbisMapping {
	@ObfuscatedName("am")
	int field360;
	@ObfuscatedName("ap")
	int field358;
	@ObfuscatedName("af")
	int[] field359;
	@ObfuscatedName("aj")
	int[] field357;

	VorbisMapping() {
		class60 var1 = VorbisSample.field376; // L: 12
		var1.method1188(16); // L: 13
		this.field360 = var1.method1189() != 0 ? var1.method1188(4) + 1 : 1; // L: 14
		if (var1.method1189() != 0) { // L: 15
			var1.method1188(8); // L: 16
		}

		var1.method1188(2); // L: 19
		if (this.field360 > 1) { // L: 20
			this.field358 = var1.method1188(4); // L: 21
		}

		this.field359 = new int[this.field360]; // L: 23
		this.field357 = new int[this.field360]; // L: 24

		for (int var2 = 0; var2 < this.field360; ++var2) { // L: 25
			var1.method1188(8); // L: 26
			this.field359[var2] = var1.method1188(8); // L: 27
			this.field357[var2] = var1.method1188(8); // L: 28
		}

	} // L: 30
}
