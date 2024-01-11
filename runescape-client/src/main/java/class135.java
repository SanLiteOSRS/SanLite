import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
class class135 implements Callable {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	final class138 this$0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	final Buffer val$p;
	// $FF: synthetic field
	final int val$version;

	@ObfuscatedSignature(
		descriptor = "(Lfu;Luk;I)V"
	)
	class135(class138 var1, Buffer var2, int var3) {
		this.this$0 = var1; // L: 42
		this.val$p = var2;
		this.val$version = var3;
	}

	public Object call() {
		this.this$0.method3158(this.val$p, this.val$version); // L: 45
		return null; // L: 46
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Low;III)Luc;",
		garbageValue = "945955054"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		if (!Varcs.method2829(var0, var1, var2)) { // L: 57
			return null;
		} else {
			SpritePixels var4 = new SpritePixels(); // L: 60
			var4.width = class545.SpriteBuffer_spriteWidth; // L: 61
			var4.height = class545.SpriteBuffer_spriteHeight; // L: 62
			var4.xOffset = class545.SpriteBuffer_xOffsets[0]; // L: 63
			var4.yOffset = class388.SpriteBuffer_yOffsets[0];
			var4.subWidth = FriendsList.SpriteBuffer_spriteWidths[0]; // L: 65
			var4.subHeight = GrandExchangeOfferOwnWorldComparator.SpriteBuffer_spriteHeights[0]; // L: 66
			int var5 = var4.subHeight * var4.subWidth; // L: 67
			byte[] var6 = class230.SpriteBuffer_pixels[0]; // L: 68
			var4.pixels = new int[var5]; // L: 69

			for (int var7 = 0; var7 < var5; ++var7) { // L: 70
				var4.pixels[var7] = class113.SpriteBuffer_spritePalette[var6[var7] & 255];
			}

			class545.SpriteBuffer_xOffsets = null; // L: 72
			class388.SpriteBuffer_yOffsets = null; // L: 73
			FriendsList.SpriteBuffer_spriteWidths = null; // L: 74
			GrandExchangeOfferOwnWorldComparator.SpriteBuffer_spriteHeights = null; // L: 75
			class113.SpriteBuffer_spritePalette = null; // L: 76
			class230.SpriteBuffer_pixels = null; // L: 77
			return var4; // L: 81
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([FS)V",
		garbageValue = "-28166"
	)
	static void method3146(float[] var0) {
		if (var0[0] + class127.field1487 < 1.3333334F) { // L: 311
			float var1 = var0[0] - 2.0F; // L: 312
			float var2 = var0[0] - 1.0F; // L: 313
			float var3 = (float)Math.sqrt((double)(var1 * var1 - 4.0F * var2 * var2)); // L: 314
			float var4 = 0.5F * (var3 + -var1); // L: 315
			if (var0[1] + class127.field1487 > var4) {
				var0[1] = var4 - class127.field1487; // L: 317
			} else {
				var4 = 0.5F * (-var1 - var3);
				if (var0[1] < class127.field1487 + var4) {
					var0[1] = class127.field1487 + var4;
				}
			}
		} else {
			var0[0] = 1.3333334F - class127.field1487;
			var0[1] = 0.33333334F - class127.field1487; // L: 328
		}

	} // L: 330

	@ObfuscatedName("aj")
	public static int method3149(long var0) {
		return (int)(var0 >>> 7 & 127L); // L: 64
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "39"
	)
	public static byte[] method3147() {
		byte[] var0 = new byte[24]; // L: 316

		try {
			JagexCache.JagexCache_randomDat.seek(0L); // L: 318
			JagexCache.JagexCache_randomDat.readFully(var0); // L: 319

			int var1;
			for (var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) { // L: 320 321 322
			}

			if (var1 >= 24) {
				throw new IOException(); // L: 324
			}
		} catch (Exception var4) {
			for (int var2 = 0; var2 < 24; ++var2) { // L: 327
				var0[var2] = -1;
			}
		}

		return var0; // L: 329
	}
}
