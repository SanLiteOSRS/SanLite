import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
public class class207 extends Node {
	@ObfuscatedName("sx")
	@ObfuscatedSignature(
		descriptor = "Ltg;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1898395793
	)
	public int field2281;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -6436041
	)
	public int field2282;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 282812641
	)
	public int field2285;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	public Widget field2284;

	@ObfuscatedSignature(
		descriptor = "(IIILmy;)V"
	)
	public class207(int var1, int var2, int var3, Widget var4) {
		this.field2285 = var1; // L: 15
		this.field2281 = var2;
		this.field2282 = var3;
		this.field2284 = var4;
	}

	@ObfuscatedName("aj")
	public static String method4073(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) { // L: 16
			if (0L == var0 % 37L) { // L: 17
				return null;
			} else {
				int var2 = 0; // L: 18

				for (long var3 = var0; var3 != 0L; var3 /= 37L) { // L: 19 20 22
					++var2; // L: 21
				}

				StringBuilder var5 = new StringBuilder(var2); // L: 24

				while (var0 != 0L) { // L: 25
					long var6 = var0; // L: 26
					var0 /= 37L; // L: 27
					var5.append(class369.base37Table[(int)(var6 - var0 * 37L)]); // L: 28
				}

				return var5.reverse().toString(); // L: 30
			}
		} else {
			return null;
		}
	}
}
