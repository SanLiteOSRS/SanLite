import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -357465339
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1503807616
	)
	@Export("x")
	int x;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -379446241
	)
	@Export("y")
	int y;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1012403328
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1409055395
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 537603417
	)
	int field817;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 465212425
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lbn;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1455083535
	)
	int field820;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1723812077
	)
	int field821;
	@ObfuscatedName("aw")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -192617995
	)
	int field823;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lbn;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lhi;"
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
		garbageValue = "-1381985431"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId; // L: 50
		ObjectComposition var2 = this.obj.transform(); // L: 51
		if (var2 != null) { // L: 52
			this.soundEffectId = var2.ambientSoundId; // L: 53
			this.field817 = var2.int7 * 128; // L: 54
			this.field820 = var2.int5; // L: 55
			this.field821 = var2.int6; // L: 56
			this.soundEffectIds = var2.soundEffectIds; // L: 57
		} else {
			this.soundEffectId = -1; // L: 60
			this.field817 = 0; // L: 61
			this.field820 = 0; // L: 62
			this.field821 = 0; // L: 63
			this.soundEffectIds = null; // L: 64
		}

		if (var1 != this.soundEffectId && this.stream1 != null) { // L: 66
			ClanChannelMember.pcmStreamMixer.removeSubStream(this.stream1); // L: 67
			this.stream1 = null; // L: 68
		}

	} // L: 70

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BB)Ldk;",
		garbageValue = "70"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script(); // L: 93
		Buffer var2 = new Buffer(var0); // L: 94
		var2.offset = var2.array.length - 2; // L: 95
		int var3 = var2.readUnsignedShort(); // L: 96
		int var4 = var2.array.length - 2 - var3 - 12; // L: 97
		var2.offset = var4; // L: 98
		int var5 = var2.readInt(); // L: 99
		var1.localIntCount = var2.readUnsignedShort(); // L: 100
		var1.localStringCount = var2.readUnsignedShort(); // L: 101
		var1.intArgumentCount = var2.readUnsignedShort(); // L: 102
		var1.stringArgumentCount = var2.readUnsignedShort(); // L: 103
		int var6 = var2.readUnsignedByte(); // L: 104
		int var7;
		int var8;
		if (var6 > 0) { // L: 105
			var1.switches = var1.newIterableNodeHashTable(var6); // L: 106

			for (var7 = 0; var7 < var6; ++var7) { // L: 107
				var8 = var2.readUnsignedShort(); // L: 108
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? class298.method5751(var8) : 1); // L: 109
				var1.switches[var7] = var9; // L: 110

				while (var8-- > 0) { // L: 111
					int var10 = var2.readInt(); // L: 112
					int var11 = var2.readInt(); // L: 113
					var9.put(new IntegerNode(var11), (long)var10); // L: 114
				}
			}
		}

		var2.offset = 0; // L: 118
		var1.field958 = var2.readStringCp1252NullTerminatedOrNull(); // L: 119
		var1.opcodes = new int[var5]; // L: 120
		var1.intOperands = new int[var5]; // L: 121
		var1.stringOperands = new String[var5]; // L: 122

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) { // L: 123 124 129
			var8 = var2.readUnsignedShort(); // L: 125
			if (var8 == 3) { // L: 126
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt(); // L: 127
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte(); // L: 128
			}
		}

		return var1; // L: 131
	}
}
