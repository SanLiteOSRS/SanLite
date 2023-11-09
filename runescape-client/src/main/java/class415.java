import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pw")
public class class415 {
	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "66"
	)
	static void method7708() {
		if (class25.varcs.hasUnwrittenChanges()) { // L: 1237
			class25.varcs.write();
		}

		if (class126.mouseRecorder != null) { // L: 1238
			class126.mouseRecorder.isRunning = false;
		}

		class126.mouseRecorder = null; // L: 1239
		Client.packetWriter.close(); // L: 1240
		if (GameEngine.taskHandler != null) { // L: 1241
			try {
				GameEngine.taskHandler.close(); // L: 1243
			} catch (Exception var3) { // L: 1245
			}
		}

		GameEngine.taskHandler = null; // L: 1247
		Tiles.method2229(); // L: 1248
		class1.archive2.clearFiles(); // L: 1249
		Player.archive13.clearFiles(); // L: 1250
		class106.field1371.clearFiles(); // L: 1251
		Tiles.field1038.clearFiles(); // L: 1252
		class10.field46.clearFiles(); // L: 1253
		WorldMapElement.field1964.clearFiles(); // L: 1254
		ClanChannelMember.field1676.clearFiles(); // L: 1255
		class227.field2545.clearFiles(); // L: 1256
		class72.method2078(); // L: 1257
		class130.scene.clear(); // L: 1258

		for (int var1 = 0; var1 < 4; ++var1) { // L: 1259
			Client.collisionMaps[var1].clear();
		}

		Canvas.worldMap = null; // L: 1260
		Script.method2180(0, 0); // L: 1261
		UrlRequester.method2829(); // L: 1262
		Client.playingJingle = false; // L: 1263
		class388.method7220(); // L: 1264
		if (class399.pcmPlayer0 != null) { // L: 1265
			class399.pcmPlayer0.shutdown();
		}

		class308.field3462.method6800(); // L: 1266
		class214.method4180(); // L: 1267
		if (FriendsChatManager.urlRequester != null) { // L: 1268
			FriendsChatManager.urlRequester.close(); // L: 1269
		}

		class510.method8993(); // L: 1271
		JagexCache.JagexCache_dat2File = null; // L: 1272
		JagexCache.JagexCache_idx255File = null; // L: 1273
		DecorativeObject.JagexCache_idxFiles = null; // L: 1274
		ItemContainer.method2269(); // L: 1275
		class6.field17 = null; // L: 1276
		Client.archiveLoaders.clear(); // L: 1277
		Client.field827 = 0; // L: 1278
		class308.field3462 = new class359(); // L: 1279
		FriendsChatManager.urlRequester = new class113(class219.client.field573, 216); // L: 1280

		try {
			SecureRandomCallable.method2246("oldschool", class30.field166, WorldMapLabelSize.field2882.name, 0, 22); // L: 1282
		} catch (IOException var2) { // L: 1284
			throw new RuntimeException(var2); // L: 1285
		}

		class6.field17 = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 1287
		GameEngine.taskHandler = new TaskHandler(); // L: 1288
		class219.client.method514(); // L: 1289
		Client.field558 = class92.field1169; // L: 1290
		class317.method6014(0); // L: 1291
	} // L: 1292

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1762836764"
	)
	@Export("load")
	static final void load() {
		int var0;
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		if (Client.oculusOrbState == 0) { // L: 3897
			var0 = VarbitComposition.localPlayer.x; // L: 3898
			var1 = VarbitComposition.localPlayer.y; // L: 3899
			if (FriendLoginUpdate.oculusOrbFocalPointX - var0 < -500 || FriendLoginUpdate.oculusOrbFocalPointX - var0 > 500 || HealthBar.oculusOrbFocalPointY - var1 < -500 || HealthBar.oculusOrbFocalPointY - var1 > 500) { // L: 3900
				FriendLoginUpdate.oculusOrbFocalPointX = var0; // L: 3901
				HealthBar.oculusOrbFocalPointY = var1; // L: 3902
			}

			if (var0 != FriendLoginUpdate.oculusOrbFocalPointX) { // L: 3904
				FriendLoginUpdate.oculusOrbFocalPointX += (var0 - FriendLoginUpdate.oculusOrbFocalPointX) / 16;
			}

			if (var1 != HealthBar.oculusOrbFocalPointY) { // L: 3905
				HealthBar.oculusOrbFocalPointY += (var1 - HealthBar.oculusOrbFocalPointY) / 16;
			}

			var2 = FriendLoginUpdate.oculusOrbFocalPointX >> 7; // L: 3906
			var3 = HealthBar.oculusOrbFocalPointY >> 7; // L: 3907
			var4 = class18.getTileHeight(FriendLoginUpdate.oculusOrbFocalPointX, HealthBar.oculusOrbFocalPointY, HealthBar.Client_plane); // L: 3908
			var5 = 0; // L: 3909
			int var6;
			if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) { // L: 3910
				for (var6 = var2 - 4; var6 <= var2 + 4; ++var6) { // L: 3911
					for (int var7 = var3 - 4; var7 <= var3 + 4; ++var7) { // L: 3912
						int var8 = HealthBar.Client_plane; // L: 3913
						if (var8 < 3 && (Tiles.Tiles_renderFlags[1][var6][var7] & 2) == 2) { // L: 3914
							++var8;
						}

						int var9 = var4 - Tiles.Tiles_heights[var8][var6][var7]; // L: 3915
						if (var9 > var5) { // L: 3916
							var5 = var9;
						}
					}
				}
			}

			var6 = var5 * 192; // L: 3920
			if (var6 > 98048) { // L: 3921
				var6 = 98048;
			}

			if (var6 < 32768) { // L: 3922
				var6 = 32768;
			}

			if (var6 > Client.field668) { // L: 3923
				Client.field668 += (var6 - Client.field668) / 24;
			} else if (var6 < Client.field668) { // L: 3924
				Client.field668 += (var6 - Client.field668) / 80;
			}

			class125.field1494 = class18.getTileHeight(VarbitComposition.localPlayer.x, VarbitComposition.localPlayer.y, HealthBar.Client_plane) - Client.camFollowHeight; // L: 3925
		} else if (Client.oculusOrbState == 1) { // L: 3927
			KeyHandler.method430(); // L: 3928
			short var10 = -1; // L: 3929
			if (Client.field674.method4120(33)) { // L: 3930
				var10 = 0;
			} else if (Client.field674.method4120(49)) { // L: 3931
				var10 = 1024;
			}

			if (Client.field674.method4120(48)) { // L: 3932
				if (var10 == 0) { // L: 3933
					var10 = 1792;
				} else if (var10 == 1024) { // L: 3934
					var10 = 1280;
				} else {
					var10 = 1536; // L: 3935
				}
			} else if (Client.field674.method4120(50)) { // L: 3937
				if (var10 == 0) { // L: 3938
					var10 = 256;
				} else if (var10 == 1024) { // L: 3939
					var10 = 768;
				} else {
					var10 = 512; // L: 3940
				}
			}

			byte var11 = 0; // L: 3942
			if (Client.field674.method4120(35)) { // L: 3943
				var11 = -1;
			} else if (Client.field674.method4120(51)) { // L: 3944
				var11 = 1;
			}

			var2 = 0; // L: 3945
			if (var10 >= 0 || var11 != 0) { // L: 3946
				var2 = Client.field674.method4120(81) ? Client.oculusOrbSlowedSpeed : Client.oculusOrbNormalSpeed; // L: 3947
				var2 *= 16; // L: 3948
				Client.field622 = var10; // L: 3949
				Client.field623 = var11; // L: 3950
			}

			if (Client.field621 < var2) { // L: 3952
				Client.field621 += var2 / 8; // L: 3953
				if (Client.field621 > var2) { // L: 3954
					Client.field621 = var2;
				}
			} else if (Client.field621 > var2) { // L: 3956
				Client.field621 = Client.field621 * 9 / 10;
			}

			if (Client.field621 > 0) { // L: 3957
				var3 = Client.field621 / 16; // L: 3958
				if (Client.field622 >= 0) { // L: 3959
					var0 = Client.field622 - UserComparator10.cameraYaw & 2047; // L: 3960
					var4 = Rasterizer3D.Rasterizer3D_sine[var0]; // L: 3961
					var5 = Rasterizer3D.Rasterizer3D_cosine[var0]; // L: 3962
					FriendLoginUpdate.oculusOrbFocalPointX += var4 * var3 / 65536; // L: 3963
					HealthBar.oculusOrbFocalPointY += var5 * var3 / 65536; // L: 3964
				}

				if (Client.field623 != 0) { // L: 3966
					class125.field1494 += var3 * Client.field623; // L: 3967
					if (class125.field1494 > 0) { // L: 3968
						class125.field1494 = 0;
					}
				}
			} else {
				Client.field622 = -1; // L: 3972
				Client.field623 = -1; // L: 3973
			}

			if (Client.field674.method4120(13)) { // L: 3975
				ObjectSound.method1931(); // L: 3976
			}
		}

		if (MouseHandler.MouseHandler_currentButton == 4 && class183.mouseCam) { // L: 3979
			var0 = MouseHandler.MouseHandler_y - Client.field682; // L: 3980
			Client.field616 = var0 * 2; // L: 3981
			Client.field682 = var0 != -1 && var0 != 1 ? (Client.field682 + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y; // L: 3982
			var1 = Client.field538 - MouseHandler.MouseHandler_x; // L: 3983
			Client.field615 = var1 * 2; // L: 3984
			Client.field538 = var1 != -1 && var1 != 1 ? (MouseHandler.MouseHandler_x + Client.field538) / 2 : MouseHandler.MouseHandler_x; // L: 3985
		} else {
			if (Client.field674.method4120(96)) { // L: 3988
				Client.field615 += (-24 - Client.field615) / 2;
			} else if (Client.field674.method4120(97)) { // L: 3989
				Client.field615 += (24 - Client.field615) / 2;
			} else {
				Client.field615 /= 2; // L: 3990
			}

			if (Client.field674.method4120(98)) { // L: 3991
				Client.field616 += (12 - Client.field616) / 2;
			} else if (Client.field674.method4120(99)) { // L: 3992
				Client.field616 += (-12 - Client.field616) / 2;
			} else {
				Client.field616 /= 2; // L: 3993
			}

			Client.field682 = MouseHandler.MouseHandler_y; // L: 3994
			Client.field538 = MouseHandler.MouseHandler_x; // L: 3995
		}

		Client.camAngleY = Client.field615 / 2 + Client.camAngleY & 2047; // L: 3997
		Client.camAngleX += Client.field616 / 2; // L: 3998
		if (Client.camAngleX < 128) { // L: 3999
			Client.camAngleX = 128;
		}

		if (Client.camAngleX > 383) { // L: 4000
			Client.camAngleX = 383;
		}

	} // L: 4001
}
