import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bt")
@Implements("VorbisMapping")
public class VorbisMapping {
	@ObfuscatedName("at")
	int field356;
	@ObfuscatedName("an")
	int field357;
	@ObfuscatedName("av")
	int[] field358;
	@ObfuscatedName("as")
	int[] field359;

	VorbisMapping() {
		class60 var1 = VorbisSample.field374; // L: 12
		var1.method1118(16); // L: 13
		this.field356 = var1.method1117() != 0 ? var1.method1118(4) + 1 : 1; // L: 14
		if (var1.method1117() != 0) { // L: 15
			var1.method1118(8); // L: 16
		}

		var1.method1118(2); // L: 19
		if (this.field356 > 1) { // L: 20
			this.field357 = var1.method1118(4); // L: 21
		}

		this.field358 = new int[this.field356]; // L: 23
		this.field359 = new int[this.field356]; // L: 24

		for (int var2 = 0; var2 < this.field356; ++var2) { // L: 25
			var1.method1118(8); // L: 26
			this.field358[var2] = var1.method1118(8); // L: 27
			this.field359[var2] = var1.method1118(8); // L: 28
		}

	} // L: 30
}
