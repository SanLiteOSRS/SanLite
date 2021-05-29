import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ly")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("v")
	@Export("name")
	String name;
	@ObfuscatedName("n")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lnc;)V"
	)
	public Username(String var1, LoginType var2) {
		this.name = var1;
		String var4;
		if (var1 == null) {
			var4 = null;
		} else {
			label115: {
				int var5 = 0;

				int var6;
				boolean var7;
				char var8;
				for (var6 = var1.length(); var5 < var6; ++var5) {
					var8 = var1.charAt(var5);
					var7 = var8 == 160 || var8 == ' ' || var8 == '_' || var8 == '-';
					if (!var7) {
						break;
					}
				}

				while (var6 > var5) {
					var8 = var1.charAt(var6 - 1);
					var7 = var8 == 160 || var8 == ' ' || var8 == '_' || var8 == '-';
					if (!var7) {
						break;
					}

					--var6;
				}

				int var14 = var6 - var5;
				if (var14 >= 1) {
					byte var9;
					if (var2 == null) {
						var9 = 12;
					} else {
						switch(var2.field4092) {
						case 8:
							var9 = 20;
							break;
						default:
							var9 = 12;
						}
					}

					if (var14 <= var9) {
						StringBuilder var13 = new StringBuilder(var14);

						for (int var15 = var5; var15 < var6; ++var15) {
							char var10 = var1.charAt(var15);
							if (class14.method188(var10)) {
								char var11;
								switch(var10) {
								case ' ':
								case '-':
								case '_':
								case ' ':
									var11 = '_';
									break;
								case '#':
								case '[':
								case ']':
									var11 = var10;
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
									var11 = 'a';
									break;
								case 'Ç':
								case 'ç':
									var11 = 'c';
									break;
								case 'È':
								case 'É':
								case 'Ê':
								case 'Ë':
								case 'è':
								case 'é':
								case 'ê':
								case 'ë':
									var11 = 'e';
									break;
								case 'Í':
								case 'Î':
								case 'Ï':
								case 'í':
								case 'î':
								case 'ï':
									var11 = 'i';
									break;
								case 'Ñ':
								case 'ñ':
									var11 = 'n';
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
									var11 = 'o';
									break;
								case 'Ù':
								case 'Ú':
								case 'Û':
								case 'Ü':
								case 'ù':
								case 'ú':
								case 'û':
								case 'ü':
									var11 = 'u';
									break;
								case 'ß':
									var11 = 'b';
									break;
								case 'ÿ':
								case 'Ÿ':
									var11 = 'y';
									break;
								default:
									var11 = Character.toLowerCase(var10);
								}

								if (var11 != 0) {
									var13.append(var11);
								}
							}
						}

						if (var13.length() == 0) {
							var4 = null;
						} else {
							var4 = var13.toString();
						}
						break label115;
					}
				}

				var4 = null;
			}
		}

		this.cleanName = var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2072568808"
	)
	@Export("getName")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lly;I)I",
		garbageValue = "831558423"
	)
	@Export("compareToTyped")
	public int compareToTyped(Username var1) {
		if (this.cleanName == null) {
			return var1.cleanName == null ? 0 : 1;
		} else {
			return var1.cleanName == null ? -1 : this.cleanName.compareTo(var1.cleanName);
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof Username) {
			Username var2 = (Username)var1;
			if (this.cleanName == null) {
				return var2.cleanName == null;
			} else if (var2.cleanName == null) {
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.cleanName.equals(var2.cleanName);
			}
		} else {
			return false;
		}
	}

	public int hashCode() {
		return this.cleanName == null ? 0 : this.cleanName.hashCode();
	}

	public String toString() {
		return this.getName();
	}

	public int compareTo(Object var1) {
		return this.compareToTyped((Username)var1);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "717003887"
	)
	static char method5877(char var0) {
		return var0 != 181 && var0 != 402 ? Character.toTitleCase(var0) : var0;
	}
}
