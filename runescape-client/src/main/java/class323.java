import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lz")
public enum class323 implements Enumerated {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Llz;"
	)
	field3857(2, 0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Llz;"
	)
	field3853(0, 2),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Llz;"
	)
	field3856(4, 5),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "Llz;"
	)
	field3854(1, 6),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Llz;"
	)
	field3855(3, 7),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Llz;"
	)
	field3852(5, 8);

	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1735491841
	)
	final int field3851;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -966711557
	)
	final int field3858;

	class323(int var3, int var4) {
		this.field3851 = var3;
		this.field3858 = var4;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-275768542"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3858;
	}
}
