import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mp")
public class class318 {
	@ObfuscatedName("ay")
	@Export("ByteArrayPool_alternativeSizes")
	static int[] ByteArrayPool_alternativeSizes;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "647305117"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0; // L: 76
		if (var0 < 0 || var0 >= 65536) { // L: 77
			var0 >>>= 16; // L: 78
			var1 += 16; // L: 79
		}

		if (var0 >= 256) { // L: 81
			var0 >>>= 8; // L: 82
			var1 += 8; // L: 83
		}

		if (var0 >= 16) { // L: 85
			var0 >>>= 4; // L: 86
			var1 += 4; // L: 87
		}

		if (var0 >= 4) { // L: 89
			var0 >>>= 2; // L: 90
			var1 += 2; // L: 91
		}

		if (var0 >= 1) { // L: 93
			var0 >>>= 1; // L: 94
			++var1; // L: 95
		}

		return var0 + var1; // L: 97
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-927795799"
	)
	static final void method5949() {
		class201.field2067.clear(); // L: 2983
		class203.FloorUnderlayDefinition_cached.clear(); // L: 2986
		FileSystem.method3529(); // L: 2988
		class27.method362(); // L: 2989
		class139.method3117(); // L: 2990
		UserComparator4.method2868(); // L: 2991
		PcmPlayer.method799(); // L: 2992
		FontName.method8922(); // L: 2993
		class16.method203(); // L: 2994
		HitSplatDefinition.HitSplatDefinition_cached.clear(); // L: 2996
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear(); // L: 2997
		HitSplatDefinition.field2224.clear(); // L: 2998
		class94.method2385(); // L: 3000
		class106.method2698(); // L: 3001
		ScriptEvent.method2306(); // L: 3002
		GameObject.method5220(); // L: 3003
		WorldMapElement.Ignored_cached.clear(); // L: 3005
		class187.method3691(); // L: 3007
		NPCComposition.NpcDefinition_cached.clear(); // L: 3009
		NPCComposition.HitSplatDefinition_cachedFonts.clear(); // L: 3010
		ItemComposition.ItemComposition_cached.clear(); // L: 3013
		ItemComposition.ItemComposition_cachedModels.clear(); // L: 3014
		ItemComposition.ItemComposition_cachedSprites.clear(); // L: 3015
		class14.method183(); // L: 3017
		SequenceDefinition.SequenceDefinition_cached.clear(); // L: 3019
		SequenceDefinition.SequenceDefinition_cachedFrames.clear(); // L: 3020
		SequenceDefinition.SequenceDefinition_cachedModel.clear(); // L: 3021
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear(); // L: 3024
		SpotAnimationDefinition.field2175.clear(); // L: 3025
		StructComposition.StructDefinition_cached.clear(); // L: 3028
		DevicePcmPlayerProvider.method290(); // L: 3030
		if (DevicePcmPlayerProvider.field99 != null) { // L: 3031
			DevicePcmPlayerProvider.field99.method9070();
		}

		if (Tiles.field1043 != null) { // L: 3032
			Tiles.field1043.method9070();
		}

		class208.field2148.clear(); // L: 3034
		UserComparator10.method2914(); // L: 3036
		VarcInt.VarcInt_cached.clear(); // L: 3038
		class425.method7823(); // L: 3040
		class103.method2672(); // L: 3041
		class193.field1990.clear(); // L: 3043
		class180.method3593(); // L: 3045
		VarpDefinition.VarpDefinition_cached.clear(); // L: 3047
		ChatChannel.method2216(); // L: 3049
		Client.Widget_cachedModels.clear(); // L: 3050
		Client.Widget_cachedFonts.clear(); // L: 3051
		PlayerComposition.PlayerComposition_cachedModels.clear(); // L: 3053
		PlayerComposition.field3691.method8011(); // L: 3054
		PlayerComposition.field3688 = 0; // L: 3055
		if (class243.field2620 != null) { // L: 3057
			class243.field2620.method6284();
		}

		if (Rasterizer3D.field2611.Rasterizer3D_textureLoader != null) { // L: 3058
			((TextureProvider)Rasterizer3D.field2611.Rasterizer3D_textureLoader).clear();
		}

		Script.Script_cached.clear(); // L: 3060
		Client.field597.method8011(); // L: 3062
		if (UrlRequester.field1452 != null) { // L: 3063
			UrlRequester.field1452.clearFiles();
		}

		if (class17.field75 != null) { // L: 3064
			class17.field75.clearFiles();
		}

		if (SpriteMask.field3623 != null) { // L: 3065
			SpriteMask.field3623.clearFiles();
		}

		if (GrandExchangeOfferOwnWorldComparator.archive12 != null) { // L: 3066
			GrandExchangeOfferOwnWorldComparator.archive12.clearFiles();
		}

		if (UserComparator9.archive2 != null) { // L: 3067
			UserComparator9.archive2.clearFiles();
		}

		if (class439.field4743 != null) { // L: 3068
			class439.field4743.clearFiles();
		}

		if (SceneTilePaint.field2883 != null) { // L: 3069
			SceneTilePaint.field2883.clearFiles();
		}

		if (class67.archive13 != null) { // L: 3070
			class67.archive13.clearFiles();
		}

		if (GrandExchangeOfferOwnWorldComparator.field479 != null) { // L: 3071
			GrandExchangeOfferOwnWorldComparator.field479.clearFiles();
		}

		if (PcmPlayer.field283 != null) { // L: 3072
			PcmPlayer.field283.clearFiles();
		}

		if (class141.archive4 != null) { // L: 3073
			class141.archive4.clearFiles();
		}

		if (WorldMapScaleHandler.field3167 != null) { // L: 3074
			WorldMapScaleHandler.field3167.clearFiles();
		}

		if (class73.field909 != null) { // L: 3075
			class73.field909.clearFiles();
		}

		if (UserComparator6.field1508 != null) { // L: 3076
			UserComparator6.field1508.clearFiles();
		}

		if (class470.field4874 != null) { // L: 3077
			class470.field4874.clearFiles();
		}

		if (GraphicsObject.field883 != null) { // L: 3078
			GraphicsObject.field883.clearFiles();
		}

		if (GameEngine.field201 != null) { // L: 3079
			GameEngine.field201.clearFiles();
		}

		if (class107.field1377 != null) { // L: 3080
			class107.field1377.clearFiles();
		}

		if (class93.field1170 != null) { // L: 3081
			class93.field1170.clearFiles();
		}

		if (class153.field1726 != null) { // L: 3082
			class153.field1726.clearFiles();
		}

		if (PlayerType.field4332 != null) { // L: 3083
			PlayerType.field4332.clearFiles();
		}

		if (SoundCache.field308 != null) { // L: 3084
			SoundCache.field308.clearFiles();
		}

	} // L: 3085
}
