import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tr")
public class class505 implements class369 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	public static final class505 field5074;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	public static final class505 field5073;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	static final class505 field5075;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	static final class505 field5076;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	static final class505 field5072;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	static final class505 field5077;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -412521335
	)
	final int field5078;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -863672071
	)
	final int field5079;

	static {
		field5074 = new class505(1, 0); // L: 8
		field5073 = new class505(5, 2); // L: 9
		field5075 = new class505(3, 5); // L: 10
		field5076 = new class505(0, 6); // L: 11
		field5072 = new class505(4, 7); // L: 12
		field5077 = new class505(2, 8); // L: 13
	}

	class505(int var1, int var2) {
		this.field5078 = var1; // L: 18
		this.field5079 = var2; // L: 19
	} // L: 20

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5079; // L: 24
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1368518378"
	)
	public boolean method9212() {
		return this == field5073; // L: 28
	}
}
