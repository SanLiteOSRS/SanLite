import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
public class class125 {
	@ObfuscatedName("ab")
	public static final float field1468;
	@ObfuscatedName("at")
	public static final float field1466;
	@ObfuscatedName("ax")
	static float[] field1473;
	@ObfuscatedName("al")
	static float[] field1471;

	static {
		field1468 = Math.ulp(1.0F); // L: 10
		field1466 = 2.0F * field1468; // L: 11
		field1473 = new float[4]; // L: 12
		field1471 = new float[5]; // L: 13
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZI)V",
		garbageValue = "912413263"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		if (var1) { // L: 28
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) { // L: 29
				try {
					Desktop.getDesktop().browse(new URI(var0)); // L: 31
					return; // L: 58
				} catch (Exception var4) { // L: 34
				}
			}

			if (class31.field148.startsWith("win")) { // L: 36
				UserComparator10.method2882(var0, 0, "openjs"); // L: 39
			} else if (class31.field148.startsWith("mac")) { // L: 44
				UserComparator10.method2882(var0, 1, "openjs"); // L: 45
			} else {
				UserComparator10.method2882(var0, 2, "openjs"); // L: 49
			}
		} else {
			UserComparator10.method2882(var0, 3, "openjs"); // L: 54
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z",
		garbageValue = "-1348917239"
	)
	static final boolean method2919(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = ViewportMouse.ViewportMouse_y + var6; // L: 114
		if (var7 < var0 && var7 < var1 && var7 < var2) { // L: 115
			return false;
		} else {
			var7 = ViewportMouse.ViewportMouse_y - var6; // L: 116
			if (var7 > var0 && var7 > var1 && var7 > var2) {
				return false; // L: 117
			} else {
				var7 = ViewportMouse.ViewportMouse_x + var6; // L: 118
				if (var7 < var3 && var7 < var4 && var7 < var5) { // L: 119
					return false;
				} else {
					var7 = ViewportMouse.ViewportMouse_x - var6; // L: 120
					return var7 <= var3 || var7 <= var4 || var7 <= var5; // L: 121
				}
			}
		}
	}
}
