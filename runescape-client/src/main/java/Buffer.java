import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tl")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("az")
	@Export("crc32Table")
	static int[] crc32Table;
	@ObfuscatedName("ao")
	@Export("crc64Table")
	static long[] crc64Table;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lum;"
	)
	static IndexedSprite field5063;
	@ObfuscatedName("an")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -497241169
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
		this.array = HealthBar.ByteArrayPool_getArray(var1); // L: 60
		this.offset = 0; // L: 61
	} // L: 62

	public Buffer(byte[] var1) {
		this.array = var1; // L: 69
		this.offset = 0; // L: 70
	} // L: 71

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "47"
	)
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) { // L: 74
			UserComparator7.ByteArrayPool_release(this.array);
		}

		this.array = null; // L: 75
	} // L: 76

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2129986472"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 79
	} // L: 80

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-816400716"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 83
		this.array[++this.offset - 1] = (byte)var1; // L: 84
	} // L: 85

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "34"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 88
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 89
		this.array[++this.offset - 1] = (byte)var1; // L: 90
	} // L: 91

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "3219"
	)
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 94
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 95
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 96
		this.array[++this.offset - 1] = (byte)var1; // L: 97
	} // L: 98

	@ObfuscatedName("bz")
	public void method9044(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 101
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 102
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 103
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 104
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 105
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 106
	} // L: 107

	@ObfuscatedName("bv")
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

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-908601683"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0); // L: 121
	} // L: 122

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1783694422"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0); // L: 129
		if (var2 >= 0) { // L: 130
			throw new IllegalArgumentException("");
		} else {
			this.offset += class357.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 131
			this.array[++this.offset - 1] = 0; // L: 132
		}
	} // L: 133

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1929245340"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0); // L: 140
		if (var2 >= 0) { // L: 141
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0; // L: 142
			this.offset += class357.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 143
			this.array[++this.offset - 1] = 0; // L: 144
		}
	} // L: 145

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)V",
		garbageValue = "-1721288517"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var2 = class496.method8836(var1); // L: 148
		this.array[++this.offset - 1] = 0; // L: 149
		this.writeVarInt(var2); // L: 150
		int var3 = this.offset; // L: 151
		byte[] var5 = this.array; // L: 153
		int var6 = this.offset; // L: 154
		int var7 = var1.length(); // L: 156
		int var8 = var6; // L: 157

		for (int var9 = 0; var9 < var7; ++var9) { // L: 158
			char var10 = var1.charAt(var9); // L: 159
			if (var10 <= 127) { // L: 160
				var5[var8++] = (byte)var10; // L: 161
			} else if (var10 <= 2047) { // L: 163
				var5[var8++] = (byte)(192 | var10 >> 6); // L: 164
				var5[var8++] = (byte)(128 | var10 & '?'); // L: 165
			} else {
				var5[var8++] = (byte)(224 | var10 >> '\f'); // L: 168
				var5[var8++] = (byte)(128 | var10 >> 6 & 63); // L: 169
				var5[var8++] = (byte)(128 | var10 & '?'); // L: 170
			}
		}

		int var4 = var8 - var6; // L: 173
		this.offset = var4 + var3; // L: 175
	} // L: 176

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "([BIIS)V",
		garbageValue = "245"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) { // L: 179
			this.array[++this.offset - 1] = var1[var4];
		}

	} // L: 180

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Ltl;B)V",
		garbageValue = "97"
	)
	public void method9133(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset); // L: 183
	} // L: 184

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1249153174"
	)
	@Export("writeLengthInt")
	public void writeLengthInt(int var1) {
		if (var1 < 0) { // L: 187
			throw new IllegalArgumentException(); // L: 188
		} else {
			this.array[this.offset - var1 - 4] = (byte)(var1 >> 24); // L: 190
			this.array[this.offset - var1 - 3] = (byte)(var1 >> 16); // L: 191
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 192
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 193
		}
	} // L: 194

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-49"
	)
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) { // L: 197
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 200
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 201
		} else {
			throw new IllegalArgumentException(); // L: 198
		}
	} // L: 202

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "71"
	)
	public void method9054(int var1) {
		if (var1 >= 0 && var1 <= 255) { // L: 205
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 208
		} else {
			throw new IllegalArgumentException(); // L: 206
		}
	} // L: 209

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1775399144"
	)
	@Export("writeSmartByteShort")
	public void writeSmartByteShort(int var1) {
		if (var1 >= 0 && var1 < 128) { // L: 212
			this.writeByte(var1); // L: 213
		} else if (var1 >= 0 && var1 < 32768) { // L: 216
			this.writeShort(var1 + 32768); // L: 217
		} else {
			throw new IllegalArgumentException(); // L: 220
		}
	} // L: 214 218

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-121"
	)
	@Export("writeVarInt")
	public void writeVarInt(int var1) {
		if ((var1 & -128) != 0) { // L: 224
			if ((var1 & -16384) != 0) { // L: 225
				if ((var1 & -2097152) != 0) { // L: 226
					if ((var1 & -268435456) != 0) { // L: 227
						this.writeByte(var1 >>> 28 | 128);
					}

					this.writeByte(var1 >>> 21 | 128); // L: 228
				}

				this.writeByte(var1 >>> 14 | 128); // L: 230
			}

			this.writeByte(var1 >>> 7 | 128); // L: 232
		}

		this.writeByte(var1 & 127); // L: 234
	} // L: 235

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-815975818"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255; // L: 238
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-1590554218"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1]; // L: 242
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "11"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2; // L: 246
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 247
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-1"
	)
	@Export("readShort")
	public int readShort() {
		this.offset += 2; // L: 251
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 252
		if (var1 > 32767) { // L: 253
			var1 -= 65536;
		}

		return var1; // L: 254
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-70"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3; // L: 258
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 259
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1220449293"
	)
	public int method9166() {
		this.offset += 3; // L: 263
		int var1 = ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 264
		if (var1 > 8388607) { // L: 265
			var1 -= 16777216;
		}

		return var1; // L: 266
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-464995325"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 4; // L: 270
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24); // L: 271
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "398305952"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L; // L: 275
		long var3 = (long)this.readInt() & 4294967295L; // L: 276
		return var3 + (var1 << 32); // L: 277
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "-258612713"
	)
	public float method9065() {
		return Float.intBitsToFloat(this.readInt()); // L: 281
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1937220874"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1; // L: 285
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-108"
	)
	@Export("readStringCp1252NullTerminatedOrNull")
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset] == 0) { // L: 289
			++this.offset; // L: 290
			return null; // L: 291
		} else {
			return this.readStringCp1252NullTerminated(); // L: 293
		}
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "116"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset; // L: 297

		while (this.array[++this.offset - 1] != 0) { // L: 298
		}

		int var2 = this.offset - var1 - 1; // L: 299
		return var2 == 0 ? "" : LoginScreenAnimation.decodeStringCp1252(this.array, var1, var2); // L: 300 301
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "32"
	)
	@Export("readStringCp1252NullCircumfixed")
	public String readStringCp1252NullCircumfixed() {
		byte var1 = this.array[++this.offset - 1]; // L: 305
		if (var1 != 0) { // L: 306
			throw new IllegalStateException("");
		} else {
			int var2 = this.offset; // L: 307

			while (this.array[++this.offset - 1] != 0) { // L: 308
			}

			int var3 = this.offset - var2 - 1; // L: 309
			return var3 == 0 ? "" : LoginScreenAnimation.decodeStringCp1252(this.array, var2, var3); // L: 310 311
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-165112095"
	)
	@Export("readCESU8")
	public String readCESU8() {
		byte var1 = this.array[++this.offset - 1]; // L: 315
		if (var1 != 0) { // L: 316
			throw new IllegalStateException("");
		} else {
			int var2 = this.readVarInt(); // L: 317
			if (var2 + this.offset > this.array.length) { // L: 318
				throw new IllegalStateException("");
			} else {
				byte[] var4 = this.array; // L: 320
				int var5 = this.offset; // L: 321
				char[] var6 = new char[var2]; // L: 323
				int var7 = 0; // L: 324
				int var8 = var5; // L: 325

				int var11;
				for (int var9 = var2 + var5; var8 < var9; var6[var7++] = (char)var11) { // L: 326 327 358
					int var10 = var4[var8++] & 255; // L: 328
					if (var10 < 128) { // L: 330
						if (var10 == 0) { // L: 331
							var11 = 65533;
						} else {
							var11 = var10; // L: 332
						}
					} else if (var10 < 192) { // L: 334
						var11 = 65533;
					} else if (var10 < 224) { // L: 335
						if (var8 < var9 && (var4[var8] & 192) == 128) { // L: 336
							var11 = (var10 & 31) << 6 | var4[var8++] & 63; // L: 337
							if (var11 < 128) { // L: 338
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 340
						}
					} else if (var10 < 240) { // L: 342
						if (var8 + 1 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128) { // L: 343
							var11 = (var10 & 15) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63; // L: 344
							if (var11 < 2048) { // L: 345
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 347
						}
					} else if (var10 < 248) { // L: 349
						if (var8 + 2 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128 && (var4[var8 + 2] & 192) == 128) { // L: 350
							var11 = (var10 & 7) << 18 | (var4[var8++] & 63) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63; // L: 351
							if (var11 >= 65536 && var11 <= 1114111) { // L: 352
								var11 = 65533; // L: 353
							} else {
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 355
						}
					} else {
						var11 = 65533; // L: 357
					}
				}

				String var3 = new String(var6, 0, var7); // L: 360
				this.offset += var2; // L: 363
				return var3; // L: 364
			}
		}
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "56"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1]; // L: 368
		}

	} // L: 369

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-844"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 372
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152; // L: 373 374
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "528262703"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 378
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768; // L: 379 380
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1965471998"
	)
	public int method9195() {
		int var1 = this.array[this.offset] & 255; // L: 384
		return var1 < 128 ? this.readUnsignedByte() - 1 : this.readUnsignedShort() - 32769; // L: 385 386
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1955196763"
	)
	public int method9075() {
		int var1 = 0; // L: 390

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) { // L: 391 392 394
			var1 += 32767; // L: 393
		}

		var1 += var2; // L: 396
		return var1; // L: 397
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "718444926"
	)
	public int method9076() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort(); // L: 401 402
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "478791271"
	)
	public int method9077() {
		if (this.array[this.offset] < 0) { // L: 406
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort(); // L: 407
			return var1 == 32767 ? -1 : var1; // L: 408
		}
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-638227856"
	)
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[++this.offset - 1]; // L: 413

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) { // L: 414 415 417
			var2 = (var2 | var1 & 127) << 7; // L: 416
		}

		return var2 | var1; // L: 419
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1684714078"
	)
	public int method9079() {
		int var2 = 0; // L: 424
		int var3 = 0; // L: 425

		int var1;
		do {
			var1 = this.readUnsignedByte(); // L: 427
			var2 |= (var1 & 127) << var3; // L: 428
			var3 += 7; // L: 429
		} while(var1 > 127); // L: 430

		return var2; // L: 431
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "-1592376732"
	)
	@Export("xteaEncryptAll")
	public void xteaEncryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 435
		this.offset = 0; // L: 436

		for (int var3 = 0; var3 < var2; ++var3) { // L: 437
			int var4 = this.readInt(); // L: 438
			int var5 = this.readInt(); // L: 439
			int var6 = 0; // L: 440
			int var7 = -1640531527; // L: 441

			for (int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) { // L: 442 443 446
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]; // L: 444
				var6 += var7; // L: 445
			}

			this.offset -= 8; // L: 448
			this.writeInt(var4); // L: 449
			this.writeInt(var5); // L: 450
		}

	} // L: 452

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "-572928842"
	)
	@Export("xteaDecryptAll")
	public void xteaDecryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 455
		this.offset = 0; // L: 456

		for (int var3 = 0; var3 < var2; ++var3) { // L: 457
			int var4 = this.readInt(); // L: 458
			int var5 = this.readInt(); // L: 459
			int var6 = -957401312; // L: 460
			int var7 = -1640531527; // L: 461

			for (int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) { // L: 462 463 466
				var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6; // L: 464
				var6 -= var7; // L: 465
			}

			this.offset -= 8; // L: 468
			this.writeInt(var4); // L: 469
			this.writeInt(var5); // L: 470
		}

	} // L: 472

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "269622735"
	)
	@Export("xteaEncrypt")
	public void xteaEncrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 475
		this.offset = var2; // L: 476
		int var5 = (var3 - var2) / 8; // L: 477

		for (int var6 = 0; var6 < var5; ++var6) { // L: 478
			int var7 = this.readInt(); // L: 479
			int var8 = this.readInt(); // L: 480
			int var9 = 0; // L: 481
			int var10 = -1640531527; // L: 482

			for (int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) { // L: 483 484 487
				var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]; // L: 485
				var9 += var10; // L: 486
			}

			this.offset -= 8; // L: 489
			this.writeInt(var7); // L: 490
			this.writeInt(var8); // L: 491
		}

		this.offset = var4; // L: 493
	} // L: 494

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "([IIIB)V",
		garbageValue = "-33"
	)
	@Export("xteaDecrypt")
	public void xteaDecrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 497
		this.offset = var2; // L: 498
		int var5 = (var3 - var2) / 8; // L: 499

		for (int var6 = 0; var6 < var5; ++var6) { // L: 500
			int var7 = this.readInt(); // L: 501
			int var8 = this.readInt(); // L: 502
			int var9 = -957401312; // L: 503
			int var10 = -1640531527; // L: 504

			for (int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) { // L: 505 506 509
				var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9; // L: 507
				var9 -= var10; // L: 508
			}

			this.offset -= 8; // L: 511
			this.writeInt(var7); // L: 512
			this.writeInt(var8); // L: 513
		}

		this.offset = var4; // L: 515
	} // L: 516

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
		garbageValue = "-1901436505"
	)
	@Export("encryptRsa")
	public void encryptRsa(BigInteger var1, BigInteger var2) {
		int var3 = this.offset; // L: 519
		this.offset = 0; // L: 520
		byte[] var4 = new byte[var3]; // L: 521
		this.readBytes(var4, 0, var3); // L: 522
		BigInteger var5 = new BigInteger(var4); // L: 523
		BigInteger var6 = var5.modPow(var1, var2); // L: 524
		byte[] var7 = var6.toByteArray(); // L: 525
		this.offset = 0; // L: 526
		this.writeShort(var7.length); // L: 527
		this.writeBytes(var7, 0, var7.length); // L: 528
	} // L: 529

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1894806570"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		int var2 = class36.method696(this.array, var1, this.offset); // L: 532
		this.writeInt(var2); // L: 533
		return var2; // L: 534
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2106931974"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4; // L: 538
		int var1 = class36.method696(this.array, 0, this.offset); // L: 539
		int var2 = this.readInt(); // L: 540
		return var1 == var2; // L: 541
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-543411800"
	)
	public void method9087(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 546
	} // L: 547

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1625036128"
	)
	public void method9088(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1); // L: 550
	} // L: 551

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-58"
	)
	public void method9204(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1); // L: 554
	} // L: 555

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1848022112"
	)
	public int method9226() {
		return this.array[++this.offset - 1] - 128 & 255; // L: 558
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "68"
	)
	public int method9130() {
		return 0 - this.array[++this.offset - 1] & 255; // L: 562
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1532027499"
	)
	public int method9258() {
		return 128 - this.array[++this.offset - 1] & 255; // L: 566
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-1751361952"
	)
	public byte method9121() {
		return (byte)(this.array[++this.offset - 1] - 128); // L: 570
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-2063478296"
	)
	public byte method9094() {
		return (byte)(0 - this.array[++this.offset - 1]); // L: 574
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(S)B",
		garbageValue = "230"
	)
	public byte method9059() {
		return (byte)(128 - this.array[++this.offset - 1]); // L: 578
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1839274532"
	)
	public void method9096(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 582
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 583
	} // L: 584

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "800065074"
	)
	public void method9097(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 587
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 588
	} // L: 589

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "425984057"
	)
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 592
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 593
	} // L: 594

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "847930045"
	)
	public int method9099() {
		this.offset += 2; // L: 597
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 598
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	public int method9100() {
		this.offset += 2; // L: 602
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 603
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-318800777"
	)
	public int method9101() {
		this.offset += 2; // L: 607
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 608
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1419659989"
	)
	public int method9102() {
		this.offset += 2; // L: 612
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 613
		if (var1 > 32767) { // L: 614
			var1 -= 65536;
		}

		return var1; // L: 615
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2055651508"
	)
	public int method9103() {
		this.offset += 2; // L: 619
		int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 620
		if (var1 > 32767) { // L: 621
			var1 -= 65536;
		}

		return var1; // L: 622
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-66"
	)
	public void method9104(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 626
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 627
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 628
	} // L: 629

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-29805155"
	)
	public int method9105() {
		this.offset += 3; // L: 632
		return (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16); // L: 633
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "208613978"
	)
	public int method9106() {
		this.offset += 3; // L: 637
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 2] & 255); // L: 638
	}

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-475144527"
	)
	public int method9107() {
		this.offset += 3; // L: 642
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16); // L: 643
		if (var1 > 8388607) { // L: 644
			var1 -= 16777216;
		}

		return var1; // L: 645
	}

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1104383705"
	)
	public void method9108(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 649
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 650
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 651
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 652
	} // L: 653

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "8"
	)
	public void method9109(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 656
		this.array[++this.offset - 1] = (byte)var1; // L: 657
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 658
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 659
	} // L: 660

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-528387156"
	)
	public void method9110(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 663
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 664
		this.array[++this.offset - 1] = (byte)var1; // L: 665
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 666
	} // L: 667

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-104"
	)
	public int method9111() {
		this.offset += 4; // L: 670
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24); // L: 671
	}

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1418852994"
	)
	public int method9144() {
		this.offset += 4; // L: 675
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16); // L: 676
	}

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "488438738"
	)
	public int method9113() {
		this.offset += 4; // L: 680
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24); // L: 681
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-639321754"
	)
	public void method9090(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) { // L: 685
			var1[var4] = this.array[++this.offset - 1];
		}

	} // L: 686

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-644648227"
	)
	public void method9245(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) { // L: 689
			var1[var4] = (byte)(this.array[++this.offset - 1] - 128);
		}

	} // L: 690
}
