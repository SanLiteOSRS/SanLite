import java.io.IOException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
public class class281 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "309166143"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (class101.World_request == null) { // L: 32
				class101.World_request = class113.urlRequester.request(new URL(PacketWriter.field1412));
			} else if (class101.World_request.isDone()) { // L: 34
				byte[] var0 = class101.World_request.getResponse(); // L: 35
				Buffer var1 = new Buffer(var0); // L: 36
				var1.readInt(); // L: 37
				World.World_count = var1.readUnsignedShort(); // L: 38
				World.World_worlds = new World[World.World_count];

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) {
					var3 = World.World_worlds[var2] = new World();
					var3.id = var1.readUnsignedShort();
					var3.properties = var1.readInt(); // L: 43
					var3.host = var1.readStringCp1252NullTerminated();
					var3.activity = var1.readStringCp1252NullTerminated();
					var3.location = var1.readUnsignedByte();
					var3.population = var1.readShort();
				}

				ModeWhere.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 50
				class101.World_request = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace(); // L: 57
			class101.World_request = null;
		}

		return false;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-15"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 39
		if (var4 == null) { // L: 40
			var4 = new ItemContainer(); // L: 41
			ItemContainer.itemContainers.put(var4, (long)var0); // L: 42
		}

		if (var4.ids.length <= var1) { // L: 44
			int[] var5 = new int[var1 + 1]; // L: 45
			int[] var6 = new int[var1 + 1]; // L: 46

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) { // L: 47
				var5[var7] = var4.ids[var7]; // L: 48
				var6[var7] = var4.quantities[var7]; // L: 49
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) { // L: 51
				var5[var7] = -1; // L: 52
				var6[var7] = 0; // L: 53
			}

			var4.ids = var5; // L: 55
			var4.quantities = var6; // L: 56
		}

		var4.ids[var1] = var2; // L: 58
		var4.quantities[var1] = var3; // L: 59
	} // L: 60

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1406439569"
	)
	static void method5621() {
		if (ClientPreferences.varcs.hasUnwrittenChanges()) { // L: 1257
			ClientPreferences.varcs.write();
		}

		WorldMapElement.method3627(); // L: 1258
		if (Canvas.mouseRecorder != null) { // L: 1259
			Canvas.mouseRecorder.isRunning = false;
		}

		Canvas.mouseRecorder = null; // L: 1260
		Client.packetWriter.close(); // L: 1261
		if (GameEngine.taskHandler != null) { // L: 1262
			try {
				GameEngine.taskHandler.close(); // L: 1264
			} catch (Exception var3) { // L: 1266
			}
		}

		GameEngine.taskHandler = null; // L: 1268
		LoginPacket.method5997(); // L: 1269
		Player.method2436(); // L: 1270
		GrandExchangeOfferOwnWorldComparator.scene.clear(); // L: 1271

		for (int var1 = 0; var1 < 4; ++var1) { // L: 1272
			Client.collisionMaps[var1].clear();
		}

		GrandExchangeOfferUnitPriceComparator.worldMap = null; // L: 1273
		Actor.method2488(0, 0); // L: 1274
		FontName.method9049(); // L: 1275
		Client.playingJingle = false; // L: 1276
		WorldMapSection1.method5058(); // L: 1277
		if (WorldMap.pcmPlayer1 != null) { // L: 1278
			WorldMap.pcmPlayer1.shutdown();
		}

		UrlRequester.field1418.method7134(); // L: 1279
		Skeleton.method5380(); // L: 1280
		if (class113.urlRequester != null) { // L: 1281
			class113.urlRequester.close(); // L: 1282
		}

		class106.method2774(); // L: 1284
		JagexCache.JagexCache_dat2File = null; // L: 1285
		JagexCache.JagexCache_idx255File = null; // L: 1286
		JagexCache.JagexCache_idxFiles = null; // L: 1287
		class235.method4603(); // L: 1288
		class357.field3922 = null; // L: 1289
		Client.archiveLoaders.clear(); // L: 1290
		Client.field785 = 0; // L: 1291
		UrlRequester.field1418 = new class375(); // L: 1292
		class113.urlRequester = new class113(VertexNormal.client.field539, 219); // L: 1293

		try {
			HealthBarUpdate.method2495("oldschool", WorldMapCacheName.field2676, KeyHandler.field153.name, 0, 23); // L: 1295
		} catch (IOException var2) { // L: 1297
			throw new RuntimeException(var2); // L: 1298
		}

		class357.field3922 = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 1300
		GameEngine.taskHandler = new TaskHandler(); // L: 1301
		VertexNormal.client.method516(); // L: 1302
		Client.field528 = class92.field1139; // L: 1303
		class131.method3087(0); // L: 1304
	} // L: 1305

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1795637744"
	)
	static final int method5633() {
		if (class93.clientPreferences.method2535()) { // L: 5061
			return class113.Client_plane;
		} else {
			int var0 = 3; // L: 5062
			if (UserComparator3.cameraPitch < 310) { // L: 5063
				int var1;
				int var2;
				if (Client.oculusOrbState == 1) { // L: 5066
					var1 = class367.oculusOrbFocalPointX >> 7; // L: 5067
					var2 = WorldMapCacheName.oculusOrbFocalPointY >> 7; // L: 5068
				} else {
					var1 = class25.localPlayer.x >> 7; // L: 5071
					var2 = class25.localPlayer.y >> 7; // L: 5072
				}

				int var3 = GameEngine.cameraX >> 7; // L: 5074
				int var4 = GrandExchangeOfferTotalQuantityComparator.cameraZ >> 7; // L: 5075
				if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) { // L: 5076
					return class113.Client_plane;
				}

				if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) { // L: 5077
					return class113.Client_plane;
				}

				if ((Tiles.Tiles_renderFlags[class113.Client_plane][var3][var4] & 4) != 0) { // L: 5078
					var0 = class113.Client_plane;
				}

				int var5;
				if (var1 > var3) { // L: 5080
					var5 = var1 - var3;
				} else {
					var5 = var3 - var1; // L: 5081
				}

				int var6;
				if (var2 > var4) { // L: 5083
					var6 = var2 - var4;
				} else {
					var6 = var4 - var2; // L: 5084
				}

				int var7;
				int var8;
				if (var5 > var6) { // L: 5085
					var7 = var6 * 65536 / var5; // L: 5086
					var8 = 32768; // L: 5087

					while (var1 != var3) { // L: 5088
						if (var3 < var1) { // L: 5089
							++var3;
						} else if (var3 > var1) { // L: 5090
							--var3;
						}

						if ((Tiles.Tiles_renderFlags[class113.Client_plane][var3][var4] & 4) != 0) { // L: 5091
							var0 = class113.Client_plane;
						}

						var8 += var7; // L: 5092
						if (var8 >= 65536) { // L: 5093
							var8 -= 65536; // L: 5094
							if (var4 < var2) { // L: 5095
								++var4;
							} else if (var4 > var2) { // L: 5096
								--var4;
							}

							if ((Tiles.Tiles_renderFlags[class113.Client_plane][var3][var4] & 4) != 0) { // L: 5097
								var0 = class113.Client_plane;
							}
						}
					}
				} else if (var6 > 0) { // L: 5101
					var7 = var5 * 65536 / var6; // L: 5102
					var8 = 32768; // L: 5103

					while (var4 != var2) { // L: 5104
						if (var4 < var2) { // L: 5105
							++var4;
						} else if (var4 > var2) { // L: 5106
							--var4;
						}

						if ((Tiles.Tiles_renderFlags[class113.Client_plane][var3][var4] & 4) != 0) { // L: 5107
							var0 = class113.Client_plane;
						}

						var8 += var7; // L: 5108
						if (var8 >= 65536) { // L: 5109
							var8 -= 65536; // L: 5110
							if (var3 < var1) { // L: 5111
								++var3;
							} else if (var3 > var1) { // L: 5112
								--var3;
							}

							if ((Tiles.Tiles_renderFlags[class113.Client_plane][var3][var4] & 4) != 0) { // L: 5113
								var0 = class113.Client_plane;
							}
						}
					}
				}
			}

			if (class25.localPlayer.x >= 0 && class25.localPlayer.y >= 0 && class25.localPlayer.x < 13312 && class25.localPlayer.y < 13312) { // L: 5118
				if ((Tiles.Tiles_renderFlags[class113.Client_plane][class25.localPlayer.x >> 7][class25.localPlayer.y >> 7] & 4) != 0) { // L: 5119
					var0 = class113.Client_plane;
				}

				return var0;
			} else {
				return class113.Client_plane; // L: 5120
			}
		}
	}
}
