import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lm")
public enum class332 implements Enumerated {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Llm;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Llm;"
	)
	field3888(1, 1),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Llm;"
	)
	field3889(2, 2);

	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1262740687
	)
	public final int field3890;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1489188623
	)
	final int field3891;

	class332(int var3, int var4) {
		this.field3890 = var3;
		this.field3891 = var4;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "385513888"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3891;
	}
}
