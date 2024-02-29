import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pv")
public class class413 {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -696110365
	)
	int field4574;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1341617493
	)
	int field4572;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1977329711
	)
	int field4573;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1653074747
	)
	int field4575;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -230505229
	)
	int field4578;
	@ObfuscatedName("ay")
	boolean field4576;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	AbstractFont field4577;
	@ObfuscatedName("ac")
	ArrayList field4570;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1720012413
	)
	int field4579;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1675231519
	)
	int field4580;

	public class413() {
		this.field4574 = Integer.MAX_VALUE; // L: 22
		this.field4572 = Integer.MAX_VALUE; // L: 23
		this.field4573 = 0; // L: 24
		this.field4575 = 0; // L: 25
		this.field4578 = 0; // L: 26
		this.field4576 = true; // L: 27
		this.field4570 = new ArrayList(); // L: 29
		this.field4579 = 0; // L: 30
		this.field4580 = 0; // L: 31
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lpu;",
		garbageValue = "-470457898"
	)
	public class415 method7775(int var1) {
		return (class415)this.field4570.get(var1); // L: 34
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lpu;",
		garbageValue = "-1049497783"
	)
	class415 method7828() {
		return this.field4570.size() == 0 ? null : (class415)this.field4570.get(this.field4570.size() - 1); // L: 38 39
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1148407571"
	)
	public boolean method7778() {
		return this.field4570.size() == 0; // L: 43
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2118676254"
	)
	boolean method7693() {
		return this.field4572 > 1; // L: 47
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "2"
	)
	public int method7711() {
		return this.field4570.size(); // L: 51
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1754226121"
	)
	public String method7754() {
		if (this.method7778()) { // L: 55
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7711()); // L: 56

			for (int var2 = 0; var2 < this.method7711(); ++var2) { // L: 57
				class415 var3 = this.method7775(var2); // L: 58
				var1.append(var3.field4583); // L: 59
			}

			return var1.toString(); // L: 61
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "227737662"
	)
	public void method7700(int var1) {
		if (this.field4577 != null && var1 < this.field4577.ascent * 2) { // L: 65 66
			var1 = Integer.MAX_VALUE; // L: 67
		}

		if (this.field4574 != var1) { // L: 70
			this.field4574 = var1; // L: 71
			this.method7728(); // L: 72
		}

	} // L: 74

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "30"
	)
	public void method7701(int var1) {
		if (this.field4572 != var1) { // L: 77
			this.field4572 = var1; // L: 78
			this.method7728(); // L: 79
		}

	} // L: 81

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-120"
	)
	public void method7731(int var1) {
		if (this.field4580 != var1) { // L: 84
			this.field4580 = var1; // L: 85
			this.method7728(); // L: 86
		}

	} // L: 88

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lqi;I)V",
		garbageValue = "1754226121"
	)
	public void method7800(AbstractFont var1) {
		if (var1 != this.field4577) { // L: 91
			this.field4577 = var1; // L: 92
			if (this.field4577 != null) { // L: 93
				if (this.field4578 == 0) { // L: 94
					this.field4578 = this.field4577.ascent; // L: 95
				}

				if (!this.method7778()) { // L: 97
					this.method7728(); // L: 98
				}
			}
		}

	} // L: 102

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2133459477"
	)
	public void method7779(int var1) {
		if (this.field4579 != var1) { // L: 105
			this.field4579 = var1; // L: 106
			this.method7728(); // L: 107
		}

	} // L: 109

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1656678434"
	)
	public boolean method7705(int var1, int var2) {
		if (this.field4573 != var1 || var2 != this.field4575) { // L: 112
			this.field4573 = var1; // L: 113
			this.field4575 = var2; // L: 114
			this.method7728(); // L: 115
		}

		return true; // L: 117
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1497702314"
	)
	public void method7706(int var1) {
		if (this.field4578 != var1) { // L: 121
			this.field4578 = var1; // L: 122
			this.method7728(); // L: 123
		}

	} // L: 125

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lqz;",
		garbageValue = "114"
	)
	public class417 method7707(int var1, int var2) {
		if (var2 == var1) { // L: 128
			return new class417(this, 0, 0);
		} else if (var1 <= this.field4570.size() && var2 <= this.field4570.size()) { // L: 129
			return var2 < var1 ? new class417(this, var2, var1) : new class417(this, var1, var2); // L: 130
		} else {
			return new class417(this, 0, 0); // L: 131
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(CIIB)Lpa;",
		garbageValue = "8"
	)
	public class414 method7708(char var1, int var2, int var3) {
		return this.method7709(Character.toString(var1), var2, var3); // L: 135
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIB)Lpa;",
		garbageValue = "1"
	)
	public class414 method7709(String var1, int var2, int var3) {
		if (var3 == 0) { // L: 139
			var3 = Integer.MAX_VALUE; // L: 140
		}

		int var4 = var2; // L: 142
		if (this.field4570.size() >= var3) { // L: 143
			this.method7729(var2, var2); // L: 144
			return new class414(var2, true); // L: 145
		} else {
			this.field4570.ensureCapacity(this.field4570.size() + var1.length()); // L: 147

			for (int var5 = 0; var5 < var1.length() && this.field4570.size() < var3; ++var5) { // L: 148
				class415 var6 = new class415(); // L: 149
				var6.field4583 = var1.charAt(var5); // L: 150
				this.field4570.add(var4, var6); // L: 151
				++var4; // L: 152
			}

			this.method7729(var2, var4); // L: 154
			if (this.field4572 != 0 && this.method7720() > this.field4572) { // L: 155
				while (var4 != var2) { // L: 157
					--var4; // L: 160
					this.method7713(var4); // L: 161
					if (this.method7720() <= this.field4572) { // L: 162
						break;
					}
				}

				return new class414(var4, true); // L: 163
			} else {
				return new class414(var4, false); // L: 166
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lpa;",
		garbageValue = "414119716"
	)
	class414 method7710(String var1, int var2) {
		return this.method7709(var1, this.field4570.size(), var2); // L: 171
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lpa;",
		garbageValue = "1824140523"
	)
	public class414 method7792(String var1) {
		this.method7712(); // L: 175
		return this.method7710(var1, 0); // L: 176
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-102"
	)
	void method7712() {
		this.field4570.clear(); // L: 180
	} // L: 181

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "24"
	)
	public int method7713(int var1) {
		return this.method7798(var1, var1 + 1); // L: 184
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1811154260"
	)
	public int method7798(int var1, int var2) {
		int var3;
		if (var2 < var1) { // L: 188
			var3 = var2; // L: 189
			var2 = var1; // L: 190
			var1 = var3; // L: 191
		}

		this.field4570.subList(var1, var2).clear(); // L: 193
		var3 = var1; // L: 194
		if (this.method7693() && this.field4579 == 1) { // L: 195
			while (var3 > 0) { // L: 196
				--var3; // L: 197
				char var4 = ((class415)this.field4570.get(var3)).field4583; // L: 198
				if (var4 == ' ' || var4 == '\t') { // L: 199
					break;
				}
			}
		}

		this.method7729(var3, var2); // L: 204
		return var1; // L: 205
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "-24793"
	)
	public int method7715(int var1, int var2) {
		if (this.field4577 == null) { // L: 209
			return 0;
		} else if (this.method7693() && var1 > this.field4574) { // L: 210
			return this.field4570.size();
		} else {
			if (!this.field4570.isEmpty()) { // L: 211
				for (int var3 = 0; var3 < this.field4570.size(); ++var3) { // L: 212
					class415 var4 = (class415)this.field4570.get(var3); // L: 213
					if (var2 <= var4.field4585 + this.method7719()) { // L: 214
						if (var2 < var4.field4585) { // L: 215
							break;
						}

						if (var1 < var4.field4584) { // L: 216
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (var3 + 1 != this.field4570.size() && ((class415)this.field4570.get(var3 + 1)).field4585 != var4.field4585) { // L: 217
							int var5 = this.method7697((class415)this.field4570.get(var3), false); // L: 218
							if (var1 < var5 + var4.field4584) { // L: 219
								return var3; // L: 220
							}

							if (var2 <= var4.field4585 + this.method7719()) { // L: 222
								return var3 + 1; // L: 223
							}
						}
					}
				}

				class415 var6 = (class415)this.field4570.get(this.field4570.size() - 1); // L: 228
				if (var1 >= var6.field4584 && var1 <= var6.field4584 + this.method7721() && var2 >= var6.field4585 && var2 <= var6.field4585 + this.method7719()) { // L: 229
					return this.field4570.size() - 1; // L: 230
				}
			}

			return this.field4570.size(); // L: 233
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2096658446"
	)
	public int method7716(int var1, int var2) {
		if (this.field4577 != null && !this.method7778() && var1 <= this.field4570.size()) { // L: 237
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
				class415 var6 = (class415)this.field4570.get(var1 - 1); // L: 249
				var4 = var6.field4584 + this.method7722(var1 - 1); // L: 250
				var5 = var6.field4585; // L: 251
			} else if (var3 == -1 && var1 == 0) { // L: 253
				return 0; // L: 254
			}

			int var14 = 16777215; // L: 256
			int var7 = 0; // L: 257
			int var8 = var1; // L: 258
			int var9 = 16777215; // L: 259
			int var10 = var3 == 1 ? this.field4570.size() + 1 : 0; // L: 260

			for (int var11 = var3 + var1; var10 != var11; var11 += var3) { // L: 261
				class415 var12 = (class415)this.field4570.get(var11 - 1); // L: 262
				if (var5 != var12.field4585) { // L: 263
					++var7; // L: 264
					var5 = var12.field4585; // L: 265
					if (var7 > var2) { // L: 266
						return var8; // L: 267
					}
				}

				if (var7 == var2) { // L: 270
					int var13 = Math.abs(var12.field4584 + this.method7722(var11 - 1) - var4); // L: 271
					if (var13 >= var9) { // L: 272
						return var8; // L: 277
					}

					var8 = var11; // L: 273
					var9 = var13; // L: 274
				}
			}

			if (var3 == 1) { // L: 281
				return this.field4570.size(); // L: 282
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	public int method7717() {
		if (!this.field4570.isEmpty() && this.method7720() == 1) { // L: 298
			return this.field4570.isEmpty() ? 0 : ((class415)this.field4570.get(this.field4570.size() - 1)).field4584 + this.method7721(); // L: 299
		} else {
			int var1 = -1; // L: 302
			int var2 = 0; // L: 303

			for (int var3 = this.field4570.size() - 1; var3 >= 0; --var3) { // L: 304
				class415 var4 = (class415)this.field4570.get(var3); // L: 305
				if (var1 != var4.field4585) { // L: 306
					int var5 = this.method7697(var4, false) + var4.field4584; // L: 307
					var2 = Math.max(var5, var2); // L: 308
					var1 = var4.field4585; // L: 309
				}
			}

			return var2; // L: 312
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-740474028"
	)
	public int method7735() {
		return this.method7778() ? 0 : this.field4577.ascent + ((class415)this.field4570.get(this.field4570.size() - 1)).field4585; // L: 317
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1472959115"
	)
	public int method7719() {
		return this.field4578; // L: 321
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-24667"
	)
	public int method7720() {
		return this.method7735() / this.field4577.ascent; // L: 325
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "138917302"
	)
	int method7721() {
		return this.method7778() ? 0 : this.method7697((class415)this.field4570.get(this.field4570.size() - 1), false); // L: 329
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-2"
	)
	public int method7767() {
		return this.field4574; // L: 333
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1765465217"
	)
	public int method7808() {
		return this.field4572; // L: 337
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-354001801"
	)
	public int method7724() {
		return this.field4579; // L: 341
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1338784417"
	)
	public int method7765() {
		return this.field4580; // L: 345
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "95"
	)
	public int method7773(int var1) {
		switch(this.field4573) { // L: 349
		case 0:
			return 0; // L: 351
		case 1:
			return var1 / 2; // L: 355
		case 2:
			return var1; // L: 353
		default:
			return 0; // L: 357
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "32479"
	)
	public int method7786(int var1) {
		switch(this.field4575) { // L: 361
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

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "383944727"
	)
	void method7728() {
		this.method7729(0, this.field4570.size()); // L: 373
	} // L: 374

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-788622491"
	)
	void method7729(int var1, int var2) {
		if (!this.method7778() && this.field4577 != null) { // L: 377
			class504 var3 = this.method7730(var1, var2); // L: 378
			boolean var4 = (Integer)var3.field5063 == 0 && (Integer)var3.field5064 == this.field4570.size(); // L: 379
			int var5 = (Integer)var3.field5063; // L: 380
			int var6 = 0; // L: 381
			int var7 = var4 ? 0 : ((class415)this.field4570.get((Integer)var3.field5063)).field4585; // L: 382
			int var8 = 0; // L: 383

			int var9;
			for (var9 = (Integer)var3.field5063; var9 <= (Integer)var3.field5064; ++var9) { // L: 384
				boolean var10 = var9 >= this.field4570.size(); // L: 385
				class415 var21 = (class415)this.field4570.get(!var10 ? var9 : this.field4570.size() - 1); // L: 386
				int var22 = !var10 ? this.method7697(var21, false) : 0; // L: 387
				boolean var13 = !var10 && var21.field4583 == '\n'; // L: 388
				boolean var14 = !var10 && this.method7693() && var22 + var6 > this.field4574; // L: 389
				if (var13 || var14 || var10) { // L: 390
					int var15 = var9; // L: 391
					int var16 = 0; // L: 392
					int var17;
					int var18;
					class415 var19;
					if (var14) { // L: 393
						var17 = 0; // L: 394
						if (this.field4579 == 1) { // L: 395
							for (var18 = var9; var18 > var5; --var18) { // L: 396
								var19 = (class415)this.field4570.get(var18); // L: 397
								var17 += var18 < var15 ? this.method7697(var19, false) : 0; // L: 398
								if (var19.field4583 == ' ' || var19.field4583 == '\n') { // L: 399
									var15 = var18; // L: 400
									var6 -= var17; // L: 401
									var16 = var17; // L: 402
									break;
								}
							}
						}
					}

					var17 = -this.method7773(var6); // L: 408

					for (var18 = var5; var18 < var15; ++var18) { // L: 409
						var19 = (class415)this.field4570.get(var18); // L: 410
						int var20 = this.method7697(var19, false); // L: 411
						var19.field4584 = var17; // L: 412
						var19.field4585 = var7; // L: 413
						var17 += var20; // L: 414
					}

					var5 = var15; // L: 416
					var6 = var16; // L: 417
					var7 += this.method7719(); // L: 418
					++var8; // L: 419
				}

				var6 += !var10 ? var22 : 0; // L: 421
			}

			if (this.field4575 != 0 && var4) { // L: 423
				var9 = var8 * this.method7719(); // L: 424
				int var23 = this.method7786(var9); // L: 425

				for (int var11 = 0; var11 < this.field4570.size(); ++var11) { // L: 426
					class415 var12 = (class415)this.field4570.get(var11); // L: 427
					var12.field4585 -= var23; // L: 428
				}
			}

		}
	} // L: 431

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1626730503"
	)
	int method7722(int var1) {
		return var1 < this.field4570.size() ? this.method7697((class415)this.field4570.get(var1), false) : 0; // L: 434
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lpu;ZB)I",
		garbageValue = "6"
	)
	int method7697(class415 var1, boolean var2) {
		if (var1.field4583 == '\n') { // L: 438
			return 0;
		} else if (this.field4580 == 0) { // L: 439
			int var3 = this.field4577.advances[var1.field4583]; // L: 440
			if (var3 == 0) { // L: 441
				return var1.field4583 == '\t' ? this.field4577.advances[32] * 3 : this.field4577.advances[32]; // L: 442 443 446
			} else {
				return var3; // L: 450
			}
		} else {
			return this.field4577.advances[42]; // L: 454
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lth;",
		garbageValue = "5"
	)
	class504 method7730(int var1, int var2) {
		int var3 = Math.min(var1, var2); // L: 459
		int var4 = Math.max(var1, var2); // L: 460
		int var5 = this.field4570.size(); // L: 461
		if (var3 == 0 && var4 == var5) { // L: 462
			return new class504(0, var5); // L: 463
		} else {
			int var6 = this.method7733(var3, false); // L: 465
			int var7 = this.method7788(var4, false); // L: 466
			int var8;
			switch(this.field4575) { // L: 467
			case 0:
				if (this.field4573 == 0) { // L: 470
					return new class504(var6, var5); // L: 471
				}

				var8 = this.method7733(var3, true); // L: 473
				return new class504(var8, var5); // L: 474
			case 1:
				return new class504(0, var5); // L: 477
			case 2:
				if (this.field4573 == 2) { // L: 480
					return new class504(0, var7); // L: 481
				}

				var8 = this.method7788(var4, true); // L: 483
				return new class504(0, var8); // L: 484
			default:
				return new class504(0, var5); // L: 487
			}
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-336171947"
	)
	int method7733(int var1, boolean var2) {
		if (var1 < this.field4570.size()) { // L: 491
			int var3 = ((class415)this.field4570.get(var1)).field4585; // L: 492

			for (int var4 = var1; var4 > 0; --var4) { // L: 493
				if (((class415)this.field4570.get(var4 - 1)).field4585 < var3) { // L: 494
					if (!var2) { // L: 495
						return var4; // L: 496
					}

					var2 = false; // L: 498
					var3 = ((class415)this.field4570.get(var4 - 1)).field4585; // L: 499
				}
			}
		}

		return 0; // L: 503
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IZB)I",
		garbageValue = "-67"
	)
	int method7788(int var1, boolean var2) {
		if (var1 < this.field4570.size()) { // L: 507
			int var3 = ((class415)this.field4570.get(var1)).field4585; // L: 508

			for (int var4 = var1; var4 < this.field4570.size() - 1; ++var4) { // L: 509
				if (((class415)this.field4570.get(var4 + 1)).field4585 > var3) { // L: 510
					if (!var2) { // L: 511
						return var4; // L: 512
					}

					var2 = false; // L: 514
					var3 = ((class415)this.field4570.get(var4 + 1)).field4585; // L: 515
				}
			}
		}

		return this.field4570.size(); // L: 519
	}
}
