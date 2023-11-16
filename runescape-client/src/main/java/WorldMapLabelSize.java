import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("ap")
	public static short[] field2440;
	@ObfuscatedName("as")
	static int[] field2441;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 38132727
	)
	final int field2437;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1290743797
	)
	final int field2438;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 25588645
	)
	final int field2436;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(0, 0, 4); // L: 7
		WorldMapLabelSize_medium = new WorldMapLabelSize(2, 1, 2); // L: 8
		WorldMapLabelSize_large = new WorldMapLabelSize(1, 2, 0); // L: 9
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field2437 = var1; // L: 15
		this.field2438 = var2; // L: 16
		this.field2436 = var3; // L: 17
	} // L: 18

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(FB)Z",
		garbageValue = "-28"
	)
	boolean method4486(float var1) {
		return var1 >= (float)this.field2436; // L: 21
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Lio;",
		garbageValue = "-1"
	)
	static WorldMapLabelSize method4487(int var0) {
		WorldMapLabelSize[] var1 = new WorldMapLabelSize[]{WorldMapLabelSize_large, WorldMapLabelSize_medium, WorldMapLabelSize_small}; // L: 28
		WorldMapLabelSize[] var2 = var1; // L: 30

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 31
			WorldMapLabelSize var4 = var2[var3]; // L: 32
			if (var0 == var4.field2438) { // L: 34
				return var4; // L: 35
			}
		}

		return null; // L: 40
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "-1950450301"
	)
	static Object method4488(int var0) {
		return class408.method7657((class514)class12.findEnumerated(class514.method9122(), var0)); // L: 5361
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(Lds;III)V",
		garbageValue = "-896511288"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) { // L: 4519
			int var3 = DynamicObject.SequenceDefinition_get(var1).field2230; // L: 4520
			if (var3 == 1) { // L: 4521
				var0.sequenceFrame = 0; // L: 4522
				var0.sequenceFrameCycle = 0; // L: 4523
				var0.sequenceDelay = var2; // L: 4524
				var0.field1199 = 0; // L: 4525
			}

			if (var3 == 2) { // L: 4527
				var0.field1199 = 0; // L: 4528
			}
		} else if (var1 == -1 || var0.sequence == -1 || DynamicObject.SequenceDefinition_get(var1).field2223 >= DynamicObject.SequenceDefinition_get(var0.sequence).field2223) { // L: 4531
			var0.sequence = var1; // L: 4532
			var0.sequenceFrame = 0; // L: 4533
			var0.sequenceFrameCycle = 0; // L: 4534
			var0.sequenceDelay = var2; // L: 4535
			var0.field1199 = 0; // L: 4536
			var0.field1220 = var0.pathLength; // L: 4537
		}

	} // L: 4539

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(Ldn;IIII)V",
		garbageValue = "-140985889"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3) {
		NPCComposition var4 = var0.definition; // L: 10542
		if (Client.menuOptionsCount < 400) { // L: 10543
			if (var4.transforms != null) { // L: 10544
				var4 = var4.transform();
			}

			if (var4 != null) { // L: 10545
				if (var4.isInteractable) { // L: 10546
					if (!var4.isFollower || Client.followerIndex == var1) { // L: 10547
						String var5 = var0.method2662(); // L: 10548
						int var6;
						if (var4.combatLevel != 0 && var0.field1247 != 0) { // L: 10549
							var6 = var0.field1247 != -1 ? var0.field1247 : var4.combatLevel; // L: 10550
							var5 = var5 + KeyHandler.method450(var6, class229.localPlayer.combatLevel) + " " + " (" + "level-" + var6 + ")"; // L: 10551
						}

						if (var4.isFollower && Client.followerOpsLowPriority) { // L: 10553
							WorldMapSectionType.insertMenuItemNoShift("Examine", class167.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 10554
						}

						if (Client.isItemSelected == 1) { // L: 10557
							WorldMapSectionType.insertMenuItemNoShift("Use", Client.field767 + " " + "->" + " " + class167.colorStartTag(16776960) + var5, 7, var1, var2, var3); // L: 10558
						} else if (Client.isSpellSelected) { // L: 10561
							if ((UrlRequest.field1430 & 2) == 2) { // L: 10562
								WorldMapSectionType.insertMenuItemNoShift(Client.field655, Client.field656 + " " + "->" + " " + class167.colorStartTag(16776960) + var5, 8, var1, var2, var3); // L: 10563
							}
						} else {
							var6 = var4.isFollower && Client.followerOpsLowPriority ? 2000 : 0; // L: 10568
							String[] var7 = var4.actions; // L: 10569
							int var8;
							int var9;
							if (var7 != null) { // L: 10570
								for (var8 = 4; var8 >= 0; --var8) { // L: 10571
									if (var0.method2661(var8) && var7[var8] != null && !var7[var8].equalsIgnoreCase("Attack")) { // L: 10572 10573
										var9 = 0; // L: 10574
										if (var8 == 0) { // L: 10575
											var9 = var6 + 9;
										}

										if (var8 == 1) { // L: 10576
											var9 = var6 + 10;
										}

										if (var8 == 2) { // L: 10577
											var9 = var6 + 11;
										}

										if (var8 == 3) { // L: 10578
											var9 = var6 + 12;
										}

										if (var8 == 4) { // L: 10579
											var9 = var6 + 13;
										}

										WorldMapSectionType.insertMenuItemNoShift(var7[var8], class167.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 10580
									}
								}
							}

							if (var7 != null) { // L: 10585
								for (var8 = 4; var8 >= 0; --var8) { // L: 10586
									if (var0.method2661(var8) && var7[var8] != null && var7[var8].equalsIgnoreCase("Attack")) { // L: 10587 10588
										short var10 = 0; // L: 10589
										if (Client.npcAttackOption != AttackOption.AttackOption_hidden) { // L: 10590
											if (AttackOption.AttackOption_alwaysRightClick == Client.npcAttackOption || AttackOption.AttackOption_dependsOnCombatLevels == Client.npcAttackOption && var4.combatLevel > class229.localPlayer.combatLevel) { // L: 10591
												var10 = 2000; // L: 10592
											}

											var9 = 0; // L: 10594
											if (var8 == 0) { // L: 10595
												var9 = var10 + 9;
											}

											if (var8 == 1) { // L: 10596
												var9 = var10 + 10;
											}

											if (var8 == 2) {
												var9 = var10 + 11; // L: 10597
											}

											if (var8 == 3) { // L: 10598
												var9 = var10 + 12;
											}

											if (var8 == 4) { // L: 10599
												var9 = var10 + 13;
											}

											WorldMapSectionType.insertMenuItemNoShift(var7[var8], class167.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 10600
										}
									}
								}
							}

							if (!var4.isFollower || !Client.followerOpsLowPriority) { // L: 10605
								WorldMapSectionType.insertMenuItemNoShift("Examine", class167.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 10606
							}
						}

					}
				}
			}
		}
	} // L: 10610
}
