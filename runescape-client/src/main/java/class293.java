import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kh")
public class class293 {
	@ObfuscatedName("o")
	public static final short[] field3345;
	@ObfuscatedName("q")
	public static final short[][] field3343;
	@ObfuscatedName("f")
	public static final short[] field3344;
	@ObfuscatedName("u")
	public static final short[][] field3346;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	static Archive field3349;

	static {
		field3345 = new short[]{6798, 8741, 25238, 4626, 4550}; // L: 4
		field3343 = new short[][]{{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {4626, 11146, 6439, 12, 4758, 10270}, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574, 17050, 0, 127, -31821, -17991}}; // L: 5
		field3344 = new short[]{-10304, 9104, -1, -1, -1};
		field3346 = new short[][]{{6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002}, {9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019}, new short[0], new short[0], new short[0]}; // L: 13
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lz;I)Lu;",
		garbageValue = "-1327674315"
	)
	public static class3 method5614(class6 var0) {
		switch(var0.field19) { // L: 9
		case 0:
			return new class0(); // L: 16
		default:
			throw new IllegalArgumentException(); // L: 12
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;Ljava/io/File;I)V",
		garbageValue = "1538873213"
	)
	static void method5616(File var0, File var1) {
		try {
			AccessFile var2 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L); // L: 133
			Buffer var3 = new Buffer(500); // L: 134
			var3.writeByte(3); // L: 135
			var3.writeByte(var1 != null ? 1 : 0); // L: 136
			var3.writeCESU8(var0.getPath()); // L: 137
			if (var1 != null) {
				var3.writeCESU8(""); // L: 138
			}

			var2.write(var3.array, 0, var3.offset); // L: 139
			var2.close(); // L: 140
		} catch (IOException var4) { // L: 142
			var4.printStackTrace(); // L: 143
		}

	} // L: 145

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)Lku;",
		garbageValue = "891301072"
	)
	@Export("getWidgetChild")
	public static Widget getWidgetChild(int var0, int var1) {
		Widget var2 = FloorUnderlayDefinition.getWidget(var0); // L: 230
		if (var1 == -1) { // L: 231
			return var2;
		} else {
			return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null; // L: 232 233
		}
	}
}
