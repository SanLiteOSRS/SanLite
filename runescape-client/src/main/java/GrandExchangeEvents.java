import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ou")
@Implements("GrandExchangeEvents")
public class GrandExchangeEvents {
	@ObfuscatedName("ah")
	@Export("GrandExchangeEvents_ageComparator")
	public static Comparator GrandExchangeEvents_ageComparator;
	@ObfuscatedName("af")
	@Export("GrandExchangeEvents_priceComparator")
	public static Comparator GrandExchangeEvents_priceComparator;
	@ObfuscatedName("at")
	@Export("GrandExchangeEvents_nameComparator")
	public static Comparator GrandExchangeEvents_nameComparator;
	@ObfuscatedName("an")
	@Export("GrandExchangeEvents_quantityComparator")
	public static Comparator GrandExchangeEvents_quantityComparator;
	@ObfuscatedName("az")
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
		descriptor = "(Lur;Z)V",
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;ZI)V",
		garbageValue = "170347143"
	)
	@Export("sort")
	public void sort(Comparator var1, boolean var2) {
		if (var2) { // L: 95
			Collections.sort(this.events, var1); // L: 96
		} else {
			Collections.sort(this.events, Collections.reverseOrder(var1)); // L: 99
		}

	} // L: 101

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Loc;II)V",
		garbageValue = "-150389200"
	)
	static void method7082(AbstractArchive var0, int var1) {
		if ((var1 & class530.field5201.rsOrdinal()) != 0) { // L: 307
			class390.logoSprite = class153.SpriteBuffer_getIndexedSpriteByName(var0, "logo_deadman_mode", ""); // L: 308
		} else if ((var1 & class530.field5192.rsOrdinal()) != 0) { // L: 310
			class390.logoSprite = class153.SpriteBuffer_getIndexedSpriteByName(var0, "logo_seasonal_mode", ""); // L: 311
		} else if ((var1 & class530.field5197.rsOrdinal()) != 0) { // L: 313
			class390.logoSprite = class153.SpriteBuffer_getIndexedSpriteByName(var0, "logo_speedrunning", ""); // L: 314
		} else {
			class390.logoSprite = class153.SpriteBuffer_getIndexedSpriteByName(var0, "logo", ""); // L: 317
		}

	} // L: 319
}
