import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ao")
public final class class4 {
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = -957149443
	)
	static int field10;

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lio;",
		garbageValue = "-2052088854"
	)
	public static FloorOverlayDefinition method15(int var0) {
		FloorOverlayDefinition var1 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0); // L: 30
		if (var1 != null) { // L: 31
			return var1;
		} else {
			byte[] var2 = class30.FloorOverlayDefinition_archive.takeFile(4, var0); // L: 32
			var1 = new FloorOverlayDefinition(); // L: 33
			if (var2 != null) { // L: 34
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode(); // L: 35
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var1, (long)var0); // L: 36
			return var1; // L: 37
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "71"
	)
	static final void method16(int var0, int var1, int var2) {
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
		descriptor = "(ILds;ZI)I",
		garbageValue = "159845582"
	)
	static int method17(int var0, Script var1, boolean var2) {
		boolean var3 = true; // L: 1086
		Widget var4;
		if (var0 >= 2000) { // L: 1088
			var0 -= 1000; // L: 1089
			var4 = class33.field184.method6240(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1090
			var3 = false; // L: 1091
		} else {
			var4 = var2 ? class416.scriptDotWidget : class306.field3131; // L: 1093
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) { // L: 1094
			var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1; // L: 1095
			if (var11 >= 0 && var11 <= 9) { // L: 1096
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]); // L: 1100
				return 1; // L: 1101
			} else {
				--class180.Interpreter_stringStackSize; // L: 1097
				return 1; // L: 1098
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) { // L: 1103
				Interpreter.Interpreter_intStackSize -= 2; // L: 1104
				var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1105
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1106
				var4.parent = class33.field184.method6241(var11, var6); // L: 1107
				return 1; // L: 1108
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) { // L: 1110
				var4.isScrollBar = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1111
				return 1; // L: 1112
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) { // L: 1114
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1115
				return 1; // L: 1116
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) { // L: 1118
				var4.dragThreshold = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1119
				return 1; // L: 1120
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) { // L: 1122
				var4.dataText = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 1123
				return 1; // L: 1124
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) { // L: 1126
				var4.spellActionName = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 1127
				return 1; // L: 1128
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) { // L: 1130
				var4.actions = null; // L: 1131
				return 1; // L: 1132
			} else if (var0 == 1308) { // L: 1134
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1135
				return 1; // L: 1136
			} else if (var0 == 1309) { // L: 1138
				--Interpreter.Interpreter_intStackSize; // L: 1139
				return 1; // L: 1140
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) { // L: 1142
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) { // L: 1172
						Interpreter.Interpreter_intStackSize -= 2; // L: 1173
						var5 = 10; // L: 1174
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]}; // L: 1175
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]}; // L: 1176
						InterfaceParent.Widget_setKey(var4, var5, var8, var9); // L: 1177
						return 1; // L: 1178
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) { // L: 1180
						Interpreter.Interpreter_intStackSize -= 3; // L: 1181
						var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] - 1; // L: 1182
						var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1183
						var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 1184
						if (var11 >= 0 && var11 <= 9) { // L: 1185
							ScriptFrame.Widget_setKeyRate(var4, var11, var6, var7); // L: 1188
							return 1; // L: 1189
						} else {
							throw new RuntimeException(); // L: 1186
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) { // L: 1191
						var5 = 10; // L: 1192
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1193
						var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1194
						ScriptFrame.Widget_setKeyRate(var4, var5, var6, var7); // L: 1195
						return 1; // L: 1196
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) { // L: 1198
						--Interpreter.Interpreter_intStackSize; // L: 1199
						var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] - 1; // L: 1200
						if (var11 >= 0 && var11 <= 9) { // L: 1201
							class18.Widget_setKeyIgnoreHeld(var4, var11); // L: 1204
							return 1; // L: 1205
						} else {
							throw new RuntimeException(); // L: 1202
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) { // L: 1207
						var5 = 10; // L: 1208
						class18.Widget_setKeyIgnoreHeld(var4, var5); // L: 1209
						return 1; // L: 1210
					} else {
						return 2; // L: 1212
					}
				} else {
					byte[] var10 = null; // L: 1143
					var8 = null; // L: 1144
					if (var3) { // L: 1145
						Interpreter.Interpreter_intStackSize -= 10; // L: 1146

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize] >= 0; var7 += 2) { // L: 1148 1149
						}

						if (var7 > 0) { // L: 1151
							var10 = new byte[var7 / 2]; // L: 1152
							var8 = new byte[var7 / 2]; // L: 1153

							for (var7 -= 2; var7 >= 0; var7 -= 2) { // L: 1154
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize]; // L: 1155
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize + 1]; // L: 1156
							}
						}
					} else {
						Interpreter.Interpreter_intStackSize -= 2; // L: 1161
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]}; // L: 1162
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]}; // L: 1163
					}

					var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1; // L: 1165
					if (var7 >= 0 && var7 <= 9) { // L: 1166
						InterfaceParent.Widget_setKey(var4, var7, var10, var8); // L: 1169
						return 1; // L: 1170
					} else {
						throw new RuntimeException(); // L: 1167
					}
				}
			}
		}
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "1678584936"
	)
	static int method14(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == 8000) { // L: 5298
			--Interpreter.Interpreter_intStackSize; // L: 5299
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 5300
			var4 = Interpreter.Interpreter_arrayLengths[var3]; // L: 5301
			Frames.method4849(Interpreter.Interpreter_arrays[var3], new int[var4], 0, var4 - 1); // L: 5302
			return 1; // L: 5303
		} else if (var0 == 8001) { // L: 5305
			Interpreter.Interpreter_intStackSize -= 3; // L: 5306
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 5307
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 5308
			int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 5309
			int var6 = Interpreter.Interpreter_arrayLengths[var3]; // L: 5310
			if (var6 <= 1) { // L: 5311
				return 1;
			} else {
				class424.method7796(Interpreter.Interpreter_arrays[var3], var6, var4, var5); // L: 5312
				return 1; // L: 5313
			}
		} else {
			return 2; // L: 5315
		}
	}
}
