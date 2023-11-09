import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	@Export("socketTask")
	static Task socketTask;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1046360711
	)
	@Export("x")
	int x;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1848636231
	)
	@Export("y")
	int y;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -209584019
	)
	@Export("z")
	int z;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -867877795
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	} // L: 9

	@ObfuscatedSignature(
		descriptor = "(Lhw;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x; // L: 12
		this.y = var1.y; // L: 13
		this.z = var1.z; // L: 14
		this.magnitude = var1.magnitude; // L: 15
	} // L: 16

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "-546159612"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 375
		int var2 = var1.readUnsignedByte(); // L: 376
		int var3 = var1.readInt(); // L: 377
		if (var3 < 0 || AbstractArchive.field4157 != 0 && var3 > AbstractArchive.field4157) { // L: 378
			throw new RuntimeException(); // L: 379
		} else if (var2 == 0) { // L: 381
			byte[] var6 = new byte[var3]; // L: 382
			var1.readBytes(var6, 0, var3); // L: 383
			return var6; // L: 384
		} else {
			int var4 = var1.readInt(); // L: 387
			if (var4 >= 0 && (AbstractArchive.field4157 == 0 || var4 <= AbstractArchive.field4157)) { // L: 388
				byte[] var5 = new byte[var4]; // L: 391
				if (var2 == 1) { // L: 392
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5); // L: 393
				}

				return var5; // L: 394
			} else {
				throw new RuntimeException(); // L: 389
			}
		}
	}
}
