import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mk")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("fi")
	public static String field3967;
	@ObfuscatedName("la")
	public static String field4008;
	@ObfuscatedName("lp")
	public static String field4032;
	@ObfuscatedName("ly")
	public static String field4117;

	static {
		field3967 = "Please visit the support page for assistance."; // L: 137
		field4008 = ""; // L: 300
		field4032 = "Page has opened in the browser."; // L: 301
		field4117 = ""; // L: 302
	} // L: 345

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([BI)Ltq;",
		garbageValue = "504889561"
	)
	public static final SpritePixels method6601(byte[] var0) {
		BufferedImage var1 = null; // L: 20

		try {
			Class var2 = ImageIO.class; // L: 22
			synchronized(ImageIO.class) {
				var1 = ImageIO.read(new ByteArrayInputStream(var0)); // L: 23
			} // L: 24

			int var6 = var1.getWidth(); // L: 25
			int var7 = var1.getHeight(); // L: 26
			int[] var4 = new int[var6 * var7]; // L: 27
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var6, var7, var4, 0, var6); // L: 28
			var5.grabPixels(); // L: 29
			return new SpritePixels(var4, var6, var7); // L: 30
		} catch (IOException var9) { // L: 32
		} catch (InterruptedException var10) { // L: 33
		}

		return new SpritePixels(0, 0); // L: 34
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Ltc;",
		garbageValue = "1"
	)
	static IndexedSprite method6600() {
		IndexedSprite var0 = new IndexedSprite(); // L: 187
		var0.width = class503.SpriteBuffer_spriteWidth; // L: 188
		var0.height = class503.SpriteBuffer_spriteHeight; // L: 189
		var0.xOffset = class503.SpriteBuffer_xOffsets[0]; // L: 190
		var0.yOffset = class17.SpriteBuffer_yOffsets[0]; // L: 191
		var0.subWidth = class97.SpriteBuffer_spriteWidths[0]; // L: 192
		var0.subHeight = class138.SpriteBuffer_spriteHeights[0]; // L: 193
		var0.palette = class394.SpriteBuffer_spritePalette; // L: 194
		var0.pixels = VarbitComposition.SpriteBuffer_pixels[0]; // L: 195
		class398.method7709(); // L: 196
		return var0; // L: 197
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1979549952"
	)
	public static void method6602() {
		WorldMapElement.WorldMapElement_cachedSprites.clear(); // L: 177
	} // L: 178
}
