import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oj")
@Implements("PacketBuffer")
public class PacketBuffer extends Buffer {
	@ObfuscatedName("w")
	static final int[] field4292;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	@Export("isaacCipher")
	IsaacCipher isaacCipher;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1515692399
	)
	@Export("bitIndex")
	int bitIndex;

	static {
		field4292 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
	}

	public PacketBuffer(int var1) {
		super(var1);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "1979297082"
	)
	@Export("newIsaacCipher")
	public void newIsaacCipher(int[] var1) {
		this.isaacCipher = new IsaacCipher(var1);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lpw;I)V",
		garbageValue = "-1209531146"
	)
	@Export("setIsaacCipher")
	public void setIsaacCipher(IsaacCipher var1) {
		this.isaacCipher = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1992268724"
	)
	@Export("writeByteIsaac")
	public void writeByteIsaac(int var1) {
		super.array[++super.offset - 1] = (byte)(var1 + this.isaacCipher.nextInt());
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-20"
	)
	@Export("readByteIsaac")
	public int readByteIsaac() {
		return super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "28330"
	)
	public boolean method6912() {
		int var1 = super.array[super.offset] - this.isaacCipher.method7540() & 255;
		return var1 >= 128;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2024952267"
	)
	@Export("readSmartByteShortIsaac")
	public int readSmartByteShortIsaac() {
		int var1 = super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255;
		return var1 < 128 ? var1 : (var1 - 128 << 8) + (super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1132021347"
	)
	public void method6939(byte[] var1, int var2, int var3) {
		for (int var4 = 0; var4 < var3; ++var4) {
			var1[var4 + var2] = (byte)(super.array[++super.offset - 1] - this.isaacCipher.nextInt());
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1556588051"
	)
	@Export("importIndex")
	public void importIndex() {
		this.bitIndex = super.offset * 8;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2118631653"
	)
	@Export("readBits")
	public int readBits(int var1) {
		int var2 = this.bitIndex >> 3;
		int var3 = 8 - (this.bitIndex & 7);
		int var4 = 0;

		for (this.bitIndex += var1; var1 > var3; var3 = 8) {
			var4 += (super.array[var2++] & field4292[var3]) << var1 - var3;
			var1 -= var3;
		}

		if (var3 == var1) {
			var4 += super.array[var2] & field4292[var3];
		} else {
			var4 += super.array[var2] >> var3 - var1 & field4292[var1];
		}

		return var4;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-12237"
	)
	@Export("exportIndex")
	public void exportIndex() {
		super.offset = (this.bitIndex + 7) / 8;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-87"
	)
	@Export("bitsRemaining")
	public int bitsRemaining(int var1) {
		return var1 * 8 - this.bitIndex;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIIZIB)J",
		garbageValue = "-95"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
		long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17;
		if (var3) {
			var5 |= 65536L;
		}

		return var5;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-383007822"
	)
	public static void method6913() {
		class414.SpriteBuffer_xOffsets = null;
		class414.SpriteBuffer_yOffsets = null;
		UrlRequester.SpriteBuffer_spriteWidths = null;
		class414.SpriteBuffer_spriteHeights = null;
		HitSplatDefinition.SpriteBuffer_spritePalette = null;
		class295.SpriteBuffer_pixels = null;
	}
}
