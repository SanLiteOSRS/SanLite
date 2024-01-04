import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nw")
public class class348 {
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1820269009
	)
	public static int field3825;
	@ObfuscatedName("pu")
	@ObfuscatedGetter(
		intValue = 592055015
	)
	static int field3826;

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(IIIIZB)V",
		garbageValue = "-10"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) { // L: 4956
			var2 = 1;
		}

		if (var3 < 1) { // L: 4957
			var3 = 1;
		}

		int var5 = var3 - 334; // L: 4958
		int var6;
		if (var5 < 0) { // L: 4960
			var6 = Client.field760;
		} else if (var5 >= 100) { // L: 4961
			var6 = Client.field761;
		} else {
			var6 = (Client.field761 - Client.field760) * var5 / 100 + Client.field760; // L: 4962
		}

		int var7 = var3 * var6 * 512 / (var2 * 334); // L: 4963
		int var8;
		int var9;
		short var10;
		if (var7 < Client.field531) { // L: 4964
			var10 = Client.field531; // L: 4965
			var6 = var10 * var2 * 334 / (var3 * 512); // L: 4966
			if (var6 > Client.field765) { // L: 4967
				var6 = Client.field765; // L: 4968
				var8 = var3 * var6 * 512 / (var10 * 334); // L: 4969
				var9 = (var2 - var8) / 2; // L: 4970
				if (var4) { // L: 4971
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4972
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216); // L: 4973
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216); // L: 4974
				}

				var0 += var9; // L: 4976
				var2 -= var9 * 2; // L: 4977
			}
		} else if (var7 > Client.field722) { // L: 4980
			var10 = Client.field722; // L: 4981
			var6 = var10 * var2 * 334 / (var3 * 512); // L: 4982
			if (var6 < Client.field764) { // L: 4983
				var6 = Client.field764; // L: 4984
				var8 = var10 * var2 * 334 / (var6 * 512); // L: 4985
				var9 = (var3 - var8) / 2; // L: 4986
				if (var4) { // L: 4987
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4988
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216); // L: 4989
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216); // L: 4990
				}

				var1 += var9; // L: 4992
				var3 -= var9 * 2; // L: 4993
			}
		}

		Client.viewportZoom = var3 * var6 / 334; // L: 4996
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) { // L: 4997
			class102.method2743(var2, var3); // L: 4998
		}

		Client.viewportOffsetX = var0; // L: 5000
		Client.viewportOffsetY = var1; // L: 5001
		Client.viewportWidth = var2; // L: 5002
		Client.viewportHeight = var3; // L: 5003
	} // L: 5004

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)V",
		garbageValue = "1443967648"
	)
	static final void method6831(Widget var0) {
		int var1 = var0.contentType; // L: 12424
		if (var1 == 324) { // L: 12425
			if (Client.field774 == -1) { // L: 12426
				Client.field774 = var0.spriteId2; // L: 12427
				Client.field720 = var0.spriteId; // L: 12428
			}

			if (Client.playerAppearance.field3600 == 1) { // L: 12430
				var0.spriteId2 = Client.field774;
			} else {
				var0.spriteId2 = Client.field720; // L: 12431
			}

		} else if (var1 == 325) { // L: 12434
			if (Client.field774 == -1) { // L: 12435
				Client.field774 = var0.spriteId2; // L: 12436
				Client.field720 = var0.spriteId; // L: 12437
			}

			if (Client.playerAppearance.field3600 == 1) { // L: 12439
				var0.spriteId2 = Client.field720;
			} else {
				var0.spriteId2 = Client.field774; // L: 12440
			}

		} else if (var1 == 327) { // L: 12443
			var0.modelAngleX = 150; // L: 12444
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 12445
			var0.modelType = 5; // L: 12446
			var0.modelId = 0; // L: 12447
		} else if (var1 == 328) { // L: 12450
			var0.modelAngleX = 150; // L: 12451
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 12452
			var0.modelType = 5; // L: 12453
			var0.modelId = 1; // L: 12454
		}
	} // L: 12432 12441 12448 12455 12457
}
