import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bc")
@Implements("VorbisMapping")
public class VorbisMapping {
	@ObfuscatedName("au")
	int field375;
	@ObfuscatedName("ae")
	int field374;
	@ObfuscatedName("ao")
	int[] field376;
	@ObfuscatedName("at")
	int[] field377;

	VorbisMapping() {
		class60 var1 = VorbisSample.field393; // L: 12
		var1.method1161(16); // L: 13
		this.field375 = var1.method1162() != 0 ? var1.method1161(4) + 1 : 1; // L: 14
		if (var1.method1162() != 0) { // L: 15
			var1.method1161(8); // L: 16
		}

		var1.method1161(2); // L: 19
		if (this.field375 > 1) { // L: 20
			this.field374 = var1.method1161(4); // L: 21
		}

		this.field376 = new int[this.field375]; // L: 23
		this.field377 = new int[this.field375]; // L: 24

		for (int var2 = 0; var2 < this.field375; ++var2) { // L: 25
			var1.method1161(8); // L: 26
			this.field376[var2] = var1.method1161(8); // L: 27
			this.field377[var2] = var1.method1161(8); // L: 28
		}

	} // L: 30
}
