import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ah")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("o")
	int field336;
	@ObfuscatedName("q")
	int field333;
	@ObfuscatedName("l")
	int field339;
	@ObfuscatedName("k")
	int field334;
	@ObfuscatedName("a")
	int field335;
	@ObfuscatedName("m")
	int field337;
	@ObfuscatedName("p")
	int field338;
	@ObfuscatedName("s")
	@Export("numLoops")
	int numLoops;
	@ObfuscatedName("r")
	@Export("start")
	int start;
	@ObfuscatedName("v")
	@Export("end")
	int end;
	@ObfuscatedName("y")
	boolean field342;
	@ObfuscatedName("c")
	int field343;
	@ObfuscatedName("b")
	int field332;
	@ObfuscatedName("t")
	int field345;
	@ObfuscatedName("g")
	int field346;

	@ObfuscatedSignature(
		descriptor = "(Lak;III)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		super.sound = var1; // L: 51
		this.start = var1.start; // L: 52
		this.end = var1.end; // L: 53
		this.field342 = var1.field266; // L: 54
		this.field333 = var2; // L: 55
		this.field339 = var3; // L: 56
		this.field334 = var4; // L: 57
		this.field336 = 0; // L: 58
		this.method800(); // L: 59
	} // L: 60

	@ObfuscatedSignature(
		descriptor = "(Lak;II)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3) {
		super.sound = var1; // L: 39
		this.start = var1.start; // L: 40
		this.end = var1.end; // L: 41
		this.field342 = var1.field266; // L: 42
		this.field333 = var2; // L: 43
		this.field339 = var3; // L: 44
		this.field334 = 8192; // L: 45
		this.field336 = 0; // L: 46
		this.method800(); // L: 47
	} // L: 48

	@ObfuscatedName("a")
	void method800() {
		this.field335 = this.field339; // L: 73
		this.field337 = method827(this.field339, this.field334); // L: 74
		this.field338 = method925(this.field339, this.field334); // L: 75
	} // L: 76

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "()Lao;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null; // L: 200
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "()Lao;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null; // L: 204
	}

	@ObfuscatedName("s")
	protected int vmethod5295() {
		return this.field339 == 0 && this.field343 == 0 ? 0 : 1; // L: 208 209
	}

	@ObfuscatedName("r")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field339 == 0 && this.field343 == 0) { // L: 213
			this.skip(var3); // L: 214
		} else {
			RawSound var4 = (RawSound)super.sound; // L: 217
			int var5 = this.start << 8; // L: 218
			int var6 = this.end << 8; // L: 219
			int var7 = var4.samples.length << 8; // L: 220
			int var8 = var6 - var5; // L: 221
			if (var8 <= 0) { // L: 222
				this.numLoops = 0;
			}

			int var9 = var2; // L: 223
			var3 += var2; // L: 224
			if (this.field336 < 0) { // L: 225
				if (this.field333 <= 0) { // L: 226
					this.method809(); // L: 228
					this.remove(); // L: 229
					return; // L: 230
				}

				this.field336 = 0;
			}

			if (this.field336 >= var7) { // L: 233
				if (this.field333 >= 0) { // L: 234
					this.method809(); // L: 236
					this.remove(); // L: 237
					return; // L: 238
				}

				this.field336 = var7 - 1;
			}

			if (this.numLoops < 0) { // L: 241
				if (this.field342) { // L: 242
					if (this.field333 < 0) { // L: 243
						var9 = this.method934(var1, var2, var5, var3, var4.samples[this.start]); // L: 244
						if (this.field336 >= var5) { // L: 245
							return;
						}

						this.field336 = var5 + var5 - 1 - this.field336; // L: 246
						this.field333 = -this.field333; // L: 247
					}

					while (true) {
						var9 = this.method822(var1, var9, var6, var3, var4.samples[this.end - 1]); // L: 250
						if (this.field336 < var6) { // L: 251
							return;
						}

						this.field336 = var6 + var6 - 1 - this.field336; // L: 252
						this.field333 = -this.field333; // L: 253
						var9 = this.method934(var1, var9, var5, var3, var4.samples[this.start]); // L: 254
						if (this.field336 >= var5) { // L: 255
							return;
						}

						this.field336 = var5 + var5 - 1 - this.field336; // L: 256
						this.field333 = -this.field333; // L: 257
					}
				} else if (this.field333 < 0) { // L: 260
					while (true) {
						var9 = this.method934(var1, var9, var5, var3, var4.samples[this.end - 1]); // L: 262
						if (this.field336 >= var5) { // L: 263
							return;
						}

						this.field336 = var6 - 1 - (var6 - 1 - this.field336) % var8; // L: 264
					}
				} else {
					while (true) {
						var9 = this.method822(var1, var9, var6, var3, var4.samples[this.start]); // L: 269
						if (this.field336 < var6) { // L: 270
							return;
						}

						this.field336 = var5 + (this.field336 - var5) % var8; // L: 271
					}
				}
			} else {
				if (this.numLoops > 0) { // L: 275
					if (this.field342) { // L: 276
						label127: {
							if (this.field333 < 0) { // L: 277
								var9 = this.method934(var1, var2, var5, var3, var4.samples[this.start]); // L: 278
								if (this.field336 >= var5) { // L: 279
									return;
								}

								this.field336 = var5 + var5 - 1 - this.field336; // L: 280
								this.field333 = -this.field333; // L: 281
								if (--this.numLoops == 0) { // L: 282
									break label127;
								}
							}

							do {
								var9 = this.method822(var1, var9, var6, var3, var4.samples[this.end - 1]); // L: 285
								if (this.field336 < var6) { // L: 286
									return;
								}

								this.field336 = var6 + var6 - 1 - this.field336; // L: 287
								this.field333 = -this.field333; // L: 288
								if (--this.numLoops == 0) { // L: 289
									break;
								}

								var9 = this.method934(var1, var9, var5, var3, var4.samples[this.start]); // L: 290
								if (this.field336 >= var5) { // L: 291
									return;
								}

								this.field336 = var5 + var5 - 1 - this.field336; // L: 292
								this.field333 = -this.field333; // L: 293
							} while(--this.numLoops != 0); // L: 294
						}
					} else {
						int var10;
						if (this.field333 < 0) { // L: 297
							while (true) {
								var9 = this.method934(var1, var9, var5, var3, var4.samples[this.end - 1]); // L: 299
								if (this.field336 >= var5) { // L: 300
									return;
								}

								var10 = (var6 - 1 - this.field336) / var8; // L: 301
								if (var10 >= this.numLoops) { // L: 302
									this.field336 += var8 * this.numLoops; // L: 303
									this.numLoops = 0; // L: 304
									break; // L: 305
								}

								this.field336 += var8 * var10; // L: 307
								this.numLoops -= var10; // L: 308
							}
						} else {
							while (true) {
								var9 = this.method822(var1, var9, var6, var3, var4.samples[this.start]); // L: 313
								if (this.field336 < var6) { // L: 314
									return;
								}

								var10 = (this.field336 - var5) / var8; // L: 315
								if (var10 >= this.numLoops) { // L: 316
									this.field336 -= var8 * this.numLoops; // L: 317
									this.numLoops = 0; // L: 318
									break; // L: 319
								}

								this.field336 -= var8 * var10; // L: 321
								this.numLoops -= var10; // L: 322
							}
						}
					}
				}

				if (this.field333 < 0) { // L: 326
					this.method934(var1, var9, 0, var3, 0); // L: 327
					if (this.field336 < 0) { // L: 328
						this.field336 = -1; // L: 329
						this.method809(); // L: 330
						this.remove(); // L: 331
					}
				} else {
					this.method822(var1, var9, var7, var3, 0); // L: 335
					if (this.field336 >= var7) { // L: 336
						this.field336 = var7; // L: 337
						this.method809(); // L: 338
						this.remove(); // L: 339
					}
				}

			}
		}
	} // L: 215 342

	@ObfuscatedName("v")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1; // L: 79
	} // L: 80

	@ObfuscatedName("y")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field343 > 0) { // L: 345
			if (var1 >= this.field343) { // L: 346
				if (this.field339 == Integer.MIN_VALUE) { // L: 347
					this.field339 = 0; // L: 348
					this.field338 = 0; // L: 349
					this.field337 = 0; // L: 350
					this.field335 = 0; // L: 351
					this.remove(); // L: 352
					var1 = this.field343; // L: 353
				}

				this.field343 = 0; // L: 355
				this.method800(); // L: 356
			} else {
				this.field335 += this.field332 * var1; // L: 359
				this.field337 += this.field345 * var1; // L: 360
				this.field338 += this.field346 * var1; // L: 361
				this.field343 -= var1; // L: 362
			}
		}

		RawSound var2 = (RawSound)super.sound; // L: 365
		int var3 = this.start << 8; // L: 366
		int var4 = this.end << 8; // L: 367
		int var5 = var2.samples.length << 8; // L: 368
		int var6 = var4 - var3; // L: 369
		if (var6 <= 0) { // L: 370
			this.numLoops = 0;
		}

		if (this.field336 < 0) { // L: 371
			if (this.field333 <= 0) { // L: 372
				this.method809(); // L: 374
				this.remove(); // L: 375
				return; // L: 376
			}

			this.field336 = 0;
		}

		if (this.field336 >= var5) { // L: 379
			if (this.field333 >= 0) { // L: 380
				this.method809(); // L: 382
				this.remove(); // L: 383
				return; // L: 384
			}

			this.field336 = var5 - 1;
		}

		this.field336 += this.field333 * var1; // L: 387
		if (this.numLoops < 0) { // L: 388
			if (!this.field342) { // L: 389
				if (this.field333 < 0) { // L: 404
					if (this.field336 >= var3) { // L: 405
						return;
					}

					this.field336 = var4 - 1 - (var4 - 1 - this.field336) % var6; // L: 406
				} else {
					if (this.field336 < var4) { // L: 409
						return;
					}

					this.field336 = var3 + (this.field336 - var3) % var6; // L: 410
				}

			} else {
				if (this.field333 < 0) { // L: 390
					if (this.field336 >= var3) { // L: 391
						return;
					}

					this.field336 = var3 + var3 - 1 - this.field336; // L: 392
					this.field333 = -this.field333; // L: 393
				}

				while (this.field336 >= var4) { // L: 396
					this.field336 = var4 + var4 - 1 - this.field336; // L: 397
					this.field333 = -this.field333; // L: 398
					if (this.field336 >= var3) { // L: 399
						return;
					}

					this.field336 = var3 + var3 - 1 - this.field336; // L: 400
					this.field333 = -this.field333; // L: 401
				}

			}
		} else {
			if (this.numLoops > 0) { // L: 414
				if (this.field342) { // L: 415
					label129: {
						if (this.field333 < 0) { // L: 416
							if (this.field336 >= var3) { // L: 417
								return;
							}

							this.field336 = var3 + var3 - 1 - this.field336; // L: 418
							this.field333 = -this.field333; // L: 419
							if (--this.numLoops == 0) { // L: 420
								break label129;
							}
						}

						do {
							if (this.field336 < var4) { // L: 423
								return;
							}

							this.field336 = var4 + var4 - 1 - this.field336; // L: 424
							this.field333 = -this.field333; // L: 425
							if (--this.numLoops == 0) { // L: 426
								break;
							}

							if (this.field336 >= var3) { // L: 427
								return;
							}

							this.field336 = var3 + var3 - 1 - this.field336; // L: 428
							this.field333 = -this.field333; // L: 429
						} while(--this.numLoops != 0); // L: 430
					}
				} else {
					label161: {
						int var7;
						if (this.field333 < 0) { // L: 433
							if (this.field336 >= var3) { // L: 434
								return;
							}

							var7 = (var4 - 1 - this.field336) / var6; // L: 435
							if (var7 >= this.numLoops) { // L: 436
								this.field336 += var6 * this.numLoops; // L: 437
								this.numLoops = 0; // L: 438
								break label161; // L: 439
							}

							this.field336 += var6 * var7; // L: 441
							this.numLoops -= var7; // L: 442
						} else {
							if (this.field336 < var4) { // L: 445
								return;
							}

							var7 = (this.field336 - var3) / var6; // L: 446
							if (var7 >= this.numLoops) { // L: 447
								this.field336 -= var6 * this.numLoops; // L: 448
								this.numLoops = 0; // L: 449
								break label161; // L: 450
							}

							this.field336 -= var6 * var7; // L: 452
							this.numLoops -= var7; // L: 453
						}

						return; // L: 455
					}
				}
			}

			if (this.field333 < 0) { // L: 457
				if (this.field336 < 0) { // L: 458
					this.field336 = -1; // L: 459
					this.method809(); // L: 460
					this.remove(); // L: 461
				}
			} else if (this.field336 >= var5) { // L: 465
				this.field336 = var5; // L: 466
				this.method809(); // L: 467
				this.remove(); // L: 468
			}

		}
	} // L: 412 471

	@ObfuscatedName("c")
	public synchronized void method802(int var1) {
		this.method804(var1 << 6, this.method806()); // L: 83
	} // L: 84

	@ObfuscatedName("w")
	synchronized void method803(int var1) {
		this.method804(var1, this.method806()); // L: 87
	} // L: 88

	@ObfuscatedName("b")
	synchronized void method804(int var1, int var2) {
		this.field339 = var1; // L: 91
		this.field334 = var2; // L: 92
		this.field343 = 0; // L: 93
		this.method800(); // L: 94
	} // L: 95

	@ObfuscatedName("t")
	public synchronized int method805() {
		return this.field339 == Integer.MIN_VALUE ? 0 : this.field339; // L: 98
	}

	@ObfuscatedName("g")
	public synchronized int method806() {
		return this.field334 < 0 ? -1 : this.field334; // L: 102
	}

	@ObfuscatedName("x")
	public synchronized void method807(int var1) {
		int var2 = ((RawSound)super.sound).samples.length << 8; // L: 106
		if (var1 < -1) { // L: 107
			var1 = -1;
		}

		if (var1 > var2) { // L: 108
			var1 = var2;
		}

		this.field336 = var1; // L: 109
	} // L: 110

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public synchronized void method811() {
		this.field333 = (this.field333 ^ this.field333 >> 31) + (this.field333 >>> 31); // L: 113
		this.field333 = -this.field333; // L: 114
	} // L: 115

	@ObfuscatedName("e")
	void method809() {
		if (this.field343 != 0) { // L: 118
			if (this.field339 == Integer.MIN_VALUE) {
				this.field339 = 0; // L: 119
			}

			this.field343 = 0; // L: 120
			this.method800(); // L: 121
		}

	} // L: 123

	@ObfuscatedName("h")
	public synchronized void method810(int var1, int var2) {
		this.method799(var1, var2, this.method806()); // L: 126
	} // L: 127

	@ObfuscatedName("f")
	public synchronized void method799(int var1, int var2, int var3) {
		if (var1 == 0) { // L: 130
			this.method804(var2, var3); // L: 131
		} else {
			int var4 = method827(var2, var3); // L: 134
			int var5 = method925(var2, var3); // L: 135
			if (var4 == this.field337 && var5 == this.field338) { // L: 136
				this.field343 = 0; // L: 137
			} else {
				int var6 = var2 - this.field335; // L: 140
				if (this.field335 - var2 > var6) { // L: 141
					var6 = this.field335 - var2;
				}

				if (var4 - this.field337 > var6) { // L: 142
					var6 = var4 - this.field337;
				}

				if (this.field337 - var4 > var6) { // L: 143
					var6 = this.field337 - var4;
				}

				if (var5 - this.field338 > var6) {
					var6 = var5 - this.field338; // L: 144
				}

				if (this.field338 - var5 > var6) { // L: 145
					var6 = this.field338 - var5;
				}

				if (var1 > var6) { // L: 146
					var1 = var6;
				}

				this.field343 = var1; // L: 147
				this.field339 = var2; // L: 148
				this.field334 = var3; // L: 149
				this.field332 = (var2 - this.field335) / var1; // L: 150
				this.field345 = (var4 - this.field337) / var1; // L: 151
				this.field346 = (var5 - this.field338) / var1; // L: 152
			}
		}
	} // L: 132 138 153

	@ObfuscatedName("d")
	public synchronized void method812(int var1) {
		if (var1 == 0) { // L: 156
			this.method803(0); // L: 157
			this.remove(); // L: 158
		} else if (this.field337 == 0 && this.field338 == 0) { // L: 161
			this.field343 = 0; // L: 162
			this.field339 = 0; // L: 163
			this.field335 = 0; // L: 164
			this.remove(); // L: 165
		} else {
			int var2 = -this.field335; // L: 168
			if (this.field335 > var2) { // L: 169
				var2 = this.field335;
			}

			if (-this.field337 > var2) { // L: 170
				var2 = -this.field337;
			}

			if (this.field337 > var2) { // L: 171
				var2 = this.field337;
			}

			if (-this.field338 > var2) { // L: 172
				var2 = -this.field338;
			}

			if (this.field338 > var2) { // L: 173
				var2 = this.field338;
			}

			if (var1 > var2) { // L: 174
				var1 = var2;
			}

			this.field343 = var1; // L: 175
			this.field339 = Integer.MIN_VALUE; // L: 176
			this.field332 = -this.field335 / var1; // L: 177
			this.field345 = -this.field337 / var1; // L: 178
			this.field346 = -this.field338 / var1; // L: 179
		}
	} // L: 159 166 180

	@ObfuscatedName("j")
	public synchronized void method813(int var1) {
		if (this.field333 < 0) { // L: 183
			this.field333 = -var1;
		} else {
			this.field333 = var1; // L: 184
		}

	} // L: 185

	@ObfuscatedName("z")
	public synchronized int method884() {
		return this.field333 < 0 ? -this.field333 : this.field333; // L: 188
	}

	@ObfuscatedName("ab")
	public boolean method815() {
		return this.field336 < 0 || this.field336 >= ((RawSound)super.sound).samples.length << 8; // L: 192
	}

	@ObfuscatedName("aj")
	public boolean method935() {
		return this.field343 != 0; // L: 196
	}

	@ObfuscatedName("as")
	int method822(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field343 > 0) { // L: 474
				int var6 = var2 + this.field343; // L: 475
				if (var6 > var4) { // L: 476
					var6 = var4;
				}

				this.field343 += var2; // L: 477
				if (this.field333 == 256 && (this.field336 & 255) == 0) { // L: 478
					if (ArchiveDiskAction.PcmPlayer_stereo) { // L: 479
						var2 = method888(0, ((RawSound)super.sound).samples, var1, this.field336, var2, this.field337, this.field338, this.field345, this.field346, 0, var6, var3, this);
					} else {
						var2 = method833(((RawSound)super.sound).samples, var1, this.field336, var2, this.field335, this.field332, 0, var6, var3, this); // L: 480
					}
				} else if (ArchiveDiskAction.PcmPlayer_stereo) { // L: 483
					var2 = method838(0, 0, ((RawSound)super.sound).samples, var1, this.field336, var2, this.field337, this.field338, this.field345, this.field346, 0, var6, var3, this, this.field333, var5);
				} else {
					var2 = method837(0, 0, ((RawSound)super.sound).samples, var1, this.field336, var2, this.field335, this.field332, 0, var6, var3, this, this.field333, var5); // L: 484
				}

				this.field343 -= var2; // L: 486
				if (this.field343 != 0) { // L: 487
					return var2;
				}

				if (!this.method824()) { // L: 488
					continue;
				}

				return var4;
			}

			if (this.field333 == 256 && (this.field336 & 255) == 0) { // L: 490
				if (ArchiveDiskAction.PcmPlayer_stereo) { // L: 491
					return method826(0, ((RawSound)super.sound).samples, var1, this.field336, var2, this.field337, this.field338, 0, var4, var3, this);
				}

				return method853(((RawSound)super.sound).samples, var1, this.field336, var2, this.field335, 0, var4, var3, this); // L: 492
			}

			if (ArchiveDiskAction.PcmPlayer_stereo) { // L: 495
				return method928(0, 0, ((RawSound)super.sound).samples, var1, this.field336, var2, this.field337, this.field338, 0, var4, var3, this, this.field333, var5);
			}

			return method936(0, 0, ((RawSound)super.sound).samples, var1, this.field336, var2, this.field335, 0, var4, var3, this, this.field333, var5); // L: 496
		}
	}

	@ObfuscatedName("au")
	int method934(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field343 > 0) { // L: 501
				int var6 = var2 + this.field343; // L: 502
				if (var6 > var4) { // L: 503
					var6 = var4;
				}

				this.field343 += var2; // L: 504
				if (this.field333 == -256 && (this.field336 & 255) == 0) { // L: 505
					if (ArchiveDiskAction.PcmPlayer_stereo) { // L: 506
						var2 = method863(0, ((RawSound)super.sound).samples, var1, this.field336, var2, this.field337, this.field338, this.field345, this.field346, 0, var6, var3, this);
					} else {
						var2 = method916(((RawSound)super.sound).samples, var1, this.field336, var2, this.field335, this.field332, 0, var6, var3, this); // L: 507
					}
				} else if (ArchiveDiskAction.PcmPlayer_stereo) { // L: 510
					var2 = method840(0, 0, ((RawSound)super.sound).samples, var1, this.field336, var2, this.field337, this.field338, this.field345, this.field346, 0, var6, var3, this, this.field333, var5);
				} else {
					var2 = method839(0, 0, ((RawSound)super.sound).samples, var1, this.field336, var2, this.field335, this.field332, 0, var6, var3, this, this.field333, var5); // L: 511
				}

				this.field343 -= var2; // L: 513
				if (this.field343 != 0) { // L: 514
					return var2;
				}

				if (!this.method824()) { // L: 515
					continue;
				}

				return var4;
			}

			if (this.field333 == -256 && (this.field336 & 255) == 0) { // L: 517
				if (ArchiveDiskAction.PcmPlayer_stereo) { // L: 518
					return method828(0, ((RawSound)super.sound).samples, var1, this.field336, var2, this.field337, this.field338, 0, var4, var3, this);
				}

				return method865(((RawSound)super.sound).samples, var1, this.field336, var2, this.field335, 0, var4, var3, this); // L: 519
			}

			if (ArchiveDiskAction.PcmPlayer_stereo) { // L: 522
				return method832(0, 0, ((RawSound)super.sound).samples, var1, this.field336, var2, this.field337, this.field338, 0, var4, var3, this, this.field333, var5);
			}

			return method831(0, 0, ((RawSound)super.sound).samples, var1, this.field336, var2, this.field335, 0, var4, var3, this, this.field333, var5); // L: 523
		}
	}

	@ObfuscatedName("al")
	int vmethod951() {
		int var1 = this.field335 * 3 >> 6; // L: 31
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31); // L: 32
		if (this.numLoops == 0) { // L: 33
			var1 -= var1 * this.field336 / (((RawSound)super.sound).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound)super.sound).samples.length; // L: 34
		}

		return var1 > 255 ? 255 : var1; // L: 35
	}

	@ObfuscatedName("aq")
	boolean method824() {
		int var1 = this.field339; // L: 528
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) { // L: 531
			var3 = 0; // L: 532
			var2 = 0; // L: 533
			var1 = 0; // L: 534
		} else {
			var2 = method827(var1, this.field334); // L: 537
			var3 = method925(var1, this.field334); // L: 538
		}

		if (var1 == this.field335 && var2 == this.field337 && var3 == this.field338) { // L: 540
			if (this.field339 == Integer.MIN_VALUE) { // L: 570
				this.field339 = 0; // L: 571
				this.field338 = 0; // L: 572
				this.field337 = 0; // L: 573
				this.field335 = 0; // L: 574
				this.remove(); // L: 575
				return true; // L: 576
			} else {
				this.method800(); // L: 578
				return false; // L: 579
			}
		} else {
			if (this.field335 < var1) { // L: 541
				this.field332 = 1; // L: 542
				this.field343 = var1 - this.field335; // L: 543
			} else if (this.field335 > var1) { // L: 545
				this.field332 = -1; // L: 546
				this.field343 = this.field335 - var1; // L: 547
			} else {
				this.field332 = 0; // L: 549
			}

			if (this.field337 < var2) { // L: 550
				this.field345 = 1; // L: 551
				if (this.field343 == 0 || this.field343 > var2 - this.field337) { // L: 552
					this.field343 = var2 - this.field337;
				}
			} else if (this.field337 > var2) { // L: 554
				this.field345 = -1; // L: 555
				if (this.field343 == 0 || this.field343 > this.field337 - var2) { // L: 556
					this.field343 = this.field337 - var2;
				}
			} else {
				this.field345 = 0; // L: 558
			}

			if (this.field338 < var3) { // L: 559
				this.field346 = 1; // L: 560
				if (this.field343 == 0 || this.field343 > var3 - this.field338) { // L: 561
					this.field343 = var3 - this.field338;
				}
			} else if (this.field338 > var3) { // L: 563
				this.field346 = -1; // L: 564
				if (this.field343 == 0 || this.field343 > this.field338 - var3) { // L: 565
					this.field343 = this.field338 - var3;
				}
			} else {
				this.field346 = 0; // L: 567
			}

			return false; // L: 568
		}
	}

	@ObfuscatedName("o")
	static int method827(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D); // L: 23
	}

	@ObfuscatedName("q")
	static int method925(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D); // L: 27
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lak;II)Lah;"
	)
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(PcmPlayer.field300 * 100)), var2 << 6) : null; // L: 63 64
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lak;III)Lah;"
	)
	public static RawPcmStream method829(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null; // L: 68 69
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILah;)I"
	)
	static int method853(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
		var2 >>= 8; // L: 583
		var7 >>= 8; // L: 584
		var4 <<= 2; // L: 585
		if ((var5 = var3 + var7 - var2) > var6) { // L: 586
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) { // L: 587 588
			var10001 = var3++; // L: 589
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++; // L: 590
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++; // L: 591
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++; // L: 592
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) { // L: 594 595
			var10001 = var3++; // L: 596
		}

		var8.field336 = var2 << 8; // L: 598
		return var3; // L: 599
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILah;)I"
	)
	static int method826(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
		var3 >>= 8; // L: 603
		var9 >>= 8; // L: 604
		var5 <<= 2; // L: 605
		var6 <<= 2; // L: 606
		if ((var7 = var4 + var9 - var3) > var8) { // L: 607
			var7 = var8;
		}

		var4 <<= 1; // L: 608
		var7 <<= 1; // L: 609

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) { // L: 610 611
			var11 = var1[var3++]; // L: 612
			var10001 = var4++; // L: 613
			var2[var10001] += var11 * var5;
			var10001 = var4++; // L: 614
			var2[var10001] += var11 * var6;
			var11 = var1[var3++]; // L: 615
			var10001 = var4++; // L: 616
			var2[var10001] += var11 * var5;
			var10001 = var4++; // L: 617
			var2[var10001] += var11 * var6;
			var11 = var1[var3++]; // L: 618
			var10001 = var4++; // L: 619
			var2[var10001] += var11 * var5;
			var10001 = var4++; // L: 620
			var2[var10001] += var11 * var6;
			var11 = var1[var3++]; // L: 621
			var10001 = var4++;
			var2[var10001] += var11 * var5; // L: 622
			var10001 = var4++; // L: 623
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) { // L: 625 626 629
			var11 = var1[var3++]; // L: 627
			var10001 = var4++; // L: 628
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.field336 = var3 << 8; // L: 631
		return var4 >> 1; // L: 632
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILah;)I"
	)
	static int method865(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
		var2 >>= 8; // L: 636
		var7 >>= 8; // L: 637
		var4 <<= 2; // L: 638
		if ((var5 = var3 + var2 - (var7 - 1)) > var6) { // L: 639
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) { // L: 640 641
			var10001 = var3++; // L: 642
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4; // L: 643
			var10001 = var3++; // L: 644
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++; // L: 645
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) { // L: 647 648
			var10001 = var3++; // L: 649
		}

		var8.field336 = var2 << 8; // L: 651
		return var3; // L: 652
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILah;)I"
	)
	static int method828(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
		var3 >>= 8; // L: 656
		var9 >>= 8; // L: 657
		var5 <<= 2; // L: 658
		var6 <<= 2; // L: 659
		if ((var7 = var3 + var4 - (var9 - 1)) > var8) { // L: 660
			var7 = var8;
		}

		var4 <<= 1; // L: 661
		var7 <<= 1; // L: 662

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) { // L: 663 664
			var11 = var1[var3--]; // L: 665
			var10001 = var4++; // L: 666
			var2[var10001] += var11 * var5;
			var10001 = var4++; // L: 667
			var2[var10001] += var11 * var6;
			var11 = var1[var3--]; // L: 668
			var10001 = var4++; // L: 669
			var2[var10001] += var11 * var5;
			var10001 = var4++; // L: 670
			var2[var10001] += var11 * var6;
			var11 = var1[var3--]; // L: 671
			var10001 = var4++; // L: 672
			var2[var10001] += var11 * var5;
			var10001 = var4++; // L: 673
			var2[var10001] += var11 * var6;
			var11 = var1[var3--]; // L: 674
			var10001 = var4++;
			var2[var10001] += var11 * var5; // L: 675
			var10001 = var4++; // L: 676
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) { // L: 678 679 682
			var11 = var1[var3--]; // L: 680
			var10001 = var4++; // L: 681
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.field336 = var3 << 8; // L: 684
		return var4 >> 1; // L: 685
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILah;II)I"
	)
	static int method936(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 257) / var11) > var8) { // L: 689
			var7 = var8;
		}

		byte var13;
		int var10001;
		while (var5 < var7) { // L: 690
			var1 = var4 >> 8; // L: 691
			var13 = var2[var1]; // L: 692
			var10001 = var5++; // L: 693
			var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11; // L: 694
		}

		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 1) / var11) > var8) { // L: 696
			var7 = var8;
		}

		for (var1 = var12; var5 < var7; var4 += var11) { // L: 697 698 701
			var13 = var2[var4 >> 8]; // L: 699
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6; // L: 700
		}

		var10.field336 = var4; // L: 703
		return var5; // L: 704
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILah;II)I"
	)
	static int method928(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) { // L: 708
			var8 = var9;
		}

		var5 <<= 1; // L: 709

		byte var14;
		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) { // L: 710 711 717
			var1 = var4 >> 8; // L: 712
			var14 = var2[var1]; // L: 713
			var0 = (var14 << 8) + (var4 & 255) * (var2[var1 + 1] - var14); // L: 714
			var10001 = var5++; // L: 715
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++; // L: 716
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) { // L: 719
			var8 = var9;
		}

		var8 <<= 1; // L: 720

		for (var1 = var13; var5 < var8; var4 += var12) { // L: 721 722 727
			var14 = var2[var4 >> 8]; // L: 723
			var0 = (var14 << 8) + (var1 - var14) * (var4 & 255); // L: 724
			var10001 = var5++; // L: 725
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++; // L: 726
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.field336 = var4; // L: 729
		return var5 >> 1; // L: 730
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILah;II)I"
	)
	static int method831(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var11 + (var9 + 256 - var4)) / var11) > var8) { // L: 734
			var7 = var8;
		}

		int var10001;
		while (var5 < var7) { // L: 735
			var1 = var4 >> 8; // L: 736
			byte var13 = var2[var1 - 1]; // L: 737
			var10001 = var5++; // L: 738
			var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11; // L: 739
		}

		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4)) / var11) > var8) { // L: 741
			var7 = var8;
		}

		var0 = var12; // L: 742

		for (var1 = var11; var5 < var7; var4 += var1) { // L: 743 744 746
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6; // L: 745
		}

		var10.field336 = var4; // L: 748
		return var5; // L: 749
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILah;II)I"
	)
	static int method832(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) { // L: 753
			var8 = var9;
		}

		var5 <<= 1; // L: 754

		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) { // L: 755 756 762
			var1 = var4 >> 8; // L: 757
			byte var14 = var2[var1 - 1]; // L: 758
			var0 = (var2[var1] - var14) * (var4 & 255) + (var14 << 8); // L: 759
			var10001 = var5++; // L: 760
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++; // L: 761
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) { // L: 764
			var8 = var9;
		}

		var8 <<= 1; // L: 765

		for (var1 = var13; var5 < var8; var4 += var12) { // L: 766 767 771
			var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1); // L: 768
			var10001 = var5++; // L: 769
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++; // L: 770
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.field336 = var4; // L: 773
		return var5 >> 1; // L: 774
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILah;)I"
	)
	static int method833(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8; // L: 778
		var8 >>= 8; // L: 779
		var4 <<= 2; // L: 780
		var5 <<= 2; // L: 781
		if ((var6 = var3 + var8 - var2) > var7) { // L: 782
			var6 = var7;
		}

		var9.field337 += var9.field345 * (var6 - var3); // L: 783
		var9.field338 += var9.field346 * (var6 - var3); // L: 784

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) { // L: 785 786 794
			var10001 = var3++; // L: 787
			var1[var10001] += var0[var2++] * var4;
			var4 += var5; // L: 788
			var10001 = var3++; // L: 789
			var1[var10001] += var0[var2++] * var4;
			var4 += var5; // L: 790
			var10001 = var3++; // L: 791
			var1[var10001] += var0[var2++] * var4;
			var4 += var5; // L: 792
			var10001 = var3++; // L: 793
			var1[var10001] += var0[var2++] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) { // L: 796 797 799
			var10001 = var3++; // L: 798
			var1[var10001] += var0[var2++] * var4;
		}

		var9.field335 = var4 >> 2; // L: 801
		var9.field336 = var2 << 8; // L: 802
		return var3; // L: 803
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILah;)I"
	)
	static int method888(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8; // L: 807
		var11 >>= 8; // L: 808
		var5 <<= 2; // L: 809
		var6 <<= 2; // L: 810
		var7 <<= 2; // L: 811
		var8 <<= 2; // L: 812
		if ((var9 = var11 + var4 - var3) > var10) { // L: 813
			var9 = var10;
		}

		var12.field335 += var12.field332 * (var9 - var4); // L: 814
		var4 <<= 1; // L: 815
		var9 <<= 1; // L: 816

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) { // L: 817 818 838
			var13 = var1[var3++]; // L: 819
			var10001 = var4++; // L: 820
			var2[var10001] += var13 * var5;
			var5 += var7; // L: 821
			var10001 = var4++; // L: 822
			var2[var10001] += var13 * var6;
			var6 += var8; // L: 823
			var13 = var1[var3++]; // L: 824
			var10001 = var4++; // L: 825
			var2[var10001] += var13 * var5;
			var5 += var7; // L: 826
			var10001 = var4++; // L: 827
			var2[var10001] += var13 * var6;
			var6 += var8; // L: 828
			var13 = var1[var3++]; // L: 829
			var10001 = var4++; // L: 830
			var2[var10001] += var13 * var5;
			var5 += var7; // L: 831
			var10001 = var4++; // L: 832
			var2[var10001] += var13 * var6;
			var6 += var8; // L: 833
			var13 = var1[var3++]; // L: 834
			var10001 = var4++; // L: 835
			var2[var10001] += var13 * var5;
			var5 += var7; // L: 836
			var10001 = var4++;
			var2[var10001] += var13 * var6; // L: 837
		}

		for (var9 += 6; var4 < var9; var6 += var8) { // L: 840 841 846
			var13 = var1[var3++]; // L: 842
			var10001 = var4++; // L: 843
			var2[var10001] += var13 * var5;
			var5 += var7; // L: 844
			var10001 = var4++; // L: 845
			var2[var10001] += var13 * var6;
		}

		var12.field337 = var5 >> 2; // L: 848
		var12.field338 = var6 >> 2; // L: 849
		var12.field336 = var3 << 8; // L: 850
		return var4 >> 1; // L: 851
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILah;)I"
	)
	static int method916(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8; // L: 855
		var8 >>= 8; // L: 856
		var4 <<= 2; // L: 857
		var5 <<= 2; // L: 858
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) { // L: 859
			var6 = var7;
		}

		var9.field337 += var9.field345 * (var6 - var3); // L: 860
		var9.field338 += var9.field346 * (var6 - var3); // L: 861

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) { // L: 862 863 871
			var10001 = var3++; // L: 864
			var1[var10001] += var0[var2--] * var4;
			var4 += var5; // L: 865
			var10001 = var3++; // L: 866
			var1[var10001] += var0[var2--] * var4;
			var4 += var5; // L: 867
			var10001 = var3++; // L: 868
			var1[var10001] += var0[var2--] * var4;
			var4 += var5; // L: 869
			var10001 = var3++; // L: 870
			var1[var10001] += var0[var2--] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) { // L: 873 874 876
			var10001 = var3++; // L: 875
			var1[var10001] += var0[var2--] * var4;
		}

		var9.field335 = var4 >> 2; // L: 878
		var9.field336 = var2 << 8; // L: 879
		return var3; // L: 880
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILah;)I"
	)
	static int method863(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8; // L: 884
		var11 >>= 8; // L: 885
		var5 <<= 2; // L: 886
		var6 <<= 2; // L: 887
		var7 <<= 2; // L: 888
		var8 <<= 2; // L: 889
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) { // L: 890
			var9 = var10;
		}

		var12.field335 += var12.field332 * (var9 - var4); // L: 891
		var4 <<= 1; // L: 892
		var9 <<= 1; // L: 893

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) { // L: 894 895 915
			var13 = var1[var3--]; // L: 896
			var10001 = var4++; // L: 897
			var2[var10001] += var13 * var5;
			var5 += var7; // L: 898
			var10001 = var4++; // L: 899
			var2[var10001] += var13 * var6;
			var6 += var8; // L: 900
			var13 = var1[var3--]; // L: 901
			var10001 = var4++; // L: 902
			var2[var10001] += var13 * var5;
			var5 += var7; // L: 903
			var10001 = var4++; // L: 904
			var2[var10001] += var13 * var6;
			var6 += var8; // L: 905
			var13 = var1[var3--]; // L: 906
			var10001 = var4++; // L: 907
			var2[var10001] += var13 * var5;
			var5 += var7; // L: 908
			var10001 = var4++; // L: 909
			var2[var10001] += var13 * var6;
			var6 += var8; // L: 910
			var13 = var1[var3--]; // L: 911
			var10001 = var4++; // L: 912
			var2[var10001] += var13 * var5;
			var5 += var7; // L: 913
			var10001 = var4++; // L: 914
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) { // L: 917 918 923
			var13 = var1[var3--]; // L: 919
			var10001 = var4++; // L: 920
			var2[var10001] += var13 * var5;
			var5 += var7; // L: 921
			var10001 = var4++; // L: 922
			var2[var10001] += var13 * var6;
		}

		var12.field337 = var5 >> 2; // L: 925
		var12.field338 = var6 >> 2; // L: 926
		var12.field336 = var3 << 8; // L: 927
		return var4 >> 1; // L: 928
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILah;II)I"
	)
	static int method837(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field337 -= var11.field345 * var5; // L: 932
		var11.field338 -= var11.field346 * var5; // L: 933
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) { // L: 934
			var8 = var9;
		}

		byte var14;
		int var10001;
		while (var5 < var8) { // L: 935
			var1 = var4 >> 8; // L: 936
			var14 = var2[var1]; // L: 937
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6; // L: 938
			var6 += var7; // L: 939
			var4 += var12; // L: 940
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) { // L: 942
			var8 = var9;
		}

		for (var1 = var13; var5 < var8; var4 += var12) { // L: 943 944 948
			var14 = var2[var4 >> 8]; // L: 945
			var10001 = var5++; // L: 946
			var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7; // L: 947
		}

		var11.field337 += var11.field345 * var5; // L: 950
		var11.field338 += var11.field346 * var5; // L: 951
		var11.field335 = var6; // L: 952
		var11.field336 = var4; // L: 953
		return var5; // L: 954
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILah;II)I"
	)
	static int method838(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field335 -= var5 * var13.field332; // L: 958
		if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) { // L: 959
			var10 = var11;
		}

		var5 <<= 1; // L: 960

		byte var16;
		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) { // L: 961 962 970
			var1 = var4 >> 8; // L: 963
			var16 = var2[var1]; // L: 964
			var0 = (var16 << 8) + (var4 & 255) * (var2[var1 + 1] - var16); // L: 965
			var10001 = var5++; // L: 966
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8; // L: 967
			var10001 = var5++; // L: 968
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9; // L: 969
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) { // L: 972
			var10 = var11;
		}

		var10 <<= 1; // L: 973

		for (var1 = var15; var5 < var10; var4 += var14) { // L: 974 975 982
			var16 = var2[var4 >> 8]; // L: 976
			var0 = (var16 << 8) + (var1 - var16) * (var4 & 255); // L: 977
			var10001 = var5++; // L: 978
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8; // L: 979
			var10001 = var5++; // L: 980
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9; // L: 981
		}

		var5 >>= 1; // L: 984
		var13.field335 += var13.field332 * var5; // L: 985
		var13.field337 = var6; // L: 986
		var13.field338 = var7; // L: 987
		var13.field336 = var4; // L: 988
		return var5; // L: 989
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILah;II)I"
	)
	static int method839(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field337 -= var11.field345 * var5; // L: 993
		var11.field338 -= var11.field346 * var5; // L: 994
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) { // L: 995
			var8 = var9;
		}

		int var10001;
		while (var5 < var8) { // L: 996
			var1 = var4 >> 8; // L: 997
			byte var14 = var2[var1 - 1]; // L: 998
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6; // L: 999
			var6 += var7; // L: 1000
			var4 += var12; // L: 1001
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) { // L: 1003
			var8 = var9;
		}

		var0 = var13; // L: 1004

		for (var1 = var12; var5 < var8; var4 += var1) { // L: 1005 1006 1009
			var10001 = var5++; // L: 1007
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
			var6 += var7; // L: 1008
		}

		var11.field337 += var11.field345 * var5; // L: 1011
		var11.field338 += var11.field346 * var5; // L: 1012
		var11.field335 = var6; // L: 1013
		var11.field336 = var4; // L: 1014
		return var5; // L: 1015
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILah;II)I"
	)
	static int method840(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field335 -= var5 * var13.field332; // L: 1019
		if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) { // L: 1020
			var10 = var11;
		}

		var5 <<= 1; // L: 1021

		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) { // L: 1022 1023 1031
			var1 = var4 >> 8; // L: 1024
			byte var16 = var2[var1 - 1]; // L: 1025
			var0 = (var2[var1] - var16) * (var4 & 255) + (var16 << 8); // L: 1026
			var10001 = var5++; // L: 1027
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8; // L: 1028
			var10001 = var5++; // L: 1029
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9; // L: 1030
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) { // L: 1033
			var10 = var11;
		}

		var10 <<= 1; // L: 1034

		for (var1 = var15; var5 < var10; var4 += var14) { // L: 1035 1036 1042
			var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1); // L: 1037
			var10001 = var5++; // L: 1038
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8; // L: 1039
			var10001 = var5++; // L: 1040
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9; // L: 1041
		}

		var5 >>= 1; // L: 1044
		var13.field335 += var13.field332 * var5; // L: 1045
		var13.field337 = var6; // L: 1046
		var13.field338 = var7; // L: 1047
		var13.field336 = var4; // L: 1048
		return var5; // L: 1049
	}
}
