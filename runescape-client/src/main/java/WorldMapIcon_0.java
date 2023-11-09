import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("he")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1405909757
	)
	@Export("element")
	final int element;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1275145831
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1743861621
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lkp;Lkp;ILiy;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2); // L: 14
		this.element = var3; // L: 15
		this.label = var4; // L: 16
		WorldMapElement var5 = TileItem.WorldMapElement_get(this.getElement()); // L: 17
		SpritePixels var6 = var5.getSpriteBool(false); // L: 18
		if (var6 != null) { // L: 19
			this.subWidth = var6.subWidth; // L: 20
			this.subHeight = var6.subHeight; // L: 21
		} else {
			this.subWidth = 0; // L: 24
			this.subHeight = 0; // L: 25
		}

	} // L: 27

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2045439656"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 31
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Liy;",
		garbageValue = "1"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 36
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2147415720"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 41
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "740963101"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 46
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(Lco;IIII)V",
		garbageValue = "-1106038079"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3) {
		NPCComposition var4 = var0.definition; // L: 9740
		if (Client.menuOptionsCount < 400) { // L: 9741
			if (var4.transforms != null) { // L: 9742
				var4 = var4.transform();
			}

			if (var4 != null) { // L: 9743
				if (var4.isInteractable) { // L: 9744
					if (!var4.isFollower || Client.followerIndex == var1) { // L: 9745
						String var5 = var0.method2413(); // L: 9746
						int var6;
						int var9;
						if (var4.combatLevel != 0 && var0.field1204 != 0) { // L: 9747
							var6 = var0.field1204 != -1 ? var0.field1204 : var4.combatLevel; // L: 9748
							var9 = class28.localPlayer.combatLevel; // L: 9751
							int var10 = var9 - var6; // L: 9753
							String var8;
							if (var10 < -9) { // L: 9754
								var8 = class82.colorStartTag(16711680); // L: 9755
							} else if (var10 < -6) { // L: 9758
								var8 = class82.colorStartTag(16723968); // L: 9759
							} else if (var10 < -3) { // L: 9762
								var8 = class82.colorStartTag(16740352); // L: 9763
							} else if (var10 < 0) { // L: 9766
								var8 = class82.colorStartTag(16756736); // L: 9767
							} else if (var10 > 9) { // L: 9770
								var8 = class82.colorStartTag(65280); // L: 9771
							} else if (var10 > 6) { // L: 9774
								var8 = class82.colorStartTag(4259584); // L: 9775
							} else if (var10 > 3) { // L: 9778
								var8 = class82.colorStartTag(8453888); // L: 9779
							} else if (var10 > 0) { // L: 9782
								var8 = class82.colorStartTag(12648192); // L: 9783
							} else {
								var8 = class82.colorStartTag(16776960); // L: 9786
							}

							var5 = var5 + var8 + " " + " (" + "level-" + var6 + ")"; // L: 9788
						}

						if (var4.isFollower && Client.followerOpsLowPriority) { // L: 9790
							StructComposition.insertMenuItemNoShift("Examine", class82.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 9791
						}

						if (Client.isItemSelected == 1) { // L: 9794
							StructComposition.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class82.colorStartTag(16776960) + var5, 7, var1, var2, var3); // L: 9795
						} else if (Client.isSpellSelected) { // L: 9798
							if ((Coord.selectedSpellFlags & 2) == 2) { // L: 9799
								StructComposition.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class82.colorStartTag(16776960) + var5, 8, var1, var2, var3); // L: 9800
							}
						} else {
							var6 = var4.isFollower && Client.followerOpsLowPriority ? 2000 : 0; // L: 9805
							String[] var7 = var4.actions; // L: 9806
							int var11;
							if (var7 != null) { // L: 9807
								for (var11 = 4; var11 >= 0; --var11) { // L: 9808
									if (var7[var11] != null && !var7[var11].equalsIgnoreCase("Attack")) { // L: 9809
										var9 = 0; // L: 9810
										if (var11 == 0) { // L: 9811
											var9 = var6 + 9;
										}

										if (var11 == 1) { // L: 9812
											var9 = var6 + 10;
										}

										if (var11 == 2) { // L: 9813
											var9 = var6 + 11;
										}

										if (var11 == 3) { // L: 9814
											var9 = var6 + 12;
										}

										if (var11 == 4) { // L: 9815
											var9 = var6 + 13;
										}

										StructComposition.insertMenuItemNoShift(var7[var11], class82.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 9816
									}
								}
							}

							if (var7 != null) { // L: 9821
								for (var11 = 4; var11 >= 0; --var11) { // L: 9822
									if (var7[var11] != null && var7[var11].equalsIgnoreCase("Attack")) { // L: 9823
										short var12 = 0; // L: 9824
										if (AttackOption.AttackOption_hidden != Client.npcAttackOption) { // L: 9825
											if (AttackOption.AttackOption_alwaysRightClick == Client.npcAttackOption || AttackOption.AttackOption_dependsOnCombatLevels == Client.npcAttackOption && var4.combatLevel > class28.localPlayer.combatLevel) { // L: 9826
												var12 = 2000; // L: 9827
											}

											var9 = 0; // L: 9829
											if (var11 == 0) { // L: 9830
												var9 = var12 + 9;
											}

											if (var11 == 1) { // L: 9831
												var9 = var12 + 10;
											}

											if (var11 == 2) { // L: 9832
												var9 = var12 + 11;
											}

											if (var11 == 3) { // L: 9833
												var9 = var12 + 12;
											}

											if (var11 == 4) { // L: 9834
												var9 = var12 + 13;
											}

											StructComposition.insertMenuItemNoShift(var7[var11], class82.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 9835
										}
									}
								}
							}

							if (!var4.isFollower || !Client.followerOpsLowPriority) { // L: 9840
								StructComposition.insertMenuItemNoShift("Examine", class82.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 9841
							}
						}

					}
				}
			}
		}
	} // L: 9845

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "20"
	)
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (ReflectionCheck.loadInterface(var0)) { // L: 11730
			Widget[] var1 = Widget.Widget_interfaceComponents[var0]; // L: 11731

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 11732
				Widget var3 = var1[var2]; // L: 11733
				if (var3 != null) { // L: 11734
					var3.modelFrame = 0; // L: 11735
					var3.modelFrameCycle = 0; // L: 11736
				}
			}

		}
	} // L: 11738
}
