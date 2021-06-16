import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("HitSplatDefinition_archive")
	static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	static AbstractArchive field1741;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("HealthBarDefinition_cached")
	static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -723534111
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1591266189
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1859530029
	)
	public int field1738;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1375425207
	)
	int field1739;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1428779523
	)
	int field1736;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1020786297
	)
	int field1730;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 106928431
	)
	int field1754;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 561650227
	)
	public int field1733;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -492190243
	)
	public int field1744;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 2037036053
	)
	public int field1745;
	@ObfuscatedName("c")
	String field1746;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1791772153
	)
	public int field1747;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1747683339
	)
	public int field1748;
	@ObfuscatedName("w")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -911835177
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 486037971
	)
	@Export("transformVarp")
	int transformVarp;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64);
		HealthBarDefinition_cached = new EvictingDualNodeHashTable(64);
		HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(20);
	}

	HitSplatDefinition() {
		this.fontId = -1;
		this.textColor = 16777215;
		this.field1738 = 70;
		this.field1739 = -1;
		this.field1736 = -1;
		this.field1730 = -1;
		this.field1754 = -1;
		this.field1733 = 0;
		this.field1744 = 0;
		this.field1745 = -1;
		this.field1746 = "";
		this.field1747 = -1;
		this.field1748 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-1789586115"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnt;II)V",
		garbageValue = "-1884352839"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.method6630();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field1739 = var1.method6630();
		} else if (var2 == 4) {
			this.field1730 = var1.method6630();
		} else if (var2 == 5) {
			this.field1736 = var1.method6630();
		} else if (var2 == 6) {
			this.field1754 = var1.method6630();
		} else if (var2 == 7) {
			this.field1733 = var1.readShort();
		} else if (var2 == 8) {
			this.field1746 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field1738 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field1744 = var1.readShort();
		} else if (var2 == 11) {
			this.field1745 = 0;
		} else if (var2 == 12) {
			this.field1747 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field1748 = var1.readShort();
		} else if (var2 == 14) {
			this.field1745 = var1.readUnsignedShort();
		} else if (var2 == 17 || var2 == 18) {
			this.transformVarbit = var1.readUnsignedShort();
			if (this.transformVarbit == 65535) {
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort();
			if (this.transformVarp == 65535) {
				this.transformVarp = -1;
			}

			int var3 = -1;
			if (var2 == 18) {
				var3 = var1.readUnsignedShort();
				if (var3 == 65535) {
					var3 = -1;
				}
			}

			int var4 = var1.readUnsignedByte();
			this.transforms = new int[var4 + 2];

			for (int var5 = 0; var5 <= var4; ++var5) {
				this.transforms[var5] = var1.readUnsignedShort();
				if (this.transforms[var5] == 65535) {
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3;
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)Les;",
		garbageValue = "0"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = ScriptFrame.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? Decimator.method1171(var2) : null;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-47892003"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field1746;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = var2.substring(0, var3) + HealthBarDefinition.intToString(var1, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)Loa;",
		garbageValue = "80"
	)
	public SpritePixels method2978() {
		if (this.field1739 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cached.get((long)this.field1739);
			if (var1 != null) {
				return var1;
			} else {
				var1 = Tile.SpriteBuffer_getSprite(field1741, this.field1739, 0);
				if (var1 != null) {
					HealthBarDefinition_cached.put(var1, (long)this.field1739);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)Loa;",
		garbageValue = "-85"
	)
	public SpritePixels method3005() {
		if (this.field1736 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cached.get((long)this.field1736);
			if (var1 != null) {
				return var1;
			} else {
				var1 = Tile.SpriteBuffer_getSprite(field1741, this.field1736, 0);
				if (var1 != null) {
					HealthBarDefinition_cached.put(var1, (long)this.field1736);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Loa;",
		garbageValue = "-905077857"
	)
	public SpritePixels method2980() {
		if (this.field1730 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cached.get((long)this.field1730);
			if (var1 != null) {
				return var1;
			} else {
				var1 = Tile.SpriteBuffer_getSprite(field1741, this.field1730, 0);
				if (var1 != null) {
					HealthBarDefinition_cached.put(var1, (long)this.field1730);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)Loa;",
		garbageValue = "86"
	)
	public SpritePixels method2981() {
		if (this.field1754 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cached.get((long)this.field1754);
			if (var1 != null) {
				return var1;
			} else {
				var1 = Tile.SpriteBuffer_getSprite(field1741, this.field1754, 0);
				if (var1 != null) {
					HealthBarDefinition_cached.put(var1, (long)this.field1754);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Lkj;",
		garbageValue = "-548642853"
	)
	@Export("getFont")
	public Font getFont() {
		if (this.fontId == -1) {
			return null;
		} else {
			Font var1 = (Font)HealthBarDefinition_cachedSprites.get((long)this.fontId);
			if (var1 != null) {
				return var1;
			} else {
				var1 = Bounds.method6034(field1741, HitSplatDefinition_fontsArchive, this.fontId, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.fontId);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(CB)C",
		garbageValue = "20"
	)
	static char method3013(char var0) {
		return var0 != 181 && var0 != 402 ? Character.toTitleCase(var0) : var0;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1542178595"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}
}
