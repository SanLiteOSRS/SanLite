import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lz")
@Implements("GrandExchangeOfferAgeComparator")
final class GrandExchangeOfferAgeComparator implements Comparator {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Llh;Llh;I)I",
		garbageValue = "-1574224910"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.age < var2.age ? -1 : (var1.age == var2.age ? 0 : 1); // L: 13
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 17
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 21
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(Lkn;II)Ljava/lang/String;",
		garbageValue = "549204238"
	)
	static String method5910(Widget var0, int var1) {
		if (!TaskHandler.method3189(class193.getWidgetFlags(var0), var1) && var0.onOp == null) { // L: 12084
			return null;
		} else {
			return var0.actions != null && var0.actions.length > var1 && var0.actions[var1] != null && var0.actions[var1].trim().length() != 0 ? var0.actions[var1] : null; // L: 12085 12086 12088
		}
	}
}
