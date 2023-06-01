import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mh")
public class class336 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1046641631
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	static Bounds field3786;
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("archive15")
	static Archive archive15;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lni;I)V",
		garbageValue = "1098282240"
	)
	public static void method6623(AbstractArchive var0) {
		EnumComposition.EnumDefinition_archive = var0; // L: 25
	} // L: 26

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-847955535"
	)
	static void method6624() {
		Login.Login_username = Login.Login_username.trim(); // L: 1237
		if (Login.Login_username.length() == 0) { // L: 1238
			UrlRequest.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 1239
		} else {
			long var1;
			try {
				URL var3 = new URL(Skeleton.method4472("services", false) + "m=accountappeal/login.ws"); // L: 1246
				URLConnection var4 = var3.openConnection(); // L: 1247
				var4.setRequestProperty("connection", "close"); // L: 1248
				var4.setDoInput(true); // L: 1249
				var4.setDoOutput(true); // L: 1250
				var4.setConnectTimeout(5000); // L: 1251
				OutputStreamWriter var5 = new OutputStreamWriter(var4.getOutputStream()); // L: 1252
				var5.write("data1=req"); // L: 1253
				var5.flush(); // L: 1254
				InputStream var6 = var4.getInputStream(); // L: 1255
				Buffer var7 = new Buffer(new byte[1000]); // L: 1256

				while (true) {
					int var8 = var6.read(var7.array, var7.offset, 1000 - var7.offset); // L: 1258
					if (var8 == -1) { // L: 1259
						var7.offset = 0; // L: 1266
						long var22 = var7.readLong(); // L: 1267
						var1 = var22; // L: 1268
						break;
					}

					var7.offset += var8; // L: 1260
					if (var7.offset >= 1000) { // L: 1261
						var1 = 0L; // L: 1262
						break;
					}
				}
			} catch (Exception var35) { // L: 1270
				var1 = 0L; // L: 1271
			}

			byte var0;
			if (0L == var1) { // L: 1275
				var0 = 5;
			} else {
				String var36 = Login.Login_username; // L: 1278
				Random var37 = new Random(); // L: 1280
				Buffer var26 = new Buffer(128); // L: 1281
				Buffer var9 = new Buffer(128); // L: 1282
				int[] var10 = new int[]{var37.nextInt(), var37.nextInt(), (int)(var1 >> 32), (int)var1}; // L: 1283 1284 1285 1286 1287
				var26.writeByte(10); // L: 1288

				int var11;
				for (var11 = 0; var11 < 4; ++var11) { // L: 1289
					var26.writeIntME(var37.nextInt()); // L: 1290
				}

				var26.writeIntME(var10[0]); // L: 1292
				var26.writeIntME(var10[1]); // L: 1293
				var26.writeLong(var1); // L: 1294
				var26.writeLong(0L); // L: 1295

				for (var11 = 0; var11 < 4; ++var11) { // L: 1296
					var26.writeIntME(var37.nextInt()); // L: 1297
				}

				var26.encryptRsa(class72.field861, class72.field862); // L: 1299
				var9.writeByte(10); // L: 1300

				for (var11 = 0; var11 < 3; ++var11) { // L: 1301
					var9.writeIntME(var37.nextInt()); // L: 1302
				}

				var9.writeLong(var37.nextLong()); // L: 1304
				var9.method8952(var37.nextLong()); // L: 1305
				if (Client.randomDatData != null) { // L: 1307
					var9.writeBytes(Client.randomDatData, 0, Client.randomDatData.length); // L: 1308
				} else {
					byte[] var12 = new byte[24]; // L: 1313

					try {
						JagexCache.JagexCache_randomDat.seek(0L); // L: 1315
						JagexCache.JagexCache_randomDat.readFully(var12); // L: 1316

						int var13;
						for (var13 = 0; var13 < 24 && var12[var13] == 0; ++var13) { // L: 1317 1318 1319
						}

						if (var13 >= 24) { // L: 1321
							throw new IOException();
						}
					} catch (Exception var34) {
						for (int var14 = 0; var14 < 24; ++var14) { // L: 1324
							var12[var14] = -1;
						}
					}

					var9.writeBytes(var12, 0, var12.length); // L: 1329
				}

				var9.writeLong(var37.nextLong()); // L: 1331
				var9.encryptRsa(class72.field861, class72.field862); // L: 1332
				var11 = class298.stringCp1252NullTerminatedByteSize(var36); // L: 1333
				if (var11 % 8 != 0) { // L: 1334
					var11 += 8 - var11 % 8;
				}

				Buffer var38 = new Buffer(var11); // L: 1335
				var38.writeStringCp1252NullTerminated(var36); // L: 1336
				var38.offset = var11; // L: 1337
				var38.xteaEncryptAll(var10); // L: 1338
				Buffer var27 = new Buffer(var26.offset + var9.offset + var38.offset + 5); // L: 1339
				var27.writeByte(2); // L: 1340
				var27.writeByte(var26.offset); // L: 1341
				var27.writeBytes(var26.array, 0, var26.offset); // L: 1342
				var27.writeByte(var9.offset); // L: 1343
				var27.writeBytes(var9.array, 0, var9.offset); // L: 1344
				var27.writeShort(var38.offset); // L: 1345
				var27.writeBytes(var38.array, 0, var38.offset); // L: 1346
				String var29 = class299.method5754(var27.array); // L: 1347

				byte var30;
				try {
					URL var15 = new URL(Skeleton.method4472("services", false) + "m=accountappeal/login.ws"); // L: 1349
					URLConnection var16 = var15.openConnection(); // L: 1350
					var16.setDoInput(true); // L: 1351
					var16.setDoOutput(true); // L: 1352
					var16.setConnectTimeout(5000); // L: 1353
					OutputStreamWriter var17 = new OutputStreamWriter(var16.getOutputStream()); // L: 1354
					var17.write("data2=" + SceneTilePaint.method4908(var29) + "&dest=" + SceneTilePaint.method4908("passwordchoice.ws")); // L: 1355
					var17.flush(); // L: 1356
					InputStream var18 = var16.getInputStream(); // L: 1357
					var27 = new Buffer(new byte[1000]); // L: 1358

					while (true) {
						int var19 = var18.read(var27.array, var27.offset, 1000 - var27.offset); // L: 1360
						if (var19 == -1) { // L: 1361
							var17.close(); // L: 1368
							var18.close(); // L: 1369
							String var31 = new String(var27.array); // L: 1370
							if (var31.startsWith("OFFLINE")) { // L: 1371
								var30 = 4; // L: 1372
							} else if (var31.startsWith("WRONG")) { // L: 1375
								var30 = 7; // L: 1376
							} else if (var31.startsWith("RELOAD")) { // L: 1379
								var30 = 3; // L: 1380
							} else if (var31.startsWith("Not permitted for social network accounts.")) { // L: 1383
								var30 = 6; // L: 1384
							} else {
								var27.xteaDecryptAll(var10); // L: 1387

								while (var27.offset > 0 && var27.array[var27.offset - 1] == 0) { // L: 1388
									--var27.offset; // L: 1389
								}

								var31 = new String(var27.array, 0, var27.offset); // L: 1391
								boolean var20;
								if (var31 == null) { // L: 1394
									var20 = false; // L: 1395
								} else {
									label134: {
										try {
											new URL(var31);
										} catch (MalformedURLException var32) { // L: 1401
											var20 = false; // L: 1402
											break label134; // L: 1403
										}

										var20 = true; // L: 1405
									}
								}

								if (var20) { // L: 1407
									class125.openURL(var31, true, false); // L: 1408
									var30 = 2; // L: 1409
								} else {
									var30 = 5; // L: 1411
								}
							}
							break;
						}

						var27.offset += var19; // L: 1362
						if (var27.offset >= 1000) { // L: 1363
							var30 = 5; // L: 1364
							break;
						}
					}
				} catch (Throwable var33) { // L: 1413
					var33.printStackTrace(); // L: 1414
					var30 = 5; // L: 1415
				}

				var0 = var30; // L: 1418
			}

			switch(var0) { // L: 1420
			case 2:
				UrlRequest.setLoginResponseString(Strings.field4150, Strings.field4151, Strings.field4152); // L: 1428
				class14.method171(6); // L: 1429
				break; // L: 1430
			case 3:
				UrlRequest.setLoginResponseString("", "Error connecting to server.", ""); // L: 1422
				break; // L: 1423
			case 4:
				UrlRequest.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 1425
				break; // L: 1426
			case 5:
				UrlRequest.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 1435
				break; // L: 1436
			case 6:
				UrlRequest.setLoginResponseString("", "Error connecting to server.", ""); // L: 1438
				break;
			case 7:
				UrlRequest.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 1432
			}

		}
	} // L: 1240 1441
}
