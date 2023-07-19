import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qr")
class class422 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	final class423 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lqy;)V"
	)
	class422(class423 var1) {
		this.this$0 = var1; // L: 7
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lqu;Lqu;I)I",
		garbageValue = "-1985599338"
	)
	int method7797(class424 var1, class424 var2) {
		if (var1.field4603 > var2.field4603) { // L: 9
			return 1;
		} else {
			return var1.field4603 < var2.field4603 ? -1 : 0; // L: 10 11
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method7797((class424)var1, (class424)var2); // L: 15
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 19
	}
}
