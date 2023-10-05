import java.lang.management.GarbageCollectorMXBean;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oc")
@Implements("GrandExchangeOfferTotalQuantityComparator")
final class GrandExchangeOfferTotalQuantityComparator implements Comparator {
	@ObfuscatedName("bl")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lod;Lod;I)I",
		garbageValue = "1700442227"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.totalQuantity < var2.grandExchangeOffer.totalQuantity ? -1 : (var2.grandExchangeOffer.totalQuantity == var1.grandExchangeOffer.totalQuantity ? 0 : 1); // L: 69
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 77
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 73
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "1674214518"
	)
	public static final synchronized long method7049() {
		long var0 = System.currentTimeMillis(); // L: 14
		if (var0 < class135.field1592) { // L: 15
			class315.field3405 += class135.field1592 - var0; // L: 16
		}

		class135.field1592 = var0; // L: 18
		return var0 + class315.field3405; // L: 19
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lve;"
	)
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) { // L: 100
			var2 = (RunException)var0; // L: 101
			var2.message = var2.message + ' ' + var1; // L: 102
		} else {
			var2 = new RunException(var0, var1); // L: 104
		}

		return var2; // L: 105
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Luy;B)V",
		garbageValue = "-47"
	)
	static final void method7048(PacketBuffer var0) {
		int var1 = 0; // L: 338
		var0.importIndex(); // L: 339

		byte[] var10000;
		int var2;
		int var4;
		int var5;
		for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 340
			var5 = Players.Players_indices[var2]; // L: 341
			if ((Players.field1377[var5] & 1) == 0) { // L: 342
				if (var1 > 0) { // L: 343
					--var1; // L: 344
					var10000 = Players.field1377; // L: 345
					var10000[var5] = (byte)(var10000[var5] | 2);
				} else {
					var4 = var0.readBits(1); // L: 348
					if (var4 == 0) { // L: 349
						var1 = class108.method2739(var0); // L: 350
						var10000 = Players.field1377; // L: 351
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						WorldMapSectionType.readPlayerUpdate(var0, var5); // L: 354
					}
				}
			}
		}

		var0.exportIndex(); // L: 357
		if (var1 != 0) { // L: 358
			throw new RuntimeException(); // L: 359
		} else {
			var0.importIndex(); // L: 361

			for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 362
				var5 = Players.Players_indices[var2]; // L: 363
				if ((Players.field1377[var5] & 1) != 0) { // L: 364
					if (var1 > 0) { // L: 365
						--var1; // L: 366
						var10000 = Players.field1377; // L: 367
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						var4 = var0.readBits(1); // L: 370
						if (var4 == 0) { // L: 371
							var1 = class108.method2739(var0); // L: 372
							var10000 = Players.field1377; // L: 373
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							WorldMapSectionType.readPlayerUpdate(var0, var5); // L: 376
						}
					}
				}
			}

			var0.exportIndex(); // L: 379
			if (var1 != 0) { // L: 380
				throw new RuntimeException(); // L: 381
			} else {
				var0.importIndex(); // L: 383

				for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) { // L: 384
					var5 = Players.Players_emptyIndices[var2]; // L: 385
					if ((Players.field1377[var5] & 1) != 0) { // L: 386
						if (var1 > 0) { // L: 387
							--var1; // L: 388
							var10000 = Players.field1377; // L: 389
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							var4 = var0.readBits(1); // L: 392
							if (var4 == 0) { // L: 393
								var1 = class108.method2739(var0); // L: 394
								var10000 = Players.field1377; // L: 395
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else if (class304.updateExternalPlayer(var0, var5)) { // L: 398
								var10000 = Players.field1377;
								var10000[var5] = (byte)(var10000[var5] | 2);
							}
						}
					}
				}

				var0.exportIndex(); // L: 401
				if (var1 != 0) { // L: 402
					throw new RuntimeException(); // L: 403
				} else {
					var0.importIndex(); // L: 405

					for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) { // L: 406
						var5 = Players.Players_emptyIndices[var2]; // L: 407
						if ((Players.field1377[var5] & 1) == 0) { // L: 408
							if (var1 > 0) { // L: 409
								--var1; // L: 410
								var10000 = Players.field1377; // L: 411
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else {
								var4 = var0.readBits(1); // L: 414
								if (var4 == 0) { // L: 415
									var1 = class108.method2739(var0); // L: 416
									var10000 = Players.field1377; // L: 417
									var10000[var5] = (byte)(var10000[var5] | 2);
								} else if (class304.updateExternalPlayer(var0, var5)) { // L: 420
									var10000 = Players.field1377;
									var10000[var5] = (byte)(var10000[var5] | 2);
								}
							}
						}
					}

					var0.exportIndex(); // L: 423
					if (var1 != 0) { // L: 424
						throw new RuntimeException(); // L: 425
					} else {
						Players.Players_count = 0; // L: 427
						Players.Players_emptyIdxCount = 0; // L: 428

						for (var2 = 1; var2 < 2048; ++var2) { // L: 429
							var10000 = Players.field1377; // L: 430
							var10000[var2] = (byte)(var10000[var2] >> 1);
							Player var3 = Client.players[var2]; // L: 431
							if (var3 != null) { // L: 432
								Players.Players_indices[++Players.Players_count - 1] = var2;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var2; // L: 433
							}
						}

					}
				}
			}
		}
	} // L: 435

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-29"
	)
	static final boolean method7050() {
		return ViewportMouse.ViewportMouse_isInViewport; // L: 113
	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1235379718"
	)
	static void method7051(int var0, String var1) {
		int var2 = Players.Players_count; // L: 10106
		int[] var3 = Players.Players_indices; // L: 10107
		boolean var4 = false; // L: 10108
		Username var5 = new Username(var1, class166.loginType); // L: 10109

		for (int var6 = 0; var6 < var2; ++var6) { // L: 10110
			Player var7 = Client.players[var3[var6]]; // L: 10111
			if (var7 != null && var7 != TextureProvider.localPlayer && var7.username != null && var7.username.equals(var5)) { // L: 10112
				PacketBufferNode var8;
				if (var0 == 1) { // L: 10113
					var8 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3142, Client.packetWriter.isaacCipher); // L: 10115
					var8.packetBuffer.method9323(0); // L: 10116
					var8.packetBuffer.method9243(var3[var6]); // L: 10117
					Client.packetWriter.addNode(var8); // L: 10118
				} else if (var0 == 4) { // L: 10120
					var8 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3199, Client.packetWriter.isaacCipher); // L: 10122
					var8.packetBuffer.method9243(var3[var6]); // L: 10123
					var8.packetBuffer.method9234(0); // L: 10124
					Client.packetWriter.addNode(var8); // L: 10125
				} else if (var0 == 6) { // L: 10127
					var8 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3182, Client.packetWriter.isaacCipher); // L: 10129
					var8.packetBuffer.method9234(0); // L: 10130
					var8.packetBuffer.method9344(var3[var6]); // L: 10131
					Client.packetWriter.addNode(var8); // L: 10132
				} else if (var0 == 7) { // L: 10134
					var8 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3210, Client.packetWriter.isaacCipher); // L: 10136
					var8.packetBuffer.writeByte(0); // L: 10137
					var8.packetBuffer.writeShort(var3[var6]); // L: 10138
					Client.packetWriter.addNode(var8); // L: 10139
				}

				var4 = true; // L: 10141
				break;
			}
		}

		if (!var4) { // L: 10145
			class411.addGameMessage(4, "", "Unable to find " + var1);
		}

	} // L: 10146
}
