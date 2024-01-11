import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
public class class228 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	static final class228 field2434;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	static final class228 field2437;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	static final class228 field2428;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	static final class228 field2430;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	static final class228 field2426;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	static final class228 field2431;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	static final class228 field2432;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Liv;"
	)
	static final class228[] field2436;
	@ObfuscatedName("ax")
	static int[] field2427;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1048509447
	)
	final int field2433;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 261363445
	)
	final int field2429;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1414601777
	)
	final int field2435;

	static {
		field2434 = new class228(6, 8, 8); // L: 8
		field2437 = new class228(1, 16, 16); // L: 9
		field2428 = new class228(2, 32, 32); // L: 10
		field2430 = new class228(4, 48, 48); // L: 11
		field2426 = new class228(3, 64, 64); // L: 12
		field2431 = new class228(0, 96, 96); // L: 13
		field2432 = new class228(5, 128, 128); // L: 14
		field2436 = class220.method4347();
		Arrays.sort(field2436, new class233());
	}

	class228(int var1, int var2, int var3) {
		this.field2433 = var1;
		this.field2429 = var2;
		this.field2435 = var3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "66"
	)
	int method4498() {
		return this.field2429 * this.field2435;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "-20"
	)
	static String method4503(int var0) {
		return "<img=" + var0 + ">";
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Luk;Ljava/lang/String;I)I",
		garbageValue = "866511405"
	)
	public static int method4502(Buffer var0, String var1) {
		int var2 = var0.offset; // L: 18
		int var4 = var1.length(); // L: 21
		byte[] var5 = new byte[var4]; // L: 22

		for (int var6 = 0; var6 < var4; ++var6) { // L: 23
			char var7 = var1.charAt(var6); // L: 24
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 25
				var5[var6] = (byte)var7;
			} else if (var7 == 8364) { // L: 26
				var5[var6] = -128;
			} else if (var7 == 8218) { // L: 27
				var5[var6] = -126;
			} else if (var7 == 402) { // L: 28
				var5[var6] = -125;
			} else if (var7 == 8222) { // L: 29
				var5[var6] = -124;
			} else if (var7 == 8230) { // L: 30
				var5[var6] = -123;
			} else if (var7 == 8224) { // L: 31
				var5[var6] = -122;
			} else if (var7 == 8225) { // L: 32
				var5[var6] = -121;
			} else if (var7 == 710) { // L: 33
				var5[var6] = -120;
			} else if (var7 == 8240) { // L: 34
				var5[var6] = -119;
			} else if (var7 == 352) { // L: 35
				var5[var6] = -118;
			} else if (var7 == 8249) { // L: 36
				var5[var6] = -117;
			} else if (var7 == 338) { // L: 37
				var5[var6] = -116;
			} else if (var7 == 381) { // L: 38
				var5[var6] = -114;
			} else if (var7 == 8216) { // L: 39
				var5[var6] = -111;
			} else if (var7 == 8217) { // L: 40
				var5[var6] = -110;
			} else if (var7 == 8220) { // L: 41
				var5[var6] = -109;
			} else if (var7 == 8221) { // L: 42
				var5[var6] = -108;
			} else if (var7 == 8226) { // L: 43
				var5[var6] = -107;
			} else if (var7 == 8211) {
				var5[var6] = -106; // L: 44
			} else if (var7 == 8212) { // L: 45
				var5[var6] = -105;
			} else if (var7 == 732) { // L: 46
				var5[var6] = -104;
			} else if (var7 == 8482) { // L: 47
				var5[var6] = -103;
			} else if (var7 == 353) { // L: 48
				var5[var6] = -102;
			} else if (var7 == 8250) { // L: 49
				var5[var6] = -101;
			} else if (var7 == 339) { // L: 50
				var5[var6] = -100;
			} else if (var7 == 382) { // L: 51
				var5[var6] = -98;
			} else if (var7 == 376) { // L: 52
				var5[var6] = -97;
			} else {
				var5[var6] = 63; // L: 53
			}
		}

		var0.writeSmartByteShort(var5.length); // L: 58
		var0.offset += class353.huffman.compress(var5, 0, var5.length, var0.array, var0.offset); // L: 59
		return var0.offset - var2; // L: 60
	}
}
