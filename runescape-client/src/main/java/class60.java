import java.awt.FontMetrics;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
public class class60 {
	@ObfuscatedName("ay")
	static String[] field423;
	@ObfuscatedName("bc")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("az")
	byte[] field428;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1519305719
	)
	int field422;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -250105249
	)
	int field427;

	class60() {
		this.field428 = null; // L: 4
		this.field422 = 0; // L: 5
		this.field427 = 0; // L: 6
	} // L: 8

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "116"
	)
	int method1123(int var1) {
		int var2 = 0; // L: 11

		int var3;
		int var4;
		for (var3 = 0; var1 >= 8 - this.field427; var1 -= var4) { // L: 12 13 20
			var4 = 8 - this.field427; // L: 14
			int var5 = (1 << var4) - 1; // L: 15
			var2 += (this.field428[this.field422] >> this.field427 & var5) << var3; // L: 16
			this.field427 = 0; // L: 17
			++this.field422; // L: 18
			var3 += var4; // L: 19
		}

		if (var1 > 0) { // L: 22
			var4 = (1 << var1) - 1; // L: 23
			var2 += (this.field428[this.field422] >> this.field427 & var4) << var3; // L: 24
			this.field427 += var1; // L: 25
		}

		return var2; // L: 27
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "981865000"
	)
	int method1124() {
		int var1 = this.field428[this.field422] >> this.field427 & 1; // L: 31
		++this.field427; // L: 32
		this.field422 += this.field427 >> 3; // L: 33
		this.field427 &= 7; // L: 34
		return var1; // L: 35
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([BII)V",
		garbageValue = "640013743"
	)
	void method1134(byte[] var1, int var2) {
		this.field428 = var1; // L: 39
		this.field422 = var2; // L: 40
		this.field427 = 0; // L: 41
	} // L: 42

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)[Lek;",
		garbageValue = "1"
	)
	static class129[] method1135() {
		return new class129[]{class129.field1548, class129.field1546, class129.field1545, class129.field1547, class129.field1544}; // L: 143
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "([BIILjp;[Lix;B)V",
		garbageValue = "-26"
	)
	static final void method1129(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
		Buffer var5 = new Buffer(var0); // L: 272
		int var6 = -1; // L: 273

		while (true) {
			int var7 = var5.method9283(); // L: 275
			if (var7 == 0) { // L: 276
				return; // L: 300
			}

			var6 += var7; // L: 277
			int var8 = 0; // L: 278

			while (true) {
				int var9 = var5.readUShortSmart(); // L: 280
				if (var9 == 0) { // L: 281
					break;
				}

				var8 += var9 - 1; // L: 282
				int var10 = var8 & 63; // L: 283
				int var11 = var8 >> 6 & 63; // L: 284
				int var12 = var8 >> 12; // L: 285
				int var13 = var5.readUnsignedByte(); // L: 286
				int var14 = var13 >> 2; // L: 287
				int var15 = var13 & 3; // L: 288
				int var16 = var11 + var1; // L: 289
				int var17 = var10 + var2; // L: 290
				if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) { // L: 291
					int var18 = var12; // L: 292
					if ((Tiles.Tiles_renderFlags[1][var16][var17] & 2) == 2) { // L: 293
						var18 = var12 - 1;
					}

					CollisionMap var19 = null; // L: 294
					if (var18 >= 0) { // L: 295
						var19 = var4[var18];
					}

					DesktopPlatformInfoProvider.addObjects(var12, var16, var17, var6, var15, var14, var3, var19); // L: 296
				}
			}
		}
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(III)Liw;",
		garbageValue = "1760473399"
	)
	static RouteStrategy method1132(int var0, int var1) {
		Client.field814.approxDestinationX = var0; // L: 9232
		Client.field814.approxDestinationY = var1; // L: 9233
		Client.field814.approxDestinationSizeX = 1; // L: 9234
		Client.field814.approxDestinationSizeY = 1; // L: 9235
		return Client.field814; // L: 9236
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(Ldk;IIII)V",
		garbageValue = "-1057922660"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3) {
		NPCComposition var4 = var0.definition; // L: 10472
		if (Client.menuOptionsCount < 400) { // L: 10473
			if (var4.transforms != null) { // L: 10474
				var4 = var4.transform();
			}

			if (var4 != null) { // L: 10475
				if (var4.isInteractable) { // L: 10476
					if (!var4.field2134 || Client.followerIndex == var1) { // L: 10477
						String var5 = var0.method2584(); // L: 10478
						int var6;
						int var9;
						if (var4.combatLevel != 0 && var0.field1275 != 0) { // L: 10479
							var6 = var0.field1275 != -1 ? var0.field1275 : var4.combatLevel; // L: 10480
							var9 = class133.localPlayer.combatLevel; // L: 10483
							int var10 = var9 - var6; // L: 10485
							String var8;
							if (var10 < -9) { // L: 10486
								var8 = Decimator.colorStartTag(16711680); // L: 10487
							} else if (var10 < -6) { // L: 10490
								var8 = Decimator.colorStartTag(16723968); // L: 10491
							} else if (var10 < -3) { // L: 10494
								var8 = Decimator.colorStartTag(16740352); // L: 10495
							} else if (var10 < 0) { // L: 10498
								var8 = Decimator.colorStartTag(16756736); // L: 10499
							} else if (var10 > 9) { // L: 10502
								var8 = Decimator.colorStartTag(65280); // L: 10503
							} else if (var10 > 6) { // L: 10506
								var8 = Decimator.colorStartTag(4259584); // L: 10507
							} else if (var10 > 3) { // L: 10510
								var8 = Decimator.colorStartTag(8453888); // L: 10511
							} else if (var10 > 0) { // L: 10514
								var8 = Decimator.colorStartTag(12648192); // L: 10515
							} else {
								var8 = Decimator.colorStartTag(16776960); // L: 10518
							}

							var5 = var5 + var8 + " " + " (" + "level-" + var6 + ")"; // L: 10520
						}

						if (var4.isFollower && Client.followerOpsLowPriority) { // L: 10522
							Interpreter.insertMenuItemNoShift("Examine", Decimator.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 10523
						}

						if (Client.isItemSelected == 1) { // L: 10526
							Interpreter.insertMenuItemNoShift("Use", Client.field676 + " " + "->" + " " + Decimator.colorStartTag(16776960) + var5, 7, var1, var2, var3); // L: 10527
						} else if (Client.isSpellSelected) { // L: 10530
							if ((class352.field3905 & 2) == 2) { // L: 10531
								Interpreter.insertMenuItemNoShift(Client.field557, Client.field801 + " " + "->" + " " + Decimator.colorStartTag(16776960) + var5, 8, var1, var2, var3); // L: 10532
							}
						} else {
							var6 = var4.isFollower && Client.followerOpsLowPriority ? 2000 : 0; // L: 10537
							String[] var7 = var4.actions; // L: 10538
							int var11;
							if (var7 != null) { // L: 10539
								for (var11 = 4; var11 >= 0; --var11) { // L: 10540
									if (var0.method2583(var11) && var7[var11] != null && !var7[var11].equalsIgnoreCase("Attack")) { // L: 10541 10542
										var9 = 0; // L: 10543
										if (var11 == 0) { // L: 10544
											var9 = var6 + 9;
										}

										if (var11 == 1) { // L: 10545
											var9 = var6 + 10;
										}

										if (var11 == 2) { // L: 10546
											var9 = var6 + 11;
										}

										if (var11 == 3) { // L: 10547
											var9 = var6 + 12;
										}

										if (var11 == 4) { // L: 10548
											var9 = var6 + 13;
										}

										Interpreter.insertMenuItemNoShift(var7[var11], Decimator.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 10549
									}
								}
							}

							if (var7 != null) { // L: 10554
								for (var11 = 4; var11 >= 0; --var11) { // L: 10555
									if (var0.method2583(var11) && var7[var11] != null && var7[var11].equalsIgnoreCase("Attack")) { // L: 10556 10557
										short var12 = 0; // L: 10558
										if (Client.npcAttackOption != AttackOption.AttackOption_hidden) { // L: 10559
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || Client.npcAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var4.combatLevel > class133.localPlayer.combatLevel) { // L: 10560
												var12 = 2000; // L: 10561
											}

											var9 = 0; // L: 10563
											if (var11 == 0) { // L: 10564
												var9 = var12 + 9;
											}

											if (var11 == 1) { // L: 10565
												var9 = var12 + 10;
											}

											if (var11 == 2) { // L: 10566
												var9 = var12 + 11;
											}

											if (var11 == 3) { // L: 10567
												var9 = var12 + 12;
											}

											if (var11 == 4) { // L: 10568
												var9 = var12 + 13;
											}

											Interpreter.insertMenuItemNoShift(var7[var11], Decimator.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 10569
										}
									}
								}
							}

							if (!var4.isFollower || !Client.followerOpsLowPriority) { // L: 10574
								Interpreter.insertMenuItemNoShift("Examine", Decimator.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 10575
							}
						}

					}
				}
			}
		}
	} // L: 10579
}
