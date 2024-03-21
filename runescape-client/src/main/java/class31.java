import java.applet.Applet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
public class class31 {
	@ObfuscatedName("aq")
	public static Applet field164;
	@ObfuscatedName("aw")
	public static String field160;
	@ObfuscatedName("vt")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	static PlatformInfo field165;

	static {
		field164 = null; // L: 10
		field160 = ""; // L: 11
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-511691401"
	)
	public static void method430() {
		class190.field2011.clear(); // L: 14
	} // L: 15

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-2030677800"
	)
	static final int method425(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 1021
			var1 /= 2;
		}

		if (var2 > 192) { // L: 1022
			var1 /= 2;
		}

		if (var2 > 217) { // L: 1023
			var1 /= 2;
		}

		if (var2 > 243) { // L: 1024
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 1025
		return var3; // L: 1026
	}
}
