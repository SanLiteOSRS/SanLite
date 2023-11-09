import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -217208111
	)
	@Export("x")
	int x;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 142750423
	)
	@Export("y")
	int y;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1097631737
	)
	@Export("z")
	int z;

	FaceNormal() {
	} // L: 8

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)Lud;",
		garbageValue = "1537290681"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) { // L: 385
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) { // L: 386
			var4 = 1;
		}

		long var6 = ((long)var3 << 42) + ((long)var1 << 16) + (long)var0 + ((long)var2 << 38) + ((long)var4 << 40); // L: 387
		SpritePixels var8;
		if (!var5) { // L: 389
			var8 = (SpritePixels)ItemComposition.ItemComposition_cachedSprites.get(var6); // L: 390
			if (var8 != null) { // L: 391
				return var8;
			}
		}

		ItemComposition var9 = class125.ItemComposition_get(var0); // L: 393
		if (var1 > 1 && var9.countobj != null) { // L: 394
			int var10 = -1; // L: 395

			for (int var11 = 0; var11 < 10; ++var11) { // L: 396
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) { // L: 397
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) { // L: 399
				var9 = class125.ItemComposition_get(var10);
			}
		}

		Model var20 = var9.getModel(1); // L: 401
		if (var20 == null) { // L: 402
			return null;
		} else {
			SpritePixels var21 = null; // L: 403
			if (var9.noteTemplate != -1) { // L: 404
				var21 = getItemSprite(var9.note, 10, 1, 0, 0, true); // L: 405
				if (var21 == null) { // L: 406
					return null;
				}
			} else if (var9.notedId != -1) { // L: 408
				var21 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false); // L: 409
				if (var21 == null) { // L: 410
					return null;
				}
			} else if (var9.placeholderTemplate != -1) { // L: 412
				var21 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false); // L: 413
				if (var21 == null) { // L: 414
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels; // L: 416
			int var13 = Rasterizer2D.Rasterizer2D_width; // L: 417
			int var14 = Rasterizer2D.Rasterizer2D_height; // L: 418
			float[] var15 = Rasterizer2D.field5139; // L: 419
			int[] var16 = new int[4]; // L: 420
			Rasterizer2D.Rasterizer2D_getClipArray(var16); // L: 421
			var8 = new SpritePixels(36, 32); // L: 422
			Rasterizer3D.method4416(var8.pixels, 36, 32, (float[])null); // L: 423
			Rasterizer2D.Rasterizer2D_clear(); // L: 424
			Rasterizer3D.method4417(); // L: 425
			Rasterizer3D.method4420(16, 16); // L: 426
			Rasterizer3D.field2510.field2792 = false; // L: 427
			if (var9.placeholderTemplate != -1) { // L: 428
				var21.drawTransBgAt(0, 0);
			}

			int var17 = var9.zoom2d; // L: 429
			if (var5) { // L: 430
				var17 = (int)((double)var17 * 1.5D);
			} else if (var2 == 2) { // L: 431
				var17 = (int)((double)var17 * 1.04D);
			}

			int var18 = var17 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16; // L: 432
			int var19 = var17 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16; // L: 433
			var20.calculateBoundsCylinder(); // L: 434
			var20.method4815(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var20.height / 2 + var18 + var9.offsetY2d, var19 + var9.offsetY2d); // L: 435
			if (var9.notedId != -1) { // L: 436
				var21.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) { // L: 437
				var8.outline(1);
			}

			if (var2 >= 2) { // L: 438
				var8.outline(16777215);
			}

			if (var3 != 0) { // L: 439
				var8.shadow(var3);
			}

			Rasterizer3D.method4416(var8.pixels, 36, 32, (float[])null); // L: 440
			if (var9.noteTemplate != -1) { // L: 441
				var21.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) { // L: 442
				GroundObject.ItemComposition_fontPlain11.draw(class177.method3542(var1), 0, 9, 16776960, 1); // L: 443
			}

			if (!var5) { // L: 445
				ItemComposition.ItemComposition_cachedSprites.put(var8, var6);
			}

			Rasterizer3D.method4416(var12, var13, var14, var15); // L: 446
			Rasterizer2D.Rasterizer2D_setClipArray(var16); // L: 447
			Rasterizer3D.method4417(); // L: 448
			Rasterizer3D.field2510.field2792 = true; // L: 449
			return var8; // L: 450
		}
	}
}
