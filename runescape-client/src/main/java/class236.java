import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
public class class236 {
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(Lir;Lir;III)Lkq;",
		garbageValue = "-34187782"
	)
	public static Font method4378(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
		byte[] var5 = var0.takeFile(var2, var3);
		boolean var4;
		if (var5 == null) {
			var4 = false;
		} else {
			class244.SpriteBuffer_decode(var5);
			var4 = true;
		}

		if (!var4) {
			return null;
		} else {
			byte[] var6 = var1.takeFile(var2, var3);
			Font var8;
			if (var6 == null) {
				var8 = null;
			} else {
				Font var7 = new Font(var6, class0.SpriteBuffer_xOffsets, Interpreter.SpriteBuffer_yOffsets, class395.SpriteBuffer_spriteWidths, class157.SpriteBuffer_spriteHeights, Varps.SpriteBuffer_spritePalette, class223.SpriteBuffer_pixels);
				WorldMapDecorationType.method4370();
				var8 = var7;
			}

			return var8;
		}
	}
}
