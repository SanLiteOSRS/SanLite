import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ad")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lad;"
	)
	public static final WorldMapCacheName field322;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lad;"
	)
	public static final WorldMapCacheName field318;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Lad;"
	)
	public static final WorldMapCacheName field327;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Lad;"
	)
	static final WorldMapCacheName field319;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "Lad;"
	)
	public static final WorldMapCacheName field321;
	@ObfuscatedName("o")
	@Export("name")
	public final String name;

	static {
		field322 = new WorldMapCacheName("details");
		field318 = new WorldMapCacheName("compositemap");
		field327 = new WorldMapCacheName("compositetexture");
		field319 = new WorldMapCacheName("area");
		field321 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(IIB)Lbk;",
		garbageValue = "-87"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var2.getMessage(var1);
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "1002606295"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.field704) {
			class206.midiPcmStream.clear();
			class206.musicPlayerStatus = 1;
			class204.musicTrackArchive = null;
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && Client.musicVolume != 0 && !Client.field704) {
			Archive var1 = CollisionMap.archive6;
			int var2 = Client.musicVolume;
			class206.musicPlayerStatus = 1;
			class204.musicTrackArchive = var1;
			BuddyRankComparator.musicTrackGroupId = var0;
			class206.musicTrackFileId = 0;
			Tiles.musicTrackVolume = var2;
			class206.musicTrackBoolean = false;
			FaceNormal.pcmSampleLength = 2;
		}

		Client.currentTrackGroupId = var0;
	}
}
