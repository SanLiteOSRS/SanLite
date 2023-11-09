import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
public abstract class class142 extends Node {
	class142() {
	} // L: 68

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;B)V",
		garbageValue = "59"
	)
	abstract void vmethod3381(Buffer var1);

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfs;B)V",
		garbageValue = "-72"
	)
	abstract void vmethod3382(ClanSettings var1);

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1403198759"
	)
	static boolean method3125() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1533
			while (Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1534
				ArchiveLoader var0 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone); // L: 1535
				if (!var0.isLoaded()) {
					return false; // L: 1536
				}

				++Client.archiveLoadersDone; // L: 1537
			}

			return true; // L: 1539
		} else {
			return true; // L: 1538
		}
	}
}
