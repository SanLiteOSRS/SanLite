import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("a")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lof;Lof;I)I",
		garbageValue = "-1386733058"
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

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lkn;IIII)V",
		garbageValue = "-1431754984"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3611 == null) { // L: 1204
			throw new RuntimeException(); // L: 1205
		} else {
			var0.field3611[var1] = var2; // L: 1207
			var0.field3565[var1] = var3; // L: 1208
		}
	} // L: 1209

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Lco;IIIB)V",
		garbageValue = "14"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (class296.localPlayer != var0) { // L: 10197
			if (Client.menuOptionsCount < 400) { // L: 10198
				String var4;
				int var7;
				if (var0.skillLevel == 0) { // L: 10200
					String var5 = var0.actions[0] + var0.username + var0.actions[1]; // L: 10201
					var7 = var0.combatLevel; // L: 10203
					int var8 = class296.localPlayer.combatLevel; // L: 10204
					int var9 = var8 - var7; // L: 10206
					String var6;
					if (var9 < -9) { // L: 10207
						var6 = GameObject.colorStartTag(16711680); // L: 10208
					} else if (var9 < -6) { // L: 10211
						var6 = GameObject.colorStartTag(16723968); // L: 10212
					} else if (var9 < -3) { // L: 10215
						var6 = GameObject.colorStartTag(16740352); // L: 10216
					} else if (var9 < 0) { // L: 10219
						var6 = GameObject.colorStartTag(16756736); // L: 10220
					} else if (var9 > 9) { // L: 10223
						var6 = GameObject.colorStartTag(65280); // L: 10224
					} else if (var9 > 6) { // L: 10227
						var6 = GameObject.colorStartTag(4259584); // L: 10228
					} else if (var9 > 3) { // L: 10231
						var6 = GameObject.colorStartTag(8453888); // L: 10232
					} else if (var9 > 0) { // L: 10235
						var6 = GameObject.colorStartTag(12648192); // L: 10236
					} else {
						var6 = GameObject.colorStartTag(16776960); // L: 10239
					}

					var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2]; // L: 10241
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2]; // L: 10243
				}

				int var10;
				if (Client.isItemSelected == 1) { // L: 10244
					class16.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + GameObject.colorStartTag(16777215) + var4, 14, var1, var2, var3); // L: 10245
				} else if (Client.isSpellSelected) { // L: 10248
					if ((UserComparator5.selectedSpellFlags & 8) == 8) { // L: 10249
						class16.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + GameObject.colorStartTag(16777215) + var4, 15, var1, var2, var3); // L: 10250
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) { // L: 10255
						if (Client.playerMenuActions[var10] != null) { // L: 10256
							short var11 = 0; // L: 10257
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) { // L: 10258
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) { // L: 10259
									continue;
								}

								if (Client.playerAttackOption == AttackOption.AttackOption_alwaysRightClick || Client.playerAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > class296.localPlayer.combatLevel) { // L: 10260
									var11 = 2000; // L: 10261
								}

								if (class296.localPlayer.team != 0 && var0.team != 0) { // L: 10263
									if (var0.team == class296.localPlayer.team) { // L: 10264
										var11 = 2000;
									} else {
										var11 = 0; // L: 10265
									}
								} else if (AttackOption.field1289 == Client.playerAttackOption && var0.isClanMember()) { // L: 10267
									var11 = 2000; // L: 10268
								}
							} else if (Client.playerOptionsPriorities[var10]) { // L: 10271
								var11 = 2000;
							}

							boolean var12 = false; // L: 10272
							var7 = Client.playerMenuOpcodes[var10] + var11; // L: 10273
							class16.insertMenuItemNoShift(Client.playerMenuActions[var10], GameObject.colorStartTag(16777215) + var4, var7, var1, var2, var3); // L: 10274
						}
					}
				}

				for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) { // L: 10279
					if (Client.menuOpcodes[var10] == 23) { // L: 10280
						Client.menuTargets[var10] = GameObject.colorStartTag(16777215) + var4; // L: 10281
						break;
					}
				}

			}
		}
	} // L: 10285
}
