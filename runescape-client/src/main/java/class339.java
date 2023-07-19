import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("np")
public enum class339 implements class371 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	field3796(0),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	field3794(1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	field3793(2),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	field3799(3),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	field3797(4);

	@ObfuscatedName("ao")
	public static short[][] field3795;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1483295431
	)
	final int field3798;

	class339(int var3) {
		this.field3798 = var3; // L: 14
	} // L: 15

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1233989967"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3798; // L: 19
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZB)V",
		garbageValue = "-21"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		if (var1) { // L: 23
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) { // L: 24
				try {
					Desktop.getDesktop().browse(new URI(var0)); // L: 26
					return; // L: 53
				} catch (Exception var4) { // L: 29
				}
			}

			if (class31.field165.startsWith("win")) { // L: 31
				GraphicsDefaults.method8142(var0, 0, "openjs"); // L: 34
			} else if (class31.field165.startsWith("mac")) { // L: 39
				GraphicsDefaults.method8142(var0, 1, "openjs"); // L: 40
			} else {
				GraphicsDefaults.method8142(var0, 2, "openjs"); // L: 44
			}
		} else {
			GraphicsDefaults.method8142(var0, 3, "openjs"); // L: 49
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-18"
	)
	static final void method6635(String var0) {
		ReflectionCheck.addGameMessage(30, "", var0); // L: 110
	} // L: 111
}
