import java.awt.Component;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("av")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("wb")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = 6865685735894550463L
	)
	static long field114;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lbe;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;
	@ObfuscatedName("pr")
	@ObfuscatedGetter(
		intValue = -395313837
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;
	@ObfuscatedName("au")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1; // L: 11
	} // L: 12

	public final void paint(Graphics var1) {
		this.component.paint(var1); // L: 19
	} // L: 20

	public final void update(Graphics var1) {
		this.component.update(var1); // L: 15
	} // L: 16

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1772266899"
	)
	static final void method324() {
		int var3;
		for (int var0 = 0; var0 < Client.soundEffectCount; ++var0) { // L: 3451
			int var10002 = Client.queuedSoundEffectDelays[var0]--; // L: 3452
			if (Client.queuedSoundEffectDelays[var0] >= -10) { // L: 3453
				SoundEffect var9 = Client.soundEffects[var0]; // L: 3465
				if (var9 == null) { // L: 3466
					Object var10000 = null; // L: 3467
					var9 = SoundEffect.readSoundEffect(KeyHandler.archive9, Client.soundEffectIds[var0], 0);
					if (var9 == null) { // L: 3468
						continue;
					}

					int[] var18 = Client.queuedSoundEffectDelays; // L: 3469
					var18[var0] += var9.calculateDelay();
					Client.soundEffects[var0] = var9; // L: 3470
				}

				if (Client.queuedSoundEffectDelays[var0] < 0) { // L: 3476
					int var10;
					if (Client.soundLocations[var0] != 0) { // L: 3478
						var3 = (Client.soundLocations[var0] & 255) * 128; // L: 3479
						int var11 = Client.soundLocations[var0] >> 16 & 255; // L: 3480
						int var12 = var11 * 128 + 64 - VarbitComposition.localPlayer.x; // L: 3481
						if (var12 < 0) { // L: 3482
							var12 = -var12;
						}

						int var13 = Client.soundLocations[var0] >> 8 & 255; // L: 3483
						int var7 = var13 * 128 + 64 - VarbitComposition.localPlayer.y; // L: 3484
						if (var7 < 0) { // L: 3485
							var7 = -var7;
						}

						int var8 = var7 + var12 - 128; // L: 3486
						if (var8 > var3) { // L: 3487
							Client.queuedSoundEffectDelays[var0] = -100; // L: 3488
							continue; // L: 3489
						}

						if (var8 < 0) { // L: 3491
							var8 = 0;
						}

						var10 = (var3 - var8) * class449.clientPreferences.method2554() / var3; // L: 3492
					} else {
						var10 = class449.clientPreferences.method2462(); // L: 3494
					}

					if (var10 > 0) { // L: 3495
						RawSound var14 = var9.toRawSound().resample(class330.decimator); // L: 3496
						RawPcmStream var4 = RawPcmStream.createRawPcmStream(var14, 100, var10); // L: 3497
						var4.setNumLoops(Client.queuedSoundEffectLoops[var0] - 1); // L: 3498
						class162.pcmStreamMixer.addSubStream(var4); // L: 3499
					}

					Client.queuedSoundEffectDelays[var0] = -100; // L: 3501
				}
			} else {
				--Client.soundEffectCount; // L: 3454

				for (int var1 = var0; var1 < Client.soundEffectCount; ++var1) { // L: 3455
					Client.soundEffectIds[var1] = Client.soundEffectIds[var1 + 1]; // L: 3456
					Client.soundEffects[var1] = Client.soundEffects[var1 + 1]; // L: 3457
					Client.queuedSoundEffectLoops[var1] = Client.queuedSoundEffectLoops[var1 + 1]; // L: 3458
					Client.queuedSoundEffectDelays[var1] = Client.queuedSoundEffectDelays[var1 + 1]; // L: 3459
					Client.soundLocations[var1] = Client.soundLocations[var1 + 1]; // L: 3460
				}

				--var0; // L: 3462
			}
		}

		if (Client.playingJingle) { // L: 3504
			boolean var15;
			if (!class305.field3406.isEmpty()) { // L: 3507
				var15 = true; // L: 3508
			} else if (!class305.field3404.isEmpty() && class305.field3404.get(0) != null && ((class317)class305.field3404.get(0)).field3517 != null) { // L: 3511
				var15 = ((class317)class305.field3404.get(0)).field3517.isReady(); // L: 3515
			} else {
				var15 = false; // L: 3512
			}

			if (!var15) { // L: 3517
				if (class449.clientPreferences.method2451() != 0) { // L: 3518
					boolean var16 = !class305.field3405.isEmpty(); // L: 3521
					if (var16) { // L: 3523
						Archive var2 = class385.archive11; // L: 3524
						var3 = class449.clientPreferences.method2451(); // L: 3525
						if (!class305.field3405.isEmpty()) { // L: 3527
							ArrayList var17 = new ArrayList(); // L: 3530
							Iterator var5 = class305.field3405.iterator(); // L: 3531

							while (var5.hasNext()) {
								class317 var6 = (class317)var5.next(); // L: 3532
								var6.field3518 = false; // L: 3534
								var6.field3516 = false; // L: 3535
								var6.field3524 = false; // L: 3536
								var6.field3519 = false; // L: 3537
								var6.field3514 = var2; // L: 3538
								var6.field3513 = var3; // L: 3539
								var6.field3510 = 0.0F; // L: 3540
								var17.add(var6); // L: 3541
							}

							class53.method1097(var17, class305.field3408, class305.field3409, class305.field3410, class305.field3401, false); // L: 3544
						}
					}
				}

				Client.playingJingle = false; // L: 3548
			}
		}

	} // L: 3551
}
