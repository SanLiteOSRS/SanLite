import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
final class class105 implements class321 {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("SequenceDefinition_animationsArchive")
	static AbstractArchive SequenceDefinition_animationsArchive;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lmo;)V"
	)
	class105(Widget var1) {
		this.val$cc = var1; // L: 512
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2105224768"
	)
	public void vmethod6091() {
		if (this.val$cc != null && this.val$cc.method6490().field3531 != null) { // L: 514
			ScriptEvent var1 = new ScriptEvent(); // L: 515
			var1.method2243(this.val$cc); // L: 516
			var1.setArgs(this.val$cc.method6490().field3531); // L: 517
			class101.method2634().addFirst(var1); // L: 518
		}

	} // L: 520

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)[Llg;",
		garbageValue = "-1"
	)
	public static class294[] method2656() {
		return new class294[]{class294.field3207, class294.field3211, class294.field3205, class294.field3203, class294.field3206, class294.field3208, class294.field3209, class294.field3210, class294.field3204, class294.field3212, class294.field3213}; // L: 18
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "801533028"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close(); // L: 3022
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear(); // L: 3025
		class210.method4077(); // L: 3027
		KitDefinition.KitDefinition_cached.clear(); // L: 3029
		ObjectComposition.ObjectDefinition_cached.clear(); // L: 3032
		ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 3033
		ObjectComposition.ObjectDefinition_cachedEntities.clear(); // L: 3034
		ObjectComposition.ObjectDefinition_cachedModels.clear(); // L: 3035
		NPCComposition.NpcDefinition_cached.clear(); // L: 3038
		NPCComposition.NpcDefinition_cachedModels.clear(); // L: 3039
		class143.method3110(); // L: 3041
		class6.method43(); // L: 3042
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear(); // L: 3044
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear(); // L: 3045
		VarbitComposition.VarbitDefinition_cached.clear(); // L: 3048
		VarpDefinition.VarpDefinition_cached.clear(); // L: 3051
		class13.HitSplatDefinition_cachedSprites.method8784(); // L: 3053
		ViewportMouse.Ignored_cached.method8784(); // L: 3054
		class155.method3258(); // L: 3055
		HealthBarDefinition.HealthBarDefinition_cached.clear(); // L: 3057
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear(); // L: 3058
		StructComposition.StructDefinition_cached.clear(); // L: 3061
		ParamComposition.ParamComposition_cached.clear(); // L: 3064
		class370.method6927(); // L: 3066
		class493.DBTableType_cache.clear(); // L: 3068
		class494.method8874(); // L: 3070
		Client.Widget_cachedModels.clear(); // L: 3071
		Client.Widget_cachedFonts.clear(); // L: 3072
		PlayerComposition.PlayerComposition_cachedModels.clear(); // L: 3074
		HealthBarUpdate.method2392(); // L: 3076
		((TextureProvider)Rasterizer3D.field2512.Rasterizer3D_textureLoader).clear(); // L: 3077
		Script.Script_cached.clear(); // L: 3078
		Client.field772.method7689(); // L: 3079
		PcmPlayer.archive5.clearFiles(); // L: 3080
		ClientPacket.field3202.clearFiles(); // L: 3081
		PlatformInfo.archive7.clearFiles(); // L: 3082
		PacketWriter.archive4.clearFiles(); // L: 3083
		ModelData0.archive9.clearFiles(); // L: 3084
		class33.archive6.clearFiles(); // L: 3085
		class89.archive11.clearFiles(); // L: 3086
		GameBuild.archive8.clearFiles(); // L: 3087
		class138.field1593.clearFiles(); // L: 3088
		WorldMapDecoration.archive10.clearFiles(); // L: 3089
		class10.field45.clearFiles(); // L: 3090
		FriendsList.archive12.clearFiles(); // L: 3091
		class328.field3591.clearFiles(); // L: 3092
		UserComparator4.scene.clear(); // L: 3094

		for (int var0 = 0; var0 < 4; ++var0) { // L: 3095
			Client.collisionMaps[var0].clear();
		}

		Client.field616.method4052(); // L: 3096
		System.gc(); // L: 3097
		ItemContainer.method2222(2); // L: 3098
		Client.currentTrackGroupId = -1; // L: 3099
		Client.playingJingle = false; // L: 3100
		class299.method5757(); // L: 3101
		class47.method867(10); // L: 3102
	} // L: 3103
}
