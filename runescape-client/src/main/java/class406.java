import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pv")
public class class406 {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -109936177
	)
	int field4494;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -447744753
	)
	int field4503;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1365167301
	)
	int field4497;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1111353095
	)
	int field4500;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1955205547
	)
	int field4498;
	@ObfuscatedName("aw")
	boolean field4499;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	AbstractFont field4489;
	@ObfuscatedName("an")
	ArrayList field4501;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1384749697
	)
	int field4502;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 162079711
	)
	int field4505;

	public class406() {
		this.field4494 = Integer.MAX_VALUE; // L: 22
		this.field4503 = Integer.MAX_VALUE; // L: 23
		this.field4497 = 0; // L: 24
		this.field4500 = 0; // L: 25
		this.field4498 = 0; // L: 26
		this.field4499 = true; // L: 27
		this.field4501 = new ArrayList(); // L: 29
		this.field4502 = 0; // L: 30
		this.field4505 = 0; // L: 31
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lpn;",
		garbageValue = "-1648887293"
	)
	public class408 method7552(int var1) {
		return (class408)this.field4501.get(var1); // L: 34
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lpn;",
		garbageValue = "-1618780366"
	)
	class408 method7572() {
		return this.field4501.size() == 0 ? null : (class408)this.field4501.get(this.field4501.size() - 1); // L: 38 39
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2001561937"
	)
	public boolean method7520() {
		return this.field4501.size() == 0; // L: 43
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-607330455"
	)
	boolean method7521() {
		return this.field4503 > 1; // L: 47
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-917985217"
	)
	public int method7522() {
		return this.field4501.size(); // L: 51
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1548157009"
	)
	public String method7523() {
		if (this.method7520()) { // L: 55
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7522()); // L: 56

			for (int var2 = 0; var2 < this.method7522(); ++var2) { // L: 57
				class408 var3 = this.method7552(var2); // L: 58
				var1.append(var3.field4509); // L: 59
			}

			return var1.toString(); // L: 61
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1319008258"
	)
	public void method7524(int var1) {
		if (this.field4489 != null && var1 < this.field4489.ascent * 2) { // L: 65 66
			var1 = Integer.MAX_VALUE; // L: 67
		}

		if (this.field4494 != var1) { // L: 70
			this.field4494 = var1; // L: 71
			this.method7543(); // L: 72
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1206229207"
	)
	public void method7525(int var1) {
		if (this.field4503 != var1) { // L: 77
			this.field4503 = var1; // L: 78
			this.method7543(); // L: 79
		}

	} // L: 81

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2046388223"
	)
	public void method7526(int var1) {
		if (this.field4505 != var1) { // L: 84
			this.field4505 = var1; // L: 85
			this.method7543(); // L: 86
		}

	} // L: 88

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lpa;B)V",
		garbageValue = "83"
	)
	public void method7527(AbstractFont var1) {
		if (var1 != this.field4489) { // L: 91
			this.field4489 = var1; // L: 92
			if (this.field4489 != null) { // L: 93
				if (this.field4498 == 0) { // L: 94
					this.field4498 = this.field4489.ascent; // L: 95
				}

				if (!this.method7520()) { // L: 97
					this.method7543(); // L: 98
				}
			}
		}

	} // L: 102

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1301835621"
	)
	public void method7625(int var1) {
		if (this.field4502 != var1) { // L: 105
			this.field4502 = var1; // L: 106
			this.method7543(); // L: 107
		}

	} // L: 109

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "203029050"
	)
	public boolean method7529(int var1, int var2) {
		if (this.field4497 != var1 || var2 != this.field4500) { // L: 112
			this.field4497 = var1; // L: 113
			this.field4500 = var2; // L: 114
			this.method7543(); // L: 115
		}

		return true; // L: 117
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-36"
	)
	public void method7530(int var1) {
		if (this.field4498 != var1) { // L: 121
			this.field4498 = var1; // L: 122
			this.method7543(); // L: 123
		}

	} // L: 125

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lpd;",
		garbageValue = "-125"
	)
	public class410 method7531(int var1, int var2) {
		if (var2 == var1) { // L: 128
			return new class410(this, 0, 0);
		} else if (var1 <= this.field4501.size() && var2 <= this.field4501.size()) { // L: 129
			return var2 < var1 ? new class410(this, var2, var1) : new class410(this, var1, var2); // L: 130
		} else {
			return new class410(this, 0, 0); // L: 131
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(CIIB)Lpx;",
		garbageValue = "51"
	)
	public class407 method7631(char var1, int var2, int var3) {
		return this.method7533(Character.toString(var1), var2, var3); // L: 135
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;III)Lpx;",
		garbageValue = "1271891096"
	)
	public class407 method7533(String var1, int var2, int var3) {
		if (var3 == 0) { // L: 139
			var3 = Integer.MAX_VALUE; // L: 140
		}

		int var4 = var2; // L: 142
		if (this.field4501.size() >= var3) { // L: 143
			this.method7594(var2, var2); // L: 144
			return new class407(var2, true); // L: 145
		} else {
			this.field4501.ensureCapacity(this.field4501.size() + var1.length()); // L: 147

			for (int var5 = 0; var5 < var1.length() && this.field4501.size() < var3; ++var5) { // L: 148
				class408 var6 = new class408(); // L: 149
				var6.field4509 = var1.charAt(var5); // L: 150
				this.field4501.add(var4, var6); // L: 151
				++var4; // L: 152
			}

			this.method7594(var2, var4); // L: 154
			if (this.field4503 != 0 && this.method7544() > this.field4503) { // L: 155
				while (var4 != var2) { // L: 157
					--var4; // L: 160
					this.method7569(var4); // L: 161
					if (this.method7544() <= this.field4503) { // L: 162
						break;
					}
				}

				return new class407(var4, true); // L: 163
			} else {
				return new class407(var4, false); // L: 166
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)Lpx;",
		garbageValue = "-98"
	)
	class407 method7534(String var1, int var2) {
		return this.method7533(var1, this.field4501.size(), var2); // L: 171
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Lpx;",
		garbageValue = "-83"
	)
	public class407 method7535(String var1) {
		this.method7536(); // L: 175
		return this.method7534(var1, 0); // L: 176
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "95"
	)
	void method7536() {
		this.field4501.clear(); // L: 180
	} // L: 181

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-620955221"
	)
	public int method7569(int var1) {
		return this.method7538(var1, var1 + 1); // L: 184
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "58"
	)
	public int method7538(int var1, int var2) {
		int var3;
		if (var2 < var1) { // L: 188
			var3 = var2; // L: 189
			var2 = var1; // L: 190
			var1 = var3; // L: 191
		}

		this.field4501.subList(var1, var2).clear(); // L: 193
		var3 = var1; // L: 194
		if (this.method7521() && this.field4502 == 1) { // L: 195
			while (var3 > 0) { // L: 196
				--var3; // L: 197
				char var4 = ((class408)this.field4501.get(var3)).field4509; // L: 198
				if (var4 == ' ' || var4 == '\t') { // L: 199
					break;
				}
			}
		}

		this.method7594(var3, var2); // L: 204
		return var1; // L: 205
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-769092328"
	)
	public int method7539(int var1, int var2) {
		if (this.field4489 == null) { // L: 209
			return 0;
		} else if (this.method7521() && var1 > this.field4494) { // L: 210
			return this.field4501.size();
		} else {
			if (!this.field4501.isEmpty()) { // L: 211
				for (int var3 = 0; var3 < this.field4501.size(); ++var3) { // L: 212
					class408 var4 = (class408)this.field4501.get(var3); // L: 213
					if (var2 <= var4.field4507 + this.method7614()) { // L: 214
						if (var2 < var4.field4507) { // L: 215
							break;
						}

						if (var1 < var4.field4508) { // L: 216
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (1 + var3 != this.field4501.size() && ((class408)this.field4501.get(1 + var3)).field4507 != var4.field4507) { // L: 217
							int var5 = this.method7555((class408)this.field4501.get(var3), false); // L: 218
							if (var1 < var5 + var4.field4508) { // L: 219
								return var3; // L: 220
							}

							if (var2 <= var4.field4507 + this.method7614()) { // L: 222
								return var3 + 1; // L: 223
							}
						}
					}
				}

				class408 var6 = (class408)this.field4501.get(this.field4501.size() - 1); // L: 228
				if (var1 >= var6.field4508 && var1 <= var6.field4508 + this.method7545() && var2 >= var6.field4507 && var2 <= var6.field4507 + this.method7614()) { // L: 229
					return this.field4501.size() - 1; // L: 230
				}
			}

			return this.field4501.size(); // L: 233
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "795729934"
	)
	public int method7540(int var1, int var2) {
		if (this.field4489 != null && !this.method7520() && var1 <= this.field4501.size()) { // L: 237
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
				class408 var6 = (class408)this.field4501.get(var1 - 1); // L: 249
				var4 = var6.field4508 + this.method7610(var1 - 1); // L: 250
				var5 = var6.field4507; // L: 251
			} else if (var3 == -1 && var1 == 0) { // L: 253
				return 0; // L: 254
			}

			int var14 = 16777215; // L: 256
			int var7 = 0; // L: 257
			int var8 = var1; // L: 258
			int var9 = 16777215; // L: 259
			int var10 = var3 == 1 ? this.field4501.size() + 1 : 0; // L: 260

			for (int var11 = var3 + var1; var11 != var10; var11 += var3) { // L: 261
				class408 var12 = (class408)this.field4501.get(var11 - 1); // L: 262
				if (var5 != var12.field4507) { // L: 263
					++var7; // L: 264
					var5 = var12.field4507; // L: 265
					if (var7 > var2) { // L: 266
						return var8; // L: 267
					}
				}

				if (var7 == var2) { // L: 270
					int var13 = Math.abs(var12.field4508 + this.method7610(var11 - 1) - var4); // L: 271
					if (var13 >= var9) { // L: 272
						return var8; // L: 277
					}

					var8 = var11; // L: 273
					var9 = var13; // L: 274
				}
			}

			if (var3 == 1) { // L: 281
				return this.field4501.size(); // L: 282
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-612896858"
	)
	public int method7653() {
		if (!this.field4501.isEmpty() && this.method7544() == 1) { // L: 298
			return this.field4501.isEmpty() ? 0 : ((class408)this.field4501.get(this.field4501.size() - 1)).field4508 + this.method7545(); // L: 299
		} else {
			int var1 = -1; // L: 302
			int var2 = 0; // L: 303

			for (int var3 = this.field4501.size() - 1; var3 >= 0; --var3) { // L: 304
				class408 var4 = (class408)this.field4501.get(var3); // L: 305
				if (var1 != var4.field4507) { // L: 306
					int var5 = this.method7555(var4, false) + var4.field4508; // L: 307
					var2 = Math.max(var5, var2); // L: 308
					var1 = var4.field4507; // L: 309
				}
			}

			return var2; // L: 312
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "6"
	)
	public int method7618() {
		return this.method7520() ? 0 : this.field4489.ascent + ((class408)this.field4501.get(this.field4501.size() - 1)).field4507; // L: 317
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-593841574"
	)
	public int method7614() {
		return this.field4498; // L: 321
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "93"
	)
	public int method7544() {
		return this.method7618() / this.field4489.ascent; // L: 325
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-918826426"
	)
	int method7545() {
		return this.method7520() ? 0 : this.method7555((class408)this.field4501.get(this.field4501.size() - 1), false); // L: 329
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-379034894"
	)
	public int method7546() {
		return this.field4494; // L: 333
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2096364291"
	)
	public int method7547() {
		return this.field4503; // L: 337
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1926453895"
	)
	public int method7548() {
		return this.field4502; // L: 341
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-163729135"
	)
	public int method7549() {
		return this.field4505; // L: 345
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1438354732"
	)
	public int method7560(int var1) {
		switch(this.field4497) { // L: 349
		case 0:
			return 0; // L: 353
		case 1:
			return var1 / 2; // L: 355
		case 2:
			return var1; // L: 351
		default:
			return 0; // L: 357
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1172186374"
	)
	public int method7551(int var1) {
		switch(this.field4500) { // L: 361
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

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method7543() {
		this.method7594(0, this.field4501.size()); // L: 373
	} // L: 374

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "605694861"
	)
	void method7594(int var1, int var2) {
		if (!this.method7520() && this.field4489 != null) { // L: 377
			class497 var3 = this.method7556(var1, var2); // L: 378
			boolean var4 = (Integer)var3.field4996 == 0 && (Integer)var3.field4997 == this.field4501.size(); // L: 379
			int var5 = (Integer)var3.field4996; // L: 380
			int var6 = 0; // L: 381
			int var7 = var4 ? 0 : ((class408)this.field4501.get((Integer)var3.field4996)).field4507; // L: 382
			int var8 = 0; // L: 383

			int var9;
			for (var9 = (Integer)var3.field4996; var9 <= (Integer)var3.field4997; ++var9) { // L: 384
				boolean var10 = var9 >= this.field4501.size(); // L: 385
				class408 var21 = (class408)this.field4501.get(!var10 ? var9 : this.field4501.size() - 1); // L: 386
				int var22 = !var10 ? this.method7555(var21, false) : 0; // L: 387
				boolean var13 = !var10 && var21.field4509 == '\n'; // L: 388
				boolean var14 = !var10 && this.method7521() && var22 + var6 > this.field4494; // L: 389
				if (var13 || var14 || var10) { // L: 390
					int var15 = var9; // L: 391
					int var16 = 0; // L: 392
					int var17;
					int var18;
					class408 var19;
					if (var14) { // L: 393
						var17 = 0; // L: 394
						if (this.field4502 == 1) { // L: 395
							for (var18 = var9; var18 > var5; --var18) { // L: 396
								var19 = (class408)this.field4501.get(var18); // L: 397
								var17 += var18 < var15 ? this.method7555(var19, false) : 0; // L: 398
								if (var19.field4509 == ' ' || var19.field4509 == '\n') { // L: 399
									var15 = var18; // L: 400
									var6 -= var17; // L: 401
									var16 = var17; // L: 402
									break;
								}
							}
						}
					}

					var17 = -this.method7560(var6); // L: 408

					for (var18 = var5; var18 < var15; ++var18) { // L: 409
						var19 = (class408)this.field4501.get(var18); // L: 410
						int var20 = this.method7555(var19, false); // L: 411
						var19.field4508 = var17; // L: 412
						var19.field4507 = var7; // L: 413
						var17 += var20; // L: 414
					}

					var5 = var15; // L: 416
					var6 = var16; // L: 417
					var7 += this.method7614(); // L: 418
					++var8; // L: 419
				}

				var6 += !var10 ? var22 : 0; // L: 421
			}

			if (this.field4500 != 0 && var4) { // L: 423
				var9 = var8 * this.method7614(); // L: 424
				int var23 = this.method7551(var9); // L: 425

				for (int var11 = 0; var11 < this.field4501.size(); ++var11) { // L: 426
					class408 var12 = (class408)this.field4501.get(var11); // L: 427
					var12.field4507 -= var23; // L: 428
				}
			}

		}
	} // L: 431

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1124192376"
	)
	int method7610(int var1) {
		return var1 < this.field4501.size() ? this.method7555((class408)this.field4501.get(var1), false) : 0; // L: 434
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lpn;ZI)I",
		garbageValue = "2090126332"
	)
	int method7555(class408 var1, boolean var2) {
		if (var1.field4509 == '\n') { // L: 438
			return 0;
		} else if (this.field4505 == 0) { // L: 439
			int var3 = this.field4489.advances[var1.field4509]; // L: 440
			if (var3 == 0) { // L: 441
				return var1.field4509 == '\t' ? this.field4489.advances[32] * 3 : this.field4489.advances[32]; // L: 442 443 446
			} else {
				return var3; // L: 450
			}
		} else {
			return this.field4489.advances[42]; // L: 454
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(III)Lti;",
		garbageValue = "-139251767"
	)
	class497 method7556(int var1, int var2) {
		int var3 = Math.min(var1, var2); // L: 459
		int var4 = Math.max(var1, var2); // L: 460
		int var5 = this.field4501.size(); // L: 461
		if (var3 == 0 && var4 == var5) { // L: 462
			return new class497(0, var5); // L: 463
		} else {
			int var6 = this.method7557(var3, false); // L: 465
			int var7 = this.method7558(var4, false); // L: 466
			int var8;
			switch(this.field4500) { // L: 467
			case 0:
				if (this.field4497 == 0) { // L: 478
					return new class497(var6, var5); // L: 479
				}

				var8 = this.method7557(var3, true); // L: 481
				return new class497(var8, var5); // L: 482
			case 1:
				return new class497(0, var5); // L: 485
			case 2:
				if (this.field4497 == 2) { // L: 470
					return new class497(0, var7); // L: 471
				}

				var8 = this.method7558(var4, true); // L: 473
				return new class497(0, var8); // L: 474
			default:
				return new class497(0, var5); // L: 487
			}
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(IZB)I",
		garbageValue = "-36"
	)
	int method7557(int var1, boolean var2) {
		if (var1 < this.field4501.size()) { // L: 491
			int var3 = ((class408)this.field4501.get(var1)).field4507; // L: 492

			for (int var4 = var1; var4 > 0; --var4) { // L: 493
				if (((class408)this.field4501.get(var4 - 1)).field4507 < var3) { // L: 494
					if (!var2) { // L: 495
						return var4; // L: 496
					}

					var2 = false; // L: 498
					var3 = ((class408)this.field4501.get(var4 - 1)).field4507; // L: 499
				}
			}
		}

		return 0; // L: 503
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-1768880978"
	)
	int method7558(int var1, boolean var2) {
		if (var1 < this.field4501.size()) { // L: 507
			int var3 = ((class408)this.field4501.get(var1)).field4507; // L: 508

			for (int var4 = var1; var4 < this.field4501.size() - 1; ++var4) { // L: 509
				if (((class408)this.field4501.get(var4 + 1)).field4507 > var3) { // L: 510
					if (!var2) { // L: 511
						return var4; // L: 512
					}

					var2 = false; // L: 514
					var3 = ((class408)this.field4501.get(var4 + 1)).field4507; // L: 515
				}
			}
		}

		return this.field4501.size(); // L: 519
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lol;Lol;ZI)V",
		garbageValue = "-180086044"
	)
	public static void method7652(AbstractArchive var0, AbstractArchive var1, boolean var2) {
		ObjectComposition.ObjectDefinition_archive = var0; // L: 73
		ObjectComposition.ObjectDefinition_modelsArchive = var1; // L: 74
		ObjectComposition.ObjectDefinition_isLowDetail = var2; // L: 75
	} // L: 76

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "51"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (HealthBarDefinition.field1877.method6282(var0)) { // L: 11525
			AbstractWorldMapData.updateInterface(HealthBarDefinition.field1877.field3568[var0], -1, var1, var2, var3, var4, var5, var6); // L: 11526
		}
	} // L: 11527
}
