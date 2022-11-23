import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qn")
public class class442 implements class441 {
	@ObfuscatedName("a")
	Map field4780;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lrr;"
	)
	final class470 field4781;

	@ObfuscatedSignature(
		descriptor = "(Lrr;)V"
	)
	public class442(class470 var1) {
		this.field4781 = var1; // L: 15
	} // L: 16

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "68"
	)
	public int vmethod8144(int var1) {
		if (this.field4780 != null) { // L: 20
			class471 var2 = (class471)this.field4780.get(var1); // L: 21
			if (var2 != null) {
				return (Integer)var2.field4930; // L: 22
			}
		}

		return (Integer)this.field4781.vmethod8697(var1); // L: 24
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;B)V",
		garbageValue = "22"
	)
	public void vmethod8143(int var1, Object var2) {
		if (this.field4780 == null) { // L: 29
			this.field4780 = new HashMap(); // L: 30
			this.field4780.put(var1, new class471(var1, var2)); // L: 31
		} else {
			class471 var3 = (class471)this.field4780.get(var1); // L: 34
			if (var3 == null) {
				this.field4780.put(var1, new class471(var1, var2)); // L: 35
			} else {
				var3.field4930 = var2; // L: 36
			}
		}

	} // L: 38

	public Iterator iterator() {
		return this.field4780 == null ? Collections.emptyList().iterator() : this.field4780.values().iterator(); // L: 42 43
	}
}
