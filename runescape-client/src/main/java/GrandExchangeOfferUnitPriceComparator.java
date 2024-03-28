import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Comparator;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oz")
@Implements("GrandExchangeOfferUnitPriceComparator")
final class GrandExchangeOfferUnitPriceComparator implements Comparator {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Log;Log;I)I",
		garbageValue = "-837696838"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.unitPrice < var2.grandExchangeOffer.unitPrice ? -1 : (var2.grandExchangeOffer.unitPrice == var1.grandExchangeOffer.unitPrice ? 0 : 1); // L: 43
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 51
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 47
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([BI)Lvg;",
		garbageValue = "695676037"
	)
	public static final SpritePixels method7149(byte[] var0) {
		BufferedImage var1 = null; // L: 20

		try {
			Class var2 = ImageIO.class; // L: 22
			synchronized(ImageIO.class) {
				var1 = ImageIO.read(new ByteArrayInputStream(var0)); // L: 23
			} // L: 24

			int var6 = var1.getWidth(); // L: 25
			int var7 = var1.getHeight();
			int[] var4 = new int[var6 * var7];
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var6, var7, var4, 0, var6); // L: 28
			var5.grabPixels(); // L: 29
			return new SpritePixels(var4, var6, var7); // L: 30
		} catch (IOException var9) { // L: 32
		} catch (InterruptedException var10) { // L: 33
		}

		return new SpritePixels(0, 0); // L: 34
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Loc;I)V",
		garbageValue = "-1621785180"
	)
	public static void method7156(AbstractArchive var0) {
		VarbitComposition.VarbitDefinition_archive = var0; // L: 26
	} // L: 27

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "-1141332639"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 443
		int var2 = var1.readUnsignedByte(); // L: 444
		int var3 = var1.readInt(); // L: 445
		if (var3 < 0 || AbstractArchive.field4417 != 0 && var3 > AbstractArchive.field4417) { // L: 446
			throw new RuntimeException(); // L: 447
		} else if (var2 == 0) { // L: 449
			byte[] var6 = new byte[var3]; // L: 450
			var1.readBytes(var6, 0, var3); // L: 451
			return var6; // L: 452
		} else {
			int var4 = var1.readInt(); // L: 455
			if (var4 >= 0 && (AbstractArchive.field4417 == 0 || var4 <= AbstractArchive.field4417)) { // L: 456
				byte[] var5 = new byte[var4]; // L: 459
				if (var2 == 1) { // L: 460
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5); // L: 461
				}

				return var5; // L: 462
			} else {
				throw new RuntimeException(); // L: 457
			}
		}
	}
}
