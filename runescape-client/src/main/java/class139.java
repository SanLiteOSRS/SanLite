import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ej")
public abstract class class139 extends Node {
	class139() {
	} // L: 68

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lrd;S)V",
		garbageValue = "-5782"
	)
	abstract void vmethod3394(Buffer var1);

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Leb;B)V",
		garbageValue = "-26"
	)
	abstract void vmethod3393(ClanSettings var1);

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I",
		garbageValue = "1744506320"
	)
	static int method3157(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1215
			var0 -= 1000; // L: 1216
			var3 = class133.getWidget(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]); // L: 1217
		} else {
			var3 = var2 ? Interpreter.scriptDotWidget : class85.field1091; // L: 1219
		}

		String var4 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 1220
		int[] var5 = null; // L: 1221
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') { // L: 1222
			int var6 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 1223
			if (var6 > 0) { // L: 1224
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]) { // L: 1225 1226
				}
			}

			var4 = var4.substring(0, var4.length() - 1); // L: 1228
		}

		Object[] var9 = new Object[var4.length() + 1]; // L: 1230

		int var7;
		for (var7 = var9.length - 1; var7 >= 1; --var7) { // L: 1231
			if (var4.charAt(var7 - 1) == 's') {
				var9[var7] = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 1232
			} else {
				var9[var7] = new Integer(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]); // L: 1233
			}
		}

		var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 1235
		if (var7 != -1) { // L: 1236
			var9[0] = new Integer(var7);
		} else {
			var9 = null; // L: 1237
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) { // L: 1238
			var3.onClick = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) { // L: 1239
			var3.onHold = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) { // L: 1240
			var3.onRelease = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) { // L: 1241
			var3.onMouseOver = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) { // L: 1242
			var3.onMouseLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) { // L: 1243
			var3.onDrag = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) { // L: 1244
			var3.onTargetLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) { // L: 1245
			var3.onVarTransmit = var9; // L: 1246
			var3.varTransmitTriggers = var5; // L: 1247
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) { // L: 1249
			var3.onTimer = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) { // L: 1250
			var3.onOp = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) { // L: 1251
			var3.onDragComplete = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) { // L: 1252
			var3.onClickRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) { // L: 1253
			var3.onMouseRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) { // L: 1254
			var3.onInvTransmit = var9; // L: 1255
			var3.invTransmitTriggers = var5; // L: 1256
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) { // L: 1258
			var3.onStatTransmit = var9; // L: 1259
			var3.statTransmitTriggers = var5; // L: 1260
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) { // L: 1262
			var3.onTargetEnter = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) { // L: 1263
			var3.onScroll = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) { // L: 1264
			var3.onChatTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) { // L: 1265
			var3.onKey = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) { // L: 1266
			var3.onFriendTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) { // L: 1267
			var3.onClanTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) { // L: 1268
			var3.onMiscTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) { // L: 1269
			var3.onDialogAbort = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) { // L: 1270
			var3.onSubChange = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) { // L: 1271
			var3.onStockTransmit = var9;
		} else if (var0 == 1426) { // L: 1272
			var3.field3679 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) { // L: 1273
			var3.onResize = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) { // L: 1274
			var3.field3672 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) { // L: 1275
			var3.field3673 = var9;
		} else if (var0 == 1430) { // L: 1276
			var3.field3604 = var9;
		} else if (var0 == 1431) { // L: 1277
			var3.field3669 = var9;
		} else if (var0 == 1434) { // L: 1278
			var3.field3680 = var9;
		} else if (var0 == 1435) { // L: 1279
			var3.field3664 = var9;
		} else {
			if (var0 < 1436 || var0 > 1439) { // L: 1280
				return 2; // L: 1290
			}

			class305 var8 = var3.method6228(); // L: 1281
			if (var8 != null) { // L: 1282
				if (var0 == 1436) { // L: 1283
					var8.field3480 = var9;
				} else if (var0 == 1437) { // L: 1284
					var8.field3479 = var9;
				} else if (var0 == 1438) { // L: 1285
					var8.field3482 = var9;
				} else if (var0 == 1439) { // L: 1286
					var8.field3481 = var9;
				}
			}
		}

		var3.hasListener = true; // L: 1292
		return 1; // L: 1293
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "32"
	)
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 1022
			var1 /= 2;
		}

		if (var2 > 192) { // L: 1023
			var1 /= 2;
		}

		if (var2 > 217) { // L: 1024
			var1 /= 2;
		}

		if (var2 > 243) { // L: 1025
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 1026
		return var3; // L: 1027
	}
}
