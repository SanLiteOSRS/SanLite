import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
public class class141 extends class140 {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -230028297
	)
	int field1615;
	@ObfuscatedName("al")
	boolean field1616;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	final class143 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfo;)V"
	)
	class141(class143 var1) {
		this.this$0 = var1;
		this.field1615 = -1; // L: 178
	} // L: 181

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)V",
		garbageValue = "-1979280996"
	)
	void vmethod3361(Buffer var1) {
		this.field1615 = var1.readUnsignedShort(); // L: 184
		this.field1616 = var1.readUnsignedByte() == 1; // L: 185
	} // L: 186

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lfi;B)V",
		garbageValue = "29"
	)
	void vmethod3362(ClanSettings var1) {
		var1.method3206(this.field1615, this.field1616); // L: 189
	} // L: 190

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Loe;Loe;Loe;B)V",
		garbageValue = "-39"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (GameEngine.canvasWidth - 765) / 2; // L: 1448
		Login.loginBoxX = Login.xPadding + 202; // L: 1449
		Login.loginBoxCenter = Login.loginBoxX + 180; // L: 1450
		byte var3;
		int var4;
		int var9;
		int var11;
		int var12;
		int var18;
		int var26;
		int var27;
		int var28;
		int var36;
		int var47;
		int var49;
		if (Login.worldSelectOpen) { // L: 1451
			if (WorldMapSection2.worldSelectBackSprites == null) { // L: 1453
				WorldMapSection2.worldSelectBackSprites = class279.method5454(class143.archive8, "sl_back", "");
			}

			Archive var48;
			IndexedSprite[] var56;
			if (class279.worldSelectFlagSprites == null) { // L: 1454
				var48 = class143.archive8; // L: 1456
				var47 = var48.getGroupId("sl_flags"); // L: 1458
				var27 = var48.getFileId(var47, ""); // L: 1459
				var56 = class456.method8334(var48, var47, var27); // L: 1460
				class279.worldSelectFlagSprites = var56; // L: 1462
			}

			if (class353.worldSelectArrows == null) { // L: 1464
				var48 = class143.archive8; // L: 1466
				var47 = var48.getGroupId("sl_arrows"); // L: 1468
				var27 = var48.getFileId(var47, ""); // L: 1469
				var56 = class456.method8334(var48, var47, var27); // L: 1470
				class353.worldSelectArrows = var56; // L: 1472
			}

			if (class293.worldSelectStars == null) { // L: 1474
				var48 = class143.archive8; // L: 1476
				var47 = var48.getGroupId("sl_stars"); // L: 1478
				var27 = var48.getFileId(var47, ""); // L: 1479
				var56 = class456.method8334(var48, var47, var27); // L: 1480
				class293.worldSelectStars = var56; // L: 1482
			}

			if (class12.worldSelectLeftSprite == null) { // L: 1484
				class12.worldSelectLeftSprite = class368.SpriteBuffer_getIndexedSpriteByName(class143.archive8, "leftarrow", "");
			}

			if (class208.worldSelectRightSprite == null) { // L: 1485
				class208.worldSelectRightSprite = class368.SpriteBuffer_getIndexedSpriteByName(class143.archive8, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0); // L: 1486
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624); // L: 1487
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513); // L: 1488
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1); // L: 1489
			if (class293.worldSelectStars != null) { // L: 1490
				class293.worldSelectStars[1].drawAt(Login.xPadding + 140, 1); // L: 1491
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1); // L: 1492
				class293.worldSelectStars[0].drawAt(Login.xPadding + 140, 12); // L: 1493
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1); // L: 1494
			}

			if (class353.worldSelectArrows != null) { // L: 1496
				var36 = Login.xPadding + 280; // L: 1497
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) { // L: 1498
					class353.worldSelectArrows[2].drawAt(var36, 4);
				} else {
					class353.worldSelectArrows[0].drawAt(var36, 4); // L: 1499
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) { // L: 1500
					class353.worldSelectArrows[3].drawAt(var36 + 15, 4);
				} else {
					class353.worldSelectArrows[1].drawAt(var36 + 15, 4); // L: 1501
				}

				var0.draw("World", var36 + 32, 17, 16777215, -1); // L: 1502
				var4 = Login.xPadding + 390; // L: 1503
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) { // L: 1504
					class353.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					class353.worldSelectArrows[0].drawAt(var4, 4); // L: 1505
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) { // L: 1506
					class353.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					class353.worldSelectArrows[1].drawAt(var4 + 15, 4); // L: 1507
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1); // L: 1508
				var47 = Login.xPadding + 500; // L: 1509
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) { // L: 1510
					class353.worldSelectArrows[2].drawAt(var47, 4);
				} else {
					class353.worldSelectArrows[0].drawAt(var47, 4); // L: 1511
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) { // L: 1512
					class353.worldSelectArrows[3].drawAt(var47 + 15, 4);
				} else {
					class353.worldSelectArrows[1].drawAt(var47 + 15, 4); // L: 1513
				}

				var0.draw("Location", var47 + 32, 17, 16777215, -1); // L: 1514
				var27 = Login.xPadding + 610; // L: 1515
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) { // L: 1516
					class353.worldSelectArrows[2].drawAt(var27, 4);
				} else {
					class353.worldSelectArrows[0].drawAt(var27, 4); // L: 1517
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) { // L: 1518
					class353.worldSelectArrows[3].drawAt(var27 + 15, 4);
				} else {
					class353.worldSelectArrows[1].drawAt(var27 + 15, 4); // L: 1519
				}

				var0.draw("Type", var27 + 32, 17, 16777215, -1); // L: 1520
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0); // L: 1522
			var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1); // L: 1523
			Login.hoveredWorldIndex = -1; // L: 1524
			if (WorldMapSection2.worldSelectBackSprites != null) { // L: 1525
				var3 = 88; // L: 1526
				byte var42 = 19; // L: 1527
				var47 = 765 / (var3 + 1) - 1; // L: 1528
				var27 = 480 / (var42 + 1); // L: 1529

				do {
					var49 = var27; // L: 1531
					var26 = var47; // L: 1532
					if (var27 * (var47 - 1) >= World.World_count) { // L: 1533
						--var47;
					}

					if (var47 * (var27 - 1) >= World.World_count) { // L: 1534
						--var27;
					}

					if (var47 * (var27 - 1) >= World.World_count) { // L: 1535
						--var27;
					}
				} while(var27 != var49 || var47 != var26); // L: 1536

				var49 = (765 - var47 * var3) / (var47 + 1); // L: 1538
				if (var49 > 5) { // L: 1539
					var49 = 5;
				}

				var26 = (480 - var27 * var42) / (var27 + 1); // L: 1540
				if (var26 > 5) { // L: 1541
					var26 = 5;
				}

				var9 = (765 - var3 * var47 - var49 * (var47 - 1)) / 2; // L: 1542
				var28 = (480 - var27 * var42 - var26 * (var27 - 1)) / 2; // L: 1543
				var11 = (var27 + World.World_count - 1) / var27; // L: 1544
				Login.worldSelectPagesCount = var11 - var47; // L: 1545
				if (class12.worldSelectLeftSprite != null && Login.worldSelectPage > 0) { // L: 1546
					class12.worldSelectLeftSprite.drawAt(8, class143.canvasHeight / 2 - class12.worldSelectLeftSprite.subHeight / 2); // L: 1547
				}

				if (class208.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) { // L: 1549
					class208.worldSelectRightSprite.drawAt(GameEngine.canvasWidth - class208.worldSelectRightSprite.subWidth - 8, class143.canvasHeight / 2 - class208.worldSelectRightSprite.subHeight / 2); // L: 1550
				}

				var12 = var28 + 23; // L: 1552
				int var40 = var9 + Login.xPadding; // L: 1553
				int var32 = 0; // L: 1554
				boolean var33 = false; // L: 1555
				int var43 = Login.worldSelectPage; // L: 1556

				int var44;
				for (var44 = var27 * var43; var44 < World.World_count && var43 - Login.worldSelectPage < var47; ++var44) { // L: 1557 1558
					World var34 = class260.World_worlds[var44]; // L: 1561
					boolean var45 = true; // L: 1562
					String var20 = Integer.toString(var34.population); // L: 1563
					if (var34.population == -1) { // L: 1564
						var20 = "OFF"; // L: 1565
						var45 = false; // L: 1566
					} else if (var34.population > 1980) { // L: 1568
						var20 = "FULL"; // L: 1569
						var45 = false; // L: 1570
					}

					int var21 = -1; // L: 1572
					int var22 = 0; // L: 1573
					if (var34.isBeta()) { // L: 1574
						if (var34.isMembersOnly()) { // L: 1575
							var21 = class105.field1360.field1352; // L: 1576
						} else {
							var21 = class105.field1355.field1352; // L: 1579
						}
					} else if (var34.isDeadman()) { // L: 1582
						var22 = 16711680; // L: 1583
						if (var34.isMembersOnly()) { // L: 1584
							var21 = class105.field1350.field1352; // L: 1585
						} else {
							var21 = class105.field1349.field1352; // L: 1588
						}
					} else if (var34.method1820()) { // L: 1591
						if (var34.isMembersOnly()) { // L: 1592
							var21 = class105.field1345.field1352; // L: 1593
						} else {
							var21 = class105.field1353.field1352; // L: 1596
						}
					} else if (var34.isPvp()) { // L: 1599
						if (var34.isMembersOnly()) { // L: 1600
							var21 = class105.field1354.field1352; // L: 1601
						} else {
							var21 = class105.field1347.field1352; // L: 1604
						}
					} else if (var34.method1789()) { // L: 1607
						if (var34.isMembersOnly()) { // L: 1608
							var21 = class105.field1356.field1352; // L: 1609
						} else {
							var21 = class105.field1348.field1352; // L: 1612
						}
					} else if (var34.method1790()) { // L: 1615
						if (var34.isMembersOnly()) { // L: 1616
							var21 = class105.field1351.field1352;
						} else {
							var21 = class105.field1357.field1352; // L: 1617
						}
					}

					if (var21 == -1 || var21 >= WorldMapSection2.worldSelectBackSprites.length) { // L: 1619
						if (var34.isMembersOnly()) { // L: 1620
							var21 = class105.field1358.field1352; // L: 1621
						} else {
							var21 = class105.field1359.field1352; // L: 1624
						}
					}

					if (MouseHandler.MouseHandler_x >= var40 && MouseHandler.MouseHandler_y >= var12 && MouseHandler.MouseHandler_x < var40 + var3 && MouseHandler.MouseHandler_y < var12 + var42 && var45) { // L: 1627
						Login.hoveredWorldIndex = var44; // L: 1628
						WorldMapSection2.worldSelectBackSprites[var21].drawTransOverlayAt(var40, var12, 128, 16777215); // L: 1629
						var33 = true; // L: 1630
					} else {
						WorldMapSection2.worldSelectBackSprites[var21].drawAt(var40, var12); // L: 1632
					}

					if (class279.worldSelectFlagSprites != null) { // L: 1633
						class279.worldSelectFlagSprites[(var34.isMembersOnly() ? 8 : 0) + var34.location].drawAt(var40 + 29, var12);
					}

					var0.drawCentered(Integer.toString(var34.id), var40 + 15, var42 / 2 + var12 + 5, var22, -1); // L: 1634
					var1.drawCentered(var20, var40 + 60, var42 / 2 + var12 + 5, 268435455, -1); // L: 1635
					var12 = var12 + var42 + var26; // L: 1636
					++var32; // L: 1637
					if (var32 >= var27) {
						var12 = var28 + 23; // L: 1638
						var40 = var40 + var3 + var49; // L: 1639
						var32 = 0; // L: 1640
						++var43; // L: 1641
					}
				}

				if (var33) { // L: 1644
					var44 = var1.stringWidth(class260.World_worlds[Login.hoveredWorldIndex].activity) + 6; // L: 1645
					var18 = var1.ascent + 8; // L: 1646
					int var46 = MouseHandler.MouseHandler_y + 25; // L: 1647
					if (var46 + var18 > 480) { // L: 1648
						var46 = MouseHandler.MouseHandler_y - 25 - var18; // L: 1649
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var44 / 2, var46, var44, var18, 16777120); // L: 1651
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var44 / 2, var46, var44, var18, 0); // L: 1652
					var1.drawCentered(class260.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var46 + var1.ascent + 4, 0, -1); // L: 1653
				}
			}

			StudioGame.rasterProvider.drawFull(0, 0); // L: 1656
		} else {
			Login.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1660
			class419.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1661
			Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 1662
			if (Client.gameState == 0 || Client.gameState == 5) { // L: 1663
				var3 = 20; // L: 1664
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1); // L: 1665
				var4 = 253 - var3; // L: 1666
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409); // L: 1667
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0); // L: 1668
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409); // L: 1669
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.Login_loadingPercent * 3 + (Login.loginBoxX + 180 - 150), var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0); // L: 1670
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1); // L: 1671
			}

			String var5;
			String var7;
			String var8;
			char[] var10;
			short var35;
			short var37;
			if (Client.gameState == 20) { // L: 1673
				WorldMapSprite.titleboxSprite.drawAt(Login.loginBoxX + 180 - WorldMapSprite.titleboxSprite.subWidth / 2, 271 - WorldMapSprite.titleboxSprite.subHeight / 2); // L: 1674
				var35 = 201; // L: 1675
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var35, 16776960, 0); // L: 1676
				var36 = var35 + 15; // L: 1677
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var36, 16776960, 0); // L: 1678
				var36 += 15; // L: 1679
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var36, 16776960, 0); // L: 1680
				var36 += 15; // L: 1681
				var36 += 7; // L: 1682
				if (Login.loginIndex != 4 && Login.loginIndex != 10) { // L: 1683
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var36, 16777215, 0); // L: 1684
					var37 = 200; // L: 1685

					for (var5 = UserComparator3.method2868(); var0.stringWidth(var5) > var37; var5 = var5.substring(0, var5.length() - 1)) { // L: 1686 1687 1688
					}

					var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var36, 16777215, 0); // L: 1690
					var36 += 15; // L: 1691
					var7 = Login.Login_password; // L: 1693
					var9 = var7.length(); // L: 1696
					var10 = new char[var9]; // L: 1698

					for (var11 = 0; var11 < var9; ++var11) { // L: 1699
						var10[var11] = '*';
					}

					var8 = new String(var10); // L: 1700

					for (var8 = var8; var0.stringWidth(var8) > var37; var8 = var8.substring(1)) { // L: 1704 1705 1706
					}

					var0.draw("Password: " + var8, Login.loginBoxX + 180 - 108, var36, 16777215, 0); // L: 1708
					var36 += 15; // L: 1709
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) { // L: 1712
				WorldMapSprite.titleboxSprite.drawAt(Login.loginBoxX, 171); // L: 1713
				short var23;
				if (Login.loginIndex == 0) { // L: 1714
					var35 = 251; // L: 1715
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var35, 16776960, 0); // L: 1716
					var36 = var35 + 30; // L: 1717
					var4 = Login.loginBoxX + 180 - 80; // L: 1718
					var23 = 291; // L: 1719
					Login.field912.drawAt(var4 - 73, var23 - 20); // L: 1720
					var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1721
					var4 = Login.loginBoxX + 180 + 80; // L: 1722
					Login.field912.drawAt(var4 - 73, var23 - 20); // L: 1723
					var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1724
				} else if (Login.loginIndex == 1) { // L: 1726
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0); // L: 1727
					var35 = 236; // L: 1728
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var35, 16777215, 0); // L: 1729
					var36 = var35 + 15; // L: 1730
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var36, 16777215, 0); // L: 1731
					var36 += 15; // L: 1732
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var36, 16777215, 0); // L: 1733
					var36 += 15; // L: 1734
					var4 = Login.loginBoxX + 180 - 80; // L: 1735
					var23 = 321; // L: 1736
					Login.field912.drawAt(var4 - 73, var23 - 20); // L: 1737
					var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0); // L: 1738
					var4 = Login.loginBoxX + 180 + 80; // L: 1739
					Login.field912.drawAt(var4 - 73, var23 - 20); // L: 1740
					var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0); // L: 1741
				} else {
					String var6;
					if (Login.loginIndex == 2) { // L: 1743
						var35 = 201; // L: 1744
						var0.drawCentered(Login.Login_response1, Login.loginBoxCenter, var35, 16776960, 0); // L: 1745
						var36 = var35 + 15; // L: 1746
						var0.drawCentered(Login.Login_response2, Login.loginBoxCenter, var36, 16776960, 0); // L: 1747
						var36 += 15; // L: 1748
						var0.drawCentered(Login.Login_response3, Login.loginBoxCenter, var36, 16776960, 0); // L: 1749
						var36 += 15; // L: 1750
						var36 += 7; // L: 1751
						var0.draw("Login: ", Login.loginBoxCenter - 110, var36, 16777215, 0); // L: 1752
						var37 = 200; // L: 1753
						char[] var29;
						String var30;
						if (!WorldMapSectionType.clientPreferences.method2429()) { // L: 1757
							var6 = Login.Login_username; // L: 1772
						} else {
							var8 = Login.Login_username; // L: 1759
							var28 = var8.length(); // L: 1762
							var29 = new char[var28]; // L: 1764

							for (var12 = 0; var12 < var28; ++var12) { // L: 1765
								var29[var12] = '*';
							}

							var30 = new String(var29); // L: 1766
							var6 = var30; // L: 1770
						}

						for (var6 = var6; var0.stringWidth(var6) > var37; var6 = var6.substring(1)) { // L: 1775 1776 1777
						}

						var0.draw(AbstractFont.escapeBrackets(var6) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? Canvas.colorStartTag(16776960) + "|" : ""), Login.loginBoxCenter - 70, var36, 16777215, 0); // L: 1779
						var36 += 15; // L: 1780
						var8 = Login.Login_password; // L: 1782
						var28 = var8.length(); // L: 1785
						var29 = new char[var28]; // L: 1787

						for (var12 = 0; var12 < var28; ++var12) { // L: 1788
							var29[var12] = '*';
						}

						var30 = new String(var29); // L: 1789

						for (var30 = var30; var0.stringWidth(var30) > var37; var30 = var30.substring(1)) { // L: 1793 1794 1795
						}

						var0.draw("Password: " + var30 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? Canvas.colorStartTag(16776960) + "|" : ""), Login.loginBoxCenter - 108, var36, 16777215, 0); // L: 1797
						var36 += 15; // L: 1798
						var35 = 277; // L: 1799
						var28 = Login.loginBoxCenter + -117; // L: 1800
						boolean var39 = Client.Login_isUsernameRemembered; // L: 1802
						boolean var13 = Login.field900; // L: 1803
						IndexedSprite var55 = var39 ? (var13 ? KitDefinition.field1941 : Login.field904) : (var13 ? ArchiveLoader.field1017 : Login.field892); // L: 1805
						var55.drawAt(var28, var35); // L: 1808
						var28 = var28 + var55.subWidth + 5; // L: 1809
						var1.draw("Remember username", var28, var35 + 13, 16776960, 0); // L: 1810
						var28 = Login.loginBoxCenter + 24; // L: 1811
						boolean var16 = WorldMapSectionType.clientPreferences.method2429(); // L: 1813
						boolean var17 = Login.field913; // L: 1814
						IndexedSprite var15 = var16 ? (var17 ? KitDefinition.field1941 : Login.field904) : (var17 ? ArchiveLoader.field1017 : Login.field892); // L: 1816
						var15.drawAt(var28, var35); // L: 1819
						var28 = var28 + var15.subWidth + 5; // L: 1820
						var1.draw("Hide username", var28, var35 + 13, 16776960, 0); // L: 1821
						var36 = var35 + 15; // L: 1822
						var18 = Login.loginBoxCenter - 80; // L: 1823
						short var19 = 321; // L: 1824
						Login.field912.drawAt(var18 - 73, var19 - 20); // L: 1825
						var0.drawCentered("Login", var18, var19 + 5, 16777215, 0); // L: 1826
						var18 = Login.loginBoxCenter + 80; // L: 1827
						Login.field912.drawAt(var18 - 73, var19 - 20); // L: 1828
						var0.drawCentered("Cancel", var18, var19 + 5, 16777215, 0); // L: 1829
						var35 = 357; // L: 1830
						switch(Login.field887) { // L: 1831
						case 2:
							InvDefinition.field1884 = "Having trouble logging in?"; // L: 1836
							break;
						default:
							InvDefinition.field1884 = "Can't login? Click here."; // L: 1833
						}

						WorldMapSectionType.field2932 = new Bounds(Login.loginBoxCenter, var35, var1.stringWidth(InvDefinition.field1884), 11); // L: 1839
						DevicePcmPlayerProvider.field118 = new Bounds(Login.loginBoxCenter, var35, var1.stringWidth("Still having trouble logging in?"), 11); // L: 1840
						var1.drawCentered(InvDefinition.field1884, Login.loginBoxCenter, var35, 16777215, 0); // L: 1841
					} else if (Login.loginIndex == 3) { // L: 1843
						var35 = 201; // L: 1844
						var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var35, 16776960, 0); // L: 1845
						var36 = var35 + 20; // L: 1846
						var1.drawCentered("You may need to use the Jagex Launcher to continue playing.", Login.loginBoxX + 180, var36, 16776960, 0); // L: 1847
						var36 += 20; // L: 1848
						var1.drawCentered("<col=ffd200>Download it here.</col>", Login.loginBoxX + 180, var36, 16776960, 0); // L: 1849
						var36 += 15; // L: 1850
						var4 = Login.loginBoxX + 180; // L: 1851
						var23 = 276; // L: 1852
						Login.field912.drawAt(var4 - 73, var23 - 20); // L: 1853
						var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0); // L: 1854
						var4 = Login.loginBoxX + 180; // L: 1855
						var23 = 326; // L: 1856
						Login.field912.drawAt(var4 - 73, var23 - 20); // L: 1857
						var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0); // L: 1858
					} else if (Login.loginIndex == 4) { // L: 1860
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1861
						var35 = 236; // L: 1862
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var35, 16777215, 0); // L: 1863
						var36 = var35 + 15; // L: 1864
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var36, 16777215, 0); // L: 1865
						var36 += 15; // L: 1866
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var36, 16777215, 0); // L: 1867
						var36 += 15; // L: 1868
						var5 = "PIN: "; // L: 1870
						var7 = NetFileRequest.otp; // L: 1872
						var9 = var7.length(); // L: 1875
						var10 = new char[var9]; // L: 1877

						for (var11 = 0; var11 < var9; ++var11) { // L: 1878
							var10[var11] = '*';
						}

						var8 = new String(var10); // L: 1879
						var0.draw(var5 + var8 + (Client.cycle % 40 < 20 ? Canvas.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var36, 16777215, 0); // L: 1883
						var36 -= 8; // L: 1884
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var36, 16776960, 0); // L: 1885
						var36 += 15; // L: 1886
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var36, 16776960, 0); // L: 1887
						var26 = 180 + Login.loginBoxX - 9 + var0.stringWidth("for 30 days: ") + 15; // L: 1888
						var9 = var36 - var0.ascent; // L: 1889
						IndexedSprite var38;
						if (Login.field914) { // L: 1891
							var38 = Login.field904; // L: 1892
						} else {
							var38 = Login.field892; // L: 1895
						}

						var38.drawAt(var26, var9); // L: 1897
						var36 += 15; // L: 1898
						var11 = Login.loginBoxX + 180 - 80; // L: 1899
						short var41 = 321; // L: 1900
						Login.field912.drawAt(var11 - 73, var41 - 20); // L: 1901
						var0.drawCentered("Continue", var11, var41 + 5, 16777215, 0); // L: 1902
						var11 = Login.loginBoxX + 180 + 80; // L: 1903
						Login.field912.drawAt(var11 - 73, var41 - 20); // L: 1904
						var0.drawCentered("Cancel", var11, var41 + 5, 16777215, 0); // L: 1905
						var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var41 + 36, 255, 0); // L: 1906
					} else if (Login.loginIndex == 5) { // L: 1908
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1909
						var35 = 221; // L: 1910
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var35, 16776960, 0); // L: 1911
						var36 = var35 + 15; // L: 1912
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var36, 16776960, 0); // L: 1913
						var36 += 15; // L: 1914
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var36, 16776960, 0); // L: 1915
						var36 += 15; // L: 1916
						var36 += 14; // L: 1917
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var36, 16777215, 0); // L: 1918
						var37 = 174; // L: 1919

						for (var5 = UserComparator3.method2868(); var0.stringWidth(var5) > var37; var5 = var5.substring(1)) { // L: 1920 1921 1922
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? Canvas.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var36, 16777215, 0); // L: 1924
						var36 += 15; // L: 1925
						var27 = Login.loginBoxX + 180 - 80; // L: 1926
						short var25 = 321; // L: 1927
						Login.field912.drawAt(var27 - 73, var25 - 20); // L: 1928
						var0.drawCentered("Recover", var27, var25 + 5, 16777215, 0); // L: 1929
						var27 = Login.loginBoxX + 180 + 80; // L: 1930
						Login.field912.drawAt(var27 - 73, var25 - 20); // L: 1931
						var0.drawCentered("Back", var27, var25 + 5, 16777215, 0); // L: 1932
						var25 = 356; // L: 1933
						var1.drawCentered("Still having trouble logging in?", Login.loginBoxCenter, var25, 268435455, 0); // L: 1934
					} else if (Login.loginIndex == 6) { // L: 1936
						var35 = 201; // L: 1937
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var35, 16776960, 0); // L: 1938
						var36 = var35 + 15; // L: 1939
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var36, 16776960, 0); // L: 1940
						var36 += 15; // L: 1941
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var36, 16776960, 0); // L: 1942
						var36 += 15; // L: 1943
						var4 = Login.loginBoxX + 180; // L: 1944
						var23 = 321; // L: 1945
						Login.field912.drawAt(var4 - 73, var23 - 20); // L: 1946
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1947
					} else if (Login.loginIndex == 7) { // L: 1949
						if (class157.field1742 && !Client.onMobile) { // L: 1950
							var35 = 201; // L: 1951
							var0.drawCentered(Login.Login_response1, Login.loginBoxCenter, var35, 16776960, 0); // L: 1952
							var36 = var35 + 15; // L: 1953
							var0.drawCentered(Login.Login_response2, Login.loginBoxCenter, var36, 16776960, 0); // L: 1954
							var36 += 15; // L: 1955
							var0.drawCentered(Login.Login_response3, Login.loginBoxCenter, var36, 16776960, 0); // L: 1956
							var4 = Login.loginBoxCenter - 150; // L: 1957
							var36 += 10; // L: 1958

							for (var47 = 0; var47 < 8; ++var47) { // L: 1959
								Login.field912.method9034(var4, var36, 30, 40); // L: 1960
								boolean var52 = var47 == Login.field909 & Client.cycle % 40 < 20; // L: 1961
								var0.draw((Login.field908[var47] == null ? "" : Login.field908[var47]) + (var52 ? Canvas.colorStartTag(16776960) + "|" : ""), var4 + 10, var36 + 27, 16777215, 0); // L: 1962
								if (var47 != 1 && var47 != 3) { // L: 1963
									var4 += 35; // L: 1968
								} else {
									var4 += 50; // L: 1964
									var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var36 + 27, 16777215, 0); // L: 1965
								}
							}

							var47 = Login.loginBoxCenter - 80; // L: 1971
							short var53 = 321; // L: 1972
							Login.field912.drawAt(var47 - 73, var53 - 20); // L: 1973
							var0.drawCentered("Submit", var47, var53 + 5, 16777215, 0); // L: 1974
							var47 = Login.loginBoxCenter + 80; // L: 1975
							Login.field912.drawAt(var47 - 73, var53 - 20); // L: 1976
							var0.drawCentered("Cancel", var47, var53 + 5, 16777215, 0); // L: 1977
						} else {
							var35 = 216; // L: 1980
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var35, 16776960, 0); // L: 1981
							var36 = var35 + 15; // L: 1982
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var36, 16776960, 0); // L: 1983
							var36 += 15; // L: 1984
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var36, 16776960, 0); // L: 1985
							var36 += 15; // L: 1986
							var4 = Login.loginBoxX + 180 - 80; // L: 1987
							var23 = 321; // L: 1988
							Login.field912.drawAt(var4 - 73, var23 - 20); // L: 1989
							var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0); // L: 1990
							var4 = Login.loginBoxX + 180 + 80; // L: 1991
							Login.field912.drawAt(var4 - 73, var23 - 20); // L: 1992
							var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1993
						}
					} else if (Login.loginIndex == 8) { // L: 1996
						var35 = 216; // L: 1997
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var35, 16776960, 0); // L: 1998
						var36 = var35 + 15; // L: 1999
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var36, 16776960, 0); // L: 2000
						var36 += 15; // L: 2001
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var36, 16776960, 0); // L: 2002
						var36 += 15; // L: 2003
						var4 = Login.loginBoxX + 180 - 80; // L: 2004
						var23 = 321; // L: 2005
						Login.field912.drawAt(var4 - 73, var23 - 20); // L: 2006
						var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0); // L: 2007
						var4 = Login.loginBoxX + 180 + 80; // L: 2008
						Login.field912.drawAt(var4 - 73, var23 - 20); // L: 2009
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 2010
					} else if (Login.loginIndex == 9) { // L: 2012
						var35 = 221; // L: 2013
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var35, 16776960, 0); // L: 2014
						var36 = var35 + 25; // L: 2015
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var36, 16776960, 0); // L: 2016
						var36 += 25; // L: 2017
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var36, 16776960, 0); // L: 2018
						var4 = Login.loginBoxX + 180; // L: 2019
						var23 = 311; // L: 2020
						Login.field912.drawAt(var4 - 73, var23 - 20); // L: 2021
						var0.drawCentered("Try again", var4, var23 + 5, 16777215, 0); // L: 2022
					} else if (Login.loginIndex == 10) { // L: 2024
						var36 = Login.loginBoxX + 180; // L: 2025
						var37 = 209; // L: 2026
						var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var37, 16776960, 0); // L: 2027
						var4 = var37 + 20; // L: 2028
						GrandExchangeOfferOwnWorldComparator.field478.drawAt(var36 - 109, var4); // L: 2029
						if (Login.field911.isEmpty()) { // L: 2030
							class72.field882.drawAt(var36 - 48, var4 + 18); // L: 2031
						} else {
							class72.field882.drawAt(var36 - 48, var4 + 5); // L: 2034
							var0.drawCentered(Login.field911, var36, var4 + 68 - 15, 16776960, 0); // L: 2035
						}
					} else if (Login.loginIndex == 12) { // L: 2038
						var36 = Login.loginBoxCenter; // L: 2039
						var37 = 216; // L: 2040
						var2.drawCentered("Before using this app, please read and accept our", var36, var37, 16777215, 0); // L: 2041
						var4 = var37 + 17; // L: 2042
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var36, var4, 16777215, 0); // L: 2043
						var4 += 17; // L: 2044
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var36, var4, 16777215, 0); // L: 2045
						var4 += 17; // L: 2046
						var2.drawCentered("By accepting, you agree to these documents.", var36, var4, 16777215, 0); // L: 2047
						var36 = Login.loginBoxCenter - 80; // L: 2048
						var37 = 311; // L: 2049
						Login.field912.drawAt(var36 - 73, var37 - 20); // L: 2050
						var0.drawCentered("Accept", var36, var37 + 5, 16777215, 0); // L: 2051
						var36 = Login.loginBoxCenter + 80; // L: 2052
						Login.field912.drawAt(var36 - 73, var37 - 20); // L: 2053
						var0.drawCentered("Decline", var36, var37 + 5, 16777215, 0); // L: 2054
					} else if (Login.loginIndex == 13) { // L: 2056
						var35 = 231; // L: 2057
						var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var35, 16777215, 0); // L: 2058
						var36 = var35 + 20; // L: 2059
						var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var36, 16777215, 0); // L: 2060
						var4 = Login.loginBoxX + 180; // L: 2061
						var35 = 311; // L: 2062
						Login.field912.drawAt(var4 - 73, var35 - 20); // L: 2063
						var0.drawCentered("Back", var4, var35 + 5, 16777215, 0); // L: 2064
					} else if (Login.loginIndex == 14) { // L: 2066
						var35 = 201; // L: 2067
						String var24 = ""; // L: 2068
						var5 = ""; // L: 2069
						var6 = ""; // L: 2070
						switch(Login.field901) { // L: 2071
						case 0:
							var24 = "Your account has been involved"; // L: 2074
							var5 = "in serious rule breaking."; // L: 2075
							var6 = ""; // L: 2076
							break;
						case 1:
							var24 = "Your account has been locked due to"; // L: 2093
							var5 = "suspicious activity."; // L: 2094
							var6 = "Please recover your account."; // L: 2095
							break;
						case 2:
							var24 = "The unpaid balance on your account needs"; // L: 2081
							var5 = "to be resolved before you can play."; // L: 2082
							var6 = class332.field3882; // L: 2083
							break; // L: 2084
						default:
							FontName.Login_promptCredentials(false); // L: 2088
						}

						var0.drawCentered(var24, Login.loginBoxX + 180, var35, 16776960, 0); // L: 2099
						var36 = var35 + 20; // L: 2100
						var0.drawCentered(var5, Login.loginBoxX + 180, var36, 16776960, 0); // L: 2101
						var36 += 20; // L: 2102
						var0.drawCentered(var6, Login.loginBoxX + 180, var36, 16776960, 0); // L: 2103
						var49 = Login.loginBoxX + 180; // L: 2104
						short var50 = 276; // L: 2105
						Login.field912.drawAt(var49 - 73, var50 - 20); // L: 2106
						if (Login.field901 == 1) { // L: 2107
							var0.drawCentered("Recover Account", var49, var50 + 5, 16777215, 0); // L: 2108
						} else {
							var0.drawCentered("View Appeal Options", var49, var50 + 5, 16777215, 0); // L: 2111
						}

						var49 = Login.loginBoxX + 180; // L: 2113
						var50 = 326; // L: 2114
						Login.field912.drawAt(var49 - 73, var50 - 20); // L: 2115
						var0.drawCentered("Back", var49, var50 + 5, 16777215, 0); // L: 2116
					} else if (Login.loginIndex == 24) { // L: 2118
						var35 = 221; // L: 2119
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var35, 16777215, 0); // L: 2120
						var36 = var35 + 15; // L: 2121
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var36, 16777215, 0); // L: 2122
						var36 += 15; // L: 2123
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var36, 16777215, 0); // L: 2124
						var36 += 15; // L: 2125
						var4 = Login.loginBoxX + 180; // L: 2126
						var23 = 301; // L: 2127
						Login.field912.drawAt(var4 - 73, var23 - 20); // L: 2128
						var0.drawCentered("Ok", var4, var23 + 5, 16777215, 0); // L: 2129
					} else if (Login.loginIndex == 26) { // L: 2131
						var35 = 216; // L: 2132
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var35, 16776960, 0); // L: 2133
						var36 = var35 + 15; // L: 2134
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var36, 16776960, 0); // L: 2135
						var36 += 15; // L: 2136
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var36, 16776960, 0); // L: 2137
						var36 += 15; // L: 2138
						var4 = Login.loginBoxX + 180 - 80; // L: 2139
						var23 = 321; // L: 2140
						Login.field912.drawAt(var4 - 73, var23 - 20); // L: 2141
						var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0); // L: 2142
						var4 = Login.loginBoxX + 180 + 80; // L: 2143
						Login.field912.drawAt(var4 - 73, var23 - 20); // L: 2144
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 2145
					}
				}
			}

			if (Client.gameState >= 10) { // L: 2148
				int[] var31 = new int[4]; // L: 2149
				Rasterizer2D.Rasterizer2D_getClipArray(var31); // L: 2150
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class143.canvasHeight); // L: 2151
				ArchiveDiskActionHandler.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle); // L: 2152
				ArchiveDiskActionHandler.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle); // L: 2153
				Rasterizer2D.Rasterizer2D_setClipArray(var31); // L: 2154
			}

			class139.title_muteSprite[WorldMapSectionType.clientPreferences.method2445() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463); // L: 2156
			if (Client.gameState > 5 && Language.Language_EN == class69.clientLanguage) { // L: 2157
				if (FriendSystem.field801 != null) { // L: 2158
					var36 = Login.xPadding + 5; // L: 2159
					var37 = 463; // L: 2160
					byte var51 = 100; // L: 2161
					byte var54 = 35; // L: 2162
					FriendSystem.field801.drawAt(var36, var37); // L: 2163
					var0.drawCentered("World" + " " + Client.worldId, var51 / 2 + var36, var54 / 2 + var37 - 2, 16777215, 0); // L: 2164
					if (class16.World_request != null) { // L: 2165
						var1.drawCentered("Loading...", var51 / 2 + var36, var54 / 2 + var37 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var51 / 2 + var36, var54 / 2 + var37 + 12, 16777215, 0); // L: 2166
					}
				} else {
					FriendSystem.field801 = class368.SpriteBuffer_getIndexedSpriteByName(class143.archive8, "sl_button", ""); // L: 2169
				}
			}

		}
	} // L: 1658 2172
}
