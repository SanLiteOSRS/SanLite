import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("NpcDefinition_archive")
	static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("NpcDefinition_modelArchive")
	static AbstractArchive NpcDefinition_modelArchive;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("NpcDefinition_cached")
	static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("NpcDefinition_cachedModels")
	static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 168942993
	)
	@Export("id")
	public int id;
	@ObfuscatedName("i")
	@Export("name")
	public String name;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -370103317
	)
	@Export("size")
	public int size;
	@ObfuscatedName("l")
	@Export("models")
	int[] models;
	@ObfuscatedName("k")
	int[] field2031;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1602286699
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1548038695
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 165705707
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1667350293
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1692211541
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 884354517
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1977497421
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1499684449
	)
	public int field2039;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -2144485029
	)
	public int field2040;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1383865603
	)
	public int field2059;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1548940971
	)
	public int field2042;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -820400097
	)
	public int field2043;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1913284829
	)
	public int field2065;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 307130589
	)
	public int field2045;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -652699457
	)
	public int field2057;
	@ObfuscatedName("y")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("af")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("aa")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("ai")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("ag")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("aw")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1652634765
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1083988193
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -674802293
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("aj")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 833158905
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -507930815
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1562903301
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("ay")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1588467167
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1790222217
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("aq")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("ak")
	@Export("isClickable")
	public boolean isClickable;
	@ObfuscatedName("au")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("ae")
	int[] field2066;
	@ObfuscatedName("ah")
	short[] field2067;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
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
		this.field2039 = -1; // L: 33
		this.field2040 = -1; // L: 34
		this.field2059 = -1; // L: 35
		this.field2042 = -1; // L: 36
		this.field2043 = -1; // L: 37
		this.field2065 = -1; // L: 38
		this.field2045 = -1; // L: 39
		this.field2057 = -1; // L: 40
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
		this.field2066 = null; // L: 60
		this.field2067 = null; // L: 61
	} // L: 64

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-20"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 83

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lrd;I)V",
		garbageValue = "-992361699"
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lrd;IB)V",
		garbageValue = "0"
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
			this.field2031 = new int[var3]; // L: 138

			for (var4 = 0; var4 < var3; ++var4) { // L: 139
				this.field2031[var4] = var1.readUnsignedShort();
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

				this.field2066 = new int[var4]; // L: 156
				this.field2067 = new short[var4]; // L: 157

				for (int var6 = 0; var6 < var4; ++var6) { // L: 158
					if ((var3 & 1 << var6) == 0) { // L: 159
						this.field2066[var6] = -1; // L: 160
						this.field2067[var6] = -1; // L: 161
					} else {
						this.field2066[var6] = var1.method8709(); // L: 164
						this.field2067[var6] = (short)var1.method8660(); // L: 165
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
					this.field2039 = var1.readUnsignedShort();
				} else if (var2 == 115) { // L: 192
					this.field2039 = var1.readUnsignedShort(); // L: 193
					this.field2040 = var1.readUnsignedShort(); // L: 194
					this.field2059 = var1.readUnsignedShort(); // L: 195
					this.field2042 = var1.readUnsignedShort(); // L: 196
				} else if (var2 == 116) { // L: 198
					this.field2043 = var1.readUnsignedShort();
				} else if (var2 == 117) { // L: 199
					this.field2043 = var1.readUnsignedShort(); // L: 200
					this.field2065 = var1.readUnsignedShort(); // L: 201
					this.field2045 = var1.readUnsignedShort(); // L: 202
					this.field2057 = var1.readUnsignedShort(); // L: 203
				} else if (var2 == 249) { // L: 205
					this.params = class127.readStringIntParameters(var1, this.params);
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lge;ILge;ILgj;I)Lhs;",
		garbageValue = "-699264349"
	)
	public final Model method3723(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, class189 var5) {
		if (this.transforms != null) { // L: 210
			NPCComposition var10 = this.transform(); // L: 211
			return var10 == null ? null : var10.method3723(var1, var2, var3, var4, var5); // L: 212 213 215
		} else {
			long var6 = (long)this.id; // L: 217
			if (var5 != null) { // L: 218
				var6 |= var5.field2021 << 16; // L: 219
			}

			Model var8 = (Model)NpcDefinition_cachedModels.get(var6); // L: 221
			if (var8 == null) { // L: 222
				ModelData var9 = this.method3724(this.models, var5); // L: 223
				if (var9 == null) { // L: 224
					return null; // L: 225
				}

				var8 = var9.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30); // L: 227
				NpcDefinition_cachedModels.put(var8, var6); // L: 228
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lgj;I)Lhe;",
		garbageValue = "777135590"
	)
	public final ModelData method3750(class189 var1) {
		if (this.transforms != null) { // L: 240
			NPCComposition var2 = this.transform(); // L: 241
			return var2 == null ? null : var2.method3750(var1); // L: 242 243 245
		} else {
			return this.method3724(this.field2031, var1); // L: 247
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "([ILgj;I)Lhe;",
		garbageValue = "-1265657645"
	)
	ModelData method3724(int[] var1, class189 var2) {
		int[] var3 = var1; // L: 251
		if (var2 != null && var2.field2018 != null) { // L: 252
			var3 = var2.field2018; // L: 253
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
					if (var2 != null && var2.field2019 != null) { // L: 283
						var7 = var2.field2019; // L: 284
					}

					for (var8 = 0; var8 < this.recolorFrom.length; ++var8) { // L: 286
						var10.recolor(this.recolorFrom[var8], var7[var8]); // L: 287
					}
				}

				if (this.retextureFrom != null) { // L: 290
					var7 = this.retextureTo; // L: 291
					if (var2 != null && var2.field2020 != null) { // L: 292
						var7 = var2.field2020; // L: 293
					}

					for (var8 = 0; var8 < this.retextureFrom.length; ++var8) { // L: 295
						var10.retexture(this.retextureFrom[var8], var7[var8]); // L: 296
					}
				}

				return var10; // L: 299
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Lgo;",
		garbageValue = "-1447312355"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1; // L: 303
		if (this.transformVarbit != -1) { // L: 304
			var1 = SecureRandomFuture.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 305
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 307
			var2 = this.transforms[var1]; // L: 308
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class137.getNpcDefinition(var2) : null; // L: 309 310
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1020653096"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) { // L: 314
			return true;
		} else {
			int var1 = -1; // L: 315
			if (this.transformVarbit != -1) { // L: 316
				var1 = SecureRandomFuture.getVarbit(this.transformVarbit);
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1125226221"
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

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-97"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class145.method3192(this.params, var1, var2); // L: 341
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1185474611"
	)
	public boolean method3730() {
		return this.field2066 != null && this.field2067 != null; // L: 350
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "303356409"
	)
	public int[] method3757() {
		return this.field2066; // L: 354
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1165166877"
	)
	public int method3751(int var1) {
		return this.field2066 != null && var1 < this.field2066.length ? this.field2066[var1] : -1; // L: 358 359 361
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)[S",
		garbageValue = "1"
	)
	public short[] method3749() {
		return this.field2067; // L: 365
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)S",
		garbageValue = "-242037321"
	)
	public short method3734(int var1) {
		return this.field2067 != null && var1 < this.field2067.length ? this.field2067[var1] : -1; // L: 369 370 372
	}
}
