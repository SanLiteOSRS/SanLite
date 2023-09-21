import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
final class class73 implements ThreadFactory {
	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load"); // L: 12941
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lhz;",
		garbageValue = "1119787820"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0);
		if (var1 != null) { // L: 36
			return var1;
		} else {
			byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0); // L: 37
			var1 = new KitDefinition(); // L: 38
			if (var2 != null) { // L: 39
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0); // L: 40
			return var1; // L: 41
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lht;",
		garbageValue = "-1308783411"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0); // L: 29
		if (var1 != null) { // L: 30
			return var1;
		} else {
			byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0); // L: 31
			var1 = new EnumComposition(); // L: 32
			if (var2 != null) { // L: 33
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0); // L: 34
			return var1; // L: 35
		}
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2027765065"
	)
	static final void method2110() {
		for (int var0 = 0; var0 < Client.soundEffectCount; ++var0) { // L: 3763
			int var10002 = Client.queuedSoundEffectDelays[var0]--; // L: 3764
			if (Client.queuedSoundEffectDelays[var0] >= -10) { // L: 3765
				SoundEffect var1 = Client.soundEffects[var0]; // L: 3777
				if (var1 == null) { // L: 3778
					Object var10000 = null; // L: 3779
					var1 = SoundEffect.readSoundEffect(class469.field4812, Client.soundEffectIds[var0], 0);
					if (var1 == null) { // L: 3780
						continue;
					}

					int[] var12 = Client.queuedSoundEffectDelays; // L: 3781
					var12[var0] += var1.calculateDelay();
					Client.soundEffects[var0] = var1; // L: 3782
				}

				if (Client.queuedSoundEffectDelays[var0] < 0) { // L: 3788
					int var2;
					if (Client.soundLocations[var0] != 0) { // L: 3790
						int var3 = (Client.soundLocations[var0] & 255) * 128; // L: 3791
						int var4 = Client.soundLocations[var0] >> 16 & 255; // L: 3792
						int var5 = var4 * 128 + 64 - TextureProvider.localPlayer.x; // L: 3793
						if (var5 < 0) { // L: 3794
							var5 = -var5;
						}

						int var6 = Client.soundLocations[var0] >> 8 & 255; // L: 3795
						int var7 = var6 * 128 + 64 - TextureProvider.localPlayer.y; // L: 3796
						if (var7 < 0) { // L: 3797
							var7 = -var7;
						}

						int var8 = var5 + var7 - 128; // L: 3798
						if (var8 > var3) { // L: 3799
							Client.queuedSoundEffectDelays[var0] = -100; // L: 3800
							continue; // L: 3801
						}

						if (var8 < 0) { // L: 3803
							var8 = 0;
						}

						var2 = (var3 - var8) * class91.clientPreferences.method2589() / var3; // L: 3804
					} else {
						var2 = class91.clientPreferences.method2517(); // L: 3806
					}

					if (var2 > 0) { // L: 3807
						RawSound var9 = var1.toRawSound().resample(class136.decimator); // L: 3808
						RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var2); // L: 3809
						var10.setNumLoops(Client.queuedSoundEffectLoops[var0] - 1); // L: 3810
						class140.pcmStreamMixer.addSubStream(var10); // L: 3811
					}

					Client.queuedSoundEffectDelays[var0] = -100; // L: 3813
				}
			} else {
				--Client.soundEffectCount; // L: 3766

				for (int var11 = var0; var11 < Client.soundEffectCount; ++var11) { // L: 3767
					Client.soundEffectIds[var11] = Client.soundEffectIds[var11 + 1]; // L: 3768
					Client.soundEffects[var11] = Client.soundEffects[var11 + 1]; // L: 3769
					Client.queuedSoundEffectLoops[var11] = Client.queuedSoundEffectLoops[var11 + 1]; // L: 3770
					Client.queuedSoundEffectDelays[var11] = Client.queuedSoundEffectDelays[var11 + 1]; // L: 3771
					Client.soundLocations[var11] = Client.soundLocations[var11 + 1]; // L: 3772
				}

				--var0; // L: 3774
			}
		}

		if (Client.playingJingle && !class366.method6819()) { // L: 3816
			if (class91.clientPreferences.method2515() != 0 && ScriptFrame.method1194()) { // L: 3817
				VarcInt.method3677(CollisionMap.field2392, class91.clientPreferences.method2515()); // L: 3818
			}

			Client.playingJingle = false; // L: 3820
		}

	} // L: 3822
}
