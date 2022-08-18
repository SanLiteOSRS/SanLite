import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qw")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("a")
	@Export("crc32Table")
	public static int[] crc32Table;
	@ObfuscatedName("n")
	@Export("crc64Table")
	static long[] crc64Table;
	@ObfuscatedName("j")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 299978303
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

	public Buffer(int var1) {
		this.array = class17.ByteArrayPool_getArray(var1); // L: 47
		this.offset = 0; // L: 48
	} // L: 49

	public Buffer(byte[] var1) {
		this.array = var1; // L: 52
		this.offset = 0; // L: 53
	} // L: 54

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) { // L: 57
			StudioGame.ByteArrayPool_release(this.array);
		}

		this.array = null; // L: 58
	} // L: 59

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "149670880"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 62
	} // L: 63

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-69"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 66
		this.array[++this.offset - 1] = (byte)var1; // L: 67
	} // L: 68

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "295087363"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 71
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 72
		this.array[++this.offset - 1] = (byte)var1; // L: 73
	} // L: 74

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1402126391"
	)
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 77
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 78
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 79
		this.array[++this.offset - 1] = (byte)var1; // L: 80
	} // L: 81

	@ObfuscatedName("aa")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 84
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 85
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 86
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 87
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 88
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 89
	} // L: 90

	@ObfuscatedName("av")
	@Export("writeLong")
	public void writeLong(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 56)); // L: 93
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 48)); // L: 94
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 95
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 96
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 97
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 98
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 99
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 100
	} // L: 101

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1513673417"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0); // L: 104
	} // L: 105

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-943834690"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0); // L: 112
		if (var2 >= 0) { // L: 113
			throw new IllegalArgumentException("");
		} else {
			this.offset += GrandExchangeEvents.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 114
			this.array[++this.offset - 1] = 0; // L: 115
		}
	} // L: 116

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-102"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0); // L: 123
		if (var2 >= 0) { // L: 124
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0; // L: 125
			this.offset += GrandExchangeEvents.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 126
			this.array[++this.offset - 1] = 0; // L: 127
		}
	} // L: 128

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)V",
		garbageValue = "-1719962204"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var2 = SceneTilePaint.method4491(var1); // L: 131
		this.array[++this.offset - 1] = 0; // L: 132
		this.writeVarInt(var2); // L: 133
		this.offset += NameableContainer.method6809(this.array, this.offset, var1); // L: 134
	} // L: 135

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1292342221"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			this.array[++this.offset - 1] = var1[var4]; // L: 138
		}

	} // L: 139

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)V",
		garbageValue = "1263061474"
	)
	public void method7727(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset); // L: 142
	} // L: 143

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "126"
	)
	@Export("writeLengthInt")
	public void writeLengthInt(int var1) {
		if (var1 < 0) { // L: 146
			throw new IllegalArgumentException(); // L: 147
		} else {
			this.array[this.offset - var1 - 4] = (byte)(var1 >> 24); // L: 149
			this.array[this.offset - var1 - 3] = (byte)(var1 >> 16); // L: 150
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 151
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 152
		}
	} // L: 153

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-104"
	)
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) { // L: 156
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 159
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 160
		} else {
			throw new IllegalArgumentException(); // L: 157
		}
	} // L: 161

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2089354265"
	)
	public void method7730(int var1) {
		if (var1 >= 0 && var1 <= 255) { // L: 164
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 167
		} else {
			throw new IllegalArgumentException(); // L: 165
		}
	} // L: 168

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "44"
	)
	@Export("writeSmartByteShort")
	public void writeSmartByteShort(int var1) {
		if (var1 >= 0 && var1 < 128) { // L: 171
			this.writeByte(var1); // L: 172
		} else if (var1 >= 0 && var1 < 32768) { // L: 175
			this.writeShort(var1 + 32768); // L: 176
		} else {
			throw new IllegalArgumentException(); // L: 179
		}
	} // L: 173 177

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1935508627"
	)
	@Export("writeVarInt")
	public void writeVarInt(int var1) {
		if ((var1 & -128) != 0) { // L: 183
			if ((var1 & -16384) != 0) { // L: 184
				if ((var1 & -2097152) != 0) { // L: 185
					if ((var1 & -268435456) != 0) { // L: 186
						this.writeByte(var1 >>> 28 | 128);
					}

					this.writeByte(var1 >>> 21 | 128); // L: 187
				}

				this.writeByte(var1 >>> 14 | 128); // L: 189
			}

			this.writeByte(var1 >>> 7 | 128); // L: 191
		}

		this.writeByte(var1 & 127); // L: 193
	} // L: 194

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "120"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255; // L: 197
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "1"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1]; // L: 201
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1594859967"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2; // L: 205
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 206
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-727168829"
	)
	@Export("readShort")
	public int readShort() {
		this.offset += 2; // L: 210
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 211
		if (var1 > 32767) { // L: 212
			var1 -= 65536;
		}

		return var1; // L: 213
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-781344431"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3; // L: 217
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 218
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1292815006"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 4; // L: 222
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24); // L: 223
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "-20"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L; // L: 227
		long var3 = (long)this.readInt() & 4294967295L; // L: 228
		return (var1 << 32) + var3; // L: 229
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "75"
	)
	public float method7740() {
		return Float.intBitsToFloat(this.readInt()); // L: 233
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "82"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1; // L: 237
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "892663987"
	)
	@Export("readStringCp1252NullTerminatedOrNull")
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset] == 0) { // L: 241
			++this.offset; // L: 242
			return null; // L: 243
		} else {
			return this.readStringCp1252NullTerminated(); // L: 245
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-167008570"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset; // L: 249

		while (this.array[++this.offset - 1] != 0) { // L: 250
		}

		int var2 = this.offset - var1 - 1; // L: 251
		return var2 == 0 ? "" : class269.decodeStringCp1252(this.array, var1, var2); // L: 252 253
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-720153019"
	)
	@Export("readStringCp1252NullCircumfixed")
	public String readStringCp1252NullCircumfixed() {
		byte var1 = this.array[++this.offset - 1]; // L: 257
		if (var1 != 0) { // L: 258
			throw new IllegalStateException("");
		} else {
			int var2 = this.offset; // L: 259

			while (this.array[++this.offset - 1] != 0) { // L: 260
			}

			int var3 = this.offset - var2 - 1; // L: 261
			return var3 == 0 ? "" : class269.decodeStringCp1252(this.array, var2, var3); // L: 262 263
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-76"
	)
	@Export("readCESU8")
	public String readCESU8() {
		byte var1 = this.array[++this.offset - 1]; // L: 267
		if (var1 != 0) { // L: 268
			throw new IllegalStateException("");
		} else {
			int var2 = this.readVarInt(); // L: 269
			if (var2 + this.offset > this.array.length) { // L: 270
				throw new IllegalStateException("");
			} else {
				byte[] var4 = this.array; // L: 272
				int var5 = this.offset; // L: 273
				char[] var6 = new char[var2]; // L: 275
				int var7 = 0; // L: 276
				int var8 = var5; // L: 277

				int var11;
				for (int var9 = var5 + var2; var8 < var9; var6[var7++] = (char)var11) { // L: 278 279 310
					int var10 = var4[var8++] & 255; // L: 280
					if (var10 < 128) { // L: 282
						if (var10 == 0) { // L: 283
							var11 = 65533;
						} else {
							var11 = var10; // L: 284
						}
					} else if (var10 < 192) { // L: 286
						var11 = 65533;
					} else if (var10 < 224) { // L: 287
						if (var8 < var9 && (var4[var8] & 192) == 128) { // L: 288
							var11 = (var10 & 31) << 6 | var4[var8++] & 63; // L: 289
							if (var11 < 128) { // L: 290
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 292
						}
					} else if (var10 < 240) { // L: 294
						if (var8 + 1 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128) { // L: 295
							var11 = (var10 & 15) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63; // L: 296
							if (var11 < 2048) { // L: 297
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 299
						}
					} else if (var10 < 248) { // L: 301
						if (var8 + 2 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128 && (var4[var8 + 2] & 192) == 128) { // L: 302
							var11 = (var10 & 7) << 18 | (var4[var8++] & 63) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63; // L: 303
							if (var11 >= 65536 && var11 <= 1114111) { // L: 304
								var11 = 65533; // L: 305
							} else {
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 307
						}
					} else {
						var11 = 65533; // L: 309
					}
				}

				String var3 = new String(var6, 0, var7); // L: 312
				this.offset += var2; // L: 315
				return var3; // L: 316
			}
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "114072681"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1]; // L: 320
		}

	} // L: 321

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "212930917"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 324
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152; // L: 325 326
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 330
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768; // L: 331 332
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2074407218"
	)
	public int method7815() {
		int var1 = this.array[this.offset] & 255; // L: 336
		return var1 < 128 ? this.readUnsignedByte() - 1 : this.readUnsignedShort() - 32769; // L: 337 338
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-95"
	)
	public int method7873() {
		int var1 = 0; // L: 342

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) { // L: 343 344 346
			var1 += 32767; // L: 345
		}

		var1 += var2; // L: 348
		return var1; // L: 349
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "468977892"
	)
	public int method7755() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort(); // L: 353 354
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "8142"
	)
	public int method7752() {
		if (this.array[this.offset] < 0) { // L: 358
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort(); // L: 359
			return var1 == 32767 ? -1 : var1; // L: 360
		}
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1109780886"
	)
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[++this.offset - 1]; // L: 365

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) { // L: 366 367 369
			var2 = (var2 | var1 & 127) << 7; // L: 368
		}

		return var2 | var1; // L: 371
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1681115749"
	)
	public int method7754() {
		int var2 = 0; // L: 376
		int var3 = 0; // L: 377

		int var1;
		do {
			var1 = this.readUnsignedByte(); // L: 379
			var2 |= (var1 & 127) << var3; // L: 380
			var3 += 7; // L: 381
		} while(var1 > 127); // L: 382

		return var2; // L: 383
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "-1731472597"
	)
	@Export("xteaEncryptAll")
	public void xteaEncryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 387
		this.offset = 0; // L: 388

		for (int var3 = 0; var3 < var2; ++var3) { // L: 389
			int var4 = this.readInt(); // L: 390
			int var5 = this.readInt(); // L: 391
			int var6 = 0; // L: 392
			int var7 = -1640531527; // L: 393

			for (int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) { // L: 394 395 398
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]; // L: 396
				var6 += var7; // L: 397
			}

			this.offset -= 8; // L: 400
			this.writeInt(var4); // L: 401
			this.writeInt(var5); // L: 402
		}

	} // L: 404

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "([IB)V",
		garbageValue = "-49"
	)
	@Export("xteaDecryptAll")
	public void xteaDecryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 407
		this.offset = 0; // L: 408

		for (int var3 = 0; var3 < var2; ++var3) { // L: 409
			int var4 = this.readInt(); // L: 410
			int var5 = this.readInt(); // L: 411
			int var6 = -957401312; // L: 412
			int var7 = -1640531527; // L: 413

			for (int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) { // L: 414 415 418
				var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6; // L: 416
				var6 -= var7; // L: 417
			}

			this.offset -= 8; // L: 420
			this.writeInt(var4); // L: 421
			this.writeInt(var5); // L: 422
		}

	} // L: 424

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "([IIIB)V",
		garbageValue = "1"
	)
	@Export("xteaEncrypt")
	public void xteaEncrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 427
		this.offset = var2; // L: 428
		int var5 = (var3 - var2) / 8; // L: 429

		for (int var6 = 0; var6 < var5; ++var6) { // L: 430
			int var7 = this.readInt(); // L: 431
			int var8 = this.readInt(); // L: 432
			int var9 = 0; // L: 433
			int var10 = -1640531527; // L: 434

			for (int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) { // L: 435 436 439
				var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]; // L: 437
				var9 += var10; // L: 438
			}

			this.offset -= 8; // L: 441
			this.writeInt(var7); // L: 442
			this.writeInt(var8); // L: 443
		}

		this.offset = var4; // L: 445
	} // L: 446

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "([IIIB)V",
		garbageValue = "-49"
	)
	@Export("xteaDecrypt")
	public void xteaDecrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 449
		this.offset = var2; // L: 450
		int var5 = (var3 - var2) / 8; // L: 451

		for (int var6 = 0; var6 < var5; ++var6) { // L: 452
			int var7 = this.readInt(); // L: 453
			int var8 = this.readInt(); // L: 454
			int var9 = -957401312; // L: 455
			int var10 = -1640531527; // L: 456

			for (int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) { // L: 457 458 461
				var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9; // L: 459
				var9 -= var10; // L: 460
			}

			this.offset -= 8; // L: 463
			this.writeInt(var7); // L: 464
			this.writeInt(var8); // L: 465
		}

		this.offset = var4; // L: 467
	} // L: 468

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
		garbageValue = "-510679906"
	)
	@Export("encryptRsa")
	public void encryptRsa(BigInteger var1, BigInteger var2) {
		int var3 = this.offset; // L: 471
		this.offset = 0; // L: 472
		byte[] var4 = new byte[var3]; // L: 473
		this.readBytes(var4, 0, var3); // L: 474
		BigInteger var5 = new BigInteger(var4); // L: 475
		BigInteger var6 = var5.modPow(var1, var2); // L: 476
		byte[] var7 = var6.toByteArray(); // L: 477
		this.offset = 0; // L: 478
		this.writeShort(var7.length); // L: 479
		this.writeBytes(var7, 0, var7.length); // L: 480
	} // L: 481

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "784373428"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		byte[] var3 = this.array; // L: 485
		int var4 = this.offset; // L: 486
		int var5 = -1; // L: 488

		for (int var6 = var1; var6 < var4; ++var6) { // L: 489
			var5 = var5 >>> 8 ^ crc32Table[(var5 ^ var3[var6]) & 255]; // L: 490
		}

		var5 = ~var5; // L: 492
		this.writeInt(var5); // L: 496
		return var5; // L: 497
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1779356823"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4; // L: 501
		byte[] var2 = this.array; // L: 503
		int var3 = this.offset; // L: 504
		int var4 = -1; // L: 506

		int var5;
		for (var5 = 0; var5 < var3; ++var5) { // L: 507
			var4 = var4 >>> 8 ^ crc32Table[(var4 ^ var2[var5]) & 255]; // L: 508
		}

		var4 = ~var4; // L: 510
		var5 = this.readInt(); // L: 514
		return var5 == var4; // L: 515
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "2"
	)
	public void method7762(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 520
	} // L: 521

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-586870412"
	)
	public void method7832(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1); // L: 524
	} // L: 525

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	public void method7764(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1); // L: 528
	} // L: 529

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "87"
	)
	public int method7908() {
		return this.array[++this.offset - 1] - 128 & 255; // L: 532
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1696217918"
	)
	public int method7766() {
		return 0 - this.array[++this.offset - 1] & 255; // L: 536
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-23954"
	)
	public int method7767() {
		return 128 - this.array[++this.offset - 1] & 255; // L: 540
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "16"
	)
	public byte method7768() {
		return (byte)(this.array[++this.offset - 1] - 128); // L: 544
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "33"
	)
	public byte method7769() {
		return (byte)(0 - this.array[++this.offset - 1]); // L: 548
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-749760822"
	)
	public byte method7743() {
		return (byte)(128 - this.array[++this.offset - 1]); // L: 552
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-189070896"
	)
	public void method7771(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 556
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 557
	} // L: 558

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-28"
	)
	public void method7969(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 561
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 562
	} // L: 563

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-698118384"
	)
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 566
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 567
	} // L: 568

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1193527637"
	)
	public int method7774() {
		this.offset += 2; // L: 571
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 572
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-261678124"
	)
	public int method7741() {
		this.offset += 2; // L: 576
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 577
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-4"
	)
	public int method7776() {
		this.offset += 2; // L: 581
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 582
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2132966287"
	)
	public int method7763() {
		this.offset += 2; // L: 586
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 587
		if (var1 > 32767) { // L: 588
			var1 -= 65536;
		}

		return var1; // L: 589
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1799807952"
	)
	public int method7986() {
		this.offset += 2; // L: 593
		int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 594
		if (var1 > 32767) { // L: 595
			var1 -= 65536;
		}

		return var1; // L: 596
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1169101152"
	)
	public int method7742() {
		this.offset += 2; // L: 600
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 601
		if (var1 > 32767) { // L: 602
			var1 -= 65536;
		}

		return var1; // L: 603
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "77"
	)
	public void method7780(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 607
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 608
		this.array[++this.offset - 1] = (byte)var1; // L: 609
	} // L: 610

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1554181487"
	)
	public int method7781() {
		this.offset += 3; // L: 613
		return (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16); // L: 614
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-676670969"
	)
	public int method7909() {
		this.offset += 3; // L: 618
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 2] & 255); // L: 619
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-37"
	)
	public void method7783(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 623
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 624
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 625
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 626
	} // L: 627

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1551779613"
	)
	public void method7784(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 630
		this.array[++this.offset - 1] = (byte)var1; // L: 631
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 632
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 633
	} // L: 634

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "38911446"
	)
	public void method7785(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 637
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 638
		this.array[++this.offset - 1] = (byte)var1; // L: 639
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 640
	} // L: 641

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	public int method7786() {
		this.offset += 4; // L: 644
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24); // L: 645
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "144215720"
	)
	public int method7787() {
		this.offset += 4; // L: 649
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16); // L: 650
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1492517135"
	)
	public int method7778() {
		this.offset += 4; // L: 654
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24); // L: 655
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "-29"
	)
	public void method7739(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) { // L: 659
			var1[var4] = this.array[++this.offset - 1];
		}

	} // L: 660
}
