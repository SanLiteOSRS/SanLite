import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jm")
public class class257 extends class242 {
	@ObfuscatedSignature(
		descriptor = "(Ljb;)V"
	)
	class257(class258 var1) {
		super(var1); // L: 7
	} // L: 8

	@ObfuscatedName("ah")
	void vmethod5143(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12) {
		int var13 = var5 - var4; // L: 12
		int var14 = var2 - var1; // L: 13
		int var15 = var6 - var4; // L: 14
		int var16 = var3 - var1; // L: 15
		int var17 = var11 - var10; // L: 16
		int var18 = var12 - var10; // L: 17
		int var19;
		if (var3 != var2) { // L: 19
			var19 = (var6 - var5 << 14) / (var3 - var2); // L: 20
		} else {
			var19 = 0; // L: 23
		}

		int var20;
		if (var2 != var1) { // L: 26
			var20 = (var13 << 14) / var14; // L: 27
		} else {
			var20 = 0; // L: 30
		}

		int var21;
		if (var3 != var1) { // L: 33
			var21 = (var15 << 14) / var16; // L: 34
		} else {
			var21 = 0; // L: 37
		}

		int var22 = var13 * var16 - var15 * var14; // L: 39
		if (var22 != 0) { // L: 40
			int var23 = (var17 * var16 - var18 * var14 << 8) / var22; // L: 41
			int var24 = (var18 * var13 - var17 * var15 << 8) / var22; // L: 42
			int[] var25 = super.field2573.Rasterizer3D_rowOffsets; // L: 43
			int var26 = super.field2573.field2845; // L: 44
			if (var1 <= var2 && var1 <= var3) { // L: 45
				if (var1 < var26) { // L: 46
					if (var2 > var26) { // L: 47
						var2 = var26; // L: 48
					}

					if (var3 > var26) { // L: 50
						var3 = var26; // L: 51
					}

					var10 = var23 + ((var10 << 8) - var23 * var4); // L: 53
					if (var2 < var3) { // L: 54
						var6 = var4 <<= 14; // L: 55
						if (var1 < 0) { // L: 56
							var6 -= var21 * var1; // L: 57
							var4 -= var20 * var1; // L: 58
							var10 -= var24 * var1; // L: 59
							var1 = 0; // L: 60
						}

						var5 <<= 14; // L: 62
						if (var2 < 0) { // L: 63
							var5 -= var19 * var2; // L: 64
							var2 = 0; // L: 65
						}

						if (var2 != var1 && var21 < var20 || var2 == var1 && var21 > var19) { // L: 67
							var3 -= var2; // L: 68
							var2 -= var1; // L: 69
							var1 = var25[var1]; // L: 70

							while (true) {
								--var2; // L: 71
								if (var2 < 0) {
									while (true) {
										--var3; // L: 78
										if (var3 < 0) {
											return; // L: 85
										}

										this.method5087(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var6 >> 14, var5 >> 14, var10, var23); // L: 79
										var6 += var21; // L: 80
										var5 += var19; // L: 81
										var10 += var24; // L: 82
										var1 += Rasterizer2D.Rasterizer2D_width; // L: 83
									}
								}

								this.method5087(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var23); // L: 72
								var6 += var21; // L: 73
								var4 += var20; // L: 74
								var10 += var24; // L: 75
								var1 += Rasterizer2D.Rasterizer2D_width; // L: 76
							}
						} else {
							var3 -= var2; // L: 88
							var2 -= var1; // L: 89
							var1 = var25[var1]; // L: 90

							while (true) {
								--var2; // L: 91
								if (var2 < 0) {
									while (true) {
										--var3; // L: 98
										if (var3 < 0) {
											return; // L: 105
										}

										this.method5087(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var5 >> 14, var6 >> 14, var10, var23); // L: 99
										var6 += var21; // L: 100
										var5 += var19; // L: 101
										var10 += var24; // L: 102
										var1 += Rasterizer2D.Rasterizer2D_width; // L: 103
									}
								}

								this.method5087(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var23); // L: 92
								var6 += var21; // L: 93
								var4 += var20; // L: 94
								var10 += var24; // L: 95
								var1 += Rasterizer2D.Rasterizer2D_width; // L: 96
							}
						}
					} else {
						var5 = var4 <<= 14; // L: 109
						if (var1 < 0) { // L: 110
							var5 -= var21 * var1; // L: 111
							var4 -= var20 * var1; // L: 112
							var10 -= var24 * var1; // L: 113
							var1 = 0; // L: 114
						}

						var6 <<= 14; // L: 116
						if (var3 < 0) { // L: 117
							var6 -= var3 * var19; // L: 118
							var3 = 0; // L: 119
						}

						if (var3 != var1 && var21 < var20 || var3 == var1 && var19 > var20) { // L: 121
							var2 -= var3; // L: 122
							var3 -= var1; // L: 123
							var1 = var25[var1]; // L: 124

							while (true) {
								--var3; // L: 125
								if (var3 < 0) {
									while (true) {
										--var2; // L: 132
										if (var2 < 0) {
											return; // L: 139
										}

										this.method5087(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var23); // L: 133
										var6 += var19; // L: 134
										var4 += var20; // L: 135
										var10 += var24; // L: 136
										var1 += Rasterizer2D.Rasterizer2D_width; // L: 137
									}
								}

								this.method5087(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var5 >> 14, var4 >> 14, var10, var23); // L: 126
								var5 += var21; // L: 127
								var4 += var20; // L: 128
								var10 += var24; // L: 129
								var1 += Rasterizer2D.Rasterizer2D_width; // L: 130
							}
						} else {
							var2 -= var3; // L: 142
							var3 -= var1; // L: 143
							var1 = var25[var1]; // L: 144

							while (true) {
								--var3; // L: 145
								if (var3 < 0) {
									while (true) {
										--var2; // L: 152
										if (var2 < 0) {
											return; // L: 159
										}

										this.method5087(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var23); // L: 153
										var6 += var19; // L: 154
										var4 += var20; // L: 155
										var10 += var24; // L: 156
										var1 += Rasterizer2D.Rasterizer2D_width; // L: 157
									}
								}

								this.method5087(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var4 >> 14, var5 >> 14, var10, var23); // L: 146
								var5 += var21; // L: 147
								var4 += var20; // L: 148
								var10 += var24; // L: 149
								var1 += Rasterizer2D.Rasterizer2D_width; // L: 150
							}
						}
					}
				}
			} else if (var2 <= var3) { // L: 163
				if (var2 < var26) { // L: 164
					if (var3 > var26) { // L: 165
						var3 = var26; // L: 166
					}

					if (var1 > var26) { // L: 168
						var1 = var26; // L: 169
					}

					var11 = (var11 << 8) - var5 * var23 + var23; // L: 171
					if (var3 < var1) { // L: 172
						var4 = var5 <<= 14; // L: 173
						if (var2 < 0) { // L: 174
							var4 -= var20 * var2; // L: 175
							var5 -= var19 * var2; // L: 176
							var11 -= var24 * var2; // L: 177
							var2 = 0; // L: 178
						}

						var6 <<= 14; // L: 180
						if (var3 < 0) { // L: 181
							var6 -= var3 * var21; // L: 182
							var3 = 0; // L: 183
						}

						if (var3 != var2 && var20 < var19 || var3 == var2 && var20 > var21) { // L: 185
							var1 -= var3; // L: 186
							var3 -= var2; // L: 187
							var2 = var25[var2]; // L: 188

							while (true) {
								--var3; // L: 189
								if (var3 < 0) {
									while (true) {
										--var1; // L: 196
										if (var1 < 0) {
											return; // L: 203
										}

										this.method5087(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var4 >> 14, var6 >> 14, var11, var23); // L: 197
										var4 += var20; // L: 198
										var6 += var21; // L: 199
										var11 += var24; // L: 200
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 201
									}
								}

								this.method5087(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var23); // L: 190
								var4 += var20; // L: 191
								var5 += var19; // L: 192
								var11 += var24; // L: 193
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 194
							}
						} else {
							var1 -= var3; // L: 206
							var3 -= var2; // L: 207
							var2 = var25[var2]; // L: 208

							while (true) {
								--var3; // L: 209
								if (var3 < 0) {
									while (true) {
										--var1; // L: 216
										if (var1 < 0) {
											return; // L: 223
										}

										this.method5087(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var6 >> 14, var4 >> 14, var11, var23); // L: 217
										var4 += var20; // L: 218
										var6 += var21; // L: 219
										var11 += var24; // L: 220
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 221
									}
								}

								this.method5087(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var23); // L: 210
								var4 += var20; // L: 211
								var5 += var19; // L: 212
								var11 += var24; // L: 213
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 214
							}
						}
					} else {
						var6 = var5 <<= 14; // L: 227
						if (var2 < 0) { // L: 228
							var6 -= var20 * var2; // L: 229
							var5 -= var19 * var2; // L: 230
							var11 -= var24 * var2; // L: 231
							var2 = 0; // L: 232
						}

						var4 <<= 14; // L: 234
						if (var1 < 0) { // L: 235
							var4 -= var21 * var1; // L: 236
							var1 = 0; // L: 237
						}

						if (var20 < var19) { // L: 239
							var3 -= var1; // L: 240
							var1 -= var2; // L: 241
							var2 = var25[var2]; // L: 242

							while (true) {
								--var1; // L: 243
								if (var1 < 0) {
									while (true) {
										--var3; // L: 250
										if (var3 < 0) {
											return; // L: 257
										}

										this.method5087(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var23); // L: 251
										var4 += var21; // L: 252
										var5 += var19; // L: 253
										var11 += var24; // L: 254
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 255
									}
								}

								this.method5087(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var6 >> 14, var5 >> 14, var11, var23); // L: 244
								var6 += var20; // L: 245
								var5 += var19; // L: 246
								var11 += var24; // L: 247
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 248
							}
						} else {
							var3 -= var1; // L: 260
							var1 -= var2; // L: 261
							var2 = var25[var2]; // L: 262

							while (true) {
								--var1; // L: 263
								if (var1 < 0) {
									while (true) {
										--var3; // L: 270
										if (var3 < 0) {
											return; // L: 277
										}

										this.method5087(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var23); // L: 271
										var4 += var21; // L: 272
										var5 += var19; // L: 273
										var11 += var24; // L: 274
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 275
									}
								}

								this.method5087(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var5 >> 14, var6 >> 14, var11, var23); // L: 264
								var6 += var20; // L: 265
								var5 += var19; // L: 266
								var11 += var24; // L: 267
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 268
							}
						}
					}
				}
			} else if (var3 < var26) { // L: 282
				if (var1 > var26) { // L: 283
					var1 = var26;
				}

				if (var2 > var26) { // L: 284
					var2 = var26;
				}

				var12 = var23 + ((var12 << 8) - var23 * var6); // L: 285
				if (var1 < var2) { // L: 286
					var5 = var6 <<= 14; // L: 287
					if (var3 < 0) { // L: 288
						var5 -= var3 * var19; // L: 289
						var6 -= var3 * var21; // L: 290
						var12 -= var3 * var24; // L: 291
						var3 = 0; // L: 292
					}

					var4 <<= 14; // L: 294
					if (var1 < 0) { // L: 295
						var4 -= var20 * var1; // L: 296
						var1 = 0; // L: 297
					}

					if (var19 < var21) { // L: 299
						var2 -= var1; // L: 300
						var1 -= var3; // L: 301
						var3 = var25[var3]; // L: 302

						while (true) {
							--var1; // L: 303
							if (var1 < 0) {
								while (true) {
									--var2; // L: 310
									if (var2 < 0) {
										return; // L: 317
									}

									this.method5087(Rasterizer2D.Rasterizer2D_pixels, var3, 0, 0, var5 >> 14, var4 >> 14, var12, var23); // L: 311
									var5 += var19; // L: 312
									var4 += var20; // L: 313
									var12 += var24; // L: 314
									var3 += Rasterizer2D.Rasterizer2D_width; // L: 315
								}
							}

							this.method5087(Rasterizer2D.Rasterizer2D_pixels, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var23); // L: 304
							var5 += var19; // L: 305
							var6 += var21; // L: 306
							var12 += var24; // L: 307
							var3 += Rasterizer2D.Rasterizer2D_width; // L: 308
						}
					} else {
						var2 -= var1; // L: 320
						var1 -= var3; // L: 321
						var3 = var25[var3]; // L: 322

						while (true) {
							--var1; // L: 323
							if (var1 < 0) {
								while (true) {
									--var2; // L: 330
									if (var2 < 0) {
										return; // L: 337
									}

									this.method5087(Rasterizer2D.Rasterizer2D_pixels, var3, 0, 0, var4 >> 14, var5 >> 14, var12, var23); // L: 331
									var5 += var19; // L: 332
									var4 += var20; // L: 333
									var12 += var24; // L: 334
									var3 += Rasterizer2D.Rasterizer2D_width; // L: 335
								}
							}

							this.method5087(Rasterizer2D.Rasterizer2D_pixels, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var23); // L: 324
							var5 += var19; // L: 325
							var6 += var21; // L: 326
							var12 += var24; // L: 327
							var3 += Rasterizer2D.Rasterizer2D_width; // L: 328
						}
					}
				} else {
					var4 = var6 <<= 14; // L: 341
					if (var3 < 0) { // L: 342
						var4 -= var3 * var19; // L: 343
						var6 -= var3 * var21; // L: 344
						var12 -= var3 * var24; // L: 345
						var3 = 0; // L: 346
					}

					var5 <<= 14; // L: 348
					if (var2 < 0) { // L: 349
						var5 -= var20 * var2; // L: 350
						var2 = 0; // L: 351
					}

					if (var19 < var21) { // L: 353
						var1 -= var2; // L: 354
						var2 -= var3; // L: 355
						var3 = var25[var3]; // L: 356

						while (true) {
							--var2; // L: 357
							if (var2 < 0) {
								while (true) {
									--var1; // L: 364
									if (var1 < 0) {
										return; // L: 371
									}

									this.method5087(Rasterizer2D.Rasterizer2D_pixels, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var23); // L: 365
									var5 += var20; // L: 366
									var6 += var21; // L: 367
									var12 += var24; // L: 368
									var3 += Rasterizer2D.Rasterizer2D_width; // L: 369
								}
							}

							this.method5087(Rasterizer2D.Rasterizer2D_pixels, var3, 0, 0, var4 >> 14, var6 >> 14, var12, var23); // L: 358
							var4 += var19; // L: 359
							var6 += var21; // L: 360
							var12 += var24; // L: 361
							var3 += Rasterizer2D.Rasterizer2D_width; // L: 362
						}
					} else {
						var1 -= var2; // L: 374
						var2 -= var3; // L: 375
						var3 = var25[var3]; // L: 376

						while (true) {
							--var2; // L: 377
							if (var2 < 0) {
								while (true) {
									--var1; // L: 384
									if (var1 < 0) {
										return; // L: 391
									}

									this.method5087(Rasterizer2D.Rasterizer2D_pixels, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var23); // L: 385
									var5 += var20; // L: 386
									var6 += var21; // L: 387
									var12 += var24; // L: 388
									var3 += Rasterizer2D.Rasterizer2D_width; // L: 389
								}
							}

							this.method5087(Rasterizer2D.Rasterizer2D_pixels, var3, 0, 0, var6 >> 14, var4 >> 14, var12, var23); // L: 378
							var4 += var19; // L: 379
							var6 += var21; // L: 380
							var12 += var24; // L: 381
							var3 += Rasterizer2D.Rasterizer2D_width; // L: 382
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ar")
	void vmethod5176(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10) {
		int var11 = 0; // L: 487
		if (var2 != var1) { // L: 488
			var11 = (var5 - var4 << 14) / (var2 - var1); // L: 489
		}

		int var12 = 0; // L: 491
		if (var3 != var2) { // L: 492
			var12 = (var6 - var5 << 14) / (var3 - var2); // L: 493
		}

		int var13 = 0; // L: 495
		if (var3 != var1) { // L: 496
			var13 = (var4 - var6 << 14) / (var1 - var3); // L: 497
		}

		int[] var14 = super.field2573.Rasterizer3D_rowOffsets; // L: 499
		int var15 = super.field2573.field2845; // L: 500
		if (var1 <= var2 && var1 <= var3) { // L: 501
			if (var1 < var15) { // L: 502
				if (var2 > var15) { // L: 503
					var2 = var15;
				}

				if (var3 > var15) { // L: 504
					var3 = var15;
				}

				if (var2 < var3) { // L: 505
					var6 = var4 <<= 14; // L: 506
					if (var1 < 0) { // L: 507
						var6 -= var13 * var1; // L: 508
						var4 -= var11 * var1; // L: 509
						var1 = 0; // L: 510
					}

					var5 <<= 14; // L: 512
					if (var2 < 0) { // L: 513
						var5 -= var12 * var2; // L: 514
						var2 = 0; // L: 515
					}

					if (var2 != var1 && var13 < var11 || var2 == var1 && var13 > var12) { // L: 517
						var3 -= var2; // L: 518
						var2 -= var1; // L: 519
						var1 = var14[var1]; // L: 520

						while (true) {
							--var2; // L: 521
							if (var2 < 0) {
								while (true) {
									--var3; // L: 527
									if (var3 < 0) {
										return; // L: 533
									}

									this.method5081(Rasterizer2D.Rasterizer2D_pixels, var1, var10, 0, var6 >> 14, var5 >> 14); // L: 528
									var6 += var13; // L: 529
									var5 += var12; // L: 530
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 531
								}
							}

							this.method5081(Rasterizer2D.Rasterizer2D_pixels, var1, var10, 0, var6 >> 14, var4 >> 14); // L: 522
							var6 += var13; // L: 523
							var4 += var11; // L: 524
							var1 += Rasterizer2D.Rasterizer2D_width; // L: 525
						}
					} else {
						var3 -= var2; // L: 536
						var2 -= var1; // L: 537
						var1 = var14[var1]; // L: 538

						while (true) {
							--var2; // L: 539
							if (var2 < 0) {
								while (true) {
									--var3; // L: 545
									if (var3 < 0) {
										return; // L: 551
									}

									this.method5081(Rasterizer2D.Rasterizer2D_pixels, var1, var10, 0, var5 >> 14, var6 >> 14); // L: 546
									var6 += var13; // L: 547
									var5 += var12; // L: 548
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 549
								}
							}

							this.method5081(Rasterizer2D.Rasterizer2D_pixels, var1, var10, 0, var4 >> 14, var6 >> 14); // L: 540
							var6 += var13; // L: 541
							var4 += var11; // L: 542
							var1 += Rasterizer2D.Rasterizer2D_width; // L: 543
						}
					}
				} else {
					var5 = var4 <<= 14; // L: 555
					if (var1 < 0) { // L: 556
						var5 -= var13 * var1; // L: 557
						var4 -= var11 * var1; // L: 558
						var1 = 0; // L: 559
					}

					var6 <<= 14; // L: 561
					if (var3 < 0) { // L: 562
						var6 -= var3 * var12; // L: 563
						var3 = 0; // L: 564
					}

					if ((var3 == var1 || var13 >= var11) && (var3 != var1 || var12 <= var11)) { // L: 566
						var2 -= var3; // L: 585
						var3 -= var1; // L: 586
						var1 = var14[var1]; // L: 587

						while (true) {
							--var3; // L: 588
							if (var3 < 0) {
								while (true) {
									--var2; // L: 594
									if (var2 < 0) {
										return; // L: 600
									}

									this.method5081(Rasterizer2D.Rasterizer2D_pixels, var1, var10, 0, var4 >> 14, var6 >> 14); // L: 595
									var6 += var12; // L: 596
									var4 += var11; // L: 597
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 598
								}
							}

							this.method5081(Rasterizer2D.Rasterizer2D_pixels, var1, var10, 0, var4 >> 14, var5 >> 14); // L: 589
							var5 += var13; // L: 590
							var4 += var11; // L: 591
							var1 += Rasterizer2D.Rasterizer2D_width; // L: 592
						}
					} else {
						var2 -= var3; // L: 567
						var3 -= var1; // L: 568
						var1 = var14[var1]; // L: 569

						while (true) {
							--var3; // L: 570
							if (var3 < 0) {
								while (true) {
									--var2; // L: 576
									if (var2 < 0) {
										return; // L: 582
									}

									this.method5081(Rasterizer2D.Rasterizer2D_pixels, var1, var10, 0, var6 >> 14, var4 >> 14); // L: 577
									var6 += var12; // L: 578
									var4 += var11; // L: 579
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 580
								}
							}

							this.method5081(Rasterizer2D.Rasterizer2D_pixels, var1, var10, 0, var5 >> 14, var4 >> 14); // L: 571
							var5 += var13; // L: 572
							var4 += var11; // L: 573
							var1 += Rasterizer2D.Rasterizer2D_width; // L: 574
						}
					}
				}
			}
		} else if (var2 <= var3) { // L: 604
			if (var2 < var15) { // L: 605
				if (var3 > var15) { // L: 606
					var3 = var15;
				}

				if (var1 > var15) { // L: 607
					var1 = var15;
				}

				if (var3 < var1) { // L: 608
					var4 = var5 <<= 14; // L: 609
					if (var2 < 0) { // L: 610
						var4 -= var11 * var2; // L: 611
						var5 -= var12 * var2; // L: 612
						var2 = 0; // L: 613
					}

					var6 <<= 14; // L: 615
					if (var3 < 0) { // L: 616
						var6 -= var3 * var13; // L: 617
						var3 = 0; // L: 618
					}

					if (var3 != var2 && var11 < var12 || var3 == var2 && var11 > var13) { // L: 620
						var1 -= var3; // L: 621
						var3 -= var2; // L: 622
						var2 = var14[var2]; // L: 623

						while (true) {
							--var3; // L: 624
							if (var3 < 0) {
								while (true) {
									--var1; // L: 630
									if (var1 < 0) {
										return; // L: 636
									}

									this.method5081(Rasterizer2D.Rasterizer2D_pixels, var2, var10, 0, var4 >> 14, var6 >> 14); // L: 631
									var4 += var11; // L: 632
									var6 += var13; // L: 633
									var2 += Rasterizer2D.Rasterizer2D_width; // L: 634
								}
							}

							this.method5081(Rasterizer2D.Rasterizer2D_pixels, var2, var10, 0, var4 >> 14, var5 >> 14); // L: 625
							var4 += var11; // L: 626
							var5 += var12; // L: 627
							var2 += Rasterizer2D.Rasterizer2D_width; // L: 628
						}
					} else {
						var1 -= var3; // L: 639
						var3 -= var2; // L: 640
						var2 = var14[var2]; // L: 641

						while (true) {
							--var3; // L: 642
							if (var3 < 0) {
								while (true) {
									--var1; // L: 648
									if (var1 < 0) {
										return; // L: 654
									}

									this.method5081(Rasterizer2D.Rasterizer2D_pixels, var2, var10, 0, var6 >> 14, var4 >> 14); // L: 649
									var4 += var11; // L: 650
									var6 += var13; // L: 651
									var2 += Rasterizer2D.Rasterizer2D_width; // L: 652
								}
							}

							this.method5081(Rasterizer2D.Rasterizer2D_pixels, var2, var10, 0, var5 >> 14, var4 >> 14); // L: 643
							var4 += var11; // L: 644
							var5 += var12; // L: 645
							var2 += Rasterizer2D.Rasterizer2D_width; // L: 646
						}
					}
				} else {
					var6 = var5 <<= 14; // L: 658
					if (var2 < 0) { // L: 659
						var6 -= var11 * var2; // L: 660
						var5 -= var12 * var2; // L: 661
						var2 = 0; // L: 662
					}

					var4 <<= 14; // L: 664
					if (var1 < 0) { // L: 665
						var4 -= var13 * var1; // L: 666
						var1 = 0; // L: 667
					}

					if (var11 < var12) { // L: 669
						var3 -= var1; // L: 670
						var1 -= var2; // L: 671
						var2 = var14[var2]; // L: 672

						while (true) {
							--var1; // L: 673
							if (var1 < 0) {
								while (true) {
									--var3; // L: 679
									if (var3 < 0) {
										return; // L: 685
									}

									this.method5081(Rasterizer2D.Rasterizer2D_pixels, var2, var10, 0, var4 >> 14, var5 >> 14); // L: 680
									var4 += var13; // L: 681
									var5 += var12; // L: 682
									var2 += Rasterizer2D.Rasterizer2D_width; // L: 683
								}
							}

							this.method5081(Rasterizer2D.Rasterizer2D_pixels, var2, var10, 0, var6 >> 14, var5 >> 14); // L: 674
							var6 += var11; // L: 675
							var5 += var12; // L: 676
							var2 += Rasterizer2D.Rasterizer2D_width; // L: 677
						}
					} else {
						var3 -= var1; // L: 688
						var1 -= var2; // L: 689
						var2 = var14[var2]; // L: 690

						while (true) {
							--var1; // L: 691
							if (var1 < 0) {
								while (true) {
									--var3; // L: 697
									if (var3 < 0) {
										return; // L: 703
									}

									this.method5081(Rasterizer2D.Rasterizer2D_pixels, var2, var10, 0, var5 >> 14, var4 >> 14); // L: 698
									var4 += var13; // L: 699
									var5 += var12; // L: 700
									var2 += Rasterizer2D.Rasterizer2D_width; // L: 701
								}
							}

							this.method5081(Rasterizer2D.Rasterizer2D_pixels, var2, var10, 0, var5 >> 14, var6 >> 14); // L: 692
							var6 += var11; // L: 693
							var5 += var12; // L: 694
							var2 += Rasterizer2D.Rasterizer2D_width; // L: 695
						}
					}
				}
			}
		} else if (var3 < var15) { // L: 708
			if (var1 > var15) { // L: 709
				var1 = var15;
			}

			if (var2 > var15) { // L: 710
				var2 = var15;
			}

			if (var1 < var2) { // L: 711
				var5 = var6 <<= 14; // L: 712
				if (var3 < 0) { // L: 713
					var5 -= var3 * var12; // L: 714
					var6 -= var3 * var13; // L: 715
					var3 = 0; // L: 716
				}

				var4 <<= 14; // L: 718
				if (var1 < 0) { // L: 719
					var4 -= var11 * var1; // L: 720
					var1 = 0; // L: 721
				}

				if (var12 < var13) { // L: 723
					var2 -= var1; // L: 724
					var1 -= var3; // L: 725
					var3 = var14[var3]; // L: 726

					while (true) {
						--var1; // L: 727
						if (var1 < 0) {
							while (true) {
								--var2; // L: 733
								if (var2 < 0) {
									return; // L: 739
								}

								this.method5081(Rasterizer2D.Rasterizer2D_pixels, var3, var10, 0, var5 >> 14, var4 >> 14); // L: 734
								var5 += var12; // L: 735
								var4 += var11; // L: 736
								var3 += Rasterizer2D.Rasterizer2D_width; // L: 737
							}
						}

						this.method5081(Rasterizer2D.Rasterizer2D_pixels, var3, var10, 0, var5 >> 14, var6 >> 14); // L: 728
						var5 += var12; // L: 729
						var6 += var13; // L: 730
						var3 += Rasterizer2D.Rasterizer2D_width; // L: 731
					}
				} else {
					var2 -= var1; // L: 742
					var1 -= var3; // L: 743
					var3 = var14[var3]; // L: 744

					while (true) {
						--var1; // L: 745
						if (var1 < 0) {
							while (true) {
								--var2; // L: 751
								if (var2 < 0) {
									return; // L: 757
								}

								this.method5081(Rasterizer2D.Rasterizer2D_pixels, var3, var10, 0, var4 >> 14, var5 >> 14); // L: 752
								var5 += var12; // L: 753
								var4 += var11; // L: 754
								var3 += Rasterizer2D.Rasterizer2D_width; // L: 755
							}
						}

						this.method5081(Rasterizer2D.Rasterizer2D_pixels, var3, var10, 0, var6 >> 14, var5 >> 14); // L: 746
						var5 += var12; // L: 747
						var6 += var13; // L: 748
						var3 += Rasterizer2D.Rasterizer2D_width; // L: 749
					}
				}
			} else {
				var4 = var6 <<= 14; // L: 761
				if (var3 < 0) { // L: 762
					var4 -= var3 * var12; // L: 763
					var6 -= var3 * var13; // L: 764
					var3 = 0; // L: 765
				}

				var5 <<= 14; // L: 767
				if (var2 < 0) { // L: 768
					var5 -= var11 * var2; // L: 769
					var2 = 0; // L: 770
				}

				if (var12 < var13) { // L: 772
					var1 -= var2; // L: 773
					var2 -= var3; // L: 774
					var3 = var14[var3]; // L: 775

					while (true) {
						--var2; // L: 776
						if (var2 < 0) {
							while (true) {
								--var1; // L: 782
								if (var1 < 0) {
									return; // L: 788
								}

								this.method5081(Rasterizer2D.Rasterizer2D_pixels, var3, var10, 0, var5 >> 14, var6 >> 14); // L: 783
								var5 += var11; // L: 784
								var6 += var13; // L: 785
								var3 += Rasterizer2D.Rasterizer2D_width; // L: 786
							}
						}

						this.method5081(Rasterizer2D.Rasterizer2D_pixels, var3, var10, 0, var4 >> 14, var6 >> 14); // L: 777
						var4 += var12; // L: 778
						var6 += var13; // L: 779
						var3 += Rasterizer2D.Rasterizer2D_width; // L: 780
					}
				} else {
					var1 -= var2; // L: 791
					var2 -= var3; // L: 792
					var3 = var14[var3]; // L: 793

					while (true) {
						--var2; // L: 794
						if (var2 < 0) {
							while (true) {
								--var1; // L: 800
								if (var1 < 0) {
									return; // L: 806
								}

								this.method5081(Rasterizer2D.Rasterizer2D_pixels, var3, var10, 0, var6 >> 14, var5 >> 14); // L: 801
								var5 += var11; // L: 802
								var6 += var13; // L: 803
								var3 += Rasterizer2D.Rasterizer2D_width; // L: 804
							}
						}

						this.method5081(Rasterizer2D.Rasterizer2D_pixels, var3, var10, 0, var6 >> 14, var4 >> 14); // L: 795
						var4 += var12; // L: 796
						var6 += var13; // L: 797
						var3 += Rasterizer2D.Rasterizer2D_width; // L: 798
					}
				}
			}
		}
	}

	@ObfuscatedName("ab")
	void vmethod5125(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
		int[] var23 = super.field2573.Rasterizer3D_textureLoader.getTexturePixels(var22); // L: 867
		int var24;
		if (var23 == null) { // L: 868
			var24 = super.field2573.Rasterizer3D_textureLoader.getAverageTextureRGB(var22); // L: 869
			this.vmethod5143(var1, var2, var3, var4, var5, var6, var7, var8, var9, class242.method4626(var24, var10), class242.method4626(var24, var11), class242.method4626(var24, var12)); // L: 870
		} else {
			super.field2567 = super.field2573.Rasterizer3D_textureLoader.isLowDetail(var22); // L: 873
			super.field2566 = super.field2573.Rasterizer3D_textureLoader.vmethod5182(var22); // L: 874
			var24 = var5 - var4; // L: 875
			int var25 = var2 - var1; // L: 876
			int var26 = var6 - var4; // L: 877
			int var27 = var3 - var1; // L: 878
			int var28 = var11 - var10; // L: 879
			int var29 = var12 - var10; // L: 880
			int var30 = 0; // L: 881
			if (var2 != var1) { // L: 882
				var30 = (var5 - var4 << 14) / (var2 - var1);
			}

			int var31 = 0; // L: 883
			if (var3 != var2) { // L: 884
				var31 = (var6 - var5 << 14) / (var3 - var2);
			}

			int var32 = 0; // L: 885
			if (var3 != var1) { // L: 886
				var32 = (var4 - var6 << 14) / (var1 - var3);
			}

			int var33 = var24 * var27 - var26 * var25; // L: 887
			if (var33 != 0) { // L: 888
				int var34 = (var28 * var27 - var29 * var25 << 9) / var33; // L: 889
				int var35 = (var29 * var24 - var28 * var26 << 9) / var33; // L: 890
				int var36 = super.field2573.field2830; // L: 891
				var14 = var13 - var14; // L: 892
				var17 = var16 - var17; // L: 893
				var20 = var19 - var20; // L: 894
				var15 -= var13; // L: 895
				var18 -= var16; // L: 896
				var21 -= var19; // L: 897
				int var37 = var15 * var16 - var18 * var13 << 14; // L: 898
				int var38 = (int)(((long)(var18 * var19 - var16 * var21) << 3 << 14) / (long)var36); // L: 899
				int var39 = (int)(((long)(var13 * var21 - var19 * var15) << 14) / (long)var36); // L: 900
				int var40 = var16 * var14 - var13 * var17 << 14; // L: 901
				int var41 = (int)(((long)(var19 * var17 - var16 * var20) << 3 << 14) / (long)var36); // L: 902
				int var42 = (int)(((long)(var13 * var20 - var19 * var14) << 14) / (long)var36); // L: 903
				int var43 = var17 * var15 - var18 * var14 << 14; // L: 904
				int var44 = (int)(((long)(var18 * var20 - var17 * var21) << 3 << 14) / (long)var36); // L: 905
				int var45 = (int)(((long)(var21 * var14 - var15 * var20) << 14) / (long)var36); // L: 906
				int[] var46 = super.field2573.Rasterizer3D_rowOffsets; // L: 907
				int var47 = super.field2573.field2845; // L: 908
				int var48;
				if (var1 <= var2 && var1 <= var3) { // L: 909
					if (var1 < var47) { // L: 910
						if (var2 > var47) { // L: 911
							var2 = var47;
						}

						if (var3 > var47) { // L: 912
							var3 = var47;
						}

						var10 = var34 + ((var10 << 9) - var34 * var4); // L: 913
						if (var2 < var3) { // L: 914
							var6 = var4 <<= 14; // L: 915
							if (var1 < 0) { // L: 916
								var6 -= var32 * var1; // L: 917
								var4 -= var30 * var1; // L: 918
								var10 -= var35 * var1; // L: 919
								var1 = 0; // L: 920
							}

							var5 <<= 14; // L: 922
							if (var2 < 0) { // L: 923
								var5 -= var31 * var2; // L: 924
								var2 = 0; // L: 925
							}

							var48 = var1 - super.field2573.field2843; // L: 927
							var37 += var39 * var48; // L: 928
							var40 += var42 * var48; // L: 929
							var43 += var45 * var48; // L: 930
							if (var2 != var1 && var32 < var30 || var2 == var1 && var32 > var31) { // L: 931
								var3 -= var2; // L: 932
								var2 -= var1; // L: 933
								var1 = var46[var1]; // L: 934

								while (true) {
									--var2; // L: 935
									if (var2 < 0) {
										while (true) {
											--var3; // L: 945
											if (var3 < 0) {
												return; // L: 955
											}

											this.method5080(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44); // L: 946
											var6 += var32; // L: 947
											var5 += var31; // L: 948
											var10 += var35; // L: 949
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 950
											var37 += var39; // L: 951
											var40 += var42; // L: 952
											var43 += var45; // L: 953
										}
									}

									this.method5080(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44); // L: 936
									var6 += var32; // L: 937
									var4 += var30; // L: 938
									var10 += var35; // L: 939
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 940
									var37 += var39; // L: 941
									var40 += var42; // L: 942
									var43 += var45; // L: 943
								}
							} else {
								var3 -= var2; // L: 958
								var2 -= var1; // L: 959
								var1 = var46[var1]; // L: 960

								while (true) {
									--var2; // L: 961
									if (var2 < 0) {
										while (true) {
											--var3; // L: 971
											if (var3 < 0) {
												return; // L: 981
											}

											this.method5080(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44); // L: 972
											var6 += var32; // L: 973
											var5 += var31; // L: 974
											var10 += var35; // L: 975
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 976
											var37 += var39; // L: 977
											var40 += var42; // L: 978
											var43 += var45; // L: 979
										}
									}

									this.method5080(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44); // L: 962
									var6 += var32; // L: 963
									var4 += var30; // L: 964
									var10 += var35; // L: 965
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 966
									var37 += var39; // L: 967
									var40 += var42; // L: 968
									var43 += var45; // L: 969
								}
							}
						} else {
							var5 = var4 <<= 14; // L: 985
							if (var1 < 0) { // L: 986
								var5 -= var32 * var1; // L: 987
								var4 -= var30 * var1; // L: 988
								var10 -= var35 * var1; // L: 989
								var1 = 0; // L: 990
							}

							var6 <<= 14; // L: 992
							if (var3 < 0) { // L: 993
								var6 -= var3 * var31; // L: 994
								var3 = 0; // L: 995
							}

							var48 = var1 - super.field2573.field2843; // L: 997
							var37 += var39 * var48; // L: 998
							var40 += var42 * var48; // L: 999
							var43 += var45 * var48; // L: 1000
							if (var3 != var1 && var32 < var30 || var3 == var1 && var31 > var30) { // L: 1001
								var2 -= var3; // L: 1002
								var3 -= var1; // L: 1003
								var1 = var46[var1]; // L: 1004

								while (true) {
									--var3; // L: 1005
									if (var3 < 0) {
										while (true) {
											--var2; // L: 1015
											if (var2 < 0) {
												return; // L: 1025
											}

											this.method5080(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44); // L: 1016
											var6 += var31; // L: 1017
											var4 += var30; // L: 1018
											var10 += var35; // L: 1019
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 1020
											var37 += var39; // L: 1021
											var40 += var42; // L: 1022
											var43 += var45; // L: 1023
										}
									}

									this.method5080(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44); // L: 1006
									var5 += var32; // L: 1007
									var4 += var30; // L: 1008
									var10 += var35; // L: 1009
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 1010
									var37 += var39; // L: 1011
									var40 += var42; // L: 1012
									var43 += var45; // L: 1013
								}
							} else {
								var2 -= var3; // L: 1028
								var3 -= var1; // L: 1029
								var1 = var46[var1]; // L: 1030

								while (true) {
									--var3; // L: 1031
									if (var3 < 0) {
										while (true) {
											--var2; // L: 1041
											if (var2 < 0) {
												return; // L: 1051
											}

											this.method5080(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44); // L: 1042
											var6 += var31; // L: 1043
											var4 += var30; // L: 1044
											var10 += var35; // L: 1045
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 1046
											var37 += var39; // L: 1047
											var40 += var42; // L: 1048
											var43 += var45; // L: 1049
										}
									}

									this.method5080(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44); // L: 1032
									var5 += var32; // L: 1033
									var4 += var30; // L: 1034
									var10 += var35; // L: 1035
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 1036
									var37 += var39; // L: 1037
									var40 += var42; // L: 1038
									var43 += var45; // L: 1039
								}
							}
						}
					}
				} else if (var2 <= var3) { // L: 1055
					if (var2 < var47) { // L: 1056
						if (var3 > var47) { // L: 1057
							var3 = var47;
						}

						if (var1 > var47) { // L: 1058
							var1 = var47;
						}

						var11 = var34 + ((var11 << 9) - var5 * var34); // L: 1059
						if (var3 < var1) { // L: 1060
							var4 = var5 <<= 14; // L: 1061
							if (var2 < 0) { // L: 1062
								var4 -= var30 * var2; // L: 1063
								var5 -= var31 * var2; // L: 1064
								var11 -= var35 * var2; // L: 1065
								var2 = 0; // L: 1066
							}

							var6 <<= 14; // L: 1068
							if (var3 < 0) { // L: 1069
								var6 -= var3 * var32; // L: 1070
								var3 = 0; // L: 1071
							}

							var48 = var2 - super.field2573.field2843; // L: 1073
							var37 += var39 * var48; // L: 1074
							var40 += var42 * var48; // L: 1075
							var43 += var45 * var48; // L: 1076
							if ((var3 == var2 || var30 >= var31) && (var3 != var2 || var30 <= var32)) { // L: 1077
								var1 -= var3; // L: 1104
								var3 -= var2; // L: 1105
								var2 = var46[var2]; // L: 1106

								while (true) {
									--var3; // L: 1107
									if (var3 < 0) {
										while (true) {
											--var1; // L: 1117
											if (var1 < 0) {
												return; // L: 1127
											}

											this.method5080(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44); // L: 1118
											var4 += var30; // L: 1119
											var6 += var32; // L: 1120
											var11 += var35; // L: 1121
											var2 += Rasterizer2D.Rasterizer2D_width; // L: 1122
											var37 += var39; // L: 1123
											var40 += var42; // L: 1124
											var43 += var45; // L: 1125
										}
									}

									this.method5080(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44); // L: 1108
									var4 += var30; // L: 1109
									var5 += var31; // L: 1110
									var11 += var35; // L: 1111
									var2 += Rasterizer2D.Rasterizer2D_width; // L: 1112
									var37 += var39; // L: 1113
									var40 += var42; // L: 1114
									var43 += var45; // L: 1115
								}
							} else {
								var1 -= var3; // L: 1078
								var3 -= var2; // L: 1079
								var2 = var46[var2]; // L: 1080

								while (true) {
									--var3; // L: 1081
									if (var3 < 0) {
										while (true) {
											--var1; // L: 1091
											if (var1 < 0) {
												return; // L: 1101
											}

											this.method5080(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44); // L: 1092
											var4 += var30; // L: 1093
											var6 += var32; // L: 1094
											var11 += var35; // L: 1095
											var2 += Rasterizer2D.Rasterizer2D_width; // L: 1096
											var37 += var39; // L: 1097
											var40 += var42; // L: 1098
											var43 += var45; // L: 1099
										}
									}

									this.method5080(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44); // L: 1082
									var4 += var30; // L: 1083
									var5 += var31; // L: 1084
									var11 += var35; // L: 1085
									var2 += Rasterizer2D.Rasterizer2D_width; // L: 1086
									var37 += var39; // L: 1087
									var40 += var42; // L: 1088
									var43 += var45; // L: 1089
								}
							}
						} else {
							var6 = var5 <<= 14; // L: 1131
							if (var2 < 0) { // L: 1132
								var6 -= var30 * var2; // L: 1133
								var5 -= var31 * var2; // L: 1134
								var11 -= var35 * var2; // L: 1135
								var2 = 0; // L: 1136
							}

							var4 <<= 14; // L: 1138
							if (var1 < 0) { // L: 1139
								var4 -= var32 * var1; // L: 1140
								var1 = 0; // L: 1141
							}

							var48 = var2 - super.field2573.field2843; // L: 1143
							var37 += var39 * var48; // L: 1144
							var40 += var42 * var48; // L: 1145
							var43 += var45 * var48; // L: 1146
							if (var30 < var31) { // L: 1147
								var3 -= var1; // L: 1148
								var1 -= var2; // L: 1149
								var2 = var46[var2]; // L: 1150

								while (true) {
									--var1; // L: 1151
									if (var1 < 0) {
										while (true) {
											--var3; // L: 1161
											if (var3 < 0) {
												return; // L: 1171
											}

											this.method5080(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44); // L: 1162
											var4 += var32; // L: 1163
											var5 += var31; // L: 1164
											var11 += var35; // L: 1165
											var2 += Rasterizer2D.Rasterizer2D_width; // L: 1166
											var37 += var39; // L: 1167
											var40 += var42; // L: 1168
											var43 += var45; // L: 1169
										}
									}

									this.method5080(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44); // L: 1152
									var6 += var30; // L: 1153
									var5 += var31; // L: 1154
									var11 += var35; // L: 1155
									var2 += Rasterizer2D.Rasterizer2D_width; // L: 1156
									var37 += var39; // L: 1157
									var40 += var42; // L: 1158
									var43 += var45; // L: 1159
								}
							} else {
								var3 -= var1; // L: 1174
								var1 -= var2; // L: 1175
								var2 = var46[var2]; // L: 1176

								while (true) {
									--var1; // L: 1177
									if (var1 < 0) {
										while (true) {
											--var3; // L: 1187
											if (var3 < 0) {
												return; // L: 1197
											}

											this.method5080(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44); // L: 1188
											var4 += var32; // L: 1189
											var5 += var31; // L: 1190
											var11 += var35; // L: 1191
											var2 += Rasterizer2D.Rasterizer2D_width; // L: 1192
											var37 += var39; // L: 1193
											var40 += var42; // L: 1194
											var43 += var45; // L: 1195
										}
									}

									this.method5080(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44); // L: 1178
									var6 += var30; // L: 1179
									var5 += var31; // L: 1180
									var11 += var35; // L: 1181
									var2 += Rasterizer2D.Rasterizer2D_width; // L: 1182
									var37 += var39; // L: 1183
									var40 += var42; // L: 1184
									var43 += var45; // L: 1185
								}
							}
						}
					}
				} else if (var3 < var47) { // L: 1202
					if (var1 > var47) { // L: 1203
						var1 = var47;
					}

					if (var2 > var47) { // L: 1204
						var2 = var47;
					}

					var12 = (var12 << 9) - var34 * var6 + var34; // L: 1205
					if (var1 < var2) { // L: 1206
						var5 = var6 <<= 14; // L: 1207
						if (var3 < 0) { // L: 1208
							var5 -= var3 * var31; // L: 1209
							var6 -= var3 * var32; // L: 1210
							var12 -= var3 * var35; // L: 1211
							var3 = 0; // L: 1212
						}

						var4 <<= 14; // L: 1214
						if (var1 < 0) { // L: 1215
							var4 -= var30 * var1; // L: 1216
							var1 = 0; // L: 1217
						}

						var48 = var3 - super.field2573.field2843; // L: 1219
						var37 += var39 * var48; // L: 1220
						var40 += var42 * var48; // L: 1221
						var43 += var45 * var48; // L: 1222
						if (var31 < var32) { // L: 1223
							var2 -= var1; // L: 1224
							var1 -= var3; // L: 1225
							var3 = var46[var3]; // L: 1226

							while (true) {
								--var1; // L: 1227
								if (var1 < 0) {
									while (true) {
										--var2; // L: 1237
										if (var2 < 0) {
											return; // L: 1247
										}

										this.method5080(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44); // L: 1238
										var5 += var31; // L: 1239
										var4 += var30; // L: 1240
										var12 += var35; // L: 1241
										var3 += Rasterizer2D.Rasterizer2D_width; // L: 1242
										var37 += var39; // L: 1243
										var40 += var42; // L: 1244
										var43 += var45; // L: 1245
									}
								}

								this.method5080(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44); // L: 1228
								var5 += var31; // L: 1229
								var6 += var32; // L: 1230
								var12 += var35; // L: 1231
								var3 += Rasterizer2D.Rasterizer2D_width; // L: 1232
								var37 += var39; // L: 1233
								var40 += var42; // L: 1234
								var43 += var45; // L: 1235
							}
						} else {
							var2 -= var1; // L: 1250
							var1 -= var3; // L: 1251
							var3 = var46[var3]; // L: 1252

							while (true) {
								--var1; // L: 1253
								if (var1 < 0) {
									while (true) {
										--var2; // L: 1263
										if (var2 < 0) {
											return; // L: 1273
										}

										this.method5080(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44); // L: 1264
										var5 += var31; // L: 1265
										var4 += var30; // L: 1266
										var12 += var35; // L: 1267
										var3 += Rasterizer2D.Rasterizer2D_width; // L: 1268
										var37 += var39; // L: 1269
										var40 += var42; // L: 1270
										var43 += var45; // L: 1271
									}
								}

								this.method5080(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44); // L: 1254
								var5 += var31; // L: 1255
								var6 += var32; // L: 1256
								var12 += var35; // L: 1257
								var3 += Rasterizer2D.Rasterizer2D_width; // L: 1258
								var37 += var39; // L: 1259
								var40 += var42; // L: 1260
								var43 += var45; // L: 1261
							}
						}
					} else {
						var4 = var6 <<= 14; // L: 1277
						if (var3 < 0) { // L: 1278
							var4 -= var3 * var31; // L: 1279
							var6 -= var3 * var32; // L: 1280
							var12 -= var3 * var35; // L: 1281
							var3 = 0; // L: 1282
						}

						var5 <<= 14; // L: 1284
						if (var2 < 0) { // L: 1285
							var5 -= var30 * var2; // L: 1286
							var2 = 0; // L: 1287
						}

						var48 = var3 - super.field2573.field2843; // L: 1289
						var37 += var39 * var48; // L: 1290
						var40 += var42 * var48; // L: 1291
						var43 += var45 * var48; // L: 1292
						if (var31 < var32) { // L: 1293
							var1 -= var2; // L: 1294
							var2 -= var3; // L: 1295
							var3 = var46[var3]; // L: 1296

							while (true) {
								--var2; // L: 1297
								if (var2 < 0) {
									while (true) {
										--var1; // L: 1307
										if (var1 < 0) {
											return; // L: 1317
										}

										this.method5080(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44); // L: 1308
										var5 += var30; // L: 1309
										var6 += var32; // L: 1310
										var12 += var35; // L: 1311
										var3 += Rasterizer2D.Rasterizer2D_width; // L: 1312
										var37 += var39; // L: 1313
										var40 += var42; // L: 1314
										var43 += var45; // L: 1315
									}
								}

								this.method5080(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44); // L: 1298
								var4 += var31; // L: 1299
								var6 += var32; // L: 1300
								var12 += var35; // L: 1301
								var3 += Rasterizer2D.Rasterizer2D_width; // L: 1302
								var37 += var39; // L: 1303
								var40 += var42; // L: 1304
								var43 += var45; // L: 1305
							}
						} else {
							var1 -= var2; // L: 1320
							var2 -= var3; // L: 1321
							var3 = var46[var3]; // L: 1322

							while (true) {
								--var2; // L: 1323
								if (var2 < 0) {
									while (true) {
										--var1; // L: 1333
										if (var1 < 0) {
											return; // L: 1343
										}

										this.method5080(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44); // L: 1334
										var5 += var30; // L: 1335
										var6 += var32; // L: 1336
										var12 += var35; // L: 1337
										var3 += Rasterizer2D.Rasterizer2D_width; // L: 1338
										var37 += var39; // L: 1339
										var40 += var42; // L: 1340
										var43 += var45; // L: 1341
									}
								}

								this.method5080(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44); // L: 1324
								var4 += var31; // L: 1325
								var6 += var32; // L: 1326
								var12 += var35; // L: 1327
								var3 += Rasterizer2D.Rasterizer2D_width; // L: 1328
								var37 += var39; // L: 1329
								var40 += var42; // L: 1330
								var43 += var45; // L: 1331
							}
						}
					}
				}
			}
		}
	} // L: 871

	@ObfuscatedName("am")
	void vmethod5133(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
		int[] var23 = super.field2573.Rasterizer3D_textureLoader.getTexturePixels(var22); // L: 1713
		int var24;
		if (var23 == null) { // L: 1714
			var24 = super.field2573.Rasterizer3D_textureLoader.getAverageTextureRGB(var22); // L: 1715
			this.vmethod5143(var1, var2, var3, var4, var5, var6, var7, var8, var9, class242.method4626(var24, var10), class242.method4626(var24, var11), class242.method4626(var24, var12)); // L: 1716
		} else {
			super.field2567 = super.field2573.Rasterizer3D_textureLoader.isLowDetail(var22); // L: 1719
			super.field2566 = super.field2573.Rasterizer3D_textureLoader.vmethod5182(var22); // L: 1720
			var24 = var5 - var4; // L: 1721
			int var25 = var2 - var1; // L: 1722
			int var26 = var6 - var4; // L: 1723
			int var27 = var3 - var1; // L: 1724
			int var28 = var11 - var10; // L: 1725
			int var29 = var12 - var10; // L: 1726
			int var30 = 0; // L: 1727
			if (var2 != var1) { // L: 1728
				var30 = (var5 - var4 << 14) / (var2 - var1);
			}

			int var31 = 0; // L: 1729
			if (var3 != var2) { // L: 1730
				var31 = (var6 - var5 << 14) / (var3 - var2);
			}

			int var32 = 0; // L: 1731
			if (var3 != var1) { // L: 1732
				var32 = (var4 - var6 << 14) / (var1 - var3);
			}

			int var33 = var24 * var27 - var26 * var25; // L: 1733
			if (var33 != 0) { // L: 1734
				int var34 = (var28 * var27 - var29 * var25 << 9) / var33; // L: 1735
				int var35 = (var29 * var24 - var28 * var26 << 9) / var33; // L: 1736
				int var36 = super.field2573.field2830; // L: 1737
				var14 = var13 - var14; // L: 1738
				var17 = var16 - var17; // L: 1739
				var20 = var19 - var20; // L: 1740
				var15 -= var13; // L: 1741
				var18 -= var16; // L: 1742
				var21 -= var19; // L: 1743
				int var37 = var15 * var16 - var18 * var13 << 14; // L: 1744
				int var38 = (int)(((long)(var18 * var19 - var16 * var21) << 14) / (long)var36); // L: 1745
				int var39 = (int)(((long)(var13 * var21 - var19 * var15) << 14) / (long)var36); // L: 1746
				int var40 = var16 * var14 - var13 * var17 << 14; // L: 1747
				int var41 = (int)(((long)(var19 * var17 - var16 * var20) << 14) / (long)var36); // L: 1748
				int var42 = (int)(((long)(var13 * var20 - var19 * var14) << 14) / (long)var36); // L: 1749
				int var43 = var17 * var15 - var18 * var14 << 14; // L: 1750
				int var44 = (int)(((long)(var18 * var20 - var17 * var21) << 14) / (long)var36); // L: 1751
				int var45 = (int)(((long)(var21 * var14 - var15 * var20) << 14) / (long)var36); // L: 1752
				int[] var46 = super.field2573.Rasterizer3D_rowOffsets; // L: 1753
				int var47 = super.field2573.field2845; // L: 1754
				int var48 = super.field2573.field2843; // L: 1755
				int var49;
				if (var1 <= var2 && var1 <= var3) { // L: 1756
					if (var1 < var47) { // L: 1757
						if (var2 > var47) { // L: 1758
							var2 = var47;
						}

						if (var3 > var47) { // L: 1759
							var3 = var47;
						}

						var10 = var34 + ((var10 << 9) - var34 * var4); // L: 1760
						if (var2 < var3) { // L: 1761
							var6 = var4 <<= 14; // L: 1762
							if (var1 < 0) { // L: 1763
								var6 -= var32 * var1; // L: 1764
								var4 -= var30 * var1; // L: 1765
								var10 -= var35 * var1; // L: 1766
								var1 = 0; // L: 1767
							}

							var5 <<= 14; // L: 1769
							if (var2 < 0) { // L: 1770
								var5 -= var31 * var2; // L: 1771
								var2 = 0; // L: 1772
							}

							var49 = var1 - var48; // L: 1774
							var37 += var39 * var49; // L: 1775
							var40 += var42 * var49; // L: 1776
							var43 += var45 * var49; // L: 1777
							if ((var2 == var1 || var32 >= var30) && (var2 != var1 || var32 <= var31)) { // L: 1778
								var3 -= var2; // L: 1805
								var2 -= var1; // L: 1806
								var1 = var46[var1]; // L: 1807

								while (true) {
									--var2; // L: 1808
									if (var2 < 0) {
										while (true) {
											--var3; // L: 1818
											if (var3 < 0) {
												return; // L: 1828
											}

											this.method5104(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44); // L: 1819
											var6 += var32; // L: 1820
											var5 += var31; // L: 1821
											var10 += var35; // L: 1822
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 1823
											var37 += var39; // L: 1824
											var40 += var42; // L: 1825
											var43 += var45; // L: 1826
										}
									}

									this.method5104(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44); // L: 1809
									var6 += var32; // L: 1810
									var4 += var30; // L: 1811
									var10 += var35; // L: 1812
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 1813
									var37 += var39; // L: 1814
									var40 += var42; // L: 1815
									var43 += var45; // L: 1816
								}
							} else {
								var3 -= var2; // L: 1779
								var2 -= var1; // L: 1780
								var1 = var46[var1]; // L: 1781

								while (true) {
									--var2; // L: 1782
									if (var2 < 0) {
										while (true) {
											--var3; // L: 1792
											if (var3 < 0) {
												return; // L: 1802
											}

											this.method5104(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44); // L: 1793
											var6 += var32; // L: 1794
											var5 += var31; // L: 1795
											var10 += var35; // L: 1796
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 1797
											var37 += var39; // L: 1798
											var40 += var42; // L: 1799
											var43 += var45; // L: 1800
										}
									}

									this.method5104(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44); // L: 1783
									var6 += var32; // L: 1784
									var4 += var30; // L: 1785
									var10 += var35; // L: 1786
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 1787
									var37 += var39; // L: 1788
									var40 += var42; // L: 1789
									var43 += var45; // L: 1790
								}
							}
						} else {
							var5 = var4 <<= 14; // L: 1832
							if (var1 < 0) { // L: 1833
								var5 -= var32 * var1; // L: 1834
								var4 -= var30 * var1; // L: 1835
								var10 -= var35 * var1; // L: 1836
								var1 = 0; // L: 1837
							}

							var6 <<= 14; // L: 1839
							if (var3 < 0) { // L: 1840
								var6 -= var3 * var31; // L: 1841
								var3 = 0; // L: 1842
							}

							var49 = var1 - var48; // L: 1844
							var37 += var39 * var49; // L: 1845
							var40 += var42 * var49; // L: 1846
							var43 += var45 * var49; // L: 1847
							if ((var3 == var1 || var32 >= var30) && (var3 != var1 || var31 <= var30)) { // L: 1848
								var2 -= var3; // L: 1875
								var3 -= var1; // L: 1876
								var1 = var46[var1]; // L: 1877

								while (true) {
									--var3; // L: 1878
									if (var3 < 0) {
										while (true) {
											--var2; // L: 1888
											if (var2 < 0) {
												return; // L: 1898
											}

											this.method5104(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44); // L: 1889
											var6 += var31; // L: 1890
											var4 += var30; // L: 1891
											var10 += var35; // L: 1892
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 1893
											var37 += var39; // L: 1894
											var40 += var42; // L: 1895
											var43 += var45; // L: 1896
										}
									}

									this.method5104(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44); // L: 1879
									var5 += var32; // L: 1880
									var4 += var30; // L: 1881
									var10 += var35; // L: 1882
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 1883
									var37 += var39; // L: 1884
									var40 += var42; // L: 1885
									var43 += var45; // L: 1886
								}
							} else {
								var2 -= var3; // L: 1849
								var3 -= var1; // L: 1850
								var1 = var46[var1]; // L: 1851

								while (true) {
									--var3; // L: 1852
									if (var3 < 0) {
										while (true) {
											--var2; // L: 1862
											if (var2 < 0) {
												return; // L: 1872
											}

											this.method5104(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44); // L: 1863
											var6 += var31; // L: 1864
											var4 += var30; // L: 1865
											var10 += var35; // L: 1866
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 1867
											var37 += var39; // L: 1868
											var40 += var42; // L: 1869
											var43 += var45; // L: 1870
										}
									}

									this.method5104(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44); // L: 1853
									var5 += var32; // L: 1854
									var4 += var30; // L: 1855
									var10 += var35; // L: 1856
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 1857
									var37 += var39; // L: 1858
									var40 += var42; // L: 1859
									var43 += var45; // L: 1860
								}
							}
						}
					}
				} else if (var2 <= var3) { // L: 1902
					if (var2 < var47) { // L: 1903
						if (var3 > var47) { // L: 1904
							var3 = var47;
						}

						if (var1 > var47) { // L: 1905
							var1 = var47;
						}

						var11 = var34 + ((var11 << 9) - var5 * var34); // L: 1906
						if (var3 < var1) { // L: 1907
							var4 = var5 <<= 14; // L: 1908
							if (var2 < 0) { // L: 1909
								var4 -= var30 * var2; // L: 1910
								var5 -= var31 * var2; // L: 1911
								var11 -= var35 * var2; // L: 1912
								var2 = 0; // L: 1913
							}

							var6 <<= 14; // L: 1915
							if (var3 < 0) { // L: 1916
								var6 -= var3 * var32; // L: 1917
								var3 = 0; // L: 1918
							}

							var49 = var2 - var48; // L: 1920
							var37 += var39 * var49; // L: 1921
							var40 += var42 * var49; // L: 1922
							var43 += var45 * var49; // L: 1923
							if (var3 != var2 && var30 < var31 || var3 == var2 && var30 > var32) { // L: 1924
								var1 -= var3; // L: 1925
								var3 -= var2; // L: 1926
								var2 = var46[var2]; // L: 1927

								while (true) {
									--var3; // L: 1928
									if (var3 < 0) {
										while (true) {
											--var1; // L: 1938
											if (var1 < 0) {
												return; // L: 1948
											}

											this.method5104(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44); // L: 1939
											var4 += var30; // L: 1940
											var6 += var32; // L: 1941
											var11 += var35; // L: 1942
											var2 += Rasterizer2D.Rasterizer2D_width; // L: 1943
											var37 += var39; // L: 1944
											var40 += var42; // L: 1945
											var43 += var45; // L: 1946
										}
									}

									this.method5104(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44); // L: 1929
									var4 += var30; // L: 1930
									var5 += var31; // L: 1931
									var11 += var35; // L: 1932
									var2 += Rasterizer2D.Rasterizer2D_width; // L: 1933
									var37 += var39; // L: 1934
									var40 += var42; // L: 1935
									var43 += var45; // L: 1936
								}
							} else {
								var1 -= var3; // L: 1951
								var3 -= var2; // L: 1952
								var2 = var46[var2]; // L: 1953

								while (true) {
									--var3; // L: 1954
									if (var3 < 0) {
										while (true) {
											--var1; // L: 1964
											if (var1 < 0) {
												return; // L: 1974
											}

											this.method5104(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44); // L: 1965
											var4 += var30; // L: 1966
											var6 += var32; // L: 1967
											var11 += var35; // L: 1968
											var2 += Rasterizer2D.Rasterizer2D_width; // L: 1969
											var37 += var39; // L: 1970
											var40 += var42; // L: 1971
											var43 += var45; // L: 1972
										}
									}

									this.method5104(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44); // L: 1955
									var4 += var30; // L: 1956
									var5 += var31; // L: 1957
									var11 += var35; // L: 1958
									var2 += Rasterizer2D.Rasterizer2D_width; // L: 1959
									var37 += var39; // L: 1960
									var40 += var42; // L: 1961
									var43 += var45; // L: 1962
								}
							}
						} else {
							var6 = var5 <<= 14; // L: 1978
							if (var2 < 0) { // L: 1979
								var6 -= var30 * var2; // L: 1980
								var5 -= var31 * var2; // L: 1981
								var11 -= var35 * var2; // L: 1982
								var2 = 0; // L: 1983
							}

							var4 <<= 14; // L: 1985
							if (var1 < 0) { // L: 1986
								var4 -= var32 * var1; // L: 1987
								var1 = 0; // L: 1988
							}

							var49 = var2 - var48; // L: 1990
							var37 += var39 * var49; // L: 1991
							var40 += var42 * var49; // L: 1992
							var43 += var45 * var49; // L: 1993
							if (var30 < var31) { // L: 1994
								var3 -= var1; // L: 1995
								var1 -= var2; // L: 1996
								var2 = var46[var2]; // L: 1997

								while (true) {
									--var1; // L: 1998
									if (var1 < 0) {
										while (true) {
											--var3; // L: 2008
											if (var3 < 0) {
												return; // L: 2018
											}

											this.method5104(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44); // L: 2009
											var4 += var32; // L: 2010
											var5 += var31; // L: 2011
											var11 += var35; // L: 2012
											var2 += Rasterizer2D.Rasterizer2D_width; // L: 2013
											var37 += var39; // L: 2014
											var40 += var42; // L: 2015
											var43 += var45; // L: 2016
										}
									}

									this.method5104(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44); // L: 1999
									var6 += var30; // L: 2000
									var5 += var31; // L: 2001
									var11 += var35; // L: 2002
									var2 += Rasterizer2D.Rasterizer2D_width; // L: 2003
									var37 += var39; // L: 2004
									var40 += var42; // L: 2005
									var43 += var45; // L: 2006
								}
							} else {
								var3 -= var1; // L: 2021
								var1 -= var2; // L: 2022
								var2 = var46[var2]; // L: 2023

								while (true) {
									--var1; // L: 2024
									if (var1 < 0) {
										while (true) {
											--var3; // L: 2034
											if (var3 < 0) {
												return; // L: 2044
											}

											this.method5104(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44); // L: 2035
											var4 += var32; // L: 2036
											var5 += var31; // L: 2037
											var11 += var35; // L: 2038
											var2 += Rasterizer2D.Rasterizer2D_width; // L: 2039
											var37 += var39; // L: 2040
											var40 += var42; // L: 2041
											var43 += var45; // L: 2042
										}
									}

									this.method5104(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44); // L: 2025
									var6 += var30; // L: 2026
									var5 += var31; // L: 2027
									var11 += var35; // L: 2028
									var2 += Rasterizer2D.Rasterizer2D_width; // L: 2029
									var37 += var39; // L: 2030
									var40 += var42; // L: 2031
									var43 += var45; // L: 2032
								}
							}
						}
					}
				} else if (var3 < var47) { // L: 2049
					if (var1 > var47) { // L: 2050
						var1 = var47;
					}

					if (var2 > var47) { // L: 2051
						var2 = var47;
					}

					var12 = (var12 << 9) - var34 * var6 + var34; // L: 2052
					if (var1 < var2) { // L: 2053
						var5 = var6 <<= 14; // L: 2054
						if (var3 < 0) { // L: 2055
							var5 -= var3 * var31; // L: 2056
							var6 -= var3 * var32; // L: 2057
							var12 -= var3 * var35; // L: 2058
							var3 = 0; // L: 2059
						}

						var4 <<= 14; // L: 2061
						if (var1 < 0) { // L: 2062
							var4 -= var30 * var1; // L: 2063
							var1 = 0; // L: 2064
						}

						var49 = var3 - var48; // L: 2066
						var37 += var39 * var49; // L: 2067
						var40 += var42 * var49; // L: 2068
						var43 += var45 * var49; // L: 2069
						if (var31 < var32) { // L: 2070
							var2 -= var1; // L: 2071
							var1 -= var3; // L: 2072
							var3 = var46[var3]; // L: 2073

							while (true) {
								--var1; // L: 2074
								if (var1 < 0) {
									while (true) {
										--var2; // L: 2084
										if (var2 < 0) {
											return; // L: 2094
										}

										this.method5104(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44); // L: 2085
										var5 += var31; // L: 2086
										var4 += var30; // L: 2087
										var12 += var35; // L: 2088
										var3 += Rasterizer2D.Rasterizer2D_width; // L: 2089
										var37 += var39; // L: 2090
										var40 += var42; // L: 2091
										var43 += var45; // L: 2092
									}
								}

								this.method5104(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44); // L: 2075
								var5 += var31; // L: 2076
								var6 += var32; // L: 2077
								var12 += var35; // L: 2078
								var3 += Rasterizer2D.Rasterizer2D_width; // L: 2079
								var37 += var39; // L: 2080
								var40 += var42; // L: 2081
								var43 += var45; // L: 2082
							}
						} else {
							var2 -= var1; // L: 2097
							var1 -= var3; // L: 2098
							var3 = var46[var3]; // L: 2099

							while (true) {
								--var1; // L: 2100
								if (var1 < 0) {
									while (true) {
										--var2; // L: 2110
										if (var2 < 0) {
											return; // L: 2120
										}

										this.method5104(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44); // L: 2111
										var5 += var31; // L: 2112
										var4 += var30; // L: 2113
										var12 += var35; // L: 2114
										var3 += Rasterizer2D.Rasterizer2D_width; // L: 2115
										var37 += var39; // L: 2116
										var40 += var42; // L: 2117
										var43 += var45; // L: 2118
									}
								}

								this.method5104(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44); // L: 2101
								var5 += var31; // L: 2102
								var6 += var32; // L: 2103
								var12 += var35; // L: 2104
								var3 += Rasterizer2D.Rasterizer2D_width; // L: 2105
								var37 += var39; // L: 2106
								var40 += var42; // L: 2107
								var43 += var45; // L: 2108
							}
						}
					} else {
						var4 = var6 <<= 14; // L: 2124
						if (var3 < 0) { // L: 2125
							var4 -= var3 * var31; // L: 2126
							var6 -= var3 * var32; // L: 2127
							var12 -= var3 * var35; // L: 2128
							var3 = 0; // L: 2129
						}

						var5 <<= 14; // L: 2131
						if (var2 < 0) { // L: 2132
							var5 -= var30 * var2; // L: 2133
							var2 = 0; // L: 2134
						}

						var49 = var3 - var48; // L: 2136
						var37 += var39 * var49; // L: 2137
						var40 += var42 * var49; // L: 2138
						var43 += var45 * var49; // L: 2139
						if (var31 < var32) { // L: 2140
							var1 -= var2; // L: 2141
							var2 -= var3; // L: 2142
							var3 = var46[var3]; // L: 2143

							while (true) {
								--var2; // L: 2144
								if (var2 < 0) {
									while (true) {
										--var1; // L: 2154
										if (var1 < 0) {
											return; // L: 2164
										}

										this.method5104(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44); // L: 2155
										var5 += var30; // L: 2156
										var6 += var32; // L: 2157
										var12 += var35; // L: 2158
										var3 += Rasterizer2D.Rasterizer2D_width; // L: 2159
										var37 += var39; // L: 2160
										var40 += var42; // L: 2161
										var43 += var45; // L: 2162
									}
								}

								this.method5104(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44); // L: 2145
								var4 += var31; // L: 2146
								var6 += var32; // L: 2147
								var12 += var35; // L: 2148
								var3 += Rasterizer2D.Rasterizer2D_width; // L: 2149
								var37 += var39; // L: 2150
								var40 += var42; // L: 2151
								var43 += var45; // L: 2152
							}
						} else {
							var1 -= var2; // L: 2167
							var2 -= var3; // L: 2168
							var3 = var46[var3]; // L: 2169

							while (true) {
								--var2; // L: 2170
								if (var2 < 0) {
									while (true) {
										--var1; // L: 2180
										if (var1 < 0) {
											return; // L: 2190
										}

										this.method5104(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44); // L: 2181
										var5 += var30; // L: 2182
										var6 += var32; // L: 2183
										var12 += var35; // L: 2184
										var3 += Rasterizer2D.Rasterizer2D_width; // L: 2185
										var37 += var39; // L: 2186
										var40 += var42; // L: 2187
										var43 += var45; // L: 2188
									}
								}

								this.method5104(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44); // L: 2171
								var4 += var31; // L: 2172
								var6 += var32; // L: 2173
								var12 += var35; // L: 2174
								var3 += Rasterizer2D.Rasterizer2D_width; // L: 2175
								var37 += var39; // L: 2176
								var40 += var42; // L: 2177
								var43 += var45; // L: 2178
							}
						}
					}
				}
			}
		}
	} // L: 1717

	@ObfuscatedName("bv")
	final void method5087(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (super.field2573.field2838) { // L: 398
			if (var6 > super.field2573.field2842) { // L: 399
				var6 = super.field2573.field2842;
			}

			if (var5 < 0) { // L: 400
				var5 = 0;
			}
		}

		if (var5 < var6) { // L: 402
			var2 += var5; // L: 403
			var7 += var5 * var8; // L: 404
			int var9;
			int var10;
			int var11;
			int var12;
			if (super.field2573.field2831) { // L: 405
				var4 = var6 - var5 >> 2; // L: 406
				var8 <<= 2; // L: 407
				if (super.field2573.field2832 == 0) { // L: 408
					if (var4 > 0) { // L: 409
						do {
							var9 = (var7 & (var7 >> 31 & 1) - 1) >> 8; // L: 411
							var3 = super.field2572[var9]; // L: 412
							var7 += var8; // L: 413
							var1[var2++] = var3; // L: 414
							var1[var2++] = var3; // L: 415
							var1[var2++] = var3; // L: 416
							var1[var2++] = var3; // L: 417
							--var4; // L: 418
						} while(var4 > 0);
					}

					var4 = var6 - var5 & 3; // L: 420
					if (var4 > 0) { // L: 421
						var9 = (var7 & (var7 >> 31 & 1) - 1) >> 8; // L: 422
						var3 = super.field2572[var9]; // L: 423

						do {
							var1[var2++] = var3; // L: 425
							--var4; // L: 426
						} while(var4 > 0);
					}
				} else {
					var9 = super.field2573.field2832; // L: 430
					var10 = 256 - super.field2573.field2832; // L: 431
					if (var4 > 0) { // L: 432
						do {
							var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8; // L: 434
							var3 = super.field2572[var11]; // L: 435
							var7 += var8; // L: 436
							var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + (var10 * (var3 & 65280) >> 8 & 65280); // L: 437
							var12 = var1[var2]; // L: 438
							var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + (var9 * (var12 & 65280) >> 8 & 65280); // L: 439
							var12 = var1[var2]; // L: 440
							var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + (var9 * (var12 & 65280) >> 8 & 65280); // L: 441
							var12 = var1[var2]; // L: 442
							var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + (var9 * (var12 & 65280) >> 8 & 65280); // L: 443
							var12 = var1[var2]; // L: 444
							var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + (var9 * (var12 & 65280) >> 8 & 65280); // L: 445
							--var4; // L: 446
						} while(var4 > 0);
					}

					var4 = var6 - var5 & 3; // L: 448
					if (var4 > 0) { // L: 449
						var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8; // L: 450
						var3 = super.field2572[var11]; // L: 451
						var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + (var10 * (var3 & 65280) >> 8 & 65280); // L: 452

						do {
							var12 = var1[var2]; // L: 454
							var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + (var9 * (var12 & 65280) >> 8 & 65280); // L: 455
							--var4; // L: 456
						} while(var4 > 0);
					}
				}

			} else {
				var4 = var6 - var5; // L: 462
				if (super.field2573.field2832 == 0) { // L: 463
					do {
						var9 = (var7 & (var7 >> 31 & 1) - 1) >> 8; // L: 465
						var1[var2++] = super.field2572[var9]; // L: 466
						var7 += var8; // L: 467
						--var4; // L: 468
					} while(var4 > 0);
				} else {
					var9 = super.field2573.field2832; // L: 471
					var10 = 256 - super.field2573.field2832; // L: 472

					do {
						var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8; // L: 474
						var3 = super.field2572[var11]; // L: 475
						var7 += var8; // L: 476
						var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + (var10 * (var3 & 65280) >> 8 & 65280); // L: 477
						var12 = var1[var2]; // L: 478
						var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + (var9 * (var12 & 65280) >> 8 & 65280); // L: 479
						--var4; // L: 480
					} while(var4 > 0);
				}

			}
		}
	} // L: 459 482

	@ObfuscatedName("ba")
	void method5081(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		if (super.field2573.field2838) { // L: 813
			if (var6 > super.field2573.field2842) { // L: 814
				var6 = super.field2573.field2842;
			}

			if (var5 < 0) { // L: 815
				var5 = 0;
			}
		}

		if (var5 < var6) { // L: 817
			var2 += var5; // L: 818
			var4 = var6 - var5 >> 2; // L: 819
			if (super.field2573.field2832 != 0) { // L: 820
				if (super.field2573.field2832 == 254) { // L: 832
					while (true) {
						--var4; // L: 833
						if (var4 < 0) {
							var4 = var6 - var5 & 3; // L: 839

							while (true) {
								--var4; // L: 840
								if (var4 < 0) {
									return; // L: 864
								}

								var1[var2++] = var1[var2]; // L: 841
							}
						}

						var1[var2++] = var1[var2]; // L: 834
						var1[var2++] = var1[var2]; // L: 835
						var1[var2++] = var1[var2]; // L: 836
						var1[var2++] = var1[var2]; // L: 837
					}
				} else {
					int var7 = super.field2573.field2832; // L: 845
					int var8 = 256 - super.field2573.field2832; // L: 846
					var3 = ((var3 & 16711935) * var8 >> 8 & 16711935) + (var8 * (var3 & 65280) >> 8 & 65280); // L: 847

					while (true) {
						--var4; // L: 848
						int var9;
						if (var4 < 0) {
							var4 = var6 - var5 & 3; // L: 858

							while (true) {
								--var4; // L: 859
								if (var4 < 0) {
									return;
								}

								var9 = var1[var2]; // L: 860
								var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + (var7 * (var9 & 65280) >> 8 & 65280); // L: 861
							}
						}

						var9 = var1[var2]; // L: 849
						var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + (var7 * (var9 & 65280) >> 8 & 65280); // L: 850
						var9 = var1[var2]; // L: 851
						var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + (var7 * (var9 & 65280) >> 8 & 65280); // L: 852
						var9 = var1[var2]; // L: 853
						var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + (var7 * (var9 & 65280) >> 8 & 65280); // L: 854
						var9 = var1[var2]; // L: 855
						var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + (var7 * (var9 & 65280) >> 8 & 65280); // L: 856
					}
				}
			} else {
				while (true) {
					--var4; // L: 821
					if (var4 < 0) {
						var4 = var6 - var5 & 3; // L: 827

						while (true) {
							--var4; // L: 828
							if (var4 < 0) {
								return;
							}

							var1[var2++] = var3; // L: 829
						}
					}

					var1[var2++] = var3; // L: 822
					var1[var2++] = var3; // L: 823
					var1[var2++] = var3; // L: 824
					var1[var2++] = var3; // L: 825
				}
			}
		}
	}

	@ObfuscatedName("bz")
	void method5080(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
		if (super.field2573.field2838) { // L: 1352
			if (var7 > super.field2573.field2842) { // L: 1353
				var7 = super.field2573.field2842;
			}

			if (var6 < 0) { // L: 1354
				var6 = 0;
			}
		}

		if (var6 < var7) { // L: 1356
			var5 += var6; // L: 1357
			var8 += var9 * var6; // L: 1358
			int var18 = var7 - var6; // L: 1359
			int var16;
			int var10000;
			int var17;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			int var24;
			if (super.field2567) { // L: 1360
				var24 = var6 - super.field2573.field2848; // L: 1366
				var10 += (var13 >> 3) * var24; // L: 1367
				var11 += var24 * (var14 >> 3); // L: 1368
				var12 += (var15 >> 3) * var24; // L: 1369
				var23 = var12 >> 12; // L: 1370
				if (var23 != 0) { // L: 1371
					var19 = var10 / var23; // L: 1372
					var20 = var11 / var23; // L: 1373
					if (var19 < 0) { // L: 1374
						var19 = 0;
					} else if (var19 > 4032) { // L: 1375
						var19 = 4032;
					}
				} else {
					var19 = 0; // L: 1378
					var20 = 0; // L: 1379
				}

				var10 += var13; // L: 1381
				var11 += var14; // L: 1382
				var12 += var15; // L: 1383
				var23 = var12 >> 12; // L: 1384
				if (var23 != 0) { // L: 1385
					var21 = var10 / var23; // L: 1386
					var22 = var11 / var23; // L: 1387
					if (var21 < 0) { // L: 1388
						var21 = 0;
					} else if (var21 > 4032) { // L: 1389
						var21 = 4032;
					}
				} else {
					var21 = 0; // L: 1392
					var22 = 0; // L: 1393
				}

				var3 = (var19 << 20) + var20; // L: 1395
				var17 = (var22 - var20 >> 3) + (var21 - var19 >> 3 << 20); // L: 1396
				var18 >>= 3; // L: 1397
				var9 <<= 3; // L: 1398
				var16 = var8 >> 8; // L: 1399
				if (super.field2566) { // L: 1400
					if (var18 > 0) { // L: 1401
						do {
							var4 = var2[(var3 & 4032) + (var3 >>> 26)]; // L: 1403
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 1404
							var3 += var17; // L: 1405
							var4 = var2[(var3 & 4032) + (var3 >>> 26)]; // L: 1406
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 1407
							var3 += var17; // L: 1408
							var4 = var2[(var3 & 4032) + (var3 >>> 26)]; // L: 1409
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 1410
							var3 += var17; // L: 1411
							var4 = var2[(var3 & 4032) + (var3 >>> 26)]; // L: 1412
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 1413
							var3 += var17; // L: 1414
							var4 = var2[(var3 & 4032) + (var3 >>> 26)]; // L: 1415
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 1416
							var3 += var17; // L: 1417
							var4 = var2[(var3 & 4032) + (var3 >>> 26)]; // L: 1418
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 1419
							var3 += var17; // L: 1420
							var4 = var2[(var3 & 4032) + (var3 >>> 26)]; // L: 1421
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 1422
							var3 += var17; // L: 1423
							var4 = var2[(var3 & 4032) + (var3 >>> 26)]; // L: 1424
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 1425
							var10000 = var3 + var17; // L: 1426
							var19 = var21; // L: 1427
							var20 = var22; // L: 1428
							var10 += var13; // L: 1429
							var11 += var14; // L: 1430
							var12 += var15; // L: 1431
							var23 = var12 >> 12; // L: 1432
							if (var23 != 0) { // L: 1433
								var21 = var10 / var23; // L: 1434
								var22 = var11 / var23; // L: 1435
								if (var21 < 0) { // L: 1436
									var21 = 0;
								} else if (var21 > 4032) { // L: 1437
									var21 = 4032;
								}
							} else {
								var21 = 0; // L: 1440
								var22 = 0; // L: 1441
							}

							var3 = (var19 << 20) + var20; // L: 1443
							var17 = (var22 - var20 >> 3) + (var21 - var19 >> 3 << 20); // L: 1444
							var8 += var9; // L: 1445
							var16 = var8 >> 8; // L: 1446
							--var18; // L: 1447
						} while(var18 > 0);
					}

					var18 = var7 - var6 & 7; // L: 1449
					if (var18 > 0) { // L: 1450
						do {
							var4 = var2[(var3 & 4032) + (var3 >>> 26)]; // L: 1452
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 1453
							var3 += var17; // L: 1454
							--var18; // L: 1455
						} while(var18 > 0);
					}
				} else {
					if (var18 > 0) { // L: 1459
						do {
							if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) { // L: 1461
								var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 1462
							}

							++var5; // L: 1464
							var3 += var17; // L: 1465
							if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) { // L: 1466
								var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 1467
							}

							++var5; // L: 1469
							var3 += var17; // L: 1470
							if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) { // L: 1471
								var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 1472
							}

							++var5; // L: 1474
							var3 += var17; // L: 1475
							if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) { // L: 1476
								var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 1477
							}

							++var5; // L: 1479
							var3 += var17; // L: 1480
							if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) { // L: 1481
								var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 1482
							}

							++var5; // L: 1484
							var3 += var17; // L: 1485
							if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) { // L: 1486
								var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 1487
							}

							++var5; // L: 1489
							var3 += var17; // L: 1490
							if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) { // L: 1491
								var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 1492
							}

							++var5; // L: 1494
							var3 += var17; // L: 1495
							if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) { // L: 1496
								var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 1497
							}

							++var5; // L: 1499
							var10000 = var3 + var17; // L: 1500
							var19 = var21; // L: 1501
							var20 = var22; // L: 1502
							var10 += var13; // L: 1503
							var11 += var14; // L: 1504
							var12 += var15; // L: 1505
							var23 = var12 >> 12; // L: 1506
							if (var23 != 0) { // L: 1507
								var21 = var10 / var23; // L: 1508
								var22 = var11 / var23; // L: 1509
								if (var21 < 0) { // L: 1510
									var21 = 0;
								} else if (var21 > 4032) { // L: 1511
									var21 = 4032;
								}
							} else {
								var21 = 0; // L: 1514
								var22 = 0; // L: 1515
							}

							var3 = (var19 << 20) + var20; // L: 1517
							var17 = (var22 - var20 >> 3) + (var21 - var19 >> 3 << 20); // L: 1518
							var8 += var9; // L: 1519
							var16 = var8 >> 8; // L: 1520
							--var18; // L: 1521
						} while(var18 > 0);
					}

					var18 = var7 - var6 & 7; // L: 1523
					if (var18 > 0) { // L: 1524
						do {
							if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) { // L: 1526
								var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 1527
							}

							++var5; // L: 1529
							var3 += var17; // L: 1530
							--var18; // L: 1531
						} while(var18 > 0);
					}
				}
			} else {
				var24 = var6 - super.field2573.field2848; // L: 1541
				var10 += (var13 >> 3) * var24; // L: 1542
				var11 += var24 * (var14 >> 3); // L: 1543
				var12 += (var15 >> 3) * var24; // L: 1544
				var23 = var12 >> 14; // L: 1545
				if (var23 != 0) { // L: 1546
					var19 = var10 / var23; // L: 1547
					var20 = var11 / var23; // L: 1548
					if (var19 < 0) { // L: 1549
						var19 = 0;
					} else if (var19 > 16256) { // L: 1550
						var19 = 16256;
					}
				} else {
					var19 = 0; // L: 1553
					var20 = 0; // L: 1554
				}

				var10 += var13; // L: 1556
				var11 += var14; // L: 1557
				var12 += var15; // L: 1558
				var23 = var12 >> 14; // L: 1559
				if (var23 != 0) { // L: 1560
					var21 = var10 / var23; // L: 1561
					var22 = var11 / var23; // L: 1562
					if (var21 < 0) { // L: 1563
						var21 = 0;
					} else if (var21 > 16256) { // L: 1564
						var21 = 16256;
					}
				} else {
					var21 = 0; // L: 1567
					var22 = 0; // L: 1568
				}

				var3 = (var19 << 18) + var20; // L: 1570
				var17 = (var22 - var20 >> 3) + (var21 - var19 >> 3 << 18); // L: 1571
				var18 >>= 3; // L: 1572
				var9 <<= 3; // L: 1573
				var16 = var8 >> 8; // L: 1574
				if (super.field2566) { // L: 1575
					if (var18 > 0) { // L: 1576
						do {
							var4 = var2[(var3 & 16256) + (var3 >>> 25)]; // L: 1578
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 1579
							var3 += var17; // L: 1580
							var4 = var2[(var3 & 16256) + (var3 >>> 25)]; // L: 1581
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 1582
							var3 += var17; // L: 1583
							var4 = var2[(var3 & 16256) + (var3 >>> 25)]; // L: 1584
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 1585
							var3 += var17; // L: 1586
							var4 = var2[(var3 & 16256) + (var3 >>> 25)]; // L: 1587
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 1588
							var3 += var17; // L: 1589
							var4 = var2[(var3 & 16256) + (var3 >>> 25)]; // L: 1590
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 1591
							var3 += var17; // L: 1592
							var4 = var2[(var3 & 16256) + (var3 >>> 25)]; // L: 1593
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 1594
							var3 += var17; // L: 1595
							var4 = var2[(var3 & 16256) + (var3 >>> 25)]; // L: 1596
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 1597
							var3 += var17; // L: 1598
							var4 = var2[(var3 & 16256) + (var3 >>> 25)]; // L: 1599
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 1600
							var10000 = var3 + var17; // L: 1601
							var19 = var21; // L: 1602
							var20 = var22; // L: 1603
							var10 += var13; // L: 1604
							var11 += var14; // L: 1605
							var12 += var15; // L: 1606
							var23 = var12 >> 14; // L: 1607
							if (var23 != 0) { // L: 1608
								var21 = var10 / var23; // L: 1609
								var22 = var11 / var23; // L: 1610
								if (var21 < 0) { // L: 1611
									var21 = 0;
								} else if (var21 > 16256) { // L: 1612
									var21 = 16256;
								}
							} else {
								var21 = 0; // L: 1615
								var22 = 0; // L: 1616
							}

							var3 = (var19 << 18) + var20; // L: 1618
							var17 = (var22 - var20 >> 3) + (var21 - var19 >> 3 << 18); // L: 1619
							var8 += var9; // L: 1620
							var16 = var8 >> 8; // L: 1621
							--var18; // L: 1622
						} while(var18 > 0);
					}

					var18 = var7 - var6 & 7; // L: 1624
					if (var18 > 0) { // L: 1625
						do {
							var4 = var2[(var3 & 16256) + (var3 >>> 25)]; // L: 1627
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 1628
							var3 += var17; // L: 1629
							--var18; // L: 1630
						} while(var18 > 0);
					}
				} else {
					if (var18 > 0) { // L: 1634
						do {
							if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) { // L: 1636
								var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 1637
							}

							++var5; // L: 1639
							var3 += var17; // L: 1640
							if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) { // L: 1641
								var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 1642
							}

							++var5; // L: 1644
							var3 += var17; // L: 1645
							if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) { // L: 1646
								var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 1647
							}

							++var5; // L: 1649
							var3 += var17; // L: 1650
							if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) { // L: 1651
								var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 1652
							}

							++var5; // L: 1654
							var3 += var17; // L: 1655
							if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) { // L: 1656
								var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 1657
							}

							++var5; // L: 1659
							var3 += var17; // L: 1660
							if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) { // L: 1661
								var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 1662
							}

							++var5; // L: 1664
							var3 += var17; // L: 1665
							if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) { // L: 1666
								var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 1667
							}

							++var5; // L: 1669
							var3 += var17; // L: 1670
							if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) { // L: 1671
								var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 1672
							}

							++var5; // L: 1674
							var10000 = var3 + var17; // L: 1675
							var19 = var21; // L: 1676
							var20 = var22; // L: 1677
							var10 += var13; // L: 1678
							var11 += var14; // L: 1679
							var12 += var15; // L: 1680
							var23 = var12 >> 14; // L: 1681
							if (var23 != 0) { // L: 1682
								var21 = var10 / var23; // L: 1683
								var22 = var11 / var23; // L: 1684
								if (var21 < 0) { // L: 1685
									var21 = 0;
								} else if (var21 > 16256) { // L: 1686
									var21 = 16256;
								}
							} else {
								var21 = 0; // L: 1689
								var22 = 0; // L: 1690
							}

							var3 = (var19 << 18) + var20; // L: 1692
							var17 = (var22 - var20 >> 3) + (var21 - var19 >> 3 << 18); // L: 1693
							var8 += var9; // L: 1694
							var16 = var8 >> 8; // L: 1695
							--var18; // L: 1696
						} while(var18 > 0);
					}

					var18 = var7 - var6 & 7; // L: 1698
					if (var18 > 0) { // L: 1699
						do {
							if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) { // L: 1701
								var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 1702
							}

							++var5; // L: 1704
							var3 += var17; // L: 1705
							--var18; // L: 1706
						} while(var18 > 0);
					}
				}
			}

		}
	} // L: 1710

	@ObfuscatedName("bb")
	void method5104(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
		if (super.field2573.field2838) { // L: 2199
			if (var7 > super.field2573.field2842) { // L: 2200
				var7 = super.field2573.field2842;
			}

			if (var6 < 0) { // L: 2201
				var6 = 0;
			}
		}

		if (var6 < var7) { // L: 2203
			var5 += var6; // L: 2204
			var8 += var9 * var6; // L: 2205
			int var18 = var7 - var6; // L: 2206
			int var16;
			int var17;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			int var24;
			if (super.field2567) { // L: 2207
				var24 = var6 - super.field2573.field2848; // L: 2214
				var10 += var13 * var24; // L: 2215
				var11 += var24 * var14; // L: 2216
				var12 += var24 * var15; // L: 2217
				var23 = var12 >> 12; // L: 2218
				if (var23 != 0) { // L: 2219
					var19 = var10 / var23; // L: 2220
					var20 = var11 / var23; // L: 2221
				} else {
					var19 = 0; // L: 2224
					var20 = 0; // L: 2225
				}

				var10 += var13 * var18; // L: 2227
				var11 += var18 * var14; // L: 2228
				var12 += var18 * var15; // L: 2229
				var23 = var12 >> 12; // L: 2230
				if (var23 != 0) { // L: 2231
					var21 = var10 / var23; // L: 2232
					var22 = var11 / var23; // L: 2233
				} else {
					var21 = 0; // L: 2236
					var22 = 0; // L: 2237
				}

				var3 = (var19 << 20) + var20; // L: 2239
				var17 = (var22 - var20) / var18 + ((var21 - var19) / var18 << 20); // L: 2240
				var18 >>= 3; // L: 2241
				var9 <<= 3; // L: 2242
				var16 = var8 >> 8; // L: 2243
				if (super.field2566) { // L: 2245
					if (var18 > 0) { // L: 2246
						do {
							var4 = var2[(var3 & 4032) + (var3 >>> 26)]; // L: 2248
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 2249
							var3 += var17; // L: 2250
							var4 = var2[(var3 & 4032) + (var3 >>> 26)]; // L: 2251
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 2252
							var3 += var17; // L: 2253
							var4 = var2[(var3 & 4032) + (var3 >>> 26)]; // L: 2254
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 2255
							var3 += var17; // L: 2256
							var4 = var2[(var3 & 4032) + (var3 >>> 26)]; // L: 2257
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 2258
							var3 += var17; // L: 2259
							var4 = var2[(var3 & 4032) + (var3 >>> 26)]; // L: 2260
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 2261
							var3 += var17; // L: 2262
							var4 = var2[(var3 & 4032) + (var3 >>> 26)]; // L: 2263
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 2264
							var3 += var17; // L: 2265
							var4 = var2[(var3 & 4032) + (var3 >>> 26)]; // L: 2266
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 2267
							var3 += var17; // L: 2268
							var4 = var2[(var3 & 4032) + (var3 >>> 26)]; // L: 2269
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 2270
							var3 += var17; // L: 2271
							var8 += var9; // L: 2272
							var16 = var8 >> 8; // L: 2273
							--var18; // L: 2274
						} while(var18 > 0);
					}

					var18 = var7 - var6 & 7; // L: 2276
					if (var18 > 0) { // L: 2277
						do {
							var4 = var2[(var3 & 4032) + (var3 >>> 26)]; // L: 2279
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 2280
							var3 += var17; // L: 2281
							--var18; // L: 2282
						} while(var18 > 0);
					}
				} else {
					if (var18 > 0) { // L: 2286
						do {
							if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) { // L: 2288
								var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 2289
							}

							++var5; // L: 2291
							var3 += var17; // L: 2292
							if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) { // L: 2293
								var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 2294
							}

							++var5; // L: 2296
							var3 += var17; // L: 2297
							if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) { // L: 2298
								var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 2299
							}

							++var5; // L: 2301
							var3 += var17; // L: 2302
							if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) { // L: 2303
								var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 2304
							}

							++var5; // L: 2306
							var3 += var17; // L: 2307
							if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) { // L: 2308
								var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 2309
							}

							++var5; // L: 2311
							var3 += var17; // L: 2312
							if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) { // L: 2313
								var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 2314
							}

							++var5; // L: 2316
							var3 += var17; // L: 2317
							if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) { // L: 2318
								var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 2319
							}

							++var5; // L: 2321
							var3 += var17; // L: 2322
							if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) { // L: 2323
								var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 2324
							}

							++var5; // L: 2326
							var3 += var17; // L: 2327
							var8 += var9; // L: 2328
							var16 = var8 >> 8; // L: 2329
							--var18; // L: 2330
						} while(var18 > 0);
					}

					var18 = var7 - var6 & 7; // L: 2332
					if (var18 > 0) { // L: 2333
						do {
							if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) { // L: 2335
								var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 2336
							}

							++var5; // L: 2338
							var3 += var17; // L: 2339
							--var18; // L: 2340
						} while(var18 > 0);
					}
				}
			} else {
				var24 = var6 - super.field2573.field2848; // L: 2351
				var10 += var13 * var24; // L: 2352
				var11 += var24 * var14; // L: 2353
				var12 += var24 * var15; // L: 2354
				var23 = var12 >> 14; // L: 2355
				if (var23 != 0) { // L: 2356
					var19 = var10 / var23; // L: 2357
					var20 = var11 / var23; // L: 2358
				} else {
					var19 = 0; // L: 2361
					var20 = 0; // L: 2362
				}

				var10 += var13 * var18; // L: 2364
				var11 += var18 * var14; // L: 2365
				var12 += var18 * var15; // L: 2366
				var23 = var12 >> 14; // L: 2367
				if (var23 != 0) { // L: 2368
					var21 = var10 / var23; // L: 2369
					var22 = var11 / var23; // L: 2370
				} else {
					var21 = 0; // L: 2373
					var22 = 0; // L: 2374
				}

				var3 = (var19 << 18) + var20; // L: 2376
				var17 = (var22 - var20) / var18 + ((var21 - var19) / var18 << 18); // L: 2377
				var18 >>= 3; // L: 2378
				var9 <<= 3; // L: 2379
				var16 = var8 >> 8; // L: 2380
				if (super.field2566) { // L: 2382
					if (var18 > 0) { // L: 2383
						do {
							var4 = var2[(var3 & 16256) + (var3 >>> 25)]; // L: 2385
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 2386
							var3 += var17; // L: 2387
							var4 = var2[(var3 & 16256) + (var3 >>> 25)]; // L: 2388
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 2389
							var3 += var17; // L: 2390
							var4 = var2[(var3 & 16256) + (var3 >>> 25)]; // L: 2391
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 2392
							var3 += var17; // L: 2393
							var4 = var2[(var3 & 16256) + (var3 >>> 25)]; // L: 2394
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 2395
							var3 += var17; // L: 2396
							var4 = var2[(var3 & 16256) + (var3 >>> 25)]; // L: 2397
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 2398
							var3 += var17; // L: 2399
							var4 = var2[(var3 & 16256) + (var3 >>> 25)]; // L: 2400
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 2401
							var3 += var17; // L: 2402
							var4 = var2[(var3 & 16256) + (var3 >>> 25)]; // L: 2403
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 2404
							var3 += var17; // L: 2405
							var4 = var2[(var3 & 16256) + (var3 >>> 25)]; // L: 2406
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 2407
							var3 += var17; // L: 2408
							var8 += var9; // L: 2409
							var16 = var8 >> 8; // L: 2410
							--var18; // L: 2411
						} while(var18 > 0);
					}

					var18 = var7 - var6 & 7; // L: 2413
					if (var18 > 0) { // L: 2414
						do {
							var4 = var2[(var3 & 16256) + (var3 >>> 25)]; // L: 2416
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 2417
							var3 += var17; // L: 2418
							--var18; // L: 2419
						} while(var18 > 0);
					}
				} else {
					if (var18 > 0) { // L: 2423
						do {
							if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) { // L: 2425
								var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 2426
							}

							++var5; // L: 2428
							var3 += var17; // L: 2429
							if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) { // L: 2430
								var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 2431
							}

							++var5; // L: 2433
							var3 += var17; // L: 2434
							if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) { // L: 2435
								var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 2436
							}

							++var5; // L: 2438
							var3 += var17; // L: 2439
							if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) { // L: 2440
								var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 2441
							}

							++var5; // L: 2443
							var3 += var17; // L: 2444
							if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) { // L: 2445
								var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 2446
							}

							++var5; // L: 2448
							var3 += var17; // L: 2449
							if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) { // L: 2450
								var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 2451
							}

							++var5; // L: 2453
							var3 += var17; // L: 2454
							if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) { // L: 2455
								var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 2456
							}

							++var5; // L: 2458
							var3 += var17; // L: 2459
							if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) { // L: 2460
								var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 2461
							}

							++var5; // L: 2463
							var3 += var17; // L: 2464
							var8 += var9; // L: 2465
							var16 = var8 >> 8; // L: 2466
							--var18; // L: 2467
						} while(var18 > 0);
					}

					var18 = var7 - var6 & 7; // L: 2469
					if (var18 > 0) { // L: 2470
						do {
							if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) { // L: 2472
								var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8; // L: 2473
							}

							++var5; // L: 2475
							var3 += var17; // L: 2476
							--var18; // L: 2477
						} while(var18 > 0);
					}
				}
			}

		}
	} // L: 2481
}
