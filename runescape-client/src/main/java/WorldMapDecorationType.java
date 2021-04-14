import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2820(0, 0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2830(1, 0),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2816(2, 0),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2817(3, 0),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2818(9, 2),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2819(4, 1),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2821(5, 1),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2815(6, 1),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2829(7, 1),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2823(8, 1),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2827(12, 2),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2825(13, 2),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2831(14, 2),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2836(15, 2),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2828(16, 2),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2832(17, 2),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2824(18, 2),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2814(19, 2),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2826(20, 2),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2833(21, 2),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2834(10, 2),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2835(11, 2),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "Lhl;"
	)
	field2837(22, 3);

	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1464574759
	)
	@Export("id")
	public final int id;

	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "0"
	)
	WorldMapDecorationType(int var3, int var4) {
		this.id = var3;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1000839247"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "([BB)Loh;",
		garbageValue = "-38"
	)
	@Export("convertJpgToSprite")
	public static final SpritePixels convertJpgToSprite(byte[] var0) {
		BufferedImage var1 = null;

		try {
			var1 = ImageIO.read(new ByteArrayInputStream(var0));
			int var2 = var1.getWidth();
			int var3 = var1.getHeight();
			int[] var4 = new int[var3 * var2];
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var2, var3, var4, 0, var2);
			var5.grabPixels();
			return new SpritePixels(var4, var2, var3);
		} catch (IOException var7) {
		} catch (InterruptedException var8) {
		}

		return new SpritePixels(0, 0);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "32"
	)
	static void method4370() {
		class0.SpriteBuffer_xOffsets = null;
		Interpreter.SpriteBuffer_yOffsets = null;
		class395.SpriteBuffer_spriteWidths = null;
		class157.SpriteBuffer_spriteHeights = null;
		Varps.SpriteBuffer_spritePalette = null;
		class223.SpriteBuffer_pixels = null;
	}
}
