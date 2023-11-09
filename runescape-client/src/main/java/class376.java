import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nd")
public class class376 {
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	static StudioGame field4411;

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "([FIFZFZ[FB)I",
		garbageValue = "121"
	)
	public static int method7196(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
		float var7 = 0.0F; // L: 15

		for (int var8 = 0; var8 < var1 + 1; ++var8) { // L: 16
			var7 += Math.abs(var0[var8]); // L: 17
		}

		float var24 = (Math.abs(var2) + Math.abs(var4)) * (float)(var1 + 1) * class121.field1454; // L: 19
		if (var7 <= var24) { // L: 20
			return -1; // L: 21
		} else {
			float[] var9 = new float[var1 + 1]; // L: 23

			int var10;
			for (var10 = 0; var10 < var1 + 1; ++var10) { // L: 24
				var9[var10] = var0[var10] * (1.0F / var7); // L: 25
			}

			while (Math.abs(var9[var1]) < var24) { // L: 27
				--var1; // L: 28
			}

			var10 = 0; // L: 30
			if (var1 == 0) { // L: 31
				return var10; // L: 32
			} else if (var1 == 1) { // L: 34
				var6[0] = -var9[0] / var9[1]; // L: 35
				boolean var22 = var3 ? var2 < var6[0] + var24 : var2 < var6[0] - var24; // L: 36
				boolean var23 = var5 ? var4 > var6[0] - var24 : var4 > var6[0] + var24; // L: 37
				var10 = var22 && var23 ? 1 : 0; // L: 38
				if (var10 > 0) { // L: 39
					if (var3 && var6[0] < var2) { // L: 40
						var6[0] = var2; // L: 41
					} else if (var5 && var6[0] > var4) { // L: 43
						var6[0] = var4; // L: 44
					}
				}

				return var10; // L: 47
			} else {
				class409 var11 = new class409(var9, var1); // L: 50
				float[] var12 = new float[var1 + 1]; // L: 51

				for (int var13 = 1; var13 <= var1; ++var13) { // L: 52
					var12[var13 - 1] = var9[var13] * (float)var13; // L: 53
				}

				float[] var21 = new float[var1 + 1]; // L: 55
				int var14 = method7196(var12, var1 - 1, var2, false, var4, false, var21); // L: 56
				if (var14 == -1) { // L: 57
					return 0; // L: 58
				} else {
					boolean var15 = false; // L: 60
					float var17 = 0.0F; // L: 62
					float var18 = 0.0F; // L: 63
					float var19 = 0.0F; // L: 64

					for (int var20 = 0; var20 <= var14; ++var20) { // L: 65
						if (var10 > var1) { // L: 66
							return var10;
						}

						float var16;
						if (var20 == 0) { // L: 67
							var16 = var2; // L: 68
							var18 = class1.method8(var9, var1, var2); // L: 69
							if (Math.abs(var18) <= var24 && var3) { // L: 70
								var6[var10++] = var2;
							}
						} else {
							var16 = var19; // L: 73
							var18 = var17; // L: 74
						}

						if (var20 == var14) { // L: 76
							var19 = var4; // L: 77
							var15 = false; // L: 78
						} else {
							var19 = var21[var20]; // L: 81
						}

						var17 = class1.method8(var9, var1, var19); // L: 83
						if (var15) { // L: 84
							var15 = false; // L: 85
						} else if (Math.abs(var17) < var24) { // L: 88
							if (var20 != var14 || var5) { // L: 89
								var6[var10++] = var19; // L: 90
								var15 = true; // L: 91
							}
						} else if (var18 < 0.0F && var17 > 0.0F || var18 > 0.0F && var17 < 0.0F) { // L: 94
							var6[var10++] = class406.method7618(var11, var16, var19, 0.0F); // L: 95
							if (var10 > 1 && var6[var10 - 2] >= var6[var10 - 1] - var24) { // L: 96
								var6[var10 - 2] = 0.5F * (var6[var10 - 1] + var6[var10 - 2]); // L: 97
								--var10; // L: 98
							}
						}
					}

					return var10; // L: 104
				}
			}
		}
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1392553380"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close(); // L: 2947
		UserComparator4.method2738(); // L: 2948
		class139.scene.clear(); // L: 2949

		for (int var0 = 0; var0 < 4; ++var0) { // L: 2950
			Client.collisionMaps[var0].clear();
		}

		Client.field734.method3933(); // L: 2951
		System.gc(); // L: 2952
		class283.musicPlayerStatus = 1; // L: 2954
		DevicePcmPlayerProvider.musicTrackArchive = null; // L: 2955
		class283.musicTrackGroupId = -1; // L: 2956
		class283.musicTrackFileId = -1; // L: 2957
		Messages.musicTrackVolume = 0; // L: 2958
		GrandExchangeEvents.musicTrackBoolean = false; // L: 2959
		class19.pcmSampleLength = 2; // L: 2960
		Client.currentTrackGroupId = -1; // L: 2962
		Client.playingJingle = false; // L: 2963
		class87.method2257(); // L: 2964
		class21.method305(10); // L: 2965
	} // L: 2966

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1722772442"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		logOut(); // L: 2969
		switch(var0) { // L: 2970
		case 1:
			class11.method102(); // L: 2973
			break;
		case 2:
			class13.method169(); // L: 2978
		}

	} // L: 2982
}
