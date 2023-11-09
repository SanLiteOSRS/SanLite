import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@og
@mu
@ObfuscatedName("ot")
@Implements("Language")
public class Language implements class372 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lot;"
	)
	@Export("Language_valuesOrdered")
	public static final Language[] Language_valuesOrdered;
	@ObfuscatedName("ah")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("az")
	final String field4384;
	@ObfuscatedName("av")
	@Export("language")
	final String language;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1306254031
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4407, 0, "GB"); // L: 12
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4407, 1, "DE"); // L: 13
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4407, 2, "FR"); // L: 14
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4407, 3, "BR"); // L: 15
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4394, 4, "NL"); // L: 16
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4394, 5, "ES"); // L: 17
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4407, 6, "MX"); // L: 18
		Language[] var0 = method7003(); // L: 25
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
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lox;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4384 = var1; // L: 46
		this.language = var2; // L: 47
		this.id = var5; // L: 48
		if (var6 != null) { // L: 49
			new Locale(var2.substring(0, 2), var6); // L: 50
		} else {
			new Locale(var2.substring(0, 2)); // L: 53
		}

	} // L: 55

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1644350448"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 63
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "57"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language; // L: 58
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH); // L: 68
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[Lot;",
		garbageValue = "2127004251"
	)
	static Language[] method7003() {
		return new Language[]{Language_ES_MX, Language_EN, Language_ES, Language_PT, Language_FR, Language_DE, Language_NL}; // L: 42
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "1823199498"
	)
	public static void method6993(AbstractArchive var0) {
		class508.field5052 = var0; // L: 20
	} // L: 21

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lfm;FZB)F",
		garbageValue = "53"
	)
	static float method7006(class130 var0, float var1, boolean var2) {
		float var3 = 0.0F; // L: 221
		if (var0 != null && var0.method2999() != 0) { // L: 222
			float var4 = (float)var0.field1536[0].field1483; // L: 225
			float var5 = (float)var0.field1536[var0.method2999() - 1].field1483; // L: 226
			float var6 = var5 - var4; // L: 227
			if ((double)var6 == 0.0D) { // L: 228
				return var0.field1536[0].field1488; // L: 229
			} else {
				float var7 = 0.0F; // L: 231
				if (var1 > var5) { // L: 232
					var7 = (var1 - var5) / var6; // L: 233
				} else {
					var7 = (var1 - var4) / var6; // L: 236
				}

				double var8 = (double)((int)var7); // L: 238
				float var10 = Math.abs((float)((double)var7 - var8)); // L: 239
				float var11 = var10 * var6; // L: 240
				var8 = Math.abs(var8 + 1.0D); // L: 241
				double var12 = var8 / 2.0D; // L: 242
				double var14 = (double)((int)var12); // L: 243
				var10 = (float)(var12 - var14); // L: 244
				float var16;
				float var17;
				if (var2) { // L: 247
					if (var0.field1534 == class128.field1521) { // L: 248
						if ((double)var10 != 0.0D) { // L: 249
							var11 += var4; // L: 250
						} else {
							var11 = var5 - var11; // L: 253
						}
					} else if (var0.field1534 != class128.field1517 && var0.field1534 != class128.field1518) { // L: 256
						if (var0.field1534 == class128.field1516) { // L: 259
							var11 = var4 - var1; // L: 260
							var16 = var0.field1536[0].field1484; // L: 261
							var17 = var0.field1536[0].field1482; // L: 262
							var3 = var0.field1536[0].field1488; // L: 263
							if (0.0D != (double)var16) { // L: 264
								var3 -= var11 * var17 / var16; // L: 265
							}

							return var3; // L: 267
						}
					} else {
						var11 = var5 - var11; // L: 257
					}
				} else if (var0.field1547 == class128.field1521) { // L: 271
					if ((double)var10 != 0.0D) { // L: 272
						var11 = var5 - var11; // L: 273
					} else {
						var11 += var4; // L: 276
					}
				} else if (var0.field1547 != class128.field1517 && var0.field1547 != class128.field1518) { // L: 279
					if (var0.field1547 == class128.field1516) { // L: 282
						var11 = var1 - var5; // L: 283
						var16 = var0.field1536[var0.method2999() - 1].field1486; // L: 284
						var17 = var0.field1536[var0.method2999() - 1].field1487; // L: 285
						var3 = var0.field1536[var0.method2999() - 1].field1488; // L: 286
						if (0.0D != (double)var16) { // L: 287
							var3 += var11 * var17 / var16; // L: 288
						}

						return var3; // L: 290
					}
				} else {
					var11 += var4; // L: 280
				}

				var3 = ApproximateRouteStrategy.method1245(var0, var11); // L: 293
				float var18;
				if (var2 && var0.field1534 == class128.field1518) { // L: 295
					var18 = var0.field1536[var0.method2999() - 1].field1488 - var0.field1536[0].field1488; // L: 296
					var3 = (float)((double)var3 - (double)var18 * var8); // L: 297
				} else if (!var2 && var0.field1547 == class128.field1518) { // L: 299
					var18 = var0.field1536[var0.method2999() - 1].field1488 - var0.field1536[0].field1488; // L: 300
					var3 = (float)((double)var3 + var8 * (double)var18); // L: 301
				}

				return var3; // L: 303
			}
		} else {
			return var3; // L: 223
		}
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-18764"
	)
	static void method7004(int var0) {
		WorldMapRegion.tempMenuAction = new MenuAction(); // L: 12113
		WorldMapRegion.tempMenuAction.param0 = Client.menuArguments1[var0]; // L: 12114
		WorldMapRegion.tempMenuAction.param1 = Client.menuArguments2[var0]; // L: 12115
		WorldMapRegion.tempMenuAction.opcode = Client.menuOpcodes[var0]; // L: 12116
		WorldMapRegion.tempMenuAction.identifier = Client.menuIdentifiers[var0]; // L: 12117
		WorldMapRegion.tempMenuAction.field912 = Client.field666[var0]; // L: 12118
		WorldMapRegion.tempMenuAction.field913 = Client.menuActions[var0]; // L: 12119
		WorldMapRegion.tempMenuAction.field911 = Client.menuTargets[var0]; // L: 12120
	} // L: 12121

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "([BII)V",
		garbageValue = "-1791629405"
	)
	@Export("VorbisSample_setData")
	static void VorbisSample_setData(byte[] var0, int var1) {
		if (Client.randomDatData == null) { // L: 12819
			Client.randomDatData = new byte[24];
		}

		class410.writeRandomDat(var0, var1, Client.randomDatData, 0, 24); // L: 12820
	} // L: 12821
}
