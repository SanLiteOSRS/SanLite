import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bv")
@Implements("VorbisMapping")
public class VorbisMapping {
	@ObfuscatedName("az")
	int field349;
	@ObfuscatedName("ah")
	int field347;
	@ObfuscatedName("af")
	int[] field348;
	@ObfuscatedName("at")
	int[] field346;

	VorbisMapping() {
		class60 var1 = VorbisSample.field365; // L: 12
		var1.method1123(16); // L: 13
		this.field349 = var1.method1124() != 0 ? var1.method1123(4) + 1 : 1; // L: 14
		if (var1.method1124() != 0) { // L: 15
			var1.method1123(8); // L: 16
		}

		var1.method1123(2); // L: 19
		if (this.field349 > 1) { // L: 20
			this.field347 = var1.method1123(4); // L: 21
		}

		this.field348 = new int[this.field349]; // L: 23
		this.field346 = new int[this.field349]; // L: 24

		for (int var2 = 0; var2 < this.field349; ++var2) { // L: 25
			var1.method1123(8); // L: 26
			this.field348[var2] = var1.method1123(8); // L: 27
			this.field346[var2] = var1.method1123(8); // L: 28
		}

	} // L: 30
}
