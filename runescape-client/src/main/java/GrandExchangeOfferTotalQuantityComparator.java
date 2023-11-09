import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nm")
@Implements("GrandExchangeOfferTotalQuantityComparator")
final class GrandExchangeOfferTotalQuantityComparator implements Comparator {
	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "[Lty;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Loe;Loe;B)I",
		garbageValue = "38"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.totalQuantity < var2.grandExchangeOffer.totalQuantity ? -1 : (var2.grandExchangeOffer.totalQuantity == var1.grandExchangeOffer.totalQuantity ? 0 : 1); // L: 69
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 73
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 77
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "6765"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = class251.getPacketBufferNode(ClientPacket.field3168, Client.packetWriter.isaacCipher); // L: 9795
		var2.packetBuffer.writeIntME(var0); // L: 9796
		var2.packetBuffer.method9139(var1); // L: 9797
		Client.packetWriter.addNode(var2); // L: 9798
	} // L: 9799
}
