import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
public class class329 {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	static IndexedSprite field4091;

	static {
		new HashMap();
	} // L: 9

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(Lcq;IIIB)V",
		garbageValue = "-125"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (ScriptFrame.localPlayer != var0) { // L: 9689
			if (Client.menuOptionsCount < 400) { // L: 9690
				String var4;
				int var7;
				if (var0.skillLevel == 0) { // L: 9692
					String var5 = var0.actions[0] + var0.username + var0.actions[1]; // L: 9693
					var7 = var0.combatLevel; // L: 9695
					int var8 = ScriptFrame.localPlayer.combatLevel; // L: 9696
					int var9 = var8 - var7; // L: 9698
					String var6;
					if (var9 < -9) { // L: 9699
						var6 = Clock.colorStartTag(16711680); // L: 9700
					} else if (var9 < -6) { // L: 9703
						var6 = Clock.colorStartTag(16723968); // L: 9704
					} else if (var9 < -3) { // L: 9707
						var6 = Clock.colorStartTag(16740352); // L: 9708
					} else if (var9 < 0) { // L: 9711
						var6 = Clock.colorStartTag(16756736); // L: 9712
					} else if (var9 > 9) { // L: 9715
						var6 = Clock.colorStartTag(65280); // L: 9716
					} else if (var9 > 6) { // L: 9719
						var6 = Clock.colorStartTag(4259584); // L: 9720
					} else if (var9 > 3) { // L: 9723
						var6 = Clock.colorStartTag(8453888); // L: 9724
					} else if (var9 > 0) { // L: 9727
						var6 = Clock.colorStartTag(12648192); // L: 9728
					} else {
						var6 = Clock.colorStartTag(16776960); // L: 9731
					}

					var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2]; // L: 9733
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2]; // L: 9735
				}

				int var10;
				if (Client.isItemSelected == 1) { // L: 9736
					ChatChannel.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + Clock.colorStartTag(16777215) + var4, 14, var1, var2, var3); // L: 9737
				} else if (Client.isSpellSelected) { // L: 9740
					if ((class149.selectedSpellFlags & 8) == 8) { // L: 9741
						ChatChannel.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + Clock.colorStartTag(16777215) + var4, 15, var1, var2, var3); // L: 9742
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) { // L: 9747
						if (Client.playerMenuActions[var10] != null) { // L: 9748
							short var11 = 0; // L: 9749
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) { // L: 9750
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) { // L: 9751
									continue;
								}

								if (AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption || AttackOption.AttackOption_dependsOnCombatLevels == Client.playerAttackOption && var0.combatLevel > ScriptFrame.localPlayer.combatLevel) { // L: 9752
									var11 = 2000; // L: 9753
								}

								if (ScriptFrame.localPlayer.team != 0 && var0.team != 0) { // L: 9755
									if (var0.team == ScriptFrame.localPlayer.team) { // L: 9756
										var11 = 2000;
									} else {
										var11 = 0; // L: 9757
									}
								} else if (AttackOption.field1287 == Client.playerAttackOption && var0.isClanMember()) { // L: 9759
									var11 = 2000; // L: 9760
								}
							} else if (Client.playerOptionsPriorities[var10]) { // L: 9763
								var11 = 2000;
							}

							boolean var12 = false; // L: 9764
							var7 = Client.playerMenuOpcodes[var10] + var11; // L: 9765
							ChatChannel.insertMenuItemNoShift(Client.playerMenuActions[var10], Clock.colorStartTag(16777215) + var4, var7, var1, var2, var3); // L: 9766
						}
					}
				}

				for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) { // L: 9771
					if (Client.menuOpcodes[var10] == 23) { // L: 9772
						Client.menuTargets[var10] = Clock.colorStartTag(16777215) + var4; // L: 9773
						break;
					}
				}

			}
		}
	} // L: 9777
}
