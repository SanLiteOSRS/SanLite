import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mk")
@Implements("GrandExchangeEvents")
public class GrandExchangeEvents {
	@ObfuscatedName("w")
	@Export("GrandExchangeEvents_ageComparator")
	public static Comparator GrandExchangeEvents_ageComparator;
	@ObfuscatedName("v")
	@Export("GrandExchangeEvents_priceComparator")
	public static Comparator GrandExchangeEvents_priceComparator;
	@ObfuscatedName("s")
	@Export("GrandExchangeEvents_nameComparator")
	public static Comparator GrandExchangeEvents_nameComparator;
	@ObfuscatedName("z")
	@Export("GrandExchangeEvents_quantityComparator")
	public static Comparator GrandExchangeEvents_quantityComparator;
	@ObfuscatedName("f")
	@Export("events")
	public final List events;

	static {
		GrandExchangeEvents_ageComparator = new GrandExchangeOfferAgeComparator(); // L: 11
		new GrandExchangeOfferWorldComparator();
		GrandExchangeEvents_priceComparator = new GrandExchangeOfferUnitPriceComparator(); // L: 41
		GrandExchangeEvents_nameComparator = new GrandExchangeOfferNameComparator(); // L: 54
		GrandExchangeEvents_quantityComparator = new GrandExchangeOfferTotalQuantityComparator();
	} // L: 67

	@ObfuscatedSignature(
		descriptor = "(Lrd;Z)V",
		garbageValue = "1"
	)
	public GrandExchangeEvents(Buffer var1, boolean var2) {
		int var3 = var1.readUnsignedShort(); // L: 82
		boolean var4 = var1.readUnsignedByte() == 1; // L: 83
		byte var5;
		if (var4) { // L: 85
			var5 = 1;
		} else {
			var5 = 0; // L: 86
		}

		int var6 = var1.readUnsignedShort(); // L: 87
		this.events = new ArrayList(var6); // L: 88

		for (int var7 = 0; var7 < var6; ++var7) { // L: 89
			this.events.add(new GrandExchangeEvent(var1, var5, var3)); // L: 90
		}

	} // L: 92

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;ZI)V",
		garbageValue = "1466510344"
	)
	@Export("sort")
	public void sort(Comparator var1, boolean var2) {
		if (var2) { // L: 95
			Collections.sort(this.events, var1); // L: 96
		} else {
			Collections.sort(this.events, Collections.reverseOrder(var1)); // L: 99
		}

	} // L: 101

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-93"
	)
	static void method6645(int var0) {
		for (IntegerNode var1 = (IntegerNode)Client.widgetFlags.first(); var1 != null; var1 = (IntegerNode)Client.widgetFlags.next()) { // L: 13190
			if ((var1.key >> 48 & 65535L) == (long)var0) { // L: 13191
				var1.remove(); // L: 13192
			}
		}

	} // L: 13195
}
