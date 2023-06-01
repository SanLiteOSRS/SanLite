import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ou
@mi
@ObfuscatedName("or")
@Implements("Language")
public class Language implements class369 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Lor;"
	)
	@Export("Language_valuesOrdered")
	static final Language[] Language_valuesOrdered;
	@ObfuscatedName("tv")
	@ObfuscatedSignature(
		descriptor = "Lbu;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("aj")
	final String field4353;
	@ObfuscatedName("ac")
	@Export("language")
	final String language;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1688561475
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4381, 0, "GB"); // L: 12
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4381, 1, "DE"); // L: 13
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4381, 2, "FR"); // L: 14
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4381, 3, "BR"); // L: 15
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4368, 4, "NL"); // L: 16
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4368, 5, "ES"); // L: 17
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4381, 6, "MX"); // L: 18
		Language[] var0 = method6930(); // L: 25
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
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lop;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4353 = var1; // L: 46
		this.language = var2; // L: 47
		this.id = var5; // L: 48
		if (var6 != null) { // L: 49
			new Locale(var2.substring(0, 2), var6); // L: 50
		} else {
			new Locale(var2.substring(0, 2)); // L: 53
		}

	} // L: 55

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1108588956"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 63
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "680325140"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language; // L: 58
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH); // L: 73
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[Lor;",
		garbageValue = "942417119"
	)
	static Language[] method6930() {
		return new Language[]{Language_NL, Language_DE, Language_EN, Language_FR, Language_PT, Language_ES, Language_ES_MX}; // L: 42
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lor;",
		garbageValue = "-1735407327"
	)
	public static Language method6931(int var0) {
		return var0 >= 0 && var0 < Language_valuesOrdered.length ? Language_valuesOrdered[var0] : null; // L: 67 68
	}
}
