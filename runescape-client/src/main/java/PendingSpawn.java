import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dp")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("bx")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 607517733
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -366236409
	)
	@Export("type")
	int type;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 148935301
	)
	@Export("x")
	int x;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1282396229
	)
	@Export("y")
	int y;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1070828613
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1671835961
	)
	int field1136;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1607382315
	)
	int field1128;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -952925881
	)
	int field1129;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2041240731
	)
	int field1130;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -256020369
	)
	int field1131;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -133989175
	)
	int field1122;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 88222927
	)
	int field1133;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1145540491
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1159388207
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.field1133 = 31; // L: 18
		this.delay = 0; // L: 19
		this.hitpoints = -1; // L: 20
	} // L: 22

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1837400182"
	)
	void method2339(int var1) {
		this.field1133 = var1; // L: 25
	} // L: 26

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1640209605"
	)
	boolean method2348(int var1) {
		if (var1 >= 0 && var1 <= 4) { // L: 29
			return (this.field1133 & 1 << var1) != 0; // L: 30
		} else {
			return true; // L: 32
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "55"
	)
	public static boolean method2346(char var0) {
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) { // L: 45
			if (var0 != 0) { // L: 46
				char[] var1 = class382.cp1252AsciiExtension; // L: 48

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 49
					char var3 = var1[var2]; // L: 50
					if (var0 == var3) { // L: 52
						return true;
					}
				}
			}

			return false; // L: 57
		} else {
			return true;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZI)I",
		garbageValue = "-1392344286"
	)
	static int method2345(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : HealthBarUpdate.field1223; // L: 1355
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) { // L: 1356
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1357
			return 1; // L: 1358
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) { // L: 1360
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1361
			return 1; // L: 1362
		} else {
			class327 var7;
			if (var0 == ScriptOpcodes.CC_GETTEXT) { // L: 1364
				if (var3.type == 12) { // L: 1365
					var7 = var3.method6544(); // L: 1366
					if (var7 != null) { // L: 1367
						Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var7.method6201().method7257(); // L: 1368
						return 1; // L: 1369
					}
				}

				Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var3.text; // L: 1372
				return 1; // L: 1373
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) { // L: 1375
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1376
				return 1; // L: 1377
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) { // L: 1379
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1380
				return 1; // L: 1381
			} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) { // L: 1383
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1384
				return 1; // L: 1385
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) { // L: 1387
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1388
				return 1; // L: 1389
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) { // L: 1391
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1392
				return 1; // L: 1393
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) { // L: 1395
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1396
				return 1; // L: 1397
			} else if (var0 == ScriptOpcodes.CC_GETTRANS) { // L: 1399
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1400
				return 1; // L: 1401
			} else if (var0 == 1610) { // L: 1403
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1404
				return 1; // L: 1405
			} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) { // L: 1407
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.color; // L: 1408
				return 1; // L: 1409
			} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) { // L: 1411
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.color2; // L: 1412
				return 1; // L: 1413
			} else if (var0 == 1613) { // L: 1415
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1416
				return 1; // L: 1417
			} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) { // L: 1419
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1420
				return 1; // L: 1421
			} else {
				class322 var4;
				if (var0 == 1617) { // L: 1423
					var4 = var3.method6456(); // L: 1424
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var4 != null ? var4.field3520 : 0; // L: 1425
				}

				if (var0 == 1618) { // L: 1427
					var4 = var3.method6456(); // L: 1428
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var4 != null ? var4.field3519 : 0; // L: 1429
					return 1; // L: 1430
				} else if (var0 == 1619) { // L: 1432
					var7 = var3.method6544(); // L: 1433
					Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6191().method7257() : ""; // L: 1434
					return 1; // L: 1435
				} else if (var0 == 1620) { // L: 1437
					var4 = var3.method6456(); // L: 1438
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var4 != null ? var4.field3518 : 0; // L: 1439
					return 1; // L: 1440
				} else if (var0 == 1621) { // L: 1442
					var7 = var3.method6544(); // L: 1443
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var7 != null ? var7.method6212() : 0; // L: 1444
					return 1; // L: 1445
				} else if (var0 == 1622) { // L: 1447
					var7 = var3.method6544(); // L: 1448
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var7 != null ? var7.method6213() : 0; // L: 1449
					return 1; // L: 1450
				} else if (var0 == 1623) { // L: 1452
					var7 = var3.method6544(); // L: 1453
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var7 != null ? var7.method6157() : 0; // L: 1454
					return 1; // L: 1455
				} else if (var0 == 1624) { // L: 1457
					var7 = var3.method6544(); // L: 1458
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var7 != null && var7.method6380() ? 1 : 0; // L: 1459
					return 1; // L: 1460
				} else if (var0 != 1625) { // L: 1462
					if (var0 == 1626) { // L: 1467
						var7 = var3.method6544(); // L: 1468
						Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6203().method7529() : ""; // L: 1469
						return 1; // L: 1470
					} else if (var0 == 1627) { // L: 1472
						var7 = var3.method6544(); // L: 1473
						int var5 = var7 != null ? var7.method6208() : 0; // L: 1474
						int var6 = var7 != null ? var7.method6207() : 0; // L: 1475
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Math.min(var5, var6); // L: 1476
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Math.max(var5, var6); // L: 1477
						return 1; // L: 1478
					} else if (var0 == 1628) { // L: 1480
						var7 = var3.method6544(); // L: 1481
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var7 != null ? var7.method6207() : 0; // L: 1482
						return 1; // L: 1483
					} else if (var0 == 1629) { // L: 1485
						var7 = var3.method6544(); // L: 1486
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var7 != null ? var7.method6216() : 0; // L: 1487
						return 1; // L: 1488
					} else if (var0 == 1630) { // L: 1490
						var7 = var3.method6544(); // L: 1491
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var7 != null ? var7.method6215() : 0; // L: 1492
						return 1; // L: 1493
					} else if (var0 == 1631) { // L: 1495
						var7 = var3.method6544(); // L: 1496
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var7 != null ? var7.method6362() : 0; // L: 1497
						return 1; // L: 1498
					} else if (var0 == 1632) { // L: 1500
						var7 = var3.method6544(); // L: 1501
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var7 != null ? var7.method6218() : 0; // L: 1502
						return 1; // L: 1503
					} else {
						class27 var8;
						if (var0 == 1633) { // L: 1505
							var8 = var3.method6457(); // L: 1506
							Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize - 1] = var8 != null ? var8.method377(Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize - 1]) : 0; // L: 1507
							return 1; // L: 1508
						} else if (var0 == 1634) { // L: 1510
							var8 = var3.method6457(); // L: 1511
							Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize - 1] = var8 != null ? var8.method373((char)Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize - 1]) : 0; // L: 1512
							return 1; // L: 1513
						} else {
							return 2; // L: 1515
						}
					}
				} else {
					var7 = var3.method6544(); // L: 1463
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var7 != null && var7.method6205() ? 1 : 0; // L: 1464
					return 1; // L: 1465
				}
			}
		}
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1033000990"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0); // L: 10779

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) { // L: 10780
			var1 = var1.substring(0, var2) + "," + var1.substring(var2); // L: 10781
		}

		if (var1.length() > 9) { // L: 10783
			return " " + class396.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + class396.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + class396.colorStartTag(16776960) + var1 + "</col>"; // L: 10784 10785
		}
	}

	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "596951502"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase(); // L: 12522
		short[] var2 = new short[16]; // L: 12523
		int var3 = 0; // L: 12524

		for (int var4 = 0; var4 < class112.ItemComposition_fileCount; ++var4) { // L: 12525
			ItemComposition var9 = class230.ItemComposition_get(var4); // L: 12526
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) { // L: 12527 12528 12529
				if (var3 >= 250) { // L: 12530
					Occluder.foundItemIdCount = -1; // L: 12531
					class158.foundItemIds = null; // L: 12532
					return; // L: 12533
				}

				if (var3 >= var2.length) { // L: 12535
					short[] var6 = new short[var2.length * 2]; // L: 12536

					for (int var7 = 0; var7 < var3; ++var7) { // L: 12537
						var6[var7] = var2[var7];
					}

					var2 = var6; // L: 12538
				}

				var2[var3++] = (short)var4; // L: 12540
			}
		}

		class158.foundItemIds = var2; // L: 12542
		GroundObject.foundItemIndex = 0; // L: 12543
		Occluder.foundItemIdCount = var3; // L: 12544
		String[] var8 = new String[Occluder.foundItemIdCount]; // L: 12545

		for (int var5 = 0; var5 < Occluder.foundItemIdCount; ++var5) { // L: 12546
			var8[var5] = class230.ItemComposition_get(var2[var5]).name;
		}

		WorldMapIcon_0.method5412(var8, class158.foundItemIds); // L: 12547
	} // L: 12548
}
