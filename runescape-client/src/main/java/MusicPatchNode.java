import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kx")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1405159971
	)
	int field3427;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("patch")
	MusicPatch patch;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	MusicPatchNode2 field3428;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -632852283
	)
	int field3418;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 641391177
	)
	int field3419;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -529495939
	)
	int field3423;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -504007495
	)
	int field3421;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1627034491
	)
	int field3422;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 742573521
	)
	int field3414;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1904955935
	)
	int field3424;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -2065414593
	)
	int field3425;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -272808679
	)
	int field3420;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1342299511
	)
	int field3416;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1756880989
	)
	int field3415;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -262110351
	)
	int field3429;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -894231501
	)
	int field3430;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -146245059
	)
	int field3431;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1397627135
	)
	int field3433;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1978134147
	)
	int field3434;

	MusicPatchNode() {
	} // L: 31

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1866464890"
	)
	void method5787() {
		this.patch = null; // L: 34
		this.rawSound = null; // L: 35
		this.field3428 = null; // L: 36
		this.stream = null; // L: 37
	} // L: 38

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZS)I",
		garbageValue = "11174"
	)
	static int method5788(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1215
			var0 -= 1000; // L: 1216
			var3 = class175.getWidget(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]); // L: 1217
		} else {
			var3 = var2 ? class190.scriptDotWidget : class360.field4354; // L: 1219
		}

		String var4 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1220
		int[] var5 = null; // L: 1221
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') { // L: 1222
			int var6 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 1223
			if (var6 > 0) { // L: 1224
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]) { // L: 1225 1226
				}
			}

			var4 = var4.substring(0, var4.length() - 1); // L: 1228
		}

		Object[] var9 = new Object[var4.length() + 1]; // L: 1230

		int var7;
		for (var7 = var9.length - 1; var7 >= 1; --var7) { // L: 1231
			if (var4.charAt(var7 - 1) == 's') { // L: 1232
				var9[var7] = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
			} else {
				var9[var7] = new Integer(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]); // L: 1233
			}
		}

		var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 1235
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
			var3.field3567 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) { // L: 1273
			var3.onResize = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) { // L: 1274
			var3.field3553 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) { // L: 1275
			var3.field3663 = var9;
		} else if (var0 == 1430) { // L: 1276
			var3.field3658 = var9;
		} else if (var0 == 1431) { // L: 1277
			var3.field3653 = var9;
		} else if (var0 == 1434) { // L: 1278
			var3.field3670 = var9;
		} else if (var0 == 1435) { // L: 1279
			var3.field3654 = var9;
		} else {
			if (var0 < 1436 || var0 > 1439) { // L: 1280
				return 2; // L: 1290
			}

			class301 var8 = var3.method6185(); // L: 1281
			if (var8 != null) { // L: 1282
				if (var0 == 1436) { // L: 1283
					var8.field3467 = var9;
				} else if (var0 == 1437) { // L: 1284
					var8.field3468 = var9;
				} else if (var0 == 1438) { // L: 1285
					var8.field3465 = var9;
				} else if (var0 == 1439) { // L: 1286
					var8.field3469 = var9;
				}
			}
		}

		var3.hasListener = true; // L: 1292
		return 1; // L: 1293
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(IZZZZI)Lln;",
		garbageValue = "243666843"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		ArchiveDisk var5 = null; // L: 1825
		if (JagexCache.JagexCache_dat2File != null) { // L: 1826
			var5 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var5, WorldMapArea.masterDisk, var0, var1, var2, var3, var4); // L: 1827
	}
}
