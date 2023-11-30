import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@oe
@ma
@ObfuscatedName("of")
@Implements("Language")
public class Language implements class383 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("Language_valuesOrdered")
	static final Language[] Language_valuesOrdered;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -126881359
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	static Archive field4412;
	@ObfuscatedName("gr")
	@ObfuscatedGetter(
		intValue = -656646349
	)
	static int field4410;
	@ObfuscatedName("ac")
	final String field4407;
	@ObfuscatedName("al")
	@Export("language")
	final String language;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 680948119
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4417, 0, "GB"); // L: 12
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4417, 1, "DE"); // L: 13
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4417, 2, "FR"); // L: 14
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4417, 3, "BR"); // L: 15
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4416, 4, "NL"); // L: 16
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4416, 5, "ES"); // L: 17
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4417, 6, "MX"); // L: 18
		Language[] var0 = method7189();
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
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lok;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4407 = var1; // L: 46
		this.language = var2; // L: 47
		this.id = var5; // L: 48
		if (var6 != null) { // L: 49
			new Locale(var2.substring(0, 2), var6); // L: 50
		} else {
			new Locale(var2.substring(0, 2)); // L: 53
		}

	} // L: 55

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 63
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1714564751"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language; // L: 58
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH); // L: 73
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfa;",
		garbageValue = "-1038072000"
	)
	static class132[] method7187() {
		return new class132[]{class132.field1549, class132.field1550, class132.field1551, class132.field1552, class132.field1557, class132.field1554}; // L: 25
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)[Lof;",
		garbageValue = "0"
	)
	static Language[] method7189() {
		return new Language[]{Language_PT, Language_ES_MX, Language_FR, Language_EN, Language_NL, Language_DE, Language_ES}; // L: 42
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lfm;FFFFFFFFB)V",
		garbageValue = "1"
	)
	static void method7200(class131 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
		if (var0 != null) { // L: 259
			float var9 = var4 - var1; // L: 262
			if ((double)var9 != 0.0D) { // L: 263
				float var10 = var2 - var1; // L: 266
				float var11 = var3 - var1; // L: 267
				float[] var12 = new float[]{var10 / var9, var11 / var9}; // L: 268 269 270
				var0.field1531 = var12[0] == 0.33333334F && 0.6666667F == var12[1]; // L: 271
				float var13 = var12[0]; // L: 272
				float var14 = var12[1]; // L: 273
				if ((double)var12[0] < 0.0D) { // L: 274
					var12[0] = 0.0F;
				}

				if ((double)var12[1] > 1.0D) { // L: 275
					var12[1] = 1.0F;
				}

				if ((double)var12[0] > 1.0D || var12[1] < -1.0F) { // L: 276
					var12[1] = 1.0F - var12[1]; // L: 278
					if (var12[0] < 0.0F) { // L: 279
						var12[0] = 0.0F;
					}

					if (var12[1] < 0.0F) { // L: 280
						var12[1] = 0.0F;
					}

					if (var12[0] > 1.0F || var12[1] > 1.0F) { // L: 281
						float var15 = (float)(1.0D + ((double)var12[1] - 2.0D) * (double)var12[1] + (double)(var12[0] * (var12[1] + (var12[0] - 2.0F)))); // L: 282
						if (var15 + class127.field1484 > 0.0F) { // L: 283
							if (class127.field1484 + var12[0] < 1.3333334F) { // L: 285
								float var16 = var12[0] - 2.0F; // L: 286
								float var17 = var12[0] - 1.0F; // L: 287
								float var18 = (float)Math.sqrt((double)(var16 * var16 - var17 * var17 * 4.0F)); // L: 288
								float var19 = (-var16 + var18) * 0.5F; // L: 289
								if (var12[1] + class127.field1484 > var19) { // L: 290
									var12[1] = var19 - class127.field1484; // L: 291
								} else {
									var19 = 0.5F * (-var16 - var18); // L: 294
									if (var12[1] < class127.field1484 + var19) { // L: 295
										var12[1] = class127.field1484 + var19; // L: 296
									}
								}
							} else {
								var12[0] = 1.3333334F - class127.field1484; // L: 301
								var12[1] = 0.33333334F - class127.field1484; // L: 302
							}
						}
					}

					var12[1] = 1.0F - var12[1]; // L: 307
				}

				if (var12[0] != var13) { // L: 310
					var2 = var12[0] * var9 + var1; // L: 311
					if (0.0D != (double)var13) { // L: 312
						var6 = var5 + var12[0] * (var6 - var5) / var13; // L: 313
					}
				}

				if (var12[1] != var14) { // L: 316
					float var10000 = var1 + var12[1] * var9; // L: 317
					if ((double)var14 != 1.0D) { // L: 318
						var7 = (float)((double)var8 - (1.0D - (double)var12[1]) * (double)(var8 - var7) / (1.0D - (double)var14)); // L: 319
					}
				}

				var0.field1538 = var1; // L: 322
				var0.field1533 = var4; // L: 323
				class145.method3246(0.0F, var12[0], var12[1], 1.0F, var0); // L: 324
				Canvas.method334(var5, var6, var7, var8, var0); // L: 325
			}
		}
	} // L: 260 264 326

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)Lof;",
		garbageValue = "15"
	)
	public static Language method7190(int var0) {
		return var0 >= 0 && var0 < Language_valuesOrdered.length ? Language_valuesOrdered[var0] : null; // L: 67 68
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lcr;",
		garbageValue = "458832274"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0; // L: 248
		return WorldMapData_0.getNextWorldListWorld(); // L: 249
	}
}
