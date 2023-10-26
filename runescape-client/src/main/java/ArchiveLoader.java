import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1245617751
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -669731983
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Lok;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0; // L: 9
		this.archive = var1; // L: 12
		this.groupCount = var1.getGroupCount(); // L: 13
	} // L: 14

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1549334673"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0; // L: 17

		for (int var1 = 0; var1 < this.groupCount; ++var1) { // L: 18
			if (!this.archive.method6867(var1) || this.archive.method6866(var1)) {
				++this.loadedCount; // L: 19
			}
		}

		return this.loadedCount >= this.groupCount; // L: 21
	}
}
