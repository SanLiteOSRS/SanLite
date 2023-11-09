import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pi")
@Implements("Ignored")
public class Ignored extends Nameable {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1260376973
	)
	@Export("id")
	int id;

	Ignored() {
	} // L: 6

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)I",
		garbageValue = "-21"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id; // L: 9
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lpw;I)I",
		garbageValue = "1093536041"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareTo_ignored((Ignored)var1); // L: 13
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1); // L: 17
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZB)V",
		garbageValue = "-88"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		if (var1) { // L: 23
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) { // L: 24
				try {
					Desktop.getDesktop().browse(new URI(var0)); // L: 26
					return; // L: 51
				} catch (Exception var4) { // L: 29
				}
			}

			if (class31.field175.startsWith("win")) { // L: 31
				GrandExchangeOfferOwnWorldComparator.method1228(var0, 0); // L: 33
			} else if (class31.field175.startsWith("mac")) { // L: 37
				RouteStrategy.method4288(var0, 1, "openjs"); // L: 38
			} else {
				RouteStrategy.method4288(var0, 2, "openjs"); // L: 42
			}
		} else {
			RouteStrategy.method4288(var0, 3, "openjs"); // L: 47
		}

	}
}
