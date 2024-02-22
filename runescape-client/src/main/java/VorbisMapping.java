import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bl")
@Implements("VorbisMapping")
public class VorbisMapping {
	@ObfuscatedName("aq")
	int field353;
	@ObfuscatedName("aw")
	int field352;
	@ObfuscatedName("al")
	int[] field354;
	@ObfuscatedName("ai")
	int[] field355;

	VorbisMapping() {
		class60 var1 = VorbisSample.field392; // L: 12
		var1.method1138(16); // L: 13
		this.field353 = var1.method1139() != 0 ? var1.method1138(4) + 1 : 1; // L: 14
		if (var1.method1139() != 0) { // L: 15
			var1.method1138(8); // L: 16
		}

		var1.method1138(2); // L: 19
		if (this.field353 > 1) { // L: 20
			this.field352 = var1.method1138(4); // L: 21
		}

		this.field354 = new int[this.field353]; // L: 23
		this.field355 = new int[this.field353]; // L: 24

		for (int var2 = 0; var2 < this.field353; ++var2) { // L: 25
			var1.method1138(8); // L: 26
			this.field354[var2] = var1.method1138(8); // L: 27
			this.field355[var2] = var1.method1138(8); // L: 28
		}

	} // L: 30
}
