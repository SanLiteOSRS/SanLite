import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
@Implements("World")
public class World {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1367913585
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1736008319
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("an")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("au")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ler;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	static Archive field813;
	@ObfuscatedName("kq")
	@ObfuscatedGetter(
		intValue = 1726050961
	)
	@Export("cameraZ")
	static int cameraZ;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1676904917
	)
	@Export("id")
	int id;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -329142105
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 407745977
	)
	@Export("population")
	int population;
	@ObfuscatedName("am")
	@Export("host")
	String host;
	@ObfuscatedName("ag")
	@Export("activity")
	String activity;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1472078803
	)
	@Export("location")
	int location;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -71145217
	)
	@Export("index")
	int index;
	@ObfuscatedName("ad")
	String field815;

	static {
		World_count = 0; // L: 14
		World_listCount = 0; // L: 15
		World_sortOption2 = new int[]{1, 1, 1, 1}; // L: 16
		World_sortOption1 = new int[]{0, 1, 2, 3}; // L: 17
	}

	World() {
	} // L: 28

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1069822072"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (1 & this.properties) != 0; // L: 258
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-48"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (65536 & this.properties) != 0; // L: 262
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "103"
	)
	boolean method1814() {
		return (2 & this.properties) != 0; // L: 266
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "44"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (4 & this.properties) != 0; // L: 270
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-37"
	)
	boolean method1816() {
		return (8 & this.properties) != 0; // L: 274
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1174235987"
	)
	boolean method1836() {
		return (536870912 & this.properties) != 0; // L: 278
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1115345421"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (33554432 & this.properties) != 0; // L: 282
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "365"
	)
	boolean method1823() {
		return (1073741824 & this.properties) != 0; // L: 286
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-5"
	)
	boolean method1826() {
		return (256 & this.properties) != 0; // L: 290
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1790735618"
	)
	boolean method1821() {
		return (134217728 & this.properties) != 0; // L: 294
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnr;II)V",
		garbageValue = "2019426838"
	)
	static void method1856(AbstractArchive var0, int var1) {
		if ((var1 & 536870912) != 0) { // L: 331
			Login.logoSprite = UserComparator4.SpriteBuffer_getIndexedSpriteByName(var0, "logo_deadman_mode", ""); // L: 332
		} else if ((var1 & 1073741824) != 0) { // L: 334
			Login.logoSprite = UserComparator4.SpriteBuffer_getIndexedSpriteByName(var0, "logo_seasonal_mode", ""); // L: 335
		} else if ((var1 & 256) != 0) { // L: 337
			Login.logoSprite = UserComparator4.SpriteBuffer_getIndexedSpriteByName(var0, "logo_speedrunning", ""); // L: 338
		} else {
			Login.logoSprite = UserComparator4.SpriteBuffer_getIndexedSpriteByName(var0, "logo", ""); // L: 341
		}

	} // L: 343

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZB)Luq;",
		garbageValue = "5"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) { // L: 377
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) { // L: 378
			var4 = 1;
		}

		long var6 = ((long)var1 << 16) + (long)var0 + ((long)var2 << 38) + ((long)var4 << 40) + ((long)var3 << 42); // L: 379
		SpritePixels var8;
		if (!var5) { // L: 381
			var8 = (SpritePixels)ItemComposition.ItemComposition_cachedSprites.get(var6); // L: 382
			if (var8 != null) { // L: 383
				return var8;
			}
		}

		ItemComposition var9 = class141.ItemComposition_get(var0); // L: 385
		if (var1 > 1 && var9.countobj != null) { // L: 386
			int var10 = -1; // L: 387

			for (int var11 = 0; var11 < 10; ++var11) { // L: 388
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) { // L: 389
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) { // L: 391
				var9 = class141.ItemComposition_get(var10);
			}
		}

		Model var20 = var9.getModel(1); // L: 393
		if (var20 == null) { // L: 394
			return null;
		} else {
			SpritePixels var21 = null; // L: 395
			if (var9.noteTemplate != -1) { // L: 396
				var21 = getItemSprite(var9.note, 10, 1, 0, 0, true); // L: 397
				if (var21 == null) { // L: 398
					return null;
				}
			} else if (var9.notedId != -1) { // L: 400
				var21 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false); // L: 401
				if (var21 == null) { // L: 402
					return null;
				}
			} else if (var9.placeholderTemplate != -1) { // L: 404
				var21 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false); // L: 405
				if (var21 == null) { // L: 406
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels; // L: 408
			int var13 = Rasterizer2D.Rasterizer2D_width; // L: 409
			int var14 = Rasterizer2D.Rasterizer2D_height; // L: 410
			float[] var15 = Rasterizer2D.field5132; // L: 411
			int[] var16 = new int[4]; // L: 412
			Rasterizer2D.Rasterizer2D_getClipArray(var16); // L: 413
			var8 = new SpritePixels(36, 32); // L: 414
			Rasterizer3D.method4475(var8.pixels, 36, 32, (float[])null); // L: 415
			Rasterizer2D.Rasterizer2D_clear(); // L: 416
			Rasterizer3D.method4490(); // L: 417
			Rasterizer3D.method4493(16, 16); // L: 418
			Rasterizer3D.field2528.field2798 = false; // L: 419
			if (var9.placeholderTemplate != -1) { // L: 420
				var21.drawTransBgAt(0, 0);
			}

			int var17 = var9.zoom2d; // L: 421
			if (var5) { // L: 422
				var17 = (int)(1.5D * (double)var17);
			} else if (var2 == 2) { // L: 423
				var17 = (int)((double)var17 * 1.04D);
			}

			int var18 = var17 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16; // L: 424
			int var19 = var17 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16; // L: 425
			var20.calculateBoundsCylinder(); // L: 426
			var20.method4897(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var20.height / 2 + var18 + var9.offsetY2d, var19 + var9.offsetY2d); // L: 427
			if (var9.notedId != -1) { // L: 428
				var21.drawTransBgAt(0, 0);
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

			Rasterizer3D.method4475(var8.pixels, 36, 32, (float[])null); // L: 432
			if (var9.noteTemplate != -1) { // L: 433
				var21.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) { // L: 434
				class290.field3096.draw(ObjectComposition.method4075(var1), 0, 9, 16776960, 1); // L: 435
			}

			if (!var5) { // L: 437
				ItemComposition.ItemComposition_cachedSprites.put(var8, var6);
			}

			Rasterizer3D.method4475(var12, var13, var14, var15); // L: 438
			Rasterizer2D.Rasterizer2D_setClipArray(var16); // L: 439
			Rasterizer3D.method4490(); // L: 440
			Rasterizer3D.field2528.field2798 = true; // L: 441
			return var8; // L: 442
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lbd;I)V",
		garbageValue = "891481009"
	)
	public static final void method1848(class51 var0) {
		class260.pcmPlayerProvider = var0; // L: 45
	} // L: 46

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(ILmk;ZI)V",
		garbageValue = "857592213"
	)
	static void method1863(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = AbstractUserComparator.getWorldMap().getMapArea(var0); // L: 5299
		int var4 = class27.localPlayer.plane; // L: 5300
		int var5 = class166.baseX * 64 + (class27.localPlayer.x >> 7); // L: 5301
		int var6 = class9.baseY * 64 + (class27.localPlayer.y >> 7); // L: 5302
		Coord var7 = new Coord(var4, var5, var6); // L: 5303
		AbstractUserComparator.getWorldMap().method8522(var3, var7, var1, var2); // L: 5304
	} // L: 5305
}
