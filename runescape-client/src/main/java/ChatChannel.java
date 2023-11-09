import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("au")
	@Export("hasFocus")
	protected static boolean hasFocus;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("archive14")
	static Archive archive14;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "[Lbk;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -709054483
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100]; // L: 78
	} // L: 81

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbk;",
		garbageValue = "349940904"
	)
	@Export("addMessage")
	Message addMessage(int var1, String var2, String var3, String var4) {
		Message var5 = this.messages[99]; // L: 84

		for (int var6 = this.count; var6 > 0; --var6) { // L: 85
			if (var6 != 100) { // L: 86
				this.messages[var6] = this.messages[var6 - 1]; // L: 87
			}
		}

		if (var5 == null) { // L: 89
			var5 = new Message(var1, var2, var4, var3);
		} else {
			var5.remove(); // L: 91
			var5.removeDual(); // L: 92
			var5.set(var1, var2, var4, var3); // L: 93
		}

		this.messages[0] = var5; // L: 95
		if (this.count < 100) { // L: 96
			++this.count;
		}

		return var5; // L: 97
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lbk;",
		garbageValue = "758824821"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null; // L: 101 102
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-59"
	)
	@Export("size")
	int size() {
		return this.count; // L: 106
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZB)Lri;",
		garbageValue = "-28"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) { // L: 371
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) { // L: 372
			var4 = 1;
		}

		long var6 = ((long)var2 << 38) + ((long)var1 << 16) + (long)var0 + ((long)var4 << 40) + ((long)var3 << 42); // L: 373
		SpritePixels var8;
		if (!var5) { // L: 375
			var8 = (SpritePixels)ItemComposition.ItemComposition_cachedSprites.get(var6); // L: 376
			if (var8 != null) { // L: 377
				return var8;
			}
		}

		ItemComposition var9 = MidiPcmStream.ItemComposition_get(var0); // L: 379
		if (var1 > 1 && var9.countobj != null) { // L: 380
			int var10 = -1; // L: 381

			for (int var11 = 0; var11 < 10; ++var11) { // L: 382
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) { // L: 383
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) { // L: 385
				var9 = MidiPcmStream.ItemComposition_get(var10);
			}
		}

		Model var21 = var9.getModel(1); // L: 387
		if (var21 == null) { // L: 388
			return null;
		} else {
			SpritePixels var22 = null; // L: 389
			if (var9.noteTemplate != -1) { // L: 390
				var22 = getItemSprite(var9.note, 10, 1, 0, 0, true); // L: 391
				if (var22 == null) { // L: 392
					return null;
				}
			} else if (var9.notedId != -1) { // L: 394
				var22 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false); // L: 395
				if (var22 == null) { // L: 396
					return null;
				}
			} else if (var9.placeholderTemplate != -1) { // L: 398
				var22 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false); // L: 399
				if (var22 == null) { // L: 400
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
			Rasterizer3D.method4192(16, 16); // L: 411
			Rasterizer3D.field2414 = false; // L: 412
			if (var9.placeholderTemplate != -1) { // L: 413
				var22.drawTransBgAt(0, 0);
			}

			int var16 = var9.zoom2d; // L: 414
			if (var5) { // L: 415
				var16 = (int)((double)var16 * 1.5D);
			} else if (var2 == 2) { // L: 416
				var16 = (int)((double)var16 * 1.04D);
			}

			int var17 = var16 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16; // L: 417
			int var18 = var16 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16; // L: 418
			var21.calculateBoundsCylinder(); // L: 419
			var21.method4590(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var21.height / 2 + var17 + var9.offsetY2d, var18 + var9.offsetY2d); // L: 420
			if (var9.notedId != -1) { // L: 421
				var22.drawTransBgAt(0, 0);
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
				var22.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) { // L: 427
				Font var19 = class139.ItemComposition_fontPlain11; // L: 428
				String var20;
				if (var1 < 100000) { // L: 431
					var20 = "<col=ffff00>" + var1 + "</col>"; // L: 432
				} else if (var1 < 10000000) { // L: 435
					var20 = "<col=ffffff>" + var1 / 1000 + "K" + "</col>"; // L: 436
				} else {
					var20 = "<col=00ff80>" + var1 / 1000000 + "M" + "</col>"; // L: 439
				}

				var19.draw(var20, 0, 9, 16776960, 1); // L: 441
			}

			if (!var5) { // L: 443
				ItemComposition.ItemComposition_cachedSprites.put(var8, var6);
			}

			Rasterizer2D.Rasterizer2D_replace(var12, var13, var14); // L: 444
			Rasterizer2D.Rasterizer2D_setClipArray(var15); // L: 445
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 446
			Rasterizer3D.field2414 = true; // L: 447
			return var8; // L: 448
		}
	}
}
