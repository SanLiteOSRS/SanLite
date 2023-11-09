import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("br")
public class class36 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("reflectionChecks")
	static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("cq")
	static String field263;
	@ObfuscatedName("le")
	@ObfuscatedGetter(
		intValue = -1399571883
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;
	@ObfuscatedName("mo")
	@ObfuscatedGetter(
		intValue = 988841787
	)
	@Export("Client_plane")
	static int Client_plane;

	static {
		reflectionChecks = new IterableNodeDeque(); // L: 17
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "475151817"
	)
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 1004
			var1 /= 2;
		}

		if (var2 > 192) { // L: 1005
			var1 /= 2;
		}

		if (var2 > 217) { // L: 1006
			var1 /= 2;
		}

		if (var2 > 243) { // L: 1007
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 1008
		return var3; // L: 1009
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "([Lmt;IIIZS)V",
		garbageValue = "-18913"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) { // L: 11154
			Widget var6 = var0[var5]; // L: 11155
			if (var6 != null && var6.parentId == var1) { // L: 11156 11157
				FriendSystem.alignWidgetSize(var6, var2, var3, var4); // L: 11158
				class17.alignWidgetPosition(var6, var2, var3); // L: 11159
				if (var6.scrollX > var6.scrollWidth - var6.width) { // L: 11160
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) { // L: 11161
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) {
					var6.scrollY = var6.scrollHeight - var6.height; // L: 11162
				}

				if (var6.scrollY < 0) { // L: 11163
					var6.scrollY = 0;
				}

				if (var6.type == 0) { // L: 11164
					SoundCache.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	} // L: 11166
}
