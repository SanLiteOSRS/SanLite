import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("or")
@Implements("GrandExchangeOfferUnitPriceComparator")
final class GrandExchangeOfferUnitPriceComparator implements Comparator {
	@ObfuscatedName("gg")
	@ObfuscatedGetter(
		intValue = 341959701
	)
	@Export("js5Port")
	static int js5Port;

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lox;Lox;I)I",
		garbageValue = "109102269"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.unitPrice < var2.grandExchangeOffer.unitPrice ? -1 : (var2.grandExchangeOffer.unitPrice == var1.grandExchangeOffer.unitPrice ? 0 : 1); // L: 43
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 51
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 47
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIIII[Lig;B)V",
		garbageValue = "1"
	)
	static final void method6973(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, CollisionMap[] var10) {
		int var12;
		for (int var11 = 0; var11 < 8; ++var11) { // L: 110
			for (var12 = 0; var12 < 8; ++var12) { // L: 111
				if (var11 + var2 > 0 && var11 + var2 < 103 && var3 + var12 > 0 && var3 + var12 < 103) { // L: 112
					int[] var10000 = var10[var1].flags[var11 + var2];
					var10000[var12 + var3] &= -16777217;
				}
			}
		}

		Buffer var19 = new Buffer(var0); // L: 115

		for (var12 = 0; var12 < 4; ++var12) { // L: 116
			for (int var13 = 0; var13 < 64; ++var13) { // L: 117
				for (int var14 = 0; var14 < 64; ++var14) { // L: 118
					if (var12 == var4 && var13 >= var5 && var13 < var5 + 8 && var14 >= var6 && var14 < var6 + 8) { // L: 119
						int var15 = var2 + class302.method5778(var13 & 7, var14 & 7, var7); // L: 120
						int var16 = var3 + FloorUnderlayDefinition.method3925(var13 & 7, var14 & 7, var7); // L: 121
						int var17 = (var13 & 7) + var8 + var2; // L: 122
						int var18 = var3 + (var14 & 7) + var9; // L: 123
						class60.loadTerrain(var19, var1, var15, var16, var17, var18, var7); // L: 124
					} else {
						class60.loadTerrain(var19, 0, -1, -1, 0, 0, 0); // L: 126
					}
				}
			}
		}

	} // L: 130

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Ltt;I)Ljava/lang/Object;",
		garbageValue = "629801824"
	)
	static Object method6979(class502 var0) {
		if (var0 == null) { // L: 5308
			throw new IllegalStateException("popValueOfType() failure - null baseVarType"); // L: 5309
		} else {
			switch(var0.field5036) { // L: 5311
			case 1:
				return Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5315
			case 2:
				return Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 5317
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type"); // L: 5313
			}
		}
	}
}
