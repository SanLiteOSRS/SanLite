import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gv")
public class class169 extends class181 {
	@ObfuscatedName("au")
	String field1832;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	final class170 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgf;Ljava/lang/String;Ljava/lang/String;)V"
	)
	class169(class170 var1, String var2, String var3) {
		super(var1, var2); // L: 412
		this.this$0 = var1; // L: 411
		this.field1832 = var3; // L: 413
	} // L: 414

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "38"
	)
	public int vmethod3528() {
		return 1; // L: 417
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1557827941"
	)
	public String vmethod3518() {
		return this.field1832; // L: 422
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "-866561565"
	)
	static int method3363(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1248
			var0 -= 1000; // L: 1249
			var3 = class92.getWidget(Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]); // L: 1250
		} else {
			var3 = var2 ? GameObject.scriptDotWidget : SceneTilePaint.field2808; // L: 1252
		}

		String var4 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 1253
		int[] var5 = null; // L: 1254
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') { // L: 1255
			int var6 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 1256
			if (var6 > 0) { // L: 1257
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]) { // L: 1258 1259
				}
			}

			var4 = var4.substring(0, var4.length() - 1); // L: 1261
		}

		Object[] var9 = new Object[var4.length() + 1]; // L: 1263

		int var7;
		for (var7 = var9.length - 1; var7 >= 1; --var7) { // L: 1264
			if (var4.charAt(var7 - 1) == 's') { // L: 1265
				var9[var7] = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize];
			} else {
				var9[var7] = new Integer(Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]); // L: 1266
			}
		}

		var7 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 1268
		if (var7 != -1) { // L: 1269
			var9[0] = new Integer(var7);
		} else {
			var9 = null; // L: 1270
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) { // L: 1271
			var3.onClick = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) { // L: 1272
			var3.onHold = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) { // L: 1273
			var3.onRelease = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) { // L: 1274
			var3.onMouseOver = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) { // L: 1275
			var3.onMouseLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) { // L: 1276
			var3.onDrag = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) { // L: 1277
			var3.onTargetLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) { // L: 1278
			var3.onVarTransmit = var9; // L: 1279
			var3.varTransmitTriggers = var5; // L: 1280
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) { // L: 1282
			var3.onTimer = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) { // L: 1283
			var3.onOp = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) { // L: 1284
			var3.onDragComplete = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) { // L: 1285
			var3.onClickRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) { // L: 1286
			var3.onMouseRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) { // L: 1287
			var3.onInvTransmit = var9; // L: 1288
			var3.invTransmitTriggers = var5; // L: 1289
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) { // L: 1291
			var3.onStatTransmit = var9; // L: 1292
			var3.statTransmitTriggers = var5; // L: 1293
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) { // L: 1295
			var3.onTargetEnter = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) {
			var3.onScroll = var9; // L: 1296
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) { // L: 1297
			var3.onChatTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) { // L: 1298
			var3.onKey = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) { // L: 1299
			var3.onFriendTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) { // L: 1300
			var3.onClanTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) { // L: 1301
			var3.onMiscTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) { // L: 1302
			var3.onDialogAbort = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) { // L: 1303
			var3.onSubChange = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) { // L: 1304
			var3.onStockTransmit = var9;
		} else if (var0 == 1426) { // L: 1305
			var3.field3784 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) { // L: 1306
			var3.onResize = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) { // L: 1307
			var3.field3762 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) { // L: 1308
			var3.field3763 = var9;
		} else if (var0 == 1430) { // L: 1309
			var3.field3767 = var9;
		} else if (var0 == 1431) { // L: 1310
			var3.field3723 = var9;
		} else if (var0 == 1434) { // L: 1311
			var3.field3714 = var9;
		} else if (var0 == 1435) { // L: 1312
			var3.field3754 = var9;
		} else {
			if (var0 < 1436 || var0 > 1439) { // L: 1313
				return 2; // L: 1323
			}

			class327 var8 = var3.method6418(); // L: 1314
			if (var8 != null) { // L: 1315
				if (var0 == 1436) { // L: 1316
					var8.field3564 = var9;
				} else if (var0 == 1437) { // L: 1317
					var8.field3565 = var9;
				} else if (var0 == 1438) { // L: 1318
					var8.field3560 = var9;
				} else if (var0 == 1439) { // L: 1319
					var8.field3562 = var9;
				}
			}
		}

		var3.hasListener = true; // L: 1325
		return 1; // L: 1326
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(Lib;IIII)V",
		garbageValue = "1647034458"
	)
	static void method3362(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && class449.clientPreferences.method2554() != 0) { // L: 3560
			if (var0.field2321 != null && var0.field2321.containsKey(var1)) { // L: 3561
				MouseHandler.method665((Integer)var0.field2321.get(var1), var2, var3); // L: 3562
			}
		}
	} // L: 3563
}
