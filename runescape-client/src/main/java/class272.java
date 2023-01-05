import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jb")
public class class272 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ILoi;Lln;I)V",
		garbageValue = "1655477466"
	)
	static void method5476(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction(); // L: 18
		var3.type = 1; // L: 19
		var3.key = (long)var0; // L: 20
		var3.archiveDisk = var1; // L: 21
		var3.archive = var2; // L: 22
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 23
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3); // L: 24
		} // L: 25

		class154.method3300(); // L: 26
	} // L: 27

	@ObfuscatedName("m")
	public static boolean method5474(long var0) {
		return (int)(var0 >>> 16 & 1L) == 1; // L: 60
	}

	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-677085282"
	)
	static void method5475(int var0) {
		Client.oculusOrbState = var0; // L: 12696
	} // L: 12697
}
