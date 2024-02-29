import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hc")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("as")
	static final int[] field2064;
	@ObfuscatedName("ft")
	static boolean field2061;
	@ObfuscatedName("uh")
	@ObfuscatedGetter(
		intValue = -874029184
	)
	static int field2065;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -781395907
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -738763001
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -969479853
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
		field2064 = new int[32]; // L: 15
		int var0 = 2; // L: 18

		for (int var1 = 0; var1 < 32; ++var1) { // L: 19
			field2064[var1] = var0 - 1; // L: 20
			var0 += var0; // L: 21
		}

	} // L: 23

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Luq;B)V",
		garbageValue = "40"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 31
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luq;IB)V",
		garbageValue = "-66"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.baseVar = var1.readUnsignedShort();
			this.startBit = var1.readUnsignedByte(); // L: 40
			this.endBit = var1.readUnsignedByte(); // L: 41
		}

	} // L: 44

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)Lim;",
		garbageValue = "-1279"
	)
	public static class219 method3830() {
		return class219.field2371;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lhn;",
		garbageValue = "-1830328476"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0); // L: 32
		if (var1 != null) { // L: 33
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0); // L: 34
			var1 = new SpotAnimationDefinition(); // L: 35
			var1.id = var0; // L: 36
			if (var2 != null) { // L: 37
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0); // L: 38
			return var1; // L: 39
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-326552264"
	)
	public static boolean method3831() {
		return !class321.field3484.isEmpty(); // L: 138
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "-30"
	)
	static int method3832(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : class141.field1644; // L: 1400
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) { // L: 1401
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1402
			return 1; // L: 1403
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) { // L: 1405
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1406
			return 1; // L: 1407
		} else {
			class347 var7;
			if (var0 == ScriptOpcodes.CC_GETTEXT) { // L: 1409
				if (var3.type == 12) { // L: 1410
					var7 = var3.method6806(); // L: 1411
					if (var7 != null) { // L: 1412
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var7.method6515().method7754(); // L: 1413
						return 1; // L: 1414
					}
				}

				Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3.text; // L: 1417
				return 1; // L: 1418
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) { // L: 1420
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1421
				return 1; // L: 1422
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) { // L: 1424
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1425
				return 1; // L: 1426
			} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) { // L: 1428
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1429
				return 1; // L: 1430
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) { // L: 1432
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1433
				return 1; // L: 1434
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) { // L: 1436
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1437
				return 1; // L: 1438
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) { // L: 1440
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1441
				return 1; // L: 1442
			} else if (var0 == ScriptOpcodes.CC_GETTRANS) { // L: 1444
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1445
				return 1; // L: 1446
			} else if (var0 == 1610) { // L: 1448
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1449
				return 1; // L: 1450
			} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) { // L: 1452
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color; // L: 1453
				return 1; // L: 1454
			} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) { // L: 1456
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color2; // L: 1457
				return 1; // L: 1458
			} else if (var0 == 1613) { // L: 1460
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1461
				return 1; // L: 1462
			} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) { // L: 1464
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1465
				return 1; // L: 1466
			} else {
				class341 var4;
				if (var0 == 1617) { // L: 1468
					var4 = var3.method6823(); // L: 1469
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3643 : 0; // L: 1470
				}

				if (var0 == 1618) { // L: 1472
					var4 = var3.method6823(); // L: 1473
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3639 : 0; // L: 1474
					return 1; // L: 1475
				} else if (var0 == 1619) { // L: 1477
					var7 = var3.method6806(); // L: 1478
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6711().method7754() : ""; // L: 1479
					return 1; // L: 1480
				} else if (var0 == 1620) { // L: 1482
					var4 = var3.method6823(); // L: 1483
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3640 : 0; // L: 1484
					return 1; // L: 1485
				} else if (var0 == 1621) { // L: 1487
					var7 = var3.method6806(); // L: 1488
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6565() : 0; // L: 1489
					return 1; // L: 1490
				} else if (var0 == 1622) { // L: 1492
					var7 = var3.method6806(); // L: 1493
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6663() : 0; // L: 1494
					return 1; // L: 1495
				} else if (var0 == 1623) { // L: 1497
					var7 = var3.method6806(); // L: 1498
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6623() : 0; // L: 1499
					return 1; // L: 1500
				} else if (var0 == 1624) { // L: 1502
					var7 = var3.method6806(); // L: 1503
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method6557() ? 1 : 0; // L: 1504
					return 1; // L: 1505
				} else if (var0 != 1625) { // L: 1507
					if (var0 == 1626) { // L: 1512
						var7 = var3.method6806(); // L: 1513
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6556().method7960() : ""; // L: 1514
						return 1; // L: 1515
					} else if (var0 == 1627) { // L: 1517
						var7 = var3.method6806(); // L: 1518
						int var5 = var7 != null ? var7.method6561() : 0; // L: 1519
						int var6 = var7 != null ? var7.method6560() : 0; // L: 1520
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.min(var5, var6); // L: 1521
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.max(var5, var6); // L: 1522
						return 1; // L: 1523
					} else if (var0 == 1628) { // L: 1525
						var7 = var3.method6806(); // L: 1526
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6560() : 0; // L: 1527
						return 1; // L: 1528
					} else if (var0 == 1629) { // L: 1530
						var7 = var3.method6806(); // L: 1531
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6569() : 0; // L: 1532
						return 1; // L: 1533
					} else if (var0 == 1630) { // L: 1535
						var7 = var3.method6806(); // L: 1536
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6568() : 0; // L: 1537
						return 1; // L: 1538
					} else if (var0 == 1631) { // L: 1540
						var7 = var3.method6806(); // L: 1541
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6570() : 0; // L: 1542
						return 1; // L: 1543
					} else if (var0 == 1632) { // L: 1545
						var7 = var3.method6806(); // L: 1546
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6636() : 0; // L: 1547
						return 1; // L: 1548
					} else {
						class27 var8;
						if (var0 == 1633) { // L: 1550
							var8 = var3.method6825(); // L: 1551
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method361(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0; // L: 1552
							return 1; // L: 1553
						} else if (var0 == 1634) { // L: 1555
							var8 = var3.method6825(); // L: 1556
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method362((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0; // L: 1557
							return 1; // L: 1558
						} else {
							return 2; // L: 1560
						}
					}
				} else {
					var7 = var3.method6806(); // L: 1508
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method6558() ? 1 : 0; // L: 1509
					return 1; // L: 1510
				}
			}
		}
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "0"
	)
	static void method3820(int var0, int var1, int var2, int var3) {
		Widget var4 = ArchiveLoader.field1070.method6433(var0, var1); // L: 10092
		if (var4 != null && var4.onTargetEnter != null) { // L: 10093
			ScriptEvent var5 = new ScriptEvent(); // L: 10094
			var5.widget = var4; // L: 10095
			var5.args = var4.onTargetEnter; // L: 10096
			class177.runScriptEvent(var5); // L: 10097
		}

		Client.field695 = var3; // L: 10099
		Client.isSpellSelected = true; // L: 10100
		class160.field1778 = var0; // L: 10101
		Client.field538 = var1; // L: 10102
		class128.field1520 = var2; // L: 10103
		UserComparator5.invalidateWidget(var4); // L: 10104
	} // L: 10105
}
