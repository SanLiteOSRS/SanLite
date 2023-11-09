import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ma")
@Implements("GrandExchangeOfferAgeComparator")
final class GrandExchangeOfferAgeComparator implements Comparator {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lmv;Lmv;I)I",
		garbageValue = "331918730"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.age < var2.age ? -1 : (var1.age == var2.age ? 0 : 1); // L: 13
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 17
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 21
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "29"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length(); // L: 141
		int var2 = 0; // L: 142

		for (int var3 = 0; var3 < var1; ++var3) { // L: 143
			var2 = (var2 << 5) - var2 + class31.charToByteCp1252(var0.charAt(var3));
		}

		return var2; // L: 144
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "331376374"
	)
	public static int method6684(CharSequence var0) {
		int var1 = var0.length(); // L: 148
		int var2 = 0; // L: 149

		for (int var3 = 0; var3 < var1; ++var3) { // L: 150
			var2 = (var2 << 5) - var2 + var0.charAt(var3);
		}

		return var2; // L: 151
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lnv;Lnv;Lnv;I)V",
		garbageValue = "-2021027855"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (GameEngine.canvasWidth - 765) / 2; // L: 1091
		Login.loginBoxX = Login.xPadding + 202; // L: 1092
		class143.loginBoxCenter = Login.loginBoxX + 180; // L: 1093
		if (Login.worldSelectOpen) { // L: 1094
			WorldMapSectionType.method5297(var0, var1); // L: 1095
		} else {
			Login.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1098
			class275.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1099
			class33.logoSprite.drawAt(Login.xPadding + 382 - class33.logoSprite.subWidth / 2, 18); // L: 1100
			int var4;
			if (Client.gameState == 0 || Client.gameState == 5) { // L: 1101
				byte var3 = 20; // L: 1102
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1); // L: 1103
				var4 = 253 - var3; // L: 1104
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409); // L: 1105
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0); // L: 1106
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409); // L: 1107
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.Login_loadingPercent * 3 + (Login.loginBoxX + 180 - 150), var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0); // L: 1108
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1); // L: 1109
			}

			String var5;
			String var6;
			String var7;
			String var8;
			short var25;
			int var26;
			short var27;
			if (Client.gameState == 20) { // L: 1111
				class147.titleboxSprite.drawAt(Login.loginBoxX + 180 - class147.titleboxSprite.subWidth / 2, 271 - class147.titleboxSprite.subHeight / 2); // L: 1112
				var25 = 201; // L: 1113
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var25, 16776960, 0); // L: 1114
				var26 = var25 + 15; // L: 1115
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var26, 16776960, 0); // L: 1116
				var26 += 15; // L: 1117
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var26, 16776960, 0); // L: 1118
				var26 += 15; // L: 1119
				var26 += 7; // L: 1120
				if (Login.loginIndex != 4 && Login.loginIndex != 10) { // L: 1121
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var26, 16777215, 0); // L: 1122
					var27 = 200; // L: 1123

					for (var5 = FriendLoginUpdate.method7586(); var0.stringWidth(var5) > var27; var5 = var5.substring(0, var5.length() - 1)) { // L: 1124 1125 1126
					}

					var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var26, 16777215, 0); // L: 1128
					var26 += 15; // L: 1129
					var7 = Login.Login_password; // L: 1131
					var6 = class25.method366('*', var7.length()); // L: 1133

					for (var8 = var6; var0.stringWidth(var8) > var27; var8 = var8.substring(1)) { // L: 1135 1136 1137
					}

					var0.draw("Password: " + var8, Login.loginBoxX + 180 - 108, var26, 16777215, 0); // L: 1139
					var26 += 15; // L: 1140
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) { // L: 1143
				class147.titleboxSprite.drawAt(Login.loginBoxX, 171); // L: 1144
				short var19;
				if (Login.loginIndex == 0) { // L: 1145
					var25 = 251; // L: 1146
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var25, 16776960, 0); // L: 1147
					var26 = var25 + 30; // L: 1148
					var4 = Login.loginBoxX + 180 - 80; // L: 1149
					var19 = 291; // L: 1150
					Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20); // L: 1151
					var0.drawLines("New User", var4 - 73, var19 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1152
					var4 = Login.loginBoxX + 180 + 80; // L: 1153
					Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20); // L: 1154
					var0.drawLines("Existing User", var4 - 73, var19 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1155
				} else if (Login.loginIndex == 1) { // L: 1157
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0); // L: 1158
					var25 = 236; // L: 1159
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var25, 16777215, 0); // L: 1160
					var26 = var25 + 15; // L: 1161
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var26, 16777215, 0); // L: 1162
					var26 += 15; // L: 1163
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var26, 16777215, 0); // L: 1164
					var26 += 15; // L: 1165
					var4 = Login.loginBoxX + 180 - 80; // L: 1166
					var19 = 321; // L: 1167
					Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20); // L: 1168
					var0.drawCentered("Continue", var4, var19 + 5, 16777215, 0); // L: 1169
					var4 = Login.loginBoxX + 180 + 80; // L: 1170
					Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20); // L: 1171
					var0.drawCentered("Cancel", var4, var19 + 5, 16777215, 0); // L: 1172
				} else {
					int var9;
					IndexedSprite var10;
					if (Login.loginIndex == 2) { // L: 1174
						var25 = 201; // L: 1175
						var0.drawCentered(Login.Login_response1, class143.loginBoxCenter, var25, 16776960, 0); // L: 1176
						var26 = var25 + 15; // L: 1177
						var0.drawCentered(Login.Login_response2, class143.loginBoxCenter, var26, 16776960, 0); // L: 1178
						var26 += 15; // L: 1179
						var0.drawCentered(Login.Login_response3, class143.loginBoxCenter, var26, 16776960, 0); // L: 1180
						var26 += 15; // L: 1181
						var26 += 7; // L: 1182
						var0.draw("Login: ", class143.loginBoxCenter - 110, var26, 16777215, 0); // L: 1183
						var27 = 200; // L: 1184

						for (var5 = FriendLoginUpdate.method7586(); var0.stringWidth(var5) > var27; var5 = var5.substring(1)) { // L: 1185 1186 1187
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? class149.colorStartTag(16776960) + "|" : ""), class143.loginBoxCenter - 70, var26, 16777215, 0); // L: 1189
						var26 += 15; // L: 1190
						var7 = Login.Login_password; // L: 1192
						var6 = class25.method366('*', var7.length()); // L: 1194

						for (var8 = var6; var0.stringWidth(var8) > var27; var8 = var8.substring(1)) { // L: 1196 1197 1198
						}

						var0.draw("Password: " + var8 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? class149.colorStartTag(16776960) + "|" : ""), class143.loginBoxCenter - 108, var26, 16777215, 0); // L: 1200
						var26 += 15; // L: 1201
						var25 = 277; // L: 1202
						var9 = class143.loginBoxCenter + -117; // L: 1203
						boolean var11 = Client.Login_isUsernameRemembered; // L: 1205
						boolean var12 = Login.field939; // L: 1206
						var10 = var11 ? (var12 ? class100.field1335 : Login.field910) : (var12 ? ChatChannel.field1005 : Login.field932); // L: 1208
						var10.drawAt(var9, var25); // L: 1211
						var9 = var9 + var10.subWidth + 5; // L: 1212
						var1.draw("Remember username", var9, var25 + 13, 16776960, 0); // L: 1213
						var9 = class143.loginBoxCenter + 24; // L: 1214
						boolean var15 = PacketWriter.clientPreferences.method2484(); // L: 1216
						boolean var16 = Login.field934; // L: 1217
						IndexedSprite var14 = var15 ? (var16 ? class100.field1335 : Login.field910) : (var16 ? ChatChannel.field1005 : Login.field932); // L: 1219
						var14.drawAt(var9, var25); // L: 1222
						var9 = var9 + var14.subWidth + 5; // L: 1223
						var1.draw("Hide username", var9, var25 + 13, 16776960, 0); // L: 1224
						var26 = var25 + 15; // L: 1225
						int var17 = class143.loginBoxCenter - 80; // L: 1226
						short var18 = 321; // L: 1227
						Login.titlebuttonSprite.drawAt(var17 - 73, var18 - 20); // L: 1228
						var0.drawCentered("Login", var17, var18 + 5, 16777215, 0); // L: 1229
						var17 = class143.loginBoxCenter + 80; // L: 1230
						Login.titlebuttonSprite.drawAt(var17 - 73, var18 - 20); // L: 1231
						var0.drawCentered("Cancel", var17, var18 + 5, 16777215, 0); // L: 1232
						var25 = 357; // L: 1233
						switch(Login.field917) { // L: 1234
						case 2:
							WallObject.field2768 = "Having trouble logging in?"; // L: 1236
							break;
						default:
							WallObject.field2768 = "Can't login? Click here."; // L: 1239
						}

						Calendar.field3727 = new Bounds(class143.loginBoxCenter, var25, var1.stringWidth(WallObject.field2768), 11); // L: 1242
						class290.field3364 = new Bounds(class143.loginBoxCenter, var25, var1.stringWidth("Still having trouble logging in?"), 11); // L: 1243
						var1.drawCentered(WallObject.field2768, class143.loginBoxCenter, var25, 16777215, 0); // L: 1244
					} else if (Login.loginIndex == 3) { // L: 1246
						var25 = 201; // L: 1247
						var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var25, 16776960, 0); // L: 1248
						var26 = var25 + 20; // L: 1249
						var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var26, 16776960, 0); // L: 1250
						var26 += 15; // L: 1251
						var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var26, 16776960, 0); // L: 1252
						var26 += 15; // L: 1253
						var4 = Login.loginBoxX + 180; // L: 1254
						var19 = 276; // L: 1255
						Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20); // L: 1256
						var2.drawCentered("Try again", var4, var19 + 5, 16777215, 0); // L: 1257
						var4 = Login.loginBoxX + 180; // L: 1258
						var19 = 326; // L: 1259
						Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20); // L: 1260
						var2.drawCentered("Forgotten password?", var4, var19 + 5, 16777215, 0); // L: 1261
					} else if (Login.loginIndex == 4) { // L: 1263
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1264
						var25 = 236; // L: 1265
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var25, 16777215, 0); // L: 1266
						var26 = var25 + 15; // L: 1267
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var26, 16777215, 0); // L: 1268
						var26 += 15; // L: 1269
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var26, 16777215, 0); // L: 1270
						var26 += 15; // L: 1271
						var5 = "PIN: "; // L: 1273
						var7 = InvDefinition.otp; // L: 1275
						var6 = class25.method366('*', var7.length()); // L: 1277
						var0.draw(var5 + var6 + (Client.cycle % 40 < 20 ? class149.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var26, 16777215, 0); // L: 1279
						var26 -= 8; // L: 1280
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var26, 16776960, 0); // L: 1281
						var26 += 15; // L: 1282
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var26, 16776960, 0); // L: 1283
						int var22 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15; // L: 1284
						var9 = var26 - var0.ascent; // L: 1285
						if (Login.field930) { // L: 1287
							var10 = Login.field910; // L: 1288
						} else {
							var10 = Login.field932; // L: 1291
						}

						var10.drawAt(var22, var9); // L: 1293
						var26 += 15; // L: 1294
						int var28 = Login.loginBoxX + 180 - 80; // L: 1295
						short var29 = 321; // L: 1296
						Login.titlebuttonSprite.drawAt(var28 - 73, var29 - 20); // L: 1297
						var0.drawCentered("Continue", var28, var29 + 5, 16777215, 0); // L: 1298
						var28 = Login.loginBoxX + 180 + 80; // L: 1299
						Login.titlebuttonSprite.drawAt(var28 - 73, var29 - 20); // L: 1300
						var0.drawCentered("Cancel", var28, var29 + 5, 16777215, 0); // L: 1301
						var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var29 + 36, 255, 0); // L: 1302
					} else if (Login.loginIndex == 5) { // L: 1304
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1305
						var25 = 221; // L: 1306
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var25, 16776960, 0); // L: 1307
						var26 = var25 + 15; // L: 1308
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var26, 16776960, 0); // L: 1309
						var26 += 15; // L: 1310
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var26, 16776960, 0); // L: 1311
						var26 += 15; // L: 1312
						var26 += 14; // L: 1313
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var26, 16777215, 0); // L: 1314
						var27 = 174; // L: 1315

						for (var5 = FriendLoginUpdate.method7586(); var0.stringWidth(var5) > var27; var5 = var5.substring(1)) { // L: 1316 1317 1318
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? class149.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var26, 16777215, 0); // L: 1320
						var26 += 15; // L: 1321
						int var23 = Login.loginBoxX + 180 - 80; // L: 1322
						short var21 = 321; // L: 1323
						Login.titlebuttonSprite.drawAt(var23 - 73, var21 - 20); // L: 1324
						var0.drawCentered("Recover", var23, var21 + 5, 16777215, 0); // L: 1325
						var23 = Login.loginBoxX + 180 + 80; // L: 1326
						Login.titlebuttonSprite.drawAt(var23 - 73, var21 - 20); // L: 1327
						var0.drawCentered("Back", var23, var21 + 5, 16777215, 0); // L: 1328
						var21 = 356; // L: 1329
						var1.drawCentered("Still having trouble logging in?", class143.loginBoxCenter, var21, 268435455, 0); // L: 1330
					} else if (Login.loginIndex == 6) { // L: 1332
						var25 = 201; // L: 1333
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var25, 16776960, 0); // L: 1334
						var26 = var25 + 15; // L: 1335
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var26, 16776960, 0); // L: 1336
						var26 += 15; // L: 1337
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var26, 16776960, 0); // L: 1338
						var26 += 15; // L: 1339
						var4 = Login.loginBoxX + 180; // L: 1340
						var19 = 321; // L: 1341
						Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20); // L: 1342
						var0.drawCentered("Back", var4, var19 + 5, 16777215, 0); // L: 1343
					} else if (Login.loginIndex == 7) { // L: 1345
						if (class209.field2376 && !Client.onMobile) { // L: 1346
							var25 = 201; // L: 1347
							var0.drawCentered(Login.Login_response1, class143.loginBoxCenter, var25, 16776960, 0); // L: 1348
							var26 = var25 + 15; // L: 1349
							var0.drawCentered(Login.Login_response2, class143.loginBoxCenter, var26, 16776960, 0); // L: 1350
							var26 += 15; // L: 1351
							var0.drawCentered(Login.Login_response3, class143.loginBoxCenter, var26, 16776960, 0); // L: 1352
							var4 = class143.loginBoxCenter - 150; // L: 1353
							var26 += 10; // L: 1354

							int var30;
							for (var30 = 0; var30 < 8; ++var30) { // L: 1355
								Login.titlebuttonSprite.method9071(var4, var26, 30, 40); // L: 1356
								boolean var34 = var30 == Login.field925 & Client.cycle % 40 < 20; // L: 1357
								var0.draw((Login.field926[var30] == null ? "" : Login.field926[var30]) + (var34 ? class149.colorStartTag(16776960) + "|" : ""), var4 + 10, var26 + 27, 16777215, 0); // L: 1358
								if (var30 != 1 && var30 != 3) { // L: 1359
									var4 += 35; // L: 1364
								} else {
									var4 += 50; // L: 1360
									var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var26 + 27, 16777215, 0); // L: 1361
								}
							}

							var30 = class143.loginBoxCenter - 80; // L: 1367
							short var35 = 321; // L: 1368
							Login.titlebuttonSprite.drawAt(var30 - 73, var35 - 20); // L: 1369
							var0.drawCentered("Submit", var30, var35 + 5, 16777215, 0); // L: 1370
							var30 = class143.loginBoxCenter + 80; // L: 1371
							Login.titlebuttonSprite.drawAt(var30 - 73, var35 - 20); // L: 1372
							var0.drawCentered("Cancel", var30, var35 + 5, 16777215, 0); // L: 1373
						} else {
							var25 = 216; // L: 1376
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var25, 16776960, 0); // L: 1377
							var26 = var25 + 15; // L: 1378
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var26, 16776960, 0); // L: 1379
							var26 += 15; // L: 1380
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var26, 16776960, 0); // L: 1381
							var26 += 15; // L: 1382
							var4 = Login.loginBoxX + 180 - 80; // L: 1383
							var19 = 321; // L: 1384
							Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20); // L: 1385
							var0.drawCentered("Set Date of Birth", var4, var19 + 5, 16777215, 0); // L: 1386
							var4 = Login.loginBoxX + 180 + 80; // L: 1387
							Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20); // L: 1388
							var0.drawCentered("Back", var4, var19 + 5, 16777215, 0); // L: 1389
						}
					} else if (Login.loginIndex == 8) { // L: 1392
						var25 = 216; // L: 1393
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var25, 16776960, 0); // L: 1394
						var26 = var25 + 15; // L: 1395
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var26, 16776960, 0); // L: 1396
						var26 += 15; // L: 1397
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var26, 16776960, 0); // L: 1398
						var26 += 15; // L: 1399
						var4 = Login.loginBoxX + 180 - 80; // L: 1400
						var19 = 321; // L: 1401
						Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20); // L: 1402
						var0.drawCentered("Privacy Policy", var4, var19 + 5, 16777215, 0); // L: 1403
						var4 = Login.loginBoxX + 180 + 80; // L: 1404
						Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20); // L: 1405
						var0.drawCentered("Back", var4, var19 + 5, 16777215, 0); // L: 1406
					} else if (Login.loginIndex == 9) { // L: 1408
						var25 = 221; // L: 1409
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var25, 16776960, 0); // L: 1410
						var26 = var25 + 25; // L: 1411
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var26, 16776960, 0); // L: 1412
						var26 += 25; // L: 1413
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var26, 16776960, 0); // L: 1414
						var4 = Login.loginBoxX + 180; // L: 1415
						var19 = 311; // L: 1416
						Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20); // L: 1417
						var0.drawCentered("Try again", var4, var19 + 5, 16777215, 0); // L: 1418
					} else if (Login.loginIndex == 10) { // L: 1420
						var26 = Login.loginBoxX + 180; // L: 1421
						var27 = 209; // L: 1422
						var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var27, 16776960, 0); // L: 1423
						var4 = var27 + 20; // L: 1424
						class19.field109.drawAt(var26 - 109, var4); // L: 1425
						if (Login.field927.isEmpty()) { // L: 1426
							Canvas.field140.drawAt(var26 - 48, var4 + 18); // L: 1427
						} else {
							Canvas.field140.drawAt(var26 - 48, var4 + 5); // L: 1430
							var0.drawCentered(Login.field927, var26, var4 + 68 - 15, 16776960, 0); // L: 1431
						}
					} else if (Login.loginIndex == 12) { // L: 1434
						var26 = class143.loginBoxCenter; // L: 1435
						var27 = 216; // L: 1436
						var2.drawCentered("Before using this app, please read and accept our", var26, var27, 16777215, 0); // L: 1437
						var4 = var27 + 17; // L: 1438
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var26, var4, 16777215, 0); // L: 1439
						var4 += 17; // L: 1440
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var26, var4, 16777215, 0); // L: 1441
						var4 += 17; // L: 1442
						var2.drawCentered("By accepting, you agree to these documents.", var26, var4, 16777215, 0); // L: 1443
						var26 = class143.loginBoxCenter - 80; // L: 1444
						var27 = 311; // L: 1445
						Login.titlebuttonSprite.drawAt(var26 - 73, var27 - 20); // L: 1446
						var0.drawCentered("Accept", var26, var27 + 5, 16777215, 0); // L: 1447
						var26 = class143.loginBoxCenter + 80; // L: 1448
						Login.titlebuttonSprite.drawAt(var26 - 73, var27 - 20); // L: 1449
						var0.drawCentered("Decline", var26, var27 + 5, 16777215, 0); // L: 1450
					} else if (Login.loginIndex == 13) { // L: 1452
						var25 = 231; // L: 1453
						var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var25, 16777215, 0); // L: 1454
						var26 = var25 + 20; // L: 1455
						var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var26, 16777215, 0); // L: 1456
						var4 = Login.loginBoxX + 180; // L: 1457
						var25 = 311; // L: 1458
						Login.titlebuttonSprite.drawAt(var4 - 73, var25 - 20); // L: 1459
						var0.drawCentered("Back", var4, var25 + 5, 16777215, 0); // L: 1460
					} else if (Login.loginIndex == 14) { // L: 1462
						var25 = 201; // L: 1463
						String var20 = ""; // L: 1464
						var5 = ""; // L: 1465
						var6 = ""; // L: 1466
						switch(Login.field916) { // L: 1467
						case 0:
							var20 = "Your account has been involved"; // L: 1470
							var5 = "in serious rule breaking."; // L: 1471
							var6 = ""; // L: 1472
							break;
						case 1:
							var20 = "Your account has been locked due to"; // L: 1489
							var5 = "suspicious activity."; // L: 1490
							var6 = "Please recover your account."; // L: 1491
							break;
						case 2:
							var20 = "The unpaid balance on your account needs"; // L: 1477
							var5 = "to be resolved before you can play."; // L: 1478
							var6 = Strings.field3881; // L: 1479
							break; // L: 1480
						default:
							UserComparator6.Login_promptCredentials(false); // L: 1484
						}

						var0.drawCentered(var20, Login.loginBoxX + 180, var25, 16776960, 0); // L: 1495
						var26 = var25 + 20; // L: 1496
						var0.drawCentered(var5, Login.loginBoxX + 180, var26, 16776960, 0); // L: 1497
						var26 += 20; // L: 1498
						var0.drawCentered(var6, Login.loginBoxX + 180, var26, 16776960, 0); // L: 1499
						int var31 = Login.loginBoxX + 180; // L: 1500
						short var32 = 276; // L: 1501
						Login.titlebuttonSprite.drawAt(var31 - 73, var32 - 20); // L: 1502
						if (Login.field916 == 1) { // L: 1503
							var0.drawCentered("Recover Account", var31, var32 + 5, 16777215, 0); // L: 1504
						} else {
							var0.drawCentered("View Appeal Options", var31, var32 + 5, 16777215, 0); // L: 1507
						}

						var31 = Login.loginBoxX + 180; // L: 1509
						var32 = 326; // L: 1510
						Login.titlebuttonSprite.drawAt(var31 - 73, var32 - 20); // L: 1511
						var0.drawCentered("Back", var31, var32 + 5, 16777215, 0); // L: 1512
					} else if (Login.loginIndex == 24) { // L: 1514
						var25 = 221; // L: 1515
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var25, 16777215, 0); // L: 1516
						var26 = var25 + 15; // L: 1517
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var26, 16777215, 0); // L: 1518
						var26 += 15; // L: 1519
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var26, 16777215, 0); // L: 1520
						var26 += 15; // L: 1521
						var4 = Login.loginBoxX + 180; // L: 1522
						var19 = 301; // L: 1523
						Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20); // L: 1524
						var0.drawCentered("Ok", var4, var19 + 5, 16777215, 0); // L: 1525
					} else if (Login.loginIndex == 26) { // L: 1527
						var25 = 216; // L: 1528
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var25, 16776960, 0); // L: 1529
						var26 = var25 + 15; // L: 1530
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var26, 16776960, 0); // L: 1531
						var26 += 15; // L: 1532
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var26, 16776960, 0); // L: 1533
						var26 += 15; // L: 1534
						var4 = Login.loginBoxX + 180 - 80; // L: 1535
						var19 = 321; // L: 1536
						Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20); // L: 1537
						var0.drawCentered("Set Date of Birth", var4, var19 + 5, 16777215, 0); // L: 1538
						var4 = Login.loginBoxX + 180 + 80; // L: 1539
						Login.titlebuttonSprite.drawAt(var4 - 73, var19 - 20); // L: 1540
						var0.drawCentered("Back", var4, var19 + 5, 16777215, 0); // L: 1541
					}
				}
			}

			if (Client.gameState >= 10) { // L: 1544
				int[] var24 = new int[4]; // L: 1545
				Rasterizer2D.Rasterizer2D_getClipArray(var24); // L: 1546
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class127.canvasHeight); // L: 1547
				class305.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle); // L: 1548
				class305.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle); // L: 1549
				Rasterizer2D.Rasterizer2D_setClipArray(var24); // L: 1550
			}

			Login.title_muteSprite[PacketWriter.clientPreferences.method2570() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463); // L: 1552
			if (Client.gameState > 5 && class36.clientLanguage == Language.Language_EN) { // L: 1553
				if (Login.field935 != null) { // L: 1554
					var26 = Login.xPadding + 5; // L: 1555
					var27 = 463; // L: 1556
					byte var33 = 100; // L: 1557
					byte var36 = 35; // L: 1558
					Login.field935.drawAt(var26, var27); // L: 1559
					var0.drawCentered("World" + " " + Client.worldId, var33 / 2 + var26, var36 / 2 + var27 - 2, 16777215, 0); // L: 1560
					if (ClanChannel.World_request != null) { // L: 1561
						var1.drawCentered("Loading...", var33 / 2 + var26, var36 / 2 + var27 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var33 / 2 + var26, var36 / 2 + var27 + 12, 16777215, 0); // L: 1562
					}
				} else {
					Login.field935 = VarcInt.SpriteBuffer_getIndexedSpriteByName(WorldMapEvent.archive8, "sl_button", ""); // L: 1565
				}
			}

		}
	} // L: 1096 1568
}
