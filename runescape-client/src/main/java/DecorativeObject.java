import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
@Implements("DecorativeObject")
public final class DecorativeObject {
	@ObfuscatedName("wv")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	public static class384 field2871;
	@ObfuscatedName("ly")
	@ObfuscatedGetter(
		intValue = -1634319151
	)
	@Export("cameraYaw")
	static int cameraYaw;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -933242443
	)
	@Export("z")
	int z;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1471615239
	)
	@Export("x")
	int x;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 210123715
	)
	@Export("y")
	int y;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1132126571
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1334490223
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1942701153
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 737404035
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = -1188891399884727635L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1031863247
	)
	@Export("flags")
	int flags;

	DecorativeObject() {
		this.tag = 0L; // L: 13
		this.flags = 0; // L: 14
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/io/File;",
		garbageValue = "97"
	)
	@Export("getFile")
	static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) { // L: 16
			throw new RuntimeException("");
		} else {
			File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0); // L: 17
			if (var1 != null) { // L: 18
				return var1;
			} else {
				File var2 = new File(FileSystem.FileSystem_cacheDir, var0); // L: 19
				RandomAccessFile var3 = null; // L: 20

				try {
					File var4 = new File(var2.getParent()); // L: 22
					if (!var4.exists()) { // L: 23
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw"); // L: 24
						int var5 = var3.read(); // L: 25
						var3.seek(0L); // L: 26
						var3.write(var5); // L: 27
						var3.seek(0L); // L: 28
						var3.close(); // L: 29
						FileSystem.FileSystem_cacheFiles.put(var0, var2); // L: 30
						return var2; // L: 31
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) { // L: 35
							var3.close(); // L: 36
							var3 = null; // L: 37
						}
					} catch (Exception var7) { // L: 40
					}

					throw new RuntimeException(); // L: 42
				}
			}
		}
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "16"
	)
	static final boolean method5194(int var0) {
		if (var0 < 0) { // L: 9426
			return false;
		} else {
			int var1 = Client.menuOpcodes[var0]; // L: 9427
			if (var1 >= 2000) { // L: 9428
				var1 -= 2000;
			}

			return var1 == 1007; // L: 9429
		}
	}
}
