import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ln")
@Implements("LoginPacket")
public class LoginPacket implements class281 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final LoginPacket field3290;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	static final LoginPacket field3285;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final LoginPacket field3288;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final LoginPacket field3286;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static final LoginPacket field3289;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	static final LoginPacket field3284;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lln;"
	)
	@Export("LoginPacket_indexedValues")
	static final LoginPacket[] LoginPacket_indexedValues;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1208472821
	)
	@Export("id")
	public final int id;

	static {
		field3290 = new LoginPacket(14, 0); // L: 5
		field3285 = new LoginPacket(15, 4); // L: 6
		field3288 = new LoginPacket(16, -2); // L: 7
		field3286 = new LoginPacket(18, -2); // L: 8
		field3289 = new LoginPacket(19, -2); // L: 9
		field3284 = new LoginPacket(27, 0); // L: 10
		LoginPacket_indexedValues = new LoginPacket[32]; // L: 12
		LoginPacket[] var0 = WorldMapArea.method4920(); // L: 15

		for (int var1 = 0; var1 < var0.length; ++var1) { // L: 16
			LoginPacket_indexedValues[var0[var1].id] = var0[var1]; // L: 17
		}

	} // L: 19

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	LoginPacket(int var1, int var2) {
		this.id = var1; // L: 26
	} // L: 27

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZI)I",
		garbageValue = "-1936355145"
	)
	static int method5473(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? GameObject.scriptDotWidget : SoundSystem.field319; // L: 1330
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) { // L: 1331
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1332
			return 1; // L: 1333
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) { // L: 1335
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1336
			return 1; // L: 1337
		} else {
			class310 var7;
			if (var0 == ScriptOpcodes.CC_GETTEXT) { // L: 1339
				if (var3.type == 12) { // L: 1340
					var7 = var3.method6118(); // L: 1341
					if (var7 != null) { // L: 1342
						Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var7.method5865().method6999(); // L: 1343
						return 1; // L: 1344
					}
				}

				Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var3.text; // L: 1347
				return 1; // L: 1348
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) { // L: 1350
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1351
				return 1; // L: 1352
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) { // L: 1354
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1355
				return 1; // L: 1356
			} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) { // L: 1358
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1359
				return 1; // L: 1360
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) { // L: 1362
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1363
				return 1; // L: 1364
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) { // L: 1366
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1367
				return 1; // L: 1368
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) { // L: 1370
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1371
				return 1; // L: 1372
			} else if (var0 == ScriptOpcodes.CC_GETTRANS) { // L: 1374
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1375
				return 1; // L: 1376
			} else if (var0 == 1610) { // L: 1378
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1379
				return 1; // L: 1380
			} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) { // L: 1382
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color; // L: 1383
				return 1; // L: 1384
			} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) { // L: 1386
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color2; // L: 1387
				return 1; // L: 1388
			} else if (var0 == 1613) { // L: 1390
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1391
				return 1; // L: 1392
			} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) { // L: 1394
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1395
				return 1; // L: 1396
			} else {
				class305 var4;
				if (var0 == 1617) { // L: 1398
					var4 = var3.method6119(); // L: 1399
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3436 : 0; // L: 1400
				}

				if (var0 == 1618) { // L: 1402
					var4 = var3.method6119(); // L: 1403
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3437 : 0; // L: 1404
					return 1; // L: 1405
				} else if (var0 == 1619) { // L: 1407
					var7 = var3.method6118(); // L: 1408
					Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var7 != null ? var7.method5866().method6999() : ""; // L: 1409
					return 1; // L: 1410
				} else if (var0 == 1620) { // L: 1412
					var4 = var3.method6119(); // L: 1413
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3440 : 0; // L: 1414
					return 1; // L: 1415
				} else if (var0 == 1621) { // L: 1417
					var7 = var3.method6118(); // L: 1418
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method5876() : 0; // L: 1419
					return 1; // L: 1420
				} else if (var0 == 1622) { // L: 1422
					var7 = var3.method6118(); // L: 1423
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method5818() : 0; // L: 1424
					return 1; // L: 1425
				} else if (var0 == 1623) { // L: 1427
					var7 = var3.method6118(); // L: 1428
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method5880() : 0; // L: 1429
					return 1; // L: 1430
				} else if (var0 == 1624) { // L: 1432
					var7 = var3.method6118(); // L: 1433
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method5955() ? 1 : 0; // L: 1434
					return 1; // L: 1435
				} else if (var0 != 1625) { // L: 1437
					if (var0 == 1626) { // L: 1442
						var7 = var3.method6118(); // L: 1443
						Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var7 != null ? var7.method5867().method7244() : ""; // L: 1444
						return 1; // L: 1445
					} else if (var0 == 1627) { // L: 1447
						var7 = var3.method6118(); // L: 1448
						int var5 = var7 != null ? var7.method6029() : 0; // L: 1449
						int var6 = var7 != null ? var7.method5871() : 0; // L: 1450
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.min(var5, var6); // L: 1451
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.max(var5, var6); // L: 1452
						return 1; // L: 1453
					} else if (var0 == 1628) { // L: 1455
						var7 = var3.method6118(); // L: 1456
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method5871() : 0; // L: 1457
						return 1; // L: 1458
					} else if (var0 == 1629) { // L: 1460
						var7 = var3.method6118(); // L: 1461
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method5913() : 0; // L: 1462
						return 1; // L: 1463
					} else if (var0 == 1630) { // L: 1465
						var7 = var3.method6118(); // L: 1466
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method5879() : 0; // L: 1467
						return 1; // L: 1468
					} else if (var0 == 1631) { // L: 1470
						var7 = var3.method6118(); // L: 1471
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method5881() : 0; // L: 1472
						return 1; // L: 1473
					} else if (var0 == 1632) { // L: 1475
						var7 = var3.method6118(); // L: 1476
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method5943() : 0; // L: 1477
						return 1; // L: 1478
					} else {
						class27 var8;
						if (var0 == 1633) { // L: 1480
							var8 = var3.method6120(); // L: 1481
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method386(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0; // L: 1482
							return 1; // L: 1483
						} else if (var0 == 1634) { // L: 1485
							var8 = var3.method6120(); // L: 1486
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method387((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0; // L: 1487
							return 1; // L: 1488
						} else {
							return 2; // L: 1490
						}
					}
				} else {
					var7 = var3.method6118(); // L: 1438
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method5933() ? 1 : 0; // L: 1439
					return 1; // L: 1440
				}
			}
		}
	}
}
