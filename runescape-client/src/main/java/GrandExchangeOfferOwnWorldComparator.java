import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	@ObfuscatedName("ay")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	} // L: 12719

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Loe;Loe;B)I",
		garbageValue = "16"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) { // L: 12722
			return 0;
		} else {
			if (this.filterWorlds) { // L: 12723
				if (Client.worldId == var1.world) { // L: 12724
					return -1;
				}

				if (var2.world == Client.worldId) { // L: 12725
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1; // L: 12727
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 12731
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 12735
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Lio;",
		garbageValue = "-16"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0); // L: 345
		if (var1 != null) { // L: 346
			return var1;
		} else {
			var1 = CollisionMap.method4140(class105.SequenceDefinition_animationsArchive, class396.SequenceDefinition_skeletonsArchive, var0, false); // L: 347
			if (var1 != null) { // L: 348
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var1, (long)var0);
			}

			return var1; // L: 349
		}
	}
}
