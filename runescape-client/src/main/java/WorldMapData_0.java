import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jn")
@Implements("WorldMapData_0")
public class WorldMapData_0 extends AbstractWorldMapData {
	WorldMapData_0() {
	} // L: 6

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltl;B)V",
		garbageValue = "125"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 9
		if (var2 != WorldMapID.field3038.value) { // L: 10
			throw new IllegalStateException(""); // L: 11
		} else {
			super.minPlane = var1.readUnsignedByte(); // L: 13
			super.planes = var1.readUnsignedByte(); // L: 14
			super.regionXLow = var1.readUnsignedShort() * 64; // L: 15
			super.regionYLow = var1.readUnsignedShort() * 64; // L: 16
			super.regionX = var1.readUnsignedShort(); // L: 17
			super.regionY = var1.readUnsignedShort(); // L: 18
			super.groupId = var1.method9077(); // L: 19
			super.fileId = var1.method9077(); // L: 20
		}
	} // L: 21

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "-448699920"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4); // L: 25
		super.floorUnderlayIds = new short[1][64][64]; // L: 26
		super.floorOverlayIds = new short[super.planes][64][64]; // L: 27
		super.field3008 = new byte[super.planes][64][64]; // L: 28
		super.field2994 = new byte[super.planes][64][64]; // L: 29
		super.decorations = new WorldMapDecoration[super.planes][64][64][]; // L: 30
		int var2 = var1.readUnsignedByte(); // L: 31
		if (var2 != class270.field3033.value) { // L: 32
			throw new IllegalStateException(""); // L: 33
		} else {
			int var3 = var1.readUnsignedByte(); // L: 35
			int var4 = var1.readUnsignedByte(); // L: 36
			if (var3 == super.regionX && var4 == super.regionY) { // L: 37
				for (int var5 = 0; var5 < 64; ++var5) { // L: 40
					for (int var6 = 0; var6 < 64; ++var6) { // L: 41
						this.readTile(var5, var6, var1); // L: 42
					}
				}

			} else {
				throw new IllegalStateException(""); // L: 38
			}
		}
	} // L: 45

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_0)) { // L: 49
			return false; // L: 50
		} else {
			WorldMapData_0 var2 = (WorldMapData_0)var1; // L: 52
			return var2.regionX == super.regionX && var2.regionY == super.regionY; // L: 53
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8; // L: 58
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZB)I",
		garbageValue = "9"
	)
	static int method5128(int var0, Script var1, boolean var2) {
		boolean var3 = true; // L: 1072
		Widget var4;
		if (var0 >= 2000) { // L: 1074
			var0 -= 1000; // L: 1075
			var4 = Interpreter.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1076
			var3 = false; // L: 1077
		} else {
			var4 = var2 ? Interpreter.scriptDotWidget : class184.field1907; // L: 1079
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) { // L: 1080
			var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1; // L: 1081
			if (var11 >= 0 && var11 <= 9) { // L: 1082
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]); // L: 1086
				return 1; // L: 1087
			} else {
				--class179.Interpreter_stringStackSize; // L: 1083
				return 1; // L: 1084
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) { // L: 1089
				Interpreter.Interpreter_intStackSize -= 2; // L: 1090
				var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1091
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1092
				var4.parent = ServerPacket.getWidgetChild(var11, var6); // L: 1093
				return 1; // L: 1094
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) { // L: 1096
				var4.isScrollBar = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1097
				return 1; // L: 1098
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) { // L: 1100
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1101
				return 1; // L: 1102
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) { // L: 1104
				var4.dragThreshold = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1105
				return 1; // L: 1106
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) { // L: 1108
				var4.dataText = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 1109
				return 1; // L: 1110
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) { // L: 1112
				var4.spellActionName = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 1113
				return 1; // L: 1114
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) { // L: 1116
				var4.actions = null; // L: 1117
				return 1; // L: 1118
			} else if (var0 == 1308) { // L: 1120
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1121
				return 1; // L: 1122
			} else if (var0 == 1309) { // L: 1124
				--Interpreter.Interpreter_intStackSize; // L: 1125
				return 1; // L: 1126
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) { // L: 1128
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) { // L: 1158
						Interpreter.Interpreter_intStackSize -= 2; // L: 1159
						var5 = 10; // L: 1160
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]}; // L: 1161
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]}; // L: 1162
						ObjectComposition.Widget_setKey(var4, var5, var8, var9); // L: 1163
						return 1; // L: 1164
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) { // L: 1166
						Interpreter.Interpreter_intStackSize -= 3; // L: 1167
						var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] - 1; // L: 1168
						var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1169
						var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 1170
						if (var11 >= 0 && var11 <= 9) { // L: 1171
							class385.Widget_setKeyRate(var4, var11, var6, var7); // L: 1174
							return 1; // L: 1175
						} else {
							throw new RuntimeException(); // L: 1172
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) { // L: 1177
						var5 = 10; // L: 1178
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1179
						var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1180
						class385.Widget_setKeyRate(var4, var5, var6, var7); // L: 1181
						return 1; // L: 1182
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) { // L: 1184
						--Interpreter.Interpreter_intStackSize; // L: 1185
						var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] - 1; // L: 1186
						if (var11 >= 0 && var11 <= 9) { // L: 1187
							class89.Widget_setKeyIgnoreHeld(var4, var11); // L: 1190
							return 1; // L: 1191
						} else {
							throw new RuntimeException(); // L: 1188
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) { // L: 1193
						var5 = 10; // L: 1194
						class89.Widget_setKeyIgnoreHeld(var4, var5); // L: 1195
						return 1; // L: 1196
					} else {
						return 2; // L: 1198
					}
				} else {
					byte[] var10 = null; // L: 1129
					var8 = null; // L: 1130
					if (var3) { // L: 1131
						Interpreter.Interpreter_intStackSize -= 10; // L: 1132

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize] >= 0; var7 += 2) { // L: 1134 1135
						}

						if (var7 > 0) { // L: 1137
							var10 = new byte[var7 / 2]; // L: 1138
							var8 = new byte[var7 / 2]; // L: 1139

							for (var7 -= 2; var7 >= 0; var7 -= 2) { // L: 1140
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize]; // L: 1141
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize + 1]; // L: 1142
							}
						}
					} else {
						Interpreter.Interpreter_intStackSize -= 2; // L: 1147
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]}; // L: 1148
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]}; // L: 1149
					}

					var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1; // L: 1151
					if (var7 >= 0 && var7 <= 9) { // L: 1152
						ObjectComposition.Widget_setKey(var4, var7, var10, var8); // L: 1155
						return 1; // L: 1156
					} else {
						throw new RuntimeException(); // L: 1153
					}
				}
			}
		}
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2115332233"
	)
	static final void method5134(int var0, int var1) {
		if (Client.menuOptionsCount >= 2 || Client.isItemSelected != 0 || Client.isSpellSelected) { // L: 9097
			if (Client.showMouseOverText) { // L: 9098
				int var2 = Client.menuOptionsCount - 1; // L: 9101
				String var4;
				if (Client.isItemSelected == 1 && Client.menuOptionsCount < 2) { // L: 9105
					var4 = "Use" + " " + Client.field661 + " " + "->";
				} else if (Client.isSpellSelected && Client.menuOptionsCount < 2) { // L: 9106
					var4 = Client.field665 + " " + Client.field666 + " " + "->";
				} else {
					String var5;
					if (var2 < 0) { // L: 9110
						var5 = ""; // L: 9111
					} else if (Client.menuTargets[var2].length() > 0) { // L: 9114
						var5 = Client.menuActions[var2] + " " + Client.menuTargets[var2];
					} else {
						var5 = Client.menuActions[var2]; // L: 9115
					}

					var4 = var5; // L: 9117
				}

				if (Client.menuOptionsCount > 2) { // L: 9119
					var4 = var4 + class17.colorStartTag(16777215) + " " + '/' + " " + (Client.menuOptionsCount - 2) + " more options";
				}

				class290.fontBold12.drawRandomAlphaAndSpacing(var4, var0 + 4, var1 + 15, 16777215, 0, Client.cycle / 1000); // L: 9120
			}
		}
	} // L: 9121
}
