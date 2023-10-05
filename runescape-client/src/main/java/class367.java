import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("os")
public enum class367 implements class386 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	field4259(-1),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	field4263(0),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	field4260(1),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	field4261(2);

	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -2001348855
	)
	final int field4262;

	class367(int var3) {
		this.field4262 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1243971674"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4262; // L: 20
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lpu;Lpu;Lpu;I)V",
		garbageValue = "-481171967"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (class340.canvasWidth - 765) / 2; // L: 1306
		Login.loginBoxX = Login.xPadding + 202; // L: 1307
		class379.loginBoxCenter = Login.loginBoxX + 180; // L: 1308
		if (Login.worldSelectOpen) { // L: 1309
			ArchiveDiskActionHandler.method6854(var0, var1); // L: 1310
		} else {
			PcmPlayer.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1313
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1314
			Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 1315
			int var4;
			if (Client.gameState == 0 || Client.gameState == 5) { // L: 1316
				byte var3 = 20; // L: 1317
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1); // L: 1318
				var4 = 253 - var3; // L: 1319
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409); // L: 1320
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0); // L: 1321
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409); // L: 1322
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150 + Login.Login_loadingPercent * 3, var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0); // L: 1323
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1); // L: 1324
			}

			String var6;
			String var7;
			String var8;
			String var9;
			short var23;
			int var24;
			short var25;
			if (Client.gameState == 20) { // L: 1326
				Login.titleboxSprite.drawAt(Login.loginBoxX + 180 - Login.titleboxSprite.subWidth / 2, 271 - Login.titleboxSprite.subHeight / 2); // L: 1327
				var23 = 201; // L: 1328
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1329
				var24 = var23 + 15; // L: 1330
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1331
				var24 += 15; // L: 1332
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1333
				var24 += 15; // L: 1334
				var24 += 7; // L: 1335
				if (Login.loginIndex != 4 && Login.loginIndex != 10) { // L: 1336
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var24, 16777215, 0); // L: 1337
					var25 = 200; // L: 1338
					if (class91.clientPreferences.method2504()) { // L: 1342
						var8 = Login.Login_username; // L: 1344
						var7 = class92.method2360('*', var8.length()); // L: 1346
						var6 = var7; // L: 1348
					} else {
						var6 = Login.Login_username; // L: 1350
					}

					for (var6 = var6; var0.stringWidth(var6) > var25; var6 = var6.substring(0, var6.length() - 1)) { // L: 1353 1354 1355
					}

					var0.draw(AbstractFont.escapeBrackets(var6), Login.loginBoxX + 180 - 70, var24, 16777215, 0); // L: 1357
					var24 += 15; // L: 1358
					var8 = Login.Login_password; // L: 1360
					var7 = class92.method2360('*', var8.length()); // L: 1362

					for (var9 = var7; var0.stringWidth(var9) > var25; var9 = var9.substring(1)) { // L: 1364 1365 1366
					}

					var0.draw("Password: " + var9, Login.loginBoxX + 180 - 108, var24, 16777215, 0); // L: 1368
					var24 += 15; // L: 1369
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) { // L: 1372
				Login.titleboxSprite.drawAt(Login.loginBoxX, 171); // L: 1373
				short var14;
				if (Login.loginIndex == 0) { // L: 1374
					var23 = 251; // L: 1375
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1376
					var24 = var23 + 30; // L: 1377
					var4 = Login.loginBoxX + 180 - 80; // L: 1378
					var14 = 291; // L: 1379
					VarcInt.field1964.drawAt(var4 - 73, var14 - 20); // L: 1380
					var0.drawLines("New User", var4 - 73, var14 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1381
					var4 = Login.loginBoxX + 180 + 80; // L: 1382
					VarcInt.field1964.drawAt(var4 - 73, var14 - 20); // L: 1383
					var0.drawLines("Existing User", var4 - 73, var14 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1384
				} else if (Login.loginIndex == 1) { // L: 1386
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0); // L: 1387
					var23 = 236; // L: 1388
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16777215, 0); // L: 1389
					var24 = var23 + 15; // L: 1390
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16777215, 0); // L: 1391
					var24 += 15; // L: 1392
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16777215, 0); // L: 1393
					var24 += 15; // L: 1394
					var4 = Login.loginBoxX + 180 - 80; // L: 1395
					var14 = 321; // L: 1396
					VarcInt.field1964.drawAt(var4 - 73, var14 - 20); // L: 1397
					var0.drawCentered("Continue", var4, var14 + 5, 16777215, 0); // L: 1398
					var4 = Login.loginBoxX + 180 + 80; // L: 1399
					VarcInt.field1964.drawAt(var4 - 73, var14 - 20); // L: 1400
					var0.drawCentered("Cancel", var4, var14 + 5, 16777215, 0); // L: 1401
				} else if (Login.loginIndex == 2) { // L: 1403
					var23 = 201; // L: 1404
					var0.drawCentered(Login.Login_response1, class379.loginBoxCenter, var23, 16776960, 0); // L: 1405
					var24 = var23 + 15; // L: 1406
					var0.drawCentered(Login.Login_response2, class379.loginBoxCenter, var24, 16776960, 0); // L: 1407
					var24 += 15; // L: 1408
					var0.drawCentered(Login.Login_response3, class379.loginBoxCenter, var24, 16776960, 0); // L: 1409
					var24 += 15; // L: 1410
					var24 += 7; // L: 1411
					var0.draw("Login: ", class379.loginBoxCenter - 110, var24, 16777215, 0); // L: 1412
					var25 = 200; // L: 1413
					if (class91.clientPreferences.method2504()) { // L: 1417
						var8 = Login.Login_username; // L: 1419
						var7 = class92.method2360('*', var8.length()); // L: 1421
						var6 = var7; // L: 1423
					} else {
						var6 = Login.Login_username; // L: 1425
					}

					for (var6 = var6; var0.stringWidth(var6) > var25; var6 = var6.substring(1)) { // L: 1428 1429 1430
					}

					var0.draw(AbstractFont.escapeBrackets(var6) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? Client.colorStartTag(16776960) + "|" : ""), class379.loginBoxCenter - 70, var24, 16777215, 0); // L: 1432
					var24 += 15; // L: 1433
					var8 = Login.Login_password; // L: 1435
					var7 = class92.method2360('*', var8.length()); // L: 1437

					for (var9 = var7; var0.stringWidth(var9) > var25; var9 = var9.substring(1)) { // L: 1439 1440 1441
					}

					var0.draw("Password: " + var9 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? Client.colorStartTag(16776960) + "|" : ""), class379.loginBoxCenter - 108, var24, 16777215, 0); // L: 1443
					var24 += 15; // L: 1444
					var23 = 277; // L: 1445
					int var20 = class379.loginBoxCenter + -117; // L: 1446
					IndexedSprite var21 = ClanSettings.method3307(Client.Login_isUsernameRemembered, Login.field949); // L: 1447
					var21.drawAt(var20, var23); // L: 1448
					var20 = var20 + var21.subWidth + 5; // L: 1449
					var1.draw("Remember username", var20, var23 + 13, 16776960, 0); // L: 1450
					var20 = class379.loginBoxCenter + 24; // L: 1451
					var21 = ClanSettings.method3307(class91.clientPreferences.method2504(), Login.field924); // L: 1452
					var21.drawAt(var20, var23); // L: 1453
					var20 = var20 + var21.subWidth + 5; // L: 1454
					var1.draw("Hide username", var20, var23 + 13, 16776960, 0); // L: 1455
					var24 = var23 + 15; // L: 1456
					int var12 = class379.loginBoxCenter - 80; // L: 1457
					short var13 = 321; // L: 1458
					VarcInt.field1964.drawAt(var12 - 73, var13 - 20); // L: 1459
					var0.drawCentered("Login", var12, var13 + 5, 16777215, 0); // L: 1460
					var12 = class379.loginBoxCenter + 80; // L: 1461
					VarcInt.field1964.drawAt(var12 - 73, var13 - 20); // L: 1462
					var0.drawCentered("Cancel", var12, var13 + 5, 16777215, 0); // L: 1463
					var23 = 357; // L: 1464
					switch(Login.field938) { // L: 1465
					case 2:
						class16.field91 = "Having trouble logging in?"; // L: 1467
						break;
					default:
						class16.field91 = "Can't login? Click here."; // L: 1470
					}

					class481.field4845 = new Bounds(class379.loginBoxCenter, var23, var1.stringWidth(class16.field91), 11); // L: 1473
					Message.field504 = new Bounds(class379.loginBoxCenter, var23, var1.stringWidth("Still having trouble logging in?"), 11); // L: 1474
					var1.drawCentered(class16.field91, class379.loginBoxCenter, var23, 16777215, 0); // L: 1475
				} else if (Login.loginIndex == 3) { // L: 1477
					var23 = 201; // L: 1478
					var0.drawCentered("Incorrect username or password.", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1479
					var24 = var23 + 20; // L: 1480
					var1.drawCentered("If you have upgraded to a Jagex Account, you", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1481
					var24 += 20; // L: 1482
					var1.drawCentered("need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1483
					var24 += 15; // L: 1484
					var4 = Login.loginBoxX + 180; // L: 1485
					var14 = 276; // L: 1486
					VarcInt.field1964.drawAt(var4 - 73, var14 - 20); // L: 1487
					var2.drawCentered("Try again", var4, var14 + 5, 16777215, 0); // L: 1488
					var4 = Login.loginBoxX + 180; // L: 1489
					var14 = 326; // L: 1490
					VarcInt.field1964.drawAt(var4 - 73, var14 - 20); // L: 1491
					var2.drawCentered("Forgotten password?", var4, var14 + 5, 16777215, 0); // L: 1492
				} else {
					String var5;
					if (Login.loginIndex == 4) { // L: 1494
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1495
						var23 = 236; // L: 1496
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16777215, 0); // L: 1497
						var24 = var23 + 15; // L: 1498
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16777215, 0); // L: 1499
						var24 += 15; // L: 1500
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16777215, 0); // L: 1501
						var24 += 15; // L: 1502
						var5 = "PIN: "; // L: 1504
						var7 = class186.otp; // L: 1506
						var6 = class92.method2360('*', var7.length()); // L: 1508
						var0.draw(var5 + var6 + (Client.cycle % 40 < 20 ? Client.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var24, 16777215, 0); // L: 1510
						var24 -= 8; // L: 1511
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var24, 16776960, 0); // L: 1512
						var24 += 15; // L: 1513
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var24, 16776960, 0); // L: 1514
						int var17 = 180 + Login.loginBoxX - 9 + var0.stringWidth("for 30 days: ") + 15; // L: 1515
						int var19 = var24 - var0.ascent; // L: 1516
						IndexedSprite var10;
						if (Login.field951) { // L: 1518
							var10 = class534.field5198; // L: 1519
						} else {
							var10 = class519.field5077; // L: 1522
						}

						var10.drawAt(var17, var19); // L: 1524
						var24 += 15; // L: 1525
						int var11 = Login.loginBoxX + 180 - 80; // L: 1526
						short var26 = 321; // L: 1527
						VarcInt.field1964.drawAt(var11 - 73, var26 - 20); // L: 1528
						var0.drawCentered("Continue", var11, var26 + 5, 16777215, 0); // L: 1529
						var11 = Login.loginBoxX + 180 + 80; // L: 1530
						VarcInt.field1964.drawAt(var11 - 73, var26 - 20); // L: 1531
						var0.drawCentered("Cancel", var11, var26 + 5, 16777215, 0); // L: 1532
						var1.drawCentered("Can't login? Click here.", Login.loginBoxX + 180, var26 + 36, 16777215, 0); // L: 1533
					} else {
						int var16;
						short var28;
						if (Login.loginIndex == 5) { // L: 1535
							var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1536
							var23 = 221; // L: 1537
							var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1538
							var24 = var23 + 15; // L: 1539
							var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1540
							var24 += 15; // L: 1541
							var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1542
							var24 += 15; // L: 1543
							var24 += 14; // L: 1544
							var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var24, 16777215, 0); // L: 1545
							var25 = 174; // L: 1546
							if (class91.clientPreferences.method2504()) { // L: 1550
								var8 = Login.Login_username; // L: 1552
								var7 = class92.method2360('*', var8.length()); // L: 1554
								var6 = var7; // L: 1556
							} else {
								var6 = Login.Login_username; // L: 1558
							}

							for (var6 = var6; var0.stringWidth(var6) > var25; var6 = var6.substring(1)) { // L: 1561 1562 1563
							}

							var0.draw(AbstractFont.escapeBrackets(var6) + (Client.cycle % 40 < 20 ? Client.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var24, 16777215, 0); // L: 1565
							var24 += 15; // L: 1566
							var16 = Login.loginBoxX + 180 - 80; // L: 1567
							var28 = 321; // L: 1568
							VarcInt.field1964.drawAt(var16 - 73, var28 - 20); // L: 1569
							var0.drawCentered("Recover", var16, var28 + 5, 16777215, 0); // L: 1570
							var16 = Login.loginBoxX + 180 + 80; // L: 1571
							VarcInt.field1964.drawAt(var16 - 73, var28 - 20); // L: 1572
							var0.drawCentered("Back", var16, var28 + 5, 16777215, 0); // L: 1573
							var28 = 356; // L: 1574
							var1.drawCentered("Still having trouble logging in?", class379.loginBoxCenter, var28, 268435455, 0); // L: 1575
						} else if (Login.loginIndex == 6) { // L: 1577
							var23 = 201; // L: 1578
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1579
							var24 = var23 + 15; // L: 1580
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1581
							var24 += 15; // L: 1582
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1583
							var24 += 15; // L: 1584
							var4 = Login.loginBoxX + 180; // L: 1585
							var14 = 321; // L: 1586
							VarcInt.field1964.drawAt(var4 - 73, var14 - 20); // L: 1587
							var0.drawCentered("Back", var4, var14 + 5, 16777215, 0); // L: 1588
						} else if (Login.loginIndex == 7) { // L: 1590
							if (MusicPatchNode2.field3427 && !Client.onMobile) { // L: 1591
								var23 = 201; // L: 1592
								var0.drawCentered(Login.Login_response1, class379.loginBoxCenter, var23, 16776960, 0); // L: 1593
								var24 = var23 + 15; // L: 1594
								var0.drawCentered(Login.Login_response2, class379.loginBoxCenter, var24, 16776960, 0); // L: 1595
								var24 += 15; // L: 1596
								var0.drawCentered(Login.Login_response3, class379.loginBoxCenter, var24, 16776960, 0); // L: 1597
								var4 = class379.loginBoxCenter - 150; // L: 1598
								var24 += 10; // L: 1599

								int var27;
								for (var27 = 0; var27 < 8; ++var27) { // L: 1600
									VarcInt.field1964.method9662(var4, var24, 30, 40); // L: 1601
									boolean var18 = var27 == Login.field946 & Client.cycle % 40 < 20; // L: 1602
									var0.draw((Login.field947[var27] == null ? "" : Login.field947[var27]) + (var18 ? Client.colorStartTag(16776960) + "|" : ""), var4 + 10, var24 + 27, 16777215, 0); // L: 1603
									if (var27 != 1 && var27 != 3) { // L: 1604
										var4 += 35; // L: 1609
									} else {
										var4 += 50; // L: 1605
										var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var24 + 27, 16777215, 0); // L: 1606
									}
								}

								var27 = class379.loginBoxCenter - 80; // L: 1612
								short var29 = 321; // L: 1613
								VarcInt.field1964.drawAt(var27 - 73, var29 - 20); // L: 1614
								var0.drawCentered("Submit", var27, var29 + 5, 16777215, 0); // L: 1615
								var27 = class379.loginBoxCenter + 80; // L: 1616
								VarcInt.field1964.drawAt(var27 - 73, var29 - 20); // L: 1617
								var0.drawCentered("Cancel", var27, var29 + 5, 16777215, 0); // L: 1618
							} else {
								var23 = 216; // L: 1621
								var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1622
								var24 = var23 + 15; // L: 1623
								var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1624
								var24 += 15; // L: 1625
								var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1626
								var24 += 15; // L: 1627
								var4 = Login.loginBoxX + 180 - 80; // L: 1628
								var14 = 321; // L: 1629
								VarcInt.field1964.drawAt(var4 - 73, var14 - 20); // L: 1630
								var0.drawCentered("Set Date of Birth", var4, var14 + 5, 16777215, 0); // L: 1631
								var4 = Login.loginBoxX + 180 + 80; // L: 1632
								VarcInt.field1964.drawAt(var4 - 73, var14 - 20); // L: 1633
								var0.drawCentered("Back", var4, var14 + 5, 16777215, 0); // L: 1634
							}
						} else if (Login.loginIndex == 8) { // L: 1637
							var23 = 216; // L: 1638
							var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1639
							var24 = var23 + 15; // L: 1640
							var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1641
							var24 += 15; // L: 1642
							var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1643
							var24 += 15; // L: 1644
							var4 = Login.loginBoxX + 180 - 80; // L: 1645
							var14 = 321; // L: 1646
							VarcInt.field1964.drawAt(var4 - 73, var14 - 20); // L: 1647
							var0.drawCentered("Privacy Policy", var4, var14 + 5, 16777215, 0); // L: 1648
							var4 = Login.loginBoxX + 180 + 80; // L: 1649
							VarcInt.field1964.drawAt(var4 - 73, var14 - 20); // L: 1650
							var0.drawCentered("Back", var4, var14 + 5, 16777215, 0); // L: 1651
						} else if (Login.loginIndex == 9) { // L: 1653
							var23 = 221; // L: 1654
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1655
							var24 = var23 + 25; // L: 1656
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1657
							var24 += 25; // L: 1658
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1659
							var4 = Login.loginBoxX + 180; // L: 1660
							var14 = 311; // L: 1661
							VarcInt.field1964.drawAt(var4 - 73, var14 - 20); // L: 1662
							var0.drawCentered("Try again", var4, var14 + 5, 16777215, 0); // L: 1663
						} else if (Login.loginIndex == 10) { // L: 1665
							var24 = Login.loginBoxX + 180; // L: 1666
							var25 = 209; // L: 1667
							var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var25, 16776960, 0); // L: 1668
							var4 = var25 + 20; // L: 1669
							Login.field929.drawAt(var24 - 109, var4); // L: 1670
							if (Login.field928.isEmpty()) { // L: 1671
								class364.field3941.drawAt(var24 - 48, var4 + 18); // L: 1672
							} else {
								class364.field3941.drawAt(var24 - 48, var4 + 5); // L: 1675
								var0.drawCentered(Login.field928, var24, var4 + 68 - 15, 16776960, 0); // L: 1676
							}
						} else if (Login.loginIndex == 12) { // L: 1679
							var24 = class379.loginBoxCenter; // L: 1680
							var25 = 216; // L: 1681
							var2.drawCentered("Before using this app, please read and accept our", var24, var25, 16777215, 0); // L: 1682
							var4 = var25 + 17; // L: 1683
							var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var24, var4, 16777215, 0); // L: 1684
							var4 += 17; // L: 1685
							var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var24, var4, 16777215, 0); // L: 1686
							var4 += 17; // L: 1687
							var2.drawCentered("By accepting, you agree to these documents.", var24, var4, 16777215, 0); // L: 1688
							var24 = class379.loginBoxCenter - 80; // L: 1689
							var25 = 311; // L: 1690
							VarcInt.field1964.drawAt(var24 - 73, var25 - 20); // L: 1691
							var0.drawCentered("Accept", var24, var25 + 5, 16777215, 0); // L: 1692
							var24 = class379.loginBoxCenter + 80; // L: 1693
							VarcInt.field1964.drawAt(var24 - 73, var25 - 20); // L: 1694
							var0.drawCentered("Decline", var24, var25 + 5, 16777215, 0); // L: 1695
						} else if (Login.loginIndex == 13) { // L: 1697
							var23 = 231; // L: 1698
							var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var23, 16777215, 0); // L: 1699
							var24 = var23 + 20; // L: 1700
							var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var24, 16777215, 0); // L: 1701
							var4 = Login.loginBoxX + 180; // L: 1702
							var23 = 311; // L: 1703
							VarcInt.field1964.drawAt(var4 - 73, var23 - 20); // L: 1704
							var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1705
						} else if (Login.loginIndex == 14) { // L: 1707
							var23 = 201; // L: 1708
							String var15 = ""; // L: 1709
							var5 = ""; // L: 1710
							var6 = ""; // L: 1711
							switch(Login.field937) { // L: 1712
							case 0:
								var15 = "Your account has been involved"; // L: 1729
								var5 = "in serious rule breaking."; // L: 1730
								var6 = ""; // L: 1731
								break; // L: 1732
							case 1:
								var15 = "Your account has been locked due to"; // L: 1722
								var5 = "suspicious activity."; // L: 1723
								var6 = "Please recover your account."; // L: 1724
								break; // L: 1725
							case 2:
								var15 = "The unpaid balance on your account needs"; // L: 1715
								var5 = "to be resolved before you can play."; // L: 1716
								var6 = class366.field4000; // L: 1717
								break;
							default:
								class429.Login_promptCredentials(false); // L: 1736
							}

							var0.drawCentered(var15, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1740
							var24 = var23 + 20; // L: 1741
							var0.drawCentered(var5, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1742
							var24 += 20; // L: 1743
							var0.drawCentered(var6, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1744
							var16 = Login.loginBoxX + 180; // L: 1745
							var28 = 276; // L: 1746
							VarcInt.field1964.drawAt(var16 - 73, var28 - 20); // L: 1747
							if (Login.field937 == 1) { // L: 1748
								var0.drawCentered("Recover Account", var16, var28 + 5, 16777215, 0); // L: 1749
							} else {
								var0.drawCentered("View Appeal Options", var16, var28 + 5, 16777215, 0); // L: 1752
							}

							var16 = Login.loginBoxX + 180; // L: 1754
							var28 = 326; // L: 1755
							VarcInt.field1964.drawAt(var16 - 73, var28 - 20); // L: 1756
							var0.drawCentered("Back", var16, var28 + 5, 16777215, 0); // L: 1757
						} else if (Login.loginIndex == 24) { // L: 1759
							var23 = 221; // L: 1760
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16777215, 0); // L: 1761
							var24 = var23 + 15; // L: 1762
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16777215, 0); // L: 1763
							var24 += 15; // L: 1764
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16777215, 0); // L: 1765
							var24 += 15; // L: 1766
							var4 = Login.loginBoxX + 180; // L: 1767
							var14 = 301; // L: 1768
							VarcInt.field1964.drawAt(var4 - 73, var14 - 20); // L: 1769
							var0.drawCentered("Ok", var4, var14 + 5, 16777215, 0); // L: 1770
						} else if (Login.loginIndex == 32) { // L: 1772
							var23 = 216; // L: 1773
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1774
							var24 = var23 + 15; // L: 1775
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1776
							var24 += 15; // L: 1777
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1778
							var24 += 15; // L: 1779
							var4 = Login.loginBoxX + 180 - 80; // L: 1780
							var14 = 321; // L: 1781
							VarcInt.field1964.drawAt(var4 - 73, var14 - 20); // L: 1782
							var0.drawCentered("Set Date of Birth", var4, var14 + 5, 16777215, 0); // L: 1783
							var4 = Login.loginBoxX + 180 + 80; // L: 1784
							VarcInt.field1964.drawAt(var4 - 73, var14 - 20); // L: 1785
							var0.drawCentered("Back", var4, var14 + 5, 16777215, 0); // L: 1786
						} else if (Login.loginIndex == 33) { // L: 1788
							var23 = 201; // L: 1789
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1790
							var24 = var23 + 20; // L: 1791
							var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1792
							var24 += 20; // L: 1793
							var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1794
							var24 += 15; // L: 1795
							var4 = Login.loginBoxX + 180; // L: 1796
							var14 = 276; // L: 1797
							VarcInt.field1964.drawAt(var4 - 73, var14 - 20); // L: 1798
							var2.drawCentered("Download Launcher", var4, var14 + 5, 16777215, 0); // L: 1799
							var4 = Login.loginBoxX + 180; // L: 1800
							var14 = 326; // L: 1801
							VarcInt.field1964.drawAt(var4 - 73, var14 - 20); // L: 1802
							var2.drawCentered("Back", var4, var14 + 5, 16777215, 0); // L: 1803
						}
					}
				}
			}

			if (Client.gameState >= 10) { // L: 1806
				int[] var22 = new int[4]; // L: 1807
				Rasterizer2D.Rasterizer2D_getClipArray(var22); // L: 1808
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class491.canvasHeight); // L: 1809
				class544.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle); // L: 1810
				class544.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle); // L: 1811
				Rasterizer2D.Rasterizer2D_setClipArray(var22); // L: 1812
			}

			Login.title_muteSprite[class91.clientPreferences.method2503() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463); // L: 1814
			if (Client.gameState > 5 && Language.Language_EN == WorldMapLabelSize.clientLanguage) { // L: 1815
				if (Varcs.field1405 != null) { // L: 1816
					var24 = Login.xPadding + 5; // L: 1817
					var25 = 463; // L: 1818
					byte var31 = 100; // L: 1819
					byte var30 = 35; // L: 1820
					Varcs.field1405.drawAt(var24, var25); // L: 1821
					var0.drawCentered("World" + " " + Client.worldId, var31 / 2 + var24, var30 / 2 + var25 - 2, 16777215, 0); // L: 1822
					if (class91.World_request != null) { // L: 1823
						var1.drawCentered("Loading...", var31 / 2 + var24, var30 / 2 + var25 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var31 / 2 + var24, var30 / 2 + var25 + 12, 16777215, 0); // L: 1824
					}
				} else {
					Varcs.field1405 = class167.SpriteBuffer_getIndexedSpriteByName(class199.field2010, "sl_button", ""); // L: 1827
				}
			}

		}
	} // L: 1311 1830
}
