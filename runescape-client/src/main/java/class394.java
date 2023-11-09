import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pj")
public class class394 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1258596067
	)
	int field4459;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 2089434589
	)
	int field4458;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 633771027
	)
	int field4455;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1403151291
	)
	int field4462;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1719851919
	)
	int field4464;
	@ObfuscatedName("as")
	boolean field4466;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	AbstractFont field4465;
	@ObfuscatedName("aj")
	ArrayList field4452;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1637064671
	)
	int field4467;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 884828437
	)
	int field4468;

	public class394() {
		this.field4459 = Integer.MAX_VALUE; // L: 22
		this.field4458 = Integer.MAX_VALUE; // L: 23
		this.field4455 = 0; // L: 24
		this.field4462 = 0; // L: 25
		this.field4464 = 0; // L: 26
		this.field4466 = true; // L: 27
		this.field4452 = new ArrayList(); // L: 29
		this.field4467 = 0; // L: 30
		this.field4468 = 0; // L: 31
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Lpz;",
		garbageValue = "425318611"
	)
	public class396 method7303(int var1) {
		return (class396)this.field4452.get(var1); // L: 34
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lpz;",
		garbageValue = "1830163512"
	)
	class396 method7276() {
		return this.field4452.size() == 0 ? null : (class396)this.field4452.get(this.field4452.size() - 1); // L: 38 39
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1992869018"
	)
	public boolean method7371() {
		return this.field4452.size() == 0; // L: 43
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-675218118"
	)
	boolean method7401() {
		return this.field4458 > 1; // L: 47
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1688510031"
	)
	public int method7281() {
		return this.field4452.size(); // L: 51
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "163147996"
	)
	public String method7282() {
		if (this.method7371()) { // L: 55
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7281()); // L: 56

			for (int var2 = 0; var2 < this.method7281(); ++var2) { // L: 57
				class396 var3 = this.method7303(var2); // L: 58
				var1.append(var3.field4476); // L: 59
			}

			return var1.toString(); // L: 61
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-32"
	)
	public void method7328(int var1) {
		if (this.field4465 != null && var1 < this.field4465.ascent * 2) { // L: 65 66
			var1 = Integer.MAX_VALUE; // L: 67
		}

		if (this.field4459 != var1) { // L: 70
			this.field4459 = var1; // L: 71
			this.method7392(); // L: 72
		}

	} // L: 74

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1949241738"
	)
	public void method7280(int var1) {
		if (this.field4458 != var1) { // L: 77
			this.field4458 = var1; // L: 78
			this.method7392(); // L: 79
		}

	} // L: 81

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-38"
	)
	public void method7285(int var1) {
		if (this.field4468 != var1) { // L: 84
			this.field4468 = var1; // L: 85
			this.method7392(); // L: 86
		}

	} // L: 88

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpk;I)V",
		garbageValue = "1103184746"
	)
	public void method7286(AbstractFont var1) {
		if (var1 != this.field4465) { // L: 91
			this.field4465 = var1; // L: 92
			if (this.field4465 != null) { // L: 93
				if (this.field4464 == 0) { // L: 94
					this.field4464 = this.field4465.ascent; // L: 95
				}

				if (!this.method7371()) { // L: 97
					this.method7392(); // L: 98
				}
			}
		}

	} // L: 102

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1772052418"
	)
	public void method7350(int var1) {
		if (this.field4467 != var1) { // L: 105
			this.field4467 = var1; // L: 106
			this.method7392(); // L: 107
		}

	} // L: 109

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1456021058"
	)
	public boolean method7288(int var1, int var2) {
		if (this.field4455 != var1 || var2 != this.field4462) { // L: 112
			this.field4455 = var1; // L: 113
			this.field4462 = var2; // L: 114
			this.method7392(); // L: 115
		}

		return true; // L: 117
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1080029038"
	)
	public void method7289(int var1) {
		if (this.field4464 != var1) { // L: 121
			this.field4464 = var1; // L: 122
			this.method7392(); // L: 123
		}

	} // L: 125

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)Lpl;",
		garbageValue = "-1114977482"
	)
	public class398 method7290(int var1, int var2) {
		if (var2 == var1) { // L: 128
			return new class398(this, 0, 0);
		} else if (var1 <= this.field4452.size() && var2 <= this.field4452.size()) { // L: 129
			return var2 < var1 ? new class398(this, var2, var1) : new class398(this, var1, var2); // L: 130
		} else {
			return new class398(this, 0, 0); // L: 131
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(CIII)Lpu;",
		garbageValue = "-803390242"
	)
	public class395 method7346(char var1, int var2, int var3) {
		return this.method7292(Character.toString(var1), var2, var3); // L: 135
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;III)Lpu;",
		garbageValue = "-522015714"
	)
	public class395 method7292(String var1, int var2, int var3) {
		if (var3 == 0) { // L: 139
			var3 = Integer.MAX_VALUE; // L: 140
		}

		int var4 = var2; // L: 142
		if (this.field4452.size() >= var3) { // L: 143
			this.method7277(var2, var2); // L: 144
			return new class395(var2, true); // L: 145
		} else {
			this.field4452.ensureCapacity(this.field4452.size() + var1.length()); // L: 147

			for (int var5 = 0; var5 < var1.length() && this.field4452.size() < var3; ++var5) { // L: 148
				class396 var6 = new class396(); // L: 149
				var6.field4476 = var1.charAt(var5); // L: 150
				this.field4452.add(var4, var6); // L: 151
				++var4; // L: 152
			}

			this.method7277(var2, var4); // L: 154
			if (this.field4458 != 0 && this.method7341() > this.field4458) { // L: 155
				while (var4 != var2) { // L: 157
					--var4; // L: 160
					this.method7296(var4); // L: 161
					if (this.method7341() <= this.field4458) { // L: 162
						break;
					}
				}

				return new class395(var4, true); // L: 163
			} else {
				return new class395(var4, false); // L: 166
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lpu;",
		garbageValue = "-584459098"
	)
	class395 method7339(String var1, int var2) {
		return this.method7292(var1, this.field4452.size(), var2);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Lpu;",
		garbageValue = "67"
	)
	public class395 method7358(String var1) {
		this.method7295(); // L: 175
		return this.method7339(var1, 0); // L: 176
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1865432397"
	)
	void method7295() {
		this.field4452.clear(); // L: 180
	} // L: 181

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "2"
	)
	public int method7296(int var1) {
		return this.method7297(var1, var1 + 1); // L: 184
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1605170962"
	)
	public int method7297(int var1, int var2) {
		int var3;
		if (var2 < var1) { // L: 188
			var3 = var2; // L: 189
			var2 = var1; // L: 190
			var1 = var3; // L: 191
		}

		this.field4452.subList(var1, var2).clear(); // L: 193
		var3 = var1; // L: 194
		if (this.method7401() && this.field4467 == 1) { // L: 195
			while (var3 > 0) { // L: 196
				--var3; // L: 197
				char var4 = ((class396)this.field4452.get(var3)).field4476; // L: 198
				if (var4 == ' ' || var4 == '\t') { // L: 199
					break;
				}
			}
		}

		this.method7277(var3, var2); // L: 204
		return var1; // L: 205
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "194"
	)
	public int method7327(int var1, int var2) {
		if (this.field4465 == null) { // L: 209
			return 0;
		} else if (this.method7401() && var1 > this.field4459) { // L: 210
			return this.field4452.size();
		} else {
			if (!this.field4452.isEmpty()) { // L: 211
				for (int var3 = 0; var3 < this.field4452.size(); ++var3) { // L: 212
					class396 var4 = (class396)this.field4452.get(var3); // L: 213
					if (var2 <= var4.field4478 + this.method7302()) { // L: 214
						if (var2 < var4.field4478) { // L: 215
							break;
						}

						if (var1 < var4.field4475) { // L: 216
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (1 + var3 != this.field4452.size() && ((class396)this.field4452.get(1 + var3)).field4478 != var4.field4478) { // L: 217
							int var5 = this.method7322((class396)this.field4452.get(var3), false); // L: 218
							if (var1 < var5 + var4.field4475) { // L: 219
								return var3; // L: 220
							}

							if (var2 <= var4.field4478 + this.method7302()) { // L: 222
								return var3 + 1; // L: 223
							}
						}
					}
				}

				class396 var6 = (class396)this.field4452.get(this.field4452.size() - 1); // L: 228
				if (var1 >= var6.field4475 && var1 <= var6.field4475 + this.method7304() && var2 >= var6.field4478 && var2 <= var6.field4478 + this.method7302()) { // L: 229
					return this.field4452.size() - 1; // L: 230
				}
			}

			return this.field4452.size(); // L: 233
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "139"
	)
	public int method7299(int var1, int var2) {
		if (this.field4465 != null && !this.method7371() && var1 <= this.field4452.size()) { // L: 237
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
				class396 var6 = (class396)this.field4452.get(var1 - 1); // L: 249
				var4 = var6.field4475 + this.method7313(var1 - 1); // L: 250
				var5 = var6.field4478; // L: 251
			} else if (var3 == -1 && var1 == 0) { // L: 253
				return 0; // L: 254
			}

			int var14 = 16777215; // L: 256
			int var7 = 0; // L: 257
			int var8 = var1; // L: 258
			int var9 = 16777215; // L: 259
			int var10 = var3 == 1 ? this.field4452.size() + 1 : 0; // L: 260

			for (int var11 = var3 + var1; var10 != var11; var11 += var3) { // L: 261
				class396 var12 = (class396)this.field4452.get(var11 - 1); // L: 262
				if (var5 != var12.field4478) { // L: 263
					++var7; // L: 264
					var5 = var12.field4478; // L: 265
					if (var7 > var2) { // L: 266
						return var8; // L: 267
					}
				}

				if (var7 == var2) { // L: 270
					int var13 = Math.abs(var12.field4475 + this.method7313(var11 - 1) - var4); // L: 271
					if (var13 >= var9) { // L: 272
						return var8; // L: 277
					}

					var8 = var11; // L: 273
					var9 = var13; // L: 274
				}
			}

			if (var3 == 1) { // L: 281
				return this.field4452.size(); // L: 282
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-540646519"
	)
	public int method7300() {
		if (!this.field4452.isEmpty() && this.method7341() == 1) { // L: 298
			return this.field4452.isEmpty() ? 0 : ((class396)this.field4452.get(this.field4452.size() - 1)).field4475 + this.method7304(); // L: 299
		} else {
			int var1 = -1; // L: 302
			int var2 = 0; // L: 303

			for (int var3 = this.field4452.size() - 1; var3 >= 0; --var3) { // L: 304
				class396 var4 = (class396)this.field4452.get(var3); // L: 305
				if (var1 != var4.field4478) { // L: 306
					int var5 = this.method7322(var4, false) + var4.field4475; // L: 307
					var2 = Math.max(var5, var2); // L: 308
					var1 = var4.field4478; // L: 309
				}
			}

			return var2; // L: 312
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "872153542"
	)
	public int method7301() {
		return this.method7371() ? 0 : this.field4465.ascent + ((class396)this.field4452.get(this.field4452.size() - 1)).field4478; // L: 317
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1220139043"
	)
	public int method7302() {
		return this.field4464; // L: 321
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "106"
	)
	public int method7341() {
		return this.method7301() / this.field4465.ascent; // L: 325
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1975027491"
	)
	int method7304() {
		return this.method7371() ? 0 : this.method7322((class396)this.field4452.get(this.field4452.size() - 1), false); // L: 329
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "103"
	)
	public int method7403() {
		return this.field4459; // L: 333
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2030708038"
	)
	public int method7306() {
		return this.field4458; // L: 337
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "106"
	)
	public int method7325() {
		return this.field4467; // L: 341
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "326799918"
	)
	public int method7308() {
		return this.field4468; // L: 345
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "0"
	)
	public int method7309(int var1) {
		switch(this.field4455) { // L: 349
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

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "59"
	)
	public int method7310(int var1) {
		switch(this.field4462) { // L: 361
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

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2042432438"
	)
	void method7392() {
		this.method7277(0, this.field4452.size()); // L: 373
	} // L: 374

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2146351228"
	)
	void method7277(int var1, int var2) {
		if (!this.method7371() && this.field4465 != null) { // L: 377
			class485 var3 = this.method7315(var1, var2); // L: 378
			boolean var4 = (Integer)var3.field4966 == 0 && (Integer)var3.field4965 == this.field4452.size(); // L: 379
			int var5 = (Integer)var3.field4966; // L: 380
			int var6 = 0; // L: 381
			int var7 = var4 ? 0 : ((class396)this.field4452.get((Integer)var3.field4966)).field4478; // L: 382
			int var8 = 0; // L: 383

			int var9;
			for (var9 = (Integer)var3.field4966; var9 <= (Integer)var3.field4965; ++var9) { // L: 384
				boolean var10 = var9 >= this.field4452.size(); // L: 385
				class396 var21 = (class396)this.field4452.get(!var10 ? var9 : this.field4452.size() - 1); // L: 386
				int var22 = !var10 ? this.method7322(var21, false) : 0; // L: 387
				boolean var13 = !var10 && var21.field4476 == '\n'; // L: 388
				boolean var14 = !var10 && this.method7401() && var22 + var6 > this.field4459; // L: 389
				if (var13 || var14 || var10) { // L: 390
					int var15 = var9; // L: 391
					int var16 = 0; // L: 392
					int var17;
					int var18;
					class396 var19;
					if (var14) { // L: 393
						var17 = 0; // L: 394
						if (this.field4467 == 1) { // L: 395
							for (var18 = var9; var18 > var5; --var18) { // L: 396
								var19 = (class396)this.field4452.get(var18); // L: 397
								var17 += var18 < var15 ? this.method7322(var19, false) : 0; // L: 398
								if (var19.field4476 == ' ' || var19.field4476 == '\n') { // L: 399
									var15 = var18; // L: 400
									var6 -= var17; // L: 401
									var16 = var17; // L: 402
									break;
								}
							}
						}
					}

					var17 = -this.method7309(var6); // L: 408

					for (var18 = var5; var18 < var15; ++var18) { // L: 409
						var19 = (class396)this.field4452.get(var18); // L: 410
						int var20 = this.method7322(var19, false); // L: 411
						var19.field4475 = var17; // L: 412
						var19.field4478 = var7; // L: 413
						var17 += var20; // L: 414
					}

					var5 = var15; // L: 416
					var6 = var16; // L: 417
					var7 += this.method7302(); // L: 418
					++var8; // L: 419
				}

				var6 += !var10 ? var22 : 0; // L: 421
			}

			if (this.field4462 != 0 && var4) { // L: 423
				var9 = var8 * this.method7302(); // L: 424
				int var23 = this.method7310(var9); // L: 425

				for (int var11 = 0; var11 < this.field4452.size(); ++var11) { // L: 426
					class396 var12 = (class396)this.field4452.get(var11); // L: 427
					var12.field4478 -= var23; // L: 428
				}
			}

		}
	} // L: 431

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "369306860"
	)
	int method7313(int var1) {
		return var1 < this.field4452.size() ? this.method7322((class396)this.field4452.get(var1), false) : 0; // L: 434
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lpz;ZI)I",
		garbageValue = "1524622539"
	)
	int method7322(class396 var1, boolean var2) {
		if (var1.field4476 == '\n') { // L: 438
			return 0;
		} else if (this.field4468 == 0) { // L: 439
			int var3 = this.field4465.advances[var1.field4476]; // L: 440
			if (var3 == 0) { // L: 441
				return var1.field4476 == '\t' ? this.field4465.advances[32] * 3 : this.field4465.advances[32]; // L: 442 443 446
			} else {
				return var3; // L: 450
			}
		} else {
			return this.field4465.advances[42]; // L: 454
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lss;",
		garbageValue = "0"
	)
	class485 method7315(int var1, int var2) {
		int var3 = Math.min(var1, var2); // L: 459
		int var4 = Math.max(var1, var2); // L: 460
		int var5 = this.field4452.size(); // L: 461
		if (var3 == 0 && var4 == var5) { // L: 462
			return new class485(0, var5); // L: 463
		} else {
			int var6 = this.method7316(var3, false); // L: 465
			int var7 = this.method7326(var4, false); // L: 466
			int var8;
			switch(this.field4462) { // L: 467
			case 0:
				if (this.field4455 == 0) { // L: 480
					return new class485(var6, var5); // L: 481
				}

				var8 = this.method7316(var3, true); // L: 483
				return new class485(var8, var5); // L: 484
			case 1:
				return new class485(0, var5); // L: 477
			case 2:
				if (this.field4455 == 2) { // L: 470
					return new class485(0, var7); // L: 471
				}

				var8 = this.method7326(var4, true); // L: 473
				return new class485(0, var8); // L: 474
			default:
				return new class485(0, var5); // L: 487
			}
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-1605508090"
	)
	int method7316(int var1, boolean var2) {
		if (var1 < this.field4452.size()) { // L: 491
			int var3 = ((class396)this.field4452.get(var1)).field4478; // L: 492

			for (int var4 = var1; var4 > 0; --var4) { // L: 493
				if (((class396)this.field4452.get(var4 - 1)).field4478 < var3) { // L: 494
					if (!var2) { // L: 495
						return var4; // L: 496
					}

					var2 = false; // L: 498
					var3 = ((class396)this.field4452.get(var4 - 1)).field4478; // L: 499
				}
			}
		}

		return 0; // L: 503
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "1892979097"
	)
	int method7326(int var1, boolean var2) {
		if (var1 < this.field4452.size()) { // L: 507
			int var3 = ((class396)this.field4452.get(var1)).field4478; // L: 508

			for (int var4 = var1; var4 < this.field4452.size() - 1; ++var4) { // L: 509
				if (((class396)this.field4452.get(var4 + 1)).field4478 > var3) { // L: 510
					if (!var2) { // L: 511
						return var4; // L: 512
					}

					var2 = false; // L: 514
					var3 = ((class396)this.field4452.get(var4 + 1)).field4478; // L: 515
				}
			}
		}

		return this.field4452.size(); // L: 519
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1123926703"
	)
	public static void method7382() {
		HitSplatDefinition.HitSplatDefinition_cached.clear(); // L: 171
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear(); // L: 172
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear(); // L: 173
	} // L: 174
}
