import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
public class class204 extends Node {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1658327309
	)
	public int field2319;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1998840309
	)
	public int field2322;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 392265733
	)
	public int field2317;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	public Widget field2324;

	@ObfuscatedSignature(
		descriptor = "(IIILkz;)V"
	)
	public class204(int var1, int var2, int var3, Widget var4) {
		this.field2317 = var1; // L: 15
		this.field2319 = var2; // L: 16
		this.field2322 = var3; // L: 17
		this.field2324 = var4; // L: 18
	} // L: 19

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "521882504"
	)
	protected static final void method4130() {
		class177.clock.mark(); // L: 447

		int var0;
		for (var0 = 0; var0 < 32; ++var0) { // L: 448
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) { // L: 449
			GameEngine.clientTickTimes[var0] = 0L;
		}

		InterfaceParent.gameCyclesToDo = 0; // L: 450
	} // L: 451

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1982690713"
	)
	static void method4132() {
		if (class387.localPlayer.x >> 7 == Client.destinationX && class387.localPlayer.y >> 7 == Client.destinationY) { // L: 5049
			Client.destinationX = 0; // L: 5050
		}

	} // L: 5052

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(Lct;I)V",
		garbageValue = "1049683163"
	)
	static final void method4131(PendingSpawn var0) {
		long var1 = 0L; // L: 8298
		int var3 = -1; // L: 8299
		int var4 = 0; // L: 8300
		int var5 = 0; // L: 8301
		if (var0.type == 0) { // L: 8302
			var1 = WorldMapAreaData.scene.getWallObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) { // L: 8303
			var1 = WorldMapAreaData.scene.getDecorativeObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) { // L: 8304
			var1 = WorldMapAreaData.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) { // L: 8305
			var1 = WorldMapAreaData.scene.getGroundObjectTag(var0.plane, var0.x, var0.y);
		}

		if (0L != var1) { // L: 8306
			int var6 = WorldMapAreaData.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1); // L: 8307
			var3 = class124.Entity_unpackID(var1); // L: 8308
			var4 = var6 & 31; // L: 8309
			var5 = var6 >> 6 & 3; // L: 8310
		}

		var0.objectId = var3; // L: 8312
		var0.field1149 = var4; // L: 8313
		var0.field1148 = var5; // L: 8314
	} // L: 8315

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(Lcf;IIII)V",
		garbageValue = "1687427958"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3) {
		NPCComposition var4 = var0.definition; // L: 10628
		if (Client.menuOptionsCount < 400) { // L: 10629
			if (var4.transforms != null) { // L: 10630
				var4 = var4.transform();
			}

			if (var4 != null) { // L: 10631
				if (var4.isInteractable) { // L: 10632
					if (!var4.isFollower || Client.followerIndex == var1) { // L: 10633
						String var5 = var0.method2616(); // L: 10634
						int var6;
						int var9;
						if (var4.combatLevel != 0 && var0.field1220 != 0) { // L: 10635
							var6 = var0.field1220 != -1 ? var0.field1220 : var4.combatLevel; // L: 10636
							var9 = class387.localPlayer.combatLevel; // L: 10639
							int var10 = var9 - var6; // L: 10641
							String var8;
							if (var10 < -9) { // L: 10642
								var8 = class149.colorStartTag(16711680); // L: 10643
							} else if (var10 < -6) { // L: 10646
								var8 = class149.colorStartTag(16723968); // L: 10647
							} else if (var10 < -3) { // L: 10650
								var8 = class149.colorStartTag(16740352); // L: 10651
							} else if (var10 < 0) { // L: 10654
								var8 = class149.colorStartTag(16756736); // L: 10655
							} else if (var10 > 9) { // L: 10658
								var8 = class149.colorStartTag(65280); // L: 10659
							} else if (var10 > 6) { // L: 10662
								var8 = class149.colorStartTag(4259584); // L: 10663
							} else if (var10 > 3) { // L: 10666
								var8 = class149.colorStartTag(8453888); // L: 10667
							} else if (var10 > 0) { // L: 10670
								var8 = class149.colorStartTag(12648192); // L: 10671
							} else {
								var8 = class149.colorStartTag(16776960); // L: 10674
							}

							var5 = var5 + var8 + " " + " (" + "level-" + var6 + ")"; // L: 10676
						}

						if (var4.isFollower && Client.followerOpsLowPriority) { // L: 10678
							WorldMapManager.insertMenuItemNoShift("Examine", class149.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 10679
						}

						if (Client.isItemSelected == 1) { // L: 10682
							WorldMapManager.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class149.colorStartTag(16776960) + var5, 7, var1, var2, var3); // L: 10683
						} else if (Client.isSpellSelected) { // L: 10686
							if ((class149.selectedSpellFlags & 2) == 2) { // L: 10687
								WorldMapManager.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class149.colorStartTag(16776960) + var5, 8, var1, var2, var3); // L: 10688
							}
						} else {
							var6 = var4.isFollower && Client.followerOpsLowPriority ? 2000 : 0; // L: 10693
							String[] var7 = var4.actions; // L: 10694
							int var11;
							if (var7 != null) { // L: 10695
								for (var11 = 4; var11 >= 0; --var11) { // L: 10696
									if (var0.method2615(var11) && var7[var11] != null && !var7[var11].equalsIgnoreCase("Attack")) { // L: 10697 10698
										var9 = 0; // L: 10699
										if (var11 == 0) { // L: 10700
											var9 = var6 + 9;
										}

										if (var11 == 1) { // L: 10701
											var9 = var6 + 10;
										}

										if (var11 == 2) { // L: 10702
											var9 = var6 + 11;
										}

										if (var11 == 3) { // L: 10703
											var9 = var6 + 12;
										}

										if (var11 == 4) { // L: 10704
											var9 = var6 + 13;
										}

										WorldMapManager.insertMenuItemNoShift(var7[var11], class149.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 10705
									}
								}
							}

							if (var7 != null) { // L: 10710
								for (var11 = 4; var11 >= 0; --var11) { // L: 10711
									if (var0.method2615(var11) && var7[var11] != null && var7[var11].equalsIgnoreCase("Attack")) { // L: 10712 10713
										short var12 = 0; // L: 10714
										if (AttackOption.AttackOption_hidden != Client.npcAttackOption) { // L: 10715
											if (AttackOption.AttackOption_alwaysRightClick == Client.npcAttackOption || Client.npcAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var4.combatLevel > class387.localPlayer.combatLevel) { // L: 10716
												var12 = 2000; // L: 10717
											}

											var9 = 0; // L: 10719
											if (var11 == 0) { // L: 10720
												var9 = var12 + 9;
											}

											if (var11 == 1) { // L: 10721
												var9 = var12 + 10;
											}

											if (var11 == 2) { // L: 10722
												var9 = var12 + 11;
											}

											if (var11 == 3) { // L: 10723
												var9 = var12 + 12;
											}

											if (var11 == 4) { // L: 10724
												var9 = var12 + 13;
											}

											WorldMapManager.insertMenuItemNoShift(var7[var11], class149.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 10725
										}
									}
								}
							}

							if (!var4.isFollower || !Client.followerOpsLowPriority) { // L: 10730
								WorldMapManager.insertMenuItemNoShift("Examine", class149.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 10731
							}
						}

					}
				}
			}
		}
	} // L: 10735
}
