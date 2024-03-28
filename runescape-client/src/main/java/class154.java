import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fo")
public class class154 extends class144 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1037066445
	)
	public static int field1730;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1835507121
	)
	int field1729;
	@ObfuscatedName("ah")
	String field1728;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class154(class147 var1) {
		this.this$0 = var1; // L: 323
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "1253598633"
	)
	void vmethod3420(Buffer var1) {
		this.field1729 = var1.readInt(); // L: 326
		this.field1728 = var1.readStringCp1252NullTerminated(); // L: 327
	} // L: 328

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfp;B)V",
		garbageValue = "-123"
	)
	void vmethod3419(ClanSettings var1) {
		var1.method3258(this.field1729, this.field1728); // L: 331
	} // L: 332

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIZII)J",
		garbageValue = "1505272716"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
		long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17; // L: 72
		if (var3) { // L: 73
			var5 |= 65536L;
		}

		return var5; // L: 74
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "1841659614"
	)
	static int method3238(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class475.scriptDotWidget : class535.field5236; // L: 1402
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) { // L: 1403
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1404
			return 1; // L: 1405
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) { // L: 1407
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1408
			return 1; // L: 1409
		} else {
			class347 var7;
			if (var0 == ScriptOpcodes.CC_GETTEXT) { // L: 1411
				if (var3.type == 12) { // L: 1412
					var7 = var3.method6667(); // L: 1413
					if (var7 != null) { // L: 1414
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var7.method6412().method7539(); // L: 1415
						return 1; // L: 1416
					}
				}

				Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var3.text; // L: 1419
				return 1; // L: 1420
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) { // L: 1422
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1423
				return 1; // L: 1424
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) { // L: 1426
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1427
				return 1; // L: 1428
			} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) { // L: 1430
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1431
				return 1; // L: 1432
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) { // L: 1434
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1435
				return 1; // L: 1436
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) { // L: 1438
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1439
				return 1; // L: 1440
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) { // L: 1442
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1443
				return 1; // L: 1444
			} else if (var0 == ScriptOpcodes.CC_GETTRANS) { // L: 1446
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1447
				return 1; // L: 1448
			} else if (var0 == 1610) { // L: 1450
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1451
				return 1; // L: 1452
			} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) { // L: 1454
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.color; // L: 1455
				return 1; // L: 1456
			} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) { // L: 1458
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.color2; // L: 1459
				return 1; // L: 1460
			} else if (var0 == 1613) { // L: 1462
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1463
				return 1; // L: 1464
			} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) { // L: 1466
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1467
				return 1; // L: 1468
			} else {
				class341 var4;
				if (var0 == 1617) { // L: 1470
					var4 = var3.method6699(); // L: 1471
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var4 != null ? var4.field3655 : 0; // L: 1472
				}

				if (var0 == 1618) { // L: 1474
					var4 = var3.method6699(); // L: 1475
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var4 != null ? var4.field3656 : 0; // L: 1476
					return 1; // L: 1477
				} else if (var0 == 1619) { // L: 1479
					var7 = var3.method6667(); // L: 1480
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6413().method7539() : ""; // L: 1481
					return 1; // L: 1482
				} else if (var0 == 1620) { // L: 1484
					var4 = var3.method6699(); // L: 1485
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var4 != null ? var4.field3657 : 0; // L: 1486
					return 1; // L: 1487
				} else if (var0 == 1621) { // L: 1489
					var7 = var3.method6667(); // L: 1490
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var7 != null ? var7.method6423() : 0; // L: 1491
					return 1; // L: 1492
				} else if (var0 == 1622) { // L: 1494
					var7 = var3.method6667(); // L: 1495
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var7 != null ? var7.method6424() : 0; // L: 1496
					return 1; // L: 1497
				} else if (var0 == 1623) { // L: 1499
					var7 = var3.method6667(); // L: 1500
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var7 != null ? var7.method6425() : 0; // L: 1501
					return 1; // L: 1502
				} else if (var0 == 1624) { // L: 1504
					var7 = var3.method6667(); // L: 1505
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var7 != null && var7.method6459() ? 1 : 0; // L: 1506
					return 1; // L: 1507
				} else if (var0 != 1625) { // L: 1509
					if (var0 == 1626) { // L: 1514
						var7 = var3.method6667(); // L: 1515
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6431().method7763() : ""; // L: 1516
						return 1; // L: 1517
					} else if (var0 == 1627) { // L: 1519
						var7 = var3.method6667(); // L: 1520
						int var5 = var7 != null ? var7.method6559() : 0; // L: 1521
						int var6 = var7 != null ? var7.method6510() : 0; // L: 1522
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Math.min(var5, var6); // L: 1523
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Math.max(var5, var6); // L: 1524
						return 1; // L: 1525
					} else if (var0 == 1628) { // L: 1527
						var7 = var3.method6667(); // L: 1528
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var7 != null ? var7.method6510() : 0; // L: 1529
						return 1; // L: 1530
					} else if (var0 == 1629) { // L: 1532
						var7 = var3.method6667(); // L: 1533
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var7 != null ? var7.method6427() : 0; // L: 1534
						return 1; // L: 1535
					} else if (var0 == 1630) { // L: 1537
						var7 = var3.method6667(); // L: 1538
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var7 != null ? var7.method6574() : 0; // L: 1539
						return 1; // L: 1540
					} else if (var0 == 1631) { // L: 1542
						var7 = var3.method6667(); // L: 1543
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var7 != null ? var7.method6428() : 0; // L: 1544
						return 1; // L: 1545
					} else if (var0 == 1632) { // L: 1547
						var7 = var3.method6667(); // L: 1548
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var7 != null ? var7.method6429() : 0; // L: 1549
						return 1; // L: 1550
					} else {
						class27 var8;
						if (var0 == 1633) { // L: 1552
							var8 = var3.method6682(); // L: 1553
							Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize - 1] = var8 != null ? var8.method364(Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize - 1]) : 0; // L: 1554
							return 1; // L: 1555
						} else if (var0 == 1634) { // L: 1557
							var8 = var3.method6682(); // L: 1558
							Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize - 1] = var8 != null ? var8.method379((char)Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize - 1]) : 0; // L: 1559
							return 1; // L: 1560
						} else {
							return 2; // L: 1562
						}
					}
				} else {
					var7 = var3.method6667(); // L: 1510
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var7 != null && var7.method6416() ? 1 : 0; // L: 1511
					return 1; // L: 1512
				}
			}
		}
	}
}
