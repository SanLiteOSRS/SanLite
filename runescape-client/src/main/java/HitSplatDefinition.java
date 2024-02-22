import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hi")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	static EvictingDualNodeHashTable field2088;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1389523943
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1495121389
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 164290565
	)
	public int field2092;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1945997287
	)
	int field2093;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -515149013
	)
	int field2101;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 43163485
	)
	int field2095;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 575268709
	)
	int field2091;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1379000083
	)
	public int field2100;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1488620997
	)
	public int field2098;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -713617535
	)
	public int field2099;
	@ObfuscatedName("ae")
	String field2094;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2106251763
	)
	public int field2084;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1528397051
	)
	public int field2090;
	@ObfuscatedName("av")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -2100411401
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -71327981
	)
	@Export("transformVarp")
	int transformVarp;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64); // L: 18
		HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64); // L: 19
		field2088 = new EvictingDualNodeHashTable(20); // L: 20
	}

	HitSplatDefinition() {
		this.fontId = -1; // L: 26
		this.textColor = 16777215; // L: 27
		this.field2092 = 70; // L: 28
		this.field2093 = -1; // L: 29
		this.field2101 = -1; // L: 30
		this.field2095 = -1; // L: 31
		this.field2091 = -1; // L: 32
		this.field2100 = 0; // L: 33
		this.field2098 = 0; // L: 34
		this.field2099 = -1; // L: 35
		this.field2094 = ""; // L: 36
		this.field2084 = -1; // L: 37
		this.field2090 = 0; // L: 38
		this.transformVarbit = -1; // L: 40
		this.transformVarp = -1; // L: 41
	} // L: 43

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "-1154428416"
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luq;IB)V",
		garbageValue = "-60"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 64
			this.fontId = var1.method9693();
		} else if (var2 == 2) { // L: 65
			this.textColor = var1.readMedium();
		} else if (var2 == 3) { // L: 66
			this.field2093 = var1.method9693();
		} else if (var2 == 4) { // L: 67
			this.field2095 = var1.method9693();
		} else if (var2 == 5) { // L: 68
			this.field2101 = var1.method9693();
		} else if (var2 == 6) { // L: 69
			this.field2091 = var1.method9693();
		} else if (var2 == 7) { // L: 70
			this.field2100 = var1.readShort();
		} else if (var2 == 8) { // L: 71
			this.field2094 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) { // L: 72
			this.field2092 = var1.readUnsignedShort();
		} else if (var2 == 10) { // L: 73
			this.field2098 = var1.readShort();
		} else if (var2 == 11) { // L: 74
			this.field2099 = 0;
		} else if (var2 == 12) { // L: 75
			this.field2084 = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 76
			this.field2090 = var1.readShort();
		} else if (var2 == 14) {
			this.field2099 = var1.readUnsignedShort(); // L: 77
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Lhi;",
		garbageValue = "-595200334"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1; // L: 100
		if (this.transformVarbit != -1) { // L: 101
			var1 = class332.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 102
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 104
			var2 = this.transforms[var1]; // L: 105
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? Language.method7357(var2) : null; // L: 106 107
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-888520122"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2094; // L: 111

		while (true) {
			int var3 = var2.indexOf("%1"); // L: 113
			if (var3 < 0) { // L: 114
				return var2; // L: 117
			}

			var2 = var2.substring(0, var3) + WorldMapData_1.intToString(var1, false) + var2.substring(var3 + 2); // L: 115
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lvd;",
		garbageValue = "246967295"
	)
	public SpritePixels method3914() {
		if (this.field2093 < 0) { // L: 121
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2093); // L: 122
			if (var1 != null) { // L: 123
				return var1;
			} else {
				var1 = FileSystem.SpriteBuffer_getSprite(class17.field81, this.field2093, 0); // L: 124
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2093); // L: 125
				}

				return var1; // L: 127
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lvd;",
		garbageValue = "-1401368236"
	)
	public SpritePixels method3884() {
		if (this.field2101 < 0) { // L: 131
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2101); // L: 132
			if (var1 != null) {
				return var1; // L: 133
			} else {
				var1 = FileSystem.SpriteBuffer_getSprite(class17.field81, this.field2101, 0); // L: 134
				if (var1 != null) { // L: 135
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2101);
				}

				return var1; // L: 137
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lvd;",
		garbageValue = "1946262257"
	)
	public SpritePixels method3904() {
		if (this.field2095 < 0) { // L: 141
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2095); // L: 142
			if (var1 != null) { // L: 143
				return var1;
			} else {
				var1 = FileSystem.SpriteBuffer_getSprite(class17.field81, this.field2095, 0); // L: 144
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2095); // L: 145
				}

				return var1; // L: 147
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(S)Lvd;",
		garbageValue = "-10688"
	)
	public SpritePixels method3886() {
		if (this.field2091 < 0) { // L: 151
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2091); // L: 152
			if (var1 != null) { // L: 153
				return var1;
			} else {
				var1 = FileSystem.SpriteBuffer_getSprite(class17.field81, this.field2091, 0); // L: 154
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2091); // L: 155
				}

				return var1; // L: 157
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Lpb;",
		garbageValue = "-1"
	)
	@Export("getFont")
	public Font getFont() {
		if (this.fontId == -1) { // L: 161
			return null;
		} else {
			Font var1 = (Font)field2088.get((long)this.fontId); // L: 162
			if (var1 != null) { // L: 163
				return var1;
			} else {
				AbstractArchive var3 = class17.field81; // L: 165
				AbstractArchive var4 = HitSplatDefinition_fontsArchive; // L: 166
				int var5 = this.fontId; // L: 167
				Font var2;
				if (!class130.method3074(var3, var5, 0)) { // L: 169
					var2 = null; // L: 170
				} else {
					var2 = class529.method9417(var4.takeFile(var5, 0)); // L: 173
				}

				if (var2 != null) { // L: 176
					field2088.put(var2, (long)this.fontId);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "204166137"
	)
	static final void method3917(String var0) {
		PacketBufferNode var1 = ViewportMouse.getPacketBufferNode(ClientPacket.field3244, Client.packetWriter.isaacCipher); // L: 178
		var1.packetBuffer.writeByte(class145.stringCp1252NullTerminatedByteSize(var0)); // L: 179
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 180
		Client.packetWriter.addNode(var1); // L: 181
	} // L: 182
}
