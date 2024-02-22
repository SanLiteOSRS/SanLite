import java.io.IOException;
import java.util.zip.CRC32;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ot")
public class class378 {
	@ObfuscatedName("ia")
	@ObfuscatedGetter(
		intValue = 533169709
	)
	static int field4434;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lrr;"
	)
	AbstractSocket field4409;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 185234751
	)
	int field4410;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = 1041861590998961167L
	)
	long field4411;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	NodeHashTable field4407;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1866097039
	)
	int field4413;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	NodeHashTable field4414;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -429867019
	)
	int field4415;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	DualNodeDeque field4419;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	NodeHashTable field4417;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1322847467
	)
	int field4418;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	NodeHashTable field4423;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -692620981
	)
	int field4428;
	@ObfuscatedName("am")
	boolean field4431;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	class376 field4422;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	Buffer field4421;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	Buffer field4424;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1041918623
	)
	int field4425;
	@ObfuscatedName("ab")
	CRC32 field4426;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	Buffer field4427;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lom;"
	)
	Archive[] field4412;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -671057713
	)
	int field4429;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 547118089
	)
	int field4430;
	@ObfuscatedName("bd")
	byte field4420;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 288994003
	)
	public int field4416;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1534428973
	)
	public int field4433;

	public class378() {
		this.field4410 = 0; // L: 18
		this.field4407 = new NodeHashTable(4096); // L: 20
		this.field4413 = 0; // L: 21
		this.field4414 = new NodeHashTable(32); // L: 22
		this.field4415 = 0; // L: 23
		this.field4419 = new DualNodeDeque(); // L: 24
		this.field4417 = new NodeHashTable(4096); // L: 25
		this.field4418 = 0; // L: 26
		this.field4423 = new NodeHashTable(4096); // L: 27
		this.field4428 = 0; // L: 28
		this.field4421 = new Buffer(8); // L: 31
		this.field4425 = 0; // L: 33
		this.field4426 = new CRC32(); // L: 35
		this.field4412 = new Archive[256]; // L: 37
		this.field4429 = -1; // L: 38
		this.field4430 = 255; // L: 39
		this.field4420 = 0; // L: 40
		this.field4416 = 0; // L: 41
		this.field4433 = 0; // L: 42
	} // L: 44

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1381298903"
	)
	public boolean method7210() {
		long var1 = SecureRandomCallable.method2320(); // L: 47
		int var3 = (int)(var1 - this.field4411); // L: 48
		this.field4411 = var1; // L: 49
		if (var3 > 200) { // L: 50
			var3 = 200;
		}

		this.field4410 += var3; // L: 51
		if (this.field4428 == 0 && this.field4415 == 0 && this.field4418 == 0 && this.field4413 == 0) { // L: 52
			return true;
		} else if (this.field4409 == null) { // L: 53
			return false;
		} else {
			try {
				if (this.field4410 > 30000) { // L: 55
					throw new IOException();
				} else {
					class376 var4;
					Buffer var5;
					while (this.field4415 < 200 && this.field4413 > 0) { // L: 56
						var4 = (class376)this.field4407.first(); // L: 57
						var5 = new Buffer(4); // L: 58
						var5.writeByte(1); // L: 59
						var5.writeMedium((int)var4.key); // L: 60
						this.field4409.write(var5.array, 0, 4); // L: 61
						this.field4414.put(var4, var4.key); // L: 62
						--this.field4413; // L: 63
						++this.field4415; // L: 64
					}

					while (this.field4428 < 200 && this.field4418 > 0) { // L: 66
						var4 = (class376)this.field4419.removeLast(); // L: 67
						var5 = new Buffer(4); // L: 68
						var5.writeByte(0); // L: 69
						var5.writeMedium((int)var4.key); // L: 70
						this.field4409.write(var5.array, 0, 4); // L: 71
						var4.removeDual(); // L: 72
						this.field4423.put(var4, var4.key); // L: 73
						--this.field4418; // L: 74
						++this.field4428; // L: 75
					}

					for (int var16 = 0; var16 < 100; ++var16) { // L: 77
						int var17 = this.field4409.vmethod8476(); // L: 78
						if (var17 < 0) { // L: 79
							throw new IOException();
						}

						if (var17 == 0) { // L: 80
							break;
						}

						this.field4410 = 0; // L: 81
						byte var6 = 0; // L: 82
						if (this.field4422 == null) { // L: 83
							var6 = 8;
						} else if (this.field4425 == 0) { // L: 84
							var6 = 1;
						}

						int var7;
						int var8;
						int var9;
						byte[] var10000;
						int var10001;
						Buffer var22;
						if (var6 > 0) { // L: 85
							var7 = var6 - this.field4421.offset; // L: 86
							if (var7 > var17) { // L: 87
								var7 = var17;
							}

							this.field4409.read(this.field4421.array, this.field4421.offset, var7); // L: 88
							if (this.field4420 != 0) { // L: 89
								for (var8 = 0; var8 < var7; ++var8) { // L: 90
									var10000 = this.field4421.array;
									var10001 = var8 + this.field4421.offset;
									var10000[var10001] ^= this.field4420;
								}
							}

							var22 = this.field4421; // L: 92
							var22.offset += var7;
							if (this.field4421.offset < var6) { // L: 93
								break;
							}

							if (this.field4422 == null) { // L: 94
								this.field4421.offset = 0; // L: 95
								var8 = this.field4421.readUnsignedByte(); // L: 96
								var9 = this.field4421.readUnsignedShort(); // L: 97
								int var10 = this.field4421.readUnsignedByte(); // L: 98
								int var11 = this.field4421.readInt(); // L: 99
								long var12 = (long)(var9 + (var8 << 16)); // L: 100
								class376 var14 = (class376)this.field4414.get(var12); // L: 101
								this.field4431 = true; // L: 102
								if (var14 == null) { // L: 103
									var14 = (class376)this.field4423.get(var12); // L: 104
									this.field4431 = false; // L: 105
								}

								if (var14 == null) { // L: 107
									throw new IOException(); // L: 108
								}

								int var15 = var10 == 0 ? 5 : 9; // L: 110
								this.field4422 = var14; // L: 111
								this.field4424 = new Buffer(this.field4422.field4386 + var11 + var15); // L: 112
								this.field4424.writeByte(var10); // L: 113
								this.field4424.writeInt(var11); // L: 114
								this.field4425 = 8; // L: 115
								this.field4421.offset = 0; // L: 116
							} else if (this.field4425 == 0) { // L: 119
								if (this.field4421.array[0] == -1) { // L: 120
									this.field4425 = 1; // L: 121
									this.field4421.offset = 0; // L: 122
								} else {
									this.field4422 = null; // L: 126
								}
							}
						} else {
							var7 = this.field4424.array.length - this.field4422.field4386; // L: 132
							var8 = 512 - this.field4425; // L: 133
							if (var8 > var7 - this.field4424.offset) { // L: 134
								var8 = var7 - this.field4424.offset;
							}

							if (var8 > var17) { // L: 135
								var8 = var17;
							}

							this.field4409.read(this.field4424.array, this.field4424.offset, var8); // L: 136
							if (this.field4420 != 0) { // L: 137
								for (var9 = 0; var9 < var8; ++var9) { // L: 138
									var10000 = this.field4424.array;
									var10001 = this.field4424.offset + var9;
									var10000[var10001] ^= this.field4420;
								}
							}

							var22 = this.field4424; // L: 140
							var22.offset += var8;
							this.field4425 += var8; // L: 141
							if (this.field4424.offset == var7) { // L: 142
								if (16711935L == this.field4422.key) { // L: 143
									this.field4427 = this.field4424; // L: 144

									for (var9 = 0; var9 < 256; ++var9) { // L: 145
										Archive var18 = this.field4412[var9]; // L: 146
										if (var18 != null) { // L: 147
											this.method7214(var18, var9); // L: 148
										}
									}
								} else {
									this.field4426.reset(); // L: 153
									this.field4426.update(this.field4424.array, 0, var7); // L: 154
									var9 = (int)this.field4426.getValue(); // L: 155
									if (this.field4422.field4384 != var9) { // L: 156
										try {
											this.field4409.close(); // L: 158
										} catch (Exception var20) { // L: 160
										}

										++this.field4416; // L: 161
										this.field4409 = null; // L: 162
										this.field4420 = (byte)((int)(Math.random() * 255.0D + 1.0D)); // L: 163
										return false; // L: 164
									}

									this.field4416 = 0; // L: 166
									this.field4433 = 0; // L: 167
									this.field4422.field4385.write((int)(this.field4422.key & 65535L), this.field4424.array, 16711680L == (this.field4422.key & 16711680L), this.field4431); // L: 168
								}

								this.field4422.remove(); // L: 170
								if (this.field4431) { // L: 171
									--this.field4415;
								} else {
									--this.field4428; // L: 172
								}

								this.field4425 = 0; // L: 173
								this.field4422 = null; // L: 174
								this.field4424 = null; // L: 175
							} else {
								if (this.field4425 != 512) { // L: 177
									break;
								}

								this.field4425 = 0;
							}
						}
					}

					return true; // L: 181
				}
			} catch (IOException var21) {
				try {
					this.field4409.close(); // L: 185
				} catch (Exception var19) { // L: 187
				}

				++this.field4433; // L: 188
				this.field4409 = null; // L: 189
				return false; // L: 190
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "3"
	)
	public void method7212(boolean var1) {
		if (this.field4409 != null) { // L: 195
			try {
				Buffer var2 = new Buffer(4); // L: 197
				var2.writeByte(var1 ? 2 : 3); // L: 198
				var2.writeMedium(0); // L: 199
				this.field4409.write(var2.array, 0, 4); // L: 200
			} catch (IOException var5) {
				try {
					this.field4409.close(); // L: 204
				} catch (Exception var4) { // L: 206
				}

				++this.field4433; // L: 207
				this.field4409 = null; // L: 208
			}

		}
	} // L: 210

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lrr;ZI)V",
		garbageValue = "1973212289"
	)
	public void method7218(AbstractSocket var1, boolean var2) {
		if (this.field4409 != null) { // L: 213
			try {
				this.field4409.close(); // L: 215
			} catch (Exception var7) { // L: 217
			}

			this.field4409 = null; // L: 218
		}

		this.field4409 = var1; // L: 220
		this.method7212(var2); // L: 221
		this.field4421.offset = 0; // L: 222
		this.field4422 = null; // L: 223
		this.field4424 = null; // L: 224
		this.field4425 = 0; // L: 225

		while (true) {
			class376 var3 = (class376)this.field4414.first(); // L: 227
			if (var3 == null) { // L: 228
				while (true) {
					var3 = (class376)this.field4423.first(); // L: 234
					if (var3 == null) { // L: 235
						if (this.field4420 != 0) { // L: 241
							try {
								Buffer var8 = new Buffer(4); // L: 243
								var8.writeByte(4); // L: 244
								var8.writeByte(this.field4420); // L: 245
								var8.writeShort(0); // L: 246
								this.field4409.write(var8.array, 0, 4); // L: 247
							} catch (IOException var6) {
								try {
									this.field4409.close(); // L: 251
								} catch (Exception var5) { // L: 253
								}

								++this.field4433; // L: 254
								this.field4409 = null; // L: 255
							}
						}

						this.field4410 = 0; // L: 258
						this.field4411 = SecureRandomCallable.method2320(); // L: 259
						return; // L: 260
					}

					this.field4419.method7381(var3); // L: 236
					this.field4417.put(var3, var3.key); // L: 237
					++this.field4418; // L: 238
					--this.field4428; // L: 239
				}
			}

			this.field4407.put(var3, var3.key); // L: 229
			++this.field4413; // L: 230
			--this.field4415; // L: 231
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lom;IB)V",
		garbageValue = "-50"
	)
	void method7225(Archive var1, int var2) {
		if (var1.field4382 && !var1.field4381) { // L: 263
			if (var2 <= this.field4429) { // L: 264
				throw new RuntimeException(""); // L: 265
			}

			if (var2 < this.field4430) { // L: 267
				this.field4430 = var2; // L: 268
			}
		} else {
			if (var2 >= this.field4430) { // L: 272
				throw new RuntimeException(""); // L: 273
			}

			if (var2 > this.field4429) { // L: 275
				this.field4429 = var2; // L: 276
			}
		}

		if (this.field4427 != null) { // L: 279
			this.method7214(var1, var2); // L: 280
		} else {
			this.method7220((Archive)null, 255, 255, 0, (byte)0, true); // L: 283
			this.field4412[var2] = var1; // L: 284
		}
	} // L: 281 285

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lom;II)V",
		garbageValue = "1747803025"
	)
	void method7214(Archive var1, int var2) {
		this.field4427.offset = var2 * 8 + 5; // L: 288
		if (this.field4427.offset >= this.field4427.array.length) { // L: 289
			if (var1.field4382) { // L: 290
				var1.method7053(); // L: 291
			} else {
				throw new RuntimeException(""); // L: 294
			}
		} else {
			int var3 = this.field4427.readInt(); // L: 296
			int var4 = this.field4427.readInt(); // L: 297
			var1.loadIndex(var3, var4); // L: 298
		}
	} // L: 292 299

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lom;IIIBZS)V",
		garbageValue = "-12032"
	)
	void method7220(Archive var1, int var2, int var3, int var4, byte var5, boolean var6) {
		long var7 = (long)(var3 + (var2 << 16)); // L: 302
		class376 var9 = (class376)this.field4407.get(var7); // L: 303
		if (var9 == null) { // L: 304
			var9 = (class376)this.field4414.get(var7); // L: 305
			if (var9 == null) { // L: 306
				var9 = (class376)this.field4417.get(var7); // L: 307
				if (var9 != null) { // L: 308
					if (var6) { // L: 309
						var9.removeDual(); // L: 310
						this.field4407.put(var9, var7); // L: 311
						--this.field4418; // L: 312
						++this.field4413; // L: 313
					}

				} else {
					if (!var6) { // L: 317
						var9 = (class376)this.field4423.get(var7); // L: 318
						if (var9 != null) { // L: 319
							return;
						}
					}

					var9 = new class376(); // L: 321
					var9.field4385 = var1; // L: 322
					var9.field4384 = var4; // L: 323
					var9.field4386 = var5; // L: 324
					if (var6) { // L: 325
						this.field4407.put(var9, var7); // L: 326
						++this.field4413; // L: 327
					} else {
						this.field4419.method7379(var9); // L: 330
						this.field4417.put(var9, var7); // L: 331
						++this.field4418; // L: 332
					}

				}
			}
		}
	} // L: 315 334

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1602227051"
	)
	void method7216(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2); // L: 337
		class376 var5 = (class376)this.field4417.get(var3); // L: 338
		if (var5 != null) { // L: 339
			this.field4419.method7381(var5); // L: 340
		}
	} // L: 341

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-725249284"
	)
	int method7217(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2); // L: 344
		return this.field4422 != null && this.field4422.key == var3 ? this.field4424.offset * 99 / (this.field4424.array.length - this.field4422.field4386) + 1 : 0; // L: 345 346
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ZZI)I",
		garbageValue = "1411825896"
	)
	public int method7211(boolean var1, boolean var2) {
		byte var3 = 0; // L: 350
		int var4 = var3 + this.field4413 + this.field4415; // L: 351
		return var4; // L: 352
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2003230890"
	)
	public void method7213() {
		if (this.field4409 != null) { // L: 357
			try {
				this.field4409.close(); // L: 359
			} catch (Exception var2) { // L: 361
			}

			this.field4409 = null; // L: 362
		}

	} // L: 364

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-35"
	)
	static int method7241(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field890 - 7.0D) * 256.0D); // L: 4465
	}
}
