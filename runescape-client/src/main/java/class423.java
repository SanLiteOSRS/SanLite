import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("qo")
class class423 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	final class424 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lql;)V"
	)
	class423(class424 var1) {
		this.this$0 = var1; // L: 7
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lqr;Lqr;I)I",
		garbageValue = "1927816429"
	)
	int method7820(class425 var1, class425 var2) {
		if (var1.field4625 > var2.field4625) {
			return 1; // L: 9
		} else {
			return var1.field4625 < var2.field4625 ? -1 : 0; // L: 10 11
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method7820((class425)var1, (class425)var2); // L: 15
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 19
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "1"
	)
	static int method7819(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class36.scriptDotWidget : class351.field3896; // L: 1356
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) { // L: 1357
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1358
			return 1; // L: 1359
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) { // L: 1361
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1362
			return 1; // L: 1363
		} else {
			class330 var7;
			if (var0 == ScriptOpcodes.CC_GETTEXT) { // L: 1365
				if (var3.type == 12) { // L: 1366
					var7 = var3.method6504(); // L: 1367
					if (var7 != null) { // L: 1368
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.method6264().method7368(); // L: 1369
						return 1; // L: 1370
					}
				}

				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.text; // L: 1373
				return 1; // L: 1374
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) { // L: 1376
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1377
				return 1; // L: 1378
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) { // L: 1380
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1381
				return 1; // L: 1382
			} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) { // L: 1384
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1385
				return 1; // L: 1386
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) { // L: 1388
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1389
				return 1; // L: 1390
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) { // L: 1392
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1393
				return 1; // L: 1394
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) { // L: 1396
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1397
				return 1; // L: 1398
			} else if (var0 == ScriptOpcodes.CC_GETTRANS) { // L: 1400
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1401
				return 1; // L: 1402
			} else if (var0 == 1610) { // L: 1404
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1405
				return 1; // L: 1406
			} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) { // L: 1408
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color; // L: 1409
				return 1; // L: 1410
			} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) { // L: 1412
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color2; // L: 1413
				return 1; // L: 1414
			} else if (var0 == 1613) { // L: 1416
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1417
				return 1; // L: 1418
			} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) { // L: 1420
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1421
				return 1; // L: 1422
			} else {
				class325 var4;
				if (var0 == 1617) { // L: 1424
					var4 = var3.method6469(); // L: 1425
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3539 : 0; // L: 1426
				}

				if (var0 == 1618) { // L: 1428
					var4 = var3.method6469(); // L: 1429
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3540 : 0; // L: 1430
					return 1; // L: 1431
				} else if (var0 == 1619) { // L: 1433
					var7 = var3.method6504(); // L: 1434
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6415().method7368() : ""; // L: 1435
					return 1; // L: 1436
				} else if (var0 == 1620) { // L: 1438
					var4 = var3.method6469(); // L: 1439
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3541 : 0; // L: 1440
					return 1; // L: 1441
				} else if (var0 == 1621) { // L: 1443
					var7 = var3.method6504(); // L: 1444
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6219() : 0; // L: 1445
					return 1; // L: 1446
				} else if (var0 == 1622) { // L: 1448
					var7 = var3.method6504(); // L: 1449
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6220() : 0; // L: 1450
					return 1; // L: 1451
				} else if (var0 == 1623) { // L: 1453
					var7 = var3.method6504(); // L: 1454
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6221() : 0; // L: 1455
					return 1; // L: 1456
				} else if (var0 == 1624) { // L: 1458
					var7 = var3.method6504(); // L: 1459
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method6211() ? 1 : 0; // L: 1460
					return 1; // L: 1461
				} else if (var0 != 1625) { // L: 1463
					if (var0 == 1626) { // L: 1468
						var7 = var3.method6504(); // L: 1469
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6210().method7582() : ""; // L: 1470
						return 1; // L: 1471
					} else if (var0 == 1627) { // L: 1473
						var7 = var3.method6504(); // L: 1474
						int var5 = var7 != null ? var7.method6215() : 0; // L: 1475
						int var6 = var7 != null ? var7.method6214() : 0; // L: 1476
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.min(var5, var6); // L: 1477
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.max(var5, var6); // L: 1478
						return 1; // L: 1479
					} else if (var0 == 1628) { // L: 1481
						var7 = var3.method6504(); // L: 1482
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6214() : 0; // L: 1483
						return 1; // L: 1484
					} else if (var0 == 1629) { // L: 1486
						var7 = var3.method6504(); // L: 1487
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6223() : 0; // L: 1488
						return 1; // L: 1489
					} else if (var0 == 1630) { // L: 1491
						var7 = var3.method6504(); // L: 1492
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6204() : 0; // L: 1493
						return 1; // L: 1494
					} else if (var0 == 1631) { // L: 1496
						var7 = var3.method6504(); // L: 1497
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6311() : 0; // L: 1498
						return 1; // L: 1499
					} else if (var0 == 1632) { // L: 1501
						var7 = var3.method6504(); // L: 1502
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6300() : 0; // L: 1503
						return 1; // L: 1504
					} else {
						class27 var8;
						if (var0 == 1633) { // L: 1506
							var8 = var3.method6463(); // L: 1507
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method391(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0; // L: 1508
							return 1; // L: 1509
						} else if (var0 == 1634) { // L: 1511
							var8 = var3.method6463(); // L: 1512
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method388((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0; // L: 1513
							return 1; // L: 1514
						} else {
							return 2; // L: 1516
						}
					}
				} else {
					var7 = var3.method6504(); // L: 1464
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method6212() ? 1 : 0; // L: 1465
					return 1; // L: 1466
				}
			}
		}
	}
}
