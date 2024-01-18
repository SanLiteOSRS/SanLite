import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
public class class207 extends class222 {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -401581131
	)
	int field2264;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	final class219 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lih;Ljava/lang/String;I)V"
	)
	class207(class219 var1, String var2, int var3) {
		super(var1, var2); // L: 342
		this.this$0 = var1; // L: 341
		this.field2264 = var3; // L: 343
	} // L: 344

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "945435280"
	)
	public int vmethod4368() {
		return 0; // L: 347
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1115253500"
	)
	public int vmethod4370() {
		return this.field2264; // L: 352
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lpv;Lpv;Lpv;I)V",
		garbageValue = "413956403"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (class524.canvasWidth - 765) / 2; // L: 1283
		Login.loginBoxX = Login.xPadding + 202; // L: 1284
		class433.loginBoxCenter = Login.loginBoxX + 180; // L: 1285
		byte var3;
		int var4;
		int var8;
		boolean var15;
		int var16;
		int var25;
		int var33;
		int var43;
		if (Login.worldSelectOpen) { // L: 1286
			int var47;
			if (class167.worldSelectBackSprites == null) { // L: 1288
				Archive var44 = class19.field94; // L: 1290
				SpritePixels[] var48;
				if (!var44.isValidFileName("sl_back", "")) { // L: 1292
					var48 = null; // L: 1293
				} else {
					var43 = var44.getGroupId("sl_back"); // L: 1296
					var47 = var44.getFileId(var43, ""); // L: 1297
					var48 = class217.method4289(var44, var43, var47); // L: 1298
				}

				class167.worldSelectBackSprites = var48; // L: 1300
			}

			if (class131.worldSelectFlagSprites == null) { // L: 1302
				class131.worldSelectFlagSprites = class412.method7748(class19.field94, "sl_flags", "");
			}

			if (Client.worldSelectArrows == null) { // L: 1303
				Client.worldSelectArrows = class412.method7748(class19.field94, "sl_arrows", "");
			}

			if (class326.worldSelectStars == null) { // L: 1304
				class326.worldSelectStars = class412.method7748(class19.field94, "sl_stars", "");
			}

			if (class174.worldSelectLeftSprite == null) { // L: 1305
				class174.worldSelectLeftSprite = VarcInt.SpriteBuffer_getIndexedSpriteByName(class19.field94, "leftarrow", "");
			}

			if (Login.worldSelectRightSprite == null) { // L: 1306
				Login.worldSelectRightSprite = VarcInt.SpriteBuffer_getIndexedSpriteByName(class19.field94, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0); // L: 1307
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624); // L: 1308
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513); // L: 1309
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1); // L: 1310
			if (class326.worldSelectStars != null) { // L: 1311
				class326.worldSelectStars[1].drawAt(Login.xPadding + 140, 1); // L: 1312
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1); // L: 1313
				class326.worldSelectStars[0].drawAt(Login.xPadding + 140, 12); // L: 1314
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1); // L: 1315
			}

			if (Client.worldSelectArrows != null) { // L: 1317
				var33 = Login.xPadding + 280; // L: 1318
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) { // L: 1319
					Client.worldSelectArrows[2].drawAt(var33, 4);
				} else {
					Client.worldSelectArrows[0].drawAt(var33, 4); // L: 1320
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) { // L: 1321
					Client.worldSelectArrows[3].drawAt(var33 + 15, 4);
				} else {
					Client.worldSelectArrows[1].drawAt(var33 + 15, 4); // L: 1322
				}

				var0.draw("World", var33 + 32, 17, 16777215, -1); // L: 1323
				var4 = Login.xPadding + 390; // L: 1324
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) { // L: 1325
					Client.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					Client.worldSelectArrows[0].drawAt(var4, 4); // L: 1326
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) { // L: 1327
					Client.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					Client.worldSelectArrows[1].drawAt(var4 + 15, 4); // L: 1328
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1); // L: 1329
				var43 = Login.xPadding + 500; // L: 1330
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) { // L: 1331
					Client.worldSelectArrows[2].drawAt(var43, 4);
				} else {
					Client.worldSelectArrows[0].drawAt(var43, 4); // L: 1332
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) { // L: 1333
					Client.worldSelectArrows[3].drawAt(var43 + 15, 4);
				} else {
					Client.worldSelectArrows[1].drawAt(var43 + 15, 4); // L: 1334
				}

				var0.draw("Location", var43 + 32, 17, 16777215, -1); // L: 1335
				var47 = Login.xPadding + 610; // L: 1336
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) { // L: 1337
					Client.worldSelectArrows[2].drawAt(var47, 4);
				} else {
					Client.worldSelectArrows[0].drawAt(var47, 4); // L: 1338
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) { // L: 1339
					Client.worldSelectArrows[3].drawAt(var47 + 15, 4);
				} else {
					Client.worldSelectArrows[1].drawAt(var47 + 15, 4); // L: 1340
				}

				var0.draw("Type", var47 + 32, 17, 16777215, -1); // L: 1341
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0); // L: 1343
			var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1); // L: 1344
			Login.hoveredWorldIndex = -1; // L: 1345
			if (class167.worldSelectBackSprites != null) { // L: 1346
				var3 = 88; // L: 1347
				byte var40 = 19; // L: 1348
				var43 = 765 / (var3 + 1) - 1; // L: 1349
				var47 = 480 / (var40 + 1); // L: 1350

				do {
					var25 = var47; // L: 1352
					var8 = var43; // L: 1353
					if (var47 * (var43 - 1) >= World.World_count) { // L: 1354
						--var43;
					}

					if (var43 * (var47 - 1) >= World.World_count) { // L: 1355
						--var47;
					}

					if (var43 * (var47 - 1) >= World.World_count) { // L: 1356
						--var47;
					}
				} while(var25 != var47 || var8 != var43); // L: 1357

				var25 = (765 - var3 * var43) / (var43 + 1); // L: 1359
				if (var25 > 5) { // L: 1360
					var25 = 5;
				}

				var8 = (480 - var40 * var47) / (var47 + 1); // L: 1361
				if (var8 > 5) { // L: 1362
					var8 = 5;
				}

				int var28 = (765 - var3 * var43 - var25 * (var43 - 1)) / 2; // L: 1363
				int var37 = (480 - var47 * var40 - var8 * (var47 - 1)) / 2; // L: 1364
				int var38 = (var47 + World.World_count - 1) / var47; // L: 1365
				Login.worldSelectPagesCount = var38 - var43; // L: 1366
				if (class174.worldSelectLeftSprite != null && Login.worldSelectPage > 0) { // L: 1367
					class174.worldSelectLeftSprite.drawAt(8, GameEngine.canvasHeight / 2 - class174.worldSelectLeftSprite.subHeight / 2); // L: 1368
				}

				if (Login.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) { // L: 1370
					Login.worldSelectRightSprite.drawAt(class524.canvasWidth - Login.worldSelectRightSprite.subWidth - 8, GameEngine.canvasHeight / 2 - Login.worldSelectRightSprite.subHeight / 2); // L: 1371
				}

				int var29 = var37 + 23; // L: 1373
				int var30 = var28 + Login.xPadding; // L: 1374
				int var39 = 0; // L: 1375
				var15 = false; // L: 1376
				var16 = Login.worldSelectPage; // L: 1377

				int var41;
				for (var41 = var16 * var47; var41 < World.World_count && var16 - Login.worldSelectPage < var43; ++var41) { // L: 1378 1379
					World var18 = World.World_worlds[var41]; // L: 1382
					boolean var19 = true; // L: 1383
					String var20 = Integer.toString(var18.population); // L: 1384
					if (var18.population == -1) { // L: 1385
						var20 = "OFF"; // L: 1386
						var19 = false; // L: 1387
					} else if (var18.population > 1980) { // L: 1389
						var20 = "FULL"; // L: 1390
						var19 = false; // L: 1391
					}

					class108 var21 = null; // L: 1393
					int var22 = 0; // L: 1394
					if (var18.isBeta()) { // L: 1395
						var21 = var18.isMembersOnly() ? class108.field1369 : class108.field1362; // L: 1396
					} else if (var18.isDeadman()) { // L: 1398
						var21 = var18.isMembersOnly() ? class108.field1364 : class108.field1375; // L: 1399
					} else if (var18.method1842()) { // L: 1401
						var22 = 16711680; // L: 1402
						var21 = var18.isMembersOnly() ? class108.field1365 : class108.field1376; // L: 1403
					} else if (var18.method1844()) { // L: 1405
						var21 = var18.isMembersOnly() ? class108.field1371 : class108.field1370; // L: 1406
					} else if (var18.isPvp()) { // L: 1408
						var21 = var18.isMembersOnly() ? class108.field1382 : class108.field1368; // L: 1409
					} else if (var18.method1893()) { // L: 1411
						var21 = var18.isMembersOnly() ? class108.field1373 : class108.field1372; // L: 1412
					} else if (var18.method1858()) { // L: 1414
						var21 = var18.isMembersOnly() ? class108.field1367 : class108.field1374; // L: 1415
					}

					if (var21 == null || var21.field1378 >= class167.worldSelectBackSprites.length) { // L: 1417
						var21 = var18.isMembersOnly() ? class108.field1363 : class108.field1377; // L: 1418
					}

					if (MouseHandler.MouseHandler_x >= var30 && MouseHandler.MouseHandler_y >= var29 && MouseHandler.MouseHandler_x < var30 + var3 && MouseHandler.MouseHandler_y < var29 + var40 && var19) { // L: 1420
						Login.hoveredWorldIndex = var41; // L: 1421
						class167.worldSelectBackSprites[var21.field1378].drawTransOverlayAt(var30, var29, 128, 16777215); // L: 1422
						var15 = true; // L: 1423
					} else {
						class167.worldSelectBackSprites[var21.field1378].drawAt(var30, var29); // L: 1425
					}

					if (class131.worldSelectFlagSprites != null) { // L: 1426
						class131.worldSelectFlagSprites[(var18.isMembersOnly() ? 8 : 0) + var18.location].drawAt(var30 + 29, var29);
					}

					var0.drawCentered(Integer.toString(var18.id), var30 + 15, var40 / 2 + var29 + 5, var22, -1); // L: 1427
					var1.drawCentered(var20, var30 + 60, var40 / 2 + var29 + 5, 268435455, -1); // L: 1428
					var29 = var29 + var40 + var8; // L: 1429
					++var39; // L: 1430
					if (var39 >= var47) {
						var29 = var37 + 23; // L: 1431
						var30 = var30 + var25 + var3; // L: 1432
						var39 = 0; // L: 1433
						++var16; // L: 1434
					}
				}

				if (var15) { // L: 1437
					var41 = var1.stringWidth(World.World_worlds[Login.hoveredWorldIndex].activity) + 6; // L: 1438
					int var31 = var1.ascent + 8; // L: 1439
					int var42 = MouseHandler.MouseHandler_y + 25; // L: 1440
					if (var31 + var42 > 480) { // L: 1441
						var42 = MouseHandler.MouseHandler_y - 25 - var31; // L: 1442
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var41 / 2, var42, var41, var31, 16777120); // L: 1444
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var41 / 2, var42, var41, var31, 0); // L: 1445
					var1.drawCentered(World.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var42 + var1.ascent + 4, 0, -1); // L: 1446
				}
			}

		} else {
			Buddy.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1452
			SecureRandomCallable.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1453
			GrandExchangeEvents.logoSprite.drawAt(Login.xPadding + 382 - GrandExchangeEvents.logoSprite.subWidth / 2, 18); // L: 1454
			if (Client.gameState == 0 || Client.gameState == 5) { // L: 1455
				var3 = 20; // L: 1456
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1); // L: 1457
				var4 = 253 - var3; // L: 1458
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409); // L: 1459
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0); // L: 1460
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409); // L: 1461
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.Login_loadingPercent * 3 + (Login.loginBoxX + 180 - 150), var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0); // L: 1462
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1); // L: 1463
			}

			String var5;
			String var6;
			String var7;
			short var32;
			short var34;
			if (Client.gameState == 20) { // L: 1465
				Login.titleboxSprite.drawAt(Login.loginBoxX + 180 - Login.titleboxSprite.subWidth / 2, 271 - Login.titleboxSprite.subHeight / 2); // L: 1466
				var32 = 201; // L: 1467
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1468
				var33 = var32 + 15; // L: 1469
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1470
				var33 += 15; // L: 1471
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1472
				var33 += 15; // L: 1473
				var33 += 7; // L: 1474
				if (Login.loginIndex != 4 && Login.loginIndex != 10) { // L: 1475
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var33, 16777215, 0); // L: 1476
					var34 = 200; // L: 1477
					var5 = class93.clientPreferences.method2619() ? class313.method5999(Login.Login_username) : Login.Login_username; // L: 1480

					for (var6 = var5; var0.stringWidth(var6) > var34; var6 = var6.substring(0, var6.length() - 1)) { // L: 1482 1483 1484
					}

					var0.draw(AbstractFont.escapeBrackets(var6), Login.loginBoxX + 180 - 70, var33, 16777215, 0); // L: 1486
					var33 += 15; // L: 1487

					for (var7 = class313.method5999(Login.Login_password); var0.stringWidth(var7) > var34; var7 = var7.substring(1)) { // L: 1488 1489 1490
					}

					var0.draw("Password: " + var7, Login.loginBoxX + 180 - 108, var33, 16777215, 0); // L: 1492
					var33 += 15; // L: 1493
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) { // L: 1496
				Login.titleboxSprite.drawAt(Login.loginBoxX, 171); // L: 1497
				short var23;
				if (Login.loginIndex == 0) { // L: 1498
					var32 = 251; // L: 1499
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1500
					var33 = var32 + 30; // L: 1501
					var4 = Login.loginBoxX + 180 - 80; // L: 1502
					var23 = 291; // L: 1503
					class182.field1904.drawAt(var4 - 73, var23 - 20); // L: 1504
					var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1505
					var4 = Login.loginBoxX + 180 + 80; // L: 1506
					class182.field1904.drawAt(var4 - 73, var23 - 20); // L: 1507
					var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1508
				} else if (Login.loginIndex == 1) { // L: 1510
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0); // L: 1511
					var32 = 236; // L: 1512
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1513
					var33 = var32 + 15; // L: 1514
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16777215, 0); // L: 1515
					var33 += 15; // L: 1516
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16777215, 0); // L: 1517
					var33 += 15; // L: 1518
					var4 = Login.loginBoxX + 180 - 80; // L: 1519
					var23 = 321; // L: 1520
					class182.field1904.drawAt(var4 - 73, var23 - 20); // L: 1521
					var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0); // L: 1522
					var4 = Login.loginBoxX + 180 + 80; // L: 1523
					class182.field1904.drawAt(var4 - 73, var23 - 20); // L: 1524
					var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0); // L: 1525
				} else if (Login.loginIndex == 2) { // L: 1527
					var32 = 201; // L: 1528
					var0.drawCentered(Login.Login_response1, class433.loginBoxCenter, var32, 16776960, 0); // L: 1529
					var33 = var32 + 15; // L: 1530
					var0.drawCentered(Login.Login_response2, class433.loginBoxCenter, var33, 16776960, 0); // L: 1531
					var33 += 15; // L: 1532
					var0.drawCentered(Login.Login_response3, class433.loginBoxCenter, var33, 16776960, 0); // L: 1533
					var33 += 15; // L: 1534
					var33 += 7; // L: 1535
					var0.draw("Login: ", class433.loginBoxCenter - 110, var33, 16777215, 0); // L: 1536
					var34 = 200; // L: 1537
					var5 = class93.clientPreferences.method2619() ? class313.method5999(Login.Login_username) : Login.Login_username; // L: 1540

					for (var6 = var5; var0.stringWidth(var6) > var34; var6 = var6.substring(1)) { // L: 1542 1543 1544
					}

					var0.draw(AbstractFont.escapeBrackets(var6) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? class208.colorStartTag(16776960) + "|" : ""), class433.loginBoxCenter - 70, var33, 16777215, 0); // L: 1546
					var33 += 15; // L: 1547

					for (var7 = class313.method5999(Login.Login_password); var0.stringWidth(var7) > var34; var7 = var7.substring(1)) { // L: 1548 1549 1550
					}

					var0.draw("Password: " + var7 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? class208.colorStartTag(16776960) + "|" : ""), class433.loginBoxCenter - 108, var33, 16777215, 0); // L: 1552
					var33 += 15; // L: 1553
					var32 = 277; // L: 1554
					var8 = class433.loginBoxCenter + -117; // L: 1555
					boolean var10 = Client.Login_isUsernameRemembered; // L: 1557
					boolean var11 = Login.field928; // L: 1558
					IndexedSprite var9 = var10 ? (var11 ? Decimator.field410 : class402.field4500) : (var11 ? class465.field4805 : class182.field1908); // L: 1560
					var9.drawAt(var8, var32); // L: 1563
					var8 = var8 + var9.subWidth + 5; // L: 1564
					var1.draw("Remember username", var8, var32 + 13, 16776960, 0); // L: 1565
					var8 = class433.loginBoxCenter + 24; // L: 1566
					boolean var14 = class93.clientPreferences.method2619(); // L: 1568
					var15 = Login.field929; // L: 1569
					IndexedSprite var13 = var14 ? (var15 ? Decimator.field410 : class402.field4500) : (var15 ? class465.field4805 : class182.field1908); // L: 1571
					var13.drawAt(var8, var32); // L: 1574
					var8 = var8 + var13.subWidth + 5; // L: 1575
					var1.draw("Hide username", var8, var32 + 13, 16776960, 0); // L: 1576
					var33 = var32 + 15; // L: 1577
					var16 = class433.loginBoxCenter - 80; // L: 1578
					short var17 = 321; // L: 1579
					class182.field1904.drawAt(var16 - 73, var17 - 20); // L: 1580
					var0.drawCentered("Login", var16, var17 + 5, 16777215, 0); // L: 1581
					var16 = class433.loginBoxCenter + 80; // L: 1582
					class182.field1904.drawAt(var16 - 73, var17 - 20); // L: 1583
					var0.drawCentered("Cancel", var16, var17 + 5, 16777215, 0); // L: 1584
					var32 = 357; // L: 1585
					switch(Login.field916) { // L: 1586
					case 2:
						class143.field1635 = "Having trouble logging in?"; // L: 1591
						break;
					default:
						class143.field1635 = "Can't login? Click here."; // L: 1588
					}

					WorldMapSection0.field2593 = new Bounds(class433.loginBoxCenter, var32, var1.stringWidth(class143.field1635), 11); // L: 1594
					class126.field1486 = new Bounds(class433.loginBoxCenter, var32, var1.stringWidth("Still having trouble logging in?"), 11); // L: 1595
					var1.drawCentered(class143.field1635, class433.loginBoxCenter, var32, 16777215, 0); // L: 1596
				} else if (Login.loginIndex == 3) { // L: 1598
					var32 = 201; // L: 1599
					var0.drawCentered("Incorrect username or password.", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1600
					var33 = var32 + 20; // L: 1601
					var1.drawCentered("If you have upgraded to a Jagex Account, you", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1602
					var33 += 20; // L: 1603
					var1.drawCentered("need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1604
					var33 += 15; // L: 1605
					var4 = Login.loginBoxX + 180; // L: 1606
					var23 = 276; // L: 1607
					class182.field1904.drawAt(var4 - 73, var23 - 20); // L: 1608
					var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0); // L: 1609
					var4 = Login.loginBoxX + 180; // L: 1610
					var23 = 326; // L: 1611
					class182.field1904.drawAt(var4 - 73, var23 - 20); // L: 1612
					var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0); // L: 1613
				} else {
					short var36;
					if (Login.loginIndex == 4) { // L: 1615
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1616
						var32 = 236; // L: 1617
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1618
						var33 = var32 + 15; // L: 1619
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16777215, 0); // L: 1620
						var33 += 15; // L: 1621
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16777215, 0); // L: 1622
						var33 += 15; // L: 1623
						var0.draw("PIN: " + class313.method5999(class148.otp) + (Client.cycle % 40 < 20 ? class208.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var33, 16777215, 0); // L: 1624
						var33 -= 8; // L: 1625
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var33, 16776960, 0); // L: 1626
						var33 += 15; // L: 1627
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var33, 16776960, 0); // L: 1628
						var4 = 180 + Login.loginBoxX - 9 + var0.stringWidth("for 30 days: ") + 15; // L: 1629
						var43 = var33 - var0.ascent; // L: 1630
						IndexedSprite var35;
						if (Login.field913) { // L: 1632
							var35 = class402.field4500; // L: 1633
						} else {
							var35 = class182.field1908; // L: 1636
						}

						var35.drawAt(var4, var43); // L: 1638
						var33 += 15; // L: 1639
						var25 = Login.loginBoxX + 180 - 80; // L: 1640
						var36 = 321; // L: 1641
						class182.field1904.drawAt(var25 - 73, var36 - 20); // L: 1642
						var0.drawCentered("Continue", var25, var36 + 5, 16777215, 0); // L: 1643
						var25 = Login.loginBoxX + 180 + 80; // L: 1644
						class182.field1904.drawAt(var25 - 73, var36 - 20); // L: 1645
						var0.drawCentered("Cancel", var25, var36 + 5, 16777215, 0); // L: 1646
						var1.drawCentered("Can't login? Click here.", Login.loginBoxX + 180, var36 + 36, 16777215, 0); // L: 1647
					} else if (Login.loginIndex == 5) { // L: 1649
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1650
						var32 = 221; // L: 1651
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1652
						var33 = var32 + 15; // L: 1653
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1654
						var33 += 15; // L: 1655
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1656
						var33 += 15; // L: 1657
						var33 += 14; // L: 1658
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var33, 16777215, 0); // L: 1659
						var34 = 174; // L: 1660
						var5 = class93.clientPreferences.method2619() ? class313.method5999(Login.Login_username) : Login.Login_username; // L: 1663

						for (var6 = var5; var0.stringWidth(var6) > var34; var6 = var6.substring(1)) { // L: 1665 1666 1667
						}

						var0.draw(AbstractFont.escapeBrackets(var6) + (Client.cycle % 40 < 20 ? class208.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var33, 16777215, 0); // L: 1669
						var33 += 15; // L: 1670
						var25 = Login.loginBoxX + 180 - 80; // L: 1671
						var36 = 321; // L: 1672
						class182.field1904.drawAt(var25 - 73, var36 - 20); // L: 1673
						var0.drawCentered("Recover", var25, var36 + 5, 16777215, 0); // L: 1674
						var25 = Login.loginBoxX + 180 + 80; // L: 1675
						class182.field1904.drawAt(var25 - 73, var36 - 20); // L: 1676
						var0.drawCentered("Back", var25, var36 + 5, 16777215, 0); // L: 1677
						var36 = 356; // L: 1678
						var1.drawCentered("Still having trouble logging in?", class433.loginBoxCenter, var36, 268435455, 0); // L: 1679
					} else if (Login.loginIndex == 6) { // L: 1681
						var32 = 201; // L: 1682
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1683
						var33 = var32 + 15; // L: 1684
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1685
						var33 += 15; // L: 1686
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1687
						var33 += 15; // L: 1688
						var4 = Login.loginBoxX + 180; // L: 1689
						var23 = 321; // L: 1690
						class182.field1904.drawAt(var4 - 73, var23 - 20); // L: 1691
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1692
					} else if (Login.loginIndex == 7) { // L: 1694
						if (class373.field4355 && !Client.onMobile) { // L: 1695
							var32 = 201; // L: 1696
							var0.drawCentered(Login.Login_response1, class433.loginBoxCenter, var32, 16776960, 0); // L: 1697
							var33 = var32 + 15; // L: 1698
							var0.drawCentered(Login.Login_response2, class433.loginBoxCenter, var33, 16776960, 0); // L: 1699
							var33 += 15; // L: 1700
							var0.drawCentered(Login.Login_response3, class433.loginBoxCenter, var33, 16776960, 0); // L: 1701
							var4 = class433.loginBoxCenter - 150; // L: 1702
							var33 += 10; // L: 1703

							for (var43 = 0; var43 < 8; ++var43) { // L: 1704
								class182.field1904.method9811(var4, var33, 30, 40); // L: 1705
								boolean var26 = var43 == Login.field924 & Client.cycle % 40 < 20; // L: 1706
								var0.draw((Login.field934[var43] == null ? "" : Login.field934[var43]) + (var26 ? class208.colorStartTag(16776960) + "|" : ""), var4 + 10, var33 + 27, 16777215, 0); // L: 1707
								if (var43 != 1 && var43 != 3) { // L: 1708
									var4 += 35; // L: 1713
								} else {
									var4 += 50; // L: 1709
									var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var33 + 27, 16777215, 0); // L: 1710
								}
							}

							var43 = class433.loginBoxCenter - 80; // L: 1716
							short var45 = 321; // L: 1717
							class182.field1904.drawAt(var43 - 73, var45 - 20); // L: 1718
							var0.drawCentered("Submit", var43, var45 + 5, 16777215, 0); // L: 1719
							var43 = class433.loginBoxCenter + 80; // L: 1720
							class182.field1904.drawAt(var43 - 73, var45 - 20); // L: 1721
							var0.drawCentered("Cancel", var43, var45 + 5, 16777215, 0); // L: 1722
						} else {
							var32 = 216; // L: 1725
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1726
							var33 = var32 + 15; // L: 1727
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1728
							var33 += 15; // L: 1729
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1730
							var33 += 15; // L: 1731
							var4 = Login.loginBoxX + 180 - 80; // L: 1732
							var23 = 321; // L: 1733
							class182.field1904.drawAt(var4 - 73, var23 - 20); // L: 1734
							var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0); // L: 1735
							var4 = Login.loginBoxX + 180 + 80; // L: 1736
							class182.field1904.drawAt(var4 - 73, var23 - 20); // L: 1737
							var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1738
						}
					} else if (Login.loginIndex == 8) { // L: 1741
						var32 = 216; // L: 1742
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1743
						var33 = var32 + 15; // L: 1744
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1745
						var33 += 15; // L: 1746
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1747
						var33 += 15; // L: 1748
						var4 = Login.loginBoxX + 180 - 80; // L: 1749
						var23 = 321; // L: 1750
						class182.field1904.drawAt(var4 - 73, var23 - 20); // L: 1751
						var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0); // L: 1752
						var4 = Login.loginBoxX + 180 + 80; // L: 1753
						class182.field1904.drawAt(var4 - 73, var23 - 20); // L: 1754
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1755
					} else if (Login.loginIndex == 9) { // L: 1757
						var32 = 221; // L: 1758
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1759
						var33 = var32 + 25; // L: 1760
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1761
						var33 += 25; // L: 1762
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1763
						var4 = Login.loginBoxX + 180; // L: 1764
						var23 = 311; // L: 1765
						class182.field1904.drawAt(var4 - 73, var23 - 20); // L: 1766
						var0.drawCentered("Try again", var4, var23 + 5, 16777215, 0); // L: 1767
					} else if (Login.loginIndex == 10) { // L: 1769
						var33 = Login.loginBoxX + 180; // L: 1770
						var34 = 209; // L: 1771
						var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var34, 16776960, 0); // L: 1772
						var4 = var34 + 20; // L: 1773
						Login.field925.drawAt(var33 - 109, var4); // L: 1774
						if (Login.field926.isEmpty()) { // L: 1775
							class473.field4839.drawAt(var33 - 48, var4 + 18); // L: 1776
						} else {
							class473.field4839.drawAt(var33 - 48, var4 + 5); // L: 1779
							var0.drawCentered(Login.field926, var33, var4 + 68 - 15, 16776960, 0); // L: 1780
						}
					} else if (Login.loginIndex == 12) { // L: 1783
						var33 = class433.loginBoxCenter; // L: 1784
						var34 = 216; // L: 1785
						var2.drawCentered("Before using this app, please read and accept our", var33, var34, 16777215, 0); // L: 1786
						var4 = var34 + 17; // L: 1787
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var33, var4, 16777215, 0); // L: 1788
						var4 += 17; // L: 1789
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var33, var4, 16777215, 0); // L: 1790
						var4 += 17; // L: 1791
						var2.drawCentered("By accepting, you agree to these documents.", var33, var4, 16777215, 0); // L: 1792
						var33 = class433.loginBoxCenter - 80; // L: 1793
						var34 = 311; // L: 1794
						class182.field1904.drawAt(var33 - 73, var34 - 20); // L: 1795
						var0.drawCentered("Accept", var33, var34 + 5, 16777215, 0); // L: 1796
						var33 = class433.loginBoxCenter + 80; // L: 1797
						class182.field1904.drawAt(var33 - 73, var34 - 20); // L: 1798
						var0.drawCentered("Decline", var33, var34 + 5, 16777215, 0); // L: 1799
					} else if (Login.loginIndex == 13) { // L: 1801
						var32 = 231; // L: 1802
						var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var32, 16777215, 0); // L: 1803
						var33 = var32 + 20; // L: 1804
						var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var33, 16777215, 0); // L: 1805
						var4 = Login.loginBoxX + 180; // L: 1806
						var32 = 311; // L: 1807
						class182.field1904.drawAt(var4 - 73, var32 - 20); // L: 1808
						var0.drawCentered("Back", var4, var32 + 5, 16777215, 0); // L: 1809
					} else if (Login.loginIndex == 14) { // L: 1811
						var32 = 201; // L: 1812
						String var24 = ""; // L: 1813
						var5 = ""; // L: 1814
						var6 = ""; // L: 1815
						switch(Login.field919) { // L: 1816
						case 0:
							var24 = "Your account has been involved"; // L: 1824
							var5 = "in serious rule breaking."; // L: 1825
							var6 = ""; // L: 1826
							break; // L: 1827
						case 1:
							var24 = "Your account has been locked due to"; // L: 1838
							var5 = "suspicious activity."; // L: 1839
							var6 = "Please recover your account."; // L: 1840
							break;
						case 2:
							var24 = "The unpaid balance on your account needs"; // L: 1831
							var5 = "to be resolved before you can play."; // L: 1832
							var6 = class366.field4107; // L: 1833
							break; // L: 1834
						default:
							GrandExchangeOfferUnitPriceComparator.Login_promptCredentials(false); // L: 1819
						}

						var0.drawCentered(var24, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1844
						var33 = var32 + 20; // L: 1845
						var0.drawCentered(var5, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1846
						var33 += 20; // L: 1847
						var0.drawCentered(var6, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1848
						var25 = Login.loginBoxX + 180; // L: 1849
						var36 = 276; // L: 1850
						class182.field1904.drawAt(var25 - 73, var36 - 20); // L: 1851
						if (Login.field919 == 1) { // L: 1852
							var0.drawCentered("Recover Account", var25, var36 + 5, 16777215, 0); // L: 1853
						} else {
							var0.drawCentered("View Appeal Options", var25, var36 + 5, 16777215, 0); // L: 1856
						}

						var25 = Login.loginBoxX + 180; // L: 1858
						var36 = 326; // L: 1859
						class182.field1904.drawAt(var25 - 73, var36 - 20); // L: 1860
						var0.drawCentered("Back", var25, var36 + 5, 16777215, 0); // L: 1861
					} else if (Login.loginIndex == 24) { // L: 1863
						var32 = 221; // L: 1864
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1865
						var33 = var32 + 15; // L: 1866
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16777215, 0); // L: 1867
						var33 += 15; // L: 1868
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16777215, 0); // L: 1869
						var33 += 15; // L: 1870
						var4 = Login.loginBoxX + 180; // L: 1871
						var23 = 301; // L: 1872
						class182.field1904.drawAt(var4 - 73, var23 - 20); // L: 1873
						var0.drawCentered("Ok", var4, var23 + 5, 16777215, 0); // L: 1874
					} else if (Login.loginIndex == 32) { // L: 1876
						var32 = 216; // L: 1877
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1878
						var33 = var32 + 15; // L: 1879
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1880
						var33 += 15; // L: 1881
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1882
						var33 += 15; // L: 1883
						var4 = Login.loginBoxX + 180 - 80; // L: 1884
						var23 = 321; // L: 1885
						class182.field1904.drawAt(var4 - 73, var23 - 20); // L: 1886
						var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0); // L: 1887
						var4 = Login.loginBoxX + 180 + 80; // L: 1888
						class182.field1904.drawAt(var4 - 73, var23 - 20); // L: 1889
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1890
					} else if (Login.loginIndex == 33) { // L: 1892
						var32 = 201; // L: 1893
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1894
						var33 = var32 + 20; // L: 1895
						var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1896
						var33 += 20; // L: 1897
						var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1898
						var33 += 15; // L: 1899
						var4 = Login.loginBoxX + 180; // L: 1900
						var23 = 276; // L: 1901
						class182.field1904.drawAt(var4 - 73, var23 - 20); // L: 1902
						var2.drawCentered("Download Launcher", var4, var23 + 5, 16777215, 0); // L: 1903
						var4 = Login.loginBoxX + 180; // L: 1904
						var23 = 326; // L: 1905
						class182.field1904.drawAt(var4 - 73, var23 - 20); // L: 1906
						var2.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1907
					}
				}
			}

			if (Client.gameState >= 10) { // L: 1910
				int[] var27 = new int[4]; // L: 1911
				Rasterizer2D.Rasterizer2D_getClipArray(var27); // L: 1912
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, GameEngine.canvasHeight); // L: 1913
				SpriteMask.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle); // L: 1914
				SpriteMask.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle); // L: 1915
				Rasterizer2D.Rasterizer2D_setClipArray(var27); // L: 1916
			}

			Clock.title_muteSprite[class93.clientPreferences.method2546() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463); // L: 1918
			if (Client.gameState > 5 && class92.clientLanguage == Language.Language_EN) { // L: 1919
				if (class155.field1725 != null) { // L: 1920
					var33 = Login.xPadding + 5; // L: 1921
					var34 = 463; // L: 1922
					byte var49 = 100; // L: 1923
					byte var46 = 35; // L: 1924
					class155.field1725.drawAt(var33, var34); // L: 1925
					var0.drawCentered("World" + " " + Client.worldId, var49 / 2 + var33, var46 / 2 + var34 - 2, 16777215, 0); // L: 1926
					if (class101.World_request != null) { // L: 1927
						var1.drawCentered("Loading...", var49 / 2 + var33, var46 / 2 + var34 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var49 / 2 + var33, var46 / 2 + var34 + 12, 16777215, 0); // L: 1928
					}
				} else {
					class155.field1725 = VarcInt.SpriteBuffer_getIndexedSpriteByName(class19.field94, "sl_button", ""); // L: 1931
				}
			}

		}
	} // L: 1450 1934
}
