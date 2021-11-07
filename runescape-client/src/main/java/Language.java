import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kz")
@Implements("Language")
public class Language implements MouseWheel {
	@ObfuscatedName("td")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "[Lkz;"
	)
	@Export("Language_valuesOrdered")
	static final Language[] Language_valuesOrdered;
	@ObfuscatedName("p")
	final String field3780;
	@ObfuscatedName("j")
	@Export("language")
	final String language;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1281273687
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field3803, 0, "GB");
		Language_DE = new Language("DE", "de", "German", ModeWhere.field3803, 1, "DE");
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field3803, 2, "FR");
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field3803, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field3793, 4, "NL");
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field3793, 5, "ES");
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field3803, 6, "MX");
		Language[] var0 = new Language[]{Language_DE, Language_NL, Language_EN, Language_ES, Language_PT, Language_FR, Language_ES_MX};
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
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lks;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field3780 = var1;
		this.language = var2;
		this.id = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-157236574"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "238732485"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2088906583"
	)
	public static int method5533(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)Lkz;",
		garbageValue = "60"
	)
	public static Language method5519(int var0) {
		return var0 >= 0 && var0 < Language_valuesOrdered.length ? Language_valuesOrdered[var0] : null;
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-88"
	)
	static final boolean method5521() {
		return Client.isMenuOpen;
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "440428579"
	)
	static final void method5516(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
			if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
				Client.field553[var4] = true;
			}
		}

	}
}
