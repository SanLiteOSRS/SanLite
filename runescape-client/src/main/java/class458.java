import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rl")
public class class458 {
	@ObfuscatedName("ac")
	static final char[] field4828;
	@ObfuscatedName("ab")
	static final char[] field4831;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1173563887
	)
	@Export("clientType")
	public static int clientType;

	static {
		field4828 = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'}; // L: 8
		field4831 = new char[]{'[', ']', '#'}; // L: 9
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lrf;",
		garbageValue = "1805661214"
	)
	public static class467 method8343(int var0) {
		int var1 = class465.field4855[var0]; // L: 19
		if (var1 == 1) { // L: 20
			return class467.field4866; // L: 21
		} else if (var1 == 2) { // L: 23
			return class467.field4865; // L: 24
		} else {
			return var1 == 3 ? class467.field4859 : null; // L: 26 27 29
		}
	}
}
