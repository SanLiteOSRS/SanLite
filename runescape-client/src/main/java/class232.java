import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("if")
public class class232 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[Lin;"
	)
	class230[] field2463;

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2058031206"
	)
	public void method4561() {
		this.field2463 = new class230[1]; // L: 7
		class228 var1 = class228.field2428; // L: 8
		this.field2463[0] = new class230(var1.field2429, var1.field2435); // L: 9
	} // L: 10

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIILig;Lii;Z[I[IB)I",
		garbageValue = "-112"
	)
	public int method4556(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, boolean var6, int[] var7, int[] var8) {
		return this.method4566(var1, var2, var3, var4, var5, var6, var7, var8, this.field2463[0]); // L: 13
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIILig;Lii;Z[I[ILin;B)I",
		garbageValue = "-63"
	)
	int method4566(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, boolean var6, int[] var7, int[] var8, class230 var9) {
		var9.method4510(); // L: 17
		int var10 = var9.method4535(); // L: 18
		int var11 = var9.method4528(); // L: 19
		int[][] var12 = var9.method4518(); // L: 20
		int[][] var13 = var9.method4517(); // L: 21
		int[] var14 = var9.method4516(); // L: 22
		int[] var15 = var9.method4520(); // L: 23
		boolean var16;
		if (var3 == 1) { // L: 25
			var16 = this.method4563(var1, var2, var4, var5, var9);
		} else if (var3 == 2) { // L: 26
			var16 = this.method4559(var1, var2, var4, var5, var9);
		} else {
			var16 = this.method4560(var1, var2, var3, var4, var5, var9); // L: 27
		}

		int var17 = var1 - (var10 >> 1); // L: 28
		int var18 = var2 - (var11 >> 1); // L: 29
		int var19 = var9.method4513(); // L: 30
		int var20 = var9.method4534(); // L: 31
		int var21;
		int var22;
		int var24;
		if (!var16) { // L: 32
			if (!var6) { // L: 33
				return -1; // L: 66
			}

			var21 = Integer.MAX_VALUE; // L: 34
			var22 = Integer.MAX_VALUE; // L: 35
			byte var23 = 10; // L: 36
			var24 = var4.approxDestinationX; // L: 37
			int var25 = var4.approxDestinationY; // L: 38
			int var26 = var4.approxDestinationSizeX; // L: 39
			int var27 = var4.approxDestinationSizeY; // L: 40

			for (int var28 = var24 - var23; var28 <= var23 + var24; ++var28) { // L: 41
				for (int var29 = var25 - var23; var29 <= var25 + var23; ++var29) { // L: 42
					int var30 = var28 - var17; // L: 43
					int var31 = var29 - var18; // L: 44
					if (var30 >= 0 && var31 >= 0 && var30 < var10 && var31 < var11 && var12[var30][var31] < 100) { // L: 45 46
						int var32 = 0; // L: 47
						if (var28 < var24) { // L: 48
							var32 = var24 - var28;
						} else if (var28 > var24 + var26 - 1) { // L: 49
							var32 = var28 - (var26 + var24 - 1);
						}

						int var33 = 0; // L: 50
						if (var29 < var25) { // L: 51
							var33 = var25 - var29;
						} else if (var29 > var27 + var25 - 1) { // L: 52
							var33 = var29 - (var27 + var25 - 1);
						}

						int var34 = var33 * var33 + var32 * var32; // L: 53
						if (var34 < var21 || var21 == var34 && var12[var30][var31] < var22) { // L: 54
							var21 = var34; // L: 55
							var22 = var12[var30][var31]; // L: 56
							var19 = var28; // L: 57
							var20 = var29; // L: 58
						}
					}
				}
			}

			if (var21 == Integer.MAX_VALUE) { // L: 64
				return -1;
			}
		}

		if (var19 == var1 && var20 == var2) { // L: 68
			var7[0] = var19; // L: 69
			var8[0] = var20; // L: 70
			return 0; // L: 71
		} else {
			byte var36 = 0; // L: 73
			var14[var36] = var19; // L: 76
			var21 = var36 + 1; // L: 77
			var15[var36] = var20;

			int var37;
			for (var22 = var37 = var13[var19 - var17][var20 - var18]; var19 != var1 || var20 != var2; var22 = var13[var19 - var17][var20 - var18]) { // L: 78 79 89
				if (var37 != var22) { // L: 80
					var37 = var22; // L: 81
					var14[var21] = var19; // L: 82
					var15[var21++] = var20; // L: 83
				}

				if ((var22 & 2) != 0) { // L: 85
					++var19;
				} else if ((var22 & 8) != 0) { // L: 86
					--var19;
				}

				if ((var22 & 1) != 0) { // L: 87
					++var20;
				} else if ((var22 & 4) != 0) { // L: 88
					--var20;
				}
			}

			var24 = 0; // L: 91

			while (var21-- > 0) { // L: 92
				var7[var24] = var14[var21]; // L: 93
				var8[var24++] = var15[var21]; // L: 94
				if (var24 >= var7.length) { // L: 95
					break;
				}
			}

			return var24; // L: 97
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IILig;Lii;Lin;B)Z",
		garbageValue = "34"
	)
	final boolean method4563(int var1, int var2, RouteStrategy var3, CollisionMap var4, class230 var5) {
		int var6 = var5.method4535(); // L: 101
		int var7 = var5.method4528(); // L: 102
		int[][] var8 = var5.method4518(); // L: 103
		int[][] var9 = var5.method4517(); // L: 104
		int[] var10 = var5.method4516(); // L: 105
		int[] var11 = var5.method4520(); // L: 106
		int var12 = var5.method4521(); // L: 107
		int var13 = var1; // L: 108
		int var14 = var2; // L: 109
		int var15 = var6 >> 1; // L: 110
		int var16 = var7 >> 1; // L: 111
		int var17 = var1 - var15; // L: 112
		int var18 = var2 - var16; // L: 113
		var9[var15][var16] = 99; // L: 114
		var8[var15][var16] = 0; // L: 115
		byte var19 = 0; // L: 116
		int var20 = 0; // L: 117
		var10[var19] = var1; // L: 118
		byte var10001 = var19;
		int var25 = var19 + 1; // L: 119
		var11[var10001] = var2;
		int[][] var21 = var4.flags; // L: 120

		while (var25 != var20) { // L: 123
			var13 = var10[var20]; // L: 124
			var14 = var11[var20]; // L: 125
			var20 = var20 + 1 & var12; // L: 126
			var15 = var13 - var17; // L: 127
			var16 = var14 - var18; // L: 128
			int var22 = var13 - var4.xInset; // L: 129
			int var23 = var14 - var4.yInset; // L: 130
			if (var3.hasArrived(1, var13, var14, var4)) { // L: 131
				var5.method4532(var13, var14); // L: 132
				return true; // L: 133
			}

			int var24 = var8[var15][var16] + 1; // L: 135
			if (var15 > 0 && var9[var15 - 1][var16] == 0 && (var21[var22 - 1][var23] & 19136776) == 0) { // L: 136
				var10[var25] = var13 - 1; // L: 137
				var11[var25] = var14; // L: 138
				var25 = var25 + 1 & var12; // L: 139
				var9[var15 - 1][var16] = 2; // L: 140
				var8[var15 - 1][var16] = var24; // L: 141
			}

			if (var15 < var6 - 1 && var9[var15 + 1][var16] == 0 && (var21[var22 + 1][var23] & 19136896) == 0) { // L: 143
				var10[var25] = var13 + 1; // L: 144
				var11[var25] = var14; // L: 145
				var25 = var25 + 1 & var12; // L: 146
				var9[var15 + 1][var16] = 8; // L: 147
				var8[var15 + 1][var16] = var24; // L: 148
			}

			if (var16 > 0 && var9[var15][var16 - 1] == 0 && (var21[var22][var23 - 1] & 19136770) == 0) { // L: 150
				var10[var25] = var13; // L: 151
				var11[var25] = var14 - 1; // L: 152
				var25 = var25 + 1 & var12; // L: 153
				var9[var15][var16 - 1] = 1; // L: 154
				var8[var15][var16 - 1] = var24; // L: 155
			}

			if (var16 < var7 - 1 && var9[var15][var16 + 1] == 0 && (var21[var22][var23 + 1] & 19136800) == 0) { // L: 157
				var10[var25] = var13; // L: 158
				var11[var25] = var14 + 1; // L: 159
				var25 = var25 + 1 & var12; // L: 160
				var9[var15][var16 + 1] = 4; // L: 161
				var8[var15][var16 + 1] = var24; // L: 162
			}

			if (var15 > 0 && var16 > 0 && var9[var15 - 1][var16 - 1] == 0 && (var21[var22 - 1][var23 - 1] & 19136782) == 0 && (var21[var22 - 1][var23] & 19136776) == 0 && (var21[var22][var23 - 1] & 19136770) == 0) { // L: 164
				var10[var25] = var13 - 1; // L: 165
				var11[var25] = var14 - 1; // L: 166
				var25 = var25 + 1 & var12; // L: 167
				var9[var15 - 1][var16 - 1] = 3; // L: 168
				var8[var15 - 1][var16 - 1] = var24; // L: 169
			}

			if (var15 < var6 - 1 && var16 > 0 && var9[var15 + 1][var16 - 1] == 0 && (var21[var22 + 1][var23 - 1] & 19136899) == 0 && (var21[var22 + 1][var23] & 19136896) == 0 && (var21[var22][var23 - 1] & 19136770) == 0) { // L: 171
				var10[var25] = var13 + 1; // L: 172
				var11[var25] = var14 - 1; // L: 173
				var25 = var25 + 1 & var12; // L: 174
				var9[var15 + 1][var16 - 1] = 9; // L: 175
				var8[var15 + 1][var16 - 1] = var24; // L: 176
			}

			if (var15 > 0 && var16 < var7 - 1 && var9[var15 - 1][var16 + 1] == 0 && (var21[var22 - 1][var23 + 1] & 19136824) == 0 && (var21[var22 - 1][var23] & 19136776) == 0 && (var21[var22][var23 + 1] & 19136800) == 0) { // L: 178
				var10[var25] = var13 - 1; // L: 179
				var11[var25] = var14 + 1; // L: 180
				var25 = var25 + 1 & var12; // L: 181
				var9[var15 - 1][var16 + 1] = 6; // L: 182
				var8[var15 - 1][var16 + 1] = var24; // L: 183
			}

			if (var15 < var6 - 1 && var16 < var7 - 1 && var9[var15 + 1][var16 + 1] == 0 && (var21[var22 + 1][var23 + 1] & 19136992) == 0 && (var21[var22 + 1][var23] & 19136896) == 0 && (var21[var22][var23 + 1] & 19136800) == 0) { // L: 185
				var10[var25] = var13 + 1; // L: 186
				var11[var25] = var14 + 1; // L: 187
				var25 = var25 + 1 & var12; // L: 188
				var9[var15 + 1][var16 + 1] = 12; // L: 189
				var8[var15 + 1][var16 + 1] = var24; // L: 190
			}
		}

		var5.method4532(var13, var14); // L: 193
		return false; // L: 194
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IILig;Lii;Lin;B)Z",
		garbageValue = "0"
	)
	final boolean method4559(int var1, int var2, RouteStrategy var3, CollisionMap var4, class230 var5) {
		int var6 = var5.method4535(); // L: 198
		int var7 = var5.method4528(); // L: 199
		int[][] var8 = var5.method4518(); // L: 200
		int[][] var9 = var5.method4517(); // L: 201
		int[] var10 = var5.method4516(); // L: 202
		int[] var11 = var5.method4520(); // L: 203
		int var12 = var5.method4521(); // L: 204
		int var13 = var1; // L: 205
		int var14 = var2; // L: 206
		int var15 = var6 >> 1; // L: 207
		int var16 = var7 >> 1; // L: 208
		int var17 = var1 - var15; // L: 209
		int var18 = var2 - var16; // L: 210
		var9[var15][var16] = 99; // L: 211
		var8[var15][var16] = 0; // L: 212
		byte var19 = 0; // L: 213
		int var20 = 0; // L: 214
		var10[var19] = var1; // L: 215
		byte var10001 = var19;
		int var25 = var19 + 1; // L: 216
		var11[var10001] = var2;
		int[][] var21 = var4.flags; // L: 217

		while (var25 != var20) { // L: 218
			var13 = var10[var20]; // L: 219
			var14 = var11[var20]; // L: 220
			var20 = var20 + 1 & var12; // L: 221
			var15 = var13 - var17; // L: 222
			var16 = var14 - var18; // L: 223
			int var22 = var13 - var4.xInset; // L: 224
			int var23 = var14 - var4.yInset; // L: 225
			if (var3.hasArrived(2, var13, var14, var4)) { // L: 226
				var5.method4532(var13, var14); // L: 227
				return true; // L: 228
			}

			int var24 = var8[var15][var16] + 1; // L: 230
			if (var15 > 0 && var9[var15 - 1][var16] == 0 && (var21[var22 - 1][var23] & 19136782) == 0 && (var21[var22 - 1][var23 + 1] & 19136824) == 0) { // L: 231 232 233 234
				var10[var25] = var13 - 1; // L: 235
				var11[var25] = var14; // L: 236
				var25 = var25 + 1 & var12; // L: 237
				var9[var15 - 1][var16] = 2; // L: 238
				var8[var15 - 1][var16] = var24; // L: 239
			}

			if (var15 < var6 - 2 && var9[var15 + 1][var16] == 0 && (var21[var22 + 2][var23] & 19136899) == 0 && (var21[var22 + 2][var23 + 1] & 19136992) == 0) { // L: 241 242 243 244
				var10[var25] = var13 + 1; // L: 245
				var11[var25] = var14; // L: 246
				var25 = var25 + 1 & var12; // L: 247
				var9[var15 + 1][var16] = 8; // L: 248
				var8[var15 + 1][var16] = var24; // L: 249
			}

			if (var16 > 0 && var9[var15][var16 - 1] == 0 && (var21[var22][var23 - 1] & 19136782) == 0 && (var21[var22 + 1][var23 - 1] & 19136899) == 0) { // L: 251 252 253 254
				var10[var25] = var13; // L: 255
				var11[var25] = var14 - 1; // L: 256
				var25 = var25 + 1 & var12; // L: 257
				var9[var15][var16 - 1] = 1; // L: 258
				var8[var15][var16 - 1] = var24; // L: 259
			}

			if (var16 < var7 - 2 && var9[var15][var16 + 1] == 0 && (var21[var22][var23 + 2] & 19136824) == 0 && (var21[var22 + 1][var23 + 2] & 19136992) == 0) { // L: 261 262 263 264
				var10[var25] = var13; // L: 265
				var11[var25] = var14 + 1; // L: 266
				var25 = var25 + 1 & var12; // L: 267
				var9[var15][var16 + 1] = 4; // L: 268
				var8[var15][var16 + 1] = var24; // L: 269
			}

			if (var15 > 0 && var16 > 0 && var9[var15 - 1][var16 - 1] == 0 && (var21[var22 - 1][var23] & 19136830) == 0 && (var21[var22 - 1][var23 - 1] & 19136782) == 0 && (var21[var22][var23 - 1] & 19136911) == 0) { // L: 271 272 273 274 275
				var10[var25] = var13 - 1; // L: 276
				var11[var25] = var14 - 1; // L: 277
				var25 = var25 + 1 & var12; // L: 278
				var9[var15 - 1][var16 - 1] = 3; // L: 279
				var8[var15 - 1][var16 - 1] = var24; // L: 280
			}

			if (var15 < var6 - 2 && var16 > 0 && var9[var15 + 1][var16 - 1] == 0 && (var21[var22 + 1][var23 - 1] & 19136911) == 0 && (var21[var22 + 2][var23 - 1] & 19136899) == 0 && (var21[var22 + 2][var23] & 19136995) == 0) { // L: 282 283 284 285 286
				var10[var25] = var13 + 1; // L: 287
				var11[var25] = var14 - 1; // L: 288
				var25 = var25 + 1 & var12; // L: 289
				var9[var15 + 1][var16 - 1] = 9; // L: 290
				var8[var15 + 1][var16 - 1] = var24; // L: 291
			}

			if (var15 > 0 && var16 < var7 - 2 && var9[var15 - 1][var16 + 1] == 0 && (var21[var22 - 1][var23 + 1] & 19136830) == 0 && (var21[var22 - 1][var23 + 2] & 19136824) == 0 && (var21[var22][var23 + 2] & 19137016) == 0) { // L: 293 294 295 296 297
				var10[var25] = var13 - 1; // L: 298
				var11[var25] = var14 + 1; // L: 299
				var25 = var25 + 1 & var12; // L: 300
				var9[var15 - 1][var16 + 1] = 6; // L: 301
				var8[var15 - 1][var16 + 1] = var24; // L: 302
			}

			if (var15 < var6 - 2 && var16 < var7 - 2 && var9[var15 + 1][var16 + 1] == 0 && (var21[var22 + 1][var23 + 2] & 19137016) == 0 && (var21[var22 + 2][var23 + 2] & 19136992) == 0 && (var21[var22 + 2][var23 + 1] & 19136995) == 0) { // L: 304 305 306 307 308
				var10[var25] = var13 + 1; // L: 309
				var11[var25] = var14 + 1; // L: 310
				var25 = var25 + 1 & var12; // L: 311
				var9[var15 + 1][var16 + 1] = 12; // L: 312
				var8[var15 + 1][var16 + 1] = var24; // L: 313
			}
		}

		var5.method4532(var13, var14); // L: 316
		return false; // L: 317
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIILig;Lii;Lin;I)Z",
		garbageValue = "1868151699"
	)
	final boolean method4560(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, class230 var6) {
		int var7 = var6.method4535(); // L: 321
		int var8 = var6.method4528(); // L: 322
		int[][] var9 = var6.method4518(); // L: 323
		int[][] var10 = var6.method4517(); // L: 324
		int[] var11 = var6.method4516(); // L: 325
		int[] var12 = var6.method4520(); // L: 326
		int var13 = var6.method4521(); // L: 327
		int var14 = var1; // L: 328
		int var15 = var2; // L: 329
		int var16 = var7 >> 1; // L: 330
		int var17 = var8 >> 1; // L: 331
		int var18 = var1 - var16; // L: 332
		int var19 = var2 - var17; // L: 333
		var10[var16][var17] = 99; // L: 334
		var9[var16][var17] = 0; // L: 335
		byte var20 = 0; // L: 336
		int var21 = 0; // L: 337
		var11[var20] = var1; // L: 338
		int var27 = var20 + 1; // L: 339
		var12[var20] = var2;
		int[][] var22 = var5.flags; // L: 340

		while (true) {
			label307:
			while (true) {
				int var23;
				int var24;
				int var25;
				int var26;
				do {
					do {
						do {
							label284:
							do {
								if (var21 == var27) { // L: 341
									var6.method4532(var14, var15); // L: 459
									return false; // L: 460
								}

								var14 = var11[var21]; // L: 342
								var15 = var12[var21]; // L: 343
								var21 = var21 + 1 & var13; // L: 344
								var16 = var14 - var18; // L: 345
								var17 = var15 - var19; // L: 346
								var23 = var14 - var5.xInset; // L: 347
								var24 = var15 - var5.yInset; // L: 348
								if (var4.hasArrived(var3, var14, var15, var5)) { // L: 349
									var6.method4532(var14, var15); // L: 350
									return true; // L: 351
								}

								var25 = var9[var16][var17] + 1; // L: 353
								if (var16 > 0 && var10[var16 - 1][var17] == 0 && (var22[var23 - 1][var24] & 19136782) == 0 && (var22[var23 - 1][var3 + var24 - 1] & 19136824) == 0) { // L: 354 355 356 357
									var26 = 1;

									while (true) {
										if (var26 >= var3 - 1) {
											var11[var27] = var14 - 1; // L: 361
											var12[var27] = var15; // L: 362
											var27 = var27 + 1 & var13; // L: 363
											var10[var16 - 1][var17] = 2; // L: 364
											var9[var16 - 1][var17] = var25; // L: 365
											break;
										}

										if ((var22[var23 - 1][var26 + var24] & 19136830) != 0) { // L: 359
											break;
										}

										++var26; // L: 358
									}
								}

								if (var16 < var7 - var3 && var10[var16 + 1][var17] == 0 && (var22[var3 + var23][var24] & 19136899) == 0 && (var22[var3 + var23][var3 + var24 - 1] & 19136992) == 0) { // L: 367 368 369 370
									var26 = 1;

									while (true) {
										if (var26 >= var3 - 1) {
											var11[var27] = var14 + 1; // L: 374
											var12[var27] = var15; // L: 375
											var27 = var27 + 1 & var13; // L: 376
											var10[var16 + 1][var17] = 8; // L: 377
											var9[var16 + 1][var17] = var25; // L: 378
											break;
										}

										if ((var22[var3 + var23][var24 + var26] & 19136995) != 0) { // L: 372
											break;
										}

										++var26; // L: 371
									}
								}

								if (var17 > 0 && var10[var16][var17 - 1] == 0 && (var22[var23][var24 - 1] & 19136782) == 0 && (var22[var3 + var23 - 1][var24 - 1] & 19136899) == 0) { // L: 380 381 382 383
									var26 = 1;

									while (true) {
										if (var26 >= var3 - 1) {
											var11[var27] = var14; // L: 387
											var12[var27] = var15 - 1; // L: 388
											var27 = var27 + 1 & var13; // L: 389
											var10[var16][var17 - 1] = 1; // L: 390
											var9[var16][var17 - 1] = var25; // L: 391
											break;
										}

										if ((var22[var26 + var23][var24 - 1] & 19136911) != 0) { // L: 385
											break;
										}

										++var26; // L: 384
									}
								}

								if (var17 < var8 - var3 && var10[var16][var17 + 1] == 0 && (var22[var23][var3 + var24] & 19136824) == 0 && (var22[var3 + var23 - 1][var3 + var24] & 19136992) == 0) { // L: 393 394 395 396
									var26 = 1;

									while (true) {
										if (var26 >= var3 - 1) {
											var11[var27] = var14; // L: 400
											var12[var27] = var15 + 1; // L: 401
											var27 = var27 + 1 & var13; // L: 402
											var10[var16][var17 + 1] = 4; // L: 403
											var9[var16][var17 + 1] = var25; // L: 404
											break;
										}

										if ((var22[var26 + var23][var3 + var24] & 19137016) != 0) { // L: 398
											break;
										}

										++var26; // L: 397
									}
								}

								if (var16 > 0 && var17 > 0 && var10[var16 - 1][var17 - 1] == 0 && (var22[var23 - 1][var24 - 1] & 19136782) == 0) { // L: 406 407 408
									var26 = 1;

									while (true) {
										if (var26 >= var3) {
											var11[var27] = var14 - 1; // L: 413
											var12[var27] = var15 - 1; // L: 414
											var27 = var27 + 1 & var13; // L: 415
											var10[var16 - 1][var17 - 1] = 3; // L: 416
											var9[var16 - 1][var17 - 1] = var25; // L: 417
											break;
										}

										if ((var22[var23 - 1][var26 + (var24 - 1)] & 19136830) != 0 || (var22[var26 + (var23 - 1)][var24 - 1] & 19136911) != 0) { // L: 410 411
											break;
										}

										++var26; // L: 409
									}
								}

								if (var16 < var7 - var3 && var17 > 0 && var10[var16 + 1][var17 - 1] == 0 && (var22[var3 + var23][var24 - 1] & 19136899) == 0) { // L: 419 420 421
									var26 = 1;

									while (true) {
										if (var26 >= var3) {
											var11[var27] = var14 + 1; // L: 426
											var12[var27] = var15 - 1; // L: 427
											var27 = var27 + 1 & var13; // L: 428
											var10[var16 + 1][var17 - 1] = 9; // L: 429
											var9[var16 + 1][var17 - 1] = var25; // L: 430
											break;
										}

										if ((var22[var3 + var23][var26 + (var24 - 1)] & 19136995) != 0 || (var22[var23 + var26][var24 - 1] & 19136911) != 0) { // L: 423 424
											break;
										}

										++var26; // L: 422
									}
								}

								if (var16 > 0 && var17 < var8 - var3 && var10[var16 - 1][var17 + 1] == 0 && (var22[var23 - 1][var3 + var24] & 19136824) == 0) { // L: 432 433 434
									for (var26 = 1; var26 < var3; ++var26) { // L: 435
										if ((var22[var23 - 1][var26 + var24] & 19136830) != 0 || (var22[var26 + (var23 - 1)][var3 + var24] & 19137016) != 0) { // L: 436 437
											continue label284;
										}
									}

									var11[var27] = var14 - 1; // L: 439
									var12[var27] = var15 + 1; // L: 440
									var27 = var27 + 1 & var13; // L: 441
									var10[var16 - 1][var17 + 1] = 6; // L: 442
									var9[var16 - 1][var17 + 1] = var25; // L: 443
								}
							} while(var16 >= var7 - var3); // L: 445
						} while(var17 >= var8 - var3);
					} while(var10[var16 + 1][var17 + 1] != 0); // L: 446
				} while((var22[var3 + var23][var3 + var24] & 19136992) != 0); // L: 447

				for (var26 = 1; var26 < var3; ++var26) { // L: 448
					if ((var22[var23 + var26][var3 + var24] & 19137016) != 0 || (var22[var3 + var23][var26 + var24] & 19136995) != 0) { // L: 449 450
						continue label307;
					}
				}

				var11[var27] = var14 + 1; // L: 452
				var12[var27] = var15 + 1; // L: 453
				var27 = var27 + 1 & var13; // L: 454
				var10[var16 + 1][var17 + 1] = 12; // L: 455
				var9[var16 + 1][var17 + 1] = var25; // L: 456
			}
		}
	}
}
