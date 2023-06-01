import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mb")
@Implements("Calendar")
public class Calendar {
	@ObfuscatedName("ay")
	@Export("MONTH_NAMES_ENGLISH_GERMAN")
	public static final String[][] MONTH_NAMES_ENGLISH_GERMAN;
	@ObfuscatedName("an")
	@Export("DAYS_OF_THE_WEEK")
	public static final String[] DAYS_OF_THE_WEEK;
	@ObfuscatedName("ar")
	@Export("Calendar_calendar")
	public static java.util.Calendar Calendar_calendar;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("ItemComposition_archive")
	public static AbstractArchive ItemComposition_archive;

	static {
		MONTH_NAMES_ENGLISH_GERMAN = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}, {"jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc"}, {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"}, {"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"}, {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"}}; // L: 8
		DAYS_OF_THE_WEEK = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"}; // L: 18
		java.util.Calendar.getInstance(); // L: 22
		Calendar_calendar = java.util.Calendar.getInstance(TimeZone.getTimeZone("GMT")); // L: 23
	} // L: 24

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-678851106"
	)
	public static int method6612(int var0, int var1, int var2) {
		int var3 = WorldMapElement.method3585(var2 - var1 + 1); // L: 59
		var3 <<= var1; // L: 60
		var0 |= var3; // L: 61
		return var0; // L: 62
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-679102865"
	)
	static final void method6613(int var0, int var1, int var2, int var3) {
		Client.field479 = 0; // L: 5534
		boolean var4 = false; // L: 5535
		int var5 = -1; // L: 5536
		int var6 = -1; // L: 5537
		int var7 = Players.Players_count; // L: 5538
		int[] var8 = Players.Players_indices; // L: 5539

		int var9;
		for (var9 = 0; var9 < var7 + Client.npcCount; ++var9) { // L: 5540
			Object var21;
			if (var9 < var7) { // L: 5542
				var21 = Client.players[var8[var9]]; // L: 5543
				if (var8[var9] == Client.combatTargetPlayerIndex) { // L: 5544
					var4 = true; // L: 5545
					var5 = var9; // L: 5546
					continue;
				}

				if (var21 == HitSplatDefinition.localPlayer) { // L: 5549
					var6 = var9; // L: 5550
					continue; // L: 5551
				}
			} else {
				var21 = Client.npcs[Client.npcIndices[var9 - var7]]; // L: 5554
			}

			Occluder.drawActor2d((Actor)var21, var9, var0, var1, var2, var3); // L: 5555
		}

		if (Client.field503 && var6 != -1) { // L: 5557
			Occluder.drawActor2d(HitSplatDefinition.localPlayer, var6, var0, var1, var2, var3); // L: 5558
		}

		if (var4) { // L: 5560
			Occluder.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var5, var0, var1, var2, var3); // L: 5561
		}

		for (var9 = 0; var9 < Client.field479; ++var9) { // L: 5563
			int var10 = Client.field585[var9]; // L: 5564
			int var11 = Client.field700[var9]; // L: 5565
			int var12 = Client.field588[var9]; // L: 5566
			int var13 = Client.field587[var9]; // L: 5567
			boolean var14 = true; // L: 5568

			while (var14) {
				var14 = false; // L: 5570

				for (int var20 = 0; var20 < var9; ++var20) { // L: 5571
					if (var11 + 2 > Client.field700[var20] - Client.field587[var20] && var11 - var13 < Client.field700[var20] + 2 && var10 - var12 < Client.field588[var20] + Client.field585[var20] && var12 + var10 > Client.field585[var20] - Client.field588[var20] && Client.field700[var20] - Client.field587[var20] < var11) { // L: 5572 5573
						var11 = Client.field700[var20] - Client.field587[var20]; // L: 5574
						var14 = true; // L: 5575
					}
				}
			}

			Client.viewportTempX = Client.field585[var9]; // L: 5580
			Client.viewportTempY = Client.field700[var9] = var11; // L: 5581
			String var15 = Client.field515[var9]; // L: 5582
			if (Client.chatEffects == 0) { // L: 5583
				int var16 = 16776960; // L: 5584
				if (Client.field610[var9] < 6) { // L: 5585
					var16 = Client.field710[Client.field610[var9]];
				}

				if (Client.field610[var9] == 6) { // L: 5586
					var16 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.field610[var9] == 7) { // L: 5587
					var16 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.field610[var9] == 8) { // L: 5588
					var16 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var17;
				if (Client.field610[var9] == 9) { // L: 5589
					var17 = 150 - Client.field686[var9]; // L: 5590
					if (var17 < 50) { // L: 5591
						var16 = var17 * 1280 + 16711680;
					} else if (var17 < 100) { // L: 5592
						var16 = 16776960 - (var17 - 50) * 327680;
					} else if (var17 < 150) { // L: 5593
						var16 = (var17 - 100) * 5 + 65280;
					}
				}

				if (Client.field610[var9] == 10) { // L: 5595
					var17 = 150 - Client.field686[var9]; // L: 5596
					if (var17 < 50) { // L: 5597
						var16 = var17 * 5 + 16711680;
					} else if (var17 < 100) { // L: 5598
						var16 = 16711935 - (var17 - 50) * 327680;
					} else if (var17 < 150) { // L: 5599
						var16 = (var17 - 100) * 327680 + 255 - (var17 - 100) * 5;
					}
				}

				if (Client.field610[var9] == 11) { // L: 5601
					var17 = 150 - Client.field686[var9]; // L: 5602
					if (var17 < 50) { // L: 5603
						var16 = 16777215 - var17 * 327685;
					} else if (var17 < 100) { // L: 5604
						var16 = (var17 - 50) * 327685 + 65280;
					} else if (var17 < 150) { // L: 5605
						var16 = 16777215 - (var17 - 100) * 327680;
					}
				}

				int var18;
				if (Client.field610[var9] == 12 && Client.field591[var9] == null) { // L: 5607 5608
					var17 = var15.length(); // L: 5609
					Client.field591[var9] = new int[var17]; // L: 5610

					for (var18 = 0; var18 < var17; ++var18) { // L: 5611
						int var19 = (int)((float)var18 / (float)var17 * 64.0F); // L: 5612
						Client.field591[var9][var18] = class454.field4747[var19 << 10 | 896 | 64]; // L: 5613
					}
				}

				if (Client.field590[var9] == 0) { // L: 5617
					class126.fontBold12.method7416(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.field591[var9]);
				}

				if (Client.field590[var9] == 1) { // L: 5618
					class126.fontBold12.method7402(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, Client.field591[var9]);
				}

				if (Client.field590[var9] == 2) { // L: 5619
					class126.fontBold12.method7482(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, Client.field591[var9]);
				}

				if (Client.field590[var9] == 3) { // L: 5620
					class126.fontBold12.method7501(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, 150 - Client.field686[var9], Client.field591[var9]);
				}

				if (Client.field590[var9] == 4) { // L: 5621
					var17 = (150 - Client.field686[var9]) * (class126.fontBold12.stringWidth(var15) + 100) / 150; // L: 5622
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1); // L: 5623
					class126.fontBold12.method7417(var15, var0 + Client.viewportTempX + 50 - var17, Client.viewportTempY + var1, var16, 0, Client.field591[var9]); // L: 5624
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 5625
				}

				if (Client.field590[var9] == 5) { // L: 5627
					var17 = 150 - Client.field686[var9]; // L: 5628
					var18 = 0; // L: 5629
					if (var17 < 25) { // L: 5630
						var18 = var17 - 25;
					} else if (var17 > 125) { // L: 5631
						var18 = var17 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - class126.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5); // L: 5632
					class126.fontBold12.method7416(var15, var0 + Client.viewportTempX, var18 + Client.viewportTempY + var1, var16, 0, Client.field591[var9]); // L: 5633
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 5634
				}
			} else {
				class126.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0); // L: 5638
			}
		}

	} // L: 5641
}
