import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
@Implements("Decimator")
public class Decimator {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ltm;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2102737717
	)
	@Export("inputRate")
	int inputRate;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -265498811
	)
	@Export("outputRate")
	int outputRate;
	@ObfuscatedName("ap")
	@Export("table")
	int[][] table;

	public Decimator(int var1, int var2) {
		if (var2 != var1) { // L: 14
			int var4 = var1; // L: 16
			int var5 = var2; // L: 17
			if (var2 > var1) { // L: 19
				var4 = var2; // L: 21
				var5 = var1;
			}

			while (var5 != 0) { // L: 24
				int var6 = var4 % var5; // L: 25
				var4 = var5; // L: 26
				var5 = var6; // L: 27
			}

			var1 /= var4; // L: 32
			var2 /= var4; // L: 33
			this.inputRate = var1; // L: 34
			this.outputRate = var2; // L: 35
			this.table = new int[var1][14]; // L: 36

			for (int var7 = 0; var7 < var1; ++var7) { // L: 37
				int[] var8 = this.table[var7]; // L: 38
				double var9 = (double)var7 / (double)var1 + 6.0D; // L: 39
				int var11 = (int)Math.floor(1.0D + (var9 - 7.0D)); // L: 40
				if (var11 < 0) { // L: 41
					var11 = 0;
				}

				int var12 = (int)Math.ceil(var9 + 7.0D); // L: 42
				if (var12 > 14) { // L: 43
					var12 = 14;
				}

				for (double var13 = (double)var2 / (double)var1; var11 < var12; ++var11) { // L: 44 45
					double var15 = ((double)var11 - var9) * 3.141592653589793D; // L: 46
					double var17 = var13; // L: 47
					if (var15 < -1.0E-4D || var15 > 1.0E-4D) {
						var17 = var13 * (Math.sin(var15) / var15);
					}

					var17 *= 0.54D + 0.46D * Math.cos(((double)var11 - var9) * 0.2243994752564138D); // L: 49
					var8[var11] = (int)Math.floor(0.5D + 65536.0D * var17); // L: 50
				}
			}

		}
	} // L: 53

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "-1120461861"
	)
	@Export("resample")
	byte[] resample(byte[] var1) {
		if (this.table != null) { // L: 56
			int var2 = (int)((long)var1.length * (long)this.outputRate / (long)this.inputRate) + 14; // L: 57
			int[] var3 = new int[var2]; // L: 58
			int var4 = 0; // L: 59
			int var5 = 0; // L: 60

			int var6;
			for (var6 = 0; var6 < var1.length; ++var6) { // L: 61
				byte var7 = var1[var6]; // L: 62
				int[] var8 = this.table[var5]; // L: 63

				int var9;
				for (var9 = 0; var9 < 14; ++var9) { // L: 64
					var3[var4 + var9] += var7 * var8[var9];
				}

				var5 += this.outputRate; // L: 65
				var9 = var5 / this.inputRate; // L: 66
				var4 += var9; // L: 67
				var5 -= var9 * this.inputRate; // L: 68
			}

			var1 = new byte[var2]; // L: 70

			for (var6 = 0; var6 < var2; ++var6) { // L: 71
				int var10 = var3[var6] + 32768 >> 16; // L: 72
				if (var10 < -128) { // L: 73
					var1[var6] = -128;
				} else if (var10 > 127) { // L: 74
					var1[var6] = 127;
				} else {
					var1[var6] = (byte)var10; // L: 75
				}
			}
		}

		return var1; // L: 78
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-32"
	)
	@Export("scaleRate")
	int scaleRate(int var1) {
		if (this.table != null) {
			var1 = (int)((long)var1 * (long)this.outputRate / (long)this.inputRate); // L: 82
		}

		return var1; // L: 83
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "90354327"
	)
	@Export("scalePosition")
	int scalePosition(int var1) {
		if (this.table != null) { // L: 87
			var1 = (int)((long)var1 * (long)this.outputRate / (long)this.inputRate) + 6;
		}

		return var1; // L: 88
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Llp;",
		garbageValue = "860811438"
	)
	static LoginPacket[] method1086() {
		return new LoginPacket[]{LoginPacket.field3345, LoginPacket.field3342, LoginPacket.field3343, LoginPacket.field3346, LoginPacket.field3347, LoginPacket.field3344}; // L: 22
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "2040533931"
	)
	static final boolean method1091(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-'; // L: 48
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "2142390934"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) { // L: 5781
			int var3 = Renderable.getTileHeight(var0, var1, Clock.Client_plane) - var2; // L: 5786
			var0 -= class208.cameraX; // L: 5787
			var3 -= class152.cameraY; // L: 5788
			var1 -= ByteArrayPool.cameraZ; // L: 5789
			int var4 = Rasterizer3D.Rasterizer3D_sine[MusicPatchNode.cameraPitch]; // L: 5790
			int var5 = Rasterizer3D.Rasterizer3D_cosine[MusicPatchNode.cameraPitch]; // L: 5791
			int var6 = Rasterizer3D.Rasterizer3D_sine[class291.cameraYaw]; // L: 5792
			int var7 = Rasterizer3D.Rasterizer3D_cosine[class291.cameraYaw]; // L: 5793
			int var8 = var0 * var7 + var6 * var1 >> 16; // L: 5794
			var1 = var7 * var1 - var0 * var6 >> 16; // L: 5795
			var0 = var8; // L: 5796
			var8 = var5 * var3 - var4 * var1 >> 16; // L: 5797
			var1 = var4 * var3 + var5 * var1 >> 16; // L: 5798
			if (var1 >= 50) { // L: 5800
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2; // L: 5801
				Client.viewportTempY = Client.viewportHeight / 2 + var8 * Client.viewportZoom / var1; // L: 5802
			} else {
				Client.viewportTempX = -1; // L: 5805
				Client.viewportTempY = -1; // L: 5806
			}

		} else {
			Client.viewportTempX = -1; // L: 5782
			Client.viewportTempY = -1; // L: 5783
		}
	} // L: 5784 5808

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "(Lmb;IIIB)V",
		garbageValue = "-12"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		WorldMapSectionType.playPcmPlayers(); // L: 12417
		SpriteMask var4 = var0.getSpriteMask(false); // L: 12418
		if (var4 != null) { // L: 12419
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height); // L: 12420
			if (Client.minimapState != 2 && Client.minimapState != 5) { // L: 12421
				int var5 = Client.camAngleY & 2047; // L: 12422
				int var6 = Projectile.localPlayer.x / 32 + 48; // L: 12423
				int var7 = 464 - Projectile.localPlayer.y / 32; // L: 12424
				class33.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths); // L: 12425

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) { // L: 12426
					var16 = Client.mapIconXs[var8] * 4 + 2 - Projectile.localPlayer.x / 32; // L: 12427
					var10 = Client.mapIconYs[var8] * 4 + 2 - Projectile.localPlayer.y / 32; // L: 12428
					class59.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4); // L: 12429
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) { // L: 12431
					for (var16 = 0; var16 < 104; ++var16) { // L: 12432
						NodeDeque var14 = Client.groundItems[Clock.Client_plane][var8][var16]; // L: 12433
						if (var14 != null) { // L: 12434
							var11 = var8 * 4 + 2 - Projectile.localPlayer.x / 32; // L: 12435
							var12 = var16 * 4 + 2 - Projectile.localPlayer.y / 32; // L: 12436
							class59.drawSpriteOnMinimap(var1, var2, var11, var12, class19.mapDotSprites[0], var4); // L: 12437
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) { // L: 12441
					NPC var9 = Client.npcs[Client.npcIndices[var8]]; // L: 12442
					if (var9 != null && var9.isVisible()) { // L: 12443
						NPCComposition var18 = var9.definition; // L: 12444
						if (var18 != null && var18.transforms != null) { // L: 12445
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) { // L: 12446
							var11 = var9.x / 32 - Projectile.localPlayer.x / 32; // L: 12447
							var12 = var9.y / 32 - Projectile.localPlayer.y / 32; // L: 12448
							class59.drawSpriteOnMinimap(var1, var2, var11, var12, class19.mapDotSprites[1], var4); // L: 12449
						}
					}
				}

				var8 = Players.Players_count; // L: 12453
				int[] var17 = Players.Players_indices; // L: 12454

				for (var10 = 0; var10 < var8; ++var10) { // L: 12455
					Player var15 = Client.players[var17[var10]]; // L: 12456
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != Projectile.localPlayer) { // L: 12457
						var12 = var15.x / 32 - Projectile.localPlayer.x / 32; // L: 12458
						int var13 = var15.y / 32 - Projectile.localPlayer.y / 32; // L: 12459
						if (var15.isFriend()) { // L: 12460
							class59.drawSpriteOnMinimap(var1, var2, var12, var13, class19.mapDotSprites[3], var4);
						} else if (Projectile.localPlayer.team != 0 && var15.team != 0 && var15.team == Projectile.localPlayer.team) { // L: 12461
							class59.drawSpriteOnMinimap(var1, var2, var12, var13, class19.mapDotSprites[4], var4);
						} else if (var15.isFriendsChatMember()) { // L: 12462
							class59.drawSpriteOnMinimap(var1, var2, var12, var13, class19.mapDotSprites[5], var4);
						} else if (var15.isClanMember()) { // L: 12463
							class59.drawSpriteOnMinimap(var1, var2, var12, var13, class19.mapDotSprites[6], var4);
						} else {
							class59.drawSpriteOnMinimap(var1, var2, var12, var13, class19.mapDotSprites[2], var4); // L: 12464
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) { // L: 12467
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) { // L: 12468
						NPC var19 = Client.npcs[Client.hintArrowNpcIndex]; // L: 12469
						if (var19 != null) { // L: 12470
							var11 = var19.x / 32 - Projectile.localPlayer.x / 32; // L: 12471
							var12 = var19.y / 32 - Projectile.localPlayer.y / 32; // L: 12472
							class136.worldToMinimap(var1, var2, var11, var12, LoginScreenAnimation.mapMarkerSprites[1], var4); // L: 12473
						}
					}

					if (Client.hintArrowType == 2) { // L: 12476
						var10 = Client.field527 * 4 - class213.baseX * 256 + 2 - Projectile.localPlayer.x / 32; // L: 12477
						var11 = Client.field697 * 4 - class101.baseY * 256 + 2 - Projectile.localPlayer.y / 32; // L: 12478
						class136.worldToMinimap(var1, var2, var10, var11, LoginScreenAnimation.mapMarkerSprites[1], var4); // L: 12479
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) { // L: 12481
						Player var20 = Client.players[Client.hintArrowPlayerIndex]; // L: 12482
						if (var20 != null) { // L: 12483
							var11 = var20.x / 32 - Projectile.localPlayer.x / 32; // L: 12484
							var12 = var20.y / 32 - Projectile.localPlayer.y / 32; // L: 12485
							class136.worldToMinimap(var1, var2, var11, var12, LoginScreenAnimation.mapMarkerSprites[1], var4); // L: 12486
						}
					}
				}

				if (Client.destinationX != 0) { // L: 12490
					var10 = Client.destinationX * 4 + 2 - Projectile.localPlayer.x / 32; // L: 12491
					var11 = Client.destinationY * 4 + 2 - Projectile.localPlayer.y / 32; // L: 12492
					class59.drawSpriteOnMinimap(var1, var2, var10, var11, LoginScreenAnimation.mapMarkerSprites[0], var4); // L: 12493
				}

				if (!Projectile.localPlayer.isHidden) { // L: 12495
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 12497
			}

			Client.field724[var3] = true; // L: 12498
		}
	} // L: 12499
}
