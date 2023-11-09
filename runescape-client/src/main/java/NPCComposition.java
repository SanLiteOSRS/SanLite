import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hi")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("vd")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	static PlatformInfo field2042;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	public static AbstractArchive field1997;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("NpcDefinition_cached")
	static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("NpcDefinition_cachedModels")
	static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1522529727
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ag")
	@Export("name")
	public String name;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -497951167
	)
	@Export("size")
	public int size;
	@ObfuscatedName("av")
	@Export("models")
	int[] models;
	@ObfuscatedName("ap")
	int[] field2004;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1344848923
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -740038999
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 618248039
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1701863897
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 2045371335
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 2076787641
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1238970345
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1352211431
	)
	public int field1996;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1789544045
	)
	public int field2013;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1890594435
	)
	public int field1998;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 12002529
	)
	public int field2015;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1478538629
	)
	public int field2016;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1355856507
	)
	public int field2017;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1944282437
	)
	public int field2018;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 881727523
	)
	public int field2024;
	@ObfuscatedName("al")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("bd")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("bb")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("bn")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("ba")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("bf")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1879689607
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1568720345
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 841895959
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("bq")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -711344311
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 332204927
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1226037551
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("be")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -251536081
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1005418289
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("bu")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("bk")
	@Export("isClickable")
	public boolean isClickable;
	@ObfuscatedName("bz")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("bx")
	int[] field2039;
	@ObfuscatedName("bh")
	short[] field2040;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lsa;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		NpcDefinition_cached = new EvictingDualNodeHashTable(64); // L: 19
		NpcDefinition_cachedModels = new EvictingDualNodeHashTable(50); // L: 20
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
		this.walkRightSequence = -1;
		this.field1996 = -1;
		this.field2013 = -1;
		this.field1998 = -1;
		this.field2015 = -1;
		this.field2016 = -1;
		this.field2017 = -1;
		this.field2018 = -1;
		this.field2024 = -1; // L: 40
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
		this.field2039 = null; // L: 60
		this.field2040 = null; // L: 61
	} // L: 64

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "906627314"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 78

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "80"
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lty;II)V",
		garbageValue = "2143209883"
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
			this.field2004 = new int[var3]; // L: 133

			for (var4 = 0; var4 < var3; ++var4) { // L: 134
				this.field2004[var4] = var1.readUnsignedShort();
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
			this.contrast = var1.readByte();
		} else {
			int var5;
			if (var2 == 102) { // L: 143
				var3 = var1.readUnsignedByte(); // L: 144
				var4 = 0; // L: 145

				for (var5 = var3; var5 != 0; var5 >>= 1) { // L: 146 147 149
					++var4; // L: 148
				}

				this.field2039 = new int[var4]; // L: 151
				this.field2040 = new short[var4]; // L: 152

				for (int var6 = 0; var6 < var4; ++var6) { // L: 153
					if ((var3 & 1 << var6) == 0) { // L: 154
						this.field2039[var6] = -1; // L: 155
						this.field2040[var6] = -1; // L: 156
					} else {
						this.field2039[var6] = var1.method9152(); // L: 159
						this.field2040[var6] = (short)var1.method9261(); // L: 160
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
					this.field1996 = var1.readUnsignedShort();
				} else if (var2 == 115) { // L: 187
					this.field1996 = var1.readUnsignedShort(); // L: 188
					this.field2013 = var1.readUnsignedShort(); // L: 189
					this.field1998 = var1.readUnsignedShort(); // L: 190
					this.field2015 = var1.readUnsignedShort(); // L: 191
				} else if (var2 == 116) { // L: 193
					this.field2016 = var1.readUnsignedShort();
				} else if (var2 == 117) { // L: 194
					this.field2016 = var1.readUnsignedShort(); // L: 195
					this.field2017 = var1.readUnsignedShort(); // L: 196
					this.field2018 = var1.readUnsignedShort(); // L: 197
					this.field2024 = var1.readUnsignedShort(); // L: 198
				} else if (var2 == 249) {
					this.params = class141.readStringIntParameters(var1, this.params); // L: 200
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lig;ILig;ILhs;I)Ljo;",
		garbageValue = "1827488061"
	)
	public final Model method3704(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, class194 var5) {
		if (this.transforms != null) { // L: 205
			NPCComposition var10 = this.transform(); // L: 206
			return var10 == null ? null : var10.method3704(var1, var2, var3, var4, var5); // L: 207 208 210
		} else {
			long var6 = (long)this.id; // L: 212
			if (var5 != null) { // L: 213
				var6 |= var5.field1990 << 16; // L: 214
			}

			Model var8 = (Model)NpcDefinition_cachedModels.get(var6); // L: 216
			if (var8 == null) { // L: 217
				ModelData var9 = this.method3710(this.models, var5); // L: 218
				if (var9 == null) { // L: 219
					return null; // L: 220
				}

				var8 = var9.toModel(this.ambient + 64, this.contrast * 5 + 850, -30, -50, -30); // L: 222
				NpcDefinition_cachedModels.put(var8, var6); // L: 223
			}

			Model var11;
			if (var1 != null && var3 != null) { // L: 226
				var11 = var1.applyTransformations(var8, var2, var3, var4);
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lhs;I)Lie;",
		garbageValue = "1919655467"
	)
	public final ModelData method3709(class194 var1) {
		if (this.transforms != null) { // L: 235
			NPCComposition var2 = this.transform(); // L: 236
			return var2 == null ? null : var2.method3709(var1); // L: 237 238 240
		} else {
			return this.method3710(this.field2004, var1); // L: 242
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([ILhs;I)Lie;",
		garbageValue = "1988428396"
	)
	ModelData method3710(int[] var1, class194 var2) {
		int[] var3 = var1; // L: 246
		if (var2 != null && var2.field1993 != null) { // L: 247
			var3 = var2.field1993; // L: 248
		}

		if (var3 == null) { // L: 250
			return null; // L: 251
		} else {
			boolean var4 = false; // L: 253

			for (int var5 = 0; var5 < var3.length; ++var5) { // L: 254
				if (var3[var5] != -1 && !field1997.tryLoadFile(var3[var5], 0)) { // L: 255
					var4 = true; // L: 256
				}
			}

			if (var4) { // L: 259
				return null; // L: 260
			} else {
				ModelData[] var9 = new ModelData[var3.length]; // L: 262

				for (int var6 = 0; var6 < var3.length; ++var6) { // L: 263
					var9[var6] = ModelData.ModelData_get(field1997, var3[var6], 0); // L: 264
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
					if (var2 != null && var2.field1992 != null) { // L: 278
						var7 = var2.field1992; // L: 279
					}

					for (var8 = 0; var8 < this.recolorFrom.length; ++var8) { // L: 281
						var10.recolor(this.recolorFrom[var8], var7[var8]); // L: 282
					}
				}

				if (this.retextureFrom != null) { // L: 285
					var7 = this.retextureTo; // L: 286
					if (var2 != null && var2.field1995 != null) { // L: 287
						var7 = var2.field1995; // L: 288
					}

					for (var8 = 0; var8 < this.retextureFrom.length; ++var8) { // L: 290
						var10.retexture(this.retextureFrom[var8], var7[var8]); // L: 291
					}
				}

				return var10; // L: 294
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lhi;",
		garbageValue = "253383500"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1; // L: 298
		if (this.transformVarbit != -1) { // L: 299
			var1 = DecorativeObject.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 300
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 302
			var2 = this.transforms[var1]; // L: 303
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? Tile.getNpcDefinition(var2) : null; // L: 304 305
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1593779214"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) { // L: 309
			return true;
		} else {
			int var1 = -1; // L: 310
			if (this.transformVarbit != -1) { // L: 311
				var1 = DecorativeObject.getVarbit(this.transformVarbit);
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-17"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return FileSystem.method3540(this.params, var1, var2); // L: 318
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-802547226"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params; // L: 323
		String var3;
		if (var4 == null) { // L: 325
			var3 = var2; // L: 326
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1); // L: 329
			if (var5 == null) { // L: 330
				var3 = var2; // L: 331
			} else {
				var3 = (String)var5.obj; // L: 334
			}
		}

		return var3; // L: 336
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "193919919"
	)
	public boolean method3715() {
		return this.field2039 != null && this.field2040 != null; // L: 345
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "898038948"
	)
	public int[] method3720() {
		return this.field2039; // L: 349
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2078204105"
	)
	public int method3713(int var1) {
		return this.field2039 != null && var1 < this.field2039.length ? this.field2039[var1] : -1; // L: 353 354 356
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "-68700738"
	)
	public short[] method3750() {
		return this.field2040; // L: 360
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)S",
		garbageValue = "1198678943"
	)
	public short method3719(int var1) {
		return this.field2040 != null && var1 < this.field2040.length ? this.field2040[var1] : -1; // L: 364 365 367
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhw;",
		garbageValue = "93"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0); // L: 32
		if (var1 != null) { // L: 33
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0); // L: 34
			var1 = new SpotAnimationDefinition(); // L: 35
			var1.id = var0; // L: 36
			if (var2 != null) { // L: 37
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0); // L: 38
			return var1; // L: 39
		}
	}
}
