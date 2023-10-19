import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ou")
public class class372 extends DualNode {
	@ObfuscatedName("ab")
	@Export("SpriteBuffer_spritePalette")
	public static int[] SpriteBuffer_spritePalette;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	Archive field4319;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1026589435
	)
	int field4321;
	@ObfuscatedName("ak")
	byte field4320;

	class372() {
	} // L: 10

	@ObfuscatedName("al")
	public static boolean method6898(long var0) {
		boolean var2 = 0L != var0; // L: 52
		if (var2) { // L: 53
			boolean var3 = (int)(var0 >>> 16 & 1L) == 1; // L: 56
			var2 = !var3; // L: 58
		}

		return var2; // L: 60
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "-655297732"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 444
		int var2 = var1.readUnsignedByte(); // L: 445
		int var3 = var1.readInt(); // L: 446
		if (var3 < 0 || AbstractArchive.field4339 != 0 && var3 > AbstractArchive.field4339) { // L: 447
			throw new RuntimeException(); // L: 448
		} else if (var2 == 0) { // L: 450
			byte[] var6 = new byte[var3]; // L: 451
			var1.readBytes(var6, 0, var3); // L: 452
			return var6; // L: 453
		} else {
			int var4 = var1.readInt(); // L: 456
			if (var4 >= 0 && (AbstractArchive.field4339 == 0 || var4 <= AbstractArchive.field4339)) { // L: 457
				byte[] var5 = new byte[var4]; // L: 460
				if (var2 == 1) { // L: 461
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5); // L: 462
				}

				return var5; // L: 463
			} else {
				throw new RuntimeException(); // L: 458
			}
		}
	}
}
