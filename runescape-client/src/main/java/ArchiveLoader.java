import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("ve")
	static List field1055;
	@ObfuscatedName("gl")
	static String field1054;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 58353501
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1629974393
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Lov;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0; // L: 9
		this.archive = var1; // L: 12
		this.groupCount = var1.getGroupCount(); // L: 13
	} // L: 14

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "27"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0; // L: 17

		for (int var1 = 0; var1 < this.groupCount; ++var1) { // L: 18
			if (!this.archive.method6938(var1) || this.archive.method6912(var1)) {
				++this.loadedCount; // L: 19
			}
		}

		return this.loadedCount >= this.groupCount; // L: 21
	}
}
