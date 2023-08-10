import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
public class class59 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lbu;"
	)
	VorbisFloor field452;
	@ObfuscatedName("ay")
	boolean field451;
	@ObfuscatedName("ar")
	int[] field450;
	@ObfuscatedName("am")
	int[] field453;
	@ObfuscatedName("as")
	boolean[] field454;

	@ObfuscatedSignature(
		descriptor = "(Lbu;Z[I[I[Z)V"
	)
	class59(VorbisFloor var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
		this.field452 = var1; // L: 11
		this.field451 = var2; // L: 12
		this.field450 = var3; // L: 13
		this.field453 = var4; // L: 14
		this.field454 = var5; // L: 15
	} // L: 16

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([FIS)V",
		garbageValue = "-3681"
	)
	void method1169(float[] var1, int var2) {
		int var3 = this.field452.field293.length; // L: 19
		VorbisFloor var10000 = this.field452; // L: 20
		int var4 = VorbisFloor.field294[this.field452.multiplier - 1];
		boolean[] var5 = this.field454; // L: 21
		this.field454[1] = true; // L: 22
		var5[0] = true; // L: 23

		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var6 = 2; var6 < var3; ++var6) { // L: 24
			var7 = this.field452.method768(this.field450, var6); // L: 25
			var8 = this.field452.method764(this.field450, var6); // L: 26
			var9 = this.field452.method763(this.field450[var7], this.field453[var7], this.field450[var8], this.field453[var8], this.field450[var6]); // L: 27
			var10 = this.field453[var6]; // L: 28
			int var11 = var4 - var9; // L: 29
			int var13 = (var11 < var9 ? var11 : var9) << 1; // L: 31
			if (var10 != 0) { // L: 32
				boolean[] var14 = this.field454; // L: 33
				this.field454[var8] = true; // L: 35
				var14[var7] = true; // L: 36
				this.field454[var6] = true; // L: 37
				if (var10 >= var13) { // L: 38
					this.field453[var6] = var11 > var9 ? var9 + (var10 - var9) : var11 + (var9 - var10) - 1; // L: 39
				} else {
					this.field453[var6] = (var10 & 1) != 0 ? var9 - (var10 + 1) / 2 : var10 / 2 + var9; // L: 42
				}
			} else {
				this.field454[var6] = false; // L: 46
				this.field453[var6] = var9; // L: 47
			}
		}

		this.VarbisFloor_sort(0, var3 - 1); // L: 50
		var6 = 0; // L: 51
		var7 = this.field452.multiplier * this.field453[0]; // L: 52

		for (var8 = 1; var8 < var3; ++var8) { // L: 53
			if (this.field454[var8]) { // L: 54
				var9 = this.field450[var8]; // L: 55
				var10 = this.field452.multiplier * this.field453[var8]; // L: 56
				this.field452.method766(var6, var7, var9, var10, var1, var2); // L: 57
				if (var9 >= var2) { // L: 58
					return;
				}

				var6 = var9; // L: 59
				var7 = var10; // L: 60
			}
		}

		var10000 = this.field452; // L: 63
		float var16 = VorbisFloor.VorbisFloor_decibelStatics[var7];

		for (var9 = var6; var9 < var2; ++var9) { // L: 64
			var1[var9] *= var16;
		}

	} // L: 65

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "4"
	)
	boolean method1173() {
		return this.field451; // L: 68
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-48"
	)
	@Export("VarbisFloor_sort")
	void VarbisFloor_sort(int var1, int var2) {
		if (var1 < var2) {
			int var3 = var1;
			int var4 = this.field450[var1];
			int var5 = this.field453[var1];
			boolean var6 = this.field454[var1]; // L: 76

			for (int var7 = var1 + 1; var7 <= var2; ++var7) { // L: 77
				int var8 = this.field450[var7]; // L: 78
				if (var8 < var4) { // L: 79
					this.field450[var3] = var8; // L: 80
					this.field453[var3] = this.field453[var7]; // L: 81
					this.field454[var3] = this.field454[var7]; // L: 82
					++var3; // L: 83
					this.field450[var7] = this.field450[var3]; // L: 84
					this.field453[var7] = this.field453[var3]; // L: 85
					this.field454[var7] = this.field454[var3]; // L: 86
				}
			}

			this.field450[var3] = var4; // L: 89
			this.field453[var3] = var5; // L: 90
			this.field454[var3] = var6; // L: 91
			this.VarbisFloor_sort(var1, var3 - 1); // L: 92
			this.VarbisFloor_sort(var3 + 1, var2); // L: 93
		}
	} // L: 94

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-937523976"
	)
	static void method1175(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 72
		if (var1 != null) {
			var1.remove(); // L: 74
		}
	} // L: 73 75

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-740402565"
	)
	public static void method1181() {
		Widget.Widget_cachedSprites.clear(); // L: 679
		Widget.Widget_cachedModels.clear(); // L: 680
		Widget.Widget_cachedFonts.clear(); // L: 681
		Widget.Widget_cachedSpriteMasks.clear(); // L: 682
	} // L: 683

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	static final int method1178() {
		return Client.menuOptionsCount - 1; // L: 10252
	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1812783002"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) { // L: 10256
			JagexCache.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3); // L: 10257
		}

		long var4 = -1L; // L: 10260
		long var6 = -1L; // L: 10261

		int var8;
		for (var8 = 0; var8 < class467.method8426(); ++var8) { // L: 10262
			long var26 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 10265
			if (var6 != var26) { // L: 10268
				var6 = var26; // L: 10269
				int var13 = class365.method6912(var8); // L: 10270
				int var14 = class197.method3772(ViewportMouse.ViewportMouse_entityTags[var8]); // L: 10273
				int var15 = var14; // L: 10275
				int var16 = class6.method44(ViewportMouse.ViewportMouse_entityTags[var8]); // L: 10278
				int var18 = class458.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var8]); // L: 10283
				int var19 = var18; // L: 10285
				int var23;
				if (var16 == 2 && UserComparator5.scene.getObjectFlags(class36.Client_plane, var13, var14, var26) >= 0) { // L: 10286 10287
					ObjectComposition var20 = class90.getObjectDefinition(var18); // L: 10288
					if (var20.transforms != null) { // L: 10289
						var20 = var20.transform();
					}

					if (var20 == null) { // L: 10290
						continue;
					}

					PendingSpawn var21 = null; // L: 10291

					for (PendingSpawn var22 = (PendingSpawn)Client.pendingSpawns.last(); var22 != null; var22 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 10292
						if (var22.plane == class36.Client_plane && var13 == var22.x && var15 == var22.y && var19 == var22.field1173) { // L: 10293
							var21 = var22; // L: 10294
							break;
						}
					}

					if (Client.isItemSelected == 1) { // L: 10298
						JagexCache.insertMenuItemNoShift("Use", Client.field557 + " " + "->" + " " + MusicPatchPcmStream.colorStartTag(65535) + var20.name, 1, var19, var13, var15); // L: 10299
					} else if (Client.isSpellSelected) { // L: 10302
						if ((PcmPlayer.selectedSpellFlags & 4) == 4) { // L: 10303
							JagexCache.insertMenuItemNoShift(Client.field636, Client.field734 + " " + "->" + " " + MusicPatchPcmStream.colorStartTag(65535) + var20.name, 2, var19, var13, var15); // L: 10304
						}
					} else {
						String[] var37 = var20.actions; // L: 10309
						if (var37 != null) { // L: 10310
							for (var23 = 4; var23 >= 0; --var23) { // L: 10311
								if ((var21 == null || var21.method2372(var23)) && var37[var23] != null) { // L: 10312 10313
									short var24 = 0; // L: 10314
									if (var23 == 0) { // L: 10315
										var24 = 3;
									}

									if (var23 == 1) { // L: 10316
										var24 = 4;
									}

									if (var23 == 2) { // L: 10317
										var24 = 5;
									}

									if (var23 == 3) { // L: 10318
										var24 = 6;
									}

									if (var23 == 4) { // L: 10319
										var24 = 1001;
									}

									JagexCache.insertMenuItemNoShift(var37[var23], MusicPatchPcmStream.colorStartTag(65535) + var20.name, var24, var19, var13, var15); // L: 10320
								}
							}
						}

						JagexCache.insertMenuItemNoShift("Examine", MusicPatchPcmStream.colorStartTag(65535) + var20.name, 1002, var20.id, var13, var15); // L: 10325
					}
				}

				int var30;
				Player var31;
				NPC var38;
				int[] var39;
				if (var16 == 1) { // L: 10330
					NPC var33 = Client.npcs[var19]; // L: 10331
					if (var33 == null) { // L: 10332
						continue;
					}

					if (var33.definition.size == 1 && (var33.x & 127) == 64 && (var33.y & 127) == 64) { // L: 10333
						for (var30 = 0; var30 < Client.npcCount; ++var30) { // L: 10334
							var38 = Client.npcs[Client.npcIndices[var30]]; // L: 10335
							if (var38 != null && var38 != var33 && var38.definition.size == 1 && var33.x == var38.x && var33.y == var38.y) { // L: 10336
								VarpDefinition.addNpcToMenu(var38, Client.npcIndices[var30], var13, var15);
							}
						}

						var30 = Players.Players_count; // L: 10338
						var39 = Players.Players_indices; // L: 10339

						for (var23 = 0; var23 < var30; ++var23) { // L: 10340
							var31 = Client.players[var39[var23]]; // L: 10341
							if (var31 != null && var33.x == var31.x && var33.y == var31.y) { // L: 10342
								WorldMapAreaData.addPlayerToMenu(var31, var39[var23], var13, var15);
							}
						}
					}

					VarpDefinition.addNpcToMenu(var33, var19, var13, var15); // L: 10345
				}

				if (var16 == 0) { // L: 10347
					Player var34 = Client.players[var19]; // L: 10348
					if (var34 == null) { // L: 10349
						continue;
					}

					if ((var34.x & 127) == 64 && (var34.y & 127) == 64) { // L: 10350
						for (var30 = 0; var30 < Client.npcCount; ++var30) { // L: 10351
							var38 = Client.npcs[Client.npcIndices[var30]]; // L: 10352
							if (var38 != null && var38.definition.size == 1 && var34.x == var38.x && var38.y == var34.y) { // L: 10353
								VarpDefinition.addNpcToMenu(var38, Client.npcIndices[var30], var13, var15);
							}
						}

						var30 = Players.Players_count; // L: 10355
						var39 = Players.Players_indices; // L: 10356

						for (var23 = 0; var23 < var30; ++var23) { // L: 10357
							var31 = Client.players[var39[var23]]; // L: 10358
							if (var31 != null && var31 != var34 && var34.x == var31.x && var34.y == var31.y) { // L: 10359
								WorldMapAreaData.addPlayerToMenu(var31, var39[var23], var13, var15);
							}
						}
					}

					if (var19 != Client.combatTargetPlayerIndex) { // L: 10362
						WorldMapAreaData.addPlayerToMenu(var34, var19, var13, var15);
					} else {
						var4 = var26; // L: 10363
					}
				}

				if (var16 == 3) { // L: 10365
					NodeDeque var35 = Client.groundItems[class36.Client_plane][var13][var15]; // L: 10366
					if (var35 != null) { // L: 10367
						for (TileItem var36 = (TileItem)var35.first(); var36 != null; var36 = (TileItem)var35.next()) { // L: 10368 10369 10403
							ItemComposition var40 = class125.ItemComposition_get(var36.id); // L: 10370
							if (Client.isItemSelected == 1) { // L: 10371
								JagexCache.insertMenuItemNoShift("Use", Client.field557 + " " + "->" + " " + MusicPatchPcmStream.colorStartTag(16748608) + var40.name, 16, var36.id, var13, var15); // L: 10372
							} else if (Client.isSpellSelected) { // L: 10375
								if ((PcmPlayer.selectedSpellFlags & 1) == 1) { // L: 10376
									JagexCache.insertMenuItemNoShift(Client.field636, Client.field734 + " " + "->" + " " + MusicPatchPcmStream.colorStartTag(16748608) + var40.name, 17, var36.id, var13, var15); // L: 10377
								}
							} else {
								String[] var32 = var40.groundActions; // L: 10382

								for (int var41 = 4; var41 >= 0; --var41) { // L: 10383
									if (var36.method2672(var41)) { // L: 10384
										if (var32 != null && var32[var41] != null) { // L: 10385
											byte var25 = 0; // L: 10386
											if (var41 == 0) { // L: 10387
												var25 = 18;
											}

											if (var41 == 1) { // L: 10388
												var25 = 19;
											}

											if (var41 == 2) { // L: 10389
												var25 = 20;
											}

											if (var41 == 3) { // L: 10390
												var25 = 21;
											}

											if (var41 == 4) { // L: 10391
												var25 = 22;
											}

											JagexCache.insertMenuItemNoShift(var32[var41], MusicPatchPcmStream.colorStartTag(16748608) + var40.name, var25, var36.id, var13, var15); // L: 10392
										} else if (var41 == 2) { // L: 10395
											JagexCache.insertMenuItemNoShift("Take", MusicPatchPcmStream.colorStartTag(16748608) + var40.name, 20, var36.id, var13, var15); // L: 10396
										}
									}
								}

								JagexCache.insertMenuItemNoShift("Examine", MusicPatchPcmStream.colorStartTag(16748608) + var40.name, 1004, var36.id, var13, var15); // L: 10400
							}
						}
					}
				}
			}
		}

		if (-1L != var4) { // L: 10408
			var8 = (int)(var4 >>> 0 & 127L); // L: 10411
			int var10 = class197.method3772(var4); // L: 10414
			Player var11 = Client.players[Client.combatTargetPlayerIndex]; // L: 10415
			WorldMapAreaData.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var10); // L: 10416
		}

	} // L: 10418
}
