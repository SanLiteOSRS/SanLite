import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("f")
	@Export("Varps_masks")
	static int[] Varps_masks;
	@ObfuscatedName("b")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("l")
	@Export("Varps_main")
	public static int[] Varps_main;

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
		signature = "(Liw;Liw;Liw;Liw;I)V",
		garbageValue = "-990913751"
	)
	public static void method4126(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, AbstractArchive var3) {
		Decimator.Widget_archive = var0;
		GameBuild.Widget_modelsArchive = var1;
		Widget.Widget_spritesArchive = var2;
		Widget.Widget_fontsArchive = var3;
		Widget.Widget_interfaceComponents = new Widget[Decimator.Widget_archive.getGroupCount()][];
		Widget.Widget_loadedInterfaces = new boolean[Decimator.Widget_archive.getGroupCount()];
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(IIII)I",
		garbageValue = "-1995457762"
	)
	public static int method4122(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1;
		}
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		signature = "(Lbi;III)V",
		garbageValue = "-843887273"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) {
			int var3 = class105.SequenceDefinition_get(var1).field3551;
			if (var3 == 1) {
				var0.sequenceFrame = 0;
				var0.sequenceFrameCycle = 0;
				var0.sequenceDelay = var2;
				var0.field1022 = 0;
			}

			if (var3 == 2) {
				var0.field1022 = 0;
			}
		} else if (var1 == -1 || var0.sequence == -1 || class105.SequenceDefinition_get(var1).field3545 >= class105.SequenceDefinition_get(var0.sequence).field3545) {
			var0.sequence = var1;
			var0.sequenceFrame = 0;
			var0.sequenceFrameCycle = 0;
			var0.sequenceDelay = var2;
			var0.field1022 = 0;
			var0.field1034 = var0.pathLength;
		}

	}
}
