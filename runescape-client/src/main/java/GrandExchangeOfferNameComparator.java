import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oj")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Log;Log;I)I",
		garbageValue = "-602639414"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.getOfferName().compareTo(var2.getOfferName()); // L: 56
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 64
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 60
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Luw;",
		garbageValue = "1457262054"
	)
	public static class527 method7101(int var0) {
		class527 var1 = (class527)class527.DBRowType_cache.get((long)var0); // L: 20
		if (var1 != null) { // L: 21
			return var1;
		} else {
			byte[] var2 = class527.field5175.takeFile(38, var0); // L: 22
			var1 = new class527(); // L: 23
			if (var2 != null) { // L: 24
				var1.method9168(new Buffer(var2));
			}

			var1.method9170(); // L: 25
			class527.DBRowType_cache.put(var1, (long)var0); // L: 26
			return var1; // L: 27
		}
	}
}
