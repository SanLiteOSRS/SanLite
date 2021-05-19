import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
public class class229 {
	@ObfuscatedName("dj")
	@Export("mouseCam")
	static boolean mouseCam;

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Leb;",
		garbageValue = "-2"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0);
			var1 = new StructComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			StructComposition.StructDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ILjp;IIIZI)V",
		garbageValue = "-1538082454"
	)
	@Export("playMusicTrack")
	public static void playMusicTrack(int var0, AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		class232.musicPlayerStatus = 1;
		JagexCache.musicTrackArchive = var1;
		class232.musicTrackGroupId = var2;
		class232.musicTrackFileId = var3;
		LoginPacket.musicTrackVolume = var4;
		VarpDefinition.musicTrackBoolean = var5;
		class232.pcmSampleLength = var0;
	}
}
