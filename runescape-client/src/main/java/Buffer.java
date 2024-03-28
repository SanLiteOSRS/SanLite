import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ur")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("al")
	@Export("crc32Table")
	static int[] crc32Table;
	@ObfuscatedName("ag")
	@Export("crc64Table")
	static long[] crc64Table;
	@ObfuscatedName("hs")
	@ObfuscatedGetter(
		longValue = 9192017256817398751L
	)
	static long field5233;
	@ObfuscatedName("aw")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 2108162897
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
		this.array = class235.ByteArrayPool_getArrayBool(var1, var2); // L: 61
	} // L: 62

	public Buffer(int var1) {
		this.array = class195.ByteArrayPool_getArray(var1); // L: 56
		this.offset = 0; // L: 57
	} // L: 58

	public Buffer(byte[] var1) {
		this.array = var1; // L: 65
		this.offset = 0; // L: 66
	} // L: 67

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "83"
	)
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) { // L: 70
			WorldMapIcon_0.ByteArrayPool_release(this.array);
		}

		this.array = null; // L: 71
	} // L: 72

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1800519751"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 75
	} // L: 76

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-802878851"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 79
		this.array[++this.offset - 1] = (byte)var1; // L: 80
	} // L: 81

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "78"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 84
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 85
		this.array[++this.offset - 1] = (byte)var1; // L: 86
	} // L: 87

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "704971614"
	)
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 90
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 91
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 92
		this.array[++this.offset - 1] = (byte)var1; // L: 93
	} // L: 94

	@ObfuscatedName("bk")
	public void method9245(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 97
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 98
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 99
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 100
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 101
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 102
	} // L: 103

	@ObfuscatedName("bt")
	@Export("writeLong")
	public void writeLong(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 56)); // L: 106
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 48)); // L: 107
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 108
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 109
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 110
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 111
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 112
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 113
	} // L: 114

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1030500391"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0); // L: 117
	} // L: 118

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "2"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0); // L: 125
		if (var2 >= 0) { // L: 126
			throw new IllegalArgumentException("");
		} else {
			this.offset += class134.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 127
			this.array[++this.offset - 1] = 0; // L: 128
		}
	} // L: 129

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-802727588"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0); // L: 132
		if (var2 >= 0) { // L: 133
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0; // L: 134
			this.offset += class134.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 135
			this.array[++this.offset - 1] = 0; // L: 136
		}
	} // L: 137

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)V",
		garbageValue = "-1497484383"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var3 = var1.length(); // L: 142
		int var4 = 0; // L: 143

		int var5;
		for (var5 = 0; var5 < var3; ++var5) { // L: 144
			char var12 = var1.charAt(var5); // L: 145
			if (var12 <= 127) { // L: 146
				++var4;
			} else if (var12 <= 2047) { // L: 147
				var4 += 2;
			} else {
				var4 += 3; // L: 148
			}
		}

		this.array[++this.offset - 1] = 0; // L: 153
		this.writeVarInt(var4); // L: 154
		var4 = this.offset; // L: 155
		byte[] var6 = this.array; // L: 157
		int var7 = this.offset; // L: 158
		int var8 = var1.length(); // L: 160
		int var9 = var7; // L: 161

		for (int var10 = 0; var10 < var8; ++var10) { // L: 162
			char var11 = var1.charAt(var10); // L: 163
			if (var11 <= 127) { // L: 164
				var6[var9++] = (byte)var11; // L: 165
			} else if (var11 <= 2047) { // L: 167
				var6[var9++] = (byte)(192 | var11 >> 6); // L: 168
				var6[var9++] = (byte)(128 | var11 & '?'); // L: 169
			} else {
				var6[var9++] = (byte)(224 | var11 >> '\f'); // L: 172
				var6[var9++] = (byte)(128 | var11 >> 6 & 63); // L: 173
				var6[var9++] = (byte)(128 | var11 & '?'); // L: 174
			}
		}

		var5 = var9 - var7; // L: 177
		this.offset = var5 + var4; // L: 179
	} // L: 180

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "9"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) { // L: 183
			this.array[++this.offset - 1] = var1[var4];
		}

	} // L: 184

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Lur;B)V",
		garbageValue = "50"
	)
	public void method9259(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset); // L: 187
	} // L: 188

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1634916844"
	)
	@Export("writeLengthInt")
	public void writeLengthInt(int var1) {
		if (var1 < 0) { // L: 191
			throw new IllegalArgumentException(); // L: 192
		} else {
			this.array[this.offset - var1 - 4] = (byte)(var1 >> 24); // L: 194
			this.array[this.offset - var1 - 3] = (byte)(var1 >> 16); // L: 195
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 196
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 197
		}
	} // L: 198

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-324124658"
	)
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) { // L: 201
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 204
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 205
		} else {
			throw new IllegalArgumentException(); // L: 202
		}
	} // L: 206

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1533055491"
	)
	public void method9262(int var1) {
		if (var1 >= 0 && var1 <= 255) { // L: 209
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 212
		} else {
			throw new IllegalArgumentException(); // L: 210
		}
	} // L: 213

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "779846303"
	)
	@Export("writeSmartByteShort")
	public void writeSmartByteShort(int var1) {
		if (var1 >= 0 && var1 < 128) { // L: 216
			this.writeByte(var1); // L: 217
		} else if (var1 >= 0 && var1 < 32768) { // L: 220
			this.writeShort(var1 + 32768); // L: 221
		} else {
			throw new IllegalArgumentException(); // L: 224
		}
	} // L: 218 222

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-86"
	)
	@Export("writeVarInt")
	public void writeVarInt(int var1) {
		if ((var1 & -128) != 0) { // L: 228
			if ((var1 & -16384) != 0) { // L: 229
				if ((var1 & -2097152) != 0) { // L: 230
					if ((var1 & -268435456) != 0) { // L: 231
						this.writeByte(var1 >>> 28 | 128);
					}

					this.writeByte(var1 >>> 21 | 128); // L: 232
				}

				this.writeByte(var1 >>> 14 | 128); // L: 234
			}

			this.writeByte(var1 >>> 7 | 128); // L: 236
		}

		this.writeByte(var1 & 127); // L: 238
	} // L: 239

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1812114697"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255; // L: 242
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "1393193570"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1]; // L: 246
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "90"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2; // L: 250
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 251
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "13"
	)
	@Export("readShort")
	public int readShort() {
		this.offset += 2; // L: 255
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 256
		if (var1 > 32767) { // L: 257
			var1 -= 65536;
		}

		return var1; // L: 258
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1701207512"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3; // L: 262
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 263
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "956332492"
	)
	public int method9270() {
		this.offset += 3; // L: 267
		int var1 = ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 268
		if (var1 > 8388607) { // L: 269
			var1 -= 16777216;
		}

		return var1; // L: 270
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "6160"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 4; // L: 274
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24); // L: 275
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "712744371"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L; // L: 279
		long var3 = (long)this.readInt() & 4294967295L; // L: 280
		return var3 + (var1 << 32); // L: 281
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "1132261056"
	)
	public float method9273() {
		return Float.intBitsToFloat(this.readInt()); // L: 285
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "356435715"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1; // L: 289
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "98"
	)
	@Export("readStringCp1252NullTerminatedOrNull")
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset] == 0) { // L: 293
			++this.offset; // L: 294
			return null; // L: 295
		} else {
			return this.readStringCp1252NullTerminated(); // L: 297
		}
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-949897900"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset; // L: 301

		while (this.array[++this.offset - 1] != 0) { // L: 302
		}

		int var2 = this.offset - var1 - 1; // L: 303
		return var2 == 0 ? "" : Tiles.decodeStringCp1252(this.array, var1, var2); // L: 304 305
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2042878323"
	)
	@Export("readStringCp1252NullCircumfixed")
	public String readStringCp1252NullCircumfixed() {
		byte var1 = this.array[++this.offset - 1]; // L: 309
		if (var1 != 0) { // L: 310
			throw new IllegalStateException("");
		} else {
			int var2 = this.offset; // L: 311

			while (this.array[++this.offset - 1] != 0) { // L: 312
			}

			int var3 = this.offset - var2 - 1; // L: 313
			return var3 == 0 ? "" : Tiles.decodeStringCp1252(this.array, var2, var3); // L: 314 315
		}
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1936604908"
	)
	@Export("readCESU8")
	public String readCESU8() {
		byte var1 = this.array[++this.offset - 1]; // L: 319
		if (var1 != 0) { // L: 320
			throw new IllegalStateException("");
		} else {
			int var2 = this.readVarInt(); // L: 321
			if (var2 + this.offset > this.array.length) {
				throw new IllegalStateException(""); // L: 322
			} else {
				String var3 = class343.method6312(this.array, this.offset, var2); // L: 323
				this.offset += var2; // L: 324
				return var3; // L: 325
			}
		}
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "106"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1]; // L: 329
		}

	} // L: 330

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-931153389"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 333
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152; // L: 334 335
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "596626017"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 339
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768; // L: 340 341
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-172449094"
	)
	public int method9282() {
		int var1 = this.array[this.offset] & 255; // L: 345
		return var1 < 128 ? this.readUnsignedByte() - 1 : this.readUnsignedShort() - 32769; // L: 346 347
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2128089551"
	)
	public int method9283() {
		int var1 = 0; // L: 351

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) { // L: 352 353 355
			var1 += 32767; // L: 354
		}

		var1 += var2; // L: 357
		return var1; // L: 358
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-35"
	)
	public int method9483() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort(); // L: 362 363
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2011983545"
	)
	public int method9436() {
		if (this.array[this.offset] < 0) { // L: 367
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort(); // L: 368
			return var1 == 32767 ? -1 : var1; // L: 369
		}
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1958984581"
	)
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[++this.offset - 1]; // L: 374

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) { // L: 375 376 378
			var2 = (var2 | var1 & 127) << 7; // L: 377
		}

		return var2 | var1; // L: 380
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1964008996"
	)
	public int method9271() {
		int var2 = 0; // L: 385
		int var3 = 0; // L: 386

		int var1;
		do {
			var1 = this.readUnsignedByte(); // L: 388
			var2 |= (var1 & 127) << var3; // L: 389
			var3 += 7; // L: 390
		} while(var1 > 127); // L: 391

		return var2; // L: 392
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "1368845870"
	)
	@Export("xteaEncryptAll")
	public void xteaEncryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 396
		this.offset = 0; // L: 397

		for (int var3 = 0; var3 < var2; ++var3) { // L: 398
			int var4 = this.readInt(); // L: 399
			int var5 = this.readInt(); // L: 400
			int var6 = 0; // L: 401
			int var7 = -1640531527; // L: 402

			for (int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) { // L: 403 404 407
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]; // L: 405
				var6 += var7; // L: 406
			}

			this.offset -= 8; // L: 409
			this.writeIntME(var4); // L: 410
			this.writeIntME(var5); // L: 411
		}

	} // L: 413

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "1350184018"
	)
	@Export("xteaDecryptAll")
	public void xteaDecryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 416
		this.offset = 0; // L: 417

		for (int var3 = 0; var3 < var2; ++var3) { // L: 418
			int var4 = this.readInt(); // L: 419
			int var5 = this.readInt(); // L: 420
			int var6 = -957401312; // L: 421
			int var7 = -1640531527; // L: 422

			for (int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) { // L: 423 424 427
				var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6; // L: 425
				var6 -= var7; // L: 426
			}

			this.offset -= 8; // L: 429
			this.writeIntME(var4); // L: 430
			this.writeIntME(var5); // L: 431
		}

	} // L: 433

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "([IIIB)V",
		garbageValue = "52"
	)
	@Export("xteaEncrypt")
	public void xteaEncrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 436
		this.offset = var2; // L: 437
		int var5 = (var3 - var2) / 8; // L: 438

		for (int var6 = 0; var6 < var5; ++var6) { // L: 439
			int var7 = this.readInt(); // L: 440
			int var8 = this.readInt(); // L: 441
			int var9 = 0; // L: 442
			int var10 = -1640531527; // L: 443

			for (int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) { // L: 444 445 448
				var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]; // L: 446
				var9 += var10; // L: 447
			}

			this.offset -= 8; // L: 450
			this.writeIntME(var7); // L: 451
			this.writeIntME(var8); // L: 452
		}

		this.offset = var4; // L: 454
	} // L: 455

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "([IIIB)V",
		garbageValue = "-37"
	)
	@Export("xteaDecrypt")
	public void xteaDecrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 458
		this.offset = var2; // L: 459
		int var5 = (var3 - var2) / 8; // L: 460

		for (int var6 = 0; var6 < var5; ++var6) { // L: 461
			int var7 = this.readInt(); // L: 462
			int var8 = this.readInt(); // L: 463
			int var9 = -957401312; // L: 464
			int var10 = -1640531527; // L: 465

			for (int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) { // L: 466 467 470
				var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9; // L: 468
				var9 -= var10; // L: 469
			}

			this.offset -= 8; // L: 472
			this.writeIntME(var7); // L: 473
			this.writeIntME(var8); // L: 474
		}

		this.offset = var4; // L: 476
	} // L: 477

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
		garbageValue = "70095916"
	)
	@Export("encryptRsa")
	public void encryptRsa(BigInteger var1, BigInteger var2) {
		int var3 = this.offset; // L: 480
		this.offset = 0; // L: 481
		byte[] var4 = new byte[var3]; // L: 482
		this.readBytes(var4, 0, var3); // L: 483
		BigInteger var5 = new BigInteger(var4); // L: 484
		BigInteger var6 = var5.modPow(var1, var2); // L: 485
		byte[] var7 = var6.toByteArray(); // L: 486
		this.offset = 0; // L: 487
		this.writeShort(var7.length); // L: 488
		this.writeBytes(var7, 0, var7.length); // L: 489
	} // L: 490

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-441533266"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		int var2 = class132.method3058(this.array, var1, this.offset); // L: 493
		this.writeIntME(var2); // L: 494
		return var2; // L: 495
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1689812843"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4; // L: 499
		int var1 = class132.method3058(this.array, 0, this.offset); // L: 500
		int var2 = this.readInt(); // L: 501
		return var1 == var2; // L: 502
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	public void method9295(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 507
	} // L: 508

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "772196385"
	)
	public void method9296(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1); // L: 511
	} // L: 512

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-62"
	)
	public void method9297(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1); // L: 515
	} // L: 516

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-803758123"
	)
	public int method9298() {
		return this.array[++this.offset - 1] - 128 & 255; // L: 519
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1584518704"
	)
	public int method9462() {
		return 0 - this.array[++this.offset - 1] & 255; // L: 523
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-51"
	)
	public int method9300() {
		return 128 - this.array[++this.offset - 1] & 255; // L: 527
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "62"
	)
	public byte method9301() {
		return (byte)(this.array[++this.offset - 1] - 128); // L: 531
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "861243659"
	)
	public byte method9302() {
		return (byte)(0 - this.array[++this.offset - 1]); // L: 535
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "12"
	)
	public byte method9316() {
		return (byte)(128 - this.array[++this.offset - 1]); // L: 539
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-930207786"
	)
	public void method9398(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 543
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 544
	} // L: 545

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "115"
	)
	public void method9304(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 548
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 549
	} // L: 550

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "61"
	)
	public void method9246(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 553
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 554
	} // L: 555

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-316760443"
	)
	public int method9380() {
		this.offset += 2; // L: 558
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 559
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1893434427"
	)
	public int method9321() {
		this.offset += 2; // L: 563
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 564
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "562220445"
	)
	public int method9318() {
		this.offset += 2; // L: 568
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 569
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	public int method9307() {
		this.offset += 2; // L: 573
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 574
		if (var1 > 32767) { // L: 575
			var1 -= 65536;
		}

		return var1; // L: 576
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2132076116"
	)
	public int method9308() {
		this.offset += 2; // L: 580
		int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 581
		if (var1 > 32767) { // L: 582
			var1 -= 65536;
		}

		return var1; // L: 583
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1583197503"
	)
	public int method9309() {
		this.offset += 2; // L: 587
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 588
		if (var1 > 32767) { // L: 589
			var1 -= 65536;
		}

		return var1; // L: 590
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1943735493"
	)
	public int method9458() {
		this.offset += 3; // L: 594
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 2] & 255); // L: 595
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	public int method9311() {
		this.offset += 3; // L: 599
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16); // L: 600
	}

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "703139505"
	)
	public int method9312() {
		this.offset += 3; // L: 604
		int var1 = (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16); // L: 605
		if (var1 > 8388607) { // L: 606
			var1 -= 16777216;
		}

		return var1; // L: 607
	}

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "4"
	)
	public int method9313() {
		this.offset += 3; // L: 611
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 2] & 255); // L: 612
		if (var1 > 8388607) { // L: 613
			var1 -= 16777216;
		}

		return var1; // L: 614
	}

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "82"
	)
	public void method9250(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 618
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 619
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 620
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 621
	} // L: 622

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-979115376"
	)
	public void method9407(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 625
		this.array[++this.offset - 1] = (byte)var1; // L: 626
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 627
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 628
	} // L: 629

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-109"
	)
	public void method9315(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 632
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 633
		this.array[++this.offset - 1] = (byte)var1; // L: 634
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 635
	} // L: 636

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2074151862"
	)
	public int method9317() {
		this.offset += 4; // L: 639
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24); // L: 640
	}

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1821872331"
	)
	public int method9514() {
		this.offset += 4; // L: 644
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16); // L: 645
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1746070934"
	)
	public int method9335() {
		this.offset += 4; // L: 649
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24); // L: 650
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1110149917"
	)
	public void method9320(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) { // L: 654
			var1[var4] = (byte)(this.array[++this.offset - 1] - 128);
		}

	} // L: 655
}
