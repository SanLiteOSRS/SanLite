import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("g")
	@Export("crc32Table")
	static int[] crc32Table;
	@ObfuscatedName("n")
	@Export("crc64Table")
	static long[] crc64Table;
	@ObfuscatedName("e")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1477627389
	)
	@Export("offset")
	public int offset;

	static {
		crc32Table = new int[256];

		int var2;
		for (int var1 = 0; var1 < 256; ++var1) {
			int var0 = var1;

			for (var2 = 0; var2 < 8; ++var2) {
				if ((var0 & 1) == 1) {
					var0 = var0 >>> 1 ^ -306674912;
				} else {
					var0 >>>= 1;
				}
			}

			crc32Table[var1] = var0;
		}

		crc64Table = new long[256];

		for (var2 = 0; var2 < 256; ++var2) {
			long var4 = (long)var2;

			for (int var3 = 0; var3 < 8; ++var3) {
				if ((var4 & 1L) == 1L) {
					var4 = var4 >>> 1 ^ -3932672073523589310L;
				} else {
					var4 >>>= 1;
				}
			}

			crc64Table[var2] = var4;
		}

	}

	public Buffer(int var1) {
		this.array = WorldMapArea.ByteArrayPool_getArray(var1);
		this.offset = 0;
	}

	public Buffer(byte[] var1) {
		this.array = var1;
		this.offset = 0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "1"
	)
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) {
			class14.ByteArrayPool_release(this.array);
		}

		this.array = null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-1298490112"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-1931325141"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		signature = "(IS)V",
		garbageValue = "-8617"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-1681728921"
	)
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24);
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)var1;
	}

	@ObfuscatedName("az")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8));
		this.array[++this.offset - 1] = (byte)((int)var1);
	}

	@ObfuscatedName("au")
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		signature = "(ZI)V",
		garbageValue = "-997640464"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "1857751198"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.offset += GameEngine.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset);
			this.array[++this.offset - 1] = 0;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "604540330"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0;
			this.offset += GameEngine.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset);
			this.array[++this.offset - 1] = 0;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/CharSequence;I)V",
		garbageValue = "-1755058719"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var2 = BufferedNetSocket.method5868(var1);
		this.array[++this.offset - 1] = 0;
		this.writeVarInt(var2);
		this.offset += BufferedSource.method5917(this.array, this.offset, var1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		signature = "([BIIB)V",
		garbageValue = "31"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			this.array[++this.offset - 1] = var1[var4];
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		signature = "(Lnu;S)V",
		garbageValue = "128"
	)
	public void method6574(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "-22"
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

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "-84"
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

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "-46"
	)
	@Export("writeLengthByte")
	public void writeLengthByte(int var1) {
		if (var1 >= 0 && var1 <= 255) {
			this.array[this.offset - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "377594228"
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
		signature = "(II)V",
		garbageValue = "880940812"
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
		signature = "(I)I",
		garbageValue = "-2074552528"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		signature = "(S)B",
		garbageValue = "30"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1];
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "6"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2;
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "903567991"
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

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "-27"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3;
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8);
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "-31"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 4;
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		signature = "(I)J",
		garbageValue = "-1762871463"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L;
		long var3 = (long)this.readInt() & 4294967295L;
		return var3 + (var1 << 32);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "2"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		signature = "(S)Ljava/lang/String;",
		garbageValue = "19859"
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

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		signature = "(I)Ljava/lang/String;",
		garbageValue = "-1561912666"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset;

		while (this.array[++this.offset - 1] != 0) {
		}

		int var2 = this.offset - var1 - 1;
		return var2 == 0 ? "" : class303.decodeStringCp1252(this.array, var1, var2);
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		signature = "(B)Ljava/lang/String;",
		garbageValue = "47"
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
			return var3 == 0 ? "" : class303.decodeStringCp1252(this.array, var2, var3);
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		signature = "(I)Ljava/lang/String;",
		garbageValue = "1618486887"
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

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		signature = "([BIII)V",
		garbageValue = "-1339327449"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1];
		}

	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "137611702"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255;
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "86"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255;
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "-56"
	)
	public int method6595() {
		int var1 = 0;

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) {
			var1 += 32767;
		}

		var1 += var2;
		return var1;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-574632647"
	)
	public int method6596() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort();
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1199581115"
	)
	public int method6597() {
		if (this.array[this.offset] < 0) {
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort();
			return var1 == 32767 ? -1 : var1;
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "-81"
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

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		signature = "([II)V",
		garbageValue = "-160142401"
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

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		signature = "([II)V",
		garbageValue = "472171978"
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

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		signature = "([IIII)V",
		garbageValue = "392525104"
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

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		signature = "([IIIB)V",
		garbageValue = "74"
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

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		signature = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
		garbageValue = "-1040044414"
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

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		signature = "(IB)I",
		garbageValue = "-83"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		int var2 = AbstractWorldMapData.method3102(this.array, var1, this.offset);
		this.writeInt(var2);
		return var2;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "97"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4;
		int var1 = AbstractWorldMapData.method3102(this.array, 0, this.offset);
		int var2 = this.readInt();
		return var1 == var2;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "2063199020"
	)
	public void method6606(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128);
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		signature = "(IS)V",
		garbageValue = "21419"
	)
	public void method6639(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1);
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "10"
	)
	public void method6658(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1);
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-917854085"
	)
	public int method6609() {
		return this.array[++this.offset - 1] - 128 & 255;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1498913775"
	)
	public int method6610() {
		return 0 - this.array[++this.offset - 1] & 255;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1369113061"
	)
	public int method6623() {
		return 128 - this.array[++this.offset - 1] & 255;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		signature = "(I)B",
		garbageValue = "1650115963"
	)
	public byte method6584() {
		return (byte)(this.array[++this.offset - 1] - 128);
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		signature = "(B)B",
		garbageValue = "3"
	)
	public byte method6612() {
		return (byte)(0 - this.array[++this.offset - 1]);
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		signature = "(I)B",
		garbageValue = "-1758456111"
	)
	public byte method6678() {
		return (byte)(128 - this.array[++this.offset - 1]);
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "31"
	)
	public void method6614(int var1) {
		this.array[++this.offset - 1] = (byte)var1;
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "960934308"
	)
	public void method6771(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)(var1 + 128);
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-876556698"
	)
	public void method6716(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128);
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-2095394332"
	)
	public int method6617() {
		this.offset += 2;
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255);
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-110506441"
	)
	public int method6748() {
		this.offset += 2;
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8);
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "994048780"
	)
	public int method6766() {
		this.offset += 2;
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255);
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "-112"
	)
	public int method6718() {
		this.offset += 2;
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "1560666274"
	)
	public int method6621() {
		this.offset += 2;
		int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "1409751382"
	)
	public int method6622() {
		this.offset += 2;
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "95868174"
	)
	public int method6642() {
		this.offset += 3;
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 2] & 255);
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-1036994244"
	)
	public void method6624(int var1) {
		this.array[++this.offset - 1] = (byte)var1;
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
		this.array[++this.offset - 1] = (byte)(var1 >> 24);
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "855566027"
	)
	public void method6625(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)var1;
		this.array[++this.offset - 1] = (byte)(var1 >> 24);
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-1886994070"
	)
	public void method6754(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
		this.array[++this.offset - 1] = (byte)(var1 >> 24);
		this.array[++this.offset - 1] = (byte)var1;
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "115"
	)
	public int method6627() {
		this.offset += 4;
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24);
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "81"
	)
	public int method6628() {
		this.offset += 4;
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16);
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1473623071"
	)
	public int method6629() {
		this.offset += 4;
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24);
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		signature = "([BIIB)V",
		garbageValue = "1"
	)
	public void method6630(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = (byte)(this.array[++this.offset - 1] - 128);
		}

	}
}
