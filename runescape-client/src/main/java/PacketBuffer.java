import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
@Implements("PacketBuffer")
public class PacketBuffer extends Buffer {
	@ObfuscatedName("b")
	static final int[] field3736;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lmh;"
	)
	@Export("isaacCipher")
	IsaacCipher isaacCipher;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -195466063
	)
	@Export("bitIndex")
	int bitIndex;

	static {
		field3736 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
	}

	public PacketBuffer(int var1) {
		super(var1);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "([II)V",
		garbageValue = "2133152603"
	)
	@Export("newIsaacCipher")
	public void newIsaacCipher(int[] var1) {
		this.isaacCipher = new IsaacCipher(var1);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(Lmh;I)V",
		garbageValue = "-1550186830"
	)
	@Export("setIsaacCipher")
	public void setIsaacCipher(IsaacCipher var1) {
		this.isaacCipher = var1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-1377827513"
	)
	@Export("writeByteIsaac")
	public void writeByteIsaac(int var1) {
		super.array[++super.offset - 1] = (byte)(var1 + this.isaacCipher.nextInt());
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "-117"
	)
	@Export("readByteIsaac")
	public int readByteIsaac() {
		return super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "-31"
	)
	public boolean method5582() {
		int var1 = super.array[super.offset] - this.isaacCipher.method6417() & 255;
		return var1 >= 128;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "534940999"
	)
	@Export("readSmartByteShortIsaac")
	public int readSmartByteShortIsaac() {
		int var1 = super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255;
		return var1 < 128 ? var1 : (var1 - 128 << 8) + (super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "([BIII)V",
		garbageValue = "-84170760"
	)
	public void method5584(byte[] var1, int var2, int var3) {
		for (int var4 = 0; var4 < var3; ++var4) {
			var1[var4 + var2] = (byte)(super.array[++super.offset - 1] - this.isaacCipher.nextInt());
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "46"
	)
	@Export("importIndex")
	public void importIndex() {
		this.bitIndex = super.offset * 8;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(IB)I",
		garbageValue = "0"
	)
	@Export("readBits")
	public int readBits(int var1) {
		int var2 = this.bitIndex >> 3;
		int var3 = 8 - (this.bitIndex & 7);
		int var4 = 0;

		for (this.bitIndex += var1; var1 > var3; var3 = 8) {
			var4 += (super.array[var2++] & field3736[var3]) << var1 - var3;
			var1 -= var3;
		}

		if (var3 == var1) {
			var4 += super.array[var2] & field3736[var3];
		} else {
			var4 += super.array[var2] >> var3 - var1 & field3736[var1];
		}

		return var4;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1212001290"
	)
	@Export("exportIndex")
	public void exportIndex() {
		super.offset = (this.bitIndex + 7) / 8;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "760869568"
	)
	@Export("bitsRemaining")
	public int bitsRemaining(int var1) {
		return var1 * 8 - this.bitIndex;
	}
}
