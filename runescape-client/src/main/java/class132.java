import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
public class class132 implements class391 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	static final class132 field1590;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	static final class132 field1583;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	static final class132 field1593;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	static final class132 field1585;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	static final class132 field1586;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	static final class132 field1582;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -430465133
	)
	final int field1588;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1552462787
	)
	final int field1589;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -840093281
	)
	final int field1591;

	static {
		field1590 = new class132(0, 0, (String)null, 0); // L: 14
		field1583 = new class132(1, 1, (String)null, 9); // L: 15
		field1593 = new class132(2, 2, (String)null, 3); // L: 16
		field1585 = new class132(3, 3, (String)null, 6); // L: 17
		field1586 = new class132(4, 4, (String)null, 1); // L: 18
		field1582 = new class132(5, 5, (String)null, 3); // L: 19
	}

	class132(int var1, int var2, String var3, int var4) {
		this.field1588 = var1; // L: 25
		this.field1589 = var2; // L: 26
		this.field1591 = var4; // L: 27
	} // L: 28

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "800883718"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1589; // L: 46
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "6120736"
	)
	int method3049() {
		return this.field1591; // L: 41
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;S)Ljava/lang/String;",
		garbageValue = "30808"
	)
	public static String method3057(CharSequence var0) {
		int var2 = var0.length(); // L: 181
		char[] var3 = new char[var2]; // L: 183

		for (int var4 = 0; var4 < var2; ++var4) { // L: 184
			var3[var4] = '*';
		}

		String var1 = new String(var3); // L: 185
		return var1; // L: 187
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "1524995741"
	)
	public static int method3058(byte[] var0, int var1, int var2) {
		int var3 = -1; // L: 47

		for (int var4 = var1; var4 < var2; ++var4) { // L: 48
			var3 = var3 >>> 8 ^ Buffer.crc32Table[(var3 ^ var0[var4]) & 255]; // L: 49
		}

		var3 = ~var3; // L: 51
		return var3; // L: 52
	}
}
