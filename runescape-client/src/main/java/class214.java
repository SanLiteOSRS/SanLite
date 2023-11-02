import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("im")
public class class214 extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("archive4")
	static EvictingDualNodeHashTable archive4;

	static {
		archive4 = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Liy;",
		garbageValue = "-114"
	)
	@Export("ItemComposition_get")
	public static ItemComposition ItemComposition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemComposition_cached.get((long)var0); // L: 98
		if (var1 != null) { // L: 99
			return var1;
		} else {
			byte[] var2 = class317.ItemComposition_archive.takeFile(10, var0); // L: 100
			var1 = new ItemComposition(); // L: 101
			var1.id = var0; // L: 102
			if (var2 != null) { // L: 103
				var1.decode(new Buffer(var2));
			}

			var1.post(); // L: 104
			if (var1.noteTemplate != -1) { // L: 105
				var1.genCert(ItemComposition_get(var1.noteTemplate), ItemComposition_get(var1.note));
			}

			if (var1.notedId != -1) { // L: 106
				var1.genBought(ItemComposition_get(var1.notedId), ItemComposition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) { // L: 107
				var1.genPlaceholder(ItemComposition_get(var1.placeholderTemplate), ItemComposition_get(var1.placeholder));
			}

			if (!HealthBarUpdate.ItemComposition_inMembersWorld && var1.isMembersOnly) { // L: 108
				if (var1.noteTemplate == -1 && var1.notedId == -1 && var1.placeholderTemplate == -1) { // L: 109
					var1.name = var1.name + " (Members)"; // L: 110
				}

				var1.isTradable = false; // L: 112

				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) { // L: 113
					var1.groundActions[var3] = null; // L: 114
				}

				for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) { // L: 116
					if (var3 != 4) { // L: 117
						var1.inventoryActions[var3] = null; // L: 118
					}
				}

				var1.shiftClickIndex = -2; // L: 121
				var1.team = 0; // L: 122
				if (var1.params != null) { // L: 123
					boolean var6 = false; // L: 124

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) { // L: 125
						ParamComposition var5 = class180.getParamDefinition((int)var4.key); // L: 126
						if (var5.autoDisable) { // L: 127
							var4.remove();
						} else {
							var6 = true; // L: 128
						}
					}

					if (!var6) { // L: 130
						var1.params = null;
					}
				}
			}

			ItemComposition.ItemComposition_cached.put(var1, (long)var0); // L: 133
			return var1; // L: 134
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfk;",
		garbageValue = "-119"
	)
	static class139 method3910(int var0) {
		class139 var3 = (class139)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0); // L: 366
		class139 var2;
		class139 var4;
		AbstractArchive var5;
		AbstractArchive var6;
		boolean var7;
		byte[] var8;
		int var9;
		byte[] var10;
		if (var3 != null) { // L: 367
			var2 = var3; // L: 368
		} else {
			var5 = SequenceDefinition.SequenceDefinition_animationsArchive; // L: 372
			var6 = SequenceDefinition.SequenceDefinition_skeletonsArchive; // L: 373
			var7 = true; // L: 375
			var8 = var5.getFile(var0 >> 16 & 65535, var0 & 65535); // L: 376
			if (var8 == null) { // L: 377
				var7 = false; // L: 378
				var4 = null; // L: 379
			} else {
				var9 = (var8[1] & 255) << 8 | var8[2] & 255; // L: 382
				var10 = var6.getFile(var9, 0); // L: 385
				if (var10 == null) { // L: 386
					var7 = false;
				}

				if (!var7) { // L: 387
					var4 = null; // L: 388
				} else {
					if (SoundCache.field333 == null) { // L: 391
						MusicPatchPcmStream.field3510 = Runtime.getRuntime().availableProcessors(); // L: 392
						SoundCache.field333 = new ThreadPoolExecutor(0, MusicPatchPcmStream.field3510, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(MusicPatchPcmStream.field3510 * 100 + 100), new class186()); // L: 393
					}

					try {
						var4 = new class139(var5, var6, var0, false); // L: 401
					} catch (Exception var13) { // L: 403
						var4 = null; // L: 404
					}
				}
			}

			if (var4 != null) { // L: 408
				SequenceDefinition.SequenceDefinition_cachedModel.put(var4, (long)var0);
			}

			var2 = var4; // L: 409
		}

		int var1;
		if (var2 == null) { // L: 412
			var1 = 2; // L: 413
		} else {
			var1 = var2.method3091() ? 0 : 1; // L: 416
		}

		if (var1 != 0) { // L: 418
			return null; // L: 419
		} else {
			var3 = (class139)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0); // L: 423
			if (var3 != null) { // L: 424
				var2 = var3; // L: 425
			} else {
				var5 = SequenceDefinition.SequenceDefinition_animationsArchive; // L: 429
				var6 = SequenceDefinition.SequenceDefinition_skeletonsArchive; // L: 430
				var7 = true; // L: 432
				var8 = var5.getFile(var0 >> 16 & 65535, var0 & 65535); // L: 433
				if (var8 == null) { // L: 434
					var7 = false; // L: 435
					var4 = null; // L: 436
				} else {
					var9 = (var8[1] & 255) << 8 | var8[2] & 255; // L: 439
					var10 = var6.getFile(var9, 0); // L: 442
					if (var10 == null) { // L: 443
						var7 = false;
					}

					if (!var7) { // L: 444
						var4 = null; // L: 445
					} else {
						if (SoundCache.field333 == null) { // L: 448
							MusicPatchPcmStream.field3510 = Runtime.getRuntime().availableProcessors(); // L: 449
							SoundCache.field333 = new ThreadPoolExecutor(0, MusicPatchPcmStream.field3510, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(MusicPatchPcmStream.field3510 * 100 + 100), new class216()); // L: 450
						}

						try {
							var4 = new class139(var5, var6, var0, false); // L: 458
						} catch (Exception var12) { // L: 460
							var4 = null; // L: 461
						}
					}
				}

				if (var4 != null) { // L: 465
					SequenceDefinition.SequenceDefinition_cachedModel.put(var4, (long)var0);
				}

				var2 = var4; // L: 466
			}

			return var2; // L: 468
		}
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2124568966"
	)
	static final void method3909() {
		UserComparator10.method2924(); // L: 2970
		SoundSystem.method846(); // L: 2971
		class517.method9048(); // L: 2972
		class74.method2120(); // L: 2973
		PlayerType.method6830(); // L: 2974
		EnumComposition.EnumDefinition_cached.clear(); // L: 2976
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear(); // L: 2979
		FloorUnderlayDefinition.field2129.clear(); // L: 2982
		HealthBarDefinition.NpcDefinition_cachedModels.clear(); // L: 2985
		HealthBarDefinition.HitSplatDefinition_cachedSprites.clear(); // L: 2986
		HitSplatDefinition.HitSplatDefinition_cached.clear(); // L: 2989
		HitSplatDefinition.field2170.clear(); // L: 2990
		HitSplatDefinition.field2183.clear(); // L: 2991
		MouseHandler.method679(); // L: 2993
		KitDefinition.KitDefinition_cached.clear(); // L: 2995
		class185.method3597(); // L: 2997
		MusicPatchPcmStream.method6184(); // L: 2998
		class33.method476(); // L: 2999
		class141.method3127(); // L: 3000
		class20.method293(); // L: 3001
		class315.method5904(); // L: 3002
		class20.method297(); // L: 3003
		SequenceDefinition.SequenceDefinition_cached.clear(); // L: 3005
		SequenceDefinition.SequenceDefinition_cachedFrames.clear(); // L: 3006
		SequenceDefinition.SequenceDefinition_cachedModel.clear(); // L: 3007
		class198.method3737(); // L: 3009
		Actor.method2456(); // L: 3010
		UserComparator3.method2909(); // L: 3011
		HealthBarDefinition.Widget_cachedModels.method8993(); // L: 3012
		class53.Widget_cachedFonts.method8993(); // L: 3013
		class206.Widget_cachedSpriteMasks.clear(); // L: 3015
		class208.field2100.clear(); // L: 3018
		class154.method3223(); // L: 3020
		class193.archive5.clear(); // L: 3022
		class188.field1909.clear(); // L: 3025
		Language.method7159(); // L: 3027
		class25.method344(); // L: 3028
		UserComparator10.method2925(); // L: 3029
		UserComparator9.method2912(); // L: 3030
		Client.Widget_cachedModels.clear(); // L: 3031
		Client.Widget_cachedFonts.clear(); // L: 3032
		PlayerComposition.PlayerComposition_cachedModels.clear(); // L: 3034
		PlayerComposition.archive10.clearFiles(); // L: 3035
		PlayerComposition.field3626 = 0; // L: 3036
		class33.field184.method6252(); // L: 3038
		((TextureProvider)Rasterizer3D.field2550.Rasterizer3D_textureLoader).clear(); // L: 3039
		Script.Script_cached.clear(); // L: 3041
		Client.field810.clearFiles(); // L: 3043
		class92.field1117.method6919(); // L: 3044
		class199.field2009.method6919(); // L: 3045
		class190.field1916.method6919(); // L: 3046
		class421.archive12.method6919(); // L: 3047
		SoundSystem.archive2.method6919(); // L: 3048
		class313.field3396.method6919(); // L: 3049
		WorldMapDecorationType.field3881.method6919(); // L: 3050
		class27.archive13.method6919(); // L: 3051
		AbstractByteArrayCopier.field3839.method6919(); // L: 3052
		class319.field3442.method6919(); // L: 3053
		class469.field4812.method6919(); // L: 3054
		Language.field4435.method6919(); // L: 3055
		class198.archive9.method6919(); // L: 3056
		CollisionMap.field2392.method6919(); // L: 3057
		GrandExchangeOfferOwnWorldComparator.field515.method6919(); // L: 3058
		class317.field3415.method6919(); // L: 3059
		class199.field2010.method6919(); // L: 3060
		class241.field2558.method6919(); // L: 3061
		ArchiveDiskAction.field4291.method6919(); // L: 3062
		HorizontalAlignment.field2028.method6919(); // L: 3063
		class358.field3898.method6919(); // L: 3064
		class245.field2658.method6919(); // L: 3065
	} // L: 3066
}
