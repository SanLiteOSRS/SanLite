import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("re")
public class class448 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	public static final class448 field4727;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	static final class448 field4728;
	@ObfuscatedName("aj")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("ar")
	String field4729;

	static {
		field4727 = new class448("application/json"); // L: 4
		field4728 = new class448("text/plain"); // L: 5
	}

	class448(String var1) {
		this.field4729 = var1; // L: 9
	} // L: 10

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "70"
	)
	public String method8291() {
		return this.field4729; // L: 13
	}
}
