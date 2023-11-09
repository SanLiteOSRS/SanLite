import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
final class class105 implements class323 {
	@ObfuscatedName("ab")
	public static short[] field1357;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lme;)V"
	)
	class105(Widget var1) {
		this.val$cc = var1; // L: 503
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "120"
	)
	public void vmethod6111() {
		if (this.val$cc != null && this.val$cc.method6504().field3549 != null) { // L: 505
			ScriptEvent var1 = new ScriptEvent(); // L: 506
			var1.method2309(this.val$cc); // L: 507
			var1.setArgs(this.val$cc.method6504().field3549); // L: 508
			FaceNormal.method4805().addFirst(var1); // L: 509
		}

	} // L: 511

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "53"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) { // L: 10198
			class238.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3); // L: 10199
		}

		long var4 = -1L; // L: 10202
		long var6 = -1L; // L: 10203

		int var8;
		for (var8 = 0; var8 < class173.method3574(); ++var8) { // L: 10204
			long var26 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 10207
			if (var26 != var6) { // L: 10210
				var6 = var26; // L: 10211
				int var13 = class74.method2093(var8); // L: 10212
				long var16 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 10216
				int var15 = (int)(var16 >>> 7 & 127L); // L: 10218
				var15 = var15; // L: 10222
				long var18 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 10226
				int var17 = (int)(var18 >>> 14 & 3L); // L: 10228
				int var31 = class318.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var8]); // L: 10235
				int var19 = var31; // L: 10237
				int var23;
				if (var17 == 2 && class173.scene.getObjectFlags(BuddyRankComparator.Client_plane, var13, var15, var26) >= 0) { // L: 10238 10239
					ObjectComposition var20 = Language.getObjectDefinition(var31); // L: 10240
					if (var20.transforms != null) { // L: 10241
						var20 = var20.transform();
					}

					if (var20 == null) { // L: 10242
						continue;
					}

					PendingSpawn var21 = null; // L: 10243

					for (PendingSpawn var22 = (PendingSpawn)Client.pendingSpawns.last(); var22 != null; var22 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 10244
						if (var22.plane == BuddyRankComparator.Client_plane && var13 == var22.x && var15 == var22.y && var19 == var22.field1168) { // L: 10245
							var21 = var22; // L: 10246
							break;
						}
					}

					if (Client.isItemSelected == 1) { // L: 10250
						class238.insertMenuItemNoShift("Use", Client.field661 + " " + "->" + " " + class17.colorStartTag(65535) + var20.name, 1, var19, var13, var15); // L: 10251
					} else if (Client.isSpellSelected) { // L: 10254
						if ((class13.selectedSpellFlags & 4) == 4) { // L: 10255
							class238.insertMenuItemNoShift(Client.field665, Client.field666 + " " + "->" + " " + class17.colorStartTag(65535) + var20.name, 2, var19, var13, var15); // L: 10256
						}
					} else {
						String[] var39 = var20.actions; // L: 10261
						if (var39 != null) { // L: 10262
							for (var23 = 4; var23 >= 0; --var23) { // L: 10263
								if ((var21 == null || var21.method2414(var23)) && var39[var23] != null) { // L: 10264 10265
									short var24 = 0; // L: 10266
									if (var23 == 0) { // L: 10267
										var24 = 3;
									}

									if (var23 == 1) { // L: 10268
										var24 = 4;
									}

									if (var23 == 2) { // L: 10269
										var24 = 5;
									}

									if (var23 == 3) { // L: 10270
										var24 = 6;
									}

									if (var23 == 4) { // L: 10271
										var24 = 1001;
									}

									class238.insertMenuItemNoShift(var39[var23], class17.colorStartTag(65535) + var20.name, var24, var19, var13, var15); // L: 10272
								}
							}
						}

						class238.insertMenuItemNoShift("Examine", class17.colorStartTag(65535) + var20.name, 1002, var20.id, var13, var15); // L: 10277
					}
				}

				int var32;
				Player var33;
				NPC var40;
				int[] var41;
				if (var17 == 1) { // L: 10282
					NPC var35 = Client.npcs[var19]; // L: 10283
					if (var35 == null) { // L: 10284
						continue;
					}

					if (var35.definition.size == 1 && (var35.x & 127) == 64 && (var35.y & 127) == 64) { // L: 10285
						for (var32 = 0; var32 < Client.npcCount; ++var32) { // L: 10286
							var40 = Client.npcs[Client.npcIndices[var32]]; // L: 10287
							if (var40 != null && var35 != var40 && var40.definition.size == 1 && var40.x == var35.x && var40.y == var35.y) { // L: 10288
								ModelData0.addNpcToMenu(var40, Client.npcIndices[var32], var13, var15);
							}
						}

						var32 = Players.Players_count; // L: 10290
						var41 = Players.Players_indices; // L: 10291

						for (var23 = 0; var23 < var32; ++var23) { // L: 10292
							var33 = Client.players[var41[var23]]; // L: 10293
							if (var33 != null && var33.x == var35.x && var33.y == var35.y) { // L: 10294
								Tiles.addPlayerToMenu(var33, var41[var23], var13, var15);
							}
						}
					}

					ModelData0.addNpcToMenu(var35, var19, var13, var15); // L: 10297
				}

				if (var17 == 0) { // L: 10299
					Player var36 = Client.players[var19]; // L: 10300
					if (var36 == null) { // L: 10301
						continue;
					}

					if ((var36.x & 127) == 64 && (var36.y & 127) == 64) { // L: 10302
						for (var32 = 0; var32 < Client.npcCount; ++var32) { // L: 10303
							var40 = Client.npcs[Client.npcIndices[var32]]; // L: 10304
							if (var40 != null && var40.definition.size == 1 && var36.x == var40.x && var36.y == var40.y) { // L: 10305
								ModelData0.addNpcToMenu(var40, Client.npcIndices[var32], var13, var15);
							}
						}

						var32 = Players.Players_count; // L: 10307
						var41 = Players.Players_indices; // L: 10308

						for (var23 = 0; var23 < var32; ++var23) { // L: 10309
							var33 = Client.players[var41[var23]]; // L: 10310
							if (var33 != null && var36 != var33 && var36.x == var33.x && var36.y == var33.y) { // L: 10311
								Tiles.addPlayerToMenu(var33, var41[var23], var13, var15);
							}
						}
					}

					if (var19 != Client.combatTargetPlayerIndex) { // L: 10314
						Tiles.addPlayerToMenu(var36, var19, var13, var15);
					} else {
						var4 = var26; // L: 10315
					}
				}

				if (var17 == 3) { // L: 10317
					NodeDeque var37 = Client.groundItems[BuddyRankComparator.Client_plane][var13][var15]; // L: 10318
					if (var37 != null) { // L: 10319
						for (TileItem var38 = (TileItem)var37.first(); var38 != null; var38 = (TileItem)var37.next()) { // L: 10320 10321 10355
							ItemComposition var42 = class141.ItemComposition_get(var38.id); // L: 10322
							if (Client.isItemSelected == 1) { // L: 10323
								class238.insertMenuItemNoShift("Use", Client.field661 + " " + "->" + " " + class17.colorStartTag(16748608) + var42.name, 16, var38.id, var13, var15); // L: 10324
							} else if (Client.isSpellSelected) { // L: 10327
								if ((class13.selectedSpellFlags & 1) == 1) { // L: 10328
									class238.insertMenuItemNoShift(Client.field665, Client.field666 + " " + "->" + " " + class17.colorStartTag(16748608) + var42.name, 17, var38.id, var13, var15); // L: 10329
								}
							} else {
								String[] var34 = var42.groundActions; // L: 10334

								for (int var43 = 4; var43 >= 0; --var43) { // L: 10335
									if (var38.method2729(var43)) { // L: 10336
										if (var34 != null && var34[var43] != null) { // L: 10337
											byte var25 = 0; // L: 10338
											if (var43 == 0) { // L: 10339
												var25 = 18;
											}

											if (var43 == 1) { // L: 10340
												var25 = 19;
											}

											if (var43 == 2) { // L: 10341
												var25 = 20;
											}

											if (var43 == 3) { // L: 10342
												var25 = 21;
											}

											if (var43 == 4) { // L: 10343
												var25 = 22;
											}

											class238.insertMenuItemNoShift(var34[var43], class17.colorStartTag(16748608) + var42.name, var25, var38.id, var13, var15); // L: 10344
										} else if (var43 == 2) { // L: 10347
											class238.insertMenuItemNoShift("Take", class17.colorStartTag(16748608) + var42.name, 20, var38.id, var13, var15); // L: 10348
										}
									}
								}

								class238.insertMenuItemNoShift("Examine", class17.colorStartTag(16748608) + var42.name, 1004, var38.id, var13, var15); // L: 10352
							}
						}
					}
				}
			}
		}

		if (-1L != var4) { // L: 10360
			var8 = class7.method58(var4); // L: 10361
			int var9 = (int)(var4 >>> 7 & 127L); // L: 10364
			Player var11 = Client.players[Client.combatTargetPlayerIndex]; // L: 10367
			Tiles.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var9); // L: 10368
		}

	} // L: 10370
}
