import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nr")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lnv;Lnv;B)I",
		garbageValue = "0"
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lcv;",
		garbageValue = "-1884238753"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = class323.method6323(var1, var0); // L: 38
		Script var4 = HorizontalAlignment.method3663(var3, var0); // L: 39
		if (var4 != null) { // L: 40
			return var4; // L: 41
		} else {
			int var5 = (-3 - var2 << 8) + var0; // L: 45
			var4 = HorizontalAlignment.method3663(var5, var0); // L: 48
			return var4 != null ? var4 : null; // L: 49 52
		}
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "648715256"
	)
	static void method6553() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) { // L: 11527
			int var1 = var0.group; // L: 11528
			if (GrandExchangeEvent.loadInterface(var1)) { // L: 11529
				boolean var2 = true; // L: 11530
				Widget[] var3 = class155.Widget_interfaceComponents[var1]; // L: 11531

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) { // L: 11532
					if (var3[var4] != null) { // L: 11533
						var2 = var3[var4].isIf3; // L: 11534
						break;
					}
				}

				if (!var2) { // L: 11538
					var4 = (int)var0.key; // L: 11539
					Widget var5 = WorldMapSection1.getWidget(var4); // L: 11540
					if (var5 != null) { // L: 11541
						class69.invalidateWidget(var5);
					}
				}
			}
		}

	} // L: 11545
}
