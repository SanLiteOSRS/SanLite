import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("n")
	@Export("ByteArrayPool_alternativeSizes")
	public static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		signature = "Lbv;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Lib;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Lib;"
	)
	@Export("musicSampleIndex")
	AbstractArchive musicSampleIndex;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Lls;"
	)
	@Export("musicSamples")
	NodeHashTable musicSamples;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "Lls;"
	)
	@Export("rawSounds")
	NodeHashTable rawSounds;

	@ObfuscatedSignature(
		signature = "(Lib;Lib;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		this.musicSamples = new NodeHashTable(256);
		this.rawSounds = new NodeHashTable(256);
		this.soundEffectIndex = var1;
		this.musicSampleIndex = var2;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(II[II)Ldf;",
		garbageValue = "-2076179570"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12);
		var4 |= var1 << 16;
		long var5 = (long)var4;
		RawSound var7 = (RawSound)this.rawSounds.get(var5);
		if (var7 != null) {
			return var7;
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			SoundEffect var8 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2);
			if (var8 == null) {
				return null;
			} else {
				var7 = var8.toRawSound();
				this.rawSounds.put(var7, var5);
				if (var3 != null) {
					var3[0] -= var7.samples.length;
				}

				return var7;
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "(II[II)Ldf;",
		garbageValue = "1195097760"
	)
	@Export("getMusicSample0")
	RawSound getMusicSample0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12);
		var4 |= var1 << 16;
		long var5 = (long)var4 ^ 4294967296L;
		RawSound var7 = (RawSound)this.rawSounds.get(var5);
		if (var7 != null) {
			return var7;
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			VorbisSample var8 = (VorbisSample)this.musicSamples.get(var5);
			if (var8 == null) {
				var8 = VorbisSample.readMusicSample(this.musicSampleIndex, var1, var2);
				if (var8 == null) {
					return null;
				}

				this.musicSamples.put(var8, var5);
			}

			var7 = var8.toRawSound(var3);
			if (var7 == null) {
				return null;
			} else {
				var8.remove();
				this.rawSounds.put(var7, var5);
				return var7;
			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(I[II)Ldf;",
		garbageValue = "122861408"
	)
	@Export("getSoundEffect")
	public RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) {
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(I[II)Ldf;",
		garbageValue = "-2010455709"
	)
	@Export("getMusicSample")
	public RawSound getMusicSample(int var1, int[] var2) {
		if (this.musicSampleIndex.getGroupCount() == 1) {
			return this.getMusicSample0(0, var1, var2);
		} else if (this.musicSampleIndex.getGroupFileCount(var1) == 1) {
			return this.getMusicSample0(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}
}
