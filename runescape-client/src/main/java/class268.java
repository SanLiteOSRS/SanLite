import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ju
@ObfuscatedName("jt")
public final class class268 {
	@ObfuscatedName("f")
	static final HashMap field3168;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;

	static {
		field3168 = new HashMap();
		java.util.Calendar.getInstance(method5208("Europe/London"));
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/util/TimeZone;",
		garbageValue = "1"
	)
	static TimeZone method5208(String var0) {
		synchronized(field3168) {
			TimeZone var2 = (TimeZone)field3168.get(var0);
			if (var2 == null) { // L: 24
				var2 = TimeZone.getTimeZone(var0);
				field3168.put(var0, var2); // L: 26
			}

			return var2; // L: 28
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llc;Llc;IZI)Lgz;",
		garbageValue = "1715905564"
	)
	public static Frames method5215(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true; // L: 11
		int[] var5 = var0.getGroupFileIds(var2); // L: 12

		for (int var6 = 0; var6 < var5.length; ++var6) { // L: 13
			byte[] var7 = var0.getFile(var2, var5[var6]); // L: 14
			if (var7 == null) { // L: 15
				var4 = false; // L: 16
			} else {
				int var8 = (var7[0] & 255) << 8 | var7[1] & 255; // L: 19
				byte[] var9;
				if (var3) { // L: 21
					var9 = var1.getFile(0, var8);
				} else {
					var9 = var1.getFile(var8, 0); // L: 22
				}

				if (var9 == null) { // L: 23
					var4 = false;
				}
			}
		}

		if (!var4) { // L: 25
			return null;
		} else {
			try {
				return new Frames(var0, var1, var2, var3); // L: 27
			} catch (Exception var11) { // L: 29
				return null; // L: 30
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1854999291"
	)
	public static int method5213() {
		return ++MouseHandler.MouseHandler_idleCycles - 1; // L: 50
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1818867324"
	)
	public static void method5210() {
		try {
			JagexCache.JagexCache_dat2File.close(); // L: 193

			for (int var0 = 0; var0 < JagexCache.idxCount; ++var0) { // L: 194
				class346.JagexCache_idxFiles[var0].close();
			}

			JagexCache.JagexCache_idx255File.close(); // L: 195
			JagexCache.JagexCache_randomDat.close(); // L: 196
		} catch (Exception var2) { // L: 198
		}

	} // L: 199

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZI)I",
		garbageValue = "1745861509"
	)
	static int method5214(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1041
			var0 -= 1000; // L: 1042
			var3 = FloorUnderlayDefinition.getWidget(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]); // L: 1043
		} else {
			var3 = var2 ? VertexNormal.scriptDotWidget : class321.scriptActiveWidget; // L: 1045
		}

		String var4 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 1046
		int[] var5 = null; // L: 1047
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') { // L: 1048
			int var6 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 1049
			if (var6 > 0) { // L: 1050
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]) { // L: 1051 1052
				}
			}

			var4 = var4.substring(0, var4.length() - 1); // L: 1054
		}

		Object[] var8 = new Object[var4.length() + 1]; // L: 1056

		int var7;
		for (var7 = var8.length - 1; var7 >= 1; --var7) { // L: 1057
			if (var4.charAt(var7 - 1) == 's') { // L: 1058
				var8[var7] = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
			} else {
				var8[var7] = new Integer(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]); // L: 1059
			}
		}

		var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 1061
		if (var7 != -1) { // L: 1062
			var8[0] = new Integer(var7);
		} else {
			var8 = null; // L: 1063
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) { // L: 1064
			var3.onClick = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) { // L: 1065
			var3.onHold = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) { // L: 1066
			var3.onRelease = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) { // L: 1067
			var3.onMouseOver = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) { // L: 1068
			var3.onMouseLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) { // L: 1069
			var3.onDrag = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) { // L: 1070
			var3.onTargetLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) { // L: 1071
			var3.onVarTransmit = var8; // L: 1072
			var3.varTransmitTriggers = var5; // L: 1073
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) { // L: 1075
			var3.onTimer = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) { // L: 1076
			var3.onOp = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) { // L: 1077
			var3.onDragComplete = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) { // L: 1078
			var3.onClickRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) { // L: 1079
			var3.onMouseRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) { // L: 1080
			var3.onInvTransmit = var8; // L: 1081
			var3.invTransmitTriggers = var5; // L: 1082
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) { // L: 1084
			var3.onStatTransmit = var8; // L: 1085
			var3.statTransmitTriggers = var5; // L: 1086
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) { // L: 1088
			var3.onTargetEnter = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) { // L: 1089
			var3.onScroll = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) { // L: 1090
			var3.onChatTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) { // L: 1091
			var3.onKey = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) { // L: 1092
			var3.onFriendTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) { // L: 1093
			var3.onClanTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) { // L: 1094
			var3.onMiscTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) { // L: 1095
			var3.onDialogAbort = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) { // L: 1096
			var3.onSubChange = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) { // L: 1097
			var3.onStockTransmit = var8;
		} else if (var0 == 1426) { // L: 1098
			var3.field3491 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) { // L: 1099
			var3.onResize = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) { // L: 1100
			var3.field3484 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) { // L: 1101
			var3.field3485 = var8;
		} else if (var0 == 1430) { // L: 1102
			var3.field3480 = var8;
		} else if (var0 == 1431) { // L: 1103
			var3.field3481 = var8;
		} else {
			if (var0 != 1434) { // L: 1104
				return 2; // L: 1105
			}

			var3.field3492 = var8;
		}

		var3.hasListener = true; // L: 1106
		return 1; // L: 1107
	}
}
