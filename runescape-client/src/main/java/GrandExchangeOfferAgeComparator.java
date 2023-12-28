import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oa")
@Implements("GrandExchangeOfferAgeComparator")
final class GrandExchangeOfferAgeComparator implements Comparator {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Log;Log;S)I",
		garbageValue = "5269"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.age < var2.age ? -1 : (var1.age == var2.age ? 0 : 1); // L: 13
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 21
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 17
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2066613698"
	)
	public static int method7113(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0]; // L: 61
		int var1 = (int)(var2 >>> 7 & 127L); // L: 63
		return var1; // L: 65
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1600616066"
	)
	public static int method7112(int var0) {
		if (var0 > 0) { // L: 206
			return 1;
		} else {
			return var0 < 0 ? -1 : 0; // L: 207 208
		}
	}
}
