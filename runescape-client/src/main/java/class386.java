import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nb")
public class class386 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	static final class386 field4499;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	static final class386 field4498;
	@ObfuscatedName("v")
	final String field4497;

	static {
		field4499 = new class386("Basic"); // L: 4
		field4498 = new class386("Bearer"); // L: 5
	}

	class386(String var1) {
		this.field4497 = var1; // L: 9
	} // L: 10

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1783609031"
	)
	String method7408() {
		return this.field4497; // L: 13
	}
}
