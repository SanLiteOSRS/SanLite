import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mh")
@Implements("LoginPacket")
public class LoginPacket implements class307 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final LoginPacket field3421;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	static final LoginPacket field3418;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final LoginPacket field3416;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final LoginPacket field3415;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final LoginPacket field3414;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	static final LoginPacket field3419;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lmh;"
	)
	@Export("LoginPacket_indexedValues")
	static final LoginPacket[] LoginPacket_indexedValues;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -188050641
	)
	@Export("id")
	public final int id;

	static {
		field3421 = new LoginPacket(14, 0); // L: 5
		field3418 = new LoginPacket(15, 4); // L: 6
		field3416 = new LoginPacket(16, -2); // L: 7
		field3415 = new LoginPacket(18, -2); // L: 8
		field3414 = new LoginPacket(19, -2); // L: 9
		field3419 = new LoginPacket(27, 0); // L: 10
		LoginPacket_indexedValues = new LoginPacket[32]; // L: 12
		LoginPacket[] var0 = class345.method6685(); // L: 15

		for (int var1 = 0; var1 < var0.length; ++var1) { // L: 16
			LoginPacket_indexedValues[var0[var1].id] = var0[var1]; // L: 17
		}

	} // L: 19

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	LoginPacket(int var1, int var2) {
		this.id = var1; // L: 26
	} // L: 27

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	static void method5996() {
		if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 244
			if (class93.clientPreferences.method2553() != null) { // L: 245
				Login.Login_username = class93.clientPreferences.method2553(); // L: 246
				Client.Login_isUsernameRemembered = true; // L: 247
			} else {
				Client.Login_isUsernameRemembered = false; // L: 249
			}

		}
	} // L: 250

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2066265657"
	)
	static void method5995() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 66

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next(); // L: 67
			var1.clearIsFromIgnored(); // L: 69
		}

	} // L: 72

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2077342774"
	)
	static final void method5997() {
		class182.field1905.clear(); // L: 2941
		class184.FloorUnderlayDefinition_cached.clear(); // L: 2944
		class173.field1818.clear(); // L: 2947
		class523.DBRowType_cache.clear(); // L: 2950
		class521.DBTableType_cache.clear(); // L: 2953
		Login.method2167(); // L: 2955
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear(); // L: 2957
		class12.method146(); // L: 2959
		HealthBarDefinition.NpcDefinition_cachedModels.clear(); // L: 2961
		HealthBarDefinition.HitSplatDefinition_cachedSprites.clear(); // L: 2962
		HitSplatDefinition.HitSplatDefinition_cached.clear(); // L: 2965
		HitSplatDefinition.field2078.clear(); // L: 2966
		HitSplatDefinition.field2076.clear(); // L: 2967
		class172.field1815.clear(); // L: 2970
		UrlRequester.method2901(); // L: 2972
		class33.method495(); // L: 2973
		class142.method3224(); // L: 2974
		WorldMapDecoration.method5021(); // L: 2975
		class185.field1930.clear(); // L: 2977
		MouseHandler.method720(); // L: 2979
		ItemComposition.ItemComposition_cached.clear(); // L: 2981
		ItemComposition.ItemComposition_cachedModels.clear(); // L: 2982
		ItemComposition.ItemComposition_cachedSprites.clear(); // L: 2983
		ParamComposition.ParamComposition_cached.clear(); // L: 2986
		PlayerComposition.method6414(); // L: 2988
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear(); // L: 2990
		SpotAnimationDefinition.field2021.clear(); // L: 2991
		ClanSettings.method3356(); // L: 2993
		Friend.method8228(); // L: 2994
		Language.Widget_cachedModels.method9202(); // L: 2995
		class176.Widget_cachedFonts.method9202(); // L: 2996
		class189.Widget_cachedSpriteMasks.clear(); // L: 2998
		ClanSettings.method3409(); // L: 3000
		VarcInt.VarcInt_cached.clear(); // L: 3002
		class176.archive5.clear(); // L: 3005
		class171.field1813.clear(); // L: 3008
		class345.method6683(); // L: 3010
		class30.method453(); // L: 3011
		class149.method3292(); // L: 3012
		class195.archive6.clear(); // L: 3014
		Client.Widget_cachedModels.clear(); // L: 3016
		Client.Widget_cachedFonts.clear(); // L: 3017
		LoginScreenAnimation.method2529(); // L: 3018
		class380.field4414.method6349(); // L: 3019
		((TextureProvider)Rasterizer3D.field2809.Rasterizer3D_textureLoader).clear(); // L: 3020
		Script.Script_cached.clear(); // L: 3022
		Client.field791.clearFiles(); // L: 3024
		DirectByteArrayCopier.field3862.method7046(); // L: 3025
		class274.field2907.method7046(); // L: 3026
		class189.field1995.method7046(); // L: 3027
		WorldMapDecorationType.archive12.method7046(); // L: 3028
		class36.archive2.method7046(); // L: 3029
		class18.field80.method7046(); // L: 3030
		class189.field1999.method7046(); // L: 3031
		HitSplatDefinition.archive13.method7046(); // L: 3032
		class173.field1820.method7046(); // L: 3033
		class208.field2281.method7046(); // L: 3034
		class476.archive4.method7046(); // L: 3035
		WorldMapDecoration.field2627.method7046(); // L: 3036
		class30.archive9.method7046(); // L: 3037
		WorldMapSection0.field2587.method7046(); // L: 3038
		MusicPatchNode.field3548.method7046(); // L: 3039
		DynamicObject.field994.method7046(); // L: 3040
		class19.field94.method7046(); // L: 3041
		class127.field1489.method7046(); // L: 3042
		class314.field3428.method7046(); // L: 3043
		class142.field1632.method7046(); // L: 3044
		class130.field1521.method7046(); // L: 3045
		PacketBufferNode.field3284.method7046(); // L: 3046
	} // L: 3047
}
