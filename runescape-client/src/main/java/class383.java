import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oy")
public class class383 {
	@ObfuscatedName("ay")
	static char[] field4408;
	@ObfuscatedName("an")
	static char[] field4405;
	@ObfuscatedName("ar")
	static char[] field4407;
	@ObfuscatedName("ab")
	static int[] field4406;

	static {
		field4408 = new char[64]; // L: 7

		int var0;
		for (var0 = 0; var0 < 26; ++var0) { // L: 8
			field4408[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 9
			field4408[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 10
			field4408[var0] = (char)(var0 + 48 - 52);
		}

		field4408[62] = '+'; // L: 11
		field4408[63] = '/'; // L: 12
		field4405 = new char[64]; // L: 18

		for (var0 = 0; var0 < 26; ++var0) { // L: 19
			field4405[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 20
			field4405[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 21
			field4405[var0] = (char)(var0 + 48 - 52);
		}

		field4405[62] = '*'; // L: 22
		field4405[63] = '-'; // L: 23
		field4407 = new char[64]; // L: 29

		for (var0 = 0; var0 < 26; ++var0) { // L: 30
			field4407[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 31
			field4407[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 32
			field4407[var0] = (char)(var0 + 48 - 52);
		}

		field4407[62] = '-'; // L: 33
		field4407[63] = '_'; // L: 34
		field4406 = new int[128]; // L: 40

		for (var0 = 0; var0 < field4406.length; ++var0) { // L: 41
			field4406[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) { // L: 42
			field4406[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) { // L: 43
			field4406[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) { // L: 44
			field4406[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4406; // L: 45
		field4406[43] = 62; // L: 46
		var2[42] = 62; // L: 47
		int[] var1 = field4406; // L: 48
		field4406[47] = 63; // L: 49
		var1[45] = 63; // L: 50
	} // L: 51

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-702947316"
	)
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (WorldMapAreaData.loadInterface(var0)) { // L: 11907
			Widget[] var1 = UserComparator6.Widget_interfaceComponents[var0]; // L: 11908

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 11909
				Widget var3 = var1[var2]; // L: 11910
				if (var3 != null) { // L: 11911
					var3.modelFrame = 0; // L: 11912
					var3.modelFrameCycle = 0; // L: 11913
				}
			}

		}
	} // L: 11915
}
