import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("le")
public class class335 {
	@ObfuscatedName("k")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1491774127"
	)
	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 264
		var1.offset = var0.length - 2; // L: 265
		class477.SpriteBuffer_spriteCount = var1.readUnsignedShort(); // L: 266
		class451.SpriteBuffer_xOffsets = new int[class477.SpriteBuffer_spriteCount]; // L: 267
		class319.SpriteBuffer_yOffsets = new int[class477.SpriteBuffer_spriteCount]; // L: 268
		class450.SpriteBuffer_spriteWidths = new int[class477.SpriteBuffer_spriteCount]; // L: 269
		class477.SpriteBuffer_spriteHeights = new int[class477.SpriteBuffer_spriteCount]; // L: 270
		class453.SpriteBuffer_pixels = new byte[class477.SpriteBuffer_spriteCount][]; // L: 271
		var1.offset = var0.length - 7 - class477.SpriteBuffer_spriteCount * 8; // L: 272
		class477.SpriteBuffer_spriteWidth = var1.readUnsignedShort(); // L: 273
		class477.SpriteBuffer_spriteHeight = var1.readUnsignedShort(); // L: 274
		int var2 = (var1.readUnsignedByte() & 255) + 1; // L: 275

		int var3;
		for (var3 = 0; var3 < class477.SpriteBuffer_spriteCount; ++var3) { // L: 276
			class451.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class477.SpriteBuffer_spriteCount; ++var3) { // L: 277
			class319.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class477.SpriteBuffer_spriteCount; ++var3) { // L: 278
			class450.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class477.SpriteBuffer_spriteCount; ++var3) { // L: 279
			class477.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class477.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3; // L: 280
		class477.SpriteBuffer_spritePalette = new int[var2]; // L: 281

		for (var3 = 1; var3 < var2; ++var3) { // L: 282
			class477.SpriteBuffer_spritePalette[var3] = var1.readMedium(); // L: 283
			if (class477.SpriteBuffer_spritePalette[var3] == 0) { // L: 284
				class477.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0; // L: 286

		for (var3 = 0; var3 < class477.SpriteBuffer_spriteCount; ++var3) { // L: 287
			int var4 = class450.SpriteBuffer_spriteWidths[var3]; // L: 288
			int var5 = class477.SpriteBuffer_spriteHeights[var3]; // L: 289
			int var6 = var4 * var5; // L: 290
			byte[] var7 = new byte[var6]; // L: 291
			class453.SpriteBuffer_pixels[var3] = var7; // L: 292
			int var8 = var1.readUnsignedByte(); // L: 293
			int var9;
			if (var8 == 0) { // L: 294
				for (var9 = 0; var9 < var6; ++var9) { // L: 295
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) { // L: 297
				for (var9 = 0; var9 < var4; ++var9) { // L: 298
					for (int var10 = 0; var10 < var5; ++var10) { // L: 299
						var7[var9 + var10 * var4] = var1.readByte(); // L: 300
					}
				}
			}
		}

	} // L: 305
}
