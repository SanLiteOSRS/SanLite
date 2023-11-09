import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oq")
public class class379 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -747672747
	)
	@Export("musicTrackGroupId")
	public static int musicTrackGroupId;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 233637321
	)
	int field4413;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -64830711
	)
	int field4411;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 252193353
	)
	int field4412;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1114162931
	)
	int field4418;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1059679999
	)
	int field4414;
	@ObfuscatedName("aj")
	boolean field4415;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	AbstractFont field4409;
	@ObfuscatedName("az")
	ArrayList field4417;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -29893609
	)
	int field4406;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 874587033
	)
	int field4419;

	public class379() {
		this.field4413 = Integer.MAX_VALUE; // L: 22
		this.field4411 = Integer.MAX_VALUE; // L: 23
		this.field4412 = 0; // L: 24
		this.field4418 = 0; // L: 25
		this.field4414 = 0; // L: 26
		this.field4415 = true; // L: 27
		this.field4417 = new ArrayList(); // L: 29
		this.field4406 = 0; // L: 30
		this.field4419 = 0; // L: 31
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Lom;",
		garbageValue = "1345867261"
	)
	public class381 method7260(int var1) {
		return (class381)this.field4417.get(var1); // L: 34
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Lom;",
		garbageValue = "-1433710051"
	)
	class381 method7290() {
		return this.field4417.size() == 0 ? null : (class381)this.field4417.get(this.field4417.size() - 1); // L: 38 39
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1182697415"
	)
	public boolean method7262() {
		return this.field4417.size() == 0; // L: 43
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "16"
	)
	boolean method7263() {
		return this.field4411 > 1; // L: 47
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1350377634"
	)
	public int method7264() {
		return this.field4417.size(); // L: 51
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1389348498"
	)
	public String method7265() {
		if (this.method7262()) { // L: 55
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7264()); // L: 56

			for (int var2 = 0; var2 < this.method7264(); ++var2) { // L: 57
				class381 var3 = this.method7260(var2); // L: 58
				var1.append(var3.field4428); // L: 59
			}

			return var1.toString(); // L: 61
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "2"
	)
	public void method7320(int var1) {
		if (this.field4409 != null && var1 < this.field4409.ascent * 2) { // L: 65 66
			var1 = Integer.MAX_VALUE; // L: 67
		}

		if (this.field4413 != var1) { // L: 70
			this.field4413 = var1; // L: 71
			this.method7294(); // L: 72
		}

	} // L: 74

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "47"
	)
	public void method7261(int var1) {
		if (this.field4411 != var1) { // L: 77
			this.field4411 = var1; // L: 78
			this.method7294(); // L: 79
		}

	} // L: 81

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2120915806"
	)
	public void method7298(int var1) {
		if (this.field4419 != var1) { // L: 84
			this.field4419 = var1; // L: 85
			this.method7294(); // L: 86
		}

	} // L: 88

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lou;I)V",
		garbageValue = "-1950541126"
	)
	public void method7373(AbstractFont var1) {
		if (var1 != this.field4409) { // L: 91
			this.field4409 = var1; // L: 92
			if (this.field4409 != null) { // L: 93
				if (this.field4414 == 0) { // L: 94
					this.field4414 = this.field4409.ascent; // L: 95
				}

				if (!this.method7262()) { // L: 97
					this.method7294(); // L: 98
				}
			}
		}

	} // L: 102

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-57"
	)
	public void method7270(int var1) {
		if (this.field4406 != var1) { // L: 105
			this.field4406 = var1; // L: 106
			this.method7294(); // L: 107
		}

	} // L: 109

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1438102335"
	)
	public boolean method7271(int var1, int var2) {
		if (this.field4412 != var1 || var2 != this.field4418) { // L: 112
			this.field4412 = var1; // L: 113
			this.field4418 = var2; // L: 114
			this.method7294(); // L: 115
		}

		return true; // L: 117
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-54"
	)
	public void method7272(int var1) {
		if (this.field4414 != var1) { // L: 121
			this.field4414 = var1; // L: 122
			this.method7294(); // L: 123
		}

	} // L: 125

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIB)Loa;",
		garbageValue = "17"
	)
	public class383 method7341(int var1, int var2) {
		if (var2 == var1) { // L: 128
			return new class383(this, 0, 0);
		} else if (var1 <= this.field4417.size() && var2 <= this.field4417.size()) { // L: 129
			return var2 < var1 ? new class383(this, var2, var1) : new class383(this, var1, var2); // L: 130
		} else {
			return new class383(this, 0, 0); // L: 131
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(CIII)Low;",
		garbageValue = "1267710833"
	)
	public class380 method7307(char var1, int var2, int var3) {
		return this.method7275(Character.toString(var1), var2, var3); // L: 135
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIB)Low;",
		garbageValue = "-18"
	)
	public class380 method7275(String var1, int var2, int var3) {
		if (var3 == 0) { // L: 139
			var3 = Integer.MAX_VALUE; // L: 140
		}

		int var4 = var2; // L: 142
		if (this.field4417.size() >= var3) { // L: 143
			this.method7295(var2, var2); // L: 144
			return new class380(var2, true); // L: 145
		} else {
			this.field4417.ensureCapacity(this.field4417.size() + var1.length()); // L: 147

			for (int var5 = 0; var5 < var1.length() && this.field4417.size() < var3; ++var5) { // L: 148
				class381 var6 = new class381(); // L: 149
				var6.field4428 = var1.charAt(var5); // L: 150
				this.field4417.add(var4, var6); // L: 151
				++var4; // L: 152
			}

			this.method7295(var2, var4); // L: 154
			if (this.field4411 != 0 && this.method7286() > this.field4411) { // L: 155
				while (var4 != var2) { // L: 157
					--var4; // L: 160
					this.method7279(var4); // L: 161
					if (this.method7286() <= this.field4411) { // L: 162
						break;
					}
				}

				return new class380(var4, true); // L: 163
			} else {
				return new class380(var4, false); // L: 166
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)Low;",
		garbageValue = "24"
	)
	class380 method7276(String var1, int var2) {
		return this.method7275(var1, this.field4417.size(), var2); // L: 171
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Low;",
		garbageValue = "-844450457"
	)
	public class380 method7277(String var1) {
		this.method7269(); // L: 175
		return this.method7276(var1, 0); // L: 176
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-108"
	)
	void method7269() {
		this.field4417.clear(); // L: 180
	} // L: 181

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1484829823"
	)
	public int method7279(int var1) {
		return this.method7280(var1, var1 + 1); // L: 184
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "572114493"
	)
	public int method7280(int var1, int var2) {
		int var3;
		if (var2 < var1) { // L: 188
			var3 = var2; // L: 189
			var2 = var1; // L: 190
			var1 = var3; // L: 191
		}

		this.field4417.subList(var1, var2).clear(); // L: 193
		var3 = var1; // L: 194
		if (this.method7263() && this.field4406 == 1) { // L: 195
			while (var3 > 0) { // L: 196
				--var3; // L: 197
				char var4 = ((class381)this.field4417.get(var3)).field4428; // L: 198
				if (var4 == ' ' || var4 == '\t') { // L: 199
					break;
				}
			}
		}

		this.method7295(var3, var2); // L: 204
		return var1; // L: 205
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-22"
	)
	public int method7281(int var1, int var2) {
		if (this.field4409 == null) { // L: 209
			return 0;
		} else if (this.method7263() && var1 > this.field4413) { // L: 210
			return this.field4417.size();
		} else {
			if (!this.field4417.isEmpty()) { // L: 211
				for (int var3 = 0; var3 < this.field4417.size(); ++var3) { // L: 212
					class381 var4 = (class381)this.field4417.get(var3); // L: 213
					if (var2 <= var4.field4430 + this.method7386()) { // L: 214
						if (var2 < var4.field4430) { // L: 215
							break;
						}

						if (var1 < var4.field4427) { // L: 216
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (var3 + 1 != this.field4417.size() && ((class381)this.field4417.get(var3 + 1)).field4430 != var4.field4430) { // L: 217
							int var5 = this.method7297((class381)this.field4417.get(var3), false); // L: 218
							if (var1 < var5 + var4.field4427) { // L: 219
								return var3; // L: 220
							}

							if (var2 <= var4.field4430 + this.method7386()) { // L: 222
								return var3 + 1; // L: 223
							}
						}
					}
				}

				class381 var6 = (class381)this.field4417.get(this.field4417.size() - 1); // L: 228
				if (var1 >= var6.field4427 && var1 <= var6.field4427 + this.method7359() && var2 >= var6.field4430 && var2 <= var6.field4430 + this.method7386()) { // L: 229
					return this.field4417.size() - 1; // L: 230
				}
			}

			return this.field4417.size(); // L: 233
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "95"
	)
	public int method7282(int var1, int var2) {
		if (this.field4409 != null && !this.method7262() && var1 <= this.field4417.size()) { // L: 237
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
				class381 var6 = (class381)this.field4417.get(var1 - 1); // L: 249
				var4 = var6.field4427 + this.method7296(var1 - 1); // L: 250
				var5 = var6.field4430; // L: 251
			} else if (var3 == -1 && var1 == 0) { // L: 253
				return 0; // L: 254
			}

			int var14 = 16777215; // L: 256
			int var7 = 0; // L: 257
			int var8 = var1; // L: 258
			int var9 = 16777215; // L: 259
			int var10 = var3 == 1 ? this.field4417.size() + 1 : 0; // L: 260

			for (int var11 = var3 + var1; var10 != var11; var11 += var3) { // L: 261
				class381 var12 = (class381)this.field4417.get(var11 - 1); // L: 262
				if (var5 != var12.field4430) { // L: 263
					++var7; // L: 264
					var5 = var12.field4430; // L: 265
					if (var7 > var2) { // L: 266
						return var8; // L: 267
					}
				}

				if (var7 == var2) { // L: 270
					int var13 = Math.abs(var12.field4427 + this.method7296(var11 - 1) - var4); // L: 271
					if (var13 >= var9) { // L: 272
						return var8; // L: 277
					}

					var8 = var11; // L: 273
					var9 = var13; // L: 274
				}
			}

			if (var3 == 1) { // L: 281
				return this.field4417.size(); // L: 282
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-298165365"
	)
	public int method7283() {
		if (!this.field4417.isEmpty() && this.method7286() == 1) { // L: 298
			return this.field4417.isEmpty() ? 0 : ((class381)this.field4417.get(this.field4417.size() - 1)).field4427 + this.method7359(); // L: 299
		} else {
			int var1 = -1; // L: 302
			int var2 = 0; // L: 303

			for (int var3 = this.field4417.size() - 1; var3 >= 0; --var3) { // L: 304
				class381 var4 = (class381)this.field4417.get(var3); // L: 305
				if (var1 != var4.field4430) { // L: 306
					int var5 = this.method7297(var4, false) + var4.field4427; // L: 307
					var2 = Math.max(var5, var2); // L: 308
					var1 = var4.field4430; // L: 309
				}
			}

			return var2; // L: 312
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1760321375"
	)
	public int method7284() {
		return this.method7262() ? 0 : this.field4409.ascent + ((class381)this.field4417.get(this.field4417.size() - 1)).field4430; // L: 317
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-297150195"
	)
	public int method7386() {
		return this.field4414; // L: 321
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "36"
	)
	public int method7286() {
		return this.method7284() / this.field4409.ascent; // L: 325
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "80"
	)
	int method7359() {
		return this.method7262() ? 0 : this.method7297((class381)this.field4417.get(this.field4417.size() - 1), false); // L: 329
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1296915014"
	)
	public int method7379() {
		return this.field4413; // L: 333
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "22905"
	)
	public int method7289() {
		return this.field4411; // L: 337
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "817014315"
	)
	public int method7334() {
		return this.field4406; // L: 341
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "785448473"
	)
	public int method7291() {
		return this.field4419; // L: 345
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "88"
	)
	public int method7381(int var1) {
		switch(this.field4412) { // L: 349
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

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1521607060"
	)
	public int method7383(int var1) {
		switch(this.field4418) { // L: 361
		case 0:
			return 0; // L: 363
		case 1:
			return var1 / 2; // L: 365
		case 2:
			return var1; // L: 367
		default:
			return 0; // L: 369
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-224307219"
	)
	void method7294() {
		this.method7295(0, this.field4417.size()); // L: 373
	} // L: 374

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-93545195"
	)
	void method7295(int var1, int var2) {
		if (!this.method7262() && this.field4409 != null) { // L: 377
			class461 var3 = this.method7259(var1, var2); // L: 378
			boolean var4 = (Integer)var3.field4886 == 0 && (Integer)var3.field4887 == this.field4417.size(); // L: 379
			int var5 = (Integer)var3.field4886; // L: 380
			int var6 = 0; // L: 381
			int var7 = var4 ? 0 : ((class381)this.field4417.get((Integer)var3.field4886)).field4430; // L: 382
			int var8 = 0; // L: 383

			int var9;
			for (var9 = (Integer)var3.field4886; var9 <= (Integer)var3.field4887; ++var9) { // L: 384
				boolean var10 = var9 >= this.field4417.size(); // L: 385
				class381 var21 = (class381)this.field4417.get(!var10 ? var9 : this.field4417.size() - 1); // L: 386
				int var22 = !var10 ? this.method7297(var21, false) : 0; // L: 387
				boolean var13 = !var10 && var21.field4428 == '\n'; // L: 388
				boolean var14 = !var10 && this.method7263() && var6 + var22 > this.field4413; // L: 389
				if (var13 || var14 || var10) { // L: 390
					int var15 = var9; // L: 391
					int var16 = 0; // L: 392
					int var17;
					int var18;
					class381 var19;
					if (var14) { // L: 393
						var17 = 0; // L: 394
						if (this.field4406 == 1) { // L: 395
							for (var18 = var9; var18 > var5; --var18) { // L: 396
								var19 = (class381)this.field4417.get(var18); // L: 397
								var17 += var18 < var15 ? this.method7297(var19, false) : 0; // L: 398
								if (var19.field4428 == ' ' || var19.field4428 == '\n') { // L: 399
									var15 = var18; // L: 400
									var6 -= var17; // L: 401
									var16 = var17; // L: 402
									break;
								}
							}
						}
					}

					var17 = -this.method7381(var6); // L: 408

					for (var18 = var5; var18 < var15; ++var18) { // L: 409
						var19 = (class381)this.field4417.get(var18); // L: 410
						int var20 = this.method7297(var19, false); // L: 411
						var19.field4427 = var17; // L: 412
						var19.field4430 = var7; // L: 413
						var17 += var20; // L: 414
					}

					var5 = var15; // L: 416
					var6 = var16; // L: 417
					var7 += this.method7386(); // L: 418
					++var8; // L: 419
				}

				var6 += !var10 ? var22 : 0; // L: 421
			}

			if (this.field4418 != 0 && var4) { // L: 423
				var9 = var8 * this.method7386(); // L: 424
				int var23 = this.method7383(var9); // L: 425

				for (int var11 = 0; var11 < this.field4417.size(); ++var11) { // L: 426
					class381 var12 = (class381)this.field4417.get(var11); // L: 427
					var12.field4430 -= var23; // L: 428
				}
			}

		}
	} // L: 431

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-465870520"
	)
	int method7296(int var1) {
		return var1 < this.field4417.size() ? this.method7297((class381)this.field4417.get(var1), false) : 0; // L: 434
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lom;ZI)I",
		garbageValue = "-935952959"
	)
	int method7297(class381 var1, boolean var2) {
		if (var1.field4428 == '\n') { // L: 438
			return 0;
		} else if (this.field4419 == 0) { // L: 439
			int var3 = this.field4409.advances[var1.field4428]; // L: 440
			if (var3 == 0) { // L: 441
				return var1.field4428 == '\t' ? this.field4409.advances[32] * 3 : this.field4409.advances[32]; // L: 442 443 446
			} else {
				return var3; // L: 450
			}
		} else {
			return this.field4409.advances[42]; // L: 454
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(III)Lrg;",
		garbageValue = "2105841802"
	)
	class461 method7259(int var1, int var2) {
		int var3 = Math.min(var1, var2); // L: 459
		int var4 = Math.max(var1, var2); // L: 460
		int var5 = this.field4417.size(); // L: 461
		if (var3 == 0 && var4 == var5) { // L: 462
			return new class461(0, var5); // L: 463
		} else {
			int var6 = this.method7299(var3, false); // L: 465
			int var7 = this.method7300(var4, false); // L: 466
			int var8;
			switch(this.field4418) { // L: 467
			case 0:
				if (this.field4412 == 0) { // L: 480
					return new class461(var6, var5); // L: 481
				}

				var8 = this.method7299(var3, true); // L: 483
				return new class461(var8, var5); // L: 484
			case 1:
				return new class461(0, var5); // L: 477
			case 2:
				if (this.field4412 == 2) { // L: 470
					return new class461(0, var7); // L: 471
				}

				var8 = this.method7300(var4, true); // L: 473
				return new class461(0, var8); // L: 474
			default:
				return new class461(0, var5); // L: 487
			}
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-423936082"
	)
	int method7299(int var1, boolean var2) {
		if (var1 < this.field4417.size()) { // L: 491
			int var3 = ((class381)this.field4417.get(var1)).field4430; // L: 492

			for (int var4 = var1; var4 > 0; --var4) { // L: 493
				if (((class381)this.field4417.get(var4 - 1)).field4430 < var3) { // L: 494
					if (!var2) { // L: 495
						return var4; // L: 496
					}

					var2 = false; // L: 498
					var3 = ((class381)this.field4417.get(var4 - 1)).field4430; // L: 499
				}
			}
		}

		return 0; // L: 503
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-985100260"
	)
	int method7300(int var1, boolean var2) {
		if (var1 < this.field4417.size()) { // L: 507
			int var3 = ((class381)this.field4417.get(var1)).field4430; // L: 508

			for (int var4 = var1; var4 < this.field4417.size() - 1; ++var4) { // L: 509
				if (((class381)this.field4417.get(var4 + 1)).field4430 > var3) { // L: 510
					if (!var2) { // L: 511
						return var4; // L: 512
					}

					var2 = false; // L: 514
					var3 = ((class381)this.field4417.get(var4 + 1)).field4430; // L: 515
				}
			}
		}

		return this.field4417.size(); // L: 519
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-59"
	)
	public static void method7393() {
		ItemComposition.ItemComposition_cached.clear(); // L: 572
		ItemComposition.ItemComposition_cachedModels.clear(); // L: 573
		ItemComposition.ItemComposition_cachedSprites.clear(); // L: 574
	} // L: 575

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "613256531"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) { // L: 12006
			PacketBufferNode var1 = class330.getPacketBufferNode(ClientPacket.field3142, Client.packetWriter.isaacCipher); // L: 12008
			var1.packetBuffer.writeByte(DynamicObject.stringCp1252NullTerminatedByteSize(var0)); // L: 12009
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 12010
			Client.packetWriter.addNode(var1); // L: 12011
		}
	} // L: 12012
}
