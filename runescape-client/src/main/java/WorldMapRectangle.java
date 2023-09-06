import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ks")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1160500229
	)
	@Export("width")
	int width;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 944463717
	)
	@Export("height")
	int height;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1279455469
	)
	@Export("x")
	int x;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 827095241
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	final WorldMapManager this$0;

	@ObfuscatedSignature(
		descriptor = "(Ljd;)V"
	)
	WorldMapRectangle(WorldMapManager var1) {
		this.this$0 = var1; // L: 307
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "-213889891"
	)
	static int method5479(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? GameObject.scriptDotWidget : SceneTilePaint.field2808; // L: 1359
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) { // L: 1360
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1361
			return 1; // L: 1362
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) { // L: 1364
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1365
			return 1; // L: 1366
		} else {
			class329 var7;
			if (var0 == ScriptOpcodes.CC_GETTEXT) { // L: 1368
				if (var3.type == 12) { // L: 1369
					var7 = var3.method6532(); // L: 1370
					if (var7 != null) { // L: 1371
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var7.method6230().method7282(); // L: 1372
						return 1; // L: 1373
					}
				}

				Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var3.text; // L: 1376
				return 1; // L: 1377
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) { // L: 1379
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1380
				return 1; // L: 1381
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) { // L: 1383
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1384
				return 1; // L: 1385
			} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) { // L: 1387
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1388
				return 1; // L: 1389
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) { // L: 1391
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1392
				return 1; // L: 1393
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) { // L: 1395
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1396
				return 1; // L: 1397
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) { // L: 1399
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1400
				return 1; // L: 1401
			} else if (var0 == ScriptOpcodes.CC_GETTRANS) { // L: 1403
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1404
				return 1; // L: 1405
			} else if (var0 == 1610) { // L: 1407
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1408
				return 1; // L: 1409
			} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) { // L: 1411
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.color; // L: 1412
				return 1; // L: 1413
			} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) { // L: 1415
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.color2; // L: 1416
				return 1; // L: 1417
			} else if (var0 == 1613) { // L: 1419
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1420
				return 1; // L: 1421
			} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) { // L: 1423
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1424
				return 1; // L: 1425
			} else {
				class324 var4;
				if (var0 == 1617) { // L: 1427
					var4 = var3.method6416(); // L: 1428
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4 != null ? var4.field3547 : 0; // L: 1429
				}

				if (var0 == 1618) { // L: 1431
					var4 = var3.method6416(); // L: 1432
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4 != null ? var4.field3548 : 0; // L: 1433
					return 1; // L: 1434
				} else if (var0 == 1619) { // L: 1436
					var7 = var3.method6532(); // L: 1437
					Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6155().method7282() : ""; // L: 1438
					return 1; // L: 1439
				} else if (var0 == 1620) { // L: 1441
					var4 = var3.method6416(); // L: 1442
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4 != null ? var4.field3549 : 0; // L: 1443
					return 1; // L: 1444
				} else if (var0 == 1621) { // L: 1446
					var7 = var3.method6532(); // L: 1447
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null ? var7.method6326() : 0; // L: 1448
					return 1; // L: 1449
				} else if (var0 == 1622) { // L: 1451
					var7 = var3.method6532(); // L: 1452
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null ? var7.method6298() : 0; // L: 1453
					return 1; // L: 1454
				} else if (var0 == 1623) { // L: 1456
					var7 = var3.method6532(); // L: 1457
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null ? var7.method6362() : 0; // L: 1458
					return 1; // L: 1459
				} else if (var0 == 1624) { // L: 1461
					var7 = var3.method6532(); // L: 1462
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null && var7.method6157() ? 1 : 0; // L: 1463
					return 1; // L: 1464
				} else if (var0 != 1625) { // L: 1466
					if (var0 == 1626) { // L: 1471
						var7 = var3.method6532(); // L: 1472
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6120().method7542() : ""; // L: 1473
						return 1; // L: 1474
					} else if (var0 == 1627) { // L: 1476
						var7 = var3.method6532(); // L: 1477
						int var5 = var7 != null ? var7.method6161() : 0; // L: 1478
						int var6 = var7 != null ? var7.method6160() : 0; // L: 1479
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Math.min(var5, var6); // L: 1480
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Math.max(var5, var6); // L: 1481
						return 1; // L: 1482
					} else if (var0 == 1628) { // L: 1484
						var7 = var3.method6532(); // L: 1485
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null ? var7.method6160() : 0; // L: 1486
						return 1; // L: 1487
					} else if (var0 == 1629) { // L: 1489
						var7 = var3.method6532(); // L: 1490
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null ? var7.method6123() : 0; // L: 1491
						return 1; // L: 1492
					} else if (var0 == 1630) { // L: 1494
						var7 = var3.method6532(); // L: 1495
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null ? var7.method6168() : 0; // L: 1496
						return 1; // L: 1497
					} else if (var0 == 1631) { // L: 1499
						var7 = var3.method6532(); // L: 1500
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null ? var7.method6261() : 0; // L: 1501
						return 1; // L: 1502
					} else if (var0 == 1632) { // L: 1504
						var7 = var3.method6532(); // L: 1505
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null ? var7.method6114() : 0; // L: 1506
						return 1; // L: 1507
					} else {
						class27 var8;
						if (var0 == 1633) { // L: 1509
							var8 = var3.method6401(); // L: 1510
							Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize - 1] = var8 != null ? var8.method389(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize - 1]) : 0; // L: 1511
							return 1; // L: 1512
						} else if (var0 == 1634) { // L: 1514
							var8 = var3.method6401(); // L: 1515
							Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize - 1] = var8 != null ? var8.method395((char)Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize - 1]) : 0; // L: 1516
							return 1; // L: 1517
						} else {
							return 2; // L: 1519
						}
					}
				} else {
					var7 = var3.method6532(); // L: 1467
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null && var7.method6158() ? 1 : 0; // L: 1468
					return 1; // L: 1469
				}
			}
		}
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "853160118"
	)
	static void method5478() {
		if (Canvas.worldMap != null) { // L: 4417
			Canvas.worldMap.method8505(HealthBar.Client_plane, UrlRequester.baseX * 64 + (VarbitComposition.localPlayer.x >> 7), class47.baseY * 64 + (VarbitComposition.localPlayer.y >> 7), false); // L: 4418
			Canvas.worldMap.loadCache(); // L: 4419
		}

	} // L: 4421
}
