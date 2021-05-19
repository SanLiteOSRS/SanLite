import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("qn")
	static boolean field1055;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("i")
	public static short[] field1064;
	@ObfuscatedName("d")
	@Export("cacheSubPaths")
	static String[] cacheSubPaths;
	@ObfuscatedName("c")
	String field1054;
	@ObfuscatedName("o")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("g")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("l")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1945602351
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 2083195621
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1877567613
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1752633221
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "[Lmo;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128);
	}

	Script() {
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lmo;",
		garbageValue = "-56"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1];
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-55"
	)
	static int method2026() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			int var0 = 0;

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount;
			}

			return var0 * 10000 / Client.field893;
		} else {
			return 10000;
		}
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(Ley;IIII)V",
		garbageValue = "-1875812955"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPCComposition var0, int var1, int var2, int var3) {
		if (Client.menuOptionsCount < 400) {
			if (var0.transforms != null) {
				var0 = var0.transform();
			}

			if (var0 != null) {
				if (var0.isInteractable) {
					if (!var0.isFollower || Client.followerIndex == var1) {
						String var4 = var0.name;
						int var7;
						int var8;
						if (var0.combatLevel != 0) {
							var7 = var0.combatLevel;
							var8 = class35.localPlayer.combatLevel;
							int var9 = var8 - var7;
							String var6;
							if (var9 < -9) {
								var6 = HorizontalAlignment.colorStartTag(16711680);
							} else if (var9 < -6) {
								var6 = HorizontalAlignment.colorStartTag(16723968);
							} else if (var9 < -3) {
								var6 = HorizontalAlignment.colorStartTag(16740352);
							} else if (var9 < 0) {
								var6 = HorizontalAlignment.colorStartTag(16756736);
							} else if (var9 > 9) {
								var6 = HorizontalAlignment.colorStartTag(65280);
							} else if (var9 > 6) {
								var6 = HorizontalAlignment.colorStartTag(4259584);
							} else if (var9 > 3) {
								var6 = HorizontalAlignment.colorStartTag(8453888);
							} else if (var9 > 0) {
								var6 = HorizontalAlignment.colorStartTag(12648192);
							} else {
								var6 = HorizontalAlignment.colorStartTag(16776960);
							}

							var4 = var4 + var6 + " " + " (" + "level-" + var0.combatLevel + ")";
						}

						if (var0.isFollower && Client.followerOpsLowPriority) {
							InterfaceParent.insertMenuItemNoShift("Examine", HorizontalAlignment.colorStartTag(16776960) + var4, 1003, var1, var2, var3);
						}

						if (Client.isItemSelected == 1) {
							InterfaceParent.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + HorizontalAlignment.colorStartTag(16776960) + var4, 7, var1, var2, var3);
						} else if (Client.isSpellSelected) {
							if ((GrandExchangeOfferUnitPriceComparator.selectedSpellFlags & 2) == 2) {
								InterfaceParent.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + HorizontalAlignment.colorStartTag(16776960) + var4, 8, var1, var2, var3);
							}
						} else {
							int var10 = var0.isFollower && Client.followerOpsLowPriority ? 2000 : 0;
							String[] var11 = var0.actions;
							if (var11 != null) {
								for (var7 = 4; var7 >= 0; --var7) {
									if (var11[var7] != null && !var11[var7].equalsIgnoreCase("Attack")) {
										var8 = 0;
										if (var7 == 0) {
											var8 = var10 + 9;
										}

										if (var7 == 1) {
											var8 = var10 + 10;
										}

										if (var7 == 2) {
											var8 = var10 + 11;
										}

										if (var7 == 3) {
											var8 = var10 + 12;
										}

										if (var7 == 4) {
											var8 = var10 + 13;
										}

										InterfaceParent.insertMenuItemNoShift(var11[var7], HorizontalAlignment.colorStartTag(16776960) + var4, var8, var1, var2, var3);
									}
								}
							}

							if (var11 != null) {
								for (var7 = 4; var7 >= 0; --var7) {
									if (var11[var7] != null && var11[var7].equalsIgnoreCase("Attack")) {
										short var12 = 0;
										if (Client.npcAttackOption != AttackOption.AttackOption_hidden) {
											if (AttackOption.AttackOption_alwaysRightClick == Client.npcAttackOption || AttackOption.AttackOption_dependsOnCombatLevels == Client.npcAttackOption && var0.combatLevel > class35.localPlayer.combatLevel) {
												var12 = 2000;
											}

											var8 = 0;
											if (var7 == 0) {
												var8 = var12 + 9;
											}

											if (var7 == 1) {
												var8 = var12 + 10;
											}

											if (var7 == 2) {
												var8 = var12 + 11;
											}

											if (var7 == 3) {
												var8 = var12 + 12;
											}

											if (var7 == 4) {
												var8 = var12 + 13;
											}

											InterfaceParent.insertMenuItemNoShift(var11[var7], HorizontalAlignment.colorStartTag(16776960) + var4, var8, var1, var2, var3);
										}
									}
								}
							}

							if (!var0.isFollower || !Client.followerOpsLowPriority) {
								InterfaceParent.insertMenuItemNoShift("Examine", HorizontalAlignment.colorStartTag(16776960) + var4, 1003, var1, var2, var3);
							}
						}

					}
				}
			}
		}
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1736303231"
	)
	static void method2014() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) {
			int var1 = var0.group;
			if (UserComparator8.loadInterface(var1)) {
				boolean var2 = true;
				Widget[] var3 = Widget.Widget_interfaceComponents[var1];

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) {
					if (var3[var4] != null) {
						var2 = var3[var4].isIf3;
						break;
					}
				}

				if (!var2) {
					var4 = (int)var0.key;
					Widget var5 = DevicePcmPlayerProvider.getWidget(var4);
					if (var5 != null) {
						VerticalAlignment.invalidateWidget(var5);
					}
				}
			}
		}

	}
}
