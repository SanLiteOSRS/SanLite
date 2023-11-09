import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
public class class260 implements WorldMapSection {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -785068803
	)
	int field2962;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2129815779
	)
	int field2954;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1693090715
	)
	int field2966;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -300833613
	)
	int field2957;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -660080113
	)
	int field2958;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -232289343
	)
	int field2960;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -120285101
	)
	int field2956;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 104005691
	)
	int field2961;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1872540819
	)
	int field2955;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1582215601
	)
	int field2963;

	class260() {
	} // L: 18

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljf;I)V",
		garbageValue = "-474032336"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2958) { // L: 22
			var1.regionLowX = this.field2958;
		}

		if (var1.regionHighX < this.field2958) {
			var1.regionHighX = this.field2958; // L: 23
		}

		if (var1.regionLowY > this.field2960) { // L: 24
			var1.regionLowY = this.field2960;
		}

		if (var1.regionHighY < this.field2960) { // L: 25
			var1.regionHighY = this.field2960;
		}

	} // L: 26

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "509257779"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2962 && var1 < this.field2962 + this.field2954) { // L: 30
			return var2 >= (this.field2966 << 6) + (this.field2956 << 3) && var2 <= (this.field2966 << 6) + (this.field2956 << 3) + 7 && var3 >= (this.field2957 << 6) + (this.field2961 << 3) && var3 <= (this.field2957 << 6) + (this.field2961 << 3) + 7; // L: 33
		} else {
			return false; // L: 31
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-94"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field2958 << 6) + (this.field2955 << 3) && var1 <= (this.field2958 << 6) + (this.field2955 << 3) + 7 && var2 >= (this.field2960 << 6) + (this.field2963 << 3) && var2 <= (this.field2960 << 6) + (this.field2963 << 3) + 7; // L: 38
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1978048199"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 43
			return null; // L: 44
		} else {
			int[] var4 = new int[]{this.field2958 * 64 - this.field2966 * 64 + var2 + (this.field2955 * 8 - this.field2956 * 8), var3 + (this.field2960 * 64 - this.field2957 * 64) + (this.field2963 * 8 - this.field2961 * 8)}; // L: 46 47 48
			return var4; // L: 49
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)Lmc;",
		garbageValue = "-1281040923"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 54
			return null; // L: 55
		} else {
			int var3 = this.field2966 * 64 - this.field2958 * 64 + (this.field2956 * 8 - this.field2955 * 8) + var1; // L: 57
			int var4 = this.field2957 * 64 - this.field2960 * 64 + var2 + (this.field2961 * 8 - this.field2963 * 8); // L: 58
			return new Coord(this.field2962, var3, var4); // L: 59
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltm;B)V",
		garbageValue = "47"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field2962 = var1.readUnsignedByte(); // L: 64
		this.field2954 = var1.readUnsignedByte(); // L: 65
		this.field2966 = var1.readUnsignedShort(); // L: 66
		this.field2956 = var1.readUnsignedByte(); // L: 67
		this.field2957 = var1.readUnsignedShort(); // L: 68
		this.field2961 = var1.readUnsignedByte(); // L: 69
		this.field2958 = var1.readUnsignedShort(); // L: 70
		this.field2955 = var1.readUnsignedByte(); // L: 71
		this.field2960 = var1.readUnsignedShort(); // L: 72
		this.field2963 = var1.readUnsignedByte(); // L: 73
		this.method5381(); // L: 74
	} // L: 75

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1425291786"
	)
	void method5381() {
	} // L: 77

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIB)V",
		garbageValue = "-49"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3) {
		NPCComposition var4 = var0.definition; // L: 10415
		if (Client.menuOptionsCount < 400) { // L: 10416
			if (var4.transforms != null) { // L: 10417
				var4 = var4.transform();
			}

			if (var4 != null) { // L: 10418
				if (var4.isInteractable) { // L: 10419
					if (!var4.isFollower || Client.followerIndex == var1) { // L: 10420
						String var5 = var0.method2572(); // L: 10421
						int var6;
						if (var4.combatLevel != 0 && var0.field1273 != 0) { // L: 10422
							var6 = var0.field1273 != -1 ? var0.field1273 : var4.combatLevel; // L: 10423
							var5 = var5 + class14.method176(var6, VarbitComposition.localPlayer.combatLevel) + " " + " (" + "level-" + var6 + ")"; // L: 10424
						}

						if (var4.isFollower && Client.followerOpsLowPriority) { // L: 10426
							class385.insertMenuItemNoShift("Examine", class217.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 10427
						}

						if (Client.isItemSelected == 1) { // L: 10430
							class385.insertMenuItemNoShift("Use", Client.field692 + " " + "->" + " " + class217.colorStartTag(16776960) + var5, 7, var1, var2, var3); // L: 10431
						} else if (Client.isSpellSelected) { // L: 10434
							if ((Canvas.selectedSpellFlags & 2) == 2) { // L: 10435
								class385.insertMenuItemNoShift(Client.field709, Client.field720 + " " + "->" + " " + class217.colorStartTag(16776960) + var5, 8, var1, var2, var3); // L: 10436
							}
						} else {
							var6 = var4.isFollower && Client.followerOpsLowPriority ? 2000 : 0; // L: 10441
							String[] var7 = var4.actions; // L: 10442
							int var8;
							int var9;
							if (var7 != null) { // L: 10443
								for (var8 = 4; var8 >= 0; --var8) { // L: 10444
									if (var0.method2571(var8) && var7[var8] != null && !var7[var8].equalsIgnoreCase("Attack")) { // L: 10445 10446
										var9 = 0; // L: 10447
										if (var8 == 0) { // L: 10448
											var9 = var6 + 9;
										}

										if (var8 == 1) { // L: 10449
											var9 = var6 + 10;
										}

										if (var8 == 2) { // L: 10450
											var9 = var6 + 11;
										}

										if (var8 == 3) { // L: 10451
											var9 = var6 + 12;
										}

										if (var8 == 4) { // L: 10452
											var9 = var6 + 13;
										}

										class385.insertMenuItemNoShift(var7[var8], class217.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 10453
									}
								}
							}

							if (var7 != null) { // L: 10458
								for (var8 = 4; var8 >= 0; --var8) { // L: 10459
									if (var0.method2571(var8) && var7[var8] != null && var7[var8].equalsIgnoreCase("Attack")) { // L: 10460 10461
										short var10 = 0; // L: 10462
										if (AttackOption.AttackOption_hidden != Client.npcAttackOption) { // L: 10463
											if (AttackOption.AttackOption_alwaysRightClick == Client.npcAttackOption || Client.npcAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var4.combatLevel > VarbitComposition.localPlayer.combatLevel) { // L: 10464
												var10 = 2000; // L: 10465
											}

											var9 = 0; // L: 10467
											if (var8 == 0) { // L: 10468
												var9 = var10 + 9;
											}

											if (var8 == 1) { // L: 10469
												var9 = var10 + 10;
											}

											if (var8 == 2) {
												var9 = var10 + 11; // L: 10470
											}

											if (var8 == 3) { // L: 10471
												var9 = var10 + 12;
											}

											if (var8 == 4) { // L: 10472
												var9 = var10 + 13;
											}

											class385.insertMenuItemNoShift(var7[var8], class217.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 10473
										}
									}
								}
							}

							if (!var4.isFollower || !Client.followerOpsLowPriority) { // L: 10478
								class385.insertMenuItemNoShift("Examine", class217.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 10479
							}
						}

					}
				}
			}
		}
	} // L: 10483
}
