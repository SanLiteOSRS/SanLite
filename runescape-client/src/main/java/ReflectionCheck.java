import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "Lhc;"
	)
	@Export("scene")
	static Scene scene;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1143257971
	)
	@Export("id")
	int id;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1361333621
	)
	@Export("size")
	int size;
	@ObfuscatedName("v")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("x")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("m")
	@Export("arguments")
	byte[][][] arguments;
	@ObfuscatedName("q")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("f")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("r")
	@Export("methods")
	Method[] methods;

	ReflectionCheck() {
	} // L: 17

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "65850729"
	)
	static final void method714(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) { // L: 8780
			if (Client.rootWidgetXs[var4] + Client.rootWidgetWidths[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) { // L: 8781
				Client.field731[var4] = true;
			}
		}

	} // L: 8783

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(Lcg;IIIB)V",
		garbageValue = "-113"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3) {
		NPCComposition var4 = var0.definition; // L: 10169
		if (Client.menuOptionsCount < 400) { // L: 10170
			if (var4.transforms != null) { // L: 10171
				var4 = var4.transform();
			}

			if (var4 != null) { // L: 10172
				if (var4.isInteractable) { // L: 10173
					if (!var4.isFollower || Client.followerIndex == var1) { // L: 10174
						String var5 = var0.method2535(); // L: 10175
						int var6;
						if (var4.combatLevel != 0 && var0.field1253 != 0) { // L: 10176
							var6 = var0.field1253 != -1 ? var0.field1253 : var4.combatLevel; // L: 10177
							var5 = var5 + class125.method2971(var6, class155.localPlayer.combatLevel) + " " + " (" + "level-" + var6 + ")"; // L: 10178
						}

						if (var4.isFollower && Client.followerOpsLowPriority) { // L: 10180
							ObjectSound.insertMenuItemNoShift("Examine", MouseRecorder.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 10181
						}

						if (Client.isItemSelected == 1) { // L: 10184
							ObjectSound.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + MouseRecorder.colorStartTag(16776960) + var5, 7, var1, var2, var3); // L: 10185
						} else if (Client.isSpellSelected) { // L: 10188
							if ((class21.selectedSpellFlags & 2) == 2) { // L: 10189
								ObjectSound.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + MouseRecorder.colorStartTag(16776960) + var5, 8, var1, var2, var3); // L: 10190
							}
						} else {
							var6 = var4.isFollower && Client.followerOpsLowPriority ? 2000 : 0; // L: 10195
							String[] var7 = var4.actions; // L: 10196
							int var8;
							int var9;
							if (var7 != null) { // L: 10197
								for (var8 = 4; var8 >= 0; --var8) { // L: 10198
									if (var0.method2576(var8) && var7[var8] != null && !var7[var8].equalsIgnoreCase("Attack")) { // L: 10199 10200
										var9 = 0; // L: 10201
										if (var8 == 0) { // L: 10202
											var9 = var6 + 9;
										}

										if (var8 == 1) { // L: 10203
											var9 = var6 + 10;
										}

										if (var8 == 2) { // L: 10204
											var9 = var6 + 11;
										}

										if (var8 == 3) { // L: 10205
											var9 = var6 + 12;
										}

										if (var8 == 4) { // L: 10206
											var9 = var6 + 13;
										}

										ObjectSound.insertMenuItemNoShift(var7[var8], MouseRecorder.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 10207
									}
								}
							}

							if (var7 != null) { // L: 10212
								for (var8 = 4; var8 >= 0; --var8) { // L: 10213
									if (var0.method2576(var8) && var7[var8] != null && var7[var8].equalsIgnoreCase("Attack")) { // L: 10214 10215
										short var10 = 0; // L: 10216
										if (AttackOption.AttackOption_hidden != Client.npcAttackOption) { // L: 10217
											if (AttackOption.AttackOption_alwaysRightClick == Client.npcAttackOption || Client.npcAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var4.combatLevel > class155.localPlayer.combatLevel) { // L: 10218
												var10 = 2000; // L: 10219
											}

											var9 = 0; // L: 10221
											if (var8 == 0) { // L: 10222
												var9 = var10 + 9;
											}

											if (var8 == 1) {
												var9 = var10 + 10; // L: 10223
											}

											if (var8 == 2) { // L: 10224
												var9 = var10 + 11;
											}

											if (var8 == 3) { // L: 10225
												var9 = var10 + 12;
											}

											if (var8 == 4) { // L: 10226
												var9 = var10 + 13;
											}

											ObjectSound.insertMenuItemNoShift(var7[var8], MouseRecorder.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 10227
										}
									}
								}
							}

							if (!var4.isFollower || !Client.followerOpsLowPriority) { // L: 10232
								ObjectSound.insertMenuItemNoShift("Examine", MouseRecorder.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 10233
							}
						}

					}
				}
			}
		}
	} // L: 10237

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1865520604"
	)
	static void method711(int var0) {
		PendingSpawn.tempMenuAction = new MenuAction(); // L: 12009
		PendingSpawn.tempMenuAction.param0 = Client.menuArguments1[var0]; // L: 12010
		PendingSpawn.tempMenuAction.param1 = Client.menuArguments2[var0]; // L: 12011
		PendingSpawn.tempMenuAction.opcode = Client.menuOpcodes[var0]; // L: 12012
		PendingSpawn.tempMenuAction.identifier = Client.menuIdentifiers[var0]; // L: 12013
		PendingSpawn.tempMenuAction.field904 = Client.field661[var0]; // L: 12014
		PendingSpawn.tempMenuAction.field903 = Client.menuActions[var0]; // L: 12015
		PendingSpawn.tempMenuAction.action = Client.menuTargets[var0]; // L: 12016
	} // L: 12017

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "10506"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (class281.friendsChatManager != null) { // L: 12530
			PacketBufferNode var1 = class136.getPacketBufferNode(ClientPacket.field3090, Client.packetWriter.isaacCipher); // L: 12531
			var1.packetBuffer.writeByte(class13.stringCp1252NullTerminatedByteSize(var0)); // L: 12532
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 12533
			Client.packetWriter.addNode(var1); // L: 12534
		}
	} // L: 12535
}
