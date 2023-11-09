import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kx")
public class class271 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static final class271 field3021;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static final class271 field3017;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1656058953
	)
	@Export("value")
	final int value;

	static {
		field3021 = new class271(0); // L: 4
		field3017 = new class271(1); // L: 5
	}

	class271(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "25"
	)
	static final int method5517(int var0, int var1) {
		if (var0 == -2) { // L: 991
			return 12345678;
		} else if (var0 == -1) { // L: 992
			if (var1 < 2) {
				var1 = 2; // L: 993
			} else if (var1 > 126) { // L: 994
				var1 = 126;
			}

			return var1; // L: 995
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 997
			if (var1 < 2) { // L: 998
				var1 = 2;
			} else if (var1 > 126) { // L: 999
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 1000
		}
	}
}
