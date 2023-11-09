import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("archive19")
	static Archive archive19;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1536995511
	)
	int field3417;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("patch")
	MusicPatch patch;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lbe;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	MusicPatchNode2 field3399;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1917608321
	)
	int field3396;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 428171735
	)
	int field3401;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1423876977
	)
	int field3416;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 407140507
	)
	int field3403;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1408521151
	)
	int field3404;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -475867799
	)
	int field3405;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 385520429
	)
	int field3406;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -537324416
	)
	int field3402;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1139762519
	)
	int field3408;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1459425483
	)
	int field3409;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -112149617
	)
	int field3413;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1385793315
	)
	int field3411;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1586540291
	)
	int field3412;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1439862757
	)
	int field3400;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lbn;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1037505339
	)
	int field3415;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 425596591
	)
	int field3410;

	MusicPatchNode() {
	} // L: 31

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1067363009"
	)
	void method5736() {
		this.patch = null; // L: 34
		this.rawSound = null; // L: 35
		this.field3399 = null; // L: 36
		this.stream = null; // L: 37
	} // L: 38

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "871011997"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		class12.addChatMessage(var0, var1, var2, (String)null); // L: 23
	} // L: 24

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2022661591"
	)
	public static boolean method5737() {
		try {
			if (class293.musicPlayerStatus == 2) { // L: 67
				if (BufferedNetSocket.musicTrack == null) { // L: 68
					BufferedNetSocket.musicTrack = MusicTrack.readTrack(class364.musicTrackArchive, IntHashTable.musicTrackGroupId, class293.musicTrackFileId); // L: 69
					if (BufferedNetSocket.musicTrack == null) { // L: 70
						return false;
					}
				}

				if (class293.soundCache == null) { // L: 72
					class293.soundCache = new SoundCache(class293.soundEffectsArchive, class293.musicSamplesArchive);
				}

				if (class293.midiPcmStream.loadMusicTrack(BufferedNetSocket.musicTrack, class293.musicPatchesArchive, class293.soundCache, 22050)) { // L: 73
					class293.midiPcmStream.clearAll(); // L: 74
					class293.midiPcmStream.setPcmStreamVolume(class368.musicTrackVolume); // L: 75
					class293.midiPcmStream.setMusicTrack(BufferedNetSocket.musicTrack, class293.musicTrackBoolean); // L: 76
					class293.musicPlayerStatus = 0; // L: 77
					BufferedNetSocket.musicTrack = null; // L: 78
					class293.soundCache = null; // L: 79
					class364.musicTrackArchive = null; // L: 80
					return true; // L: 81
				}
			}
		} catch (Exception var1) { // L: 85
			var1.printStackTrace(); // L: 86
			class293.midiPcmStream.clear(); // L: 87
			class293.musicPlayerStatus = 0; // L: 88
			BufferedNetSocket.musicTrack = null; // L: 89
			class293.soundCache = null; // L: 90
			class364.musicTrackArchive = null; // L: 91
		}

		return false; // L: 93
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2127102250"
	)
	public static void method5741() {
		ObjectComposition.ObjectDefinition_cached.clear(); // L: 409
		ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 410
		ObjectComposition.ObjectDefinition_cachedEntities.clear(); // L: 411
		ObjectComposition.ObjectDefinition_cachedModels.clear(); // L: 412
	} // L: 413
}
