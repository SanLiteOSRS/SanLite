import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("my")
class class328 implements Callable {
	@ObfuscatedName("aw")
	public static ThreadPoolExecutor field3567;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	final MidiPcmStream this$0;
	// $FF: synthetic field
	final AtomicBoolean val$cancelled;

	@ObfuscatedSignature(
		descriptor = "(Lmx;Ljava/util/concurrent/atomic/AtomicBoolean;)V"
	)
	class328(MidiPcmStream var1, AtomicBoolean var2) {
		this.this$0 = var1; // L: 124
		this.val$cancelled = var2;
	}

	public Object call() {
		PriorityQueue var1 = this.this$0.field3532; // L: 127

		while (true) {
			class325 var2 = null; // L: 129
			synchronized(var1) { // L: 130
				if (var1.isEmpty() || this.val$cancelled.get()) { // L: 131
					return null; // L: 132
				}

				var2 = (class325)var1.remove(); // L: 134
			}

			var2.field3553.method1043(); // L: 136
		}
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1636241236"
	)
	static final int method6193(int var0) {
		return Math.min(Math.max(var0, 128), 383); // L: 4043
	}
}
