import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kh")
public class class308 {
	@ObfuscatedName("f")
	public static final short[] field3532;
	@ObfuscatedName("w")
	public static final short[][] field3533;
	@ObfuscatedName("v")
	public static final short[] field3534;
	@ObfuscatedName("s")
	public static final short[][] field3535;

	static {
		field3532 = new short[]{6798, 8741, 25238, 4626, 4550}; // L: 4
		field3533 = new short[][]{{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {4626, 11146, 6439, 12, 4758, 10270}, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574, 17050, 0, 127, -31821, -17991}}; // L: 5
		field3534 = new short[]{-10304, 9104, -1, -1, -1}; // L: 12
		field3535 = new short[][]{{6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002}, {9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019}, new short[0], new short[0], new short[0]}; // L: 13
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lkz;I)I",
		garbageValue = "914646583"
	)
	static int method6188(Widget var0) {
		if (var0.type != 11) { // L: 1529
			Interpreter.Interpreter_stringStack[class20.Interpreter_stringStackSize - 1] = ""; // L: 1530
			return 1; // L: 1531
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 1533
			Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var0.method6285(var1); // L: 1534
			return 1; // L: 1535
		}
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static void method6192() {
		for (class204 var0 = (class204)Client.field721.last(); var0 != null; var0 = (class204)Client.field721.previous()) { // L: 5162
			var0.remove(); // L: 5163
		}

	} // L: 5165
}
