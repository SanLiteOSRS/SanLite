import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mm")
public class class356 {
	@ObfuscatedName("a")
	public static char[] field4298;
	@ObfuscatedName("f")
	static char[] field4296;
	@ObfuscatedName("c")
	static char[] field4297;
	@ObfuscatedName("x")
	static int[] field4295;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;

	static {
		field4298 = new char[64]; // L: 7

		int var0;
		for (var0 = 0; var0 < 26; ++var0) { // L: 8
			field4298[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 9
			field4298[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 10
			field4298[var0] = (char)(var0 + 48 - 52);
		}

		field4298[62] = '+'; // L: 11
		field4298[63] = '/'; // L: 12
		field4296 = new char[64]; // L: 18

		for (var0 = 0; var0 < 26; ++var0) { // L: 19
			field4296[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 20
			field4296[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 21
			field4296[var0] = (char)(var0 + 48 - 52);
		}

		field4296[62] = '*'; // L: 22
		field4296[63] = '-'; // L: 23
		field4297 = new char[64]; // L: 29

		for (var0 = 0; var0 < 26; ++var0) { // L: 30
			field4297[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 31
			field4297[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 32
			field4297[var0] = (char)(var0 + 48 - 52);
		}

		field4297[62] = '-'; // L: 33
		field4297[63] = '_'; // L: 34
		field4295 = new int[128]; // L: 40

		for (var0 = 0; var0 < field4295.length; ++var0) { // L: 41
			field4295[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) { // L: 42
			field4295[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) { // L: 43
			field4295[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) { // L: 44
			field4295[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4295; // L: 45
		field4295[43] = 62; // L: 46
		var2[42] = 62; // L: 47
		int[] var1 = field4295; // L: 48
		field4295[47] = 63; // L: 49
		var1[45] = 63; // L: 50
	} // L: 51

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2110467950"
	)
	static final int method6783() {
		float var0 = 200.0F * ((float)BufferedSink.clientPreferences.method2392() - 0.5F); // L: 12159
		return 100 - Math.round(var0); // L: 12160
	}
}
