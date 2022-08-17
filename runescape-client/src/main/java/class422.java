import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("px")
public class class422 implements class421 {
	@ObfuscatedName("o")
	Map field4620;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	final class450 field4622;

	@ObfuscatedSignature(
		descriptor = "(Lqm;)V"
	)
	public class422(class450 var1) {
		this.field4622 = var1; // L: 15
	} // L: 16

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1114812568"
	)
	public int vmethod7480(int var1) {
		if (this.field4620 != null) { // L: 20
			class451 var2 = (class451)this.field4620.get(var1); // L: 21
			if (var2 != null) {
				return (Integer)var2.field4770; // L: 22
			}
		}

		return (Integer)this.field4622.vmethod8047(var1); // L: 24
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "204450768"
	)
	public void vmethod7481(int var1, Object var2) {
		if (this.field4620 == null) { // L: 29
			this.field4620 = new HashMap(); // L: 30
			this.field4620.put(var1, new class451(var1, var2)); // L: 31
		} else {
			class451 var3 = (class451)this.field4620.get(var1); // L: 34
			if (var3 == null) {
				this.field4620.put(var1, new class451(var1, var2)); // L: 35
			} else {
				var3.field4770 = var2; // L: 36
			}
		}

	} // L: 38

	public Iterator iterator() {
		return this.field4620 == null ? Collections.emptyList().iterator() : this.field4620.values().iterator(); // L: 42 43
	}
}
