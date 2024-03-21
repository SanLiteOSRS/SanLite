import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("FloorOverlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -637887147
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1858594123
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("ar")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -78383605
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 2028574889
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -532421459
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -970004813
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 916475103
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 957509085
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1296969211
	)
	@Export("secondaryLightness")
	public int secondaryLightness;

	static {
		FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	public FloorOverlayDefinition() {
		this.primaryRgb = 0; // L: 12
		this.texture = -1; // L: 13
		this.hideUnderlay = true; // L: 14
		this.secondaryRgb = -1; // L: 15
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "10635"
	)
	@Export("postDecode")
	public void postDecode() {
		if (this.secondaryRgb != -1) { // L: 28
			this.setHsl(this.secondaryRgb); // L: 29
			this.secondaryHue = this.hue; // L: 30
			this.secondarySaturation = this.saturation; // L: 31
			this.secondaryLightness = this.lightness; // L: 32
		}

		this.setHsl(this.primaryRgb); // L: 34
	} // L: 35

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luq;II)V",
		garbageValue = "1339315312"
	)
	@Export("decode")
	public void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte(); // L: 39
			if (var3 == 0) { // L: 40
				return; // L: 43
			}

			this.decodeNext(var1, var3, var2); // L: 41
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Luq;IIB)V",
		garbageValue = "0"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 46
			this.primaryRgb = var1.readMedium();
		} else if (var2 == 2) {
			this.texture = var1.readUnsignedByte(); // L: 47
		} else if (var2 == 5) { // L: 48
			this.hideUnderlay = false;
		} else if (var2 == 7) {
			this.secondaryRgb = var1.readMedium(); // L: 49
		} else if (var2 == 8) { // L: 50
		}

	} // L: 52

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "89"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D; // L: 55
		double var4 = (double)(var1 >> 8 & 255) / 256.0D; // L: 56
		double var6 = (double)(var1 & 255) / 256.0D; // L: 57
		double var8 = var2; // L: 58
		if (var4 < var2) { // L: 59
			var8 = var4;
		}

		if (var6 < var8) { // L: 60
			var8 = var6;
		}

		double var10 = var2; // L: 61
		if (var4 > var2) { // L: 62
			var10 = var4;
		}

		if (var6 > var10) { // L: 63
			var10 = var6;
		}

		double var12 = 0.0D;
		double var14 = 0.0D;
		double var16 = (var10 + var8) / 2.0D;
		if (var8 != var10) { // L: 67
			if (var16 < 0.5D) { // L: 68
				var14 = (var10 - var8) / (var10 + var8);
			}

			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) { // L: 71
				var12 = 2.0D + (var6 - var2) / (var10 - var8);
			} else if (var6 == var10) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8); // L: 72
			}
		}

		var12 /= 6.0D; // L: 74
		this.hue = (int)(var12 * 256.0D);
		this.saturation = (int)(256.0D * var14);
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lof;Ljava/lang/String;Ljava/lang/String;I)[Lvg;",
		garbageValue = "-859391204"
	)
	public static IndexedSprite[] method4031(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) { // L: 64
			return null;
		} else {
			int var3 = var0.getGroupId(var1); // L: 65
			int var4 = var0.getFileId(var3, var2); // L: 66
			IndexedSprite[] var5;
			if (!class130.method3074(var0, var3, var4)) { // L: 69
				var5 = null; // L: 70
			} else {
				IndexedSprite[] var7 = new IndexedSprite[class548.SpriteBuffer_spriteCount]; // L: 75

				for (int var8 = 0; var8 < class548.SpriteBuffer_spriteCount; ++var8) { // L: 76
					IndexedSprite var9 = var7[var8] = new IndexedSprite(); // L: 77
					var9.width = class548.SpriteBuffer_spriteWidth; // L: 78
					var9.height = class548.SpriteBuffer_spriteHeight; // L: 79
					var9.xOffset = class548.SpriteBuffer_xOffsets[var8]; // L: 80
					var9.yOffset = class548.SpriteBuffer_yOffsets[var8]; // L: 81
					var9.subWidth = class235.SpriteBuffer_spriteWidths[var8]; // L: 82
					var9.subHeight = class548.SpriteBuffer_spriteHeights[var8]; // L: 83
					var9.palette = AbstractSocket.SpriteBuffer_spritePalette; // L: 84
					var9.pixels = class548.SpriteBuffer_pixels[var8]; // L: 85
				}

				class548.SpriteBuffer_xOffsets = null; // L: 88
				class548.SpriteBuffer_yOffsets = null; // L: 89
				class235.SpriteBuffer_spriteWidths = null; // L: 90
				class548.SpriteBuffer_spriteHeights = null; // L: 91
				AbstractSocket.SpriteBuffer_spritePalette = null; // L: 92
				class548.SpriteBuffer_pixels = null; // L: 93
				var5 = var7; // L: 97
			}

			return var5; // L: 99
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "3"
	)
	static int method4052(int var0, Script var1, boolean var2) {
		return 2; // L: 5157
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field756 = 0L; // L: 4634
		if (var0 >= 2) { // L: 4635
			Client.isResizable = true;
		} else {
			Client.isResizable = false; // L: 4636
		}

		if (AbstractUserComparator.getWindowedMode() == 1) { // L: 4637
			class193.client.setMaxCanvasSize(765, 503); // L: 4638
		} else {
			class193.client.setMaxCanvasSize(7680, 2160); // L: 4641
		}

		if (Client.gameState >= 25 && Client.packetWriter != null && Client.packetWriter.isaacCipher != null) { // L: 4643 4644
			PacketBufferNode var1 = ViewportMouse.getPacketBufferNode(ClientPacket.field3177, Client.packetWriter.isaacCipher); // L: 4646
			var1.packetBuffer.writeByte(AbstractUserComparator.getWindowedMode()); // L: 4647
			var1.packetBuffer.writeShort(GameEngine.canvasWidth); // L: 4648
			var1.packetBuffer.writeShort(WorldMapArea.canvasHeight); // L: 4649
			Client.packetWriter.addNode(var1); // L: 4650
		}

	} // L: 4652

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(IIIIIS)V",
		garbageValue = "512"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = Actor.scene.getWallObjectTag(var0, var1, var2); // L: 6301
		int var7;
		int var8;
		int var9;
		int var10;
		int var13;
		int var14;
		if (var5 != 0L) { // L: 6302
			var7 = Actor.scene.getObjectFlags(var0, var1, var2, var5); // L: 6303
			var8 = var7 >> 6 & 3; // L: 6304
			var9 = var7 & 31; // L: 6305
			var10 = var3; // L: 6306
			boolean var11 = var5 != 0L && !class164.method3461(var5); // L: 6309
			if (var11) { // L: 6311
				var10 = var4;
			}

			int[] var12 = class25.field118.pixels; // L: 6312
			var13 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 6313
			var14 = Message.Entity_unpackID(var5); // L: 6314
			ObjectComposition var15 = class127.getObjectDefinition(var14); // L: 6315
			if (var15.mapSceneId != -1) { // L: 6316
				IndexedSprite var16 = AbstractSocket.mapSceneSprites[var15.mapSceneId]; // L: 6317
				if (var16 != null) { // L: 6318
					int var17 = (var15.sizeX * 4 - var16.subWidth) / 2; // L: 6319
					int var18 = (var15.sizeY * 4 - var16.subHeight) / 2; // L: 6320
					var16.drawAt(var1 * 4 + var17 + 48, var18 + (104 - var2 - var15.sizeY) * 4 + 48); // L: 6321
				}
			} else {
				if (var9 == 0 || var9 == 2) { // L: 6325
					if (var8 == 0) { // L: 6326
						var12[var13] = var10; // L: 6327
						var12[var13 + 512] = var10; // L: 6328
						var12[var13 + 1024] = var10; // L: 6329
						var12[var13 + 1536] = var10; // L: 6330
					} else if (var8 == 1) { // L: 6332
						var12[var13] = var10; // L: 6333
						var12[var13 + 1] = var10; // L: 6334
						var12[var13 + 2] = var10; // L: 6335
						var12[var13 + 3] = var10; // L: 6336
					} else if (var8 == 2) { // L: 6338
						var12[var13 + 3] = var10; // L: 6339
						var12[var13 + 512 + 3] = var10; // L: 6340
						var12[var13 + 1024 + 3] = var10; // L: 6341
						var12[var13 + 1536 + 3] = var10; // L: 6342
					} else if (var8 == 3) { // L: 6344
						var12[var13 + 1536] = var10; // L: 6345
						var12[var13 + 1536 + 1] = var10; // L: 6346
						var12[var13 + 1536 + 2] = var10; // L: 6347
						var12[var13 + 1536 + 3] = var10; // L: 6348
					}
				}

				if (var9 == 3) { // L: 6351
					if (var8 == 0) { // L: 6352
						var12[var13] = var10;
					} else if (var8 == 1) { // L: 6353
						var12[var13 + 3] = var10;
					} else if (var8 == 2) { // L: 6354
						var12[var13 + 1536 + 3] = var10;
					} else if (var8 == 3) { // L: 6355
						var12[var13 + 1536] = var10;
					}
				}

				if (var9 == 2) { // L: 6357
					if (var8 == 3) { // L: 6358
						var12[var13] = var10; // L: 6359
						var12[var13 + 512] = var10; // L: 6360
						var12[var13 + 1024] = var10; // L: 6361
						var12[var13 + 1536] = var10; // L: 6362
					} else if (var8 == 0) { // L: 6364
						var12[var13] = var10; // L: 6365
						var12[var13 + 1] = var10; // L: 6366
						var12[var13 + 2] = var10; // L: 6367
						var12[var13 + 3] = var10; // L: 6368
					} else if (var8 == 1) { // L: 6370
						var12[var13 + 3] = var10; // L: 6371
						var12[var13 + 512 + 3] = var10; // L: 6372
						var12[var13 + 1024 + 3] = var10; // L: 6373
						var12[var13 + 1536 + 3] = var10; // L: 6374
					} else if (var8 == 2) { // L: 6376
						var12[var13 + 1536] = var10; // L: 6377
						var12[var13 + 1536 + 1] = var10; // L: 6378
						var12[var13 + 1536 + 2] = var10; // L: 6379
						var12[var13 + 1536 + 3] = var10; // L: 6380
					}
				}
			}
		}

		var5 = Actor.scene.getGameObjectTag(var0, var1, var2); // L: 6385
		if (0L != var5) { // L: 6386
			var7 = Actor.scene.getObjectFlags(var0, var1, var2, var5); // L: 6387
			var8 = var7 >> 6 & 3; // L: 6388
			var9 = var7 & 31; // L: 6389
			var10 = Message.Entity_unpackID(var5); // L: 6390
			ObjectComposition var19 = class127.getObjectDefinition(var10); // L: 6391
			if (var19.mapSceneId != -1) { // L: 6392
				IndexedSprite var26 = AbstractSocket.mapSceneSprites[var19.mapSceneId]; // L: 6393
				if (var26 != null) { // L: 6394
					var13 = (var19.sizeX * 4 - var26.subWidth) / 2; // L: 6395
					var14 = (var19.sizeY * 4 - var26.subHeight) / 2; // L: 6396
					var26.drawAt(var13 + var1 * 4 + 48, (104 - var2 - var19.sizeY) * 4 + var14 + 48); // L: 6397
				}
			} else if (var9 == 9) { // L: 6400
				int var20 = 15658734; // L: 6401
				boolean var27 = var5 != 0L && !class164.method3461(var5); // L: 6404
				if (var27) { // L: 6406
					var20 = 15597568;
				}

				int[] var21 = class25.field118.pixels; // L: 6407
				int var22 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 6408
				if (var8 != 0 && var8 != 2) { // L: 6409
					var21[var22] = var20; // L: 6416
					var21[var22 + 1 + 512] = var20; // L: 6417
					var21[var22 + 1024 + 2] = var20; // L: 6418
					var21[var22 + 1536 + 3] = var20; // L: 6419
				} else {
					var21[var22 + 1536] = var20; // L: 6410
					var21[var22 + 1 + 1024] = var20; // L: 6411
					var21[var22 + 512 + 2] = var20; // L: 6412
					var21[var22 + 3] = var20; // L: 6413
				}
			}
		}

		var5 = Actor.scene.getGroundObjectTag(var0, var1, var2); // L: 6423
		if (var5 != 0L) { // L: 6424
			var7 = Message.Entity_unpackID(var5); // L: 6425
			ObjectComposition var23 = class127.getObjectDefinition(var7); // L: 6426
			if (var23.mapSceneId != -1) { // L: 6427
				IndexedSprite var24 = AbstractSocket.mapSceneSprites[var23.mapSceneId]; // L: 6428
				if (var24 != null) { // L: 6429
					var10 = (var23.sizeX * 4 - var24.subWidth) / 2; // L: 6430
					int var25 = (var23.sizeY * 4 - var24.subHeight) / 2; // L: 6431
					var24.drawAt(var10 + var1 * 4 + 48, var25 + (104 - var2 - var23.sizeY) * 4 + 48); // L: 6432
				}
			}
		}

	} // L: 6436
}
