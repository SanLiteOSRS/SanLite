import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1692400061
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1598293749
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1279809643
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1751090427
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1862470197
	)
	int field916;
	@ObfuscatedName("ao")
	String field913;
	@ObfuscatedName("ab")
	String field918;

	MenuAction() {
	} // L: 13120

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lur;Ljava/lang/String;I)I",
		garbageValue = "349317824"
	)
	public static int method2088(Buffer var0, String var1) {
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
			} else if (var7 == 8224) {
				var5[var6] = -122; // L: 31
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
		var0.offset += class352.huffman.compress(var5, 0, var5.length, var0.array, var0.offset); // L: 59
		return var0.offset - var2; // L: 60
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(FFFFLfm;B)V",
		garbageValue = "0"
	)
	static void method2087(float var0, float var1, float var2, float var3, class131 var4) {
		float var5 = var1 - var0; // L: 338
		float var6 = var2 - var1; // L: 339
		float var7 = var3 - var2; // L: 340
		float var8 = var6 - var5; // L: 341
		var4.field1569 = var7 - var6 - var8; // L: 342
		var4.field1564 = var8 + var8 + var8; // L: 343
		var4.field1580 = var5 + var5 + var5; // L: 344
		var4.field1581 = var0; // L: 345
	} // L: 346
}
