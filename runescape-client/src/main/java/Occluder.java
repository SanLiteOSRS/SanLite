import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hv")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1514606591
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1843218791
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -250574197
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -839589963
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -845662039
	)
	@Export("type")
	int type;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 227042381
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -201172581
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -754335941
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 253383223
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 554630705
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1377372931
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1764147967
	)
	int field2621;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1535206503
	)
	int field2630;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -961493963
	)
	int field2631;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -2087575951
	)
	int field2632;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 619321753
	)
	int field2633;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1441193489
	)
	int field2634;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1410345339
	)
	int field2635;

	Occluder() {
	} // L: 23

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	public static void method4627() {
		try {
			if (class286.musicPlayerStatus == 1) { // L: 71
				int var0 = class251.midiPcmStream.method5650(); // L: 72
				if (var0 > 0 && class251.midiPcmStream.isReady()) { // L: 73
					var0 -= class286.pcmSampleLength; // L: 74
					if (var0 < 0) { // L: 75
						var0 = 0;
					}

					class251.midiPcmStream.setPcmStreamVolume(var0); // L: 76
					return; // L: 77
				}

				class251.midiPcmStream.clear(); // L: 79
				class251.midiPcmStream.removeAll(); // L: 80
				if (class304.musicTrackArchive != null) { // L: 81
					class286.musicPlayerStatus = 2;
				} else {
					class286.musicPlayerStatus = 0; // L: 82
				}

				class286.musicTrack = null; // L: 83
				ItemContainer.soundCache = null; // L: 84
			}
		} catch (Exception var2) { // L: 87
			var2.printStackTrace(); // L: 88
			class251.midiPcmStream.clear(); // L: 89
			class286.musicPlayerStatus = 0; // L: 90
			class286.musicTrack = null; // L: 91
			ItemContainer.soundCache = null; // L: 92
			class304.musicTrackArchive = null; // L: 93
		}

	} // L: 95

	@ObfuscatedName("f")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L); // L: 68
	}
}
