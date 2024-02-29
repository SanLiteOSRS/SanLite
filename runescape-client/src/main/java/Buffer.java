import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uq")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("au")
	@Export("crc32Table")
	static int[] crc32Table;
	@ObfuscatedName("ah")
	@Export("crc64Table")
	static long[] crc64Table;
	@ObfuscatedName("az")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1391428115
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
		this.array = ClanChannelMember.ByteArrayPool_getArrayBool(var1, var2); // L: 61
	} // L: 62

	public Buffer(int var1) {
		this.array = class342.ByteArrayPool_getArray(var1); // L: 56
		this.offset = 0; // L: 57
	} // L: 58

	public Buffer(byte[] var1) {
		this.array = var1; // L: 65
		this.offset = 0; // L: 66
	} // L: 67

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "567"
	)
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) { // L: 70
			ClanChannelMember.ByteArrayPool_release(this.array);
		}

		this.array = null; // L: 71
	} // L: 72

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "35"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 75
	} // L: 76

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-128"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 79
		this.array[++this.offset - 1] = (byte)var1; // L: 80
	} // L: 81

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-122"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 84
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 85
		this.array[++this.offset - 1] = (byte)var1; // L: 86
	} // L: 87

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2142830713"
	)
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 90
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 91
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 92
		this.array[++this.offset - 1] = (byte)var1; // L: 93
	} // L: 94

	@ObfuscatedName("bv")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 97
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 98
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 99
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 100
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 101
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 102
	} // L: 103

	@ObfuscatedName("by")
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

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-74"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0); // L: 117
	} // L: 118

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1470068557"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0); // L: 125
		if (var2 >= 0) { // L: 126
			throw new IllegalArgumentException("");
		} else {
			this.offset += ParamComposition.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 127
			this.array[++this.offset - 1] = 0; // L: 128
		}
	} // L: 129

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-645902063"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0); // L: 136
		if (var2 >= 0) { // L: 137
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0; // L: 138
			this.offset += ParamComposition.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 139
			this.array[++this.offset - 1] = 0; // L: 140
		}
	} // L: 141

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)V",
		garbageValue = "-1950965990"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var3 = var1.length(); // L: 146
		int var4 = 0; // L: 147

		for (int var5 = 0; var5 < var3; ++var5) { // L: 148
			char var6 = var1.charAt(var5); // L: 149
			if (var6 <= 127) { // L: 150
				++var4;
			} else if (var6 <= 2047) { // L: 151
				var4 += 2;
			} else {
				var4 += 3; // L: 152
			}
		}

		this.array[++this.offset - 1] = 0; // L: 157
		this.writeVarInt(var4); // L: 158
		this.offset += class479.method8756(this.array, this.offset, var1); // L: 159
	} // L: 160

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-226952323"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) { // L: 163
			this.array[++this.offset - 1] = var1[var4];
		}

	} // L: 164

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "1071189231"
	)
	public void method9467(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset); // L: 167
	} // L: 168

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "98"
	)
	@Export("writeLengthInt")
	public void writeLengthInt(int var1) {
		if (var1 < 0) { // L: 171
			throw new IllegalArgumentException(); // L: 172
		} else {
			this.array[this.offset - var1 - 4] = (byte)(var1 >> 24); // L: 174
			this.array[this.offset - var1 - 3] = (byte)(var1 >> 16); // L: 175
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 176
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 177
		}
	} // L: 178

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1650465399"
	)
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) { // L: 181
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 184
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 185
		} else {
			throw new IllegalArgumentException(); // L: 182
		}
	} // L: 186

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1754226121"
	)
	public void method9470(int var1) {
		if (var1 >= 0 && var1 <= 255) { // L: 189
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 192
		} else {
			throw new IllegalArgumentException(); // L: 190
		}
	} // L: 193

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "2"
	)
	@Export("writeSmartByteShort")
	public void writeSmartByteShort(int var1) {
		if (var1 >= 0 && var1 < 128) { // L: 196
			this.writeByte(var1); // L: 197
		} else if (var1 >= 0 && var1 < 32768) { // L: 200
			this.writeShort(var1 + 32768); // L: 201
		} else {
			throw new IllegalArgumentException(); // L: 204
		}
	} // L: 198 202

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1092799251"
	)
	@Export("writeVarInt")
	public void writeVarInt(int var1) {
		if ((var1 & -128) != 0) { // L: 208
			if ((var1 & -16384) != 0) { // L: 209
				if ((var1 & -2097152) != 0) { // L: 210
					if ((var1 & -268435456) != 0) { // L: 211
						this.writeByte(var1 >>> 28 | 128);
					}

					this.writeByte(var1 >>> 21 | 128); // L: 212
				}

				this.writeByte(var1 >>> 14 | 128); // L: 214
			}

			this.writeByte(var1 >>> 7 | 128); // L: 216
		}

		this.writeByte(var1 & 127); // L: 218
	} // L: 219

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "572182330"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255; // L: 222
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-790004227"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1]; // L: 226
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1657423869"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2; // L: 230
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 231
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("readShort")
	public int readShort() {
		this.offset += 2; // L: 235
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 236
		if (var1 > 32767) { // L: 237
			var1 -= 65536;
		}

		return var1; // L: 238
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "13"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3; // L: 242
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 243
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "633994299"
	)
	public int method9478() {
		this.offset += 3; // L: 247
		int var1 = ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 248
		if (var1 > 8388607) { // L: 249
			var1 -= 16777216;
		}

		return var1; // L: 250
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-359822325"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 4; // L: 254
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24); // L: 255
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-1024744877"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L; // L: 259
		long var3 = (long)this.readInt() & 4294967295L; // L: 260
		return var3 + (var1 << 32); // L: 261
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "-830415919"
	)
	public float method9481() {
		return Float.intBitsToFloat(this.readInt()); // L: 265
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1845409448"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1; // L: 269
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-4"
	)
	@Export("readStringCp1252NullTerminatedOrNull")
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset] == 0) { // L: 273
			++this.offset; // L: 274
			return null; // L: 275
		} else {
			return this.readStringCp1252NullTerminated(); // L: 277
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-906058759"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset; // L: 281

		while (this.array[++this.offset - 1] != 0) { // L: 282
		}

		int var2 = this.offset - var1 - 1; // L: 283
		return var2 == 0 ? "" : class102.decodeStringCp1252(this.array, var1, var2); // L: 284 285
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-40"
	)
	@Export("readStringCp1252NullCircumfixed")
	public String readStringCp1252NullCircumfixed() {
		byte var1 = this.array[++this.offset - 1]; // L: 289
		if (var1 != 0) { // L: 290
			throw new IllegalStateException("");
		} else {
			int var2 = this.offset; // L: 291

			while (this.array[++this.offset - 1] != 0) { // L: 292
			}

			int var3 = this.offset - var2 - 1; // L: 293
			return var3 == 0 ? "" : class102.decodeStringCp1252(this.array, var2, var3); // L: 294 295
		}
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-626768541"
	)
	@Export("readCESU8")
	public String readCESU8() {
		byte var1 = this.array[++this.offset - 1]; // L: 299
		if (var1 != 0) { // L: 300
			throw new IllegalStateException("");
		} else {
			int var2 = this.readVarInt(); // L: 301
			if (var2 + this.offset > this.array.length) { // L: 302
				throw new IllegalStateException("");
			} else {
				byte[] var4 = this.array; // L: 304
				int var5 = this.offset; // L: 305
				char[] var6 = new char[var2]; // L: 307
				int var7 = 0; // L: 308
				int var8 = var5; // L: 309

				int var11;
				for (int var9 = var5 + var2; var8 < var9; var6[var7++] = (char)var11) { // L: 310 311 342
					int var10 = var4[var8++] & 255; // L: 312
					if (var10 < 128) { // L: 314
						if (var10 == 0) { // L: 315
							var11 = 65533;
						} else {
							var11 = var10; // L: 316
						}
					} else if (var10 < 192) { // L: 318
						var11 = 65533;
					} else if (var10 < 224) { // L: 319
						if (var8 < var9 && (var4[var8] & 192) == 128) { // L: 320
							var11 = (var10 & 31) << 6 | var4[var8++] & 63; // L: 321
							if (var11 < 128) { // L: 322
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 324
						}
					} else if (var10 < 240) { // L: 326
						if (var8 + 1 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128) { // L: 327
							var11 = (var10 & 15) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63; // L: 328
							if (var11 < 2048) { // L: 329
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 331
						}
					} else if (var10 < 248) { // L: 333
						if (var8 + 2 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128 && (var4[var8 + 2] & 192) == 128) { // L: 334
							var11 = (var10 & 7) << 18 | (var4[var8++] & 63) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63; // L: 335
							if (var11 >= 65536 && var11 <= 1114111) { // L: 336
								var11 = 65533; // L: 337
							} else {
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 339
						}
					} else {
						var11 = 65533; // L: 341
					}
				}

				String var3 = new String(var6, 0, var7); // L: 344
				this.offset += var2; // L: 347
				return var3; // L: 348
			}
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "-30"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1]; // L: 352
		}

	} // L: 353

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "14"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 356
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152; // L: 357 358
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "70756061"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 362
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768; // L: 363 364
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "233350583"
	)
	public int method9490() {
		int var1 = this.array[this.offset] & 255; // L: 368
		return var1 < 128 ? this.readUnsignedByte() - 1 : this.readUnsignedShort() - 32769; // L: 369 370
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1762269672"
	)
	public int method9660() {
		int var1 = 0; // L: 374

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) { // L: 375 376 378
			var1 += 32767; // L: 377
		}

		var1 += var2; // L: 380
		return var1; // L: 381
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "197998607"
	)
	public int method9625() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort(); // L: 385 386
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "61"
	)
	public int method9693() {
		if (this.array[this.offset] < 0) { // L: 390
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort(); // L: 391
			return var1 == 32767 ? -1 : var1; // L: 392
		}
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-859238543"
	)
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[++this.offset - 1]; // L: 397

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) { // L: 398 399 401
			var2 = (var2 | var1 & 127) << 7; // L: 400
		}

		return var2 | var1; // L: 403
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2044788704"
	)
	public int method9539() {
		int var2 = 0; // L: 408
		int var3 = 0; // L: 409

		int var1;
		do {
			var1 = this.readUnsignedByte(); // L: 411
			var2 |= (var1 & 127) << var3; // L: 412
			var3 += 7; // L: 413
		} while(var1 > 127); // L: 414

		return var2; // L: 415
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "1140297337"
	)
	@Export("xteaEncryptAll")
	public void xteaEncryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 419
		this.offset = 0; // L: 420

		for (int var3 = 0; var3 < var2; ++var3) { // L: 421
			int var4 = this.readInt(); // L: 422
			int var5 = this.readInt(); // L: 423
			int var6 = 0; // L: 424
			int var7 = -1640531527; // L: 425

			for (int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) { // L: 426 427 430
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]; // L: 428
				var6 += var7; // L: 429
			}

			this.offset -= 8; // L: 432
			this.writeInt(var4); // L: 433
			this.writeInt(var5); // L: 434
		}

	} // L: 436

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "1227261497"
	)
	@Export("xteaDecryptAll")
	public void xteaDecryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 439
		this.offset = 0; // L: 440

		for (int var3 = 0; var3 < var2; ++var3) { // L: 441
			int var4 = this.readInt(); // L: 442
			int var5 = this.readInt(); // L: 443
			int var6 = -957401312; // L: 444
			int var7 = -1640531527; // L: 445

			for (int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) { // L: 446 447 450
				var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6; // L: 448
				var6 -= var7; // L: 449
			}

			this.offset -= 8; // L: 452
			this.writeInt(var4); // L: 453
			this.writeInt(var5); // L: 454
		}

	} // L: 456

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "4532033"
	)
	@Export("xteaEncrypt")
	public void xteaEncrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 459
		this.offset = var2; // L: 460
		int var5 = (var3 - var2) / 8; // L: 461

		for (int var6 = 0; var6 < var5; ++var6) { // L: 462
			int var7 = this.readInt(); // L: 463
			int var8 = this.readInt(); // L: 464
			int var9 = 0; // L: 465
			int var10 = -1640531527; // L: 466

			for (int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) { // L: 467 468 471
				var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]; // L: 469
				var9 += var10; // L: 470
			}

			this.offset -= 8; // L: 473
			this.writeInt(var7); // L: 474
			this.writeInt(var8); // L: 475
		}

		this.offset = var4; // L: 477
	} // L: 478

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "-791042194"
	)
	@Export("xteaDecrypt")
	public void xteaDecrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 481
		this.offset = var2; // L: 482
		int var5 = (var3 - var2) / 8; // L: 483

		for (int var6 = 0; var6 < var5; ++var6) { // L: 484
			int var7 = this.readInt(); // L: 485
			int var8 = this.readInt(); // L: 486
			int var9 = -957401312; // L: 487
			int var10 = -1640531527; // L: 488

			for (int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) { // L: 489 490 493
				var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9; // L: 491
				var9 -= var10; // L: 492
			}

			this.offset -= 8; // L: 495
			this.writeInt(var7); // L: 496
			this.writeInt(var8); // L: 497
		}

		this.offset = var4; // L: 499
	} // L: 500

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
		garbageValue = "1219492487"
	)
	@Export("encryptRsa")
	public void encryptRsa(BigInteger var1, BigInteger var2) {
		int var3 = this.offset; // L: 503
		this.offset = 0; // L: 504
		byte[] var4 = new byte[var3]; // L: 505
		this.readBytes(var4, 0, var3); // L: 506
		BigInteger var5 = new BigInteger(var4); // L: 507
		BigInteger var6 = var5.modPow(var1, var2); // L: 508
		byte[] var7 = var6.toByteArray(); // L: 509
		this.offset = 0; // L: 510
		this.writeShort(var7.length); // L: 511
		this.writeBytes(var7, 0, var7.length); // L: 512
	} // L: 513

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1918270255"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		int var2 = class409.method7646(this.array, var1, this.offset); // L: 516
		this.writeInt(var2); // L: 517
		return var2; // L: 518
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-38"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4; // L: 522
		int var1 = class409.method7646(this.array, 0, this.offset); // L: 523
		int var2 = this.readInt(); // L: 524
		return var1 == var2; // L: 525
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1569233503"
	)
	public void method9503(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 530
	} // L: 531

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "293507113"
	)
	public void method9540(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1); // L: 534
	} // L: 535

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "18113"
	)
	public void method9505(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1); // L: 538
	} // L: 539

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1014016556"
	)
	public int method9506() {
		return this.array[++this.offset - 1] - 128 & 255; // L: 542
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-696296180"
	)
	public int method9605() {
		return 0 - this.array[++this.offset - 1] & 255; // L: 546
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "117"
	)
	public int method9579() {
		return 128 - this.array[++this.offset - 1] & 255; // L: 550
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-292477075"
	)
	public byte method9509() {
		return (byte)(this.array[++this.offset - 1] - 128); // L: 554
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "98"
	)
	public byte method9510() {
		return (byte)(0 - this.array[++this.offset - 1]); // L: 558
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-2131664290"
	)
	public byte method9511() {
		return (byte)(128 - this.array[++this.offset - 1]); // L: 562
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1575040763"
	)
	public void method9508(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 566
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 567
	} // L: 568

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "85"
	)
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 571
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 572
	} // L: 573

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2014932929"
	)
	public void method9548(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 576
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 577
	} // L: 578

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-162169443"
	)
	public int method9703() {
		this.offset += 2; // L: 581
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 582
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1738192267"
	)
	public int method9636() {
		this.offset += 2; // L: 586
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 587
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2073579817"
	)
	public int method9492() {
		this.offset += 2; // L: 591
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 592
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-583766410"
	)
	public int method9518() {
		this.offset += 2; // L: 596
		int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 597
		if (var1 > 32767) { // L: 598
			var1 -= 65536;
		}

		return var1; // L: 599
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "56223869"
	)
	public int method9519() {
		this.offset += 2; // L: 603
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 604
		if (var1 > 32767) { // L: 605
			var1 -= 65536;
		}

		return var1; // L: 606
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "48"
	)
	public void method9699(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 610
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 611
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 612
	} // L: 613

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2013654924"
	)
	public int method9521() {
		this.offset += 3; // L: 616
		return (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16); // L: 617
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "835224634"
	)
	public int method9522() {
		this.offset += 3; // L: 621
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 2] & 255); // L: 622
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1986049442"
	)
	public int method9523() {
		this.offset += 3; // L: 626
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16); // L: 627
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "2"
	)
	public int method9524() {
		this.offset += 3; // L: 631
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16); // L: 632
		if (var1 > 8388607) { // L: 633
			var1 -= 16777216;
		}

		return var1; // L: 634
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-759037753"
	)
	public void method9525(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 638
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 639
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 640
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 641
	} // L: 642

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1954354221"
	)
	public void method9677(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 645
		this.array[++this.offset - 1] = (byte)var1; // L: 646
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 647
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 648
	} // L: 649

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "89"
	)
	public void method9528(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 652
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 653
		this.array[++this.offset - 1] = (byte)var1; // L: 654
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 655
	} // L: 656

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1007653131"
	)
	public int method9585() {
		this.offset += 4; // L: 659
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24); // L: 660
	}

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "315509233"
	)
	public int method9529() {
		this.offset += 4; // L: 664
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16); // L: 665
	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1126311574"
	)
	public int method9530() {
		this.offset += 4; // L: 669
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24); // L: 670
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1501516408"
	)
	public void method9531(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) { // L: 674
			var1[var4] = this.array[++this.offset - 1];
		}

	} // L: 675

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1681196512"
	)
	public void method9562(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = (byte)(this.array[++this.offset - 1] - 128); // L: 678
		}

	} // L: 679
}
