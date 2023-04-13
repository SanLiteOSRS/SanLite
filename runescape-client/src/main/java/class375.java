import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ow")
public class class375 {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 140924849
	)
	int field4366;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -758691399
	)
	int field4363;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 200503981
	)
	int field4368;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1630677271
	)
	int field4369;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1218339741
	)
	int field4374;
	@ObfuscatedName("af")
	boolean field4371;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	AbstractFont field4372;
	@ObfuscatedName("aw")
	ArrayList field4373;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1665827127
	)
	int field4367;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1237811303
	)
	int field4375;

	public class375() {
		this.field4366 = Integer.MAX_VALUE; // L: 22
		this.field4363 = Integer.MAX_VALUE; // L: 23
		this.field4368 = 0; // L: 24
		this.field4369 = 0; // L: 25
		this.field4374 = 0; // L: 26
		this.field4371 = true; // L: 27
		this.field4373 = new ArrayList(); // L: 29
		this.field4367 = 0; // L: 30
		this.field4375 = 0; // L: 31
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)Lod;",
		garbageValue = "-58"
	)
	public class377 method7118(int var1) {
		return (class377)this.field4373.get(var1); // L: 34
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lod;",
		garbageValue = "2053007893"
	)
	class377 method6995() {
		return this.field4373.size() == 0 ? null : (class377)this.field4373.get(this.field4373.size() - 1); // L: 38 39
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1946472859"
	)
	public boolean method6996() {
		return this.field4373.size() == 0; // L: 43
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1445253617"
	)
	boolean method7102() {
		return this.field4363 > 1; // L: 47
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1456819718"
	)
	public int method6998() {
		return this.field4373.size(); // L: 51
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1489675961"
	)
	public String method6999() {
		if (this.method6996()) { // L: 55
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method6998()); // L: 56

			for (int var2 = 0; var2 < this.method6998(); ++var2) { // L: 57
				class377 var3 = this.method7118(var2); // L: 58
				var1.append(var3.field4380); // L: 59
			}

			return var1.toString(); // L: 61
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "13"
	)
	public void method7000(int var1) {
		if (this.field4372 != null && var1 < this.field4372.ascent * 2) { // L: 65 66
			var1 = Integer.MAX_VALUE; // L: 67
		}

		if (this.field4366 != var1) { // L: 70
			this.field4366 = var1; // L: 71
			this.method7028(); // L: 72
		}

	} // L: 74

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-22"
	)
	public void method7001(int var1) {
		if (this.field4363 != var1) { // L: 77
			this.field4363 = var1; // L: 78
			this.method7028(); // L: 79
		}

	} // L: 81

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2052556376"
	)
	public void method7002(int var1) {
		if (this.field4375 != var1) { // L: 84
			this.field4375 = var1; // L: 85
			this.method7028(); // L: 86
		}

	} // L: 88

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lou;I)V",
		garbageValue = "2091647435"
	)
	public void method7003(AbstractFont var1) {
		if (var1 != this.field4372) { // L: 91
			this.field4372 = var1; // L: 92
			if (this.field4372 != null) { // L: 93
				if (this.field4374 == 0) { // L: 94
					this.field4374 = this.field4372.ascent; // L: 95
				}

				if (!this.method6996()) { // L: 97
					this.method7028(); // L: 98
				}
			}
		}

	} // L: 102

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1711544559"
	)
	public void method7127(int var1) {
		if (this.field4367 != var1) { // L: 105
			this.field4367 = var1; // L: 106
			this.method7028(); // L: 107
		}

	} // L: 109

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-2039244192"
	)
	public boolean method7005(int var1, int var2) {
		if (this.field4368 != var1 || var2 != this.field4369) { // L: 112
			this.field4368 = var1; // L: 113
			this.field4369 = var2; // L: 114
			this.method7028(); // L: 115
		}

		return true; // L: 117
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-39"
	)
	public void method7006(int var1) {
		if (this.field4374 != var1) { // L: 121
			this.field4374 = var1; // L: 122
			this.method7028(); // L: 123
		}

	} // L: 125

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)Lon;",
		garbageValue = "-555760487"
	)
	public class379 method7007(int var1, int var2) {
		if (var2 == var1) { // L: 128
			return new class379(this, 0, 0);
		} else if (var1 <= this.field4373.size() && var2 <= this.field4373.size()) { // L: 129
			return var2 < var1 ? new class379(this, var2, var1) : new class379(this, var1, var2); // L: 130
		} else {
			return new class379(this, 0, 0); // L: 131
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(CIIB)Loj;",
		garbageValue = "1"
	)
	public class376 method7070(char var1, int var2, int var3) {
		return this.method7023(Character.toString(var1), var2, var3); // L: 135
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;III)Loj;",
		garbageValue = "-727480702"
	)
	public class376 method7023(String var1, int var2, int var3) {
		if (var3 == 0) { // L: 139
			var3 = Integer.MAX_VALUE; // L: 140
		}

		int var4 = var2; // L: 142
		if (this.field4373.size() >= var3) { // L: 143
			this.method7029(var2, var2); // L: 144
			return new class376(var2, true); // L: 145
		} else {
			this.field4373.ensureCapacity(this.field4373.size() + var1.length()); // L: 147

			for (int var5 = 0; var5 < var1.length() && this.field4373.size() < var3; ++var5) { // L: 148
				class377 var6 = new class377(); // L: 149
				var6.field4380 = var1.charAt(var5); // L: 150
				this.field4373.add(var4, var6); // L: 151
				++var4; // L: 152
			}

			this.method7029(var2, var4); // L: 154
			if (this.field4363 != 0 && this.method7020() > this.field4363) { // L: 155
				while (var4 != var2) { // L: 157
					--var4; // L: 160
					this.method7013(var4); // L: 161
					if (this.method7020() <= this.field4363) { // L: 162
						break;
					}
				}

				return new class376(var4, true); // L: 163
			} else {
				return new class376(var4, false); // L: 166
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Loj;",
		garbageValue = "-2097418671"
	)
	class376 method7071(String var1, int var2) {
		return this.method7023(var1, this.field4373.size(), var2); // L: 171
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)Loj;",
		garbageValue = "180"
	)
	public class376 method7011(String var1) {
		this.method7012(); // L: 175
		return this.method7071(var1, 0); // L: 176
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-52"
	)
	void method7012() {
		this.field4373.clear(); // L: 180
	} // L: 181

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "914132212"
	)
	public int method7013(int var1) {
		return this.method7031(var1, var1 + 1); // L: 184
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2141158161"
	)
	public int method7031(int var1, int var2) {
		int var3;
		if (var2 < var1) { // L: 188
			var3 = var2; // L: 189
			var2 = var1; // L: 190
			var1 = var3; // L: 191
		}

		this.field4373.subList(var1, var2).clear(); // L: 193
		var3 = var1; // L: 194
		if (this.method7102() && this.field4367 == 1) { // L: 195
			while (var3 > 0) { // L: 196
				--var3; // L: 197
				char var4 = ((class377)this.field4373.get(var3)).field4380; // L: 198
				if (var4 == ' ' || var4 == '\t') { // L: 199
					break;
				}
			}
		}

		this.method7029(var3, var2); // L: 204
		return var1; // L: 205
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1082221342"
	)
	public int method7015(int var1, int var2) {
		if (this.field4372 == null) { // L: 209
			return 0;
		} else if (this.method7102() && var1 > this.field4366) { // L: 210
			return this.field4373.size();
		} else {
			if (!this.field4373.isEmpty()) { // L: 211
				for (int var3 = 0; var3 < this.field4373.size(); ++var3) { // L: 212
					class377 var4 = (class377)this.field4373.get(var3); // L: 213
					if (var2 <= var4.field4378 + this.method7019()) { // L: 214
						if (var2 < var4.field4378) { // L: 215
							break;
						}

						if (var1 < var4.field4379) { // L: 216
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (var3 + 1 != this.field4373.size() && ((class377)this.field4373.get(1 + var3)).field4378 != var4.field4378) { // L: 217
							int var5 = this.method7053((class377)this.field4373.get(var3), false); // L: 218
							if (var1 < var5 + var4.field4379) { // L: 219
								return var3; // L: 220
							}

							if (var2 <= var4.field4378 + this.method7019()) { // L: 222
								return var3 + 1; // L: 223
							}
						}
					}
				}

				class377 var6 = (class377)this.field4373.get(this.field4373.size() - 1); // L: 228
				if (var1 >= var6.field4379 && var1 <= var6.field4379 + this.method7021() && var2 >= var6.field4378 && var2 <= var6.field4378 + this.method7019()) { // L: 229
					return this.field4373.size() - 1; // L: 230
				}
			}

			return this.field4373.size(); // L: 233
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "70"
	)
	public int method7016(int var1, int var2) {
		if (this.field4372 != null && !this.method6996() && var1 <= this.field4373.size()) { // L: 237
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
				class377 var6 = (class377)this.field4373.get(var1 - 1); // L: 249
				var4 = var6.field4379 + this.method7030(var1 - 1); // L: 250
				var5 = var6.field4378; // L: 251
			} else if (var3 == -1 && var1 == 0) { // L: 253
				return 0; // L: 254
			}

			int var14 = 16777215; // L: 256
			int var7 = 0; // L: 257
			int var8 = var1; // L: 258
			int var9 = 16777215; // L: 259
			int var10 = var3 == 1 ? this.field4373.size() + 1 : 0; // L: 260

			for (int var11 = var3 + var1; var11 != var10; var11 += var3) { // L: 261
				class377 var12 = (class377)this.field4373.get(var11 - 1); // L: 262
				if (var5 != var12.field4378) { // L: 263
					++var7; // L: 264
					var5 = var12.field4378; // L: 265
					if (var7 > var2) { // L: 266
						return var8; // L: 267
					}
				}

				if (var7 == var2) { // L: 270
					int var13 = Math.abs(var12.field4379 + this.method7030(var11 - 1) - var4); // L: 271
					if (var13 >= var9) { // L: 272
						return var8; // L: 277
					}

					var8 = var11; // L: 273
					var9 = var13; // L: 274
				}
			}

			if (var3 == 1) { // L: 281
				return this.field4373.size(); // L: 282
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
		garbageValue = "-103"
	)
	public int method7017() {
		if (!this.field4373.isEmpty() && this.method7020() == 1) { // L: 298
			return this.field4373.isEmpty() ? 0 : ((class377)this.field4373.get(this.field4373.size() - 1)).field4379 + this.method7021(); // L: 299
		} else {
			int var1 = -1; // L: 302
			int var2 = 0; // L: 303

			for (int var3 = this.field4373.size() - 1; var3 >= 0; --var3) { // L: 304
				class377 var4 = (class377)this.field4373.get(var3); // L: 305
				if (var1 != var4.field4378) { // L: 306
					int var5 = this.method7053(var4, false) + var4.field4379; // L: 307
					var2 = Math.max(var5, var2); // L: 308
					var1 = var4.field4378; // L: 309
				}
			}

			return var2; // L: 312
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-463176913"
	)
	public int method7018() {
		return this.method6996() ? 0 : this.field4372.ascent + ((class377)this.field4373.get(this.field4373.size() - 1)).field4378; // L: 317
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1395107807"
	)
	public int method7019() {
		return this.field4374; // L: 321
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "777744451"
	)
	public int method7020() {
		return this.method7018() / this.field4372.ascent; // L: 325
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1365210754"
	)
	int method7021() {
		return this.method6996() ? 0 : this.method7053((class377)this.field4373.get(this.field4373.size() - 1), false); // L: 329
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1992476190"
	)
	public int method7022() {
		return this.field4366; // L: 333
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1670251162"
	)
	public int method7057() {
		return this.field4363; // L: 337
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1925990481"
	)
	public int method7024() {
		return this.field4367; // L: 341
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1880572091"
	)
	public int method7106() {
		return this.field4375; // L: 345
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "152707656"
	)
	public int method7069(int var1) {
		switch(this.field4368) { // L: 349
		case 0:
			return 0; // L: 353
		case 1:
			return var1 / 2; // L: 351
		case 2:
			return var1; // L: 355
		default:
			System.out.println("TextRun.getLeftOffsetForHorizontalAlignment: Invalid horizontal alignment. Value: '" + this.field4368 + "'."); // L: 357
			return 0; // L: 358
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-80288601"
	)
	public int method7033(int var1) {
		switch(this.field4369) { // L: 362
		case 0:
			return 0; // L: 366
		case 1:
			return var1 / 2; // L: 368
		case 2:
			return var1; // L: 364
		default:
			System.out.println("TextRun.getTopOffsetForVerticalAlignment: Invalid vertical alignment. Value: '" + this.field4369 + "'."); // L: 370
			return 0; // L: 371
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-62815061"
	)
	void method7028() {
		this.method7029(0, this.field4373.size()); // L: 375
	} // L: 376

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "75"
	)
	void method7029(int var1, int var2) {
		if (!this.method6996() && this.field4372 != null) { // L: 379
			class451 var3 = this.method7008(var1, var2); // L: 380
			boolean var4 = (Integer)var3.field4798 == 0 && (Integer)var3.field4799 == this.field4373.size(); // L: 381
			int var5 = (Integer)var3.field4798; // L: 382
			int var6 = 0; // L: 383
			int var7 = var4 ? 0 : ((class377)this.field4373.get((Integer)var3.field4798)).field4378; // L: 384
			int var8 = 0; // L: 385

			int var9;
			for (var9 = (Integer)var3.field4798; var9 <= (Integer)var3.field4799; ++var9) { // L: 386
				boolean var10 = var9 >= this.field4373.size(); // L: 387
				class377 var21 = (class377)this.field4373.get(!var10 ? var9 : this.field4373.size() - 1); // L: 388
				int var22 = !var10 ? this.method7053(var21, false) : 0; // L: 389
				boolean var13 = !var10 && var21.field4380 == '\n'; // L: 390
				boolean var14 = !var10 && this.method7102() && var22 + var6 > this.field4366; // L: 391
				if (var13 || var14 || var10) { // L: 392
					int var15 = var9; // L: 393
					int var16 = 0; // L: 394
					int var17;
					int var18;
					class377 var19;
					if (var14) { // L: 395
						var17 = 0; // L: 396
						if (this.field4367 == 1) { // L: 397
							for (var18 = var9; var18 > var5; --var18) { // L: 398
								var19 = (class377)this.field4373.get(var18); // L: 399
								var17 += var18 < var15 ? this.method7053(var19, false) : 0; // L: 400
								if (var19.field4380 == ' ' || var19.field4380 == '\n') { // L: 401
									var15 = var18; // L: 402
									var6 -= var17; // L: 403
									var16 = var17; // L: 404
									break;
								}
							}
						}
					}

					var17 = -this.method7069(var6); // L: 410

					for (var18 = var5; var18 < var15; ++var18) { // L: 411
						var19 = (class377)this.field4373.get(var18); // L: 412
						int var20 = this.method7053(var19, false); // L: 413
						var19.field4379 = var17; // L: 414
						var19.field4378 = var7; // L: 415
						var17 += var20; // L: 416
					}

					var5 = var15; // L: 418
					var6 = var16; // L: 419
					var7 += this.method7019(); // L: 420
					++var8; // L: 421
				}

				var6 += !var10 ? var22 : 0; // L: 423
			}

			if (this.field4369 != 0 && var4) { // L: 425
				var9 = var8 * this.method7019(); // L: 426
				int var23 = this.method7033(var9); // L: 427

				for (int var11 = 0; var11 < this.field4373.size(); ++var11) { // L: 428
					class377 var12 = (class377)this.field4373.get(var11); // L: 429
					var12.field4378 -= var23; // L: 430
				}
			}

		}
	} // L: 433

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2066300625"
	)
	int method7030(int var1) {
		return var1 < this.field4373.size() ? this.method7053((class377)this.field4373.get(var1), false) : 0; // L: 436
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Lod;ZI)I",
		garbageValue = "-615847689"
	)
	int method7053(class377 var1, boolean var2) {
		if (var1.field4380 == '\n') { // L: 440
			return 0;
		} else if (this.field4375 == 0) { // L: 441
			int var3 = this.field4372.advances[var1.field4380]; // L: 442
			if (var3 == 0) { // L: 443
				return var1.field4380 == '\t' ? this.field4372.advances[32] * 3 : this.field4372.advances[32]; // L: 444 445 448
			} else {
				return var3; // L: 452
			}
		} else {
			return this.field4372.advances[42]; // L: 456
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lrv;",
		garbageValue = "124"
	)
	class451 method7008(int var1, int var2) {
		int var3 = Math.min(var1, var2); // L: 461
		int var4 = Math.max(var1, var2); // L: 462
		int var5 = this.field4373.size(); // L: 463
		if (var3 == 0 && var5 == var4) { // L: 464
			return new class451(0, var5); // L: 465
		} else {
			int var6 = this.method7055(var3, false); // L: 467
			int var7 = this.method7034(var4, false); // L: 468
			int var8;
			switch(this.field4369) { // L: 469
			case 0:
				if (this.field4368 == 0) { // L: 472
					return new class451(var6, var5); // L: 473
				}

				var8 = this.method7055(var3, true); // L: 475
				return new class451(var8, var5); // L: 476
			case 1:
				return new class451(0, var5); // L: 487
			case 2:
				if (this.field4368 == 2) { // L: 480
					return new class451(0, var7); // L: 481
				}

				var8 = this.method7034(var4, true); // L: 483
				return new class451(0, var8); // L: 484
			default:
				return new class451(0, var5); // L: 489
			}
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "1702728009"
	)
	int method7055(int var1, boolean var2) {
		if (var1 < this.field4373.size()) { // L: 493
			int var3 = ((class377)this.field4373.get(var1)).field4378; // L: 494

			for (int var4 = var1; var4 > 0; --var4) { // L: 495
				if (((class377)this.field4373.get(var4 - 1)).field4378 < var3) { // L: 496
					if (!var2) { // L: 497
						return var4; // L: 498
					}

					var2 = false; // L: 500
					var3 = ((class377)this.field4373.get(var4 - 1)).field4378; // L: 501
				}
			}
		}

		return 0; // L: 505
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "2145203744"
	)
	int method7034(int var1, boolean var2) {
		if (var1 < this.field4373.size()) { // L: 509
			int var3 = ((class377)this.field4373.get(var1)).field4378; // L: 510

			for (int var4 = var1; var4 < this.field4373.size() - 1; ++var4) { // L: 511
				if (((class377)this.field4373.get(var4 + 1)).field4378 > var3) { // L: 512
					if (!var2) { // L: 513
						return var4; // L: 514
					}

					var2 = false; // L: 516
					var3 = ((class377)this.field4373.get(var4 + 1)).field4378; // L: 517
				}
			}
		}

		return this.field4373.size(); // L: 521
	}
}
