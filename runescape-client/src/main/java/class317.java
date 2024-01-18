import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mg")
public class class317 {
	@ObfuscatedName("wc")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("am")
	static int[] field3440;
	@ObfuscatedName("aj")
	@Export("JagexCache_locationFile")
	static File JagexCache_locationFile;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1906192385
	)
	public static int field3442;

	static {
		new Object();
		field3440 = new int[33]; // L: 10
		field3440[0] = 0; // L: 13
		int var0 = 2; // L: 14

		for (int var1 = 1; var1 < 33; ++var1) { // L: 15
			field3440[var1] = var0 - 1; // L: 16
			var0 += var0; // L: 17
		}

	} // L: 19

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-20"
	)
	static final void method6035() {
		for (int var0 = 0; var0 < Client.soundEffectCount; ++var0) { // L: 3718
			int var10002 = Client.queuedSoundEffectDelays[var0]--; // L: 3719
			if (Client.queuedSoundEffectDelays[var0] >= -10) { // L: 3720
				SoundEffect var9 = Client.soundEffects[var0]; // L: 3732
				if (var9 == null) { // L: 3733
					Object var10000 = null; // L: 3734
					var9 = SoundEffect.readSoundEffect(class476.archive4, Client.soundEffectIds[var0], 0);
					if (var9 == null) { // L: 3735
						continue;
					}

					int[] var14 = Client.queuedSoundEffectDelays; // L: 3736
					var14[var0] += var9.calculateDelay();
					Client.soundEffects[var0] = var9; // L: 3737
				}

				if (Client.queuedSoundEffectDelays[var0] < 0) { // L: 3743
					int var2;
					if (Client.soundLocations[var0] != 0) { // L: 3745
						int var3 = (Client.soundLocations[var0] & 255) * 128; // L: 3746
						int var4 = Client.soundLocations[var0] >> 16 & 255; // L: 3747
						int var5 = var4 * 128 + 64 - class25.localPlayer.x; // L: 3748
						if (var5 < 0) { // L: 3749
							var5 = -var5;
						}

						int var6 = Client.soundLocations[var0] >> 8 & 255; // L: 3750
						int var7 = var6 * 128 + 64 - class25.localPlayer.y; // L: 3751
						if (var7 < 0) { // L: 3752
							var7 = -var7;
						}

						int var8 = var5 + var7 - 128; // L: 3753
						if (var8 > var3) { // L: 3754
							Client.queuedSoundEffectDelays[var0] = -100; // L: 3755
							continue; // L: 3756
						}

						if (var8 < 0) { // L: 3758
							var8 = 0;
						}

						var2 = (var3 - var8) * class93.clientPreferences.method2551() / var3; // L: 3759
					} else {
						var2 = class93.clientPreferences.method2549(); // L: 3761
					}

					if (var2 > 0) { // L: 3762
						RawSound var10 = var9.toRawSound().resample(UrlRequest.decimator); // L: 3763
						RawPcmStream var11 = RawPcmStream.createRawPcmStream(var10, 100, var2); // L: 3764
						var11.setNumLoops(Client.queuedSoundEffectLoops[var0] - 1); // L: 3765
						ClanSettings.pcmStreamMixer.addSubStream(var11); // L: 3766
					}

					Client.queuedSoundEffectDelays[var0] = -100; // L: 3768
				}
			} else {
				--Client.soundEffectCount; // L: 3721

				for (int var1 = var0; var1 < Client.soundEffectCount; ++var1) { // L: 3722
					Client.soundEffectIds[var1] = Client.soundEffectIds[var1 + 1]; // L: 3723
					Client.soundEffects[var1] = Client.soundEffects[var1 + 1]; // L: 3724
					Client.queuedSoundEffectLoops[var1] = Client.queuedSoundEffectLoops[var1 + 1]; // L: 3725
					Client.queuedSoundEffectDelays[var1] = Client.queuedSoundEffectDelays[var1 + 1]; // L: 3726
					Client.soundLocations[var1] = Client.soundLocations[var1 + 1]; // L: 3727
				}

				--var0; // L: 3729
			}
		}

		if (Client.playingJingle) { // L: 3771
			boolean var12;
			if (!class319.field3462.isEmpty()) { // L: 3774
				var12 = true; // L: 3775
			} else if (!class319.field3459.isEmpty() && class319.field3459.get(0) != null && ((class331)class319.field3459.get(0)).field3582 != null) { // L: 3778
				var12 = ((class331)class319.field3459.get(0)).field3582.isReady(); // L: 3782
			} else {
				var12 = false; // L: 3779
			}

			if (!var12) { // L: 3784
				if (class93.clientPreferences.method2597() != 0) { // L: 3785
					boolean var13 = !class319.field3466.isEmpty(); // L: 3788
					if (var13) { // L: 3790
						class221.method4364(WorldMapSection0.field2587, class93.clientPreferences.method2597()); // L: 3791
					}
				}

				Client.playingJingle = false; // L: 3794
			}
		}

	} // L: 3797
}
