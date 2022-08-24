import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1491857767
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -260397409
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("w")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("v")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1; // L: 973
		this.height = var2; // L: 974
		this.xWidths = var3; // L: 975
		this.xStarts = var4; // L: 976
	} // L: 977

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "130254113"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) { // L: 980
			int var3 = this.xStarts[var2]; // L: 981
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) { // L: 982
				return true;
			}
		}

		return false; // L: 984
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(S)Lni;",
		garbageValue = "3189"
	)
	public static class387 method5460() {
		synchronized(class387.field4397) { // L: 26
			if (class387.field4392 == 0) { // L: 27
				return new class387();
			} else {
				class387.field4397[--class387.field4392].method6891(); // L: 29
				return class387.field4397[class387.field4392]; // L: 30
			}
		}
	}

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1670242040"
	)
	static final void method5457() {
		for (int var0 = 0; var0 < Client.soundEffectCount; ++var0) { // L: 3495
			int var10002 = Client.queuedSoundEffectDelays[var0]--; // L: 3496
			if (Client.queuedSoundEffectDelays[var0] >= -10) { // L: 3497
				SoundEffect var1 = Client.soundEffects[var0]; // L: 3509
				if (var1 == null) { // L: 3510
					Object var10000 = null; // L: 3511
					var1 = SoundEffect.readSoundEffect(class271.archive4, Client.soundEffectIds[var0], 0);
					if (var1 == null) { // L: 3512
						continue;
					}

					int[] var12 = Client.queuedSoundEffectDelays; // L: 3513
					var12[var0] += var1.calculateDelay();
					Client.soundEffects[var0] = var1; // L: 3514
				}

				if (Client.queuedSoundEffectDelays[var0] < 0) { // L: 3520
					int var2;
					if (Client.soundLocations[var0] != 0) { // L: 3522
						int var3 = (Client.soundLocations[var0] & 255) * 128; // L: 3523
						int var4 = Client.soundLocations[var0] >> 16 & 255; // L: 3524
						int var5 = var4 * 128 + 64 - ScriptFrame.localPlayer.x; // L: 3525
						if (var5 < 0) { // L: 3526
							var5 = -var5;
						}

						int var6 = Client.soundLocations[var0] >> 8 & 255; // L: 3527
						int var7 = var6 * 128 + 64 - ScriptFrame.localPlayer.y; // L: 3528
						if (var7 < 0) { // L: 3529
							var7 = -var7;
						}

						int var8 = var5 + var7 - 128; // L: 3530
						if (var8 > var3) { // L: 3531
							Client.queuedSoundEffectDelays[var0] = -100; // L: 3532
							continue; // L: 3533
						}

						if (var8 < 0) { // L: 3535
							var8 = 0;
						}

						var2 = (var3 - var8) * FriendsChatMember.clientPreferences.method2226() / var3; // L: 3536
					} else {
						var2 = FriendsChatMember.clientPreferences.method2204(); // L: 3538
					}

					if (var2 > 0) { // L: 3539
						RawSound var9 = var1.toRawSound().resample(ScriptEvent.decimator); // L: 3540
						RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var2); // L: 3541
						var10.setNumLoops(Client.queuedSoundEffectLoops[var0] - 1); // L: 3542
						ModeWhere.pcmStreamMixer.addSubStream(var10); // L: 3543
					}

					Client.queuedSoundEffectDelays[var0] = -100; // L: 3545
				}
			} else {
				--Client.soundEffectCount; // L: 3498

				for (int var11 = var0; var11 < Client.soundEffectCount; ++var11) { // L: 3499
					Client.soundEffectIds[var11] = Client.soundEffectIds[var11 + 1]; // L: 3500
					Client.soundEffects[var11] = Client.soundEffects[var11 + 1]; // L: 3501
					Client.queuedSoundEffectLoops[var11] = Client.queuedSoundEffectLoops[var11 + 1]; // L: 3502
					Client.queuedSoundEffectDelays[var11] = Client.queuedSoundEffectDelays[var11 + 1]; // L: 3503
					Client.soundLocations[var11] = Client.soundLocations[var11 + 1]; // L: 3504
				}

				--var0; // L: 3506
			}
		}

		if (Client.playingJingle && !class260.method5128()) { // L: 3548
			if (FriendsChatMember.clientPreferences.method2222() != 0 && Client.currentTrackGroupId != -1) { // L: 3549
				class118.method2713(PacketBuffer.archive6, Client.currentTrackGroupId, 0, FriendsChatMember.clientPreferences.method2222(), false);
			}

			Client.playingJingle = false; // L: 3550
		}

	} // L: 3552
}
