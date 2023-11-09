import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ok")
public class class382 {
	@ObfuscatedName("at")
	@Export("cp1252AsciiExtension")
	public static final char[] cp1252AsciiExtension;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lbv;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;

	static {
		cp1252AsciiExtension = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'}; // L: 4
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1146084090"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 150
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1481682753"
	)
	static void method7141(int var0, int var1) {
		MenuAction var2 = UrlRequester.tempMenuAction; // L: 12087
		if (var2 != null) { // L: 12089
			WorldMapIcon_0.method5391(var2.param0, var2.param1, var2.opcode, var2.identifier, var2.field900, var2.field901, var2.field897, var0, var1); // L: 12090
		}

		UrlRequester.tempMenuAction = null; // L: 12093
	} // L: 12094
}
