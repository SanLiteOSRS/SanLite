import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ti")
public class class509 implements class508 {
	@ObfuscatedName("aq")
	Map field5080;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	final class541 field5081;

	@ObfuscatedSignature(
		descriptor = "(Lur;)V"
	)
	public class509(class541 var1) {
		this.field5081 = var1; // L: 15
	} // L: 16

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "601833237"
	)
	public int vmethod9189(int var1) {
		if (this.field5080 != null) { // L: 20
			class542 var2 = (class542)this.field5080.get(var1); // L: 21
			if (var2 != null) {
				return (Integer)var2.field5268; // L: 22
			}
		}

		return (Integer)this.field5081.vmethod9769(var1); // L: 24
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "-924522595"
	)
	public void vmethod9186(int var1, Object var2) {
		if (this.field5080 == null) { // L: 29
			this.field5080 = new HashMap(); // L: 30
			this.field5080.put(var1, new class542(var1, var2)); // L: 31
		} else {
			class542 var3 = (class542)this.field5080.get(var1); // L: 34
			if (var3 == null) {
				this.field5080.put(var1, new class542(var1, var2)); // L: 35
			} else {
				var3.field5268 = var2; // L: 36
			}
		}

	} // L: 38

	public Iterator iterator() {
		return this.field5080 == null ? Collections.emptyList().iterator() : this.field5080.values().iterator(); // L: 42 43
	}
}
