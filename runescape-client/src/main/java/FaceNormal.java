import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		signature = "[Lle;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		signature = "Lid;"
	)
	@Export("archive3")
	static Archive archive3;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 875969351
	)
	@Export("x")
	int x;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -440953057
	)
	@Export("y")
	int y;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1278044513
	)
	@Export("z")
	int z;

	FaceNormal() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "([I[II)V",
		garbageValue = "-2056587398"
	)
	public static void method3392(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) {
			Coord.ByteArrayPool_alternativeSizes = var0;
			FloorDecoration.ByteArrayPool_altSizeArrayCounts = new int[var0.length];
			ByteArrayPool.ByteArrayPool_arrays = new byte[var0.length][][];

			for (int var2 = 0; var2 < Coord.ByteArrayPool_alternativeSizes.length; ++var2) {
				ByteArrayPool.ByteArrayPool_arrays[var2] = new byte[var1[var2]][];
			}

		} else {
			Coord.ByteArrayPool_alternativeSizes = null;
			FloorDecoration.ByteArrayPool_altSizeArrayCounts = null;
			ByteArrayPool.ByteArrayPool_arrays = null;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Liw;I)V",
		garbageValue = "-1326300873"
	)
	public static void method3393(AbstractArchive var0) {
		class25.VarpDefinition_archive = var0;
		VarpDefinition.VarpDefinition_fileCount = class25.VarpDefinition_archive.getGroupFileCount(16);
	}
}
