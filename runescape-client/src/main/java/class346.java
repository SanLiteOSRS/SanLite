import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mz")
public class class346 {
	@ObfuscatedName("v")
	static char[] field4136;
	@ObfuscatedName("c")
	static char[] field4133;
	@ObfuscatedName("i")
	static char[] field4134;
	@ObfuscatedName("f")
	static int[] field4135;

	static {
		field4136 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field4136[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4136[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4136[var0] = (char)(var0 + 48 - 52);
		}

		field4136[62] = '+';
		field4136[63] = '/';
		field4133 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4133[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4133[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4133[var0] = (char)(var0 + 48 - 52);
		}

		field4133[62] = '*';
		field4133[63] = '-';
		field4134 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4134[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4134[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4134[var0] = (char)(var0 + 48 - 52);
		}

		field4134[62] = '-';
		field4134[63] = '_';
		field4135 = new int[128];

		for (var0 = 0; var0 < field4135.length; ++var0) {
			field4135[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field4135[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field4135[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field4135[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4135;
		field4135[43] = 62;
		var2[42] = 62;
		int[] var1 = field4135;
		field4135[47] = 63;
		var1[45] = 63;
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(Lky;I)V",
		garbageValue = "-60390428"
	)
	@Export("invalidateWidget")
	static void invalidateWidget(Widget var0) {
		if (var0 != null && var0.cycle == Client.field540) {
			Client.field715[var0.rootIndex] = true;
		}

	}
}
