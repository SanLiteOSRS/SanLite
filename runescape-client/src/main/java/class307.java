import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
public class class307 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(CI)C",
		garbageValue = "-2104430234"
	)
	public static char method5555(char var0) {
		switch(var0) {
		case ' ':
		case '-':
		case '_':
		case ' ':
			return '_';
		case '#':
		case '[':
		case ']':
			return var0;
		case 'À':
		case 'Á':
		case 'Â':
		case 'Ã':
		case 'Ä':
		case 'à':
		case 'á':
		case 'â':
		case 'ã':
		case 'ä':
			return 'a';
		case 'Ç':
		case 'ç':
			return 'c';
		case 'È':
		case 'É':
		case 'Ê':
		case 'Ë':
		case 'è':
		case 'é':
		case 'ê':
		case 'ë':
			return 'e';
		case 'Í':
		case 'Î':
		case 'Ï':
		case 'í':
		case 'î':
		case 'ï':
			return 'i';
		case 'Ñ':
		case 'ñ':
			return 'n';
		case 'Ò':
		case 'Ó':
		case 'Ô':
		case 'Õ':
		case 'Ö':
		case 'ò':
		case 'ó':
		case 'ô':
		case 'õ':
		case 'ö':
			return 'o';
		case 'Ù':
		case 'Ú':
		case 'Û':
		case 'Ü':
		case 'ù':
		case 'ú':
		case 'û':
		case 'ü':
			return 'u';
		case 'ß':
			return 'b';
		case 'ÿ':
		case 'Ÿ':
			return 'y';
		default:
			return Character.toLowerCase(var0);
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(B)[Lls;",
		garbageValue = "1"
	)
	static IndexedSprite[] method5558() {
		IndexedSprite[] var0 = new IndexedSprite[class335.SpriteBuffer_spriteCount];

		for (int var1 = 0; var1 < class335.SpriteBuffer_spriteCount; ++var1) {
			IndexedSprite var2 = var0[var1] = new IndexedSprite();
			var2.width = class335.SpriteBuffer_spriteWidth;
			var2.height = class335.SpriteBuffer_spriteHeight;
			var2.xOffset = Username.SpriteBuffer_xOffsets[var1];
			var2.yOffset = class335.SpriteBuffer_yOffsets[var1];
			var2.subWidth = class335.SpriteBuffer_spriteWidths[var1];
			var2.subHeight = class335.SpriteBuffer_spriteHeights[var1];
			var2.palette = TaskHandler.SpriteBuffer_spritePalette;
			var2.pixels = class92.SpriteBuffer_pixels[var1];
		}

		Username.SpriteBuffer_xOffsets = null;
		class335.SpriteBuffer_yOffsets = null;
		class335.SpriteBuffer_spriteWidths = null;
		class335.SpriteBuffer_spriteHeights = null;
		TaskHandler.SpriteBuffer_spritePalette = null;
		class92.SpriteBuffer_pixels = null;
		return var0;
	}
}
