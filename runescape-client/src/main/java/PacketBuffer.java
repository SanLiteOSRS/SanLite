import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("un")
@Implements("PacketBuffer")
public class PacketBuffer extends Buffer {
	@ObfuscatedName("ah")
	static final int[] field5227;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lvb;"
	)
	@Export("isaacCipher")
	IsaacCipher isaacCipher;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 382650117
	)
	@Export("bitIndex")
	int bitIndex;

	static {
		field5227 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1}; // L: 7
	}

	public PacketBuffer(int var1) {
		super(var1); // L: 11
	} // L: 12

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([IS)V",
		garbageValue = "-25131"
	)
	@Export("newIsaacCipher")
	public void newIsaacCipher(int[] var1) {
		this.isaacCipher = new IsaacCipher(var1); // L: 15
	} // L: 16

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lvb;B)V",
		garbageValue = "62"
	)
	@Export("setIsaacCipher")
	public void setIsaacCipher(IsaacCipher var1) {
		this.isaacCipher = var1; // L: 19
	} // L: 20

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "640013743"
	)
	@Export("writeByteIsaac")
	public void writeByteIsaac(int var1) {
		super.array[++super.offset - 1] = (byte)(var1 + this.isaacCipher.nextInt()); // L: 23
	} // L: 24

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1700979112"
	)
	@Export("readByteIsaac")
	public int readByteIsaac() {
		return super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255; // L: 27
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1409694471"
	)
	public boolean method9213() {
		int var1 = super.array[super.offset] - this.isaacCipher.method9861() & 255; // L: 31
		return var1 >= 128; // L: 32
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "127741431"
	)
	@Export("readSmartByteShortIsaac")
	public int readSmartByteShortIsaac() {
		int var1 = super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255; // L: 37
		return var1 < 128 ? var1 : (var1 - 128 << 8) + (super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255); // L: 38 39
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1695455795"
	)
	public void method9242(byte[] var1, int var2, int var3) {
		for (int var4 = 0; var4 < var3; ++var4) { // L: 43
			var1[var4 + var2] = (byte)(super.array[++super.offset - 1] - this.isaacCipher.nextInt());
		}

	} // L: 44

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "33"
	)
	@Export("importIndex")
	public void importIndex() {
		this.bitIndex = super.offset * 8; // L: 47
	} // L: 48

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-13"
	)
	@Export("readBits")
	public int readBits(int var1) {
		int var2 = this.bitIndex >> 3; // L: 51
		int var3 = 8 - (this.bitIndex & 7); // L: 52
		int var4 = 0; // L: 53

		for (this.bitIndex += var1; var1 > var3; var3 = 8) { // L: 54 55 58
			var4 += (super.array[var2++] & field5227[var3]) << var1 - var3; // L: 56
			var1 -= var3; // L: 57
		}

		if (var3 == var1) { // L: 60
			var4 += super.array[var2] & field5227[var3];
		} else {
			var4 += super.array[var2] >> var3 - var1 & field5227[var1]; // L: 61
		}

		return var4; // L: 62
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "126"
	)
	@Export("exportIndex")
	public void exportIndex() {
		super.offset = (this.bitIndex + 7) / 8; // L: 66
	} // L: 67

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "72"
	)
	@Export("bitsRemaining")
	public int bitsRemaining(int var1) {
		return var1 * 8 - this.bitIndex; // L: 70
	}
}
