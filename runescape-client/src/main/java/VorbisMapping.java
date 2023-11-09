import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bs")
@Implements("VorbisMapping")
public class VorbisMapping {
	@ObfuscatedName("ai")
	int field356;
	@ObfuscatedName("aj")
	int field354;
	@ObfuscatedName("ac")
	int[] field357;
	@ObfuscatedName("aw")
	int[] field355;

	VorbisMapping() {
		class60 var1 = VorbisSample.field374; // L: 12
		var1.method1183(16); // L: 13
		this.field356 = var1.method1179() != 0 ? var1.method1183(4) + 1 : 1; // L: 14
		if (var1.method1179() != 0) { // L: 15
			var1.method1183(8); // L: 16
		}

		var1.method1183(2); // L: 19
		if (this.field356 > 1) { // L: 20
			this.field354 = var1.method1183(4); // L: 21
		}

		this.field357 = new int[this.field356]; // L: 23
		this.field355 = new int[this.field356]; // L: 24

		for (int var2 = 0; var2 < this.field356; ++var2) { // L: 25
			var1.method1183(8); // L: 26
			this.field357[var2] = var1.method1183(8); // L: 27
			this.field355[var2] = var1.method1183(8); // L: 28
		}

	} // L: 30
}
