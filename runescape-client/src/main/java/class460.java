import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ra")
public class class460 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lra;"
	)
	public static final class460 field4769;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lra;"
	)
	static final class460 field4770;
	@ObfuscatedName("ac")
	String field4771;

	static {
		field4769 = new class460("application/json"); // L: 4
		field4770 = new class460("text/plain"); // L: 5
	}

	class460(String var1) {
		this.field4771 = var1; // L: 9
	} // L: 10

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "2"
	)
	public String method8331() {
		return this.field4771; // L: 13
	}
}
