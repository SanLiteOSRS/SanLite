import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cn")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("ag")
	@Export("SpriteBuffer_spriteHeights")
	static int[] SpriteBuffer_spriteHeights;
	@ObfuscatedName("av")
	static String[] field494;
	@ObfuscatedName("gf")
	@ObfuscatedGetter(
		intValue = 241592107
	)
	@Export("currentPort")
	static int currentPort;
	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("scene")
	static Scene scene;
	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "[Luc;"
	)
	static SpritePixels[] field495;
	@ObfuscatedName("am")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	} // L: 12872

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Loo;Loo;B)I",
		garbageValue = "0"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) { // L: 12875
			return 0;
		} else {
			if (this.filterWorlds) { // L: 12876
				if (Client.worldId == var1.world) { // L: 12877
					return -1;
				}

				if (var2.world == Client.worldId) { // L: 12878
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1; // L: 12880
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 12884
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 12888
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Low;I)V",
		garbageValue = "510637872"
	)
	public static void method1248(AbstractArchive var0) {
		class436.VarbitDefinition_archive = var0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Lol;IB)Llr;",
		garbageValue = "4"
	)
	public static PacketBufferNode method1249(int var0, String var1, Language var2, int var3) {
		PacketBufferNode var4 = class482.getPacketBufferNode(ClientPacket.field3164, Client.packetWriter.isaacCipher); // L: 23
		var4.packetBuffer.writeByte(0); // L: 24
		int var5 = var4.packetBuffer.offset; // L: 25
		var4.packetBuffer.writeByte(var0); // L: 26
		String var6 = var1.toLowerCase(); // L: 27
		int var7 = 0; // L: 28
		byte[] var8 = null; // L: 29
		if (var6.startsWith("yellow:")) { // L: 30
			var7 = 0; // L: 31
			var1 = var1.substring("yellow:".length()); // L: 32
		} else if (var6.startsWith("red:")) { // L: 34
			var7 = 1; // L: 35
			var1 = var1.substring("red:".length()); // L: 36
		} else if (var6.startsWith("green:")) { // L: 38
			var7 = 2; // L: 39
			var1 = var1.substring("green:".length()); // L: 40
		} else if (var6.startsWith("cyan:")) { // L: 42
			var7 = 3; // L: 43
			var1 = var1.substring("cyan:".length());
		} else if (var6.startsWith("purple:")) {
			var7 = 4; // L: 47
			var1 = var1.substring("purple:".length()); // L: 48
		} else if (var6.startsWith("white:")) { // L: 50
			var7 = 5; // L: 51
			var1 = var1.substring("white:".length()); // L: 52
		} else if (var6.startsWith("flash1:")) { // L: 54
			var7 = 6; // L: 55
			var1 = var1.substring("flash1:".length()); // L: 56
		} else if (var6.startsWith("flash2:")) { // L: 58
			var7 = 7; // L: 59
			var1 = var1.substring("flash2:".length()); // L: 60
		} else if (var6.startsWith("flash3:")) { // L: 62
			var7 = 8; // L: 63
			var1 = var1.substring("flash3:".length()); // L: 64
		} else if (var6.startsWith("glow1:")) { // L: 66
			var7 = 9; // L: 67
			var1 = var1.substring("glow1:".length()); // L: 68
		} else if (var6.startsWith("glow2:")) { // L: 70
			var7 = 10; // L: 71
			var1 = var1.substring("glow2:".length()); // L: 72
		} else if (var6.startsWith("glow3:")) { // L: 74
			var7 = 11; // L: 75
			var1 = var1.substring("glow3:".length());
		} else if (var6.startsWith("rainbow:")) {
			var7 = 12;
			var1 = var1.substring("rainbow:".length());
		} else if (var6.startsWith("pattern")) {
			var8 = CollisionMap.method4475(var6);
			if (var8 != null) { // L: 84
				var7 = var8.length + 12; // L: 85
				var1 = var1.substring("pattern".length() + var8.length + 1); // L: 86
			}
		}

		var6 = var1.toLowerCase(); // L: 89
		byte var9 = 0; // L: 90
		if (var6.startsWith("wave:")) { // L: 91
			var9 = 1; // L: 92
			var1 = var1.substring("wave:".length()); // L: 93
		} else if (var6.startsWith("wave2:")) { // L: 95
			var9 = 2; // L: 96
			var1 = var1.substring("wave2:".length()); // L: 97
		} else if (var6.startsWith("shake:")) { // L: 99
			var9 = 3; // L: 100
			var1 = var1.substring("shake:".length()); // L: 101
		} else if (var6.startsWith("scroll:")) { // L: 103
			var9 = 4; // L: 104
			var1 = var1.substring("scroll:".length()); // L: 105
		} else if (var6.startsWith("slide:")) { // L: 107
			var9 = 5; // L: 108
			var1 = var1.substring("slide:".length()); // L: 109
		}

		var4.packetBuffer.writeByte(var7); // L: 111
		var4.packetBuffer.writeByte(var9); // L: 112
		if (var8 != null) { // L: 113
			for (int var10 = 0; var10 < var8.length; ++var10) { // L: 114
				var4.packetBuffer.writeByte(var8[var10]); // L: 115
			}
		}

		class228.method4502(var4.packetBuffer, var1); // L: 118
		if (var0 == class354.field3879.rsOrdinal()) { // L: 119
			var4.packetBuffer.writeByte(var3); // L: 120
		}

		var4.packetBuffer.method9384(var4.packetBuffer.offset - var5); // L: 122
		return var4; // L: 123
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1094781056"
	)
	static final void method1245(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) { // L: 76
			for (int var5 = var0; var5 <= var0 + var2; ++var5) { // L: 77
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) { // L: 78
					AbstractRasterProvider.field5260[0][var5][var4] = 127; // L: 79
					if (var0 == var5 && var5 > 0) { // L: 80
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var0 + var2 == var5 && var5 < 103) { // L: 81
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) { // L: 82
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var4 == var3 + var1 && var4 < 103) { // L: 83
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	} // L: 87

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1486275010"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 44
		return var1 == null ? 0 : var1.size(); // L: 45 46
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "-938624560"
	)
	static int method1247(int var0, Script var1, boolean var2) {
		boolean var3 = true; // L: 1116
		Widget var4;
		if (var0 >= 2000) { // L: 1118
			var0 -= 1000; // L: 1119
			var4 = class380.field4414.method6348(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]); // L: 1120
			var3 = false; // L: 1121
		} else {
			var4 = var2 ? class31.scriptDotWidget : class185.field1932; // L: 1123
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) { // L: 1124
			var11 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] - 1; // L: 1125
			if (var11 >= 0 && var11 <= 9) { // L: 1126
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]); // L: 1130
				return 1; // L: 1131
			} else {
				--class211.Interpreter_stringStackSize; // L: 1127
				return 1; // L: 1128
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) { // L: 1133
				UserComparator6.Interpreter_intStackSize -= 2; // L: 1134
				var11 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 1135
				var6 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 1136
				var4.parent = class380.field4414.method6347(var11, var6); // L: 1137
				return 1; // L: 1138
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) { // L: 1140
				var4.isScrollBar = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 1141
				return 1; // L: 1142
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) { // L: 1144
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 1145
				return 1; // L: 1146
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) { // L: 1148
				var4.dragThreshold = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 1149
				return 1; // L: 1150
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) { // L: 1152
				var4.dataText = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 1153
				return 1; // L: 1154
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) { // L: 1156
				var4.spellActionName = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 1157
				return 1; // L: 1158
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) { // L: 1160
				var4.actions = null; // L: 1161
				return 1; // L: 1162
			} else if (var0 == 1308) { // L: 1164
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 1165
				return 1; // L: 1166
			} else if (var0 == 1309) { // L: 1168
				--UserComparator6.Interpreter_intStackSize; // L: 1169
				return 1; // L: 1170
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) { // L: 1172
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) { // L: 1202
						UserComparator6.Interpreter_intStackSize -= 2; // L: 1203
						var5 = 10; // L: 1204
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]}; // L: 1205
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]}; // L: 1206
						KeyHandler.Widget_setKey(var4, var5, var8, var9); // L: 1207
						return 1; // L: 1208
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) { // L: 1210
						UserComparator6.Interpreter_intStackSize -= 3; // L: 1211
						var11 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize] - 1; // L: 1212
						var6 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 1213
						var7 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2]; // L: 1214
						if (var11 >= 0 && var11 <= 9) { // L: 1215
							class222.Widget_setKeyRate(var4, var11, var6, var7); // L: 1218
							return 1; // L: 1219
						} else {
							throw new RuntimeException(); // L: 1216
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) { // L: 1221
						var5 = 10; // L: 1222
						var6 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 1223
						var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 1224
						class222.Widget_setKeyRate(var4, var5, var6, var7); // L: 1225
						return 1; // L: 1226
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) { // L: 1228
						--UserComparator6.Interpreter_intStackSize; // L: 1229
						var11 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize] - 1; // L: 1230
						if (var11 >= 0 && var11 <= 9) { // L: 1231
							ChatChannel.Widget_setKeyIgnoreHeld(var4, var11); // L: 1234
							return 1; // L: 1235
						} else {
							throw new RuntimeException(); // L: 1232
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) { // L: 1237
						var5 = 10; // L: 1238
						ChatChannel.Widget_setKeyIgnoreHeld(var4, var5); // L: 1239
						return 1; // L: 1240
					} else {
						return 2; // L: 1242
					}
				} else {
					byte[] var10 = null; // L: 1173
					var8 = null; // L: 1174
					if (var3) { // L: 1175
						UserComparator6.Interpreter_intStackSize -= 10; // L: 1176

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + UserComparator6.Interpreter_intStackSize] >= 0; var7 += 2) { // L: 1178 1179
						}

						if (var7 > 0) { // L: 1181
							var10 = new byte[var7 / 2]; // L: 1182
							var8 = new byte[var7 / 2]; // L: 1183

							for (var7 -= 2; var7 >= 0; var7 -= 2) { // L: 1184
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + UserComparator6.Interpreter_intStackSize]; // L: 1185
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + UserComparator6.Interpreter_intStackSize + 1]; // L: 1186
							}
						}
					} else {
						UserComparator6.Interpreter_intStackSize -= 2; // L: 1191
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]}; // L: 1192
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]}; // L: 1193
					}

					var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] - 1; // L: 1195
					if (var7 >= 0 && var7 <= 9) { // L: 1196
						KeyHandler.Widget_setKey(var4, var7, var10, var8); // L: 1199
						return 1; // L: 1200
					} else {
						throw new RuntimeException(); // L: 1197
					}
				}
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1644766494"
	)
	public static String method1239(String var0) {
		StringBuilder var1 = new StringBuilder(var0.length()); // L: 156
		int var2 = 0; // L: 157
		int var3 = -1; // L: 158

		for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 159
			char var5 = var0.charAt(var4); // L: 160
			if (var5 == '<') { // L: 161
				var1.append(var0.substring(var2, var4)); // L: 162
				var3 = var4; // L: 163
			} else if (var5 == '>' && var3 != -1) { // L: 166
				String var6 = var0.substring(var3 + 1, var4); // L: 167
				var3 = -1; // L: 168
				if (var6.equals("lt")) { // L: 169
					var1.append("<"); // L: 170
				} else if (var6.equals("gt")) { // L: 172
					var1.append(">"); // L: 173
				} else if (var6.equals("br")) { // L: 175
					var1.append("\n"); // L: 176
				}

				var2 = var4 + 1; // L: 178
			}
		}

		if (var2 < var0.length()) { // L: 181
			var1.append(var0.substring(var2, var0.length())); // L: 182
		}

		return var1.toString(); // L: 184
	}
}
