import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sv")
public class class480 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	public static final class480 field4905;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	static final class480 field4909;
	@ObfuscatedName("af")
	String field4907;

	static {
		field4905 = new class480("application/json"); // L: 4
		field4909 = new class480("text/plain"); // L: 5
	}

	class480(String var1) {
		this.field4907 = var1; // L: 9
	} // L: 10

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "36"
	)
	public String method8532() {
		return this.field4907; // L: 13
	}
}
