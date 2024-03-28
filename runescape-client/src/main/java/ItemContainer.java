import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("ah")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("af")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32); // L: 7
	}

	ItemContainer() {
		this.ids = new int[]{-1}; // L: 8
		this.quantities = new int[]{0}; // L: 9
	} // L: 11

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-15"
	)
	public static int method2301(int var0, int var1) {
		int var2;
		if (var1 > var0) { // L: 26
			var2 = var0; // L: 27
			var0 = var1; // L: 28
			var1 = var2; // L: 29
		}

		while (var1 != 0) { // L: 31
			var2 = var0 % var1; // L: 32
			var0 = var1; // L: 33
			var1 = var2; // L: 34
		}

		return var0; // L: 36
	}

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "36"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop; // L: 11494
	}
}
