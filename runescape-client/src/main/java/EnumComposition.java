import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	@Export("EnumDefinition_archive")
	static AbstractArchive EnumDefinition_archive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("EnumDefinition_cached")
	static EvictingDualNodeHashTable EnumDefinition_cached;
	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "[Lsn;"
	)
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;
	@ObfuscatedName("ac")
	@Export("inputType")
	public char inputType;
	@ObfuscatedName("ab")
	@Export("outputType")
	public char outputType;
	@ObfuscatedName("an")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1280965073
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -363214541
	)
	@Export("outputCount")
	public int outputCount;
	@ObfuscatedName("aq")
	@Export("keys")
	public int[] keys;
	@ObfuscatedName("ap")
	@Export("intVals")
	public int[] intVals;
	@ObfuscatedName("ar")
	@Export("strVals")
	public String[] strVals;

	static {
		EnumDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	EnumComposition() {
		this.defaultStr = "null"; // L: 15
		this.outputCount = 0; // L: 17
	} // L: 22

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)V",
		garbageValue = "1329154788"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 40
			if (var2 == 0) { // L: 41
				return; // L: 44
			}

			this.decodeNext(var1, var2); // L: 42
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lsy;IB)V",
		garbageValue = "-35"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 47
			this.inputType = (char)var1.readUnsignedByte();
		} else if (var2 == 2) { // L: 48
			this.outputType = (char)var1.readUnsignedByte();
		} else if (var2 == 3) { // L: 49
			this.defaultStr = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 50
			this.defaultInt = var1.readInt();
		} else {
			int var3;
			if (var2 == 5) { // L: 51
				this.outputCount = var1.readUnsignedShort(); // L: 52
				this.keys = new int[this.outputCount]; // L: 53
				this.strVals = new String[this.outputCount]; // L: 54

				for (var3 = 0; var3 < this.outputCount; ++var3) { // L: 55
					this.keys[var3] = var1.readInt(); // L: 56
					this.strVals[var3] = var1.readStringCp1252NullTerminated(); // L: 57
				}
			} else if (var2 == 6) { // L: 60
				this.outputCount = var1.readUnsignedShort(); // L: 61
				this.keys = new int[this.outputCount]; // L: 62
				this.intVals = new int[this.outputCount]; // L: 63

				for (var3 = 0; var3 < this.outputCount; ++var3) { // L: 64
					this.keys[var3] = var1.readInt(); // L: 65
					this.intVals[var3] = var1.readInt(); // L: 66
				}
			}
		}

	} // L: 70

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-548958041"
	)
	@Export("size")
	public int size() {
		return this.outputCount; // L: 73
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-297669766"
	)
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (ViewportMouse.pcmPlayer1 != null) { // L: 3562
			ViewportMouse.pcmPlayer1.run();
		}

		if (Interpreter.pcmPlayer0 != null) { // L: 3563
			Interpreter.pcmPlayer0.run();
		}

	} // L: 3564

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "323203445"
	)
	static final void method3652() {
		for (int var0 = 0; var0 < Client.soundEffectCount; ++var0) { // L: 3567
			int var10002 = Client.queuedSoundEffectDelays[var0]--; // L: 3568
			if (Client.queuedSoundEffectDelays[var0] >= -10) { // L: 3569
				SoundEffect var1 = Client.soundEffects[var0]; // L: 3581
				if (var1 == null) { // L: 3582
					Object var10000 = null; // L: 3583
					var1 = SoundEffect.readSoundEffect(class175.archive9, Client.soundEffectIds[var0], 0);
					if (var1 == null) { // L: 3584
						continue;
					}

					int[] var13 = Client.queuedSoundEffectDelays; // L: 3585
					var13[var0] += var1.calculateDelay();
					Client.soundEffects[var0] = var1; // L: 3586
				}

				if (Client.queuedSoundEffectDelays[var0] < 0) { // L: 3592
					int var2;
					if (Client.soundLocations[var0] != 0) { // L: 3594
						int var3 = (Client.soundLocations[var0] & 255) * 128; // L: 3595
						int var4 = Client.soundLocations[var0] >> 16 & 255; // L: 3596
						int var5 = var4 * 128 + 64 - BuddyRankComparator.localPlayer.x; // L: 3597
						if (var5 < 0) { // L: 3598
							var5 = -var5;
						}

						int var6 = Client.soundLocations[var0] >> 8 & 255; // L: 3599
						int var7 = var6 * 128 + 64 - BuddyRankComparator.localPlayer.y; // L: 3600
						if (var7 < 0) { // L: 3601
							var7 = -var7;
						}

						int var8 = var7 + var5 - 128; // L: 3602
						if (var8 > var3) { // L: 3603
							Client.queuedSoundEffectDelays[var0] = -100; // L: 3604
							continue; // L: 3605
						}

						if (var8 < 0) { // L: 3607
							var8 = 0;
						}

						var2 = (var3 - var8) * WorldMapSectionType.clientPreferences.method2463() / var3; // L: 3608
					} else {
						var2 = WorldMapSectionType.clientPreferences.method2442(); // L: 3610
					}

					if (var2 > 0) { // L: 3611
						RawSound var9 = var1.toRawSound().resample(TaskHandler.decimator); // L: 3612
						RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var2); // L: 3613
						var10.setNumLoops(Client.queuedSoundEffectLoops[var0] - 1); // L: 3614
						class323.pcmStreamMixer.addSubStream(var10); // L: 3615
					}

					Client.queuedSoundEffectDelays[var0] = -100; // L: 3617
				}
			} else {
				--Client.soundEffectCount; // L: 3570

				for (int var11 = var0; var11 < Client.soundEffectCount; ++var11) { // L: 3571
					Client.soundEffectIds[var11] = Client.soundEffectIds[var11 + 1]; // L: 3572
					Client.soundEffects[var11] = Client.soundEffects[var11 + 1]; // L: 3573
					Client.queuedSoundEffectLoops[var11] = Client.queuedSoundEffectLoops[var11 + 1]; // L: 3574
					Client.queuedSoundEffectDelays[var11] = Client.queuedSoundEffectDelays[var11 + 1]; // L: 3575
					Client.soundLocations[var11] = Client.soundLocations[var11 + 1]; // L: 3576
				}

				--var0; // L: 3578
			}
		}

		if (Client.playingJingle) { // L: 3620
			boolean var12;
			if (class293.musicPlayerStatus != 0) { // L: 3623
				var12 = true; // L: 3624
			} else {
				var12 = class293.midiPcmStream.isReady(); // L: 3627
			}

			if (!var12) { // L: 3629
				if (WorldMapSectionType.clientPreferences.method2440() != 0 && Client.currentTrackGroupId != -1) { // L: 3630
					class163.method3352(class308.archive6, Client.currentTrackGroupId, 0, WorldMapSectionType.clientPreferences.method2440(), false);
				}

				Client.playingJingle = false; // L: 3631
			}
		}

	} // L: 3634
}
