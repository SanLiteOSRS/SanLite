import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
public class class221 {
	@ObfuscatedName("g")
	@Export("ByteArrayPool_altSizeArrayCounts")
	static int[] ByteArrayPool_altSizeArrayCounts;

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;ZLjava/lang/String;ZI)V",
		garbageValue = "-1930935119"
	)
	static void method4198(String var0, boolean var1, String var2, boolean var3) {
		if (var1) {
			if (!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var5) {
				}
			}

			if (class44.field294.startsWith("win") && !var3) {
				class311.method5605(var0, 0, "openjs");
				return;
			}

			if (class44.field294.startsWith("mac")) {
				class311.method5605(var0, 1, var2);
				return;
			}

			class311.method5605(var0, 2, "openjs");
		} else {
			class311.method5605(var0, 3, "openjs");
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "1932340849"
	)
	public static boolean method4200(int var0) {
		return (var0 >> 30 & 1) != 0;
	}
}
