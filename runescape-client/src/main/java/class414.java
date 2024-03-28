import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("pl")
public class class414 {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -588286243
	)
	int field4594;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1017194117
	)
	int field4595;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2020790823
	)
	int field4597;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -236109549
	)
	int field4588;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1772364515
	)
	int field4598;
	@ObfuscatedName("aa")
	boolean field4599;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	AbstractFont field4602;
	@ObfuscatedName("am")
	ArrayList field4601;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -989964373
	)
	int field4589;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1411711645
	)
	int field4603;

	public class414() {
		this.field4594 = Integer.MAX_VALUE; // L: 22
		this.field4595 = Integer.MAX_VALUE; // L: 23
		this.field4597 = 0; // L: 24
		this.field4588 = 0; // L: 25
		this.field4598 = 0; // L: 26
		this.field4599 = true; // L: 27
		this.field4601 = new ArrayList(); // L: 29
		this.field4589 = 0; // L: 30
		this.field4603 = 0; // L: 31
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Lqt;",
		garbageValue = "1881970922"
	)
	public class416 method7509(int var1) {
		return (class416)this.field4601.get(var1); // L: 34
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lqt;",
		garbageValue = "811849070"
	)
	class416 method7536() {
		return this.field4601.size() == 0 ? null : (class416)this.field4601.get(this.field4601.size() - 1); // L: 38 39
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1979767872"
	)
	public boolean method7566() {
		return this.field4601.size() == 0; // L: 43
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2117760630"
	)
	boolean method7512() {
		return this.field4595 > 1; // L: 47
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1729552299"
	)
	public int method7513() {
		return this.field4601.size(); // L: 51
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1922526698"
	)
	public String method7539() {
		if (this.method7566()) { // L: 55
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7513()); // L: 56

			for (int var2 = 0; var2 < this.method7513(); ++var2) { // L: 57
				class416 var3 = this.method7509(var2); // L: 58
				var1.append(var3.field4607); // L: 59
			}

			return var1.toString(); // L: 61
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-328663437"
	)
	public void method7515(int var1) {
		if (this.field4602 != null && var1 < this.field4602.ascent * 2) { // L: 65 66
			var1 = Integer.MAX_VALUE; // L: 67
		}

		if (this.field4594 != var1) { // L: 70
			this.field4594 = var1; // L: 71
			this.method7609(); // L: 72
		}

	} // L: 74

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2099925001"
	)
	public void method7560(int var1) {
		if (this.field4595 != var1) { // L: 77
			this.field4595 = var1; // L: 78
			this.method7609(); // L: 79
		}

	} // L: 81

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-35"
	)
	public void method7618(int var1) {
		if (this.field4603 != var1) { // L: 84
			this.field4603 = var1; // L: 85
			this.method7609(); // L: 86
		}

	} // L: 88

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lqu;I)V",
		garbageValue = "-22972686"
	)
	public void method7518(AbstractFont var1) {
		if (var1 != this.field4602) { // L: 91
			this.field4602 = var1; // L: 92
			if (this.field4602 != null) { // L: 93
				if (this.field4598 == 0) { // L: 94
					this.field4598 = this.field4602.ascent; // L: 95
				}

				if (!this.method7566()) { // L: 97
					this.method7609(); // L: 98
				}
			}
		}

	} // L: 102

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1651583512"
	)
	public void method7519(int var1) {
		if (this.field4589 != var1) { // L: 105
			this.field4589 = var1; // L: 106
			this.method7609(); // L: 107
		}

	} // L: 109

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1516408267"
	)
	public boolean method7520(int var1, int var2) {
		if (this.field4597 != var1 || var2 != this.field4588) { // L: 112
			this.field4597 = var1; // L: 113
			this.field4588 = var2; // L: 114
			this.method7609(); // L: 115
		}

		return true; // L: 117
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "98"
	)
	public void method7514(int var1) {
		if (this.field4598 != var1) { // L: 121
			this.field4598 = var1; // L: 122
			this.method7609(); // L: 123
		}

	} // L: 125

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lqs;",
		garbageValue = "40"
	)
	public class418 method7522(int var1, int var2) {
		if (var2 == var1) { // L: 128
			return new class418(this, 0, 0);
		} else if (var1 <= this.field4601.size() && var2 <= this.field4601.size()) { // L: 129
			return var2 < var1 ? new class418(this, var2, var1) : new class418(this, var1, var2); // L: 130
		} else {
			return new class418(this, 0, 0); // L: 131
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(CIII)Lpf;",
		garbageValue = "-1858024048"
	)
	public class415 method7523(char var1, int var2, int var3) {
		return this.method7524(Character.toString(var1), var2, var3); // L: 135
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIB)Lpf;",
		garbageValue = "0"
	)
	public class415 method7524(String var1, int var2, int var3) {
		if (var3 == 0) { // L: 139
			var3 = Integer.MAX_VALUE; // L: 140
		}

		int var4 = var2; // L: 142
		if (this.field4601.size() >= var3) { // L: 143
			this.method7543(var2, var2); // L: 144
			return new class415(var2, true); // L: 145
		} else {
			this.field4601.ensureCapacity(this.field4601.size() + var1.length()); // L: 147

			for (int var5 = 0; var5 < var1.length() && this.field4601.size() < var3; ++var5) { // L: 148
				class416 var6 = new class416(); // L: 149
				var6.field4607 = var1.charAt(var5); // L: 150
				this.field4601.add(var4, var6); // L: 151
				++var4; // L: 152
			}

			this.method7543(var2, var4); // L: 154
			if (this.field4595 != 0 && this.method7535() > this.field4595) { // L: 155
				while (var4 != var2) { // L: 157
					--var4; // L: 160
					this.method7579(var4); // L: 161
					if (this.method7535() <= this.field4595) { // L: 162
						break;
					}
				}

				return new class415(var4, true); // L: 163
			} else {
				return new class415(var4, false); // L: 166
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lpf;",
		garbageValue = "1324056167"
	)
	class415 method7525(String var1, int var2) {
		return this.method7524(var1, this.field4601.size(), var2); // L: 171
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Lpf;",
		garbageValue = "46"
	)
	public class415 method7531(String var1) {
		this.method7562(); // L: 175
		return this.method7525(var1, 0); // L: 176
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "138770399"
	)
	void method7562() {
		this.field4601.clear(); // L: 180
	} // L: 181

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "412178640"
	)
	public int method7579(int var1) {
		return this.method7529(var1, var1 + 1); // L: 184
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "49298"
	)
	public int method7529(int var1, int var2) {
		int var3;
		if (var2 < var1) { // L: 188
			var3 = var2; // L: 189
			var2 = var1; // L: 190
			var1 = var3; // L: 191
		}

		this.field4601.subList(var1, var2).clear(); // L: 193
		var3 = var1; // L: 194
		if (this.method7512() && this.field4589 == 1) { // L: 195
			while (var3 > 0) { // L: 196
				--var3; // L: 197
				char var4 = ((class416)this.field4601.get(var3)).field4607; // L: 198
				if (var4 == ' ' || var4 == '\t') { // L: 199
					break;
				}
			}
		}

		this.method7543(var3, var2); // L: 204
		return var1; // L: 205
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "254864710"
	)
	public int method7587(int var1, int var2) {
		if (this.field4602 == null) { // L: 209
			return 0;
		} else if (this.method7512() && var1 > this.field4594) { // L: 210
			return this.field4601.size();
		} else {
			if (!this.field4601.isEmpty()) { // L: 211
				for (int var3 = 0; var3 < this.field4601.size(); ++var3) { // L: 212
					class416 var4 = (class416)this.field4601.get(var3); // L: 213
					if (var2 <= var4.field4605 + this.method7511()) { // L: 214
						if (var2 < var4.field4605) { // L: 215
							break;
						}

						if (var1 < var4.field4606) { // L: 216
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (var3 + 1 != this.field4601.size() && ((class416)this.field4601.get(var3 + 1)).field4605 != var4.field4605) { // L: 217
							int var5 = this.method7585((class416)this.field4601.get(var3), false); // L: 218
							if (var1 < var5 + var4.field4606) { // L: 219
								return var3; // L: 220
							}

							if (var2 <= var4.field4605 + this.method7511()) { // L: 222
								return var3 + 1; // L: 223
							}
						}
					}
				}

				class416 var6 = (class416)this.field4601.get(this.field4601.size() - 1); // L: 228
				if (var1 >= var6.field4606 && var1 <= var6.field4606 + this.method7635() && var2 >= var6.field4605 && var2 <= var6.field4605 + this.method7511()) { // L: 229
					return this.field4601.size() - 1; // L: 230
				}
			}

			return this.field4601.size(); // L: 233
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "564964147"
	)
	public int method7601(int var1, int var2) {
		if (this.field4602 != null && !this.method7566() && var1 <= this.field4601.size()) { // L: 237
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
				class416 var6 = (class416)this.field4601.get(var1 - 1); // L: 249
				var4 = var6.field4606 + this.method7545(var1 - 1); // L: 250
				var5 = var6.field4605; // L: 251
			} else if (var3 == -1 && var1 == 0) { // L: 253
				return 0; // L: 254
			}

			int var14 = 16777215; // L: 256
			int var7 = 0; // L: 257
			int var8 = var1; // L: 258
			int var9 = 16777215; // L: 259
			int var10 = var3 == 1 ? this.field4601.size() + 1 : 0; // L: 260

			for (int var11 = var3 + var1; var11 != var10; var11 += var3) { // L: 261
				class416 var12 = (class416)this.field4601.get(var11 - 1); // L: 262
				if (var5 != var12.field4605) { // L: 263
					++var7; // L: 264
					var5 = var12.field4605; // L: 265
					if (var7 > var2) { // L: 266
						return var8; // L: 267
					}
				}

				if (var7 == var2) { // L: 270
					int var13 = Math.abs(var12.field4606 + this.method7545(var11 - 1) - var4); // L: 271
					if (var13 >= var9) { // L: 272
						return var8; // L: 277
					}

					var8 = var11; // L: 273
					var9 = var13; // L: 274
				}
			}

			if (var3 == 1) { // L: 281
				return this.field4601.size(); // L: 282
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
		garbageValue = "-1143912558"
	)
	public int method7532() {
		if (!this.field4601.isEmpty() && this.method7535() == 1) { // L: 298
			return this.field4601.isEmpty() ? 0 : ((class416)this.field4601.get(this.field4601.size() - 1)).field4606 + this.method7635(); // L: 299
		} else {
			int var1 = -1; // L: 302
			int var2 = 0; // L: 303

			for (int var3 = this.field4601.size() - 1; var3 >= 0; --var3) { // L: 304
				class416 var4 = (class416)this.field4601.get(var3); // L: 305
				if (var1 != var4.field4605) { // L: 306
					int var5 = this.method7585(var4, false) + var4.field4606; // L: 307
					var2 = Math.max(var5, var2); // L: 308
					var1 = var4.field4605; // L: 309
				}
			}

			return var2; // L: 312
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-811444924"
	)
	public int method7533() {
		return this.method7566() ? 0 : this.field4602.ascent + ((class416)this.field4601.get(this.field4601.size() - 1)).field4605; // L: 317
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-68"
	)
	public int method7511() {
		return this.field4598; // L: 321
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "80"
	)
	public int method7535() {
		return this.method7533() / this.field4602.ascent; // L: 325
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1582650784"
	)
	int method7635() {
		return this.method7566() ? 0 : this.method7585((class416)this.field4601.get(this.field4601.size() - 1), false); // L: 329
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-232369431"
	)
	public int method7537() {
		return this.field4594; // L: 333
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "43"
	)
	public int method7642() {
		return this.field4595; // L: 337
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	public int method7540() {
		return this.field4589; // L: 341
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-84"
	)
	public int method7534() {
		return this.field4603; // L: 345
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "98463606"
	)
	public int method7549(int var1) {
		switch(this.field4597) { // L: 349
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

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "-11019"
	)
	public int method7542(int var1) {
		switch(this.field4588) { // L: 361
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

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1759796625"
	)
	void method7609() {
		this.method7543(0, this.field4601.size()); // L: 373
	} // L: 374

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1526902675"
	)
	void method7543(int var1, int var2) {
		if (!this.method7566() && this.field4602 != null) { // L: 377
			class505 var3 = this.method7547(var1, var2); // L: 378
			boolean var4 = (Integer)var3.field5090 == 0 && (Integer)var3.field5089 == this.field4601.size(); // L: 379
			int var5 = (Integer)var3.field5090; // L: 380
			int var6 = 0; // L: 381
			int var7 = var4 ? 0 : ((class416)this.field4601.get((Integer)var3.field5090)).field4605; // L: 382
			int var8 = 0; // L: 383

			int var9;
			for (var9 = (Integer)var3.field5090; var9 <= (Integer)var3.field5089; ++var9) { // L: 384
				boolean var10 = var9 >= this.field4601.size(); // L: 385
				class416 var21 = (class416)this.field4601.get(!var10 ? var9 : this.field4601.size() - 1); // L: 386
				int var22 = !var10 ? this.method7585(var21, false) : 0; // L: 387
				boolean var13 = !var10 && var21.field4607 == '\n'; // L: 388
				boolean var14 = !var10 && this.method7512() && var6 + var22 > this.field4594; // L: 389
				if (var13 || var14 || var10) { // L: 390
					int var15 = var9; // L: 391
					int var16 = 0; // L: 392
					int var17;
					int var18;
					class416 var19;
					if (var14) { // L: 393
						var17 = 0; // L: 394
						if (this.field4589 == 1) { // L: 395
							for (var18 = var9; var18 > var5; --var18) { // L: 396
								var19 = (class416)this.field4601.get(var18); // L: 397
								var17 += var18 < var15 ? this.method7585(var19, false) : 0; // L: 398
								if (var19.field4607 == ' ' || var19.field4607 == '\n') { // L: 399
									var15 = var18; // L: 400
									var6 -= var17; // L: 401
									var16 = var17; // L: 402
									break;
								}
							}
						}
					}

					var17 = -this.method7549(var6); // L: 408

					for (var18 = var5; var18 < var15; ++var18) { // L: 409
						var19 = (class416)this.field4601.get(var18); // L: 410
						int var20 = this.method7585(var19, false); // L: 411
						var19.field4606 = var17; // L: 412
						var19.field4605 = var7; // L: 413
						var17 += var20; // L: 414
					}

					var5 = var15; // L: 416
					var6 = var16; // L: 417
					var7 += this.method7511(); // L: 418
					++var8; // L: 419
				}

				var6 += !var10 ? var22 : 0; // L: 421
			}

			if (this.field4588 != 0 && var4) { // L: 423
				var9 = var8 * this.method7511(); // L: 424
				int var23 = this.method7542(var9); // L: 425

				for (int var11 = 0; var11 < this.field4601.size(); ++var11) { // L: 426
					class416 var12 = (class416)this.field4601.get(var11); // L: 427
					var12.field4605 -= var23; // L: 428
				}
			}

		}
	} // L: 431

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1292347002"
	)
	int method7545(int var1) {
		return var1 < this.field4601.size() ? this.method7585((class416)this.field4601.get(var1), false) : 0; // L: 434
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lqt;ZI)I",
		garbageValue = "335030106"
	)
	int method7585(class416 var1, boolean var2) {
		if (var1.field4607 == '\n') { // L: 438
			return 0;
		} else if (this.field4603 == 0) { // L: 439
			int var3 = this.field4602.advances[var1.field4607]; // L: 440
			if (var3 == 0) { // L: 441
				return var1.field4607 == '\t' ? this.field4602.advances[32] * 3 : this.field4602.advances[32]; // L: 442 443 446
			} else {
				return var3; // L: 450
			}
		} else {
			return this.field4602.advances[42]; // L: 454
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(III)Ltd;",
		garbageValue = "457213877"
	)
	class505 method7547(int var1, int var2) {
		int var3 = Math.min(var1, var2); // L: 459
		int var4 = Math.max(var1, var2); // L: 460
		int var5 = this.field4601.size(); // L: 461
		if (var3 == 0 && var4 == var5) { // L: 462
			return new class505(0, var5); // L: 463
		} else {
			int var6 = this.method7548(var3, false); // L: 465
			int var7 = this.method7527(var4, false); // L: 466
			int var8;
			switch(this.field4588) { // L: 467
			case 0:
				if (this.field4597 == 0) { // L: 470
					return new class505(var6, var5); // L: 471
				}

				var8 = this.method7548(var3, true); // L: 473
				return new class505(var8, var5); // L: 474
			case 1:
				return new class505(0, var5); // L: 485
			case 2:
				if (this.field4597 == 2) { // L: 478
					return new class505(0, var7); // L: 479
				}

				var8 = this.method7527(var4, true); // L: 481
				return new class505(0, var8); // L: 482
			default:
				return new class505(0, var5); // L: 487
			}
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IZB)I",
		garbageValue = "51"
	)
	int method7548(int var1, boolean var2) {
		if (var1 < this.field4601.size()) { // L: 491
			int var3 = ((class416)this.field4601.get(var1)).field4605; // L: 492

			for (int var4 = var1; var4 > 0; --var4) { // L: 493
				if (((class416)this.field4601.get(var4 - 1)).field4605 < var3) { // L: 494
					if (!var2) { // L: 495
						return var4; // L: 496
					}

					var2 = false; // L: 498
					var3 = ((class416)this.field4601.get(var4 - 1)).field4605; // L: 499
				}
			}
		}

		return 0; // L: 503
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IZB)I",
		garbageValue = "104"
	)
	int method7527(int var1, boolean var2) {
		if (var1 < this.field4601.size()) { // L: 507
			int var3 = ((class416)this.field4601.get(var1)).field4605; // L: 508

			for (int var4 = var1; var4 < this.field4601.size() - 1; ++var4) { // L: 509
				if (((class416)this.field4601.get(var4 + 1)).field4605 > var3) { // L: 510
					if (!var2) { // L: 511
						return var4; // L: 512
					}

					var2 = false; // L: 514
					var3 = ((class416)this.field4601.get(var4 + 1)).field4605; // L: 515
				}
			}
		}

		return this.field4601.size(); // L: 519
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "2054306844"
	)
	static int method7646(int var0, Script var1, boolean var2) {
		boolean var3 = true; // L: 1118
		Widget var4;
		if (var0 >= 2000) { // L: 1120
			var0 -= 1000; // L: 1121
			var4 = class243.field2620.method6281(Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]); // L: 1122
			var3 = false; // L: 1123
		} else {
			var4 = var2 ? class475.scriptDotWidget : class535.field5236; // L: 1125
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) { // L: 1126
			var11 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] - 1; // L: 1127
			if (var11 >= 0 && var11 <= 9) { // L: 1128
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]); // L: 1132
				return 1; // L: 1133
			} else {
				--AbstractWorldMapIcon.Interpreter_stringStackSize; // L: 1129
				return 1; // L: 1130
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) { // L: 1135
				class19.Interpreter_intStackSize -= 2; // L: 1136
				var11 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 1137
				var6 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 1138
				var4.parent = class243.field2620.method6286(var11, var6); // L: 1139
				return 1; // L: 1140
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) { // L: 1142
				var4.isScrollBar = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] == 1; // L: 1143
				return 1; // L: 1144
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) { // L: 1146
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 1147
				return 1; // L: 1148
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) { // L: 1150
				var4.dragThreshold = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 1151
				return 1; // L: 1152
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) { // L: 1154
				var4.dataText = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 1155
				return 1; // L: 1156
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) { // L: 1158
				var4.spellActionName = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 1159
				return 1; // L: 1160
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) { // L: 1162
				var4.actions = null; // L: 1163
				return 1; // L: 1164
			} else if (var0 == 1308) { // L: 1166
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] == 1; // L: 1167
				return 1; // L: 1168
			} else if (var0 == 1309) { // L: 1170
				--class19.Interpreter_intStackSize; // L: 1171
				return 1; // L: 1172
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) { // L: 1174
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) { // L: 1204
						class19.Interpreter_intStackSize -= 2; // L: 1205
						var5 = 10; // L: 1206
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]}; // L: 1207
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]}; // L: 1208
						ModeWhere.Widget_setKey(var4, var5, var8, var9); // L: 1209
						return 1; // L: 1210
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) { // L: 1212
						class19.Interpreter_intStackSize -= 3; // L: 1213
						var11 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize] - 1; // L: 1214
						var6 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 1215
						var7 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 2]; // L: 1216
						if (var11 >= 0 && var11 <= 9) { // L: 1217
							class432.Widget_setKeyRate(var4, var11, var6, var7); // L: 1220
							return 1; // L: 1221
						} else {
							throw new RuntimeException(); // L: 1218
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) { // L: 1223
						var5 = 10; // L: 1224
						var6 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 1225
						var7 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 1226
						class432.Widget_setKeyRate(var4, var5, var6, var7); // L: 1227
						return 1; // L: 1228
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) { // L: 1230
						--class19.Interpreter_intStackSize; // L: 1231
						var11 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize] - 1; // L: 1232
						if (var11 >= 0 && var11 <= 9) { // L: 1233
							LoginScreenAnimation.Widget_setKeyIgnoreHeld(var4, var11); // L: 1236
							return 1; // L: 1237
						} else {
							throw new RuntimeException(); // L: 1234
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) { // L: 1239
						var5 = 10; // L: 1240
						LoginScreenAnimation.Widget_setKeyIgnoreHeld(var4, var5); // L: 1241
						return 1; // L: 1242
					} else {
						return 2; // L: 1244
					}
				} else {
					byte[] var10 = null; // L: 1175
					var8 = null; // L: 1176
					if (var3) { // L: 1177
						class19.Interpreter_intStackSize -= 10; // L: 1178

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + class19.Interpreter_intStackSize] >= 0; var7 += 2) { // L: 1180 1181
						}

						if (var7 > 0) { // L: 1183
							var10 = new byte[var7 / 2]; // L: 1184
							var8 = new byte[var7 / 2]; // L: 1185

							for (var7 -= 2; var7 >= 0; var7 -= 2) { // L: 1186
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class19.Interpreter_intStackSize]; // L: 1187
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class19.Interpreter_intStackSize + 1]; // L: 1188
							}
						}
					} else {
						class19.Interpreter_intStackSize -= 2; // L: 1193
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]}; // L: 1194
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]}; // L: 1195
					}

					var7 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] - 1; // L: 1197
					if (var7 >= 0 && var7 <= 9) { // L: 1198
						ModeWhere.Widget_setKey(var4, var7, var10, var8); // L: 1201
						return 1; // L: 1202
					} else {
						throw new RuntimeException(); // L: 1199
					}
				}
			}
		}
	}
}
