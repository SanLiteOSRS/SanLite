import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ol
@mn
@ObfuscatedName("oj")
@Implements("Language")
public class Language implements class369 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Loj;"
	)
	@Export("Language_valuesOrdered")
	public static final Language[] Language_valuesOrdered;
	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	static Archive field4347;
	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("archive17")
	static Archive archive17;
	@ObfuscatedName("ak")
	final String field4346;
	@ObfuscatedName("ae")
	@Export("language")
	final String language;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -72393847
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4356, 0, "GB"); // L: 12
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4356, 1, "DE"); // L: 13
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4356, 2, "FR"); // L: 14
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4356, 3, "BR"); // L: 15
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4372, 4, "NL"); // L: 16
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4372, 5, "ES"); // L: 17
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4356, 6, "MX"); // L: 18
		Language[] var0 = new Language[]{Language_ES, Language_DE, Language_FR, Language_ES_MX, Language_NL, Language_PT, Language_EN}; // L: 27
		Language_valuesOrdered = new Language[var0.length];
		Language[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Language var4 = var2[var3];
			if (Language_valuesOrdered[var4.id] != null) { // L: 36
				throw new IllegalStateException();
			}

			Language_valuesOrdered[var4.id] = var4;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Loo;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4346 = var1; // L: 46
		this.language = var2;
		this.id = var5; // L: 48
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2)); // L: 53
		}

	} // L: 55

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 63
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-333567172"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language;
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH); // L: 68
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Ljava/lang/String;",
		garbageValue = "55"
	)
	public static String method6915(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2]; // L: 30
		int var4 = 0; // L: 31
		int var5 = var1; // L: 32

		int var8;
		for (int var6 = var2 + var1; var5 < var6; var3[var4++] = (char)var8) { // L: 33 34 65
			int var7 = var0[var5++] & 255; // L: 35
			if (var7 < 128) { // L: 37
				if (var7 == 0) { // L: 38
					var8 = 65533;
				} else {
					var8 = var7; // L: 39
				}
			} else if (var7 < 192) { // L: 41
				var8 = 65533;
			} else if (var7 < 224) { // L: 42
				if (var5 < var6 && (var0[var5] & 192) == 128) { // L: 43
					var8 = (var7 & 31) << 6 | var0[var5++] & 63; // L: 44
					if (var8 < 128) { // L: 45
						var8 = 65533;
					}
				} else {
					var8 = 65533; // L: 47
				}
			} else if (var7 < 240) { // L: 49
				if (var5 + 1 < var6 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128) { // L: 50
					var8 = (var7 & 15) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63; // L: 51
					if (var8 < 2048) { // L: 52
						var8 = 65533;
					}
				} else {
					var8 = 65533; // L: 54
				}
			} else if (var7 < 248) { // L: 56
				if (var5 + 2 < var6 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128 && (var0[var5 + 2] & 192) == 128) { // L: 57
					var8 = (var7 & 7) << 18 | (var0[var5++] & 63) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63; // L: 58
					if (var8 >= 65536 && var8 <= 1114111) { // L: 59
						var8 = 65533; // L: 60
					} else {
						var8 = 65533;
					}
				} else {
					var8 = 65533; // L: 62
				}
			} else {
				var8 = 65533; // L: 64
			}
		}

		return new String(var3, 0, var4); // L: 67
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(Lde;IIIB)V",
		garbageValue = "-21"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3) {
		NPCComposition var4 = var0.definition; // L: 10346
		if (Client.menuOptionsCount < 400) { // L: 10347
			if (var4.transforms != null) { // L: 10348
				var4 = var4.transform();
			}

			if (var4 != null) { // L: 10349
				if (var4.isInteractable) { // L: 10350
					if (!var4.isFollower || Client.followerIndex == var1) { // L: 10351
						String var5 = var0.method2558(); // L: 10352
						int var6;
						int var9;
						if (var4.combatLevel != 0 && var0.field1227 != 0) { // L: 10353
							var6 = var0.field1227 != -1 ? var0.field1227 : var4.combatLevel; // L: 10354
							var9 = Projectile.localPlayer.combatLevel; // L: 10357
							int var10 = var9 - var6; // L: 10359
							String var8;
							if (var10 < -9) { // L: 10360
								var8 = class349.colorStartTag(16711680); // L: 10361
							} else if (var10 < -6) { // L: 10364
								var8 = class349.colorStartTag(16723968); // L: 10365
							} else if (var10 < -3) { // L: 10368
								var8 = class349.colorStartTag(16740352); // L: 10369
							} else if (var10 < 0) { // L: 10372
								var8 = class349.colorStartTag(16756736); // L: 10373
							} else if (var10 > 9) { // L: 10376
								var8 = class349.colorStartTag(65280); // L: 10377
							} else if (var10 > 6) { // L: 10380
								var8 = class349.colorStartTag(4259584); // L: 10381
							} else if (var10 > 3) { // L: 10384
								var8 = class349.colorStartTag(8453888); // L: 10385
							} else if (var10 > 0) { // L: 10388
								var8 = class349.colorStartTag(12648192); // L: 10389
							} else {
								var8 = class349.colorStartTag(16776960); // L: 10392
							}

							var5 = var5 + var8 + " " + " (" + "level-" + var6 + ")"; // L: 10394
						}

						if (var4.isFollower && Client.followerOpsLowPriority) { // L: 10396
							class138.insertMenuItemNoShift("Examine", class349.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 10397
						}

						if (Client.isItemSelected == 1) { // L: 10400
							class138.insertMenuItemNoShift("Use", Client.field667 + " " + "->" + " " + class349.colorStartTag(16776960) + var5, 7, var1, var2, var3); // L: 10401
						} else if (Client.isSpellSelected) { // L: 10404
							if ((class125.selectedSpellFlags & 2) == 2) { // L: 10405
								class138.insertMenuItemNoShift(Client.field671, Client.field716 + " " + "->" + " " + class349.colorStartTag(16776960) + var5, 8, var1, var2, var3); // L: 10406
							}
						} else {
							var6 = var4.isFollower && Client.followerOpsLowPriority ? 2000 : 0; // L: 10411
							String[] var7 = var4.actions; // L: 10412
							int var11;
							if (var7 != null) { // L: 10413
								for (var11 = 4; var11 >= 0; --var11) { // L: 10414
									if (var0.method2577(var11) && var7[var11] != null && !var7[var11].equalsIgnoreCase("Attack")) { // L: 10415 10416
										var9 = 0; // L: 10417
										if (var11 == 0) { // L: 10418
											var9 = var6 + 9;
										}

										if (var11 == 1) { // L: 10419
											var9 = var6 + 10;
										}

										if (var11 == 2) { // L: 10420
											var9 = var6 + 11;
										}

										if (var11 == 3) { // L: 10421
											var9 = var6 + 12;
										}

										if (var11 == 4) { // L: 10422
											var9 = var6 + 13;
										}

										class138.insertMenuItemNoShift(var7[var11], class349.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 10423
									}
								}
							}

							if (var7 != null) { // L: 10428
								for (var11 = 4; var11 >= 0; --var11) { // L: 10429
									if (var0.method2577(var11) && var7[var11] != null && var7[var11].equalsIgnoreCase("Attack")) { // L: 10430 10431
										short var12 = 0; // L: 10432
										if (Client.npcAttackOption != AttackOption.AttackOption_hidden) { // L: 10433
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.npcAttackOption && var4.combatLevel > Projectile.localPlayer.combatLevel) { // L: 10434
												var12 = 2000; // L: 10435
											}

											var9 = 0; // L: 10437
											if (var11 == 0) { // L: 10438
												var9 = var12 + 9;
											}

											if (var11 == 1) { // L: 10439
												var9 = var12 + 10;
											}

											if (var11 == 2) { // L: 10440
												var9 = var12 + 11;
											}

											if (var11 == 3) { // L: 10441
												var9 = var12 + 12;
											}

											if (var11 == 4) { // L: 10442
												var9 = var12 + 13;
											}

											class138.insertMenuItemNoShift(var7[var11], class349.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 10443
										}
									}
								}
							}

							if (!var4.isFollower || !Client.followerOpsLowPriority) { // L: 10448
								class138.insertMenuItemNoShift("Examine", class349.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 10449
							}
						}

					}
				}
			}
		}
	} // L: 10453
}
