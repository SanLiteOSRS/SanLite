import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Deprecated
@ObfuscatedName("lf")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	public static NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	public static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1925260575
	)
	static int field4173;
	@ObfuscatedName("x")
	@Export("ArchiveDiskActionHandler_lock")
	static Object ArchiveDiskActionHandler_lock;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque(); // L: 9
		ArchiveDiskActionHandler_responseQueue = new NodeDeque(); // L: 10
		field4173 = 0; // L: 11
		ArchiveDiskActionHandler_lock = new Object();
	} // L: 12

	ArchiveDiskActionHandler() {
	} // L: 15

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 45
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last(); // L: 46
				} // L: 47

				if (var1 != null) { // L: 48
					if (var1.type == 0) { // L: 49
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length); // L: 50
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 51
							var1.remove(); // L: 52
						} // L: 53
					} else if (var1.type == 1) { // L: 55
						var1.data = var1.archiveDisk.read((int)var1.key); // L: 56
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 57
							ArchiveDiskActionHandler_responseQueue.addFirst(var1); // L: 58
						} // L: 59
					}

					synchronized(ArchiveDiskActionHandler_lock) { // L: 61
						if (field4173 <= 1) { // L: 62
							field4173 = 0; // L: 63
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 64
							return; // L: 65
						}

						field4173 = 600; // L: 67
					}
				} else {
					class12.method157(100L); // L: 71
					synchronized(ArchiveDiskActionHandler_lock) { // L: 72
						if (field4173 <= 1) { // L: 73
							field4173 = 0; // L: 74
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 75
							return; // L: 76
						}

						--field4173; // L: 78
					}
				}
			}
		} catch (Exception var13) { // L: 83
			class132.RunException_sendStackTrace((String)null, var13); // L: 84
		}
	} // L: 86
}
