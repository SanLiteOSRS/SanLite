import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
public class class258 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(IIIII)V",
		garbageValue = "862328928"
	)
	static void method4608(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var4.soundEffectId != -1 || var4.soundEffectIds != null) {
				int var5 = 0;
				if (var1 > var4.field916 * 128) {
					var5 += var1 - var4.field916 * 128;
				} else if (var1 < var4.x * 128) {
					var5 += var4.x * 128 - var1;
				}

				if (var2 > var4.field917 * 16384) {
					var5 += var2 - var4.field917 * 16384;
				} else if (var2 < var4.y * 128) {
					var5 += var4.y * 128 - var2;
				}

				if (var5 - 64 <= var4.field918 && Login.clientPreferences.areaSoundEffectsVolume != 0 && var0 == var4.plane) {
					var5 -= 64;
					if (var5 < 0) {
						var5 = 0;
					}

					int var6 = (var4.field918 - var5) * Login.clientPreferences.areaSoundEffectsVolume / var4.field918;
					if (var4.stream1 == null) {
						if (var4.soundEffectId >= 0) {
							SoundEffect var7 = SoundEffect.readSoundEffect(ItemContainer.archive4, var4.soundEffectId, 0);
							if (var7 != null) {
								RawSound var8 = var7.toRawSound().resample(class34.decimator);
								RawPcmStream var9 = RawPcmStream.createRawPcmStream(var8, 100, var6);
								var9.setNumLoops(-1);
								Huffman.pcmStreamMixer.addSubStream(var9);
								var4.stream1 = var9;
							}
						}
					} else {
						var4.stream1.method901(var6);
					}

					if (var4.stream2 == null) {
						if (var4.soundEffectIds != null && (var4.field924 -= var3) <= 0) {
							int var11 = (int)(Math.random() * (double)var4.soundEffectIds.length);
							SoundEffect var12 = SoundEffect.readSoundEffect(ItemContainer.archive4, var4.soundEffectIds[var11], 0);
							if (var12 != null) {
								RawSound var13 = var12.toRawSound().resample(class34.decimator);
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var13, 100, var6);
								var10.setNumLoops(0);
								Huffman.pcmStreamMixer.addSubStream(var10);
								var4.stream2 = var10;
								var4.field924 = var4.field921 + (int)(Math.random() * (double)(var4.field922 - var4.field921));
							}
						}
					} else {
						var4.stream2.method901(var6);
						if (!var4.stream2.hasNext()) {
							var4.stream2 = null;
						}
					}
				} else {
					if (var4.stream1 != null) {
						Huffman.pcmStreamMixer.removeSubStream(var4.stream1);
						var4.stream1 = null;
					}

					if (var4.stream2 != null) {
						Huffman.pcmStreamMixer.removeSubStream(var4.stream2);
						var4.stream2 = null;
					}
				}
			}
		}

	}
}
