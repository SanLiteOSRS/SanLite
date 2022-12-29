import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
public class class368 {
	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("dragInventoryWidget")
	static Widget dragInventoryWidget;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1517241847
	)
	int field4378;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -927573977
	)
	int field4382;
	@ObfuscatedName("i")
	boolean field4383;
	@ObfuscatedName("o")
	boolean field4384;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	AbstractFont field4385;
	@ObfuscatedName("k")
	ArrayList field4386;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 2048111853
	)
	int field4387;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1741771127
	)
	int field4388;

	public class368() {
		this.field4378 = Integer.MAX_VALUE; // L: 16
		this.field4382 = 0; // L: 17
		this.field4383 = true; // L: 18
		this.field4384 = true; // L: 19
		this.field4386 = new ArrayList(); // L: 21
		this.field4387 = 0; // L: 22
		this.field4388 = 0; // L: 23
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Lnp;",
		garbageValue = "599099594"
	)
	public class370 method7038(int var1) {
		return (class370)this.field4386.get(var1); // L: 26
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)Lnp;",
		garbageValue = "68"
	)
	class370 method7039() {
		return this.field4386.size() == 0 ? null : (class370)this.field4386.get(this.field4386.size() - 1); // L: 30 31
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2107005785"
	)
	public boolean method7103() {
		return this.field4386.size() == 0; // L: 35
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1127139622"
	)
	public int method7041() {
		return this.field4386.size(); // L: 39
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "1"
	)
	public String method7091() {
		if (this.method7103()) { // L: 43
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7041()); // L: 44

			for (int var2 = 0; var2 < this.method7041(); ++var2) { // L: 45
				class370 var3 = this.method7038(var2); // L: 46
				var1.append(var3.field4395); // L: 47
			}

			return var1.toString(); // L: 49
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-552089288"
	)
	public void method7042(int var1, boolean var2) {
		if (this.field4385 != null && var1 < this.field4385.ascent * 2) { // L: 53 54
			var1 = Integer.MAX_VALUE; // L: 55
		}

		if (this.field4378 != var1 || var2 != this.field4383) { // L: 58
			this.field4378 = var1; // L: 59
			this.field4383 = var2; // L: 60
			this.method7040(0, this.field4386.size(), false); // L: 61
		}

	} // L: 63

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-73"
	)
	public void method7043(int var1) {
		if (this.field4388 != var1) { // L: 66
			this.field4388 = var1; // L: 67
			this.method7040(0, this.field4386.size(), false); // L: 68
		}

	} // L: 70

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lne;I)V",
		garbageValue = "1392079190"
	)
	public void method7108(AbstractFont var1) {
		if (var1 != this.field4385) { // L: 73
			this.field4385 = var1; // L: 74
			if (this.field4385 != null) { // L: 75
				if (this.field4382 == 0) { // L: 76
					this.field4382 = this.field4385.ascent; // L: 77
				}

				if (!this.method7103()) { // L: 79
					this.method7040(0, this.field4386.size(), false); // L: 80
				}
			}
		}

	} // L: 84

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-3706"
	)
	public void method7123(int var1) {
		if (this.field4387 != var1) { // L: 87
			this.field4387 = var1; // L: 88
			this.method7040(0, this.field4386.size(), false); // L: 89
		}

	} // L: 91

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1109991484"
	)
	public void method7117(int var1) {
		if (this.field4382 != var1) { // L: 94
			this.field4382 = var1; // L: 95
			this.method7040(0, this.field4386.size(), false); // L: 96
		}

	} // L: 98

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lna;",
		garbageValue = "14"
	)
	public class372 method7092(int var1, int var2) {
		if (var2 == var1) { // L: 101
			return new class372(this, 0, 0);
		} else if (var1 <= this.field4386.size() && var2 <= this.field4386.size()) { // L: 102
			return var2 < var1 ? new class372(this, var2, var1) : new class372(this, var1, var2); // L: 103
		} else {
			return new class372(this, 0, 0); // L: 104
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(CIIII)Lny;",
		garbageValue = "1107452813"
	)
	public class369 method7048(char var1, int var2, int var3, int var4) {
		return this.method7049(Character.toString(var1), var2, var3, var4); // L: 108
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIII)Lny;",
		garbageValue = "-620830058"
	)
	public class369 method7049(String var1, int var2, int var3, int var4) {
		if (var3 == 0) { // L: 112
			var3 = Integer.MAX_VALUE; // L: 113
		}

		if (this.field4386.size() >= var3) { // L: 115
			return new class369(var2, true); // L: 116
		} else {
			this.field4386.ensureCapacity(this.field4386.size() + var1.length()); // L: 118
			int var5 = var2; // L: 119
			int var6 = 0; // L: 120
			class370 var7 = this.method7066(var2); // L: 121
			int var8 = this.method7067(var2); // L: 122

			int var9;
			int var10;
			for (var9 = -1; var6 < var1.length() && this.field4386.size() < var3; ++var5) { // L: 123 124 149
				class370 var11 = new class370(); // L: 126
				var11.field4395 = var1.charAt(var6++); // L: 127
				if (var11.field4395 == '\n') { // L: 128
					var11.field4397 = var7.field4397 + this.method7131(); // L: 129
					var10 = 0; // L: 130
				} else {
					var11.field4398 = var8 + var7.field4398; // L: 133
					var11.field4397 = var7.field4397; // L: 134
					var10 = this.method7069(var11, false); // L: 135
					if (this.field4383 && var10 + var11.field4398 > this.field4378) { // L: 136
						if (this.field4387 == 0) { // L: 137
							var11.field4398 = 0; // L: 138
							var11.field4397 += this.method7131(); // L: 139
						} else if (var9 == -1) { // L: 141
							var9 = var5; // L: 142
						}
					}
				}

				var7 = var11; // L: 146
				var8 = var10; // L: 147
				this.field4386.add(var5, var11); // L: 148
			}

			var10 = var9 == -1 ? var5 : var9; // L: 151
			this.method7040(var10, this.field4386.size(), true); // L: 152
			if (var4 != 0 && this.method7133() > var4) { // L: 153
				while (var5 != var2) { // L: 155
					--var5; // L: 158
					this.method7053(var5); // L: 159
					if (this.method7133() <= var4) { // L: 160
						break;
					}
				}

				return new class369(var5, true); // L: 161
			} else {
				return new class369(var5, false); // L: 164
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;III)Lny;",
		garbageValue = "1594768119"
	)
	class369 method7050(String var1, int var2, int var3) {
		return this.method7049(var1, this.field4386.size(), var2, var3); // L: 169
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Lny;",
		garbageValue = "103"
	)
	public class369 method7051(String var1) {
		this.method7052(); // L: 173
		return this.method7050(var1, 0, 0); // L: 174
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-16"
	)
	void method7052() {
		this.field4386.clear(); // L: 178
	} // L: 179

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1344636736"
	)
	public int method7053(int var1) {
		return this.method7046(var1, var1 + 1); // L: 182
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "888686654"
	)
	public int method7046(int var1, int var2) {
		int var3;
		if (var2 < var1) { // L: 186
			var3 = var2; // L: 187
			var2 = var1; // L: 188
			var1 = var3; // L: 189
		}

		this.field4386.subList(var1, var2).clear(); // L: 191
		var3 = var1; // L: 192
		if (this.field4383 && this.field4387 == 1) { // L: 193
			label36: {
				int var4 = var1; // L: 194

				char var5;
				do {
					if (var4 <= 0) { // L: 195
						break label36;
					}

					--var4; // L: 196
					var5 = ((class370)this.field4386.get(var4)).field4395; // L: 197
				} while(var5 != ' ' && var5 != '\t'); // L: 198

				var3 = var4; // L: 199
			}
		}

		this.method7040(var3, this.field4386.size(), true); // L: 204
		return var1; // L: 205
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "655575850"
	)
	public int method7055(int var1, int var2) {
		if (this.field4385 != null && var1 >= 0 && var2 >= 0) { // L: 209
			if (this.field4383 && var1 > this.field4378) { // L: 210
				return this.field4386.size();
			} else {
				if (!this.field4386.isEmpty()) { // L: 211
					for (int var3 = 0; var3 < this.field4386.size(); ++var3) { // L: 212
						class370 var4 = (class370)this.field4386.get(var3); // L: 213
						if (var2 <= var4.field4397 + this.method7131()) { // L: 214
							if (var2 < var4.field4397) { // L: 215
								break;
							}

							if (var1 < var4.field4398) { // L: 216
								return var3 > 0 ? var3 - 1 : 0;
							}

							if (var3 + 1 != this.field4386.size() && ((class370)this.field4386.get(var3 + 1)).field4397 != var4.field4397) { // L: 217
								int var5 = this.method7069((class370)this.field4386.get(var3), false); // L: 218
								if (var1 < var5 + var4.field4398) { // L: 219
									return var3; // L: 220
								}

								if (var2 <= var4.field4397 + this.method7131()) { // L: 222
									return var3 + 1; // L: 223
								}
							}
						}
					}

					class370 var6 = (class370)this.field4386.get(this.field4386.size() - 1); // L: 228
					if (var1 >= var6.field4398 && var1 <= var6.field4398 + this.method7061() && var2 >= var6.field4397 && var2 <= var6.field4397 + this.method7131()) { // L: 229
						return this.field4386.size() - 1; // L: 230
					}
				}

				return this.field4386.size(); // L: 233
			}
		} else {
			return 0;
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1958663606"
	)
	public int method7056(int var1, int var2) {
		if (this.field4385 != null && !this.method7103() && var1 <= this.field4386.size()) { // L: 237
			byte var3;
			if (var2 > 0) { // L: 239
				var3 = 1; // L: 240
			} else {
				var3 = -1; // L: 243
				var2 = -var2; // L: 244
			}

			int var4 = 0; // L: 246
			int var5 = 0; // L: 247
			if (var1 > 0) { // L: 248
				class370 var6 = (class370)this.field4386.get(var1 - 1); // L: 249
				var4 = var6.field4398 + this.method7065(var1 - 1); // L: 250
				var5 = var6.field4397; // L: 251
			} else if (var3 == -1 && var1 == 0) { // L: 253
				return 0; // L: 254
			}

			int var14 = 16777215; // L: 256
			int var7 = 0; // L: 257
			int var8 = var1; // L: 258
			int var9 = 16777215; // L: 259
			int var10 = var3 == 1 ? this.field4386.size() + 1 : 0; // L: 260

			for (int var11 = var3 + var1; var11 != var10; var11 += var3) { // L: 261
				class370 var12 = (class370)this.field4386.get(var11 - 1); // L: 262
				if (var5 != var12.field4397) { // L: 263
					++var7; // L: 264
					var5 = var12.field4397; // L: 265
					if (var7 > var2) { // L: 266
						return var8; // L: 267
					}
				}

				if (var7 == var2) { // L: 270
					int var13 = Math.abs(var12.field4398 + this.method7065(var11 - 1) - var4); // L: 271
					if (var13 >= var9) { // L: 272
						return var8; // L: 277
					}

					var8 = var11; // L: 273
					var9 = var13; // L: 274
				}
			}

			if (var3 == 1) { // L: 281
				return this.field4386.size(); // L: 282
			} else {
				if (var5 != 0) { // L: 285
					++var7; // L: 286
				}

				return var9 == 16777215 || var7 == var2 && var4 < var9 ? 0 : var8; // L: 288 289
			}
		} else {
			return 0;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-130437286"
	)
	public int method7057() {
		if (!this.field4386.isEmpty() && this.method7133() == 1) { // L: 298
			return this.field4386.isEmpty() ? 0 : ((class370)this.field4386.get(this.field4386.size() - 1)).field4398 + this.method7061(); // L: 299
		} else {
			int var1 = -1; // L: 302
			int var2 = 0; // L: 303

			for (int var3 = this.field4386.size() - 1; var3 >= 0; --var3) { // L: 304
				class370 var4 = (class370)this.field4386.get(var3); // L: 305
				if (var1 != var4.field4397) { // L: 306
					int var5 = this.method7069(var4, false) + var4.field4398; // L: 307
					var2 = Math.max(var5, var2); // L: 308
					var1 = var4.field4397; // L: 309
				}
			}

			return var2; // L: 312
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-25123"
	)
	public int method7140() {
		return this.method7103() ? 0 : this.field4385.ascent + ((class370)this.field4386.get(this.field4386.size() - 1)).field4397; // L: 317
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "845637475"
	)
	public int method7131() {
		return this.field4382; // L: 321
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2032059234"
	)
	public int method7133() {
		return this.method7140() / this.field4385.ascent; // L: 325
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1139842629"
	)
	int method7061() {
		return this.method7103() ? 0 : this.method7069((class370)this.field4386.get(this.field4386.size() - 1), false); // L: 329
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "253173757"
	)
	public int method7062() {
		return this.field4378; // L: 333
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1423170238"
	)
	public int method7063() {
		return this.field4387; // L: 337
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1071508455"
	)
	public int method7104() {
		return this.field4388; // L: 341
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "177216138"
	)
	void method7040(int var1, int var2, boolean var3) {
		if (!this.method7103() && this.field4385 != null) { // L: 345
			class370 var4 = this.method7066(var1); // L: 346
			int var5 = this.method7067(var1); // L: 347

			for (int var6 = var1; var6 < var2; ++var6) { // L: 348
				class370 var7 = (class370)this.field4386.get(var6); // L: 349
				int var10;
				if (var7.field4395 == '\n') { // L: 351
					int var9 = var4.field4397 + this.method7131(); // L: 352
					if (var3) { // L: 353
						if (var9 != var7.field4397) { // L: 354
							var10 = var9 - var7.field4397; // L: 355

							for (int var17 = var6; var17 < var2; ++var17) { // L: 356
								class370 var10000 = (class370)this.field4386.get(var17); // L: 357
								var10000.field4397 += var10;
							}
						}
						break;
					}

					var7.field4397 = var9; // L: 361
					boolean var8 = false; // L: 362
				} else {
					var7.field4398 = var5 + var4.field4398; // L: 365
					var7.field4397 = var4.field4397; // L: 366
					int var18 = this.method7069(var7, false); // L: 367
					if (this.field4383 && var18 + var7.field4398 > this.field4378) { // L: 368
						boolean var19 = false; // L: 369
						if (this.field4387 == 1) { // L: 370
							for (var10 = var6; var10 > 0; --var10) { // L: 371
								class370 var11 = (class370)this.field4386.get(var10 - 1); // L: 372
								if (var7.field4397 != var11.field4397) { // L: 373
									break;
								}

								if (var11.field4395 == ' ' || var11.field4395 == '\t') { // L: 376
									class370 var12 = (class370)this.field4386.get(var10); // L: 377
									int var13 = var12.field4398; // L: 378
									int var14 = var12.field4397 + this.method7131(); // L: 379

									for (int var15 = var10; var15 <= var6; ++var15) { // L: 380
										class370 var16 = (class370)this.field4386.get(var15); // L: 381
										var16.field4398 -= var13; // L: 382
										var16.field4397 = var14; // L: 383
									}

									var19 = true; // L: 385
									break; // L: 386
								}
							}
						}

						if (!var19) { // L: 390
							var7.field4398 = 0; // L: 391
							var7.field4397 += this.method7131(); // L: 392
						}
					}
				}

				var4 = (class370)this.field4386.get(var6); // L: 396
				var5 = this.method7069(var4, false); // L: 397
			}

		}
	} // L: 399

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Lnp;",
		garbageValue = "187141060"
	)
	class370 method7066(int var1) {
		if (var1 > 0 && !this.field4386.isEmpty()) { // L: 402
			return var1 >= this.field4386.size() ? (class370)this.field4386.get(this.field4386.size() - 1) : (class370)this.field4386.get(var1 - 1); // L: 403 404 407
		} else {
			return new class370(); // L: 410
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1721941194"
	)
	int method7067(int var1) {
		if (var1 > 0 && !this.field4386.isEmpty()) { // L: 414
			return var1 >= this.field4386.size() ? this.method7065(this.field4386.size() - 1) : this.method7065(var1 - 1); // L: 415 416 419
		} else {
			return 0; // L: 422
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-18349977"
	)
	int method7065(int var1) {
		return var1 < this.field4386.size() ? this.method7069((class370)this.field4386.get(var1), false) : 0; // L: 426
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lnp;ZB)I",
		garbageValue = "-31"
	)
	int method7069(class370 var1, boolean var2) {
		if (var1.field4395 == '\n') { // L: 430
			return 0;
		} else if (this.field4388 == 0) { // L: 431
			int var3 = this.field4385.advances[var1.field4395]; // L: 432
			if (var3 == 0) { // L: 433
				return var1.field4395 == '\t' ? this.field4385.advances[32] * 3 : this.field4385.advances[32]; // L: 434 435 438
			} else {
				return var3; // L: 442
			}
		} else {
			return this.field4385.advances[42]; // L: 446
		}
	}
}
