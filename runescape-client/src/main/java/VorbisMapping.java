import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("br")
@Implements("VorbisMapping")
public class VorbisMapping {
	@ObfuscatedName("at")
	int field340;
	@ObfuscatedName("ah")
	int field341;
	@ObfuscatedName("ar")
	int[] field343;
	@ObfuscatedName("ao")
	int[] field342;

	VorbisMapping() {
		class60 var1 = VorbisSample.field359; // L: 12
		var1.method1187(16); // L: 13
		this.field340 = var1.method1188() != 0 ? var1.method1187(4) + 1 : 1; // L: 14
		if (var1.method1188() != 0) { // L: 15
			var1.method1187(8); // L: 16
		}

		var1.method1187(2); // L: 19
		if (this.field340 > 1) { // L: 20
			this.field341 = var1.method1187(4); // L: 21
		}

		this.field343 = new int[this.field340]; // L: 23
		this.field342 = new int[this.field340]; // L: 24

		for (int var2 = 0; var2 < this.field340; ++var2) { // L: 25
			var1.method1187(8); // L: 26
			this.field343[var2] = var1.method1187(8); // L: 27
			this.field342[var2] = var1.method1187(8); // L: 28
		}

	} // L: 30
}
