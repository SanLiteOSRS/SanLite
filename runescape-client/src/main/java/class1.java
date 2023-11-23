import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ah")
public class class1 implements Callable {
	@ObfuscatedName("ai")
	@Export("ByteArrayPool_arrays")
	static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("ud")
	@ObfuscatedGetter(
		intValue = 489123307
	)
	static int field2;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	final Buffer field1;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	final class3 field3;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lac;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lac;Luj;Lao;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1; // L: 47
		this.field1 = var2; // L: 48
		this.field3 = var3; // L: 49
	} // L: 50

	public Object call() {
		return this.field3.vmethod17(this.field1); // L: 54
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgo;",
		garbageValue = "9"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0); // L: 35
		if (var1 != null) { // L: 36
			return var1;
		} else {
			byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0); // L: 37
			var1 = new KitDefinition(); // L: 38
			if (var2 != null) { // L: 39
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0); // L: 40
			return var1; // L: 41
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1140575558"
	)
	static int method11(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1258
			var0 -= 1000; // L: 1259
			var3 = HealthBarDefinition.field1877.method6285(Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]); // L: 1260
		} else {
			var3 = var2 ? Interpreter.scriptDotWidget : HealthBar.field1302; // L: 1262
		}

		String var4 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 1263
		int[] var5 = null; // L: 1264
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') { // L: 1265
			int var6 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 1266
			if (var6 > 0) { // L: 1267
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]) { // L: 1268 1269
				}
			}

			var4 = var4.substring(0, var4.length() - 1); // L: 1271
		}

		Object[] var9 = new Object[var4.length() + 1]; // L: 1273

		int var7;
		for (var7 = var9.length - 1; var7 >= 1; --var7) { // L: 1274
			if (var4.charAt(var7 - 1) == 's') {
				var9[var7] = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 1275
			} else {
				var9[var7] = new Integer(Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]); // L: 1276
			}
		}

		var7 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 1278
		if (var7 != -1) { // L: 1279
			var9[0] = new Integer(var7);
		} else {
			var9 = null; // L: 1280
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) { // L: 1281
			var3.onClick = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) { // L: 1282
			var3.onHold = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) { // L: 1283
			var3.onRelease = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) { // L: 1284
			var3.onMouseOver = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) { // L: 1285
			var3.onMouseLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) { // L: 1286
			var3.onDrag = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) { // L: 1287
			var3.onTargetLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) { // L: 1288
			var3.onVarTransmit = var9; // L: 1289
			var3.varTransmitTriggers = var5; // L: 1290
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) { // L: 1292
			var3.onTimer = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) { // L: 1293
			var3.onOp = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) { // L: 1294
			var3.onDragComplete = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) { // L: 1295
			var3.onClickRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) { // L: 1296
			var3.onMouseRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) { // L: 1297
			var3.onInvTransmit = var9; // L: 1298
			var3.invTransmitTriggers = var5; // L: 1299
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) { // L: 1301
			var3.onStatTransmit = var9; // L: 1302
			var3.statTransmitTriggers = var5; // L: 1303
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) { // L: 1305
			var3.onTargetEnter = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) { // L: 1306
			var3.onScroll = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) { // L: 1307
			var3.onChatTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) { // L: 1308
			var3.onKey = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) { // L: 1309
			var3.onFriendTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) { // L: 1310
			var3.onClanTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) { // L: 1311
			var3.onMiscTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) { // L: 1312
			var3.onDialogAbort = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) { // L: 1313
			var3.onSubChange = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) { // L: 1314
			var3.onStockTransmit = var9;
		} else if (var0 == 1426) { // L: 1315
			var3.field3782 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) { // L: 1316
			var3.onResize = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) { // L: 1317
			var3.field3676 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) { // L: 1318
			var3.field3776 = var9;
		} else if (var0 == 1430) { // L: 1319
			var3.field3771 = var9;
		} else if (var0 == 1431) { // L: 1320
			var3.field3772 = var9;
		} else if (var0 == 1434) { // L: 1321
			var3.field3783 = var9;
		} else if (var0 == 1435) { // L: 1322
			var3.field3648 = var9;
		} else {
			if (var0 < 1436 || var0 > 1439) { // L: 1323
				return 2; // L: 1333
			}

			class339 var8 = var3.method6767(); // L: 1324
			if (var8 != null) { // L: 1325
				if (var0 == 1436) { // L: 1326
					var8.field3592 = var9;
				} else if (var0 == 1437) { // L: 1327
					var8.field3588 = var9;
				} else if (var0 == 1438) { // L: 1328
					var8.field3595 = var9;
				} else if (var0 == 1439) { // L: 1329
					var8.field3591 = var9;
				}
			}
		}

		var3.hasListener = true; // L: 1335
		return 1; // L: 1336
	}
}
