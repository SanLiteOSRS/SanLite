import java.awt.Image;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("ae")
	static Image field1387;
	@ObfuscatedName("s")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnt;Lnt;I)I",
		garbageValue = "-168160417"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) { // L: 15
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 16
		} else {
			return this.compareUser(var1, var2); // L: 18
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 22
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1878271948"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9'; // L: 156
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lpk;I)Ljava/lang/Object;",
		garbageValue = "-774073741"
	)
	static Object method2593(class433 var0) {
		if (var0 == null) { // L: 5015
			throw new IllegalStateException("popValueOfType() failure - null baseVarType"); // L: 5016
		} else {
			switch(var0.field4657) { // L: 5018
			case 0:
				return Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 5024
			case 1:
				return Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 5022
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type"); // L: 5020
			}
		}
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(Lct;IIII)V",
		garbageValue = "1861235170"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3) {
		NPCComposition var4 = var0.definition; // L: 9581
		if (Client.menuOptionsCount < 400) { // L: 9582
			if (var4.transforms != null) { // L: 9583
				var4 = var4.transform();
			}

			if (var4 != null) { // L: 9584
				if (var4.isInteractable) { // L: 9585
					if (!var4.isFollower || Client.followerIndex == var1) { // L: 9586
						String var5 = var0.method2314(); // L: 9587
						int var6;
						int var9;
						if (var4.combatLevel != 0 && var0.field1202 != 0) { // L: 9588
							var6 = var0.field1202 != -1 ? var0.field1202 : var4.combatLevel; // L: 9589
							var9 = ScriptFrame.localPlayer.combatLevel; // L: 9592
							int var10 = var9 - var6; // L: 9594
							String var8;
							if (var10 < -9) { // L: 9595
								var8 = Clock.colorStartTag(16711680); // L: 9596
							} else if (var10 < -6) { // L: 9599
								var8 = Clock.colorStartTag(16723968); // L: 9600
							} else if (var10 < -3) { // L: 9603
								var8 = Clock.colorStartTag(16740352); // L: 9604
							} else if (var10 < 0) { // L: 9607
								var8 = Clock.colorStartTag(16756736); // L: 9608
							} else if (var10 > 9) { // L: 9611
								var8 = Clock.colorStartTag(65280); // L: 9612
							} else if (var10 > 6) { // L: 9615
								var8 = Clock.colorStartTag(4259584); // L: 9616
							} else if (var10 > 3) { // L: 9619
								var8 = Clock.colorStartTag(8453888); // L: 9620
							} else if (var10 > 0) { // L: 9623
								var8 = Clock.colorStartTag(12648192); // L: 9624
							} else {
								var8 = Clock.colorStartTag(16776960); // L: 9627
							}

							var5 = var5 + var8 + " " + " (" + "level-" + var6 + ")"; // L: 9629
						}

						if (var4.isFollower && Client.followerOpsLowPriority) { // L: 9631
							ChatChannel.insertMenuItemNoShift("Examine", Clock.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 9632
						}

						if (Client.isItemSelected == 1) { // L: 9635
							ChatChannel.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + Clock.colorStartTag(16776960) + var5, 7, var1, var2, var3); // L: 9636
						} else if (Client.isSpellSelected) { // L: 9639
							if ((class149.selectedSpellFlags & 2) == 2) { // L: 9640
								ChatChannel.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + Clock.colorStartTag(16776960) + var5, 8, var1, var2, var3); // L: 9641
							}
						} else {
							var6 = var4.isFollower && Client.followerOpsLowPriority ? 2000 : 0; // L: 9646
							String[] var7 = var4.actions; // L: 9647
							int var11;
							if (var7 != null) { // L: 9648
								for (var11 = 4; var11 >= 0; --var11) { // L: 9649
									if (var7[var11] != null && !var7[var11].equalsIgnoreCase("Attack")) { // L: 9650
										var9 = 0; // L: 9651
										if (var11 == 0) { // L: 9652
											var9 = var6 + 9;
										}

										if (var11 == 1) { // L: 9653
											var9 = var6 + 10;
										}

										if (var11 == 2) { // L: 9654
											var9 = var6 + 11;
										}

										if (var11 == 3) { // L: 9655
											var9 = var6 + 12;
										}

										if (var11 == 4) { // L: 9656
											var9 = var6 + 13;
										}

										ChatChannel.insertMenuItemNoShift(var7[var11], Clock.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 9657
									}
								}
							}

							if (var7 != null) { // L: 9662
								for (var11 = 4; var11 >= 0; --var11) { // L: 9663
									if (var7[var11] != null && var7[var11].equalsIgnoreCase("Attack")) { // L: 9664
										short var12 = 0; // L: 9665
										if (AttackOption.AttackOption_hidden != Client.npcAttackOption) { // L: 9666
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.npcAttackOption && var4.combatLevel > ScriptFrame.localPlayer.combatLevel) { // L: 9667
												var12 = 2000; // L: 9668
											}

											var9 = 0; // L: 9670
											if (var11 == 0) { // L: 9671
												var9 = var12 + 9;
											}

											if (var11 == 1) { // L: 9672
												var9 = var12 + 10;
											}

											if (var11 == 2) { // L: 9673
												var9 = var12 + 11;
											}

											if (var11 == 3) { // L: 9674
												var9 = var12 + 12;
											}

											if (var11 == 4) { // L: 9675
												var9 = var12 + 13;
											}

											ChatChannel.insertMenuItemNoShift(var7[var11], Clock.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 9676
										}
									}
								}
							}

							if (!var4.isFollower || !Client.followerOpsLowPriority) { // L: 9681
								ChatChannel.insertMenuItemNoShift("Examine", Clock.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 9682
							}
						}

					}
				}
			}
		}
	} // L: 9686
}
