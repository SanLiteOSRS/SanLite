import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ck")
public class class60 {
	@ObfuscatedName("oy")
	@ObfuscatedGetter(
		intValue = 513688053
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;
	@ObfuscatedName("uo")
	@ObfuscatedGetter(
		intValue = 609489767
	)
	static int field418;
	@ObfuscatedName("ay")
	byte[] field419;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 853473633
	)
	int field421;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1262462969
	)
	int field420;

	class60() {
		this.field419 = null; // L: 4
		this.field421 = 0; // L: 5
		this.field420 = 0; // L: 6
	} // L: 8

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1738166234"
	)
	int method1141(int var1) {
		int var2 = 0; // L: 11

		int var3;
		int var4;
		for (var3 = 0; var1 >= 8 - this.field420; var1 -= var4) { // L: 12 13 20
			var4 = 8 - this.field420; // L: 14
			int var5 = (1 << var4) - 1; // L: 15
			var2 += (this.field419[this.field421] >> this.field420 & var5) << var3; // L: 16
			this.field420 = 0; // L: 17
			++this.field421; // L: 18
			var3 += var4; // L: 19
		}

		if (var1 > 0) { // L: 22
			var4 = (1 << var1) - 1; // L: 23
			var2 += (this.field419[this.field421] >> this.field420 & var4) << var3; // L: 24
			this.field420 += var1; // L: 25
		}

		return var2; // L: 27
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "126"
	)
	int method1145() {
		int var1 = this.field419[this.field421] >> this.field420 & 1; // L: 31
		++this.field420; // L: 32
		this.field421 += this.field420 >> 3; // L: 33
		this.field420 &= 7; // L: 34
		return var1; // L: 35
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([BIB)V",
		garbageValue = "0"
	)
	void method1143(byte[] var1, int var2) {
		this.field419 = var1; // L: 39
		this.field421 = var2; // L: 40
		this.field420 = 0; // L: 41
	} // L: 42

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIILij;Lir;Lix;I)Z",
		garbageValue = "1130007860"
	)
	static final boolean method1142(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4, class215 var5) {
		int var6 = var5.method4175(); // L: 355
		int var7 = var5.method4163(); // L: 356
		int[][] var8 = var5.method4191(); // L: 357
		int[][] var9 = var5.method4164(); // L: 358
		int[] var10 = var5.method4166(); // L: 359
		int[] var11 = var5.method4167(); // L: 360
		int var12 = var5.method4168(); // L: 361
		int var13 = var0; // L: 362
		int var14 = var1; // L: 363
		int var15 = var6 >> 1; // L: 364
		int var16 = var7 >> 1; // L: 365
		int var17 = var0 - var15; // L: 366
		int var18 = var1 - var16; // L: 367
		var9[var15][var16] = 99; // L: 368
		var8[var15][var16] = 0; // L: 369
		byte var19 = 0; // L: 370
		int var20 = 0; // L: 371
		var10[var19] = var0; // L: 372
		int var26 = var19 + 1; // L: 373
		var11[var19] = var1;
		int[][] var21 = var4.flags; // L: 374

		while (true) {
			label302:
			while (true) {
				int var22;
				int var23;
				int var24;
				int var25;
				do {
					do {
						do {
							label279:
							do {
								if (var26 == var20) { // L: 375
									var5.method4160(var13, var14); // L: 493
									return false; // L: 494
								}

								var13 = var10[var20]; // L: 376
								var14 = var11[var20]; // L: 377
								var20 = var20 + 1 & var12; // L: 378
								var15 = var13 - var17; // L: 379
								var16 = var14 - var18; // L: 380
								var22 = var13 - var4.xInset; // L: 381
								var23 = var14 - var4.yInset; // L: 382
								if (var3.hasArrived(var2, var13, var14, var4)) { // L: 383
									var5.method4160(var13, var14); // L: 384
									return true; // L: 385
								}

								var24 = var8[var15][var16] + 1; // L: 387
								if (var15 > 0 && var9[var15 - 1][var16] == 0 && (var21[var22 - 1][var23] & 19136782) == 0 && (var21[var22 - 1][var23 + var2 - 1] & 19136824) == 0) { // L: 388 389 390 391
									var25 = 1;

									while (true) {
										if (var25 >= var2 - 1) {
											var10[var26] = var13 - 1; // L: 395
											var11[var26] = var14; // L: 396
											var26 = var26 + 1 & var12; // L: 397
											var9[var15 - 1][var16] = 2; // L: 398
											var8[var15 - 1][var16] = var24; // L: 399
											break;
										}

										if ((var21[var22 - 1][var25 + var23] & 19136830) != 0) { // L: 393
											break;
										}

										++var25; // L: 392
									}
								}

								if (var15 < var6 - var2 && var9[var15 + 1][var16] == 0 && (var21[var22 + var2][var23] & 19136899) == 0 && (var21[var22 + var2][var23 + var2 - 1] & 19136992) == 0) { // L: 401 402 403 404
									var25 = 1;

									while (true) {
										if (var25 >= var2 - 1) {
											var10[var26] = var13 + 1; // L: 408
											var11[var26] = var14; // L: 409
											var26 = var26 + 1 & var12; // L: 410
											var9[var15 + 1][var16] = 8; // L: 411
											var8[var15 + 1][var16] = var24; // L: 412
											break;
										}

										if ((var21[var22 + var2][var23 + var25] & 19136995) != 0) { // L: 406
											break;
										}

										++var25; // L: 405
									}
								}

								if (var16 > 0 && var9[var15][var16 - 1] == 0 && (var21[var22][var23 - 1] & 19136782) == 0 && (var21[var22 + var2 - 1][var23 - 1] & 19136899) == 0) { // L: 414 415 416 417
									var25 = 1;

									while (true) {
										if (var25 >= var2 - 1) {
											var10[var26] = var13; // L: 421
											var11[var26] = var14 - 1; // L: 422
											var26 = var26 + 1 & var12; // L: 423
											var9[var15][var16 - 1] = 1; // L: 424
											var8[var15][var16 - 1] = var24; // L: 425
											break;
										}

										if ((var21[var22 + var25][var23 - 1] & 19136911) != 0) { // L: 419
											break;
										}

										++var25; // L: 418
									}
								}

								if (var16 < var7 - var2 && var9[var15][var16 + 1] == 0 && (var21[var22][var23 + var2] & 19136824) == 0 && (var21[var22 + var2 - 1][var23 + var2] & 19136992) == 0) { // L: 427 428 429 430
									var25 = 1;

									while (true) {
										if (var25 >= var2 - 1) {
											var10[var26] = var13; // L: 434
											var11[var26] = var14 + 1; // L: 435
											var26 = var26 + 1 & var12; // L: 436
											var9[var15][var16 + 1] = 4; // L: 437
											var8[var15][var16 + 1] = var24; // L: 438
											break;
										}

										if ((var21[var25 + var22][var23 + var2] & 19137016) != 0) { // L: 432
											break;
										}

										++var25; // L: 431
									}
								}

								if (var15 > 0 && var16 > 0 && var9[var15 - 1][var16 - 1] == 0 && (var21[var22 - 1][var23 - 1] & 19136782) == 0) { // L: 440 441 442
									var25 = 1;

									while (true) {
										if (var25 >= var2) {
											var10[var26] = var13 - 1; // L: 447
											var11[var26] = var14 - 1; // L: 448
											var26 = var26 + 1 & var12; // L: 449
											var9[var15 - 1][var16 - 1] = 3; // L: 450
											var8[var15 - 1][var16 - 1] = var24; // L: 451
											break;
										}

										if ((var21[var22 - 1][var25 + (var23 - 1)] & 19136830) != 0 || (var21[var25 + (var22 - 1)][var23 - 1] & 19136911) != 0) { // L: 444 445
											break;
										}

										++var25; // L: 443
									}
								}

								if (var15 < var6 - var2 && var16 > 0 && var9[var15 + 1][var16 - 1] == 0 && (var21[var22 + var2][var23 - 1] & 19136899) == 0) { // L: 453 454 455
									var25 = 1;

									while (true) {
										if (var25 >= var2) {
											var10[var26] = var13 + 1; // L: 460
											var11[var26] = var14 - 1; // L: 461
											var26 = var26 + 1 & var12; // L: 462
											var9[var15 + 1][var16 - 1] = 9; // L: 463
											var8[var15 + 1][var16 - 1] = var24; // L: 464
											break;
										}

										if ((var21[var22 + var2][var25 + (var23 - 1)] & 19136995) != 0 || (var21[var22 + var25][var23 - 1] & 19136911) != 0) { // L: 457 458
											break;
										}

										++var25; // L: 456
									}
								}

								if (var15 > 0 && var16 < var7 - var2 && var9[var15 - 1][var16 + 1] == 0 && (var21[var22 - 1][var23 + var2] & 19136824) == 0) { // L: 466 467 468
									for (var25 = 1; var25 < var2; ++var25) { // L: 469
										if ((var21[var22 - 1][var25 + var23] & 19136830) != 0 || (var21[var25 + (var22 - 1)][var23 + var2] & 19137016) != 0) { // L: 470 471
											continue label279;
										}
									}

									var10[var26] = var13 - 1; // L: 473
									var11[var26] = var14 + 1; // L: 474
									var26 = var26 + 1 & var12; // L: 475
									var9[var15 - 1][var16 + 1] = 6; // L: 476
									var8[var15 - 1][var16 + 1] = var24; // L: 477
								}
							} while(var15 >= var6 - var2); // L: 479
						} while(var16 >= var7 - var2);
					} while(var9[var15 + 1][var16 + 1] != 0); // L: 480
				} while((var21[var22 + var2][var23 + var2] & 19136992) != 0); // L: 481

				for (var25 = 1; var25 < var2; ++var25) { // L: 482
					if ((var21[var22 + var25][var23 + var2] & 19137016) != 0 || (var21[var22 + var2][var25 + var23] & 19136995) != 0) { // L: 483 484
						continue label302;
					}
				}

				var10[var26] = var13 + 1; // L: 486
				var11[var26] = var14 + 1; // L: 487
				var26 = var26 + 1 & var12; // L: 488
				var9[var15 + 1][var16 + 1] = 12; // L: 489
				var8[var15 + 1][var16 + 1] = var24; // L: 490
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZI)I",
		garbageValue = "-1736613443"
	)
	static int method1151(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) { // L: 1818
			var3 = ArchiveDiskActionHandler.getWidget(Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]); // L: 1819
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.itemId; // L: 1820
			return 1; // L: 1821
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) { // L: 1823
			var3 = ArchiveDiskActionHandler.getWidget(Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]); // L: 1824
			if (var3.itemId != -1) { // L: 1825
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 1826
			}

			return 1; // L: 1827
		} else if (var0 == ScriptOpcodes.IF_HASSUB) { // L: 1829
			int var5 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 1830
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5); // L: 1831
			if (var4 != null) { // L: 1832
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 1833
			}

			return 1; // L: 1834
		} else if (var0 == ScriptOpcodes.IF_GETTOP) { // L: 1836
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Client.rootInterface; // L: 1837
			return 1; // L: 1838
		} else if (var0 == 2707) { // L: 1840
			var3 = ArchiveDiskActionHandler.getWidget(Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]); // L: 1841
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.method6445() ? 1 : 0; // L: 1842
			return 1; // L: 1843
		} else if (var0 == 2708) { // L: 1845
			var3 = ArchiveDiskActionHandler.getWidget(Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]); // L: 1846
			return class4.method15(var3); // L: 1847
		} else if (var0 == 2709) { // L: 1849
			var3 = ArchiveDiskActionHandler.getWidget(Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]); // L: 1850
			return class33.method469(var3); // L: 1851
		} else {
			return 2; // L: 1853
		}
	}

	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "(Ltc;IB)V",
		garbageValue = "41"
	)
	static void method1146(Buffer var0, int var1) {
		byte[] var2 = var0.array; // L: 12551
		if (Client.randomDatData == null) { // L: 12553
			Client.randomDatData = new byte[24];
		}

		class397.writeRandomDat(var2, var1, Client.randomDatData, 0, 24); // L: 12554
		UserComparator3.method2873(var0, var1); // L: 12556
	} // L: 12557
}
