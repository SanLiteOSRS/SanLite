import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qy")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("b")
	@Export("crc32Table")
	static int[] crc32Table;
	@ObfuscatedName("g")
	@Export("crc64Table")
	static long[] crc64Table;
	@ObfuscatedName("r")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1969198767
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
		this.array = ByteArrayPool.ByteArrayPool_getArrayBool(var1, var2); // L: 74
	} // L: 75

	public Buffer(int var1) {
		this.array = ItemContainer.ByteArrayPool_getArray(var1); // L: 69
		this.offset = 0; // L: 70
	} // L: 71

	public Buffer(byte[] var1) {
		this.array = var1; // L: 78
		this.offset = 0; // L: 79
	} // L: 80

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "573816263"
	)
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) { // L: 83
			class200.ByteArrayPool_release(this.array);
		}

		this.array = null; // L: 84
	} // L: 85

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1292622298"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 88
	} // L: 89

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1503881310"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 92
		this.array[++this.offset - 1] = (byte)var1; // L: 93
	} // L: 94

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-13"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 97
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 98
		this.array[++this.offset - 1] = (byte)var1; // L: 99
	} // L: 100

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "18"
	)
	public void method8536(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 103
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 104
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 105
		this.array[++this.offset - 1] = (byte)var1; // L: 106
	} // L: 107

	@ObfuscatedName("aw")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 110
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 111
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 112
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 113
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 114
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 115
	} // L: 116

	@ObfuscatedName("aj")
	@Export("writeLong")
	public void writeLong(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 56)); // L: 119
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 48)); // L: 120
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 121
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 122
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 123
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 124
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 125
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 126
	} // L: 127

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1237672989"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0); // L: 130
	} // L: 131

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "124"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0); // L: 138
		if (var2 >= 0) { // L: 139
			throw new IllegalArgumentException("");
		} else {
			this.offset += DecorativeObject.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 140
			this.array[++this.offset - 1] = 0; // L: 141
		}
	} // L: 142

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1568672467"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0); // L: 149
		if (var2 >= 0) { // L: 150
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0; // L: 151
			this.offset += DecorativeObject.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 152
			this.array[++this.offset - 1] = 0; // L: 153
		}
	} // L: 154

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)V",
		garbageValue = "-26"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var2 = SoundSystem.method868(var1); // L: 157
		this.array[++this.offset - 1] = 0; // L: 158
		this.writeVarInt(var2); // L: 159
		this.offset += StructComposition.method3810(this.array, this.offset, var1); // L: 160
	} // L: 161

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "1"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) { // L: 164
			this.array[++this.offset - 1] = var1[var4];
		}

	} // L: 165

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lqy;B)V",
		garbageValue = "114"
	)
	public void method8544(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset); // L: 168
	} // L: 169

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	@Export("writeLengthInt")
	public void writeLengthInt(int var1) {
		if (var1 < 0) { // L: 172
			throw new IllegalArgumentException(); // L: 173
		} else {
			this.array[this.offset - var1 - 4] = (byte)(var1 >> 24); // L: 175
			this.array[this.offset - var1 - 3] = (byte)(var1 >> 16); // L: 176
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 177
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 178
		}
	} // L: 179

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-895290179"
	)
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) { // L: 182
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 185
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 186
		} else {
			throw new IllegalArgumentException(); // L: 183
		}
	} // L: 187

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1628971448"
	)
	public void method8622(int var1) {
		if (var1 >= 0 && var1 <= 255) { // L: 190
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 193
		} else {
			throw new IllegalArgumentException(); // L: 191
		}
	} // L: 194

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-7"
	)
	@Export("writeSmartByteShort")
	public void writeSmartByteShort(int var1) {
		if (var1 >= 0 && var1 < 128) { // L: 197
			this.writeByte(var1); // L: 198
		} else if (var1 >= 0 && var1 < 32768) { // L: 201
			this.writeShort(var1 + 32768); // L: 202
		} else {
			throw new IllegalArgumentException(); // L: 205
		}
	} // L: 199 203

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-922347408"
	)
	@Export("writeVarInt")
	public void writeVarInt(int var1) {
		if ((var1 & -128) != 0) { // L: 209
			if ((var1 & -16384) != 0) { // L: 210
				if ((var1 & -2097152) != 0) { // L: 211
					if ((var1 & -268435456) != 0) { // L: 212
						this.writeByte(var1 >>> 28 | 128);
					}

					this.writeByte(var1 >>> 21 | 128); // L: 213
				}

				this.writeByte(var1 >>> 14 | 128); // L: 215
			}

			this.writeByte(var1 >>> 7 | 128); // L: 217
		}

		this.writeByte(var1 & 127); // L: 219
	} // L: 220

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-94"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255; // L: 223
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "735489288"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1]; // L: 227
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-60"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2; // L: 231
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 232
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "596046446"
	)
	@Export("readShort")
	public int readShort() {
		this.offset += 2; // L: 236
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 237
		if (var1 > 32767) { // L: 238
			var1 -= 65536;
		}

		return var1; // L: 239
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1852332361"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3; // L: 243
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 244
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-74"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 4; // L: 248
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24); // L: 249
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "10"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L; // L: 253
		long var3 = (long)this.readInt() & 4294967295L; // L: 254
		return (var1 << 32) + var3; // L: 255
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "-1837013187"
	)
	public float method8556() {
		return Float.intBitsToFloat(this.readInt()); // L: 259
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-86010976"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1; // L: 263
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1953129170"
	)
	@Export("readStringCp1252NullTerminatedOrNull")
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset] == 0) { // L: 267
			++this.offset; // L: 268
			return null; // L: 269
		} else {
			return this.readStringCp1252NullTerminated(); // L: 271
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "262864078"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset; // L: 275

		while (this.array[++this.offset - 1] != 0) { // L: 276
		}

		int var2 = this.offset - var1 - 1; // L: 277
		return var2 == 0 ? "" : ClientPacket.decodeStringCp1252(this.array, var1, var2); // L: 278 279
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "757017761"
	)
	@Export("readStringCp1252NullCircumfixed")
	public String readStringCp1252NullCircumfixed() {
		byte var1 = this.array[++this.offset - 1]; // L: 283
		if (var1 != 0) { // L: 284
			throw new IllegalStateException("");
		} else {
			int var2 = this.offset; // L: 285

			while (this.array[++this.offset - 1] != 0) { // L: 286
			}

			int var3 = this.offset - var2 - 1; // L: 287
			return var3 == 0 ? "" : ClientPacket.decodeStringCp1252(this.array, var2, var3); // L: 288 289
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1702398552"
	)
	@Export("readCESU8")
	public String readCESU8() {
		byte var1 = this.array[++this.offset - 1]; // L: 293
		if (var1 != 0) { // L: 294
			throw new IllegalStateException("");
		} else {
			int var2 = this.readVarInt(); // L: 295
			if (var2 + this.offset > this.array.length) { // L: 296
				throw new IllegalStateException("");
			} else {
				byte[] var4 = this.array; // L: 298
				int var5 = this.offset; // L: 299
				char[] var6 = new char[var2]; // L: 301
				int var7 = 0; // L: 302
				int var8 = var5; // L: 303

				int var11;
				for (int var9 = var2 + var5; var8 < var9; var6[var7++] = (char)var11) { // L: 304 305 336
					int var10 = var4[var8++] & 255; // L: 306
					if (var10 < 128) { // L: 308
						if (var10 == 0) { // L: 309
							var11 = 65533;
						} else {
							var11 = var10; // L: 310
						}
					} else if (var10 < 192) { // L: 312
						var11 = 65533;
					} else if (var10 < 224) { // L: 313
						if (var8 < var9 && (var4[var8] & 192) == 128) { // L: 314
							var11 = (var10 & 31) << 6 | var4[var8++] & 63; // L: 315
							if (var11 < 128) { // L: 316
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 318
						}
					} else if (var10 < 240) { // L: 320
						if (var8 + 1 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128) { // L: 321
							var11 = (var10 & 15) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63; // L: 322
							if (var11 < 2048) { // L: 323
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 325
						}
					} else if (var10 < 248) { // L: 327
						if (var8 + 2 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128 && (var4[var8 + 2] & 192) == 128) { // L: 328
							var11 = (var10 & 7) << 18 | (var4[var8++] & 63) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63; // L: 329
							if (var11 >= 65536 && var11 <= 1114111) { // L: 330
								var11 = 65533; // L: 331
							} else {
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 333
						}
					} else {
						var11 = 65533; // L: 335
					}
				}

				String var3 = new String(var6, 0, var7); // L: 338
				this.offset += var2; // L: 341
				return var3; // L: 342
			}
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-496207451"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1]; // L: 346
		}

	} // L: 347

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-62"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 350
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152; // L: 351 352
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-435736148"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 356
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768; // L: 357 358
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1149744390"
	)
	public int method8781() {
		int var1 = this.array[this.offset] & 255; // L: 362
		return var1 < 128 ? this.readUnsignedByte() - 1 : this.readUnsignedShort() - 32769; // L: 363 364
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1240395681"
	)
	public int method8732() {
		int var1 = 0; // L: 368

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) { // L: 369 370 372
			var1 += 32767; // L: 371
		}

		var1 += var2; // L: 374
		return var1; // L: 375
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1751248407"
	)
	public int method8612() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort(); // L: 379 380
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-286018306"
	)
	public int method8568() {
		if (this.array[this.offset] < 0) { // L: 384
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort(); // L: 385
			return var1 == 32767 ? -1 : var1; // L: 386
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "160426579"
	)
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[++this.offset - 1]; // L: 391

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) { // L: 392 393 395
			var2 = (var2 | var1 & 127) << 7; // L: 394
		}

		return var2 | var1; // L: 397
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "94"
	)
	public int method8570() {
		int var2 = 0; // L: 402
		int var3 = 0; // L: 403

		int var1;
		do {
			var1 = this.readUnsignedByte(); // L: 405
			var2 |= (var1 & 127) << var3; // L: 406
			var3 += 7; // L: 407
		} while(var1 > 127); // L: 408

		return var2; // L: 409
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "304198063"
	)
	@Export("xteaEncryptAll")
	public void xteaEncryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 413
		this.offset = 0; // L: 414

		for (int var3 = 0; var3 < var2; ++var3) { // L: 415
			int var4 = this.readInt(); // L: 416
			int var5 = this.readInt(); // L: 417
			int var6 = 0; // L: 418
			int var7 = -1640531527; // L: 419

			for (int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) { // L: 420 421 424
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]; // L: 422
				var6 += var7; // L: 423
			}

			this.offset -= 8; // L: 426
			this.method8536(var4); // L: 427
			this.method8536(var5); // L: 428
		}

	} // L: 430

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "([IB)V",
		garbageValue = "123"
	)
	@Export("xteaDecryptAll")
	public void xteaDecryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 433
		this.offset = 0; // L: 434

		for (int var3 = 0; var3 < var2; ++var3) { // L: 435
			int var4 = this.readInt(); // L: 436
			int var5 = this.readInt(); // L: 437
			int var6 = -957401312; // L: 438
			int var7 = -1640531527; // L: 439

			for (int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) { // L: 440 441 444
				var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6; // L: 442
				var6 -= var7; // L: 443
			}

			this.offset -= 8; // L: 446
			this.method8536(var4); // L: 447
			this.method8536(var5); // L: 448
		}

	} // L: 450

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "-1799839706"
	)
	@Export("xteaEncrypt")
	public void xteaEncrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 453
		this.offset = var2; // L: 454
		int var5 = (var3 - var2) / 8; // L: 455

		for (int var6 = 0; var6 < var5; ++var6) { // L: 456
			int var7 = this.readInt(); // L: 457
			int var8 = this.readInt(); // L: 458
			int var9 = 0; // L: 459
			int var10 = -1640531527; // L: 460

			for (int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) { // L: 461 462 465
				var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]; // L: 463
				var9 += var10; // L: 464
			}

			this.offset -= 8; // L: 467
			this.method8536(var7); // L: 468
			this.method8536(var8); // L: 469
		}

		this.offset = var4; // L: 471
	} // L: 472

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "-243016668"
	)
	@Export("xteaDecrypt")
	public void xteaDecrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 475
		this.offset = var2; // L: 476
		int var5 = (var3 - var2) / 8; // L: 477

		for (int var6 = 0; var6 < var5; ++var6) { // L: 478
			int var7 = this.readInt(); // L: 479
			int var8 = this.readInt(); // L: 480
			int var9 = -957401312; // L: 481
			int var10 = -1640531527; // L: 482

			for (int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) { // L: 483 484 487
				var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9; // L: 485
				var9 -= var10; // L: 486
			}

			this.offset -= 8; // L: 489
			this.method8536(var7); // L: 490
			this.method8536(var8); // L: 491
		}

		this.offset = var4; // L: 493
	} // L: 494

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
		garbageValue = "-2086129424"
	)
	@Export("encryptRsa")
	public void encryptRsa(BigInteger var1, BigInteger var2) {
		int var3 = this.offset; // L: 497
		this.offset = 0; // L: 498
		byte[] var4 = new byte[var3]; // L: 499
		this.readBytes(var4, 0, var3); // L: 500
		BigInteger var5 = new BigInteger(var4); // L: 501
		BigInteger var6 = var5.modPow(var1, var2); // L: 502
		byte[] var7 = var6.toByteArray(); // L: 503
		this.offset = 0; // L: 504
		this.writeShort(var7.length); // L: 505
		this.writeBytes(var7, 0, var7.length); // L: 506
	} // L: 507

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-66"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		int var2 = Timer.method7357(this.array, var1, this.offset); // L: 510
		this.method8536(var2); // L: 511
		return var2; // L: 512
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1993986697"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4; // L: 516
		byte[] var2 = this.array; // L: 518
		int var3 = this.offset; // L: 519
		int var4 = -1; // L: 521

		int var5;
		for (var5 = 0; var5 < var3; ++var5) { // L: 522
			var4 = var4 >>> 8 ^ crc32Table[(var4 ^ var2[var5]) & 255]; // L: 523
		}

		var4 = ~var4; // L: 525
		var5 = this.readInt(); // L: 529
		return var4 == var5; // L: 530
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-248114592"
	)
	public void method8578(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 535
	} // L: 536

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-13626"
	)
	public void method8579(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1); // L: 539
	} // L: 540

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1647626859"
	)
	public void method8580(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1); // L: 543
	} // L: 544

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-77"
	)
	public int method8581() {
		return this.array[++this.offset - 1] - 128 & 255; // L: 547
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "27368137"
	)
	public int method8702() {
		return 0 - this.array[++this.offset - 1] & 255; // L: 551
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2108342087"
	)
	public int method8699() {
		return 128 - this.array[++this.offset - 1] & 255; // L: 555
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "649013947"
	)
	public byte method8584() {
		return (byte)(this.array[++this.offset - 1] - 128); // L: 559
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "-61"
	)
	public byte method8718() {
		return (byte)(0 - this.array[++this.offset - 1]); // L: 563
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "127498923"
	)
	public byte method8701() {
		return (byte)(128 - this.array[++this.offset - 1]); // L: 567
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-965971578"
	)
	public void method8607(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 571
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 572
	} // L: 573

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "13"
	)
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 576
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 577
	} // L: 578

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "629499433"
	)
	public void method8589(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 581
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 582
	} // L: 583

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1425191000"
	)
	public int method8530() {
		this.offset += 2; // L: 586
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 587
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "28250342"
	)
	public int method8591() {
		this.offset += 2; // L: 591
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 592
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1617072549"
	)
	public int method8592() {
		this.offset += 2; // L: 596
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 597
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1498337451"
	)
	public int method8593() {
		this.offset += 2; // L: 601
		int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 602
		if (var1 > 32767) { // L: 603
			var1 -= 65536;
		}

		return var1; // L: 604
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1096087657"
	)
	public int method8594() {
		this.offset += 3; // L: 608
		return (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16); // L: 609
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "174"
	)
	public int method8595() {
		this.offset += 3; // L: 613
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 2] & 255); // L: 614
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-513190421"
	)
	public int method8629() {
		this.offset += 3; // L: 618
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16); // L: 619
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "638844841"
	)
	public int method8549() {
		this.offset += 3; // L: 623
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 2] & 255); // L: 624
		if (var1 > 8388607) { // L: 625
			var1 -= 16777216;
		}

		return var1; // L: 626
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1969198767"
	)
	public int method8674() {
		this.offset += 3; // L: 630
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16); // L: 631
		if (var1 > 8388607) { // L: 632
			var1 -= 16777216;
		}

		return var1; // L: 633
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-30124"
	)
	public void method8599(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 637
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 638
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 639
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 640
	} // L: 641

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-947311377"
	)
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 644
		this.array[++this.offset - 1] = (byte)var1; // L: 645
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 646
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 647
	} // L: 648

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1398121021"
	)
	public void method8601(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 651
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 652
		this.array[++this.offset - 1] = (byte)var1; // L: 653
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 654
	} // L: 655

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "124"
	)
	public int method8760() {
		this.offset += 4; // L: 658
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24); // L: 659
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-989742123"
	)
	public int method8585() {
		this.offset += 4; // L: 663
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16); // L: 664
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1858254825"
	)
	public int method8604() {
		this.offset += 4; // L: 668
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24); // L: 669
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-2071927058"
	)
	public void method8605(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) { // L: 673
			var1[var4] = this.array[++this.offset - 1];
		}

	} // L: 674
}
