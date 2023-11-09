import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 583558677
	)
	int field807;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -58317953
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1722363520
	)
	@Export("x")
	int x;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 141543997
	)
	@Export("y")
	int y;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -690324601
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1323508352
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1892809597
	)
	int field812;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -2067297625
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 320425733
	)
	int field811;
	@ObfuscatedName("a")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1730297605
	)
	int field815;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque(); // L: 11
	}

	ObjectSound() {
	} // L: 27

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "15536"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId; // L: 50
		ObjectComposition var2 = this.obj.transform(); // L: 51
		if (var2 != null) { // L: 52
			this.soundEffectId = var2.ambientSoundId; // L: 53
			this.field812 = var2.int7 * 128; // L: 54
			this.field807 = var2.int5; // L: 55
			this.field811 = var2.int6; // L: 56
			this.soundEffectIds = var2.soundEffectIds; // L: 57
		} else {
			this.soundEffectId = -1; // L: 60
			this.field812 = 0; // L: 61
			this.field807 = 0; // L: 62
			this.field811 = 0; // L: 63
			this.soundEffectIds = null; // L: 64
		}

		if (var1 != this.soundEffectId && this.stream1 != null) { // L: 66
			ModeWhere.pcmStreamMixer.removeSubStream(this.stream1); // L: 67
			this.stream1 = null; // L: 68
		}

	} // L: 70
}
