import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("o")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096];
	}

	WorldMapSprite(int[] var1) {
		this.tileColors = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "373946087"
	)
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var2 * 64 + var1];
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "1898905069"
	)
	public static final synchronized long method4989() {
		long var0 = System.currentTimeMillis();
		if (var0 < class269.field3153) {
			class269.field3154 += class269.field3153 - var0;
		}

		class269.field3153 = var0;
		return var0 + class269.field3154;
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(Lcw;IIIB)V",
		garbageValue = "-125"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (class19.localPlayer != var0) {
			if (Client.menuOptionsCount < 400) {
				String var4;
				int var7;
				if (var0.skillLevel == 0) {
					String var5 = var0.actions[0] + var0.username + var0.actions[1];
					var7 = var0.combatLevel;
					int var8 = class19.localPlayer.combatLevel;
					int var9 = var8 - var7;
					String var6;
					if (var9 < -9) {
						var6 = ChatChannel.colorStartTag(16711680);
					} else if (var9 < -6) {
						var6 = ChatChannel.colorStartTag(16723968);
					} else if (var9 < -3) {
						var6 = ChatChannel.colorStartTag(16740352);
					} else if (var9 < 0) {
						var6 = ChatChannel.colorStartTag(16756736);
					} else if (var9 > 9) {
						var6 = ChatChannel.colorStartTag(65280);
					} else if (var9 > 6) {
						var6 = ChatChannel.colorStartTag(4259584);
					} else if (var9 > 3) {
						var6 = ChatChannel.colorStartTag(8453888);
					} else if (var9 > 0) {
						var6 = ChatChannel.colorStartTag(12648192);
					} else {
						var6 = ChatChannel.colorStartTag(16776960);
					}

					var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2];
				}

				int var10;
				if (Client.isItemSelected == 1) {
					SecureRandomFuture.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + ChatChannel.colorStartTag(16777215) + var4, 14, var1, var2, var3);
				} else if (Client.isSpellSelected) {
					if ((class154.selectedSpellFlags & 8) == 8) {
						SecureRandomFuture.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + ChatChannel.colorStartTag(16777215) + var4, 15, var1, var2, var3);
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) {
						if (Client.playerMenuActions[var10] != null) {
							short var11 = 0;
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) {
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) {
									continue;
								}

								if (Client.playerAttackOption == AttackOption.AttackOption_alwaysRightClick || Client.playerAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > class19.localPlayer.combatLevel) {
									var11 = 2000;
								}

								if (class19.localPlayer.team != 0 && var0.team != 0) {
									if (var0.team == class19.localPlayer.team) {
										var11 = 2000;
									} else {
										var11 = 0;
									}
								} else if (Client.playerAttackOption == AttackOption.field1279 && var0.isClanMember()) {
									var11 = 2000;
								}
							} else if (Client.playerOptionsPriorities[var10]) {
								var11 = 2000;
							}

							boolean var12 = false;
							var7 = Client.playerMenuOpcodes[var10] + var11;
							SecureRandomFuture.insertMenuItemNoShift(Client.playerMenuActions[var10], ChatChannel.colorStartTag(16777215) + var4, var7, var1, var2, var3);
						}
					}
				}

				for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) {
					if (Client.menuOpcodes[var10] == 23) {
						Client.menuTargets[var10] = ChatChannel.colorStartTag(16777215) + var4;
						break;
					}
				}

			}
		}
	}
}
