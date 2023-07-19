import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
public class class200 extends DualNode {
	static {
		new EvictingDualNodeHashTable(64); // L: 9
	} // L: 10

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "952671592"
	)
	public static void method3929() {
		while (true) {
			ArchiveDiskAction var0;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 53
				var0 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast(); // L: 54
			} // L: 55

			if (var0 == null) {
				return; // L: 56
			}

			var0.archive.load(var0.archiveDisk, (int)var0.key, var0.data, false); // L: 57
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfz;",
		garbageValue = "1484697934"
	)
	static class131[] method3927() {
		return new class131[]{class131.field1556, class131.field1554, class131.field1557, class131.field1553, class131.field1555, class131.field1558}; // L: 25
	}
}
