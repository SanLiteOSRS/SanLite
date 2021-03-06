import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kx")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("e")
	@Export("crc32Table")
	static int[] crc32Table;
	@ObfuscatedName("l")
	@Export("crc64Table")
	static long[] crc64Table;
	@ObfuscatedName("h")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1025364431
	)
	@Export("offset")
	public int offset;

	static {
		crc32Table = new int[256];

		int var2;
		for (int var1 = 0; var1 < 256; ++var1) {
			int var4 = var1;

			for (var2 = 0; var2 < 8; ++var2) {
				if ((var4 & 1) == 1) {
					var4 = var4 >>> 1 ^ -306674912;
				} else {
					var4 >>>= 1;
				}
			}

			crc32Table[var1] = var4;
		}

		crc64Table = new long[256];

		for (var2 = 0; var2 < 256; ++var2) {
			long var0 = (long)var2;

			for (int var3 = 0; var3 < 8; ++var3) {
				if ((var0 & 1L) == 1L) {
					var0 = var0 >>> 1 ^ -3932672073523589310L;
				} else {
					var0 >>>= 1;
				}
			}

			crc64Table[var2] = var0;
		}

	}

	public Buffer(int var1) {
		this.array = class23.ByteArrayPool_getArray(var1);
		this.offset = 0;
	}

	public Buffer(byte[] var1) {
		this.array = var1;
		this.offset = 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		garbageValue = "1006665451",
		signature = "(I)V"
	)
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) {
			GrandExchangeOfferWorldComparator.ByteArrayPool_release(this.array);
		}

		this.array = null;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		garbageValue = "-725228990",
		signature = "(II)V"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		garbageValue = "-631854152",
		signature = "(II)V"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		garbageValue = "1328174191",
		signature = "(II)V"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		garbageValue = "-1001765065",
		signature = "(II)V"
	)
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24);
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)var1;
	}

	@ObfuscatedName("bj")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8));
		this.array[++this.offset - 1] = (byte)((int)var1);
	}

	@ObfuscatedName("bn")
	@Export("writeLong")
	public void writeLong(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 56));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 48));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8));
		this.array[++this.offset - 1] = (byte)((int)var1);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		garbageValue = "73",
		signature = "(ZB)V"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0);
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		garbageValue = "1281175721",
		signature = "(Ljava/lang/String;I)V"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.offset += ObjectComposition.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset);
			this.array[++this.offset - 1] = 0;
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		garbageValue = "-2045020739",
		signature = "(Ljava/lang/String;I)V"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0;
			this.offset += ObjectComposition.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset);
			this.array[++this.offset - 1] = 0;
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		garbageValue = "-507866074",
		signature = "(Ljava/lang/CharSequence;I)V"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var3 = var1.length();
		int var4 = 0;

		for (int var5 = 0; var5 < var3; ++var5) {
			char var6 = var1.charAt(var5);
			if (var6 <= 127) {
				++var4;
			} else if (var6 <= 2047) {
				var4 += 2;
			} else {
				var4 += 3;
			}
		}

		this.array[++this.offset - 1] = 0;
		this.writeVarInt(var4);
		this.offset += class277.method5192(this.array, this.offset, var1);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		garbageValue = "-491759097",
		signature = "([BIII)V"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			this.array[++this.offset - 1] = var1[var4];
		}

	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		garbageValue = "-891045829",
		signature = "(Lkx;I)V"
	)
	public void method5683(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		garbageValue = "-1107107708",
		signature = "(II)V"
	)
	@Export("writeLengthInt")
	public void writeLengthInt(int var1) {
		if (var1 < 0) {
			throw new IllegalArgumentException();
		} else {
			this.array[this.offset - var1 - 4] = (byte)(var1 >> 24);
			this.array[this.offset - var1 - 3] = (byte)(var1 >> 16);
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8);
			this.array[this.offset - var1 - 1] = (byte)var1;
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		garbageValue = "-1934189526",
		signature = "(II)V"
	)
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) {
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8);
			this.array[this.offset - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		garbageValue = "-2132929022",
		signature = "(II)V"
	)
	@Export("writeLengthByte")
	public void writeLengthByte(int var1) {
		if (var1 >= 0 && var1 <= 255) {
			this.array[this.offset - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		garbageValue = "-415253670",
		signature = "(II)V"
	)
	@Export("writeSmartByteShort")
	public void writeSmartByteShort(int var1) {
		if (var1 >= 0 && var1 < 128) {
			this.writeByte(var1);
		} else if (var1 >= 0 && var1 < 32768) {
			this.writeShort(var1 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		garbageValue = "7069",
		signature = "(IS)V"
	)
	@Export("writeVarInt")
	public void writeVarInt(int var1) {
		if ((var1 & -128) != 0) {
			if ((var1 & -16384) != 0) {
				if ((var1 & -2097152) != 0) {
					if ((var1 & -268435456) != 0) {
						this.writeByte(var1 >>> 28 | 128);
					}

					this.writeByte(var1 >>> 21 | 128);
				}

				this.writeByte(var1 >>> 14 | 128);
			}

			this.writeByte(var1 >>> 7 | 128);
		}

		this.writeByte(var1 & 127);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		garbageValue = "1432126117",
		signature = "(I)I"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		garbageValue = "-16",
		signature = "(B)B"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1];
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		garbageValue = "225678000",
		signature = "(I)I"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2;
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		garbageValue = "912230375",
		signature = "(I)I"
	)
	@Export("readShort")
	public int readShort() {
		this.offset += 2;
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		garbageValue = "-105",
		signature = "(B)I"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3;
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		garbageValue = "95",
		signature = "(B)I"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 4;
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		garbageValue = "68",
		signature = "(B)J"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L;
		long var3 = (long)this.readInt() & 4294967295L;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		garbageValue = "-1996547816",
		signature = "(I)Z"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		garbageValue = "2074077507",
		signature = "(I)Ljava/lang/String;"
	)
	@Export("readStringCp1252NullTerminatedOrNull")
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset] == 0) {
			++this.offset;
			return null;
		} else {
			return this.readStringCp1252NullTerminated();
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		garbageValue = "2017763528",
		signature = "(I)Ljava/lang/String;"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset;

		while (this.array[++this.offset - 1] != 0) {
		}

		int var2 = this.offset - var1 - 1;
		return var2 == 0 ? "" : VertexNormal.decodeStringCp1252(this.array, var1, var2);
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		garbageValue = "586537561",
		signature = "(I)Ljava/lang/String;"
	)
	@Export("readStringCp1252NullCircumfixed")
	public String readStringCp1252NullCircumfixed() {
		byte var1 = this.array[++this.offset - 1];
		if (var1 != 0) {
			throw new IllegalStateException("");
		} else {
			int var2 = this.offset;

			while (this.array[++this.offset - 1] != 0) {
			}

			int var3 = this.offset - var2 - 1;
			return var3 == 0 ? "" : VertexNormal.decodeStringCp1252(this.array, var2, var3);
		}
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		garbageValue = "8221",
		signature = "(S)Ljava/lang/String;"
	)
	@Export("readCESU8")
	public String readCESU8() {
		byte var1 = this.array[++this.offset - 1];
		if (var1 != 0) {
			throw new IllegalStateException("");
		} else {
			int var2 = this.readVarInt();
			String var3 = Strings.method4327(this.array, this.offset, var2);
			this.offset += var2;
			return var3;
		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		garbageValue = "-199927912",
		signature = "([BIII)V"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1];
		}

	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		garbageValue = "1063921109",
		signature = "(I)I"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255;
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		garbageValue = "342141969",
		signature = "(I)I"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255;
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		garbageValue = "-1617877263",
		signature = "(I)I"
	)
	public int method5704() {
		int var1 = 0;

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) {
			var1 += 32767;
		}

		var1 += var2;
		return var1;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		garbageValue = "87",
		signature = "(B)I"
	)
	public int method5705() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort();
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		garbageValue = "1318332981",
		signature = "(I)I"
	)
	public int method5833() {
		if (this.array[this.offset] < 0) {
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort();
			return var1 == 32767 ? -1 : var1;
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		garbageValue = "-2047096049",
		signature = "(I)I"
	)
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[++this.offset - 1];

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) {
			var2 = (var2 | var1 & 127) << 7;
		}

		return var2 | var1;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		garbageValue = "-105213348",
		signature = "([II)V"
	)
	@Export("xteaEncryptAll")
	public void xteaEncryptAll(int[] var1) {
		int var2 = this.offset / 8;
		this.offset = 0;

		for (int var3 = 0; var3 < var2; ++var3) {
			int var4 = this.readInt();
			int var5 = this.readInt();
			int var6 = 0;
			int var7 = -1640531527;

			for (int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) {
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3];
				var6 += var7;
			}

			this.offset -= 8;
			this.writeInt(var4);
			this.writeInt(var5);
		}

	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		garbageValue = "2106116366",
		signature = "([II)V"
	)
	@Export("xteaDecryptAll")
	public void xteaDecryptAll(int[] var1) {
		int var2 = this.offset / 8;
		this.offset = 0;

		for (int var3 = 0; var3 < var2; ++var3) {
			int var4 = this.readInt();
			int var5 = this.readInt();
			int var6 = -957401312;
			int var7 = -1640531527;

			for (int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) {
				var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6;
				var6 -= var7;
			}

			this.offset -= 8;
			this.writeInt(var4);
			this.writeInt(var5);
		}

	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		garbageValue = "6",
		signature = "([IIIB)V"
	)
	@Export("xteaEncrypt")
	public void xteaEncrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset;
		this.offset = var2;
		int var5 = (var3 - var2) / 8;

		for (int var6 = 0; var6 < var5; ++var6) {
			int var7 = this.readInt();
			int var8 = this.readInt();
			int var9 = 0;
			int var10 = -1640531527;

			for (int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) {
				var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3];
				var9 += var10;
			}

			this.offset -= 8;
			this.writeInt(var7);
			this.writeInt(var8);
		}

		this.offset = var4;
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		garbageValue = "-1639907144",
		signature = "([IIII)V"
	)
	@Export("xteaDecrypt")
	public void xteaDecrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset;
		this.offset = var2;
		int var5 = (var3 - var2) / 8;

		for (int var6 = 0; var6 < var5; ++var6) {
			int var7 = this.readInt();
			int var8 = this.readInt();
			int var9 = -957401312;
			int var10 = -1640531527;

			for (int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) {
				var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9;
				var9 -= var10;
			}

			this.offset -= 8;
			this.writeInt(var7);
			this.writeInt(var8);
		}

		this.offset = var4;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		garbageValue = "-1400886376",
		signature = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V"
	)
	@Export("encryptRsa")
	public void encryptRsa(BigInteger var1, BigInteger var2) {
		int var3 = this.offset;
		this.offset = 0;
		byte[] var4 = new byte[var3];
		this.readBytes(var4, 0, var3);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(var1, var2);
		byte[] var7 = var6.toByteArray();
		this.offset = 0;
		this.writeShort(var7.length);
		this.writeBytes(var7, 0, var7.length);
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		garbageValue = "1855873704",
		signature = "(II)I"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		int var2 = Player.method1317(this.array, var1, this.offset);
		this.writeInt(var2);
		return var2;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		garbageValue = "483943428",
		signature = "(I)Z"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4;
		int var1 = Player.method1317(this.array, 0, this.offset);
		int var2 = this.readInt();
		return var2 == var1;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		garbageValue = "110714256",
		signature = "(II)V"
	)
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128);
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		garbageValue = "1893210682",
		signature = "(II)V"
	)
	public void method5778(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1);
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		garbageValue = "-72732516",
		signature = "(II)V"
	)
	public void method5931(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1);
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		garbageValue = "-35",
		signature = "(B)I"
	)
	public int method5776() {
		return this.array[++this.offset - 1] - 128 & 255;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		garbageValue = "1293461120",
		signature = "(I)I"
	)
	public int method5717() {
		return 0 - this.array[++this.offset - 1] & 255;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		garbageValue = "1006009212",
		signature = "(I)I"
	)
	public int method5720() {
		return 128 - this.array[++this.offset - 1] & 255;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		garbageValue = "-2124530748",
		signature = "(I)B"
	)
	public byte method5721() {
		return (byte)(this.array[++this.offset - 1] - 128);
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		garbageValue = "1450651314",
		signature = "(I)B"
	)
	public byte method5722() {
		return (byte)(0 - this.array[++this.offset - 1]);
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		garbageValue = "-362009311",
		signature = "(I)B"
	)
	public byte method5747() {
		return (byte)(128 - this.array[++this.offset - 1]);
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		garbageValue = "-1910800344",
		signature = "(II)V"
	)
	public void method5855(int var1) {
		this.array[++this.offset - 1] = (byte)var1;
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		garbageValue = "-1801053391",
		signature = "(II)V"
	)
	public void method5725(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)(var1 + 128);
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		garbageValue = "1",
		signature = "(IB)V"
	)
	public void method5690(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128);
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		garbageValue = "2146834071",
		signature = "(I)I"
	)
	public int method5727() {
		this.offset += 2;
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255);
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		garbageValue = "-211808457",
		signature = "(I)I"
	)
	public int method5728() {
		this.offset += 2;
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8);
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		garbageValue = "-25877",
		signature = "(S)I"
	)
	public int method5729() {
		this.offset += 2;
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255);
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		garbageValue = "114",
		signature = "(B)I"
	)
	public int method5730() {
		this.offset += 2;
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		garbageValue = "38246618",
		signature = "(I)I"
	)
	public int method5731() {
		this.offset += 2;
		int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		garbageValue = "166926488",
		signature = "(II)V"
	)
	public void method5732(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
		this.array[++this.offset - 1] = (byte)var1;
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		garbageValue = "-25",
		signature = "(B)I"
	)
	public int method5788() {
		this.offset += 3;
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16);
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		garbageValue = "115",
		signature = "(IB)V"
	)
	public void method5781(int var1) {
		this.array[++this.offset - 1] = (byte)var1;
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
		this.array[++this.offset - 1] = (byte)(var1 >> 24);
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		garbageValue = "99",
		signature = "(IB)V"
	)
	public void method5876(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)var1;
		this.array[++this.offset - 1] = (byte)(var1 >> 24);
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		garbageValue = "2087038458",
		signature = "(II)V"
	)
	public void method5736(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
		this.array[++this.offset - 1] = (byte)(var1 >> 24);
		this.array[++this.offset - 1] = (byte)var1;
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		garbageValue = "1781461165",
		signature = "(I)I"
	)
	public int method5895() {
		this.offset += 4;
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24);
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		garbageValue = "1616505089",
		signature = "(I)I"
	)
	public int method5738() {
		this.offset += 4;
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16);
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		garbageValue = "331427137",
		signature = "(I)I"
	)
	public int method5739() {
		this.offset += 4;
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24);
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		garbageValue = "2003375492",
		signature = "([BIII)V"
	)
	public void method5740(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) {
			var1[var4] = this.array[++this.offset - 1];
		}

	}
}
