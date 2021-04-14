import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
public class class244 {
	@ObfuscatedName("bo")
	static String field2909;
	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		signature = "[Loh;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;

	static {
		int var0 = 0;
		int var1 = 0;
		class239[] var2 = new class239[]{class239.field2869, class239.field2867};
		class239[] var3 = var2;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			class239 var5 = var3[var4];
			if (var5.field2868 > var0) {
				var0 = var5.field2868;
			}

			if (var5.field2870 > var1) {
				var1 = var5.field2870;
			}
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "1279711513"
	)
	public static boolean method4402(int var0) {
		return var0 == WorldMapDecorationType.field2837.id;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "([BB)V",
		garbageValue = "-16"
	)
	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		var1.offset = var0.length - 2;
		class124.SpriteBuffer_spriteCount = var1.readUnsignedShort();
		class0.SpriteBuffer_xOffsets = new int[class124.SpriteBuffer_spriteCount];
		Interpreter.SpriteBuffer_yOffsets = new int[class124.SpriteBuffer_spriteCount];
		class395.SpriteBuffer_spriteWidths = new int[class124.SpriteBuffer_spriteCount];
		class157.SpriteBuffer_spriteHeights = new int[class124.SpriteBuffer_spriteCount];
		class223.SpriteBuffer_pixels = new byte[class124.SpriteBuffer_spriteCount][];
		var1.offset = var0.length - 7 - class124.SpriteBuffer_spriteCount * 8;
		class395.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
		class395.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
		int var2 = (var1.readUnsignedByte() & 255) + 1;

		int var3;
		for (var3 = 0; var3 < class124.SpriteBuffer_spriteCount; ++var3) {
			class0.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class124.SpriteBuffer_spriteCount; ++var3) {
			Interpreter.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class124.SpriteBuffer_spriteCount; ++var3) {
			class395.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class124.SpriteBuffer_spriteCount; ++var3) {
			class157.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class124.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3;
		Varps.SpriteBuffer_spritePalette = new int[var2];

		for (var3 = 1; var3 < var2; ++var3) {
			Varps.SpriteBuffer_spritePalette[var3] = var1.readMedium();
			if (Varps.SpriteBuffer_spritePalette[var3] == 0) {
				Varps.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0;

		for (var3 = 0; var3 < class124.SpriteBuffer_spriteCount; ++var3) {
			int var4 = class395.SpriteBuffer_spriteWidths[var3];
			int var5 = class157.SpriteBuffer_spriteHeights[var3];
			int var6 = var5 * var4;
			byte[] var7 = new byte[var6];
			class223.SpriteBuffer_pixels[var3] = var7;
			int var8 = var1.readUnsignedByte();
			int var9;
			if (var8 == 0) {
				for (var9 = 0; var9 < var6; ++var9) {
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) {
				for (var9 = 0; var9 < var4; ++var9) {
					for (int var10 = 0; var10 < var5; ++var10) {
						var7[var9 + var10 * var4] = var1.readByte();
					}
				}
			}
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(Lhu;II)V",
		garbageValue = "-1802681685"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field2699 == null) {
			throw new RuntimeException();
		} else {
			if (var0.field2653 == null) {
				var0.field2653 = new int[var0.field2699.length];
			}

			var0.field2653[var1] = Integer.MAX_VALUE;
		}
	}
}
