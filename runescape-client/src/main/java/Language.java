import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
@Implements("Language")
public class Language implements Enumerated
{
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "[Lkn;"
	)
	@Export("Language_valuesOrdered")
	static final Language[] Language_valuesOrdered;
	@ObfuscatedName("r")
	final String field3679;
	@ObfuscatedName("h")
	@Export("language")
	final String language;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -569331417
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field3701, 0, "GB");
		Language_DE = new Language("DE", "de", "German", ModeWhere.field3701, 1, "DE");
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field3701, 2, "FR");
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field3701, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field3692, 4, "NL");
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field3692, 5, "ES");
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field3701, 6, "MX");
		Language[] var0 = new Language[]{Language_EN, Language_ES, Language_ES_MX, Language_PT, Language_FR, Language_DE, Language_NL};
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
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkg;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field3679 = var1;
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
		descriptor = "(I)I",
		garbageValue = "-1154679040"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "536714658"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language;
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Lkn;",
		garbageValue = "727376217"
	)
	public static Language method5269(int var0) {
		return var0 >= 0 && var0 < Language_valuesOrdered.length ? Language_valuesOrdered[var0] : null;
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "42"
	)
	static void method5270() {
		GrandExchangeEvent.method5222(UserComparator3.menuWidth / 2 + StructComposition.menuX, class143.menuY);
	}
}
