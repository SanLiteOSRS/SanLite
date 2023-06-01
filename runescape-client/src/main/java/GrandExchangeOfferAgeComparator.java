import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nw")
@Implements("GrandExchangeOfferAgeComparator")
final class GrandExchangeOfferAgeComparator implements Comparator {
	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	static AbstractSocket field4310;
	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "[Lty;"
	)
	@Export("modIconSprites")
	static IndexedSprite[] modIconSprites;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Loe;Loe;I)I",
		garbageValue = "-639638493"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.age < var2.age ? -1 : (var2.age == var1.age ? 0 : 1); // L: 13
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 17
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 21
	}
}
