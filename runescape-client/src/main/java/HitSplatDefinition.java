import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	public static AbstractArchive field2024;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("by")
	static String field2012;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1054049385
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -681177141
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -385387327
	)
	public int field2019;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 2102305019
	)
	int field2020;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -160544551
	)
	int field2021;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -713960483
	)
	int field2033;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -279291035
	)
	int field2028;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1971059461
	)
	public int field2015;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1207041019
	)
	public int field2025;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -390038703
	)
	public int field2026;
	@ObfuscatedName("x")
	String field2027;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1747023675
	)
	public int field2032;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 217225219
	)
	public int field2031;
	@ObfuscatedName("j")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -99854019
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 2059503041
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
		this.field2019 = 70; // L: 28
		this.field2020 = -1; // L: 29
		this.field2021 = -1; // L: 30
		this.field2033 = -1; // L: 31
		this.field2028 = -1; // L: 32
		this.field2015 = 0; // L: 33
		this.field2025 = 0; // L: 34
		this.field2026 = -1; // L: 35
		this.field2027 = ""; // L: 36
		this.field2032 = -1; // L: 37
		this.field2031 = 0; // L: 38
		this.transformVarbit = -1; // L: 40
		this.transformVarp = -1; // L: 41
	} // L: 43

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "1090888991"
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqr;II)V",
		garbageValue = "409638194"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 64
			this.fontId = var1.method7652();
		} else if (var2 == 2) { // L: 65
			this.textColor = var1.readMedium();
		} else if (var2 == 3) { // L: 66
			this.field2020 = var1.method7652();
		} else if (var2 == 4) { // L: 67
			this.field2033 = var1.method7652();
		} else if (var2 == 5) { // L: 68
			this.field2021 = var1.method7652();
		} else if (var2 == 6) { // L: 69
			this.field2028 = var1.method7652();
		} else if (var2 == 7) { // L: 70
			this.field2015 = var1.readShort();
		} else if (var2 == 8) { // L: 71
			this.field2027 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) { // L: 72
			this.field2019 = var1.readUnsignedShort();
		} else if (var2 == 10) { // L: 73
			this.field2025 = var1.readShort();
		} else if (var2 == 11) { // L: 74
			this.field2026 = 0;
		} else if (var2 == 12) { // L: 75
			this.field2032 = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 76
			this.field2031 = var1.readShort();
		} else if (var2 == 14) { // L: 77
			this.field2026 = var1.readUnsignedShort();
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lgu;",
		garbageValue = "1968416889"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1; // L: 100
		if (this.transformVarbit != -1) { // L: 101
			var1 = class133.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 102
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 104
			var2 = this.transforms[var1]; // L: 105
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? HealthBar.method2311(var2) : null; // L: 106 107
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-919929700"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2027; // L: 111

		while (true) {
			int var3 = var2.indexOf("%1"); // L: 113
			if (var3 < 0) { // L: 114
				return var2; // L: 117
			}

			var2 = var2.substring(0, var3) + Archive.intToString(var1, false) + var2.substring(var3 + 2); // L: 115
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Lqn;",
		garbageValue = "880694747"
	)
	public SpritePixels method3551() {
		if (this.field2020 < 0) { // L: 121
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2020); // L: 122
			if (var1 != null) {
				return var1; // L: 123
			} else {
				var1 = WorldMapScaleHandler.SpriteBuffer_getSprite(field2024, this.field2020, 0); // L: 124
				if (var1 != null) { // L: 125
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2020);
				}

				return var1; // L: 127
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)Lqn;",
		garbageValue = "4"
	)
	public SpritePixels method3552() {
		if (this.field2021 < 0) { // L: 131
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2021); // L: 132
			if (var1 != null) {
				return var1; // L: 133
			} else {
				var1 = WorldMapScaleHandler.SpriteBuffer_getSprite(field2024, this.field2021, 0); // L: 134
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2021); // L: 135
				}

				return var1; // L: 137
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Lqn;",
		garbageValue = "-363172336"
	)
	public SpritePixels method3556() {
		if (this.field2033 < 0) { // L: 141
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2033); // L: 142
			if (var1 != null) { // L: 143
				return var1;
			} else {
				var1 = WorldMapScaleHandler.SpriteBuffer_getSprite(field2024, this.field2033, 0); // L: 144
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2033); // L: 145
				}

				return var1; // L: 147
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Lqn;",
		garbageValue = "101"
	)
	public SpritePixels method3563() {
		if (this.field2028 < 0) { // L: 151
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2028); // L: 152
			if (var1 != null) {
				return var1; // L: 153
			} else {
				var1 = WorldMapScaleHandler.SpriteBuffer_getSprite(field2024, this.field2028, 0); // L: 154
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2028); // L: 155
				}

				return var1; // L: 157
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Lmg;",
		garbageValue = "723083459"
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
				AbstractArchive var3 = field2024; // L: 165
				AbstractArchive var4 = HitSplatDefinition_fontsArchive; // L: 166
				int var5 = this.fontId; // L: 167
				Font var2;
				if (!Tile.method3937(var3, var5, 0)) { // L: 169
					var2 = null; // L: 170
				} else {
					byte[] var7 = var4.takeFile(var5, 0); // L: 174
					Font var6;
					if (var7 == null) { // L: 176
						var6 = null; // L: 177
					} else {
						Font var8 = new Font(var7, class457.SpriteBuffer_xOffsets, InterfaceParent.SpriteBuffer_yOffsets, class457.SpriteBuffer_spriteWidths, SoundCache.SpriteBuffer_spriteHeights, class457.SpriteBuffer_spritePalette, class181.SpriteBuffer_pixels); // L: 180
						class457.SpriteBuffer_xOffsets = null; // L: 182
						InterfaceParent.SpriteBuffer_yOffsets = null; // L: 183
						class457.SpriteBuffer_spriteWidths = null; // L: 184
						SoundCache.SpriteBuffer_spriteHeights = null; // L: 185
						class457.SpriteBuffer_spritePalette = null; // L: 186
						class181.SpriteBuffer_pixels = null; // L: 187
						var6 = var8; // L: 189
					}

					var2 = var6; // L: 191
				}

				if (var2 != null) { // L: 194
					HitSplatDefinition_cachedFonts.put(var2, (long)this.fontId);
				}

				return var2; // L: 196
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)Lkn;",
		garbageValue = "28"
	)
	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16; // L: 220
		int var2 = var0 & 65535; // L: 221
		if (class358.Widget_interfaceComponents[var1] == null || class358.Widget_interfaceComponents[var1][var2] == null) { // L: 222
			boolean var3 = ParamComposition.loadInterface(var1); // L: 223
			if (!var3) { // L: 224
				return null;
			}
		}

		return class358.Widget_interfaceComponents[var1][var2]; // L: 226
	}
}
