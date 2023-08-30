import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("az")
public enum class6 implements class371 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	field19(0, 0);

	@ObfuscatedName("wi")
	@ObfuscatedSignature(
		descriptor = "Lru;"
	)
	static ArchiveDisk field17;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 2116991637
	)
	public final int field18;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 760206015
	)
	final int field16;

	class6(int var3, int var4) {
		this.field18 = var3; // L: 16
		this.field16 = var4; // L: 17
	} // L: 18

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field16; // L: 22
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "1893076970"
	)
	static int method38(int var0, Script var1, boolean var2) {
		return 2; // L: 5099
	}

	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "(Lmi;IIIB)V",
		garbageValue = "32"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		class301.method5721(); // L: 12460
		SpriteMask var4 = var0.getSpriteMask(false); // L: 12461
		if (var4 != null) { // L: 12462
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height); // L: 12463
			if (Client.minimapState != 2 && Client.minimapState != 5) { // L: 12464
				int var5 = Client.camAngleY & 2047; // L: 12465
				int var6 = VarbitComposition.localPlayer.x / 32 + 48; // L: 12466
				int var7 = 464 - VarbitComposition.localPlayer.y / 32; // L: 12467
				AbstractUserComparator.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths); // L: 12468

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) { // L: 12469
					var16 = Client.mapIconXs[var8] * 4 + 2 - VarbitComposition.localPlayer.x / 32; // L: 12470
					var10 = Client.mapIconYs[var8] * 4 + 2 - VarbitComposition.localPlayer.y / 32; // L: 12471
					class210.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4); // L: 12472
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) { // L: 12474
					for (var16 = 0; var16 < 104; ++var16) { // L: 12475
						NodeDeque var14 = Client.groundItems[HealthBar.Client_plane][var8][var16]; // L: 12476
						if (var14 != null) { // L: 12477
							var11 = var8 * 4 + 2 - VarbitComposition.localPlayer.x / 32; // L: 12478
							var12 = var16 * 4 + 2 - VarbitComposition.localPlayer.y / 32; // L: 12479
							class210.drawSpriteOnMinimap(var1, var2, var11, var12, FloorOverlayDefinition.field2289[0], var4); // L: 12480
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) { // L: 12484
					NPC var9 = Client.npcs[Client.npcIndices[var8]]; // L: 12485
					if (var9 != null && var9.isVisible()) { // L: 12486
						NPCComposition var18 = var9.definition; // L: 12487
						if (var18 != null && var18.transforms != null) { // L: 12488
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) { // L: 12489
							var11 = var9.x / 32 - VarbitComposition.localPlayer.x / 32; // L: 12490
							var12 = var9.y / 32 - VarbitComposition.localPlayer.y / 32; // L: 12491
							class210.drawSpriteOnMinimap(var1, var2, var11, var12, FloorOverlayDefinition.field2289[1], var4); // L: 12492
						}
					}
				}

				var8 = Players.Players_count; // L: 12496
				int[] var17 = Players.Players_indices; // L: 12497

				for (var10 = 0; var10 < var8; ++var10) { // L: 12498
					Player var15 = Client.players[var17[var10]]; // L: 12499
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != VarbitComposition.localPlayer) { // L: 12500
						var12 = var15.x / 32 - VarbitComposition.localPlayer.x / 32; // L: 12501
						int var13 = var15.y / 32 - VarbitComposition.localPlayer.y / 32; // L: 12502
						if (var15.method2305()) { // L: 12503
							class210.drawSpriteOnMinimap(var1, var2, var12, var13, FloorOverlayDefinition.field2289[3], var4);
						} else if (VarbitComposition.localPlayer.team != 0 && var15.team != 0 && var15.team == VarbitComposition.localPlayer.team) { // L: 12504
							class210.drawSpriteOnMinimap(var1, var2, var12, var13, FloorOverlayDefinition.field2289[4], var4);
						} else if (var15.method2308()) { // L: 12505
							class210.drawSpriteOnMinimap(var1, var2, var12, var13, FloorOverlayDefinition.field2289[5], var4);
						} else if (var15.isClanMember()) { // L: 12506
							class210.drawSpriteOnMinimap(var1, var2, var12, var13, FloorOverlayDefinition.field2289[6], var4);
						} else {
							class210.drawSpriteOnMinimap(var1, var2, var12, var13, FloorOverlayDefinition.field2289[2], var4); // L: 12507
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) { // L: 12510
					if (Client.hintArrowType == 1 && Client.field548 >= 0 && Client.field548 < Client.npcs.length) { // L: 12511
						NPC var19 = Client.npcs[Client.field548]; // L: 12512
						if (var19 != null) { // L: 12513
							var11 = var19.x / 32 - VarbitComposition.localPlayer.x / 32; // L: 12514
							var12 = var19.y / 32 - VarbitComposition.localPlayer.y / 32; // L: 12515
							class408.worldToMinimap(var1, var2, var11, var12, Message.field508[1], var4); // L: 12516
						}
					}

					if (Client.hintArrowType == 2) { // L: 12519
						var10 = Client.field550 * 4 - UrlRequester.baseX * 256 + 2 - VarbitComposition.localPlayer.x / 32; // L: 12520
						var11 = Client.field693 * 4 - class47.baseY * 256 + 2 - VarbitComposition.localPlayer.y / 32; // L: 12521
						class408.worldToMinimap(var1, var2, var10, var11, Message.field508[1], var4); // L: 12522
					}

					if (Client.hintArrowType == 10 && Client.field567 >= 0 && Client.field567 < Client.players.length) { // L: 12524
						Player var20 = Client.players[Client.field567]; // L: 12525
						if (var20 != null) { // L: 12526
							var11 = var20.x / 32 - VarbitComposition.localPlayer.x / 32; // L: 12527
							var12 = var20.y / 32 - VarbitComposition.localPlayer.y / 32; // L: 12528
							class408.worldToMinimap(var1, var2, var11, var12, Message.field508[1], var4); // L: 12529
						}
					}
				}

				if (Client.destinationX != 0) { // L: 12533
					var10 = Client.destinationX * 4 + 2 - VarbitComposition.localPlayer.x / 32; // L: 12534
					var11 = Client.destinationY * 4 + 2 - VarbitComposition.localPlayer.y / 32; // L: 12535
					class210.drawSpriteOnMinimap(var1, var2, var10, var11, Message.field508[0], var4); // L: 12536
				}

				if (!VarbitComposition.localPlayer.isHidden) { // L: 12538
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 12540
			}

			Client.field749[var3] = true; // L: 12541
		}
	} // L: 12542
}
