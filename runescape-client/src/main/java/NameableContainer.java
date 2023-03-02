import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ob")
@Implements("NameableContainer")
public abstract class NameableContainer {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -963964871
	)
	@Export("capacity")
	final int capacity;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1154172457
	)
	@Export("size")
	int size;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Low;"
	)
	@Export("array")
	Nameable[] array;
	@ObfuscatedName("r")
	@Export("usernamesMap")
	HashMap usernamesMap;
	@ObfuscatedName("b")
	@Export("previousUsernamesMap")
	HashMap previousUsernamesMap;
	@ObfuscatedName("m")
	@Export("comparator")
	Comparator comparator;

	NameableContainer(int var1) {
		this.size = 0; // L: 10
		this.comparator = null; // L: 14
		this.capacity = var1; // L: 17
		this.array = this.newTypedArray(var1); // L: 18
		this.usernamesMap = new HashMap(var1 / 8); // L: 19
		this.previousUsernamesMap = new HashMap(var1 / 8); // L: 20
	} // L: 21

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Low;",
		garbageValue = "-2146736820"
	)
	@Export("newInstance")
	abstract Nameable newInstance();

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)[Low;",
		garbageValue = "1411048209"
	)
	@Export("newTypedArray")
	abstract Nameable[] newTypedArray(int var1);

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "770946348"
	)
	@Export("clear")
	public void clear() {
		this.size = 0; // L: 24
		Arrays.fill(this.array, (Object)null); // L: 25
		this.usernamesMap.clear(); // L: 26
		this.previousUsernamesMap.clear(); // L: 27
	} // L: 28

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2047510064"
	)
	@Export("getSize")
	public int getSize() {
		return this.size; // L: 31
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1405724718"
	)
	@Export("isFull")
	public boolean isFull() {
		return this.size == this.capacity; // L: 35
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lsi;S)Z",
		garbageValue = "180"
	)
	@Export("contains")
	public boolean contains(Username var1) {
		if (!var1.hasCleanName()) { // L: 39
			return false;
		} else {
			return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1); // L: 40 41
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lsi;B)Low;",
		garbageValue = "-87"
	)
	@Export("getByUsername")
	public Nameable getByUsername(Username var1) {
		Nameable var2 = this.getByCurrentUsername(var1); // L: 45
		return var2 != null ? var2 : this.getByPreviousUsername(var1); // L: 46 47
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lsi;B)Low;",
		garbageValue = "26"
	)
	@Export("getByCurrentUsername")
	Nameable getByCurrentUsername(Username var1) {
		return !var1.hasCleanName() ? null : (Nameable)this.usernamesMap.get(var1); // L: 51 52
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsi;I)Low;",
		garbageValue = "1658076204"
	)
	@Export("getByPreviousUsername")
	Nameable getByPreviousUsername(Username var1) {
		return !var1.hasCleanName() ? null : (Nameable)this.previousUsernamesMap.get(var1); // L: 56 57
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lsi;I)Z",
		garbageValue = "589374822"
	)
	@Export("removeByUsername")
	public final boolean removeByUsername(Username var1) {
		Nameable var2 = this.getByCurrentUsername(var1); // L: 61
		if (var2 == null) { // L: 62
			return false;
		} else {
			this.remove(var2); // L: 63
			return true; // L: 64
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Low;I)V",
		garbageValue = "-839294896"
	)
	@Export("remove")
	final void remove(Nameable var1) {
		int var2 = this.indexOf(var1); // L: 68
		if (var2 != -1) { // L: 69
			this.arrayRemove(var2); // L: 70
			this.mapRemove(var1); // L: 71
		}
	} // L: 72

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lsi;B)Low;",
		garbageValue = "-75"
	)
	@Export("addLastNoPreviousUsername")
	Nameable addLastNoPreviousUsername(Username var1) {
		return this.addLast(var1, (Username)null); // L: 75
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lsi;Lsi;I)Low;",
		garbageValue = "-1772827399"
	)
	@Export("addLast")
	Nameable addLast(Username var1, Username var2) {
		if (this.getByCurrentUsername(var1) != null) { // L: 79
			throw new IllegalStateException();
		} else {
			Nameable var3 = this.newInstance(); // L: 80
			var3.set(var1, var2); // L: 81
			this.arrayAddLast(var3); // L: 82
			this.mapPut(var3); // L: 83
			return var3; // L: 84
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Low;",
		garbageValue = "-1751472166"
	)
	@Export("get")
	public final Nameable get(int var1) {
		if (var1 >= 0 && var1 < this.size) { // L: 88
			return this.array[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1); // L: 89
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1605517414"
	)
	@Export("sort")
	public final void sort() {
		if (this.comparator == null) { // L: 93
			Arrays.sort(this.array, 0, this.size); // L: 94
		} else {
			Arrays.sort(this.array, 0, this.size, this.comparator); // L: 97
		}

	} // L: 99

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Low;Lsi;Lsi;I)V",
		garbageValue = "38165693"
	)
	@Export("changeName")
	final void changeName(Nameable var1, Username var2, Username var3) {
		this.mapRemove(var1); // L: 102
		var1.set(var2, var3); // L: 103
		this.mapPut(var1); // L: 104
	} // L: 105

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Low;I)I",
		garbageValue = "-551306172"
	)
	@Export("indexOf")
	final int indexOf(Nameable var1) {
		for (int var2 = 0; var2 < this.size; ++var2) { // L: 108
			if (this.array[var2] == var1) { // L: 109
				return var2;
			}
		}

		return -1; // L: 111
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Low;I)V",
		garbageValue = "1328104098"
	)
	@Export("mapRemove")
	final void mapRemove(Nameable var1) {
		if (this.usernamesMap.remove(var1.username) == null) { // L: 115
			throw new IllegalStateException();
		} else {
			if (var1.previousUsername != null) {
				this.previousUsernamesMap.remove(var1.previousUsername); // L: 116
			}

		}
	} // L: 117

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Low;I)V",
		garbageValue = "1247991301"
	)
	@Export("arrayAddLast")
	final void arrayAddLast(Nameable var1) {
		this.array[++this.size - 1] = var1; // L: 120
	} // L: 121

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Low;B)V",
		garbageValue = "90"
	)
	@Export("mapPut")
	final void mapPut(Nameable var1) {
		this.usernamesMap.put(var1.username, var1); // L: 124
		if (var1.previousUsername != null) { // L: 125
			Nameable var2 = (Nameable)this.previousUsernamesMap.put(var1.previousUsername, var1); // L: 126
			if (var2 != null && var2 != var1) { // L: 127
				var2.previousUsername = null; // L: 128
			}
		}

	} // L: 131

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	@Export("arrayRemove")
	final void arrayRemove(int var1) {
		--this.size; // L: 134
		if (var1 < this.size) { // L: 135
			System.arraycopy(this.array, var1 + 1, this.array, var1, this.size - var1); // L: 136
		}

	} // L: 138

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2033158716"
	)
	@Export("removeComparator")
	public final void removeComparator() {
		this.comparator = null; // L: 144
	} // L: 145

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;I)V",
		garbageValue = "1499141929"
	)
	@Export("addComparator")
	public final void addComparator(Comparator var1) {
		if (this.comparator == null) { // L: 148
			this.comparator = var1; // L: 149
		} else if (this.comparator instanceof AbstractUserComparator) { // L: 151
			((AbstractUserComparator)this.comparator).addComparator(var1); // L: 152
		}

	} // L: 154

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILhn;Lgv;I)V",
		garbageValue = "-2041787633"
	)
	@Export("addObjects")
	static final void addObjects(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) { // L: 350 351 352
			if (var0 < Tiles.Tiles_minPlane) { // L: 355
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = class463.getObjectDefinition(var3); // L: 356
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) { // L: 359
				var9 = var8.sizeX; // L: 364
				var10 = var8.sizeY; // L: 365
			} else {
				var9 = var8.sizeY; // L: 360
				var10 = var8.sizeX; // L: 361
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) { // L: 371
				var11 = (var9 >> 1) + var1; // L: 372
				var12 = (var9 + 1 >> 1) + var1; // L: 373
			} else {
				var11 = var1; // L: 376
				var12 = var1 + 1; // L: 377
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) { // L: 379
				var13 = (var10 >> 1) + var2; // L: 380
				var14 = var2 + (var10 + 1 >> 1); // L: 381
			} else {
				var13 = var2; // L: 384
				var14 = var2 + 1; // L: 385
			}

			int[][] var15 = Tiles.Tiles_heights[var0]; // L: 387
			int var16 = var15[var12][var13] + var15[var11][var13] + var15[var11][var14] + var15[var12][var14] >> 2; // L: 388
			int var17 = (var1 << 7) + (var9 << 6); // L: 389
			int var18 = (var2 << 7) + (var10 << 6); // L: 390
			long var19 = ItemLayer.calculateTag(var1, var2, 2, var8.int1 == 0, var3); // L: 391
			int var21 = var5 + (var4 << 6); // L: 392
			if (var8.int3 == 1) { // L: 393
				var21 += 256;
			}

			int var23;
			int var24;
			if (var8.hasSound()) { // L: 394
				ObjectSound var22 = new ObjectSound(); // L: 395
				var22.plane = var0; // L: 396
				var22.x = var1 * 128; // L: 397
				var22.y = var2 * 128; // L: 398
				var23 = var8.sizeX; // L: 399
				var24 = var8.sizeY; // L: 400
				if (var4 == 1 || var4 == 3) { // L: 401
					var23 = var8.sizeY; // L: 402
					var24 = var8.sizeX; // L: 403
				}

				var22.maxX = (var23 + var1) * 16384; // L: 405
				var22.maxY = (var24 + var2) * 128; // L: 406
				var22.soundEffectId = var8.ambientSoundId; // L: 407
				var22.field837 = var8.int7 * 128; // L: 408
				var22.field845 = var8.int5; // L: 409
				var22.field841 = var8.int6; // L: 410
				var22.soundEffectIds = var8.soundEffectIds; // L: 411
				if (var8.transforms != null) { // L: 412
					var22.obj = var8; // L: 413
					var22.set(); // L: 414
				}

				ObjectSound.objectSounds.addFirst(var22); // L: 416
				if (var22.soundEffectIds != null) { // L: 417
					var22.field843 = var22.field845 + (int)(Math.random() * (double)(var22.field841 - var22.field845));
				}
			}

			Object var34;
			if (var5 == 22) { // L: 419
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) { // L: 420
					if (var8.animationId == -1 && var8.transforms == null) { // L: 422
						var34 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 423
					}

					var6.newGroundObject(var0, var1, var2, var16, (Renderable)var34, var19, var21); // L: 424
					if (var8.interactType == 1 && var7 != null) { // L: 425
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else if (var5 != 10 && var5 != 11) { // L: 428
				int[] var10000;
				if (var5 >= 12) { // L: 449
					if (var8.animationId == -1 && var8.transforms == null) { // L: 451
						var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 452
					}

					var6.method4466(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21); // L: 453
					if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) { // L: 454
						var10000 = class312.field3717[var0][var1];
						var10000[var2] |= 2340;
					}

					if (var8.interactType != 0 && var7 != null) { // L: 455
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				} else if (var5 == 0) { // L: 458
					if (var8.animationId == -1 && var8.transforms == null) { // L: 460
						var34 = var8.getEntity(0, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 461
					}

					var6.newWallObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field1015[var4], 0, var19, var21); // L: 462
					if (var4 == 0) { // L: 463
						if (var8.clipped) { // L: 464
							Tiles.field1013[var0][var1][var2] = 50; // L: 465
							Tiles.field1013[var0][var1][var2 + 1] = 50; // L: 466
						}

						if (var8.modelClipped) { // L: 468
							var10000 = class312.field3717[var0][var1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 1) { // L: 470
						if (var8.clipped) { // L: 471
							Tiles.field1013[var0][var1][var2 + 1] = 50; // L: 472
							Tiles.field1013[var0][var1 + 1][var2 + 1] = 50; // L: 473
						}

						if (var8.modelClipped) { // L: 475
							var10000 = class312.field3717[var0][var1];
							var10000[1 + var2] |= 1170;
						}
					} else if (var4 == 2) { // L: 477
						if (var8.clipped) { // L: 478
							Tiles.field1013[var0][var1 + 1][var2] = 50; // L: 479
							Tiles.field1013[var0][var1 + 1][var2 + 1] = 50; // L: 480
						}

						if (var8.modelClipped) { // L: 482
							var10000 = class312.field3717[var0][var1 + 1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 3) { // L: 484
						if (var8.clipped) { // L: 485
							Tiles.field1013[var0][var1][var2] = 50; // L: 486
							Tiles.field1013[var0][var1 + 1][var2] = 50; // L: 487
						}

						if (var8.modelClipped) { // L: 489
							var10000 = class312.field3717[var0][var1];
							var10000[var2] |= 1170;
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 491
						var7.method4184(var1, var2, var5, var4, var8.boolean1);
					}

					if (var8.int2 != 16) { // L: 492
						var6.method4583(var0, var1, var2, var8.int2);
					}

				} else if (var5 == 1) { // L: 495
					if (var8.animationId == -1 && var8.transforms == null) { // L: 497
						var34 = var8.getEntity(1, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 498
					}

					var6.newWallObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field1016[var4], 0, var19, var21); // L: 499
					if (var8.clipped) { // L: 500
						if (var4 == 0) { // L: 501
							Tiles.field1013[var0][var1][var2 + 1] = 50;
						} else if (var4 == 1) { // L: 502
							Tiles.field1013[var0][var1 + 1][var2 + 1] = 50;
						} else if (var4 == 2) { // L: 503
							Tiles.field1013[var0][var1 + 1][var2] = 50;
						} else if (var4 == 3) { // L: 504
							Tiles.field1013[var0][var1][var2] = 50;
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 506
						var7.method4184(var1, var2, var5, var4, var8.boolean1);
					}

				} else {
					int var28;
					if (var5 == 2) { // L: 509
						var28 = var4 + 1 & 3; // L: 510
						Object var31;
						Object var32;
						if (var8.animationId == -1 && var8.transforms == null) { // L: 513
							var31 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18); // L: 514
							var32 = var8.getEntity(2, var28, var15, var17, var16, var18); // L: 515
						} else {
							var31 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 518
							var32 = new DynamicObject(var3, 2, var28, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 519
						}

						var6.newWallObject(var0, var1, var2, var16, (Renderable)var31, (Renderable)var32, Tiles.field1015[var4], Tiles.field1015[var28], var19, var21); // L: 521
						if (var8.modelClipped) { // L: 522
							if (var4 == 0) { // L: 523
								var10000 = class312.field3717[var0][var1]; // L: 524
								var10000[var2] |= 585;
								var10000 = class312.field3717[var0][var1]; // L: 525
								var10000[1 + var2] |= 1170;
							} else if (var4 == 1) { // L: 527
								var10000 = class312.field3717[var0][var1]; // L: 528
								var10000[1 + var2] |= 1170;
								var10000 = class312.field3717[var0][var1 + 1]; // L: 529
								var10000[var2] |= 585;
							} else if (var4 == 2) { // L: 531
								var10000 = class312.field3717[var0][var1 + 1]; // L: 532
								var10000[var2] |= 585;
								var10000 = class312.field3717[var0][var1]; // L: 533
								var10000[var2] |= 1170;
							} else if (var4 == 3) { // L: 535
								var10000 = class312.field3717[var0][var1]; // L: 536
								var10000[var2] |= 1170;
								var10000 = class312.field3717[var0][var1]; // L: 537
								var10000[var2] |= 585;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 540
							var7.method4184(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 541
							var6.method4583(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 3) { // L: 544
						if (var8.animationId == -1 && var8.transforms == null) { // L: 546
							var34 = var8.getEntity(3, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 547
						}

						var6.newWallObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field1016[var4], 0, var19, var21); // L: 548
						if (var8.clipped) { // L: 549
							if (var4 == 0) { // L: 550
								Tiles.field1013[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) { // L: 551
								Tiles.field1013[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) { // L: 552
								Tiles.field1013[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) { // L: 553
								Tiles.field1013[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 555
							var7.method4184(var1, var2, var5, var4, var8.boolean1);
						}

					} else if (var5 == 9) { // L: 558
						if (var8.animationId == -1 && var8.transforms == null) { // L: 560
							var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 561
						}

						var6.method4466(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21); // L: 562
						if (var8.interactType != 0 && var7 != null) { // L: 563
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 564
							var6.method4583(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 4) { // L: 567
						if (var8.animationId == -1 && var8.transforms == null) { // L: 569
							var34 = var8.getEntity(4, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 570
						}

						var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field1015[var4], 0, 0, 0, var19, var21); // L: 571
					} else {
						Object var25;
						long var29;
						if (var5 == 5) { // L: 574
							var28 = 16; // L: 575
							var29 = var6.getWallObjectTag(var0, var1, var2); // L: 576
							if (var29 != 0L) { // L: 577
								var28 = class463.getObjectDefinition(class124.Entity_unpackID(var29)).int2;
							}

							if (var8.animationId == -1 && var8.transforms == null) { // L: 579
								var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 580
							}

							var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field1015[var4], 0, var28 * Tiles.field1017[var4], var28 * Tiles.field1007[var4], var19, var21); // L: 581
						} else if (var5 == 6) { // L: 584
							var28 = 8; // L: 585
							var29 = var6.getWallObjectTag(var0, var1, var2); // L: 586
							if (0L != var29) { // L: 587
								var28 = class463.getObjectDefinition(class124.Entity_unpackID(var29)).int2 / 2;
							}

							if (var8.animationId == -1 && var8.transforms == null) { // L: 589
								var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
							} else {
								var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 590
							}

							var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var28 * Tiles.field1019[var4], var28 * Tiles.field1020[var4], var19, var21); // L: 591
						} else if (var5 == 7) { // L: 594
							var23 = var4 + 2 & 3; // L: 596
							if (var8.animationId == -1 && var8.transforms == null) { // L: 597
								var34 = var8.getEntity(4, var23 + 4, var15, var17, var16, var18);
							} else {
								var34 = new DynamicObject(var3, 4, var23 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 598
							}

							var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, 256, var23, 0, 0, var19, var21); // L: 599
						} else if (var5 == 8) { // L: 602
							var28 = 8; // L: 603
							var29 = var6.getWallObjectTag(var0, var1, var2); // L: 604
							if (var29 != 0L) { // L: 605
								var28 = class463.getObjectDefinition(class124.Entity_unpackID(var29)).int2 / 2;
							}

							int var27 = var4 + 2 & 3; // L: 608
							Object var26;
							if (var8.animationId == -1 && var8.transforms == null) { // L: 609
								var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18); // L: 610
								var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18); // L: 611
							} else {
								var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 614
								var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 615
							}

							var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var28 * Tiles.field1019[var4], var28 * Tiles.field1020[var4], var19, var21); // L: 617
						}
					}
				}
			} else {
				if (var8.animationId == -1 && var8.transforms == null) { // L: 430
					var34 = var8.getEntity(10, var4, var15, var17, var16, var18);
				} else {
					var34 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 431
				}

				if (var34 != null && var6.method4466(var0, var1, var2, var16, var9, var10, (Renderable)var34, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) { // L: 432 433
					var23 = 15; // L: 434
					if (var34 instanceof Model) { // L: 435
						var23 = ((Model)var34).method4690() / 4; // L: 436
						if (var23 > 30) { // L: 437
							var23 = 30;
						}
					}

					for (var24 = 0; var24 <= var9; ++var24) { // L: 439
						for (int var33 = 0; var33 <= var10; ++var33) { // L: 440
							if (var23 > Tiles.field1013[var0][var24 + var1][var33 + var2]) { // L: 441
								Tiles.field1013[var0][var24 + var1][var33 + var2] = (byte)var23;
							}
						}
					}
				}

				if (var8.interactType != 0 && var7 != null) { // L: 446
					var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
				}

			}
		}
	} // L: 426 447 456 493 507 542 556 565 572 582 592 600 618 620
}
