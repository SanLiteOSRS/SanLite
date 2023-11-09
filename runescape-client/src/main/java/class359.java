import java.io.IOException;
import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nw")
public class class359 {
	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	AbstractSocket field4292;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 572363853
	)
	int field4303;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -5761016970145054035L
	)
	long field4287;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	NodeHashTable field4281;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1771230875
	)
	int field4282;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	NodeHashTable field4280;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -755170975
	)
	int field4284;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	DualNodeDeque field4302;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	NodeHashTable field4286;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1655693351
	)
	int field4294;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	NodeHashTable field4288;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1034299597
	)
	int field4289;
	@ObfuscatedName("as")
	boolean field4290;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	class357 field4278;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	Buffer field4291;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	Buffer field4293;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -300772489
	)
	int field4285;
	@ObfuscatedName("at")
	CRC32 field4295;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	Buffer field4296;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lng;"
	)
	Archive[] field4297;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -775373011
	)
	int field4298;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1605691887
	)
	int field4283;
	@ObfuscatedName("ah")
	byte field4300;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -298533487
	)
	public int field4301;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1647738725
	)
	public int field4299;

	public class359() {
		this.field4303 = 0; // L: 13
		this.field4281 = new NodeHashTable(4096); // L: 15
		this.field4282 = 0; // L: 16
		this.field4280 = new NodeHashTable(32); // L: 17
		this.field4284 = 0; // L: 18
		this.field4302 = new DualNodeDeque(); // L: 19
		this.field4286 = new NodeHashTable(4096); // L: 20
		this.field4294 = 0; // L: 21
		this.field4288 = new NodeHashTable(4096); // L: 22
		this.field4289 = 0; // L: 23
		this.field4291 = new Buffer(8); // L: 26
		this.field4285 = 0; // L: 28
		this.field4295 = new CRC32(); // L: 30
		this.field4297 = new Archive[256]; // L: 32
		this.field4298 = -1; // L: 33
		this.field4283 = 255; // L: 34
		this.field4300 = 0; // L: 35
		this.field4301 = 0; // L: 36
		this.field4299 = 0; // L: 37
	} // L: 39

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "213688007"
	)
	public boolean method6878() {
		long var1 = AttackOption.method2714(); // L: 42
		int var3 = (int)(var1 - this.field4287); // L: 43
		this.field4287 = var1; // L: 44
		if (var3 > 200) { // L: 45
			var3 = 200;
		}

		this.field4303 += var3; // L: 46
		if (this.field4289 == 0 && this.field4284 == 0 && this.field4294 == 0 && this.field4282 == 0) { // L: 47
			return true;
		} else if (this.field4292 == null) { // L: 48
			return false;
		} else {
			try {
				if (this.field4303 > 30000) { // L: 50
					throw new IOException();
				} else {
					class357 var4;
					Buffer var5;
					while (this.field4284 < 200 && this.field4282 > 0) { // L: 51
						var4 = (class357)this.field4281.first(); // L: 52
						var5 = new Buffer(4); // L: 53
						var5.writeByte(1); // L: 54
						var5.writeMedium((int)var4.key); // L: 55
						this.field4292.write(var5.array, 0, 4); // L: 56
						this.field4280.put(var4, var4.key); // L: 57
						--this.field4282; // L: 58
						++this.field4284; // L: 59
					}

					while (this.field4289 < 200 && this.field4294 > 0) { // L: 61
						var4 = (class357)this.field4302.removeLast(); // L: 62
						var5 = new Buffer(4); // L: 63
						var5.writeByte(0); // L: 64
						var5.writeMedium((int)var4.key); // L: 65
						this.field4292.write(var5.array, 0, 4); // L: 66
						var4.removeDual(); // L: 67
						this.field4288.put(var4, var4.key); // L: 68
						--this.field4294; // L: 69
						++this.field4289; // L: 70
					}

					for (int var16 = 0; var16 < 100; ++var16) { // L: 72
						int var17 = this.field4292.available(); // L: 73
						if (var17 < 0) { // L: 74
							throw new IOException();
						}

						if (var17 == 0) { // L: 75
							break;
						}

						this.field4303 = 0; // L: 76
						byte var6 = 0; // L: 77
						if (this.field4278 == null) { // L: 78
							var6 = 8;
						} else if (this.field4285 == 0) { // L: 79
							var6 = 1;
						}

						int var7;
						int var8;
						int var9;
						byte[] var10000;
						int var10001;
						Buffer var22;
						if (var6 > 0) { // L: 80
							var7 = var6 - this.field4291.offset; // L: 81
							if (var7 > var17) { // L: 82
								var7 = var17;
							}

							this.field4292.read(this.field4291.array, this.field4291.offset, var7); // L: 83
							if (this.field4300 != 0) { // L: 84
								for (var8 = 0; var8 < var7; ++var8) { // L: 85
									var10000 = this.field4291.array;
									var10001 = this.field4291.offset + var8;
									var10000[var10001] ^= this.field4300;
								}
							}

							var22 = this.field4291; // L: 87
							var22.offset += var7;
							if (this.field4291.offset < var6) { // L: 88
								break;
							}

							if (this.field4278 == null) { // L: 89
								this.field4291.offset = 0; // L: 90
								var8 = this.field4291.readUnsignedByte(); // L: 91
								var9 = this.field4291.readUnsignedShort(); // L: 92
								int var10 = this.field4291.readUnsignedByte(); // L: 93
								int var11 = this.field4291.readInt(); // L: 94
								long var12 = (long)(var9 + (var8 << 16)); // L: 95
								class357 var14 = (class357)this.field4280.get(var12); // L: 96
								this.field4290 = true; // L: 97
								if (var14 == null) { // L: 98
									var14 = (class357)this.field4288.get(var12); // L: 99
									this.field4290 = false; // L: 100
								}

								if (var14 == null) { // L: 102
									throw new IOException(); // L: 103
								}

								int var15 = var10 == 0 ? 5 : 9; // L: 105
								this.field4278 = var14; // L: 106
								this.field4293 = new Buffer(this.field4278.field4260 + var11 + var15); // L: 107
								this.field4293.writeByte(var10); // L: 108
								this.field4293.writeInt(var11); // L: 109
								this.field4285 = 8; // L: 110
								this.field4291.offset = 0; // L: 111
							} else if (this.field4285 == 0) { // L: 114
								if (this.field4291.array[0] == -1) { // L: 115
									this.field4285 = 1; // L: 116
									this.field4291.offset = 0; // L: 117
								} else {
									this.field4278 = null; // L: 121
								}
							}
						} else {
							var7 = this.field4293.array.length - this.field4278.field4260; // L: 127
							var8 = 512 - this.field4285; // L: 128
							if (var8 > var7 - this.field4293.offset) { // L: 129
								var8 = var7 - this.field4293.offset;
							}

							if (var8 > var17) { // L: 130
								var8 = var17;
							}

							this.field4292.read(this.field4293.array, this.field4293.offset, var8); // L: 131
							if (this.field4300 != 0) { // L: 132
								for (var9 = 0; var9 < var8; ++var9) { // L: 133
									var10000 = this.field4293.array;
									var10001 = this.field4293.offset + var9;
									var10000[var10001] ^= this.field4300;
								}
							}

							var22 = this.field4293; // L: 135
							var22.offset += var8;
							this.field4285 += var8; // L: 136
							if (this.field4293.offset == var7) { // L: 137
								if (this.field4278.key == 16711935L) { // L: 138
									this.field4296 = this.field4293; // L: 139

									for (var9 = 0; var9 < 256; ++var9) { // L: 140
										Archive var18 = this.field4297[var9]; // L: 141
										if (var18 != null) { // L: 142
											this.method6865(var18, var9); // L: 143
										}
									}
								} else {
									this.field4295.reset(); // L: 148
									this.field4295.update(this.field4293.array, 0, var7); // L: 149
									var9 = (int)this.field4295.getValue(); // L: 150
									if (this.field4278.field4259 != var9) { // L: 151
										try {
											this.field4292.close(); // L: 153
										} catch (Exception var20) { // L: 155
										}

										++this.field4301; // L: 156
										this.field4292 = null; // L: 157
										this.field4300 = (byte)((int)(Math.random() * 255.0D + 1.0D)); // L: 158
										return false; // L: 159
									}

									this.field4301 = 0; // L: 161
									this.field4299 = 0; // L: 162
									this.field4278.field4258.write((int)(this.field4278.key & 65535L), this.field4293.array, 16711680L == (this.field4278.key & 16711680L), this.field4290); // L: 163
								}

								this.field4278.remove(); // L: 165
								if (this.field4290) { // L: 166
									--this.field4284;
								} else {
									--this.field4289; // L: 167
								}

								this.field4285 = 0; // L: 168
								this.field4278 = null; // L: 169
								this.field4293 = null; // L: 170
							} else {
								if (this.field4285 != 512) { // L: 172
									break;
								}

								this.field4285 = 0;
							}
						}
					}

					return true; // L: 176
				}
			} catch (IOException var21) {
				try {
					this.field4292.close(); // L: 180
				} catch (Exception var19) { // L: 182
				}

				++this.field4299; // L: 183
				this.field4292 = null; // L: 184
				return false; // L: 185
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1173571079"
	)
	public void method6861(boolean var1) {
		if (this.field4292 != null) { // L: 190
			try {
				Buffer var2 = new Buffer(4); // L: 192
				var2.writeByte(var1 ? 2 : 3); // L: 193
				var2.writeMedium(0); // L: 194
				this.field4292.write(var2.array, 0, 4); // L: 195
			} catch (IOException var5) {
				try {
					this.field4292.close(); // L: 199
				} catch (Exception var4) { // L: 201
				}

				++this.field4299; // L: 202
				this.field4292 = null; // L: 203
			}

		}
	} // L: 205

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lqg;ZB)V",
		garbageValue = "40"
	)
	public void method6863(AbstractSocket var1, boolean var2) {
		if (this.field4292 != null) { // L: 208
			try {
				this.field4292.close(); // L: 210
			} catch (Exception var7) { // L: 212
			}

			this.field4292 = null; // L: 213
		}

		this.field4292 = var1; // L: 215
		this.method6861(var2); // L: 216
		this.field4291.offset = 0; // L: 217
		this.field4278 = null; // L: 218
		this.field4293 = null; // L: 219
		this.field4285 = 0; // L: 220

		while (true) {
			class357 var3 = (class357)this.field4280.first(); // L: 222
			if (var3 == null) { // L: 223
				while (true) {
					var3 = (class357)this.field4288.first(); // L: 229
					if (var3 == null) { // L: 230
						if (this.field4300 != 0) { // L: 236
							try {
								Buffer var8 = new Buffer(4); // L: 238
								var8.writeByte(4); // L: 239
								var8.writeByte(this.field4300); // L: 240
								var8.writeShort(0); // L: 241
								this.field4292.write(var8.array, 0, 4); // L: 242
							} catch (IOException var6) {
								try {
									this.field4292.close(); // L: 246
								} catch (Exception var5) { // L: 248
								}

								++this.field4299; // L: 249
								this.field4292 = null; // L: 250
							}
						}

						this.field4303 = 0; // L: 253
						this.field4287 = AttackOption.method2714(); // L: 254
						return; // L: 255
					}

					this.field4302.method7033(var3); // L: 231
					this.field4286.put(var3, var3.key); // L: 232
					++this.field4294; // L: 233
					--this.field4289; // L: 234
				}
			}

			this.field4281.put(var3, var3.key); // L: 224
			++this.field4282; // L: 225
			--this.field4284; // L: 226
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lng;IB)V",
		garbageValue = "118"
	)
	void method6900(Archive var1, int var2) {
		if (var1.field4256) { // L: 258
			if (var2 <= this.field4298) { // L: 259
				throw new RuntimeException(""); // L: 260
			}

			if (var2 < this.field4283) { // L: 262
				this.field4283 = var2; // L: 263
			}
		} else {
			if (var2 >= this.field4283) { // L: 267
				throw new RuntimeException(""); // L: 268
			}

			if (var2 > this.field4298) { // L: 270
				this.field4298 = var2; // L: 271
			}
		}

		if (this.field4296 != null) { // L: 274
			this.method6865(var1, var2); // L: 275
		} else {
			this.method6866((Archive)null, 255, 255, 0, (byte)0, true); // L: 278
			this.field4297[var2] = var1; // L: 279
		}
	} // L: 276 280

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lng;IB)V",
		garbageValue = "0"
	)
	void method6865(Archive var1, int var2) {
		this.field4296.offset = var2 * 8 + 5; // L: 283
		if (this.field4296.offset >= this.field4296.array.length) { // L: 284
			if (var1.field4256) { // L: 285
				var1.method6747(); // L: 286
			} else {
				throw new RuntimeException(""); // L: 289
			}
		} else {
			int var3 = this.field4296.readInt(); // L: 291
			int var4 = this.field4296.readInt(); // L: 292
			var1.loadIndex(var3, var4); // L: 293
		}
	} // L: 287 294

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lng;IIIBZB)V",
		garbageValue = "17"
	)
	void method6866(Archive var1, int var2, int var3, int var4, byte var5, boolean var6) {
		long var7 = (long)(var3 + (var2 << 16)); // L: 297
		class357 var9 = (class357)this.field4281.get(var7); // L: 298
		if (var9 == null) { // L: 299
			var9 = (class357)this.field4280.get(var7); // L: 300
			if (var9 == null) { // L: 301
				var9 = (class357)this.field4286.get(var7); // L: 302
				if (var9 != null) { // L: 303
					if (var6) { // L: 304
						var9.removeDual(); // L: 305
						this.field4281.put(var9, var7); // L: 306
						--this.field4294; // L: 307
						++this.field4282; // L: 308
					}

				} else {
					if (!var6) { // L: 312
						var9 = (class357)this.field4288.get(var7); // L: 313
						if (var9 != null) { // L: 314
							return;
						}
					}

					var9 = new class357(); // L: 316
					var9.field4258 = var1; // L: 317
					var9.field4259 = var4; // L: 318
					var9.field4260 = var5; // L: 319
					if (var6) { // L: 320
						this.field4281.put(var9, var7); // L: 321
						++this.field4282; // L: 322
					} else {
						this.field4302.method7036(var9); // L: 325
						this.field4286.put(var9, var7); // L: 326
						++this.field4294; // L: 327
					}

				}
			}
		}
	} // L: 310 329

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "354202464"
	)
	void method6862(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2); // L: 332
		class357 var5 = (class357)this.field4286.get(var3); // L: 333
		if (var5 != null) { // L: 334
			this.field4302.method7033(var5); // L: 335
		}
	} // L: 336

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "123"
	)
	int method6877(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2); // L: 339
		return this.field4278 != null && var3 == this.field4278.key ? this.field4293.offset * 99 / (this.field4293.array.length - this.field4278.field4260) + 1 : 0; // L: 340 341
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ZZB)I",
		garbageValue = "58"
	)
	public int method6899(boolean var1, boolean var2) {
		byte var3 = 0; // L: 345
		int var4 = var3 + this.field4282 + this.field4284; // L: 346
		return var4; // L: 347
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "4"
	)
	public void method6897() {
		if (this.field4292 != null) { // L: 352
			this.field4292.close();
		}

	} // L: 353

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZI)I",
		garbageValue = "1751000323"
	)
	static int method6902(int var0, Script var1, boolean var2) {
		if (var0 == 6754) { // L: 5059
			int var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5060
			NPCComposition var6 = class144.getNpcDefinition(var5); // L: 5061
			Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var6 != null ? var6.name : ""; // L: 5062
			return 1; // L: 5063
		} else {
			NPCComposition var3;
			if (var0 == 6764) { // L: 5065
				Interpreter.Interpreter_intStackSize -= 2; // L: 5066
				var3 = class144.getNpcDefinition(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 5067
				int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 5068
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method3823(var4); // L: 5069
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method3825(var4); // L: 5070
				return 1; // L: 5071
			} else if (var0 == 6765) { // L: 5073
				var3 = class144.getNpcDefinition(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 5074
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 != null ? var3.combatLevel : 0; // L: 5075
				return 1; // L: 5076
			} else {
				return 2; // L: 5078
			}
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZI)I",
		garbageValue = "-210423242"
	)
	static int method6864(int var0, Script var1, boolean var2) {
		return 2; // L: 5108
	}
}
