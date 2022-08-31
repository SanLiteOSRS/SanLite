import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mr")
public class class342 {
	@ObfuscatedName("s")
	static char[] field4144;
	@ObfuscatedName("h")
	static char[] field4145;
	@ObfuscatedName("w")
	static char[] field4147;
	@ObfuscatedName("v")
	static int[] field4146;

	static {
		field4144 = new char[64]; // L: 7

		int var0;
		for (var0 = 0; var0 < 26; ++var0) { // L: 8
			field4144[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 9
			field4144[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 10
			field4144[var0] = (char)(var0 + 48 - 52);
		}

		field4144[62] = '+'; // L: 11
		field4144[63] = '/'; // L: 12
		field4145 = new char[64]; // L: 18

		for (var0 = 0; var0 < 26; ++var0) { // L: 19
			field4145[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 20
			field4145[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 21
			field4145[var0] = (char)(var0 + 48 - 52);
		}

		field4145[62] = '*'; // L: 22
		field4145[63] = '-'; // L: 23
		field4147 = new char[64]; // L: 29

		for (var0 = 0; var0 < 26; ++var0) { // L: 30
			field4147[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 31
			field4147[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 32
			field4147[var0] = (char)(var0 + 48 - 52);
		}

		field4147[62] = '-'; // L: 33
		field4147[63] = '_'; // L: 34
		field4146 = new int[128]; // L: 40

		for (var0 = 0; var0 < field4146.length; ++var0) { // L: 41
			field4146[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) { // L: 42
			field4146[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) { // L: 43
			field4146[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) { // L: 44
			field4146[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4146;
		field4146[43] = 62;
		var2[42] = 62; // L: 47
		int[] var1 = field4146; // L: 48
		field4146[47] = 63; // L: 49
		var1[45] = 63; // L: 50
	} // L: 51

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-21882073"
	)
	public static final void method6200(int var0, int var1) {
		ViewportMouse.ViewportMouse_x = var0; // L: 78
		ViewportMouse.ViewportMouse_y = var1; // L: 79
		ViewportMouse.ViewportMouse_isInViewport = true; // L: 80
		ViewportMouse.ViewportMouse_entityCount = 0; // L: 81
		ViewportMouse.ViewportMouse_false0 = false; // L: 82
	} // L: 83

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lam;I)V",
		garbageValue = "-1744938892"
	)
	public static final void method6201(class47 var0) {
		GrandExchangeOfferTotalQuantityComparator.pcmPlayerProvider = var0; // L: 45
	} // L: 46
}
