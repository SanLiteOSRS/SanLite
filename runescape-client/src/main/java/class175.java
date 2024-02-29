import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gp")
public class class175 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	public static EvictingDualNodeHashTable field1851;

	static {
		field1851 = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I[IIS)V",
		garbageValue = "-13799"
	)
	static void method3548(int var0, int[] var1, int var2) {
		for (int var3 = 0; var3 < KitDefinition.field1894; ++var3) { // L: 80
			KitDefinition var4 = GrandExchangeOfferWorldComparator.KitDefinition_get(var3); // L: 81
			if (var4 != null && !var4.nonSelectable && var4.bodypartID == (var0 == 1 ? 7 : 0) + var2) { // L: 82
				var1[PlayerComposition.equipmentIndices[var2]] = var3 + 256; // L: 83
				break;
			}
		}

	} // L: 87

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "36"
	)
	public static boolean method3550(int var0) {
		return (var0 >> 21 & 1) != 0; // L: 21
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "1"
	)
	static int method3549(int var0, Script var1, boolean var2) {
		boolean var3 = true; // L: 1116
		Widget var4;
		if (var0 >= 2000) { // L: 1118
			var0 -= 1000; // L: 1119
			var4 = ArchiveLoader.field1070.method6431(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1120
			var3 = false; // L: 1121
		} else {
			var4 = var2 ? Interpreter.scriptDotWidget : class141.field1644; // L: 1123
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) { // L: 1124
			var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1; // L: 1125
			if (var11 >= 0 && var11 <= 9) { // L: 1126
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]); // L: 1130
				return 1; // L: 1131
			} else {
				--class60.Interpreter_stringStackSize; // L: 1127
				return 1; // L: 1128
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) { // L: 1133
				Interpreter.Interpreter_intStackSize -= 2; // L: 1134
				var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1135
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1136
				var4.parent = ArchiveLoader.field1070.method6433(var11, var6); // L: 1137
				return 1; // L: 1138
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) { // L: 1140
				var4.isScrollBar = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1141
				return 1; // L: 1142
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) { // L: 1144
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1145
				return 1; // L: 1146
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) { // L: 1148
				var4.dragThreshold = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1149
				return 1; // L: 1150
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) { // L: 1152
				var4.dataText = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 1153
				return 1; // L: 1154
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) { // L: 1156
				var4.spellActionName = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 1157
				return 1; // L: 1158
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) { // L: 1160
				var4.actions = null; // L: 1161
				return 1; // L: 1162
			} else if (var0 == 1308) { // L: 1164
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1165
				return 1; // L: 1166
			} else if (var0 == 1309) { // L: 1168
				--Interpreter.Interpreter_intStackSize; // L: 1169
				return 1; // L: 1170
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) { // L: 1172
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) { // L: 1202
						Interpreter.Interpreter_intStackSize -= 2; // L: 1203
						var5 = 10; // L: 1204
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]}; // L: 1205
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]}; // L: 1206
						ModeWhere.Widget_setKey(var4, var5, var8, var9); // L: 1207
						return 1; // L: 1208
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) { // L: 1210
						Interpreter.Interpreter_intStackSize -= 3; // L: 1211
						var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] - 1; // L: 1212
						var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1213
						var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 1214
						if (var11 >= 0 && var11 <= 9) { // L: 1215
							MouseHandler.Widget_setKeyRate(var4, var11, var6, var7); // L: 1218
							return 1; // L: 1219
						} else {
							throw new RuntimeException(); // L: 1216
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) { // L: 1221
						var5 = 10; // L: 1222
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1223
						var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1224
						MouseHandler.Widget_setKeyRate(var4, var5, var6, var7); // L: 1225
						return 1; // L: 1226
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) { // L: 1228
						--Interpreter.Interpreter_intStackSize; // L: 1229
						var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] - 1; // L: 1230
						if (var11 >= 0 && var11 <= 9) { // L: 1231
							class125.Widget_setKeyIgnoreHeld(var4, var11); // L: 1234
							return 1; // L: 1235
						} else {
							throw new RuntimeException(); // L: 1232
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) { // L: 1237
						var5 = 10; // L: 1238
						class125.Widget_setKeyIgnoreHeld(var4, var5); // L: 1239
						return 1; // L: 1240
					} else {
						return 2; // L: 1242
					}
				} else {
					byte[] var10 = null; // L: 1173
					var8 = null; // L: 1174
					if (var3) { // L: 1175
						Interpreter.Interpreter_intStackSize -= 10; // L: 1176

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize] >= 0; var7 += 2) { // L: 1178 1179
						}

						if (var7 > 0) { // L: 1181
							var10 = new byte[var7 / 2]; // L: 1182
							var8 = new byte[var7 / 2]; // L: 1183

							for (var7 -= 2; var7 >= 0; var7 -= 2) { // L: 1184
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize]; // L: 1185
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize + 1]; // L: 1186
							}
						}
					} else {
						Interpreter.Interpreter_intStackSize -= 2; // L: 1191
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]}; // L: 1192
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]}; // L: 1193
					}

					var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1; // L: 1195
					if (var7 >= 0 && var7 <= 9) { // L: 1196
						ModeWhere.Widget_setKey(var4, var7, var10, var8); // L: 1199
						return 1; // L: 1200
					} else {
						throw new RuntimeException(); // L: 1197
					}
				}
			}
		}
	}
}
