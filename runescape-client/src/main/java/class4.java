import java.io.IOException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("c")
public final class class4 {
	@ObfuscatedName("rm")
	static boolean field13;

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "5"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (class258.World_request == null) { // L: 31
				class258.World_request = MilliClock.urlRequester.request(new URL(Huffman.field3291));
			} else if (class258.World_request.isDone()) { // L: 33
				byte[] var0 = class258.World_request.getResponse(); // L: 34
				Buffer var1 = new Buffer(var0); // L: 35
				var1.readInt(); // L: 36
				World.World_count = var1.readUnsignedShort(); // L: 37
				World.World_worlds = new World[World.World_count]; // L: 38

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) { // L: 39 47
					var3 = World.World_worlds[var2] = new World(); // L: 40
					var3.id = var1.readUnsignedShort(); // L: 41
					var3.properties = var1.readInt(); // L: 42
					var3.host = var1.readStringCp1252NullTerminated(); // L: 43
					var3.activity = var1.readStringCp1252NullTerminated(); // L: 44
					var3.location = var1.readUnsignedByte(); // L: 45
					var3.population = var1.readShort(); // L: 46
				}

				WorldMapData_1.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 49
				class258.World_request = null; // L: 50
				return true; // L: 51
			}
		} catch (Exception var4) { // L: 55
			var4.printStackTrace(); // L: 56
			class258.World_request = null; // L: 57
		}

		return false; // L: 59
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "785877305"
	)
	static final void method20(String var0) {
		VarcInt.addGameMessage(30, "", var0); // L: 109
	} // L: 110

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1306352219"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) { // L: 1190
			if (Client.gameState == 0) { // L: 1191
				AbstractByteArrayCopier.client.method481();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) { // L: 1192
				ApproximateRouteStrategy.method1069(0); // L: 1193
				Client.field549 = 0; // L: 1194
				Client.field668 = 0; // L: 1195
				Client.timer.method6458(var0); // L: 1196
				if (var0 != 20) { // L: 1197
					class174.method3382(false);
				}
			}

			if (var0 != 20 && var0 != 40 && PacketBufferNode.field3045 != null) { // L: 1199 1200
				PacketBufferNode.field3045.close(); // L: 1201
				PacketBufferNode.field3045 = null; // L: 1202
			}

			if (Client.gameState == 25) { // L: 1205
				Client.field539 = 0; // L: 1206
				Client.field670 = 0; // L: 1207
				Client.field541 = 1; // L: 1208
				Client.field644 = 0; // L: 1209
				Client.field731 = 1; // L: 1210
			}

			if (var0 != 5 && var0 != 10) { // L: 1212
				if (var0 == 20) { // L: 1220
					int var7 = Client.gameState == 11 ? 4 : 0; // L: 1221
					FriendsChatMember.method6613(KitDefinition.archive10, class299.archive8, false, var7); // L: 1222
				} else if (var0 == 11) { // L: 1224
					FriendsChatMember.method6613(KitDefinition.archive10, class299.archive8, false, 4); // L: 1225
				} else if (var0 == 50) { // L: 1227
					ItemComposition.setLoginResponseString("", "Updating date of birth...", ""); // L: 1228
					FriendsChatMember.method6613(KitDefinition.archive10, class299.archive8, false, 7); // L: 1229
				} else if (Login.clearLoginScreen) { // L: 1232
					class19.titleboxSprite = null; // L: 1233
					Login.titlebuttonSprite = null; // L: 1234
					Login.runesSprite = null; // L: 1235
					class10.leftTitleSprite = null; // L: 1236
					Login.rightTitleSprite = null; // L: 1237
					MusicPatchPcmStream.logoSprite = null; // L: 1238
					class161.title_muteSprite = null; // L: 1239
					class29.options_buttons_0Sprite = null; // L: 1240
					VerticalAlignment.options_buttons_2Sprite = null; // L: 1241
					class388.worldSelectBackSprites = null; // L: 1242
					NetCache.worldSelectFlagSprites = null; // L: 1243
					PcmPlayer.worldSelectArrows = null; // L: 1244
					VarbitComposition.worldSelectStars = null; // L: 1245
					GrandExchangeOfferWorldComparator.field4064 = null; // L: 1246
					class259.loginScreenRunesAnimation.method2173(); // L: 1247
					class273.musicPlayerStatus = 1; // L: 1249
					NetFileRequest.musicTrackArchive = null; // L: 1250
					UrlRequester.musicTrackGroupId = -1; // L: 1251
					SceneTilePaint.musicTrackFileId = -1; // L: 1252
					class28.musicTrackVolume = 0; // L: 1253
					class273.musicTrackBoolean = false; // L: 1254
					class160.pcmSampleLength = 2; // L: 1255
					if (NetCache.NetCache_socket != null) { // L: 1258
						try {
							Buffer var3 = new Buffer(4); // L: 1260
							var3.writeByte(2); // L: 1261
							var3.writeMedium(0); // L: 1262
							NetCache.NetCache_socket.write(var3.array, 0, 4); // L: 1263
						} catch (IOException var6) {
							try {
								NetCache.NetCache_socket.close(); // L: 1267
							} catch (Exception var5) { // L: 1269
							}

							++NetCache.NetCache_ioExceptions; // L: 1270
							NetCache.NetCache_socket = null; // L: 1271
						}
					}

					Login.clearLoginScreen = false; // L: 1274
				}
			} else {
				boolean var1 = FriendsChatMember.clientPreferences.method2229() >= Client.field480; // L: 1215
				int var2 = var1 ? 0 : 12; // L: 1217
				FriendsChatMember.method6613(KitDefinition.archive10, class299.archive8, true, var2); // L: 1218
			}

			Client.gameState = var0; // L: 1276
		}
	} // L: 1277

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "5"
	)
	static final void method19(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) { // L: 8223
			if (Client.rootWidgetXs[var4] + Client.rootWidgetWidths[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) { // L: 8224
				Client.field643[var4] = true;
			}
		}

	} // L: 8226
}
