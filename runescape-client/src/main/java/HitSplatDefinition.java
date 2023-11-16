import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	public static AbstractArchive field2050;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	static EvictingDualNodeHashTable field2053;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	static EvictingDualNodeHashTable field2054;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 976151247
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1743315735
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -588348767
	)
	public int field2060;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1514441611
	)
	int field2055;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 2123745659
	)
	int field2062;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2126217029
	)
	int field2068;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -304053011
	)
	int field2051;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1185623987
	)
	public int field2065;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1565454663
	)
	public int field2066;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 470265929
	)
	public int field2067;
	@ObfuscatedName("ae")
	String field2049;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1788778699
	)
	public int field2069;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1920832461
	)
	public int field2059;
	@ObfuscatedName("ad")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 831582419
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 804469185
	)
	@Export("transformVarp")
	int transformVarp;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64);
		field2053 = new EvictingDualNodeHashTable(64);
		field2054 = new EvictingDualNodeHashTable(20);
	}

	HitSplatDefinition() {
		this.fontId = -1;
		this.textColor = 16777215;
		this.field2060 = 70;
		this.field2055 = -1;
		this.field2062 = -1;
		this.field2068 = -1;
		this.field2051 = -1;
		this.field2065 = 0; // L: 33
		this.field2066 = 0;
		this.field2067 = -1; // L: 35
		this.field2049 = "";
		this.field2069 = -1;
		this.field2059 = 0;
		this.transformVarbit = -1; // L: 40
		this.transformVarp = -1; // L: 41
	} // L: 43

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Luj;B)V",
		garbageValue = "76"
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
		descriptor = "(Luj;IB)V",
		garbageValue = "-1"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 64
			this.fontId = var1.method9280();
		} else if (var2 == 2) { // L: 65
			this.textColor = var1.readMedium();
		} else if (var2 == 3) { // L: 66
			this.field2055 = var1.method9280();
		} else if (var2 == 4) { // L: 67
			this.field2068 = var1.method9280();
		} else if (var2 == 5) { // L: 68
			this.field2062 = var1.method9280();
		} else if (var2 == 6) { // L: 69
			this.field2051 = var1.method9280();
		} else if (var2 == 7) { // L: 70
			this.field2065 = var1.readShort();
		} else if (var2 == 8) { // L: 71
			this.field2049 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) { // L: 72
			this.field2060 = var1.readUnsignedShort();
		} else if (var2 == 10) { // L: 73
			this.field2066 = var1.readShort();
		} else if (var2 == 11) { // L: 74
			this.field2067 = 0;
		} else if (var2 == 12) { // L: 75
			this.field2069 = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 76
			this.field2059 = var1.readShort();
		} else if (var2 == 14) {
			this.field2067 = var1.readUnsignedShort(); // L: 77
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Lhz;",
		garbageValue = "14"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1; // L: 100
		if (this.transformVarbit != -1) { // L: 101
			var1 = HealthBar.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 102
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 104
			var2 = this.transforms[var1]; // L: 105
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class149.method3275(var2) : null; // L: 106 107
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IS)Ljava/lang/String;",
		garbageValue = "184"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2049; // L: 111

		while (true) {
			int var3 = var2.indexOf("%1"); // L: 113
			if (var3 < 0) { // L: 114
				return var2; // L: 117
			}

			var2 = var2.substring(0, var3) + SceneTilePaint.intToString(var1, false) + var2.substring(var3 + 2); // L: 115
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Luz;",
		garbageValue = "87"
	)
	public SpritePixels method3860() {
		if (this.field2055 < 0) { // L: 121
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field2053.get((long)this.field2055); // L: 122
			if (var1 != null) { // L: 123
				return var1;
			} else {
				var1 = IgnoreList.SpriteBuffer_getSprite(field2050, this.field2055, 0); // L: 124
				if (var1 != null) { // L: 125
					field2053.put(var1, (long)this.field2055);
				}

				return var1; // L: 127
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Luz;",
		garbageValue = "-1829294182"
	)
	public SpritePixels method3856() {
		if (this.field2062 < 0) { // L: 131
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field2053.get((long)this.field2062); // L: 132
			if (var1 != null) { // L: 133
				return var1;
			} else {
				var1 = IgnoreList.SpriteBuffer_getSprite(field2050, this.field2062, 0); // L: 134
				if (var1 != null) { // L: 135
					field2053.put(var1, (long)this.field2062);
				}

				return var1; // L: 137
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Luz;",
		garbageValue = "40"
	)
	public SpritePixels method3857() {
		if (this.field2068 < 0) { // L: 141
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field2053.get((long)this.field2068); // L: 142
			if (var1 != null) {
				return var1; // L: 143
			} else {
				var1 = IgnoreList.SpriteBuffer_getSprite(field2050, this.field2068, 0); // L: 144
				if (var1 != null) { // L: 145
					field2053.put(var1, (long)this.field2068);
				}

				return var1; // L: 147
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Luz;",
		garbageValue = "-1809532978"
	)
	public SpritePixels method3865() {
		if (this.field2051 < 0) { // L: 151
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field2053.get((long)this.field2051); // L: 152
			if (var1 != null) {
				return var1; // L: 153
			} else {
				var1 = IgnoreList.SpriteBuffer_getSprite(field2050, this.field2051, 0); // L: 154
				if (var1 != null) {
					field2053.put(var1, (long)this.field2051); // L: 155
				}

				return var1; // L: 157
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lpf;",
		garbageValue = "1266357542"
	)
	@Export("getFont")
	public Font getFont() {
		if (this.fontId == -1) { // L: 161
			return null;
		} else {
			Font var1 = (Font)field2054.get((long)this.fontId); // L: 162
			if (var1 != null) { // L: 163
				return var1;
			} else {
				AbstractArchive var3 = field2050; // L: 165
				AbstractArchive var4 = HitSplatDefinition_fontsArchive; // L: 166
				int var5 = this.fontId; // L: 167
				byte[] var7 = var3.takeFile(var5, 0); // L: 171
				boolean var6;
				if (var7 == null) { // L: 172
					var6 = false; // L: 173
				} else {
					class162.SpriteBuffer_decode(var7); // L: 176
					var6 = true; // L: 177
				}

				Font var2;
				if (!var6) { // L: 179
					var2 = null; // L: 180
				} else {
					var2 = WorldMapArea.method4590(var4.takeFile(var5, 0)); // L: 183
				}

				if (var2 != null) { // L: 186
					field2054.put(var2, (long)this.fontId);
				}

				return var2; // L: 188
			}
		}
	}

	@ObfuscatedName("at")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) { // L: 16
			if (var0 % 37L == 0L) { // L: 17
				return null;
			} else {
				int var2 = 0; // L: 18

				for (long var3 = var0; var3 != 0L; var3 /= 37L) { // L: 19 20 22
					++var2; // L: 21
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) { // L: 24 25 34
					long var6 = var0; // L: 26
					var0 /= 37L; // L: 27
					var8 = class400.base37Table[(int)(var6 - var0 * 37L)]; // L: 28
					if (var8 == '_') { // L: 29
						int var9 = var5.length() - 1; // L: 30
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9))); // L: 31
						var8 = 160; // L: 32
					}
				}

				var5.reverse(); // L: 36
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0))); // L: 37
				return var5.toString(); // L: 38
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2098653411"
	)
	public static void method3858() {
		KitDefinition.KitDefinition_cached.clear(); // L: 138
	} // L: 139

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lnn;I)Ljava/lang/String;",
		garbageValue = "1194307940"
	)
	static String method3864(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) { // L: 11132
			for (int var2 = 1; var2 <= 5; ++var2) { // L: 11133
				while (true) {
					int var3 = var0.indexOf("%" + var2); // L: 11135
					if (var3 == -1) { // L: 11136
						break;
					}

					String var4 = var0.substring(0, var3); // L: 11137
					int var6 = UserComparator4.method2942(var1, var2 - 1); // L: 11139
					String var5;
					if (var6 < 999999999) { // L: 11141
						var5 = Integer.toString(var6); // L: 11142
					} else {
						var5 = "*"; // L: 11145
					}

					var0 = var4 + var5 + var0.substring(var3 + 2); // L: 11147
				}
			}
		}

		return var0; // L: 11151
	}
}
