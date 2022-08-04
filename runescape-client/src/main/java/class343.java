import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ju
@ObfuscatedName("mf")
public final class class343 {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("SequenceDefinition_archive")
	public static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "[Lql;"
	)
	@Export("modIconSprites")
	static IndexedSprite[] modIconSprites;

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(Lku;II)I",
		garbageValue = "-823191393"
	)
	static final int method6335(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) { // L: 10649
			try {
				int[] var2 = var0.cs1Instructions[var1]; // L: 10651
				int var3 = 0; // L: 10652
				int var4 = 0; // L: 10653
				byte var5 = 0; // L: 10654

				while (true) {
					int var6 = var2[var4++]; // L: 10656
					int var7 = 0; // L: 10657
					byte var8 = 0; // L: 10658
					if (var6 == 0) { // L: 10659
						return var3;
					}

					if (var6 == 1) { // L: 10660
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) { // L: 10661
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) { // L: 10662
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) { // L: 10663
						var9 = var2[var4++] << 16; // L: 10664
						var9 += var2[var4++]; // L: 10665
						var10 = FloorUnderlayDefinition.getWidget(var9); // L: 10666
						var11 = var2[var4++]; // L: 10667
						if (var11 != -1 && (!class258.ItemComposition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 10668
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 10669
								if (var11 + 1 == var10.itemIds[var12]) { // L: 10670
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) { // L: 10674
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) { // L: 10675
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) { // L: 10676
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) { // L: 10677
						var7 = class28.localPlayer.combatLevel;
					}

					if (var6 == 9) { // L: 10678
						for (var9 = 0; var9 < 25; ++var9) { // L: 10679
							if (Skills.Skills_enabled[var9]) { // L: 10680
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) { // L: 10683
						var9 = var2[var4++] << 16; // L: 10684
						var9 += var2[var4++]; // L: 10685
						var10 = FloorUnderlayDefinition.getWidget(var9); // L: 10686
						var11 = var2[var4++]; // L: 10687
						if (var11 != -1 && (!class258.ItemComposition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 10688
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 10689
								if (var11 + 1 == var10.itemIds[var12]) { // L: 10690
									var7 = 999999999; // L: 10691
									break; // L: 10692
								}
							}
						}
					}

					if (var6 == 11) { // L: 10697
						var7 = Client.runEnergy;
					}

					if (var6 == 12) { // L: 10698
						var7 = Client.weight;
					}

					if (var6 == 13) { // L: 10699
						var9 = Varps.Varps_main[var2[var4++]]; // L: 10700
						int var13 = var2[var4++]; // L: 10701
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0; // L: 10702
					}

					if (var6 == 14) { // L: 10704
						var9 = var2[var4++]; // L: 10705
						var7 = class271.getVarbit(var9); // L: 10706
					}

					if (var6 == 15) { // L: 10708
						var8 = 1;
					}

					if (var6 == 16) { // L: 10709
						var8 = 2;
					}

					if (var6 == 17) { // L: 10710
						var8 = 3;
					}

					if (var6 == 18) { // L: 10711
						var7 = class300.baseX * 64 + (class28.localPlayer.x >> 7);
					}

					if (var6 == 19) { // L: 10712
						var7 = Message.baseY * 64 + (class28.localPlayer.y >> 7);
					}

					if (var6 == 20) { // L: 10713
						var7 = var2[var4++];
					}

					if (var8 == 0) { // L: 10714
						if (var5 == 0) { // L: 10715
							var3 += var7;
						}

						if (var5 == 1) { // L: 10716
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) { // L: 10717
							var3 /= var7;
						}

						if (var5 == 3) { // L: 10718
							var3 *= var7;
						}

						var5 = 0; // L: 10719
					} else {
						var5 = var8; // L: 10721
					}
				}
			} catch (Exception var14) { // L: 10724
				return -1; // L: 10725
			}
		} else {
			return -2;
		}
	}
}
