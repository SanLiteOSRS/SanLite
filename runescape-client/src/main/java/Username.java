import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qy")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("musicTrack")
	public static MusicTrack musicTrack;
	@ObfuscatedName("s")
	@Export("name")
	String name;
	@ObfuscatedName("h")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lpl;)V"
	)
	public Username(String var1, LoginType var2) {
		this.name = var1; // L: 152
		String var4;
		if (var1 == null) { // L: 156
			var4 = null; // L: 157
		} else {
			label86: {
				int var5 = 0; // L: 160

				int var6;
				for (var6 = var1.length(); var5 < var6 && SceneTilePaint.method4416(var1.charAt(var5)); ++var5) { // L: 161 162
				}

				while (var6 > var5 && SceneTilePaint.method4416(var1.charAt(var6 - 1))) { // L: 163
					--var6;
				}

				int var7 = var6 - var5; // L: 164
				if (var7 >= 1) { // L: 166
					byte var9;
					if (var2 == null) { // L: 170
						var9 = 12; // L: 171
					} else {
						switch(var2.field4616) { // L: 174
						case 1:
							var9 = 20; // L: 176
							break; // L: 177
						default:
							var9 = 12; // L: 179
						}
					}

					if (var7 <= var9) { // L: 183
						StringBuilder var13 = new StringBuilder(var7); // L: 188

						for (int var14 = var5; var14 < var6; ++var14) { // L: 189
							char var10 = var1.charAt(var14); // L: 190
							if (class400.method7055(var10)) { // L: 191
								char var11;
								switch(var10) { // L: 194
								case ' ':
								case '-':
								case '_':
								case ' ':
									var11 = '_'; // L: 225
									break; // L: 226
								case '#':
								case '[':
								case ']':
									var11 = var10; // L: 254
									break; // L: 255
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
									var11 = 'a'; // L: 205
									break;
								case 'Ç':
								case 'ç':
									var11 = 'c'; // L: 258
									break; // L: 259
								case 'È':
								case 'É':
								case 'Ê':
								case 'Ë':
								case 'è':
								case 'é':
								case 'ê':
								case 'ë':
									var11 = 'e'; // L: 235
									break; // L: 236
								case 'Í':
								case 'Î':
								case 'Ï':
								case 'í':
								case 'î':
								case 'ï':
									var11 = 'i'; // L: 243
									break; // L: 244
								case 'Ñ':
								case 'ñ':
									var11 = 'n'; // L: 274
									break;
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
									var11 = 'o'; // L: 270
									break; // L: 271
								case 'Ù':
								case 'Ú':
								case 'Û':
								case 'Ü':
								case 'ù':
								case 'ú':
								case 'û':
								case 'ü':
									var11 = 'u'; // L: 215
									break; // L: 216
								case 'ß':
									var11 = 'b'; // L: 249
									break; // L: 250
								case 'ÿ':
								case 'Ÿ':
									var11 = 'y'; // L: 219
									break; // L: 220
								default:
									var11 = Character.toLowerCase(var10); // L: 246
								}

								if (var11 != 0) { // L: 279
									var13.append(var11); // L: 280
								}
							}
						}

						if (var13.length() == 0) { // L: 282
							var4 = null; // L: 283
						} else {
							var4 = var13.toString(); // L: 286
						}
						break label86;
					}
				}

				var4 = null; // L: 185
			}
		}

		this.cleanName = var4; // L: 288
	} // L: 289

	public Username(String var1) {
		this.name = var1; // L: 11
		LoginType var4 = LoginType.oldscape; // L: 14
		String var3;
		if (var1 == null) { // L: 16
			var3 = null; // L: 17
		} else {
			label86: {
				int var5 = 0; // L: 20

				int var6;
				for (var6 = var1.length(); var5 < var6 && SceneTilePaint.method4416(var1.charAt(var5)); ++var5) { // L: 21 22
				}

				while (var6 > var5 && SceneTilePaint.method4416(var1.charAt(var6 - 1))) { // L: 23
					--var6;
				}

				int var7 = var6 - var5; // L: 24
				if (var7 >= 1) { // L: 26
					byte var9;
					if (var4 == null) { // L: 30
						var9 = 12; // L: 31
					} else {
						switch(var4.field4616) { // L: 34
						case 1:
							var9 = 20; // L: 36
							break; // L: 37
						default:
							var9 = 12; // L: 39
						}
					}

					if (var7 <= var9) { // L: 43
						StringBuilder var13 = new StringBuilder(var7); // L: 48

						for (int var14 = var5; var14 < var6; ++var14) { // L: 49
							char var10 = var1.charAt(var14); // L: 50
							if (class400.method7055(var10)) { // L: 51
								char var11;
								switch(var10) { // L: 54
								case ' ':
								case '-':
								case '_':
								case ' ':
									var11 = '_'; // L: 82
									break; // L: 83
								case '#':
								case '[':
								case ']':
									var11 = var10; // L: 134
									break;
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
									var11 = 'a'; // L: 65
									break;
								case 'Ç':
								case 'ç':
									var11 = 'c'; // L: 100
									break; // L: 101
								case 'È':
								case 'É':
								case 'Ê':
								case 'Ë':
								case 'è':
								case 'é':
								case 'ê':
								case 'ë':
									var11 = 'e'; // L: 92
									break; // L: 93
								case 'Í':
								case 'Î':
								case 'Ï':
								case 'í':
								case 'î':
								case 'ï':
									var11 = 'i'; // L: 73
									break; // L: 74
								case 'Ñ':
								case 'ñ':
									var11 = 'n'; // L: 116
									break; // L: 117
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
									var11 = 'o'; // L: 112
									break; // L: 113
								case 'Ù':
								case 'Ú':
								case 'Û':
								case 'Ü':
								case 'ù':
								case 'ú':
								case 'û':
								case 'ü':
									var11 = 'u'; // L: 129
									break; // L: 130
								case 'ß':
									var11 = 'b'; // L: 119
									break; // L: 120
								case 'ÿ':
								case 'Ÿ':
									var11 = 'y'; // L: 96
									break; // L: 97
								default:
									var11 = Character.toLowerCase(var10); // L: 76
								}

								if (var11 != 0) { // L: 139
									var13.append(var11); // L: 140
								}
							}
						}

						if (var13.length() == 0) { // L: 142
							var3 = null; // L: 143
						} else {
							var3 = var13.toString(); // L: 146
						}
						break label86;
					}
				}

				var3 = null; // L: 45
			}
		}

		this.cleanName = var3; // L: 148
	} // L: 149

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "0"
	)
	@Export("getName")
	public String getName() {
		return this.name; // L: 292
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "557448197"
	)
	public String method8215() {
		return this.cleanName; // L: 296
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "21"
	)
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null; // L: 300
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)I",
		garbageValue = "392159043"
	)
	@Export("compareToTyped")
	public int compareToTyped(Username var1) {
		if (this.cleanName == null) { // L: 327
			return var1.cleanName == null ? 0 : 1; // L: 328 329
		} else {
			return var1.cleanName == null ? -1 : this.cleanName.compareTo(var1.cleanName); // L: 331 332
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof Username) { // L: 305
			Username var2 = (Username)var1; // L: 306
			if (this.cleanName == null) {
				return var2.cleanName == null; // L: 307
			} else if (var2.cleanName == null) { // L: 308
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.cleanName.equals(var2.cleanName); // L: 309 310
			}
		} else {
			return false; // L: 312
		}
	}

	public int hashCode() {
		return this.cleanName == null ? 0 : this.cleanName.hashCode(); // L: 317 318
	}

	public int compareTo(Object var1) {
		return this.compareToTyped((Username)var1); // L: 336
	}

	public String toString() {
		return this.getName(); // L: 323
	}
}
