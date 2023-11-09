import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("n")
public class class7 {
	@ObfuscatedName("nk")
	@ObfuscatedGetter(
		intValue = -814181313
	)
	@Export("menuWidth")
	static int menuWidth;
	@ObfuscatedName("f")
	ExecutorService field24;
	@ObfuscatedName("w")
	Future field23;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lrd;"
	)
	final Buffer field22;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ls;"
	)
	final class3 field25;

	@ObfuscatedSignature(
		descriptor = "(Lrd;Ls;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field24 = Executors.newSingleThreadExecutor(); // L: 10
		this.field22 = var1; // L: 16
		this.field25 = var2; // L: 17
		this.method67(); // L: 18
	} // L: 19

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-504541602"
	)
	public boolean method54() {
		return this.field23.isDone(); // L: 22
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2078703024"
	)
	public void method55() {
		this.field24.shutdown(); // L: 26
		this.field24 = null; // L: 27
	} // L: 28

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lrd;",
		garbageValue = "-338612782"
	)
	public Buffer method66() {
		try {
			return (Buffer)this.field23.get(); // L: 32
		} catch (Exception var2) { // L: 34
			return null; // L: 35
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2134403401"
	)
	void method67() {
		this.field23 = this.field24.submit(new class1(this, this.field22, this.field25)); // L: 40
	} // L: 41

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lrs;IIIB)V",
		garbageValue = "1"
	)
	static void method65(SpritePixels var0, int var1, int var2, int var3) {
		WorldMapRegion.WorldMapRegion_cachedSprites.put(var0, ParamComposition.method3840(var1, var2, var3), var0.pixels.length * 4); // L: 46
	} // L: 47

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "833552828"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 64
		if (var1 == null) { // L: 65
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count; // L: 66 67
		}
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1889949053"
	)
	static final void method64() {
		for (int var0 = 0; var0 < Client.soundEffectCount; ++var0) { // L: 3933
			int var10002 = Client.queuedSoundEffectDelays[var0]--; // L: 3934
			if (Client.queuedSoundEffectDelays[var0] >= -10) { // L: 3935
				SoundEffect var1 = Client.soundEffects[var0]; // L: 3947
				if (var1 == null) { // L: 3948
					Object var10000 = null; // L: 3949
					var1 = SoundEffect.readSoundEffect(DynamicObject.archive9, Client.soundEffectIds[var0], 0);
					if (var1 == null) { // L: 3950
						continue;
					}

					int[] var12 = Client.queuedSoundEffectDelays; // L: 3951
					var12[var0] += var1.calculateDelay();
					Client.soundEffects[var0] = var1; // L: 3952
				}

				if (Client.queuedSoundEffectDelays[var0] < 0) { // L: 3958
					int var2;
					if (Client.soundLocations[var0] != 0) { // L: 3960
						int var3 = (Client.soundLocations[var0] & 255) * 128; // L: 3961
						int var4 = Client.soundLocations[var0] >> 16 & 255; // L: 3962
						int var5 = var4 * 128 + 64 - class387.localPlayer.x; // L: 3963
						if (var5 < 0) { // L: 3964
							var5 = -var5;
						}

						int var6 = Client.soundLocations[var0] >> 8 & 255; // L: 3965
						int var7 = var6 * 128 + 64 - class387.localPlayer.y; // L: 3966
						if (var7 < 0) { // L: 3967
							var7 = -var7;
						}

						int var8 = var7 + var5 - 128; // L: 3968
						if (var8 > var3) { // L: 3969
							Client.queuedSoundEffectDelays[var0] = -100; // L: 3970
							continue; // L: 3971
						}

						if (var8 < 0) { // L: 3973
							var8 = 0;
						}

						var2 = (var3 - var8) * PacketWriter.clientPreferences.method2499() / var3; // L: 3974
					} else {
						var2 = PacketWriter.clientPreferences.method2497(); // L: 3976
					}

					if (var2 > 0) { // L: 3977
						RawSound var9 = var1.toRawSound().resample(class257.decimator); // L: 3978
						RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var2); // L: 3979
						var10.setNumLoops(Client.queuedSoundEffectLoops[var0] - 1); // L: 3980
						class209.pcmStreamMixer.addSubStream(var10); // L: 3981
					}

					Client.queuedSoundEffectDelays[var0] = -100; // L: 3983
				}
			} else {
				--Client.soundEffectCount; // L: 3936

				for (int var11 = var0; var11 < Client.soundEffectCount; ++var11) { // L: 3937
					Client.soundEffectIds[var11] = Client.soundEffectIds[var11 + 1]; // L: 3938
					Client.soundEffects[var11] = Client.soundEffects[var11 + 1]; // L: 3939
					Client.queuedSoundEffectLoops[var11] = Client.queuedSoundEffectLoops[var11 + 1]; // L: 3940
					Client.queuedSoundEffectDelays[var11] = Client.queuedSoundEffectDelays[var11 + 1]; // L: 3941
					Client.soundLocations[var11] = Client.soundLocations[var11 + 1]; // L: 3942
				}

				--var0; // L: 3944
			}
		}

		if (Client.playingJingle && !DynamicObject.method2208()) { // L: 3986
			if (PacketWriter.clientPreferences.method2495() != 0 && Client.currentTrackGroupId != -1) { // L: 3987
				class148.method3216(class153.archive6, Client.currentTrackGroupId, 0, PacketWriter.clientPreferences.method2495(), false);
			}

			Client.playingJingle = false; // L: 3988
		}

	} // L: 3990

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-70"
	)
	static final void method70(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) { // L: 9271
			if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) { // L: 9272
				Client.field678[var4] = true;
			}
		}

	} // L: 9274
}
