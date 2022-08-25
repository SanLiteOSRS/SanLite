import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
@Implements("GrandExchangeEvents")
public class GrandExchangeEvents {
	@ObfuscatedName("h")
	@Export("GrandExchangeEvents_ageComparator")
	public static Comparator GrandExchangeEvents_ageComparator;
	@ObfuscatedName("w")
	@Export("GrandExchangeEvents_priceComparator")
	public static Comparator GrandExchangeEvents_priceComparator;
	@ObfuscatedName("v")
	@Export("GrandExchangeEvents_nameComparator")
	public static Comparator GrandExchangeEvents_nameComparator;
	@ObfuscatedName("c")
	@Export("GrandExchangeEvents_quantityComparator")
	public static Comparator GrandExchangeEvents_quantityComparator;
	@ObfuscatedName("a")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Lcl;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;
	@ObfuscatedName("s")
	@Export("events")
	public final List events;

	static {
		GrandExchangeEvents_ageComparator = new GrandExchangeOfferAgeComparator(); // L: 11
		new GrandExchangeOfferWorldComparator();
		GrandExchangeEvents_priceComparator = new GrandExchangeOfferUnitPriceComparator(); // L: 41
		GrandExchangeEvents_nameComparator = new GrandExchangeOfferNameComparator(); // L: 54
		GrandExchangeEvents_quantityComparator = new GrandExchangeOfferTotalQuantityComparator();
	} // L: 67

	@ObfuscatedSignature(
		descriptor = "(Lqr;Z)V",
		garbageValue = "1"
	)
	public GrandExchangeEvents(Buffer var1, boolean var2) {
		int var3 = var1.readUnsignedShort(); // L: 82
		boolean var4 = var1.readUnsignedByte() == 1; // L: 83
		byte var5;
		if (var4) { // L: 85
			var5 = 1;
		} else {
			var5 = 0; // L: 86
		}

		int var6 = var1.readUnsignedShort(); // L: 87
		this.events = new ArrayList(var6); // L: 88

		for (int var7 = 0; var7 < var6; ++var7) { // L: 89
			this.events.add(new GrandExchangeEvent(var1, var5, var3)); // L: 90
		}

	} // L: 92

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;ZI)V",
		garbageValue = "-189002153"
	)
	@Export("sort")
	public void sort(Comparator var1, boolean var2) {
		if (var2) { // L: 95
			Collections.sort(this.events, var1); // L: 96
		} else {
			Collections.sort(this.events, Collections.reverseOrder(var1)); // L: 99
		}

	} // L: 101

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(Lkn;II)I",
		garbageValue = "-2032315248"
	)
	static final int method5876(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) { // L: 10490
			try {
				int[] var2 = var0.cs1Instructions[var1]; // L: 10492
				int var3 = 0; // L: 10493
				int var4 = 0; // L: 10494
				byte var5 = 0; // L: 10495

				while (true) {
					int var6 = var2[var4++]; // L: 10497
					int var7 = 0; // L: 10498
					byte var8 = 0; // L: 10499
					if (var6 == 0) { // L: 10500
						return var3;
					}

					if (var6 == 1) { // L: 10501
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) { // L: 10502
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) { // L: 10503
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) { // L: 10504
						var9 = var2[var4++] << 16; // L: 10505
						var9 += var2[var4++]; // L: 10506
						var10 = HitSplatDefinition.getWidget(var9); // L: 10507
						var11 = var2[var4++]; // L: 10508
						if (var11 != -1 && (!AttackOption.ItemComposition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 10509
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 10510
								if (var11 + 1 == var10.itemIds[var12]) { // L: 10511
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) { // L: 10515
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) { // L: 10516
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) { // L: 10517
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) { // L: 10518
						var7 = ScriptFrame.localPlayer.combatLevel;
					}

					if (var6 == 9) { // L: 10519
						for (var9 = 0; var9 < 25; ++var9) { // L: 10520
							if (Skills.Skills_enabled[var9]) { // L: 10521
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) { // L: 10524
						var9 = var2[var4++] << 16; // L: 10525
						var9 += var2[var4++]; // L: 10526
						var10 = HitSplatDefinition.getWidget(var9); // L: 10527
						var11 = var2[var4++]; // L: 10528
						if (var11 != -1 && (!AttackOption.ItemComposition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 10529
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 10530
								if (var11 + 1 == var10.itemIds[var12]) { // L: 10531
									var7 = 999999999; // L: 10532
									break; // L: 10533
								}
							}
						}
					}

					if (var6 == 11) { // L: 10538
						var7 = Client.runEnergy;
					}

					if (var6 == 12) { // L: 10539
						var7 = Client.weight;
					}

					if (var6 == 13) { // L: 10540
						var9 = Varps.Varps_main[var2[var4++]]; // L: 10541
						int var13 = var2[var4++]; // L: 10542
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0; // L: 10543
					}

					if (var6 == 14) { // L: 10545
						var9 = var2[var4++]; // L: 10546
						var7 = class133.getVarbit(var9); // L: 10547
					}

					if (var6 == 15) { // L: 10549
						var8 = 1;
					}

					if (var6 == 16) { // L: 10550
						var8 = 2;
					}

					if (var6 == 17) { // L: 10551
						var8 = 3;
					}

					if (var6 == 18) { // L: 10552
						var7 = Decimator.baseX * 64 + (ScriptFrame.localPlayer.x >> 7);
					}

					if (var6 == 19) { // L: 10553
						var7 = class7.baseY * 64 + (ScriptFrame.localPlayer.y >> 7);
					}

					if (var6 == 20) { // L: 10554
						var7 = var2[var4++];
					}

					if (var8 == 0) { // L: 10555
						if (var5 == 0) { // L: 10556
							var3 += var7;
						}

						if (var5 == 1) { // L: 10557
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) { // L: 10558
							var3 /= var7;
						}

						if (var5 == 3) { // L: 10559
							var3 *= var7;
						}

						var5 = 0; // L: 10560
					} else {
						var5 = var8; // L: 10562
					}
				}
			} catch (Exception var14) { // L: 10565
				return -1; // L: 10566
			}
		} else {
			return -2;
		}
	}
}
