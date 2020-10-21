import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = 8604224012951228081L
	)
	public static long field2081;
	@ObfuscatedName("z")
	@Export("cacheDir")
	static File cacheDir;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lmz;"
	)
	@Export("JagexCache_randomDat")
	static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lmz;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Lmz;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "[Lmz;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;

	static {
		JagexCache_randomDat = null;
		JagexCache_dat2File = null;
		JagexCache_idx255File = null;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "2128303847"
	)
	public static int method3625(int var0) {
		return var0 >> 11 & 63;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(IB)I",
		garbageValue = "-50"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var1 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var1 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var1 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var1 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var1;
		}

		return var0 + var1;
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		signature = "(Lbz;B)V",
		garbageValue = "101"
	)
	static final void method3619(PendingSpawn var0) {
		long var1 = 0L;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;
		if (var0.type == 0) {
			var1 = ModeWhere.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) {
			var1 = ModeWhere.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) {
			var1 = ModeWhere.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) {
			var1 = ModeWhere.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var1 != 0L) {
			int var6 = ModeWhere.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1);
			var3 = ObjectSound.Entity_unpackID(var1);
			var4 = var6 & 31;
			var5 = var6 >> 6 & 3;
		}

		var0.objectId = var3;
		var0.field959 = var4;
		var0.field963 = var5;
	}
}
