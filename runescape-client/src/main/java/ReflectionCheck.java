import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bj")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 612606403
	)
	@Export("id")
	int id;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -2014052025
	)
	@Export("size")
	int size;
	@ObfuscatedName("ar")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("ao")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("ab")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("au")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("aa")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("ac")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	} // L: 17

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "1"
	)
	static int method710(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : HealthBar.field1302; // L: 1369
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) { // L: 1370
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1371
			return 1; // L: 1372
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) { // L: 1374
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1375
			return 1; // L: 1376
		} else {
			class341 var7;
			if (var0 == ScriptOpcodes.CC_GETTEXT) { // L: 1378
				if (var3.type == 12) { // L: 1379
					var7 = var3.method6688(); // L: 1380
					if (var7 != null) { // L: 1381
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var7.method6616().method7523(); // L: 1382
						return 1; // L: 1383
					}
				}

				Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var3.text; // L: 1386
				return 1; // L: 1387
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) { // L: 1389
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1390
				return 1; // L: 1391
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) { // L: 1393
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1394
				return 1; // L: 1395
			} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) { // L: 1397
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1398
				return 1; // L: 1399
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) { // L: 1401
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1402
				return 1; // L: 1403
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) { // L: 1405
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1406
				return 1; // L: 1407
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) { // L: 1409
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1410
				return 1; // L: 1411
			} else if (var0 == ScriptOpcodes.CC_GETTRANS) { // L: 1413
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1414
				return 1; // L: 1415
			} else if (var0 == 1610) { // L: 1417
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1418
				return 1; // L: 1419
			} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) { // L: 1421
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.color; // L: 1422
				return 1; // L: 1423
			} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) { // L: 1425
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.color2; // L: 1426
				return 1; // L: 1427
			} else if (var0 == 1613) { // L: 1429
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1430
				return 1; // L: 1431
			} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) { // L: 1433
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1434
				return 1; // L: 1435
			} else {
				class336 var4;
				if (var0 == 1617) { // L: 1437
					var4 = var3.method6724(); // L: 1438
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var4 != null ? var4.field3580 : 0; // L: 1439
				}

				if (var0 == 1618) { // L: 1441
					var4 = var3.method6724(); // L: 1442
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var4 != null ? var4.field3578 : 0; // L: 1443
					return 1; // L: 1444
				} else if (var0 == 1619) { // L: 1446
					var7 = var3.method6688(); // L: 1447
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6644().method7523() : ""; // L: 1448
					return 1; // L: 1449
				} else if (var0 == 1620) { // L: 1451
					var4 = var3.method6724(); // L: 1452
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var4 != null ? var4.field3579 : 0; // L: 1453
					return 1; // L: 1454
				} else if (var0 == 1621) { // L: 1456
					var7 = var3.method6688(); // L: 1457
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var7 != null ? var7.method6420() : 0; // L: 1458
					return 1; // L: 1459
				} else if (var0 == 1622) { // L: 1461
					var7 = var3.method6688(); // L: 1462
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var7 != null ? var7.method6628() : 0; // L: 1463
					return 1; // L: 1464
				} else if (var0 == 1623) { // L: 1466
					var7 = var3.method6688(); // L: 1467
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var7 != null ? var7.method6630() : 0; // L: 1468
					return 1; // L: 1469
				} else if (var0 == 1624) { // L: 1471
					var7 = var3.method6688(); // L: 1472
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var7 != null && var7.method6640() ? 1 : 0; // L: 1473
					return 1; // L: 1474
				} else if (var0 != 1625) { // L: 1476
					if (var0 == 1626) { // L: 1481
						var7 = var3.method6688(); // L: 1482
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6609().method7775() : ""; // L: 1483
						return 1; // L: 1484
					} else if (var0 == 1627) { // L: 1486
						var7 = var3.method6688(); // L: 1487
						int var5 = var7 != null ? var7.method6416() : 0; // L: 1488
						int var6 = var7 != null ? var7.method6415() : 0; // L: 1489
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Math.min(var5, var6); // L: 1490
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Math.max(var5, var6); // L: 1491
						return 1; // L: 1492
					} else if (var0 == 1628) { // L: 1494
						var7 = var3.method6688(); // L: 1495
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var7 != null ? var7.method6415() : 0; // L: 1496
						return 1; // L: 1497
					} else if (var0 == 1629) { // L: 1499
						var7 = var3.method6688(); // L: 1500
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var7 != null ? var7.method6424() : 0; // L: 1501
						return 1; // L: 1502
					} else if (var0 == 1630) { // L: 1504
						var7 = var3.method6688(); // L: 1505
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var7 != null ? var7.method6423() : 0; // L: 1506
						return 1; // L: 1507
					} else if (var0 == 1631) { // L: 1509
						var7 = var3.method6688(); // L: 1510
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var7 != null ? var7.method6425() : 0; // L: 1511
						return 1; // L: 1512
					} else if (var0 == 1632) { // L: 1514
						var7 = var3.method6688(); // L: 1515
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var7 != null ? var7.method6550() : 0; // L: 1516
						return 1; // L: 1517
					} else {
						class27 var8;
						if (var0 == 1633) { // L: 1519
							var8 = var3.method6690(); // L: 1520
							Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize - 1] = var8 != null ? var8.method407(Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize - 1]) : 0; // L: 1521
							return 1; // L: 1522
						} else if (var0 == 1634) { // L: 1524
							var8 = var3.method6690(); // L: 1525
							Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize - 1] = var8 != null ? var8.method414((char)Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize - 1]) : 0; // L: 1526
							return 1; // L: 1527
						} else {
							return 2; // L: 1529
						}
					}
				} else {
					var7 = var3.method6688(); // L: 1477
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var7 != null && var7.method6409() ? 1 : 0; // L: 1478
					return 1; // L: 1479
				}
			}
		}
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "674487818"
	)
	static String method711(int var0) {
		if (var0 < 0) { // L: 10366
			return "";
		} else {
			return Client.menuTargets[var0].length() > 0 ? Client.menuActions[var0] + " " + Client.menuTargets[var0] : Client.menuActions[var0]; // L: 10367 10368
		}
	}
}
