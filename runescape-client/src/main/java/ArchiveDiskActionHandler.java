import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("li")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	static NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2016619953
	)
	public static int field4199;
	@ObfuscatedName("s")
	@Export("ArchiveDiskActionHandler_lock")
	public static Object ArchiveDiskActionHandler_lock;
	@ObfuscatedName("z")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque(); // L: 9
		ArchiveDiskActionHandler_responseQueue = new NodeDeque(); // L: 10
		field4199 = 0; // L: 11
		ArchiveDiskActionHandler_lock = new Object();
	} // L: 12

	ArchiveDiskActionHandler() {
	} // L: 15

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 68
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last(); // L: 69
				} // L: 70

				if (var1 != null) { // L: 71
					if (var1.type == 0) { // L: 72
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length); // L: 73
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 74
							var1.remove(); // L: 75
						} // L: 76
					} else if (var1.type == 1) { // L: 78
						var1.data = var1.archiveDisk.read((int)var1.key); // L: 79
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 80
							ArchiveDiskActionHandler_responseQueue.addFirst(var1); // L: 81
						} // L: 82
					}

					synchronized(ArchiveDiskActionHandler_lock) { // L: 84
						if (field4199 <= 1) { // L: 85
							field4199 = 0; // L: 86
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 87
							return; // L: 88
						}

						field4199 = 600; // L: 90
					}
				} else {
					Clock.method3567(100L); // L: 94
					synchronized(ArchiveDiskActionHandler_lock) { // L: 95
						if (field4199 <= 1) { // L: 96
							field4199 = 0; // L: 97
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 98
							return; // L: 99
						}

						--field4199; // L: 101
					}
				}
			}
		} catch (Exception var13) { // L: 106
			class121.RunException_sendStackTrace((String)null, var13); // L: 107
		}
	} // L: 109

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1911527843"
	)
	public static int method6471(int var0, int var1, int var2) {
		int var3 = SoundCache.method871(var2 - var1 + 1); // L: 39
		var3 <<= var1; // L: 40
		return var0 & ~var3; // L: 41
	}
}
