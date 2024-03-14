import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public class class138 {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lof;III)[Lvd;",
		garbageValue = "-86233743"
	)
	public static SpritePixels[] method3146(AbstractArchive var0, int var1, int var2) {
		if (!class130.method3074(var0, var1, var2)) { // L: 28
			return null;
		} else {
			SpritePixels[] var4 = new SpritePixels[class548.SpriteBuffer_spriteCount]; // L: 31

			for (int var5 = 0; var5 < class548.SpriteBuffer_spriteCount; ++var5) { // L: 32
				SpritePixels var6 = var4[var5] = new SpritePixels(); // L: 33
				var6.width = class548.SpriteBuffer_spriteWidth; // L: 34
				var6.height = class548.SpriteBuffer_spriteHeight; // L: 35
				var6.xOffset = class548.SpriteBuffer_xOffsets[var5]; // L: 36
				var6.yOffset = class548.SpriteBuffer_yOffsets[var5]; // L: 37
				var6.subWidth = class235.SpriteBuffer_spriteWidths[var5]; // L: 38
				var6.subHeight = class548.SpriteBuffer_spriteHeights[var5]; // L: 39
				int var7 = var6.subWidth * var6.subHeight; // L: 40
				byte[] var8 = class548.SpriteBuffer_pixels[var5]; // L: 41
				var6.pixels = new int[var7]; // L: 42

				for (int var9 = 0; var9 < var7; ++var9) { // L: 43
					var6.pixels[var9] = AbstractSocket.SpriteBuffer_spritePalette[var8[var9] & 255];
				}
			}

			class548.SpriteBuffer_xOffsets = null; // L: 46
			class548.SpriteBuffer_yOffsets = null; // L: 47
			class235.SpriteBuffer_spriteWidths = null; // L: 48
			class548.SpriteBuffer_spriteHeights = null; // L: 49
			AbstractSocket.SpriteBuffer_spritePalette = null; // L: 50
			class548.SpriteBuffer_pixels = null; // L: 51
			return var4; // L: 55
		}
	}
}
