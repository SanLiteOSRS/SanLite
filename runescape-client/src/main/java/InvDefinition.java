import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("InvDefinition_archive")
	static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 908828749
	)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	InvDefinition() {
		this.size = 0; // L: 12
	} // L: 14

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltz;B)V",
		garbageValue = "-80"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 32
			if (var2 == 0) { // L: 33
				return; // L: 36
			}

			this.decodeNext(var1, var2); // L: 34
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ltz;II)V",
		garbageValue = "610924423"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) { // L: 39
			this.size = var1.readUnsignedShort();
		}

	} // L: 41

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(BI)C",
		garbageValue = "82246052"
	)
	public static char method3569(byte var0) {
		int var1 = var0 & 255; // L: 63
		if (var1 == 0) { // L: 64
			throw new IllegalArgumentException("" + Integer.toString(var1, 16));
		} else {
			if (var1 >= 128 && var1 < 160) { // L: 65
				char var2 = class382.cp1252AsciiExtension[var1 - 128]; // L: 66
				if (var2 == 0) { // L: 67
					var2 = '?';
				}

				var1 = var2; // L: 68
			}

			return (char)var1; // L: 70
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lph;Lph;Lph;I)V",
		garbageValue = "-1390726040"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (class448.canvasWidth - 765) / 2; // L: 1288
		Login.loginBoxX = Login.xPadding + 202; // L: 1289
		class485.loginBoxCenter = Login.loginBoxX + 180; // L: 1290
		if (Login.worldSelectOpen) { // L: 1291
			ClientPreferences.method2433(var0, var1); // L: 1292
		} else {
			Decimator.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1295
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1296
			class13.logoSprite.drawAt(Login.xPadding + 382 - class13.logoSprite.subWidth / 2, 18); // L: 1297
			int var4;
			if (Client.gameState == 0 || Client.gameState == 5) { // L: 1298
				byte var3 = 20; // L: 1299
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1); // L: 1300
				var4 = 253 - var3; // L: 1301
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409); // L: 1302
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0); // L: 1303
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409); // L: 1304
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.Login_loadingPercent * 3 + (Login.loginBoxX + 180 - 150), var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0); // L: 1305
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1); // L: 1306
			}

			String var5;
			String var6;
			String var7;
			String var8;
			short var25;
			int var26;
			short var27;
			if (Client.gameState == 20) { // L: 1308
				class481.titleboxSprite.drawAt(Login.loginBoxX + 180 - class481.titleboxSprite.subWidth / 2, 271 - class481.titleboxSprite.subHeight / 2); // L: 1309
				var25 = 201; // L: 1310
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var25, 16776960, 0); // L: 1311
				var26 = var25 + 15; // L: 1312
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var26, 16776960, 0); // L: 1313
				var26 += 15; // L: 1314
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var26, 16776960, 0); // L: 1315
				var26 += 15; // L: 1316
				var26 += 7; // L: 1317
				if (Login.loginIndex != 4 && Login.loginIndex != 10) { // L: 1318
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var26, 16777215, 0); // L: 1319
					var27 = 200; // L: 1320

					for (var5 = UserComparator10.method2879(); var0.stringWidth(var5) > var27; var5 = var5.substring(0, var5.length() - 1)) { // L: 1321 1322 1323
					}

					var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var26, 16777215, 0); // L: 1325
					var26 += 15; // L: 1326
					var7 = Login.Login_password; // L: 1328
					var6 = GrandExchangeOfferAgeComparator.method6832('*', var7.length()); // L: 1330

					for (var8 = var6; var0.stringWidth(var8) > var27; var8 = var8.substring(1)) { // L: 1332 1333 1334
					}

					var0.draw("Password: " + var8, Login.loginBoxX + 180 - 108, var26, 16777215, 0); // L: 1336
					var26 += 15; // L: 1337
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) { // L: 1340
				class481.titleboxSprite.drawAt(Login.loginBoxX, 171); // L: 1341
				short var19;
				if (Login.loginIndex == 0) { // L: 1342
					var25 = 251; // L: 1343
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var25, 16776960, 0); // L: 1344
					var26 = var25 + 30; // L: 1345
					var4 = Login.loginBoxX + 180 - 80; // L: 1346
					var19 = 291; // L: 1347
					Login.field921.drawAt(var4 - 73, var19 - 20); // L: 1348
					var0.drawLines("New User", var4 - 73, var19 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1349
					var4 = Login.loginBoxX + 180 + 80; // L: 1350
					Login.field921.drawAt(var4 - 73, var19 - 20); // L: 1351
					var0.drawLines("Existing User", var4 - 73, var19 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1352
				} else if (Login.loginIndex == 1) { // L: 1354
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0); // L: 1355
					var25 = 236; // L: 1356
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var25, 16777215, 0); // L: 1357
					var26 = var25 + 15; // L: 1358
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var26, 16777215, 0); // L: 1359
					var26 += 15; // L: 1360
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var26, 16777215, 0); // L: 1361
					var26 += 15; // L: 1362
					var4 = Login.loginBoxX + 180 - 80; // L: 1363
					var19 = 321; // L: 1364
					Login.field921.drawAt(var4 - 73, var19 - 20); // L: 1365
					var0.drawCentered("Continue", var4, var19 + 5, 16777215, 0); // L: 1366
					var4 = Login.loginBoxX + 180 + 80; // L: 1367
					Login.field921.drawAt(var4 - 73, var19 - 20); // L: 1368
					var0.drawCentered("Cancel", var4, var19 + 5, 16777215, 0); // L: 1369
				} else {
					int var9;
					IndexedSprite var10;
					if (Login.loginIndex == 2) { // L: 1371
						var25 = 201; // L: 1372
						var0.drawCentered(Login.Login_response1, class485.loginBoxCenter, var25, 16776960, 0); // L: 1373
						var26 = var25 + 15; // L: 1374
						var0.drawCentered(Login.Login_response2, class485.loginBoxCenter, var26, 16776960, 0); // L: 1375
						var26 += 15; // L: 1376
						var0.drawCentered(Login.Login_response3, class485.loginBoxCenter, var26, 16776960, 0); // L: 1377
						var26 += 15; // L: 1378
						var26 += 7; // L: 1379
						var0.draw("Login: ", class485.loginBoxCenter - 110, var26, 16777215, 0); // L: 1380
						var27 = 200; // L: 1381

						for (var5 = UserComparator10.method2879(); var0.stringWidth(var5) > var27; var5 = var5.substring(1)) { // L: 1382 1383 1384
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? class349.colorStartTag(16776960) + "|" : ""), class485.loginBoxCenter - 70, var26, 16777215, 0); // L: 1386
						var26 += 15; // L: 1387
						var7 = Login.Login_password; // L: 1389
						var6 = GrandExchangeOfferAgeComparator.method6832('*', var7.length()); // L: 1391

						for (var8 = var6; var0.stringWidth(var8) > var27; var8 = var8.substring(1)) { // L: 1393 1394 1395
						}

						var0.draw("Password: " + var8 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? class349.colorStartTag(16776960) + "|" : ""), class485.loginBoxCenter - 108, var26, 16777215, 0); // L: 1397
						var26 += 15; // L: 1398
						var25 = 277; // L: 1399
						var9 = class485.loginBoxCenter + -117; // L: 1400
						boolean var11 = Client.Login_isUsernameRemembered; // L: 1402
						boolean var12 = Login.field947; // L: 1403
						var10 = var11 ? (var12 ? NPC.field1290 : class177.field1856) : (var12 ? DynamicObject.field1008 : class104.field1322); // L: 1405
						var10.drawAt(var9, var25); // L: 1408
						var9 = var9 + var10.subWidth + 5; // L: 1409
						var1.draw("Remember username", var9, var25 + 13, 16776960, 0); // L: 1410
						var9 = class485.loginBoxCenter + 24; // L: 1411
						boolean var15 = class10.clientPreferences.method2472(); // L: 1413
						boolean var16 = Login.field941; // L: 1414
						IndexedSprite var14 = var15 ? (var16 ? NPC.field1290 : class177.field1856) : (var16 ? DynamicObject.field1008 : class104.field1322); // L: 1416
						var14.drawAt(var9, var25); // L: 1419
						var9 = var9 + var14.subWidth + 5; // L: 1420
						var1.draw("Hide username", var9, var25 + 13, 16776960, 0); // L: 1421
						var26 = var25 + 15; // L: 1422
						int var17 = class485.loginBoxCenter - 80; // L: 1423
						short var18 = 321; // L: 1424
						Login.field921.drawAt(var17 - 73, var18 - 20); // L: 1425
						var0.drawCentered("Login", var17, var18 + 5, 16777215, 0); // L: 1426
						var17 = class485.loginBoxCenter + 80; // L: 1427
						Login.field921.drawAt(var17 - 73, var18 - 20); // L: 1428
						var0.drawCentered("Cancel", var17, var18 + 5, 16777215, 0); // L: 1429
						var25 = 357; // L: 1430
						switch(Login.field929) { // L: 1431
						case 2:
							WorldMapDecorationType.field3787 = "Having trouble logging in?"; // L: 1433
							break;
						default:
							WorldMapDecorationType.field3787 = "Can't login? Click here."; // L: 1436
						}

						FriendsList.field4572 = new Bounds(class485.loginBoxCenter, var25, var1.stringWidth(WorldMapDecorationType.field3787), 11); // L: 1439
						Calendar.field3770 = new Bounds(class485.loginBoxCenter, var25, var1.stringWidth("Still having trouble logging in?"), 11); // L: 1440
						var1.drawCentered(WorldMapDecorationType.field3787, class485.loginBoxCenter, var25, 16777215, 0); // L: 1441
					} else if (Login.loginIndex == 3) { // L: 1443
						var25 = 201; // L: 1444
						var0.drawCentered("Incorrect username or password.", Login.loginBoxX + 180, var25, 16776960, 0); // L: 1445
						var26 = var25 + 20; // L: 1446
						var1.drawCentered("If you have upgraded to a Jagex Account, you", Login.loginBoxX + 180, var26, 16776960, 0); // L: 1447
						var26 += 20; // L: 1448
						var1.drawCentered("need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", Login.loginBoxX + 180, var26, 16776960, 0); // L: 1449
						var26 += 15; // L: 1450
						var4 = Login.loginBoxX + 180; // L: 1451
						var19 = 276; // L: 1452
						Login.field921.drawAt(var4 - 73, var19 - 20); // L: 1453
						var2.drawCentered("Try again", var4, var19 + 5, 16777215, 0); // L: 1454
						var4 = Login.loginBoxX + 180; // L: 1455
						var19 = 326; // L: 1456
						Login.field921.drawAt(var4 - 73, var19 - 20); // L: 1457
						var2.drawCentered("Forgotten password?", var4, var19 + 5, 16777215, 0); // L: 1458
					} else if (Login.loginIndex == 4) { // L: 1460
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1461
						var25 = 236; // L: 1462
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var25, 16777215, 0); // L: 1463
						var26 = var25 + 15; // L: 1464
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var26, 16777215, 0); // L: 1465
						var26 += 15; // L: 1466
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var26, 16777215, 0); // L: 1467
						var26 += 15; // L: 1468
						var5 = "PIN: "; // L: 1470
						var7 = SoundSystem.otp; // L: 1472
						var6 = GrandExchangeOfferAgeComparator.method6832('*', var7.length()); // L: 1474
						var0.draw(var5 + var6 + (Client.cycle % 40 < 20 ? class349.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var26, 16777215, 0); // L: 1476
						var26 -= 8; // L: 1477
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var26, 16776960, 0); // L: 1478
						var26 += 15; // L: 1479
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var26, 16776960, 0); // L: 1480
						int var22 = 180 + Login.loginBoxX - 9 + var0.stringWidth("for 30 days: ") + 15; // L: 1481
						var9 = var26 - var0.ascent; // L: 1482
						if (Login.field942) { // L: 1484
							var10 = class177.field1856; // L: 1485
						} else {
							var10 = class104.field1322; // L: 1488
						}

						var10.drawAt(var22, var9); // L: 1490
						var26 += 15; // L: 1491
						int var28 = Login.loginBoxX + 180 - 80; // L: 1492
						short var29 = 321; // L: 1493
						Login.field921.drawAt(var28 - 73, var29 - 20); // L: 1494
						var0.drawCentered("Continue", var28, var29 + 5, 16777215, 0); // L: 1495
						var28 = Login.loginBoxX + 180 + 80; // L: 1496
						Login.field921.drawAt(var28 - 73, var29 - 20); // L: 1497
						var0.drawCentered("Cancel", var28, var29 + 5, 16777215, 0); // L: 1498
						var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var29 + 36, 255, 0); // L: 1499
					} else if (Login.loginIndex == 5) { // L: 1501
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1502
						var25 = 221; // L: 1503
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var25, 16776960, 0); // L: 1504
						var26 = var25 + 15; // L: 1505
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var26, 16776960, 0); // L: 1506
						var26 += 15; // L: 1507
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var26, 16776960, 0); // L: 1508
						var26 += 15; // L: 1509
						var26 += 14; // L: 1510
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var26, 16777215, 0); // L: 1511
						var27 = 174; // L: 1512

						for (var5 = UserComparator10.method2879(); var0.stringWidth(var5) > var27; var5 = var5.substring(1)) { // L: 1513 1514 1515
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? class349.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var26, 16777215, 0); // L: 1517
						var26 += 15; // L: 1518
						int var23 = Login.loginBoxX + 180 - 80; // L: 1519
						short var21 = 321; // L: 1520
						Login.field921.drawAt(var23 - 73, var21 - 20); // L: 1521
						var0.drawCentered("Recover", var23, var21 + 5, 16777215, 0); // L: 1522
						var23 = Login.loginBoxX + 180 + 80; // L: 1523
						Login.field921.drawAt(var23 - 73, var21 - 20); // L: 1524
						var0.drawCentered("Back", var23, var21 + 5, 16777215, 0); // L: 1525
						var21 = 356; // L: 1526
						var1.drawCentered("Still having trouble logging in?", class485.loginBoxCenter, var21, 268435455, 0); // L: 1527
					} else if (Login.loginIndex == 6) { // L: 1529
						var25 = 201; // L: 1530
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var25, 16776960, 0); // L: 1531
						var26 = var25 + 15; // L: 1532
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var26, 16776960, 0); // L: 1533
						var26 += 15; // L: 1534
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var26, 16776960, 0); // L: 1535
						var26 += 15; // L: 1536
						var4 = Login.loginBoxX + 180; // L: 1537
						var19 = 321; // L: 1538
						Login.field921.drawAt(var4 - 73, var19 - 20); // L: 1539
						var0.drawCentered("Back", var4, var19 + 5, 16777215, 0); // L: 1540
					} else if (Login.loginIndex == 7) { // L: 1542
						if (class112.field1401 && !Client.onMobile) { // L: 1543
							var25 = 201; // L: 1544
							var0.drawCentered(Login.Login_response1, class485.loginBoxCenter, var25, 16776960, 0); // L: 1545
							var26 = var25 + 15; // L: 1546
							var0.drawCentered(Login.Login_response2, class485.loginBoxCenter, var26, 16776960, 0); // L: 1547
							var26 += 15; // L: 1548
							var0.drawCentered(Login.Login_response3, class485.loginBoxCenter, var26, 16776960, 0); // L: 1549
							var4 = class485.loginBoxCenter - 150; // L: 1550
							var26 += 10; // L: 1551

							int var30;
							for (var30 = 0; var30 < 8; ++var30) { // L: 1552
								Login.field921.method9367(var4, var26, 30, 40); // L: 1553
								boolean var33 = var30 == Login.field935 & Client.cycle % 40 < 20; // L: 1554
								var0.draw((Login.field938[var30] == null ? "" : Login.field938[var30]) + (var33 ? class349.colorStartTag(16776960) + "|" : ""), var4 + 10, var26 + 27, 16777215, 0); // L: 1555
								if (var30 != 1 && var30 != 3) { // L: 1556
									var4 += 35; // L: 1561
								} else {
									var4 += 50; // L: 1557
									var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var26 + 27, 16777215, 0); // L: 1558
								}
							}

							var30 = class485.loginBoxCenter - 80; // L: 1564
							short var34 = 321; // L: 1565
							Login.field921.drawAt(var30 - 73, var34 - 20); // L: 1566
							var0.drawCentered("Submit", var30, var34 + 5, 16777215, 0); // L: 1567
							var30 = class485.loginBoxCenter + 80; // L: 1568
							Login.field921.drawAt(var30 - 73, var34 - 20); // L: 1569
							var0.drawCentered("Cancel", var30, var34 + 5, 16777215, 0); // L: 1570
						} else {
							var25 = 216; // L: 1573
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var25, 16776960, 0); // L: 1574
							var26 = var25 + 15; // L: 1575
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var26, 16776960, 0); // L: 1576
							var26 += 15; // L: 1577
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var26, 16776960, 0); // L: 1578
							var26 += 15; // L: 1579
							var4 = Login.loginBoxX + 180 - 80; // L: 1580
							var19 = 321; // L: 1581
							Login.field921.drawAt(var4 - 73, var19 - 20); // L: 1582
							var0.drawCentered("Set Date of Birth", var4, var19 + 5, 16777215, 0); // L: 1583
							var4 = Login.loginBoxX + 180 + 80; // L: 1584
							Login.field921.drawAt(var4 - 73, var19 - 20); // L: 1585
							var0.drawCentered("Back", var4, var19 + 5, 16777215, 0); // L: 1586
						}
					} else if (Login.loginIndex == 8) { // L: 1589
						var25 = 216; // L: 1590
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var25, 16776960, 0); // L: 1591
						var26 = var25 + 15; // L: 1592
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var26, 16776960, 0); // L: 1593
						var26 += 15; // L: 1594
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var26, 16776960, 0); // L: 1595
						var26 += 15; // L: 1596
						var4 = Login.loginBoxX + 180 - 80; // L: 1597
						var19 = 321; // L: 1598
						Login.field921.drawAt(var4 - 73, var19 - 20); // L: 1599
						var0.drawCentered("Privacy Policy", var4, var19 + 5, 16777215, 0); // L: 1600
						var4 = Login.loginBoxX + 180 + 80; // L: 1601
						Login.field921.drawAt(var4 - 73, var19 - 20); // L: 1602
						var0.drawCentered("Back", var4, var19 + 5, 16777215, 0); // L: 1603
					} else if (Login.loginIndex == 9) { // L: 1605
						var25 = 221; // L: 1606
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var25, 16776960, 0); // L: 1607
						var26 = var25 + 25; // L: 1608
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var26, 16776960, 0); // L: 1609
						var26 += 25; // L: 1610
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var26, 16776960, 0); // L: 1611
						var4 = Login.loginBoxX + 180; // L: 1612
						var19 = 311; // L: 1613
						Login.field921.drawAt(var4 - 73, var19 - 20); // L: 1614
						var0.drawCentered("Try again", var4, var19 + 5, 16777215, 0); // L: 1615
					} else if (Login.loginIndex == 10) { // L: 1617
						var26 = Login.loginBoxX + 180; // L: 1618
						var27 = 209; // L: 1619
						var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var27, 16776960, 0); // L: 1620
						var4 = var27 + 20; // L: 1621
						ParamComposition.field2110.drawAt(var26 - 109, var4); // L: 1622
						if (Login.field939.isEmpty()) { // L: 1623
							UserComparator8.field1416.drawAt(var26 - 48, var4 + 18); // L: 1624
						} else {
							UserComparator8.field1416.drawAt(var26 - 48, var4 + 5); // L: 1627
							var0.drawCentered(Login.field939, var26, var4 + 68 - 15, 16776960, 0); // L: 1628
						}
					} else if (Login.loginIndex == 12) { // L: 1631
						var26 = class485.loginBoxCenter; // L: 1632
						var27 = 216; // L: 1633
						var2.drawCentered("Before using this app, please read and accept our", var26, var27, 16777215, 0); // L: 1634
						var4 = var27 + 17; // L: 1635
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var26, var4, 16777215, 0); // L: 1636
						var4 += 17; // L: 1637
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var26, var4, 16777215, 0); // L: 1638
						var4 += 17; // L: 1639
						var2.drawCentered("By accepting, you agree to these documents.", var26, var4, 16777215, 0); // L: 1640
						var26 = class485.loginBoxCenter - 80; // L: 1641
						var27 = 311; // L: 1642
						Login.field921.drawAt(var26 - 73, var27 - 20); // L: 1643
						var0.drawCentered("Accept", var26, var27 + 5, 16777215, 0); // L: 1644
						var26 = class485.loginBoxCenter + 80; // L: 1645
						Login.field921.drawAt(var26 - 73, var27 - 20); // L: 1646
						var0.drawCentered("Decline", var26, var27 + 5, 16777215, 0); // L: 1647
					} else if (Login.loginIndex == 13) { // L: 1649
						var25 = 231; // L: 1650
						var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var25, 16777215, 0); // L: 1651
						var26 = var25 + 20; // L: 1652
						var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var26, 16777215, 0); // L: 1653
						var4 = Login.loginBoxX + 180; // L: 1654
						var25 = 311; // L: 1655
						Login.field921.drawAt(var4 - 73, var25 - 20); // L: 1656
						var0.drawCentered("Back", var4, var25 + 5, 16777215, 0); // L: 1657
					} else if (Login.loginIndex == 14) { // L: 1659
						var25 = 201; // L: 1660
						String var20 = ""; // L: 1661
						var5 = ""; // L: 1662
						var6 = ""; // L: 1663
						switch(Login.field925) { // L: 1664
						case 0:
							var20 = "Your account has been involved"; // L: 1672
							var5 = "in serious rule breaking."; // L: 1673
							var6 = ""; // L: 1674
							break; // L: 1675
						case 1:
							var20 = "Your account has been locked due to"; // L: 1686
							var5 = "suspicious activity."; // L: 1687
							var6 = "Please recover your account."; // L: 1688
							break;
						case 2:
							var20 = "The unpaid balance on your account needs"; // L: 1679
							var5 = "to be resolved before you can play."; // L: 1680
							var6 = class349.field4010; // L: 1681
							break; // L: 1682
						default:
							ViewportMouse.Login_promptCredentials(false); // L: 1667
						}

						var0.drawCentered(var20, Login.loginBoxX + 180, var25, 16776960, 0); // L: 1692
						var26 = var25 + 20; // L: 1693
						var0.drawCentered(var5, Login.loginBoxX + 180, var26, 16776960, 0); // L: 1694
						var26 += 20; // L: 1695
						var0.drawCentered(var6, Login.loginBoxX + 180, var26, 16776960, 0); // L: 1696
						int var31 = Login.loginBoxX + 180; // L: 1697
						short var32 = 276; // L: 1698
						Login.field921.drawAt(var31 - 73, var32 - 20); // L: 1699
						if (Login.field925 == 1) { // L: 1700
							var0.drawCentered("Recover Account", var31, var32 + 5, 16777215, 0); // L: 1701
						} else {
							var0.drawCentered("View Appeal Options", var31, var32 + 5, 16777215, 0); // L: 1704
						}

						var31 = Login.loginBoxX + 180; // L: 1706
						var32 = 326; // L: 1707
						Login.field921.drawAt(var31 - 73, var32 - 20); // L: 1708
						var0.drawCentered("Back", var31, var32 + 5, 16777215, 0); // L: 1709
					} else if (Login.loginIndex == 24) { // L: 1711
						var25 = 221; // L: 1712
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var25, 16777215, 0); // L: 1713
						var26 = var25 + 15; // L: 1714
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var26, 16777215, 0); // L: 1715
						var26 += 15; // L: 1716
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var26, 16777215, 0); // L: 1717
						var26 += 15; // L: 1718
						var4 = Login.loginBoxX + 180; // L: 1719
						var19 = 301; // L: 1720
						Login.field921.drawAt(var4 - 73, var19 - 20); // L: 1721
						var0.drawCentered("Ok", var4, var19 + 5, 16777215, 0); // L: 1722
					} else if (Login.loginIndex == 32) { // L: 1724
						var25 = 216; // L: 1725
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var25, 16776960, 0); // L: 1726
						var26 = var25 + 15; // L: 1727
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var26, 16776960, 0); // L: 1728
						var26 += 15; // L: 1729
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var26, 16776960, 0); // L: 1730
						var26 += 15; // L: 1731
						var4 = Login.loginBoxX + 180 - 80; // L: 1732
						var19 = 321; // L: 1733
						Login.field921.drawAt(var4 - 73, var19 - 20); // L: 1734
						var0.drawCentered("Set Date of Birth", var4, var19 + 5, 16777215, 0); // L: 1735
						var4 = Login.loginBoxX + 180 + 80; // L: 1736
						Login.field921.drawAt(var4 - 73, var19 - 20); // L: 1737
						var0.drawCentered("Back", var4, var19 + 5, 16777215, 0); // L: 1738
					} else if (Login.loginIndex == 33) { // L: 1740
						var25 = 201; // L: 1741
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var25, 16776960, 0); // L: 1742
						var26 = var25 + 20; // L: 1743
						var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var26, 16776960, 0); // L: 1744
						var26 += 20; // L: 1745
						var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var26, 16776960, 0); // L: 1746
						var26 += 15; // L: 1747
						var4 = Login.loginBoxX + 180; // L: 1748
						var19 = 276; // L: 1749
						Login.field921.drawAt(var4 - 73, var19 - 20); // L: 1750
						var2.drawCentered("Download Launcher", var4, var19 + 5, 16777215, 0); // L: 1751
						var4 = Login.loginBoxX + 180; // L: 1752
						var19 = 326; // L: 1753
						Login.field921.drawAt(var4 - 73, var19 - 20); // L: 1754
						var2.drawCentered("Back", var4, var19 + 5, 16777215, 0); // L: 1755
					}
				}
			}

			if (Client.gameState >= 10) { // L: 1758
				int[] var24 = new int[4]; // L: 1759
				Rasterizer2D.Rasterizer2D_getClipArray(var24); // L: 1760
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, WorldMapID.canvasHeight); // L: 1761
				class237.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle); // L: 1762
				class237.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle); // L: 1763
				Rasterizer2D.Rasterizer2D_setClipArray(var24); // L: 1764
			}

			SpriteMask.title_muteSprite[class10.clientPreferences.method2437() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463); // L: 1766
			if (Client.gameState > 5 && Language.Language_EN == TriBool.clientLanguage) { // L: 1767
				if (class19.field97 != null) { // L: 1768
					var26 = Login.xPadding + 5; // L: 1769
					var27 = 463; // L: 1770
					byte var35 = 100; // L: 1771
					byte var36 = 35; // L: 1772
					class19.field97.drawAt(var26, var27); // L: 1773
					var0.drawCentered("World" + " " + Client.worldId, var35 / 2 + var26, var36 / 2 + var27 - 2, 16777215, 0); // L: 1774
					if (World.World_request != null) { // L: 1775
						var1.drawCentered("Loading...", var35 / 2 + var26, var36 / 2 + var27 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var35 / 2 + var26, var36 / 2 + var27 + 12, 16777215, 0); // L: 1776
					}
				} else {
					class19.field97 = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(class180.archive8, "sl_button", ""); // L: 1779
				}
			}

		}
	} // L: 1293 1782

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1380828843"
	)
	static final void method3561(int var0, int var1) {
		if (var0 < 128) { // L: 3978
			var0 = 128; // L: 3979
		} else if (var0 > 383) { // L: 3981
			var0 = 383; // L: 3982
		}

		if (MusicPatchNode.cameraPitch < var0) { // L: 3984
			MusicPatchNode.cameraPitch = (var0 - MusicPatchNode.cameraPitch) * class209.field2322 / 1000 + MusicPatchNode.cameraPitch + BufferedSource.field4636; // L: 3985
			if (MusicPatchNode.cameraPitch > var0) { // L: 3986
				MusicPatchNode.cameraPitch = var0; // L: 3987
			}
		} else if (MusicPatchNode.cameraPitch > var0) { // L: 3990
			MusicPatchNode.cameraPitch -= (MusicPatchNode.cameraPitch - var0) * class209.field2322 / 1000 + BufferedSource.field4636; // L: 3991
			if (MusicPatchNode.cameraPitch < var0) { // L: 3992
				MusicPatchNode.cameraPitch = var0; // L: 3993
			}
		}

		var1 &= 2047; // L: 3996
		int var2 = var1 - class291.cameraYaw; // L: 3997
		if (var2 > 1024) { // L: 3998
			var2 -= 2048; // L: 3999
		} else if (var2 < -1024) { // L: 4001
			var2 += 2048; // L: 4002
		}

		if (var2 > 0) { // L: 4004
			class291.cameraYaw = class291.cameraYaw + BufferedSource.field4636 + var2 * class209.field2322 / 1000; // L: 4005
			class291.cameraYaw &= 2047; // L: 4006
		} else if (var2 < 0) { // L: 4008
			class291.cameraYaw -= BufferedSource.field4636 + -var2 * class209.field2322 / 1000; // L: 4009
			class291.cameraYaw &= 2047; // L: 4010
		}

		int var3 = var1 - class291.cameraYaw; // L: 4012
		if (var3 > 1024) { // L: 4013
			var3 -= 2048; // L: 4014
		} else if (var3 < -1024) { // L: 4016
			var3 += 2048; // L: 4017
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) { // L: 4019
			class291.cameraYaw = var1; // L: 4020
		}

	} // L: 4022

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;I)V",
		garbageValue = "-1766452484"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = class158.getWidgetChild(var1, var2); // L: 10021
		if (var5 != null) { // L: 10022
			if (var5.onOp != null) { // L: 10023
				ScriptEvent var6 = new ScriptEvent(); // L: 10024
				var6.widget = var5; // L: 10025
				var6.opIndex = var0; // L: 10026
				var6.targetName = var4; // L: 10027
				var6.args = var5.onOp; // L: 10028
				Clock.runScriptEvent(var6); // L: 10029
			}

			boolean var8 = true; // L: 10031
			if (var5.contentType > 0) { // L: 10032
				var8 = FloorOverlayDefinition.method4043(var5);
			}

			if (var8) { // L: 10033
				if (class60.method1131(StudioGame.getWidgetFlags(var5), var0 - 1)) { // L: 10034
					PacketBufferNode var7;
					if (var0 == 1) { // L: 10037
						var7 = ObjectComposition.getPacketBufferNode(ClientPacket.field3190, Client.packetWriter.isaacCipher); // L: 10039
						var7.packetBuffer.writeInt(var1); // L: 10040
						var7.packetBuffer.writeShort(var2); // L: 10041
						var7.packetBuffer.writeShort(var3); // L: 10042
						Client.packetWriter.addNode(var7); // L: 10043
					}

					if (var0 == 2) { // L: 10045
						var7 = ObjectComposition.getPacketBufferNode(ClientPacket.field3116, Client.packetWriter.isaacCipher); // L: 10047
						var7.packetBuffer.writeInt(var1); // L: 10048
						var7.packetBuffer.writeShort(var2); // L: 10049
						var7.packetBuffer.writeShort(var3); // L: 10050
						Client.packetWriter.addNode(var7); // L: 10051
					}

					if (var0 == 3) { // L: 10053
						var7 = ObjectComposition.getPacketBufferNode(ClientPacket.field3112, Client.packetWriter.isaacCipher); // L: 10055
						var7.packetBuffer.writeInt(var1); // L: 10056
						var7.packetBuffer.writeShort(var2); // L: 10057
						var7.packetBuffer.writeShort(var3); // L: 10058
						Client.packetWriter.addNode(var7); // L: 10059
					}

					if (var0 == 4) { // L: 10061
						var7 = ObjectComposition.getPacketBufferNode(ClientPacket.field3127, Client.packetWriter.isaacCipher); // L: 10063
						var7.packetBuffer.writeInt(var1); // L: 10064
						var7.packetBuffer.writeShort(var2); // L: 10065
						var7.packetBuffer.writeShort(var3); // L: 10066
						Client.packetWriter.addNode(var7); // L: 10067
					}

					if (var0 == 5) { // L: 10069
						var7 = ObjectComposition.getPacketBufferNode(ClientPacket.field3122, Client.packetWriter.isaacCipher); // L: 10071
						var7.packetBuffer.writeInt(var1); // L: 10072
						var7.packetBuffer.writeShort(var2); // L: 10073
						var7.packetBuffer.writeShort(var3); // L: 10074
						Client.packetWriter.addNode(var7); // L: 10075
					}

					if (var0 == 6) { // L: 10077
						var7 = ObjectComposition.getPacketBufferNode(ClientPacket.field3099, Client.packetWriter.isaacCipher); // L: 10079
						var7.packetBuffer.writeInt(var1); // L: 10080
						var7.packetBuffer.writeShort(var2); // L: 10081
						var7.packetBuffer.writeShort(var3); // L: 10082
						Client.packetWriter.addNode(var7); // L: 10083
					}

					if (var0 == 7) { // L: 10085
						var7 = ObjectComposition.getPacketBufferNode(ClientPacket.field3143, Client.packetWriter.isaacCipher); // L: 10087
						var7.packetBuffer.writeInt(var1); // L: 10088
						var7.packetBuffer.writeShort(var2); // L: 10089
						var7.packetBuffer.writeShort(var3); // L: 10090
						Client.packetWriter.addNode(var7); // L: 10091
					}

					if (var0 == 8) { // L: 10093
						var7 = ObjectComposition.getPacketBufferNode(ClientPacket.field3101, Client.packetWriter.isaacCipher); // L: 10095
						var7.packetBuffer.writeInt(var1); // L: 10096
						var7.packetBuffer.writeShort(var2); // L: 10097
						var7.packetBuffer.writeShort(var3); // L: 10098
						Client.packetWriter.addNode(var7); // L: 10099
					}

					if (var0 == 9) { // L: 10101
						var7 = ObjectComposition.getPacketBufferNode(ClientPacket.field3129, Client.packetWriter.isaacCipher); // L: 10103
						var7.packetBuffer.writeInt(var1); // L: 10104
						var7.packetBuffer.writeShort(var2); // L: 10105
						var7.packetBuffer.writeShort(var3); // L: 10106
						Client.packetWriter.addNode(var7); // L: 10107
					}

					if (var0 == 10) { // L: 10109
						var7 = ObjectComposition.getPacketBufferNode(ClientPacket.field3136, Client.packetWriter.isaacCipher); // L: 10111
						var7.packetBuffer.writeInt(var1); // L: 10112
						var7.packetBuffer.writeShort(var2); // L: 10113
						var7.packetBuffer.writeShort(var3); // L: 10114
						Client.packetWriter.addNode(var7); // L: 10115
					}

				}
			}
		}
	} // L: 10035 10117
}
