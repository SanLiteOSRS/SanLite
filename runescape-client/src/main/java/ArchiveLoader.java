import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1815953183
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1415768957
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Loz;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0; // L: 9
		this.archive = var1; // L: 12
		this.groupCount = var1.getGroupCount(); // L: 13
	} // L: 14

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2115421526"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0; // L: 17

		for (int var1 = 0; var1 < this.groupCount; ++var1) { // L: 18
			if (!this.archive.method6982(var1) || this.archive.method6993(var1)) {
				++this.loadedCount; // L: 19
			}
		}

		return this.loadedCount >= this.groupCount; // L: 21
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Low;I)V",
		garbageValue = "-1954637396"
	)
	public static void method2326(AbstractArchive var0) {
		class419.FloorOverlayDefinition_archive = var0; // L: 24
	} // L: 25
}
