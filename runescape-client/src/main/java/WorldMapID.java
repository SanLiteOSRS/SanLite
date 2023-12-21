import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	static final WorldMapID field2608;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	static final WorldMapID field2607;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 909559475
	)
	@Export("value")
	final int value;

	static {
		field2608 = new WorldMapID(0); // L: 4
		field2607 = new WorldMapID(1); // L: 5
	}

	WorldMapID(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([FIFI)F",
		garbageValue = "-1267695907"
	)
	static float method4936(float[] var0, int var1, float var2) {
		float var3 = var0[var1]; // L: 108

		for (int var4 = var1 - 1; var4 >= 0; --var4) { // L: 109
			var3 = var0[var4] + var2 * var3; // L: 110
		}

		return var3; // L: 112
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1945515950"
	)
	public static void method4937(int var0) {
		if (!class316.field3422.isEmpty()) { // L: 73
			Iterator var1 = class316.field3422.iterator(); // L: 74

			while (var1.hasNext()) {
				class328 var2 = (class328)var1.next(); // L: 75
				if (var2 != null) { // L: 77
					var2.field3525 = var0; // L: 80
				}
			}

			class328 var3 = (class328)class316.field3422.get(0); // L: 83
			if (var3 != null && var3.field3522 != null && var3.field3522.isReady() && !var3.field3530) { // L: 84
				var3.field3522.setPcmStreamVolume(var0); // L: 85
				var3.field3528 = (float)var0; // L: 86
			}
		}

	} // L: 89

	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)Ljava/lang/String;",
		garbageValue = "24"
	)
	static String method4938(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://"; // L: 12781
		if (Client.gameBuild == 1) { // L: 12782
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) { // L: 12783
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) { // L: 12784
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) { // L: 12785
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) { // L: 12786
			var0 = "local";
		}

		String var3 = ""; // L: 12787
		if (MenuAction.field878 != null) { // L: 12788
			var3 = "/p=" + MenuAction.field878;
		}

		String var4 = "runescape.com"; // L: 12789
		return var2 + var0 + "." + var4 + "/l=" + class85.clientLanguage + "/a=" + DevicePcmPlayerProvider.field111 + var3 + "/"; // L: 12790
	}
}
