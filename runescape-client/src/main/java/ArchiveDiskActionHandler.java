import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	static NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 991905743
	)
	public static int field4237;
	@ObfuscatedName("ab")
	@Export("ArchiveDiskActionHandler_lock")
	public static Object ArchiveDiskActionHandler_lock;
	@ObfuscatedName("at")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque(); // L: 9
		ArchiveDiskActionHandler_responseQueue = new NodeDeque(); // L: 10
		field4237 = 0; // L: 11
		ArchiveDiskActionHandler_lock = new Object();
	} // L: 12

	ArchiveDiskActionHandler() {
	} // L: 15

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 54
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last(); // L: 55
				} // L: 56

				if (var1 != null) { // L: 57
					if (var1.type == 0) { // L: 58
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length); // L: 59
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 60
							var1.remove(); // L: 61
						} // L: 62
					} else if (var1.type == 1) { // L: 64
						var1.data = var1.archiveDisk.read((int)var1.key); // L: 65
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 66
							ArchiveDiskActionHandler_responseQueue.addFirst(var1); // L: 67
						} // L: 68
					}

					synchronized(ArchiveDiskActionHandler_lock) { // L: 70
						if (field4237 <= 1) { // L: 71
							field4237 = 0; // L: 72
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 73
							return; // L: 74
						}

						field4237 = 600; // L: 76
					}
				} else {
					VarpDefinition.method3559(100L); // L: 80
					synchronized(ArchiveDiskActionHandler_lock) { // L: 81
						if (field4237 <= 1) { // L: 82
							field4237 = 0; // L: 83
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 84
							return; // L: 85
						}

						--field4237; // L: 87
					}
				}
			}
		} catch (Exception var13) { // L: 92
			LoginPacket.RunException_sendStackTrace((String)null, var13); // L: 93
		}
	} // L: 95

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IS)Lmo;",
		garbageValue = "207"
	)
	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16; // L: 225
		int var2 = var0 & 65535; // L: 226
		if (UserComparator6.Widget_interfaceComponents[var1] == null || UserComparator6.Widget_interfaceComponents[var1][var2] == null) { // L: 227
			boolean var3 = WorldMapAreaData.loadInterface(var1); // L: 228
			if (!var3) { // L: 229
				return null;
			}
		}

		return UserComparator6.Widget_interfaceComponents[var1][var2]; // L: 231
	}
}
