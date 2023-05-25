import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aq")
public enum class6 implements class356 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Laq;"
	)
	field17(0, 0);

	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1098467785
	)
	final int field18;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -754086667
	)
	final int field16;

	class6(int var3, int var4) {
		this.field18 = var3; // L: 12
		this.field16 = var4; // L: 13
	} // L: 14

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "741942848"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field16; // L: 18
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1788010106"
	)
	static int method46() {
		return Rasterizer3D.field2514.field2797; // L: 126
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1620071571"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		if (!ScriptFrame.client.method1431() && !ScriptFrame.client.isOtlTokenRequesterInitialized() && !ScriptFrame.client.method1234()) { // L: 1384
			Login.Login_response1 = ""; // L: 1388
			Login.Login_response2 = "Enter your username/email & password."; // L: 1389
			Login.Login_response3 = ""; // L: 1390
			class129.method3124(2); // L: 1391
			if (var0) {
				Login.Login_password = ""; // L: 1392
			}

			DecorativeObject.method5025(); // L: 1393
			if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 1395
				Login.currentLoginField = 1; // L: 1396
			} else {
				Login.currentLoginField = 0; // L: 1399
			}

		} else {
			class129.method3124(10); // L: 1385
		}
	} // L: 1386 1402

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lon;Lon;Lon;I)V",
		garbageValue = "-1602531743"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (GameEngine.canvasWidth - 765) / 2; // L: 1431
		Login.loginBoxX = Login.xPadding + 202; // L: 1432
		class143.loginBoxCenter = Login.loginBoxX + 180; // L: 1433
		if (Login.worldSelectOpen) { // L: 1434
			Decimator.method1127(var0, var1); // L: 1435
		} else {
			class123.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1438
			ParamComposition.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1439
			Canvas.logoSprite.drawAt(Login.xPadding + 382 - Canvas.logoSprite.subWidth / 2, 18); // L: 1440
			int var4;
			if (Client.gameState == 0 || Client.gameState == 5) { // L: 1441
				byte var3 = 20; // L: 1442
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1); // L: 1443
				var4 = 253 - var3; // L: 1444
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409); // L: 1445
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0); // L: 1446
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409); // L: 1447
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150 + Login.Login_loadingPercent * 3, var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0); // L: 1448
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1); // L: 1449
			}

			String var5;
			String var6;
			short var22;
			int var23;
			short var24;
			if (Client.gameState == 20) { // L: 1451
				Login.titleboxSprite.drawAt(Login.loginBoxX + 180 - Login.titleboxSprite.subWidth / 2, 271 - Login.titleboxSprite.subHeight / 2); // L: 1452
				var22 = 201; // L: 1453
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16776960, 0); // L: 1454
				var23 = var22 + 15; // L: 1455
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1456
				var23 += 15; // L: 1457
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1458
				var23 += 15; // L: 1459
				var23 += 7; // L: 1460
				if (Login.loginIndex != 4 && Login.loginIndex != 10) { // L: 1461
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var23, 16777215, 0); // L: 1462
					var24 = 200; // L: 1463

					for (var5 = class18.method287(); var0.stringWidth(var5) > var24; var5 = var5.substring(0, var5.length() - 1)) { // L: 1464 1465 1466
					}

					var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var23, 16777215, 0); // L: 1468
					var23 += 15; // L: 1469

					for (var6 = WorldMapDecorationType.method6573(Login.Login_password); var0.stringWidth(var6) > var24; var6 = var6.substring(1)) { // L: 1470 1471 1472
					}

					var0.draw("Password: " + var6, Login.loginBoxX + 180 - 108, var23, 16777215, 0); // L: 1474
					var23 += 15; // L: 1475
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) { // L: 1478
				Login.titleboxSprite.drawAt(Login.loginBoxX, 171); // L: 1479
				short var17;
				if (Login.loginIndex == 0) { // L: 1480
					var22 = 251; // L: 1481
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var22, 16776960, 0); // L: 1482
					var23 = var22 + 30; // L: 1483
					var4 = Login.loginBoxX + 180 - 80; // L: 1484
					var17 = 291; // L: 1485
					class292.field3361.drawAt(var4 - 73, var17 - 20); // L: 1486
					var0.drawLines("New User", var4 - 73, var17 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1487
					var4 = Login.loginBoxX + 180 + 80; // L: 1488
					class292.field3361.drawAt(var4 - 73, var17 - 20); // L: 1489
					var0.drawLines("Existing User", var4 - 73, var17 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1490
				} else if (Login.loginIndex == 1) { // L: 1492
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0); // L: 1493
					var22 = 236; // L: 1494
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16777215, 0); // L: 1495
					var23 = var22 + 15; // L: 1496
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16777215, 0); // L: 1497
					var23 += 15; // L: 1498
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16777215, 0); // L: 1499
					var23 += 15; // L: 1500
					var4 = Login.loginBoxX + 180 - 80; // L: 1501
					var17 = 321; // L: 1502
					class292.field3361.drawAt(var4 - 73, var17 - 20); // L: 1503
					var0.drawCentered("Continue", var4, var17 + 5, 16777215, 0); // L: 1504
					var4 = Login.loginBoxX + 180 + 80; // L: 1505
					class292.field3361.drawAt(var4 - 73, var17 - 20); // L: 1506
					var0.drawCentered("Cancel", var4, var17 + 5, 16777215, 0); // L: 1507
				} else {
					int var7;
					if (Login.loginIndex == 2) { // L: 1509
						var22 = 201; // L: 1510
						var0.drawCentered(Login.Login_response1, class143.loginBoxCenter, var22, 16776960, 0); // L: 1511
						var23 = var22 + 15; // L: 1512
						var0.drawCentered(Login.Login_response2, class143.loginBoxCenter, var23, 16776960, 0); // L: 1513
						var23 += 15; // L: 1514
						var0.drawCentered(Login.Login_response3, class143.loginBoxCenter, var23, 16776960, 0); // L: 1515
						var23 += 15; // L: 1516
						var23 += 7; // L: 1517
						var0.draw("Login: ", class143.loginBoxCenter - 110, var23, 16777215, 0); // L: 1518
						var24 = 200; // L: 1519

						for (var5 = class18.method287(); var0.stringWidth(var5) > var24; var5 = var5.substring(1)) { // L: 1520 1521 1522
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? class383.colorStartTag(16776960) + "|" : ""), class143.loginBoxCenter - 70, var23, 16777215, 0); // L: 1524
						var23 += 15; // L: 1525

						for (var6 = WorldMapDecorationType.method6573(Login.Login_password); var0.stringWidth(var6) > var24; var6 = var6.substring(1)) { // L: 1526 1527 1528
						}

						var0.draw("Password: " + var6 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? class383.colorStartTag(16776960) + "|" : ""), class143.loginBoxCenter - 108, var23, 16777215, 0); // L: 1530
						var23 += 15; // L: 1531
						var22 = 277; // L: 1532
						var7 = class143.loginBoxCenter + -117; // L: 1533
						boolean var9 = Client.Login_isUsernameRemembered; // L: 1535
						boolean var10 = Login.field890; // L: 1536
						IndexedSprite var20 = var9 ? (var10 ? Login.field907 : class158.field1766) : (var10 ? Login.field893 : Login.field892); // L: 1538
						var20.drawAt(var7, var22); // L: 1541
						var7 = var7 + var20.subWidth + 5; // L: 1542
						var1.draw("Remember username", var7, var22 + 13, 16776960, 0); // L: 1543
						var7 = class143.loginBoxCenter + 24; // L: 1544
						boolean var13 = class20.clientPreferences.method2450(); // L: 1546
						boolean var14 = Login.field902; // L: 1547
						IndexedSprite var12 = var13 ? (var14 ? Login.field907 : class158.field1766) : (var14 ? Login.field893 : Login.field892); // L: 1549
						var12.drawAt(var7, var22); // L: 1552
						var7 = var7 + var12.subWidth + 5; // L: 1553
						var1.draw("Hide username", var7, var22 + 13, 16776960, 0); // L: 1554
						var23 = var22 + 15; // L: 1555
						int var15 = class143.loginBoxCenter - 80; // L: 1556
						short var16 = 321; // L: 1557
						class292.field3361.drawAt(var15 - 73, var16 - 20); // L: 1558
						var0.drawCentered("Login", var15, var16 + 5, 16777215, 0); // L: 1559
						var15 = class143.loginBoxCenter + 80; // L: 1560
						class292.field3361.drawAt(var15 - 73, var16 - 20); // L: 1561
						var0.drawCentered("Cancel", var15, var16 + 5, 16777215, 0); // L: 1562
						var22 = 357; // L: 1563
						switch(Login.field916) { // L: 1564
						case 2:
							class18.field97 = "Having trouble logging in?"; // L: 1569
							break;
						default:
							class18.field97 = "Can't login? Click here."; // L: 1566
						}

						class96.field1295 = new Bounds(class143.loginBoxCenter, var22, var1.stringWidth(class18.field97), 11); // L: 1572
						class19.field103 = new Bounds(class143.loginBoxCenter, var22, var1.stringWidth("Still having trouble logging in?"), 11); // L: 1573
						var1.drawCentered(class18.field97, class143.loginBoxCenter, var22, 16777215, 0); // L: 1574
					} else if (Login.loginIndex == 3) { // L: 1576
						var22 = 201; // L: 1577
						var0.drawCentered("Incorrect username or password.", Login.loginBoxX + 180, var22, 16776960, 0); // L: 1578
						var23 = var22 + 20; // L: 1579
						var1.drawCentered("If you have upgraded to a Jagex Account, you", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1580
						var23 += 20; // L: 1581
						var1.drawCentered("need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1582
						var23 += 15; // L: 1583
						var4 = Login.loginBoxX + 180; // L: 1584
						var17 = 276; // L: 1585
						class292.field3361.drawAt(var4 - 73, var17 - 20); // L: 1586
						var2.drawCentered("Try again", var4, var17 + 5, 16777215, 0); // L: 1587
						var4 = Login.loginBoxX + 180; // L: 1588
						var17 = 326; // L: 1589
						class292.field3361.drawAt(var4 - 73, var17 - 20); // L: 1590
						var2.drawCentered("Forgotten password?", var4, var17 + 5, 16777215, 0); // L: 1591
					} else {
						short var8;
						int var27;
						if (Login.loginIndex == 4) { // L: 1593
							var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1594
							var22 = 236; // L: 1595
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16777215, 0); // L: 1596
							var23 = var22 + 15; // L: 1597
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16777215, 0); // L: 1598
							var23 += 15; // L: 1599
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16777215, 0); // L: 1600
							var23 += 15; // L: 1601
							var0.draw("PIN: " + WorldMapDecorationType.method6573(Messages.otp) + (Client.cycle % 40 < 20 ? class383.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var23, 16777215, 0); // L: 1602
							var23 -= 8; // L: 1603
							var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var23, 16776960, 0); // L: 1604
							var23 += 15; // L: 1605
							var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var23, 16776960, 0); // L: 1606
							var4 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15; // L: 1607
							var27 = var23 - var0.ascent; // L: 1608
							IndexedSprite var25;
							if (Login.field914) { // L: 1610
								var25 = class158.field1766; // L: 1611
							} else {
								var25 = Login.field892; // L: 1614
							}

							var25.drawAt(var4, var27); // L: 1616
							var23 += 15; // L: 1617
							var7 = Login.loginBoxX + 180 - 80; // L: 1618
							var8 = 321; // L: 1619
							class292.field3361.drawAt(var7 - 73, var8 - 20); // L: 1620
							var0.drawCentered("Continue", var7, var8 + 5, 16777215, 0); // L: 1621
							var7 = Login.loginBoxX + 180 + 80; // L: 1622
							class292.field3361.drawAt(var7 - 73, var8 - 20); // L: 1623
							var0.drawCentered("Cancel", var7, var8 + 5, 16777215, 0); // L: 1624
							var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var8 + 36, 255, 0); // L: 1625
						} else if (Login.loginIndex == 5) { // L: 1627
							var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1628
							var22 = 221; // L: 1629
							var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16776960, 0); // L: 1630
							var23 = var22 + 15; // L: 1631
							var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1632
							var23 += 15; // L: 1633
							var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1634
							var23 += 15; // L: 1635
							var23 += 14; // L: 1636
							var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var23, 16777215, 0); // L: 1637
							var24 = 174; // L: 1638

							for (var5 = class18.method287(); var0.stringWidth(var5) > var24; var5 = var5.substring(1)) { // L: 1639 1640 1641
							}

							var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? class383.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var23, 16777215, 0); // L: 1643
							var23 += 15; // L: 1644
							int var19 = Login.loginBoxX + 180 - 80; // L: 1645
							short var26 = 321; // L: 1646
							class292.field3361.drawAt(var19 - 73, var26 - 20); // L: 1647
							var0.drawCentered("Recover", var19, var26 + 5, 16777215, 0); // L: 1648
							var19 = Login.loginBoxX + 180 + 80; // L: 1649
							class292.field3361.drawAt(var19 - 73, var26 - 20); // L: 1650
							var0.drawCentered("Back", var19, var26 + 5, 16777215, 0); // L: 1651
							var26 = 356; // L: 1652
							var1.drawCentered("Still having trouble logging in?", class143.loginBoxCenter, var26, 268435455, 0); // L: 1653
						} else if (Login.loginIndex == 6) { // L: 1655
							var22 = 201; // L: 1656
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16776960, 0); // L: 1657
							var23 = var22 + 15; // L: 1658
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1659
							var23 += 15; // L: 1660
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1661
							var23 += 15; // L: 1662
							var4 = Login.loginBoxX + 180; // L: 1663
							var17 = 321; // L: 1664
							class292.field3361.drawAt(var4 - 73, var17 - 20); // L: 1665
							var0.drawCentered("Back", var4, var17 + 5, 16777215, 0); // L: 1666
						} else if (Login.loginIndex == 7) { // L: 1668
							if (WorldMapSectionType.field2983 && !Client.onMobile) { // L: 1669
								var22 = 201; // L: 1670
								var0.drawCentered(Login.Login_response1, class143.loginBoxCenter, var22, 16776960, 0); // L: 1671
								var23 = var22 + 15; // L: 1672
								var0.drawCentered(Login.Login_response2, class143.loginBoxCenter, var23, 16776960, 0); // L: 1673
								var23 += 15; // L: 1674
								var0.drawCentered(Login.Login_response3, class143.loginBoxCenter, var23, 16776960, 0); // L: 1675
								var4 = class143.loginBoxCenter - 150; // L: 1676
								var23 += 10; // L: 1677

								for (var27 = 0; var27 < 8; ++var27) { // L: 1678
									class292.field3361.method9492(var4, var23, 30, 40); // L: 1679
									boolean var28 = var27 == Login.field909 & Client.cycle % 40 < 20; // L: 1680
									var0.draw((Login.field910[var27] == null ? "" : Login.field910[var27]) + (var28 ? class383.colorStartTag(16776960) + "|" : ""), var4 + 10, var23 + 27, 16777215, 0); // L: 1681
									if (var27 != 1 && var27 != 3) { // L: 1682
										var4 += 35; // L: 1687
									} else {
										var4 += 50; // L: 1683
										var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var23 + 27, 16777215, 0); // L: 1684
									}
								}

								var27 = class143.loginBoxCenter - 80; // L: 1690
								short var29 = 321; // L: 1691
								class292.field3361.drawAt(var27 - 73, var29 - 20); // L: 1692
								var0.drawCentered("Submit", var27, var29 + 5, 16777215, 0); // L: 1693
								var27 = class143.loginBoxCenter + 80; // L: 1694
								class292.field3361.drawAt(var27 - 73, var29 - 20); // L: 1695
								var0.drawCentered("Cancel", var27, var29 + 5, 16777215, 0); // L: 1696
							} else {
								var22 = 216; // L: 1699
								var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var22, 16776960, 0); // L: 1700
								var23 = var22 + 15; // L: 1701
								var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1702
								var23 += 15; // L: 1703
								var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1704
								var23 += 15; // L: 1705
								var4 = Login.loginBoxX + 180 - 80; // L: 1706
								var17 = 321; // L: 1707
								class292.field3361.drawAt(var4 - 73, var17 - 20); // L: 1708
								var0.drawCentered("Set Date of Birth", var4, var17 + 5, 16777215, 0); // L: 1709
								var4 = Login.loginBoxX + 180 + 80; // L: 1710
								class292.field3361.drawAt(var4 - 73, var17 - 20); // L: 1711
								var0.drawCentered("Back", var4, var17 + 5, 16777215, 0); // L: 1712
							}
						} else if (Login.loginIndex == 8) { // L: 1715
							var22 = 216; // L: 1716
							var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var22, 16776960, 0); // L: 1717
							var23 = var22 + 15; // L: 1718
							var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1719
							var23 += 15; // L: 1720
							var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1721
							var23 += 15; // L: 1722
							var4 = Login.loginBoxX + 180 - 80; // L: 1723
							var17 = 321; // L: 1724
							class292.field3361.drawAt(var4 - 73, var17 - 20); // L: 1725
							var0.drawCentered("Privacy Policy", var4, var17 + 5, 16777215, 0); // L: 1726
							var4 = Login.loginBoxX + 180 + 80; // L: 1727
							class292.field3361.drawAt(var4 - 73, var17 - 20); // L: 1728
							var0.drawCentered("Back", var4, var17 + 5, 16777215, 0); // L: 1729
						} else if (Login.loginIndex == 9) { // L: 1731
							var22 = 221; // L: 1732
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16776960, 0); // L: 1733
							var23 = var22 + 25; // L: 1734
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1735
							var23 += 25; // L: 1736
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1737
							var4 = Login.loginBoxX + 180; // L: 1738
							var17 = 311; // L: 1739
							class292.field3361.drawAt(var4 - 73, var17 - 20); // L: 1740
							var0.drawCentered("Try again", var4, var17 + 5, 16777215, 0); // L: 1741
						} else if (Login.loginIndex == 10) { // L: 1743
							var23 = Login.loginBoxX + 180; // L: 1744
							var24 = 209; // L: 1745
							var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1746
							var4 = var24 + 20; // L: 1747
							class439.field4717.drawAt(var23 - 109, var4); // L: 1748
							if (Login.field911.isEmpty()) { // L: 1749
								class376.field4398.drawAt(var23 - 48, var4 + 18); // L: 1750
							} else {
								class376.field4398.drawAt(var23 - 48, var4 + 5); // L: 1753
								var0.drawCentered(Login.field911, var23, var4 + 68 - 15, 16776960, 0); // L: 1754
							}
						} else if (Login.loginIndex == 12) { // L: 1757
							var23 = class143.loginBoxCenter; // L: 1758
							var24 = 216; // L: 1759
							var2.drawCentered("Before using this app, please read and accept our", var23, var24, 16777215, 0); // L: 1760
							var4 = var24 + 17; // L: 1761
							var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var23, var4, 16777215, 0); // L: 1762
							var4 += 17; // L: 1763
							var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var23, var4, 16777215, 0); // L: 1764
							var4 += 17; // L: 1765
							var2.drawCentered("By accepting, you agree to these documents.", var23, var4, 16777215, 0); // L: 1766
							var23 = class143.loginBoxCenter - 80; // L: 1767
							var24 = 311; // L: 1768
							class292.field3361.drawAt(var23 - 73, var24 - 20); // L: 1769
							var0.drawCentered("Accept", var23, var24 + 5, 16777215, 0); // L: 1770
							var23 = class143.loginBoxCenter + 80; // L: 1771
							class292.field3361.drawAt(var23 - 73, var24 - 20); // L: 1772
							var0.drawCentered("Decline", var23, var24 + 5, 16777215, 0); // L: 1773
						} else if (Login.loginIndex == 13) { // L: 1775
							var22 = 231; // L: 1776
							var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var22, 16777215, 0); // L: 1777
							var23 = var22 + 20; // L: 1778
							var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var23, 16777215, 0); // L: 1779
							var4 = Login.loginBoxX + 180; // L: 1780
							var22 = 311; // L: 1781
							class292.field3361.drawAt(var4 - 73, var22 - 20); // L: 1782
							var0.drawCentered("Back", var4, var22 + 5, 16777215, 0); // L: 1783
						} else if (Login.loginIndex == 14) { // L: 1785
							var22 = 201; // L: 1786
							String var18 = ""; // L: 1787
							var5 = ""; // L: 1788
							var6 = ""; // L: 1789
							switch(Login.field898) { // L: 1790
							case 0:
								var18 = "Your account has been involved"; // L: 1812
								var5 = "in serious rule breaking."; // L: 1813
								var6 = ""; // L: 1814
								break;
							case 1:
								var18 = "Your account has been locked due to"; // L: 1805
								var5 = "suspicious activity."; // L: 1806
								var6 = "Please recover your account."; // L: 1807
								break; // L: 1808
							case 2:
								var18 = "The unpaid balance on your account needs"; // L: 1793
								var5 = "to be resolved before you can play."; // L: 1794
								var6 = Strings.field3967; // L: 1795
								break;
							default:
								Login_promptCredentials(false); // L: 1800
							}

							var0.drawCentered(var18, Login.loginBoxX + 180, var22, 16776960, 0); // L: 1818
							var23 = var22 + 20; // L: 1819
							var0.drawCentered(var5, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1820
							var23 += 20; // L: 1821
							var0.drawCentered(var6, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1822
							var7 = Login.loginBoxX + 180; // L: 1823
							var8 = 276; // L: 1824
							class292.field3361.drawAt(var7 - 73, var8 - 20); // L: 1825
							if (Login.field898 == 1) { // L: 1826
								var0.drawCentered("Recover Account", var7, var8 + 5, 16777215, 0); // L: 1827
							} else {
								var0.drawCentered("View Appeal Options", var7, var8 + 5, 16777215, 0); // L: 1830
							}

							var7 = Login.loginBoxX + 180; // L: 1832
							var8 = 326; // L: 1833
							class292.field3361.drawAt(var7 - 73, var8 - 20); // L: 1834
							var0.drawCentered("Back", var7, var8 + 5, 16777215, 0); // L: 1835
						} else if (Login.loginIndex == 24) { // L: 1837
							var22 = 221; // L: 1838
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16777215, 0); // L: 1839
							var23 = var22 + 15; // L: 1840
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16777215, 0); // L: 1841
							var23 += 15; // L: 1842
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16777215, 0); // L: 1843
							var23 += 15; // L: 1844
							var4 = Login.loginBoxX + 180; // L: 1845
							var17 = 301; // L: 1846
							class292.field3361.drawAt(var4 - 73, var17 - 20); // L: 1847
							var0.drawCentered("Ok", var4, var17 + 5, 16777215, 0); // L: 1848
						} else if (Login.loginIndex == 32) { // L: 1850
							var22 = 216; // L: 1851
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var22, 16776960, 0); // L: 1852
							var23 = var22 + 15; // L: 1853
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1854
							var23 += 15; // L: 1855
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1856
							var23 += 15; // L: 1857
							var4 = Login.loginBoxX + 180 - 80; // L: 1858
							var17 = 321; // L: 1859
							class292.field3361.drawAt(var4 - 73, var17 - 20); // L: 1860
							var0.drawCentered("Set Date of Birth", var4, var17 + 5, 16777215, 0); // L: 1861
							var4 = Login.loginBoxX + 180 + 80; // L: 1862
							class292.field3361.drawAt(var4 - 73, var17 - 20); // L: 1863
							var0.drawCentered("Back", var4, var17 + 5, 16777215, 0); // L: 1864
						} else if (Login.loginIndex == 33) { // L: 1866
							var22 = 201; // L: 1867
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16776960, 0); // L: 1868
							var23 = var22 + 20; // L: 1869
							var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1870
							var23 += 20; // L: 1871
							var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1872
							var23 += 15; // L: 1873
							var4 = Login.loginBoxX + 180; // L: 1874
							var17 = 276; // L: 1875
							class292.field3361.drawAt(var4 - 73, var17 - 20); // L: 1876
							var2.drawCentered("Download Launcher", var4, var17 + 5, 16777215, 0); // L: 1877
							var4 = Login.loginBoxX + 180; // L: 1878
							var17 = 326; // L: 1879
							class292.field3361.drawAt(var4 - 73, var17 - 20); // L: 1880
							var2.drawCentered("Back", var4, var17 + 5, 16777215, 0); // L: 1881
						}
					}
				}
			}

			if (Client.gameState >= 10) { // L: 1884
				int[] var21 = new int[4]; // L: 1885
				Rasterizer2D.Rasterizer2D_getClipArray(var21); // L: 1886
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class262.canvasHeight); // L: 1887
				class121.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle); // L: 1888
				class121.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle); // L: 1889
				Rasterizer2D.Rasterizer2D_setClipArray(var21); // L: 1890
			}

			class148.title_muteSprite[class20.clientPreferences.method2534() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463); // L: 1892
			if (Client.gameState > 5 && Language.Language_EN == ClanSettings.clientLanguage) { // L: 1893
				if (class319.field3726 != null) { // L: 1894
					var23 = Login.xPadding + 5; // L: 1895
					var24 = 463; // L: 1896
					byte var31 = 100; // L: 1897
					byte var30 = 35; // L: 1898
					class319.field3726.drawAt(var23, var24); // L: 1899
					var0.drawCentered("World" + " " + Client.worldId, var31 / 2 + var23, var30 / 2 + var24 - 2, 16777215, 0); // L: 1900
					if (class11.World_request != null) { // L: 1901
						var1.drawCentered("Loading...", var31 / 2 + var23, var30 / 2 + var24 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var31 / 2 + var23, var30 / 2 + var24 + 12, 16777215, 0); // L: 1902
					}
				} else {
					class319.field3726 = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(class452.archive8, "sl_button", ""); // L: 1905
				}
			}

		}
	} // L: 1436 1908
}
