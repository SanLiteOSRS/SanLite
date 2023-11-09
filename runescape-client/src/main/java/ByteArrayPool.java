import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("pv")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1296808291
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -664251455
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -412578041
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 406675343
	)
	static int field4479;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1644263995
	)
	static int field4483;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -436632225
	)
	static int field4484;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -653047613
	)
	static int field4485;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1312298357
	)
	static int field4486;
	@ObfuscatedName("aj")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("ad")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("ac")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("ag")
	static byte[][] field4494;
	@ObfuscatedName("au")
	static ArrayList field4491;
	@ObfuscatedName("ko")
	@ObfuscatedGetter(
		intValue = -2063059311
	)
	@Export("cameraZ")
	static int cameraZ;

	static {
		ByteArrayPool_smallCount = 0; // L: 13
		ByteArrayPool_mediumCount = 0; // L: 14
		ByteArrayPool_largeCount = 0; // L: 15
		field4479 = 0; // L: 16
		field4483 = 1000; // L: 17
		field4484 = 250; // L: 18
		field4485 = 100; // L: 19
		field4486 = 50; // L: 20
		ByteArrayPool_small = new byte[1000][]; // L: 21
		ByteArrayPool_medium = new byte[250][]; // L: 22
		ByteArrayPool_large = new byte[100][]; // L: 23
		field4494 = new byte[50][]; // L: 24
		field4491 = new ArrayList(); // L: 28
		field4491.clear(); // L: 32
		field4491.add(100); // L: 33
		field4491.add(5000); // L: 34
		field4491.add(10000); // L: 35
		field4491.add(30000); // L: 36
		new HashMap();
	} // L: 42

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IZI)[B",
		garbageValue = "968818845"
	)
	@Export("ByteArrayPool_getArrayBool")
	public static synchronized byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		byte[] var4;
		if ((var0 == 100 || var0 < 100 && var1) && ByteArrayPool_smallCount > 0) { // L: 74
			var4 = ByteArrayPool_small[--ByteArrayPool_smallCount]; // L: 75
			ByteArrayPool_small[ByteArrayPool_smallCount] = null; // L: 76
			return var4; // L: 77
		} else if ((var0 == 5000 || var0 < 5000 && var1) && ByteArrayPool_mediumCount > 0) { // L: 79
			var4 = ByteArrayPool_medium[--ByteArrayPool_mediumCount]; // L: 80
			ByteArrayPool_medium[ByteArrayPool_mediumCount] = null; // L: 81
			return var4; // L: 82
		} else if ((var0 == 10000 || var0 < 10000 && var1) && ByteArrayPool_largeCount > 0) { // L: 84
			var4 = ByteArrayPool_large[--ByteArrayPool_largeCount]; // L: 85
			ByteArrayPool_large[ByteArrayPool_largeCount] = null; // L: 86
			return var4; // L: 87
		} else if ((var0 == 30000 || var0 < 30000 && var1) && field4479 > 0) { // L: 89
			var4 = field4494[--field4479]; // L: 90
			field4494[field4479] = null; // L: 91
			return var4; // L: 92
		} else {
			int var2;
			if (JagexCache.ByteArrayPool_arrays != null) { // L: 94
				for (var2 = 0; var2 < class152.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 95
					if ((class152.ByteArrayPool_alternativeSizes[var2] == var0 || var0 < class152.ByteArrayPool_alternativeSizes[var2] && var1) && PendingSpawn.ByteArrayPool_altSizeArrayCounts[var2] > 0) { // L: 96
						byte[] var3 = JagexCache.ByteArrayPool_arrays[var2][--PendingSpawn.ByteArrayPool_altSizeArrayCounts[var2]]; // L: 97
						JagexCache.ByteArrayPool_arrays[var2][PendingSpawn.ByteArrayPool_altSizeArrayCounts[var2]] = null; // L: 98
						return var3; // L: 99
					}
				}
			}

			if (var1 && class152.ByteArrayPool_alternativeSizes != null) { // L: 103 104
				for (var2 = 0; var2 < class152.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 105
					if (var0 <= class152.ByteArrayPool_alternativeSizes[var2] && PendingSpawn.ByteArrayPool_altSizeArrayCounts[var2] < JagexCache.ByteArrayPool_arrays[var2].length) { // L: 106
						return new byte[class152.ByteArrayPool_alternativeSizes[var2]]; // L: 107
					}
				}
			}

			return new byte[var0]; // L: 112
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "548182647"
	)
	static int method7598(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class53.scriptDotWidget : Interpreter.field864; // L: 1355
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) { // L: 1356
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1357
			return 1; // L: 1358
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) { // L: 1360
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1361
			return 1; // L: 1362
		} else {
			class327 var7;
			if (var0 == ScriptOpcodes.CC_GETTEXT) { // L: 1364
				if (var3.type == 12) { // L: 1365
					var7 = var3.method6380(); // L: 1366
					if (var7 != null) { // L: 1367
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var7.method6163().method7267(); // L: 1368
						return 1; // L: 1369
					}
				}

				Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3.text; // L: 1372
				return 1; // L: 1373
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) { // L: 1375
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1376
				return 1; // L: 1377
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) { // L: 1379
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1380
				return 1; // L: 1381
			} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) { // L: 1383
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1384
				return 1; // L: 1385
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) { // L: 1387
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1388
				return 1; // L: 1389
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) { // L: 1391
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1392
				return 1; // L: 1393
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) { // L: 1395
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1396
				return 1; // L: 1397
			} else if (var0 == ScriptOpcodes.CC_GETTRANS) { // L: 1399
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1400
				return 1; // L: 1401
			} else if (var0 == 1610) { // L: 1403
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1404
				return 1; // L: 1405
			} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) { // L: 1407
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color; // L: 1408
				return 1; // L: 1409
			} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) { // L: 1411
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color2; // L: 1412
				return 1; // L: 1413
			} else if (var0 == 1613) { // L: 1415
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1416
				return 1; // L: 1417
			} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) { // L: 1419
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1420
				return 1; // L: 1421
			} else {
				class322 var4;
				if (var0 == 1617) { // L: 1423
					var4 = var3.method6381(); // L: 1424
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3522 : 0; // L: 1425
				}

				if (var0 == 1618) { // L: 1427
					var4 = var3.method6381(); // L: 1428
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3519 : 0; // L: 1429
					return 1; // L: 1430
				} else if (var0 == 1619) { // L: 1432
					var7 = var3.method6380(); // L: 1433
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6105().method7267() : ""; // L: 1434
					return 1; // L: 1435
				} else if (var0 == 1620) { // L: 1437
					var4 = var3.method6381(); // L: 1438
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3520 : 0; // L: 1439
					return 1; // L: 1440
				} else if (var0 == 1621) { // L: 1442
					var7 = var3.method6380(); // L: 1443
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6115() : 0; // L: 1444
					return 1; // L: 1445
				} else if (var0 == 1622) { // L: 1447
					var7 = var3.method6380(); // L: 1448
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6170() : 0; // L: 1449
					return 1; // L: 1450
				} else if (var0 == 1623) { // L: 1452
					var7 = var3.method6380(); // L: 1453
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6117() : 0; // L: 1454
					return 1; // L: 1455
				} else if (var0 == 1624) { // L: 1457
					var7 = var3.method6380(); // L: 1458
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method6107() ? 1 : 0; // L: 1459
					return 1; // L: 1460
				} else if (var0 != 1625) { // L: 1462
					if (var0 == 1626) { // L: 1467
						var7 = var3.method6380(); // L: 1468
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6106().method7529() : ""; // L: 1469
						return 1; // L: 1470
					} else if (var0 == 1627) { // L: 1472
						var7 = var3.method6380(); // L: 1473
						int var5 = var7 != null ? var7.method6232() : 0; // L: 1474
						int var6 = var7 != null ? var7.method6239() : 0; // L: 1475
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.min(var5, var6); // L: 1476
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.max(var5, var6); // L: 1477
						return 1; // L: 1478
					} else if (var0 == 1628) { // L: 1480
						var7 = var3.method6380(); // L: 1481
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6239() : 0; // L: 1482
						return 1; // L: 1483
					} else if (var0 == 1629) { // L: 1485
						var7 = var3.method6380(); // L: 1486
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6229() : 0; // L: 1487
						return 1; // L: 1488
					} else if (var0 == 1630) { // L: 1490
						var7 = var3.method6380(); // L: 1491
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6118() : 0; // L: 1492
						return 1; // L: 1493
					} else if (var0 == 1631) { // L: 1495
						var7 = var3.method6380(); // L: 1496
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6305() : 0; // L: 1497
						return 1; // L: 1498
					} else if (var0 == 1632) { // L: 1500
						var7 = var3.method6380(); // L: 1501
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6121() : 0; // L: 1502
						return 1; // L: 1503
					} else {
						class27 var8;
						if (var0 == 1633) { // L: 1505
							var8 = var3.method6382(); // L: 1506
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method420(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0; // L: 1507
							return 1; // L: 1508
						} else if (var0 == 1634) { // L: 1510
							var8 = var3.method6382(); // L: 1511
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method385((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0; // L: 1512
							return 1; // L: 1513
						} else {
							return 2; // L: 1515
						}
					}
				} else {
					var7 = var3.method6380(); // L: 1463
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method6156() ? 1 : 0; // L: 1464
					return 1; // L: 1465
				}
			}
		}
	}
}
