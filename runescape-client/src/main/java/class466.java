import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ry")
public class class466 implements class465 {
	@ObfuscatedName("af")
	Map field4905;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lts;"
	)
	final class496 field4904;

	@ObfuscatedSignature(
		descriptor = "(Lts;)V"
	)
	public class466(class496 var1) {
		this.field4904 = var1; // L: 15
	} // L: 16

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "91"
	)
	public int vmethod8746(int var1) {
		if (this.field4905 != null) { // L: 20
			class497 var2 = (class497)this.field4905.get(var1); // L: 21
			if (var2 != null) {
				return (Integer)var2.field5057; // L: 22
			}
		}

		return (Integer)this.field4904.vmethod9374(var1); // L: 24
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "606161244"
	)
	public void vmethod8745(int var1, Object var2) {
		if (this.field4905 == null) { // L: 29
			this.field4905 = new HashMap(); // L: 30
			this.field4905.put(var1, new class497(var1, var2)); // L: 31
		} else {
			class497 var3 = (class497)this.field4905.get(var1); // L: 34
			if (var3 == null) {
				this.field4905.put(var1, new class497(var1, var2)); // L: 35
			} else {
				var3.field5057 = var2; // L: 36
			}
		}

	} // L: 38

	public Iterator iterator() {
		return this.field4905 == null ? Collections.emptyList().iterator() : this.field4905.values().iterator(); // L: 42 43
	}
}
