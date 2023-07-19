import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ml")
class class312 implements Callable {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	final MidiPcmStream this$0;
	// $FF: synthetic field
	final AtomicBoolean val$cancelled;

	@ObfuscatedSignature(
		descriptor = "(Llm;Ljava/util/concurrent/atomic/AtomicBoolean;)V"
	)
	class312(MidiPcmStream var1, AtomicBoolean var2) {
		this.this$0 = var1; // L: 118
		this.val$cancelled = var2;
	}

	public Object call() {
		PriorityQueue var1 = this.this$0.field3435; // L: 121

		while (true) {
			class309 var2 = null; // L: 123
			synchronized(var1) { // L: 124
				if (var1.isEmpty() || this.val$cancelled.get()) { // L: 125
					return null; // L: 126
				}

				var2 = (class309)var1.remove(); // L: 128
			}

			var2.field3462.method1105(); // L: 130
		}
	}
}
