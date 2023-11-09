import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
public class class127 extends class128 {
	@ObfuscatedName("vo")
	@ObfuscatedGetter(
		intValue = -1062963955
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1763358293
	)
	int field1538;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lec;)V"
	)
	class127(class131 var1) {
		this.this$0 = var1;
		this.field1538 = -1; // L: 114
	} // L: 116

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)V",
		garbageValue = "-423569520"
	)
	void vmethod3155(Buffer var1) {
		this.field1538 = var1.readUnsignedShort(); // L: 119
	} // L: 120

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lez;I)V",
		garbageValue = "-1755436064"
	)
	void vmethod3154(ClanSettings var1) {
		var1.method2979(this.field1538); // L: 123
	} // L: 124

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1709801867"
	)
	static void method2888() {
		ItemContainer.itemContainers = new NodeHashTable(32); // L: 78
	} // L: 79

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)Lbk;",
		garbageValue = "118"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0; // L: 247
		return NPC.getNextWorldListWorld(); // L: 248
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "78"
	)
	static final void method2887(int var0, int var1) {
		if (Client.hintArrowType == 2) { // L: 5117
			GrandExchangeOfferOwnWorldComparator.worldToScreen(Client.hintArrowSubX * 64 + (Client.hintArrowX - class300.baseX * 64 << 7), (Client.hintArrowY - Message.baseY * 64 << 7) + Client.hintArrowSubY * 4096, Client.hintArrowHeight * 4); // L: 5118
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) { // L: 5119
				class92.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}

		}
	} // L: 5120
}
