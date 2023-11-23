import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tq")
public class class502 implements class501 {
	@ObfuscatedName("at")
	Map field5013;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	final class534 field5014;

	@ObfuscatedSignature(
		descriptor = "(Lur;)V"
	)
	public class502(class534 var1) {
		this.field5014 = var1; // L: 15
	} // L: 16

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-17"
	)
	public int vmethod8999(int var1) {
		if (this.field5013 != null) { // L: 20
			class535 var2 = (class535)this.field5013.get(var1); // L: 21
			if (var2 != null) {
				return (Integer)var2.field5205; // L: 22
			}
		}

		return (Integer)this.field5014.vmethod9599(var1); // L: 24
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;B)V",
		garbageValue = "-122"
	)
	public void vmethod9001(int var1, Object var2) {
		if (this.field5013 == null) { // L: 29
			this.field5013 = new HashMap(); // L: 30
			this.field5013.put(var1, new class535(var1, var2)); // L: 31
		} else {
			class535 var3 = (class535)this.field5013.get(var1); // L: 34
			if (var3 == null) {
				this.field5013.put(var1, new class535(var1, var2)); // L: 35
			} else {
				var3.field5205 = var2; // L: 36
			}
		}

	} // L: 38

	public Iterator iterator() {
		return this.field5013 == null ? Collections.emptyList().iterator() : this.field5013.values().iterator(); // L: 42 43
	}
}
