import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
public class class126 implements class349 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	static final class126 field1546;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	static final class126 field1548;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	static final class126 field1555;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	static final class126 field1550;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	static final class126 field1552;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	static final class126 field1551;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -162414941
	)
	final int field1547;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1294570757
	)
	final int field1553;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1207176119
	)
	final int field1554;

	static {
		field1546 = new class126(0, 0, (String)null, 0); // L: 14
		field1548 = new class126(1, 1, (String)null, 9); // L: 15
		field1555 = new class126(2, 2, (String)null, 3); // L: 16
		field1550 = new class126(3, 3, (String)null, 6); // L: 17
		field1552 = new class126(4, 4, (String)null, 1); // L: 18
		field1551 = new class126(5, 5, (String)null, 3); // L: 19
	}

	class126(int var1, int var2, String var3, int var4) {
		this.field1547 = var1; // L: 25
		this.field1553 = var2; // L: 26
		this.field1554 = var4; // L: 27
	} // L: 28

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1553; // L: 36
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	int method3072() {
		return this.field1554; // L: 31
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1018736825"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') { // L: 192
			return true;
		} else if (var0 >= 160 && var0 <= 255) { // L: 193
			return true;
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376; // L: 194
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZB)I",
		garbageValue = "50"
	)
	static int method3074(int var0, Script var1, boolean var2) {
		return 2; // L: 5102
	}
}
