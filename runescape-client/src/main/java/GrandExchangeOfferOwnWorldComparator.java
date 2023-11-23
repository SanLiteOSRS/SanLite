import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	static Archive field481;
	@ObfuscatedName("gc")
	@ObfuscatedGetter(
		intValue = 1308920245
	)
	static int field478;
	@ObfuscatedName("at")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	} // L: 13059

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Log;Log;I)I",
		garbageValue = "-1440367085"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) { // L: 13062
			return 0;
		} else {
			if (this.filterWorlds) { // L: 13063
				if (Client.worldId == var1.world) { // L: 13064
					return -1;
				}

				if (var2.world == Client.worldId) { // L: 13065
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1; // L: 13067
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 13075
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 13071
	}
}
