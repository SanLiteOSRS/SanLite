import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -2073221157
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 334840851
	)
	@Export("x")
	int x;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1332651853
	)
	@Export("y")
	int y;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -716307143
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1072653365
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -2079127451
	)
	int field844;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1194274127
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lbs;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -90420391
	)
	int field834;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -503672163
	)
	int field840;
	@ObfuscatedName("an")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 712868649
	)
	int field842;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lbs;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lhg;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque(); // L: 11
	}

	ObjectSound() {
	} // L: 27

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "986957188"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId; // L: 50
		ObjectComposition var2 = this.obj.transform(); // L: 51
		if (var2 != null) { // L: 52
			this.soundEffectId = var2.ambientSoundId; // L: 53
			this.field844 = var2.int7 * 16384; // L: 54
			this.field834 = var2.int5; // L: 55
			this.field840 = var2.int6; // L: 56
			this.soundEffectIds = var2.soundEffectIds; // L: 57
		} else {
			this.soundEffectId = -1; // L: 60
			this.field844 = 0; // L: 61
			this.field834 = 0; // L: 62
			this.field840 = 0; // L: 63
			this.soundEffectIds = null; // L: 64
		}

		if (var1 != this.soundEffectId && this.stream1 != null) { // L: 66
			ClanSettings.pcmStreamMixer.removeSubStream(this.stream1); // L: 67
			this.stream1 = null; // L: 68
		}

	} // L: 70

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIII)V",
		garbageValue = "1299463967"
	)
	static final void method1983(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
		Huffman.method6893(var0, var1, var2, var3, var4, var5, var6, false); // L: 10161
	} // L: 10162
}
