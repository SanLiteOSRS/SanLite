import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
@Implements("ModelData0")
public class ModelData0 {
	ModelData0() {
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Lir;III)Loh;",
		garbageValue = "-2108875586"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
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
			SpritePixels var5 = new SpritePixels();
			var5.width = class395.SpriteBuffer_spriteWidth;
			var5.height = class395.SpriteBuffer_spriteHeight;
			var5.xOffset = class0.SpriteBuffer_xOffsets[0];
			var5.yOffset = Interpreter.SpriteBuffer_yOffsets[0];
			var5.subWidth = class395.SpriteBuffer_spriteWidths[0];
			var5.subHeight = class157.SpriteBuffer_spriteHeights[0];
			int var6 = var5.subWidth * var5.subHeight;
			byte[] var7 = class223.SpriteBuffer_pixels[0];
			var5.pixels = new int[var6];

			for (int var8 = 0; var8 < var6; ++var8) {
				var5.pixels[var8] = Varps.SpriteBuffer_spritePalette[var7[var8] & 255];
			}

			WorldMapDecorationType.method4370();
			return var5;
		}
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		signature = "(IIIZI)V",
		garbageValue = "-1135384010"
	)
	static final void method3784(int var0, int var1, int var2, boolean var3) {
		if (class15.loadInterface(var0)) {
			Message.resizeInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3);
		}
	}
}
