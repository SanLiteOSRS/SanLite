import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
@Implements("UserComparator10")
public class UserComparator10 extends AbstractUserComparator {
	@ObfuscatedName("u")
	static int[][] field1999;
	@ObfuscatedName("p")
	static int[][][] field2000;
	@ObfuscatedName("ah")
	static String field2002;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		signature = "Lfu;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("f")
	@Export("reversed")
	final boolean reversed;

	public UserComparator10(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lkl;Lkl;I)I",
		garbageValue = "2109769786"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) {
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		signature = "(Lht;IIIB)V",
		garbageValue = "-68"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		FriendSystem.playPcmPlayers();
		SpriteMask var4 = var0.getSpriteMask(false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
			if (Client.minimapState != 2 && Client.minimapState != 5) {
				int var5 = Client.camAngleY & 2047;
				int var6 = PlayerType.localPlayer.x / 32 + 48;
				int var7 = 464 - PlayerType.localPlayer.y / 32;
				InterfaceParent.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);

				int var8;
				int var9;
				int var10;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) {
					var9 = Client.field723[var8] * 4 + 2 - PlayerType.localPlayer.x / 32;
					var10 = Client.field909[var8] * 4 + 2 - PlayerType.localPlayer.y / 32;
					TileItem.drawSpriteOnMinimap(var1, var2, var9, var10, Client.mapIcons[var8], var4);
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) {
					for (var9 = 0; var9 < 104; ++var9) {
						NodeDeque var15 = Client.groundItems[GrandExchangeOfferUnitPriceComparator.Client_plane][var8][var9];
						if (var15 != null) {
							var11 = var8 * 4 + 2 - PlayerType.localPlayer.x / 32;
							var12 = var9 * 4 + 2 - PlayerType.localPlayer.y / 32;
							TileItem.drawSpriteOnMinimap(var1, var2, var11, var12, Renderable.mapDotSprites[0], var4);
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) {
					NPC var16 = Client.npcs[Client.npcIndices[var8]];
					if (var16 != null && var16.isVisible()) {
						NPCComposition var18 = var16.definition;
						if (var18 != null && var18.transforms != null) {
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) {
							var11 = var16.x / 32 - PlayerType.localPlayer.x / 32;
							var12 = var16.y / 32 - PlayerType.localPlayer.y / 32;
							TileItem.drawSpriteOnMinimap(var1, var2, var11, var12, Renderable.mapDotSprites[1], var4);
						}
					}
				}

				var8 = Players.Players_count;
				int[] var19 = Players.Players_indices;

				for (var10 = 0; var10 < var8; ++var10) {
					Player var17 = Client.players[var19[var10]];
					if (var17 != null && var17.isVisible() && !var17.isHidden && var17 != PlayerType.localPlayer) {
						var12 = var17.x / 32 - PlayerType.localPlayer.x / 32;
						int var13 = var17.y / 32 - PlayerType.localPlayer.y / 32;
						boolean var14 = false;
						if (PlayerType.localPlayer.team != 0 && var17.team != 0 && var17.team == PlayerType.localPlayer.team) {
							var14 = true;
						}

						if (var17.isFriend()) {
							TileItem.drawSpriteOnMinimap(var1, var2, var12, var13, Renderable.mapDotSprites[3], var4);
						} else if (var14) {
							TileItem.drawSpriteOnMinimap(var1, var2, var12, var13, Renderable.mapDotSprites[4], var4);
						} else if (var17.isClanMember()) {
							TileItem.drawSpriteOnMinimap(var1, var2, var12, var13, Renderable.mapDotSprites[5], var4);
						} else {
							TileItem.drawSpriteOnMinimap(var1, var2, var12, var13, Renderable.mapDotSprites[2], var4);
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) {
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) {
						NPC var20 = Client.npcs[Client.hintArrowNpcIndex];
						if (var20 != null) {
							var11 = var20.x / 32 - PlayerType.localPlayer.x / 32;
							var12 = var20.y / 32 - PlayerType.localPlayer.y / 32;
							UrlRequest.worldToMinimap(var1, var2, var11, var12, ScriptEvent.mapMarkerSprites[1], var4);
						}
					}

					if (Client.hintArrowType == 2) {
						var10 = Client.hintArrowX * 4 - FloorDecoration.baseX * 256 + 2 - PlayerType.localPlayer.x / 32;
						var11 = Client.hintArrowY * 4 - WorldMapData_0.baseY * 256 + 2 - PlayerType.localPlayer.y / 32;
						UrlRequest.worldToMinimap(var1, var2, var10, var11, ScriptEvent.mapMarkerSprites[1], var4);
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) {
						Player var21 = Client.players[Client.hintArrowPlayerIndex];
						if (var21 != null) {
							var11 = var21.x / 32 - PlayerType.localPlayer.x / 32;
							var12 = var21.y / 32 - PlayerType.localPlayer.y / 32;
							UrlRequest.worldToMinimap(var1, var2, var11, var12, ScriptEvent.mapMarkerSprites[1], var4);
						}
					}
				}

				if (Client.destinationX != 0) {
					var10 = Client.destinationX * 4 + 2 - PlayerType.localPlayer.x / 32;
					var11 = Client.destinationY * 4 + 2 - PlayerType.localPlayer.y / 32;
					TileItem.drawSpriteOnMinimap(var1, var2, var10, var11, ScriptEvent.mapMarkerSprites[0], var4);
				}

				if (!PlayerType.localPlayer.isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

			Client.field758[var3] = true;
		}
	}
}
