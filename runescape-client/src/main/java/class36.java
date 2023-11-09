import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bt")
public class class36 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "[Ltq;"
	)
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;
	@ObfuscatedName("kx")
	@ObfuscatedGetter(
		intValue = -2100544359
	)
	@Export("cameraX")
	static int cameraX;

	static {
		reflectionChecks = new IterableNodeDeque(); // L: 17
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-32"
	)
	static void method722() {
		if (class126.worldMap != null) { // L: 4224
			class126.worldMap.method8628(GameEngine.Client_plane, WorldMapData_0.baseX * 64 + (MusicPatchNode.localPlayer.x >> 7), GameObject.baseY * 64 + (MusicPatchNode.localPlayer.y >> 7), false); // L: 4225
			class126.worldMap.loadCache(); // L: 4226
		}

	} // L: 4228

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-1386012109"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) { // L: 4681
			var2 = 1;
		}

		if (var3 < 1) { // L: 4682
			var3 = 1;
		}

		int var5 = var3 - 334; // L: 4683
		int var6;
		if (var5 < 0) { // L: 4685
			var6 = Client.field758;
		} else if (var5 >= 100) { // L: 4686
			var6 = Client.field759;
		} else {
			var6 = (Client.field759 - Client.field758) * var5 / 100 + Client.field758; // L: 4687
		}

		int var7 = var3 * var6 * 512 / (var2 * 334); // L: 4688
		int var8;
		int var9;
		short var17;
		if (var7 < Client.field620) { // L: 4689
			var17 = Client.field620; // L: 4690
			var6 = var17 * var2 * 334 / (var3 * 512); // L: 4691
			if (var6 > Client.field763) { // L: 4692
				var6 = Client.field763; // L: 4693
				var8 = var3 * var6 * 512 / (var17 * 334); // L: 4694
				var9 = (var2 - var8) / 2; // L: 4695
				if (var4) { // L: 4696
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4697
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216); // L: 4698
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216); // L: 4699
				}

				var0 += var9; // L: 4701
				var2 -= var9 * 2; // L: 4702
			}
		} else if (var7 > Client.field694) { // L: 4705
			var17 = Client.field694; // L: 4706
			var6 = var17 * var2 * 334 / (var3 * 512); // L: 4707
			if (var6 < Client.field572) { // L: 4708
				var6 = Client.field572; // L: 4709
				var8 = var17 * var2 * 334 / (var6 * 512); // L: 4710
				var9 = (var3 - var8) / 2; // L: 4711
				if (var4) { // L: 4712
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4713
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216); // L: 4714
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216); // L: 4715
				}

				var1 += var9; // L: 4717
				var3 -= var9 * 2; // L: 4718
			}
		}

		Client.viewportZoom = var3 * var6 / 334; // L: 4721
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) { // L: 4722
			int[] var16 = new int[9]; // L: 4724

			for (var9 = 0; var9 < var16.length; ++var9) { // L: 4725
				int var10 = var9 * 32 + 15 + 128; // L: 4726
				int var11 = WorldMapData_0.method5041(var10); // L: 4727
				int var12 = Rasterizer3D.Rasterizer3D_sine[var10]; // L: 4728
				int var14 = var3 - 334; // L: 4731
				if (var14 < 0) { // L: 4732
					var14 = 0;
				} else if (var14 > 100) { // L: 4733
					var14 = 100;
				}

				int var15 = (Client.zoomWidth - Client.zoomHeight) * var14 / 100 + Client.zoomHeight; // L: 4734
				int var13 = var11 * var15 / 256; // L: 4735
				var16[var9] = var13 * var12 >> 16; // L: 4738
			}

			Scene.Scene_buildVisiblityMap(var16, 500, 800, var2 * 334 / var3, 334); // L: 4740
		}

		Client.viewportOffsetX = var0; // L: 4743
		Client.viewportOffsetY = var1; // L: 4744
		Client.viewportWidth = var2; // L: 4745
		Client.viewportHeight = var3; // L: 4746
	} // L: 4747

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "109"
	)
	static final void method716(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0; // L: 10391
		int var7 = var3 - var1; // L: 10392
		int var8 = var6 >= 0 ? var6 : -var6; // L: 10393
		int var9 = var7 >= 0 ? var7 : -var7; // L: 10394
		int var10 = var8; // L: 10395
		if (var8 < var9) { // L: 10396
			var10 = var9;
		}

		if (var10 != 0) { // L: 10397
			int var11 = (var6 << 16) / var10; // L: 10398
			int var12 = (var7 << 16) / var10; // L: 10399
			if (var12 <= var11) { // L: 10400
				var11 = -var11;
			} else {
				var12 = -var12; // L: 10401
			}

			int var13 = var5 * var12 >> 17; // L: 10402
			int var14 = var5 * var12 + 1 >> 17; // L: 10403
			int var15 = var5 * var11 >> 17; // L: 10404
			int var16 = var5 * var11 + 1 >> 17; // L: 10405
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart; // L: 10406
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart; // L: 10407
			int var17 = var0 + var13; // L: 10408
			int var18 = var0 - var14; // L: 10409
			int var19 = var0 + var6 - var14; // L: 10410
			int var20 = var0 + var6 + var13; // L: 10411
			int var21 = var15 + var1; // L: 10412
			int var22 = var1 - var16; // L: 10413
			int var23 = var7 + var1 - var16; // L: 10414
			int var24 = var7 + var15 + var1; // L: 10415
			VarpDefinition.method3653(var17, var18, var19); // L: 10416
			class144.method3256(var21, var22, var23, var17, var18, var19, 0.0F, 0.0F, 0.0F, var4); // L: 10417
			VarpDefinition.method3653(var17, var19, var20); // L: 10418
			class144.method3256(var21, var23, var24, var17, var19, var20, 0.0F, 0.0F, 0.0F, var4); // L: 10419
		}
	} // L: 10420

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1230139284"
	)
	static final void method723() {
		Client.field691 = Client.cycleCntr; // L: 11993
		ItemContainer.field1024 = true; // L: 11994
	} // L: 11995
}
