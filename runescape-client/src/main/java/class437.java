import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qn")
public class class437 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	static final class437 field4699;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	static final class437 field4698;
	@ObfuscatedName("al")
	final String field4697;

	static {
		field4699 = new class437("Basic"); // L: 4
		field4698 = new class437("Bearer"); // L: 5
	}

	class437(String var1) {
		this.field4697 = var1; // L: 9
	} // L: 10

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1846241035"
	)
	String method8130() {
		return this.field4697; // L: 13
	}
}
