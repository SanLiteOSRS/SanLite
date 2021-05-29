import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kk")
@Implements("Language")
public class Language implements Enumerated {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "[Lkk;"
	)
	@Export("Language_valuesOrdered")
	static final Language[] Language_valuesOrdered;
	@ObfuscatedName("b")
	final String field3680;
	@ObfuscatedName("d")
	@Export("language")
	final String language;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 2108172383
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field3686, 0, "GB");
		Language_DE = new Language("DE", "de", "German", ModeWhere.field3686, 1, "DE");
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field3686, 2, "FR");
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field3686, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field3698, 4, "NL");
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field3698, 5, "ES");
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field3686, 6, "MX");
		Language[] var0 = method5145();
		Language_valuesOrdered = new Language[var0.length];
		Language[] var1 = var0;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			Language var3 = var1[var2];
			if (Language_valuesOrdered[var3.id] != null) {
				throw new IllegalStateException();
			}

			Language_valuesOrdered[var3.id] = var3;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkl;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field3680 = var1;
		this.language = var2;
		this.id = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-907662946"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "91"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language;
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)[Lkk;",
		garbageValue = "123"
	)
	static Language[] method5145() {
		return new Language[]{Language_FR, Language_DE, Language_ES_MX, Language_ES, Language_EN, Language_NL, Language_PT};
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)Lkk;",
		garbageValue = "-17"
	)
	public static Language method5151(int var0) {
		return var0 >= 0 && var0 < Language_valuesOrdered.length ? Language_valuesOrdered[var0] : null;
	}
}
