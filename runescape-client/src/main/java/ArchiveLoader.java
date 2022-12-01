import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("p")
	public static short[][] field1016;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1490058667
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1809836531
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Llx;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0; // L: 9
		this.archive = var1; // L: 12
		this.groupCount = var1.getGroupCount(); // L: 13
	} // L: 14

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-847453577"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0; // L: 17

		for (int var1 = 0; var1 < this.groupCount; ++var1) { // L: 18
			if (!this.archive.method6298(var1) || this.archive.method6304(var1)) {
				++this.loadedCount; // L: 19
			}
		}

		return this.loadedCount >= this.groupCount; // L: 21
	}
}
