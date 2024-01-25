import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
public class class209 {
	@ObfuscatedName("oy")
	@ObfuscatedGetter(
		intValue = 2012449351
	)
	@Export("menuX")
	static int menuX;
	@ObfuscatedName("ov")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	static Widget field2287;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	public UrlRequest field2284;
	@ObfuscatedName("ap")
	public float[] field2282;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	final class219 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lih;)V"
	)
	class209(class219 var1) {
		this.this$0 = var1;
		this.field2282 = new float[4]; // L: 296
	} // L: 298

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIII)D",
		garbageValue = "-440010209"
	)
	static double method4207(int var0, int var1, int var2) {
		double var3 = var1 > 0 ? (double)Math.max(0.0F, Math.min(1.0F, (float)var0 / (float)var1)) : 1.0D; // L: 29
		if (var3 > 0.0D && var3 < 1.0D) { // L: 30
			double var5;
			double var7;
			switch(var2) { // L: 33
			case 0:
				return var3; // L: 58
			case 1:
				return 1.0D - Math.cos(3.141592653589793D * var3 / 2.0D); // L: 78
			case 2:
				return Math.sin(var3 * 3.141592653589793D / 2.0D); // L: 104
			case 3:
				return -(Math.cos(3.141592653589793D * var3) - 1.0D) / 2.0D; // L: 52
			case 4:
				return var3 * var3; // L: 54
			case 5:
				return 1.0D - (1.0D - var3) * (1.0D - var3); // L: 64
			case 6:
				return var3 < 0.5D ? 2.0D * var3 * var3 : 1.0D - Math.pow(2.0D + var3 * -2.0D, 2.0D) / 2.0D; // L: 80
			case 7:
				return var3 * var3 * var3; // L: 37
			case 8:
				return 1.0D - Math.pow(1.0D - var3, 3.0D); // L: 100
			case 9:
				return var3 < 0.5D ? 4.0D * var3 * var3 * var3 : 1.0D - Math.pow(2.0D + var3 * -2.0D, 3.0D) / 2.0D; // L: 50
			case 10:
				return var3 * var3 * var3 * var3; // L: 82
			case 11:
				return 1.0D - Math.pow(1.0D - var3, 4.0D); // L: 60
			case 12:
				return var3 < 0.5D ? var3 * var3 * var3 * 8.0D * var3 : 1.0D - Math.pow(2.0D + var3 * -2.0D, 4.0D) / 2.0D; // L: 98
			case 13:
				return var3 * var3 * var3 * var3 * var3; // L: 90
			case 14:
				return 1.0D - Math.pow(1.0D - var3, 5.0D); // L: 94
			case 15:
				return var3 < 0.5D ? var3 * var3 * var3 * var3 * 8.0D * var3 : 1.0D - Math.pow(var3 * -2.0D + 2.0D, 5.0D) / 2.0D; // L: 92
			case 16:
				return Math.pow(2.0D, 10.0D * var3 - 10.0D); // L: 106
			case 17:
				return 1.0D - Math.pow(2.0D, var3 * -10.0D); // L: 35
			case 18:
				return var3 < 0.5D ? Math.pow(2.0D, 10.0D + 20.0D * var3) / 2.0D : (2.0D - Math.pow(2.0D, 10.0D + -20.0D * var3)) / 2.0D; // L: 96
			case 19:
				return 1.0D - Math.sqrt(1.0D - Math.pow(var3, 2.0D)); // L: 56
			case 20:
				return Math.sqrt(1.0D - Math.pow(var3 - 1.0D, 2.0D)); // L: 102
			case 21:
				return var3 < 0.5D ? (1.0D - Math.sqrt(1.0D - Math.pow(2.0D * var3, 2.0D))) / 2.0D : (Math.sqrt(1.0D - Math.pow(2.0D + -2.0D * var3, 2.0D)) + 1.0D) / 2.0D; // L: 62
			case 22:
				var5 = 1.70158D; // L: 85
				var7 = 2.70158D; // L: 86
				return var3 * var3 * 2.70158D * var3 - var3 * 1.70158D * var3; // L: 87
			case 23:
				var5 = 1.70158D; // L: 67
				var7 = 2.70158D; // L: 68
				return 1.0D + 2.70158D * Math.pow(var3 - 1.0D, 3.0D) + 1.70158D * Math.pow(var3 - 1.0D, 2.0D); // L: 69
			case 24:
				var5 = 1.70158D; // L: 73
				var7 = 2.5949095D; // L: 74
				return var3 < 0.5D ? Math.pow(2.0D * var3, 2.0D) * (7.189819D * var3 - 2.5949095D) / 2.0D : (Math.pow(2.0D * var3 - 2.0D, 2.0D) * ((var3 * 2.0D - 2.0D) * 3.5949095D + 2.5949095D) + 2.0D) / 2.0D; // L: 75
			case 25:
				var5 = 2.0943951023931953D; // L: 46
				return -Math.pow(2.0D, var3 * 10.0D - 10.0D) * Math.sin(2.0943951023931953D * (10.0D * var3 - 10.75D)); // L: 47
			case 26:
				var5 = 2.0943951023931953D; // L: 109
				return Math.pow(2.0D, -10.0D * var3) * Math.sin(2.0943951023931953D * (var3 * 10.0D - 0.75D)) + 1.0D; // L: 110
			case 27:
				var5 = 1.3962634015954636D; // L: 40
				var7 = Math.sin(1.3962634015954636D * (var3 * 20.0D - 11.125D)); // L: 41
				return var3 < 0.5D ? -(Math.pow(2.0D, var3 * 20.0D - 10.0D) * var7) / 2.0D : Math.pow(2.0D, 10.0D + var3 * -20.0D) * var7 / 2.0D + 1.0D; // L: 42
			default:
				return var3; // L: 113
			}
		} else {
			return var3 <= 0.0D ? 0.0D : 1.0D; // L: 31
		}
	}
}
