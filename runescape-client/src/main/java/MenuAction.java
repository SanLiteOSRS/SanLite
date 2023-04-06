import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 527249605
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 959479433
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -960629835
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1689906525
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1789049845
	)
	int field875;
	@ObfuscatedName("ao")
	String field871;
	@ObfuscatedName("av")
	String field877;

	MenuAction() {
	} // L: 12432

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1912599738"
	)
	static final void method2052(int var0, int var1, int var2) {
		int var3;
		for (var3 = 0; var3 < 8; ++var3) { // L: 179
			for (int var4 = 0; var4 < 8; ++var4) { // L: 180
				Tiles.Tiles_heights[var0][var3 + var1][var4 + var2] = 0;
			}
		}

		if (var1 > 0) { // L: 182
			for (var3 = 1; var3 < 8; ++var3) { // L: 183
				Tiles.Tiles_heights[var0][var1][var3 + var2] = Tiles.Tiles_heights[var0][var1 - 1][var3 + var2];
			}
		}

		if (var2 > 0) { // L: 185
			for (var3 = 1; var3 < 8; ++var3) { // L: 186
				Tiles.Tiles_heights[var0][var3 + var1][var2] = Tiles.Tiles_heights[var0][var3 + var1][var2 - 1];
			}
		}

		if (var1 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2] != 0) { // L: 188
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2];
		} else if (var2 > 0 && Tiles.Tiles_heights[var0][var1][var2 - 1] != 0) { // L: 189
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1][var2 - 1];
		} else if (var1 > 0 && var2 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2 - 1] != 0) { // L: 190
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2 - 1];
		}

	} // L: 191

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZS)I",
		garbageValue = "-3054"
	)
	static int method2053(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) { // L: 2798
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2799
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field712.method4074(var3) ? 1 : 0; // L: 2800
			return 1; // L: 2801
		} else if (var0 == 3501) { // L: 2803
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2804
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field712.method4082(var3) ? 1 : 0; // L: 2805
			return 1; // L: 2806
		} else if (var0 == 3502) { // L: 2808
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2809
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field712.method4079(var3) ? 1 : 0; // L: 2810
			return 1; // L: 2811
		} else {
			return 2; // L: 2813
		}
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(Ldq;I)V",
		garbageValue = "65185183"
	)
	static final void method2054(Actor var0) {
		int var2;
		int var3;
		int var4;
		int var6;
		if (var0.targetIndex != -1) { // L: 4057
			Object var1 = null; // L: 4058
			var2 = 65536; // L: 4059
			if (var0.targetIndex < var2) { // L: 4060
				var1 = Client.npcs[var0.targetIndex]; // L: 4061
			} else {
				var1 = Client.players[var0.targetIndex - var2]; // L: 4064
			}

			if (var1 != null) { // L: 4066
				var3 = var0.x - ((Actor)var1).x; // L: 4067
				var4 = var0.y - ((Actor)var1).y; // L: 4068
				if (var3 != 0 || var4 != 0) { // L: 4069
					var6 = (int)(Math.atan2((double)var3, (double)var4) * 325.94932345220167D) & 2047; // L: 4073
					var0.orientation = var6; // L: 4075
				}
			} else if (var0.false0) { // L: 4078
				var0.targetIndex = -1; // L: 4079
				var0.false0 = false; // L: 4080
			}
		}

		int var7;
		if (var0.pathLength == 0 || var0.field1214 > 0) { // L: 4083
			var7 = -1; // L: 4084
			if (var0.field1180 != -1 && var0.field1176 != -1) { // L: 4085
				var2 = var0.field1180 * 128 - GameEngine.baseX * 8192 + 64; // L: 4086
				var3 = var0.field1176 * 128 - class178.baseY * 8192 + 64; // L: 4087
				var4 = var0.x - var2; // L: 4088
				int var8 = var0.y - var3; // L: 4089
				if (var4 != 0 || var8 != 0) { // L: 4090
					var6 = (int)(Math.atan2((double)var4, (double)var8) * 325.94932345220167D) & 2047; // L: 4093
					var7 = var6; // L: 4095
				}
			} else if (var0.field1164 != -1) { // L: 4098
				var7 = var0.field1164; // L: 4099
			}

			if (var7 != -1) { // L: 4101
				var0.orientation = var7; // L: 4102
				if (var0.field1157) { // L: 4103
					var0.rotation = var0.orientation; // L: 4104
				}
			}

			var0.method2362(); // L: 4107
		}

		var7 = var0.orientation - var0.rotation & 2047; // L: 4109
		if (var7 != 0) { // L: 4110
			boolean var10 = true; // L: 4111
			boolean var11 = true; // L: 4112
			++var0.field1208; // L: 4113
			var4 = var7 > 1024 ? -1 : 1; // L: 4114
			var0.rotation += var0.field1209 * var4; // L: 4115
			boolean var12 = true; // L: 4116
			if (var7 < var0.field1209 || var7 > 2048 - var0.field1209) { // L: 4117
				var0.rotation = var0.orientation; // L: 4118
				var12 = false; // L: 4119
			}

			if (var0.field1209 > 0 && var0.idleSequence == var0.movementSequence && (var0.field1208 > 25 || var12)) { // L: 4121
				if (var4 == -1 && var0.turnLeftSequence != -1) { // L: 4122
					var0.movementSequence = var0.turnLeftSequence; // L: 4123
				} else if (var4 == 1 && var0.turnRightSequence != -1) { // L: 4125
					var0.movementSequence = var0.turnRightSequence; // L: 4126
				} else {
					var0.movementSequence = var0.walkSequence; // L: 4129
				}
			}

			var0.rotation &= 2047; // L: 4133
		} else {
			if (var0.false0) { // L: 4136
				var0.targetIndex = -1; // L: 4137
				var0.false0 = false; // L: 4138
			}

			var0.field1208 = 0; // L: 4140
		}

	} // L: 4142
}
