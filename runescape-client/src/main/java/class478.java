import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sl")
public class class478 implements class477 {
	@ObfuscatedName("ay")
	Map field4925;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ltm;"
	)
	final class508 field4924;

	@ObfuscatedSignature(
		descriptor = "(Ltm;)V"
	)
	public class478(class508 var1) {
		this.field4924 = var1; // L: 15
	} // L: 16

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1412123363"
	)
	public int vmethod8707(int var1) {
		if (this.field4925 != null) { // L: 20
			class509 var2 = (class509)this.field4925.get(var1); // L: 21
			if (var2 != null) {
				return (Integer)var2.field5080; // L: 22
			}
		}

		return (Integer)this.field4924.vmethod9277(var1); // L: 24
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;B)V",
		garbageValue = "26"
	)
	public void vmethod8708(int var1, Object var2) {
		if (this.field4925 == null) { // L: 29
			this.field4925 = new HashMap(); // L: 30
			this.field4925.put(var1, new class509(var1, var2)); // L: 31
		} else {
			class509 var3 = (class509)this.field4925.get(var1); // L: 34
			if (var3 == null) {
				this.field4925.put(var1, new class509(var1, var2)); // L: 35
			} else {
				var3.field5080 = var2; // L: 36
			}
		}

	} // L: 38

	public Iterator iterator() {
		return this.field4925 == null ? Collections.emptyList().iterator() : this.field4925.values().iterator(); // L: 42 43
	}
}
