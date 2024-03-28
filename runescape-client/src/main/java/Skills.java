import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ng")
@Implements("Skills")
public class Skills {
	@ObfuscatedName("ah")
	@Export("Skills_enabled")
	public static final boolean[] Skills_enabled;
	@ObfuscatedName("af")
	@Export("Skills_experienceTable")
	public static int[] Skills_experienceTable;

	static {
		Skills_enabled = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false}; // L: 5
		Skills_experienceTable = new int[99]; // L: 6
		int var0 = 0; // L: 9

		for (int var1 = 0; var1 < 99; ++var1) { // L: 10
			int var2 = var1 + 1; // L: 11
			int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D)); // L: 12
			var0 += var3; // L: 13
			Skills_experienceTable[var1] = var0 / 4; // L: 14
		}

	} // L: 16

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1695955385"
	)
	static int method6858(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field876 - 7.0D) * 256.0D); // L: 4476
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-9"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) { // L: 10304
			Interpreter.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3); // L: 10305
		}

		long var4 = -1L; // L: 10308
		long var6 = -1L; // L: 10309
		int var8 = 0;

		while (true) {
			int var10 = ViewportMouse.ViewportMouse_entityCount; // L: 10314
			if (var8 >= var10) { // L: 10316
				if (-1L != var4) { // L: 10459
					var8 = class7.method60(var4); // L: 10460
					int var9 = (int)(var4 >>> 7 & 127L); // L: 10463
					Player var11 = Client.players[Client.combatTargetPlayerIndex]; // L: 10466
					class216.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var9); // L: 10467
				}

				return; // L: 10469
			}

			long var26 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 10319
			if (var26 != var6) { // L: 10322
				label366: {
					var6 = var26; // L: 10323
					int var15 = class211.method3933(var8); // L: 10324
					long var18 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 10328
					int var17 = (int)(var18 >>> 7 & 127L); // L: 10330
					var17 = var17; // L: 10334
					int var28 = Players.method2714(var8); // L: 10335
					int var19 = class225.method4276(var8); // L: 10336
					int var23;
					if (var28 == 2 && LoginType.scene.getObjectFlags(class172.Client_plane, var15, var17, var26) >= 0) { // L: 10337 10338
						ObjectComposition var20 = MouseRecorder.getObjectDefinition(var19); // L: 10339
						if (var20.transforms != null) { // L: 10340
							var20 = var20.transform();
						}

						if (var20 == null) { // L: 10341
							break label366;
						}

						PendingSpawn var21 = null; // L: 10342

						for (PendingSpawn var22 = (PendingSpawn)Client.pendingSpawns.last(); var22 != null; var22 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 10343
							if (var22.plane == class172.Client_plane && var15 == var22.x && var17 == var22.y && var19 == var22.field1198) { // L: 10344
								var21 = var22; // L: 10345
								break;
							}
						}

						if (Client.isItemSelected == 1) { // L: 10349
							Interpreter.insertMenuItemNoShift("Use", Client.field676 + " " + "->" + " " + Decimator.colorStartTag(65535) + var20.name, 1, var19, var15, var17); // L: 10350
						} else if (Client.isSpellSelected) { // L: 10353
							if ((class352.field3905 & 4) == 4) { // L: 10354
								Interpreter.insertMenuItemNoShift(Client.field557, Client.field801 + " " + "->" + " " + Decimator.colorStartTag(65535) + var20.name, 2, var19, var15, var17); // L: 10355
							}
						} else {
							String[] var36 = var20.actions; // L: 10360
							if (var36 != null) { // L: 10361
								for (var23 = 4; var23 >= 0; --var23) { // L: 10362
									if ((var21 == null || var21.method2391(var23)) && var36[var23] != null) { // L: 10363 10364
										short var24 = 0; // L: 10365
										if (var23 == 0) { // L: 10366
											var24 = 3;
										}

										if (var23 == 1) { // L: 10367
											var24 = 4;
										}

										if (var23 == 2) { // L: 10368
											var24 = 5;
										}

										if (var23 == 3) { // L: 10369
											var24 = 6;
										}

										if (var23 == 4) { // L: 10370
											var24 = 1001;
										}

										Interpreter.insertMenuItemNoShift(var36[var23], Decimator.colorStartTag(65535) + var20.name, var24, var19, var15, var17); // L: 10371
									}
								}
							}

							Interpreter.insertMenuItemNoShift("Examine", Decimator.colorStartTag(65535) + var20.name, 1002, var20.id, var15, var17); // L: 10376
						}
					}

					int var29;
					Player var30;
					NPC var37;
					int[] var38;
					if (var28 == 1) { // L: 10381
						NPC var32 = Client.npcs[var19]; // L: 10382
						if (var32 == null) { // L: 10383
							break label366;
						}

						if (var32.definition.size == 1 && (var32.x & 127) == 64 && (var32.y & 127) == 64) { // L: 10384
							for (var29 = 0; var29 < Client.npcCount; ++var29) { // L: 10385
								var37 = Client.npcs[Client.npcIndices[var29]]; // L: 10386
								if (var37 != null && var37 != var32 && var37.definition.size == 1 && var32.x == var37.x && var37.y == var32.y) { // L: 10387
									class60.addNpcToMenu(var37, Client.npcIndices[var29], var15, var17);
								}
							}

							var29 = Players.Players_count; // L: 10389
							var38 = Players.Players_indices; // L: 10390

							for (var23 = 0; var23 < var29; ++var23) { // L: 10391
								var30 = Client.players[var38[var23]]; // L: 10392
								if (var30 != null && var32.x == var30.x && var30.y == var32.y) { // L: 10393
									class216.addPlayerToMenu(var30, var38[var23], var15, var17);
								}
							}
						}

						class60.addNpcToMenu(var32, var19, var15, var17); // L: 10396
					}

					if (var28 == 0) { // L: 10398
						Player var33 = Client.players[var19]; // L: 10399
						if (var33 == null) { // L: 10400
							break label366;
						}

						if ((var33.x & 127) == 64 && (var33.y & 127) == 64) { // L: 10401
							for (var29 = 0; var29 < Client.npcCount; ++var29) { // L: 10402
								var37 = Client.npcs[Client.npcIndices[var29]]; // L: 10403
								if (var37 != null && var37.definition.size == 1 && var33.x == var37.x && var33.y == var37.y) { // L: 10404
									class60.addNpcToMenu(var37, Client.npcIndices[var29], var15, var17);
								}
							}

							var29 = Players.Players_count; // L: 10406
							var38 = Players.Players_indices; // L: 10407

							for (var23 = 0; var23 < var29; ++var23) { // L: 10408
								var30 = Client.players[var38[var23]]; // L: 10409
								if (var30 != null && var30 != var33 && var33.x == var30.x && var33.y == var30.y) { // L: 10410
									class216.addPlayerToMenu(var30, var38[var23], var15, var17);
								}
							}
						}

						if (var19 != Client.combatTargetPlayerIndex) { // L: 10413
							class216.addPlayerToMenu(var33, var19, var15, var17);
						} else {
							var4 = var26; // L: 10414
						}
					}

					if (var28 == 3) { // L: 10416
						NodeDeque var34 = Client.groundItems[class172.Client_plane][var15][var17]; // L: 10417
						if (var34 != null) { // L: 10418
							for (TileItem var35 = (TileItem)var34.first(); var35 != null; var35 = (TileItem)var34.next()) { // L: 10419 10420 10454
								ItemComposition var39 = class10.ItemComposition_get(var35.id); // L: 10421
								if (Client.isItemSelected == 1) { // L: 10422
									Interpreter.insertMenuItemNoShift("Use", Client.field676 + " " + "->" + " " + Decimator.colorStartTag(16748608) + var39.name, 16, var35.id, var15, var17); // L: 10423
								} else if (Client.isSpellSelected) { // L: 10426
									if ((class352.field3905 & 1) == 1) { // L: 10427
										Interpreter.insertMenuItemNoShift(Client.field557, Client.field801 + " " + "->" + " " + Decimator.colorStartTag(16748608) + var39.name, 17, var35.id, var15, var17); // L: 10428
									}
								} else {
									String[] var31 = var39.groundActions; // L: 10433

									for (int var40 = 4; var40 >= 0; --var40) { // L: 10434
										if (var35.method2690(var40)) { // L: 10435
											if (var31 != null && var31[var40] != null) { // L: 10436
												byte var25 = 0; // L: 10437
												if (var40 == 0) { // L: 10438
													var25 = 18;
												}

												if (var40 == 1) { // L: 10439
													var25 = 19;
												}

												if (var40 == 2) { // L: 10440
													var25 = 20;
												}

												if (var40 == 3) { // L: 10441
													var25 = 21;
												}

												if (var40 == 4) { // L: 10442
													var25 = 22;
												}

												Interpreter.insertMenuItemNoShift(var31[var40], Decimator.colorStartTag(16748608) + var39.name, var25, var35.id, var15, var17); // L: 10443
											} else if (var40 == 2) { // L: 10446
												Interpreter.insertMenuItemNoShift("Take", Decimator.colorStartTag(16748608) + var39.name, 20, var35.id, var15, var17); // L: 10447
											}
										}
									}

									Interpreter.insertMenuItemNoShift("Examine", Decimator.colorStartTag(16748608) + var39.name, 1004, var35.id, var15, var17); // L: 10451
								}
							}
						}
					}
				}
			}

			++var8; // L: 10310
		}
	}
}
