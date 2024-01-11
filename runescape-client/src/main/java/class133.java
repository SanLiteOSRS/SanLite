import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
public class class133 implements class387 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1580;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1569;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1579;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1568;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1573;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1570;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1566;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1572;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1574;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1567;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1575;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1576;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1577;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1578;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1571;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1565;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1581;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1182447887
	)
	final int field1582;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 147537431
	)
	final int field1583;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 467810155
	)
	final int field1584;

	static {
		field1580 = new class133(0, 0, (String)null, -1, -1); // L: 46
		field1569 = new class133(1, 1, (String)null, 0, 2); // L: 47
		field1579 = new class133(2, 2, (String)null, 1, 2); // L: 48
		field1568 = new class133(3, 3, (String)null, 2, 2); // L: 49
		field1573 = new class133(4, 4, (String)null, 3, 1); // L: 50
		field1570 = new class133(5, 5, (String)null, 4, 1); // L: 51
		field1566 = new class133(6, 6, (String)null, 5, 1); // L: 52
		field1572 = new class133(7, 7, (String)null, 6, 3); // L: 53
		field1574 = new class133(8, 8, (String)null, 7, 3); // L: 54
		field1567 = new class133(9, 9, (String)null, 8, 3); // L: 55
		field1575 = new class133(10, 10, (String)null, 0, 7); // L: 56
		field1576 = new class133(11, 11, (String)null, 1, 7); // L: 57
		field1577 = new class133(12, 12, (String)null, 2, 7); // L: 58
		field1578 = new class133(13, 13, (String)null, 3, 7); // L: 59
		field1571 = new class133(14, 14, (String)null, 4, 7); // L: 60
		field1565 = new class133(15, 15, (String)null, 5, 7); // L: 61
		field1581 = new class133(16, 16, (String)null, 0, 5); // L: 62
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class133(int var1, int var2, String var3, int var4, int var5) {
		this.field1582 = var1; // L: 68
		this.field1583 = var2; // L: 69
		this.field1584 = var4; // L: 70
	} // L: 71

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "121"
	)
	int method3131() {
		return this.field1584; // L: 78
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-884190501"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1583; // L: 74
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "-1598969675"
	)
	@Export("ByteArrayPool_getArray")
	public static byte[] ByteArrayPool_getArray(int var0) {
		return WorldMapEvent.ByteArrayPool_getArrayBool(var0, false); // L: 120
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "949600783"
	)
	static final void method3139(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) { // L: 8569
			if (Client.isLowDetail && var0 != class113.Client_plane) { // L: 8570
				return;
			}

			long var8 = 0L; // L: 8571
			boolean var10 = true; // L: 8572
			boolean var11 = false; // L: 8573
			boolean var12 = false; // L: 8574
			if (var1 == 0) { // L: 8575
				var8 = GrandExchangeOfferOwnWorldComparator.scene.getWallObjectTag(var0, var2, var3);
			}

			if (var1 == 1) { // L: 8576
				var8 = GrandExchangeOfferOwnWorldComparator.scene.getDecorativeObjectTag(var0, var2, var3);
			}

			if (var1 == 2) { // L: 8577
				var8 = GrandExchangeOfferOwnWorldComparator.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) { // L: 8578
				var8 = GrandExchangeOfferOwnWorldComparator.scene.getGroundObjectTag(var0, var2, var3);
			}

			int var13;
			ObjectComposition var14;
			if (0L != var8) { // L: 8579
				var13 = GrandExchangeOfferOwnWorldComparator.scene.getObjectFlags(var0, var2, var3, var8); // L: 8580
				int var15 = class167.Entity_unpackID(var8); // L: 8581
				int var16 = var13 & 31; // L: 8582
				int var17 = var13 >> 6 & 3; // L: 8583
				var14 = class137.getObjectDefinition(var15); // L: 8584
				class351.method6891(var0, var2, var3, var14, var17); // L: 8585
				if (var1 == 0) { // L: 8586
					GrandExchangeOfferOwnWorldComparator.scene.method5399(var0, var2, var3); // L: 8587
					if (var14.interactType != 0) { // L: 8588
						Client.collisionMaps[var0].method4464(var2, var3, var16, var17, var14.boolean1);
					}
				}

				if (var1 == 1) {
					GrandExchangeOfferOwnWorldComparator.scene.method5400(var0, var2, var3); // L: 8590
				}

				if (var1 == 2) { // L: 8591
					GrandExchangeOfferOwnWorldComparator.scene.removeGameObject(var0, var2, var3); // L: 8592
					if (var2 + var14.sizeX > 103 || var3 + var14.sizeX > 103 || var2 + var14.sizeY > 103 || var3 + var14.sizeY > 103) { // L: 8593
						return;
					}

					if (var14.interactType != 0) { // L: 8594
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var14.sizeX, var14.sizeY, var17, var14.boolean1);
					}
				}

				if (var1 == 3) { // L: 8596
					GrandExchangeOfferOwnWorldComparator.scene.method5402(var0, var2, var3); // L: 8597
					if (var14.interactType == 1) { // L: 8598
						Client.collisionMaps[var0].method4473(var2, var3);
					}
				}
			}

			if (var4 >= 0) { // L: 8601
				var13 = var0; // L: 8602
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 8603
					var13 = var0 + 1;
				}

				Canvas.method332(var0, var13, var2, var3, var4, var5, var6, var7, GrandExchangeOfferOwnWorldComparator.scene, Client.collisionMaps[var0]); // L: 8604
				var14 = class137.getObjectDefinition(var4); // L: 8605
				if (var14 != null && var14.hasSound()) { // L: 8606
					class7.method47(var13, var2, var3, var14, var5); // L: 8607
				}
			}
		}

	} // L: 8611

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(Lds;IIII)V",
		garbageValue = "-1073338737"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3) {
		NPCComposition var4 = var0.definition; // L: 10352
		if (Client.menuOptionsCount < 400) { // L: 10353
			if (var4.transforms != null) { // L: 10354
				var4 = var4.transform();
			}

			if (var4 != null) { // L: 10355
				if (var4.isInteractable) { // L: 10356
					if (!var4.isFollower || Client.followerIndex == var1) { // L: 10357
						String var5 = var0.method2688(); // L: 10358
						int var6;
						if (var4.combatLevel != 0 && var0.field1192 != 0) { // L: 10359
							var6 = var0.field1192 != -1 ? var0.field1192 : var4.combatLevel; // L: 10360
							var5 = var5 + MusicPatchNode2.method6038(var6, class25.localPlayer.combatLevel) + " " + " (" + "level-" + var6 + ")"; // L: 10361
						}

						if (var4.isFollower && Client.followerOpsLowPriority) { // L: 10363
							class385.insertMenuItemNoShift("Examine", class208.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 10364
						}

						if (Client.isItemSelected == 1) { // L: 10367
							class385.insertMenuItemNoShift("Use", Client.field664 + " " + "->" + " " + class208.colorStartTag(16776960) + var5, 7, var1, var2, var3); // L: 10368
						} else if (Client.isSpellSelected) { // L: 10371
							if ((class60.field431 & 2) == 2) { // L: 10372
								class385.insertMenuItemNoShift(Client.field668, Client.field669 + " " + "->" + " " + class208.colorStartTag(16776960) + var5, 8, var1, var2, var3); // L: 10373
							}
						} else {
							var6 = var4.isFollower && Client.followerOpsLowPriority ? 2000 : 0; // L: 10378
							String[] var7 = var4.actions; // L: 10379
							int var8;
							int var9;
							if (var7 != null) { // L: 10380
								for (var8 = 4; var8 >= 0; --var8) { // L: 10381
									if (var0.method2659(var8) && var7[var8] != null && !var7[var8].equalsIgnoreCase("Attack")) { // L: 10382 10383
										var9 = 0; // L: 10384
										if (var8 == 0) { // L: 10385
											var9 = var6 + 9;
										}

										if (var8 == 1) { // L: 10386
											var9 = var6 + 10;
										}

										if (var8 == 2) { // L: 10387
											var9 = var6 + 11;
										}

										if (var8 == 3) { // L: 10388
											var9 = var6 + 12;
										}

										if (var8 == 4) { // L: 10389
											var9 = var6 + 13;
										}

										class385.insertMenuItemNoShift(var7[var8], class208.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 10390
									}
								}
							}

							if (var7 != null) { // L: 10395
								for (var8 = 4; var8 >= 0; --var8) { // L: 10396
									if (var0.method2659(var8) && var7[var8] != null && var7[var8].equalsIgnoreCase("Attack")) { // L: 10397 10398
										short var10 = 0; // L: 10399
										if (Client.npcAttackOption != AttackOption.AttackOption_hidden) { // L: 10400
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || Client.npcAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var4.combatLevel > class25.localPlayer.combatLevel) { // L: 10401
												var10 = 2000; // L: 10402
											}

											var9 = 0; // L: 10404
											if (var8 == 0) { // L: 10405
												var9 = var10 + 9;
											}

											if (var8 == 1) { // L: 10406
												var9 = var10 + 10;
											}

											if (var8 == 2) { // L: 10407
												var9 = var10 + 11;
											}

											if (var8 == 3) { // L: 10408
												var9 = var10 + 12;
											}

											if (var8 == 4) { // L: 10409
												var9 = var10 + 13;
											}

											class385.insertMenuItemNoShift(var7[var8], class208.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 10410
										}
									}
								}
							}

							if (!var4.isFollower || !Client.followerOpsLowPriority) { // L: 10415
								class385.insertMenuItemNoShift("Examine", class208.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 10416
							}
						}

					}
				}
			}
		}
	} // L: 10420
}
