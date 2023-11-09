import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rn")
public abstract class class456 extends class282 implements class521 {
	@ObfuscatedName("kj")
	@ObfuscatedGetter(
		intValue = -1601338019
	)
	@Export("cameraYaw")
	static int cameraYaw;

	@ObfuscatedSignature(
		descriptor = "(Lnu;Lot;I)V"
	)
	protected class456(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3); // L: 15
	} // L: 16

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lrc;",
		garbageValue = "-1481639468"
	)
	protected abstract class458 vmethod8884(int var1);

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1877372338"
	)
	public int method8357() {
		return super.field3065; // L: 19
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "-692946397"
	)
	public Object vmethod9416(int var1) {
		class458 var2 = this.vmethod8884(var1); // L: 24
		return var2 != null && var2.method8373() ? var2.method8374() : null; // L: 25 26
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)Luh;",
		garbageValue = "-297164320"
	)
	public class522 method8355(Buffer var1) {
		int var2 = var1.readUnsignedShort(); // L: 30
		class458 var3 = this.vmethod8884(var2); // L: 31
		class522 var4 = new class522(var2); // L: 32
		Class var5 = var3.field4772.field5026; // L: 33
		if (var5 == Integer.class) { // L: 34
			var4.field5134 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field5134 = var1.readLong(); // L: 35
		} else if (var5 == String.class) { // L: 36
			var4.field5134 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class517.class.isAssignableFrom(var5)) { // L: 37
				throw new IllegalStateException(); // L: 46
			}

			try {
				class517 var6 = (class517)var5.newInstance(); // L: 39
				var6.method9388(var1); // L: 40
				var4.field5134 = var6; // L: 41
			} catch (InstantiationException var7) { // L: 43
			} catch (IllegalAccessException var8) { // L: 44
			}
		}

		return var4; // L: 47
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-32"
	)
	static void method8366(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 100
			if (var4.soundEffectId != -1 || var4.soundEffectIds != null) { // L: 101
				int var5 = 0; // L: 102
				if (var1 > var4.maxX * 16384) { // L: 103
					var5 += var1 - var4.maxX * 16384;
				} else if (var1 < var4.x * 16384) { // L: 104
					var5 += var4.x * 16384 - var1;
				}

				if (var2 > var4.maxY * 128) { // L: 105
					var5 += var2 - var4.maxY * 128;
				} else if (var2 < var4.y * 16384) { // L: 106
					var5 += var4.y * 16384 - var2;
				}

				if (var5 - 64 <= var4.field851 && class150.clientPreferences.method2481() != 0 && var0 == var4.plane) { // L: 107
					var5 -= 64; // L: 118
					if (var5 < 0) { // L: 119
						var5 = 0;
					}

					int var6 = (var4.field851 - var5) * class150.clientPreferences.method2481() / var4.field851; // L: 120
					if (var4.stream1 == null) { // L: 121
						if (var4.soundEffectId >= 0) { // L: 122
							SoundEffect var7 = SoundEffect.readSoundEffect(class149.archive9, var4.soundEffectId, 0); // L: 123
							if (var7 != null) { // L: 124
								RawSound var8 = var7.toRawSound().resample(SoundCache.decimator); // L: 125
								RawPcmStream var9 = RawPcmStream.createRawPcmStream(var8, 100, var6); // L: 126
								var9.setNumLoops(-1); // L: 127
								SecureRandomCallable.pcmStreamMixer.addSubStream(var9); // L: 128
								var4.stream1 = var9; // L: 129
							}
						}
					} else {
						var4.stream1.method1044(var6); // L: 133
					}

					if (var4.stream2 == null) { // L: 134
						if (var4.soundEffectIds != null && (var4.field857 -= var3) <= 0) { // L: 135
							int var11 = (int)(Math.random() * (double)var4.soundEffectIds.length); // L: 136
							SoundEffect var12 = SoundEffect.readSoundEffect(class149.archive9, var4.soundEffectIds[var11], 0); // L: 137
							if (var12 != null) { // L: 138
								RawSound var13 = var12.toRawSound().resample(SoundCache.decimator); // L: 139
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var13, 100, var6); // L: 140
								var10.setNumLoops(0); // L: 141
								SecureRandomCallable.pcmStreamMixer.addSubStream(var10); // L: 142
								var4.stream2 = var10; // L: 143
								var4.field857 = var4.field854 + (int)(Math.random() * (double)(var4.field863 - var4.field854)); // L: 144
							}
						}
					} else {
						var4.stream2.method1044(var6); // L: 149
						if (!var4.stream2.hasNext()) { // L: 150
							var4.stream2 = null; // L: 151
						}
					}
				} else {
					if (var4.stream1 != null) { // L: 108
						SecureRandomCallable.pcmStreamMixer.removeSubStream(var4.stream1); // L: 109
						var4.stream1 = null; // L: 110
					}

					if (var4.stream2 != null) { // L: 112
						SecureRandomCallable.pcmStreamMixer.removeSubStream(var4.stream2); // L: 113
						var4.stream2 = null; // L: 114
					}
				}
			}
		}

	} // L: 155
}
