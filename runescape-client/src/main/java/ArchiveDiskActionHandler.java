import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("le")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	static NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1401449583
	)
	static int field3991;
	@ObfuscatedName("u")
	@Export("ArchiveDiskActionHandler_lock")
	static Object ArchiveDiskActionHandler_lock;
	@ObfuscatedName("c")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque(); // L: 9
		ArchiveDiskActionHandler_responseQueue = new NodeDeque(); // L: 10
		field3991 = 0; // L: 11
		ArchiveDiskActionHandler_lock = new Object();
	} // L: 12

	ArchiveDiskActionHandler() {
	} // L: 15

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 72
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last(); // L: 73
				} // L: 74

				if (var1 != null) { // L: 75
					if (var1.type == 0) { // L: 76
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length); // L: 77
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 78
							var1.remove(); // L: 79
						} // L: 80
					} else if (var1.type == 1) { // L: 82
						var1.data = var1.archiveDisk.read((int)var1.key); // L: 83
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 84
							ArchiveDiskActionHandler_responseQueue.addFirst(var1); // L: 85
						} // L: 86
					}

					synchronized(ArchiveDiskActionHandler_lock) { // L: 88
						if (field3991 <= 1) { // L: 89
							field3991 = 0; // L: 90
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 91
							return; // L: 92
						}

						field3991 = 600; // L: 94
					}
				} else {
					WorldMapDecoration.method4967(100L); // L: 98
					synchronized(ArchiveDiskActionHandler_lock) { // L: 99
						if (field3991 <= 1) { // L: 100
							field3991 = 0; // L: 101
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 102
							return; // L: 103
						}

						--field3991; // L: 105
					}
				}
			}
		} catch (Exception var13) { // L: 110
			class359.RunException_sendStackTrace((String)null, var13); // L: 111
		}
	} // L: 113

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "37815092"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (class144.World_request == null) { // L: 31
				class144.World_request = class152.urlRequester.request(new URL(GrandExchangeOfferOwnWorldComparator.field479));
			} else if (class144.World_request.isDone()) { // L: 33
				byte[] var0 = class144.World_request.getResponse(); // L: 34
				Buffer var1 = new Buffer(var0); // L: 35
				var1.readInt(); // L: 36
				World.World_count = var1.readUnsignedShort(); // L: 37
				class93.World_worlds = new World[World.World_count]; // L: 38

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) { // L: 39 47
					var3 = class93.World_worlds[var2] = new World(); // L: 40
					var3.id = var1.readUnsignedShort(); // L: 41
					var3.properties = var1.readInt(); // L: 42
					var3.host = var1.readStringCp1252NullTerminated(); // L: 43
					var3.activity = var1.readStringCp1252NullTerminated(); // L: 44
					var3.location = var1.readUnsignedByte(); // L: 45
					var3.population = var1.readShort(); // L: 46
				}

				WallObject.sortWorlds(class93.World_worlds, 0, class93.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 49
				class144.World_request = null; // L: 50
				return true; // L: 51
			}
		} catch (Exception var4) { // L: 55
			var4.printStackTrace(); // L: 56
			class144.World_request = null; // L: 57
		}

		return false; // L: 59
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;S)I",
		garbageValue = "-5302"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length(); // L: 132
		int var2 = 0; // L: 133

		for (int var3 = 0; var3 < var1; ++var3) { // L: 134
			var2 = (var2 << 5) - var2 + Calendar.charToByteCp1252(var0.charAt(var3));
		}

		return var2; // L: 135
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-632726805"
	)
	static void method5800(int var0, int var1) {
		int[] var2 = new int[9]; // L: 1586

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 1587
			int var4 = var3 * 32 + 15 + 128; // L: 1588
			int var5 = class152.method3152(var4); // L: 1589
			int var6 = Rasterizer3D.Rasterizer3D_sine[var4]; // L: 1590
			var5 = HitSplatDefinition.method3637(var5, var1); // L: 1591
			var2[var3] = var6 * var5 >> 16; // L: 1592
		}

		Scene.Scene_buildVisiblityMap(var2, 500, 800, var0 * 334 / var1, 334); // L: 1594
	} // L: 1595
}
