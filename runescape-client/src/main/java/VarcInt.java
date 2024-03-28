import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hi")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("VarcInt_archive")
	static AbstractArchive VarcInt_archive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("VarcInt_cached")
	public static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("af")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	VarcInt() {
		this.persist = false; // L: 12
	} // L: 14

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "2132512195"
	)
	void method3770(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 32
			if (var2 == 0) { // L: 33
				return; // L: 36
			}

			this.method3772(var1, var2); // L: 34
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lur;II)V",
		garbageValue = "-2079099518"
	)
	void method3772(Buffer var1, int var2) {
		if (var2 == 2) { // L: 39
			this.persist = true; // L: 40
		}

	} // L: 43

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZB)Lvg;",
		garbageValue = "-18"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) { // L: 383
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) { // L: 384
			var4 = 1;
		}

		long var6 = ((long)var1 << 16) + (long)var0 + ((long)var2 << 38) + ((long)var4 << 40) + ((long)var3 << 42); // L: 385
		SpritePixels var8;
		if (!var5) { // L: 387
			var8 = (SpritePixels)ItemComposition.ItemComposition_cachedSprites.get(var6); // L: 388
			if (var8 != null) { // L: 389
				return var8;
			}
		}

		ItemComposition var9 = class10.ItemComposition_get(var0); // L: 391
		if (var1 > 1 && var9.countobj != null) { // L: 392
			int var10 = -1; // L: 393

			for (int var11 = 0; var11 < 10; ++var11) { // L: 394
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) { // L: 395
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) { // L: 397
				var9 = class10.ItemComposition_get(var10);
			}
		}

		Model var22 = var9.getModel(1); // L: 399
		if (var22 == null) { // L: 400
			return null;
		} else {
			SpritePixels var23 = null; // L: 401
			if (var9.noteTemplate != -1) { // L: 402
				var23 = getItemSprite(var9.note, 10, 1, 0, 0, true); // L: 403
				if (var23 == null) { // L: 404
					return null;
				}
			} else if (var9.notedId != -1) { // L: 406
				var23 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false); // L: 407
				if (var23 == null) { // L: 408
					return null;
				}
			} else if (var9.placeholderTemplate != -1) { // L: 410
				var23 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false); // L: 411
				if (var23 == null) { // L: 412
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels; // L: 414
			int var13 = Rasterizer2D.Rasterizer2D_width; // L: 415
			int var14 = Rasterizer2D.Rasterizer2D_height; // L: 416
			float[] var15 = Rasterizer2D.field5304; // L: 417
			int[] var16 = new int[4]; // L: 418
			Rasterizer2D.Rasterizer2D_getClipArray(var16); // L: 419
			var8 = new SpritePixels(36, 32); // L: 420
			Rasterizer3D.method4572(var8.pixels, 36, 32, (float[])null); // L: 421
			Rasterizer2D.Rasterizer2D_clear(); // L: 422
			Rasterizer3D.method4576(); // L: 423
			Rasterizer3D.method4579(16, 16); // L: 424
			Rasterizer3D.field2611.field2885 = false; // L: 425
			if (var9.placeholderTemplate != -1) { // L: 426
				var23.drawTransBgAt(0, 0);
			}

			int var17 = var9.zoom2d; // L: 427
			if (var5) { // L: 428
				var17 = (int)((double)var17 * 1.5D);
			} else if (var2 == 2) { // L: 429
				var17 = (int)(1.04D * (double)var17);
			}

			int var18 = var17 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16; // L: 430
			int var19 = var17 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16; // L: 431
			var22.calculateBoundsCylinder(); // L: 432
			var22.method5031(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var22.height / 2 + var18 + var9.offsetY2d, var19 + var9.offsetY2d); // L: 433
			if (var9.notedId != -1) { // L: 434
				var23.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) { // L: 435
				var8.outline(1);
			}

			if (var2 >= 2) { // L: 436
				var8.outline(16777215);
			}

			if (var3 != 0) { // L: 437
				var8.shadow(var3);
			}

			Rasterizer3D.method4572(var8.pixels, 36, 32, (float[])null); // L: 438
			if (var9.noteTemplate != -1) { // L: 439
				var23.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) { // L: 440
				Font var20 = FileSystem.field1887; // L: 441
				String var21;
				if (var1 < 100000) { // L: 444
					var21 = "<col=ffff00>" + var1 + "</col>"; // L: 445
				} else if (var1 < 10000000) { // L: 448
					var21 = "<col=ffffff>" + var1 / 1000 + "K" + "</col>"; // L: 449
				} else {
					var21 = "<col=00ff80>" + var1 / 1000000 + "M" + "</col>"; // L: 452
				}

				var20.draw(var21, 0, 9, 16776960, 1); // L: 454
			}

			if (!var5) { // L: 456
				ItemComposition.ItemComposition_cachedSprites.put(var8, var6);
			}

			Rasterizer3D.method4572(var12, var13, var14, var15); // L: 457
			Rasterizer2D.Rasterizer2D_setClipArray(var16); // L: 458
			Rasterizer3D.method4576(); // L: 459
			Rasterizer3D.field2611.field2885 = true; // L: 460
			return var8; // L: 461
		}
	}
}
