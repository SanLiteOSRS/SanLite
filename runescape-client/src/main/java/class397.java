import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oy")
public class class397 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	static final class397 field4380;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	static final class397 field4379;
	@ObfuscatedName("i")
	String field4381;

	static {
		field4380 = new class397("application/json");
		field4379 = new class397("text/plain");
	}

	class397(String var1) {
		this.field4381 = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-28"
	)
	public String method7142() {
		return this.field4381;
	}
}
