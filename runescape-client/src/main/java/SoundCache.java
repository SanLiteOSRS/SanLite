import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("an")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("tf")
	@ObfuscatedGetter(
		intValue = -1221572665
	)
	static int field325;
	@ObfuscatedName("qw")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	static class392 field327;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("musicSampleIndex")
	AbstractArchive musicSampleIndex;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("musicSamples")
	NodeHashTable musicSamples;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("rawSounds")
	NodeHashTable rawSounds;

	@ObfuscatedSignature(
		descriptor = "(Llc;Llc;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		this.musicSamples = new NodeHashTable(256); // L: 9
		this.rawSounds = new NodeHashTable(256); // L: 10
		this.soundEffectIndex = var1; // L: 13
		this.musicSampleIndex = var2; // L: 14
	} // L: 15

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II[II)Lap;",
		garbageValue = "-1611301672"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12); // L: 18
		var4 |= var1 << 16; // L: 19
		long var5 = (long)var4; // L: 20
		RawSound var7 = (RawSound)this.rawSounds.get(var5); // L: 21
		if (var7 != null) { // L: 22
			return var7;
		} else if (var3 != null && var3[0] <= 0) { // L: 23
			return null;
		} else {
			SoundEffect var8 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2); // L: 24
			if (var8 == null) { // L: 25
				return null;
			} else {
				var7 = var8.toRawSound(); // L: 26
				this.rawSounds.put(var7, var5); // L: 27
				if (var3 != null) { // L: 28
					var3[0] -= var7.samples.length;
				}

				return var7; // L: 29
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II[II)Lap;",
		garbageValue = "-944189598"
	)
	@Export("getMusicSample0")
	RawSound getMusicSample0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12); // L: 33
		var4 |= var1 << 16; // L: 34
		long var5 = (long)var4 ^ 4294967296L; // L: 35
		RawSound var7 = (RawSound)this.rawSounds.get(var5); // L: 36
		if (var7 != null) { // L: 37
			return var7;
		} else if (var3 != null && var3[0] <= 0) { // L: 38
			return null;
		} else {
			VorbisSample var8 = (VorbisSample)this.musicSamples.get(var5); // L: 39
			if (var8 == null) { // L: 40
				var8 = VorbisSample.readMusicSample(this.musicSampleIndex, var1, var2); // L: 41
				if (var8 == null) { // L: 42
					return null;
				}

				this.musicSamples.put(var8, var5); // L: 43
			}

			var7 = var8.toRawSound(var3); // L: 45
			if (var7 == null) { // L: 46
				return null;
			} else {
				var8.remove(); // L: 47
				this.rawSounds.put(var7, var5); // L: 48
				return var7; // L: 49
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Lap;",
		garbageValue = "42"
	)
	@Export("getSoundEffect")
	public RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) { // L: 53
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2); // L: 54
		} else {
			throw new RuntimeException(); // L: 55
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I[II)Lap;",
		garbageValue = "2028227037"
	)
	@Export("getMusicSample")
	public RawSound getMusicSample(int var1, int[] var2) {
		if (this.musicSampleIndex.getGroupCount() == 1) { // L: 59
			return this.getMusicSample0(0, var1, var2);
		} else if (this.musicSampleIndex.getGroupFileCount(var1) == 1) {
			return this.getMusicSample0(var1, 0, var2); // L: 60
		} else {
			throw new RuntimeException(); // L: 61
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Lql;",
		garbageValue = "-300808616"
	)
	public static IndexedSprite method777() {
		IndexedSprite var0 = new IndexedSprite(); // L: 115
		var0.width = class457.SpriteBuffer_spriteWidth; // L: 116
		var0.height = class457.SpriteBuffer_spriteHeight; // L: 117
		var0.xOffset = class267.SpriteBuffer_xOffsets[0]; // L: 118
		var0.yOffset = class457.SpriteBuffer_yOffsets[0]; // L: 119
		var0.subWidth = class457.SpriteBuffer_spriteWidths[0]; // L: 120
		var0.subHeight = Decimator.SpriteBuffer_spriteHeights[0]; // L: 121
		var0.palette = GrandExchangeOfferWorldComparator.SpriteBuffer_spritePalette; // L: 122
		var0.pixels = class436.SpriteBuffer_pixels[0]; // L: 123
		class267.SpriteBuffer_xOffsets = null; // L: 125
		class457.SpriteBuffer_yOffsets = null; // L: 126
		class457.SpriteBuffer_spriteWidths = null; // L: 127
		Decimator.SpriteBuffer_spriteHeights = null; // L: 128
		GrandExchangeOfferWorldComparator.SpriteBuffer_spritePalette = null; // L: 129
		class436.SpriteBuffer_pixels = null; // L: 130
		return var0; // L: 132
	}
}
