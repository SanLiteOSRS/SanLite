import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oz")
public class class398 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	public static final class398 field4447;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static final class398 field4443;
	@ObfuscatedName("pe")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static class428 HitSplatDefinition_cachedSprites;
	@ObfuscatedName("f")
	String field4444;

	static {
		field4447 = new class398("application/json"); // L: 4
		field4443 = new class398("text/plain"); // L: 5
	}

	class398(String var1) {
		this.field4444 = var1; // L: 9
	} // L: 10

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "32"
	)
	public String method7126() {
		return this.field4444; // L: 13
	}
}
