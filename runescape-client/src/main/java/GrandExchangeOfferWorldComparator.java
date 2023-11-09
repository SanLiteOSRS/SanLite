import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nc")
@Implements("GrandExchangeOfferWorldComparator")
final class GrandExchangeOfferWorldComparator implements Comparator {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Loe;Loe;B)I",
		garbageValue = "1"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.world < var2.world ? -1 : (var2.world == var1.world ? 0 : 1); // L: 28
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 32
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 36
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpa;Lpa;Lpa;B)V",
		garbageValue = "18"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (class10.canvasWidth - 765) / 2; // L: 1444
		Login.loginBoxX = Login.xPadding + 202; // L: 1445
		class153.loginBoxCenter = Login.loginBoxX + 180; // L: 1446
		byte var3;
		int var4;
		int var8;
		boolean var15;
		int var16;
		int var25;
		int var33;
		int var43;
		if (Login.worldSelectOpen) { // L: 1447
			if (class12.worldSelectBackSprites == null) { // L: 1449
				class12.worldSelectBackSprites = SoundSystem.method835(GameBuild.archive8, "sl_back", "");
			}

			Archive var44;
			int var47;
			IndexedSprite[] var48;
			if (class294.worldSelectFlagSprites == null) { // L: 1450
				var44 = GameBuild.archive8; // L: 1452
				if (!var44.isValidFileName("sl_flags", "")) { // L: 1454
					var48 = null; // L: 1455
				} else {
					var43 = var44.getGroupId("sl_flags"); // L: 1458
					var47 = var44.getFileId(var43, ""); // L: 1459
					var48 = MouseRecorder.method2253(var44, var43, var47); // L: 1460
				}

				class294.worldSelectFlagSprites = var48; // L: 1462
			}

			if (class148.worldSelectArrows == null) { // L: 1464
				var44 = GameBuild.archive8; // L: 1466
				if (!var44.isValidFileName("sl_arrows", "")) { // L: 1468
					var48 = null; // L: 1469
				} else {
					var43 = var44.getGroupId("sl_arrows"); // L: 1472
					var47 = var44.getFileId(var43, ""); // L: 1473
					var48 = MouseRecorder.method2253(var44, var43, var47); // L: 1474
				}

				class148.worldSelectArrows = var48; // L: 1476
			}

			if (FontName.worldSelectStars == null) { // L: 1478
				FontName.worldSelectStars = FloorOverlayDefinition.method3986(GameBuild.archive8, "sl_stars", "");
			}

			if (FloorUnderlayDefinition.worldSelectLeftSprite == null) { // L: 1479
				FloorUnderlayDefinition.worldSelectLeftSprite = class512.SpriteBuffer_getIndexedSpriteByName(GameBuild.archive8, "leftarrow", "");
			}

			if (Tiles.worldSelectRightSprite == null) { // L: 1480
				Tiles.worldSelectRightSprite = class512.SpriteBuffer_getIndexedSpriteByName(GameBuild.archive8, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0); // L: 1481
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624); // L: 1482
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513); // L: 1483
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1); // L: 1484
			if (FontName.worldSelectStars != null) { // L: 1485
				FontName.worldSelectStars[1].drawAt(Login.xPadding + 140, 1); // L: 1486
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1); // L: 1487
				FontName.worldSelectStars[0].drawAt(Login.xPadding + 140, 12); // L: 1488
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1); // L: 1489
			}

			if (class148.worldSelectArrows != null) { // L: 1491
				var33 = Login.xPadding + 280; // L: 1492
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) { // L: 1493
					class148.worldSelectArrows[2].drawAt(var33, 4);
				} else {
					class148.worldSelectArrows[0].drawAt(var33, 4); // L: 1494
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) { // L: 1495
					class148.worldSelectArrows[3].drawAt(var33 + 15, 4);
				} else {
					class148.worldSelectArrows[1].drawAt(var33 + 15, 4); // L: 1496
				}

				var0.draw("World", var33 + 32, 17, 16777215, -1); // L: 1497
				var4 = Login.xPadding + 390; // L: 1498
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) { // L: 1499
					class148.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					class148.worldSelectArrows[0].drawAt(var4, 4); // L: 1500
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) { // L: 1501
					class148.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					class148.worldSelectArrows[1].drawAt(var4 + 15, 4); // L: 1502
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1); // L: 1503
				var43 = Login.xPadding + 500; // L: 1504
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) { // L: 1505
					class148.worldSelectArrows[2].drawAt(var43, 4);
				} else {
					class148.worldSelectArrows[0].drawAt(var43, 4); // L: 1506
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) { // L: 1507
					class148.worldSelectArrows[3].drawAt(var43 + 15, 4);
				} else {
					class148.worldSelectArrows[1].drawAt(var43 + 15, 4); // L: 1508
				}

				var0.draw("Location", var43 + 32, 17, 16777215, -1); // L: 1509
				var47 = Login.xPadding + 610; // L: 1510
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) { // L: 1511
					class148.worldSelectArrows[2].drawAt(var47, 4);
				} else {
					class148.worldSelectArrows[0].drawAt(var47, 4); // L: 1512
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) { // L: 1513
					class148.worldSelectArrows[3].drawAt(var47 + 15, 4);
				} else {
					class148.worldSelectArrows[1].drawAt(var47 + 15, 4); // L: 1514
				}

				var0.draw("Type", var47 + 32, 17, 16777215, -1); // L: 1515
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0); // L: 1517
			var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1); // L: 1518
			Login.hoveredWorldIndex = -1; // L: 1519
			if (class12.worldSelectBackSprites != null) { // L: 1520
				var3 = 88; // L: 1521
				byte var40 = 19; // L: 1522
				var43 = 765 / (var3 + 1) - 1; // L: 1523
				var47 = 480 / (var40 + 1); // L: 1524

				do {
					var25 = var47; // L: 1526
					var8 = var43; // L: 1527
					if (var47 * (var43 - 1) >= World.World_count) { // L: 1528
						--var43;
					}

					if (var43 * (var47 - 1) >= World.World_count) { // L: 1529
						--var47;
					}

					if (var43 * (var47 - 1) >= World.World_count) { // L: 1530
						--var47;
					}
				} while(var47 != var25 || var43 != var8); // L: 1531

				var25 = (765 - var3 * var43) / (var43 + 1); // L: 1533
				if (var25 > 5) { // L: 1534
					var25 = 5;
				}

				var8 = (480 - var47 * var40) / (var47 + 1); // L: 1535
				if (var8 > 5) { // L: 1536
					var8 = 5;
				}

				int var28 = (765 - var43 * var3 - var25 * (var43 - 1)) / 2; // L: 1537
				int var37 = (480 - var47 * var40 - var8 * (var47 - 1)) / 2; // L: 1538
				int var38 = (var47 + World.World_count - 1) / var47; // L: 1539
				Login.worldSelectPagesCount = var38 - var43; // L: 1540
				if (FloorUnderlayDefinition.worldSelectLeftSprite != null && Login.worldSelectPage > 0) { // L: 1541
					FloorUnderlayDefinition.worldSelectLeftSprite.drawAt(8, class11.canvasHeight / 2 - FloorUnderlayDefinition.worldSelectLeftSprite.subHeight / 2); // L: 1542
				}

				if (Tiles.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) { // L: 1544
					Tiles.worldSelectRightSprite.drawAt(class10.canvasWidth - Tiles.worldSelectRightSprite.subWidth - 8, class11.canvasHeight / 2 - Tiles.worldSelectRightSprite.subHeight / 2); // L: 1545
				}

				int var29 = var37 + 23; // L: 1547
				int var30 = var28 + Login.xPadding; // L: 1548
				int var39 = 0; // L: 1549
				var15 = false; // L: 1550
				var16 = Login.worldSelectPage; // L: 1551

				int var41;
				for (var41 = var47 * var16; var41 < World.World_count && var16 - Login.worldSelectPage < var43; ++var41) { // L: 1552 1553
					World var18 = class20.World_worlds[var41]; // L: 1556
					boolean var19 = true; // L: 1557
					String var20 = Integer.toString(var18.population); // L: 1558
					if (var18.population == -1) { // L: 1559
						var20 = "OFF"; // L: 1560
						var19 = false; // L: 1561
					} else if (var18.population > 1980) { // L: 1563
						var20 = "FULL"; // L: 1564
						var19 = false; // L: 1565
					}

					class107 var21 = null; // L: 1567
					int var22 = 0; // L: 1568
					if (var18.isBeta()) { // L: 1569
						var21 = var18.isMembersOnly() ? class107.field1352 : class107.field1346; // L: 1570
					} else if (var18.isDeadman()) { // L: 1572
						var21 = var18.isMembersOnly() ? class107.field1356 : class107.field1359; // L: 1573
					} else if (var18.method1776()) { // L: 1575
						var22 = 16711680; // L: 1576
						var21 = var18.isMembersOnly() ? class107.field1350 : class107.field1349; // L: 1577
					} else if (var18.method1778()) { // L: 1579
						var21 = var18.isMembersOnly() ? class107.field1354 : class107.field1353; // L: 1580
					} else if (var18.isPvp()) { // L: 1582
						var21 = var18.isMembersOnly() ? class107.field1348 : class107.field1347; // L: 1583
					} else if (var18.method1775()) { // L: 1585
						var21 = var18.isMembersOnly() ? class107.field1345 : class107.field1355; // L: 1586
					} else if (var18.method1814()) { // L: 1588
						var21 = var18.isMembersOnly() ? class107.field1362 : class107.field1357; // L: 1589
					}

					if (var21 == null || var21.field1360 >= class12.worldSelectBackSprites.length) { // L: 1591
						var21 = var18.isMembersOnly() ? class107.field1358 : class107.field1361; // L: 1592
					}

					if (MouseHandler.MouseHandler_x >= var30 && MouseHandler.MouseHandler_y >= var29 && MouseHandler.MouseHandler_x < var3 + var30 && MouseHandler.MouseHandler_y < var40 + var29 && var19) { // L: 1594
						Login.hoveredWorldIndex = var41; // L: 1595
						class12.worldSelectBackSprites[var21.field1360].drawTransOverlayAt(var30, var29, 128, 16777215); // L: 1596
						var15 = true; // L: 1597
					} else {
						class12.worldSelectBackSprites[var21.field1360].drawAt(var30, var29); // L: 1599
					}

					if (class294.worldSelectFlagSprites != null) { // L: 1600
						class294.worldSelectFlagSprites[(var18.isMembersOnly() ? 8 : 0) + var18.location].drawAt(var30 + 29, var29);
					}

					var0.drawCentered(Integer.toString(var18.id), var30 + 15, var40 / 2 + var29 + 5, var22, -1); // L: 1601
					var1.drawCentered(var20, var30 + 60, var40 / 2 + var29 + 5, 268435455, -1); // L: 1602
					var29 = var29 + var8 + var40; // L: 1603
					++var39; // L: 1604
					if (var39 >= var47) {
						var29 = var37 + 23; // L: 1605
						var30 = var30 + var3 + var25; // L: 1606
						var39 = 0; // L: 1607
						++var16; // L: 1608
					}
				}

				if (var15) { // L: 1611
					var41 = var1.stringWidth(class20.World_worlds[Login.hoveredWorldIndex].activity) + 6; // L: 1612
					int var31 = var1.ascent + 8; // L: 1613
					int var42 = MouseHandler.MouseHandler_y + 25; // L: 1614
					if (var31 + var42 > 480) { // L: 1615
						var42 = MouseHandler.MouseHandler_y - 25 - var31; // L: 1616
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var41 / 2, var42, var41, var31, 16777120); // L: 1618
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var41 / 2, var42, var41, var31, 0); // L: 1619
					var1.drawCentered(class20.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var42 + var1.ascent + 4, 0, -1); // L: 1620
				}
			}

			class139.rasterProvider.drawFull(0, 0); // L: 1623
		} else {
			class305.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1627
			class362.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1628
			Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 1629
			if (Client.gameState == 0 || Client.gameState == 5) { // L: 1630
				var3 = 20; // L: 1631
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1); // L: 1632
				var4 = 253 - var3; // L: 1633
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409); // L: 1634
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0); // L: 1635
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409); // L: 1636
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150 + Login.Login_loadingPercent * 3, var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0); // L: 1637
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1); // L: 1638
			}

			String var5;
			String var6;
			String var7;
			short var32;
			short var34;
			if (Client.gameState == 20) { // L: 1640
				class330.titleboxSprite.drawAt(Login.loginBoxX + 180 - class330.titleboxSprite.subWidth / 2, 271 - class330.titleboxSprite.subHeight / 2); // L: 1641
				var32 = 201; // L: 1642
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1643
				var33 = var32 + 15; // L: 1644
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1645
				var33 += 15; // L: 1646
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1647
				var33 += 15; // L: 1648
				var33 += 7; // L: 1649
				if (Login.loginIndex != 4 && Login.loginIndex != 10) { // L: 1650
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var33, 16777215, 0); // L: 1651
					var34 = 200; // L: 1652
					var5 = WorldMapManager.clientPreferences.method2458() ? WorldMapSection2.method5096(Login.Login_username) : Login.Login_username; // L: 1655

					for (var6 = var5; var0.stringWidth(var6) > var34; var6 = var6.substring(0, var6.length() - 1)) { // L: 1657 1658 1659
					}

					var0.draw(AbstractFont.escapeBrackets(var6), Login.loginBoxX + 180 - 70, var33, 16777215, 0); // L: 1661
					var33 += 15; // L: 1662

					for (var7 = WorldMapSection2.method5096(Login.Login_password); var0.stringWidth(var7) > var34; var7 = var7.substring(1)) { // L: 1663 1664 1665
					}

					var0.draw("Password: " + var7, Login.loginBoxX + 180 - 108, var33, 16777215, 0); // L: 1667
					var33 += 15; // L: 1668
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) { // L: 1671
				class330.titleboxSprite.drawAt(Login.loginBoxX, 171); // L: 1672
				short var23;
				if (Login.loginIndex == 0) { // L: 1673
					var32 = 251; // L: 1674
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1675
					var33 = var32 + 30; // L: 1676
					var4 = Login.loginBoxX + 180 - 80; // L: 1677
					var23 = 291; // L: 1678
					class157.field1731.drawAt(var4 - 73, var23 - 20); // L: 1679
					var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1680
					var4 = Login.loginBoxX + 180 + 80; // L: 1681
					class157.field1731.drawAt(var4 - 73, var23 - 20); // L: 1682
					var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1683
				} else if (Login.loginIndex == 1) { // L: 1685
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0); // L: 1686
					var32 = 236; // L: 1687
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1688
					var33 = var32 + 15; // L: 1689
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16777215, 0); // L: 1690
					var33 += 15; // L: 1691
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16777215, 0); // L: 1692
					var33 += 15; // L: 1693
					var4 = Login.loginBoxX + 180 - 80; // L: 1694
					var23 = 321; // L: 1695
					class157.field1731.drawAt(var4 - 73, var23 - 20); // L: 1696
					var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0); // L: 1697
					var4 = Login.loginBoxX + 180 + 80; // L: 1698
					class157.field1731.drawAt(var4 - 73, var23 - 20); // L: 1699
					var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0); // L: 1700
				} else if (Login.loginIndex == 2) { // L: 1702
					var32 = 201; // L: 1703
					var0.drawCentered(Login.Login_response1, class153.loginBoxCenter, var32, 16776960, 0); // L: 1704
					var33 = var32 + 15; // L: 1705
					var0.drawCentered(Login.Login_response2, class153.loginBoxCenter, var33, 16776960, 0); // L: 1706
					var33 += 15; // L: 1707
					var0.drawCentered(Login.Login_response3, class153.loginBoxCenter, var33, 16776960, 0); // L: 1708
					var33 += 15; // L: 1709
					var33 += 7; // L: 1710
					var0.draw("Login: ", class153.loginBoxCenter - 110, var33, 16777215, 0); // L: 1711
					var34 = 200; // L: 1712
					var5 = WorldMapManager.clientPreferences.method2458() ? WorldMapSection2.method5096(Login.Login_username) : Login.Login_username; // L: 1715

					for (var6 = var5; var0.stringWidth(var6) > var34; var6 = var6.substring(1)) { // L: 1717 1718 1719
					}

					var0.draw(AbstractFont.escapeBrackets(var6) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? class396.colorStartTag(16776960) + "|" : ""), class153.loginBoxCenter - 70, var33, 16777215, 0); // L: 1721
					var33 += 15; // L: 1722

					for (var7 = WorldMapSection2.method5096(Login.Login_password); var0.stringWidth(var7) > var34; var7 = var7.substring(1)) { // L: 1723 1724 1725
					}

					var0.draw("Password: " + var7 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? class396.colorStartTag(16776960) + "|" : ""), class153.loginBoxCenter - 108, var33, 16777215, 0); // L: 1727
					var33 += 15; // L: 1728
					var32 = 277; // L: 1729
					var8 = class153.loginBoxCenter + -117; // L: 1730
					boolean var10 = Client.Login_isUsernameRemembered; // L: 1732
					boolean var11 = Login.field886; // L: 1733
					IndexedSprite var9 = var10 ? (var11 ? Login.field921 : UserComparator10.field1443) : (var11 ? class124.field1462 : Login.field887); // L: 1735
					var9.drawAt(var8, var32); // L: 1738
					var8 = var8 + var9.subWidth + 5; // L: 1739
					var1.draw("Remember username", var8, var32 + 13, 16776960, 0); // L: 1740
					var8 = class153.loginBoxCenter + 24; // L: 1741
					boolean var14 = WorldMapManager.clientPreferences.method2458(); // L: 1743
					var15 = Login.field914; // L: 1744
					IndexedSprite var13 = var14 ? (var15 ? Login.field921 : UserComparator10.field1443) : (var15 ? class124.field1462 : Login.field887); // L: 1746
					var13.drawAt(var8, var32); // L: 1749
					var8 = var8 + var13.subWidth + 5; // L: 1750
					var1.draw("Hide username", var8, var32 + 13, 16776960, 0); // L: 1751
					var33 = var32 + 15; // L: 1752
					var16 = class153.loginBoxCenter - 80; // L: 1753
					short var17 = 321; // L: 1754
					class157.field1731.drawAt(var16 - 73, var17 - 20); // L: 1755
					var0.drawCentered("Login", var16, var17 + 5, 16777215, 0); // L: 1756
					var16 = class153.loginBoxCenter + 80; // L: 1757
					class157.field1731.drawAt(var16 - 73, var17 - 20); // L: 1758
					var0.drawCentered("Cancel", var16, var17 + 5, 16777215, 0); // L: 1759
					var32 = 357; // L: 1760
					switch(Login.field895) { // L: 1761
					case 2:
						WorldMapRegion.field2906 = "Having trouble logging in?"; // L: 1763
						break;
					default:
						WorldMapRegion.field2906 = "Can't login? Click here."; // L: 1766
					}

					WorldMapLabelSize.field2867 = new Bounds(class153.loginBoxCenter, var32, var1.stringWidth(WorldMapRegion.field2906), 11); // L: 1769
					class336.field3786 = new Bounds(class153.loginBoxCenter, var32, var1.stringWidth("Still having trouble logging in?"), 11); // L: 1770
					var1.drawCentered(WorldMapRegion.field2906, class153.loginBoxCenter, var32, 16777215, 0); // L: 1771
				} else if (Login.loginIndex == 3) { // L: 1773
					var32 = 201; // L: 1774
					var0.drawCentered("Incorrect username or password.", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1775
					var33 = var32 + 20; // L: 1776
					var1.drawCentered("If you have upgraded to a Jagex Account, you", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1777
					var33 += 20; // L: 1778
					var1.drawCentered("need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1779
					var33 += 15; // L: 1780
					var4 = Login.loginBoxX + 180; // L: 1781
					var23 = 276; // L: 1782
					class157.field1731.drawAt(var4 - 73, var23 - 20); // L: 1783
					var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0); // L: 1784
					var4 = Login.loginBoxX + 180; // L: 1785
					var23 = 326; // L: 1786
					class157.field1731.drawAt(var4 - 73, var23 - 20); // L: 1787
					var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0); // L: 1788
				} else {
					short var36;
					if (Login.loginIndex == 4) { // L: 1790
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1791
						var32 = 236; // L: 1792
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1793
						var33 = var32 + 15; // L: 1794
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16777215, 0); // L: 1795
						var33 += 15; // L: 1796
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16777215, 0); // L: 1797
						var33 += 15; // L: 1798
						var0.draw("PIN: " + WorldMapSection2.method5096(class382.otp) + (Client.cycle % 40 < 20 ? class396.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var33, 16777215, 0); // L: 1799
						var33 -= 8; // L: 1800
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var33, 16776960, 0); // L: 1801
						var33 += 15; // L: 1802
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var33, 16776960, 0); // L: 1803
						var4 = 180 + Login.loginBoxX - 9 + var0.stringWidth("for 30 days: ") + 15; // L: 1804
						var43 = var33 - var0.ascent; // L: 1805
						IndexedSprite var35;
						if (Login.field909) { // L: 1807
							var35 = UserComparator10.field1443; // L: 1808
						} else {
							var35 = Login.field887; // L: 1811
						}

						var35.drawAt(var4, var43); // L: 1813
						var33 += 15; // L: 1814
						var25 = Login.loginBoxX + 180 - 80; // L: 1815
						var36 = 321; // L: 1816
						class157.field1731.drawAt(var25 - 73, var36 - 20); // L: 1817
						var0.drawCentered("Continue", var25, var36 + 5, 16777215, 0); // L: 1818
						var25 = Login.loginBoxX + 180 + 80; // L: 1819
						class157.field1731.drawAt(var25 - 73, var36 - 20); // L: 1820
						var0.drawCentered("Cancel", var25, var36 + 5, 16777215, 0); // L: 1821
						var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var36 + 36, 255, 0); // L: 1822
					} else if (Login.loginIndex == 5) { // L: 1824
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1825
						var32 = 221; // L: 1826
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1827
						var33 = var32 + 15; // L: 1828
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1829
						var33 += 15; // L: 1830
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1831
						var33 += 15; // L: 1832
						var33 += 14; // L: 1833
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var33, 16777215, 0); // L: 1834
						var34 = 174; // L: 1835
						var5 = WorldMapManager.clientPreferences.method2458() ? WorldMapSection2.method5096(Login.Login_username) : Login.Login_username; // L: 1838

						for (var6 = var5; var0.stringWidth(var6) > var34; var6 = var6.substring(1)) { // L: 1840 1841 1842
						}

						var0.draw(AbstractFont.escapeBrackets(var6) + (Client.cycle % 40 < 20 ? class396.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var33, 16777215, 0); // L: 1844
						var33 += 15; // L: 1845
						var25 = Login.loginBoxX + 180 - 80; // L: 1846
						var36 = 321; // L: 1847
						class157.field1731.drawAt(var25 - 73, var36 - 20); // L: 1848
						var0.drawCentered("Recover", var25, var36 + 5, 16777215, 0); // L: 1849
						var25 = Login.loginBoxX + 180 + 80; // L: 1850
						class157.field1731.drawAt(var25 - 73, var36 - 20); // L: 1851
						var0.drawCentered("Back", var25, var36 + 5, 16777215, 0); // L: 1852
						var36 = 356; // L: 1853
						var1.drawCentered("Still having trouble logging in?", class153.loginBoxCenter, var36, 268435455, 0); // L: 1854
					} else if (Login.loginIndex == 6) { // L: 1856
						var32 = 201; // L: 1857
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1858
						var33 = var32 + 15; // L: 1859
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1860
						var33 += 15; // L: 1861
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1862
						var33 += 15; // L: 1863
						var4 = Login.loginBoxX + 180; // L: 1864
						var23 = 321; // L: 1865
						class157.field1731.drawAt(var4 - 73, var23 - 20); // L: 1866
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1867
					} else if (Login.loginIndex == 7) { // L: 1869
						if (class306.field3401 && !Client.onMobile) { // L: 1870
							var32 = 201; // L: 1871
							var0.drawCentered(Login.Login_response1, class153.loginBoxCenter, var32, 16776960, 0); // L: 1872
							var33 = var32 + 15; // L: 1873
							var0.drawCentered(Login.Login_response2, class153.loginBoxCenter, var33, 16776960, 0); // L: 1874
							var33 += 15; // L: 1875
							var0.drawCentered(Login.Login_response3, class153.loginBoxCenter, var33, 16776960, 0); // L: 1876
							var4 = class153.loginBoxCenter - 150; // L: 1877
							var33 += 10; // L: 1878

							for (var43 = 0; var43 < 8; ++var43) { // L: 1879
								class157.field1731.method9409(var4, var33, 30, 40); // L: 1880
								boolean var26 = var43 == Login.field903 & Client.cycle % 40 < 20; // L: 1881
								var0.draw((Login.field905[var43] == null ? "" : Login.field905[var43]) + (var26 ? class396.colorStartTag(16776960) + "|" : ""), var4 + 10, var33 + 27, 16777215, 0); // L: 1882
								if (var43 != 1 && var43 != 3) { // L: 1883
									var4 += 35; // L: 1888
								} else {
									var4 += 50; // L: 1884
									var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var33 + 27, 16777215, 0); // L: 1885
								}
							}

							var43 = class153.loginBoxCenter - 80; // L: 1891
							short var45 = 321; // L: 1892
							class157.field1731.drawAt(var43 - 73, var45 - 20); // L: 1893
							var0.drawCentered("Submit", var43, var45 + 5, 16777215, 0); // L: 1894
							var43 = class153.loginBoxCenter + 80; // L: 1895
							class157.field1731.drawAt(var43 - 73, var45 - 20); // L: 1896
							var0.drawCentered("Cancel", var43, var45 + 5, 16777215, 0); // L: 1897
						} else {
							var32 = 216; // L: 1900
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1901
							var33 = var32 + 15; // L: 1902
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1903
							var33 += 15; // L: 1904
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1905
							var33 += 15; // L: 1906
							var4 = Login.loginBoxX + 180 - 80; // L: 1907
							var23 = 321; // L: 1908
							class157.field1731.drawAt(var4 - 73, var23 - 20); // L: 1909
							var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0); // L: 1910
							var4 = Login.loginBoxX + 180 + 80; // L: 1911
							class157.field1731.drawAt(var4 - 73, var23 - 20); // L: 1912
							var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1913
						}
					} else if (Login.loginIndex == 8) { // L: 1916
						var32 = 216; // L: 1917
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1918
						var33 = var32 + 15; // L: 1919
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1920
						var33 += 15; // L: 1921
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1922
						var33 += 15; // L: 1923
						var4 = Login.loginBoxX + 180 - 80; // L: 1924
						var23 = 321; // L: 1925
						class157.field1731.drawAt(var4 - 73, var23 - 20); // L: 1926
						var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0); // L: 1927
						var4 = Login.loginBoxX + 180 + 80; // L: 1928
						class157.field1731.drawAt(var4 - 73, var23 - 20); // L: 1929
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1930
					} else if (Login.loginIndex == 9) { // L: 1932
						var32 = 221; // L: 1933
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1934
						var33 = var32 + 25; // L: 1935
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1936
						var33 += 25; // L: 1937
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1938
						var4 = Login.loginBoxX + 180; // L: 1939
						var23 = 311; // L: 1940
						class157.field1731.drawAt(var4 - 73, var23 - 20); // L: 1941
						var0.drawCentered("Try again", var4, var23 + 5, 16777215, 0); // L: 1942
					} else if (Login.loginIndex == 10) { // L: 1944
						var33 = Login.loginBoxX + 180; // L: 1945
						var34 = 209; // L: 1946
						var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var34, 16776960, 0); // L: 1947
						var4 = var34 + 20; // L: 1948
						class25.field115.drawAt(var33 - 109, var4); // L: 1949
						if (Login.field913.isEmpty()) { // L: 1950
							ModelData0.field2817.drawAt(var33 - 48, var4 + 18); // L: 1951
						} else {
							ModelData0.field2817.drawAt(var33 - 48, var4 + 5); // L: 1954
							var0.drawCentered(Login.field913, var33, var4 + 68 - 15, 16776960, 0); // L: 1955
						}
					} else if (Login.loginIndex == 12) { // L: 1958
						var33 = class153.loginBoxCenter; // L: 1959
						var34 = 216; // L: 1960
						var2.drawCentered("Before using this app, please read and accept our", var33, var34, 16777215, 0); // L: 1961
						var4 = var34 + 17; // L: 1962
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var33, var4, 16777215, 0); // L: 1963
						var4 += 17; // L: 1964
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var33, var4, 16777215, 0); // L: 1965
						var4 += 17; // L: 1966
						var2.drawCentered("By accepting, you agree to these documents.", var33, var4, 16777215, 0); // L: 1967
						var33 = class153.loginBoxCenter - 80; // L: 1968
						var34 = 311; // L: 1969
						class157.field1731.drawAt(var33 - 73, var34 - 20); // L: 1970
						var0.drawCentered("Accept", var33, var34 + 5, 16777215, 0); // L: 1971
						var33 = class153.loginBoxCenter + 80; // L: 1972
						class157.field1731.drawAt(var33 - 73, var34 - 20); // L: 1973
						var0.drawCentered("Decline", var33, var34 + 5, 16777215, 0); // L: 1974
					} else if (Login.loginIndex == 13) { // L: 1976
						var32 = 231; // L: 1977
						var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var32, 16777215, 0); // L: 1978
						var33 = var32 + 20; // L: 1979
						var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var33, 16777215, 0); // L: 1980
						var4 = Login.loginBoxX + 180; // L: 1981
						var32 = 311; // L: 1982
						class157.field1731.drawAt(var4 - 73, var32 - 20); // L: 1983
						var0.drawCentered("Back", var4, var32 + 5, 16777215, 0); // L: 1984
					} else if (Login.loginIndex == 14) { // L: 1986
						var32 = 201; // L: 1987
						String var24 = ""; // L: 1988
						var5 = ""; // L: 1989
						var6 = ""; // L: 1990
						switch(Login.field894) { // L: 1991
						case 0:
							var24 = "Your account has been involved"; // L: 2013
							var5 = "in serious rule breaking."; // L: 2014
							var6 = ""; // L: 2015
							break;
						case 1:
							var24 = "Your account has been locked due to"; // L: 1999
							var5 = "suspicious activity."; // L: 2000
							var6 = "Please recover your account."; // L: 2001
							break; // L: 2002
						case 2:
							var24 = "The unpaid balance on your account needs"; // L: 2006
							var5 = "to be resolved before you can play."; // L: 2007
							var6 = Strings.field4017; // L: 2008
							break; // L: 2009
						default:
							class130.Login_promptCredentials(false); // L: 1994
						}

						var0.drawCentered(var24, Login.loginBoxX + 180, var32, 16776960, 0); // L: 2019
						var33 = var32 + 20; // L: 2020
						var0.drawCentered(var5, Login.loginBoxX + 180, var33, 16776960, 0); // L: 2021
						var33 += 20; // L: 2022
						var0.drawCentered(var6, Login.loginBoxX + 180, var33, 16776960, 0); // L: 2023
						var25 = Login.loginBoxX + 180; // L: 2024
						var36 = 276; // L: 2025
						class157.field1731.drawAt(var25 - 73, var36 - 20); // L: 2026
						if (Login.field894 == 1) { // L: 2027
							var0.drawCentered("Recover Account", var25, var36 + 5, 16777215, 0); // L: 2028
						} else {
							var0.drawCentered("View Appeal Options", var25, var36 + 5, 16777215, 0); // L: 2031
						}

						var25 = Login.loginBoxX + 180; // L: 2033
						var36 = 326; // L: 2034
						class157.field1731.drawAt(var25 - 73, var36 - 20); // L: 2035
						var0.drawCentered("Back", var25, var36 + 5, 16777215, 0); // L: 2036
					} else if (Login.loginIndex == 24) { // L: 2038
						var32 = 221; // L: 2039
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16777215, 0); // L: 2040
						var33 = var32 + 15; // L: 2041
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16777215, 0); // L: 2042
						var33 += 15; // L: 2043
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16777215, 0); // L: 2044
						var33 += 15; // L: 2045
						var4 = Login.loginBoxX + 180; // L: 2046
						var23 = 301; // L: 2047
						class157.field1731.drawAt(var4 - 73, var23 - 20); // L: 2048
						var0.drawCentered("Ok", var4, var23 + 5, 16777215, 0); // L: 2049
					} else if (Login.loginIndex == 32) { // L: 2051
						var32 = 216; // L: 2052
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var32, 16776960, 0); // L: 2053
						var33 = var32 + 15; // L: 2054
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var33, 16776960, 0); // L: 2055
						var33 += 15; // L: 2056
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var33, 16776960, 0); // L: 2057
						var33 += 15; // L: 2058
						var4 = Login.loginBoxX + 180 - 80; // L: 2059
						var23 = 321; // L: 2060
						class157.field1731.drawAt(var4 - 73, var23 - 20); // L: 2061
						var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0); // L: 2062
						var4 = Login.loginBoxX + 180 + 80; // L: 2063
						class157.field1731.drawAt(var4 - 73, var23 - 20); // L: 2064
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 2065
					} else if (Login.loginIndex == 33) { // L: 2067
						var32 = 201; // L: 2068
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0); // L: 2069
						var33 = var32 + 20; // L: 2070
						var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16776960, 0); // L: 2071
						var33 += 20; // L: 2072
						var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16776960, 0); // L: 2073
						var33 += 15; // L: 2074
						var4 = Login.loginBoxX + 180; // L: 2075
						var23 = 276; // L: 2076
						class157.field1731.drawAt(var4 - 73, var23 - 20); // L: 2077
						var2.drawCentered("Download Launcher", var4, var23 + 5, 16777215, 0); // L: 2078
						var4 = Login.loginBoxX + 180; // L: 2079
						var23 = 326; // L: 2080
						class157.field1731.drawAt(var4 - 73, var23 - 20); // L: 2081
						var2.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 2082
					}
				}
			}

			if (Client.gameState >= 10) { // L: 2085
				int[] var27 = new int[4]; // L: 2086
				Rasterizer2D.Rasterizer2D_getClipArray(var27); // L: 2087
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class11.canvasHeight); // L: 2088
				SecureRandomCallable.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle); // L: 2089
				SecureRandomCallable.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle); // L: 2090
				Rasterizer2D.Rasterizer2D_setClipArray(var27); // L: 2091
			}

			class33.title_muteSprite[WorldMapManager.clientPreferences.method2435() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463); // L: 2093
			if (Client.gameState > 5 && Language.Language_EN == class124.clientLanguage) { // L: 2094
				if (FloorUnderlayDefinition.field2088 != null) { // L: 2095
					var33 = Login.xPadding + 5; // L: 2096
					var34 = 463; // L: 2097
					byte var49 = 100; // L: 2098
					byte var46 = 35; // L: 2099
					FloorUnderlayDefinition.field2088.drawAt(var33, var34); // L: 2100
					var0.drawCentered("World" + " " + Client.worldId, var49 / 2 + var33, var46 / 2 + var34 - 2, 16777215, 0); // L: 2101
					if (World.World_request != null) { // L: 2102
						var1.drawCentered("Loading...", var49 / 2 + var33, var46 / 2 + var34 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var49 / 2 + var33, var46 / 2 + var34 + 12, 16777215, 0); // L: 2103
					}
				} else {
					FloorUnderlayDefinition.field2088 = class512.SpriteBuffer_getIndexedSpriteByName(GameBuild.archive8, "sl_button", ""); // L: 2106
				}
			}

		}
	} // L: 1625 2109
}
