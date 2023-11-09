import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tz")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("af")
	@Export("crc32Table")
	static int[] crc32Table;
	@ObfuscatedName("aa")
	@Export("crc64Table")
	static long[] crc64Table;
	@ObfuscatedName("ak")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1705195685
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
		this.array = ByteArrayPool.ByteArrayPool_getArrayBool(var1, var2);
	}

	public Buffer(int var1) {
		this.array = WorldMapSection1.ByteArrayPool_getArray(var1);
		this.offset = 0;
	}

	public Buffer(byte[] var1) {
		this.array = var1; // L: 69
		this.offset = 0; // L: 70
	} // L: 71

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1615836876"
	)
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) { // L: 74
			MusicPatchPcmStream.ByteArrayPool_release(this.array);
		}

		this.array = null; // L: 75
	} // L: 76

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-3"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 79
	} // L: 80

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "3408"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 83
		this.array[++this.offset - 1] = (byte)var1; // L: 84
	} // L: 85

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "763103406"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 88
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 89
		this.array[++this.offset - 1] = (byte)var1; // L: 90
	} // L: 91

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-88709237"
	)
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 94
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 95
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 96
		this.array[++this.offset - 1] = (byte)var1; // L: 97
	} // L: 98

	@ObfuscatedName("bi")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 101
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 102
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 103
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 104
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 105
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 106
	} // L: 107

	@ObfuscatedName("bk")
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

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "244232126"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0); // L: 121
	} // L: 122

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0); // L: 129
		if (var2 >= 0) { // L: 130
			throw new IllegalArgumentException("");
		} else {
			this.offset += UrlRequester.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 131
			this.array[++this.offset - 1] = 0; // L: 132
		}
	} // L: 133

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1859717548"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0); // L: 140
		if (var2 >= 0) { // L: 141
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0; // L: 142
			this.offset += UrlRequester.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 143
			this.array[++this.offset - 1] = 0; // L: 144
		}
	} // L: 145

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)V",
		garbageValue = "122"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var3 = var1.length(); // L: 150
		int var4 = 0; // L: 151

		for (int var5 = 0; var5 < var3; ++var5) { // L: 152
			char var6 = var1.charAt(var5); // L: 153
			if (var6 <= 127) { // L: 154
				++var4;
			} else if (var6 <= 2047) { // L: 155
				var4 += 2;
			} else {
				var4 += 3; // L: 156
			}
		}

		this.array[++this.offset - 1] = 0; // L: 161
		this.writeVarInt(var4); // L: 162
		this.offset += class85.method2241(this.array, this.offset, var1); // L: 163
	} // L: 164

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-1032630785"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) { // L: 167
			this.array[++this.offset - 1] = var1[var4];
		}

	} // L: 168

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)V",
		garbageValue = "1362476277"
	)
	public void method8903(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset); // L: 171
	} // L: 172

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "30492170"
	)
	@Export("writeLengthInt")
	public void writeLengthInt(int var1) {
		if (var1 < 0) { // L: 175
			throw new IllegalArgumentException(); // L: 176
		} else {
			this.array[this.offset - var1 - 4] = (byte)(var1 >> 24); // L: 178
			this.array[this.offset - var1 - 3] = (byte)(var1 >> 16); // L: 179
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 180
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 181
		}
	} // L: 182

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1245706053"
	)
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) { // L: 185
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 188
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 189
		} else {
			throw new IllegalArgumentException(); // L: 186
		}
	} // L: 190

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1397846024"
	)
	public void method9017(int var1) {
		if (var1 >= 0 && var1 <= 255) { // L: 193
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 196
		} else {
			throw new IllegalArgumentException(); // L: 194
		}
	} // L: 197

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-66"
	)
	@Export("writeSmartByteShort")
	public void writeSmartByteShort(int var1) {
		if (var1 >= 0 && var1 < 128) { // L: 200
			this.writeByte(var1); // L: 201
		} else if (var1 >= 0 && var1 < 32768) { // L: 204
			this.writeShort(var1 + 32768); // L: 205
		} else {
			throw new IllegalArgumentException(); // L: 208
		}
	} // L: 202 206

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1593395164"
	)
	@Export("writeVarInt")
	public void writeVarInt(int var1) {
		if ((var1 & -128) != 0) { // L: 212
			if ((var1 & -16384) != 0) { // L: 213
				if ((var1 & -2097152) != 0) { // L: 214
					if ((var1 & -268435456) != 0) { // L: 215
						this.writeByte(var1 >>> 28 | 128);
					}

					this.writeByte(var1 >>> 21 | 128); // L: 216
				}

				this.writeByte(var1 >>> 14 | 128); // L: 218
			}

			this.writeByte(var1 >>> 7 | 128); // L: 220
		}

		this.writeByte(var1 & 127); // L: 222
	} // L: 223

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-339823759"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255; // L: 226
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "78"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1]; // L: 230
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1837628027"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2; // L: 234
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 235
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1973288200"
	)
	@Export("readShort")
	public int readShort() {
		this.offset += 2; // L: 239
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 240
		if (var1 > 32767) { // L: 241
			var1 -= 65536;
		}

		return var1; // L: 242
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-540858369"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3; // L: 246
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 247
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1468578386"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 4; // L: 251
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24); // L: 252
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "2045646917"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L; // L: 256
		long var3 = (long)this.readInt() & 4294967295L; // L: 257
		return (var1 << 32) + var3; // L: 258
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "53"
	)
	public float method8916() {
		return Float.intBitsToFloat(this.readInt()); // L: 262
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1; // L: 266
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "0"
	)
	@Export("readStringCp1252NullTerminatedOrNull")
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset] == 0) { // L: 270
			++this.offset; // L: 271
			return null; // L: 272
		} else {
			return this.readStringCp1252NullTerminated(); // L: 274
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1224435060"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset; // L: 278

		while (this.array[++this.offset - 1] != 0) { // L: 279
		}

		int var2 = this.offset - var1 - 1; // L: 280
		return var2 == 0 ? "" : MusicPatchNode2.decodeStringCp1252(this.array, var1, var2); // L: 281 282
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1480638125"
	)
	@Export("readStringCp1252NullCircumfixed")
	public String readStringCp1252NullCircumfixed() {
		byte var1 = this.array[++this.offset - 1]; // L: 286
		int var2 = this.offset; // L: 288

		while (this.array[++this.offset - 1] != 0) { // L: 289
		}

		int var3 = this.offset - var2 - 1; // L: 290
		return var3 == 0 ? "" : MusicPatchNode2.decodeStringCp1252(this.array, var2, var3); // L: 291 292
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1705195685"
	)
	@Export("readCESU8")
	public String readCESU8() {
		byte var1 = this.array[++this.offset - 1]; // L: 296
		if (var1 != 0) { // L: 297
			throw new IllegalStateException("");
		} else {
			int var2 = this.readVarInt(); // L: 298
			if (var2 + this.offset > this.array.length) {
				throw new IllegalStateException(""); // L: 299
			} else {
				String var3 = Language.method6915(this.array, this.offset, var2); // L: 300
				this.offset += var2; // L: 301
				return var3; // L: 302
			}
		}
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1443960330"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1]; // L: 306
		}

	} // L: 307

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1361401562"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 310
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152; // L: 311 312
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-538902516"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 316
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768; // L: 317 318
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1328689110"
	)
	public int method8938() {
		int var1 = this.array[this.offset] & 255; // L: 322
		return var1 < 128 ? this.readUnsignedByte() - 1 : this.readUnsignedShort() - 32769; // L: 323 324
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-385969755"
	)
	public int method9023() {
		int var1 = 0; // L: 328

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) { // L: 329 330 332
			var1 += 32767; // L: 331
		}

		var1 += var2; // L: 334
		return var1; // L: 335
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "42559123"
	)
	public int method8927() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort(); // L: 339 340
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "29"
	)
	public int method8928() {
		if (this.array[this.offset] < 0) { // L: 344
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort(); // L: 345
			return var1 == 32767 ? -1 : var1; // L: 346
		}
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-59"
	)
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[++this.offset - 1]; // L: 351

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) { // L: 352 353 355
			var2 = (var2 | var1 & 127) << 7; // L: 354
		}

		return var2 | var1; // L: 357
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "474066363"
	)
	public int method8930() {
		int var2 = 0; // L: 362
		int var3 = 0; // L: 363

		int var1;
		do {
			var1 = this.readUnsignedByte(); // L: 365
			var2 |= (var1 & 127) << var3; // L: 366
			var3 += 7; // L: 367
		} while(var1 > 127); // L: 368

		return var2; // L: 369
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "-381988593"
	)
	@Export("xteaEncryptAll")
	public void xteaEncryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 373
		this.offset = 0; // L: 374

		for (int var3 = 0; var3 < var2; ++var3) { // L: 375
			int var4 = this.readInt(); // L: 376
			int var5 = this.readInt(); // L: 377
			int var6 = 0; // L: 378
			int var7 = -1640531527; // L: 379

			for (int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) { // L: 380 381 384
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]; // L: 382
				var6 += var7; // L: 383
			}

			this.offset -= 8; // L: 386
			this.writeInt(var4); // L: 387
			this.writeInt(var5); // L: 388
		}

	} // L: 390

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "-672432737"
	)
	@Export("xteaDecryptAll")
	public void xteaDecryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 393
		this.offset = 0; // L: 394

		for (int var3 = 0; var3 < var2; ++var3) { // L: 395
			int var4 = this.readInt(); // L: 396
			int var5 = this.readInt(); // L: 397
			int var6 = -957401312; // L: 398
			int var7 = -1640531527; // L: 399

			for (int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) { // L: 400 401 404
				var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6; // L: 402
				var6 -= var7; // L: 403
			}

			this.offset -= 8; // L: 406
			this.writeInt(var4); // L: 407
			this.writeInt(var5); // L: 408
		}

	} // L: 410

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "-1160250297"
	)
	@Export("xteaEncrypt")
	public void xteaEncrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 413
		this.offset = var2; // L: 414
		int var5 = (var3 - var2) / 8; // L: 415

		for (int var6 = 0; var6 < var5; ++var6) { // L: 416
			int var7 = this.readInt(); // L: 417
			int var8 = this.readInt(); // L: 418
			int var9 = 0; // L: 419
			int var10 = -1640531527; // L: 420

			for (int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) { // L: 421 422 425
				var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]; // L: 423
				var9 += var10; // L: 424
			}

			this.offset -= 8; // L: 427
			this.writeInt(var7); // L: 428
			this.writeInt(var8); // L: 429
		}

		this.offset = var4; // L: 431
	} // L: 432

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "-1566135984"
	)
	@Export("xteaDecrypt")
	public void xteaDecrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 435
		this.offset = var2; // L: 436
		int var5 = (var3 - var2) / 8; // L: 437

		for (int var6 = 0; var6 < var5; ++var6) { // L: 438
			int var7 = this.readInt(); // L: 439
			int var8 = this.readInt(); // L: 440
			int var9 = -957401312; // L: 441
			int var10 = -1640531527; // L: 442

			for (int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) { // L: 443 444 447
				var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9; // L: 445
				var9 -= var10; // L: 446
			}

			this.offset -= 8; // L: 449
			this.writeInt(var7); // L: 450
			this.writeInt(var8); // L: 451
		}

		this.offset = var4; // L: 453
	} // L: 454

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
		garbageValue = "790929313"
	)
	@Export("encryptRsa")
	public void encryptRsa(BigInteger var1, BigInteger var2) {
		int var3 = this.offset; // L: 457
		this.offset = 0; // L: 458
		byte[] var4 = new byte[var3]; // L: 459
		this.readBytes(var4, 0, var3); // L: 460
		BigInteger var5 = new BigInteger(var4); // L: 461
		BigInteger var6 = var5.modPow(var1, var2); // L: 462
		byte[] var7 = var6.toByteArray(); // L: 463
		this.offset = 0; // L: 464
		this.writeShort(var7.length); // L: 465
		this.writeBytes(var7, 0, var7.length); // L: 466
	} // L: 467

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1215448455"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		byte[] var3 = this.array; // L: 471
		int var4 = this.offset; // L: 472
		int var5 = -1; // L: 474

		for (int var6 = var1; var6 < var4; ++var6) { // L: 475
			var5 = var5 >>> 8 ^ crc32Table[(var5 ^ var3[var6]) & 255]; // L: 476
		}

		var5 = ~var5; // L: 478
		this.writeInt(var5); // L: 482
		return var5; // L: 483
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-96"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4; // L: 487
		byte[] var2 = this.array; // L: 489
		int var3 = this.offset; // L: 490
		int var4 = -1; // L: 492

		int var5;
		for (var5 = 0; var5 < var3; ++var5) { // L: 493
			var4 = var4 >>> 8 ^ crc32Table[(var4 ^ var2[var5]) & 255]; // L: 494
		}

		var4 = ~var4; // L: 496
		var5 = this.readInt(); // L: 500
		return var5 == var4; // L: 501
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1334856703"
	)
	public void method8939(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 506
	} // L: 507

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2062130313"
	)
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1); // L: 510
	} // L: 511

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "7"
	)
	public void method8940(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1); // L: 514
	} // L: 515

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-24"
	)
	public int method8941() {
		return this.array[++this.offset - 1] - 128 & 255; // L: 518
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "101"
	)
	public int method8942() {
		return 0 - this.array[++this.offset - 1] & 255; // L: 522
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-516850775"
	)
	public int method8943() {
		return 128 - this.array[++this.offset - 1] & 255; // L: 526
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-1344595480"
	)
	public byte method8971() {
		return (byte)(this.array[++this.offset - 1] - 128); // L: 530
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "6"
	)
	public byte method9022() {
		return (byte)(0 - this.array[++this.offset - 1]); // L: 534
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "823714739"
	)
	public byte method8979() {
		return (byte)(128 - this.array[++this.offset - 1]); // L: 538
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1752473602"
	)
	public void method9000(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 542
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 543
	} // L: 544

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2027016403"
	)
	public void method8948(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 547
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 548
	} // L: 549

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-5"
	)
	public void method8949(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 552
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 553
	} // L: 554

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-558290666"
	)
	public int method8950() {
		this.offset += 2; // L: 557
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 558
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "266433617"
	)
	public int method9030() {
		this.offset += 2; // L: 562
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 563
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1118234371"
	)
	public int method8952() {
		this.offset += 2; // L: 567
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 568
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "675350847"
	)
	public int method8953() {
		this.offset += 2; // L: 572
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 573
		if (var1 > 32767) { // L: 574
			var1 -= 65536;
		}

		return var1; // L: 575
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1438443675"
	)
	public int method8954() {
		this.offset += 2; // L: 579
		int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 580
		if (var1 > 32767) { // L: 581
			var1 -= 65536;
		}

		return var1; // L: 582
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-143730578"
	)
	public void method9065(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 586
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 587
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 588
	} // L: 589

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	public int method9106() {
		this.offset += 3; // L: 592
		return (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16); // L: 593
	}

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1861144152"
	)
	public int method8957() {
		this.offset += 3; // L: 597
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 2] & 255); // L: 598
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1573106788"
	)
	public int method9027() {
		this.offset += 3; // L: 602
		int var1 = (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16); // L: 603
		if (var1 > 8388607) { // L: 604
			var1 -= 16777216;
		}

		return var1; // L: 605
	}

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1443422912"
	)
	public int method8959() {
		this.offset += 3; // L: 609
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16); // L: 610
		if (var1 > 8388607) { // L: 611
			var1 -= 16777216;
		}

		return var1; // L: 612
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1426704705"
	)
	public void method8919(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 616
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 617
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 618
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 619
	} // L: 620

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-35"
	)
	public void method8961(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 623
		this.array[++this.offset - 1] = (byte)var1; // L: 624
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 625
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 626
	} // L: 627

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2095385223"
	)
	public void method8962(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 630
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 631
		this.array[++this.offset - 1] = (byte)var1; // L: 632
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 633
	} // L: 634

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-101"
	)
	public int method8963() {
		this.offset += 4; // L: 637
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24); // L: 638
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1257210540"
	)
	public int method8964() {
		this.offset += 4; // L: 642
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16); // L: 643
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1881127123"
	)
	public int method8918() {
		this.offset += 4; // L: 647
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24); // L: 648
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-35733991"
	)
	public void method9041(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) { // L: 652
			var1[var4] = this.array[++this.offset - 1];
		}

	} // L: 653

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "48"
	)
	public void method9155(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = (byte)(this.array[++this.offset - 1] - 128); // L: 656
		}

	} // L: 657

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1824124703"
	)
	public static void method9158(int var0, int var1) {
		VarbitComposition var3 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0); // L: 48
		VarbitComposition var2;
		if (var3 != null) { // L: 49
			var2 = var3; // L: 50
		} else {
			byte[] var4 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0); // L: 53
			var3 = new VarbitComposition(); // L: 54
			if (var4 != null) { // L: 55
				var3.decode(new Buffer(var4));
			}

			VarbitComposition.VarbitDefinition_cached.put(var3, (long)var0); // L: 56
			var2 = var3; // L: 57
		}

		int var8 = var2.baseVar; // L: 60
		int var5 = var2.startBit; // L: 61
		int var6 = var2.endBit; // L: 62
		int var7 = Varps.Varps_masks[var6 - var5]; // L: 63
		if (var1 < 0 || var1 > var7) { // L: 64
			var1 = 0;
		}

		var7 <<= var5; // L: 65
		Varps.Varps_main[var8] = Varps.Varps_main[var8] & ~var7 | var1 << var5 & var7; // L: 66
	} // L: 67
}
