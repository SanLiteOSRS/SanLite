import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
public class class131 implements class369 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	static final class131 field1544;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	static final class131 field1541;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	static final class131 field1554;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	static final class131 field1540;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	static final class131 field1550;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	static final class131 field1545;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	static final class131 field1546;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	static final class131 field1559;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	static final class131 field1548;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	static final class131 field1549;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	static final class131 field1542;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	static final class131 field1551;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	static final class131 field1552;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	static final class131 field1553;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	static final class131 field1560;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	static final class131 field1555;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	static final class131 field1556;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1237434725
	)
	final int field1557;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -122541839
	)
	final int field1558;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -420164403
	)
	final int field1543;

	static {
		field1544 = new class131(0, 0, (String)null, -1, -1); // L: 46
		field1541 = new class131(1, 1, (String)null, 0, 2); // L: 47
		field1554 = new class131(2, 2, (String)null, 1, 2); // L: 48
		field1540 = new class131(3, 3, (String)null, 2, 2); // L: 49
		field1550 = new class131(4, 4, (String)null, 3, 1); // L: 50
		field1545 = new class131(5, 5, (String)null, 4, 1); // L: 51
		field1546 = new class131(6, 6, (String)null, 5, 1); // L: 52
		field1559 = new class131(7, 7, (String)null, 6, 3); // L: 53
		field1548 = new class131(8, 8, (String)null, 7, 3); // L: 54
		field1549 = new class131(9, 9, (String)null, 8, 3); // L: 55
		field1542 = new class131(10, 10, (String)null, 0, 7); // L: 56
		field1551 = new class131(11, 11, (String)null, 1, 7); // L: 57
		field1552 = new class131(12, 12, (String)null, 2, 7); // L: 58
		field1553 = new class131(13, 13, (String)null, 3, 7); // L: 59
		field1560 = new class131(14, 14, (String)null, 4, 7); // L: 60
		field1555 = new class131(15, 15, (String)null, 5, 7); // L: 61
		field1556 = new class131(16, 16, (String)null, 0, 5); // L: 62
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class131(int var1, int var2, String var3, int var4, int var5) {
		this.field1557 = var1; // L: 72
		this.field1558 = var2; // L: 73
		this.field1543 = var4; // L: 74
	} // L: 75

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1108588956"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1558; // L: 78
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2099037663"
	)
	int method3009() {
		return this.field1543; // L: 82
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "102"
	)
	public static void method3019() {
		try {
			JagexCache.JagexCache_dat2File.close(); // L: 250

			for (int var0 = 0; var0 < class74.idxCount; ++var0) { // L: 251
				JagexCache.JagexCache_idxFiles[var0].close();
			}

			JagexCache.JagexCache_idx255File.close(); // L: 252
			JagexCache.JagexCache_randomDat.close(); // L: 253
		} catch (Exception var2) { // L: 255
		}

	} // L: 256
}
