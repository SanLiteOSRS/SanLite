import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
public class class252 implements WorldMapSection {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1060807941
	)
	int field2942;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1519014345
	)
	int field2945;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 268581205
	)
	int field2937;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 362794351
	)
	int field2939;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 646918937
	)
	int field2936;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2085428027
	)
	int field2947;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 605272271
	)
	int field2941;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -2012178411
	)
	int field2943;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -562033999
	)
	int field2944;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1104824061
	)
	int field2940;

	class252() {
	} // L: 18

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljs;I)V",
		garbageValue = "1131699138"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2936) { // L: 22
			var1.regionLowX = this.field2936;
		}

		if (var1.regionHighX < this.field2936) {
			var1.regionHighX = this.field2936; // L: 23
		}

		if (var1.regionLowY > this.field2947) {
			var1.regionLowY = this.field2947;
		}

		if (var1.regionHighY < this.field2947) {
			var1.regionHighY = this.field2947;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "3"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2942 && var1 < this.field2945 + this.field2942) { // L: 30
			return var2 >= (this.field2937 << 6) + (this.field2941 << 3) && var2 <= (this.field2937 << 6) + (this.field2941 << 3) + 7 && var3 >= (this.field2939 << 6) + (this.field2943 << 3) && var3 <= (this.field2939 << 6) + (this.field2943 << 3) + 7; // L: 33
		} else {
			return false; // L: 31
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1795894381"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field2936 << 6) + (this.field2944 << 3) && var1 <= (this.field2936 << 6) + (this.field2944 << 3) + 7 && var2 >= (this.field2947 << 6) + (this.field2940 << 3) && var2 <= (this.field2947 << 6) + (this.field2940 << 3) + 7; // L: 38
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "21"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 43
			return null; // L: 44
		} else {
			int[] var4 = new int[]{this.field2936 * 64 - this.field2937 * 64 + var2 + (this.field2944 * 8 - this.field2941 * 8), var3 + (this.field2947 * 64 - this.field2939 * 64) + (this.field2940 * 8 - this.field2943 * 8)}; // L: 46 47 48
			return var4; // L: 49
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIB)Llb;",
		garbageValue = "-4"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 54
			return null; // L: 55
		} else {
			int var3 = this.field2937 * 64 - this.field2936 * 64 + (this.field2941 * 8 - this.field2944 * 8) + var1; // L: 57
			int var4 = this.field2939 * 64 - this.field2947 * 64 + var2 + (this.field2943 * 8 - this.field2940 * 8); // L: 58
			return new Coord(this.field2942, var3, var4); // L: 59
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lsg;B)V",
		garbageValue = "0"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field2942 = var1.readUnsignedByte(); // L: 64
		this.field2945 = var1.readUnsignedByte(); // L: 65
		this.field2937 = var1.readUnsignedShort(); // L: 66
		this.field2941 = var1.readUnsignedByte(); // L: 67
		this.field2939 = var1.readUnsignedShort(); // L: 68
		this.field2943 = var1.readUnsignedByte(); // L: 69
		this.field2936 = var1.readUnsignedShort(); // L: 70
		this.field2944 = var1.readUnsignedByte(); // L: 71
		this.field2947 = var1.readUnsignedShort(); // L: 72
		this.field2940 = var1.readUnsignedByte(); // L: 73
		this.method5347(); // L: 74
	} // L: 75

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1809982320"
	)
	void method5347() {
	} // L: 77

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1949946238"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var1 = class158.method3409(var0); // L: 24
		int var2 = var1.baseVar; // L: 25
		int var3 = var1.startBit; // L: 26
		int var4 = var1.endBit; // L: 27
		int var5 = Varps.Varps_masks[var4 - var3]; // L: 28
		return Varps.Varps_main[var2] >> var3 & var5; // L: 29
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)Ltq;",
		garbageValue = "13705148"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) { // L: 373
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) { // L: 374
			var4 = 1;
		}

		long var6 = ((long)var2 << 38) + (long)var0 + ((long)var1 << 16) + ((long)var4 << 40) + ((long)var3 << 42); // L: 375
		SpritePixels var8;
		if (!var5) { // L: 377
			var8 = (SpritePixels)ItemComposition.ItemComposition_cachedSprites.get(var6); // L: 378
			if (var8 != null) { // L: 379
				return var8;
			}
		}

		ItemComposition var9 = HealthBarUpdate.ItemComposition_get(var0); // L: 381
		if (var1 > 1 && var9.countobj != null) { // L: 382
			int var10 = -1; // L: 383

			for (int var11 = 0; var11 < 10; ++var11) { // L: 384
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) { // L: 385
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) { // L: 387
				var9 = HealthBarUpdate.ItemComposition_get(var10);
			}
		}

		Model var20 = var9.getModel(1); // L: 389
		if (var20 == null) { // L: 390
			return null;
		} else {
			SpritePixels var21 = null; // L: 391
			if (var9.noteTemplate != -1) { // L: 392
				var21 = getItemSprite(var9.note, 10, 1, 0, 0, true); // L: 393
				if (var21 == null) { // L: 394
					return null;
				}
			} else if (var9.notedId != -1) { // L: 396
				var21 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false); // L: 397
				if (var21 == null) { // L: 398
					return null;
				}
			} else if (var9.placeholderTemplate != -1) { // L: 400
				var21 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false); // L: 401
				if (var21 == null) { // L: 402
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels; // L: 404
			int var13 = Rasterizer2D.Rasterizer2D_width; // L: 405
			int var14 = Rasterizer2D.Rasterizer2D_height; // L: 406
			float[] var15 = Rasterizer2D.field5062; // L: 407
			int[] var16 = new int[4]; // L: 408
			Rasterizer2D.Rasterizer2D_getClipArray(var16); // L: 409
			var8 = new SpritePixels(36, 32); // L: 410
			class1.method8(var8.pixels, 36, 32, (float[])null); // L: 411
			Rasterizer2D.Rasterizer2D_clear(); // L: 412
			class18.method271(); // L: 413
			WorldMapArea.method5163(16, 16); // L: 414
			Rasterizer3D.field2514.field2789 = false; // L: 415
			if (var9.placeholderTemplate != -1) { // L: 416
				var21.drawTransBgAt(0, 0);
			}

			int var17 = var9.zoom2d; // L: 417
			if (var5) { // L: 418
				var17 = (int)(1.5D * (double)var17);
			} else if (var2 == 2) { // L: 419
				var17 = (int)((double)var17 * 1.04D);
			}

			int var18 = var17 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16; // L: 420
			int var19 = var17 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16; // L: 421
			var20.calculateBoundsCylinder(); // L: 422
			var20.method4863(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var20.height / 2 + var18 + var9.offsetY2d, var19 + var9.offsetY2d); // L: 423
			if (var9.notedId != -1) { // L: 424
				var21.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) { // L: 425
				var8.outline(1);
			}

			if (var2 >= 2) { // L: 426
				var8.outline(16777215);
			}

			if (var3 != 0) { // L: 427
				var8.shadow(var3);
			}

			class1.method8(var8.pixels, 36, 32, (float[])null); // L: 428
			if (var9.noteTemplate != -1) { // L: 429
				var21.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) { // L: 430
				class124.ItemComposition_fontPlain11.draw(class101.method2690(var1), 0, 9, 16776960, 1); // L: 431
			}

			if (!var5) { // L: 433
				ItemComposition.ItemComposition_cachedSprites.put(var8, var6);
			}

			class1.method8(var12, var13, var14, var15); // L: 434
			Rasterizer2D.Rasterizer2D_setClipArray(var16); // L: 435
			class18.method271(); // L: 436
			Rasterizer3D.field2514.field2789 = true; // L: 437
			return var8; // L: 438
		}
	}
}
