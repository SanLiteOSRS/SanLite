import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
public class class196 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lhb;"
	)
	static final class196 field2056;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lhb;"
	)
	static final class196 field2052;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lhb;"
	)
	static final class196 field2053;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lhb;"
	)
	static final class196 field2054;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lhb;"
	)
	static final class196 field2051;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lhb;"
	)
	static final class196 field2055;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lhb;"
	)
	static final class196 field2057;

	static {
		field2056 = new class196(0, class208.field2304); // L: 4
		field2052 = new class196(1, class208.field2312); // L: 5
		field2053 = new class196(2, class208.field2301); // L: 6
		field2054 = new class196(3, class208.field2307); // L: 7
		field2051 = new class196(4, class208.field2309); // L: 8
		field2055 = new class196(5, class208.field2308); // L: 9
		field2057 = new class196(6, class208.field2311); // L: 10
	}

	@ObfuscatedSignature(
		descriptor = "(ILin;)V"
	)
	class196(int var1, class208 var2) {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Loj;B)I",
		garbageValue = "100"
	)
	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length(); // L: 11
		int var4 = var1.length(); // L: 12
		int var5 = 0; // L: 13
		int var6 = 0; // L: 14
		char var7 = 0; // L: 15
		char var8 = 0; // L: 16

		while (var5 - var7 < var3 || var6 - var8 < var4) { // L: 18
			if (var5 - var7 >= var3) { // L: 19
				return -1;
			}

			if (var6 - var8 >= var4) { // L: 20
				return 1;
			}

			char var9;
			if (var7 != 0) { // L: 23
				var9 = var7; // L: 24
				boolean var14 = false; // L: 25
			} else {
				var9 = var0.charAt(var5++); // L: 27
			}

			char var10;
			if (var8 != 0) { // L: 28
				var10 = var8; // L: 29
				boolean var15 = false; // L: 30
			} else {
				var10 = var1.charAt(var6++); // L: 32
			}

			var7 = class210.method4124(var9); // L: 33
			var8 = class210.method4124(var10); // L: 34
			var9 = Varps.standardizeChar(var9, var2); // L: 35
			var10 = Varps.standardizeChar(var10, var2); // L: 36
			if (var9 != var10 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) { // L: 37
				var9 = Character.toLowerCase(var9); // L: 38
				var10 = Character.toLowerCase(var10); // L: 39
				if (var9 != var10) { // L: 40
					return JagexCache.lowercaseChar(var9, var2) - JagexCache.lowercaseChar(var10, var2);
				}
			}
		}

		int var16 = Math.min(var3, var4); // L: 43

		char var12;
		int var17;
		for (var17 = 0; var17 < var16; ++var17) { // L: 44
			if (var2 == Language.Language_FR) { // L: 45
				var5 = var3 - 1 - var17; // L: 46
				var6 = var4 - 1 - var17; // L: 47
			} else {
				var6 = var17;
				var5 = var17;
			}

			char var11 = var0.charAt(var5);
			var12 = var1.charAt(var6);
			if (var11 != var12 && Character.toUpperCase(var11) != Character.toUpperCase(var12)) { // L: 52
				var11 = Character.toLowerCase(var11);
				var12 = Character.toLowerCase(var12); // L: 54
				if (var12 != var11) {
					return JagexCache.lowercaseChar(var11, var2) - JagexCache.lowercaseChar(var12, var2); // L: 55
				}
			}
		}

		var17 = var3 - var4; // L: 58
		if (var17 != 0) { // L: 59
			return var17;
		} else {
			for (int var18 = 0; var18 < var16; ++var18) { // L: 60
				var12 = var0.charAt(var18); // L: 61
				char var13 = var1.charAt(var18); // L: 62
				if (var13 != var12) { // L: 63
					return JagexCache.lowercaseChar(var12, var2) - JagexCache.lowercaseChar(var13, var2);
				}
			}

			return 0; // L: 65
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "([BIS)I",
		garbageValue = "-30000"
	)
	public static int method3756(byte[] var0, int var1) {
		int var3 = -1; // L: 49

		for (int var4 = 0; var4 < var1; ++var4) { // L: 50
			var3 = var3 >>> 8 ^ Buffer.crc32Table[(var3 ^ var0[var4]) & 255]; // L: 51
		}

		var3 = ~var3; // L: 53
		return var3; // L: 56
	}
}
