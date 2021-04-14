import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lju;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	public static NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lju;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	public static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 458683291
	)
	public static int field3239;
	@ObfuscatedName("p")
	@Export("ArchiveDiskActionHandler_lock")
	public static Object ArchiveDiskActionHandler_lock;
	@ObfuscatedName("b")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "Loh;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		signature = "[Loh;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque();
		ArchiveDiskActionHandler_responseQueue = new NodeDeque();
		field3239 = 0;
		ArchiveDiskActionHandler_lock = new Object();
	}

	ArchiveDiskActionHandler() {
	}

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) {
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last();
				}

				if (var1 != null) {
					if (var1.type == 0) {
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length);
						synchronized(ArchiveDiskActionHandler_requestQueue) {
							var1.remove();
						}
					} else if (var1.type == 1) {
						var1.data = var1.archiveDisk.read((int)var1.key);
						synchronized(ArchiveDiskActionHandler_requestQueue) {
							ArchiveDiskActionHandler_responseQueue.addFirst(var1);
						}
					}

					synchronized(ArchiveDiskActionHandler_lock) {
						if (field3239 <= 1) {
							field3239 = 0;
							ArchiveDiskActionHandler_lock.notifyAll();
							return;
						}

						field3239 = 600;
					}
				} else {
					GrandExchangeEvent.method4625(100L);
					synchronized(ArchiveDiskActionHandler_lock) {
						if (field3239 <= 1) {
							field3239 = 0;
							ArchiveDiskActionHandler_lock.notifyAll();
							return;
						}

						--field3239;
					}
				}
			}
		} catch (Exception var13) {
			class223.RunException_sendStackTrace((String)null, var13);
		}
	}
}
