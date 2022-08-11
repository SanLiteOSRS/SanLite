import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1482716371
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1640695935
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -396391183
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1731725825
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -506320557
	)
	@Export("type")
	int type;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1764953573
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -717807795
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -306942895
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -321456317
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1078985107
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1953201603
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 769542647
	)
	int field2455;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1434456367
	)
	int field2461;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1684484343
	)
	int field2462;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1169267657
	)
	int field2463;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -862949583
	)
	int field2464;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1968274797
	)
	int field2465;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 163698799
	)
	int field2449;

	Occluder() {
	} // L: 23

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZI)I",
		garbageValue = "-1039001452"
	)
	static int method4311(int var0, Script var1, boolean var2) {
		if (var0 != 6700 && var0 != 6702 && var0 != 6704 && var0 != 6706 && var0 != 6708) { // L: 4493
			if (var0 != 6701 && var0 != 6703 && var0 != 6705 && var0 != 6707 && var0 != 6709) { // L: 4498
				if (var0 == 6750) { // L: 4502
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 4503
					return 1; // L: 4504
				} else if (var0 != 6751 && var0 != 6752 && var0 != 6753) { // L: 4506
					if (var0 == 6754) { // L: 4510
						int var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 4511
						NPCComposition var4 = class125.getNpcDefinition(var3); // L: 4512
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : ""; // L: 4513
						return 1; // L: 4514
					} else {
						return 2; // L: 4516
					}
				} else {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 4507
					return 1; // L: 4508
				}
			} else {
				--TaskHandler.Interpreter_intStackSize; // L: 4499
				return 1; // L: 4500
			}
		} else {
			TaskHandler.Interpreter_intStackSize -= 2; // L: 4494
			--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize; // L: 4495
			return 1; // L: 4496
		}
	}
}
