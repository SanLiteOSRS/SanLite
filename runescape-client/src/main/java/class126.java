import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
public class class126 implements class356 {
	@ObfuscatedName("wt")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	static final class126 field1535;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	static final class126 field1532;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	static final class126 field1533;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	static final class126 field1538;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	static final class126 field1539;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	static final class126 field1536;
	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("archive15")
	static Archive archive15;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 75502821
	)
	final int field1537;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -902992331
	)
	final int field1542;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1224388371
	)
	final int field1534;

	static {
		field1535 = new class126(0, 0, (String)null, 0); // L: 14
		field1532 = new class126(1, 1, (String)null, 9); // L: 15
		field1533 = new class126(2, 2, (String)null, 3); // L: 16
		field1538 = new class126(3, 3, (String)null, 6); // L: 17
		field1539 = new class126(4, 4, (String)null, 1); // L: 18
		field1536 = new class126(5, 5, (String)null, 3); // L: 19
	}

	class126(int var1, int var2, String var3, int var4) {
		this.field1537 = var1; // L: 29
		this.field1542 = var2; // L: 30
		this.field1534 = var4; // L: 31
	} // L: 32

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "741942848"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1542; // L: 40
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-406434338"
	)
	int method3101() {
		return this.field1534; // L: 35
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZS)I",
		garbageValue = "15950"
	)
	static int method3099(int var0, Script var1, boolean var2) {
		if (var0 == 7463) { // L: 5064
			boolean var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 5065
			GrandExchangeOfferOwnWorldComparator.method1227(var3); // L: 5066
			return 1; // L: 5067
		} else {
			return 2; // L: 5069
		}
	}
}
