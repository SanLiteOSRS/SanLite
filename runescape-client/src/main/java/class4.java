import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
public final class class4 {
	@ObfuscatedName("go")
	static String field6;

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1502809399"
	)
	static final void method17(int var0, int var1, int var2) {
		int var3;
		for (var3 = 0; var3 < 8; ++var3) { // L: 154
			for (int var4 = 0; var4 < 8; ++var4) { // L: 155
				Tiles.Tiles_heights[var0][var3 + var1][var4 + var2] = 0;
			}
		}

		if (var1 > 0) { // L: 157
			for (var3 = 1; var3 < 8; ++var3) { // L: 158
				Tiles.Tiles_heights[var0][var1][var3 + var2] = Tiles.Tiles_heights[var0][var1 - 1][var3 + var2];
			}
		}

		if (var2 > 0) { // L: 160
			for (var3 = 1; var3 < 8; ++var3) { // L: 161
				Tiles.Tiles_heights[var0][var3 + var1][var2] = Tiles.Tiles_heights[var0][var3 + var1][var2 - 1];
			}
		}

		if (var1 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2] != 0) { // L: 163
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2];
		} else if (var2 > 0 && Tiles.Tiles_heights[var0][var1][var2 - 1] != 0) { // L: 164
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1][var2 - 1];
		} else if (var1 > 0 && var2 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2 - 1] != 0) { // L: 165
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2 - 1];
		}

	} // L: 166

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lmo;I)I",
		garbageValue = "295119715"
	)
	static int method15(Widget var0) {
		if (var0.type != 11) { // L: 1547
			--class156.Interpreter_stringStackSize; // L: 1548
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = -1; // L: 1549
			return 1; // L: 1550
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 1552
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var0.method6452(var1); // L: 1553
			return 1; // L: 1554
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZB)I",
		garbageValue = "-50"
	)
	static int method19(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) { // L: 2823
			var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 2824
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Client.field759.method4087(var3) ? 1 : 0; // L: 2825
			return 1; // L: 2826
		} else if (var0 == 3501) { // L: 2828
			var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 2829
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Client.field759.method4086(var3) ? 1 : 0; // L: 2830
			return 1; // L: 2831
		} else if (var0 == 3502) { // L: 2833
			var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 2834
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Client.field759.method4088(var3) ? 1 : 0; // L: 2835
			return 1; // L: 2836
		} else {
			return 2; // L: 2838
		}
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1547708869"
	)
	static final void method13(int var0, int var1, int var2, int var3) {
		Client.field516 = 0; // L: 5645
		int var4 = class147.baseX * 64 + (HitSplatDefinition.localPlayer.x >> 7); // L: 5646
		int var5 = ModeWhere.baseY * 64 + (HitSplatDefinition.localPlayer.y >> 7); // L: 5647
		if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) { // L: 5648
			Client.field516 = 1;
		}

		if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) { // L: 5649
			Client.field516 = 1;
		}

		if (Client.field516 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) { // L: 5650
			Client.field516 = 0;
		}

	} // L: 5652

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-607155483"
	)
	static boolean method18(int var0) {
		for (int var1 = 0; var1 < Client.field570; ++var1) { // L: 11663
			if (Client.field720[var1] == var0) { // L: 11664
				return true;
			}
		}

		return false; // L: 11666
	}

	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "107686639"
	)
	public static boolean method14() {
		return Client.clickedWidget != null; // L: 12640
	}
}
