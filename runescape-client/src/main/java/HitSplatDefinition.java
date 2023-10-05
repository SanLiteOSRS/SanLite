import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("HitSplatDefinition_archive")
	static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static AbstractArchive field2167;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	public static EvictingDualNodeHashTable field2170;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	public static EvictingDualNodeHashTable field2183;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 396661887
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1701009289
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1699613375
	)
	public int field2175;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1528136211
	)
	int field2178;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -550294639
	)
	int field2185;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 413657557
	)
	int field2184;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 2096084383
	)
	int field2179;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 805623967
	)
	public int field2180;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 787520217
	)
	public int field2171;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 2031749663
	)
	public int field2182;
	@ObfuscatedName("aq")
	String field2176;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 299765549
	)
	public int field2177;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1307541621
	)
	public int field2173;
	@ObfuscatedName("af")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -79738007
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -752791003
	)
	@Export("transformVarp")
	int transformVarp;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64); // L: 18
		field2170 = new EvictingDualNodeHashTable(64); // L: 19
		field2183 = new EvictingDualNodeHashTable(20); // L: 20
	}

	HitSplatDefinition() {
		this.fontId = -1; // L: 26
		this.textColor = 16777215; // L: 27
		this.field2175 = 70; // L: 28
		this.field2178 = -1; // L: 29
		this.field2185 = -1; // L: 30
		this.field2184 = -1; // L: 31
		this.field2179 = -1; // L: 32
		this.field2180 = 0; // L: 33
		this.field2171 = 0; // L: 34
		this.field2182 = -1; // L: 35
		this.field2176 = ""; // L: 36
		this.field2177 = -1; // L: 37
		this.field2173 = 0; // L: 38
		this.transformVarbit = -1; // L: 40
		this.transformVarp = -1; // L: 41
	} // L: 43

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lul;S)V",
		garbageValue = "7501"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 63
			if (var2 == 0) { // L: 64
				return; // L: 67
			}

			this.decodeNext(var1, var2); // L: 65
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lul;II)V",
		garbageValue = "1630340273"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 70
			this.fontId = var1.method9223();
		} else if (var2 == 2) { // L: 71
			this.textColor = var1.readMedium();
		} else if (var2 == 3) { // L: 72
			this.field2178 = var1.method9223();
		} else if (var2 == 4) { // L: 73
			this.field2184 = var1.method9223();
		} else if (var2 == 5) { // L: 74
			this.field2185 = var1.method9223();
		} else if (var2 == 6) { // L: 75
			this.field2179 = var1.method9223();
		} else if (var2 == 7) { // L: 76
			this.field2180 = var1.readShort();
		} else if (var2 == 8) { // L: 77
			this.field2176 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) { // L: 78
			this.field2175 = var1.readUnsignedShort();
		} else if (var2 == 10) { // L: 79
			this.field2171 = var1.readShort();
		} else if (var2 == 11) { // L: 80
			this.field2182 = 0;
		} else if (var2 == 12) { // L: 81
			this.field2177 = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 82
			this.field2173 = var1.readShort();
		} else if (var2 == 14) {
			this.field2182 = var1.readUnsignedShort(); // L: 83
		} else if (var2 == 17 || var2 == 18) { // L: 84
			this.transformVarbit = var1.readUnsignedShort(); // L: 85
			if (this.transformVarbit == 65535) { // L: 86
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort(); // L: 87
			if (this.transformVarp == 65535) { // L: 88
				this.transformVarp = -1;
			}

			int var3 = -1; // L: 89
			if (var2 == 18) { // L: 90
				var3 = var1.readUnsignedShort(); // L: 91
				if (var3 == 65535) { // L: 92
					var3 = -1;
				}
			}

			int var4 = var1.readUnsignedByte(); // L: 94
			this.transforms = new int[var4 + 2]; // L: 95

			for (int var5 = 0; var5 <= var4; ++var5) { // L: 96
				this.transforms[var5] = var1.readUnsignedShort(); // L: 97
				if (this.transforms[var5] == 65535) { // L: 98
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3; // L: 100
		}

	} // L: 103

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Liw;",
		garbageValue = "-588472147"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1; // L: 106
		if (this.transformVarbit != -1) { // L: 107
			var1 = class36.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 108
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 110
			var2 = this.transforms[var1]; // L: 111
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class191.method3627(var2) : null; // L: 112 113
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1312743018"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2176; // L: 117

		while (true) {
			int var3 = var2.indexOf("%1"); // L: 119
			if (var3 < 0) { // L: 120
				return var2; // L: 123
			}

			var2 = var2.substring(0, var3) + AbstractWorldMapData.intToString(var1, false) + var2.substring(var3 + 2); // L: 121
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lud;",
		garbageValue = "-580598117"
	)
	public SpritePixels method3973() {
		if (this.field2178 < 0) { // L: 127
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field2170.get((long)this.field2178); // L: 128
			if (var1 != null) {
				return var1; // L: 129
			} else {
				var1 = class47.SpriteBuffer_getSprite(field2167, this.field2178, 0); // L: 130
				if (var1 != null) {
					field2170.put(var1, (long)this.field2178); // L: 131
				}

				return var1; // L: 133
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lud;",
		garbageValue = "1894874204"
	)
	public SpritePixels method3974() {
		if (this.field2185 < 0) { // L: 137
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field2170.get((long)this.field2185); // L: 138
			if (var1 != null) {
				return var1; // L: 139
			} else {
				var1 = class47.SpriteBuffer_getSprite(field2167, this.field2185, 0); // L: 140
				if (var1 != null) { // L: 141
					field2170.put(var1, (long)this.field2185);
				}

				return var1; // L: 143
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Lud;",
		garbageValue = "-3"
	)
	public SpritePixels method3975() {
		if (this.field2184 < 0) { // L: 147
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field2170.get((long)this.field2184); // L: 148
			if (var1 != null) {
				return var1; // L: 149
			} else {
				var1 = class47.SpriteBuffer_getSprite(field2167, this.field2184, 0); // L: 150
				if (var1 != null) {
					field2170.put(var1, (long)this.field2184); // L: 151
				}

				return var1; // L: 153
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Lud;",
		garbageValue = "-1859973859"
	)
	public SpritePixels method3976() {
		if (this.field2179 < 0) { // L: 157
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field2170.get((long)this.field2179); // L: 158
			if (var1 != null) { // L: 159
				return var1;
			} else {
				var1 = class47.SpriteBuffer_getSprite(field2167, this.field2179, 0); // L: 160
				if (var1 != null) { // L: 161
					field2170.put(var1, (long)this.field2179);
				}

				return var1; // L: 163
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Lpu;",
		garbageValue = "36"
	)
	@Export("getFont")
	public Font getFont() {
		if (this.fontId == -1) { // L: 167
			return null;
		} else {
			Font var1 = (Font)field2183.get((long)this.fontId); // L: 168
			if (var1 != null) { // L: 169
				return var1;
			} else {
				AbstractArchive var3 = field2167; // L: 171
				AbstractArchive var4 = class135.HitSplatDefinition_fontsArchive; // L: 172
				int var5 = this.fontId; // L: 173
				Font var2;
				if (!class164.method3376(var3, var5, 0)) { // L: 175
					var2 = null; // L: 176
				} else {
					byte[] var7 = var4.takeFile(var5, 0); // L: 180
					Font var6;
					if (var7 == null) { // L: 182
						var6 = null; // L: 183
					} else {
						Font var8 = new Font(var7, class326.SpriteBuffer_xOffsets, ModelData0.SpriteBuffer_yOffsets, class59.SpriteBuffer_spriteWidths, class544.SpriteBuffer_spriteHeights, class372.SpriteBuffer_spritePalette, class414.SpriteBuffer_pixels); // L: 186
						class407.method7453(); // L: 187
						var6 = var8; // L: 188
					}

					var2 = var6; // L: 190
				}

				if (var2 != null) { // L: 193
					field2183.put(var2, (long)this.fontId);
				}

				return var2; // L: 195
			}
		}
	}
}
