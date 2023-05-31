import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sb")
public class class485 {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1145263442"
	)
	@Export("SpriteBuffer_decode")
	public static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 217
		var1.offset = var0.length - 2; // L: 218
		class503.SpriteBuffer_spriteCount = var1.readUnsignedShort(); // L: 219
		class503.SpriteBuffer_xOffsets = new int[class503.SpriteBuffer_spriteCount]; // L: 220
		class17.SpriteBuffer_yOffsets = new int[class503.SpriteBuffer_spriteCount]; // L: 221
		class97.SpriteBuffer_spriteWidths = new int[class503.SpriteBuffer_spriteCount]; // L: 222
		class138.SpriteBuffer_spriteHeights = new int[class503.SpriteBuffer_spriteCount]; // L: 223
		VarbitComposition.SpriteBuffer_pixels = new byte[class503.SpriteBuffer_spriteCount][]; // L: 224
		var1.offset = var0.length - 7 - class503.SpriteBuffer_spriteCount * 8; // L: 225
		class503.SpriteBuffer_spriteWidth = var1.readUnsignedShort(); // L: 226
		class503.SpriteBuffer_spriteHeight = var1.readUnsignedShort(); // L: 227
		int var2 = (var1.readUnsignedByte() & 255) + 1; // L: 228

		int var3;
		for (var3 = 0; var3 < class503.SpriteBuffer_spriteCount; ++var3) { // L: 229
			class503.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class503.SpriteBuffer_spriteCount; ++var3) { // L: 230
			class17.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class503.SpriteBuffer_spriteCount; ++var3) { // L: 231
			class97.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class503.SpriteBuffer_spriteCount; ++var3) { // L: 232
			class138.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class503.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3; // L: 233
		class394.SpriteBuffer_spritePalette = new int[var2]; // L: 234

		for (var3 = 1; var3 < var2; ++var3) { // L: 235
			class394.SpriteBuffer_spritePalette[var3] = var1.readMedium(); // L: 236
			if (class394.SpriteBuffer_spritePalette[var3] == 0) { // L: 237
				class394.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0; // L: 239

		for (var3 = 0; var3 < class503.SpriteBuffer_spriteCount; ++var3) { // L: 240
			int var4 = class97.SpriteBuffer_spriteWidths[var3]; // L: 241
			int var5 = class138.SpriteBuffer_spriteHeights[var3]; // L: 242
			int var6 = var5 * var4; // L: 243
			byte[] var7 = new byte[var6]; // L: 244
			VarbitComposition.SpriteBuffer_pixels[var3] = var7; // L: 245
			int var8 = var1.readUnsignedByte(); // L: 246
			int var9;
			if (var8 == 0) { // L: 247
				for (var9 = 0; var9 < var6; ++var9) { // L: 248
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) { // L: 250
				for (var9 = 0; var9 < var4; ++var9) { // L: 251
					for (int var10 = 0; var10 < var5; ++var10) { // L: 252
						var7[var9 + var10 * var4] = var1.readByte(); // L: 253
					}
				}
			}
		}

	} // L: 258

	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "(IIIILtq;Lll;I)V",
		garbageValue = "1850494258"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2; // L: 11955
		if (var6 > 4225 && var6 < 90000) { // L: 11956
			int var7 = Client.camAngleY & 2047; // L: 11957
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 11958
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 11959
			int var10 = var3 * var8 + var9 * var2 >> 16; // L: 11960
			int var11 = var3 * var9 - var8 * var2 >> 16; // L: 11961
			double var12 = Math.atan2((double)var10, (double)var11); // L: 11962
			int var14 = var5.width / 2 - 25; // L: 11963
			int var15 = (int)(Math.sin(var12) * (double)var14); // L: 11964
			int var16 = (int)(Math.cos(var12) * (double)var14); // L: 11965
			byte var17 = 20; // L: 11966
			LoginScreenAnimation.redHintArrowSprite.method9531(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256); // L: 11967
		} else {
			class426.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5); // L: 11969
		}

	} // L: 11970
}
