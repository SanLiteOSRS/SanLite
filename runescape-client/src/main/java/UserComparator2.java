import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ty")
@Implements("UserComparator2")
public class UserComparator2 implements Comparator {
	@ObfuscatedName("at")
	@Export("reversed")
	final boolean reversed;

	public UserComparator2(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqm;Lqm;I)I",
		garbageValue = "-1788407627"
	)
	@Export("compare_bridged")
	int compare_bridged(Nameable var1, Nameable var2) {
		return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 14
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Nameable)var1, (Nameable)var2); // L: 18
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 22
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "381252338"
	)
	@Export("SpriteBuffer_decode")
	public static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 245
		var1.offset = var0.length - 2; // L: 246
		class515.SpriteBuffer_spriteCount = var1.readUnsignedShort(); // L: 247
		class515.SpriteBuffer_xOffsets = new int[class515.SpriteBuffer_spriteCount]; // L: 248
		class402.SpriteBuffer_yOffsets = new int[class515.SpriteBuffer_spriteCount]; // L: 249
		class515.SpriteBuffer_spriteWidths = new int[class515.SpriteBuffer_spriteCount]; // L: 250
		class515.SpriteBuffer_spriteHeights = new int[class515.SpriteBuffer_spriteCount]; // L: 251
		class515.SpriteBuffer_pixels = new byte[class515.SpriteBuffer_spriteCount][]; // L: 252
		var1.offset = var0.length - 7 - class515.SpriteBuffer_spriteCount * 8; // L: 253
		class330.SpriteBuffer_spriteWidth = var1.readUnsignedShort(); // L: 254
		class489.SpriteBuffer_spriteHeight = var1.readUnsignedShort(); // L: 255
		int var2 = (var1.readUnsignedByte() & 255) + 1; // L: 256

		int var3;
		for (var3 = 0; var3 < class515.SpriteBuffer_spriteCount; ++var3) { // L: 257
			class515.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class515.SpriteBuffer_spriteCount; ++var3) { // L: 258
			class402.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class515.SpriteBuffer_spriteCount; ++var3) { // L: 259
			class515.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class515.SpriteBuffer_spriteCount; ++var3) { // L: 260
			class515.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class515.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3; // L: 261
		class515.SpriteBuffer_spritePalette = new int[var2]; // L: 262

		for (var3 = 1; var3 < var2; ++var3) { // L: 263
			class515.SpriteBuffer_spritePalette[var3] = var1.readMedium(); // L: 264
			if (class515.SpriteBuffer_spritePalette[var3] == 0) { // L: 265
				class515.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0; // L: 267

		for (var3 = 0; var3 < class515.SpriteBuffer_spriteCount; ++var3) { // L: 268
			int var4 = class515.SpriteBuffer_spriteWidths[var3]; // L: 269
			int var5 = class515.SpriteBuffer_spriteHeights[var3]; // L: 270
			int var6 = var5 * var4; // L: 271
			byte[] var7 = new byte[var6]; // L: 272
			class515.SpriteBuffer_pixels[var3] = var7; // L: 273
			int var8 = var1.readUnsignedByte(); // L: 274
			int var9;
			if (var8 == 0) { // L: 275
				for (var9 = 0; var9 < var6; ++var9) { // L: 276
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) { // L: 278
				for (var9 = 0; var9 < var4; ++var9) { // L: 279
					for (int var10 = 0; var10 < var5; ++var10) { // L: 280
						var7[var9 + var4 * var10] = var1.readByte(); // L: 281
					}
				}
			}
		}

	} // L: 286
}
