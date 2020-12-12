import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
public class class206 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Lib;"
	)
	@Export("musicPatchesArchive")
	public static AbstractArchive musicPatchesArchive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Lib;"
	)
	@Export("musicSamplesArchive")
	public static AbstractArchive musicSamplesArchive;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Lib;"
	)
	@Export("soundEffectsArchive")
	public static AbstractArchive soundEffectsArchive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "Lgf;"
	)
	@Export("midiPcmStream")
	public static MidiPcmStream midiPcmStream;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1386216651
	)
	@Export("musicPlayerStatus")
	public static int musicPlayerStatus;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1877060861
	)
	@Export("musicTrackFileId")
	static int musicTrackFileId;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lds;"
	)
	@Export("soundCache")
	static SoundCache soundCache;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lkj;"
	)
	@Export("NetCache_responseArchiveBuffer")
	public static Buffer NetCache_responseArchiveBuffer;

	static {
		musicPlayerStatus = 0;
	}
}
