import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uj")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("az")
	@Export("crc32Table")
	static int[] crc32Table;
	@ObfuscatedName("av")
	@Export("crc64Table")
	static long[] crc64Table;
	@ObfuscatedName("ac")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1904364897
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
		this.array = ServerPacket.ByteArrayPool_getArrayBool(var1, var2); // L: 61
	} // L: 62

	public Buffer(int var1) {
		this.array = class362.ByteArrayPool_getArray(var1); // L: 56
		this.offset = 0; // L: 57
	} // L: 58

	public Buffer(byte[] var1) {
		this.array = var1; // L: 65
		this.offset = 0; // L: 66
	} // L: 67

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "37821"
	)
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) { // L: 70
			class412.ByteArrayPool_release(this.array);
		}

		this.array = null; // L: 71
	} // L: 72

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2032904894"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 75
	} // L: 76

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2078437680"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 79
		this.array[++this.offset - 1] = (byte)var1; // L: 80
	} // L: 81

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1102308470"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 84
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 85
		this.array[++this.offset - 1] = (byte)var1; // L: 86
	} // L: 87

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1017147770"
	)
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 90
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 91
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 92
		this.array[++this.offset - 1] = (byte)var1; // L: 93
	} // L: 94

	@ObfuscatedName("bz")
	public void method9247(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 97
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 98
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 99
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 100
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 101
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 102
	} // L: 103

	@ObfuscatedName("bc")
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

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1187697267"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0); // L: 117
	} // L: 118

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "900280888"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0); // L: 125
		if (var2 >= 0) { // L: 126
			throw new IllegalArgumentException("");
		} else {
			this.offset += class187.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 127
			this.array[++this.offset - 1] = 0; // L: 128
		}
	} // L: 129

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1205300061"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0); // L: 132
		if (var2 >= 0) { // L: 133
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0; // L: 134
			this.offset += class187.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 135
			this.array[++this.offset - 1] = 0; // L: 136
		}
	} // L: 137

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)V",
		garbageValue = "395083018"
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
		this.offset += class344.method6807(this.array, this.offset, var1); // L: 155
	} // L: 156

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1351924623"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) { // L: 159
			this.array[++this.offset - 1] = var1[var4];
		}

	} // L: 160

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "-1328772504"
	)
	public void method9367(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset); // L: 163
	} // L: 164

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "31"
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

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1632479764"
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

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-579744730"
	)
	public void method9257(int var1) {
		if (var1 >= 0 && var1 <= 255) { // L: 185
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 188
		} else {
			throw new IllegalArgumentException(); // L: 186
		}
	} // L: 189

	@ObfuscatedName("cp")
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

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-24"
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

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2140703005"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255; // L: 218
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "-38"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1]; // L: 222
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "118"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2; // L: 226
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 227
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "100"
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

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-100"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3; // L: 238
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 239
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "89"
	)
	public int method9489() {
		this.offset += 3; // L: 243
		int var1 = ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 244
		if (var1 > 8388607) { // L: 245
			var1 -= 16777216;
		}

		return var1; // L: 246
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-12"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 4; // L: 250
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24); // L: 251
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "1536717051"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L; // L: 255
		long var3 = (long)this.readInt() & 4294967295L; // L: 256
		return var3 + (var1 << 32); // L: 257
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "346642387"
	)
	public float method9268() {
		return Float.intBitsToFloat(this.readInt()); // L: 261
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2040454969"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1; // L: 265
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1977045355"
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

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1287732949"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset; // L: 277

		while (this.array[++this.offset - 1] != 0) { // L: 278
		}

		int var2 = this.offset - var1 - 1; // L: 279
		return var2 == 0 ? "" : World.decodeStringCp1252(this.array, var1, var2); // L: 280 281
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-716580944"
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
			return var3 == 0 ? "" : World.decodeStringCp1252(this.array, var2, var3); // L: 290 291
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-780563964"
	)
	@Export("readCESU8")
	public String readCESU8() {
		byte var1 = this.array[++this.offset - 1]; // L: 295
		if (var1 != 0) { // L: 296
			throw new IllegalStateException("");
		} else {
			int var2 = this.readVarInt(); // L: 297
			if (var2 + this.offset > this.array.length) { // L: 298
				throw new IllegalStateException("");
			} else {
				byte[] var4 = this.array; // L: 300
				int var5 = this.offset; // L: 301
				char[] var6 = new char[var2]; // L: 303
				int var7 = 0; // L: 304
				int var8 = var5; // L: 305

				int var11;
				for (int var9 = var2 + var5; var8 < var9; var6[var7++] = (char)var11) { // L: 306 307 338
					int var10 = var4[var8++] & 255; // L: 308
					if (var10 < 128) { // L: 310
						if (var10 == 0) { // L: 311
							var11 = 65533;
						} else {
							var11 = var10; // L: 312
						}
					} else if (var10 < 192) { // L: 314
						var11 = 65533;
					} else if (var10 < 224) { // L: 315
						if (var8 < var9 && (var4[var8] & 192) == 128) { // L: 316
							var11 = (var10 & 31) << 6 | var4[var8++] & 63; // L: 317
							if (var11 < 128) { // L: 318
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 320
						}
					} else if (var10 < 240) { // L: 322
						if (var8 + 1 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128) { // L: 323
							var11 = (var10 & 15) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63; // L: 324
							if (var11 < 2048) { // L: 325
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 327
						}
					} else if (var10 < 248) { // L: 329
						if (var8 + 2 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128 && (var4[var8 + 2] & 192) == 128) { // L: 330
							var11 = (var10 & 7) << 18 | (var4[var8++] & 63) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63; // L: 331
							if (var11 >= 65536 && var11 <= 1114111) { // L: 332
								var11 = 65533; // L: 333
							} else {
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 335
						}
					} else {
						var11 = 65533; // L: 337
					}
				}

				String var3 = new String(var6, 0, var7); // L: 340
				this.offset += var2; // L: 343
				return var3; // L: 344
			}
		}
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-2014110901"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1]; // L: 348
		}

	} // L: 349

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "875734256"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 352
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152; // L: 353 354
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1283658901"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 358
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768; // L: 359 360
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1077896012"
	)
	public int method9277() {
		int var1 = this.array[this.offset] & 255; // L: 364
		return var1 < 128 ? this.readUnsignedByte() - 1 : this.readUnsignedShort() - 32769; // L: 365 366
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "75"
	)
	public int method9278() {
		int var1 = 0; // L: 370

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) { // L: 371 372 374
			var1 += 32767; // L: 373
		}

		var1 += var2; // L: 376
		return var1; // L: 377
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2102511661"
	)
	public int method9279() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort(); // L: 381 382
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1637265381"
	)
	public int method9280() {
		if (this.array[this.offset] < 0) { // L: 386
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort(); // L: 387
			return var1 == 32767 ? -1 : var1; // L: 388
		}
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-29"
	)
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[++this.offset - 1]; // L: 393

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) { // L: 394 395 397
			var2 = (var2 | var1 & 127) << 7; // L: 396
		}

		return var2 | var1; // L: 399
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1675409719"
	)
	public int method9341() {
		int var2 = 0; // L: 404
		int var3 = 0; // L: 405

		int var1;
		do {
			var1 = this.readUnsignedByte(); // L: 407
			var2 |= (var1 & 127) << var3; // L: 408
			var3 += 7; // L: 409
		} while(var1 > 127); // L: 410

		return var2; // L: 411
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "2139836666"
	)
	@Export("xteaEncryptAll")
	public void xteaEncryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 415
		this.offset = 0; // L: 416

		for (int var3 = 0; var3 < var2; ++var3) { // L: 417
			int var4 = this.readInt(); // L: 418
			int var5 = this.readInt(); // L: 419
			int var6 = 0; // L: 420
			int var7 = -1640531527; // L: 421

			for (int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) { // L: 422 423 426
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]; // L: 424
				var6 += var7; // L: 425
			}

			this.offset -= 8; // L: 428
			this.writeInt(var4); // L: 429
			this.writeInt(var5); // L: 430
		}

	} // L: 432

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "-1034826768"
	)
	@Export("xteaDecryptAll")
	public void xteaDecryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 435
		this.offset = 0; // L: 436

		for (int var3 = 0; var3 < var2; ++var3) { // L: 437
			int var4 = this.readInt(); // L: 438
			int var5 = this.readInt(); // L: 439
			int var6 = -957401312; // L: 440
			int var7 = -1640531527; // L: 441

			for (int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) { // L: 442 443 446
				var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6; // L: 444
				var6 -= var7; // L: 445
			}

			this.offset -= 8; // L: 448
			this.writeInt(var4); // L: 449
			this.writeInt(var5); // L: 450
		}

	} // L: 452

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "([IIIB)V",
		garbageValue = "-6"
	)
	@Export("xteaEncrypt")
	public void xteaEncrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 455
		this.offset = var2; // L: 456
		int var5 = (var3 - var2) / 8; // L: 457

		for (int var6 = 0; var6 < var5; ++var6) { // L: 458
			int var7 = this.readInt(); // L: 459
			int var8 = this.readInt(); // L: 460
			int var9 = 0; // L: 461
			int var10 = -1640531527; // L: 462

			for (int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) { // L: 463 464 467
				var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]; // L: 465
				var9 += var10; // L: 466
			}

			this.offset -= 8; // L: 469
			this.writeInt(var7); // L: 470
			this.writeInt(var8); // L: 471
		}

		this.offset = var4; // L: 473
	} // L: 474

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "1763762234"
	)
	@Export("xteaDecrypt")
	public void xteaDecrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 477
		this.offset = var2; // L: 478
		int var5 = (var3 - var2) / 8; // L: 479

		for (int var6 = 0; var6 < var5; ++var6) { // L: 480
			int var7 = this.readInt(); // L: 481
			int var8 = this.readInt(); // L: 482
			int var9 = -957401312; // L: 483
			int var10 = -1640531527; // L: 484

			for (int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) { // L: 485 486 489
				var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9; // L: 487
				var9 -= var10; // L: 488
			}

			this.offset -= 8; // L: 491
			this.writeInt(var7); // L: 492
			this.writeInt(var8); // L: 493
		}

		this.offset = var4; // L: 495
	} // L: 496

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
		garbageValue = "-2126574510"
	)
	@Export("encryptRsa")
	public void encryptRsa(BigInteger var1, BigInteger var2) {
		int var3 = this.offset; // L: 499
		this.offset = 0; // L: 500
		byte[] var4 = new byte[var3]; // L: 501
		this.readBytes(var4, 0, var3); // L: 502
		BigInteger var5 = new BigInteger(var4); // L: 503
		BigInteger var6 = var5.modPow(var1, var2); // L: 504
		byte[] var7 = var6.toByteArray(); // L: 505
		this.offset = 0; // L: 506
		this.writeShort(var7.length); // L: 507
		this.writeBytes(var7, 0, var7.length); // L: 508
	} // L: 509

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "36"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		int var2 = class174.method3540(this.array, var1, this.offset); // L: 512
		this.writeInt(var2); // L: 513
		return var2; // L: 514
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1490830987"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4; // L: 518
		int var1 = class174.method3540(this.array, 0, this.offset); // L: 519
		int var2 = this.readInt(); // L: 520
		return var2 == var1; // L: 521
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1106007511"
	)
	public void method9290(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 526
	} // L: 527

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "110"
	)
	public void method9291(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1); // L: 530
	} // L: 531

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-861052915"
	)
	public void method9292(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1); // L: 534
	} // L: 535

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-756845354"
	)
	public int method9496() {
		return this.array[++this.offset - 1] - 128 & 255; // L: 538
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2085859197"
	)
	public int method9294() {
		return 0 - this.array[++this.offset - 1] & 255; // L: 542
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2004918107"
	)
	public int method9295() {
		return 128 - this.array[++this.offset - 1] & 255; // L: 546
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "21885876"
	)
	public byte method9296() {
		return (byte)(this.array[++this.offset - 1] - 128); // L: 550
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "101"
	)
	public byte method9297() {
		return (byte)(0 - this.array[++this.offset - 1]); // L: 554
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "1189405453"
	)
	public byte method9298() {
		return (byte)(128 - this.array[++this.offset - 1]); // L: 558
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "642088344"
	)
	public void method9299(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 562
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 563
	} // L: 564

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2051245858"
	)
	public void method9300(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 567
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 568
	} // L: 569

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-436427063"
	)
	public void method9490(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 572
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 573
	} // L: 574

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "113"
	)
	public int method9302() {
		this.offset += 2; // L: 577
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 578
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "201481069"
	)
	public int method9303() {
		this.offset += 2; // L: 582
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 583
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	public int method9304() {
		this.offset += 2; // L: 587
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 588
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "88"
	)
	public int method9305() {
		this.offset += 2; // L: 592
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 593
		if (var1 > 32767) { // L: 594
			var1 -= 65536;
		}

		return var1; // L: 595
	}

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1774495709"
	)
	public int method9306() {
		this.offset += 2; // L: 599
		int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 600
		if (var1 > 32767) { // L: 601
			var1 -= 65536;
		}

		return var1; // L: 602
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1535378058"
	)
	public int method9307() {
		this.offset += 2; // L: 606
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 607
		if (var1 > 32767) { // L: 608
			var1 -= 65536;
		}

		return var1; // L: 609
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "228979090"
	)
	public void method9314(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 613
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 614
		this.array[++this.offset - 1] = (byte)var1; // L: 615
	} // L: 616

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "6"
	)
	public int method9418() {
		this.offset += 3; // L: 619
		return (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16); // L: 620
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "104"
	)
	public int method9310() {
		this.offset += 3; // L: 624
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 2] & 255); // L: 625
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-46"
	)
	public int method9249() {
		this.offset += 3; // L: 629
		int var1 = (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16); // L: 630
		if (var1 > 8388607) { // L: 631
			var1 -= 16777216;
		}

		return var1; // L: 632
	}

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "71"
	)
	public int method9251() {
		this.offset += 3; // L: 636
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 2] & 255); // L: 637
		if (var1 > 8388607) { // L: 638
			var1 -= 16777216;
		}

		return var1; // L: 639
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "55"
	)
	public int method9313() {
		this.offset += 3; // L: 643
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16); // L: 644
		if (var1 > 8388607) { // L: 645
			var1 -= 16777216;
		}

		return var1; // L: 646
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "392771780"
	)
	public void method9311(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 650
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 651
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 652
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 653
	} // L: 654

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "20"
	)
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 657
		this.array[++this.offset - 1] = (byte)var1; // L: 658
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 659
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 660
	} // L: 661

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "116974832"
	)
	public void method9316(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 664
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 665
		this.array[++this.offset - 1] = (byte)var1; // L: 666
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 667
	} // L: 668

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1727101871"
	)
	public int method9317() {
		this.offset += 4; // L: 671
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24); // L: 672
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "126"
	)
	public int method9318() {
		this.offset += 4; // L: 676
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16); // L: 677
	}

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1456274575"
	)
	public int method9319() {
		this.offset += 4; // L: 681
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24); // L: 682
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1299498311"
	)
	public void method9375(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) { // L: 686
			var1[var4] = this.array[++this.offset - 1];
		}

	} // L: 687

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "22"
	)
	public void method9321(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = (byte)(this.array[++this.offset - 1] - 128); // L: 690
		}

	} // L: 691
}
