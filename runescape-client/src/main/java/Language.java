import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@nx
@lw
@ObfuscatedName("nq")
@Implements("Language")
public class Language implements class352 {
	@ObfuscatedName("wx")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	public static class350 field4294;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Lnq;"
	)
	@Export("Language_valuesOrdered")
	public static final Language[] Language_valuesOrdered;
	@ObfuscatedName("ax")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("aq")
	final String field4286;
	@ObfuscatedName("ap")
	@Export("language")
	final String language;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -506926155
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4306, 0, "GB"); // L: 12
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4306, 1, "DE"); // L: 13
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4306, 2, "FR"); // L: 14
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4306, 3, "BR"); // L: 15
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4313, 4, "NL"); // L: 16
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4313, 5, "ES"); // L: 17
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4306, 6, "MX"); // L: 18
		Language[] var0 = method6655(); // L: 25
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
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnm;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4286 = var1; // L: 46
		this.language = var2; // L: 47
		this.id = var5; // L: 48
		if (var6 != null) { // L: 49
			new Locale(var2.substring(0, 2), var6); // L: 50
		} else {
			new Locale(var2.substring(0, 2)); // L: 53
		}

	} // L: 55

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1409646049"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 63
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "835968120"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language; // L: 58
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH); // L: 68
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[Lnq;",
		garbageValue = "1775890171"
	)
	static Language[] method6655() {
		return new Language[]{Language_EN, Language_ES_MX, Language_PT, Language_NL, Language_DE, Language_ES, Language_FR}; // L: 42
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1699075309"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.playingJingle) { // L: 3692
			class258.method5232(); // L: 3693
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && WorldMapSectionType.clientPreferences.method2440() != 0 && !Client.playingJingle) { // L: 3695
			NPC.method2588(2, class308.archive6, var0, 0, WorldMapSectionType.clientPreferences.method2440(), false); // L: 3696
		}

		Client.currentTrackGroupId = var0; // L: 3698
	} // L: 3699

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(Ldh;IIB)V",
		garbageValue = "101"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) { // L: 4292
			int var3 = Coord.SequenceDefinition_get(var1).field2276; // L: 4293
			if (var3 == 1) { // L: 4294
				var0.sequenceFrame = 0; // L: 4295
				var0.sequenceFrameCycle = 0; // L: 4296
				var0.sequenceDelay = var2; // L: 4297
				var0.field1186 = 0; // L: 4298
			}

			if (var3 == 2) { // L: 4300
				var0.field1186 = 0; // L: 4301
			}
		} else if (var1 == -1 || var0.sequence == -1 || Coord.SequenceDefinition_get(var1).field2269 >= Coord.SequenceDefinition_get(var0.sequence).field2269) { // L: 4304
			var0.sequence = var1; // L: 4305
			var0.sequenceFrame = 0; // L: 4306
			var0.sequenceFrameCycle = 0; // L: 4307
			var0.sequenceDelay = var2; // L: 4308
			var0.field1186 = 0; // L: 4309
			var0.field1215 = var0.pathLength; // L: 4310
		}

	} // L: 4312

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-721081490"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) { // L: 4750
			var2 = 1;
		}

		if (var3 < 1) { // L: 4751
			var3 = 1;
		}

		int var5 = var3 - 334; // L: 4752
		int var6;
		if (var5 < 0) { // L: 4754
			var6 = Client.field544;
		} else if (var5 >= 100) { // L: 4755
			var6 = Client.field744;
		} else {
			var6 = (Client.field744 - Client.field544) * var5 / 100 + Client.field544; // L: 4756
		}

		int var7 = var3 * var6 * 512 / (var2 * 334); // L: 4757
		int var8;
		int var9;
		short var10;
		if (var7 < Client.field749) { // L: 4758
			var10 = Client.field749; // L: 4759
			var6 = var10 * var2 * 334 / (var3 * 512); // L: 4760
			if (var6 > Client.field748) { // L: 4761
				var6 = Client.field748; // L: 4762
				var8 = var3 * var6 * 512 / (var10 * 334); // L: 4763
				var9 = (var2 - var8) / 2; // L: 4764
				if (var4) { // L: 4765
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4766
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216); // L: 4767
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216); // L: 4768
				}

				var0 += var9; // L: 4770
				var2 -= var9 * 2; // L: 4771
			}
		} else if (var7 > Client.field750) { // L: 4774
			var10 = Client.field750; // L: 4775
			var6 = var10 * var2 * 334 / (var3 * 512); // L: 4776
			if (var6 < Client.field747) { // L: 4777
				var6 = Client.field747; // L: 4778
				var8 = var10 * var2 * 334 / (var6 * 512); // L: 4779
				var9 = (var3 - var8) / 2; // L: 4780
				if (var4) { // L: 4781
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4782
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216); // L: 4783
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216); // L: 4784
				}

				var1 += var9; // L: 4786
				var3 -= var9 * 2; // L: 4787
			}
		}

		Client.viewportZoom = var3 * var6 / 334; // L: 4790
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) { // L: 4791
			KeyHandler.method428(var2, var3); // L: 4792
		}

		Client.viewportOffsetX = var0; // L: 4794
		Client.viewportOffsetY = var1; // L: 4795
		Client.viewportWidth = var2; // L: 4796
		Client.viewportHeight = var3; // L: 4797
	} // L: 4798

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(Lmy;II)I",
		garbageValue = "-227067391"
	)
	static final int method6661(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) { // L: 10679
			try {
				int[] var2 = var0.cs1Instructions[var1]; // L: 10681
				int var3 = 0; // L: 10682
				int var4 = 0; // L: 10683
				byte var5 = 0; // L: 10684

				while (true) {
					int var6 = var2[var4++]; // L: 10686
					int var7 = 0; // L: 10687
					byte var8 = 0; // L: 10688
					if (var6 == 0) { // L: 10689
						return var3;
					}

					if (var6 == 1) { // L: 10690
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) { // L: 10691
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) { // L: 10692
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) { // L: 10693
						var9 = var2[var4++] << 16; // L: 10694
						var9 += var2[var4++]; // L: 10695
						var10 = WorldMapSection1.getWidget(var9); // L: 10696
						var11 = var2[var4++]; // L: 10697
						if (var11 != -1 && (!ParamComposition.ItemComposition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 10698
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 10699
								if (var11 + 1 == var10.itemIds[var12]) { // L: 10700
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) { // L: 10704
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) { // L: 10705
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) { // L: 10706
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) { // L: 10707
						var7 = BuddyRankComparator.localPlayer.combatLevel;
					}

					if (var6 == 9) { // L: 10708
						for (var9 = 0; var9 < 25; ++var9) { // L: 10709
							if (Skills.Skills_enabled[var9]) { // L: 10710
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) { // L: 10713
						var9 = var2[var4++] << 16; // L: 10714
						var9 += var2[var4++]; // L: 10715
						var10 = WorldMapSection1.getWidget(var9); // L: 10716
						var11 = var2[var4++]; // L: 10717
						if (var11 != -1 && (!ParamComposition.ItemComposition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 10718
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 10719
								if (var11 + 1 == var10.itemIds[var12]) { // L: 10720
									var7 = 999999999; // L: 10721
									break; // L: 10722
								}
							}
						}
					}

					if (var6 == 11) { // L: 10727
						var7 = Client.field652;
					}

					if (var6 == 12) { // L: 10728
						var7 = Client.weight;
					}

					if (var6 == 13) { // L: 10729
						var9 = Varps.Varps_main[var2[var4++]]; // L: 10730
						int var13 = var2[var4++]; // L: 10731
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0; // L: 10732
					}

					if (var6 == 14) { // L: 10734
						var9 = var2[var4++]; // L: 10735
						var7 = class17.getVarbit(var9); // L: 10736
					}

					if (var6 == 15) { // L: 10738
						var8 = 1;
					}

					if (var6 == 16) { // L: 10739
						var8 = 2;
					}

					if (var6 == 17) { // L: 10740
						var8 = 3;
					}

					if (var6 == 18) { // L: 10741
						var7 = GameEngine.baseX * 64 + (BuddyRankComparator.localPlayer.x >> 7);
					}

					if (var6 == 19) { // L: 10742
						var7 = class178.baseY * 64 + (BuddyRankComparator.localPlayer.y >> 7);
					}

					if (var6 == 20) { // L: 10743
						var7 = var2[var4++];
					}

					if (var8 == 0) { // L: 10744
						if (var5 == 0) { // L: 10745
							var3 += var7;
						}

						if (var5 == 1) { // L: 10746
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) { // L: 10747
							var3 /= var7;
						}

						if (var5 == 3) { // L: 10748
							var3 *= var7;
						}

						var5 = 0; // L: 10749
					} else {
						var5 = var8; // L: 10751
					}
				}
			} catch (Exception var14) { // L: 10754
				return -1; // L: 10755
			}
		} else {
			return -2;
		}
	}
}
