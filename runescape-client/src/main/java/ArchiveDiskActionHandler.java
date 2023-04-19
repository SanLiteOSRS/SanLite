import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ns")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	public static NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	public static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1248352937
	)
	static int field4196;
	@ObfuscatedName("ac")
	@Export("ArchiveDiskActionHandler_lock")
	static Object ArchiveDiskActionHandler_lock;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque(); // L: 9
		ArchiveDiskActionHandler_responseQueue = new NodeDeque(); // L: 10
		field4196 = 0; // L: 11
		ArchiveDiskActionHandler_lock = new Object();
	} // L: 12

	ArchiveDiskActionHandler() {
	} // L: 15

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 57
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last(); // L: 58
				} // L: 59

				if (var1 != null) { // L: 60
					if (var1.type == 0) { // L: 61
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length); // L: 62
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 63
							var1.remove(); // L: 64
						} // L: 65
					} else if (var1.type == 1) { // L: 67
						var1.data = var1.archiveDisk.read((int)var1.key); // L: 68
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 69
							ArchiveDiskActionHandler_responseQueue.addFirst(var1); // L: 70
						} // L: 71
					}

					synchronized(ArchiveDiskActionHandler_lock) { // L: 73
						if (field4196 <= 1) { // L: 74
							field4196 = 0; // L: 75
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 76
							return; // L: 77
						}

						field4196 = 600; // L: 79
					}
				} else {
					PlayerComposition.method6084(100L); // L: 83
					synchronized(ArchiveDiskActionHandler_lock) { // L: 84
						if (field4196 <= 1) { // L: 85
							field4196 = 0; // L: 86
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 87
							return; // L: 88
						}

						--field4196; // L: 90
					}
				}
			}
		} catch (Exception var13) { // L: 95
			class387.RunException_sendStackTrace((String)null, var13); // L: 96
		}
	} // L: 98

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1319912203"
	)
	static String method6619(int var0) {
		return "<img=" + var0 + ">"; // L: 18
	}
}
