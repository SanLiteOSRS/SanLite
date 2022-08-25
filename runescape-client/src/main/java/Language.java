import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@lu
@jf
@ObfuscatedName("lv")
@Implements("Language")
public class Language implements MouseWheel {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "[Llv;"
	)
	@Export("Language_valuesOrdered")
	public static final Language[] Language_valuesOrdered;
	@ObfuscatedName("k")
	final String field4100;
	@ObfuscatedName("o")
	@Export("language")
	final String language;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -265545555
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4121, 0, "GB"); // L: 12
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4121, 1, "DE"); // L: 13
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4121, 2, "FR"); // L: 14
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4121, 3, "BR"); // L: 15
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4110, 4, "NL"); // L: 16
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4110, 5, "ES"); // L: 17
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4121, 6, "MX"); // L: 18
		Language[] var0 = new Language[]{Language_FR, Language_PT, Language_DE, Language_NL, Language_EN, Language_ES_MX, Language_ES}; // L: 27
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
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lli;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4100 = var1; // L: 46
		this.language = var2; // L: 47
		this.id = var5; // L: 48
		if (var6 != null) { // L: 49
			new Locale(var2.substring(0, 2), var6); // L: 50
		} else {
			new Locale(var2.substring(0, 2)); // L: 53
		}

	} // L: 55

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1094068994"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language; // L: 58
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "104"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 63
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH); // L: 68
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Lny;",
		garbageValue = "7"
	)
	public static class388 method5989() {
		synchronized(class388.field4399) { // L: 25
			if (class388.field4400 == 0) { // L: 26
				return new class388();
			} else {
				class388.field4399[--class388.field4400].method6940(); // L: 28
				return class388.field4399[class388.field4400]; // L: 29
			}
		}
	}
}
