import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Lnu;"
	)
	@Export("NetCache_reference")
	static Buffer NetCache_reference;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		signature = "Lig;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("f")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Llg;Llg;B)I",
		garbageValue = "-25"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) {
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Ljava/io/File;Ljava/io/File;I)V",
		garbageValue = "1328812178"
	)
	static void method2475(File var0, File var1) {
		try {
			AccessFile var2 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L);
			Buffer var3 = new Buffer(500);
			var3.writeByte(3);
			var3.writeByte(var1 != null ? 1 : 0);
			var3.writeCESU8(var0.getPath());
			if (var1 != null) {
				var3.writeCESU8("");
			}

			var2.write(var3.array, 0, var3.offset);
			var2.close();
		} catch (IOException var4) {
			var4.printStackTrace();
		}

	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		signature = "(IIIII)V",
		garbageValue = "-783594374"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			SpriteMask.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
		}

		long var4 = -1L;
		long var6 = -1L;

		int var8;
		for (var8 = 0; var8 < class124.method2490(); ++var8) {
			long var9 = ViewportMouse.ViewportMouse_entityTags[var8];
			if (var6 != var9) {
				var6 = var9;
				int var13 = Login.method1967(ViewportMouse.ViewportMouse_entityTags[var8]);
				int var14 = var13;
				long var17 = ViewportMouse.ViewportMouse_entityTags[var8];
				int var16 = (int)(var17 >>> 7 & 127L);
				var16 = var16;
				int var27 = class44.method519(var8);
				int var18 = class19.method295(var8);
				if (var27 == 2 && WorldMapArea.scene.getObjectFlags(class26.Client_plane, var13, var16, var9) >= 0) {
					ObjectComposition var19 = class19.getObjectDefinition(var18);
					if (var19.transforms != null) {
						var19 = var19.transform();
					}

					if (var19 == null) {
						continue;
					}

					if (Client.isItemSelected == 1) {
						SpriteMask.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + DefaultsGroup.colorStartTag(65535) + var19.name, 1, var18, var13, var16);
					} else if (Client.isSpellSelected) {
						if ((UserComparator10.selectedSpellFlags & 4) == 4) {
							SpriteMask.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + DefaultsGroup.colorStartTag(65535) + var19.name, 2, var18, var13, var16);
						}
					} else {
						String[] var28 = var19.actions;
						if (var28 != null) {
							for (int var29 = 4; var29 >= 0; --var29) {
								if (var28[var29] != null) {
									short var22 = 0;
									if (var29 == 0) {
										var22 = 3;
									}

									if (var29 == 1) {
										var22 = 4;
									}

									if (var29 == 2) {
										var22 = 5;
									}

									if (var29 == 3) {
										var22 = 6;
									}

									if (var29 == 4) {
										var22 = 1001;
									}

									SpriteMask.insertMenuItemNoShift(var28[var29], DefaultsGroup.colorStartTag(65535) + var19.name, var22, var18, var14, var16);
								}
							}
						}

						SpriteMask.insertMenuItemNoShift("Examine", DefaultsGroup.colorStartTag(65535) + var19.name, 1002, var19.id, var14, var16);
					}
				}

				int var20;
				NPC var21;
				Player var23;
				int[] var35;
				int var37;
				if (var27 == 1) {
					NPC var32 = Client.npcs[var18];
					if (var32 == null) {
						continue;
					}

					if (var32.definition.size == 1 && (var32.x & 127) == 64 && (var32.y & 127) == 64) {
						for (var20 = 0; var20 < Client.npcCount; ++var20) {
							var21 = Client.npcs[Client.npcIndices[var20]];
							if (var21 != null && var32 != var21 && var21.definition.size == 1 && var32.x == var21.x && var21.y == var32.y) {
								WorldMapSection2.addNpcToMenu(var21.definition, Client.npcIndices[var20], var14, var16);
							}
						}

						var20 = Players.Players_count;
						var35 = Players.Players_indices;

						for (var37 = 0; var37 < var20; ++var37) {
							var23 = Client.players[var35[var37]];
							if (var23 != null && var32.x == var23.x && var32.y == var23.y) {
								AbstractWorldMapData.addPlayerToMenu(var23, var35[var37], var14, var16);
							}
						}
					}

					WorldMapSection2.addNpcToMenu(var32.definition, var18, var14, var16);
				}

				if (var27 == 0) {
					Player var33 = Client.players[var18];
					if (var33 == null) {
						continue;
					}

					if ((var33.x & 127) == 64 && (var33.y & 127) == 64) {
						for (var20 = 0; var20 < Client.npcCount; ++var20) {
							var21 = Client.npcs[Client.npcIndices[var20]];
							if (var21 != null && var21.definition.size == 1 && var21.x == var33.x && var33.y == var21.y) {
								WorldMapSection2.addNpcToMenu(var21.definition, Client.npcIndices[var20], var14, var16);
							}
						}

						var20 = Players.Players_count;
						var35 = Players.Players_indices;

						for (var37 = 0; var37 < var20; ++var37) {
							var23 = Client.players[var35[var37]];
							if (var23 != null && var23 != var33 && var33.x == var23.x && var33.y == var23.y) {
								AbstractWorldMapData.addPlayerToMenu(var23, var35[var37], var14, var16);
							}
						}
					}

					if (var18 != Client.combatTargetPlayerIndex) {
						AbstractWorldMapData.addPlayerToMenu(var33, var18, var14, var16);
					} else {
						var4 = var9;
					}
				}

				if (var27 == 3) {
					NodeDeque var34 = Client.groundItems[class26.Client_plane][var14][var16];
					if (var34 != null) {
						for (TileItem var38 = (TileItem)var34.first(); var38 != null; var38 = (TileItem)var34.next()) {
							ItemComposition var36 = class23.ItemDefinition_get(var38.id);
							if (Client.isItemSelected == 1) {
								SpriteMask.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + DefaultsGroup.colorStartTag(16748608) + var36.name, 16, var38.id, var14, var16);
							} else if (Client.isSpellSelected) {
								if ((UserComparator10.selectedSpellFlags & 1) == 1) {
									SpriteMask.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + DefaultsGroup.colorStartTag(16748608) + var36.name, 17, var38.id, var14, var16);
								}
							} else {
								String[] var30 = var36.groundActions;

								for (int var31 = 4; var31 >= 0; --var31) {
									if (var30 != null && var30[var31] != null) {
										byte var24 = 0;
										if (var31 == 0) {
											var24 = 18;
										}

										if (var31 == 1) {
											var24 = 19;
										}

										if (var31 == 2) {
											var24 = 20;
										}

										if (var31 == 3) {
											var24 = 21;
										}

										if (var31 == 4) {
											var24 = 22;
										}

										SpriteMask.insertMenuItemNoShift(var30[var31], DefaultsGroup.colorStartTag(16748608) + var36.name, var24, var38.id, var14, var16);
									} else if (var31 == 2) {
										SpriteMask.insertMenuItemNoShift("Take", DefaultsGroup.colorStartTag(16748608) + var36.name, 20, var38.id, var14, var16);
									}
								}

								SpriteMask.insertMenuItemNoShift("Examine", DefaultsGroup.colorStartTag(16748608) + var36.name, 1004, var38.id, var14, var16);
							}
						}
					}
				}
			}
		}

		if (-1L != var4) {
			var8 = Login.method1967(var4);
			int var25 = (int)(var4 >>> 7 & 127L);
			Player var26 = Client.players[Client.combatTargetPlayerIndex];
			AbstractWorldMapData.addPlayerToMenu(var26, Client.combatTargetPlayerIndex, var8, var25);
		}

	}
}
