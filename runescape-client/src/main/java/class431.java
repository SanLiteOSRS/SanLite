import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qw")
public class class431 {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -2118328581
	)
	static int field4647;

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([BI)[I",
		garbageValue = "1422300255"
	)
	public static int[] method8065(byte[] var0) {
		if (var0 != null && var0.length != 0 && var0.length <= 8) { // L: 164
			int[] var1 = new int[var0.length]; // L: 167

			for (int var2 = 0; var2 < var0.length; ++var2) { // L: 168
				if (var0[var2] < 0 || var0[var2] > class554.field5330.length) { // L: 169
					return null; // L: 170
				}

				var1[var2] = class554.field5330[var0[var2]]; // L: 172
			}

			return var1; // L: 174
		} else {
			return null; // L: 165
		}
	}
}
