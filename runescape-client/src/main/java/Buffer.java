import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ty")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("ap")
	@Export("crc32Table")
	static int[] crc32Table;
	@ObfuscatedName("at")
	@Export("crc64Table")
	static long[] crc64Table;
	@ObfuscatedName("az")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -164706283
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
		this.array = ByteArrayPool.ByteArrayPool_getArrayBool(var1, var2); // L: 65
	} // L: 66

	public Buffer(int var1) {
		this.array = SpriteMask.ByteArrayPool_getArray(var1); // L: 60
		this.offset = 0; // L: 61
	} // L: 62

	public Buffer(byte[] var1) {
		this.array = var1; // L: 69
		this.offset = 0; // L: 70
	} // L: 71

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1223847751"
	)
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) { // L: 74
			GrandExchangeOfferUnitPriceComparator.ByteArrayPool_release(this.array);
		}

		this.array = null; // L: 75
	} // L: 76

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2096591074"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 79
	} // L: 80

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1565420110"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 83
		this.array[++this.offset - 1] = (byte)var1; // L: 84
	} // L: 85

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1259049822"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 88
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 89
		this.array[++this.offset - 1] = (byte)var1; // L: 90
	} // L: 91

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 94
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 95
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 96
		this.array[++this.offset - 1] = (byte)var1; // L: 97
	} // L: 98

	@ObfuscatedName("bh")
	public void method9073(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 101
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 102
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 103
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 104
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 105
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 106
	} // L: 107

	@ObfuscatedName("bm")
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
		garbageValue = "507731046"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0); // L: 121
	} // L: 122

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2011320913"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0); // L: 129
		if (var2 >= 0) { // L: 130
			throw new IllegalArgumentException("");
		} else {
			this.offset += class143.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 131
			this.array[++this.offset - 1] = 0; // L: 132
		}
	} // L: 133

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "1000"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0); // L: 140
		if (var2 >= 0) { // L: 141
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0; // L: 142
			this.offset += class143.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 143
			this.array[++this.offset - 1] = 0; // L: 144
		}
	} // L: 145

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)V",
		garbageValue = "-591645790"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var3 = var1.length(); // L: 150
		int var4 = 0; // L: 151

		int var5;
		for (var5 = 0; var5 < var3; ++var5) { // L: 152
			char var12 = var1.charAt(var5); // L: 153
			if (var12 <= 127) { // L: 154
				++var4;
			} else if (var12 <= 2047) { // L: 155
				var4 += 2;
			} else {
				var4 += 3; // L: 156
			}
		}

		this.array[++this.offset - 1] = 0; // L: 161
		this.writeVarInt(var4); // L: 162
		var4 = this.offset; // L: 163
		byte[] var6 = this.array; // L: 165
		int var7 = this.offset; // L: 166
		int var8 = var1.length(); // L: 168
		int var9 = var7; // L: 169

		for (int var10 = 0; var10 < var8; ++var10) { // L: 170
			char var11 = var1.charAt(var10); // L: 171
			if (var11 <= 127) { // L: 172
				var6[var9++] = (byte)var11; // L: 173
			} else if (var11 <= 2047) { // L: 175
				var6[var9++] = (byte)(192 | var11 >> 6); // L: 176
				var6[var9++] = (byte)(128 | var11 & '?'); // L: 177
			} else {
				var6[var9++] = (byte)(224 | var11 >> '\f'); // L: 180
				var6[var9++] = (byte)(128 | var11 >> 6 & 63); // L: 181
				var6[var9++] = (byte)(128 | var11 & '?'); // L: 182
			}
		}

		var5 = var9 - var7; // L: 185
		this.offset = var4 + var5; // L: 187
	} // L: 188

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "8"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) { // L: 191
			this.array[++this.offset - 1] = var1[var4];
		}

	} // L: 192

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "250123763"
	)
	public void method9080(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset); // L: 195
	} // L: 196

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "12"
	)
	@Export("writeLengthInt")
	public void writeLengthInt(int var1) {
		if (var1 < 0) { // L: 199
			throw new IllegalArgumentException(); // L: 200
		} else {
			this.array[this.offset - var1 - 4] = (byte)(var1 >> 24); // L: 202
			this.array[this.offset - var1 - 3] = (byte)(var1 >> 16); // L: 203
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 204
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 205
		}
	} // L: 206

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "739157690"
	)
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) { // L: 209
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 212
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 213
		} else {
			throw new IllegalArgumentException(); // L: 210
		}
	} // L: 214

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "475928363"
	)
	public void method9083(int var1) {
		if (var1 >= 0 && var1 <= 255) { // L: 217
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 220
		} else {
			throw new IllegalArgumentException(); // L: 218
		}
	} // L: 221

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-3"
	)
	@Export("writeSmartByteShort")
	public void writeSmartByteShort(int var1) {
		if (var1 >= 0 && var1 < 128) { // L: 224
			this.writeByte(var1); // L: 225
		} else if (var1 >= 0 && var1 < 32768) { // L: 228
			this.writeShort(var1 + 32768); // L: 229
		} else {
			throw new IllegalArgumentException(); // L: 232
		}
	} // L: 226 230

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1639112231"
	)
	@Export("writeVarInt")
	public void writeVarInt(int var1) {
		if ((var1 & -128) != 0) { // L: 236
			if ((var1 & -16384) != 0) { // L: 237
				if ((var1 & -2097152) != 0) { // L: 238
					if ((var1 & -268435456) != 0) { // L: 239
						this.writeByte(var1 >>> 28 | 128);
					}

					this.writeByte(var1 >>> 21 | 128); // L: 240
				}

				this.writeByte(var1 >>> 14 | 128); // L: 242
			}

			this.writeByte(var1 >>> 7 | 128); // L: 244
		}

		this.writeByte(var1 & 127); // L: 246
	} // L: 247

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-541617533"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255; // L: 250
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "59"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1]; // L: 254
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "326"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2; // L: 258
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 259
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("readShort")
	public int readShort() {
		this.offset += 2; // L: 263
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 264
		if (var1 > 32767) { // L: 265
			var1 -= 65536;
		}

		return var1; // L: 266
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1853077439"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3; // L: 270
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 271
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-515940811"
	)
	public int method9170() {
		this.offset += 3; // L: 275
		int var1 = ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 276
		if (var1 > 8388607) { // L: 277
			var1 -= 16777216;
		}

		return var1; // L: 278
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1745928681"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 4; // L: 282
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24); // L: 283
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-1163035721"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L; // L: 287
		long var3 = (long)this.readInt() & 4294967295L; // L: 288
		return (var1 << 32) + var3; // L: 289
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "-141150710"
	)
	public float method9094() {
		return Float.intBitsToFloat(this.readInt()); // L: 293
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-769755356"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1; // L: 297
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1454341581"
	)
	@Export("readStringCp1252NullTerminatedOrNull")
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset] == 0) { // L: 301
			++this.offset; // L: 302
			return null; // L: 303
		} else {
			return this.readStringCp1252NullTerminated(); // L: 305
		}
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "2"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset; // L: 309

		while (this.array[++this.offset - 1] != 0) { // L: 310
		}

		int var2 = this.offset - var1 - 1; // L: 311
		return var2 == 0 ? "" : LoginType.decodeStringCp1252(this.array, var1, var2); // L: 312 313
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-706510313"
	)
	@Export("readStringCp1252NullCircumfixed")
	public String readStringCp1252NullCircumfixed() {
		byte var1 = this.array[++this.offset - 1]; // L: 317
		if (var1 != 0) { // L: 318
			throw new IllegalStateException("");
		} else {
			int var2 = this.offset; // L: 319

			while (this.array[++this.offset - 1] != 0) { // L: 320
			}

			int var3 = this.offset - var2 - 1; // L: 321
			return var3 == 0 ? "" : LoginType.decodeStringCp1252(this.array, var2, var3); // L: 322 323
		}
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "381399450"
	)
	@Export("readCESU8")
	public String readCESU8() {
		byte var1 = this.array[++this.offset - 1]; // L: 327
		if (var1 != 0) { // L: 328
			throw new IllegalStateException("");
		} else {
			int var2 = this.readVarInt(); // L: 329
			if (var2 + this.offset > this.array.length) {
				throw new IllegalStateException(""); // L: 330
			} else {
				String var3 = class403.method7628(this.array, this.offset, var2); // L: 331
				this.offset += var2; // L: 332
				return var3; // L: 333
			}
		}
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-479440090"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1]; // L: 337
		}

	} // L: 338

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 341
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152; // L: 342 343
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-19"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 347
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768; // L: 348 349
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	public int method9261() {
		int var1 = this.array[this.offset] & 255; // L: 353
		return var1 < 128 ? this.readUnsignedByte() - 1 : this.readUnsignedShort() - 32769; // L: 354 355
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1421104365"
	)
	public int method9104() {
		int var1 = 0; // L: 359

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) { // L: 360 361 363
			var1 += 32767; // L: 362
		}

		var1 += var2; // L: 365
		return var1; // L: 366
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-552900164"
	)
	public int method9105() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort(); // L: 370 371
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-668079554"
	)
	public int method9152() {
		if (this.array[this.offset] < 0) { // L: 375
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort(); // L: 376
			return var1 == 32767 ? -1 : var1; // L: 377
		}
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "823098522"
	)
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[++this.offset - 1]; // L: 382

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) { // L: 383 384 386
			var2 = (var2 | var1 & 127) << 7; // L: 385
		}

		return var2 | var1; // L: 388
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1950523962"
	)
	public int method9331() {
		int var2 = 0; // L: 393
		int var3 = 0; // L: 394

		int var1;
		do {
			var1 = this.readUnsignedByte(); // L: 396
			var2 |= (var1 & 127) << var3; // L: 397
			var3 += 7; // L: 398
		} while(var1 > 127); // L: 399

		return var2; // L: 400
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "([IB)V",
		garbageValue = "116"
	)
	@Export("xteaEncryptAll")
	public void xteaEncryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 404
		this.offset = 0; // L: 405

		for (int var3 = 0; var3 < var2; ++var3) { // L: 406
			int var4 = this.readInt(); // L: 407
			int var5 = this.readInt(); // L: 408
			int var6 = 0; // L: 409
			int var7 = -1640531527; // L: 410

			for (int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) { // L: 411 412 415
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]; // L: 413
				var6 += var7; // L: 414
			}

			this.offset -= 8; // L: 417
			this.writeInt(var4); // L: 418
			this.writeInt(var5); // L: 419
		}

	} // L: 421

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "2089048160"
	)
	@Export("xteaDecryptAll")
	public void xteaDecryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 424
		this.offset = 0; // L: 425

		for (int var3 = 0; var3 < var2; ++var3) { // L: 426
			int var4 = this.readInt(); // L: 427
			int var5 = this.readInt(); // L: 428
			int var6 = -957401312; // L: 429
			int var7 = -1640531527; // L: 430

			for (int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) { // L: 431 432 435
				var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6; // L: 433
				var6 -= var7; // L: 434
			}

			this.offset -= 8; // L: 437
			this.writeInt(var4); // L: 438
			this.writeInt(var5); // L: 439
		}

	} // L: 441

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "-493349311"
	)
	@Export("xteaEncrypt")
	public void xteaEncrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 444
		this.offset = var2; // L: 445
		int var5 = (var3 - var2) / 8; // L: 446

		for (int var6 = 0; var6 < var5; ++var6) { // L: 447
			int var7 = this.readInt(); // L: 448
			int var8 = this.readInt(); // L: 449
			int var9 = 0; // L: 450
			int var10 = -1640531527; // L: 451

			for (int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) { // L: 452 453 456
				var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]; // L: 454
				var9 += var10; // L: 455
			}

			this.offset -= 8; // L: 458
			this.writeInt(var7); // L: 459
			this.writeInt(var8); // L: 460
		}

		this.offset = var4; // L: 462
	} // L: 463

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "1219178611"
	)
	@Export("xteaDecrypt")
	public void xteaDecrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 466
		this.offset = var2; // L: 467
		int var5 = (var3 - var2) / 8; // L: 468

		for (int var6 = 0; var6 < var5; ++var6) { // L: 469
			int var7 = this.readInt(); // L: 470
			int var8 = this.readInt(); // L: 471
			int var9 = -957401312; // L: 472
			int var10 = -1640531527; // L: 473

			for (int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) { // L: 474 475 478
				var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9; // L: 476
				var9 -= var10; // L: 477
			}

			this.offset -= 8; // L: 480
			this.writeInt(var7); // L: 481
			this.writeInt(var8); // L: 482
		}

		this.offset = var4; // L: 484
	} // L: 485

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
		garbageValue = "-2130125779"
	)
	@Export("encryptRsa")
	public void encryptRsa(BigInteger var1, BigInteger var2) {
		int var3 = this.offset; // L: 488
		this.offset = 0; // L: 489
		byte[] var4 = new byte[var3]; // L: 490
		this.readBytes(var4, 0, var3); // L: 491
		BigInteger var5 = new BigInteger(var4); // L: 492
		BigInteger var6 = var5.modPow(var1, var2); // L: 493
		byte[] var7 = var6.toByteArray(); // L: 494
		this.offset = 0; // L: 495
		this.writeShort(var7.length); // L: 496
		this.writeBytes(var7, 0, var7.length); // L: 497
	} // L: 498

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "1"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		int var2 = class358.method6748(this.array, var1, this.offset); // L: 501
		this.writeInt(var2); // L: 502
		return var2; // L: 503
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "105"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4; // L: 507
		int var1 = class358.method6748(this.array, 0, this.offset); // L: 508
		int var2 = this.readInt(); // L: 509
		return var2 == var1; // L: 510
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "3631"
	)
	public void method9188(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 515
	} // L: 516

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	public void method9244(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1); // L: 519
	} // L: 520

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1114683794"
	)
	public void method9118(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1); // L: 523
	} // L: 524

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "660455721"
	)
	public int method9119() {
		return this.array[++this.offset - 1] - 128 & 255; // L: 527
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-778478825"
	)
	public int method9120() {
		return 0 - this.array[++this.offset - 1] & 255; // L: 531
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "27227"
	)
	public int method9089() {
		return 128 - this.array[++this.offset - 1] & 255; // L: 535
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "0"
	)
	public byte method9122() {
		return (byte)(this.array[++this.offset - 1] - 128); // L: 539
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "105"
	)
	public byte method9123() {
		return (byte)(0 - this.array[++this.offset - 1]); // L: 543
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-963591919"
	)
	public byte method9124() {
		return (byte)(128 - this.array[++this.offset - 1]); // L: 547
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1732670980"
	)
	public void method9143(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 551
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 552
	} // L: 553

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1935689498"
	)
	public void method9126(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 556
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 557
	} // L: 558

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "111"
	)
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 561
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 562
	} // L: 563

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1581813727"
	)
	public int method9087() {
		this.offset += 2; // L: 566
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 567
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-35"
	)
	public int method9116() {
		this.offset += 2; // L: 571
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 572
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "601175876"
	)
	public int method9130() {
		this.offset += 2; // L: 576
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 577
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-128"
	)
	public int method9131() {
		this.offset += 2; // L: 581
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 582
		if (var1 > 32767) { // L: 583
			var1 -= 65536;
		}

		return var1; // L: 584
	}

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "2"
	)
	public int method9148() {
		this.offset += 2; // L: 588
		int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 589
		if (var1 > 32767) { // L: 590
			var1 -= 65536;
		}

		return var1; // L: 591
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "176308421"
	)
	public void method9278(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 595
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 596
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 597
	} // L: 598

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-225477546"
	)
	public int method9134() {
		this.offset += 3; // L: 601
		return (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16); // L: 602
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1135039814"
	)
	public int method9290() {
		this.offset += 3; // L: 606
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 2] & 255); // L: 607
	}

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "25"
	)
	public int method9136() {
		this.offset += 3; // L: 611
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16); // L: 612
		if (var1 > 8388607) { // L: 613
			var1 -= 16777216;
		}

		return var1; // L: 614
	}

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1385470000"
	)
	public void method9137(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 618
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 619
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 620
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 621
	} // L: 622

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-326257860"
	)
	public void method9138(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 625
		this.array[++this.offset - 1] = (byte)var1; // L: 626
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 627
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 628
	} // L: 629

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "48"
	)
	public void method9139(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 632
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 633
		this.array[++this.offset - 1] = (byte)var1; // L: 634
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 635
	} // L: 636

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1217320965"
	)
	public int method9336() {
		this.offset += 4; // L: 639
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24); // L: 640
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1244908443"
	)
	public int method9200() {
		this.offset += 4; // L: 644
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16); // L: 645
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1942437295"
	)
	public int method9142() {
		this.offset += 4; // L: 649
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24); // L: 650
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1978153967"
	)
	public void method9335(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) { // L: 654
			var1[var4] = this.array[++this.offset - 1];
		}

	} // L: 655

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "25112654"
	)
	public void method9144(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) { // L: 658
			var1[var4] = (byte)(this.array[++this.offset - 1] - 128);
		}

	} // L: 659

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "104"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) { // L: 3986
			class150.clientPreferences.method2464(!class150.clientPreferences.method2465()); // L: 3987
			if (class150.clientPreferences.method2465()) { // L: 3988
				class415.addGameMessage(99, "", "Roofs are now all hidden"); // L: 3989
			} else {
				class415.addGameMessage(99, "", "Roofs will only be removed selectively"); // L: 3992
			}
		}

		if (var0.startsWith("zbuf")) { // L: 3995
			boolean var1 = class306.method5811(var0.substring(5).trim()) == 1; // L: 3996
			TileItem.client.method489(var1); // L: 3997
			Rasterizer3D.method4403(var1); // L: 3998
		}

		if (var0.equalsIgnoreCase("z")) { // L: 4000
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("displayfps")) { // L: 4001
			class150.clientPreferences.method2501();
		}

		if (var0.equalsIgnoreCase("renderself")) { // L: 4002
			Client.field766 = !Client.field766;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) { // L: 4003
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		if (Client.staffModLevel >= 2) { // L: 4004
			if (var0.equalsIgnoreCase("errortest")) { // L: 4005
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) { // L: 4006
				class127.worldMap.showCoord = !class127.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) { // L: 4007
				class150.clientPreferences.method2519(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) { // L: 4008
				class150.clientPreferences.method2519(false);
			}

			if (var0.equalsIgnoreCase("gc")) { // L: 4009
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) { // L: 4010
				class93.method2369();
			}
		}

		PacketBufferNode var2 = class503.getPacketBufferNode(ClientPacket.field3169, Client.packetWriter.isaacCipher); // L: 4013
		var2.packetBuffer.writeByte(var0.length() + 1); // L: 4014
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 4015
		Client.packetWriter.addNode(var2); // L: 4016
	} // L: 4017
}
