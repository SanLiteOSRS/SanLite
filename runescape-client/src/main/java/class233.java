import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
public class class233 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("musicPatchesArchive")
	static AbstractArchive musicPatchesArchive;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("musicSamplesArchive")
	static AbstractArchive musicSamplesArchive;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	@Export("midiPcmStream")
	public static MidiPcmStream midiPcmStream;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1830470507
	)
	@Export("musicPlayerStatus")
	public static int musicPlayerStatus;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 737536913
	)
	@Export("musicTrackGroupId")
	static int musicTrackGroupId;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 2069397721
	)
	@Export("musicTrackFileId")
	static int musicTrackFileId;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1994370717
	)
	@Export("musicTrackVolume")
	public static int musicTrackVolume;

	static {
		musicPlayerStatus = 0;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-7"
	)
	static void method4541() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromIgnored();
		}

	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "850"
	)
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (UrlRequester.pcmPlayer1 != null) {
			UrlRequester.pcmPlayer1.run();
		}

		if (SoundCache.pcmPlayer0 != null) {
			SoundCache.pcmPlayer0.run();
		}

	}
}
