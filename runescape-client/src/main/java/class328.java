import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mp")
public class class328 {
	@ObfuscatedName("ub")
	@ObfuscatedGetter(
		intValue = 1503725696
	)
	static int field3585;
	@ObfuscatedName("ay")
	public static final short[] field3588;
	@ObfuscatedName("an")
	public static final short[][] field3590;
	@ObfuscatedName("ar")
	public static final short[] field3587;
	@ObfuscatedName("ab")
	public static final short[][] field3586;
	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	static Archive field3591;

	static {
		field3588 = new short[]{6798, 8741, 25238, 4626, 4550}; // L: 4
		field3590 = new short[][]{{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010, -22122, 937, 8130, -13422, 30385}, {8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {4626, 11146, 6439, 12, 4758, 10270}, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574, 17050, 0, 127, -31821, -17991}}; // L: 5
		field3587 = new short[]{-10304, 9104, -1, -1, -1}; // L: 12
		field3586 = new short[][]{{6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002, -22116, 945, 8144, -13414, 30389}, {9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019}, new short[0], new short[0], new short[0]}; // L: 13
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZS)I",
		garbageValue = "-270"
	)
	public static int method6422(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 81
			boolean var3 = false; // L: 82
			boolean var4 = false; // L: 83
			int var5 = 0; // L: 84
			int var6 = var0.length(); // L: 85

			for (int var7 = 0; var7 < var6; ++var7) { // L: 86
				char var8 = var0.charAt(var7); // L: 87
				if (var7 == 0) { // L: 88
					if (var8 == '-') { // L: 89
						var3 = true; // L: 90
						continue;
					}

					if (var8 == '+') { // L: 93
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0'; // L: 95
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 96
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 97
						throw new NumberFormatException(); // L: 98
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 99
					throw new NumberFormatException();
				}

				if (var3) { // L: 100
					var10 = -var10;
				}

				int var9 = var10 + var5 * var1; // L: 101
				if (var9 / var1 != var5) { // L: 102
					throw new NumberFormatException();
				}

				var5 = var9; // L: 103
				var4 = true; // L: 104
			}

			if (!var4) { // L: 106
				throw new NumberFormatException();
			} else {
				return var5; // L: 107
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}
