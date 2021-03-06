import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements Enumerated {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lhw;"
	)
	field2765(0, 0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Lhw;"
	)
	field2748(1, 0),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Lhw;"
	)
	field2749(2, 0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Lhw;"
	)
	field2750(3, 0),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "Lhw;"
	)
	field2760(9, 2),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Lhw;"
	)
	field2752(4, 1),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lhw;"
	)
	field2768(5, 1),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "Lhw;"
	)
	field2754(6, 1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lhw;"
	)
	field2755(7, 1),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lhw;"
	)
	field2751(8, 1),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Lhw;"
	)
	field2757(12, 2),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lhw;"
	)
	field2767(13, 2),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "Lhw;"
	)
	field2758(14, 2),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "Lhw;"
	)
	field2756(15, 2),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lhw;"
	)
	field2761(16, 2),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "Lhw;"
	)
	field2762(17, 2),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Lhw;"
	)
	field2763(18, 2),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lhw;"
	)
	field2764(19, 2),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "Lhw;"
	)
	field2769(20, 2),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lhw;"
	)
	field2766(21, 2),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Lhw;"
	)
	field2747(10, 2),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lhw;"
	)
	field2753(11, 2),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lhw;"
	)
	field2759(22, 3);

	@ObfuscatedName("qe")
	@ObfuscatedSignature(
		signature = "Ldh;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -129094329
	)
	@Export("id")
	public final int id;

	@ObfuscatedSignature(
		garbageValue = "0",
		signature = "(II)V"
	)
	WorldMapDecorationType(int var3, int var4) {
		this.id = var3;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "63",
		signature = "(B)I"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		garbageValue = "98",
		signature = "([BB)[B"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		int var2 = var1.readUnsignedByte();
		int var3 = var1.readInt();
		if (var3 < 0 || AbstractArchive.field3171 != 0 && var3 > AbstractArchive.field3171) {
			throw new RuntimeException();
		} else if (var2 == 0) {
			byte[] var6 = new byte[var3];
			var1.readBytes(var6, 0, var3);
			return var6;
		} else {
			int var4 = var1.readInt();
			if (var4 >= 0 && (AbstractArchive.field3171 == 0 || var4 <= AbstractArchive.field3171)) {
				byte[] var5 = new byte[var4];
				if (var2 == 1) {
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5);
				}

				return var5;
			} else {
				throw new RuntimeException();
			}
		}
	}
}
