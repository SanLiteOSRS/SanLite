import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
public class class125 implements class124 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("KitDefinition_archive")
	public static AbstractArchive KitDefinition_archive;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(CI)B",
		garbageValue = "-29327102"
	)
	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) {
			var1 = (byte)var0;
		} else if (var0 == 8364) {
			var1 = -128;
		} else if (var0 == 8218) {
			var1 = -126;
		} else if (var0 == 402) {
			var1 = -125;
		} else if (var0 == 8222) {
			var1 = -124;
		} else if (var0 == 8230) {
			var1 = -123;
		} else if (var0 == 8224) {
			var1 = -122;
		} else if (var0 == 8225) {
			var1 = -121;
		} else if (var0 == 710) {
			var1 = -120;
		} else if (var0 == 8240) {
			var1 = -119;
		} else if (var0 == 352) {
			var1 = -118;
		} else if (var0 == 8249) {
			var1 = -117;
		} else if (var0 == 338) {
			var1 = -116;
		} else if (var0 == 381) {
			var1 = -114;
		} else if (var0 == 8216) {
			var1 = -111;
		} else if (var0 == 8217) {
			var1 = -110;
		} else if (var0 == 8220) {
			var1 = -109;
		} else if (var0 == 8221) {
			var1 = -108;
		} else if (var0 == 8226) {
			var1 = -107;
		} else if (var0 == 8211) {
			var1 = -106;
		} else if (var0 == 8212) {
			var1 = -105;
		} else if (var0 == 732) {
			var1 = -104;
		} else if (var0 == 8482) {
			var1 = -103;
		} else if (var0 == 353) {
			var1 = -102;
		} else if (var0 == 8250) {
			var1 = -101;
		} else if (var0 == 339) {
			var1 = -100;
		} else if (var0 == 382) {
			var1 = -98;
		} else if (var0 == 376) {
			var1 = -97;
		} else {
			var1 = 63;
		}

		return var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([BI)Loa;",
		garbageValue = "-996987451"
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljp;I)V",
		garbageValue = "-494495560"
	)
	public static void method2587(AbstractArchive var0) {
		VarpDefinition.VarpDefinition_archive = var0;
		SoundSystem.VarpDefinition_fileCount = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16);
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "127"
	)
	public static int method2586(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + var0.charAt(var3);
		}

		return var2;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1592870252"
	)
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}
}
