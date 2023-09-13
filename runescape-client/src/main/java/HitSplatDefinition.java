import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	public static AbstractArchive field2146;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1641369831
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -353032379
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1107259027
	)
	public int field2161;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -939008145
	)
	int field2155;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1847013657
	)
	int field2156;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 469843281
	)
	int field2157;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 2023924639
	)
	int field2158;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1524117065
	)
	public int field2159;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1267425507
	)
	public int field2153;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 814951375
	)
	public int field2147;
	@ObfuscatedName("ay")
	String field2162;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1072885703
	)
	public int field2154;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1421046467
	)
	public int field2163;
	@ObfuscatedName("aw")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1813030183
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1293075215
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
		this.field2161 = 70; // L: 28
		this.field2155 = -1; // L: 29
		this.field2156 = -1; // L: 30
		this.field2157 = -1; // L: 31
		this.field2158 = -1; // L: 32
		this.field2159 = 0;
		this.field2153 = 0;
		this.field2147 = -1;
		this.field2162 = "";
		this.field2154 = -1;
		this.field2163 = 0;
		this.transformVarbit = -1; // L: 40
		this.transformVarp = -1; // L: 41
	} // L: 43

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ltm;B)V",
		garbageValue = "-96"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ltm;IB)V",
		garbageValue = "-17"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 64
			this.fontId = var1.method9198();
		} else if (var2 == 2) { // L: 65
			this.textColor = var1.readMedium();
		} else if (var2 == 3) { // L: 66
			this.field2155 = var1.method9198();
		} else if (var2 == 4) { // L: 67
			this.field2157 = var1.method9198();
		} else if (var2 == 5) { // L: 68
			this.field2156 = var1.method9198();
		} else if (var2 == 6) { // L: 69
			this.field2158 = var1.method9198();
		} else if (var2 == 7) { // L: 70
			this.field2159 = var1.readShort();
		} else if (var2 == 8) { // L: 71
			this.field2162 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) { // L: 72
			this.field2161 = var1.readUnsignedShort();
		} else if (var2 == 10) { // L: 73
			this.field2153 = var1.readShort();
		} else if (var2 == 11) { // L: 74
			this.field2147 = 0;
		} else if (var2 == 12) { // L: 75
			this.field2154 = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 76
			this.field2163 = var1.readShort();
		} else if (var2 == 14) {
			this.field2147 = var1.readUnsignedShort(); // L: 77
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

			this.transforms[var4 + 1] = var3;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lhm;",
		garbageValue = "-478851441"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = ClientPreferences.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? WorldMapCacheName.method5560(var2) : null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "85"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2162;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2; // L: 117
			}

			var2 = var2.substring(0, var3) + class60.intToString(var1, false) + var2.substring(var3 + 2); // L: 115
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Lui;",
		garbageValue = "2088271438"
	)
	public SpritePixels method3850() {
		if (this.field2155 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2155);
			if (var1 != null) {
				return var1;
			} else {
				var1 = Tiles.SpriteBuffer_getSprite(field2146, this.field2155, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2155);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lui;",
		garbageValue = "1718225131"
	)
	public SpritePixels method3846() {
		if (this.field2156 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2156); // L: 132
			if (var1 != null) {
				return var1; // L: 133
			} else {
				var1 = Tiles.SpriteBuffer_getSprite(field2146, this.field2156, 0); // L: 134
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2156); // L: 135
				}

				return var1; // L: 137
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lui;",
		garbageValue = "-816789070"
	)
	public SpritePixels method3852() {
		if (this.field2157 < 0) { // L: 141
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2157); // L: 142
			if (var1 != null) {
				return var1; // L: 143
			} else {
				var1 = Tiles.SpriteBuffer_getSprite(field2146, this.field2157, 0); // L: 144
				if (var1 != null) { // L: 145
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2157);
				}

				return var1; // L: 147
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Lui;",
		garbageValue = "3"
	)
	public SpritePixels method3853() {
		if (this.field2158 < 0) { // L: 151
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2158); // L: 152
			if (var1 != null) { // L: 153
				return var1;
			} else {
				var1 = Tiles.SpriteBuffer_getSprite(field2146, this.field2158, 0); // L: 154
				if (var1 != null) { // L: 155
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2158);
				}

				return var1; // L: 157
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lpi;",
		garbageValue = "1628284483"
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
				var1 = LoginPacket.method5712(field2146, HitSplatDefinition_fontsArchive, this.fontId, 0); // L: 164
				if (var1 != null) {
					HitSplatDefinition_cachedFonts.put(var1, (long)this.fontId); // L: 165
				}

				return var1; // L: 167
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "731414958"
	)
	static int method3887(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 33
			var1 /= 2;
		}

		if (var2 > 192) { // L: 34
			var1 /= 2;
		}

		if (var2 > 217) { // L: 35
			var1 /= 2;
		}

		if (var2 > 243) { // L: 36
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 37
		return var3; // L: 38
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([BB)Ldh;",
		garbageValue = "10"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script(); // L: 93
		Buffer var2 = new Buffer(var0); // L: 94
		var2.offset = var2.array.length - 2; // L: 95
		int var3 = var2.readUnsignedShort(); // L: 96
		int var4 = var2.array.length - 2 - var3 - 12; // L: 97
		var2.offset = var4; // L: 98
		int var5 = var2.readInt(); // L: 99
		var1.localIntCount = var2.readUnsignedShort(); // L: 100
		var1.localStringCount = var2.readUnsignedShort(); // L: 101
		var1.intArgumentCount = var2.readUnsignedShort(); // L: 102
		var1.stringArgumentCount = var2.readUnsignedShort(); // L: 103
		int var6 = var2.readUnsignedByte(); // L: 104
		int var7;
		int var8;
		if (var6 > 0) { // L: 105
			var1.switches = var1.newIterableNodeHashTable(var6); // L: 106

			for (var7 = 0; var7 < var6; ++var7) { // L: 107
				var8 = var2.readUnsignedShort(); // L: 108
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? WorldMapIcon_1.method5088(var8) : 1); // L: 109
				var1.switches[var7] = var9; // L: 110

				while (var8-- > 0) { // L: 111
					int var10 = var2.readInt(); // L: 112
					int var11 = var2.readInt(); // L: 113
					var9.put(new IntegerNode(var11), (long)var10); // L: 114
				}
			}
		}

		var2.offset = 0; // L: 118
		var1.field1014 = var2.readStringCp1252NullTerminatedOrNull(); // L: 119
		var1.opcodes = new int[var5]; // L: 120
		var1.intOperands = new int[var5]; // L: 121
		var1.stringOperands = new String[var5]; // L: 122

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) { // L: 123 124 129
			var8 = var2.readUnsignedShort(); // L: 125
			if (var8 == 3) { // L: 126
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt(); // L: 127
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte(); // L: 128
			}
		}

		return var1; // L: 131
	}
}
