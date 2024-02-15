import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -761555779
	)
	@Export("id")
	int id;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1093331411
	)
	@Export("count")
	int count;
	@ObfuscatedName("az")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("ao")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	class272 field2844;

	public Skeleton(int var1, byte[] var2) {
		this.id = var1; // L: 19
		Buffer var3 = new Buffer(var2); // L: 20
		this.count = var3.readUnsignedByte(); // L: 21
		this.transformTypes = new int[this.count]; // L: 22
		this.labels = new int[this.count][]; // L: 23

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) { // L: 24
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 25
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 26
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) { // L: 27
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

		if (var3.offset < var3.array.length) {
			var4 = var3.readUnsignedShort();
			if (var4 > 0) { // L: 31
				this.field2844 = new class272(var3, var4);
			}
		}

	} // L: 35

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1917649997"
	)
	public int method5411() {
		return this.count; // L: 38
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lkn;",
		garbageValue = "1746723062"
	)
	public class272 method5414() {
		return this.field2844; // L: 42
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lmx;B)V",
		garbageValue = "49"
	)
	public static void method5417(class327 var0) {
		if (!class321.field3482.contains(var0)) { // L: 29
			class321.field3482.add(var0); // L: 30
		}

	} // L: 32

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ILng;IIIII[FI)Lng;",
		garbageValue = "148959513"
	)
	static Widget method5418(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget(); // L: 807
		var8.type = var0; // L: 808
		var8.parentId = var1.id; // L: 809
		var8.childIndex = var2; // L: 810
		var8.isIf3 = true; // L: 811
		var8.xAlignment = var3; // L: 812
		var8.yAlignment = var4; // L: 813
		var8.widthAlignment = var5; // L: 814
		var8.heightAlignment = var6; // L: 815
		var8.rawX = (int)(var7[0] * (float)var1.width); // L: 816
		var8.rawY = (int)((float)var1.height * var7[1]); // L: 817
		var8.rawWidth = (int)((float)var1.width * var7[2]); // L: 818
		var8.rawHeight = (int)(var7[3] * (float)var1.height); // L: 819
		return var8; // L: 820
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1024699735"
	)
	static int method5416(int var0) {
		return (int)Math.pow(2.0D, (double)(7.0F + (float)var0 / 256.0F)); // L: 4461
	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIII)V",
		garbageValue = "187746341"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3) {
		NPCComposition var4 = var0.definition; // L: 10453
		if (Client.menuOptionsCount < 400) { // L: 10454
			if (var4.transforms != null) { // L: 10455
				var4 = var4.transform();
			}

			if (var4 != null) { // L: 10456
				if (var4.isInteractable) { // L: 10457
					if (!var4.field2005 || Client.followerIndex == var1) { // L: 10458
						String var5 = var0.method2670(); // L: 10459
						int var6;
						int var9;
						if (var4.combatLevel != 0 && var0.field1270 != 0) { // L: 10460
							var6 = var0.field1270 != -1 ? var0.field1270 : var4.combatLevel; // L: 10461
							var9 = VarpDefinition.localPlayer.combatLevel; // L: 10464
							int var10 = var9 - var6; // L: 10466
							String var8;
							if (var10 < -9) { // L: 10467
								var8 = class370.colorStartTag(16711680); // L: 10468
							} else if (var10 < -6) { // L: 10471
								var8 = class370.colorStartTag(16723968); // L: 10472
							} else if (var10 < -3) { // L: 10475
								var8 = class370.colorStartTag(16740352); // L: 10476
							} else if (var10 < 0) { // L: 10479
								var8 = class370.colorStartTag(16756736); // L: 10480
							} else if (var10 > 9) { // L: 10483
								var8 = class370.colorStartTag(65280); // L: 10484
							} else if (var10 > 6) { // L: 10487
								var8 = class370.colorStartTag(4259584); // L: 10488
							} else if (var10 > 3) { // L: 10491
								var8 = class370.colorStartTag(8453888); // L: 10492
							} else if (var10 > 0) { // L: 10495
								var8 = class370.colorStartTag(12648192); // L: 10496
							} else {
								var8 = class370.colorStartTag(16776960); // L: 10499
							}

							var5 = var5 + var8 + " " + " (" + "level-" + var6 + ")"; // L: 10501
						}

						if (var4.isFollower && Client.followerOpsLowPriority) { // L: 10503
							UrlRequest.insertMenuItemNoShift("Examine", class370.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 10504
						}

						if (Client.isItemSelected == 1) { // L: 10507
							UrlRequest.insertMenuItemNoShift("Use", Client.field822 + " " + "->" + " " + class370.colorStartTag(16776960) + var5, 7, var1, var2, var3); // L: 10508
						} else if (Client.isSpellSelected) { // L: 10511
							if ((class128.field1520 & 2) == 2) { // L: 10512
								UrlRequest.insertMenuItemNoShift(Client.field696, Client.field574 + " " + "->" + " " + class370.colorStartTag(16776960) + var5, 8, var1, var2, var3); // L: 10513
							}
						} else {
							var6 = var4.isFollower && Client.followerOpsLowPriority ? 2000 : 0; // L: 10518
							String[] var7 = var4.actions; // L: 10519
							int var11;
							if (var7 != null) { // L: 10520
								for (var11 = 4; var11 >= 0; --var11) { // L: 10521
									if (var0.method2663(var11) && var7[var11] != null && !var7[var11].equalsIgnoreCase("Attack")) { // L: 10522 10523
										var9 = 0; // L: 10524
										if (var11 == 0) { // L: 10525
											var9 = var6 + 9;
										}

										if (var11 == 1) { // L: 10526
											var9 = var6 + 10;
										}

										if (var11 == 2) { // L: 10527
											var9 = var6 + 11;
										}

										if (var11 == 3) { // L: 10528
											var9 = var6 + 12;
										}

										if (var11 == 4) { // L: 10529
											var9 = var6 + 13;
										}

										UrlRequest.insertMenuItemNoShift(var7[var11], class370.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 10530
									}
								}
							}

							if (var7 != null) { // L: 10535
								for (var11 = 4; var11 >= 0; --var11) { // L: 10536
									if (var0.method2663(var11) && var7[var11] != null && var7[var11].equalsIgnoreCase("Attack")) { // L: 10537 10538
										short var12 = 0; // L: 10539
										if (AttackOption.AttackOption_hidden != Client.npcAttackOption) { // L: 10540
											if (AttackOption.AttackOption_alwaysRightClick == Client.npcAttackOption || AttackOption.AttackOption_dependsOnCombatLevels == Client.npcAttackOption && var4.combatLevel > VarpDefinition.localPlayer.combatLevel) { // L: 10541
												var12 = 2000; // L: 10542
											}

											var9 = 0; // L: 10544
											if (var11 == 0) { // L: 10545
												var9 = var12 + 9;
											}

											if (var11 == 1) { // L: 10546
												var9 = var12 + 10;
											}

											if (var11 == 2) { // L: 10547
												var9 = var12 + 11;
											}

											if (var11 == 3) { // L: 10548
												var9 = var12 + 12;
											}

											if (var11 == 4) { // L: 10549
												var9 = var12 + 13;
											}

											UrlRequest.insertMenuItemNoShift(var7[var11], class370.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 10550
										}
									}
								}
							}

							if (!var4.isFollower || !Client.followerOpsLowPriority) { // L: 10555
								UrlRequest.insertMenuItemNoShift("Examine", class370.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 10556
							}
						}

					}
				}
			}
		}
	} // L: 10560
}
