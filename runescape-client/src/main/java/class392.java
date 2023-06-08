import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pk")
public class class392 {
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1533298793
	)
	int field4423;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1728101977
	)
	int field4421;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -357801803
	)
	int field4418;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -809195665
	)
	int field4426;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 564569647
	)
	int field4427;
	@ObfuscatedName("ai")
	boolean field4428;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	AbstractFont field4431;
	@ObfuscatedName("aw")
	ArrayList field4430;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -573874587
	)
	int field4424;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 93882733
	)
	int field4432;

	public class392() {
		this.field4423 = Integer.MAX_VALUE; // L: 22
		this.field4421 = Integer.MAX_VALUE; // L: 23
		this.field4418 = 0; // L: 24
		this.field4426 = 0; // L: 25
		this.field4427 = 0; // L: 26
		this.field4428 = true; // L: 27
		this.field4430 = new ArrayList(); // L: 29
		this.field4424 = 0; // L: 30
		this.field4432 = 0; // L: 31
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lpb;",
		garbageValue = "1000737659"
	)
	public class394 method7262(int var1) {
		return (class394)this.field4430.get(var1); // L: 34
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Lpb;",
		garbageValue = "2003561918"
	)
	class394 method7263() {
		return this.field4430.size() == 0 ? null : (class394)this.field4430.get(this.field4430.size() - 1); // L: 38 39
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-409593872"
	)
	public boolean method7410() {
		return this.field4430.size() == 0; // L: 43
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-119814303"
	)
	boolean method7400() {
		return this.field4421 > 1; // L: 47
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-158016599"
	)
	public int method7266() {
		return this.field4430.size(); // L: 51
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "64"
	)
	public String method7267() {
		if (this.method7410()) { // L: 55
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7266()); // L: 56

			for (int var2 = 0; var2 < this.method7266(); ++var2) { // L: 57
				class394 var3 = this.method7262(var2); // L: 58
				var1.append(var3.field4438); // L: 59
			}

			return var1.toString(); // L: 61
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "806285640"
	)
	public void method7397(int var1) {
		if (this.field4431 != null && var1 < this.field4431.ascent * 2) { // L: 65 66
			var1 = Integer.MAX_VALUE; // L: 67
		}

		if (this.field4423 != var1) { // L: 70
			this.field4423 = var1; // L: 71
			this.method7355(); // L: 72
		}

	} // L: 74

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "636317175"
	)
	public void method7269(int var1) {
		if (this.field4421 != var1) { // L: 77
			this.field4421 = var1; // L: 78
			this.method7355(); // L: 79
		}

	} // L: 81

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "88"
	)
	public void method7270(int var1) {
		if (this.field4432 != var1) { // L: 84
			this.field4432 = var1; // L: 85
			this.method7355(); // L: 86
		}

	} // L: 88

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpn;I)V",
		garbageValue = "1876429902"
	)
	public void method7271(AbstractFont var1) {
		if (var1 != this.field4431) { // L: 91
			this.field4431 = var1; // L: 92
			if (this.field4431 != null) { // L: 93
				if (this.field4427 == 0) { // L: 94
					this.field4427 = this.field4431.ascent; // L: 95
				}

				if (!this.method7410()) { // L: 97
					this.method7355(); // L: 98
				}
			}
		}

	} // L: 102

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "118"
	)
	public void method7272(int var1) {
		if (this.field4424 != var1) { // L: 105
			this.field4424 = var1; // L: 106
			this.method7355(); // L: 107
		}

	} // L: 109

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-720423206"
	)
	public boolean method7273(int var1, int var2) {
		if (this.field4418 != var1 || var2 != this.field4426) { // L: 112
			this.field4418 = var1; // L: 113
			this.field4426 = var2; // L: 114
			this.method7355(); // L: 115
		}

		return true; // L: 117
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-112"
	)
	public void method7361(int var1) {
		if (this.field4427 != var1) { // L: 121
			this.field4427 = var1; // L: 122
			this.method7355(); // L: 123
		}

	} // L: 125

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)Lpw;",
		garbageValue = "2007808286"
	)
	public class396 method7275(int var1, int var2) {
		if (var2 == var1) { // L: 128
			return new class396(this, 0, 0);
		} else if (var1 <= this.field4430.size() && var2 <= this.field4430.size()) { // L: 129
			return var2 < var1 ? new class396(this, var2, var1) : new class396(this, var1, var2); // L: 130
		} else {
			return new class396(this, 0, 0); // L: 131
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(CIIB)Lpd;",
		garbageValue = "0"
	)
	public class393 method7276(char var1, int var2, int var3) {
		return this.method7277(Character.toString(var1), var2, var3); // L: 135
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;III)Lpd;",
		garbageValue = "780812554"
	)
	public class393 method7277(String var1, int var2, int var3) {
		if (var3 == 0) { // L: 139
			var3 = Integer.MAX_VALUE; // L: 140
		}

		int var4 = var2; // L: 142
		if (this.field4430.size() >= var3) { // L: 143
			this.method7297(var2, var2); // L: 144
			return new class393(var2, true); // L: 145
		} else {
			this.field4430.ensureCapacity(this.field4430.size() + var1.length()); // L: 147

			for (int var5 = 0; var5 < var1.length() && this.field4430.size() < var3; ++var5) { // L: 148
				class394 var6 = new class394(); // L: 149
				var6.field4438 = var1.charAt(var5); // L: 150
				this.field4430.add(var4, var6); // L: 151
				++var4; // L: 152
			}

			this.method7297(var2, var4); // L: 154
			if (this.field4421 != 0 && this.method7319() > this.field4421) { // L: 155
				while (var4 != var2) { // L: 157
					--var4; // L: 160
					this.method7281(var4); // L: 161
					if (this.method7319() <= this.field4421) { // L: 162
						break;
					}
				}

				return new class393(var4, true); // L: 163
			} else {
				return new class393(var4, false); // L: 166
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lpd;",
		garbageValue = "-6192967"
	)
	class393 method7278(String var1, int var2) {
		return this.method7277(var1, this.field4430.size(), var2); // L: 171
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lpd;",
		garbageValue = "2062191006"
	)
	public class393 method7279(String var1) {
		this.method7280(); // L: 175
		return this.method7278(var1, 0); // L: 176
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-42346520"
	)
	void method7280() {
		this.field4430.clear(); // L: 180
	} // L: 181

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1389186922"
	)
	public int method7281(int var1) {
		return this.method7282(var1, var1 + 1); // L: 184
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-792660161"
	)
	public int method7282(int var1, int var2) {
		int var3;
		if (var2 < var1) { // L: 188
			var3 = var2; // L: 189
			var2 = var1; // L: 190
			var1 = var3; // L: 191
		}

		this.field4430.subList(var1, var2).clear(); // L: 193
		var3 = var1; // L: 194
		if (this.method7400() && this.field4424 == 1) { // L: 195
			while (var3 > 0) { // L: 196
				--var3; // L: 197
				char var4 = ((class394)this.field4430.get(var3)).field4438; // L: 198
				if (var4 == ' ' || var4 == '\t') { // L: 199
					break;
				}
			}
		}

		this.method7297(var3, var2); // L: 204
		return var1; // L: 205
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1392468321"
	)
	public int method7296(int var1, int var2) {
		if (this.field4431 == null) { // L: 209
			return 0;
		} else if (this.method7400() && var1 > this.field4423) { // L: 210
			return this.field4430.size();
		} else {
			if (!this.field4430.isEmpty()) { // L: 211
				for (int var3 = 0; var3 < this.field4430.size(); ++var3) { // L: 212
					class394 var4 = (class394)this.field4430.get(var3); // L: 213
					if (var2 <= var4.field4440 + this.method7287()) { // L: 214
						if (var2 < var4.field4440) { // L: 215
							break;
						}

						if (var1 < var4.field4441) { // L: 216
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (var3 + 1 != this.field4430.size() && ((class394)this.field4430.get(var3 + 1)).field4440 != var4.field4440) { // L: 217
							int var5 = this.method7291((class394)this.field4430.get(var3), false); // L: 218
							if (var1 < var5 + var4.field4441) { // L: 219
								return var3; // L: 220
							}

							if (var2 <= var4.field4440 + this.method7287()) { // L: 222
								return var3 + 1; // L: 223
							}
						}
					}
				}

				class394 var6 = (class394)this.field4430.get(this.field4430.size() - 1); // L: 228
				if (var1 >= var6.field4441 && var1 <= var6.field4441 + this.method7286() && var2 >= var6.field4440 && var2 <= var6.field4440 + this.method7287()) { // L: 229
					return this.field4430.size() - 1; // L: 230
				}
			}

			return this.field4430.size(); // L: 233
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "14"
	)
	public int method7289(int var1, int var2) {
		if (this.field4431 != null && !this.method7410() && var1 <= this.field4430.size()) { // L: 237
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
				class394 var6 = (class394)this.field4430.get(var1 - 1); // L: 249
				var4 = var6.field4441 + this.method7292(var1 - 1); // L: 250
				var5 = var6.field4440; // L: 251
			} else if (var3 == -1 && var1 == 0) { // L: 253
				return 0; // L: 254
			}

			int var14 = 16777215; // L: 256
			int var7 = 0; // L: 257
			int var8 = var1; // L: 258
			int var9 = 16777215; // L: 259
			int var10 = var3 == 1 ? this.field4430.size() + 1 : 0; // L: 260

			for (int var11 = var3 + var1; var10 != var11; var11 += var3) { // L: 261
				class394 var12 = (class394)this.field4430.get(var11 - 1); // L: 262
				if (var5 != var12.field4440) { // L: 263
					++var7; // L: 264
					var5 = var12.field4440; // L: 265
					if (var7 > var2) { // L: 266
						return var8; // L: 267
					}
				}

				if (var7 == var2) { // L: 270
					int var13 = Math.abs(var12.field4441 + this.method7292(var11 - 1) - var4); // L: 271
					if (var13 >= var9) { // L: 272
						return var8; // L: 277
					}

					var8 = var11; // L: 273
					var9 = var13; // L: 274
				}
			}

			if (var3 == 1) { // L: 281
				return this.field4430.size(); // L: 282
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-8442919"
	)
	public int method7285() {
		if (!this.field4430.isEmpty() && this.method7319() == 1) { // L: 298
			return this.field4430.isEmpty() ? 0 : ((class394)this.field4430.get(this.field4430.size() - 1)).field4441 + this.method7286(); // L: 299
		} else {
			int var1 = -1; // L: 302
			int var2 = 0; // L: 303

			for (int var3 = this.field4430.size() - 1; var3 >= 0; --var3) { // L: 304
				class394 var4 = (class394)this.field4430.get(var3); // L: 305
				if (var1 != var4.field4440) { // L: 306
					int var5 = this.method7291(var4, false) + var4.field4441; // L: 307
					var2 = Math.max(var5, var2); // L: 308
					var1 = var4.field4440; // L: 309
				}
			}

			return var2; // L: 312
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1855220326"
	)
	public int method7288() {
		return this.method7410() ? 0 : this.field4431.ascent + ((class394)this.field4430.get(this.field4430.size() - 1)).field4440; // L: 317
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-405894820"
	)
	public int method7287() {
		return this.field4427; // L: 321
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "18"
	)
	public int method7319() {
		return this.method7288() / this.field4431.ascent; // L: 325
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "992905157"
	)
	int method7286() {
		return this.method7410() ? 0 : this.method7291((class394)this.field4430.get(this.field4430.size() - 1), false); // L: 329
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-983332001"
	)
	public int method7290() {
		return this.field4423; // L: 333
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-965763369"
	)
	public int method7299() {
		return this.field4421; // L: 337
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1788179412"
	)
	public int method7305() {
		return this.field4424; // L: 341
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "6"
	)
	public int method7378() {
		return this.field4432; // L: 345
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-719852531"
	)
	public int method7294(int var1) {
		switch(this.field4418) { // L: 349
		case 0:
			return 0; // L: 353
		case 1:
			return var1 / 2; // L: 351
		case 2:
			return var1; // L: 355
		default:
			return 0; // L: 357
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1435824890"
	)
	public int method7325(int var1) {
		switch(this.field4426) { // L: 361
		case 0:
			return 0; // L: 363
		case 1:
			return var1 / 2; // L: 367
		case 2:
			return var1; // L: 365
		default:
			return 0; // L: 369
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-373163608"
	)
	void method7355() {
		this.method7297(0, this.field4430.size()); // L: 373
	} // L: 374

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-790520185"
	)
	void method7297(int var1, int var2) {
		if (!this.method7410() && this.field4431 != null) { // L: 377
			class473 var3 = this.method7300(var1, var2); // L: 378
			boolean var4 = (Integer)var3.field4903 == 0 && (Integer)var3.field4904 == this.field4430.size(); // L: 379
			int var5 = (Integer)var3.field4903; // L: 380
			int var6 = 0; // L: 381
			int var7 = var4 ? 0 : ((class394)this.field4430.get((Integer)var3.field4903)).field4440; // L: 382
			int var8 = 0; // L: 383

			int var9;
			for (var9 = (Integer)var3.field4903; var9 <= (Integer)var3.field4904; ++var9) { // L: 384
				boolean var10 = var9 >= this.field4430.size(); // L: 385
				class394 var21 = (class394)this.field4430.get(!var10 ? var9 : this.field4430.size() - 1); // L: 386
				int var22 = !var10 ? this.method7291(var21, false) : 0; // L: 387
				boolean var13 = !var10 && var21.field4438 == '\n'; // L: 388
				boolean var14 = !var10 && this.method7400() && var6 + var22 > this.field4423; // L: 389
				if (var13 || var14 || var10) { // L: 390
					int var15 = var9; // L: 391
					int var16 = 0; // L: 392
					int var17;
					int var18;
					class394 var19;
					if (var14) { // L: 393
						var17 = 0; // L: 394
						if (this.field4424 == 1) { // L: 395
							for (var18 = var9; var18 > var5; --var18) { // L: 396
								var19 = (class394)this.field4430.get(var18); // L: 397
								var17 += var18 < var15 ? this.method7291(var19, false) : 0; // L: 398
								if (var19.field4438 == ' ' || var19.field4438 == '\n') { // L: 399
									var15 = var18; // L: 400
									var6 -= var17; // L: 401
									var16 = var17; // L: 402
									break;
								}
							}
						}
					}

					var17 = -this.method7294(var6); // L: 408

					for (var18 = var5; var18 < var15; ++var18) { // L: 409
						var19 = (class394)this.field4430.get(var18); // L: 410
						int var20 = this.method7291(var19, false); // L: 411
						var19.field4441 = var17; // L: 412
						var19.field4440 = var7; // L: 413
						var17 += var20; // L: 414
					}

					var5 = var15; // L: 416
					var6 = var16; // L: 417
					var7 += this.method7287(); // L: 418
					++var8; // L: 419
				}

				var6 += !var10 ? var22 : 0; // L: 421
			}

			if (this.field4426 != 0 && var4) { // L: 423
				var9 = var8 * this.method7287(); // L: 424
				int var23 = this.method7325(var9); // L: 425

				for (int var11 = 0; var11 < this.field4430.size(); ++var11) { // L: 426
					class394 var12 = (class394)this.field4430.get(var11); // L: 427
					var12.field4440 -= var23; // L: 428
				}
			}

		}
	} // L: 431

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1642006865"
	)
	int method7292(int var1) {
		return var1 < this.field4430.size() ? this.method7291((class394)this.field4430.get(var1), false) : 0; // L: 434
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lpb;ZB)I",
		garbageValue = "-41"
	)
	int method7291(class394 var1, boolean var2) {
		if (var1.field4438 == '\n') { // L: 438
			return 0;
		} else if (this.field4432 == 0) { // L: 439
			int var3 = this.field4431.advances[var1.field4438]; // L: 440
			if (var3 == 0) { // L: 441
				return var1.field4438 == '\t' ? this.field4431.advances[32] * 3 : this.field4431.advances[32]; // L: 442 443 446
			} else {
				return var3; // L: 450
			}
		} else {
			return this.field4431.advances[42]; // L: 454
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(III)Lsf;",
		garbageValue = "2090349961"
	)
	class473 method7300(int var1, int var2) {
		int var3 = Math.min(var1, var2); // L: 459
		int var4 = Math.max(var1, var2); // L: 460
		int var5 = this.field4430.size(); // L: 461
		if (var3 == 0 && var5 == var4) { // L: 462
			return new class473(0, var5); // L: 463
		} else {
			int var6 = this.method7283(var3, false); // L: 465
			int var7 = this.method7406(var4, false); // L: 466
			int var8;
			switch(this.field4426) { // L: 467
			case 0:
				if (this.field4418 == 0) { // L: 478
					return new class473(var6, var5); // L: 479
				}

				var8 = this.method7283(var3, true); // L: 481
				return new class473(var8, var5); // L: 482
			case 1:
				return new class473(0, var5); // L: 485
			case 2:
				if (this.field4418 == 2) { // L: 470
					return new class473(0, var7); // L: 471
				}

				var8 = this.method7406(var4, true); // L: 473
				return new class473(0, var8); // L: 474
			default:
				return new class473(0, var5); // L: 487
			}
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IZB)I",
		garbageValue = "-19"
	)
	int method7283(int var1, boolean var2) {
		if (var1 < this.field4430.size()) { // L: 491
			int var3 = ((class394)this.field4430.get(var1)).field4440; // L: 492

			for (int var4 = var1; var4 > 0; --var4) { // L: 493
				if (((class394)this.field4430.get(var4 - 1)).field4440 < var3) { // L: 494
					if (!var2) { // L: 495
						return var4; // L: 496
					}

					var2 = false; // L: 498
					var3 = ((class394)this.field4430.get(var4 - 1)).field4440; // L: 499
				}
			}
		}

		return 0; // L: 503
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(IZB)I",
		garbageValue = "-98"
	)
	int method7406(int var1, boolean var2) {
		if (var1 < this.field4430.size()) { // L: 507
			int var3 = ((class394)this.field4430.get(var1)).field4440; // L: 508

			for (int var4 = var1; var4 < this.field4430.size() - 1; ++var4) { // L: 509
				if (((class394)this.field4430.get(var4 + 1)).field4440 > var3) { // L: 510
					if (!var2) { // L: 511
						return var4; // L: 512
					}

					var2 = false; // L: 514
					var3 = ((class394)this.field4430.get(var4 + 1)).field4440; // L: 515
				}
			}
		}

		return this.field4430.size(); // L: 519
	}

	@ObfuscatedName("mv")
	static final void method7411(double var0) {
		Rasterizer3D.method4372(var0); // L: 12210
		((TextureProvider)Rasterizer3D.field2520.Rasterizer3D_textureLoader).setBrightness(var0); // L: 12211
		class165.method3378(); // L: 12212
		class10.clientPreferences.method2443(var0); // L: 12213
	} // L: 12214
}
