import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("at")
	@Export("args")
	Object[] args;
	@ObfuscatedName("an")
	boolean field1062;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 137252357
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 888971081
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -9435197
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1805769917
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -380351307
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("af")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 709030475
	)
	int field1068;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -973006819
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76; // L: 19
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)V",
		garbageValue = "-1381456396"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1; // L: 22
	} // L: 23

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1; // L: 26
	} // L: 27

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lmb;I)V",
		garbageValue = "-1316793713"
	)
	public void method2247(Widget var1) {
		this.widget = var1; // L: 30
	} // L: 31

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)Ltm;",
		garbageValue = "619092027"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) { // L: 375
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) { // L: 376
			var4 = 1;
		}

		long var6 = ((long)var2 << 38) + (long)var0 + ((long)var1 << 16) + ((long)var4 << 40) + ((long)var3 << 42); // L: 377
		SpritePixels var8;
		if (!var5) { // L: 379
			var8 = (SpritePixels)ItemComposition.ItemComposition_cachedSprites.get(var6); // L: 380
			if (var8 != null) { // L: 381
				return var8;
			}
		}

		ItemComposition var9 = class300.ItemComposition_get(var0); // L: 383
		if (var1 > 1 && var9.countobj != null) { // L: 384
			int var10 = -1; // L: 385

			for (int var11 = 0; var11 < 10; ++var11) { // L: 386
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) { // L: 387
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) { // L: 389
				var9 = class300.ItemComposition_get(var10);
			}
		}

		Model var22 = var9.getModel(1); // L: 391
		if (var22 == null) { // L: 392
			return null;
		} else {
			SpritePixels var23 = null; // L: 393
			if (var9.noteTemplate != -1) { // L: 394
				var23 = getItemSprite(var9.note, 10, 1, 0, 0, true); // L: 395
				if (var23 == null) { // L: 396
					return null;
				}
			} else if (var9.notedId != -1) { // L: 398
				var23 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false); // L: 399
				if (var23 == null) { // L: 400
					return null;
				}
			} else if (var9.placeholderTemplate != -1) { // L: 402
				var23 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false); // L: 403
				if (var23 == null) { // L: 404
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels; // L: 406
			int var13 = Rasterizer2D.Rasterizer2D_width; // L: 407
			int var14 = Rasterizer2D.Rasterizer2D_height; // L: 408
			float[] var15 = Rasterizer2D.field5088; // L: 409
			int[] var16 = new int[4]; // L: 410
			Rasterizer2D.Rasterizer2D_getClipArray(var16); // L: 411
			var8 = new SpritePixels(36, 32); // L: 412
			Rasterizer3D.method4383(var8.pixels, 36, 32, (float[])null); // L: 413
			Rasterizer2D.Rasterizer2D_clear(); // L: 414
			Rasterizer3D.method4382(); // L: 415
			Rasterizer3D.method4387(16, 16); // L: 416
			Rasterizer3D.field2520.field2805 = false; // L: 417
			if (var9.placeholderTemplate != -1) { // L: 418
				var23.drawTransBgAt(0, 0);
			}

			int var17 = var9.zoom2d; // L: 419
			if (var5) { // L: 420
				var17 = (int)(1.5D * (double)var17);
			} else if (var2 == 2) { // L: 421
				var17 = (int)(1.04D * (double)var17);
			}

			int var18 = var17 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16; // L: 422
			int var19 = var17 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16; // L: 423
			var22.calculateBoundsCylinder(); // L: 424
			var22.method4798(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var22.height / 2 + var18 + var9.offsetY2d, var19 + var9.offsetY2d); // L: 425
			if (var9.notedId != -1) { // L: 426
				var23.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) { // L: 427
				var8.outline(1);
			}

			if (var2 >= 2) { // L: 428
				var8.outline(16777215);
			}

			if (var3 != 0) { // L: 429
				var8.shadow(var3);
			}

			Rasterizer3D.method4383(var8.pixels, 36, 32, (float[])null); // L: 430
			if (var9.noteTemplate != -1) { // L: 431
				var23.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) { // L: 432
				Font var20 = class259.ItemComposition_fontPlain11; // L: 433
				String var21;
				if (var1 < 100000) { // L: 436
					var21 = "<col=ffff00>" + var1 + "</col>"; // L: 437
				} else if (var1 < 10000000) { // L: 440
					var21 = "<col=ffffff>" + var1 / 1000 + "K" + "</col>"; // L: 441
				} else {
					var21 = "<col=00ff80>" + var1 / 1000000 + "M" + "</col>"; // L: 444
				}

				var20.draw(var21, 0, 9, 16776960, 1); // L: 446
			}

			if (!var5) { // L: 448
				ItemComposition.ItemComposition_cachedSprites.put(var8, var6);
			}

			Rasterizer3D.method4383(var12, var13, var14, var15); // L: 449
			Rasterizer2D.Rasterizer2D_setClipArray(var16); // L: 450
			Rasterizer3D.method4382(); // L: 451
			Rasterizer3D.field2520.field2805 = true; // L: 452
			return var8; // L: 453
		}
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-85927989"
	)
	static final void method2256(int var0, int var1, int var2, int var3) {
		Client.field626 = 0; // L: 5767
		int var4 = class213.baseX * 64 + (Projectile.localPlayer.x >> 7); // L: 5768
		int var5 = class101.baseY * 64 + (Projectile.localPlayer.y >> 7); // L: 5769
		if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) { // L: 5770
			Client.field626 = 1;
		}

		if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
			Client.field626 = 1; // L: 5771
		}

		if (Client.field626 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) { // L: 5772
			Client.field626 = 0;
		}

	} // L: 5774
}
