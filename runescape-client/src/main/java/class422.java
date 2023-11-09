import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pi")
public class class422 implements class421 {
	@ObfuscatedName("s")
	Map field4606;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	final class450 field4605;

	@ObfuscatedSignature(
		descriptor = "(Lqd;)V"
	)
	public class422(class450 var1) {
		this.field4605 = var1; // L: 15
	} // L: 16

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "0"
	)
	public int vmethod7381(int var1) {
		if (this.field4606 != null) {
			class451 var2 = (class451)this.field4606.get(var1); // L: 21
			if (var2 != null) {
				return (Integer)var2.field4768;
			}
		}

		return (Integer)this.field4605.vmethod7942(var1); // L: 24
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;B)V",
		garbageValue = "62"
	)
	public void vmethod7377(int var1, Object var2) {
		if (this.field4606 == null) { // L: 29
			this.field4606 = new HashMap(); // L: 30
			this.field4606.put(var1, new class451(var1, var2)); // L: 31
		} else {
			class451 var3 = (class451)this.field4606.get(var1); // L: 34
			if (var3 == null) {
				this.field4606.put(var1, new class451(var1, var2)); // L: 35
			} else {
				var3.field4768 = var2; // L: 36
			}
		}

	} // L: 38

	public Iterator iterator() {
		return this.field4606 == null ? Collections.emptyList().iterator() : this.field4606.values().iterator(); // L: 42 43
	}

	@ObfuscatedName("h")
	static final void method7384(long var0) {
		try {
			Thread.sleep(var0); // L: 20
		} catch (InterruptedException var3) { // L: 22
		}

	} // L: 23
}
