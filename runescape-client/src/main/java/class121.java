import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("em")
public class class121 {
	@ObfuscatedName("ac")
	public static final float field1462;
	@ObfuscatedName("au")
	public static final float field1463;
	@ObfuscatedName("ab")
	static float[] field1468;
	@ObfuscatedName("aq")
	static float[] field1465;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("gv")
	static String field1471;

	static {
		field1462 = Math.ulp(1.0F); // L: 10
		field1463 = field1462 * 2.0F; // L: 11
		field1468 = new float[4]; // L: 12
		field1465 = new float[5]; // L: 13
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)[Lec;",
		garbageValue = "127"
	)
	static class127[] method2989() {
		return new class127[]{class127.field1545, class127.field1547, class127.field1546, class127.field1544, class127.field1566, class127.field1560, class127.field1550, class127.field1551, class127.field1552, class127.field1553, class127.field1554, class127.field1548, class127.field1556, class127.field1549, class127.field1555, class127.field1559, class127.field1558}; // L: 68
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldk;",
		garbageValue = "1978895221"
	)
	static class85[] method2991() {
		return new class85[]{class85.field1064, class85.field1072, class85.field1067, class85.field1070, class85.field1065}; // L: 16
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZB)I",
		garbageValue = "-1"
	)
	static int method2977(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1240
			var0 -= 1000; // L: 1241
			var3 = class165.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1242
		} else {
			var3 = var2 ? SoundSystem.scriptDotWidget : class1.field5; // L: 1244
		}

		String var4 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 1245
		int[] var5 = null; // L: 1246
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') { // L: 1247
			int var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1248
			if (var6 > 0) { // L: 1249
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]) { // L: 1250 1251
				}
			}

			var4 = var4.substring(0, var4.length() - 1); // L: 1253
		}

		Object[] var9 = new Object[var4.length() + 1]; // L: 1255

		int var7;
		for (var7 = var9.length - 1; var7 >= 1; --var7) { // L: 1256
			if (var4.charAt(var7 - 1) == 's') {
				var9[var7] = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 1257
			} else {
				var9[var7] = new Integer(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1258
			}
		}

		var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1260
		if (var7 != -1) { // L: 1261
			var9[0] = new Integer(var7);
		} else {
			var9 = null; // L: 1262
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) { // L: 1263
			var3.onClick = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) { // L: 1264
			var3.onHold = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) { // L: 1265
			var3.onRelease = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) { // L: 1266
			var3.onMouseOver = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) { // L: 1267
			var3.onMouseLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) { // L: 1268
			var3.onDrag = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) { // L: 1269
			var3.onTargetLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) { // L: 1270
			var3.onVarTransmit = var9; // L: 1271
			var3.varTransmitTriggers = var5; // L: 1272
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) { // L: 1274
			var3.onTimer = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) { // L: 1275
			var3.onOp = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) { // L: 1276
			var3.onDragComplete = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) { // L: 1277
			var3.onClickRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) { // L: 1278
			var3.onMouseRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) { // L: 1279
			var3.onInvTransmit = var9; // L: 1280
			var3.invTransmitTriggers = var5; // L: 1281
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) { // L: 1283
			var3.onStatTransmit = var9; // L: 1284
			var3.statTransmitTriggers = var5; // L: 1285
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) { // L: 1287
			var3.onTargetEnter = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) { // L: 1288
			var3.onScroll = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) { // L: 1289
			var3.onChatTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) { // L: 1290
			var3.onKey = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) { // L: 1291
			var3.onFriendTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) { // L: 1292
			var3.onClanTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) { // L: 1293
			var3.onMiscTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) { // L: 1294
			var3.onDialogAbort = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) { // L: 1295
			var3.onSubChange = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) { // L: 1296
			var3.onStockTransmit = var9;
		} else if (var0 == 1426) { // L: 1297
			var3.field3692 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) { // L: 1298
			var3.onResize = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) { // L: 1299
			var3.field3637 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) { // L: 1300
			var3.field3566 = var9;
		} else if (var0 == 1430) { // L: 1301
			var3.field3681 = var9;
		} else if (var0 == 1431) { // L: 1302
			var3.field3582 = var9;
		} else if (var0 == 1434) { // L: 1303
			var3.field3653 = var9;
		} else if (var0 == 1435) { // L: 1304
			var3.field3677 = var9;
		} else {
			if (var0 < 1436 || var0 > 1439) { // L: 1305
				return 2; // L: 1315
			}

			class312 var8 = var3.method6395(); // L: 1306
			if (var8 != null) { // L: 1307
				if (var0 == 1436) { // L: 1308
					var8.field3500 = var9;
				} else if (var0 == 1437) { // L: 1309
					var8.field3505 = var9;
				} else if (var0 == 1438) { // L: 1310
					var8.field3504 = var9;
				} else if (var0 == 1439) { // L: 1311
					var8.field3503 = var9;
				}
			}
		}

		var3.hasListener = true; // L: 1317
		return 1; // L: 1318
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "15"
	)
	static void method2993() {
		Client.packetWriter.clearBuffer(); // L: 2581
		Client.packetWriter.packetBuffer.offset = 0; // L: 2582
		Client.packetWriter.serverPacket = null; // L: 2583
		Client.packetWriter.field1391 = null; // L: 2584
		Client.packetWriter.field1392 = null; // L: 2585
		Client.packetWriter.field1386 = null; // L: 2586
		Client.packetWriter.serverPacketLength = 0; // L: 2587
		Client.packetWriter.field1389 = 0; // L: 2588
		Client.rebootTimer = 0; // L: 2589
		Client.menuOptionsCount = 0; // L: 2591
		Client.isMenuOpen = false; // L: 2592
		Client.minimapState = 0; // L: 2594
		Client.destinationX = 0; // L: 2595

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) { // L: 2596
			Client.players[var0] = null;
		}

		MusicPatchNode.localPlayer = null; // L: 2597

		for (var0 = 0; var0 < Client.npcs.length; ++var0) { // L: 2598
			NPC var1 = Client.npcs[var0]; // L: 2599
			if (var1 != null) { // L: 2600
				var1.targetIndex = -1; // L: 2601
				var1.false0 = false; // L: 2602
			}
		}

		ItemContainer.itemContainers = new NodeHashTable(32); // L: 2606
		class138.method3208(30); // L: 2608

		for (var0 = 0; var0 < 100; ++var0) { // L: 2609
			Client.field705[var0] = true;
		}

		class1.method11(); // L: 2610
	} // L: 2611

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1957371418"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[GameEngine.Client_plane][var0][var1]; // L: 8095
		if (var2 == null) { // L: 8096
			class31.scene.removeGroundItemPile(GameEngine.Client_plane, var0, var1); // L: 8097
		} else {
			long var3 = -99999999L; // L: 8100
			TileItem var5 = null; // L: 8101

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 8102 8103 8113
				ItemComposition var7 = HealthBarUpdate.ItemComposition_get(var6.id); // L: 8104
				long var11 = (long)var7.price; // L: 8105
				if (var7.isStackable == 1) { // L: 8106
					var11 *= var6.quantity < Integer.MAX_VALUE ? (long)(var6.quantity + 1) : (long)var6.quantity; // L: 8107
				}

				if (var11 > var3) { // L: 8109
					var3 = var11; // L: 8110
					var5 = var6; // L: 8111
				}
			}

			if (var5 == null) { // L: 8115
				class31.scene.removeGroundItemPile(GameEngine.Client_plane, var0, var1); // L: 8116
			} else {
				var2.addLast(var5); // L: 8119
				TileItem var13 = null; // L: 8120
				TileItem var8 = null; // L: 8121

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 8122 8123 8128
					if (var5.id != var6.id) { // L: 8124
						if (var13 == null) { // L: 8125
							var13 = var6;
						}

						if (var13.id != var6.id && var8 == null) { // L: 8126
							var8 = var6;
						}
					}
				}

				long var9 = FaceNormal.calculateTag(var0, var1, 3, false, 0); // L: 8130
				class31.scene.newGroundItemPile(GameEngine.Client_plane, var0, var1, class147.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, GameEngine.Client_plane), var5, var9, var13, var8); // L: 8131
			}
		}
	} // L: 8098 8117 8132

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lmq;S)Ljava/lang/String;",
		garbageValue = "-1115"
	)
	static String method2979(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) { // L: 10423
			for (int var2 = 1; var2 <= 5; ++var2) { // L: 10424
				while (true) {
					int var3 = var0.indexOf("%" + var2); // L: 10426
					if (var3 == -1) { // L: 10427
						break;
					}

					String var4 = var0.substring(0, var3); // L: 10428
					int var6 = ArchiveLoader.method2230(var1, var2 - 1); // L: 10430
					String var5;
					if (var6 < 999999999) { // L: 10432
						var5 = Integer.toString(var6); // L: 10433
					} else {
						var5 = "*"; // L: 10436
					}

					var0 = var4 + var5 + var0.substring(var3 + 2); // L: 10438
				}
			}
		}

		return var0; // L: 10442
	}
}
