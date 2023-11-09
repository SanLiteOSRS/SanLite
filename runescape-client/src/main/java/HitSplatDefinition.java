import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1409880651
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1290128945
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1094796461
	)
	public int field2123;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -74059523
	)
	int field2114;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1193764327
	)
	int field2124;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 998933783
	)
	int field2122;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -343153479
	)
	int field2121;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1244067827
	)
	public int field2129;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1262270147
	)
	public int field2125;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2118543057
	)
	public int field2126;
	@ObfuscatedName("ak")
	String field2127;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2012550267
	)
	public int field2131;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1800726421
	)
	public int field2109;
	@ObfuscatedName("ai")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1025493681
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -948379165
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
		this.field2123 = 70; // L: 28
		this.field2114 = -1; // L: 29
		this.field2124 = -1; // L: 30
		this.field2122 = -1; // L: 31
		this.field2121 = -1; // L: 32
		this.field2129 = 0; // L: 33
		this.field2125 = 0; // L: 34
		this.field2126 = -1; // L: 35
		this.field2127 = ""; // L: 36
		this.field2131 = -1; // L: 37
		this.field2109 = 0; // L: 38
		this.transformVarbit = -1; // L: 40
		this.transformVarp = -1; // L: 41
	} // L: 43

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "17891601"
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lty;II)V",
		garbageValue = "1627766366"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 64
			this.fontId = var1.method9152();
		} else if (var2 == 2) { // L: 65
			this.textColor = var1.readMedium();
		} else if (var2 == 3) { // L: 66
			this.field2114 = var1.method9152();
		} else if (var2 == 4) { // L: 67
			this.field2122 = var1.method9152();
		} else if (var2 == 5) { // L: 68
			this.field2124 = var1.method9152();
		} else if (var2 == 6) { // L: 69
			this.field2121 = var1.method9152();
		} else if (var2 == 7) { // L: 70
			this.field2129 = var1.readShort();
		} else if (var2 == 8) { // L: 71
			this.field2127 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) { // L: 72
			this.field2123 = var1.readUnsignedShort();
		} else if (var2 == 10) { // L: 73
			this.field2125 = var1.readShort();
		} else if (var2 == 11) { // L: 74
			this.field2126 = 0;
		} else if (var2 == 12) { // L: 75
			this.field2131 = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 76
			this.field2109 = var1.readShort();
		} else if (var2 == 14) { // L: 77
			this.field2126 = var1.readUnsignedShort();
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Lhk;",
		garbageValue = "-517578279"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1; // L: 100
		if (this.transformVarbit != -1) { // L: 101
			var1 = DecorativeObject.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 102
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 104
			var2 = this.transforms[var1]; // L: 105
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class177.method3541(var2) : null; // L: 106 107
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1987893545"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2127; // L: 111

		while (true) {
			int var3 = var2.indexOf("%1"); // L: 113
			if (var3 < 0) { // L: 114
				return var2; // L: 117
			}

			var2 = var2.substring(0, var3) + class509.intToString(var1, false) + var2.substring(var3 + 2); // L: 115
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Lud;",
		garbageValue = "6"
	)
	public SpritePixels method3878() {
		if (this.field2114 < 0) { // L: 121
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2114); // L: 122
			if (var1 != null) {
				return var1; // L: 123
			} else {
				var1 = WorldMap.SpriteBuffer_getSprite(class387.field4438, this.field2114, 0); // L: 124
				if (var1 != null) { // L: 125
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2114);
				}

				return var1; // L: 127
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Lud;",
		garbageValue = "-36"
	)
	public SpritePixels method3882() {
		if (this.field2124 < 0) { // L: 131
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2124); // L: 132
			if (var1 != null) {
				return var1; // L: 133
			} else {
				var1 = WorldMap.SpriteBuffer_getSprite(class387.field4438, this.field2124, 0); // L: 134
				if (var1 != null) { // L: 135
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2124);
				}

				return var1; // L: 137
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Lud;",
		garbageValue = "122"
	)
	public SpritePixels method3883() {
		if (this.field2122 < 0) { // L: 141
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2122); // L: 142
			if (var1 != null) {
				return var1; // L: 143
			} else {
				var1 = WorldMap.SpriteBuffer_getSprite(class387.field4438, this.field2122, 0); // L: 144
				if (var1 != null) { // L: 145
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2122);
				}

				return var1; // L: 147
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Lud;",
		garbageValue = "1252714259"
	)
	public SpritePixels method3884() {
		if (this.field2121 < 0) { // L: 151
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2121); // L: 152
			if (var1 != null) {
				return var1; // L: 153
			} else {
				var1 = WorldMap.SpriteBuffer_getSprite(class387.field4438, this.field2121, 0); // L: 154
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2121); // L: 155
				}

				return var1; // L: 157
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lpc;",
		garbageValue = "-1649845453"
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
				var1 = class408.method7672(class387.field4438, HitSplatDefinition_fontsArchive, this.fontId, 0); // L: 164
				if (var1 != null) {
					HitSplatDefinition_cachedFonts.put(var1, (long)this.fontId); // L: 165
				}

				return var1; // L: 167
			}
		}
	}
}
