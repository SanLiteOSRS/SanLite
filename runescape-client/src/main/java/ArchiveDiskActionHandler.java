import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	public static NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	public static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1607301919
	)
	static int field4224;
	@ObfuscatedName("as")
	@Export("ArchiveDiskActionHandler_lock")
	static Object ArchiveDiskActionHandler_lock;
	@ObfuscatedName("ax")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque(); // L: 9
		ArchiveDiskActionHandler_responseQueue = new NodeDeque(); // L: 10
		field4224 = 0; // L: 11
		ArchiveDiskActionHandler_lock = new Object();
	} // L: 12

	ArchiveDiskActionHandler() {
	} // L: 15

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 63
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last(); // L: 64
				} // L: 65

				if (var1 != null) { // L: 66
					if (var1.type == 0) { // L: 67
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length); // L: 68
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 69
							var1.remove(); // L: 70
						} // L: 71
					} else if (var1.type == 1) { // L: 73
						var1.data = var1.archiveDisk.read((int)var1.key); // L: 74
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 75
							ArchiveDiskActionHandler_responseQueue.addFirst(var1); // L: 76
						} // L: 77
					}

					synchronized(ArchiveDiskActionHandler_lock) { // L: 79
						if (field4224 <= 1) { // L: 80
							field4224 = 0; // L: 81
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 82
							return; // L: 83
						}

						field4224 = 600; // L: 85
					}
				} else {
					GroundObject.method4357(100L); // L: 89
					synchronized(ArchiveDiskActionHandler_lock) { // L: 90
						if (field4224 <= 1) { // L: 91
							field4224 = 0; // L: 92
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 93
							return; // L: 94
						}

						--field4224; // L: 96
					}
				}
			}
		} catch (Exception var13) { // L: 101
			class260.RunException_sendStackTrace((String)null, var13); // L: 102
		}
	} // L: 104
}
