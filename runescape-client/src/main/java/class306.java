import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
public class class306 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("ItemComposition_modelArchive")
	static AbstractArchive ItemComposition_modelArchive;

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/io/File;",
		garbageValue = "-1827228593"
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

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(Lkd;I)Lkd;",
		garbageValue = "61354082"
	)
	static Widget method6317(Widget var0) {
		Widget var2 = var0; // L: 12053
		int var4 = Clock.getWidgetFlags(var0); // L: 12056
		int var3 = var4 >> 17 & 7; // L: 12058
		int var5 = var3; // L: 12060
		Widget var1;
		if (var3 == 0) { // L: 12061
			var1 = null; // L: 12062
		} else {
			int var6 = 0;

			while (true) {
				if (var6 >= var5) {
					var1 = var2; // L: 12072
					break;
				}

				var2 = class175.getWidget(var2.parentId); // L: 12066
				if (var2 == null) { // L: 12067
					var1 = null; // L: 12068
					break; // L: 12069
				}

				++var6; // L: 12065
			}
		}

		Widget var7 = var1; // L: 12074
		if (var1 == null) { // L: 12075
			var7 = var0.parent;
		}

		return var7; // L: 12076
	}
}
