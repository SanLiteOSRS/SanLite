import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qc")
public class class445 implements class444 {
	@ObfuscatedName("h")
	Map field4826;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lru;"
	)
	final class474 field4827;

	@ObfuscatedSignature(
		descriptor = "(Lru;)V"
	)
	public class445(class474 var1) {
		this.field4827 = var1; // L: 15
	} // L: 16

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "110"
	)
	public int vmethod8265(int var1) {
		if (this.field4826 != null) { // L: 20
			class475 var2 = (class475)this.field4826.get(var1); // L: 21
			if (var2 != null) {
				return (Integer)var2.field4981; // L: 22
			}
		}

		return (Integer)this.field4827.vmethod8869(var1); // L: 24
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "-1944779147"
	)
	public void vmethod8269(int var1, Object var2) {
		if (this.field4826 == null) { // L: 29
			this.field4826 = new HashMap(); // L: 30
			this.field4826.put(var1, new class475(var1, var2)); // L: 31
		} else {
			class475 var3 = (class475)this.field4826.get(var1); // L: 34
			if (var3 == null) {
				this.field4826.put(var1, new class475(var1, var2)); // L: 35
			} else {
				var3.field4981 = var2; // L: 36
			}
		}

	} // L: 38

	public Iterator iterator() {
		return this.field4826 == null ? Collections.emptyList().iterator() : this.field4826.values().iterator(); // L: 42 43
	}
}
