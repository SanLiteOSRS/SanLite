import net.runelite.mapping.*;

@ObfuscatedName("qe")
@Implements("FillMode")
public enum FillMode implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	field4695(1, 1),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	field4694(2, 2);

	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1363476013
	)
	public final int field4699;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -2111018979
	)
	final int field4698;

	FillMode(int var3, int var4) {
		this.field4699 = var3;
		this.field4698 = var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4698;
	}
}
