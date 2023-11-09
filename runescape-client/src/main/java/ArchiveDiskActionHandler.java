import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	public static NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	public static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -2145355515
	)
	public static int field3970;
	@ObfuscatedName("v")
	@Export("ArchiveDiskActionHandler_lock")
	public static Object ArchiveDiskActionHandler_lock;
	@ObfuscatedName("c")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque(); // L: 9
		ArchiveDiskActionHandler_responseQueue = new NodeDeque(); // L: 10
		field3970 = 0; // L: 11
		ArchiveDiskActionHandler_lock = new Object();
	} // L: 12

	ArchiveDiskActionHandler() {
	} // L: 15

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 61
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last(); // L: 62
				} // L: 63

				if (var1 != null) { // L: 64
					if (var1.type == 0) { // L: 65
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length); // L: 66
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 67
							var1.remove(); // L: 68
						} // L: 69
					} else if (var1.type == 1) { // L: 71
						var1.data = var1.archiveDisk.read((int)var1.key); // L: 72
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 73
							ArchiveDiskActionHandler_responseQueue.addFirst(var1); // L: 74
						} // L: 75
					}

					synchronized(ArchiveDiskActionHandler_lock) { // L: 77
						if (field3970 <= 1) { // L: 78
							field3970 = 0; // L: 79
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 80
							return; // L: 81
						}

						field3970 = 600; // L: 83
					}
				} else {
					class144.method3006(100L); // L: 87
					synchronized(ArchiveDiskActionHandler_lock) { // L: 88
						if (field3970 <= 1) { // L: 89
							field3970 = 0; // L: 90
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 91
							return; // L: 92
						}

						--field3970;
					}
				}
			}
		} catch (Exception var13) { // L: 99
			class33.RunException_sendStackTrace((String)null, var13); // L: 100
		}
	} // L: 102

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "2006927330"
	)
	@Export("ByteArrayPool_getArray")
	public static synchronized byte[] ByteArrayPool_getArray(int var0) {
		return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false); // L: 94
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lls;II)Z",
		garbageValue = "853644846"
	)
	static boolean method5708(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1); // L: 220
		if (var2 == null) { // L: 221
			return false;
		} else {
			class117.SpriteBuffer_decode(var2); // L: 222
			return true; // L: 223
		}
	}
}
