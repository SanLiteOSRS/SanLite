import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lz")
@Implements("NetFileRequest")
public class NetFileRequest extends DualNode {
	@ObfuscatedName("a")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("archive")
	public Archive archive;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1369001765
	)
	@Export("crc")
	public int crc;
	@ObfuscatedName("f")
	@Export("padding")
	public byte padding;

	NetFileRequest() {
	} // L: 10

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/io/File;",
		garbageValue = "-681286598"
	)
	@Export("getFile")
	public static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) { // L: 22
			throw new RuntimeException("");
		} else {
			File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0); // L: 23
			if (var1 != null) { // L: 24
				return var1;
			} else {
				File var2 = new File(FileSystem.FileSystem_cacheDir, var0); // L: 25
				RandomAccessFile var3 = null; // L: 26

				try {
					File var4 = new File(var2.getParent()); // L: 28
					if (!var4.exists()) { // L: 29
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw"); // L: 30
						int var5 = var3.read(); // L: 31
						var3.seek(0L); // L: 32
						var3.write(var5); // L: 33
						var3.seek(0L); // L: 34
						var3.close(); // L: 35
						FileSystem.FileSystem_cacheFiles.put(var0, var2); // L: 36
						return var2; // L: 37
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) { // L: 41
							var3.close(); // L: 42
							var3 = null; // L: 43
						}
					} catch (Exception var7) { // L: 46
					}

					throw new RuntimeException(); // L: 48
				}
			}
		}
	}
}
