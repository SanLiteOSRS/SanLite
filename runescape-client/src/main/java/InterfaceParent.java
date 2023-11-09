import java.io.IOException;
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1127246631
	)
	@Export("group")
	int group;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 49206093
	)
	@Export("type")
	int type;
	@ObfuscatedName("ar")
	boolean field1065;

	InterfaceParent() {
		this.field1065 = false; // L: 8
	} // L: 10

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "143844531"
	)
	public static boolean method2276(int var0) {
		boolean var1 = false; // L: 141
		boolean var2 = false; // L: 142
		if (!class306.field3399.isEmpty()) { // L: 143
			class407 var3 = (class407)class306.field3399.get(0); // L: 144
			if (var3 == null) { // L: 145
				class306.field3399.remove(0); // L: 146
			} else if (var3.vmethod7676(var0)) { // L: 148
				if (var3.method7668()) { // L: 149
					System.out.println("Error in midimanager.service: " + var3.method7651()); // L: 150
					var1 = true; // L: 151
				} else {
					if (var3.method7652() != null) { // L: 154
						class306.field3399.add(1, var3.method7652()); // L: 155
					}

					var2 = var3.method7650(); // L: 157
				}

				class306.field3399.remove(0); // L: 159
			} else {
				var2 = var3.method7650(); // L: 162
			}
		}

		if (var1) { // L: 165
			class306.field3399.clear(); // L: 166
			ArrayList var4 = class162.method3356(); // L: 167
			class306.field3399.add(new class402((class407)null, var4)); // L: 168
		}

		return var2; // L: 170
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2055389038"
	)
	static void method2277() {
		if (PendingSpawn.varcs.hasUnwrittenChanges()) { // L: 1216
			PendingSpawn.varcs.write();
		}

		if (class497.mouseRecorder != null) { // L: 1217
			class497.mouseRecorder.isRunning = false;
		}

		class497.mouseRecorder = null; // L: 1218
		Client.packetWriter.close(); // L: 1219
		if (GameEngine.taskHandler != null) { // L: 1220
			try {
				GameEngine.taskHandler.close(); // L: 1222
			} catch (Exception var3) { // L: 1224
			}
		}

		GameEngine.taskHandler = null; // L: 1226
		class159.method3336(); // L: 1227
		class197.archive2.clearFiles(); // L: 1228
		FontName.archive13.clearFiles(); // L: 1229
		ReflectionCheck.field273.clearFiles(); // L: 1230
		class191.field1970.clearFiles(); // L: 1231
		World.field829.clearFiles(); // L: 1232
		class106.field1358.clearFiles(); // L: 1233
		Varcs.field1402.clearFiles(); // L: 1234
		Interpreter.field885.clearFiles(); // L: 1235
		class10.compass = null; // L: 1237
		SoundCache.redHintArrowSprite = null; // L: 1238
		class282.mapSceneSprites = null; // L: 1239
		class506.field5041 = null; // L: 1240
		class17.field92 = null; // L: 1241
		class345.field3858 = null; // L: 1242
		DynamicObject.field1014 = null; // L: 1243
		class211.field2304 = null; // L: 1244
		MusicPatchNode2.field3389 = null; // L: 1245
		class302.scrollBarSprites = null; // L: 1246
		AbstractWorldMapIcon.field3044 = null; // L: 1247
		UserComparator5.scene.clear(); // L: 1249

		int var1;
		for (var1 = 0; var1 < 4; ++var1) { // L: 1250
			Client.collisionMaps[var1].clear();
		}

		class127.worldMap = null; // L: 1251
		RouteStrategy.method4227(0, 0); // L: 1252
		class306.field3398.clear(); // L: 1254
		Client.playingJingle = false; // L: 1256
		class133.method3041(); // L: 1257
		if (VerticalAlignment.pcmPlayer1 != null) { // L: 1258
			VerticalAlignment.pcmPlayer1.shutdown();
		}

		class153.field1700.method6853(); // L: 1259
		ArchiveDiskAction.method6681(); // L: 1260
		if (WorldMapLabel.urlRequester != null) { // L: 1261
			WorldMapLabel.urlRequester.close(); // L: 1262
		}

		try {
			JagexCache.JagexCache_dat2File.close(); // L: 1266

			for (var1 = 0; var1 < JagexCache.field1840; ++var1) { // L: 1267
				class302.JagexCache_idxFiles[var1].close();
			}

			JagexCache.field1836.close(); // L: 1268
			JagexCache.JagexCache_randomDat.close(); // L: 1269
		} catch (Exception var4) { // L: 1271
		}

		JagexCache.JagexCache_dat2File = null; // L: 1273
		JagexCache.field1836 = null; // L: 1274
		class302.JagexCache_idxFiles = null; // L: 1275
		FileSystem.FileSystem_cacheFiles.clear(); // L: 1277
		class158.field1749 = null; // L: 1279
		Client.archiveLoaders.clear(); // L: 1280
		Client.field814 = 0; // L: 1281
		class153.field1700 = new class360(); // L: 1282
		WorldMapLabel.urlRequester = new class113(TileItem.client.field562, 215); // L: 1283

		try {
			class183.method3575("oldschool", VarpDefinition.field1910, ArchiveLoader.field1044.name, 0, 22); // L: 1285
		} catch (IOException var2) { // L: 1287
			throw new RuntimeException(var2); // L: 1288
		}

		class158.field1749 = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.field1836, 500000); // L: 1290
		GameEngine.taskHandler = new TaskHandler(); // L: 1291
		Client.field547 = class92.field1144; // L: 1292
		class129.method2989(0); // L: 1293
	} // L: 1294
}
