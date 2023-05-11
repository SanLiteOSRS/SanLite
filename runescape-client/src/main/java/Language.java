import java.io.IOException;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@nk
@lj
@ObfuscatedName("nx")
@Implements("Language")
public class Language implements class356 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Lnx;"
	)
	@Export("Language_valuesOrdered")
	static final Language[] Language_valuesOrdered;
	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("al")
	final String field4329;
	@ObfuscatedName("at")
	@Export("language")
	final String language;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1624506429
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4351, 0, "GB"); // L: 12
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4351, 1, "DE"); // L: 13
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4351, 2, "FR"); // L: 14
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4351, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4343, 4, "NL"); // L: 16
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4343, 5, "ES"); // L: 17
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4351, 6, "MX"); // L: 18
		Language[] var0 = method6938(); // L: 25
		Language_valuesOrdered = new Language[var0.length]; // L: 26
		Language[] var1 = var0; // L: 28

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 29
			Language var3 = var1[var2]; // L: 30
			if (Language_valuesOrdered[var3.id] != null) { // L: 32
				throw new IllegalStateException(); // L: 33
			}

			Language_valuesOrdered[var3.id] = var3; // L: 35
		}

	} // L: 39

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lne;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4329 = var1; // L: 46
		this.language = var2; // L: 47
		this.id = var5; // L: 48
		if (var6 != null) { // L: 49
			new Locale(var2.substring(0, 2), var6); // L: 50
		} else {
			new Locale(var2.substring(0, 2)); // L: 53
		}

	} // L: 55

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "741942848"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 63
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "80"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language; // L: 58
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH); // L: 73
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)[Lnx;",
		garbageValue = "-121"
	)
	static Language[] method6938() {
		return new Language[]{Language_FR, Language_NL, Language_DE, Language_ES_MX, Language_PT, Language_EN, Language_ES}; // L: 42
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)[Lmb;",
		garbageValue = "-10"
	)
	public static class337[] method6942() {
		return new class337[]{class337.field4162, class337.field4163, class337.field4164, class337.field4161}; // L: 15
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Lnx;",
		garbageValue = "-1"
	)
	public static Language method6921(int var0) {
		return var0 >= 0 && var0 < Language_valuesOrdered.length ? Language_valuesOrdered[var0] : null; // L: 67 68
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Lsh;B)Ljava/lang/Object;",
		garbageValue = "90"
	)
	static Object method6940(class478 var0) {
		if (var0 == null) { // L: 5260
			throw new IllegalStateException("popValueOfType() failure - null baseVarType"); // L: 5261
		} else {
			switch(var0.field4949) { // L: 5263
			case 1:
				return Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5265
			case 2:
				return Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 5269
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type"); // L: 5267
			}
		}
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-257332846"
	)
	static final void method6931(boolean var0) {
		class323.playPcmPlayers(); // L: 5674
		++Client.packetWriter.pendingWrites; // L: 5675
		if (Client.packetWriter.pendingWrites >= 50 || var0) { // L: 5676
			Client.packetWriter.pendingWrites = 0; // L: 5677
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) { // L: 5678
				PacketBufferNode var1 = class330.getPacketBufferNode(ClientPacket.field3188, Client.packetWriter.isaacCipher); // L: 5680
				Client.packetWriter.addNode(var1); // L: 5681

				try {
					Client.packetWriter.flush(); // L: 5683
				} catch (IOException var3) { // L: 5685
					Client.hadNetworkError = true; // L: 5686
				}
			}

		}
	} // L: 5689
}
