import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ms")
public class class343 {
	@ObfuscatedName("h")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("v")
	int[] field4280;
	@ObfuscatedName("x")
	int[] field4281;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -400630067
	)
	int field4282;

	public class343() {
		this.spriteMap = new HashMap(); // L: 10
		this.bounds = new Bounds(0, 0); // L: 11
		this.field4280 = new int[2048]; // L: 12
		this.field4281 = new int[2048]; // L: 13
		this.field4282 = 0; // L: 14
		SpotAnimationDefinition.method3743(); // L: 21
	} // L: 22

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "39"
	)
	void method6650(int var1) {
		int var2 = var1 * 2 + 1; // L: 46
		double var4 = (double)((float)var1 / 3.0F); // L: 48
		int var6 = var1 * 2 + 1; // L: 50
		double[] var7 = new double[var6]; // L: 51
		int var8 = -var1;

		for (int var9 = 0; var8 <= var1; ++var9) {
			var7[var9] = class318.method6372((double)var8, 0.0D, var4); // L: 53
			++var8; // L: 52
		}

		double[] var14 = var7; // L: 57
		double var15 = var7[var1] * var7[var1];
		int[] var17 = new int[var2 * var2];
		boolean var10 = false;

		for (int var11 = 0; var11 < var2; ++var11) { // L: 61
			for (int var12 = 0; var12 < var2; ++var12) {
				int var13 = var17[var12 + var2 * var11] = (int)(var14[var12] * var14[var11] / var15 * 256.0D); // L: 63
				if (!var10 && var13 > 0) { // L: 64
					var10 = true;
				}
			}
		}

		SpritePixels var18 = new SpritePixels(var17, var2, var2); // L: 69
		this.spriteMap.put(var1, var18); // L: 70
	} // L: 71

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Lrx;",
		garbageValue = "2123615497"
	)
	SpritePixels method6651(int var1) {
		if (!this.spriteMap.containsKey(var1)) { // L: 74
			this.method6650(var1); // L: 75
		}

		return (SpritePixels)this.spriteMap.get(var1); // L: 77
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1766411929"
	)
	public final void method6652(int var1, int var2) {
		if (this.field4282 < this.field4280.length) { // L: 81
			this.field4280[this.field4282] = var1; // L: 82
			this.field4281[this.field4282] = var2; // L: 83
			++this.field4282; // L: 84
		}
	} // L: 85

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "210500293"
	)
	public final void method6663() {
		this.field4282 = 0; // L: 88
	} // L: 89

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IILrx;FI)V",
		garbageValue = "-1098117017"
	)
	public final void method6668(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(var4 * 18.0F); // L: 92
		SpritePixels var6 = this.method6651(var5); // L: 93
		int var7 = var5 * 2 + 1; // L: 94
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight); // L: 95
		Bounds var9 = new Bounds(0, 0); // L: 96
		this.bounds.setHigh(var7, var7); // L: 97
		System.nanoTime(); // L: 98

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field4282; ++var10) { // L: 99
			var11 = this.field4280[var10]; // L: 100
			var12 = this.field4281[var10]; // L: 101
			int var13 = (int)(var4 * (float)(var11 - var1)) - var5; // L: 102
			int var14 = (int)((float)var3.subHeight - var4 * (float)(var12 - var2)) - var5; // L: 103
			this.bounds.setLow(var13, var14); // L: 104
			this.bounds.method7736(var8, var9); // L: 105
			this.method6655(var6, var3, var9); // L: 106
		}

		System.nanoTime(); // L: 108
		System.nanoTime(); // L: 109

		for (var10 = 0; var10 < var3.pixels.length; ++var10) { // L: 110
			if (var3.pixels[var10] == 0) { // L: 111
				var3.pixels[var10] = -16777216; // L: 112
			} else {
				var11 = (var3.pixels[var10] + 64 - 1) / 256; // L: 115
				if (var11 <= 0) { // L: 116
					var3.pixels[var10] = -16777216; // L: 117
				} else {
					if (var11 > StructComposition.field2122.length) { // L: 120
						var11 = StructComposition.field2122.length;
					}

					var12 = StructComposition.field2122[var11 - 1]; // L: 121
					var3.pixels[var10] = -16777216 | var12; // L: 122
				}
			}
		}

		System.nanoTime(); // L: 124
	} // L: 125

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lrx;Lrx;Lok;I)V",
		garbageValue = "-533727054"
	)
	void method6655(SpritePixels var1, SpritePixels var2, Bounds var3) {
		if (var3.highX != 0 && var3.highY != 0) { // L: 128
			int var4 = 0; // L: 129
			int var5 = 0; // L: 130
			if (var3.lowX == 0) { // L: 131
				var4 = var1.subWidth - var3.highX;
			}

			if (var3.lowY == 0) { // L: 132
				var5 = var1.subHeight - var3.highY;
			}

			int var6 = var4 + var5 * var1.subWidth; // L: 133
			int var7 = var3.lowX + var2.subWidth * var3.lowY; // L: 134

			for (int var8 = 0; var8 < var3.highY; ++var8) { // L: 135
				for (int var9 = 0; var9 < var3.highX; ++var9) { // L: 136
					int[] var10000 = var2.pixels; // L: 137
					int var10001 = var7++;
					var10000[var10001] += var1.pixels[var6++];
				}

				var6 += var1.subWidth - var3.highX; // L: 139
				var7 += var2.subWidth - var3.highX; // L: 140
			}

		}
	} // L: 142

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Ldj;",
		garbageValue = "-1969198767"
	)
	static class126 method6662(int var0) {
		class126[] var1 = new class126[]{class126.field1565, class126.field1563, class126.field1567, class126.field1564, class126.field1566, class126.field1562}; // L: 33
		class126 var2 = (class126)World.findEnumerated(var1, var0); // L: 35
		if (var2 == null) { // L: 36
			var2 = class126.field1565;
		}

		return var2; // L: 37
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "979622241"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		if (!BuddyRankComparator.client.method1230() && !BuddyRankComparator.client.isOtlTokenRequesterInitialized()) { // L: 1618
			Login.Login_response1 = ""; // L: 1622
			Login.Login_response2 = "Enter your username/email & password."; // L: 1623
			Login.Login_response3 = ""; // L: 1624
			class12.method155(2); // L: 1625
			if (var0) { // L: 1626
				Login.Login_password = "";
			}

			GameObject.method4831(); // L: 1627
			SoundSystem.method873(); // L: 1628
		} else {
			class12.method155(10); // L: 1619
		}
	} // L: 1620 1629

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZI)I",
		garbageValue = "-66353745"
	)
	static int method6671(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class190.scriptDotWidget : class360.field4354; // L: 1326
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) { // L: 1327
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1328
			return 1; // L: 1329
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) { // L: 1331
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1332
			return 1; // L: 1333
		} else {
			class303 var7;
			if (var0 == ScriptOpcodes.CC_GETTEXT) { // L: 1335
				if (var3.type == 12) { // L: 1336
					var7 = var3.method6167(); // L: 1337
					if (var7 != null) { // L: 1338
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.method6004().method7091(); // L: 1339
						return 1; // L: 1340
					}
				}

				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.text; // L: 1343
				return 1; // L: 1344
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) { // L: 1346
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1347
				return 1; // L: 1348
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) { // L: 1350
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1351
				return 1; // L: 1352
			} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) { // L: 1354
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1355
				return 1; // L: 1356
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) { // L: 1358
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1359
				return 1; // L: 1360
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) { // L: 1362
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1363
				return 1; // L: 1364
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) { // L: 1366
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1367
				return 1; // L: 1368
			} else if (var0 == ScriptOpcodes.CC_GETTRANS) { // L: 1370
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1371
				return 1; // L: 1372
			} else if (var0 == 1610) { // L: 1374
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1375
				return 1; // L: 1376
			} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) { // L: 1378
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.color; // L: 1379
				return 1; // L: 1380
			} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) { // L: 1382
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.color2; // L: 1383
				return 1; // L: 1384
			} else if (var0 == 1613) { // L: 1386
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1387
				return 1; // L: 1388
			} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) { // L: 1390
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1391
				return 1; // L: 1392
			} else {
				class298 var4;
				if (var0 == 1617) { // L: 1394
					var4 = var3.method6293(); // L: 1395
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4 != null ? var4.field3454 : 0; // L: 1396
				}

				if (var0 == 1618) { // L: 1398
					var4 = var3.method6293(); // L: 1399
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4 != null ? var4.field3456 : 0; // L: 1400
					return 1; // L: 1401
				} else if (var0 == 1619) { // L: 1403
					var7 = var3.method6167(); // L: 1404
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7 != null ? var7.method5893().method7091() : ""; // L: 1405
					return 1; // L: 1406
				} else if (var0 == 1620) { // L: 1408
					var4 = var3.method6293(); // L: 1409
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4 != null ? var4.field3455 : 0; // L: 1410
					return 1; // L: 1411
				} else if (var0 == 1621) { // L: 1413
					var7 = var3.method6167(); // L: 1414
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null ? var7.method5939() : 0; // L: 1415
					return 1; // L: 1416
				} else if (var0 == 1622) { // L: 1418
					var7 = var3.method6167(); // L: 1419
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null ? var7.method5940() : 0; // L: 1420
					return 1; // L: 1421
				} else if (var0 == 1623) { // L: 1423
					var7 = var3.method6167(); // L: 1424
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null ? var7.method6111() : 0; // L: 1425
					return 1; // L: 1426
				} else if (var0 == 1624) { // L: 1428
					var7 = var3.method6167(); // L: 1429
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null && var7.method5963() ? 1 : 0; // L: 1430
					return 1; // L: 1431
				} else if (var0 != 1625) { // L: 1433
					if (var0 == 1626) { // L: 1438
						var7 = var3.method6167(); // L: 1439
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7 != null ? var7.method5930().method7272() : ""; // L: 1440
						return 1; // L: 1441
					} else if (var0 == 1627) { // L: 1443
						var7 = var3.method6167(); // L: 1444
						int var5 = var7 != null ? var7.method5913() : 0; // L: 1445
						int var6 = var7 != null ? var7.method5934() : 0; // L: 1446
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Math.min(var5, var6); // L: 1447
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Math.max(var5, var6); // L: 1448
						return 1; // L: 1449
					} else if (var0 == 1628) { // L: 1451
						var7 = var3.method6167(); // L: 1452
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null ? var7.method5934() : 0; // L: 1453
						return 1; // L: 1454
					} else if (var0 == 1629) { // L: 1456
						var7 = var3.method6167(); // L: 1457
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null ? var7.method6054() : 0; // L: 1458
						return 1; // L: 1459
					} else if (var0 == 1630) { // L: 1461
						var7 = var3.method6167(); // L: 1462
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null ? var7.method5942() : 0; // L: 1463
						return 1; // L: 1464
					} else if (var0 == 1631) { // L: 1466
						var7 = var3.method6167(); // L: 1467
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null ? var7.method5944() : 0; // L: 1468
						return 1; // L: 1469
					} else if (var0 == 1632) { // L: 1471
						var7 = var3.method6167(); // L: 1472
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null ? var7.method6024() : 0; // L: 1473
						return 1; // L: 1474
					} else {
						class28 var8;
						if (var0 == 1633) { // L: 1476
							var8 = var3.method6187(); // L: 1477
							Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize - 1] = var8 != null ? var8.method393(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize - 1]) : 0; // L: 1478
							return 1; // L: 1479
						} else if (var0 == 1634) { // L: 1481
							var8 = var3.method6187(); // L: 1482
							Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize - 1] = var8 != null ? var8.method396((char)Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize - 1]) : 0; // L: 1483
							return 1; // L: 1484
						} else {
							return 2; // L: 1486
						}
					}
				} else {
					var7 = var3.method6167(); // L: 1434
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null && var7.method5878() ? 1 : 0; // L: 1435
					return 1; // L: 1436
				}
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([BII)I",
		garbageValue = "-791901458"
	)
	public static int method6673(byte[] var0, int var1) {
		int var3 = -1; // L: 58

		for (int var4 = 0; var4 < var1; ++var4) { // L: 59
			var3 = var3 >>> 8 ^ Buffer.crc32Table[(var3 ^ var0[var4]) & 255]; // L: 60
		}

		var3 = ~var3; // L: 62
		return var3; // L: 65
	}
}
