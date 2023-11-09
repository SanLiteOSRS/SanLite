import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("ir")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1271816875
	)
	@Export("z")
	int z;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 575975751
	)
	@Export("x")
	int x;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2104974675
	)
	@Export("y")
	int y;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = 6788186902421729923L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -835782095
	)
	@Export("height")
	int height;

	ItemLayer() {
	} // L: 13

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
		garbageValue = "1457055781"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) { // L: 216
			return Byte.TYPE;
		} else if (var0.equals("I")) { // L: 217
			return Integer.TYPE;
		} else if (var0.equals("S")) { // L: 218
			return Short.TYPE;
		} else if (var0.equals("J")) { // L: 219
			return Long.TYPE;
		} else if (var0.equals("Z")) { // L: 220
			return Boolean.TYPE;
		} else if (var0.equals("F")) { // L: 221
			return Float.TYPE;
		} else if (var0.equals("D")) { // L: 222
			return Double.TYPE;
		} else if (var0.equals("C")) { // L: 223
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0); // L: 224 225
		}
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(Ldx;B)V",
		garbageValue = "-52"
	)
	static void method4266(NPC var0) {
		var0.field1201 = var0.definition.size * -1462459311; // L: 9169
		var0.field1266 = var0.definition.rotation; // L: 9170
		var0.walkSequence = var0.definition.walkSequence; // L: 9171
		var0.walkBackSequence = var0.definition.walkBackSequence; // L: 9172
		var0.walkLeftSequence = var0.definition.walkLeftSequence; // L: 9173
		var0.walkRightSequence = var0.definition.walkRightSequence; // L: 9174
		var0.idleSequence = var0.definition.idleSequence; // L: 9175
		var0.field1204 = var0.definition.turnLeftSequence; // L: 9176
		var0.field1265 = var0.definition.turnRightSequence; // L: 9177
		var0.runSequence = var0.definition.field2047; // L: 9178
		var0.field1211 = var0.definition.field2048; // L: 9179
		var0.field1252 = var0.definition.field2049; // L: 9180
		var0.field1213 = var0.definition.field2075; // L: 9181
		var0.field1214 = var0.definition.field2043; // L: 9182
		var0.field1215 = var0.definition.field2052; // L: 9183
		var0.field1216 = var0.definition.field2059; // L: 9184
		var0.field1246 = var0.definition.field2076; // L: 9185
	} // L: 9186

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(Ldf;IIII)V",
		garbageValue = "-836252773"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (VarbitComposition.localPlayer != var0) { // L: 10486
			if (Client.menuOptionsCount < 400) { // L: 10487
				String var4;
				if (var0.skillLevel == 0) { // L: 10489
					var4 = var0.actions[0] + var0.username + var0.actions[1] + class14.method176(var0.combatLevel, VarbitComposition.localPlayer.combatLevel) + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2]; // L: 10490
				}

				int var5;
				if (Client.isItemSelected == 1) { // L: 10491
					class385.insertMenuItemNoShift("Use", Client.field692 + " " + "->" + " " + class217.colorStartTag(16777215) + var4, 14, var1, var2, var3); // L: 10492
				} else if (Client.isSpellSelected) { // L: 10495
					if ((Canvas.selectedSpellFlags & 8) == 8) { // L: 10496
						class385.insertMenuItemNoShift(Client.field709, Client.field720 + " " + "->" + " " + class217.colorStartTag(16777215) + var4, 15, var1, var2, var3); // L: 10497
					}
				} else {
					for (var5 = 7; var5 >= 0; --var5) { // L: 10502
						if (Client.playerMenuActions[var5] != null) { // L: 10503
							short var6 = 0; // L: 10504
							if (Client.playerMenuActions[var5].equalsIgnoreCase("Attack")) { // L: 10505
								if (AttackOption.AttackOption_hidden == Client.playerAttackOption) { // L: 10506
									continue;
								}

								if (AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption || Client.playerAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > VarbitComposition.localPlayer.combatLevel) { // L: 10507
									var6 = 2000; // L: 10508
								}

								if (VarbitComposition.localPlayer.team != 0 && var0.team != 0) { // L: 10510
									if (var0.team == VarbitComposition.localPlayer.team) { // L: 10511
										var6 = 2000;
									} else {
										var6 = 0; // L: 10512
									}
								} else if (Client.playerAttackOption == AttackOption.field1355 && var0.isClanMember()) { // L: 10514
									var6 = 2000; // L: 10515
								}
							} else if (Client.playerOptionsPriorities[var5]) { // L: 10518
								var6 = 2000;
							}

							boolean var7 = false; // L: 10519
							int var8 = Client.playerMenuOpcodes[var5] + var6; // L: 10520
							class385.insertMenuItemNoShift(Client.playerMenuActions[var5], class217.colorStartTag(16777215) + var4, var8, var1, var2, var3); // L: 10521
						}
					}
				}

				for (var5 = 0; var5 < Client.menuOptionsCount; ++var5) { // L: 10526
					if (Client.menuOpcodes[var5] == 23) { // L: 10527
						Client.menuTargets[var5] = class217.colorStartTag(16777215) + var4; // L: 10528
						break;
					}
				}

			}
		}
	} // L: 10532
}
