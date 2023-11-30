import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ox")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	public static final NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	public static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -632476027
	)
	static int field4271;
	@ObfuscatedName("ao")
	static boolean field4274;
	@ObfuscatedName("ab")
	static Object field4272;
	@ObfuscatedName("au")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque(); // L: 9
		ArchiveDiskActionHandler_responseQueue = new NodeDeque(); // L: 10
		field4271 = 0; // L: 11
		field4274 = false; // L: 12
		field4272 = new Object(); // L: 13
	}

	ArchiveDiskActionHandler() {
	} // L: 18

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 47
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last(); // L: 48
				} // L: 49

				if (var1 != null) { // L: 50
					if (var1.type == 0) { // L: 51
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length); // L: 52
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 53
							var1.remove(); // L: 54
						} // L: 55
					} else if (var1.type == 1) { // L: 57
						var1.data = var1.archiveDisk.read((int)var1.key); // L: 58
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 59
							ArchiveDiskActionHandler_responseQueue.addFirst(var1); // L: 60
						} // L: 61
					}

					synchronized(field4272) { // L: 63
						if ((field4274 || field4271 <= 1) && ArchiveDiskActionHandler_requestQueue.method7235()) { // L: 64
							field4271 = 0; // L: 65
							field4272.notifyAll(); // L: 66
							return; // L: 67
						}

						field4271 = 600; // L: 69
					}
				} else {
					class219.method4260(100L); // L: 73
					synchronized(field4272) { // L: 74
						if ((field4274 || field4271 <= 1) && ArchiveDiskActionHandler_requestQueue.method7235()) { // L: 75
							field4271 = 0; // L: 76
							field4272.notifyAll(); // L: 77
							return; // L: 78
						}

						--field4271; // L: 80
					}
				}
			}
		} catch (Exception var13) { // L: 85
			GrandExchangeOfferWorldComparator.RunException_sendStackTrace((String)null, var13); // L: 86
		}
	} // L: 88
}
