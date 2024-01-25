import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uk")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("aa")
	@Export("crc32Table")
	public static int[] crc32Table;
	@ObfuscatedName("an")
	@Export("crc64Table")
	static long[] crc64Table;
	@ObfuscatedName("ao")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1309784879
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
		this.array = WorldMapEvent.ByteArrayPool_getArrayBool(var1, var2); // L: 52
	} // L: 53

	public Buffer(int var1) {
		this.array = class133.ByteArrayPool_getArray(var1); // L: 47
		this.offset = 0; // L: 48
	} // L: 49

	public Buffer(byte[] var1) {
		this.array = var1; // L: 56
		this.offset = 0; // L: 57
	} // L: 58

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1489494482"
	)
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) { // L: 61
			class143.ByteArrayPool_release(this.array);
		}

		this.array = null; // L: 62
	} // L: 63

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-202644955"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 66
	} // L: 67

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-5619"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 70
		this.array[++this.offset - 1] = (byte)var1; // L: 71
	} // L: 72

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1078635660"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 75
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 76
		this.array[++this.offset - 1] = (byte)var1; // L: 77
	} // L: 78

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "8"
	)
	public void method9373(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 81
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 82
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 83
		this.array[++this.offset - 1] = (byte)var1; // L: 84
	} // L: 85

	@ObfuscatedName("bo")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 88
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 89
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 90
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 91
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 92
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 93
	} // L: 94

	@ObfuscatedName("cg")
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

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-971730263"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0); // L: 108
	} // L: 109

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "236344793"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0); // L: 116
		if (var2 >= 0) { // L: 117
			throw new IllegalArgumentException("");
		} else {
			this.offset += AttackOption.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 118
			this.array[++this.offset - 1] = 0; // L: 119
		}
	} // L: 120

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-25"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0); // L: 127
		if (var2 >= 0) { // L: 128
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0; // L: 129
			this.offset += AttackOption.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 130
			this.array[++this.offset - 1] = 0; // L: 131
		}
	} // L: 132

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)V",
		garbageValue = "879410035"
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

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "310055975"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			this.array[++this.offset - 1] = var1[var4]; // L: 178
		}

	} // L: 179

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "1227049309"
	)
	public void method9460(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset); // L: 182
	} // L: 183

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "14"
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

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2132262227"
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

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-31427"
	)
	public void method9384(int var1) {
		if (var1 >= 0 && var1 <= 255) { // L: 204
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 207
		} else {
			throw new IllegalArgumentException(); // L: 205
		}
	} // L: 208

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2133831290"
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

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
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

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2033189238"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255; // L: 237
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "815489246"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1]; // L: 241
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1683152356"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2; // L: 245
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 246
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
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

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-75"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3; // L: 257
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 258
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-33"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 4; // L: 262
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24); // L: 263
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "1162464015"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L; // L: 267
		long var3 = (long)this.readInt() & 4294967295L; // L: 268
		return (var1 << 32) + var3; // L: 269
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "1245070717"
	)
	public float method9394() {
		return Float.intBitsToFloat(this.readInt()); // L: 273
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "860311073"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1; // L: 277
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "-5731"
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

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1068544795"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset; // L: 289

		while (this.array[++this.offset - 1] != 0) { // L: 290
		}

		int var2 = this.offset - var1 - 1; // L: 291
		return var2 == 0 ? "" : UrlRequest.decodeStringCp1252(this.array, var1, var2); // L: 292 293
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-433448428"
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
			return var3 == 0 ? "" : UrlRequest.decodeStringCp1252(this.array, var2, var3); // L: 302 303
		}
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "14"
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

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-1361275855"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1]; // L: 360
		}

	} // L: 361

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1538554896"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 364
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152; // L: 365 366
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1007368527"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 370
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768; // L: 371 372
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1459961612"
	)
	public int method9389() {
		int var1 = this.array[this.offset] & 255; // L: 376
		return var1 < 128 ? this.readUnsignedByte() - 1 : this.readUnsignedShort() - 32769; // L: 377 378
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1169517436"
	)
	public int method9404() {
		int var1 = 0; // L: 382

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) { // L: 383 384 386
			var1 += 32767; // L: 385
		}

		var1 += var2; // L: 388
		return var1; // L: 389
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "934112039"
	)
	public int method9405() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort(); // L: 393 394
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-516998024"
	)
	public int method9547() {
		if (this.array[this.offset] < 0) { // L: 398
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort(); // L: 399
			return var1 == 32767 ? -1 : var1; // L: 400
		}
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-5"
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

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-84"
	)
	public int method9529() {
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

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "-1838832064"
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
			this.method9373(var4); // L: 441
			this.method9373(var5); // L: 442
		}

	} // L: 444

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "([IB)V",
		garbageValue = "-10"
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
			this.method9373(var4); // L: 461
			this.method9373(var5); // L: 462
		}

	} // L: 464

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "([IIIB)V",
		garbageValue = "26"
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
			this.method9373(var7); // L: 482
			this.method9373(var8); // L: 483
		}

		this.offset = var4; // L: 485
	} // L: 486

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "([IIIB)V",
		garbageValue = "-64"
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
			this.method9373(var7); // L: 504
			this.method9373(var8); // L: 505
		}

		this.offset = var4; // L: 507
	} // L: 508

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
		garbageValue = "-2056257486"
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

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "243752382"
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
		this.method9373(var5); // L: 536
		return var5; // L: 537
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-66"
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
		return var4 == var5; // L: 555
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	public void method9416(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 560
	} // L: 561

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-513073890"
	)
	public void method9483(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1); // L: 564
	} // L: 565

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-94"
	)
	public void method9385(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1); // L: 568
	} // L: 569

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "789700938"
	)
	public int method9419() {
		return this.array[++this.offset - 1] - 128 & 255; // L: 572
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1184602897"
	)
	public int method9420() {
		return 0 - this.array[++this.offset - 1] & 255; // L: 576
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1493410655"
	)
	public int method9526() {
		return 128 - this.array[++this.offset - 1] & 255; // L: 580
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-1475415817"
	)
	public byte method9422() {
		return (byte)(this.array[++this.offset - 1] - 128); // L: 584
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "1813304973"
	)
	public byte method9423() {
		return (byte)(0 - this.array[++this.offset - 1]); // L: 588
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "-33"
	)
	public byte method9446() {
		return (byte)(128 - this.array[++this.offset - 1]); // L: 592
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "16"
	)
	public void method9557(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 596
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 597
	} // L: 598

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "668161353"
	)
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 601
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 602
	} // L: 603

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2116237055"
	)
	public void method9427(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 606
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 607
	} // L: 608

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1956041402"
	)
	public int method9538() {
		this.offset += 2; // L: 611
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 612
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1893292126"
	)
	public int method9398() {
		this.offset += 2; // L: 616
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 617
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1624169791"
	)
	public int method9430() {
		this.offset += 2; // L: 621
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 622
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1895569267"
	)
	public int method9431() {
		this.offset += 2; // L: 626
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 627
		if (var1 > 32767) { // L: 628
			var1 -= 65536;
		}

		return var1; // L: 629
	}

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int method9432() {
		this.offset += 2; // L: 633
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 634
		if (var1 > 32767) { // L: 635
			var1 -= 65536;
		}

		return var1; // L: 636
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-29"
	)
	public void method9433(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 640
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 641
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 642
	} // L: 643

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "763074399"
	)
	public int method9434() {
		this.offset += 3; // L: 646
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 2] & 255); // L: 647
	}

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-5"
	)
	public int method9435() {
		this.offset += 3; // L: 651
		int var1 = (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16); // L: 652
		if (var1 > 8388607) { // L: 653
			var1 -= 16777216;
		}

		return var1; // L: 654
	}

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-84"
	)
	public int method9436() {
		this.offset += 3; // L: 658
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 2] & 255); // L: 659
		if (var1 > 8388607) { // L: 660
			var1 -= 16777216;
		}

		return var1; // L: 661
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "582377807"
	)
	public void method9437(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 665
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 666
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 667
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 668
	} // L: 669

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "256550343"
	)
	public void method9494(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 672
		this.array[++this.offset - 1] = (byte)var1; // L: 673
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 674
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 675
	} // L: 676

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "4"
	)
	public void method9439(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 679
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 680
		this.array[++this.offset - 1] = (byte)var1; // L: 681
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 682
	} // L: 683

	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "100162391"
	)
	public int method9429() {
		this.offset += 4; // L: 686
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24); // L: 687
	}

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1868546628"
	)
	public int method9441() {
		this.offset += 4; // L: 691
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16); // L: 692
	}

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "11"
	)
	public int method9442() {
		this.offset += 4; // L: 696
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24); // L: 697
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1480373543"
	)
	public void method9533(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) {
			var1[var4] = this.array[++this.offset - 1]; // L: 701
		}

	} // L: 702
}
