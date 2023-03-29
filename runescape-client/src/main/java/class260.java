import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("kk")
public class class260 {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lcz;"
	)
	@Export("World_worlds")
	static World[] World_worlds;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;I)[F",
		garbageValue = "1723648490"
	)
	static float[] method5238(JSONObject var0, String var1) throws JSONException {
		float[] var2 = new float[4]; // L: 329

		try {
			JSONArray var3 = var0.getJSONArray(var1); // L: 331
			var2[0] = (float)var3.optDouble(0, 0.0D); // L: 332
			var2[1] = (float)var3.optDouble(1, 0.0D); // L: 333
			var2[2] = (float)var3.optDouble(2, 1.0D); // L: 334
			var2[3] = (float)var3.optDouble(3, 1.0D); // L: 335
		} catch (JSONException var4) { // L: 337
			var2[0] = 0.0F; // L: 338
			var2[1] = 0.0F; // L: 339
			var2[2] = 1.0F; // L: 340
			var2[3] = 1.0F; // L: 341
		}

		return var2; // L: 343
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(Ldz;IIII)V",
		garbageValue = "1949274220"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3) {
		NPCComposition var4 = var0.definition; // L: 9895
		if (Client.menuOptionsCount < 400) { // L: 9896
			if (var4.transforms != null) { // L: 9897
				var4 = var4.transform();
			}

			if (var4 != null) { // L: 9898
				if (var4.isInteractable) { // L: 9899
					if (!var4.isFollower || Client.followerIndex == var1) { // L: 9900
						String var5 = var0.method2601(); // L: 9901
						int var6;
						if (var4.combatLevel != 0 && var0.field1189 != 0) { // L: 9902
							var6 = var0.field1189 != -1 ? var0.field1189 : var4.combatLevel; // L: 9903
							var5 = var5 + NPC.method2569(var6, BuddyRankComparator.localPlayer.combatLevel) + " " + " (" + "level-" + var6 + ")"; // L: 9904
						}

						if (var4.isFollower && Client.followerOpsLowPriority) { // L: 9906
							class110.insertMenuItemNoShift("Examine", Canvas.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 9907
						}

						if (Client.isItemSelected == 1) { // L: 9910
							class110.insertMenuItemNoShift("Use", Client.field640 + " " + "->" + " " + Canvas.colorStartTag(16776960) + var5, 7, var1, var2, var3); // L: 9911
						} else if (Client.isSpellSelected) { // L: 9914
							if ((class90.selectedSpellFlags & 2) == 2) { // L: 9915
								class110.insertMenuItemNoShift(Client.field711, Client.field645 + " " + "->" + " " + Canvas.colorStartTag(16776960) + var5, 8, var1, var2, var3); // L: 9916
							}
						} else {
							var6 = var4.isFollower && Client.followerOpsLowPriority ? 2000 : 0; // L: 9921
							String[] var7 = var4.actions; // L: 9922
							int var8;
							int var9;
							if (var7 != null) { // L: 9923
								for (var8 = 4; var8 >= 0; --var8) { // L: 9924
									if (var0.method2554(var8) && var7[var8] != null && !var7[var8].equalsIgnoreCase("Attack")) { // L: 9925 9926
										var9 = 0; // L: 9927
										if (var8 == 0) { // L: 9928
											var9 = var6 + 9;
										}

										if (var8 == 1) { // L: 9929
											var9 = var6 + 10;
										}

										if (var8 == 2) { // L: 9930
											var9 = var6 + 11;
										}

										if (var8 == 3) { // L: 9931
											var9 = var6 + 12;
										}

										if (var8 == 4) { // L: 9932
											var9 = var6 + 13;
										}

										class110.insertMenuItemNoShift(var7[var8], Canvas.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 9933
									}
								}
							}

							if (var7 != null) { // L: 9938
								for (var8 = 4; var8 >= 0; --var8) { // L: 9939
									if (var0.method2554(var8) && var7[var8] != null && var7[var8].equalsIgnoreCase("Attack")) { // L: 9940 9941
										short var10 = 0; // L: 9942
										if (Client.npcAttackOption != AttackOption.AttackOption_hidden) { // L: 9943
											if (AttackOption.AttackOption_alwaysRightClick == Client.npcAttackOption || Client.npcAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var4.combatLevel > BuddyRankComparator.localPlayer.combatLevel) { // L: 9944
												var10 = 2000; // L: 9945
											}

											var9 = 0; // L: 9947
											if (var8 == 0) { // L: 9948
												var9 = var10 + 9;
											}

											if (var8 == 1) {
												var9 = var10 + 10; // L: 9949
											}

											if (var8 == 2) { // L: 9950
												var9 = var10 + 11;
											}

											if (var8 == 3) { // L: 9951
												var9 = var10 + 12;
											}

											if (var8 == 4) { // L: 9952
												var9 = var10 + 13;
											}

											class110.insertMenuItemNoShift(var7[var8], Canvas.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 9953
										}
									}
								}
							}

							if (!var4.isFollower || !Client.followerOpsLowPriority) { // L: 9958
								class110.insertMenuItemNoShift("Examine", Canvas.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 9959
							}
						}

					}
				}
			}
		}
	} // L: 9963
}
