import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("uw")
	@ObfuscatedGetter(
		intValue = -1746790609
	)
	static int field2142;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	public static AbstractArchive field2118;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -121541591
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -213241665
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -352189493
	)
	public int field2134;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 281747617
	)
	int field2129;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1265437581
	)
	int field2130;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1271971627
	)
	int field2139;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1741647535
	)
	int field2132;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 763368609
	)
	public int field2133;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1533306371
	)
	public int field2140;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 310035987
	)
	public int field2137;
	@ObfuscatedName("aq")
	String field2136;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1961409
	)
	public int field2128;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1778108739
	)
	public int field2138;
	@ObfuscatedName("al")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 66224933
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 637611487
	)
	@Export("transformVarp")
	int transformVarp;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64); // L: 18
		HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64); // L: 19
		HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20); // L: 20
	}

	HitSplatDefinition() {
		this.fontId = -1; // L: 26
		this.textColor = 16777215; // L: 27
		this.field2134 = 70; // L: 28
		this.field2129 = -1; // L: 29
		this.field2130 = -1; // L: 30
		this.field2139 = -1; // L: 31
		this.field2132 = -1; // L: 32
		this.field2133 = 0; // L: 33
		this.field2140 = 0; // L: 34
		this.field2137 = -1; // L: 35
		this.field2136 = ""; // L: 36
		this.field2128 = -1; // L: 37
		this.field2138 = 0; // L: 38
		this.transformVarbit = -1; // L: 40
		this.transformVarp = -1; // L: 41
	} // L: 43

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)V",
		garbageValue = "-1923086278"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 57
			if (var2 == 0) { // L: 58
				return; // L: 61
			}

			this.decodeNext(var1, var2); // L: 59
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltz;II)V",
		garbageValue = "1692063671"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 64
			this.fontId = var1.method8928();
		} else if (var2 == 2) { // L: 65
			this.textColor = var1.readMedium();
		} else if (var2 == 3) { // L: 66
			this.field2129 = var1.method8928();
		} else if (var2 == 4) { // L: 67
			this.field2139 = var1.method8928();
		} else if (var2 == 5) { // L: 68
			this.field2130 = var1.method8928();
		} else if (var2 == 6) { // L: 69
			this.field2132 = var1.method8928();
		} else if (var2 == 7) { // L: 70
			this.field2133 = var1.readShort();
		} else if (var2 == 8) { // L: 71
			this.field2136 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) { // L: 72
			this.field2134 = var1.readUnsignedShort();
		} else if (var2 == 10) { // L: 73
			this.field2140 = var1.readShort();
		} else if (var2 == 11) { // L: 74
			this.field2137 = 0;
		} else if (var2 == 12) { // L: 75
			this.field2128 = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 76
			this.field2138 = var1.readShort();
		} else if (var2 == 14) {
			this.field2137 = var1.readUnsignedShort(); // L: 77
		} else if (var2 == 17 || var2 == 18) { // L: 78
			this.transformVarbit = var1.readUnsignedShort(); // L: 79
			if (this.transformVarbit == 65535) { // L: 80
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort(); // L: 81
			if (this.transformVarp == 65535) { // L: 82
				this.transformVarp = -1;
			}

			int var3 = -1; // L: 83
			if (var2 == 18) { // L: 84
				var3 = var1.readUnsignedShort(); // L: 85
				if (var3 == 65535) { // L: 86
					var3 = -1;
				}
			}

			int var4 = var1.readUnsignedByte(); // L: 88
			this.transforms = new int[var4 + 2]; // L: 89

			for (int var5 = 0; var5 <= var4; ++var5) { // L: 90
				this.transforms[var5] = var1.readUnsignedShort(); // L: 91
				if (this.transforms[var5] == 65535) { // L: 92
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3; // L: 94
		}

	} // L: 97

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lhl;",
		garbageValue = "1146309729"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1; // L: 100
		if (this.transformVarbit != -1) { // L: 101
			var1 = class343.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 102
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 104
			var2 = this.transforms[var1]; // L: 105
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? PlayerComposition.method6053(var2) : null; // L: 106 107
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1477064661"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2136; // L: 111

		while (true) {
			int var3 = var2.indexOf("%1"); // L: 113
			if (var3 < 0) { // L: 114
				return var2; // L: 117
			}

			var2 = var2.substring(0, var3) + ChatChannel.intToString(var1, false) + var2.substring(var3 + 2); // L: 115
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ltm;",
		garbageValue = "1572311176"
	)
	public SpritePixels method3862() {
		if (this.field2129 < 0) { // L: 121
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2129); // L: 122
			if (var1 != null) {
				return var1; // L: 123
			} else {
				var1 = class107.SpriteBuffer_getSprite(field2118, this.field2129, 0); // L: 124
				if (var1 != null) { // L: 125
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2129);
				}

				return var1; // L: 127
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ltm;",
		garbageValue = "1971141014"
	)
	public SpritePixels method3863() {
		if (this.field2130 < 0) { // L: 131
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2130); // L: 132
			if (var1 != null) {
				return var1; // L: 133
			} else {
				var1 = class107.SpriteBuffer_getSprite(field2118, this.field2130, 0); // L: 134
				if (var1 != null) { // L: 135
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2130);
				}

				return var1; // L: 137
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Ltm;",
		garbageValue = "-980783206"
	)
	public SpritePixels method3885() {
		if (this.field2139 < 0) { // L: 141
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2139); // L: 142
			if (var1 != null) {
				return var1; // L: 143
			} else {
				var1 = class107.SpriteBuffer_getSprite(field2118, this.field2139, 0); // L: 144
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2139); // L: 145
				}

				return var1; // L: 147
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ltm;",
		garbageValue = "-1515329169"
	)
	public SpritePixels method3872() {
		if (this.field2132 < 0) { // L: 151
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2132); // L: 152
			if (var1 != null) { // L: 153
				return var1;
			} else {
				var1 = class107.SpriteBuffer_getSprite(field2118, this.field2132, 0); // L: 154
				if (var1 != null) { // L: 155
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2132);
				}

				return var1; // L: 157
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lph;",
		garbageValue = "1541896410"
	)
	@Export("getFont")
	public Font getFont() {
		if (this.fontId == -1) { // L: 161
			return null;
		} else {
			Font var1 = (Font)HitSplatDefinition_cachedFonts.get((long)this.fontId); // L: 162
			if (var1 != null) { // L: 163
				return var1;
			} else {
				var1 = Bounds.method8030(field2118, HitSplatDefinition_fontsArchive, this.fontId, 0); // L: 164
				if (var1 != null) {
					HitSplatDefinition_cachedFonts.put(var1, (long)this.fontId); // L: 165
				}

				return var1; // L: 167
			}
		}
	}
}
