import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jg")
@Implements("DecorativeObject")
public final class DecorativeObject {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -536654139
	)
	@Export("z")
	int z;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1292086545
	)
	@Export("x")
	int x;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1077329713
	)
	@Export("y")
	int y;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1453698973
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1019318381
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1309751723
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1052631263
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = -1629454309586530347L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1909429839
	)
	@Export("flags")
	int flags;

	DecorativeObject() {
		this.tag = 0L; // L: 13
		this.flags = 0; // L: 14
	} // L: 16

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lhu;",
		garbageValue = "-1543381994"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0); // L: 73
		if (var1 != null) { // L: 74
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0); // L: 75
			var1 = new ObjectComposition(); // L: 76
			var1.id = var0; // L: 77
			if (var2 != null) { // L: 78
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 79
			if (var1.isSolid) { // L: 80
				var1.interactType = 0; // L: 81
				var1.boolean1 = false; // L: 82
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0); // L: 84
			return var1; // L: 85
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "119525354"
	)
	static void method4776() {
		Login.Login_username = Login.Login_username.trim(); // L: 1287
		if (Login.Login_username.length() == 0) { // L: 1288
			Tile.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 1289
		} else {
			long var1 = Friend.method7512(); // L: 1293
			byte var0;
			if (0L == var1) { // L: 1294
				var0 = 5;
			} else {
				String var4 = Login.Login_username; // L: 1297
				Random var5 = new Random(); // L: 1299
				Buffer var6 = new Buffer(128); // L: 1300
				Buffer var7 = new Buffer(128); // L: 1301
				int[] var8 = new int[]{var5.nextInt(), var5.nextInt(), (int)(var1 >> 32), (int)var1}; // L: 1302 1303 1304 1305 1306
				var6.writeByte(10); // L: 1307

				int var9;
				for (var9 = 0; var9 < 4; ++var9) { // L: 1308
					var6.writeInt(var5.nextInt()); // L: 1309
				}

				var6.writeInt(var8[0]); // L: 1311
				var6.writeInt(var8[1]); // L: 1312
				var6.writeLong(var1); // L: 1313
				var6.writeLong(0L); // L: 1314

				for (var9 = 0; var9 < 4; ++var9) { // L: 1315
					var6.writeInt(var5.nextInt()); // L: 1316
				}

				var6.encryptRsa(class70.field863, class70.field867); // L: 1318
				var7.writeByte(10); // L: 1319

				for (var9 = 0; var9 < 3; ++var9) { // L: 1320
					var7.writeInt(var5.nextInt()); // L: 1321
				}

				var7.writeLong(var5.nextLong()); // L: 1323
				var7.method8606(var5.nextLong()); // L: 1324
				if (Client.randomDatData != null) { // L: 1326
					var7.writeBytes(Client.randomDatData, 0, Client.randomDatData.length); // L: 1327
				} else {
					byte[] var10 = new byte[24]; // L: 1332

					try {
						JagexCache.JagexCache_randomDat.seek(0L); // L: 1334
						JagexCache.JagexCache_randomDat.readFully(var10); // L: 1335

						int var11;
						for (var11 = 0; var11 < 24 && var10[var11] == 0; ++var11) { // L: 1336 1337 1338
						}

						if (var11 >= 24) { // L: 1340
							throw new IOException();
						}
					} catch (Exception var23) {
						for (int var12 = 0; var12 < 24; ++var12) { // L: 1343
							var10[var12] = -1;
						}
					}

					var7.writeBytes(var10, 0, var10.length); // L: 1348
				}

				var7.writeLong(var5.nextLong()); // L: 1350
				var7.encryptRsa(class70.field863, class70.field867); // L: 1351
				var9 = WorldMapLabel.stringCp1252NullTerminatedByteSize(var4); // L: 1352
				if (var9 % 8 != 0) { // L: 1353
					var9 += 8 - var9 % 8;
				}

				Buffer var24 = new Buffer(var9); // L: 1354
				var24.writeStringCp1252NullTerminated(var4); // L: 1355
				var24.offset = var9; // L: 1356
				var24.xteaEncryptAll(var8); // L: 1357
				Buffer var18 = new Buffer(var6.offset + var7.offset + var24.offset + 5); // L: 1358
				var18.writeByte(2); // L: 1359
				var18.writeByte(var6.offset); // L: 1360
				var18.writeBytes(var6.array, 0, var6.offset); // L: 1361
				var18.writeByte(var7.offset); // L: 1362
				var18.writeBytes(var7.array, 0, var7.offset); // L: 1363
				var18.writeShort(var24.offset); // L: 1364
				var18.writeBytes(var24.array, 0, var24.offset); // L: 1365
				String var20 = GrandExchangeEvents.method6539(var18.array); // L: 1366

				byte var3;
				try {
					URL var13 = new URL(class154.method3285("services", false) + "m=accountappeal/login.ws"); // L: 1368
					URLConnection var14 = var13.openConnection(); // L: 1369
					var14.setDoInput(true); // L: 1370
					var14.setDoOutput(true); // L: 1371
					var14.setConnectTimeout(5000); // L: 1372
					OutputStreamWriter var15 = new OutputStreamWriter(var14.getOutputStream()); // L: 1373
					var15.write("data2=" + class431.method7966(var20) + "&dest=" + class431.method7966("passwordchoice.ws")); // L: 1374
					var15.flush(); // L: 1375
					InputStream var16 = var14.getInputStream(); // L: 1376
					var18 = new Buffer(new byte[1000]); // L: 1377

					while (true) {
						int var17 = var16.read(var18.array, var18.offset, 1000 - var18.offset); // L: 1379
						if (var17 == -1) { // L: 1380
							var15.close(); // L: 1387
							var16.close(); // L: 1388
							String var21 = new String(var18.array); // L: 1389
							if (var21.startsWith("OFFLINE")) { // L: 1390
								var3 = 4; // L: 1391
							} else if (var21.startsWith("WRONG")) { // L: 1394
								var3 = 7; // L: 1395
							} else if (var21.startsWith("RELOAD")) { // L: 1398
								var3 = 3; // L: 1399
							} else if (var21.startsWith("Not permitted for social network accounts.")) { // L: 1402
								var3 = 6; // L: 1403
							} else {
								var18.xteaDecryptAll(var8); // L: 1406

								while (var18.offset > 0 && var18.array[var18.offset - 1] == 0) { // L: 1407
									--var18.offset; // L: 1408
								}

								var21 = new String(var18.array, 0, var18.offset); // L: 1410
								if (class13.method162(var21)) { // L: 1411
									class25.openURL(var21, true, false); // L: 1412
									var3 = 2; // L: 1413
								} else {
									var3 = 5; // L: 1415
								}
							}
							break;
						}

						var18.offset += var17; // L: 1381
						if (var18.offset >= 1000) { // L: 1382
							var3 = 5; // L: 1383
							break;
						}
					}
				} catch (Throwable var22) { // L: 1417
					var22.printStackTrace(); // L: 1418
					var3 = 5; // L: 1419
				}

				var0 = var3; // L: 1422
			}

			switch(var0) { // L: 1424
			case 2:
				Tile.setLoginResponseString(class332.field3852, class332.field4081, class332.field4082); // L: 1426
				class14.method173(6); // L: 1427
				break; // L: 1428
			case 3:
				Tile.setLoginResponseString("", "Error connecting to server.", ""); // L: 1439
				break; // L: 1440
			case 4:
				Tile.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 1430
				break; // L: 1431
			case 5:
				Tile.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 1433
				break; // L: 1434
			case 6:
				Tile.setLoginResponseString("", "Error connecting to server.", ""); // L: 1442
				break;
			case 7:
				Tile.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 1436
			}

		}
	} // L: 1290 1445

	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "(Lmy;I)Z",
		garbageValue = "2104914841"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden; // L: 12086
	}
}
