import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ke
@ObfuscatedName("mc")
public final class class360 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	static Widget field4354;

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Lrx;",
		garbageValue = "-529833233"
	)
	static SpritePixels method6967() {
		SpritePixels var0 = new SpritePixels(); // L: 196
		var0.width = GrandExchangeOfferTotalQuantityComparator.SpriteBuffer_spriteWidth; // L: 197
		var0.height = class481.SpriteBuffer_spriteHeight; // L: 198
		var0.xOffset = class481.SpriteBuffer_xOffsets[0]; // L: 199
		var0.yOffset = class414.SpriteBuffer_yOffsets[0]; // L: 200
		var0.subWidth = class11.SpriteBuffer_spriteWidths[0]; // L: 201
		var0.subHeight = StructComposition.SpriteBuffer_spriteHeights[0]; // L: 202
		int var1 = var0.subHeight * var0.subWidth; // L: 203
		byte[] var2 = GroundObject.SpriteBuffer_pixels[0]; // L: 204
		var0.pixels = new int[var1]; // L: 205

		for (int var3 = 0; var3 < var1; ++var3) { // L: 206
			var0.pixels[var3] = WorldMapEvent.SpriteBuffer_spritePalette[var2[var3] & 255];
		}

		class481.SpriteBuffer_xOffsets = null; // L: 208
		class414.SpriteBuffer_yOffsets = null; // L: 209
		class11.SpriteBuffer_spriteWidths = null; // L: 210
		StructComposition.SpriteBuffer_spriteHeights = null; // L: 211
		WorldMapEvent.SpriteBuffer_spritePalette = null; // L: 212
		GroundObject.SpriteBuffer_pixels = null; // L: 213
		return var0; // L: 215
	}
}
