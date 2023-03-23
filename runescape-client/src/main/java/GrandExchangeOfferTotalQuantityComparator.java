import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ng")
@Implements("GrandExchangeOfferTotalQuantityComparator")
final class GrandExchangeOfferTotalQuantityComparator implements Comparator {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	@Export("KitDefinition_archive")
	public static AbstractArchive KitDefinition_archive;

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lnv;Lnv;I)I",
		garbageValue = "-1303032215"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.totalQuantity < var2.grandExchangeOffer.totalQuantity ? -1 : (var2.grandExchangeOffer.totalQuantity == var1.grandExchangeOffer.totalQuantity ? 0 : 1); // L: 69
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 73
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 77
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZB)I",
		garbageValue = "-89"
	)
	static int method6546(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1219
			var0 -= 1000; // L: 1220
			var3 = WorldMapSection1.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1221
		} else {
			var3 = var2 ? GameObject.scriptDotWidget : SoundSystem.field319; // L: 1223
		}

		String var4 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 1224
		int[] var5 = null; // L: 1225
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') { // L: 1226
			int var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1227
			if (var6 > 0) { // L: 1228
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]) { // L: 1229 1230
				}
			}

			var4 = var4.substring(0, var4.length() - 1); // L: 1232
		}

		Object[] var9 = new Object[var4.length() + 1]; // L: 1234

		int var7;
		for (var7 = var9.length - 1; var7 >= 1; --var7) { // L: 1235
			if (var4.charAt(var7 - 1) == 's') { // L: 1236
				var9[var7] = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize];
			} else {
				var9[var7] = new Integer(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1237
			}
		}

		var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1239
		if (var7 != -1) { // L: 1240
			var9[0] = new Integer(var7);
		} else {
			var9 = null; // L: 1241
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) { // L: 1242
			var3.onClick = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) { // L: 1243
			var3.onHold = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) { // L: 1244
			var3.onRelease = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) { // L: 1245
			var3.onMouseOver = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) { // L: 1246
			var3.onMouseLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) { // L: 1247
			var3.onDrag = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) { // L: 1248
			var3.onTargetLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) { // L: 1249
			var3.onVarTransmit = var9; // L: 1250
			var3.varTransmitTriggers = var5; // L: 1251
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) { // L: 1253
			var3.onTimer = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) { // L: 1254
			var3.onOp = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) { // L: 1255
			var3.onDragComplete = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) { // L: 1256
			var3.onClickRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) { // L: 1257
			var3.onMouseRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) { // L: 1258
			var3.onInvTransmit = var9; // L: 1259
			var3.invTransmitTriggers = var5; // L: 1260
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) { // L: 1262
			var3.onStatTransmit = var9; // L: 1263
			var3.statTransmitTriggers = var5; // L: 1264
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) { // L: 1266
			var3.onTargetEnter = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) { // L: 1267
			var3.onScroll = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) { // L: 1268
			var3.onChatTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) { // L: 1269
			var3.onKey = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) { // L: 1270
			var3.onFriendTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) { // L: 1271
			var3.onClanTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) { // L: 1272
			var3.onMiscTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) { // L: 1273
			var3.onDialogAbort = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) { // L: 1274
			var3.onSubChange = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) { // L: 1275
			var3.onStockTransmit = var9;
		} else if (var0 == 1426) { // L: 1276
			var3.field3647 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) { // L: 1277
			var3.onResize = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) { // L: 1278
			var3.field3640 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) { // L: 1279
			var3.field3641 = var9;
		} else if (var0 == 1430) { // L: 1280
			var3.field3636 = var9;
		} else if (var0 == 1431) { // L: 1281
			var3.field3541 = var9;
		} else if (var0 == 1434) { // L: 1282
			var3.field3648 = var9;
		} else if (var0 == 1435) { // L: 1283
			var3.field3622 = var9;
		} else {
			if (var0 < 1436 || var0 > 1439) { // L: 1284
				return 2; // L: 1294
			}

			class308 var8 = var3.method6163(); // L: 1285
			if (var8 != null) { // L: 1286
				if (var0 == 1436) { // L: 1287
					var8.field3454 = var9;
				} else if (var0 == 1437) { // L: 1288
					var8.field3450 = var9;
				} else if (var0 == 1438) { // L: 1289
					var8.field3453 = var9;
				} else if (var0 == 1439) { // L: 1290
					var8.field3459 = var9;
				}
			}
		}

		var3.hasListener = true; // L: 1296
		return 1; // L: 1297
	}
}
