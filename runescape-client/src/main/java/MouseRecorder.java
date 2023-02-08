import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("f")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("w")
	@Export("lock")
	Object lock;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -876142441
	)
	@Export("index")
	int index;
	@ObfuscatedName("s")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("z")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("j")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true; // L: 7
		this.lock = new Object(); // L: 8
		this.index = 0; // L: 9
		this.xs = new int[500]; // L: 10
		this.ys = new int[500]; // L: 11
		this.millis = new long[500]; // L: 12
	} // L: 14

	public void run() {
		for (; this.isRunning; Clock.method3567(50L)) { // L: 18 27
			synchronized(this.lock) { // L: 19
				if (this.index < 500) { // L: 20
					this.xs[this.index] = MouseHandler.MouseHandler_x; // L: 21
					this.ys[this.index] = MouseHandler.MouseHandler_y; // L: 22
					this.millis[this.index] = MouseHandler.MouseHandler_millis; // L: 23
					++this.index; // L: 24
				}
			}
		}

	} // L: 29

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lgg;",
		garbageValue = "-2134315347"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0); // L: 32
		if (var1 != null) { // L: 33
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0); // L: 34
			var1 = new SpotAnimationDefinition(); // L: 35
			var1.id = var0; // L: 36
			if (var2 != null) { // L: 37
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0); // L: 38
			return var1; // L: 39
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-83"
	)
	static int method2327(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field862 - 7.0D) * 256.0D); // L: 4238
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-795941365"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) { // L: 10469
			WorldMapManager.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3); // L: 10470
		}

		long var4 = -1L; // L: 10473
		long var6 = -1L; // L: 10474
		int var8 = 0;

		while (true) {
			int var10 = ViewportMouse.ViewportMouse_entityCount; // L: 10479
			if (var8 >= var10) { // L: 10481
				if (var4 != -1L) { // L: 10619
					var8 = DecorativeObject.method4863(var4); // L: 10620
					int var9 = class140.method3158(var4); // L: 10621
					Player var25 = Client.players[Client.combatTargetPlayerIndex]; // L: 10622
					BufferedSource.addPlayerToMenu(var25, Client.combatTargetPlayerIndex, var8, var9); // L: 10623
				}

				return; // L: 10625
			}

			long var11 = VertexNormal.method4844(var8); // L: 10482
			if (var6 != var11) { // L: 10483
				label370: {
					var6 = var11; // L: 10484
					int var13 = Players.method2734(var8); // L: 10485
					int var14 = WorldMapElement.method3630(var8); // L: 10486
					int var15 = class121.method2987(ViewportMouse.ViewportMouse_entityTags[var8]); // L: 10489
					int var17 = class124.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var8]); // L: 10494
					int var18 = var17; // L: 10496
					int var22;
					if (var15 == 2 && WorldMapAreaData.scene.getObjectFlags(class103.Client_plane, var13, var14, var11) >= 0) { // L: 10497 10498
						ObjectComposition var19 = class463.getObjectDefinition(var17); // L: 10499
						if (var19.transforms != null) { // L: 10500
							var19 = var19.transform();
						}

						if (var19 == null) { // L: 10501
							break label370;
						}

						PendingSpawn var20 = null; // L: 10502

						for (PendingSpawn var21 = (PendingSpawn)Client.pendingSpawns.last(); var21 != null; var21 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 10503
							if (var21.plane == class103.Client_plane && var13 == var21.x && var14 == var21.y && var18 == var21.field1150) { // L: 10504
								var20 = var21; // L: 10505
								break;
							}
						}

						if (Client.isItemSelected == 1) { // L: 10509
							WorldMapManager.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class149.colorStartTag(65535) + var19.name, 1, var18, var13, var14); // L: 10510
						} else if (Client.isSpellSelected) { // L: 10513
							if ((class149.selectedSpellFlags & 4) == 4) { // L: 10514
								WorldMapManager.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class149.colorStartTag(65535) + var19.name, 2, var18, var13, var14); // L: 10515
							}
						} else {
							String[] var33 = var19.actions; // L: 10520
							if (var33 != null) { // L: 10521
								for (var22 = 4; var22 >= 0; --var22) { // L: 10522
									if ((var20 == null || var20.method2415(var22)) && var33[var22] != null) { // L: 10523 10524
										short var23 = 0; // L: 10525
										if (var22 == 0) { // L: 10526
											var23 = 3;
										}

										if (var22 == 1) { // L: 10527
											var23 = 4;
										}

										if (var22 == 2) { // L: 10528
											var23 = 5;
										}

										if (var22 == 3) { // L: 10529
											var23 = 6;
										}

										if (var22 == 4) { // L: 10530
											var23 = 1001;
										}

										WorldMapManager.insertMenuItemNoShift(var33[var22], class149.colorStartTag(65535) + var19.name, var23, var18, var13, var14); // L: 10531
									}
								}
							}

							WorldMapManager.insertMenuItemNoShift("Examine", class149.colorStartTag(65535) + var19.name, 1002, var19.id, var13, var14); // L: 10536
						}
					}

					int var26;
					Player var27;
					NPC var34;
					int[] var35;
					if (var15 == 1) { // L: 10541
						NPC var29 = Client.npcs[var18]; // L: 10542
						if (var29 == null) { // L: 10543
							break label370;
						}

						if (var29.definition.size == 1 && (var29.x & 127) == 64 && (var29.y & 127) == 64) { // L: 10544
							for (var26 = 0; var26 < Client.npcCount; ++var26) { // L: 10545
								var34 = Client.npcs[Client.npcIndices[var26]]; // L: 10546
								if (var34 != null && var34 != var29 && var34.definition.size == 1 && var34.x == var29.x && var29.y == var34.y) { // L: 10547
									class204.addNpcToMenu(var34, Client.npcIndices[var26], var13, var14);
								}
							}

							var26 = Players.Players_count; // L: 10549
							var35 = Players.Players_indices; // L: 10550

							for (var22 = 0; var22 < var26; ++var22) { // L: 10551
								var27 = Client.players[var35[var22]]; // L: 10552
								if (var27 != null && var29.x == var27.x && var29.y == var27.y) { // L: 10553
									BufferedSource.addPlayerToMenu(var27, var35[var22], var13, var14);
								}
							}
						}

						class204.addNpcToMenu(var29, var18, var13, var14); // L: 10556
					}

					if (var15 == 0) { // L: 10558
						Player var30 = Client.players[var18]; // L: 10559
						if (var30 == null) { // L: 10560
							break label370;
						}

						if ((var30.x & 127) == 64 && (var30.y & 127) == 64) { // L: 10561
							for (var26 = 0; var26 < Client.npcCount; ++var26) { // L: 10562
								var34 = Client.npcs[Client.npcIndices[var26]]; // L: 10563
								if (var34 != null && var34.definition.size == 1 && var34.x == var30.x && var30.y == var34.y) { // L: 10564
									class204.addNpcToMenu(var34, Client.npcIndices[var26], var13, var14);
								}
							}

							var26 = Players.Players_count; // L: 10566
							var35 = Players.Players_indices; // L: 10567

							for (var22 = 0; var22 < var26; ++var22) { // L: 10568
								var27 = Client.players[var35[var22]]; // L: 10569
								if (var27 != null && var27 != var30 && var27.x == var30.x && var30.y == var27.y) { // L: 10570
									BufferedSource.addPlayerToMenu(var27, var35[var22], var13, var14);
								}
							}
						}

						if (var18 != Client.combatTargetPlayerIndex) { // L: 10573
							BufferedSource.addPlayerToMenu(var30, var18, var13, var14);
						} else {
							var4 = var11; // L: 10574
						}
					}

					if (var15 == 3) { // L: 10576
						NodeDeque var31 = Client.groundItems[class103.Client_plane][var13][var14]; // L: 10577
						if (var31 != null) { // L: 10578
							for (TileItem var32 = (TileItem)var31.first(); var32 != null; var32 = (TileItem)var31.next()) { // L: 10579 10580 10614
								ItemComposition var36 = TileItem.ItemComposition_get(var32.id); // L: 10581
								if (Client.isItemSelected == 1) { // L: 10582
									WorldMapManager.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class149.colorStartTag(16748608) + var36.name, 16, var32.id, var13, var14); // L: 10583
								} else if (Client.isSpellSelected) { // L: 10586
									if ((class149.selectedSpellFlags & 1) == 1) { // L: 10587
										WorldMapManager.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class149.colorStartTag(16748608) + var36.name, 17, var32.id, var13, var14); // L: 10588
									}
								} else {
									String[] var28 = var36.groundActions; // L: 10593

									for (int var37 = 4; var37 >= 0; --var37) { // L: 10594
										if (var32.method2712(var37)) { // L: 10595
											if (var28 != null && var28[var37] != null) { // L: 10596
												byte var24 = 0; // L: 10597
												if (var37 == 0) { // L: 10598
													var24 = 18;
												}

												if (var37 == 1) { // L: 10599
													var24 = 19;
												}

												if (var37 == 2) { // L: 10600
													var24 = 20;
												}

												if (var37 == 3) { // L: 10601
													var24 = 21;
												}

												if (var37 == 4) { // L: 10602
													var24 = 22;
												}

												WorldMapManager.insertMenuItemNoShift(var28[var37], class149.colorStartTag(16748608) + var36.name, var24, var32.id, var13, var14); // L: 10603
											} else if (var37 == 2) { // L: 10606
												WorldMapManager.insertMenuItemNoShift("Take", class149.colorStartTag(16748608) + var36.name, 20, var32.id, var13, var14); // L: 10607
											}
										}
									}

									WorldMapManager.insertMenuItemNoShift("Examine", class149.colorStartTag(16748608) + var36.name, 1004, var32.id, var13, var14); // L: 10611
								}
							}
						}
					}
				}
			}

			++var8; // L: 10475
		}
	}
}
