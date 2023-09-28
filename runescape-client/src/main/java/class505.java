import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ty")
public class class505 implements class504 {
	@ObfuscatedName("ac")
	Map field5023;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	final class537 field5022;

	@ObfuscatedSignature(
		descriptor = "(Luv;)V"
	)
	public class505(class537 var1) {
		this.field5022 = var1; // L: 15
	} // L: 16

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-3541308"
	)
	public int vmethod8917(int var1) {
		if (this.field5023 != null) { // L: 20
			class538 var2 = (class538)this.field5023.get(var1); // L: 21
			if (var2 != null) {
				return (Integer)var2.field5204; // L: 22
			}
		}

		return (Integer)this.field5022.vmethod9530(var1); // L: 24
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;B)V",
		garbageValue = "78"
	)
	public void vmethod8918(int var1, Object var2) {
		if (this.field5023 == null) { // L: 29
			this.field5023 = new HashMap(); // L: 30
			this.field5023.put(var1, new class538(var1, var2)); // L: 31
		} else {
			class538 var3 = (class538)this.field5023.get(var1); // L: 34
			if (var3 == null) {
				this.field5023.put(var1, new class538(var1, var2)); // L: 35
			} else {
				var3.field5204 = var2; // L: 36
			}
		}

	} // L: 38

	public Iterator iterator() {
		return this.field5023 == null ? Collections.emptyList().iterator() : this.field5023.values().iterator(); // L: 42 43
	}
}
