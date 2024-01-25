import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kt")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -2116611681
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -240376913
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 864182291
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -882964857
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 103642191
	)
	@Export("type")
	int type;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1805399985
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1018221453
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -746426085
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1064808971
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 214057975
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1978825721
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1704694173
	)
	int field2927;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 121621181
	)
	int field2916;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -226127811
	)
	int field2930;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 637558021
	)
	int field2928;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -635496377
	)
	int field2932;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1753962731
	)
	int field2919;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1124977837
	)
	int field2933;

	Occluder() {
	} // L: 23

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "-82"
	)
	static final int method5588(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var3 * var0 >> 16; // L: 17
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "36"
	)
	static int method5586(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1289
			var0 -= 1000; // L: 1290
			var3 = class380.field4414.method6348(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]); // L: 1291
		} else {
			var3 = var2 ? class31.scriptDotWidget : class185.field1932; // L: 1293
		}

		String var4 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 1294
		int[] var5 = null; // L: 1295
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') { // L: 1296
			int var6 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 1297
			if (var6 > 0) { // L: 1298
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]) { // L: 1299 1300
				}
			}

			var4 = var4.substring(0, var4.length() - 1); // L: 1302
		}

		Object[] var9 = new Object[var4.length() + 1]; // L: 1304

		int var7;
		for (var7 = var9.length - 1; var7 >= 1; --var7) { // L: 1305
			if (var4.charAt(var7 - 1) == 's') {
				var9[var7] = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 1306
			} else {
				var9[var7] = new Integer(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]); // L: 1307
			}
		}

		var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 1309
		if (var7 != -1) { // L: 1310
			var9[0] = new Integer(var7);
		} else {
			var9 = null; // L: 1311
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) { // L: 1312
			var3.onClick = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) { // L: 1313
			var3.onHold = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) { // L: 1314
			var3.onRelease = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) { // L: 1315
			var3.onMouseOver = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) { // L: 1316
			var3.onMouseLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) { // L: 1317
			var3.onDrag = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) { // L: 1318
			var3.onTargetLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) { // L: 1319
			var3.onVarTransmit = var9; // L: 1320
			var3.varTransmitTriggers = var5; // L: 1321
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) { // L: 1323
			var3.onTimer = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) { // L: 1324
			var3.onOp = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) { // L: 1325
			var3.onDragComplete = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) { // L: 1326
			var3.onClickRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) { // L: 1327
			var3.onMouseRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) { // L: 1328
			var3.onInvTransmit = var9; // L: 1329
			var3.invTransmitTriggers = var5; // L: 1330
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) { // L: 1332
			var3.onStatTransmit = var9; // L: 1333
			var3.statTransmitTriggers = var5; // L: 1334
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) {
			var3.onTargetEnter = var9; // L: 1336
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) { // L: 1337
			var3.onScroll = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) { // L: 1338
			var3.onChatTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) { // L: 1339
			var3.onKey = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) { // L: 1340
			var3.onFriendTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) { // L: 1341
			var3.onClanTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) { // L: 1342
			var3.onMiscTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) { // L: 1343
			var3.onDialogAbort = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) { // L: 1344
			var3.onSubChange = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) { // L: 1345
			var3.onStockTransmit = var9;
		} else if (var0 == 1426) { // L: 1346
			var3.field3824 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) { // L: 1347
			var3.onResize = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) { // L: 1348
			var3.field3817 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) { // L: 1349
			var3.field3818 = var9;
		} else if (var0 == 1430) { // L: 1350
			var3.field3813 = var9;
		} else if (var0 == 1431) { // L: 1351
			var3.field3814 = var9;
		} else if (var0 == 1434) { // L: 1352
			var3.field3825 = var9;
		} else if (var0 == 1435) { // L: 1353
			var3.field3809 = var9;
		} else {
			if (var0 < 1436 || var0 > 1439) { // L: 1354
				return 2; // L: 1364
			}

			class342 var8 = var3.method6716(); // L: 1355
			if (var8 != null) { // L: 1356
				if (var0 == 1436) { // L: 1357
					var8.field3633 = var9;
				} else if (var0 == 1437) { // L: 1358
					var8.field3634 = var9;
				} else if (var0 == 1438) { // L: 1359
					var8.field3629 = var9;
				} else if (var0 == 1439) { // L: 1360
					var8.field3632 = var9;
				}
			}
		}

		var3.hasListener = true; // L: 1366
		return 1; // L: 1367
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "-55"
	)
	static int method5590(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) { // L: 4064
			var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 4065
			Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = class341.ItemComposition_get(var3).name; // L: 4066
			return 1; // L: 4067
		} else {
			ItemComposition var5;
			int var6;
			if (var0 == ScriptOpcodes.OC_OP) { // L: 4069
				UserComparator6.Interpreter_intStackSize -= 2; // L: 4070
				var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 4071
				var6 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 4072
				var5 = class341.ItemComposition_get(var3); // L: 4073
				if (var6 >= 1 && var6 <= 5 && var5.groundActions[var6 - 1] != null) { // L: 4074
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var5.groundActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 4075
				}

				return 1; // L: 4076
			} else if (var0 == ScriptOpcodes.OC_IOP) { // L: 4078
				UserComparator6.Interpreter_intStackSize -= 2; // L: 4079
				var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 4080
				var6 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 4081
				var5 = class341.ItemComposition_get(var3); // L: 4082
				if (var6 >= 1 && var6 <= 5 && var5.inventoryActions[var6 - 1] != null) { // L: 4083
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var5.inventoryActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 4084
				}

				return 1; // L: 4085
			} else if (var0 == ScriptOpcodes.OC_COST) { // L: 4087
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 4088
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class341.ItemComposition_get(var3).price; // L: 4089
				return 1; // L: 4090
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) { // L: 4092
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 4093
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class341.ItemComposition_get(var3).isStackable == 1 ? 1 : 0; // L: 4094
				return 1; // L: 4095
			} else {
				ItemComposition var4;
				if (var0 == ScriptOpcodes.OC_CERT) { // L: 4097
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 4098
					var4 = class341.ItemComposition_get(var3); // L: 4099
					if (var4.noteTemplate == -1 && var4.note >= 0) { // L: 4100
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3; // L: 4101
					}

					return 1; // L: 4102
				} else if (var0 == ScriptOpcodes.OC_UNCERT) { // L: 4104
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 4105
					var4 = class341.ItemComposition_get(var3); // L: 4106
					if (var4.noteTemplate >= 0 && var4.note >= 0) { // L: 4107
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3; // L: 4108
					}

					return 1; // L: 4109
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) { // L: 4111
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 4112
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class341.ItemComposition_get(var3).isMembersOnly ? 1 : 0; // L: 4113
					return 1; // L: 4114
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) { // L: 4116
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 4117
					var4 = class341.ItemComposition_get(var3); // L: 4118
					if (var4.placeholderTemplate == -1 && var4.placeholder >= 0) { // L: 4119
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3; // L: 4120
					}

					return 1; // L: 4121
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) { // L: 4123
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 4124
					var4 = class341.ItemComposition_get(var3); // L: 4125
					if (var4.placeholderTemplate >= 0 && var4.placeholder >= 0) { // L: 4126
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3; // L: 4127
					}

					return 1; // L: 4128
				} else if (var0 == ScriptOpcodes.OC_FIND) { // L: 4130
					String var7 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 4131
					var6 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 4132
					class102.findItemDefinitions(var7, var6 == 1); // L: 4133
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class31.foundItemIdCount; // L: 4134
					return 1; // L: 4135
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) { // L: 4137
					if (var0 == ScriptOpcodes.OC_FINDRESET) { // L: 4142
						class18.foundItemIndex = 0; // L: 4143
						return 1; // L: 4144
					} else if (var0 == 4213) { // L: 4146
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 4147
						var6 = class341.ItemComposition_get(var3).getShiftClickIndex(); // L: 4148
						if (var6 == -1) { // L: 4149
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var6; // L: 4150
						} else {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var6 + 1; // L: 4153
						}

						return 1; // L: 4155
					} else if (var0 == 4214) { // L: 4157
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 4158
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class341.ItemComposition_get(var3).maleModel; // L: 4159
						return 1; // L: 4160
					} else if (var0 == 4215) { // L: 4162
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 4163
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class341.ItemComposition_get(var3).maleModel1; // L: 4164
						return 1; // L: 4165
					} else if (var0 == 4216) { // L: 4167
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 4168
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class341.ItemComposition_get(var3).maleModel2; // L: 4169
						return 1; // L: 4170
					} else if (var0 == 4217) { // L: 4172
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 4173
						var4 = class341.ItemComposition_get(var3); // L: 4174
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4.field2196; // L: 4175
						return 1; // L: 4176
					} else {
						return 2; // L: 4178
					}
				} else {
					if (class317.foundItemIds != null && class18.foundItemIndex < class31.foundItemIdCount) { // L: 4138
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class317.foundItemIds[++class18.foundItemIndex - 1] & '\uffff'; // L: 4139
					} else {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
					}

					return 1; // L: 4140
				}
			}
		}
	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-981596243"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = class482.getPacketBufferNode(ClientPacket.field3225, Client.packetWriter.isaacCipher); // L: 10009
		var2.packetBuffer.writeIntME(var1); // L: 10010
		var2.packetBuffer.method9373(var0); // L: 10011
		Client.packetWriter.addNode(var2); // L: 10012
	} // L: 10013

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1982035225"
	)
	static final void method5589() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 12449
			Player var1 = Client.players[Players.Players_indices[var0]]; // L: 12450
			var1.clearIsFriend(); // L: 12451
		}

		class113.method2916(); // L: 12453
		if (ClientPreferences.friendsChatManager != null) { // L: 12454
			ClientPreferences.friendsChatManager.clearFriends(); // L: 12455
		}

	} // L: 12457
}
