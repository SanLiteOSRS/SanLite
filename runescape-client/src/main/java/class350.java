import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nc")
public class class350 {
	@ObfuscatedName("aa")
	static byte[][][] field3876;

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Lsf;",
		garbageValue = "1898243774"
	)
	public static class468 method6940() {
		synchronized(class468.field4833) { // L: 26
			if (class468.field4834 == 0) { // L: 27
				return new class468();
			} else {
				class468.field4833[--class468.field4834].method8593(); // L: 29
				return class468.field4833[class468.field4834]; // L: 30
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "0"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length(); // L: 137
		int var2 = 0; // L: 138

		for (int var3 = 0; var3 < var1; ++var3) { // L: 139
			var2 = (var2 << 5) - var2 + class226.charToByteCp1252(var0.charAt(var3));
		}

		return var2; // L: 140
	}
}
