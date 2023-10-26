import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("NpcDefinition_archive")
	public static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	public static AbstractArchive field2085;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("NpcDefinition_cached")
	static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 849514739
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ar")
	@Export("name")
	public String name;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 336907057
	)
	@Export("size")
	public int size;
	@ObfuscatedName("am")
	@Export("models")
	int[] models;
	@ObfuscatedName("av")
	int[] field2053;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -771436155
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -683029639
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 53136165
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1652208225
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -601680513
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 407029447
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1457167705
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1220844931
	)
	public int field2059;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1929114687
	)
	public int field2060;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1555933215
	)
	public int field2061;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -2140161505
	)
	public int field2088;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 578435175
	)
	public int field2063;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 279963805
	)
	public int field2064;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -2021467469
	)
	public int field2065;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 999682433
	)
	public int field2074;
	@ObfuscatedName("ad")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("bn")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("bk")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("by")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("bd")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("be")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1597602147
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -137869179
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1670534557
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("bb")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 2015472055
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -235295965
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1112913073
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("bm")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 574355089
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1345003587
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("bc")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("bu")
	@Export("isClickable")
	public boolean isClickable;
	@ObfuscatedName("bf")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("bh")
	int[] field2086;
	@ObfuscatedName("bl")
	short[] field2087;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Ltp;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		NpcDefinition_cached = new EvictingDualNodeHashTable(64); // L: 19
		HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(50); // L: 20
	}

	NPCComposition() {
		this.name = "null"; // L: 22
		this.size = 1; // L: 23
		this.idleSequence = -1; // L: 26
		this.turnLeftSequence = -1; // L: 27
		this.turnRightSequence = -1; // L: 28
		this.walkSequence = -1; // L: 29
		this.walkBackSequence = -1; // L: 30
		this.walkLeftSequence = -1; // L: 31
		this.walkRightSequence = -1; // L: 32
		this.field2059 = -1; // L: 33
		this.field2060 = -1; // L: 34
		this.field2061 = -1; // L: 35
		this.field2088 = -1; // L: 36
		this.field2063 = -1; // L: 37
		this.field2064 = -1; // L: 38
		this.field2065 = -1; // L: 39
		this.field2074 = -1; // L: 40
		this.actions = new String[5]; // L: 45
		this.drawMapDot = true; // L: 46
		this.combatLevel = -1; // L: 47
		this.widthScale = 128; // L: 48
		this.heightScale = 128; // L: 49
		this.isVisible = false; // L: 50
		this.ambient = 0; // L: 51
		this.contrast = 0; // L: 52
		this.rotation = 32; // L: 53
		this.transformVarbit = -1; // L: 55
		this.transformVarp = -1; // L: 56
		this.isInteractable = true; // L: 57
		this.isClickable = true; // L: 58
		this.isFollower = false; // L: 59
		this.field2086 = null; // L: 60
		this.field2087 = null; // L: 61
	} // L: 64

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 78

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lul;B)V",
		garbageValue = "2"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 82
			if (var2 == 0) { // L: 83
				return; // L: 86
			}

			this.decodeNext(var1, var2); // L: 84
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lul;IB)V",
		garbageValue = "0"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) { // L: 89
			var3 = var1.readUnsignedByte(); // L: 90
			this.models = new int[var3]; // L: 91

			for (var4 = 0; var4 < var3; ++var4) { // L: 92
				this.models[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 2) { // L: 94
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 12) { // L: 95
			this.size = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 96
			this.idleSequence = var1.readUnsignedShort();
		} else if (var2 == 14) { // L: 97
			this.walkSequence = var1.readUnsignedShort();
		} else if (var2 == 15) { // L: 98
			this.turnLeftSequence = var1.readUnsignedShort();
		} else if (var2 == 16) { // L: 99
			this.turnRightSequence = var1.readUnsignedShort();
		} else if (var2 == 17) { // L: 100
			this.walkSequence = var1.readUnsignedShort(); // L: 101
			this.walkBackSequence = var1.readUnsignedShort(); // L: 102
			this.walkLeftSequence = var1.readUnsignedShort(); // L: 103
			this.walkRightSequence = var1.readUnsignedShort(); // L: 104
		} else if (var2 == 18) { // L: 106
			var1.readUnsignedShort(); // L: 107
		} else if (var2 >= 30 && var2 < 35) { // L: 109
			this.actions[var2 - 30] = var1.readStringCp1252NullTerminated(); // L: 110
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) { // L: 111
				this.actions[var2 - 30] = null;
			}
		} else if (var2 == 40) { // L: 113
			var3 = var1.readUnsignedByte(); // L: 114
			this.recolorFrom = new short[var3]; // L: 115
			this.recolorTo = new short[var3]; // L: 116

			for (var4 = 0; var4 < var3; ++var4) { // L: 117
				this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 118
				this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 119
			}
		} else if (var2 == 41) { // L: 122
			var3 = var1.readUnsignedByte(); // L: 123
			this.retextureFrom = new short[var3]; // L: 124
			this.retextureTo = new short[var3]; // L: 125

			for (var4 = 0; var4 < var3; ++var4) { // L: 126
				this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 127
				this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 128
			}
		} else if (var2 == 60) { // L: 131
			var3 = var1.readUnsignedByte(); // L: 132
			this.field2053 = new int[var3]; // L: 133

			for (var4 = 0; var4 < var3; ++var4) { // L: 134
				this.field2053[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 93) { // L: 136
			this.drawMapDot = false;
		} else if (var2 == 95) { // L: 137
			this.combatLevel = var1.readUnsignedShort();
		} else if (var2 == 97) { // L: 138
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 98) { // L: 139
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 99) { // L: 140
			this.isVisible = true;
		} else if (var2 == 100) { // L: 141
			this.ambient = var1.readByte();
		} else if (var2 == 101) { // L: 142
			this.contrast = var1.readByte() * 5;
		} else {
			int var5;
			if (var2 == 102) { // L: 143
				var3 = var1.readUnsignedByte(); // L: 144
				var4 = 0; // L: 145

				for (var5 = var3; var5 != 0; var5 >>= 1) { // L: 146 147 149
					++var4; // L: 148
				}

				this.field2086 = new int[var4]; // L: 151
				this.field2087 = new short[var4]; // L: 152

				for (int var6 = 0; var6 < var4; ++var6) { // L: 153
					if ((var3 & 1 << var6) == 0) { // L: 154
						this.field2086[var6] = -1; // L: 155
						this.field2087[var6] = -1; // L: 156
					} else {
						this.field2086[var6] = var1.method9223(); // L: 159
						this.field2087[var6] = (short)var1.method9220(); // L: 160
					}
				}
			} else if (var2 == 103) { // L: 164
				this.rotation = var1.readUnsignedShort();
			} else if (var2 != 106 && var2 != 118) { // L: 165
				if (var2 == 107) { // L: 183
					this.isInteractable = false;
				} else if (var2 == 109) { // L: 184
					this.isClickable = false;
				} else if (var2 == 111) { // L: 185
					this.isFollower = true;
				} else if (var2 == 114) { // L: 186
					this.field2059 = var1.readUnsignedShort();
				} else if (var2 == 115) { // L: 187
					this.field2059 = var1.readUnsignedShort(); // L: 188
					this.field2060 = var1.readUnsignedShort(); // L: 189
					this.field2061 = var1.readUnsignedShort(); // L: 190
					this.field2088 = var1.readUnsignedShort(); // L: 191
				} else if (var2 == 116) { // L: 193
					this.field2063 = var1.readUnsignedShort();
				} else if (var2 == 117) { // L: 194
					this.field2063 = var1.readUnsignedShort(); // L: 195
					this.field2064 = var1.readUnsignedShort(); // L: 196
					this.field2065 = var1.readUnsignedShort(); // L: 197
					this.field2074 = var1.readUnsignedShort(); // L: 198
				} else if (var2 == 249) { // L: 200
					this.params = class167.readStringIntParameters(var1, this.params);
				}
			} else {
				this.transformVarbit = var1.readUnsignedShort(); // L: 166
				if (this.transformVarbit == 65535) { // L: 167
					this.transformVarbit = -1;
				}

				this.transformVarp = var1.readUnsignedShort(); // L: 168
				if (this.transformVarp == 65535) { // L: 169
					this.transformVarp = -1;
				}

				var3 = -1; // L: 170
				if (var2 == 118) { // L: 171
					var3 = var1.readUnsignedShort(); // L: 172
					if (var3 == 65535) { // L: 173
						var3 = -1;
					}
				}

				var4 = var1.readUnsignedByte(); // L: 175
				this.transforms = new int[var4 + 2]; // L: 176

				for (var5 = 0; var5 <= var4; ++var5) { // L: 177
					this.transforms[var5] = var1.readUnsignedShort(); // L: 178
					if (this.transforms[var5] == 65535) { // L: 179
						this.transforms[var5] = -1;
					}
				}

				this.transforms[var4 + 1] = var3; // L: 181
			}
		}

	} // L: 202

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lif;ILif;ILhe;B)Ljn;",
		garbageValue = "0"
	)
	public final Model method3783(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, class204 var5) {
		if (this.transforms != null) { // L: 205
			NPCComposition var10 = this.transform(); // L: 206
			return var10 == null ? null : var10.method3783(var1, var2, var3, var4, var5); // L: 207 208 210
		} else {
			long var6 = (long)this.id; // L: 212
			if (var5 != null) { // L: 213
				var6 |= var5.field2040 << 16; // L: 214
			}

			Model var8 = (Model)HitSplatDefinition_cachedFonts.get(var6); // L: 216
			if (var8 == null) { // L: 217
				ModelData var9 = this.method3785(this.models, var5); // L: 218
				if (var9 == null) { // L: 219
					return null; // L: 220
				}

				var8 = var9.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30); // L: 222
				HitSplatDefinition_cachedFonts.put(var8, var6); // L: 223
			}

			Model var11;
			if (var1 != null && var3 != null) {
				var11 = var1.applyTransformations(var8, var2, var3, var4); // L: 226
			} else if (var1 != null) { // L: 227
				var11 = var1.transformActorModel(var8, var2);
			} else if (var3 != null) { // L: 228
				var11 = var3.transformActorModel(var8, var4);
			} else {
				var11 = var8.toSharedSequenceModel(true); // L: 229
			}

			if (this.widthScale != 128 || this.heightScale != 128) { // L: 230
				var11.scale(this.widthScale, this.heightScale, this.widthScale);
			}

			return var11; // L: 231
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lhe;I)Ljw;",
		garbageValue = "-1925302214"
	)
	public final ModelData method3784(class204 var1) {
		if (this.transforms != null) { // L: 235
			NPCComposition var2 = this.transform(); // L: 236
			return var2 == null ? null : var2.method3784(var1); // L: 237 238 240
		} else {
			return this.method3785(this.field2053, var1); // L: 242
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([ILhe;I)Ljw;",
		garbageValue = "817549267"
	)
	ModelData method3785(int[] var1, class204 var2) {
		int[] var3 = var1; // L: 246
		if (var2 != null && var2.field2037 != null) { // L: 247
			var3 = var2.field2037; // L: 248
		}

		if (var3 == null) { // L: 250
			return null; // L: 251
		} else {
			boolean var4 = false; // L: 253

			for (int var5 = 0; var5 < var3.length; ++var5) { // L: 254
				if (var3[var5] != -1 && !field2085.tryLoadFile(var3[var5], 0)) { // L: 255
					var4 = true; // L: 256
				}
			}

			if (var4) { // L: 259
				return null; // L: 260
			} else {
				ModelData[] var9 = new ModelData[var3.length]; // L: 262

				for (int var6 = 0; var6 < var3.length; ++var6) { // L: 263
					var9[var6] = ModelData.ModelData_get(field2085, var3[var6], 0); // L: 264
				}

				ModelData var10;
				if (var9.length == 1) { // L: 267
					var10 = var9[0]; // L: 268
					if (var10 == null) { // L: 269
						var10 = new ModelData(var9, var9.length); // L: 270
					}
				} else {
					var10 = new ModelData(var9, var9.length); // L: 274
				}

				short[] var7;
				int var8;
				if (this.recolorFrom != null) { // L: 276
					var7 = this.recolorTo; // L: 277
					if (var2 != null && var2.field2036 != null) { // L: 278
						var7 = var2.field2036; // L: 279
					}

					for (var8 = 0; var8 < this.recolorFrom.length; ++var8) { // L: 281
						var10.recolor(this.recolorFrom[var8], var7[var8]); // L: 282
					}
				}

				if (this.retextureFrom != null) { // L: 285
					var7 = this.retextureTo; // L: 286
					if (var2 != null && var2.field2039 != null) { // L: 287
						var7 = var2.field2039; // L: 288
					}

					for (var8 = 0; var8 < this.retextureFrom.length; ++var8) { // L: 290
						var10.retexture(this.retextureFrom[var8], var7[var8]); // L: 291
					}
				}

				return var10; // L: 294
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lhw;",
		garbageValue = "637485229"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1; // L: 298
		if (this.transformVarbit != -1) { // L: 299
			var1 = class36.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 300
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 302
			var2 = this.transforms[var1]; // L: 303
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class190.getNpcDefinition(var2) : null; // L: 304 305
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-329950655"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) { // L: 309
			return true;
		} else {
			int var1 = -1; // L: 310
			if (this.transformVarbit != -1) { // L: 311
				var1 = class36.getVarbit(this.transformVarbit);
			} else if (this.transformVarp != -1) { // L: 312
				var1 = Varps.Varps_main[this.transformVarp];
			}

			if (var1 >= 0 && var1 < this.transforms.length) { // L: 313
				return this.transforms[var1] != -1; // L: 314
			} else {
				return this.transforms[this.transforms.length - 1] != -1;
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "-28498"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return AttackOption.method2721(this.params, var1, var2); // L: 318
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-210955753"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class30.method448(this.params, var1, var2); // L: 322
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1901854799"
	)
	public boolean method3790() {
		return this.field2086 != null && this.field2087 != null; // L: 331
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "71"
	)
	public int[] method3791() {
		return this.field2086; // L: 335
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "438787459"
	)
	public int method3792(int var1) {
		return this.field2086 != null && var1 < this.field2086.length ? this.field2086[var1] : -1; // L: 339 340 342
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "1864289740"
	)
	public short[] method3802() {
		return this.field2087; // L: 346
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)S",
		garbageValue = "628204446"
	)
	public short method3794(int var1) {
		return this.field2087 != null && var1 < this.field2087.length ? this.field2087[var1] : -1; // L: 350 351 353
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1885012369"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field700 = 0L; // L: 4617
		if (var0 >= 2) { // L: 4618
			Client.isResizable = true;
		} else {
			Client.isResizable = false; // L: 4619
		}

		if (class178.getWindowedMode() == 1) { // L: 4620
			class159.client.setMaxCanvasSize(765, 503); // L: 4621
		} else {
			class159.client.setMaxCanvasSize(7680, 2160); // L: 4624
		}

		if (Client.gameState >= 25) { // L: 4626
			class517.method9051();
		}

	} // L: 4627
}
