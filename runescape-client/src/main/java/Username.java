import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("si")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("f")
	@Export("name")
	String name;
	@ObfuscatedName("w")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lqj;)V"
	)
	public Username(String var1, LoginType var2) {
		this.name = var1; // L: 184
		String var4;
		if (var1 == null) { // L: 188
			var4 = null; // L: 189
		} else {
			label123: {
				int var5 = 0; // L: 192

				int var6;
				for (var6 = var1.length(); var5 < var6 && MenuAction.method2084(var1.charAt(var5)); ++var5) { // L: 193 194
				}

				while (var6 > var5 && MenuAction.method2084(var1.charAt(var6 - 1))) { // L: 195
					--var6;
				}

				int var7 = var6 - var5; // L: 196
				if (var7 >= 1) { // L: 198
					byte var9;
					if (var2 == null) { // L: 202
						var9 = 12; // L: 203
					} else {
						switch(var2.field4859) { // L: 206
						case 5:
							var9 = 20; // L: 211
							break;
						default:
							var9 = 12; // L: 208
						}
					}

					if (var7 <= var9) { // L: 215
						StringBuilder var15 = new StringBuilder(var7); // L: 220

						for (int var17 = var5; var17 < var6; ++var17) { // L: 221
							char var10 = var1.charAt(var17); // L: 222
							boolean var11;
							if (Character.isISOControl(var10)) { // L: 225
								var11 = false; // L: 226
							} else if (class97.isAlphaNumeric(var10)) { // L: 229
								var11 = true; // L: 230
							} else {
								char[] var12 = class454.field4864; // L: 234
								int var13 = 0;

								label90:
								while (true) {
									char var14;
									if (var13 >= var12.length) {
										var12 = class454.field4865; // L: 244

										for (var13 = 0; var13 < var12.length; ++var13) { // L: 245
											var14 = var12[var13]; // L: 246
											if (var10 == var14) { // L: 247
												var11 = true; // L: 248
												break label90; // L: 249
											}
										}

										var11 = false; // L: 253
										break;
									}

									var14 = var12[var13]; // L: 236
									if (var14 == var10) { // L: 237
										var11 = true; // L: 238
										break; // L: 239
									}

									++var13; // L: 235
								}
							}

							if (var11) { // L: 255
								char var16;
								switch(var10) { // L: 258
								case ' ':
								case '-':
								case '_':
								case ' ':
									var16 = '_'; // L: 338
									break;
								case '#':
								case '[':
								case ']':
									var16 = var10; // L: 321
									break; // L: 322
								case 'À':
								case 'Á':
								case 'Â':
								case 'Ã':
								case 'Ä':
								case 'à':
								case 'á':
								case 'â':
								case 'ã':
								case 'ä':
									var16 = 'a'; // L: 304
									break; // L: 305
								case 'Ç':
								case 'ç':
									var16 = 'c'; // L: 289
									break; // L: 290
								case 'È':
								case 'É':
								case 'Ê':
								case 'Ë':
								case 'è':
								case 'é':
								case 'ê':
								case 'ë':
									var16 = 'e'; // L: 285
									break; // L: 286
								case 'Í':
								case 'Î':
								case 'Ï':
								case 'í':
								case 'î':
								case 'ï':
									var16 = 'i'; // L: 275
									break; // L: 276
								case 'Ñ':
								case 'ñ':
									var16 = 'n'; // L: 328
									break; // L: 329
								case 'Ò':
								case 'Ó':
								case 'Ô':
								case 'Õ':
								case 'Ö':
								case 'ò':
								case 'ó':
								case 'ô':
								case 'õ':
								case 'ö':
									var16 = 'o'; // L: 316
									break; // L: 317
								case 'Ù':
								case 'Ú':
								case 'Û':
								case 'Ü':
								case 'ù':
								case 'ú':
								case 'û':
								case 'ü':
									var16 = 'u'; // L: 267
									break;
								case 'ß':
									var16 = 'b'; // L: 292
									break; // L: 293
								case 'ÿ':
								case 'Ÿ':
									var16 = 'y'; // L: 332
									break; // L: 333
								default:
									var16 = Character.toLowerCase(var10); // L: 324
								}

								if (var16 != 0) { // L: 343
									var15.append(var16); // L: 344
								}
							}
						}

						if (var15.length() == 0) { // L: 346
							var4 = null; // L: 347
						} else {
							var4 = var15.toString(); // L: 350
						}
						break label123;
					}
				}

				var4 = null; // L: 217
			}
		}

		this.cleanName = var4; // L: 352
	} // L: 353

	public Username(String var1) {
		this.name = var1; // L: 11
		LoginType var4 = LoginType.oldscape; // L: 14
		String var3;
		if (var1 == null) { // L: 16
			var3 = null; // L: 17
		} else {
			label123: {
				int var5 = 0; // L: 20

				int var6;
				for (var6 = var1.length(); var5 < var6 && MenuAction.method2084(var1.charAt(var5)); ++var5) { // L: 21 22
				}

				while (var6 > var5 && MenuAction.method2084(var1.charAt(var6 - 1))) { // L: 23
					--var6;
				}

				int var7 = var6 - var5; // L: 24
				if (var7 >= 1) { // L: 26
					byte var9;
					if (var4 == null) { // L: 30
						var9 = 12; // L: 31
					} else {
						switch(var4.field4859) { // L: 34
						case 5:
							var9 = 20; // L: 39
							break;
						default:
							var9 = 12; // L: 36
						}
					}

					if (var7 <= var9) { // L: 43
						StringBuilder var15 = new StringBuilder(var7); // L: 48

						for (int var17 = var5; var17 < var6; ++var17) { // L: 49
							char var10 = var1.charAt(var17); // L: 50
							boolean var11;
							if (Character.isISOControl(var10)) { // L: 53
								var11 = false; // L: 54
							} else if (class97.isAlphaNumeric(var10)) { // L: 57
								var11 = true; // L: 58
							} else {
								char[] var12 = class454.field4864; // L: 62
								int var13 = 0;

								label90:
								while (true) {
									char var14;
									if (var13 >= var12.length) {
										var12 = class454.field4865; // L: 72

										for (var13 = 0; var13 < var12.length; ++var13) { // L: 73
											var14 = var12[var13]; // L: 74
											if (var10 == var14) { // L: 75
												var11 = true; // L: 76
												break label90;
											}
										}

										var11 = false; // L: 81
										break;
									}

									var14 = var12[var13]; // L: 64
									if (var10 == var14) { // L: 65
										var11 = true; // L: 66
										break; // L: 67
									}

									++var13; // L: 63
								}
							}

							if (var11) { // L: 83
								char var16;
								switch(var10) { // L: 86
								case ' ':
								case '-':
								case '_':
								case ' ':
									var16 = '_'; // L: 166
									break;
								case '#':
								case '[':
								case ']':
									var16 = var10; // L: 113
									break; // L: 114
								case 'À':
								case 'Á':
								case 'Â':
								case 'Ã':
								case 'Ä':
								case 'à':
								case 'á':
								case 'â':
								case 'ã':
								case 'ä':
									var16 = 'a'; // L: 148
									break; // L: 149
								case 'Ç':
								case 'ç':
									var16 = 'c'; // L: 92
									break; // L: 93
								case 'È':
								case 'É':
								case 'Ê':
								case 'Ë':
								case 'è':
								case 'é':
								case 'ê':
								case 'ë':
									var16 = 'e'; // L: 123
									break; // L: 124
								case 'Í':
								case 'Î':
								case 'Ï':
								case 'í':
								case 'î':
								case 'ï':
									var16 = 'i'; // L: 156
									break; // L: 157
								case 'Ñ':
								case 'ñ':
									var16 = 'n'; // L: 96
									break; // L: 97
								case 'Ò':
								case 'Ó':
								case 'Ô':
								case 'Õ':
								case 'Ö':
								case 'ò':
								case 'ó':
								case 'ô':
								case 'õ':
								case 'ö':
									var16 = 'o'; // L: 108
									break; // L: 109
								case 'Ù':
								case 'Ú':
								case 'Û':
								case 'Ü':
								case 'ù':
								case 'ú':
								case 'û':
								case 'ü':
									var16 = 'u'; // L: 133
									break; // L: 134
								case 'ß':
									var16 = 'b'; // L: 88
									break;
								case 'ÿ':
								case 'Ÿ':
									var16 = 'y'; // L: 160
									break; // L: 161
								default:
									var16 = Character.toLowerCase(var10); // L: 136
								}

								if (var16 != 0) { // L: 171
									var15.append(var16); // L: 172
								}
							}
						}

						if (var15.length() == 0) { // L: 174
							var3 = null; // L: 175
						} else {
							var3 = var15.toString(); // L: 178
						}
						break label123;
					}
				}

				var3 = null; // L: 45
			}
		}

		this.cleanName = var3; // L: 180
	} // L: 181

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "29793"
	)
	@Export("getName")
	public String getName() {
		return this.name; // L: 356
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "4"
	)
	public String method9270() {
		return this.cleanName; // L: 360
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "80"
	)
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null; // L: 364
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lsi;B)I",
		garbageValue = "-128"
	)
	@Export("compareToTyped")
	public int compareToTyped(Username var1) {
		if (this.cleanName == null) { // L: 391
			return var1.cleanName == null ? 0 : 1; // L: 392 393
		} else {
			return var1.cleanName == null ? -1 : this.cleanName.compareTo(var1.cleanName); // L: 395 396
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof Username) { // L: 369
			Username var2 = (Username)var1; // L: 370
			if (this.cleanName == null) {
				return var2.cleanName == null; // L: 371
			} else if (var2.cleanName == null) { // L: 372
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.cleanName.equals(var2.cleanName); // L: 373 374
			}
		} else {
			return false; // L: 376
		}
	}

	public int hashCode() {
		return this.cleanName == null ? 0 : this.cleanName.hashCode(); // L: 381 382
	}

	public String toString() {
		return this.getName(); // L: 387
	}

	public int compareTo(Object var1) {
		return this.compareToTyped((Username)var1); // L: 400
	}
}
