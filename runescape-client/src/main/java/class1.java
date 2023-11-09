import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("an")
public class class1 implements Callable {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 2000420327
	)
	static int field4;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "[Ltj;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	final Buffer field3;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	final class3 field5;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lak;Ltz;Las;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1; // L: 47
		this.field3 = var2; // L: 48
		this.field5 = var3; // L: 49
	} // L: 50

	public Object call() {
		return this.field5.vmethod10(this.field3); // L: 54
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-691860209"
	)
	public static String method9(String var0) {
		return var0 != null && !var0.isEmpty() && var0.charAt(0) != '#' ? var0 : ""; // L: 146 147
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-55"
	)
	static final void method3() {
		int[] var0 = Players.Players_indices; // L: 3863

		int var1;
		for (var1 = 0; var1 < Players.Players_count; ++var1) { // L: 3864
			Player var4 = Client.players[var0[var1]]; // L: 3865
			if (var4 != null && var4.overheadTextCyclesRemaining > 0) { // L: 3866
				--var4.overheadTextCyclesRemaining; // L: 3867
				if (var4.overheadTextCyclesRemaining == 0) { // L: 3868
					var4.overheadText = null;
				}
			}
		}

		for (var1 = 0; var1 < Client.npcCount; ++var1) { // L: 3871
			int var2 = Client.npcIndices[var1]; // L: 3872
			NPC var3 = Client.npcs[var2]; // L: 3873
			if (var3 != null && var3.overheadTextCyclesRemaining > 0) { // L: 3874
				--var3.overheadTextCyclesRemaining; // L: 3875
				if (var3.overheadTextCyclesRemaining == 0) { // L: 3876
					var3.overheadText = null;
				}
			}
		}

	} // L: 3879

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(Ldh;IIII)V",
		garbageValue = "1283151153"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (Projectile.localPlayer != var0) { // L: 10456
			if (Client.menuOptionsCount < 400) { // L: 10457
				String var4;
				int var7;
				if (var0.skillLevel == 0) { // L: 10459
					String var5 = var0.actions[0] + var0.username + var0.actions[1]; // L: 10460
					var7 = var0.combatLevel; // L: 10462
					int var8 = Projectile.localPlayer.combatLevel; // L: 10463
					int var9 = var8 - var7; // L: 10465
					String var6;
					if (var9 < -9) { // L: 10466
						var6 = class349.colorStartTag(16711680); // L: 10467
					} else if (var9 < -6) { // L: 10470
						var6 = class349.colorStartTag(16723968); // L: 10471
					} else if (var9 < -3) { // L: 10474
						var6 = class349.colorStartTag(16740352); // L: 10475
					} else if (var9 < 0) { // L: 10478
						var6 = class349.colorStartTag(16756736); // L: 10479
					} else if (var9 > 9) { // L: 10482
						var6 = class349.colorStartTag(65280); // L: 10483
					} else if (var9 > 6) { // L: 10486
						var6 = class349.colorStartTag(4259584); // L: 10487
					} else if (var9 > 3) { // L: 10490
						var6 = class349.colorStartTag(8453888); // L: 10491
					} else if (var9 > 0) { // L: 10494
						var6 = class349.colorStartTag(12648192); // L: 10495
					} else {
						var6 = class349.colorStartTag(16776960); // L: 10498
					}

					var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2]; // L: 10500
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2]; // L: 10502
				}

				int var10;
				if (Client.isItemSelected == 1) { // L: 10503
					class138.insertMenuItemNoShift("Use", Client.field667 + " " + "->" + " " + class349.colorStartTag(16777215) + var4, 14, var1, var2, var3); // L: 10504
				} else if (Client.isSpellSelected) { // L: 10507
					if ((class125.selectedSpellFlags & 8) == 8) { // L: 10508
						class138.insertMenuItemNoShift(Client.field671, Client.field716 + " " + "->" + " " + class349.colorStartTag(16777215) + var4, 15, var1, var2, var3); // L: 10509
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) { // L: 10514
						if (Client.playerMenuActions[var10] != null) { // L: 10515
							short var11 = 0; // L: 10516
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) { // L: 10517
								if (AttackOption.AttackOption_hidden == Client.playerAttackOption) { // L: 10518
									continue;
								}

								if (AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption || AttackOption.AttackOption_dependsOnCombatLevels == Client.playerAttackOption && var0.combatLevel > Projectile.localPlayer.combatLevel) { // L: 10519
									var11 = 2000; // L: 10520
								}

								if (Projectile.localPlayer.team != 0 && var0.team != 0) { // L: 10522
									if (var0.team == Projectile.localPlayer.team) { // L: 10523
										var11 = 2000;
									} else {
										var11 = 0; // L: 10524
									}
								} else if (AttackOption.field1307 == Client.playerAttackOption && var0.isClanMember()) { // L: 10526
									var11 = 2000; // L: 10527
								}
							} else if (Client.playerOptionsPriorities[var10]) { // L: 10530
								var11 = 2000;
							}

							boolean var12 = false; // L: 10531
							var7 = Client.playerMenuOpcodes[var10] + var11; // L: 10532
							class138.insertMenuItemNoShift(Client.playerMenuActions[var10], class349.colorStartTag(16777215) + var4, var7, var1, var2, var3); // L: 10533
						}
					}
				}

				for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) { // L: 10538
					if (Client.menuOpcodes[var10] == 23) { // L: 10539
						Client.menuTargets[var10] = class349.colorStartTag(16777215) + var4; // L: 10540
						break;
					}
				}

			}
		}
	} // L: 10544

	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-693827652"
	)
	static void method6(boolean var0) {
		Client.field648 = var0; // L: 12784
	} // L: 12785
}
