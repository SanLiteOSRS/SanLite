import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
public class class163 {
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 939869835
	)
	public static int field1773;

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)V",
		garbageValue = "26478"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) { // L: 10183
			class138.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3); // L: 10184
		}

		long var4 = -1L; // L: 10187
		long var6 = -1L; // L: 10188
		int var8 = 0;

		while (true) {
			int var10 = ViewportMouse.ViewportMouse_entityCount; // L: 10193
			if (var8 >= var10) { // L: 10195
				if (var4 != -1L) { // L: 10333
					var8 = (int)(var4 >>> 0 & 127L); // L: 10336
					var10 = class166.method3386(var4); // L: 10339
					Player var11 = Client.players[Client.combatTargetPlayerIndex]; // L: 10340
					class1.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var10); // L: 10341
				}

				return; // L: 10343
			}

			long var26 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 10198
			if (var6 != var26) { // L: 10201
				label369: {
					var6 = var26; // L: 10202
					int var15 = class14.method185(var8); // L: 10203
					int var16 = class166.method3386(ViewportMouse.ViewportMouse_entityTags[var8]); // L: 10206
					int var17 = var16; // L: 10208
					int var18 = class134.method3040(var8); // L: 10209
					int var19 = ArchiveDisk.method8022(var8); // L: 10210
					int var23;
					if (var18 == 2 && class36.scene.getObjectFlags(Clock.Client_plane, var15, var16, var26) >= 0) { // L: 10211 10212
						ObjectComposition var20 = class175.getObjectDefinition(var19); // L: 10213
						if (var20.transforms != null) { // L: 10214
							var20 = var20.transform();
						}

						if (var20 == null) { // L: 10215
							break label369;
						}

						PendingSpawn var21 = null; // L: 10216

						for (PendingSpawn var22 = (PendingSpawn)Client.pendingSpawns.last(); var22 != null; var22 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 10217
							if (var22.plane == Clock.Client_plane && var15 == var22.x && var17 == var22.y && var19 == var22.field1148) { // L: 10218
								var21 = var22; // L: 10219
								break;
							}
						}

						if (Client.isItemSelected == 1) { // L: 10223
							class138.insertMenuItemNoShift("Use", Client.field667 + " " + "->" + " " + class349.colorStartTag(65535) + var20.name, 1, var19, var15, var17); // L: 10224
						} else if (Client.isSpellSelected) { // L: 10227
							if ((class125.selectedSpellFlags & 4) == 4) { // L: 10228
								class138.insertMenuItemNoShift(Client.field671, Client.field716 + " " + "->" + " " + class349.colorStartTag(65535) + var20.name, 2, var19, var15, var17); // L: 10229
							}
						} else {
							String[] var35 = var20.actions; // L: 10234
							if (var35 != null) { // L: 10235
								for (var23 = 4; var23 >= 0; --var23) { // L: 10236
									if ((var21 == null || var21.method2351(var23)) && var35[var23] != null) { // L: 10237 10238
										short var24 = 0; // L: 10239
										if (var23 == 0) { // L: 10240
											var24 = 3;
										}

										if (var23 == 1) { // L: 10241
											var24 = 4;
										}

										if (var23 == 2) { // L: 10242
											var24 = 5;
										}

										if (var23 == 3) { // L: 10243
											var24 = 6;
										}

										if (var23 == 4) { // L: 10244
											var24 = 1001;
										}

										class138.insertMenuItemNoShift(var35[var23], class349.colorStartTag(65535) + var20.name, var24, var19, var15, var17); // L: 10245
									}
								}
							}

							class138.insertMenuItemNoShift("Examine", class349.colorStartTag(65535) + var20.name, 1002, var20.id, var15, var17); // L: 10250
						}
					}

					int var28;
					Player var29;
					NPC var36;
					int[] var37;
					if (var18 == 1) { // L: 10255
						NPC var31 = Client.npcs[var19]; // L: 10256
						if (var31 == null) { // L: 10257
							break label369;
						}

						if (var31.definition.size == 1 && (var31.x & 127) == 64 && (var31.y & 127) == 64) { // L: 10258
							for (var28 = 0; var28 < Client.npcCount; ++var28) { // L: 10259
								var36 = Client.npcs[Client.npcIndices[var28]]; // L: 10260
								if (var36 != null && var31 != var36 && var36.definition.size == 1 && var31.x == var36.x && var36.y == var31.y) { // L: 10261
									Language.addNpcToMenu(var36, Client.npcIndices[var28], var15, var17);
								}
							}

							var28 = Players.Players_count; // L: 10263
							var37 = Players.Players_indices; // L: 10264

							for (var23 = 0; var23 < var28; ++var23) { // L: 10265
								var29 = Client.players[var37[var23]]; // L: 10266
								if (var29 != null && var31.x == var29.x && var31.y == var29.y) { // L: 10267
									class1.addPlayerToMenu(var29, var37[var23], var15, var17);
								}
							}
						}

						Language.addNpcToMenu(var31, var19, var15, var17); // L: 10270
					}

					if (var18 == 0) { // L: 10272
						Player var32 = Client.players[var19]; // L: 10273
						if (var32 == null) { // L: 10274
							break label369;
						}

						if ((var32.x & 127) == 64 && (var32.y & 127) == 64) { // L: 10275
							for (var28 = 0; var28 < Client.npcCount; ++var28) { // L: 10276
								var36 = Client.npcs[Client.npcIndices[var28]]; // L: 10277
								if (var36 != null && var36.definition.size == 1 && var36.x == var32.x && var32.y == var36.y) { // L: 10278
									Language.addNpcToMenu(var36, Client.npcIndices[var28], var15, var17);
								}
							}

							var28 = Players.Players_count; // L: 10280
							var37 = Players.Players_indices; // L: 10281

							for (var23 = 0; var23 < var28; ++var23) { // L: 10282
								var29 = Client.players[var37[var23]]; // L: 10283
								if (var29 != null && var29 != var32 && var32.x == var29.x && var32.y == var29.y) { // L: 10284
									class1.addPlayerToMenu(var29, var37[var23], var15, var17);
								}
							}
						}

						if (var19 != Client.combatTargetPlayerIndex) { // L: 10287
							class1.addPlayerToMenu(var32, var19, var15, var17);
						} else {
							var4 = var26; // L: 10288
						}
					}

					if (var18 == 3) { // L: 10290
						NodeDeque var33 = Client.groundItems[Clock.Client_plane][var15][var17]; // L: 10291
						if (var33 != null) { // L: 10292
							for (TileItem var34 = (TileItem)var33.first(); var34 != null; var34 = (TileItem)var33.next()) { // L: 10293 10294 10328
								ItemComposition var38 = class300.ItemComposition_get(var34.id); // L: 10295
								if (Client.isItemSelected == 1) { // L: 10296
									class138.insertMenuItemNoShift("Use", Client.field667 + " " + "->" + " " + class349.colorStartTag(16748608) + var38.name, 16, var34.id, var15, var17); // L: 10297
								} else if (Client.isSpellSelected) { // L: 10300
									if ((class125.selectedSpellFlags & 1) == 1) { // L: 10301
										class138.insertMenuItemNoShift(Client.field671, Client.field716 + " " + "->" + " " + class349.colorStartTag(16748608) + var38.name, 17, var34.id, var15, var17); // L: 10302
									}
								} else {
									String[] var30 = var38.groundActions; // L: 10307

									for (int var39 = 4; var39 >= 0; --var39) { // L: 10308
										if (var34.method2661(var39)) { // L: 10309
											if (var30 != null && var30[var39] != null) { // L: 10310
												byte var25 = 0; // L: 10311
												if (var39 == 0) { // L: 10312
													var25 = 18;
												}

												if (var39 == 1) { // L: 10313
													var25 = 19;
												}

												if (var39 == 2) { // L: 10314
													var25 = 20;
												}

												if (var39 == 3) { // L: 10315
													var25 = 21;
												}

												if (var39 == 4) { // L: 10316
													var25 = 22;
												}

												class138.insertMenuItemNoShift(var30[var39], class349.colorStartTag(16748608) + var38.name, var25, var34.id, var15, var17); // L: 10317
											} else if (var39 == 2) { // L: 10320
												class138.insertMenuItemNoShift("Take", class349.colorStartTag(16748608) + var38.name, 20, var34.id, var15, var17); // L: 10321
											}
										}
									}

									class138.insertMenuItemNoShift("Examine", class349.colorStartTag(16748608) + var38.name, 1004, var34.id, var15, var17); // L: 10325
								}
							}
						}
					}
				}
			}

			++var8; // L: 10189
		}
	}
}
