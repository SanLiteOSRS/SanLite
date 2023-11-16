import java.text.ParseException;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
public class class36 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	@Export("scene")
	static Scene scene;
	@ObfuscatedName("kk")
	@ObfuscatedGetter(
		intValue = -923257993
	)
	@Export("cameraZ")
	static int cameraZ;

	static {
		reflectionChecks = new IterableNodeDeque(); // L: 17
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)[Llo;",
		garbageValue = "88"
	)
	static LoginPacket[] method708() {
		return new LoginPacket[]{LoginPacket.field3383, LoginPacket.field3380, LoginPacket.field3382, LoginPacket.field3378, LoginPacket.field3377, LoginPacket.field3379}; // L: 22
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1667921404"
	)
	static boolean method709() {
		Date var0;
		try {
			var0 = class395.method7402(); // L: 1437
		} catch (ParseException var7) { // L: 1439
			UserComparator7.method2966(7); // L: 1441
			class139.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 1442
			return false; // L: 1444
		}

		if (var0 == null) { // L: 1446
			return false; // L: 1447
		} else {
			java.util.Calendar var2 = java.util.Calendar.getInstance(); // L: 1451
			var2.set(1, var2.get(1) - 13); // L: 1452
			var2.set(5, var2.get(5) + 1); // L: 1453
			var2.set(11, 0); // L: 1454
			var2.set(12, 0); // L: 1455
			var2.set(13, 0); // L: 1456
			var2.set(14, 0); // L: 1457
			Date var3 = var2.getTime(); // L: 1458
			boolean var4 = var0.before(var3); // L: 1459
			boolean var6 = class241.method4832(var0); // L: 1462
			if (!var6) { // L: 1463
				UserComparator7.method2966(7); // L: 1465
				class139.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 1466
				return false; // L: 1468
			} else {
				if (!var4) { // L: 1470
					class160.field1748 = 8388607; // L: 1471
				} else {
					class160.field1748 = (int)(var0.getTime() / 86400000L - 11745L); // L: 1474
				}

				return true; // L: 1476
			}
		}
	}

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "(Lnn;IIII)V",
		garbageValue = "-1700622537"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		class102.method2728(); // L: 12538
		SpriteMask var4 = var0.method6668(HealthBarDefinition.field1877, false); // L: 12539
		if (var4 != null) { // L: 12540
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height); // L: 12541
			if (Client.minimapState != 2 && Client.minimapState != 5) { // L: 12542
				int var5 = Client.camAngleY & 2047; // L: 12543
				int var6 = class229.localPlayer.x / 32 + 48; // L: 12544
				int var7 = 464 - class229.localPlayer.y / 32; // L: 12545
				class102.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths); // L: 12546

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) { // L: 12547
					var16 = Client.mapIconXs[var8] * 4 + 2 - class229.localPlayer.x / 32; // L: 12548
					var10 = Client.mapIconYs[var8] * 4 + 2 - class229.localPlayer.y / 32; // L: 12549
					class147.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4); // L: 12550
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) { // L: 12552
					for (var16 = 0; var16 < 104; ++var16) { // L: 12553
						NodeDeque var14 = Client.groundItems[ItemLayer.Client_plane][var8][var16]; // L: 12554
						if (var14 != null) { // L: 12555
							var11 = var8 * 4 + 2 - class229.localPlayer.x / 32; // L: 12556
							var12 = var16 * 4 + 2 - class229.localPlayer.y / 32; // L: 12557
							class147.drawSpriteOnMinimap(var1, var2, var11, var12, HorizontalAlignment.field1908[0], var4); // L: 12558
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) { // L: 12562
					NPC var9 = Client.npcs[Client.npcIndices[var8]]; // L: 12563
					if (var9 != null && var9.isVisible()) { // L: 12564
						NPCComposition var18 = var9.definition; // L: 12565
						if (var18 != null && var18.transforms != null) { // L: 12566
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) { // L: 12567
							var11 = var9.x / 32 - class229.localPlayer.x / 32; // L: 12568
							var12 = var9.y / 32 - class229.localPlayer.y / 32; // L: 12569
							class147.drawSpriteOnMinimap(var1, var2, var11, var12, HorizontalAlignment.field1908[1], var4); // L: 12570
						}
					}
				}

				var8 = Players.Players_count; // L: 12574
				int[] var17 = Players.Players_indices; // L: 12575

				for (var10 = 0; var10 < var8; ++var10) { // L: 12576
					Player var15 = Client.players[var17[var10]]; // L: 12577
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != class229.localPlayer) { // L: 12578
						var12 = var15.x / 32 - class229.localPlayer.x / 32; // L: 12579
						int var13 = var15.y / 32 - class229.localPlayer.y / 32; // L: 12580
						if (var15.method2388()) { // L: 12581
							class147.drawSpriteOnMinimap(var1, var2, var12, var13, HorizontalAlignment.field1908[3], var4);
						} else if (class229.localPlayer.team != 0 && var15.team != 0 && var15.team == class229.localPlayer.team) { // L: 12582
							class147.drawSpriteOnMinimap(var1, var2, var12, var13, HorizontalAlignment.field1908[4], var4);
						} else if (var15.method2391()) { // L: 12583
							class147.drawSpriteOnMinimap(var1, var2, var12, var13, HorizontalAlignment.field1908[5], var4);
						} else if (var15.isClanMember()) { // L: 12584
							class147.drawSpriteOnMinimap(var1, var2, var12, var13, HorizontalAlignment.field1908[6], var4);
						} else {
							class147.drawSpriteOnMinimap(var1, var2, var12, var13, HorizontalAlignment.field1908[2], var4); // L: 12585
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) { // L: 12588
					if (Client.hintArrowType == 1 && Client.field507 >= 0 && Client.field507 < Client.npcs.length) { // L: 12589
						NPC var19 = Client.npcs[Client.field507]; // L: 12590
						if (var19 != null) { // L: 12591
							var11 = var19.x / 32 - class229.localPlayer.x / 32; // L: 12592
							var12 = var19.y / 32 - class229.localPlayer.y / 32; // L: 12593
							class153.worldToMinimap(var1, var2, var11, var12, class12.field53[1], var4); // L: 12594
						}
					}

					if (Client.hintArrowType == 2) { // L: 12597
						var10 = Client.field509 * 4 - class187.baseX * 256 + 2 - class229.localPlayer.x / 32; // L: 12598
						var11 = Client.field510 * 4 - class101.baseY * 256 + 2 - class229.localPlayer.y / 32; // L: 12599
						class153.worldToMinimap(var1, var2, var10, var11, class12.field53[1], var4); // L: 12600
					}

					if (Client.hintArrowType == 10 && Client.field508 >= 0 && Client.field508 < Client.players.length) { // L: 12602
						Player var20 = Client.players[Client.field508]; // L: 12603
						if (var20 != null) { // L: 12604
							var11 = var20.x / 32 - class229.localPlayer.x / 32; // L: 12605
							var12 = var20.y / 32 - class229.localPlayer.y / 32; // L: 12606
							class153.worldToMinimap(var1, var2, var11, var12, class12.field53[1], var4); // L: 12607
						}
					}
				}

				if (Client.destinationX != 0) { // L: 12611
					var10 = Client.destinationX * 4 + 2 - class229.localPlayer.x / 32; // L: 12612
					var11 = Client.destinationY * 4 + 2 - class229.localPlayer.y / 32; // L: 12613
					class147.drawSpriteOnMinimap(var1, var2, var10, var11, class12.field53[0], var4); // L: 12614
				}

				if (!class229.localPlayer.isHidden) { // L: 12616
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 12618
			}

			Client.field785[var3] = true; // L: 12619
		}
	} // L: 12620
}
