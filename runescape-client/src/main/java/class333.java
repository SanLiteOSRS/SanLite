import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lu")
public enum class333 implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Llu;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Llu;"
	)
	field3895(1, 1),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Llu;"
	)
	field3894(2, 2);

	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -142023791
	)
	public final int field3897;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 2056260395
	)
	final int field3898;

	class333(int var3, int var4) {
		this.field3897 = var3;
		this.field3898 = var4;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "23"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3898;
	}
}
