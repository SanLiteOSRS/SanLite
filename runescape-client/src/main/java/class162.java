import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fu")
public class class162 extends class155 {
	@ObfuscatedName("f")
	String field1809;
	@ObfuscatedName("w")
	byte field1806;
	@ObfuscatedName("v")
	byte field1807;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class156 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	class162(class156 var1) {
		this.this$0 = var1; // L: 155
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lrd;B)V",
		garbageValue = "-123"
	)
	void vmethod3387(Buffer var1) {
		this.field1809 = var1.readStringCp1252NullTerminatedOrNull(); // L: 158
		if (this.field1809 != null) { // L: 159
			var1.readUnsignedByte(); // L: 160
			this.field1806 = var1.readByte(); // L: 161
			this.field1807 = var1.readByte(); // L: 162
		}

	} // L: 164

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lfm;I)V",
		garbageValue = "127147356"
	)
	void vmethod3388(ClanChannel var1) {
		var1.name = this.field1809; // L: 167
		if (this.field1809 != null) { // L: 168
			var1.field1794 = this.field1806; // L: 169
			var1.field1795 = this.field1807; // L: 170
		}

	} // L: 172

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I",
		garbageValue = "-1856713774"
	)
	static int method3392(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : class85.field1091; // L: 1326
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) { // L: 1327
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1328
			return 1; // L: 1329
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) { // L: 1331
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1332
			return 1; // L: 1333
		} else {
			class307 var7;
			if (var0 == ScriptOpcodes.CC_GETTEXT) { // L: 1335
				if (var3.type == 12) { // L: 1336
					var7 = var3.method6235(); // L: 1337
					if (var7 != null) { // L: 1338
						Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var7.method5971().method7078(); // L: 1339
						return 1; // L: 1340
					}
				}

				Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var3.text; // L: 1343
				return 1; // L: 1344
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) { // L: 1346
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1347
				return 1; // L: 1348
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) { // L: 1350
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1351
				return 1; // L: 1352
			} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) { // L: 1354
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1355
				return 1; // L: 1356
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) { // L: 1358
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1359
				return 1; // L: 1360
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) { // L: 1362
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1363
				return 1; // L: 1364
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) { // L: 1366
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1367
				return 1; // L: 1368
			} else if (var0 == ScriptOpcodes.CC_GETTRANS) { // L: 1370
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1371
				return 1; // L: 1372
			} else if (var0 == 1610) { // L: 1374
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1375
				return 1; // L: 1376
			} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) { // L: 1378
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.color; // L: 1379
				return 1; // L: 1380
			} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) { // L: 1382
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.color2; // L: 1383
				return 1; // L: 1384
			} else if (var0 == 1613) { // L: 1386
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1387
				return 1; // L: 1388
			} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) { // L: 1390
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1391
				return 1; // L: 1392
			} else {
				class302 var4;
				if (var0 == 1617) { // L: 1394
					var4 = var3.method6226(); // L: 1395
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4 != null ? var4.field3465 : 0; // L: 1396
				}

				if (var0 == 1618) { // L: 1398
					var4 = var3.method6226(); // L: 1399
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4 != null ? var4.field3470 : 0; // L: 1400
					return 1; // L: 1401
				} else if (var0 == 1619) { // L: 1403
					var7 = var3.method6235(); // L: 1404
					Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6128().method7078() : ""; // L: 1405
					return 1; // L: 1406
				} else if (var0 == 1620) { // L: 1408
					var4 = var3.method6226(); // L: 1409
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4 != null ? var4.field3467 : 0; // L: 1410
					return 1; // L: 1411
				} else if (var0 == 1621) { // L: 1413
					var7 = var3.method6235(); // L: 1414
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null ? var7.method5950() : 0; // L: 1415
					return 1; // L: 1416
				} else if (var0 == 1622) { // L: 1418
					var7 = var3.method6235(); // L: 1419
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null ? var7.method5983() : 0; // L: 1420
					return 1; // L: 1421
				} else if (var0 == 1623) { // L: 1423
					var7 = var3.method6235(); // L: 1424
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null ? var7.method5984() : 0; // L: 1425
					return 1; // L: 1426
				} else if (var0 == 1624) { // L: 1428
					var7 = var3.method6235(); // L: 1429
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null && var7.method5974() ? 1 : 0; // L: 1430
					return 1; // L: 1431
				} else if (var0 != 1625) { // L: 1433
					if (var0 == 1626) { // L: 1438
						var7 = var3.method6235(); // L: 1439
						Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var7 != null ? var7.method5973().method7307() : ""; // L: 1440
						return 1; // L: 1441
					} else if (var0 == 1627) { // L: 1443
						var7 = var3.method6235(); // L: 1444
						int var5 = var7 != null ? var7.method5978() : 0; // L: 1445
						int var6 = var7 != null ? var7.method6145() : 0; // L: 1446
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Math.min(var5, var6); // L: 1447
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Math.max(var5, var6); // L: 1448
						return 1; // L: 1449
					} else if (var0 == 1628) { // L: 1451
						var7 = var3.method6235(); // L: 1452
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null ? var7.method6145() : 0; // L: 1453
						return 1; // L: 1454
					} else if (var0 == 1629) { // L: 1456
						var7 = var3.method6235(); // L: 1457
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null ? var7.method5985() : 0; // L: 1458
						return 1; // L: 1459
					} else if (var0 == 1630) { // L: 1461
						var7 = var3.method6235(); // L: 1462
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null ? var7.method5948() : 0; // L: 1463
						return 1; // L: 1464
					} else if (var0 == 1631) { // L: 1466
						var7 = var3.method6235(); // L: 1467
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null ? var7.method6058() : 0; // L: 1468
						return 1; // L: 1469
					} else if (var0 == 1632) { // L: 1471
						var7 = var3.method6235(); // L: 1472
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null ? var7.method5987() : 0; // L: 1473
						return 1; // L: 1474
					} else {
						class27 var8;
						if (var0 == 1633) { // L: 1476
							var8 = var3.method6227(); // L: 1477
							Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize - 1] = var8 != null ? var8.method393(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize - 1]) : 0; // L: 1478
							return 1; // L: 1479
						} else if (var0 == 1634) { // L: 1481
							var8 = var3.method6227(); // L: 1482
							Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize - 1] = var8 != null ? var8.method394((char)Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize - 1]) : 0; // L: 1483
							return 1; // L: 1484
						} else {
							return 2; // L: 1486
						}
					}
				} else {
					var7 = var3.method6235(); // L: 1434
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null && var7.method5954() ? 1 : 0; // L: 1435
					return 1; // L: 1436
				}
			}
		}
	}
}
