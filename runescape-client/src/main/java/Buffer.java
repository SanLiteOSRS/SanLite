import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nk")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("v")
	@Export("crc32Table")
	static int[] crc32Table;
	@ObfuscatedName("q")
	@Export("crc64Table")
	static long[] crc64Table;
	@ObfuscatedName("z")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1556710419
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
		this.array = WorldMapScaleHandler.ByteArrayPool_getArray(var1);
		this.offset = 0;
	}

	public Buffer(byte[] var1) {
		this.array = var1;
		this.offset = 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-680959814"
	)
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) {
			WorldMapSection0.ByteArrayPool_release(this.array);
		}

		this.array = null;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-6746"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "14"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-524333253"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-761674832"
	)
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24);
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)var1;
	}

	@ObfuscatedName("ad")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8));
		this.array[++this.offset - 1] = (byte)((int)var1);
	}

	@ObfuscatedName("ac")
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2114638693"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1155791680"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.offset += AbstractWorldMapIcon.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset);
			this.array[++this.offset - 1] = 0;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-409538179"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0;
			this.offset += AbstractWorldMapIcon.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset);
			this.array[++this.offset - 1] = 0;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)V",
		garbageValue = "13"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var2 = class25.method313(var1);
		this.array[++this.offset - 1] = 0;
		this.writeVarInt(var2);
		this.offset += ChatChannel.method2042(this.array, this.offset, var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1505516276"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			this.array[++this.offset - 1] = var1[var4];
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "925576173"
	)
	public void method6441(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1000118777"
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

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-122"
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

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2145686126"
	)
	@Export("writeLengthByte")
	public void writeLengthByte(int var1) {
		if (var1 >= 0 && var1 <= 255) {
			this.array[this.offset - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1925411229"
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

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "32"
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

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1358138020"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "12"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1];
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1575802030"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2;
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-119"
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

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1140346310"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3;
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-6"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 4;
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24);
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "474358183"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L;
		long var3 = (long)this.readInt() & 4294967295L;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1218772276"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-960368875"
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

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "888129368"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset;

		while (this.array[++this.offset - 1] != 0) {
		}

		int var2 = this.offset - var1 - 1;
		return var2 == 0 ? "" : class17.decodeStringCp1252(this.array, var1, var2);
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "3"
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
			return var3 == 0 ? "" : class17.decodeStringCp1252(this.array, var2, var3);
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-1"
	)
	@Export("readCESU8")
	public String readCESU8() {
		byte var1 = this.array[++this.offset - 1];
		if (var1 != 0) {
			throw new IllegalStateException("");
		} else {
			int var2 = this.readVarInt();
			if (var2 + this.offset > this.array.length) {
				throw new IllegalStateException("");
			} else {
				byte[] var4 = this.array;
				int var5 = this.offset;
				char[] var6 = new char[var2];
				int var7 = 0;
				int var8 = var5;

				int var11;
				for (int var9 = var2 + var5; var8 < var9; var6[var7++] = (char)var11) {
					int var10 = var4[var8++] & 255;
					if (var10 < 128) {
						if (var10 == 0) {
							var11 = 65533;
						} else {
							var11 = var10;
						}
					} else if (var10 < 192) {
						var11 = 65533;
					} else if (var10 < 224) {
						if (var8 < var9 && (var4[var8] & 192) == 128) {
							var11 = (var10 & 31) << 6 | var4[var8++] & 63;
							if (var11 < 128) {
								var11 = 65533;
							}
						} else {
							var11 = 65533;
						}
					} else if (var10 < 240) {
						if (var8 + 1 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128) {
							var11 = (var10 & 15) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63;
							if (var11 < 2048) {
								var11 = 65533;
							}
						} else {
							var11 = 65533;
						}
					} else if (var10 < 248) {
						if (var8 + 2 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128 && (var4[var8 + 2] & 192) == 128) {
							var11 = (var10 & 7) << 18 | (var4[var8++] & 63) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63;
							if (var11 >= 65536 && var11 <= 1114111) {
								var11 = 65533;
							} else {
								var11 = 65533;
							}
						} else {
							var11 = 65533;
						}
					} else {
						var11 = 65533;
					}
				}

				String var3 = new String(var6, 0, var7);
				this.offset += var2;
				return var3;
			}
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "-105"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1];
		}

	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2110023250"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255;
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-286680622"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255;
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1606093630"
	)
	public int method6462() {
		int var1 = 0;

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) {
			var1 += 32767;
		}

		var1 += var2;
		return var1;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "15286"
	)
	public int method6463() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort();
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1285482969"
	)
	public int method6464() {
		if (this.array[this.offset] < 0) {
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort();
			return var1 == 32767 ? -1 : var1;
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-235714575"
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

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "([IB)V",
		garbageValue = "-11"
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

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "-2038500196"
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

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "([IIIS)V",
		garbageValue = "4002"
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

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "669714061"
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

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V",
		garbageValue = "-6"
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
		descriptor = "(II)I",
		garbageValue = "1537548493"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		int var2 = GrandExchangeOffer.method5017(this.array, var1, this.offset);
		this.writeInt(var2);
		return var2;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-13"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4;
		int var1 = GrandExchangeOffer.method5017(this.array, 0, this.offset);
		int var2 = this.readInt();
		return var1 == var2;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1867348974"
	)
	public void method6449(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128);
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	public void method6610(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1);
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "101"
	)
	public void method6475(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1);
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int method6476() {
		return this.array[++this.offset - 1] - 128 & 255;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "707714285"
	)
	public int method6477() {
		return 0 - this.array[++this.offset - 1] & 255;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1496339455"
	)
	public int method6478() {
		return 128 - this.array[++this.offset - 1] & 255;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(S)B",
		garbageValue = "1486"
	)
	public byte method6530() {
		return (byte)(this.array[++this.offset - 1] - 128);
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-1088217006"
	)
	public byte method6480() {
		return (byte)(0 - this.array[++this.offset - 1]);
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-1755655115"
	)
	public byte method6526() {
		return (byte)(128 - this.array[++this.offset - 1]);
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "299150194"
	)
	public void method6482(int var1) {
		this.array[++this.offset - 1] = (byte)var1;
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "3134"
	)
	public void method6483(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)(var1 + 128);
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-531554995"
	)
	public void method6484(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128);
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1561631359"
	)
	public int method6620() {
		this.offset += 2;
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255);
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	public int method6486() {
		this.offset += 2;
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8);
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "438565580"
	)
	public int method6648() {
		this.offset += 2;
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255);
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-86"
	)
	public int method6488() {
		this.offset += 2;
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "46"
	)
	public int method6489() {
		this.offset += 2;
		int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "454812532"
	)
	public int method6490() {
		this.offset += 2;
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1573116718"
	)
	public void method6491(int var1) {
		this.array[++this.offset - 1] = (byte)var1;
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-323412798"
	)
	public int method6492() {
		this.offset += 3;
		return (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16);
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-438273456"
	)
	public void method6493(int var1) {
		this.array[++this.offset - 1] = (byte)var1;
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
		this.array[++this.offset - 1] = (byte)(var1 >> 24);
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1197714149"
	)
	public void method6445(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)var1;
		this.array[++this.offset - 1] = (byte)(var1 >> 24);
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2058155655"
	)
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
		this.array[++this.offset - 1] = (byte)(var1 >> 24);
		this.array[++this.offset - 1] = (byte)var1;
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-612164560"
	)
	public int method6481() {
		this.offset += 4;
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24);
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1200276089"
	)
	public int method6497() {
		this.offset += 4;
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16);
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "248933529"
	)
	public int method6428() {
		this.offset += 4;
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24);
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "558288726"
	)
	public void method6499(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) {
			var1[var4] = (byte)(this.array[++this.offset - 1] - 128);
		}

	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "16"
	)
	static final void method6602() {
		if (Script.field1055) {
			for (int var0 = 0; var0 < Players.Players_count; ++var0) {
				Player var1 = Client.players[Players.Players_indices[var0]];
				var1.method2130();
			}

			Script.field1055 = false;
		}

	}
}
