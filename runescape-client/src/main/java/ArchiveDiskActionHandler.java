import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mp")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	static NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -762322715
	)
	static int field4162;
	@ObfuscatedName("ab")
	@Export("ArchiveDiskActionHandler_lock")
	static Object ArchiveDiskActionHandler_lock;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("ju")
	@ObfuscatedGetter(
		intValue = -1111209699
	)
	static int field4161;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque(); // L: 9
		ArchiveDiskActionHandler_responseQueue = new NodeDeque(); // L: 10
		field4162 = 0; // L: 11
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
						if (field4162 <= 1) { // L: 85
							field4162 = 0; // L: 86
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 87
							return; // L: 88
						}

						field4162 = 600; // L: 90
					}
				} else {
					Login.method2088(100L); // L: 94
					synchronized(ArchiveDiskActionHandler_lock) { // L: 95
						if (field4162 <= 1) { // L: 96
							field4162 = 0; // L: 97
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 98
							return; // L: 99
						}

						--field4162; // L: 101
					}
				}
			}
		} catch (Exception var13) { // L: 106
			class364.RunException_sendStackTrace((String)null, var13); // L: 107
		}
	} // L: 109
}
