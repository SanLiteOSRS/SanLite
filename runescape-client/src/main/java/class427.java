import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ql")
public class class427 extends class426 {
	@ObfuscatedName("az")
	ArrayList field4659;

	@ObfuscatedSignature(
		descriptor = "(Lqc;Ljava/util/ArrayList;)V"
	)
	public class427(class426 var1, ArrayList var2) {
		super(var1); // L: 9
		this.field4659 = var2; // L: 10
		super.field4651 = "ConcurrentMidiTask"; // L: 11
	} // L: 12

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-362428891"
	)
	public boolean vmethod7854() {
		for (int var1 = 0; var1 < this.field4659.size(); ++var1) { // L: 16
			class426 var2 = (class426)this.field4659.get(var1); // L: 17
			if (var2 == null) { // L: 18
				this.field4659.remove(var1); // L: 19
				--var1; // L: 20
			} else if (var2.vmethod7854()) { // L: 23
				if (var2.method7826()) { // L: 24
					this.method7844(var2.method7842()); // L: 25
					this.field4659.clear(); // L: 26
					return true; // L: 27
				}

				if (var2.method7827() != null) { // L: 30
					this.field4659.add(var2.method7827()); // L: 31
				}

				super.field4654 = var2.field4654; // L: 33
				this.field4659.remove(var1); // L: 35
				--var1; // L: 36
			}
		}

		if (this.field4659.isEmpty()) { // L: 39
			return true; // L: 40
		} else {
			return false; // L: 42
		}
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(Ldq;B)V",
		garbageValue = "57"
	)
	static void method7851(class93 var0) {
		if (Client.field540 != var0) { // L: 1950
			Client.field540 = var0; // L: 1951
		}
	} // L: 1952
}
