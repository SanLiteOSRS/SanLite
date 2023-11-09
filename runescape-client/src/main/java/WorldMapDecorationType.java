import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements class342 {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	field3685(0, 0),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	field3673(1, 0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	field3684(2, 0),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	field3688(3, 0),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	field3676(9, 2),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	field3677(4, 1),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	field3681(5, 1),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	field3679(6, 1),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	field3680(7, 1),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	field3693(8, 1),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	field3696(12, 2),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	field3683(13, 2),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	field3678(14, 2),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	field3675(15, 2),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	field3686(16, 2),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	field3687(17, 2),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	field3690(18, 2),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	field3689(19, 2),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	field3674(20, 2),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	field3691(21, 2),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	field3692(10, 2),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	field3682(11, 2),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	field3694(22, 3);

	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -843672019
	)
	@Export("id")
	public final int id;

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	WorldMapDecorationType(int var3, int var4) {
		this.id = var3; // L: 34
	} // L: 35

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 39
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZB)I",
		garbageValue = "55"
	)
	static int method6237(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) { // L: 2706
			var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 2707
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.field733.method3956(var3) ? 1 : 0; // L: 2708
			return 1; // L: 2709
		} else if (var0 == 3501) { // L: 2711
			var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 2712
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.field733.method3990(var3) ? 1 : 0; // L: 2713
			return 1; // L: 2714
		} else if (var0 == 3502) { // L: 2716
			var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 2717
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.field733.method3966(var3) ? 1 : 0; // L: 2718
			return 1; // L: 2719
		} else {
			return 2; // L: 2721
		}
	}
}
