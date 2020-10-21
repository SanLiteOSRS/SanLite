import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
public class class298 {
	@ObfuscatedName("f")
	@Export("cp1252AsciiExtension")
	public static final char[] cp1252AsciiExtension;

	static {
		cp1252AsciiExtension = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(Liw;II)Lle;",
		garbageValue = "852535134"
	)
	public static IndexedSprite method5411(AbstractArchive var0, int var1) {
		if (!WorldMapAreaData.method787(var0, var1)) {
			return null;
		} else {
			IndexedSprite var3 = new IndexedSprite();
			var3.width = class336.SpriteBuffer_spriteWidth;
			var3.height = class336.SpriteBuffer_spriteHeight;
			var3.xOffset = class336.SpriteBuffer_xOffsets[0];
			var3.yOffset = class225.SpriteBuffer_yOffsets[0];
			var3.subWidth = class336.SpriteBuffer_spriteWidths[0];
			var3.subHeight = class336.SpriteBuffer_spriteHeights[0];
			var3.palette = WorldMapID.SpriteBuffer_spritePalette;
			var3.pixels = class13.SpriteBuffer_pixels[0];
			class336.SpriteBuffer_xOffsets = null;
			class225.SpriteBuffer_yOffsets = null;
			class336.SpriteBuffer_spriteWidths = null;
			class336.SpriteBuffer_spriteHeights = null;
			WorldMapID.SpriteBuffer_spritePalette = null;
			class13.SpriteBuffer_pixels = null;
			return var3;
		}
	}
}
