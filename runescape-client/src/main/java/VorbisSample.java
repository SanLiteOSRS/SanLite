import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
@Implements("VorbisSample")
public class VorbisSample extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lcd;"
	)
	static class60 field374;
	@ObfuscatedName("ak")
	static int field386;
	@ObfuscatedName("ae")
	static int field394;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[Lcs;"
	)
	static VorbisCodebook[] field383;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lbw;"
	)
	static VorbisFloor[] field384;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[Lbm;"
	)
	static class46[] field385;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lbt;"
	)
	static VorbisMapping[] field404;
	@ObfuscatedName("ad")
	static boolean[] field387;
	@ObfuscatedName("ac")
	static int[] field388;
	@ObfuscatedName("ag")
	static boolean field389;
	@ObfuscatedName("aq")
	static float[] field395;
	@ObfuscatedName("aw")
	static float[] field396;
	@ObfuscatedName("ay")
	static float[] field397;
	@ObfuscatedName("al")
	static float[] field398;
	@ObfuscatedName("am")
	static float[] field390;
	@ObfuscatedName("bs")
	static float[] field401;
	@ObfuscatedName("bc")
	static int[] field381;
	@ObfuscatedName("bj")
	static int[] field402;
	@ObfuscatedName("at")
	byte[][] field375;
	@ObfuscatedName("an")
	@Export("sampleRate")
	int sampleRate;
	@ObfuscatedName("av")
	@Export("sampleCount")
	int sampleCount;
	@ObfuscatedName("as")
	@Export("start")
	int start;
	@ObfuscatedName("ax")
	@Export("end")
	int end;
	@ObfuscatedName("ap")
	boolean field379;
	@ObfuscatedName("ar")
	float[] field393;
	@ObfuscatedName("ah")
	int field391;
	@ObfuscatedName("az")
	int field380;
	@ObfuscatedName("au")
	boolean field376;
	@ObfuscatedName("ai")
	float[] field400;
	@ObfuscatedName("bo")
	@Export("samples")
	byte[] samples;
	@ObfuscatedName("bq")
	int field382;
	@ObfuscatedName("bg")
	int field405;

	static {
		field374 = new class60(); // L: 17
		field389 = false; // L: 26
	}

	VorbisSample(byte[] var1) {
		this.read(var1); // L: 380
	} // L: 381

	@ObfuscatedName("an")
	@Export("read")
	void read(byte[] var1) {
		Buffer var2 = new Buffer(var1); // L: 53
		this.sampleRate = var2.readInt(); // L: 54
		this.sampleCount = var2.readInt(); // L: 55
		this.start = var2.readInt(); // L: 56
		this.end = var2.readInt(); // L: 57
		if (this.end < 0) { // L: 58
			this.end = ~this.end; // L: 59
			this.field379 = true; // L: 60
		}

		int var3 = var2.readInt(); // L: 62
		this.field375 = new byte[var3][]; // L: 63

		for (int var4 = 0; var4 < var3; ++var4) { // L: 64
			int var5 = 0; // L: 65

			int var6;
			do {
				var6 = var2.readUnsignedByte(); // L: 67
				var5 += var6; // L: 68
			} while(var6 >= 255); // L: 69

			byte[] var7 = new byte[var5]; // L: 71
			var2.readBytes(var7, 0, var5); // L: 72
			this.field375[var4] = var7; // L: 73
		}

	} // L: 75

	@ObfuscatedName("as")
	float[] method1056(int var1) {
		class60 var2 = new class60(); // L: 162
		var2.method1136(this.field375[var1], 0); // L: 163
		this.field400 = new float[field394]; // L: 164
		var2.method1117(); // L: 165
		int var3 = var2.method1118(Tile.iLog(field388.length - 1)); // L: 166
		boolean var4 = field387[var3]; // L: 167
		int var5 = var4 ? field394 : field386; // L: 168
		boolean var6 = false; // L: 169
		boolean var7 = false; // L: 170
		if (var4) { // L: 171
			var6 = var2.method1117() != 0; // L: 172
			var7 = var2.method1117() != 0; // L: 173
		}

		int var8 = var5 >> 1; // L: 175
		int var9;
		int var10;
		int var11;
		if (var4 && !var6) { // L: 179
			var9 = (var5 >> 2) - (field386 >> 2); // L: 180
			var10 = (field386 >> 2) + (var5 >> 2); // L: 181
			var11 = field386 >> 1; // L: 182
		} else {
			var9 = 0; // L: 185
			var10 = var8; // L: 186
			var11 = var5 >> 1; // L: 187
		}

		int var12;
		int var13;
		int var14;
		if (var4 && !var7) { // L: 192
			var12 = var5 - (var5 >> 2) - (field386 >> 2); // L: 193
			var13 = (field386 >> 2) + (var5 - (var5 >> 2)); // L: 194
			var14 = field386 >> 1; // L: 195
		} else {
			var12 = var8; // L: 198
			var13 = var5; // L: 199
			var14 = var5 >> 1; // L: 200
		}

		VorbisMapping var15 = field404[field388[var3]]; // L: 202
		int var16 = var15.field357; // L: 203
		int var17 = var15.field358[var16]; // L: 204
		class59 var18 = field384[var17].method734(var2); // L: 205
		boolean var19 = !var18.method1110(); // L: 206

		int var20;
		for (var20 = 0; var20 < var15.field356; ++var20) { // L: 207
			class46 var45 = field385[var15.field359[var20]]; // L: 208
			float[] var47 = this.field400; // L: 209
			var45.method840(var47, var5 >> 1, var19, var2); // L: 210
		}

		if (var18.method1110()) { // L: 213
			var16 = var15.field357; // L: 214
			int var10000 = var15.field358[var16]; // L: 215
			var18.method1112(this.field400, var5 >> 1); // L: 216
		}

		int var21;
		int var22;
		if (!var18.method1110()) { // L: 219
			for (var20 = var5 >> 1; var20 < var5; ++var20) { // L: 220
				this.field400[var20] = 0.0F;
			}
		} else {
			var20 = var5 >> 1; // L: 223
			var21 = var5 >> 2; // L: 224
			var22 = var5 >> 3; // L: 225
			float[] var23 = this.field400; // L: 226

			int var24;
			for (var24 = 0; var24 < var20; ++var24) { // L: 227
				var23[var24] *= 0.5F;
			}

			for (var24 = var20; var24 < var5; ++var24) { // L: 228
				var23[var24] = -var23[var5 - var24 - 1];
			}

			float[] var43 = var4 ? field398 : field395; // L: 229
			float[] var25 = var4 ? field390 : field396; // L: 230
			float[] var26 = var4 ? field401 : field397; // L: 231
			int[] var27 = var4 ? field402 : field381; // L: 232

			int var28;
			float var29;
			float var30;
			float var31;
			float var32;
			for (var28 = 0; var28 < var21; ++var28) { // L: 233
				var29 = var23[var28 * 4] - var23[var5 - var28 * 4 - 1]; // L: 234
				var30 = var23[var28 * 4 + 2] - var23[var5 - var28 * 4 - 3]; // L: 235
				var31 = var43[var28 * 2]; // L: 236
				var32 = var43[var28 * 2 + 1]; // L: 237
				var23[var5 - var28 * 4 - 1] = var29 * var31 - var30 * var32; // L: 238
				var23[var5 - var28 * 4 - 3] = var29 * var32 + var30 * var31; // L: 239
			}

			float var33;
			float var34;
			for (var28 = 0; var28 < var22; ++var28) { // L: 241
				var29 = var23[var20 + var28 * 4 + 3]; // L: 242
				var30 = var23[var20 + var28 * 4 + 1]; // L: 243
				var31 = var23[var28 * 4 + 3]; // L: 244
				var32 = var23[var28 * 4 + 1]; // L: 245
				var23[var20 + var28 * 4 + 3] = var29 + var31; // L: 246
				var23[var20 + var28 * 4 + 1] = var30 + var32; // L: 247
				var33 = var43[var20 - 4 - var28 * 4]; // L: 248
				var34 = var43[var20 - 3 - var28 * 4]; // L: 249
				var23[var28 * 4 + 3] = (var29 - var31) * var33 - (var30 - var32) * var34; // L: 250
				var23[var28 * 4 + 1] = (var30 - var32) * var33 + (var29 - var31) * var34; // L: 251
			}

			var28 = Tile.iLog(var5 - 1); // L: 253

			int var48;
			int var49;
			int var50;
			int var51;
			for (var48 = 0; var48 < var28 - 3; ++var48) { // L: 254
				var49 = var5 >> var48 + 2; // L: 255
				var50 = 8 << var48; // L: 256

				for (var51 = 0; var51 < 2 << var48; ++var51) { // L: 257
					int var52 = var5 - var49 * var51 * 2; // L: 258
					int var53 = var5 - var49 * (var51 * 2 + 1); // L: 259

					for (int var35 = 0; var35 < var5 >> var48 + 4; ++var35) { // L: 260
						int var36 = var35 * 4; // L: 261
						float var37 = var23[var52 - 1 - var36]; // L: 262
						float var38 = var23[var52 - 3 - var36]; // L: 263
						float var39 = var23[var53 - 1 - var36]; // L: 264
						float var40 = var23[var53 - 3 - var36]; // L: 265
						var23[var52 - 1 - var36] = var37 + var39; // L: 266
						var23[var52 - 3 - var36] = var38 + var40; // L: 267
						float var41 = var43[var35 * var50]; // L: 268
						float var42 = var43[var35 * var50 + 1]; // L: 269
						var23[var53 - 1 - var36] = (var37 - var39) * var41 - (var38 - var40) * var42; // L: 270
						var23[var53 - 3 - var36] = (var38 - var40) * var41 + (var37 - var39) * var42; // L: 271
					}
				}
			}

			for (var48 = 1; var48 < var22 - 1; ++var48) { // L: 275
				var49 = var27[var48]; // L: 276
				if (var48 < var49) { // L: 277
					var50 = var48 * 8; // L: 278
					var51 = var49 * 8; // L: 279
					var33 = var23[var50 + 1]; // L: 281
					var23[var50 + 1] = var23[var51 + 1]; // L: 282
					var23[var51 + 1] = var33; // L: 283
					var33 = var23[var50 + 3]; // L: 284
					var23[var50 + 3] = var23[var51 + 3]; // L: 285
					var23[var51 + 3] = var33; // L: 286
					var33 = var23[var50 + 5]; // L: 287
					var23[var50 + 5] = var23[var51 + 5]; // L: 288
					var23[var51 + 5] = var33; // L: 289
					var33 = var23[var50 + 7]; // L: 290
					var23[var50 + 7] = var23[var51 + 7]; // L: 291
					var23[var51 + 7] = var33; // L: 292
				}
			}

			for (var48 = 0; var48 < var20; ++var48) { // L: 295
				var23[var48] = var23[var48 * 2 + 1];
			}

			for (var48 = 0; var48 < var22; ++var48) { // L: 296
				var23[var5 - 1 - var48 * 2] = var23[var48 * 4]; // L: 297
				var23[var5 - 2 - var48 * 2] = var23[var48 * 4 + 1]; // L: 298
				var23[var5 - var21 - 1 - var48 * 2] = var23[var48 * 4 + 2]; // L: 299
				var23[var5 - var21 - 2 - var48 * 2] = var23[var48 * 4 + 3]; // L: 300
			}

			for (var48 = 0; var48 < var22; ++var48) { // L: 302
				var30 = var26[var48 * 2]; // L: 303
				var31 = var26[var48 * 2 + 1]; // L: 304
				var32 = var23[var20 + var48 * 2]; // L: 305
				var33 = var23[var20 + var48 * 2 + 1]; // L: 306
				var34 = var23[var5 - 2 - var48 * 2]; // L: 307
				float var54 = var23[var5 - 1 - var48 * 2]; // L: 308
				float var55 = var31 * (var32 - var34) + var30 * (var33 + var54); // L: 309
				var23[var20 + var48 * 2] = (var32 + var34 + var55) * 0.5F; // L: 310
				var23[var5 - 2 - var48 * 2] = (var32 + var34 - var55) * 0.5F; // L: 311
				var55 = var31 * (var33 + var54) - var30 * (var32 - var34); // L: 312
				var23[var20 + var48 * 2 + 1] = (var33 - var54 + var55) * 0.5F; // L: 313
				var23[var5 - 1 - var48 * 2] = (-var33 + var54 + var55) * 0.5F; // L: 314
			}

			for (var48 = 0; var48 < var21; ++var48) { // L: 316
				var23[var48] = var23[var20 + var48 * 2] * var25[var48 * 2] + var23[var20 + var48 * 2 + 1] * var25[var48 * 2 + 1]; // L: 317
				var23[var20 - 1 - var48] = var23[var20 + var48 * 2] * var25[var48 * 2 + 1] - var23[var20 + var48 * 2 + 1] * var25[var48 * 2]; // L: 318
			}

			for (var48 = 0; var48 < var21; ++var48) { // L: 320
				var23[var48 + (var5 - var21)] = -var23[var48];
			}

			for (var48 = 0; var48 < var21; ++var48) { // L: 321
				var23[var48] = var23[var21 + var48];
			}

			for (var48 = 0; var48 < var21; ++var48) { // L: 322
				var23[var21 + var48] = -var23[var21 - var48 - 1];
			}

			for (var48 = 0; var48 < var21; ++var48) { // L: 323
				var23[var20 + var48] = var23[var5 - var48 - 1];
			}

			float[] var57;
			for (var48 = var9; var48 < var10; ++var48) { // L: 324
				var30 = (float)Math.sin(((double)(var48 - var9) + 0.5D) / (double)var11 * 0.5D * 3.141592653589793D); // L: 325
				var57 = this.field400; // L: 326
				var57[var48] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
			}

			for (var48 = var12; var48 < var13; ++var48) { // L: 328
				var30 = (float)Math.sin(((double)(var48 - var12) + 0.5D) / (double)var14 * 0.5D * 3.141592653589793D + 1.5707963267948966D); // L: 329
				var57 = this.field400; // L: 330
				var57[var48] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
			}
		}

		float[] var44 = null; // L: 333
		if (this.field391 > 0) { // L: 334
			var21 = var5 + this.field391 >> 2; // L: 335
			var44 = new float[var21]; // L: 336
			int var46;
			if (!this.field376) { // L: 337
				for (var22 = 0; var22 < this.field380; ++var22) { // L: 338
					var46 = var22 + (this.field391 >> 1); // L: 339
					var44[var22] += this.field393[var46]; // L: 340
				}
			}

			if (var18.method1110()) { // L: 343
				for (var22 = var9; var22 < var5 >> 1; ++var22) { // L: 344
					var46 = var44.length - (var5 >> 1) + var22; // L: 345
					var44[var46] += this.field400[var22]; // L: 346
				}
			}
		}

		float[] var56 = this.field393; // L: 350
		this.field393 = this.field400; // L: 351
		this.field400 = var56; // L: 352
		this.field391 = var5; // L: 353
		this.field380 = var13 - (var5 >> 1); // L: 354
		this.field376 = !var18.method1110(); // L: 355
		return var44; // L: 356
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([I)Lbp;"
	)
	@Export("toRawSound")
	RawSound toRawSound(int[] var1) {
		if (var1 != null && var1[0] <= 0) { // L: 384
			return null;
		} else {
			if (this.samples == null) { // L: 385
				this.field391 = 0; // L: 386
				this.field393 = new float[field394]; // L: 387
				this.samples = new byte[this.sampleCount]; // L: 388
				this.field382 = 0; // L: 389
				this.field405 = 0; // L: 390
			}

			for (; this.field405 < this.field375.length; ++this.field405) { // L: 392 407
				if (var1 != null && var1[0] <= 0) { // L: 393
					return null;
				}

				float[] var2 = this.method1056(this.field405); // L: 394
				if (var2 != null) { // L: 395
					int var3 = this.field382; // L: 396
					int var4 = var2.length; // L: 397
					if (var4 > this.sampleCount - var3) { // L: 398
						var4 = this.sampleCount - var3;
					}

					for (int var5 = 0; var5 < var4; ++var5) { // L: 399
						int var6 = (int)(128.0F + var2[var5] * 128.0F); // L: 400
						if ((var6 & -256) != 0) { // L: 401
							var6 = ~var6 >> 31;
						}

						this.samples[var3++] = (byte)(var6 - 128); // L: 402
					}

					if (var1 != null) { // L: 404
						var1[0] -= var3 - this.field382;
					}

					this.field382 = var3; // L: 405
				}
			}

			this.field393 = null; // L: 409
			byte[] var7 = this.samples; // L: 410
			this.samples = null; // L: 411
			return new RawSound(this.sampleRate, var7, this.start, this.end, this.field379); // L: 412
		}
	}

	@ObfuscatedName("at")
	@Export("float32Unpack")
	static float float32Unpack(int var0) {
		int var1 = var0 & 2097151; // L: 45
		int var2 = var0 & Integer.MIN_VALUE; // L: 46
		int var3 = (var0 & 2145386496) >> 21; // L: 47
		if (var2 != 0) { // L: 48
			var1 = -var1;
		}

		return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788))); // L: 49
	}

	@ObfuscatedName("av")
	static void method1055(byte[] var0) {
		class60 var1 = field374; // L: 78
		var1.method1136(var0, 0); // L: 79
		field386 = 1 << var1.method1118(4); // L: 80
		field394 = 1 << var1.method1118(4); // L: 81

		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		for (var2 = 0; var2 < 2; ++var2) { // L: 82
			var3 = var2 != 0 ? field394 : field386; // L: 83
			var4 = var3 >> 1; // L: 84
			var5 = var3 >> 2; // L: 85
			var6 = var3 >> 3; // L: 86
			float[] var19 = new float[var4]; // L: 87

			for (int var8 = 0; var8 < var5; ++var8) { // L: 88
				var19[var8 * 2] = (float)Math.cos((double)(var8 * 4) * 3.141592653589793D / (double)var3); // L: 89
				var19[var8 * 2 + 1] = -((float)Math.sin((double)(var8 * 4) * 3.141592653589793D / (double)var3)); // L: 90
			}

			float[] var20 = new float[var4]; // L: 92

			for (int var9 = 0; var9 < var5; ++var9) { // L: 93
				var20[var9 * 2] = (float)Math.cos((double)(var9 * 2 + 1) * 3.141592653589793D / (double)(var3 * 2)); // L: 94
				var20[var9 * 2 + 1] = (float)Math.sin((double)(var9 * 2 + 1) * 3.141592653589793D / (double)(var3 * 2)); // L: 95
			}

			float[] var21 = new float[var5]; // L: 97

			for (int var10 = 0; var10 < var6; ++var10) { // L: 98
				var21[var10 * 2] = (float)Math.cos((double)(var10 * 4 + 2) * 3.141592653589793D / (double)var3); // L: 99
				var21[var10 * 2 + 1] = -((float)Math.sin((double)(var10 * 4 + 2) * 3.141592653589793D / (double)var3)); // L: 100
			}

			int[] var22 = new int[var6]; // L: 102
			int var11 = Tile.iLog(var6 - 1); // L: 103

			for (int var12 = 0; var12 < var6; ++var12) { // L: 104
				int var16 = var12; // L: 108
				int var17 = var11; // L: 109

				int var18;
				for (var18 = 0; var17 > 0; --var17) { // L: 111 112 115
					var18 = var18 << 1 | var16 & 1; // L: 113
					var16 >>>= 1; // L: 114
				}

				var22[var12] = var18; // L: 119
			}

			if (var2 != 0) { // L: 121
				field398 = var19; // L: 122
				field390 = var20; // L: 123
				field401 = var21; // L: 124
				field402 = var22; // L: 125
			} else {
				field395 = var19; // L: 128
				field396 = var20; // L: 129
				field397 = var21; // L: 130
				field381 = var22; // L: 131
			}
		}

		var2 = var1.method1118(8) + 1; // L: 134
		field383 = new VorbisCodebook[var2]; // L: 135

		for (var3 = 0; var3 < var2; ++var3) { // L: 136
			field383[var3] = new VorbisCodebook();
		}

		var3 = var1.method1118(6) + 1; // L: 138

		for (var4 = 0; var4 < var3; ++var4) { // L: 139
			var1.method1118(16);
		}

		var3 = var1.method1118(6) + 1; // L: 141
		field384 = new VorbisFloor[var3]; // L: 142

		for (var4 = 0; var4 < var3; ++var4) { // L: 143
			field384[var4] = new VorbisFloor();
		}

		var4 = var1.method1118(6) + 1; // L: 144
		field385 = new class46[var4]; // L: 145

		for (var5 = 0; var5 < var4; ++var5) { // L: 146
			field385[var5] = new class46();
		}

		var5 = var1.method1118(6) + 1; // L: 147
		field404 = new VorbisMapping[var5]; // L: 148

		for (var6 = 0; var6 < var5; ++var6) { // L: 149
			field404[var6] = new VorbisMapping();
		}

		var6 = var1.method1118(6) + 1; // L: 150
		field387 = new boolean[var6]; // L: 151
		field388 = new int[var6]; // L: 152

		for (int var7 = 0; var7 < var6; ++var7) { // L: 153
			field387[var7] = var1.method1117() != 0; // L: 154
			var1.method1118(16); // L: 155
			var1.method1118(16); // L: 156
			field388[var7] = var1.method1118(8); // L: 157
		}

	} // L: 159

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lnq;)Z"
	)
	static boolean method1057(AbstractArchive var0) {
		if (!field389) { // L: 360
			byte[] var1 = var0.takeFile(0, 0); // L: 361
			if (var1 == null) { // L: 362
				return false;
			}

			method1055(var1); // L: 363
			field389 = true; // L: 364
		}

		return true; // L: 366
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lnq;II)Lca;"
	)
	@Export("readMusicSample")
	static VorbisSample readMusicSample(AbstractArchive var0, int var1, int var2) {
		if (!method1057(var0)) { // L: 370
			var0.tryLoadFile(var1, var2); // L: 371
			return null; // L: 372
		} else {
			byte[] var3 = var0.takeFile(var1, var2); // L: 374
			return var3 == null ? null : new VorbisSample(var3); // L: 375
		}
	}
}
