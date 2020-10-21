import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lh")
public enum class323 implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Llh;"
	)
	field3849(4, 0),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Llh;"
	)
	field3848(2, 2),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Llh;"
	)
	field3855(5, 5),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Llh;"
	)
	field3850(1, 6),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Llh;"
	)
	field3851(0, 7),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Llh;"
	)
	field3852(3, 8);

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		signature = "Lle;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1864683271
	)
	final int field3853;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -475570997
	)
	final int field3847;

	class323(int var3, int var4) {
		this.field3853 = var3;
		this.field3847 = var4;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "23"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3847;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/CharSequence;Lmc;I)Ljava/lang/String;",
		garbageValue = "586268379"
	)
	public static String method6048(CharSequence var0, LoginType var1) {
		if (var0 == null) {
			return null;
		} else {
			int var2 = 0;

			int var3;
			for (var3 = var0.length(); var2 < var3 && Tiles.method1223(var0.charAt(var2)); ++var2) {
			}

			while (var3 > var2 && Tiles.method1223(var0.charAt(var3 - 1))) {
				--var3;
			}

			int var4 = var3 - var2;
			if (var4 >= 1) {
				byte var6;
				if (var1 == null) {
					var6 = 12;
				} else {
					switch(var1.field4070) {
					case 6:
						var6 = 20;
						break;
					default:
						var6 = 12;
					}
				}

				if (var4 <= var6) {
					StringBuilder var10 = new StringBuilder(var4);

					for (int var11 = var2; var11 < var3; ++var11) {
						char var7 = var0.charAt(var11);
						if (class9.method124(var7)) {
							char var8;
							switch(var7) {
							case ' ':
							case '-':
							case '_':
							case ' ':
								var8 = '_';
								break;
							case '#':
							case '[':
							case ']':
								var8 = var7;
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
								var8 = 'a';
								break;
							case 'Ç':
							case 'ç':
								var8 = 'c';
								break;
							case 'È':
							case 'É':
							case 'Ê':
							case 'Ë':
							case 'è':
							case 'é':
							case 'ê':
							case 'ë':
								var8 = 'e';
								break;
							case 'Í':
							case 'Î':
							case 'Ï':
							case 'í':
							case 'î':
							case 'ï':
								var8 = 'i';
								break;
							case 'Ñ':
							case 'ñ':
								var8 = 'n';
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
								var8 = 'o';
								break;
							case 'Ù':
							case 'Ú':
							case 'Û':
							case 'Ü':
							case 'ù':
							case 'ú':
							case 'û':
							case 'ü':
								var8 = 'u';
								break;
							case 'ß':
								var8 = 'b';
								break;
							case 'ÿ':
							case 'Ÿ':
								var8 = 'y';
								break;
							default:
								var8 = Character.toLowerCase(var7);
							}

							if (var8 != 0) {
								var10.append(var8);
							}
						}
					}

					if (var10.length() == 0) {
						return null;
					}

					return var10.toString();
				}
			}

			return null;
		}
	}
}
