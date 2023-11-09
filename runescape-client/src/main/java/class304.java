import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ly")
public class class304 {
	@ObfuscatedName("aw")
	static int[] field3378;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Luu;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;

	static {
		new Object();
		field3378 = new int[33]; // L: 10
		field3378[0] = 0; // L: 13
		int var0 = 2; // L: 14

		for (int var1 = 1; var1 < 33; ++var1) { // L: 15
			field3378[var1] = var0 - 1; // L: 16
			var0 += var0; // L: 17
		}

	} // L: 19

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[Lag;",
		garbageValue = "-98766558"
	)
	public static class6[] method5780() {
		return new class6[]{class6.field22}; // L: 12
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "754109388"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 395
		int var2 = var1.readUnsignedByte(); // L: 396
		int var3 = var1.readInt(); // L: 397
		if (var3 < 0 || AbstractArchive.field4293 != 0 && var3 > AbstractArchive.field4293) { // L: 398
			throw new RuntimeException(); // L: 399
		} else if (var2 == 0) { // L: 401
			byte[] var6 = new byte[var3]; // L: 402
			var1.readBytes(var6, 0, var3); // L: 403
			return var6; // L: 404
		} else {
			int var4 = var1.readInt(); // L: 407
			if (var4 >= 0 && (AbstractArchive.field4293 == 0 || var4 <= AbstractArchive.field4293)) { // L: 408
				byte[] var5 = new byte[var4]; // L: 411
				if (var2 == 1) { // L: 412
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5); // L: 413
				}

				return var5; // L: 414
			} else {
				throw new RuntimeException(); // L: 409
			}
		}
	}
}
