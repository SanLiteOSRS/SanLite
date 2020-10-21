import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("j")
@Implements("GrandExchangeOfferUnitPriceComparator")
final class GrandExchangeOfferUnitPriceComparator implements Comparator {
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		signature = "Liw;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("mr")
	@ObfuscatedGetter(
		intValue = 401783773
	)
	@Export("selectedItemSlot")
	static int selectedItemSlot;

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Lf;Lf;I)I",
		garbageValue = "1888921269"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.unitPrice < var2.grandExchangeOffer.unitPrice ? -1 : (var2.grandExchangeOffer.unitPrice == var1.grandExchangeOffer.unitPrice ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Lmu;B)I",
		garbageValue = "1"
	)
	public static final int method211(LoginType var0) {
		if (var0 == null) {
			return 12;
		} else {
			switch(var0.field4063) {
			case 7:
				return 20;
			default:
				return 12;
			}
		}
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		signature = "(Lhq;I)Z",
		garbageValue = "798311981"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden;
	}
}
