import net.runelite.mapping.*;

@ObfuscatedName("lp")
@Implements("FillMode")
public enum FillMode implements Enumerated {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Llp;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Llp;"
	)
	field3896(1, 1),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Llp;"
	)
	field3897(2, 2);

	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 981795357
	)
	public final int field3898;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1459508057
	)
	final int field3895;

	FillMode(int var3, int var4) {
		this.field3898 = var3;
		this.field3895 = var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "63"
	)
	@Export("FillMode_rsOrdinal")
	public int rsOrdinal() {
		return this.field3895;
	}
}
