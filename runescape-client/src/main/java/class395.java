import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pt")
public class class395 {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -930702617
	)
	int field4467;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1580835775
	)
	int field4468;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1223370759
	)
	int field4469;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -875786785
	)
	int field4470;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 228261563
	)
	int field4473;
	@ObfuscatedName("ac")
	boolean field4462;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	AbstractFont field4461;
	@ObfuscatedName("an")
	ArrayList field4474;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1935199387
	)
	int field4475;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1874585937
	)
	int field4472;

	public class395() {
		this.field4467 = Integer.MAX_VALUE; // L: 22
		this.field4468 = Integer.MAX_VALUE;
		this.field4469 = 0;
		this.field4470 = 0; // L: 25
		this.field4473 = 0;
		this.field4462 = true;
		this.field4474 = new ArrayList();
		this.field4475 = 0; // L: 30
		this.field4472 = 0; // L: 31
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lpz;",
		garbageValue = "-1921326690"
	)
	public class397 method7312(int var1) {
		return (class397)this.field4474.get(var1); // L: 34
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Lpz;",
		garbageValue = "5"
	)
	class397 method7313() {
		return this.field4474.size() == 0 ? null : (class397)this.field4474.get(this.field4474.size() - 1); // L: 38 39
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1788834683"
	)
	public boolean method7314() {
		return this.field4474.size() == 0; // L: 43
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-45616913"
	)
	boolean method7315() {
		return this.field4468 > 1; // L: 47
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-520333390"
	)
	public int method7316() {
		return this.field4474.size(); // L: 51
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "370673788"
	)
	public String method7368() {
		if (this.method7314()) { // L: 55
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7316()); // L: 56

			for (int var2 = 0; var2 < this.method7316(); ++var2) { // L: 57
				class397 var3 = this.method7312(var2); // L: 58
				var1.append(var3.field4480); // L: 59
			}

			return var1.toString(); // L: 61
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "46"
	)
	public void method7384(int var1) {
		if (this.field4461 != null && var1 < this.field4461.ascent * 2) { // L: 65 66
			var1 = Integer.MAX_VALUE; // L: 67
		}

		if (this.field4467 != var1) { // L: 70
			this.field4467 = var1; // L: 71
			this.method7428(); // L: 72
		}

	} // L: 74

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "48068084"
	)
	public void method7319(int var1) {
		if (this.field4468 != var1) { // L: 77
			this.field4468 = var1; // L: 78
			this.method7428(); // L: 79
		}

	} // L: 81

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1944936240"
	)
	public void method7392(int var1) {
		if (this.field4472 != var1) { // L: 84
			this.field4472 = var1; // L: 85
			this.method7428(); // L: 86
		}

	} // L: 88

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpq;I)V",
		garbageValue = "-1981250546"
	)
	public void method7449(AbstractFont var1) {
		if (var1 != this.field4461) { // L: 91
			this.field4461 = var1; // L: 92
			if (this.field4461 != null) { // L: 93
				if (this.field4473 == 0) { // L: 94
					this.field4473 = this.field4461.ascent; // L: 95
				}

				if (!this.method7314()) { // L: 97
					this.method7428(); // L: 98
				}
			}
		}

	} // L: 102

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1972843844"
	)
	public void method7322(int var1) {
		if (this.field4475 != var1) { // L: 105
			this.field4475 = var1; // L: 106
			this.method7428(); // L: 107
		}

	} // L: 109

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1001647291"
	)
	public boolean method7323(int var1, int var2) {
		if (this.field4469 != var1 || var2 != this.field4470) { // L: 112
			this.field4469 = var1; // L: 113
			this.field4470 = var2; // L: 114
			this.method7428(); // L: 115
		}

		return true; // L: 117
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	public void method7317(int var1) {
		if (this.field4473 != var1) { // L: 121
			this.field4473 = var1; // L: 122
			this.method7428(); // L: 123
		}

	} // L: 125

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)Lpo;",
		garbageValue = "494218521"
	)
	public class399 method7422(int var1, int var2) {
		if (var2 == var1) { // L: 128
			return new class399(this, 0, 0);
		} else if (var1 <= this.field4474.size() && var2 <= this.field4474.size()) { // L: 129
			return var2 < var1 ? new class399(this, var2, var1) : new class399(this, var1, var2); // L: 130
		} else {
			return new class399(this, 0, 0); // L: 131
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(CIII)Lph;",
		garbageValue = "2008322061"
	)
	public class396 method7326(char var1, int var2, int var3) {
		return this.method7327(Character.toString(var1), var2, var3); // L: 135
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;III)Lph;",
		garbageValue = "-1597542040"
	)
	public class396 method7327(String var1, int var2, int var3) {
		if (var3 == 0) { // L: 139
			var3 = Integer.MAX_VALUE; // L: 140
		}

		int var4 = var2; // L: 142
		if (this.field4474.size() >= var3) { // L: 143
			this.method7347(var2, var2); // L: 144
			return new class396(var2, true); // L: 145
		} else {
			this.field4474.ensureCapacity(this.field4474.size() + var1.length()); // L: 147

			for (int var5 = 0; var5 < var1.length() && this.field4474.size() < var3; ++var5) { // L: 148
				class397 var6 = new class397(); // L: 149
				var6.field4480 = var1.charAt(var5); // L: 150
				this.field4474.add(var4, var6); // L: 151
				++var4; // L: 152
			}

			this.method7347(var2, var4); // L: 154
			if (this.field4468 != 0 && this.method7338() > this.field4468) { // L: 155
				while (var4 != var2) { // L: 157
					--var4; // L: 160
					this.method7437(var4); // L: 161
					if (this.method7338() <= this.field4468) { // L: 162
						break;
					}
				}

				return new class396(var4, true); // L: 163
			} else {
				return new class396(var4, false); // L: 166
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)Lph;",
		garbageValue = "-44"
	)
	class396 method7328(String var1, int var2) {
		return this.method7327(var1, this.field4474.size(), var2); // L: 171
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Lph;",
		garbageValue = "-46"
	)
	public class396 method7329(String var1) {
		this.method7330(); // L: 175
		return this.method7328(var1, 0); // L: 176
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-18"
	)
	void method7330() {
		this.field4474.clear(); // L: 180
	} // L: 181

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-93"
	)
	public int method7437(int var1) {
		return this.method7332(var1, var1 + 1); // L: 184
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "1"
	)
	public int method7332(int var1, int var2) {
		int var3;
		if (var2 < var1) { // L: 188
			var3 = var2; // L: 189
			var2 = var1; // L: 190
			var1 = var3; // L: 191
		}

		this.field4474.subList(var1, var2).clear(); // L: 193
		var3 = var1; // L: 194
		if (this.method7315() && this.field4475 == 1) { // L: 195
			while (var3 > 0) { // L: 196
				--var3; // L: 197
				char var4 = ((class397)this.field4474.get(var3)).field4480; // L: 198
				if (var4 == ' ' || var4 == '\t') { // L: 199
					break;
				}
			}
		}

		this.method7347(var3, var2); // L: 204
		return var1; // L: 205
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "62"
	)
	public int method7333(int var1, int var2) {
		if (this.field4461 == null) { // L: 209
			return 0;
		} else if (this.method7315() && var1 > this.field4467) { // L: 210
			return this.field4474.size();
		} else {
			if (!this.field4474.isEmpty()) { // L: 211
				for (int var3 = 0; var3 < this.field4474.size(); ++var3) { // L: 212
					class397 var4 = (class397)this.field4474.get(var3); // L: 213
					if (var2 <= var4.field4481 + this.method7351()) { // L: 214
						if (var2 < var4.field4481) { // L: 215
							break;
						}

						if (var1 < var4.field4479) { // L: 216
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (var3 + 1 != this.field4474.size() && ((class397)this.field4474.get(var3 + 1)).field4481 != var4.field4481) { // L: 217
							int var5 = this.method7346((class397)this.field4474.get(var3), false); // L: 218
							if (var1 < var5 + var4.field4479) { // L: 219
								return var3; // L: 220
							}

							if (var2 <= var4.field4481 + this.method7351()) { // L: 222
								return var3 + 1; // L: 223
							}
						}
					}
				}

				class397 var6 = (class397)this.field4474.get(this.field4474.size() - 1); // L: 228
				if (var1 >= var6.field4479 && var1 <= var6.field4479 + this.method7339() && var2 >= var6.field4481 && var2 <= var6.field4481 + this.method7351()) { // L: 229
					return this.field4474.size() - 1; // L: 230
				}
			}

			return this.field4474.size(); // L: 233
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1416421146"
	)
	public int method7334(int var1, int var2) {
		if (this.field4461 != null && !this.method7314() && var1 <= this.field4474.size()) { // L: 237
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
				class397 var6 = (class397)this.field4474.get(var1 - 1); // L: 249
				var4 = var6.field4479 + this.method7348(var1 - 1); // L: 250
				var5 = var6.field4481; // L: 251
			} else if (var3 == -1 && var1 == 0) { // L: 253
				return 0; // L: 254
			}

			int var14 = 16777215; // L: 256
			int var7 = 0; // L: 257
			int var8 = var1; // L: 258
			int var9 = 16777215; // L: 259
			int var10 = var3 == 1 ? this.field4474.size() + 1 : 0; // L: 260

			for (int var11 = var3 + var1; var10 != var11; var11 += var3) { // L: 261
				class397 var12 = (class397)this.field4474.get(var11 - 1); // L: 262
				if (var5 != var12.field4481) { // L: 263
					++var7; // L: 264
					var5 = var12.field4481; // L: 265
					if (var7 > var2) { // L: 266
						return var8; // L: 267
					}
				}

				if (var7 == var2) { // L: 270
					int var13 = Math.abs(var12.field4479 + this.method7348(var11 - 1) - var4); // L: 271
					if (var13 >= var9) { // L: 272
						return var8; // L: 277
					}

					var8 = var11; // L: 273
					var9 = var13; // L: 274
				}
			}

			if (var3 == 1) { // L: 281
				return this.field4474.size(); // L: 282
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "1557"
	)
	public int method7335() {
		if (!this.field4474.isEmpty() && this.method7338() == 1) { // L: 298
			return this.field4474.isEmpty() ? 0 : ((class397)this.field4474.get(this.field4474.size() - 1)).field4479 + this.method7339(); // L: 299
		} else {
			int var1 = -1; // L: 302
			int var2 = 0; // L: 303

			for (int var3 = this.field4474.size() - 1; var3 >= 0; --var3) { // L: 304
				class397 var4 = (class397)this.field4474.get(var3); // L: 305
				if (var1 != var4.field4481) { // L: 306
					int var5 = this.method7346(var4, false) + var4.field4479; // L: 307
					var2 = Math.max(var5, var2); // L: 308
					var1 = var4.field4481; // L: 309
				}
			}

			return var2; // L: 312
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1208537065"
	)
	public int method7318() {
		return this.method7314() ? 0 : this.field4461.ascent + ((class397)this.field4474.get(this.field4474.size() - 1)).field4481;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	public int method7351() {
		return this.field4473;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-3335"
	)
	public int method7338() {
		return this.method7318() / this.field4461.ascent; // L: 325
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-435208989"
	)
	int method7339() {
		return this.method7314() ? 0 : this.method7346((class397)this.field4474.get(this.field4474.size() - 1), false); // L: 329
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-156407630"
	)
	public int method7340() {
		return this.field4467; // L: 333
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-78"
	)
	public int method7341() {
		return this.field4468; // L: 337
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1411436568"
	)
	public int method7380() {
		return this.field4475; // L: 341
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1254279551"
	)
	public int method7343() {
		return this.field4472; // L: 345
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "0"
	)
	public int method7344(int var1) {
		switch(this.field4469) { // L: 349
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

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "47"
	)
	public int method7345(int var1) {
		switch(this.field4470) { // L: 361
		case 0:
			return 0; // L: 367
		case 1:
			return var1 / 2; // L: 365
		case 2:
			return var1; // L: 363
		default:
			return 0; // L: 369
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1723560040"
	)
	void method7428() {
		this.method7347(0, this.field4474.size()); // L: 373
	} // L: 374

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2083638926"
	)
	void method7347(int var1, int var2) {
		if (!this.method7314() && this.field4461 != null) { // L: 377
			class486 var3 = this.method7350(var1, var2); // L: 378
			boolean var4 = (Integer)var3.field4964 == 0 && (Integer)var3.field4962 == this.field4474.size(); // L: 379
			int var5 = (Integer)var3.field4964; // L: 380
			int var6 = 0; // L: 381
			int var7 = var4 ? 0 : ((class397)this.field4474.get((Integer)var3.field4964)).field4481; // L: 382
			int var8 = 0; // L: 383

			int var9;
			for (var9 = (Integer)var3.field4964; var9 <= (Integer)var3.field4962; ++var9) { // L: 384
				boolean var10 = var9 >= this.field4474.size(); // L: 385
				class397 var21 = (class397)this.field4474.get(!var10 ? var9 : this.field4474.size() - 1); // L: 386
				int var22 = !var10 ? this.method7346(var21, false) : 0; // L: 387
				boolean var13 = !var10 && var21.field4480 == '\n'; // L: 388
				boolean var14 = !var10 && this.method7315() && var6 + var22 > this.field4467; // L: 389
				if (var13 || var14 || var10) { // L: 390
					int var15 = var9; // L: 391
					int var16 = 0; // L: 392
					int var17;
					int var18;
					class397 var19;
					if (var14) { // L: 393
						var17 = 0; // L: 394
						if (this.field4475 == 1) { // L: 395
							for (var18 = var9; var18 > var5; --var18) { // L: 396
								var19 = (class397)this.field4474.get(var18); // L: 397
								var17 += var18 < var15 ? this.method7346(var19, false) : 0; // L: 398
								if (var19.field4480 == ' ' || var19.field4480 == '\n') { // L: 399
									var15 = var18; // L: 400
									var6 -= var17; // L: 401
									var16 = var17; // L: 402
									break;
								}
							}
						}
					}

					var17 = -this.method7344(var6); // L: 408

					for (var18 = var5; var18 < var15; ++var18) { // L: 409
						var19 = (class397)this.field4474.get(var18); // L: 410
						int var20 = this.method7346(var19, false); // L: 411
						var19.field4479 = var17; // L: 412
						var19.field4481 = var7; // L: 413
						var17 += var20; // L: 414
					}

					var5 = var15; // L: 416
					var6 = var16; // L: 417
					var7 += this.method7351(); // L: 418
					++var8; // L: 419
				}

				var6 += !var10 ? var22 : 0; // L: 421
			}

			if (this.field4470 != 0 && var4) { // L: 423
				var9 = var8 * this.method7351(); // L: 424
				int var23 = this.method7345(var9); // L: 425

				for (int var11 = 0; var11 < this.field4474.size(); ++var11) { // L: 426
					class397 var12 = (class397)this.field4474.get(var11); // L: 427
					var12.field4481 -= var23; // L: 428
				}
			}

		}
	} // L: 431

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-46"
	)
	int method7348(int var1) {
		return var1 < this.field4474.size() ? this.method7346((class397)this.field4474.get(var1), false) : 0; // L: 434
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lpz;ZB)I",
		garbageValue = "4"
	)
	int method7346(class397 var1, boolean var2) {
		if (var1.field4480 == '\n') { // L: 438
			return 0;
		} else if (this.field4472 == 0) { // L: 439
			int var3 = this.field4461.advances[var1.field4480]; // L: 440
			if (var3 == 0) { // L: 441
				return var1.field4480 == '\t' ? this.field4461.advances[32] * 3 : this.field4461.advances[32]; // L: 442 443 446
			} else {
				return var3; // L: 450
			}
		} else {
			return this.field4461.advances[42]; // L: 454
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lsf;",
		garbageValue = "-41"
	)
	class486 method7350(int var1, int var2) {
		int var3 = Math.min(var1, var2); // L: 459
		int var4 = Math.max(var1, var2); // L: 460
		int var5 = this.field4474.size(); // L: 461
		if (var3 == 0 && var4 == var5) { // L: 462
			return new class486(0, var5); // L: 463
		} else {
			int var6 = this.method7366(var3, false); // L: 465
			int var7 = this.method7352(var4, false); // L: 466
			int var8;
			switch(this.field4470) { // L: 467
			case 0:
				if (this.field4469 == 0) { // L: 472
					return new class486(var6, var5); // L: 473
				}

				var8 = this.method7366(var3, true); // L: 475
				return new class486(var8, var5); // L: 476
			case 1:
				return new class486(0, var5); // L: 469
			case 2:
				if (this.field4469 == 2) { // L: 480
					return new class486(0, var7); // L: 481
				}

				var8 = this.method7352(var4, true); // L: 483
				return new class486(0, var8); // L: 484
			default:
				return new class486(0, var5); // L: 487
			}
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "1702216179"
	)
	int method7366(int var1, boolean var2) {
		if (var1 < this.field4474.size()) { // L: 491
			int var3 = ((class397)this.field4474.get(var1)).field4481; // L: 492

			for (int var4 = var1; var4 > 0; --var4) { // L: 493
				if (((class397)this.field4474.get(var4 - 1)).field4481 < var3) { // L: 494
					if (!var2) { // L: 495
						return var4; // L: 496
					}

					var2 = false; // L: 498
					var3 = ((class397)this.field4474.get(var4 - 1)).field4481; // L: 499
				}
			}
		}

		return 0; // L: 503
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-1813129427"
	)
	int method7352(int var1, boolean var2) {
		if (var1 < this.field4474.size()) { // L: 507
			int var3 = ((class397)this.field4474.get(var1)).field4481; // L: 508

			for (int var4 = var1; var4 < this.field4474.size() - 1; ++var4) { // L: 509
				if (((class397)this.field4474.get(var4 + 1)).field4481 > var3) { // L: 510
					if (!var2) { // L: 511
						return var4; // L: 512
					}

					var2 = false; // L: 514
					var3 = ((class397)this.field4474.get(var4 + 1)).field4481; // L: 515
				}
			}
		}

		return this.field4474.size(); // L: 519
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Ltm;",
		garbageValue = "1693423022"
	)
	public static class503 method7456(int var0) {
		int var1 = class501.field5023[var0]; // L: 19
		if (var1 == 1) { // L: 20
			return class503.field5030; // L: 21
		} else if (var1 == 2) { // L: 23
			return class503.field5028; // L: 24
		} else {
			return var1 == 3 ? class503.field5027 : null; // L: 26 27 29
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1112737604"
	)
	static void method7331() {
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 317
			Login.currentLoginField = 1; // L: 318
		} else {
			Login.currentLoginField = 0; // L: 321
		}

	} // L: 323

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lpc;Lpc;Lpc;I)V",
		garbageValue = "680551313"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (GrandExchangeOfferTotalQuantityComparator.canvasWidth - 765) / 2; // L: 1359
		Login.loginBoxX = Login.xPadding + 202; // L: 1360
		Script.loginBoxCenter = Login.loginBoxX + 180; // L: 1361
		if (Login.worldSelectOpen) { // L: 1362
			WorldMapData_0.method5082(var0, var1); // L: 1363
		} else {
			class407.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1366
			ScriptFrame.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1367
			Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 1368
			int var4;
			if (Client.gameState == 0 || Client.gameState == 5) { // L: 1369
				byte var3 = 20; // L: 1370
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1); // L: 1371
				var4 = 253 - var3; // L: 1372
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409); // L: 1373
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0); // L: 1374
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409); // L: 1375
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.Login_loadingPercent * 3 + (Login.loginBoxX + 180 - 150), var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0); // L: 1376
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1); // L: 1377
			}

			String var5;
			String var7;
			String var8;
			int var9;
			char[] var10;
			int var11;
			short var19;
			int var20;
			short var21;
			if (Client.gameState == 20) { // L: 1379
				Login.titleboxSprite.drawAt(Login.loginBoxX + 180 - Login.titleboxSprite.subWidth / 2, 271 - Login.titleboxSprite.subHeight / 2); // L: 1380
				var19 = 201; // L: 1381
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var19, 16776960, 0); // L: 1382
				var20 = var19 + 15; // L: 1383
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var20, 16776960, 0); // L: 1384
				var20 += 15; // L: 1385
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var20, 16776960, 0); // L: 1386
				var20 += 15; // L: 1387
				var20 += 7; // L: 1388
				if (Login.loginIndex != 4 && Login.loginIndex != 10) { // L: 1389
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var20, 16777215, 0); // L: 1390
					var21 = 200; // L: 1391

					for (var5 = class14.method186(); var0.stringWidth(var5) > var21; var5 = var5.substring(0, var5.length() - 1)) { // L: 1392 1393 1394
					}

					var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var20, 16777215, 0); // L: 1396
					var20 += 15; // L: 1397
					var7 = Login.Login_password; // L: 1399
					var9 = var7.length(); // L: 1402
					var10 = new char[var9]; // L: 1404

					for (var11 = 0; var11 < var9; ++var11) { // L: 1405
						var10[var11] = '*';
					}

					var8 = new String(var10); // L: 1406

					for (var8 = var8; var0.stringWidth(var8) > var21; var8 = var8.substring(1)) { // L: 1410 1411 1412
					}

					var0.draw("Password: " + var8, Login.loginBoxX + 180 - 108, var20, 16777215, 0); // L: 1414
					var20 += 15; // L: 1415
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) { // L: 1418
				Login.titleboxSprite.drawAt(Login.loginBoxX, 171); // L: 1419
				short var13;
				if (Login.loginIndex == 0) { // L: 1420
					var19 = 251; // L: 1421
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var19, 16776960, 0); // L: 1422
					var20 = var19 + 30; // L: 1423
					var4 = Login.loginBoxX + 180 - 80; // L: 1424
					var13 = 291; // L: 1425
					Login.field923.drawAt(var4 - 73, var13 - 20); // L: 1426
					var0.drawLines("New User", var4 - 73, var13 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1427
					var4 = Login.loginBoxX + 180 + 80; // L: 1428
					Login.field923.drawAt(var4 - 73, var13 - 20); // L: 1429
					var0.drawLines("Existing User", var4 - 73, var13 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1430
				} else if (Login.loginIndex == 1) { // L: 1432
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0); // L: 1433
					var19 = 236; // L: 1434
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var19, 16777215, 0); // L: 1435
					var20 = var19 + 15; // L: 1436
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var20, 16777215, 0); // L: 1437
					var20 += 15; // L: 1438
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var20, 16777215, 0); // L: 1439
					var20 += 15; // L: 1440
					var4 = Login.loginBoxX + 180 - 80; // L: 1441
					var13 = 321; // L: 1442
					Login.field923.drawAt(var4 - 73, var13 - 20); // L: 1443
					var0.drawCentered("Continue", var4, var13 + 5, 16777215, 0); // L: 1444
					var4 = Login.loginBoxX + 180 + 80; // L: 1445
					Login.field923.drawAt(var4 - 73, var13 - 20); // L: 1446
					var0.drawCentered("Cancel", var4, var13 + 5, 16777215, 0); // L: 1447
				} else {
					short var12;
					IndexedSprite var22;
					if (Login.loginIndex == 2) { // L: 1449
						var19 = 201; // L: 1450
						var0.drawCentered(Login.Login_response1, Script.loginBoxCenter, var19, 16776960, 0); // L: 1451
						var20 = var19 + 15; // L: 1452
						var0.drawCentered(Login.Login_response2, Script.loginBoxCenter, var20, 16776960, 0); // L: 1453
						var20 += 15; // L: 1454
						var0.drawCentered(Login.Login_response3, Script.loginBoxCenter, var20, 16776960, 0); // L: 1455
						var20 += 15; // L: 1456
						var20 += 7; // L: 1457
						var0.draw("Login: ", Script.loginBoxCenter - 110, var20, 16777215, 0); // L: 1458
						var21 = 200; // L: 1459

						for (var5 = class14.method186(); var0.stringWidth(var5) > var21; var5 = var5.substring(1)) { // L: 1460 1461 1462
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? MusicPatchPcmStream.colorStartTag(16776960) + "|" : ""), Script.loginBoxCenter - 70, var20, 16777215, 0); // L: 1464
						var20 += 15; // L: 1465
						var7 = Login.Login_password; // L: 1467
						var9 = var7.length(); // L: 1470
						var10 = new char[var9]; // L: 1472

						for (var11 = 0; var11 < var9; ++var11) { // L: 1473
							var10[var11] = '*';
						}

						var8 = new String(var10); // L: 1474

						for (var8 = var8; var0.stringWidth(var8) > var21; var8 = var8.substring(1)) { // L: 1478 1479 1480
						}

						var0.draw("Password: " + var8 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? MusicPatchPcmStream.colorStartTag(16776960) + "|" : ""), Script.loginBoxCenter - 108, var20, 16777215, 0); // L: 1482
						var20 += 15; // L: 1483
						var19 = 277; // L: 1484
						var9 = Script.loginBoxCenter + -117; // L: 1485
						var22 = PcmPlayer.method780(Client.Login_isUsernameRemembered, Login.field955); // L: 1486
						var22.drawAt(var9, var19); // L: 1487
						var9 = var9 + var22.subWidth + 5; // L: 1488
						var1.draw("Remember username", var9, var19 + 13, 16776960, 0); // L: 1489
						var9 = Script.loginBoxCenter + 24; // L: 1490
						var22 = PcmPlayer.method780(class150.clientPreferences.method2467(), Login.field947); // L: 1491
						var22.drawAt(var9, var19); // L: 1492
						var9 = var9 + var22.subWidth + 5; // L: 1493
						var1.draw("Hide username", var9, var19 + 13, 16776960, 0); // L: 1494
						var20 = var19 + 15; // L: 1495
						var11 = Script.loginBoxCenter - 80; // L: 1496
						var12 = 321; // L: 1497
						Login.field923.drawAt(var11 - 73, var12 - 20); // L: 1498
						var0.drawCentered("Login", var11, var12 + 5, 16777215, 0); // L: 1499
						var11 = Script.loginBoxCenter + 80; // L: 1500
						Login.field923.drawAt(var11 - 73, var12 - 20); // L: 1501
						var0.drawCentered("Cancel", var11, var12 + 5, 16777215, 0); // L: 1502
						var19 = 357; // L: 1503
						switch(Login.field930) { // L: 1504
						case 2:
							MouseHandler.field234 = "Having trouble logging in?"; // L: 1509
							break;
						default:
							MouseHandler.field234 = "Can't login? Click here."; // L: 1506
						}

						class343.field3840 = new Bounds(Script.loginBoxCenter, var19, var1.stringWidth(MouseHandler.field234), 11); // L: 1512
						class313.field3475 = new Bounds(Script.loginBoxCenter, var19, var1.stringWidth("Still having trouble logging in?"), 11); // L: 1513
						var1.drawCentered(MouseHandler.field234, Script.loginBoxCenter, var19, 16777215, 0); // L: 1514
					} else if (Login.loginIndex == 3) { // L: 1516
						var19 = 201; // L: 1517
						var0.drawCentered("Incorrect username or password.", Login.loginBoxX + 180, var19, 16776960, 0); // L: 1518
						var20 = var19 + 20; // L: 1519
						var1.drawCentered("If you have upgraded to a Jagex Account, you", Login.loginBoxX + 180, var20, 16776960, 0); // L: 1520
						var20 += 20; // L: 1521
						var1.drawCentered("need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", Login.loginBoxX + 180, var20, 16776960, 0); // L: 1522
						var20 += 15; // L: 1523
						var4 = Login.loginBoxX + 180; // L: 1524
						var13 = 276; // L: 1525
						Login.field923.drawAt(var4 - 73, var13 - 20); // L: 1526
						var2.drawCentered("Try again", var4, var13 + 5, 16777215, 0); // L: 1527
						var4 = Login.loginBoxX + 180; // L: 1528
						var13 = 326; // L: 1529
						Login.field923.drawAt(var4 - 73, var13 - 20); // L: 1530
						var2.drawCentered("Forgotten password?", var4, var13 + 5, 16777215, 0); // L: 1531
					} else if (Login.loginIndex == 4) { // L: 1533
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1534
						var19 = 236; // L: 1535
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var19, 16777215, 0); // L: 1536
						var20 = var19 + 15; // L: 1537
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var20, 16777215, 0); // L: 1538
						var20 += 15; // L: 1539
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var20, 16777215, 0); // L: 1540
						var20 += 15; // L: 1541
						var5 = "PIN: "; // L: 1543
						var7 = Login.otp; // L: 1545
						var9 = var7.length(); // L: 1548
						var10 = new char[var9]; // L: 1550

						for (var11 = 0; var11 < var9; ++var11) { // L: 1551
							var10[var11] = '*';
						}

						var8 = new String(var10); // L: 1552
						var0.draw(var5 + var8 + (Client.cycle % 40 < 20 ? MusicPatchPcmStream.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var20, 16777215, 0); // L: 1556
						var20 -= 8; // L: 1557
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var20, 16776960, 0); // L: 1558
						var20 += 15; // L: 1559
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var20, 16776960, 0); // L: 1560
						int var16 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15; // L: 1561
						var9 = var20 - var0.ascent; // L: 1562
						if (Login.field943) { // L: 1564
							var22 = class11.field63; // L: 1565
						} else {
							var22 = WorldMapLabelSize.field2862; // L: 1568
						}

						var22.drawAt(var16, var9); // L: 1570
						var20 += 15; // L: 1571
						var11 = Login.loginBoxX + 180 - 80; // L: 1572
						var12 = 321; // L: 1573
						Login.field923.drawAt(var11 - 73, var12 - 20); // L: 1574
						var0.drawCentered("Continue", var11, var12 + 5, 16777215, 0); // L: 1575
						var11 = Login.loginBoxX + 180 + 80; // L: 1576
						Login.field923.drawAt(var11 - 73, var12 - 20); // L: 1577
						var0.drawCentered("Cancel", var11, var12 + 5, 16777215, 0); // L: 1578
						var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var12 + 36, 255, 0); // L: 1579
					} else if (Login.loginIndex == 5) { // L: 1581
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1582
						var19 = 221; // L: 1583
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var19, 16776960, 0); // L: 1584
						var20 = var19 + 15; // L: 1585
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var20, 16776960, 0); // L: 1586
						var20 += 15; // L: 1587
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var20, 16776960, 0); // L: 1588
						var20 += 15; // L: 1589
						var20 += 14; // L: 1590
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var20, 16777215, 0); // L: 1591
						var21 = 174; // L: 1592

						for (var5 = class14.method186(); var0.stringWidth(var5) > var21; var5 = var5.substring(1)) { // L: 1593 1594 1595
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? MusicPatchPcmStream.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var20, 16777215, 0); // L: 1597
						var20 += 15; // L: 1598
						int var17 = Login.loginBoxX + 180 - 80; // L: 1599
						short var15 = 321; // L: 1600
						Login.field923.drawAt(var17 - 73, var15 - 20); // L: 1601
						var0.drawCentered("Recover", var17, var15 + 5, 16777215, 0); // L: 1602
						var17 = Login.loginBoxX + 180 + 80; // L: 1603
						Login.field923.drawAt(var17 - 73, var15 - 20); // L: 1604
						var0.drawCentered("Back", var17, var15 + 5, 16777215, 0); // L: 1605
						var15 = 356; // L: 1606
						var1.drawCentered("Still having trouble logging in?", Script.loginBoxCenter, var15, 268435455, 0); // L: 1607
					} else if (Login.loginIndex == 6) { // L: 1609
						var19 = 201; // L: 1610
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var19, 16776960, 0); // L: 1611
						var20 = var19 + 15; // L: 1612
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var20, 16776960, 0); // L: 1613
						var20 += 15; // L: 1614
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var20, 16776960, 0); // L: 1615
						var20 += 15; // L: 1616
						var4 = Login.loginBoxX + 180; // L: 1617
						var13 = 321; // L: 1618
						Login.field923.drawAt(var4 - 73, var13 - 20); // L: 1619
						var0.drawCentered("Back", var4, var13 + 5, 16777215, 0); // L: 1620
					} else if (Login.loginIndex == 7) { // L: 1622
						if (Message.field506 && !Client.onMobile) { // L: 1623
							var19 = 201; // L: 1624
							var0.drawCentered(Login.Login_response1, Script.loginBoxCenter, var19, 16776960, 0); // L: 1625
							var20 = var19 + 15; // L: 1626
							var0.drawCentered(Login.Login_response2, Script.loginBoxCenter, var20, 16776960, 0); // L: 1627
							var20 += 15; // L: 1628
							var0.drawCentered(Login.Login_response3, Script.loginBoxCenter, var20, 16776960, 0); // L: 1629
							var4 = Script.loginBoxCenter - 150; // L: 1630
							var20 += 10; // L: 1631

							int var23;
							for (var23 = 0; var23 < 8; ++var23) { // L: 1632
								Login.field923.method9542(var4, var20, 30, 40); // L: 1633
								boolean var26 = var23 == Login.field938 & Client.cycle % 40 < 20; // L: 1634
								var0.draw((Login.field953[var23] == null ? "" : Login.field953[var23]) + (var26 ? MusicPatchPcmStream.colorStartTag(16776960) + "|" : ""), var4 + 10, var20 + 27, 16777215, 0); // L: 1635
								if (var23 != 1 && var23 != 3) { // L: 1636
									var4 += 35; // L: 1641
								} else {
									var4 += 50; // L: 1637
									var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var20 + 27, 16777215, 0); // L: 1638
								}
							}

							var23 = Script.loginBoxCenter - 80; // L: 1644
							short var27 = 321; // L: 1645
							Login.field923.drawAt(var23 - 73, var27 - 20); // L: 1646
							var0.drawCentered("Submit", var23, var27 + 5, 16777215, 0); // L: 1647
							var23 = Script.loginBoxCenter + 80; // L: 1648
							Login.field923.drawAt(var23 - 73, var27 - 20); // L: 1649
							var0.drawCentered("Cancel", var23, var27 + 5, 16777215, 0); // L: 1650
						} else {
							var19 = 216; // L: 1653
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var19, 16776960, 0); // L: 1654
							var20 = var19 + 15; // L: 1655
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var20, 16776960, 0); // L: 1656
							var20 += 15; // L: 1657
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var20, 16776960, 0); // L: 1658
							var20 += 15; // L: 1659
							var4 = Login.loginBoxX + 180 - 80; // L: 1660
							var13 = 321; // L: 1661
							Login.field923.drawAt(var4 - 73, var13 - 20); // L: 1662
							var0.drawCentered("Set Date of Birth", var4, var13 + 5, 16777215, 0); // L: 1663
							var4 = Login.loginBoxX + 180 + 80; // L: 1664
							Login.field923.drawAt(var4 - 73, var13 - 20); // L: 1665
							var0.drawCentered("Back", var4, var13 + 5, 16777215, 0); // L: 1666
						}
					} else if (Login.loginIndex == 8) { // L: 1669
						var19 = 216; // L: 1670
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var19, 16776960, 0); // L: 1671
						var20 = var19 + 15; // L: 1672
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var20, 16776960, 0); // L: 1673
						var20 += 15; // L: 1674
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var20, 16776960, 0); // L: 1675
						var20 += 15; // L: 1676
						var4 = Login.loginBoxX + 180 - 80; // L: 1677
						var13 = 321; // L: 1678
						Login.field923.drawAt(var4 - 73, var13 - 20); // L: 1679
						var0.drawCentered("Privacy Policy", var4, var13 + 5, 16777215, 0); // L: 1680
						var4 = Login.loginBoxX + 180 + 80; // L: 1681
						Login.field923.drawAt(var4 - 73, var13 - 20); // L: 1682
						var0.drawCentered("Back", var4, var13 + 5, 16777215, 0); // L: 1683
					} else if (Login.loginIndex == 9) { // L: 1685
						var19 = 221; // L: 1686
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var19, 16776960, 0); // L: 1687
						var20 = var19 + 25; // L: 1688
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var20, 16776960, 0); // L: 1689
						var20 += 25; // L: 1690
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var20, 16776960, 0); // L: 1691
						var4 = Login.loginBoxX + 180; // L: 1692
						var13 = 311; // L: 1693
						Login.field923.drawAt(var4 - 73, var13 - 20); // L: 1694
						var0.drawCentered("Try again", var4, var13 + 5, 16777215, 0); // L: 1695
					} else if (Login.loginIndex == 10) { // L: 1697
						var20 = Login.loginBoxX + 180; // L: 1698
						var21 = 209; // L: 1699
						var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var21, 16776960, 0); // L: 1700
						var4 = var21 + 20; // L: 1701
						Login.field924.drawAt(var20 - 109, var4); // L: 1702
						if (Login.field940.isEmpty()) { // L: 1703
							DirectByteArrayCopier.field3792.drawAt(var20 - 48, var4 + 18); // L: 1704
						} else {
							DirectByteArrayCopier.field3792.drawAt(var20 - 48, var4 + 5); // L: 1707
							var0.drawCentered(Login.field940, var20, var4 + 68 - 15, 16776960, 0); // L: 1708
						}
					} else if (Login.loginIndex == 12) { // L: 1711
						var20 = Script.loginBoxCenter; // L: 1712
						var21 = 216; // L: 1713
						var2.drawCentered("Before using this app, please read and accept our", var20, var21, 16777215, 0); // L: 1714
						var4 = var21 + 17; // L: 1715
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var20, var4, 16777215, 0); // L: 1716
						var4 += 17; // L: 1717
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var20, var4, 16777215, 0); // L: 1718
						var4 += 17; // L: 1719
						var2.drawCentered("By accepting, you agree to these documents.", var20, var4, 16777215, 0); // L: 1720
						var20 = Script.loginBoxCenter - 80; // L: 1721
						var21 = 311; // L: 1722
						Login.field923.drawAt(var20 - 73, var21 - 20); // L: 1723
						var0.drawCentered("Accept", var20, var21 + 5, 16777215, 0); // L: 1724
						var20 = Script.loginBoxCenter + 80; // L: 1725
						Login.field923.drawAt(var20 - 73, var21 - 20); // L: 1726
						var0.drawCentered("Decline", var20, var21 + 5, 16777215, 0); // L: 1727
					} else if (Login.loginIndex == 13) { // L: 1729
						var19 = 231; // L: 1730
						var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var19, 16777215, 0); // L: 1731
						var20 = var19 + 20; // L: 1732
						var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var20, 16777215, 0); // L: 1733
						var4 = Login.loginBoxX + 180; // L: 1734
						var19 = 311; // L: 1735
						Login.field923.drawAt(var4 - 73, var19 - 20); // L: 1736
						var0.drawCentered("Back", var4, var19 + 5, 16777215, 0); // L: 1737
					} else if (Login.loginIndex == 14) { // L: 1739
						var19 = 201; // L: 1740
						String var14 = ""; // L: 1741
						var5 = ""; // L: 1742
						String var6 = ""; // L: 1743
						switch(Login.field929) { // L: 1744
						case 0:
							var14 = "Your account has been involved"; // L: 1766
							var5 = "in serious rule breaking."; // L: 1767
							var6 = ""; // L: 1768
							break;
						case 1:
							var14 = "Your account has been locked due to"; // L: 1759
							var5 = "suspicious activity."; // L: 1760
							var6 = "Please recover your account."; // L: 1761
							break; // L: 1762
						case 2:
							var14 = "The unpaid balance on your account needs"; // L: 1747
							var5 = "to be resolved before you can play."; // L: 1748
							var6 = class352.field4146; // L: 1749
							break;
						default:
							PlayerComposition.Login_promptCredentials(false); // L: 1754
						}

						var0.drawCentered(var14, Login.loginBoxX + 180, var19, 16776960, 0); // L: 1772
						var20 = var19 + 20; // L: 1773
						var0.drawCentered(var5, Login.loginBoxX + 180, var20, 16776960, 0); // L: 1774
						var20 += 20; // L: 1775
						var0.drawCentered(var6, Login.loginBoxX + 180, var20, 16776960, 0); // L: 1776
						int var24 = Login.loginBoxX + 180; // L: 1777
						short var25 = 276; // L: 1778
						Login.field923.drawAt(var24 - 73, var25 - 20); // L: 1779
						if (Login.field929 == 1) { // L: 1780
							var0.drawCentered("Recover Account", var24, var25 + 5, 16777215, 0); // L: 1781
						} else {
							var0.drawCentered("View Appeal Options", var24, var25 + 5, 16777215, 0); // L: 1784
						}

						var24 = Login.loginBoxX + 180; // L: 1786
						var25 = 326; // L: 1787
						Login.field923.drawAt(var24 - 73, var25 - 20); // L: 1788
						var0.drawCentered("Back", var24, var25 + 5, 16777215, 0); // L: 1789
					} else if (Login.loginIndex == 24) { // L: 1791
						var19 = 221; // L: 1792
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var19, 16777215, 0); // L: 1793
						var20 = var19 + 15; // L: 1794
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var20, 16777215, 0); // L: 1795
						var20 += 15; // L: 1796
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var20, 16777215, 0); // L: 1797
						var20 += 15; // L: 1798
						var4 = Login.loginBoxX + 180; // L: 1799
						var13 = 301; // L: 1800
						Login.field923.drawAt(var4 - 73, var13 - 20); // L: 1801
						var0.drawCentered("Ok", var4, var13 + 5, 16777215, 0); // L: 1802
					} else if (Login.loginIndex == 32) { // L: 1804
						var19 = 216; // L: 1805
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var19, 16776960, 0); // L: 1806
						var20 = var19 + 15; // L: 1807
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var20, 16776960, 0); // L: 1808
						var20 += 15; // L: 1809
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var20, 16776960, 0); // L: 1810
						var20 += 15; // L: 1811
						var4 = Login.loginBoxX + 180 - 80; // L: 1812
						var13 = 321; // L: 1813
						Login.field923.drawAt(var4 - 73, var13 - 20); // L: 1814
						var0.drawCentered("Set Date of Birth", var4, var13 + 5, 16777215, 0); // L: 1815
						var4 = Login.loginBoxX + 180 + 80; // L: 1816
						Login.field923.drawAt(var4 - 73, var13 - 20); // L: 1817
						var0.drawCentered("Back", var4, var13 + 5, 16777215, 0); // L: 1818
					} else if (Login.loginIndex == 33) { // L: 1820
						var19 = 201; // L: 1821
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var19, 16776960, 0); // L: 1822
						var20 = var19 + 20; // L: 1823
						var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var20, 16776960, 0); // L: 1824
						var20 += 20; // L: 1825
						var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var20, 16776960, 0); // L: 1826
						var20 += 15; // L: 1827
						var4 = Login.loginBoxX + 180; // L: 1828
						var13 = 276; // L: 1829
						Login.field923.drawAt(var4 - 73, var13 - 20); // L: 1830
						var2.drawCentered("Download Launcher", var4, var13 + 5, 16777215, 0); // L: 1831
						var4 = Login.loginBoxX + 180; // L: 1832
						var13 = 326; // L: 1833
						Login.field923.drawAt(var4 - 73, var13 - 20); // L: 1834
						var2.drawCentered("Back", var4, var13 + 5, 16777215, 0); // L: 1835
					}
				}
			}

			if (Client.gameState >= 10) { // L: 1838
				int[] var18 = new int[4]; // L: 1839
				Rasterizer2D.Rasterizer2D_getClipArray(var18); // L: 1840
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, WorldMapArchiveLoader.canvasHeight); // L: 1841
				class165.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle); // L: 1842
				class165.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle); // L: 1843
				Rasterizer2D.Rasterizer2D_setClipArray(var18); // L: 1844
			}

			class304.title_muteSprite[class150.clientPreferences.method2469() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463); // L: 1846
			if (Client.gameState > 5 && Language.Language_EN == Interpreter.clientLanguage) { // L: 1847
				if (class465.field4784 != null) { // L: 1848
					var20 = Login.xPadding + 5; // L: 1849
					var21 = 463; // L: 1850
					byte var28 = 100; // L: 1851
					byte var29 = 35; // L: 1852
					class465.field4784.drawAt(var20, var21); // L: 1853
					var0.drawCentered("World" + " " + Client.worldId, var28 / 2 + var20, var29 / 2 + var21 - 2, 16777215, 0); // L: 1854
					if (World.World_request != null) { // L: 1855
						var1.drawCentered("Loading...", var28 / 2 + var20, var29 / 2 + var21 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var28 / 2 + var20, var29 / 2 + var21 + 12, 16777215, 0); // L: 1856
					}
				} else {
					class465.field4784 = class451.SpriteBuffer_getIndexedSpriteByName(class386.field4436, "sl_button", ""); // L: 1859
				}
			}

		}
	} // L: 1364 1862
}
