import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
public class class293 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	@Export("musicPatchesArchive")
	static AbstractArchive musicPatchesArchive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	@Export("musicSamplesArchive")
	static AbstractArchive musicSamplesArchive;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	@Export("soundEffectsArchive")
	static AbstractArchive soundEffectsArchive;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	@Export("midiPcmStream")
	public static MidiPcmStream midiPcmStream;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -719231749
	)
	@Export("musicPlayerStatus")
	public static int musicPlayerStatus;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1735242197
	)
	@Export("musicTrackFileId")
	public static int musicTrackFileId;
	@ObfuscatedName("ak")
	@Export("musicTrackBoolean")
	public static boolean musicTrackBoolean;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lbb;"
	)
	@Export("soundCache")
	public static SoundCache soundCache;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "[Lsp;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;

	static {
		musicPlayerStatus = 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(DDII)[D",
		garbageValue = "1896808971"
	)
	public static double[] method5519(double var0, double var2, int var4) {
		int var5 = var4 * 2 + 1; // L: 9
		double[] var6 = new double[var5]; // L: 10
		int var7 = -var4;

		for (int var8 = 0; var7 <= var4; ++var8) {
			double var15 = ((double)var7 - var0) / var2; // L: 17
			double var13 = Math.exp(-var15 * var15 / 2.0D) / Math.sqrt(6.283185307179586D); // L: 19
			double var11 = var13 / var2; // L: 21
			var6[var8] = var11; // L: 23
			++var7; // L: 11
		}

		return var6; // L: 25
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)Lsn;",
		garbageValue = "2012134023"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) { // L: 371
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) { // L: 372
			var4 = 1;
		}

		long var6 = ((long)var3 << 42) + (long)var0 + ((long)var1 << 16) + ((long)var2 << 38) + ((long)var4 << 40); // L: 373
		SpritePixels var8;
		if (!var5) { // L: 375
			var8 = (SpritePixels)ItemComposition.ItemComposition_cachedSprites.get(var6); // L: 376
			if (var8 != null) { // L: 377
				return var8;
			}
		}

		ItemComposition var9 = ParamComposition.ItemComposition_get(var0); // L: 379
		if (var1 > 1 && var9.countobj != null) { // L: 380
			int var10 = -1; // L: 381

			for (int var11 = 0; var11 < 10; ++var11) { // L: 382
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) { // L: 383
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) { // L: 385
				var9 = ParamComposition.ItemComposition_get(var10);
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
			Rasterizer3D.method4305(16, 16); // L: 411
			Rasterizer3D.field2492 = false; // L: 412
			if (var9.placeholderTemplate != -1) { // L: 413
				var20.drawTransBgAt(0, 0);
			}

			int var16 = var9.zoom2d; // L: 414
			if (var5) { // L: 415
				var16 = (int)(1.5D * (double)var16);
			} else if (var2 == 2) { // L: 416
				var16 = (int)(1.04D * (double)var16);
			}

			int var17 = var16 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16; // L: 417
			int var18 = var16 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16; // L: 418
			var19.calculateBoundsCylinder(); // L: 419
			var19.method4651(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var19.height / 2 + var17 + var9.offsetY2d, var18 + var9.offsetY2d); // L: 420
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
				ItemComposition.ItemComposition_fontPlain11.draw(class290.method5488(var1), 0, 9, 16776960, 1); // L: 428
			}

			if (!var5) { // L: 430
				ItemComposition.ItemComposition_cachedSprites.put(var8, var6);
			}

			Rasterizer2D.Rasterizer2D_replace(var12, var13, var14); // L: 431
			Rasterizer2D.Rasterizer2D_setClipArray(var15); // L: 432
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 433
			Rasterizer3D.field2492 = true; // L: 434
			return var8; // L: 435
		}
	}
}
