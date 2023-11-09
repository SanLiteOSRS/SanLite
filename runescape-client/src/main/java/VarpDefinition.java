import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("VarpDefinition_archive")
	public static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 775233713
	)
	public static int field1904;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("VarpDefinition_cached")
	public static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("hr")
	static String field1910;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1122888819
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	VarpDefinition() {
		this.type = 0; // L: 13
	} // L: 15

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "1223419566"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 29
			if (var2 == 0) { // L: 30
				return; // L: 33
			}

			this.decodeNext(var1, var2); // L: 31
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lty;II)V",
		garbageValue = "512935442"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) { // L: 36
			this.type = var1.readUnsignedShort();
		}

	} // L: 38

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(Ldh;IIIB)V",
		garbageValue = "33"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3) {
		NPCComposition var4 = var0.definition; // L: 10421
		if (Client.menuOptionsCount < 400) { // L: 10422
			if (var4.transforms != null) { // L: 10423
				var4 = var4.transform();
			}

			if (var4 != null) { // L: 10424
				if (var4.isInteractable) { // L: 10425
					if (!var4.isFollower || Client.followerIndex == var1) { // L: 10426
						String var5 = var0.method2591(); // L: 10427
						int var6;
						int var9;
						if (var4.combatLevel != 0 && var0.field1258 != 0) { // L: 10428
							var6 = var0.field1258 != -1 ? var0.field1258 : var4.combatLevel; // L: 10429
							var9 = class136.localPlayer.combatLevel; // L: 10432
							int var10 = var9 - var6; // L: 10434
							String var8;
							if (var10 < -9) { // L: 10435
								var8 = MusicPatchPcmStream.colorStartTag(16711680); // L: 10436
							} else if (var10 < -6) { // L: 10439
								var8 = MusicPatchPcmStream.colorStartTag(16723968); // L: 10440
							} else if (var10 < -3) { // L: 10443
								var8 = MusicPatchPcmStream.colorStartTag(16740352); // L: 10444
							} else if (var10 < 0) { // L: 10447
								var8 = MusicPatchPcmStream.colorStartTag(16756736); // L: 10448
							} else if (var10 > 9) { // L: 10451
								var8 = MusicPatchPcmStream.colorStartTag(65280); // L: 10452
							} else if (var10 > 6) { // L: 10455
								var8 = MusicPatchPcmStream.colorStartTag(4259584); // L: 10456
							} else if (var10 > 3) { // L: 10459
								var8 = MusicPatchPcmStream.colorStartTag(8453888); // L: 10460
							} else if (var10 > 0) { // L: 10463
								var8 = MusicPatchPcmStream.colorStartTag(12648192); // L: 10464
							} else {
								var8 = MusicPatchPcmStream.colorStartTag(16776960); // L: 10467
							}

							var5 = var5 + var8 + " " + " (" + "level-" + var6 + ")"; // L: 10469
						}

						if (var4.isFollower && Client.followerOpsLowPriority) { // L: 10471
							JagexCache.insertMenuItemNoShift("Examine", MusicPatchPcmStream.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 10472
						}

						if (Client.isItemSelected == 1) { // L: 10475
							JagexCache.insertMenuItemNoShift("Use", Client.field557 + " " + "->" + " " + MusicPatchPcmStream.colorStartTag(16776960) + var5, 7, var1, var2, var3); // L: 10476
						} else if (Client.isSpellSelected) { // L: 10479
							if ((PcmPlayer.selectedSpellFlags & 2) == 2) { // L: 10480
								JagexCache.insertMenuItemNoShift(Client.field636, Client.field734 + " " + "->" + " " + MusicPatchPcmStream.colorStartTag(16776960) + var5, 8, var1, var2, var3); // L: 10481
							}
						} else {
							var6 = var4.isFollower && Client.followerOpsLowPriority ? 2000 : 0; // L: 10486
							String[] var7 = var4.actions; // L: 10487
							int var11;
							if (var7 != null) { // L: 10488
								for (var11 = 4; var11 >= 0; --var11) { // L: 10489
									if (var0.method2590(var11) && var7[var11] != null && !var7[var11].equalsIgnoreCase("Attack")) { // L: 10490 10491
										var9 = 0; // L: 10492
										if (var11 == 0) { // L: 10493
											var9 = var6 + 9;
										}

										if (var11 == 1) { // L: 10494
											var9 = var6 + 10;
										}

										if (var11 == 2) { // L: 10495
											var9 = var6 + 11;
										}

										if (var11 == 3) { // L: 10496
											var9 = var6 + 12;
										}

										if (var11 == 4) { // L: 10497
											var9 = var6 + 13;
										}

										JagexCache.insertMenuItemNoShift(var7[var11], MusicPatchPcmStream.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 10498
									}
								}
							}

							if (var7 != null) { // L: 10503
								for (var11 = 4; var11 >= 0; --var11) { // L: 10504
									if (var0.method2590(var11) && var7[var11] != null && var7[var11].equalsIgnoreCase("Attack")) { // L: 10505 10506
										short var12 = 0; // L: 10507
										if (AttackOption.AttackOption_hidden != Client.npcAttackOption) { // L: 10508
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || Client.npcAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var4.combatLevel > class136.localPlayer.combatLevel) { // L: 10509
												var12 = 2000; // L: 10510
											}

											var9 = 0; // L: 10512
											if (var11 == 0) { // L: 10513
												var9 = var12 + 9;
											}

											if (var11 == 1) { // L: 10514
												var9 = var12 + 10;
											}

											if (var11 == 2) { // L: 10515
												var9 = var12 + 11;
											}

											if (var11 == 3) { // L: 10516
												var9 = var12 + 12;
											}

											if (var11 == 4) { // L: 10517
												var9 = var12 + 13;
											}

											JagexCache.insertMenuItemNoShift(var7[var11], MusicPatchPcmStream.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 10518
										}
									}
								}
							}

							if (!var4.isFollower || !Client.followerOpsLowPriority) { // L: 10523
								JagexCache.insertMenuItemNoShift("Examine", MusicPatchPcmStream.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 10524
							}
						}

					}
				}
			}
		}
	} // L: 10528
}
