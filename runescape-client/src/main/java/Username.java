import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qi")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("o")
	@Export("name")
	String name;
	@ObfuscatedName("q")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lpa;)V"
	)
	public Username(String var1, LoginType var2) {
		this.name = var1; // L: 165
		String var4;
		if (var1 == null) { // L: 169
			var4 = null; // L: 170
		} else {
			int var5 = 0; // L: 173

			int var6;
			for (var6 = var1.length(); var5 < var6 && PlayerComposition.method5612(var1.charAt(var5)); ++var5) { // L: 174 175
			}

			while (var6 > var5 && PlayerComposition.method5612(var1.charAt(var6 - 1))) { // L: 176
				--var6;
			}

			int var7 = var6 - var5; // L: 177
			if (var7 >= 1 && var7 <= class395.method7113(var2)) { // L: 178
				StringBuilder var8 = new StringBuilder(var7); // L: 182

				for (int var9 = var5; var9 < var6; ++var9) { // L: 183
					char var10 = var1.charAt(var9); // L: 184
					boolean var11;
					if (Character.isISOControl(var10)) { // L: 187
						var11 = false; // L: 188
					} else if (UrlRequest.isAlphaNumeric(var10)) { // L: 191
						var11 = true; // L: 192
					} else {
						char[] var12 = class424.field4634; // L: 196
						int var13 = 0;

						label83:
						while (true) {
							char var14;
							if (var13 >= var12.length) {
								var12 = class424.field4637; // L: 206

								for (var13 = 0; var13 < var12.length; ++var13) { // L: 207
									var14 = var12[var13]; // L: 208
									if (var14 == var10) { // L: 209
										var11 = true; // L: 210
										break label83; // L: 211
									}
								}

								var11 = false; // L: 215
								break;
							}

							var14 = var12[var13]; // L: 198
							if (var10 == var14) { // L: 199
								var11 = true; // L: 200
								break; // L: 201
							}

							++var13; // L: 197
						}
					}

					if (var11) { // L: 217
						char var15;
						switch(var10) { // L: 220
						case ' ':
						case '-':
						case '_':
						case ' ':
							var15 = '_'; // L: 228
							break; // L: 229
						case '#':
						case '[':
						case ']':
							var15 = var10; // L: 233
							break; // L: 234
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
							var15 = 'a'; // L: 297
							break; // L: 298
						case 'Ç':
						case 'ç':
							var15 = 'c'; // L: 281
							break; // L: 282
						case 'È':
						case 'É':
						case 'Ê':
						case 'Ë':
						case 'è':
						case 'é':
						case 'ê':
						case 'ë':
							var15 = 'e'; // L: 243
							break; // L: 244
						case 'Í':
						case 'Î':
						case 'Ï':
						case 'í':
						case 'î':
						case 'ï':
							var15 = 'i'; // L: 261
							break; // L: 262
						case 'Ñ':
						case 'ñ':
							var15 = 'n'; // L: 265
							break; // L: 266
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
							var15 = 'o'; // L: 277
							break; // L: 278
						case 'Ù':
						case 'Ú':
						case 'Û':
						case 'Ü':
						case 'ù':
						case 'ú':
						case 'û':
						case 'ü':
							var15 = 'u'; // L: 253
							break; // L: 254
						case 'ß':
							var15 = 'b'; // L: 300
							break;
						case 'ÿ':
						case 'Ÿ':
							var15 = 'y'; // L: 285
							break; // L: 286
						default:
							var15 = Character.toLowerCase(var10); // L: 222
						}

						if (var15 != 0) { // L: 305
							var8.append(var15); // L: 306
						}
					}
				}

				if (var8.length() == 0) { // L: 308
					var4 = null; // L: 309
				} else {
					var4 = var8.toString(); // L: 312
				}
			} else {
				var4 = null; // L: 179
			}
		}

		this.cleanName = var4; // L: 314
	} // L: 315

	public Username(String var1) {
		this.name = var1; // L: 11
		LoginType var4 = LoginType.oldscape; // L: 14
		String var3;
		if (var1 == null) { // L: 16
			var3 = null; // L: 17
		} else {
			int var5 = 0; // L: 20

			int var6;
			for (var6 = var1.length(); var5 < var6 && PlayerComposition.method5612(var1.charAt(var5)); ++var5) { // L: 21 22
			}

			while (var6 > var5 && PlayerComposition.method5612(var1.charAt(var6 - 1))) { // L: 23
				--var6;
			}

			int var7 = var6 - var5; // L: 24
			if (var7 >= 1 && var7 <= class395.method7113(var4)) { // L: 25
				StringBuilder var8 = new StringBuilder(var7); // L: 29

				for (int var9 = var5; var9 < var6; ++var9) { // L: 30
					char var10 = var1.charAt(var9); // L: 31
					boolean var11;
					if (Character.isISOControl(var10)) { // L: 34
						var11 = false; // L: 35
					} else if (UrlRequest.isAlphaNumeric(var10)) { // L: 38
						var11 = true; // L: 39
					} else {
						char[] var12 = class424.field4634; // L: 43
						int var13 = 0;

						label84:
						while (true) {
							char var14;
							if (var13 >= var12.length) {
								var12 = class424.field4637; // L: 53

								for (var13 = 0; var13 < var12.length; ++var13) { // L: 54
									var14 = var12[var13]; // L: 55
									if (var10 == var14) { // L: 56
										var11 = true; // L: 57
										break label84; // L: 58
									}
								}

								var11 = false; // L: 62
								break;
							}

							var14 = var12[var13]; // L: 45
							if (var14 == var10) { // L: 46
								var11 = true; // L: 47
								break; // L: 48
							}

							++var13; // L: 44
						}
					}

					if (var11) { // L: 64
						char var15;
						switch(var10) { // L: 67
						case ' ':
						case '-':
						case '_':
						case ' ':
							var15 = '_'; // L: 75
							break; // L: 76
						case '#':
						case '[':
						case ']':
							var15 = var10; // L: 125
							break; // L: 126
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
							var15 = 'a'; // L: 104
							break; // L: 105
						case 'Ç':
						case 'ç':
							var15 = 'c'; // L: 92
							break; // L: 93
						case 'È':
						case 'É':
						case 'Ê':
						case 'Ë':
						case 'è':
						case 'é':
						case 'ê':
						case 'ë':
							var15 = 'e'; // L: 135
							break; // L: 136
						case 'Í':
						case 'Î':
						case 'Ï':
						case 'í':
						case 'î':
						case 'ï':
							var15 = 'i'; // L: 120
							break; // L: 121
						case 'Ñ':
						case 'ñ':
							var15 = 'n'; // L: 112
							break; // L: 113
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
							var15 = 'o'; // L: 147
							break;
						case 'Ù':
						case 'Ú':
						case 'Û':
						case 'Ü':
						case 'ù':
						case 'ú':
						case 'û':
						case 'ü':
							var15 = 'u'; // L: 85
							break; // L: 86
						case 'ß':
							var15 = 'b'; // L: 88
							break; // L: 89
						case 'ÿ':
						case 'Ÿ':
							var15 = 'y'; // L: 108
							break; // L: 109
						default:
							var15 = Character.toLowerCase(var10); // L: 69
						}

						if (var15 != 0) { // L: 152
							var8.append(var15); // L: 153
						}
					}
				}

				if (var8.length() == 0) { // L: 155
					var3 = null; // L: 156
				} else {
					var3 = var8.toString(); // L: 159
				}
			} else {
				var3 = null; // L: 26
			}
		}

		this.cleanName = var3; // L: 161
	} // L: 162

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1654741498"
	)
	@Export("getName")
	public String getName() {
		return this.name; // L: 318
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-82"
	)
	public String method8350() {
		return this.cleanName; // L: 322
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1086338962"
	)
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null; // L: 326
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lqi;B)I",
		garbageValue = "0"
	)
	@Export("compareToTyped")
	public int compareToTyped(Username var1) {
		if (this.cleanName == null) { // L: 353
			return var1.cleanName == null ? 0 : 1; // L: 354 355
		} else {
			return var1.cleanName == null ? -1 : this.cleanName.compareTo(var1.cleanName); // L: 357 358
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof Username) { // L: 331
			Username var2 = (Username)var1; // L: 332
			if (this.cleanName == null) {
				return var2.cleanName == null; // L: 333
			} else if (var2.cleanName == null) { // L: 334
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.cleanName.equals(var2.cleanName); // L: 335 336
			}
		} else {
			return false; // L: 338
		}
	}

	public int hashCode() {
		return this.cleanName == null ? 0 : this.cleanName.hashCode(); // L: 343 344
	}

	public String toString() {
		return this.getName(); // L: 349
	}

	public int compareTo(Object var1) {
		return this.compareToTyped((Username)var1); // L: 362
	}
}
