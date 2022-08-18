import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llf;Llf;I)I",
		garbageValue = "-1021245934"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.getOfferName().compareTo(var2.getOfferName()); // L: 56
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 60
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 64
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Lpr;",
		garbageValue = "459953830"
	)
	public static class438 method6002(int var0) {
		class438 var1 = (class438)class438.DBRowType_cache.get((long)var0); // L: 24
		if (var1 != null) { // L: 25
			return var1;
		} else {
			byte[] var2 = class438.field4691.takeFile(38, var0); // L: 26
			var1 = new class438(); // L: 27
			if (var2 != null) { // L: 28
				var1.method7648(new Buffer(var2));
			}

			var1.method7637(); // L: 29
			class438.DBRowType_cache.put(var1, (long)var0); // L: 30
			return var1; // L: 31
		}
	}
}
