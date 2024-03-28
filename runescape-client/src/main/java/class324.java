import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mg")
class class324 implements ThreadFactory {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	final MidiPcmStream this$0;

	@ObfuscatedSignature(
		descriptor = "(Lmx;)V"
	)
	class324(MidiPcmStream var1) {
		this.this$0 = var1; // L: 117
	}

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS WAV Load"); // L: 120
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZS)I",
		garbageValue = "210"
	)
	static int method6176(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1291
			var0 -= 1000; // L: 1292
			var3 = class243.field2620.method6281(Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]); // L: 1293
		} else {
			var3 = var2 ? class475.scriptDotWidget : class535.field5236; // L: 1295
		}

		String var4 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 1296
		int[] var5 = null; // L: 1297
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') { // L: 1298
			int var6 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 1299
			if (var6 > 0) { // L: 1300
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]) { // L: 1301 1302
				}
			}

			var4 = var4.substring(0, var4.length() - 1); // L: 1304
		}

		Object[] var9 = new Object[var4.length() + 1]; // L: 1306

		int var7;
		for (var7 = var9.length - 1; var7 >= 1; --var7) { // L: 1307
			if (var4.charAt(var7 - 1) == 's') { // L: 1308
				var9[var7] = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize];
			} else {
				var9[var7] = new Integer(Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]); // L: 1309
			}
		}

		var7 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 1311
		if (var7 != -1) { // L: 1312
			var9[0] = new Integer(var7);
		} else {
			var9 = null; // L: 1313
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) { // L: 1314
			var3.onClick = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) { // L: 1315
			var3.onHold = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) { // L: 1316
			var3.onRelease = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) { // L: 1317
			var3.onMouseOver = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) { // L: 1318
			var3.onMouseLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) { // L: 1319
			var3.onDrag = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) { // L: 1320
			var3.onTargetLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) { // L: 1321
			var3.onVarTransmit = var9; // L: 1322
			var3.varTransmitTriggers = var5; // L: 1323
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) { // L: 1325
			var3.onTimer = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) { // L: 1326
			var3.onOp = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) { // L: 1327
			var3.onDragComplete = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) { // L: 1328
			var3.onClickRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) { // L: 1329
			var3.onMouseRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) { // L: 1330
			var3.onInvTransmit = var9; // L: 1331
			var3.invTransmitTriggers = var5; // L: 1332
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) { // L: 1334
			var3.onStatTransmit = var9; // L: 1335
			var3.statTransmitTriggers = var5; // L: 1336
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) {
			var3.onTargetEnter = var9; // L: 1338
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) { // L: 1339
			var3.onScroll = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) { // L: 1340
			var3.onChatTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) { // L: 1341
			var3.onKey = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) { // L: 1342
			var3.onFriendTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) { // L: 1343
			var3.onClanTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) { // L: 1344
			var3.onMiscTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) { // L: 1345
			var3.onDialogAbort = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) { // L: 1346
			var3.onSubChange = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) { // L: 1347
			var3.onStockTransmit = var9;
		} else if (var0 == 1426) { // L: 1348
			var3.field3866 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) { // L: 1349
			var3.onResize = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) { // L: 1350
			var3.field3859 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) { // L: 1351
			var3.field3860 = var9;
		} else if (var0 == 1430) { // L: 1352
			var3.field3855 = var9;
		} else if (var0 == 1431) { // L: 1353
			var3.field3856 = var9;
		} else if (var0 == 1434) { // L: 1354
			var3.field3867 = var9;
		} else if (var0 == 1435) { // L: 1355
			var3.field3851 = var9;
		} else {
			if (var0 < 1436 || var0 > 1439) { // L: 1356
				return 2; // L: 1366
			}

			class345 var8 = var3.method6683(); // L: 1357
			if (var8 != null) { // L: 1358
				if (var0 == 1436) { // L: 1359
					var8.field3675 = var9;
				} else if (var0 == 1437) { // L: 1360
					var8.field3676 = var9;
				} else if (var0 == 1438) { // L: 1361
					var8.field3677 = var9;
				} else if (var0 == 1439) { // L: 1362
					var8.field3671 = var9;
				}
			}
		}

		var3.hasListener = true; // L: 1368
		return 1; // L: 1369
	}
}
