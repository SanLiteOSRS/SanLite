import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qu")
public class class419 extends class418 {
	@ObfuscatedName("at")
	ArrayList field4559;

	@ObfuscatedSignature(
		descriptor = "(Lql;Ljava/util/ArrayList;)V"
	)
	public class419(class418 var1, ArrayList var2) {
		super(var1); // L: 9
		this.field4559 = var2; // L: 10
		super.field4552 = "ConcurrentMidiTask"; // L: 11
	} // L: 12

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-799935345"
	)
	public boolean vmethod7858() {
		for (int var1 = 0; var1 < this.field4559.size(); ++var1) { // L: 16
			class418 var2 = (class418)this.field4559.get(var1); // L: 17
			if (var2 == null) { // L: 18
				this.field4559.remove(var1); // L: 19
				--var1; // L: 20
			} else if (var2.vmethod7858()) { // L: 23
				if (var2.method7842()) { // L: 24
					this.method7840(var2.method7834()); // L: 25
					this.field4559.clear(); // L: 26
					return true; // L: 27
				}

				if (var2.method7839() != null) { // L: 30
					this.field4559.add(var2.method7839()); // L: 31
				}

				super.field4555 = var2.field4555; // L: 33
				this.field4559.remove(var1); // L: 35
				--var1; // L: 36
			}
		}

		if (this.field4559.isEmpty()) { // L: 39
			return true; // L: 40
		} else {
			return false; // L: 42
		}
	}
}
