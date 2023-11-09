import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
public class class219 implements Comparator {
	class219() {
	} // L: 39

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lix;Lix;I)I",
		garbageValue = "-2104164378"
	)
	int method4390(class214 var1, class214 var2) {
		return var1.method4335() - var2.method4335(); // L: 42
	}

	public int compare(Object var1, Object var2) {
		return this.method4390((class214)var1, (class214)var2); // L: 46
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 50
	}
}
