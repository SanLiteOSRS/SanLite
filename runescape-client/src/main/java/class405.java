import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("po")
public class class405 extends class406 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	class317 field4509;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 759039353
	)
	int field4508;

	@ObfuscatedSignature(
		descriptor = "(Lps;IZI)V"
	)
	public class405(class406 var1, int var2, boolean var3, int var4) {
		super(var1); // L: 11
		this.field4509 = null; // L: 7
		this.field4508 = 0; // L: 8
		super.field4513 = "FadeInTask"; // L: 12
		if (var2 >= 0) { // L: 13
			if (var3 && var2 < class305.field3392.size()) { // L: 16
				this.field4509 = (class317)class305.field3392.get(var2); // L: 17
			} else if (!var3 && var2 < class305.field3397.size()) { // L: 19
				this.field4509 = (class317)class305.field3397.get(var2); // L: 20
			}

			this.field4508 = var4; // L: 22
		}
	} // L: 14 23

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1705548260"
	)
	public boolean vmethod7648(int var1) {
		if (this.field4509 != null && this.field4509.field3511 != null) { // L: 27
			this.field4509.field3516 = true; // L: 30

			try {
				if (this.field4509.field3512 < (float)this.field4509.field3517 && this.field4509.field3511.isReady()) { // L: 32
					float var2 = this.field4508 == 0 ? (float)this.field4508 : (float)this.field4509.field3517 / (float)this.field4508; // L: 33
					class317 var10000 = this.field4509;
					var10000.field3512 += var2 == 0.0F ? (float)this.field4509.field3517 : var2; // L: 34
					if (this.field4509.field3512 > (float)this.field4509.field3517) { // L: 35
						this.field4509.field3512 = (float)this.field4509.field3517; // L: 36
					}

					this.field4509.field3511.setPcmStreamVolume((int)this.field4509.field3512); // L: 38
					return false; // L: 39
				}
			} catch (Exception var4) { // L: 42
				this.method7631(var4.getMessage()); // L: 43
				return true; // L: 44
			}

			this.field4509.field3516 = false; // L: 46
			return true; // L: 47
		} else {
			return true; // L: 28
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZB)I",
		garbageValue = "-63"
	)
	static int method7623(int var0, Script var1, boolean var2) {
		if (var0 == 7108) { // L: 5100
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Calendar.method6621() ? 1 : 0; // L: 5101
			return 1; // L: 5102
		} else {
			return 2; // L: 5104
		}
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2014610155"
	)
	static void method7622() {
		if (class144.varcs.hasUnwrittenChanges()) { // L: 1266
			class144.varcs.write();
		}

		if (class197.mouseRecorder != null) { // L: 1267
			class197.mouseRecorder.isRunning = false;
		}

		class197.mouseRecorder = null; // L: 1268
		Client.packetWriter.close(); // L: 1269
		if (GameEngine.taskHandler != null) { // L: 1270
			try {
				GameEngine.taskHandler.close(); // L: 1272
			} catch (Exception var6) { // L: 1274
			}
		}

		GameEngine.taskHandler = null; // L: 1276
		class30.method473(); // L: 1277
		class342.archive2.clearFiles(); // L: 1278
		Canvas.archive13.clearFiles(); // L: 1279
		class30.field158.clearFiles(); // L: 1280
		class260.field2961.clearFiles(); // L: 1281
		Messages.field1409.clearFiles(); // L: 1282
		WorldMapArchiveLoader.field4877.clearFiles(); // L: 1283
		class12.field59.clearFiles(); // L: 1284
		World.field813.clearFiles(); // L: 1285
		class178.compass = null; // L: 1287
		class1.redHintArrowSprite = null; // L: 1288
		class47.mapSceneSprites = null; // L: 1289
		class85.field1056 = null; // L: 1290
		class156.field1746 = null; // L: 1291
		class191.field1979 = null; // L: 1292
		WorldMapCacheName.field3065 = null; // L: 1293
		class521.field5130 = null; // L: 1294
		class47.field331 = null; // L: 1295
		HealthBar.scrollBarSprites = null; // L: 1296
		GameEngine.field190 = null; // L: 1297
		class173.scene.clear(); // L: 1299

		int var3;
		for (var3 = 0; var3 < 4; ++var3) { // L: 1300
			Client.collisionMaps[var3].clear();
		}

		ScriptFrame.worldMap = null; // L: 1301
		class90.method2339(0, 0); // L: 1302
		WorldMapDecorationType.method6641(); // L: 1303
		Client.playingJingle = false; // L: 1304
		class238.method4845(); // L: 1305
		if (Timer.pcmPlayer1 != null) { // L: 1306
			Timer.pcmPlayer1.shutdown();
		}

		class101.field1332.method6897(); // L: 1307
		synchronized(ArchiveDiskActionHandler.field4240) { // L: 1309
			if (ArchiveDiskActionHandler.field4239 != 0) { // L: 1310
				ArchiveDiskActionHandler.field4239 = 1; // L: 1311
				ArchiveDiskActionHandler.field4236 = true; // L: 1312

				try {
					ArchiveDiskActionHandler.field4240.wait(); // L: 1314
				} catch (InterruptedException var5) { // L: 1316
				}
			}
		}

		if (class327.urlRequester != null) { // L: 1320
			class327.urlRequester.close(); // L: 1321
		}

		try {
			JagexCache.JagexCache_dat2File.close(); // L: 1325

			for (var3 = 0; var3 < class160.field1764; ++var3) { // L: 1326
				GrandExchangeOfferOwnWorldComparator.JagexCache_idxFiles[var3].close();
			}

			JagexCache.field1849.close(); // L: 1327
			JagexCache.JagexCache_randomDat.close(); // L: 1328
		} catch (Exception var7) { // L: 1330
		}

		JagexCache.JagexCache_dat2File = null; // L: 1332
		JagexCache.field1849 = null; // L: 1333
		GrandExchangeOfferOwnWorldComparator.JagexCache_idxFiles = null; // L: 1334
		FileSystem.FileSystem_cacheFiles.clear(); // L: 1336
		class419.field4580 = null; // L: 1338
		Client.archiveLoaders.clear(); // L: 1339
		Client.field797 = 0; // L: 1340
		class101.field1332 = new class359(); // L: 1341
		class327.urlRequester = new class113(class415.client.field635, 215); // L: 1342

		try {
			class197.method3886("oldschool", MouseHandler.field224, class372.field4352.name, 0, 22); // L: 1344
		} catch (IOException var4) { // L: 1346
			throw new RuntimeException(var4); // L: 1347
		}

		class419.field4580 = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.field1849, 500000); // L: 1349
		GameEngine.taskHandler = new TaskHandler(); // L: 1350
		Client.field530 = class92.field1153; // L: 1351
		AttackOption.method2723(0); // L: 1352
	} // L: 1353
}
