import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("wx")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	public static class367 field2141;
	@ObfuscatedName("uj")
	@ObfuscatedGetter(
		intValue = 1986862505
	)
	static int field2128;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	static AbstractArchive field2115;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "Ldr;"
	)
	@Export("localPlayer")
	static Player localPlayer;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1640732855
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1833078921
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1238428215
	)
	public int field2124;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1000064613
	)
	int field2114;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 524020417
	)
	int field2126;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 2027691087
	)
	int field2127;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -491570561
	)
	int field2131;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1800774651
	)
	public int field2129;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1691402905
	)
	public int field2116;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -939029535
	)
	public int field2121;
	@ObfuscatedName("az")
	String field2132;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 796850043
	)
	public int field2133;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -750270147
	)
	public int field2134;
	@ObfuscatedName("au")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 88864805
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 2071165555
	)
	@Export("transformVarp")
	int transformVarp;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64); // L: 18
		HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64); // L: 19
		HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20); // L: 20
	}

	public HitSplatDefinition() {
		this.fontId = -1; // L: 26
		this.textColor = 16777215; // L: 27
		this.field2124 = 70; // L: 28
		this.field2114 = -1; // L: 29
		this.field2126 = -1; // L: 30
		this.field2127 = -1; // L: 31
		this.field2131 = -1; // L: 32
		this.field2129 = 0; // L: 33
		this.field2116 = 0; // L: 34
		this.field2121 = -1; // L: 35
		this.field2132 = ""; // L: 36
		this.field2133 = -1; // L: 37
		this.field2134 = 0; // L: 38
		this.transformVarbit = -1; // L: 40
		this.transformVarp = -1; // L: 41
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltc;I)V",
		garbageValue = "-1352196415"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 51
			if (var2 == 0) { // L: 52
				return; // L: 55
			}

			this.decodeNext(var1, var2); // L: 53
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ltc;II)V",
		garbageValue = "-2144873399"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 58
			this.fontId = var1.method9095();
		} else if (var2 == 2) { // L: 59
			this.textColor = var1.readMedium();
		} else if (var2 == 3) { // L: 60
			this.field2114 = var1.method9095();
		} else if (var2 == 4) { // L: 61
			this.field2127 = var1.method9095();
		} else if (var2 == 5) { // L: 62
			this.field2126 = var1.method9095();
		} else if (var2 == 6) { // L: 63
			this.field2131 = var1.method9095();
		} else if (var2 == 7) { // L: 64
			this.field2129 = var1.readShort();
		} else if (var2 == 8) { // L: 65
			this.field2132 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) { // L: 66
			this.field2124 = var1.readUnsignedShort();
		} else if (var2 == 10) { // L: 67
			this.field2116 = var1.readShort();
		} else if (var2 == 11) { // L: 68
			this.field2121 = 0;
		} else if (var2 == 12) { // L: 69
			this.field2133 = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 70
			this.field2134 = var1.readShort();
		} else if (var2 == 14) { // L: 71
			this.field2121 = var1.readUnsignedShort();
		} else if (var2 == 17 || var2 == 18) { // L: 72
			this.transformVarbit = var1.readUnsignedShort(); // L: 73
			if (this.transformVarbit == 65535) { // L: 74
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort(); // L: 75
			if (this.transformVarp == 65535) { // L: 76
				this.transformVarp = -1;
			}

			int var3 = -1; // L: 77
			if (var2 == 18) { // L: 78
				var3 = var1.readUnsignedShort(); // L: 79
				if (var3 == 65535) { // L: 80
					var3 = -1;
				}
			}

			int var4 = var1.readUnsignedByte(); // L: 82
			this.transforms = new int[var4 + 2]; // L: 83

			for (int var5 = 0; var5 <= var4; ++var5) { // L: 84
				this.transforms[var5] = var1.readUnsignedShort(); // L: 85
				if (this.transforms[var5] == 65535) { // L: 86
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3; // L: 88
		}

	} // L: 91

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lhq;",
		garbageValue = "-1886757584"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1; // L: 94
		if (this.transformVarbit != -1) { // L: 95
			var1 = class327.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 96
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 98
			var2 = this.transforms[var1]; // L: 99
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		if (var2 != -1) { // L: 100
			HitSplatDefinition var4 = (HitSplatDefinition)HitSplatDefinition_cached.get((long)var2); // L: 103
			HitSplatDefinition var3;
			if (var4 != null) { // L: 104
				var3 = var4; // L: 105
			} else {
				byte[] var5 = HitSplatDefinition_archive.takeFile(32, var2); // L: 108
				var4 = new HitSplatDefinition(); // L: 109
				if (var5 != null) { // L: 110
					var4.decode(new Buffer(var5));
				}

				HitSplatDefinition_cached.put(var4, (long)var2); // L: 111
				var3 = var4; // L: 112
			}

			return var3; // L: 114
		} else {
			return null; // L: 116
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1075476372"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2132; // L: 120

		while (true) {
			int var3 = var2.indexOf("%1"); // L: 122
			if (var3 < 0) { // L: 123
				return var2; // L: 126
			}

			var2 = var2.substring(0, var3) + class6.intToString(var1, false) + var2.substring(var3 + 2); // L: 124
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Ltt;",
		garbageValue = "486670967"
	)
	public SpritePixels method3845() {
		if (this.field2114 < 0) { // L: 130
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2114); // L: 131
			if (var1 != null) { // L: 132
				return var1;
			} else {
				var1 = class302.SpriteBuffer_getSprite(field2115, this.field2114, 0); // L: 133
				if (var1 != null) { // L: 134
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2114);
				}

				return var1; // L: 136
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ltt;",
		garbageValue = "359056522"
	)
	public SpritePixels method3832() {
		if (this.field2126 < 0) { // L: 140
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2126); // L: 141
			if (var1 != null) {
				return var1; // L: 142
			} else {
				var1 = class302.SpriteBuffer_getSprite(field2115, this.field2126, 0); // L: 143
				if (var1 != null) { // L: 144
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2126);
				}

				return var1; // L: 146
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Ltt;",
		garbageValue = "-2003747984"
	)
	public SpritePixels method3829() {
		if (this.field2127 < 0) { // L: 150
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2127); // L: 151
			if (var1 != null) {
				return var1; // L: 152
			} else {
				var1 = class302.SpriteBuffer_getSprite(field2115, this.field2127, 0); // L: 153
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2127); // L: 154
				}

				return var1; // L: 156
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ltt;",
		garbageValue = "-2102600132"
	)
	public SpritePixels method3830() {
		if (this.field2131 < 0) { // L: 160
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2131); // L: 161
			if (var1 != null) {
				return var1; // L: 162
			} else {
				var1 = class302.SpriteBuffer_getSprite(field2115, this.field2131, 0); // L: 163
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2131); // L: 164
				}

				return var1; // L: 166
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lpa;",
		garbageValue = "-735131964"
	)
	@Export("getFont")
	public Font getFont() {
		if (this.fontId == -1) { // L: 170
			return null;
		} else {
			Font var1 = (Font)HitSplatDefinition_cachedFonts.get((long)this.fontId); // L: 171
			if (var1 != null) { // L: 172
				return var1;
			} else {
				AbstractArchive var3 = field2115; // L: 174
				AbstractArchive var4 = HitSplatDefinition_fontsArchive; // L: 175
				int var5 = this.fontId; // L: 176
				Font var2;
				if (!WorldMapAreaData.method5599(var3, var5, 0)) { // L: 178
					var2 = null; // L: 179
				} else {
					byte[] var7 = var4.takeFile(var5, 0); // L: 183
					Font var6;
					if (var7 == null) { // L: 185
						var6 = null; // L: 186
					} else {
						Font var8 = new Font(var7, class515.SpriteBuffer_xOffsets, class515.SpriteBuffer_yOffsets, SecureRandomCallable.SpriteBuffer_spriteWidths, SecureRandomCallable.SpriteBuffer_spriteHeights, class515.SpriteBuffer_spritePalette, WorldMapDecoration.SpriteBuffer_pixels); // L: 189
						FriendLoginUpdate.method7789(); // L: 190
						var6 = var8; // L: 191
					}

					var2 = var6; // L: 193
				}

				if (var2 != null) { // L: 196
					HitSplatDefinition_cachedFonts.put(var2, (long)this.fontId);
				}

				return var2; // L: 198
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "243598776"
	)
	public static int method3844(int var0) {
		return var0 >>> 4 & class496.field5000; // L: 22
	}

	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "(Lmo;B)Z",
		garbageValue = "-47"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) { // L: 10933
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) { // L: 10934
				int var2 = class216.method4197(var0, var1); // L: 10935
				int var3 = var0.cs1ComparisonValues[var1]; // L: 10936
				if (var0.cs1Comparisons[var1] == 2) { // L: 10937
					if (var2 >= var3) { // L: 10938
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) { // L: 10940
					if (var2 <= var3) { // L: 10941
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) { // L: 10943
					if (var2 == var3) { // L: 10944
						return false;
					}
				} else if (var2 != var3) { // L: 10946
					return false;
				}
			}

			return true; // L: 10948
		}
	}
}
