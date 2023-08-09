import java.io.IOException;
import java.util.zip.CRC32;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nq")
public class class360 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	AbstractSocket field4309;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1326278367
	)
	int field4296;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = 5111253564935352545L
	)
	long field4319;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lsm;"
	)
	NodeHashTable field4315;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1733862673
	)
	int field4310;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lsm;"
	)
	NodeHashTable field4300;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1885285113
	)
	int field4301;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	DualNodeDeque field4302;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lsm;"
	)
	NodeHashTable field4303;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 559168533
	)
	int field4304;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lsm;"
	)
	NodeHashTable field4305;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1580470631
	)
	int field4297;
	@ObfuscatedName("ah")
	boolean field4307;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	class358 field4308;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	Buffer field4299;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	Buffer field4314;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1812214555
	)
	int field4311;
	@ObfuscatedName("ad")
	CRC32 field4312;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	Buffer field4295;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lny;"
	)
	Archive[] field4306;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1132099311
	)
	int field4316;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 453148723
	)
	int field4313;
	@ObfuscatedName("af")
	byte field4317;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1233230695
	)
	public int field4318;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1207655929
	)
	public int field4298;

	public class360() {
		this.field4296 = 0; // L: 13
		this.field4315 = new NodeHashTable(4096); // L: 15
		this.field4310 = 0; // L: 16
		this.field4300 = new NodeHashTable(32); // L: 17
		this.field4301 = 0; // L: 18
		this.field4302 = new DualNodeDeque(); // L: 19
		this.field4303 = new NodeHashTable(4096); // L: 20
		this.field4304 = 0; // L: 21
		this.field4305 = new NodeHashTable(4096); // L: 22
		this.field4297 = 0; // L: 23
		this.field4299 = new Buffer(8); // L: 26
		this.field4311 = 0; // L: 28
		this.field4312 = new CRC32(); // L: 30
		this.field4306 = new Archive[256]; // L: 32
		this.field4316 = -1; // L: 33
		this.field4313 = 255; // L: 34
		this.field4317 = 0; // L: 35
		this.field4318 = 0; // L: 36
		this.field4298 = 0; // L: 37
	} // L: 39

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-1782"
	)
	public boolean method6858() {
		long var1 = class113.method2835(); // L: 42
		int var3 = (int)(var1 - this.field4319); // L: 43
		this.field4319 = var1; // L: 44
		if (var3 > 200) { // L: 45
			var3 = 200;
		}

		this.field4296 += var3; // L: 46
		if (this.field4297 == 0 && this.field4301 == 0 && this.field4304 == 0 && this.field4310 == 0) { // L: 47
			return true;
		} else if (this.field4309 == null) { // L: 48
			return false;
		} else {
			try {
				if (this.field4296 > 30000) { // L: 50
					throw new IOException();
				} else {
					class358 var4;
					Buffer var5;
					while (this.field4301 < 200 && this.field4310 > 0) { // L: 51
						var4 = (class358)this.field4315.first(); // L: 52
						var5 = new Buffer(4); // L: 53
						var5.writeByte(1); // L: 54
						var5.writeMedium((int)var4.key); // L: 55
						this.field4309.write(var5.array, 0, 4); // L: 56
						this.field4300.put(var4, var4.key); // L: 57
						--this.field4310; // L: 58
						++this.field4301; // L: 59
					}

					while (this.field4297 < 200 && this.field4304 > 0) { // L: 61
						var4 = (class358)this.field4302.removeLast(); // L: 62
						var5 = new Buffer(4); // L: 63
						var5.writeByte(0); // L: 64
						var5.writeMedium((int)var4.key); // L: 65
						this.field4309.write(var5.array, 0, 4); // L: 66
						var4.removeDual(); // L: 67
						this.field4305.put(var4, var4.key); // L: 68
						--this.field4304; // L: 69
						++this.field4297; // L: 70
					}

					for (int var16 = 0; var16 < 100; ++var16) { // L: 72
						int var17 = this.field4309.available(); // L: 73
						if (var17 < 0) { // L: 74
							throw new IOException();
						}

						if (var17 == 0) { // L: 75
							break;
						}

						this.field4296 = 0; // L: 76
						byte var6 = 0; // L: 77
						if (this.field4308 == null) { // L: 78
							var6 = 8;
						} else if (this.field4311 == 0) { // L: 79
							var6 = 1;
						}

						int var7;
						int var8;
						int var9;
						byte[] var10000;
						int var10001;
						Buffer var22;
						if (var6 > 0) { // L: 80
							var7 = var6 - this.field4299.offset; // L: 81
							if (var7 > var17) { // L: 82
								var7 = var17;
							}

							this.field4309.read(this.field4299.array, this.field4299.offset, var7); // L: 83
							if (this.field4317 != 0) { // L: 84
								for (var8 = 0; var8 < var7; ++var8) { // L: 85
									var10000 = this.field4299.array;
									var10001 = this.field4299.offset + var8;
									var10000[var10001] ^= this.field4317;
								}
							}

							var22 = this.field4299; // L: 87
							var22.offset += var7;
							if (this.field4299.offset < var6) { // L: 88
								break;
							}

							if (this.field4308 == null) { // L: 89
								this.field4299.offset = 0; // L: 90
								var8 = this.field4299.readUnsignedByte(); // L: 91
								var9 = this.field4299.readUnsignedShort(); // L: 92
								int var10 = this.field4299.readUnsignedByte(); // L: 93
								int var11 = this.field4299.readInt(); // L: 94
								long var12 = (long)(var9 + (var8 << 16)); // L: 95
								class358 var14 = (class358)this.field4300.get(var12); // L: 96
								this.field4307 = true; // L: 97
								if (var14 == null) { // L: 98
									var14 = (class358)this.field4305.get(var12); // L: 99
									this.field4307 = false; // L: 100
								}

								if (var14 == null) { // L: 102
									throw new IOException(); // L: 103
								}

								int var15 = var10 == 0 ? 5 : 9; // L: 105
								this.field4308 = var14; // L: 106
								this.field4314 = new Buffer(this.field4308.field4270 + var15 + var11); // L: 107
								this.field4314.writeByte(var10); // L: 108
								this.field4314.writeInt(var11); // L: 109
								this.field4311 = 8; // L: 110
								this.field4299.offset = 0; // L: 111
							} else if (this.field4311 == 0) { // L: 114
								if (this.field4299.array[0] == -1) { // L: 115
									this.field4311 = 1; // L: 116
									this.field4299.offset = 0; // L: 117
								} else {
									this.field4308 = null; // L: 121
								}
							}
						} else {
							var7 = this.field4314.array.length - this.field4308.field4270; // L: 127
							var8 = 512 - this.field4311; // L: 128
							if (var8 > var7 - this.field4314.offset) { // L: 129
								var8 = var7 - this.field4314.offset;
							}

							if (var8 > var17) { // L: 130
								var8 = var17;
							}

							this.field4309.read(this.field4314.array, this.field4314.offset, var8); // L: 131
							if (this.field4317 != 0) { // L: 132
								for (var9 = 0; var9 < var8; ++var9) { // L: 133
									var10000 = this.field4314.array;
									var10001 = var9 + this.field4314.offset;
									var10000[var10001] ^= this.field4317;
								}
							}

							var22 = this.field4314; // L: 135
							var22.offset += var8;
							this.field4311 += var8; // L: 136
							if (this.field4314.offset == var7) { // L: 137
								if (this.field4308.key == 16711935L) { // L: 138
									this.field4295 = this.field4314; // L: 139

									for (var9 = 0; var9 < 256; ++var9) { // L: 140
										Archive var18 = this.field4306[var9]; // L: 141
										if (var18 != null) { // L: 142
											this.method6862(var18, var9); // L: 143
										}
									}
								} else {
									this.field4312.reset(); // L: 148
									this.field4312.update(this.field4314.array, 0, var7); // L: 149
									var9 = (int)this.field4312.getValue(); // L: 150
									if (this.field4308.field4271 != var9) { // L: 151
										try {
											this.field4309.close(); // L: 153
										} catch (Exception var20) { // L: 155
										}

										++this.field4318; // L: 156
										this.field4309 = null; // L: 157
										this.field4317 = (byte)((int)(Math.random() * 255.0D + 1.0D)); // L: 158
										return false; // L: 159
									}

									this.field4318 = 0; // L: 161
									this.field4298 = 0; // L: 162
									this.field4308.field4272.write((int)(this.field4308.key & 65535L), this.field4314.array, (this.field4308.key & 16711680L) == 16711680L, this.field4307); // L: 163
								}

								this.field4308.remove(); // L: 165
								if (this.field4307) { // L: 166
									--this.field4301;
								} else {
									--this.field4297; // L: 167
								}

								this.field4311 = 0; // L: 168
								this.field4308 = null; // L: 169
								this.field4314 = null; // L: 170
							} else {
								if (this.field4311 != 512) { // L: 172
									break;
								}

								this.field4311 = 0;
							}
						}
					}

					return true; // L: 176
				}
			} catch (IOException var21) {
				try {
					this.field4309.close(); // L: 180
				} catch (Exception var19) { // L: 182
				}

				++this.field4298; // L: 183
				this.field4309 = null; // L: 184
				return false; // L: 185
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-89"
	)
	public void method6845(boolean var1) {
		if (this.field4309 != null) { // L: 190
			try {
				Buffer var2 = new Buffer(4); // L: 192
				var2.writeByte(var1 ? 2 : 3); // L: 193
				var2.writeMedium(0); // L: 194
				this.field4309.write(var2.array, 0, 4); // L: 195
			} catch (IOException var5) {
				try {
					this.field4309.close(); // L: 199
				} catch (Exception var4) { // L: 201
				}

				++this.field4298; // L: 202
				this.field4309 = null; // L: 203
			}

		}
	} // L: 205

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lqh;ZB)V",
		garbageValue = "64"
	)
	public void method6846(AbstractSocket var1, boolean var2) {
		if (this.field4309 != null) { // L: 208
			try {
				this.field4309.close(); // L: 210
			} catch (Exception var7) { // L: 212
			}

			this.field4309 = null; // L: 213
		}

		this.field4309 = var1; // L: 215
		this.method6845(var2); // L: 216
		this.field4299.offset = 0; // L: 217
		this.field4308 = null; // L: 218
		this.field4314 = null; // L: 219
		this.field4311 = 0; // L: 220

		while (true) {
			class358 var3 = (class358)this.field4300.first(); // L: 222
			if (var3 == null) { // L: 223
				while (true) {
					var3 = (class358)this.field4305.first(); // L: 229
					if (var3 == null) { // L: 230
						if (this.field4317 != 0) { // L: 236
							try {
								Buffer var8 = new Buffer(4); // L: 238
								var8.writeByte(4); // L: 239
								var8.writeByte(this.field4317); // L: 240
								var8.writeShort(0); // L: 241
								this.field4309.write(var8.array, 0, 4); // L: 242
							} catch (IOException var6) {
								try {
									this.field4309.close(); // L: 246
								} catch (Exception var5) { // L: 248
								}

								++this.field4298; // L: 249
								this.field4309 = null; // L: 250
							}
						}

						this.field4296 = 0; // L: 253
						this.field4319 = class113.method2835(); // L: 254
						return; // L: 255
					}

					this.field4302.method7016(var3); // L: 231
					this.field4303.put(var3, var3.key); // L: 232
					++this.field4304; // L: 233
					--this.field4297; // L: 234
				}
			}

			this.field4315.put(var3, var3.key); // L: 224
			++this.field4310; // L: 225
			--this.field4301; // L: 226
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lny;II)V",
		garbageValue = "-830735706"
	)
	void method6874(Archive var1, int var2) {
		if (var1.field4267) { // L: 258
			if (var2 <= this.field4316) { // L: 259
				throw new RuntimeException(""); // L: 260
			}

			if (var2 < this.field4313) { // L: 262
				this.field4313 = var2; // L: 263
			}
		} else {
			if (var2 >= this.field4313) { // L: 267
				throw new RuntimeException(""); // L: 268
			}

			if (var2 > this.field4316) { // L: 270
				this.field4316 = var2; // L: 271
			}
		}

		if (this.field4295 != null) { // L: 274
			this.method6862(var1, var2); // L: 275
		} else {
			this.method6849((Archive)null, 255, 255, 0, (byte)0, true); // L: 278
			this.field4306[var2] = var1; // L: 279
		}
	} // L: 276 280

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lny;IB)V",
		garbageValue = "5"
	)
	void method6862(Archive var1, int var2) {
		this.field4295.offset = var2 * 8 + 5; // L: 283
		if (this.field4295.offset >= this.field4295.array.length) { // L: 284
			if (var1.field4267) { // L: 285
				var1.method6703(); // L: 286
			} else {
				throw new RuntimeException(""); // L: 289
			}
		} else {
			int var3 = this.field4295.readInt(); // L: 291
			int var4 = this.field4295.readInt(); // L: 292
			var1.loadIndex(var3, var4); // L: 293
		}
	} // L: 287 294

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lny;IIIBZI)V",
		garbageValue = "-1002085673"
	)
	void method6849(Archive var1, int var2, int var3, int var4, byte var5, boolean var6) {
		long var7 = (long)(var3 + (var2 << 16)); // L: 297
		class358 var9 = (class358)this.field4315.get(var7); // L: 298
		if (var9 == null) { // L: 299
			var9 = (class358)this.field4300.get(var7); // L: 300
			if (var9 == null) { // L: 301
				var9 = (class358)this.field4303.get(var7); // L: 302
				if (var9 != null) { // L: 303
					if (var6) { // L: 304
						var9.removeDual(); // L: 305
						this.field4315.put(var9, var7); // L: 306
						--this.field4304; // L: 307
						++this.field4310; // L: 308
					}

				} else {
					if (!var6) { // L: 312
						var9 = (class358)this.field4305.get(var7); // L: 313
						if (var9 != null) { // L: 314
							return;
						}
					}

					var9 = new class358(); // L: 316
					var9.field4272 = var1; // L: 317
					var9.field4271 = var4; // L: 318
					var9.field4270 = var5; // L: 319
					if (var6) { // L: 320
						this.field4315.put(var9, var7); // L: 321
						++this.field4310; // L: 322
					} else {
						this.field4302.method7015(var9); // L: 325
						this.field4303.put(var9, var7); // L: 326
						++this.field4304; // L: 327
					}

				}
			}
		}
	} // L: 310 329

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2091914027"
	)
	void method6850(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2); // L: 332
		class358 var5 = (class358)this.field4303.get(var3); // L: 333
		if (var5 != null) { // L: 334
			this.field4302.method7016(var5); // L: 335
		}
	} // L: 336

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "106"
	)
	int method6851(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2); // L: 339
		return this.field4308 != null && this.field4308.key == var3 ? this.field4314.offset * 99 / (this.field4314.array.length - this.field4308.field4270) + 1 : 0; // L: 340 341
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ZZI)I",
		garbageValue = "-988136504"
	)
	public int method6852(boolean var1, boolean var2) {
		byte var3 = 0; // L: 345
		int var4 = var3 + this.field4310 + this.field4301; // L: 346
		return var4; // L: 347
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-102"
	)
	public void method6853() {
		if (this.field4309 != null) { // L: 352
			this.field4309.close();
		}

	} // L: 353
}
