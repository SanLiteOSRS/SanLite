import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		signature = "Lig;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -578654208
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -75747328
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1125941169
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -2054969583
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -682605071
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -518585079
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1136601731
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1951051003
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("d")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("c")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("j")
	byte[][][] field1690;
	@ObfuscatedName("r")
	byte[][][] field1700;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "[[[[Lej;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("t")
	boolean field1702;
	@ObfuscatedName("v")
	boolean field1703;

	AbstractWorldMapData() {
		this.groupId = -1;
		this.fileId = -1;
		new LinkedList();
		this.field1702 = false;
		this.field1703 = false;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "-930076916"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "811477602"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field1702 && this.field1703;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "(Lir;I)V",
		garbageValue = "-458727625"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field1702 = true;
				this.field1703 = true;
			}

		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(S)V",
		garbageValue = "-31474"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field1690 = null;
		this.field1700 = null;
		this.decorations = null;
		this.field1702 = false;
		this.field1703 = false;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(IILnu;B)V",
		garbageValue = "5"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method3072(var1, var2, var3, var4);
			} else {
				this.method3073(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(IILnu;II)V",
		garbageValue = "-100897215"
	)
	void method3072(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(IILnu;II)V",
		garbageValue = "-740435920"
	)
	void method3073(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1;
		boolean var6 = (var4 & 2) != 0;
		boolean var7 = (var4 & 4) != 0;
		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
		int var8;
		int var9;
		int var11;
		if (var6) {
			var8 = var3.readUnsignedByte();

			for (var9 = 0; var9 < var8; ++var9) {
				int var10 = var3.readUnsignedByte();
				if (var10 != 0) {
					this.floorOverlayIds[var9][var1][var2] = (short)var10;
					var11 = var3.readUnsignedByte();
					this.field1690[var9][var1][var2] = (byte)(var11 >> 2);
					this.field1700[var9][var1][var2] = (byte)(var11 & 3);
				}
			}
		}

		if (var7) {
			for (var8 = 0; var8 < var5; ++var8) {
				var9 = var3.readUnsignedByte();
				if (var9 != 0) {
					WorldMapDecoration[] var14 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						int var12 = var3.method6597();
						int var13 = var3.readUnsignedByte();
						var14[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3);
					}
				}
			}
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-928216914"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "-56"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(B)[Lgl;",
		garbageValue = "-43"
	)
	public static class203[] method3099() {
		return new class203[]{class203.field2335, class203.field2327, class203.field2333, class203.field2329, class203.field2330, class203.field2331, class203.field2332, class203.field2339, class203.field2334, class203.field2328};
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "1081768663"
	)
	public static int method3079(int var0) {
		return var0 >> 17 & 7;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		signature = "([BIII)I",
		garbageValue = "-779732662"
	)
	public static int method3102(byte[] var0, int var1, int var2) {
		int var3 = -1;

		for (int var4 = var1; var4 < var2; ++var4) {
			var3 = var3 >>> 8 ^ Buffer.crc32Table[(var3 ^ var0[var4]) & 255];
		}

		var3 = ~var3;
		return var3;
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		signature = "(Lcs;IIII)V",
		garbageValue = "1966691326"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (Varcs.localPlayer != var0) {
			if (Client.menuOptionsCount < 400) {
				String var4;
				int var7;
				if (var0.skillLevel == 0) {
					String var5 = var0.actions[0] + var0.username + var0.actions[1];
					var7 = var0.combatLevel;
					int var8 = Varcs.localPlayer.combatLevel;
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

					var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2];
				}

				int var10;
				if (Client.isItemSelected == 1) {
					SpriteMask.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + DefaultsGroup.colorStartTag(16777215) + var4, 14, var1, var2, var3);
				} else if (Client.isSpellSelected) {
					if ((UserComparator10.selectedSpellFlags & 8) == 8) {
						SpriteMask.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + DefaultsGroup.colorStartTag(16777215) + var4, 15, var1, var2, var3);
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) {
						if (Client.playerMenuActions[var10] != null) {
							short var11 = 0;
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) {
								if (AttackOption.AttackOption_hidden == Client.playerAttackOption) {
									continue;
								}

								if (AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption || AttackOption.AttackOption_dependsOnCombatLevels == Client.playerAttackOption && var0.combatLevel > Varcs.localPlayer.combatLevel) {
									var11 = 2000;
								}

								if (Varcs.localPlayer.team != 0 && var0.team != 0) {
									if (var0.team == Varcs.localPlayer.team) {
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
							SpriteMask.insertMenuItemNoShift(Client.playerMenuActions[var10], DefaultsGroup.colorStartTag(16777215) + var4, var7, var1, var2, var3);
						}
					}
				}

				for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) {
					if (Client.menuOpcodes[var10] == 23) {
						Client.menuTargets[var10] = DefaultsGroup.colorStartTag(16777215) + var4;
						break;
					}
				}

			}
		}
	}
}
