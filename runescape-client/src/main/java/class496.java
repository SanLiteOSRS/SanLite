import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tg")
public class class496 {
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1321027137
	)
	static final int field4999;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 423632859
	)
	static final int field5000;

	static {
		field4999 = (int)(Math.pow(2.0D, 4.0D) - 1.0D); // L: 10
		field5000 = (int)(Math.pow(2.0D, 8.0D) - 1.0D); // L: 11
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "108"
	)
	static final int method8900(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 983
			var1 /= 2;
		}

		if (var2 > 192) { // L: 984
			var1 /= 2;
		}

		if (var2 > 217) { // L: 985
			var1 /= 2;
		}

		if (var2 > 243) { // L: 986
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 987
		return var3; // L: 988
	}
}
