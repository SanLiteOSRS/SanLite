import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "Lqz;"
	)
	static AbstractSocket field1037;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1189006953
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1731597009
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Lny;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0; // L: 9
		this.archive = var1; // L: 12
		this.groupCount = var1.getGroupCount(); // L: 13
	} // L: 14

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-58994437"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0; // L: 17

		for (int var1 = 0; var1 < this.groupCount; ++var1) { // L: 18
			if (!this.archive.method6657(var1) || this.archive.method6685(var1)) {
				++this.loadedCount; // L: 19
			}
		}

		return this.loadedCount >= this.groupCount; // L: 21
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;ZB)Z",
		garbageValue = "-31"
	)
	static boolean method2217(File var0, boolean var1) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(var0, "rw"); // L: 239
			int var3 = var2.read(); // L: 240
			var2.seek(0L); // L: 241
			var2.write(var3); // L: 242
			var2.seek(0L); // L: 243
			var2.close(); // L: 244
			if (var1) { // L: 245
				var0.delete();
			}

			return true; // L: 246
		} catch (Exception var4) { // L: 248
			return false; // L: 249
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1476778115"
	)
	static int method2220(int var0, int var1) {
		for (int var2 = 0; var2 < 8; ++var2) { // L: 1207
			if (var1 <= var0 + 30) { // L: 1208
				return var2; // L: 1209
			}

			var0 += 30; // L: 1211
			var0 += var2 != 1 && var2 != 3 ? 5 : 20; // L: 1212
		}

		return 0; // L: 1214
	}
}
