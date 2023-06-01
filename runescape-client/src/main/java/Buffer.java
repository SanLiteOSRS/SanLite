import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tc")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("ag")
	@Export("crc32Table")
	public static int[] crc32Table;
	@ObfuscatedName("aw")
	@Export("crc64Table")
	static long[] crc64Table;
	@ObfuscatedName("aj")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1981210459
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
		this.array = ByteArrayPool.ByteArrayPool_getArrayBool(var1, var2); // L: 52
	} // L: 53

	public Buffer(int var1) {
		this.array = class130.ByteArrayPool_getArray(var1); // L: 47
		this.offset = 0; // L: 48
	} // L: 49

	public Buffer(byte[] var1) {
		this.array = var1; // L: 56
		this.offset = 0; // L: 57
	} // L: 58

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) { // L: 61
			WorldMapElement.ByteArrayPool_release(this.array);
		}

		this.array = null; // L: 62
	} // L: 63

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "3137"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 66
	} // L: 67

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "939138571"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 70
		this.array[++this.offset - 1] = (byte)var1; // L: 71
	} // L: 72

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "83862206"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16);
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)var1;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2134170512"
	)
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24);
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 82
		this.array[++this.offset - 1] = (byte)(var1 >> 8);
		this.array[++this.offset - 1] = (byte)var1;
	}

	@ObfuscatedName("bs")
	public void method8952(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16));
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8));
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 93
	}

	@ObfuscatedName("bt")
	@Export("writeLong")
	public void writeLong(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 56)); // L: 97
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 48)); // L: 98
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 99
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 100
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 101
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 102
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 103
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 104
	} // L: 105

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2069641448"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0); // L: 108
	} // L: 109

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1857732296"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0); // L: 116
		if (var2 >= 0) { // L: 117
			throw new IllegalArgumentException("");
		} else {
			this.offset += WorldMapScaleHandler.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 118
			this.array[++this.offset - 1] = 0; // L: 119
		}
	} // L: 120

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-360831231"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0); // L: 127
		if (var2 >= 0) { // L: 128
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0; // L: 129
			this.offset += WorldMapScaleHandler.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 130
			this.array[++this.offset - 1] = 0; // L: 131
		}
	} // L: 132

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)V",
		garbageValue = "89"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var3 = var1.length(); // L: 137
		int var4 = 0; // L: 138

		int var5;
		for (var5 = 0; var5 < var3; ++var5) { // L: 139
			char var12 = var1.charAt(var5); // L: 140
			if (var12 <= 127) { // L: 141
				++var4;
			} else if (var12 <= 2047) { // L: 142
				var4 += 2;
			} else {
				var4 += 3; // L: 143
			}
		}

		this.array[++this.offset - 1] = 0; // L: 148
		this.writeVarInt(var4); // L: 149
		var4 = this.offset; // L: 150
		byte[] var6 = this.array; // L: 152
		int var7 = this.offset; // L: 153
		int var8 = var1.length(); // L: 155
		int var9 = var7; // L: 156

		for (int var10 = 0; var10 < var8; ++var10) { // L: 157
			char var11 = var1.charAt(var10); // L: 158
			if (var11 <= 127) { // L: 159
				var6[var9++] = (byte)var11; // L: 160
			} else if (var11 <= 2047) { // L: 162
				var6[var9++] = (byte)(192 | var11 >> 6); // L: 163
				var6[var9++] = (byte)(128 | var11 & '?'); // L: 164
			} else {
				var6[var9++] = (byte)(224 | var11 >> '\f'); // L: 167
				var6[var9++] = (byte)(128 | var11 >> 6 & 63); // L: 168
				var6[var9++] = (byte)(128 | var11 & '?'); // L: 169
			}
		}

		var5 = var9 - var7; // L: 172
		this.offset = var5 + var4; // L: 174
	} // L: 175

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "2122448515"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) { // L: 178
			this.array[++this.offset - 1] = var1[var4];
		}

	} // L: 179

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Ltc;B)V",
		garbageValue = "0"
	)
	public void method8959(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset); // L: 182
	} // L: 183

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1876841872"
	)
	@Export("writeLengthInt")
	public void writeLengthInt(int var1) {
		if (var1 < 0) { // L: 186
			throw new IllegalArgumentException(); // L: 187
		} else {
			this.array[this.offset - var1 - 4] = (byte)(var1 >> 24); // L: 189
			this.array[this.offset - var1 - 3] = (byte)(var1 >> 16); // L: 190
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 191
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 192
		}
	} // L: 193

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-102238308"
	)
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) { // L: 196
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 199
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 200
		} else {
			throw new IllegalArgumentException(); // L: 197
		}
	} // L: 201

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1997437379"
	)
	public void method9158(int var1) {
		if (var1 >= 0 && var1 <= 255) { // L: 204
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 207
		} else {
			throw new IllegalArgumentException(); // L: 205
		}
	} // L: 208

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "85162635"
	)
	@Export("writeSmartByteShort")
	public void writeSmartByteShort(int var1) {
		if (var1 >= 0 && var1 < 128) { // L: 211
			this.writeByte(var1); // L: 212
		} else if (var1 >= 0 && var1 < 32768) { // L: 215
			this.writeShort(var1 + 32768); // L: 216
		} else {
			throw new IllegalArgumentException(); // L: 219
		}
	} // L: 213 217

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-20"
	)
	@Export("writeVarInt")
	public void writeVarInt(int var1) {
		if ((var1 & -128) != 0) { // L: 223
			if ((var1 & -16384) != 0) { // L: 224
				if ((var1 & -2097152) != 0) { // L: 225
					if ((var1 & -268435456) != 0) { // L: 226
						this.writeByte(var1 >>> 28 | 128);
					}

					this.writeByte(var1 >>> 21 | 128); // L: 227
				}

				this.writeByte(var1 >>> 14 | 128); // L: 229
			}

			this.writeByte(var1 >>> 7 | 128); // L: 231
		}

		this.writeByte(var1 & 127); // L: 233
	} // L: 234

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "68"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255; // L: 237
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-1829940513"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1]; // L: 241
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-697393629"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2; // L: 245
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 246
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-929376983"
	)
	@Export("readShort")
	public int readShort() {
		this.offset += 2; // L: 250
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 251
		if (var1 > 32767) { // L: 252
			var1 -= 65536;
		}

		return var1; // L: 253
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1338146100"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3; // L: 257
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 258
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-753926089"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 4; // L: 262
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24); // L: 263
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "1596106411"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L; // L: 267
		long var3 = (long)this.readInt() & 4294967295L; // L: 268
		return (var1 << 32) + var3; // L: 269
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "431305303"
	)
	public float method8971() {
		return Float.intBitsToFloat(this.readInt()); // L: 273
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "310"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1; // L: 277
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1031050960"
	)
	@Export("readStringCp1252NullTerminatedOrNull")
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset] == 0) { // L: 281
			++this.offset; // L: 282
			return null; // L: 283
		} else {
			return this.readStringCp1252NullTerminated(); // L: 285
		}
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1522465587"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset; // L: 289

		while (this.array[++this.offset - 1] != 0) { // L: 290
		}

		int var2 = this.offset - var1 - 1; // L: 291
		return var2 == 0 ? "" : class149.decodeStringCp1252(this.array, var1, var2); // L: 292 293
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-16"
	)
	@Export("readStringCp1252NullCircumfixed")
	public String readStringCp1252NullCircumfixed() {
		byte var1 = this.array[++this.offset - 1]; // L: 297
		if (var1 != 0) { // L: 298
			throw new IllegalStateException("");
		} else {
			int var2 = this.offset; // L: 299

			while (this.array[++this.offset - 1] != 0) { // L: 300
			}

			int var3 = this.offset - var2 - 1; // L: 301
			return var3 == 0 ? "" : class149.decodeStringCp1252(this.array, var2, var3); // L: 302 303
		}
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1825938293"
	)
	@Export("readCESU8")
	public String readCESU8() {
		byte var1 = this.array[++this.offset - 1]; // L: 307
		if (var1 != 0) { // L: 308
			throw new IllegalStateException("");
		} else {
			int var2 = this.readVarInt(); // L: 309
			if (var2 + this.offset > this.array.length) { // L: 310
				throw new IllegalStateException("");
			} else {
				byte[] var4 = this.array; // L: 312
				int var5 = this.offset; // L: 313
				char[] var6 = new char[var2]; // L: 315
				int var7 = 0; // L: 316
				int var8 = var5; // L: 317

				int var11;
				for (int var9 = var2 + var5; var8 < var9; var6[var7++] = (char)var11) { // L: 318 319 350
					int var10 = var4[var8++] & 255; // L: 320
					if (var10 < 128) { // L: 322
						if (var10 == 0) { // L: 323
							var11 = 65533;
						} else {
							var11 = var10; // L: 324
						}
					} else if (var10 < 192) { // L: 326
						var11 = 65533;
					} else if (var10 < 224) { // L: 327
						if (var8 < var9 && (var4[var8] & 192) == 128) { // L: 328
							var11 = (var10 & 31) << 6 | var4[var8++] & 63; // L: 329
							if (var11 < 128) { // L: 330
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 332
						}
					} else if (var10 < 240) { // L: 334
						if (var8 + 1 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128) { // L: 335
							var11 = (var10 & 15) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63; // L: 336
							if (var11 < 2048) { // L: 337
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 339
						}
					} else if (var10 < 248) { // L: 341
						if (var8 + 2 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128 && (var4[var8 + 2] & 192) == 128) { // L: 342
							var11 = (var10 & 7) << 18 | (var4[var8++] & 63) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63; // L: 343
							if (var11 >= 65536 && var11 <= 1114111) { // L: 344
								var11 = 65533; // L: 345
							} else {
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 347
						}
					} else {
						var11 = 65533; // L: 349
					}
				}

				String var3 = new String(var6, 0, var7); // L: 352
				this.offset += var2; // L: 355
				return var3; // L: 356
			}
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-223096336"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1]; // L: 360
		}

	} // L: 361

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 364
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152; // L: 365 366
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-356239869"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 370
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768; // L: 371 372
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2066895645"
	)
	public int method8980() {
		int var1 = this.array[this.offset] & 255; // L: 376
		return var1 < 128 ? this.readUnsignedByte() - 1 : this.readUnsignedShort() - 32769; // L: 377 378
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1902724453"
	)
	public int method8981() {
		int var1 = 0; // L: 382

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) { // L: 383 384 386
			var1 += 32767; // L: 385
		}

		var1 += var2; // L: 388
		return var1; // L: 389
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2077231491"
	)
	public int method9194() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort(); // L: 393 394
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1034077876"
	)
	public int method9095() {
		if (this.array[this.offset] < 0) { // L: 398
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort(); // L: 399
			return var1 == 32767 ? -1 : var1; // L: 400
		}
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1962300869"
	)
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[++this.offset - 1]; // L: 405

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) { // L: 406 407 409
			var2 = (var2 | var1 & 127) << 7; // L: 408
		}

		return var2 | var1; // L: 411
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "8"
	)
	public int method8985() {
		int var2 = 0; // L: 416
		int var3 = 0; // L: 417

		int var1;
		do {
			var1 = this.readUnsignedByte(); // L: 419
			var2 |= (var1 & 127) << var3; // L: 420
			var3 += 7; // L: 421
		} while(var1 > 127); // L: 422

		return var2; // L: 423
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "([IB)V",
		garbageValue = "92"
	)
	@Export("xteaEncryptAll")
	public void xteaEncryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 427
		this.offset = 0; // L: 428

		for (int var3 = 0; var3 < var2; ++var3) { // L: 429
			int var4 = this.readInt(); // L: 430
			int var5 = this.readInt(); // L: 431
			int var6 = 0; // L: 432
			int var7 = -1640531527; // L: 433

			for (int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) { // L: 434 435 438
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]; // L: 436
				var6 += var7; // L: 437
			}

			this.offset -= 8; // L: 440
			this.writeIntME(var4); // L: 441
			this.writeIntME(var5); // L: 442
		}

	} // L: 444

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "-1095392891"
	)
	@Export("xteaDecryptAll")
	public void xteaDecryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 447
		this.offset = 0; // L: 448

		for (int var3 = 0; var3 < var2; ++var3) { // L: 449
			int var4 = this.readInt(); // L: 450
			int var5 = this.readInt(); // L: 451
			int var6 = -957401312; // L: 452
			int var7 = -1640531527; // L: 453

			for (int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) { // L: 454 455 458
				var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6; // L: 456
				var6 -= var7; // L: 457
			}

			this.offset -= 8; // L: 460
			this.writeIntME(var4); // L: 461
			this.writeIntME(var5); // L: 462
		}

	} // L: 464

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "([IIIB)V",
		garbageValue = "-63"
	)
	@Export("xteaEncrypt")
	public void xteaEncrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 467
		this.offset = var2; // L: 468
		int var5 = (var3 - var2) / 8; // L: 469

		for (int var6 = 0; var6 < var5; ++var6) { // L: 470
			int var7 = this.readInt(); // L: 471
			int var8 = this.readInt(); // L: 472
			int var9 = 0; // L: 473
			int var10 = -1640531527; // L: 474

			for (int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) { // L: 475 476 479
				var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]; // L: 477
				var9 += var10; // L: 478
			}

			this.offset -= 8; // L: 481
			this.writeIntME(var7); // L: 482
			this.writeIntME(var8); // L: 483
		}

		this.offset = var4; // L: 485
	} // L: 486

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "([IIIB)V",
		garbageValue = "112"
	)
	@Export("xteaDecrypt")
	public void xteaDecrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 489
		this.offset = var2; // L: 490
		int var5 = (var3 - var2) / 8; // L: 491

		for (int var6 = 0; var6 < var5; ++var6) { // L: 492
			int var7 = this.readInt(); // L: 493
			int var8 = this.readInt(); // L: 494
			int var9 = -957401312; // L: 495
			int var10 = -1640531527; // L: 496

			for (int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) { // L: 497 498 501
				var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9; // L: 499
				var9 -= var10; // L: 500
			}

			this.offset -= 8; // L: 503
			this.writeIntME(var7); // L: 504
			this.writeIntME(var8); // L: 505
		}

		this.offset = var4; // L: 507
	} // L: 508

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V",
		garbageValue = "6"
	)
	@Export("encryptRsa")
	public void encryptRsa(BigInteger var1, BigInteger var2) {
		int var3 = this.offset; // L: 511
		this.offset = 0; // L: 512
		byte[] var4 = new byte[var3]; // L: 513
		this.readBytes(var4, 0, var3); // L: 514
		BigInteger var5 = new BigInteger(var4); // L: 515
		BigInteger var6 = var5.modPow(var1, var2); // L: 516
		byte[] var7 = var6.toByteArray(); // L: 517
		this.offset = 0; // L: 518
		this.writeShort(var7.length); // L: 519
		this.writeBytes(var7, 0, var7.length); // L: 520
	} // L: 521

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1626209491"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		byte[] var3 = this.array; // L: 525
		int var4 = this.offset; // L: 526
		int var5 = -1; // L: 528

		for (int var6 = var1; var6 < var4; ++var6) { // L: 529
			var5 = var5 >>> 8 ^ crc32Table[(var5 ^ var3[var6]) & 255]; // L: 530
		}

		var5 = ~var5; // L: 532
		this.writeIntME(var5); // L: 536
		return var5; // L: 537
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1346202049"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4; // L: 541
		byte[] var2 = this.array; // L: 543
		int var3 = this.offset; // L: 544
		int var4 = -1; // L: 546

		int var5;
		for (var5 = 0; var5 < var3; ++var5) { // L: 547
			var4 = var4 >>> 8 ^ crc32Table[(var4 ^ var2[var5]) & 255]; // L: 548
		}

		var4 = ~var4; // L: 550
		var5 = this.readInt(); // L: 554
		return var5 == var4; // L: 555
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-668991614"
	)
	public void method8993(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 560
	} // L: 561

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "32"
	)
	public void method8994(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1); // L: 564
	} // L: 565

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1826573457"
	)
	public void method8995(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1); // L: 568
	} // L: 569

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-169836895"
	)
	public int method9050() {
		return this.array[++this.offset - 1] - 128 & 255; // L: 572
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-2"
	)
	public int method9026() {
		return 0 - this.array[++this.offset - 1] & 255; // L: 576
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	public int method8998() {
		return 128 - this.array[++this.offset - 1] & 255; // L: 580
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(S)B",
		garbageValue = "21481"
	)
	public byte method8965() {
		return (byte)(this.array[++this.offset - 1] - 128); // L: 584
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "1366315037"
	)
	public byte method9000() {
		return (byte)(0 - this.array[++this.offset - 1]); // L: 588
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "-48"
	)
	public byte method9090() {
		return (byte)(128 - this.array[++this.offset - 1]); // L: 592
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "427440022"
	)
	public void method9002(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 596
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 597
	} // L: 598

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "45"
	)
	public void method9139(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 601
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 602
	} // L: 603

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "32"
	)
	public void method9004(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 606
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 607
	} // L: 608

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1672048913"
	)
	public int method9005() {
		this.offset += 2; // L: 611
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 612
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2097612584"
	)
	public int method9006() {
		this.offset += 2; // L: 616
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 617
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "228"
	)
	public int method9007() {
		this.offset += 2; // L: 621
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 622
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1010201450"
	)
	public int method9008() {
		this.offset += 2; // L: 626
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 627
		if (var1 > 32767) { // L: 628
			var1 -= 65536;
		}

		return var1; // L: 629
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-100"
	)
	public int method9009() {
		this.offset += 2; // L: 633
		int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 634
		if (var1 > 32767) { // L: 635
			var1 -= 65536;
		}

		return var1; // L: 636
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-120"
	)
	public void method9010(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 640
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 641
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 642
	} // L: 643

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1571720684"
	)
	public int method9011() {
		this.offset += 3; // L: 646
		return (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16); // L: 647
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1912982915"
	)
	public int method9012() {
		this.offset += 3; // L: 651
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 2] & 255); // L: 652
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-21845"
	)
	public int method9013() {
		this.offset += 3; // L: 656
		int var1 = (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16); // L: 657
		if (var1 > 8388607) { // L: 658
			var1 -= 16777216;
		}

		return var1; // L: 659
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "43"
	)
	public int method9131() {
		this.offset += 3; // L: 663
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16); // L: 664
		if (var1 > 8388607) { // L: 665
			var1 -= 16777216;
		}

		return var1; // L: 666
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "71"
	)
	public void method9088(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 670
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 671
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 672
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 673
	} // L: 674

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1194031333"
	)
	public void method9016(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 677
		this.array[++this.offset - 1] = (byte)var1; // L: 678
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 679
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 680
	} // L: 681

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "36"
	)
	public void method9133(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 684
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 685
		this.array[++this.offset - 1] = (byte)var1; // L: 686
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 687
	} // L: 688

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1805417452"
	)
	public int method9018() {
		this.offset += 4; // L: 691
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24); // L: 692
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-55"
	)
	public int method8967() {
		this.offset += 4; // L: 696
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16); // L: 697
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1138234889"
	)
	public int method9020() {
		this.offset += 4; // L: 701
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24); // L: 702
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-1439974326"
	)
	public void method8986(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) { // L: 706
			var1[var4] = this.array[++this.offset - 1];
		}

	} // L: 707

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-1785401677"
	)
	public void method9116(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = (byte)(this.array[++this.offset - 1] - 128); // L: 710
		}

	} // L: 711

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIILhi;II)V",
		garbageValue = "503021360"
	)
	static void method9207(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound(); // L: 73
		var5.plane = var0; // L: 74
		var5.x = var1 * 16384; // L: 75
		var5.y = var2 * 128; // L: 76
		int var6 = var3.sizeX; // L: 77
		int var7 = var3.sizeY; // L: 78
		if (var4 == 1 || var4 == 3) { // L: 79
			var6 = var3.sizeY; // L: 80
			var7 = var3.sizeX; // L: 81
		}

		var5.maxX = (var6 + var1) * 16384; // L: 83
		var5.maxY = (var7 + var2) * 128; // L: 84
		var5.soundEffectId = var3.ambientSoundId; // L: 85
		var5.field817 = var3.int7 * 128; // L: 86
		var5.field820 = var3.int5; // L: 87
		var5.field821 = var3.int6; // L: 88
		var5.soundEffectIds = var3.soundEffectIds; // L: 89
		if (var3.transforms != null) { // L: 90
			var5.obj = var3; // L: 91
			var5.set(); // L: 92
		}

		ObjectSound.objectSounds.addFirst(var5); // L: 94
		if (var5.soundEffectIds != null) { // L: 95
			var5.field823 = var5.field820 + (int)(Math.random() * (double)(var5.field821 - var5.field820));
		}

	} // L: 96
}
