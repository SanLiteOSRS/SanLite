import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@oe
@mx
@ObfuscatedName("ol")
@Implements("Language")
public class Language implements class371 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lol;"
	)
	@Export("Language_valuesOrdered")
	public static final Language[] Language_valuesOrdered;
	@ObfuscatedName("ub")
	@ObfuscatedGetter(
		intValue = -1759786368
	)
	static int field4367;
	@ObfuscatedName("an")
	final String field4354;
	@ObfuscatedName("au")
	@Export("language")
	final String language;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1371206695
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4373, 0, "GB"); // L: 12
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4373, 1, "DE"); // L: 13
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4373, 2, "FR"); // L: 14
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4373, 3, "BR"); // L: 15
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4386, 4, "NL"); // L: 16
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4386, 5, "ES"); // L: 17
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4373, 6, "MX"); // L: 18
		Language[] var0 = new Language[]{Language_EN, Language_FR, Language_ES_MX, Language_PT, Language_ES, Language_DE, Language_NL}; // L: 27
		Language_valuesOrdered = new Language[var0.length]; // L: 30
		Language[] var2 = var0; // L: 32

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 33
			Language var4 = var2[var3]; // L: 34
			if (Language_valuesOrdered[var4.id] != null) { // L: 36
				throw new IllegalStateException(); // L: 37
			}

			Language_valuesOrdered[var4.id] = var4; // L: 39
		}

	} // L: 43

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Low;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4354 = var1; // L: 46
		this.language = var2; // L: 47
		this.id = var5; // L: 48
		if (var6 != null) { // L: 49
			new Locale(var2.substring(0, 2), var6); // L: 50
		} else {
			new Locale(var2.substring(0, 2)); // L: 53
		}

	} // L: 55

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1233989967"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 63
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "427138869"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language; // L: 58
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH); // L: 68
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhj;",
		garbageValue = "-72"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0); // L: 79
		if (var1 != null) { // L: 80
			return var1;
		} else {
			byte[] var2 = class152.ObjectDefinition_archive.takeFile(6, var0); // L: 81
			var1 = new ObjectComposition(); // L: 82
			var1.id = var0; // L: 83
			if (var2 != null) { // L: 84
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 85
			if (var1.isSolid) { // L: 86
				var1.interactType = 0; // L: 87
				var1.boolean1 = false; // L: 88
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0); // L: 90
			return var1; // L: 91
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-652788867"
	)
	static boolean method7008(char var0) {
		for (int var1 = 0; var1 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var1) { // L: 1133
			if (var0 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var1)) { // L: 1134
				return true;
			}
		}

		return false; // L: 1136
	}

	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "808661988"
	)
	static String method7016(String var0) {
		PlayerType[] var1 = class218.PlayerType_values(); // L: 12811

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 12812
			PlayerType var3 = var1[var2]; // L: 12813
			if (var3.modIcon != -1 && var0.startsWith(class59.method1170(var3.modIcon))) { // L: 12815 12816
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length()); // L: 12817
				break;
			}
		}

		return var0; // L: 12824
	}
}
