import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mj")
public class class316 implements Comparator {
	class316() {
	} // L: 679

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Llj;Llj;I)I",
		garbageValue = "-499759884"
	)
	int method6068(class309 var1, class309 var2) {
		return var1.field3463 - var2.field3463; // L: 682
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 690
	}

	public int compare(Object var1, Object var2) {
		return this.method6068((class309)var1, (class309)var2); // L: 686
	}
}
