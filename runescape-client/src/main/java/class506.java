import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ty")
public class class506 implements class505 {
	@ObfuscatedName("am")
	Map field5059;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lus;"
	)
	final class538 field5058;

	@ObfuscatedSignature(
		descriptor = "(Lus;)V"
	)
	public class506(class538 var1) {
		this.field5058 = var1; // L: 15
	} // L: 16

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1228264639"
	)
	public int vmethod9122(int var1) {
		if (this.field5059 != null) { // L: 20
			class539 var2 = (class539)this.field5059.get(var1); // L: 21
			if (var2 != null) {
				return (Integer)var2.field5244; // L: 22
			}
		}

		return (Integer)this.field5058.vmethod9698(var1); // L: 24
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "693198435"
	)
	public void vmethod9116(int var1, Object var2) {
		if (this.field5059 == null) { // L: 29
			this.field5059 = new HashMap(); // L: 30
			this.field5059.put(var1, new class539(var1, var2)); // L: 31
		} else {
			class539 var3 = (class539)this.field5059.get(var1); // L: 34
			if (var3 == null) {
				this.field5059.put(var1, new class539(var1, var2)); // L: 35
			} else {
				var3.field5244 = var2; // L: 36
			}
		}

	} // L: 38

	public Iterator iterator() {
		return this.field5059 == null ? Collections.emptyList().iterator() : this.field5059.values().iterator(); // L: 42 43
	}
}
