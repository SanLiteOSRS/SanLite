import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
@Implements("ModelData0")
public class ModelData0 {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;

	ModelData0() {
	} // L: 4

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(Ldo;IIII)V",
		garbageValue = "1213520164"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3) {
		NPCComposition var4 = var0.definition; // L: 10373
		if (Client.menuOptionsCount < 400) { // L: 10374
			if (var4.transforms != null) { // L: 10375
				var4 = var4.transform();
			}

			if (var4 != null) { // L: 10376
				if (var4.isInteractable) { // L: 10377
					if (!var4.isFollower || Client.followerIndex == var1) { // L: 10378
						String var5 = var0.method2643(); // L: 10379
						int var6;
						int var9;
						if (var4.combatLevel != 0 && var0.field1253 != 0) { // L: 10380
							var6 = var0.field1253 != -1 ? var0.field1253 : var4.combatLevel; // L: 10381
							var9 = class27.localPlayer.combatLevel; // L: 10384
							int var10 = var9 - var6; // L: 10386
							String var8;
							if (var10 < -9) { // L: 10387
								var8 = class17.colorStartTag(16711680); // L: 10388
							} else if (var10 < -6) { // L: 10391
								var8 = class17.colorStartTag(16723968); // L: 10392
							} else if (var10 < -3) { // L: 10395
								var8 = class17.colorStartTag(16740352); // L: 10396
							} else if (var10 < 0) { // L: 10399
								var8 = class17.colorStartTag(16756736); // L: 10400
							} else if (var10 > 9) { // L: 10403
								var8 = class17.colorStartTag(65280); // L: 10404
							} else if (var10 > 6) { // L: 10407
								var8 = class17.colorStartTag(4259584); // L: 10408
							} else if (var10 > 3) { // L: 10411
								var8 = class17.colorStartTag(8453888); // L: 10412
							} else if (var10 > 0) { // L: 10415
								var8 = class17.colorStartTag(12648192); // L: 10416
							} else {
								var8 = class17.colorStartTag(16776960); // L: 10419
							}

							var5 = var5 + var8 + " " + " (" + "level-" + var6 + ")"; // L: 10421
						}

						if (var4.isFollower && Client.followerOpsLowPriority) { // L: 10423
							class238.insertMenuItemNoShift("Examine", class17.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 10424
						}

						if (Client.isItemSelected == 1) { // L: 10427
							class238.insertMenuItemNoShift("Use", Client.field661 + " " + "->" + " " + class17.colorStartTag(16776960) + var5, 7, var1, var2, var3); // L: 10428
						} else if (Client.isSpellSelected) { // L: 10431
							if ((class13.selectedSpellFlags & 2) == 2) { // L: 10432
								class238.insertMenuItemNoShift(Client.field665, Client.field666 + " " + "->" + " " + class17.colorStartTag(16776960) + var5, 8, var1, var2, var3); // L: 10433
							}
						} else {
							var6 = var4.isFollower && Client.followerOpsLowPriority ? 2000 : 0; // L: 10438
							String[] var7 = var4.actions; // L: 10439
							int var11;
							if (var7 != null) { // L: 10440
								for (var11 = 4; var11 >= 0; --var11) { // L: 10441
									if (var0.method2629(var11) && var7[var11] != null && !var7[var11].equalsIgnoreCase("Attack")) { // L: 10442 10443
										var9 = 0; // L: 10444
										if (var11 == 0) { // L: 10445
											var9 = var6 + 9;
										}

										if (var11 == 1) { // L: 10446
											var9 = var6 + 10;
										}

										if (var11 == 2) { // L: 10447
											var9 = var6 + 11;
										}

										if (var11 == 3) { // L: 10448
											var9 = var6 + 12;
										}

										if (var11 == 4) { // L: 10449
											var9 = var6 + 13;
										}

										class238.insertMenuItemNoShift(var7[var11], class17.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 10450
									}
								}
							}

							if (var7 != null) { // L: 10455
								for (var11 = 4; var11 >= 0; --var11) { // L: 10456
									if (var0.method2629(var11) && var7[var11] != null && var7[var11].equalsIgnoreCase("Attack")) { // L: 10457 10458
										short var12 = 0; // L: 10459
										if (AttackOption.AttackOption_hidden != Client.npcAttackOption) { // L: 10460
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || Client.npcAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var4.combatLevel > class27.localPlayer.combatLevel) { // L: 10461
												var12 = 2000; // L: 10462
											}

											var9 = 0; // L: 10464
											if (var11 == 0) { // L: 10465
												var9 = var12 + 9;
											}

											if (var11 == 1) { // L: 10466
												var9 = var12 + 10;
											}

											if (var11 == 2) { // L: 10467
												var9 = var12 + 11;
											}

											if (var11 == 3) { // L: 10468
												var9 = var12 + 12;
											}

											if (var11 == 4) { // L: 10469
												var9 = var12 + 13;
											}

											class238.insertMenuItemNoShift(var7[var11], class17.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 10470
										}
									}
								}
							}

							if (!var4.isFollower || !Client.followerOpsLowPriority) { // L: 10475
								class238.insertMenuItemNoShift("Examine", class17.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 10476
							}
						}

					}
				}
			}
		}
	} // L: 10480
}
