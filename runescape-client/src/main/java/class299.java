import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ke")
public class class299 {
	@ObfuscatedName("z")
	static char[] field3676;
	@ObfuscatedName("k")
	static char[] field3675;
	@ObfuscatedName("s")
	static char[] field3674;
	@ObfuscatedName("t")
	static int[] field3677;

	static {
		field3676 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field3676[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3676[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3676[var0] = (char)(var0 + 48 - 52);
		}

		field3676[62] = '+';
		field3676[63] = '/';
		field3675 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field3675[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3675[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3675[var0] = (char)(var0 + 48 - 52);
		}

		field3675[62] = '*';
		field3675[63] = '-';
		field3674 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field3674[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3674[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3674[var0] = (char)(var0 + 48 - 52);
		}

		field3674[62] = '-';
		field3674[63] = '_';
		field3677 = new int[128];

		for (var0 = 0; var0 < field3677.length; ++var0) {
			field3677[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field3677[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field3677[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field3677[var0] = var0 - 48 + 52;
		}

		int[] var2 = field3677;
		field3677[43] = 62;
		var2[42] = 62;
		int[] var1 = field3677;
		field3677[47] = 63;
		var1[45] = 63;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(IIB)V",
		garbageValue = "-48"
	)
	public static final void method5393(int var0, int var1) {
		ViewportMouse.ViewportMouse_x = var0;
		ViewportMouse.ViewportMouse_y = var1;
		ViewportMouse.ViewportMouse_isInViewport = true;
		ViewportMouse.ViewportMouse_entityCount = 0;
		ViewportMouse.ViewportMouse_false0 = false;
	}
}
