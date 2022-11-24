import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "[Lry;"
	)
	@Export("modIconSprites")
	static IndexedSprite[] modIconSprites;
	@ObfuscatedName("a")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lof;Lof;I)I",
		garbageValue = "941056838"
	)
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 14
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2); // L: 18
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 22
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1111285286"
	)
	static final void method2732() {
		class11.method101("Your friend list is full. Max of 200 for free users, and 400 for members"); // L: 120
	} // L: 121

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1902813783"
	)
	static final void method2739(String var0) {
		class11.method101(var0 + " is already on your friend list"); // L: 124
	} // L: 125

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-60"
	)
	static final void method2738() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear(); // L: 2990
		class148.method3155(); // L: 2992
		InvDefinition.method3413(); // L: 2993
		class145.method3072(); // L: 2994
		class18.method268(); // L: 2995
		WorldMapIcon_1.method4715(); // L: 2996
		UrlRequest.method2726(); // L: 2997
		class97.method2522(); // L: 2998
		VarbitComposition.VarbitDefinition_cached.clear(); // L: 3000
		class156.method3225(); // L: 3002
		PcmPlayer.HitSplatDefinition_cachedSprites.method8210(); // L: 3003
		class203.Ignored_cached.method8210(); // L: 3004
		HitSplatDefinition.HitSplatDefinition_cached.clear(); // L: 3006
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear(); // L: 3007
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear(); // L: 3008
		HealthBarDefinition.HealthBarDefinition_cached.clear(); // L: 3011
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear(); // L: 3012
		StructComposition.StructDefinition_cached.clear(); // L: 3015
		ArchiveDiskActionHandler.method6291(); // L: 3017
		ObjectSound.method1854(); // L: 3018
		class456.DBTableType_cache.clear(); // L: 3020
		class458.DBRowType_cache.clear(); // L: 3023
		Client.Widget_cachedModels.clear(); // L: 3025
		Client.Widget_cachedFonts.clear(); // L: 3026
		HorizontalAlignment.method3543(); // L: 3027
		MusicPatchPcmStream.method5658(); // L: 3028
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear(); // L: 3029
		Script.Script_cached.clear(); // L: 3030
		class150.archive5.clearFiles(); // L: 3031
		MouseHandler.field251.clearFiles(); // L: 3032
		PlayerType.archive7.clearFiles(); // L: 3033
		Canvas.archive4.clearFiles(); // L: 3034
		SecureRandomFuture.archive9.clearFiles(); // L: 3035
		ReflectionCheck.archive6.clearFiles(); // L: 3036
		WorldMapSectionType.archive11.clearFiles(); // L: 3037
		class142.archive8.clearFiles(); // L: 3038
		Client.field522.clearFiles(); // L: 3039
		WorldMapRegion.archive10.clearFiles(); // L: 3040
		class7.field32.clearFiles(); // L: 3041
		class188.archive12.clearFiles(); // L: 3042
		class250.field2930.clearFiles(); // L: 3043
	} // L: 3044
}
