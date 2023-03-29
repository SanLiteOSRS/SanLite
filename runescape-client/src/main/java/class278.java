import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
public class class278 {
	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1680827583"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close(); // L: 2868
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear(); // L: 2871
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear(); // L: 2874
		class27.method419(); // L: 2876
		MusicPatchNode.method5741(); // L: 2877
		NPCComposition.NpcDefinition_cached.clear(); // L: 2879
		NPCComposition.NpcDefinition_cachedModels.clear(); // L: 2880
		ItemComposition.ItemComposition_cached.clear(); // L: 2883
		ItemComposition.ItemComposition_cachedModels.clear(); // L: 2884
		ItemComposition.ItemComposition_cachedSprites.clear(); // L: 2885
		SequenceDefinition.SequenceDefinition_cached.clear(); // L: 2888
		SequenceDefinition.SequenceDefinition_cachedFrames.clear(); // L: 2889
		SequenceDefinition.SequenceDefinition_cachedModel.clear(); // L: 2890
		class155.method3293(); // L: 2892
		class162.method3349(); // L: 2893
		VarpDefinition.VarpDefinition_cached.clear(); // L: 2895
		KitDefinition.HitSplatDefinition_cachedSprites.method8423(); // L: 2897
		Messages.Ignored_cached.method8423(); // L: 2898
		HitSplatDefinition.HitSplatDefinition_cached.clear(); // L: 2900
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear(); // L: 2901
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear(); // L: 2902
		HealthBarDefinition.HealthBarDefinition_cached.clear(); // L: 2905
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear(); // L: 2906
		UserComparator4.method2841(); // L: 2908
		UrlRequest.method2834(); // L: 2909
		WorldMapElement.WorldMapElement_cachedSprites.clear(); // L: 2911
		class470.DBTableType_cache.clear(); // L: 2914
		class472.DBRowType_cache.clear(); // L: 2917
		Client.Widget_cachedModels.clear(); // L: 2919
		Client.Widget_cachedFonts.clear(); // L: 2920
		PlayerComposition.PlayerComposition_cachedModels.clear(); // L: 2922
		Widget.Widget_cachedSprites.clear(); // L: 2925
		Widget.Widget_cachedModels.clear(); // L: 2926
		Widget.Widget_cachedFonts.clear(); // L: 2927
		Widget.Widget_cachedSpriteMasks.clear(); // L: 2928
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear(); // L: 2930
		Script.Script_cached.clear(); // L: 2931
		Client.archive5.method7417(); // L: 2932
		UserComparator5.field1419.clearFiles(); // L: 2933
		class290.archive7.clearFiles(); // L: 2934
		class135.archive4.clearFiles(); // L: 2935
		class175.archive9.clearFiles(); // L: 2936
		ClientPreferences.field1265.clearFiles(); // L: 2937
		class308.archive6.clearFiles(); // L: 2938
		Clock.archive11.clearFiles(); // L: 2939
		class143.archive8.clearFiles(); // L: 2940
		class20.archive10.clearFiles(); // L: 2941
		class223.field2581.clearFiles(); // L: 2942
		class36.field239.clearFiles(); // L: 2943
		class167.archive12.clearFiles(); // L: 2944
		class320.field3708.clearFiles(); // L: 2945
		class1.scene.clear(); // L: 2947

		for (int var0 = 0; var0 < 4; ++var0) { // L: 2948
			Client.collisionMaps[var0].clear();
		}

		Client.field713.method4070(); // L: 2949
		System.gc(); // L: 2950
		class293.musicPlayerStatus = 1; // L: 2952
		class364.musicTrackArchive = null; // L: 2953
		IntHashTable.musicTrackGroupId = -1; // L: 2954
		class293.musicTrackFileId = -1; // L: 2955
		class368.musicTrackVolume = 0; // L: 2956
		class293.musicTrackBoolean = false; // L: 2957
		AbstractRasterProvider.pcmSampleLength = 2; // L: 2958
		Client.currentTrackGroupId = -1; // L: 2960
		Client.playingJingle = false; // L: 2961
		class389.method7353(); // L: 2962
		class19.method280(10); // L: 2963
	} // L: 2964

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2107824411"
	)
	static final void method5449(int var0, int var1) {
		if (var0 < 128) { // L: 3860
			var0 = 128;
		}

		if (var0 > 383) { // L: 3861
			var0 = 383;
		}

		if (class311.cameraPitch < var0) { // L: 3862
			class311.cameraPitch = (var0 - class311.cameraPitch) * Skeleton.field2505 / 1000 + class311.cameraPitch + GrandExchangeOfferUnitPriceComparator.field4269; // L: 3863
			if (class311.cameraPitch > var0) { // L: 3864
				class311.cameraPitch = var0;
			}
		}

		if (class311.cameraPitch > var0) { // L: 3866
			class311.cameraPitch -= (class311.cameraPitch - var0) * Skeleton.field2505 / 1000 + GrandExchangeOfferUnitPriceComparator.field4269; // L: 3867
			if (class311.cameraPitch < var0) { // L: 3868
				class311.cameraPitch = var0;
			}
		}

		int var2 = var1 - class110.cameraYaw; // L: 3870
		if (var2 > 1024) { // L: 3871
			var2 -= 2048;
		}

		if (var2 < -1024) { // L: 3872
			var2 += 2048;
		}

		if (var2 > 0) { // L: 3873
			class110.cameraYaw = class110.cameraYaw + GrandExchangeOfferUnitPriceComparator.field4269 + var2 * Skeleton.field2505 / 1000; // L: 3874
			class110.cameraYaw &= 2047; // L: 3875
		}

		if (var2 < 0) { // L: 3877
			class110.cameraYaw -= -var2 * Skeleton.field2505 / 1000 + GrandExchangeOfferUnitPriceComparator.field4269; // L: 3878
			class110.cameraYaw &= 2047; // L: 3879
		}

		int var3 = var1 - class110.cameraYaw; // L: 3881
		if (var3 > 1024) { // L: 3882
			var3 -= 2048;
		}

		if (var3 < -1024) { // L: 3883
			var3 += 2048;
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) { // L: 3884
			class110.cameraYaw = var1;
		}

	} // L: 3885

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "([Lmy;Lmy;ZB)V",
		garbageValue = "17"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth : var1.width; // L: 10541
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight : var1.height; // L: 10542
		Script.resizeInterface(var0, var1.id, var3, var4, var2); // L: 10543
		if (var1.children != null) { // L: 10544
			Script.resizeInterface(var1.children, var1.id, var3, var4, var2);
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id); // L: 10545
		if (var5 != null) { // L: 10546
			int var6 = var5.group; // L: 10547
			if (GrandExchangeEvent.loadInterface(var6)) { // L: 10549
				Script.resizeInterface(class155.Widget_interfaceComponents[var6], -1, var3, var4, var2); // L: 10550
			}
		}

		if (var1.contentType == 1337) { // L: 10553
		}

	} // L: 10554
}
