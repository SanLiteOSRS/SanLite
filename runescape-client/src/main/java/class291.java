import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kh")
public class class291 {
	@ObfuscatedName("ty")
	@ObfuscatedGetter(
		intValue = -1025024761
	)
	static int field3324;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	UrlRequest field3322;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	SpritePixels field3323;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lcu;)V"
	)
	class291(String var1, UrlRequester var2) {
		try {
			this.field3322 = var2.request(new URL(var1)); // L: 16
		} catch (MalformedURLException var4) { // L: 18
			this.field3322 = null; // L: 19
		}

	} // L: 21

	@ObfuscatedSignature(
		descriptor = "(Lcv;)V"
	)
	class291(UrlRequest var1) {
		this.field3322 = var1; // L: 24
	} // L: 25

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Lqn;",
		garbageValue = "2061482947"
	)
	SpritePixels method5491() {
		if (this.field3323 == null && this.field3322 != null && this.field3322.isDone()) { // L: 28
			if (this.field3322.getResponse() != null) { // L: 29
				this.field3323 = class155.method3172(this.field3322.getResponse()); // L: 30
			}

			this.field3322 = null; // L: 32
		}

		return this.field3323; // L: 34
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lmg;Lmg;Lmg;B)V",
		garbageValue = "14"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (class7.canvasWidth - 765) / 2; // L: 1260
		Login.loginBoxX = Login.xPadding + 202; // L: 1261
		Login.loginBoxCenter = Login.loginBoxX + 180; // L: 1262
		if (Login.worldSelectOpen) { // L: 1263
			GrandExchangeOfferNameComparator.method5896(var0, var1); // L: 1264
		} else {
			class10.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1267
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1268
			MusicPatchPcmStream.logoSprite.drawAt(Login.xPadding + 382 - MusicPatchPcmStream.logoSprite.subWidth / 2, 18); // L: 1269
			int var4;
			if (Client.gameState == 0 || Client.gameState == 5) { // L: 1270
				byte var3 = 20; // L: 1271
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1); // L: 1272
				var4 = 253 - var3; // L: 1273
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409); // L: 1274
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0); // L: 1275
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409); // L: 1276
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.Login_loadingPercent * 3 + (Login.loginBoxX + 180 - 150), var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0); // L: 1277
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1); // L: 1278
			}

			String var5;
			String var6;
			short var20;
			int var21;
			short var22;
			if (Client.gameState == 20) { // L: 1280
				class19.titleboxSprite.drawAt(Login.loginBoxX + 180 - class19.titleboxSprite.subWidth / 2, 271 - class19.titleboxSprite.subHeight / 2); // L: 1281
				var20 = 201; // L: 1282
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var20, 16776960, 0); // L: 1283
				var21 = var20 + 15; // L: 1284
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var21, 16776960, 0); // L: 1285
				var21 += 15; // L: 1286
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var21, 16776960, 0); // L: 1287
				var21 += 15; // L: 1288
				var21 += 7; // L: 1289
				if (Login.loginIndex != 4 && Login.loginIndex != 10) { // L: 1290
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var21, 16777215, 0); // L: 1291
					var22 = 200; // L: 1292

					for (var5 = KitDefinition.method3349(); var0.stringWidth(var5) > var22; var5 = var5.substring(0, var5.length() - 1)) { // L: 1293 1294 1295
					}

					var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var21, 16777215, 0); // L: 1297
					var21 += 15; // L: 1298

					for (var6 = NPCComposition.method3410(Login.Login_password); var0.stringWidth(var6) > var22; var6 = var6.substring(1)) { // L: 1299 1300 1301
					}

					var0.draw("Password: " + var6, Login.loginBoxX + 180 - 108, var21, 16777215, 0); // L: 1303
					var21 += 15; // L: 1304
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) { // L: 1307
				class19.titleboxSprite.drawAt(Login.loginBoxX, 171); // L: 1308
				short var13;
				if (Login.loginIndex == 0) { // L: 1309
					var20 = 251; // L: 1310
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var20, 16776960, 0); // L: 1311
					var21 = var20 + 30; // L: 1312
					var4 = Login.loginBoxX + 180 - 80; // L: 1313
					var13 = 291; // L: 1314
					Login.titlebuttonSprite.drawAt(var4 - 73, var13 - 20); // L: 1315
					var0.drawLines("New User", var4 - 73, var13 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1316
					var4 = Login.loginBoxX + 180 + 80; // L: 1317
					Login.titlebuttonSprite.drawAt(var4 - 73, var13 - 20); // L: 1318
					var0.drawLines("Existing User", var4 - 73, var13 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1319
				} else if (Login.loginIndex == 1) { // L: 1321
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0); // L: 1322
					var20 = 236; // L: 1323
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var20, 16777215, 0); // L: 1324
					var21 = var20 + 15; // L: 1325
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var21, 16777215, 0); // L: 1326
					var21 += 15; // L: 1327
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var21, 16777215, 0); // L: 1328
					var21 += 15; // L: 1329
					var4 = Login.loginBoxX + 180 - 80; // L: 1330
					var13 = 321; // L: 1331
					Login.titlebuttonSprite.drawAt(var4 - 73, var13 - 20); // L: 1332
					var0.drawCentered("Continue", var4, var13 + 5, 16777215, 0); // L: 1333
					var4 = Login.loginBoxX + 180 + 80; // L: 1334
					Login.titlebuttonSprite.drawAt(var4 - 73, var13 - 20); // L: 1335
					var0.drawCentered("Cancel", var4, var13 + 5, 16777215, 0); // L: 1336
				} else {
					int var7;
					int var9;
					if (Login.loginIndex == 2) { // L: 1338
						var20 = 201; // L: 1339
						var0.drawCentered(Login.Login_response1, Login.loginBoxCenter, var20, 16776960, 0); // L: 1340
						var21 = var20 + 15; // L: 1341
						var0.drawCentered(Login.Login_response2, Login.loginBoxCenter, var21, 16776960, 0); // L: 1342
						var21 += 15; // L: 1343
						var0.drawCentered(Login.Login_response3, Login.loginBoxCenter, var21, 16776960, 0); // L: 1344
						var21 += 15; // L: 1345
						var21 += 7; // L: 1346
						var0.draw("Login: ", Login.loginBoxCenter - 110, var21, 16777215, 0); // L: 1347
						var22 = 200; // L: 1348

						for (var5 = KitDefinition.method3349(); var0.stringWidth(var5) > var22; var5 = var5.substring(1)) { // L: 1349 1350 1351
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? Clock.colorStartTag(16776960) + "|" : ""), Login.loginBoxCenter - 70, var21, 16777215, 0); // L: 1353
						var21 += 15; // L: 1354

						for (var6 = NPCComposition.method3410(Login.Login_password); var0.stringWidth(var6) > var22; var6 = var6.substring(1)) { // L: 1355 1356 1357
						}

						var0.draw("Password: " + var6 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? Clock.colorStartTag(16776960) + "|" : ""), Login.loginBoxCenter - 108, var21, 16777215, 0); // L: 1359
						var21 += 15; // L: 1360
						var20 = 277; // L: 1361
						var7 = Login.loginBoxCenter + -117; // L: 1362
						IndexedSprite var17 = GraphicsObject.method1852(Client.Login_isUsernameRemembered, Login.field868); // L: 1363
						var17.drawAt(var7, var20); // L: 1364
						var7 = var7 + var17.subWidth + 5; // L: 1365
						var1.draw("Remember username", var7, var20 + 13, 16776960, 0); // L: 1366
						var7 = Login.loginBoxCenter + 24; // L: 1367
						var17 = GraphicsObject.method1852(FriendsChatMember.clientPreferences.method2211(), Login.field894); // L: 1368
						var17.drawAt(var7, var20); // L: 1369
						var7 = var7 + var17.subWidth + 5; // L: 1370
						var1.draw("Hide username", var7, var20 + 13, 16776960, 0); // L: 1371
						var21 = var20 + 15; // L: 1372
						var9 = Login.loginBoxCenter - 80; // L: 1373
						short var18 = 321; // L: 1374
						Login.titlebuttonSprite.drawAt(var9 - 73, var18 - 20); // L: 1375
						var0.drawCentered("Login", var9, var18 + 5, 16777215, 0); // L: 1376
						var9 = Login.loginBoxCenter + 80; // L: 1377
						Login.titlebuttonSprite.drawAt(var9 - 73, var18 - 20); // L: 1378
						var0.drawCentered("Cancel", var9, var18 + 5, 16777215, 0); // L: 1379
						var20 = 357; // L: 1380
						switch(Login.field875) { // L: 1381
						case 2:
							class145.field1650 = "Having trouble logging in?"; // L: 1383
							break;
						default:
							class145.field1650 = "Can't login? Click here."; // L: 1386
						}

						class11.field60 = new Bounds(Login.loginBoxCenter, var20, var1.stringWidth(class145.field1650), 11); // L: 1389
						UrlRequester.field1346 = new Bounds(Login.loginBoxCenter, var20, var1.stringWidth("Still having trouble logging in?"), 11); // L: 1390
						var1.drawCentered(class145.field1650, Login.loginBoxCenter, var20, 16777215, 0); // L: 1391
					} else if (Login.loginIndex == 3) { // L: 1393
						var20 = 201; // L: 1394
						var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var20, 16776960, 0); // L: 1395
						var21 = var20 + 20; // L: 1396
						var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var21, 16776960, 0); // L: 1397
						var21 += 15; // L: 1398
						var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var21, 16776960, 0); // L: 1399
						var21 += 15; // L: 1400
						var4 = Login.loginBoxX + 180; // L: 1401
						var13 = 276; // L: 1402
						Login.titlebuttonSprite.drawAt(var4 - 73, var13 - 20); // L: 1403
						var2.drawCentered("Try again", var4, var13 + 5, 16777215, 0); // L: 1404
						var4 = Login.loginBoxX + 180; // L: 1405
						var13 = 326; // L: 1406
						Login.titlebuttonSprite.drawAt(var4 - 73, var13 - 20); // L: 1407
						var2.drawCentered("Forgotten password?", var4, var13 + 5, 16777215, 0); // L: 1408
					} else if (Login.loginIndex == 4) { // L: 1410
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1411
						var20 = 236; // L: 1412
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var20, 16777215, 0); // L: 1413
						var21 = var20 + 15; // L: 1414
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var21, 16777215, 0); // L: 1415
						var21 += 15; // L: 1416
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var21, 16777215, 0); // L: 1417
						var21 += 15; // L: 1418
						var5 = "PIN: "; // L: 1420
						String var16 = KeyHandler.otp; // L: 1422
						var6 = WorldMapRegion.method4713('*', var16.length()); // L: 1424
						var0.draw(var5 + var6 + (Client.cycle % 40 < 20 ? Clock.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var21, 16777215, 0); // L: 1426
						var21 -= 8; // L: 1427
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var21, 16776960, 0); // L: 1428
						var21 += 15; // L: 1429
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var21, 16776960, 0); // L: 1430
						int var8 = 180 + Login.loginBoxX - 9 + var0.stringWidth("for 30 days: ") + 15; // L: 1431
						var9 = var21 - var0.ascent; // L: 1432
						IndexedSprite var10;
						if (Login.field895) { // L: 1434
							var10 = VerticalAlignment.options_buttons_2Sprite; // L: 1435
						} else {
							var10 = class29.options_buttons_0Sprite; // L: 1438
						}

						var10.drawAt(var8, var9); // L: 1440
						var21 += 15; // L: 1441
						int var11 = Login.loginBoxX + 180 - 80; // L: 1442
						short var12 = 321; // L: 1443
						Login.titlebuttonSprite.drawAt(var11 - 73, var12 - 20); // L: 1444
						var0.drawCentered("Continue", var11, var12 + 5, 16777215, 0); // L: 1445
						var11 = Login.loginBoxX + 180 + 80; // L: 1446
						Login.titlebuttonSprite.drawAt(var11 - 73, var12 - 20); // L: 1447
						var0.drawCentered("Cancel", var11, var12 + 5, 16777215, 0); // L: 1448
						var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var12 + 36, 255, 0); // L: 1449
					} else if (Login.loginIndex == 5) { // L: 1451
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1452
						var20 = 221; // L: 1453
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var20, 16776960, 0); // L: 1454
						var21 = var20 + 15; // L: 1455
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var21, 16776960, 0); // L: 1456
						var21 += 15; // L: 1457
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var21, 16776960, 0); // L: 1458
						var21 += 15; // L: 1459
						var21 += 14; // L: 1460
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var21, 16777215, 0); // L: 1461
						var22 = 174; // L: 1462

						for (var5 = KitDefinition.method3349(); var0.stringWidth(var5) > var22; var5 = var5.substring(1)) { // L: 1463 1464 1465
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? Clock.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var21, 16777215, 0); // L: 1467
						var21 += 15; // L: 1468
						int var15 = Login.loginBoxX + 180 - 80; // L: 1469
						short var23 = 321; // L: 1470
						Login.titlebuttonSprite.drawAt(var15 - 73, var23 - 20); // L: 1471
						var0.drawCentered("Recover", var15, var23 + 5, 16777215, 0); // L: 1472
						var15 = Login.loginBoxX + 180 + 80; // L: 1473
						Login.titlebuttonSprite.drawAt(var15 - 73, var23 - 20); // L: 1474
						var0.drawCentered("Back", var15, var23 + 5, 16777215, 0); // L: 1475
						var23 = 356; // L: 1476
						var1.drawCentered("Still having trouble logging in?", Login.loginBoxCenter, var23, 268435455, 0); // L: 1477
					} else if (Login.loginIndex == 6) { // L: 1479
						var20 = 201; // L: 1480
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var20, 16776960, 0); // L: 1481
						var21 = var20 + 15; // L: 1482
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var21, 16776960, 0); // L: 1483
						var21 += 15; // L: 1484
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var21, 16776960, 0); // L: 1485
						var21 += 15; // L: 1486
						var4 = Login.loginBoxX + 180; // L: 1487
						var13 = 321; // L: 1488
						Login.titlebuttonSprite.drawAt(var4 - 73, var13 - 20); // L: 1489
						var0.drawCentered("Back", var4, var13 + 5, 16777215, 0); // L: 1490
					} else if (Login.loginIndex == 7) { // L: 1492
						if (class82.field1066 && !Client.onMobile) { // L: 1493
							var20 = 201; // L: 1494
							var0.drawCentered(Login.Login_response1, Login.loginBoxCenter, var20, 16776960, 0); // L: 1495
							var21 = var20 + 15; // L: 1496
							var0.drawCentered(Login.Login_response2, Login.loginBoxCenter, var21, 16776960, 0); // L: 1497
							var21 += 15; // L: 1498
							var0.drawCentered(Login.Login_response3, Login.loginBoxCenter, var21, 16776960, 0); // L: 1499
							var4 = Login.loginBoxCenter - 150; // L: 1500
							var21 += 10; // L: 1501

							int var25;
							for (var25 = 0; var25 < 8; ++var25) { // L: 1502
								Login.titlebuttonSprite.method8048(var4, var21, 30, 40); // L: 1503
								boolean var26 = var25 == Login.field891 & Client.cycle % 40 < 20; // L: 1504
								var0.draw((Login.field892[var25] == null ? "" : Login.field892[var25]) + (var26 ? Clock.colorStartTag(16776960) + "|" : ""), var4 + 10, var21 + 27, 16777215, 0); // L: 1505
								if (var25 != 1 && var25 != 3) { // L: 1506
									var4 += 35; // L: 1511
								} else {
									var4 += 50; // L: 1507
									var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var21 + 27, 16777215, 0); // L: 1508
								}
							}

							var25 = Login.loginBoxCenter - 80; // L: 1514
							short var27 = 321; // L: 1515
							Login.titlebuttonSprite.drawAt(var25 - 73, var27 - 20); // L: 1516
							var0.drawCentered("Submit", var25, var27 + 5, 16777215, 0); // L: 1517
							var25 = Login.loginBoxCenter + 80; // L: 1518
							Login.titlebuttonSprite.drawAt(var25 - 73, var27 - 20); // L: 1519
							var0.drawCentered("Cancel", var25, var27 + 5, 16777215, 0); // L: 1520
						} else {
							var20 = 216; // L: 1523
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var20, 16776960, 0); // L: 1524
							var21 = var20 + 15; // L: 1525
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var21, 16776960, 0); // L: 1526
							var21 += 15; // L: 1527
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var21, 16776960, 0); // L: 1528
							var21 += 15; // L: 1529
							var4 = Login.loginBoxX + 180 - 80; // L: 1530
							var13 = 321; // L: 1531
							Login.titlebuttonSprite.drawAt(var4 - 73, var13 - 20); // L: 1532
							var0.drawCentered("Set Date of Birth", var4, var13 + 5, 16777215, 0); // L: 1533
							var4 = Login.loginBoxX + 180 + 80; // L: 1534
							Login.titlebuttonSprite.drawAt(var4 - 73, var13 - 20); // L: 1535
							var0.drawCentered("Back", var4, var13 + 5, 16777215, 0); // L: 1536
						}
					} else if (Login.loginIndex == 8) { // L: 1539
						var20 = 216; // L: 1540
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var20, 16776960, 0); // L: 1541
						var21 = var20 + 15; // L: 1542
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var21, 16776960, 0); // L: 1543
						var21 += 15; // L: 1544
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var21, 16776960, 0); // L: 1545
						var21 += 15; // L: 1546
						var4 = Login.loginBoxX + 180 - 80; // L: 1547
						var13 = 321; // L: 1548
						Login.titlebuttonSprite.drawAt(var4 - 73, var13 - 20); // L: 1549
						var0.drawCentered("Privacy Policy", var4, var13 + 5, 16777215, 0); // L: 1550
						var4 = Login.loginBoxX + 180 + 80; // L: 1551
						Login.titlebuttonSprite.drawAt(var4 - 73, var13 - 20); // L: 1552
						var0.drawCentered("Back", var4, var13 + 5, 16777215, 0); // L: 1553
					} else if (Login.loginIndex == 9) { // L: 1555
						var20 = 221; // L: 1556
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var20, 16776960, 0); // L: 1557
						var21 = var20 + 25; // L: 1558
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var21, 16776960, 0); // L: 1559
						var21 += 25; // L: 1560
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var21, 16776960, 0); // L: 1561
						var4 = Login.loginBoxX + 180; // L: 1562
						var13 = 311; // L: 1563
						Login.titlebuttonSprite.drawAt(var4 - 73, var13 - 20); // L: 1564
						var0.drawCentered("Try again", var4, var13 + 5, 16777215, 0); // L: 1565
					} else if (Login.loginIndex == 10) { // L: 1567
						var21 = Login.loginBoxX + 180; // L: 1568
						var22 = 209; // L: 1569
						var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var22, 16776960, 0); // L: 1570
						var4 = var22 + 20; // L: 1571
						class329.field4091.drawAt(var21 - 109, var4); // L: 1572
						Login.field872.drawAt(var21 - 48, var4 + 18); // L: 1573
					} else if (Login.loginIndex == 12) { // L: 1575
						var21 = Login.loginBoxCenter; // L: 1576
						var22 = 216; // L: 1577
						var2.drawCentered("Before using this app, please read and accept our", var21, var22, 16777215, 0); // L: 1578
						var4 = var22 + 17; // L: 1579
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var21, var4, 16777215, 0); // L: 1580
						var4 += 17; // L: 1581
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var21, var4, 16777215, 0); // L: 1582
						var4 += 17; // L: 1583
						var2.drawCentered("By accepting, you agree to these documents.", var21, var4, 16777215, 0); // L: 1584
						var21 = Login.loginBoxCenter - 80; // L: 1585
						var22 = 311; // L: 1586
						Login.titlebuttonSprite.drawAt(var21 - 73, var22 - 20); // L: 1587
						var0.drawCentered("Accept", var21, var22 + 5, 16777215, 0); // L: 1588
						var21 = Login.loginBoxCenter + 80; // L: 1589
						Login.titlebuttonSprite.drawAt(var21 - 73, var22 - 20); // L: 1590
						var0.drawCentered("Decline", var21, var22 + 5, 16777215, 0); // L: 1591
					} else if (Login.loginIndex == 13) { // L: 1593
						var20 = 231; // L: 1594
						var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var20, 16777215, 0); // L: 1595
						var21 = var20 + 20; // L: 1596
						var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var21, 16777215, 0); // L: 1597
						var4 = Login.loginBoxX + 180; // L: 1598
						var20 = 311; // L: 1599
						Login.titlebuttonSprite.drawAt(var4 - 73, var20 - 20); // L: 1600
						var0.drawCentered("Back", var4, var20 + 5, 16777215, 0); // L: 1601
					} else if (Login.loginIndex == 14) { // L: 1603
						var20 = 201; // L: 1604
						String var14 = ""; // L: 1605
						var5 = ""; // L: 1606
						var6 = ""; // L: 1607
						switch(Login.field882) { // L: 1608
						case 0:
							var14 = "Your account has been involved"; // L: 1618
							var5 = "in serious rule breaking."; // L: 1619
							var6 = ""; // L: 1620
							break; // L: 1621
						case 1:
							var14 = "Account locked as we suspect it has been stolen."; // L: 1630
							var5 = Strings.field3742; // L: 1631
							var6 = ""; // L: 1632
							break;
						case 2:
							var14 = "The unpaid balance on your account needs"; // L: 1611
							var5 = "to be resolved before you can play."; // L: 1612
							var6 = Strings.field3746; // L: 1613
							break;
						default:
							class6.Login_promptCredentials(false); // L: 1625
						}

						var0.drawCentered(var14, Login.loginBoxX + 180, var20, 16776960, 0); // L: 1636
						var21 = var20 + 20; // L: 1637
						var0.drawCentered(var5, Login.loginBoxX + 180, var21, 16776960, 0); // L: 1638
						var21 += 20; // L: 1639
						var0.drawCentered(var6, Login.loginBoxX + 180, var21, 16776960, 0); // L: 1640
						var7 = Login.loginBoxX + 180; // L: 1641
						short var24 = 276; // L: 1642
						Login.titlebuttonSprite.drawAt(var7 - 73, var24 - 20); // L: 1643
						var0.drawCentered("Support Page", var7, var24 + 5, 16777215, 0); // L: 1644
						var7 = Login.loginBoxX + 180; // L: 1645
						var24 = 326; // L: 1646
						Login.titlebuttonSprite.drawAt(var7 - 73, var24 - 20); // L: 1647
						var0.drawCentered("Back", var7, var24 + 5, 16777215, 0); // L: 1648
					} else if (Login.loginIndex == 24) { // L: 1650
						var20 = 221; // L: 1651
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var20, 16777215, 0); // L: 1652
						var21 = var20 + 15; // L: 1653
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var21, 16777215, 0); // L: 1654
						var21 += 15; // L: 1655
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var21, 16777215, 0); // L: 1656
						var21 += 15; // L: 1657
						var4 = Login.loginBoxX + 180; // L: 1658
						var13 = 301; // L: 1659
						Login.titlebuttonSprite.drawAt(var4 - 73, var13 - 20); // L: 1660
						var0.drawCentered("Ok", var4, var13 + 5, 16777215, 0); // L: 1661
					} else if (Login.loginIndex == 26) { // L: 1663
						var20 = 216; // L: 1664
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var20, 16776960, 0); // L: 1665
						var21 = var20 + 15; // L: 1666
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var21, 16776960, 0); // L: 1667
						var21 += 15; // L: 1668
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var21, 16776960, 0); // L: 1669
						var21 += 15; // L: 1670
						var4 = Login.loginBoxX + 180 - 80; // L: 1671
						var13 = 321; // L: 1672
						Login.titlebuttonSprite.drawAt(var4 - 73, var13 - 20); // L: 1673
						var0.drawCentered("Set Date of Birth", var4, var13 + 5, 16777215, 0); // L: 1674
						var4 = Login.loginBoxX + 180 + 80; // L: 1675
						Login.titlebuttonSprite.drawAt(var4 - 73, var13 - 20); // L: 1676
						var0.drawCentered("Back", var4, var13 + 5, 16777215, 0); // L: 1677
					}
				}
			}

			if (Client.gameState >= 10) { // L: 1680
				int[] var19 = new int[4]; // L: 1681
				Rasterizer2D.Rasterizer2D_getClipArray(var19); // L: 1682
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, DecorativeObject.canvasHeight); // L: 1683
				class259.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle); // L: 1684
				class259.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle); // L: 1685
				Rasterizer2D.Rasterizer2D_setClipArray(var19); // L: 1686
			}

			class161.title_muteSprite[FriendsChatMember.clientPreferences.method2213() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463); // L: 1688
			if (Client.gameState > 5 && MilliClock.clientLanguage == Language.Language_EN) { // L: 1689
				if (GrandExchangeOfferWorldComparator.field4064 != null) { // L: 1690
					var21 = Login.xPadding + 5; // L: 1691
					var22 = 463; // L: 1692
					byte var29 = 100; // L: 1693
					byte var28 = 35; // L: 1694
					GrandExchangeOfferWorldComparator.field4064.drawAt(var21, var22); // L: 1695
					var0.drawCentered("World" + " " + Client.worldId, var29 / 2 + var21, var28 / 2 + var22 - 2, 16777215, 0); // L: 1696
					if (class258.World_request != null) { // L: 1697
						var1.drawCentered("Loading...", var29 / 2 + var21, var28 / 2 + var22 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var29 / 2 + var21, var28 / 2 + var22 + 12, 16777215, 0); // L: 1698
					}
				} else {
					GrandExchangeOfferWorldComparator.field4064 = class150.SpriteBuffer_getIndexedSpriteByName(class299.archive8, "sl_button", ""); // L: 1701
				}
			}

		}
	} // L: 1265 1704
}
