import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("ao")
	static short[][][] field2820;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1814285237
	)
	@Export("x")
	int x;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 677675313
	)
	@Export("y")
	int y;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1463557097
	)
	@Export("z")
	int z;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 169341921
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	} // L: 9

	@ObfuscatedSignature(
		descriptor = "(Ljp;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x; // L: 12
		this.y = var1.y; // L: 13
		this.z = var1.z; // L: 14
		this.magnitude = var1.magnitude; // L: 15
	} // L: 16

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZI)V",
		garbageValue = "-2141219999"
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

			if (class31.field170.startsWith("win")) { // L: 36
				Friend.method8021(var0, 0, "openjs"); // L: 39
			} else if (class31.field170.startsWith("mac")) { // L: 44
				Friend.method8021(var0, 1, "openjs"); // L: 45
			} else {
				Friend.method8021(var0, 2, "openjs"); // L: 49
			}
		} else {
			Friend.method8021(var0, 3, "openjs"); // L: 54
		}

	}
}
