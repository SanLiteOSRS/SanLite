import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tp")
public class class517 implements class371 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ltp;"
	)
	public static final class517 field5122;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ltp;"
	)
	public static final class517 field5118;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ltp;"
	)
	static final class517 field5119;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ltp;"
	)
	static final class517 field5120;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ltp;"
	)
	static final class517 field5117;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ltp;"
	)
	static final class517 field5121;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1936071155
	)
	final int field5123;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 318873769
	)
	final int field5124;

	static {
		field5122 = new class517(4, 0); // L: 8
		field5118 = new class517(3, 2); // L: 9
		field5119 = new class517(0, 5); // L: 10
		field5120 = new class517(1, 6); // L: 11
		field5117 = new class517(2, 7); // L: 12
		field5121 = new class517(5, 8); // L: 13
	}

	class517(int var1, int var2) {
		this.field5123 = var1; // L: 18
		this.field5124 = var2; // L: 19
	} // L: 20

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1233989967"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5124; // L: 24
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1131981021"
	)
	public boolean method9357() {
		return this == field5118; // L: 28
	}
}
