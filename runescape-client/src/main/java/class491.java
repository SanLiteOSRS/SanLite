import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sj")
public class class491 implements class490 {
	@ObfuscatedName("aw")
	Map field4979;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lul;"
	)
	final class521 field4980;

	@ObfuscatedSignature(
		descriptor = "(Lul;)V"
	)
	public class491(class521 var1) {
		this.field4980 = var1; // L: 15
	} // L: 16

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2127277043"
	)
	public int vmethod8809(int var1) {
		if (this.field4979 != null) { // L: 20
			class522 var2 = (class522)this.field4979.get(var1); // L: 21
			if (var2 != null) {
				return (Integer)var2.field5134; // L: 22
			}
		}

		return (Integer)this.field4980.vmethod9416(var1); // L: 24
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "-1811511637"
	)
	public void vmethod8804(int var1, Object var2) {
		if (this.field4979 == null) { // L: 29
			this.field4979 = new HashMap(); // L: 30
			this.field4979.put(var1, new class522(var1, var2)); // L: 31
		} else {
			class522 var3 = (class522)this.field4979.get(var1); // L: 34
			if (var3 == null) {
				this.field4979.put(var1, new class522(var1, var2)); // L: 35
			} else {
				var3.field5134 = var2; // L: 36
			}
		}

	} // L: 38

	public Iterator iterator() {
		return this.field4979 == null ? Collections.emptyList().iterator() : this.field4979.values().iterator(); // L: 42 43
	}
}
