import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mz")
class class328 implements Callable {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	final MidiPcmStream this$0;
	// $FF: synthetic field
	final AtomicBoolean val$cancelled;

	@ObfuscatedSignature(
		descriptor = "(Lmo;Ljava/util/concurrent/atomic/AtomicBoolean;)V"
	)
	class328(MidiPcmStream var1, AtomicBoolean var2) {
		this.this$0 = var1; // L: 133
		this.val$cancelled = var2;
	}

	public Object call() {
		PriorityQueue var1 = this.this$0.field3515; // L: 136

		while (true) {
			class325 var2 = null; // L: 138
			synchronized(var1) { // L: 139
				if (var1.isEmpty() || this.val$cancelled.get()) { // L: 140
					return null; // L: 141
				}

				var2 = (class325)var1.remove(); // L: 143
			}

			var2.field3541.method1060(); // L: 145
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfh;",
		garbageValue = "1060291848"
	)
	static class130[] method6344() {
		return new class130[]{class130.field1548, class130.field1539, class130.field1540, class130.field1541, class130.field1544}; // L: 127
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIII)D",
		garbageValue = "635977340"
	)
	static double method6345(int var0, int var1, int var2) {
		double var3 = var1 > 0 ? (double)Math.max(0.0F, Math.min(1.0F, (float)var0 / (float)var1)) : 1.0D; // L: 29
		if (var3 > 0.0D && var3 < 1.0D) { // L: 30
			double var5;
			double var7;
			switch(var2) { // L: 33
			case 0:
				return var3; // L: 39
			case 1:
				return 1.0D - Math.cos(3.141592653589793D * var3 / 2.0D); // L: 35
			case 2:
				return Math.sin(var3 * 3.141592653589793D / 2.0D); // L: 54
			case 3:
				return -(Math.cos(3.141592653589793D * var3) - 1.0D) / 2.0D; // L: 111
			case 4:
				return var3 * var3; // L: 48
			case 5:
				return 1.0D - (1.0D - var3) * (1.0D - var3); // L: 93
			case 6:
				return var3 < 0.5D ? var3 * var3 * 2.0D : 1.0D - Math.pow(var3 * -2.0D + 2.0D, 2.0D) / 2.0D; // L: 101
			case 7:
				return var3 * var3 * var3; // L: 91
			case 8:
				return 1.0D - Math.pow(1.0D - var3, 3.0D); // L: 105
			case 9:
				return var3 < 0.5D ? var3 * 4.0D * var3 * var3 : 1.0D - Math.pow(-2.0D * var3 + 2.0D, 3.0D) / 2.0D; // L: 64
			case 10:
				return var3 * var3 * var3 * var3; // L: 66
			case 11:
				return 1.0D - Math.pow(1.0D - var3, 4.0D); // L: 37
			case 12:
				return var3 < 0.5D ? var3 * var3 * 8.0D * var3 * var3 : 1.0D - Math.pow(2.0D + -2.0D * var3, 4.0D) / 2.0D; // L: 41
			case 13:
				return var3 * var3 * var3 * var3 * var3; // L: 103
			case 14:
				return 1.0D - Math.pow(1.0D - var3, 5.0D); // L: 50
			case 15:
				return var3 < 0.5D ? var3 * var3 * var3 * var3 * 8.0D * var3 : 1.0D - Math.pow(var3 * -2.0D + 2.0D, 5.0D) / 2.0D; // L: 81
			case 16:
				return Math.pow(2.0D, var3 * 10.0D - 10.0D); // L: 73
			case 17:
				return 1.0D - Math.pow(2.0D, -10.0D * var3); // L: 52
			case 18:
				return var3 < 0.5D ? Math.pow(2.0D, 10.0D + 20.0D * var3) / 2.0D : (2.0D - Math.pow(2.0D, 10.0D + -20.0D * var3)) / 2.0D; // L: 83
			case 19:
				return 1.0D - Math.sqrt(1.0D - Math.pow(var3, 2.0D)); // L: 109
			case 20:
				return Math.sqrt(1.0D - Math.pow(var3 - 1.0D, 2.0D)); // L: 56
			case 21:
				return var3 < 0.5D ? (1.0D - Math.sqrt(1.0D - Math.pow(2.0D * var3, 2.0D))) / 2.0D : (Math.sqrt(1.0D - Math.pow(var3 * -2.0D + 2.0D, 2.0D)) + 1.0D) / 2.0D; // L: 107
			case 22:
				var5 = 1.70158D; // L: 59
				var7 = 2.70158D; // L: 60
				return var3 * 2.70158D * var3 * var3 - var3 * 1.70158D * var3; // L: 61
			case 23:
				var5 = 1.70158D; // L: 96
				var7 = 2.70158D; // L: 97
				return 1.0D + 2.70158D * Math.pow(var3 - 1.0D, 3.0D) + 1.70158D * Math.pow(var3 - 1.0D, 2.0D); // L: 98
			case 24:
				var5 = 1.70158D; // L: 86
				var7 = 2.5949095D; // L: 87
				return var3 < 0.5D ? Math.pow(var3 * 2.0D, 2.0D) * (var3 * 7.189819D - 2.5949095D) / 2.0D : (Math.pow(2.0D * var3 - 2.0D, 2.0D) * ((2.0D * var3 - 2.0D) * 3.5949095D + 2.5949095D) + 2.0D) / 2.0D; // L: 88
			case 25:
				var5 = 2.0943951023931953D; // L: 44
				return -Math.pow(2.0D, 10.0D * var3 - 10.0D) * Math.sin((10.0D * var3 - 10.75D) * 2.0943951023931953D); // L: 45
			case 26:
				var5 = 2.0943951023931953D; // L: 69
				return Math.pow(2.0D, -10.0D * var3) * Math.sin((var3 * 10.0D - 0.75D) * 2.0943951023931953D) + 1.0D; // L: 70
			case 27:
				var5 = 1.3962634015954636D; // L: 76
				var7 = Math.sin(1.3962634015954636D * (20.0D * var3 - 11.125D)); // L: 77
				return var3 < 0.5D ? -(Math.pow(2.0D, 20.0D * var3 - 10.0D) * var7) / 2.0D : Math.pow(2.0D, var3 * -20.0D + 10.0D) * var7 / 2.0D + 1.0D; // L: 78
			default:
				return var3; // L: 113
			}
		} else {
			return var3 <= 0.0D ? 0.0D : 1.0D; // L: 31
		}
	}
}
