import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nh")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
	@ObfuscatedName("ac")
	@Export("directBuffer")
	ByteBuffer directBuffer;

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "1381422717"
	)
	@Export("get")
	byte[] get() {
		byte[] var1 = new byte[this.directBuffer.capacity()]; // L: 13
		this.directBuffer.position(0); // L: 14
		this.directBuffer.get(var1); // L: 15
		return var1; // L: 16
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-2137536013"
	)
	@Export("set")
	public void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length); // L: 20
		this.directBuffer.position(0); // L: 21
		this.directBuffer.put(var1); // L: 22
	} // L: 23

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(Ldj;IIIB)V",
		garbageValue = "8"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (TextureProvider.localPlayer != var0) { // L: 10564
			if (Client.menuOptionsCount < 400) { // L: 10565
				String var4;
				if (var0.skillLevel == 0) { // L: 10567
					var4 = var0.actions[0] + var0.username + var0.actions[1] + class338.method6257(var0.combatLevel, TextureProvider.localPlayer.combatLevel) + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2]; // L: 10568
				}

				int var5;
				if (Client.isItemSelected == 1) { // L: 10569
					class153.insertMenuItemNoShift("Use", Client.field772 + " " + "->" + " " + Client.colorStartTag(16777215) + var4, 14, var1, var2, var3); // L: 10570
				} else if (Client.isSpellSelected) { // L: 10573
					if ((class31.field173 & 8) == 8) { // L: 10574
						class153.insertMenuItemNoShift(Client.field751, Client.field688 + " " + "->" + " " + Client.colorStartTag(16777215) + var4, 15, var1, var2, var3); // L: 10575
					}
				} else {
					for (var5 = 7; var5 >= 0; --var5) { // L: 10580
						if (Client.playerMenuActions[var5] != null) { // L: 10581
							short var6 = 0; // L: 10582
							if (Client.playerMenuActions[var5].equalsIgnoreCase("Attack")) { // L: 10583
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) { // L: 10584
									continue;
								}

								if (AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption || AttackOption.AttackOption_dependsOnCombatLevels == Client.playerAttackOption && var0.combatLevel > TextureProvider.localPlayer.combatLevel) { // L: 10585
									var6 = 2000; // L: 10586
								}

								if (TextureProvider.localPlayer.team != 0 && var0.team != 0) { // L: 10588
									if (var0.team == TextureProvider.localPlayer.team) { // L: 10589
										var6 = 2000;
									} else {
										var6 = 0; // L: 10590
									}
								} else if (Client.playerAttackOption == AttackOption.field1348 && var0.isClanMember()) { // L: 10592
									var6 = 2000; // L: 10593
								}
							} else if (Client.playerOptionsPriorities[var5]) { // L: 10596
								var6 = 2000;
							}

							boolean var7 = false; // L: 10597
							int var8 = Client.playerMenuOpcodes[var5] + var6; // L: 10598
							class153.insertMenuItemNoShift(Client.playerMenuActions[var5], Client.colorStartTag(16777215) + var4, var8, var1, var2, var3); // L: 10599
						}
					}
				}

				for (var5 = 0; var5 < Client.menuOptionsCount; ++var5) { // L: 10604
					if (Client.menuOpcodes[var5] == 23) { // L: 10605
						Client.menuTargets[var5] = Client.colorStartTag(16777215) + var4; // L: 10606
						break;
					}
				}

			}
		}
	} // L: 10610
}
