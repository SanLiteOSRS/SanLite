import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bg")
@Implements("VorbisMapping")
public class VorbisMapping {
	@ObfuscatedName("aw")
	int field383;
	@ObfuscatedName("ay")
	int field381;
	@ObfuscatedName("ar")
	int[] field380;
	@ObfuscatedName("am")
	int[] field382;

	VorbisMapping() {
		class60 var1 = VorbisSample.field415; // L: 12
		var1.method1184(16); // L: 13
		this.field383 = var1.method1185() != 0 ? var1.method1184(4) + 1 : 1; // L: 14
		if (var1.method1185() != 0) { // L: 15
			var1.method1184(8); // L: 16
		}

		var1.method1184(2); // L: 19
		if (this.field383 > 1) { // L: 20
			this.field381 = var1.method1184(4); // L: 21
		}

		this.field380 = new int[this.field383]; // L: 23
		this.field382 = new int[this.field383]; // L: 24

		for (int var2 = 0; var2 < this.field383; ++var2) { // L: 25
			var1.method1184(8); // L: 26
			this.field380[var2] = var1.method1184(8); // L: 27
			this.field382[var2] = var1.method1184(8); // L: 28
		}

	} // L: 30
}
