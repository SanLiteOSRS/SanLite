import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljs;Ljs;I)I",
		garbageValue = "-929613700"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.getOfferName().compareTo(var2.getOfferName());
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1454161058"
	)
	static void method5059(int var0, int var1) {
		if (ObjectComposition.clientPreferences.musicVolume != 0 && var0 != -1) {
			LoginScreenAnimation.method2219(WorldMapManager.archive11, var0, 0, ObjectComposition.clientPreferences.musicVolume, false);
			Client.field881 = true;
		}

	}
}
