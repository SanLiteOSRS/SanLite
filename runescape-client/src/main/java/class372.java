import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("np")
public class class372 {
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 457693053
	)
	int field4394;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -94612245
	)
	int field4399;
	@ObfuscatedName("b")
	boolean field4396;
	@ObfuscatedName("m")
	boolean field4391;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	AbstractFont field4398;
	@ObfuscatedName("h")
	ArrayList field4389;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 659110515
	)
	int field4400;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 704910067
	)
	int field4401;

	public class372() {
		this.field4394 = Integer.MAX_VALUE; // L: 16
		this.field4399 = 0; // L: 17
		this.field4396 = true; // L: 18
		this.field4391 = true; // L: 19
		this.field4389 = new ArrayList(); // L: 21
		this.field4400 = 0;
		this.field4401 = 0;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)Lnq;",
		garbageValue = "55"
	)
	public class374 method7074(int var1) {
		return (class374)this.field4389.get(var1);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Lnq;",
		garbageValue = "-899837938"
	)
	class374 method7097() {
		return this.field4389.size() == 0 ? null : (class374)this.field4389.get(this.field4389.size() - 1);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "51"
	)
	public boolean method7076() {
		return this.field4389.size() == 0;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1962221607"
	)
	public int method7173() {
		return this.field4389.size(); // L: 39
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "-14961"
	)
	public String method7078() {
		if (this.method7076()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7173()); // L: 44

			for (int var2 = 0; var2 < this.method7173(); ++var2) { // L: 45
				class374 var3 = this.method7074(var2);
				var1.append(var3.field4411); // L: 47
			}

			return var1.toString(); // L: 49
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "682732986"
	)
	public void method7079(int var1, boolean var2) {
		if (this.field4398 != null && var1 < this.field4398.ascent * 2) { // L: 53 54
			var1 = Integer.MAX_VALUE; // L: 55
		}

		if (this.field4394 != var1 || var2 != this.field4396) { // L: 58
			this.field4394 = var1; // L: 59
			this.field4396 = var2; // L: 60
			this.method7102(0, this.field4389.size(), false); // L: 61
		}

	} // L: 63

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-55"
	)
	public void method7080(int var1) {
		if (this.field4401 != var1) { // L: 66
			this.field4401 = var1; // L: 67
			this.method7102(0, this.field4389.size(), false); // L: 68
		}

	} // L: 70

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lnw;I)V",
		garbageValue = "1071681431"
	)
	public void method7089(AbstractFont var1) {
		if (var1 != this.field4398) { // L: 73
			this.field4398 = var1; // L: 74
			if (this.field4398 != null) { // L: 75
				if (this.field4399 == 0) { // L: 76
					this.field4399 = this.field4398.ascent; // L: 77
				}

				if (!this.method7076()) { // L: 79
					this.method7102(0, this.field4389.size(), false); // L: 80
				}
			}
		}

	} // L: 84

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-98802638"
	)
	public void method7101(int var1) {
		if (this.field4400 != var1) { // L: 87
			this.field4400 = var1; // L: 88
			this.method7102(0, this.field4389.size(), false); // L: 89
		}

	} // L: 91

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "9870"
	)
	public void method7083(int var1) {
		if (this.field4399 != var1) { // L: 94
			this.field4399 = var1; // L: 95
			this.method7102(0, this.field4389.size(), false); // L: 96
		}

	} // L: 98

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lnm;",
		garbageValue = "8"
	)
	public class376 method7140(int var1, int var2) {
		if (var2 == var1) { // L: 101
			return new class376(this, 0, 0);
		} else if (var1 <= this.field4389.size() && var2 <= this.field4389.size()) { // L: 102
			return var2 < var1 ? new class376(this, var2, var1) : new class376(this, var1, var2); // L: 103
		} else {
			return new class376(this, 0, 0); // L: 104
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(CIIII)Lnu;",
		garbageValue = "-412468704"
	)
	public class373 method7174(char var1, int var2, int var3, int var4) {
		return this.method7086(Character.toString(var1), var2, var3, var4); // L: 108
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIII)Lnu;",
		garbageValue = "-2136642155"
	)
	public class373 method7086(String var1, int var2, int var3, int var4) {
		if (var3 == 0) { // L: 112
			var3 = Integer.MAX_VALUE; // L: 113
		}

		if (this.field4389.size() >= var3) { // L: 115
			return new class373(var2, true); // L: 116
		} else {
			this.field4389.ensureCapacity(this.field4389.size() + var1.length()); // L: 118
			int var5 = var2; // L: 119
			int var6 = 0; // L: 120
			class374 var7 = this.method7103(var2); // L: 121
			int var8 = this.method7090(var2); // L: 122

			int var9;
			int var10;
			for (var9 = -1; var6 < var1.length() && this.field4389.size() < var3; ++var5) { // L: 123 124 149
				class374 var11 = new class374(); // L: 126
				var11.field4411 = var1.charAt(var6++); // L: 127
				if (var11.field4411 == '\n') { // L: 128
					var11.field4410 = var7.field4410 + this.method7096(); // L: 129
					var10 = 0; // L: 130
				} else {
					var11.field4408 = var8 + var7.field4408; // L: 133
					var11.field4410 = var7.field4410; // L: 134
					var10 = this.method7106(var11, false); // L: 135
					if (this.field4396 && var10 + var11.field4408 > this.field4394) { // L: 136
						if (this.field4400 == 0) { // L: 137
							var11.field4408 = 0; // L: 138
							var11.field4410 += this.method7096(); // L: 139
						} else if (var9 == -1) { // L: 141
							var9 = var5; // L: 142
						}
					}
				}

				var7 = var11; // L: 146
				var8 = var10; // L: 147
				this.field4389.add(var5, var11); // L: 148
			}

			var10 = var9 == -1 ? var5 : var9; // L: 151
			this.method7102(var10, this.field4389.size(), true); // L: 152
			if (var4 != 0 && this.method7137() > var4) { // L: 153
				while (var5 != var2) { // L: 155
					--var5; // L: 158
					this.method7152(var5); // L: 159
					if (this.method7137() <= var4) { // L: 160
						break;
					}
				}

				return new class373(var5, true); // L: 161
			} else {
				return new class373(var5, false); // L: 164
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;III)Lnu;",
		garbageValue = "-1922985516"
	)
	class373 method7075(String var1, int var2, int var3) {
		return this.method7086(var1, this.field4389.size(), var2, var3); // L: 169
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lnu;",
		garbageValue = "-998070512"
	)
	public class373 method7088(String var1) {
		this.method7077(); // L: 173
		return this.method7075(var1, 0, 0); // L: 174
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method7077() {
		this.field4389.clear(); // L: 178
	} // L: 179

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-8448203"
	)
	public int method7152(int var1) {
		return this.method7091(var1, var1 + 1); // L: 182
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "10408"
	)
	public int method7091(int var1, int var2) {
		int var3;
		if (var2 < var1) { // L: 186
			var3 = var2; // L: 187
			var2 = var1; // L: 188
			var1 = var3; // L: 189
		}

		this.field4389.subList(var1, var2).clear(); // L: 191
		var3 = var1; // L: 192
		if (this.field4396 && this.field4400 == 1) { // L: 193
			label34: {
				int var4 = var1; // L: 194

				char var5;
				do {
					if (var4 <= 0) { // L: 195
						break label34;
					}

					--var4; // L: 196
					var5 = ((class374)this.field4389.get(var4)).field4411; // L: 197
				} while(var5 != ' ' && var5 != '\t'); // L: 198

				var3 = var4; // L: 199
			}
		}

		this.method7102(var3, this.field4389.size(), true); // L: 204
		return var1; // L: 205
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "525"
	)
	public int method7092(int var1, int var2) {
		if (this.field4398 != null && var1 >= 0 && var2 >= 0) { // L: 209
			if (this.field4396 && var1 > this.field4394) { // L: 210
				return this.field4389.size();
			} else {
				if (!this.field4389.isEmpty()) { // L: 211
					for (int var3 = 0; var3 < this.field4389.size(); ++var3) { // L: 212
						class374 var4 = (class374)this.field4389.get(var3); // L: 213
						if (var2 <= var4.field4410 + this.method7096()) { // L: 214
							if (var2 < var4.field4410) { // L: 215
								break;
							}

							if (var1 < var4.field4408) { // L: 216
								return var3 > 0 ? var3 - 1 : 0;
							}

							if (var3 + 1 != this.field4389.size() && ((class374)this.field4389.get(1 + var3)).field4410 != var4.field4410) { // L: 217
								int var5 = this.method7106((class374)this.field4389.get(var3), false); // L: 218
								if (var1 < var5 + var4.field4408) { // L: 219
									return var3; // L: 220
								}

								if (var2 <= var4.field4410 + this.method7096()) { // L: 222
									return var3 + 1; // L: 223
								}
							}
						}
					}

					class374 var6 = (class374)this.field4389.get(this.field4389.size() - 1); // L: 228
					if (var1 >= var6.field4408 && var1 <= var6.field4408 + this.method7098() && var2 >= var6.field4410 && var2 <= var6.field4410 + this.method7096()) { // L: 229
						return this.field4389.size() - 1; // L: 230
					}
				}

				return this.field4389.size(); // L: 233
			}
		} else {
			return 0;
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2001960464"
	)
	public int method7115(int var1, int var2) {
		if (this.field4398 != null && !this.method7076() && var1 <= this.field4389.size()) { // L: 237
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
				class374 var6 = (class374)this.field4389.get(var1 - 1); // L: 249
				var4 = var6.field4408 + this.method7105(var1 - 1); // L: 250
				var5 = var6.field4410; // L: 251
			} else if (var3 == -1 && var1 == 0) { // L: 253
				return 0; // L: 254
			}

			int var14 = 16777215; // L: 256
			int var7 = 0; // L: 257
			int var8 = var1; // L: 258
			int var9 = 16777215; // L: 259
			int var10 = var3 == 1 ? this.field4389.size() + 1 : 0; // L: 260

			for (int var11 = var3 + var1; var11 != var10; var11 += var3) { // L: 261
				class374 var12 = (class374)this.field4389.get(var11 - 1); // L: 262
				if (var5 != var12.field4410) { // L: 263
					++var7; // L: 264
					var5 = var12.field4410; // L: 265
					if (var7 > var2) { // L: 266
						return var8; // L: 267
					}
				}

				if (var7 == var2) { // L: 270
					int var13 = Math.abs(var12.field4408 + this.method7105(var11 - 1) - var4); // L: 271
					if (var13 >= var9) { // L: 272
						return var8; // L: 277
					}

					var8 = var11; // L: 273
					var9 = var13; // L: 274
				}
			}

			if (var3 == 1) { // L: 281
				return this.field4389.size(); // L: 282
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-78"
	)
	public int method7175() {
		if (!this.field4389.isEmpty() && this.method7137() == 1) { // L: 298
			return this.field4389.isEmpty() ? 0 : ((class374)this.field4389.get(this.field4389.size() - 1)).field4408 + this.method7098(); // L: 299
		} else {
			int var1 = -1; // L: 302
			int var2 = 0; // L: 303

			for (int var3 = this.field4389.size() - 1; var3 >= 0; --var3) { // L: 304
				class374 var4 = (class374)this.field4389.get(var3); // L: 305
				if (var1 != var4.field4410) { // L: 306
					int var5 = this.method7106(var4, false) + var4.field4408; // L: 307
					var2 = Math.max(var5, var2); // L: 308
					var1 = var4.field4410; // L: 309
				}
			}

			return var2; // L: 312
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-30"
	)
	public int method7095() {
		return this.method7076() ? 0 : this.field4398.ascent + ((class374)this.field4389.get(this.field4389.size() - 1)).field4410; // L: 317
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-534651403"
	)
	public int method7096() {
		return this.field4399; // L: 321
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1958718002"
	)
	public int method7137() {
		return this.method7095() / this.field4398.ascent; // L: 325
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1535007927"
	)
	int method7098() {
		return this.method7076() ? 0 : this.method7106((class374)this.field4389.get(this.field4389.size() - 1), false); // L: 329
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-983822310"
	)
	public int method7099() {
		return this.field4394; // L: 333
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1001126357"
	)
	public int method7100() {
		return this.field4400; // L: 337
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "63"
	)
	public int method7085() {
		return this.field4401; // L: 341
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "1645181643"
	)
	void method7102(int var1, int var2, boolean var3) {
		if (!this.method7076() && this.field4398 != null) { // L: 345
			class374 var4 = this.method7103(var1); // L: 346
			int var5 = this.method7090(var1); // L: 347

			for (int var6 = var1; var6 < var2; ++var6) { // L: 348
				class374 var7 = (class374)this.field4389.get(var6); // L: 349
				int var10;
				if (var7.field4411 == '\n') { // L: 351
					int var9 = var4.field4410 + this.method7096(); // L: 352
					if (var3) { // L: 353
						if (var9 != var7.field4410) { // L: 354
							var10 = var9 - var7.field4410; // L: 355

							for (int var17 = var6; var17 < var2; ++var17) { // L: 356
								class374 var10000 = (class374)this.field4389.get(var17); // L: 357
								var10000.field4410 += var10;
							}
						}
						break;
					}

					var7.field4410 = var9; // L: 361
					boolean var8 = false; // L: 362
				} else {
					var7.field4408 = var5 + var4.field4408; // L: 365
					var7.field4410 = var4.field4410; // L: 366
					int var18 = this.method7106(var7, false); // L: 367
					if (this.field4396 && var18 + var7.field4408 > this.field4394) { // L: 368
						boolean var19 = false; // L: 369
						if (this.field4400 == 1) { // L: 370
							for (var10 = var6; var10 > 0; --var10) { // L: 371
								class374 var11 = (class374)this.field4389.get(var10 - 1); // L: 372
								if (var11.field4410 != var7.field4410) { // L: 373
									break;
								}

								if (var11.field4411 == ' ' || var11.field4411 == '\t') { // L: 376
									class374 var12 = (class374)this.field4389.get(var10); // L: 377
									int var13 = var12.field4408; // L: 378
									int var14 = var12.field4410 + this.method7096(); // L: 379

									for (int var15 = var10; var15 <= var6; ++var15) { // L: 380
										class374 var16 = (class374)this.field4389.get(var15); // L: 381
										var16.field4408 -= var13; // L: 382
										var16.field4410 = var14; // L: 383
									}

									var19 = true; // L: 385
									break; // L: 386
								}
							}
						}

						if (!var19) { // L: 390
							var7.field4408 = 0; // L: 391
							var7.field4410 += this.method7096(); // L: 392
						}
					}
				}

				var4 = (class374)this.field4389.get(var6); // L: 396
				var5 = this.method7106(var4, false); // L: 397
			}

		}
	} // L: 399

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Lnq;",
		garbageValue = "-614261861"
	)
	class374 method7103(int var1) {
		if (var1 > 0 && !this.field4389.isEmpty()) { // L: 402
			return var1 >= this.field4389.size() ? (class374)this.field4389.get(this.field4389.size() - 1) : (class374)this.field4389.get(var1 - 1); // L: 403 404 407
		} else {
			return new class374(); // L: 410
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "113"
	)
	int method7090(int var1) {
		if (var1 > 0 && !this.field4389.isEmpty()) { // L: 414
			return var1 >= this.field4389.size() ? this.method7105(this.field4389.size() - 1) : this.method7105(var1 - 1); // L: 415 416 419
		} else {
			return 0; // L: 422
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2008557271"
	)
	int method7105(int var1) {
		return var1 < this.field4389.size() ? this.method7106((class374)this.field4389.get(var1), false) : 0; // L: 426
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lnq;ZI)I",
		garbageValue = "1847840161"
	)
	int method7106(class374 var1, boolean var2) {
		if (var1.field4411 == '\n') { // L: 430
			return 0;
		} else if (this.field4401 == 0) { // L: 431
			int var3 = this.field4398.advances[var1.field4411]; // L: 432
			if (var3 == 0) { // L: 433
				return var1.field4411 == '\t' ? this.field4398.advances[32] * 3 : this.field4398.advances[32]; // L: 434 435 438
			} else {
				return var3; // L: 442
			}
		} else {
			return this.field4398.advances[42]; // L: 446
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/io/File;",
		garbageValue = "-354380087"
	)
	@Export("getFile")
	public static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) { // L: 22
			throw new RuntimeException("");
		} else {
			File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0); // L: 23
			if (var1 != null) { // L: 24
				return var1;
			} else {
				File var2 = new File(FileSystem.FileSystem_cacheDir, var0); // L: 25
				RandomAccessFile var3 = null; // L: 26

				try {
					File var4 = new File(var2.getParent()); // L: 28
					if (!var4.exists()) { // L: 29
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw"); // L: 30
						int var5 = var3.read(); // L: 31
						var3.seek(0L); // L: 32
						var3.write(var5); // L: 33
						var3.seek(0L); // L: 34
						var3.close(); // L: 35
						FileSystem.FileSystem_cacheFiles.put(var0, var2); // L: 36
						return var2; // L: 37
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) { // L: 41
							var3.close(); // L: 42
							var3 = null; // L: 43
						}
					} catch (Exception var7) { // L: 46
					}

					throw new RuntimeException(); // L: 48
				}
			}
		}
	}
}
