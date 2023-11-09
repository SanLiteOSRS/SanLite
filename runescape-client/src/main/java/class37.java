import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
public class class37 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;

	static {
		reflectionChecks = new IterableNodeDeque(); // L: 17
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-885227918"
	)
	public static boolean method701() {
		try {
			if (class286.musicPlayerStatus == 2) { // L: 99
				if (class286.musicTrack == null) { // L: 100
					class286.musicTrack = MusicTrack.readTrack(class304.musicTrackArchive, class109.musicTrackGroupId, class286.musicTrackFileId); // L: 101
					if (class286.musicTrack == null) { // L: 102
						return false;
					}
				}

				if (ItemContainer.soundCache == null) { // L: 104
					ItemContainer.soundCache = new SoundCache(class286.soundEffectsArchive, class286.musicSamplesArchive);
				}

				if (class251.midiPcmStream.loadMusicTrack(class286.musicTrack, class286.musicPatchesArchive, ItemContainer.soundCache, 22050)) { // L: 105
					class251.midiPcmStream.clearAll(); // L: 106
					class251.midiPcmStream.setPcmStreamVolume(class467.musicTrackVolume); // L: 107
					class251.midiPcmStream.setMusicTrack(class286.musicTrack, class145.musicTrackBoolean); // L: 108
					class286.musicPlayerStatus = 0; // L: 109
					class286.musicTrack = null; // L: 110
					ItemContainer.soundCache = null; // L: 111
					class304.musicTrackArchive = null; // L: 112
					return true; // L: 113
				}
			}
		} catch (Exception var1) { // L: 117
			var1.printStackTrace(); // L: 118
			class251.midiPcmStream.clear(); // L: 119
			class286.musicPlayerStatus = 0; // L: 120
			class286.musicTrack = null; // L: 121
			ItemContainer.soundCache = null; // L: 122
			class304.musicTrackArchive = null; // L: 123
		}

		return false; // L: 125
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZI)V",
		garbageValue = "-2077316645"
	)
	static final void method706(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		if (!Client.isMenuOpen) { // L: 9980
			if (Client.menuOptionsCount < 500) { // L: 9981
				Client.menuActions[Client.menuOptionsCount] = var0; // L: 9982
				Client.menuTargets[Client.menuOptionsCount] = var1; // L: 9983
				Client.menuOpcodes[Client.menuOptionsCount] = var2; // L: 9984
				Client.menuIdentifiers[Client.menuOptionsCount] = var3; // L: 9985
				Client.menuArguments1[Client.menuOptionsCount] = var4; // L: 9986
				Client.menuArguments2[Client.menuOptionsCount] = var5; // L: 9987
				Client.field661[Client.menuOptionsCount] = var6; // L: 9988
				Client.menuShiftClick[Client.menuOptionsCount] = var7; // L: 9989
				++Client.menuOptionsCount; // L: 9990
			}

		}
	} // L: 9992

	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "1537"
	)
	static void method709(int var0) {
		if (var0 != Client.loginState) { // L: 12740
			Client.loginState = var0; // L: 12741
		}
	} // L: 12742
}
