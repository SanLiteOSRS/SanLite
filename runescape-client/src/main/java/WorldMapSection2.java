import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("qa")
	@Export("ClanChat_inClanChat")
	static boolean ClanChat_inClanChat;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -169381135
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 487968763
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -317879561
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1129962761
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1913181737
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -198835895
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1054522171
	)
	int field1587;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 2073575157
	)
	int field1588;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1399481235
	)
	int field1583;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -186882901
	)
	int field1584;

	WorldMapSection2() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Leq;I)V",
		garbageValue = "-609192354"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field1587) {
			var1.regionLowX = this.field1587;
		}

		if (var1.regionHighX < this.field1583) {
			var1.regionHighX = this.field1583;
		}

		if (var1.regionLowY > this.field1588) {
			var1.regionLowY = this.field1588;
		}

		if (var1.regionHighY < this.field1584) {
			var1.regionHighY = this.field1584;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(IIII)Z",
		garbageValue = "-2146205978"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) {
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(III)Z",
		garbageValue = "-916390789"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field1587 && var1 >> 6 <= this.field1583 && var2 >> 6 >= this.field1588 && var2 >> 6 <= this.field1584;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(IIII)[I",
		garbageValue = "1101045563"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field1587 * 64 - this.regionStartX * 64 + var2, var3 + (this.field1588 * 64 - this.regionStartY * 64)};
			return var4;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(III)Lhk;",
		garbageValue = "1643926479"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.regionStartX * 64 - this.field1587 * 64 + var1;
			int var4 = this.regionStartY * 64 - this.field1588 * 64 + var2;
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "-576756767"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.field1587 = var1.readUnsignedShort();
		this.field1588 = var1.readUnsignedShort();
		this.field1583 = var1.readUnsignedShort();
		this.field1584 = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-50622469"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		signature = "(Lkc;IIII)V",
		garbageValue = "1629548080"
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
							var8 = Varcs.localPlayer.combatLevel;
							int var9 = var8 - var7;
							String var6;
							if (var9 < -9) {
								var6 = DefaultsGroup.colorStartTag(16711680);
							} else if (var9 < -6) {
								var6 = DefaultsGroup.colorStartTag(16723968);
							} else if (var9 < -3) {
								var6 = DefaultsGroup.colorStartTag(16740352);
							} else if (var9 < 0) {
								var6 = DefaultsGroup.colorStartTag(16756736);
							} else if (var9 > 9) {
								var6 = DefaultsGroup.colorStartTag(65280);
							} else if (var9 > 6) {
								var6 = DefaultsGroup.colorStartTag(4259584);
							} else if (var9 > 3) {
								var6 = DefaultsGroup.colorStartTag(8453888);
							} else if (var9 > 0) {
								var6 = DefaultsGroup.colorStartTag(12648192);
							} else {
								var6 = DefaultsGroup.colorStartTag(16776960);
							}

							var4 = var4 + var6 + " " + " (" + "level-" + var0.combatLevel + ")";
						}

						if (var0.isFollower && Client.followerOpsLowPriority) {
							SpriteMask.insertMenuItemNoShift("Examine", DefaultsGroup.colorStartTag(16776960) + var4, 1003, var1, var2, var3);
						}

						if (Client.isItemSelected == 1) {
							SpriteMask.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + DefaultsGroup.colorStartTag(16776960) + var4, 7, var1, var2, var3);
						} else if (Client.isSpellSelected) {
							if ((UserComparator10.selectedSpellFlags & 2) == 2) {
								SpriteMask.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + DefaultsGroup.colorStartTag(16776960) + var4, 8, var1, var2, var3);
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

										SpriteMask.insertMenuItemNoShift(var11[var7], DefaultsGroup.colorStartTag(16776960) + var4, var8, var1, var2, var3);
									}
								}
							}

							if (var11 != null) {
								for (var7 = 4; var7 >= 0; --var7) {
									if (var11[var7] != null && var11[var7].equalsIgnoreCase("Attack")) {
										short var12 = 0;
										if (AttackOption.AttackOption_hidden != Client.npcAttackOption) {
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.npcAttackOption && var0.combatLevel > Varcs.localPlayer.combatLevel) {
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

											SpriteMask.insertMenuItemNoShift(var11[var7], DefaultsGroup.colorStartTag(16776960) + var4, var8, var1, var2, var3);
										}
									}
								}
							}

							if (!var0.isFollower || !Client.followerOpsLowPriority) {
								SpriteMask.insertMenuItemNoShift("Examine", DefaultsGroup.colorStartTag(16776960) + var4, 1003, var1, var2, var3);
							}
						}

					}
				}
			}
		}
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		signature = "(IB)Ljava/lang/String;",
		garbageValue = "0"
	)
	static final String method2726(int var0) {
		return var0 < 999999999 ? Integer.toString(var0) : "*";
	}
}
