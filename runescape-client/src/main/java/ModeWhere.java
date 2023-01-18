import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mr")
@Implements("ModeWhere")
public enum ModeWhere implements class345 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	field4327("", 0, new class344[]{class344.field4289}),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	field4309("", 1, new class344[]{class344.field4287, class344.field4289}),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	field4311("", 2, new class344[]{class344.field4287, class344.field4288, class344.field4289}),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	field4310("", 3, new class344[]{class344.field4287}),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	field4313("", 4),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	field4314("", 5, new class344[]{class344.field4287, class344.field4289}),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	field4324("", 6, new class344[]{class344.field4289}),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	field4316("", 8, new class344[]{class344.field4287, class344.field4289}),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	field4317("", 9, new class344[]{class344.field4287, class344.field4288}),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	field4318("", 10, new class344[]{class344.field4287}),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	field4319("", 11, new class344[]{class344.field4287}),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	field4326("", 12, new class344[]{class344.field4287, class344.field4289}),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	field4315("", 13, new class344[]{class344.field4287});

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	@Export("NetCache_responseArchiveBuffer")
	public static Buffer NetCache_responseArchiveBuffer;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	static GameBuild field4325;
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = -1693192727
	)
	@Export("selectedItemWidget")
	static int selectedItemWidget;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -59463617
	)
	@Export("id")
	final int id;
	@ObfuscatedName("n")
	final Set field4323;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lmk;)V"
	)
	ModeWhere(String var3, int var4, class344[] var5) {
		this.field4323 = new HashSet();
		this.id = var4;
		class344[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class344 var8 = var6[var7];
			this.field4323.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field4323 = new HashSet();
		this.id = var4;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "96"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZB)V",
		garbageValue = "40"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		if (var1) { // L: 23
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) { // L: 24
				try {
					Desktop.getDesktop().browse(new URI(var0)); // L: 26
					return;
				} catch (Exception var4) { // L: 29
				}
			}

			if (class32.field183.startsWith("win")) {
				class12.method115(var0, 0);
			} else if (class32.field183.startsWith("mac")) {
				HealthBarUpdate.method2363(var0, 1, "openjs"); // L: 38
			} else {
				class12.method115(var0, 2);
			}
		} else {
			class12.method115(var0, 3);
		}

	}

	@ObfuscatedName("e")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) { // L: 31
			if (var0 % 37L == 0L) { // L: 32
				return null;
			} else {
				int var2 = 0; // L: 33

				for (long var3 = var0; var3 != 0L; var3 /= 37L) { // L: 34 35 37
					++var2; // L: 36
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); var0 != 0L; var5.append(var8)) { // L: 39 40 49
					long var6 = var0; // L: 41
					var0 /= 37L; // L: 42
					var8 = class362.base37Table[(int)(var6 - 37L * var0)]; // L: 43
					if (var8 == '_') { // L: 44
						int var9 = var5.length() - 1; // L: 45
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9))); // L: 46
						var8 = 160; // L: 47
					}
				}

				var5.reverse(); // L: 51
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0))); // L: 52
				return var5.toString(); // L: 53
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "742396295"
	)
	static final void method6699() {
		class154.method3299(); // L: 2721
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear(); // L: 2723
		ScriptFrame.method1173(); // L: 2725
		ObjectComposition.ObjectDefinition_cached.clear(); // L: 2727
		ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 2728
		ObjectComposition.ObjectDefinition_cachedEntities.clear(); // L: 2729
		ObjectComposition.ObjectDefinition_cachedModels.clear(); // L: 2730
		class369.method7151(); // L: 2732
		ItemComposition.ItemComposition_cached.clear(); // L: 2734
		ItemComposition.ItemComposition_cachedModels.clear(); // L: 2735
		ItemComposition.ItemComposition_cachedSprites.clear(); // L: 2736
		SequenceDefinition.SequenceDefinition_cached.clear(); // L: 2739
		SequenceDefinition.SequenceDefinition_cachedFrames.clear(); // L: 2740
		SequenceDefinition.SequenceDefinition_cachedModel.clear(); // L: 2741
		class149.method3257(); // L: 2743
		VarbitComposition.VarbitDefinition_cached.clear(); // L: 2745
		ScriptFrame.method1174(); // L: 2747
		class137.HitSplatDefinition_cachedSprites.method8344(); // L: 2748
		class34.Ignored_cached.method8344(); // L: 2749
		HorizontalAlignment.method3658(); // L: 2750
		DecorativeObject.method4828(); // L: 2751
		class273.method5480(); // L: 2752
		class143.method3127(); // L: 2753
		WorldMapElement.WorldMapElement_cachedSprites.clear(); // L: 2755
		class459.DBTableType_cache.clear(); // L: 2758
		class420.method7904(); // L: 2760
		Client.Widget_cachedModels.clear(); // L: 2761
		Client.Widget_cachedFonts.clear(); // L: 2762
		class34.method489(); // L: 2763
		HorizontalAlignment.method3653(); // L: 2764
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear(); // L: 2765
		Script.Script_cached.clear(); // L: 2766
		Client.archive5.method7387(); // L: 2767
		HealthBar.field1306.clearFiles(); // L: 2768
		class9.archive7.clearFiles(); // L: 2769
		FloorUnderlayDefinition.archive4.clearFiles(); // L: 2770
		WorldMapSection0.archive9.clearFiles(); // L: 2771
		class4.field7.clearFiles(); // L: 2772
		class162.archive6.clearFiles(); // L: 2773
		class301.archive11.clearFiles(); // L: 2774
		ClientPreferences.archive8.clearFiles(); // L: 2775
		Frames.archive10.clearFiles(); // L: 2776
		ClanChannelMember.field1666.clearFiles(); // L: 2777
		class21.field123.clearFiles(); // L: 2778
		class71.archive12.clearFiles(); // L: 2779
		Ignored.field4539.clearFiles(); // L: 2780
	} // L: 2781
}
