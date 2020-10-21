import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("s")
@Implements("GrandExchangeOfferTotalQuantityComparator")
final class GrandExchangeOfferTotalQuantityComparator implements Comparator {
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -343674237
	)
	static int field81;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Ly;Ly;I)I",
		garbageValue = "-2113100809"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.totalQuantity < var2.grandExchangeOffer.totalQuantity ? -1 : (var2.grandExchangeOffer.totalQuantity == var1.grandExchangeOffer.totalQuantity ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "280235874"
	)
	static int method183(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "43"
	)
	public static boolean method174() {
		try {
			if (class206.musicPlayerStatus == 2) {
				if (InterfaceParent.musicTrack == null) {
					InterfaceParent.musicTrack = MusicTrack.readTrack(class23.musicTrackArchive, TileItem.musicTrackGroupId, class206.musicTrackFileId);
					if (InterfaceParent.musicTrack == null) {
						return false;
					}
				}

				if (LoginType.soundCache == null) {
					LoginType.soundCache = new SoundCache(class206.soundEffectsArchive, class206.musicSamplesArchive);
				}

				if (class13.midiPcmStream.loadMusicTrack(InterfaceParent.musicTrack, class206.musicPatchesArchive, LoginType.soundCache, 22050)) {
					class13.midiPcmStream.clearAll();
					class13.midiPcmStream.setPcmStreamVolume(class206.musicTrackVolume);
					class13.midiPcmStream.setMusicTrack(InterfaceParent.musicTrack, class195.musicTrackBoolean);
					class206.musicPlayerStatus = 0;
					InterfaceParent.musicTrack = null;
					LoginType.soundCache = null;
					class23.musicTrackArchive = null;
					return true;
				}
			}
		} catch (Exception var1) {
			var1.printStackTrace();
			class13.midiPcmStream.clear();
			class206.musicPlayerStatus = 0;
			InterfaceParent.musicTrack = null;
			LoginType.soundCache = null;
			class23.musicTrackArchive = null;
		}

		return false;
	}
}
