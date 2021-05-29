import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1950267115
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -840082071
	)
	@Export("x")
	int x;
	@ObfuscatedName("f")
	@Export("y")
	int y;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lgl;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lgl;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgl;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		longValue = 8707211480451132889L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1688818251
	)
	@Export("height")
	int height;

	ItemLayer() {
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-830600929"
	)
	@Export("ByteArrayPool_release")
	public static synchronized void ByteArrayPool_release(byte[] var0) {
		if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < 1000) {
			ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0;
		} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < 250) {
			ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0;
		} else if (var0.length == 30000 && ByteArrayPool.ByteArrayPool_largeCount < 50) {
			ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0;
		} else {
			if (class20.ByteArrayPool_arrays != null) {
				for (int var1 = 0; var1 < ByteArrayPool.ByteArrayPool_alternativeSizes.length; ++var1) {
					if (var0.length == ByteArrayPool.ByteArrayPool_alternativeSizes[var1] && ByteArrayPool.ByteArrayPool_altSizeArrayCounts[var1] < class20.ByteArrayPool_arrays[var1].length) {
						class20.ByteArrayPool_arrays[var1][ByteArrayPool.ByteArrayPool_altSizeArrayCounts[var1]++] = var0;
						return;
					}
				}
			}

		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "1"
	)
	@Export("SpriteBuffer_decode")
	public static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		var1.offset = var0.length - 2;
		class396.SpriteBuffer_spriteCount = var1.readUnsignedShort();
		WorldMapDecoration.SpriteBuffer_xOffsets = new int[class396.SpriteBuffer_spriteCount];
		Calendar.SpriteBuffer_yOffsets = new int[class396.SpriteBuffer_spriteCount];
		class396.SpriteBuffer_spriteWidths = new int[class396.SpriteBuffer_spriteCount];
		class302.SpriteBuffer_spriteHeights = new int[class396.SpriteBuffer_spriteCount];
		class396.SpriteBuffer_pixels = new byte[class396.SpriteBuffer_spriteCount][];
		var1.offset = var0.length - 7 - class396.SpriteBuffer_spriteCount * 8;
		class396.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
		UserComparator2.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
		int var2 = (var1.readUnsignedByte() & 255) + 1;

		int var3;
		for (var3 = 0; var3 < class396.SpriteBuffer_spriteCount; ++var3) {
			WorldMapDecoration.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class396.SpriteBuffer_spriteCount; ++var3) {
			Calendar.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class396.SpriteBuffer_spriteCount; ++var3) {
			class396.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class396.SpriteBuffer_spriteCount; ++var3) {
			class302.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class396.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3;
		MilliClock.SpriteBuffer_spritePalette = new int[var2];

		for (var3 = 1; var3 < var2; ++var3) {
			MilliClock.SpriteBuffer_spritePalette[var3] = var1.readMedium();
			if (MilliClock.SpriteBuffer_spritePalette[var3] == 0) {
				MilliClock.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0;

		for (var3 = 0; var3 < class396.SpriteBuffer_spriteCount; ++var3) {
			int var4 = class396.SpriteBuffer_spriteWidths[var3];
			int var5 = class302.SpriteBuffer_spriteHeights[var3];
			int var6 = var4 * var5;
			byte[] var7 = new byte[var6];
			class396.SpriteBuffer_pixels[var3] = var7;
			int var8 = var1.readUnsignedByte();
			int var9;
			if (var8 == 0) {
				for (var9 = 0; var9 < var6; ++var9) {
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) {
				for (var9 = 0; var9 < var4; ++var9) {
					for (int var10 = 0; var10 < var5; ++var10) {
						var7[var9 + var4 * var10] = var1.readByte();
					}
				}
			}
		}

	}
}
