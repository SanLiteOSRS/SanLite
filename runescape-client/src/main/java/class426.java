import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qh")
public class class426 extends class425 {
	@ObfuscatedName("aq")
	ArrayList field4631;

	@ObfuscatedSignature(
		descriptor = "(Lqe;Ljava/util/ArrayList;)V"
	)
	public class426(class425 var1, ArrayList var2) {
		super(var1); // L: 9
		this.field4631 = var2; // L: 10
		super.field4627 = "ConcurrentMidiTask"; // L: 11
	} // L: 12

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2024199564"
	)
	public boolean vmethod8043() {
		for (int var1 = 0; var1 < this.field4631.size(); ++var1) { // L: 16
			class425 var2 = (class425)this.field4631.get(var1); // L: 17
			if (var2 == null) { // L: 18
				this.field4631.remove(var1); // L: 19
				--var1; // L: 20
			} else if (var2.vmethod8043()) { // L: 23
				if (var2.method8013()) { // L: 24
					this.method8017(var2.method8015()); // L: 25
					this.field4631.clear(); // L: 26
					return true; // L: 27
				}

				if (var2.method8016() != null) { // L: 30
					this.field4631.add(var2.method8016()); // L: 31
				}

				super.field4630 = var2.field4630; // L: 33
				this.field4631.remove(var1); // L: 35
				--var1; // L: 36
			}
		}

		if (this.field4631.isEmpty()) { // L: 39
			return true; // L: 40
		} else {
			return false; // L: 42
		}
	}
}
