import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qz")
public class class435 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqz;"
	)
	public static final class435 field4703;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqz;"
	)
	static final class435 field4702;
	@ObfuscatedName("aw")
	String field4704;

	static {
		field4703 = new class435("application/json"); // L: 4
		field4702 = new class435("text/plain"); // L: 5
	}

	class435(String var1) {
		this.field4704 = var1; // L: 9
	} // L: 10

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "797480377"
	)
	public String method8319() {
		return this.field4704; // L: 13
	}
}
