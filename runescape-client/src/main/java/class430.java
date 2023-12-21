import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qr")
public class class430 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	static final class430 field4634;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	static final class430 field4633;
	@ObfuscatedName("ar")
	final String field4632;

	static {
		field4634 = new class430("Basic"); // L: 4
		field4633 = new class430("Bearer"); // L: 5
	}

	class430(String var1) {
		this.field4632 = var1; // L: 9
	} // L: 10

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1414159306"
	)
	String method7948() {
		return this.field4632; // L: 13
	}
}
