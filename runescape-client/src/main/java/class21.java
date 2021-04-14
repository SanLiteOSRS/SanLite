import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("i")
public class class21 extends class14 {
	@ObfuscatedName("g")
	@Export("ItemDefinition_inMembersWorld")
	static boolean ItemDefinition_inMembersWorld;
	@ObfuscatedName("al")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1121111403
	)
	int field168;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1047872621
	)
	int field166;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -52117445
	)
	int field167;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1660368165
	)
	int field165;
	// $FF: synthetic field
	@ObfuscatedSignature(
		signature = "Lu;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		signature = "(Lu;)V"
	)
	class21(class2 var1) {
		this.this$0 = var1;
		this.field168 = -1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "-1383981708"
	)
	void vmethod371(Buffer var1) {
		this.field168 = var1.readUnsignedShort();
		this.field166 = var1.readInt();
		this.field167 = var1.readUnsignedByte();
		this.field165 = var1.readUnsignedByte();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lm;I)V",
		garbageValue = "-1475503816"
	)
	void vmethod376(class11 var1) {
		var1.method154(this.field168, this.field166, this.field167, this.field165);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/CharSequence;IZB)Z",
		garbageValue = "18"
	)
	static boolean method316(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var3 = false;
			boolean var4 = false;
			int var5 = 0;
			int var6 = var0.length();

			for (int var7 = 0; var7 < var6; ++var7) {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (var8 == '-') {
						var3 = true;
						continue;
					}

					if (var8 == '+') {
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') {
						return false;
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) {
					return false;
				}

				if (var3) {
					var10 = -var10;
				}

				int var9 = var10 + var5 * var1;
				if (var9 / var1 != var5) {
					return false;
				}

				var5 = var9;
				var4 = true;
			}

			return var4;
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		signature = "(Lhu;IIIB)V",
		garbageValue = "-25"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		BoundaryObject.playPcmPlayers();
		SpriteMask var4 = var0.getSpriteMask(false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
			if (Client.minimapState != 2 && Client.minimapState != 5) {
				int var5 = Client.camAngleY & 2047;
				int var6 = Varcs.localPlayer.x / 32 + 48;
				int var7 = 464 - Varcs.localPlayer.y / 32;
				class19.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);

				int var8;
				int var9;
				int var10;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) {
					var9 = Client.field835[var8] * 4 + 2 - Varcs.localPlayer.x / 32;
					var10 = Client.field836[var8] * 4 + 2 - Varcs.localPlayer.y / 32;
					WorldMapCacheName.drawSpriteOnMinimap(var1, var2, var9, var10, Client.mapIcons[var8], var4);
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) {
					for (var9 = 0; var9 < 104; ++var9) {
						NodeDeque var15 = Client.groundItems[class26.Client_plane][var8][var9];
						if (var15 != null) {
							var11 = var8 * 4 + 2 - Varcs.localPlayer.x / 32;
							var12 = var9 * 4 + 2 - Varcs.localPlayer.y / 32;
							WorldMapCacheName.drawSpriteOnMinimap(var1, var2, var11, var12, class244.mapDotSprites[0], var4);
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
							var11 = var16.x / 32 - Varcs.localPlayer.x / 32;
							var12 = var16.y / 32 - Varcs.localPlayer.y / 32;
							WorldMapCacheName.drawSpriteOnMinimap(var1, var2, var11, var12, class244.mapDotSprites[1], var4);
						}
					}
				}

				var8 = Players.Players_count;
				int[] var19 = Players.Players_indices;

				for (var10 = 0; var10 < var8; ++var10) {
					Player var17 = Client.players[var19[var10]];
					if (var17 != null && var17.isVisible() && !var17.isHidden && var17 != Varcs.localPlayer) {
						var12 = var17.x / 32 - Varcs.localPlayer.x / 32;
						int var13 = var17.y / 32 - Varcs.localPlayer.y / 32;
						boolean var14 = false;
						if (Varcs.localPlayer.team != 0 && var17.team != 0 && var17.team == Varcs.localPlayer.team) {
							var14 = true;
						}

						if (var17.isFriend()) {
							WorldMapCacheName.drawSpriteOnMinimap(var1, var2, var12, var13, class244.mapDotSprites[3], var4);
						} else if (var14) {
							WorldMapCacheName.drawSpriteOnMinimap(var1, var2, var12, var13, class244.mapDotSprites[4], var4);
						} else if (var17.isClanMember()) {
							WorldMapCacheName.drawSpriteOnMinimap(var1, var2, var12, var13, class244.mapDotSprites[5], var4);
						} else {
							WorldMapCacheName.drawSpriteOnMinimap(var1, var2, var12, var13, class244.mapDotSprites[2], var4);
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) {
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) {
						NPC var20 = Client.npcs[Client.hintArrowNpcIndex];
						if (var20 != null) {
							var11 = var20.x / 32 - Varcs.localPlayer.x / 32;
							var12 = var20.y / 32 - Varcs.localPlayer.y / 32;
							class371.worldToMinimap(var1, var2, var11, var12, class14.mapMarkerSprites[1], var4);
						}
					}

					if (Client.hintArrowType == 2) {
						var10 = Client.hintArrowX * 4 - ItemLayer.baseX * 256 + 2 - Varcs.localPlayer.x / 32;
						var11 = Client.hintArrowY * 4 - Tile.baseY * 256 + 2 - Varcs.localPlayer.y / 32;
						class371.worldToMinimap(var1, var2, var10, var11, class14.mapMarkerSprites[1], var4);
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) {
						Player var21 = Client.players[Client.hintArrowPlayerIndex];
						if (var21 != null) {
							var11 = var21.x / 32 - Varcs.localPlayer.x / 32;
							var12 = var21.y / 32 - Varcs.localPlayer.y / 32;
							class371.worldToMinimap(var1, var2, var11, var12, class14.mapMarkerSprites[1], var4);
						}
					}
				}

				if (Client.destinationX != 0) {
					var10 = Client.destinationX * 4 + 2 - Varcs.localPlayer.x / 32;
					var11 = Client.destinationY * 4 + 2 - Varcs.localPlayer.y / 32;
					WorldMapCacheName.drawSpriteOnMinimap(var1, var2, var10, var11, class14.mapMarkerSprites[0], var4);
				}

				if (!Varcs.localPlayer.isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

			Client.field812[var3] = true;
		}
	}
}
