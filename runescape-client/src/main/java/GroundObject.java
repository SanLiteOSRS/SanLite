import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
@Implements("GroundObject")
public final class GroundObject {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -43638231
	)
	@Export("z")
	int z;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -468843923
	)
	@Export("x")
	int x;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1864438201
	)
	@Export("y")
	int y;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		longValue = 6840749953580079071L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1783992821
	)
	@Export("flags")
	int flags;

	GroundObject() {
	} // L: 11

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-164841108"
	)
	static void method4315() {
		if (class290.loadWorlds()) { // L: 1861
			Login.worldSelectOpen = true; // L: 1862
			Login.worldSelectPage = 0; // L: 1863
			Login.worldSelectPagesCount = 0; // L: 1864
		}

	} // L: 1866

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1521078230"
	)
	static final void method4314(int var0, int var1, int var2, int var3) {
		Client.overheadTextCount = 0; // L: 5635
		boolean var4 = false; // L: 5636
		int var5 = -1; // L: 5637
		int var6 = -1; // L: 5638
		int var7 = Players.Players_count; // L: 5639
		int[] var8 = Players.Players_indices; // L: 5640

		int var9;
		for (var9 = 0; var9 < var7 + Client.npcCount; ++var9) { // L: 5641
			Object var20;
			if (var9 < var7) { // L: 5643
				var20 = Client.players[var8[var9]]; // L: 5644
				if (var8[var9] == Client.combatTargetPlayerIndex) { // L: 5645
					var4 = true; // L: 5646
					var5 = var9; // L: 5647
					continue;
				}

				if (var20 == class387.localPlayer) { // L: 5650
					var6 = var9; // L: 5651
					continue; // L: 5652
				}
			} else {
				var20 = Client.npcs[Client.npcIndices[var9 - var7]]; // L: 5655
			}

			class374.drawActor2d((Actor)var20, var9, var0, var1, var2, var3); // L: 5656
		}

		if (Client.renderSelf && var6 != -1) { // L: 5658
			class374.drawActor2d(class387.localPlayer, var6, var0, var1, var2, var3); // L: 5659
		}

		if (var4) { // L: 5661
			class374.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var5, var0, var1, var2, var3); // L: 5662
		}

		for (var9 = 0; var9 < Client.overheadTextCount; ++var9) { // L: 5664
			int var10 = Client.overheadTextXs[var9]; // L: 5665
			int var11 = Client.overheadTextYs[var9]; // L: 5666
			int var12 = Client.overheadTextXOffsets[var9]; // L: 5667
			int var13 = Client.overheadTextAscents[var9]; // L: 5668
			boolean var14 = true; // L: 5669

			while (var14) {
				var14 = false; // L: 5671

				for (int var19 = 0; var19 < var9; ++var19) { // L: 5672
					if (var11 + 2 > Client.overheadTextYs[var19] - Client.overheadTextAscents[var19] && var11 - var13 < Client.overheadTextYs[var19] + 2 && var10 - var12 < Client.overheadTextXs[var19] + Client.overheadTextXOffsets[var19] && var12 + var10 > Client.overheadTextXs[var19] - Client.overheadTextXOffsets[var19] && Client.overheadTextYs[var19] - Client.overheadTextAscents[var19] < var11) { // L: 5673 5674
						var11 = Client.overheadTextYs[var19] - Client.overheadTextAscents[var19]; // L: 5675
						var14 = true; // L: 5676
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var9]; // L: 5681
			Client.viewportTempY = Client.overheadTextYs[var9] = var11; // L: 5682
			String var15 = Client.overheadText[var9]; // L: 5683
			if (Client.chatEffects == 0) { // L: 5684
				int var16 = 16776960; // L: 5685
				if (Client.overheadTextColors[var9] < 6) { // L: 5686
					var16 = Client.field758[Client.overheadTextColors[var9]];
				}

				if (Client.overheadTextColors[var9] == 6) { // L: 5687
					var16 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var9] == 7) { // L: 5688
					var16 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var9] == 8) { // L: 5689
					var16 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var17;
				if (Client.overheadTextColors[var9] == 9) { // L: 5690
					var17 = 150 - Client.overheadTextCyclesRemaining[var9]; // L: 5691
					if (var17 < 50) { // L: 5692
						var16 = var17 * 1280 + 16711680;
					} else if (var17 < 100) { // L: 5693
						var16 = 16776960 - (var17 - 50) * 327680;
					} else if (var17 < 150) { // L: 5694
						var16 = (var17 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var9] == 10) { // L: 5696
					var17 = 150 - Client.overheadTextCyclesRemaining[var9]; // L: 5697
					if (var17 < 50) { // L: 5698
						var16 = var17 * 5 + 16711680;
					} else if (var17 < 100) { // L: 5699
						var16 = 16711935 - (var17 - 50) * 327680;
					} else if (var17 < 150) { // L: 5700
						var16 = (var17 - 100) * 327680 + 255 - (var17 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var9] == 11) { // L: 5702
					var17 = 150 - Client.overheadTextCyclesRemaining[var9]; // L: 5703
					if (var17 < 50) { // L: 5704
						var16 = 16777215 - var17 * 327685;
					} else if (var17 < 100) { // L: 5705
						var16 = (var17 - 50) * 327685 + 65280;
					} else if (var17 < 150) { // L: 5706
						var16 = 16777215 - (var17 - 100) * 327680;
					}
				}

				if (Client.overheadTextEffects[var9] == 0) { // L: 5708
					class19.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0);
				}

				if (Client.overheadTextEffects[var9] == 1) { // L: 5709
					class19.fontBold12.drawCenteredWave(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var9] == 2) { // L: 5710
					class19.fontBold12.drawCenteredWave2(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var9] == 3) { // L: 5711
					class19.fontBold12.drawCenteredShake(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var9]);
				}

				if (Client.overheadTextEffects[var9] == 4) { // L: 5712
					var17 = (150 - Client.overheadTextCyclesRemaining[var9]) * (class19.fontBold12.stringWidth(var15) + 100) / 150; // L: 5713
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1); // L: 5714
					class19.fontBold12.draw(var15, var0 + Client.viewportTempX + 50 - var17, Client.viewportTempY + var1, var16, 0); // L: 5715
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 5716
				}

				if (Client.overheadTextEffects[var9] == 5) { // L: 5718
					var17 = 150 - Client.overheadTextCyclesRemaining[var9]; // L: 5719
					int var18 = 0; // L: 5720
					if (var17 < 25) { // L: 5721
						var18 = var17 - 25;
					} else if (var17 > 125) { // L: 5722
						var18 = var17 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - class19.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5); // L: 5723
					class19.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, var18 + Client.viewportTempY + var1, var16, 0); // L: 5724
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 5725
				}
			} else {
				class19.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0); // L: 5729
			}
		}

	} // L: 5732

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-808127633"
	)
	static final void method4313(int var0) {
		if (var0 >= 0) { // L: 9397
			int var1 = Client.menuArguments1[var0]; // L: 9398
			int var2 = Client.menuArguments2[var0]; // L: 9399
			int var3 = Client.menuOpcodes[var0]; // L: 9400
			int var4 = Client.menuIdentifiers[var0]; // L: 9401
			int var5 = Client.field655[var0]; // L: 9402
			String var6 = Client.menuActions[var0]; // L: 9403
			String var7 = Client.menuTargets[var0]; // L: 9404
			FileSystem.method3505(var1, var2, var3, var4, var5, var6, var7, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 9405
		}
	} // L: 9406

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lkz;I)Ljava/lang/String;",
		garbageValue = "949347159"
	)
	static String method4312(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) { // L: 11378
			for (int var2 = 1; var2 <= 5; ++var2) { // L: 11379
				while (true) {
					int var3 = var0.indexOf("%" + var2); // L: 11381
					if (var3 == -1) { // L: 11382
						break;
					}

					String var4 = var0.substring(0, var3); // L: 11383
					int var6 = Language.method6780(var1, var2 - 1); // L: 11385
					String var5;
					if (var6 < 999999999) { // L: 11387
						var5 = Integer.toString(var6); // L: 11388
					} else {
						var5 = "*"; // L: 11391
					}

					var0 = var4 + var5 + var0.substring(var3 + 2); // L: 11393
				}
			}
		}

		return var0; // L: 11397
	}
}
