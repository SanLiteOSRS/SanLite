import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
public class class365 {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -332249035
	)
	int field4329;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1691155089
	)
	int field4332;
	@ObfuscatedName("p")
	boolean field4333;
	@ObfuscatedName("b")
	boolean field4330;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	AbstractFont field4335;
	@ObfuscatedName("u")
	ArrayList field4336;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 896242275
	)
	int field4337;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 45441755
	)
	int field4338;

	public class365() {
		this.field4329 = Integer.MAX_VALUE; // L: 16
		this.field4332 = 0; // L: 17
		this.field4333 = true; // L: 18
		this.field4330 = true; // L: 19
		this.field4336 = new ArrayList(); // L: 21
		this.field4337 = 0; // L: 22
		this.field4338 = 0; // L: 23
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)Lns;",
		garbageValue = "-1964484006"
	)
	public class367 method6881(int var1) {
		return (class367)this.field4336.get(var1); // L: 26
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Lns;",
		garbageValue = "-992605359"
	)
	class367 method6882() {
		return this.field4336.size() == 0 ? null : (class367)this.field4336.get(this.field4336.size() - 1); // L: 30 31
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-6"
	)
	public boolean method6883() {
		return this.field4336.size() == 0; // L: 35
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-195978311"
	)
	public int method6943() {
		return this.field4336.size(); // L: 39
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "57"
	)
	public String method6880() {
		if (this.method6883()) { // L: 43
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method6943()); // L: 44

			for (int var2 = 0; var2 < this.method6943(); ++var2) { // L: 45
				class367 var3 = this.method6881(var2); // L: 46
				var1.append(var3.field4347); // L: 47
			}

			return var1.toString(); // L: 49
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1794064051"
	)
	public void method6886(int var1, boolean var2) {
		if (this.field4335 != null && var1 < this.field4335.ascent * 2) { // L: 53 54
			var1 = Integer.MAX_VALUE; // L: 55
		}

		if (this.field4329 != var1 || var2 != this.field4333) { // L: 58
			this.field4329 = var1; // L: 59
			this.field4333 = var2; // L: 60
			this.method6962(0, this.field4336.size(), false); // L: 61
		}

	} // L: 63

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "37"
	)
	public void method6887(int var1) {
		if (this.field4338 != var1) { // L: 66
			this.field4338 = var1; // L: 67
			this.method6962(0, this.field4336.size(), false); // L: 68
		}

	} // L: 70

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-915658449"
	)
	public void method6888(AbstractFont var1) {
		if (var1 != this.field4335) { // L: 73
			this.field4335 = var1; // L: 74
			if (this.field4335 != null) { // L: 75
				if (this.field4332 == 0) { // L: 76
					this.field4332 = this.field4335.ascent; // L: 77
				}

				if (!this.method6883()) { // L: 79
					this.method6962(0, this.field4336.size(), false); // L: 80
				}
			}
		}

	} // L: 84

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1605888698"
	)
	public void method6905(int var1) {
		if (this.field4337 != var1) { // L: 87
			this.field4337 = var1; // L: 88
			this.method6962(0, this.field4336.size(), false); // L: 89
		}

	} // L: 91

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1197413449"
	)
	public void method6890(int var1) {
		if (this.field4332 != var1) { // L: 94
			this.field4332 = var1; // L: 95
			this.method6962(0, this.field4336.size(), false); // L: 96
		}

	} // L: 98

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(III)Lnx;",
		garbageValue = "-1580347071"
	)
	public class369 method6891(int var1, int var2) {
		if (var2 == var1) { // L: 101
			return new class369(this, 0, 0);
		} else if (var1 <= this.field4336.size() && var2 <= this.field4336.size()) { // L: 102
			return var2 < var1 ? new class369(this, var2, var1) : new class369(this, var1, var2); // L: 103
		} else {
			return new class369(this, 0, 0); // L: 104
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(CIIII)Lnu;",
		garbageValue = "1664631962"
	)
	public class366 method6885(char var1, int var2, int var3, int var4) {
		return this.method6935(Character.toString(var1), var2, var3, var4); // L: 108
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIII)Lnu;",
		garbageValue = "1100081346"
	)
	public class366 method6935(String var1, int var2, int var3, int var4) {
		if (var3 == 0) { // L: 112
			var3 = Integer.MAX_VALUE; // L: 113
		}

		if (this.field4336.size() >= var3) { // L: 115
			return new class366(var2, true); // L: 116
		} else {
			this.field4336.ensureCapacity(this.field4336.size() + var1.length()); // L: 118
			int var5 = var2; // L: 119
			int var6 = 0; // L: 120
			class367 var7 = this.method6972(var2); // L: 121
			int var8 = this.method6956(var2); // L: 122

			int var9;
			int var10;
			for (var9 = -1; var6 < var1.length() && this.field4336.size() < var3; ++var5) { // L: 123 124 149
				class367 var11 = new class367(); // L: 126
				var11.field4347 = var1.charAt(var6++); // L: 127
				if (var11.field4347 == '\n') { // L: 128
					var11.field4343 = var7.field4343 + this.method6903(); // L: 129
					var10 = 0; // L: 130
				} else {
					var11.field4341 = var8 + var7.field4341; // L: 133
					var11.field4343 = var7.field4343; // L: 134
					var10 = this.method6913(var11, false); // L: 135
					if (this.field4333 && var10 + var11.field4341 > this.field4329) { // L: 136
						if (this.field4337 == 0) { // L: 137
							var11.field4341 = 0; // L: 138
							var11.field4343 += this.method6903(); // L: 139
						} else if (var9 == -1) { // L: 141
							var9 = var5; // L: 142
						}
					}
				}

				var7 = var11; // L: 146
				var8 = var10; // L: 147
				this.field4336.add(var5, var11); // L: 148
			}

			var10 = var9 == -1 ? var5 : var9; // L: 151
			this.method6962(var10, this.field4336.size(), true); // L: 152
			if (var4 != 0 && this.method6904() > var4) { // L: 153
				while (var5 != var2) { // L: 155
					--var5; // L: 158
					this.method6897(var5); // L: 159
					if (this.method6904() <= var4) { // L: 160
						break;
					}
				}

				return new class366(var5, true); // L: 161
			} else {
				return new class366(var5, false); // L: 164
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIB)Lnu;",
		garbageValue = "73"
	)
	class366 method6894(String var1, int var2, int var3) {
		return this.method6935(var1, this.field4336.size(), var2, var3); // L: 169
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lnu;",
		garbageValue = "-454911722"
	)
	public class366 method6895(String var1) {
		this.method6968(); // L: 173
		return this.method6894(var1, 0, 0); // L: 174
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "913428011"
	)
	void method6968() {
		this.field4336.clear(); // L: 178
	} // L: 179

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "70"
	)
	public int method6897(int var1) {
		return this.method6898(var1, var1 + 1); // L: 182
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-47833479"
	)
	public int method6898(int var1, int var2) {
		int var3;
		if (var2 < var1) { // L: 186
			var3 = var2; // L: 187
			var2 = var1; // L: 188
			var1 = var3; // L: 189
		}

		this.field4336.subList(var1, var2).clear(); // L: 191
		var3 = var1; // L: 192
		if (this.field4333 && this.field4337 == 1) { // L: 193
			label36: {
				int var4 = var1; // L: 194

				char var5;
				do {
					if (var4 <= 0) { // L: 195
						break label36;
					}

					--var4; // L: 196
					var5 = ((class367)this.field4336.get(var4)).field4347; // L: 197
				} while(var5 != ' ' && var5 != '\t'); // L: 198

				var3 = var4; // L: 199
			}
		}

		this.method6962(var3, this.field4336.size(), true); // L: 204
		return var1; // L: 205
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1023124425"
	)
	public int method6930(int var1, int var2) {
		if (this.field4335 != null && var1 >= 0 && var2 >= 0) { // L: 209
			if (this.field4333 && var1 > this.field4329) { // L: 210
				return this.field4336.size();
			} else {
				if (!this.field4336.isEmpty()) { // L: 211
					for (int var3 = 0; var3 < this.field4336.size(); ++var3) { // L: 212
						class367 var4 = (class367)this.field4336.get(var3); // L: 213
						if (var2 <= var4.field4343 + this.method6903()) { // L: 214
							if (var2 < var4.field4343) { // L: 215
								break;
							}

							if (var1 < var4.field4341) { // L: 216
								return var3 > 0 ? var3 - 1 : 0;
							}

							if (var3 + 1 != this.field4336.size() && ((class367)this.field4336.get(1 + var3)).field4343 != var4.field4343) { // L: 217
								int var5 = this.method6913((class367)this.field4336.get(var3), false); // L: 218
								if (var1 < var5 + var4.field4341) { // L: 219
									return var3; // L: 220
								}

								if (var2 <= var4.field4343 + this.method6903()) { // L: 222
									return var3 + 1; // L: 223
								}
							}
						}
					}

					class367 var6 = (class367)this.field4336.get(this.field4336.size() - 1); // L: 228
					if (var1 >= var6.field4341 && var1 <= var6.field4341 + this.method6978() && var2 >= var6.field4343 && var2 <= var6.field4343 + this.method6903()) { // L: 229
						return this.field4336.size() - 1; // L: 230
					}
				}

				return this.field4336.size(); // L: 233
			}
		} else {
			return 0;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "62"
	)
	public int method6900(int var1, int var2) {
		if (this.field4335 != null && !this.method6883() && var1 <= this.field4336.size()) { // L: 237
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
				class367 var6 = (class367)this.field4336.get(var1 - 1); // L: 249
				var4 = var6.field4341 + this.method6912(var1 - 1); // L: 250
				var5 = var6.field4343; // L: 251
			} else if (var3 == -1 && var1 == 0) { // L: 253
				return 0; // L: 254
			}

			int var14 = 16777215; // L: 256
			int var7 = 0; // L: 257
			int var8 = var1; // L: 258
			int var9 = 16777215; // L: 259
			int var10 = var3 == 1 ? this.field4336.size() + 1 : 0; // L: 260

			for (int var11 = var3 + var1; var10 != var11; var11 += var3) { // L: 261
				class367 var12 = (class367)this.field4336.get(var11 - 1); // L: 262
				if (var5 != var12.field4343) { // L: 263
					++var7; // L: 264
					var5 = var12.field4343; // L: 265
					if (var7 > var2) { // L: 266
						return var8; // L: 267
					}
				}

				if (var7 == var2) { // L: 270
					int var13 = Math.abs(var12.field4341 + this.method6912(var11 - 1) - var4); // L: 271
					if (var13 >= var9) { // L: 272
						return var8; // L: 277
					}

					var8 = var11; // L: 273
					var9 = var13; // L: 274
				}
			}

			if (var3 == 1) { // L: 281
				return this.field4336.size(); // L: 282
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1018364442"
	)
	public int method6901() {
		if (!this.field4336.isEmpty() && this.method6904() == 1) { // L: 298
			return this.field4336.isEmpty() ? 0 : ((class367)this.field4336.get(this.field4336.size() - 1)).field4341 + this.method6978(); // L: 299
		} else {
			int var1 = -1; // L: 302
			int var2 = 0; // L: 303

			for (int var3 = this.field4336.size() - 1; var3 >= 0; --var3) { // L: 304
				class367 var4 = (class367)this.field4336.get(var3); // L: 305
				if (var1 != var4.field4343) { // L: 306
					int var5 = this.method6913(var4, false) + var4.field4341; // L: 307
					var2 = Math.max(var5, var2); // L: 308
					var1 = var4.field4343; // L: 309
				}
			}

			return var2; // L: 312
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-313663048"
	)
	public int method6969() {
		return this.method6883() ? 0 : this.field4335.ascent + ((class367)this.field4336.get(this.field4336.size() - 1)).field4343; // L: 317
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1763547424"
	)
	public int method6903() {
		return this.field4332; // L: 321
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1988231717"
	)
	public int method6904() {
		return this.method6969() / this.field4335.ascent; // L: 325
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-898"
	)
	int method6978() {
		return this.method6883() ? 0 : this.method6913((class367)this.field4336.get(this.field4336.size() - 1), false); // L: 329
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-748889445"
	)
	public int method6906() {
		return this.field4329; // L: 333
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1730130424"
	)
	public int method6893() {
		return this.field4337; // L: 337
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int method6908() {
		return this.field4338; // L: 341
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "8"
	)
	void method6962(int var1, int var2, boolean var3) {
		if (!this.method6883() && this.field4335 != null) { // L: 345
			class367 var4 = this.method6972(var1); // L: 346
			int var5 = this.method6956(var1); // L: 347

			for (int var6 = var1; var6 < var2; ++var6) { // L: 348
				class367 var7 = (class367)this.field4336.get(var6); // L: 349
				int var10;
				if (var7.field4347 == '\n') { // L: 351
					int var9 = var4.field4343 + this.method6903(); // L: 352
					if (var3) { // L: 353
						if (var9 != var7.field4343) { // L: 354
							var10 = var9 - var7.field4343; // L: 355

							for (int var17 = var6; var17 < var2; ++var17) { // L: 356
								class367 var10000 = (class367)this.field4336.get(var17); // L: 357
								var10000.field4343 += var10;
							}
						}
						break;
					}

					var7.field4343 = var9; // L: 361
					boolean var8 = false; // L: 362
				} else {
					var7.field4341 = var5 + var4.field4341; // L: 365
					var7.field4343 = var4.field4343; // L: 366
					int var18 = this.method6913(var7, false); // L: 367
					if (this.field4333 && var18 + var7.field4341 > this.field4329) { // L: 368
						boolean var19 = false; // L: 369
						if (this.field4337 == 1) { // L: 370
							for (var10 = var6; var10 > 0; --var10) { // L: 371
								class367 var11 = (class367)this.field4336.get(var10 - 1); // L: 372
								if (var7.field4343 != var11.field4343) { // L: 373
									break;
								}

								if (var11.field4347 == ' ' || var11.field4347 == '\t') { // L: 376
									class367 var12 = (class367)this.field4336.get(var10); // L: 377
									int var13 = var12.field4341; // L: 378
									int var14 = var12.field4343 + this.method6903(); // L: 379

									for (int var15 = var10; var15 <= var6; ++var15) { // L: 380
										class367 var16 = (class367)this.field4336.get(var15); // L: 381
										var16.field4341 -= var13; // L: 382
										var16.field4343 = var14; // L: 383
									}

									var19 = true; // L: 385
									break; // L: 386
								}
							}
						}

						if (!var19) { // L: 390
							var7.field4341 = 0; // L: 391
							var7.field4343 += this.method6903(); // L: 392
						}
					}
				}

				var4 = (class367)this.field4336.get(var6); // L: 396
				var5 = this.method6913(var4, false); // L: 397
			}

		}
	} // L: 399

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Lns;",
		garbageValue = "-1143519734"
	)
	class367 method6972(int var1) {
		if (var1 > 0 && !this.field4336.isEmpty()) { // L: 402
			return var1 >= this.field4336.size() ? (class367)this.field4336.get(this.field4336.size() - 1) : (class367)this.field4336.get(var1 - 1); // L: 403 404 407
		} else {
			return new class367(); // L: 410
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-649378291"
	)
	int method6956(int var1) {
		if (var1 > 0 && !this.field4336.isEmpty()) { // L: 414
			return var1 >= this.field4336.size() ? this.method6912(this.field4336.size() - 1) : this.method6912(var1 - 1); // L: 415 416 419
		} else {
			return 0; // L: 422
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "2"
	)
	int method6912(int var1) {
		return var1 < this.field4336.size() ? this.method6913((class367)this.field4336.get(var1), false) : 0; // L: 426
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lns;ZI)I",
		garbageValue = "-471041560"
	)
	int method6913(class367 var1, boolean var2) {
		if (var1.field4347 == '\n') { // L: 430
			return 0;
		} else if (this.field4338 == 0) { // L: 431
			int var3 = this.field4335.advances[var1.field4347]; // L: 432
			if (var3 == 0) { // L: 433
				return var1.field4347 == '\t' ? this.field4335.advances[32] * 3 : this.field4335.advances[32]; // L: 434 435 438
			} else {
				return var3; // L: 442
			}
		} else {
			return this.field4335.advances[42]; // L: 446
		}
	}
}
