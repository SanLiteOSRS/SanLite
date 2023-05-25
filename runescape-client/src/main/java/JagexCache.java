import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("ac")
	@Export("JagexCache_locationFile")
	static File JagexCache_locationFile;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1064766397
	)
	@Export("idxCount")
	public static int idxCount;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1325133847
	)
	@Export("cacheGamebuild")
	public static int cacheGamebuild;

	static {
		JagexCache_randomDat = null; // L: 22
		JagexCache_dat2File = null; // L: 23
		JagexCache_idx255File = null; // L: 24
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "-40"
	)
	static final int method3578(int var0, int var1, int var2, int var3) {
		int var4 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var2 * 1024 / var3] >> 1; // L: 1022
		return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16); // L: 1023
	}
}
