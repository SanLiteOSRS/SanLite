import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cu")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("ap")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("av")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("an")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 811682719
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("az")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -899073583
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Lcv;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 353809865
	)
	@Export("cacheGamebuild")
	static int cacheGamebuild;
	@ObfuscatedName("at")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("af")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("al")
	static boolean field871;
	@ObfuscatedName("aq")
	static boolean field865;
	@ObfuscatedName("ah")
	static ArrayList field866;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1901978753
	)
	static int field867;
	@ObfuscatedName("by")
	static final double field868;
	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	static AbstractSocket field863;

	static {
		Interpreter_arrayLengths = new int[5]; // L: 71
		Interpreter_arrays = new int[5][5000]; // L: 72
		Interpreter_intStack = new int[1000]; // L: 73
		Interpreter_stringStack = new String[1000]; // L: 75
		Interpreter_frameDepth = 0; // L: 77
		Interpreter_frames = new ScriptFrame[50]; // L: 78
		Interpreter_calendar = java.util.Calendar.getInstance(); // L: 84
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; // L: 87
		field871 = false; // L: 90
		field865 = false; // L: 91
		field866 = new ArrayList(); // L: 92
		field867 = 0; // L: 93
		field868 = Math.log(2.0D); // L: 97
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lme;",
		garbageValue = "1946381965"
	)
	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16; // L: 238
		int var2 = var0 & 65535; // L: 239
		if (class179.Widget_interfaceComponents[var1] == null || class179.Widget_interfaceComponents[var1][var2] == null) { // L: 240
			boolean var3 = GrandExchangeEvent.loadInterface(var1); // L: 241
			if (!var3) { // L: 242
				return null;
			}
		}

		return class179.Widget_interfaceComponents[var1][var2]; // L: 244
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2068773453"
	)
	static void method2076() {
		Login.Login_username = Login.Login_username.trim(); // L: 1191
		if (Login.Login_username.length() == 0) { // L: 1192
			class156.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 1193
		} else {
			long var1;
			try {
				URL var3 = new URL(class490.method8767("services", false) + "m=accountappeal/login.ws"); // L: 1200
				URLConnection var4 = var3.openConnection(); // L: 1201
				var4.setRequestProperty("connection", "close"); // L: 1202
				var4.setDoInput(true); // L: 1203
				var4.setDoOutput(true); // L: 1204
				var4.setConnectTimeout(5000); // L: 1205
				OutputStreamWriter var5 = new OutputStreamWriter(var4.getOutputStream()); // L: 1206
				var5.write("data1=req"); // L: 1207
				var5.flush(); // L: 1208
				InputStream var6 = var4.getInputStream(); // L: 1209
				Buffer var7 = new Buffer(new byte[1000]); // L: 1210

				while (true) {
					int var8 = var6.read(var7.array, var7.offset, 1000 - var7.offset); // L: 1212
					if (var8 == -1) { // L: 1213
						var7.offset = 0; // L: 1220
						long var31 = var7.readLong(); // L: 1221
						var1 = var31; // L: 1222
						break;
					}

					var7.offset += var8; // L: 1214
					if (var7.offset >= 1000) { // L: 1215
						var1 = 0L; // L: 1216
						break;
					}
				}
			} catch (Exception var45) { // L: 1224
				var1 = 0L; // L: 1225
			}

			byte var0;
			if (0L == var1) { // L: 1229
				var0 = 5;
			} else {
				String var46 = Login.Login_username; // L: 1232
				Random var47 = new Random(); // L: 1234
				Buffer var35 = new Buffer(128); // L: 1235
				Buffer var9 = new Buffer(128); // L: 1236
				int[] var10 = new int[]{var47.nextInt(), var47.nextInt(), (int)(var1 >> 32), (int)var1}; // L: 1237 1238 1239 1240 1241
				var35.writeByte(10); // L: 1242

				int var11;
				for (var11 = 0; var11 < 4; ++var11) { // L: 1243
					var35.writeInt(var47.nextInt()); // L: 1244
				}

				var35.writeInt(var10[0]); // L: 1246
				var35.writeInt(var10[1]); // L: 1247
				var35.writeLong(var1); // L: 1248
				var35.writeLong(0L); // L: 1249

				for (var11 = 0; var11 < 4; ++var11) { // L: 1250
					var35.writeInt(var47.nextInt()); // L: 1251
				}

				var35.encryptRsa(class72.field892, class72.field898); // L: 1253
				var9.writeByte(10); // L: 1254

				for (var11 = 0; var11 < 3; ++var11) { // L: 1255
					var9.writeInt(var47.nextInt()); // L: 1256
				}

				var9.writeLong(var47.nextLong()); // L: 1258
				var9.method9044(var47.nextLong()); // L: 1259
				if (Client.randomDatData != null) { // L: 1261
					var9.writeBytes(Client.randomDatData, 0, Client.randomDatData.length); // L: 1262
				} else {
					byte[] var36 = class217.method4378(); // L: 1265
					var9.writeBytes(var36, 0, var36.length); // L: 1266
				}

				var9.writeLong(var47.nextLong()); // L: 1268
				var9.encryptRsa(class72.field892, class72.field898); // L: 1269
				var11 = Player.stringCp1252NullTerminatedByteSize(var46); // L: 1270
				if (var11 % 8 != 0) { // L: 1271
					var11 += 8 - var11 % 8;
				}

				Buffer var12 = new Buffer(var11); // L: 1272
				var12.writeStringCp1252NullTerminated(var46); // L: 1273
				var12.offset = var11; // L: 1274
				var12.xteaEncryptAll(var10); // L: 1275
				Buffer var13 = new Buffer(var12.offset + var35.offset + var9.offset + 5); // L: 1276
				var13.writeByte(2); // L: 1277
				var13.writeByte(var35.offset); // L: 1278
				var13.writeBytes(var35.array, 0, var35.offset); // L: 1279
				var13.writeByte(var9.offset); // L: 1280
				var13.writeBytes(var9.array, 0, var9.offset); // L: 1281
				var13.writeShort(var12.offset); // L: 1282
				var13.writeBytes(var12.array, 0, var12.offset); // L: 1283
				byte[] var15 = var13.array; // L: 1285
				String var14 = Clock.method3656(var15, 0, var15.length); // L: 1287
				String var16 = var14; // L: 1289

				byte var41;
				try {
					URL var17 = new URL(class490.method8767("services", false) + "m=accountappeal/login.ws"); // L: 1291
					URLConnection var18 = var17.openConnection(); // L: 1292
					var18.setDoInput(true); // L: 1293
					var18.setDoOutput(true); // L: 1294
					var18.setConnectTimeout(5000); // L: 1295
					OutputStreamWriter var19 = new OutputStreamWriter(var18.getOutputStream()); // L: 1296
					int var22 = var16.length(); // L: 1300
					StringBuilder var23 = new StringBuilder(var22); // L: 1301

					int var27;
					for (int var24 = 0; var24 < var22; ++var24) { // L: 1302
						char var25 = var16.charAt(var24); // L: 1303
						if ((var25 < 'a' || var25 > 'z') && (var25 < 'A' || var25 > 'Z') && (var25 < '0' || var25 > '9') && var25 != '.' && var25 != '-' && var25 != '*' && var25 != '_') { // L: 1304
							if (var25 == ' ') { // L: 1305
								var23.append('+');
							} else {
								byte var26 = UserComparator4.charToByteCp1252(var25); // L: 1307
								var23.append('%'); // L: 1308
								var27 = var26 >> 4 & 15; // L: 1309
								if (var27 >= 10) { // L: 1310
									var23.append((char)(var27 + 55));
								} else {
									var23.append((char)(var27 + 48)); // L: 1311
								}

								var27 = var26 & 15; // L: 1312
								if (var27 >= 10) { // L: 1313
									var23.append((char)(var27 + 55));
								} else {
									var23.append((char)(var27 + 48)); // L: 1314
								}
							}
						} else {
							var23.append(var25);
						}
					}

					String var21 = var23.toString(); // L: 1317
					String var48 = "data2=" + var21 + "&dest="; // L: 1320
					int var49 = "passwordchoice.ws".length(); // L: 1323
					StringBuilder var38 = new StringBuilder(var49); // L: 1324

					for (var27 = 0; var27 < var49; ++var27) { // L: 1325
						char var28 = "passwordchoice.ws".charAt(var27); // L: 1326
						if ((var28 < 'a' || var28 > 'z') && (var28 < 'A' || var28 > 'Z') && (var28 < '0' || var28 > '9') && var28 != '.' && var28 != '-' && var28 != '*' && var28 != '_') { // L: 1327
							if (var28 == ' ') { // L: 1328
								var38.append('+');
							} else {
								byte var29 = UserComparator4.charToByteCp1252(var28); // L: 1330
								var38.append('%'); // L: 1331
								int var30 = var29 >> 4 & 15; // L: 1332
								if (var30 >= 10) { // L: 1333
									var38.append((char)(var30 + 55));
								} else {
									var38.append((char)(var30 + 48)); // L: 1334
								}

								var30 = var29 & 15; // L: 1335
								if (var30 >= 10) { // L: 1336
									var38.append((char)(var30 + 55));
								} else {
									var38.append((char)(var30 + 48)); // L: 1337
								}
							}
						} else {
							var38.append(var28);
						}
					}

					String var39 = var38.toString(); // L: 1340
					var19.write(var48 + var39); // L: 1342
					var19.flush(); // L: 1343
					InputStream var40 = var18.getInputStream(); // L: 1344
					var13 = new Buffer(new byte[1000]); // L: 1345

					while (true) {
						int var50 = var40.read(var13.array, var13.offset, 1000 - var13.offset); // L: 1347
						if (var50 == -1) { // L: 1348
							var19.close(); // L: 1355
							var40.close(); // L: 1356
							String var52 = new String(var13.array); // L: 1357
							if (var52.startsWith("OFFLINE")) { // L: 1358
								var41 = 4; // L: 1359
							} else if (var52.startsWith("WRONG")) { // L: 1362
								var41 = 7; // L: 1363
							} else if (var52.startsWith("RELOAD")) { // L: 1366
								var41 = 3; // L: 1367
							} else if (var52.startsWith("Not permitted for social network accounts.")) { // L: 1370
								var41 = 6; // L: 1371
							} else {
								var13.xteaDecryptAll(var10); // L: 1374

								while (var13.offset > 0 && var13.array[var13.offset - 1] == 0) { // L: 1375
									--var13.offset; // L: 1376
								}

								var52 = new String(var13.array, 0, var13.offset); // L: 1378
								boolean var51;
								if (var52 == null) { // L: 1381
									var51 = false; // L: 1382
								} else {
									label246: {
										try {
											new URL(var52);
										} catch (MalformedURLException var43) { // L: 1388
											var51 = false; // L: 1389
											break label246; // L: 1390
										}

										var51 = true; // L: 1392
									}
								}

								if (var51) { // L: 1394
									class339.openURL(var52, true, false); // L: 1395
									var41 = 2; // L: 1396
								} else {
									var41 = 5; // L: 1398
								}
							}
							break;
						}

						var13.offset += var50; // L: 1349
						if (var13.offset >= 1000) { // L: 1350
							var41 = 5; // L: 1351
							break;
						}
					}
				} catch (Throwable var44) { // L: 1400
					var44.printStackTrace(); // L: 1401
					var41 = 5; // L: 1402
				}

				var0 = var41; // L: 1405
			}

			switch(var0) { // L: 1407
			case 2:
				class156.setLoginResponseString(Strings.field4158, Strings.field4159, Strings.field4160); // L: 1412
				ObjectSound.method1926(6); // L: 1413
				break; // L: 1414
			case 3:
				class156.setLoginResponseString("", "Error connecting to server.", ""); // L: 1425
				break;
			case 4:
				class156.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 1422
				break; // L: 1423
			case 5:
				class156.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 1409
				break; // L: 1410
			case 6:
				class156.setLoginResponseString("", "Error connecting to server.", ""); // L: 1416
				break; // L: 1417
			case 7:
				class156.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 1419
			}

		}
	} // L: 1194 1428

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZI)I",
		garbageValue = "199823887"
	)
	static int method2077(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? scriptDotWidget : class184.field1907; // L: 1569
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) { // L: 1570
			Interpreter_intStack[++Interpreter_intStackSize - 1] = UserComparator4.Widget_unpackTargetMask(class19.getWidgetFlags(var3)); // L: 1571
			return 1; // L: 1572
		} else if (var0 != ScriptOpcodes.CC_GETOP) { // L: 1574
			if (var0 == ScriptOpcodes.CC_GETOPBASE) { // L: 1581
				if (var3.dataText == null) { // L: 1582
					Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1583
				}

				return 1; // L: 1584
			} else {
				return 2; // L: 1586
			}
		} else {
			int var4 = Interpreter_intStack[--Interpreter_intStackSize]; // L: 1575
			--var4; // L: 1576
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1577
				Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1578
			} else {
				Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1579
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "([BII)I",
		garbageValue = "-450312126"
	)
	public static int method1975(byte[] var0, int var1) {
		return class36.method696(var0, 0, var1); // L: 56
	}
}
