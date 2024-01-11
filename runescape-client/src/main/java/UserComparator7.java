import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 170403743
	)
	static int field1450;
	@ObfuscatedName("am")
	@Export("reversed")
	final boolean reversed;

	public UserComparator7(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lrj;Lrj;I)I",
		garbageValue = "-2132166084"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) { // L: 14
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZB)Luc;",
		garbageValue = "41"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) { // L: 377
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) { // L: 378
			var4 = 1;
		}

		long var6 = ((long)var4 << 40) + ((long)var1 << 16) + (long)var0 + ((long)var2 << 38) + ((long)var3 << 42); // L: 379
		SpritePixels var8;
		if (!var5) { // L: 381
			var8 = (SpritePixels)ItemComposition.ItemComposition_cachedSprites.get(var6); // L: 382
			if (var8 != null) { // L: 383
				return var8;
			}
		}

		ItemComposition var9 = class341.ItemComposition_get(var0); // L: 385
		if (var1 > 1 && var9.countobj != null) { // L: 386
			int var10 = -1; // L: 387

			for (int var11 = 0; var11 < 10; ++var11) { // L: 388
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) { // L: 389
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) { // L: 391
				var9 = class341.ItemComposition_get(var10);
			}
		}

		Model var22 = var9.getModel(1); // L: 393
		if (var22 == null) { // L: 394
			return null;
		} else {
			SpritePixels var23 = null; // L: 395
			if (var9.noteTemplate != -1) { // L: 396
				var23 = getItemSprite(var9.note, 10, 1, 0, 0, true); // L: 397
				if (var23 == null) { // L: 398
					return null;
				}
			} else if (var9.notedId != -1) { // L: 400
				var23 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false); // L: 401
				if (var23 == null) { // L: 402
					return null;
				}
			} else if (var9.placeholderTemplate != -1) { // L: 404
				var23 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false); // L: 405
				if (var23 == null) { // L: 406
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels; // L: 408
			int var13 = Rasterizer2D.Rasterizer2D_width; // L: 409
			int var14 = Rasterizer2D.Rasterizer2D_height; // L: 410
			float[] var15 = Rasterizer2D.field5253; // L: 411
			int[] var16 = new int[4]; // L: 412
			Rasterizer2D.Rasterizer2D_getClipArray(var16); // L: 413
			var8 = new SpritePixels(36, 32); // L: 414
			Rasterizer3D.method5308(var8.pixels, 36, 32, (float[])null); // L: 415
			Rasterizer2D.Rasterizer2D_clear(); // L: 416
			Rasterizer3D.method5300(); // L: 417
			Rasterizer3D.method5264(16, 16); // L: 418
			Rasterizer3D.field2809.field3080 = false; // L: 419
			if (var9.placeholderTemplate != -1) { // L: 420
				var23.drawTransBgAt(0, 0);
			}

			int var17 = var9.zoom2d; // L: 421
			if (var5) { // L: 422
				var17 = (int)(1.5D * (double)var17);
			} else if (var2 == 2) { // L: 423
				var17 = (int)(1.04D * (double)var17);
			}

			int var18 = var17 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16; // L: 424
			int var19 = var17 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16; // L: 425
			var22.calculateBoundsCylinder(); // L: 426
			var22.method5660(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var22.height / 2 + var18 + var9.offsetY2d, var19 + var9.offsetY2d); // L: 427
			if (var9.notedId != -1) { // L: 428
				var23.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) { // L: 429
				var8.outline(1);
			}

			if (var2 >= 2) { // L: 430
				var8.outline(16777215);
			}

			if (var3 != 0) { // L: 431
				var8.shadow(var3);
			}

			Rasterizer3D.method5308(var8.pixels, 36, 32, (float[])null); // L: 432
			if (var9.noteTemplate != -1) { // L: 433
				var23.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) { // L: 434
				Font var20 = ItemComposition.field2158; // L: 435
				String var21;
				if (var1 < 100000) { // L: 438
					var21 = "<col=ffff00>" + var1 + "</col>"; // L: 439
				} else if (var1 < 10000000) { // L: 442
					var21 = "<col=ffffff>" + var1 / 1000 + "K" + "</col>"; // L: 443
				} else {
					var21 = "<col=00ff80>" + var1 / 1000000 + "M" + "</col>"; // L: 446
				}

				var20.draw(var21, 0, 9, 16776960, 1); // L: 448
			}

			if (!var5) { // L: 450
				ItemComposition.ItemComposition_cachedSprites.put(var8, var6);
			}

			Rasterizer3D.method5308(var12, var13, var14, var15); // L: 451
			Rasterizer2D.Rasterizer2D_setClipArray(var16); // L: 452
			Rasterizer3D.method5300(); // L: 453
			Rasterizer3D.field2809.field3080 = true; // L: 454
			return var8; // L: 455
		}
	}
}
