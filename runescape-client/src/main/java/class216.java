import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
public class class216 extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	static EvictingDualNodeHashTable field2207;

	static {
		field2207 = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(Ldi;IIIB)V",
		garbageValue = "106"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (class133.localPlayer != var0) { // L: 10582
			if (Client.menuOptionsCount < 400) { // L: 10583
				String var4;
				int var7;
				if (var0.skillLevel == 0) { // L: 10585
					String var5 = var0.actions[0] + var0.username + var0.actions[1]; // L: 10586
					var7 = var0.combatLevel; // L: 10588
					int var8 = class133.localPlayer.combatLevel; // L: 10589
					int var9 = var8 - var7; // L: 10591
					String var6;
					if (var9 < -9) { // L: 10592
						var6 = Decimator.colorStartTag(16711680); // L: 10593
					} else if (var9 < -6) { // L: 10596
						var6 = Decimator.colorStartTag(16723968); // L: 10597
					} else if (var9 < -3) { // L: 10600
						var6 = Decimator.colorStartTag(16740352); // L: 10601
					} else if (var9 < 0) { // L: 10604
						var6 = Decimator.colorStartTag(16756736); // L: 10605
					} else if (var9 > 9) { // L: 10608
						var6 = Decimator.colorStartTag(65280); // L: 10609
					} else if (var9 > 6) { // L: 10612
						var6 = Decimator.colorStartTag(4259584); // L: 10613
					} else if (var9 > 3) { // L: 10616
						var6 = Decimator.colorStartTag(8453888); // L: 10617
					} else if (var9 > 0) { // L: 10620
						var6 = Decimator.colorStartTag(12648192); // L: 10621
					} else {
						var6 = Decimator.colorStartTag(16776960); // L: 10624
					}

					var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2]; // L: 10626
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2]; // L: 10628
				}

				int var10;
				if (Client.isItemSelected == 1) { // L: 10629
					Interpreter.insertMenuItemNoShift("Use", Client.field676 + " " + "->" + " " + Decimator.colorStartTag(16777215) + var4, 14, var1, var2, var3); // L: 10630
				} else if (Client.isSpellSelected) { // L: 10633
					if ((class352.field3905 & 8) == 8) { // L: 10634
						Interpreter.insertMenuItemNoShift(Client.field557, Client.field801 + " " + "->" + " " + Decimator.colorStartTag(16777215) + var4, 15, var1, var2, var3); // L: 10635
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) { // L: 10640
						if (Client.playerMenuActions[var10] != null) { // L: 10641
							short var11 = 0; // L: 10642
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) { // L: 10643
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) { // L: 10644
									continue;
								}

								if (Client.playerAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.playerAttackOption && var0.combatLevel > class133.localPlayer.combatLevel) { // L: 10645
									var11 = 2000; // L: 10646
								}

								if (class133.localPlayer.team != 0 && var0.team != 0) { // L: 10648
									if (var0.team == class133.localPlayer.team) { // L: 10649
										var11 = 2000;
									} else {
										var11 = 0; // L: 10650
									}
								} else if (Client.playerAttackOption == AttackOption.field1360 && var0.isClanMember()) { // L: 10652
									var11 = 2000; // L: 10653
								}
							} else if (Client.playerOptionsPriorities[var10]) { // L: 10656
								var11 = 2000;
							}

							boolean var12 = false; // L: 10657
							var7 = Client.playerMenuOpcodes[var10] + var11; // L: 10658
							Interpreter.insertMenuItemNoShift(Client.playerMenuActions[var10], Decimator.colorStartTag(16777215) + var4, var7, var1, var2, var3); // L: 10659
						}
					}
				}

				for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) { // L: 10664
					if (Client.menuOpcodes[var10] == 23) { // L: 10665
						Client.menuTargets[var10] = Decimator.colorStartTag(16777215) + var4; // L: 10666
						break;
					}
				}

			}
		}
	} // L: 10670
}
