import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
public class class130 extends class116 {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -766044217
	)
	int field1481;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldg;)V"
	)
	class130(class119 var1) {
		this.this$0 = var1;
		this.field1481 = -1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-2002779676"
	)
	void vmethod2847(Buffer var1) {
		this.field1481 = var1.readUnsignedShort();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ldm;I)V",
		garbageValue = "-293908864"
	)
	void vmethod2848(ClanSettings var1) {
		var1.method2687(this.field1481);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)[Lii;",
		garbageValue = "1725898697"
	)
	public static class240[] method2748() {
		return new class240[]{class240.field2782, class240.field2773, class240.field2774, class240.field2775, class240.field2777, class240.field2779, class240.field2778, class240.field2772, class240.field2780, class240.field2781};
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "1"
	)
	static void method2746(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var4.soundEffectId != -1 || var4.soundEffectIds != null) {
				int var5 = 0;
				if (var1 > var4.maxX * 128) {
					var5 += var1 - var4.maxX * 128;
				} else if (var1 < var4.x * 16384) {
					var5 += var4.x * 16384 - var1;
				}

				if (var2 > var4.maxY * 16384) {
					var5 += var2 - var4.maxY * 16384;
				} else if (var2 < var4.y * 16384) {
					var5 += var4.y * 16384 - var2;
				}

				if (var5 - 64 <= var4.field773 && class408.clientPreferences.areaSoundEffectsVolume != 0 && var0 == var4.plane) {
					var5 -= 64;
					if (var5 < 0) {
						var5 = 0;
					}

					int var6 = (var4.field773 - var5) * class408.clientPreferences.areaSoundEffectsVolume / var4.field773;
					if (var4.stream1 == null) {
						if (var4.soundEffectId >= 0) {
							SoundEffect var7 = SoundEffect.readSoundEffect(class12.archive4, var4.soundEffectId, 0);
							if (var7 != null) {
								RawSound var8 = var7.toRawSound().resample(FontName.decimator);
								RawPcmStream var9 = RawPcmStream.createRawPcmStream(var8, 100, var6);
								var9.setNumLoops(-1);
								BuddyRankComparator.pcmStreamMixer.addSubStream(var9);
								var4.stream1 = var9;
							}
						}
					} else {
						var4.stream1.method821(var6);
					}

					if (var4.stream2 == null) {
						if (var4.soundEffectIds != null && (var4.field779 -= var3) <= 0) {
							int var11 = (int)(Math.random() * (double)var4.soundEffectIds.length);
							SoundEffect var12 = SoundEffect.readSoundEffect(class12.archive4, var4.soundEffectIds[var11], 0);
							if (var12 != null) {
								RawSound var13 = var12.toRawSound().resample(FontName.decimator);
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var13, 100, var6);
								var10.setNumLoops(0);
								BuddyRankComparator.pcmStreamMixer.addSubStream(var10);
								var4.stream2 = var10;
								var4.field779 = var4.field767 + (int)(Math.random() * (double)(var4.field776 - var4.field767));
							}
						}
					} else {
						var4.stream2.method821(var6);
						if (!var4.stream2.hasNext()) {
							var4.stream2 = null;
						}
					}
				} else {
					if (var4.stream1 != null) {
						BuddyRankComparator.pcmStreamMixer.removeSubStream(var4.stream1);
						var4.stream1 = null;
					}

					if (var4.stream2 != null) {
						BuddyRankComparator.pcmStreamMixer.removeSubStream(var4.stream2);
						var4.stream2 = null;
					}
				}
			}
		}

	}
}
