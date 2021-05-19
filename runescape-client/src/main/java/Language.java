import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kr")
@Implements("Language")
public class Language implements Enumerated {
	@ObfuscatedName("rf")
	@ObfuscatedGetter(
		intValue = 670694272
	)
	static int field3704;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "[Lkr;"
	)
	@Export("Language_valuesOrdered")
	public static final Language[] Language_valuesOrdered;
	@ObfuscatedName("v")
	final String field3701;
	@ObfuscatedName("b")
	@Export("language")
	final String language;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -2016416161
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field3710, 0, "GB");
		Language_DE = new Language("DE", "de", "German", ModeWhere.field3710, 1, "DE");
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field3710, 2, "FR");
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field3710, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field3717, 4, "NL");
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field3717, 5, "ES");
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field3710, 6, "MX");
		Language[] var0 = new Language[]{Language_DE, Language_NL, Language_FR, Language_ES_MX, Language_EN, Language_PT, Language_ES};
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
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkb;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field3701 = var1;
		this.language = var2;
		this.id = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-708237537"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-65"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language;
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)[B",
		garbageValue = "21"
	)
	public static byte[] method5070(CharSequence var0) {
		int var1 = var0.length();
		byte[] var2 = new byte[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if (var4 > 0 && var4 < 128 || var4 >= 160 && var4 <= 255) {
				var2[var3] = (byte)var4;
			} else if (var4 == 8364) {
				var2[var3] = -128;
			} else if (var4 == 8218) {
				var2[var3] = -126;
			} else if (var4 == 402) {
				var2[var3] = -125;
			} else if (var4 == 8222) {
				var2[var3] = -124;
			} else if (var4 == 8230) {
				var2[var3] = -123;
			} else if (var4 == 8224) {
				var2[var3] = -122;
			} else if (var4 == 8225) {
				var2[var3] = -121;
			} else if (var4 == 710) {
				var2[var3] = -120;
			} else if (var4 == 8240) {
				var2[var3] = -119;
			} else if (var4 == 352) {
				var2[var3] = -118;
			} else if (var4 == 8249) {
				var2[var3] = -117;
			} else if (var4 == 338) {
				var2[var3] = -116;
			} else if (var4 == 381) {
				var2[var3] = -114;
			} else if (var4 == 8216) {
				var2[var3] = -111;
			} else if (var4 == 8217) {
				var2[var3] = -110;
			} else if (var4 == 8220) {
				var2[var3] = -109;
			} else if (var4 == 8221) {
				var2[var3] = -108;
			} else if (var4 == 8226) {
				var2[var3] = -107;
			} else if (var4 == 8211) {
				var2[var3] = -106;
			} else if (var4 == 8212) {
				var2[var3] = -105;
			} else if (var4 == 732) {
				var2[var3] = -104;
			} else if (var4 == 8482) {
				var2[var3] = -103;
			} else if (var4 == 353) {
				var2[var3] = -102;
			} else if (var4 == 8250) {
				var2[var3] = -101;
			} else if (var4 == 339) {
				var2[var3] = -100;
			} else if (var4 == 382) {
				var2[var3] = -98;
			} else if (var4 == 376) {
				var2[var3] = -97;
			} else {
				var2[var3] = 63;
			}
		}

		return var2;
	}
}
