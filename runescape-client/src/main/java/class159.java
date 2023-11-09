import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
public abstract class class159 extends Node {
	@ObfuscatedName("ax")
	static int[] field1755;

	class159() {
	} // L: 49

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "-43"
	)
	abstract void vmethod3411(Buffer var1);

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgh;I)V",
		garbageValue = "-2132107044"
	)
	abstract void vmethod3404(ClanChannel var1);

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1889169776"
	)
	static int method3337(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field882 - 7.0D) * 256.0D); // L: 4416
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "43"
	)
	static int method3327(int var0, Script var1, boolean var2) {
		return 2; // L: 5096
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-22255"
	)
	static final void method3336() {
		class405.method7642(); // L: 3028
		ArchiveDiskActionHandler.method6684(); // L: 3029
		KitDefinition.KitDefinition_cached.clear(); // L: 3031
		ObjectComposition.ObjectDefinition_cached.clear(); // L: 3034
		ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 3035
		ObjectComposition.ObjectDefinition_cachedEntities.clear(); // L: 3036
		ObjectComposition.ObjectDefinition_cachedModels.clear(); // L: 3037
		UserComparator3.method2887(); // L: 3039
		GrandExchangeOfferOwnWorldComparator.method1251(); // L: 3040
		class467.method8434(); // L: 3041
		InvDefinition.method3592(); // L: 3042
		VarbitComposition.VarbitDefinition_cached.clear(); // L: 3044
		VarpDefinition.VarpDefinition_cached.clear(); // L: 3047
		class293.HitSplatDefinition_cachedSprites.method8883(); // L: 3049
		class344.Ignored_cached.method8883(); // L: 3050
		HitSplatDefinition.HitSplatDefinition_cached.clear(); // L: 3052
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear(); // L: 3053
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear(); // L: 3054
		class503.method8952(); // L: 3056
		class134.method3048(); // L: 3057
		ParamComposition.ParamComposition_cached.clear(); // L: 3059
		WorldMapElement.WorldMapElement_cachedSprites.clear(); // L: 3062
		Message.method1213(); // L: 3064
		class508.DBRowType_cache.clear(); // L: 3066
		Client.Widget_cachedModels.clear(); // L: 3068
		Client.Widget_cachedFonts.clear(); // L: 3069
		PlayerComposition.PlayerComposition_cachedModels.clear(); // L: 3071
		class59.method1181(); // L: 3073
		((TextureProvider)Rasterizer3D.field2510.Rasterizer3D_textureLoader).clear(); // L: 3074
		Script.Script_cached.clear(); // L: 3075
		Client.archive5.method7849(); // L: 3076
		class151.field1694.clearFiles(); // L: 3077
		TileItem.archive7.clearFiles(); // L: 3078
		class253.archive4.clearFiles(); // L: 3079
		class149.archive9.clearFiles(); // L: 3080
		Canvas.archive6.clearFiles(); // L: 3081
		class13.archive11.clearFiles(); // L: 3082
		class7.archive8.clearFiles(); // L: 3083
		class386.field4436.clearFiles(); // L: 3084
		class148.archive10.clearFiles(); // L: 3085
		class131.field1565.clearFiles(); // L: 3086
		GrandExchangeOfferOwnWorldComparator.field511.clearFiles(); // L: 3087
		class126.archive12.clearFiles(); // L: 3088
		class176.field1852.clearFiles(); // L: 3089
	} // L: 3090
}
