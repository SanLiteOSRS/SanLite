import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
@Implements("World")
public class World {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("KitDefinition_archive")
	static AbstractArchive KitDefinition_archive;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 298002637
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1099316549
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("az")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("av")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 1223093243
	)
	static int field835;
	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	static Archive field829;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1537616355
	)
	@Export("id")
	int id;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1550321977
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1098841151
	)
	@Export("population")
	int population;
	@ObfuscatedName("ax")
	@Export("host")
	String host;
	@ObfuscatedName("aa")
	@Export("activity")
	String activity;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1663377203
	)
	@Export("location")
	int location;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1541369663
	)
	@Export("index")
	int index;
	@ObfuscatedName("ab")
	String field823;

	static {
		World_count = 0; // L: 14
		World_listCount = 0; // L: 15
		World_sortOption2 = new int[]{1, 1, 1, 1}; // L: 16
		World_sortOption1 = new int[]{0, 1, 2, 3}; // L: 17
	}

	World() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "18459"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (1 & this.properties) != 0; // L: 258
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1666523957"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (65536 & this.properties) != 0; // L: 262
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-14"
	)
	boolean method1810() {
		return (2 & this.properties) != 0; // L: 266
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2076610622"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (4 & this.properties) != 0; // L: 270
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "82"
	)
	boolean method1812() {
		return (8 & this.properties) != 0; // L: 274
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "88611160"
	)
	boolean method1846() {
		return (536870912 & this.properties) != 0; // L: 278
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1119201695"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (33554432 & this.properties) != 0; // L: 282
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1104770276"
	)
	boolean method1815() {
		return (1073741824 & this.properties) != 0; // L: 286
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "39"
	)
	boolean method1816() {
		return (256 & this.properties) != 0; // L: 290
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "245225695"
	)
	boolean method1817() {
		return (134217728 & this.properties) != 0; // L: 294
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)I",
		garbageValue = "-1514003245"
	)
	public static int method1861(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) { // L: 22
			int var6 = var3; // L: 23
			var3 = var4; // L: 24
			var4 = var6; // L: 25
		}

		var2 &= 3; // L: 27
		if (var2 == 0) { // L: 28
			return var1;
		} else if (var2 == 1) { // L: 29
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0; // L: 30
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([BIIII[Lij;B)V",
		garbageValue = "0"
	)
	static final void method1862(byte[] var0, int var1, int var2, int var3, int var4, CollisionMap[] var5) {
		int var7;
		int var8;
		for (int var6 = 0; var6 < 4; ++var6) { // L: 90
			for (var7 = 0; var7 < 64; ++var7) { // L: 91
				for (var8 = 0; var8 < 64; ++var8) { // L: 92
					if (var7 + var1 > 0 && var7 + var1 < 103 && var8 + var2 > 0 && var8 + var2 < 103) { // L: 93
						int[] var10000 = var5[var6].flags[var7 + var1];
						var10000[var8 + var2] &= -16777217;
					}
				}
			}
		}

		Buffer var12 = new Buffer(var0); // L: 97

		for (var7 = 0; var7 < 4; ++var7) { // L: 98
			for (var8 = 0; var8 < 64; ++var8) { // L: 99
				for (int var9 = 0; var9 < 64; ++var9) { // L: 100
					int var10 = var8 + var1; // L: 101
					int var11 = var9 + var2; // L: 102
					ScriptEvent.loadTerrain(var12, var7, var10, var11, var3 + var10, var11 + var4, 0); // L: 103
				}
			}
		}

	} // L: 107

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1526297994"
	)
	static void method1844() {
		Login.Login_username = Login.Login_username.trim(); // L: 1176
		if (Login.Login_username.length() == 0) { // L: 1177
			Actor.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 1178
		} else {
			long var1;
			try {
				URL var3 = new URL(UrlRequest.method2850("services", false) + "m=accountappeal/login.ws"); // L: 1185
				URLConnection var4 = var3.openConnection(); // L: 1186
				var4.setRequestProperty("connection", "close"); // L: 1187
				var4.setDoInput(true); // L: 1188
				var4.setDoOutput(true); // L: 1189
				var4.setConnectTimeout(5000); // L: 1190
				OutputStreamWriter var5 = new OutputStreamWriter(var4.getOutputStream()); // L: 1191
				var5.write("data1=req"); // L: 1192
				var5.flush(); // L: 1193
				InputStream var6 = var4.getInputStream(); // L: 1194
				Buffer var7 = new Buffer(new byte[1000]); // L: 1195

				while (true) {
					int var8 = var6.read(var7.array, var7.offset, 1000 - var7.offset); // L: 1197
					if (var8 == -1) { // L: 1198
						var7.offset = 0; // L: 1205
						long var22 = var7.readLong(); // L: 1206
						var1 = var22; // L: 1207
						break;
					}

					var7.offset += var8; // L: 1199
					if (var7.offset >= 1000) { // L: 1200
						var1 = 0L; // L: 1201
						break;
					}
				}
			} catch (Exception var31) { // L: 1209
				var1 = 0L; // L: 1210
			}

			byte var0;
			if (var1 == 0L) { // L: 1214
				var0 = 5;
			} else {
				String var32 = Login.Login_username; // L: 1217
				Random var33 = new Random(); // L: 1219
				Buffer var26 = new Buffer(128); // L: 1220
				Buffer var9 = new Buffer(128); // L: 1221
				int[] var10 = new int[]{var33.nextInt(), var33.nextInt(), (int)(var1 >> 32), (int)var1}; // L: 1222 1223 1224 1225 1226
				var26.writeByte(10); // L: 1227

				int var11;
				for (var11 = 0; var11 < 4; ++var11) { // L: 1228
					var26.writeInt(var33.nextInt()); // L: 1229
				}

				var26.writeInt(var10[0]); // L: 1231
				var26.writeInt(var10[1]); // L: 1232
				var26.writeLong(var1); // L: 1233
				var26.writeLong(0L); // L: 1234

				for (var11 = 0; var11 < 4; ++var11) { // L: 1235
					var26.writeInt(var33.nextInt()); // L: 1236
				}

				var26.encryptRsa(class72.field902, class72.field903); // L: 1238
				var9.writeByte(10); // L: 1239

				for (var11 = 0; var11 < 3; ++var11) { // L: 1240
					var9.writeInt(var33.nextInt()); // L: 1241
				}

				var9.writeLong(var33.nextLong()); // L: 1243
				var9.method9073(var33.nextLong()); // L: 1244
				VertexNormal.method4951(var9); // L: 1245
				var9.writeLong(var33.nextLong()); // L: 1246
				var9.encryptRsa(class72.field902, class72.field903); // L: 1247
				var11 = class501.stringCp1252NullTerminatedByteSize(var32); // L: 1248
				if (var11 % 8 != 0) { // L: 1249
					var11 += 8 - var11 % 8;
				}

				Buffer var12 = new Buffer(var11); // L: 1250
				var12.writeStringCp1252NullTerminated(var32); // L: 1251
				var12.offset = var11; // L: 1252
				var12.xteaEncryptAll(var10); // L: 1253
				Buffer var13 = new Buffer(var9.offset + var26.offset + var12.offset + 5); // L: 1254
				var13.writeByte(2); // L: 1255
				var13.writeByte(var26.offset); // L: 1256
				var13.writeBytes(var26.array, 0, var26.offset); // L: 1257
				var13.writeByte(var9.offset); // L: 1258
				var13.writeBytes(var9.array, 0, var9.offset); // L: 1259
				var13.writeShort(var12.offset); // L: 1260
				var13.writeBytes(var12.array, 0, var12.offset); // L: 1261
				String var14 = class345.method6646(var13.array); // L: 1262

				byte var27;
				try {
					URL var15 = new URL(UrlRequest.method2850("services", false) + "m=accountappeal/login.ws"); // L: 1264
					URLConnection var16 = var15.openConnection(); // L: 1265
					var16.setDoInput(true); // L: 1266
					var16.setDoOutput(true); // L: 1267
					var16.setConnectTimeout(5000); // L: 1268
					OutputStreamWriter var17 = new OutputStreamWriter(var16.getOutputStream()); // L: 1269
					var17.write("data2=" + class497.method8882(var14) + "&dest=" + class497.method8882("passwordchoice.ws")); // L: 1270
					var17.flush(); // L: 1271
					InputStream var18 = var16.getInputStream(); // L: 1272
					var13 = new Buffer(new byte[1000]); // L: 1273

					while (true) {
						int var19 = var18.read(var13.array, var13.offset, 1000 - var13.offset); // L: 1275
						if (var19 == -1) { // L: 1276
							var17.close(); // L: 1283
							var18.close(); // L: 1284
							String var28 = new String(var13.array); // L: 1285
							if (var28.startsWith("OFFLINE")) { // L: 1286
								var27 = 4; // L: 1287
							} else if (var28.startsWith("WRONG")) { // L: 1290
								var27 = 7; // L: 1291
							} else if (var28.startsWith("RELOAD")) { // L: 1294
								var27 = 3; // L: 1295
							} else if (var28.startsWith("Not permitted for social network accounts.")) { // L: 1298
								var27 = 6; // L: 1299
							} else {
								var13.xteaDecryptAll(var10); // L: 1302

								while (var13.offset > 0 && var13.array[var13.offset - 1] == 0) { // L: 1303
									--var13.offset; // L: 1304
								}

								var28 = new String(var13.array, 0, var13.offset); // L: 1306
								boolean var20;
								if (var28 == null) { // L: 1309
									var20 = false; // L: 1310
								} else {
									label116: {
										try {
											new URL(var28);
										} catch (MalformedURLException var29) { // L: 1316
											var20 = false; // L: 1317
											break label116; // L: 1318
										}

										var20 = true; // L: 1320
									}
								}

								if (var20) { // L: 1322
									NPC.openURL(var28, true, false); // L: 1323
									var27 = 2; // L: 1324
								} else {
									var27 = 5; // L: 1326
								}
							}
							break;
						}

						var13.offset += var19; // L: 1277
						if (var13.offset >= 1000) { // L: 1278
							var27 = 5; // L: 1279
							break;
						}
					}
				} catch (Throwable var30) { // L: 1328
					var30.printStackTrace(); // L: 1329
					var27 = 5; // L: 1330
				}

				var0 = var27; // L: 1333
			}

			switch(var0) { // L: 1335
			case 2:
				Actor.setLoginResponseString(class352.field3908, class352.field4163, class352.field4034); // L: 1352
				class328.method6115(6); // L: 1353
				break;
			case 3:
				Actor.setLoginResponseString("", "Error connecting to server.", ""); // L: 1343
				break; // L: 1344
			case 4:
				Actor.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 1349
				break; // L: 1350
			case 5:
				Actor.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 1340
				break; // L: 1341
			case 6:
				Actor.setLoginResponseString("", "Error connecting to server.", ""); // L: 1346
				break; // L: 1347
			case 7:
				Actor.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 1337
			}

		}
	} // L: 1179 1356

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(Ldf;IILio;B)V",
		garbageValue = "-30"
	)
	static final void method1860(Player var0, int var1, int var2, class218 var3) {
		int var4 = var0.pathX[0]; // L: 9174
		int var5 = var0.pathY[0]; // L: 9175
		int var6 = var0.transformedSize(); // L: 9176
		if (var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) { // L: 9177
			if (var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) { // L: 9178
				int var8 = var0.transformedSize(); // L: 9180
				Client.field815.approxDestinationX = var1; // L: 9183
				Client.field815.approxDestinationY = var2; // L: 9184
				Client.field815.approxDestinationSizeX = 1; // L: 9185
				Client.field815.approxDestinationSizeY = 1; // L: 9186
				ApproximateRouteStrategy var9 = Client.field815; // L: 9187
				CollisionMap var11 = Client.collisionMaps[var0.plane]; // L: 9190
				int[] var12 = Client.field795; // L: 9191
				int[] var13 = Client.field737; // L: 9192
				int var7 = WorldMapSprite.method5513(var4, var5, var8, var9, var11, true, var12, var13, class219.field2388[0]); // L: 9194
				int var14 = var7; // L: 9196
				if (var7 >= 1) { // L: 9197
					for (int var15 = 0; var15 < var14 - 1; ++var15) { // L: 9198
						var0.method2332(Client.field795[var15], Client.field737[var15], var3);
					}

				}
			}
		}
	} // L: 9199
}
