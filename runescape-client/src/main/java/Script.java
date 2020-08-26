import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lel;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = 1391677451
	)
	@Export("selectedItemId")
	static int selectedItemId;
	@ObfuscatedName("k")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("s")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("t")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1204485325
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1685131019
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1488258005
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 395196509
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "[Llq;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128);
	}

	Script() {
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(II)[Llq;",
		garbageValue = "-502401324"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1];
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Lby;B)V",
		garbageValue = "-76"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		class280.runScript(var0, 500000);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(IB)Lib;",
		garbageValue = "-77"
	)
	public static VarcInt method2324(int var0) {
		VarcInt var1 = (VarcInt)VarcInt.VarcInt_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarcInt.VarcInt_archive.takeFile(19, var0);
			var1 = new VarcInt();
			if (var2 != null) {
				var1.method4488(new Buffer(var2));
			}

			VarcInt.VarcInt_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Lic;I)V",
		garbageValue = "-1494987066"
	)
	public static void method2325(AbstractArchive var0) {
		StructDefinition.StructDefinition_archive = var0;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/Object;ZB)[B",
		garbageValue = "15"
	)
	public static byte[] method2323(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var6 = (byte[])((byte[])var0);
			if (var1) {
				int var4 = var6.length;
				byte[] var5 = new byte[var4];
				System.arraycopy(var6, 0, var5, 0, var4);
				return var5;
			} else {
				return var6;
			}
		} else if (var0 instanceof AbstractByteArrayCopier) {
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0;
			return var2.get();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Lic;IIIZI)V",
		garbageValue = "1897584620"
	)
	public static void method2322(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
		class206.musicPlayerStatus = 1;
		class204.musicTrackArchive = var0;
		BuddyRankComparator.musicTrackGroupId = var1;
		class206.musicTrackFileId = var2;
		Tiles.musicTrackVolume = var3;
		class206.musicTrackBoolean = var4;
		FaceNormal.pcmSampleLength = 10000;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "934802837"
	)
	public static boolean method2326() {
		try {
			if (class206.musicPlayerStatus == 2) {
				if (class206.musicTrack == null) {
					class206.musicTrack = MusicTrack.readTrack(class204.musicTrackArchive, BuddyRankComparator.musicTrackGroupId, class206.musicTrackFileId);
					if (class206.musicTrack == null) {
						return false;
					}
				}

				if (class39.soundCache == null) {
					class39.soundCache = new SoundCache(ModelData0.soundEffectsArchive, class206.musicSamplesArchive);
				}

				if (class206.midiPcmStream.loadMusicTrack(class206.musicTrack, class206.musicPatchesArchive, class39.soundCache, 22050)) {
					class206.midiPcmStream.clearAll();
					class206.midiPcmStream.setPcmStreamVolume(Tiles.musicTrackVolume);
					class206.midiPcmStream.setMusicTrack(class206.musicTrack, class206.musicTrackBoolean);
					class206.musicPlayerStatus = 0;
					class206.musicTrack = null;
					class39.soundCache = null;
					class204.musicTrackArchive = null;
					return true;
				}
			}
		} catch (Exception var1) {
			var1.printStackTrace();
			class206.midiPcmStream.clear();
			class206.musicPlayerStatus = 0;
			class206.musicTrack = null;
			class39.soundCache = null;
			class204.musicTrackArchive = null;
		}

		return false;
	}
}
