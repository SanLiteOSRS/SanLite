import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("NpcDefinition_archive")
	static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("NpcDefinition_modelArchive")
	static AbstractArchive NpcDefinition_modelArchive;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("NpcDefinition_cached")
	static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("NpcDefinition_cachedModels")
	static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1115372301
	)
	@Export("id")
	public int id;
	@ObfuscatedName("aq")
	@Export("name")
	public String name;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1458410691
	)
	@Export("size")
	public int size;
	@ObfuscatedName("at")
	@Export("models")
	int[] models;
	@ObfuscatedName("aa")
	int[] field2052;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1235033537
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -2117504177
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1635935495
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 849832979
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 606174455
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 429445119
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1237616413
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1565402875
	)
	public int field2048;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1434909561
	)
	public int field2008;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1171795391
	)
	public int field2025;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1924156607
	)
	public int field2037;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1186532489
	)
	public int field2023;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1456216629
	)
	public int field2028;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -750567499
	)
	public int field2029;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1520351037
	)
	public int field2030;
	@ObfuscatedName("ap")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("by")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("bb")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("bi")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("be")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("bk")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 2062903815
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1661958697
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 521320011
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("bm")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1500709613
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -2057653211
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1982137875
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("bn")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1781845069
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 2051988897
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("bg")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("bu")
	@Export("isClickable")
	public boolean isClickable;
	@ObfuscatedName("bf")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("bq")
	int[] field2050;
	@ObfuscatedName("ba")
	short[] field2051;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lro;"
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
		this.walkRightSequence = -1; // L: 32
		this.field2048 = -1; // L: 33
		this.field2008 = -1; // L: 34
		this.field2025 = -1; // L: 35
		this.field2037 = -1; // L: 36
		this.field2023 = -1; // L: 37
		this.field2028 = -1; // L: 38
		this.field2029 = -1; // L: 39
		this.field2030 = -1; // L: 40
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
		this.field2050 = null; // L: 60
		this.field2051 = null; // L: 61
	} // L: 64

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "835833293"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 83

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)V",
		garbageValue = "-247932803"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 87
			if (var2 == 0) { // L: 88
				return; // L: 91
			}

			this.decodeNext(var1, var2); // L: 89
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lsg;II)V",
		garbageValue = "1239995114"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) { // L: 94
			var3 = var1.readUnsignedByte(); // L: 95
			this.models = new int[var3]; // L: 96

			for (var4 = 0; var4 < var3; ++var4) { // L: 97
				this.models[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 2) { // L: 99
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 12) { // L: 100
			this.size = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 101
			this.idleSequence = var1.readUnsignedShort();
		} else if (var2 == 14) { // L: 102
			this.walkSequence = var1.readUnsignedShort();
		} else if (var2 == 15) { // L: 103
			this.turnLeftSequence = var1.readUnsignedShort();
		} else if (var2 == 16) { // L: 104
			this.turnRightSequence = var1.readUnsignedShort();
		} else if (var2 == 17) { // L: 105
			this.walkSequence = var1.readUnsignedShort(); // L: 106
			this.walkBackSequence = var1.readUnsignedShort(); // L: 107
			this.walkLeftSequence = var1.readUnsignedShort(); // L: 108
			this.walkRightSequence = var1.readUnsignedShort(); // L: 109
		} else if (var2 == 18) { // L: 111
			var1.readUnsignedShort(); // L: 112
		} else if (var2 >= 30 && var2 < 35) { // L: 114
			this.actions[var2 - 30] = var1.readStringCp1252NullTerminated(); // L: 115
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) { // L: 116
				this.actions[var2 - 30] = null;
			}
		} else if (var2 == 40) { // L: 118
			var3 = var1.readUnsignedByte(); // L: 119
			this.recolorFrom = new short[var3]; // L: 120
			this.recolorTo = new short[var3]; // L: 121

			for (var4 = 0; var4 < var3; ++var4) { // L: 122
				this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 123
				this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 124
			}
		} else if (var2 == 41) { // L: 127
			var3 = var1.readUnsignedByte(); // L: 128
			this.retextureFrom = new short[var3]; // L: 129
			this.retextureTo = new short[var3]; // L: 130

			for (var4 = 0; var4 < var3; ++var4) { // L: 131
				this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 132
				this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 133
			}
		} else if (var2 == 60) { // L: 136
			var3 = var1.readUnsignedByte(); // L: 137
			this.field2052 = new int[var3]; // L: 138

			for (var4 = 0; var4 < var3; ++var4) { // L: 139
				this.field2052[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 93) { // L: 141
			this.drawMapDot = false;
		} else if (var2 == 95) { // L: 142
			this.combatLevel = var1.readUnsignedShort();
		} else if (var2 == 97) { // L: 143
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 98) { // L: 144
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 99) { // L: 145
			this.isVisible = true;
		} else if (var2 == 100) { // L: 146
			this.ambient = var1.readByte();
		} else if (var2 == 101) { // L: 147
			this.contrast = var1.readByte() * 5;
		} else {
			int var5;
			if (var2 == 102) { // L: 148
				var3 = var1.readUnsignedByte(); // L: 149
				var4 = 0; // L: 150

				for (var5 = var3; var5 != 0; var5 >>= 1) { // L: 151 152 154
					++var4; // L: 153
				}

				this.field2050 = new int[var4]; // L: 156
				this.field2051 = new short[var4]; // L: 157

				for (int var6 = 0; var6 < var4; ++var6) { // L: 158
					if ((var3 & 1 << var6) == 0) { // L: 159
						this.field2050[var6] = -1; // L: 160
						this.field2051[var6] = -1; // L: 161
					} else {
						this.field2050[var6] = var1.method9108(); // L: 164
						this.field2051[var6] = (short)var1.method9073(); // L: 165
					}
				}
			} else if (var2 == 103) { // L: 169
				this.rotation = var1.readUnsignedShort();
			} else if (var2 != 106 && var2 != 118) { // L: 170
				if (var2 == 107) { // L: 188
					this.isInteractable = false;
				} else if (var2 == 109) { // L: 189
					this.isClickable = false;
				} else if (var2 == 111) { // L: 190
					this.isFollower = true;
				} else if (var2 == 114) { // L: 191
					this.field2048 = var1.readUnsignedShort();
				} else if (var2 == 115) { // L: 192
					this.field2048 = var1.readUnsignedShort(); // L: 193
					this.field2008 = var1.readUnsignedShort(); // L: 194
					this.field2025 = var1.readUnsignedShort(); // L: 195
					this.field2037 = var1.readUnsignedShort(); // L: 196
				} else if (var2 == 116) { // L: 198
					this.field2023 = var1.readUnsignedShort();
				} else if (var2 == 117) { // L: 199
					this.field2023 = var1.readUnsignedShort(); // L: 200
					this.field2028 = var1.readUnsignedShort(); // L: 201
					this.field2029 = var1.readUnsignedShort(); // L: 202
					this.field2030 = var1.readUnsignedShort(); // L: 203
				} else if (var2 == 249) { // L: 205
					this.params = ChatChannel.readStringIntParameters(var1, this.params);
				}
			} else {
				this.transformVarbit = var1.readUnsignedShort(); // L: 171
				if (this.transformVarbit == 65535) { // L: 172
					this.transformVarbit = -1;
				}

				this.transformVarp = var1.readUnsignedShort(); // L: 173
				if (this.transformVarp == 65535) { // L: 174
					this.transformVarp = -1;
				}

				var3 = -1; // L: 175
				if (var2 == 118) { // L: 176
					var3 = var1.readUnsignedShort(); // L: 177
					if (var3 == 65535) { // L: 178
						var3 = -1;
					}
				}

				var4 = var1.readUnsignedByte(); // L: 180
				this.transforms = new int[var4 + 2]; // L: 181

				for (var5 = 0; var5 <= var4; ++var5) { // L: 182
					this.transforms[var5] = var1.readUnsignedShort(); // L: 183
					if (this.transforms[var5] == 65535) { // L: 184
						this.transforms[var5] = -1;
					}
				}

				this.transforms[var4 + 1] = var3; // L: 186
			}
		}

	} // L: 207

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lha;ILha;ILhv;B)Lit;",
		garbageValue = "49"
	)
	public final Model method3769(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, class189 var5) {
		if (this.transforms != null) { // L: 210
			NPCComposition var10 = this.transform(); // L: 211
			return var10 == null ? null : var10.method3769(var1, var2, var3, var4, var5); // L: 212 213 215
		} else {
			long var6 = (long)this.id; // L: 217
			if (var5 != null) { // L: 218
				var6 |= var5.field2002 << 16; // L: 219
			}

			Model var8 = (Model)NpcDefinition_cachedModels.get(var6); // L: 221
			if (var8 == null) { // L: 222
				ModelData var9 = this.method3771(this.models, var5); // L: 223
				if (var9 == null) { // L: 224
					return null; // L: 225
				}

				var8 = var9.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30); // L: 227
				NpcDefinition_cachedModels.put(var8, var6); // L: 228
			}

			Model var11;
			if (var1 != null && var3 != null) { // L: 231
				var11 = var1.applyTransformations(var8, var2, var3, var4);
			} else if (var1 != null) { // L: 232
				var11 = var1.transformActorModel(var8, var2);
			} else if (var3 != null) { // L: 233
				var11 = var3.transformActorModel(var8, var4);
			} else {
				var11 = var8.toSharedSequenceModel(true); // L: 234
			}

			if (this.widthScale != 128 || this.heightScale != 128) { // L: 235
				var11.scale(this.widthScale, this.heightScale, this.widthScale);
			}

			return var11; // L: 236
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lhv;B)Liz;",
		garbageValue = "64"
	)
	public final ModelData method3770(class189 var1) {
		if (this.transforms != null) { // L: 240
			NPCComposition var2 = this.transform(); // L: 241
			return var2 == null ? null : var2.method3770(var1); // L: 242 243 245
		} else {
			return this.method3771(this.field2052, var1); // L: 247
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([ILhv;I)Liz;",
		garbageValue = "-417083855"
	)
	ModelData method3771(int[] var1, class189 var2) {
		int[] var3 = var1; // L: 251
		if (var2 != null && var2.field2001 != null) { // L: 252
			var3 = var2.field2001; // L: 253
		}

		if (var3 == null) { // L: 255
			return null; // L: 256
		} else {
			boolean var4 = false; // L: 258

			for (int var5 = 0; var5 < var3.length; ++var5) { // L: 259
				if (var3[var5] != -1 && !NpcDefinition_modelArchive.tryLoadFile(var3[var5], 0)) { // L: 260
					var4 = true; // L: 261
				}
			}

			if (var4) { // L: 264
				return null; // L: 265
			} else {
				ModelData[] var9 = new ModelData[var3.length]; // L: 267

				for (int var6 = 0; var6 < var3.length; ++var6) { // L: 268
					var9[var6] = ModelData.ModelData_get(NpcDefinition_modelArchive, var3[var6], 0); // L: 269
				}

				ModelData var10;
				if (var9.length == 1) { // L: 272
					var10 = var9[0]; // L: 273
					if (var10 == null) { // L: 274
						var10 = new ModelData(var9, var9.length); // L: 275
					}
				} else {
					var10 = new ModelData(var9, var9.length); // L: 279
				}

				short[] var7;
				int var8;
				if (this.recolorFrom != null) { // L: 281
					var7 = this.recolorTo; // L: 282
					if (var2 != null && var2.field2000 != null) { // L: 283
						var7 = var2.field2000; // L: 284
					}

					for (var8 = 0; var8 < this.recolorFrom.length; ++var8) { // L: 286
						var10.recolor(this.recolorFrom[var8], var7[var8]); // L: 287
					}
				}

				if (this.retextureFrom != null) { // L: 290
					var7 = this.retextureTo; // L: 291
					if (var2 != null && var2.field2003 != null) { // L: 292
						var7 = var2.field2003; // L: 293
					}

					for (var8 = 0; var8 < this.retextureFrom.length; ++var8) { // L: 295
						var10.retexture(this.retextureFrom[var8], var7[var8]); // L: 296
					}
				}

				return var10; // L: 299
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lhs;",
		garbageValue = "1271441583"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1; // L: 303
		if (this.transformVarbit != -1) { // L: 304
			var1 = class252.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 305
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 307
			var2 = this.transforms[var1]; // L: 308
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? AbstractArchive.getNpcDefinition(var2) : null; // L: 309 310
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "41635170"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) { // L: 314
			return true;
		} else {
			int var1 = -1; // L: 315
			if (this.transformVarbit != -1) { // L: 316
				var1 = class252.getVarbit(this.transformVarbit);
			} else if (this.transformVarp != -1) { // L: 317
				var1 = Varps.Varps_main[this.transformVarp];
			}

			if (var1 >= 0 && var1 < this.transforms.length) { // L: 318
				return this.transforms[var1] != -1; // L: 319
			} else {
				return this.transforms[this.transforms.length - 1] != -1;
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1858319582"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params; // L: 324
		int var3;
		if (var4 == null) { // L: 326
			var3 = var2; // L: 327
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1); // L: 330
			if (var5 == null) { // L: 331
				var3 = var2; // L: 332
			} else {
				var3 = var5.integer; // L: 335
			}
		}

		return var3; // L: 337
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1361992151"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return EnumComposition.method3750(this.params, var1, var2); // L: 341
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "29"
	)
	public boolean method3776() {
		return this.field2050 != null && this.field2051 != null; // L: 350
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-185133589"
	)
	public int[] method3777() {
		return this.field2050; // L: 354
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "123"
	)
	public int method3778(int var1) {
		return this.field2050 != null && var1 < this.field2050.length ? this.field2050[var1] : -1; // L: 358 359 361
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "800844396"
	)
	public short[] method3779() {
		return this.field2051; // L: 365
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)S",
		garbageValue = "439788995"
	)
	public short method3783(int var1) {
		return this.field2051 != null && var1 < this.field2051.length ? this.field2051[var1] : -1; // L: 369 370 372
	}

	@ObfuscatedName("aq")
	public static int method3824(long var0) {
		return (int)(var0 >>> 7 & 127L); // L: 81
	}
}
