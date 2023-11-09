import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("tq")
	@ObfuscatedGetter(
		intValue = -178026771
	)
	static int field1398;
	@ObfuscatedName("a")
	@Export("url")
	final URL url;
	@ObfuscatedName("f")
	@Export("isDone0")
	volatile boolean isDone0;
	@ObfuscatedName("c")
	@Export("response0")
	volatile byte[] response0;

	UrlRequest(URL var1) {
		this.url = var1; // L: 118
	} // L: 119

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1609199470"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.isDone0; // L: 122
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-452781351"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0; // L: 126
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-738571360"
	)
	public String method2716() {
		return this.url.toString(); // L: 130
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lnl;Lnl;Lnl;S)V",
		garbageValue = "5023"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (GameEngine.canvasWidth - 765) / 2; // L: 1176
		Login.loginBoxX = Login.xPadding + 202; // L: 1177
		Canvas.loginBoxCenter = Login.loginBoxX + 180; // L: 1178
		if (Login.worldSelectOpen) { // L: 1179
			Client.method1227(var0, var1); // L: 1180
		} else {
			class313.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1183
			HealthBar.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1184
			MouseRecorder.logoSprite.drawAt(Login.xPadding + 382 - MouseRecorder.logoSprite.subWidth / 2, 18); // L: 1185
			int var4;
			if (Client.gameState == 0 || Client.gameState == 5) { // L: 1186
				byte var3 = 20; // L: 1187
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1); // L: 1188
				var4 = 253 - var3; // L: 1189
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409); // L: 1190
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0); // L: 1191
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409); // L: 1192
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150 + Login.Login_loadingPercent * 3, var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0); // L: 1193
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1); // L: 1194
			}

			String var5;
			String var6;
			String var7;
			short var23;
			int var24;
			short var25;
			if (Client.gameState == 20) { // L: 1196
				class356.titleboxSprite.drawAt(Login.loginBoxX + 180 - class356.titleboxSprite.subWidth / 2, 271 - class356.titleboxSprite.subHeight / 2); // L: 1197
				var23 = 201; // L: 1198
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1199
				var24 = var23 + 15; // L: 1200
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1201
				var24 += 15; // L: 1202
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1203
				var24 += 15; // L: 1204
				var24 += 7; // L: 1205
				if (Login.loginIndex != 4 && Login.loginIndex != 10) { // L: 1206
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var24, 16777215, 0); // L: 1207
					var25 = 200; // L: 1208
					var5 = BufferedSink.clientPreferences.method2381() ? ClientPacket.method5373(Login.Login_username) : Login.Login_username; // L: 1211

					for (var6 = var5; var0.stringWidth(var6) > var25; var6 = var6.substring(0, var6.length() - 1)) { // L: 1213 1214 1215
					}

					var0.draw(AbstractFont.escapeBrackets(var6), Login.loginBoxX + 180 - 70, var24, 16777215, 0); // L: 1217
					var24 += 15; // L: 1218

					for (var7 = ClientPacket.method5373(Login.Login_password); var0.stringWidth(var7) > var25; var7 = var7.substring(1)) { // L: 1219 1220 1221
					}

					var0.draw("Password: " + var7, Login.loginBoxX + 180 - 108, var24, 16777215, 0); // L: 1223
					var24 += 15; // L: 1224
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) { // L: 1227
				class356.titleboxSprite.drawAt(Login.loginBoxX, 171); // L: 1228
				short var18;
				if (Login.loginIndex == 0) { // L: 1229
					var23 = 251; // L: 1230
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1231
					var24 = var23 + 30; // L: 1232
					var4 = Login.loginBoxX + 180 - 80; // L: 1233
					var18 = 291; // L: 1234
					class143.field1647.drawAt(var4 - 73, var18 - 20); // L: 1235
					var0.drawLines("New User", var4 - 73, var18 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1236
					var4 = Login.loginBoxX + 180 + 80; // L: 1237
					class143.field1647.drawAt(var4 - 73, var18 - 20); // L: 1238
					var0.drawLines("Existing User", var4 - 73, var18 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1239
				} else if (Login.loginIndex == 1) { // L: 1241
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0); // L: 1242
					var23 = 236; // L: 1243
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16777215, 0); // L: 1244
					var24 = var23 + 15; // L: 1245
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16777215, 0); // L: 1246
					var24 += 15; // L: 1247
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16777215, 0); // L: 1248
					var24 += 15; // L: 1249
					var4 = Login.loginBoxX + 180 - 80; // L: 1250
					var18 = 321; // L: 1251
					class143.field1647.drawAt(var4 - 73, var18 - 20); // L: 1252
					var0.drawCentered("Continue", var4, var18 + 5, 16777215, 0); // L: 1253
					var4 = Login.loginBoxX + 180 + 80; // L: 1254
					class143.field1647.drawAt(var4 - 73, var18 - 20); // L: 1255
					var0.drawCentered("Cancel", var4, var18 + 5, 16777215, 0); // L: 1256
				} else if (Login.loginIndex == 2) { // L: 1258
					var23 = 201; // L: 1259
					var0.drawCentered(Login.Login_response1, Canvas.loginBoxCenter, var23, 16776960, 0); // L: 1260
					var24 = var23 + 15; // L: 1261
					var0.drawCentered(Login.Login_response2, Canvas.loginBoxCenter, var24, 16776960, 0); // L: 1262
					var24 += 15; // L: 1263
					var0.drawCentered(Login.Login_response3, Canvas.loginBoxCenter, var24, 16776960, 0); // L: 1264
					var24 += 15; // L: 1265
					var24 += 7; // L: 1266
					var0.draw("Login: ", Canvas.loginBoxCenter - 110, var24, 16777215, 0); // L: 1267
					var25 = 200; // L: 1268
					var5 = BufferedSink.clientPreferences.method2381() ? ClientPacket.method5373(Login.Login_username) : Login.Login_username; // L: 1271

					for (var6 = var5; var0.stringWidth(var6) > var25; var6 = var6.substring(1)) { // L: 1273 1274 1275
					}

					var0.draw(AbstractFont.escapeBrackets(var6) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? GameObject.colorStartTag(16776960) + "|" : ""), Canvas.loginBoxCenter - 70, var24, 16777215, 0); // L: 1277
					var24 += 15; // L: 1278

					for (var7 = ClientPacket.method5373(Login.Login_password); var0.stringWidth(var7) > var25; var7 = var7.substring(1)) { // L: 1279 1280 1281
					}

					var0.draw("Password: " + var7 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? GameObject.colorStartTag(16776960) + "|" : ""), Canvas.loginBoxCenter - 108, var24, 16777215, 0); // L: 1283
					var24 += 15; // L: 1284
					var23 = 277; // L: 1285
					int var8 = Canvas.loginBoxCenter + -117; // L: 1286
					boolean var10 = Client.Login_isUsernameRemembered; // L: 1288
					boolean var11 = Login.field916; // L: 1289
					IndexedSprite var9 = var10 ? (var11 ? class341.field4230 : class181.field1931) : (var11 ? MouseRecorder.field1059 : Login.field908); // L: 1291
					var9.drawAt(var8, var23); // L: 1294
					var8 = var8 + var9.subWidth + 5; // L: 1295
					var1.draw("Remember username", var8, var23 + 13, 16776960, 0); // L: 1296
					var8 = Canvas.loginBoxCenter + 24; // L: 1297
					boolean var14 = BufferedSink.clientPreferences.method2381(); // L: 1299
					boolean var15 = Login.field917; // L: 1300
					IndexedSprite var13 = var14 ? (var15 ? class341.field4230 : class181.field1931) : (var15 ? MouseRecorder.field1059 : Login.field908); // L: 1302
					var13.drawAt(var8, var23); // L: 1305
					var8 = var8 + var13.subWidth + 5; // L: 1306
					var1.draw("Hide username", var8, var23 + 13, 16776960, 0); // L: 1307
					var24 = var23 + 15; // L: 1308
					int var16 = Canvas.loginBoxCenter - 80; // L: 1309
					short var17 = 321; // L: 1310
					class143.field1647.drawAt(var16 - 73, var17 - 20); // L: 1311
					var0.drawCentered("Login", var16, var17 + 5, 16777215, 0); // L: 1312
					var16 = Canvas.loginBoxCenter + 80; // L: 1313
					class143.field1647.drawAt(var16 - 73, var17 - 20); // L: 1314
					var0.drawCentered("Cancel", var16, var17 + 5, 16777215, 0); // L: 1315
					var23 = 357; // L: 1316
					switch(Login.field925) { // L: 1317
					case 2:
						class17.field95 = "Having trouble logging in?"; // L: 1322
						break;
					default:
						class17.field95 = "Can't login? Click here."; // L: 1319
					}

					class459.field4855 = new Bounds(Canvas.loginBoxCenter, var23, var1.stringWidth(class17.field95), 11); // L: 1325
					WorldMapID.field2925 = new Bounds(Canvas.loginBoxCenter, var23, var1.stringWidth("Still having trouble logging in?"), 11); // L: 1326
					var1.drawCentered(class17.field95, Canvas.loginBoxCenter, var23, 16777215, 0); // L: 1327
				} else if (Login.loginIndex == 3) { // L: 1329
					var23 = 201; // L: 1330
					var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1331
					var24 = var23 + 20; // L: 1332
					var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1333
					var24 += 15; // L: 1334
					var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1335
					var24 += 15; // L: 1336
					var4 = Login.loginBoxX + 180; // L: 1337
					var18 = 276; // L: 1338
					class143.field1647.drawAt(var4 - 73, var18 - 20); // L: 1339
					var2.drawCentered("Try again", var4, var18 + 5, 16777215, 0); // L: 1340
					var4 = Login.loginBoxX + 180; // L: 1341
					var18 = 326; // L: 1342
					class143.field1647.drawAt(var4 - 73, var18 - 20); // L: 1343
					var2.drawCentered("Forgotten password?", var4, var18 + 5, 16777215, 0); // L: 1344
				} else {
					int var20;
					short var27;
					int var28;
					if (Login.loginIndex == 4) { // L: 1346
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1347
						var23 = 236; // L: 1348
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16777215, 0); // L: 1349
						var24 = var23 + 15; // L: 1350
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16777215, 0); // L: 1351
						var24 += 15; // L: 1352
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16777215, 0); // L: 1353
						var24 += 15; // L: 1354
						var0.draw("PIN: " + ClientPacket.method5373(class355.otp) + (Client.cycle % 40 < 20 ? GameObject.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var24, 16777215, 0); // L: 1355
						var24 -= 8; // L: 1356
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var24, 16776960, 0); // L: 1357
						var24 += 15; // L: 1358
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var24, 16776960, 0); // L: 1359
						var4 = 180 + Login.loginBoxX - 9 + var0.stringWidth("for 30 days: ") + 15; // L: 1360
						var28 = var24 - var0.ascent; // L: 1361
						IndexedSprite var26;
						if (Login.field900) { // L: 1363
							var26 = class181.field1931; // L: 1364
						} else {
							var26 = Login.field908; // L: 1367
						}

						var26.drawAt(var4, var28); // L: 1369
						var24 += 15; // L: 1370
						var20 = Login.loginBoxX + 180 - 80; // L: 1371
						var27 = 321; // L: 1372
						class143.field1647.drawAt(var20 - 73, var27 - 20); // L: 1373
						var0.drawCentered("Continue", var20, var27 + 5, 16777215, 0); // L: 1374
						var20 = Login.loginBoxX + 180 + 80; // L: 1375
						class143.field1647.drawAt(var20 - 73, var27 - 20); // L: 1376
						var0.drawCentered("Cancel", var20, var27 + 5, 16777215, 0); // L: 1377
						var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var27 + 36, 255, 0); // L: 1378
					} else if (Login.loginIndex == 5) { // L: 1380
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1381
						var23 = 221; // L: 1382
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1383
						var24 = var23 + 15; // L: 1384
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1385
						var24 += 15; // L: 1386
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1387
						var24 += 15; // L: 1388
						var24 += 14; // L: 1389
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var24, 16777215, 0); // L: 1390
						var25 = 174; // L: 1391
						var5 = BufferedSink.clientPreferences.method2381() ? ClientPacket.method5373(Login.Login_username) : Login.Login_username; // L: 1394

						for (var6 = var5; var0.stringWidth(var6) > var25; var6 = var6.substring(1)) { // L: 1396 1397 1398
						}

						var0.draw(AbstractFont.escapeBrackets(var6) + (Client.cycle % 40 < 20 ? GameObject.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var24, 16777215, 0); // L: 1400
						var24 += 15; // L: 1401
						var20 = Login.loginBoxX + 180 - 80; // L: 1402
						var27 = 321; // L: 1403
						class143.field1647.drawAt(var20 - 73, var27 - 20); // L: 1404
						var0.drawCentered("Recover", var20, var27 + 5, 16777215, 0); // L: 1405
						var20 = Login.loginBoxX + 180 + 80; // L: 1406
						class143.field1647.drawAt(var20 - 73, var27 - 20); // L: 1407
						var0.drawCentered("Back", var20, var27 + 5, 16777215, 0); // L: 1408
						var27 = 356; // L: 1409
						var1.drawCentered("Still having trouble logging in?", Canvas.loginBoxCenter, var27, 268435455, 0); // L: 1410
					} else if (Login.loginIndex == 6) { // L: 1412
						var23 = 201; // L: 1413
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1414
						var24 = var23 + 15; // L: 1415
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1416
						var24 += 15; // L: 1417
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1418
						var24 += 15; // L: 1419
						var4 = Login.loginBoxX + 180; // L: 1420
						var18 = 321; // L: 1421
						class143.field1647.drawAt(var4 - 73, var18 - 20); // L: 1422
						var0.drawCentered("Back", var4, var18 + 5, 16777215, 0); // L: 1423
					} else if (Login.loginIndex == 7) { // L: 1425
						if (ItemContainer.field1020 && !Client.onMobile) { // L: 1426
							var23 = 201; // L: 1427
							var0.drawCentered(Login.Login_response1, Canvas.loginBoxCenter, var23, 16776960, 0); // L: 1428
							var24 = var23 + 15; // L: 1429
							var0.drawCentered(Login.Login_response2, Canvas.loginBoxCenter, var24, 16776960, 0); // L: 1430
							var24 += 15; // L: 1431
							var0.drawCentered(Login.Login_response3, Canvas.loginBoxCenter, var24, 16776960, 0); // L: 1432
							var4 = Canvas.loginBoxCenter - 150; // L: 1433
							var24 += 10; // L: 1434

							for (var28 = 0; var28 < 8; ++var28) { // L: 1435
								class143.field1647.method8806(var4, var24, 30, 40); // L: 1436
								boolean var21 = var28 == Login.field913 & Client.cycle % 40 < 20; // L: 1437
								var0.draw((Login.field914[var28] == null ? "" : Login.field914[var28]) + (var21 ? GameObject.colorStartTag(16776960) + "|" : ""), var4 + 10, var24 + 27, 16777215, 0); // L: 1438
								if (var28 != 1 && var28 != 3) { // L: 1439
									var4 += 35; // L: 1444
								} else {
									var4 += 50; // L: 1440
									var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var24 + 27, 16777215, 0); // L: 1441
								}
							}

							var28 = Canvas.loginBoxCenter - 80; // L: 1447
							short var29 = 321; // L: 1448
							class143.field1647.drawAt(var28 - 73, var29 - 20); // L: 1449
							var0.drawCentered("Submit", var28, var29 + 5, 16777215, 0); // L: 1450
							var28 = Canvas.loginBoxCenter + 80; // L: 1451
							class143.field1647.drawAt(var28 - 73, var29 - 20); // L: 1452
							var0.drawCentered("Cancel", var28, var29 + 5, 16777215, 0); // L: 1453
						} else {
							var23 = 216; // L: 1456
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1457
							var24 = var23 + 15; // L: 1458
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1459
							var24 += 15; // L: 1460
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1461
							var24 += 15; // L: 1462
							var4 = Login.loginBoxX + 180 - 80; // L: 1463
							var18 = 321; // L: 1464
							class143.field1647.drawAt(var4 - 73, var18 - 20); // L: 1465
							var0.drawCentered("Set Date of Birth", var4, var18 + 5, 16777215, 0); // L: 1466
							var4 = Login.loginBoxX + 180 + 80; // L: 1467
							class143.field1647.drawAt(var4 - 73, var18 - 20); // L: 1468
							var0.drawCentered("Back", var4, var18 + 5, 16777215, 0); // L: 1469
						}
					} else if (Login.loginIndex == 8) { // L: 1472
						var23 = 216; // L: 1473
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1474
						var24 = var23 + 15; // L: 1475
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1476
						var24 += 15; // L: 1477
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1478
						var24 += 15; // L: 1479
						var4 = Login.loginBoxX + 180 - 80; // L: 1480
						var18 = 321; // L: 1481
						class143.field1647.drawAt(var4 - 73, var18 - 20); // L: 1482
						var0.drawCentered("Privacy Policy", var4, var18 + 5, 16777215, 0); // L: 1483
						var4 = Login.loginBoxX + 180 + 80; // L: 1484
						class143.field1647.drawAt(var4 - 73, var18 - 20); // L: 1485
						var0.drawCentered("Back", var4, var18 + 5, 16777215, 0); // L: 1486
					} else if (Login.loginIndex == 9) { // L: 1488
						var23 = 221; // L: 1489
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1490
						var24 = var23 + 25; // L: 1491
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1492
						var24 += 25; // L: 1493
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1494
						var4 = Login.loginBoxX + 180; // L: 1495
						var18 = 311; // L: 1496
						class143.field1647.drawAt(var4 - 73, var18 - 20); // L: 1497
						var0.drawCentered("Try again", var4, var18 + 5, 16777215, 0); // L: 1498
					} else if (Login.loginIndex == 10) { // L: 1500
						var24 = Login.loginBoxX + 180; // L: 1501
						var25 = 209; // L: 1502
						var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var25, 16776960, 0); // L: 1503
						var4 = var25 + 20; // L: 1504
						class362.field4314.drawAt(var24 - 109, var4); // L: 1505
						class138.field1609.drawAt(var24 - 48, var4 + 18); // L: 1506
					} else if (Login.loginIndex == 12) { // L: 1508
						var24 = Canvas.loginBoxCenter; // L: 1509
						var25 = 216; // L: 1510
						var2.drawCentered("Before using this app, please read and accept our", var24, var25, 16777215, 0); // L: 1511
						var4 = var25 + 17; // L: 1512
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var24, var4, 16777215, 0); // L: 1513
						var4 += 17; // L: 1514
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var24, var4, 16777215, 0); // L: 1515
						var4 += 17; // L: 1516
						var2.drawCentered("By accepting, you agree to these documents.", var24, var4, 16777215, 0); // L: 1517
						var24 = Canvas.loginBoxCenter - 80; // L: 1518
						var25 = 311; // L: 1519
						class143.field1647.drawAt(var24 - 73, var25 - 20); // L: 1520
						var0.drawCentered("Accept", var24, var25 + 5, 16777215, 0); // L: 1521
						var24 = Canvas.loginBoxCenter + 80; // L: 1522
						class143.field1647.drawAt(var24 - 73, var25 - 20); // L: 1523
						var0.drawCentered("Decline", var24, var25 + 5, 16777215, 0); // L: 1524
					} else if (Login.loginIndex == 13) { // L: 1526
						var23 = 231; // L: 1527
						var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var23, 16777215, 0); // L: 1528
						var24 = var23 + 20; // L: 1529
						var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var24, 16777215, 0); // L: 1530
						var4 = Login.loginBoxX + 180; // L: 1531
						var23 = 311; // L: 1532
						class143.field1647.drawAt(var4 - 73, var23 - 20); // L: 1533
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1534
					} else if (Login.loginIndex == 14) { // L: 1536
						var23 = 201; // L: 1537
						String var19 = ""; // L: 1538
						var5 = ""; // L: 1539
						var6 = ""; // L: 1540
						switch(Login.field907) { // L: 1541
						case 0:
							var19 = "Your account has been involved"; // L: 1563
							var5 = "in serious rule breaking."; // L: 1564
							var6 = ""; // L: 1565
							break;
						case 1:
							var19 = "Account locked as we suspect it has been stolen."; // L: 1556
							var5 = Strings.field3859; // L: 1557
							var6 = ""; // L: 1558
							break; // L: 1559
						case 2:
							var19 = "The unpaid balance on your account needs"; // L: 1544
							var5 = "to be resolved before you can play."; // L: 1545
							var6 = Strings.field3896; // L: 1546
							break;
						default:
							FriendsChatManager.Login_promptCredentials(false); // L: 1551
						}

						var0.drawCentered(var19, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1569
						var24 = var23 + 20; // L: 1570
						var0.drawCentered(var5, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1571
						var24 += 20; // L: 1572
						var0.drawCentered(var6, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1573
						var20 = Login.loginBoxX + 180; // L: 1574
						var27 = 276; // L: 1575
						class143.field1647.drawAt(var20 - 73, var27 - 20); // L: 1576
						var0.drawCentered("Support Page", var20, var27 + 5, 16777215, 0); // L: 1577
						var20 = Login.loginBoxX + 180; // L: 1578
						var27 = 326; // L: 1579
						class143.field1647.drawAt(var20 - 73, var27 - 20); // L: 1580
						var0.drawCentered("Back", var20, var27 + 5, 16777215, 0); // L: 1581
					} else if (Login.loginIndex == 24) { // L: 1583
						var23 = 221; // L: 1584
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16777215, 0); // L: 1585
						var24 = var23 + 15; // L: 1586
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16777215, 0); // L: 1587
						var24 += 15; // L: 1588
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16777215, 0); // L: 1589
						var24 += 15; // L: 1590
						var4 = Login.loginBoxX + 180; // L: 1591
						var18 = 301; // L: 1592
						class143.field1647.drawAt(var4 - 73, var18 - 20); // L: 1593
						var0.drawCentered("Ok", var4, var18 + 5, 16777215, 0); // L: 1594
					} else if (Login.loginIndex == 26) { // L: 1596
						var23 = 216; // L: 1597
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1598
						var24 = var23 + 15; // L: 1599
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1600
						var24 += 15; // L: 1601
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1602
						var24 += 15; // L: 1603
						var4 = Login.loginBoxX + 180 - 80; // L: 1604
						var18 = 321; // L: 1605
						class143.field1647.drawAt(var4 - 73, var18 - 20); // L: 1606
						var0.drawCentered("Set Date of Birth", var4, var18 + 5, 16777215, 0); // L: 1607
						var4 = Login.loginBoxX + 180 + 80; // L: 1608
						class143.field1647.drawAt(var4 - 73, var18 - 20); // L: 1609
						var0.drawCentered("Back", var4, var18 + 5, 16777215, 0); // L: 1610
					}
				}
			}

			if (Client.gameState >= 10) { // L: 1613
				int[] var22 = new int[4]; // L: 1614
				Rasterizer2D.Rasterizer2D_getClipArray(var22); // L: 1615
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class10.canvasHeight); // L: 1616
				GraphicsObject.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle); // L: 1617
				GraphicsObject.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle); // L: 1618
				Rasterizer2D.Rasterizer2D_setClipArray(var22); // L: 1619
			}

			class16.title_muteSprite[BufferedSink.clientPreferences.method2383() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463); // L: 1621
			if (Client.gameState > 5 && class103.clientLanguage == Language.Language_EN) { // L: 1622
				if (WorldMapManager.field2822 != null) { // L: 1623
					var24 = Login.xPadding + 5; // L: 1624
					var25 = 463; // L: 1625
					byte var31 = 100; // L: 1626
					byte var30 = 35; // L: 1627
					WorldMapManager.field2822.drawAt(var24, var25); // L: 1628
					var0.drawCentered("World" + " " + Client.worldId, var31 / 2 + var24, var30 / 2 + var25 - 2, 16777215, 0); // L: 1629
					if (class96.World_request != null) { // L: 1630
						var1.drawCentered("Loading...", var31 / 2 + var24, var30 / 2 + var25 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var31 / 2 + var24, var30 / 2 + var25 + 12, 16777215, 0); // L: 1631
					}
				} else {
					WorldMapManager.field2822 = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(class142.archive8, "sl_button", ""); // L: 1634
				}
			}

		}
	} // L: 1181 1637

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-17"
	)
	public static void method2726() {
		SequenceDefinition.SequenceDefinition_cached.clear(); // L: 390
		SequenceDefinition.SequenceDefinition_cachedFrames.clear(); // L: 391
		SequenceDefinition.SequenceDefinition_cachedModel.clear(); // L: 392
	} // L: 393

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1905849101"
	)
	static final void method2717(int var0, int var1) {
		if (var0 < 128) { // L: 4006
			var0 = 128;
		}

		if (var0 > 383) { // L: 4007
			var0 = 383;
		}

		if (class408.cameraPitch < var0) { // L: 4008
			class408.cameraPitch = (var0 - class408.cameraPitch) * HealthBarDefinition.field1912 / 1000 + class408.cameraPitch + MouseHandler.field254; // L: 4009
			if (class408.cameraPitch > var0) { // L: 4010
				class408.cameraPitch = var0;
			}
		}

		if (class408.cameraPitch > var0) { // L: 4012
			class408.cameraPitch -= (class408.cameraPitch - var0) * HealthBarDefinition.field1912 / 1000 + MouseHandler.field254; // L: 4013
			if (class408.cameraPitch < var0) { // L: 4014
				class408.cameraPitch = var0;
			}
		}

		int var2 = var1 - WorldMapSection1.cameraYaw; // L: 4016
		if (var2 > 1024) { // L: 4017
			var2 -= 2048;
		}

		if (var2 < -1024) { // L: 4018
			var2 += 2048;
		}

		if (var2 > 0) { // L: 4019
			WorldMapSection1.cameraYaw = WorldMapSection1.cameraYaw + MouseHandler.field254 + var2 * HealthBarDefinition.field1912 / 1000; // L: 4020
			WorldMapSection1.cameraYaw &= 2047; // L: 4021
		}

		if (var2 < 0) { // L: 4023
			WorldMapSection1.cameraYaw -= -var2 * HealthBarDefinition.field1912 / 1000 + MouseHandler.field254; // L: 4024
			WorldMapSection1.cameraYaw &= 2047; // L: 4025
		}

		int var3 = var1 - WorldMapSection1.cameraYaw; // L: 4027
		if (var3 > 1024) { // L: 4028
			var3 -= 2048;
		}

		if (var3 < -1024) { // L: 4029
			var3 += 2048;
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) { // L: 4030
			WorldMapSection1.cameraYaw = var1;
		}

	} // L: 4031
}
