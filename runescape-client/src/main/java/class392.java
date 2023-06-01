import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("pf")
public class class392 {
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1050448917
	)
	int field4437;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -577320293
	)
	int field4444;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1663811817
	)
	int field4439;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1212701215
	)
	int field4443;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1123937705
	)
	int field4438;
	@ObfuscatedName("aq")
	boolean field4442;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	AbstractFont field4432;
	@ObfuscatedName("ak")
	ArrayList field4441;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 2119610625
	)
	int field4445;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1629750027
	)
	int field4446;

	public class392() {
		this.field4437 = Integer.MAX_VALUE; // L: 22
		this.field4444 = Integer.MAX_VALUE; // L: 23
		this.field4439 = 0; // L: 24
		this.field4443 = 0; // L: 25
		this.field4438 = 0; // L: 26
		this.field4442 = true; // L: 27
		this.field4441 = new ArrayList(); // L: 29
		this.field4445 = 0; // L: 30
		this.field4446 = 0; // L: 31
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Lpy;",
		garbageValue = "-1959930096"
	)
	public class394 method7252(int var1) {
		return (class394)this.field4441.get(var1); // L: 34
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Lpy;",
		garbageValue = "-1743578640"
	)
	class394 method7284() {
		return this.field4441.size() == 0 ? null : (class394)this.field4441.get(this.field4441.size() - 1); // L: 38 39
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "71"
	)
	public boolean method7254() {
		return this.field4441.size() == 0; // L: 43
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1591966303"
	)
	boolean method7255() {
		return this.field4444 > 1; // L: 47
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1691894466"
	)
	public int method7256() {
		return this.field4441.size(); // L: 51
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1391266530"
	)
	public String method7257() {
		if (this.method7254()) { // L: 55
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7256()); // L: 56

			for (int var2 = 0; var2 < this.method7256(); ++var2) { // L: 57
				class394 var3 = this.method7252(var2); // L: 58
				var1.append(var3.field4454); // L: 59
			}

			return var1.toString(); // L: 61
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-1"
	)
	public void method7275(int var1) {
		if (this.field4432 != null && var1 < this.field4432.ascent * 2) { // L: 65 66
			var1 = Integer.MAX_VALUE; // L: 67
		}

		if (this.field4437 != var1) { // L: 70
			this.field4437 = var1; // L: 71
			this.method7286(); // L: 72
		}

	} // L: 74

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-88"
	)
	public void method7259(int var1) {
		if (this.field4444 != var1) { // L: 77
			this.field4444 = var1; // L: 78
			this.method7286(); // L: 79
		}

	} // L: 81

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-243263697"
	)
	public void method7370(int var1) {
		if (this.field4446 != var1) { // L: 84
			this.field4446 = var1; // L: 85
			this.method7286(); // L: 86
		}

	} // L: 88

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lpw;I)V",
		garbageValue = "-1456581897"
	)
	public void method7382(AbstractFont var1) {
		if (var1 != this.field4432) { // L: 91
			this.field4432 = var1; // L: 92
			if (this.field4432 != null) { // L: 93
				if (this.field4438 == 0) { // L: 94
					this.field4438 = this.field4432.ascent; // L: 95
				}

				if (!this.method7254()) { // L: 97
					this.method7286(); // L: 98
				}
			}
		}

	} // L: 102

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-495258447"
	)
	public void method7276(int var1) {
		if (this.field4445 != var1) { // L: 105
			this.field4445 = var1; // L: 106
			this.method7286(); // L: 107
		}

	} // L: 109

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1761695950"
	)
	public boolean method7372(int var1, int var2) {
		if (this.field4439 != var1 || var2 != this.field4443) { // L: 112
			this.field4439 = var1; // L: 113
			this.field4443 = var2; // L: 114
			this.method7286(); // L: 115
		}

		return true; // L: 117
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1996850532"
	)
	public void method7327(int var1) {
		if (this.field4438 != var1) { // L: 121
			this.field4438 = var1; // L: 122
			this.method7286(); // L: 123
		}

	} // L: 125

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)Lpb;",
		garbageValue = "-1500571238"
	)
	public class396 method7265(int var1, int var2) {
		if (var2 == var1) { // L: 128
			return new class396(this, 0, 0);
		} else if (var1 <= this.field4441.size() && var2 <= this.field4441.size()) { // L: 129
			return var2 < var1 ? new class396(this, var2, var1) : new class396(this, var1, var2); // L: 130
		} else {
			return new class396(this, 0, 0); // L: 131
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(CIII)Lpu;",
		garbageValue = "1340775161"
	)
	public class393 method7266(char var1, int var2, int var3) {
		return this.method7267(Character.toString(var1), var2, var3); // L: 135
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;III)Lpu;",
		garbageValue = "-1987943617"
	)
	public class393 method7267(String var1, int var2, int var3) {
		if (var3 == 0) { // L: 139
			var3 = Integer.MAX_VALUE; // L: 140
		}

		int var4 = var2; // L: 142
		if (this.field4441.size() >= var3) { // L: 143
			this.method7287(var2, var2); // L: 144
			return new class393(var2, true); // L: 145
		} else {
			this.field4441.ensureCapacity(this.field4441.size() + var1.length()); // L: 147

			for (int var5 = 0; var5 < var1.length() && this.field4441.size() < var3; ++var5) { // L: 148
				class394 var6 = new class394(); // L: 149
				var6.field4454 = var1.charAt(var5); // L: 150
				this.field4441.add(var4, var6); // L: 151
				++var4; // L: 152
			}

			this.method7287(var2, var4); // L: 154
			if (this.field4444 != 0 && this.method7282() > this.field4444) { // L: 155
				while (var4 != var2) { // L: 157
					--var4; // L: 160
					this.method7271(var4); // L: 161
					if (this.method7282() <= this.field4444) { // L: 162
						break;
					}
				}

				return new class393(var4, true); // L: 163
			} else {
				return new class393(var4, false); // L: 166
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lpu;",
		garbageValue = "2096268467"
	)
	class393 method7268(String var1, int var2) {
		return this.method7267(var1, this.field4441.size(), var2); // L: 171
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lpu;",
		garbageValue = "-2118925808"
	)
	public class393 method7318(String var1) {
		this.method7270(); // L: 175
		return this.method7268(var1, 0); // L: 176
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2129164783"
	)
	void method7270() {
		this.field4441.clear(); // L: 180
	} // L: 181

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1869436519"
	)
	public int method7271(int var1) {
		return this.method7269(var1, var1 + 1); // L: 184
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-98"
	)
	public int method7269(int var1, int var2) {
		int var3;
		if (var2 < var1) { // L: 188
			var3 = var2; // L: 189
			var2 = var1; // L: 190
			var1 = var3; // L: 191
		}

		this.field4441.subList(var1, var2).clear(); // L: 193
		var3 = var1; // L: 194
		if (this.method7255() && this.field4445 == 1) { // L: 195
			while (var3 > 0) { // L: 196
				--var3; // L: 197
				char var4 = ((class394)this.field4441.get(var3)).field4454; // L: 198
				if (var4 == ' ' || var4 == '\t') { // L: 199
					break;
				}
			}
		}

		this.method7287(var3, var2); // L: 204
		return var1; // L: 205
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1051171986"
	)
	public int method7273(int var1, int var2) {
		if (this.field4432 == null) { // L: 209
			return 0;
		} else if (this.method7255() && var1 > this.field4437) { // L: 210
			return this.field4441.size();
		} else {
			if (!this.field4441.isEmpty()) { // L: 211
				for (int var3 = 0; var3 < this.field4441.size(); ++var3) { // L: 212
					class394 var4 = (class394)this.field4441.get(var3); // L: 213
					if (var2 <= var4.field4455 + this.method7277()) { // L: 214
						if (var2 < var4.field4455) { // L: 215
							break;
						}

						if (var1 < var4.field4451) { // L: 216
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (1 + var3 != this.field4441.size() && ((class394)this.field4441.get(var3 + 1)).field4455 != var4.field4455) { // L: 217
							int var5 = this.method7289((class394)this.field4441.get(var3), false); // L: 218
							if (var1 < var5 + var4.field4451) { // L: 219
								return var3; // L: 220
							}

							if (var2 <= var4.field4455 + this.method7277()) { // L: 222
								return var3 + 1; // L: 223
							}
						}
					}
				}

				class394 var6 = (class394)this.field4441.get(this.field4441.size() - 1); // L: 228
				if (var1 >= var6.field4451 && var1 <= var6.field4451 + this.method7279() && var2 >= var6.field4455 && var2 <= var6.field4455 + this.method7277()) { // L: 229
					return this.field4441.size() - 1; // L: 230
				}
			}

			return this.field4441.size(); // L: 233
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "45"
	)
	public int method7274(int var1, int var2) {
		if (this.field4432 != null && !this.method7254() && var1 <= this.field4441.size()) { // L: 237
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
				class394 var6 = (class394)this.field4441.get(var1 - 1); // L: 249
				var4 = var6.field4451 + this.method7320(var1 - 1); // L: 250
				var5 = var6.field4455; // L: 251
			} else if (var3 == -1 && var1 == 0) { // L: 253
				return 0; // L: 254
			}

			int var14 = 16777215; // L: 256
			int var7 = 0; // L: 257
			int var8 = var1; // L: 258
			int var9 = 16777215; // L: 259
			int var10 = var3 == 1 ? this.field4441.size() + 1 : 0; // L: 260

			for (int var11 = var3 + var1; var10 != var11; var11 += var3) { // L: 261
				class394 var12 = (class394)this.field4441.get(var11 - 1); // L: 262
				if (var5 != var12.field4455) { // L: 263
					++var7; // L: 264
					var5 = var12.field4455; // L: 265
					if (var7 > var2) { // L: 266
						return var8; // L: 267
					}
				}

				if (var7 == var2) { // L: 270
					int var13 = Math.abs(var12.field4451 + this.method7320(var11 - 1) - var4); // L: 271
					if (var13 >= var9) { // L: 272
						return var8; // L: 277
					}

					var8 = var11; // L: 273
					var9 = var13; // L: 274
				}
			}

			if (var3 == 1) { // L: 281
				return this.field4441.size(); // L: 282
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-111"
	)
	public int method7288() {
		if (!this.field4441.isEmpty() && this.method7282() == 1) { // L: 298
			return this.field4441.isEmpty() ? 0 : ((class394)this.field4441.get(this.field4441.size() - 1)).field4451 + this.method7279(); // L: 299
		} else {
			int var1 = -1; // L: 302
			int var2 = 0; // L: 303

			for (int var3 = this.field4441.size() - 1; var3 >= 0; --var3) { // L: 304
				class394 var4 = (class394)this.field4441.get(var3); // L: 305
				if (var1 != var4.field4455) { // L: 306
					int var5 = this.method7289(var4, false) + var4.field4451; // L: 307
					var2 = Math.max(var5, var2); // L: 308
					var1 = var4.field4455; // L: 309
				}
			}

			return var2; // L: 312
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1988081077"
	)
	public int method7278() {
		return this.method7254() ? 0 : this.field4432.ascent + ((class394)this.field4441.get(this.field4441.size() - 1)).field4455; // L: 317
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1360678903"
	)
	public int method7277() {
		return this.field4438; // L: 321
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	public int method7282() {
		return this.method7278() / this.field4432.ascent; // L: 325
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1597141935"
	)
	int method7279() {
		return this.method7254() ? 0 : this.method7289((class394)this.field4441.get(this.field4441.size() - 1), false); // L: 329
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1999756634"
	)
	public int method7262() {
		return this.field4437; // L: 333
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "504943589"
	)
	public int method7313() {
		return this.field4444; // L: 337
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1722328476"
	)
	public int method7301() {
		return this.field4445; // L: 341
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "80"
	)
	public int method7309() {
		return this.field4446; // L: 345
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1800865269"
	)
	public int method7336(int var1) {
		switch(this.field4439) { // L: 349
		case 0:
			return 0; // L: 355
		case 1:
			return var1 / 2; // L: 353
		case 2:
			return var1; // L: 351
		default:
			return 0; // L: 357
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2104118973"
	)
	public int method7285(int var1) {
		switch(this.field4443) { // L: 361
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

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2090488028"
	)
	void method7286() {
		this.method7287(0, this.field4441.size()); // L: 373
	} // L: 374

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1272554413"
	)
	void method7287(int var1, int var2) {
		if (!this.method7254() && this.field4432 != null) { // L: 377
			class473 var3 = this.method7367(var1, var2); // L: 378
			boolean var4 = (Integer)var3.field4909 == 0 && (Integer)var3.field4908 == this.field4441.size(); // L: 379
			int var5 = (Integer)var3.field4909; // L: 380
			int var6 = 0; // L: 381
			int var7 = var4 ? 0 : ((class394)this.field4441.get((Integer)var3.field4909)).field4455; // L: 382
			int var8 = 0; // L: 383

			int var9;
			for (var9 = (Integer)var3.field4909; var9 <= (Integer)var3.field4908; ++var9) { // L: 384
				boolean var10 = var9 >= this.field4441.size(); // L: 385
				class394 var21 = (class394)this.field4441.get(!var10 ? var9 : this.field4441.size() - 1); // L: 386
				int var22 = !var10 ? this.method7289(var21, false) : 0; // L: 387
				boolean var13 = !var10 && var21.field4454 == '\n'; // L: 388
				boolean var14 = !var10 && this.method7255() && var6 + var22 > this.field4437; // L: 389
				if (var13 || var14 || var10) { // L: 390
					int var15 = var9; // L: 391
					int var16 = 0; // L: 392
					int var17;
					int var18;
					class394 var19;
					if (var14) { // L: 393
						var17 = 0; // L: 394
						if (this.field4445 == 1) { // L: 395
							for (var18 = var9; var18 > var5; --var18) { // L: 396
								var19 = (class394)this.field4441.get(var18); // L: 397
								var17 += var18 < var15 ? this.method7289(var19, false) : 0; // L: 398
								if (var19.field4454 == ' ' || var19.field4454 == '\n') { // L: 399
									var15 = var18; // L: 400
									var6 -= var17; // L: 401
									var16 = var17; // L: 402
									break;
								}
							}
						}
					}

					var17 = -this.method7336(var6); // L: 408

					for (var18 = var5; var18 < var15; ++var18) { // L: 409
						var19 = (class394)this.field4441.get(var18); // L: 410
						int var20 = this.method7289(var19, false); // L: 411
						var19.field4451 = var17; // L: 412
						var19.field4455 = var7; // L: 413
						var17 += var20; // L: 414
					}

					var5 = var15; // L: 416
					var6 = var16; // L: 417
					var7 += this.method7277(); // L: 418
					++var8; // L: 419
				}

				var6 += !var10 ? var22 : 0; // L: 421
			}

			if (this.field4443 != 0 && var4) { // L: 423
				var9 = var8 * this.method7277(); // L: 424
				int var23 = this.method7285(var9); // L: 425

				for (int var11 = 0; var11 < this.field4441.size(); ++var11) { // L: 426
					class394 var12 = (class394)this.field4441.get(var11); // L: 427
					var12.field4455 -= var23; // L: 428
				}
			}

		}
	} // L: 431

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-132641496"
	)
	int method7320(int var1) {
		return var1 < this.field4441.size() ? this.method7289((class394)this.field4441.get(var1), false) : 0; // L: 434
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lpy;ZB)I",
		garbageValue = "4"
	)
	int method7289(class394 var1, boolean var2) {
		if (var1.field4454 == '\n') { // L: 438
			return 0;
		} else if (this.field4446 == 0) { // L: 439
			int var3 = this.field4432.advances[var1.field4454]; // L: 440
			if (var3 == 0) { // L: 441
				return var1.field4454 == '\t' ? this.field4432.advances[32] * 3 : this.field4432.advances[32]; // L: 442 443 446
			} else {
				return var3; // L: 450
			}
		} else {
			return this.field4432.advances[42]; // L: 454
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(III)Lsk;",
		garbageValue = "-637466202"
	)
	class473 method7367(int var1, int var2) {
		int var3 = Math.min(var1, var2); // L: 459
		int var4 = Math.max(var1, var2); // L: 460
		int var5 = this.field4441.size(); // L: 461
		if (var3 == 0 && var4 == var5) { // L: 462
			return new class473(0, var5); // L: 463
		} else {
			int var6 = this.method7291(var3, false); // L: 465
			int var7 = this.method7292(var4, false); // L: 466
			int var8;
			switch(this.field4443) { // L: 467
			case 0:
				if (this.field4439 == 0) { // L: 480
					return new class473(var6, var5); // L: 481
				}

				var8 = this.method7291(var3, true); // L: 483
				return new class473(var8, var5); // L: 484
			case 1:
				return new class473(0, var5); // L: 469
			case 2:
				if (this.field4439 == 2) { // L: 472
					return new class473(0, var7); // L: 473
				}

				var8 = this.method7292(var4, true); // L: 475
				return new class473(0, var8); // L: 476
			default:
				return new class473(0, var5); // L: 487
			}
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-1904680937"
	)
	int method7291(int var1, boolean var2) {
		if (var1 < this.field4441.size()) { // L: 491
			int var3 = ((class394)this.field4441.get(var1)).field4455; // L: 492

			for (int var4 = var1; var4 > 0; --var4) { // L: 493
				if (((class394)this.field4441.get(var4 - 1)).field4455 < var3) { // L: 494
					if (!var2) { // L: 495
						return var4; // L: 496
					}

					var2 = false; // L: 498
					var3 = ((class394)this.field4441.get(var4 - 1)).field4455; // L: 499
				}
			}
		}

		return 0; // L: 503
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-2118051099"
	)
	int method7292(int var1, boolean var2) {
		if (var1 < this.field4441.size()) { // L: 507
			int var3 = ((class394)this.field4441.get(var1)).field4455; // L: 508

			for (int var4 = var1; var4 < this.field4441.size() - 1; ++var4) { // L: 509
				if (((class394)this.field4441.get(var4 + 1)).field4455 > var3) { // L: 510
					if (!var2) { // L: 511
						return var4; // L: 512
					}

					var2 = false; // L: 514
					var3 = ((class394)this.field4441.get(var4 + 1)).field4455; // L: 515
				}
			}
		}

		return this.field4441.size(); // L: 519
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZI)I",
		garbageValue = "739660535"
	)
	static int method7392(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) { // L: 1878
			var7 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 1879
			HealthBarUpdate.addGameMessage(0, "", var7); // L: 1880
			return 1; // L: 1881
		} else if (var0 == ScriptOpcodes.ANIM) {
			class336.Interpreter_intStackSize -= 2; // L: 1884
			NameableContainer.performPlayerAnimation(HitSplatDefinition.localPlayer, Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]); // L: 1885
			return 1; // L: 1886
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field833) { // L: 1889
				Interpreter.field835 = true; // L: 1890
			}

			return 1; // L: 1892
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 1895
				var15 = 0; // L: 1896
				if (DynamicObject.isNumber(var7)) { // L: 1897
					var15 = VarbitComposition.method3780(var7);
				}

				PacketBufferNode var13 = class251.getPacketBufferNode(ClientPacket.field3158, Client.packetWriter.isaacCipher); // L: 1899
				var13.packetBuffer.writeIntME(var15); // L: 1900
				Client.packetWriter.addNode(var13); // L: 1901
				return 1; // L: 1902
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 1905
					var11 = class251.getPacketBufferNode(ClientPacket.field3189, Client.packetWriter.isaacCipher); // L: 1907
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1908
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1909
					Client.packetWriter.addNode(var11); // L: 1910
					return 1; // L: 1911
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 1914
					var11 = class251.getPacketBufferNode(ClientPacket.field3191, Client.packetWriter.isaacCipher); // L: 1916
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1917
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1918
					Client.packetWriter.addNode(var11); // L: 1919
					return 1; // L: 1920
				} else {
					int var3;
					String var4;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 1923
						var4 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 1924
						WorldMapEvent.method5639(var3, var4); // L: 1925
						return 1; // L: 1926
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						class336.Interpreter_intStackSize -= 3; // L: 1929
						var3 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 1930
						var15 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 1931
						int var9 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 2]; // L: 1932
						Widget var14 = ArchiveDiskActionHandler.getWidget(var9); // L: 1933
						ArchiveLoader.clickWidget(var14, var3, var15); // L: 1934
						return 1; // L: 1935
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						class336.Interpreter_intStackSize -= 2; // L: 1938
						var3 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 1939
						var15 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 1940
						Widget var12 = var2 ? Interpreter.scriptDotWidget : HealthBarUpdate.field1223; // L: 1941
						ArchiveLoader.clickWidget(var12, var3, var15); // L: 1942
						return 1; // L: 1943
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						Client.mouseCam = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 1946
						return 1; // L: 1947
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = WorldMapManager.clientPreferences.method2536() ? 1 : 0; // L: 1950
						return 1; // L: 1951
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						WorldMapManager.clientPreferences.method2426(Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1); // L: 1954
						return 1; // L: 1955
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 1958
						boolean var8 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 1959
						class125.openURL(var7, var8, false); // L: 1960
						return 1; // L: 1961
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 1964
						var11 = class251.getPacketBufferNode(ClientPacket.field3197, Client.packetWriter.isaacCipher); // L: 1966
						var11.packetBuffer.writeShort(var3); // L: 1967
						Client.packetWriter.addNode(var11); // L: 1968
						return 1; // L: 1969
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 1972
						class156.Interpreter_stringStackSize -= 2; // L: 1973
						var4 = Interpreter.Interpreter_stringStack[class156.Interpreter_stringStackSize]; // L: 1974
						String var5 = Interpreter.Interpreter_stringStack[class156.Interpreter_stringStackSize + 1]; // L: 1975
						if (var4.length() > 500) { // L: 1976
							return 1;
						} else if (var5.length() > 500) { // L: 1977
							return 1;
						} else {
							PacketBufferNode var6 = class251.getPacketBufferNode(ClientPacket.field3108, Client.packetWriter.isaacCipher); // L: 1978
							var6.packetBuffer.writeShort(1 + class298.stringCp1252NullTerminatedByteSize(var4) + class298.stringCp1252NullTerminatedByteSize(var5)); // L: 1979
							var6.packetBuffer.writeStringCp1252NullTerminated(var5); // L: 1980
							var6.packetBuffer.writeByte(var3); // L: 1981
							var6.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 1982
							Client.packetWriter.addNode(var6); // L: 1983
							return 1; // L: 1984
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						--class336.Interpreter_intStackSize; // L: 1987
						return 1; // L: 1988
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 1991
						return 1; // L: 1992
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.field503 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 1995
						return 1; // L: 1996
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1) { // L: 1999
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2; // L: 2000
						}

						return 1; // L: 2001
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1) { // L: 2004
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3; // L: 2005
						}

						return 1; // L: 2006
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1) { // L: 2009
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5; // L: 2010
						}

						return 1; // L: 2011
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1) { // L: 2014
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9; // L: 2015
						}

						return 1; // L: 2016
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0; // L: 2019
						return 1; // L: 2020
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 2023
						return 1; // L: 2024
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 2027
						return 1; // L: 2028
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						class130.setTapToDrop(Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1); // L: 2031
						return 1; // L: 2032
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = WorldMapIcon_1.getTapToDrop() ? 1 : 0; // L: 2035
						return 1; // L: 2036
					} else if (var0 == 3129) {
						class336.Interpreter_intStackSize -= 2; // L: 2039
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 2040
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 2041
						return 1; // L: 2042
					} else if (var0 == 3130) {
						class336.Interpreter_intStackSize -= 2; // L: 2045
						return 1; // L: 2046
					} else if (var0 == 3131) {
						--class336.Interpreter_intStackSize; // L: 2049
						return 1; // L: 2050
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class10.canvasWidth; // L: 2053
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class11.canvasHeight; // L: 2054
						return 1; // L: 2055
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--class336.Interpreter_intStackSize; // L: 2058
						return 1; // L: 2059
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1; // L: 2062
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						class336.Interpreter_intStackSize -= 2; // L: 2065
						return 1; // L: 2066
					} else if (var0 == 3136) {
						Client.field652 = 3; // L: 2069
						Client.field653 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 2070
						return 1; // L: 2071
					} else if (var0 == 3137) {
						Client.field652 = 2; // L: 2074
						Client.field653 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 2075
						return 1; // L: 2076
					} else if (var0 == 3138) {
						Client.field652 = 0; // L: 2079
						return 1; // L: 2080
					} else if (var0 == 3139) {
						Client.field652 = 1; // L: 2083
						return 1; // L: 2084
					} else if (var0 == 3140) {
						Client.field652 = 3; // L: 2087
						Client.field653 = var2 ? Interpreter.scriptDotWidget.id : HealthBarUpdate.field1223.id; // L: 2088
						return 1; // L: 2089
					} else {
						boolean var10;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 2092
							WorldMapManager.clientPreferences.method2428(var10); // L: 2093
							return 1; // L: 2094
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = WorldMapManager.clientPreferences.method2458() ? 1 : 0; // L: 2097
							return 1; // L: 2098
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 2101
							Client.Login_isUsernameRemembered = var10; // L: 2102
							if (!var10) { // L: 2103
								WorldMapManager.clientPreferences.method2445(""); // L: 2104
							}

							return 1; // L: 2106
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0; // L: 2109
							return 1; // L: 2110
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1; // L: 2113
						} else if (var0 == 3146) {
							var10 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 2116
							WorldMapManager.clientPreferences.method2481(!var10); // L: 2117
							return 1; // L: 2118
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = WorldMapManager.clientPreferences.method2435() ? 0 : 1; // L: 2121
							return 1; // L: 2122
						} else if (var0 == 3148) {
							return 1; // L: 2125
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 2128
							return 1; // L: 2129
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 2132
							return 1; // L: 2133
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 2136
							return 1; // L: 2137
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 2140
							return 1; // L: 2141
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Login.Login_loadingPercent; // L: 2144
							return 1; // L: 2145
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = SoundSystem.method837(); // L: 2148
							return 1; // L: 2149
						} else if (var0 == 3155) {
							--class156.Interpreter_stringStackSize; // L: 2152
							return 1; // L: 2153
						} else if (var0 == 3156) {
							return 1; // L: 2156
						} else if (var0 == 3157) {
							class336.Interpreter_intStackSize -= 2; // L: 2159
							return 1; // L: 2160
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 2163
							return 1; // L: 2164
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 2167
							return 1; // L: 2168
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 2171
							return 1; // L: 2172
						} else if (var0 == 3161) {
							--class336.Interpreter_intStackSize; // L: 2175
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 2176
							return 1; // L: 2177
						} else if (var0 == 3162) {
							--class336.Interpreter_intStackSize; // L: 2180
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 2181
							return 1; // L: 2182
						} else if (var0 == 3163) {
							--class156.Interpreter_stringStackSize; // L: 2185
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 2186
							return 1; // L: 2187
						} else if (var0 == 3164) {
							--class336.Interpreter_intStackSize; // L: 2190
							Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 2191
							return 1; // L: 2192
						} else if (var0 == 3165) {
							--class336.Interpreter_intStackSize; // L: 2195
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 2196
							return 1; // L: 2197
						} else if (var0 == 3166) {
							class336.Interpreter_intStackSize -= 2; // L: 2200
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 2201
							return 1; // L: 2202
						} else if (var0 == 3167) {
							class336.Interpreter_intStackSize -= 2; // L: 2205
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 2206
							return 1; // L: 2207
						} else if (var0 == 3168) {
							class336.Interpreter_intStackSize -= 2; // L: 2210
							Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 2211
							Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 2212
							Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 2213
							Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 2214
							Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 2215
							Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 2216
							Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 2217
							Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 2218
							Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 2219
							return 1; // L: 2220
						} else if (var0 == 3169) {
							return 1; // L: 2223
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 2226
							return 1; // L: 2227
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 2230
							return 1; // L: 2231
						} else if (var0 == 3172) {
							--class336.Interpreter_intStackSize; // L: 2234
							return 1; // L: 2235
						} else if (var0 == 3173) {
							--class336.Interpreter_intStackSize; // L: 2238
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 2239
							return 1; // L: 2240
						} else if (var0 == 3174) {
							--class336.Interpreter_intStackSize; // L: 2243
							return 1; // L: 2244
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 2247
							return 1; // L: 2248
						} else if (var0 == 3176) {
							return 1; // L: 2251
						} else if (var0 == 3177) {
							return 1; // L: 2254
						} else if (var0 == 3178) {
							--class156.Interpreter_stringStackSize; // L: 2257
							return 1; // L: 2258
						} else if (var0 == 3179) {
							return 1; // L: 2261
						} else if (var0 == 3180) {
							--class156.Interpreter_stringStackSize; // L: 2264
							return 1; // L: 2265
						} else if (var0 == 3181) {
							class347.method6647(Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]); // L: 2268
							return 1; // L: 2269
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Frames.method4692(); // L: 2272
							return 1; // L: 2273
						} else if (var0 == 3189) {
							var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 2276
							AbstractRasterProvider.method9369(var3); // L: 2277
							return 1; // L: 2278
						} else {
							return 2; // L: 2280
						}
					}
				}
			}
		}
	}
}
