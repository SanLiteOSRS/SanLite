import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	public static AbstractArchive field2131;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	static EvictingDualNodeHashTable field2134;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1857366871
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -2000718353
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 292771999
	)
	public int field2142;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 728089333
	)
	int field2155;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -466249443
	)
	int field2143;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1100815213
	)
	int field2144;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 170092719
	)
	int field2145;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 895105585
	)
	public int field2130;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 498242719
	)
	public int field2147;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1413310139
	)
	public int field2154;
	@ObfuscatedName("ak")
	String field2150;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1897913521
	)
	public int field2149;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1785373205
	)
	public int field2151;
	@ObfuscatedName("ae")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1173802085
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1580274447
	)
	@Export("transformVarp")
	int transformVarp;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64); // L: 18
		field2134 = new EvictingDualNodeHashTable(64); // L: 19
		HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20); // L: 20
	}

	HitSplatDefinition() {
		this.fontId = -1; // L: 26
		this.textColor = 16777215; // L: 27
		this.field2142 = 70; // L: 28
		this.field2155 = -1; // L: 29
		this.field2143 = -1; // L: 30
		this.field2144 = -1; // L: 31
		this.field2145 = -1; // L: 32
		this.field2130 = 0; // L: 33
		this.field2147 = 0; // L: 34
		this.field2154 = -1; // L: 35
		this.field2150 = ""; // L: 36
		this.field2149 = -1; // L: 37
		this.field2151 = 0; // L: 38
		this.transformVarbit = -1; // L: 40
		this.transformVarp = -1; // L: 41
	} // L: 43

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)V",
		garbageValue = "1967654150"
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lsg;IB)V",
		garbageValue = "1"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 64
			this.fontId = var1.method9108();
		} else if (var2 == 2) { // L: 65
			this.textColor = var1.readMedium();
		} else if (var2 == 3) { // L: 66
			this.field2155 = var1.method9108();
		} else if (var2 == 4) { // L: 67
			this.field2144 = var1.method9108();
		} else if (var2 == 5) { // L: 68
			this.field2143 = var1.method9108();
		} else if (var2 == 6) { // L: 69
			this.field2145 = var1.method9108();
		} else if (var2 == 7) { // L: 70
			this.field2130 = var1.readShort();
		} else if (var2 == 8) { // L: 71
			this.field2150 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) { // L: 72
			this.field2142 = var1.readUnsignedShort();
		} else if (var2 == 10) { // L: 73
			this.field2147 = var1.readShort();
		} else if (var2 == 11) { // L: 74
			this.field2154 = 0;
		} else if (var2 == 12) { // L: 75
			this.field2149 = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 76
			this.field2151 = var1.readShort();
		} else if (var2 == 14) { // L: 77
			this.field2154 = var1.readUnsignedShort();
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Lhb;",
		garbageValue = "-85"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1; // L: 100
		if (this.transformVarbit != -1) { // L: 101
			var1 = class252.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 102
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 104
			var2 = this.transforms[var1]; // L: 105
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class122.method3046(var2) : null; // L: 106 107
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-280765442"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2150; // L: 111

		while (true) {
			int var3 = var2.indexOf("%1"); // L: 113
			if (var3 < 0) { // L: 114
				return var2; // L: 117
			}

			var2 = var2.substring(0, var3) + KitDefinition.intToString(var1, false) + var2.substring(var3 + 2); // L: 115
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ltq;",
		garbageValue = "2059907674"
	)
	public SpritePixels method3948() {
		if (this.field2155 < 0) { // L: 121
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field2134.get((long)this.field2155); // L: 122
			if (var1 != null) {
				return var1; // L: 123
			} else {
				var1 = class484.SpriteBuffer_getSprite(field2131, this.field2155, 0); // L: 124
				if (var1 != null) {
					field2134.put(var1, (long)this.field2155); // L: 125
				}

				return var1; // L: 127
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Ltq;",
		garbageValue = "-2117307389"
	)
	public SpritePixels method3949() {
		if (this.field2143 < 0) { // L: 131
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field2134.get((long)this.field2143); // L: 132
			if (var1 != null) {
				return var1; // L: 133
			} else {
				var1 = class484.SpriteBuffer_getSprite(field2131, this.field2143, 0); // L: 134
				if (var1 != null) {
					field2134.put(var1, (long)this.field2143); // L: 135
				}

				return var1; // L: 137
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ltq;",
		garbageValue = "1640774602"
	)
	public SpritePixels method3943() {
		if (this.field2144 < 0) { // L: 141
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field2134.get((long)this.field2144); // L: 142
			if (var1 != null) {
				return var1; // L: 143
			} else {
				var1 = class484.SpriteBuffer_getSprite(field2131, this.field2144, 0); // L: 144
				if (var1 != null) {
					field2134.put(var1, (long)this.field2144); // L: 145
				}

				return var1; // L: 147
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Ltq;",
		garbageValue = "57"
	)
	public SpritePixels method3951() {
		if (this.field2145 < 0) { // L: 151
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field2134.get((long)this.field2145); // L: 152
			if (var1 != null) {
				return var1; // L: 153
			} else {
				var1 = class484.SpriteBuffer_getSprite(field2131, this.field2145, 0); // L: 154
				if (var1 != null) { // L: 155
					field2134.put(var1, (long)this.field2145);
				}

				return var1; // L: 157
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lon;",
		garbageValue = "1644925127"
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
				AbstractArchive var3 = field2131; // L: 165
				AbstractArchive var4 = HitSplatDefinition_fontsArchive; // L: 166
				int var5 = this.fontId; // L: 167
				byte[] var7 = var3.takeFile(var5, 0); // L: 171
				boolean var6;
				if (var7 == null) { // L: 172
					var6 = false; // L: 173
				} else {
					class485.SpriteBuffer_decode(var7); // L: 176
					var6 = true; // L: 177
				}

				Font var2;
				if (!var6) { // L: 179
					var2 = null; // L: 180
				} else {
					byte[] var8 = var4.takeFile(var5, 0); // L: 184
					Font var10;
					if (var8 == null) { // L: 186
						var10 = null; // L: 187
					} else {
						Font var9 = new Font(var8, class503.SpriteBuffer_xOffsets, class17.SpriteBuffer_yOffsets, class97.SpriteBuffer_spriteWidths, class138.SpriteBuffer_spriteHeights, class394.SpriteBuffer_spritePalette, VarbitComposition.SpriteBuffer_pixels); // L: 190
						class398.method7709(); // L: 191
						var10 = var9; // L: 192
					}

					var2 = var10; // L: 194
				}

				if (var2 != null) { // L: 197
					HitSplatDefinition_cachedFonts.put(var2, (long)this.fontId);
				}

				return var2; // L: 199
			}
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZB)I",
		garbageValue = "1"
	)
	static int method3977(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) { // L: 2819
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2820
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field721.method4229(var3) ? 1 : 0; // L: 2821
			return 1; // L: 2822
		} else if (var0 == 3501) { // L: 2824
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2825
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field721.method4214(var3) ? 1 : 0; // L: 2826
			return 1; // L: 2827
		} else if (var0 == 3502) { // L: 2829
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2830
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field721.method4231(var3) ? 1 : 0; // L: 2831
			return 1; // L: 2832
		} else {
			return 2; // L: 2834
		}
	}
}
