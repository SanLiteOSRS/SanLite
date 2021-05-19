import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	static class339 field935;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1117134453
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1380268011
	)
	@Export("x")
	int x;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1598436480
	)
	@Export("y")
	int y;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 858005117
	)
	int field926;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 2023231639
	)
	int field927;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 260916973
	)
	int field929;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -226676411
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lbk;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 378956141
	)
	int field934;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -848976241
	)
	int field932;
	@ObfuscatedName("x")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1700564665
	)
	int field923;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	@Export("obj")
	ObjectComposition obj;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lbk;"
	)
	@Export("stream2")
	RawPcmStream stream2;

	static {
		objectSounds = new NodeDeque();
	}

	ObjectSound() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-89"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field929 = var2.int4 * 128;
			this.field934 = var2.int5;
			this.field932 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field929 = 0;
			this.field934 = 0;
			this.field932 = 0;
			this.soundEffectIds = null;
		}

		if (var1 != this.soundEffectId && this.stream1 != null) {
			FloorOverlayDefinition.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "1381719532"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		int var2 = var1.readUnsignedByte();
		int var3 = var1.readInt();
		if (var3 < 0 || AbstractArchive.field3611 != 0 && var3 > AbstractArchive.field3611) {
			throw new RuntimeException();
		} else if (var2 == 0) {
			byte[] var6 = new byte[var3];
			var1.readBytes(var6, 0, var3);
			return var6;
		} else {
			int var4 = var1.readInt();
			if (var4 >= 0 && (AbstractArchive.field3611 == 0 || var4 <= AbstractArchive.field3611)) {
				byte[] var5 = new byte[var4];
				if (var2 == 1) {
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5);
				}

				return var5;
			} else {
				throw new RuntimeException();
			}
		}
	}
}
