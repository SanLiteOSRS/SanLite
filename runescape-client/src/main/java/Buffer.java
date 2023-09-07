import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tm")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("af")
	@Export("crc32Table")
	public static int[] crc32Table;
	@ObfuscatedName("aq")
	@Export("crc64Table")
	static long[] crc64Table;
	@ObfuscatedName("ap")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1646688909
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
		this.array = class125.ByteArrayPool_getArray(var1); // L: 47
		this.offset = 0; // L: 48
	} // L: 49

	public Buffer(byte[] var1) {
		this.array = var1; // L: 56
		this.offset = 0; // L: 57
	} // L: 58

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1801780173"
	)
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) { // L: 61
			PlayerType.ByteArrayPool_release(this.array);
		}

		this.array = null; // L: 62
	} // L: 63

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1656080005"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 66
	} // L: 67

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1405457732"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 70
		this.array[++this.offset - 1] = (byte)var1; // L: 71
	} // L: 72

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-83"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 75
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 76
		this.array[++this.offset - 1] = (byte)var1; // L: 77
	} // L: 78

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-619535909"
	)
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 81
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 82
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 83
		this.array[++this.offset - 1] = (byte)var1; // L: 84
	} // L: 85

	@ObfuscatedName("bx")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 88
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 89
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 90
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 91
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 92
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 93
	} // L: 94

	@ObfuscatedName("bn")
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

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-80697695"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0); // L: 108
	} // L: 109

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "915346202"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0); // L: 116
		if (var2 >= 0) { // L: 117
			throw new IllegalArgumentException("");
		} else {
			this.offset += LoginPacket.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 118
			this.array[++this.offset - 1] = 0; // L: 119
		}
	} // L: 120

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2010597854"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0); // L: 123
		if (var2 >= 0) { // L: 124
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0; // L: 125
			this.offset += LoginPacket.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 126
			this.array[++this.offset - 1] = 0; // L: 127
		}
	} // L: 128

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)V",
		garbageValue = "-2085392381"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var2 = InvDefinition.method3566(var1); // L: 131
		this.array[++this.offset - 1] = 0; // L: 132
		this.writeVarInt(var2); // L: 133
		this.offset += GroundObject.method4358(this.array, this.offset, var1); // L: 134
	} // L: 135

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1427589221"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) { // L: 138
			this.array[++this.offset - 1] = var1[var4];
		}

	} // L: 139

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V",
		garbageValue = "51362349"
	)
	public void method9052(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset); // L: 142
	} // L: 143

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "82"
	)
	@Export("writeLengthInt")
	public void writeLengthInt(int var1) {
		if (var1 < 0) { // L: 146
			throw new IllegalArgumentException(); // L: 147
		} else {
			this.array[this.offset - var1 - 4] = (byte)(var1 >> 24); // L: 149
			this.array[this.offset - var1 - 3] = (byte)(var1 >> 16); // L: 150
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 151
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 152
		}
	} // L: 153

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-44738618"
	)
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) { // L: 156
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 159
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 160
		} else {
			throw new IllegalArgumentException(); // L: 157
		}
	} // L: 161

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1799868177"
	)
	public void method9055(int var1) {
		if (var1 >= 0 && var1 <= 255) { // L: 164
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 167
		} else {
			throw new IllegalArgumentException(); // L: 165
		}
	} // L: 168

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "15989"
	)
	@Export("writeSmartByteShort")
	public void writeSmartByteShort(int var1) {
		if (var1 >= 0 && var1 < 128) { // L: 171
			this.writeByte(var1); // L: 172
		} else if (var1 >= 0 && var1 < 32768) { // L: 175
			this.writeShort(var1 + 32768); // L: 176
		} else {
			throw new IllegalArgumentException(); // L: 179
		}
	} // L: 173 177

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "26"
	)
	@Export("writeVarInt")
	public void writeVarInt(int var1) {
		if ((var1 & -128) != 0) { // L: 183
			if ((var1 & -16384) != 0) { // L: 184
				if ((var1 & -2097152) != 0) { // L: 185
					if ((var1 & -268435456) != 0) { // L: 186
						this.writeByte(var1 >>> 28 | 128);
					}

					this.writeByte(var1 >>> 21 | 128); // L: 187
				}

				this.writeByte(var1 >>> 14 | 128); // L: 189
			}

			this.writeByte(var1 >>> 7 | 128); // L: 191
		}

		this.writeByte(var1 & 127); // L: 193
	} // L: 194

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "515674060"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255; // L: 197
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "130364470"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1]; // L: 201
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-85"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2; // L: 205
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 206
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1858143695"
	)
	@Export("readShort")
	public int readShort() {
		this.offset += 2; // L: 210
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 211
		if (var1 > 32767) { // L: 212
			var1 -= 65536;
		}

		return var1; // L: 213
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "87"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3; // L: 217
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 218
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "618141055"
	)
	public int method9192() {
		this.offset += 3; // L: 222
		int var1 = ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 223
		if (var1 > 8388607) { // L: 224
			var1 -= 16777216;
		}

		return var1; // L: 225
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-85665102"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 4; // L: 229
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24); // L: 230
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-1147621862"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L; // L: 234
		long var3 = (long)this.readInt() & 4294967295L; // L: 235
		return var3 + (var1 << 32); // L: 236
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "1"
	)
	public float method9066() {
		return Float.intBitsToFloat(this.readInt()); // L: 240
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "8"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1; // L: 244
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1848740572"
	)
	@Export("readStringCp1252NullTerminatedOrNull")
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset] == 0) { // L: 248
			++this.offset; // L: 249
			return null; // L: 250
		} else {
			return this.readStringCp1252NullTerminated(); // L: 252
		}
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "262549745"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset; // L: 256

		while (this.array[++this.offset - 1] != 0) { // L: 257
		}

		int var2 = this.offset - var1 - 1; // L: 258
		return var2 == 0 ? "" : class325.decodeStringCp1252(this.array, var1, var2); // L: 259 260
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1654554633"
	)
	@Export("readStringCp1252NullCircumfixed")
	public String readStringCp1252NullCircumfixed() {
		byte var1 = this.array[++this.offset - 1]; // L: 264
		if (var1 != 0) { // L: 265
			throw new IllegalStateException("");
		} else {
			int var2 = this.offset; // L: 266

			while (this.array[++this.offset - 1] != 0) { // L: 267
			}

			int var3 = this.offset - var2 - 1; // L: 268
			return var3 == 0 ? "" : class325.decodeStringCp1252(this.array, var2, var3); // L: 269 270
		}
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-935649711"
	)
	@Export("readCESU8")
	public String readCESU8() {
		byte var1 = this.array[++this.offset - 1]; // L: 274
		if (var1 != 0) { // L: 275
			throw new IllegalStateException("");
		} else {
			int var2 = this.readVarInt(); // L: 276
			if (var2 + this.offset > this.array.length) { // L: 277
				throw new IllegalStateException("");
			} else {
				byte[] var4 = this.array; // L: 279
				int var5 = this.offset; // L: 280
				char[] var6 = new char[var2]; // L: 282
				int var7 = 0; // L: 283
				int var8 = var5; // L: 284

				int var11;
				for (int var9 = var2 + var5; var8 < var9; var6[var7++] = (char)var11) { // L: 285 286 317
					int var10 = var4[var8++] & 255; // L: 287
					if (var10 < 128) { // L: 289
						if (var10 == 0) { // L: 290
							var11 = 65533;
						} else {
							var11 = var10; // L: 291
						}
					} else if (var10 < 192) { // L: 293
						var11 = 65533;
					} else if (var10 < 224) { // L: 294
						if (var8 < var9 && (var4[var8] & 192) == 128) { // L: 295
							var11 = (var10 & 31) << 6 | var4[var8++] & 63; // L: 296
							if (var11 < 128) { // L: 297
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 299
						}
					} else if (var10 < 240) { // L: 301
						if (var8 + 1 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128) { // L: 302
							var11 = (var10 & 15) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63; // L: 303
							if (var11 < 2048) { // L: 304
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 306
						}
					} else if (var10 < 248) { // L: 308
						if (var8 + 2 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128 && (var4[var8 + 2] & 192) == 128) { // L: 309
							var11 = (var10 & 7) << 18 | (var4[var8++] & 63) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63; // L: 310
							if (var11 >= 65536 && var11 <= 1114111) { // L: 311
								var11 = 65533; // L: 312
							} else {
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 314
						}
					} else {
						var11 = 65533; // L: 316
					}
				}

				String var3 = new String(var6, 0, var7); // L: 319
				this.offset += var2; // L: 322
				return var3; // L: 323
			}
		}
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "37"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1]; // L: 327
		}

	} // L: 328

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "234174840"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 331
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152; // L: 332 333
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1174509102"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 337
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768; // L: 338 339
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1553236934"
	)
	public int method9075() {
		int var1 = this.array[this.offset] & 255; // L: 343
		return var1 < 128 ? this.readUnsignedByte() - 1 : this.readUnsignedShort() - 32769; // L: 344 345
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-94"
	)
	public int method9076() {
		int var1 = 0; // L: 349

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) { // L: 350 351 353
			var1 += 32767; // L: 352
		}

		var1 += var2; // L: 355
		return var1; // L: 356
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "776176450"
	)
	public int method9077() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort(); // L: 360 361
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1431150361"
	)
	public int method9198() {
		if (this.array[this.offset] < 0) { // L: 365
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort(); // L: 366
			return var1 == 32767 ? -1 : var1; // L: 367
		}
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[++this.offset - 1]; // L: 372

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) { // L: 373 374 376
			var2 = (var2 | var1 & 127) << 7; // L: 375
		}

		return var2 | var1; // L: 378
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-28338"
	)
	public int method9080() {
		int var2 = 0; // L: 383
		int var3 = 0; // L: 384

		int var1;
		do {
			var1 = this.readUnsignedByte(); // L: 386
			var2 |= (var1 & 127) << var3; // L: 387
			var3 += 7; // L: 388
		} while(var1 > 127); // L: 389

		return var2; // L: 390
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "([IB)V",
		garbageValue = "2"
	)
	@Export("xteaEncryptAll")
	public void xteaEncryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 394
		this.offset = 0; // L: 395

		for (int var3 = 0; var3 < var2; ++var3) { // L: 396
			int var4 = this.readInt(); // L: 397
			int var5 = this.readInt(); // L: 398
			int var6 = 0; // L: 399
			int var7 = -1640531527; // L: 400

			for (int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) { // L: 401 402 405
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]; // L: 403
				var6 += var7; // L: 404
			}

			this.offset -= 8; // L: 407
			this.writeInt(var4); // L: 408
			this.writeInt(var5); // L: 409
		}

	} // L: 411

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "-1321598468"
	)
	@Export("xteaDecryptAll")
	public void xteaDecryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 414
		this.offset = 0; // L: 415

		for (int var3 = 0; var3 < var2; ++var3) { // L: 416
			int var4 = this.readInt(); // L: 417
			int var5 = this.readInt(); // L: 418
			int var6 = -957401312; // L: 419
			int var7 = -1640531527; // L: 420

			for (int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) { // L: 421 422 425
				var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6; // L: 423
				var6 -= var7; // L: 424
			}

			this.offset -= 8; // L: 427
			this.writeInt(var4); // L: 428
			this.writeInt(var5); // L: 429
		}

	} // L: 431

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "1099130018"
	)
	@Export("xteaEncrypt")
	public void xteaEncrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 434
		this.offset = var2; // L: 435
		int var5 = (var3 - var2) / 8; // L: 436

		for (int var6 = 0; var6 < var5; ++var6) { // L: 437
			int var7 = this.readInt(); // L: 438
			int var8 = this.readInt(); // L: 439
			int var9 = 0; // L: 440
			int var10 = -1640531527; // L: 441

			for (int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) { // L: 442 443 446
				var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]; // L: 444
				var9 += var10; // L: 445
			}

			this.offset -= 8; // L: 448
			this.writeInt(var7); // L: 449
			this.writeInt(var8); // L: 450
		}

		this.offset = var4; // L: 452
	} // L: 453

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "([IIIB)V",
		garbageValue = "-14"
	)
	@Export("xteaDecrypt")
	public void xteaDecrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 456
		this.offset = var2; // L: 457
		int var5 = (var3 - var2) / 8; // L: 458

		for (int var6 = 0; var6 < var5; ++var6) { // L: 459
			int var7 = this.readInt(); // L: 460
			int var8 = this.readInt(); // L: 461
			int var9 = -957401312; // L: 462
			int var10 = -1640531527; // L: 463

			for (int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) { // L: 464 465 468
				var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9; // L: 466
				var9 -= var10; // L: 467
			}

			this.offset -= 8; // L: 470
			this.writeInt(var7); // L: 471
			this.writeInt(var8); // L: 472
		}

		this.offset = var4; // L: 474
	} // L: 475

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
		garbageValue = "849520517"
	)
	@Export("encryptRsa")
	public void encryptRsa(BigInteger var1, BigInteger var2) {
		int var3 = this.offset; // L: 478
		this.offset = 0; // L: 479
		byte[] var4 = new byte[var3]; // L: 480
		this.readBytes(var4, 0, var3); // L: 481
		BigInteger var5 = new BigInteger(var4); // L: 482
		BigInteger var6 = var5.modPow(var1, var2); // L: 483
		byte[] var7 = var6.toByteArray(); // L: 484
		this.offset = 0; // L: 485
		this.writeShort(var7.length); // L: 486
		this.writeBytes(var7, 0, var7.length); // L: 487
	} // L: 488

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1394849822"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		byte[] var3 = this.array; // L: 492
		int var4 = this.offset; // L: 493
		int var5 = -1; // L: 495

		for (int var6 = var1; var6 < var4; ++var6) { // L: 496
			var5 = var5 >>> 8 ^ crc32Table[(var5 ^ var3[var6]) & 255]; // L: 497
		}

		var5 = ~var5; // L: 499
		this.writeInt(var5); // L: 503
		return var5; // L: 504
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1935079225"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4; // L: 508
		byte[] var2 = this.array; // L: 510
		int var3 = this.offset; // L: 511
		int var4 = -1; // L: 513

		int var5;
		for (var5 = 0; var5 < var3; ++var5) { // L: 514
			var4 = var4 >>> 8 ^ crc32Table[(var4 ^ var2[var5]) & 255]; // L: 515
		}

		var4 = ~var4; // L: 517
		var5 = this.readInt(); // L: 521
		return var5 == var4; // L: 522
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1286227217"
	)
	public void method9088(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 527
	} // L: 528

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "73"
	)
	public void method9291(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1); // L: 531
	} // L: 532

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1646305705"
	)
	public void method9110(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1); // L: 535
	} // L: 536

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "316083007"
	)
	public int method9091() {
		return this.array[++this.offset - 1] - 128 & 255; // L: 539
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1007097777"
	)
	public int method9256() {
		return 0 - this.array[++this.offset - 1] & 255; // L: 543
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1108822306"
	)
	public int method9093() {
		return 128 - this.array[++this.offset - 1] & 255; // L: 547
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-302199246"
	)
	public byte method9078() {
		return (byte)(this.array[++this.offset - 1] - 128); // L: 551
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "-122"
	)
	public byte method9095() {
		return (byte)(0 - this.array[++this.offset - 1]); // L: 555
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "1035435646"
	)
	public byte method9096() {
		return (byte)(128 - this.array[++this.offset - 1]); // L: 559
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-792934648"
	)
	public void method9239(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 563
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 564
	} // L: 565

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1242931377"
	)
	public void method9098(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 568
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 569
	} // L: 570

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1382454914"
	)
	public void method9213(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 573
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 574
	} // L: 575

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1918488867"
	)
	public int method9100() {
		this.offset += 2; // L: 578
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 579
	}

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1798524926"
	)
	public int method9101() {
		this.offset += 2; // L: 583
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 584
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "73"
	)
	public int method9102() {
		this.offset += 2; // L: 588
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 589
	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2113595632"
	)
	public int method9063() {
		this.offset += 2; // L: 593
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 594
		if (var1 > 32767) { // L: 595
			var1 -= 65536;
		}

		return var1; // L: 596
	}

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1366788649"
	)
	public int method9104() {
		this.offset += 2; // L: 600
		int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 601
		if (var1 > 32767) { // L: 602
			var1 -= 65536;
		}

		return var1; // L: 603
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-614629253"
	)
	public void method9105(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 607
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 608
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 609
	} // L: 610

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-535659552"
	)
	public int method9226() {
		this.offset += 3; // L: 613
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 2] & 255); // L: 614
	}

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	public int method9216() {
		this.offset += 3; // L: 618
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16); // L: 619
	}

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "117"
	)
	public int method9108() {
		this.offset += 3; // L: 623
		int var1 = (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16); // L: 624
		if (var1 > 8388607) { // L: 625
			var1 -= 16777216;
		}

		return var1; // L: 626
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-73"
	)
	public int method9109() {
		this.offset += 3; // L: 630
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 2] & 255); // L: 631
		if (var1 > 8388607) { // L: 632
			var1 -= 16777216;
		}

		return var1; // L: 633
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1615991822"
	)
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 637
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 638
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 639
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 640
	} // L: 641

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "46"
	)
	public void method9111(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 644
		this.array[++this.offset - 1] = (byte)var1; // L: 645
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 646
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 647
	} // L: 648

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2112145568"
	)
	public void method9112(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 651
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 652
		this.array[++this.offset - 1] = (byte)var1; // L: 653
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 654
	} // L: 655

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "10"
	)
	public int method9188() {
		this.offset += 4; // L: 658
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24); // L: 659
	}

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2095905136"
	)
	public int method9114() {
		this.offset += 4; // L: 663
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16); // L: 664
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int method9115() {
		this.offset += 4; // L: 668
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24); // L: 669
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1107296257"
	)
	public void method9218(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = (byte)(this.array[++this.offset - 1] - 128); // L: 673
		}

	} // L: 674
}
