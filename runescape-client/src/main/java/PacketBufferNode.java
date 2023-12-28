import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ld")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lld;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1591179597
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("clientPacket")
	ClientPacket clientPacket;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1596400087
	)
	@Export("clientPacketLength")
	int clientPacketLength;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Luo;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1934564091
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300]; // L: 13
		PacketBufferNode_packetBufferNodeCount = 0; // L: 14
	}

	PacketBufferNode() {
	} // L: 19

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1380070255"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) { // L: 58
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this; // L: 59
		}
	} // L: 60

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1877979689"
	)
	public static int method5929(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383; // L: 24
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1854762565"
	)
	static void method5917(boolean var0) {
		if (var0) { // L: 252
			SecureRandomCallable.method2326(); // L: 253
		} else {
			for (int var1 = 0; var1 < class316.field3422.size(); ++var1) { // L: 256
				class328 var2 = (class328)class316.field3422.get(var1); // L: 257
				if (var2 == null) { // L: 258
					class316.field3422.remove(var1); // L: 259
					--var1; // L: 260
				} else if (var2.field3526) { // L: 262
					if (var2.field3522.field3455 > 0) { // L: 263
						--var2.field3522.field3455; // L: 264
					}

					var2.field3522.clear(); // L: 266
					var2.field3522.method6011(); // L: 267
					var2.field3522.setPcmStreamVolume(0); // L: 268
					class316.field3422.remove(var1); // L: 269
					--var1; // L: 270
				} else {
					var2.field3526 = true; // L: 273
				}
			}
		}

	} // L: 277

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)V",
		garbageValue = "-9846"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) { // L: 10372
			WorldMapSectionType.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3); // L: 10373
		}

		long var4 = -1L; // L: 10376
		long var6 = -1L; // L: 10377

		int var8;
		for (var8 = 0; var8 < class93.method2450(); ++var8) { // L: 10378
			long var25 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 10381
			if (var25 != var6) { // L: 10384
				var6 = var25; // L: 10385
				long var15 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 10389
				int var14 = (int)(var15 >>> 0 & 127L); // L: 10391
				var14 = var14; // L: 10395
				int var29 = GrandExchangeOfferAgeComparator.method7113(var8); // L: 10396
				int var16 = class128.method3081(var8); // L: 10397
				int var17 = class232.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var8]); // L: 10400
				int var18 = var17; // L: 10402
				int var22;
				if (var16 == 2 && class36.scene.getObjectFlags(ItemLayer.Client_plane, var14, var29, var25) >= 0) { // L: 10403 10404
					ObjectComposition var19 = WorldMapSection2.getObjectDefinition(var17); // L: 10405
					if (var19.transforms != null) { // L: 10406
						var19 = var19.transform();
					}

					if (var19 == null) { // L: 10407
						continue;
					}

					PendingSpawn var20 = null; // L: 10408

					for (PendingSpawn var21 = (PendingSpawn)Client.pendingSpawns.last(); var21 != null; var21 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 10409
						if (var21.plane == ItemLayer.Client_plane && var14 == var21.x && var29 == var21.y && var18 == var21.field1162) { // L: 10410
							var20 = var21; // L: 10411
							break;
						}
					}

					if (Client.isItemSelected == 1) { // L: 10415
						WorldMapSectionType.insertMenuItemNoShift("Use", Client.field767 + " " + "->" + " " + class167.colorStartTag(65535) + var19.name, 1, var18, var14, var29); // L: 10416
					} else if (Client.isSpellSelected) { // L: 10419
						if ((UrlRequest.field1430 & 4) == 4) { // L: 10420
							WorldMapSectionType.insertMenuItemNoShift(Client.field655, Client.field656 + " " + "->" + " " + class167.colorStartTag(65535) + var19.name, 2, var18, var14, var29); // L: 10421
						}
					} else {
						String[] var37 = var19.actions; // L: 10426
						if (var37 != null) { // L: 10427
							for (var22 = 4; var22 >= 0; --var22) { // L: 10428
								if ((var20 == null || var20.method2455(var22)) && var37[var22] != null) { // L: 10429 10430
									short var23 = 0; // L: 10431
									if (var22 == 0) { // L: 10432
										var23 = 3;
									}

									if (var22 == 1) { // L: 10433
										var23 = 4;
									}

									if (var22 == 2) { // L: 10434
										var23 = 5;
									}

									if (var22 == 3) { // L: 10435
										var23 = 6;
									}

									if (var22 == 4) { // L: 10436
										var23 = 1001;
									}

									WorldMapSectionType.insertMenuItemNoShift(var37[var22], class167.colorStartTag(65535) + var19.name, var23, var18, var14, var29); // L: 10437
								}
							}
						}

						WorldMapSectionType.insertMenuItemNoShift("Examine", class167.colorStartTag(65535) + var19.name, 1002, var19.id, var14, var29); // L: 10442
					}
				}

				int var30;
				Player var31;
				NPC var38;
				int[] var39;
				if (var16 == 1) { // L: 10447
					NPC var33 = Client.npcs[var18]; // L: 10448
					if (var33 == null) { // L: 10449
						continue;
					}

					if (var33.definition.size == 1 && (var33.x & 127) == 64 && (var33.y & 127) == 64) { // L: 10450
						for (var30 = 0; var30 < Client.npcCount; ++var30) { // L: 10451
							var38 = Client.npcs[Client.npcIndices[var30]]; // L: 10452
							if (var38 != null && var38 != var33 && var38.definition.size == 1 && var38.x == var33.x && var38.y == var33.y) { // L: 10453
								WorldMapLabelSize.addNpcToMenu(var38, Client.npcIndices[var30], var14, var29);
							}
						}

						var30 = Players.Players_count; // L: 10455
						var39 = Players.Players_indices; // L: 10456

						for (var22 = 0; var22 < var30; ++var22) { // L: 10457
							var31 = Client.players[var39[var22]]; // L: 10458
							if (var31 != null && var31.x == var33.x && var31.y == var33.y) { // L: 10459
								ArchiveDiskAction.addPlayerToMenu(var31, var39[var22], var14, var29);
							}
						}
					}

					WorldMapLabelSize.addNpcToMenu(var33, var18, var14, var29); // L: 10462
				}

				if (var16 == 0) { // L: 10464
					Player var34 = Client.players[var18]; // L: 10465
					if (var34 == null) { // L: 10466
						continue;
					}

					if ((var34.x & 127) == 64 && (var34.y & 127) == 64) { // L: 10467
						for (var30 = 0; var30 < Client.npcCount; ++var30) { // L: 10468
							var38 = Client.npcs[Client.npcIndices[var30]]; // L: 10469
							if (var38 != null && var38.definition.size == 1 && var34.x == var38.x && var34.y == var38.y) { // L: 10470
								WorldMapLabelSize.addNpcToMenu(var38, Client.npcIndices[var30], var14, var29);
							}
						}

						var30 = Players.Players_count; // L: 10472
						var39 = Players.Players_indices; // L: 10473

						for (var22 = 0; var22 < var30; ++var22) { // L: 10474
							var31 = Client.players[var39[var22]]; // L: 10475
							if (var31 != null && var34 != var31 && var34.x == var31.x && var31.y == var34.y) { // L: 10476
								ArchiveDiskAction.addPlayerToMenu(var31, var39[var22], var14, var29);
							}
						}
					}

					if (var18 != Client.combatTargetPlayerIndex) { // L: 10479
						ArchiveDiskAction.addPlayerToMenu(var34, var18, var14, var29);
					} else {
						var4 = var25; // L: 10480
					}
				}

				if (var16 == 3) { // L: 10482
					NodeDeque var35 = Client.groundItems[ItemLayer.Client_plane][var14][var29]; // L: 10483
					if (var35 != null) { // L: 10484
						for (TileItem var36 = (TileItem)var35.first(); var36 != null; var36 = (TileItem)var35.next()) { // L: 10485 10486 10520
							ItemComposition var40 = class214.ItemComposition_get(var36.id); // L: 10487
							if (Client.isItemSelected == 1) { // L: 10488
								WorldMapSectionType.insertMenuItemNoShift("Use", Client.field767 + " " + "->" + " " + class167.colorStartTag(16748608) + var40.name, 16, var36.id, var14, var29); // L: 10489
							} else if (Client.isSpellSelected) { // L: 10492
								if ((UrlRequest.field1430 & 1) == 1) { // L: 10493
									WorldMapSectionType.insertMenuItemNoShift(Client.field655, Client.field656 + " " + "->" + " " + class167.colorStartTag(16748608) + var40.name, 17, var36.id, var14, var29); // L: 10494
								}
							} else {
								String[] var32 = var40.groundActions; // L: 10499

								for (int var41 = 4; var41 >= 0; --var41) { // L: 10500
									if (var36.method2755(var41)) { // L: 10501
										if (var32 != null && var32[var41] != null) { // L: 10502
											byte var24 = 0; // L: 10503
											if (var41 == 0) { // L: 10504
												var24 = 18;
											}

											if (var41 == 1) { // L: 10505
												var24 = 19;
											}

											if (var41 == 2) { // L: 10506
												var24 = 20;
											}

											if (var41 == 3) { // L: 10507
												var24 = 21;
											}

											if (var41 == 4) { // L: 10508
												var24 = 22;
											}

											WorldMapSectionType.insertMenuItemNoShift(var32[var41], class167.colorStartTag(16748608) + var40.name, var24, var36.id, var14, var29); // L: 10509
										} else if (var41 == 2) { // L: 10512
											WorldMapSectionType.insertMenuItemNoShift("Take", class167.colorStartTag(16748608) + var40.name, 20, var36.id, var14, var29); // L: 10513
										}
									}
								}

								WorldMapSectionType.insertMenuItemNoShift("Examine", class167.colorStartTag(16748608) + var40.name, 1004, var36.id, var14, var29); // L: 10517
							}
						}
					}
				}
			}
		}

		if (-1L != var4) { // L: 10525
			var8 = (int)(var4 >>> 0 & 127L); // L: 10528
			int var10 = (int)(var4 >>> 7 & 127L); // L: 10533
			Player var12 = Client.players[Client.combatTargetPlayerIndex]; // L: 10536
			ArchiveDiskAction.addPlayerToMenu(var12, Client.combatTargetPlayerIndex, var8, var10); // L: 10537
		}

	} // L: 10539

	@ObfuscatedName("oo")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1716534762"
	)
	public static boolean method5925() {
		return Client.clickedWidget != null; // L: 12945
	}
}
