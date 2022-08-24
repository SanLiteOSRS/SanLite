import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1546121993
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1249083301
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1743922557
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1922212143
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 610601899
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1450872965
	)
	@Export("regionEndY")
	int regionEndY;

	WorldMapSection1() {
	} // L: 14

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lht;I)V",
		garbageValue = "362337348"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.regionEndX) { // L: 18
			var1.regionLowX = this.regionEndX;
		}

		if (var1.regionHighX < this.regionEndX) {
			var1.regionHighX = this.regionEndX; // L: 19
		}

		if (var1.regionLowY > this.regionEndY) { // L: 20
			var1.regionLowY = this.regionEndY;
		}

		if (var1.regionHighY < this.regionEndY) { // L: 21
			var1.regionHighY = this.regionEndY;
		}

	} // L: 22

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIIS)Z",
		garbageValue = "-6948"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) { // L: 26
			return var2 >> 6 == this.regionStartX && var3 >> 6 == this.regionStartY; // L: 29
		} else {
			return false; // L: 27
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1464078865"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY; // L: 34
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "2119764221"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 39
			return null; // L: 40
		} else {
			int[] var4 = new int[]{this.regionEndX * 64 - this.regionStartX * 64 + var2, var3 + (this.regionEndY * 64 - this.regionStartY * 64)}; // L: 42 43 44
			return var4; // L: 45
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)Lku;",
		garbageValue = "-1688632698"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 50
			return null; // L: 51
		} else {
			int var3 = this.regionStartX * 64 - this.regionEndX * 64 + var1; // L: 53
			int var4 = this.regionStartY * 64 - this.regionEndY * 64 + var2; // L: 54
			return new Coord(this.minPlane, var3, var4); // L: 55
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "-89"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte(); // L: 60
		this.planes = var1.readUnsignedByte(); // L: 61
		this.regionStartX = var1.readUnsignedShort(); // L: 62
		this.regionStartY = var1.readUnsignedShort(); // L: 63
		this.regionEndX = var1.readUnsignedShort(); // L: 64
		this.regionEndY = var1.readUnsignedShort(); // L: 65
		this.postRead(); // L: 66
	} // L: 67

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	@Export("postRead")
	void postRead() {
	} // L: 69

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-779436483"
	)
	static int method4951(int var0, int var1, int var2) {
		if ((Tiles.Tiles_renderFlags[var0][var1][var2] & 8) != 0) { // L: 972
			return 0;
		} else {
			return var0 > 0 && (Tiles.Tiles_renderFlags[1][var1][var2] & 2) != 0 ? var0 - 1 : var0; // L: 973
		}
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-42"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) { // L: 9417
			ChatChannel.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3); // L: 9418
		}

		long var4 = -1L; // L: 9421
		long var6 = -1L; // L: 9422
		int var8 = 0;

		while (true) {
			int var10 = ViewportMouse.ViewportMouse_entityCount; // L: 9427
			if (var8 >= var10) { // L: 9429
				if (var4 != -1L) { // L: 9568
					var8 = (int)(var4 >>> 0 & 127L); // L: 9571
					var10 = FileSystem.method3214(var4); // L: 9574
					Player var11 = Client.players[Client.combatTargetPlayerIndex]; // L: 9575
					class329.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var10); // L: 9576
				}

				return; // L: 9578
			}

			long var25 = GraphicsDefaults.method6842(var8); // L: 9430
			if (var25 != var6) { // L: 9431
				label335: {
					var6 = var25; // L: 9432
					long var15 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 9436
					int var14 = (int)(var15 >>> 0 & 127L); // L: 9438
					var14 = var14; // L: 9442
					int var27 = Occluder.method4236(var8); // L: 9443
					long var18 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 9447
					int var17 = (int)(var18 >>> 14 & 3L); // L: 9449
					int var28 = class120.method2735(var8); // L: 9454
					if (var17 == 2 && class12.scene.getObjectFlags(class268.Client_plane, var14, var27, var25) >= 0) { // L: 9455 9456
						ObjectComposition var19 = FileSystem.getObjectDefinition(var28); // L: 9457
						if (var19.transforms != null) { // L: 9458
							var19 = var19.transform();
						}

						if (var19 == null) { // L: 9459
							break label335;
						}

						if (Client.isItemSelected == 1) { // L: 9460
							ChatChannel.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + Clock.colorStartTag(65535) + var19.name, 1, var28, var14, var27); // L: 9461
						} else if (Client.isSpellSelected) { // L: 9464
							if ((class149.selectedSpellFlags & 4) == 4) { // L: 9465
								ChatChannel.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + Clock.colorStartTag(65535) + var19.name, 2, var28, var14, var27); // L: 9466
							}
						} else {
							String[] var20 = var19.actions; // L: 9471
							if (var20 != null) { // L: 9472
								for (int var21 = 4; var21 >= 0; --var21) { // L: 9473
									if (var20[var21] != null) { // L: 9474
										short var22 = 0; // L: 9475
										if (var21 == 0) { // L: 9476
											var22 = 3;
										}

										if (var21 == 1) { // L: 9477
											var22 = 4;
										}

										if (var21 == 2) { // L: 9478
											var22 = 5;
										}

										if (var21 == 3) { // L: 9479
											var22 = 6;
										}

										if (var21 == 4) { // L: 9480
											var22 = 1001;
										}

										ChatChannel.insertMenuItemNoShift(var20[var21], Clock.colorStartTag(65535) + var19.name, var22, var28, var14, var27); // L: 9481
									}
								}
							}

							ChatChannel.insertMenuItemNoShift("Examine", Clock.colorStartTag(65535) + var19.name, 1002, var19.id, var14, var27); // L: 9486
						}
					}

					Player var23;
					int var29;
					NPC var30;
					int var37;
					int[] var38;
					if (var17 == 1) { // L: 9491
						NPC var33 = Client.npcs[var28]; // L: 9492
						if (var33 == null) { // L: 9493
							break label335;
						}

						if (var33.definition.size == 1 && (var33.x & 127) == 64 && (var33.y & 127) == 64) { // L: 9494
							for (var29 = 0; var29 < Client.npcCount; ++var29) { // L: 9495
								var30 = Client.npcs[Client.npcIndices[var29]]; // L: 9496
								if (var30 != null && var33 != var30 && var30.definition.size == 1 && var30.x == var33.x && var33.y == var30.y) { // L: 9497
									UserComparator9.addNpcToMenu(var30, Client.npcIndices[var29], var14, var27);
								}
							}

							var29 = Players.Players_count; // L: 9499
							var38 = Players.Players_indices; // L: 9500

							for (var37 = 0; var37 < var29; ++var37) { // L: 9501
								var23 = Client.players[var38[var37]]; // L: 9502
								if (var23 != null && var33.x == var23.x && var33.y == var23.y) { // L: 9503
									class329.addPlayerToMenu(var23, var38[var37], var14, var27);
								}
							}
						}

						UserComparator9.addNpcToMenu(var33, var28, var14, var27); // L: 9506
					}

					if (var17 == 0) { // L: 9508
						Player var34 = Client.players[var28]; // L: 9509
						if (var34 == null) { // L: 9510
							break label335;
						}

						if ((var34.x & 127) == 64 && (var34.y & 127) == 64) { // L: 9511
							for (var29 = 0; var29 < Client.npcCount; ++var29) { // L: 9512
								var30 = Client.npcs[Client.npcIndices[var29]]; // L: 9513
								if (var30 != null && var30.definition.size == 1 && var30.x == var34.x && var34.y == var30.y) { // L: 9514
									UserComparator9.addNpcToMenu(var30, Client.npcIndices[var29], var14, var27);
								}
							}

							var29 = Players.Players_count; // L: 9516
							var38 = Players.Players_indices; // L: 9517

							for (var37 = 0; var37 < var29; ++var37) { // L: 9518
								var23 = Client.players[var38[var37]]; // L: 9519
								if (var23 != null && var23 != var34 && var34.x == var23.x && var23.y == var34.y) { // L: 9520
									class329.addPlayerToMenu(var23, var38[var37], var14, var27);
								}
							}
						}

						if (var28 != Client.combatTargetPlayerIndex) { // L: 9523
							class329.addPlayerToMenu(var34, var28, var14, var27);
						} else {
							var4 = var25; // L: 9524
						}
					}

					if (var17 == 3) { // L: 9526
						NodeDeque var36 = Client.groundItems[class268.Client_plane][var14][var27]; // L: 9527
						if (var36 != null) { // L: 9528
							for (TileItem var35 = (TileItem)var36.first(); var35 != null; var35 = (TileItem)var36.next()) { // L: 9529 9530 9563
								ItemComposition var39 = AttackOption.ItemComposition_get(var35.id); // L: 9531
								if (Client.isItemSelected == 1) { // L: 9532
									ChatChannel.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + Clock.colorStartTag(16748608) + var39.name, 16, var35.id, var14, var27); // L: 9533
								} else if (Client.isSpellSelected) { // L: 9536
									if ((class149.selectedSpellFlags & 1) == 1) { // L: 9537
										ChatChannel.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + Clock.colorStartTag(16748608) + var39.name, 17, var35.id, var14, var27); // L: 9538
									}
								} else {
									String[] var31 = var39.groundActions; // L: 9543

									for (int var32 = 4; var32 >= 0; --var32) { // L: 9544
										if (var31 != null && var31[var32] != null) { // L: 9545
											byte var24 = 0; // L: 9546
											if (var32 == 0) { // L: 9547
												var24 = 18;
											}

											if (var32 == 1) { // L: 9548
												var24 = 19;
											}

											if (var32 == 2) { // L: 9549
												var24 = 20;
											}

											if (var32 == 3) { // L: 9550
												var24 = 21;
											}

											if (var32 == 4) { // L: 9551
												var24 = 22;
											}

											ChatChannel.insertMenuItemNoShift(var31[var32], Clock.colorStartTag(16748608) + var39.name, var24, var35.id, var14, var27); // L: 9552
										} else if (var32 == 2) { // L: 9555
											ChatChannel.insertMenuItemNoShift("Take", Clock.colorStartTag(16748608) + var39.name, 20, var35.id, var14, var27); // L: 9556
										}
									}

									ChatChannel.insertMenuItemNoShift("Examine", Clock.colorStartTag(16748608) + var39.name, 1004, var35.id, var14, var27); // L: 9560
								}
							}
						}
					}
				}
			}

			++var8; // L: 9423
		}
	}
}
