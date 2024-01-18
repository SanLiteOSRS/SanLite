import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	static final WorldMapID field2653;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	static final WorldMapID field2649;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1939518077
	)
	@Export("value")
	final int value;

	static {
		field2653 = new WorldMapID(0); // L: 4
		field2649 = new WorldMapID(1); // L: 5
	}

	WorldMapID(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1734459633"
	)
	static void method5029() {
		TaskHandler.field2295 = new int[2000]; // L: 25
		int var0 = 0; // L: 26
		int var1 = 240; // L: 27

		int var3;
		for (byte var2 = 12; var0 < 16; var1 -= var2) { // L: 28
			var3 = MilliClock.method4269((double)((float)var1 / 360.0F), 0.9998999834060669D, (double)((float)var0 * 0.425F / 16.0F + 0.075F)); // L: 30
			TaskHandler.field2295[var0] = var3; // L: 31
			++var0; // L: 29
		}

		var1 = 48; // L: 33

		for (int var5 = var1 / 6; var0 < TaskHandler.field2295.length; var1 -= var5) { // L: 34 35 41
			var3 = var0 * 2; // L: 36

			for (int var4 = MilliClock.method4269((double)((float)var1 / 360.0F), 0.9998999834060669D, 0.5D); var0 < var3 && var0 < TaskHandler.field2295.length; ++var0) { // L: 37 38
				TaskHandler.field2295[var0] = var4; // L: 39
			}
		}

	} // L: 43

	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "(Lnn;III)V",
		garbageValue = "-425673760"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) { // L: 11055
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) { // L: 11056
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) { // L: 11057
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) { // L: 11058
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) { // L: 11059
			var0.x = (var1 - var0.width) / 2 + (var0.rawX * var1 >> 14);
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14); // L: 11060
		}

		if (var0.yAlignment == 0) { // L: 11061
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) { // L: 11062
			var0.y = (var2 - var0.height) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) { // L: 11063
			var0.y = var2 - var0.height - var0.rawY;
		} else if (var0.yAlignment == 3) { // L: 11064
			var0.y = var2 * var0.rawY >> 14;
		} else if (var0.yAlignment == 4) { // L: 11065
			var0.y = (var2 - var0.height) / 2 + (var2 * var0.rawY >> 14);
		} else {
			var0.y = var2 - var0.height - (var2 * var0.rawY >> 14); // L: 11066
		}

	} // L: 11067
}
