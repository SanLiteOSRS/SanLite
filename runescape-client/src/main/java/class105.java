import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
final class class105 implements class323 {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lmi;)V"
	)
	class105(Widget var1) {
		this.val$cc = var1; // L: 506
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "17"
	)
	public void vmethod6045() {
		if (this.val$cc != null && this.val$cc.method6418().field3565 != null) { // L: 508
			ScriptEvent var1 = new ScriptEvent(); // L: 509
			var1.method2283(this.val$cc); // L: 510
			var1.setArgs(this.val$cc.method6418().field3565); // L: 511
			class30.method446().addFirst(var1); // L: 512
		}

	} // L: 514

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lpi;Lpi;Lpi;B)V",
		garbageValue = "-46"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (class113.canvasWidth - 765) / 2; // L: 1220
		Login.loginBoxX = Login.xPadding + 202; // L: 1221
		class452.loginBoxCenter = Login.loginBoxX + 180; // L: 1222
		byte var3;
		int var4;
		int var9;
		boolean var15;
		int var17;
		int var26;
		int var27;
		int var34;
		int var36;
		int var43;
		int var44;
		if (Login.worldSelectOpen) { // L: 1223
			if (class74.worldSelectBackSprites == null) { // L: 1225
				class74.worldSelectBackSprites = class20.method303(PcmPlayer.field304, "sl_back", "");
			}

			if (SoundCache.worldSelectFlagSprites == null) { // L: 1226
				SoundCache.worldSelectFlagSprites = class219.method4261(PcmPlayer.field304, "sl_flags", "");
			}

			if (MusicPatchPcmStream.worldSelectArrows == null) { // L: 1227
				MusicPatchPcmStream.worldSelectArrows = class219.method4261(PcmPlayer.field304, "sl_arrows", "");
			}

			if (SecureRandomCallable.worldSelectStars == null) { // L: 1228
				SecureRandomCallable.worldSelectStars = class219.method4261(PcmPlayer.field304, "sl_stars", "");
			}

			if (class85.worldSelectLeftSprite == null) { // L: 1229
				class85.worldSelectLeftSprite = class172.SpriteBuffer_getIndexedSpriteByName(PcmPlayer.field304, "leftarrow", "");
			}

			if (Skeleton.worldSelectRightSprite == null) { // L: 1230
				Skeleton.worldSelectRightSprite = class172.SpriteBuffer_getIndexedSpriteByName(PcmPlayer.field304, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0); // L: 1231
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624); // L: 1232
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513); // L: 1233
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1); // L: 1234
			if (SecureRandomCallable.worldSelectStars != null) { // L: 1235
				SecureRandomCallable.worldSelectStars[1].drawAt(Login.xPadding + 140, 1); // L: 1236
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1); // L: 1237
				SecureRandomCallable.worldSelectStars[0].drawAt(Login.xPadding + 140, 12); // L: 1238
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1); // L: 1239
			}

			if (MusicPatchPcmStream.worldSelectArrows != null) { // L: 1241
				var34 = Login.xPadding + 280; // L: 1242
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) { // L: 1243
					MusicPatchPcmStream.worldSelectArrows[2].drawAt(var34, 4);
				} else {
					MusicPatchPcmStream.worldSelectArrows[0].drawAt(var34, 4); // L: 1244
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) { // L: 1245
					MusicPatchPcmStream.worldSelectArrows[3].drawAt(var34 + 15, 4);
				} else {
					MusicPatchPcmStream.worldSelectArrows[1].drawAt(var34 + 15, 4); // L: 1246
				}

				var0.draw("World", var34 + 32, 17, 16777215, -1); // L: 1247
				var4 = Login.xPadding + 390; // L: 1248
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) { // L: 1249
					MusicPatchPcmStream.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					MusicPatchPcmStream.worldSelectArrows[0].drawAt(var4, 4); // L: 1250
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) { // L: 1251
					MusicPatchPcmStream.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					MusicPatchPcmStream.worldSelectArrows[1].drawAt(var4 + 15, 4); // L: 1252
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1); // L: 1253
				var43 = Login.xPadding + 500; // L: 1254
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) { // L: 1255
					MusicPatchPcmStream.worldSelectArrows[2].drawAt(var43, 4);
				} else {
					MusicPatchPcmStream.worldSelectArrows[0].drawAt(var43, 4); // L: 1256
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) { // L: 1257
					MusicPatchPcmStream.worldSelectArrows[3].drawAt(var43 + 15, 4);
				} else {
					MusicPatchPcmStream.worldSelectArrows[1].drawAt(var43 + 15, 4); // L: 1258
				}

				var0.draw("Location", var43 + 32, 17, 16777215, -1); // L: 1259
				var27 = Login.xPadding + 610; // L: 1260
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) { // L: 1261
					MusicPatchPcmStream.worldSelectArrows[2].drawAt(var27, 4);
				} else {
					MusicPatchPcmStream.worldSelectArrows[0].drawAt(var27, 4); // L: 1262
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) { // L: 1263
					MusicPatchPcmStream.worldSelectArrows[3].drawAt(var27 + 15, 4);
				} else {
					MusicPatchPcmStream.worldSelectArrows[1].drawAt(var27 + 15, 4); // L: 1264
				}

				var0.draw("Type", var27 + 32, 17, 16777215, -1); // L: 1265
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0); // L: 1267
			var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1); // L: 1268
			Login.hoveredWorldIndex = -1; // L: 1269
			if (class74.worldSelectBackSprites != null) { // L: 1270
				var3 = 88; // L: 1271
				byte var39 = 19; // L: 1272
				var43 = 765 / (var3 + 1) - 1; // L: 1273
				var27 = 480 / (var39 + 1); // L: 1274

				do {
					var44 = var27; // L: 1276
					var26 = var43; // L: 1277
					if (var27 * (var43 - 1) >= World.World_count) { // L: 1278
						--var43;
					}

					if (var43 * (var27 - 1) >= World.World_count) { // L: 1279
						--var27;
					}

					if (var43 * (var27 - 1) >= World.World_count) { // L: 1280
						--var27;
					}
				} while(var44 != var27 || var26 != var43); // L: 1281

				var44 = (765 - var3 * var43) / (var43 + 1); // L: 1283
				if (var44 > 5) { // L: 1284
					var44 = 5;
				}

				var26 = (480 - var39 * var27) / (var27 + 1); // L: 1285
				if (var26 > 5) { // L: 1286
					var26 = 5;
				}

				var9 = (765 - var43 * var3 - var44 * (var43 - 1)) / 2; // L: 1287
				int var29 = (480 - var27 * var39 - var26 * (var27 - 1)) / 2; // L: 1288
				var36 = (var27 + World.World_count - 1) / var27; // L: 1289
				Login.worldSelectPagesCount = var36 - var43; // L: 1290
				if (class85.worldSelectLeftSprite != null && Login.worldSelectPage > 0) { // L: 1291
					class85.worldSelectLeftSprite.drawAt(8, class177.canvasHeight / 2 - class85.worldSelectLeftSprite.subHeight / 2); // L: 1292
				}

				if (Skeleton.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) { // L: 1294
					Skeleton.worldSelectRightSprite.drawAt(class113.canvasWidth - Skeleton.worldSelectRightSprite.subWidth - 8, class177.canvasHeight / 2 - Skeleton.worldSelectRightSprite.subHeight / 2); // L: 1295
				}

				int var38 = var29 + 23; // L: 1297
				int var30 = var9 + Login.xPadding; // L: 1298
				int var31 = 0; // L: 1299
				var15 = false; // L: 1300
				int var40 = Login.worldSelectPage; // L: 1301

				for (var17 = var27 * var40; var17 < World.World_count && var40 - Login.worldSelectPage < var43; ++var17) { // L: 1302 1303
					World var32 = class176.World_worlds[var17]; // L: 1306
					boolean var19 = true; // L: 1307
					String var20 = Integer.toString(var32.population); // L: 1308
					if (var32.population == -1) { // L: 1309
						var20 = "OFF"; // L: 1310
						var19 = false; // L: 1311
					} else if (var32.population > 1980) { // L: 1313
						var20 = "FULL"; // L: 1314
						var19 = false; // L: 1315
					}

					class108 var21 = null; // L: 1317
					int var22 = 0; // L: 1318
					if (var32.isBeta()) { // L: 1319
						var21 = var32.isMembersOnly() ? class108.field1397 : class108.field1407; // L: 1320
					} else if (var32.isDeadman()) { // L: 1322
						var21 = var32.isMembersOnly() ? class108.field1406 : class108.field1399; // L: 1323
					} else if (var32.method1808()) { // L: 1325
						var22 = 16711680; // L: 1326
						var21 = var32.isMembersOnly() ? class108.field1396 : class108.field1391; // L: 1327
					} else if (var32.method1809()) { // L: 1329
						var21 = var32.isMembersOnly() ? class108.field1395 : class108.field1400; // L: 1330
					} else if (var32.isPvp()) { // L: 1332
						var21 = var32.isMembersOnly() ? class108.field1394 : class108.field1398; // L: 1333
					} else if (var32.method1843()) { // L: 1335
						var21 = var32.isMembersOnly() ? class108.field1402 : class108.field1401; // L: 1336
					} else if (var32.method1811()) { // L: 1338
						var21 = var32.isMembersOnly() ? class108.field1404 : class108.field1403; // L: 1339
					}

					if (var21 == null || var21.field1405 >= class74.worldSelectBackSprites.length) { // L: 1341
						var21 = var32.isMembersOnly() ? class108.field1392 : class108.field1393; // L: 1342
					}

					if (MouseHandler.MouseHandler_x >= var30 && MouseHandler.MouseHandler_y >= var38 && MouseHandler.MouseHandler_x < var30 + var3 && MouseHandler.MouseHandler_y < var38 + var39 && var19) { // L: 1344
						Login.hoveredWorldIndex = var17; // L: 1345
						class74.worldSelectBackSprites[var21.field1405].drawTransOverlayAt(var30, var38, 128, 16777215); // L: 1346
						var15 = true; // L: 1347
					} else {
						class74.worldSelectBackSprites[var21.field1405].drawAt(var30, var38); // L: 1349
					}

					if (SoundCache.worldSelectFlagSprites != null) { // L: 1350
						SoundCache.worldSelectFlagSprites[(var32.isMembersOnly() ? 8 : 0) + var32.location].drawAt(var30 + 29, var38);
					}

					var0.drawCentered(Integer.toString(var32.id), var30 + 15, var39 / 2 + var38 + 5, var22, -1); // L: 1351
					var1.drawCentered(var20, var30 + 60, var39 / 2 + var38 + 5, 268435455, -1); // L: 1352
					var38 = var38 + var39 + var26; // L: 1353
					++var31; // L: 1354
					if (var31 >= var27) {
						var38 = var29 + 23; // L: 1355
						var30 = var30 + var3 + var44; // L: 1356
						var31 = 0; // L: 1357
						++var40; // L: 1358
					}
				}

				if (var15) { // L: 1361
					var17 = var1.stringWidth(class176.World_worlds[Login.hoveredWorldIndex].activity) + 6; // L: 1362
					int var41 = var1.ascent + 8; // L: 1363
					int var42 = MouseHandler.MouseHandler_y + 25; // L: 1364
					if (var41 + var42 > 480) { // L: 1365
						var42 = MouseHandler.MouseHandler_y - 25 - var41; // L: 1366
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var17 / 2, var42, var17, var41, 16777120); // L: 1368
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var17 / 2, var42, var17, var41, 0); // L: 1369
					var1.drawCentered(class176.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var42 + var1.ascent + 4, 0, -1); // L: 1370
				}
			}

		} else {
			Login.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1376
			Bounds.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1377
			SoundSystem.logoSprite.drawAt(Login.xPadding + 382 - SoundSystem.logoSprite.subWidth / 2, 18); // L: 1378
			if (Client.gameState == 0 || Client.gameState == 5) { // L: 1379
				var3 = 20; // L: 1380
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1); // L: 1381
				var4 = 253 - var3; // L: 1382
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409); // L: 1383
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0); // L: 1384
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409); // L: 1385
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150 + Login.Login_loadingPercent * 3, var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0); // L: 1386
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1); // L: 1387
			}

			String var5;
			String var6;
			String var7;
			String var8;
			short var33;
			short var35;
			if (Client.gameState == 20) { // L: 1389
				Login.titleboxSprite.drawAt(Login.loginBoxX + 180 - Login.titleboxSprite.subWidth / 2, 271 - Login.titleboxSprite.subHeight / 2); // L: 1390
				var33 = 201; // L: 1391
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1392
				var34 = var33 + 15; // L: 1393
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16776960, 0); // L: 1394
				var34 += 15; // L: 1395
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16776960, 0); // L: 1396
				var34 += 15; // L: 1397
				var34 += 7; // L: 1398
				if (Login.loginIndex != 4 && Login.loginIndex != 10) { // L: 1399
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var34, 16777215, 0); // L: 1400
					var35 = 200; // L: 1401

					for (var5 = class238.method4767(); var0.stringWidth(var5) > var35; var5 = var5.substring(0, var5.length() - 1)) { // L: 1402 1403 1404
					}

					var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var34, 16777215, 0); // L: 1406
					var34 += 15; // L: 1407
					var7 = Login.Login_password; // L: 1409
					var6 = class270.method5493('*', var7.length()); // L: 1411

					for (var8 = var6; var0.stringWidth(var8) > var35; var8 = var8.substring(1)) { // L: 1413 1414 1415
					}

					var0.draw("Password: " + var8, Login.loginBoxX + 180 - 108, var34, 16777215, 0); // L: 1417
					var34 += 15; // L: 1418
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) { // L: 1421
				Login.titleboxSprite.drawAt(Login.loginBoxX, 171); // L: 1422
				short var23;
				if (Login.loginIndex == 0) { // L: 1423
					var33 = 251; // L: 1424
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1425
					var34 = var33 + 30; // L: 1426
					var4 = Login.loginBoxX + 180 - 80; // L: 1427
					var23 = 291; // L: 1428
					class219.field2417.drawAt(var4 - 73, var23 - 20); // L: 1429
					var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1430
					var4 = Login.loginBoxX + 180 + 80; // L: 1431
					class219.field2417.drawAt(var4 - 73, var23 - 20); // L: 1432
					var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1433
				} else if (Login.loginIndex == 1) { // L: 1435
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0); // L: 1436
					var33 = 236; // L: 1437
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16777215, 0); // L: 1438
					var34 = var33 + 15; // L: 1439
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16777215, 0); // L: 1440
					var34 += 15; // L: 1441
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16777215, 0); // L: 1442
					var34 += 15; // L: 1443
					var4 = Login.loginBoxX + 180 - 80; // L: 1444
					var23 = 321; // L: 1445
					class219.field2417.drawAt(var4 - 73, var23 - 20); // L: 1446
					var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0); // L: 1447
					var4 = Login.loginBoxX + 180 + 80; // L: 1448
					class219.field2417.drawAt(var4 - 73, var23 - 20); // L: 1449
					var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0); // L: 1450
				} else {
					IndexedSprite var10;
					if (Login.loginIndex == 2) { // L: 1452
						var33 = 201; // L: 1453
						var0.drawCentered(Login.Login_response1, class452.loginBoxCenter, var33, 16776960, 0); // L: 1454
						var34 = var33 + 15; // L: 1455
						var0.drawCentered(Login.Login_response2, class452.loginBoxCenter, var34, 16776960, 0); // L: 1456
						var34 += 15; // L: 1457
						var0.drawCentered(Login.Login_response3, class452.loginBoxCenter, var34, 16776960, 0); // L: 1458
						var34 += 15; // L: 1459
						var34 += 7; // L: 1460
						var0.draw("Login: ", class452.loginBoxCenter - 110, var34, 16777215, 0); // L: 1461
						var35 = 200; // L: 1462

						for (var5 = class238.method4767(); var0.stringWidth(var5) > var35; var5 = var5.substring(1)) { // L: 1463 1464 1465
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? class217.colorStartTag(16776960) + "|" : ""), class452.loginBoxCenter - 70, var34, 16777215, 0); // L: 1467
						var34 += 15; // L: 1468
						var7 = Login.Login_password; // L: 1470
						var6 = class270.method5493('*', var7.length()); // L: 1472

						for (var8 = var6; var0.stringWidth(var8) > var35; var8 = var8.substring(1)) { // L: 1474 1475 1476
						}

						var0.draw("Password: " + var8 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? class217.colorStartTag(16776960) + "|" : ""), class452.loginBoxCenter - 108, var34, 16777215, 0); // L: 1478
						var34 += 15; // L: 1479
						var33 = 277; // L: 1480
						var9 = class452.loginBoxCenter + -117; // L: 1481
						boolean var11 = Client.Login_isUsernameRemembered; // L: 1483
						boolean var12 = Login.field935; // L: 1484
						var10 = var11 ? (var12 ? VerticalAlignment.field2083 : UserComparator6.field1491) : (var12 ? Skills.field3850 : Login.field929); // L: 1486
						var10.drawAt(var9, var33); // L: 1489
						var9 = var9 + var10.subWidth + 5; // L: 1490
						var1.draw("Remember username", var9, var33 + 13, 16776960, 0); // L: 1491
						var9 = class452.loginBoxCenter + 24; // L: 1492
						var15 = class449.clientPreferences.method2454(); // L: 1494
						boolean var16 = Login.field963; // L: 1495
						IndexedSprite var14 = var15 ? (var16 ? VerticalAlignment.field2083 : UserComparator6.field1491) : (var16 ? Skills.field3850 : Login.field929); // L: 1497
						var14.drawAt(var9, var33); // L: 1500
						var9 = var9 + var14.subWidth + 5; // L: 1501
						var1.draw("Hide username", var9, var33 + 13, 16776960, 0); // L: 1502
						var34 = var33 + 15; // L: 1503
						var17 = class452.loginBoxCenter - 80; // L: 1504
						short var18 = 321; // L: 1505
						class219.field2417.drawAt(var17 - 73, var18 - 20); // L: 1506
						var0.drawCentered("Login", var17, var18 + 5, 16777215, 0); // L: 1507
						var17 = class452.loginBoxCenter + 80; // L: 1508
						class219.field2417.drawAt(var17 - 73, var18 - 20); // L: 1509
						var0.drawCentered("Cancel", var17, var18 + 5, 16777215, 0); // L: 1510
						var33 = 357; // L: 1511
						switch(Login.field943) { // L: 1512
						case 2:
							class151.field1714 = "Having trouble logging in?"; // L: 1514
							break;
						default:
							class151.field1714 = "Can't login? Click here."; // L: 1517
						}

						class102.field1343 = new Bounds(class452.loginBoxCenter, var33, var1.stringWidth(class151.field1714), 11); // L: 1520
						class90.field1117 = new Bounds(class452.loginBoxCenter, var33, var1.stringWidth("Still having trouble logging in?"), 11); // L: 1521
						var1.drawCentered(class151.field1714, class452.loginBoxCenter, var33, 16777215, 0); // L: 1522
					} else if (Login.loginIndex == 3) { // L: 1524
						var33 = 201; // L: 1525
						var0.drawCentered("Incorrect username or password.", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1526
						var34 = var33 + 20; // L: 1527
						var1.drawCentered("If you have upgraded to a Jagex Account, you", Login.loginBoxX + 180, var34, 16776960, 0); // L: 1528
						var34 += 20; // L: 1529
						var1.drawCentered("need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", Login.loginBoxX + 180, var34, 16776960, 0); // L: 1530
						var34 += 15; // L: 1531
						var4 = Login.loginBoxX + 180; // L: 1532
						var23 = 276; // L: 1533
						class219.field2417.drawAt(var4 - 73, var23 - 20); // L: 1534
						var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0); // L: 1535
						var4 = Login.loginBoxX + 180; // L: 1536
						var23 = 326; // L: 1537
						class219.field2417.drawAt(var4 - 73, var23 - 20); // L: 1538
						var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0); // L: 1539
					} else if (Login.loginIndex == 4) { // L: 1541
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1542
						var33 = 236; // L: 1543
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16777215, 0); // L: 1544
						var34 = var33 + 15; // L: 1545
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16777215, 0); // L: 1546
						var34 += 15; // L: 1547
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16777215, 0); // L: 1548
						var34 += 15; // L: 1549
						var5 = "PIN: "; // L: 1551
						var7 = class369.otp; // L: 1553
						var6 = class270.method5493('*', var7.length()); // L: 1555
						var0.draw(var5 + var6 + (Client.cycle % 40 < 20 ? class217.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var34, 16777215, 0); // L: 1557
						var34 -= 8; // L: 1558
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var34, 16776960, 0); // L: 1559
						var34 += 15; // L: 1560
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var34, 16776960, 0); // L: 1561
						var26 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15; // L: 1562
						var9 = var34 - var0.ascent; // L: 1563
						if (Login.field956) { // L: 1565
							var10 = UserComparator6.field1491; // L: 1566
						} else {
							var10 = Login.field929; // L: 1569
						}

						var10.drawAt(var26, var9); // L: 1571
						var34 += 15; // L: 1572
						var36 = Login.loginBoxX + 180 - 80; // L: 1573
						short var37 = 321; // L: 1574
						class219.field2417.drawAt(var36 - 73, var37 - 20); // L: 1575
						var0.drawCentered("Continue", var36, var37 + 5, 16777215, 0); // L: 1576
						var36 = Login.loginBoxX + 180 + 80; // L: 1577
						class219.field2417.drawAt(var36 - 73, var37 - 20); // L: 1578
						var0.drawCentered("Cancel", var36, var37 + 5, 16777215, 0); // L: 1579
						var1.drawCentered("Can't login? Click here.", Login.loginBoxX + 180, var37 + 36, 16777215, 0); // L: 1580
					} else if (Login.loginIndex == 5) { // L: 1582
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1583
						var33 = 221; // L: 1584
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1585
						var34 = var33 + 15; // L: 1586
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16776960, 0); // L: 1587
						var34 += 15; // L: 1588
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16776960, 0); // L: 1589
						var34 += 15; // L: 1590
						var34 += 14; // L: 1591
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var34, 16777215, 0); // L: 1592
						var35 = 174; // L: 1593

						for (var5 = class238.method4767(); var0.stringWidth(var5) > var35; var5 = var5.substring(1)) { // L: 1594 1595 1596
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? class217.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var34, 16777215, 0); // L: 1598
						var34 += 15; // L: 1599
						var27 = Login.loginBoxX + 180 - 80; // L: 1600
						short var25 = 321; // L: 1601
						class219.field2417.drawAt(var27 - 73, var25 - 20); // L: 1602
						var0.drawCentered("Recover", var27, var25 + 5, 16777215, 0); // L: 1603
						var27 = Login.loginBoxX + 180 + 80; // L: 1604
						class219.field2417.drawAt(var27 - 73, var25 - 20); // L: 1605
						var0.drawCentered("Back", var27, var25 + 5, 16777215, 0); // L: 1606
						var25 = 356; // L: 1607
						var1.drawCentered("Still having trouble logging in?", class452.loginBoxCenter, var25, 268435455, 0); // L: 1608
					} else if (Login.loginIndex == 6) { // L: 1610
						var33 = 201; // L: 1611
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1612
						var34 = var33 + 15; // L: 1613
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16776960, 0); // L: 1614
						var34 += 15; // L: 1615
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16776960, 0); // L: 1616
						var34 += 15; // L: 1617
						var4 = Login.loginBoxX + 180; // L: 1618
						var23 = 321; // L: 1619
						class219.field2417.drawAt(var4 - 73, var23 - 20); // L: 1620
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1621
					} else if (Login.loginIndex == 7) { // L: 1623
						if (ModeWhere.field4404 && !Client.onMobile) { // L: 1624
							var33 = 201; // L: 1625
							var0.drawCentered(Login.Login_response1, class452.loginBoxCenter, var33, 16776960, 0); // L: 1626
							var34 = var33 + 15; // L: 1627
							var0.drawCentered(Login.Login_response2, class452.loginBoxCenter, var34, 16776960, 0); // L: 1628
							var34 += 15; // L: 1629
							var0.drawCentered(Login.Login_response3, class452.loginBoxCenter, var34, 16776960, 0); // L: 1630
							var4 = class452.loginBoxCenter - 150; // L: 1631
							var34 += 10; // L: 1632

							for (var43 = 0; var43 < 8; ++var43) { // L: 1633
								class219.field2417.method9480(var4, var34, 30, 40); // L: 1634
								boolean var46 = var43 == Login.field951 & Client.cycle % 40 < 20; // L: 1635
								var0.draw((Login.field954[var43] == null ? "" : Login.field954[var43]) + (var46 ? class217.colorStartTag(16776960) + "|" : ""), var4 + 10, var34 + 27, 16777215, 0); // L: 1636
								if (var43 != 1 && var43 != 3) { // L: 1637
									var4 += 35; // L: 1642
								} else {
									var4 += 50; // L: 1638
									var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var34 + 27, 16777215, 0); // L: 1639
								}
							}

							var43 = class452.loginBoxCenter - 80; // L: 1645
							short var47 = 321; // L: 1646
							class219.field2417.drawAt(var43 - 73, var47 - 20); // L: 1647
							var0.drawCentered("Submit", var43, var47 + 5, 16777215, 0); // L: 1648
							var43 = class452.loginBoxCenter + 80; // L: 1649
							class219.field2417.drawAt(var43 - 73, var47 - 20); // L: 1650
							var0.drawCentered("Cancel", var43, var47 + 5, 16777215, 0); // L: 1651
						} else {
							var33 = 216; // L: 1654
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1655
							var34 = var33 + 15; // L: 1656
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var34, 16776960, 0); // L: 1657
							var34 += 15; // L: 1658
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var34, 16776960, 0); // L: 1659
							var34 += 15; // L: 1660
							var4 = Login.loginBoxX + 180 - 80; // L: 1661
							var23 = 321; // L: 1662
							class219.field2417.drawAt(var4 - 73, var23 - 20); // L: 1663
							var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0); // L: 1664
							var4 = Login.loginBoxX + 180 + 80; // L: 1665
							class219.field2417.drawAt(var4 - 73, var23 - 20); // L: 1666
							var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1667
						}
					} else if (Login.loginIndex == 8) { // L: 1670
						var33 = 216; // L: 1671
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1672
						var34 = var33 + 15; // L: 1673
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var34, 16776960, 0); // L: 1674
						var34 += 15; // L: 1675
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var34, 16776960, 0); // L: 1676
						var34 += 15; // L: 1677
						var4 = Login.loginBoxX + 180 - 80; // L: 1678
						var23 = 321; // L: 1679
						class219.field2417.drawAt(var4 - 73, var23 - 20); // L: 1680
						var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0); // L: 1681
						var4 = Login.loginBoxX + 180 + 80; // L: 1682
						class219.field2417.drawAt(var4 - 73, var23 - 20); // L: 1683
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1684
					} else if (Login.loginIndex == 9) { // L: 1686
						var33 = 221; // L: 1687
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1688
						var34 = var33 + 25; // L: 1689
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16776960, 0); // L: 1690
						var34 += 25; // L: 1691
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16776960, 0); // L: 1692
						var4 = Login.loginBoxX + 180; // L: 1693
						var23 = 311; // L: 1694
						class219.field2417.drawAt(var4 - 73, var23 - 20); // L: 1695
						var0.drawCentered("Try again", var4, var23 + 5, 16777215, 0); // L: 1696
					} else if (Login.loginIndex == 10) { // L: 1698
						var34 = Login.loginBoxX + 180; // L: 1699
						var35 = 209; // L: 1700
						var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var35, 16776960, 0); // L: 1701
						var4 = var35 + 20; // L: 1702
						Login.field933.drawAt(var34 - 109, var4); // L: 1703
						if (Login.field953.isEmpty()) { // L: 1704
							ItemContainer.field1068.drawAt(var34 - 48, var4 + 18); // L: 1705
						} else {
							ItemContainer.field1068.drawAt(var34 - 48, var4 + 5); // L: 1708
							var0.drawCentered(Login.field953, var34, var4 + 68 - 15, 16776960, 0); // L: 1709
						}
					} else if (Login.loginIndex == 12) { // L: 1712
						var34 = class452.loginBoxCenter; // L: 1713
						var35 = 216; // L: 1714
						var2.drawCentered("Before using this app, please read and accept our", var34, var35, 16777215, 0); // L: 1715
						var4 = var35 + 17; // L: 1716
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var34, var4, 16777215, 0); // L: 1717
						var4 += 17; // L: 1718
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var34, var4, 16777215, 0); // L: 1719
						var4 += 17; // L: 1720
						var2.drawCentered("By accepting, you agree to these documents.", var34, var4, 16777215, 0); // L: 1721
						var34 = class452.loginBoxCenter - 80; // L: 1722
						var35 = 311; // L: 1723
						class219.field2417.drawAt(var34 - 73, var35 - 20); // L: 1724
						var0.drawCentered("Accept", var34, var35 + 5, 16777215, 0); // L: 1725
						var34 = class452.loginBoxCenter + 80; // L: 1726
						class219.field2417.drawAt(var34 - 73, var35 - 20); // L: 1727
						var0.drawCentered("Decline", var34, var35 + 5, 16777215, 0); // L: 1728
					} else if (Login.loginIndex == 13) { // L: 1730
						var33 = 231; // L: 1731
						var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var33, 16777215, 0); // L: 1732
						var34 = var33 + 20; // L: 1733
						var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var34, 16777215, 0); // L: 1734
						var4 = Login.loginBoxX + 180; // L: 1735
						var33 = 311; // L: 1736
						class219.field2417.drawAt(var4 - 73, var33 - 20); // L: 1737
						var0.drawCentered("Back", var4, var33 + 5, 16777215, 0); // L: 1738
					} else if (Login.loginIndex == 14) { // L: 1740
						var33 = 201; // L: 1741
						String var24 = ""; // L: 1742
						var5 = ""; // L: 1743
						var6 = ""; // L: 1744
						switch(Login.field942) { // L: 1745
						case 0:
							var24 = "Your account has been involved"; // L: 1755
							var5 = "in serious rule breaking."; // L: 1756
							var6 = ""; // L: 1757
							break; // L: 1758
						case 1:
							var24 = "Your account has been locked due to"; // L: 1748
							var5 = "suspicious activity."; // L: 1749
							var6 = "Please recover your account."; // L: 1750
							break;
						case 2:
							var24 = "The unpaid balance on your account needs"; // L: 1767
							var5 = "to be resolved before you can play."; // L: 1768
							var6 = class351.field4044; // L: 1769
							break;
						default:
							WorldMapAreaData.Login_promptCredentials(false); // L: 1762
						}

						var0.drawCentered(var24, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1773
						var34 = var33 + 20; // L: 1774
						var0.drawCentered(var5, Login.loginBoxX + 180, var34, 16776960, 0); // L: 1775
						var34 += 20; // L: 1776
						var0.drawCentered(var6, Login.loginBoxX + 180, var34, 16776960, 0); // L: 1777
						var44 = Login.loginBoxX + 180; // L: 1778
						short var45 = 276; // L: 1779
						class219.field2417.drawAt(var44 - 73, var45 - 20); // L: 1780
						if (Login.field942 == 1) { // L: 1781
							var0.drawCentered("Recover Account", var44, var45 + 5, 16777215, 0); // L: 1782
						} else {
							var0.drawCentered("View Appeal Options", var44, var45 + 5, 16777215, 0); // L: 1785
						}

						var44 = Login.loginBoxX + 180; // L: 1787
						var45 = 326; // L: 1788
						class219.field2417.drawAt(var44 - 73, var45 - 20); // L: 1789
						var0.drawCentered("Back", var44, var45 + 5, 16777215, 0); // L: 1790
					} else if (Login.loginIndex == 24) { // L: 1792
						var33 = 221; // L: 1793
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16777215, 0); // L: 1794
						var34 = var33 + 15; // L: 1795
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16777215, 0); // L: 1796
						var34 += 15; // L: 1797
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16777215, 0); // L: 1798
						var34 += 15; // L: 1799
						var4 = Login.loginBoxX + 180; // L: 1800
						var23 = 301; // L: 1801
						class219.field2417.drawAt(var4 - 73, var23 - 20); // L: 1802
						var0.drawCentered("Ok", var4, var23 + 5, 16777215, 0); // L: 1803
					} else if (Login.loginIndex == 32) { // L: 1805
						var33 = 216; // L: 1806
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1807
						var34 = var33 + 15; // L: 1808
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var34, 16776960, 0); // L: 1809
						var34 += 15; // L: 1810
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var34, 16776960, 0); // L: 1811
						var34 += 15; // L: 1812
						var4 = Login.loginBoxX + 180 - 80; // L: 1813
						var23 = 321; // L: 1814
						class219.field2417.drawAt(var4 - 73, var23 - 20); // L: 1815
						var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0); // L: 1816
						var4 = Login.loginBoxX + 180 + 80; // L: 1817
						class219.field2417.drawAt(var4 - 73, var23 - 20); // L: 1818
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1819
					} else if (Login.loginIndex == 33) { // L: 1821
						var33 = 201; // L: 1822
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1823
						var34 = var33 + 20; // L: 1824
						var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16776960, 0); // L: 1825
						var34 += 20; // L: 1826
						var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16776960, 0); // L: 1827
						var34 += 15; // L: 1828
						var4 = Login.loginBoxX + 180; // L: 1829
						var23 = 276; // L: 1830
						class219.field2417.drawAt(var4 - 73, var23 - 20); // L: 1831
						var2.drawCentered("Download Launcher", var4, var23 + 5, 16777215, 0); // L: 1832
						var4 = Login.loginBoxX + 180; // L: 1833
						var23 = 326; // L: 1834
						class219.field2417.drawAt(var4 - 73, var23 - 20); // L: 1835
						var2.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1836
					}
				}
			}

			if (Client.gameState >= 10) { // L: 1839
				int[] var28 = new int[4]; // L: 1840
				Rasterizer2D.Rasterizer2D_getClipArray(var28); // L: 1841
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class177.canvasHeight); // L: 1842
				class139.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle); // L: 1843
				class139.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle); // L: 1844
				Rasterizer2D.Rasterizer2D_setClipArray(var28); // L: 1845
			}

			class13.title_muteSprite[class449.clientPreferences.method2484() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463); // L: 1847
			if (Client.gameState > 5 && Language.Language_EN == ClanChannelMember.clientLanguage) { // L: 1848
				if (VarcInt.field1966 != null) { // L: 1849
					var34 = Login.xPadding + 5; // L: 1850
					var35 = 463; // L: 1851
					byte var48 = 100; // L: 1852
					byte var49 = 35; // L: 1853
					VarcInt.field1966.drawAt(var34, var35); // L: 1854
					var0.drawCentered("World" + " " + Client.worldId, var48 / 2 + var34, var49 / 2 + var35 - 2, 16777215, 0); // L: 1855
					if (WorldMapLabelSize.World_request != null) { // L: 1856
						var1.drawCentered("Loading...", var48 / 2 + var34, var49 / 2 + var35 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var48 / 2 + var34, var49 / 2 + var35 + 12, 16777215, 0); // L: 1857
					}
				} else {
					VarcInt.field1966 = class172.SpriteBuffer_getIndexedSpriteByName(PcmPlayer.field304, "sl_button", ""); // L: 1860
				}
			}

		}
	} // L: 1374 1863

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "163402086"
	)
	static void method2689() {
		Client.packetWriter.clearBuffer(); // L: 2734
		Client.packetWriter.packetBuffer.offset = 0; // L: 2735
		Client.packetWriter.serverPacket = null; // L: 2736
		Client.packetWriter.field1430 = null; // L: 2737
		Client.packetWriter.field1436 = null; // L: 2738
		Client.packetWriter.field1437 = null; // L: 2739
		Client.packetWriter.serverPacketLength = 0; // L: 2740
		Client.packetWriter.field1435 = 0; // L: 2741
		Client.rebootTimer = 0; // L: 2742
		Frames.method4718(); // L: 2743
		Client.minimapState = 0; // L: 2744
		Client.destinationX = 0; // L: 2745

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) { // L: 2746
			Client.players[var0] = null;
		}

		VarbitComposition.localPlayer = null; // L: 2747

		for (var0 = 0; var0 < Client.npcs.length; ++var0) { // L: 2748
			NPC var1 = Client.npcs[var0]; // L: 2749
			if (var1 != null) { // L: 2750
				var1.targetIndex = -1; // L: 2751
				var1.false0 = false; // L: 2752
			}
		}

		LoginPacket.method5710(); // L: 2755
		class317.method6014(30); // L: 2756

		for (var0 = 0; var0 < 100; ++var0) { // L: 2757
			Client.field536[var0] = true;
		}

		Message.method1217(); // L: 2758
	} // L: 2759
}
