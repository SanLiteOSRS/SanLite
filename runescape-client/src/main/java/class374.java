import java.io.IOException;
import java.util.zip.CRC32;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oo")
public class class374 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	AbstractSocket field4341;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1124398085
	)
	int field4349;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		longValue = -6457768251632415827L
	)
	long field4342;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	NodeHashTable field4343;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -681120725
	)
	int field4365;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	NodeHashTable field4345;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 219618431
	)
	int field4346;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	DualNodeDeque field4347;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	NodeHashTable field4348;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 970560235
	)
	int field4358;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	NodeHashTable field4350;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 444442581
	)
	int field4351;
	@ObfuscatedName("ap")
	boolean field4352;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	class372 field4340;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lul;"
	)
	Buffer field4354;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lul;"
	)
	Buffer field4355;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1081663389
	)
	int field4344;
	@ObfuscatedName("ai")
	CRC32 field4353;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lul;"
	)
	Buffer field4360;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lok;"
	)
	Archive[] field4359;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 231357973
	)
	int field4361;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 35787895
	)
	int field4362;
	@ObfuscatedName("at")
	byte field4363;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 2001722695
	)
	public int field4364;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -414989845
	)
	public int field4356;

	public class374() {
		this.field4349 = 0; // L: 13
		this.field4343 = new NodeHashTable(4096); // L: 15
		this.field4365 = 0; // L: 16
		this.field4345 = new NodeHashTable(32); // L: 17
		this.field4346 = 0; // L: 18
		this.field4347 = new DualNodeDeque(); // L: 19
		this.field4348 = new NodeHashTable(4096); // L: 20
		this.field4358 = 0; // L: 21
		this.field4350 = new NodeHashTable(4096); // L: 22
		this.field4351 = 0; // L: 23
		this.field4354 = new Buffer(8); // L: 26
		this.field4344 = 0; // L: 28
		this.field4353 = new CRC32(); // L: 30
		this.field4359 = new Archive[256]; // L: 32
		this.field4361 = -1; // L: 33
		this.field4362 = 255; // L: 34
		this.field4363 = 0; // L: 35
		this.field4364 = 0; // L: 36
		this.field4356 = 0; // L: 37
	} // L: 39

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "877525740"
	)
	public boolean method7027() {
		long var1 = GrandExchangeOfferTotalQuantityComparator.method7049(); // L: 42
		int var3 = (int)(var1 - this.field4342); // L: 43
		this.field4342 = var1; // L: 44
		if (var3 > 200) { // L: 45
			var3 = 200;
		}

		this.field4349 += var3; // L: 46
		if (this.field4351 == 0 && this.field4346 == 0 && this.field4358 == 0 && this.field4365 == 0) { // L: 47
			return true;
		} else if (this.field4341 == null) { // L: 48
			return false;
		} else {
			try {
				if (this.field4349 > 30000) { // L: 50
					throw new IOException();
				} else {
					class372 var4;
					Buffer var5;
					while (this.field4346 < 200 && this.field4365 > 0) { // L: 51
						var4 = (class372)this.field4343.first(); // L: 52
						var5 = new Buffer(4); // L: 53
						var5.writeByte(1); // L: 54
						var5.writeMedium((int)var4.key); // L: 55
						this.field4341.write(var5.array, 0, 4); // L: 56
						this.field4345.put(var4, var4.key); // L: 57
						--this.field4365; // L: 58
						++this.field4346; // L: 59
					}

					while (this.field4351 < 200 && this.field4358 > 0) { // L: 61
						var4 = (class372)this.field4347.removeLast(); // L: 62
						var5 = new Buffer(4); // L: 63
						var5.writeByte(0); // L: 64
						var5.writeMedium((int)var4.key); // L: 65
						this.field4341.write(var5.array, 0, 4); // L: 66
						var4.removeDual(); // L: 67
						this.field4350.put(var4, var4.key); // L: 68
						--this.field4358; // L: 69
						++this.field4351; // L: 70
					}

					for (int var16 = 0; var16 < 100; ++var16) { // L: 72
						int var17 = this.field4341.available(); // L: 73
						if (var17 < 0) { // L: 74
							throw new IOException();
						}

						if (var17 == 0) { // L: 75
							break;
						}

						this.field4349 = 0; // L: 76
						byte var6 = 0; // L: 77
						if (this.field4340 == null) { // L: 78
							var6 = 8;
						} else if (this.field4344 == 0) { // L: 79
							var6 = 1;
						}

						int var7;
						int var8;
						int var9;
						byte[] var10000;
						int var10001;
						Buffer var22;
						if (var6 > 0) { // L: 80
							var7 = var6 - this.field4354.offset; // L: 81
							if (var7 > var17) { // L: 82
								var7 = var17;
							}

							this.field4341.read(this.field4354.array, this.field4354.offset, var7); // L: 83
							if (this.field4363 != 0) { // L: 84
								for (var8 = 0; var8 < var7; ++var8) { // L: 85
									var10000 = this.field4354.array;
									var10001 = var8 + this.field4354.offset;
									var10000[var10001] ^= this.field4363;
								}
							}

							var22 = this.field4354; // L: 87
							var22.offset += var7;
							if (this.field4354.offset < var6) { // L: 88
								break;
							}

							if (this.field4340 == null) { // L: 89
								this.field4354.offset = 0; // L: 90
								var8 = this.field4354.readUnsignedByte(); // L: 91
								var9 = this.field4354.readUnsignedShort(); // L: 92
								int var10 = this.field4354.readUnsignedByte(); // L: 93
								int var11 = this.field4354.readInt(); // L: 94
								long var12 = (long)(var9 + (var8 << 16)); // L: 95
								class372 var14 = (class372)this.field4345.get(var12); // L: 96
								this.field4352 = true; // L: 97
								if (var14 == null) { // L: 98
									var14 = (class372)this.field4350.get(var12); // L: 99
									this.field4352 = false; // L: 100
								}

								if (var14 == null) { // L: 102
									throw new IOException(); // L: 103
								}

								int var15 = var10 == 0 ? 5 : 9; // L: 105
								this.field4340 = var14; // L: 106
								this.field4355 = new Buffer(this.field4340.field4320 + var15 + var11); // L: 107
								this.field4355.writeByte(var10); // L: 108
								this.field4355.writeInt(var11); // L: 109
								this.field4344 = 8; // L: 110
								this.field4354.offset = 0; // L: 111
							} else if (this.field4344 == 0) { // L: 114
								if (this.field4354.array[0] == -1) { // L: 115
									this.field4344 = 1; // L: 116
									this.field4354.offset = 0; // L: 117
								} else {
									this.field4340 = null; // L: 121
								}
							}
						} else {
							var7 = this.field4355.array.length - this.field4340.field4320; // L: 127
							var8 = 512 - this.field4344; // L: 128
							if (var8 > var7 - this.field4355.offset) { // L: 129
								var8 = var7 - this.field4355.offset;
							}

							if (var8 > var17) { // L: 130
								var8 = var17;
							}

							this.field4341.read(this.field4355.array, this.field4355.offset, var8); // L: 131
							if (this.field4363 != 0) { // L: 132
								for (var9 = 0; var9 < var8; ++var9) { // L: 133
									var10000 = this.field4355.array;
									var10001 = var9 + this.field4355.offset;
									var10000[var10001] ^= this.field4363;
								}
							}

							var22 = this.field4355; // L: 135
							var22.offset += var8;
							this.field4344 += var8; // L: 136
							if (this.field4355.offset == var7) { // L: 137
								if (16711935L == this.field4340.key) { // L: 138
									this.field4360 = this.field4355; // L: 139

									for (var9 = 0; var9 < 256; ++var9) { // L: 140
										Archive var18 = this.field4359[var9]; // L: 141
										if (var18 != null) { // L: 142
											this.method6999(var18, var9); // L: 143
										}
									}
								} else {
									this.field4353.reset(); // L: 148
									this.field4353.update(this.field4355.array, 0, var7); // L: 149
									var9 = (int)this.field4353.getValue(); // L: 150
									if (this.field4340.field4321 != var9) { // L: 151
										try {
											this.field4341.close(); // L: 153
										} catch (Exception var20) { // L: 155
										}

										++this.field4364; // L: 156
										this.field4341 = null; // L: 157
										this.field4363 = (byte)((int)(Math.random() * 255.0D + 1.0D)); // L: 158
										return false; // L: 159
									}

									this.field4364 = 0; // L: 161
									this.field4356 = 0; // L: 162
									this.field4340.field4319.write((int)(this.field4340.key & 65535L), this.field4355.array, (this.field4340.key & 16711680L) == 16711680L, this.field4352); // L: 163
								}

								this.field4340.remove(); // L: 165
								if (this.field4352) { // L: 166
									--this.field4346;
								} else {
									--this.field4351; // L: 167
								}

								this.field4344 = 0; // L: 168
								this.field4340 = null; // L: 169
								this.field4355 = null; // L: 170
							} else {
								if (this.field4344 != 512) { // L: 172
									break;
								}

								this.field4344 = 0;
							}
						}
					}

					return true; // L: 176
				}
			} catch (IOException var21) {
				try {
					this.field4341.close(); // L: 180
				} catch (Exception var19) { // L: 182
				}

				++this.field4356; // L: 183
				this.field4341 = null; // L: 184
				return false; // L: 185
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "1"
	)
	public void method7000(boolean var1) {
		if (this.field4341 != null) { // L: 190
			try {
				Buffer var2 = new Buffer(4); // L: 192
				var2.writeByte(var1 ? 2 : 3); // L: 193
				var2.writeMedium(0); // L: 194
				this.field4341.write(var2.array, 0, 4); // L: 195
			} catch (IOException var5) {
				try {
					this.field4341.close(); // L: 199
				} catch (Exception var4) { // L: 201
				}

				++this.field4356; // L: 202
				this.field4341 = null; // L: 203
			}

		}
	} // L: 205

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lre;ZB)V",
		garbageValue = "-76"
	)
	public void method7001(AbstractSocket var1, boolean var2) {
		if (this.field4341 != null) { // L: 208
			try {
				this.field4341.close(); // L: 210
			} catch (Exception var7) { // L: 212
			}

			this.field4341 = null; // L: 213
		}

		this.field4341 = var1; // L: 215
		this.method7000(var2); // L: 216
		this.field4354.offset = 0; // L: 217
		this.field4340 = null; // L: 218
		this.field4355 = null; // L: 219
		this.field4344 = 0; // L: 220

		while (true) {
			class372 var3 = (class372)this.field4345.first(); // L: 222
			if (var3 == null) { // L: 223
				while (true) {
					var3 = (class372)this.field4350.first(); // L: 229
					if (var3 == null) { // L: 230
						if (this.field4363 != 0) { // L: 236
							try {
								Buffer var8 = new Buffer(4); // L: 238
								var8.writeByte(4); // L: 239
								var8.writeByte(this.field4363); // L: 240
								var8.writeShort(0); // L: 241
								this.field4341.write(var8.array, 0, 4); // L: 242
							} catch (IOException var6) {
								try {
									this.field4341.close(); // L: 246
								} catch (Exception var5) { // L: 248
								}

								++this.field4356; // L: 249
								this.field4341 = null; // L: 250
							}
						}

						this.field4349 = 0; // L: 253
						this.field4342 = GrandExchangeOfferTotalQuantityComparator.method7049(); // L: 254
						return; // L: 255
					}

					this.field4347.method7185(var3); // L: 231
					this.field4348.put(var3, var3.key); // L: 232
					++this.field4358; // L: 233
					--this.field4351; // L: 234
				}
			}

			this.field4343.put(var3, var3.key); // L: 224
			++this.field4365; // L: 225
			--this.field4346; // L: 226
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lok;II)V",
		garbageValue = "-699589985"
	)
	void method7002(Archive var1, int var2) {
		if (var1.field4315 && !var1.field4316) { // L: 258
			if (var2 <= this.field4361) { // L: 259
				throw new RuntimeException(""); // L: 260
			}

			if (var2 < this.field4362) { // L: 262
				this.field4362 = var2; // L: 263
			}
		} else {
			if (var2 >= this.field4362) { // L: 267
				throw new RuntimeException(""); // L: 268
			}

			if (var2 > this.field4361) { // L: 270
				this.field4361 = var2; // L: 271
			}
		}

		if (this.field4360 != null) { // L: 274
			this.method6999(var1, var2); // L: 275
		} else {
			this.method7004((Archive)null, 255, 255, 0, (byte)0, true); // L: 278
			this.field4359[var2] = var1; // L: 279
		}
	} // L: 276 280

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lok;II)V",
		garbageValue = "-1352429107"
	)
	void method6999(Archive var1, int var2) {
		this.field4360.offset = var2 * 8 + 5; // L: 283
		if (this.field4360.offset >= this.field4360.array.length) { // L: 284
			if (var1.field4315) { // L: 285
				var1.method6860(); // L: 286
			} else {
				throw new RuntimeException(""); // L: 289
			}
		} else {
			int var3 = this.field4360.readInt(); // L: 291
			int var4 = this.field4360.readInt(); // L: 292
			var1.loadIndex(var3, var4); // L: 293
		}
	} // L: 287 294

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lok;IIIBZI)V",
		garbageValue = "-1546984161"
	)
	void method7004(Archive var1, int var2, int var3, int var4, byte var5, boolean var6) {
		long var7 = (long)(var3 + (var2 << 16)); // L: 297
		class372 var9 = (class372)this.field4343.get(var7); // L: 298
		if (var9 == null) { // L: 299
			var9 = (class372)this.field4345.get(var7); // L: 300
			if (var9 == null) { // L: 301
				var9 = (class372)this.field4348.get(var7); // L: 302
				if (var9 != null) { // L: 303
					if (var6) { // L: 304
						var9.removeDual(); // L: 305
						this.field4343.put(var9, var7); // L: 306
						--this.field4358; // L: 307
						++this.field4365; // L: 308
					}

				} else {
					if (!var6) { // L: 312
						var9 = (class372)this.field4350.get(var7); // L: 313
						if (var9 != null) { // L: 314
							return;
						}
					}

					var9 = new class372(); // L: 316
					var9.field4319 = var1; // L: 317
					var9.field4321 = var4; // L: 318
					var9.field4320 = var5; // L: 319
					if (var6) { // L: 320
						this.field4343.put(var9, var7); // L: 321
						++this.field4365; // L: 322
					} else {
						this.field4347.method7184(var9); // L: 325
						this.field4348.put(var9, var7); // L: 326
						++this.field4358; // L: 327
					}

				}
			}
		}
	} // L: 310 329

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "223399065"
	)
	void method7005(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2); // L: 332
		class372 var5 = (class372)this.field4348.get(var3); // L: 333
		if (var5 != null) { // L: 334
			this.field4347.method7185(var5); // L: 335
		}
	} // L: 336

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "823173998"
	)
	int method7006(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2); // L: 339
		return this.field4340 != null && var3 == this.field4340.key ? this.field4355.offset * 99 / (this.field4355.array.length - this.field4340.field4320) + 1 : 0; // L: 340 341
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ZZB)I",
		garbageValue = "-84"
	)
	public int method7007(boolean var1, boolean var2) {
		byte var3 = 0; // L: 345
		int var4 = var3 + this.field4346 + this.field4365; // L: 346
		return var4; // L: 348
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "45"
	)
	public void method7008() {
		if (this.field4341 != null) { // L: 352
			this.field4341.close();
		}

	} // L: 353
}
