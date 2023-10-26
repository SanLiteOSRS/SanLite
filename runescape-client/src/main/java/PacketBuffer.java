import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uy")
@Implements("PacketBuffer")
public class PacketBuffer extends Buffer {
	@ObfuscatedName("al")
	static final int[] field5134;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lvd;"
	)
	@Export("isaacCipher")
	IsaacCipher isaacCipher;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1898669595
	)
	@Export("bitIndex")
	int bitIndex;

	static {
		field5134 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1}; // L: 7
	}

	public PacketBuffer(int var1) {
		super(var1); // L: 11
	} // L: 12

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "696462538"
	)
	@Export("newIsaacCipher")
	public void newIsaacCipher(int[] var1) {
		this.isaacCipher = new IsaacCipher(var1); // L: 15
	} // L: 16

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lvd;I)V",
		garbageValue = "-542273738"
	)
	@Export("setIsaacCipher")
	public void setIsaacCipher(IsaacCipher var1) {
		this.isaacCipher = var1; // L: 19
	} // L: 20

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1739155677"
	)
	@Export("writeByteIsaac")
	public void writeByteIsaac(int var1) {
		super.array[++super.offset - 1] = (byte)(var1 + this.isaacCipher.nextInt()); // L: 23
	} // L: 24

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "126"
	)
	@Export("readByteIsaac")
	public int readByteIsaac() {
		return super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255; // L: 27
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "10238360"
	)
	public boolean method9163() {
		int var1 = super.array[super.offset] - this.isaacCipher.method9822() & 255; // L: 31
		return var1 >= 128; // L: 32
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "38"
	)
	@Export("readSmartByteShortIsaac")
	public int readSmartByteShortIsaac() {
		int var1 = super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255; // L: 37
		return var1 < 128 ? var1 : (var1 - 128 << 8) + (super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255); // L: 38 39
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-1046012809"
	)
	public void method9149(byte[] var1, int var2, int var3) {
		for (int var4 = 0; var4 < var3; ++var4) { // L: 43
			var1[var4 + var2] = (byte)(super.array[++super.offset - 1] - this.isaacCipher.nextInt());
		}

	} // L: 44

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1508899013"
	)
	@Export("importIndex")
	public void importIndex() {
		this.bitIndex = super.offset * 8; // L: 47
	} // L: 48

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2142636526"
	)
	@Export("readBits")
	public int readBits(int var1) {
		int var2 = this.bitIndex >> 3; // L: 51
		int var3 = 8 - (this.bitIndex & 7); // L: 52
		int var4 = 0; // L: 53

		for (this.bitIndex += var1; var1 > var3; var3 = 8) { // L: 54 55 58
			var4 += (super.array[var2++] & field5134[var3]) << var1 - var3; // L: 56
			var1 -= var3; // L: 57
		}

		if (var3 == var1) { // L: 60
			var4 += super.array[var2] & field5134[var3];
		} else {
			var4 += super.array[var2] >> var3 - var1 & field5134[var1]; // L: 61
		}

		return var4; // L: 62
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "59"
	)
	@Export("exportIndex")
	public void exportIndex() {
		super.offset = (this.bitIndex + 7) / 8; // L: 66
	} // L: 67

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1292401715"
	)
	@Export("bitsRemaining")
	public int bitsRemaining(int var1) {
		return var1 * 8 - this.bitIndex; // L: 70
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([BIILjt;[Lih;I)V",
		garbageValue = "-1538039820"
	)
	static final void method9143(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
		Buffer var5 = new Buffer(var0); // L: 258
		int var6 = -1; // L: 259

		while (true) {
			int var7 = var5.method9296(); // L: 261
			if (var7 == 0) { // L: 262
				return; // L: 286
			}

			var6 += var7; // L: 263
			int var8 = 0; // L: 264

			while (true) {
				int var9 = var5.readUShortSmart(); // L: 266
				if (var9 == 0) { // L: 267
					break;
				}

				var8 += var9 - 1; // L: 268
				int var10 = var8 & 63; // L: 269
				int var11 = var8 >> 6 & 63; // L: 270
				int var12 = var8 >> 12; // L: 271
				int var13 = var5.readUnsignedByte(); // L: 272
				int var14 = var13 >> 2; // L: 273
				int var15 = var13 & 3; // L: 274
				int var16 = var11 + var1; // L: 275
				int var17 = var10 + var2; // L: 276
				if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) { // L: 277
					int var18 = var12; // L: 278
					if ((Tiles.Tiles_renderFlags[1][var16][var17] & 2) == 2) { // L: 279
						var18 = var12 - 1;
					}

					CollisionMap var19 = null; // L: 280
					if (var18 >= 0) { // L: 281
						var19 = var4[var18];
					}

					class314.addObjects(var12, var16, var17, var6, var15, var14, var3, var19); // L: 282
				}
			}
		}
	}
}
