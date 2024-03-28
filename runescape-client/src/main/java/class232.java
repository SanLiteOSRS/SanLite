import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iz")
public class class232 {
	@ObfuscatedName("az")
	final int[][] field2476;
	@ObfuscatedName("ah")
	final int[][] field2479;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1247409161
	)
	int field2481;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1078506777
	)
	int field2477;
	@ObfuscatedName("an")
	final int[] field2478;
	@ObfuscatedName("ao")
	final int[] field2474;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1133988185
	)
	final int field2480;

	class232(int var1, int var2) {
		this.field2476 = new int[var1][var2]; // L: 15
		this.field2479 = new int[var1][var2]; // L: 16
		int var3 = var2 * var1; // L: 17
		int var4 = class193.method3722(var3 / 4); // L: 18
		this.field2478 = new int[var4]; // L: 19
		this.field2474 = new int[var4]; // L: 20
		this.field2480 = var4 - 1; // L: 21
	} // L: 22

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "118"
	)
	void method4401() {
		for (int var1 = 0; var1 < this.field2476.length; ++var1) { // L: 25
			for (int var2 = 0; var2 < this.field2476[var1].length; ++var2) { // L: 26
				this.field2476[var1][var2] = 0; // L: 27
				this.field2479[var1][var2] = 99999999; // L: 28
			}
		}

	} // L: 31

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "102"
	)
	void method4402(int var1, int var2) {
		this.field2481 = var1; // L: 34
		this.field2477 = var2; // L: 35
	} // L: 36

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "89"
	)
	int method4403() {
		return this.field2481; // L: 39
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1903798289"
	)
	int method4404() {
		return this.field2477; // L: 43
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1073721780"
	)
	int method4405() {
		return this.field2476.length; // L: 47
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1563145756"
	)
	int method4400() {
		return this.field2476[0].length; // L: 51
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "2132677962"
	)
	int[][] method4406() {
		return this.field2476; // L: 55
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "-334912628"
	)
	int[][] method4427() {
		return this.field2479; // L: 59
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)[I",
		garbageValue = "11830"
	)
	int[] method4409() {
		return this.field2478; // L: 63
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-2088099832"
	)
	int[] method4428() {
		return this.field2474; // L: 67
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "45"
	)
	int method4430() {
		return this.field2480; // L: 71
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(Llk;I)V",
		garbageValue = "907453280"
	)
	static final void method4433(class311 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer; // L: 8176
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var11;
		int var22;
		int var23;
		int var25;
		if (class311.field3312 == var0) { // L: 8177
			var22 = var1.method9321(); // L: 8178
			var23 = var1.method9298(); // L: 8179
			var4 = (var23 >> 4 & 7) + ModelData0.field2905; // L: 8180
			var5 = (var23 & 7) + class332.field3602; // L: 8181
			var6 = var1.method9300(); // L: 8182
			var7 = var6 >> 2; // L: 8183
			var8 = var6 & 3; // L: 8184
			var9 = Client.field586[var7]; // L: 8185
			var25 = var1.method9300(); // L: 8186
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 8187
				var11 = Client.field587 == -1 ? class172.Client_plane : Client.field587; // L: 8188
				class332.method6230(var11, var4, var5, var9, var22, var7, var8, var25, 0, -1); // L: 8189
			}

		} else {
			byte var3;
			int var12;
			int var13;
			int var14;
			int var15;
			if (class311.field3305 == var0) { // L: 8193
				byte var2 = var1.method9316(); // L: 8194
				var3 = var1.method9316(); // L: 8195
				var4 = var1.method9321(); // L: 8196
				var5 = var1.readUnsignedShort(); // L: 8197
				var6 = var1.method9462(); // L: 8198
				var7 = var6 >> 2; // L: 8199
				var8 = var6 & 3; // L: 8200
				var9 = Client.field586[var7]; // L: 8201
				byte var10 = var1.method9316(); // L: 8202
				var11 = var1.method9380(); // L: 8203
				var12 = var1.method9380(); // L: 8204
				var13 = var1.readUnsignedByte(); // L: 8205
				var14 = (var13 >> 4 & 7) + ModelData0.field2905; // L: 8206
				var15 = (var13 & 7) + class332.field3602; // L: 8207
				byte var16 = var1.method9302(); // L: 8208
				Player var17;
				if (var4 == Client.localPlayerIndex) { // L: 8210
					var17 = class133.localPlayer;
				} else {
					var17 = Client.players[var4]; // L: 8211
				}

				if (var17 != null) { // L: 8212
					int var18 = Client.field587 == -1 ? class172.Client_plane : Client.field587; // L: 8213
					class129.method3005(var18, var14, var15, var7, var8, var9, var5, var11, var12, var2, var3, var10, var16, var17); // L: 8214
				}
			}

			if (class311.field3307 == var0) { // L: 8217
				var22 = var1.method9298(); // L: 8218
				var23 = (var22 >> 4 & 7) + ModelData0.field2905; // L: 8219
				var4 = (var22 & 7) + class332.field3602; // L: 8220
				var5 = var1.method9380(); // L: 8221
				var6 = var1.readUnsignedShort(); // L: 8222
				var7 = var1.method9298(); // L: 8223
				if (var23 >= 0 && var4 >= 0 && var23 < 104 && var4 < 104) { // L: 8224
					var23 = var23 * 128 + 64; // L: 8225
					var4 = var4 * 128 + 64; // L: 8226
					var8 = Client.field587 == -1 ? class172.Client_plane : Client.field587; // L: 8227
					GraphicsObject var21 = new GraphicsObject(var6, var8, var23, var4, Canvas.getTileHeight(var23, var4, var8) - var7, var5, Client.cycle); // L: 8228
					Client.graphicsObjects.addFirst(var21); // L: 8229
				}

			} else if (class311.field3310 == var0) { // L: 8233
				var22 = var1.method9462() * 4; // L: 8234
				var3 = var1.method9302(); // L: 8235
				var4 = var1.method9380(); // L: 8236
				var5 = var1.method9380(); // L: 8237
				var6 = var1.method9298() * 4; // L: 8238
				var7 = var1.method9312(); // L: 8239
				var8 = var1.method9313(); // L: 8240
				var9 = var1.method9300(); // L: 8241
				var25 = (var9 >> 4 & 7) + ModelData0.field2905; // L: 8242
				var11 = (var9 & 7) + class332.field3602; // L: 8243
				byte var27 = var1.method9301(); // L: 8244
				var13 = var1.readUnsignedByte(); // L: 8245
				var14 = var1.method9321(); // L: 8246
				var15 = var1.method9380(); // L: 8247
				var12 = var27 + var25; // L: 8248
				var23 = var3 + var11; // L: 8249
				if (var25 >= 0 && var11 >= 0 && var25 < 104 && var11 < 104 && var12 >= 0 && var23 >= 0 && var12 < 104 && var23 < 104 && var14 != 65535) { // L: 8250
					int var28 = Client.field587 == -1 ? class172.Client_plane : Client.field587; // L: 8251
					class156.method3318(var28, var25, var11, var12, var23, var7, var14, var6, var22, var15, var5, var13, var4, var8); // L: 8252
				}

			} else if (class311.field3309 == var0) { // L: 8256
				var22 = var1.readUnsignedByte(); // L: 8257
				var23 = var1.method9318(); // L: 8258
				var4 = var1.method9298(); // L: 8259
				var5 = (var4 >> 4 & 7) + ModelData0.field2905; // L: 8260
				var6 = (var4 & 7) + class332.field3602; // L: 8261
				if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) { // L: 8262
					var7 = Client.field587 == -1 ? class172.Client_plane : Client.field587; // L: 8263
					class6.method42(var7, var5, var6, var23, var22); // L: 8264
				}

			} else if (class311.field3306 == var0) { // L: 8268
				var22 = var1.method9321(); // L: 8269
				var23 = var1.readUnsignedByte(); // L: 8270
				var4 = var23 >> 2; // L: 8271
				var5 = var23 & 3; // L: 8272
				var6 = Client.field586[var4]; // L: 8273
				var7 = var1.method9300(); // L: 8274
				var8 = (var7 >> 4 & 7) + ModelData0.field2905; // L: 8275
				var9 = (var7 & 7) + class332.field3602; // L: 8276
				if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) { // L: 8277
					var25 = Client.field587 == -1 ? class172.Client_plane : Client.field587; // L: 8278
					PendingSpawn var19 = Message.method1178(var25, var8, var9, var6); // L: 8279
					if (var19 != null) { // L: 8280
						ObjectComposition var20 = MouseRecorder.getObjectDefinition(var19.field1198); // L: 8281
						if (var20.field2297) { // L: 8282
							var19.field1192 = var22; // L: 8283
							return; // L: 8284
						}
					}

					boolean var26 = HorizontalAlignment.method3853(var25, var8, var9, var4, var5, var6, var22); // L: 8287
					if (var26) { // L: 8288
						return; // L: 8289
					}

					if (var19 != null) { // L: 8291
						var19.field1192 = var22; // L: 8292
					}
				}

			} else if (class311.field3311 == var0) { // L: 8297
				var22 = var1.method9380(); // L: 8298
				var23 = var1.method9300(); // L: 8299
				var4 = (var23 >> 4 & 7) + ModelData0.field2905; // L: 8300
				var5 = (var23 & 7) + class332.field3602; // L: 8301
				var6 = var1.method9300(); // L: 8302
				var7 = var1.method9298() & 31; // L: 8303
				var8 = var1.method9298(); // L: 8304
				var9 = var1.method9298(); // L: 8305
				if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 8306
					var25 = var7 + 1; // L: 8307
					if (class133.localPlayer.pathX[0] >= var4 - var25 && class133.localPlayer.pathX[0] <= var4 + var25 && class133.localPlayer.pathY[0] >= var5 - var25 && class133.localPlayer.pathY[0] <= var25 + var5 && NPC.clientPreferences.method2475() != 0 && var6 > 0 && Client.soundEffectCount < 50) { // L: 8308 8309
						Client.soundEffectIds[Client.soundEffectCount] = var22; // L: 8310
						Client.soundEffects[Client.soundEffectCount] = null; // L: 8311
						Client.soundLocations[Client.soundEffectCount] = var7 + (var5 << 8) + (var4 << 16); // L: 8312
						Client.queuedSoundEffectLoops[Client.soundEffectCount] = var6; // L: 8313
						Client.queuedSoundEffectDelays[Client.soundEffectCount] = var8; // L: 8314
						Client.field770[Client.soundEffectCount] = var9; // L: 8315
						++Client.soundEffectCount; // L: 8316
					}
				}

			} else if (class311.field3314 == var0) { // L: 8322
				var22 = var1.method9317(); // L: 8323
				var23 = var1.method9318(); // L: 8324
				var4 = var1.method9380(); // L: 8325
				var5 = var1.method9321(); // L: 8326
				var6 = var1.readUnsignedByte(); // L: 8327
				var7 = var1.method9298(); // L: 8328
				boolean var24 = var1.readUnsignedByte() == 1; // L: 8329
				var9 = var1.method9298(); // L: 8330
				var25 = (var9 >> 4 & 7) + ModelData0.field2905; // L: 8331
				var11 = (var9 & 7) + class332.field3602; // L: 8332
				if (var25 >= 0 && var11 >= 0 && var25 < 104 && var11 < 104) { // L: 8333
					var12 = Client.field587 == -1 ? class172.Client_plane : Client.field587; // L: 8334
					class499.method8670(var12, var25, var11, var4, var22, var7, var23, var5, var6, var24); // L: 8335
				}

			} else if (class311.field3308 == var0) { // L: 8339
				var22 = var1.method9300(); // L: 8340
				var23 = (var22 >> 4 & 7) + ModelData0.field2905; // L: 8341
				var4 = (var22 & 7) + class332.field3602; // L: 8342
				var5 = var1.method9300(); // L: 8343
				var6 = var5 >> 2; // L: 8344
				var7 = var5 & 3; // L: 8345
				var8 = Client.field586[var6]; // L: 8346
				if (var23 >= 0 && var4 >= 0 && var23 < 104 && var4 < 104) { // L: 8347
					var9 = Client.field587 == -1 ? class172.Client_plane : Client.field587; // L: 8348
					class332.method6230(var9, var23, var4, var8, -1, var6, var7, 31, 0, -1); // L: 8349
				}

			} else if (class311.field3304 == var0) { // L: 8353
				var22 = var1.method9462(); // L: 8354
				var23 = (var22 >> 4 & 7) + ModelData0.field2905; // L: 8355
				var4 = (var22 & 7) + class332.field3602; // L: 8356
				var5 = var1.method9317(); // L: 8357
				var6 = var1.method9321(); // L: 8358
				var7 = var1.method9335(); // L: 8359
				if (var23 >= 0 && var4 >= 0 && var23 < 104 && var4 < 104) { // L: 8360
					var8 = Client.field587 == -1 ? class172.Client_plane : Client.field587; // L: 8361
					class13.method170(var8, var23, var4, var6, var7, var5); // L: 8362
				}

			} else if (class311.field3302 == var0) { // L: 8366
				var22 = var1.method9317(); // L: 8367
				var23 = var1.method9300(); // L: 8368
				var4 = (var23 >> 4 & 7) + ModelData0.field2905; // L: 8369
				var5 = (var23 & 7) + class332.field3602; // L: 8370
				var6 = var1.method9380(); // L: 8371
				if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 8372
					var7 = Client.field587 == -1 ? class172.Client_plane : Client.field587; // L: 8373
					MusicPatchNode.method6224(var7, var4, var5, var6, var22); // L: 8374
				}

			}
		}
	} // L: 8191 8231 8254 8266 8295 8320 8337 8351 8364 8376 8378
}
