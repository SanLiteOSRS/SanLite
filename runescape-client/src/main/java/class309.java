import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
public class class309 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lir;III)[Low;",
		garbageValue = "1718772272"
	)
	public static IndexedSprite[] method5603(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2);
		boolean var3;
		if (var4 == null) {
			var3 = false;
		} else {
			class244.SpriteBuffer_decode(var4);
			var3 = true;
		}

		if (!var3) {
			return null;
		} else {
			IndexedSprite[] var5 = new IndexedSprite[class124.SpriteBuffer_spriteCount];

			for (int var6 = 0; var6 < class124.SpriteBuffer_spriteCount; ++var6) {
				IndexedSprite var7 = var5[var6] = new IndexedSprite();
				var7.width = class395.SpriteBuffer_spriteWidth;
				var7.height = class395.SpriteBuffer_spriteHeight;
				var7.xOffset = class0.SpriteBuffer_xOffsets[var6];
				var7.yOffset = Interpreter.SpriteBuffer_yOffsets[var6];
				var7.subWidth = class395.SpriteBuffer_spriteWidths[var6];
				var7.subHeight = class157.SpriteBuffer_spriteHeights[var6];
				var7.palette = Varps.SpriteBuffer_spritePalette;
				var7.pixels = class223.SpriteBuffer_pixels[var6];
			}

			WorldMapDecorationType.method4370();
			return var5;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(CI)C",
		garbageValue = "386677351"
	)
	static char method5602(char var0) {
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(I)[Lox;",
		garbageValue = "-1941444476"
	)
	@Export("FillMode_values")
	public static class392[] FillMode_values() {
		return new class392[]{class392.SOLID, class392.field4229, class392.field4230};
	}
}
