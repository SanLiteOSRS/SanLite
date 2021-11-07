import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("h")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class45 {
	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "[Low;"
	)
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;

	DevicePcmPlayerProvider() {
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(S)Lak;",
		garbageValue = "6712"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer();
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)Lnv;",
		garbageValue = "1795857888"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(JagexCache.cacheDir, "preferences" + var0 + ".dat");
		if (var3.exists()) {
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L);
				return var10;
			} catch (IOException var9) {
			}
		}

		String var4 = "";
		if (JagexCache.cacheGamebuild == 33) {
			var4 = "_rc";
		} else if (JagexCache.cacheGamebuild == 34) {
			var4 = "_wip";
		}

		File var5 = new File(TriBool.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
		AccessFile var6;
		if (!var2 && var5.exists()) {
			try {
				var6 = new AccessFile(var5, "rw", 10000L);
				return var6;
			} catch (IOException var8) {
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L);
			return var6;
		} catch (IOException var7) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)V",
		garbageValue = "1000"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			EnumComposition.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
		}

		long var4 = -1L;
		long var6 = -1L;
		int var8 = 0;

		while (true) {
			int var10 = ViewportMouse.ViewportMouse_entityCount;
			if (var8 >= var10) {
				if (-1L != var4) {
					var8 = class138.method2827(var4);
					int var9 = (int)(var4 >>> 7 & 127L);
					Player var11 = Client.players[Client.combatTargetPlayerIndex];
					GraphicsObject.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var9);
				}

				return;
			}

			long var24 = Player.method2159(var8);
			if (var6 != var24) {
				label330: {
					var6 = var24;
					int var13 = class54.method1111(var8);
					int var14 = TextureProvider.method4518(var8);
					long var17 = ViewportMouse.ViewportMouse_entityTags[var8];
					int var16 = (int)(var17 >>> 14 & 3L);
					int var26 = SoundSystem.method787(var8);
					if (var16 == 2 && GameBuild.scene.getObjectFlags(GrandExchangeOfferTotalQuantityComparator.Client_plane, var13, var14, var24) >= 0) {
						ObjectComposition var18 = KitDefinition.getObjectDefinition(var26);
						if (var18.transforms != null) {
							var18 = var18.transform();
						}

						if (var18 == null) {
							break label330;
						}

						if (Client.isItemSelected == 1) {
							EnumComposition.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + MouseHandler.colorStartTag(65535) + var18.name, 1, var26, var13, var14);
						} else if (Client.isSpellSelected) {
							if ((class116.selectedSpellFlags & 4) == 4) {
								EnumComposition.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + MouseHandler.colorStartTag(65535) + var18.name, 2, var26, var13, var14);
							}
						} else {
							String[] var19 = var18.actions;
							if (var19 != null) {
								for (int var20 = 4; var20 >= 0; --var20) {
									if (var19[var20] != null) {
										short var21 = 0;
										if (var20 == 0) {
											var21 = 3;
										}

										if (var20 == 1) {
											var21 = 4;
										}

										if (var20 == 2) {
											var21 = 5;
										}

										if (var20 == 3) {
											var21 = 6;
										}

										if (var20 == 4) {
											var21 = 1001;
										}

										EnumComposition.insertMenuItemNoShift(var19[var20], MouseHandler.colorStartTag(65535) + var18.name, var21, var26, var13, var14);
									}
								}
							}

							EnumComposition.insertMenuItemNoShift("Examine", MouseHandler.colorStartTag(65535) + var18.name, 1002, var18.id, var13, var14);
						}
					}

					Player var22;
					int var27;
					NPC var28;
					int var35;
					int[] var36;
					if (var16 == 1) {
						NPC var31 = Client.npcs[var26];
						if (var31 == null) {
							break label330;
						}

						if (var31.definition.size == 1 && (var31.x & 127) == 64 && (var31.y & 127) == 64) {
							for (var27 = 0; var27 < Client.npcCount; ++var27) {
								var28 = Client.npcs[Client.npcIndices[var27]];
								if (var28 != null && var31 != var28 && var28.definition.size == 1 && var28.x == var31.x && var31.y == var28.y) {
									WorldMapScaleHandler.addNpcToMenu(var28, Client.npcIndices[var27], var13, var14);
								}
							}

							var27 = Players.Players_count;
							var36 = Players.Players_indices;

							for (var35 = 0; var35 < var27; ++var35) {
								var22 = Client.players[var36[var35]];
								if (var22 != null && var31.x == var22.x && var22.y == var31.y) {
									GraphicsObject.addPlayerToMenu(var22, var36[var35], var13, var14);
								}
							}
						}

						WorldMapScaleHandler.addNpcToMenu(var31, var26, var13, var14);
					}

					if (var16 == 0) {
						Player var32 = Client.players[var26];
						if (var32 == null) {
							break label330;
						}

						if ((var32.x & 127) == 64 && (var32.y & 127) == 64) {
							for (var27 = 0; var27 < Client.npcCount; ++var27) {
								var28 = Client.npcs[Client.npcIndices[var27]];
								if (var28 != null && var28.definition.size == 1 && var32.x == var28.x && var32.y == var28.y) {
									WorldMapScaleHandler.addNpcToMenu(var28, Client.npcIndices[var27], var13, var14);
								}
							}

							var27 = Players.Players_count;
							var36 = Players.Players_indices;

							for (var35 = 0; var35 < var27; ++var35) {
								var22 = Client.players[var36[var35]];
								if (var22 != null && var22 != var32 && var32.x == var22.x && var32.y == var22.y) {
									GraphicsObject.addPlayerToMenu(var22, var36[var35], var13, var14);
								}
							}
						}

						if (var26 != Client.combatTargetPlayerIndex) {
							GraphicsObject.addPlayerToMenu(var32, var26, var13, var14);
						} else {
							var4 = var24;
						}
					}

					if (var16 == 3) {
						NodeDeque var34 = Client.groundItems[GrandExchangeOfferTotalQuantityComparator.Client_plane][var13][var14];
						if (var34 != null) {
							for (TileItem var33 = (TileItem)var34.first(); var33 != null; var33 = (TileItem)var34.next()) {
								ItemComposition var37 = TaskHandler.ItemDefinition_get(var33.id);
								if (Client.isItemSelected == 1) {
									EnumComposition.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + MouseHandler.colorStartTag(16748608) + var37.name, 16, var33.id, var13, var14);
								} else if (Client.isSpellSelected) {
									if ((class116.selectedSpellFlags & 1) == 1) {
										EnumComposition.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + MouseHandler.colorStartTag(16748608) + var37.name, 17, var33.id, var13, var14);
									}
								} else {
									String[] var29 = var37.groundActions;

									for (int var30 = 4; var30 >= 0; --var30) {
										if (var29 != null && var29[var30] != null) {
											byte var23 = 0;
											if (var30 == 0) {
												var23 = 18;
											}

											if (var30 == 1) {
												var23 = 19;
											}

											if (var30 == 2) {
												var23 = 20;
											}

											if (var30 == 3) {
												var23 = 21;
											}

											if (var30 == 4) {
												var23 = 22;
											}

											EnumComposition.insertMenuItemNoShift(var29[var30], MouseHandler.colorStartTag(16748608) + var37.name, var23, var33.id, var13, var14);
										} else if (var30 == 2) {
											EnumComposition.insertMenuItemNoShift("Take", MouseHandler.colorStartTag(16748608) + var37.name, 20, var33.id, var13, var14);
										}
									}

									EnumComposition.insertMenuItemNoShift("Examine", MouseHandler.colorStartTag(16748608) + var37.name, 1004, var33.id, var13, var14);
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
