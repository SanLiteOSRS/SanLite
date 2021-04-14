import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ox")
public enum class392 implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lox;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lox;"
	)
	field4229(1, 1),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lox;"
	)
	field4230(2, 2);

	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1972567139
	)
	public final int field4232;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1190954597
	)
	final int field4231;

	class392(int var3, int var4) {
		this.field4232 = var3;
		this.field4231 = var4;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1000839247"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4231;
	}
}
