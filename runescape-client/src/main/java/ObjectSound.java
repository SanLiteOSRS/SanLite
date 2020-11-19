import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lja;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1138191805
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -552019328
	)
	@Export("x")
	int x;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -846869120
	)
	@Export("y")
	int y;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1257501441
	)
	int field1103;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -725915520
	)
	int field1112;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -2106963407
	)
	int field1104;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 786656401
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Ldx;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -68558045
	)
	int field1107;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 151310867
	)
	int field1109;
	@ObfuscatedName("o")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -828996147
	)
	int field1108;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Ldx;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lje;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque();
	}

	ObjectSound() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "2054247540"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field1104 = var2.int4 * 128;
			this.field1107 = var2.int5;
			this.field1109 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field1104 = 0;
			this.field1107 = 0;
			this.field1109 = 0;
			this.soundEffectIds = null;
		}

		if (var1 != this.soundEffectId && this.stream1 != null) {
			GrandExchangeEvents.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "2057231744"
	)
	@Export("parseInt")
	public static int parseInt(CharSequence var0) {
		return SecureRandomCallable.parseIntCustomRadix(var0, 10, true);
	}

	@ObfuscatedName("k")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L);
	}
}
