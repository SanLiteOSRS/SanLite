import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jh")
@Implements("Language")
public class Language implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Ljh;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Ljh;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Ljh;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Ljh;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Ljh;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "Ljh;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Ljh;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "[Ljh;"
	)
	@Export("Language_valuesOrdered")
	static final Language[] Language_valuesOrdered;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		signature = "Lcy;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;
	@ObfuscatedName("gr")
	@ObfuscatedGetter(
		intValue = 2000557037
	)
	static int field3357;
	@ObfuscatedName("g")
	final String field3352;
	@ObfuscatedName("h")
	@Export("language")
	final String language;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 862102775
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field3373, 0, "GB");
		Language_DE = new Language("DE", "de", "German", ModeWhere.field3373, 1, "DE");
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field3373, 2, "FR");
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field3373, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field3363, 4, "NL");
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field3363, 5, "ES");
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field3373, 6, "MX");
		Language[] var0 = method4693();
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
		signature = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljb;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field3352 = var1;
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
		signature = "(I)I",
		garbageValue = "-1000839247"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(I)Ljava/lang/String;",
		garbageValue = "-429051103"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language;
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(IIB)I",
		garbageValue = "31"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(B)[Ljh;",
		garbageValue = "-79"
	)
	static Language[] method4693() {
		return new Language[]{Language_EN, Language_PT, Language_DE, Language_ES_MX, Language_NL, Language_FR, Language_ES};
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(IB)Ljh;",
		garbageValue = "13"
	)
	public static Language method4691(int var0) {
		return var0 >= 0 && var0 < Language_valuesOrdered.length ? Language_valuesOrdered[var0] : null;
	}
}
