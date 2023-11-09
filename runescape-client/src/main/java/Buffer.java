import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qr")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("n")
	@Export("crc32Table")
	static int[] crc32Table;
	@ObfuscatedName("a")
	@Export("crc64Table")
	static long[] crc64Table;
	@ObfuscatedName("k")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1795921631
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
		this.array = ArchiveDiskActionHandler.ByteArrayPool_getArray(var1); // L: 56
		this.offset = 0; // L: 57
	} // L: 58

	public Buffer(byte[] var1) {
		this.array = var1; // L: 61
		this.offset = 0; // L: 62
	} // L: 63

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1764416929"
	)
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) { // L: 66
			WorldMapData_1.ByteArrayPool_release(this.array);
		}

		this.array = null; // L: 67
	} // L: 68

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1915818947"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 71
	} // L: 72

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "119"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 75
		this.array[++this.offset - 1] = (byte)var1; // L: 76
	} // L: 77

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "74"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 80
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 81
		this.array[++this.offset - 1] = (byte)var1; // L: 82
	} // L: 83

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-72"
	)
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 86
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 87
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 88
		this.array[++this.offset - 1] = (byte)var1; // L: 89
	} // L: 90

	@ObfuscatedName("at")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 93
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 94
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 95
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 96
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 97
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 98
	} // L: 99

	@ObfuscatedName("bq")
	@Export("writeLong")
	public void writeLong(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 56)); // L: 102
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 48)); // L: 103
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 104
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 105
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 106
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 107
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 108
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 109
	} // L: 110

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-36"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0); // L: 113
	} // L: 114

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1003366182"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0); // L: 121
		if (var2 >= 0) { // L: 122
			throw new IllegalArgumentException("");
		} else {
			this.offset += MenuAction.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 123
			this.array[++this.offset - 1] = 0; // L: 124
		}
	} // L: 125

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-721485512"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0); // L: 132
		if (var2 >= 0) { // L: 133
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0; // L: 134
			this.offset += MenuAction.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 135
			this.array[++this.offset - 1] = 0; // L: 136
		}
	} // L: 137

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)V",
		garbageValue = "-1379588442"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var2 = DefaultsGroup.method6839(var1); // L: 140
		this.array[++this.offset - 1] = 0; // L: 141
		this.writeVarInt(var2); // L: 142
		int var3 = this.offset; // L: 143
		byte[] var5 = this.array; // L: 145
		int var6 = this.offset; // L: 146
		int var7 = var1.length(); // L: 148
		int var8 = var6; // L: 149

		for (int var9 = 0; var9 < var7; ++var9) { // L: 150
			char var10 = var1.charAt(var9); // L: 151
			if (var10 <= 127) { // L: 152
				var5[var8++] = (byte)var10; // L: 153
			} else if (var10 <= 2047) { // L: 155
				var5[var8++] = (byte)(192 | var10 >> 6); // L: 156
				var5[var8++] = (byte)(128 | var10 & '?'); // L: 157
			} else {
				var5[var8++] = (byte)(224 | var10 >> '\f'); // L: 160
				var5[var8++] = (byte)(128 | var10 >> 6 & 63); // L: 161
				var5[var8++] = (byte)(128 | var10 & '?'); // L: 162
			}
		}

		int var4 = var8 - var6; // L: 165
		this.offset = var4 + var3; // L: 167
	} // L: 168

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-416671839"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) { // L: 171
			this.array[++this.offset - 1] = var1[var4];
		}

	} // L: 172

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "973037689"
	)
	public void method7631(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset); // L: 175
	} // L: 176

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "86"
	)
	@Export("writeLengthInt")
	public void writeLengthInt(int var1) {
		if (var1 < 0) { // L: 179
			throw new IllegalArgumentException(); // L: 180
		} else {
			this.array[this.offset - var1 - 4] = (byte)(var1 >> 24); // L: 182
			this.array[this.offset - var1 - 3] = (byte)(var1 >> 16); // L: 183
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 184
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 185
		}
	} // L: 186

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "12"
	)
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) { // L: 189
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 192
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 193
		} else {
			throw new IllegalArgumentException(); // L: 190
		}
	} // L: 194

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1055230457"
	)
	public void method7761(int var1) {
		if (var1 >= 0 && var1 <= 255) { // L: 197
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 200
		} else {
			throw new IllegalArgumentException(); // L: 198
		}
	} // L: 201

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("writeSmartByteShort")
	public void writeSmartByteShort(int var1) {
		if (var1 >= 0 && var1 < 128) { // L: 204
			this.writeByte(var1); // L: 205
		} else if (var1 >= 0 && var1 < 32768) { // L: 208
			this.writeShort(var1 + 32768); // L: 209
		} else {
			throw new IllegalArgumentException(); // L: 212
		}
	} // L: 206 210

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1788689105"
	)
	@Export("writeVarInt")
	public void writeVarInt(int var1) {
		if ((var1 & -128) != 0) { // L: 216
			if ((var1 & -16384) != 0) { // L: 217
				if ((var1 & -2097152) != 0) { // L: 218
					if ((var1 & -268435456) != 0) { // L: 219
						this.writeByte(var1 >>> 28 | 128);
					}

					this.writeByte(var1 >>> 21 | 128); // L: 220
				}

				this.writeByte(var1 >>> 14 | 128); // L: 222
			}

			this.writeByte(var1 >>> 7 | 128); // L: 224
		}

		this.writeByte(var1 & 127); // L: 226
	} // L: 227

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1009141318"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255; // L: 230
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "1900344023"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1]; // L: 234
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2109416823"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2; // L: 238
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 239
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "76"
	)
	@Export("readShort")
	public int readShort() {
		this.offset += 2; // L: 243
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 244
		if (var1 > 32767) { // L: 245
			var1 -= 65536;
		}

		return var1; // L: 246
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3; // L: 250
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 251
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2131643014"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 4; // L: 255
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24); // L: 256
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "2087656534"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L; // L: 260
		long var3 = (long)this.readInt() & 4294967295L; // L: 261
		return var3 + (var1 << 32); // L: 262
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "-1947413679"
	)
	public float method7824() {
		return Float.intBitsToFloat(this.readInt()); // L: 266
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2140414999"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1; // L: 270
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "1"
	)
	@Export("readStringCp1252NullTerminatedOrNull")
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset] == 0) { // L: 274
			++this.offset; // L: 275
			return null; // L: 276
		} else {
			return this.readStringCp1252NullTerminated(); // L: 278
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1593523976"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset; // L: 282

		while (this.array[++this.offset - 1] != 0) { // L: 283
		}

		int var2 = this.offset - var1 - 1; // L: 284
		return var2 == 0 ? "" : PlatformInfo.decodeStringCp1252(this.array, var1, var2); // L: 285 286
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "0"
	)
	@Export("readStringCp1252NullCircumfixed")
	public String readStringCp1252NullCircumfixed() {
		byte var1 = this.array[++this.offset - 1]; // L: 290
		if (var1 != 0) { // L: 291
			throw new IllegalStateException("");
		} else {
			int var2 = this.offset; // L: 292

			while (this.array[++this.offset - 1] != 0) { // L: 293
			}

			int var3 = this.offset - var2 - 1; // L: 294
			return var3 == 0 ? "" : PlatformInfo.decodeStringCp1252(this.array, var2, var3); // L: 295 296
		}
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1176842476"
	)
	@Export("readCESU8")
	public String readCESU8() {
		byte var1 = this.array[++this.offset - 1]; // L: 300
		if (var1 != 0) { // L: 301
			throw new IllegalStateException("");
		} else {
			int var2 = this.readVarInt(); // L: 302
			if (var2 + this.offset > this.array.length) {
				throw new IllegalStateException(""); // L: 303
			} else {
				String var3 = class155.method3173(this.array, this.offset, var2); // L: 304
				this.offset += var2; // L: 305
				return var3; // L: 306
			}
		}
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-1347382902"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1]; // L: 310
		}

	} // L: 311

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1791266795"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 314
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152; // L: 315 316
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "56437292"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 320
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768; // L: 321 322
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "764188397"
	)
	public int method7706() {
		int var1 = this.array[this.offset] & 255; // L: 326
		return var1 < 128 ? this.readUnsignedByte() - 1 : this.readUnsignedShort() - 32769; // L: 327 328
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	public int method7881() {
		int var1 = 0; // L: 332

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) { // L: 333 334 336
			var1 += 32767; // L: 335
		}

		var1 += var2; // L: 338
		return var1; // L: 339
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-146391413"
	)
	public int method7773() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort(); // L: 343 344
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "650858821"
	)
	public int method7652() {
		if (this.array[this.offset] < 0) { // L: 348
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort(); // L: 349
			return var1 == 32767 ? -1 : var1; // L: 350
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2038161509"
	)
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[++this.offset - 1]; // L: 355

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) { // L: 356 357 359
			var2 = (var2 | var1 & 127) << 7; // L: 358
		}

		return var2 | var1; // L: 361
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1636623700"
	)
	public int method7678() {
		int var2 = 0; // L: 366
		int var3 = 0; // L: 367

		int var1;
		do {
			var1 = this.readUnsignedByte(); // L: 369
			var2 |= (var1 & 127) << var3; // L: 370
			var3 += 7; // L: 371
		} while(var1 > 127); // L: 372

		return var2; // L: 373
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "([IB)V",
		garbageValue = "-50"
	)
	@Export("xteaEncryptAll")
	public void xteaEncryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 377
		this.offset = 0; // L: 378

		for (int var3 = 0; var3 < var2; ++var3) { // L: 379
			int var4 = this.readInt(); // L: 380
			int var5 = this.readInt(); // L: 381
			int var6 = 0; // L: 382
			int var7 = -1640531527; // L: 383

			for (int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) { // L: 384 385 388
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]; // L: 386
				var6 += var7; // L: 387
			}

			this.offset -= 8; // L: 390
			this.writeInt(var4); // L: 391
			this.writeInt(var5); // L: 392
		}

	} // L: 394

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "1441782561"
	)
	@Export("xteaDecryptAll")
	public void xteaDecryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 397
		this.offset = 0; // L: 398

		for (int var3 = 0; var3 < var2; ++var3) { // L: 399
			int var4 = this.readInt(); // L: 400
			int var5 = this.readInt(); // L: 401
			int var6 = -957401312; // L: 402
			int var7 = -1640531527; // L: 403

			for (int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) { // L: 404 405 408
				var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6; // L: 406
				var6 -= var7; // L: 407
			}

			this.offset -= 8; // L: 410
			this.writeInt(var4); // L: 411
			this.writeInt(var5); // L: 412
		}

	} // L: 414

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "1013272337"
	)
	@Export("xteaEncrypt")
	public void xteaEncrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 417
		this.offset = var2; // L: 418
		int var5 = (var3 - var2) / 8; // L: 419

		for (int var6 = 0; var6 < var5; ++var6) { // L: 420
			int var7 = this.readInt(); // L: 421
			int var8 = this.readInt(); // L: 422
			int var9 = 0; // L: 423
			int var10 = -1640531527; // L: 424

			for (int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) { // L: 425 426 429
				var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]; // L: 427
				var9 += var10; // L: 428
			}

			this.offset -= 8; // L: 431
			this.writeInt(var7); // L: 432
			this.writeInt(var8); // L: 433
		}

		this.offset = var4; // L: 435
	} // L: 436

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "([IIIB)V",
		garbageValue = "-24"
	)
	@Export("xteaDecrypt")
	public void xteaDecrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 439
		this.offset = var2; // L: 440
		int var5 = (var3 - var2) / 8; // L: 441

		for (int var6 = 0; var6 < var5; ++var6) { // L: 442
			int var7 = this.readInt(); // L: 443
			int var8 = this.readInt(); // L: 444
			int var9 = -957401312; // L: 445
			int var10 = -1640531527; // L: 446

			for (int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) { // L: 447 448 451
				var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9; // L: 449
				var9 -= var10; // L: 450
			}

			this.offset -= 8; // L: 453
			this.writeInt(var7); // L: 454
			this.writeInt(var8); // L: 455
		}

		this.offset = var4; // L: 457
	} // L: 458

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
		garbageValue = "-993415767"
	)
	@Export("encryptRsa")
	public void encryptRsa(BigInteger var1, BigInteger var2) {
		int var3 = this.offset; // L: 461
		this.offset = 0; // L: 462
		byte[] var4 = new byte[var3]; // L: 463
		this.readBytes(var4, 0, var3); // L: 464
		BigInteger var5 = new BigInteger(var4); // L: 465
		BigInteger var6 = var5.modPow(var1, var2); // L: 466
		byte[] var7 = var6.toByteArray(); // L: 467
		this.offset = 0; // L: 468
		this.writeShort(var7.length); // L: 469
		this.writeBytes(var7, 0, var7.length); // L: 470
	} // L: 471

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1068645456"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		int var2 = class282.method5435(this.array, var1, this.offset); // L: 474
		this.writeInt(var2); // L: 475
		return var2; // L: 476
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-853618098"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4; // L: 480
		int var1 = class282.method5435(this.array, 0, this.offset); // L: 481
		int var2 = this.readInt(); // L: 482
		return var1 == var2; // L: 483
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1596036812"
	)
	public void method7878(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 488
	} // L: 489

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	public void method7656(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1); // L: 492
	} // L: 493

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-30"
	)
	public void method7667(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1); // L: 496
	} // L: 497

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "8676"
	)
	public int method7786() {
		return this.array[++this.offset - 1] - 128 & 255; // L: 500
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int method7708() {
		return 0 - this.array[++this.offset - 1] & 255; // L: 504
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-395870938"
	)
	public int method7670() {
		return 128 - this.array[++this.offset - 1] & 255; // L: 508
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-26268727"
	)
	public byte method7671() {
		return (byte)(this.array[++this.offset - 1] - 128); // L: 512
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-1217115908"
	)
	public byte method7672() {
		return (byte)(0 - this.array[++this.offset - 1]); // L: 516
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "34153829"
	)
	public byte method7658() {
		return (byte)(128 - this.array[++this.offset - 1]); // L: 520
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1503573008"
	)
	public void method7675(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 524
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 525
	} // L: 526

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2089807290"
	)
	public void method7647(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 529
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 530
	} // L: 531

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1363453178"
	)
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 534
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 535
	} // L: 536

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-798319323"
	)
	public int method7677() {
		this.offset += 2; // L: 539
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 540
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1118370619"
	)
	public int method7640() {
		this.offset += 2; // L: 544
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 545
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "84"
	)
	public int method7654() {
		this.offset += 2; // L: 549
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 550
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1895545337"
	)
	public int method7711() {
		this.offset += 2; // L: 554
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 555
		if (var1 > 32767) { // L: 556
			var1 -= 65536;
		}

		return var1; // L: 557
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1928317338"
	)
	public int method7847() {
		this.offset += 2; // L: 561
		int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 562
		if (var1 > 32767) { // L: 563
			var1 -= 65536;
		}

		return var1; // L: 564
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "1109"
	)
	public int method7793() {
		this.offset += 2; // L: 568
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 569
		if (var1 > 32767) { // L: 570
			var1 -= 65536;
		}

		return var1; // L: 571
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-1032"
	)
	public void method7683(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 575
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 576
		this.array[++this.offset - 1] = (byte)var1; // L: 577
	} // L: 578

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-844786428"
	)
	public int method7684() {
		this.offset += 3; // L: 581
		return (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16); // L: 582
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1998969031"
	)
	public int method7685() {
		this.offset += 3; // L: 586
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 2] & 255); // L: 587
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "774127570"
	)
	public void method7686(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 591
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 592
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 593
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 594
	} // L: 595

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1875833485"
	)
	public void method7687(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 598
		this.array[++this.offset - 1] = (byte)var1; // L: 599
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 600
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 601
	} // L: 602

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1142876030"
	)
	public void method7673(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 605
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 606
		this.array[++this.offset - 1] = (byte)var1; // L: 607
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 608
	} // L: 609

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1018502212"
	)
	public int method7713() {
		this.offset += 4; // L: 612
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24); // L: 613
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int method7690() {
		this.offset += 4; // L: 617
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16); // L: 618
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-611411034"
	)
	public int method7691() {
		this.offset += 4; // L: 622
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24); // L: 623
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-202977831"
	)
	public void method7692(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) { // L: 627
			var1[var4] = this.array[++this.offset - 1];
		}

	} // L: 628
}
