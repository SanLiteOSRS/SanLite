import java.util.Date;
import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("md")
class class312 implements Callable {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	final MidiPcmStream this$0;
	// $FF: synthetic field
	final AtomicBoolean val$cancelled;

	@ObfuscatedSignature(
		descriptor = "(Llf;Ljava/util/concurrent/atomic/AtomicBoolean;)V"
	)
	class312(MidiPcmStream var1, AtomicBoolean var2) {
		this.this$0 = var1; // L: 127
		this.val$cancelled = var2;
	}

	public Object call() {
		PriorityQueue var1 = this.this$0.field3423; // L: 130

		while (true) {
			class309 var2 = null; // L: 132
			synchronized(var1) { // L: 133
				if (var1.isEmpty() || this.val$cancelled.get()) { // L: 134
					return null; // L: 135
				}

				var2 = (class309)var1.remove(); // L: 137
			}

			var2.field3464.method1096(); // L: 139
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Date;",
		garbageValue = "1739317164"
	)
	static Date method5971() {
		java.util.Calendar var0 = java.util.Calendar.getInstance(); // L: 1038
		var0.set(2, 0); // L: 1039
		var0.set(5, 1); // L: 1040
		var0.set(1, 1900); // L: 1041
		return var0.getTime(); // L: 1042
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2037147642"
	)
	static final int method5969(int var0, int var1) {
		int var2 = class351.method6622(var0 - 1, var1 - 1) + class351.method6622(1 + var0, var1 - 1) + class351.method6622(var0 - 1, var1 + 1) + class351.method6622(1 + var0, var1 + 1); // L: 995
		int var3 = class351.method6622(var0 - 1, var1) + class351.method6622(1 + var0, var1) + class351.method6622(var0, var1 - 1) + class351.method6622(var0, var1 + 1); // L: 996
		int var4 = class351.method6622(var0, var1); // L: 997
		return var2 / 16 + var3 / 8 + var4 / 4; // L: 998
	}
}
