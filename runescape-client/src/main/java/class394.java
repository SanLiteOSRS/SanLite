import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pz")
public class class394 {
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -73933575
	)
	int field4450;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -658019159
	)
	int field4451;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -544935049
	)
	int field4452;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1325459551
	)
	int field4453;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1665740253
	)
	int field4454;
	@ObfuscatedName("ae")
	boolean field4455;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpp;"
	)
	AbstractFont field4456;
	@ObfuscatedName("aq")
	ArrayList field4457;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1601485103
	)
	int field4448;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -2073900019
	)
	int field4458;

	public class394() {
		this.field4450 = Integer.MAX_VALUE; // L: 22
		this.field4451 = Integer.MAX_VALUE; // L: 23
		this.field4452 = 0; // L: 24
		this.field4453 = 0; // L: 25
		this.field4454 = 0; // L: 26
		this.field4455 = true; // L: 27
		this.field4457 = new ArrayList(); // L: 29
		this.field4448 = 0; // L: 30
		this.field4458 = 0; // L: 31
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Lpc;",
		garbageValue = "279389269"
	)
	public class396 method7337(int var1) {
		return (class396)this.field4457.get(var1); // L: 34
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Lpc;",
		garbageValue = "-1663835171"
	)
	class396 method7430() {
		return this.field4457.size() == 0 ? null : (class396)this.field4457.get(this.field4457.size() - 1); // L: 38 39
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "851718466"
	)
	public boolean method7452() {
		return this.field4457.size() == 0; // L: 43
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "792577528"
	)
	boolean method7340() {
		return this.field4451 > 1; // L: 47
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1069407770"
	)
	public int method7341() {
		return this.field4457.size(); // L: 51
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2131805239"
	)
	public String method7416() {
		if (this.method7452()) { // L: 55
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7341()); // L: 56

			for (int var2 = 0; var2 < this.method7341(); ++var2) { // L: 57
				class396 var3 = this.method7337(var2); // L: 58
				var1.append(var3.field4465); // L: 59
			}

			return var1.toString(); // L: 61
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-6"
	)
	public void method7438(int var1) {
		if (this.field4456 != null && var1 < this.field4456.ascent * 2) { // L: 65 66
			var1 = Integer.MAX_VALUE; // L: 67
		}

		if (this.field4450 != var1) { // L: 70
			this.field4450 = var1; // L: 71
			this.method7371(); // L: 72
		}

	} // L: 74

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1778435728"
	)
	public void method7424(int var1) {
		if (this.field4451 != var1) { // L: 77
			this.field4451 = var1; // L: 78
			this.method7371(); // L: 79
		}

	} // L: 81

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1714546242"
	)
	public void method7448(int var1) {
		if (this.field4458 != var1) { // L: 84
			this.field4458 = var1; // L: 85
			this.method7371(); // L: 86
		}

	} // L: 88

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lpp;I)V",
		garbageValue = "1544990644"
	)
	public void method7443(AbstractFont var1) {
		if (var1 != this.field4456) { // L: 91
			this.field4456 = var1; // L: 92
			if (this.field4456 != null) { // L: 93
				if (this.field4454 == 0) { // L: 94
					this.field4454 = this.field4456.ascent; // L: 95
				}

				if (!this.method7452()) { // L: 97
					this.method7371(); // L: 98
				}
			}
		}

	} // L: 102

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "54"
	)
	public void method7344(int var1) {
		if (this.field4448 != var1) { // L: 105
			this.field4448 = var1; // L: 106
			this.method7371(); // L: 107
		}

	} // L: 109

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIS)Z",
		garbageValue = "255"
	)
	public boolean method7336(int var1, int var2) {
		if (this.field4452 != var1 || var2 != this.field4453) { // L: 112
			this.field4452 = var1; // L: 113
			this.field4453 = var2; // L: 114
			this.method7371(); // L: 115
		}

		return true; // L: 117
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-799270261"
	)
	public void method7349(int var1) {
		if (this.field4454 != var1) { // L: 121
			this.field4454 = var1; // L: 122
			this.method7371(); // L: 123
		}

	} // L: 125

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)Lpt;",
		garbageValue = "-545932977"
	)
	public class398 method7350(int var1, int var2) {
		if (var2 == var1) { // L: 128
			return new class398(this, 0, 0);
		} else if (var1 <= this.field4457.size() && var2 <= this.field4457.size()) { // L: 129
			return var2 < var1 ? new class398(this, var2, var1) : new class398(this, var1, var2); // L: 130
		} else {
			return new class398(this, 0, 0); // L: 131
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(CIII)Lpg;",
		garbageValue = "-605022274"
	)
	public class395 method7351(char var1, int var2, int var3) {
		return this.method7352(Character.toString(var1), var2, var3); // L: 135
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIB)Lpg;",
		garbageValue = "-78"
	)
	public class395 method7352(String var1, int var2, int var3) {
		if (var3 == 0) { // L: 139
			var3 = Integer.MAX_VALUE; // L: 140
		}

		int var4 = var2; // L: 142
		if (this.field4457.size() >= var3) { // L: 143
			this.method7359(var2, var2); // L: 144
			return new class395(var2, true); // L: 145
		} else {
			this.field4457.ensureCapacity(this.field4457.size() + var1.length()); // L: 147

			for (int var5 = 0; var5 < var1.length() && this.field4457.size() < var3; ++var5) { // L: 148
				class396 var6 = new class396(); // L: 149
				var6.field4465 = var1.charAt(var5); // L: 150
				this.field4457.add(var4, var6); // L: 151
				++var4; // L: 152
			}

			this.method7359(var2, var4); // L: 154
			if (this.field4451 != 0 && this.method7363() > this.field4451) { // L: 155
				while (var4 != var2) { // L: 157
					--var4; // L: 160
					this.method7356(var4); // L: 161
					if (this.method7363() <= this.field4451) { // L: 162
						break;
					}
				}

				return new class395(var4, true); // L: 163
			} else {
				return new class395(var4, false); // L: 166
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)Lpg;",
		garbageValue = "51"
	)
	class395 method7353(String var1, int var2) {
		return this.method7352(var1, this.field4457.size(), var2); // L: 171
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Lpg;",
		garbageValue = "58"
	)
	public class395 method7369(String var1) {
		this.method7378(); // L: 175
		return this.method7353(var1, 0); // L: 176
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "85"
	)
	void method7378() {
		this.field4457.clear(); // L: 180
	} // L: 181

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1158012862"
	)
	public int method7356(int var1) {
		return this.method7357(var1, var1 + 1); // L: 184
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-99"
	)
	public int method7357(int var1, int var2) {
		int var3;
		if (var2 < var1) { // L: 188
			var3 = var2; // L: 189
			var2 = var1; // L: 190
			var1 = var3; // L: 191
		}

		this.field4457.subList(var1, var2).clear(); // L: 193
		var3 = var1; // L: 194
		if (this.method7340() && this.field4448 == 1) { // L: 195
			while (var3 > 0) { // L: 196
				--var3; // L: 197
				char var4 = ((class396)this.field4457.get(var3)).field4465; // L: 198
				if (var4 == ' ' || var4 == '\t') { // L: 199
					break;
				}
			}
		}

		this.method7359(var3, var2); // L: 204
		return var1; // L: 205
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "34321638"
	)
	public int method7431(int var1, int var2) {
		if (this.field4456 == null) { // L: 209
			return 0;
		} else if (this.method7340() && var1 > this.field4450) { // L: 210
			return this.field4457.size();
		} else {
			if (!this.field4457.isEmpty()) { // L: 211
				for (int var3 = 0; var3 < this.field4457.size(); ++var3) { // L: 212
					class396 var4 = (class396)this.field4457.get(var3); // L: 213
					if (var2 <= var4.field4463 + this.method7384()) { // L: 214
						if (var2 < var4.field4463) { // L: 215
							break;
						}

						if (var1 < var4.field4464) { // L: 216
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (var3 + 1 != this.field4457.size() && ((class396)this.field4457.get(var3 + 1)).field4463 != var4.field4463) { // L: 217
							int var5 = this.method7365((class396)this.field4457.get(var3), false); // L: 218
							if (var1 < var5 + var4.field4464) { // L: 219
								return var3; // L: 220
							}

							if (var2 <= var4.field4463 + this.method7384()) { // L: 222
								return var3 + 1; // L: 223
							}
						}
					}
				}

				class396 var6 = (class396)this.field4457.get(this.field4457.size() - 1); // L: 228
				if (var1 >= var6.field4464 && var1 <= var6.field4464 + this.method7364() && var2 >= var6.field4463 && var2 <= var6.field4463 + this.method7384()) { // L: 229
					return this.field4457.size() - 1; // L: 230
				}
			}

			return this.field4457.size(); // L: 233
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "191715885"
	)
	public int method7425(int var1, int var2) {
		if (this.field4456 != null && !this.method7452() && var1 <= this.field4457.size()) { // L: 237
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
				class396 var6 = (class396)this.field4457.get(var1 - 1); // L: 249
				var4 = var6.field4464 + this.method7373(var1 - 1); // L: 250
				var5 = var6.field4463; // L: 251
			} else if (var3 == -1 && var1 == 0) { // L: 253
				return 0; // L: 254
			}

			int var14 = 16777215; // L: 256
			int var7 = 0; // L: 257
			int var8 = var1; // L: 258
			int var9 = 16777215; // L: 259
			int var10 = var3 == 1 ? this.field4457.size() + 1 : 0; // L: 260

			for (int var11 = var3 + var1; var11 != var10; var11 += var3) { // L: 261
				class396 var12 = (class396)this.field4457.get(var11 - 1); // L: 262
				if (var5 != var12.field4463) { // L: 263
					++var7; // L: 264
					var5 = var12.field4463; // L: 265
					if (var7 > var2) { // L: 266
						return var8; // L: 267
					}
				}

				if (var7 == var2) { // L: 270
					int var13 = Math.abs(var12.field4464 + this.method7373(var11 - 1) - var4); // L: 271
					if (var13 >= var9) { // L: 272
						return var8; // L: 277
					}

					var8 = var11; // L: 273
					var9 = var13; // L: 274
				}
			}

			if (var3 == 1) { // L: 281
				return this.field4457.size(); // L: 282
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-41"
	)
	public int method7360() {
		if (!this.field4457.isEmpty() && this.method7363() == 1) { // L: 298
			return this.field4457.isEmpty() ? 0 : ((class396)this.field4457.get(this.field4457.size() - 1)).field4464 + this.method7364(); // L: 299
		} else {
			int var1 = -1; // L: 302
			int var2 = 0; // L: 303

			for (int var3 = this.field4457.size() - 1; var3 >= 0; --var3) { // L: 304
				class396 var4 = (class396)this.field4457.get(var3); // L: 305
				if (var1 != var4.field4463) { // L: 306
					int var5 = this.method7365(var4, false) + var4.field4464; // L: 307
					var2 = Math.max(var5, var2); // L: 308
					var1 = var4.field4463; // L: 309
				}
			}

			return var2; // L: 312
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-21"
	)
	public int method7386() {
		return this.method7452() ? 0 : this.field4456.ascent + ((class396)this.field4457.get(this.field4457.size() - 1)).field4463; // L: 317
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2094735300"
	)
	public int method7384() {
		return this.field4454; // L: 321
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "245743381"
	)
	public int method7363() {
		return this.method7386() / this.field4456.ascent; // L: 325
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "822116987"
	)
	int method7364() {
		return this.method7452() ? 0 : this.method7365((class396)this.field4457.get(this.field4457.size() - 1), false); // L: 329
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1348679753"
	)
	public int method7423() {
		return this.field4450; // L: 333
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1216706180"
	)
	public int method7358() {
		return this.field4451; // L: 337
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1618242169"
	)
	public int method7355() {
		return this.field4448; // L: 341
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-37"
	)
	public int method7368() {
		return this.field4458; // L: 345
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1557073893"
	)
	public int method7421(int var1) {
		switch(this.field4452) { // L: 349
		case 0:
			return 0; // L: 351
		case 1:
			return var1 / 2; // L: 353
		case 2:
			return var1; // L: 355
		default:
			return 0; // L: 357
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-11"
	)
	public int method7370(int var1) {
		switch(this.field4453) { // L: 361
		case 0:
			return 0; // L: 365
		case 1:
			return var1 / 2; // L: 363
		case 2:
			return var1; // L: 367
		default:
			return 0; // L: 369
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-923517755"
	)
	void method7371() {
		this.method7359(0, this.field4457.size()); // L: 373
	} // L: 374

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "60"
	)
	void method7359(int var1, int var2) {
		if (!this.method7452() && this.field4456 != null) { // L: 377
			class485 var3 = this.method7375(var1, var2); // L: 378
			boolean var4 = (Integer)var3.field4964 == 0 && (Integer)var3.field4962 == this.field4457.size(); // L: 379
			int var5 = (Integer)var3.field4964; // L: 380
			int var6 = 0; // L: 381
			int var7 = var4 ? 0 : ((class396)this.field4457.get((Integer)var3.field4964)).field4463; // L: 382
			int var8 = 0; // L: 383

			int var9;
			for (var9 = (Integer)var3.field4964; var9 <= (Integer)var3.field4962; ++var9) { // L: 384
				boolean var10 = var9 >= this.field4457.size(); // L: 385
				class396 var21 = (class396)this.field4457.get(!var10 ? var9 : this.field4457.size() - 1); // L: 386
				int var22 = !var10 ? this.method7365(var21, false) : 0; // L: 387
				boolean var13 = !var10 && var21.field4465 == '\n'; // L: 388
				boolean var14 = !var10 && this.method7340() && var22 + var6 > this.field4450; // L: 389
				if (var13 || var14 || var10) { // L: 390
					int var15 = var9; // L: 391
					int var16 = 0; // L: 392
					int var17;
					int var18;
					class396 var19;
					if (var14) { // L: 393
						var17 = 0; // L: 394
						if (this.field4448 == 1) { // L: 395
							for (var18 = var9; var18 > var5; --var18) { // L: 396
								var19 = (class396)this.field4457.get(var18); // L: 397
								var17 += var18 < var15 ? this.method7365(var19, false) : 0; // L: 398
								if (var19.field4465 == ' ' || var19.field4465 == '\n') { // L: 399
									var15 = var18; // L: 400
									var6 -= var17; // L: 401
									var16 = var17; // L: 402
									break;
								}
							}
						}
					}

					var17 = -this.method7421(var6); // L: 408

					for (var18 = var5; var18 < var15; ++var18) { // L: 409
						var19 = (class396)this.field4457.get(var18); // L: 410
						int var20 = this.method7365(var19, false); // L: 411
						var19.field4464 = var17; // L: 412
						var19.field4463 = var7; // L: 413
						var17 += var20; // L: 414
					}

					var5 = var15; // L: 416
					var6 = var16; // L: 417
					var7 += this.method7384(); // L: 418
					++var8; // L: 419
				}

				var6 += !var10 ? var22 : 0; // L: 421
			}

			if (this.field4453 != 0 && var4) { // L: 423
				var9 = var8 * this.method7384(); // L: 424
				int var23 = this.method7370(var9); // L: 425

				for (int var11 = 0; var11 < this.field4457.size(); ++var11) { // L: 426
					class396 var12 = (class396)this.field4457.get(var11); // L: 427
					var12.field4463 -= var23; // L: 428
				}
			}

		}
	} // L: 431

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "44"
	)
	int method7373(int var1) {
		return var1 < this.field4457.size() ? this.method7365((class396)this.field4457.get(var1), false) : 0; // L: 434
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lpc;ZS)I",
		garbageValue = "-24345"
	)
	int method7365(class396 var1, boolean var2) {
		if (var1.field4465 == '\n') { // L: 438
			return 0;
		} else if (this.field4458 == 0) { // L: 439
			int var3 = this.field4456.advances[var1.field4465]; // L: 440
			if (var3 == 0) { // L: 441
				return var1.field4465 == '\t' ? this.field4456.advances[32] * 3 : this.field4456.advances[32]; // L: 442 443 446
			} else {
				return var3; // L: 450
			}
		} else {
			return this.field4456.advances[42]; // L: 454
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(III)Lsh;",
		garbageValue = "303261081"
	)
	class485 method7375(int var1, int var2) {
		int var3 = Math.min(var1, var2); // L: 459
		int var4 = Math.max(var1, var2); // L: 460
		int var5 = this.field4457.size(); // L: 461
		if (var3 == 0 && var4 == var5) { // L: 462
			return new class485(0, var5); // L: 463
		} else {
			int var6 = this.method7376(var3, false); // L: 465
			int var7 = this.method7377(var4, false); // L: 466
			int var8;
			switch(this.field4453) { // L: 467
			case 0:
				if (this.field4452 == 0) { // L: 480
					return new class485(var6, var5); // L: 481
				}

				var8 = this.method7376(var3, true); // L: 483
				return new class485(var8, var5); // L: 484
			case 1:
				return new class485(0, var5); // L: 477
			case 2:
				if (this.field4452 == 2) { // L: 470
					return new class485(0, var7); // L: 471
				}

				var8 = this.method7377(var4, true); // L: 473
				return new class485(0, var8); // L: 474
			default:
				return new class485(0, var5); // L: 487
			}
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IZB)I",
		garbageValue = "-60"
	)
	int method7376(int var1, boolean var2) {
		if (var1 < this.field4457.size()) { // L: 491
			int var3 = ((class396)this.field4457.get(var1)).field4463; // L: 492

			for (int var4 = var1; var4 > 0; --var4) { // L: 493
				if (((class396)this.field4457.get(var4 - 1)).field4463 < var3) { // L: 494
					if (!var2) { // L: 495
						return var4; // L: 496
					}

					var2 = false; // L: 498
					var3 = ((class396)this.field4457.get(var4 - 1)).field4463; // L: 499
				}
			}
		}

		return 0; // L: 503
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-689248013"
	)
	int method7377(int var1, boolean var2) {
		if (var1 < this.field4457.size()) { // L: 507
			int var3 = ((class396)this.field4457.get(var1)).field4463; // L: 508

			for (int var4 = var1; var4 < this.field4457.size() - 1; ++var4) { // L: 509
				if (((class396)this.field4457.get(var4 + 1)).field4463 > var3) { // L: 510
					if (!var2) { // L: 511
						return var4; // L: 512
					}

					var2 = false; // L: 514
					var3 = ((class396)this.field4457.get(var4 + 1)).field4463; // L: 515
				}
			}
		}

		return this.field4457.size(); // L: 519
	}
}
