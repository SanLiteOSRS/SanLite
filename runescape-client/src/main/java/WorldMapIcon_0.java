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

@ObfuscatedName("kq")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 221469055
	)
	@Export("element")
	final int element;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -331250067
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 509633783
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lnn;Lnn;ILkz;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2); // L: 14
		this.element = var3; // L: 15
		this.label = var4; // L: 16
		WorldMapElement var5 = class340.WorldMapElement_get(this.getElement()); // L: 17
		SpritePixels var6 = var5.getSpriteBool(false); // L: 18
		if (var6 != null) { // L: 19
			this.subWidth = var6.subWidth; // L: 20
			this.subHeight = var6.subHeight; // L: 21
		} else {
			this.subWidth = 0; // L: 24
			this.subHeight = 0; // L: 25
		}

	} // L: 27

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1650655075"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 31
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lkz;",
		garbageValue = "-2083618685"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 36
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "139624089"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 41
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1778353617"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 46
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Loc;B)I",
		garbageValue = "-56"
	)
	static int method5598(AbstractArchive var0) {
		int var1 = Login.field961.length + Login.field962.length; // L: 215
		String[] var2 = Login.field963; // L: 217

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 218
			String var4 = var2[var3]; // L: 219
			if (var0.getGroupId(var4) != -1) { // L: 221
				++var1; // L: 222
			}
		}

		return var1; // L: 227
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-1890729689"
	)
	@Export("ByteArrayPool_release")
	public static void ByteArrayPool_release(byte[] var0) {
		synchronized(ByteArrayPool.field4673) { // L: 122
			if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4678) { // L: 123
				ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0; // L: 124
			} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4679) { // L: 127
				ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0; // L: 128
			} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4680) { // L: 131
				ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0; // L: 132
			} else if (var0.length == 30000 && ByteArrayPool.field4677 < ByteArrayPool.field4681) { // L: 135
				ByteArrayPool.field4685[++ByteArrayPool.field4677 - 1] = var0; // L: 136
			} else {
				if (class482.ByteArrayPool_arrays != null) { // L: 139
					for (int var2 = 0; var2 < class318.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 140
						if (var0.length == class318.ByteArrayPool_alternativeSizes[var2] && WorldMapID.ByteArrayPool_altSizeArrayCounts[var2] < class482.ByteArrayPool_arrays[var2].length) { // L: 141
							class482.ByteArrayPool_arrays[var2][WorldMapID.ByteArrayPool_altSizeArrayCounts[var2]++] = var0; // L: 142
							return; // L: 143
						}
					}
				}

			}
		}
	} // L: 125 129 133 137 148

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1754662671"
	)
	static void method5610() {
		Login.Login_username = Login.Login_username.trim(); // L: 1184
		if (Login.Login_username.length() == 0) { // L: 1185
			class59.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 1186
		} else {
			long var1 = Varps.method6250(); // L: 1190
			byte var0;
			if (var1 == 0L) { // L: 1191
				var0 = 5;
			} else {
				String var4 = Login.Login_username; // L: 1194
				Random var5 = new Random(); // L: 1196
				Buffer var6 = new Buffer(128); // L: 1197
				Buffer var7 = new Buffer(128); // L: 1198
				int[] var8 = new int[]{var5.nextInt(), var5.nextInt(), (int)(var1 >> 32), (int)var1}; // L: 1199 1200 1201 1202 1203
				var6.writeByte(10); // L: 1204

				int var9;
				for (var9 = 0; var9 < 4; ++var9) { // L: 1205
					var6.writeIntME(var5.nextInt()); // L: 1206
				}

				var6.writeIntME(var8[0]); // L: 1208
				var6.writeIntME(var8[1]); // L: 1209
				var6.writeLong(var1); // L: 1210
				var6.writeLong(0L); // L: 1211

				for (var9 = 0; var9 < 4; ++var9) { // L: 1212
					var6.writeIntME(var5.nextInt()); // L: 1213
				}

				var6.encryptRsa(class73.field898, class73.field902); // L: 1215
				var7.writeByte(10); // L: 1216

				for (var9 = 0; var9 < 3; ++var9) { // L: 1217
					var7.writeIntME(var5.nextInt()); // L: 1218
				}

				var7.writeLong(var5.nextLong()); // L: 1220
				var7.method9245(var5.nextLong()); // L: 1221
				if (Client.randomDatData != null) { // L: 1223
					var7.writeBytes(Client.randomDatData, 0, Client.randomDatData.length); // L: 1224
				} else {
					byte[] var18 = Player.method2330(); // L: 1227
					var7.writeBytes(var18, 0, var18.length); // L: 1228
				}

				var7.writeLong(var5.nextLong()); // L: 1230
				var7.encryptRsa(class73.field898, class73.field902); // L: 1231
				var9 = SequenceDefinition.stringCp1252NullTerminatedByteSize(var4); // L: 1232
				if (var9 % 8 != 0) { // L: 1233
					var9 += 8 - var9 % 8;
				}

				Buffer var10 = new Buffer(var9); // L: 1234
				var10.writeStringCp1252NullTerminated(var4); // L: 1235
				var10.offset = var9; // L: 1236
				var10.xteaEncryptAll(var8); // L: 1237
				Buffer var11 = new Buffer(var10.offset + var7.offset + var6.offset + 5); // L: 1238
				var11.writeByte(2); // L: 1239
				var11.writeByte(var6.offset); // L: 1240
				var11.writeBytes(var6.array, 0, var6.offset); // L: 1241
				var11.writeByte(var7.offset); // L: 1242
				var11.writeBytes(var7.array, 0, var7.offset); // L: 1243
				var11.writeShort(var10.offset); // L: 1244
				var11.writeBytes(var10.array, 0, var10.offset); // L: 1245
				String var12 = class130.method3012(var11.array); // L: 1246

				byte var3;
				try {
					URL var13 = new URL(WorldMapData_0.method5235("services", false) + "m=accountappeal/login.ws"); // L: 1248
					URLConnection var14 = var13.openConnection(); // L: 1249
					var14.setDoInput(true); // L: 1250
					var14.setDoOutput(true); // L: 1251
					var14.setConnectTimeout(5000); // L: 1252
					OutputStreamWriter var15 = new OutputStreamWriter(var14.getOutputStream()); // L: 1253
					var15.write("data2=" + RouteStrategy.method4393(var12) + "&dest=" + RouteStrategy.method4393("passwordchoice.ws")); // L: 1254
					var15.flush(); // L: 1255
					InputStream var16 = var14.getInputStream(); // L: 1256
					var11 = new Buffer(new byte[1000]); // L: 1257

					while (true) {
						int var17 = var16.read(var11.array, var11.offset, 1000 - var11.offset); // L: 1259
						if (var17 == -1) { // L: 1260
							var15.close(); // L: 1267
							var16.close(); // L: 1268
							String var19 = new String(var11.array); // L: 1269
							if (var19.startsWith("OFFLINE")) { // L: 1270
								var3 = 4; // L: 1271
							} else if (var19.startsWith("WRONG")) { // L: 1274
								var3 = 7; // L: 1275
							} else if (var19.startsWith("RELOAD")) { // L: 1278
								var3 = 3; // L: 1279
							} else if (var19.startsWith("Not permitted for social network accounts.")) { // L: 1282
								var3 = 6; // L: 1283
							} else {
								var11.xteaDecryptAll(var8); // L: 1286

								while (var11.offset > 0 && var11.array[var11.offset - 1] == 0) { // L: 1287
									--var11.offset; // L: 1288
								}

								var19 = new String(var11.array, 0, var11.offset); // L: 1290
								if (Players.method2715(var19)) { // L: 1291
									class129.openURL(var19, true, false); // L: 1292
									var3 = 2; // L: 1293
								} else {
									var3 = 5; // L: 1295
								}
							}
							break;
						}

						var11.offset += var17; // L: 1261
						if (var11.offset >= 1000) { // L: 1262
							var3 = 5; // L: 1263
							break;
						}
					}
				} catch (Throwable var20) { // L: 1297
					var20.printStackTrace(); // L: 1298
					var3 = 5; // L: 1299
				}

				var0 = var3; // L: 1302
			}

			switch(var0) { // L: 1304
			case 2:
				class59.setLoginResponseString(class369.field4127, class369.field4273, class369.field4274); // L: 1315
				class210.method3930(6); // L: 1316
				break; // L: 1317
			case 3:
				class59.setLoginResponseString("", "Error connecting to server.", ""); // L: 1306
				break; // L: 1307
			case 4:
				class59.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 1309
				break; // L: 1310
			case 5:
				class59.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 1312
				break; // L: 1313
			case 6:
				class59.setLoginResponseString("", "Error connecting to server.", ""); // L: 1322
				break;
			case 7:
				class59.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 1319
			}

		}
	} // L: 1187 1325

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "364324423"
	)
	static final void method5608(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0; // L: 11103
		int var7 = var3 - var1; // L: 11104
		int var8 = var6 >= 0 ? var6 : -var6; // L: 11105
		int var9 = var7 >= 0 ? var7 : -var7; // L: 11106
		int var10 = var8; // L: 11107
		if (var8 < var9) { // L: 11108
			var10 = var9;
		}

		if (var10 != 0) { // L: 11109
			int var11 = (var6 << 16) / var10; // L: 11110
			int var12 = (var7 << 16) / var10; // L: 11111
			if (var12 <= var11) { // L: 11112
				var11 = -var11;
			} else {
				var12 = -var12; // L: 11113
			}

			int var13 = var5 * var12 >> 17; // L: 11114
			int var14 = var5 * var12 + 1 >> 17; // L: 11115
			int var15 = var5 * var11 >> 17; // L: 11116
			int var16 = var5 * var11 + 1 >> 17; // L: 11117
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart; // L: 11118
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart; // L: 11119
			int var17 = var0 + var13; // L: 11120
			int var18 = var0 - var14; // L: 11121
			int var19 = var0 + var6 - var14; // L: 11122
			int var20 = var0 + var13 + var6; // L: 11123
			int var21 = var15 + var1; // L: 11124
			int var22 = var1 - var16; // L: 11125
			int var23 = var7 + var1 - var16; // L: 11126
			int var24 = var15 + var7 + var1; // L: 11127
			Rasterizer3D.method4580(var17, var18, var19); // L: 11128
			Rasterizer3D.method4582(var21, var22, var23, var17, var18, var19, 0.0F, 0.0F, 0.0F, var4); // L: 11129
			Rasterizer3D.method4580(var17, var19, var20); // L: 11130
			Rasterizer3D.method4582(var21, var23, var24, var17, var19, var20, 0.0F, 0.0F, 0.0F, var4); // L: 11131
		}
	} // L: 11132
}
