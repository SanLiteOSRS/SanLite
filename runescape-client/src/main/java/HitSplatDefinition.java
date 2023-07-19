import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	public static AbstractArchive field2135;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	public static EvictingDualNodeHashTable field2129;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1898801405
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1559126991
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1149503081
	)
	public int field2150;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -326001465
	)
	int field2133;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -176134937
	)
	int field2137;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -813616207
	)
	int field2138;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1407707055
	)
	int field2139;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2008413409
	)
	public int field2140;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1176260197
	)
	public int field2141;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1890150947
	)
	public int field2142;
	@ObfuscatedName("al")
	String field2131;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 540930269
	)
	public int field2132;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1194304953
	)
	public int field2126;
	@ObfuscatedName("ak")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -352403683
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 807237593
	)
	@Export("transformVarp")
	int transformVarp;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64); // L: 18
		field2129 = new EvictingDualNodeHashTable(64); // L: 19
		HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20); // L: 20
	}

	HitSplatDefinition() {
		this.fontId = -1; // L: 26
		this.textColor = 16777215; // L: 27
		this.field2150 = 70; // L: 28
		this.field2133 = -1; // L: 29
		this.field2137 = -1; // L: 30
		this.field2138 = -1; // L: 31
		this.field2139 = -1; // L: 32
		this.field2140 = 0; // L: 33
		this.field2141 = 0; // L: 34
		this.field2142 = -1; // L: 35
		this.field2131 = ""; // L: 36
		this.field2132 = -1; // L: 37
		this.field2126 = 0; // L: 38
		this.transformVarbit = -1; // L: 40
		this.transformVarp = -1; // L: 41
	} // L: 43

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ltl;B)V",
		garbageValue = "95"
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
		descriptor = "(Ltl;IB)V",
		garbageValue = "-49"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 64
			this.fontId = var1.method9077();
		} else if (var2 == 2) { // L: 65
			this.textColor = var1.readMedium();
		} else if (var2 == 3) { // L: 66
			this.field2133 = var1.method9077();
		} else if (var2 == 4) { // L: 67
			this.field2138 = var1.method9077();
		} else if (var2 == 5) { // L: 68
			this.field2137 = var1.method9077();
		} else if (var2 == 6) { // L: 69
			this.field2139 = var1.method9077();
		} else if (var2 == 7) { // L: 70
			this.field2140 = var1.readShort();
		} else if (var2 == 8) { // L: 71
			this.field2131 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) { // L: 72
			this.field2150 = var1.readUnsignedShort();
		} else if (var2 == 10) { // L: 73
			this.field2141 = var1.readShort();
		} else if (var2 == 11) { // L: 74
			this.field2142 = 0;
		} else if (var2 == 12) { // L: 75
			this.field2132 = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 76
			this.field2126 = var1.readShort();
		} else if (var2 == 14) { // L: 77
			this.field2142 = var1.readUnsignedShort();
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lhf;",
		garbageValue = "952184804"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1; // L: 100
		if (this.transformVarbit != -1) { // L: 101
			var1 = GrandExchangeOfferOwnWorldComparator.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 102
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 104
			var2 = this.transforms[var1]; // L: 105
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class131.method3110(var2) : null; // L: 106 107
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "0"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2131; // L: 111

		while (true) {
			int var3 = var2.indexOf("%1"); // L: 113
			if (var3 < 0) { // L: 114
				return var2; // L: 117
			}

			var2 = var2.substring(0, var3) + WorldMapSection2.intToString(var1, false) + var2.substring(var3 + 2); // L: 115
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Luq;",
		garbageValue = "1"
	)
	public SpritePixels method3996() {
		if (this.field2133 < 0) { // L: 121
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field2129.get((long)this.field2133); // L: 122
			if (var1 != null) {
				return var1; // L: 123
			} else {
				var1 = LoginType.SpriteBuffer_getSprite(field2135, this.field2133, 0); // L: 124
				if (var1 != null) { // L: 125
					field2129.put(var1, (long)this.field2133);
				}

				return var1; // L: 127
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Luq;",
		garbageValue = "105"
	)
	public SpritePixels method3997() {
		if (this.field2137 < 0) { // L: 131
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field2129.get((long)this.field2137); // L: 132
			if (var1 != null) {
				return var1; // L: 133
			} else {
				var1 = LoginType.SpriteBuffer_getSprite(field2135, this.field2137, 0); // L: 134
				if (var1 != null) {
					field2129.put(var1, (long)this.field2137); // L: 135
				}

				return var1; // L: 137
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Luq;",
		garbageValue = "23"
	)
	public SpritePixels method3998() {
		if (this.field2138 < 0) { // L: 141
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field2129.get((long)this.field2138); // L: 142
			if (var1 != null) { // L: 143
				return var1;
			} else {
				var1 = LoginType.SpriteBuffer_getSprite(field2135, this.field2138, 0); // L: 144
				if (var1 != null) {
					field2129.put(var1, (long)this.field2138); // L: 145
				}

				return var1; // L: 147
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Luq;",
		garbageValue = "811682719"
	)
	public SpritePixels method4002() {
		if (this.field2139 < 0) { // L: 151
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field2129.get((long)this.field2139); // L: 152
			if (var1 != null) {
				return var1; // L: 153
			} else {
				var1 = LoginType.SpriteBuffer_getSprite(field2135, this.field2139, 0); // L: 154
				if (var1 != null) {
					field2129.put(var1, (long)this.field2139); // L: 155
				}

				return var1; // L: 157
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lpj;",
		garbageValue = "1568022864"
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
				var1 = class171.method3558(field2135, DevicePcmPlayerProvider.HitSplatDefinition_fontsArchive, this.fontId, 0); // L: 164
				if (var1 != null) {
					HitSplatDefinition_cachedFonts.put(var1, (long)this.fontId); // L: 165
				}

				return var1; // L: 167
			}
		}
	}
}
