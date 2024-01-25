import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
@Implements("WallObject")
public final class WallObject {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lbo;"
	)
	@Export("pcmPlayerProvider")
	public static class51 pcmPlayerProvider;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1081028821
	)
	@Export("z")
	int z;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -977526839
	)
	@Export("x")
	int x;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 756234425
	)
	@Export("y")
	int y;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2073889549
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1987297085
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = -8745652971025510383L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2055775521
	)
	@Export("flags")
	int flags;

	WallObject() {
		this.tag = 0L; // L: 11
		this.flags = 0; // L: 12
	} // L: 14

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(Llz;I)V",
		garbageValue = "-151690096"
	)
	static final void method5888(class309 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer; // L: 8133
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		if (class309.field3273 == var0) { // L: 8134
			var2 = var1.readUnsignedByte(); // L: 8135
			var3 = var1.method9419(); // L: 8136
			var4 = var3 >> 2; // L: 8137
			var5 = var3 & 3; // L: 8138
			var6 = Client.field574[var4]; // L: 8139
			var7 = var1.method9526(); // L: 8140
			var8 = (var7 >> 4 & 7) + class187.field1944; // L: 8141
			var9 = (var7 & 7) + class235.field2478; // L: 8142
			var10 = var1.method9430(); // L: 8143
			if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) { // L: 8144
				var11 = Client.field652 == -1 ? class113.Client_plane : Client.field652; // L: 8145
				class482.method8736(var11, var8, var9, var6, var10, var4, var5, var2, 0, -1); // L: 8146
			}

		} else if (class309.field3274 == var0) { // L: 8150
			var2 = var1.method9398(); // L: 8151
			var3 = var1.method9526(); // L: 8152
			var4 = (var3 >> 4 & 7) + class187.field1944; // L: 8153
			var5 = (var3 & 7) + class235.field2478; // L: 8154
			var6 = var1.method9526(); // L: 8155
			var7 = var6 >> 2; // L: 8156
			var8 = var6 & 3; // L: 8157
			var9 = Client.field574[var7]; // L: 8158
			if (var4 >= 0 && var5 >= 0 && var4 < 103 && var5 < 103) { // L: 8159
				var10 = Client.field652 == -1 ? class113.Client_plane : Client.field652; // L: 8160
				boolean var25 = class167.method3538(var10, var4, var5, var7, var8, var9, var2); // L: 8161
				if (var25) { // L: 8162
					return; // L: 8163
				}

				MidiPcmStream.method6149(var10, var4, var5, var9, var2); // L: 8165
			}

		} else if (class309.field3264 == var0) { // L: 8169
			var2 = var1.method9526(); // L: 8170
			var3 = (var2 >> 4 & 7) + class187.field1944; // L: 8171
			var4 = (var2 & 7) + class235.field2478; // L: 8172
			var5 = var1.method9442(); // L: 8173
			var6 = var1.method9442(); // L: 8174
			var7 = var1.method9398(); // L: 8175
			if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 8176
				var8 = Client.field652 == -1 ? class113.Client_plane : Client.field652; // L: 8177
				class4.method16(var8, var3, var4, var7, var5, var6); // L: 8178
			}

		} else {
			int var12;
			if (class309.field3266 == var0) { // L: 8182
				var2 = var1.method9526(); // L: 8183
				boolean var20 = var1.method9419() == 1; // L: 8184
				var4 = var1.readUnsignedShort(); // L: 8185
				var5 = var1.method9441(); // L: 8186
				var6 = var1.method9526(); // L: 8187
				var7 = var1.method9538(); // L: 8188
				var8 = var1.method9526(); // L: 8189
				var9 = (var8 >> 4 & 7) + class187.field1944; // L: 8190
				var10 = (var8 & 7) + class235.field2478; // L: 8191
				var11 = var1.method9538(); // L: 8192
				if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) { // L: 8193
					var12 = Client.field652 == -1 ? class113.Client_plane : Client.field652; // L: 8194
					PcmPlayer.method859(var12, var9, var10, var7, var5, var6, var4, var11, var2, var20); // L: 8195
				}

			} else {
				int var13;
				int var14;
				int var15;
				byte var23;
				if (class309.field3263 == var0) { // L: 8199
					var2 = var1.method9436(); // L: 8200
					var3 = var1.method9538(); // L: 8201
					var4 = var1.method9526(); // L: 8202
					byte var21 = var1.readByte(); // L: 8203
					var6 = var1.method9430(); // L: 8204
					var7 = var1.method9430(); // L: 8205
					var8 = var1.method9398(); // L: 8206
					var23 = var1.readByte(); // L: 8207
					var10 = var1.method9420() * 4; // L: 8208
					var11 = var1.method9526() * 4; // L: 8209
					var12 = var1.method9436(); // L: 8210
					var13 = var1.method9526(); // L: 8211
					var14 = (var13 >> 4 & 7) + class187.field1944; // L: 8212
					var15 = (var13 & 7) + class235.field2478; // L: 8213
					var5 = var21 + var14; // L: 8214
					var9 = var23 + var15; // L: 8215
					if (var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104 && var5 >= 0 && var9 >= 0 && var5 < 104 && var9 < 104 && var3 != 65535) { // L: 8216
						int var26 = Client.field652 == -1 ? class113.Client_plane : Client.field652; // L: 8217
						BufferedFile.method9180(var26, var14, var15, var5, var9, var2, var3, var11, var10, var7, var6, var4, var8, var12); // L: 8218
					}

				} else if (class309.field3269 == var0) { // L: 8222
					var2 = var1.method9419(); // L: 8223
					var3 = (var2 >> 4 & 7) + class187.field1944; // L: 8224
					var4 = (var2 & 7) + class235.field2478; // L: 8225
					var5 = var1.method9420(); // L: 8226
					var6 = var5 >> 2; // L: 8227
					var7 = var5 & 3; // L: 8228
					var8 = Client.field574[var6]; // L: 8229
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 8230
						var9 = Client.field652 == -1 ? class113.Client_plane : Client.field652; // L: 8231
						class482.method8736(var9, var3, var4, var8, -1, var6, var7, 31, 0, -1); // L: 8232
					}

				} else if (class309.field3268 == var0) { // L: 8236
					var2 = var1.method9430(); // L: 8237
					var3 = var1.method9526(); // L: 8238
					var4 = (var3 >> 4 & 7) + class187.field1944; // L: 8239
					var5 = (var3 & 7) + class235.field2478; // L: 8240
					var6 = var1.readInt(); // L: 8241
					if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 8242
						var7 = Client.field652 == -1 ? class113.Client_plane : Client.field652; // L: 8243
						WorldMapSprite.method5027(var7, var4, var5, var2, var6); // L: 8244
					}

				} else {
					if (class309.field3271 == var0) { // L: 8248
						var2 = var1.method9420(); // L: 8249
						var3 = var1.method9419(); // L: 8250
						var4 = (var3 >> 4 & 7) + class187.field1944; // L: 8251
						var5 = (var3 & 7) + class235.field2478; // L: 8252
						var6 = var1.method9419(); // L: 8253
						var7 = var6 >> 4 & 15; // L: 8254
						var8 = var6 & 7; // L: 8255
						var9 = var1.method9398(); // L: 8256
						if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 8257
							var10 = var7 + 1; // L: 8258
							if (class25.localPlayer.pathX[0] >= var4 - var10 && class25.localPlayer.pathX[0] <= var10 + var4 && class25.localPlayer.pathY[0] >= var5 - var10 && class25.localPlayer.pathY[0] <= var10 + var5 && class93.clientPreferences.method2551() != 0 && var8 > 0 && Client.soundEffectCount < 50) { // L: 8259 8260
								Client.soundEffectIds[Client.soundEffectCount] = var9; // L: 8261
								Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8; // L: 8262
								Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 8263
								Client.soundEffects[Client.soundEffectCount] = null; // L: 8264
								Client.soundLocations[Client.soundEffectCount] = var7 + (var5 << 8) + (var4 << 16); // L: 8265
								++Client.soundEffectCount; // L: 8266
							}
						}
					}

					if (class309.field3265 == var0) { // L: 8271
						var2 = var1.method9538(); // L: 8272
						var3 = var1.method9420(); // L: 8273
						var4 = var1.method9526(); // L: 8274
						var5 = (var4 >> 4 & 7) + class187.field1944; // L: 8275
						var6 = (var4 & 7) + class235.field2478; // L: 8276
						var7 = var1.readUnsignedShort(); // L: 8277
						if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) { // L: 8278
							var5 = var5 * 128 + 64; // L: 8279
							var6 = var6 * 128 + 64; // L: 8280
							var8 = Client.field652 == -1 ? class113.Client_plane : Client.field652; // L: 8281
							GraphicsObject var19 = new GraphicsObject(var2, var8, var5, var6, class19.getTileHeight(var5, var6, var8) - var3, var7, Client.cycle); // L: 8282
							Client.graphicsObjects.addFirst(var19); // L: 8283
						}

					} else if (class309.field3267 == var0) { // L: 8287
						var2 = var1.method9419(); // L: 8288
						var3 = (var2 >> 4 & 7) + class187.field1944; // L: 8289
						var4 = (var2 & 7) + class235.field2478; // L: 8290
						var5 = var1.method9420(); // L: 8291
						var6 = var1.method9430(); // L: 8292
						if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 8293
							var7 = Client.field652 == -1 ? class113.Client_plane : Client.field652; // L: 8294
							ScriptFrame.method1204(var7, var3, var4, var6, var5); // L: 8295
						}

					} else {
						if (class309.field3270 == var0) { // L: 8299
							var2 = var1.method9538(); // L: 8300
							var3 = var1.readUnsignedShort(); // L: 8301
							var4 = var1.method9538(); // L: 8302
							var5 = var1.readUnsignedByte(); // L: 8303
							var6 = (var5 >> 4 & 7) + class187.field1944; // L: 8304
							var7 = (var5 & 7) + class235.field2478; // L: 8305
							byte var22 = var1.method9423(); // L: 8306
							var23 = var1.method9423(); // L: 8307
							byte var24 = var1.method9422(); // L: 8308
							var11 = var1.readUnsignedByte(); // L: 8309
							var12 = var11 >> 2; // L: 8310
							var13 = var11 & 3; // L: 8311
							var14 = Client.field574[var12]; // L: 8312
							var15 = var1.readUnsignedShort(); // L: 8313
							byte var16 = var1.method9446(); // L: 8314
							Player var17;
							if (var4 == Client.localPlayerIndex) { // L: 8316
								var17 = class25.localPlayer;
							} else {
								var17 = Client.players[var4]; // L: 8317
							}

							if (var17 != null) { // L: 8318
								int var18 = Client.field652 == -1 ? class113.Client_plane : Client.field652; // L: 8319
								class31.method466(var18, var6, var7, var12, var13, var14, var3, var2, var15, var23, var22, var24, var16, var17); // L: 8320
							}
						}

					}
				}
			}
		}
	} // L: 8148 8167 8180 8197 8220 8234 8246 8285 8297 8323
}
