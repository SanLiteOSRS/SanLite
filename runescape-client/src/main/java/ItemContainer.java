import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ci")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("ds")
	static boolean field1020;
	@ObfuscatedName("f")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("c")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32); // L: 7
	}

	ItemContainer() {
		this.ids = new int[]{-1}; // L: 8
		this.quantities = new int[]{0}; // L: 9
	} // L: 11

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "208881986"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 27
		if (var4 == null) { // L: 28
			var4 = new ChatChannel(); // L: 29
			Messages.Messages_channels.put(var0, var4); // L: 30
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3); // L: 32
		Messages.Messages_hashTable.put(var5, (long)var5.count); // L: 33
		Messages.Messages_queue.add(var5); // L: 34
		Client.chatCycle = Client.cycleCntr; // L: 35
	} // L: 36

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "108133089"
	)
	public static boolean method2221(int var0) {
		return var0 == WorldMapDecorationType.field3694.id; // L: 47
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)Ldq;",
		garbageValue = "-65"
	)
	static class126 method2225(int var0) {
		class126 var1 = (class126)DecorativeObject.findEnumerated(class14.method178(), var0); // L: 82
		if (var1 == null) {
			var1 = class126.field1519; // L: 83
		}

		return var1; // L: 84
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZB)I",
		garbageValue = "-114"
	)
	static int method2219(int var0, Script var1, boolean var2) {
		boolean var3 = true; // L: 1050
		Widget var4;
		if (var0 >= 2000) { // L: 1052
			var0 -= 1000; // L: 1053
			var4 = class281.getWidget(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]); // L: 1054
			var3 = false; // L: 1055
		} else {
			var4 = var2 ? class140.scriptDotWidget : class136.field1589; // L: 1057
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) { // L: 1058
			var11 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] - 1; // L: 1059
			if (var11 >= 0 && var11 <= 9) { // L: 1060
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]); // L: 1064
				return 1; // L: 1065
			} else {
				--class125.Interpreter_stringStackSize; // L: 1061
				return 1; // L: 1062
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) { // L: 1067
				class379.Interpreter_intStackSize -= 2; // L: 1068
				var11 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 1069
				var6 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 1070
				var4.parent = WorldMapDecoration.getWidgetChild(var11, var6); // L: 1071
				return 1; // L: 1072
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) { // L: 1074
				var4.isScrollBar = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 1075
				return 1; // L: 1076
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) { // L: 1078
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 1079
				return 1; // L: 1080
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) { // L: 1082
				var4.dragThreshold = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 1083
				return 1; // L: 1084
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) { // L: 1086
				var4.dataText = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 1087
				return 1; // L: 1088
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) { // L: 1090
				var4.spellActionName = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 1091
				return 1; // L: 1092
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) { // L: 1094
				var4.actions = null; // L: 1095
				return 1; // L: 1096
			} else if (var0 == 1308) { // L: 1098
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 1099
				return 1; // L: 1100
			} else if (var0 == 1309) { // L: 1102
				--class379.Interpreter_intStackSize; // L: 1103
				return 1; // L: 1104
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) { // L: 1106
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) { // L: 1136
						class379.Interpreter_intStackSize -= 2; // L: 1137
						var5 = 10; // L: 1138
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]}; // L: 1139
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]}; // L: 1140
						GameObject.Widget_setKey(var4, var5, var8, var9); // L: 1141
						return 1; // L: 1142
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) { // L: 1144
						class379.Interpreter_intStackSize -= 3; // L: 1145
						var11 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize] - 1; // L: 1146
						var6 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 1147
						var7 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2]; // L: 1148
						if (var11 >= 0 && var11 <= 9) { // L: 1149
							UserComparator9.Widget_setKeyRate(var4, var11, var6, var7); // L: 1152
							return 1; // L: 1153
						} else {
							throw new RuntimeException(); // L: 1150
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) { // L: 1155
						var5 = 10; // L: 1156
						var6 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 1157
						var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 1158
						UserComparator9.Widget_setKeyRate(var4, var5, var6, var7); // L: 1159
						return 1; // L: 1160
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) { // L: 1162
						--class379.Interpreter_intStackSize; // L: 1163
						var11 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize] - 1; // L: 1164
						if (var11 >= 0 && var11 <= 9) { // L: 1165
							class355.Widget_setKeyIgnoreHeld(var4, var11); // L: 1168
							return 1; // L: 1169
						} else {
							throw new RuntimeException(); // L: 1166
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) { // L: 1171
						var5 = 10; // L: 1172
						class355.Widget_setKeyIgnoreHeld(var4, var5); // L: 1173
						return 1; // L: 1174
					} else {
						return 2; // L: 1176
					}
				} else {
					byte[] var10 = null; // L: 1107
					var8 = null; // L: 1108
					if (var3) { // L: 1109
						class379.Interpreter_intStackSize -= 10; // L: 1110

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + class379.Interpreter_intStackSize] >= 0; var7 += 2) { // L: 1112 1113
						}

						if (var7 > 0) { // L: 1115
							var10 = new byte[var7 / 2]; // L: 1116
							var8 = new byte[var7 / 2]; // L: 1117

							for (var7 -= 2; var7 >= 0; var7 -= 2) { // L: 1118
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class379.Interpreter_intStackSize]; // L: 1119
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class379.Interpreter_intStackSize + 1]; // L: 1120
							}
						}
					} else {
						class379.Interpreter_intStackSize -= 2; // L: 1125
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]}; // L: 1126
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]}; // L: 1127
					}

					var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] - 1; // L: 1129
					if (var7 >= 0 && var7 <= 9) { // L: 1130
						GameObject.Widget_setKey(var4, var7, var10, var8); // L: 1133
						return 1; // L: 1134
					} else {
						throw new RuntimeException(); // L: 1131
					}
				}
			}
		}
	}
}
