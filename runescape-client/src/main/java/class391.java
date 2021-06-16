import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oo")
public class class391 {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1496725553
	)
	public final int field4226;
	@ObfuscatedName("e")
	public Object field4227;

	public class391(int var1) {
		this.field4226 = var1;
	}

	public class391(int var1, Object var2) {
		this.field4226 = var1;
		this.field4227 = var2;
	}

	public int hashCode() {
		return super.hashCode();
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class391)) {
			return false;
		} else {
			class391 var2 = (class391)var1;
			if (var2.field4227 == null && this.field4227 != null) {
				return false;
			} else if (this.field4227 == null && var2.field4227 != null) {
				return false;
			} else {
				return this.field4226 == var2.field4226 && var2.field4227.equals(this.field4227);
			}
		}
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-857761179"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			class22.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
		}

		long var4 = -1L;
		long var6 = -1L;
		int var8 = 0;

		while (true) {
			int var10 = ViewportMouse.ViewportMouse_entityCount;
			if (var8 >= var10) {
				if (-1L != var4) {
					var8 = (int)(var4 >>> 0 & 127L);
					var10 = TextureProvider.method4272(var4);
					Player var11 = Client.players[Client.combatTargetPlayerIndex];
					Actor.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var10);
				}

				return;
			}

			long var27 = UrlRequest.method2516(var8);
			if (var27 != var6) {
				label328: {
					var6 = var27;
					long var15 = ViewportMouse.ViewportMouse_entityTags[var8];
					int var14 = (int)(var15 >>> 0 & 127L);
					var14 = var14;
					int var29 = TextureProvider.method4272(ViewportMouse.ViewportMouse_entityTags[var8]);
					int var16 = var29;
					long var19 = ViewportMouse.ViewportMouse_entityTags[var8];
					int var18 = (int)(var19 >>> 14 & 3L);
					int var30 = Message.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var8]);
					int var20 = var30;
					if (var18 == 2 && DevicePcmPlayerProvider.scene.getObjectFlags(SoundSystem.Client_plane, var14, var29, var27) >= 0) {
						ObjectComposition var21 = Tiles.getObjectDefinition(var30);
						if (var21.transforms != null) {
							var21 = var21.transform();
						}

						if (var21 == null) {
							break label328;
						}

						if (Client.isItemSelected == 1) {
							class22.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + SecureRandomFuture.colorStartTag(65535) + var21.name, 1, var30, var14, var29);
						} else if (Client.isSpellSelected) {
							if ((LoginPacket.selectedSpellFlags & 4) == 4) {
								class22.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + SecureRandomFuture.colorStartTag(65535) + var21.name, 2, var30, var14, var29);
							}
						} else {
							String[] var22 = var21.actions;
							if (var22 != null) {
								for (int var23 = 4; var23 >= 0; --var23) {
									if (var22[var23] != null) {
										short var24 = 0;
										if (var23 == 0) {
											var24 = 3;
										}

										if (var23 == 1) {
											var24 = 4;
										}

										if (var23 == 2) {
											var24 = 5;
										}

										if (var23 == 3) {
											var24 = 6;
										}

										if (var23 == 4) {
											var24 = 1001;
										}

										class22.insertMenuItemNoShift(var22[var23], SecureRandomFuture.colorStartTag(65535) + var21.name, var24, var20, var14, var16);
									}
								}
							}

							class22.insertMenuItemNoShift("Examine", SecureRandomFuture.colorStartTag(65535) + var21.name, 1002, var21.id, var14, var16);
						}
					}

					Player var25;
					int var31;
					NPC var32;
					int var39;
					int[] var40;
					if (var18 == 1) {
						NPC var35 = Client.npcs[var20];
						if (var35 == null) {
							break label328;
						}

						if (var35.definition.size == 1 && (var35.x & 127) == 64 && (var35.y & 127) == 64) {
							for (var31 = 0; var31 < Client.npcCount; ++var31) {
								var32 = Client.npcs[Client.npcIndices[var31]];
								if (var32 != null && var32 != var35 && var32.definition.size == 1 && var32.x == var35.x && var35.y == var32.y) {
									FontName.addNpcToMenu(var32.definition, Client.npcIndices[var31], var14, var16);
								}
							}

							var31 = Players.Players_count;
							var40 = Players.Players_indices;

							for (var39 = 0; var39 < var31; ++var39) {
								var25 = Client.players[var40[var39]];
								if (var25 != null && var35.x == var25.x && var25.y == var35.y) {
									Actor.addPlayerToMenu(var25, var40[var39], var14, var16);
								}
							}
						}

						FontName.addNpcToMenu(var35.definition, var20, var14, var16);
					}

					if (var18 == 0) {
						Player var36 = Client.players[var20];
						if (var36 == null) {
							break label328;
						}

						if ((var36.x & 127) == 64 && (var36.y & 127) == 64) {
							for (var31 = 0; var31 < Client.npcCount; ++var31) {
								var32 = Client.npcs[Client.npcIndices[var31]];
								if (var32 != null && var32.definition.size == 1 && var36.x == var32.x && var32.y == var36.y) {
									FontName.addNpcToMenu(var32.definition, Client.npcIndices[var31], var14, var16);
								}
							}

							var31 = Players.Players_count;
							var40 = Players.Players_indices;

							for (var39 = 0; var39 < var31; ++var39) {
								var25 = Client.players[var40[var39]];
								if (var25 != null && var36 != var25 && var36.x == var25.x && var25.y == var36.y) {
									Actor.addPlayerToMenu(var25, var40[var39], var14, var16);
								}
							}
						}

						if (var20 != Client.combatTargetPlayerIndex) {
							Actor.addPlayerToMenu(var36, var20, var14, var16);
						} else {
							var4 = var27;
						}
					}

					if (var18 == 3) {
						NodeDeque var38 = Client.groundItems[SoundSystem.Client_plane][var14][var16];
						if (var38 != null) {
							for (TileItem var37 = (TileItem)var38.first(); var37 != null; var37 = (TileItem)var38.next()) {
								ItemComposition var41 = class250.ItemDefinition_get(var37.id);
								if (Client.isItemSelected == 1) {
									class22.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + SecureRandomFuture.colorStartTag(16748608) + var41.name, 16, var37.id, var14, var16);
								} else if (Client.isSpellSelected) {
									if ((LoginPacket.selectedSpellFlags & 1) == 1) {
										class22.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + SecureRandomFuture.colorStartTag(16748608) + var41.name, 17, var37.id, var14, var16);
									}
								} else {
									String[] var33 = var41.groundActions;

									for (int var34 = 4; var34 >= 0; --var34) {
										if (var33 != null && var33[var34] != null) {
											byte var26 = 0;
											if (var34 == 0) {
												var26 = 18;
											}

											if (var34 == 1) {
												var26 = 19;
											}

											if (var34 == 2) {
												var26 = 20;
											}

											if (var34 == 3) {
												var26 = 21;
											}

											if (var34 == 4) {
												var26 = 22;
											}

											class22.insertMenuItemNoShift(var33[var34], SecureRandomFuture.colorStartTag(16748608) + var41.name, var26, var37.id, var14, var16);
										} else if (var34 == 2) {
											class22.insertMenuItemNoShift("Take", SecureRandomFuture.colorStartTag(16748608) + var41.name, 20, var37.id, var14, var16);
										}
									}

									class22.insertMenuItemNoShift("Examine", SecureRandomFuture.colorStartTag(16748608) + var41.name, 1004, var37.id, var14, var16);
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
