import java.awt.FontMetrics;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
public class class139 extends class140 {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Lsp;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;
	@ObfuscatedName("bv")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 65075291
	)
	int field1611;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	final class143 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfo;)V"
	)
	class139(class143 var1) {
		this.this$0 = var1;
		this.field1611 = -1; // L: 114
	} // L: 116

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)V",
		garbageValue = "-1979280996"
	)
	void vmethod3361(Buffer var1) {
		this.field1611 = var1.readUnsignedShort(); // L: 119
	} // L: 120

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lfi;B)V",
		garbageValue = "29"
	)
	void vmethod3362(ClanSettings var1) {
		var1.method3208(this.field1611); // L: 123
	} // L: 124

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([BI)Lsn;",
		garbageValue = "2146640729"
	)
	public static final SpritePixels method3105(byte[] var0) {
		BufferedImage var1 = null; // L: 20

		try {
			Class var2 = ImageIO.class; // L: 22
			synchronized(ImageIO.class) {
				var1 = ImageIO.read(new ByteArrayInputStream(var0)); // L: 23
			} // L: 24

			int var6 = var1.getWidth(); // L: 25
			int var7 = var1.getHeight(); // L: 26
			int[] var4 = new int[var7 * var6]; // L: 27
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var6, var7, var4, 0, var6); // L: 28
			var5.grabPixels(); // L: 29
			return new SpritePixels(var4, var6, var7); // L: 30
		} catch (IOException var9) { // L: 32
		} catch (InterruptedException var10) {
		}

		return new SpritePixels(0, 0);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lrz;III)I",
		garbageValue = "2138245450"
	)
	static int method3104(IterableNodeHashTable var0, int var1, int var2) {
		if (var0 == null) { // L: 33
			return var2;
		} else {
			IntegerNode var3 = (IntegerNode)var0.get((long)var1); // L: 34
			return var3 == null ? var2 : var3.integer; // L: 35 36
		}
	}
}
