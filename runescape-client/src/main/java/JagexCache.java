import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("t")
	@Export("JagexCache_locationFile")
	static File JagexCache_locationFile;
	@ObfuscatedName("i")
	@Export("cacheDir")
	static File cacheDir;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Lmz;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Lmz;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "Lmz;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "[Lmz;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("r")
	public static String field2094;

	static {
		JagexCache_randomDat = null;
		JagexCache_dat2File = null;
		JagexCache_idx255File = null;
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		signature = "(IIIII)V",
		garbageValue = "1010534169"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			StructDefinition.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
		}

		long var4 = -1L;
		long var6 = -1L;
		int var8 = 0;

		while (true) {
			int var10 = ViewportMouse.ViewportMouse_entityCount;
			if (var8 >= var10) {
				if (var4 != -1L) {
					var8 = TileItem.method2209(var4);
					int var9 = (int)(var4 >>> 7 & 127L);
					Player var11 = Client.players[Client.combatTargetPlayerIndex];
					VarpDefinition.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var9);
				}

				return;
			}

			long var27 = ViewportMouse.ViewportMouse_entityTags[var8];
			if (var6 != var27) {
				label325: {
					var6 = var27;
					int var15 = WorldMapIcon_1.method381(var8);
					long var18 = ViewportMouse.ViewportMouse_entityTags[var8];
					int var17 = (int)(var18 >>> 7 & 127L);
					var17 = var17;
					long var20 = ViewportMouse.ViewportMouse_entityTags[var8];
					int var19 = (int)(var20 >>> 14 & 3L);
					int var30 = Frames.method3394(var8);
					if (var19 == 2 && ScriptEvent.scene.getObjectFlags(Huffman.Client_plane, var15, var17, var27) >= 0) {
						ObjectComposition var21 = MidiPcmStream.getObjectDefinition(var30);
						if (var21.transforms != null) {
							var21 = var21.transform();
						}

						if (var21 == null) {
							break label325;
						}

						if (Client.isItemSelected == 1) {
							StructDefinition.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + WorldMapAreaData.colorStartTag(65535) + var21.name, 1, var30, var15, var17);
						} else if (Client.isSpellSelected) {
							if ((UserComparator8.selectedSpellFlags & 4) == 4) {
								StructDefinition.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + WorldMapAreaData.colorStartTag(65535) + var21.name, 2, var30, var15, var17);
							}
						} else {
							String[] var31 = var21.actions;
							if (var31 != null) {
								for (int var34 = 4; var34 >= 0; --var34) {
									if (var31[var34] != null) {
										short var24 = 0;
										if (var34 == 0) {
											var24 = 3;
										}

										if (var34 == 1) {
											var24 = 4;
										}

										if (var34 == 2) {
											var24 = 5;
										}

										if (var34 == 3) {
											var24 = 6;
										}

										if (var34 == 4) {
											var24 = 1001;
										}

										StructDefinition.insertMenuItemNoShift(var31[var34], WorldMapAreaData.colorStartTag(65535) + var21.name, var24, var30, var15, var17);
									}
								}
							}

							StructDefinition.insertMenuItemNoShift("Examine", WorldMapAreaData.colorStartTag(65535) + var21.name, 1002, var21.id, var15, var17);
						}
					}

					int var22;
					NPC var23;
					Player var25;
					int[] var38;
					int var40;
					if (var19 == 1) {
						NPC var35 = Client.npcs[var30];
						if (var35 == null) {
							break label325;
						}

						if (var35.definition.size == 1 && (var35.x & 127) == 64 && (var35.y & 127) == 64) {
							for (var22 = 0; var22 < Client.npcCount; ++var22) {
								var23 = Client.npcs[Client.npcIndices[var22]];
								if (var23 != null && var35 != var23 && var23.definition.size == 1 && var35.x == var23.x && var35.y == var23.y) {
									GrandExchangeEvents.addNpcToMenu(var23.definition, Client.npcIndices[var22], var15, var17);
								}
							}

							var22 = Players.Players_count;
							var38 = Players.Players_indices;

							for (var40 = 0; var40 < var22; ++var40) {
								var25 = Client.players[var38[var40]];
								if (var25 != null && var35.x == var25.x && var25.y == var35.y) {
									VarpDefinition.addPlayerToMenu(var25, var38[var40], var15, var17);
								}
							}
						}

						GrandExchangeEvents.addNpcToMenu(var35.definition, var30, var15, var17);
					}

					if (var19 == 0) {
						Player var36 = Client.players[var30];
						if (var36 == null) {
							break label325;
						}

						if ((var36.x & 127) == 64 && (var36.y & 127) == 64) {
							for (var22 = 0; var22 < Client.npcCount; ++var22) {
								var23 = Client.npcs[Client.npcIndices[var22]];
								if (var23 != null && var23.definition.size == 1 && var23.x == var36.x && var36.y == var23.y) {
									GrandExchangeEvents.addNpcToMenu(var23.definition, Client.npcIndices[var22], var15, var17);
								}
							}

							var22 = Players.Players_count;
							var38 = Players.Players_indices;

							for (var40 = 0; var40 < var22; ++var40) {
								var25 = Client.players[var38[var40]];
								if (var25 != null && var36 != var25 && var25.x == var36.x && var36.y == var25.y) {
									VarpDefinition.addPlayerToMenu(var25, var38[var40], var15, var17);
								}
							}
						}

						if (var30 != Client.combatTargetPlayerIndex) {
							VarpDefinition.addPlayerToMenu(var36, var30, var15, var17);
						} else {
							var4 = var27;
						}
					}

					if (var19 == 3) {
						NodeDeque var37 = Client.groundItems[Huffman.Client_plane][var15][var17];
						if (var37 != null) {
							for (TileItem var41 = (TileItem)var37.first(); var41 != null; var41 = (TileItem)var37.next()) {
								ItemComposition var39 = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var41.id);
								if (Client.isItemSelected == 1) {
									StructDefinition.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + WorldMapAreaData.colorStartTag(16748608) + var39.name, 16, var41.id, var15, var17);
								} else if (Client.isSpellSelected) {
									if ((UserComparator8.selectedSpellFlags & 1) == 1) {
										StructDefinition.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + WorldMapAreaData.colorStartTag(16748608) + var39.name, 17, var41.id, var15, var17);
									}
								} else {
									String[] var32 = var39.groundActions;

									for (int var33 = 4; var33 >= 0; --var33) {
										if (var32 != null && var32[var33] != null) {
											byte var26 = 0;
											if (var33 == 0) {
												var26 = 18;
											}

											if (var33 == 1) {
												var26 = 19;
											}

											if (var33 == 2) {
												var26 = 20;
											}

											if (var33 == 3) {
												var26 = 21;
											}

											if (var33 == 4) {
												var26 = 22;
											}

											StructDefinition.insertMenuItemNoShift(var32[var33], WorldMapAreaData.colorStartTag(16748608) + var39.name, var26, var41.id, var15, var17);
										} else if (var33 == 2) {
											StructDefinition.insertMenuItemNoShift("Take", WorldMapAreaData.colorStartTag(16748608) + var39.name, 20, var41.id, var15, var17);
										}
									}

									StructDefinition.insertMenuItemNoShift("Examine", WorldMapAreaData.colorStartTag(16748608) + var39.name, 1004, var41.id, var15, var17);
								}
							}
						}
					}
				}
			}

			++var8;
		}
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "68"
	)
	public static boolean method3576() {
		return Client.staffModLevel >= 2;
	}
}
