import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qj")
public class class441 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	public static final class441 field4748;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	static final class441 field4746;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1320051105
	)
	final int field4747;

	static {
		field4748 = new class441(1); // L: 5
		field4746 = new class441(0); // L: 6
	}

	class441(int var1) {
		this.field4747 = var1; // L: 10
	} // L: 11

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "430547706"
	)
	static void method7995() {
		Client.field788 = true; // L: 1241
		if (class130.varcs != null && class130.varcs.method2723()) { // L: 1242
			class130.varcs.write();
		}

		class254.method4939(); // L: 1243
		class16.method204(); // L: 1244
		if (Tiles.mouseRecorder != null) { // L: 1245
			Tiles.mouseRecorder.isRunning = false;
		}

		Tiles.mouseRecorder = null; // L: 1246
		Client.packetWriter.close(); // L: 1247
		if (class350.taskHandler != null) { // L: 1248
			try {
				class350.taskHandler.close(); // L: 1250
			} catch (Exception var3) { // L: 1252
			}
		}

		class350.taskHandler = null; // L: 1254
		class318.method5949(); // L: 1255
		class150.method3201(); // L: 1256
		if (LoginType.scene != null) { // L: 1257
			LoginType.scene.clear();
		}

		for (int var1 = 0; var1 < Client.collisionMaps.length; ++var1) { // L: 1258
			if (Client.collisionMaps[var1] != null) {
				Client.collisionMaps[var1].clear();
			}
		}

		ModeWhere.worldMap = null; // L: 1259
		class11.method108(0, 0); // L: 1260
		UserComparator5.method2897(); // L: 1261
		Client.playingJingle = false; // L: 1262
		Canvas.method294(); // L: 1263
		if (class144.pcmPlayer1 != null) { // L: 1264
			class144.pcmPlayer1.shutdown();
		}

		ChatChannel.field1023.method7078(); // L: 1265
		StructComposition.method4041(); // L: 1266
		if (class94.urlRequester != null) { // L: 1267
			class94.urlRequester.close(); // L: 1268
		}

		Archive.method6949(); // L: 1270
		JagexCache.JagexCache_dat2File = null; // L: 1271
		JagexCache.JagexCache_idx255File = null; // L: 1272
		UserComparator5.JagexCache_idxFiles = null; // L: 1273
		class200.method3823(); // L: 1274
		Decimator.field392 = null; // L: 1275
		Client.archiveLoaders.clear(); // L: 1276
		Client.field773 = 0; // L: 1277
		ChatChannel.field1023 = new class379(); // L: 1278
		class94.urlRequester = new class114(UrlRequest.client.field790, 221); // L: 1279

		try {
			class498.method8662("oldschool", class430.field4669, HealthBar.field1325.name, 0, 23); // L: 1281
		} catch (IOException var2) { // L: 1283
			throw new RuntimeException(var2); // L: 1284
		}

		Decimator.field392 = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 1286
		class350.taskHandler = new TaskHandler(); // L: 1287
		UrlRequest.client.method591(); // L: 1288
		class427.method7851(class93.field1152); // L: 1289
		FaceNormal.method4886(0); // L: 1290
	} // L: 1291
}
