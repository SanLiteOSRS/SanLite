import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Iterator;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("te")
class class496 implements Iterator {
	@ObfuscatedName("ap")
	@Export("SpriteBuffer_spriteWidths")
	static int[] SpriteBuffer_spriteWidths;
	@ObfuscatedName("du")
	static boolean field5021;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 584714053
	)
	int field5020;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lti;"
	)
	final class497 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lti;)V"
	)
	class496(class497 var1) {
		this.this$0 = var1; // L: 51
	}

	public Object next() {
		int var1 = ++this.field5020 - 1; // L: 61
		class456 var2 = (class456)this.this$0.field5023.get((long)var1); // L: 62
		return var2 != null ? var2 : this.this$0.method8840(var1); // L: 63 64
	}

	public void remove() {
		throw new UnsupportedOperationException(); // L: 69
	}

	public boolean hasNext() {
		return this.field5020 < this.this$0.method8297(); // L: 56
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-515035626"
	)
	public static int method8836(CharSequence var0) {
		int var1 = var0.length(); // L: 9
		int var2 = 0; // L: 10

		for (int var3 = 0; var3 < var1; ++var3) { // L: 11
			char var4 = var0.charAt(var3); // L: 12
			if (var4 <= 127) { // L: 13
				++var2;
			} else if (var4 <= 2047) { // L: 14
				var2 += 2;
			} else {
				var2 += 3; // L: 15
			}
		}

		return var2; // L: 17
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([BI)Luq;",
		garbageValue = "1316734349"
	)
	public static final SpritePixels method8837(byte[] var0) {
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
}
