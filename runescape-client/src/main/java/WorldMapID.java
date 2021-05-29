import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	static final WorldMapID field2110;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	static final WorldMapID field2107;
	@ObfuscatedName("d")
	static int[] field2112;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1539271557
	)
	@Export("value")
	final int value;

	static {
		field2110 = new WorldMapID(0);
		field2107 = new WorldMapID(1);
	}

	WorldMapID(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljv;Ljv;Ljv;Lhp;I)Z",
		garbageValue = "-670462193"
	)
	public static boolean method3636(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, MidiPcmStream var3) {
		class232.musicPatchesArchive = var0;
		class232.musicSamplesArchive = var1;
		WorldMapElement.soundEffectsArchive = var2;
		class124.midiPcmStream = var3;
		return true;
	}
}
