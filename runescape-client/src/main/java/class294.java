import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
public class class294 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	public static final class294 field3206;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	public static final class294 field3199;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	public static final class294 field3207;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	public static final class294 field3201;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	public static final class294 field3198;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	public static final class294 field3203;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	public static final class294 field3202;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	public static final class294 field3205;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	public static final class294 field3208;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	public static final class294 field3204;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	public static final class294 field3200;

	static {
		field3206 = new class294(4); // L: 5
		field3199 = new class294(11); // L: 6
		field3207 = new class294(5); // L: 7
		field3201 = new class294(14); // L: 8
		field3198 = new class294(16); // L: 9
		field3203 = new class294(4); // L: 10
		field3202 = new class294(2); // L: 11
		field3205 = new class294(5); // L: 12
		field3208 = new class294(7); // L: 13
		field3204 = new class294(14); // L: 14
		field3200 = new class294(6); // L: 15
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "4"
	)
	class294(int var1) {
	} // L: 21

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "67"
	)
	public static void method5664(int var0) {
		if (var0 != -1) { // L: 266
			if (class143.Widget_loadedInterfaces[var0]) { // L: 267
				Widget.Widget_archive.clearFilesGroup(var0); // L: 268
				if (class16.Widget_interfaceComponents[var0] != null) { // L: 269
					for (int var1 = 0; var1 < class16.Widget_interfaceComponents[var0].length; ++var1) { // L: 270
						if (class16.Widget_interfaceComponents[var0][var1] != null) { // L: 271
							class16.Widget_interfaceComponents[var0][var1] = null; // L: 272
						}
					}

					class16.Widget_interfaceComponents[var0] = null; // L: 275
					class143.Widget_loadedInterfaces[var0] = false; // L: 276
				}
			}
		}
	} // L: 277
}
