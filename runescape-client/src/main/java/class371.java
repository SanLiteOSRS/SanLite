import java.io.IOException;
import java.util.zip.CRC32;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oz")
public class class371 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	AbstractSocket field4323;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -988179881
	)
	int field4320;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = 3020955250564587419L
	)
	long field4340;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ltw;"
	)
	NodeHashTable field4322;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1358418643
	)
	int field4333;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ltw;"
	)
	NodeHashTable field4324;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1223039407
	)
	int field4328;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	DualNodeDeque field4326;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ltw;"
	)
	NodeHashTable field4319;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -2089805869
	)
	int field4341;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ltw;"
	)
	NodeHashTable field4329;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1260303295
	)
	int field4330;
	@ObfuscatedName("ax")
	boolean field4331;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	class369 field4332;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	Buffer field4342;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	Buffer field4334;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 553152759
	)
	int field4335;
	@ObfuscatedName("aq")
	CRC32 field4336;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	Buffer field4337;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Loh;"
	)
	Archive[] field4338;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1234441809
	)
	int field4339;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -210806841
	)
	int field4325;
	@ObfuscatedName("ag")
	byte field4321;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1596192069
	)
	public int field4343;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1084636023
	)
	public int field4327;

	public class371() {
		this.field4320 = 0; // L: 13
		this.field4322 = new NodeHashTable(4096); // L: 15
		this.field4333 = 0; // L: 16
		this.field4324 = new NodeHashTable(32); // L: 17
		this.field4328 = 0; // L: 18
		this.field4326 = new DualNodeDeque(); // L: 19
		this.field4319 = new NodeHashTable(4096); // L: 20
		this.field4341 = 0; // L: 21
		this.field4329 = new NodeHashTable(4096); // L: 22
		this.field4330 = 0; // L: 23
		this.field4342 = new Buffer(8); // L: 26
		this.field4335 = 0; // L: 28
		this.field4336 = new CRC32(); // L: 30
		this.field4338 = new Archive[256]; // L: 32
		this.field4339 = -1; // L: 33
		this.field4325 = 255; // L: 34
		this.field4321 = 0; // L: 35
		this.field4343 = 0; // L: 36
		this.field4327 = 0; // L: 37
	} // L: 39

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-63"
	)
	public boolean method7044() {
		long var1 = SpotAnimationDefinition.method3775(); // L: 42
		int var3 = (int)(var1 - this.field4340); // L: 43
		this.field4340 = var1; // L: 44
		if (var3 > 200) { // L: 45
			var3 = 200;
		}

		this.field4320 += var3; // L: 46
		if (this.field4330 == 0 && this.field4328 == 0 && this.field4341 == 0 && this.field4333 == 0) { // L: 47
			return true;
		} else if (this.field4323 == null) { // L: 48
			return false;
		} else {
			try {
				if (this.field4320 > 30000) { // L: 50
					throw new IOException();
				} else {
					class369 var4;
					Buffer var5;
					while (this.field4328 < 200 && this.field4333 > 0) { // L: 51
						var4 = (class369)this.field4322.first(); // L: 52
						var5 = new Buffer(4); // L: 53
						var5.writeByte(1); // L: 54
						var5.writeMedium((int)var4.key); // L: 55
						this.field4323.write(var5.array, 0, 4); // L: 56
						this.field4324.put(var4, var4.key); // L: 57
						--this.field4333; // L: 58
						++this.field4328; // L: 59
					}

					while (this.field4330 < 200 && this.field4341 > 0) { // L: 61
						var4 = (class369)this.field4326.removeLast(); // L: 62
						var5 = new Buffer(4); // L: 63
						var5.writeByte(0); // L: 64
						var5.writeMedium((int)var4.key); // L: 65
						this.field4323.write(var5.array, 0, 4); // L: 66
						var4.removeDual(); // L: 67
						this.field4329.put(var4, var4.key); // L: 68
						--this.field4341; // L: 69
						++this.field4330; // L: 70
					}

					for (int var16 = 0; var16 < 100; ++var16) { // L: 72
						int var17 = this.field4323.available(); // L: 73
						if (var17 < 0) { // L: 74
							throw new IOException();
						}

						if (var17 == 0) { // L: 75
							break;
						}

						this.field4320 = 0; // L: 76
						byte var6 = 0; // L: 77
						if (this.field4332 == null) { // L: 78
							var6 = 8;
						} else if (this.field4335 == 0) { // L: 79
							var6 = 1;
						}

						int var7;
						int var8;
						int var9;
						byte[] var10000;
						int var10001;
						Buffer var22;
						if (var6 > 0) { // L: 80
							var7 = var6 - this.field4342.offset; // L: 81
							if (var7 > var17) { // L: 82
								var7 = var17;
							}

							this.field4323.read(this.field4342.array, this.field4342.offset, var7); // L: 83
							if (this.field4321 != 0) { // L: 84
								for (var8 = 0; var8 < var7; ++var8) { // L: 85
									var10000 = this.field4342.array;
									var10001 = var8 + this.field4342.offset;
									var10000[var10001] ^= this.field4321;
								}
							}

							var22 = this.field4342; // L: 87
							var22.offset += var7;
							if (this.field4342.offset < var6) { // L: 88
								break;
							}

							if (this.field4332 == null) { // L: 89
								this.field4342.offset = 0; // L: 90
								var8 = this.field4342.readUnsignedByte(); // L: 91
								var9 = this.field4342.readUnsignedShort(); // L: 92
								int var10 = this.field4342.readUnsignedByte(); // L: 93
								int var11 = this.field4342.readInt(); // L: 94
								long var12 = (long)(var9 + (var8 << 16)); // L: 95
								class369 var14 = (class369)this.field4324.get(var12); // L: 96
								this.field4331 = true; // L: 97
								if (var14 == null) { // L: 98
									var14 = (class369)this.field4329.get(var12); // L: 99
									this.field4331 = false; // L: 100
								}

								if (var14 == null) { // L: 102
									throw new IOException(); // L: 103
								}

								int var15 = var10 == 0 ? 5 : 9; // L: 105
								this.field4332 = var14; // L: 106
								this.field4334 = new Buffer(this.field4332.field4295 + var11 + var15); // L: 107
								this.field4334.writeByte(var10); // L: 108
								this.field4334.writeInt(var11); // L: 109
								this.field4335 = 8; // L: 110
								this.field4342.offset = 0; // L: 111
							} else if (this.field4335 == 0) { // L: 114
								if (this.field4342.array[0] == -1) { // L: 115
									this.field4335 = 1; // L: 116
									this.field4342.offset = 0; // L: 117
								} else {
									this.field4332 = null; // L: 121
								}
							}
						} else {
							var7 = this.field4334.array.length - this.field4332.field4295; // L: 127
							var8 = 512 - this.field4335; // L: 128
							if (var8 > var7 - this.field4334.offset) { // L: 129
								var8 = var7 - this.field4334.offset;
							}

							if (var8 > var17) { // L: 130
								var8 = var17;
							}

							this.field4323.read(this.field4334.array, this.field4334.offset, var8); // L: 131
							if (this.field4321 != 0) { // L: 132
								for (var9 = 0; var9 < var8; ++var9) { // L: 133
									var10000 = this.field4334.array;
									var10001 = this.field4334.offset + var9;
									var10000[var10001] ^= this.field4321;
								}
							}

							var22 = this.field4334; // L: 135
							var22.offset += var8;
							this.field4335 += var8; // L: 136
							if (this.field4334.offset == var7) { // L: 137
								if (this.field4332.key == 16711935L) { // L: 138
									this.field4337 = this.field4334; // L: 139

									for (var9 = 0; var9 < 256; ++var9) { // L: 140
										Archive var18 = this.field4338[var9]; // L: 141
										if (var18 != null) { // L: 142
											this.method7043(var18, var9); // L: 143
										}
									}
								} else {
									this.field4336.reset(); // L: 148
									this.field4336.update(this.field4334.array, 0, var7); // L: 149
									var9 = (int)this.field4336.getValue(); // L: 150
									if (this.field4332.field4294 != var9) { // L: 151
										try {
											this.field4323.close(); // L: 153
										} catch (Exception var20) { // L: 155
										}

										++this.field4343; // L: 156
										this.field4323 = null; // L: 157
										this.field4321 = (byte)((int)(Math.random() * 255.0D + 1.0D)); // L: 158
										return false; // L: 159
									}

									this.field4343 = 0; // L: 161
									this.field4327 = 0; // L: 162
									this.field4332.field4296.write((int)(this.field4332.key & 65535L), this.field4334.array, (this.field4332.key & 16711680L) == 16711680L, this.field4331); // L: 163
								}

								this.field4332.remove(); // L: 165
								if (this.field4331) { // L: 166
									--this.field4328;
								} else {
									--this.field4330; // L: 167
								}

								this.field4335 = 0; // L: 168
								this.field4332 = null; // L: 169
								this.field4334 = null; // L: 170
							} else {
								if (this.field4335 != 512) { // L: 172
									break;
								}

								this.field4335 = 0;
							}
						}
					}

					return true; // L: 176
				}
			} catch (IOException var21) {
				try {
					this.field4323.close(); // L: 180
				} catch (Exception var19) { // L: 182
				}

				++this.field4327; // L: 183
				this.field4323 = null; // L: 184
				return false; // L: 185
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-438812293"
	)
	public void method7045(boolean var1) {
		if (this.field4323 != null) { // L: 190
			try {
				Buffer var2 = new Buffer(4); // L: 192
				var2.writeByte(var1 ? 2 : 3); // L: 193
				var2.writeMedium(0); // L: 194
				this.field4323.write(var2.array, 0, 4); // L: 195
			} catch (IOException var5) {
				try {
					this.field4323.close(); // L: 199
				} catch (Exception var4) { // L: 201
				}

				++this.field4327; // L: 202
				this.field4323 = null; // L: 203
			}

		}
	} // L: 205

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lro;ZI)V",
		garbageValue = "1047063145"
	)
	public void method7046(AbstractSocket var1, boolean var2) {
		if (this.field4323 != null) { // L: 208
			try {
				this.field4323.close(); // L: 210
			} catch (Exception var7) { // L: 212
			}

			this.field4323 = null; // L: 213
		}

		this.field4323 = var1; // L: 215
		this.method7045(var2); // L: 216
		this.field4342.offset = 0; // L: 217
		this.field4332 = null; // L: 218
		this.field4334 = null; // L: 219
		this.field4335 = 0; // L: 220

		while (true) {
			class369 var3 = (class369)this.field4324.first(); // L: 222
			if (var3 == null) { // L: 223
				while (true) {
					var3 = (class369)this.field4329.first(); // L: 229
					if (var3 == null) { // L: 230
						if (this.field4321 != 0) { // L: 236
							try {
								Buffer var8 = new Buffer(4); // L: 238
								var8.writeByte(4); // L: 239
								var8.writeByte(this.field4321); // L: 240
								var8.writeShort(0); // L: 241
								this.field4323.write(var8.array, 0, 4); // L: 242
							} catch (IOException var6) {
								try {
									this.field4323.close(); // L: 246
								} catch (Exception var5) { // L: 248
								}

								++this.field4327; // L: 249
								this.field4323 = null; // L: 250
							}
						}

						this.field4320 = 0; // L: 253
						this.field4340 = SpotAnimationDefinition.method3775(); // L: 254
						return; // L: 255
					}

					this.field4326.method7213(var3); // L: 231
					this.field4319.put(var3, var3.key); // L: 232
					++this.field4341; // L: 233
					--this.field4330; // L: 234
				}
			}

			this.field4322.put(var3, var3.key); // L: 224
			++this.field4333; // L: 225
			--this.field4328; // L: 226
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Loh;II)V",
		garbageValue = "-1796726180"
	)
	void method7047(Archive var1, int var2) {
		if (var1.field4283 && !var1.field4290) { // L: 258
			if (var2 <= this.field4339) { // L: 259
				throw new RuntimeException(""); // L: 260
			}

			if (var2 < this.field4325) { // L: 262
				this.field4325 = var2; // L: 263
			}
		} else {
			if (var2 >= this.field4325) { // L: 267
				throw new RuntimeException(""); // L: 268
			}

			if (var2 > this.field4339) { // L: 270
				this.field4339 = var2; // L: 271
			}
		}

		if (this.field4337 != null) { // L: 274
			this.method7043(var1, var2); // L: 275
		} else {
			this.method7054((Archive)null, 255, 255, 0, (byte)0, true); // L: 278
			this.field4338[var2] = var1; // L: 279
		}
	} // L: 276 280

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Loh;IB)V",
		garbageValue = "-34"
	)
	void method7043(Archive var1, int var2) {
		this.field4337.offset = var2 * 8 + 5; // L: 283
		if (this.field4337.offset >= this.field4337.array.length) { // L: 284
			if (var1.field4283) { // L: 285
				var1.method6902(); // L: 286
			} else {
				throw new RuntimeException(""); // L: 289
			}
		} else {
			int var3 = this.field4337.readInt(); // L: 291
			int var4 = this.field4337.readInt(); // L: 292
			var1.loadIndex(var3, var4); // L: 293
		}
	} // L: 287 294

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Loh;IIIBZB)V",
		garbageValue = "71"
	)
	void method7054(Archive var1, int var2, int var3, int var4, byte var5, boolean var6) {
		long var7 = (long)(var3 + (var2 << 16)); // L: 297
		class369 var9 = (class369)this.field4322.get(var7); // L: 298
		if (var9 == null) { // L: 299
			var9 = (class369)this.field4324.get(var7); // L: 300
			if (var9 == null) { // L: 301
				var9 = (class369)this.field4319.get(var7); // L: 302
				if (var9 != null) { // L: 303
					if (var6) { // L: 304
						var9.removeDual(); // L: 305
						this.field4322.put(var9, var7); // L: 306
						--this.field4341; // L: 307
						++this.field4333; // L: 308
					}

				} else {
					if (!var6) { // L: 312
						var9 = (class369)this.field4329.get(var7); // L: 313
						if (var9 != null) { // L: 314
							return;
						}
					}

					var9 = new class369(); // L: 316
					var9.field4296 = var1; // L: 317
					var9.field4294 = var4; // L: 318
					var9.field4295 = var5; // L: 319
					if (var6) { // L: 320
						this.field4322.put(var9, var7); // L: 321
						++this.field4333; // L: 322
					} else {
						this.field4326.method7215(var9); // L: 325
						this.field4319.put(var9, var7); // L: 326
						++this.field4341; // L: 327
					}

				}
			}
		}
	} // L: 310 329

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "880980368"
	)
	void method7050(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2); // L: 332
		class369 var5 = (class369)this.field4319.get(var3); // L: 333
		if (var5 != null) { // L: 334
			this.field4326.method7213(var5); // L: 335
		}
	} // L: 336

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "480276269"
	)
	int method7051(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2); // L: 339
		return this.field4332 != null && this.field4332.key == var3 ? this.field4334.offset * 99 / (this.field4334.array.length - this.field4332.field4295) + 1 : 0; // L: 340 341
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ZZB)I",
		garbageValue = "-122"
	)
	public int method7052(boolean var1, boolean var2) {
		byte var3 = 0; // L: 345
		int var4 = var3 + this.field4333 + this.field4328; // L: 346
		return var4; // L: 348
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1516647272"
	)
	public void method7049() {
		if (this.field4323 != null) { // L: 352
			this.field4323.close();
		}

	} // L: 353
}
