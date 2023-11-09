import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@li
@ju
@ObfuscatedName("lj")
@Implements("Language")
public class Language implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "[Llj;"
	)
	@Export("Language_valuesOrdered")
	static final Language[] Language_valuesOrdered;
	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		intValue = -695588165
	)
	@Export("menuX")
	static int menuX;
	@ObfuscatedName("j")
	final String field4120;
	@ObfuscatedName("h")
	@Export("language")
	final String language;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1032541303
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4138, 0, "GB"); // L: 12
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4138, 1, "DE"); // L: 13
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4138, 2, "FR"); // L: 14
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4138, 3, "BR"); // L: 15
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4131, 4, "NL"); // L: 16
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4131, 5, "ES"); // L: 17
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4138, 6, "MX"); // L: 18
		Language[] var0 = new Language[]{Language_ES, Language_FR, Language_PT, Language_EN, Language_DE, Language_ES_MX, Language_NL}; // L: 27
		Language_valuesOrdered = new Language[var0.length]; // L: 30
		Language[] var2 = var0; // L: 32

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 33
			Language var4 = var2[var3]; // L: 34
			if (Language_valuesOrdered[var4.id] != null) { // L: 36
				throw new IllegalStateException(); // L: 37
			}

			Language_valuesOrdered[var4.id] = var4; // L: 39
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llk;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4120 = var1; // L: 46
		this.language = var2; // L: 47
		this.id = var5; // L: 48
		if (var6 != null) { // L: 49
			new Locale(var2.substring(0, 2), var6); // L: 50
		} else {
			new Locale(var2.substring(0, 2)); // L: 53
		}

	} // L: 55

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1790946346"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 63
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-340818487"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language; // L: 58
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH); // L: 73
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lqj;",
		garbageValue = "-1481678220"
	)
	static SpritePixels method6088(int var0, int var1, int var2) {
		DemotingHashTable var3 = WorldMapRegion.WorldMapRegion_cachedSprites; // L: 38
		long var4 = (long)(var2 << 16 | var0 << 8 | var1); // L: 41
		return (SpritePixels)var3.get(var4); // L: 43
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Llj;",
		garbageValue = "1424526549"
	)
	public static Language method6080(int var0) {
		return var0 >= 0 && var0 < Language_valuesOrdered.length ? Language_valuesOrdered[var0] : null; // L: 67 68
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZI)V",
		garbageValue = "2081959468"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) { // L: 177
			int var6 = (var0 + var1) / 2; // L: 178
			int var7 = var0; // L: 179
			World var8 = class93.World_worlds[var6]; // L: 180
			class93.World_worlds[var6] = class93.World_worlds[var1]; // L: 181
			class93.World_worlds[var1] = var8; // L: 182

			for (int var9 = var0; var9 < var1; ++var9) { // L: 183
				World var11 = class93.World_worlds[var9]; // L: 185
				int var12 = class329.compareWorlds(var11, var8, var2, var3); // L: 187
				int var10;
				if (var12 != 0) { // L: 188
					if (var3) { // L: 189
						var10 = -var12; // L: 190
					} else {
						var10 = var12; // L: 194
					}
				} else if (var4 == -1) { // L: 198
					var10 = 0; // L: 199
				} else {
					int var13 = class329.compareWorlds(var11, var8, var4, var5); // L: 202
					if (var5) { // L: 203
						var10 = -var13;
					} else {
						var10 = var13; // L: 204
					}
				}

				if (var10 <= 0) { // L: 206
					World var14 = class93.World_worlds[var9]; // L: 207
					class93.World_worlds[var9] = class93.World_worlds[var7]; // L: 208
					class93.World_worlds[var7++] = var14; // L: 209
				}
			}

			class93.World_worlds[var1] = class93.World_worlds[var7]; // L: 213
			class93.World_worlds[var7] = var8; // L: 214
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5); // L: 215
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5); // L: 216
		}

	} // L: 218

	@ObfuscatedName("j")
	static int method6087(long var0) {
		return (int)(var0 >>> 14 & 3L); // L: 85
	}
}
