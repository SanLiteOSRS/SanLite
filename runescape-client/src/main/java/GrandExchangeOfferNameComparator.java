import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ol")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Loj;Loj;B)I",
		garbageValue = "-65"
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

	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "(Lng;IIIB)V",
		garbageValue = "1"
	)
	static final void method7261(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.method6801(ArchiveLoader.field1070, false); // L: 12652
		if (var4 != null) { // L: 12653
			if (Client.minimapState < 3) { // L: 12654
				Varps.field3615.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 12655
			}

		}
	} // L: 12656
}
