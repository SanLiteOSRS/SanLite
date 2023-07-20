import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("ay")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096];
	}

	WorldMapSprite(int[] var1) {
		this.tileColors = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1192538000"
	)
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var1 + var2 * 64];
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIILin;Lij;Z[I[ILiq;I)I",
		garbageValue = "-475105468"
	)
	public static int method5513(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4, boolean var5, int[] var6, int[] var7, class217 var8) {
		var8.method4232(); // L: 11
		int var9 = var8.method4236(); // L: 12
		int var10 = var8.method4237(); // L: 13
		int[][] var11 = var8.method4260(); // L: 14
		int[][] var12 = var8.method4238(); // L: 15
		int[] var13 = var8.method4240(); // L: 16
		int[] var14 = var8.method4241(); // L: 17
		boolean var15;
		int var17;
		int var18;
		int var23;
		int var24;
		int var25;
		int var26;
		int var27;
		int var28;
		int var29;
		int var31;
		int var33;
		int var43;
		if (var2 == 1) { // L: 19
			var15 = class172.method3519(var0, var1, var3, var4, var8);
		} else {
			boolean var16;
			int[][] var19;
			int[][] var20;
			int[] var21;
			int[] var22;
			byte var30;
			int[][] var32;
			int var34;
			int var35;
			if (var2 == 2) { // L: 20
				var17 = var8.method4236(); // L: 23
				var18 = var8.method4237(); // L: 24
				var19 = var8.method4260(); // L: 25
				var20 = var8.method4238(); // L: 26
				var21 = var8.method4240(); // L: 27
				var22 = var8.method4241(); // L: 28
				var23 = var8.method4242(); // L: 29
				var24 = var0; // L: 30
				var25 = var1; // L: 31
				var26 = var17 >> 1; // L: 32
				var27 = var18 >> 1; // L: 33
				var28 = var0 - var26; // L: 34
				var29 = var1 - var27; // L: 35
				var20[var26][var27] = 99; // L: 36
				var19[var26][var27] = 0; // L: 37
				var30 = 0; // L: 38
				var31 = 0; // L: 39
				var21[var30] = var0; // L: 40
				var43 = var30 + 1; // L: 41
				var22[var30] = var1;
				var32 = var4.flags; // L: 42

				while (true) {
					if (var43 == var31) { // L: 43
						var8.method4233(var24, var25); // L: 142
						var16 = false; // L: 143
						break;
					}

					var24 = var21[var31]; // L: 44
					var25 = var22[var31]; // L: 45
					var31 = var31 + 1 & var23; // L: 46
					var26 = var24 - var28; // L: 47
					var27 = var25 - var29; // L: 48
					var33 = var24 - var4.xInset; // L: 49
					var34 = var25 - var4.yInset; // L: 50
					if (var3.hasArrived(2, var24, var25, var4)) { // L: 51
						var8.method4233(var24, var25); // L: 52
						var16 = true; // L: 53
						break;
					}

					var35 = var19[var26][var27] + 1; // L: 56
					if (var26 > 0 && var20[var26 - 1][var27] == 0 && (var32[var33 - 1][var34] & 19136782) == 0 && (var32[var33 - 1][var34 + 1] & 19136824) == 0) { // L: 57 58 59 60
						var21[var43] = var24 - 1; // L: 61
						var22[var43] = var25; // L: 62
						var43 = var43 + 1 & var23; // L: 63
						var20[var26 - 1][var27] = 2; // L: 64
						var19[var26 - 1][var27] = var35; // L: 65
					}

					if (var26 < var17 - 2 && var20[var26 + 1][var27] == 0 && (var32[var33 + 2][var34] & 19136899) == 0 && (var32[var33 + 2][var34 + 1] & 19136992) == 0) { // L: 67 68 69 70
						var21[var43] = var24 + 1; // L: 71
						var22[var43] = var25; // L: 72
						var43 = var43 + 1 & var23; // L: 73
						var20[var26 + 1][var27] = 8; // L: 74
						var19[var26 + 1][var27] = var35; // L: 75
					}

					if (var27 > 0 && var20[var26][var27 - 1] == 0 && (var32[var33][var34 - 1] & 19136782) == 0 && (var32[var33 + 1][var34 - 1] & 19136899) == 0) { // L: 77 78 79 80
						var21[var43] = var24; // L: 81
						var22[var43] = var25 - 1; // L: 82
						var43 = var43 + 1 & var23; // L: 83
						var20[var26][var27 - 1] = 1; // L: 84
						var19[var26][var27 - 1] = var35; // L: 85
					}

					if (var27 < var18 - 2 && var20[var26][var27 + 1] == 0 && (var32[var33][var34 + 2] & 19136824) == 0 && (var32[var33 + 1][var34 + 2] & 19136992) == 0) { // L: 87 88 89 90
						var21[var43] = var24; // L: 91
						var22[var43] = var25 + 1; // L: 92
						var43 = var43 + 1 & var23; // L: 93
						var20[var26][var27 + 1] = 4; // L: 94
						var19[var26][var27 + 1] = var35; // L: 95
					}

					if (var26 > 0 && var27 > 0 && var20[var26 - 1][var27 - 1] == 0 && (var32[var33 - 1][var34] & 19136830) == 0 && (var32[var33 - 1][var34 - 1] & 19136782) == 0 && (var32[var33][var34 - 1] & 19136911) == 0) { // L: 97 98 99 100 101
						var21[var43] = var24 - 1; // L: 102
						var22[var43] = var25 - 1; // L: 103
						var43 = var43 + 1 & var23; // L: 104
						var20[var26 - 1][var27 - 1] = 3; // L: 105
						var19[var26 - 1][var27 - 1] = var35; // L: 106
					}

					if (var26 < var17 - 2 && var27 > 0 && var20[var26 + 1][var27 - 1] == 0 && (var32[var33 + 1][var34 - 1] & 19136911) == 0 && (var32[var33 + 2][var34 - 1] & 19136899) == 0 && (var32[var33 + 2][var34] & 19136995) == 0) { // L: 108 109 110 111 112
						var21[var43] = var24 + 1; // L: 113
						var22[var43] = var25 - 1; // L: 114
						var43 = var43 + 1 & var23; // L: 115
						var20[var26 + 1][var27 - 1] = 9; // L: 116
						var19[var26 + 1][var27 - 1] = var35; // L: 117
					}

					if (var26 > 0 && var27 < var18 - 2 && var20[var26 - 1][var27 + 1] == 0 && (var32[var33 - 1][var34 + 1] & 19136830) == 0 && (var32[var33 - 1][var34 + 2] & 19136824) == 0 && (var32[var33][var34 + 2] & 19137016) == 0) { // L: 119 120 121 122 123
						var21[var43] = var24 - 1; // L: 124
						var22[var43] = var25 + 1; // L: 125
						var43 = var43 + 1 & var23; // L: 126
						var20[var26 - 1][var27 + 1] = 6; // L: 127
						var19[var26 - 1][var27 + 1] = var35; // L: 128
					}

					if (var26 < var17 - 2 && var27 < var18 - 2 && var20[var26 + 1][var27 + 1] == 0 && (var32[var33 + 1][var34 + 2] & 19137016) == 0 && (var32[var33 + 2][var34 + 2] & 19136992) == 0 && (var32[var33 + 2][var34 + 1] & 19136995) == 0) { // L: 130 131 132 133 134
						var21[var43] = var24 + 1; // L: 135
						var22[var43] = var25 + 1; // L: 136
						var43 = var43 + 1 & var23; // L: 137
						var20[var26 + 1][var27 + 1] = 12; // L: 138
						var19[var26 + 1][var27 + 1] = var35; // L: 139
					}
				}

				var15 = var16; // L: 145
			} else {
				var17 = var8.method4236(); // L: 150
				var18 = var8.method4237(); // L: 151
				var19 = var8.method4260(); // L: 152
				var20 = var8.method4238(); // L: 153
				var21 = var8.method4240(); // L: 154
				var22 = var8.method4241(); // L: 155
				var23 = var8.method4242(); // L: 156
				var24 = var0; // L: 157
				var25 = var1; // L: 158
				var26 = var17 >> 1; // L: 159
				var27 = var18 >> 1; // L: 160
				var28 = var0 - var26; // L: 161
				var29 = var1 - var27; // L: 162
				var20[var26][var27] = 99; // L: 163
				var19[var26][var27] = 0; // L: 164
				var30 = 0; // L: 165
				var31 = 0; // L: 166
				var21[var30] = var0; // L: 167
				var43 = var30 + 1; // L: 168
				var22[var30] = var1;
				var32 = var4.flags; // L: 169

				label624:
				while (true) {
					label622:
					while (true) {
						int var36;
						do {
							do {
								do {
									label599:
									do {
										if (var31 == var43) { // L: 170
											var8.method4233(var24, var25); // L: 289
											var16 = false; // L: 290
											break label624;
										}

										var24 = var21[var31]; // L: 171
										var25 = var22[var31]; // L: 172
										var31 = var31 + 1 & var23; // L: 173
										var26 = var24 - var28; // L: 174
										var27 = var25 - var29; // L: 175
										var33 = var24 - var4.xInset; // L: 176
										var34 = var25 - var4.yInset; // L: 177
										if (var3.hasArrived(var2, var24, var25, var4)) { // L: 178
											var8.method4233(var24, var25); // L: 179
											var16 = true; // L: 180
											break label624;
										}

										var35 = var19[var26][var27] + 1; // L: 183
										if (var26 > 0 && var20[var26 - 1][var27] == 0 && (var32[var33 - 1][var34] & 19136782) == 0 && (var32[var33 - 1][var34 + var2 - 1] & 19136824) == 0) { // L: 184 185 186 187
											var36 = 1;

											while (true) {
												if (var36 >= var2 - 1) {
													var21[var43] = var24 - 1; // L: 191
													var22[var43] = var25; // L: 192
													var43 = var43 + 1 & var23; // L: 193
													var20[var26 - 1][var27] = 2; // L: 194
													var19[var26 - 1][var27] = var35; // L: 195
													break;
												}

												if ((var32[var33 - 1][var34 + var36] & 19136830) != 0) { // L: 189
													break;
												}

												++var36; // L: 188
											}
										}

										if (var26 < var17 - var2 && var20[var26 + 1][var27] == 0 && (var32[var33 + var2][var34] & 19136899) == 0 && (var32[var33 + var2][var34 + var2 - 1] & 19136992) == 0) { // L: 197 198 199 200
											var36 = 1;

											while (true) {
												if (var36 >= var2 - 1) {
													var21[var43] = var24 + 1; // L: 204
													var22[var43] = var25; // L: 205
													var43 = var43 + 1 & var23; // L: 206
													var20[var26 + 1][var27] = 8; // L: 207
													var19[var26 + 1][var27] = var35; // L: 208
													break;
												}

												if ((var32[var33 + var2][var34 + var36] & 19136995) != 0) { // L: 202
													break;
												}

												++var36; // L: 201
											}
										}

										if (var27 > 0 && var20[var26][var27 - 1] == 0 && (var32[var33][var34 - 1] & 19136782) == 0 && (var32[var33 + var2 - 1][var34 - 1] & 19136899) == 0) { // L: 210 211 212 213
											var36 = 1;

											while (true) {
												if (var36 >= var2 - 1) {
													var21[var43] = var24; // L: 217
													var22[var43] = var25 - 1; // L: 218
													var43 = var43 + 1 & var23; // L: 219
													var20[var26][var27 - 1] = 1; // L: 220
													var19[var26][var27 - 1] = var35; // L: 221
													break;
												}

												if ((var32[var36 + var33][var34 - 1] & 19136911) != 0) { // L: 215
													break;
												}

												++var36; // L: 214
											}
										}

										if (var27 < var18 - var2 && var20[var26][var27 + 1] == 0 && (var32[var33][var34 + var2] & 19136824) == 0 && (var32[var33 + var2 - 1][var34 + var2] & 19136992) == 0) { // L: 223 224 225 226
											var36 = 1;

											while (true) {
												if (var36 >= var2 - 1) {
													var21[var43] = var24; // L: 230
													var22[var43] = var25 + 1; // L: 231
													var43 = var43 + 1 & var23; // L: 232
													var20[var26][var27 + 1] = 4; // L: 233
													var19[var26][var27 + 1] = var35; // L: 234
													break;
												}

												if ((var32[var33 + var36][var34 + var2] & 19137016) != 0) { // L: 228
													break;
												}

												++var36; // L: 227
											}
										}

										if (var26 > 0 && var27 > 0 && var20[var26 - 1][var27 - 1] == 0 && (var32[var33 - 1][var34 - 1] & 19136782) == 0) { // L: 236 237 238
											var36 = 1;

											while (true) {
												if (var36 >= var2) {
													var21[var43] = var24 - 1; // L: 243
													var22[var43] = var25 - 1; // L: 244
													var43 = var43 + 1 & var23; // L: 245
													var20[var26 - 1][var27 - 1] = 3; // L: 246
													var19[var26 - 1][var27 - 1] = var35; // L: 247
													break;
												}

												if ((var32[var33 - 1][var36 + (var34 - 1)] & 19136830) != 0 || (var32[var36 + (var33 - 1)][var34 - 1] & 19136911) != 0) { // L: 240 241
													break;
												}

												++var36; // L: 239
											}
										}

										if (var26 < var17 - var2 && var27 > 0 && var20[var26 + 1][var27 - 1] == 0 && (var32[var33 + var2][var34 - 1] & 19136899) == 0) { // L: 249 250 251
											var36 = 1;

											while (true) {
												if (var36 >= var2) {
													var21[var43] = var24 + 1; // L: 256
													var22[var43] = var25 - 1; // L: 257
													var43 = var43 + 1 & var23; // L: 258
													var20[var26 + 1][var27 - 1] = 9; // L: 259
													var19[var26 + 1][var27 - 1] = var35; // L: 260
													break;
												}

												if ((var32[var33 + var2][var36 + (var34 - 1)] & 19136995) != 0 || (var32[var33 + var36][var34 - 1] & 19136911) != 0) { // L: 253 254
													break;
												}

												++var36; // L: 252
											}
										}

										if (var26 > 0 && var27 < var18 - var2 && var20[var26 - 1][var27 + 1] == 0 && (var32[var33 - 1][var34 + var2] & 19136824) == 0) { // L: 262 263 264
											for (var36 = 1; var36 < var2; ++var36) { // L: 265
												if ((var32[var33 - 1][var36 + var34] & 19136830) != 0 || (var32[var36 + (var33 - 1)][var34 + var2] & 19137016) != 0) { // L: 266 267
													continue label599;
												}
											}

											var21[var43] = var24 - 1; // L: 269
											var22[var43] = var25 + 1; // L: 270
											var43 = var43 + 1 & var23; // L: 271
											var20[var26 - 1][var27 + 1] = 6; // L: 272
											var19[var26 - 1][var27 + 1] = var35; // L: 273
										}
									} while(var26 >= var17 - var2); // L: 275
								} while(var27 >= var18 - var2);
							} while(var20[var26 + 1][var27 + 1] != 0); // L: 276
						} while((var32[var33 + var2][var34 + var2] & 19136992) != 0); // L: 277

						for (var36 = 1; var36 < var2; ++var36) { // L: 278
							if ((var32[var33 + var36][var34 + var2] & 19137016) != 0 || (var32[var33 + var2][var36 + var34] & 19136995) != 0) { // L: 279 280
								continue label622;
							}
						}

						var21[var43] = var24 + 1; // L: 282
						var22[var43] = var25 + 1; // L: 283
						var43 = var43 + 1 & var23; // L: 284
						var20[var26 + 1][var27 + 1] = 12; // L: 285
						var19[var26 + 1][var27 + 1] = var35; // L: 286
					}
				}

				var15 = var16; // L: 292
			}
		}

		int var42 = var0 - (var9 >> 1); // L: 294
		var17 = var1 - (var10 >> 1); // L: 295
		var18 = var8.method4234(); // L: 296
		int var37 = var8.method4257(); // L: 297
		int var38;
		int var39;
		if (!var15) { // L: 298
			var38 = Integer.MAX_VALUE; // L: 300
			var39 = Integer.MAX_VALUE; // L: 301
			byte var40 = 10; // L: 302
			var23 = var3.approxDestinationX; // L: 303
			var24 = var3.approxDestinationY; // L: 304
			var25 = var3.approxDestinationSizeX; // L: 305
			var26 = var3.approxDestinationSizeY; // L: 306

			for (var27 = var23 - var40; var27 <= var40 + var23; ++var27) { // L: 307
				for (var28 = var24 - var40; var28 <= var24 + var40; ++var28) { // L: 308
					var29 = var27 - var42; // L: 309
					var43 = var28 - var17; // L: 310
					if (var29 >= 0 && var43 >= 0 && var29 < var9 && var43 < var10 && var11[var29][var43] < 100) { // L: 311 312
						var31 = 0; // L: 313
						if (var27 < var23) { // L: 314
							var31 = var23 - var27;
						} else if (var27 > var23 + var25 - 1) { // L: 315
							var31 = var27 - (var23 + var25 - 1);
						}

						int var41 = 0; // L: 316
						if (var28 < var24) { // L: 317
							var41 = var24 - var28;
						} else if (var28 > var26 + var24 - 1) { // L: 318
							var41 = var28 - (var26 + var24 - 1);
						}

						var33 = var31 * var31 + var41 * var41; // L: 319
						if (var33 < var38 || var38 == var33 && var11[var29][var43] < var39) { // L: 320
							var38 = var33; // L: 321
							var39 = var11[var29][var43]; // L: 322
							var18 = var27; // L: 323
							var37 = var28; // L: 324
						}
					}
				}
			}

			if (var38 == Integer.MAX_VALUE) { // L: 330
				return -1;
			}
		}

		if (var0 == var18 && var37 == var1) { // L: 334
			var6[0] = var18; // L: 335
			var7[0] = var37; // L: 336
			return 0; // L: 337
		} else {
			byte var44 = 0; // L: 339
			var13[var44] = var18; // L: 342
			var38 = var44 + 1; // L: 343
			var14[var44] = var37;

			int var45;
			for (var39 = var45 = var12[var18 - var42][var37 - var17]; var0 != var18 || var37 != var1; var39 = var12[var18 - var42][var37 - var17]) { // L: 344 345 355
				if (var45 != var39) { // L: 346
					var45 = var39; // L: 347
					var13[var38] = var18; // L: 348
					var14[var38++] = var37; // L: 349
				}

				if ((var39 & 2) != 0) { // L: 351
					++var18;
				} else if ((var39 & 8) != 0) { // L: 352
					--var18;
				}

				if ((var39 & 1) != 0) { // L: 353
					++var37;
				} else if ((var39 & 4) != 0) { // L: 354
					--var37;
				}
			}

			var23 = 0; // L: 357

			while (var38-- > 0) { // L: 358
				var6[var23] = var13[var38]; // L: 359
				var7[var23++] = var14[var38]; // L: 360
				if (var23 >= var6.length) { // L: 361
					break;
				}
			}

			return var23; // L: 363
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "86727146"
	)
	static final int method5515(int var0, int var1) {
		int var2 = Canvas.method322(var0 - 1, var1 - 1) + Canvas.method322(1 + var0, var1 - 1) + Canvas.method322(var0 - 1, var1 + 1) + Canvas.method322(1 + var0, 1 + var1); // L: 969
		int var3 = Canvas.method322(var0 - 1, var1) + Canvas.method322(1 + var0, var1) + Canvas.method322(var0, var1 - 1) + Canvas.method322(var0, 1 + var1); // L: 970
		int var4 = Canvas.method322(var0, var1); // L: 971
		return var2 / 16 + var3 / 8 + var4 / 4; // L: 972
	}
}
