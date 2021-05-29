import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gn")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("gn")
	@ObfuscatedGetter(
		intValue = 1575841489
	)
	static int field2387;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1269044325
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -386233567
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 725968227
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1353247321
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -713034583
	)
	@Export("type")
	int type;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 818345769
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -635118225
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -621751483
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1703842397
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -189041849
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1423545413
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -2138961749
	)
	int field2380;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -853135435
	)
	int field2385;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -668340379
	)
	int field2372;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -2125693873
	)
	int field2382;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1761408947
	)
	int field2384;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 536172955
	)
	int field2369;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -533190237
	)
	int field2386;

	Occluder() {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "106"
	)
	static final int method4109(int var0, int var1) {
		int var2 = GrandExchangeOfferAgeComparator.method5067(var0 - 1, var1 - 1) + GrandExchangeOfferAgeComparator.method5067(1 + var0, var1 - 1) + GrandExchangeOfferAgeComparator.method5067(var0 - 1, 1 + var1) + GrandExchangeOfferAgeComparator.method5067(1 + var0, 1 + var1);
		int var3 = GrandExchangeOfferAgeComparator.method5067(var0 - 1, var1) + GrandExchangeOfferAgeComparator.method5067(var0 + 1, var1) + GrandExchangeOfferAgeComparator.method5067(var0, var1 - 1) + GrandExchangeOfferAgeComparator.method5067(var0, var1 + 1);
		int var4 = GrandExchangeOfferAgeComparator.method5067(var0, var1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "-1000061278"
	)
	static int method4110(int var0, Script var1, boolean var2) {
		Widget var3 = Frames.getWidget(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = AttackOption.Widget_unpackTargetMask(class21.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.IF_GETOP) {
			if (var0 == ScriptOpcodes.IF_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)V",
		garbageValue = "-1750560328"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		BoundaryObject.insertMenuItem(var0, var1, var2, var3, var4, var5, false);
	}
}
