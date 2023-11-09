import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ms")
public enum class324 implements class356 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	field3742(0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	field3741(1),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	field3744(2),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	field3743(3),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	field3745(4);

	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1109405995
	)
	final int field3746;

	class324(int var3) {
		this.field3746 = var3; // L: 14
	} // L: 15

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "741942848"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3746; // L: 19
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)V",
		garbageValue = "-14431"
	)
	static void method6566(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 99
			if (var4.soundEffectId != -1 || var4.soundEffectIds != null) { // L: 100
				int var5 = 0; // L: 101
				if (var1 > var4.maxX * 16384) { // L: 102
					var5 += var1 - var4.maxX * 16384;
				} else if (var1 < var4.x * 16384) { // L: 103
					var5 += var4.x * 16384 - var1;
				}

				if (var2 > var4.maxY * 16384) { // L: 104
					var5 += var2 - var4.maxY * 16384;
				} else if (var2 < var4.y * 16384) { // L: 105
					var5 += var4.y * 16384 - var2;
				}

				if (var5 - 64 <= var4.field815 && class20.clientPreferences.method2465() != 0 && var0 == var4.plane) { // L: 106
					var5 -= 64; // L: 117
					if (var5 < 0) { // L: 118
						var5 = 0;
					}

					int var6 = (var4.field815 - var5) * class20.clientPreferences.method2465() / var4.field815; // L: 119
					if (var4.stream1 == null) { // L: 120
						if (var4.soundEffectId >= 0) { // L: 121
							SoundEffect var7 = SoundEffect.readSoundEffect(class426.archive4, var4.soundEffectId, 0); // L: 122
							if (var7 != null) { // L: 123
								RawSound var8 = var7.toRawSound().resample(WorldMapSectionType.decimator); // L: 124
								RawPcmStream var9 = RawPcmStream.createRawPcmStream(var8, 100, var6); // L: 125
								var9.setNumLoops(-1); // L: 126
								class130.pcmStreamMixer.addSubStream(var9); // L: 127
								var4.stream1 = var9; // L: 128
							}
						}
					} else {
						var4.stream1.method979(var6); // L: 132
					}

					if (var4.stream2 == null) { // L: 133
						if (var4.soundEffectIds != null && (var4.field822 -= var3) <= 0) { // L: 134
							int var11 = (int)(Math.random() * (double)var4.soundEffectIds.length); // L: 135
							SoundEffect var12 = SoundEffect.readSoundEffect(class426.archive4, var4.soundEffectIds[var11], 0); // L: 136
							if (var12 != null) { // L: 137
								RawSound var13 = var12.toRawSound().resample(WorldMapSectionType.decimator); // L: 138
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var13, 100, var6); // L: 139
								var10.setNumLoops(0); // L: 140
								class130.pcmStreamMixer.addSubStream(var10); // L: 141
								var4.stream2 = var10; // L: 142
								var4.field822 = var4.field824 + (int)(Math.random() * (double)(var4.field825 - var4.field824)); // L: 143
							}
						}
					} else {
						var4.stream2.method979(var6); // L: 148
						if (!var4.stream2.hasNext()) { // L: 149
							var4.stream2 = null; // L: 150
						}
					}
				} else {
					if (var4.stream1 != null) { // L: 107
						class130.pcmStreamMixer.removeSubStream(var4.stream1); // L: 108
						var4.stream1 = null; // L: 109
					}

					if (var4.stream2 != null) { // L: 111
						class130.pcmStreamMixer.removeSubStream(var4.stream2); // L: 112
						var4.stream2 = null; // L: 113
					}
				}
			}
		}

	} // L: 154

	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "896497182"
	)
	static void method6565() {
		if (Client.field585 && MusicPatchNode.localPlayer != null) { // L: 12189
			int var0 = MusicPatchNode.localPlayer.pathX[0]; // L: 12190
			int var1 = MusicPatchNode.localPlayer.pathY[0]; // L: 12191
			if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) { // L: 12192
				return;
			}

			class33.oculusOrbFocalPointX = MusicPatchNode.localPlayer.x; // L: 12193
			int var2 = class147.getTileHeight(MusicPatchNode.localPlayer.x, MusicPatchNode.localPlayer.y, GameEngine.Client_plane) - Client.camFollowHeight; // L: 12194
			if (var2 < class96.field1296) { // L: 12195
				class96.field1296 = var2;
			}

			class144.oculusOrbFocalPointY = MusicPatchNode.localPlayer.y; // L: 12196
			Client.field585 = false; // L: 12197
		}

	} // L: 12199
}
