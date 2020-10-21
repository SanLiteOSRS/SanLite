import java.awt.Image;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
@Implements("PacketBuffer")
public class PacketBuffer extends Buffer {
	@ObfuscatedName("k")
	static final int[] field3729;
	@ObfuscatedName("aa")
	static Image field3725;
	@ObfuscatedName("hu")
	@ObfuscatedGetter(
		intValue = 1400093691
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Llh;"
	)
	@Export("isaacCipher")
	IsaacCipher isaacCipher;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1373505985
	)
	@Export("bitIndex")
	int bitIndex;

	static {
		field3729 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
	}

	public PacketBuffer(int var1) {
		super(var1);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "([II)V",
		garbageValue = "687379780"
	)
	@Export("newIsaacCipher")
	public void newIsaacCipher(int[] var1) {
		this.isaacCipher = new IsaacCipher(var1);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Llh;I)V",
		garbageValue = "-1243349913"
	)
	@Export("setIsaacCipher")
	public void setIsaacCipher(IsaacCipher var1) {
		this.isaacCipher = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "28692652"
	)
	@Export("writeByteIsaac")
	public void writeByteIsaac(int var1) {
		super.array[++super.offset - 1] = (byte)(var1 + this.isaacCipher.nextInt());
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "3"
	)
	@Export("readByteIsaac")
	public int readByteIsaac() {
		return super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "-345140221"
	)
	public boolean method5564() {
		int var1 = super.array[super.offset] - this.isaacCipher.method6394() & 255;
		return var1 >= 128;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "-121"
	)
	@Export("readSmartByteShortIsaac")
	public int readSmartByteShortIsaac() {
		int var1 = super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255;
		return var1 < 128 ? var1 : (var1 - 128 << 8) + (super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255);
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "([BIII)V",
		garbageValue = "-1310609105"
	)
	public void method5566(byte[] var1, int var2, int var3) {
		for (int var4 = 0; var4 < var3; ++var4) {
			var1[var4 + var2] = (byte)(super.array[++super.offset - 1] - this.isaacCipher.nextInt());
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1646456009"
	)
	@Export("importIndex")
	public void importIndex() {
		this.bitIndex = super.offset * 8;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "606103556"
	)
	@Export("readBits")
	public int readBits(int var1) {
		int var2 = this.bitIndex >> 3;
		int var3 = 8 - (this.bitIndex & 7);
		int var4 = 0;

		for (this.bitIndex += var1; var1 > var3; var3 = 8) {
			var4 += (super.array[var2++] & field3729[var3]) << var1 - var3;
			var1 -= var3;
		}

		if (var3 == var1) {
			var4 += super.array[var2] & field3729[var3];
		} else {
			var4 += super.array[var2] >> var3 - var1 & field3729[var1];
		}

		return var4;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "2092208058"
	)
	@Export("exportIndex")
	public void exportIndex() {
		super.offset = (this.bitIndex + 7) / 8;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(IS)I",
		garbageValue = "-20679"
	)
	@Export("bitsRemaining")
	public int bitsRemaining(int var1) {
		return var1 * 8 - this.bitIndex;
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		signature = "(Lbf;IIBI)V",
		garbageValue = "-872449297"
	)
	static final void method5598(Player var0, int var1, int var2, byte var3) {
		int var4 = var0.pathX[0];
		int var5 = var0.pathY[0];
		int var6 = var0.transformedSize();
		if (var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) {
			if (var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) {
				int var9 = var0.transformedSize();
				Client.field950.approxDestinationX = var1;
				Client.field950.approxDestinationY = var2;
				Client.field950.approxDestinationSizeX = 1;
				Client.field950.approxDestinationSizeY = 1;
				ApproximateRouteStrategy var10 = Client.field950;
				int var11 = ObjectSound.method1986(var4, var5, var9, var10, Client.collisionMaps[var0.plane], true, Client.field830, Client.field952);
				if (var11 >= 1) {
					for (int var12 = 0; var12 < var11 - 1; ++var12) {
						var0.method1288(Client.field830[var12], Client.field952[var12], var3);
					}

				}
			}
		}
	}
}
