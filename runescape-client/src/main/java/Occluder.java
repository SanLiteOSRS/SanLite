import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jw")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1495797239
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 2083881213
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -2139762069
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 2105212115
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1011543871
	)
	@Export("type")
	int type;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1459036587
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1190260059
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1803048977
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 710256461
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1382049521
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 123469707
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1429765685
	)
	int field2638;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -385546895
	)
	int field2644;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -853956623
	)
	int field2643;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1632011863
	)
	int field2641;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1716665463
	)
	int field2642;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -878350737
	)
	int field2634;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1182818911
	)
	int field2640;

	Occluder() {
	} // L: 23

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1459036587"
	)
	static int method4725(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 83
			var1 /= 2;
		}

		if (var2 > 192) { // L: 84
			var1 /= 2;
		}

		if (var2 > 217) { // L: 85
			var1 /= 2;
		}

		if (var2 > 243) { // L: 86
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 87
		return var3; // L: 88
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "1"
	)
	static int method4726(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1244
			var0 -= 1000; // L: 1245
			var3 = FriendSystem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1246
		} else {
			var3 = var2 ? class53.scriptDotWidget : Interpreter.field864; // L: 1248
		}

		String var4 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]; // L: 1249
		int[] var5 = null; // L: 1250
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') { // L: 1251
			int var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1252
			if (var6 > 0) { // L: 1253
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]) { // L: 1254 1255
				}
			}

			var4 = var4.substring(0, var4.length() - 1); // L: 1257
		}

		Object[] var9 = new Object[var4.length() + 1]; // L: 1259

		int var7;
		for (var7 = var9.length - 1; var7 >= 1; --var7) { // L: 1260
			if (var4.charAt(var7 - 1) == 's') {
				var9[var7] = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]; // L: 1261
			} else {
				var9[var7] = new Integer(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1262
			}
		}

		var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1264
		if (var7 != -1) { // L: 1265
			var9[0] = new Integer(var7);
		} else {
			var9 = null; // L: 1266
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) { // L: 1267
			var3.onClick = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) { // L: 1268
			var3.onHold = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) { // L: 1269
			var3.onRelease = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) { // L: 1270
			var3.onMouseOver = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) { // L: 1271
			var3.onMouseLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) { // L: 1272
			var3.onDrag = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) { // L: 1273
			var3.onTargetLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) { // L: 1274
			var3.onVarTransmit = var9; // L: 1275
			var3.varTransmitTriggers = var5; // L: 1276
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) { // L: 1278
			var3.onTimer = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) { // L: 1279
			var3.onOp = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) { // L: 1280
			var3.onDragComplete = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) { // L: 1281
			var3.onClickRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) { // L: 1282
			var3.onMouseRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) { // L: 1283
			var3.onInvTransmit = var9; // L: 1284
			var3.invTransmitTriggers = var5; // L: 1285
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) { // L: 1287
			var3.onStatTransmit = var9; // L: 1288
			var3.statTransmitTriggers = var5; // L: 1289
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) {
			var3.onTargetEnter = var9; // L: 1291
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) { // L: 1292
			var3.onScroll = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) { // L: 1293
			var3.onChatTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) { // L: 1294
			var3.onKey = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) { // L: 1295
			var3.onFriendTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) { // L: 1296
			var3.onClanTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) { // L: 1297
			var3.onMiscTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) { // L: 1298
			var3.onDialogAbort = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) { // L: 1299
			var3.onSubChange = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) { // L: 1300
			var3.onStockTransmit = var9;
		} else if (var0 == 1426) { // L: 1301
			var3.field3725 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) { // L: 1302
			var3.onResize = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) { // L: 1303
			var3.field3718 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) { // L: 1304
			var3.field3719 = var9;
		} else if (var0 == 1430) { // L: 1305
			var3.field3714 = var9;
		} else if (var0 == 1431) { // L: 1306
			var3.field3715 = var9;
		} else if (var0 == 1434) { // L: 1307
			var3.field3703 = var9;
		} else if (var0 == 1435) { // L: 1308
			var3.field3739 = var9;
		} else {
			if (var0 < 1436 || var0 > 1439) { // L: 1309
				return 2; // L: 1319
			}

			class325 var8 = var3.method6383(); // L: 1310
			if (var8 != null) { // L: 1311
				if (var0 == 1436) { // L: 1312
					var8.field3532 = var9;
				} else if (var0 == 1437) { // L: 1313
					var8.field3533 = var9;
				} else if (var0 == 1438) { // L: 1314
					var8.field3534 = var9;
				} else if (var0 == 1439) { // L: 1315
					var8.field3528 = var9;
				}
			}
		}

		var3.hasListener = true; // L: 1321
		return 1; // L: 1322
	}
}
