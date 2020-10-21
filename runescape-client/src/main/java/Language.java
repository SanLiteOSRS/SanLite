import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gb")
@Implements("Language")
public class Language implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lgb;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lgb;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lgb;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lgb;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lgb;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lgb;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lgb;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "[Lgb;"
	)
	@Export("Language_valuesOrdered")
	static final Language[] Language_valuesOrdered;
	@ObfuscatedName("c")
	final String field2386;
	@ObfuscatedName("u")
	@Export("language")
	final String language;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 311704961
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field2400, 0, "GB");
		Language_DE = new Language("DE", "de", "German", ModeWhere.field2400, 1, "DE");
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field2400, 2, "FR");
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field2400, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field2398, 4, "NL");
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field2398, 5, "ES");
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field2400, 6, "MX");
		Language[] var0 = new Language[]{Language_ES_MX, Language_PT, Language_FR, Language_EN, Language_NL, Language_ES, Language_DE};
		Language_valuesOrdered = new Language[var0.length];
		Language[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Language var4 = var2[var3];
			if (Language_valuesOrdered[var4.id] != null) {
				throw new IllegalStateException();
			}

			Language_valuesOrdered[var4.id] = var4;
		}

	}

	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgc;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field2386 = var1;
		this.language = var2;
		this.id = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)Ljava/lang/String;",
		garbageValue = "-1347438678"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "23"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(IB)Lgb;",
		garbageValue = "1"
	)
	public static Language method3800(int var0) {
		return var0 >= 0 && var0 < Language_valuesOrdered.length ? Language_valuesOrdered[var0] : null;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(ILco;ZI)I",
		garbageValue = "2079407888"
	)
	static int method3802(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = UserComparator4.getWidget(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? MouseRecorder.field621 : Interpreter.field1122;
		}

		String var4 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize];
		int[] var5 = null;
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
			int var6 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
			if (var6 > 0) {
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]) {
				}
			}

			var4 = var4.substring(0, var4.length() - 1);
		}

		Object[] var8 = new Object[var4.length() + 1];

		int var7;
		for (var7 = var8.length - 1; var7 >= 1; --var7) {
			if (var4.charAt(var7 - 1) == 's') {
				var8[var7] = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize];
			} else {
				var8[var7] = new Integer(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]);
			}
		}

		var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
		if (var7 != -1) {
			var8[0] = new Integer(var7);
		} else {
			var8 = null;
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) {
			var3.onClick = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) {
			var3.onHold = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) {
			var3.onRelease = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) {
			var3.onMouseOver = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) {
			var3.onMouseLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) {
			var3.onDrag = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) {
			var3.onTargetLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) {
			var3.onVarTransmit = var8;
			var3.varTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) {
			var3.onTimer = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) {
			var3.onOp = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) {
			var3.onDragComplete = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) {
			var3.onClickRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) {
			var3.onMouseRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) {
			var3.onInvTransmit = var8;
			var3.invTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) {
			var3.onStatTransmit = var8;
			var3.statTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) {
			var3.onTargetEnter = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) {
			var3.onScroll = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) {
			var3.onChatTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) {
			var3.onKey = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) {
			var3.onFriendTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) {
			var3.onClanTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) {
			var3.onMiscTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) {
			var3.onDialogAbort = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) {
			var3.onSubChange = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) {
			var3.onStockTransmit = var8;
		} else if (var0 == 1426) {
			var3.field2669 = var8;
		} else {
			if (var0 != ScriptOpcodes.CC_SETONRESIZE) {
				return 2;
			}

			var3.onResize = var8;
		}

		var3.hasListener = true;
		return 1;
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-581351950"
	)
	static void method3791() {
		Client.packetWriter.clearBuffer();
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1348 = null;
		Client.packetWriter.field1339 = null;
		Client.packetWriter.field1350 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1337 = 0;
		Client.rebootTimer = 0;
		AbstractWorldMapData.method375();
		Client.minimapState = 0;
		Client.destinationX = 0;

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) {
			Client.players[var0] = null;
		}

		PlayerType.localPlayer = null;

		for (var0 = 0; var0 < Client.npcs.length; ++var0) {
			NPC var1 = Client.npcs[var0];
			if (var1 != null) {
				var1.targetIndex = -1;
				var1.false0 = false;
			}
		}

		ItemContainer.itemContainers = new NodeHashTable(32);
		BuddyRankComparator.updateGameState(30);

		for (var0 = 0; var0 < 100; ++var0) {
			Client.field834[var0] = true;
		}

		Actor.method1855();
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		signature = "(Lkb;I)V",
		garbageValue = "-450810364"
	)
	static void method3801(Buffer var0) {
		if (Client.randomDatData != null) {
			var0.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
		} else {
			byte[] var1 = class92.method2172();
			var0.writeBytes(var1, 0, var1.length);
		}
	}
}
