import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("jw")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 776275305
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 506576733
	)
	@Export("x")
	int x;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 99345247
	)
	@Export("y")
	int y;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -823707049
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1828326483
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1826007749
	)
	int field815;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1671764667
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lbl;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -442346035
	)
	int field824;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1018564833
	)
	int field825;
	@ObfuscatedName("ao")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -428166745
	)
	int field822;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lbl;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque(); // L: 11
	}

	ObjectSound() {
	} // L: 27

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "27660078"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId; // L: 50
		ObjectComposition var2 = this.obj.transform(); // L: 51
		if (var2 != null) { // L: 52
			this.soundEffectId = var2.ambientSoundId; // L: 53
			this.field815 = var2.int7 * 128; // L: 54
			this.field824 = var2.int5; // L: 55
			this.field825 = var2.int6; // L: 56
			this.soundEffectIds = var2.soundEffectIds; // L: 57
		} else {
			this.soundEffectId = -1; // L: 60
			this.field815 = 0; // L: 61
			this.field824 = 0; // L: 62
			this.field825 = 0; // L: 63
			this.soundEffectIds = null; // L: 64
		}

		if (var1 != this.soundEffectId && this.stream1 != null) { // L: 66
			class130.pcmStreamMixer.removeSubStream(this.stream1); // L: 67
			this.stream1 = null; // L: 68
		}

	} // L: 70
}
