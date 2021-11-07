import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("i")
	@Export("Varps_masks")
	static int[] Varps_masks;
	@ObfuscatedName("w")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("s")
	@Export("Varps_main")
	public static int[] Varps_main;
	@ObfuscatedName("x")
	public static short[] field3013;

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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1911470841"
	)
	public static boolean method5007(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.field118[var0] : false;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljf;I[B[BS)V",
		garbageValue = "20257"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3180 == null) {
			if (var2 == null) {
				return;
			}

			var0.field3180 = new byte[11][];
			var0.field3105 = new byte[11][];
			var0.field3128 = new int[11];
			var0.field3129 = new int[11];
		}

		var0.field3180[var1] = var2;
		if (var2 != null) {
			var0.field3125 = true;
		} else {
			var0.field3125 = false;

			for (int var4 = 0; var4 < var0.field3180.length; ++var4) {
				if (var0.field3180[var4] != null) {
					var0.field3125 = true;
					break;
				}
			}
		}

		var0.field3105[var1] = var3;
	}
}
