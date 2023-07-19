import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
public class class173 {
	@ObfuscatedName("al")
	static String field1840;
	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("scene")
	static Scene scene;

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1228409992"
	)
	public static int method3574() {
		return ViewportMouse.ViewportMouse_entityCount; // L: 44
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "104060245"
	)
	static void method3575() {
		try {
			File var0 = new File(class388.userHomeDirectory, "random.dat"); // L: 294
			int var2;
			if (var0.exists()) { // L: 295
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 296
			} else {
				label39:
				for (int var1 = 0; var1 < JagexCache.field1844.length; ++var1) { // L: 299
					for (var2 = 0; var2 < ArchiveDiskActionHandler.field4241.length; ++var2) { // L: 300
						File var3 = new File(ArchiveDiskActionHandler.field4241[var2] + JagexCache.field1844[var1] + File.separatorChar + "random.dat"); // L: 301
						if (var3.exists()) { // L: 302
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0); // L: 303
							break label39; // L: 304
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) { // L: 309
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw"); // L: 310
				var2 = var4.read(); // L: 311
				var4.seek(0L); // L: 312
				var4.write(var2); // L: 313
				var4.seek(0L); // L: 314
				var4.close(); // L: 315
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 316
			}
		} catch (IOException var5) { // L: 319
		}

	} // L: 320
}
