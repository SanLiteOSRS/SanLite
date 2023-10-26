import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pp")
public class class409 {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1588449787
	)
	int field4503;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2098903433
	)
	int field4510;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1317961943
	)
	int field4505;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1771748723
	)
	int field4512;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1917451765
	)
	int field4513;
	@ObfuscatedName("aw")
	boolean field4514;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	AbstractFont field4506;
	@ObfuscatedName("az")
	ArrayList field4516;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 562309037
	)
	int field4517;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1714577535
	)
	int field4518;

	public class409() {
		this.field4503 = Integer.MAX_VALUE; // L: 22
		this.field4510 = Integer.MAX_VALUE; // L: 23
		this.field4505 = 0; // L: 24
		this.field4512 = 0; // L: 25
		this.field4513 = 0; // L: 26
		this.field4514 = true; // L: 27
		this.field4516 = new ArrayList(); // L: 29
		this.field4517 = 0; // L: 30
		this.field4518 = 0; // L: 31
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Lpe;",
		garbageValue = "391282708"
	)
	public class411 method7463(int var1) {
		return (class411)this.field4516.get(var1); // L: 34
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lpe;",
		garbageValue = "-2102583593"
	)
	class411 method7602() {
		return this.field4516.size() == 0 ? null : (class411)this.field4516.get(this.field4516.size() - 1); // L: 38 39
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-15"
	)
	public boolean method7477() {
		return this.field4516.size() == 0; // L: 43
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-122"
	)
	boolean method7466() {
		return this.field4510 > 1; // L: 47
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1628091187"
	)
	public int method7467() {
		return this.field4516.size(); // L: 51
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "1"
	)
	public String method7468() {
		if (this.method7477()) { // L: 55
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7467()); // L: 56

			for (int var2 = 0; var2 < this.method7467(); ++var2) { // L: 57
				class411 var3 = this.method7463(var2); // L: 58
				var1.append(var3.field4523); // L: 59
			}

			return var1.toString(); // L: 61
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1556362413"
	)
	public void method7527(int var1) {
		if (this.field4506 != null && var1 < this.field4506.ascent * 2) { // L: 65 66
			var1 = Integer.MAX_VALUE; // L: 67
		}

		if (this.field4503 != var1) { // L: 70
			this.field4503 = var1; // L: 71
			this.method7497(); // L: 72
		}

	} // L: 74

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "36"
	)
	public void method7470(int var1) {
		if (this.field4510 != var1) { // L: 77
			this.field4510 = var1; // L: 78
			this.method7497(); // L: 79
		}

	} // L: 81

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1148190983"
	)
	public void method7471(int var1) {
		if (this.field4518 != var1) { // L: 84
			this.field4518 = var1; // L: 85
			this.method7497(); // L: 86
		}

	} // L: 88

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lpk;I)V",
		garbageValue = "1676896473"
	)
	public void method7472(AbstractFont var1) {
		if (var1 != this.field4506) { // L: 91
			this.field4506 = var1; // L: 92
			if (this.field4506 != null) { // L: 93
				if (this.field4513 == 0) { // L: 94
					this.field4513 = this.field4506.ascent; // L: 95
				}

				if (!this.method7477()) { // L: 97
					this.method7497(); // L: 98
				}
			}
		}

	} // L: 102

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "903704871"
	)
	public void method7473(int var1) {
		if (this.field4517 != var1) { // L: 105
			this.field4517 = var1; // L: 106
			this.method7497(); // L: 107
		}

	} // L: 109

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "2058162248"
	)
	public boolean method7474(int var1, int var2) {
		if (this.field4505 != var1 || var2 != this.field4512) { // L: 112
			this.field4505 = var1; // L: 113
			this.field4512 = var2; // L: 114
			this.method7497(); // L: 115
		}

		return true; // L: 117
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1814750102"
	)
	public void method7475(int var1) {
		if (this.field4513 != var1) { // L: 121
			this.field4513 = var1; // L: 122
			this.method7497(); // L: 123
		}

	} // L: 125

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)Lpr;",
		garbageValue = "1762179013"
	)
	public class413 method7549(int var1, int var2) {
		if (var2 == var1) { // L: 128
			return new class413(this, 0, 0);
		} else if (var1 <= this.field4516.size() && var2 <= this.field4516.size()) { // L: 129
			return var2 < var1 ? new class413(this, var2, var1) : new class413(this, var1, var2); // L: 130
		} else {
			return new class413(this, 0, 0); // L: 131
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(CIIS)Lpb;",
		garbageValue = "7902"
	)
	public class410 method7583(char var1, int var2, int var3) {
		return this.method7478(Character.toString(var1), var2, var3); // L: 135
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIB)Lpb;",
		garbageValue = "-45"
	)
	public class410 method7478(String var1, int var2, int var3) {
		if (var3 == 0) { // L: 139
			var3 = Integer.MAX_VALUE; // L: 140
		}

		int var4 = var2; // L: 142
		if (this.field4516.size() >= var3) { // L: 143
			this.method7498(var2, var2); // L: 144
			return new class410(var2, true); // L: 145
		} else {
			this.field4516.ensureCapacity(this.field4516.size() + var1.length()); // L: 147

			for (int var5 = 0; var5 < var1.length() && this.field4516.size() < var3; ++var5) { // L: 148
				class411 var6 = new class411(); // L: 149
				var6.field4523 = var1.charAt(var5); // L: 150
				this.field4516.add(var4, var6); // L: 151
				++var4; // L: 152
			}

			this.method7498(var2, var4); // L: 154
			if (this.field4510 != 0 && this.method7489() > this.field4510) { // L: 155
				while (var4 != var2) { // L: 157
					--var4; // L: 160
					this.method7482(var4); // L: 161
					if (this.method7489() <= this.field4510) { // L: 162
						break;
					}
				}

				return new class410(var4, true); // L: 163
			} else {
				return new class410(var4, false); // L: 166
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lpb;",
		garbageValue = "-2106167498"
	)
	class410 method7479(String var1, int var2) {
		return this.method7478(var1, this.field4516.size(), var2); // L: 171
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lpb;",
		garbageValue = "-2022964950"
	)
	public class410 method7552(String var1) {
		this.method7481(); // L: 175
		return this.method7479(var1, 0); // L: 176
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-14773"
	)
	void method7481() {
		this.field4516.clear(); // L: 180
	} // L: 181

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "398036956"
	)
	public int method7482(int var1) {
		return this.method7483(var1, var1 + 1); // L: 184
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "895943109"
	)
	public int method7483(int var1, int var2) {
		int var3;
		if (var2 < var1) { // L: 188
			var3 = var2; // L: 189
			var2 = var1; // L: 190
			var1 = var3; // L: 191
		}

		this.field4516.subList(var1, var2).clear(); // L: 193
		var3 = var1; // L: 194
		if (this.method7466() && this.field4517 == 1) { // L: 195
			while (var3 > 0) { // L: 196
				--var3; // L: 197
				char var4 = ((class411)this.field4516.get(var3)).field4523; // L: 198
				if (var4 == ' ' || var4 == '\t') { // L: 199
					break;
				}
			}
		}

		this.method7498(var3, var2); // L: 204
		return var1; // L: 205
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1582951780"
	)
	public int method7484(int var1, int var2) {
		if (this.field4506 == null) { // L: 209
			return 0;
		} else if (this.method7466() && var1 > this.field4503) { // L: 210
			return this.field4516.size();
		} else {
			if (!this.field4516.isEmpty()) { // L: 211
				for (int var3 = 0; var3 < this.field4516.size(); ++var3) { // L: 212
					class411 var4 = (class411)this.field4516.get(var3); // L: 213
					if (var2 <= var4.field4525 + this.method7488()) { // L: 214
						if (var2 < var4.field4525) { // L: 215
							break;
						}

						if (var1 < var4.field4524) { // L: 216
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (1 + var3 != this.field4516.size() && ((class411)this.field4516.get(var3 + 1)).field4525 != var4.field4525) { // L: 217
							int var5 = this.method7578((class411)this.field4516.get(var3), false); // L: 218
							if (var1 < var5 + var4.field4524) { // L: 219
								return var3; // L: 220
							}

							if (var2 <= var4.field4525 + this.method7488()) { // L: 222
								return var3 + 1; // L: 223
							}
						}
					}
				}

				class411 var6 = (class411)this.field4516.get(this.field4516.size() - 1); // L: 228
				if (var1 >= var6.field4524 && var1 <= var6.field4524 + this.method7579() && var2 >= var6.field4525 && var2 <= var6.field4525 + this.method7488()) { // L: 229
					return this.field4516.size() - 1; // L: 230
				}
			}

			return this.field4516.size(); // L: 233
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1702844331"
	)
	public int method7485(int var1, int var2) {
		if (this.field4506 != null && !this.method7477() && var1 <= this.field4516.size()) { // L: 237
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
				class411 var6 = (class411)this.field4516.get(var1 - 1); // L: 249
				var4 = var6.field4524 + this.method7465(var1 - 1); // L: 250
				var5 = var6.field4525; // L: 251
			} else if (var3 == -1 && var1 == 0) { // L: 253
				return 0; // L: 254
			}

			int var14 = 16777215; // L: 256
			int var7 = 0; // L: 257
			int var8 = var1; // L: 258
			int var9 = 16777215; // L: 259
			int var10 = var3 == 1 ? this.field4516.size() + 1 : 0; // L: 260

			for (int var11 = var3 + var1; var10 != var11; var11 += var3) { // L: 261
				class411 var12 = (class411)this.field4516.get(var11 - 1); // L: 262
				if (var5 != var12.field4525) { // L: 263
					++var7; // L: 264
					var5 = var12.field4525; // L: 265
					if (var7 > var2) { // L: 266
						return var8; // L: 267
					}
				}

				if (var7 == var2) { // L: 270
					int var13 = Math.abs(var12.field4524 + this.method7465(var11 - 1) - var4); // L: 271
					if (var13 >= var9) { // L: 272
						return var8; // L: 277
					}

					var8 = var11; // L: 273
					var9 = var13; // L: 274
				}
			}

			if (var3 == 1) { // L: 281
				return this.field4516.size(); // L: 282
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-512196245"
	)
	public int method7486() {
		if (!this.field4516.isEmpty() && this.method7489() == 1) { // L: 298
			return this.field4516.isEmpty() ? 0 : ((class411)this.field4516.get(this.field4516.size() - 1)).field4524 + this.method7579(); // L: 299
		} else {
			int var1 = -1; // L: 302
			int var2 = 0; // L: 303

			for (int var3 = this.field4516.size() - 1; var3 >= 0; --var3) { // L: 304
				class411 var4 = (class411)this.field4516.get(var3); // L: 305
				if (var1 != var4.field4525) { // L: 306
					int var5 = this.method7578(var4, false) + var4.field4524; // L: 307
					var2 = Math.max(var5, var2); // L: 308
					var1 = var4.field4525; // L: 309
				}
			}

			return var2; // L: 312
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "67"
	)
	public int method7487() {
		return this.method7477() ? 0 : this.field4506.ascent + ((class411)this.field4516.get(this.field4516.size() - 1)).field4525; // L: 317
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-51"
	)
	public int method7488() {
		return this.field4513; // L: 321
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "458527670"
	)
	public int method7489() {
		return this.method7487() / this.field4506.ascent; // L: 325
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-317463978"
	)
	int method7579() {
		return this.method7477() ? 0 : this.method7578((class411)this.field4516.get(this.field4516.size() - 1), false); // L: 329
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "4"
	)
	public int method7476() {
		return this.field4503; // L: 333
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-59557509"
	)
	public int method7504() {
		return this.field4510; // L: 337
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1977390124"
	)
	public int method7493() {
		return this.field4517; // L: 341
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "13"
	)
	public int method7494() {
		return this.field4518; // L: 345
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1372497203"
	)
	public int method7495(int var1) {
		switch(this.field4505) { // L: 349
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

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1982314148"
	)
	public int method7595(int var1) {
		switch(this.field4512) { // L: 361
		case 0:
			return 0; // L: 367
		case 1:
			return var1 / 2; // L: 363
		case 2:
			return var1; // L: 365
		default:
			return 0; // L: 369
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2112190855"
	)
	void method7497() {
		this.method7498(0, this.field4516.size()); // L: 373
	} // L: 374

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2040581189"
	)
	void method7498(int var1, int var2) {
		if (!this.method7477() && this.field4506 != null) { // L: 377
			class500 var3 = this.method7501(var1, var2); // L: 378
			boolean var4 = (Integer)var3.field5003 == 0 && (Integer)var3.field5004 == this.field4516.size(); // L: 379
			int var5 = (Integer)var3.field5003; // L: 380
			int var6 = 0; // L: 381
			int var7 = var4 ? 0 : ((class411)this.field4516.get((Integer)var3.field5003)).field4525; // L: 382
			int var8 = 0; // L: 383

			int var9;
			for (var9 = (Integer)var3.field5003; var9 <= (Integer)var3.field5004; ++var9) { // L: 384
				boolean var10 = var9 >= this.field4516.size(); // L: 385
				class411 var21 = (class411)this.field4516.get(!var10 ? var9 : this.field4516.size() - 1); // L: 386
				int var22 = !var10 ? this.method7578(var21, false) : 0; // L: 387
				boolean var13 = !var10 && var21.field4523 == '\n'; // L: 388
				boolean var14 = !var10 && this.method7466() && var22 + var6 > this.field4503; // L: 389
				if (var13 || var14 || var10) { // L: 390
					int var15 = var9; // L: 391
					int var16 = 0; // L: 392
					int var17;
					int var18;
					class411 var19;
					if (var14) { // L: 393
						var17 = 0; // L: 394
						if (this.field4517 == 1) { // L: 395
							for (var18 = var9; var18 > var5; --var18) { // L: 396
								var19 = (class411)this.field4516.get(var18); // L: 397
								var17 += var18 < var15 ? this.method7578(var19, false) : 0; // L: 398
								if (var19.field4523 == ' ' || var19.field4523 == '\n') { // L: 399
									var15 = var18; // L: 400
									var6 -= var17; // L: 401
									var16 = var17; // L: 402
									break;
								}
							}
						}
					}

					var17 = -this.method7495(var6); // L: 408

					for (var18 = var5; var18 < var15; ++var18) { // L: 409
						var19 = (class411)this.field4516.get(var18); // L: 410
						int var20 = this.method7578(var19, false); // L: 411
						var19.field4524 = var17; // L: 412
						var19.field4525 = var7; // L: 413
						var17 += var20; // L: 414
					}

					var5 = var15; // L: 416
					var6 = var16; // L: 417
					var7 += this.method7488(); // L: 418
					++var8; // L: 419
				}

				var6 += !var10 ? var22 : 0; // L: 421
			}

			if (this.field4512 != 0 && var4) { // L: 423
				var9 = var8 * this.method7488(); // L: 424
				int var23 = this.method7595(var9); // L: 425

				for (int var11 = 0; var11 < this.field4516.size(); ++var11) { // L: 426
					class411 var12 = (class411)this.field4516.get(var11); // L: 427
					var12.field4525 -= var23; // L: 428
				}
			}

		}
	} // L: 431

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1039874623"
	)
	int method7465(int var1) {
		return var1 < this.field4516.size() ? this.method7578((class411)this.field4516.get(var1), false) : 0; // L: 434
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lpe;ZI)I",
		garbageValue = "1478006177"
	)
	int method7578(class411 var1, boolean var2) {
		if (var1.field4523 == '\n') { // L: 438
			return 0;
		} else if (this.field4518 == 0) { // L: 439
			int var3 = this.field4506.advances[var1.field4523]; // L: 440
			if (var3 == 0) { // L: 441
				return var1.field4523 == '\t' ? this.field4506.advances[32] * 3 : this.field4506.advances[32]; // L: 442 443 446
			} else {
				return var3; // L: 450
			}
		} else {
			return this.field4506.advances[42]; // L: 454
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(IIB)Ltw;",
		garbageValue = "26"
	)
	class500 method7501(int var1, int var2) {
		int var3 = Math.min(var1, var2); // L: 459
		int var4 = Math.max(var1, var2); // L: 460
		int var5 = this.field4516.size(); // L: 461
		if (var3 == 0 && var4 == var5) { // L: 462
			return new class500(0, var5); // L: 463
		} else {
			int var6 = this.method7502(var3, false); // L: 465
			int var7 = this.method7503(var4, false); // L: 466
			int var8;
			switch(this.field4512) { // L: 467
			case 0:
				if (this.field4505 == 0) { // L: 470
					return new class500(var6, var5); // L: 471
				}

				var8 = this.method7502(var3, true); // L: 473
				return new class500(var8, var5); // L: 474
			case 1:
				return new class500(0, var5); // L: 485
			case 2:
				if (this.field4505 == 2) { // L: 478
					return new class500(0, var7); // L: 479
				}

				var8 = this.method7503(var4, true); // L: 481
				return new class500(0, var8); // L: 482
			default:
				return new class500(0, var5); // L: 487
			}
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IZS)I",
		garbageValue = "-9654"
	)
	int method7502(int var1, boolean var2) {
		if (var1 < this.field4516.size()) { // L: 491
			int var3 = ((class411)this.field4516.get(var1)).field4525; // L: 492

			for (int var4 = var1; var4 > 0; --var4) { // L: 493
				if (((class411)this.field4516.get(var4 - 1)).field4525 < var3) { // L: 494
					if (!var2) { // L: 495
						return var4; // L: 496
					}

					var2 = false; // L: 498
					var3 = ((class411)this.field4516.get(var4 - 1)).field4525; // L: 499
				}
			}
		}

		return 0; // L: 503
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-1749016193"
	)
	int method7503(int var1, boolean var2) {
		if (var1 < this.field4516.size()) { // L: 507
			int var3 = ((class411)this.field4516.get(var1)).field4525; // L: 508

			for (int var4 = var1; var4 < this.field4516.size() - 1; ++var4) { // L: 509
				if (((class411)this.field4516.get(var4 + 1)).field4525 > var3) { // L: 510
					if (!var2) { // L: 511
						return var4; // L: 512
					}

					var2 = false; // L: 514
					var3 = ((class411)this.field4516.get(var4 + 1)).field4525; // L: 515
				}
			}
		}

		return this.field4516.size(); // L: 519
	}

	@ObfuscatedName("ov")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-1"
	)
	static void method7554(int var0) {
		if (var0 != Client.loginState) { // L: 12876
			Client.loginState = var0; // L: 12877
		}
	} // L: 12878
}
