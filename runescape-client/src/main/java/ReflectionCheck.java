import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("wh")
	@ObfuscatedGetter(
		intValue = 161780905
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1102759223
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("ul")
	@ObfuscatedGetter(
		intValue = -1220442589
	)
	static int field244;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -501813555
	)
	@Export("id")
	int id;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 522886235
	)
	@Export("size")
	int size;
	@ObfuscatedName("af")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("at")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("an")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("ao")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("ab")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("aw")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	} // L: 17

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "570300148"
	)
	static final void method670() {
		for (int var0 = 0; var0 < Client.soundEffectCount; ++var0) { // L: 3734
			int var10002 = Client.queuedSoundEffectDelays[var0]--; // L: 3735
			if (Client.queuedSoundEffectDelays[var0] >= -10) { // L: 3736
				SoundEffect var11 = Client.soundEffects[var0]; // L: 3749
				if (var11 == null) { // L: 3750
					Object var10000 = null; // L: 3751
					var11 = SoundEffect.readSoundEffect(class141.archive4, Client.soundEffectIds[var0], 0);
					if (var11 == null) { // L: 3752
						continue;
					}

					int[] var16 = Client.queuedSoundEffectDelays; // L: 3753
					var16[var0] += var11.calculateDelay();
					Client.soundEffects[var0] = var11; // L: 3754
				}

				if (Client.queuedSoundEffectDelays[var0] < 0) { // L: 3760
					int var2;
					if (Client.soundLocations[var0] != 0) { // L: 3762
						int var3 = (Client.soundLocations[var0] & 255) * 128; // L: 3763
						int var4 = Client.soundLocations[var0] >> 16 & 255; // L: 3764
						int var5 = Math.abs(var4 * 128 + 64 - class133.localPlayer.x); // L: 3765
						int var6 = Client.soundLocations[var0] >> 8 & 255; // L: 3766
						int var7 = Math.abs(var6 * 128 + 64 - class133.localPlayer.y); // L: 3767
						int var8 = Math.max(var7 + var5 - 128, 0); // L: 3768
						int var9 = Math.max(((Client.field770[var0] & 31) - 1) * 128, 0); // L: 3769
						if (var8 >= var3) { // L: 3770
							Client.queuedSoundEffectDelays[var0] = -100; // L: 3771
							continue; // L: 3772
						}

						float var10 = var9 < var3 ? Math.min(Math.max((float)(var3 - var8) / (float)(var3 - var9), 0.0F), 1.0F) : 1.0F; // L: 3774
						var2 = (int)(var10 * (float)NPC.clientPreferences.method2475()); // L: 3775
					} else {
						var2 = NPC.clientPreferences.method2473(); // L: 3777
					}

					if (var2 > 0) { // L: 3778
						RawSound var12 = var11.toRawSound().resample(class86.decimator); // L: 3779
						RawPcmStream var13 = RawPcmStream.createRawPcmStream(var12, 100, var2); // L: 3780
						var13.setNumLoops(Client.queuedSoundEffectLoops[var0] - 1); // L: 3781
						HealthBarUpdate.pcmStreamMixer.addSubStream(var13); // L: 3782
					}

					Client.queuedSoundEffectDelays[var0] = -100; // L: 3784
				}
			} else {
				--Client.soundEffectCount; // L: 3737

				for (int var1 = var0; var1 < Client.soundEffectCount; ++var1) { // L: 3738
					Client.soundEffectIds[var1] = Client.soundEffectIds[var1 + 1]; // L: 3739
					Client.soundEffects[var1] = Client.soundEffects[var1 + 1]; // L: 3740
					Client.queuedSoundEffectLoops[var1] = Client.queuedSoundEffectLoops[var1 + 1]; // L: 3741
					Client.queuedSoundEffectDelays[var1] = Client.queuedSoundEffectDelays[var1 + 1]; // L: 3742
					Client.soundLocations[var1] = Client.soundLocations[var1 + 1]; // L: 3743
					Client.field770[var1] = Client.field770[var1 + 1]; // L: 3744
				}

				--var0; // L: 3746
			}
		}

		if (Client.playingJingle) { // L: 3787
			boolean var14;
			if (!class321.field3498.isEmpty()) { // L: 3790
				var14 = true; // L: 3791
			} else if (!class321.field3495.isEmpty() && class321.field3495.get(0) != null && ((class333)class321.field3495.get(0)).field3613 != null) { // L: 3794
				var14 = ((class333)class321.field3495.get(0)).field3613.isReady(); // L: 3798
			} else {
				var14 = false; // L: 3795
			}

			if (!var14) { // L: 3800
				if (NPC.clientPreferences.method2503() != 0) { // L: 3801
					boolean var15 = !class321.field3496.isEmpty(); // L: 3804
					if (var15) { // L: 3806
						class190.method3711(UserComparator6.field1508, NPC.clientPreferences.method2503()); // L: 3807
					}
				}

				Client.playingJingle = false; // L: 3810
			}
		}

	} // L: 3813

	@ObfuscatedName("nc")
	static final void method669(double var0) {
		Rasterizer3D.method4564(var0); // L: 12361
		((TextureProvider)Rasterizer3D.field2611.Rasterizer3D_textureLoader).setBrightness(var0); // L: 12362
		if (ModeWhere.worldMap != null) { // L: 12363
			ModeWhere.worldMap.method8728(); // L: 12364
		}

		ItemComposition.ItemComposition_cachedSprites.clear(); // L: 12367
		NPC.clientPreferences.method2469(var0); // L: 12369
	} // L: 12370
}
