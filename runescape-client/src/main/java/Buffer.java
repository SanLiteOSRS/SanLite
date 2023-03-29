import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sy")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("ar")
	@Export("crc32Table")
	public static int[] crc32Table;
	@ObfuscatedName("ax")
	@Export("crc64Table")
	static long[] crc64Table;
	@ObfuscatedName("aq")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 146201023
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
		this.array = Decimator.ByteArrayPool_getArray(var1); // L: 47
		this.offset = 0; // L: 48
	} // L: 49

	public Buffer(byte[] var1) {
		this.array = var1; // L: 56
		this.offset = 0; // L: 57
	} // L: 58

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1721696084"
	)
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) { // L: 61
			class366.ByteArrayPool_release(this.array);
		}

		this.array = null; // L: 62
	} // L: 63

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-777398119"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 66
	} // L: 67

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "325704528"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 70
		this.array[++this.offset - 1] = (byte)var1; // L: 71
	} // L: 72

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2109256773"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 75
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 76
		this.array[++this.offset - 1] = (byte)var1; // L: 77
	} // L: 78

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1571071880"
	)
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 81
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 82
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 83
		this.array[++this.offset - 1] = (byte)var1; // L: 84
	} // L: 85

	@ObfuscatedName("by")
	public void method8606(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 88
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 89
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 90
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 91
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 92
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 93
	} // L: 94

	@ObfuscatedName("bp")
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

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1473167525"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0); // L: 108
	} // L: 109

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2135367400"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0); // L: 116
		if (var2 >= 0) { // L: 117
			throw new IllegalArgumentException("");
		} else {
			this.offset += class159.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 118
			this.array[++this.offset - 1] = 0; // L: 119
		}
	} // L: 120

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1643587758"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0); // L: 127
		if (var2 >= 0) { // L: 128
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0; // L: 129
			this.offset += class159.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 130
			this.array[++this.offset - 1] = 0; // L: 131
		}
	} // L: 132

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)V",
		garbageValue = "-1694484847"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var3 = var1.length(); // L: 137
		int var4 = 0; // L: 138

		for (int var5 = 0; var5 < var3; ++var5) { // L: 139
			char var6 = var1.charAt(var5); // L: 140
			if (var6 <= 127) { // L: 141
				++var4;
			} else if (var6 <= 2047) { // L: 142
				var4 += 2;
			} else {
				var4 += 3; // L: 143
			}
		}

		this.array[++this.offset - 1] = 0; // L: 148
		this.writeVarInt(var4); // L: 149
		this.offset += class461.method8419(this.array, this.offset, var1); // L: 150
	} // L: 151

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "108"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) { // L: 154
			this.array[++this.offset - 1] = var1[var4];
		}

	} // L: 155

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(Lsy;B)V",
		garbageValue = "92"
	)
	public void method8613(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset); // L: 158
	} // L: 159

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-7"
	)
	@Export("writeLengthInt")
	public void writeLengthInt(int var1) {
		if (var1 < 0) { // L: 162
			throw new IllegalArgumentException(); // L: 163
		} else {
			this.array[this.offset - var1 - 4] = (byte)(var1 >> 24); // L: 165
			this.array[this.offset - var1 - 3] = (byte)(var1 >> 16); // L: 166
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 167
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 168
		}
	} // L: 169

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2006948279"
	)
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) { // L: 172
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 175
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 176
		} else {
			throw new IllegalArgumentException(); // L: 173
		}
	} // L: 177

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-679716043"
	)
	public void method8642(int var1) {
		if (var1 >= 0 && var1 <= 255) { // L: 180
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 183
		} else {
			throw new IllegalArgumentException(); // L: 181
		}
	} // L: 184

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "313715633"
	)
	@Export("writeSmartByteShort")
	public void writeSmartByteShort(int var1) {
		if (var1 >= 0 && var1 < 128) { // L: 187
			this.writeByte(var1); // L: 188
		} else if (var1 >= 0 && var1 < 32768) { // L: 191
			this.writeShort(var1 + 32768); // L: 192
		} else {
			throw new IllegalArgumentException(); // L: 195
		}
	} // L: 189 193

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1275262397"
	)
	@Export("writeVarInt")
	public void writeVarInt(int var1) {
		if ((var1 & -128) != 0) { // L: 199
			if ((var1 & -16384) != 0) { // L: 200
				if ((var1 & -2097152) != 0) { // L: 201
					if ((var1 & -268435456) != 0) { // L: 202
						this.writeByte(var1 >>> 28 | 128);
					}

					this.writeByte(var1 >>> 21 | 128); // L: 203
				}

				this.writeByte(var1 >>> 14 | 128); // L: 205
			}

			this.writeByte(var1 >>> 7 | 128); // L: 207
		}

		this.writeByte(var1 & 127); // L: 209
	} // L: 210

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "1600"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255; // L: 213
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "492809326"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1]; // L: 217
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "869810996"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2; // L: 221
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 222
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("readShort")
	public int readShort() {
		this.offset += 2; // L: 226
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 227
		if (var1 > 32767) { // L: 228
			var1 -= 65536;
		}

		return var1; // L: 229
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1564505597"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3; // L: 233
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 234
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "776465859"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 4; // L: 238
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24); // L: 239
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-1670000360"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L; // L: 243
		long var3 = (long)this.readInt() & 4294967295L; // L: 244
		return var3 + (var1 << 32); // L: 245
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "-41"
	)
	public float method8626() {
		return Float.intBitsToFloat(this.readInt()); // L: 249
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "125"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1; // L: 253
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1351748880"
	)
	@Export("readStringCp1252NullTerminatedOrNull")
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset] == 0) { // L: 257
			++this.offset; // L: 258
			return null; // L: 259
		} else {
			return this.readStringCp1252NullTerminated(); // L: 261
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "3"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset; // L: 265

		while (this.array[++this.offset - 1] != 0) { // L: 266
		}

		int var2 = this.offset - var1 - 1; // L: 267
		return var2 == 0 ? "" : GrandExchangeOfferUnitPriceComparator.decodeStringCp1252(this.array, var1, var2); // L: 268 269
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "87069522"
	)
	@Export("readStringCp1252NullCircumfixed")
	public String readStringCp1252NullCircumfixed() {
		byte var1 = this.array[++this.offset - 1]; // L: 273
		if (var1 != 0) { // L: 274
			throw new IllegalStateException("");
		} else {
			int var2 = this.offset; // L: 275

			while (this.array[++this.offset - 1] != 0) { // L: 276
			}

			int var3 = this.offset - var2 - 1; // L: 277
			return var3 == 0 ? "" : GrandExchangeOfferUnitPriceComparator.decodeStringCp1252(this.array, var2, var3); // L: 278 279
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-96"
	)
	@Export("readCESU8")
	public String readCESU8() {
		byte var1 = this.array[++this.offset - 1]; // L: 283
		if (var1 != 0) { // L: 284
			throw new IllegalStateException("");
		} else {
			int var2 = this.readVarInt(); // L: 285
			if (var2 + this.offset > this.array.length) {
				throw new IllegalStateException(""); // L: 286
			} else {
				String var3 = class131.method3032(this.array, this.offset, var2); // L: 287
				this.offset += var2; // L: 288
				return var3; // L: 289
			}
		}
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "968722699"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1]; // L: 293
		}

	} // L: 294

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1864496481"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 297
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152; // L: 298 299
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-83"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 303
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768; // L: 304 305
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1556847048"
	)
	public int method8628() {
		int var1 = this.array[this.offset] & 255; // L: 309
		return var1 < 128 ? this.readUnsignedByte() - 1 : this.readUnsignedShort() - 32769; // L: 310 311
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "851893541"
	)
	public int method8696() {
		int var1 = 0; // L: 315

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) { // L: 316 317 319
			var1 += 32767; // L: 318
		}

		var1 += var2; // L: 321
		return var1; // L: 322
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1180291958"
	)
	public int method8637() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort(); // L: 326 327
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "456296356"
	)
	public int method8638() {
		if (this.array[this.offset] < 0) { // L: 331
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort(); // L: 332
			return var1 == 32767 ? -1 : var1; // L: 333
		}
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1787990855"
	)
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[++this.offset - 1]; // L: 338

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) { // L: 339 340 342
			var2 = (var2 | var1 & 127) << 7; // L: 341
		}

		return var2 | var1; // L: 344
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1924301166"
	)
	public int method8798() {
		int var2 = 0; // L: 349
		int var3 = 0; // L: 350

		int var1;
		do {
			var1 = this.readUnsignedByte(); // L: 352
			var2 |= (var1 & 127) << var3; // L: 353
			var3 += 7; // L: 354
		} while(var1 > 127); // L: 355

		return var2; // L: 356
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "334061893"
	)
	@Export("xteaEncryptAll")
	public void xteaEncryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 360
		this.offset = 0; // L: 361

		for (int var3 = 0; var3 < var2; ++var3) { // L: 362
			int var4 = this.readInt(); // L: 363
			int var5 = this.readInt(); // L: 364
			int var6 = 0; // L: 365
			int var7 = -1640531527; // L: 366

			for (int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) { // L: 367 368 371
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]; // L: 369
				var6 += var7; // L: 370
			}

			this.offset -= 8; // L: 373
			this.writeInt(var4); // L: 374
			this.writeInt(var5); // L: 375
		}

	} // L: 377

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "([IB)V",
		garbageValue = "58"
	)
	@Export("xteaDecryptAll")
	public void xteaDecryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 380
		this.offset = 0; // L: 381

		for (int var3 = 0; var3 < var2; ++var3) { // L: 382
			int var4 = this.readInt(); // L: 383
			int var5 = this.readInt(); // L: 384
			int var6 = -957401312; // L: 385
			int var7 = -1640531527; // L: 386

			for (int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) { // L: 387 388 391
				var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6; // L: 389
				var6 -= var7; // L: 390
			}

			this.offset -= 8; // L: 393
			this.writeInt(var4); // L: 394
			this.writeInt(var5); // L: 395
		}

	} // L: 397

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "([IIIB)V",
		garbageValue = "74"
	)
	@Export("xteaEncrypt")
	public void xteaEncrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 400
		this.offset = var2; // L: 401
		int var5 = (var3 - var2) / 8; // L: 402

		for (int var6 = 0; var6 < var5; ++var6) { // L: 403
			int var7 = this.readInt(); // L: 404
			int var8 = this.readInt(); // L: 405
			int var9 = 0; // L: 406
			int var10 = -1640531527; // L: 407

			for (int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) { // L: 408 409 412
				var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]; // L: 410
				var9 += var10; // L: 411
			}

			this.offset -= 8; // L: 414
			this.writeInt(var7); // L: 415
			this.writeInt(var8); // L: 416
		}

		this.offset = var4; // L: 418
	} // L: 419

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "([IIIB)V",
		garbageValue = "-6"
	)
	@Export("xteaDecrypt")
	public void xteaDecrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 422
		this.offset = var2; // L: 423
		int var5 = (var3 - var2) / 8; // L: 424

		for (int var6 = 0; var6 < var5; ++var6) { // L: 425
			int var7 = this.readInt(); // L: 426
			int var8 = this.readInt(); // L: 427
			int var9 = -957401312; // L: 428
			int var10 = -1640531527; // L: 429

			for (int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) { // L: 430 431 434
				var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9; // L: 432
				var9 -= var10; // L: 433
			}

			this.offset -= 8; // L: 436
			this.writeInt(var7); // L: 437
			this.writeInt(var8); // L: 438
		}

		this.offset = var4; // L: 440
	} // L: 441

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
		garbageValue = "1974536127"
	)
	@Export("encryptRsa")
	public void encryptRsa(BigInteger var1, BigInteger var2) {
		int var3 = this.offset; // L: 444
		this.offset = 0; // L: 445
		byte[] var4 = new byte[var3]; // L: 446
		this.readBytes(var4, 0, var3); // L: 447
		BigInteger var5 = new BigInteger(var4); // L: 448
		BigInteger var6 = var5.modPow(var1, var2); // L: 449
		byte[] var7 = var6.toByteArray(); // L: 450
		this.offset = 0; // L: 451
		this.writeShort(var7.length); // L: 452
		this.writeBytes(var7, 0, var7.length); // L: 453
	} // L: 454

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-20"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		byte[] var3 = this.array; // L: 458
		int var4 = this.offset; // L: 459
		int var5 = -1; // L: 461

		for (int var6 = var1; var6 < var4; ++var6) { // L: 462
			var5 = var5 >>> 8 ^ crc32Table[(var5 ^ var3[var6]) & 255]; // L: 463
		}

		var5 = ~var5; // L: 465
		this.writeInt(var5); // L: 469
		return var5; // L: 470
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "90"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4; // L: 474
		byte[] var2 = this.array; // L: 476
		int var3 = this.offset; // L: 477
		int var4 = -1; // L: 479

		int var5;
		for (var5 = 0; var5 < var3; ++var5) { // L: 480
			var4 = var4 >>> 8 ^ crc32Table[(var4 ^ var2[var5]) & 255]; // L: 481
		}

		var4 = ~var4; // L: 483
		var5 = this.readInt(); // L: 487
		return var4 == var5; // L: 488
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "59"
	)
	public void method8873(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 493
	} // L: 494

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1490727731"
	)
	public void method8620(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1); // L: 497
	} // L: 498

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1672277445"
	)
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1); // L: 501
	} // L: 502

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int method8651() {
		return this.array[++this.offset - 1] - 128 & 255; // L: 505
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2061320116"
	)
	public int method8650() {
		return 0 - this.array[++this.offset - 1] & 255; // L: 509
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "621032025"
	)
	public int method8614() {
		return 128 - this.array[++this.offset - 1] & 255; // L: 513
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "880952253"
	)
	public byte method8654() {
		return (byte)(this.array[++this.offset - 1] - 128); // L: 517
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-1850088884"
	)
	public byte method8604() {
		return (byte)(0 - this.array[++this.offset - 1]); // L: 521
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "1179146087"
	)
	public byte method8656() {
		return (byte)(128 - this.array[++this.offset - 1]); // L: 525
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-4"
	)
	public void method8657(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 529
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 530
	} // L: 531

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "69"
	)
	public void method8658(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 534
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 535
	} // L: 536

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "28"
	)
	public void method8659(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 539
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 540
	} // L: 541

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-198662608"
	)
	public int method8660() {
		this.offset += 2; // L: 544
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 545
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1348515939"
	)
	public int method8831() {
		this.offset += 2; // L: 549
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 550
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1429501231"
	)
	public int method8662() {
		this.offset += 2; // L: 554
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 555
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int method8676() {
		this.offset += 2; // L: 559
		int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 560
		if (var1 > 32767) { // L: 561
			var1 -= 65536;
		}

		return var1; // L: 562
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1865601805"
	)
	public int method8664() {
		this.offset += 2; // L: 566
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 567
		if (var1 > 32767) { // L: 568
			var1 -= 65536;
		}

		return var1; // L: 569
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "891317600"
	)
	public void method8801(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 573
		this.array[++this.offset - 1] = (byte)var1; // L: 574
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 575
	} // L: 576

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "2853"
	)
	public int method8629() {
		this.offset += 3; // L: 579
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16); // L: 580
	}

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "872602777"
	)
	public int method8678() {
		this.offset += 3; // L: 584
		int var1 = (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16); // L: 585
		if (var1 > 8388607) { // L: 586
			var1 -= 16777216;
		}

		return var1; // L: 587
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "960929614"
	)
	public int method8668() {
		this.offset += 3; // L: 591
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16); // L: 592
		if (var1 > 8388607) { // L: 593
			var1 -= 16777216;
		}

		return var1; // L: 594
	}

	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2033419243"
	)
	public void method8719(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 598
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 599
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 600
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 601
	} // L: 602

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1632604314"
	)
	public void method8670(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 605
		this.array[++this.offset - 1] = (byte)var1; // L: 606
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 607
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 608
	} // L: 609

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "666893750"
	)
	public void method8671(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 612
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 613
		this.array[++this.offset - 1] = (byte)var1; // L: 614
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 615
	} // L: 616

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-917619037"
	)
	public int method8724() {
		this.offset += 4; // L: 619
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24); // L: 620
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-100346804"
	)
	public int method8616() {
		this.offset += 4; // L: 624
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16); // L: 625
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1717847263"
	)
	public int method8674() {
		this.offset += 4; // L: 629
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24); // L: 630
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1265227585"
	)
	public void method8608(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = (byte)(this.array[++this.offset - 1] - 128); // L: 634
		}

	} // L: 635

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "63911841"
	)
	public void method8675(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) { // L: 638
			var1[var4] = (byte)(this.array[++this.offset - 1] - 128);
		}

	} // L: 639
}
