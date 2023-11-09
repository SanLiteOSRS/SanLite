import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("w")
	static final int[] field1991;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -867331759
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 978684669
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1206369175
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
		field1991 = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) { // L: 19
			field1991[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)V",
		garbageValue = "721119227"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqw;II)V",
		garbageValue = "1497343851"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 34
			this.baseVar = var1.readUnsignedShort();
			this.startBit = var1.readUnsignedByte();
			this.endBit = var1.readUnsignedByte();
		}

	} // L: 40

	@ObfuscatedName("o")
	public static final int method3556(double var0, double var2, double var4) {
		double var6 = var4; // L: 9
		double var8 = var4; // L: 10
		double var10 = var4; // L: 11
		if (var2 != 0.0D) { // L: 12
			double var12;
			if (var4 < 0.5D) { // L: 14
				var12 = (1.0D + var2) * var4;
			} else {
				var12 = var2 + var4 - var4 * var2; // L: 15
			}

			double var14 = 2.0D * var4 - var12; // L: 16
			double var16 = var0 + 0.3333333333333333D; // L: 17
			if (var16 > 1.0D) { // L: 18
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D; // L: 20
			if (var20 < 0.0D) { // L: 21
				++var20;
			}

			if (6.0D * var16 < 1.0D) { // L: 22
				var6 = var16 * (var12 - var14) * 6.0D + var14;
			} else if (2.0D * var16 < 1.0D) { // L: 23
				var6 = var12;
			} else if (var16 * 3.0D < 2.0D) { // L: 24
				var6 = var14 + (var12 - var14) * (0.6666666666666666D - var16) * 6.0D;
			} else {
				var6 = var14; // L: 25
			}

			if (var0 * 6.0D < 1.0D) { // L: 26
				var8 = var14 + 6.0D * (var12 - var14) * var0;
			} else if (var0 * 2.0D < 1.0D) { // L: 27
				var8 = var12;
			} else if (var0 * 3.0D < 2.0D) {
				var8 = var14 + (0.6666666666666666D - var0) * (var12 - var14) * 6.0D; // L: 28
			} else {
				var8 = var14; // L: 29
			}

			if (var20 * 6.0D < 1.0D) { // L: 30
				var10 = 6.0D * (var12 - var14) * var20 + var14;
			} else if (var20 * 2.0D < 1.0D) { // L: 31
				var10 = var12;
			} else if (var20 * 3.0D < 2.0D) { // L: 32
				var10 = (0.6666666666666666D - var20) * (var12 - var14) * 6.0D + var14;
			} else {
				var10 = var14; // L: 33
			}
		}

		int var22 = (int)(256.0D * var6); // L: 35
		int var13 = (int)(var8 * 256.0D); // L: 36
		int var23 = (int)(256.0D * var10); // L: 37
		int var15 = var23 + (var13 << 8) + (var22 << 16); // L: 38
		return var15; // L: 39
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)Lqj;",
		garbageValue = "-876125855"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) { // L: 357
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) { // L: 358
			var4 = 1;
		}

		long var6 = ((long)var4 << 40) + ((long)var2 << 38) + ((long)var1 << 16) + (long)var0 + ((long)var3 << 42); // L: 359
		SpritePixels var8;
		if (!var5) { // L: 361
			var8 = (SpritePixels)ItemComposition.ItemComposition_cachedSprites.get(var6); // L: 362
			if (var8 != null) { // L: 363
				return var8;
			}
		}

		ItemComposition var9 = class258.ItemComposition_get(var0); // L: 365
		if (var1 > 1 && var9.countobj != null) { // L: 366
			int var10 = -1; // L: 367

			for (int var11 = 0; var11 < 10; ++var11) { // L: 368
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) { // L: 369
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) { // L: 371
				var9 = class258.ItemComposition_get(var10);
			}
		}

		Model var21 = var9.getModel(1); // L: 373
		if (var21 == null) { // L: 374
			return null;
		} else {
			SpritePixels var22 = null; // L: 375
			if (var9.noteTemplate != -1) { // L: 376
				var22 = getItemSprite(var9.note, 10, 1, 0, 0, true); // L: 377
				if (var22 == null) { // L: 378
					return null;
				}
			} else if (var9.notedId != -1) { // L: 380
				var22 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false); // L: 381
				if (var22 == null) { // L: 382
					return null;
				}
			} else if (var9.placeholderTemplate != -1) { // L: 384
				var22 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false); // L: 385
				if (var22 == null) { // L: 386
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels; // L: 388
			int var13 = Rasterizer2D.Rasterizer2D_width; // L: 389
			int var14 = Rasterizer2D.Rasterizer2D_height; // L: 390
			int[] var15 = new int[4]; // L: 391
			Rasterizer2D.Rasterizer2D_getClipArray(var15); // L: 392
			var8 = new SpritePixels(36, 32); // L: 393
			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32); // L: 394
			Rasterizer2D.Rasterizer2D_clear(); // L: 395
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 396
			Rasterizer3D.method4043(16, 16); // L: 397
			Rasterizer3D.field2331 = false; // L: 398
			if (var9.placeholderTemplate != -1) { // L: 399
				var22.drawTransBgAt(0, 0);
			}

			int var16 = var9.zoom2d; // L: 400
			if (var5) { // L: 401
				var16 = (int)((double)var16 * 1.5D);
			} else if (var2 == 2) { // L: 402
				var16 = (int)((double)var16 * 1.04D);
			}

			int var17 = var16 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16; // L: 403
			int var18 = var16 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16; // L: 404
			var21.calculateBoundsCylinder(); // L: 405
			var21.method4366(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var21.height / 2 + var17 + var9.offsetY2d, var18 + var9.offsetY2d); // L: 406
			if (var9.notedId != -1) { // L: 407
				var22.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) { // L: 408
				var8.outline(1);
			}

			if (var2 >= 2) { // L: 409
				var8.outline(16777215);
			}

			if (var3 != 0) { // L: 410
				var8.shadow(var3);
			}

			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32); // L: 411
			if (var9.noteTemplate != -1) { // L: 412
				var22.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) { // L: 413
				Font var19 = class341.ItemComposition_fontPlain11; // L: 414
				String var20;
				if (var1 < 100000) { // L: 417
					var20 = "<col=ffff00>" + var1 + "</col>"; // L: 418
				} else if (var1 < 10000000) { // L: 421
					var20 = "<col=ffffff>" + var1 / 1000 + "K" + "</col>"; // L: 422
				} else {
					var20 = "<col=00ff80>" + var1 / 1000000 + "M" + "</col>"; // L: 425
				}

				var19.draw(var20, 0, 9, 16776960, 1); // L: 427
			}

			if (!var5) { // L: 429
				ItemComposition.ItemComposition_cachedSprites.put(var8, var6);
			}

			Rasterizer2D.Rasterizer2D_replace(var12, var13, var14); // L: 430
			Rasterizer2D.Rasterizer2D_setClipArray(var15); // L: 431
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 432
			Rasterizer3D.field2331 = true; // L: 433
			return var8; // L: 434
		}
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "917156048"
	)
	static final void method3557(int var0, int var1) {
		if (Client.menuOptionsCount >= 2 || Client.isItemSelected != 0 || Client.isSpellSelected) { // L: 8331
			if (Client.showMouseOverText) { // L: 8332
				int var2 = Player.method2211(); // L: 8333
				String var3;
				if (Client.isItemSelected == 1 && Client.menuOptionsCount < 2) { // L: 8335
					var3 = "Use" + " " + Client.selectedItemName + " " + "->";
				} else if (Client.isSpellSelected && Client.menuOptionsCount < 2) { // L: 8336
					var3 = Client.selectedSpellActionName + " " + Client.selectedSpellName + " " + "->";
				} else {
					var3 = ClanChannelMember.method2906(var2); // L: 8337
				}

				if (Client.menuOptionsCount > 2) { // L: 8338
					var3 = var3 + class82.colorStartTag(16777215) + " " + '/' + " " + (Client.menuOptionsCount - 2) + " more options";
				}

				class116.fontBold12.drawRandomAlphaAndSpacing(var3, var0 + 4, var1 + 15, 16777215, 0, Client.cycle / 1000); // L: 8339
			}
		}
	} // L: 8340
}
