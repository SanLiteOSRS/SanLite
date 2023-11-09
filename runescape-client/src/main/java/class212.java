import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("im")
public class class212 {
	@ObfuscatedName("ac")
	@Export("directions")
	static int[][] directions;
	@ObfuscatedName("ab")
	@Export("distances")
	static int[][] distances;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1698367393
	)
	static int field2344;
	@ObfuscatedName("aq")
	@Export("bufferX")
	static int[] bufferX;
	@ObfuscatedName("ap")
	@Export("bufferY")
	static int[] bufferY;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 73098271
	)
	static int field2347;
	@ObfuscatedName("ae")
	@Export("ByteArrayPool_alternativeSizes")
	public static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "Lds;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;

	static {
		directions = new int[128][128]; // L: 6
		distances = new int[128][128]; // L: 7
		bufferX = new int[4096]; // L: 11
		bufferY = new int[4096]; // L: 12
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-723049536"
	)
	@Export("SpriteBuffer_decode")
	public static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 211
		var1.offset = var0.length - 2; // L: 212
		class492.SpriteBuffer_spriteCount = var1.readUnsignedShort(); // L: 213
		class492.SpriteBuffer_xOffsets = new int[class492.SpriteBuffer_spriteCount]; // L: 214
		Canvas.SpriteBuffer_yOffsets = new int[class492.SpriteBuffer_spriteCount]; // L: 215
		InterfaceParent.SpriteBuffer_spriteWidths = new int[class492.SpriteBuffer_spriteCount]; // L: 216
		class144.SpriteBuffer_spriteHeights = new int[class492.SpriteBuffer_spriteCount]; // L: 217
		class144.SpriteBuffer_pixels = new byte[class492.SpriteBuffer_spriteCount][]; // L: 218
		var1.offset = var0.length - 7 - class492.SpriteBuffer_spriteCount * 8; // L: 219
		class492.SpriteBuffer_spriteWidth = var1.readUnsignedShort(); // L: 220
		class492.SpriteBuffer_spriteHeight = var1.readUnsignedShort(); // L: 221
		int var2 = (var1.readUnsignedByte() & 255) + 1; // L: 222

		int var3;
		for (var3 = 0; var3 < class492.SpriteBuffer_spriteCount; ++var3) { // L: 223
			class492.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class492.SpriteBuffer_spriteCount; ++var3) { // L: 224
			Canvas.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class492.SpriteBuffer_spriteCount; ++var3) { // L: 225
			InterfaceParent.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class492.SpriteBuffer_spriteCount; ++var3) { // L: 226
			class144.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class492.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3; // L: 227
		class181.SpriteBuffer_spritePalette = new int[var2]; // L: 228

		for (var3 = 1; var3 < var2; ++var3) { // L: 229
			class181.SpriteBuffer_spritePalette[var3] = var1.readMedium(); // L: 230
			if (class181.SpriteBuffer_spritePalette[var3] == 0) { // L: 231
				class181.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0; // L: 233

		for (var3 = 0; var3 < class492.SpriteBuffer_spriteCount; ++var3) { // L: 234
			int var4 = InterfaceParent.SpriteBuffer_spriteWidths[var3]; // L: 235
			int var5 = class144.SpriteBuffer_spriteHeights[var3]; // L: 236
			int var6 = var5 * var4; // L: 237
			byte[] var7 = new byte[var6]; // L: 238
			class144.SpriteBuffer_pixels[var3] = var7; // L: 239
			int var8 = var1.readUnsignedByte(); // L: 240
			int var9;
			if (var8 == 0) { // L: 241
				for (var9 = 0; var9 < var6; ++var9) { // L: 242
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) { // L: 244
				for (var9 = 0; var9 < var4; ++var9) { // L: 245
					for (int var10 = 0; var10 < var5; ++var10) { // L: 246
						var7[var9 + var10 * var4] = var1.readByte(); // L: 247
					}
				}
			}
		}

	} // L: 252

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lhu;I)Z",
		garbageValue = "1411875198"
	)
	static boolean method4157(ObjectComposition var0) {
		if (var0.transforms != null) { // L: 634
			int[] var1 = var0.transforms; // L: 636

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 637
				int var3 = var1[var2]; // L: 638
				ObjectComposition var4 = DecorativeObject.getObjectDefinition(var3); // L: 640
				if (var4.mapIconId != -1) { // L: 641
					return true; // L: 642
				}
			}
		} else if (var0.mapIconId != -1) { // L: 648
			return true; // L: 649
		}

		return false; // L: 651
	}
}
