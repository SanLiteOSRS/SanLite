import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ek")
public enum class131 implements class342 {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	field1560(0, 0),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	field1564(1, 1),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	field1559(4, 2),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	field1561(3, 3),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	field1562(2, 4);

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	@Export("musicTrack")
	public static MusicTrack musicTrack;
	@ObfuscatedName("ff")
	@ObfuscatedGetter(
		intValue = -655594075
	)
	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1159505105
	)
	public final int field1563;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1577238385
	)
	@Export("id")
	final int id;

	class131(int var3, int var4) {
		this.field1563 = var3; // L: 17
		this.id = var4; // L: 18
	} // L: 19

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 23
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "4"
	)
	static boolean method2952(int var0, int var1) {
		return var0 != 4 || var1 < 8; // L: 26
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "2076003691"
	)
	static int method2955(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class140.scriptDotWidget : class136.field1589; // L: 1334
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) { // L: 1335
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1336
			return 1; // L: 1337
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) { // L: 1339
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1340
			return 1; // L: 1341
		} else {
			class300 var7;
			if (var0 == ScriptOpcodes.CC_GETTEXT) { // L: 1343
				if (var3.type == 12) { // L: 1344
					var7 = var3.method6076(); // L: 1345
					if (var7 != null) { // L: 1346
						Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var7.method5962().method6880(); // L: 1347
						return 1; // L: 1348
					}
				}

				Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var3.text; // L: 1351
				return 1; // L: 1352
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) { // L: 1354
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1355
				return 1; // L: 1356
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) { // L: 1358
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1359
				return 1; // L: 1360
			} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) { // L: 1362
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1363
				return 1; // L: 1364
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) { // L: 1366
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1367
				return 1; // L: 1368
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) { // L: 1370
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1371
				return 1; // L: 1372
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) { // L: 1374
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1375
				return 1; // L: 1376
			} else if (var0 == ScriptOpcodes.CC_GETTRANS) { // L: 1378
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1379
				return 1; // L: 1380
			} else if (var0 == 1610) { // L: 1382
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1383
				return 1; // L: 1384
			} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) { // L: 1386
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.color; // L: 1387
				return 1; // L: 1388
			} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) { // L: 1390
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.color2; // L: 1391
				return 1; // L: 1392
			} else if (var0 == 1613) { // L: 1394
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1395
				return 1; // L: 1396
			} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) { // L: 1398
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1399
				return 1; // L: 1400
			} else {
				class295 var4;
				if (var0 == 1617) { // L: 1402
					var4 = var3.method6153(); // L: 1403
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4 != null ? var4.field3399 : 0; // L: 1404
				}

				if (var0 == 1618) { // L: 1406
					var4 = var3.method6153(); // L: 1407
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4 != null ? var4.field3401 : 0; // L: 1408
					return 1; // L: 1409
				} else if (var0 == 1619) { // L: 1411
					var7 = var3.method6076(); // L: 1412
					Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var7 != null ? var7.method5816().method6880() : ""; // L: 1413
					return 1; // L: 1414
				} else if (var0 == 1620) { // L: 1416
					var4 = var3.method6153(); // L: 1417
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4 != null ? var4.field3400 : 0; // L: 1418
					return 1; // L: 1419
				} else if (var0 == 1621) { // L: 1421
					var7 = var3.method6076(); // L: 1422
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null ? var7.method5826() : 0; // L: 1423
					return 1; // L: 1424
				} else if (var0 == 1622) { // L: 1426
					var7 = var3.method6076(); // L: 1427
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null ? var7.method5827() : 0; // L: 1428
					return 1; // L: 1429
				} else if (var0 == 1623) { // L: 1431
					var7 = var3.method6076(); // L: 1432
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null ? var7.method5828() : 0; // L: 1433
					return 1; // L: 1434
				} else if (var0 == 1624) { // L: 1436
					var7 = var3.method6076(); // L: 1437
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null && var7.method5800() ? 1 : 0; // L: 1438
					return 1; // L: 1439
				} else if (var0 != 1625) { // L: 1441
					if (var0 == 1626) { // L: 1446
						var7 = var3.method6076(); // L: 1447
						Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var7 != null ? var7.method5817().method7116() : ""; // L: 1448
						return 1; // L: 1449
					} else if (var0 == 1627) { // L: 1451
						var7 = var3.method6076(); // L: 1452
						int var5 = var7 != null ? var7.method5898() : 0; // L: 1453
						int var6 = var7 != null ? var7.method5821() : 0; // L: 1454
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Math.min(var5, var6); // L: 1455
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Math.max(var5, var6); // L: 1456
						return 1; // L: 1457
					} else if (var0 == 1628) { // L: 1459
						var7 = var3.method6076(); // L: 1460
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null ? var7.method5821() : 0; // L: 1461
						return 1; // L: 1462
					} else if (var0 == 1629) { // L: 1464
						var7 = var3.method6076(); // L: 1465
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null ? var7.method6030() : 0; // L: 1466
						return 1; // L: 1467
					} else if (var0 == 1630) { // L: 1469
						var7 = var3.method6076(); // L: 1470
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null ? var7.method5829() : 0; // L: 1471
						return 1; // L: 1472
					} else if (var0 == 1631) { // L: 1474
						var7 = var3.method6076(); // L: 1475
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null ? var7.method5954() : 0; // L: 1476
						return 1; // L: 1477
					} else if (var0 == 1632) { // L: 1479
						var7 = var3.method6076(); // L: 1480
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null ? var7.method5832() : 0; // L: 1481
						return 1; // L: 1482
					} else {
						class28 var8;
						if (var0 == 1633) { // L: 1484
							var8 = var3.method6078(); // L: 1485
							Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize - 1] = var8 != null ? var8.method408(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize - 1]) : 0; // L: 1486
							return 1; // L: 1487
						} else if (var0 == 1634) { // L: 1489
							var8 = var3.method6078(); // L: 1490
							Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize - 1] = var8 != null ? var8.method409((char)Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize - 1]) : 0; // L: 1491
							return 1; // L: 1492
						} else {
							return 2; // L: 1494
						}
					}
				} else {
					var7 = var3.method6076(); // L: 1442
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null && var7.method5819() ? 1 : 0; // L: 1443
					return 1; // L: 1444
				}
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZB)I",
		garbageValue = "4"
	)
	static int method2956(int var0, Script var1, boolean var2) {
		if (var0 == 7463) { // L: 4914
			boolean var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 4915
			class12.method164(var3); // L: 4916
			return 1; // L: 4917
		} else {
			return 2; // L: 4919
		}
	}
}
