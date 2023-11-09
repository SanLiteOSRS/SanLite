import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
public class class96 {
	@ObfuscatedName("ar")
	@Export("cacheSubPaths")
	public static String[] cacheSubPaths;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	static Bounds field1295;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = 470489225
	)
	static int field1296;
	@ObfuscatedName("qe")
	@ObfuscatedGetter(
		intValue = 1993201275
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "55191168"
	)
	public static final synchronized long method2634() {
		long var0 = System.currentTimeMillis(); // L: 14
		if (var0 < class293.field3362) { // L: 15
			class293.field3363 += class293.field3362 - var0; // L: 16
		}

		class293.field3362 = var0; // L: 18
		return var0 + class293.field3363; // L: 19
	}
}
