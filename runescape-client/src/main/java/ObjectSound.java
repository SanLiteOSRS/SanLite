import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1782450425
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1404024893
	)
	@Export("x")
	int x;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1740058919
	)
	@Export("y")
	int y;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -588118305
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 540595933
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 8829039
	)
	int field851;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1502597009
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lbt;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 924515191
	)
	int field854;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 357170399
	)
	int field863;
	@ObfuscatedName("at")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -257059635
	)
	int field857;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lbt;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lhb;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque(); // L: 11
	}

	ObjectSound() {
	} // L: 27

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1847013025"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId; // L: 50
		ObjectComposition var2 = this.obj.transform(); // L: 51
		if (var2 != null) { // L: 52
			this.soundEffectId = var2.ambientSoundId; // L: 53
			this.field851 = var2.int7 * 128; // L: 54
			this.field854 = var2.int5; // L: 55
			this.field863 = var2.int6; // L: 56
			this.soundEffectIds = var2.soundEffectIds; // L: 57
		} else {
			this.soundEffectId = -1; // L: 60
			this.field851 = 0; // L: 61
			this.field854 = 0; // L: 62
			this.field863 = 0; // L: 63
			this.soundEffectIds = null; // L: 64
		}

		if (var1 != this.soundEffectId && this.stream1 != null) { // L: 66
			SecureRandomCallable.pcmStreamMixer.removeSubStream(this.stream1); // L: 67
			this.stream1 = null; // L: 68
		}

	} // L: 70

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "0"
	)
	static int method1947(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 28
		if (var2 == null) { // L: 29
			return 0;
		} else if (var1 == -1) { // L: 30
			return 0;
		} else {
			int var3 = 0; // L: 31

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) { // L: 32
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4]; // L: 33
				}
			}

			return var3; // L: 35
		}
	}
}
