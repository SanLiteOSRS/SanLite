import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("og")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -955085505
	)
	@Export("world")
	public final int world;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = -3722789001910041869L
	)
	@Export("age")
	public final long age;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("grandExchangeOffer")
	public final GrandExchangeOffer grandExchangeOffer;
	@ObfuscatedName("at")
	@Export("offerName")
	String offerName;
	@ObfuscatedName("an")
	@Export("previousOfferName")
	String previousOfferName;

	@ObfuscatedSignature(
		descriptor = "(Lur;BI)V"
	)
	GrandExchangeEvent(Buffer var1, byte var2, int var3) {
		this.offerName = var1.readStringCp1252NullTerminated(); // L: 111
		this.previousOfferName = var1.readStringCp1252NullTerminated(); // L: 112
		this.world = var1.readUnsignedShort(); // L: 113
		this.age = var1.readLong(); // L: 114
		int var4 = var1.readInt(); // L: 115
		int var5 = var1.readInt(); // L: 116
		this.grandExchangeOffer = new GrandExchangeOffer(); // L: 117
		this.grandExchangeOffer.method7146(2); // L: 118
		this.grandExchangeOffer.method7133(var2); // L: 119
		this.grandExchangeOffer.unitPrice = var4; // L: 120
		this.grandExchangeOffer.totalQuantity = var5; // L: 121
		this.grandExchangeOffer.currentQuantity = 0; // L: 122
		this.grandExchangeOffer.currentPrice = 0; // L: 123
		this.grandExchangeOffer.id = var3; // L: 124
	} // L: 125

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2117239986"
	)
	@Export("getOfferName")
	public String getOfferName() {
		return this.offerName; // L: 128
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-42"
	)
	@Export("getPreviousOfferName")
	public String getPreviousOfferName() {
		return this.previousOfferName; // L: 132
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpx;Lpx;Lpx;B)V",
		garbageValue = "1"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (class148.canvasWidth - 765) / 2; // L: 1328
		Login.loginBoxX = Login.xPadding + 202; // L: 1329
		ReflectionCheck.loginBoxCenter = Login.loginBoxX + 180; // L: 1330
		byte var3;
		int var4;
		int var7;
		int var25;
		int var32;
		int var45;
		if (Login.worldSelectOpen) { // L: 1331
			if (class325.worldSelectBackSprites == null) { // L: 1333
				Archive var46 = GameEngine.field201; // L: 1335
				SpritePixels[] var50;
				if (!var46.isValidFileName("sl_back", "")) { // L: 1337
					var50 = null; // L: 1338
				} else {
					var45 = var46.getGroupId("sl_back"); // L: 1341
					var25 = var46.getFileId(var45, ""); // L: 1342
					var50 = Player.method2379(var46, var45, var25); // L: 1343
				}

				class325.worldSelectBackSprites = var50; // L: 1345
			}

			if (class4.worldSelectFlagSprites == null) { // L: 1347
				class4.worldSelectFlagSprites = class416.method7648(GameEngine.field201, "sl_flags", "");
			}

			if (class136.worldSelectArrows == null) { // L: 1348
				class136.worldSelectArrows = class416.method7648(GameEngine.field201, "sl_arrows", "");
			}

			if (class7.worldSelectStars == null) { // L: 1349
				class7.worldSelectStars = class416.method7648(GameEngine.field201, "sl_stars", "");
			}

			if (UserComparator2.worldSelectLeftSprite == null) { // L: 1350
				UserComparator2.worldSelectLeftSprite = class153.SpriteBuffer_getIndexedSpriteByName(GameEngine.field201, "leftarrow", "");
			}

			if (DirectByteArrayCopier.worldSelectRightSprite == null) { // L: 1351
				DirectByteArrayCopier.worldSelectRightSprite = class153.SpriteBuffer_getIndexedSpriteByName(GameEngine.field201, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0); // L: 1352
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624); // L: 1353
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513); // L: 1354
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1); // L: 1355
			if (class7.worldSelectStars != null) { // L: 1356
				class7.worldSelectStars[1].drawAt(Login.xPadding + 140, 1); // L: 1357
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1); // L: 1358
				class7.worldSelectStars[0].drawAt(Login.xPadding + 140, 12); // L: 1359
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1); // L: 1360
			}

			if (class136.worldSelectArrows != null) { // L: 1362
				var32 = Login.xPadding + 280; // L: 1363
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) { // L: 1364
					class136.worldSelectArrows[2].drawAt(var32, 4);
				} else {
					class136.worldSelectArrows[0].drawAt(var32, 4); // L: 1365
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) { // L: 1366
					class136.worldSelectArrows[3].drawAt(var32 + 15, 4);
				} else {
					class136.worldSelectArrows[1].drawAt(var32 + 15, 4); // L: 1367
				}

				var0.draw("World", var32 + 32, 17, 16777215, -1); // L: 1368
				var4 = Login.xPadding + 390; // L: 1369
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) { // L: 1370
					class136.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					class136.worldSelectArrows[0].drawAt(var4, 4); // L: 1371
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) { // L: 1372
					class136.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					class136.worldSelectArrows[1].drawAt(var4 + 15, 4); // L: 1373
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1); // L: 1374
				var45 = Login.xPadding + 500; // L: 1375
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) { // L: 1376
					class136.worldSelectArrows[2].drawAt(var45, 4);
				} else {
					class136.worldSelectArrows[0].drawAt(var45, 4); // L: 1377
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) { // L: 1378
					class136.worldSelectArrows[3].drawAt(var45 + 15, 4);
				} else {
					class136.worldSelectArrows[1].drawAt(var45 + 15, 4); // L: 1379
				}

				var0.draw("Location", var45 + 32, 17, 16777215, -1); // L: 1380
				var25 = Login.xPadding + 610; // L: 1381
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) { // L: 1382
					class136.worldSelectArrows[2].drawAt(var25, 4);
				} else {
					class136.worldSelectArrows[0].drawAt(var25, 4); // L: 1383
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) { // L: 1384
					class136.worldSelectArrows[3].drawAt(var25 + 15, 4);
				} else {
					class136.worldSelectArrows[1].drawAt(var25 + 15, 4); // L: 1385
				}

				var0.draw("Type", var25 + 32, 17, 16777215, -1); // L: 1386
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0); // L: 1388
			var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1); // L: 1389
			Login.hoveredWorldIndex = -1; // L: 1390
			if (class325.worldSelectBackSprites != null) { // L: 1391
				var3 = 88; // L: 1392
				byte var41 = 19; // L: 1393
				var45 = 765 / (var3 + 1) - 1; // L: 1394
				var25 = 480 / (var41 + 1); // L: 1395

				int var35;
				do {
					var7 = var25; // L: 1397
					var35 = var45; // L: 1398
					if (var25 * (var45 - 1) >= World.World_count) { // L: 1399
						--var45;
					}

					if (var45 * (var25 - 1) >= World.World_count) { // L: 1400
						--var25;
					}

					if (var45 * (var25 - 1) >= World.World_count) { // L: 1401
						--var25;
					}
				} while(var7 != var25 || var45 != var35); // L: 1402

				var7 = (765 - var3 * var45) / (var45 + 1); // L: 1404
				if (var7 > 5) { // L: 1405
					var7 = 5;
				}

				var35 = (480 - var25 * var41) / (var25 + 1); // L: 1406
				if (var35 > 5) { // L: 1407
					var35 = 5;
				}

				int var37 = (765 - var45 * var3 - var7 * (var45 - 1)) / 2; // L: 1408
				int var38 = (480 - var41 * var25 - var35 * (var25 - 1)) / 2; // L: 1409
				int var28 = (var25 + World.World_count - 1) / var25; // L: 1410
				Login.worldSelectPagesCount = var28 - var45; // L: 1411
				if (UserComparator2.worldSelectLeftSprite != null && Login.worldSelectPage > 0) { // L: 1412
					UserComparator2.worldSelectLeftSprite.drawAt(8, class342.canvasHeight / 2 - UserComparator2.worldSelectLeftSprite.subHeight * 61063424 / 2); // L: 1413
				}

				if (DirectByteArrayCopier.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) { // L: 1415
					DirectByteArrayCopier.worldSelectRightSprite.drawAt(class148.canvasWidth - DirectByteArrayCopier.worldSelectRightSprite.subWidth - 8, class342.canvasHeight / 2 - DirectByteArrayCopier.worldSelectRightSprite.subHeight * 61063424 / 2); // L: 1416
				}

				int var29 = var38 + 23; // L: 1418
				int var39 = var37 + Login.xPadding; // L: 1419
				int var40 = 0; // L: 1420
				boolean var42 = false; // L: 1421
				int var43 = Login.worldSelectPage; // L: 1422

				int var17;
				for (var17 = var25 * var43; var17 < World.World_count && var43 - Login.worldSelectPage < var45; ++var17) { // L: 1423 1424
					World var18 = World.World_worlds[var17]; // L: 1427
					boolean var19 = true; // L: 1428
					String var20 = Integer.toString(var18.population); // L: 1429
					if (var18.population == -1) { // L: 1430
						var20 = "OFF"; // L: 1431
						var19 = false; // L: 1432
					} else if (var18.population > 1980) { // L: 1434
						var20 = "FULL"; // L: 1435
						var19 = false; // L: 1436
					}

					class109 var21 = null; // L: 1438
					int var22 = 0; // L: 1439
					if (var18.isBeta()) { // L: 1440
						var21 = var18.isMembersOnly() ? class109.field1405 : class109.field1416; // L: 1441
					} else if (var18.isDeadman()) { // L: 1443
						var21 = var18.isMembersOnly() ? class109.field1413 : class109.field1398; // L: 1444
					} else if (var18.method1821()) { // L: 1446
						var22 = 16711680; // L: 1447
						var21 = var18.isMembersOnly() ? class109.field1403 : class109.field1412; // L: 1448
					} else if (var18.method1799()) { // L: 1450
						var21 = var18.isMembersOnly() ? class109.field1407 : class109.field1404; // L: 1451
					} else if (var18.isPvp()) { // L: 1453
						var21 = var18.isMembersOnly() ? class109.field1401 : class109.field1400; // L: 1454
					} else if (var18.method1804()) { // L: 1456
						var21 = var18.isMembersOnly() ? class109.field1409 : class109.field1408; // L: 1457
					} else if (var18.method1798()) { // L: 1459
						var21 = var18.isMembersOnly() ? class109.field1411 : class109.field1406; // L: 1460
					}

					if (var21 == null || var21.field1414 >= class325.worldSelectBackSprites.length) { // L: 1462
						var21 = var18.isMembersOnly() ? class109.field1417 : class109.field1410; // L: 1463
					}

					if (MouseHandler.MouseHandler_x >= var39 && MouseHandler.MouseHandler_y >= var29 && MouseHandler.MouseHandler_x < var3 + var39 && MouseHandler.MouseHandler_y < var29 + var41 && var19) { // L: 1465
						Login.hoveredWorldIndex = var17; // L: 1466
						class325.worldSelectBackSprites[var21.field1414].drawTransOverlayAt(var39, var29, 128, 16777215); // L: 1467
						var42 = true; // L: 1468
					} else {
						class325.worldSelectBackSprites[var21.field1414].drawAt(var39, var29); // L: 1470
					}

					if (class4.worldSelectFlagSprites != null) { // L: 1471
						class4.worldSelectFlagSprites[(var18.isMembersOnly() ? 8 : 0) + var18.location].drawAt(var39 + 29, var29);
					}

					var0.drawCentered(Integer.toString(var18.id), var39 + 15, var41 / 2 + var29 + 5, var22, -1); // L: 1472
					var1.drawCentered(var20, var39 + 60, var41 / 2 + var29 + 5, 268435455, -1); // L: 1473
					var29 = var29 + var41 + var35; // L: 1474
					++var40; // L: 1475
					if (var40 >= var25) {
						var29 = var38 + 23; // L: 1476
						var39 = var39 + var7 + var3; // L: 1477
						var40 = 0; // L: 1478
						++var43; // L: 1479
					}
				}

				if (var42) { // L: 1482
					var17 = var1.stringWidth(World.World_worlds[Login.hoveredWorldIndex].activity) + 6; // L: 1483
					int var30 = var1.ascent + 8; // L: 1484
					int var44 = MouseHandler.MouseHandler_y + 25; // L: 1485
					if (var30 + var44 > 480) { // L: 1486
						var44 = MouseHandler.MouseHandler_y - 25 - var30; // L: 1487
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var17 / 2, var44, var17, var30, 16777120); // L: 1489
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var17 / 2, var44, var17, var30, 0); // L: 1490
					var1.drawCentered(World.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var44 + var1.ascent + 4, 0, -1); // L: 1491
				}
			}

		} else {
			class430.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1497
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1498
			class390.logoSprite.drawAt(Login.xPadding + 382 - class390.logoSprite.subWidth / 2, 18); // L: 1499
			if (Client.gameState == 0 || Client.gameState == 5) { // L: 1500
				var3 = 20; // L: 1501
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1); // L: 1502
				var4 = 253 - var3; // L: 1503
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409); // L: 1504
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0); // L: 1505
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409); // L: 1506
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.Login_loadingPercent * 3 + (Login.loginBoxX + 180 - 150), var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0); // L: 1507
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1); // L: 1508
			}

			String var5;
			String var6;
			short var31;
			short var33;
			if (Client.gameState == 20) { // L: 1510
				Login.titleboxSprite.drawAt(Login.loginBoxX + 180 - Login.titleboxSprite.subWidth / 2, 271 - Login.titleboxSprite.subHeight * 61063424 / 2); // L: 1511
				var31 = 201; // L: 1512
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0); // L: 1513
				var32 = var31 + 15; // L: 1514
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1515
				var32 += 15; // L: 1516
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1517
				var32 += 15; // L: 1518
				var32 += 7; // L: 1519
				if (Login.loginIndex != 4 && Login.loginIndex != 10) { // L: 1520
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var32, 16777215, 0); // L: 1521
					var33 = 200; // L: 1522

					for (var5 = UserComparator10.method2926(); var0.stringWidth(var5) > var33; var5 = var5.substring(0, var5.length() - 1)) { // L: 1523 1524 1525
					}

					var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var32, 16777215, 0); // L: 1527
					var32 += 15; // L: 1528

					for (var6 = class132.method3057(Login.Login_password); var0.stringWidth(var6) > var33; var6 = var6.substring(1)) { // L: 1529 1530 1531
					}

					var0.draw("Password: " + var6, Login.loginBoxX + 180 - 108, var32, 16777215, 0); // L: 1533
					var32 += 15; // L: 1534
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) { // L: 1537
				Login.titleboxSprite.drawAt(Login.loginBoxX, 171); // L: 1538
				short var23;
				if (Login.loginIndex == 0) { // L: 1539
					var31 = 251; // L: 1540
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var31, 16776960, 0); // L: 1541
					var32 = var31 + 30; // L: 1542
					var4 = Login.loginBoxX + 180 - 80; // L: 1543
					var23 = 291; // L: 1544
					Login.field925.drawAt(var4 - 73, var23 - 20); // L: 1545
					var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1546
					var4 = Login.loginBoxX + 180 + 80; // L: 1547
					Login.field925.drawAt(var4 - 73, var23 - 20); // L: 1548
					var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1549
				} else if (Login.loginIndex == 1) { // L: 1551
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0); // L: 1552
					var31 = 236; // L: 1553
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16777215, 0); // L: 1554
					var32 = var31 + 15; // L: 1555
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1556
					var32 += 15; // L: 1557
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1558
					var32 += 15; // L: 1559
					var4 = Login.loginBoxX + 180 - 80; // L: 1560
					var23 = 321; // L: 1561
					Login.field925.drawAt(var4 - 73, var23 - 20); // L: 1562
					var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0); // L: 1563
					var4 = Login.loginBoxX + 180 + 80; // L: 1564
					Login.field925.drawAt(var4 - 73, var23 - 20); // L: 1565
					var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0); // L: 1566
				} else if (Login.loginIndex == 2) { // L: 1568
					var31 = 201; // L: 1569
					var0.drawCentered(Login.Login_response1, ReflectionCheck.loginBoxCenter, var31, 16776960, 0); // L: 1570
					var32 = var31 + 15; // L: 1571
					var0.drawCentered(Login.Login_response2, ReflectionCheck.loginBoxCenter, var32, 16776960, 0); // L: 1572
					var32 += 15; // L: 1573
					var0.drawCentered(Login.Login_response3, ReflectionCheck.loginBoxCenter, var32, 16776960, 0); // L: 1574
					var32 += 15; // L: 1575
					var32 += 7; // L: 1576
					var0.draw("Login: ", ReflectionCheck.loginBoxCenter - 110, var32, 16777215, 0); // L: 1577
					var33 = 200; // L: 1578

					for (var5 = UserComparator10.method2926(); var0.stringWidth(var5) > var33; var5 = var5.substring(1)) { // L: 1579 1580 1581
					}

					var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? Decimator.colorStartTag(16776960) + "|" : ""), ReflectionCheck.loginBoxCenter - 70, var32, 16777215, 0); // L: 1583
					var32 += 15; // L: 1584

					for (var6 = class132.method3057(Login.Login_password); var0.stringWidth(var6) > var33; var6 = var6.substring(1)) { // L: 1585 1586 1587
					}

					var0.draw("Password: " + var6 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? Decimator.colorStartTag(16776960) + "|" : ""), ReflectionCheck.loginBoxCenter - 108, var32, 16777215, 0); // L: 1589
					var32 += 15; // L: 1590
					var31 = 277; // L: 1591
					var7 = ReflectionCheck.loginBoxCenter + -117; // L: 1592
					boolean var9 = Client.Login_isUsernameRemembered; // L: 1594
					boolean var10 = Login.field949; // L: 1595
					IndexedSprite var26 = var9 ? (var10 ? class443.field4751 : class140.field1658) : (var10 ? TriBool.field4811 : class27.field125); // L: 1597
					var26.drawAt(var7, var31); // L: 1600
					var7 = var7 + var26.subWidth + 5; // L: 1601
					var1.draw("Remember username", var7, var31 + 13, 16776960, 0); // L: 1602
					var7 = ReflectionCheck.loginBoxCenter + 24; // L: 1603
					boolean var13 = NPC.clientPreferences.method2461(); // L: 1605
					boolean var14 = Login.field950; // L: 1606
					IndexedSprite var12 = var13 ? (var14 ? class443.field4751 : class140.field1658) : (var14 ? TriBool.field4811 : class27.field125); // L: 1608
					var12.drawAt(var7, var31); // L: 1611
					var7 = var7 + var12.subWidth + 5; // L: 1612
					var1.draw("Hide username", var7, var31 + 13, 16776960, 0); // L: 1613
					var32 = var31 + 15; // L: 1614
					int var15 = ReflectionCheck.loginBoxCenter - 80; // L: 1615
					short var16 = 321; // L: 1616
					Login.field925.drawAt(var15 - 73, var16 - 20); // L: 1617
					var0.drawCentered("Login", var15, var16 + 5, 16777215, 0); // L: 1618
					var15 = ReflectionCheck.loginBoxCenter + 80; // L: 1619
					Login.field925.drawAt(var15 - 73, var16 - 20); // L: 1620
					var0.drawCentered("Cancel", var15, var16 + 5, 16777215, 0); // L: 1621
					var31 = 357; // L: 1622
					switch(Login.field938) { // L: 1623
					case 2:
						class93.field1171 = "Having trouble logging in?"; // L: 1628
						break;
					default:
						class93.field1171 = "Can't login? Click here."; // L: 1625
					}

					Players.field1381 = new Bounds(ReflectionCheck.loginBoxCenter, var31, var1.stringWidth(class93.field1171), 11); // L: 1631
					class136.field1626 = new Bounds(ReflectionCheck.loginBoxCenter, var31, var1.stringWidth("Still having trouble logging in?"), 11); // L: 1632
					var1.drawCentered(class93.field1171, ReflectionCheck.loginBoxCenter, var31, 16777215, 0); // L: 1633
				} else if (Login.loginIndex == 3) { // L: 1635
					var31 = 201; // L: 1636
					var0.drawCentered("Incorrect username or password.", Login.loginBoxX + 180, var31, 16776960, 0); // L: 1637
					var32 = var31 + 20; // L: 1638
					var1.drawCentered("If you have upgraded to a Jagex Account, you", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1639
					var32 += 20; // L: 1640
					var1.drawCentered("need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1641
					var32 += 15; // L: 1642
					var4 = Login.loginBoxX + 180; // L: 1643
					var23 = 276; // L: 1644
					Login.field925.drawAt(var4 - 73, var23 - 20); // L: 1645
					var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0); // L: 1646
					var4 = Login.loginBoxX + 180; // L: 1647
					var23 = 326; // L: 1648
					Login.field925.drawAt(var4 - 73, var23 - 20); // L: 1649
					var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0); // L: 1650
				} else {
					short var8;
					if (Login.loginIndex == 4) { // L: 1652
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1653
						var31 = 236; // L: 1654
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16777215, 0); // L: 1655
						var32 = var31 + 15; // L: 1656
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1657
						var32 += 15; // L: 1658
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1659
						var32 += 15; // L: 1660
						var0.draw("PIN: " + class132.method3057(class27.otp) + (Client.cycle % 40 < 20 ? Decimator.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var32, 16777215, 0); // L: 1661
						var32 -= 8; // L: 1662
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var32, 16776960, 0); // L: 1663
						var32 += 15; // L: 1664
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var32, 16776960, 0); // L: 1665
						var4 = 180 + Login.loginBoxX - 9 + var0.stringWidth("for 30 days: ") + 15; // L: 1666
						var45 = var32 - var0.ascent; // L: 1667
						IndexedSprite var34;
						if (Login.field951) { // L: 1669
							var34 = class140.field1658; // L: 1670
						} else {
							var34 = class27.field125; // L: 1673
						}

						var34.drawAt(var4, var45); // L: 1675
						var32 += 15; // L: 1676
						var7 = Login.loginBoxX + 180 - 80; // L: 1677
						var8 = 321; // L: 1678
						Login.field925.drawAt(var7 - 73, var8 - 20); // L: 1679
						var0.drawCentered("Continue", var7, var8 + 5, 16777215, 0); // L: 1680
						var7 = Login.loginBoxX + 180 + 80; // L: 1681
						Login.field925.drawAt(var7 - 73, var8 - 20); // L: 1682
						var0.drawCentered("Cancel", var7, var8 + 5, 16777215, 0); // L: 1683
						var1.drawCentered("Can't login? Click here.", Login.loginBoxX + 180, var8 + 36, 16777215, 0); // L: 1684
					} else if (Login.loginIndex == 5) { // L: 1686
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1687
						var31 = 221; // L: 1688
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0); // L: 1689
						var32 = var31 + 15; // L: 1690
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1691
						var32 += 15; // L: 1692
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1693
						var32 += 15; // L: 1694
						var32 += 14; // L: 1695
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var32, 16777215, 0); // L: 1696
						var33 = 174; // L: 1697

						for (var5 = UserComparator10.method2926(); var0.stringWidth(var5) > var33; var5 = var5.substring(1)) { // L: 1698 1699 1700
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? Decimator.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var32, 16777215, 0); // L: 1702
						var32 += 15; // L: 1703
						var25 = Login.loginBoxX + 180 - 80; // L: 1704
						short var36 = 321; // L: 1705
						Login.field925.drawAt(var25 - 73, var36 - 20); // L: 1706
						var0.drawCentered("Recover", var25, var36 + 5, 16777215, 0); // L: 1707
						var25 = Login.loginBoxX + 180 + 80; // L: 1708
						Login.field925.drawAt(var25 - 73, var36 - 20); // L: 1709
						var0.drawCentered("Back", var25, var36 + 5, 16777215, 0); // L: 1710
						var36 = 356; // L: 1711
						var1.drawCentered("Still having trouble logging in?", ReflectionCheck.loginBoxCenter, var36, 268435455, 0); // L: 1712
					} else if (Login.loginIndex == 6) { // L: 1714
						var31 = 201; // L: 1715
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0); // L: 1716
						var32 = var31 + 15; // L: 1717
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1718
						var32 += 15; // L: 1719
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1720
						var32 += 15; // L: 1721
						var4 = Login.loginBoxX + 180; // L: 1722
						var23 = 321; // L: 1723
						Login.field925.drawAt(var4 - 73, var23 - 20); // L: 1724
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1725
					} else if (Login.loginIndex == 7) { // L: 1727
						if (WorldMapRectangle.field3108 && !Client.onMobile) { // L: 1728
							var31 = 201; // L: 1729
							var0.drawCentered(Login.Login_response1, ReflectionCheck.loginBoxCenter, var31, 16776960, 0); // L: 1730
							var32 = var31 + 15; // L: 1731
							var0.drawCentered(Login.Login_response2, ReflectionCheck.loginBoxCenter, var32, 16776960, 0); // L: 1732
							var32 += 15; // L: 1733
							var0.drawCentered(Login.Login_response3, ReflectionCheck.loginBoxCenter, var32, 16776960, 0); // L: 1734
							var4 = ReflectionCheck.loginBoxCenter - 150; // L: 1735
							var32 += 10; // L: 1736

							for (var45 = 0; var45 < 8; ++var45) { // L: 1737
								Login.field925.method9686(var4, var32, 30, 40); // L: 1738
								boolean var47 = var45 == Login.field946 & Client.cycle % 40 < 20; // L: 1739
								var0.draw((Login.field931[var45] == null ? "" : Login.field931[var45]) + (var47 ? Decimator.colorStartTag(16776960) + "|" : ""), var4 + 10, var32 + 27, 16777215, 0); // L: 1740
								if (var45 != 1 && var45 != 3) { // L: 1741
									var4 += 35; // L: 1746
								} else {
									var4 += 50; // L: 1742
									var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var32 + 27, 16777215, 0); // L: 1743
								}
							}

							var45 = ReflectionCheck.loginBoxCenter - 80; // L: 1749
							short var48 = 321; // L: 1750
							Login.field925.drawAt(var45 - 73, var48 - 20); // L: 1751
							var0.drawCentered("Submit", var45, var48 + 5, 16777215, 0); // L: 1752
							var45 = ReflectionCheck.loginBoxCenter + 80; // L: 1753
							Login.field925.drawAt(var45 - 73, var48 - 20); // L: 1754
							var0.drawCentered("Cancel", var45, var48 + 5, 16777215, 0); // L: 1755
						} else {
							var31 = 216; // L: 1758
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var31, 16776960, 0); // L: 1759
							var32 = var31 + 15; // L: 1760
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1761
							var32 += 15; // L: 1762
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1763
							var32 += 15; // L: 1764
							var4 = Login.loginBoxX + 180 - 80; // L: 1765
							var23 = 321; // L: 1766
							Login.field925.drawAt(var4 - 73, var23 - 20); // L: 1767
							var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0); // L: 1768
							var4 = Login.loginBoxX + 180 + 80; // L: 1769
							Login.field925.drawAt(var4 - 73, var23 - 20); // L: 1770
							var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1771
						}
					} else if (Login.loginIndex == 8) { // L: 1774
						var31 = 216; // L: 1775
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var31, 16776960, 0); // L: 1776
						var32 = var31 + 15; // L: 1777
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1778
						var32 += 15; // L: 1779
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1780
						var32 += 15; // L: 1781
						var4 = Login.loginBoxX + 180 - 80; // L: 1782
						var23 = 321; // L: 1783
						Login.field925.drawAt(var4 - 73, var23 - 20); // L: 1784
						var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0); // L: 1785
						var4 = Login.loginBoxX + 180 + 80; // L: 1786
						Login.field925.drawAt(var4 - 73, var23 - 20); // L: 1787
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1788
					} else if (Login.loginIndex == 9) { // L: 1790
						var31 = 221; // L: 1791
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0); // L: 1792
						var32 = var31 + 25; // L: 1793
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1794
						var32 += 25; // L: 1795
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1796
						var4 = Login.loginBoxX + 180; // L: 1797
						var23 = 311; // L: 1798
						Login.field925.drawAt(var4 - 73, var23 - 20); // L: 1799
						var0.drawCentered("Try again", var4, var23 + 5, 16777215, 0); // L: 1800
					} else if (Login.loginIndex == 10) { // L: 1802
						var32 = Login.loginBoxX + 180; // L: 1803
						var33 = 209; // L: 1804
						var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1805
						var4 = var33 + 20; // L: 1806
						class86.field1065.drawAt(var32 - 109, var4); // L: 1807
						if (Login.field953.isEmpty()) { // L: 1808
							class179.field1901.drawAt(var32 - 48, var4 + 18); // L: 1809
						} else {
							class179.field1901.drawAt(var32 - 48, var4 + 5); // L: 1812
							var0.drawCentered(Login.field953, var32, var4 + 68 - 15, 16776960, 0); // L: 1813
						}
					} else if (Login.loginIndex == 12) { // L: 1816
						var32 = ReflectionCheck.loginBoxCenter; // L: 1817
						var33 = 216; // L: 1818
						var2.drawCentered("Before using this app, please read and accept our", var32, var33, 16777215, 0); // L: 1819
						var4 = var33 + 17; // L: 1820
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var32, var4, 16777215, 0); // L: 1821
						var4 += 17; // L: 1822
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var32, var4, 16777215, 0); // L: 1823
						var4 += 17; // L: 1824
						var2.drawCentered("By accepting, you agree to these documents.", var32, var4, 16777215, 0); // L: 1825
						var32 = ReflectionCheck.loginBoxCenter - 80; // L: 1826
						var33 = 311; // L: 1827
						Login.field925.drawAt(var32 - 73, var33 - 20); // L: 1828
						var0.drawCentered("Accept", var32, var33 + 5, 16777215, 0); // L: 1829
						var32 = ReflectionCheck.loginBoxCenter + 80; // L: 1830
						Login.field925.drawAt(var32 - 73, var33 - 20); // L: 1831
						var0.drawCentered("Decline", var32, var33 + 5, 16777215, 0); // L: 1832
					} else if (Login.loginIndex == 13) { // L: 1834
						var31 = 231; // L: 1835
						var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var31, 16777215, 0); // L: 1836
						var32 = var31 + 20; // L: 1837
						var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var32, 16777215, 0); // L: 1838
						var4 = Login.loginBoxX + 180; // L: 1839
						var31 = 311; // L: 1840
						Login.field925.drawAt(var4 - 73, var31 - 20); // L: 1841
						var0.drawCentered("Back", var4, var31 + 5, 16777215, 0); // L: 1842
					} else if (Login.loginIndex == 14) { // L: 1844
						var31 = 201; // L: 1845
						String var24 = ""; // L: 1846
						var5 = ""; // L: 1847
						var6 = ""; // L: 1848
						switch(Login.field957) { // L: 1849
						case 0:
							var24 = "Your account has been involved"; // L: 1859
							var5 = "in serious rule breaking."; // L: 1860
							var6 = ""; // L: 1861
							break; // L: 1862
						case 1:
							var24 = "Your account has been locked due to"; // L: 1852
							var5 = "suspicious activity."; // L: 1853
							var6 = "Please recover your account."; // L: 1854
							break;
						case 2:
							var24 = "The unpaid balance on your account needs"; // L: 1866
							var5 = "to be resolved before you can play."; // L: 1867
							var6 = class369.field4137; // L: 1868
							break; // L: 1869
						default:
							class130.Login_promptCredentials(false); // L: 1873
						}

						var0.drawCentered(var24, Login.loginBoxX + 180, var31, 16776960, 0); // L: 1877
						var32 = var31 + 20; // L: 1878
						var0.drawCentered(var5, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1879
						var32 += 20; // L: 1880
						var0.drawCentered(var6, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1881
						var7 = Login.loginBoxX + 180; // L: 1882
						var8 = 276; // L: 1883
						Login.field925.drawAt(var7 - 73, var8 - 20); // L: 1884
						if (Login.field957 == 1) { // L: 1885
							var0.drawCentered("Recover Account", var7, var8 + 5, 16777215, 0); // L: 1886
						} else {
							var0.drawCentered("View Appeal Options", var7, var8 + 5, 16777215, 0); // L: 1889
						}

						var7 = Login.loginBoxX + 180; // L: 1891
						var8 = 326; // L: 1892
						Login.field925.drawAt(var7 - 73, var8 - 20); // L: 1893
						var0.drawCentered("Back", var7, var8 + 5, 16777215, 0); // L: 1894
					} else if (Login.loginIndex == 24) { // L: 1896
						var31 = 221; // L: 1897
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16777215, 0); // L: 1898
						var32 = var31 + 15; // L: 1899
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1900
						var32 += 15; // L: 1901
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1902
						var32 += 15; // L: 1903
						var4 = Login.loginBoxX + 180; // L: 1904
						var23 = 301; // L: 1905
						Login.field925.drawAt(var4 - 73, var23 - 20); // L: 1906
						var0.drawCentered("Ok", var4, var23 + 5, 16777215, 0); // L: 1907
					} else if (Login.loginIndex == 32) { // L: 1909
						var31 = 216; // L: 1910
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var31, 16776960, 0); // L: 1911
						var32 = var31 + 15; // L: 1912
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1913
						var32 += 15; // L: 1914
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1915
						var32 += 15; // L: 1916
						var4 = Login.loginBoxX + 180 - 80; // L: 1917
						var23 = 321; // L: 1918
						Login.field925.drawAt(var4 - 73, var23 - 20); // L: 1919
						var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0); // L: 1920
						var4 = Login.loginBoxX + 180 + 80; // L: 1921
						Login.field925.drawAt(var4 - 73, var23 - 20); // L: 1922
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1923
					} else if (Login.loginIndex == 33) { // L: 1925
						var31 = 201; // L: 1926
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0); // L: 1927
						var32 = var31 + 20; // L: 1928
						var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1929
						var32 += 20; // L: 1930
						var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1931
						var32 += 15; // L: 1932
						var4 = Login.loginBoxX + 180; // L: 1933
						var23 = 276; // L: 1934
						Login.field925.drawAt(var4 - 73, var23 - 20); // L: 1935
						var2.drawCentered("Download Launcher", var4, var23 + 5, 16777215, 0); // L: 1936
						var4 = Login.loginBoxX + 180; // L: 1937
						var23 = 326; // L: 1938
						Login.field925.drawAt(var4 - 73, var23 - 20); // L: 1939
						var2.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1940
					}
				}
			}

			if (Client.gameState >= 10) { // L: 1943
				int[] var27 = new int[4]; // L: 1944
				Rasterizer2D.Rasterizer2D_getClipArray(var27); // L: 1945
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class342.canvasHeight); // L: 1946
				class59.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle); // L: 1947
				class59.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle); // L: 1948
				Rasterizer2D.Rasterizer2D_setClipArray(var27); // L: 1949
			}

			ApproximateRouteStrategy.title_muteSprite[NPC.clientPreferences.method2463() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463); // L: 1951
			if (Client.gameState > 5 && Language.Language_EN == GraphicsObject.clientLanguage) { // L: 1952
				if (class1.field3 != null) { // L: 1953
					var32 = Login.xPadding + 5; // L: 1954
					var33 = 463; // L: 1955
					byte var51 = 100; // L: 1956
					byte var49 = 35; // L: 1957
					class1.field3.drawAt(var32, var33); // L: 1958
					var0.drawCentered("World" + " " + Client.worldId, var51 / 2 + var32, var49 / 2 + var33 - 2, 16777215, 0); // L: 1959
					if (class529.World_request != null) { // L: 1960
						var1.drawCentered("Loading...", var51 / 2 + var32, var49 / 2 + var33 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var51 / 2 + var32, var49 / 2 + var33 + 12, 16777215, 0); // L: 1961
					}
				} else {
					class1.field3 = class153.SpriteBuffer_getIndexedSpriteByName(GameEngine.field201, "sl_button", ""); // L: 1964
				}
			}

		}
	} // L: 1495 1967
}
