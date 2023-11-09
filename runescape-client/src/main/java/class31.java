import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
public class class31 {
	@ObfuscatedName("ai")
	public static Applet field162;
	@ObfuscatedName("aj")
	public static String field165;

	static {
		field162 = null; // L: 10
		field165 = ""; // L: 11
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IZIZB)V",
		garbageValue = "6"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (class16.World_worlds != null) { // L: 172
			UserComparator9.doWorldSorting(0, class16.World_worlds.length - 1, var0, var1, var2, var3); // L: 173
		}

	} // L: 175
}
