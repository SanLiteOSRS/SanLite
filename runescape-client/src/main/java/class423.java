import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qy")
public class class423 extends class422 {
	@ObfuscatedName("am")
	ArrayList field4600;

	@ObfuscatedSignature(
		descriptor = "(Lqd;Ljava/util/ArrayList;)V"
	)
	public class423(class422 var1, ArrayList var2) {
		super(var1); // L: 9
		this.field4600 = var2; // L: 10
		super.field4597 = "ConcurrentMidiTask"; // L: 11
	} // L: 12

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2012801823"
	)
	public boolean vmethod7975() {
		for (int var1 = 0; var1 < this.field4600.size(); ++var1) { // L: 16
			class422 var2 = (class422)this.field4600.get(var1); // L: 17
			if (var2 == null) { // L: 18
				this.field4600.remove(var1); // L: 19
				--var1; // L: 20
			} else if (var2.vmethod7975()) { // L: 23
				if (var2.method7949()) { // L: 24
					this.method7954(var2.method7952()); // L: 25
					this.field4600.clear(); // L: 26
					return true; // L: 27
				}

				if (var2.method7953() != null) { // L: 30
					this.field4600.add(var2.method7953()); // L: 31
				}

				super.field4594 = var2.field4594; // L: 33
				this.field4600.remove(var1); // L: 35
				--var1; // L: 36
			}
		}

		if (this.field4600.isEmpty()) { // L: 39
			return true; // L: 40
		} else {
			return false; // L: 42
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IS)Lgw;",
		garbageValue = "-683"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0); // L: 44 45
	}
}
