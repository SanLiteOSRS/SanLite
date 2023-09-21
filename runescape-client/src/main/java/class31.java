import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bv")
public class class31 {
	@ObfuscatedName("ac")
	static Applet field171;
	@ObfuscatedName("al")
	static String field170;
	@ObfuscatedName("py")
	@ObfuscatedGetter(
		intValue = -1380833859
	)
	static int field173;

	static {
		field171 = null; // L: 10
		field170 = ""; // L: 11
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lds;",
		garbageValue = "0"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = class132.method3046(var1, var0); // L: 38
		Script var4 = MouseHandler.method670(var3, var0); // L: 39
		if (var4 != null) { // L: 40
			return var4; // L: 41
		} else {
			var3 = class347.method6735(var2, var0); // L: 43
			var4 = MouseHandler.method670(var3, var0); // L: 44
			if (var4 != null) { // L: 45
				return var4; // L: 46
			} else {
				var3 = class20.method296(var0); // L: 48
				var4 = MouseHandler.method670(var3, var0); // L: 49
				return var4 != null ? var4 : null; // L: 50 53
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZB)I",
		garbageValue = "121"
	)
	static int method458(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1259
			var0 -= 1000; // L: 1260
			var3 = class33.field184.method6240(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1261
		} else {
			var3 = var2 ? class416.scriptDotWidget : class306.field3131; // L: 1263
		}

		String var4 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 1264
		int[] var5 = null; // L: 1265
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') { // L: 1266
			int var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1267
			if (var6 > 0) { // L: 1268
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]) { // L: 1269 1270
				}
			}

			var4 = var4.substring(0, var4.length() - 1); // L: 1272
		}

		Object[] var9 = new Object[var4.length() + 1]; // L: 1274

		int var7;
		for (var7 = var9.length - 1; var7 >= 1; --var7) { // L: 1275
			if (var4.charAt(var7 - 1) == 's') {
				var9[var7] = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 1276
			} else {
				var9[var7] = new Integer(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1277
			}
		}

		var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1279
		if (var7 != -1) { // L: 1280
			var9[0] = new Integer(var7);
		} else {
			var9 = null; // L: 1281
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) { // L: 1282
			var3.onClick = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) { // L: 1283
			var3.onHold = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) { // L: 1284
			var3.onRelease = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) { // L: 1285
			var3.onMouseOver = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) { // L: 1286
			var3.onMouseLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) { // L: 1287
			var3.onDrag = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) { // L: 1288
			var3.onTargetLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) { // L: 1289
			var3.onVarTransmit = var9; // L: 1290
			var3.varTransmitTriggers = var5; // L: 1291
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) { // L: 1293
			var3.onTimer = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) { // L: 1294
			var3.onOp = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) { // L: 1295
			var3.onDragComplete = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) { // L: 1296
			var3.onClickRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) { // L: 1297
			var3.onMouseRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) { // L: 1298
			var3.onInvTransmit = var9; // L: 1299
			var3.invTransmitTriggers = var5; // L: 1300
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) { // L: 1302
			var3.onStatTransmit = var9; // L: 1303
			var3.statTransmitTriggers = var5; // L: 1304
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) { // L: 1306
			var3.onTargetEnter = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) { // L: 1307
			var3.onScroll = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) { // L: 1308
			var3.onChatTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) { // L: 1309
			var3.onKey = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) { // L: 1310
			var3.onFriendTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) { // L: 1311
			var3.onClanTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) { // L: 1312
			var3.onMiscTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) { // L: 1313
			var3.onDialogAbort = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) { // L: 1314
			var3.onSubChange = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) { // L: 1315
			var3.onStockTransmit = var9;
		} else if (var0 == 1426) { // L: 1316
			var3.field3708 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) { // L: 1317
			var3.onResize = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) { // L: 1318
			var3.field3793 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) { // L: 1319
			var3.field3794 = var9;
		} else if (var0 == 1430) { // L: 1320
			var3.field3789 = var9;
		} else if (var0 == 1431) { // L: 1321
			var3.field3790 = var9;
		} else if (var0 == 1434) { // L: 1322
			var3.field3801 = var9;
		} else if (var0 == 1435) { // L: 1323
			var3.field3785 = var9;
		} else {
			if (var0 < 1436 || var0 > 1439) { // L: 1324
				return 2; // L: 1334
			}

			class342 var8 = var3.method6617(); // L: 1325
			if (var8 != null) { // L: 1326
				if (var0 == 1436) { // L: 1327
					var8.field3608 = var9;
				} else if (var0 == 1437) { // L: 1328
					var8.field3609 = var9;
				} else if (var0 == 1438) { // L: 1329
					var8.field3610 = var9;
				} else if (var0 == 1439) { // L: 1330
					var8.field3607 = var9;
				}
			}
		}

		var3.hasListener = true; // L: 1336
		return 1; // L: 1337
	}
}
