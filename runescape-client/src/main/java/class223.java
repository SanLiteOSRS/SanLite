import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ia")
public class class223 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	static final class223 field2401;
	@ObfuscatedName("sz")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	@ObfuscatedName("aw")
	Map field2402;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 571857845
	)
	int field2400;

	static {
		field2401 = new class223(); // L: 14
	}

	class223() {
		this.field2402 = new HashMap(); // L: 12
		this.field2400 = 0; // L: 13
	} // L: 16

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILel;I)V",
		garbageValue = "-737927221"
	)
	void method4353(JSONObject var1, int var2, UrlRequester var3) {
		this.field2402.clear(); // L: 19

		JSONObject var4;
		try {
			var4 = var1;
			this.field2400 = var2;
			var1.getLong("lastfullsyncat");
			var1.getLong("lastcardupdatedat"); // L: 25
		} catch (Exception var7) { // L: 27
			return; // L: 28
		}

		try {
			this.method4345(var4.getJSONArray("crmcomponents"), this.field2400, var3); // L: 31
		} catch (Exception var6) { // L: 33
		}
	} // L: 34 36

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;ILel;I)V",
		garbageValue = "-1974650686"
	)
	void method4345(JSONArray var1, int var2, UrlRequester var3) throws JSONException {
		if (var1 != null) {
			for (int var4 = 0; var4 < var1.length(); ++var4) {
				JSONObject var5 = var1.getJSONObject(var4);
				if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) { // L: 42
					String var6 = var5.getString("platform");
					if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
						class221 var7 = new class221(); // L: 52

						try {
							var7.method4304(var5, var2, var3);
						} catch (Exception var9) { // L: 56
						}

						if (!var7.field2387.isEmpty()) {
							String var8 = var5.getString("location");
							this.field2402.put(var8, var7); // L: 59
						}
					}
				}
			}

			this.field2402 = this.method4347(); // L: 62
			SecureRandomCallable.method2320(); // L: 63
		}
	} // L: 64

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Map;",
		garbageValue = "38"
	)
	Map method4347() {
		HashMap var1 = new HashMap(); // L: 67
		ArrayList var2 = new ArrayList(); // L: 68
		var2.addAll(this.field2402.entrySet()); // L: 69
		boolean var3 = false; // L: 70

		while (!var3) { // L: 72
			var3 = true; // L: 73

			for (int var7 = 0; var7 < var2.size() - 1; ++var7) { // L: 74
				if (((class221)((Entry)var2.get(var7)).getValue()).method4336() > ((class221)((Entry)var2.get(var7 + 1)).getValue()).method4336()) { // L: 75
					Entry var4 = (Entry)var2.get(var7); // L: 76
					var2.set(var7, var2.get(var7 + 1)); // L: 77
					var2.set(var7 + 1, var4); // L: 78
					var3 = false; // L: 79
				}
			}
		}

		Iterator var5 = var2.iterator(); // L: 83

		while (var5.hasNext()) {
			Entry var6 = (Entry)var5.next(); // L: 84
			var1.put(var6.getKey(), var6.getValue()); // L: 86
		}

		return var1; // L: 89
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Lit;",
		garbageValue = "1"
	)
	class221 method4348(String var1) {
		return (class221)this.field2402.get(var1); // L: 93
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldc;",
		garbageValue = "1732993842"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = Player.method2436(var1, var0); // L: 38
		Script var4 = WorldMapAreaData.method5141(var3, var0); // L: 39
		if (var4 != null) { // L: 40
			return var4; // L: 41
		} else {
			int var5 = (-3 - var2 << 8) + var0; // L: 45
			var4 = WorldMapAreaData.method5141(var5, var0); // L: 48
			if (var4 != null) { // L: 49
				return var4; // L: 50
			} else {
				int var6 = var0 + -512; // L: 54
				var4 = WorldMapAreaData.method5141(var6, var0); // L: 57
				return var4 != null ? var4 : null; // L: 58 61
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "5"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 21
		if (var2 == null) { // L: 22
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0; // L: 23 24
		}
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "530526359"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) { // L: 10304
			UrlRequest.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3); // L: 10305
		}

		long var4 = -1L; // L: 10308
		long var6 = -1L; // L: 10309

		int var8;
		for (var8 = 0; var8 < SecureRandomFuture.method2228(); ++var8) { // L: 10310
			long var22 = FloorUnderlayDefinition.method3815(var8); // L: 10311
			if (var6 != var22) { // L: 10312
				var6 = var22; // L: 10313
				int var11 = class86.method2349(var8); // L: 10314
				int var12 = class367.method7009(var8); // L: 10315
				int var13 = WorldMapDecoration.method5032(var8); // L: 10316
				int var14 = Message.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var8]); // L: 10319
				int var15 = var14; // L: 10321
				int var19;
				if (var13 == 2 && Actor.scene.getObjectFlags(class473.Client_plane, var11, var12, var22) >= 0) { // L: 10322 10323
					ObjectComposition var16 = class127.getObjectDefinition(var14); // L: 10324
					if (var16.transforms != null) { // L: 10325
						var16 = var16.transform();
					}

					if (var16 == null) { // L: 10326
						continue;
					}

					PendingSpawn var17 = null; // L: 10327

					for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 10328
						if (var18.plane == class473.Client_plane && var11 == var18.x && var12 == var18.y && var15 == var18.field1198) { // L: 10329
							var17 = var18; // L: 10330
							break;
						}
					}

					if (Client.isItemSelected == 1) { // L: 10334
						UrlRequest.insertMenuItemNoShift("Use", Client.field822 + " " + "->" + " " + class370.colorStartTag(65535) + var16.name, 1, var15, var11, var12); // L: 10335
					} else if (Client.isSpellSelected) { // L: 10338
						if ((class128.field1520 & 4) == 4) { // L: 10339
							UrlRequest.insertMenuItemNoShift(Client.field696, Client.field574 + " " + "->" + " " + class370.colorStartTag(65535) + var16.name, 2, var15, var11, var12); // L: 10340
						}
					} else {
						String[] var31 = var16.actions; // L: 10345
						if (var31 != null) { // L: 10346
							for (var19 = 4; var19 >= 0; --var19) { // L: 10347
								if ((var17 == null || var17.method2460(var19)) && var31[var19] != null) { // L: 10348 10349
									short var20 = 0; // L: 10350
									if (var19 == 0) { // L: 10351
										var20 = 3;
									}

									if (var19 == 1) { // L: 10352
										var20 = 4;
									}

									if (var19 == 2) { // L: 10353
										var20 = 5;
									}

									if (var19 == 3) { // L: 10354
										var20 = 6;
									}

									if (var19 == 4) { // L: 10355
										var20 = 1001;
									}

									UrlRequest.insertMenuItemNoShift(var31[var19], class370.colorStartTag(65535) + var16.name, var20, var15, var11, var12); // L: 10356
								}
							}
						}

						UrlRequest.insertMenuItemNoShift("Examine", class370.colorStartTag(65535) + var16.name, 1002, var16.id, var11, var12); // L: 10361
					}
				}

				int var24;
				Player var25;
				NPC var32;
				int[] var33;
				if (var13 == 1) { // L: 10366
					NPC var27 = Client.npcs[var15]; // L: 10367
					if (var27 == null) { // L: 10368
						continue;
					}

					if (var27.definition.size == 1 && (var27.x & 127) == 64 && (var27.y & 127) == 64) { // L: 10369
						for (var24 = 0; var24 < Client.npcCount; ++var24) { // L: 10370
							var32 = Client.npcs[Client.npcIndices[var24]]; // L: 10371
							if (var32 != null && var32 != var27 && var32.definition.size == 1 && var32.x == var27.x && var27.y == var32.y) { // L: 10372
								Skeleton.addNpcToMenu(var32, Client.npcIndices[var24], var11, var12);
							}
						}

						var24 = Players.Players_count; // L: 10374
						var33 = Players.Players_indices; // L: 10375

						for (var19 = 0; var19 < var24; ++var19) { // L: 10376
							var25 = Client.players[var33[var19]]; // L: 10377
							if (var25 != null && var25.x == var27.x && var25.y == var27.y) { // L: 10378
								MilliClock.addPlayerToMenu(var25, var33[var19], var11, var12);
							}
						}
					}

					Skeleton.addNpcToMenu(var27, var15, var11, var12); // L: 10381
				}

				if (var13 == 0) { // L: 10383
					Player var28 = Client.players[var15]; // L: 10384
					if (var28 == null) { // L: 10385
						continue;
					}

					if ((var28.x & 127) == 64 && (var28.y & 127) == 64) { // L: 10386
						for (var24 = 0; var24 < Client.npcCount; ++var24) { // L: 10387
							var32 = Client.npcs[Client.npcIndices[var24]]; // L: 10388
							if (var32 != null && var32.definition.size == 1 && var32.x == var28.x && var28.y == var32.y) { // L: 10389
								Skeleton.addNpcToMenu(var32, Client.npcIndices[var24], var11, var12);
							}
						}

						var24 = Players.Players_count; // L: 10391
						var33 = Players.Players_indices; // L: 10392

						for (var19 = 0; var19 < var24; ++var19) { // L: 10393
							var25 = Client.players[var33[var19]]; // L: 10394
							if (var25 != null && var28 != var25 && var28.x == var25.x && var28.y == var25.y) { // L: 10395
								MilliClock.addPlayerToMenu(var25, var33[var19], var11, var12);
							}
						}
					}

					if (var15 != Client.combatTargetPlayerIndex) { // L: 10398
						MilliClock.addPlayerToMenu(var28, var15, var11, var12);
					} else {
						var4 = var22; // L: 10399
					}
				}

				if (var13 == 3) { // L: 10401
					NodeDeque var29 = Client.groundItems[class473.Client_plane][var11][var12]; // L: 10402
					if (var29 != null) { // L: 10403
						for (TileItem var30 = (TileItem)var29.first(); var30 != null; var30 = (TileItem)var29.next()) { // L: 10404 10405 10439
							ItemComposition var34 = ArchiveDiskActionHandler.ItemComposition_get(var30.id); // L: 10406
							if (Client.isItemSelected == 1) { // L: 10407
								UrlRequest.insertMenuItemNoShift("Use", Client.field822 + " " + "->" + " " + class370.colorStartTag(16748608) + var34.name, 16, var30.id, var11, var12); // L: 10408
							} else if (Client.isSpellSelected) { // L: 10411
								if ((class128.field1520 & 1) == 1) { // L: 10412
									UrlRequest.insertMenuItemNoShift(Client.field696, Client.field574 + " " + "->" + " " + class370.colorStartTag(16748608) + var34.name, 17, var30.id, var11, var12); // L: 10413
								}
							} else {
								String[] var26 = var34.groundActions; // L: 10418

								for (int var35 = 4; var35 >= 0; --var35) { // L: 10419
									if (var30.method2760(var35)) { // L: 10420
										if (var26 != null && var26[var35] != null) { // L: 10421
											byte var21 = 0; // L: 10422
											if (var35 == 0) { // L: 10423
												var21 = 18;
											}

											if (var35 == 1) { // L: 10424
												var21 = 19;
											}

											if (var35 == 2) { // L: 10425
												var21 = 20;
											}

											if (var35 == 3) { // L: 10426
												var21 = 21;
											}

											if (var35 == 4) { // L: 10427
												var21 = 22;
											}

											UrlRequest.insertMenuItemNoShift(var26[var35], class370.colorStartTag(16748608) + var34.name, var21, var30.id, var11, var12); // L: 10428
										} else if (var35 == 2) { // L: 10431
											UrlRequest.insertMenuItemNoShift("Take", class370.colorStartTag(16748608) + var34.name, 20, var30.id, var11, var12); // L: 10432
										}
									}
								}

								UrlRequest.insertMenuItemNoShift("Examine", class370.colorStartTag(16748608) + var34.name, 1004, var30.id, var11, var12); // L: 10436
							}
						}
					}
				}
			}
		}

		if (-1L != var4) { // L: 10444
			var8 = GrandExchangeOfferAgeComparator.method7271(var4); // L: 10445
			int var9 = SoundSystem.method809(var4); // L: 10446
			Player var10 = Client.players[Client.combatTargetPlayerIndex]; // L: 10447
			MilliClock.addPlayerToMenu(var10, Client.combatTargetPlayerIndex, var8, var9); // L: 10448
		}

	} // L: 10450
}
