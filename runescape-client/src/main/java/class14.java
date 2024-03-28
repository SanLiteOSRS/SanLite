import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ar")
public class class14 {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1409881511
	)
	final int field63;
	@ObfuscatedName("ah")
	final String field62;
	@ObfuscatedName("af")
	final ThreadFactory field64;
	@ObfuscatedName("at")
	final ThreadPoolExecutor field65;

	public class14(String var1, int var2, int var3) {
		this.field62 = var1; // L: 15
		this.field63 = var2; // L: 16
		this.field64 = new class16(this); // L: 17
		this.field65 = this.method173(var3); // L: 18
	} // L: 19

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "1161266581"
	)
	final ThreadPoolExecutor method173(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field63), this.field64); // L: 22
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Las;I)Lap;",
		garbageValue = "-1967224341"
	)
	public class18 method174(class10 var1) {
		if (this.field65.getQueue().remainingCapacity() <= 0) { // L: 26
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field65.getCorePoolSize() + " Queue capacity " + this.field63); // L: 27
			return new class18("Queue full"); // L: 28
		} else {
			class18 var2 = new class18(this.field65.submit(new class19(this, var1)));
			return var2;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1920935364"
	)
	public final void method181() {
		try {
			this.field65.shutdown(); // L: 36
		} catch (Exception var2) { // L: 38
			System.err.println("Error shutting down RestRequestService\r\n" + var2);
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2070593164"
	)
	public static void method183() {
		ParamComposition.ParamComposition_cached.clear();
	} // L: 73

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIII)D",
		garbageValue = "929431107"
	)
	static double method185(int var0, int var1, int var2) {
		double var3 = var1 > 0 ? (double)Math.max(0.0F, Math.min(1.0F, (float)var0 / (float)var1)) : 1.0D; // L: 29
		if (var3 > 0.0D && var3 < 1.0D) { // L: 30
			double var5;
			double var7;
			switch(var2) { // L: 33
			case 0:
				return var3; // L: 35
			case 1:
				return 1.0D - Math.cos(3.141592653589793D * var3 / 2.0D); // L: 81
			case 2:
				return Math.sin(var3 * 3.141592653589793D / 2.0D); // L: 98
			case 3:
				return -(Math.cos(var3 * 3.141592653589793D) - 1.0D) / 2.0D; // L: 37
			case 4:
				return var3 * var3; // L: 59
			case 5:
				return 1.0D - (1.0D - var3) * (1.0D - var3); // L: 51
			case 6:
				return var3 < 0.5D ? var3 * 2.0D * var3 : 1.0D - Math.pow(2.0D + -2.0D * var3, 2.0D) / 2.0D; // L: 43
			case 7:
				return var3 * var3 * var3; // L: 90
			case 8:
				return 1.0D - Math.pow(1.0D - var3, 3.0D); // L: 41
			case 9:
				return var3 < 0.5D ? var3 * var3 * 4.0D * var3 : 1.0D - Math.pow(2.0D + -2.0D * var3, 3.0D) / 2.0D; // L: 61
			case 10:
				return var3 * var3 * var3 * var3; // L: 100
			case 11:
				return 1.0D - Math.pow(1.0D - var3, 4.0D); // L: 47
			case 12:
				return var3 < 0.5D ? var3 * 8.0D * var3 * var3 * var3 : 1.0D - Math.pow(-2.0D * var3 + 2.0D, 4.0D) / 2.0D; // L: 83
			case 13:
				return var3 * var3 * var3 * var3 * var3; // L: 75
			case 14:
				return 1.0D - Math.pow(1.0D - var3, 5.0D); // L: 79
			case 15:
				return var3 < 0.5D ? var3 * var3 * var3 * 8.0D * var3 * var3 : 1.0D - Math.pow(2.0D + -2.0D * var3, 5.0D) / 2.0D; // L: 109
			case 16:
				return Math.pow(2.0D, 10.0D * var3 - 10.0D); // L: 45
			case 17:
				return 1.0D - Math.pow(2.0D, -10.0D * var3); // L: 77
			case 18:
				return var3 < 0.5D ? Math.pow(2.0D, 10.0D + var3 * 20.0D) / 2.0D : (2.0D - Math.pow(2.0D, -20.0D * var3 + 10.0D)) / 2.0D; // L: 111
			case 19:
				return 1.0D - Math.sqrt(1.0D - Math.pow(var3, 2.0D)); // L: 102
			case 20:
				return Math.sqrt(1.0D - Math.pow(var3 - 1.0D, 2.0D)); // L: 49
			case 21:
				return var3 < 0.5D ? (1.0D - Math.sqrt(1.0D - Math.pow(var3 * 2.0D, 2.0D))) / 2.0D : (Math.sqrt(1.0D - Math.pow(2.0D + var3 * -2.0D, 2.0D)) + 1.0D) / 2.0D; // L: 39
			case 22:
				var5 = 1.70158D; // L: 70
				var7 = 2.70158D; // L: 71
				return var3 * 2.70158D * var3 * var3 - var3 * var3 * 1.70158D; // L: 72
			case 23:
				var5 = 1.70158D; // L: 54
				var7 = 2.70158D; // L: 55
				return 1.0D + 2.70158D * Math.pow(var3 - 1.0D, 3.0D) + 1.70158D * Math.pow(var3 - 1.0D, 2.0D); // L: 56
			case 24:
				var5 = 1.70158D; // L: 64
				var7 = 2.5949095D; // L: 65
				return var3 < 0.5D ? Math.pow(var3 * 2.0D, 2.0D) * (7.189819D * var3 - 2.5949095D) / 2.0D : (Math.pow(var3 * 2.0D - 2.0D, 2.0D) * (2.5949095D + (2.0D * var3 - 2.0D) * 3.5949095D) + 2.0D) / 2.0D; // L: 66
			case 25:
				var5 = 2.0943951023931953D; // L: 86
				return -Math.pow(2.0D, var3 * 10.0D - 10.0D) * Math.sin((10.0D * var3 - 10.75D) * 2.0943951023931953D); // L: 87
			case 26:
				var5 = 2.0943951023931953D; // L: 105
				return Math.pow(2.0D, -10.0D * var3) * Math.sin(2.0943951023931953D * (10.0D * var3 - 0.75D)) + 1.0D; // L: 106
			case 27:
				var5 = 1.3962634015954636D; // L: 93
				var7 = Math.sin(1.3962634015954636D * (20.0D * var3 - 11.125D)); // L: 94
				return var3 < 0.5D ? -(Math.pow(2.0D, 20.0D * var3 - 10.0D) * var7) / 2.0D : Math.pow(2.0D, 10.0D + -20.0D * var3) * var7 / 2.0D + 1.0D; // L: 95
			default:
				return var3; // L: 113
			}
		} else {
			return var3 <= 0.0D ? 0.0D : 1.0D; // L: 31
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ILnt;IIIII[FB)Lnt;",
		garbageValue = "-98"
	)
	static Widget method184(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget(); // L: 824
		var8.type = var0; // L: 825
		var8.parentId = var1.id; // L: 826
		var8.childIndex = var2; // L: 827
		var8.isIf3 = true; // L: 828
		var8.xAlignment = var3; // L: 829
		var8.yAlignment = var4; // L: 830
		var8.widthAlignment = var5; // L: 831
		var8.heightAlignment = var6; // L: 832
		var8.rawX = (int)((float)var1.width * var7[0]); // L: 833
		var8.rawY = (int)(var7[1] * (float)var1.height); // L: 834
		var8.rawWidth = (int)(var7[2] * (float)var1.width); // L: 835
		var8.rawHeight = (int)((float)var1.height * var7[3]); // L: 836
		return var8; // L: 837
	}
}
