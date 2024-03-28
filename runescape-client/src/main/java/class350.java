import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ne")
public class class350 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lgd;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I[BLra;B)V",
		garbageValue = "38"
	)
	static void method6804(int var0, byte[] var1, ArchiveDisk var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction(); // L: 21
		var3.type = 0; // L: 22
		var3.key = (long)var0; // L: 23
		var3.data = var1; // L: 24
		var3.archiveDisk = var2; // L: 25
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 26
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3); // L: 27
		} // L: 28

		synchronized(ArchiveDiskActionHandler.field4365) { // L: 30
			if (ArchiveDiskActionHandler.field4360 == 0) { // L: 31
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 32
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 33
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start(); // L: 34
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5); // L: 35
			}

			ArchiveDiskActionHandler.field4360 = 600; // L: 37
			ArchiveDiskActionHandler.field4358 = false; // L: 38
		}
	} // L: 41
}
