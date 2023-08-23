import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pe")
public class class407 extends class406 {
	@ObfuscatedName("au")
	ArrayList field4526;

	@ObfuscatedSignature(
		descriptor = "(Lpm;Ljava/util/ArrayList;)V"
	)
	public class407(class406 var1, ArrayList var2) {
		super(var1); // L: 9
		this.field4526 = var2; // L: 10
		super.field4523 = "ConcurrentMidiTask"; // L: 11
	} // L: 12

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1604030758"
	)
	public boolean vmethod7621() {
		for (int var1 = 0; var1 < this.field4526.size(); ++var1) { // L: 16
			class406 var2 = (class406)this.field4526.get(var1); // L: 17
			if (var2 == null) { // L: 18
				this.field4526.remove(var1); // L: 19
				--var1; // L: 20
			} else if (var2.vmethod7621()) { // L: 23
				if (var2.method7598()) { // L: 24
					this.method7601(var2.method7595()); // L: 25
					this.field4526.clear(); // L: 26
					return true; // L: 27
				}

				if (var2.method7600() != null) { // L: 30
					this.field4526.add(var2.method7600()); // L: 31
				}

				super.field4525 = var2.field4525; // L: 33
				this.field4526.remove(var1); // L: 35
				--var1; // L: 36
			}
		}

		if (this.field4526.isEmpty()) { // L: 39
			return true; // L: 40
		} else {
			return false; // L: 42
		}
	}
}
