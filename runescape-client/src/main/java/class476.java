import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sy")
public class class476 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	public static final class476 field4847;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	static final class476 field4845;
	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("af")
	String field4846;

	static {
		field4847 = new class476("application/json"); // L: 4
		field4845 = new class476("text/plain"); // L: 5
	}

	class476(String var1) {
		this.field4846 = var1; // L: 9
	} // L: 10

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1789862284"
	)
	public String method8682() {
		return this.field4846; // L: 13
	}
}
