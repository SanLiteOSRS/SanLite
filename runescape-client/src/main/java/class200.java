import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
public class class200 extends Node {
	@ObfuscatedName("dj")
	static boolean field2314;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 494311763
	)
	public int field2311;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 976799233
	)
	public int field2310;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1685883689
	)
	public int field2307;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	public Widget field2312;

	@ObfuscatedSignature(
		descriptor = "(IIILkd;)V"
	)
	public class200(int var1, int var2, int var3, Widget var4) {
		this.field2307 = var1; // L: 15
		this.field2311 = var2; // L: 16
		this.field2310 = var3; // L: 17
		this.field2312 = var4; // L: 18
	} // L: 19

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1133722447"
	)
	@Export("ByteArrayPool_release")
	public static synchronized void ByteArrayPool_release(byte[] var0) {
		if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4438) { // L: 96
			ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0; // L: 97
		} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4431) { // L: 100
			ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0; // L: 101
		} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4440) { // L: 104
			ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0; // L: 105
		} else if (var0.length == 30000 && ByteArrayPool.field4437 < ByteArrayPool.field4439) { // L: 108
			ByteArrayPool.field4445[++ByteArrayPool.field4437 - 1] = var0; // L: 109
		} else {
			if (SceneTilePaint.ByteArrayPool_arrays != null) { // L: 112
				for (int var1 = 0; var1 < Frames.ByteArrayPool_alternativeSizes.length; ++var1) { // L: 113
					if (var0.length == Frames.ByteArrayPool_alternativeSizes[var1] && ModelData0.ByteArrayPool_altSizeArrayCounts[var1] < SceneTilePaint.ByteArrayPool_arrays[var1].length) { // L: 114
						SceneTilePaint.ByteArrayPool_arrays[var1][ModelData0.ByteArrayPool_altSizeArrayCounts[var1]++] = var0; // L: 115
						return; // L: 116
					}
				}
			}

		}
	} // L: 98 102 106 110 120

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "586283553"
	)
	static int method4095(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 28
		if (var2 == null) { // L: 29
			return 0;
		} else if (var1 == -1) { // L: 30
			return 0;
		} else {
			int var3 = 0; // L: 31

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) { // L: 32
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4]; // L: 33
				}
			}

			return var3; // L: 35
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Date;",
		garbageValue = "-232656998"
	)
	static Date method4093() {
		java.util.Calendar var0 = java.util.Calendar.getInstance(); // L: 1601
		var0.set(2, 0); // L: 1602
		var0.set(5, 1); // L: 1603
		var0.set(1, 1900); // L: 1604
		return var0.getTime(); // L: 1605
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZB)Lrx;",
		garbageValue = "0"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) { // L: 379
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) { // L: 380
			var4 = 1;
		}

		long var6 = ((long)var1 << 16) + (long)var0 + ((long)var2 << 38) + ((long)var4 << 40) + ((long)var3 << 42); // L: 381
		SpritePixels var8;
		if (!var5) { // L: 383
			var8 = (SpritePixels)ItemComposition.ItemComposition_cachedSprites.get(var6); // L: 384
			if (var8 != null) { // L: 385
				return var8;
			}
		}

		ItemComposition var9 = NPCComposition.ItemComposition_get(var0); // L: 387
		if (var1 > 1 && var9.countobj != null) { // L: 388
			int var10 = -1; // L: 389

			for (int var11 = 0; var11 < 10; ++var11) { // L: 390
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) { // L: 391
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) { // L: 393
				var9 = NPCComposition.ItemComposition_get(var10);
			}
		}

		Model var19 = var9.getModel(1); // L: 395
		if (var19 == null) { // L: 396
			return null;
		} else {
			SpritePixels var20 = null; // L: 397
			if (var9.noteTemplate != -1) { // L: 398
				var20 = getItemSprite(var9.note, 10, 1, 0, 0, true); // L: 399
				if (var20 == null) { // L: 400
					return null;
				}
			} else if (var9.notedId != -1) { // L: 402
				var20 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false); // L: 403
				if (var20 == null) { // L: 404
					return null;
				}
			} else if (var9.placeholderTemplate != -1) { // L: 406
				var20 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false); // L: 407
				if (var20 == null) { // L: 408
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels; // L: 410
			int var13 = Rasterizer2D.Rasterizer2D_width; // L: 411
			int var14 = Rasterizer2D.Rasterizer2D_height; // L: 412
			int[] var15 = new int[4]; // L: 413
			Rasterizer2D.Rasterizer2D_getClipArray(var15); // L: 414
			var8 = new SpritePixels(36, 32); // L: 415
			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32); // L: 416
			Rasterizer2D.Rasterizer2D_clear(); // L: 417
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 418
			Rasterizer3D.method4395(16, 16); // L: 419
			Rasterizer3D.field2495 = false; // L: 420
			if (var9.placeholderTemplate != -1) { // L: 421
				var20.drawTransBgAt(0, 0);
			}

			int var16 = var9.zoom2d; // L: 422
			if (var5) { // L: 423
				var16 = (int)((double)var16 * 1.5D);
			} else if (var2 == 2) { // L: 424
				var16 = (int)((double)var16 * 1.04D);
			}

			int var17 = var16 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16; // L: 425
			int var18 = var16 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16; // L: 426
			var19.calculateBoundsCylinder(); // L: 427
			var19.method4682(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var19.height / 2 + var17 + var9.offsetY2d, var18 + var9.offsetY2d); // L: 428
			if (var9.notedId != -1) { // L: 429
				var20.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) { // L: 430
				var8.outline(1);
			}

			if (var2 >= 2) { // L: 431
				var8.outline(16777215);
			}

			if (var3 != 0) { // L: 432
				var8.shadow(var3);
			}

			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32); // L: 433
			if (var9.noteTemplate != -1) { // L: 434
				var20.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) { // L: 435
				class262.ItemComposition_fontPlain11.draw(PacketWriter.method2742(var1), 0, 9, 16776960, 1); // L: 436
			}

			if (!var5) { // L: 438
				ItemComposition.ItemComposition_cachedSprites.put(var8, var6);
			}

			Rasterizer2D.Rasterizer2D_replace(var12, var13, var14); // L: 439
			Rasterizer2D.Rasterizer2D_setClipArray(var15); // L: 440
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 441
			Rasterizer3D.field2495 = true; // L: 442
			return var8; // L: 443
		}
	}
}
