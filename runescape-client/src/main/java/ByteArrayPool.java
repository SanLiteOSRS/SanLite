import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qq")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("ab")
	static final Object field4577;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 467495095
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 563797191
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1219240193
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1638723491
	)
	static int field4573;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1728453825
	)
	static int field4574;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 791946105
	)
	static int field4583;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 969672835
	)
	static int field4578;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1622704261
	)
	static int field4585;
	@ObfuscatedName("as")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("ay")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("ak")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("aj")
	static byte[][] field4589;
	@ObfuscatedName("aw")
	static ArrayList field4590;

	static {
		field4577 = new Object(); // L: 13
		ByteArrayPool_smallCount = 0; // L: 14
		ByteArrayPool_mediumCount = 0; // L: 15
		ByteArrayPool_largeCount = 0; // L: 16
		field4573 = 0; // L: 17
		field4574 = 1000; // L: 18
		field4583 = 250; // L: 19
		field4578 = 100; // L: 20
		field4585 = 50; // L: 21
		ByteArrayPool_small = new byte[1000][]; // L: 22
		ByteArrayPool_medium = new byte[250][]; // L: 23
		ByteArrayPool_large = new byte[100][]; // L: 24
		field4589 = new byte[50][]; // L: 25
		field4590 = new ArrayList(); // L: 29
		Renderable.method5509(); // L: 32
		new HashMap();
	} // L: 37

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1234231525"
	)
	static void method7920() {
		if (class176.varcs.hasUnwrittenChanges()) { // L: 1236
			class176.varcs.write();
		}

		class53.method1110(); // L: 1237
		if (Message.mouseRecorder != null) { // L: 1238
			Message.mouseRecorder.isRunning = false;
		}

		Message.mouseRecorder = null; // L: 1239
		Client.packetWriter.close(); // L: 1240
		if (GameEngine.taskHandler != null) { // L: 1241
			try {
				GameEngine.taskHandler.close(); // L: 1243
			} catch (Exception var3) { // L: 1245
			}
		}

		GameEngine.taskHandler = null; // L: 1247
		ObjectSound.method1980(); // L: 1248
		class182.method3664(); // L: 1249
		class36.scene.clear(); // L: 1250

		for (int var1 = 0; var1 < 4; ++var1) { // L: 1251
			Client.collisionMaps[var1].clear();
		}

		class187.worldMap = null; // L: 1252
		WorldMapManager.method4769(0, 0); // L: 1253
		class472.method8564(); // L: 1254
		Client.playingJingle = false; // L: 1255
		WorldMapSectionType.method4888(); // L: 1256
		if (MusicPatchPcmStream.pcmPlayer0 != null) { // L: 1257
			MusicPatchPcmStream.pcmPlayer0.shutdown();
		}

		WorldMapSectionType.field2556.method7049(); // L: 1258
		class227.method4406(); // L: 1259
		if (class60.urlRequester != null) { // L: 1260
			class60.urlRequester.close(); // L: 1261
		}

		HealthBarDefinition.method3654(); // L: 1263
		JagexCache.JagexCache_dat2File = null; // L: 1264
		JagexCache.JagexCache_idx255File = null; // L: 1265
		class25.JagexCache_idxFiles = null; // L: 1266
		class169.method3518(); // L: 1267
		class302.field3118 = null; // L: 1268
		Client.archiveLoaders.clear(); // L: 1269
		Client.field645 = 0; // L: 1270
		WorldMapSectionType.field2556 = new class371(); // L: 1271
		class60.urlRequester = new class113(SpriteMask.client.field532, 218); // L: 1272

		try {
			class339.method6310("oldschool", ItemLayer.field2655, class191.field1978.name, 0, 23); // L: 1274
		} catch (IOException var2) { // L: 1276
			throw new RuntimeException(var2); // L: 1277
		}

		class302.field3118 = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 1279
		GameEngine.taskHandler = new TaskHandler(); // L: 1280
		SpriteMask.client.method517(); // L: 1281
		Client.field517 = class92.field1136; // L: 1282
		WorldMapSection2.method4516(0); // L: 1283
	} // L: 1284
}
