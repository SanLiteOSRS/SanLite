import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sg")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("aa")
	@Export("crc32Table")
	static int[] crc32Table;
	@ObfuscatedName("ao")
	@Export("crc64Table")
	static long[] crc64Table;
	@ObfuscatedName("al")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1633313603
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

	public Buffer(int var1, boolean var2) {
		this.array = ByteArrayPool.ByteArrayPool_getArrayBool(var1, var2); // L: 65
	} // L: 66

	public Buffer(int var1) {
		this.array = AbstractWorldMapData.ByteArrayPool_getArray(var1); // L: 60
		this.offset = 0; // L: 61
	} // L: 62

	public Buffer(byte[] var1) {
		this.array = var1; // L: 69
		this.offset = 0; // L: 70
	} // L: 71

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "265255722"
	)
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) { // L: 74
			InterfaceParent.ByteArrayPool_release(this.array);
		}

		this.array = null; // L: 75
	} // L: 76

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "36"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 79
	} // L: 80

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "55"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 83
		this.array[++this.offset - 1] = (byte)var1; // L: 84
	} // L: 85

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-968749381"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 88
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 89
		this.array[++this.offset - 1] = (byte)var1; // L: 90
	} // L: 91

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2081835031"
	)
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 94
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 95
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 96
		this.array[++this.offset - 1] = (byte)var1; // L: 97
	} // L: 98

	@ObfuscatedName("bv")
	public void method9252(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 101
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 102
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 103
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 104
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 105
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 106
	} // L: 107

	@ObfuscatedName("bl")
	@Export("writeLong")
	public void writeLong(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 56)); // L: 110
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 48)); // L: 111
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 112
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 113
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 114
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 115
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 116
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 117
	} // L: 118

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "614283261"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0); // L: 121
	} // L: 122

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1772573081"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0); // L: 129
		if (var2 >= 0) { // L: 130
			throw new IllegalArgumentException("");
		} else {
			this.offset += WorldMapSprite.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 131
			this.array[++this.offset - 1] = 0; // L: 132
		}
	} // L: 133

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1492929913"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0); // L: 140
		if (var2 >= 0) { // L: 141
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0; // L: 142
			this.offset += WorldMapSprite.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset);
			this.array[++this.offset - 1] = 0;
		}
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)V",
		garbageValue = "-81"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var2 = class173.method3587(var1);
		this.array[++this.offset - 1] = 0;
		this.writeVarInt(var2);
		this.offset += GrandExchangeOffer.method6873(this.array, this.offset, var1);
	} // L: 152

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "9"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			this.array[++this.offset - 1] = var1[var4];
		}

	} // L: 156

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)V",
		garbageValue = "1254495951"
	)
	public void method9050(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset); // L: 159
	} // L: 160

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1718879396"
	)
	@Export("writeLengthInt")
	public void writeLengthInt(int var1) {
		if (var1 < 0) { // L: 163
			throw new IllegalArgumentException(); // L: 164
		} else {
			this.array[this.offset - var1 - 4] = (byte)(var1 >> 24); // L: 166
			this.array[this.offset - var1 - 3] = (byte)(var1 >> 16); // L: 167
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 168
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 169
		}
	} // L: 170

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1708168699"
	)
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) { // L: 173
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 176
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 177
		} else {
			throw new IllegalArgumentException(); // L: 174
		}
	} // L: 178

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "713822283"
	)
	public void method9053(int var1) {
		if (var1 >= 0 && var1 <= 255) { // L: 181
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 184
		} else {
			throw new IllegalArgumentException(); // L: 182
		}
	} // L: 185

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-101"
	)
	@Export("writeSmartByteShort")
	public void writeSmartByteShort(int var1) {
		if (var1 >= 0 && var1 < 128) { // L: 188
			this.writeByte(var1); // L: 189
		} else if (var1 >= 0 && var1 < 32768) { // L: 192
			this.writeShort(var1 + 32768); // L: 193
		} else {
			throw new IllegalArgumentException(); // L: 196
		}
	} // L: 190 194

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "67"
	)
	@Export("writeVarInt")
	public void writeVarInt(int var1) {
		if ((var1 & -128) != 0) { // L: 200
			if ((var1 & -16384) != 0) { // L: 201
				if ((var1 & -2097152) != 0) { // L: 202
					if ((var1 & -268435456) != 0) { // L: 203
						this.writeByte(var1 >>> 28 | 128);
					}

					this.writeByte(var1 >>> 21 | 128); // L: 204
				}

				this.writeByte(var1 >>> 14 | 128); // L: 206
			}

			this.writeByte(var1 >>> 7 | 128); // L: 208
		}

		this.writeByte(var1 & 127); // L: 210
	} // L: 211

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "7"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255; // L: 214
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "435772489"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1]; // L: 218
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-697993691"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2; // L: 222
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 223
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-12"
	)
	@Export("readShort")
	public int readShort() {
		this.offset += 2; // L: 227
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 228
		if (var1 > 32767) { // L: 229
			var1 -= 65536;
		}

		return var1; // L: 230
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2130592697"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3; // L: 234
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 235
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	public int method9117() {
		this.offset += 3; // L: 239
		int var1 = ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 240
		if (var1 > 8388607) { // L: 241
			var1 -= 16777216;
		}

		return var1; // L: 242
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1694820613"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 4; // L: 246
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24); // L: 247
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "1"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L; // L: 251
		long var3 = (long)this.readInt() & 4294967295L; // L: 252
		return (var1 << 32) + var3; // L: 253
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "1038383495"
	)
	public float method9064() {
		return Float.intBitsToFloat(this.readInt()); // L: 257
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1404535452"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1; // L: 261
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-85"
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

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "0"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset; // L: 273

		while (this.array[++this.offset - 1] != 0) { // L: 274
		}

		int var2 = this.offset - var1 - 1; // L: 275
		return var2 == 0 ? "" : decodeStringCp1252(this.array, var1, var2); // L: 276 277
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "-16960"
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
			return var3 == 0 ? "" : decodeStringCp1252(this.array, var2, var3); // L: 286 287
		}
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1368086059"
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
				for (int var9 = var5 + var2; var8 < var9; var6[var7++] = (char)var11) { // L: 302 303 334
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

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-1570744551"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1]; // L: 344
		}

	} // L: 345

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1391642638"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 348
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152; // L: 349 350
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1555687167"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 354
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768; // L: 355 356
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1370697348"
	)
	public int method9073() {
		int var1 = this.array[this.offset] & 255; // L: 360
		return var1 < 128 ? this.readUnsignedByte() - 1 : this.readUnsignedShort() - 32769; // L: 361 362
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-53"
	)
	public int method9178() {
		int var1 = 0; // L: 366

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) { // L: 367 368 370
			var1 += 32767; // L: 369
		}

		var1 += var2; // L: 372
		return var1; // L: 373
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "714180890"
	)
	public int method9290() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort(); // L: 377 378
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "203805527"
	)
	public int method9108() {
		if (this.array[this.offset] < 0) { // L: 382
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort(); // L: 383
			return var1 == 32767 ? -1 : var1; // L: 384
		}
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1171795391"
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

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-7"
	)
	public int method9078() {
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

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "-794961409"
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

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "2136223901"
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

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "383031129"
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

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "-1350839672"
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

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
		garbageValue = "1086371939"
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

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2013538167"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		int var2 = SequenceDefinition.method4176(this.array, var1, this.offset); // L: 508
		this.writeInt(var2); // L: 509
		return var2; // L: 510
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1987573484"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4; // L: 514
		int var1 = SequenceDefinition.method4176(this.array, 0, this.offset); // L: 515
		int var2 = this.readInt(); // L: 516
		return var1 == var2; // L: 517
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-36"
	)
	public void method9086(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 522
	} // L: 523

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-531273454"
	)
	public void method9114(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1); // L: 526
	} // L: 527

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "483460280"
	)
	public void method9203(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1); // L: 530
	} // L: 531

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-113"
	)
	public int method9089() {
		return this.array[++this.offset - 1] - 128 & 255; // L: 534
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2049377759"
	)
	public int method9090() {
		return 0 - this.array[++this.offset - 1] & 255; // L: 538
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2070899692"
	)
	public int method9039() {
		return 128 - this.array[++this.offset - 1] & 255; // L: 542
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-270768016"
	)
	public byte method9186() {
		return (byte)(this.array[++this.offset - 1] - 128); // L: 546
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-1640834672"
	)
	public byte method9232() {
		return (byte)(0 - this.array[++this.offset - 1]); // L: 550
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-2139483258"
	)
	public byte method9092() {
		return (byte)(128 - this.array[++this.offset - 1]); // L: 554
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "70"
	)
	public void method9132(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 558
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 559
	} // L: 560

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "26"
	)
	public void method9096(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 563
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 564
	} // L: 565

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2096365522"
	)
	public void method9257(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 568
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 569
	} // L: 570

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "418943913"
	)
	public int method9135() {
		this.offset += 2; // L: 573
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 574
	}

	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-523126268"
	)
	public int method9098() {
		this.offset += 2; // L: 578
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 579
	}

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "718104300"
	)
	public int method9099() {
		this.offset += 2; // L: 583
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 584
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "68"
	)
	public int method9219() {
		this.offset += 2; // L: 588
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 589
		if (var1 > 32767) { // L: 590
			var1 -= 65536;
		}

		return var1; // L: 591
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1019786063"
	)
	public int method9101() {
		this.offset += 2; // L: 595
		int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 596
		if (var1 > 32767) { // L: 597
			var1 -= 65536;
		}

		return var1; // L: 598
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-381986387"
	)
	public int method9102() {
		this.offset += 2; // L: 602
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 603
		if (var1 > 32767) { // L: 604
			var1 -= 65536;
		}

		return var1; // L: 605
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-379952376"
	)
	public void method9103(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 609
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 610
		this.array[++this.offset - 1] = (byte)var1; // L: 611
	} // L: 612

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1641573586"
	)
	public int method9084() {
		this.offset += 3; // L: 615
		return (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16); // L: 616
	}

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1943847738"
	)
	public int method9105() {
		this.offset += 3; // L: 620
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16); // L: 621
	}

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-118"
	)
	public int method9106() {
		this.offset += 3; // L: 625
		int var1 = (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16); // L: 626
		if (var1 > 8388607) { // L: 627
			var1 -= 16777216;
		}

		return var1; // L: 628
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-604065252"
	)
	public void method9107(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 632
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 633
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 634
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 635
	} // L: 636

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-90"
	)
	public void method9043(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 639
		this.array[++this.offset - 1] = (byte)var1; // L: 640
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 641
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 642
	} // L: 643

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-437883978"
	)
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 646
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 647
		this.array[++this.offset - 1] = (byte)var1; // L: 648
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 649
	} // L: 650

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "383378593"
	)
	public int method9110() {
		this.offset += 4; // L: 653
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24); // L: 654
	}

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "363073604"
	)
	public int method9111() {
		this.offset += 4; // L: 658
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16); // L: 659
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-18"
	)
	public int method9112() {
		this.offset += 4; // L: 663
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24); // L: 664
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "548759659"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2]; // L: 143
		int var4 = 0; // L: 144

		for (int var5 = 0; var5 < var2; ++var5) { // L: 145
			int var6 = var0[var5 + var1] & 255; // L: 146
			if (var6 != 0) { // L: 147
				if (var6 >= 128 && var6 < 160) { // L: 148
					char var7 = class369.cp1252AsciiExtension[var6 - 128]; // L: 149
					if (var7 == 0) { // L: 150
						var7 = '?';
					}

					var6 = var7; // L: 151
				}

				var3[var4++] = (char)var6; // L: 153
			}
		}

		return new String(var3, 0, var4); // L: 155
	}
}
