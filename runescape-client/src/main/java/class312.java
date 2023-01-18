import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lb")
public class class312 {
	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(ZLqx;B)V",
		garbageValue = "7"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field779 = 0; // L: 8275
		Client.field564 = 0; // L: 8276
		var1.importIndex(); // L: 8278
		int var2 = var1.readBits(8); // L: 8279
		int var3;
		if (var2 < Client.npcCount) { // L: 8280
			for (var3 = var2; var3 < Client.npcCount; ++var3) { // L: 8281
				Client.field641[++Client.field779 - 1] = Client.npcIndices[var3];
			}
		}

		if (var2 > Client.npcCount) { // L: 8283
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0; // L: 8284

			int var4;
			int var7;
			int var8;
			int var9;
			for (var3 = 0; var3 < var2; ++var3) { // L: 8285
				var4 = Client.npcIndices[var3]; // L: 8286
				NPC var13 = Client.npcs[var4]; // L: 8287
				int var14 = var1.readBits(1); // L: 8288
				if (var14 == 0) { // L: 8289
					Client.npcIndices[++Client.npcCount - 1] = var4; // L: 8290
					var13.npcCycle = Client.cycle; // L: 8291
				} else {
					var7 = var1.readBits(2); // L: 8294
					if (var7 == 0) { // L: 8295
						Client.npcIndices[++Client.npcCount - 1] = var4; // L: 8296
						var13.npcCycle = Client.cycle; // L: 8297
						Client.field565[++Client.field564 - 1] = var4; // L: 8298
					} else if (var7 == 1) { // L: 8301
						Client.npcIndices[++Client.npcCount - 1] = var4; // L: 8302
						var13.npcCycle = Client.cycle; // L: 8303
						var8 = var1.readBits(3); // L: 8304
						var13.method2533(var8, class204.field2355); // L: 8305
						var9 = var1.readBits(1); // L: 8306
						if (var9 == 1) { // L: 8307
							Client.field565[++Client.field564 - 1] = var4;
						}
					} else if (var7 == 2) { // L: 8310
						Client.npcIndices[++Client.npcCount - 1] = var4; // L: 8311
						var13.npcCycle = Client.cycle; // L: 8312
						if (var1.readBits(1) == 1) { // L: 8313
							var8 = var1.readBits(3); // L: 8314
							var13.method2533(var8, class204.field2357); // L: 8315
							var9 = var1.readBits(3); // L: 8316
							var13.method2533(var9, class204.field2357); // L: 8317
						} else {
							var8 = var1.readBits(3); // L: 8320
							var13.method2533(var8, class204.field2356); // L: 8321
						}

						var8 = var1.readBits(1); // L: 8323
						if (var8 == 1) { // L: 8324
							Client.field565[++Client.field564 - 1] = var4;
						}
					} else if (var7 == 3) { // L: 8327
						Client.field641[++Client.field779 - 1] = var4; // L: 8328
					}
				}
			}

			while (true) {
				var2 = ParamComposition.field2121 ? 16 : 15; // L: 8335
				var3 = 1 << var2; // L: 8336
				if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) < var2 + 12) { // L: 8337
					break;
				}

				var4 = var1.readBits(var2); // L: 8338
				if (var4 == var3 - 1) { // L: 8339
					break;
				}

				boolean var5 = false; // L: 8340
				if (Client.npcs[var4] == null) { // L: 8341
					Client.npcs[var4] = new NPC(); // L: 8342
					var5 = true; // L: 8343
				}

				NPC var6 = Client.npcs[var4]; // L: 8345
				Client.npcIndices[++Client.npcCount - 1] = var4; // L: 8346
				var6.npcCycle = Client.cycle; // L: 8347
				int var10;
				boolean var11;
				int var12;
				if (ParamComposition.field2121) { // L: 8351
					var10 = Client.field645[var1.readBits(3)]; // L: 8352
					if (var5) { // L: 8353
						var6.orientation = var6.rotation = var10;
					}

					var6.definition = class129.getNpcDefinition(var1.readBits(14)); // L: 8354
					if (var0) { // L: 8355
						var9 = var1.readBits(8); // L: 8356
						if (var9 > 127) { // L: 8357
							var9 -= 256;
						}
					} else {
						var9 = var1.readBits(5); // L: 8360
						if (var9 > 15) { // L: 8361
							var9 -= 32;
						}
					}

					var7 = var1.readBits(1); // L: 8363
					if (var0) { // L: 8364
						var8 = var1.readBits(8); // L: 8365
						if (var8 > 127) { // L: 8366
							var8 -= 256;
						}
					} else {
						var8 = var1.readBits(5); // L: 8369
						if (var8 > 15) { // L: 8370
							var8 -= 32;
						}
					}

					var11 = var1.readBits(1) == 1; // L: 8372
					if (var11) { // L: 8373
						var1.readBits(32); // L: 8374
					}

					var12 = var1.readBits(1); // L: 8376
					if (var12 == 1) { // L: 8377
						Client.field565[++Client.field564 - 1] = var4;
					}
				} else {
					if (var0) { // L: 8380
						var9 = var1.readBits(8); // L: 8381
						if (var9 > 127) { // L: 8382
							var9 -= 256;
						}
					} else {
						var9 = var1.readBits(5); // L: 8385
						if (var9 > 15) { // L: 8386
							var9 -= 32;
						}
					}

					var10 = var1.readBits(1); // L: 8388
					if (var10 == 1) { // L: 8389
						Client.field565[++Client.field564 - 1] = var4;
					}

					var11 = var1.readBits(1) == 1; // L: 8390
					if (var11) { // L: 8391
						var1.readBits(32); // L: 8392
					}

					var6.definition = class129.getNpcDefinition(var1.readBits(14)); // L: 8394
					if (var0) { // L: 8395
						var8 = var1.readBits(8); // L: 8396
						if (var8 > 127) { // L: 8397
							var8 -= 256;
						}
					} else {
						var8 = var1.readBits(5); // L: 8400
						if (var8 > 15) { // L: 8401
							var8 -= 32;
						}
					}

					var7 = var1.readBits(1); // L: 8403
					var12 = Client.field645[var1.readBits(3)]; // L: 8404
					if (var5) { // L: 8405
						var6.orientation = var6.rotation = var12;
					}
				}

				GameObject.method4832(var6); // L: 8407
				var6.method2534(class155.localPlayer.pathX[0] + var8, class155.localPlayer.pathY[0] + var9, var7 == 1); // L: 8408
			}

			var1.exportIndex(); // L: 8410
			class1.method7(var1); // L: 8412

			for (var2 = 0; var2 < Client.field779; ++var2) { // L: 8413
				var3 = Client.field641[var2]; // L: 8414
				if (Client.npcs[var3].npcCycle != Client.cycle) { // L: 8415
					Client.npcs[var3].definition = null; // L: 8416
					Client.npcs[var3] = null; // L: 8417
				}
			}

			if (var1.offset != Client.packetWriter.serverPacketLength) { // L: 8420
				throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength); // L: 8421
			} else {
				for (var2 = 0; var2 < Client.npcCount; ++var2) { // L: 8423
					if (Client.npcs[Client.npcIndices[var2]] == null) { // L: 8424
						throw new RuntimeException(var2 + "," + Client.npcCount); // L: 8425
					}
				}

			}
		}
	} // L: 8428
}
