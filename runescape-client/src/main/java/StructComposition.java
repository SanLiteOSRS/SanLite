import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ht")
@Implements("StructComposition")
public class StructComposition extends DualNode {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("StructDefinition_archive")
	static AbstractArchive StructDefinition_archive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("StructDefinition_cached")
	static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	StructComposition() {
	} // L: 16

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1436129588"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)V",
		garbageValue = "-1875219485"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) { // L: 38
				return;
			}

			this.decodeNext(var1, var2); // L: 39
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lsg;II)V",
		garbageValue = "-1196220711"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = ChatChannel.readStringIntParameters(var1, this.params); // L: 44
		}

	} // L: 46

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-33"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params; // L: 50
		int var3;
		if (var4 == null) { // L: 52
			var3 = var2; // L: 53
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1); // L: 56
			if (var5 == null) { // L: 57
				var3 = var2; // L: 58
			} else {
				var3 = var5.integer; // L: 61
			}
		}

		return var3; // L: 63
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1937714582"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return EnumComposition.method3750(this.params, var1, var2); // L: 67
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([Lnj;IS)Lnj;",
		garbageValue = "173"
	)
	@Export("findEnumerated")
	public static class356 findEnumerated(class356[] var0, int var1) {
		class356[] var2 = var0; // L: 17

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 18
			class356 var4 = var2[var3]; // L: 19
			if (var1 == var4.rsOrdinal()) {
				return var4; // L: 21
			}
		}

		return null; // L: 25
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	static void method3926() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 30
			if (var0.stream1 != null) { // L: 31
				class130.pcmStreamMixer.removeSubStream(var0.stream1); // L: 32
				var0.stream1 = null; // L: 33
			}

			if (var0.stream2 != null) { // L: 35
				class130.pcmStreamMixer.removeSubStream(var0.stream2); // L: 36
				var0.stream2 = null; // L: 37
			}
		}

		ObjectSound.objectSounds.clear(); // L: 40
	} // L: 41

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1887051425"
	)
	public static int method3940(int var0) {
		return var0 >> 17 & 7; // L: 13
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZI)I",
		garbageValue = "-1159908779"
	)
	static int method3939(int var0, Script var1, boolean var2) {
		boolean var3 = true; // L: 1067
		Widget var4;
		if (var0 >= 2000) { // L: 1069
			var0 -= 1000; // L: 1070
			var4 = class165.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1071
			var3 = false; // L: 1072
		} else {
			var4 = var2 ? SoundSystem.scriptDotWidget : class1.field5; // L: 1074
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) { // L: 1075
			var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1; // L: 1076
			if (var11 >= 0 && var11 <= 9) { // L: 1077
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]); // L: 1081
				return 1; // L: 1082
			} else {
				--SecureRandomCallable.Interpreter_stringStackSize; // L: 1078
				return 1; // L: 1079
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) { // L: 1084
				Interpreter.Interpreter_intStackSize -= 2; // L: 1085
				var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1086
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1087
				var4.parent = SoundSystem.getWidgetChild(var11, var6); // L: 1088
				return 1; // L: 1089
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) { // L: 1091
				var4.isScrollBar = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1092
				return 1; // L: 1093
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) { // L: 1095
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1096
				return 1; // L: 1097
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) { // L: 1099
				var4.dragThreshold = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1100
				return 1; // L: 1101
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) { // L: 1103
				var4.dataText = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 1104
				return 1; // L: 1105
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) { // L: 1107
				var4.spellActionName = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 1108
				return 1; // L: 1109
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) { // L: 1111
				var4.actions = null; // L: 1112
				return 1; // L: 1113
			} else if (var0 == 1308) { // L: 1115
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1116
				return 1; // L: 1117
			} else if (var0 == 1309) { // L: 1119
				--Interpreter.Interpreter_intStackSize; // L: 1120
				return 1; // L: 1121
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) { // L: 1123
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) { // L: 1153
						Interpreter.Interpreter_intStackSize -= 2; // L: 1154
						var5 = 10; // L: 1155
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]}; // L: 1156
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]}; // L: 1157
						class7.Widget_setKey(var4, var5, var8, var9); // L: 1158
						return 1; // L: 1159
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) { // L: 1161
						Interpreter.Interpreter_intStackSize -= 3; // L: 1162
						var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] - 1; // L: 1163
						var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1164
						var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 1165
						if (var11 >= 0 && var11 <= 9) { // L: 1166
							class68.Widget_setKeyRate(var4, var11, var6, var7); // L: 1169
							return 1; // L: 1170
						} else {
							throw new RuntimeException(); // L: 1167
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) { // L: 1172
						var5 = 10; // L: 1173
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1174
						var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1175
						class68.Widget_setKeyRate(var4, var5, var6, var7); // L: 1176
						return 1; // L: 1177
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) { // L: 1179
						--Interpreter.Interpreter_intStackSize; // L: 1180
						var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] - 1; // L: 1181
						if (var11 >= 0 && var11 <= 9) { // L: 1182
							ModeWhere.Widget_setKeyIgnoreHeld(var4, var11); // L: 1185
							return 1; // L: 1186
						} else {
							throw new RuntimeException(); // L: 1183
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) { // L: 1188
						var5 = 10; // L: 1189
						ModeWhere.Widget_setKeyIgnoreHeld(var4, var5); // L: 1190
						return 1; // L: 1191
					} else {
						return 2; // L: 1193
					}
				} else {
					byte[] var10 = null; // L: 1124
					var8 = null; // L: 1125
					if (var3) { // L: 1126
						Interpreter.Interpreter_intStackSize -= 10; // L: 1127

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize] >= 0; var7 += 2) { // L: 1129 1130
						}

						if (var7 > 0) { // L: 1132
							var10 = new byte[var7 / 2]; // L: 1133
							var8 = new byte[var7 / 2]; // L: 1134

							for (var7 -= 2; var7 >= 0; var7 -= 2) { // L: 1135
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize]; // L: 1136
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize + 1]; // L: 1137
							}
						}
					} else {
						Interpreter.Interpreter_intStackSize -= 2; // L: 1142
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]}; // L: 1143
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]}; // L: 1144
					}

					var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1; // L: 1146
					if (var7 >= 0 && var7 <= 9) { // L: 1147
						class7.Widget_setKey(var4, var7, var10, var8); // L: 1150
						return 1; // L: 1151
					} else {
						throw new RuntimeException(); // L: 1148
					}
				}
			}
		}
	}
}
