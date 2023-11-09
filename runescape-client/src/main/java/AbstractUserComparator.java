import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("pz")
@Implements("AbstractUserComparator")
public abstract class AbstractUserComparator implements Comparator {
	@ObfuscatedName("an")
	@Export("nextComparator")
	Comparator nextComparator;

	protected AbstractUserComparator() {
	} // L: 8

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;I)V",
		garbageValue = "1664695442"
	)
	@Export("addComparator")
	final void addComparator(Comparator var1) {
		if (this.nextComparator == null) { // L: 11
			this.nextComparator = var1; // L: 12
		} else if (this.nextComparator instanceof AbstractUserComparator) { // L: 14
			((AbstractUserComparator)this.nextComparator).addComparator(var1); // L: 15
		}

	} // L: 17

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lpw;Lpw;I)I",
		garbageValue = "641920470"
	)
	@Export("compareUser")
	protected final int compareUser(Nameable var1, Nameable var2) {
		return this.nextComparator == null ? 0 : this.nextComparator.compare(var1, var2); // L: 20 21
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 25
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZI)I",
		garbageValue = "1539640011"
	)
	static int method7860(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? SoundSystem.scriptDotWidget : class1.field5; // L: 1351
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) { // L: 1352
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1353
			return 1; // L: 1354
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) { // L: 1356
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1357
			return 1; // L: 1358
		} else {
			class314 var7;
			if (var0 == ScriptOpcodes.CC_GETTEXT) { // L: 1360
				if (var3.type == 12) { // L: 1361
					var7 = var3.method6392(); // L: 1362
					if (var7 != null) { // L: 1363
						Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var7.method6135().method7265(); // L: 1364
						return 1; // L: 1365
					}
				}

				Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var3.text; // L: 1368
				return 1; // L: 1369
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) { // L: 1371
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1372
				return 1; // L: 1373
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) { // L: 1375
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1376
				return 1; // L: 1377
			} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) { // L: 1379
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1380
				return 1; // L: 1381
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) { // L: 1383
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1384
				return 1; // L: 1385
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) { // L: 1387
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1388
				return 1; // L: 1389
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) { // L: 1391
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1392
				return 1; // L: 1393
			} else if (var0 == ScriptOpcodes.CC_GETTRANS) { // L: 1395
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1396
				return 1; // L: 1397
			} else if (var0 == 1610) { // L: 1399
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1400
				return 1; // L: 1401
			} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) { // L: 1403
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color; // L: 1404
				return 1; // L: 1405
			} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) { // L: 1407
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color2; // L: 1408
				return 1; // L: 1409
			} else if (var0 == 1613) { // L: 1411
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1412
				return 1; // L: 1413
			} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) { // L: 1415
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1416
				return 1; // L: 1417
			} else {
				class309 var4;
				if (var0 == 1617) { // L: 1419
					var4 = var3.method6394(); // L: 1420
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3493 : 0; // L: 1421
				}

				if (var0 == 1618) { // L: 1423
					var4 = var3.method6394(); // L: 1424
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3489 : 0; // L: 1425
					return 1; // L: 1426
				} else if (var0 == 1619) { // L: 1428
					var7 = var3.method6392(); // L: 1429
					Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6136().method7265() : ""; // L: 1430
					return 1; // L: 1431
				} else if (var0 == 1620) { // L: 1433
					var4 = var3.method6394(); // L: 1434
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3491 : 0; // L: 1435
					return 1; // L: 1436
				} else if (var0 == 1621) { // L: 1438
					var7 = var3.method6392(); // L: 1439
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6146() : 0; // L: 1440
					return 1; // L: 1441
				} else if (var0 == 1622) { // L: 1443
					var7 = var3.method6392(); // L: 1444
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6329() : 0; // L: 1445
					return 1; // L: 1446
				} else if (var0 == 1623) { // L: 1448
					var7 = var3.method6392(); // L: 1449
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6099() : 0; // L: 1450
					return 1; // L: 1451
				} else if (var0 == 1624) { // L: 1453
					var7 = var3.method6392(); // L: 1454
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method6138() ? 1 : 0; // L: 1455
					return 1; // L: 1456
				} else if (var0 != 1625) { // L: 1458
					if (var0 == 1626) { // L: 1463
						var7 = var3.method6392(); // L: 1464
						Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6137().method7522() : ""; // L: 1465
						return 1; // L: 1466
					} else if (var0 == 1627) { // L: 1468
						var7 = var3.method6392(); // L: 1469
						int var5 = var7 != null ? var7.method6142() : 0; // L: 1470
						int var6 = var7 != null ? var7.method6141() : 0; // L: 1471
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.min(var5, var6); // L: 1472
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.max(var5, var6); // L: 1473
						return 1; // L: 1474
					} else if (var0 == 1628) { // L: 1476
						var7 = var3.method6392(); // L: 1477
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6141() : 0; // L: 1478
						return 1; // L: 1479
					} else if (var0 == 1629) { // L: 1481
						var7 = var3.method6392(); // L: 1482
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6148() : 0; // L: 1483
						return 1; // L: 1484
					} else if (var0 == 1630) { // L: 1486
						var7 = var3.method6392(); // L: 1487
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6149() : 0; // L: 1488
						return 1; // L: 1489
					} else if (var0 == 1631) { // L: 1491
						var7 = var3.method6392(); // L: 1492
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6151() : 0; // L: 1493
						return 1; // L: 1494
					} else if (var0 == 1632) { // L: 1496
						var7 = var3.method6392(); // L: 1497
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6152() : 0; // L: 1498
						return 1; // L: 1499
					} else {
						class27 var8;
						if (var0 == 1633) { // L: 1501
							var8 = var3.method6367(); // L: 1502
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method409(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0; // L: 1503
							return 1; // L: 1504
						} else if (var0 == 1634) { // L: 1506
							var8 = var3.method6367(); // L: 1507
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method410((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0; // L: 1508
							return 1; // L: 1509
						} else {
							return 2; // L: 1511
						}
					}
				} else {
					var7 = var3.method6392(); // L: 1459
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method6139() ? 1 : 0; // L: 1460
					return 1; // L: 1461
				}
			}
		}
	}
}
