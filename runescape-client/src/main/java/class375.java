import java.io.IOException;
import java.util.zip.CRC32;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("or")
public class class375 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lri;"
	)
	AbstractSocket field4376;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 590881255
	)
	int field4375;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = -2566440090942884179L
	)
	long field4380;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lts;"
	)
	NodeHashTable field4392;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 517844601
	)
	int field4378;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lts;"
	)
	NodeHashTable field4379;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 647263993
	)
	int field4390;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	DualNodeDeque field4381;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lts;"
	)
	NodeHashTable field4382;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -540887497
	)
	int field4374;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lts;"
	)
	NodeHashTable field4384;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -270507287
	)
	int field4385;
	@ObfuscatedName("ad")
	boolean field4386;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	class373 field4387;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	Buffer field4395;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	Buffer field4389;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -50585685
	)
	int field4388;
	@ObfuscatedName("ay")
	CRC32 field4399;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	Buffer field4393;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Loz;"
	)
	Archive[] field4394;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -783422919
	)
	int field4383;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 763904105
	)
	int field4396;
	@ObfuscatedName("ac")
	byte field4397;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 345416301
	)
	public int field4377;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1860121777
	)
	public int field4398;

	public class375() {
		this.field4375 = 0; // L: 13
		this.field4392 = new NodeHashTable(4096); // L: 15
		this.field4378 = 0; // L: 16
		this.field4379 = new NodeHashTable(32); // L: 17
		this.field4390 = 0; // L: 18
		this.field4381 = new DualNodeDeque(); // L: 19
		this.field4382 = new NodeHashTable(4096); // L: 20
		this.field4374 = 0; // L: 21
		this.field4384 = new NodeHashTable(4096); // L: 22
		this.field4385 = 0; // L: 23
		this.field4395 = new Buffer(8); // L: 26
		this.field4388 = 0; // L: 28
		this.field4399 = new CRC32(); // L: 30
		this.field4394 = new Archive[256]; // L: 32
		this.field4383 = -1; // L: 33
		this.field4396 = 255; // L: 34
		this.field4397 = 0; // L: 35
		this.field4377 = 0; // L: 36
		this.field4398 = 0; // L: 37
	} // L: 39

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1661624624"
	)
	public boolean method7139() {
		long var1 = UserComparator9.method2973(); // L: 42
		int var3 = (int)(var1 - this.field4380); // L: 43
		this.field4380 = var1; // L: 44
		if (var3 > 200) { // L: 45
			var3 = 200;
		}

		this.field4375 += var3; // L: 46
		if (this.field4385 == 0 && this.field4390 == 0 && this.field4374 == 0 && this.field4378 == 0) { // L: 47
			return true;
		} else if (this.field4376 == null) { // L: 48
			return false;
		} else {
			try {
				if (this.field4375 > 30000) { // L: 50
					throw new IOException();
				} else {
					class373 var4;
					Buffer var5;
					while (this.field4390 < 200 && this.field4378 > 0) { // L: 51
						var4 = (class373)this.field4392.first(); // L: 52
						var5 = new Buffer(4); // L: 53
						var5.writeByte(1); // L: 54
						var5.writeMedium((int)var4.key); // L: 55
						this.field4376.write(var5.array, 0, 4); // L: 56
						this.field4379.put(var4, var4.key); // L: 57
						--this.field4378; // L: 58
						++this.field4390; // L: 59
					}

					while (this.field4385 < 200 && this.field4374 > 0) { // L: 61
						var4 = (class373)this.field4381.removeLast(); // L: 62
						var5 = new Buffer(4); // L: 63
						var5.writeByte(0); // L: 64
						var5.writeMedium((int)var4.key); // L: 65
						this.field4376.write(var5.array, 0, 4); // L: 66
						var4.removeDual(); // L: 67
						this.field4384.put(var4, var4.key); // L: 68
						--this.field4374; // L: 69
						++this.field4385; // L: 70
					}

					for (int var16 = 0; var16 < 100; ++var16) { // L: 72
						int var17 = this.field4376.available(); // L: 73
						if (var17 < 0) { // L: 74
							throw new IOException();
						}

						if (var17 == 0) { // L: 75
							break;
						}

						this.field4375 = 0; // L: 76
						byte var6 = 0; // L: 77
						if (this.field4387 == null) { // L: 78
							var6 = 8;
						} else if (this.field4388 == 0) { // L: 79
							var6 = 1;
						}

						int var7;
						int var8;
						int var9;
						byte[] var10000;
						int var10001;
						Buffer var22;
						if (var6 > 0) { // L: 80
							var7 = var6 - this.field4395.offset; // L: 81
							if (var7 > var17) { // L: 82
								var7 = var17;
							}

							this.field4376.read(this.field4395.array, this.field4395.offset, var7); // L: 83
							if (this.field4397 != 0) { // L: 84
								for (var8 = 0; var8 < var7; ++var8) { // L: 85
									var10000 = this.field4395.array;
									var10001 = var8 + this.field4395.offset;
									var10000[var10001] ^= this.field4397;
								}
							}

							var22 = this.field4395; // L: 87
							var22.offset += var7;
							if (this.field4395.offset < var6) { // L: 88
								break;
							}

							if (this.field4387 == null) { // L: 89
								this.field4395.offset = 0; // L: 90
								var8 = this.field4395.readUnsignedByte(); // L: 91
								var9 = this.field4395.readUnsignedShort(); // L: 92
								int var10 = this.field4395.readUnsignedByte(); // L: 93
								int var11 = this.field4395.readInt(); // L: 94
								long var12 = (long)(var9 + (var8 << 16)); // L: 95
								class373 var14 = (class373)this.field4379.get(var12); // L: 96
								this.field4386 = true; // L: 97
								if (var14 == null) { // L: 98
									var14 = (class373)this.field4384.get(var12); // L: 99
									this.field4386 = false; // L: 100
								}

								if (var14 == null) { // L: 102
									throw new IOException(); // L: 103
								}

								int var15 = var10 == 0 ? 5 : 9; // L: 105
								this.field4387 = var14; // L: 106
								this.field4389 = new Buffer(this.field4387.field4353 + var11 + var15); // L: 107
								this.field4389.writeByte(var10); // L: 108
								this.field4389.method9373(var11); // L: 109
								this.field4388 = 8; // L: 110
								this.field4395.offset = 0; // L: 111
							} else if (this.field4388 == 0) { // L: 114
								if (this.field4395.array[0] == -1) { // L: 115
									this.field4388 = 1; // L: 116
									this.field4395.offset = 0; // L: 117
								} else {
									this.field4387 = null; // L: 121
								}
							}
						} else {
							var7 = this.field4389.array.length - this.field4387.field4353; // L: 127
							var8 = 512 - this.field4388; // L: 128
							if (var8 > var7 - this.field4389.offset) { // L: 129
								var8 = var7 - this.field4389.offset;
							}

							if (var8 > var17) { // L: 130
								var8 = var17;
							}

							this.field4376.read(this.field4389.array, this.field4389.offset, var8); // L: 131
							if (this.field4397 != 0) { // L: 132
								for (var9 = 0; var9 < var8; ++var9) { // L: 133
									var10000 = this.field4389.array;
									var10001 = this.field4389.offset + var9;
									var10000[var10001] ^= this.field4397;
								}
							}

							var22 = this.field4389; // L: 135
							var22.offset += var8;
							this.field4388 += var8; // L: 136
							if (this.field4389.offset == var7) { // L: 137
								if (this.field4387.key == 16711935L) { // L: 138
									this.field4393 = this.field4389; // L: 139

									for (var9 = 0; var9 < 256; ++var9) { // L: 140
										Archive var18 = this.field4394[var9]; // L: 141
										if (var18 != null) { // L: 142
											this.method7129(var18, var9); // L: 143
										}
									}
								} else {
									this.field4399.reset(); // L: 148
									this.field4399.update(this.field4389.array, 0, var7); // L: 149
									var9 = (int)this.field4399.getValue(); // L: 150
									if (this.field4387.field4354 != var9) { // L: 151
										try {
											this.field4376.close(); // L: 153
										} catch (Exception var20) { // L: 155
										}

										++this.field4377; // L: 156
										this.field4376 = null; // L: 157
										this.field4397 = (byte)((int)(Math.random() * 255.0D + 1.0D)); // L: 158
										return false; // L: 159
									}

									this.field4377 = 0; // L: 161
									this.field4398 = 0; // L: 162
									this.field4387.field4352.write((int)(this.field4387.key & 65535L), this.field4389.array, 16711680L == (this.field4387.key & 16711680L), this.field4386); // L: 163
								}

								this.field4387.remove(); // L: 165
								if (this.field4386) { // L: 166
									--this.field4390;
								} else {
									--this.field4385; // L: 167
								}

								this.field4388 = 0; // L: 168
								this.field4387 = null; // L: 169
								this.field4389 = null; // L: 170
							} else {
								if (this.field4388 != 512) { // L: 172
									break;
								}

								this.field4388 = 0;
							}
						}
					}

					return true; // L: 176
				}
			} catch (IOException var21) {
				try {
					this.field4376.close(); // L: 180
				} catch (Exception var19) { // L: 182
				}

				++this.field4398; // L: 183
				this.field4376 = null; // L: 184
				return false; // L: 185
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-115"
	)
	public void method7126(boolean var1) {
		if (this.field4376 != null) { // L: 190
			try {
				Buffer var2 = new Buffer(4); // L: 192
				var2.writeByte(var1 ? 2 : 3); // L: 193
				var2.writeMedium(0); // L: 194
				this.field4376.write(var2.array, 0, 4); // L: 195
			} catch (IOException var5) {
				try {
					this.field4376.close(); // L: 199
				} catch (Exception var4) { // L: 201
				}

				++this.field4398; // L: 202
				this.field4376 = null; // L: 203
			}

		}
	} // L: 205

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lri;ZB)V",
		garbageValue = "-117"
	)
	public void method7127(AbstractSocket var1, boolean var2) {
		if (this.field4376 != null) { // L: 208
			try {
				this.field4376.close(); // L: 210
			} catch (Exception var7) { // L: 212
			}

			this.field4376 = null; // L: 213
		}

		this.field4376 = var1; // L: 215
		this.method7126(var2); // L: 216
		this.field4395.offset = 0; // L: 217
		this.field4387 = null; // L: 218
		this.field4389 = null; // L: 219
		this.field4388 = 0; // L: 220

		while (true) {
			class373 var3 = (class373)this.field4379.first(); // L: 222
			if (var3 == null) { // L: 223
				while (true) {
					var3 = (class373)this.field4384.first(); // L: 229
					if (var3 == null) { // L: 230
						if (this.field4397 != 0) { // L: 236
							try {
								Buffer var8 = new Buffer(4); // L: 238
								var8.writeByte(4); // L: 239
								var8.writeByte(this.field4397); // L: 240
								var8.writeShort(0); // L: 241
								this.field4376.write(var8.array, 0, 4); // L: 242
							} catch (IOException var6) {
								try {
									this.field4376.close(); // L: 246
								} catch (Exception var5) { // L: 248
								}

								++this.field4398; // L: 249
								this.field4376 = null; // L: 250
							}
						}

						this.field4375 = 0; // L: 253
						this.field4380 = UserComparator9.method2973(); // L: 254
						return; // L: 255
					}

					this.field4381.method7309(var3); // L: 231
					this.field4382.put(var3, var3.key); // L: 232
					++this.field4374; // L: 233
					--this.field4385; // L: 234
				}
			}

			this.field4392.put(var3, var3.key); // L: 224
			++this.field4378; // L: 225
			--this.field4390; // L: 226
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Loz;II)V",
		garbageValue = "-664243707"
	)
	void method7125(Archive var1, int var2) {
		if (var1.field4348 && !var1.field4349) { // L: 258
			if (var2 <= this.field4383) { // L: 259
				throw new RuntimeException(""); // L: 260
			}

			if (var2 < this.field4396) { // L: 262
				this.field4396 = var2; // L: 263
			}
		} else {
			if (var2 >= this.field4396) { // L: 267
				throw new RuntimeException(""); // L: 268
			}

			if (var2 > this.field4383) { // L: 270
				this.field4383 = var2; // L: 271
			}
		}

		if (this.field4393 != null) { // L: 274
			this.method7129(var1, var2); // L: 275
		} else {
			this.method7136((Archive)null, 255, 255, 0, (byte)0, true); // L: 278
			this.field4394[var2] = var1; // L: 279
		}
	} // L: 276 280

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Loz;II)V",
		garbageValue = "-6662946"
	)
	void method7129(Archive var1, int var2) {
		this.field4393.offset = var2 * 8 + 5; // L: 283
		if (this.field4393.offset >= this.field4393.array.length) { // L: 284
			if (var1.field4348) { // L: 285
				var1.method7014(); // L: 286
			} else {
				throw new RuntimeException(""); // L: 289
			}
		} else {
			int var3 = this.field4393.readInt(); // L: 291
			int var4 = this.field4393.readInt(); // L: 292
			var1.loadIndex(var3, var4); // L: 293
		}
	} // L: 287 294

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Loz;IIIBZB)V",
		garbageValue = "-21"
	)
	void method7136(Archive var1, int var2, int var3, int var4, byte var5, boolean var6) {
		long var7 = (long)(var3 + (var2 << 16)); // L: 297
		class373 var9 = (class373)this.field4392.get(var7); // L: 298
		if (var9 == null) { // L: 299
			var9 = (class373)this.field4379.get(var7); // L: 300
			if (var9 == null) { // L: 301
				var9 = (class373)this.field4382.get(var7); // L: 302
				if (var9 != null) { // L: 303
					if (var6) { // L: 304
						var9.removeDual(); // L: 305
						this.field4392.put(var9, var7); // L: 306
						--this.field4374; // L: 307
						++this.field4378; // L: 308
					}

				} else {
					if (!var6) { // L: 312
						var9 = (class373)this.field4384.get(var7); // L: 313
						if (var9 != null) { // L: 314
							return;
						}
					}

					var9 = new class373(); // L: 316
					var9.field4352 = var1; // L: 317
					var9.field4354 = var4; // L: 318
					var9.field4353 = var5; // L: 319
					if (var6) { // L: 320
						this.field4392.put(var9, var7); // L: 321
						++this.field4378; // L: 322
					} else {
						this.field4381.method7310(var9); // L: 325
						this.field4382.put(var9, var7); // L: 326
						++this.field4374; // L: 327
					}

				}
			}
		}
	} // L: 310 329

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "18001"
	)
	void method7133(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2); // L: 332
		class373 var5 = (class373)this.field4382.get(var3); // L: 333
		if (var5 != null) { // L: 334
			this.field4381.method7309(var5); // L: 335
		}
	} // L: 336

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "986043639"
	)
	int method7132(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2); // L: 339
		return this.field4387 != null && var3 == this.field4387.key ? this.field4389.offset * 99 / (this.field4389.array.length - this.field4387.field4353) + 1 : 0; // L: 340 341
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ZZB)I",
		garbageValue = "37"
	)
	public int method7146(boolean var1, boolean var2) {
		byte var3 = 0; // L: 345
		int var4 = var3 + this.field4390 + this.field4378; // L: 346
		return var4; // L: 347
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "12032"
	)
	public void method7134() {
		if (this.field4376 != null) { // L: 352
			this.field4376.close();
		}

	} // L: 353
}
