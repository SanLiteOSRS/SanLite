import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("FloorOverlayDefinition_cached")
	static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -296019843
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1822468251
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("j")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1818252281
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 237098067
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1367639577
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1127074157
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1492871957
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 422172471
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 724805775
	)
	@Export("secondaryLightness")
	public int secondaryLightness;

	static {
		FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	FloorOverlayDefinition() {
		this.primaryRgb = 0;
		this.texture = -1;
		this.hideUnderlay = true;
		this.secondaryRgb = -1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1526666702"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.secondaryRgb != -1) {
			this.setHsl(this.secondaryRgb);
			this.secondaryHue = this.hue;
			this.secondarySaturation = this.saturation;
			this.secondaryLightness = this.lightness;
		}

		this.setHsl(this.primaryRgb);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnt;IB)V",
		garbageValue = "6"
	)
	@Export("decode")
	void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.decodeNext(var1, var3, var2);
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lnt;III)V",
		garbageValue = "-608043176"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) {
			this.primaryRgb = var1.readMedium();
		} else if (var2 == 2) {
			this.texture = var1.readUnsignedByte();
		} else if (var2 == 5) {
			this.hideUnderlay = false;
		} else if (var2 == 7) {
			this.secondaryRgb = var1.readMedium();
		} else if (var2 == 8) {
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2117241812"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D;
		double var4 = (double)(var1 >> 8 & 255) / 256.0D;
		double var6 = (double)(var1 & 255) / 256.0D;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}

		if (var6 < var8) {
			var8 = var6;
		}

		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}

		if (var6 > var10) {
			var10 = var6;
		}

		double var12 = 0.0D;
		double var14 = 0.0D;
		double var16 = (var10 + var8) / 2.0D;
		if (var10 != var8) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var10 + var8);
			}

			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) {
				var12 = 2.0D + (var6 - var2) / (var10 - var8);
			} else if (var10 == var6) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D;
			}
		}

		var12 /= 6.0D;
		this.hue = (int)(var12 * 256.0D);
		this.saturation = (int)(var14 * 256.0D);
		this.lightness = (int)(256.0D * var16);
		if (this.saturation < 0) {
			this.saturation = 0;
		} else if (this.saturation > 255) {
			this.saturation = 255;
		}

		if (this.lightness < 0) {
			this.lightness = 0;
		} else if (this.lightness > 255) {
			this.lightness = 255;
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1165486698"
	)
	static final void method3168() {
		Object var10000 = null;
		String var0 = "You can't add yourself to your own friend list";
		UserComparator10.addGameMessage(30, "", var0);
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(Liv;IIIB)V",
		garbageValue = "-1"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		class233.playPcmPlayers();
		SpriteMask var4 = var0.getSpriteMask(false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
			if (Client.minimapState != 2 && Client.minimapState != 5) {
				int var5 = Client.camAngleY & 2047;
				int var6 = class262.localPlayer.x / 32 + 48;
				int var7 = 464 - class262.localPlayer.y / 32;
				class69.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) {
					var16 = Client.mapIconXs[var8] * 4 + 2 - class262.localPlayer.x / 32;
					var10 = Client.mapIconYs[var8] * 4 + 2 - class262.localPlayer.y / 32;
					class32.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4);
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) {
					for (var16 = 0; var16 < 104; ++var16) {
						NodeDeque var14 = Client.groundItems[SoundSystem.Client_plane][var8][var16];
						if (var14 != null) {
							var11 = var8 * 4 + 2 - class262.localPlayer.x / 32;
							var12 = var16 * 4 + 2 - class262.localPlayer.y / 32;
							class32.drawSpriteOnMinimap(var1, var2, var11, var12, class171.mapDotSprites[0], var4);
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) {
					NPC var9 = Client.npcs[Client.npcIndices[var8]];
					if (var9 != null && var9.isVisible()) {
						NPCComposition var18 = var9.definition;
						if (var18 != null && var18.transforms != null) {
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) {
							var11 = var9.x / 32 - class262.localPlayer.x / 32;
							var12 = var9.y / 32 - class262.localPlayer.y / 32;
							class32.drawSpriteOnMinimap(var1, var2, var11, var12, class171.mapDotSprites[1], var4);
						}
					}
				}

				var8 = Players.Players_count;
				int[] var17 = Players.Players_indices;

				for (var10 = 0; var10 < var8; ++var10) {
					Player var15 = Client.players[var17[var10]];
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != class262.localPlayer) {
						var12 = var15.x / 32 - class262.localPlayer.x / 32;
						int var13 = var15.y / 32 - class262.localPlayer.y / 32;
						if (var15.isFriend()) {
							class32.drawSpriteOnMinimap(var1, var2, var12, var13, class171.mapDotSprites[3], var4);
						} else if (class262.localPlayer.team != 0 && var15.team != 0 && var15.team == class262.localPlayer.team) {
							class32.drawSpriteOnMinimap(var1, var2, var12, var13, class171.mapDotSprites[4], var4);
						} else if (var15.isFriendsChatMember()) {
							class32.drawSpriteOnMinimap(var1, var2, var12, var13, class171.mapDotSprites[5], var4);
						} else if (var15.isClanMember()) {
							class32.drawSpriteOnMinimap(var1, var2, var12, var13, class171.mapDotSprites[6], var4);
						} else {
							class32.drawSpriteOnMinimap(var1, var2, var12, var13, class171.mapDotSprites[2], var4);
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) {
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) {
						NPC var19 = Client.npcs[Client.hintArrowNpcIndex];
						if (var19 != null) {
							var11 = var19.x / 32 - class262.localPlayer.x / 32;
							var12 = var19.y / 32 - class262.localPlayer.y / 32;
							SoundSystem.worldToMinimap(var1, var2, var11, var12, BuddyRankComparator.mapMarkerSprites[1], var4);
						}
					}

					if (Client.hintArrowType == 2) {
						var10 = Client.hintArrowX * 4 - class15.baseX * 256 + 2 - class262.localPlayer.x / 32;
						var11 = Client.hintArrowY * 4 - WorldMapSprite.baseY * 256 + 2 - class262.localPlayer.y / 32;
						SoundSystem.worldToMinimap(var1, var2, var10, var11, BuddyRankComparator.mapMarkerSprites[1], var4);
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) {
						Player var20 = Client.players[Client.hintArrowPlayerIndex];
						if (var20 != null) {
							var11 = var20.x / 32 - class262.localPlayer.x / 32;
							var12 = var20.y / 32 - class262.localPlayer.y / 32;
							SoundSystem.worldToMinimap(var1, var2, var11, var12, BuddyRankComparator.mapMarkerSprites[1], var4);
						}
					}
				}

				if (Client.destinationX != 0) {
					var10 = Client.destinationX * 4 + 2 - class262.localPlayer.x / 32;
					var11 = Client.destinationY * 4 + 2 - class262.localPlayer.y / 32;
					class32.drawSpriteOnMinimap(var1, var2, var10, var11, BuddyRankComparator.mapMarkerSprites[0], var4);
				}

				if (!class262.localPlayer.isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

			Client.field712[var3] = true;
		}
	}
}
