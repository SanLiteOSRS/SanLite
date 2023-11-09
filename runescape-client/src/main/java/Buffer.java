import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qr")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -239726065
	)
	@Export("clientType")
	public static int clientType;
	@ObfuscatedName("r")
	@Export("crc32Table")
	static int[] crc32Table;
	@ObfuscatedName("s")
	@Export("crc64Table")
	static long[] crc64Table;
	@ObfuscatedName("d")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 891446433
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
				if (1L == (var0 & 1L)) { // L: 39
					var0 = var0 >>> 1 ^ -3932672073523589310L;
				} else {
					var0 >>>= 1; // L: 40
				}
			}

			crc64Table[var2] = var0; // L: 42
		}

	} // L: 44

	public Buffer(int var1) {
		this.array = KeyHandler.ByteArrayPool_getArray(var1); // L: 60
		this.offset = 0; // L: 61
	} // L: 62

	public Buffer(byte[] var1) {
		this.array = var1; // L: 65
		this.offset = 0; // L: 66
	} // L: 67

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1237610073"
	)
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) { // L: 70
			class199.ByteArrayPool_release(this.array);
		}

		this.array = null; // L: 71
	} // L: 72

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "22"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 75
	} // L: 76

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1328461607"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 79
		this.array[++this.offset - 1] = (byte)var1; // L: 80
	} // L: 81

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "473574854"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 84
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 85
		this.array[++this.offset - 1] = (byte)var1; // L: 86
	} // L: 87

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1354953136"
	)
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 90
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 91
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 92
		this.array[++this.offset - 1] = (byte)var1; // L: 93
	} // L: 94

	@ObfuscatedName("at")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 97
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 98
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 99
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 100
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 101
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 102
	} // L: 103

	@ObfuscatedName("ar")
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-271182785"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0); // L: 117
	} // L: 118

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "11"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0); // L: 125
		if (var2 >= 0) { // L: 126
			throw new IllegalArgumentException("");
		} else {
			this.offset += class309.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 127
			this.array[++this.offset - 1] = 0; // L: 128
		}
	} // L: 129

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "863547791"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0); // L: 132
		if (var2 >= 0) { // L: 133
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0; // L: 134
			this.offset += class309.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 135
			this.array[++this.offset - 1] = 0; // L: 136
		}
	} // L: 137

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)V",
		garbageValue = "-1075626285"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var3 = var1.length(); // L: 142
		int var4 = 0; // L: 143

		int var5;
		for (var5 = 0; var5 < var3; ++var5) { // L: 144
			char var12 = var1.charAt(var5); // L: 145
			if (var12 <= 127) { // L: 146
				++var4;
			} else if (var12 <= 2047) { // L: 147
				var4 += 2;
			} else {
				var4 += 3; // L: 148
			}
		}

		this.array[++this.offset - 1] = 0; // L: 153
		this.writeVarInt(var4); // L: 154
		var4 = this.offset; // L: 155
		byte[] var6 = this.array; // L: 157
		int var7 = this.offset; // L: 158
		int var8 = var1.length(); // L: 160
		int var9 = var7; // L: 161

		for (int var10 = 0; var10 < var8; ++var10) { // L: 162
			char var11 = var1.charAt(var10); // L: 163
			if (var11 <= 127) { // L: 164
				var6[var9++] = (byte)var11; // L: 165
			} else if (var11 <= 2047) { // L: 167
				var6[var9++] = (byte)(192 | var11 >> 6); // L: 168
				var6[var9++] = (byte)(128 | var11 & '?'); // L: 169
			} else {
				var6[var9++] = (byte)(224 | var11 >> '\f'); // L: 172
				var6[var9++] = (byte)(128 | var11 >> 6 & 63); // L: 173
				var6[var9++] = (byte)(128 | var11 & '?'); // L: 174
			}
		}

		var5 = var9 - var7; // L: 177
		this.offset = var5 + var4; // L: 179
	} // L: 180

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-1223476348"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) { // L: 183
			this.array[++this.offset - 1] = var1[var4];
		}

	} // L: 184

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "1854068035"
	)
	public void method8397(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset); // L: 187
	} // L: 188

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-65"
	)
	@Export("writeLengthInt")
	public void writeLengthInt(int var1) {
		if (var1 < 0) { // L: 191
			throw new IllegalArgumentException(); // L: 192
		} else {
			this.array[this.offset - var1 - 4] = (byte)(var1 >> 24); // L: 194
			this.array[this.offset - var1 - 3] = (byte)(var1 >> 16); // L: 195
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 196
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 197
		}
	} // L: 198

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-115"
	)
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) { // L: 201
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 204
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 205
		} else {
			throw new IllegalArgumentException(); // L: 202
		}
	} // L: 206

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1399504196"
	)
	public void method8433(int var1) {
		if (var1 >= 0 && var1 <= 255) { // L: 209
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 212
		} else {
			throw new IllegalArgumentException(); // L: 210
		}
	} // L: 213

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-949273674"
	)
	@Export("writeSmartByteShort")
	public void writeSmartByteShort(int var1) {
		if (var1 >= 0 && var1 < 128) { // L: 216
			this.writeByte(var1); // L: 217
		} else if (var1 >= 0 && var1 < 32768) { // L: 220
			this.writeShort(var1 + 32768); // L: 221
		} else {
			throw new IllegalArgumentException(); // L: 224
		}
	} // L: 218 222

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1267550507"
	)
	@Export("writeVarInt")
	public void writeVarInt(int var1) {
		if ((var1 & -128) != 0) { // L: 228
			if ((var1 & -16384) != 0) { // L: 229
				if ((var1 & -2097152) != 0) { // L: 230
					if ((var1 & -268435456) != 0) { // L: 231
						this.writeByte(var1 >>> 28 | 128);
					}

					this.writeByte(var1 >>> 21 | 128); // L: 232
				}

				this.writeByte(var1 >>> 14 | 128); // L: 234
			}

			this.writeByte(var1 >>> 7 | 128); // L: 236
		}

		this.writeByte(var1 & 127); // L: 238
	} // L: 239

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "232575601"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255; // L: 242
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "2096707037"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1]; // L: 246
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2033967160"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2; // L: 250
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 251
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("readShort")
	public int readShort() {
		this.offset += 2; // L: 255
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 256
		if (var1 > 32767) { // L: 257
			var1 -= 65536;
		}

		return var1; // L: 258
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1594438973"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3; // L: 262
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 263
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-4"
	)
	public int method8407() {
		this.offset += 3; // L: 267
		int var1 = ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 268
		if (var1 > 8388607) { // L: 269
			var1 -= 16777216;
		}

		return var1; // L: 270
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1910210360"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 4; // L: 274
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24); // L: 275
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "57"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L; // L: 279
		long var3 = (long)this.readInt() & 4294967295L; // L: 280
		return var3 + (var1 << 32); // L: 281
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "706199561"
	)
	public float method8410() {
		return Float.intBitsToFloat(this.readInt()); // L: 285
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1242825594"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1; // L: 289
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1989374737"
	)
	@Export("readStringCp1252NullTerminatedOrNull")
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset] == 0) { // L: 293
			++this.offset; // L: 294
			return null; // L: 295
		} else {
			return this.readStringCp1252NullTerminated(); // L: 297
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1405381292"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset; // L: 301

		while (this.array[++this.offset - 1] != 0) { // L: 302
		}

		int var2 = this.offset - var1 - 1; // L: 303
		return var2 == 0 ? "" : class125.decodeStringCp1252(this.array, var1, var2); // L: 304 305
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1078204693"
	)
	@Export("readStringCp1252NullCircumfixed")
	public String readStringCp1252NullCircumfixed() {
		byte var1 = this.array[++this.offset - 1]; // L: 309
		if (var1 != 0) { // L: 310
			throw new IllegalStateException("");
		} else {
			int var2 = this.offset; // L: 311

			while (this.array[++this.offset - 1] != 0) { // L: 312
			}

			int var3 = this.offset - var2 - 1; // L: 313
			return var3 == 0 ? "" : class125.decodeStringCp1252(this.array, var2, var3); // L: 314 315
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-336127549"
	)
	@Export("readCESU8")
	public String readCESU8() {
		byte var1 = this.array[++this.offset - 1]; // L: 319
		if (var1 != 0) { // L: 320
			throw new IllegalStateException("");
		} else {
			int var2 = this.readVarInt(); // L: 321
			if (var2 + this.offset > this.array.length) { // L: 322
				throw new IllegalStateException("");
			} else {
				byte[] var4 = this.array; // L: 324
				int var5 = this.offset; // L: 325
				char[] var6 = new char[var2]; // L: 327
				int var7 = 0; // L: 328
				int var8 = var5; // L: 329

				int var11;
				for (int var9 = var5 + var2; var8 < var9; var6[var7++] = (char)var11) { // L: 330 331 362
					int var10 = var4[var8++] & 255; // L: 332
					if (var10 < 128) { // L: 334
						if (var10 == 0) { // L: 335
							var11 = 65533;
						} else {
							var11 = var10; // L: 336
						}
					} else if (var10 < 192) { // L: 338
						var11 = 65533;
					} else if (var10 < 224) { // L: 339
						if (var8 < var9 && (var4[var8] & 192) == 128) { // L: 340
							var11 = (var10 & 31) << 6 | var4[var8++] & 63; // L: 341
							if (var11 < 128) { // L: 342
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 344
						}
					} else if (var10 < 240) { // L: 346
						if (var8 + 1 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128) { // L: 347
							var11 = (var10 & 15) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63; // L: 348
							if (var11 < 2048) { // L: 349
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 351
						}
					} else if (var10 < 248) { // L: 353
						if (var8 + 2 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128 && (var4[var8 + 2] & 192) == 128) { // L: 354
							var11 = (var10 & 7) << 18 | (var4[var8++] & 63) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63; // L: 355
							if (var11 >= 65536 && var11 <= 1114111) { // L: 356
								var11 = 65533; // L: 357
							} else {
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 359
						}
					} else {
						var11 = 65533; // L: 361
					}
				}

				String var3 = new String(var6, 0, var7); // L: 364
				this.offset += var2; // L: 367
				return var3; // L: 368
			}
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "125672188"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1]; // L: 372
		}

	} // L: 373

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1661884516"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 376
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152; // L: 377 378
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 382
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768; // L: 383 384
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1252482449"
	)
	public int method8641() {
		int var1 = this.array[this.offset] & 255; // L: 388
		return var1 < 128 ? this.readUnsignedByte() - 1 : this.readUnsignedShort() - 32769; // L: 389 390
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "27"
	)
	public int method8420() {
		int var1 = 0; // L: 394

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) { // L: 395 396 398
			var1 += 32767; // L: 397
		}

		var1 += var2; // L: 400
		return var1; // L: 401
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "24"
	)
	public int method8421() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort(); // L: 405 406
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "878697856"
	)
	public int method8422() {
		if (this.array[this.offset] < 0) { // L: 410
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort(); // L: 411
			return var1 == 32767 ? -1 : var1; // L: 412
		}
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "112"
	)
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[++this.offset - 1]; // L: 417

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) { // L: 418 419 421
			var2 = (var2 | var1 & 127) << 7; // L: 420
		}

		return var2 | var1; // L: 423
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-158016658"
	)
	public int method8424() {
		int var2 = 0; // L: 428
		int var3 = 0; // L: 429

		int var1;
		do {
			var1 = this.readUnsignedByte(); // L: 431
			var2 |= (var1 & 127) << var3; // L: 432
			var3 += 7; // L: 433
		} while(var1 > 127); // L: 434

		return var2; // L: 435
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "-473126431"
	)
	@Export("xteaEncryptAll")
	public void xteaEncryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 439
		this.offset = 0; // L: 440

		for (int var3 = 0; var3 < var2; ++var3) { // L: 441
			int var4 = this.readInt(); // L: 442
			int var5 = this.readInt(); // L: 443
			int var6 = 0; // L: 444
			int var7 = -1640531527; // L: 445

			for (int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) { // L: 446 447 450
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]; // L: 448
				var6 += var7; // L: 449
			}

			this.offset -= 8; // L: 452
			this.writeInt(var4); // L: 453
			this.writeInt(var5); // L: 454
		}

	} // L: 456

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "-986062123"
	)
	@Export("xteaDecryptAll")
	public void xteaDecryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 459
		this.offset = 0; // L: 460

		for (int var3 = 0; var3 < var2; ++var3) { // L: 461
			int var4 = this.readInt(); // L: 462
			int var5 = this.readInt(); // L: 463
			int var6 = -957401312; // L: 464
			int var7 = -1640531527; // L: 465

			for (int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) { // L: 466 467 470
				var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6; // L: 468
				var6 -= var7; // L: 469
			}

			this.offset -= 8; // L: 472
			this.writeInt(var4); // L: 473
			this.writeInt(var5); // L: 474
		}

	} // L: 476

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "-2111588075"
	)
	@Export("xteaEncrypt")
	public void xteaEncrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 479
		this.offset = var2; // L: 480
		int var5 = (var3 - var2) / 8; // L: 481

		for (int var6 = 0; var6 < var5; ++var6) { // L: 482
			int var7 = this.readInt(); // L: 483
			int var8 = this.readInt(); // L: 484
			int var9 = 0; // L: 485
			int var10 = -1640531527; // L: 486

			for (int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) { // L: 487 488 491
				var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]; // L: 489
				var9 += var10; // L: 490
			}

			this.offset -= 8; // L: 493
			this.writeInt(var7); // L: 494
			this.writeInt(var8); // L: 495
		}

		this.offset = var4; // L: 497
	} // L: 498

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "1068536813"
	)
	@Export("xteaDecrypt")
	public void xteaDecrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 501
		this.offset = var2; // L: 502
		int var5 = (var3 - var2) / 8; // L: 503

		for (int var6 = 0; var6 < var5; ++var6) { // L: 504
			int var7 = this.readInt(); // L: 505
			int var8 = this.readInt(); // L: 506
			int var9 = -957401312; // L: 507
			int var10 = -1640531527; // L: 508

			for (int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) { // L: 509 510 513
				var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9; // L: 511
				var9 -= var10; // L: 512
			}

			this.offset -= 8; // L: 515
			this.writeInt(var7); // L: 516
			this.writeInt(var8); // L: 517
		}

		this.offset = var4; // L: 519
	} // L: 520

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
		garbageValue = "1766649150"
	)
	@Export("encryptRsa")
	public void encryptRsa(BigInteger var1, BigInteger var2) {
		int var3 = this.offset; // L: 523
		this.offset = 0; // L: 524
		byte[] var4 = new byte[var3]; // L: 525
		this.readBytes(var4, 0, var3); // L: 526
		BigInteger var5 = new BigInteger(var4); // L: 527
		BigInteger var6 = var5.modPow(var1, var2); // L: 528
		byte[] var7 = var6.toByteArray(); // L: 529
		this.offset = 0; // L: 530
		this.writeShort(var7.length); // L: 531
		this.writeBytes(var7, 0, var7.length); // L: 532
	} // L: 533

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "-27075"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		int var2 = WorldMapSprite.method5156(this.array, var1, this.offset); // L: 536
		this.writeInt(var2); // L: 537
		return var2; // L: 538
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-967643229"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4; // L: 542
		int var1 = WorldMapSprite.method5156(this.array, 0, this.offset); // L: 543
		int var2 = this.readInt(); // L: 544
		return var1 == var2; // L: 545
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-333020854"
	)
	public void method8630(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 550
	} // L: 551

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-418313575"
	)
	public void method8546(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1); // L: 554
	} // L: 555

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "5"
	)
	public void method8434(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1); // L: 558
	} // L: 559

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1329302831"
	)
	public int method8435() {
		return this.array[++this.offset - 1] - 128 & 255; // L: 562
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1019378032"
	)
	public int method8436() {
		return 0 - this.array[++this.offset - 1] & 255; // L: 566
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1758296937"
	)
	public int method8623() {
		return 128 - this.array[++this.offset - 1] & 255; // L: 570
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-2097794894"
	)
	public byte method8617() {
		return (byte)(this.array[++this.offset - 1] - 128); // L: 574
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "14"
	)
	public byte method8469() {
		return (byte)(0 - this.array[++this.offset - 1]); // L: 578
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "1917501994"
	)
	public byte method8440() {
		return (byte)(128 - this.array[++this.offset - 1]); // L: 582
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "16"
	)
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 586
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 587
	} // L: 588

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "32"
	)
	public void method8619(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 591
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 592
	} // L: 593

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1189397898"
	)
	public void method8443(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 596
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 597
	} // L: 598

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "7"
	)
	public int method8444() {
		this.offset += 2; // L: 601
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 602
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "22"
	)
	public int method8484() {
		this.offset += 2; // L: 606
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 607
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2094084311"
	)
	public int method8446() {
		this.offset += 2; // L: 611
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 612
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1382443454"
	)
	public int method8465() {
		this.offset += 2; // L: 616
		int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 617
		if (var1 > 32767) { // L: 618
			var1 -= 65536;
		}

		return var1; // L: 619
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2077542734"
	)
	public int method8448() {
		this.offset += 2; // L: 623
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 624
		if (var1 > 32767) { // L: 625
			var1 -= 65536;
		}

		return var1; // L: 626
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "16"
	)
	public void method8449(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 630
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 631
		this.array[++this.offset - 1] = (byte)var1; // L: 632
	} // L: 633

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-802922133"
	)
	public int method8430() {
		this.offset += 3; // L: 636
		return (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16); // L: 637
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "14"
	)
	public int method8451() {
		this.offset += 3; // L: 641
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16); // L: 642
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1478272923"
	)
	public int method8438() {
		this.offset += 3; // L: 646
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 2] & 255); // L: 647
		if (var1 > 8388607) { // L: 648
			var1 -= 16777216;
		}

		return var1; // L: 649
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-284409645"
	)
	public void method8453(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 653
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 654
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 655
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 656
	} // L: 657

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "340619046"
	)
	public void method8635(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 660
		this.array[++this.offset - 1] = (byte)var1; // L: 661
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 662
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 663
	} // L: 664

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-301717917"
	)
	public void method8437(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 667
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 668
		this.array[++this.offset - 1] = (byte)var1; // L: 669
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 670
	} // L: 671

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "349950208"
	)
	public int method8456() {
		this.offset += 4; // L: 674
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24); // L: 675
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1839956879"
	)
	public int method8457() {
		this.offset += 4; // L: 679
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16); // L: 680
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1359881556"
	)
	public int method8458() {
		this.offset += 4; // L: 684
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24); // L: 685
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "751730837"
	)
	public void method8477(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) {
			var1[var4] = (byte)(this.array[++this.offset - 1] - 128); // L: 689
		}

	} // L: 690
}
