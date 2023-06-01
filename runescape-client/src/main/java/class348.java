import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nf")
public class class348 {
	static {
		int var0 = 0; // L: 9
		int var1 = 0; // L: 10
		class343[] var2 = class218.method4222(); // L: 12

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 13
			class343 var4 = var2[var3]; // L: 14
			if (var4.field3853 > var0) {
				var0 = var4.field3853; // L: 16
			}

			if (var4.field3852 > var1) { // L: 17
				var1 = var4.field3852;
			}
		}

	} // L: 21

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(Ldy;IIIB)V",
		garbageValue = "23"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3) {
		NPCComposition var4 = var0.definition; // L: 10098
		if (Client.menuOptionsCount < 400) { // L: 10099
			if (var4.transforms != null) { // L: 10100
				var4 = var4.transform();
			}

			if (var4 != null) { // L: 10101
				if (var4.isInteractable) { // L: 10102
					if (!var4.isFollower || Client.followerIndex == var1) { // L: 10103
						String var5 = var0.method2552(); // L: 10104
						int var6;
						int var9;
						if (var4.combatLevel != 0 && var0.field1215 != 0) { // L: 10105
							var6 = var0.field1215 != -1 ? var0.field1215 : var4.combatLevel; // L: 10106
							var9 = HitSplatDefinition.localPlayer.combatLevel; // L: 10109
							int var10 = var9 - var6; // L: 10111
							String var8;
							if (var10 < -9) { // L: 10112
								var8 = class396.colorStartTag(16711680); // L: 10113
							} else if (var10 < -6) { // L: 10116
								var8 = class396.colorStartTag(16723968); // L: 10117
							} else if (var10 < -3) { // L: 10120
								var8 = class396.colorStartTag(16740352); // L: 10121
							} else if (var10 < 0) { // L: 10124
								var8 = class396.colorStartTag(16756736); // L: 10125
							} else if (var10 > 9) { // L: 10128
								var8 = class396.colorStartTag(65280); // L: 10129
							} else if (var10 > 6) { // L: 10132
								var8 = class396.colorStartTag(4259584); // L: 10133
							} else if (var10 > 3) { // L: 10136
								var8 = class396.colorStartTag(8453888); // L: 10137
							} else if (var10 > 0) { // L: 10140
								var8 = class396.colorStartTag(12648192); // L: 10141
							} else {
								var8 = class396.colorStartTag(16776960); // L: 10144
							}

							var5 = var5 + var8 + " " + " (" + "level-" + var6 + ")"; // L: 10146
						}

						if (var4.isFollower && Client.followerOpsLowPriority) { // L: 10148
							class388.insertMenuItemNoShift("Examine", class396.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 10149
						}

						if (Client.isItemSelected == 1) { // L: 10152
							class388.insertMenuItemNoShift("Use", Client.field644 + " " + "->" + " " + class396.colorStartTag(16776960) + var5, 7, var1, var2, var3); // L: 10153
						} else if (Client.isSpellSelected) { // L: 10156
							if ((SoundCache.selectedSpellFlags & 2) == 2) { // L: 10157
								class388.insertMenuItemNoShift(Client.field543, Client.field649 + " " + "->" + " " + class396.colorStartTag(16776960) + var5, 8, var1, var2, var3); // L: 10158
							}
						} else {
							var6 = var4.isFollower && Client.followerOpsLowPriority ? 2000 : 0; // L: 10163
							String[] var7 = var4.actions; // L: 10164
							int var11;
							if (var7 != null) { // L: 10165
								for (var11 = 4; var11 >= 0; --var11) { // L: 10166
									if (var0.method2551(var11) && var7[var11] != null && !var7[var11].equalsIgnoreCase("Attack")) { // L: 10167 10168
										var9 = 0; // L: 10169
										if (var11 == 0) { // L: 10170
											var9 = var6 + 9;
										}

										if (var11 == 1) { // L: 10171
											var9 = var6 + 10;
										}

										if (var11 == 2) { // L: 10172
											var9 = var6 + 11;
										}

										if (var11 == 3) { // L: 10173
											var9 = var6 + 12;
										}

										if (var11 == 4) { // L: 10174
											var9 = var6 + 13;
										}

										class388.insertMenuItemNoShift(var7[var11], class396.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 10175
									}
								}
							}

							if (var7 != null) { // L: 10180
								for (var11 = 4; var11 >= 0; --var11) { // L: 10181
									if (var0.method2551(var11) && var7[var11] != null && var7[var11].equalsIgnoreCase("Attack")) { // L: 10182 10183
										short var12 = 0; // L: 10184
										if (AttackOption.AttackOption_hidden != Client.npcAttackOption) { // L: 10185
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.npcAttackOption && var4.combatLevel > HitSplatDefinition.localPlayer.combatLevel) { // L: 10186
												var12 = 2000; // L: 10187
											}

											var9 = 0; // L: 10189
											if (var11 == 0) { // L: 10190
												var9 = var12 + 9;
											}

											if (var11 == 1) { // L: 10191
												var9 = var12 + 10;
											}

											if (var11 == 2) { // L: 10192
												var9 = var12 + 11;
											}

											if (var11 == 3) { // L: 10193
												var9 = var12 + 12;
											}

											if (var11 == 4) { // L: 10194
												var9 = var12 + 13;
											}

											class388.insertMenuItemNoShift(var7[var11], class396.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 10195
										}
									}
								}
							}

							if (!var4.isFollower || !Client.followerOpsLowPriority) { // L: 10200
								class388.insertMenuItemNoShift("Examine", class396.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 10201
							}
						}

					}
				}
			}
		}
	} // L: 10205
}
