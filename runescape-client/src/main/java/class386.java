import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oo")
public class class386 {
	@ObfuscatedName("aw")
	static char[] field4431;
	@ObfuscatedName("ay")
	static char[] field4435;
	@ObfuscatedName("ar")
	static char[] field4432;
	@ObfuscatedName("am")
	static int[] field4433;
	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	static Archive field4436;
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = 805063407
	)
	static int field4434;

	static {
		field4431 = new char[64]; // L: 7

		int var0;
		for (var0 = 0; var0 < 26; ++var0) { // L: 8
			field4431[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 9
			field4431[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 10
			field4431[var0] = (char)(var0 + 48 - 52);
		}

		field4431[62] = '+'; // L: 11
		field4431[63] = '/'; // L: 12
		field4435 = new char[64]; // L: 18

		for (var0 = 0; var0 < 26; ++var0) { // L: 19
			field4435[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 20
			field4435[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 21
			field4435[var0] = (char)(var0 + 48 - 52);
		}

		field4435[62] = '*'; // L: 22
		field4435[63] = '-'; // L: 23
		field4432 = new char[64]; // L: 29

		for (var0 = 0; var0 < 26; ++var0) { // L: 30
			field4432[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 31
			field4432[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 32
			field4432[var0] = (char)(var0 + 48 - 52);
		}

		field4432[62] = '-'; // L: 33
		field4432[63] = '_'; // L: 34
		field4433 = new int[128]; // L: 40

		for (var0 = 0; var0 < field4433.length; ++var0) { // L: 41
			field4433[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) { // L: 42
			field4433[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) { // L: 43
			field4433[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) { // L: 44
			field4433[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4433; // L: 45
		field4433[43] = 62; // L: 46
		var2[42] = 62; // L: 47
		int[] var1 = field4433; // L: 48
		field4433[47] = 63; // L: 49
		var1[45] = 63; // L: 50
	} // L: 51
}
