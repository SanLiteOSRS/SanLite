import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mj")
public class class328 {
	@ObfuscatedName("at")
	public static final short[] field3585;
	@ObfuscatedName("an")
	public static final short[][] field3580;
	@ObfuscatedName("av")
	public static final short[] field3582;
	@ObfuscatedName("as")
	public static final short[][] field3583;

	static {
		field3585 = new short[]{6798, 8741, 25238, 4626, 4550}; // L: 4
		field3580 = new short[][]{{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010, -22122, 937, 8130, -13422, 30385}, {8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {4626, 11146, 6439, 12, 4758, 10270}, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574, 17050, 0, 127, -31821, -17991}}; // L: 5
		field3582 = new short[]{-10304, 9104, -1, -1, -1};
		field3583 = new short[][]{{6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002, -22116, 945, 8144, -13414, 30389}, {9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019}, new short[0], new short[0], new short[0]};
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIILig;Lic;Z[I[ILis;I)I",
		garbageValue = "-1826048180"
	)
	public static int method6347(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4, boolean var5, int[] var6, int[] var7, class215 var8) {
		var8.method4253(); // L: 11
		int var9 = var8.method4230(); // L: 12
		int var10 = var8.method4227(); // L: 13
		int[][] var11 = var8.method4229(); // L: 14
		int[][] var12 = var8.method4245(); // L: 15
		int[] var13 = var8.method4225(); // L: 16
		int[] var14 = var8.method4221(); // L: 17
		boolean var15;
		boolean var16;
		int var17;
		int var18;
		int[][] var19;
		int[][] var20;
		int[] var21;
		int[] var22;
		int var23;
		int var24;
		int var25;
		int var26;
		int var27;
		int var28;
		int var29;
		byte var30;
		int var31;
		int[][] var32;
		int var33;
		int var34;
		int var35;
		int var43;
		if (var2 == 1) { // L: 19
			var17 = var8.method4230(); // L: 22
			var18 = var8.method4227(); // L: 23
			var19 = var8.method4229(); // L: 24
			var20 = var8.method4245(); // L: 25
			var21 = var8.method4225(); // L: 26
			var22 = var8.method4221(); // L: 27
			var23 = var8.method4232(); // L: 28
			var24 = var0; // L: 29
			var25 = var1; // L: 30
			var26 = var17 >> 1; // L: 31
			var27 = var18 >> 1; // L: 32
			var28 = var0 - var26; // L: 33
			var29 = var1 - var27; // L: 34
			var20[var26][var27] = 99; // L: 35
			var19[var26][var27] = 0; // L: 36
			var30 = 0; // L: 37
			var31 = 0; // L: 38
			var21[var30] = var0; // L: 39
			var43 = var30 + 1; // L: 40
			var22[var30] = var1;
			var32 = var4.flags; // L: 41

			while (true) {
				if (var31 == var43) { // L: 44
					var8.method4223(var24, var25); // L: 115
					var16 = false; // L: 116
					break;
				}

				var24 = var21[var31]; // L: 45
				var25 = var22[var31]; // L: 46
				var31 = var31 + 1 & var23; // L: 47
				var26 = var24 - var28; // L: 48
				var27 = var25 - var29; // L: 49
				var33 = var24 - var4.xInset; // L: 50
				var34 = var25 - var4.yInset; // L: 51
				if (var3.hasArrived(1, var24, var25, var4)) { // L: 52
					var8.method4223(var24, var25); // L: 53
					var16 = true; // L: 54
					break;
				}

				var35 = var19[var26][var27] + 1; // L: 57
				if (var26 > 0 && var20[var26 - 1][var27] == 0 && (var32[var33 - 1][var34] & 19136776) == 0) { // L: 58
					var21[var43] = var24 - 1; // L: 59
					var22[var43] = var25; // L: 60
					var43 = var43 + 1 & var23; // L: 61
					var20[var26 - 1][var27] = 2; // L: 62
					var19[var26 - 1][var27] = var35; // L: 63
				}

				if (var26 < var17 - 1 && var20[var26 + 1][var27] == 0 && (var32[var33 + 1][var34] & 19136896) == 0) { // L: 65
					var21[var43] = var24 + 1; // L: 66
					var22[var43] = var25; // L: 67
					var43 = var43 + 1 & var23; // L: 68
					var20[var26 + 1][var27] = 8; // L: 69
					var19[var26 + 1][var27] = var35; // L: 70
				}

				if (var27 > 0 && var20[var26][var27 - 1] == 0 && (var32[var33][var34 - 1] & 19136770) == 0) { // L: 72
					var21[var43] = var24; // L: 73
					var22[var43] = var25 - 1; // L: 74
					var43 = var43 + 1 & var23; // L: 75
					var20[var26][var27 - 1] = 1; // L: 76
					var19[var26][var27 - 1] = var35; // L: 77
				}

				if (var27 < var18 - 1 && var20[var26][var27 + 1] == 0 && (var32[var33][var34 + 1] & 19136800) == 0) { // L: 79
					var21[var43] = var24; // L: 80
					var22[var43] = var25 + 1; // L: 81
					var43 = var43 + 1 & var23; // L: 82
					var20[var26][var27 + 1] = 4; // L: 83
					var19[var26][var27 + 1] = var35; // L: 84
				}

				if (var26 > 0 && var27 > 0 && var20[var26 - 1][var27 - 1] == 0 && (var32[var33 - 1][var34 - 1] & 19136782) == 0 && (var32[var33 - 1][var34] & 19136776) == 0 && (var32[var33][var34 - 1] & 19136770) == 0) { // L: 86
					var21[var43] = var24 - 1; // L: 87
					var22[var43] = var25 - 1; // L: 88
					var43 = var43 + 1 & var23; // L: 89
					var20[var26 - 1][var27 - 1] = 3; // L: 90
					var19[var26 - 1][var27 - 1] = var35; // L: 91
				}

				if (var26 < var17 - 1 && var27 > 0 && var20[var26 + 1][var27 - 1] == 0 && (var32[var33 + 1][var34 - 1] & 19136899) == 0 && (var32[var33 + 1][var34] & 19136896) == 0 && (var32[var33][var34 - 1] & 19136770) == 0) { // L: 93
					var21[var43] = var24 + 1; // L: 94
					var22[var43] = var25 - 1; // L: 95
					var43 = var43 + 1 & var23; // L: 96
					var20[var26 + 1][var27 - 1] = 9; // L: 97
					var19[var26 + 1][var27 - 1] = var35; // L: 98
				}

				if (var26 > 0 && var27 < var18 - 1 && var20[var26 - 1][var27 + 1] == 0 && (var32[var33 - 1][var34 + 1] & 19136824) == 0 && (var32[var33 - 1][var34] & 19136776) == 0 && (var32[var33][var34 + 1] & 19136800) == 0) { // L: 100
					var21[var43] = var24 - 1; // L: 101
					var22[var43] = var25 + 1; // L: 102
					var43 = var43 + 1 & var23; // L: 103
					var20[var26 - 1][var27 + 1] = 6; // L: 104
					var19[var26 - 1][var27 + 1] = var35; // L: 105
				}

				if (var26 < var17 - 1 && var27 < var18 - 1 && var20[var26 + 1][var27 + 1] == 0 && (var32[var33 + 1][var34 + 1] & 19136992) == 0 && (var32[var33 + 1][var34] & 19136896) == 0 && (var32[var33][var34 + 1] & 19136800) == 0) { // L: 107
					var21[var43] = var24 + 1; // L: 108
					var22[var43] = var25 + 1; // L: 109
					var43 = var43 + 1 & var23; // L: 110
					var20[var26 + 1][var27 + 1] = 12; // L: 111
					var19[var26 + 1][var27 + 1] = var35; // L: 112
				}
			}

			var15 = var16; // L: 118
		} else if (var2 == 2) { // L: 120
			var17 = var8.method4230(); // L: 123
			var18 = var8.method4227(); // L: 124
			var19 = var8.method4229(); // L: 125
			var20 = var8.method4245(); // L: 126
			var21 = var8.method4225(); // L: 127
			var22 = var8.method4221(); // L: 128
			var23 = var8.method4232(); // L: 129
			var24 = var0; // L: 130
			var25 = var1; // L: 131
			var26 = var17 >> 1; // L: 132
			var27 = var18 >> 1; // L: 133
			var28 = var0 - var26; // L: 134
			var29 = var1 - var27; // L: 135
			var20[var26][var27] = 99; // L: 136
			var19[var26][var27] = 0; // L: 137
			var30 = 0; // L: 138
			var31 = 0; // L: 139
			var21[var30] = var0; // L: 140
			var43 = var30 + 1; // L: 141
			var22[var30] = var1;
			var32 = var4.flags; // L: 142

			while (true) {
				if (var43 == var31) { // L: 143
					var8.method4223(var24, var25); // L: 242
					var16 = false; // L: 243
					break;
				}

				var24 = var21[var31]; // L: 144
				var25 = var22[var31]; // L: 145
				var31 = var31 + 1 & var23; // L: 146
				var26 = var24 - var28; // L: 147
				var27 = var25 - var29; // L: 148
				var33 = var24 - var4.xInset; // L: 149
				var34 = var25 - var4.yInset; // L: 150
				if (var3.hasArrived(2, var24, var25, var4)) { // L: 151
					var8.method4223(var24, var25); // L: 152
					var16 = true; // L: 153
					break;
				}

				var35 = var19[var26][var27] + 1; // L: 156
				if (var26 > 0 && var20[var26 - 1][var27] == 0 && (var32[var33 - 1][var34] & 19136782) == 0 && (var32[var33 - 1][var34 + 1] & 19136824) == 0) { // L: 157 158 159 160
					var21[var43] = var24 - 1; // L: 161
					var22[var43] = var25; // L: 162
					var43 = var43 + 1 & var23; // L: 163
					var20[var26 - 1][var27] = 2; // L: 164
					var19[var26 - 1][var27] = var35; // L: 165
				}

				if (var26 < var17 - 2 && var20[var26 + 1][var27] == 0 && (var32[var33 + 2][var34] & 19136899) == 0 && (var32[var33 + 2][var34 + 1] & 19136992) == 0) { // L: 167 168 169 170
					var21[var43] = var24 + 1; // L: 171
					var22[var43] = var25; // L: 172
					var43 = var43 + 1 & var23; // L: 173
					var20[var26 + 1][var27] = 8; // L: 174
					var19[var26 + 1][var27] = var35; // L: 175
				}

				if (var27 > 0 && var20[var26][var27 - 1] == 0 && (var32[var33][var34 - 1] & 19136782) == 0 && (var32[var33 + 1][var34 - 1] & 19136899) == 0) { // L: 177 178 179 180
					var21[var43] = var24; // L: 181
					var22[var43] = var25 - 1; // L: 182
					var43 = var43 + 1 & var23; // L: 183
					var20[var26][var27 - 1] = 1; // L: 184
					var19[var26][var27 - 1] = var35; // L: 185
				}

				if (var27 < var18 - 2 && var20[var26][var27 + 1] == 0 && (var32[var33][var34 + 2] & 19136824) == 0 && (var32[var33 + 1][var34 + 2] & 19136992) == 0) { // L: 187 188 189 190
					var21[var43] = var24; // L: 191
					var22[var43] = var25 + 1; // L: 192
					var43 = var43 + 1 & var23; // L: 193
					var20[var26][var27 + 1] = 4; // L: 194
					var19[var26][var27 + 1] = var35; // L: 195
				}

				if (var26 > 0 && var27 > 0 && var20[var26 - 1][var27 - 1] == 0 && (var32[var33 - 1][var34] & 19136830) == 0 && (var32[var33 - 1][var34 - 1] & 19136782) == 0 && (var32[var33][var34 - 1] & 19136911) == 0) { // L: 197 198 199 200 201
					var21[var43] = var24 - 1; // L: 202
					var22[var43] = var25 - 1; // L: 203
					var43 = var43 + 1 & var23; // L: 204
					var20[var26 - 1][var27 - 1] = 3; // L: 205
					var19[var26 - 1][var27 - 1] = var35; // L: 206
				}

				if (var26 < var17 - 2 && var27 > 0 && var20[var26 + 1][var27 - 1] == 0 && (var32[var33 + 1][var34 - 1] & 19136911) == 0 && (var32[var33 + 2][var34 - 1] & 19136899) == 0 && (var32[var33 + 2][var34] & 19136995) == 0) { // L: 208 209 210 211 212
					var21[var43] = var24 + 1; // L: 213
					var22[var43] = var25 - 1; // L: 214
					var43 = var43 + 1 & var23; // L: 215
					var20[var26 + 1][var27 - 1] = 9; // L: 216
					var19[var26 + 1][var27 - 1] = var35; // L: 217
				}

				if (var26 > 0 && var27 < var18 - 2 && var20[var26 - 1][var27 + 1] == 0 && (var32[var33 - 1][var34 + 1] & 19136830) == 0 && (var32[var33 - 1][var34 + 2] & 19136824) == 0 && (var32[var33][var34 + 2] & 19137016) == 0) { // L: 219 220 221 222 223
					var21[var43] = var24 - 1; // L: 224
					var22[var43] = var25 + 1; // L: 225
					var43 = var43 + 1 & var23; // L: 226
					var20[var26 - 1][var27 + 1] = 6; // L: 227
					var19[var26 - 1][var27 + 1] = var35; // L: 228
				}

				if (var26 < var17 - 2 && var27 < var18 - 2 && var20[var26 + 1][var27 + 1] == 0 && (var32[var33 + 1][var34 + 2] & 19137016) == 0 && (var32[var33 + 2][var34 + 2] & 19136992) == 0 && (var32[var33 + 2][var34 + 1] & 19136995) == 0) { // L: 230 231 232 233 234
					var21[var43] = var24 + 1; // L: 235
					var22[var43] = var25 + 1; // L: 236
					var43 = var43 + 1 & var23; // L: 237
					var20[var26 + 1][var27 + 1] = 12; // L: 238
					var19[var26 + 1][var27 + 1] = var35; // L: 239
				}
			}

			var15 = var16; // L: 245
		} else {
			var17 = var8.method4230(); // L: 250
			var18 = var8.method4227(); // L: 251
			var19 = var8.method4229(); // L: 252
			var20 = var8.method4245(); // L: 253
			var21 = var8.method4225(); // L: 254
			var22 = var8.method4221(); // L: 255
			var23 = var8.method4232(); // L: 256
			var24 = var0; // L: 257
			var25 = var1; // L: 258
			var26 = var17 >> 1; // L: 259
			var27 = var18 >> 1; // L: 260
			var28 = var0 - var26; // L: 261
			var29 = var1 - var27; // L: 262
			var20[var26][var27] = 99; // L: 263
			var19[var26][var27] = 0; // L: 264
			var30 = 0; // L: 265
			var31 = 0; // L: 266
			var21[var30] = var0; // L: 267
			var43 = var30 + 1; // L: 268
			var22[var30] = var1;
			var32 = var4.flags; // L: 269

			label754:
			while (true) {
				label752:
				while (true) {
					int var36;
					do {
						do {
							do {
								label729:
								do {
									if (var31 == var43) { // L: 270
										var8.method4223(var24, var25); // L: 389
										var16 = false; // L: 390
										break label754;
									}

									var24 = var21[var31]; // L: 271
									var25 = var22[var31]; // L: 272
									var31 = var31 + 1 & var23; // L: 273
									var26 = var24 - var28; // L: 274
									var27 = var25 - var29; // L: 275
									var33 = var24 - var4.xInset; // L: 276
									var34 = var25 - var4.yInset; // L: 277
									if (var3.hasArrived(var2, var24, var25, var4)) { // L: 278
										var8.method4223(var24, var25); // L: 279
										var16 = true; // L: 280
										break label754;
									}

									var35 = var19[var26][var27] + 1; // L: 283
									if (var26 > 0 && var20[var26 - 1][var27] == 0 && (var32[var33 - 1][var34] & 19136782) == 0 && (var32[var33 - 1][var34 + var2 - 1] & 19136824) == 0) { // L: 284 285 286 287
										var36 = 1;

										while (true) {
											if (var36 >= var2 - 1) {
												var21[var43] = var24 - 1; // L: 291
												var22[var43] = var25; // L: 292
												var43 = var43 + 1 & var23; // L: 293
												var20[var26 - 1][var27] = 2; // L: 294
												var19[var26 - 1][var27] = var35; // L: 295
												break;
											}

											if ((var32[var33 - 1][var34 + var36] & 19136830) != 0) { // L: 289
												break;
											}

											++var36; // L: 288
										}
									}

									if (var26 < var17 - var2 && var20[var26 + 1][var27] == 0 && (var32[var33 + var2][var34] & 19136899) == 0 && (var32[var33 + var2][var34 + var2 - 1] & 19136992) == 0) { // L: 297 298 299 300
										var36 = 1;

										while (true) {
											if (var36 >= var2 - 1) {
												var21[var43] = var24 + 1; // L: 304
												var22[var43] = var25; // L: 305
												var43 = var43 + 1 & var23; // L: 306
												var20[var26 + 1][var27] = 8; // L: 307
												var19[var26 + 1][var27] = var35; // L: 308
												break;
											}

											if ((var32[var33 + var2][var34 + var36] & 19136995) != 0) { // L: 302
												break;
											}

											++var36; // L: 301
										}
									}

									if (var27 > 0 && var20[var26][var27 - 1] == 0 && (var32[var33][var34 - 1] & 19136782) == 0 && (var32[var33 + var2 - 1][var34 - 1] & 19136899) == 0) { // L: 310 311 312 313
										var36 = 1;

										while (true) {
											if (var36 >= var2 - 1) {
												var21[var43] = var24; // L: 317
												var22[var43] = var25 - 1; // L: 318
												var43 = var43 + 1 & var23; // L: 319
												var20[var26][var27 - 1] = 1; // L: 320
												var19[var26][var27 - 1] = var35; // L: 321
												break;
											}

											if ((var32[var36 + var33][var34 - 1] & 19136911) != 0) { // L: 315
												break;
											}

											++var36; // L: 314
										}
									}

									if (var27 < var18 - var2 && var20[var26][var27 + 1] == 0 && (var32[var33][var34 + var2] & 19136824) == 0 && (var32[var33 + var2 - 1][var34 + var2] & 19136992) == 0) { // L: 323 324 325 326
										var36 = 1;

										while (true) {
											if (var36 >= var2 - 1) {
												var21[var43] = var24; // L: 330
												var22[var43] = var25 + 1; // L: 331
												var43 = var43 + 1 & var23; // L: 332
												var20[var26][var27 + 1] = 4; // L: 333
												var19[var26][var27 + 1] = var35; // L: 334
												break;
											}

											if ((var32[var36 + var33][var34 + var2] & 19137016) != 0) { // L: 328
												break;
											}

											++var36; // L: 327
										}
									}

									if (var26 > 0 && var27 > 0 && var20[var26 - 1][var27 - 1] == 0 && (var32[var33 - 1][var34 - 1] & 19136782) == 0) { // L: 336 337 338
										var36 = 1;

										while (true) {
											if (var36 >= var2) {
												var21[var43] = var24 - 1; // L: 343
												var22[var43] = var25 - 1; // L: 344
												var43 = var43 + 1 & var23; // L: 345
												var20[var26 - 1][var27 - 1] = 3; // L: 346
												var19[var26 - 1][var27 - 1] = var35; // L: 347
												break;
											}

											if ((var32[var33 - 1][var36 + (var34 - 1)] & 19136830) != 0 || (var32[var36 + (var33 - 1)][var34 - 1] & 19136911) != 0) { // L: 340 341
												break;
											}

											++var36; // L: 339
										}
									}

									if (var26 < var17 - var2 && var27 > 0 && var20[var26 + 1][var27 - 1] == 0 && (var32[var33 + var2][var34 - 1] & 19136899) == 0) { // L: 349 350 351
										var36 = 1;

										while (true) {
											if (var36 >= var2) {
												var21[var43] = var24 + 1; // L: 356
												var22[var43] = var25 - 1; // L: 357
												var43 = var43 + 1 & var23; // L: 358
												var20[var26 + 1][var27 - 1] = 9; // L: 359
												var19[var26 + 1][var27 - 1] = var35; // L: 360
												break;
											}

											if ((var32[var33 + var2][var36 + (var34 - 1)] & 19136995) != 0 || (var32[var36 + var33][var34 - 1] & 19136911) != 0) { // L: 353 354
												break;
											}

											++var36; // L: 352
										}
									}

									if (var26 > 0 && var27 < var18 - var2 && var20[var26 - 1][var27 + 1] == 0 && (var32[var33 - 1][var34 + var2] & 19136824) == 0) { // L: 362 363 364
										for (var36 = 1; var36 < var2; ++var36) { // L: 365
											if ((var32[var33 - 1][var36 + var34] & 19136830) != 0 || (var32[var36 + (var33 - 1)][var34 + var2] & 19137016) != 0) { // L: 366 367
												continue label729;
											}
										}

										var21[var43] = var24 - 1; // L: 369
										var22[var43] = var25 + 1; // L: 370
										var43 = var43 + 1 & var23; // L: 371
										var20[var26 - 1][var27 + 1] = 6; // L: 372
										var19[var26 - 1][var27 + 1] = var35; // L: 373
									}
								} while(var26 >= var17 - var2); // L: 375
							} while(var27 >= var18 - var2);
						} while(var20[var26 + 1][var27 + 1] != 0); // L: 376
					} while((var32[var33 + var2][var34 + var2] & 19136992) != 0); // L: 377

					for (var36 = 1; var36 < var2; ++var36) { // L: 378
						if ((var32[var33 + var36][var34 + var2] & 19137016) != 0 || (var32[var33 + var2][var34 + var36] & 19136995) != 0) { // L: 379 380
							continue label752;
						}
					}

					var21[var43] = var24 + 1; // L: 382
					var22[var43] = var25 + 1; // L: 383
					var43 = var43 + 1 & var23; // L: 384
					var20[var26 + 1][var27 + 1] = 12; // L: 385
					var19[var26 + 1][var27 + 1] = var35; // L: 386
				}
			}

			var15 = var16; // L: 392
		}

		int var42 = var0 - (var9 >> 1); // L: 394
		var17 = var1 - (var10 >> 1); // L: 395
		var18 = var8.method4243(); // L: 396
		int var37 = var8.method4251(); // L: 397
		int var38;
		int var39;
		if (!var15) { // L: 398
			var38 = Integer.MAX_VALUE; // L: 400
			var39 = Integer.MAX_VALUE; // L: 401
			byte var40 = 10; // L: 402
			var23 = var3.approxDestinationX; // L: 403
			var24 = var3.approxDestinationY; // L: 404
			var25 = var3.approxDestinationSizeX; // L: 405
			var26 = var3.approxDestinationSizeY; // L: 406

			for (var27 = var23 - var40; var27 <= var23 + var40; ++var27) { // L: 407
				for (var28 = var24 - var40; var28 <= var40 + var24; ++var28) { // L: 408
					var29 = var27 - var42; // L: 409
					var43 = var28 - var17; // L: 410
					if (var29 >= 0 && var43 >= 0 && var29 < var9 && var43 < var10 && var11[var29][var43] < 100) { // L: 411 412
						var31 = 0; // L: 413
						if (var27 < var23) { // L: 414
							var31 = var23 - var27;
						} else if (var27 > var25 + var23 - 1) { // L: 415
							var31 = var27 - (var25 + var23 - 1);
						}

						int var41 = 0; // L: 416
						if (var28 < var24) { // L: 417
							var41 = var24 - var28;
						} else if (var28 > var24 + var26 - 1) { // L: 418
							var41 = var28 - (var26 + var24 - 1);
						}

						var33 = var41 * var41 + var31 * var31; // L: 419
						if (var33 < var38 || var33 == var38 && var11[var29][var43] < var39) { // L: 420
							var38 = var33; // L: 421
							var39 = var11[var29][var43]; // L: 422
							var18 = var27; // L: 423
							var37 = var28; // L: 424
						}
					}
				}
			}

			if (var38 == Integer.MAX_VALUE) { // L: 430
				return -1;
			}
		}

		if (var0 == var18 && var37 == var1) { // L: 434
			var6[0] = var18; // L: 435
			var7[0] = var37; // L: 436
			return 0; // L: 437
		} else {
			byte var44 = 0; // L: 439
			var13[var44] = var18; // L: 442
			var38 = var44 + 1; // L: 443
			var14[var44] = var37;

			int var45;
			for (var39 = var45 = var12[var18 - var42][var37 - var17]; var0 != var18 || var37 != var1; var39 = var12[var18 - var42][var37 - var17]) { // L: 444 445 455
				if (var39 != var45) { // L: 446
					var45 = var39; // L: 447
					var13[var38] = var18; // L: 448
					var14[var38++] = var37; // L: 449
				}

				if ((var39 & 2) != 0) { // L: 451
					++var18;
				} else if ((var39 & 8) != 0) { // L: 452
					--var18;
				}

				if ((var39 & 1) != 0) { // L: 453
					++var37;
				} else if ((var39 & 4) != 0) { // L: 454
					--var37;
				}
			}

			var23 = 0; // L: 457

			while (var38-- > 0) { // L: 458
				var6[var23] = var13[var38]; // L: 459
				var7[var23++] = var14[var38]; // L: 460
				if (var23 >= var6.length) { // L: 461
					break;
				}
			}

			return var23; // L: 463
		}
	}
}
