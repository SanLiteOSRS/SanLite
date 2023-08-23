import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
class class134 implements Callable {
	@ObfuscatedName("qj")
	@ObfuscatedGetter(
		intValue = 1753680661
	)
	static int field1611;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class137 this$0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ltm;"
	)
	final Buffer val$p;
	// $FF: synthetic field
	final int val$version;

	@ObfuscatedSignature(
		descriptor = "(Lfv;Ltm;I)V"
	)
	class134(class137 var1, Buffer var2, int var3) {
		this.this$0 = var1; // L: 42
		this.val$p = var2;
		this.val$version = var3;
	}

	public Object call() {
		this.this$0.method3057(this.val$p, this.val$version); // L: 45
		return null; // L: 46
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)J",
		garbageValue = "-41"
	)
	static long method3049(CharSequence var0) {
		long var1 = 0L; // L: 16
		int var3 = var0.length(); // L: 17

		for (int var4 = 0; var4 < var3; ++var4) { // L: 18
			var1 *= 37L; // L: 19
			char var5 = var0.charAt(var4); // L: 20
			if (var5 >= 'A' && var5 <= 'Z') { // L: 21
				var1 += (long)(var5 + 1 - 65);
			} else if (var5 >= 'a' && var5 <= 'z') { // L: 22
				var1 += (long)(var5 + 1 - 97);
			} else if (var5 >= '0' && var5 <= '9') {
				var1 += (long)(var5 + 27 - 48); // L: 23
			}

			if (var1 >= 177917621779460413L) { // L: 24
				break;
			}
		}

		while (var1 % 37L == 0L && var1 != 0L) { // L: 26
			var1 /= 37L;
		}

		return var1; // L: 27
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "3"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) { // L: 10248
			class385.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3); // L: 10249
		}

		long var4 = -1L; // L: 10252
		long var6 = -1L; // L: 10253
		int var8 = 0;

		while (true) {
			int var10 = ViewportMouse.ViewportMouse_entityCount; // L: 10258
			if (var8 >= var10) { // L: 10260
				if (var4 != -1L) { // L: 10398
					var8 = (int)(var4 >>> 0 & 127L); // L: 10401
					var10 = (int)(var4 >>> 7 & 127L); // L: 10406
					Player var12 = Client.players[Client.combatTargetPlayerIndex]; // L: 10409
					ItemLayer.addPlayerToMenu(var12, Client.combatTargetPlayerIndex, var8, var10); // L: 10410
				}

				return; // L: 10412
			}

			long var25 = WorldMapSectionType.method5445(var8); // L: 10261
			if (var6 != var25) { // L: 10262
				label371: {
					var6 = var25; // L: 10263
					int var13 = Interpreter.method2069(var8); // L: 10264
					int var14 = PcmPlayer.method854(var8); // L: 10265
					int var15 = class177.method3494(ViewportMouse.ViewportMouse_entityTags[var8]); // L: 10268
					int var17 = InvDefinition.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var8]); // L: 10273
					int var18 = var17; // L: 10275
					int var22;
					if (var15 == 2 && class130.scene.getObjectFlags(HealthBar.Client_plane, var13, var14, var25) >= 0) { // L: 10276 10277
						ObjectComposition var19 = WorldMapElement.getObjectDefinition(var17); // L: 10278
						if (var19.transforms != null) { // L: 10279
							var19 = var19.transform();
						}

						if (var19 == null) { // L: 10280
							break label371;
						}

						PendingSpawn var20 = null; // L: 10281

						for (PendingSpawn var21 = (PendingSpawn)Client.pendingSpawns.last(); var21 != null; var21 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 10282
							if (var21.plane == HealthBar.Client_plane && var13 == var21.x && var14 == var21.y && var18 == var21.field1187) { // L: 10283
								var20 = var21; // L: 10284
								break;
							}
						}

						if (Client.isItemSelected == 1) { // L: 10288
							class385.insertMenuItemNoShift("Use", Client.field692 + " " + "->" + " " + class217.colorStartTag(65535) + var19.name, 1, var18, var13, var14); // L: 10289
						} else if (Client.isSpellSelected) { // L: 10292
							if ((Canvas.selectedSpellFlags & 4) == 4) { // L: 10293
								class385.insertMenuItemNoShift(Client.field709, Client.field720 + " " + "->" + " " + class217.colorStartTag(65535) + var19.name, 2, var18, var13, var14); // L: 10294
							}
						} else {
							String[] var34 = var19.actions; // L: 10299
							if (var34 != null) { // L: 10300
								for (var22 = 4; var22 >= 0; --var22) { // L: 10301
									if ((var20 == null || var20.method2362(var22)) && var34[var22] != null) { // L: 10302 10303
										short var23 = 0; // L: 10304
										if (var22 == 0) { // L: 10305
											var23 = 3;
										}

										if (var22 == 1) { // L: 10306
											var23 = 4;
										}

										if (var22 == 2) { // L: 10307
											var23 = 5;
										}

										if (var22 == 3) { // L: 10308
											var23 = 6;
										}

										if (var22 == 4) { // L: 10309
											var23 = 1001;
										}

										class385.insertMenuItemNoShift(var34[var22], class217.colorStartTag(65535) + var19.name, var23, var18, var13, var14); // L: 10310
									}
								}
							}

							class385.insertMenuItemNoShift("Examine", class217.colorStartTag(65535) + var19.name, 1002, var19.id, var13, var14); // L: 10315
						}
					}

					int var27;
					Player var28;
					NPC var35;
					int[] var36;
					if (var15 == 1) { // L: 10320
						NPC var30 = Client.npcs[var18]; // L: 10321
						if (var30 == null) { // L: 10322
							break label371;
						}

						if (var30.definition.size == 1 && (var30.x & 127) == 64 && (var30.y & 127) == 64) { // L: 10323
							for (var27 = 0; var27 < Client.npcCount; ++var27) { // L: 10324
								var35 = Client.npcs[Client.npcIndices[var27]]; // L: 10325
								if (var35 != null && var30 != var35 && var35.definition.size == 1 && var30.x == var35.x && var35.y == var30.y) { // L: 10326
									class260.addNpcToMenu(var35, Client.npcIndices[var27], var13, var14);
								}
							}

							var27 = Players.Players_count; // L: 10328
							var36 = Players.Players_indices; // L: 10329

							for (var22 = 0; var22 < var27; ++var22) { // L: 10330
								var28 = Client.players[var36[var22]]; // L: 10331
								if (var28 != null && var30.x == var28.x && var28.y == var30.y) { // L: 10332
									ItemLayer.addPlayerToMenu(var28, var36[var22], var13, var14);
								}
							}
						}

						class260.addNpcToMenu(var30, var18, var13, var14); // L: 10335
					}

					if (var15 == 0) { // L: 10337
						Player var31 = Client.players[var18]; // L: 10338
						if (var31 == null) { // L: 10339
							break label371;
						}

						if ((var31.x & 127) == 64 && (var31.y & 127) == 64) { // L: 10340
							for (var27 = 0; var27 < Client.npcCount; ++var27) { // L: 10341
								var35 = Client.npcs[Client.npcIndices[var27]]; // L: 10342
								if (var35 != null && var35.definition.size == 1 && var35.x == var31.x && var35.y == var31.y) { // L: 10343
									class260.addNpcToMenu(var35, Client.npcIndices[var27], var13, var14);
								}
							}

							var27 = Players.Players_count; // L: 10345
							var36 = Players.Players_indices; // L: 10346

							for (var22 = 0; var22 < var27; ++var22) { // L: 10347
								var28 = Client.players[var36[var22]]; // L: 10348
								if (var28 != null && var31 != var28 && var31.x == var28.x && var28.y == var31.y) { // L: 10349
									ItemLayer.addPlayerToMenu(var28, var36[var22], var13, var14);
								}
							}
						}

						if (var18 != Client.combatTargetPlayerIndex) { // L: 10352
							ItemLayer.addPlayerToMenu(var31, var18, var13, var14);
						} else {
							var4 = var25; // L: 10353
						}
					}

					if (var15 == 3) { // L: 10355
						NodeDeque var32 = Client.groundItems[HealthBar.Client_plane][var13][var14]; // L: 10356
						if (var32 != null) { // L: 10357
							for (TileItem var33 = (TileItem)var32.first(); var33 != null; var33 = (TileItem)var32.next()) { // L: 10358 10359 10393
								ItemComposition var37 = InvDefinition.ItemComposition_get(var33.id); // L: 10360
								if (Client.isItemSelected == 1) { // L: 10361
									class385.insertMenuItemNoShift("Use", Client.field692 + " " + "->" + " " + class217.colorStartTag(16748608) + var37.name, 16, var33.id, var13, var14); // L: 10362
								} else if (Client.isSpellSelected) { // L: 10365
									if ((Canvas.selectedSpellFlags & 1) == 1) { // L: 10366
										class385.insertMenuItemNoShift(Client.field709, Client.field720 + " " + "->" + " " + class217.colorStartTag(16748608) + var37.name, 17, var33.id, var13, var14); // L: 10367
									}
								} else {
									String[] var29 = var37.groundActions; // L: 10372

									for (int var38 = 4; var38 >= 0; --var38) { // L: 10373
										if (var33.method2673(var38)) { // L: 10374
											if (var29 != null && var29[var38] != null) { // L: 10375
												byte var24 = 0; // L: 10376
												if (var38 == 0) { // L: 10377
													var24 = 18;
												}

												if (var38 == 1) { // L: 10378
													var24 = 19;
												}

												if (var38 == 2) { // L: 10379
													var24 = 20;
												}

												if (var38 == 3) { // L: 10380
													var24 = 21;
												}

												if (var38 == 4) { // L: 10381
													var24 = 22;
												}

												class385.insertMenuItemNoShift(var29[var38], class217.colorStartTag(16748608) + var37.name, var24, var33.id, var13, var14); // L: 10382
											} else if (var38 == 2) { // L: 10385
												class385.insertMenuItemNoShift("Take", class217.colorStartTag(16748608) + var37.name, 20, var33.id, var13, var14); // L: 10386
											}
										}
									}

									class385.insertMenuItemNoShift("Examine", class217.colorStartTag(16748608) + var37.name, 1004, var33.id, var13, var14); // L: 10390
								}
							}
						}
					}
				}
			}

			++var8; // L: 10254
		}
	}
}
