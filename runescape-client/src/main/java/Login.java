import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
@Implements("Login")
public class Login {
	@ObfuscatedName("aw")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -391415083
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	static IndexedSprite[] field942;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	static IndexedSprite field964;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	static IndexedSprite field944;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lvd;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 233350583
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 447660439
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 184651103
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("av")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1159528191
	)
	static int field952;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -55208961
	)
	static int field977;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -944531309
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("ch")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("co")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("cd")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("cg")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("cn")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("cz")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 2098794601
	)
	static int field961;
	@ObfuscatedName("cm")
	static String[] field962;
	@ObfuscatedName("ce")
	static String field963;
	@ObfuscatedName("cc")
	static boolean field979;
	@ObfuscatedName("cb")
	static boolean field965;
	@ObfuscatedName("cr")
	static boolean field966;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 533840019
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("dl")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -580995681
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -1532341797
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = 158374319
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		longValue = 4637828618921795853L
	)
	static long field974;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		longValue = 644186663484815623L
	)
	static long field975;
	@ObfuscatedName("dz")
	static String[] field949;
	@ObfuscatedName("dp")
	static String[] field945;
	@ObfuscatedName("de")
	static String[] field946;

	static {
		xPadding = 0; // L: 59
		loginBoxX = xPadding + 202;
		Login_loadingPercent = 10;
		Login_loadingText = "";
		field952 = -1; // L: 102
		field977 = 1; // L: 105
		loginIndex = 0; // L: 109
		Login_response0 = ""; // L: 110
		Login_response1 = ""; // L: 111
		Login_response2 = ""; // L: 112
		Login_response3 = ""; // L: 113
		Login_username = ""; // L: 114
		Login_password = ""; // L: 115
		field961 = 0; // L: 117
		field962 = new String[8]; // L: 118
		field963 = ""; // L: 123
		field979 = false; // L: 130
		field965 = false; // L: 131
		field966 = true; // L: 134
		currentLoginField = 0; // L: 135
		worldSelectOpen = false; // L: 139
		hoveredWorldIndex = -1; // L: 147
		worldSelectPage = 0; // L: 148
		worldSelectPagesCount = 0; // L: 149
		new DecimalFormat("##0.00"); // L: 152
		new class136();
		field974 = -1L; // L: 160
		field975 = -1L; // L: 161
		field949 = new String[]{"title.jpg"}; // L: 164
		field945 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"}; // L: 167
		field946 = new String[]{"logo_speedrunning"}; // L: 170
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lof;I)V",
		garbageValue = "-276917317"
	)
	public static void method2192(AbstractArchive var0) {
		VarpDefinition.VarpDefinition_archive = var0; // L: 18
		VarpDefinition.field1855 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16); // L: 19
	} // L: 20

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1394204204"
	)
	public static int method2197(int var0, int var1, int var2) {
		var2 &= 3; // L: 9
		if (var2 == 0) { // L: 10
			return var0;
		} else if (var2 == 1) { // L: 11
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1; // L: 12 13
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "2"
	)
	static final void method2200(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) { // L: 76
			for (int var5 = var0; var5 <= var0 + var2; ++var5) { // L: 77
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) { // L: 78
					class151.field1708[0][var5][var4] = 127; // L: 79
					if (var0 == var5 && var5 > 0) { // L: 80
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var5 == var0 + var2 && var5 < 103) { // L: 81
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) { // L: 82
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var4 == var3 + var1 && var4 < 103) { // L: 83
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	} // L: 87

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lpb;Lpb;Lpb;I)V",
		garbageValue = "1368542470"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		xPadding = (GameEngine.canvasWidth - 765) / 2; // L: 1284
		loginBoxX = xPadding + 202; // L: 1285
		loginBoxCenter = loginBoxX + 180; // L: 1286
		byte var3;
		int var4;
		int var7;
		int var9;
		int var25;
		int var30;
		int var38;
		if (worldSelectOpen) { // L: 1287
			if (Timer.worldSelectBackSprites == null) { // L: 1289
				Timer.worldSelectBackSprites = StructComposition.method3877(class311.field3274, "sl_back", "");
			}

			if (class162.worldSelectFlagSprites == null) { // L: 1290
				class162.worldSelectFlagSprites = FloorOverlayDefinition.method4031(class311.field3274, "sl_flags", "");
			}

			if (World.worldSelectArrows == null) { // L: 1291
				World.worldSelectArrows = FloorOverlayDefinition.method4031(class311.field3274, "sl_arrows", "");
			}

			if (Frames.worldSelectStars == null) { // L: 1292
				Frames.worldSelectStars = FloorOverlayDefinition.method4031(class311.field3274, "sl_stars", "");
			}

			if (WorldMapSectionType.worldSelectLeftSprite == null) { // L: 1293
				WorldMapSectionType.worldSelectLeftSprite = class173.SpriteBuffer_getIndexedSpriteByName(class311.field3274, "leftarrow", "");
			}

			if (class516.worldSelectRightSprite == null) { // L: 1294
				class516.worldSelectRightSprite = class173.SpriteBuffer_getIndexedSpriteByName(class311.field3274, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(xPadding, 23, 765, 480, 0); // L: 1295
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(xPadding, 0, 125, 23, 12425273, 9135624); // L: 1296
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(xPadding + 125, 0, 640, 23, 5197647, 2697513); // L: 1297
			var0.drawCentered("Select a world", xPadding + 62, 15, 0, -1); // L: 1298
			if (Frames.worldSelectStars != null) { // L: 1299
				Frames.worldSelectStars[1].drawAt(xPadding + 140, 1); // L: 1300
				var1.draw("Members only world", xPadding + 152, 10, 16777215, -1); // L: 1301
				Frames.worldSelectStars[0].drawAt(xPadding + 140, 12); // L: 1302
				var1.draw("Free world", xPadding + 152, 21, 16777215, -1); // L: 1303
			}

			if (World.worldSelectArrows != null) { // L: 1305
				var30 = xPadding + 280; // L: 1306
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) { // L: 1307
					World.worldSelectArrows[2].drawAt(var30, 4);
				} else {
					World.worldSelectArrows[0].drawAt(var30, 4); // L: 1308
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) { // L: 1309
					World.worldSelectArrows[3].drawAt(var30 + 15, 4);
				} else {
					World.worldSelectArrows[1].drawAt(var30 + 15, 4); // L: 1310
				}

				var0.draw("World", var30 + 32, 17, 16777215, -1); // L: 1311
				var4 = xPadding + 390; // L: 1312
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) { // L: 1313
					World.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					World.worldSelectArrows[0].drawAt(var4, 4); // L: 1314
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) { // L: 1315
					World.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					World.worldSelectArrows[1].drawAt(var4 + 15, 4); // L: 1316
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1); // L: 1317
				var38 = xPadding + 500; // L: 1318
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) { // L: 1319
					World.worldSelectArrows[2].drawAt(var38, 4);
				} else {
					World.worldSelectArrows[0].drawAt(var38, 4); // L: 1320
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) { // L: 1321
					World.worldSelectArrows[3].drawAt(var38 + 15, 4);
				} else {
					World.worldSelectArrows[1].drawAt(var38 + 15, 4); // L: 1322
				}

				var0.draw("Location", var38 + 32, 17, 16777215, -1); // L: 1323
				var25 = xPadding + 610; // L: 1324
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) { // L: 1325
					World.worldSelectArrows[2].drawAt(var25, 4);
				} else {
					World.worldSelectArrows[0].drawAt(var25, 4); // L: 1326
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) { // L: 1327
					World.worldSelectArrows[3].drawAt(var25 + 15, 4);
				} else {
					World.worldSelectArrows[1].drawAt(var25 + 15, 4); // L: 1328
				}

				var0.draw("Type", var25 + 32, 17, 16777215, -1); // L: 1329
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(xPadding + 708, 4, 50, 16, 0); // L: 1331
			var1.drawCentered("Cancel", xPadding + 708 + 25, 16, 16777215, -1); // L: 1332
			hoveredWorldIndex = -1; // L: 1333
			if (Timer.worldSelectBackSprites != null) { // L: 1334
				var3 = 88; // L: 1335
				byte var36 = 19; // L: 1336
				var38 = 765 / (var3 + 1) - 1; // L: 1337
				var25 = 480 / (var36 + 1); // L: 1338

				int var33;
				do {
					var7 = var25; // L: 1340
					var33 = var38; // L: 1341
					if (var25 * (var38 - 1) >= World.World_count) { // L: 1342
						--var38;
					}

					if (var38 * (var25 - 1) >= World.World_count) { // L: 1343
						--var25;
					}

					if (var38 * (var25 - 1) >= World.World_count) { // L: 1344
						--var25;
					}
				} while(var7 != var25 || var33 != var38); // L: 1345

				var7 = (765 - var3 * var38) / (var38 + 1); // L: 1347
				if (var7 > 5) { // L: 1348
					var7 = 5;
				}

				var33 = (480 - var36 * var25) / (var25 + 1); // L: 1349
				if (var33 > 5) { // L: 1350
					var33 = 5;
				}

				var9 = (765 - var3 * var38 - var7 * (var38 - 1)) / 2; // L: 1351
				int var35 = (480 - var25 * var36 - var33 * (var25 - 1)) / 2; // L: 1352
				int var11 = (var25 + World.World_count - 1) / var25; // L: 1353
				worldSelectPagesCount = var11 - var38; // L: 1354
				if (WorldMapSectionType.worldSelectLeftSprite != null && worldSelectPage > 0) { // L: 1355
					WorldMapSectionType.worldSelectLeftSprite.drawAt(8, WorldMapArea.canvasHeight / 2 - WorldMapSectionType.worldSelectLeftSprite.subHeight / 2); // L: 1356
				}

				if (class516.worldSelectRightSprite != null && worldSelectPage < worldSelectPagesCount) { // L: 1358
					class516.worldSelectRightSprite.drawAt(GameEngine.canvasWidth - class516.worldSelectRightSprite.subWidth - 8, WorldMapArea.canvasHeight / 2 - class516.worldSelectRightSprite.subHeight / 2); // L: 1359
				}

				int var12 = var35 + 23; // L: 1361
				int var13 = var9 + xPadding; // L: 1362
				int var14 = 0; // L: 1363
				boolean var15 = false; // L: 1364
				int var16 = worldSelectPage; // L: 1365

				int var17;
				for (var17 = var25 * var16; var17 < World.World_count && var16 - worldSelectPage < var38; ++var17) { // L: 1366 1367
					World var18 = WorldMapID.World_worlds[var17]; // L: 1370
					boolean var19 = true; // L: 1371
					String var20 = Integer.toString(var18.population); // L: 1372
					if (var18.population == -1) { // L: 1373
						var20 = "OFF"; // L: 1374
						var19 = false; // L: 1375
					} else if (var18.population > 1980) { // L: 1377
						var20 = "FULL"; // L: 1378
						var19 = false; // L: 1379
					}

					class109 var21 = null; // L: 1381
					int var22 = 0; // L: 1382
					if (var18.isBeta()) { // L: 1383
						var21 = var18.isMembersOnly() ? class109.field1404 : class109.field1397; // L: 1384
					} else if (var18.isDeadman()) { // L: 1386
						var21 = var18.isMembersOnly() ? class109.field1406 : class109.field1405; // L: 1387
					} else if (var18.method1829()) { // L: 1389
						var22 = 16711680; // L: 1390
						var21 = var18.isMembersOnly() ? class109.field1396 : class109.field1395; // L: 1391
					} else if (var18.method1819()) { // L: 1393
						var21 = var18.isMembersOnly() ? class109.field1401 : class109.field1399; // L: 1394
					} else if (var18.isPvp()) { // L: 1396
						var21 = var18.isMembersOnly() ? class109.field1394 : class109.field1393; // L: 1397
					} else if (var18.method1820()) { // L: 1399
						var21 = var18.isMembersOnly() ? class109.field1400 : class109.field1402; // L: 1400
					} else if (var18.method1838()) { // L: 1402
						var21 = var18.isMembersOnly() ? class109.field1398 : class109.field1403; // L: 1403
					}

					if (var21 == null || var21.field1407 >= Timer.worldSelectBackSprites.length) { // L: 1405
						var21 = var18.isMembersOnly() ? class109.field1392 : class109.field1391; // L: 1406
					}

					if (MouseHandler.MouseHandler_x >= var13 && MouseHandler.MouseHandler_y >= var12 && MouseHandler.MouseHandler_x < var13 + var3 && MouseHandler.MouseHandler_y < var36 + var12 && var19) { // L: 1408
						hoveredWorldIndex = var17; // L: 1409
						Timer.worldSelectBackSprites[var21.field1407].drawTransOverlayAt(var13, var12, 128, 16777215); // L: 1410
						var15 = true; // L: 1411
					} else {
						Timer.worldSelectBackSprites[var21.field1407].drawAt(var13, var12); // L: 1413
					}

					if (class162.worldSelectFlagSprites != null) { // L: 1414
						class162.worldSelectFlagSprites[(var18.isMembersOnly() ? 8 : 0) + var18.location].drawAt(var13 + 29, var12);
					}

					var0.drawCentered(Integer.toString(var18.id), var13 + 15, var36 / 2 + var12 + 5, var22, -1); // L: 1415
					var1.drawCentered(var20, var13 + 60, var36 / 2 + var12 + 5, 268435455, -1); // L: 1416
					var12 = var12 + var33 + var36; // L: 1417
					++var14; // L: 1418
					if (var14 >= var25) {
						var12 = var35 + 23; // L: 1419
						var13 = var13 + var7 + var3; // L: 1420
						var14 = 0; // L: 1421
						++var16; // L: 1422
					}
				}

				if (var15) { // L: 1425
					var17 = var1.stringWidth(WorldMapID.World_worlds[hoveredWorldIndex].activity) + 6; // L: 1426
					int var28 = var1.ascent + 8; // L: 1427
					int var37 = MouseHandler.MouseHandler_y + 25; // L: 1428
					if (var37 + var28 > 480) { // L: 1429
						var37 = MouseHandler.MouseHandler_y - 25 - var28; // L: 1430
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var17 / 2, var37, var17, var28, 16777120); // L: 1432
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var17 / 2, var37, var17, var28, 0); // L: 1433
					var1.drawCentered(WorldMapID.World_worlds[hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var37 + var1.ascent + 4, 0, -1); // L: 1434
				}
			}

		} else {
			leftTitleSprite.drawAt(xPadding, 0); // L: 1440
			WorldMapLabelSize.rightTitleSprite.drawAt(xPadding + 382, 0); // L: 1441
			logoSprite.drawAt(xPadding + 382 - logoSprite.subWidth / 2, 18); // L: 1442
			if (Client.gameState == 0 || Client.gameState == 5) { // L: 1443
				var3 = 20; // L: 1444
				var0.drawCentered("RuneScape is loading - please wait...", loginBoxX + 180, 245 - var3, 16777215, -1); // L: 1445
				var4 = 253 - var3; // L: 1446
				Rasterizer2D.Rasterizer2D_drawRectangle(loginBoxX + 180 - 152, var4, 304, 34, 9179409); // L: 1447
				Rasterizer2D.Rasterizer2D_drawRectangle(loginBoxX + 180 - 151, var4 + 1, 302, 32, 0); // L: 1448
				Rasterizer2D.Rasterizer2D_fillRectangle(loginBoxX + 180 - 150, var4 + 2, Login_loadingPercent * 3, 30, 9179409); // L: 1449
				Rasterizer2D.Rasterizer2D_fillRectangle(Login_loadingPercent * 3 + (loginBoxX + 180 - 150), var4 + 2, 300 - Login_loadingPercent * 3, 30, 0); // L: 1450
				var0.drawCentered(Login_loadingText, loginBoxX + 180, 276 - var3, 16777215, -1); // L: 1451
			}

			String var5;
			String var6;
			short var29;
			short var31;
			if (Client.gameState == 20) { // L: 1453
				class155.titleboxSprite.drawAt(loginBoxX + 180 - class155.titleboxSprite.subWidth / 2, 271 - class155.titleboxSprite.subHeight / 2); // L: 1454
				var29 = 201; // L: 1455
				var0.drawCentered(Login_response1, loginBoxX + 180, var29, 16776960, 0); // L: 1456
				var30 = var29 + 15; // L: 1457
				var0.drawCentered(Login_response2, loginBoxX + 180, var30, 16776960, 0); // L: 1458
				var30 += 15; // L: 1459
				var0.drawCentered(Login_response3, loginBoxX + 180, var30, 16776960, 0); // L: 1460
				var30 += 15; // L: 1461
				var30 += 7; // L: 1462
				if (loginIndex != 4 && loginIndex != 10) { // L: 1463
					var0.draw("Login: ", loginBoxX + 180 - 110, var30, 16777215, 0); // L: 1464
					var31 = 200; // L: 1465

					for (var5 = class207.method4107(); var0.stringWidth(var5) > var31; var5 = var5.substring(0, var5.length() - 1)) { // L: 1466 1467 1468
					}

					var0.draw(AbstractFont.escapeBrackets(var5), loginBoxX + 180 - 70, var30, 16777215, 0); // L: 1470
					var30 += 15; // L: 1471

					for (var6 = class368.method7012(Login_password); var0.stringWidth(var6) > var31; var6 = var6.substring(1)) { // L: 1472 1473 1474
					}

					var0.draw("Password: " + var6, loginBoxX + 180 - 108, var30, 16777215, 0); // L: 1476
					var30 += 15; // L: 1477
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) { // L: 1480
				class155.titleboxSprite.drawAt(loginBoxX, 171); // L: 1481
				short var23;
				if (loginIndex == 0) { // L: 1482
					var29 = 251; // L: 1483
					var0.drawCentered("Welcome to RuneScape", loginBoxX + 180, var29, 16776960, 0); // L: 1484
					var30 = var29 + 30; // L: 1485
					var4 = loginBoxX + 180 - 80; // L: 1486
					var23 = 291; // L: 1487
					field964.drawAt(var4 - 73, var23 - 20); // L: 1488
					var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1489
					var4 = loginBoxX + 180 + 80;
					field964.drawAt(var4 - 73, var23 - 20);
					var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (loginIndex == 1) { // L: 1494
					var0.drawCentered(Login_response0, loginBoxX + 180, 201, 16776960, 0); // L: 1495
					var29 = 236; // L: 1496
					var0.drawCentered(Login_response1, loginBoxX + 180, var29, 16777215, 0); // L: 1497
					var30 = var29 + 15; // L: 1498
					var0.drawCentered(Login_response2, loginBoxX + 180, var30, 16777215, 0); // L: 1499
					var30 += 15; // L: 1500
					var0.drawCentered(Login_response3, loginBoxX + 180, var30, 16777215, 0); // L: 1501
					var30 += 15; // L: 1502
					var4 = loginBoxX + 180 - 80; // L: 1503
					var23 = 321; // L: 1504
					field964.drawAt(var4 - 73, var23 - 20); // L: 1505
					var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0); // L: 1506
					var4 = loginBoxX + 180 + 80; // L: 1507
					field964.drawAt(var4 - 73, var23 - 20); // L: 1508
					var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0); // L: 1509
				} else if (loginIndex == 2) { // L: 1511
					var29 = 201; // L: 1512
					var0.drawCentered(Login_response1, loginBoxCenter, var29, 16776960, 0); // L: 1513
					var30 = var29 + 15; // L: 1514
					var0.drawCentered(Login_response2, loginBoxCenter, var30, 16776960, 0); // L: 1515
					var30 += 15; // L: 1516
					var0.drawCentered(Login_response3, loginBoxCenter, var30, 16776960, 0); // L: 1517
					var30 += 15; // L: 1518
					var30 += 7; // L: 1519
					var0.draw("Login: ", loginBoxCenter - 110, var30, 16777215, 0); // L: 1520
					var31 = 200; // L: 1521

					for (var5 = class207.method4107(); var0.stringWidth(var5) > var31; var5 = var5.substring(1)) { // L: 1522 1523 1524
					}

					var0.draw(AbstractFont.escapeBrackets(var5) + (currentLoginField == 0 & Client.cycle % 40 < 20 ? class370.colorStartTag(16776960) + "|" : ""), loginBoxCenter - 70, var30, 16777215, 0); // L: 1526
					var30 += 15; // L: 1527

					for (var6 = class368.method7012(Login_password); var0.stringWidth(var6) > var31; var6 = var6.substring(1)) { // L: 1528 1529 1530
					}

					var0.draw("Password: " + var6 + (currentLoginField == 1 & Client.cycle % 40 < 20 ? class370.colorStartTag(16776960) + "|" : ""), loginBoxCenter - 108, var30, 16777215, 0); // L: 1532
					var30 += 15; // L: 1533
					var29 = 277; // L: 1534
					var7 = loginBoxCenter + -117; // L: 1535
					IndexedSprite var26 = Players.method2785(Client.Login_isUsernameRemembered, field979); // L: 1536
					var26.drawAt(var7, var29); // L: 1537
					var7 = var7 + var26.subWidth + 5; // L: 1538
					var1.draw("Remember username", var7, var29 + 13, 16776960, 0); // L: 1539
					var7 = loginBoxCenter + 24; // L: 1540
					var26 = Players.method2785(class30.clientPreferences.method2533(), field965); // L: 1541
					var26.drawAt(var7, var29); // L: 1542
					var7 = var7 + var26.subWidth + 5; // L: 1543
					var1.draw("Hide username", var7, var29 + 13, 16776960, 0); // L: 1544
					var30 = var29 + 15; // L: 1545
					var9 = loginBoxCenter - 80; // L: 1546
					short var10 = 321; // L: 1547
					field964.drawAt(var9 - 73, var10 - 20); // L: 1548
					var0.drawCentered("Login", var9, var10 + 5, 16777215, 0); // L: 1549
					var9 = loginBoxCenter + 80; // L: 1550
					field964.drawAt(var9 - 73, var10 - 20); // L: 1551
					var0.drawCentered("Cancel", var9, var10 + 5, 16777215, 0); // L: 1552
					var29 = 357; // L: 1553
					switch(field977) { // L: 1554
					case 2:
						GameEngine.field217 = "Having trouble logging in?"; // L: 1559
						break;
					default:
						GameEngine.field217 = "Can't login? Click here."; // L: 1556
					}

					class9.field35 = new Bounds(loginBoxCenter, var29, var1.stringWidth(GameEngine.field217), 11); // L: 1562
					SpriteMask.field3613 = new Bounds(loginBoxCenter, var29, var1.stringWidth("Still having trouble logging in?"), 11); // L: 1563
					var1.drawCentered(GameEngine.field217, loginBoxCenter, var29, 16777215, 0); // L: 1564
				} else if (loginIndex == 3) { // L: 1566
					var29 = 201; // L: 1567
					var0.drawCentered("Incorrect username or password.", loginBoxX + 180, var29, 16776960, 0); // L: 1568
					var30 = var29 + 20; // L: 1569
					var1.drawCentered("If you have upgraded to a Jagex Account, you", loginBoxX + 180, var30, 16776960, 0); // L: 1570
					var30 += 20; // L: 1571
					var1.drawCentered("need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", loginBoxX + 180, var30, 16776960, 0); // L: 1572
					var30 += 15; // L: 1573
					var4 = loginBoxX + 180; // L: 1574
					var23 = 276; // L: 1575
					field964.drawAt(var4 - 73, var23 - 20); // L: 1576
					var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0); // L: 1577
					var4 = loginBoxX + 180; // L: 1578
					var23 = 326; // L: 1579
					field964.drawAt(var4 - 73, var23 - 20); // L: 1580
					var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0); // L: 1581
				} else {
					short var8;
					if (loginIndex == 4) { // L: 1583
						var0.drawCentered("Authenticator", loginBoxX + 180, 201, 16776960, 0); // L: 1584
						var29 = 236; // L: 1585
						var0.drawCentered(Login_response1, loginBoxX + 180, var29, 16777215, 0); // L: 1586
						var30 = var29 + 15; // L: 1587
						var0.drawCentered(Login_response2, loginBoxX + 180, var30, 16777215, 0); // L: 1588
						var30 += 15; // L: 1589
						var0.drawCentered(Login_response3, loginBoxX + 180, var30, 16777215, 0); // L: 1590
						var30 += 15; // L: 1591
						var0.draw("PIN: " + class368.method7012(MenuAction.otp) + (Client.cycle % 40 < 20 ? class370.colorStartTag(16776960) + "|" : ""), loginBoxX + 180 - 108, var30, 16777215, 0); // L: 1592
						var30 -= 8; // L: 1593
						var0.draw("Trust this computer", loginBoxX + 180 - 9, var30, 16776960, 0); // L: 1594
						var30 += 15; // L: 1595
						var0.draw("for 30 days: ", loginBoxX + 180 - 9, var30, 16776960, 0); // L: 1596
						var4 = 180 + loginBoxX - 9 + var0.stringWidth("for 30 days: ") + 15; // L: 1597
						var38 = var30 - var0.ascent; // L: 1598
						IndexedSprite var32;
						if (field966) { // L: 1600
							var32 = class472.field4868; // L: 1601
						} else {
							var32 = class128.field1508; // L: 1604
						}

						var32.drawAt(var4, var38); // L: 1606
						var30 += 15; // L: 1607
						var7 = loginBoxX + 180 - 80; // L: 1608
						var8 = 321; // L: 1609
						field964.drawAt(var7 - 73, var8 - 20); // L: 1610
						var0.drawCentered("Continue", var7, var8 + 5, 16777215, 0); // L: 1611
						var7 = loginBoxX + 180 + 80; // L: 1612
						field964.drawAt(var7 - 73, var8 - 20); // L: 1613
						var0.drawCentered("Cancel", var7, var8 + 5, 16777215, 0); // L: 1614
						var1.drawCentered("Can't login? Click here.", loginBoxX + 180, var8 + 36, 16777215, 0); // L: 1615
					} else if (loginIndex == 5) { // L: 1617
						var0.drawCentered("Forgotten your password?", loginBoxX + 180, 201, 16776960, 0); // L: 1618
						var29 = 221; // L: 1619
						var2.drawCentered(Login_response1, loginBoxX + 180, var29, 16776960, 0); // L: 1620
						var30 = var29 + 15; // L: 1621
						var2.drawCentered(Login_response2, loginBoxX + 180, var30, 16776960, 0); // L: 1622
						var30 += 15; // L: 1623
						var2.drawCentered(Login_response3, loginBoxX + 180, var30, 16776960, 0); // L: 1624
						var30 += 15; // L: 1625
						var30 += 14; // L: 1626
						var0.draw("Username/email: ", loginBoxX + 180 - 145, var30, 16777215, 0); // L: 1627
						var31 = 174; // L: 1628

						for (var5 = class207.method4107(); var0.stringWidth(var5) > var31; var5 = var5.substring(1)) { // L: 1629 1630 1631
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? class370.colorStartTag(16776960) + "|" : ""), loginBoxX + 180 - 34, var30, 16777215, 0); // L: 1633
						var30 += 15; // L: 1634
						var25 = loginBoxX + 180 - 80; // L: 1635
						short var34 = 321; // L: 1636
						field964.drawAt(var25 - 73, var34 - 20); // L: 1637
						var0.drawCentered("Recover", var25, var34 + 5, 16777215, 0); // L: 1638
						var25 = loginBoxX + 180 + 80; // L: 1639
						field964.drawAt(var25 - 73, var34 - 20); // L: 1640
						var0.drawCentered("Back", var25, var34 + 5, 16777215, 0); // L: 1641
						var34 = 356; // L: 1642
						var1.drawCentered("Still having trouble logging in?", loginBoxCenter, var34, 268435455, 0); // L: 1643
					} else if (loginIndex == 6) { // L: 1645
						var29 = 201; // L: 1646
						var0.drawCentered(Login_response1, loginBoxX + 180, var29, 16776960, 0); // L: 1647
						var30 = var29 + 15; // L: 1648
						var0.drawCentered(Login_response2, loginBoxX + 180, var30, 16776960, 0); // L: 1649
						var30 += 15; // L: 1650
						var0.drawCentered(Login_response3, loginBoxX + 180, var30, 16776960, 0); // L: 1651
						var30 += 15; // L: 1652
						var4 = loginBoxX + 180; // L: 1653
						var23 = 321; // L: 1654
						field964.drawAt(var4 - 73, var23 - 20); // L: 1655
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1656
					} else if (loginIndex == 7) { // L: 1658
						if (GameObject.field3131 && !Client.onMobile) { // L: 1659
							var29 = 201; // L: 1660
							var0.drawCentered(Login_response1, loginBoxCenter, var29, 16776960, 0); // L: 1661
							var30 = var29 + 15; // L: 1662
							var0.drawCentered(Login_response2, loginBoxCenter, var30, 16776960, 0); // L: 1663
							var30 += 15; // L: 1664
							var0.drawCentered(Login_response3, loginBoxCenter, var30, 16776960, 0); // L: 1665
							var4 = loginBoxCenter - 150; // L: 1666
							var30 += 10; // L: 1667

							for (var38 = 0; var38 < 8; ++var38) { // L: 1668
								field964.method9884(var4, var30, 30, 40); // L: 1669
								boolean var39 = var38 == field961 & Client.cycle % 40 < 20; // L: 1670
								var0.draw((field962[var38] == null ? "" : field962[var38]) + (var39 ? class370.colorStartTag(16776960) + "|" : ""), var4 + 10, var30 + 27, 16777215, 0); // L: 1671
								if (var38 != 1 && var38 != 3) { // L: 1672
									var4 += 35; // L: 1677
								} else {
									var4 += 50; // L: 1673
									var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var30 + 27, 16777215, 0); // L: 1674
								}
							}

							var38 = loginBoxCenter - 80; // L: 1680
							short var40 = 321; // L: 1681
							field964.drawAt(var38 - 73, var40 - 20); // L: 1682
							var0.drawCentered("Submit", var38, var40 + 5, 16777215, 0); // L: 1683
							var38 = loginBoxCenter + 80; // L: 1684
							field964.drawAt(var38 - 73, var40 - 20); // L: 1685
							var0.drawCentered("Cancel", var38, var40 + 5, 16777215, 0); // L: 1686
						} else {
							var29 = 216; // L: 1689
							var0.drawCentered("Your date of birth isn't set.", loginBoxX + 180, var29, 16776960, 0); // L: 1690
							var30 = var29 + 15; // L: 1691
							var2.drawCentered("Please verify your account status by", loginBoxX + 180, var30, 16776960, 0); // L: 1692
							var30 += 15; // L: 1693
							var2.drawCentered("setting your date of birth.", loginBoxX + 180, var30, 16776960, 0); // L: 1694
							var30 += 15; // L: 1695
							var4 = loginBoxX + 180 - 80; // L: 1696
							var23 = 321; // L: 1697
							field964.drawAt(var4 - 73, var23 - 20); // L: 1698
							var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0); // L: 1699
							var4 = loginBoxX + 180 + 80; // L: 1700
							field964.drawAt(var4 - 73, var23 - 20); // L: 1701
							var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1702
						}
					} else if (loginIndex == 8) { // L: 1705
						var29 = 216; // L: 1706
						var0.drawCentered("Sorry, but your account is not eligible to play.", loginBoxX + 180, var29, 16776960, 0); // L: 1707
						var30 = var29 + 15; // L: 1708
						var2.drawCentered("For more information, please take a look at", loginBoxX + 180, var30, 16776960, 0); // L: 1709
						var30 += 15; // L: 1710
						var2.drawCentered("our privacy policy.", loginBoxX + 180, var30, 16776960, 0); // L: 1711
						var30 += 15; // L: 1712
						var4 = loginBoxX + 180 - 80; // L: 1713
						var23 = 321; // L: 1714
						field964.drawAt(var4 - 73, var23 - 20); // L: 1715
						var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0); // L: 1716
						var4 = loginBoxX + 180 + 80; // L: 1717
						field964.drawAt(var4 - 73, var23 - 20); // L: 1718
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1719
					} else if (loginIndex == 9) { // L: 1721
						var29 = 221; // L: 1722
						var0.drawCentered(Login_response1, loginBoxX + 180, var29, 16776960, 0); // L: 1723
						var30 = var29 + 25; // L: 1724
						var0.drawCentered(Login_response2, loginBoxX + 180, var30, 16776960, 0); // L: 1725
						var30 += 25; // L: 1726
						var0.drawCentered(Login_response3, loginBoxX + 180, var30, 16776960, 0); // L: 1727
						var4 = loginBoxX + 180; // L: 1728
						var23 = 311; // L: 1729
						field964.drawAt(var4 - 73, var23 - 20); // L: 1730
						var0.drawCentered("Try again", var4, var23 + 5, 16777215, 0); // L: 1731
					} else if (loginIndex == 10) { // L: 1733
						var30 = loginBoxX + 180; // L: 1734
						var31 = 209; // L: 1735
						var0.drawCentered("Welcome to RuneScape", loginBoxX + 180, var31, 16776960, 0); // L: 1736
						var4 = var31 + 20; // L: 1737
						field944.drawAt(var30 - 109, var4); // L: 1738
						if (field963.isEmpty()) { // L: 1739
							class90.field1121.drawAt(var30 - 48, var4 + 18); // L: 1740
						} else {
							class90.field1121.drawAt(var30 - 48, var4 + 5); // L: 1743
							var0.drawCentered(field963, var30, var4 + 68 - 15, 16776960, 0); // L: 1744
						}
					} else if (loginIndex == 12) { // L: 1747
						var30 = loginBoxCenter; // L: 1748
						var31 = 216; // L: 1749
						var2.drawCentered("Before using this app, please read and accept our", var30, var31, 16777215, 0); // L: 1750
						var4 = var31 + 17; // L: 1751
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var30, var4, 16777215, 0); // L: 1752
						var4 += 17; // L: 1753
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var30, var4, 16777215, 0); // L: 1754
						var4 += 17; // L: 1755
						var2.drawCentered("By accepting, you agree to these documents.", var30, var4, 16777215, 0); // L: 1756
						var30 = loginBoxCenter - 80; // L: 1757
						var31 = 311; // L: 1758
						field964.drawAt(var30 - 73, var31 - 20); // L: 1759
						var0.drawCentered("Accept", var30, var31 + 5, 16777215, 0); // L: 1760
						var30 = loginBoxCenter + 80; // L: 1761
						field964.drawAt(var30 - 73, var31 - 20); // L: 1762
						var0.drawCentered("Decline", var30, var31 + 5, 16777215, 0); // L: 1763
					} else if (loginIndex == 13) { // L: 1765
						var29 = 231; // L: 1766
						var2.drawCentered("You must accept our terms of use, privacy policy,", loginBoxX + 180, var29, 16777215, 0); // L: 1767
						var30 = var29 + 20; // L: 1768
						var2.drawCentered("and end user licence agreement to continue.", loginBoxX + 180, var30, 16777215, 0); // L: 1769
						var4 = loginBoxX + 180; // L: 1770
						var29 = 311; // L: 1771
						field964.drawAt(var4 - 73, var29 - 20); // L: 1772
						var0.drawCentered("Back", var4, var29 + 5, 16777215, 0); // L: 1773
					} else if (loginIndex == 14) { // L: 1775
						var29 = 201; // L: 1776
						String var24 = ""; // L: 1777
						var5 = ""; // L: 1778
						var6 = ""; // L: 1779
						switch(field952) { // L: 1780
						case 0:
							var24 = "Your account has been involved"; // L: 1783
							var5 = "in serious rule breaking."; // L: 1784
							var6 = ""; // L: 1785
							break;
						case 1:
							var24 = "Your account has been locked due to"; // L: 1790
							var5 = "suspicious activity."; // L: 1791
							var6 = "Please recover your account."; // L: 1792
							break; // L: 1793
						case 2:
							var24 = "The unpaid balance on your account needs"; // L: 1797
							var5 = "to be resolved before you can play."; // L: 1798
							var6 = class369.field4010; // L: 1799
							break; // L: 1800
						default:
							class148.Login_promptCredentials(false); // L: 1804
						}

						var0.drawCentered(var24, loginBoxX + 180, var29, 16776960, 0); // L: 1808
						var30 = var29 + 20; // L: 1809
						var0.drawCentered(var5, loginBoxX + 180, var30, 16776960, 0); // L: 1810
						var30 += 20; // L: 1811
						var0.drawCentered(var6, loginBoxX + 180, var30, 16776960, 0); // L: 1812
						var7 = loginBoxX + 180; // L: 1813
						var8 = 276; // L: 1814
						field964.drawAt(var7 - 73, var8 - 20); // L: 1815
						if (field952 == 1) { // L: 1816
							var0.drawCentered("Recover Account", var7, var8 + 5, 16777215, 0); // L: 1817
						} else {
							var0.drawCentered("View Appeal Options", var7, var8 + 5, 16777215, 0); // L: 1820
						}

						var7 = loginBoxX + 180; // L: 1822
						var8 = 326; // L: 1823
						field964.drawAt(var7 - 73, var8 - 20); // L: 1824
						var0.drawCentered("Back", var7, var8 + 5, 16777215, 0); // L: 1825
					} else if (loginIndex == 24) { // L: 1827
						var29 = 221; // L: 1828
						var0.drawCentered(Login_response1, loginBoxX + 180, var29, 16777215, 0); // L: 1829
						var30 = var29 + 15; // L: 1830
						var0.drawCentered(Login_response2, loginBoxX + 180, var30, 16777215, 0); // L: 1831
						var30 += 15; // L: 1832
						var0.drawCentered(Login_response3, loginBoxX + 180, var30, 16777215, 0); // L: 1833
						var30 += 15; // L: 1834
						var4 = loginBoxX + 180; // L: 1835
						var23 = 301; // L: 1836
						field964.drawAt(var4 - 73, var23 - 20); // L: 1837
						var0.drawCentered("Ok", var4, var23 + 5, 16777215, 0); // L: 1838
					} else if (loginIndex == 32) { // L: 1840
						var29 = 216; // L: 1841
						var0.drawCentered("Your date of birth isn't set.", loginBoxX + 180, var29, 16776960, 0); // L: 1842
						var30 = var29 + 15; // L: 1843
						var2.drawCentered("Please verify your account status by", loginBoxX + 180, var30, 16776960, 0); // L: 1844
						var30 += 15; // L: 1845
						var2.drawCentered("setting your date of birth.", loginBoxX + 180, var30, 16776960, 0); // L: 1846
						var30 += 15; // L: 1847
						var4 = loginBoxX + 180 - 80; // L: 1848
						var23 = 321; // L: 1849
						field964.drawAt(var4 - 73, var23 - 20); // L: 1850
						var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0); // L: 1851
						var4 = loginBoxX + 180 + 80; // L: 1852
						field964.drawAt(var4 - 73, var23 - 20); // L: 1853
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1854
					} else if (loginIndex == 33) { // L: 1856
						var29 = 201; // L: 1857
						var0.drawCentered(Login_response1, loginBoxX + 180, var29, 16776960, 0); // L: 1858
						var30 = var29 + 20; // L: 1859
						var1.drawCentered(Login_response2, loginBoxX + 180, var30, 16776960, 0); // L: 1860
						var30 += 20; // L: 1861
						var1.drawCentered(Login_response3, loginBoxX + 180, var30, 16776960, 0); // L: 1862
						var30 += 15; // L: 1863
						var4 = loginBoxX + 180; // L: 1864
						var23 = 276; // L: 1865
						field964.drawAt(var4 - 73, var23 - 20); // L: 1866
						var2.drawCentered("Download Launcher", var4, var23 + 5, 16777215, 0); // L: 1867
						var4 = loginBoxX + 180; // L: 1868
						var23 = 326; // L: 1869
						field964.drawAt(var4 - 73, var23 - 20); // L: 1870
						var2.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1871
					}
				}
			}

			if (Client.gameState >= 10) { // L: 1874
				int[] var27 = new int[4]; // L: 1875
				Rasterizer2D.Rasterizer2D_getClipArray(var27); // L: 1876
				Rasterizer2D.Rasterizer2D_setClip(xPadding, 0, xPadding + 765, WorldMapArea.canvasHeight); // L: 1877
				class325.loginScreenRunesAnimation.draw(xPadding - 22, Client.cycle); // L: 1878
				class325.loginScreenRunesAnimation.draw(xPadding + 22 + 765 - 128, Client.cycle); // L: 1879
				Rasterizer2D.Rasterizer2D_setClipArray(var27); // L: 1880
			}

			class169.title_muteSprite[class30.clientPreferences.method2580() ? 1 : 0].drawAt(xPadding + 765 - 40, 463); // L: 1882
			if (Client.gameState > 5 && Language.Language_EN == WorldMapCacheName.clientLanguage) { // L: 1883
				if (ModeWhere.field4514 != null) { // L: 1884
					var30 = xPadding + 5; // L: 1885
					var31 = 463; // L: 1886
					byte var42 = 100; // L: 1887
					byte var41 = 35; // L: 1888
					ModeWhere.field4514.drawAt(var30, var31); // L: 1889
					var0.drawCentered("World" + " " + Client.worldId, var42 / 2 + var30, var41 / 2 + var31 - 2, 16777215, 0); // L: 1890
					if (PacketBufferNode.World_request != null) { // L: 1891
						var1.drawCentered("Loading...", var42 / 2 + var30, var41 / 2 + var31 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var42 / 2 + var30, var41 / 2 + var31 + 12, 16777215, 0); // L: 1892
					}
				} else {
					ModeWhere.field4514 = class173.SpriteBuffer_getIndexedSpriteByName(class311.field3274, "sl_button", ""); // L: 1895
				}
			}

		}
	} // L: 1438 1898

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-771978879"
	)
	static int method2199(int var0, Script var1, boolean var2) {
		if (var0 == 6754) { // L: 5108
			int var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5109
			NPCComposition var6 = VarcInt.getNpcDefinition(var5); // L: 5110
			Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var6 != null ? var6.name : ""; // L: 5111
			return 1; // L: 5112
		} else {
			NPCComposition var3;
			if (var0 == 6764) { // L: 5114
				Interpreter.Interpreter_intStackSize -= 2; // L: 5115
				var3 = VarcInt.getNpcDefinition(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 5116
				int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 5117
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method3703(var4); // L: 5118
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method3712(var4); // L: 5119
				return 1; // L: 5120
			} else if (var0 == 6765) { // L: 5122
				var3 = VarcInt.getNpcDefinition(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 5123
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 != null ? var3.combatLevel : 0; // L: 5124
				return 1; // L: 5125
			} else {
				return 2; // L: 5127
			}
		}
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(Lom;Ljava/lang/String;I)V",
		garbageValue = "825713592"
	)
	static void method2168(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1); // L: 1490
		Client.archiveLoaders.add(var2); // L: 1491
		Client.field786 += var2.groupCount; // L: 1492
	} // L: 1493

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1626097121"
	)
	static final void method2178() {
		for (int var0 = 0; var0 < Client.npcCount; ++var0) { // L: 4193
			int var1 = Client.npcIndices[var0]; // L: 4194
			NPC var2 = Client.npcs[var1]; // L: 4195
			if (var2 != null) { // L: 4196
				ScriptEvent.updateActorSequence(var2, var2.definition.size); // L: 4197
			}
		}

	} // L: 4200

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "(Lng;IIIIIII)V",
		garbageValue = "301311770"
	)
	static final void method2201(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field717) { // L: 11232
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0; // L: 11233
		}

		Client.field717 = false; // L: 11234
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !class524.mouseCam && MouseHandler.MouseHandler_currentButton == 4) { // L: 11235
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) { // L: 11236
				var0.scrollY -= 4; // L: 11237
				UserComparator5.invalidateWidget(var0); // L: 11238
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) { // L: 11240
				var0.scrollY += 4; // L: 11241
				UserComparator5.invalidateWidget(var0); // L: 11242
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) { // L: 11244
				var7 = var3 * (var3 - 32) / var4; // L: 11245
				if (var7 < 8) { // L: 11246
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2; // L: 11247
				int var9 = var3 - 32 - var7; // L: 11248
				var0.scrollY = var8 * (var4 - var3) / var9; // L: 11249
				UserComparator5.invalidateWidget(var0); // L: 11250
				Client.field717 = true; // L: 11251
			}
		}

		if (Client.mouseWheelRotation != 0) { // L: 11254
			var7 = var0.width; // L: 11255
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) { // L: 11256
				var0.scrollY += Client.mouseWheelRotation * 45; // L: 11257
				UserComparator5.invalidateWidget(var0); // L: 11258
			}
		}

	} // L: 11261

	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-70"
	)
	static boolean method2193(int var0) {
		for (int var1 = 0; var1 < Client.field706; ++var1) { // L: 12003
			if (Client.field768[var1] == var0) { // L: 12004
				return true;
			}
		}

		return false; // L: 12006
	}

	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V",
		garbageValue = "-47"
	)
	public static void method2195(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = ViewportMouse.getPacketBufferNode(ClientPacket.field3257, Client.packetWriter.isaacCipher); // L: 12906
		var4.packetBuffer.writeShort(var1); // L: 12907
		var4.packetBuffer.writeShort(var0); // L: 12908
		var4.packetBuffer.method9525(var3 ? Client.field624 : 0); // L: 12909
		var4.packetBuffer.writeByte(var2); // L: 12910
		Client.packetWriter.addNode(var4); // L: 12911
	} // L: 12912
}
