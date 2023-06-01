import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
final class class309 implements Callable {
	// $FF: synthetic field
	final PriorityQueue val$waves;
	// $FF: synthetic field
	final AtomicBoolean val$cancelled;

	class309(PriorityQueue var1, AtomicBoolean var2) {
		this.val$waves = var1; // L: 162
		this.val$cancelled = var2;
	}

	public Object call() {
		while (!this.val$waves.isEmpty() && !this.val$cancelled.get()) { // L: 165
			((class310)this.val$waves.peek()).field3450.method1059(); // L: 166
			this.val$waves.remove(); // L: 167
		}

		return null; // L: 169
	}

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "413802431"
	)
	static final boolean method5996(int var0) {
		if (var0 < 0) { // L: 9047
			return false;
		} else {
			int var1 = Client.menuOpcodes[var0]; // L: 9048
			if (var1 >= 2000) { // L: 9049
				var1 -= 2000;
			}

			return var1 == 1007; // L: 9050
		}
	}
}
