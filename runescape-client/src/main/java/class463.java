import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ro")
public class class463 {
	@ObfuscatedName("oh")
	@ObfuscatedGetter(
		intValue = 1023330421
	)
	@Export("menuY")
	static int menuY;
	@ObfuscatedName("ac")
	float field4772;
	@ObfuscatedName("al")
	float field4770;
	@ObfuscatedName("ak")
	float field4769;

	static {
		new class463(0.0F, 0.0F, 0.0F); // L: 5
		new class463(1.0F, 1.0F, 1.0F); // L: 9
		new class463(1.0F, 0.0F, 0.0F); // L: 13
		new class463(0.0F, 1.0F, 0.0F); // L: 17
		new class463(0.0F, 0.0F, 1.0F); // L: 21
		NPC.method2641(100); // L: 25
	} // L: 26

	class463(float var1, float var2, float var3) {
		this.field4772 = var1; // L: 35
		this.field4770 = var2; // L: 36
		this.field4769 = var3; // L: 37
	} // L: 38

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "-718087487"
	)
	final float method8309() {
		return (float)Math.sqrt((double)(this.field4772 * this.field4772 + this.field4770 * this.field4770 + this.field4769 * this.field4769)); // L: 41
	}

	public String toString() {
		return this.field4772 + ", " + this.field4770 + ", " + this.field4769; // L: 46
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lnm;S)Ljava/lang/String;",
		garbageValue = "-26996"
	)
	static String method8315(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) { // L: 11083
			for (int var2 = 1; var2 <= 5; ++var2) { // L: 11084
				while (true) {
					int var3 = var0.indexOf("%" + var2); // L: 11086
					if (var3 == -1) { // L: 11087
						break;
					}

					var0 = var0.substring(0, var3) + class517.method9050(VarcInt.method3681(var1, var2 - 1)) + var0.substring(var3 + 2); // L: 11088
				}
			}
		}

		return var0; // L: 11092
	}
}
