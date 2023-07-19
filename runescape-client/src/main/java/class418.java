import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qq")
public class class418 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	static final class418 field4577;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	static final class418 field4576;
	@ObfuscatedName("ac")
	final String field4575;

	static {
		field4577 = new class418("Basic"); // L: 4
		field4576 = new class418("Bearer"); // L: 5
	}

	class418(String var1) {
		this.field4575 = var1; // L: 9
	} // L: 10

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "299547597"
	)
	String method7734() {
		return this.field4575; // L: 13
	}
}
