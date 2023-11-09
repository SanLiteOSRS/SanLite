import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("InvDefinition_archive")
	static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -2010981849
	)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	InvDefinition() {
		this.size = 0; // L: 12
	} // L: 14

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lsg;B)V",
		garbageValue = "1"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 32
			if (var2 == 0) { // L: 33
				return; // L: 36
			}

			this.decodeNext(var1, var2); // L: 34
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsg;II)V",
		garbageValue = "64174481"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) { // L: 39
			this.size = var1.readUnsignedShort();
		}

	} // L: 41

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(Ldf;IIIS)V",
		garbageValue = "25450"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3) {
		NPCComposition var4 = var0.definition; // L: 9833
		if (Client.menuOptionsCount < 400) { // L: 9834
			if (var4.transforms != null) { // L: 9835
				var4 = var4.transform();
			}

			if (var4 != null) { // L: 9836
				if (var4.isInteractable) { // L: 9837
					if (!var4.isFollower || Client.followerIndex == var1) { // L: 9838
						String var5 = var0.method2599(); // L: 9839
						int var6;
						if (var4.combatLevel != 0 && var0.field1211 != 0) { // L: 9840
							var6 = var0.field1211 != -1 ? var0.field1211 : var4.combatLevel; // L: 9841
							var5 = var5 + ItemContainer.method2243(var6, MusicPatchNode.localPlayer.combatLevel) + " " + " (" + "level-" + var6 + ")"; // L: 9842
						}

						if (var4.isFollower && Client.followerOpsLowPriority) { // L: 9844
							MenuAction.insertMenuItemNoShift("Examine", class383.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 9845
						}

						if (Client.isItemSelected == 1) { // L: 9848
							MenuAction.insertMenuItemNoShift("Use", Client.field496 + " " + "->" + " " + class383.colorStartTag(16776960) + var5, 7, var1, var2, var3); // L: 9849
						} else if (Client.isSpellSelected) { // L: 9852
							if ((SecureRandomFuture.selectedSpellFlags & 2) == 2) { // L: 9853
								MenuAction.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class383.colorStartTag(16776960) + var5, 8, var1, var2, var3); // L: 9854
							}
						} else {
							var6 = var4.isFollower && Client.followerOpsLowPriority ? 2000 : 0; // L: 9859
							String[] var7 = var4.actions; // L: 9860
							int var8;
							int var9;
							if (var7 != null) { // L: 9861
								for (var8 = 4; var8 >= 0; --var8) { // L: 9862
									if (var0.method2596(var8) && var7[var8] != null && !var7[var8].equalsIgnoreCase("Attack")) { // L: 9863 9864
										var9 = 0; // L: 9865
										if (var8 == 0) { // L: 9866
											var9 = var6 + 9;
										}

										if (var8 == 1) { // L: 9867
											var9 = var6 + 10;
										}

										if (var8 == 2) { // L: 9868
											var9 = var6 + 11;
										}

										if (var8 == 3) { // L: 9869
											var9 = var6 + 12;
										}

										if (var8 == 4) { // L: 9870
											var9 = var6 + 13;
										}

										MenuAction.insertMenuItemNoShift(var7[var8], class383.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 9871
									}
								}
							}

							if (var7 != null) { // L: 9876
								for (var8 = 4; var8 >= 0; --var8) { // L: 9877
									if (var0.method2596(var8) && var7[var8] != null && var7[var8].equalsIgnoreCase("Attack")) { // L: 9878 9879
										short var10 = 0; // L: 9880
										if (AttackOption.AttackOption_hidden != Client.npcAttackOption) { // L: 9881
											if (AttackOption.AttackOption_alwaysRightClick == Client.npcAttackOption || Client.npcAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var4.combatLevel > MusicPatchNode.localPlayer.combatLevel) { // L: 9882
												var10 = 2000; // L: 9883
											}

											var9 = 0; // L: 9885
											if (var8 == 0) { // L: 9886
												var9 = var10 + 9;
											}

											if (var8 == 1) {
												var9 = var10 + 10; // L: 9887
											}

											if (var8 == 2) { // L: 9888
												var9 = var10 + 11;
											}

											if (var8 == 3) { // L: 9889
												var9 = var10 + 12;
											}

											if (var8 == 4) { // L: 9890
												var9 = var10 + 13;
											}

											MenuAction.insertMenuItemNoShift(var7[var8], class383.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 9891
										}
									}
								}
							}

							if (!var4.isFollower || !Client.followerOpsLowPriority) { // L: 9896
								MenuAction.insertMenuItemNoShift("Examine", class383.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 9897
							}
						}

					}
				}
			}
		}
	} // L: 9901

	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;",
		garbageValue = "1569639022"
	)
	static String method3645(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://"; // L: 12080
		if (Client.gameBuild == 1) { // L: 12081
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) { // L: 12082
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) { // L: 12083
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) { // L: 12084
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) { // L: 12085
			var0 = "local";
		}

		String var3 = ""; // L: 12086
		if (class108.field1403 != null) { // L: 12087
			var3 = "/p=" + class108.field1403;
		}

		String var4 = "runescape.com"; // L: 12088
		return var2 + var0 + "." + var4 + "/l=" + ClanSettings.clientLanguage + "/a=" + TriBool.field4600 + var3 + "/"; // L: 12089
	}

	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-70"
	)
	public static boolean method3646() {
		return Client.clickedWidget != null; // L: 12241
	}
}
