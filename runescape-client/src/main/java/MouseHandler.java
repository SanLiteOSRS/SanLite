import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
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

@ObfuscatedName("ab")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	@Export("MouseHandler_instance")
	public static MouseHandler MouseHandler_instance;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -44816389
	)
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1194359125
	)
	@Export("MouseHandler_currentButtonVolatile")
	public static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1249393651
	)
	@Export("MouseHandler_xVolatile")
	public static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -413344239
	)
	@Export("MouseHandler_yVolatile")
	public static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = -1626091396562653879L
	)
	@Export("MouseHandler_lastMovedVolatile")
	public static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 43075733
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1980728717
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 2007939997
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		longValue = -3606414732592476637L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1605526365
	)
	@Export("MouseHandler_lastButtonVolatile")
	public static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1625100181
	)
	@Export("MouseHandler_lastPressedXVolatile")
	public static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1214346213
	)
	@Export("MouseHandler_lastPressedYVolatile")
	public static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = -3506452727014923741L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	public static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -87818647
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -86980559
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -524846311
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		longValue = 7730373158896790447L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("archive6")
	static Archive archive6;
	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "[Lqj;"
	)
	@Export("crossSprites")
	static SpritePixels[] crossSprites;

	static {
		MouseHandler_instance = new MouseHandler(); // L: 15
		MouseHandler_idleCycles = 0; // L: 16
		MouseHandler_currentButtonVolatile = 0; // L: 17
		MouseHandler_xVolatile = -1;
		MouseHandler_yVolatile = -1;
		MouseHandler_lastMovedVolatile = -1L; // L: 20
		MouseHandler_currentButton = 0;
		MouseHandler_x = 0;
		MouseHandler_y = 0;
		MouseHandler_millis = 0L; // L: 24
		MouseHandler_lastButtonVolatile = 0;
		MouseHandler_lastPressedXVolatile = 0; // L: 26
		MouseHandler_lastPressedYVolatile = 0;
		MouseHandler_lastPressedTimeMillisVolatile = 0L;
		MouseHandler_lastButton = 0;
		MouseHandler_lastPressedX = 0;
		MouseHandler_lastPressedY = 0;
		MouseHandler_lastPressedTimeMillis = 0L; // L: 32
	}

	MouseHandler() {
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;B)I",
		garbageValue = "1"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton();
		if (!var1.isAltDown() && var2 != 2) {
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2;
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0; // L: 103
			MouseHandler_xVolatile = var1.getX(); // L: 104
			MouseHandler_yVolatile = var1.getY();
			MouseHandler_lastMovedVolatile = var1.getWhen();
		}

	} // L: 108

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 61
			MouseHandler_idleCycles = 0; // L: 62
			MouseHandler_lastPressedXVolatile = var1.getX();
			MouseHandler_lastPressedYVolatile = var1.getY(); // L: 64
			MouseHandler_lastPressedTimeMillisVolatile = class131.method2916(); // L: 65
			MouseHandler_lastButtonVolatile = this.getButton(var1);
			if (MouseHandler_lastButtonVolatile != 0) {
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0; // L: 74
			MouseHandler_currentButtonVolatile = 0;
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	} // L: 78

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1);
	} // L: 86

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 89
			MouseHandler_idleCycles = 0; // L: 90
			MouseHandler_xVolatile = -1; // L: 91
			MouseHandler_yVolatile = -1;
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 93
		}

	}

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final void focusGained(FocusEvent var1) {
	} // L: 110

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) { // L: 113
			MouseHandler_currentButtonVolatile = 0;
		}

	} // L: 114

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ldp;FI)F",
		garbageValue = "1893083699"
	)
	static float method600(class117 var0, float var1) {
		if (var0 != null && var0.method2785() != 0) { // L: 18
			if (var1 < (float)var0.field1437[0].field1390) { // L: 21
				return var0.field1435 == class116.field1431 ? var0.field1437[0].field1389 : KitDefinition.method3390(var0, var1, true); // L: 22 23 25
			} else if (var1 > (float)var0.field1437[var0.method2785() - 1].field1390) {
				return var0.field1436 == class116.field1431 ? var0.field1437[var0.method2785() - 1].field1389 : KitDefinition.method3390(var0, var1, false); // L: 29
			} else if (var0.field1434) { // L: 33
				return var0.field1437[0].field1389; // L: 34
			} else {
				class113 var2 = var0.method2774(var1); // L: 36
				boolean var3 = false; // L: 37
				boolean var4 = false; // L: 38
				if (var2 == null) { // L: 39
					return 0.0F; // L: 112
				} else {
					if (0.0D == (double)var2.field1392 && (double)var2.field1393 == 0.0D) { // L: 40
						var3 = true; // L: 41
					} else if (Float.MAX_VALUE == var2.field1392 && Float.MAX_VALUE == var2.field1393) { // L: 43
						var4 = true; // L: 44
					} else if (var2.field1388 != null) { // L: 46
						if (var0.field1448) { // L: 47
							float[] var5 = new float[4]; // L: 48
							float[] var6 = new float[4]; // L: 49
							var5[0] = (float)var2.field1390; // L: 50
							var6[0] = var2.field1389; // L: 51
							var5[1] = var5[0] + var2.field1392 * 0.33333334F; // L: 52
							var6[1] = 0.33333334F * var2.field1393 + var6[0]; // L: 53
							var5[3] = (float)var2.field1388.field1390; // L: 54
							var6[3] = var2.field1388.field1389; // L: 55
							var5[2] = var5[3] - var2.field1388.field1391 * 0.33333334F; // L: 56
							var6[2] = var6[3] - 0.33333334F * var2.field1388.field1396; // L: 57
							if (var0.field1446) { // L: 58
								ObjectSound.method1774(var0, var5, var6); // L: 59
							} else if (var0 != null) { // L: 63
								var0.field1439 = var5[0]; // L: 66
								float var7 = var5[3] - var5[0]; // L: 67
								float var8 = var6[3] - var6[0]; // L: 68
								float var9 = var5[1] - var5[0]; // L: 69
								float var10 = 0.0F; // L: 70
								float var11 = 0.0F; // L: 71
								if (0.0D != (double)var9) { // L: 72
									var10 = (var6[1] - var6[0]) / var9; // L: 73
								}

								var9 = var5[3] - var5[2]; // L: 75
								if (0.0D != (double)var9) { // L: 76
									var11 = (var6[3] - var6[2]) / var9; // L: 77
								}

								float var12 = 1.0F / (var7 * var7); // L: 79
								float var13 = var10 * var7; // L: 80
								float var14 = var7 * var11; // L: 81
								var0.field1441[0] = var12 * (var13 + var14 - var8 - var8) / var7; // L: 82
								var0.field1441[1] = (var8 + var8 + var8 - var13 - var13 - var14) * var12; // L: 83
								var0.field1441[2] = var10; // L: 84
								var0.field1441[3] = var6[0]; // L: 85
							}

							var0.field1448 = false; // L: 88
						}
					} else {
						var3 = true; // L: 92
					}

					if (var3) { // L: 94
						return var2.field1389; // L: 95
					} else if (var4) { // L: 97
						return (float)var2.field1390 != var1 && var2.field1388 != null ? var2.field1388.field1389 : var2.field1389; // L: 98 99 102
					} else {
						return var0.field1446 ? WorldMapIcon_1.method4561(var0, var1) : Canvas.method354(var0, var1); // L: 105 106 109
					}
				}
			}
		} else {
			return 0.0F; // L: 19
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Lnb;",
		garbageValue = "-43"
	)
	public static class388 method574() {
		synchronized(class388.field4409) { // L: 27
			if (class259.field2903 == 0) { // L: 28
				return new class388();
			} else {
				class388.field4409[--class259.field2903].method7004(); // L: 30
				return class388.field4409[class259.field2903]; // L: 31
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1979772952"
	)
	static void method597() {
		Login.Login_username = Login.Login_username.trim(); // L: 1192
		if (Login.Login_username.length() == 0) { // L: 1193
			HealthBarUpdate.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 1194
		} else {
			long var1 = AbstractByteArrayCopier.method5506(); // L: 1198
			byte var0;
			if (var1 == 0L) { // L: 1199
				var0 = 5;
			} else {
				String var4 = Login.Login_username; // L: 1202
				Random var5 = new Random(); // L: 1204
				Buffer var6 = new Buffer(128); // L: 1205
				Buffer var7 = new Buffer(128); // L: 1206
				int[] var8 = new int[]{var5.nextInt(), var5.nextInt(), (int)(var1 >> 32), (int)var1}; // L: 1207 1208 1209 1210 1211
				var6.writeByte(10); // L: 1212

				int var9;
				for (var9 = 0; var9 < 4; ++var9) { // L: 1213
					var6.writeInt(var5.nextInt()); // L: 1214
				}

				var6.writeInt(var8[0]); // L: 1216
				var6.writeInt(var8[1]); // L: 1217
				var6.writeLong(var1); // L: 1218
				var6.writeLong(0L); // L: 1219

				for (var9 = 0; var9 < 4; ++var9) { // L: 1220
					var6.writeInt(var5.nextInt()); // L: 1221
				}

				var6.encryptRsa(class65.field864, class65.field865); // L: 1223
				var7.writeByte(10); // L: 1224

				for (var9 = 0; var9 < 3; ++var9) { // L: 1225
					var7.writeInt(var5.nextInt()); // L: 1226
				}

				var7.writeLong(var5.nextLong()); // L: 1228
				var7.writeLongMedium(var5.nextLong()); // L: 1229
				if (Client.randomDatData != null) { // L: 1231
					var7.writeBytes(Client.randomDatData, 0, Client.randomDatData.length); // L: 1232
				} else {
					byte[] var10 = new byte[24]; // L: 1237

					try {
						JagexCache.JagexCache_randomDat.seek(0L); // L: 1239
						JagexCache.JagexCache_randomDat.readFully(var10); // L: 1240

						int var11;
						for (var11 = 0; var11 < 24 && var10[var11] == 0; ++var11) { // L: 1241 1242 1243
						}

						if (var11 >= 24) { // L: 1245
							throw new IOException();
						}
					} catch (Exception var25) {
						for (int var12 = 0; var12 < 24; ++var12) { // L: 1248
							var10[var12] = -1;
						}
					}

					var7.writeBytes(var10, 0, var10.length); // L: 1253
				}

				var7.writeLong(var5.nextLong()); // L: 1255
				var7.encryptRsa(class65.field864, class65.field865); // L: 1256
				var9 = class92.stringCp1252NullTerminatedByteSize(var4); // L: 1257
				if (var9 % 8 != 0) { // L: 1258
					var9 += 8 - var9 % 8;
				}

				Buffer var26 = new Buffer(var9); // L: 1259
				var26.writeStringCp1252NullTerminated(var4); // L: 1260
				var26.offset = var9; // L: 1261
				var26.xteaEncryptAll(var8); // L: 1262
				Buffer var20 = new Buffer(var6.offset + var7.offset + var26.offset + 5); // L: 1263
				var20.writeByte(2); // L: 1264
				var20.writeByte(var6.offset); // L: 1265
				var20.writeBytes(var6.array, 0, var6.offset); // L: 1266
				var20.writeByte(var7.offset); // L: 1267
				var20.writeBytes(var7.array, 0, var7.offset); // L: 1268
				var20.writeShort(var26.offset); // L: 1269
				var20.writeBytes(var26.array, 0, var26.offset); // L: 1270
				byte[] var13 = var20.array; // L: 1272
				String var22 = Frames.method4310(var13, 0, var13.length); // L: 1274
				String var14 = var22; // L: 1276

				byte var3;
				try {
					URL var15 = new URL(ScriptFrame.method1055("services", false) + "m=accountappeal/login.ws"); // L: 1278
					URLConnection var16 = var15.openConnection(); // L: 1279
					var16.setDoInput(true); // L: 1280
					var16.setDoOutput(true); // L: 1281
					var16.setConnectTimeout(5000); // L: 1282
					OutputStreamWriter var17 = new OutputStreamWriter(var16.getOutputStream()); // L: 1283
					var17.write("data2=" + class342.method6309(var14) + "&dest=" + class342.method6309("passwordchoice.ws")); // L: 1284
					var17.flush(); // L: 1285
					InputStream var18 = var16.getInputStream(); // L: 1286
					var20 = new Buffer(new byte[1000]); // L: 1287

					while (true) {
						int var19 = var18.read(var20.array, var20.offset, 1000 - var20.offset); // L: 1289
						if (var19 == -1) { // L: 1290
							var17.close(); // L: 1297
							var18.close(); // L: 1298
							String var23 = new String(var20.array); // L: 1299
							if (var23.startsWith("OFFLINE")) { // L: 1300
								var3 = 4; // L: 1301
							} else if (var23.startsWith("WRONG")) { // L: 1304
								var3 = 7; // L: 1305
							} else if (var23.startsWith("RELOAD")) { // L: 1308
								var3 = 3; // L: 1309
							} else if (var23.startsWith("Not permitted for social network accounts.")) { // L: 1312
								var3 = 6; // L: 1313
							} else {
								var20.xteaDecryptAll(var8); // L: 1316

								while (var20.offset > 0 && var20.array[var20.offset - 1] == 0) { // L: 1317
									--var20.offset; // L: 1318
								}

								var23 = new String(var20.array, 0, var20.offset); // L: 1320
								if (class67.method1937(var23)) { // L: 1321
									class238.openURL(var23, true, false); // L: 1322
									var3 = 2; // L: 1323
								} else {
									var3 = 5; // L: 1325
								}
							}
							break;
						}

						var20.offset += var19; // L: 1291
						if (var20.offset >= 1000) { // L: 1292
							var3 = 5; // L: 1293
							break;
						}
					}
				} catch (Throwable var24) { // L: 1327
					var24.printStackTrace(); // L: 1328
					var3 = 5; // L: 1329
				}

				var0 = var3; // L: 1332
			}

			switch(var0) { // L: 1334
			case 2:
				HealthBarUpdate.setLoginResponseString(Strings.field3913, Strings.field3887, Strings.field3863); // L: 1345
				UserComparator6.method2701(6); // L: 1346
				break; // L: 1347
			case 3:
				HealthBarUpdate.setLoginResponseString("", "Error connecting to server.", ""); // L: 1342
				break; // L: 1343
			case 4:
				HealthBarUpdate.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 1339
				break; // L: 1340
			case 5:
				HealthBarUpdate.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 1349
				break; // L: 1350
			case 6:
				HealthBarUpdate.setLoginResponseString("", "Error connecting to server.", ""); // L: 1336
				break; // L: 1337
			case 7:
				HealthBarUpdate.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 1352
			}

		}
	} // L: 1195 1355

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "0"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (ReflectionCheck.loadInterface(var0)) { // L: 10939
			class389.updateInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6); // L: 10940
		}
	} // L: 10941

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(Lku;S)V",
		garbageValue = "-11486"
	)
	static final void method598(Widget var0) {
		int var1 = var0.contentType; // L: 11930
		if (var1 == 324) { // L: 11931
			if (Client.field765 == -1) { // L: 11932
				Client.field765 = var0.spriteId2; // L: 11933
				Client.field627 = var0.spriteId; // L: 11934
			}

			if (Client.playerAppearance.isFemale) { // L: 11936
				var0.spriteId2 = Client.field765;
			} else {
				var0.spriteId2 = Client.field627; // L: 11937
			}

		} else if (var1 == 325) { // L: 11940
			if (Client.field765 == -1) { // L: 11941
				Client.field765 = var0.spriteId2; // L: 11942
				Client.field627 = var0.spriteId; // L: 11943
			}

			if (Client.playerAppearance.isFemale) { // L: 11945
				var0.spriteId2 = Client.field627;
			} else {
				var0.spriteId2 = Client.field765; // L: 11946
			}

		} else if (var1 == 327) { // L: 11949
			var0.modelAngleX = 150; // L: 11950
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 11951
			var0.modelType = 5; // L: 11952
			var0.modelId = 0; // L: 11953
		} else if (var1 == 328) { // L: 11956
			var0.modelAngleX = 150; // L: 11957
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 11958
			var0.modelType = 5; // L: 11959
			var0.modelId = 1; // L: 11960
		}
	} // L: 11938 11947 11954 11961 11963

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "402120773"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = class433.getPacketBufferNode(ClientPacket.field2918, Client.packetWriter.isaacCipher); // L: 12216
		var0.packetBuffer.writeByte(0); // L: 12217
		Client.packetWriter.addNode(var0); // L: 12218
	} // L: 12219
}
