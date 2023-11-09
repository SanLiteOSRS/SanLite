import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tl")
public class class505 implements class369 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	public static final class505 field5070;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	public static final class505 field5074;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	static final class505 field5071;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	static final class505 field5072;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	static final class505 field5073;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	static final class505 field5069;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1752468951
	)
	final int field5075;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1839961075
	)
	final int field5076;

	static {
		field5070 = new class505(3, 0); // L: 8
		field5074 = new class505(1, 2); // L: 9
		field5071 = new class505(5, 5); // L: 10
		field5072 = new class505(0, 6); // L: 11
		field5073 = new class505(2, 7); // L: 12
		field5069 = new class505(4, 8); // L: 13
	}

	class505(int var1, int var2) {
		this.field5075 = var1; // L: 18
		this.field5076 = var2; // L: 19
	} // L: 20

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1389666633"
	)
	public boolean method9253() {
		return this == field5074; // L: 28
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1108588956"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5076; // L: 24
	}
}
