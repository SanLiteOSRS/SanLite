import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mz")
public final class class324 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILpv;Lmx;B)V",
		garbageValue = "-113"
	)
	static void method6325(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction(); // L: 30
		var3.type = 1; // L: 31
		var3.key = (long)var0; // L: 32
		var3.archiveDisk = var1; // L: 33
		var3.archive = var2; // L: 34
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 35
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3); // L: 36
		} // L: 37

		Skills.method6322(); // L: 38
	} // L: 39
}
