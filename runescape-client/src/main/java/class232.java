import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
public class class232 {
	@ObfuscatedName("uc")
	@ObfuscatedGetter(
		intValue = -1424338259
	)
	static int field2431;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lig;"
	)
	class230[] field2432;

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "21"
	)
	public void method4389() {
		this.field2432 = new class230[1]; // L: 7
		class228 var1 = class228.field2409; // L: 8
		this.field2432[0] = new class230(var1.field2407, var1.field2401); // L: 9
	} // L: 10

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIILiq;Lih;Z[I[II)I",
		garbageValue = "1180709957"
	)
	public int method4391(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, boolean var6, int[] var7, int[] var8) {
		return this.method4397(var1, var2, var3, var4, var5, var6, var7, var8, this.field2432[0]); // L: 13
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIILiq;Lih;Z[I[ILig;B)I",
		garbageValue = "35"
	)
	int method4397(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, boolean var6, int[] var7, int[] var8, class230 var9) {
		var9.method4343(); // L: 17
		int var10 = var9.method4380(); // L: 18
		int var11 = var9.method4348(); // L: 19
		int[][] var12 = var9.method4350(); // L: 20
		int[][] var13 = var9.method4349(); // L: 21
		int[] var14 = var9.method4351(); // L: 22
		int[] var15 = var9.method4352(); // L: 23
		boolean var16;
		if (var3 == 1) { // L: 25
			var16 = this.method4405(var1, var2, var4, var5, var9);
		} else if (var3 == 2) { // L: 26
			var16 = this.method4394(var1, var2, var4, var5, var9);
		} else {
			var16 = this.method4395(var1, var2, var3, var4, var5, var9); // L: 27
		}

		int var17 = var1 - (var10 >> 1); // L: 28
		int var18 = var2 - (var11 >> 1); // L: 29
		int var19 = var9.method4345(); // L: 30
		int var20 = var9.method4346(); // L: 31
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
					if (var30 >= 0 && var31 >= 0 && var30 < var10 && var31 < var11 && var12[var30][var31] < 100) { // L: 45
						int var32 = 0;
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

						int var34 = var32 * var32 + var33 * var33; // L: 53
						if (var34 < var21 || var34 == var21 && var12[var30][var31] < var22) { // L: 54
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IILiq;Lih;Lig;I)Z",
		garbageValue = "1570636396"
	)
	final boolean method4405(int var1, int var2, RouteStrategy var3, CollisionMap var4, class230 var5) {
		int var6 = var5.method4380(); // L: 101
		int var7 = var5.method4348(); // L: 102
		int[][] var8 = var5.method4350(); // L: 103
		int[][] var9 = var5.method4349(); // L: 104
		int[] var10 = var5.method4351(); // L: 105
		int[] var11 = var5.method4352(); // L: 106
		int var12 = var5.method4353(); // L: 107
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
				var5.method4344(var13, var14); // L: 132
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

		var5.method4344(var13, var14); // L: 193
		return false; // L: 194
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IILiq;Lih;Lig;I)Z",
		garbageValue = "-525938769"
	)
	final boolean method4394(int var1, int var2, RouteStrategy var3, CollisionMap var4, class230 var5) {
		int var6 = var5.method4380(); // L: 198
		int var7 = var5.method4348(); // L: 199
		int[][] var8 = var5.method4350(); // L: 200
		int[][] var9 = var5.method4349(); // L: 201
		int[] var10 = var5.method4351(); // L: 202
		int[] var11 = var5.method4352(); // L: 203
		int var12 = var5.method4353(); // L: 204
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
				var5.method4344(var13, var14); // L: 227
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

		var5.method4344(var13, var14); // L: 316
		return false; // L: 317
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIILiq;Lih;Lig;B)Z",
		garbageValue = "58"
	)
	final boolean method4395(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, class230 var6) {
		int var7 = var6.method4380(); // L: 321
		int var8 = var6.method4348(); // L: 322
		int[][] var9 = var6.method4350(); // L: 323
		int[][] var10 = var6.method4349(); // L: 324
		int[] var11 = var6.method4351(); // L: 325
		int[] var12 = var6.method4352(); // L: 326
		int var13 = var6.method4353(); // L: 327
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
			label312:
			while (true) {
				int var23;
				int var24;
				int var25;
				int var26;
				do {
					do {
						do {
							label289:
							do {
								if (var21 == var27) { // L: 341
									var6.method4344(var14, var15); // L: 459
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
									var6.method4344(var14, var15); // L: 350
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

										if ((var22[var23 - 1][var24 + var26] & 19136830) != 0) { // L: 359
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

										if ((var22[var23 + var26][var24 - 1] & 19136911) != 0) { // L: 385
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

										if ((var22[var23 + var26][var3 + var24] & 19137016) != 0) { // L: 398
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
											var9[var16 - 1][var17 - 1] = var25;
											break; // L: 417
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
										if ((var22[var23 - 1][var24 + var26] & 19136830) != 0 || (var22[var26 + (var23 - 1)][var3 + var24] & 19137016) != 0) { // L: 436 437
											continue label289;
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
					if ((var22[var26 + var23][var3 + var24] & 19137016) != 0 || (var22[var3 + var23][var26 + var24] & 19136995) != 0) { // L: 449 450
						continue label312;
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "48"
	)
	public static void method4412() {
		FileSystem.FileSystem_cacheFiles.clear(); // L: 46
	} // L: 47

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "368795311"
	)
	static final int method4410() {
		if (class91.clientPreferences.method2502()) { // L: 5344
			return class87.Client_plane;
		} else {
			int var0 = class115.getTileHeight(Client.cameraX, WorldMapArea.cameraZ, class87.Client_plane); // L: 5345
			return var0 - class17.cameraY < 800 && (Tiles.Tiles_renderFlags[class87.Client_plane][Client.cameraX >> 7][WorldMapArea.cameraZ >> 7] & 4) != 0 ? class87.Client_plane : 3; // L: 5346 5347
		}
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(Ldi;IIIIIB)V",
		garbageValue = "79"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) { // L: 5383
			if (var0 instanceof NPC) { // L: 5384
				NPCComposition var6 = ((NPC)var0).definition; // L: 5385
				if (var6.transforms != null) { // L: 5386
					var6 = var6.transform();
				}

				if (var6 == null) { // L: 5387
					return;
				}
			}

			int var75 = Players.Players_count; // L: 5389
			int[] var7 = Players.Players_indices; // L: 5390
			boolean var8 = var1 < var75; // L: 5391
			int var9 = -2; // L: 5392
			if (var0.overheadText != null && (!var8 || !var0.field1246 && (Client.publicChatMode == 4 || !var0.isAutoChatting && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).method2363())))) { // L: 5393 5394
				PlayerType.method6828(var0, var0.defaultHeight); // L: 5395
				if (Client.viewportTempX > -1 && Client.field617 < Client.field807) { // L: 5396
					Client.field627[Client.field617] = SoundCache.fontBold12.stringWidth(var0.overheadText) / 2; // L: 5397
					Client.field626[Client.field617] = SoundCache.fontBold12.ascent; // L: 5398
					Client.field624[Client.field617] = Client.viewportTempX; // L: 5399
					Client.field625[Client.field617] = Client.viewportTempY - var9; // L: 5400
					Client.field628[Client.field617] = var0.overheadTextColor; // L: 5401
					Client.field824[Client.field617] = var0.overheadTextEffect; // L: 5402
					Client.field733[Client.field617] = var0.overheadTextCyclesRemaining; // L: 5403
					Client.field630[Client.field617] = var0.field1194; // L: 5404
					Client.field632[Client.field617] = var0.overheadText; // L: 5405
					++Client.field617; // L: 5406
					var9 += 12; // L: 5407
				}
			}

			int var15;
			int var19;
			int var22;
			int var83;
			if (!var0.healthBars.method7247()) { // L: 5411
				PlayerType.method6828(var0, var0.defaultHeight + 15); // L: 5412

				for (HealthBar var10 = (HealthBar)var0.healthBars.last(); var10 != null; var10 = (HealthBar)var0.healthBars.previous()) { // L: 5413
					HealthBarUpdate var11 = var10.getInventorySprite(Client.cycle); // L: 5414
					if (var11 == null) { // L: 5415
						if (var10.isEmpty()) { // L: 5473
							var10.remove();
						}
					} else {
						HealthBarDefinition var12 = var10.definition; // L: 5416
						SpritePixels var13 = var12.method3713(); // L: 5417
						SpritePixels var86 = var12.method3712(); // L: 5418
						int var87 = 0; // L: 5420
						if (var13 != null && var86 != null) { // L: 5421
							if (var12.widthPadding * 2 < var86.subWidth) { // L: 5422
								var87 = var12.widthPadding;
							}

							var15 = var86.subWidth - var87 * 2; // L: 5423
						} else {
							var15 = var12.width; // L: 5425
						}

						int var81 = 255; // L: 5426
						boolean var88 = true; // L: 5427
						var19 = Client.cycle - var11.cycle; // L: 5428
						int var89 = var15 * var11.health2 / var12.width; // L: 5429
						int var90;
						int var105;
						if (var11.cycleOffset > var19) { // L: 5430
							var90 = var12.field1987 == 0 ? 0 : var12.field1987 * (var19 / var12.field1987); // L: 5431
							var22 = var15 * var11.health / var12.width; // L: 5432
							var105 = var90 * (var89 - var22) / var11.cycleOffset + var22; // L: 5433
						} else {
							var105 = var89; // L: 5436
							var90 = var12.int5 + var11.cycleOffset - var19; // L: 5437
							if (var12.int3 >= 0) { // L: 5438
								var81 = (var90 << 8) / (var12.int5 - var12.int3);
							}
						}

						if (var11.health2 > 0 && var105 < 1) { // L: 5440
							var105 = 1;
						}

						if (var13 != null && var86 != null) { // L: 5441
							if (var15 == var105) { // L: 5442
								var105 += var87 * 2;
							} else {
								var105 += var87; // L: 5443
							}

							var90 = var13.subHeight; // L: 5444
							var9 += var90; // L: 5445
							var22 = var2 + Client.viewportTempX - (var15 >> 1); // L: 5446
							var83 = var3 + Client.viewportTempY - var9; // L: 5447
							var22 -= var87; // L: 5448
							if (var81 >= 0 && var81 < 255) { // L: 5449
								var13.drawTransAt(var22, var83, var81); // L: 5450
								Rasterizer2D.Rasterizer2D_expandClip(var22, var83, var105 + var22, var90 + var83); // L: 5451
								var86.drawTransAt(var22, var83, var81); // L: 5452
							} else {
								var13.drawTransBgAt(var22, var83); // L: 5455
								Rasterizer2D.Rasterizer2D_expandClip(var22, var83, var22 + var105, var83 + var90); // L: 5456
								var86.drawTransBgAt(var22, var83); // L: 5457
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5); // L: 5459
							var9 += 2; // L: 5460
						} else {
							var9 += 5; // L: 5463
							if (Client.viewportTempX > -1) { // L: 5464
								var90 = var2 + Client.viewportTempX - (var15 >> 1); // L: 5465
								var22 = var3 + Client.viewportTempY - var9; // L: 5466
								Rasterizer2D.Rasterizer2D_fillRectangle(var90, var22, var105, 5, 65280); // L: 5467
								Rasterizer2D.Rasterizer2D_fillRectangle(var90 + var105, var22, var15 - var105, 5, 16711680); // L: 5468
							}

							var9 += 2; // L: 5470
						}
					}
				}
			}

			if (var9 == -2) { // L: 5476
				var9 += 7;
			}

			if (var8 && var0.playerCycle == Client.cycle) { // L: 5477
				Player var93 = (Player)var0; // L: 5479
				boolean var76;
				if (Client.drawPlayerNames == 0) { // L: 5481
					var76 = false; // L: 5482
				} else if (var93 == TextureProvider.localPlayer) { // L: 5485
					var76 = WorldMapLabelSize.method5219(); // L: 5488
				} else {
					var76 = class208.method3847() || ModeWhere.method7182() && var93.method2363() || class47.method871() && var93.method2366(); // L: 5486
				}

				if (var76) { // L: 5490
					Player var95 = (Player)var0; // L: 5491
					if (var8) { // L: 5492
						PlayerType.method6828(var0, var0.defaultHeight + 15); // L: 5493
						AbstractFont var97 = (AbstractFont)Client.field636.get(FontName.FontName_plain12); // L: 5494
						var9 += 4; // L: 5495
						var97.drawCentered(var95.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var9, 16777215, 0); // L: 5496
						var9 += 18; // L: 5497
					}
				}
			}

			Archive var18;
			SpritePixels[] var21;
			int var24;
			int var26;
			if (var8) { // L: 5501
				Player var91 = (Player)var0; // L: 5502
				if (var91.isHidden) { // L: 5503
					return;
				}

				if (var91.headIconPk != -1 || var91.headIconPrayer != -1) { // L: 5504
					PlayerType.method6828(var0, var0.defaultHeight + 15); // L: 5505
					if (Client.viewportTempX > -1) { // L: 5506
						if (var91.headIconPk != -1) { // L: 5507
							var9 += 25; // L: 5508
							UserComparator4.field1452[var91.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5509
						}

						if (var91.headIconPrayer != -1) { // L: 5511
							var9 += 25; // L: 5512
							class157.field1730[var91.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5513
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.field541) { // L: 5517
					PlayerType.method6828(var0, var0.defaultHeight + 15); // L: 5518
					if (Client.viewportTempX > -1) { // L: 5519
						var9 += UserComparator8.field1457[1].subHeight; // L: 5520
						UserComparator8.field1457[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5521
					}
				}
			} else {
				NPC var92 = (NPC)var0; // L: 5526
				int[] var94 = var92.method2629(); // L: 5527
				short[] var96 = var92.method2635(); // L: 5528
				if (var96 != null && var94 != null) { // L: 5529
					for (int var77 = 0; var77 < var96.length; ++var77) { // L: 5530
						if (var96[var77] >= 0 && var94[var77] >= 0) { // L: 5531
							long var14 = (long)var94[var77] << 8 | (long)var96[var77]; // L: 5534
							Object var16 = (SpritePixels)Client.field810.method7937(var14); // L: 5535
							if (var16 == null) { // L: 5536
								var18 = class199.field2010; // L: 5538
								var19 = var94[var77]; // L: 5539
								SpritePixels[] var17;
								if (!class164.method3376(var18, var19, 0)) { // L: 5541
									var17 = null; // L: 5542
								} else {
									var21 = new SpritePixels[class544.SpriteBuffer_spriteCount]; // L: 5547
									var22 = 0;

									while (true) {
										if (var22 >= class544.SpriteBuffer_spriteCount) {
											class407.method7453(); // L: 5561
											var17 = var21; // L: 5564
											break;
										}

										SpritePixels var23 = var21[var22] = new SpritePixels(); // L: 5549
										var23.width = class159.SpriteBuffer_spriteWidth; // L: 5550
										var23.height = class500.SpriteBuffer_spriteHeight; // L: 5551
										var23.xOffset = class326.SpriteBuffer_xOffsets[var22]; // L: 5552
										var23.yOffset = ModelData0.SpriteBuffer_yOffsets[var22]; // L: 5553
										var23.subWidth = class59.SpriteBuffer_spriteWidths[var22]; // L: 5554
										var23.subHeight = class544.SpriteBuffer_spriteHeights[var22]; // L: 5555
										var24 = var23.subWidth * var23.subHeight; // L: 5556
										byte[] var25 = class414.SpriteBuffer_pixels[var22]; // L: 5557
										var23.pixels = new int[var24]; // L: 5558

										for (var26 = 0; var26 < var24; ++var26) { // L: 5559
											var23.pixels[var26] = class372.SpriteBuffer_spritePalette[var25[var26] & 255];
										}

										++var22; // L: 5548
									}
								}

								if (var17 != null && var96[var77] < var17.length) { // L: 5567
									var16 = var17[var96[var77]]; // L: 5568
									Client.field810.method7928(var14, var16); // L: 5569
								}
							}

							if (var16 != null) { // L: 5572
								PlayerType.method6828(var0, var0.defaultHeight + 15); // L: 5573
								if (Client.viewportTempX > -1) { // L: 5574
									((SpritePixels)var16).drawTransBgAt(var2 + Client.viewportTempX - (((SpritePixels)var16).subWidth >> 1), Client.viewportTempY + (var3 - ((SpritePixels)var16).subHeight) - 4); // L: 5575
								}
							}
						}
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.field540 && Client.cycle % 20 < 10) { // L: 5580
					PlayerType.method6828(var0, var0.defaultHeight + 15); // L: 5581
					if (Client.viewportTempX > -1) { // L: 5582
						UserComparator8.field1457[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			for (int var103 = 0; var103 < 4; ++var103) { // L: 5585
				int var78 = var0.hitSplatCycles[var103]; // L: 5586
				int var79 = var0.hitSplatTypes[var103]; // L: 5587
				HitSplatDefinition var98 = null; // L: 5588
				int var80 = 0; // L: 5589
				if (var79 >= 0) { // L: 5590
					if (var78 <= Client.cycle) { // L: 5591
						continue;
					}

					var98 = class191.method3627(var0.hitSplatTypes[var103]); // L: 5592
					var80 = var98.field2175; // L: 5593
					if (var98 != null && var98.transforms != null) { // L: 5594
						var98 = var98.transform(); // L: 5595
						if (var98 == null) { // L: 5596
							var0.hitSplatCycles[var103] = -1; // L: 5597
							continue; // L: 5598
						}
					}
				} else if (var78 < 0) { // L: 5602
					continue;
				}

				var15 = var0.hitSplatTypes2[var103]; // L: 5603
				HitSplatDefinition var99 = null; // L: 5604
				if (var15 >= 0) { // L: 5605
					var99 = class191.method3627(var15); // L: 5606
					if (var99 != null && var99.transforms != null) { // L: 5607
						var99 = var99.transform();
					}
				}

				if (var78 - var80 <= Client.cycle) { // L: 5609
					if (var98 == null) { // L: 5610
						var0.hitSplatCycles[var103] = -1; // L: 5611
					} else {
						PlayerType.method6828(var0, var0.defaultHeight / 2); // L: 5614
						if (Client.viewportTempX > -1) { // L: 5615
							boolean var104 = true; // L: 5616
							if (var103 == 1) { // L: 5617
								Client.viewportTempY -= 20; // L: 5618
							}

							if (var103 == 2) { // L: 5620
								Client.viewportTempX -= 15; // L: 5621
								Client.viewportTempY -= 10; // L: 5622
							}

							if (var103 == 3) { // L: 5624
								Client.viewportTempX += 15; // L: 5625
								Client.viewportTempY -= 10; // L: 5626
							}

							var18 = null; // L: 5628
							SpritePixels var82 = null; // L: 5629
							SpritePixels var20 = null; // L: 5630
							var21 = null; // L: 5631
							var22 = 0; // L: 5632
							var83 = 0; // L: 5633
							var24 = 0; // L: 5634
							int var84 = 0; // L: 5635
							var26 = 0; // L: 5636
							int var27 = 0; // L: 5637
							int var28 = 0; // L: 5638
							int var29 = 0; // L: 5639
							SpritePixels var30 = null; // L: 5640
							SpritePixels var31 = null; // L: 5641
							SpritePixels var32 = null; // L: 5642
							SpritePixels var33 = null; // L: 5643
							int var34 = 0; // L: 5644
							int var35 = 0; // L: 5645
							int var36 = 0; // L: 5646
							int var37 = 0; // L: 5647
							int var38 = 0; // L: 5648
							int var39 = 0; // L: 5649
							int var40 = 0; // L: 5650
							int var41 = 0; // L: 5651
							int var42 = 0; // L: 5652
							SpritePixels var100 = var98.method3973(); // L: 5653
							int var43;
							if (var100 != null) { // L: 5654
								var22 = var100.subWidth; // L: 5655
								var43 = var100.subHeight; // L: 5656
								if (var43 > var42) { // L: 5657
									var42 = var43;
								}

								var26 = var100.xOffset; // L: 5658
							}

							var82 = var98.method3974(); // L: 5660
							if (var82 != null) { // L: 5661
								var83 = var82.subWidth; // L: 5662
								var43 = var82.subHeight; // L: 5663
								if (var43 > var42) { // L: 5664
									var42 = var43;
								}

								var27 = var82.xOffset; // L: 5665
							}

							var20 = var98.method3975(); // L: 5667
							if (var20 != null) { // L: 5668
								var24 = var20.subWidth; // L: 5669
								var43 = var20.subHeight; // L: 5670
								if (var43 > var42) { // L: 5671
									var42 = var43;
								}

								var28 = var20.xOffset; // L: 5672
							}

							SpritePixels var101 = var98.method3976(); // L: 5674
							if (var101 != null) { // L: 5675
								var84 = var101.subWidth; // L: 5676
								var43 = var101.subHeight; // L: 5677
								if (var43 > var42) { // L: 5678
									var42 = var43;
								}

								var29 = var101.xOffset; // L: 5679
							}

							if (var99 != null) { // L: 5681
								var30 = var99.method3973(); // L: 5682
								if (var30 != null) { // L: 5683
									var34 = var30.subWidth; // L: 5684
									var43 = var30.subHeight; // L: 5685
									if (var43 > var42) { // L: 5686
										var42 = var43;
									}

									var38 = var30.xOffset; // L: 5687
								}

								var31 = var99.method3974(); // L: 5689
								if (var31 != null) { // L: 5690
									var35 = var31.subWidth; // L: 5691
									var43 = var31.subHeight; // L: 5692
									if (var43 > var42) { // L: 5693
										var42 = var43;
									}

									var39 = var31.xOffset; // L: 5694
								}

								var32 = var99.method3975(); // L: 5696
								if (var32 != null) { // L: 5697
									var36 = var32.subWidth; // L: 5698
									var43 = var32.subHeight; // L: 5699
									if (var43 > var42) { // L: 5700
										var42 = var43;
									}

									var40 = var32.xOffset; // L: 5701
								}

								var33 = var99.method3976(); // L: 5703
								if (var33 != null) { // L: 5704
									var37 = var33.subWidth; // L: 5705
									var43 = var33.subHeight; // L: 5706
									if (var43 > var42) { // L: 5707
										var42 = var43;
									}

									var41 = var33.xOffset; // L: 5708
								}
							}

							Font var85 = var98.getFont(); // L: 5713
							if (var85 == null) { // L: 5714
								var85 = class14.field80;
							}

							Font var44;
							if (var99 != null) { // L: 5715
								var44 = var99.getFont(); // L: 5716
								if (var44 == null) { // L: 5717
									var44 = class14.field80;
								}
							} else {
								var44 = class14.field80; // L: 5719
							}

							String var45 = null; // L: 5720
							String var46 = null; // L: 5721
							boolean var47 = false; // L: 5722
							int var48 = 0; // L: 5723
							var45 = var98.getString(var0.hitSplatValues[var103]); // L: 5724
							int var102 = var85.stringWidth(var45); // L: 5725
							if (var99 != null) { // L: 5726
								var46 = var99.getString(var0.hitSplatValues2[var103]); // L: 5727
								var48 = var44.stringWidth(var46); // L: 5728
							}

							int var49 = 0; // L: 5730
							int var50 = 0; // L: 5731
							if (var83 > 0) { // L: 5732
								if (var20 == null && var101 == null) { // L: 5733
									var49 = 1; // L: 5734
								} else {
									var49 = var102 / var83 + 1;
								}
							}

							if (var99 != null && var35 > 0) { // L: 5736 5737
								if (var32 == null && var33 == null) { // L: 5738
									var50 = 1; // L: 5739
								} else {
									var50 = var48 / var35 + 1;
								}
							}

							int var51 = 0; // L: 5742
							int var52 = var51; // L: 5743
							if (var22 > 0) { // L: 5744
								var51 += var22;
							}

							var51 += 2; // L: 5745
							int var53 = var51; // L: 5746
							if (var24 > 0) { // L: 5747
								var51 += var24;
							}

							int var54 = var51; // L: 5748
							int var55 = var51; // L: 5749
							int var56;
							if (var83 > 0) { // L: 5750
								var56 = var83 * var49; // L: 5751
								var51 += var56; // L: 5752
								var55 += (var56 - var102) / 2; // L: 5753
							} else {
								var51 += var102; // L: 5756
							}

							var56 = var51; // L: 5758
							if (var84 > 0) { // L: 5759
								var51 += var84;
							}

							int var57 = 0; // L: 5760
							int var58 = 0; // L: 5761
							int var59 = 0; // L: 5762
							int var60 = 0; // L: 5763
							int var61 = 0; // L: 5764
							int var62;
							if (var99 != null) { // L: 5765
								var51 += 2; // L: 5766
								var57 = var51; // L: 5767
								if (var34 > 0) { // L: 5768
									var51 += var34;
								}

								var51 += 2; // L: 5769
								var58 = var51; // L: 5770
								if (var36 > 0) { // L: 5771
									var51 += var36;
								}

								var59 = var51; // L: 5772
								var61 = var51; // L: 5773
								if (var35 > 0) { // L: 5774
									var62 = var35 * var50; // L: 5775
									var51 += var62; // L: 5776
									var61 += (var62 - var48) / 2; // L: 5777
								} else {
									var51 += var48; // L: 5780
								}

								var60 = var51; // L: 5782
								if (var37 > 0) { // L: 5783
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var103] - Client.cycle; // L: 5785
							int var63 = var98.field2180 - var62 * var98.field2180 / var98.field2175; // L: 5786
							int var64 = var62 * var98.field2171 / var98.field2175 + -var98.field2171; // L: 5787
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1)); // L: 5788
							int var66 = var64 + (var3 + Client.viewportTempY - 12); // L: 5789
							int var67 = var66; // L: 5790
							int var68 = var42 + var66; // L: 5791
							int var69 = var66 + var98.field2173 + 15; // L: 5792
							int var70 = var69 - var85.maxAscent; // L: 5793
							int var71 = var69 + var85.maxDescent; // L: 5794
							if (var70 < var66) { // L: 5795
								var67 = var70;
							}

							if (var71 > var68) { // L: 5796
								var68 = var71;
							}

							int var72 = 0; // L: 5797
							int var73;
							int var74;
							if (var99 != null) { // L: 5798
								var72 = var66 + var99.field2173 + 15; // L: 5799
								var73 = var72 - var44.maxAscent; // L: 5800
								var74 = var72 + var44.maxDescent; // L: 5801
								if (var73 < var67) { // L: 5802
									;
								}

								if (var74 > var68) { // L: 5803
									;
								}
							}

							var73 = 255; // L: 5805
							if (var98.field2182 >= 0) { // L: 5806
								var73 = (var62 << 8) / (var98.field2175 - var98.field2182);
							}

							if (var73 >= 0 && var73 < 255) { // L: 5807
								if (var100 != null) { // L: 5808
									var100.drawTransAt(var52 + var65 - var26, var66, var73);
								}

								if (var20 != null) { // L: 5809
									var20.drawTransAt(var65 + var53 - var28, var66, var73);
								}

								if (var82 != null) { // L: 5810
									for (var74 = 0; var74 < var49; ++var74) { // L: 5811
										var82.drawTransAt(var74 * var83 + (var54 + var65 - var27), var66, var73); // L: 5812
									}
								}

								if (var101 != null) { // L: 5815
									var101.drawTransAt(var56 + var65 - var29, var66, var73);
								}

								var85.drawAlpha(var45, var65 + var55, var69, var98.textColor, 0, var73); // L: 5816
								if (var99 != null) { // L: 5817
									if (var30 != null) { // L: 5818
										var30.drawTransAt(var65 + var57 - var38, var66, var73);
									}

									if (var32 != null) { // L: 5819
										var32.drawTransAt(var65 + var58 - var40, var66, var73);
									}

									if (var31 != null) { // L: 5820
										for (var74 = 0; var74 < var50; ++var74) { // L: 5821
											var31.drawTransAt(var74 * var35 + (var65 + var59 - var39), var66, var73); // L: 5822
										}
									}

									if (var33 != null) { // L: 5825
										var33.drawTransAt(var65 + var60 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var61 + var65, var72, var99.textColor, 0, var73); // L: 5826
								}
							} else {
								if (var100 != null) { // L: 5830
									var100.drawTransBgAt(var65 + var52 - var26, var66);
								}

								if (var20 != null) { // L: 5831
									var20.drawTransBgAt(var65 + var53 - var28, var66);
								}

								if (var82 != null) { // L: 5832
									for (var74 = 0; var74 < var49; ++var74) { // L: 5833
										var82.drawTransBgAt(var74 * var83 + (var65 + var54 - var27), var66); // L: 5834
									}
								}

								if (var101 != null) { // L: 5837
									var101.drawTransBgAt(var65 + var56 - var29, var66);
								}

								var85.draw(var45, var55 + var65, var69, var98.textColor | -16777216, 0); // L: 5838
								if (var99 != null) { // L: 5839
									if (var30 != null) { // L: 5840
										var30.drawTransBgAt(var57 + var65 - var38, var66);
									}

									if (var32 != null) { // L: 5841
										var32.drawTransBgAt(var65 + var58 - var40, var66);
									}

									if (var31 != null) { // L: 5842
										for (var74 = 0; var74 < var50; ++var74) { // L: 5843
											var31.drawTransBgAt(var74 * var35 + (var65 + var59 - var39), var66); // L: 5844
										}
									}

									if (var33 != null) { // L: 5847
										var33.drawTransBgAt(var65 + var60 - var41, var66);
									}

									var44.draw(var46, var65 + var61, var72, var99.textColor | -16777216, 0); // L: 5848
								}
							}
						}
					}
				}
			}

		}
	} // L: 5853
}
