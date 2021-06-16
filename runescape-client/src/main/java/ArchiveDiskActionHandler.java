import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	static NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 264350285
	)
	static int field3557;
	@ObfuscatedName("y")
	@Export("ArchiveDiskActionHandler_lock")
	static Object ArchiveDiskActionHandler_lock;
	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque();
		ArchiveDiskActionHandler_responseQueue = new NodeDeque();
		field3557 = 0;
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
						if (field3557 <= 1) {
							field3557 = 0;
							ArchiveDiskActionHandler_lock.notifyAll();
							return;
						}

						field3557 = 600;
					}
				} else {
					class18.method272(100L);
					synchronized(ArchiveDiskActionHandler_lock) {
						if (field3557 <= 1) {
							field3557 = 0;
							ArchiveDiskActionHandler_lock.notifyAll();
							return;
						}

						--field3557;
					}
				}
			}
		} catch (Exception var13) {
			FriendsChatManager.RunException_sendStackTrace((String)null, var13);
		}
	}
}
