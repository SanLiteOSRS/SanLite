import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nl")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	static final NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1640815555
	)
	static int field4246;
	@ObfuscatedName("am")
	static boolean field4247;
	@ObfuscatedName("as")
	static Object field4248;
	@ObfuscatedName("aj")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque(); // L: 9
		ArchiveDiskActionHandler_responseQueue = new NodeDeque(); // L: 10
		field4246 = 0; // L: 11
		field4247 = false; // L: 12
		field4248 = new Object(); // L: 13
	}

	ArchiveDiskActionHandler() {
	} // L: 18

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 60
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last(); // L: 61
				} // L: 62

				if (var1 != null) { // L: 63
					if (var1.type == 0) { // L: 64
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length); // L: 65
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 66
							var1.remove(); // L: 67
						} // L: 68
					} else if (var1.type == 1) {
						var1.data = var1.archiveDisk.read((int)var1.key); // L: 71
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 72
							ArchiveDiskActionHandler_responseQueue.addFirst(var1); // L: 73
						} // L: 74
					}

					synchronized(field4248) { // L: 76
						if ((field4247 || field4246 <= 1) && ArchiveDiskActionHandler_requestQueue.method7036()) { // L: 77
							field4246 = 0; // L: 78
							field4248.notifyAll(); // L: 79
							return; // L: 80
						}

						field4246 = 600; // L: 82
					}
				} else {
					class13.method180(100L); // L: 86
					synchronized(field4248) { // L: 87
						if ((field4247 || field4246 <= 1) && ArchiveDiskActionHandler_requestQueue.method7036()) { // L: 88
							field4246 = 0; // L: 89
							field4248.notifyAll(); // L: 90
							return; // L: 91
						}

						--field4246; // L: 93
					}
				}
			}
		} catch (Exception var13) { // L: 98
			class317.RunException_sendStackTrace((String)null, var13); // L: 99
		}
	} // L: 101

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "707019941"
	)
	public static void method6684() {
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear(); // L: 69
	} // L: 70
}
