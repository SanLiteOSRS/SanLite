import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pg")
public class class395 {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -426704167
	)
	int field4461;

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	class395(int var1, boolean var2) {
		this.field4461 = var1; // L: 7
	} // L: 8

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1518553544"
	)
	public int method7465() {
		return this.field4461; // L: 11
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1072455985"
	)
	static void method7464(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 94
			if (var4.soundEffectId != -1 || var4.soundEffectIds != null) { // L: 95
				int var5 = 0; // L: 96
				if (var1 > var4.maxX * 16384) { // L: 97
					var5 += var1 - var4.maxX * 16384;
				} else if (var1 < var4.x * 128) { // L: 98
					var5 += var4.x * 128 - var1;
				}

				if (var2 > var4.maxY * 16384) { // L: 99
					var5 += var2 - var4.maxY * 16384;
				} else if (var2 < var4.y * 16384) { // L: 100
					var5 += var4.y * 16384 - var2;
				}

				if (var5 - 64 <= var4.field848 && ScriptFrame.clientPreferences.method2571() != 0 && var0 == var4.plane) { // L: 101
					var5 -= 64; // L: 112
					if (var5 < 0) { // L: 113
						var5 = 0;
					}

					int var6 = (var4.field848 - var5) * ScriptFrame.clientPreferences.method2571() / var4.field848; // L: 114
					if (var4.stream1 == null) { // L: 115
						if (var4.soundEffectId >= 0) { // L: 116
							SoundEffect var7 = SoundEffect.readSoundEffect(GraphicsObject.archive9, var4.soundEffectId, 0); // L: 117
							if (var7 != null) { // L: 118
								RawSound var8 = var7.toRawSound().resample(JagexCache.decimator); // L: 119
								RawPcmStream var9 = RawPcmStream.createRawPcmStream(var8, 100, var6); // L: 120
								var9.setNumLoops(-1); // L: 121
								ApproximateRouteStrategy.pcmStreamMixer.addSubStream(var9); // L: 122
								var4.stream1 = var9; // L: 123
							}
						}
					} else {
						var4.stream1.method921(var6); // L: 127
					}

					if (var4.stream2 == null) { // L: 128
						if (var4.soundEffectIds != null && (var4.field844 -= var3) <= 0) { // L: 129
							int var11 = (int)(Math.random() * (double)var4.soundEffectIds.length); // L: 130
							SoundEffect var12 = SoundEffect.readSoundEffect(GraphicsObject.archive9, var4.soundEffectIds[var11], 0); // L: 131
							if (var12 != null) { // L: 132
								RawSound var13 = var12.toRawSound().resample(JagexCache.decimator); // L: 133
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var13, 100, var6); // L: 134
								var10.setNumLoops(0); // L: 135
								ApproximateRouteStrategy.pcmStreamMixer.addSubStream(var10); // L: 136
								var4.stream2 = var10; // L: 137
								var4.field844 = var4.field841 + (int)(Math.random() * (double)(var4.field842 - var4.field841)); // L: 138
							}
						}
					} else {
						var4.stream2.method921(var6); // L: 143
						if (!var4.stream2.hasNext()) { // L: 144
							var4.stream2 = null; // L: 145
						}
					}
				} else {
					if (var4.stream1 != null) { // L: 102
						ApproximateRouteStrategy.pcmStreamMixer.removeSubStream(var4.stream1); // L: 103
						var4.stream1 = null; // L: 104
					}

					if (var4.stream2 != null) { // L: 106
						ApproximateRouteStrategy.pcmStreamMixer.removeSubStream(var4.stream2); // L: 107
						var4.stream2 = null; // L: 108
					}
				}
			}
		}

	} // L: 149
}
