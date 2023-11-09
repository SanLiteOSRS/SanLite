import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
@Implements("TextureProvider")
public class TextureProvider implements TextureLoader {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "[Lhv;"
	)
	@Export("textures")
	Texture[] textures;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("deque")
	NodeDeque deque;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1321183309
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1105723629
	)
	@Export("remaining")
	int remaining;
	@ObfuscatedName("z")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1025033257
	)
	@Export("textureSize")
	int textureSize;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive")
	AbstractArchive archive;

	@ObfuscatedSignature(
		descriptor = "(Lln;Lln;IDI)V"
	)
	public TextureProvider(AbstractArchive var1, AbstractArchive var2, int var3, double var4, int var6) {
		this.deque = new NodeDeque(); // L: 9
		this.remaining = 0; // L: 11
		this.brightness = 1.0D; // L: 12
		this.textureSize = 128; // L: 13
		this.archive = var2; // L: 17
		this.capacity = var3; // L: 18
		this.remaining = this.capacity; // L: 19
		this.brightness = var4; // L: 20
		this.textureSize = var6; // L: 21
		int[] var7 = var1.getGroupFileIds(0); // L: 22
		int var8 = var7.length; // L: 23
		this.textures = new Texture[var1.getGroupFileCount(0)]; // L: 24

		for (int var9 = 0; var9 < var8; ++var9) { // L: 25
			Buffer var10 = new Buffer(var1.takeFile(0, var7[var9])); // L: 26
			this.textures[var7[var9]] = new Texture(var10); // L: 27
		}

	} // L: 29

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-42"
	)
	@Export("getLoadedPercentage")
	public int getLoadedPercentage() {
		int var1 = 0; // L: 32
		int var2 = 0; // L: 33
		Texture[] var3 = this.textures; // L: 35

		for (int var4 = 0; var4 < var3.length; ++var4) { // L: 36
			Texture var5 = var3[var4]; // L: 37
			if (var5 != null && var5.fileIds != null) { // L: 39
				var1 += var5.fileIds.length; // L: 40
				int[] var6 = var5.fileIds; // L: 42

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 43
					int var8 = var6[var7]; // L: 44
					if (this.archive.method6603(var8)) { // L: 46
						++var2; // L: 47
					}
				}
			}
		}

		if (var1 == 0) { // L: 55
			return 0;
		} else {
			return var2 * 100 / var1; // L: 56
		}
	}

	@ObfuscatedName("w")
	@Export("setBrightness")
	public void setBrightness(double var1) {
		this.brightness = var1; // L: 60
		this.clear(); // L: 61
	} // L: 62

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "1661663667"
	)
	@Export("getTexturePixels")
	public int[] getTexturePixels(int var1) {
		Texture var2 = this.textures[var1]; // L: 65
		if (var2 != null) { // L: 66
			if (var2.pixels != null) { // L: 67
				this.deque.addLast(var2); // L: 68
				var2.isLoaded = true; // L: 69
				return var2.pixels; // L: 70
			}

			boolean var3 = var2.load(this.brightness, this.textureSize, this.archive); // L: 72
			if (var3) { // L: 73
				if (this.remaining == 0) { // L: 74
					Texture var4 = (Texture)this.deque.removeFirst(); // L: 75
					var4.reset(); // L: 76
				} else {
					--this.remaining; // L: 78
				}

				this.deque.addLast(var2); // L: 79
				var2.isLoaded = true; // L: 80
				return var2.pixels; // L: 81
			}
		}

		return null; // L: 84
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1511027024"
	)
	@Export("getAverageTextureRGB")
	public int getAverageTextureRGB(int var1) {
		return this.textures[var1] != null ? this.textures[var1].averageRGB : 0; // L: 88 89
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "27425"
	)
	public boolean vmethod4859(int var1) {
		return this.textures[var1].field2453; // L: 93
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "81"
	)
	@Export("isLowDetail")
	public boolean isLowDetail(int var1) {
		return this.textureSize == 64; // L: 97
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1988825307"
	)
	@Export("clear")
	public void clear() {
		for (int var1 = 0; var1 < this.textures.length; ++var1) { // L: 101
			if (this.textures[var1] != null) { // L: 102
				this.textures[var1].reset();
			}
		}

		this.deque = new NodeDeque(); // L: 104
		this.remaining = this.capacity; // L: 105
	} // L: 106

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-255146767"
	)
	@Export("animate")
	public void animate(int var1) {
		for (int var2 = 0; var2 < this.textures.length; ++var2) { // L: 109
			Texture var3 = this.textures[var2]; // L: 110
			if (var3 != null && var3.animationDirection != 0 && var3.isLoaded) { // L: 111
				var3.animate(var1); // L: 112
				var3.isLoaded = false; // L: 113
			}
		}

	} // L: 116

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZB)Lrs;",
		garbageValue = "-94"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) { // L: 371
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) { // L: 372
			var4 = 1;
		}

		long var6 = ((long)var3 << 42) + ((long)var4 << 40) + ((long)var2 << 38) + ((long)var1 << 16) + (long)var0; // L: 373
		SpritePixels var8;
		if (!var5) { // L: 375
			var8 = (SpritePixels)ItemComposition.ItemComposition_cachedSprites.get(var6); // L: 376
			if (var8 != null) { // L: 377
				return var8;
			}
		}

		ItemComposition var9 = TileItem.ItemComposition_get(var0); // L: 379
		if (var1 > 1 && var9.countobj != null) { // L: 380
			int var10 = -1; // L: 381

			for (int var11 = 0; var11 < 10; ++var11) { // L: 382
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) { // L: 383
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) { // L: 385
				var9 = TileItem.ItemComposition_get(var10);
			}
		}

		Model var19 = var9.getModel(1); // L: 387
		if (var19 == null) { // L: 388
			return null;
		} else {
			SpritePixels var20 = null; // L: 389
			if (var9.noteTemplate != -1) { // L: 390
				var20 = getItemSprite(var9.note, 10, 1, 0, 0, true); // L: 391
				if (var20 == null) { // L: 392
					return null;
				}
			} else if (var9.notedId != -1) { // L: 394
				var20 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false); // L: 395
				if (var20 == null) { // L: 396
					return null;
				}
			} else if (var9.placeholderTemplate != -1) { // L: 398
				var20 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false); // L: 399
				if (var20 == null) { // L: 400
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels; // L: 402
			int var13 = Rasterizer2D.Rasterizer2D_width; // L: 403
			int var14 = Rasterizer2D.Rasterizer2D_height; // L: 404
			int[] var15 = new int[4]; // L: 405
			Rasterizer2D.Rasterizer2D_getClipArray(var15); // L: 406
			var8 = new SpritePixels(36, 32); // L: 407
			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32); // L: 408
			Rasterizer2D.Rasterizer2D_clear(); // L: 409
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 410
			Rasterizer3D.method4417(16, 16); // L: 411
			Rasterizer3D.field2500 = false; // L: 412
			if (var9.placeholderTemplate != -1) { // L: 413
				var20.drawTransBgAt(0, 0);
			}

			int var16 = var9.zoom2d; // L: 414
			if (var5) { // L: 415
				var16 = (int)(1.5D * (double)var16);
			} else if (var2 == 2) { // L: 416
				var16 = (int)((double)var16 * 1.04D);
			}

			int var17 = var16 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16; // L: 417
			int var18 = var16 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16; // L: 418
			var19.calculateBoundsCylinder(); // L: 419
			var19.method4706(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var19.height / 2 + var17 + var9.offsetY2d, var18 + var9.offsetY2d); // L: 420
			if (var9.notedId != -1) { // L: 421
				var20.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) { // L: 422
				var8.outline(1);
			}

			if (var2 >= 2) { // L: 423
				var8.outline(16777215);
			}

			if (var3 != 0) { // L: 424
				var8.shadow(var3);
			}

			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32); // L: 425
			if (var9.noteTemplate != -1) { // L: 426
				var20.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) { // L: 427
				class138.ItemComposition_fontPlain11.draw(class303.method5869(var1), 0, 9, 16776960, 1); // L: 428
			}

			if (!var5) { // L: 430
				ItemComposition.ItemComposition_cachedSprites.put(var8, var6);
			}

			Rasterizer2D.Rasterizer2D_replace(var12, var13, var14); // L: 431
			Rasterizer2D.Rasterizer2D_setClipArray(var15); // L: 432
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 433
			Rasterizer3D.field2500 = true; // L: 434
			return var8; // L: 435
		}
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "88"
	)
	static final void method4681() {
		for (GraphicsObject var0 = (GraphicsObject)Client.graphicsObjects.last(); var0 != null; var0 = (GraphicsObject)Client.graphicsObjects.previous()) { // L: 5138 5139 5146
			if (var0.plane == class103.Client_plane && !var0.isFinished) { // L: 5140
				if (Client.cycle >= var0.cycleStart) { // L: 5141
					var0.advance(Client.field574); // L: 5142
					if (var0.isFinished) { // L: 5143
						var0.remove();
					} else {
						WorldMapAreaData.scene.drawEntity(var0.plane, var0.x, var0.y, var0.z, 60, var0, 0, -1L, false); // L: 5144
					}
				}
			} else {
				var0.remove();
			}
		}

	} // L: 5148
}
