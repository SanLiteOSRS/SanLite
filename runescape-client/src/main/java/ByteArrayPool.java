import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lb")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -476985145
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1576005085
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -381672383
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -2068379159
	)
	static int field3891;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 450416009
	)
	static int field3881;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -358256925
	)
	static int field3882;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -477323591
	)
	static int field3883;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 231839197
	)
	static int field3884;
	@ObfuscatedName("k")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("t")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("l")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("u")
	static byte[][] field3888;
	@ObfuscatedName("z")
	@Export("ByteArrayPool_altSizeArrayCounts")
	static int[] ByteArrayPool_altSizeArrayCounts;
	@ObfuscatedName("d")
	static ArrayList field3890;

	static {
		ByteArrayPool_smallCount = 0;
		ByteArrayPool_mediumCount = 0;
		ByteArrayPool_largeCount = 0;
		field3891 = 0;
		field3881 = 1000;
		field3882 = 250;
		field3883 = 100;
		field3884 = 50;
		ByteArrayPool_small = new byte[1000][];
		ByteArrayPool_medium = new byte[250][];
		ByteArrayPool_large = new byte[100][];
		field3888 = new byte[50][];
		field3890 = new ArrayList();
		class301.method5508();
		new HashMap();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IZB)[B",
		garbageValue = "66"
	)
	@Export("ByteArrayPool_getArrayBool")
	static synchronized byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		byte[] var4;
		if (var0 != 100) {
			if (var0 < 100) {
			}
		} else if (ByteArrayPool_smallCount > 0) {
			var4 = ByteArrayPool_small[--ByteArrayPool_smallCount];
			ByteArrayPool_small[ByteArrayPool_smallCount] = null;
			return var4;
		}

		if (var0 != 5000) {
			if (var0 < 5000) {
			}
		} else if (ByteArrayPool_mediumCount > 0) {
			var4 = ByteArrayPool_medium[--ByteArrayPool_mediumCount];
			ByteArrayPool_medium[ByteArrayPool_mediumCount] = null;
			return var4;
		}

		if (var0 != 10000) {
			if (var0 < 10000) {
			}
		} else if (ByteArrayPool_largeCount > 0) {
			var4 = ByteArrayPool_large[--ByteArrayPool_largeCount];
			ByteArrayPool_large[ByteArrayPool_largeCount] = null;
			return var4;
		}

		if (var0 != 30000) {
			if (var0 < 30000) {
			}
		} else if (field3891 > 0) {
			var4 = field3888[--field3891];
			field3888[field3891] = null;
			return var4;
		}

		if (class260.ByteArrayPool_arrays != null) {
			for (int var2 = 0; var2 < class176.ByteArrayPool_alternativeSizes.length; ++var2) {
				if (class176.ByteArrayPool_alternativeSizes[var2] != var0) {
					if (var0 < class176.ByteArrayPool_alternativeSizes[var2]) {
					}
				} else if (ByteArrayPool_altSizeArrayCounts[var2] > 0) {
					byte[] var3 = class260.ByteArrayPool_arrays[var2][--ByteArrayPool_altSizeArrayCounts[var2]];
					class260.ByteArrayPool_arrays[var2][ByteArrayPool_altSizeArrayCounts[var2]] = null;
					return var3;
				}
			}
		}

		return new byte[var0];
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "([BB)[B",
		garbageValue = "-21"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		int var2 = var1.readUnsignedByte();
		int var3 = var1.readInt();
		if (var3 < 0 || AbstractArchive.field3702 != 0 && var3 > AbstractArchive.field3702) {
			throw new RuntimeException();
		} else if (var2 == 0) {
			byte[] var6 = new byte[var3];
			var1.readBytes(var6, 0, var3);
			return var6;
		} else {
			int var4 = var1.readInt();
			if (var4 >= 0 && (AbstractArchive.field3702 == 0 || var4 <= AbstractArchive.field3702)) {
				byte[] var5 = new byte[var4];
				if (var2 == 1) {
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5);
				}

				return var5;
			} else {
				throw new RuntimeException();
			}
		}
	}
}
