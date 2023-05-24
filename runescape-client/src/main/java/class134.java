import java.util.Collections;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
public enum class134 implements class356 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	field1603(0, 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	field1610(1, 1),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	field1602(2, 2),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	field1605(3, 3),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	field1599(4, 4),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	field1604(5, 5),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	field1600(6, 6),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	field1606(7, 7),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	field1607(8, 8);

	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -895397955
	)
	final int field1608;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 59724017
	)
	final int field1609;

	class134(int var3, int var4) {
		this.field1608 = var3; // L: 111
		this.field1609 = var4; // L: 112
	} // L: 113

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "741942848"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1609; // L: 116
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([I[II)V",
		garbageValue = "-1476012206"
	)
	public static void method3181(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) { // L: 43
			ClanChannel.ByteArrayPool_alternativeSizes = var0; // L: 50
			class136.ByteArrayPool_altSizeArrayCounts = new int[var0.length]; // L: 51
			UserComparator3.ByteArrayPool_arrays = new byte[var0.length][][]; // L: 52

			for (int var2 = 0; var2 < ClanChannel.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 53
				UserComparator3.ByteArrayPool_arrays[var2] = new byte[var1[var2]][]; // L: 54
				ByteArrayPool.field4472.add(var0[var2]); // L: 55
			}

			Collections.sort(ByteArrayPool.field4472);
		} else {
			ClanChannel.ByteArrayPool_alternativeSizes = null; // L: 44
			class136.ByteArrayPool_altSizeArrayCounts = null; // L: 45
			UserComparator3.ByteArrayPool_arrays = null; // L: 46
			class273.method5614(); // L: 47
		}
	} // L: 48

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "0"
	)
	public static int method3179(int var0, int var1, int var2) {
		int var3 = class140.method3220(var2 - var1 + 1); // L: 56
		var3 <<= var1; // L: 57
		var0 |= var3; // L: 58
		return var0; // L: 59
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "3"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 146
	}

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "68"
	)
	static boolean method3178() {
		return class20.clientPreferences.method2469() >= Client.field493; // L: 12232
	}
}
