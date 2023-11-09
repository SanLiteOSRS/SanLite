import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -540814643
	)
	@Export("id")
	int id;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -2008483939
	)
	@Export("quantity")
	int quantity;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -759090005
	)
	int field1298;

	TileItem() {
		this.field1298 = 31; // L: 11
	} // L: 13

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "62"
	)
	void method2545(int var1) {
		this.field1298 = var1; // L: 16
	} // L: 17

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Lha;",
		garbageValue = "-157507070"
	)
	@Export("getModel")
	protected final Model getModel() {
		return MidiPcmStream.ItemComposition_get(this.id).getModel(this.quantity); // L: 27
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "1"
	)
	boolean method2544(int var1) {
		if (var1 >= 0 && var1 <= 4) { // L: 20
			return (this.field1298 & 1 << var1) != 0; // L: 21
		} else {
			return true; // L: 23
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[II)V",
		garbageValue = "1484656216"
	)
	public static void method2554(String[] var0, int[] var1) {
		GrandExchangeOfferTotalQuantityComparator.method6472(var0, var1, 0, var0.length - 1); // L: 43
	} // L: 44
}
