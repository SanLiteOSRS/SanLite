import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qs")
public class class436 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	public static final class436 field4651;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	static final class436 field4652;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -537971187
	)
	final int field4650;

	static {
		field4651 = new class436(1); // L: 5
		field4652 = new class436(0); // L: 6
	}

	class436(int var1) {
		this.field4650 = var1; // L: 10
	} // L: 11

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "30"
	)
	static String method7916(int var0) {
		return "<img=" + var0 + ">"; // L: 18
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "112"
	)
	static final void method7914(String var0) {
		class411.addGameMessage(30, "", var0); // L: 110
	} // L: 111

	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "(Lnm;IIII)V",
		garbageValue = "-1362386286"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		class313.method5891(); // L: 12450
		SpriteMask var4 = var0.method6594(class33.field184, false); // L: 12451
		if (var4 != null) { // L: 12452
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height); // L: 12453
			if (Client.minimapState != 2 && Client.minimapState != 5) { // L: 12454
				int var5 = Client.camAngleY & 2047; // L: 12455
				int var6 = TextureProvider.localPlayer.x / 32 + 48; // L: 12456
				int var7 = 464 - TextureProvider.localPlayer.y / 32; // L: 12457
				SpriteMask.field3559.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths); // L: 12458

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.field599; ++var8) { // L: 12459
					var16 = Client.field765[var8] * 4 + 2 - TextureProvider.localPlayer.x / 32; // L: 12460
					var10 = Client.field766[var8] * 4 + 2 - TextureProvider.localPlayer.y / 32; // L: 12461
					SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var16, var10, Client.field767[var8], var4); // L: 12462
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) { // L: 12464
					for (var16 = 0; var16 < 104; ++var16) { // L: 12465
						NodeDeque var14 = Client.groundItems[class87.Client_plane][var8][var16]; // L: 12466
						if (var14 != null) { // L: 12467
							var11 = var8 * 4 + 2 - TextureProvider.localPlayer.x / 32; // L: 12468
							var12 = var16 * 4 + 2 - TextureProvider.localPlayer.y / 32; // L: 12469
							SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var11, var12, class103.field1336[0], var4); // L: 12470
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) { // L: 12474
					NPC var9 = Client.npcs[Client.npcIndices[var8]]; // L: 12475
					if (var9 != null && var9.isVisible()) { // L: 12476
						NPCComposition var18 = var9.definition; // L: 12477
						if (var18 != null && var18.transforms != null) { // L: 12478
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) { // L: 12479
							var11 = var9.x / 32 - TextureProvider.localPlayer.x / 32; // L: 12480
							var12 = var9.y / 32 - TextureProvider.localPlayer.y / 32; // L: 12481
							SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var11, var12, class103.field1336[1], var4); // L: 12482
						}
					}
				}

				var8 = Players.Players_count; // L: 12486
				int[] var17 = Players.Players_indices; // L: 12487

				for (var10 = 0; var10 < var8; ++var10) { // L: 12488
					Player var15 = Client.players[var17[var10]]; // L: 12489
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != TextureProvider.localPlayer) { // L: 12490
						var12 = var15.x / 32 - TextureProvider.localPlayer.x / 32; // L: 12491
						int var13 = var15.y / 32 - TextureProvider.localPlayer.y / 32; // L: 12492
						if (var15.method2363()) { // L: 12493
							SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var12, var13, class103.field1336[3], var4);
						} else if (TextureProvider.localPlayer.team != 0 && var15.team != 0 && var15.team == TextureProvider.localPlayer.team) { // L: 12494
							SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var12, var13, class103.field1336[4], var4);
						} else if (var15.method2366()) { // L: 12495
							SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var12, var13, class103.field1336[5], var4);
						} else if (var15.isClanMember()) { // L: 12496
							SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var12, var13, class103.field1336[6], var4);
						} else {
							SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var12, var13, class103.field1336[2], var4); // L: 12497
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) { // L: 12500
					if (Client.hintArrowType == 1 && Client.field540 >= 0 && Client.field540 < Client.npcs.length) { // L: 12501
						NPC var19 = Client.npcs[Client.field540]; // L: 12502
						if (var19 != null) { // L: 12503
							var11 = var19.x / 32 - TextureProvider.localPlayer.x / 32; // L: 12504
							var12 = var19.y / 32 - TextureProvider.localPlayer.y / 32; // L: 12505
							Language.worldToMinimap(var1, var2, var11, var12, class47.field343[1], var4); // L: 12506
						}
					}

					if (Client.hintArrowType == 2) { // L: 12509
						var10 = Client.field583 * 4 - class20.baseX * 256 + 2 - TextureProvider.localPlayer.x / 32; // L: 12510
						var11 = Client.field543 * 4 - class19.baseY * 256 + 2 - TextureProvider.localPlayer.y / 32; // L: 12511
						Language.worldToMinimap(var1, var2, var10, var11, class47.field343[1], var4); // L: 12512
					}

					if (Client.hintArrowType == 10 && Client.field541 >= 0 && Client.field541 < Client.players.length) { // L: 12514
						Player var20 = Client.players[Client.field541]; // L: 12515
						if (var20 != null) { // L: 12516
							var11 = var20.x / 32 - TextureProvider.localPlayer.x / 32; // L: 12517
							var12 = var20.y / 32 - TextureProvider.localPlayer.y / 32; // L: 12518
							Language.worldToMinimap(var1, var2, var11, var12, class47.field343[1], var4); // L: 12519
						}
					}
				}

				if (Client.destinationX != 0) { // L: 12523
					var10 = Client.destinationX * 4 + 2 - TextureProvider.localPlayer.x / 32; // L: 12524
					var11 = Client.destinationY * 4 + 2 - TextureProvider.localPlayer.y / 32; // L: 12525
					SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var10, var11, class47.field343[0], var4); // L: 12526
				}

				if (!TextureProvider.localPlayer.isHidden) { // L: 12528
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 12530
			}

			Client.field735[var3] = true; // L: 12531
		}
	} // L: 12532
}
