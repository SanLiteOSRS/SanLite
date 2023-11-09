import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rd")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("k")
	@Export("crc32Table")
	static int[] crc32Table;
	@ObfuscatedName("r")
	@Export("crc64Table")
	static long[] crc64Table;
	@ObfuscatedName("n")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -612074329
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
		this.array = ClientPacket.ByteArrayPool_getArray(var1); // L: 60
		this.offset = 0; // L: 61
	} // L: 62

	public Buffer(byte[] var1) {
		this.array = var1; // L: 69
		this.offset = 0; // L: 70
	} // L: 71

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-26313"
	)
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) { // L: 74
			class277.ByteArrayPool_release(this.array);
		}

		this.array = null; // L: 75
	} // L: 76

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "7663"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 79
	} // L: 80

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "88"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 83
		this.array[++this.offset - 1] = (byte)var1; // L: 84
	} // L: 85

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 88
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 89
		this.array[++this.offset - 1] = (byte)var1; // L: 90
	} // L: 91

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1859234108"
	)
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 94
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 95
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 96
		this.array[++this.offset - 1] = (byte)var1; // L: 97
	} // L: 98

	@ObfuscatedName("ad")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 101
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 102
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 103
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 104
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 105
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 106
	} // L: 107

	@ObfuscatedName("ab")
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-72"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0); // L: 121
	} // L: 122

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "54"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0); // L: 129
		if (var2 >= 0) { // L: 130
			throw new IllegalArgumentException("");
		} else {
			this.offset += class285.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 131
			this.array[++this.offset - 1] = 0; // L: 132
		}
	} // L: 133

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "821657052"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0); // L: 136
		if (var2 >= 0) { // L: 137
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0; // L: 138
			this.offset += class285.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 139
			this.array[++this.offset - 1] = 0; // L: 140
		}
	} // L: 141

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)V",
		garbageValue = "1620729610"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var2 = PcmPlayer.method838(var1); // L: 144
		this.array[++this.offset - 1] = 0; // L: 145
		this.writeVarInt(var2); // L: 146
		int var3 = this.offset; // L: 147
		byte[] var5 = this.array;
		int var6 = this.offset;
		int var7 = var1.length();
		int var8 = var6; // L: 153

		for (int var9 = 0; var9 < var7; ++var9) { // L: 154
			char var10 = var1.charAt(var9); // L: 155
			if (var10 <= 127) { // L: 156
				var5[var8++] = (byte)var10; // L: 157
			} else if (var10 <= 2047) { // L: 159
				var5[var8++] = (byte)(192 | var10 >> 6); // L: 160
				var5[var8++] = (byte)(128 | var10 & '?'); // L: 161
			} else {
				var5[var8++] = (byte)(224 | var10 >> '\f'); // L: 164
				var5[var8++] = (byte)(128 | var10 >> 6 & 63); // L: 165
				var5[var8++] = (byte)(128 | var10 & '?'); // L: 166
			}
		}

		int var4 = var8 - var6; // L: 169
		this.offset = var3 + var4; // L: 171
	} // L: 172

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-872987792"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) { // L: 175
			this.array[++this.offset - 1] = var1[var4];
		}

	} // L: 176

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lrd;B)V",
		garbageValue = "33"
	)
	public void method8877(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset); // L: 179
	} // L: 180

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-109691935"
	)
	@Export("writeLengthInt")
	public void writeLengthInt(int var1) {
		if (var1 < 0) { // L: 183
			throw new IllegalArgumentException(); // L: 184
		} else {
			this.array[this.offset - var1 - 4] = (byte)(var1 >> 24); // L: 186
			this.array[this.offset - var1 - 3] = (byte)(var1 >> 16); // L: 187
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 188
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 189
		}
	} // L: 190

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-63060014"
	)
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) { // L: 193
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 196
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 197
		} else {
			throw new IllegalArgumentException(); // L: 194
		}
	} // L: 198

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "302904978"
	)
	public void method8810(int var1) {
		if (var1 >= 0 && var1 <= 255) { // L: 201
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 204
		} else {
			throw new IllegalArgumentException(); // L: 202
		}
	} // L: 205

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1976958769"
	)
	@Export("writeSmartByteShort")
	public void writeSmartByteShort(int var1) {
		if (var1 >= 0 && var1 < 128) { // L: 208
			this.writeByte(var1); // L: 209
		} else if (var1 >= 0 && var1 < 32768) { // L: 212
			this.writeShort(var1 + 32768); // L: 213
		} else {
			throw new IllegalArgumentException(); // L: 216
		}
	} // L: 210 214

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "3"
	)
	@Export("writeVarInt")
	public void writeVarInt(int var1) {
		if ((var1 & -128) != 0) { // L: 220
			if ((var1 & -16384) != 0) { // L: 221
				if ((var1 & -2097152) != 0) { // L: 222
					if ((var1 & -268435456) != 0) { // L: 223
						this.writeByte(var1 >>> 28 | 128);
					}

					this.writeByte(var1 >>> 21 | 128); // L: 224
				}

				this.writeByte(var1 >>> 14 | 128); // L: 226
			}

			this.writeByte(var1 >>> 7 | 128); // L: 228
		}

		this.writeByte(var1 & 127); // L: 230
	} // L: 231

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "953878016"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255; // L: 234
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "487276553"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1]; // L: 238
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "618352324"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2; // L: 242
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 243
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "80"
	)
	@Export("readShort")
	public int readShort() {
		this.offset += 2; // L: 247
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 248
		if (var1 > 32767) { // L: 249
			var1 -= 65536;
		}

		return var1; // L: 250
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1144305669"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3; // L: 254
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 255
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-353043483"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 4; // L: 259
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24); // L: 260
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "792803189"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L; // L: 264
		long var3 = (long)this.readInt() & 4294967295L; // L: 265
		return var3 + (var1 << 32); // L: 266
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "1171371205"
	)
	public float method8764() {
		return Float.intBitsToFloat(this.readInt()); // L: 270
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1415924106"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1; // L: 274
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "1"
	)
	@Export("readStringCp1252NullTerminatedOrNull")
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset] == 0) { // L: 278
			++this.offset; // L: 279
			return null; // L: 280
		} else {
			return this.readStringCp1252NullTerminated(); // L: 282
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1425951954"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset; // L: 286

		while (this.array[++this.offset - 1] != 0) { // L: 287
		}

		int var2 = this.offset - var1 - 1; // L: 288
		return var2 == 0 ? "" : class101.decodeStringCp1252(this.array, var1, var2); // L: 289 290
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "27341435"
	)
	@Export("readStringCp1252NullCircumfixed")
	public String readStringCp1252NullCircumfixed() {
		byte var1 = this.array[++this.offset - 1]; // L: 294
		if (var1 != 0) { // L: 295
			throw new IllegalStateException("");
		} else {
			int var2 = this.offset; // L: 296

			while (this.array[++this.offset - 1] != 0) { // L: 297
			}

			int var3 = this.offset - var2 - 1; // L: 298
			return var3 == 0 ? "" : class101.decodeStringCp1252(this.array, var2, var3); // L: 299 300
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "-1367"
	)
	@Export("readCESU8")
	public String readCESU8() {
		byte var1 = this.array[++this.offset - 1]; // L: 304
		if (var1 != 0) { // L: 305
			throw new IllegalStateException("");
		} else {
			int var2 = this.readVarInt(); // L: 306
			if (var2 + this.offset > this.array.length) {
				throw new IllegalStateException(""); // L: 307
			} else {
				String var3 = class285.method5572(this.array, this.offset, var2); // L: 308
				this.offset += var2; // L: 309
				return var3; // L: 310
			}
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-345920615"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1]; // L: 314
		}

	} // L: 315

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1527077810"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 318
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152; // L: 319 320
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "629721821"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 324
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768; // L: 325 326
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "5397"
	)
	public int method8660() {
		int var1 = this.array[this.offset] & 255; // L: 330
		return var1 < 128 ? this.readUnsignedByte() - 1 : this.readUnsignedShort() - 32769; // L: 331 332
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1585949147"
	)
	public int method8809() {
		int var1 = 0; // L: 336

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) { // L: 337 338 340
			var1 += 32767; // L: 339
		}

		var1 += var2; // L: 342
		return var1; // L: 343
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2005911830"
	)
	public int method8662() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort(); // L: 347 348
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-16"
	)
	public int method8709() {
		if (this.array[this.offset] < 0) { // L: 352
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort(); // L: 353
			return var1 == 32767 ? -1 : var1; // L: 354
		}
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1017425197"
	)
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[++this.offset - 1]; // L: 359

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) { // L: 360 361 363
			var2 = (var2 | var1 & 127) << 7; // L: 362
		}

		return var2 | var1; // L: 365
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-2"
	)
	public int method8665() {
		int var2 = 0; // L: 370
		int var3 = 0; // L: 371

		int var1;
		do {
			var1 = this.readUnsignedByte(); // L: 373
			var2 |= (var1 & 127) << var3; // L: 374
			var3 += 7; // L: 375
		} while(var1 > 127); // L: 376

		return var2; // L: 377
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "-504157686"
	)
	@Export("xteaEncryptAll")
	public void xteaEncryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 381
		this.offset = 0; // L: 382

		for (int var3 = 0; var3 < var2; ++var3) { // L: 383
			int var4 = this.readInt(); // L: 384
			int var5 = this.readInt(); // L: 385
			int var6 = 0; // L: 386
			int var7 = -1640531527; // L: 387

			for (int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) { // L: 388 389 392
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]; // L: 390
				var6 += var7; // L: 391
			}

			this.offset -= 8; // L: 394
			this.writeInt(var4); // L: 395
			this.writeInt(var5); // L: 396
		}

	} // L: 398

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "([IB)V",
		garbageValue = "-126"
	)
	@Export("xteaDecryptAll")
	public void xteaDecryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 401
		this.offset = 0; // L: 402

		for (int var3 = 0; var3 < var2; ++var3) { // L: 403
			int var4 = this.readInt(); // L: 404
			int var5 = this.readInt(); // L: 405
			int var6 = -957401312; // L: 406
			int var7 = -1640531527; // L: 407

			for (int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) { // L: 408 409 412
				var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6; // L: 410
				var6 -= var7; // L: 411
			}

			this.offset -= 8; // L: 414
			this.writeInt(var4); // L: 415
			this.writeInt(var5); // L: 416
		}

	} // L: 418

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "-905803903"
	)
	@Export("xteaEncrypt")
	public void xteaEncrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 421
		this.offset = var2; // L: 422
		int var5 = (var3 - var2) / 8; // L: 423

		for (int var6 = 0; var6 < var5; ++var6) { // L: 424
			int var7 = this.readInt(); // L: 425
			int var8 = this.readInt(); // L: 426
			int var9 = 0; // L: 427
			int var10 = -1640531527; // L: 428

			for (int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) { // L: 429 430 433
				var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]; // L: 431
				var9 += var10; // L: 432
			}

			this.offset -= 8; // L: 435
			this.writeInt(var7); // L: 436
			this.writeInt(var8); // L: 437
		}

		this.offset = var4; // L: 439
	} // L: 440

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "-432877119"
	)
	@Export("xteaDecrypt")
	public void xteaDecrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 443
		this.offset = var2; // L: 444
		int var5 = (var3 - var2) / 8; // L: 445

		for (int var6 = 0; var6 < var5; ++var6) { // L: 446
			int var7 = this.readInt(); // L: 447
			int var8 = this.readInt(); // L: 448
			int var9 = -957401312; // L: 449
			int var10 = -1640531527; // L: 450

			for (int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) { // L: 451 452 455
				var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9; // L: 453
				var9 -= var10; // L: 454
			}

			this.offset -= 8; // L: 457
			this.writeInt(var7); // L: 458
			this.writeInt(var8); // L: 459
		}

		this.offset = var4; // L: 461
	} // L: 462

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V",
		garbageValue = "-57"
	)
	@Export("encryptRsa")
	public void encryptRsa(BigInteger var1, BigInteger var2) {
		int var3 = this.offset; // L: 465
		this.offset = 0; // L: 466
		byte[] var4 = new byte[var3]; // L: 467
		this.readBytes(var4, 0, var3); // L: 468
		BigInteger var5 = new BigInteger(var4); // L: 469
		BigInteger var6 = var5.modPow(var1, var2); // L: 470
		byte[] var7 = var6.toByteArray(); // L: 471
		this.offset = 0; // L: 472
		this.writeShort(var7.length); // L: 473
		this.writeBytes(var7, 0, var7.length); // L: 474
	} // L: 475

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "23268"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		int var2 = IgnoreList.method7524(this.array, var1, this.offset); // L: 478
		this.writeInt(var2); // L: 479
		return var2; // L: 480
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "71"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4; // L: 484
		int var1 = IgnoreList.method7524(this.array, 0, this.offset); // L: 485
		int var2 = this.readInt(); // L: 486
		return var1 == var2; // L: 487
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "93"
	)
	public void method8673(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 492
	} // L: 493

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1152640181"
	)
	public void method8674(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1); // L: 496
	} // L: 497

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-6"
	)
	public void method8765(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1); // L: 500
	} // L: 501

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1963653347"
	)
	public int method8676() {
		return this.array[++this.offset - 1] - 128 & 255; // L: 504
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-86"
	)
	public int method8677() {
		return 0 - this.array[++this.offset - 1] & 255; // L: 508
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "6"
	)
	public int method8678() {
		return 128 - this.array[++this.offset - 1] & 255; // L: 512
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "183282951"
	)
	public byte method8679() {
		return (byte)(this.array[++this.offset - 1] - 128); // L: 516
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-474371999"
	)
	public byte method8786() {
		return (byte)(0 - this.array[++this.offset - 1]); // L: 520
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "608108518"
	)
	public byte method8875() {
		return (byte)(128 - this.array[++this.offset - 1]); // L: 524
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2032694822"
	)
	public void method8682(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 528
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 529
	} // L: 530

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1610016705"
	)
	public void method8683(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 533
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 534
	} // L: 535

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "974533362"
	)
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 538
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 539
	} // L: 540

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-927694440"
	)
	public int method8714() {
		this.offset += 2; // L: 543
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 544
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int method8730() {
		this.offset += 2; // L: 548
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 549
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1354782353"
	)
	public int method8719() {
		this.offset += 2; // L: 553
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 554
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "285070066"
	)
	public int method8688() {
		this.offset += 2; // L: 558
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 559
		if (var1 > 32767) { // L: 560
			var1 -= 65536;
		}

		return var1; // L: 561
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1019917442"
	)
	public int method8689() {
		this.offset += 2; // L: 565
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 566
		if (var1 > 32767) { // L: 567
			var1 -= 65536;
		}

		return var1; // L: 568
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "3"
	)
	public void method8690(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 572
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 573
		this.array[++this.offset - 1] = (byte)var1; // L: 574
	} // L: 575

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2100252481"
	)
	public int method8843() {
		this.offset += 3; // L: 578
		return (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16); // L: 579
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1742665826"
	)
	public int method8692() {
		this.offset += 3; // L: 583
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16); // L: 584
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1246652927"
	)
	public int method8710() {
		this.offset += 3; // L: 588
		int var1 = (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16); // L: 589
		if (var1 > 8388607) { // L: 590
			var1 -= 16777216;
		}

		return var1; // L: 591
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1501574391"
	)
	public int method8694() {
		this.offset += 3; // L: 595
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 2] & 255); // L: 596
		if (var1 > 8388607) { // L: 597
			var1 -= 16777216;
		}

		return var1; // L: 598
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "10363"
	)
	public void method8846(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 602
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 603
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 604
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 605
	} // L: 606

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "41"
	)
	public void method8696(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 609
		this.array[++this.offset - 1] = (byte)var1; // L: 610
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 611
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 612
	} // L: 613

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "63"
	)
	public void method8648(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 616
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 617
		this.array[++this.offset - 1] = (byte)var1; // L: 618
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 619
	} // L: 620

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1253284220"
	)
	public int method8698() {
		this.offset += 4; // L: 623
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24); // L: 624
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-528886777"
	)
	public int method8699() {
		this.offset += 4; // L: 628
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16); // L: 629
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "255"
	)
	public int method8700() {
		this.offset += 4; // L: 633
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24); // L: 634
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-1640541886"
	)
	public void method8701(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) { // L: 638
			var1[var4] = (byte)(this.array[++this.offset - 1] - 128);
		}

	} // L: 639

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lln;III)Z",
		garbageValue = "274517140"
	)
	public static boolean method8892(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2); // L: 149
		if (var3 == null) { // L: 150
			return false;
		} else {
			FriendLoginUpdate.SpriteBuffer_decode(var3); // L: 151
			return true; // L: 152
		}
	}
}
