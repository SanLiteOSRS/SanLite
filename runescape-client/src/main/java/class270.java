import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ka")
public class class270 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	static final class270 field3036;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	static final class270 field3039;
	@ObfuscatedName("fb")
	@ObfuscatedGetter(
		longValue = -8732969090401109105L
	)
	static long field3042;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1287567465
	)
	@Export("value")
	final int value;

	static {
		field3036 = new class270(0); // L: 4
		field3039 = new class270(1); // L: 5
	}

	class270(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;ZI)V",
		garbageValue = "544527881"
	)
	static void method5492(ArrayList var0, boolean var1) {
		if (!var1) { // L: 178
			class305.field3405.clear(); // L: 179
		}

		Iterator var2 = var0.iterator(); // L: 181

		while (var2.hasNext()) {
			class317 var3 = (class317)var2.next(); // L: 182
			if (var3.field3511 != -1 && var3.field3512 != -1) { // L: 184
				if (!var1) { // L: 187
					class305.field3405.add(var3); // L: 188
				}

				class305.field3411.add(var3); // L: 190
			}
		}

	} // L: 193

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "2087422796"
	)
	public static void method5491(int var0, int var1, int var2, int var3) {
		class305.field3408 = var0; // L: 196
		class305.field3409 = var1; // L: 197
		class305.field3410 = var2; // L: 198
		class305.field3401 = var3; // L: 199
	} // L: 200

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(CII)Ljava/lang/String;",
		garbageValue = "1203600347"
	)
	public static String method5493(char var0, int var1) {
		char[] var2 = new char[var1]; // L: 210

		for (int var3 = 0; var3 < var1; ++var3) { // L: 211
			var2[var3] = var0;
		}

		return new String(var2); // L: 212
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "340629836"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field756 = 0L; // L: 4451
		if (var0 >= 2) { // L: 4452
			Client.isResizable = true;
		} else {
			Client.isResizable = false; // L: 4453
		}

		if (class218.getWindowedMode() == 1) { // L: 4454
			class219.client.setMaxCanvasSize(765, 503); // L: 4455
		} else {
			class219.client.setMaxCanvasSize(7680, 2160); // L: 4458
		}

		if (Client.gameState >= 25) { // L: 4460
			Message.method1217();
		}

	} // L: 4461
}
