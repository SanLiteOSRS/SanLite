import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("ay")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("an")
	@Export("lock")
	Object lock;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1373907841
	)
	@Export("index")
	int index;
	@ObfuscatedName("ab")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("at")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("ax")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true; // L: 7
		this.lock = new Object(); // L: 8
		this.index = 0; // L: 9
		this.xs = new int[500]; // L: 10
		this.ys = new int[500]; // L: 11
		this.millis = new long[500]; // L: 12
	} // L: 14

	public void run() {
		for (; this.isRunning; VarpDefinition.method3559(50L)) { // L: 18 27
			synchronized(this.lock) { // L: 19
				if (this.index < 500) { // L: 20
					this.xs[this.index] = MouseHandler.MouseHandler_x; // L: 21
					this.ys[this.index] = MouseHandler.MouseHandler_y; // L: 22
					this.millis[this.index] = MouseHandler.MouseHandler_millis;
					++this.index;
				}
			}
		}

	} // L: 29

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[Llk;",
		garbageValue = "-775832559"
	)
	public static ServerPacket[] method2254() {
		return new ServerPacket[]{ServerPacket.field3262, ServerPacket.field3223, ServerPacket.field3258, ServerPacket.field3225, ServerPacket.field3226, ServerPacket.field3227, ServerPacket.field3304, ServerPacket.field3256, ServerPacket.field3230, ServerPacket.field3231, ServerPacket.field3232, ServerPacket.field3233, ServerPacket.field3286, ServerPacket.field3222, ServerPacket.field3303, ServerPacket.field3237, ServerPacket.field3238, ServerPacket.field3247, ServerPacket.field3306, ServerPacket.field3241, ServerPacket.field3242, ServerPacket.field3264, ServerPacket.field3235, ServerPacket.field3245, ServerPacket.field3246, ServerPacket.field3271, ServerPacket.field3248, ServerPacket.field3249, ServerPacket.field3299, ServerPacket.field3251, ServerPacket.field3267, ServerPacket.field3253, ServerPacket.field3254, ServerPacket.field3255, ServerPacket.field3340, ServerPacket.field3287, ServerPacket.field3282, ServerPacket.field3243, ServerPacket.field3260, ServerPacket.field3261, ServerPacket.field3276, ServerPacket.field3263, ServerPacket.field3336, ServerPacket.field3265, ServerPacket.field3301, ServerPacket.field3224, ServerPacket.field3268, ServerPacket.field3266, ServerPacket.field3270, ServerPacket.field3272, ServerPacket.field3281, ServerPacket.field3273, ServerPacket.field3274, ServerPacket.field3234, ServerPacket.field3229, ServerPacket.field3277, ServerPacket.field3278, ServerPacket.field3257, ServerPacket.field3280, ServerPacket.field3250, ServerPacket.field3320, ServerPacket.field3283, ServerPacket.field3284, ServerPacket.field3244, ServerPacket.field3252, ServerPacket.field3269, ServerPacket.field3288, ServerPacket.field3289, ServerPacket.field3290, ServerPacket.field3291, ServerPacket.field3292, ServerPacket.field3293, ServerPacket.field3294, ServerPacket.field3295, ServerPacket.field3296, ServerPacket.field3236, ServerPacket.field3298, ServerPacket.field3323, ServerPacket.field3300, ServerPacket.field3228, ServerPacket.field3259, ServerPacket.field3315, ServerPacket.field3240, ServerPacket.field3305, ServerPacket.field3297, ServerPacket.field3307, ServerPacket.field3308, ServerPacket.field3309, ServerPacket.field3275, ServerPacket.field3311, ServerPacket.field3312, ServerPacket.field3313, ServerPacket.field3314, ServerPacket.field3310, ServerPacket.field3316, ServerPacket.field3317, ServerPacket.field3318, ServerPacket.field3319, ServerPacket.field3338, ServerPacket.field3321, ServerPacket.field3322, ServerPacket.field3302, ServerPacket.field3324, ServerPacket.field3325, ServerPacket.field3326, ServerPacket.field3327, ServerPacket.field3328, ServerPacket.field3329, ServerPacket.field3330, ServerPacket.field3331, ServerPacket.field3332, ServerPacket.field3333, ServerPacket.field3334, ServerPacket.field3335, ServerPacket.field3239, ServerPacket.field3337, ServerPacket.field3285, ServerPacket.field3339}; // L: 127
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lni;IIB)[Lty;",
		garbageValue = "20"
	)
	public static IndexedSprite[] method2253(AbstractArchive var0, int var1, int var2) {
		return !WorldMapAreaData.method5599(var0, var1, var2) ? null : HorizontalAlignment.method3665(); // L: 23 24
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([BIILih;[Lir;I)V",
		garbageValue = "280956473"
	)
	static final void method2250(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
		Buffer var5 = new Buffer(var0); // L: 254
		int var6 = -1; // L: 255

		while (true) {
			int var7 = var5.method8981(); // L: 257
			if (var7 == 0) { // L: 258
				return; // L: 282
			}

			var6 += var7; // L: 259
			int var8 = 0; // L: 260

			while (true) {
				int var9 = var5.readUShortSmart(); // L: 262
				if (var9 == 0) { // L: 263
					break;
				}

				var8 += var9 - 1; // L: 264
				int var10 = var8 & 63; // L: 265
				int var11 = var8 >> 6 & 63; // L: 266
				int var12 = var8 >> 12; // L: 267
				int var13 = var5.readUnsignedByte(); // L: 268
				int var14 = var13 >> 2; // L: 269
				int var15 = var13 & 3; // L: 270
				int var16 = var11 + var1; // L: 271
				int var17 = var10 + var2; // L: 272
				if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) { // L: 273
					int var18 = var12; // L: 274
					if ((Tiles.Tiles_renderFlags[1][var16][var17] & 2) == 2) { // L: 275
						var18 = var12 - 1;
					}

					CollisionMap var19 = null; // L: 276
					if (var18 >= 0) { // L: 277
						var19 = var4[var18];
					}

					SecureRandomCallable.addObjects(var12, var16, var17, var6, var15, var14, var3, var19); // L: 278
				}
			}
		}
	}

	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "(Lmo;IIII)V",
		garbageValue = "-1094462724"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		class85.playPcmPlayers(); // L: 12246
		SpriteMask var4 = var0.getSpriteMask(false); // L: 12247
		if (var4 != null) { // L: 12248
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height); // L: 12249
			if (Client.minimapState != 2 && Client.minimapState != 5) { // L: 12250
				int var5 = Client.camAngleY & 2047; // L: 12251
				int var6 = HitSplatDefinition.localPlayer.x / 32 + 48; // L: 12252
				int var7 = 464 - HitSplatDefinition.localPlayer.y / 32; // L: 12253
				class178.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths); // L: 12254

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) { // L: 12255
					var16 = Client.field625[var8] * 4 + 2 - HitSplatDefinition.localPlayer.x / 32; // L: 12256
					var10 = Client.field719[var8] * 4 + 2 - HitSplatDefinition.localPlayer.y / 32; // L: 12257
					HorizontalAlignment.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4); // L: 12258
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) { // L: 12260
					for (var16 = 0; var16 < 104; ++var16) { // L: 12261
						NodeDeque var14 = Client.groundItems[NetFileRequest.Client_plane][var8][var16]; // L: 12262
						if (var14 != null) { // L: 12263
							var11 = var8 * 4 + 2 - HitSplatDefinition.localPlayer.x / 32; // L: 12264
							var12 = var16 * 4 + 2 - HitSplatDefinition.localPlayer.y / 32; // L: 12265
							HorizontalAlignment.drawSpriteOnMinimap(var1, var2, var11, var12, DirectByteArrayCopier.mapDotSprites[0], var4); // L: 12266
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) { // L: 12270
					NPC var9 = Client.npcs[Client.npcIndices[var8]]; // L: 12271
					if (var9 != null && var9.isVisible()) { // L: 12272
						NPCComposition var18 = var9.definition; // L: 12273
						if (var18 != null && var18.transforms != null) { // L: 12274
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) { // L: 12275
							var11 = var9.x / 32 - HitSplatDefinition.localPlayer.x / 32; // L: 12276
							var12 = var9.y / 32 - HitSplatDefinition.localPlayer.y / 32; // L: 12277
							HorizontalAlignment.drawSpriteOnMinimap(var1, var2, var11, var12, DirectByteArrayCopier.mapDotSprites[1], var4); // L: 12278
						}
					}
				}

				var8 = Players.Players_count; // L: 12282
				int[] var17 = Players.Players_indices; // L: 12283

				for (var10 = 0; var10 < var8; ++var10) { // L: 12284
					Player var15 = Client.players[var17[var10]]; // L: 12285
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != HitSplatDefinition.localPlayer) { // L: 12286
						var12 = var15.x / 32 - HitSplatDefinition.localPlayer.x / 32; // L: 12287
						int var13 = var15.y / 32 - HitSplatDefinition.localPlayer.y / 32; // L: 12288
						if (var15.isFriend()) { // L: 12289
							HorizontalAlignment.drawSpriteOnMinimap(var1, var2, var12, var13, DirectByteArrayCopier.mapDotSprites[3], var4);
						} else if (HitSplatDefinition.localPlayer.team != 0 && var15.team != 0 && var15.team == HitSplatDefinition.localPlayer.team) { // L: 12290
							HorizontalAlignment.drawSpriteOnMinimap(var1, var2, var12, var13, DirectByteArrayCopier.mapDotSprites[4], var4);
						} else if (var15.isFriendsChatMember()) { // L: 12291
							HorizontalAlignment.drawSpriteOnMinimap(var1, var2, var12, var13, DirectByteArrayCopier.mapDotSprites[5], var4);
						} else if (var15.isClanMember()) { // L: 12292
							HorizontalAlignment.drawSpriteOnMinimap(var1, var2, var12, var13, DirectByteArrayCopier.mapDotSprites[6], var4);
						} else {
							HorizontalAlignment.drawSpriteOnMinimap(var1, var2, var12, var13, DirectByteArrayCopier.mapDotSprites[2], var4); // L: 12293
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) { // L: 12296
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) { // L: 12297
						NPC var19 = Client.npcs[Client.hintArrowNpcIndex]; // L: 12298
						if (var19 != null) { // L: 12299
							var11 = var19.x / 32 - HitSplatDefinition.localPlayer.x / 32; // L: 12300
							var12 = var19.y / 32 - HitSplatDefinition.localPlayer.y / 32; // L: 12301
							class134.worldToMinimap(var1, var2, var11, var12, class20.mapMarkerSprites[1], var4); // L: 12302
						}
					}

					if (Client.hintArrowType == 2) { // L: 12305
						var10 = Client.field504 * 4 - class147.baseX * 256 + 2 - HitSplatDefinition.localPlayer.x / 32; // L: 12306
						var11 = Client.field684 * 4 - ModeWhere.baseY * 256 + 2 - HitSplatDefinition.localPlayer.y / 32; // L: 12307
						class134.worldToMinimap(var1, var2, var10, var11, class20.mapMarkerSprites[1], var4); // L: 12308
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) { // L: 12310
						Player var20 = Client.players[Client.hintArrowPlayerIndex]; // L: 12311
						if (var20 != null) { // L: 12312
							var11 = var20.x / 32 - HitSplatDefinition.localPlayer.x / 32; // L: 12313
							var12 = var20.y / 32 - HitSplatDefinition.localPlayer.y / 32; // L: 12314
							class134.worldToMinimap(var1, var2, var11, var12, class20.mapMarkerSprites[1], var4); // L: 12315
						}
					}
				}

				if (Client.destinationX != 0) { // L: 12319
					var10 = Client.destinationX * 4 + 2 - HitSplatDefinition.localPlayer.x / 32; // L: 12320
					var11 = Client.destinationY * 4 + 2 - HitSplatDefinition.localPlayer.y / 32; // L: 12321
					HorizontalAlignment.drawSpriteOnMinimap(var1, var2, var10, var11, class20.mapMarkerSprites[0], var4); // L: 12322
				}

				if (!HitSplatDefinition.localPlayer.isHidden) { // L: 12324
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 12326
			}

			Client.field701[var3] = true; // L: 12327
		}
	} // L: 12328
}
