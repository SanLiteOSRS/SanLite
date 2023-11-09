import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
public class class70 {
	@ObfuscatedName("af")
	static final BigInteger field885;
	@ObfuscatedName("an")
	static final BigInteger field887;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	@Export("loginType")
	static LoginType loginType;

	static {
		field885 = new BigInteger("10001", 16); // L: 6
		field887 = new BigInteger("caa2a7bee781b3652a5a550b5318cb074141ad9dbd06389622fbd58a3947aeb27e79771809fb6e20de92d7cdbe34830805ebad9bb17640a45878eea57edbb1d808a6122150c097b7a4960054ccc5e98fc0a139709f6f1a3dbf0bfc4559d63ba568b3860a7d477756bd21bb37f989b4522af2d3ee6af1781654acbafd740072c1", 16); // L: 7
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "698228402"
	)
	public static int method2044(int var0) {
		--var0;
		var0 |= var0 >>> 1; // L: 64
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4; // L: 66
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16; // L: 68
		return var0 + 1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIII)D",
		garbageValue = "-426403722"
	)
	static double method2045(int var0, int var1, int var2) {
		double var3 = var1 > 0 ? (double)Math.max(0.0F, Math.min(1.0F, (float)var0 / (float)var1)) : 1.0D; // L: 29
		if (var3 > 0.0D && var3 < 1.0D) { // L: 30
			double var5;
			double var7;
			switch(var2) { // L: 33
			case 0:
				return var3; // L: 71
			case 1:
				return 1.0D - Math.cos(3.141592653589793D * var3 / 2.0D); // L: 51
			case 2:
				return Math.sin(var3 * 3.141592653589793D / 2.0D); // L: 37
			case 3:
				return -(Math.cos(var3 * 3.141592653589793D) - 1.0D) / 2.0D; // L: 109
			case 4:
				return var3 * var3; // L: 43
			case 5:
				return 1.0D - (1.0D - var3) * (1.0D - var3); // L: 100
			case 6:
				return var3 < 0.5D ? var3 * var3 * 2.0D : 1.0D - Math.pow(2.0D + var3 * -2.0D, 2.0D) / 2.0D; // L: 67
			case 7:
				return var3 * var3 * var3; // L: 75
			case 8:
				return 1.0D - Math.pow(1.0D - var3, 3.0D); // L: 73
			case 9:
				return var3 < 0.5D ? 4.0D * var3 * var3 * var3 : 1.0D - Math.pow(2.0D + -2.0D * var3, 3.0D) / 2.0D; // L: 111
			case 10:
				return var3 * var3 * var3 * var3; // L: 41
			case 11:
				return 1.0D - Math.pow(1.0D - var3, 4.0D); // L: 96
			case 12:
				return var3 < 0.5D ? var3 * var3 * var3 * var3 * 8.0D : 1.0D - Math.pow(var3 * -2.0D + 2.0D, 4.0D) / 2.0D; // L: 63
			case 13:
				return var3 * var3 * var3 * var3 * var3; // L: 65
			case 14:
				return 1.0D - Math.pow(1.0D - var3, 5.0D); // L: 39
			case 15:
				return var3 < 0.5D ? var3 * var3 * var3 * 8.0D * var3 * var3 : 1.0D - Math.pow(var3 * -2.0D + 2.0D, 5.0D) / 2.0D; // L: 35
			case 16:
				return Math.pow(2.0D, var3 * 10.0D - 10.0D); // L: 98
			case 17:
				return 1.0D - Math.pow(2.0D, var3 * -10.0D); // L: 69
			case 18:
				return var3 < 0.5D ? Math.pow(2.0D, 20.0D * var3 + 10.0D) / 2.0D : (2.0D - Math.pow(2.0D, 10.0D + var3 * -20.0D)) / 2.0D; // L: 61
			case 19:
				return 1.0D - Math.sqrt(1.0D - Math.pow(var3, 2.0D)); // L: 107
			case 20:
				return Math.sqrt(1.0D - Math.pow(var3 - 1.0D, 2.0D)); // L: 59
			case 21:
				return var3 < 0.5D ? (1.0D - Math.sqrt(1.0D - Math.pow(2.0D * var3, 2.0D))) / 2.0D : (Math.sqrt(1.0D - Math.pow(2.0D + -2.0D * var3, 2.0D)) + 1.0D) / 2.0D; // L: 88
			case 22:
				var5 = 1.70158D; // L: 46
				var7 = 2.70158D; // L: 47
				return var3 * 2.70158D * var3 * var3 - 1.70158D * var3 * var3; // L: 48
			case 23:
				var5 = 1.70158D; // L: 91
				var7 = 2.70158D; // L: 92
				return 1.0D + 2.70158D * Math.pow(var3 - 1.0D, 3.0D) + 1.70158D * Math.pow(var3 - 1.0D, 2.0D); // L: 93
			case 24:
				var5 = 1.70158D; // L: 54
				var7 = 2.5949095D; // L: 55
				return var3 < 0.5D ? Math.pow(2.0D * var3, 2.0D) * (7.189819D * var3 - 2.5949095D) / 2.0D : (Math.pow(var3 * 2.0D - 2.0D, 2.0D) * (2.5949095D + (var3 * 2.0D - 2.0D) * 3.5949095D) + 2.0D) / 2.0D; // L: 56
			case 25:
				var5 = 2.0943951023931953D; // L: 103
				return -Math.pow(2.0D, var3 * 10.0D - 10.0D) * Math.sin((10.0D * var3 - 10.75D) * 2.0943951023931953D); // L: 104
			case 26:
				var5 = 2.0943951023931953D; // L: 84
				return Math.pow(2.0D, -10.0D * var3) * Math.sin((var3 * 10.0D - 0.75D) * 2.0943951023931953D) + 1.0D; // L: 85
			case 27:
				var5 = 1.3962634015954636D; // L: 78
				var7 = Math.sin((20.0D * var3 - 11.125D) * 1.3962634015954636D); // L: 79
				return var3 < 0.5D ? -(Math.pow(2.0D, var3 * 20.0D - 10.0D) * var7) / 2.0D : Math.pow(2.0D, -20.0D * var3 + 10.0D) * var7 / 2.0D + 1.0D; // L: 80
			default:
				return var3; // L: 113
			}
		} else {
			return var3 <= 0.0D ? 0.0D : 1.0D; // L: 31
		}
	}
}
