import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("au")
	@Export("FileSystem_hasPermissions")
	static boolean FileSystem_hasPermissions;
	@ObfuscatedName("ae")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;
	@ObfuscatedName("ao")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;

	static {
		FileSystem_hasPermissions = false; // L: 7
		FileSystem_cacheFiles = new Hashtable(16);
	} // L: 9

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)[Lew;",
		garbageValue = "-66"
	)
	static class128[] method3487() {
		return new class128[]{class128.field1530, class128.field1534, class128.field1531, class128.field1532, class128.field1538}; // L: 117
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "1743339101"
	)
	public static void method3488(AbstractArchive var0) {
		VarpDefinition.VarpDefinition_archive = var0; // L: 18
		VarpDefinition.field1933 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16); // L: 19
	} // L: 20

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	static void method3489() {
		try {
			File var0 = new File(class36.userHomeDirectory, "random.dat"); // L: 277
			int var2;
			if (var0.exists()) { // L: 278
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 279
			} else {
				label37:
				for (int var1 = 0; var1 < JagexCache.field1867.length; ++var1) { // L: 282
					for (var2 = 0; var2 < class402.field4514.length; ++var2) { // L: 283
						File var3 = new File(class402.field4514[var2] + JagexCache.field1867[var1] + File.separatorChar + "random.dat"); // L: 284
						if (var3.exists()) { // L: 285
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0); // L: 286
							break label37; // L: 287
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) { // L: 292
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw"); // L: 293
				var2 = var4.read(); // L: 294
				var4.seek(0L); // L: 295
				var4.write(var2); // L: 296
				var4.seek(0L); // L: 297
				var4.close(); // L: 298
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 299
			}
		} catch (IOException var5) { // L: 302
		}

	} // L: 303

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(Lib;IIII)V",
		garbageValue = "-1577193721"
	)
	static void method3490(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && class449.clientPreferences.method2554() != 0) { // L: 3554
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) { // L: 3555
				MouseHandler.method665(var0.soundEffects[var1], var2, var3); // L: 3556
			}
		}
	} // L: 3557

	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1893759044"
	)
	static void method3491() {
		for (int var0 = 0; var0 < Client.field695.size(); ++var0) { // L: 12936
			if (ClientPreferences.method2552((Integer)Client.field695.get(var0)) != 2) { // L: 12937
				Client.field695.remove(var0); // L: 12938
				--var0; // L: 12939
			}
		}

	} // L: 12942
}
