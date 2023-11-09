import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
	@ObfuscatedName("ww")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	public static class370 field1455;
	@ObfuscatedName("aw")
	@Export("reversed")
	final boolean reversed;

	public UserComparator7(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lqa;Lqa;B)I",
		garbageValue = "92"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) { // L: 14
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Lnd;B)V",
		garbageValue = "7"
	)
	public static void method2873(AbstractArchive var0, AbstractArchive var1) {
		World.KitDefinition_archive = var0; // L: 29
		KitDefinition.KitDefinition_modelsArchive = var1; // L: 30
		KitDefinition.field1939 = World.KitDefinition_archive.getGroupFileCount(3); // L: 31
	} // L: 32

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1065913503"
	)
	static final void method2869(int var0, int var1, int var2, int var3) {
		Client.field531 = 0; // L: 5591
		boolean var4 = false; // L: 5592
		int var5 = -1; // L: 5593
		int var6 = -1; // L: 5594
		int var7 = Players.Players_count; // L: 5595
		int[] var8 = Players.Players_indices; // L: 5596

		int var9;
		for (var9 = 0; var9 < var7 + Client.npcCount; ++var9) { // L: 5597
			Object var22;
			if (var9 < var7) { // L: 5599
				var22 = Client.players[var8[var9]]; // L: 5600
				if (var8[var9] == Client.combatTargetPlayerIndex) { // L: 5601
					var4 = true; // L: 5602
					var5 = var9; // L: 5603
					continue;
				}

				if (var22 == class136.localPlayer) { // L: 5606
					var6 = var9; // L: 5607
					continue; // L: 5608
				}
			} else {
				var22 = Client.npcs[Client.npcIndices[var9 - var7]]; // L: 5611
			}

			class303.drawActor2d((Actor)var22, var9, var0, var1, var2, var3); // L: 5612
		}

		if (Client.field766 && var6 != -1) { // L: 5614
			class303.drawActor2d(class136.localPlayer, var6, var0, var1, var2, var3); // L: 5615
		}

		if (var4) { // L: 5617
			class303.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var5, var0, var1, var2, var3); // L: 5618
		}

		for (var9 = 0; var9 < Client.field531; ++var9) { // L: 5620
			int var10 = Client.field751[var9]; // L: 5621
			int var11 = Client.field646[var9]; // L: 5622
			int var12 = Client.field722[var9]; // L: 5623
			int var13 = Client.field621[var9]; // L: 5624
			boolean var14 = true; // L: 5625

			while (var14) {
				var14 = false; // L: 5627

				for (int var21 = 0; var21 < var9; ++var21) { // L: 5628
					if (var11 + 2 > Client.field646[var21] - Client.field621[var21] && var11 - var13 < Client.field646[var21] + 2 && var10 - var12 < Client.field751[var21] + Client.field722[var21] && var12 + var10 > Client.field751[var21] - Client.field722[var21] && Client.field646[var21] - Client.field621[var21] < var11) { // L: 5629 5630
						var11 = Client.field646[var21] - Client.field621[var21]; // L: 5631
						var14 = true; // L: 5632
					}
				}
			}

			Client.viewportTempX = Client.field751[var9]; // L: 5637
			Client.viewportTempY = Client.field646[var9] = var11; // L: 5638
			String var15 = Client.field627[var9]; // L: 5639
			if (Client.chatEffects == 0) { // L: 5640
				int var16 = 16776960; // L: 5641
				if (Client.field623[var9] < 6) { // L: 5642
					var16 = Client.field744[Client.field623[var9]];
				}

				if (Client.field623[var9] == 6) { // L: 5643
					var16 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.field623[var9] == 7) { // L: 5644
					var16 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.field623[var9] == 8) { // L: 5645
					var16 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var17;
				if (Client.field623[var9] == 9) { // L: 5646
					var17 = 150 - Client.field579[var9]; // L: 5647
					if (var17 < 50) { // L: 5648
						var16 = var17 * 1280 + 16711680;
					} else if (var17 < 100) { // L: 5649
						var16 = 16776960 - (var17 - 50) * 327680;
					} else if (var17 < 150) { // L: 5650
						var16 = (var17 - 100) * 5 + 65280;
					}
				}

				if (Client.field623[var9] == 10) { // L: 5652
					var17 = 150 - Client.field579[var9]; // L: 5653
					if (var17 < 50) { // L: 5654
						var16 = var17 * 5 + 16711680;
					} else if (var17 < 100) { // L: 5655
						var16 = 16711935 - (var17 - 50) * 327680;
					} else if (var17 < 150) { // L: 5656
						var16 = (var17 - 100) * 327680 + 255 - (var17 - 100) * 5;
					}
				}

				if (Client.field623[var9] == 11) { // L: 5658
					var17 = 150 - Client.field579[var9]; // L: 5659
					if (var17 < 50) { // L: 5660
						var16 = 16777215 - var17 * 327685;
					} else if (var17 < 100) { // L: 5661
						var16 = (var17 - 50) * 327685 + 65280;
					} else if (var17 < 150) { // L: 5662
						var16 = 16777215 - (var17 - 100) * 327680;
					}
				}

				int var18;
				if (Client.field623[var9] == 12 && Client.field638[var9] == null) { // L: 5664 5665
					var17 = var15.length(); // L: 5666
					Client.field638[var9] = new int[var17]; // L: 5667

					for (var18 = 0; var18 < var17; ++var18) { // L: 5668
						int var19 = (int)((float)var18 / (float)var17 * 64.0F); // L: 5669
						int var20 = var19 << 10 | 896 | 64; // L: 5670
						Client.field638[var9][var18] = class467.field4797[var20]; // L: 5671
					}
				}

				if (Client.field683[var9] == 0) { // L: 5675
					Calendar.fontBold12.method7517(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.field638[var9]);
				}

				if (Client.field683[var9] == 1) { // L: 5676
					Calendar.fontBold12.method7477(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, Client.field638[var9]);
				}

				if (Client.field683[var9] == 2) { // L: 5677
					Calendar.fontBold12.method7478(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, Client.field638[var9]);
				}

				if (Client.field683[var9] == 3) { // L: 5678
					Calendar.fontBold12.method7479(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, 150 - Client.field579[var9], Client.field638[var9]);
				}

				if (Client.field683[var9] == 4) { // L: 5679
					var17 = (150 - Client.field579[var9]) * (Calendar.fontBold12.stringWidth(var15) + 100) / 150; // L: 5680
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1); // L: 5681
					Calendar.fontBold12.method7510(var15, var0 + Client.viewportTempX + 50 - var17, Client.viewportTempY + var1, var16, 0, Client.field638[var9]); // L: 5682
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 5683
				}

				if (Client.field683[var9] == 5) { // L: 5685
					var17 = 150 - Client.field579[var9]; // L: 5686
					var18 = 0; // L: 5687
					if (var17 < 25) { // L: 5688
						var18 = var17 - 25;
					} else if (var17 > 125) { // L: 5689
						var18 = var17 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - Calendar.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5); // L: 5690
					Calendar.fontBold12.method7517(var15, var0 + Client.viewportTempX, var18 + Client.viewportTempY + var1, var16, 0, Client.field638[var9]); // L: 5691
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 5692
				}
			} else {
				Calendar.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0); // L: 5696
			}
		}

	} // L: 5699

	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1051570454"
	)
	static void method2871() {
		if (Client.oculusOrbState == 1) { // L: 12850
			Client.field613 = true; // L: 12851
		}

	} // L: 12853
}
