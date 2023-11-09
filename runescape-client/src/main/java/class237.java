import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
public class class237 extends class220 {
	@ObfuscatedSignature(
		descriptor = "(Ljg;)V"
	)
	class237(class236 var1) {
		super(var1); // L: 7
	} // L: 8

	@ObfuscatedName("ab")
	void vmethod4970(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12) {
		int var13 = var5 - var4; // L: 12
		int var14 = var2 - var1; // L: 13
		int var15 = var6 - var4; // L: 14
		int var16 = var3 - var1; // L: 15
		int var17 = var11 - var10; // L: 16
		int var18 = var12 - var10; // L: 17
		float var19 = var8 - var7; // L: 18
		float var20 = var9 - var7; // L: 19
		int var21;
		if (var3 != var2) { // L: 21
			var21 = (var6 - var5 << 14) / (var3 - var2); // L: 22
		} else {
			var21 = 0; // L: 25
		}

		int var22;
		if (var2 != var1) { // L: 28
			var22 = (var13 << 14) / var14; // L: 29
		} else {
			var22 = 0; // L: 32
		}

		int var23;
		if (var3 != var1) { // L: 35
			var23 = (var15 << 14) / var16; // L: 36
		} else {
			var23 = 0; // L: 39
		}

		int var24 = var13 * var16 - var15 * var14; // L: 41
		if (var24 != 0) { // L: 42
			int var25 = (var17 * var16 - var18 * var14 << 8) / var24; // L: 43
			int var26 = (var18 * var13 - var17 * var15 << 8) / var24; // L: 44
			float var27 = (var19 * (float)var16 - var20 * (float)var14) / (float)var24; // L: 45
			float var28 = (var20 * (float)var13 - var19 * (float)var15) / (float)var24; // L: 46
			int[] var29 = super.field2530.Rasterizer3D_rowOffsets; // L: 47
			int var30 = super.field2530.field2796; // L: 48
			if (var1 <= var2 && var1 <= var3) { // L: 49
				if (var1 < var30) { // L: 50
					if (var2 > var30) { // L: 51
						var2 = var30; // L: 52
					}

					if (var3 > var30) { // L: 54
						var3 = var30; // L: 55
					}

					var10 = var25 + ((var10 << 8) - var25 * var4); // L: 57
					var7 = var7 - var27 * (float)var4 + var27; // L: 58
					if (var2 < var3) { // L: 59
						var6 = var4 <<= 14; // L: 60
						if (var1 < 0) { // L: 61
							var6 -= var23 * var1; // L: 62
							var4 -= var22 * var1; // L: 63
							var10 -= var26 * var1; // L: 64
							var7 -= var28 * (float)var1; // L: 65
							var1 = 0; // L: 66
						}

						var5 <<= 14; // L: 68
						if (var2 < 0) { // L: 69
							var5 -= var21 * var2; // L: 70
							var2 = 0; // L: 71
						}

						if (var2 != var1 && var23 < var22 || var2 == var1 && var23 > var21) { // L: 73
							var3 -= var2; // L: 74
							var2 -= var1; // L: 75
							var1 = var29[var1]; // L: 76

							while (true) {
								--var2; // L: 77
								if (var2 < 0) {
									while (true) {
										--var3; // L: 85
										if (var3 < 0) {
											return; // L: 93
										}

										this.method4960(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var6 >> 14, var5 >> 14, var10, var25, var7, var27); // L: 86
										var6 += var23; // L: 87
										var5 += var21; // L: 88
										var10 += var26; // L: 89
										var1 += Rasterizer2D.Rasterizer2D_width; // L: 90
										var7 += var28; // L: 91
									}
								}

								this.method4960(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var25, var7, var27); // L: 78
								var6 += var23; // L: 79
								var4 += var22; // L: 80
								var10 += var26; // L: 81
								var1 += Rasterizer2D.Rasterizer2D_width; // L: 82
								var7 += var28; // L: 83
							}
						} else {
							var3 -= var2; // L: 96
							var2 -= var1; // L: 97
							var1 = var29[var1]; // L: 98

							while (true) {
								--var2; // L: 99
								if (var2 < 0) {
									while (true) {
										--var3; // L: 107
										if (var3 < 0) {
											return; // L: 115
										}

										this.method4960(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var5 >> 14, var6 >> 14, var10, var25, var7, var27); // L: 108
										var6 += var23; // L: 109
										var5 += var21; // L: 110
										var10 += var26; // L: 111
										var1 += Rasterizer2D.Rasterizer2D_width; // L: 112
										var7 += var28; // L: 113
									}
								}

								this.method4960(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var25, var7, var27); // L: 100
								var6 += var23; // L: 101
								var4 += var22; // L: 102
								var10 += var26; // L: 103
								var1 += Rasterizer2D.Rasterizer2D_width; // L: 104
								var7 += var28; // L: 105
							}
						}
					} else {
						var5 = var4 <<= 14; // L: 119
						if (var1 < 0) { // L: 120
							var5 -= var23 * var1; // L: 121
							var4 -= var22 * var1; // L: 122
							var10 -= var26 * var1; // L: 123
							var7 -= var28 * (float)var1; // L: 124
							var1 = 0; // L: 125
						}

						var6 <<= 14; // L: 127
						if (var3 < 0) { // L: 128
							var6 -= var3 * var21; // L: 129
							var3 = 0; // L: 130
						}

						if (var3 != var1 && var23 < var22 || var3 == var1 && var21 > var22) { // L: 132
							var2 -= var3; // L: 133
							var3 -= var1; // L: 134
							var1 = var29[var1]; // L: 135

							while (true) {
								--var3; // L: 136
								if (var3 < 0) {
									while (true) {
										--var2; // L: 144
										if (var2 < 0) {
											return; // L: 152
										}

										this.method4960(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var25, var7, var27); // L: 145
										var6 += var21; // L: 146
										var4 += var22; // L: 147
										var10 += var26; // L: 148
										var1 += Rasterizer2D.Rasterizer2D_width; // L: 149
										var7 += var28; // L: 150
									}
								}

								this.method4960(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var5 >> 14, var4 >> 14, var10, var25, var7, var27); // L: 137
								var5 += var23; // L: 138
								var4 += var22; // L: 139
								var10 += var26; // L: 140
								var1 += Rasterizer2D.Rasterizer2D_width; // L: 141
								var7 += var28; // L: 142
							}
						} else {
							var2 -= var3; // L: 155
							var3 -= var1; // L: 156
							var1 = var29[var1]; // L: 157

							while (true) {
								--var3; // L: 158
								if (var3 < 0) {
									while (true) {
										--var2; // L: 166
										if (var2 < 0) {
											return; // L: 174
										}

										this.method4960(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var25, var7, var27); // L: 167
										var6 += var21; // L: 168
										var4 += var22; // L: 169
										var10 += var26; // L: 170
										var1 += Rasterizer2D.Rasterizer2D_width; // L: 171
										var7 += var28; // L: 172
									}
								}

								this.method4960(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var4 >> 14, var5 >> 14, var10, var25, var7, var27); // L: 159
								var5 += var23; // L: 160
								var4 += var22; // L: 161
								var10 += var26; // L: 162
								var1 += Rasterizer2D.Rasterizer2D_width; // L: 163
								var7 += var28; // L: 164
							}
						}
					}
				}
			} else if (var2 <= var3) { // L: 178
				if (var2 < var30) { // L: 179
					if (var3 > var30) { // L: 180
						var3 = var30; // L: 181
					}

					if (var1 > var30) { // L: 183
						var1 = var30; // L: 184
					}

					var11 = (var11 << 8) - var5 * var25 + var25; // L: 186
					var8 = var8 - var27 * (float)var5 + var27; // L: 187
					if (var3 < var1) { // L: 188
						var4 = var5 <<= 14; // L: 189
						if (var2 < 0) { // L: 190
							var4 -= var22 * var2; // L: 191
							var5 -= var21 * var2; // L: 192
							var11 -= var26 * var2; // L: 193
							var8 -= var28 * (float)var2; // L: 194
							var2 = 0; // L: 195
						}

						var6 <<= 14; // L: 197
						if (var3 < 0) { // L: 198
							var6 -= var3 * var23; // L: 199
							var3 = 0; // L: 200
						}

						if (var3 != var2 && var22 < var21 || var3 == var2 && var22 > var23) { // L: 202
							var1 -= var3; // L: 203
							var3 -= var2; // L: 204
							var2 = var29[var2]; // L: 205

							while (true) {
								--var3; // L: 206
								if (var3 < 0) {
									while (true) {
										--var1; // L: 214
										if (var1 < 0) {
											return; // L: 222
										}

										this.method4960(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var4 >> 14, var6 >> 14, var11, var25, var8, var27); // L: 215
										var4 += var22; // L: 216
										var6 += var23; // L: 217
										var11 += var26; // L: 218
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 219
										var8 += var28; // L: 220
									}
								}

								this.method4960(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var25, var8, var27); // L: 207
								var4 += var22; // L: 208
								var5 += var21; // L: 209
								var11 += var26; // L: 210
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 211
								var8 += var28; // L: 212
							}
						} else {
							var1 -= var3; // L: 225
							var3 -= var2; // L: 226
							var2 = var29[var2]; // L: 227

							while (true) {
								--var3; // L: 228
								if (var3 < 0) {
									while (true) {
										--var1; // L: 236
										if (var1 < 0) {
											return; // L: 244
										}

										this.method4960(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var6 >> 14, var4 >> 14, var11, var25, var8, var27); // L: 237
										var4 += var22; // L: 238
										var6 += var23; // L: 239
										var11 += var26; // L: 240
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 241
										var8 += var28; // L: 242
									}
								}

								this.method4960(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var25, var8, var27); // L: 229
								var4 += var22; // L: 230
								var5 += var21; // L: 231
								var11 += var26; // L: 232
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 233
								var8 += var28; // L: 234
							}
						}
					} else {
						var6 = var5 <<= 14; // L: 248
						if (var2 < 0) { // L: 249
							var6 -= var22 * var2; // L: 250
							var5 -= var21 * var2; // L: 251
							var11 -= var26 * var2; // L: 252
							var8 -= var28 * (float)var2; // L: 253
							var2 = 0; // L: 254
						}

						var4 <<= 14; // L: 256
						if (var1 < 0) { // L: 257
							var4 -= var23 * var1; // L: 258
							var1 = 0; // L: 259
						}

						if (var22 < var21) { // L: 261
							var3 -= var1; // L: 262
							var1 -= var2; // L: 263
							var2 = var29[var2]; // L: 264

							while (true) {
								--var1; // L: 265
								if (var1 < 0) {
									while (true) {
										--var3; // L: 273
										if (var3 < 0) {
											return; // L: 281
										}

										this.method4960(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var25, var8, var27); // L: 274
										var4 += var23; // L: 275
										var5 += var21; // L: 276
										var11 += var26; // L: 277
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 278
										var8 += var28; // L: 279
									}
								}

								this.method4960(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var6 >> 14, var5 >> 14, var11, var25, var8, var27); // L: 266
								var6 += var22; // L: 267
								var5 += var21; // L: 268
								var11 += var26; // L: 269
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 270
								var8 += var28; // L: 271
							}
						} else {
							var3 -= var1; // L: 284
							var1 -= var2; // L: 285
							var2 = var29[var2]; // L: 286

							while (true) {
								--var1; // L: 287
								if (var1 < 0) {
									while (true) {
										--var3; // L: 295
										if (var3 < 0) {
											return; // L: 303
										}

										this.method4960(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var25, var8, var27); // L: 296
										var4 += var23; // L: 297
										var5 += var21; // L: 298
										var11 += var26; // L: 299
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 300
										var8 += var28; // L: 301
									}
								}

								this.method4960(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var5 >> 14, var6 >> 14, var11, var25, var8, var27); // L: 288
								var6 += var22; // L: 289
								var5 += var21; // L: 290
								var11 += var26; // L: 291
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 292
								var8 += var28; // L: 293
							}
						}
					}
				}
			} else if (var3 < var30) { // L: 308
				if (var1 > var30) { // L: 309
					var1 = var30;
				}

				if (var2 > var30) { // L: 310
					var2 = var30;
				}

				var12 = var25 + ((var12 << 8) - var25 * var6); // L: 311
				var9 = var9 - var27 * (float)var6 + var27; // L: 312
				if (var1 < var2) { // L: 313
					var5 = var6 <<= 14; // L: 314
					if (var3 < 0) { // L: 315
						var5 -= var3 * var21; // L: 316
						var6 -= var3 * var23; // L: 317
						var12 -= var3 * var26; // L: 318
						var9 -= var28 * (float)var3; // L: 319
						var3 = 0; // L: 320
					}

					var4 <<= 14; // L: 322
					if (var1 < 0) { // L: 323
						var4 -= var22 * var1; // L: 324
						var1 = 0; // L: 325
					}

					if (var21 < var23) { // L: 327
						var2 -= var1; // L: 328
						var1 -= var3; // L: 329
						var3 = var29[var3]; // L: 330

						while (true) {
							--var1; // L: 331
							if (var1 < 0) {
								while (true) {
									--var2; // L: 339
									if (var2 < 0) {
										return; // L: 347
									}

									this.method4960(Rasterizer2D.Rasterizer2D_pixels, var3, 0, 0, var5 >> 14, var4 >> 14, var12, var25, var9, var27); // L: 340
									var5 += var21; // L: 341
									var4 += var22; // L: 342
									var12 += var26; // L: 343
									var3 += Rasterizer2D.Rasterizer2D_width; // L: 344
									var9 += var28; // L: 345
								}
							}

							this.method4960(Rasterizer2D.Rasterizer2D_pixels, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var25, var9, var27); // L: 332
							var5 += var21; // L: 333
							var6 += var23; // L: 334
							var12 += var26; // L: 335
							var3 += Rasterizer2D.Rasterizer2D_width; // L: 336
							var9 += var28; // L: 337
						}
					} else {
						var2 -= var1; // L: 350
						var1 -= var3; // L: 351
						var3 = var29[var3]; // L: 352

						while (true) {
							--var1; // L: 353
							if (var1 < 0) {
								while (true) {
									--var2; // L: 361
									if (var2 < 0) {
										return; // L: 369
									}

									this.method4960(Rasterizer2D.Rasterizer2D_pixels, var3, 0, 0, var4 >> 14, var5 >> 14, var12, var25, var9, var27); // L: 362
									var5 += var21; // L: 363
									var4 += var22; // L: 364
									var12 += var26; // L: 365
									var3 += Rasterizer2D.Rasterizer2D_width; // L: 366
									var9 += var28; // L: 367
								}
							}

							this.method4960(Rasterizer2D.Rasterizer2D_pixels, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var25, var9, var27); // L: 354
							var5 += var21; // L: 355
							var6 += var23; // L: 356
							var12 += var26; // L: 357
							var3 += Rasterizer2D.Rasterizer2D_width; // L: 358
							var9 += var28; // L: 359
						}
					}
				} else {
					var4 = var6 <<= 14; // L: 373
					if (var3 < 0) { // L: 374
						var4 -= var3 * var21; // L: 375
						var6 -= var3 * var23; // L: 376
						var12 -= var3 * var26; // L: 377
						var9 -= var28 * (float)var3; // L: 378
						var3 = 0; // L: 379
					}

					var5 <<= 14; // L: 381
					if (var2 < 0) { // L: 382
						var5 -= var22 * var2; // L: 383
						var2 = 0; // L: 384
					}

					if (var21 < var23) { // L: 386
						var1 -= var2; // L: 387
						var2 -= var3; // L: 388
						var3 = var29[var3]; // L: 389

						while (true) {
							--var2; // L: 390
							if (var2 < 0) {
								while (true) {
									--var1; // L: 398
									if (var1 < 0) {
										return; // L: 406
									}

									this.method4960(Rasterizer2D.Rasterizer2D_pixels, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var25, var9, var27); // L: 399
									var5 += var22; // L: 400
									var6 += var23; // L: 401
									var12 += var26; // L: 402
									var3 += Rasterizer2D.Rasterizer2D_width; // L: 403
									var9 += var28; // L: 404
								}
							}

							this.method4960(Rasterizer2D.Rasterizer2D_pixels, var3, 0, 0, var4 >> 14, var6 >> 14, var12, var25, var9, var27); // L: 391
							var4 += var21; // L: 392
							var6 += var23; // L: 393
							var12 += var26; // L: 394
							var3 += Rasterizer2D.Rasterizer2D_width; // L: 395
							var9 += var28; // L: 396
						}
					} else {
						var1 -= var2; // L: 409
						var2 -= var3; // L: 410
						var3 = var29[var3]; // L: 411

						while (true) {
							--var2; // L: 412
							if (var2 < 0) {
								while (true) {
									--var1; // L: 420
									if (var1 < 0) {
										return; // L: 428
									}

									this.method4960(Rasterizer2D.Rasterizer2D_pixels, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var25, var9, var27); // L: 421
									var5 += var22; // L: 422
									var6 += var23; // L: 423
									var12 += var26; // L: 424
									var3 += Rasterizer2D.Rasterizer2D_width; // L: 425
									var9 += var28; // L: 426
								}
							}

							this.method4960(Rasterizer2D.Rasterizer2D_pixels, var3, 0, 0, var6 >> 14, var4 >> 14, var12, var25, var9, var27); // L: 413
							var4 += var21; // L: 414
							var6 += var23; // L: 415
							var12 += var26; // L: 416
							var3 += Rasterizer2D.Rasterizer2D_width; // L: 417
							var9 += var28; // L: 418
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("aq")
	void vmethod4961(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10) {
		int var11 = var5 - var4; // L: 572
		int var12 = var2 - var1; // L: 573
		int var13 = var6 - var4; // L: 574
		int var14 = var3 - var1; // L: 575
		float var15 = var8 - var7; // L: 576
		float var16 = var9 - var7; // L: 577
		int var17;
		if (var3 != var2) { // L: 579
			var17 = (var6 - var5 << 14) / (var3 - var2); // L: 580
		} else {
			var17 = 0; // L: 583
		}

		int var18;
		if (var2 != var1) { // L: 586
			var18 = (var11 << 14) / var12; // L: 587
		} else {
			var18 = 0; // L: 590
		}

		int var19;
		if (var3 != var1) { // L: 593
			var19 = (var13 << 14) / var14; // L: 594
		} else {
			var19 = 0; // L: 597
		}

		int var20 = var11 * var14 - var13 * var12; // L: 599
		if (var20 != 0) { // L: 600
			float var21 = (var15 * (float)var14 - var16 * (float)var12) / (float)var20; // L: 601
			float var22 = (var16 * (float)var11 - var15 * (float)var13) / (float)var20; // L: 602
			int[] var23 = super.field2530.Rasterizer3D_rowOffsets; // L: 603
			int var24 = super.field2530.field2796; // L: 604
			if (var1 <= var2 && var1 <= var3) { // L: 605
				if (var1 < var24) { // L: 606
					if (var2 > var24) { // L: 607
						var2 = var24; // L: 608
					}

					if (var3 > var24) { // L: 610
						var3 = var24; // L: 611
					}

					var7 = var7 - var21 * (float)var4 + var21; // L: 613
					if (var2 < var3) { // L: 614
						var6 = var4 <<= 14; // L: 615
						if (var1 < 0) { // L: 616
							var6 -= var19 * var1; // L: 617
							var4 -= var18 * var1; // L: 618
							var7 -= var22 * (float)var1; // L: 619
							var1 = 0; // L: 620
						}

						var5 <<= 14; // L: 622
						if (var2 < 0) { // L: 623
							var5 -= var17 * var2; // L: 624
							var2 = 0; // L: 625
						}

						if (var2 != var1 && var19 < var18 || var2 == var1 && var19 > var17) { // L: 627
							var3 -= var2; // L: 628
							var2 -= var1; // L: 629
							var1 = var23[var1]; // L: 630

							while (true) {
								--var2; // L: 631
								if (var2 < 0) {
									while (true) {
										--var3; // L: 638
										if (var3 < 0) {
											return; // L: 645
										}

										this.method4962(Rasterizer2D.Rasterizer2D_pixels, var1, var10, 0, var6 >> 14, var5 >> 14, var7, var21); // L: 639
										var6 += var19; // L: 640
										var5 += var17; // L: 641
										var1 += Rasterizer2D.Rasterizer2D_width; // L: 642
										var7 += var22; // L: 643
									}
								}

								this.method4962(Rasterizer2D.Rasterizer2D_pixels, var1, var10, 0, var6 >> 14, var4 >> 14, var7, var21); // L: 632
								var6 += var19; // L: 633
								var4 += var18; // L: 634
								var1 += Rasterizer2D.Rasterizer2D_width; // L: 635
								var7 += var22; // L: 636
							}
						} else {
							var3 -= var2; // L: 648
							var2 -= var1; // L: 649
							var1 = var23[var1]; // L: 650

							while (true) {
								--var2; // L: 651
								if (var2 < 0) {
									while (true) {
										--var3; // L: 658
										if (var3 < 0) {
											return; // L: 665
										}

										this.method4962(Rasterizer2D.Rasterizer2D_pixels, var1, var10, 0, var5 >> 14, var6 >> 14, var7, var21); // L: 659
										var6 += var19; // L: 660
										var5 += var17; // L: 661
										var1 += Rasterizer2D.Rasterizer2D_width; // L: 662
										var7 += var22; // L: 663
									}
								}

								this.method4962(Rasterizer2D.Rasterizer2D_pixels, var1, var10, 0, var4 >> 14, var6 >> 14, var7, var21); // L: 652
								var6 += var19; // L: 653
								var4 += var18; // L: 654
								var1 += Rasterizer2D.Rasterizer2D_width; // L: 655
								var7 += var22; // L: 656
							}
						}
					} else {
						var5 = var4 <<= 14; // L: 669
						if (var1 < 0) { // L: 670
							var5 -= var19 * var1; // L: 671
							var4 -= var18 * var1; // L: 672
							var7 -= var22 * (float)var1; // L: 673
							var1 = 0; // L: 674
						}

						var6 <<= 14; // L: 676
						if (var3 < 0) { // L: 677
							var6 -= var3 * var17; // L: 678
							var3 = 0; // L: 679
						}

						if (var3 != var1 && var19 < var18 || var3 == var1 && var17 > var18) { // L: 681
							var2 -= var3; // L: 682
							var3 -= var1; // L: 683
							var1 = var23[var1]; // L: 684

							while (true) {
								--var3; // L: 685
								if (var3 < 0) {
									while (true) {
										--var2; // L: 692
										if (var2 < 0) {
											return; // L: 699
										}

										this.method4962(Rasterizer2D.Rasterizer2D_pixels, var1, var10, 0, var6 >> 14, var4 >> 14, var7, var21); // L: 693
										var6 += var17; // L: 694
										var4 += var18; // L: 695
										var1 += Rasterizer2D.Rasterizer2D_width; // L: 696
										var7 += var22; // L: 697
									}
								}

								this.method4962(Rasterizer2D.Rasterizer2D_pixels, var1, var10, 0, var5 >> 14, var4 >> 14, var7, var21); // L: 686
								var5 += var19; // L: 687
								var4 += var18; // L: 688
								var1 += Rasterizer2D.Rasterizer2D_width; // L: 689
								var7 += var22; // L: 690
							}
						} else {
							var2 -= var3; // L: 702
							var3 -= var1; // L: 703
							var1 = var23[var1]; // L: 704

							while (true) {
								--var3; // L: 705
								if (var3 < 0) {
									while (true) {
										--var2; // L: 712
										if (var2 < 0) {
											return; // L: 719
										}

										this.method4962(Rasterizer2D.Rasterizer2D_pixels, var1, var10, 0, var4 >> 14, var6 >> 14, var7, var21); // L: 713
										var6 += var17; // L: 714
										var4 += var18; // L: 715
										var1 += Rasterizer2D.Rasterizer2D_width; // L: 716
										var7 += var22; // L: 717
									}
								}

								this.method4962(Rasterizer2D.Rasterizer2D_pixels, var1, var10, 0, var4 >> 14, var5 >> 14, var7, var21); // L: 706
								var5 += var19; // L: 707
								var4 += var18; // L: 708
								var1 += Rasterizer2D.Rasterizer2D_width; // L: 709
								var7 += var22; // L: 710
							}
						}
					}
				}
			} else if (var2 <= var3) { // L: 723
				if (var2 < var24) { // L: 724
					if (var3 > var24) { // L: 725
						var3 = var24; // L: 726
					}

					if (var1 > var24) { // L: 728
						var1 = var24; // L: 729
					}

					var8 = var8 - var21 * (float)var5 + var21; // L: 731
					if (var3 < var1) { // L: 732
						var4 = var5 <<= 14; // L: 733
						if (var2 < 0) { // L: 734
							var4 -= var18 * var2; // L: 735
							var5 -= var17 * var2; // L: 736
							var8 -= var22 * (float)var2; // L: 737
							var2 = 0; // L: 738
						}

						var6 <<= 14; // L: 740
						if (var3 < 0) { // L: 741
							var6 -= var3 * var19; // L: 742
							var3 = 0; // L: 743
						}

						if (var3 != var2 && var18 < var17 || var3 == var2 && var18 > var19) { // L: 745
							var1 -= var3; // L: 746
							var3 -= var2; // L: 747
							var2 = var23[var2]; // L: 748

							while (true) {
								--var3; // L: 749
								if (var3 < 0) {
									while (true) {
										--var1; // L: 756
										if (var1 < 0) {
											return; // L: 763
										}

										this.method4962(Rasterizer2D.Rasterizer2D_pixels, var2, var10, 0, var4 >> 14, var6 >> 14, var8, var21); // L: 757
										var4 += var18; // L: 758
										var6 += var19; // L: 759
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 760
										var8 += var22; // L: 761
									}
								}

								this.method4962(Rasterizer2D.Rasterizer2D_pixels, var2, var10, 0, var4 >> 14, var5 >> 14, var8, var21); // L: 750
								var4 += var18; // L: 751
								var5 += var17; // L: 752
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 753
								var8 += var22; // L: 754
							}
						} else {
							var1 -= var3; // L: 766
							var3 -= var2; // L: 767
							var2 = var23[var2]; // L: 768

							while (true) {
								--var3; // L: 769
								if (var3 < 0) {
									while (true) {
										--var1; // L: 776
										if (var1 < 0) {
											return; // L: 783
										}

										this.method4962(Rasterizer2D.Rasterizer2D_pixels, var2, var10, 0, var6 >> 14, var4 >> 14, var8, var21); // L: 777
										var4 += var18; // L: 778
										var6 += var19; // L: 779
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 780
										var8 += var22; // L: 781
									}
								}

								this.method4962(Rasterizer2D.Rasterizer2D_pixels, var2, var10, 0, var5 >> 14, var4 >> 14, var8, var21); // L: 770
								var4 += var18; // L: 771
								var5 += var17; // L: 772
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 773
								var8 += var22; // L: 774
							}
						}
					} else {
						var6 = var5 <<= 14; // L: 787
						if (var2 < 0) { // L: 788
							var6 -= var18 * var2; // L: 789
							var5 -= var17 * var2; // L: 790
							var8 -= var22 * (float)var2; // L: 791
							var2 = 0; // L: 792
						}

						var4 <<= 14; // L: 794
						if (var1 < 0) { // L: 795
							var4 -= var19 * var1; // L: 796
							var1 = 0; // L: 797
						}

						if (var18 < var17) { // L: 799
							var3 -= var1; // L: 800
							var1 -= var2; // L: 801
							var2 = var23[var2]; // L: 802

							while (true) {
								--var1; // L: 803
								if (var1 < 0) {
									while (true) {
										--var3; // L: 810
										if (var3 < 0) {
											return; // L: 817
										}

										this.method4962(Rasterizer2D.Rasterizer2D_pixels, var2, var10, 0, var4 >> 14, var5 >> 14, var8, var21); // L: 811
										var4 += var19; // L: 812
										var5 += var17; // L: 813
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 814
										var8 += var22; // L: 815
									}
								}

								this.method4962(Rasterizer2D.Rasterizer2D_pixels, var2, var10, 0, var6 >> 14, var5 >> 14, var8, var21); // L: 804
								var6 += var18; // L: 805
								var5 += var17; // L: 806
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 807
								var8 += var22; // L: 808
							}
						} else {
							var3 -= var1; // L: 820
							var1 -= var2; // L: 821
							var2 = var23[var2]; // L: 822

							while (true) {
								--var1; // L: 823
								if (var1 < 0) {
									while (true) {
										--var3; // L: 830
										if (var3 < 0) {
											return; // L: 837
										}

										this.method4962(Rasterizer2D.Rasterizer2D_pixels, var2, var10, 0, var5 >> 14, var4 >> 14, var8, var21); // L: 831
										var4 += var19; // L: 832
										var5 += var17; // L: 833
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 834
										var8 += var22; // L: 835
									}
								}

								this.method4962(Rasterizer2D.Rasterizer2D_pixels, var2, var10, 0, var5 >> 14, var6 >> 14, var8, var21); // L: 824
								var6 += var18; // L: 825
								var5 += var17; // L: 826
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 827
								var8 += var22; // L: 828
							}
						}
					}
				}
			} else if (var3 < var24) { // L: 842
				if (var1 > var24) { // L: 843
					var1 = var24;
				}

				if (var2 > var24) { // L: 844
					var2 = var24;
				}

				var9 = var9 - var21 * (float)var6 + var21; // L: 845
				if (var1 < var2) { // L: 846
					var5 = var6 <<= 14; // L: 847
					if (var3 < 0) { // L: 848
						var5 -= var3 * var17; // L: 849
						var6 -= var3 * var19; // L: 850
						var9 -= var22 * (float)var3; // L: 851
						var3 = 0; // L: 852
					}

					var4 <<= 14; // L: 854
					if (var1 < 0) { // L: 855
						var4 -= var18 * var1; // L: 856
						var1 = 0; // L: 857
					}

					if (var17 < var19) { // L: 859
						var2 -= var1; // L: 860
						var1 -= var3; // L: 861
						var3 = var23[var3]; // L: 862

						while (true) {
							--var1; // L: 863
							if (var1 < 0) {
								while (true) {
									--var2; // L: 870
									if (var2 < 0) {
										return; // L: 877
									}

									this.method4962(Rasterizer2D.Rasterizer2D_pixels, var3, var10, 0, var5 >> 14, var4 >> 14, var9, var21); // L: 871
									var5 += var17; // L: 872
									var4 += var18; // L: 873
									var3 += Rasterizer2D.Rasterizer2D_width; // L: 874
									var9 += var22; // L: 875
								}
							}

							this.method4962(Rasterizer2D.Rasterizer2D_pixels, var3, var10, 0, var5 >> 14, var6 >> 14, var9, var21); // L: 864
							var5 += var17; // L: 865
							var6 += var19; // L: 866
							var3 += Rasterizer2D.Rasterizer2D_width; // L: 867
							var9 += var22; // L: 868
						}
					} else {
						var2 -= var1; // L: 880
						var1 -= var3; // L: 881
						var3 = var23[var3]; // L: 882

						while (true) {
							--var1; // L: 883
							if (var1 < 0) {
								while (true) {
									--var2; // L: 890
									if (var2 < 0) {
										return; // L: 897
									}

									this.method4962(Rasterizer2D.Rasterizer2D_pixels, var3, var10, 0, var4 >> 14, var5 >> 14, var9, var21); // L: 891
									var5 += var17; // L: 892
									var4 += var18; // L: 893
									var3 += Rasterizer2D.Rasterizer2D_width; // L: 894
									var9 += var22; // L: 895
								}
							}

							this.method4962(Rasterizer2D.Rasterizer2D_pixels, var3, var10, 0, var6 >> 14, var5 >> 14, var9, var21); // L: 884
							var5 += var17; // L: 885
							var6 += var19; // L: 886
							var3 += Rasterizer2D.Rasterizer2D_width; // L: 887
							var9 += var22; // L: 888
						}
					}
				} else {
					var4 = var6 <<= 14; // L: 901
					if (var3 < 0) { // L: 902
						var4 -= var3 * var17; // L: 903
						var6 -= var3 * var19; // L: 904
						var9 -= var22 * (float)var3; // L: 905
						var3 = 0; // L: 906
					}

					var5 <<= 14; // L: 908
					if (var2 < 0) { // L: 909
						var5 -= var18 * var2; // L: 910
						var2 = 0; // L: 911
					}

					if (var17 < var19) { // L: 913
						var1 -= var2; // L: 914
						var2 -= var3; // L: 915
						var3 = var23[var3]; // L: 916

						while (true) {
							--var2; // L: 917
							if (var2 < 0) {
								while (true) {
									--var1; // L: 924
									if (var1 < 0) {
										return; // L: 931
									}

									this.method4962(Rasterizer2D.Rasterizer2D_pixels, var3, var10, 0, var5 >> 14, var6 >> 14, var9, var21); // L: 925
									var5 += var18; // L: 926
									var6 += var19; // L: 927
									var3 += Rasterizer2D.Rasterizer2D_width; // L: 928
									var9 += var22; // L: 929
								}
							}

							this.method4962(Rasterizer2D.Rasterizer2D_pixels, var3, var10, 0, var4 >> 14, var6 >> 14, var9, var21); // L: 918
							var4 += var17; // L: 919
							var6 += var19; // L: 920
							var3 += Rasterizer2D.Rasterizer2D_width; // L: 921
							var9 += var22; // L: 922
						}
					} else {
						var1 -= var2; // L: 934
						var2 -= var3; // L: 935
						var3 = var23[var3]; // L: 936

						while (true) {
							--var2; // L: 937
							if (var2 < 0) {
								while (true) {
									--var1; // L: 944
									if (var1 < 0) {
										return; // L: 951
									}

									this.method4962(Rasterizer2D.Rasterizer2D_pixels, var3, var10, 0, var6 >> 14, var5 >> 14, var9, var21); // L: 945
									var5 += var18; // L: 946
									var6 += var19; // L: 947
									var3 += Rasterizer2D.Rasterizer2D_width; // L: 948
									var9 += var22; // L: 949
								}
							}

							this.method4962(Rasterizer2D.Rasterizer2D_pixels, var3, var10, 0, var6 >> 14, var4 >> 14, var9, var21); // L: 938
							var4 += var17; // L: 939
							var6 += var19; // L: 940
							var3 += Rasterizer2D.Rasterizer2D_width; // L: 941
							var9 += var22; // L: 942
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("al")
	void vmethod5007(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
		int[] var23 = super.field2530.Rasterizer3D_textureLoader.getTexturePixels(var22); // L: 1029
		int var24;
		if (var23 == null) { // L: 1030
			var24 = super.field2530.Rasterizer3D_textureLoader.getAverageTextureRGB(var22); // L: 1031
			this.vmethod4970(var1, var2, var3, var4, var5, var6, var7, var8, var9, GroundObject.method4398(var24, var10), GroundObject.method4398(var24, var11), GroundObject.method4398(var24, var12)); // L: 1032
		} else {
			super.field2527 = super.field2530.Rasterizer3D_textureLoader.isLowDetail(var22); // L: 1035
			super.field2531 = super.field2530.Rasterizer3D_textureLoader.vmethod5013(var22); // L: 1036
			var24 = var5 - var4; // L: 1037
			int var25 = var2 - var1; // L: 1038
			int var26 = var6 - var4; // L: 1039
			int var27 = var3 - var1; // L: 1040
			int var28 = var11 - var10; // L: 1041
			int var29 = var12 - var10; // L: 1042
			int var30 = 0; // L: 1043
			if (var2 != var1) { // L: 1044
				var30 = (var5 - var4 << 14) / (var2 - var1);
			}

			int var31 = 0; // L: 1045
			if (var3 != var2) { // L: 1046
				var31 = (var6 - var5 << 14) / (var3 - var2);
			}

			int var32 = 0; // L: 1047
			if (var3 != var1) { // L: 1048
				var32 = (var4 - var6 << 14) / (var1 - var3);
			}

			int var33 = var24 * var27 - var26 * var25; // L: 1049
			if (var33 != 0) { // L: 1050
				int var34 = (var28 * var27 - var29 * var25 << 9) / var33; // L: 1051
				int var35 = (var29 * var24 - var28 * var26 << 9) / var33; // L: 1052
				float var36 = var8 - var7; // L: 1053
				float var37 = var9 - var7; // L: 1054
				float var38 = (var36 * (float)var27 - var37 * (float)var25) / (float)var33; // L: 1055
				float var39 = (var37 * (float)var24 - var36 * (float)var26) / (float)var33; // L: 1056
				int var40 = super.field2530.field2790; // L: 1057
				var14 = var13 - var14; // L: 1058
				var17 = var16 - var17; // L: 1059
				var20 = var19 - var20; // L: 1060
				var15 -= var13; // L: 1061
				var18 -= var16; // L: 1062
				var21 -= var19; // L: 1063
				int var41 = var15 * var16 - var18 * var13 << 14; // L: 1064
				int var42 = (int)(((long)(var18 * var19 - var16 * var21) << 3 << 14) / (long)var40); // L: 1065
				int var43 = (int)(((long)(var13 * var21 - var19 * var15) << 14) / (long)var40); // L: 1066
				int var44 = var16 * var14 - var13 * var17 << 14; // L: 1067
				int var45 = (int)(((long)(var19 * var17 - var16 * var20) << 3 << 14) / (long)var40); // L: 1068
				int var46 = (int)(((long)(var13 * var20 - var19 * var14) << 14) / (long)var40); // L: 1069
				int var47 = var17 * var15 - var18 * var14 << 14; // L: 1070
				int var48 = (int)(((long)(var18 * var20 - var17 * var21) << 3 << 14) / (long)var40); // L: 1071
				int var49 = (int)(((long)(var21 * var14 - var15 * var20) << 14) / (long)var40); // L: 1072
				int[] var50 = super.field2530.Rasterizer3D_rowOffsets; // L: 1073
				int var51 = super.field2530.field2796; // L: 1074
				int var52;
				if (var1 <= var2 && var1 <= var3) { // L: 1075
					if (var1 < var51) { // L: 1076
						if (var2 > var51) { // L: 1077
							var2 = var51;
						}

						if (var3 > var51) { // L: 1078
							var3 = var51;
						}

						var10 = var34 + ((var10 << 9) - var34 * var4); // L: 1079
						var7 = var7 - var38 * (float)var4 + var38; // L: 1080
						if (var2 < var3) { // L: 1081
							var6 = var4 <<= 14; // L: 1082
							if (var1 < 0) { // L: 1083
								var6 -= var32 * var1; // L: 1084
								var4 -= var30 * var1; // L: 1085
								var10 -= var35 * var1; // L: 1086
								var7 -= var39 * (float)var1; // L: 1087
								var1 = 0; // L: 1088
							}

							var5 <<= 14; // L: 1090
							if (var2 < 0) { // L: 1091
								var5 -= var31 * var2; // L: 1092
								var2 = 0; // L: 1093
							}

							var52 = var1 - super.field2530.field2793; // L: 1095
							var41 += var43 * var52; // L: 1096
							var44 += var46 * var52; // L: 1097
							var47 += var49 * var52; // L: 1098
							if (var2 != var1 && var32 < var30 || var2 == var1 && var32 > var31) { // L: 1099
								var3 -= var2; // L: 1100
								var2 -= var1; // L: 1101
								var1 = var50[var1]; // L: 1102

								while (true) {
									--var2; // L: 1103
									if (var2 < 0) {
										while (true) {
											--var3; // L: 1114
											if (var3 < 0) {
												return; // L: 1125
											}

											this.method4969(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48); // L: 1115
											var6 += var32; // L: 1116
											var5 += var31; // L: 1117
											var10 += var35; // L: 1118
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 1119
											var41 += var43; // L: 1120
											var44 += var46; // L: 1121
											var47 += var49; // L: 1122
											var7 += var39; // L: 1123
										}
									}

									this.method4969(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48); // L: 1104
									var6 += var32; // L: 1105
									var4 += var30; // L: 1106
									var10 += var35; // L: 1107
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 1108
									var41 += var43; // L: 1109
									var44 += var46; // L: 1110
									var47 += var49; // L: 1111
									var7 += var39; // L: 1112
								}
							} else {
								var3 -= var2; // L: 1128
								var2 -= var1; // L: 1129
								var1 = var50[var1]; // L: 1130

								while (true) {
									--var2; // L: 1131
									if (var2 < 0) {
										while (true) {
											--var3; // L: 1142
											if (var3 < 0) {
												return; // L: 1153
											}

											this.method4969(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48); // L: 1143
											var6 += var32; // L: 1144
											var5 += var31; // L: 1145
											var10 += var35; // L: 1146
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 1147
											var41 += var43; // L: 1148
											var44 += var46; // L: 1149
											var47 += var49; // L: 1150
											var7 += var39; // L: 1151
										}
									}

									this.method4969(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48); // L: 1132
									var6 += var32; // L: 1133
									var4 += var30; // L: 1134
									var10 += var35; // L: 1135
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 1136
									var41 += var43; // L: 1137
									var44 += var46; // L: 1138
									var47 += var49; // L: 1139
									var7 += var39; // L: 1140
								}
							}
						} else {
							var5 = var4 <<= 14; // L: 1157
							if (var1 < 0) { // L: 1158
								var5 -= var32 * var1; // L: 1159
								var4 -= var30 * var1; // L: 1160
								var10 -= var35 * var1; // L: 1161
								var7 -= var39 * (float)var1; // L: 1162
								var1 = 0; // L: 1163
							}

							var6 <<= 14; // L: 1165
							if (var3 < 0) { // L: 1166
								var6 -= var3 * var31; // L: 1167
								var3 = 0; // L: 1168
							}

							var52 = var1 - super.field2530.field2793; // L: 1170
							var41 += var43 * var52; // L: 1171
							var44 += var46 * var52; // L: 1172
							var47 += var49 * var52; // L: 1173
							if (var3 != var1 && var32 < var30 || var3 == var1 && var31 > var30) { // L: 1174
								var2 -= var3; // L: 1175
								var3 -= var1; // L: 1176
								var1 = var50[var1]; // L: 1177

								while (true) {
									--var3; // L: 1178
									if (var3 < 0) {
										while (true) {
											--var2; // L: 1189
											if (var2 < 0) {
												return; // L: 1200
											}

											this.method4969(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48); // L: 1190
											var6 += var31; // L: 1191
											var4 += var30; // L: 1192
											var10 += var35; // L: 1193
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 1194
											var41 += var43; // L: 1195
											var44 += var46; // L: 1196
											var47 += var49; // L: 1197
											var7 += var39; // L: 1198
										}
									}

									this.method4969(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48); // L: 1179
									var5 += var32; // L: 1180
									var4 += var30; // L: 1181
									var10 += var35; // L: 1182
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 1183
									var41 += var43; // L: 1184
									var44 += var46; // L: 1185
									var47 += var49; // L: 1186
									var7 += var39; // L: 1187
								}
							} else {
								var2 -= var3; // L: 1203
								var3 -= var1; // L: 1204
								var1 = var50[var1]; // L: 1205

								while (true) {
									--var3; // L: 1206
									if (var3 < 0) {
										while (true) {
											--var2; // L: 1217
											if (var2 < 0) {
												return; // L: 1228
											}

											this.method4969(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48); // L: 1218
											var6 += var31; // L: 1219
											var4 += var30; // L: 1220
											var10 += var35; // L: 1221
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 1222
											var41 += var43; // L: 1223
											var44 += var46; // L: 1224
											var47 += var49; // L: 1225
											var7 += var39; // L: 1226
										}
									}

									this.method4969(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48); // L: 1207
									var5 += var32; // L: 1208
									var4 += var30; // L: 1209
									var10 += var35; // L: 1210
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 1211
									var41 += var43; // L: 1212
									var44 += var46; // L: 1213
									var47 += var49; // L: 1214
									var7 += var39; // L: 1215
								}
							}
						}
					}
				} else if (var2 <= var3) { // L: 1232
					if (var2 < var51) { // L: 1233
						if (var3 > var51) { // L: 1234
							var3 = var51;
						}

						if (var1 > var51) { // L: 1235
							var1 = var51;
						}

						var11 = var34 + ((var11 << 9) - var5 * var34); // L: 1236
						var8 = var8 - var38 * (float)var5 + var38; // L: 1237
						if (var3 < var1) { // L: 1238
							var4 = var5 <<= 14; // L: 1239
							if (var2 < 0) { // L: 1240
								var4 -= var30 * var2; // L: 1241
								var5 -= var31 * var2; // L: 1242
								var11 -= var35 * var2; // L: 1243
								var8 -= var39 * (float)var2; // L: 1244
								var2 = 0; // L: 1245
							}

							var6 <<= 14; // L: 1247
							if (var3 < 0) { // L: 1248
								var6 -= var3 * var32; // L: 1249
								var3 = 0; // L: 1250
							}

							var52 = var2 - super.field2530.field2793; // L: 1252
							var41 += var43 * var52; // L: 1253
							var44 += var46 * var52; // L: 1254
							var47 += var49 * var52; // L: 1255
							if ((var3 == var2 || var30 >= var31) && (var3 != var2 || var30 <= var32)) { // L: 1256
								var1 -= var3; // L: 1285
								var3 -= var2; // L: 1286
								var2 = var50[var2]; // L: 1287

								while (true) {
									--var3; // L: 1288
									if (var3 < 0) {
										while (true) {
											--var1; // L: 1299
											if (var1 < 0) {
												return; // L: 1310
											}

											this.method4969(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48); // L: 1300
											var4 += var30; // L: 1301
											var6 += var32; // L: 1302
											var11 += var35; // L: 1303
											var2 += Rasterizer2D.Rasterizer2D_width; // L: 1304
											var41 += var43; // L: 1305
											var44 += var46; // L: 1306
											var47 += var49; // L: 1307
											var8 += var39; // L: 1308
										}
									}

									this.method4969(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48); // L: 1289
									var4 += var30; // L: 1290
									var5 += var31; // L: 1291
									var11 += var35; // L: 1292
									var2 += Rasterizer2D.Rasterizer2D_width; // L: 1293
									var41 += var43; // L: 1294
									var44 += var46; // L: 1295
									var47 += var49; // L: 1296
									var8 += var39; // L: 1297
								}
							} else {
								var1 -= var3; // L: 1257
								var3 -= var2; // L: 1258
								var2 = var50[var2]; // L: 1259

								while (true) {
									--var3; // L: 1260
									if (var3 < 0) {
										while (true) {
											--var1; // L: 1271
											if (var1 < 0) {
												return; // L: 1282
											}

											this.method4969(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48); // L: 1272
											var4 += var30; // L: 1273
											var6 += var32; // L: 1274
											var11 += var35; // L: 1275
											var2 += Rasterizer2D.Rasterizer2D_width; // L: 1276
											var41 += var43; // L: 1277
											var44 += var46; // L: 1278
											var47 += var49; // L: 1279
											var8 += var39; // L: 1280
										}
									}

									this.method4969(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48); // L: 1261
									var4 += var30; // L: 1262
									var5 += var31; // L: 1263
									var11 += var35; // L: 1264
									var2 += Rasterizer2D.Rasterizer2D_width; // L: 1265
									var41 += var43; // L: 1266
									var44 += var46; // L: 1267
									var47 += var49; // L: 1268
									var8 += var39; // L: 1269
								}
							}
						} else {
							var6 = var5 <<= 14; // L: 1314
							if (var2 < 0) { // L: 1315
								var6 -= var30 * var2; // L: 1316
								var5 -= var31 * var2; // L: 1317
								var11 -= var35 * var2; // L: 1318
								var8 -= var39 * (float)var2; // L: 1319
								var2 = 0; // L: 1320
							}

							var4 <<= 14; // L: 1322
							if (var1 < 0) { // L: 1323
								var4 -= var32 * var1; // L: 1324
								var1 = 0; // L: 1325
							}

							var52 = var2 - super.field2530.field2793; // L: 1327
							var41 += var43 * var52; // L: 1328
							var44 += var46 * var52; // L: 1329
							var47 += var49 * var52; // L: 1330
							if (var30 < var31) { // L: 1331
								var3 -= var1; // L: 1332
								var1 -= var2; // L: 1333
								var2 = var50[var2]; // L: 1334

								while (true) {
									--var1; // L: 1335
									if (var1 < 0) {
										while (true) {
											--var3; // L: 1346
											if (var3 < 0) {
												return; // L: 1357
											}

											this.method4969(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48); // L: 1347
											var4 += var32; // L: 1348
											var5 += var31; // L: 1349
											var11 += var35; // L: 1350
											var2 += Rasterizer2D.Rasterizer2D_width; // L: 1351
											var41 += var43; // L: 1352
											var44 += var46; // L: 1353
											var47 += var49; // L: 1354
											var8 += var39; // L: 1355
										}
									}

									this.method4969(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48); // L: 1336
									var6 += var30; // L: 1337
									var5 += var31; // L: 1338
									var11 += var35; // L: 1339
									var2 += Rasterizer2D.Rasterizer2D_width; // L: 1340
									var41 += var43; // L: 1341
									var44 += var46; // L: 1342
									var47 += var49; // L: 1343
									var8 += var39; // L: 1344
								}
							} else {
								var3 -= var1; // L: 1360
								var1 -= var2; // L: 1361
								var2 = var50[var2]; // L: 1362

								while (true) {
									--var1; // L: 1363
									if (var1 < 0) {
										while (true) {
											--var3; // L: 1374
											if (var3 < 0) {
												return; // L: 1385
											}

											this.method4969(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48); // L: 1375
											var4 += var32; // L: 1376
											var5 += var31; // L: 1377
											var11 += var35; // L: 1378
											var2 += Rasterizer2D.Rasterizer2D_width; // L: 1379
											var41 += var43; // L: 1380
											var44 += var46; // L: 1381
											var47 += var49; // L: 1382
											var8 += var39; // L: 1383
										}
									}

									this.method4969(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48); // L: 1364
									var6 += var30; // L: 1365
									var5 += var31; // L: 1366
									var11 += var35; // L: 1367
									var2 += Rasterizer2D.Rasterizer2D_width; // L: 1368
									var41 += var43; // L: 1369
									var44 += var46; // L: 1370
									var47 += var49; // L: 1371
									var8 += var39; // L: 1372
								}
							}
						}
					}
				} else if (var3 < var51) { // L: 1390
					if (var1 > var51) { // L: 1391
						var1 = var51;
					}

					if (var2 > var51) { // L: 1392
						var2 = var51;
					}

					var12 = (var12 << 9) - var34 * var6 + var34; // L: 1393
					var9 = var9 - var38 * (float)var6 + var38; // L: 1394
					if (var1 < var2) { // L: 1395
						var5 = var6 <<= 14; // L: 1396
						if (var3 < 0) { // L: 1397
							var5 -= var3 * var31; // L: 1398
							var6 -= var3 * var32; // L: 1399
							var12 -= var3 * var35; // L: 1400
							var9 -= var39 * (float)var3; // L: 1401
							var3 = 0; // L: 1402
						}

						var4 <<= 14; // L: 1404
						if (var1 < 0) { // L: 1405
							var4 -= var30 * var1; // L: 1406
							var1 = 0; // L: 1407
						}

						var52 = var3 - super.field2530.field2793; // L: 1409
						var41 += var43 * var52; // L: 1410
						var44 += var46 * var52; // L: 1411
						var47 += var49 * var52; // L: 1412
						if (var31 < var32) { // L: 1413
							var2 -= var1; // L: 1414
							var1 -= var3; // L: 1415
							var3 = var50[var3]; // L: 1416

							while (true) {
								--var1; // L: 1417
								if (var1 < 0) {
									while (true) {
										--var2; // L: 1428
										if (var2 < 0) {
											return; // L: 1439
										}

										this.method4969(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48); // L: 1429
										var5 += var31; // L: 1430
										var4 += var30; // L: 1431
										var12 += var35; // L: 1432
										var3 += Rasterizer2D.Rasterizer2D_width; // L: 1433
										var41 += var43; // L: 1434
										var44 += var46; // L: 1435
										var47 += var49; // L: 1436
										var9 += var39; // L: 1437
									}
								}

								this.method4969(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48); // L: 1418
								var5 += var31; // L: 1419
								var6 += var32; // L: 1420
								var12 += var35; // L: 1421
								var3 += Rasterizer2D.Rasterizer2D_width; // L: 1422
								var41 += var43; // L: 1423
								var44 += var46; // L: 1424
								var47 += var49; // L: 1425
								var9 += var39; // L: 1426
							}
						} else {
							var2 -= var1; // L: 1442
							var1 -= var3; // L: 1443
							var3 = var50[var3]; // L: 1444

							while (true) {
								--var1; // L: 1445
								if (var1 < 0) {
									while (true) {
										--var2; // L: 1456
										if (var2 < 0) {
											return; // L: 1467
										}

										this.method4969(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48); // L: 1457
										var5 += var31; // L: 1458
										var4 += var30; // L: 1459
										var12 += var35; // L: 1460
										var3 += Rasterizer2D.Rasterizer2D_width; // L: 1461
										var41 += var43; // L: 1462
										var44 += var46; // L: 1463
										var47 += var49; // L: 1464
										var9 += var39; // L: 1465
									}
								}

								this.method4969(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48); // L: 1446
								var5 += var31; // L: 1447
								var6 += var32; // L: 1448
								var12 += var35; // L: 1449
								var3 += Rasterizer2D.Rasterizer2D_width; // L: 1450
								var41 += var43; // L: 1451
								var44 += var46; // L: 1452
								var47 += var49; // L: 1453
								var9 += var39; // L: 1454
							}
						}
					} else {
						var4 = var6 <<= 14; // L: 1471
						if (var3 < 0) { // L: 1472
							var4 -= var3 * var31; // L: 1473
							var6 -= var3 * var32; // L: 1474
							var12 -= var3 * var35; // L: 1475
							var9 -= var39 * (float)var3; // L: 1476
							var3 = 0; // L: 1477
						}

						var5 <<= 14; // L: 1479
						if (var2 < 0) { // L: 1480
							var5 -= var30 * var2; // L: 1481
							var2 = 0; // L: 1482
						}

						var52 = var3 - super.field2530.field2793; // L: 1484
						var41 += var43 * var52; // L: 1485
						var44 += var46 * var52; // L: 1486
						var47 += var49 * var52; // L: 1487
						if (var31 < var32) { // L: 1488
							var1 -= var2; // L: 1489
							var2 -= var3; // L: 1490
							var3 = var50[var3]; // L: 1491

							while (true) {
								--var2; // L: 1492
								if (var2 < 0) {
									while (true) {
										--var1; // L: 1503
										if (var1 < 0) {
											return; // L: 1514
										}

										this.method4969(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48); // L: 1504
										var5 += var30; // L: 1505
										var6 += var32; // L: 1506
										var12 += var35; // L: 1507
										var3 += Rasterizer2D.Rasterizer2D_width; // L: 1508
										var41 += var43; // L: 1509
										var44 += var46; // L: 1510
										var47 += var49; // L: 1511
										var9 += var39; // L: 1512
									}
								}

								this.method4969(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48); // L: 1493
								var4 += var31; // L: 1494
								var6 += var32; // L: 1495
								var12 += var35; // L: 1496
								var3 += Rasterizer2D.Rasterizer2D_width; // L: 1497
								var41 += var43; // L: 1498
								var44 += var46; // L: 1499
								var47 += var49; // L: 1500
								var9 += var39; // L: 1501
							}
						} else {
							var1 -= var2; // L: 1517
							var2 -= var3; // L: 1518
							var3 = var50[var3]; // L: 1519

							while (true) {
								--var2; // L: 1520
								if (var2 < 0) {
									while (true) {
										--var1; // L: 1531
										if (var1 < 0) {
											return; // L: 1542
										}

										this.method4969(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48); // L: 1532
										var5 += var30; // L: 1533
										var6 += var32; // L: 1534
										var12 += var35; // L: 1535
										var3 += Rasterizer2D.Rasterizer2D_width; // L: 1536
										var41 += var43; // L: 1537
										var44 += var46; // L: 1538
										var47 += var49; // L: 1539
										var9 += var39; // L: 1540
									}
								}

								this.method4969(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48); // L: 1521
								var4 += var31; // L: 1522
								var6 += var32; // L: 1523
								var12 += var35; // L: 1524
								var3 += Rasterizer2D.Rasterizer2D_width; // L: 1525
								var41 += var43; // L: 1526
								var44 += var46; // L: 1527
								var47 += var49; // L: 1528
								var9 += var39; // L: 1529
							}
						}
					}
				}
			}
		}
	} // L: 1033

	@ObfuscatedName("at")
	void vmethod4954(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
		int[] var23 = super.field2530.Rasterizer3D_textureLoader.getTexturePixels(var22); // L: 1952
		int var24;
		if (var23 == null) { // L: 1953
			var24 = super.field2530.Rasterizer3D_textureLoader.getAverageTextureRGB(var22); // L: 1954
			this.vmethod4970(var1, var2, var3, var4, var5, var6, var7, var8, var9, GroundObject.method4398(var24, var10), GroundObject.method4398(var24, var11), GroundObject.method4398(var24, var12)); // L: 1955
		} else {
			super.field2527 = super.field2530.Rasterizer3D_textureLoader.isLowDetail(var22); // L: 1958
			super.field2531 = super.field2530.Rasterizer3D_textureLoader.vmethod5013(var22); // L: 1959
			var24 = var5 - var4; // L: 1960
			int var25 = var2 - var1; // L: 1961
			int var26 = var6 - var4; // L: 1962
			int var27 = var3 - var1; // L: 1963
			int var28 = var11 - var10; // L: 1964
			int var29 = var12 - var10; // L: 1965
			int var30 = 0; // L: 1966
			if (var2 != var1) { // L: 1967
				var30 = (var5 - var4 << 14) / (var2 - var1);
			}

			int var31 = 0; // L: 1968
			if (var3 != var2) { // L: 1969
				var31 = (var6 - var5 << 14) / (var3 - var2);
			}

			int var32 = 0; // L: 1970
			if (var3 != var1) { // L: 1971
				var32 = (var4 - var6 << 14) / (var1 - var3);
			}

			int var33 = var24 * var27 - var26 * var25; // L: 1972
			if (var33 != 0) { // L: 1973
				int var34 = (var28 * var27 - var29 * var25 << 9) / var33; // L: 1974
				int var35 = (var29 * var24 - var28 * var26 << 9) / var33; // L: 1975
				float var36 = var8 - var7; // L: 1976
				float var37 = var9 - var7; // L: 1977
				float var38 = (var36 * (float)var27 - var37 * (float)var25) / (float)var33; // L: 1978
				float var39 = (var37 * (float)var24 - var36 * (float)var26) / (float)var33; // L: 1979
				int var40 = super.field2530.field2790; // L: 1980
				var14 = var13 - var14; // L: 1981
				var17 = var16 - var17; // L: 1982
				var20 = var19 - var20; // L: 1983
				var15 -= var13; // L: 1984
				var18 -= var16; // L: 1985
				var21 -= var19; // L: 1986
				int var41 = var15 * var16 - var18 * var13 << 14; // L: 1987
				int var42 = (int)(((long)(var18 * var19 - var16 * var21) << 14) / (long)var40); // L: 1988
				int var43 = (int)(((long)(var13 * var21 - var19 * var15) << 14) / (long)var40); // L: 1989
				int var44 = var16 * var14 - var13 * var17 << 14; // L: 1990
				int var45 = (int)(((long)(var19 * var17 - var16 * var20) << 14) / (long)var40); // L: 1991
				int var46 = (int)(((long)(var13 * var20 - var19 * var14) << 14) / (long)var40); // L: 1992
				int var47 = var17 * var15 - var18 * var14 << 14; // L: 1993
				int var48 = (int)(((long)(var18 * var20 - var17 * var21) << 14) / (long)var40); // L: 1994
				int var49 = (int)(((long)(var21 * var14 - var15 * var20) << 14) / (long)var40); // L: 1995
				int[] var50 = super.field2530.Rasterizer3D_rowOffsets; // L: 1996
				int var51 = super.field2530.field2796; // L: 1997
				int var52;
				if (var1 <= var2 && var1 <= var3) { // L: 1998
					if (var1 < var51) { // L: 1999
						if (var2 > var51) { // L: 2000
							var2 = var51;
						}

						if (var3 > var51) { // L: 2001
							var3 = var51;
						}

						var10 = var34 + ((var10 << 9) - var34 * var4); // L: 2002
						var7 = var7 - var38 * (float)var4 + var38; // L: 2003
						if (var2 < var3) { // L: 2004
							var6 = var4 <<= 14; // L: 2005
							if (var1 < 0) { // L: 2006
								var6 -= var32 * var1; // L: 2007
								var4 -= var30 * var1; // L: 2008
								var7 -= var39 * (float)var1; // L: 2009
								var10 -= var35 * var1; // L: 2010
								var1 = 0; // L: 2011
							}

							var5 <<= 14; // L: 2013
							if (var2 < 0) { // L: 2014
								var5 -= var31 * var2; // L: 2015
								var2 = 0; // L: 2016
							}

							var52 = var1 - super.field2530.field2793; // L: 2018
							var41 += var43 * var52; // L: 2019
							var44 += var46 * var52; // L: 2020
							var47 += var49 * var52; // L: 2021
							if (var2 != var1 && var32 < var30 || var2 == var1 && var32 > var31) { // L: 2022
								var3 -= var2; // L: 2023
								var2 -= var1; // L: 2024
								var1 = var50[var1]; // L: 2025

								while (true) {
									--var2; // L: 2026
									if (var2 < 0) {
										while (true) {
											--var3; // L: 2037
											if (var3 < 0) {
												return; // L: 2048
											}

											this.method4976(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48); // L: 2038
											var6 += var32; // L: 2039
											var5 += var31; // L: 2040
											var10 += var35; // L: 2041
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 2042
											var41 += var43; // L: 2043
											var44 += var46; // L: 2044
											var47 += var49; // L: 2045
											var7 += var39; // L: 2046
										}
									}

									this.method4976(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48); // L: 2027
									var6 += var32; // L: 2028
									var4 += var30; // L: 2029
									var10 += var35; // L: 2030
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 2031
									var41 += var43; // L: 2032
									var44 += var46; // L: 2033
									var47 += var49; // L: 2034
									var7 += var39; // L: 2035
								}
							} else {
								var3 -= var2; // L: 2051
								var2 -= var1; // L: 2052
								var1 = var50[var1]; // L: 2053

								while (true) {
									--var2; // L: 2054
									if (var2 < 0) {
										while (true) {
											--var3; // L: 2065
											if (var3 < 0) {
												return; // L: 2076
											}

											this.method4976(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48); // L: 2066
											var6 += var32; // L: 2067
											var5 += var31; // L: 2068
											var10 += var35; // L: 2069
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 2070
											var41 += var43; // L: 2071
											var44 += var46; // L: 2072
											var47 += var49; // L: 2073
											var7 += var39; // L: 2074
										}
									}

									this.method4976(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48); // L: 2055
									var6 += var32; // L: 2056
									var4 += var30; // L: 2057
									var10 += var35; // L: 2058
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 2059
									var41 += var43; // L: 2060
									var44 += var46; // L: 2061
									var47 += var49; // L: 2062
									var7 += var39; // L: 2063
								}
							}
						} else {
							var5 = var4 <<= 14; // L: 2080
							if (var1 < 0) { // L: 2081
								var5 -= var32 * var1; // L: 2082
								var4 -= var30 * var1; // L: 2083
								var7 -= var39 * (float)var1; // L: 2084
								var10 -= var35 * var1; // L: 2085
								var1 = 0; // L: 2086
							}

							var6 <<= 14; // L: 2088
							if (var3 < 0) { // L: 2089
								var6 -= var3 * var31; // L: 2090
								var3 = 0; // L: 2091
							}

							var52 = var1 - super.field2530.field2793; // L: 2093
							var41 += var43 * var52; // L: 2094
							var44 += var46 * var52; // L: 2095
							var47 += var49 * var52; // L: 2096
							if (var3 != var1 && var32 < var30 || var3 == var1 && var31 > var30) { // L: 2097
								var2 -= var3; // L: 2098
								var3 -= var1; // L: 2099
								var1 = var50[var1]; // L: 2100

								while (true) {
									--var3; // L: 2101
									if (var3 < 0) {
										while (true) {
											--var2; // L: 2112
											if (var2 < 0) {
												return; // L: 2123
											}

											this.method4976(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48); // L: 2113
											var6 += var31; // L: 2114
											var4 += var30; // L: 2115
											var10 += var35; // L: 2116
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 2117
											var41 += var43; // L: 2118
											var44 += var46; // L: 2119
											var47 += var49; // L: 2120
											var7 += var39; // L: 2121
										}
									}

									this.method4976(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48); // L: 2102
									var5 += var32; // L: 2103
									var4 += var30; // L: 2104
									var10 += var35; // L: 2105
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 2106
									var41 += var43; // L: 2107
									var44 += var46; // L: 2108
									var47 += var49; // L: 2109
									var7 += var39; // L: 2110
								}
							} else {
								var2 -= var3; // L: 2126
								var3 -= var1; // L: 2127
								var1 = var50[var1]; // L: 2128

								while (true) {
									--var3; // L: 2129
									if (var3 < 0) {
										while (true) {
											--var2; // L: 2140
											if (var2 < 0) {
												return; // L: 2151
											}

											this.method4976(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48); // L: 2141
											var6 += var31; // L: 2142
											var4 += var30; // L: 2143
											var10 += var35; // L: 2144
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 2145
											var41 += var43; // L: 2146
											var44 += var46; // L: 2147
											var47 += var49; // L: 2148
											var7 += var39; // L: 2149
										}
									}

									this.method4976(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48); // L: 2130
									var5 += var32; // L: 2131
									var4 += var30; // L: 2132
									var10 += var35; // L: 2133
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 2134
									var41 += var43; // L: 2135
									var44 += var46; // L: 2136
									var47 += var49; // L: 2137
									var7 += var39; // L: 2138
								}
							}
						}
					}
				} else if (var2 <= var3) { // L: 2155
					if (var2 < var51) { // L: 2156
						if (var3 > var51) { // L: 2157
							var3 = var51;
						}

						if (var1 > var51) { // L: 2158
							var1 = var51;
						}

						var11 = var34 + ((var11 << 9) - var5 * var34); // L: 2159
						var8 = var8 - var38 * (float)var5 + var38; // L: 2160
						if (var3 < var1) { // L: 2161
							var4 = var5 <<= 14; // L: 2162
							if (var2 < 0) { // L: 2163
								var4 -= var30 * var2; // L: 2164
								var5 -= var31 * var2; // L: 2165
								var8 -= var39 * (float)var2; // L: 2166
								var11 -= var35 * var2; // L: 2167
								var2 = 0; // L: 2168
							}

							var6 <<= 14; // L: 2170
							if (var3 < 0) { // L: 2171
								var6 -= var3 * var32; // L: 2172
								var3 = 0; // L: 2173
							}

							var52 = var2 - super.field2530.field2793; // L: 2175
							var41 += var43 * var52; // L: 2176
							var44 += var46 * var52; // L: 2177
							var47 += var49 * var52; // L: 2178
							if ((var3 == var2 || var30 >= var31) && (var3 != var2 || var30 <= var32)) { // L: 2179
								var1 -= var3; // L: 2208
								var3 -= var2; // L: 2209
								var2 = var50[var2]; // L: 2210

								while (true) {
									--var3; // L: 2211
									if (var3 < 0) {
										while (true) {
											--var1; // L: 2222
											if (var1 < 0) {
												return; // L: 2233
											}

											this.method4976(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48); // L: 2223
											var4 += var30; // L: 2224
											var6 += var32; // L: 2225
											var11 += var35; // L: 2226
											var2 += Rasterizer2D.Rasterizer2D_width; // L: 2227
											var41 += var43; // L: 2228
											var44 += var46; // L: 2229
											var47 += var49; // L: 2230
											var8 += var39; // L: 2231
										}
									}

									this.method4976(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48); // L: 2212
									var4 += var30; // L: 2213
									var5 += var31; // L: 2214
									var11 += var35; // L: 2215
									var2 += Rasterizer2D.Rasterizer2D_width; // L: 2216
									var41 += var43; // L: 2217
									var44 += var46; // L: 2218
									var47 += var49; // L: 2219
									var8 += var39; // L: 2220
								}
							} else {
								var1 -= var3; // L: 2180
								var3 -= var2; // L: 2181
								var2 = var50[var2]; // L: 2182

								while (true) {
									--var3; // L: 2183
									if (var3 < 0) {
										while (true) {
											--var1; // L: 2194
											if (var1 < 0) {
												return; // L: 2205
											}

											this.method4976(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48); // L: 2195
											var4 += var30; // L: 2196
											var6 += var32; // L: 2197
											var11 += var35; // L: 2198
											var2 += Rasterizer2D.Rasterizer2D_width; // L: 2199
											var41 += var43; // L: 2200
											var44 += var46; // L: 2201
											var47 += var49; // L: 2202
											var8 += var39; // L: 2203
										}
									}

									this.method4976(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48); // L: 2184
									var4 += var30; // L: 2185
									var5 += var31; // L: 2186
									var11 += var35; // L: 2187
									var2 += Rasterizer2D.Rasterizer2D_width; // L: 2188
									var41 += var43; // L: 2189
									var44 += var46; // L: 2190
									var47 += var49; // L: 2191
									var8 += var39; // L: 2192
								}
							}
						} else {
							var6 = var5 <<= 14; // L: 2237
							if (var2 < 0) { // L: 2238
								var6 -= var30 * var2; // L: 2239
								var5 -= var31 * var2; // L: 2240
								var8 -= var39 * (float)var2; // L: 2241
								var11 -= var35 * var2; // L: 2242
								var2 = 0; // L: 2243
							}

							var4 <<= 14; // L: 2245
							if (var1 < 0) { // L: 2246
								var4 -= var32 * var1; // L: 2247
								var1 = 0; // L: 2248
							}

							var52 = var2 - super.field2530.field2793; // L: 2250
							var41 += var43 * var52; // L: 2251
							var44 += var46 * var52; // L: 2252
							var47 += var49 * var52; // L: 2253
							if (var30 < var31) { // L: 2254
								var3 -= var1; // L: 2255
								var1 -= var2; // L: 2256
								var2 = var50[var2]; // L: 2257

								while (true) {
									--var1; // L: 2258
									if (var1 < 0) {
										while (true) {
											--var3; // L: 2269
											if (var3 < 0) {
												return; // L: 2280
											}

											this.method4976(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48); // L: 2270
											var4 += var32; // L: 2271
											var5 += var31; // L: 2272
											var11 += var35; // L: 2273
											var2 += Rasterizer2D.Rasterizer2D_width; // L: 2274
											var41 += var43; // L: 2275
											var44 += var46; // L: 2276
											var47 += var49; // L: 2277
											var8 += var39; // L: 2278
										}
									}

									this.method4976(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48); // L: 2259
									var6 += var30; // L: 2260
									var5 += var31; // L: 2261
									var11 += var35; // L: 2262
									var2 += Rasterizer2D.Rasterizer2D_width; // L: 2263
									var41 += var43; // L: 2264
									var44 += var46; // L: 2265
									var47 += var49; // L: 2266
									var8 += var39; // L: 2267
								}
							} else {
								var3 -= var1; // L: 2283
								var1 -= var2; // L: 2284
								var2 = var50[var2]; // L: 2285

								while (true) {
									--var1; // L: 2286
									if (var1 < 0) {
										while (true) {
											--var3; // L: 2297
											if (var3 < 0) {
												return; // L: 2308
											}

											this.method4976(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48); // L: 2298
											var4 += var32; // L: 2299
											var5 += var31; // L: 2300
											var11 += var35; // L: 2301
											var2 += Rasterizer2D.Rasterizer2D_width; // L: 2302
											var41 += var43; // L: 2303
											var44 += var46; // L: 2304
											var47 += var49; // L: 2305
											var8 += var39; // L: 2306
										}
									}

									this.method4976(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48); // L: 2287
									var6 += var30; // L: 2288
									var5 += var31; // L: 2289
									var11 += var35; // L: 2290
									var2 += Rasterizer2D.Rasterizer2D_width; // L: 2291
									var41 += var43; // L: 2292
									var44 += var46; // L: 2293
									var47 += var49; // L: 2294
									var8 += var39; // L: 2295
								}
							}
						}
					}
				} else if (var3 < var51) { // L: 2313
					if (var1 > var51) { // L: 2314
						var1 = var51;
					}

					if (var2 > var51) { // L: 2315
						var2 = var51;
					}

					var12 = (var12 << 9) - var34 * var6 + var34; // L: 2316
					var9 = var9 - var38 * (float)var6 + var38; // L: 2317
					if (var1 < var2) { // L: 2318
						var5 = var6 <<= 14; // L: 2319
						if (var3 < 0) { // L: 2320
							var5 -= var3 * var31; // L: 2321
							var6 -= var3 * var32; // L: 2322
							var9 -= var39 * (float)var3; // L: 2323
							var12 -= var3 * var35; // L: 2324
							var3 = 0; // L: 2325
						}

						var4 <<= 14; // L: 2327
						if (var1 < 0) { // L: 2328
							var4 -= var30 * var1; // L: 2329
							var1 = 0; // L: 2330
						}

						var52 = var3 - super.field2530.field2793; // L: 2332
						var41 += var43 * var52; // L: 2333
						var44 += var46 * var52; // L: 2334
						var47 += var49 * var52; // L: 2335
						if (var31 < var32) { // L: 2336
							var2 -= var1; // L: 2337
							var1 -= var3; // L: 2338
							var3 = var50[var3]; // L: 2339

							while (true) {
								--var1; // L: 2340
								if (var1 < 0) {
									while (true) {
										--var2; // L: 2351
										if (var2 < 0) {
											return; // L: 2362
										}

										this.method4976(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48); // L: 2352
										var5 += var31; // L: 2353
										var4 += var30; // L: 2354
										var12 += var35; // L: 2355
										var3 += Rasterizer2D.Rasterizer2D_width; // L: 2356
										var41 += var43; // L: 2357
										var44 += var46; // L: 2358
										var47 += var49; // L: 2359
										var9 += var39; // L: 2360
									}
								}

								this.method4976(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48); // L: 2341
								var5 += var31; // L: 2342
								var6 += var32; // L: 2343
								var12 += var35; // L: 2344
								var3 += Rasterizer2D.Rasterizer2D_width; // L: 2345
								var41 += var43; // L: 2346
								var44 += var46; // L: 2347
								var47 += var49; // L: 2348
								var9 += var39; // L: 2349
							}
						} else {
							var2 -= var1; // L: 2365
							var1 -= var3; // L: 2366
							var3 = var50[var3]; // L: 2367

							while (true) {
								--var1; // L: 2368
								if (var1 < 0) {
									while (true) {
										--var2; // L: 2379
										if (var2 < 0) {
											return; // L: 2390
										}

										this.method4976(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48); // L: 2380
										var5 += var31; // L: 2381
										var4 += var30; // L: 2382
										var12 += var35; // L: 2383
										var3 += Rasterizer2D.Rasterizer2D_width; // L: 2384
										var41 += var43; // L: 2385
										var44 += var46; // L: 2386
										var47 += var49; // L: 2387
										var9 += var39; // L: 2388
									}
								}

								this.method4976(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48); // L: 2369
								var5 += var31; // L: 2370
								var6 += var32; // L: 2371
								var12 += var35; // L: 2372
								var3 += Rasterizer2D.Rasterizer2D_width; // L: 2373
								var41 += var43; // L: 2374
								var44 += var46; // L: 2375
								var47 += var49; // L: 2376
								var9 += var39; // L: 2377
							}
						}
					} else {
						var4 = var6 <<= 14; // L: 2394
						if (var3 < 0) { // L: 2395
							var4 -= var3 * var31; // L: 2396
							var6 -= var3 * var32; // L: 2397
							var9 -= var39 * (float)var3; // L: 2398
							var12 -= var3 * var35; // L: 2399
							var3 = 0; // L: 2400
						}

						var5 <<= 14; // L: 2402
						if (var2 < 0) { // L: 2403
							var5 -= var30 * var2; // L: 2404
							var2 = 0; // L: 2405
						}

						var52 = var3 - super.field2530.field2793; // L: 2407
						var41 += var43 * var52; // L: 2408
						var44 += var46 * var52; // L: 2409
						var47 += var49 * var52; // L: 2410
						if (var31 < var32) { // L: 2411
							var1 -= var2; // L: 2412
							var2 -= var3; // L: 2413
							var3 = var50[var3]; // L: 2414

							while (true) {
								--var2; // L: 2415
								if (var2 < 0) {
									while (true) {
										--var1; // L: 2426
										if (var1 < 0) {
											return; // L: 2437
										}

										this.method4976(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48); // L: 2427
										var5 += var30; // L: 2428
										var6 += var32; // L: 2429
										var12 += var35; // L: 2430
										var3 += Rasterizer2D.Rasterizer2D_width; // L: 2431
										var41 += var43; // L: 2432
										var44 += var46; // L: 2433
										var47 += var49; // L: 2434
										var9 += var39; // L: 2435
									}
								}

								this.method4976(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48); // L: 2416
								var4 += var31; // L: 2417
								var6 += var32; // L: 2418
								var12 += var35; // L: 2419
								var3 += Rasterizer2D.Rasterizer2D_width; // L: 2420
								var41 += var43; // L: 2421
								var44 += var46; // L: 2422
								var47 += var49; // L: 2423
								var9 += var39; // L: 2424
							}
						} else {
							var1 -= var2; // L: 2440
							var2 -= var3; // L: 2441
							var3 = var50[var3]; // L: 2442

							while (true) {
								--var2; // L: 2443
								if (var2 < 0) {
									while (true) {
										--var1; // L: 2454
										if (var1 < 0) {
											return; // L: 2465
										}

										this.method4976(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48); // L: 2455
										var5 += var30; // L: 2456
										var6 += var32; // L: 2457
										var12 += var35; // L: 2458
										var3 += Rasterizer2D.Rasterizer2D_width; // L: 2459
										var41 += var43; // L: 2460
										var44 += var46; // L: 2461
										var47 += var49; // L: 2462
										var9 += var39; // L: 2463
									}
								}

								this.method4976(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48); // L: 2444
								var4 += var31; // L: 2445
								var6 += var32; // L: 2446
								var12 += var35; // L: 2447
								var3 += Rasterizer2D.Rasterizer2D_width; // L: 2448
								var41 += var43; // L: 2449
								var44 += var46; // L: 2450
								var47 += var49; // L: 2451
								var9 += var39; // L: 2452
							}
						}
					}
				}
			}
		}
	} // L: 1956

	@ObfuscatedName("bj")
	final void method4994(int[] var1, float[] var2, int var3, int var4, float var5) {
		int var6 = method4964(var2[var3], var5) ? 1 : 0; // L: 435
		int var7 = 1 - var6; // L: 436
		var1[var3] = var7 * var1[var3] + var6 * var4; // L: 437
		var2[var3] = (float)var6 * var5 + (float)var7 * var2[var3]; // L: 438
	} // L: 439

	@ObfuscatedName("bn")
	final void method4972(int[] var1, float[] var2, int var3, int var4, float var5) {
		if (method4964(var2[var3], var5)) { // L: 442
			int var6 = (var4 & (var4 >> 31 & 1) - 1) >> 8; // L: 443
			var1[var3] = super.field2529[var6]; // L: 444
			var2[var3] = var5; // L: 445
		}

	} // L: 447

	@ObfuscatedName("bs")
	final void method4958(int[] var1, float[] var2, int var3, int var4, int var5, float var6) {
		if (method4964(var2[var3], var6)) { // L: 450
			int var7 = var1[var3]; // L: 451
			var1[var3] = ((var7 & 16711935) * var5 >> 8 & 16711935) + var4 + (var5 * (var7 & 65280) >> 8 & 65280); // L: 452
		}

	} // L: 454

	@ObfuscatedName("br")
	final void method4959(int[] var1, float[] var2, int var3, int var4, int var5, int var6, float var7) {
		if (method4964(var2[var3], var7)) { // L: 457
			int var8 = (var4 & (var4 >> 31 & 1) - 1) >> 8; // L: 458
			int var9 = super.field2529[var8]; // L: 459
			var9 = ((var9 & 65280) * var6 >> 8 & 65280) + ((var9 & 16711935) * var6 >> 8 & 16711935); // L: 460
			int var10 = var1[var3]; // L: 461
			var1[var3] = var9 + ((var10 & 16711935) * var5 >> 8 & 16711935) + (var5 * (var10 & 65280) >> 8 & 65280); // L: 462
		}

	} // L: 464

	@ObfuscatedName("bg")
	final void method4960(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, float var9, float var10) {
		if (super.field2530.field2798) { // L: 467
			if (var6 > super.field2530.field2797) { // L: 468
				var6 = super.field2530.field2797;
			}

			if (var5 < 0) { // L: 469
				var5 = 0;
			}
		}

		if (var5 < var6) { // L: 471
			var2 += var5; // L: 472
			var7 += var5 * var8; // L: 473
			var9 += var10 * (float)var5; // L: 474
			int var11;
			int var12;
			if (super.field2530.field2789) { // L: 475
				var4 = var6 - var5 >> 2; // L: 476
				var8 <<= 2; // L: 477
				if (super.field2530.field2788 == 0) { // L: 478
					if (var4 > 0) { // L: 479
						do {
							var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8; // L: 481
							var3 = super.field2529[var11]; // L: 482
							var7 += var8; // L: 483
							this.method4994(var1, Rasterizer2D.field5062, var2, var3, var9); // L: 484
							var9 += var10; // L: 485
							++var2; // L: 486
							this.method4994(var1, Rasterizer2D.field5062, var2, var3, var9); // L: 487
							var9 += var10; // L: 488
							++var2; // L: 489
							this.method4994(var1, Rasterizer2D.field5062, var2, var3, var9); // L: 490
							var9 += var10; // L: 491
							++var2; // L: 492
							this.method4994(var1, Rasterizer2D.field5062, var2, var3, var9); // L: 493
							var9 += var10; // L: 494
							++var2; // L: 495
							--var4; // L: 496
						} while(var4 > 0);
					}

					var4 = var6 - var5 & 3; // L: 498
					if (var4 > 0) { // L: 499
						var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8; // L: 500
						var3 = super.field2529[var11]; // L: 501

						do {
							this.method4994(var1, Rasterizer2D.field5062, var2, var3, var9); // L: 503
							var9 += var10; // L: 504
							++var2; // L: 505
							--var4; // L: 506
						} while(var4 > 0);
					}
				} else {
					var11 = super.field2530.field2788; // L: 510
					var12 = 256 - super.field2530.field2788; // L: 511
					int var13;
					if (var4 > 0) { // L: 512
						do {
							var13 = (var7 & (var7 >> 31 & 1) - 1) >> 8; // L: 514
							var3 = super.field2529[var13]; // L: 515
							var7 += var8; // L: 516
							var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + (var12 * (var3 & 65280) >> 8 & 65280); // L: 517
							this.method4958(var1, Rasterizer2D.field5062, var2, var3, var11, var9); // L: 518
							++var2; // L: 519
							var9 += var10; // L: 520
							this.method4958(var1, Rasterizer2D.field5062, var2, var3, var11, var9); // L: 521
							++var2; // L: 522
							var9 += var10; // L: 523
							this.method4958(var1, Rasterizer2D.field5062, var2, var3, var11, var9); // L: 524
							++var2; // L: 525
							var9 += var10; // L: 526
							this.method4958(var1, Rasterizer2D.field5062, var2, var3, var11, var9); // L: 527
							++var2; // L: 528
							var9 += var10; // L: 529
							--var4; // L: 530
						} while(var4 > 0);
					}

					var4 = var6 - var5 & 3; // L: 532
					if (var4 > 0) { // L: 533
						var13 = (var7 & (var7 >> 31 & 1) - 1) >> 8; // L: 534
						var3 = super.field2529[var13]; // L: 535
						var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + (var12 * (var3 & 65280) >> 8 & 65280); // L: 536

						do {
							this.method4958(var1, Rasterizer2D.field5062, var2, var3, var11, var9); // L: 538
							++var2; // L: 539
							var9 += var10; // L: 540
							--var4; // L: 541
						} while(var4 > 0);
					}
				}

			} else {
				var4 = var6 - var5; // L: 547
				if (super.field2530.field2788 == 0) { // L: 548
					do {
						this.method4972(var1, Rasterizer2D.field5062, var2, var7, var9); // L: 550
						var9 += var10; // L: 551
						++var2; // L: 552
						var7 += var8; // L: 553
						--var4; // L: 554
					} while(var4 > 0);
				} else {
					var11 = super.field2530.field2788; // L: 557
					var12 = 256 - super.field2530.field2788; // L: 558

					do {
						this.method4959(var1, Rasterizer2D.field5062, var2, var3, var11, var12, var9); // L: 560
						var9 += var10; // L: 561
						++var2; // L: 562
						var7 += var8; // L: 563
						--var4; // L: 564
					} while(var4 > 0);
				}

			}
		}
	} // L: 544 566

	@ObfuscatedName("bu")
	final void method4962(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8) {
		if (super.field2530.field2798) { // L: 958
			if (var6 > super.field2530.field2797) { // L: 959
				var6 = super.field2530.field2797;
			}

			if (var5 < 0) { // L: 960
				var5 = 0;
			}
		}

		if (var5 < var6) { // L: 962
			var2 += var5; // L: 963
			var4 = var6 - var5 >> 2; // L: 964
			var7 += var8 * (float)var5; // L: 965
			if (super.field2530.field2788 != 0) { // L: 966
				if (super.field2530.field2788 == 254) { // L: 988
					while (true) {
						--var4; // L: 989
						if (var4 < 0) {
							var4 = var6 - var5 & 3; // L: 995

							while (true) {
								--var4; // L: 996
								if (var4 < 0) {
									return; // L: 1025
								}

								var1[var2++] = var1[var2]; // L: 997
							}
						}

						var1[var2++] = var1[var2]; // L: 990
						var1[var2++] = var1[var2]; // L: 991
						var1[var2++] = var1[var2]; // L: 992
						var1[var2++] = var1[var2]; // L: 993
					}
				} else {
					int var9 = super.field2530.field2788; // L: 1001
					int var10 = 256 - super.field2530.field2788; // L: 1002
					var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + (var10 * (var3 & 65280) >> 8 & 65280); // L: 1003

					while (true) {
						--var4; // L: 1004
						if (var4 < 0) {
							var4 = var6 - var5 & 3; // L: 1018

							while (true) {
								--var4; // L: 1019
								if (var4 < 0) {
									return;
								}

								this.method4958(var1, Rasterizer2D.field5062, var2, var3, var9, var7); // L: 1020
								++var2; // L: 1021
								var7 += var8; // L: 1022
							}
						}

						this.method4958(var1, Rasterizer2D.field5062, var2, var3, var9, var7); // L: 1005
						++var2; // L: 1006
						var7 += var8; // L: 1007
						this.method4958(var1, Rasterizer2D.field5062, var2, var3, var9, var7); // L: 1008
						++var2; // L: 1009
						var7 += var8; // L: 1010
						this.method4958(var1, Rasterizer2D.field5062, var2, var3, var9, var7); // L: 1011
						++var2; // L: 1012
						var7 += var8; // L: 1013
						this.method4958(var1, Rasterizer2D.field5062, var2, var3, var9, var7); // L: 1014
						++var2; // L: 1015
						var7 += var8; // L: 1016
					}
				}
			} else {
				while (true) {
					--var4; // L: 967
					if (var4 < 0) {
						var4 = var6 - var5 & 3; // L: 981

						while (true) {
							--var4; // L: 982
							if (var4 < 0) {
								return;
							}

							this.method4994(var1, Rasterizer2D.field5062, var2, var3, var7); // L: 983
							var7 += var8; // L: 984
							++var2; // L: 985
						}
					}

					this.method4994(var1, Rasterizer2D.field5062, var2, var3, var7); // L: 968
					var7 += var8; // L: 969
					++var2; // L: 970
					this.method4994(var1, Rasterizer2D.field5062, var2, var3, var7); // L: 971
					var7 += var8; // L: 972
					++var2; // L: 973
					this.method4994(var1, Rasterizer2D.field5062, var2, var3, var7); // L: 974
					var7 += var8; // L: 975
					++var2; // L: 976
					this.method4994(var1, Rasterizer2D.field5062, var2, var3, var7); // L: 977
					var7 += var8; // L: 978
					++var2; // L: 979
				}
			}
		}
	}

	@ObfuscatedName("bp")
	final void method4969(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, float var10, float var11, int var12, int var13, int var14, int var15, int var16, int var17) {
		if (super.field2530.field2798) { // L: 1589
			if (var7 > super.field2530.field2797) { // L: 1590
				var7 = super.field2530.field2797;
			}

			if (var6 < 0) { // L: 1591
				var6 = 0;
			}
		}

		if (var6 < var7) { // L: 1593
			var5 += var6; // L: 1594
			var8 += var9 * var6; // L: 1595
			var10 += var11 * (float)var6; // L: 1596
			int var20 = var7 - var6; // L: 1597
			int var10000;
			int var18;
			int var19;
			int var21;
			int var22;
			int var23;
			int var24;
			int var25;
			int var26;
			if (super.field2527) { // L: 1598
				var26 = var6 - super.field2530.field2795; // L: 1604
				var12 += (var15 >> 3) * var26; // L: 1605
				var13 += var26 * (var16 >> 3); // L: 1606
				var14 += var26 * (var17 >> 3); // L: 1607
				var25 = var14 >> 12; // L: 1608
				if (var25 != 0) { // L: 1609
					var21 = var12 / var25; // L: 1610
					var22 = var13 / var25; // L: 1611
					if (var21 < 0) { // L: 1612
						var21 = 0;
					} else if (var21 > 4032) { // L: 1613
						var21 = 4032;
					}
				} else {
					var21 = 0; // L: 1616
					var22 = 0; // L: 1617
				}

				var12 += var15; // L: 1619
				var13 += var16; // L: 1620
				var14 += var17; // L: 1621
				var25 = var14 >> 12; // L: 1622
				if (var25 != 0) { // L: 1623
					var23 = var12 / var25; // L: 1624
					var24 = var13 / var25; // L: 1625
					if (var23 < 0) { // L: 1626
						var23 = 0;
					} else if (var23 > 4032) { // L: 1627
						var23 = 4032;
					}
				} else {
					var23 = 0; // L: 1630
					var24 = 0; // L: 1631
				}

				var3 = (var21 << 20) + var22; // L: 1633
				var19 = (var24 - var22 >> 3) + (var23 - var21 >> 3 << 20); // L: 1634
				var20 >>= 3; // L: 1635
				var9 <<= 3; // L: 1636
				var18 = var8 >> 8; // L: 1637
				if (super.field2531) { // L: 1638
					if (var20 > 0) { // L: 1639
						do {
							method4965(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 1641
							++var5; // L: 1642
							var3 += var19; // L: 1643
							var10 += var11; // L: 1644
							method4965(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 1645
							++var5; // L: 1646
							var3 += var19; // L: 1647
							var10 += var11; // L: 1648
							method4965(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 1649
							++var5; // L: 1650
							var3 += var19; // L: 1651
							var10 += var11; // L: 1652
							method4965(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 1653
							++var5; // L: 1654
							var3 += var19; // L: 1655
							var10 += var11; // L: 1656
							method4965(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 1657
							++var5; // L: 1658
							var3 += var19; // L: 1659
							var10 += var11; // L: 1660
							method4965(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 1661
							++var5; // L: 1662
							var3 += var19; // L: 1663
							var10 += var11; // L: 1664
							method4965(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 1665
							++var5; // L: 1666
							var3 += var19; // L: 1667
							var10 += var11; // L: 1668
							method4965(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 1669
							++var5; // L: 1670
							var10000 = var3 + var19; // L: 1671
							var10 += var11; // L: 1672
							var21 = var23; // L: 1673
							var22 = var24; // L: 1674
							var12 += var15; // L: 1675
							var13 += var16; // L: 1676
							var14 += var17; // L: 1677
							var25 = var14 >> 12; // L: 1678
							if (var25 != 0) { // L: 1679
								var23 = var12 / var25; // L: 1680
								var24 = var13 / var25; // L: 1681
								if (var23 < 0) { // L: 1682
									var23 = 0;
								} else if (var23 > 4032) { // L: 1683
									var23 = 4032;
								}
							} else {
								var23 = 0; // L: 1686
								var24 = 0; // L: 1687
							}

							var3 = (var21 << 20) + var22; // L: 1689
							var19 = (var24 - var22 >> 3) + (var23 - var21 >> 3 << 20); // L: 1690
							var8 += var9; // L: 1691
							var18 = var8 >> 8; // L: 1692
							--var20; // L: 1693
						} while(var20 > 0);
					}

					var20 = var7 - var6 & 7; // L: 1695
					if (var20 > 0) { // L: 1696
						do {
							method4965(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 1698
							++var5; // L: 1699
							var3 += var19; // L: 1700
							var10 += var11; // L: 1701
							--var20; // L: 1702
						} while(var20 > 0);
					}
				} else {
					if (var20 > 0) { // L: 1706
						do {
							method4966(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 1708
							++var5; // L: 1709
							var3 += var19; // L: 1710
							var10 += var11; // L: 1711
							method4966(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 1712
							++var5; // L: 1713
							var3 += var19; // L: 1714
							var10 += var11; // L: 1715
							method4966(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 1716
							++var5; // L: 1717
							var3 += var19; // L: 1718
							var10 += var11; // L: 1719
							method4966(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 1720
							++var5; // L: 1721
							var3 += var19; // L: 1722
							var10 += var11; // L: 1723
							method4966(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 1724
							++var5; // L: 1725
							var3 += var19; // L: 1726
							var10 += var11; // L: 1727
							method4966(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 1728
							++var5; // L: 1729
							var3 += var19; // L: 1730
							var10 += var11; // L: 1731
							method4966(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 1732
							++var5; // L: 1733
							var3 += var19; // L: 1734
							var10 += var11; // L: 1735
							method4966(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 1736
							++var5; // L: 1737
							var10000 = var3 + var19; // L: 1738
							var10 += var11; // L: 1739
							var21 = var23; // L: 1740
							var22 = var24; // L: 1741
							var12 += var15; // L: 1742
							var13 += var16; // L: 1743
							var14 += var17; // L: 1744
							var25 = var14 >> 12; // L: 1745
							if (var25 != 0) { // L: 1746
								var23 = var12 / var25; // L: 1747
								var24 = var13 / var25; // L: 1748
								if (var23 < 0) { // L: 1749
									var23 = 0;
								} else if (var23 > 4032) { // L: 1750
									var23 = 4032;
								}
							} else {
								var23 = 0; // L: 1753
								var24 = 0; // L: 1754
							}

							var3 = (var21 << 20) + var22; // L: 1756
							var19 = (var24 - var22 >> 3) + (var23 - var21 >> 3 << 20); // L: 1757
							var8 += var9; // L: 1758
							var18 = var8 >> 8; // L: 1759
							--var20; // L: 1760
						} while(var20 > 0);
					}

					var20 = var7 - var6 & 7; // L: 1762
					if (var20 > 0) { // L: 1763
						do {
							method4966(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 1765
							++var5; // L: 1766
							var3 += var19; // L: 1767
							var10 += var11; // L: 1768
							--var20; // L: 1769
						} while(var20 > 0);
					}
				}
			} else {
				var26 = var6 - super.field2530.field2795; // L: 1779
				var12 += (var15 >> 3) * var26; // L: 1780
				var13 += var26 * (var16 >> 3); // L: 1781
				var14 += var26 * (var17 >> 3); // L: 1782
				var25 = var14 >> 14; // L: 1783
				if (var25 != 0) { // L: 1784
					var21 = var12 / var25; // L: 1785
					var22 = var13 / var25; // L: 1786
					if (var21 < 0) { // L: 1787
						var21 = 0;
					} else if (var21 > 16256) { // L: 1788
						var21 = 16256;
					}
				} else {
					var21 = 0; // L: 1791
					var22 = 0; // L: 1792
				}

				var12 += var15; // L: 1794
				var13 += var16; // L: 1795
				var14 += var17; // L: 1796
				var25 = var14 >> 14; // L: 1797
				if (var25 != 0) { // L: 1798
					var23 = var12 / var25; // L: 1799
					var24 = var13 / var25; // L: 1800
					if (var23 < 0) { // L: 1801
						var23 = 0;
					} else if (var23 > 16256) { // L: 1802
						var23 = 16256;
					}
				} else {
					var23 = 0; // L: 1805
					var24 = 0; // L: 1806
				}

				var3 = (var21 << 18) + var22; // L: 1808
				var19 = (var24 - var22 >> 3) + (var23 - var21 >> 3 << 18); // L: 1809
				var20 >>= 3; // L: 1810
				var9 <<= 3; // L: 1811
				var18 = var8 >> 8; // L: 1812
				if (super.field2531) { // L: 1813
					if (var20 > 0) { // L: 1814
						do {
							method4967(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 1816
							++var5; // L: 1817
							var3 += var19; // L: 1818
							var10 += var11; // L: 1819
							method4967(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 1820
							++var5; // L: 1821
							var3 += var19; // L: 1822
							var10 += var11; // L: 1823
							method4967(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 1824
							++var5; // L: 1825
							var3 += var19; // L: 1826
							var10 += var11; // L: 1827
							method4967(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 1828
							++var5; // L: 1829
							var3 += var19; // L: 1830
							var10 += var11; // L: 1831
							method4967(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 1832
							++var5; // L: 1833
							var3 += var19; // L: 1834
							var10 += var11; // L: 1835
							method4967(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 1836
							++var5; // L: 1837
							var3 += var19; // L: 1838
							var10 += var11; // L: 1839
							method4967(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 1840
							++var5; // L: 1841
							var3 += var19; // L: 1842
							var10 += var11; // L: 1843
							method4967(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 1844
							++var5; // L: 1845
							var10000 = var3 + var19; // L: 1846
							var10 += var11; // L: 1847
							var21 = var23; // L: 1848
							var22 = var24; // L: 1849
							var12 += var15; // L: 1850
							var13 += var16; // L: 1851
							var14 += var17; // L: 1852
							var25 = var14 >> 14; // L: 1853
							if (var25 != 0) { // L: 1854
								var23 = var12 / var25; // L: 1855
								var24 = var13 / var25; // L: 1856
								if (var23 < 0) { // L: 1857
									var23 = 0;
								} else if (var23 > 16256) { // L: 1858
									var23 = 16256;
								}
							} else {
								var23 = 0; // L: 1861
								var24 = 0; // L: 1862
							}

							var3 = (var21 << 18) + var22; // L: 1864
							var19 = (var24 - var22 >> 3) + (var23 - var21 >> 3 << 18); // L: 1865
							var8 += var9; // L: 1866
							var18 = var8 >> 8; // L: 1867
							--var20; // L: 1868
						} while(var20 > 0);
					}

					var20 = var7 - var6 & 7; // L: 1870
					if (var20 > 0) { // L: 1871
						do {
							method4967(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 1873
							++var5; // L: 1874
							var3 += var19; // L: 1875
							var10 += var11; // L: 1876
							--var20; // L: 1877
						} while(var20 > 0);
					}
				} else {
					if (var20 > 0) { // L: 1881
						do {
							method4968(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 1883
							++var5; // L: 1884
							var3 += var19; // L: 1885
							var10 += var11; // L: 1886
							method4968(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 1887
							++var5; // L: 1888
							var3 += var19; // L: 1889
							var10 += var11; // L: 1890
							method4968(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 1891
							++var5; // L: 1892
							var3 += var19; // L: 1893
							var10 += var11; // L: 1894
							method4968(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 1895
							++var5; // L: 1896
							var3 += var19; // L: 1897
							var10 += var11; // L: 1898
							method4968(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 1899
							++var5; // L: 1900
							var3 += var19; // L: 1901
							var10 += var11; // L: 1902
							method4968(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 1903
							++var5; // L: 1904
							var3 += var19; // L: 1905
							var10 += var11; // L: 1906
							method4968(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 1907
							++var5; // L: 1908
							var3 += var19; // L: 1909
							var10 += var11; // L: 1910
							method4968(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 1911
							++var5; // L: 1912
							var10000 = var3 + var19; // L: 1913
							var10 += var11; // L: 1914
							var21 = var23; // L: 1915
							var22 = var24; // L: 1916
							var12 += var15; // L: 1917
							var13 += var16; // L: 1918
							var14 += var17; // L: 1919
							var25 = var14 >> 14; // L: 1920
							if (var25 != 0) { // L: 1921
								var23 = var12 / var25; // L: 1922
								var24 = var13 / var25; // L: 1923
								if (var23 < 0) { // L: 1924
									var23 = 0;
								} else if (var23 > 16256) { // L: 1925
									var23 = 16256;
								}
							} else {
								var23 = 0; // L: 1928
								var24 = 0; // L: 1929
							}

							var3 = (var21 << 18) + var22; // L: 1931
							var19 = (var24 - var22 >> 3) + (var23 - var21 >> 3 << 18); // L: 1932
							var8 += var9; // L: 1933
							var18 = var8 >> 8; // L: 1934
							--var20; // L: 1935
						} while(var20 > 0);
					}

					var20 = var7 - var6 & 7; // L: 1937
					if (var20 > 0) { // L: 1938
						do {
							method4968(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 1940
							++var5; // L: 1941
							var3 += var19; // L: 1942
							var10 += var11; // L: 1943
							--var20; // L: 1944
						} while(var20 > 0);
					}
				}
			}

		}
	} // L: 1948

	@ObfuscatedName("bc")
	final void method4976(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, float var10, float var11, int var12, int var13, int var14, int var15, int var16, int var17) {
		if (super.field2530.field2798) { // L: 2474
			if (var7 > super.field2530.field2797) { // L: 2475
				var7 = super.field2530.field2797;
			}

			if (var6 < 0) { // L: 2476
				var6 = 0;
			}
		}

		if (var6 < var7) { // L: 2478
			var5 += var6; // L: 2479
			var8 += var9 * var6; // L: 2480
			var10 += var11 * (float)var6; // L: 2481
			int var20 = var7 - var6; // L: 2482
			int var18;
			int var19;
			int var21;
			int var22;
			int var23;
			int var24;
			int var25;
			int var26;
			if (super.field2527) { // L: 2483
				var26 = var6 - super.field2530.field2795; // L: 2490
				var12 += var26 * var15; // L: 2491
				var13 += var26 * var16; // L: 2492
				var14 += var17 * var26; // L: 2493
				var25 = var14 >> 12; // L: 2494
				if (var25 != 0) { // L: 2495
					var21 = var12 / var25; // L: 2496
					var22 = var13 / var25; // L: 2497
				} else {
					var21 = 0; // L: 2500
					var22 = 0; // L: 2501
				}

				var12 += var20 * var15; // L: 2503
				var13 += var20 * var16; // L: 2504
				var14 += var17 * var20; // L: 2505
				var25 = var14 >> 12; // L: 2506
				if (var25 != 0) { // L: 2507
					var23 = var12 / var25; // L: 2508
					var24 = var13 / var25; // L: 2509
				} else {
					var23 = 0; // L: 2512
					var24 = 0; // L: 2513
				}

				var3 = (var21 << 20) + var22; // L: 2515
				var19 = (var24 - var22) / var20 + ((var23 - var21) / var20 << 20); // L: 2516
				var20 >>= 3; // L: 2517
				var9 <<= 3; // L: 2518
				var18 = var8 >> 8; // L: 2519
				if (super.field2531) { // L: 2521
					if (var20 > 0) { // L: 2522
						do {
							method4965(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 2524
							++var5; // L: 2525
							var3 += var19; // L: 2526
							var10 += var11; // L: 2527
							method4965(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 2528
							++var5; // L: 2529
							var3 += var19; // L: 2530
							var10 += var11; // L: 2531
							method4965(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 2532
							++var5; // L: 2533
							var3 += var19; // L: 2534
							var10 += var11; // L: 2535
							method4965(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 2536
							++var5; // L: 2537
							var3 += var19; // L: 2538
							var10 += var11; // L: 2539
							method4965(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 2540
							++var5; // L: 2541
							var3 += var19; // L: 2542
							var10 += var11; // L: 2543
							method4965(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 2544
							++var5; // L: 2545
							var3 += var19; // L: 2546
							var10 += var11; // L: 2547
							method4965(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 2548
							++var5; // L: 2549
							var3 += var19; // L: 2550
							var10 += var11; // L: 2551
							method4965(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 2552
							++var5; // L: 2553
							var3 += var19; // L: 2554
							var10 += var11; // L: 2555
							var8 += var9; // L: 2556
							var18 = var8 >> 8; // L: 2557
							--var20; // L: 2558
						} while(var20 > 0);
					}

					var20 = var7 - var6 & 7; // L: 2560
					if (var20 > 0) { // L: 2561
						do {
							method4965(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 2563
							++var5; // L: 2564
							var3 += var19; // L: 2565
							var10 += var11; // L: 2566
							--var20; // L: 2567
						} while(var20 > 0);
					}
				} else {
					if (var20 > 0) { // L: 2571
						do {
							method4966(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 2573
							++var5; // L: 2574
							var3 += var19; // L: 2575
							var10 += var11; // L: 2576
							method4966(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 2577
							++var5; // L: 2578
							var3 += var19; // L: 2579
							var10 += var11; // L: 2580
							method4966(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 2581
							++var5; // L: 2582
							var3 += var19; // L: 2583
							var10 += var11; // L: 2584
							method4966(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 2585
							++var5; // L: 2586
							var3 += var19; // L: 2587
							var10 += var11; // L: 2588
							method4966(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 2589
							++var5; // L: 2590
							var3 += var19; // L: 2591
							var10 += var11; // L: 2592
							method4966(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 2593
							++var5; // L: 2594
							var3 += var19; // L: 2595
							var10 += var11; // L: 2596
							method4966(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 2597
							++var5; // L: 2598
							var3 += var19; // L: 2599
							var10 += var11; // L: 2600
							method4966(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 2601
							++var5; // L: 2602
							var3 += var19; // L: 2603
							var10 += var11; // L: 2604
							var8 += var9; // L: 2605
							var18 = var8 >> 8; // L: 2606
							--var20; // L: 2607
						} while(var20 > 0);
					}

					var20 = var7 - var6 & 7; // L: 2609
					if (var20 > 0) { // L: 2610
						do {
							method4966(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 2612
							++var5; // L: 2613
							var3 += var19; // L: 2614
							var10 += var11; // L: 2615
							--var20; // L: 2616
						} while(var20 > 0);
					}
				}
			} else {
				var26 = var6 - super.field2530.field2795; // L: 2627
				var12 += var26 * var15; // L: 2628
				var13 += var26 * var16; // L: 2629
				var14 += var17 * var26; // L: 2630
				var25 = var14 >> 14; // L: 2631
				if (var25 != 0) { // L: 2632
					var21 = var12 / var25; // L: 2633
					var22 = var13 / var25; // L: 2634
				} else {
					var21 = 0; // L: 2637
					var22 = 0; // L: 2638
				}

				var12 += var20 * var15; // L: 2640
				var13 += var20 * var16; // L: 2641
				var14 += var17 * var20; // L: 2642
				var25 = var14 >> 14; // L: 2643
				if (var25 != 0) { // L: 2644
					var23 = var12 / var25; // L: 2645
					var24 = var13 / var25; // L: 2646
				} else {
					var23 = 0; // L: 2649
					var24 = 0; // L: 2650
				}

				var3 = (var21 << 18) + var22; // L: 2652
				var19 = (var24 - var22) / var20 + ((var23 - var21) / var20 << 18); // L: 2653
				var20 >>= 3; // L: 2654
				var9 <<= 3; // L: 2655
				var18 = var8 >> 8; // L: 2656
				if (super.field2531) { // L: 2658
					if (var20 > 0) { // L: 2659
						do {
							method4967(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 2661
							++var5; // L: 2662
							var3 += var19; // L: 2663
							var10 += var11; // L: 2664
							method4967(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 2665
							++var5; // L: 2666
							var3 += var19; // L: 2667
							var10 += var11; // L: 2668
							method4967(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 2669
							++var5; // L: 2670
							var3 += var19; // L: 2671
							var10 += var11; // L: 2672
							method4967(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 2673
							++var5; // L: 2674
							var3 += var19; // L: 2675
							var10 += var11; // L: 2676
							method4967(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 2677
							++var5; // L: 2678
							var3 += var19; // L: 2679
							var10 += var11; // L: 2680
							method4967(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 2681
							++var5; // L: 2682
							var3 += var19; // L: 2683
							var10 += var11; // L: 2684
							method4967(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 2685
							++var5; // L: 2686
							var3 += var19; // L: 2687
							var10 += var11; // L: 2688
							method4967(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 2689
							++var5; // L: 2690
							var3 += var19; // L: 2691
							var10 += var11; // L: 2692
							var8 += var9; // L: 2693
							var18 = var8 >> 8; // L: 2694
							--var20; // L: 2695
						} while(var20 > 0);
					}

					var20 = var7 - var6 & 7; // L: 2697
					if (var20 > 0) { // L: 2698
						do {
							method4967(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 2700
							++var5; // L: 2701
							var3 += var19; // L: 2702
							var10 += var11; // L: 2703
							--var20; // L: 2704
						} while(var20 > 0);
					}
				} else {
					if (var20 > 0) { // L: 2708
						do {
							method4968(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 2710
							++var5; // L: 2711
							var3 += var19; // L: 2712
							var10 += var11; // L: 2713
							method4968(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 2714
							++var5; // L: 2715
							var3 += var19; // L: 2716
							var10 += var11; // L: 2717
							method4968(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 2718
							++var5; // L: 2719
							var3 += var19; // L: 2720
							var10 += var11; // L: 2721
							method4968(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 2722
							++var5; // L: 2723
							var3 += var19; // L: 2724
							var10 += var11; // L: 2725
							method4968(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 2726
							++var5; // L: 2727
							var3 += var19; // L: 2728
							var10 += var11; // L: 2729
							method4968(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 2730
							++var5; // L: 2731
							var3 += var19; // L: 2732
							var10 += var11; // L: 2733
							method4968(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 2734
							++var5; // L: 2735
							var3 += var19; // L: 2736
							var10 += var11; // L: 2737
							method4968(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 2738
							++var5; // L: 2739
							var3 += var19; // L: 2740
							var10 += var11; // L: 2741
							var8 += var9; // L: 2742
							var18 = var8 >> 8; // L: 2743
							--var20; // L: 2744
						} while(var20 > 0);
					}

					var20 = var7 - var6 & 7; // L: 2746
					if (var20 > 0) { // L: 2747
						do {
							method4968(var1, Rasterizer2D.field5062, var2, var5, var18, var3, var10); // L: 2749
							++var5; // L: 2750
							var3 += var19; // L: 2751
							var10 += var11; // L: 2752
							--var20; // L: 2753
						} while(var20 > 0);
					}
				}
			}

		}
	} // L: 2757

	@ObfuscatedName("bf")
	static final boolean method4964(float var0, float var1) {
		return var1 > var0; // L: 1549
	}

	@ObfuscatedName("bq")
	static final void method4965(int[] var0, float[] var1, int[] var2, int var3, int var4, int var5, float var6) {
		if (method4964(var1[var3], var6)) { // L: 1553
			int var7 = var2[(var5 & 4032) + (var5 >>> 26)]; // L: 1554
			var0[var3] = (var4 * (var7 & 65280) & 16711680) + ((var7 & 16711935) * var4 & -16711936) >> 8; // L: 1555
			var1[var3] = var6; // L: 1556
		}

	} // L: 1558

	@ObfuscatedName("ba")
	static final void method4966(int[] var0, float[] var1, int[] var2, int var3, int var4, int var5, float var6) {
		int var7 = var2[(var5 & 4032) + (var5 >>> 26)]; // L: 1561
		if (var7 != 0) { // L: 1562
			if (method4964(var1[var3], var6)) { // L: 1563
				var0[var3] = (var4 * (var7 & 65280) & 16711680) + ((var7 & 16711935) * var4 & -16711936) >> 8; // L: 1564
				var1[var3] = var6; // L: 1565
			}

		}
	} // L: 1567

	@ObfuscatedName("bv")
	static final void method4967(int[] var0, float[] var1, int[] var2, int var3, int var4, int var5, float var6) {
		if (method4964(var1[var3], var6)) { // L: 1570
			int var7 = var2[(var5 >>> 25) + (var5 & 16256)]; // L: 1571
			var0[var3] = (var4 * (var7 & 65280) & 16711680) + ((var7 & 16711935) * var4 & -16711936) >> 8; // L: 1572
			var1[var3] = var6; // L: 1573
		}

	} // L: 1575

	@ObfuscatedName("bl")
	static final void method4968(int[] var0, float[] var1, int[] var2, int var3, int var4, int var5, float var6) {
		int var7 = var2[(var5 >>> 25) + (var5 & 16256)]; // L: 1578
		if (var7 != 0) { // L: 1579
			if (method4964(var1[var3], var6)) { // L: 1580
				var0[var3] = (var4 * (var7 & 65280) & 16711680) + ((var7 & 16711935) * var4 & -16711936) >> 8; // L: 1581
				var1[var3] = var6; // L: 1582
			}

		}
	} // L: 1584
}
