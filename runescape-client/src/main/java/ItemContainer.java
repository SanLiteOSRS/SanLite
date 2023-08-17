import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lso;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	static IndexedSprite field1068;
	@ObfuscatedName("ae")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("ao")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32); // L: 7
	}

	ItemContainer() {
		this.ids = new int[]{-1}; // L: 8
		this.quantities = new int[]{0}; // L: 9
	} // L: 11

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-96469770"
	)
	public static void method2269() {
		FileSystem.FileSystem_cacheFiles.clear(); // L: 46
	} // L: 47

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2139499432"
	)
	static final void method2271(int var0, int var1) {
		if (Client.hintArrowType == 2) { // L: 5138
			HealthBar.worldToScreen(Client.field713 * 64 + (Client.field550 - UrlRequester.baseX * 64 << 7), Client.field746 * 64 + (Client.field693 - class47.baseY * 64 << 7), Client.field557 * 4); // L: 5139
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) { // L: 5140
				ArchiveLoader.field1063[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}

		}
	} // L: 5141
}
