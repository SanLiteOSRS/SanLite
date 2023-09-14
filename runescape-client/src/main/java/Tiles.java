import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("au")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("ae")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -224206529
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("at")
	static short[][][] field1040;
	@ObfuscatedName("aq")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("ax")
	static final int[] field1042;
	@ObfuscatedName("ah")
	static final int[] field1043;
	@ObfuscatedName("as")
	static final int[] field1044;
	@ObfuscatedName("ay")
	static final int[] field1045;
	@ObfuscatedName("aj")
	static final int[] field1051;
	@ObfuscatedName("av")
	static final int[] field1048;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1918244679
	)
	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1547931623
	)
	@Export("rndLightness")
	static int rndLightness;
	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	static Archive field1038;
	@ObfuscatedName("jc")
	@ObfuscatedGetter(
		intValue = 683914525
	)
	static int field1037;

	static {
		Tiles_heights = new int[4][105][105]; // L: 13
		Tiles_renderFlags = new byte[4][104][104];
		Tiles_minPlane = 99; // L: 15
		field1042 = new int[]{1, 2, 4, 8}; // L: 31
		field1043 = new int[]{16, 32, 64, 128}; // L: 32
		field1044 = new int[]{1, 0, -1, 0};
		field1045 = new int[]{0, -1, 0, 1};
		field1051 = new int[]{1, -1, -1, 1}; // L: 35
		field1048 = new int[]{-1, -1, 1, 1}; // L: 36
		rndHue = (int)(Math.random() * 17.0D) - 8; // L: 37
		rndLightness = (int)(Math.random() * 33.0D) - 16; // L: 38
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)[Lhy;",
		garbageValue = "1"
	)
	static VerticalAlignment[] method2244() {
		return new VerticalAlignment[]{VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field2081, VerticalAlignment.field2080}; // L: 14
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "-360252292"
	)
	static final int method2241(int var0, int var1, int var2, int var3) {
		return var0 * var2 - var3 * var1 >> 16; // L: 9
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lnu;III)Lui;",
		garbageValue = "1499324687"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		return !ApproximateRouteStrategy.method1228(var0, var1, var2) ? null : UserComparator6.method2922(); // L: 33 34
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIILiv;[Lis;)V"
	)
	static final void method2202(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
		Buffer var10 = new Buffer(var0); // L: 279
		int var11 = -1; // L: 280

		while (true) {
			int var12 = var10.method9076(); // L: 282
			if (var12 == 0) { // L: 283
				return; // L: 338
			}

			var11 += var12; // L: 284
			int var13 = 0; // L: 285

			while (true) {
				int var14 = var10.readUShortSmart(); // L: 287
				if (var14 == 0) { // L: 288
					break;
				}

				var13 += var14 - 1; // L: 289
				int var15 = var13 & 63; // L: 290
				int var16 = var13 >> 6 & 63; // L: 291
				int var17 = var13 >> 12; // L: 292
				int var18 = var10.readUnsignedByte(); // L: 293
				int var19 = var18 >> 2; // L: 294
				int var20 = var18 & 3; // L: 295
				if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) { // L: 296
					ObjectComposition var21 = WorldMapElement.getObjectDefinition(var11); // L: 297
					int var24 = var16 & 7; // L: 300
					int var25 = var15 & 7; // L: 301
					int var27 = var21.sizeX; // L: 303
					int var28 = var21.sizeY; // L: 304
					int var29;
					if ((var20 & 1) == 1) { // L: 306
						var29 = var27; // L: 307
						var27 = var28; // L: 308
						var28 = var29; // L: 309
					}

					int var26 = var7 & 3; // L: 311
					int var23;
					if (var26 == 0) { // L: 312
						var23 = var24; // L: 313
					} else if (var26 == 1) { // L: 316
						var23 = var25; // L: 317
					} else if (var26 == 2) { // L: 320
						var23 = 7 - var24 - (var27 - 1); // L: 321
					} else {
						var23 = 7 - var25 - (var28 - 1); // L: 324
					}

					var29 = var2 + var23; // L: 326
					int var30 = var3 + InterfaceParent.method2279(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20); // L: 327
					if (var29 > 0 && var30 > 0 && var29 < 103 && var30 < 103) { // L: 328
						int var31 = var1; // L: 329
						if ((Tiles_renderFlags[1][var29][var30] & 2) == 2) { // L: 330
							var31 = var1 - 1;
						}

						CollisionMap var32 = null; // L: 331
						if (var31 >= 0) { // L: 332
							var32 = var9[var31];
						}

						class128.addObjects(var1, var29, var30, var11, var20 + var7 & 3, var19, var8, var32); // L: 333
					}
				}
			}
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lmi;III)V",
		garbageValue = "2062613871"
	)
	public static void method2242(Widget var0, int var1, int var2) {
		var0.field3704.bodyColors[var1] = var2; // L: 1032
		var0.field3704.method6072(); // L: 1033
	} // L: 1034

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "645111513"
	)
	static final void method2229() {
		Renderable.method4713(); // L: 2924
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear(); // L: 2926
		class153.method3175(); // L: 2928
		UserComparator9.method2901(); // L: 2929
		NPCComposition.NpcDefinition_cached.clear(); // L: 2931
		NPCComposition.NpcDefinition_cachedModels.clear(); // L: 2932
		ItemComposition.ItemComposition_cached.clear(); // L: 2935
		ItemComposition.ItemComposition_cachedModels.clear(); // L: 2936
		ItemComposition.ItemComposition_cachedSprites.clear(); // L: 2937
		SequenceDefinition.SequenceDefinition_cached.clear(); // L: 2940
		SequenceDefinition.SequenceDefinition_cachedFrames.clear(); // L: 2941
		SequenceDefinition.SequenceDefinition_cachedModel.clear(); // L: 2942
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear(); // L: 2945
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear(); // L: 2946
		VarbitComposition.VarbitDefinition_cached.clear(); // L: 2949
		VarpDefinition.VarpDefinition_cached.clear(); // L: 2952
		class47.HitSplatDefinition_cachedSprites.method8874(); // L: 2954
		class400.Ignored_cached.method8874(); // L: 2955
		class394.method7382(); // L: 2956
		HealthBarDefinition.HealthBarDefinition_cached.clear(); // L: 2958
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear(); // L: 2959
		StructComposition.StructDefinition_cached.clear(); // L: 2962
		class126.method2941(); // L: 2964
		WorldMapElement.WorldMapElement_cachedSprites.clear(); // L: 2966
		class219.method4262(); // L: 2968
		class19.method295(); // L: 2969
		Client.Widget_cachedModels.clear(); // L: 2970
		Client.Widget_cachedFonts.clear(); // L: 2971
		PlayerComposition.PlayerComposition_cachedModels.clear(); // L: 2973
		class261.method5398(); // L: 2975
		((TextureProvider)Rasterizer3D.field2536.Rasterizer3D_textureLoader).clear(); // L: 2976
		Script.Script_cached.clear(); // L: 2977
		Client.archive5.method7779(); // L: 2978
		AttackOption.field1351.clearFiles(); // L: 2979
		class318.archive7.clearFiles(); // L: 2980
		ObjectSound.archive4.clearFiles(); // L: 2981
		KeyHandler.archive9.clearFiles(); // L: 2982
		class499.archive6.clearFiles(); // L: 2983
		class385.archive11.clearFiles(); // L: 2984
		Message.archive8.clearFiles(); // L: 2985
		PcmPlayer.field304.clearFiles(); // L: 2986
		class147.archive10.clearFiles(); // L: 2987
		class141.field1665.clearFiles(); // L: 2988
		class388.field4435.clearFiles(); // L: 2989
		GrandExchangeOffer.archive12.clearFiles(); // L: 2990
		class343.field3869.clearFiles(); // L: 2991
	} // L: 2992
}
