import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Lib;"
	)
	@Export("InvDefinition_archive")
	public static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Lez;"
	)
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -449980577
	)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	InvDefinition() {
		this.size = 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "(Lkj;I)V",
		garbageValue = "1553227533"
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(Lkj;IB)V",
		garbageValue = "127"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) {
			this.size = var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(I)[Lgs;",
		garbageValue = "-1827555647"
	)
	public static class194[] method4371() {
		return new class194[]{class194.field2348, class194.field2342, class194.field2344, class194.field2350, class194.field2346, class194.field2345, class194.field2343, class194.field2349, class194.field2347, class194.field2351};
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		signature = "(IIIII)V",
		garbageValue = "-982024968"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			WorldMapRegion.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
		}

		long var4 = -1L;
		long var6 = -1L;
		int var8 = 0;

		while (true) {
			int var10 = ViewportMouse.ViewportMouse_entityCount;
			if (var8 >= var10) {
				if (var4 != -1L) {
					var8 = ClientPacket.method3671(var4);
					int var9 = (int)(var4 >>> 7 & 127L);
					Player var11 = Client.players[Client.combatTargetPlayerIndex];
					FloorDecoration.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var9);
				}

				return;
			}

			long var27 = ViewportMouse.ViewportMouse_entityTags[var8];
			if (var27 != var6) {
				label332: {
					var6 = var27;
					int var15 = LoginScreenAnimation.method1904(var8);
					int var16 = Tiles.method1170(var8);
					int var17 = Widget.method4077(ViewportMouse.ViewportMouse_entityTags[var8]);
					int var19 = Occluder.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var8]);
					int var20 = var19;
					if (var17 == 2 && ArchiveLoader.scene.getObjectFlags(GameObject.Client_plane, var15, var16, var27) >= 0) {
						ObjectComposition var21 = WorldMapDecoration.getObjectDefinition(var19);
						if (var21.transforms != null) {
							var21 = var21.transform();
						}

						if (var21 == null) {
							break label332;
						}

						if (Client.isItemSelected == 1) {
							WorldMapRegion.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class23.colorStartTag(65535) + var21.name, 1, var19, var15, var16);
						} else if (Client.isSpellSelected) {
							if ((Player.selectedSpellFlags & 4) == 4) {
								WorldMapRegion.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class23.colorStartTag(65535) + var21.name, 2, var19, var15, var16);
							}
						} else {
							String[] var29 = var21.actions;
							if (var29 != null) {
								for (int var30 = 4; var30 >= 0; --var30) {
									if (var29[var30] != null) {
										short var24 = 0;
										if (var30 == 0) {
											var24 = 3;
										}

										if (var30 == 1) {
											var24 = 4;
										}

										if (var30 == 2) {
											var24 = 5;
										}

										if (var30 == 3) {
											var24 = 6;
										}

										if (var30 == 4) {
											var24 = 1001;
										}

										WorldMapRegion.insertMenuItemNoShift(var29[var30], class23.colorStartTag(65535) + var21.name, var24, var20, var15, var16);
									}
								}
							}

							WorldMapRegion.insertMenuItemNoShift("Examine", class23.colorStartTag(65535) + var21.name, 1002, var21.id, var15, var16);
						}
					}

					int var22;
					NPC var23;
					Player var32;
					int[] var36;
					int var38;
					if (var17 == 1) {
						NPC var33 = Client.npcs[var20];
						if (var33 == null) {
							break label332;
						}

						if (var33.definition.size == 1 && (var33.x & 127) == 64 && (var33.y & 127) == 64) {
							for (var22 = 0; var22 < Client.npcCount; ++var22) {
								var23 = Client.npcs[Client.npcIndices[var22]];
								if (var23 != null && var23 != var33 && var23.definition.size == 1 && var33.x == var23.x && var33.y == var23.y) {
									TileItem.addNpcToMenu(var23.definition, Client.npcIndices[var22], var15, var16);
								}
							}

							var22 = Players.Players_count;
							var36 = Players.Players_indices;

							for (var38 = 0; var38 < var22; ++var38) {
								var32 = Client.players[var36[var38]];
								if (var32 != null && var33.x == var32.x && var32.y == var33.y) {
									FloorDecoration.addPlayerToMenu(var32, var36[var38], var15, var16);
								}
							}
						}

						TileItem.addNpcToMenu(var33.definition, var20, var15, var16);
					}

					if (var17 == 0) {
						Player var34 = Client.players[var20];
						if (var34 == null) {
							break label332;
						}

						if ((var34.x & 127) == 64 && (var34.y & 127) == 64) {
							for (var22 = 0; var22 < Client.npcCount; ++var22) {
								var23 = Client.npcs[Client.npcIndices[var22]];
								if (var23 != null && var23.definition.size == 1 && var23.x == var34.x && var34.y == var23.y) {
									TileItem.addNpcToMenu(var23.definition, Client.npcIndices[var22], var15, var16);
								}
							}

							var22 = Players.Players_count;
							var36 = Players.Players_indices;

							for (var38 = 0; var38 < var22; ++var38) {
								var32 = Client.players[var36[var38]];
								if (var32 != null && var34 != var32 && var34.x == var32.x && var34.y == var32.y) {
									FloorDecoration.addPlayerToMenu(var32, var36[var38], var15, var16);
								}
							}
						}

						if (var20 != Client.combatTargetPlayerIndex) {
							FloorDecoration.addPlayerToMenu(var34, var20, var15, var16);
						} else {
							var4 = var27;
						}
					}

					if (var17 == 3) {
						NodeDeque var35 = Client.groundItems[GameObject.Client_plane][var15][var16];
						if (var35 != null) {
							for (TileItem var39 = (TileItem)var35.first(); var39 != null; var39 = (TileItem)var35.next()) {
								ItemComposition var37 = SecureRandomCallable.ItemDefinition_get(var39.id);
								if (Client.isItemSelected == 1) {
									WorldMapRegion.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class23.colorStartTag(16748608) + var37.name, 16, var39.id, var15, var16);
								} else if (Client.isSpellSelected) {
									if ((Player.selectedSpellFlags & 1) == 1) {
										WorldMapRegion.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class23.colorStartTag(16748608) + var37.name, 17, var39.id, var15, var16);
									}
								} else {
									String[] var31 = var37.groundActions;

									for (int var25 = 4; var25 >= 0; --var25) {
										if (var31 != null && var31[var25] != null) {
											byte var26 = 0;
											if (var25 == 0) {
												var26 = 18;
											}

											if (var25 == 1) {
												var26 = 19;
											}

											if (var25 == 2) {
												var26 = 20;
											}

											if (var25 == 3) {
												var26 = 21;
											}

											if (var25 == 4) {
												var26 = 22;
											}

											WorldMapRegion.insertMenuItemNoShift(var31[var25], class23.colorStartTag(16748608) + var37.name, var26, var39.id, var15, var16);
										} else if (var25 == 2) {
											WorldMapRegion.insertMenuItemNoShift("Take", class23.colorStartTag(16748608) + var37.name, 20, var39.id, var15, var16);
										}
									}

									WorldMapRegion.insertMenuItemNoShift("Examine", class23.colorStartTag(16748608) + var37.name, 1004, var39.id, var15, var16);
								}
							}
						}
					}
				}
			}

			++var8;
		}
	}
}
