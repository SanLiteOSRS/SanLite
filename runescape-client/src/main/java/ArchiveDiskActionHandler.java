import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ny")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	static final NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1130988653
	)
	public static int field4239;
	@ObfuscatedName("aw")
	public static boolean field4236;
	@ObfuscatedName("ay")
	public static Object field4240;
	@ObfuscatedName("ap")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;
	@ObfuscatedName("ar")
	static String[] field4241;
	@ObfuscatedName("hw")
	static String field4242;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque(); // L: 9
		ArchiveDiskActionHandler_responseQueue = new NodeDeque(); // L: 10
		field4239 = 0; // L: 11
		field4236 = false; // L: 12
		field4240 = new Object(); // L: 13
	}

	ArchiveDiskActionHandler() {
	} // L: 18

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 78
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last(); // L: 79
				} // L: 80

				if (var1 != null) { // L: 81
					if (var1.type == 0) { // L: 82
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length); // L: 83
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 84
							var1.remove(); // L: 85
						} // L: 86
					} else if (var1.type == 1) { // L: 88
						var1.data = var1.archiveDisk.read((int)var1.key); // L: 89
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 90
							ArchiveDiskActionHandler_responseQueue.addFirst(var1); // L: 91
						} // L: 92
					}

					synchronized(field4240) { // L: 94
						if ((field4236 || field4239 <= 1) && ArchiveDiskActionHandler_requestQueue.method7051()) { // L: 95
							field4239 = 0; // L: 96
							field4240.notifyAll(); // L: 97
							return; // L: 98
						}

						field4239 = 600; // L: 100
					}
				} else {
					class9.method82(100L); // L: 104
					synchronized(field4240) { // L: 105
						if ((field4236 || field4239 <= 1) && ArchiveDiskActionHandler_requestQueue.method7051()) { // L: 106
							field4239 = 0; // L: 107
							field4240.notifyAll(); // L: 108
							return; // L: 109
						}

						--field4239; // L: 111
					}
				}
			}
		} catch (Exception var13) { // L: 116
			MusicPatchNode.RunException_sendStackTrace((String)null, var13); // L: 117
		}
	} // L: 119
}
