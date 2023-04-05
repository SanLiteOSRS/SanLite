import java.awt.Image;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mh")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	@ObfuscatedName("bh")
	static Image field3686;

	AbstractByteArrayCopier() {
	} // L: 4

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "118"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "-25"
	)
	@Export("set")
	abstract void set(byte[] var1);

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "(Lmy;IIIB)V",
		garbageValue = "-14"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		EnumComposition.playPcmPlayers(); // L: 11844
		SpriteMask var4 = var0.getSpriteMask(false); // L: 11845
		if (var4 != null) { // L: 11846
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height); // L: 11847
			if (Client.minimapState != 2 && Client.minimapState != 5) { // L: 11848
				int var5 = Client.camAngleY & 2047; // L: 11849
				int var6 = BuddyRankComparator.localPlayer.x / 32 + 48; // L: 11850
				int var7 = 464 - BuddyRankComparator.localPlayer.y / 32; // L: 11851
				class188.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths); // L: 11852

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) { // L: 11853
					var16 = Client.field709[var8] * 4 + 2 - BuddyRankComparator.localPlayer.x / 32; // L: 11854
					var10 = Client.field723[var8] * 4 + 2 - BuddyRankComparator.localPlayer.y / 32; // L: 11855
					class149.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4); // L: 11856
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) { // L: 11858
					for (var16 = 0; var16 < 104; ++var16) { // L: 11859
						NodeDeque var14 = Client.groundItems[TaskHandler.Client_plane][var8][var16]; // L: 11860
						if (var14 != null) { // L: 11861
							var11 = var8 * 4 + 2 - BuddyRankComparator.localPlayer.x / 32; // L: 11862
							var12 = var16 * 4 + 2 - BuddyRankComparator.localPlayer.y / 32; // L: 11863
							class149.drawSpriteOnMinimap(var1, var2, var11, var12, class157.mapDotSprites[0], var4); // L: 11864
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) { // L: 11868
					NPC var9 = Client.npcs[Client.npcIndices[var8]]; // L: 11869
					if (var9 != null && var9.isVisible()) { // L: 11870
						NPCComposition var18 = var9.definition; // L: 11871
						if (var18 != null && var18.transforms != null) { // L: 11872
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) { // L: 11873
							var11 = var9.x / 32 - BuddyRankComparator.localPlayer.x / 32; // L: 11874
							var12 = var9.y / 32 - BuddyRankComparator.localPlayer.y / 32; // L: 11875
							class149.drawSpriteOnMinimap(var1, var2, var11, var12, class157.mapDotSprites[1], var4); // L: 11876
						}
					}
				}

				var8 = Players.Players_count; // L: 11880
				int[] var17 = Players.Players_indices; // L: 11881

				for (var10 = 0; var10 < var8; ++var10) { // L: 11882
					Player var15 = Client.players[var17[var10]]; // L: 11883
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != BuddyRankComparator.localPlayer) { // L: 11884
						var12 = var15.x / 32 - BuddyRankComparator.localPlayer.x / 32; // L: 11885
						int var13 = var15.y / 32 - BuddyRankComparator.localPlayer.y / 32; // L: 11886
						if (var15.isFriend()) { // L: 11887
							class149.drawSpriteOnMinimap(var1, var2, var12, var13, class157.mapDotSprites[3], var4);
						} else if (BuddyRankComparator.localPlayer.team != 0 && var15.team != 0 && var15.team == BuddyRankComparator.localPlayer.team) { // L: 11888
							class149.drawSpriteOnMinimap(var1, var2, var12, var13, class157.mapDotSprites[4], var4);
						} else if (var15.isFriendsChatMember()) { // L: 11889
							class149.drawSpriteOnMinimap(var1, var2, var12, var13, class157.mapDotSprites[5], var4);
						} else if (var15.isClanMember()) { // L: 11890
							class149.drawSpriteOnMinimap(var1, var2, var12, var13, class157.mapDotSprites[6], var4);
						} else {
							class149.drawSpriteOnMinimap(var1, var2, var12, var13, class157.mapDotSprites[2], var4); // L: 11891
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) { // L: 11894
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) { // L: 11895
						NPC var19 = Client.npcs[Client.hintArrowNpcIndex]; // L: 11896
						if (var19 != null) { // L: 11897
							var11 = var19.x / 32 - BuddyRankComparator.localPlayer.x / 32; // L: 11898
							var12 = var19.y / 32 - BuddyRankComparator.localPlayer.y / 32; // L: 11899
							Frames.worldToMinimap(var1, var2, var11, var12, AbstractWorldMapData.mapMarkerSprites[1], var4); // L: 11900
						}
					}

					if (Client.hintArrowType == 2) { // L: 11903
						var10 = Client.hintArrowX * 4 - GameEngine.baseX * 256 + 2 - BuddyRankComparator.localPlayer.x / 32; // L: 11904
						var11 = Client.hintArrowY * 4 - class178.baseY * 256 + 2 - BuddyRankComparator.localPlayer.y / 32; // L: 11905
						Frames.worldToMinimap(var1, var2, var10, var11, AbstractWorldMapData.mapMarkerSprites[1], var4); // L: 11906
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) { // L: 11908
						Player var20 = Client.players[Client.hintArrowPlayerIndex]; // L: 11909
						if (var20 != null) { // L: 11910
							var11 = var20.x / 32 - BuddyRankComparator.localPlayer.x / 32; // L: 11911
							var12 = var20.y / 32 - BuddyRankComparator.localPlayer.y / 32; // L: 11912
							Frames.worldToMinimap(var1, var2, var11, var12, AbstractWorldMapData.mapMarkerSprites[1], var4); // L: 11913
						}
					}
				}

				if (Client.destinationX != 0) { // L: 11917
					var10 = Client.destinationX * 4 + 2 - BuddyRankComparator.localPlayer.x / 32; // L: 11918
					var11 = Client.destinationY * 4 + 2 - BuddyRankComparator.localPlayer.y / 32; // L: 11919
					class149.drawSpriteOnMinimap(var1, var2, var10, var11, AbstractWorldMapData.mapMarkerSprites[0], var4); // L: 11920
				}

				if (!BuddyRankComparator.localPlayer.isHidden) { // L: 11922
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 11924
			}

			Client.field697[var3] = true; // L: 11925
		}
	} // L: 11926
}
