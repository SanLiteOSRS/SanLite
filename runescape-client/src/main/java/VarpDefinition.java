import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("VarpDefinition_archive")
	static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1332454231
	)
	@Export("VarpDefinition_fileCount")
	public static int VarpDefinition_fileCount;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Lel;"
	)
	@Export("VarpDefinition_cached")
	static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -955851785
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	VarpDefinition() {
		this.type = 0;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(Lkf;I)V",
		garbageValue = "1437653896"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(Lkf;IS)V",
		garbageValue = "24454"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) {
			this.type = var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		signature = "(Lbf;ZI)V",
		garbageValue = "-1746985052"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) {
			var0.isUnanimated = false;
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.movementSequence == var0.readySequence) {
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7;
			int var3 = var0.y >> 7;
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
				long var4 = class227.calculateTag(0, 0, 0, false, var0.index);
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) {
					var0.isUnanimated = false;
					var0.tileHeight = ArchiveLoader.getTileHeight(var0.x, var0.y, Huffman.Client_plane);
					var0.playerCycle = Client.cycle;
					ScriptEvent.scene.addNullableObject(Huffman.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.field649, var0.field635, var0.field651, var0.field643);
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) {
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) {
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount;
					}

					var0.tileHeight = ArchiveLoader.getTileHeight(var0.x, var0.y, Huffman.Client_plane);
					var0.playerCycle = Client.cycle;
					ScriptEvent.scene.drawEntity(Huffman.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking);
				}
			}
		}

	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		signature = "(Lbf;IIII)V",
		garbageValue = "-1811983965"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (WorldMapLabelSize.localPlayer != var0) {
			if (Client.menuOptionsCount < 400) {
				String var4;
				int var7;
				if (var0.skillLevel == 0) {
					String var5 = var0.actions[0] + var0.username + var0.actions[1];
					var7 = var0.combatLevel;
					int var8 = WorldMapLabelSize.localPlayer.combatLevel;
					int var9 = var8 - var7;
					String var6;
					if (var9 < -9) {
						var6 = WorldMapAreaData.colorStartTag(16711680);
					} else if (var9 < -6) {
						var6 = WorldMapAreaData.colorStartTag(16723968);
					} else if (var9 < -3) {
						var6 = WorldMapAreaData.colorStartTag(16740352);
					} else if (var9 < 0) {
						var6 = WorldMapAreaData.colorStartTag(16756736);
					} else if (var9 > 9) {
						var6 = WorldMapAreaData.colorStartTag(65280);
					} else if (var9 > 6) {
						var6 = WorldMapAreaData.colorStartTag(4259584);
					} else if (var9 > 3) {
						var6 = WorldMapAreaData.colorStartTag(8453888);
					} else if (var9 > 0) {
						var6 = WorldMapAreaData.colorStartTag(12648192);
					} else {
						var6 = WorldMapAreaData.colorStartTag(16776960);
					}

					var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2];
				}

				int var10;
				if (Client.isItemSelected == 1) {
					StructDefinition.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + WorldMapAreaData.colorStartTag(16777215) + var4, 14, var1, var2, var3);
				} else if (Client.isSpellSelected) {
					if ((UserComparator8.selectedSpellFlags & 8) == 8) {
						StructDefinition.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + WorldMapAreaData.colorStartTag(16777215) + var4, 15, var1, var2, var3);
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) {
						if (Client.playerMenuActions[var10] != null) {
							short var11 = 0;
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) {
								if (AttackOption.AttackOption_hidden == Client.playerAttackOption) {
									continue;
								}

								if (Client.playerAttackOption == AttackOption.AttackOption_alwaysRightClick || Client.playerAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > WorldMapLabelSize.localPlayer.combatLevel) {
									var11 = 2000;
								}

								if (WorldMapLabelSize.localPlayer.team != 0 && var0.team != 0) {
									if (var0.team == WorldMapLabelSize.localPlayer.team) {
										var11 = 2000;
									} else {
										var11 = 0;
									}
								}
							} else if (Client.playerOptionsPriorities[var10]) {
								var11 = 2000;
							}

							boolean var12 = false;
							var7 = Client.playerMenuOpcodes[var10] + var11;
							StructDefinition.insertMenuItemNoShift(Client.playerMenuActions[var10], WorldMapAreaData.colorStartTag(16777215) + var4, var7, var1, var2, var3);
						}
					}
				}

				for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) {
					if (Client.menuOpcodes[var10] == 23) {
						Client.menuTargets[var10] = WorldMapAreaData.colorStartTag(16777215) + var4;
						break;
					}
				}

			}
		}
	}
}
