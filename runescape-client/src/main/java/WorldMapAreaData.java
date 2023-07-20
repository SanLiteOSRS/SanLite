import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ko")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("wi")
	static List field3056;
	@ObfuscatedName("ah")
	@Export("worldMapData0Set")
	HashSet worldMapData0Set;
	@ObfuscatedName("ax")
	@Export("worldMapData1Set")
	HashSet worldMapData1Set;
	@ObfuscatedName("aa")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	} // L: 14

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Lty;Lty;IZB)V",
		garbageValue = "-92"
	)
	@Export("init")
	void init(Buffer var1, Buffer var2, int var3, boolean var4) {
		this.read(var1, var3); // L: 17
		int var5 = var2.readUnsignedShort(); // L: 18
		this.worldMapData0Set = new HashSet(var5); // L: 19

		int var6;
		for (var6 = 0; var6 < var5; ++var6) { // L: 20
			WorldMapData_0 var7 = new WorldMapData_0(); // L: 21

			try {
				var7.init(var2); // L: 23
			} catch (IllegalStateException var12) { // L: 25
				continue; // L: 26
			}

			this.worldMapData0Set.add(var7); // L: 28
		}

		var6 = var2.readUnsignedShort(); // L: 30
		this.worldMapData1Set = new HashSet(var6); // L: 31

		for (int var10 = 0; var10 < var6; ++var10) { // L: 32
			WorldMapData_1 var8 = new WorldMapData_1(); // L: 33

			try {
				var8.init(var2); // L: 35
			} catch (IllegalStateException var11) { // L: 37
				continue; // L: 38
			}

			this.worldMapData1Set.add(var8); // L: 40
		}

		this.initIconsList(var2, var4); // L: 42
	} // L: 43

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Lty;ZB)V",
		garbageValue = "7"
	)
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList(); // L: 46
		int var3 = var1.readUnsignedShort(); // L: 47

		for (int var4 = 0; var4 < var3; ++var4) { // L: 48
			int var5 = var1.method9152(); // L: 49
			Coord var6 = new Coord(var1.readInt()); // L: 50
			boolean var7 = var1.readUnsignedByte() == 1; // L: 51
			if (var2 || !var7) { // L: 52
				this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null)); // L: 53
			}
		}

	} // L: 56

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(Ldf;IIIS)V",
		garbageValue = "10482"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (class136.localPlayer != var0) { // L: 10531
			if (Client.menuOptionsCount < 400) { // L: 10532
				String var4;
				int var7;
				if (var0.skillLevel == 0) { // L: 10534
					String var5 = var0.actions[0] + var0.username + var0.actions[1]; // L: 10535
					var7 = var0.combatLevel; // L: 10537
					int var8 = class136.localPlayer.combatLevel; // L: 10538
					int var9 = var8 - var7; // L: 10540
					String var6;
					if (var9 < -9) { // L: 10541
						var6 = MusicPatchPcmStream.colorStartTag(16711680); // L: 10542
					} else if (var9 < -6) { // L: 10545
						var6 = MusicPatchPcmStream.colorStartTag(16723968); // L: 10546
					} else if (var9 < -3) { // L: 10549
						var6 = MusicPatchPcmStream.colorStartTag(16740352); // L: 10550
					} else if (var9 < 0) { // L: 10553
						var6 = MusicPatchPcmStream.colorStartTag(16756736); // L: 10554
					} else if (var9 > 9) { // L: 10557
						var6 = MusicPatchPcmStream.colorStartTag(65280); // L: 10558
					} else if (var9 > 6) { // L: 10561
						var6 = MusicPatchPcmStream.colorStartTag(4259584); // L: 10562
					} else if (var9 > 3) { // L: 10565
						var6 = MusicPatchPcmStream.colorStartTag(8453888); // L: 10566
					} else if (var9 > 0) { // L: 10569
						var6 = MusicPatchPcmStream.colorStartTag(12648192); // L: 10570
					} else {
						var6 = MusicPatchPcmStream.colorStartTag(16776960); // L: 10573
					}

					var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2]; // L: 10575
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2]; // L: 10577
				}

				int var10;
				if (Client.isItemSelected == 1) { // L: 10578
					JagexCache.insertMenuItemNoShift("Use", Client.field557 + " " + "->" + " " + MusicPatchPcmStream.colorStartTag(16777215) + var4, 14, var1, var2, var3); // L: 10579
				} else if (Client.isSpellSelected) { // L: 10582
					if ((PcmPlayer.selectedSpellFlags & 8) == 8) { // L: 10583
						JagexCache.insertMenuItemNoShift(Client.field636, Client.field734 + " " + "->" + " " + MusicPatchPcmStream.colorStartTag(16777215) + var4, 15, var1, var2, var3); // L: 10584
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) { // L: 10589
						if (Client.playerMenuActions[var10] != null) { // L: 10590
							short var11 = 0; // L: 10591
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) { // L: 10592
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) { // L: 10593
									continue;
								}

								if (Client.playerAttackOption == AttackOption.AttackOption_alwaysRightClick || Client.playerAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > class136.localPlayer.combatLevel) { // L: 10594
									var11 = 2000; // L: 10595
								}

								if (class136.localPlayer.team != 0 && var0.team != 0) { // L: 10597
									if (var0.team == class136.localPlayer.team) { // L: 10598
										var11 = 2000;
									} else {
										var11 = 0; // L: 10599
									}
								} else if (AttackOption.field1340 == Client.playerAttackOption && var0.isClanMember()) { // L: 10601
									var11 = 2000; // L: 10602
								}
							} else if (Client.playerOptionsPriorities[var10]) { // L: 10605
								var11 = 2000;
							}

							boolean var12 = false; // L: 10606
							var7 = Client.playerMenuOpcodes[var10] + var11; // L: 10607
							JagexCache.insertMenuItemNoShift(Client.playerMenuActions[var10], MusicPatchPcmStream.colorStartTag(16777215) + var4, var7, var1, var2, var3); // L: 10608
						}
					}
				}

				for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) { // L: 10613
					if (Client.menuOpcodes[var10] == 23) { // L: 10614
						Client.menuTargets[var10] = MusicPatchPcmStream.colorStartTag(16777215) + var4; // L: 10615
						break;
					}
				}

			}
		}
	} // L: 10619
}
