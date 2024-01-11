import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("px")
public class class410 {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1474112745
	)
	int field4533;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 279928273
	)
	int field4534;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1391112247
	)
	int field4535;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -287439239
	)
	int field4536;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 177575975
	)
	int field4524;
	@ObfuscatedName("ab")
	boolean field4538;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	AbstractFont field4529;
	@ObfuscatedName("ai")
	ArrayList field4540;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1680495705
	)
	int field4541;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1299057227
	)
	int field4528;

	public class410() {
		this.field4533 = Integer.MAX_VALUE; // L: 22
		this.field4534 = Integer.MAX_VALUE; // L: 23
		this.field4535 = 0; // L: 24
		this.field4536 = 0; // L: 25
		this.field4524 = 0; // L: 26
		this.field4538 = true; // L: 27
		this.field4540 = new ArrayList(); // L: 29
		this.field4541 = 0; // L: 30
		this.field4528 = 0; // L: 31
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)Lpc;",
		garbageValue = "37"
	)
	public class412 method7603(int var1) {
		return (class412)this.field4540.get(var1); // L: 34
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Lpc;",
		garbageValue = "65"
	)
	class412 method7604() {
		return this.field4540.size() == 0 ? null : (class412)this.field4540.get(this.field4540.size() - 1); // L: 38 39
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1670700416"
	)
	public boolean method7605() {
		return this.field4540.size() == 0; // L: 43
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	boolean method7718() {
		return this.field4534 > 1; // L: 47
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "37"
	)
	public int method7701() {
		return this.field4540.size(); // L: 51
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "404384418"
	)
	public String method7608() {
		if (this.method7605()) { // L: 55
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7701()); // L: 56

			for (int var2 = 0; var2 < this.method7701(); ++var2) { // L: 57
				class412 var3 = this.method7603(var2); // L: 58
				var1.append(var3.field4545); // L: 59
			}

			return var1.toString(); // L: 61
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1806466912"
	)
	public void method7609(int var1) {
		if (this.field4529 != null && var1 < this.field4529.ascent * 2) { // L: 65 66
			var1 = Integer.MAX_VALUE; // L: 67
		}

		if (this.field4533 != var1) { // L: 70
			this.field4533 = var1; // L: 71
			this.method7650(); // L: 72
		}

	} // L: 74

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-100"
	)
	public void method7606(int var1) {
		if (this.field4534 != var1) { // L: 77
			this.field4534 = var1; // L: 78
			this.method7650(); // L: 79
		}

	} // L: 81

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1334958848"
	)
	public void method7611(int var1) {
		if (this.field4528 != var1) { // L: 84
			this.field4528 = var1; // L: 85
			this.method7650(); // L: 86
		}

	} // L: 88

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lpw;I)V",
		garbageValue = "1098246793"
	)
	public void method7610(AbstractFont var1) {
		if (var1 != this.field4529) { // L: 91
			this.field4529 = var1; // L: 92
			if (this.field4529 != null) { // L: 93
				if (this.field4524 == 0) { // L: 94
					this.field4524 = this.field4529.ascent; // L: 95
				}

				if (!this.method7605()) { // L: 97
					this.method7650(); // L: 98
				}
			}
		}

	} // L: 102

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1042043941"
	)
	public void method7674(int var1) {
		if (this.field4541 != var1) { // L: 105
			this.field4541 = var1; // L: 106
			this.method7650(); // L: 107
		}

	} // L: 109

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-581964094"
	)
	public boolean method7634(int var1, int var2) {
		if (this.field4535 != var1 || var2 != this.field4536) { // L: 112
			this.field4535 = var1; // L: 113
			this.field4536 = var2; // L: 114
			this.method7650(); // L: 115
		}

		return true; // L: 117
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "32"
	)
	public void method7735(int var1) {
		if (this.field4524 != var1) { // L: 121
			this.field4524 = var1; // L: 122
			this.method7650(); // L: 123
		}

	} // L: 125

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lpo;",
		garbageValue = "57"
	)
	public class414 method7616(int var1, int var2) {
		if (var2 == var1) { // L: 128
			return new class414(this, 0, 0);
		} else if (var1 <= this.field4540.size() && var2 <= this.field4540.size()) { // L: 129
			return var2 < var1 ? new class414(this, var2, var1) : new class414(this, var1, var2); // L: 130
		} else {
			return new class414(this, 0, 0); // L: 131
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(CIII)Lpi;",
		garbageValue = "120272136"
	)
	public class411 method7620(char var1, int var2, int var3) {
		return this.method7618(Character.toString(var1), var2, var3); // L: 135
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;III)Lpi;",
		garbageValue = "39755345"
	)
	public class411 method7618(String var1, int var2, int var3) {
		if (var3 == 0) { // L: 139
			var3 = Integer.MAX_VALUE; // L: 140
		}

		int var4 = var2; // L: 142
		if (this.field4540.size() >= var3) { // L: 143
			this.method7638(var2, var2); // L: 144
			return new class411(var2, true); // L: 145
		} else {
			this.field4540.ensureCapacity(this.field4540.size() + var1.length()); // L: 147

			for (int var5 = 0; var5 < var1.length() && this.field4540.size() < var3; ++var5) { // L: 148
				class412 var6 = new class412(); // L: 149
				var6.field4545 = var1.charAt(var5); // L: 150
				this.field4540.add(var4, var6); // L: 151
				++var4; // L: 152
			}

			this.method7638(var2, var4); // L: 154
			if (this.field4534 != 0 && this.method7629() > this.field4534) { // L: 155
				while (var4 != var2) { // L: 157
					--var4; // L: 160
					this.method7622(var4); // L: 161
					if (this.method7629() <= this.field4534) { // L: 162
						break;
					}
				}

				return new class411(var4, true); // L: 163
			} else {
				return new class411(var4, false); // L: 166
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)Lpi;",
		garbageValue = "-119"
	)
	class411 method7703(String var1, int var2) {
		return this.method7618(var1, this.field4540.size(), var2); // L: 171
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lpi;",
		garbageValue = "-802396749"
	)
	public class411 method7635(String var1) {
		this.method7621(); // L: 175
		return this.method7703(var1, 0); // L: 176
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1332297375"
	)
	void method7621() {
		this.field4540.clear(); // L: 180
	} // L: 181

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-473590389"
	)
	public int method7622(int var1) {
		return this.method7646(var1, var1 + 1); // L: 184
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1185034139"
	)
	public int method7646(int var1, int var2) {
		int var3;
		if (var2 < var1) { // L: 188
			var3 = var2; // L: 189
			var2 = var1; // L: 190
			var1 = var3; // L: 191
		}

		this.field4540.subList(var1, var2).clear(); // L: 193
		var3 = var1; // L: 194
		if (this.method7718() && this.field4541 == 1) { // L: 195
			while (var3 > 0) { // L: 196
				--var3; // L: 197
				char var4 = ((class412)this.field4540.get(var3)).field4545; // L: 198
				if (var4 == ' ' || var4 == '\t') { // L: 199
					break;
				}
			}
		}

		this.method7638(var3, var2); // L: 204
		return var1; // L: 205
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "25"
	)
	public int method7624(int var1, int var2) {
		if (this.field4529 == null) { // L: 209
			return 0;
		} else if (this.method7718() && var1 > this.field4533) { // L: 210
			return this.field4540.size();
		} else {
			if (!this.field4540.isEmpty()) { // L: 211
				for (int var3 = 0; var3 < this.field4540.size(); ++var3) { // L: 212
					class412 var4 = (class412)this.field4540.get(var3); // L: 213
					if (var2 <= var4.field4546 + this.method7628()) { // L: 214
						if (var2 < var4.field4546) { // L: 215
							break;
						}

						if (var1 < var4.field4544) { // L: 216
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (1 + var3 != this.field4540.size() && ((class412)this.field4540.get(var3 + 1)).field4546 != var4.field4546) { // L: 217
							int var5 = this.method7640((class412)this.field4540.get(var3), false); // L: 218
							if (var1 < var5 + var4.field4544) { // L: 219
								return var3; // L: 220
							}

							if (var2 <= var4.field4546 + this.method7628()) { // L: 222
								return var3 + 1; // L: 223
							}
						}
					}
				}

				class412 var6 = (class412)this.field4540.get(this.field4540.size() - 1); // L: 228
				if (var1 >= var6.field4544 && var1 <= var6.field4544 + this.method7658() && var2 >= var6.field4546 && var2 <= var6.field4546 + this.method7628()) { // L: 229
					return this.field4540.size() - 1; // L: 230
				}
			}

			return this.field4540.size(); // L: 233
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1413550972"
	)
	public int method7734(int var1, int var2) {
		if (this.field4529 != null && !this.method7605() && var1 <= this.field4540.size()) { // L: 237
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
				class412 var6 = (class412)this.field4540.get(var1 - 1); // L: 249
				var4 = var6.field4544 + this.method7693(var1 - 1); // L: 250
				var5 = var6.field4546; // L: 251
			} else if (var3 == -1 && var1 == 0) { // L: 253
				return 0; // L: 254
			}

			int var14 = 16777215; // L: 256
			int var7 = 0; // L: 257
			int var8 = var1; // L: 258
			int var9 = 16777215; // L: 259
			int var10 = var3 == 1 ? this.field4540.size() + 1 : 0; // L: 260

			for (int var11 = var3 + var1; var10 != var11; var11 += var3) { // L: 261
				class412 var12 = (class412)this.field4540.get(var11 - 1); // L: 262
				if (var5 != var12.field4546) { // L: 263
					++var7; // L: 264
					var5 = var12.field4546; // L: 265
					if (var7 > var2) { // L: 266
						return var8; // L: 267
					}
				}

				if (var7 == var2) { // L: 270
					int var13 = Math.abs(var12.field4544 + this.method7693(var11 - 1) - var4); // L: 271
					if (var13 >= var9) { // L: 272
						return var8; // L: 277
					}

					var8 = var11; // L: 273
					var9 = var13; // L: 274
				}
			}

			if (var3 == 1) { // L: 281
				return this.field4540.size(); // L: 282
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1266876120"
	)
	public int method7626() {
		if (!this.field4540.isEmpty() && this.method7629() == 1) { // L: 298
			return this.field4540.isEmpty() ? 0 : ((class412)this.field4540.get(this.field4540.size() - 1)).field4544 + this.method7658(); // L: 299
		} else {
			int var1 = -1; // L: 302
			int var2 = 0; // L: 303

			for (int var3 = this.field4540.size() - 1; var3 >= 0; --var3) { // L: 304
				class412 var4 = (class412)this.field4540.get(var3); // L: 305
				if (var1 != var4.field4546) { // L: 306
					int var5 = this.method7640(var4, false) + var4.field4544; // L: 307
					var2 = Math.max(var5, var2); // L: 308
					var1 = var4.field4546; // L: 309
				}
			}

			return var2; // L: 312
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-15823"
	)
	public int method7725() {
		return this.method7605() ? 0 : this.field4529.ascent + ((class412)this.field4540.get(this.field4540.size() - 1)).field4546; // L: 317
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1584925586"
	)
	public int method7628() {
		return this.field4524; // L: 321
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2094790441"
	)
	public int method7629() {
		return this.method7725() / this.field4529.ascent; // L: 325
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "466444559"
	)
	int method7658() {
		return this.method7605() ? 0 : this.method7640((class412)this.field4540.get(this.field4540.size() - 1), false); // L: 329
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "11"
	)
	public int method7631() {
		return this.field4533; // L: 333
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2053078791"
	)
	public int method7632() {
		return this.field4534; // L: 337
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "770454930"
	)
	public int method7633() {
		return this.field4541; // L: 341
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1064852684"
	)
	public int method7699() {
		return this.field4528; // L: 345
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-19"
	)
	public int method7623(int var1) {
		switch(this.field4535) { // L: 349
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

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1272661550"
	)
	public int method7636(int var1) {
		switch(this.field4536) { // L: 361
		case 0:
			return 0; // L: 365
		case 1:
			return var1 / 2; // L: 367
		case 2:
			return var1; // L: 363
		default:
			return 0; // L: 369
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "601733397"
	)
	void method7650() {
		this.method7638(0, this.field4540.size()); // L: 373
	} // L: 374

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-274568040"
	)
	void method7638(int var1, int var2) {
		if (!this.method7605() && this.field4529 != null) { // L: 377
			class501 var3 = this.method7683(var1, var2); // L: 378
			boolean var4 = (Integer)var3.field5041 == 0 && (Integer)var3.field5042 == this.field4540.size(); // L: 379
			int var5 = (Integer)var3.field5041; // L: 380
			int var6 = 0; // L: 381
			int var7 = var4 ? 0 : ((class412)this.field4540.get((Integer)var3.field5041)).field4546; // L: 382
			int var8 = 0; // L: 383

			int var9;
			for (var9 = (Integer)var3.field5041; var9 <= (Integer)var3.field5042; ++var9) { // L: 384
				boolean var10 = var9 >= this.field4540.size(); // L: 385
				class412 var21 = (class412)this.field4540.get(!var10 ? var9 : this.field4540.size() - 1); // L: 386
				int var22 = !var10 ? this.method7640(var21, false) : 0; // L: 387
				boolean var13 = !var10 && var21.field4545 == '\n'; // L: 388
				boolean var14 = !var10 && this.method7718() && var22 + var6 > this.field4533; // L: 389
				if (var13 || var14 || var10) { // L: 390
					int var15 = var9; // L: 391
					int var16 = 0; // L: 392
					int var17;
					int var18;
					class412 var19;
					if (var14) { // L: 393
						var17 = 0; // L: 394
						if (this.field4541 == 1) { // L: 395
							for (var18 = var9; var18 > var5; --var18) { // L: 396
								var19 = (class412)this.field4540.get(var18); // L: 397
								var17 += var18 < var15 ? this.method7640(var19, false) : 0; // L: 398
								if (var19.field4545 == ' ' || var19.field4545 == '\n') { // L: 399
									var15 = var18; // L: 400
									var6 -= var17; // L: 401
									var16 = var17; // L: 402
									break;
								}
							}
						}
					}

					var17 = -this.method7623(var6); // L: 408

					for (var18 = var5; var18 < var15; ++var18) { // L: 409
						var19 = (class412)this.field4540.get(var18); // L: 410
						int var20 = this.method7640(var19, false); // L: 411
						var19.field4544 = var17; // L: 412
						var19.field4546 = var7; // L: 413
						var17 += var20; // L: 414
					}

					var5 = var15; // L: 416
					var6 = var16; // L: 417
					var7 += this.method7628(); // L: 418
					++var8; // L: 419
				}

				var6 += !var10 ? var22 : 0; // L: 421
			}

			if (this.field4536 != 0 && var4) { // L: 423
				var9 = var8 * this.method7628(); // L: 424
				int var23 = this.method7636(var9); // L: 425

				for (int var11 = 0; var11 < this.field4540.size(); ++var11) { // L: 426
					class412 var12 = (class412)this.field4540.get(var11); // L: 427
					var12.field4546 -= var23; // L: 428
				}
			}

		}
	} // L: 431

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "250951846"
	)
	int method7693(int var1) {
		return var1 < this.field4540.size() ? this.method7640((class412)this.field4540.get(var1), false) : 0; // L: 434
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lpc;ZB)I",
		garbageValue = "-14"
	)
	int method7640(class412 var1, boolean var2) {
		if (var1.field4545 == '\n') { // L: 438
			return 0;
		} else if (this.field4528 == 0) { // L: 439
			int var3 = this.field4529.advances[var1.field4545]; // L: 440
			if (var3 == 0) { // L: 441
				return var1.field4545 == '\t' ? this.field4529.advances[32] * 3 : this.field4529.advances[32]; // L: 442 443 446
			} else {
				return var3; // L: 450
			}
		} else {
			return this.field4529.advances[42]; // L: 454
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(III)Ltg;",
		garbageValue = "-1753222514"
	)
	class501 method7683(int var1, int var2) {
		int var3 = Math.min(var1, var2); // L: 459
		int var4 = Math.max(var1, var2); // L: 460
		int var5 = this.field4540.size(); // L: 461
		if (var3 == 0 && var4 == var5) { // L: 462
			return new class501(0, var5); // L: 463
		} else {
			int var6 = this.method7642(var3, false); // L: 465
			int var7 = this.method7602(var4, false); // L: 466
			int var8;
			switch(this.field4536) { // L: 467
			case 0:
				if (this.field4535 == 0) { // L: 470
					return new class501(var6, var5); // L: 471
				}

				var8 = this.method7642(var3, true); // L: 473
				return new class501(var8, var5); // L: 474
			case 1:
				return new class501(0, var5); // L: 485
			case 2:
				if (this.field4535 == 2) { // L: 478
					return new class501(0, var7); // L: 479
				}

				var8 = this.method7602(var4, true); // L: 481
				return new class501(0, var8); // L: 482
			default:
				return new class501(0, var5); // L: 487
			}
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IZB)I",
		garbageValue = "120"
	)
	int method7642(int var1, boolean var2) {
		if (var1 < this.field4540.size()) { // L: 491
			int var3 = ((class412)this.field4540.get(var1)).field4546; // L: 492

			for (int var4 = var1; var4 > 0; --var4) { // L: 493
				if (((class412)this.field4540.get(var4 - 1)).field4546 < var3) { // L: 494
					if (!var2) { // L: 495
						return var4; // L: 496
					}

					var2 = false; // L: 498
					var3 = ((class412)this.field4540.get(var4 - 1)).field4546; // L: 499
				}
			}
		}

		return 0; // L: 503
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-520047140"
	)
	int method7602(int var1, boolean var2) {
		if (var1 < this.field4540.size()) { // L: 507
			int var3 = ((class412)this.field4540.get(var1)).field4546; // L: 508

			for (int var4 = var1; var4 < this.field4540.size() - 1; ++var4) { // L: 509
				if (((class412)this.field4540.get(var4 + 1)).field4546 > var3) { // L: 510
					if (!var2) { // L: 511
						return var4; // L: 512
					}

					var2 = false; // L: 514
					var3 = ((class412)this.field4540.get(var4 + 1)).field4546; // L: 515
				}
			}
		}

		return this.field4540.size(); // L: 519
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "63"
	)
	static final void method7742() {
		Client.field621 = 0; // L: 5720
		int var0 = HealthBarDefinition.baseX * 64 + (class25.localPlayer.x >> 7); // L: 5721
		int var1 = WorldMapScaleHandler.baseY * 64 + (class25.localPlayer.y >> 7); // L: 5722
		if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) { // L: 5723
			Client.field621 = 1;
		}

		if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) { // L: 5724
			Client.field621 = 1;
		}

		if (Client.field621 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) { // L: 5725
			Client.field621 = 0;
		}

	} // L: 5726
}
