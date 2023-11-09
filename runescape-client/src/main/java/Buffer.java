import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qq")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("x")
	@Export("crc32Table")
	public static int[] crc32Table;
	@ObfuscatedName("v")
	@Export("crc64Table")
	static long[] crc64Table;
	@ObfuscatedName("q")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1580887457
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
		this.array = TaskHandler.ByteArrayPool_getArray(var1); // L: 47
		this.offset = 0; // L: 48
	} // L: 49

	public Buffer(byte[] var1) {
		this.array = var1; // L: 52
		this.offset = 0; // L: 53
	} // L: 54

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1588183860"
	)
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) { // L: 57
			class221.ByteArrayPool_release(this.array);
		}

		this.array = null; // L: 58
	} // L: 59

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-36"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 62
	} // L: 63

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-374656730"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 66
		this.array[++this.offset - 1] = (byte)var1; // L: 67
	} // L: 68

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "114"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 71
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 72
		this.array[++this.offset - 1] = (byte)var1; // L: 73
	} // L: 74

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "2"
	)
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 77
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 78
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 79
		this.array[++this.offset - 1] = (byte)var1; // L: 80
	} // L: 81

	@ObfuscatedName("ae")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 84
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 85
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 86
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 87
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 88
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 89
	} // L: 90

	@ObfuscatedName("ay")
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-69"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0); // L: 104
	} // L: 105

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-16"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0); // L: 112
		if (var2 >= 0) { // L: 113
			throw new IllegalArgumentException("");
		} else {
			this.offset += VerticalAlignment.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 114
			this.array[++this.offset - 1] = 0; // L: 115
		}
	} // L: 116

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-180354427"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0); // L: 123
		if (var2 >= 0) { // L: 124
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0; // L: 125
			this.offset += VerticalAlignment.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 126
			this.array[++this.offset - 1] = 0; // L: 127
		}
	} // L: 128

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;S)V",
		garbageValue = "-20735"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var2 = ApproximateRouteStrategy.method1169(var1); // L: 131
		this.array[++this.offset - 1] = 0; // L: 132
		this.writeVarInt(var2); // L: 133
		int var3 = this.offset; // L: 134
		byte[] var5 = this.array; // L: 136
		int var6 = this.offset; // L: 137
		int var7 = var1.length(); // L: 139
		int var8 = var6; // L: 140

		for (int var9 = 0; var9 < var7; ++var9) { // L: 141
			char var10 = var1.charAt(var9); // L: 142
			if (var10 <= 127) { // L: 143
				var5[var8++] = (byte)var10; // L: 144
			} else if (var10 <= 2047) { // L: 146
				var5[var8++] = (byte)(192 | var10 >> 6); // L: 147
				var5[var8++] = (byte)(128 | var10 & '?'); // L: 148
			} else {
				var5[var8++] = (byte)(224 | var10 >> '\f'); // L: 151
				var5[var8++] = (byte)(128 | var10 >> 6 & 63); // L: 152
				var5[var8++] = (byte)(128 | var10 & '?'); // L: 153
			}
		}

		int var4 = var8 - var6; // L: 156
		this.offset = var4 + var3; // L: 158
	} // L: 159

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "582717002"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) { // L: 162
			this.array[++this.offset - 1] = var1[var4];
		}

	} // L: 163

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lqq;B)V",
		garbageValue = "47"
	)
	public void method8116(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset); // L: 166
	} // L: 167

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-361694742"
	)
	@Export("writeLengthInt")
	public void writeLengthInt(int var1) {
		if (var1 < 0) { // L: 170
			throw new IllegalArgumentException(); // L: 171
		} else {
			this.array[this.offset - var1 - 4] = (byte)(var1 >> 24); // L: 173
			this.array[this.offset - var1 - 3] = (byte)(var1 >> 16); // L: 174
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 175
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 176
		}
	} // L: 177

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-508828023"
	)
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) { // L: 180
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 183
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 184
		} else {
			throw new IllegalArgumentException(); // L: 181
		}
	} // L: 185

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-108"
	)
	public void method7920(int var1) {
		if (var1 >= 0 && var1 <= 255) { // L: 188
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 191
		} else {
			throw new IllegalArgumentException(); // L: 189
		}
	} // L: 192

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-109"
	)
	@Export("writeSmartByteShort")
	public void writeSmartByteShort(int var1) {
		if (var1 >= 0 && var1 < 128) { // L: 195
			this.writeByte(var1); // L: 196
		} else if (var1 >= 0 && var1 < 32768) { // L: 199
			this.writeShort(var1 + 32768); // L: 200
		} else {
			throw new IllegalArgumentException(); // L: 203
		}
	} // L: 197 201

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "71"
	)
	@Export("writeVarInt")
	public void writeVarInt(int var1) {
		if ((var1 & -128) != 0) { // L: 207
			if ((var1 & -16384) != 0) { // L: 208
				if ((var1 & -2097152) != 0) { // L: 209
					if ((var1 & -268435456) != 0) { // L: 210
						this.writeByte(var1 >>> 28 | 128);
					}

					this.writeByte(var1 >>> 21 | 128); // L: 211
				}

				this.writeByte(var1 >>> 14 | 128); // L: 213
			}

			this.writeByte(var1 >>> 7 | 128); // L: 215
		}

		this.writeByte(var1 & 127); // L: 217
	} // L: 218

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "3914"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255; // L: 221
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "1374388419"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1]; // L: 225
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "2"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2; // L: 229
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 230
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "320269718"
	)
	@Export("readShort")
	public int readShort() {
		this.offset += 2; // L: 234
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 235
		if (var1 > 32767) { // L: 236
			var1 -= 65536;
		}

		return var1; // L: 237
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1156785269"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3; // L: 241
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 242
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "100"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 4; // L: 246
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24); // L: 247
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "1669770953"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L; // L: 251
		long var3 = (long)this.readInt() & 4294967295L; // L: 252
		return (var1 << 32) + var3; // L: 253
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "-839217493"
	)
	public float method7930() {
		return Float.intBitsToFloat(this.readInt()); // L: 257
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-52876110"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1; // L: 261
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "91"
	)
	@Export("readStringCp1252NullTerminatedOrNull")
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset] == 0) { // L: 265
			++this.offset; // L: 266
			return null; // L: 267
		} else {
			return this.readStringCp1252NullTerminated(); // L: 269
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2030944087"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset; // L: 273

		while (this.array[++this.offset - 1] != 0) { // L: 274
		}

		int var2 = this.offset - var1 - 1; // L: 275
		return var2 == 0 ? "" : ScriptFrame.decodeStringCp1252(this.array, var1, var2); // L: 276 277
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "65"
	)
	@Export("readStringCp1252NullCircumfixed")
	public String readStringCp1252NullCircumfixed() {
		byte var1 = this.array[++this.offset - 1]; // L: 281
		if (var1 != 0) { // L: 282
			throw new IllegalStateException("");
		} else {
			int var2 = this.offset; // L: 283

			while (this.array[++this.offset - 1] != 0) { // L: 284
			}

			int var3 = this.offset - var2 - 1; // L: 285
			return var3 == 0 ? "" : ScriptFrame.decodeStringCp1252(this.array, var2, var3); // L: 286 287
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "7"
	)
	@Export("readCESU8")
	public String readCESU8() {
		byte var1 = this.array[++this.offset - 1]; // L: 291
		if (var1 != 0) { // L: 292
			throw new IllegalStateException("");
		} else {
			int var2 = this.readVarInt(); // L: 293
			if (var2 + this.offset > this.array.length) { // L: 294
				throw new IllegalStateException("");
			} else {
				byte[] var4 = this.array; // L: 296
				int var5 = this.offset; // L: 297
				char[] var6 = new char[var2]; // L: 299
				int var7 = 0; // L: 300
				int var8 = var5; // L: 301

				int var11;
				for (int var9 = var2 + var5; var8 < var9; var6[var7++] = (char)var11) { // L: 302 303 334
					int var10 = var4[var8++] & 255; // L: 304
					if (var10 < 128) { // L: 306
						if (var10 == 0) { // L: 307
							var11 = 65533;
						} else {
							var11 = var10; // L: 308
						}
					} else if (var10 < 192) { // L: 310
						var11 = 65533;
					} else if (var10 < 224) { // L: 311
						if (var8 < var9 && (var4[var8] & 192) == 128) { // L: 312
							var11 = (var10 & 31) << 6 | var4[var8++] & 63; // L: 313
							if (var11 < 128) { // L: 314
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 316
						}
					} else if (var10 < 240) { // L: 318
						if (var8 + 1 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128) { // L: 319
							var11 = (var10 & 15) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63; // L: 320
							if (var11 < 2048) { // L: 321
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 323
						}
					} else if (var10 < 248) { // L: 325
						if (var8 + 2 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128 && (var4[var8 + 2] & 192) == 128) { // L: 326
							var11 = (var10 & 7) << 18 | (var4[var8++] & 63) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63; // L: 327
							if (var11 >= 65536 && var11 <= 1114111) { // L: 328
								var11 = 65533; // L: 329
							} else {
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 331
						}
					} else {
						var11 = 65533; // L: 333
					}
				}

				String var3 = new String(var6, 0, var7); // L: 336
				this.offset += var2; // L: 339
				return var3; // L: 340
			}
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1920935771"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1]; // L: 344
		}

	} // L: 345

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-712567498"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 348
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152; // L: 349 350
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "532501257"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 354
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768; // L: 355 356
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "4720"
	)
	public int method7939() {
		int var1 = this.array[this.offset] & 255; // L: 360
		return var1 < 128 ? this.readUnsignedByte() - 1 : this.readUnsignedShort() - 32769; // L: 361 362
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-19412"
	)
	public int method8003() {
		int var1 = 0; // L: 366

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) { // L: 367 368 370
			var1 += 32767; // L: 369
		}

		var1 += var2; // L: 372
		return var1; // L: 373
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-32"
	)
	public int method7941() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort(); // L: 377 378
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "8"
	)
	public int method8028() {
		if (this.array[this.offset] < 0) { // L: 382
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort(); // L: 383
			return var1 == 32767 ? -1 : var1; // L: 384
		}
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1979241835"
	)
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[++this.offset - 1]; // L: 389

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) { // L: 390 391 393
			var2 = (var2 | var1 & 127) << 7; // L: 392
		}

		return var2 | var1; // L: 395
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1356202709"
	)
	public int method7944() {
		int var2 = 0; // L: 400
		int var3 = 0; // L: 401

		int var1;
		do {
			var1 = this.readUnsignedByte(); // L: 403
			var2 |= (var1 & 127) << var3; // L: 404
			var3 += 7; // L: 405
		} while(var1 > 127); // L: 406

		return var2; // L: 407
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "([IB)V",
		garbageValue = "9"
	)
	@Export("xteaEncryptAll")
	public void xteaEncryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 411
		this.offset = 0; // L: 412

		for (int var3 = 0; var3 < var2; ++var3) { // L: 413
			int var4 = this.readInt(); // L: 414
			int var5 = this.readInt(); // L: 415
			int var6 = 0; // L: 416
			int var7 = -1640531527; // L: 417

			for (int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) { // L: 418 419 422
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]; // L: 420
				var6 += var7; // L: 421
			}

			this.offset -= 8; // L: 424
			this.writeInt(var4); // L: 425
			this.writeInt(var5); // L: 426
		}

	} // L: 428

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "-1041677133"
	)
	@Export("xteaDecryptAll")
	public void xteaDecryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 431
		this.offset = 0; // L: 432

		for (int var3 = 0; var3 < var2; ++var3) { // L: 433
			int var4 = this.readInt(); // L: 434
			int var5 = this.readInt(); // L: 435
			int var6 = -957401312; // L: 436
			int var7 = -1640531527; // L: 437

			for (int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) { // L: 438 439 442
				var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6; // L: 440
				var6 -= var7; // L: 441
			}

			this.offset -= 8; // L: 444
			this.writeInt(var4); // L: 445
			this.writeInt(var5); // L: 446
		}

	} // L: 448

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "([IIIB)V",
		garbageValue = "6"
	)
	@Export("xteaEncrypt")
	public void xteaEncrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 451
		this.offset = var2; // L: 452
		int var5 = (var3 - var2) / 8; // L: 453

		for (int var6 = 0; var6 < var5; ++var6) { // L: 454
			int var7 = this.readInt(); // L: 455
			int var8 = this.readInt(); // L: 456
			int var9 = 0; // L: 457
			int var10 = -1640531527; // L: 458

			for (int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) { // L: 459 460 463
				var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]; // L: 461
				var9 += var10; // L: 462
			}

			this.offset -= 8; // L: 465
			this.writeInt(var7); // L: 466
			this.writeInt(var8); // L: 467
		}

		this.offset = var4; // L: 469
	} // L: 470

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "-1954942739"
	)
	@Export("xteaDecrypt")
	public void xteaDecrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 473
		this.offset = var2; // L: 474
		int var5 = (var3 - var2) / 8; // L: 475

		for (int var6 = 0; var6 < var5; ++var6) { // L: 476
			int var7 = this.readInt(); // L: 477
			int var8 = this.readInt(); // L: 478
			int var9 = -957401312; // L: 479
			int var10 = -1640531527; // L: 480

			for (int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) { // L: 481 482 485
				var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9; // L: 483
				var9 -= var10; // L: 484
			}

			this.offset -= 8; // L: 487
			this.writeInt(var7); // L: 488
			this.writeInt(var8); // L: 489
		}

		this.offset = var4; // L: 491
	} // L: 492

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
		garbageValue = "-1164664019"
	)
	@Export("encryptRsa")
	public void encryptRsa(BigInteger var1, BigInteger var2) {
		int var3 = this.offset; // L: 495
		this.offset = 0; // L: 496
		byte[] var4 = new byte[var3]; // L: 497
		this.readBytes(var4, 0, var3); // L: 498
		BigInteger var5 = new BigInteger(var4); // L: 499
		BigInteger var6 = var5.modPow(var1, var2); // L: 500
		byte[] var7 = var6.toByteArray(); // L: 501
		this.offset = 0; // L: 502
		this.writeShort(var7.length); // L: 503
		this.writeBytes(var7, 0, var7.length); // L: 504
	} // L: 505

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-455138053"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		byte[] var3 = this.array; // L: 509
		int var4 = this.offset; // L: 510
		int var5 = -1; // L: 512

		for (int var6 = var1; var6 < var4; ++var6) { // L: 513
			var5 = var5 >>> 8 ^ crc32Table[(var5 ^ var3[var6]) & 255]; // L: 514
		}

		var5 = ~var5; // L: 516
		this.writeInt(var5); // L: 520
		return var5; // L: 521
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2049616312"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4; // L: 525
		byte[] var2 = this.array; // L: 527
		int var3 = this.offset; // L: 528
		int var4 = -1; // L: 530

		int var5;
		for (var5 = 0; var5 < var3; ++var5) { // L: 531
			var4 = var4 >>> 8 ^ crc32Table[(var4 ^ var2[var5]) & 255]; // L: 532
		}

		var4 = ~var4; // L: 534
		var5 = this.readInt(); // L: 538
		return var5 == var4; // L: 539
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1931501544"
	)
	public void method7952(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 544
	} // L: 545

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "764506000"
	)
	public void method8136(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1); // L: 548
	} // L: 549

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "93"
	)
	public void method8004(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1); // L: 552
	} // L: 553

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-933294989"
	)
	public int method7955() {
		return this.array[++this.offset - 1] - 128 & 255; // L: 556
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1637160910"
	)
	public int method7954() {
		return 0 - this.array[++this.offset - 1] & 255; // L: 560
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "109"
	)
	public int method8023() {
		return 128 - this.array[++this.offset - 1] & 255; // L: 564
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-1019503582"
	)
	public byte method7975() {
		return (byte)(this.array[++this.offset - 1] - 128); // L: 568
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "32"
	)
	public byte method7970() {
		return (byte)(0 - this.array[++this.offset - 1]); // L: 572
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-372139377"
	)
	public byte method7960() {
		return (byte)(128 - this.array[++this.offset - 1]); // L: 576
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1030278088"
	)
	public void method7961(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 580
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 581
	} // L: 582

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2041607617"
	)
	public void method7962(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 585
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 586
	} // L: 587

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2133397925"
	)
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 590
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 591
	} // L: 592

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1159156924"
	)
	public int method7964() {
		this.offset += 2; // L: 595
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 596
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-13224"
	)
	public int method7965() {
		this.offset += 2; // L: 600
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 601
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1428903067"
	)
	public int method8143() {
		this.offset += 2; // L: 605
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 606
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1967172912"
	)
	public int method7967() {
		this.offset += 2; // L: 610
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 611
		if (var1 > 32767) { // L: 612
			var1 -= 65536;
		}

		return var1; // L: 613
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-51"
	)
	public void method7983(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 617
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 618
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 619
	} // L: 620

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "98"
	)
	public int method8101() {
		this.offset += 3; // L: 623
		return (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16); // L: 624
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1165332781"
	)
	public void method7916(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 628
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 629
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 630
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 631
	} // L: 632

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "7"
	)
	public void method7971(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 635
		this.array[++this.offset - 1] = (byte)var1; // L: 636
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 637
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 638
	} // L: 639

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-111777869"
	)
	public void method7972(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 642
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 643
		this.array[++this.offset - 1] = (byte)var1; // L: 644
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 645
	} // L: 646

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1058751590"
	)
	public int method7973() {
		this.offset += 4; // L: 649
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24); // L: 650
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-738728702"
	)
	public int method7974() {
		this.offset += 4; // L: 654
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16); // L: 655
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-14585"
	)
	public int method8135() {
		this.offset += 4; // L: 659
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24); // L: 660
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1598197821"
	)
	public void method7976(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) { // L: 664
			var1[var4] = (byte)(this.array[++this.offset - 1] - 128);
		}

	} // L: 665
}
