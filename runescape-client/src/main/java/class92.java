import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("de")
public class class92 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	static final class92 field1153;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	static final class92 field1140;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	static final class92 field1141;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	static final class92 field1142;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	static final class92 field1151;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	static final class92 field1143;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	static final class92 field1145;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	static final class92 field1146;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	static final class92 field1147;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	static final class92 field1139;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	static final class92 field1149;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	static final class92 field1150;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	static final class92 field1144;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	static final class92 field1152;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	static final class92 field1155;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	static final class92 field1154;
	@ObfuscatedName("bt")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;

	static {
		field1153 = new class92(); // L: 12918
		field1140 = new class92(); // L: 12919
		field1141 = new class92(); // L: 12920
		field1142 = new class92(); // L: 12921
		field1151 = new class92(); // L: 12922
		field1143 = new class92(); // L: 12923
		field1145 = new class92(); // L: 12924
		field1146 = new class92(); // L: 12925
		field1147 = new class92(); // L: 12926
		field1139 = new class92(); // L: 12927
		field1149 = new class92(); // L: 12928
		field1150 = new class92(); // L: 12929
		field1144 = new class92(); // L: 12930
		field1152 = new class92(); // L: 12931
		field1155 = new class92(); // L: 12932
		field1154 = new class92();
	} // L: 12933

	class92() {
	} // L: 12935

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lfp;FZB)F",
		garbageValue = "-49"
	)
	static float method2405(class130 var0, float var1, boolean var2) {
		float var3 = 0.0F; // L: 222
		if (var0 != null && var0.method3085() != 0) { // L: 223
			float var4 = (float)var0.field1534[0].field1489; // L: 226
			float var5 = (float)var0.field1534[var0.method3085() - 1].field1489; // L: 227
			float var6 = var5 - var4; // L: 228
			if ((double)var6 == 0.0D) { // L: 229
				return var0.field1534[0].field1485; // L: 230
			} else {
				float var7 = 0.0F; // L: 232
				if (var1 > var5) { // L: 233
					var7 = (var1 - var5) / var6; // L: 234
				} else {
					var7 = (var1 - var4) / var6; // L: 237
				}

				double var8 = (double)((int)var7); // L: 239
				float var10 = Math.abs((float)((double)var7 - var8)); // L: 240
				float var11 = var10 * var6; // L: 241
				var8 = Math.abs(var8 + 1.0D); // L: 242
				double var12 = var8 / 2.0D; // L: 243
				double var14 = (double)((int)var12); // L: 244
				var10 = (float)(var12 - var14); // L: 245
				float var16;
				float var17;
				if (var2) { // L: 248
					if (var0.field1532 == class128.field1523) { // L: 249
						if (0.0D != (double)var10) { // L: 250
							var11 += var4; // L: 251
						} else {
							var11 = var5 - var11; // L: 254
						}
					} else if (var0.field1532 != class128.field1517 && var0.field1532 != class128.field1518) { // L: 257
						if (var0.field1532 == class128.field1519) { // L: 260
							var11 = var4 - var1; // L: 261
							var16 = var0.field1534[0].field1484; // L: 262
							var17 = var0.field1534[0].field1487; // L: 263
							var3 = var0.field1534[0].field1485; // L: 264
							if ((double)var16 != 0.0D) { // L: 265
								var3 -= var17 * var11 / var16; // L: 266
							}

							return var3; // L: 268
						}
					} else {
						var11 = var5 - var11; // L: 258
					}
				} else if (var0.field1544 == class128.field1523) { // L: 272
					if ((double)var10 != 0.0D) { // L: 273
						var11 = var5 - var11; // L: 274
					} else {
						var11 += var4; // L: 277
					}
				} else if (var0.field1544 != class128.field1517 && var0.field1544 != class128.field1518) { // L: 280
					if (var0.field1544 == class128.field1519) { // L: 283
						var11 = var1 - var5; // L: 284
						var16 = var0.field1534[var0.method3085() - 1].field1482; // L: 285
						var17 = var0.field1534[var0.method3085() - 1].field1486; // L: 286
						var3 = var0.field1534[var0.method3085() - 1].field1485; // L: 287
						if ((double)var16 != 0.0D) { // L: 288
							var3 += var17 * var11 / var16; // L: 289
						}

						return var3; // L: 291
					}
				} else {
					var11 += var4; // L: 281
				}

				var3 = Clock.method3657(var0, var11); // L: 294
				float var18;
				if (var2 && var0.field1532 == class128.field1518) { // L: 296
					var18 = var0.field1534[var0.method3085() - 1].field1485 - var0.field1534[0].field1485; // L: 297
					var3 = (float)((double)var3 - (double)var18 * var8); // L: 298
				} else if (!var2 && var0.field1544 == class128.field1518) { // L: 300
					var18 = var0.field1534[var0.method3085() - 1].field1485 - var0.field1534[0].field1485; // L: 301
					var3 = (float)((double)var3 + var8 * (double)var18); // L: 302
				}

				return var3; // L: 304
			}
		} else {
			return var3; // L: 224
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(CB)C",
		garbageValue = "52"
	)
	static char method2407(char var0) {
		if (var0 == 198) { // L: 95
			return 'E';
		} else if (var0 == 230) { // L: 96
			return 'e';
		} else if (var0 == 223) {
			return 's'; // L: 97
		} else if (var0 == 338) { // L: 98
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000'); // L: 99 100
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZB)I",
		garbageValue = "1"
	)
	static int method2406(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1245
			var0 -= 1000; // L: 1246
			var3 = Interpreter.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1247
		} else {
			var3 = var2 ? Interpreter.scriptDotWidget : class184.field1907; // L: 1249
		}

		String var4 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 1250
		int[] var5 = null; // L: 1251
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') { // L: 1252
			int var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1253
			if (var6 > 0) { // L: 1254
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]) { // L: 1255 1256
				}
			}

			var4 = var4.substring(0, var4.length() - 1); // L: 1258
		}

		Object[] var9 = new Object[var4.length() + 1]; // L: 1260

		int var7;
		for (var7 = var9.length - 1; var7 >= 1; --var7) { // L: 1261
			if (var4.charAt(var7 - 1) == 's') { // L: 1262
				var9[var7] = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize];
			} else {
				var9[var7] = new Integer(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1263
			}
		}

		var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1265
		if (var7 != -1) { // L: 1266
			var9[0] = new Integer(var7);
		} else {
			var9 = null; // L: 1267
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) { // L: 1268
			var3.onClick = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) { // L: 1269
			var3.onHold = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) { // L: 1270
			var3.onRelease = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) { // L: 1271
			var3.onMouseOver = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) { // L: 1272
			var3.onMouseLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) { // L: 1273
			var3.onDrag = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) { // L: 1274
			var3.onTargetLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) { // L: 1275
			var3.onVarTransmit = var9; // L: 1276
			var3.varTransmitTriggers = var5; // L: 1277
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) { // L: 1279
			var3.onTimer = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) { // L: 1280
			var3.onOp = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) { // L: 1281
			var3.onDragComplete = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) { // L: 1282
			var3.onClickRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) { // L: 1283
			var3.onMouseRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) { // L: 1284
			var3.onInvTransmit = var9; // L: 1285
			var3.invTransmitTriggers = var5; // L: 1286
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) { // L: 1288
			var3.onStatTransmit = var9; // L: 1289
			var3.statTransmitTriggers = var5; // L: 1290
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) { // L: 1292
			var3.onTargetEnter = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) { // L: 1293
			var3.onScroll = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) { // L: 1294
			var3.onChatTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) { // L: 1295
			var3.onKey = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) { // L: 1296
			var3.onFriendTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) { // L: 1297
			var3.onClanTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) { // L: 1298
			var3.onMiscTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) { // L: 1299
			var3.onDialogAbort = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) { // L: 1300
			var3.onSubChange = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) { // L: 1301
			var3.onStockTransmit = var9;
		} else if (var0 == 1426) { // L: 1302
			var3.field3750 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) { // L: 1303
			var3.onResize = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) { // L: 1304
			var3.field3743 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) { // L: 1305
			var3.field3667 = var9;
		} else if (var0 == 1430) { // L: 1306
			var3.field3739 = var9;
		} else if (var0 == 1431) { // L: 1307
			var3.field3673 = var9;
		} else if (var0 == 1434) { // L: 1308
			var3.field3751 = var9;
		} else if (var0 == 1435) { // L: 1309
			var3.field3735 = var9;
		} else {
			if (var0 < 1436 || var0 > 1439) { // L: 1310
				return 2; // L: 1320
			}

			class327 var8 = var3.method6504(); // L: 1311
			if (var8 != null) { // L: 1312
				if (var0 == 1436) { // L: 1313
					var8.field3553 = var9;
				} else if (var0 == 1437) { // L: 1314
					var8.field3549 = var9;
				} else if (var0 == 1438) { // L: 1315
					var8.field3555 = var9;
				} else if (var0 == 1439) { // L: 1316
					var8.field3554 = var9;
				}
			}
		}

		var3.hasListener = true; // L: 1322
		return 1; // L: 1323
	}
}
