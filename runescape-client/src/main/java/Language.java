import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ms
@kx
@ObfuscatedName("mn")
@Implements("Language")
public class Language implements class349 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lmn;"
	)
	@Export("Language_valuesOrdered")
	public static final Language[] Language_valuesOrdered;
	@ObfuscatedName("n")
	final String field4314;
	@ObfuscatedName("l")
	@Export("language")
	final String language;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 974377725
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4334, 0, "GB"); // L: 12
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4334, 1, "DE"); // L: 13
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4334, 2, "FR"); // L: 14
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4334, 3, "BR"); // L: 15
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4328, 4, "NL"); // L: 16
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4328, 5, "ES"); // L: 17
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4334, 6, "MX"); // L: 18
		Language[] var0 = new Language[]{Language_ES, Language_DE, Language_EN, Language_ES_MX, Language_FR, Language_PT, Language_NL}; // L: 27
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
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmm;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4314 = var1; // L: 46
		this.language = var2; // L: 47
		this.id = var5; // L: 48
		if (var6 != null) { // L: 49
			new Locale(var2.substring(0, 2), var6); // L: 50
		} else {
			new Locale(var2.substring(0, 2)); // L: 53
		}

	} // L: 55

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 63
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "275896102"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language; // L: 58
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH); // L: 68
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lrd;II)V",
		garbageValue = "-2115703573"
	)
	public static void method6776(Buffer var0, int var1) {
		if (JagexCache.JagexCache_randomDat != null) { // L: 85
			try {
				JagexCache.JagexCache_randomDat.seek(0L); // L: 87
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24); // L: 88
			} catch (Exception var3) { // L: 90
			}
		}

	} // L: 92

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1124742409"
	)
	static boolean method6781() {
		Date var0;
		try {
			var0 = class376.method7323(); // L: 949
		} catch (ParseException var4) { // L: 951
			HealthBarUpdate.method2442("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 952
			return false; // L: 953
		}

		if (var0 == null) { // L: 955
			return false; // L: 956
		} else {
			boolean var3 = class86.method2341(var0); // L: 958
			boolean var2 = ArchiveDiskAction.method6455(var0); // L: 959
			if (!var2) { // L: 960
				HealthBarUpdate.method2442("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 961
				return false; // L: 962
			} else {
				if (!var3) { // L: 964
					MusicPatchNode2.field3356 = 8388607; // L: 965
				} else {
					MusicPatchNode2.field3356 = (int)(var0.getTime() / 86400000L - 11745L); // L: 968
				}

				return true; // L: 970
			}
		}
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-319090450"
	)
	static final void method6782() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 8286 8287 8293
			if (var0.hitpoints == -1) { // L: 8288
				var0.delay = 0; // L: 8289
				class204.method4131(var0); // L: 8290
			} else {
				var0.remove(); // L: 8292
			}
		}

	} // L: 8295

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1722162852"
	)
	static final void method6779(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) { // L: 9265
			if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) { // L: 9266
				Client.field725[var4] = true;
			}
		}

	} // L: 9268

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(Lkz;II)I",
		garbageValue = "-1163445958"
	)
	static final int method6780(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) { // L: 11575
			try {
				int[] var2 = var0.cs1Instructions[var1]; // L: 11577
				int var3 = 0; // L: 11578
				int var4 = 0; // L: 11579
				byte var5 = 0; // L: 11580

				while (true) {
					int var6 = var2[var4++]; // L: 11582
					int var7 = 0; // L: 11583
					byte var8 = 0; // L: 11584
					if (var6 == 0) { // L: 11585
						return var3;
					}

					if (var6 == 1) { // L: 11586
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) { // L: 11587
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) { // L: 11588
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) { // L: 11589
						var9 = var2[var4++] << 16; // L: 11590
						var9 += var2[var4++]; // L: 11591
						var10 = class133.getWidget(var9); // L: 11592
						var11 = var2[var4++]; // L: 11593
						if (var11 != -1 && (!TileItem.ItemComposition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 11594
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 11595
								if (var11 + 1 == var10.itemIds[var12]) { // L: 11596
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) { // L: 11600
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) { // L: 11601
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) { // L: 11602
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) { // L: 11603
						var7 = class387.localPlayer.combatLevel;
					}

					if (var6 == 9) { // L: 11604
						for (var9 = 0; var9 < 25; ++var9) { // L: 11605
							if (Skills.Skills_enabled[var9]) { // L: 11606
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) { // L: 11609
						var9 = var2[var4++] << 16; // L: 11610
						var9 += var2[var4++]; // L: 11611
						var10 = class133.getWidget(var9); // L: 11612
						var11 = var2[var4++]; // L: 11613
						if (var11 != -1 && (!TileItem.ItemComposition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 11614
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 11615
								if (var11 + 1 == var10.itemIds[var12]) { // L: 11616
									var7 = 999999999; // L: 11617
									break; // L: 11618
								}
							}
						}
					}

					if (var6 == 11) { // L: 11623
						var7 = Client.field496;
					}

					if (var6 == 12) { // L: 11624
						var7 = Client.weight;
					}

					if (var6 == 13) { // L: 11625
						var9 = Varps.Varps_main[var2[var4++]]; // L: 11626
						int var13 = var2[var4++]; // L: 11627
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0; // L: 11628
					}

					if (var6 == 14) { // L: 11630
						var9 = var2[var4++]; // L: 11631
						var7 = SecureRandomFuture.getVarbit(var9); // L: 11632
					}

					if (var6 == 15) { // L: 11634
						var8 = 1;
					}

					if (var6 == 16) { // L: 11635
						var8 = 2;
					}

					if (var6 == 17) { // L: 11636
						var8 = 3;
					}

					if (var6 == 18) { // L: 11637
						var7 = ParamComposition.baseX * 64 + (class387.localPlayer.x >> 7);
					}

					if (var6 == 19) { // L: 11638
						var7 = Client.baseY * 64 + (class387.localPlayer.y >> 7);
					}

					if (var6 == 20) { // L: 11639
						var7 = var2[var4++];
					}

					if (var8 == 0) { // L: 11640
						if (var5 == 0) { // L: 11641
							var3 += var7;
						}

						if (var5 == 1) { // L: 11642
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) { // L: 11643
							var3 /= var7;
						}

						if (var5 == 3) { // L: 11644
							var3 *= var7;
						}

						var5 = 0; // L: 11645
					} else {
						var5 = var8; // L: 11647
					}
				}
			} catch (Exception var14) { // L: 11650
				return -1; // L: 11651
			}
		} else {
			return -2;
		}
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-97"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop; // L: 11889
	}
}
