import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lr")
public class class302 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIB)D",
		garbageValue = "-9"
	)
	static double method5727(int var0, int var1, int var2) {
		double var3 = var1 > 0 ? (double)Math.max(0.0F, Math.min(1.0F, (float)var0 / (float)var1)) : 1.0D; // L: 29
		if (var3 > 0.0D && var3 < 1.0D) { // L: 30
			double var5;
			double var7;
			switch(var2) { // L: 33
			case 0:
				return var3; // L: 37
			case 1:
				return 1.0D - Math.cos(3.141592653589793D * var3 / 2.0D); // L: 111
			case 2:
				return Math.sin(var3 * 3.141592653589793D / 2.0D); // L: 47
			case 3:
				return -(Math.cos(3.141592653589793D * var3) - 1.0D) / 2.0D; // L: 107
			case 4:
				return var3 * var3; // L: 91
			case 5:
				return 1.0D - (1.0D - var3) * (1.0D - var3); // L: 99
			case 6:
				return var3 < 0.5D ? var3 * 2.0D * var3 : 1.0D - Math.pow(2.0D + var3 * -2.0D, 2.0D) / 2.0D; // L: 41
			case 7:
				return var3 * var3 * var3; // L: 35
			case 8:
				return 1.0D - Math.pow(1.0D - var3, 3.0D); // L: 59
			case 9:
				return var3 < 0.5D ? var3 * 4.0D * var3 * var3 : 1.0D - Math.pow(2.0D + -2.0D * var3, 3.0D) / 2.0D; // L: 69
			case 10:
				return var3 * var3 * var3 * var3; // L: 73
			case 11:
				return 1.0D - Math.pow(1.0D - var3, 4.0D); // L: 87
			case 12:
				return var3 < 0.5D ? var3 * var3 * var3 * var3 * 8.0D : 1.0D - Math.pow(2.0D + -2.0D * var3, 4.0D) / 2.0D; // L: 55
			case 13:
				return var3 * var3 * var3 * var3 * var3; // L: 39
			case 14:
				return 1.0D - Math.pow(1.0D - var3, 5.0D); // L: 89
			case 15:
				return var3 < 0.5D ? var3 * var3 * 8.0D * var3 * var3 * var3 : 1.0D - Math.pow(var3 * -2.0D + 2.0D, 5.0D) / 2.0D; // L: 80
			case 16:
				return Math.pow(2.0D, var3 * 10.0D - 10.0D); // L: 67
			case 17:
				return 1.0D - Math.pow(2.0D, var3 * -10.0D); // L: 43
			case 18:
				return var3 < 0.5D ? Math.pow(2.0D, 10.0D + 20.0D * var3) / 2.0D : (2.0D - Math.pow(2.0D, 10.0D + var3 * -20.0D)) / 2.0D; // L: 57
			case 19:
				return 1.0D - Math.sqrt(1.0D - Math.pow(var3, 2.0D)); // L: 109
			case 20:
				return Math.sqrt(1.0D - Math.pow(var3 - 1.0D, 2.0D)); // L: 45
			case 21:
				return var3 < 0.5D ? (1.0D - Math.sqrt(1.0D - Math.pow(2.0D * var3, 2.0D))) / 2.0D : (Math.sqrt(1.0D - Math.pow(2.0D + -2.0D * var3, 2.0D)) + 1.0D) / 2.0D; // L: 71
			case 22:
				var5 = 1.70158D; // L: 94
				var7 = 2.70158D; // L: 95
				return var3 * 2.70158D * var3 * var3 - var3 * 1.70158D * var3; // L: 96
			case 23:
				var5 = 1.70158D; // L: 62
				var7 = 2.70158D; // L: 63
				return 1.0D + 2.70158D * Math.pow(var3 - 1.0D, 3.0D) + 1.70158D * Math.pow(var3 - 1.0D, 2.0D); // L: 64
			case 24:
				var5 = 1.70158D; // L: 102
				var7 = 2.5949095D; // L: 103
				return var3 < 0.5D ? Math.pow(var3 * 2.0D, 2.0D) * (7.189819D * var3 - 2.5949095D) / 2.0D : (Math.pow(2.0D * var3 - 2.0D, 2.0D) * (3.5949095D * (2.0D * var3 - 2.0D) + 2.5949095D) + 2.0D) / 2.0D; // L: 104
			case 25:
				var5 = 2.0943951023931953D; // L: 83
				return -Math.pow(2.0D, var3 * 10.0D - 10.0D) * Math.sin((var3 * 10.0D - 10.75D) * 2.0943951023931953D); // L: 84
			case 26:
				var5 = 2.0943951023931953D; // L: 76
				return Math.pow(2.0D, -10.0D * var3) * Math.sin(2.0943951023931953D * (10.0D * var3 - 0.75D)) + 1.0D; // L: 77
			case 27:
				var5 = 1.3962634015954636D; // L: 50
				var7 = Math.sin((20.0D * var3 - 11.125D) * 1.3962634015954636D); // L: 51
				return var3 < 0.5D ? -(Math.pow(2.0D, var3 * 20.0D - 10.0D) * var7) / 2.0D : Math.pow(2.0D, 10.0D + -20.0D * var3) * var7 / 2.0D + 1.0D; // L: 52
			default:
				return var3; // L: 113
			}
		} else {
			return var3 <= 0.0D ? 0.0D : 1.0D; // L: 31
		}
	}
}
