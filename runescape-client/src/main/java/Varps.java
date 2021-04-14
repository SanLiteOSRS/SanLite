import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("f")
	@Export("Varps_masks")
	static int[] Varps_masks;
	@ObfuscatedName("o")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("u")
	@Export("Varps_main")
	public static int[] Varps_main;
	@ObfuscatedName("g")
	@Export("SpriteBuffer_spritePalette")
	static int[] SpriteBuffer_spritePalette;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 998373993
	)
	static int field2580;
	@ObfuscatedName("i")
	static String field2575;
	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		signature = "Lhu;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;

	static {
		Varps_masks = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			Varps_masks[var1] = var0 - 1;
			var0 += var0;
		}

		Varps_temp = new int[4000];
		Varps_main = new int[4000];
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(II)Lkb;",
		garbageValue = "1594101631"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0);
			var1 = new SpotAnimationDefinition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
