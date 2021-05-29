import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bc")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1262714503
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 382039955
	)
	@Export("x")
	int x;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -377542945
	)
	@Export("y")
	int y;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1913199289
	)
	int field956;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 846164283
	)
	int field957;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Leg;"
	)
	@Export("obj")
	ObjectComposition obj;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 2101998419
	)
	int field958;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 2113426875
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1385478755
	)
	int field961;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lbv;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1819837691
	)
	int field964;
	@ObfuscatedName("o")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1313201795
	)
	int field954;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lbv;"
	)
	@Export("stream2")
	RawPcmStream stream2;

	static {
		objectSounds = new NodeDeque();
	}

	ObjectSound() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "10"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field958 = var2.int4 * 128;
			this.field961 = var2.int5;
			this.field964 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field958 = 0;
			this.field961 = 0;
			this.field964 = 0;
			this.soundEffectIds = null;
		}

		if (var1 != this.soundEffectId && this.stream1 != null) {
			class308.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(Lio;IIII)V",
		garbageValue = "-1477565954"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		HealthBarUpdate.playPcmPlayers();
		SpriteMask var4 = var0.getSpriteMask(false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
			if (Client.minimapState != 2 && Client.minimapState != 5) {
				int var5 = Client.camAngleY & 2047;
				int var6 = class93.localPlayer.x / 32 + 48;
				int var7 = 464 - class93.localPlayer.y / 32;
				GameEngine.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) {
					var16 = Client.mapIconXs[var8] * 4 + 2 - class93.localPlayer.x / 32;
					var10 = Client.mapIconYs[var8] * 4 + 2 - class93.localPlayer.y / 32;
					ObjectComposition.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4);
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) {
					for (var16 = 0; var16 < 104; ++var16) {
						NodeDeque var14 = Client.groundItems[class22.Client_plane][var8][var16];
						if (var14 != null) {
							var11 = var8 * 4 + 2 - class93.localPlayer.x / 32;
							var12 = var16 * 4 + 2 - class93.localPlayer.y / 32;
							ObjectComposition.drawSpriteOnMinimap(var1, var2, var11, var12, class170.mapDotSprites[0], var4);
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
							var11 = var9.x / 32 - class93.localPlayer.x / 32;
							var12 = var9.y / 32 - class93.localPlayer.y / 32;
							ObjectComposition.drawSpriteOnMinimap(var1, var2, var11, var12, class170.mapDotSprites[1], var4);
						}
					}
				}

				var8 = Players.Players_count;
				int[] var17 = Players.Players_indices;

				for (var10 = 0; var10 < var8; ++var10) {
					Player var15 = Client.players[var17[var10]];
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != class93.localPlayer) {
						var12 = var15.x / 32 - class93.localPlayer.x / 32;
						int var13 = var15.y / 32 - class93.localPlayer.y / 32;
						if (var15.isFriend()) {
							ObjectComposition.drawSpriteOnMinimap(var1, var2, var12, var13, class170.mapDotSprites[3], var4);
						} else if (class93.localPlayer.team != 0 && var15.team != 0 && var15.team == class93.localPlayer.team) {
							ObjectComposition.drawSpriteOnMinimap(var1, var2, var12, var13, class170.mapDotSprites[4], var4);
						} else if (var15.isClanMember()) {
							ObjectComposition.drawSpriteOnMinimap(var1, var2, var12, var13, class170.mapDotSprites[5], var4);
						} else if (var15.method2126()) {
							ObjectComposition.drawSpriteOnMinimap(var1, var2, var12, var13, class170.mapDotSprites[6], var4);
						} else {
							ObjectComposition.drawSpriteOnMinimap(var1, var2, var12, var13, class170.mapDotSprites[2], var4);
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) {
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) {
						NPC var19 = Client.npcs[Client.hintArrowNpcIndex];
						if (var19 != null) {
							var11 = var19.x / 32 - class93.localPlayer.x / 32;
							var12 = var19.y / 32 - class93.localPlayer.y / 32;
							MenuAction.worldToMinimap(var1, var2, var11, var12, WorldMapArea.mapMarkerSprites[1], var4);
						}
					}

					if (Client.hintArrowType == 2) {
						var10 = Client.hintArrowX * 4 - VertexNormal.baseX * 256 + 2 - class93.localPlayer.x / 32;
						var11 = Client.hintArrowY * 4 - SoundSystem.baseY * 256 + 2 - class93.localPlayer.y / 32;
						MenuAction.worldToMinimap(var1, var2, var10, var11, WorldMapArea.mapMarkerSprites[1], var4);
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) {
						Player var20 = Client.players[Client.hintArrowPlayerIndex];
						if (var20 != null) {
							var11 = var20.x / 32 - class93.localPlayer.x / 32;
							var12 = var20.y / 32 - class93.localPlayer.y / 32;
							MenuAction.worldToMinimap(var1, var2, var11, var12, WorldMapArea.mapMarkerSprites[1], var4);
						}
					}
				}

				if (Client.destinationX != 0) {
					var10 = Client.destinationX * 4 + 2 - class93.localPlayer.x / 32;
					var11 = Client.destinationY * 4 + 2 - class93.localPlayer.y / 32;
					ObjectComposition.drawSpriteOnMinimap(var1, var2, var10, var11, WorldMapArea.mapMarkerSprites[0], var4);
				}

				if (!class93.localPlayer.isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

			Client.field780[var3] = true;
		}
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1750320042"
	)
	static void method1761() {
		if (UserComparator3.field1444 != null) {
			Client.field717 = Client.cycle;
			UserComparator3.field1444.method5126();

			for (int var0 = 0; var0 < Client.players.length; ++var0) {
				if (Client.players[var0] != null) {
					UserComparator3.field1444.method5117(VertexNormal.baseX * 64 + (Client.players[var0].x >> 7), SoundSystem.baseY * 64 + (Client.players[var0].y >> 7));
				}
			}
		}

	}
}
