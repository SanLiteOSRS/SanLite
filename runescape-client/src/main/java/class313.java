import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mt")
public class class313 {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "-833421432"
	)
	public static String method5999(CharSequence var0) {
		return class167.method3532('*', var0.length()); // L: 223
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "1557324762"
	)
	static int method5998(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class31.scriptDotWidget : class185.field1932; // L: 1400
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) { // L: 1401
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1402
			return 1; // L: 1403
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) { // L: 1405
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1406
			return 1; // L: 1407
		} else {
			class344 var7;
			if (var0 == ScriptOpcodes.CC_GETTEXT) { // L: 1409
				if (var3.type == 12) { // L: 1410
					var7 = var3.method6700(); // L: 1411
					if (var7 != null) { // L: 1412
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var7.method6442().method7608(); // L: 1413
						return 1; // L: 1414
					}
				}

				Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var3.text; // L: 1417
				return 1; // L: 1418
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) { // L: 1420
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1421
				return 1; // L: 1422
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) { // L: 1424
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1425
				return 1; // L: 1426
			} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) { // L: 1428
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1429
				return 1; // L: 1430
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) { // L: 1432
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1433
				return 1; // L: 1434
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) { // L: 1436
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1437
				return 1; // L: 1438
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) { // L: 1440
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1441
				return 1; // L: 1442
			} else if (var0 == ScriptOpcodes.CC_GETTRANS) { // L: 1444
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1445
				return 1; // L: 1446
			} else if (var0 == 1610) { // L: 1448
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1449
				return 1; // L: 1450
			} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) { // L: 1452
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.color; // L: 1453
				return 1; // L: 1454
			} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) { // L: 1456
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.color2; // L: 1457
				return 1; // L: 1458
			} else if (var0 == 1613) { // L: 1460
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1461
				return 1; // L: 1462
			} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) { // L: 1464
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1465
				return 1; // L: 1466
			} else {
				class339 var4;
				if (var0 == 1617) { // L: 1468
					var4 = var3.method6729(); // L: 1469
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4 != null ? var4.field3623 : 0; // L: 1470
				}

				if (var0 == 1618) { // L: 1472
					var4 = var3.method6729(); // L: 1473
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4 != null ? var4.field3619 : 0; // L: 1474
					return 1; // L: 1475
				} else if (var0 == 1619) { // L: 1477
					var7 = var3.method6700(); // L: 1478
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6564().method7608() : ""; // L: 1479
					return 1; // L: 1480
				} else if (var0 == 1620) { // L: 1482
					var4 = var3.method6729(); // L: 1483
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4 != null ? var4.field3620 : 0; // L: 1484
					return 1; // L: 1485
				} else if (var0 == 1621) { // L: 1487
					var7 = var3.method6700(); // L: 1488
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null ? var7.method6452() : 0; // L: 1489
					return 1; // L: 1490
				} else if (var0 == 1622) { // L: 1492
					var7 = var3.method6700(); // L: 1493
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null ? var7.method6476() : 0; // L: 1494
					return 1; // L: 1495
				} else if (var0 == 1623) { // L: 1497
					var7 = var3.method6700(); // L: 1498
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null ? var7.method6477() : 0; // L: 1499
					return 1; // L: 1500
				} else if (var0 == 1624) { // L: 1502
					var7 = var3.method6700(); // L: 1503
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null && var7.method6468() ? 1 : 0; // L: 1504
					return 1; // L: 1505
				} else if (var0 != 1625) { // L: 1507
					if (var0 == 1626) { // L: 1512
						var7 = var3.method6700(); // L: 1513
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6467().method7883() : ""; // L: 1514
						return 1; // L: 1515
					} else if (var0 == 1627) { // L: 1517
						var7 = var3.method6700(); // L: 1518
						int var5 = var7 != null ? var7.method6531() : 0; // L: 1519
						int var6 = var7 != null ? var7.method6471() : 0; // L: 1520
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Math.min(var5, var6); // L: 1521
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Math.max(var5, var6); // L: 1522
						return 1; // L: 1523
					} else if (var0 == 1628) { // L: 1525
						var7 = var3.method6700(); // L: 1526
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null ? var7.method6471() : 0; // L: 1527
						return 1; // L: 1528
					} else if (var0 == 1629) { // L: 1530
						var7 = var3.method6700(); // L: 1531
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null ? var7.method6479() : 0; // L: 1532
						return 1; // L: 1533
					} else if (var0 == 1630) { // L: 1535
						var7 = var3.method6700(); // L: 1536
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null ? var7.method6663() : 0; // L: 1537
						return 1; // L: 1538
					} else if (var0 == 1631) { // L: 1540
						var7 = var3.method6700(); // L: 1541
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null ? var7.method6480() : 0; // L: 1542
						return 1; // L: 1543
					} else if (var0 == 1632) { // L: 1545
						var7 = var3.method6700(); // L: 1546
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null ? var7.method6593() : 0; // L: 1547
						return 1; // L: 1548
					} else {
						class27 var8;
						if (var0 == 1633) { // L: 1550
							var8 = var3.method6724(); // L: 1551
							Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize - 1] = var8 != null ? var8.method394(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize - 1]) : 0; // L: 1552
							return 1; // L: 1553
						} else if (var0 == 1634) { // L: 1555
							var8 = var3.method6724(); // L: 1556
							Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize - 1] = var8 != null ? var8.method395((char)Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize - 1]) : 0; // L: 1557
							return 1; // L: 1558
						} else {
							return 2; // L: 1560
						}
					}
				} else {
					var7 = var3.method6700(); // L: 1508
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null && var7.method6672() ? 1 : 0; // L: 1509
					return 1; // L: 1510
				}
			}
		}
	}
}
