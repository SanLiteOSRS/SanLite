import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	public static AbstractArchive field2219;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	public static EvictingDualNodeHashTable field2224;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 202913933
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1666641871
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1025631065
	)
	public int field2227;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 859305317
	)
	int field2228;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 333321025
	)
	int field2239;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1569624883
	)
	int field2236;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -880343937
	)
	int field2231;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -2000647835
	)
	public int field2232;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 17647215
	)
	public int field2233;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1697905215
	)
	public int field2234;
	@ObfuscatedName("aq")
	String field2230;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -671612445
	)
	public int field2229;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 59333765
	)
	public int field2237;
	@ObfuscatedName("ae")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1191707337
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1670704337
	)
	@Export("transformVarp")
	int transformVarp;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64); // L: 18
		HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64); // L: 19
		field2224 = new EvictingDualNodeHashTable(20); // L: 20
	}

	HitSplatDefinition() {
		this.fontId = -1; // L: 26
		this.textColor = 16777215; // L: 27
		this.field2227 = 70; // L: 28
		this.field2228 = -1; // L: 29
		this.field2239 = -1; // L: 30
		this.field2236 = -1; // L: 31
		this.field2231 = -1; // L: 32
		this.field2232 = 0; // L: 33
		this.field2233 = 0; // L: 34
		this.field2234 = -1; // L: 35
		this.field2230 = ""; // L: 36
		this.field2229 = -1; // L: 37
		this.field2237 = 0; // L: 38
		this.transformVarbit = -1; // L: 40
		this.transformVarp = -1; // L: 41
	} // L: 43

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lur;B)V",
		garbageValue = "-4"
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lur;IB)V",
		garbageValue = "0"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 64
			this.fontId = var1.method9436();
		} else if (var2 == 2) { // L: 65
			this.textColor = var1.readMedium();
		} else if (var2 == 3) { // L: 66
			this.field2228 = var1.method9436();
		} else if (var2 == 4) { // L: 67
			this.field2236 = var1.method9436();
		} else if (var2 == 5) { // L: 68
			this.field2239 = var1.method9436();
		} else if (var2 == 6) { // L: 69
			this.field2231 = var1.method9436();
		} else if (var2 == 7) { // L: 70
			this.field2232 = var1.readShort();
		} else if (var2 == 8) { // L: 71
			this.field2230 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) { // L: 72
			this.field2227 = var1.readUnsignedShort();
		} else if (var2 == 10) { // L: 73
			this.field2233 = var1.readShort();
		} else if (var2 == 11) { // L: 74
			this.field2234 = 0;
		} else if (var2 == 12) { // L: 75
			this.field2229 = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 76
			this.field2237 = var1.readShort();
		} else if (var2 == 14) { // L: 77
			this.field2234 = var1.readUnsignedShort();
		} else if (var2 == 17 || var2 == 18) { // L: 78
			this.transformVarbit = var1.readUnsignedShort(); // L: 79
			if (this.transformVarbit == 65535) {
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort();
			if (this.transformVarp == 65535) {
				this.transformVarp = -1;
			}

			int var3 = -1;
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lio;",
		garbageValue = "-1692863694"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1; // L: 100
		if (this.transformVarbit != -1) { // L: 101
			var1 = SpotAnimationDefinition.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 102
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 104
			var2 = this.transforms[var1]; // L: 105
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class193.method3723(var2) : null; // L: 106 107
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "116"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2230; // L: 111

		while (true) {
			int var3 = var2.indexOf("%1"); // L: 113
			if (var3 < 0) { // L: 114
				return var2; // L: 117
			}

			var2 = var2.substring(0, var3) + UrlRequest.intToString(var1, false) + var2.substring(var3 + 2); // L: 115
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lvg;",
		garbageValue = "349330862"
	)
	public SpritePixels method4048() {
		if (this.field2228 < 0) { // L: 121
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2228); // L: 122
			if (var1 != null) {
				return var1; // L: 123
			} else {
				var1 = GraphicsObject.SpriteBuffer_getSprite(field2219, this.field2228, 0); // L: 124
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2228); // L: 125
				}

				return var1; // L: 127
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Lvg;",
		garbageValue = "55"
	)
	public SpritePixels method4049() {
		if (this.field2239 < 0) { // L: 131
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2239); // L: 132
			if (var1 != null) {
				return var1; // L: 133
			} else {
				var1 = GraphicsObject.SpriteBuffer_getSprite(field2219, this.field2239, 0); // L: 134
				if (var1 != null) { // L: 135
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2239);
				}

				return var1; // L: 137
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lvg;",
		garbageValue = "279658060"
	)
	public SpritePixels method4050() {
		if (this.field2236 < 0) { // L: 141
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2236); // L: 142
			if (var1 != null) {
				return var1; // L: 143
			} else {
				var1 = GraphicsObject.SpriteBuffer_getSprite(field2219, this.field2236, 0); // L: 144
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2236); // L: 145
				}

				return var1; // L: 147
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Lvg;",
		garbageValue = "-113"
	)
	public SpritePixels method4062() {
		if (this.field2231 < 0) { // L: 151
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2231); // L: 152
			if (var1 != null) {
				return var1; // L: 153
			} else {
				var1 = GraphicsObject.SpriteBuffer_getSprite(field2219, this.field2231, 0); // L: 154
				if (var1 != null) { // L: 155
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2231);
				}

				return var1; // L: 157
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lpx;",
		garbageValue = "-419460677"
	)
	@Export("getFont")
	public Font getFont() {
		if (this.fontId == -1) { // L: 161
			return null;
		} else {
			Font var1 = (Font)field2224.get((long)this.fontId); // L: 162
			if (var1 != null) { // L: 163
				return var1;
			} else {
				AbstractArchive var3 = field2219; // L: 165
				AbstractArchive var4 = HitSplatDefinition_fontsArchive; // L: 166
				int var5 = this.fontId; // L: 167
				byte[] var7 = var3.takeFile(var5, 0); // L: 171
				boolean var6;
				if (var7 == null) { // L: 172
					var6 = false; // L: 173
				} else {
					class483.SpriteBuffer_decode(var7); // L: 176
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
						Font var9 = new Font(var8, class549.SpriteBuffer_xOffsets, class549.SpriteBuffer_yOffsets, class549.SpriteBuffer_spriteWidths, Ignored.SpriteBuffer_spriteHeights, class126.SpriteBuffer_spritePalette, class549.SpriteBuffer_pixels); // L: 190
						class549.SpriteBuffer_xOffsets = null; // L: 192
						class549.SpriteBuffer_yOffsets = null; // L: 193
						class549.SpriteBuffer_spriteWidths = null; // L: 194
						Ignored.SpriteBuffer_spriteHeights = null; // L: 195
						class126.SpriteBuffer_spritePalette = null; // L: 196
						class549.SpriteBuffer_pixels = null; // L: 197
						var10 = var9; // L: 199
					}

					var2 = var10; // L: 201
				}

				if (var2 != null) { // L: 204
					field2224.put(var2, (long)this.fontId);
				}

				return var2; // L: 206
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I[III)V",
		garbageValue = "1490347660"
	)
	static void method4073(int var0, int[] var1, int var2) {
		for (int var3 = 0; var3 < class12.field56; ++var3) { // L: 80
			KitDefinition var4 = class195.KitDefinition_get(var3); // L: 81
			if (var4 != null && !var4.nonSelectable && var2 + (var0 == 1 ? 7 : 0) == var4.bodypartID) { // L: 82
				var1[PlayerComposition.equipmentIndices[var2]] = var3 + 256; // L: 83
				break;
			}
		}

	} // L: 87
}
