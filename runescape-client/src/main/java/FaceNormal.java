import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -311250571
	)
	static int field2363;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	static GameBuild field2365;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 771770075
	)
	@Export("x")
	int x;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1803245333
	)
	@Export("y")
	int y;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1870263719
	)
	@Export("z")
	int z;

	FaceNormal() {
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;ZI)Z",
		garbageValue = "-920183026"
	)
	@Export("isWriteable")
	public static boolean isWriteable(File var0, boolean var1) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
			int var3 = var2.read();
			var2.seek(0L);
			var2.write(var3);
			var2.seek(0L);
			var2.close();
			if (var1) {
				var0.delete();
			}

			return true;
		} catch (Exception var4) {
			return false;
		}
	}
}
