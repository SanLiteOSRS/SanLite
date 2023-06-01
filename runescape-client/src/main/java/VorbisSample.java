import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
@Implements("VorbisSample")
public class VorbisSample extends Node {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lck;"
	)
	static class60 field354;
	@ObfuscatedName("aj")
	static int field361;
	@ObfuscatedName("ac")
	static int field365;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Lcb;"
	)
	static VorbisCodebook[] field363;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Lbf;"
	)
	static VorbisFloor[] field364;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lby;"
	)
	static class46[] field368;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lbj;"
	)
	static VorbisMapping[] field376;
	@ObfuscatedName("ah")
	static boolean[] field367;
	@ObfuscatedName("ap")
	static int[] field356;
	@ObfuscatedName("as")
	static boolean field369;
	@ObfuscatedName("az")
	static float[] field366;
	@ObfuscatedName("ak")
	static float[] field377;
	@ObfuscatedName("aa")
	static float[] field371;
	@ObfuscatedName("au")
	static float[] field378;
	@ObfuscatedName("ai")
	static float[] field379;
	@ObfuscatedName("bp")
	static float[] field380;
	@ObfuscatedName("bw")
	static int[] field381;
	@ObfuscatedName("bq")
	static int[] field382;
	@ObfuscatedName("ay")
	byte[][] field374;
	@ObfuscatedName("an")
	@Export("sampleRate")
	int sampleRate;
	@ObfuscatedName("ar")
	@Export("sampleCount")
	int sampleCount;
	@ObfuscatedName("ab")
	@Export("start")
	int start;
	@ObfuscatedName("at")
	@Export("end")
	int end;
	@ObfuscatedName("ax")
	boolean field359;
	@ObfuscatedName("am")
	float[] field370;
	@ObfuscatedName("ao")
	int field362;
	@ObfuscatedName("af")
	int field372;
	@ObfuscatedName("av")
	boolean field375;
	@ObfuscatedName("aq")
	float[] field373;
	@ObfuscatedName("bi")
	@Export("samples")
	byte[] samples;
	@ObfuscatedName("bg")
	int field384;
	@ObfuscatedName("bh")
	int field385;

	static {
		field354 = new class60(); // L: 17
		field369 = false; // L: 26
	}

	VorbisSample(byte[] var1) {
		this.read(var1); // L: 364
	} // L: 365

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
			this.field359 = true; // L: 60
		}

		int var3 = var2.readInt(); // L: 62
		this.field374 = new byte[var3][]; // L: 63

		for (int var4 = 0; var4 < var3; ++var4) { // L: 64
			int var5 = 0; // L: 65

			int var6;
			do {
				var6 = var2.readUnsignedByte(); // L: 67
				var5 += var6; // L: 68
			} while(var6 >= 255); // L: 69

			byte[] var7 = new byte[var5]; // L: 71
			var2.readBytes(var7, 0, var5); // L: 72
			this.field374[var4] = var7; // L: 73
		}

	} // L: 75

	@ObfuscatedName("ab")
	float[] method1068(int var1) {
		class60 var2 = new class60(); // L: 146
		var2.method1143(this.field374[var1], 0); // L: 147
		this.field373 = new float[field365]; // L: 148
		var2.method1145(); // L: 149
		int var3 = var2.method1141(Friend.iLog(field356.length - 1)); // L: 150
		boolean var4 = field367[var3]; // L: 151
		int var5 = var4 ? field365 : field361; // L: 152
		boolean var6 = false; // L: 153
		boolean var7 = false; // L: 154
		if (var4) { // L: 155
			var6 = var2.method1145() != 0; // L: 156
			var7 = var2.method1145() != 0; // L: 157
		}

		int var8 = var5 >> 1; // L: 159
		int var9;
		int var10;
		int var11;
		if (var4 && !var6) { // L: 163
			var9 = (var5 >> 2) - (field361 >> 2); // L: 164
			var10 = (field361 >> 2) + (var5 >> 2); // L: 165
			var11 = field361 >> 1; // L: 166
		} else {
			var9 = 0; // L: 169
			var10 = var8; // L: 170
			var11 = var5 >> 1; // L: 171
		}

		int var12;
		int var13;
		int var14;
		if (var4 && !var7) { // L: 176
			var12 = var5 - (var5 >> 2) - (field361 >> 2); // L: 177
			var13 = (field361 >> 2) + (var5 - (var5 >> 2)); // L: 178
			var14 = field361 >> 1; // L: 179
		} else {
			var12 = var8; // L: 182
			var13 = var5; // L: 183
			var14 = var5 >> 1; // L: 184
		}

		VorbisMapping var15 = field376[field356[var3]]; // L: 186
		int var16 = var15.field344; // L: 187
		int var17 = var15.field341[var16]; // L: 188
		class59 var18 = field364[var17].method753(var2); // L: 189
		boolean var19 = !var18.method1128(); // L: 190

		int var20;
		for (var20 = 0; var20 < var15.field342; ++var20) { // L: 191
			class46 var45 = field368[var15.field343[var20]]; // L: 192
			float[] var47 = this.field373; // L: 193
			var45.method864(var47, var5 >> 1, var19, var2); // L: 194
		}

		if (var18.method1128()) { // L: 197
			var16 = var15.field344; // L: 198
			int var10000 = var15.field341[var16]; // L: 199
			var18.method1127(this.field373, var5 >> 1); // L: 200
		}

		int var21;
		int var22;
		if (!var18.method1128()) { // L: 203
			for (var20 = var5 >> 1; var20 < var5; ++var20) { // L: 204
				this.field373[var20] = 0.0F;
			}
		} else {
			var20 = var5 >> 1; // L: 207
			var21 = var5 >> 2; // L: 208
			var22 = var5 >> 3; // L: 209
			float[] var23 = this.field373; // L: 210

			int var24;
			for (var24 = 0; var24 < var20; ++var24) { // L: 211
				var23[var24] *= 0.5F;
			}

			for (var24 = var20; var24 < var5; ++var24) { // L: 212
				var23[var24] = -var23[var5 - var24 - 1];
			}

			float[] var43 = var4 ? field378 : field366; // L: 213
			float[] var25 = var4 ? field379 : field377; // L: 214
			float[] var26 = var4 ? field380 : field371; // L: 215
			int[] var27 = var4 ? field382 : field381; // L: 216

			int var28;
			float var29;
			float var30;
			float var31;
			float var32;
			for (var28 = 0; var28 < var21; ++var28) { // L: 217
				var29 = var23[var28 * 4] - var23[var5 - var28 * 4 - 1]; // L: 218
				var30 = var23[var28 * 4 + 2] - var23[var5 - var28 * 4 - 3]; // L: 219
				var31 = var43[var28 * 2]; // L: 220
				var32 = var43[var28 * 2 + 1]; // L: 221
				var23[var5 - var28 * 4 - 1] = var29 * var31 - var30 * var32; // L: 222
				var23[var5 - var28 * 4 - 3] = var29 * var32 + var30 * var31; // L: 223
			}

			float var33;
			float var34;
			for (var28 = 0; var28 < var22; ++var28) { // L: 225
				var29 = var23[var20 + var28 * 4 + 3]; // L: 226
				var30 = var23[var20 + var28 * 4 + 1]; // L: 227
				var31 = var23[var28 * 4 + 3]; // L: 228
				var32 = var23[var28 * 4 + 1]; // L: 229
				var23[var20 + var28 * 4 + 3] = var29 + var31; // L: 230
				var23[var20 + var28 * 4 + 1] = var30 + var32; // L: 231
				var33 = var43[var20 - 4 - var28 * 4]; // L: 232
				var34 = var43[var20 - 3 - var28 * 4]; // L: 233
				var23[var28 * 4 + 3] = (var29 - var31) * var33 - (var30 - var32) * var34; // L: 234
				var23[var28 * 4 + 1] = (var30 - var32) * var33 + (var29 - var31) * var34; // L: 235
			}

			var28 = Friend.iLog(var5 - 1); // L: 237

			int var48;
			int var49;
			int var50;
			int var51;
			for (var48 = 0; var48 < var28 - 3; ++var48) { // L: 238
				var49 = var5 >> var48 + 2; // L: 239
				var50 = 8 << var48; // L: 240

				for (var51 = 0; var51 < 2 << var48; ++var51) { // L: 241
					int var52 = var5 - var49 * var51 * 2; // L: 242
					int var53 = var5 - var49 * (var51 * 2 + 1); // L: 243

					for (int var35 = 0; var35 < var5 >> var48 + 4; ++var35) { // L: 244
						int var36 = var35 * 4; // L: 245
						float var37 = var23[var52 - 1 - var36]; // L: 246
						float var38 = var23[var52 - 3 - var36]; // L: 247
						float var39 = var23[var53 - 1 - var36]; // L: 248
						float var40 = var23[var53 - 3 - var36]; // L: 249
						var23[var52 - 1 - var36] = var37 + var39; // L: 250
						var23[var52 - 3 - var36] = var38 + var40; // L: 251
						float var41 = var43[var35 * var50]; // L: 252
						float var42 = var43[var35 * var50 + 1]; // L: 253
						var23[var53 - 1 - var36] = (var37 - var39) * var41 - (var38 - var40) * var42; // L: 254
						var23[var53 - 3 - var36] = (var38 - var40) * var41 + (var37 - var39) * var42; // L: 255
					}
				}
			}

			for (var48 = 1; var48 < var22 - 1; ++var48) { // L: 259
				var49 = var27[var48]; // L: 260
				if (var48 < var49) { // L: 261
					var50 = var48 * 8; // L: 262
					var51 = var49 * 8; // L: 263
					var33 = var23[var50 + 1]; // L: 265
					var23[var50 + 1] = var23[var51 + 1]; // L: 266
					var23[var51 + 1] = var33; // L: 267
					var33 = var23[var50 + 3]; // L: 268
					var23[var50 + 3] = var23[var51 + 3]; // L: 269
					var23[var51 + 3] = var33; // L: 270
					var33 = var23[var50 + 5]; // L: 271
					var23[var50 + 5] = var23[var51 + 5]; // L: 272
					var23[var51 + 5] = var33; // L: 273
					var33 = var23[var50 + 7]; // L: 274
					var23[var50 + 7] = var23[var51 + 7]; // L: 275
					var23[var51 + 7] = var33; // L: 276
				}
			}

			for (var48 = 0; var48 < var20; ++var48) { // L: 279
				var23[var48] = var23[var48 * 2 + 1];
			}

			for (var48 = 0; var48 < var22; ++var48) { // L: 280
				var23[var5 - 1 - var48 * 2] = var23[var48 * 4]; // L: 281
				var23[var5 - 2 - var48 * 2] = var23[var48 * 4 + 1]; // L: 282
				var23[var5 - var21 - 1 - var48 * 2] = var23[var48 * 4 + 2]; // L: 283
				var23[var5 - var21 - 2 - var48 * 2] = var23[var48 * 4 + 3]; // L: 284
			}

			for (var48 = 0; var48 < var22; ++var48) { // L: 286
				var30 = var26[var48 * 2]; // L: 287
				var31 = var26[var48 * 2 + 1]; // L: 288
				var32 = var23[var20 + var48 * 2]; // L: 289
				var33 = var23[var20 + var48 * 2 + 1]; // L: 290
				var34 = var23[var5 - 2 - var48 * 2]; // L: 291
				float var54 = var23[var5 - 1 - var48 * 2]; // L: 292
				float var55 = var31 * (var32 - var34) + var30 * (var33 + var54); // L: 293
				var23[var20 + var48 * 2] = (var32 + var34 + var55) * 0.5F; // L: 294
				var23[var5 - 2 - var48 * 2] = (var32 + var34 - var55) * 0.5F; // L: 295
				var55 = var31 * (var33 + var54) - var30 * (var32 - var34); // L: 296
				var23[var20 + var48 * 2 + 1] = (var33 - var54 + var55) * 0.5F; // L: 297
				var23[var5 - 1 - var48 * 2] = (-var33 + var54 + var55) * 0.5F; // L: 298
			}

			for (var48 = 0; var48 < var21; ++var48) { // L: 300
				var23[var48] = var23[var20 + var48 * 2] * var25[var48 * 2] + var23[var20 + var48 * 2 + 1] * var25[var48 * 2 + 1]; // L: 301
				var23[var20 - 1 - var48] = var23[var20 + var48 * 2] * var25[var48 * 2 + 1] - var23[var20 + var48 * 2 + 1] * var25[var48 * 2]; // L: 302
			}

			for (var48 = 0; var48 < var21; ++var48) { // L: 304
				var23[var48 + (var5 - var21)] = -var23[var48];
			}

			for (var48 = 0; var48 < var21; ++var48) { // L: 305
				var23[var48] = var23[var21 + var48];
			}

			for (var48 = 0; var48 < var21; ++var48) { // L: 306
				var23[var21 + var48] = -var23[var21 - var48 - 1];
			}

			for (var48 = 0; var48 < var21; ++var48) { // L: 307
				var23[var20 + var48] = var23[var5 - var48 - 1];
			}

			float[] var57;
			for (var48 = var9; var48 < var10; ++var48) { // L: 308
				var30 = (float)Math.sin(((double)(var48 - var9) + 0.5D) / (double)var11 * 0.5D * 3.141592653589793D); // L: 309
				var57 = this.field373; // L: 310
				var57[var48] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
			}

			for (var48 = var12; var48 < var13; ++var48) { // L: 312
				var30 = (float)Math.sin(((double)(var48 - var12) + 0.5D) / (double)var14 * 0.5D * 3.141592653589793D + 1.5707963267948966D); // L: 313
				var57 = this.field373; // L: 314
				var57[var48] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
			}
		}

		float[] var44 = null; // L: 317
		if (this.field362 > 0) { // L: 318
			var21 = var5 + this.field362 >> 2; // L: 319
			var44 = new float[var21]; // L: 320
			int var46;
			if (!this.field375) { // L: 321
				for (var22 = 0; var22 < this.field372; ++var22) { // L: 322
					var46 = var22 + (this.field362 >> 1); // L: 323
					var44[var22] += this.field370[var46]; // L: 324
				}
			}

			if (var18.method1128()) { // L: 327
				for (var22 = var9; var22 < var5 >> 1; ++var22) { // L: 328
					var46 = var44.length - (var5 >> 1) + var22; // L: 329
					var44[var46] += this.field373[var22]; // L: 330
				}
			}
		}

		float[] var56 = this.field370; // L: 334
		this.field370 = this.field373; // L: 335
		this.field373 = var56; // L: 336
		this.field362 = var5; // L: 337
		this.field372 = var13 - (var5 >> 1); // L: 338
		this.field375 = !var18.method1128(); // L: 339
		return var44; // L: 340
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([I)Lbm;"
	)
	@Export("toRawSound")
	RawSound toRawSound(int[] var1) {
		if (var1 != null && var1[0] <= 0) { // L: 368
			return null;
		} else {
			if (this.samples == null) { // L: 369
				this.field362 = 0; // L: 370
				this.field370 = new float[field365]; // L: 371
				this.samples = new byte[this.sampleCount]; // L: 372
				this.field384 = 0; // L: 373
				this.field385 = 0; // L: 374
			}

			for (; this.field385 < this.field374.length; ++this.field385) { // L: 376 391
				if (var1 != null && var1[0] <= 0) { // L: 377
					return null;
				}

				float[] var2 = this.method1068(this.field385); // L: 378
				if (var2 != null) { // L: 379
					int var3 = this.field384; // L: 380
					int var4 = var2.length; // L: 381
					if (var4 > this.sampleCount - var3) { // L: 382
						var4 = this.sampleCount - var3;
					}

					for (int var5 = 0; var5 < var4; ++var5) { // L: 383
						int var6 = (int)(128.0F + var2[var5] * 128.0F); // L: 384
						if ((var6 & -256) != 0) { // L: 385
							var6 = ~var6 >> 31;
						}

						this.samples[var3++] = (byte)(var6 - 128); // L: 386
					}

					if (var1 != null) { // L: 388
						var1[0] -= var3 - this.field384;
					}

					this.field384 = var3; // L: 389
				}
			}

			this.field370 = null; // L: 393
			byte[] var7 = this.samples; // L: 394
			this.samples = null; // L: 395
			return new RawSound(this.sampleRate, var7, this.start, this.end, this.field359); // L: 396
		}
	}

	@ObfuscatedName("ay")
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

	@ObfuscatedName("ar")
	static void method1070(byte[] var0) {
		class60 var1 = field354; // L: 78
		var1.method1143(var0, 0); // L: 79
		field361 = 1 << var1.method1141(4); // L: 80
		field365 = 1 << var1.method1141(4); // L: 81

		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		for (var2 = 0; var2 < 2; ++var2) { // L: 82
			var3 = var2 != 0 ? field365 : field361; // L: 83
			var4 = var3 >> 1; // L: 84
			var5 = var3 >> 2; // L: 85
			var6 = var3 >> 3; // L: 86
			float[] var13 = new float[var4]; // L: 87

			for (int var8 = 0; var8 < var5; ++var8) { // L: 88
				var13[var8 * 2] = (float)Math.cos((double)(var8 * 4) * 3.141592653589793D / (double)var3); // L: 89
				var13[var8 * 2 + 1] = -((float)Math.sin((double)(var8 * 4) * 3.141592653589793D / (double)var3)); // L: 90
			}

			float[] var14 = new float[var4]; // L: 92

			for (int var9 = 0; var9 < var5; ++var9) { // L: 93
				var14[var9 * 2] = (float)Math.cos((double)(var9 * 2 + 1) * 3.141592653589793D / (double)(var3 * 2)); // L: 94
				var14[var9 * 2 + 1] = (float)Math.sin((double)(var9 * 2 + 1) * 3.141592653589793D / (double)(var3 * 2)); // L: 95
			}

			float[] var15 = new float[var5]; // L: 97

			for (int var10 = 0; var10 < var6; ++var10) { // L: 98
				var15[var10 * 2] = (float)Math.cos((double)(var10 * 4 + 2) * 3.141592653589793D / (double)var3); // L: 99
				var15[var10 * 2 + 1] = -((float)Math.sin((double)(var10 * 4 + 2) * 3.141592653589793D / (double)var3)); // L: 100
			}

			int[] var16 = new int[var6]; // L: 102
			int var11 = Friend.iLog(var6 - 1); // L: 103

			for (int var12 = 0; var12 < var6; ++var12) { // L: 104
				var16[var12] = ModelData0.method5006(var12, var11);
			}

			if (var2 != 0) { // L: 105
				field378 = var13; // L: 106
				field379 = var14; // L: 107
				field380 = var15; // L: 108
				field382 = var16; // L: 109
			} else {
				field366 = var13; // L: 112
				field377 = var14; // L: 113
				field371 = var15; // L: 114
				field381 = var16; // L: 115
			}
		}

		var2 = var1.method1141(8) + 1; // L: 118
		field363 = new VorbisCodebook[var2]; // L: 119

		for (var3 = 0; var3 < var2; ++var3) { // L: 120
			field363[var3] = new VorbisCodebook();
		}

		var3 = var1.method1141(6) + 1; // L: 122

		for (var4 = 0; var4 < var3; ++var4) { // L: 123
			var1.method1141(16);
		}

		var3 = var1.method1141(6) + 1; // L: 125
		field364 = new VorbisFloor[var3]; // L: 126

		for (var4 = 0; var4 < var3; ++var4) { // L: 127
			field364[var4] = new VorbisFloor();
		}

		var4 = var1.method1141(6) + 1; // L: 128
		field368 = new class46[var4]; // L: 129

		for (var5 = 0; var5 < var4; ++var5) { // L: 130
			field368[var5] = new class46();
		}

		var5 = var1.method1141(6) + 1; // L: 131
		field376 = new VorbisMapping[var5]; // L: 132

		for (var6 = 0; var6 < var5; ++var6) { // L: 133
			field376[var6] = new VorbisMapping();
		}

		var6 = var1.method1141(6) + 1; // L: 134
		field367 = new boolean[var6]; // L: 135
		field356 = new int[var6]; // L: 136

		for (int var7 = 0; var7 < var6; ++var7) { // L: 137
			field367[var7] = var1.method1145() != 0; // L: 138
			var1.method1141(16); // L: 139
			var1.method1141(16); // L: 140
			field356[var7] = var1.method1141(8); // L: 141
		}

	} // L: 143

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lni;)Z"
	)
	static boolean method1072(AbstractArchive var0) {
		if (!field369) { // L: 344
			byte[] var1 = var0.takeFile(0, 0); // L: 345
			if (var1 == null) { // L: 346
				return false;
			}

			method1070(var1); // L: 347
			field369 = true; // L: 348
		}

		return true; // L: 350
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lni;II)Lcr;"
	)
	@Export("readMusicSample")
	static VorbisSample readMusicSample(AbstractArchive var0, int var1, int var2) {
		if (!method1072(var0)) { // L: 354
			var0.tryLoadFile(var1, var2); // L: 355
			return null; // L: 356
		} else {
			byte[] var3 = var0.takeFile(var1, var2); // L: 358
			return var3 == null ? null : new VorbisSample(var3); // L: 359
		}
	}
}
