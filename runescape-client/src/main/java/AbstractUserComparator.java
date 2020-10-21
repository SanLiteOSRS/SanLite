import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
@Implements("AbstractUserComparator")
public abstract class AbstractUserComparator implements Comparator {
	@ObfuscatedName("gd")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;
	@ObfuscatedName("k")
	@Export("nextComparator")
	Comparator nextComparator;

	protected AbstractUserComparator() {
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(Ljava/util/Comparator;B)V",
		garbageValue = "-9"
	)
	@Export("addComparator")
	final void addComparator(Comparator var1) {
		if (this.nextComparator == null) {
			this.nextComparator = var1;
		} else if (this.nextComparator instanceof AbstractUserComparator) {
			((AbstractUserComparator)this.nextComparator).addComparator(var1);
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(Ljc;Ljc;I)I",
		garbageValue = "1339061941"
	)
	@Export("compareUser")
	protected final int compareUser(Nameable var1, Nameable var2) {
		return this.nextComparator == null ? 0 : this.nextComparator.compare(var1, var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(Lic;III)Llp;",
		garbageValue = "-2098090850"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2);
		boolean var3;
		if (var4 == null) {
			var3 = false;
		} else {
			Occluder.SpriteBuffer_decode(var4);
			var3 = true;
		}

		return !var3 ? null : AttackOption.method2155();
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		signature = "(Lhq;IIII)V",
		garbageValue = "-1377715845"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		RouteStrategy.playPcmPlayers();
		SpriteMask var4 = var0.getSpriteMask(false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
			if (Client.minimapState != 2 && Client.minimapState != 5) {
				int var5 = Client.camAngleY & 2047;
				int var6 = WorldMapLabelSize.localPlayer.x / 32 + 48;
				int var7 = 464 - WorldMapLabelSize.localPlayer.y / 32;
				ApproximateRouteStrategy.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);

				int var8;
				int var9;
				int var10;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) {
					var9 = Client.mapIconXs[var8] * 4 + 2 - WorldMapLabelSize.localPlayer.x / 32;
					var10 = Client.mapIconYs[var8] * 4 + 2 - WorldMapLabelSize.localPlayer.y / 32;
					HealthBar.drawSpriteOnMinimap(var1, var2, var9, var10, Client.mapIcons[var8], var4);
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) {
					for (var9 = 0; var9 < 104; ++var9) {
						NodeDeque var15 = Client.groundItems[Huffman.Client_plane][var8][var9];
						if (var15 != null) {
							var11 = var8 * 4 + 2 - WorldMapLabelSize.localPlayer.x / 32;
							var12 = var9 * 4 + 2 - WorldMapLabelSize.localPlayer.y / 32;
							HealthBar.drawSpriteOnMinimap(var1, var2, var11, var12, class235.mapDotSprites[0], var4);
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
							var11 = var16.x / 32 - WorldMapLabelSize.localPlayer.x / 32;
							var12 = var16.y / 32 - WorldMapLabelSize.localPlayer.y / 32;
							HealthBar.drawSpriteOnMinimap(var1, var2, var11, var12, class235.mapDotSprites[1], var4);
						}
					}
				}

				var8 = Players.Players_count;
				int[] var19 = Players.Players_indices;

				for (var10 = 0; var10 < var8; ++var10) {
					Player var17 = Client.players[var19[var10]];
					if (var17 != null && var17.isVisible() && !var17.isHidden && var17 != WorldMapLabelSize.localPlayer) {
						var12 = var17.x / 32 - WorldMapLabelSize.localPlayer.x / 32;
						int var13 = var17.y / 32 - WorldMapLabelSize.localPlayer.y / 32;
						boolean var14 = false;
						if (WorldMapLabelSize.localPlayer.team != 0 && var17.team != 0 && var17.team == WorldMapLabelSize.localPlayer.team) {
							var14 = true;
						}

						if (var17.isFriend()) {
							HealthBar.drawSpriteOnMinimap(var1, var2, var12, var13, class235.mapDotSprites[3], var4);
						} else if (var14) {
							HealthBar.drawSpriteOnMinimap(var1, var2, var12, var13, class235.mapDotSprites[4], var4);
						} else if (var17.isClanMember()) {
							HealthBar.drawSpriteOnMinimap(var1, var2, var12, var13, class235.mapDotSprites[5], var4);
						} else {
							HealthBar.drawSpriteOnMinimap(var1, var2, var12, var13, class235.mapDotSprites[2], var4);
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) {
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) {
						NPC var20 = Client.npcs[Client.hintArrowNpcIndex];
						if (var20 != null) {
							var11 = var20.x / 32 - WorldMapLabelSize.localPlayer.x / 32;
							var12 = var20.y / 32 - WorldMapLabelSize.localPlayer.y / 32;
							Coord.worldToMinimap(var1, var2, var11, var12, VarbitComposition.mapMarkerSprites[1], var4);
						}
					}

					if (Client.hintArrowType == 2) {
						var10 = Client.hintArrowX * 4 - WorldMapManager.baseX * 256 + 2 - WorldMapLabelSize.localPlayer.x / 32;
						var11 = Client.hintArrowY * 4 - WorldMapLabel.baseY * 256 + 2 - WorldMapLabelSize.localPlayer.y / 32;
						Coord.worldToMinimap(var1, var2, var10, var11, VarbitComposition.mapMarkerSprites[1], var4);
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) {
						Player var21 = Client.players[Client.hintArrowPlayerIndex];
						if (var21 != null) {
							var11 = var21.x / 32 - WorldMapLabelSize.localPlayer.x / 32;
							var12 = var21.y / 32 - WorldMapLabelSize.localPlayer.y / 32;
							Coord.worldToMinimap(var1, var2, var11, var12, VarbitComposition.mapMarkerSprites[1], var4);
						}
					}
				}

				if (Client.destinationX != 0) {
					var10 = Client.destinationX * 4 + 2 - WorldMapLabelSize.localPlayer.x / 32;
					var11 = Client.destinationY * 4 + 2 - WorldMapLabelSize.localPlayer.y / 32;
					HealthBar.drawSpriteOnMinimap(var1, var2, var10, var11, VarbitComposition.mapMarkerSprites[0], var4);
				}

				if (!WorldMapLabelSize.localPlayer.isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

			Client.field883[var3] = true;
		}
	}
}
