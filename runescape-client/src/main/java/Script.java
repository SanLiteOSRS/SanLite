import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bc")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("bj")
	static String field975;
	@ObfuscatedName("q")
	String field965;
	@ObfuscatedName("f")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("u")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("c")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -358657845
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 982325223
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 385663001
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1023002377
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "[Lpl;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128); // L: 12
	}

	Script() {
	} // L: 23

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lpl;",
		garbageValue = "66"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1]; // L: 119
	}

	@ObfuscatedName("f")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) { // L: 49
			if (var0 % 37L == 0L) { // L: 50
				return null;
			} else {
				int var2 = 0; // L: 51

				for (long var3 = var0; var3 != 0L; var3 /= 37L) { // L: 52 53 55
					++var2; // L: 54
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); var0 != 0L; var5.append(var8)) { // L: 57 58 67
					long var6 = var0; // L: 59
					var0 /= 37L; // L: 60
					var8 = class345.base37Table[(int)(var6 - 37L * var0)]; // L: 61
					if (var8 == '_') { // L: 62
						int var9 = var5.length() - 1; // L: 63
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9))); // L: 64
						var8 = 160; // L: 65
					}
				}

				var5.reverse(); // L: 69
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0))); // L: 70
				return var5.toString(); // L: 71
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)[Ldk;",
		garbageValue = "114"
	)
	static class118[] method2024() {
		return new class118[]{class118.field1462, class118.field1453, class118.field1454, class118.field1455, class118.field1456, class118.field1452}; // L: 25
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "([BIILgo;[Lgr;I)V",
		garbageValue = "81879802"
	)
	static final void method2039(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
		Buffer var5 = new Buffer(var0); // L: 252
		int var6 = -1; // L: 253

		while (true) {
			int var7 = var5.method7873(); // L: 255
			if (var7 == 0) { // L: 256
				return; // L: 280
			}

			var6 += var7; // L: 257
			int var8 = 0; // L: 258

			while (true) {
				int var9 = var5.readUShortSmart(); // L: 260
				if (var9 == 0) { // L: 261
					break;
				}

				var8 += var9 - 1; // L: 262
				int var10 = var8 & 63; // L: 263
				int var11 = var8 >> 6 & 63; // L: 264
				int var12 = var8 >> 12; // L: 265
				int var13 = var5.readUnsignedByte(); // L: 266
				int var14 = var13 >> 2; // L: 267
				int var15 = var13 & 3; // L: 268
				int var16 = var11 + var1; // L: 269
				int var17 = var10 + var2; // L: 270
				if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) { // L: 271
					int var18 = var12; // L: 272
					if ((Tiles.Tiles_renderFlags[1][var16][var17] & 2) == 2) { // L: 273
						var18 = var12 - 1;
					}

					CollisionMap var19 = null; // L: 274
					if (var18 >= 0) { // L: 275
						var19 = var4[var18];
					}

					class309.addObjects(var12, var16, var17, var6, var15, var14, var3, var19); // L: 276
				}
			}
		}
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(Lcz;IIII)V",
		garbageValue = "2086159848"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (class28.localPlayer != var0) { // L: 9848
			if (Client.menuOptionsCount < 400) { // L: 9849
				String var4;
				int var7;
				if (var0.skillLevel == 0) { // L: 9851
					String var5 = var0.actions[0] + var0.username + var0.actions[1]; // L: 9852
					var7 = var0.combatLevel; // L: 9854
					int var8 = class28.localPlayer.combatLevel; // L: 9855
					int var9 = var8 - var7; // L: 9857
					String var6;
					if (var9 < -9) { // L: 9858
						var6 = class82.colorStartTag(16711680); // L: 9859
					} else if (var9 < -6) { // L: 9862
						var6 = class82.colorStartTag(16723968); // L: 9863
					} else if (var9 < -3) { // L: 9866
						var6 = class82.colorStartTag(16740352); // L: 9867
					} else if (var9 < 0) { // L: 9870
						var6 = class82.colorStartTag(16756736); // L: 9871
					} else if (var9 > 9) { // L: 9874
						var6 = class82.colorStartTag(65280); // L: 9875
					} else if (var9 > 6) { // L: 9878
						var6 = class82.colorStartTag(4259584); // L: 9879
					} else if (var9 > 3) { // L: 9882
						var6 = class82.colorStartTag(8453888); // L: 9883
					} else if (var9 > 0) { // L: 9886
						var6 = class82.colorStartTag(12648192); // L: 9887
					} else {
						var6 = class82.colorStartTag(16776960); // L: 9890
					}

					var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2]; // L: 9892
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2]; // L: 9894
				}

				int var10;
				if (Client.isItemSelected == 1) { // L: 9895
					StructComposition.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class82.colorStartTag(16777215) + var4, 14, var1, var2, var3); // L: 9896
				} else if (Client.isSpellSelected) { // L: 9899
					if ((Coord.selectedSpellFlags & 8) == 8) { // L: 9900
						StructComposition.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class82.colorStartTag(16777215) + var4, 15, var1, var2, var3); // L: 9901
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) { // L: 9906
						if (Client.playerMenuActions[var10] != null) { // L: 9907
							short var11 = 0; // L: 9908
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) { // L: 9909
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) { // L: 9910
									continue;
								}

								if (AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption || AttackOption.AttackOption_dependsOnCombatLevels == Client.playerAttackOption && var0.combatLevel > class28.localPlayer.combatLevel) { // L: 9911
									var11 = 2000; // L: 9912
								}

								if (class28.localPlayer.team != 0 && var0.team != 0) { // L: 9914
									if (var0.team == class28.localPlayer.team) { // L: 9915
										var11 = 2000;
									} else {
										var11 = 0; // L: 9916
									}
								} else if (Client.playerAttackOption == AttackOption.field1284 && var0.isClanMember()) { // L: 9918
									var11 = 2000; // L: 9919
								}
							} else if (Client.playerOptionsPriorities[var10]) { // L: 9922
								var11 = 2000;
							}

							boolean var12 = false; // L: 9923
							var7 = Client.playerMenuOpcodes[var10] + var11; // L: 9924
							StructComposition.insertMenuItemNoShift(Client.playerMenuActions[var10], class82.colorStartTag(16777215) + var4, var7, var1, var2, var3); // L: 9925
						}
					}
				}

				for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) { // L: 9930
					if (Client.menuOpcodes[var10] == 23) { // L: 9931
						Client.menuTargets[var10] = class82.colorStartTag(16777215) + var4; // L: 9932
						break;
					}
				}

			}
		}
	} // L: 9936
}
