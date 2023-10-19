import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fl")
public class class134 implements class386 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class134 field1591;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class134 field1573;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class134 field1574;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class134 field1575;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class134 field1576;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class134 field1577;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class134 field1578;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class134 field1587;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class134 field1580;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class134 field1581;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class134 field1583;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class134 field1589;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class134 field1584;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class134 field1585;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class134 field1586;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class134 field1582;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class134 field1579;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 779601295
	)
	final int field1572;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1270845997
	)
	final int field1588;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -311137263
	)
	final int field1590;

	static {
		field1591 = new class134(0, 0, (String)null, -1, -1); // L: 52
		field1573 = new class134(1, 1, (String)null, 0, 2); // L: 53
		field1574 = new class134(2, 2, (String)null, 1, 2); // L: 54
		field1575 = new class134(3, 3, (String)null, 2, 2); // L: 55
		field1576 = new class134(4, 4, (String)null, 3, 1); // L: 56
		field1577 = new class134(5, 5, (String)null, 4, 1); // L: 57
		field1578 = new class134(6, 6, (String)null, 5, 1); // L: 58
		field1587 = new class134(7, 7, (String)null, 6, 3); // L: 59
		field1580 = new class134(8, 8, (String)null, 7, 3); // L: 60
		field1581 = new class134(9, 9, (String)null, 8, 3); // L: 61
		field1583 = new class134(10, 10, (String)null, 0, 7); // L: 62
		field1589 = new class134(11, 11, (String)null, 1, 7); // L: 63
		field1584 = new class134(12, 12, (String)null, 2, 7); // L: 64
		field1585 = new class134(13, 13, (String)null, 3, 7); // L: 65
		field1586 = new class134(14, 14, (String)null, 4, 7); // L: 66
		field1582 = new class134(15, 15, (String)null, 5, 7); // L: 67
		field1579 = new class134(16, 16, (String)null, 0, 5); // L: 68
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class134(int var1, int var2, String var3, int var4, int var5) {
		this.field1572 = var1; // L: 74
		this.field1588 = var2; // L: 75
		this.field1590 = var4; // L: 76
	} // L: 77

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1243971674"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1588; // L: 80
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-232140937"
	)
	int method3067() {
		return this.field1590; // L: 84
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "385720754"
	)
	static int method3070(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class416.scriptDotWidget : class306.field3131; // L: 1370
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) { // L: 1371
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1372
			return 1; // L: 1373
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) { // L: 1375
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1376
			return 1; // L: 1377
		} else {
			class344 var7;
			if (var0 == ScriptOpcodes.CC_GETTEXT) { // L: 1379
				if (var3.type == 12) { // L: 1380
					var7 = var3.method6614(); // L: 1381
					if (var7 != null) { // L: 1382
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var7.method6532().method7468(); // L: 1383
						return 1; // L: 1384
					}
				}

				Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var3.text; // L: 1387
				return 1; // L: 1388
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) { // L: 1390
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1391
				return 1; // L: 1392
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) { // L: 1394
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1395
				return 1; // L: 1396
			} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) { // L: 1398
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1399
				return 1; // L: 1400
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) { // L: 1402
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1403
				return 1; // L: 1404
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) { // L: 1406
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1407
				return 1; // L: 1408
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) { // L: 1410
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1411
				return 1; // L: 1412
			} else if (var0 == ScriptOpcodes.CC_GETTRANS) { // L: 1414
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1415
				return 1; // L: 1416
			} else if (var0 == 1610) { // L: 1418
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1419
				return 1; // L: 1420
			} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) { // L: 1422
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color; // L: 1423
				return 1; // L: 1424
			} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) { // L: 1426
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color2; // L: 1427
				return 1; // L: 1428
			} else if (var0 == 1613) { // L: 1430
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1431
				return 1; // L: 1432
			} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) { // L: 1434
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1435
				return 1; // L: 1436
			} else {
				class339 var4;
				if (var0 == 1617) { // L: 1438
					var4 = var3.method6615(); // L: 1439
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3591 : 0; // L: 1440
				}

				if (var0 == 1618) { // L: 1442
					var4 = var3.method6615(); // L: 1443
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3592 : 0; // L: 1444
					return 1; // L: 1445
				} else if (var0 == 1619) { // L: 1447
					var7 = var3.method6614(); // L: 1448
					Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6353().method7468() : ""; // L: 1449
					return 1; // L: 1450
				} else if (var0 == 1620) { // L: 1452
					var4 = var3.method6615(); // L: 1453
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3593 : 0; // L: 1454
					return 1; // L: 1455
				} else if (var0 == 1621) { // L: 1457
					var7 = var3.method6614(); // L: 1458
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6523() : 0; // L: 1459
					return 1; // L: 1460
				} else if (var0 == 1622) { // L: 1462
					var7 = var3.method6614(); // L: 1463
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6364() : 0; // L: 1464
					return 1; // L: 1465
				} else if (var0 == 1623) { // L: 1467
					var7 = var3.method6614(); // L: 1468
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6365() : 0; // L: 1469
					return 1; // L: 1470
				} else if (var0 == 1624) { // L: 1472
					var7 = var3.method6614(); // L: 1473
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method6355() ? 1 : 0; // L: 1474
					return 1; // L: 1475
				} else if (var0 != 1625) { // L: 1477
					if (var0 == 1626) { // L: 1482
						var7 = var3.method6614(); // L: 1483
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6354().method7720() : ""; // L: 1484
						return 1; // L: 1485
					} else if (var0 == 1627) { // L: 1487
						var7 = var3.method6614(); // L: 1488
						int var5 = var7 != null ? var7.method6359() : 0; // L: 1489
						int var6 = var7 != null ? var7.method6358() : 0; // L: 1490
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.min(var5, var6); // L: 1491
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.max(var5, var6); // L: 1492
						return 1; // L: 1493
					} else if (var0 == 1628) { // L: 1495
						var7 = var3.method6614(); // L: 1496
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6358() : 0; // L: 1497
						return 1; // L: 1498
					} else if (var0 == 1629) { // L: 1500
						var7 = var3.method6614(); // L: 1501
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6367() : 0; // L: 1502
						return 1; // L: 1503
					} else if (var0 == 1630) { // L: 1505
						var7 = var3.method6614(); // L: 1506
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6302() : 0; // L: 1507
						return 1; // L: 1508
					} else if (var0 == 1631) { // L: 1510
						var7 = var3.method6614(); // L: 1511
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6368() : 0; // L: 1512
						return 1; // L: 1513
					} else if (var0 == 1632) { // L: 1515
						var7 = var3.method6614(); // L: 1516
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6372() : 0; // L: 1517
						return 1; // L: 1518
					} else {
						class27 var8;
						if (var0 == 1633) { // L: 1520
							var8 = var3.method6591(); // L: 1521
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method374(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0; // L: 1522
							return 1; // L: 1523
						} else if (var0 == 1634) { // L: 1525
							var8 = var3.method6591(); // L: 1526
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method411((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0; // L: 1527
							return 1; // L: 1528
						} else {
							return 2; // L: 1530
						}
					}
				} else {
					var7 = var3.method6614(); // L: 1478
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method6356() ? 1 : 0; // L: 1479
					return 1; // L: 1480
				}
			}
		}
	}
}
