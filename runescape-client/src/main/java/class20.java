import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ac")
public class class20 {
	@ObfuscatedName("gz")
	static String field114;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -500281911
	)
	final int field112;
	@ObfuscatedName("ay")
	final Map field106;
	@ObfuscatedName("ar")
	final String field108;

	class20(String var1) {
		this.field112 = 400; // L: 35
		this.field106 = null; // L: 36
		this.field108 = ""; // L: 37
	} // L: 38

	class20(HttpURLConnection var1) throws IOException {
		this.field112 = var1.getResponseCode(); // L: 17
		var1.getResponseMessage(); // L: 18
		this.field106 = var1.getHeaderFields();
		StringBuilder var2 = new StringBuilder();
		InputStream var3 = this.field112 >= 300 ? var1.getErrorStream() : var1.getInputStream(); // L: 21
		if (var3 != null) { // L: 22
			InputStreamReader var4 = new InputStreamReader(var3); // L: 23
			BufferedReader var5 = new BufferedReader(var4); // L: 24

			String var6;
			while ((var6 = var5.readLine()) != null) { // L: 26
				var2.append(var6); // L: 27
			}

			var3.close(); // L: 29
		}

		this.field108 = var2.toString(); // L: 31
	} // L: 32

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1919676702"
	)
	public int method284() {
		return this.field112; // L: 41
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Map;",
		garbageValue = "93"
	)
	public Map method285() {
		return this.field106; // L: 45
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1874601503"
	)
	public String method286() {
		return this.field108; // L: 49
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-425693267"
	)
	public static void method292(AbstractArchive var0) {
		StructComposition.StructDefinition_archive = var0; // L: 19
	} // L: 20

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(CB)C",
		garbageValue = "-112"
	)
	static char method296(char var0) {
		switch(var0) { // L: 84
		case ' ':
		case '-':
		case '_':
		case ' ':
			return '_'; // L: 97
		case '#':
		case '[':
		case ']':
			return var0; // L: 121
		case 'À':
		case 'Á':
		case 'Â':
		case 'Ã':
		case 'Ä':
		case 'à':
		case 'á':
		case 'â':
		case 'ã':
		case 'ä':
			return 'a'; // L: 108
		case 'Ç':
		case 'ç':
			return 'c'; // L: 92
		case 'È':
		case 'É':
		case 'Ê':
		case 'Ë':
		case 'è':
		case 'é':
		case 'ê':
		case 'ë':
			return 'e'; // L: 130
		case 'Í':
		case 'Î':
		case 'Ï':
		case 'í':
		case 'î':
		case 'ï':
			return 'i'; // L: 139
		case 'Ñ':
		case 'ñ':
			return 'n'; // L: 153
		case 'Ò':
		case 'Ó':
		case 'Ô':
		case 'Õ':
		case 'Ö':
		case 'ò':
		case 'ó':
		case 'ô':
		case 'õ':
		case 'ö':
			return 'o'; // L: 150
		case 'Ù':
		case 'Ú':
		case 'Û':
		case 'Ü':
		case 'ù':
		case 'ú':
		case 'û':
		case 'ü':
			return 'u'; // L: 117
		case 'ß':
			return 'b'; // L: 132
		case 'ÿ':
		case 'Ÿ':
			return 'y'; // L: 87
		default:
			return Character.toLowerCase(var0); // L: 89
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-2069534350"
	)
	static int method297(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1245
			var0 -= 1000; // L: 1246
			var3 = VarbitComposition.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1247
		} else {
			var3 = var2 ? class36.scriptDotWidget : class351.field3896; // L: 1249
		}

		String var4 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1250
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
			if (var4.charAt(var7 - 1) == 's') {
				var9[var7] = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1262
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
			var3.field3746 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) { // L: 1303
			var3.onResize = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) { // L: 1304
			var3.field3739 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) { // L: 1305
			var3.field3740 = var9;
		} else if (var0 == 1430) { // L: 1306
			var3.field3618 = var9;
		} else if (var0 == 1431) { // L: 1307
			var3.field3635 = var9;
		} else if (var0 == 1434) { // L: 1308
			var3.field3747 = var9;
		} else if (var0 == 1435) { // L: 1309
			var3.field3628 = var9;
		} else {
			if (var0 < 1436 || var0 > 1439) { // L: 1310
				return 2; // L: 1320
			}

			class328 var8 = var3.method6471(); // L: 1311
			if (var8 != null) { // L: 1312
				if (var0 == 1436) { // L: 1313
					var8.field3557 = var9;
				} else if (var0 == 1437) { // L: 1314
					var8.field3556 = var9;
				} else if (var0 == 1438) { // L: 1315
					var8.field3554 = var9;
				} else if (var0 == 1439) { // L: 1316
					var8.field3553 = var9;
				}
			}
		}

		var3.hasListener = true; // L: 1322
		return 1; // L: 1323
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lbq;I)V",
		garbageValue = "439702935"
	)
	static void method287(GameEngine var0) {
		class213 var1 = SceneTilePaint.method4952(); // L: 2037

		while (var1.method4162()) { // L: 2038
			if (var1.field2330 == 13) { // L: 2039
				Login.worldSelectOpen = false; // L: 2041
				class407.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 2042
				ScriptFrame.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 2043
				Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 2044
				return; // L: 2046
			}

			if (var1.field2330 == 96) { // L: 2048
				if (Login.worldSelectPage > 0 && class47.worldSelectLeftSprite != null) { // L: 2049
					--Login.worldSelectPage; // L: 2050
				}
			} else if (var1.field2330 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && FontName.worldSelectRightSprite != null) { // L: 2053 2054
				++Login.worldSelectPage; // L: 2055
			}
		}

		if (MouseHandler.MouseHandler_lastButton == 1 || !KeyHandler.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 2059
			int var2 = Login.xPadding + 280; // L: 2060
			if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 2061
				class300.changeWorldSelectSorting(0, 0); // L: 2062
				return; // L: 2063
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 2065
				class300.changeWorldSelectSorting(0, 1); // L: 2066
				return; // L: 2067
			}

			int var3 = Login.xPadding + 390; // L: 2069
			if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 2070
				class300.changeWorldSelectSorting(1, 0); // L: 2071
				return; // L: 2072
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 2074
				class300.changeWorldSelectSorting(1, 1); // L: 2075
				return; // L: 2076
			}

			int var4 = Login.xPadding + 500; // L: 2078
			if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 2079
				class300.changeWorldSelectSorting(2, 0); // L: 2080
				return; // L: 2081
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 2083
				class300.changeWorldSelectSorting(2, 1); // L: 2084
				return; // L: 2085
			}

			int var5 = Login.xPadding + 610; // L: 2087
			if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 2088
				class300.changeWorldSelectSorting(3, 0); // L: 2089
				return; // L: 2090
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 2092
				class300.changeWorldSelectSorting(3, 1); // L: 2093
				return; // L: 2094
			}

			if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) { // L: 2096
				Login.worldSelectOpen = false; // L: 2098
				class407.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 2099
				ScriptFrame.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 2100
				Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 2101
				return; // L: 2103
			}

			if (Login.hoveredWorldIndex != -1) { // L: 2105
				World var6 = class387.World_worlds[Login.hoveredWorldIndex]; // L: 2106
				if (var6.isDeadman()) { // L: 2107
					var6.field823 = "beta"; // L: 2108
				}

				boolean var7 = false; // L: 2110
				if (var6.properties != Client.worldProperties) { // L: 2111
					boolean var8 = (Client.worldProperties & 65536) != 0; // L: 2112
					boolean var9 = var6.isDeadman(); // L: 2113
					if (var8 && !var9 || !var8 && var9) { // L: 2114
						var7 = true; // L: 2115
					}
				}

				class137.changeWorld(var6); // L: 2118
				Login.worldSelectOpen = false; // L: 2120
				class407.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 2121
				ScriptFrame.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 2122
				Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 2123
				if (var7) { // L: 2125
					InterfaceParent.method2277(); // L: 2126
				}

				return; // L: 2128
			}

			if (Login.worldSelectPage > 0 && class47.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class47.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= WorldMapArchiveLoader.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= WorldMapArchiveLoader.canvasHeight / 2 + 50) { // L: 2130
				--Login.worldSelectPage; // L: 2131
			}

			if (Login.worldSelectPage < Login.worldSelectPagesCount && FontName.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= GrandExchangeOfferTotalQuantityComparator.canvasWidth - FontName.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= GrandExchangeOfferTotalQuantityComparator.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= WorldMapArchiveLoader.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= WorldMapArchiveLoader.canvasHeight / 2 + 50) { // L: 2133
				++Login.worldSelectPage; // L: 2134
			}
		}

	} // L: 2137
}
