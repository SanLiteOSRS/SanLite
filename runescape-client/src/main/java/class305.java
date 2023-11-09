import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
public class class305 {
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "-1495812528"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 442
		int var2 = var1.readUnsignedByte(); // L: 443
		int var3 = var1.readInt(); // L: 444
		if (var3 < 0 || AbstractArchive.field4014 != 0 && var3 > AbstractArchive.field4014) { // L: 445
			throw new RuntimeException(); // L: 446
		} else if (var2 == 0) { // L: 448
			byte[] var6 = new byte[var3]; // L: 449
			var1.readBytes(var6, 0, var3); // L: 450
			return var6; // L: 451
		} else {
			int var4 = var1.readInt(); // L: 454
			if (var4 >= 0 && (AbstractArchive.field4014 == 0 || var4 <= AbstractArchive.field4014)) { // L: 455
				byte[] var5 = new byte[var4]; // L: 458
				if (var2 == 1) { // L: 459
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5); // L: 460
				}

				return var5; // L: 461
			} else {
				throw new RuntimeException(); // L: 456
			}
		}
	}
}
