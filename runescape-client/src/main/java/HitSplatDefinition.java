import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	public static AbstractArchive field2101;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -835052111
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1665459543
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1243299901
	)
	public int field2107;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -60122229
	)
	int field2108;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1814913713
	)
	int field2109;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1638166329
	)
	int field2104;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -285634307
	)
	int field2111;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1031873387
	)
	public int field2112;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 250642051
	)
	public int field2122;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -891854567
	)
	public int field2114;
	@ObfuscatedName("ai")
	String field2115;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 980825829
	)
	public int field2116;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1938875509
	)
	public int field2106;
	@ObfuscatedName("ah")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1720772527
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1905615485
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
		this.field2107 = 70; // L: 28
		this.field2108 = -1; // L: 29
		this.field2109 = -1; // L: 30
		this.field2104 = -1; // L: 31
		this.field2111 = -1; // L: 32
		this.field2112 = 0; // L: 33
		this.field2122 = 0; // L: 34
		this.field2114 = -1; // L: 35
		this.field2115 = ""; // L: 36
		this.field2116 = -1; // L: 37
		this.field2106 = 0; // L: 38
		this.transformVarbit = -1; // L: 40
		this.transformVarp = -1; // L: 41
	} // L: 43

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lsy;S)V",
		garbageValue = "26153"
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsy;IB)V",
		garbageValue = "-46"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 64
			this.fontId = var1.method8638();
		} else if (var2 == 2) { // L: 65
			this.textColor = var1.readMedium();
		} else if (var2 == 3) { // L: 66
			this.field2108 = var1.method8638();
		} else if (var2 == 4) { // L: 67
			this.field2104 = var1.method8638();
		} else if (var2 == 5) { // L: 68
			this.field2109 = var1.method8638();
		} else if (var2 == 6) { // L: 69
			this.field2111 = var1.method8638();
		} else if (var2 == 7) { // L: 70
			this.field2112 = var1.readShort();
		} else if (var2 == 8) { // L: 71
			this.field2115 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) { // L: 72
			this.field2107 = var1.readUnsignedShort();
		} else if (var2 == 10) { // L: 73
			this.field2122 = var1.readShort();
		} else if (var2 == 11) { // L: 74
			this.field2114 = 0;
		} else if (var2 == 12) { // L: 75
			this.field2116 = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 76
			this.field2106 = var1.readShort();
		} else if (var2 == 14) {
			this.field2114 = var1.readUnsignedShort(); // L: 77
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lhf;",
		garbageValue = "-1139535160"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1; // L: 100
		if (this.transformVarbit != -1) { // L: 101
			var1 = class17.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 102
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 104
			var2 = this.transforms[var1]; // L: 105
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class191.method3664(var2) : null; // L: 106 107
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "87"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2115; // L: 111

		while (true) {
			int var3 = var2.indexOf("%1"); // L: 113
			if (var3 < 0) { // L: 114
				return var2; // L: 117
			}

			var2 = var2.substring(0, var3) + class393.intToString(var1, false) + var2.substring(var3 + 2); // L: 115
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lsn;",
		garbageValue = "-522182464"
	)
	public SpritePixels method3853() {
		if (this.field2108 < 0) { // L: 121
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2108); // L: 122
			if (var1 != null) {
				return var1; // L: 123
			} else {
				var1 = WorldMapScaleHandler.SpriteBuffer_getSprite(field2101, this.field2108, 0); // L: 124
				if (var1 != null) { // L: 125
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2108);
				}

				return var1; // L: 127
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Lsn;",
		garbageValue = "-1592628135"
	)
	public SpritePixels method3833() {
		if (this.field2109 < 0) { // L: 131
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2109); // L: 132
			if (var1 != null) { // L: 133
				return var1;
			} else {
				var1 = WorldMapScaleHandler.SpriteBuffer_getSprite(field2101, this.field2109, 0); // L: 134
				if (var1 != null) { // L: 135
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2109);
				}

				return var1; // L: 137
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Lsn;",
		garbageValue = "146201023"
	)
	public SpritePixels method3828() {
		if (this.field2104 < 0) { // L: 141
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2104); // L: 142
			if (var1 != null) {
				return var1; // L: 143
			} else {
				var1 = WorldMapScaleHandler.SpriteBuffer_getSprite(field2101, this.field2104, 0); // L: 144
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2104); // L: 145
				}

				return var1; // L: 147
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Lsn;",
		garbageValue = "-30"
	)
	public SpritePixels method3829() {
		if (this.field2111 < 0) { // L: 151
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2111); // L: 152
			if (var1 != null) {
				return var1; // L: 153
			} else {
				var1 = WorldMapScaleHandler.SpriteBuffer_getSprite(field2101, this.field2111, 0); // L: 154
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2111); // L: 155
				}

				return var1; // L: 157
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Loe;",
		garbageValue = "2030805519"
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
				AbstractArchive var3 = field2101; // L: 165
				AbstractArchive var4 = SecureRandomFuture.HitSplatDefinition_fontsArchive; // L: 166
				int var5 = this.fontId; // L: 167
				byte[] var7 = var3.takeFile(var5, 0); // L: 171
				boolean var6;
				if (var7 == null) { // L: 172
					var6 = false; // L: 173
				} else {
					class212.SpriteBuffer_decode(var7); // L: 176
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
						Font var9 = new Font(var8, class492.SpriteBuffer_xOffsets, Canvas.SpriteBuffer_yOffsets, InterfaceParent.SpriteBuffer_spriteWidths, class144.SpriteBuffer_spriteHeights, class181.SpriteBuffer_spritePalette, class144.SpriteBuffer_pixels); // L: 190
						FriendsList.method7473(); // L: 191
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-28"
	)
	public static int method3856(int var0, int var1) {
		return (int)(Math.atan2((double)var0, (double)var1) * 325.94932345220167D) & 2047; // L: 11
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "36"
	)
	static final int method3854() {
		return ViewportMouse.ViewportMouse_x; // L: 103
	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(Lmy;IIII)V",
		garbageValue = "-626091022"
	)
	@Export("drawCompass")
	static final void drawCompass(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.getSpriteMask(false); // L: 11929
		if (var4 != null) { // L: 11930
			if (Client.minimapState < 3) { // L: 11931
				class149.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 11932
			}

		}
	} // L: 11933
}
