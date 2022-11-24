import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bc")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("lb")
	@ObfuscatedGetter(
		intValue = 1258940689
	)
	@Export("Client_plane")
	static int Client_plane;

	ApproximateRouteStrategy() {
	} // L: 12902

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIILgr;I)Z",
		garbageValue = "-376004430"
	)
	@Export("hasArrived")
	public boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY; // L: 12906
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfu;",
		garbageValue = "-17"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0); // L: 21
		if (var1 != null) { // L: 22
			return var1;
		} else {
			byte[] var2 = class357.InvDefinition_archive.takeFile(5, var0); // L: 23
			var1 = new InvDefinition(); // L: 24
			if (var2 != null) { // L: 25
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0); // L: 26
			return var1; // L: 27
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "18"
	)
	static void method1163(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 73
			if (var4.soundEffectId != -1 || var4.soundEffectIds != null) { // L: 74
				int var5 = 0; // L: 75
				if (var1 > var4.maxX * 16384) { // L: 76
					var5 += var1 - var4.maxX * 16384;
				} else if (var1 < var4.x * 16384) { // L: 77
					var5 += var4.x * 16384 - var1;
				}

				if (var2 > var4.maxY * 16384) { // L: 78
					var5 += var2 - var4.maxY * 16384;
				} else if (var2 < var4.y * 16384) { // L: 79
					var5 += var4.y * 16384 - var2;
				}

				if (var5 - 64 <= var4.field824 && BufferedSink.clientPreferences.method2411() != 0 && var0 == var4.plane) { // L: 80
					var5 -= 64; // L: 91
					if (var5 < 0) { // L: 92
						var5 = 0;
					}

					int var6 = (var4.field824 - var5) * BufferedSink.clientPreferences.method2411() / var4.field824; // L: 93
					if (var4.stream1 == null) { // L: 94
						if (var4.soundEffectId >= 0) { // L: 95
							SoundEffect var7 = SoundEffect.readSoundEffect(Canvas.archive4, var4.soundEffectId, 0); // L: 96
							if (var7 != null) { // L: 97
								RawSound var8 = var7.toRawSound().resample(FaceNormal.decimator); // L: 98
								RawPcmStream var9 = RawPcmStream.createRawPcmStream(var8, 100, var6); // L: 99
								var9.setNumLoops(-1); // L: 100
								class453.pcmStreamMixer.addSubStream(var9); // L: 101
								var4.stream1 = var9; // L: 102
							}
						}
					} else {
						var4.stream1.method892(var6); // L: 106
					}

					if (var4.stream2 == null) { // L: 107
						if (var4.soundEffectIds != null && (var4.field821 -= var3) <= 0) { // L: 108
							int var11 = (int)(Math.random() * (double)var4.soundEffectIds.length); // L: 109
							SoundEffect var12 = SoundEffect.readSoundEffect(Canvas.archive4, var4.soundEffectIds[var11], 0); // L: 110
							if (var12 != null) { // L: 111
								RawSound var13 = var12.toRawSound().resample(FaceNormal.decimator); // L: 112
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var13, 100, var6); // L: 113
								var10.setNumLoops(0); // L: 114
								class453.pcmStreamMixer.addSubStream(var10); // L: 115
								var4.stream2 = var10; // L: 116
								var4.field821 = var4.field830 + (int)(Math.random() * (double)(var4.field831 - var4.field830)); // L: 117
							}
						}
					} else {
						var4.stream2.method892(var6); // L: 122
						if (!var4.stream2.hasNext()) { // L: 123
							var4.stream2 = null; // L: 124
						}
					}
				} else {
					if (var4.stream1 != null) { // L: 81
						class453.pcmStreamMixer.removeSubStream(var4.stream1); // L: 82
						var4.stream1 = null; // L: 83
					}

					if (var4.stream2 != null) { // L: 85
						class453.pcmStreamMixer.removeSubStream(var4.stream2); // L: 86
						var4.stream2 = null; // L: 87
					}
				}
			}
		}

	} // L: 128
}
