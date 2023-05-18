import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("nc")
	@ObfuscatedGetter(
		intValue = -115281635
	)
	@Export("menuY")
	static int menuY;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -17715959
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1464399353
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Lnd;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0; // L: 9
		this.archive = var1; // L: 12
		this.groupCount = var1.getGroupCount(); // L: 13
	} // L: 14

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "46"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0; // L: 17

		for (int var1 = 0; var1 < this.groupCount; ++var1) { // L: 18
			if (!this.archive.method6646(var1) || this.archive.method6650(var1)) {
				++this.loadedCount; // L: 19
			}
		}

		return this.loadedCount >= this.groupCount; // L: 21
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(Lmq;II)I",
		garbageValue = "1696113134"
	)
	static final int method2230(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) { // L: 10613
			try {
				int[] var2 = var0.cs1Instructions[var1]; // L: 10615
				int var3 = 0; // L: 10616
				int var4 = 0; // L: 10617
				byte var5 = 0; // L: 10618

				while (true) {
					int var6 = var2[var4++]; // L: 10620
					int var7 = 0; // L: 10621
					byte var8 = 0; // L: 10622
					if (var6 == 0) { // L: 10623
						return var3;
					}

					if (var6 == 1) { // L: 10624
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) { // L: 10625
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) { // L: 10626
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) { // L: 10627
						var9 = var2[var4++] << 16; // L: 10628
						var9 += var2[var4++]; // L: 10629
						var10 = class165.getWidget(var9); // L: 10630
						var11 = var2[var4++]; // L: 10631
						if (var11 != -1 && (!HealthBarUpdate.ItemComposition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 10632
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 10633
								if (var11 + 1 == var10.itemIds[var12]) { // L: 10634
									var7 += var10.field3701[var12];
								}
							}
						}
					}

					if (var6 == 5) { // L: 10638
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) { // L: 10639
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) { // L: 10640
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) { // L: 10641
						var7 = MusicPatchNode.localPlayer.combatLevel;
					}

					if (var6 == 9) { // L: 10642
						for (var9 = 0; var9 < 25; ++var9) { // L: 10643
							if (Skills.Skills_enabled[var9]) { // L: 10644
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) { // L: 10647
						var9 = var2[var4++] << 16; // L: 10648
						var9 += var2[var4++]; // L: 10649
						var10 = class165.getWidget(var9); // L: 10650
						var11 = var2[var4++]; // L: 10651
						if (var11 != -1 && (!HealthBarUpdate.ItemComposition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 10652
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 10653
								if (var11 + 1 == var10.itemIds[var12]) { // L: 10654
									var7 = 999999999; // L: 10655
									break; // L: 10656
								}
							}
						}
					}

					if (var6 == 11) { // L: 10661
						var7 = Client.field624;
					}

					if (var6 == 12) { // L: 10662
						var7 = Client.weight;
					}

					if (var6 == 13) { // L: 10663
						var9 = Varps.Varps_main[var2[var4++]]; // L: 10664
						int var13 = var2[var4++]; // L: 10665
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0; // L: 10666
					}

					if (var6 == 14) { // L: 10668
						var9 = var2[var4++]; // L: 10669
						var7 = class252.getVarbit(var9); // L: 10670
					}

					if (var6 == 15) { // L: 10672
						var8 = 1;
					}

					if (var6 == 16) { // L: 10673
						var8 = 2;
					}

					if (var6 == 17) { // L: 10674
						var8 = 3;
					}

					if (var6 == 18) { // L: 10675
						var7 = WorldMapData_0.baseX * 64 + (MusicPatchNode.localPlayer.x >> 7);
					}

					if (var6 == 19) { // L: 10676
						var7 = GameObject.baseY * 64 + (MusicPatchNode.localPlayer.y >> 7);
					}

					if (var6 == 20) { // L: 10677
						var7 = var2[var4++];
					}

					if (var8 == 0) { // L: 10678
						if (var5 == 0) { // L: 10679
							var3 += var7;
						}

						if (var5 == 1) { // L: 10680
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) { // L: 10681
							var3 /= var7;
						}

						if (var5 == 3) { // L: 10682
							var3 *= var7;
						}

						var5 = 0; // L: 10683
					} else {
						var5 = var8; // L: 10685
					}
				}
			} catch (Exception var14) { // L: 10688
				return -1; // L: 10689
			}
		} else {
			return -2;
		}
	}
}
