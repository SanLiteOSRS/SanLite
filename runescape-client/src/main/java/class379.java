import java.io.IOException;
import java.util.zip.CRC32;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ow")
public class class379 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lrq;"
	)
	AbstractSocket field4433;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1829934123
	)
	int field4437;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 6443011435548712151L
	)
	long field4438;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	NodeHashTable field4436;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1857331349
	)
	int field4430;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	NodeHashTable field4444;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1536710015
	)
	int field4434;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	DualNodeDeque field4454;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	NodeHashTable field4441;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1728128561
	)
	int field4442;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	NodeHashTable field4443;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1722370453
	)
	int field4440;
	@ObfuscatedName("ay")
	boolean field4445;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	class377 field4446;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	Buffer field4447;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	Buffer field4448;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 314684017
	)
	int field4449;
	@ObfuscatedName("ac")
	CRC32 field4450;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	Buffer field4451;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Lov;"
	)
	Archive[] field4452;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1898360451
	)
	int field4453;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 863131193
	)
	int field4439;
	@ObfuscatedName("bc")
	byte field4455;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -694316703
	)
	public int field4456;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1140025679
	)
	public int field4457;

	public class379() {
		this.field4437 = 0; // L: 19
		this.field4436 = new NodeHashTable(4096); // L: 21
		this.field4430 = 0; // L: 22
		this.field4444 = new NodeHashTable(32); // L: 23
		this.field4434 = 0; // L: 24
		this.field4454 = new DualNodeDeque(); // L: 25
		this.field4441 = new NodeHashTable(4096); // L: 26
		this.field4442 = 0; // L: 27
		this.field4443 = new NodeHashTable(4096); // L: 28
		this.field4440 = 0; // L: 29
		this.field4447 = new Buffer(8); // L: 32
		this.field4449 = 0; // L: 34
		this.field4450 = new CRC32(); // L: 36
		this.field4452 = new Archive[256]; // L: 38
		this.field4453 = -1; // L: 39
		this.field4439 = 255; // L: 40
		this.field4455 = 0; // L: 41
		this.field4456 = 0; // L: 42
		this.field4457 = 0; // L: 43
	} // L: 45

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1001268301"
	)
	public boolean method7050() {
		long var1 = VerticalAlignment.method3924(); // L: 48
		int var3 = (int)(var1 - this.field4438); // L: 49
		this.field4438 = var1; // L: 50
		if (var3 > 200) { // L: 51
			var3 = 200;
		}

		this.field4437 += var3; // L: 52
		if (this.field4440 == 0 && this.field4434 == 0 && this.field4442 == 0 && this.field4430 == 0) { // L: 53
			return true;
		} else if (this.field4433 == null) { // L: 54
			return false;
		} else {
			try {
				if (this.field4437 > 30000) { // L: 56
					throw new IOException();
				} else {
					class377 var4;
					Buffer var5;
					while (this.field4434 < 200 && this.field4430 > 0) { // L: 57
						var4 = (class377)this.field4436.first(); // L: 58
						var5 = new Buffer(4); // L: 59
						var5.writeByte(1); // L: 60
						var5.writeMedium((int)var4.key); // L: 61
						this.field4433.write(var5.array, 0, 4); // L: 62
						this.field4444.put(var4, var4.key); // L: 63
						--this.field4430; // L: 64
						++this.field4434; // L: 65
					}

					while (this.field4440 < 200 && this.field4442 > 0) { // L: 67
						var4 = (class377)this.field4454.removeLast(); // L: 68
						var5 = new Buffer(4); // L: 69
						var5.writeByte(0); // L: 70
						var5.writeMedium((int)var4.key);
						this.field4433.write(var5.array, 0, 4);
						var4.removeDual();
						this.field4443.put(var4, var4.key);
						--this.field4442;
						++this.field4440;
					}

					for (int var16 = 0; var16 < 100; ++var16) {
						int var17 = this.field4433.vmethod8271();
						if (var17 < 0) { // L: 80
							throw new IOException();
						}

						if (var17 == 0) {
							break;
						}

						this.field4437 = 0;
						byte var6 = 0;
						if (this.field4446 == null) {
							var6 = 8;
						} else if (this.field4449 == 0) {
							var6 = 1;
						}

						int var7;
						int var8;
						int var9;
						byte[] var10000;
						int var10001;
						Buffer var22;
						if (var6 > 0) {
							var7 = var6 - this.field4447.offset;
							if (var7 > var17) {
								var7 = var17;
							}

							this.field4433.read(this.field4447.array, this.field4447.offset, var7);
							if (this.field4455 != 0) {
								for (var8 = 0; var8 < var7; ++var8) {
									var10000 = this.field4447.array;
									var10001 = var8 + this.field4447.offset;
									var10000[var10001] ^= this.field4455;
								}
							}

							var22 = this.field4447;
							var22.offset += var7;
							if (this.field4447.offset < var6) {
								break;
							}

							if (this.field4446 == null) {
								this.field4447.offset = 0; // L: 96
								var8 = this.field4447.readUnsignedByte(); // L: 97
								var9 = this.field4447.readUnsignedShort(); // L: 98
								int var10 = this.field4447.readUnsignedByte(); // L: 99
								int var11 = this.field4447.readInt(); // L: 100
								long var12 = (long)(var9 + (var8 << 16)); // L: 101
								class377 var14 = (class377)this.field4444.get(var12); // L: 102
								this.field4445 = true; // L: 103
								if (var14 == null) { // L: 104
									var14 = (class377)this.field4443.get(var12); // L: 105
									this.field4445 = false; // L: 106
								}

								if (var14 == null) { // L: 108
									throw new IOException(); // L: 109
								}

								int var15 = var10 == 0 ? 5 : 9; // L: 111
								this.field4446 = var14; // L: 112
								this.field4448 = new Buffer(this.field4446.field4410 + var11 + var15); // L: 113
								this.field4448.writeByte(var10); // L: 114
								this.field4448.writeIntME(var11); // L: 115
								this.field4449 = 8; // L: 116
								this.field4447.offset = 0; // L: 117
							} else if (this.field4449 == 0) { // L: 120
								if (this.field4447.array[0] == -1) { // L: 121
									this.field4449 = 1; // L: 122
									this.field4447.offset = 0; // L: 123
								} else {
									this.field4446 = null; // L: 127
								}
							}
						} else {
							var7 = this.field4448.array.length - this.field4446.field4410; // L: 133
							var8 = 512 - this.field4449; // L: 134
							if (var8 > var7 - this.field4448.offset) { // L: 135
								var8 = var7 - this.field4448.offset;
							}

							if (var8 > var17) { // L: 136
								var8 = var17;
							}

							this.field4433.read(this.field4448.array, this.field4448.offset, var8); // L: 137
							if (this.field4455 != 0) { // L: 138
								for (var9 = 0; var9 < var8; ++var9) { // L: 139
									var10000 = this.field4448.array;
									var10001 = this.field4448.offset + var9;
									var10000[var10001] ^= this.field4455;
								}
							}

							var22 = this.field4448; // L: 141
							var22.offset += var8;
							this.field4449 += var8; // L: 142
							if (this.field4448.offset == var7) { // L: 143
								if (this.field4446.key == 16711935L) { // L: 144
									this.field4451 = this.field4448; // L: 145

									for (var9 = 0; var9 < 256; ++var9) { // L: 146
										Archive var18 = this.field4452[var9]; // L: 147
										if (var18 != null) { // L: 148
											this.method7055(var18, var9); // L: 149
										}
									}
								} else {
									this.field4450.reset(); // L: 154
									this.field4450.update(this.field4448.array, 0, var7); // L: 155
									var9 = (int)this.field4450.getValue(); // L: 156
									if (this.field4446.field4409 != var9) { // L: 157
										try {
											this.field4433.close(); // L: 159
										} catch (Exception var20) { // L: 161
										}

										++this.field4456; // L: 162
										this.field4433 = null; // L: 163
										this.field4455 = (byte)((int)(Math.random() * 255.0D + 1.0D)); // L: 164
										return false; // L: 165
									}

									this.field4456 = 0; // L: 167
									this.field4457 = 0; // L: 168
									this.field4446.field4411.write((int)(this.field4446.key & 65535L), this.field4448.array, (this.field4446.key & 16711680L) == 16711680L, this.field4445); // L: 169
								}

								this.field4446.remove(); // L: 171
								if (this.field4445) { // L: 172
									--this.field4434;
								} else {
									--this.field4440; // L: 173
								}

								this.field4449 = 0; // L: 174
								this.field4446 = null; // L: 175
								this.field4448 = null; // L: 176
							} else {
								if (this.field4449 != 512) { // L: 178
									break;
								}

								this.field4449 = 0;
							}
						}
					}

					return true; // L: 182
				}
			} catch (IOException var21) {
				try {
					this.field4433.close(); // L: 186
				} catch (Exception var19) { // L: 188
				}

				++this.field4457; // L: 189
				this.field4433 = null; // L: 190
				return false; // L: 191
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "496042186"
	)
	public void method7052(boolean var1) {
		if (this.field4433 != null) { // L: 196
			try {
				Buffer var2 = new Buffer(4); // L: 198
				var2.writeByte(var1 ? 2 : 3); // L: 199
				var2.writeMedium(0); // L: 200
				this.field4433.write(var2.array, 0, 4); // L: 201
			} catch (IOException var5) {
				try {
					this.field4433.close(); // L: 205
				} catch (Exception var4) { // L: 207
				}

				++this.field4457; // L: 208
				this.field4433 = null; // L: 209
			}

		}
	} // L: 211

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lrq;ZB)V",
		garbageValue = "-65"
	)
	public void method7053(AbstractSocket var1, boolean var2) {
		if (this.field4433 != null) { // L: 214
			try {
				this.field4433.close(); // L: 216
			} catch (Exception var7) { // L: 218
			}

			this.field4433 = null; // L: 219
		}

		this.field4433 = var1; // L: 221
		this.method7052(var2); // L: 222
		this.field4447.offset = 0; // L: 223
		this.field4446 = null; // L: 224
		this.field4448 = null; // L: 225
		this.field4449 = 0; // L: 226

		while (true) {
			class377 var3 = (class377)this.field4444.first(); // L: 228
			if (var3 == null) { // L: 229
				while (true) {
					var3 = (class377)this.field4443.first(); // L: 235
					if (var3 == null) { // L: 236
						if (this.field4455 != 0) { // L: 242
							try {
								Buffer var8 = new Buffer(4); // L: 244
								var8.writeByte(4); // L: 245
								var8.writeByte(this.field4455); // L: 246
								var8.writeShort(0); // L: 247
								this.field4433.write(var8.array, 0, 4); // L: 248
							} catch (IOException var6) {
								try {
									this.field4433.close(); // L: 252
								} catch (Exception var5) { // L: 254
								}

								++this.field4457; // L: 255
								this.field4433 = null; // L: 256
							}
						}

						this.field4437 = 0; // L: 259
						this.field4438 = VerticalAlignment.method3924(); // L: 260
						return; // L: 261
					}

					this.field4454.method7215(var3); // L: 237
					this.field4441.put(var3, var3.key); // L: 238
					++this.field4442; // L: 239
					--this.field4440; // L: 240
				}
			}

			this.field4436.put(var3, var3.key); // L: 230
			++this.field4430; // L: 231
			--this.field4434; // L: 232
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lov;II)V",
		garbageValue = "-695664096"
	)
	void method7051(Archive var1, int var2) {
		if (var1.field4380 && !var1.field4381) { // L: 264
			if (var2 <= this.field4453) { // L: 265
				throw new RuntimeException(""); // L: 266
			}

			if (var2 < this.field4439) { // L: 268
				this.field4439 = var2; // L: 269
			}
		} else {
			if (var2 >= this.field4439) { // L: 273
				throw new RuntimeException(""); // L: 274
			}

			if (var2 > this.field4453) { // L: 276
				this.field4453 = var2; // L: 277
			}
		}

		if (this.field4451 != null) { // L: 280
			this.method7055(var1, var2); // L: 281
		} else {
			this.method7056((Archive)null, class376.field4389.field4407, 255, 0, (byte)0, true); // L: 284
			this.field4452[var2] = var1; // L: 285
		}
	} // L: 282 286

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lov;IS)V",
		garbageValue = "321"
	)
	void method7055(Archive var1, int var2) {
		this.field4451.offset = var2 * 8 + 5; // L: 289
		if (this.field4451.offset >= this.field4451.array.length) { // L: 290
			if (var1.field4380) { // L: 291
				var1.method6941(); // L: 292
			} else {
				throw new RuntimeException(""); // L: 295
			}
		} else {
			int var3 = this.field4451.readInt(); // L: 297
			int var4 = this.field4451.readInt(); // L: 298
			var1.loadIndex(var3, var4); // L: 299
		}
	} // L: 293 300

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lov;IIIBZI)V",
		garbageValue = "-1005831971"
	)
	void method7056(Archive var1, int var2, int var3, int var4, byte var5, boolean var6) {
		long var7 = (long)(var3 + (var2 << 16)); // L: 303
		class377 var9 = (class377)this.field4436.get(var7); // L: 304
		if (var9 == null) { // L: 305
			var9 = (class377)this.field4444.get(var7); // L: 306
			if (var9 == null) { // L: 307
				var9 = (class377)this.field4441.get(var7); // L: 308
				if (var9 != null) { // L: 309
					if (var6) { // L: 310
						var9.removeDual(); // L: 311
						this.field4436.put(var9, var7); // L: 312
						--this.field4442; // L: 313
						++this.field4430; // L: 314
					}

				} else {
					if (!var6) { // L: 318
						var9 = (class377)this.field4443.get(var7); // L: 319
						if (var9 != null) { // L: 320
							return;
						}
					}

					var9 = new class377(); // L: 322
					var9.field4411 = var1; // L: 323
					var9.field4409 = var4; // L: 324
					var9.field4410 = var5; // L: 325
					if (var6) { // L: 326
						this.field4436.put(var9, var7); // L: 327
						++this.field4430; // L: 328
					} else {
						this.field4454.method7212(var9); // L: 331
						this.field4441.put(var9, var7); // L: 332
						++this.field4442; // L: 333
					}

				}
			}
		}
	} // L: 316 335

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "411398064"
	)
	void method7057(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2); // L: 338
		class377 var5 = (class377)this.field4441.get(var3); // L: 339
		if (var5 != null) { // L: 340
			this.field4454.method7215(var5); // L: 341
		}
	} // L: 342

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1209863367"
	)
	int method7058(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2); // L: 345
		return this.field4446 != null && var3 == this.field4446.key ? this.field4448.offset * 99 / (this.field4448.array.length - this.field4446.field4410) + 1 : 0; // L: 346 347
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ZZI)I",
		garbageValue = "-1156290683"
	)
	public int method7059(boolean var1, boolean var2) {
		byte var3 = 0; // L: 351
		int var4 = var3 + this.field4434 + this.field4430; // L: 352
		return var4; // L: 353
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-242564343"
	)
	public void method7078() {
		if (this.field4433 != null) { // L: 358
			try {
				this.field4433.close(); // L: 360
			} catch (Exception var2) { // L: 362
			}

			this.field4433 = null; // L: 363
		}

	} // L: 365

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIILis;IB)V",
		garbageValue = "59"
	)
	static void method7069(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound(); // L: 71
		var5.plane = var0; // L: 72
		var5.x = var1 * 128; // L: 73
		var5.y = var2 * 128; // L: 74
		int var6 = var3.sizeX; // L: 75
		int var7 = var3.sizeY; // L: 76
		if (var4 == 1 || var4 == 3) { // L: 77
			var6 = var3.sizeY; // L: 78
			var7 = var3.sizeX; // L: 79
		}

		var5.maxX = (var6 + var1) * 128; // L: 81
		var5.maxY = (var7 + var2) * 128; // L: 82
		var5.soundEffectId = var3.ambientSoundId; // L: 83
		var5.field846 = var3.int7 * 16384; // L: 84
		var5.field847 = Math.max(var3.field2296 * 16384 - 128, 0); // L: 85
		var5.field841 = var3.int6; // L: 86
		var5.field854 = var3.field2294; // L: 87
		var5.field852 = var3.soundEffectIds; // L: 88
		if (var3.transforms != null) { // L: 89
			var5.obj = var3; // L: 90
			var5.set(); // L: 91
		}

		ObjectSound.objectSounds.addFirst(var5); // L: 93
		if (var5.field852 != null) { // L: 94
			var5.field843 = var5.field841 + (int)(Math.random() * (double)(var5.field854 - var5.field841));
		}

	} // L: 95
}
