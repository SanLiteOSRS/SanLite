import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("im")
public class class253 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1972523303
	)
	static int field3134;
	@ObfuscatedName("bm")
	static String field3136;

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljp;IIB)[Low;",
		garbageValue = "-38"
	)
	public static SpritePixels[] method4767(AbstractArchive var0, int var1, int var2) {
		if (!Username.method5711(var0, var1, var2)) {
			return null;
		} else {
			SpritePixels[] var4 = new SpritePixels[class396.SpriteBuffer_spriteCount];

			for (int var5 = 0; var5 < class396.SpriteBuffer_spriteCount; ++var5) {
				SpritePixels var6 = var4[var5] = new SpritePixels();
				var6.width = class396.SpriteBuffer_spriteWidth;
				var6.height = class396.SpriteBuffer_spriteHeight;
				var6.xOffset = class243.SpriteBuffer_xOffsets[var5];
				var6.yOffset = class396.SpriteBuffer_yOffsets[var5];
				var6.subWidth = ArchiveDiskActionHandler.SpriteBuffer_spriteWidths[var5];
				var6.subHeight = class372.SpriteBuffer_spriteHeights[var5];
				int var7 = var6.subWidth * var6.subHeight;
				byte[] var8 = class396.SpriteBuffer_pixels[var5];
				var6.pixels = new int[var7];

				for (int var9 = 0; var9 < var7; ++var9) {
					var6.pixels[var9] = AccessFile.SpriteBuffer_spritePalette[var8[var9] & 255];
				}
			}

			class243.SpriteBuffer_xOffsets = null;
			class396.SpriteBuffer_yOffsets = null;
			ArchiveDiskActionHandler.SpriteBuffer_spriteWidths = null;
			class372.SpriteBuffer_spriteHeights = null;
			AccessFile.SpriteBuffer_spritePalette = null;
			class396.SpriteBuffer_pixels = null;
			return var4;
		}
	}
}
