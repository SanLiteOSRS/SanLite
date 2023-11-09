import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pl")
public class class407 extends class406 {
	@ObfuscatedName("ai")
	ArrayList field4518;

	@ObfuscatedSignature(
		descriptor = "(Lps;Ljava/util/ArrayList;)V"
	)
	public class407(class406 var1, ArrayList var2) {
		super(var1); // L: 9
		this.field4518 = var2; // L: 10
		super.field4513 = "ConcurrentMidiTask"; // L: 11
	} // L: 12

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1705548260"
	)
	public boolean vmethod7648(int var1) {
		for (int var2 = 0; var2 < this.field4518.size(); ++var2) { // L: 16
			class406 var3 = (class406)this.field4518.get(var2); // L: 17
			if (var3 == null) { // L: 18
				this.field4518.remove(var2); // L: 19
				--var2; // L: 20
			} else if (var3.vmethod7648(var1)) { // L: 23
				if (var3.method7627()) { // L: 24
					this.method7631(var3.method7629()); // L: 25
					this.field4518.clear(); // L: 26
					return true; // L: 27
				}

				if (var3.method7641() != null) { // L: 30
					this.field4518.add(var3.method7641()); // L: 31
				}

				super.field4515 = var3.field4515; // L: 33
				this.field4518.remove(var2); // L: 35
				--var2; // L: 36
			}
		}

		if (this.field4518.isEmpty()) { // L: 39
			return true; // L: 40
		} else {
			return false; // L: 42
		}
	}
}
