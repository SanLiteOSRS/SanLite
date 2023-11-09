import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("NpcDefinition_archive")
	static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("NpcDefinition_cached")
	static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -148925263
	)
	static int field1966;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1732339779
	)
	@Export("id")
	public int id;
	@ObfuscatedName("aa")
	@Export("name")
	public String name;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -982873463
	)
	@Export("size")
	public int size;
	@ObfuscatedName("al")
	@Export("models")
	int[] models;
	@ObfuscatedName("az")
	int[] field1928;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 929101693
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 2124045029
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -810894845
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 380025451
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -347828473
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -914310317
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 832299041
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1490443197
	)
	public int field1931;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1622952669
	)
	public int field1937;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 168358035
	)
	public int field1954;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1800293817
	)
	public int field1962;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -400554641
	)
	public int field1961;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -280377849
	)
	public int field1941;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -2053163507
	)
	public int field1958;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 694176283
	)
	public int field1945;
	@ObfuscatedName("af")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("be")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("bd")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("bl")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("bi")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("bv")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1916672885
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 680688231
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1444272247
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("bm")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 51170379
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 967903467
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1395954963
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("bn")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1401908107
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1298306557
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("bu")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("by")
	@Export("isClickable")
	public boolean isClickable;
	@ObfuscatedName("bh")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("bz")
	int[] field1963;
	@ObfuscatedName("bc")
	short[] field1943;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
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
		this.field1931 = -1; // L: 33
		this.field1937 = -1; // L: 34
		this.field1954 = -1; // L: 35
		this.field1962 = -1; // L: 36
		this.field1961 = -1; // L: 37
		this.field1941 = -1; // L: 38
		this.field1958 = -1; // L: 39
		this.field1945 = -1; // L: 40
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
		this.field1963 = null; // L: 60
		this.field1943 = null; // L: 61
	} // L: 64

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 83

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Luj;B)V",
		garbageValue = "-39"
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Luj;II)V",
		garbageValue = "221871708"
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
			this.field1928 = new int[var3]; // L: 138

			for (var4 = 0; var4 < var3; ++var4) { // L: 139
				this.field1928[var4] = var1.readUnsignedShort();
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
			this.contrast = var1.readByte();
		} else {
			int var5;
			if (var2 == 102) { // L: 148
				var3 = var1.readUnsignedByte(); // L: 149
				var4 = 0; // L: 150

				for (var5 = var3; var5 != 0; var5 >>= 1) { // L: 151 152 154
					++var4; // L: 153
				}

				this.field1963 = new int[var4]; // L: 156
				this.field1943 = new short[var4]; // L: 157

				for (int var6 = 0; var6 < var4; ++var6) { // L: 158
					if ((var3 & 1 << var6) == 0) { // L: 159
						this.field1963[var6] = -1; // L: 160
						this.field1943[var6] = -1; // L: 161
					} else {
						this.field1963[var6] = var1.method9280(); // L: 164
						this.field1943[var6] = (short)var1.method9277(); // L: 165
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
					this.field1931 = var1.readUnsignedShort();
				} else if (var2 == 115) { // L: 192
					this.field1931 = var1.readUnsignedShort(); // L: 193
					this.field1937 = var1.readUnsignedShort(); // L: 194
					this.field1954 = var1.readUnsignedShort(); // L: 195
					this.field1962 = var1.readUnsignedShort(); // L: 196
				} else if (var2 == 116) { // L: 198
					this.field1961 = var1.readUnsignedShort();
				} else if (var2 == 117) { // L: 199
					this.field1961 = var1.readUnsignedShort(); // L: 200
					this.field1941 = var1.readUnsignedShort(); // L: 201
					this.field1958 = var1.readUnsignedShort(); // L: 202
					this.field1945 = var1.readUnsignedShort(); // L: 203
				} else if (var2 == 249) { // L: 205
					this.params = class144.readStringIntParameters(var1, this.params);
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lhx;ILhx;ILhf;B)Lka;",
		garbageValue = "-112"
	)
	public final Model method3735(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, class187 var5) {
		if (this.transforms != null) { // L: 210
			NPCComposition var10 = this.transform(); // L: 211
			return var10 == null ? null : var10.method3735(var1, var2, var3, var4, var5); // L: 212 213 215
		} else {
			long var6 = (long)this.id; // L: 217
			if (var5 != null) { // L: 218
				var6 |= var5.field1917 << 16; // L: 219
			}

			Model var8 = (Model)HitSplatDefinition_cachedFonts.get(var6); // L: 221
			if (var8 == null) { // L: 222
				ModelData var9 = this.method3695(this.models, var5); // L: 223
				if (var9 == null) { // L: 224
					return null; // L: 225
				}

				var8 = var9.toModel(this.ambient + 64, this.contrast * 5 + 850, -30, -50, -30); // L: 227
				HitSplatDefinition_cachedFonts.put(var8, var6); // L: 228
			}

			Model var11;
			if (var1 != null && var3 != null) {
				var11 = var1.applyTransformations(var8, var2, var3, var4); // L: 231
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lhf;B)Lkq;",
		garbageValue = "40"
	)
	public final ModelData method3696(class187 var1) {
		if (this.transforms != null) { // L: 240
			NPCComposition var2 = this.transform(); // L: 241
			return var2 == null ? null : var2.method3696(var1); // L: 242 243 245
		} else {
			return this.method3695(this.field1928, var1); // L: 247
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([ILhf;I)Lkq;",
		garbageValue = "-578729183"
	)
	ModelData method3695(int[] var1, class187 var2) {
		int[] var3 = var1; // L: 251
		if (var2 != null && var2.field1911 != null) { // L: 252
			var3 = var2.field1911; // L: 253
		}

		if (var3 == null) { // L: 255
			return null; // L: 256
		} else {
			boolean var4 = false; // L: 258

			for (int var5 = 0; var5 < var3.length; ++var5) { // L: 259
				if (var3[var5] != -1 && !class191.field1977.tryLoadFile(var3[var5], 0)) { // L: 260
					var4 = true; // L: 261
				}
			}

			if (var4) { // L: 264
				return null; // L: 265
			} else {
				ModelData[] var9 = new ModelData[var3.length]; // L: 267

				for (int var6 = 0; var6 < var3.length; ++var6) { // L: 268
					var9[var6] = ModelData.ModelData_get(class191.field1977, var3[var6], 0); // L: 269
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
					if (var2 != null && var2.field1912 != null) { // L: 283
						var7 = var2.field1912; // L: 284
					}

					for (var8 = 0; var8 < this.recolorFrom.length; ++var8) { // L: 286
						var10.recolor(this.recolorFrom[var8], var7[var8]); // L: 287
					}
				}

				if (this.retextureFrom != null) { // L: 290
					var7 = this.retextureTo; // L: 291
					if (var2 != null && var2.field1915 != null) { // L: 292
						var7 = var2.field1915; // L: 293
					}

					for (var8 = 0; var8 < this.retextureFrom.length; ++var8) { // L: 295
						var10.retexture(this.retextureFrom[var8], var7[var8]); // L: 296
					}
				}

				return var10; // L: 299
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lhw;",
		garbageValue = "-454054205"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1; // L: 303
		if (this.transformVarbit != -1) { // L: 304
			var1 = HealthBar.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 305
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 307
			var2 = this.transforms[var1]; // L: 308
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? VerticalAlignment.getNpcDefinition(var2) : null; // L: 309 310
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "10"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) { // L: 314
			return true;
		} else {
			int var1 = -1; // L: 315
			if (this.transformVarbit != -1) { // L: 316
				var1 = HealthBar.getVarbit(this.transformVarbit);
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1331214833"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return Player.method2444(this.params, var1, var2); // L: 323
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-2078724578"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params; // L: 328
		String var3;
		if (var4 == null) { // L: 330
			var3 = var2; // L: 331
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1); // L: 334
			if (var5 == null) { // L: 335
				var3 = var2; // L: 336
			} else {
				var3 = (String)var5.obj; // L: 339
			}
		}

		return var3; // L: 341
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1998191718"
	)
	public boolean method3702() {
		return this.field1963 != null && this.field1943 != null; // L: 350
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1546218068"
	)
	public int[] method3733() {
		return this.field1963; // L: 354
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1923898777"
	)
	public int method3704(int var1) {
		return this.field1963 != null && var1 < this.field1963.length ? this.field1963[var1] : -1; // L: 358 359 361
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "1795535195"
	)
	public short[] method3694() {
		return this.field1943; // L: 365
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)S",
		garbageValue = "-62"
	)
	public short method3706(int var1) {
		return this.field1943 != null && var1 < this.field1943.length ? this.field1943[var1] : -1; // L: 369 370 372
	}

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V",
		garbageValue = "-115"
	)
	static final void method3748(int var0, int var1, int var2, boolean var3) {
		if (HealthBarDefinition.field1877.method6282(var0)) { // L: 11195
			UrlRequest.resizeInterface(HealthBarDefinition.field1877.field3568[var0], -1, var1, var2, var3); // L: 11196
		}
	} // L: 11197
}
