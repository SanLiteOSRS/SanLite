import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	static final WorldMapID field2099;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	static final WorldMapID field2100;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1258140299
	)
	@Export("value")
	final int value;

	static {
		field2099 = new WorldMapID(0);
		field2100 = new WorldMapID(1);
	}

	WorldMapID(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "490999200"
	)
	public static boolean method3587() {
		try {
			if (class232.musicPlayerStatus == 2) {
				if (NPC.musicTrack == null) {
					NPC.musicTrack = MusicTrack.readTrack(JagexCache.musicTrackArchive, class232.musicTrackGroupId, class232.musicTrackFileId);
					if (NPC.musicTrack == null) {
						return false;
					}
				}

				if (class268.soundCache == null) {
					class268.soundCache = new SoundCache(UserComparator10.soundEffectsArchive, class232.musicSamplesArchive);
				}

				if (class232.midiPcmStream.loadMusicTrack(NPC.musicTrack, class232.musicPatchesArchive, class268.soundCache, 22050)) {
					class232.midiPcmStream.clearAll();
					class232.midiPcmStream.setPcmStreamVolume(LoginPacket.musicTrackVolume);
					class232.midiPcmStream.setMusicTrack(NPC.musicTrack, VarpDefinition.musicTrackBoolean);
					class232.musicPlayerStatus = 0;
					NPC.musicTrack = null;
					class268.soundCache = null;
					JagexCache.musicTrackArchive = null;
					return true;
				}
			}
		} catch (Exception var1) {
			var1.printStackTrace();
			class232.midiPcmStream.clear();
			class232.musicPlayerStatus = 0;
			NPC.musicTrack = null;
			class268.soundCache = null;
			JagexCache.musicTrackArchive = null;
		}

		return false;
	}
}
