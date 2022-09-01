import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
@Implements("GrandExchangeOfferUnitPriceComparator")
final class GrandExchangeOfferUnitPriceComparator implements Comparator {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Llh;Llh;I)I",
		garbageValue = "-1485770675"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.unitPrice < var2.grandExchangeOffer.unitPrice ? -1 : (var2.grandExchangeOffer.unitPrice == var1.grandExchangeOffer.unitPrice ? 0 : 1); // L: 43
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 51
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 47
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "29"
	)
	static final void method5960() {
		for (int var0 = 0; var0 < Client.npcCount; ++var0) { // L: 3914
			int var1 = Client.npcIndices[var0]; // L: 3915
			NPC var2 = Client.npcs[var1]; // L: 3916
			if (var2 != null) { // L: 3917
				WorldMapSection2.updateActorSequence(var2, var2.definition.size); // L: 3918
			}
		}

	} // L: 3921
}
