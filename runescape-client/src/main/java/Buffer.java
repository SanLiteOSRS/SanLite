import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ul")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("av")
	@Export("crc32Table")
	static int[] crc32Table;
	@ObfuscatedName("aa")
	@Export("crc64Table")
	static long[] crc64Table;
	@ObfuscatedName("ab")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -2114593081
	)
	@Export("offset")
	public int offset;

	static {
		crc32Table = new int[256]; // L: 16

		int var2;
		for (int var1 = 0; var1 < 256; ++var1) { // L: 21
			int var4 = var1; // L: 22

			for (var2 = 0; var2 < 8; ++var2) { // L: 23
				if ((var4 & 1) == 1) { // L: 24
					var4 = var4 >>> 1 ^ -306674912;
				} else {
					var4 >>>= 1; // L: 25
				}
			}

			crc32Table[var1] = var4; // L: 27
		}

		crc64Table = new long[256]; // L: 31

		for (var2 = 0; var2 < 256; ++var2) { // L: 36
			long var0 = (long)var2; // L: 37

			for (int var3 = 0; var3 < 8; ++var3) { // L: 38
				if ((var0 & 1L) == 1L) { // L: 39
					var0 = var0 >>> 1 ^ -3932672073523589310L;
				} else {
					var0 >>>= 1; // L: 40
				}
			}

			crc64Table[var2] = var0; // L: 42
		}

	} // L: 44

	public Buffer(int var1, boolean var2) {
		this.array = ByteArrayPool.ByteArrayPool_getArrayBool(var1, var2); // L: 61
	} // L: 62

	public Buffer(int var1) {
		this.array = class148.ByteArrayPool_getArray(var1); // L: 56
		this.offset = 0; // L: 57
	} // L: 58

	public Buffer(byte[] var1) {
		this.array = var1; // L: 65
		this.offset = 0; // L: 66
	} // L: 67

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-113"
	)
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) { // L: 70
			MenuAction.ByteArrayPool_release(this.array);
		}

		this.array = null; // L: 71
	} // L: 72

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-984499580"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 75
	} // L: 76

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-5002"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 79
		this.array[++this.offset - 1] = (byte)var1; // L: 80
	} // L: 81

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1065618714"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 84
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 85
		this.array[++this.offset - 1] = (byte)var1; // L: 86
	} // L: 87

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-43"
	)
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 90
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 91
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 92
		this.array[++this.offset - 1] = (byte)var1; // L: 93
	} // L: 94

	@ObfuscatedName("bl")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 97
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 98
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 99
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 100
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 101
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 102
	} // L: 103

	@ObfuscatedName("bg")
	@Export("writeLong")
	public void writeLong(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 56)); // L: 106
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 48)); // L: 107
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 108
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 109
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 110
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 111
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 112
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 113
	} // L: 114

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "16"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0); // L: 117
	} // L: 118

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1016801645"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0); // L: 125
		if (var2 >= 0) { // L: 126
			throw new IllegalArgumentException("");
		} else {
			this.offset += class16.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 127
			this.array[++this.offset - 1] = 0; // L: 128
		}
	} // L: 129

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-511011778"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0); // L: 132
		if (var2 >= 0) { // L: 133
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0; // L: 134
			this.offset += class16.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 135
			this.array[++this.offset - 1] = 0; // L: 136
		}
	} // L: 137

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)V",
		garbageValue = "100"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var3 = var1.length(); // L: 142
		int var4 = 0; // L: 143

		for (int var5 = 0; var5 < var3; ++var5) { // L: 144
			char var6 = var1.charAt(var5); // L: 145
			if (var6 <= 127) { // L: 146
				++var4;
			} else if (var6 <= 2047) { // L: 147
				var4 += 2;
			} else {
				var4 += 3; // L: 148
			}
		}

		this.array[++this.offset - 1] = 0; // L: 153
		this.writeVarInt(var4); // L: 154
		this.offset += class465.method8410(this.array, this.offset, var1); // L: 155
	} // L: 156

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-1303601550"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			this.array[++this.offset - 1] = var1[var4]; // L: 159
		}

	} // L: 160

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Lul;B)V",
		garbageValue = "-116"
	)
	public void method9197(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset); // L: 163
	} // L: 164

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-88"
	)
	@Export("writeLengthInt")
	public void writeLengthInt(int var1) {
		if (var1 < 0) { // L: 167
			throw new IllegalArgumentException(); // L: 168
		} else {
			this.array[this.offset - var1 - 4] = (byte)(var1 >> 24); // L: 170
			this.array[this.offset - var1 - 3] = (byte)(var1 >> 16); // L: 171
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 172
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 173
		}
	} // L: 174

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) { // L: 177
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 180
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 181
		} else {
			throw new IllegalArgumentException(); // L: 178
		}
	} // L: 182

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "23"
	)
	public void method9200(int var1) {
		if (var1 >= 0 && var1 <= 255) { // L: 185
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 188
		} else {
			throw new IllegalArgumentException(); // L: 186
		}
	} // L: 189

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	@Export("writeSmartByteShort")
	public void writeSmartByteShort(int var1) {
		if (var1 >= 0 && var1 < 128) { // L: 192
			this.writeByte(var1); // L: 193
		} else if (var1 >= 0 && var1 < 32768) { // L: 196
			this.writeShort(var1 + 32768); // L: 197
		} else {
			throw new IllegalArgumentException(); // L: 200
		}
	} // L: 194 198

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "33"
	)
	@Export("writeVarInt")
	public void writeVarInt(int var1) {
		if ((var1 & -128) != 0) { // L: 204
			if ((var1 & -16384) != 0) { // L: 205
				if ((var1 & -2097152) != 0) { // L: 206
					if ((var1 & -268435456) != 0) { // L: 207
						this.writeByte(var1 >>> 28 | 128);
					}

					this.writeByte(var1 >>> 21 | 128); // L: 208
				}

				this.writeByte(var1 >>> 14 | 128); // L: 210
			}

			this.writeByte(var1 >>> 7 | 128); // L: 212
		}

		this.writeByte(var1 & 127); // L: 214
	} // L: 215

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255; // L: 218
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-24140714"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1]; // L: 222
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-38"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2; // L: 226
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 227
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-69"
	)
	@Export("readShort")
	public int readShort() {
		this.offset += 2; // L: 231
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 232
		if (var1 > 32767) { // L: 233
			var1 -= 65536;
		}

		return var1; // L: 234
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1904620263"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3; // L: 238
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 239
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2027677776"
	)
	public int method9208() {
		this.offset += 3; // L: 243
		int var1 = ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 244
		if (var1 > 8388607) { // L: 245
			var1 -= 16777216;
		}

		return var1; // L: 246
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "255"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 4; // L: 250
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24); // L: 251
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "95"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L; // L: 255
		long var3 = (long)this.readInt() & 4294967295L; // L: 256
		return (var1 << 32) + var3; // L: 257
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(S)F",
		garbageValue = "4005"
	)
	public float method9211() {
		return Float.intBitsToFloat(this.readInt()); // L: 261
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2117231513"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1; // L: 265
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "37"
	)
	@Export("readStringCp1252NullTerminatedOrNull")
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset] == 0) { // L: 269
			++this.offset; // L: 270
			return null; // L: 271
		} else {
			return this.readStringCp1252NullTerminated(); // L: 273
		}
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1433848614"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset; // L: 277

		while (this.array[++this.offset - 1] != 0) { // L: 278
		}

		int var2 = this.offset - var1 - 1; // L: 279
		return var2 == 0 ? "" : class92.decodeStringCp1252(this.array, var1, var2); // L: 280 281
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "0"
	)
	@Export("readStringCp1252NullCircumfixed")
	public String readStringCp1252NullCircumfixed() {
		byte var1 = this.array[++this.offset - 1]; // L: 285
		if (var1 != 0) { // L: 286
			throw new IllegalStateException("");
		} else {
			int var2 = this.offset; // L: 287

			while (this.array[++this.offset - 1] != 0) { // L: 288
			}

			int var3 = this.offset - var2 - 1; // L: 289
			return var3 == 0 ? "" : class92.decodeStringCp1252(this.array, var2, var3); // L: 290 291
		}
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1940899039"
	)
	@Export("readCESU8")
	public String readCESU8() {
		byte var1 = this.array[++this.offset - 1]; // L: 295
		if (var1 != 0) { // L: 296
			throw new IllegalStateException("");
		} else {
			int var2 = this.readVarInt(); // L: 297
			if (var2 + this.offset > this.array.length) {
				throw new IllegalStateException(""); // L: 298
			} else {
				String var3 = class430.method7852(this.array, this.offset, var2); // L: 299
				this.offset += var2; // L: 300
				return var3; // L: 301
			}
		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-808602806"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1]; // L: 305
		}

	} // L: 306

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-15010737"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 309
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152; // L: 310 311
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "2"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 315
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768; // L: 316 317
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1742442094"
	)
	public int method9220() {
		int var1 = this.array[this.offset] & 255; // L: 321
		return var1 < 128 ? this.readUnsignedByte() - 1 : this.readUnsignedShort() - 32769; // L: 322 323
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "5"
	)
	public int method9296() {
		int var1 = 0; // L: 327

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) { // L: 328 329 331
			var1 += 32767; // L: 330
		}

		var1 += var2; // L: 333
		return var1; // L: 334
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-5504"
	)
	public int method9222() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort(); // L: 338 339
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-80"
	)
	public int method9223() {
		if (this.array[this.offset] < 0) { // L: 343
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort(); // L: 344
			return var1 == 32767 ? -1 : var1; // L: 345
		}
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1526409696"
	)
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[++this.offset - 1]; // L: 350

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) { // L: 351 352 354
			var2 = (var2 | var1 & 127) << 7; // L: 353
		}

		return var2 | var1; // L: 356
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-57"
	)
	public int method9225() {
		int var2 = 0; // L: 361
		int var3 = 0; // L: 362

		int var1;
		do {
			var1 = this.readUnsignedByte(); // L: 364
			var2 |= (var1 & 127) << var3; // L: 365
			var3 += 7; // L: 366
		} while(var1 > 127); // L: 367

		return var2; // L: 368
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "98180298"
	)
	@Export("xteaEncryptAll")
	public void xteaEncryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 372
		this.offset = 0; // L: 373

		for (int var3 = 0; var3 < var2; ++var3) { // L: 374
			int var4 = this.readInt(); // L: 375
			int var5 = this.readInt(); // L: 376
			int var6 = 0; // L: 377
			int var7 = -1640531527; // L: 378

			for (int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) { // L: 379 380 383
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]; // L: 381
				var6 += var7; // L: 382
			}

			this.offset -= 8; // L: 385
			this.writeInt(var4); // L: 386
			this.writeInt(var5); // L: 387
		}

	} // L: 389

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "([IB)V",
		garbageValue = "-56"
	)
	@Export("xteaDecryptAll")
	public void xteaDecryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 392
		this.offset = 0; // L: 393

		for (int var3 = 0; var3 < var2; ++var3) { // L: 394
			int var4 = this.readInt(); // L: 395
			int var5 = this.readInt(); // L: 396
			int var6 = -957401312; // L: 397
			int var7 = -1640531527; // L: 398

			for (int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) { // L: 399 400 403
				var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6; // L: 401
				var6 -= var7; // L: 402
			}

			this.offset -= 8; // L: 405
			this.writeInt(var4); // L: 406
			this.writeInt(var5); // L: 407
		}

	} // L: 409

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "1472576240"
	)
	@Export("xteaEncrypt")
	public void xteaEncrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 412
		this.offset = var2; // L: 413
		int var5 = (var3 - var2) / 8; // L: 414

		for (int var6 = 0; var6 < var5; ++var6) { // L: 415
			int var7 = this.readInt(); // L: 416
			int var8 = this.readInt(); // L: 417
			int var9 = 0; // L: 418
			int var10 = -1640531527; // L: 419

			for (int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) { // L: 420 421 424
				var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]; // L: 422
				var9 += var10; // L: 423
			}

			this.offset -= 8; // L: 426
			this.writeInt(var7); // L: 427
			this.writeInt(var8); // L: 428
		}

		this.offset = var4; // L: 430
	} // L: 431

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "([IIIB)V",
		garbageValue = "121"
	)
	@Export("xteaDecrypt")
	public void xteaDecrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 434
		this.offset = var2; // L: 435
		int var5 = (var3 - var2) / 8; // L: 436

		for (int var6 = 0; var6 < var5; ++var6) { // L: 437
			int var7 = this.readInt(); // L: 438
			int var8 = this.readInt(); // L: 439
			int var9 = -957401312; // L: 440
			int var10 = -1640531527; // L: 441

			for (int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) { // L: 442 443 446
				var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9; // L: 444
				var9 -= var10; // L: 445
			}

			this.offset -= 8; // L: 448
			this.writeInt(var7); // L: 449
			this.writeInt(var8); // L: 450
		}

		this.offset = var4; // L: 452
	} // L: 453

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
		garbageValue = "-36777133"
	)
	@Export("encryptRsa")
	public void encryptRsa(BigInteger var1, BigInteger var2) {
		int var3 = this.offset; // L: 456
		this.offset = 0; // L: 457
		byte[] var4 = new byte[var3]; // L: 458
		this.readBytes(var4, 0, var3); // L: 459
		BigInteger var5 = new BigInteger(var4); // L: 460
		BigInteger var6 = var5.modPow(var1, var2); // L: 461
		byte[] var7 = var6.toByteArray(); // L: 462
		this.offset = 0; // L: 463
		this.writeShort(var7.length); // L: 464
		this.writeBytes(var7, 0, var7.length); // L: 465
	} // L: 466

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1093540006"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		int var2 = ArchiveDisk.method8262(this.array, var1, this.offset); // L: 469
		this.writeInt(var2); // L: 470
		return var2; // L: 471
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "103"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4; // L: 475
		int var1 = ArchiveDisk.method8262(this.array, 0, this.offset); // L: 476
		int var2 = this.readInt(); // L: 477
		return var1 == var2; // L: 478
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1580399246"
	)
	public void method9323(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 483
	} // L: 484

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "518186020"
	)
	public void method9234(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1); // L: 487
	} // L: 488

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-751225274"
	)
	public void method9235(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1); // L: 491
	} // L: 492

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2038958991"
	)
	public int method9236() {
		return this.array[++this.offset - 1] - 128 & 255; // L: 495
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2068421837"
	)
	public int method9237() {
		return 0 - this.array[++this.offset - 1] & 255; // L: 499
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "17"
	)
	public int method9238() {
		return 128 - this.array[++this.offset - 1] & 255; // L: 503
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "80020089"
	)
	public byte method9239() {
		return (byte)(this.array[++this.offset - 1] - 128); // L: 507
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "-29"
	)
	public byte method9240() {
		return (byte)(0 - this.array[++this.offset - 1]); // L: 511
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "1972781971"
	)
	public byte method9241() {
		return (byte)(128 - this.array[++this.offset - 1]); // L: 515
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "106"
	)
	public void method9344(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 519
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 520
	} // L: 521

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1925557775"
	)
	public void method9243(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 524
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 525
	} // L: 526

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "18"
	)
	public void method9244(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 529
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 530
	} // L: 531

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	public int method9245() {
		this.offset += 2; // L: 534
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 535
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1401197709"
	)
	public int method9184() {
		this.offset += 2; // L: 539
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 540
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-976069698"
	)
	public int method9183() {
		this.offset += 2; // L: 544
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 545
	}

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1014937104"
	)
	public int method9412() {
		this.offset += 2; // L: 549
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 550
		if (var1 > 32767) { // L: 551
			var1 -= 65536;
		}

		return var1; // L: 552
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "53"
	)
	public int method9249() {
		this.offset += 2; // L: 556
		int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 557
		if (var1 > 32767) { // L: 558
			var1 -= 65536;
		}

		return var1; // L: 559
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-813012509"
	)
	public int method9281() {
		this.offset += 2; // L: 563
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 564
		if (var1 > 32767) { // L: 565
			var1 -= 65536;
		}

		return var1; // L: 566
	}

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "19"
	)
	public void method9409(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 570
		this.array[++this.offset - 1] = (byte)var1; // L: 571
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 572
	} // L: 573

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2139060147"
	)
	public int method9252() {
		this.offset += 3; // L: 576
		return (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16); // L: 577
	}

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "784295122"
	)
	public int method9253() {
		this.offset += 3; // L: 581
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16); // L: 582
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "953463259"
	)
	public int method9254() {
		this.offset += 3; // L: 586
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 2] & 255); // L: 587
		if (var1 > 8388607) { // L: 588
			var1 -= 16777216;
		}

		return var1; // L: 589
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-927007563"
	)
	public int method9255() {
		this.offset += 3; // L: 593
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16); // L: 594
		if (var1 > 8388607) { // L: 595
			var1 -= 16777216;
		}

		return var1; // L: 596
	}

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-40"
	)
	public void method9256(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 600
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 601
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 602
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 603
	} // L: 604

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "759646108"
	)
	public void method9423(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 607
		this.array[++this.offset - 1] = (byte)var1; // L: 608
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 609
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 610
	} // L: 611

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1723404491"
	)
	public void method9258(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 614
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 615
		this.array[++this.offset - 1] = (byte)var1; // L: 616
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 617
	} // L: 618

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1509017356"
	)
	public int method9259() {
		this.offset += 4; // L: 621
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24); // L: 622
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-743264140"
	)
	public int method9260() {
		this.offset += 4; // L: 626
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16); // L: 627
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-119646435"
	)
	public int method9261() {
		this.offset += 4; // L: 631
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24); // L: 632
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "265273731"
	)
	public void method9326(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) { // L: 636
			var1[var4] = this.array[++this.offset - 1];
		}

	} // L: 637

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "157152103"
	)
	public void method9263(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = (byte)(this.array[++this.offset - 1] - 128); // L: 640
		}

	} // L: 641
}
