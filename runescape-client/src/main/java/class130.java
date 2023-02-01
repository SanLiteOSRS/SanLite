import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
public class class130 extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1966668885
	)
	int field1607;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "[[Ldu;"
	)
	public class125[][] field1604;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[[Ldu;"
	)
	class125[][] field1605;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	public Skeleton field1603;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1549136257
	)
	int field1609;
	@ObfuscatedName("q")
	boolean field1606;

	@ObfuscatedSignature(
		descriptor = "(Lly;Lly;IZ)V",
		garbageValue = "0"
	)
	public class130(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1604 = null; // L: 14
		this.field1605 = null; // L: 15
		this.field1609 = 0; // L: 17
		this.field1607 = var3; // L: 21
		byte[] var5 = var1.takeFile(this.field1607 >> 16 & 65535, this.field1607 & 65535); // L: 22
		Buffer var6 = new Buffer(var5); // L: 23
		int var7 = var6.readUnsignedByte(); // L: 24
		int var8 = var6.readUnsignedShort(); // L: 25
		byte[] var9 = var2.getFile(var8, 0); // L: 28
		this.field1603 = new Skeleton(var8, var9); // L: 29
		this.method3004(var6, var7); // L: 30
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqy;IS)V",
		garbageValue = "-5453"
	)
	void method3004(Buffer var1, int var2) {
		var1.readUnsignedShort(); // L: 34
		var1.readUnsignedShort();
		this.field1609 = var1.readUnsignedByte();
		int var3 = var1.readUnsignedShort(); // L: 37
		this.field1605 = new class125[this.field1603.method4422().method4400()][]; // L: 38
		this.field1604 = new class125[this.field1603.method4426()][]; // L: 39

		for (int var4 = 0; var4 < var3; ++var4) { // L: 40
			class126 var5 = class343.method6662(var1.readUnsignedByte()); // L: 41
			int var6 = var1.readShortSmart(); // L: 42
			class127 var7 = class34.method490(var1.readUnsignedByte()); // L: 43
			class125 var8 = new class125(); // L: 44
			var8.method2943(var1, var2); // L: 45
			int var9 = var5.method2974(); // L: 46
			class125[][] var10;
			if (var5 == class126.field1563) { // L: 48
				var10 = this.field1605; // L: 49
			} else {
				var10 = this.field1604; // L: 52
			}

			if (var10[var6] == null) { // L: 54
				var10[var6] = new class125[var9]; // L: 55
			}

			var10[var6][var7.method2989()] = var8; // L: 57
			if (var5 == class126.field1566) { // L: 58
				this.field1606 = true; // L: 59
			}
		}

	} // L: 62

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "854058965"
	)
	public int method3021() {
		return this.field1609; // L: 65
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-98"
	)
	public boolean method3005() {
		return this.field1606; // L: 69
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ILdt;III)V",
		garbageValue = "2132738190"
	)
	public void method3003(int var1, class123 var2, int var3, int var4) {
		class410 var5 = class326.method6395(); // L: 73
		this.method3007(var5, var3, var2, var1); // L: 74
		this.method3009(var5, var3, var2, var1); // L: 75
		this.method3008(var5, var3, var2, var1); // L: 76
		var2.method2907(var5); // L: 77
		var5.method7795(); // L: 78
	} // L: 79

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Loj;ILdt;II)V",
		garbageValue = "826275338"
	)
	void method3007(class410 var1, int var2, class123 var3, int var4) {
		float[] var5 = var3.method2909(this.field1609); // L: 82
		float var6 = var5[0]; // L: 83
		float var7 = var5[1]; // L: 84
		float var8 = var5[2]; // L: 85
		if (this.field1605[var2] != null) { // L: 86
			class125 var9 = this.field1605[var2][0]; // L: 87
			class125 var10 = this.field1605[var2][1]; // L: 88
			class125 var11 = this.field1605[var2][2]; // L: 89
			if (var9 != null) { // L: 90
				var6 = var9.method2966(var4);
			}

			if (var10 != null) { // L: 91
				var7 = var10.method2966(var4);
			}

			if (var11 != null) { // L: 92
				var8 = var11.method2966(var4);
			}
		}

		class409 var16 = SpotAnimationDefinition.method3751(); // L: 94
		var16.method7758(1.0F, 0.0F, 0.0F, var6); // L: 95
		class409 var14 = SpotAnimationDefinition.method3751(); // L: 96
		var14.method7758(0.0F, 1.0F, 0.0F, var7); // L: 97
		class409 var15 = SpotAnimationDefinition.method3751(); // L: 98
		var15.method7758(0.0F, 0.0F, 1.0F, var8); // L: 99
		class409 var12 = SpotAnimationDefinition.method3751(); // L: 100
		var12.method7760(var15); // L: 101
		var12.method7760(var16); // L: 102
		var12.method7760(var14); // L: 103
		class410 var13 = class326.method6395(); // L: 104
		var13.method7789(var12); // L: 105
		var1.method7788(var13); // L: 106
		var16.method7775(); // L: 107
		var14.method7775(); // L: 108
		var15.method7775(); // L: 109
		var12.method7775(); // L: 110
		var13.method7795(); // L: 111
	} // L: 112

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Loj;ILdt;II)V",
		garbageValue = "704346834"
	)
	void method3008(class410 var1, int var2, class123 var3, int var4) {
		float[] var5 = var3.method2910(this.field1609); // L: 115
		float var6 = var5[0]; // L: 116
		float var7 = var5[1]; // L: 117
		float var8 = var5[2]; // L: 118
		if (this.field1605[var2] != null) { // L: 119
			class125 var9 = this.field1605[var2][3]; // L: 120
			class125 var10 = this.field1605[var2][4]; // L: 121
			class125 var11 = this.field1605[var2][5]; // L: 122
			if (var9 != null) { // L: 123
				var6 = var9.method2966(var4);
			}

			if (var10 != null) { // L: 124
				var7 = var10.method2966(var4);
			}

			if (var11 != null) { // L: 125
				var8 = var11.method2966(var4);
			}
		}

		var1.field4612[12] = var6; // L: 127
		var1.field4612[13] = var7; // L: 128
		var1.field4612[14] = var8; // L: 129
	} // L: 130

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Loj;ILdt;II)V",
		garbageValue = "292297142"
	)
	void method3009(class410 var1, int var2, class123 var3, int var4) {
		float[] var5 = var3.method2911(this.field1609); // L: 133
		float var6 = var5[0]; // L: 134
		float var7 = var5[1]; // L: 135
		float var8 = var5[2]; // L: 136
		if (this.field1605[var2] != null) { // L: 137
			class125 var9 = this.field1605[var2][6]; // L: 138
			class125 var10 = this.field1605[var2][7]; // L: 139
			class125 var11 = this.field1605[var2][8]; // L: 140
			if (var9 != null) { // L: 141
				var6 = var9.method2966(var4);
			}

			if (var10 != null) { // L: 142
				var7 = var10.method2966(var4);
			}

			if (var11 != null) { // L: 143
				var8 = var11.method2966(var4);
			}
		}

		class410 var12 = class326.method6395(); // L: 145
		var12.method7786(var6, var7, var8); // L: 146
		var1.method7788(var12); // L: 147
		var12.method7795(); // L: 148
	} // L: 149

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lbv;",
		garbageValue = "21"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 35
		return var2.getMessage(var1); // L: 36
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "-1832346450"
	)
	static Object method3031(int var0) {
		return class346.method6683((class456)World.findEnumerated(class456.method8407(), var0)); // L: 5128
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1852132705"
	)
	static final void method3029() {
		for (int var0 = 0; var0 < Client.soundEffectCount; ++var0) { // L: 3389
			int var10002 = Client.queuedSoundEffectDelays[var0]--; // L: 3390
			if (Client.queuedSoundEffectDelays[var0] >= -10) { // L: 3391
				SoundEffect var1 = Client.soundEffects[var0]; // L: 3403
				if (var1 == null) { // L: 3404
					Object var10000 = null; // L: 3405
					var1 = SoundEffect.readSoundEffect(WorldMapSection0.archive9, Client.soundEffectIds[var0], 0);
					if (var1 == null) { // L: 3406
						continue;
					}

					int[] var12 = Client.queuedSoundEffectDelays; // L: 3407
					var12[var0] += var1.calculateDelay();
					Client.soundEffects[var0] = var1; // L: 3408
				}

				if (Client.queuedSoundEffectDelays[var0] < 0) { // L: 3414
					int var2;
					if (Client.soundLocations[var0] != 0) { // L: 3416
						int var3 = (Client.soundLocations[var0] & 255) * 128; // L: 3417
						int var4 = Client.soundLocations[var0] >> 16 & 255; // L: 3418
						int var5 = var4 * 128 + 64 - class155.localPlayer.x; // L: 3419
						if (var5 < 0) { // L: 3420
							var5 = -var5;
						}

						int var6 = Client.soundLocations[var0] >> 8 & 255; // L: 3421
						int var7 = var6 * 128 + 64 - class155.localPlayer.y; // L: 3422
						if (var7 < 0) { // L: 3423
							var7 = -var7;
						}

						int var8 = var7 + var5 - 128; // L: 3424
						if (var8 > var3) { // L: 3425
							Client.queuedSoundEffectDelays[var0] = -100; // L: 3426
							continue; // L: 3427
						}

						if (var8 < 0) { // L: 3429
							var8 = 0;
						}

						var2 = (var3 - var8) * StructComposition.clientPreferences.method2506() / var3; // L: 3430
					} else {
						var2 = StructComposition.clientPreferences.method2426(); // L: 3432
					}

					if (var2 > 0) { // L: 3433
						RawSound var9 = var1.toRawSound().resample(DevicePcmPlayerProvider.decimator); // L: 3434
						RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var2); // L: 3435
						var10.setNumLoops(Client.queuedSoundEffectLoops[var0] - 1); // L: 3436
						ApproximateRouteStrategy.pcmStreamMixer.addSubStream(var10); // L: 3437
					}

					Client.queuedSoundEffectDelays[var0] = -100; // L: 3439
				}
			} else {
				--Client.soundEffectCount; // L: 3392

				for (int var11 = var0; var11 < Client.soundEffectCount; ++var11) { // L: 3393
					Client.soundEffectIds[var11] = Client.soundEffectIds[var11 + 1]; // L: 3394
					Client.soundEffects[var11] = Client.soundEffects[var11 + 1]; // L: 3395
					Client.queuedSoundEffectLoops[var11] = Client.queuedSoundEffectLoops[var11 + 1]; // L: 3396
					Client.queuedSoundEffectDelays[var11] = Client.queuedSoundEffectDelays[var11 + 1]; // L: 3397
					Client.soundLocations[var11] = Client.soundLocations[var11 + 1]; // L: 3398
				}

				--var0; // L: 3400
			}
		}

		if (Client.playingJingle && !class159.method3345()) { // L: 3442
			if (StructComposition.clientPreferences.method2425() != 0 && Client.currentTrackGroupId != -1) { // L: 3443
				KeyHandler.method426(class162.archive6, Client.currentTrackGroupId, 0, StructComposition.clientPreferences.method2425(), false);
			}

			Client.playingJingle = false; // L: 3444
		}

	} // L: 3446
}
