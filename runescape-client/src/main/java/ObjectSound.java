import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("br")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1676761033
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1169007201
	)
	@Export("x")
	int x;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 527753633
	)
	@Export("y")
	int y;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1242739273
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1754595341
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1838378409
	)
	int field824;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 523734751
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lgm;"
	)
	@Export("obj")
	ObjectComposition obj;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -425406799
	)
	int field830;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -2061831479
	)
	int field831;
	@ObfuscatedName("p")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1566603827
	)
	int field821;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	@Export("stream2")
	RawPcmStream stream2;

	static {
		objectSounds = new NodeDeque(); // L: 11
	}

	ObjectSound() {
	} // L: 27

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "53792654"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId; // L: 50
		ObjectComposition var2 = this.obj.transform(); // L: 51
		if (var2 != null) { // L: 52
			this.soundEffectId = var2.ambientSoundId; // L: 53
			this.field824 = var2.int7 * 128; // L: 54
			this.field830 = var2.int5; // L: 55
			this.field831 = var2.int6; // L: 56
			this.soundEffectIds = var2.soundEffectIds; // L: 57
		} else {
			this.soundEffectId = -1; // L: 60
			this.field824 = 0; // L: 61
			this.field830 = 0; // L: 62
			this.field831 = 0; // L: 63
			this.soundEffectIds = null; // L: 64
		}

		if (var1 != this.soundEffectId && this.stream1 != null) { // L: 66
			class453.pcmStreamMixer.removeSubStream(this.stream1); // L: 67
			this.stream1 = null; // L: 68
		}

	} // L: 70

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-12"
	)
	public static int method1855(int var0) {
		return (var0 & class459.field4853) - 1; // L: 26
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1175448064"
	)
	public static void method1854() {
		WorldMapElement.WorldMapElement_cachedSprites.clear(); // L: 155
	} // L: 156
}
