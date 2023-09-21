import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bq")
@Implements("VorbisMapping")
public class VorbisMapping {
	@ObfuscatedName("ac")
	int field371;
	@ObfuscatedName("al")
	int field370;
	@ObfuscatedName("ak")
	int[] field372;
	@ObfuscatedName("ax")
	int[] field369;

	VorbisMapping() {
		class60 var1 = VorbisSample.field405; // L: 12
		var1.method1171(16); // L: 13
		this.field371 = var1.method1172() != 0 ? var1.method1171(4) + 1 : 1; // L: 14
		if (var1.method1172() != 0) { // L: 15
			var1.method1171(8); // L: 16
		}

		var1.method1171(2); // L: 19
		if (this.field371 > 1) { // L: 20
			this.field370 = var1.method1171(4); // L: 21
		}

		this.field372 = new int[this.field371]; // L: 23
		this.field369 = new int[this.field371]; // L: 24

		for (int var2 = 0; var2 < this.field371; ++var2) { // L: 25
			var1.method1171(8); // L: 26
			this.field372[var2] = var1.method1171(8); // L: 27
			this.field369[var2] = var1.method1171(8); // L: 28
		}

	} // L: 30
}
