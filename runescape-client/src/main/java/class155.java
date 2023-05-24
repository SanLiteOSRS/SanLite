import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
public abstract class class155 extends Node {
	class155() {
	} // L: 49

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)V",
		garbageValue = "-1949352075"
	)
	abstract void vmethod3448(Buffer var1);

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgj;B)V",
		garbageValue = "-49"
	)
	abstract void vmethod3450(ClanChannel var1);

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "(Lmq;IIII)V",
		garbageValue = "715793835"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		class323.playPcmPlayers(); // L: 11863
		SpriteMask var4 = var0.getSpriteMask(false); // L: 11864
		if (var4 != null) { // L: 11865
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height); // L: 11866
			if (Client.minimapState != 2 && Client.minimapState != 5) { // L: 11867
				int var5 = Client.camAngleY & 2047; // L: 11868
				int var6 = MusicPatchNode.localPlayer.x / 32 + 48; // L: 11869
				int var7 = 464 - MusicPatchNode.localPlayer.y / 32; // L: 11870
				UrlRequester.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths); // L: 11871

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) { // L: 11872
					var16 = Client.mapIconXs[var8] * 4 + 2 - MusicPatchNode.localPlayer.x / 32; // L: 11873
					var10 = Client.mapIconYs[var8] * 4 + 2 - MusicPatchNode.localPlayer.y / 32; // L: 11874
					class426.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4); // L: 11875
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) { // L: 11877
					for (var16 = 0; var16 < 104; ++var16) { // L: 11878
						NodeDeque var14 = Client.groundItems[GameEngine.Client_plane][var8][var16]; // L: 11879
						if (var14 != null) { // L: 11880
							var11 = var8 * 4 + 2 - MusicPatchNode.localPlayer.x / 32; // L: 11881
							var12 = var16 * 4 + 2 - MusicPatchNode.localPlayer.y / 32; // L: 11882
							class426.drawSpriteOnMinimap(var1, var2, var11, var12, class477.mapDotSprites[0], var4); // L: 11883
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) { // L: 11887
					NPC var9 = Client.npcs[Client.npcIndices[var8]]; // L: 11888
					if (var9 != null && var9.isVisible()) { // L: 11889
						NPCComposition var18 = var9.definition; // L: 11890
						if (var18 != null && var18.transforms != null) { // L: 11891
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) { // L: 11892
							var11 = var9.x / 32 - MusicPatchNode.localPlayer.x / 32; // L: 11893
							var12 = var9.y / 32 - MusicPatchNode.localPlayer.y / 32; // L: 11894
							class426.drawSpriteOnMinimap(var1, var2, var11, var12, class477.mapDotSprites[1], var4); // L: 11895
						}
					}
				}

				var8 = Players.Players_count; // L: 11899
				int[] var17 = Players.Players_indices; // L: 11900

				for (var10 = 0; var10 < var8; ++var10) { // L: 11901
					Player var15 = Client.players[var17[var10]]; // L: 11902
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != MusicPatchNode.localPlayer) { // L: 11903
						var12 = var15.x / 32 - MusicPatchNode.localPlayer.x / 32; // L: 11904
						int var13 = var15.y / 32 - MusicPatchNode.localPlayer.y / 32; // L: 11905
						if (var15.isFriend()) { // L: 11906
							class426.drawSpriteOnMinimap(var1, var2, var12, var13, class477.mapDotSprites[3], var4);
						} else if (MusicPatchNode.localPlayer.team != 0 && var15.team != 0 && var15.team == MusicPatchNode.localPlayer.team) { // L: 11907
							class426.drawSpriteOnMinimap(var1, var2, var12, var13, class477.mapDotSprites[4], var4);
						} else if (var15.isFriendsChatMember()) { // L: 11908
							class426.drawSpriteOnMinimap(var1, var2, var12, var13, class477.mapDotSprites[5], var4);
						} else if (var15.isClanMember()) { // L: 11909
							class426.drawSpriteOnMinimap(var1, var2, var12, var13, class477.mapDotSprites[6], var4);
						} else {
							class426.drawSpriteOnMinimap(var1, var2, var12, var13, class477.mapDotSprites[2], var4); // L: 11910
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) { // L: 11913
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) { // L: 11914
						NPC var19 = Client.npcs[Client.hintArrowNpcIndex]; // L: 11915
						if (var19 != null) { // L: 11916
							var11 = var19.x / 32 - MusicPatchNode.localPlayer.x / 32; // L: 11917
							var12 = var19.y / 32 - MusicPatchNode.localPlayer.y / 32; // L: 11918
							class485.worldToMinimap(var1, var2, var11, var12, Players.mapMarkerSprites[1], var4); // L: 11919
						}
					}

					if (Client.hintArrowType == 2) { // L: 11922
						var10 = Client.field653 * 4 - WorldMapData_0.baseX * 256 + 2 - MusicPatchNode.localPlayer.x / 32; // L: 11923
						var11 = Client.field511 * 4 - GameObject.baseY * 256 + 2 - MusicPatchNode.localPlayer.y / 32; // L: 11924
						class485.worldToMinimap(var1, var2, var10, var11, Players.mapMarkerSprites[1], var4); // L: 11925
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) { // L: 11927
						Player var20 = Client.players[Client.hintArrowPlayerIndex]; // L: 11928
						if (var20 != null) { // L: 11929
							var11 = var20.x / 32 - MusicPatchNode.localPlayer.x / 32; // L: 11930
							var12 = var20.y / 32 - MusicPatchNode.localPlayer.y / 32; // L: 11931
							class485.worldToMinimap(var1, var2, var11, var12, Players.mapMarkerSprites[1], var4); // L: 11932
						}
					}
				}

				if (Client.destinationX != 0) { // L: 11936
					var10 = Client.destinationX * 4 + 2 - MusicPatchNode.localPlayer.x / 32; // L: 11937
					var11 = Client.destinationY * 4 + 2 - MusicPatchNode.localPlayer.y / 32; // L: 11938
					class426.drawSpriteOnMinimap(var1, var2, var10, var11, Players.mapMarkerSprites[0], var4); // L: 11939
				}

				if (!MusicPatchNode.localPlayer.isHidden) { // L: 11941
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 11943
			}

			Client.field706[var3] = true; // L: 11944
		}
	} // L: 11945
}
