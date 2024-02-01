import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static EvictingDualNodeHashTable field2078;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static EvictingDualNodeHashTable field2076;
	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1673888759
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1653840161
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1700689837
	)
	public int field2069;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 557001285
	)
	int field2077;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 592905727
	)
	int field2070;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1605107977
	)
	int field2079;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -655035943
	)
	int field2080;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1939700811
	)
	public int field2081;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1755108669
	)
	public int field2089;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2132813117
	)
	public int field2083;
	@ObfuscatedName("ah")
	String field2084;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1693287957
	)
	public int field2071;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1308115619
	)
	public int field2086;
	@ObfuscatedName("al")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 599341453
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1673135647
	)
	@Export("transformVarp")
	int transformVarp;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64); // L: 18
		field2078 = new EvictingDualNodeHashTable(64); // L: 19
		field2076 = new EvictingDualNodeHashTable(20); // L: 20
	}

	HitSplatDefinition() {
		this.fontId = -1; // L: 26
		this.textColor = 16777215; // L: 27
		this.field2069 = 70; // L: 28
		this.field2077 = -1; // L: 29
		this.field2070 = -1; // L: 30
		this.field2079 = -1; // L: 31
		this.field2080 = -1; // L: 32
		this.field2081 = 0; // L: 33
		this.field2089 = 0; // L: 34
		this.field2083 = -1; // L: 35
		this.field2084 = ""; // L: 36
		this.field2071 = -1; // L: 37
		this.field2086 = 0; // L: 38
		this.transformVarbit = -1; // L: 40
		this.transformVarp = -1; // L: 41
	} // L: 43

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Luk;B)V",
		garbageValue = "-10"
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
		descriptor = "(Luk;II)V",
		garbageValue = "179043462"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 64
			this.fontId = var1.method9547();
		} else if (var2 == 2) { // L: 65
			this.textColor = var1.readMedium();
		} else if (var2 == 3) { // L: 66
			this.field2077 = var1.method9547();
		} else if (var2 == 4) { // L: 67
			this.field2079 = var1.method9547();
		} else if (var2 == 5) { // L: 68
			this.field2070 = var1.method9547();
		} else if (var2 == 6) { // L: 69
			this.field2080 = var1.method9547();
		} else if (var2 == 7) { // L: 70
			this.field2081 = var1.readShort();
		} else if (var2 == 8) { // L: 71
			this.field2084 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) { // L: 72
			this.field2069 = var1.readUnsignedShort();
		} else if (var2 == 10) { // L: 73
			this.field2089 = var1.readShort();
		} else if (var2 == 11) { // L: 74
			this.field2083 = 0;
		} else if (var2 == 12) { // L: 75
			this.field2071 = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 76
			this.field2086 = var1.readShort();
		} else if (var2 == 14) { // L: 77
			this.field2083 = var1.readUnsignedShort();
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(S)Lhy;",
		garbageValue = "-31584"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1; // L: 100
		if (this.transformVarbit != -1) { // L: 101
			var1 = class59.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 102
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 104
			var2 = this.transforms[var1]; // L: 105
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class192.method3790(var2) : null; // L: 106 107
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "-54"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2084; // L: 111

		while (true) {
			int var3 = var2.indexOf("%1"); // L: 113
			if (var3 < 0) { // L: 114
				return var2; // L: 117
			}

			var2 = var2.substring(0, var3) + GrandExchangeOfferAgeComparator.intToString(var1, false) + var2.substring(var3 + 2); // L: 115
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Luc;",
		garbageValue = "-141713078"
	)
	public SpritePixels method3927() {
		if (this.field2077 < 0) { // L: 121
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field2078.get((long)this.field2077); // L: 122
			if (var1 != null) {
				return var1; // L: 123
			} else {
				var1 = class135.SpriteBuffer_getSprite(GrandExchangeOfferWorldComparator.field4417, this.field2077, 0); // L: 124
				if (var1 != null) {
					field2078.put(var1, (long)this.field2077); // L: 125
				}

				return var1; // L: 127
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Luc;",
		garbageValue = "-54"
	)
	public SpritePixels method3902() {
		if (this.field2070 < 0) { // L: 131
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field2078.get((long)this.field2070); // L: 132
			if (var1 != null) { // L: 133
				return var1;
			} else {
				var1 = class135.SpriteBuffer_getSprite(GrandExchangeOfferWorldComparator.field4417, this.field2070, 0); // L: 134
				if (var1 != null) {
					field2078.put(var1, (long)this.field2070); // L: 135
				}

				return var1; // L: 137
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Luc;",
		garbageValue = "-84"
	)
	public SpritePixels method3903() {
		if (this.field2079 < 0) { // L: 141
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field2078.get((long)this.field2079); // L: 142
			if (var1 != null) { // L: 143
				return var1;
			} else {
				var1 = class135.SpriteBuffer_getSprite(GrandExchangeOfferWorldComparator.field4417, this.field2079, 0); // L: 144
				if (var1 != null) {
					field2078.put(var1, (long)this.field2079); // L: 145
				}

				return var1; // L: 147
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Luc;",
		garbageValue = "-66"
	)
	public SpritePixels method3904() {
		if (this.field2080 < 0) { // L: 151
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field2078.get((long)this.field2080); // L: 152
			if (var1 != null) {
				return var1; // L: 153
			} else {
				var1 = class135.SpriteBuffer_getSprite(GrandExchangeOfferWorldComparator.field4417, this.field2080, 0); // L: 154
				if (var1 != null) {
					field2078.put(var1, (long)this.field2080); // L: 155
				}

				return var1; // L: 157
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lpv;",
		garbageValue = "-638036171"
	)
	@Export("getFont")
	public Font getFont() {
		if (this.fontId == -1) { // L: 161
			return null;
		} else {
			Font var1 = (Font)field2076.get((long)this.fontId); // L: 162
			if (var1 != null) { // L: 163
				return var1;
			} else {
				AbstractArchive var3 = GrandExchangeOfferWorldComparator.field4417; // L: 165
				AbstractArchive var4 = HitSplatDefinition_fontsArchive; // L: 166
				int var5 = this.fontId; // L: 167
				Font var2;
				if (!Varcs.method2829(var3, var5, 0)) { // L: 169
					var2 = null; // L: 170
				} else {
					var2 = class72.method2147(var4.takeFile(var5, 0)); // L: 173
				}

				if (var2 != null) { // L: 176
					field2076.put(var2, (long)this.fontId);
				}

				return var2; // L: 178
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Low;I)V",
		garbageValue = "-451861694"
	)
	public static void method3901(AbstractArchive var0) {
		FloorUnderlayDefinition.field2035 = var0; // L: 21
	} // L: 22
}
