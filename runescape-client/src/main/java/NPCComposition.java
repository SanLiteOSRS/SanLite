import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hd")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("NpcDefinition_archive")
	static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("NpcDefinition_modelArchive")
	static AbstractArchive NpcDefinition_modelArchive;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("NpcDefinition_cached")
	static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("NpcDefinition_cachedModels")
	static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "[Ltm;"
	)
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -283030835
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ab")
	@Export("name")
	public String name;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1599217281
	)
	@Export("size")
	public int size;
	@ObfuscatedName("ae")
	@Export("models")
	int[] models;
	@ObfuscatedName("af")
	int[] field2002;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 794059635
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1524655211
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1228215405
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1750832729
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1413662117
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 869678791
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1883673513
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -918440347
	)
	public int field2014;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 2104873647
	)
	public int field2011;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -2065983661
	)
	public int field2012;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 542922035
	)
	public int field2013;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 10611111
	)
	public int field1994;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1835981853
	)
	public int field2015;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -848741867
	)
	public int field2016;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1057863331
	)
	public int field2017;
	@ObfuscatedName("am")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("bs")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("bc")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("bj")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("bo")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("bq")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1963450049
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1357365707
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -357845439
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("ba")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -512329669
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1130866187
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 871517561
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("be")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 700713845
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 2021096631
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("bw")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("bi")
	@Export("isClickable")
	public boolean isClickable;
	@ObfuscatedName("bk")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("bv")
	int[] field2037;
	@ObfuscatedName("bz")
	short[] field2038;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
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
		this.field2014 = -1; // L: 33
		this.field2011 = -1; // L: 34
		this.field2012 = -1; // L: 35
		this.field2013 = -1; // L: 36
		this.field1994 = -1; // L: 37
		this.field2015 = -1; // L: 38
		this.field2016 = -1; // L: 39
		this.field2017 = -1; // L: 40
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
		this.field2037 = null; // L: 60
		this.field2038 = null; // L: 61
	} // L: 64

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1082041138"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 83

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)V",
		garbageValue = "1733428721"
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ltz;II)V",
		garbageValue = "1323696648"
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
			this.walkBackSequence = var1.readUnsignedShort();
			this.walkLeftSequence = var1.readUnsignedShort();
			this.walkRightSequence = var1.readUnsignedShort();
		} else if (var2 == 18) {
			var1.readUnsignedShort(); // L: 112
		} else if (var2 >= 30 && var2 < 35) { // L: 114
			this.actions[var2 - 30] = var1.readStringCp1252NullTerminated(); // L: 115
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) {
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
			this.field2002 = new int[var3]; // L: 138

			for (var4 = 0; var4 < var3; ++var4) { // L: 139
				this.field2002[var4] = var1.readUnsignedShort();
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

				this.field2037 = new int[var4]; // L: 156
				this.field2038 = new short[var4]; // L: 157

				for (int var6 = 0; var6 < var4; ++var6) { // L: 158
					if ((var3 & 1 << var6) == 0) { // L: 159
						this.field2037[var6] = -1; // L: 160
						this.field2038[var6] = -1; // L: 161
					} else {
						this.field2037[var6] = var1.method8928(); // L: 164
						this.field2038[var6] = (short)var1.method8938(); // L: 165
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
					this.field2014 = var1.readUnsignedShort();
				} else if (var2 == 115) { // L: 192
					this.field2014 = var1.readUnsignedShort(); // L: 193
					this.field2011 = var1.readUnsignedShort(); // L: 194
					this.field2012 = var1.readUnsignedShort(); // L: 195
					this.field2013 = var1.readUnsignedShort(); // L: 196
				} else if (var2 == 116) { // L: 198
					this.field1994 = var1.readUnsignedShort();
				} else if (var2 == 117) { // L: 199
					this.field1994 = var1.readUnsignedShort(); // L: 200
					this.field2015 = var1.readUnsignedShort(); // L: 201
					this.field2016 = var1.readUnsignedShort(); // L: 202
					this.field2017 = var1.readUnsignedShort(); // L: 203
				} else if (var2 == 249) { // L: 205
					this.params = ReflectionCheck.readStringIntParameters(var1, this.params);
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lhy;ILhy;ILhs;I)Ljd;",
		garbageValue = "-1881429894"
	)
	public final Model method3691(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, class193 var5) {
		if (this.transforms != null) { // L: 210
			NPCComposition var10 = this.transform(); // L: 211
			return var10 == null ? null : var10.method3691(var1, var2, var3, var4, var5); // L: 212 213 215
		} else {
			long var6 = (long)this.id; // L: 217
			if (var5 != null) { // L: 218
				var6 |= var5.field1989 << 16; // L: 219
			}

			Model var8 = (Model)NpcDefinition_cachedModels.get(var6); // L: 221
			if (var8 == null) { // L: 222
				ModelData var9 = this.method3693(this.models, var5); // L: 223
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lhs;I)Lit;",
		garbageValue = "-1677969026"
	)
	public final ModelData method3692(class193 var1) {
		if (this.transforms != null) { // L: 240
			NPCComposition var2 = this.transform(); // L: 241
			return var2 == null ? null : var2.method3692(var1); // L: 242 243 245
		} else {
			return this.method3693(this.field2002, var1); // L: 247
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([ILhs;I)Lit;",
		garbageValue = "1176130796"
	)
	ModelData method3693(int[] var1, class193 var2) {
		int[] var3 = var1; // L: 251
		if (var2 != null && var2.field1987 != null) { // L: 252
			var3 = var2.field1987; // L: 253
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
					if (var2 != null && var2.field1988 != null) { // L: 283
						var7 = var2.field1988; // L: 284
					}

					for (var8 = 0; var8 < this.recolorFrom.length; ++var8) { // L: 286
						var10.recolor(this.recolorFrom[var8], var7[var8]); // L: 287
					}
				}

				if (this.retextureFrom != null) { // L: 290
					var7 = this.retextureTo; // L: 291
					if (var2 != null && var2.field1991 != null) { // L: 292
						var7 = var2.field1991; // L: 293
					}

					for (var8 = 0; var8 < this.retextureFrom.length; ++var8) { // L: 295
						var10.retexture(this.retextureFrom[var8], var7[var8]); // L: 296
					}
				}

				return var10; // L: 299
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Lhd;",
		garbageValue = "-5"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1; // L: 303
		if (this.transformVarbit != -1) { // L: 304
			var1 = class343.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 305
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 307
			var2 = this.transforms[var1]; // L: 308
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? Bounds.getNpcDefinition(var2) : null; // L: 309 310
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "48"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) { // L: 314
			return true;
		} else {
			int var1 = -1; // L: 315
			if (this.transformVarbit != -1) { // L: 316
				var1 = class343.getVarbit(this.transformVarbit);
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1524676663"
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1456645230"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class165.method3374(this.params, var1, var2); // L: 341
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-94"
	)
	public boolean method3698() {
		return this.field2037 != null && this.field2038 != null; // L: 350
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1005789568"
	)
	public int[] method3699() {
		return this.field2037; // L: 354
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "112"
	)
	public int method3687(int var1) {
		return this.field2037 != null && var1 < this.field2037.length ? this.field2037[var1] : -1; // L: 358 359 361
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "1843796190"
	)
	public short[] method3706() {
		return this.field2038; // L: 365
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)S",
		garbageValue = "-119"
	)
	public short method3735(int var1) {
		return this.field2038 != null && var1 < this.field2038.length ? this.field2038[var1] : -1; // L: 369 370 372
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1813068627"
	)
	public static void method3714() {
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 107
			if (ArchiveDiskActionHandler.field4224 != 0) { // L: 108
				ArchiveDiskActionHandler.field4224 = 1; // L: 109

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait(); // L: 111
				} catch (InterruptedException var3) { // L: 113
				}
			}

		}
	} // L: 116

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "145747520"
	)
	static int method3745(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1000
			var0 -= 1000; // L: 1001
			var3 = FriendSystem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1002
		} else {
			var3 = var2 ? class53.scriptDotWidget : Interpreter.field864; // L: 1004
		}

		Messages.invalidateWidget(var3); // L: 1005
		int var4;
		int var5;
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) { // L: 1006
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) { // L: 1026
				var3.modelType = 2; // L: 1027
				var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1028
				return 1; // L: 1029
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) { // L: 1031
				var3.modelType = 3; // L: 1032
				var3.modelId = Projectile.localPlayer.appearance.getChatHeadId(); // L: 1033
				return 1; // L: 1034
			} else if (var0 == 1207) { // L: 1036
				boolean var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1037
				GraphicsObject.method2043(var3, Projectile.localPlayer.appearance, var7); // L: 1038
				return 1; // L: 1039
			} else if (var0 == 1208) { // L: 1041
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1042
				if (var3.field3631 == null) { // L: 1043
					throw new RuntimeException(""); // L: 1044
				} else {
					ItemComposition.method4019(var3, var4); // L: 1046
					return 1; // L: 1047
				}
			} else if (var0 == 1209) { // L: 1049
				Interpreter.Interpreter_intStackSize -= 2; // L: 1050
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1051
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1052
				if (var3.field3631 == null) { // L: 1053
					throw new RuntimeException(""); // L: 1054
				} else {
					class199.method3808(var3, var4, var5); // L: 1056
					return 1; // L: 1057
				}
			} else if (var0 == 1210) { // L: 1059
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1060
				if (var3.field3631 == null) { // L: 1061
					throw new RuntimeException(""); // L: 1062
				} else {
					MusicPatchPcmStream.method5941(var3, Projectile.localPlayer.appearance.field3540, var4); // L: 1064
					return 1; // L: 1065
				}
			} else {
				return 2; // L: 1067
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 2; // L: 1007
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1008
			var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1009
			var3.itemId = var4; // L: 1010
			var3.itemQuantity = var5; // L: 1011
			ItemComposition var6 = class300.ItemComposition_get(var4); // L: 1012
			var3.modelAngleX = var6.xan2d; // L: 1013
			var3.modelAngleY = var6.yan2d; // L: 1014
			var3.modelAngleZ = var6.zan2d; // L: 1015
			var3.modelOffsetX = var6.offsetX2d; // L: 1016
			var3.modelOffsetY = var6.offsetY2d; // L: 1017
			var3.modelZoom = var6.zoom2d; // L: 1018
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) { // L: 1019
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | 1 == var6.isStackable) { // L: 1020
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2; // L: 1021
			}

			if (var3.field3667 > 0) { // L: 1022
				var3.modelZoom = var3.modelZoom * 32 / var3.field3667;
			} else if (var3.rawWidth > 0) { // L: 1023
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1; // L: 1024
		}
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "-1472718013"
	)
	static int method3746(int var0, Script var1, boolean var2) {
		int var3;
		Object var4;
		int var5;
		class494 var6;
		int var7;
		if (var0 != 7500 && var0 != 7508) { // L: 5082
			if (var0 != 7501) { // L: 5104
				int var19;
				int var20;
				if (var0 == 7502) { // L: 5113
					Interpreter.Interpreter_intStackSize -= 3; // L: 5114
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 5115
					var19 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 5116
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 5117
					var20 = class152.method3196(var19); // L: 5118
					var7 = class481.method8660(var19); // L: 5119
					int var21 = class280.method5603(var19); // L: 5120
					class495 var26 = class473.method8587(var3); // L: 5121
					class493 var27 = class152.method3191(var20); // L: 5122
					int[] var28 = var27.field4985[var7]; // L: 5123
					int var12 = 0; // L: 5124
					int var13 = var28.length; // L: 5125
					if (var21 >= 0) { // L: 5126
						if (var21 >= var13) { // L: 5127
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var21 + ", Max: " + var13); // L: 5128
						}

						var12 = var21; // L: 5130
						var13 = var21 + 1; // L: 5131
					}

					Object[] var14 = var26.method8812(var7); // L: 5133
					if (var14 == null && var27.field4986 != null) { // L: 5134 5135
						var14 = var27.field4986[var7];
					}

					int var15;
					int var16;
					if (var14 == null) { // L: 5137
						for (var15 = var12; var15 < var13; ++var15) { // L: 5138
							var16 = var28[var15]; // L: 5139
							class490 var22 = WorldMapRectangle.method5458(var16); // L: 5140
							if (var22 == class490.field4976) { // L: 5141
								Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class485.method8730(var16); // L: 5142
							}
						}

						return 1; // L: 5144
					} else {
						var15 = var14.length / var28.length; // L: 5146
						if (var5 >= 0 && var5 < var15) { // L: 5147
							for (var16 = var12; var16 < var13; ++var16) { // L: 5150
								int var17 = var16 + var28.length * var5; // L: 5151
								class490 var18 = WorldMapRectangle.method5458(var28[var16]); // L: 5152
								if (var18 == class490.field4976) { // L: 5153
									Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = (String)var14[var17];
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (Integer)var14[var17]; // L: 5154
								}
							}

							return 1; // L: 5156
						} else {
							throw new RuntimeException(); // L: 5148
						}
					}
				} else if (var0 == 7503) { // L: 5158
					Interpreter.Interpreter_intStackSize -= 2; // L: 5159
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 5160
					var19 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 5161
					var5 = 0; // L: 5162
					var20 = class152.method3196(var19); // L: 5163
					var7 = class481.method8660(var19); // L: 5164
					class495 var25 = class473.method8587(var3); // L: 5165
					class493 var9 = class152.method3191(var20); // L: 5166
					int[] var10 = var9.field4985[var7]; // L: 5167
					Object[] var11 = var25.method8812(var7); // L: 5168
					if (var11 == null && var9.field4986 != null) { // L: 5169 5170
						var11 = var9.field4986[var7]; // L: 5171
					}

					if (var11 != null) { // L: 5174
						var5 = var11.length / var10.length;
					}

					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5; // L: 5175
					return 1; // L: 5176
				} else if (var0 != 7504 && var0 != 7510) { // L: 5178
					if (var0 == 7505) { // L: 5195
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5196
						class495 var24 = class473.method8587(var3); // L: 5197
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var24.field4995; // L: 5198
						return 1; // L: 5199
					} else if (var0 == 7506) { // L: 5201
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5202
						var19 = -1; // L: 5203
						if (class158.field1737 != null && var3 >= 0 && var3 < class158.field1737.size()) { // L: 5204
							var19 = (Integer)class158.field1737.get(var3); // L: 5205
						}

						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var19; // L: 5207
						return 1; // L: 5208
					} else if (var0 != 7507 && var0 != 7509) { // L: 5210
						return 2; // L: 5237
					} else {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5211
						var4 = class4.method13(var3); // L: 5212
						var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5213
						var6 = class53.method1052(var5); // L: 5214
						if (var6 == null) { // L: 5215
							throw new RuntimeException(); // L: 5216
						} else if (class152.method3196(var5) != Client.field606) { // L: 5218
							throw new RuntimeException(); // L: 5219
						} else if (class158.field1737 == null && class158.field1737.isEmpty()) { // L: 5221
							throw new RuntimeException(); // L: 5222
						} else {
							var7 = class280.method5603(var5); // L: 5224
							List var8 = var6.method8803(var4, var7); // L: 5225
							class158.field1737 = new LinkedList(class158.field1737); // L: 5226
							if (var8 != null) { // L: 5227
								class158.field1737.retainAll(var8); // L: 5228
							} else {
								class158.field1737.clear(); // L: 5231
							}

							class218.field2404 = class158.field1737.iterator(); // L: 5233
							if (var0 == 7507) { // L: 5234
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class158.field1737.size();
							}

							return 1; // L: 5235
						}
					}
				} else {
					--Interpreter.Interpreter_intStackSize; // L: 5179
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 5180
					class494 var23 = class143.method3126(var3); // L: 5181
					if (var23 == null) { // L: 5182
						throw new RuntimeException(); // L: 5183
					} else {
						class158.field1737 = var23.method8803(0, 0); // L: 5185
						var5 = 0; // L: 5186
						if (class158.field1737 != null) { // L: 5187
							Client.field606 = var3; // L: 5188
							class218.field2404 = class158.field1737.iterator(); // L: 5189
							var5 = class158.field1737.size(); // L: 5190
						}

						if (var0 == 7504) { // L: 5192
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5;
						}

						return 1; // L: 5193
					}
				}
			} else {
				if (class218.field2404 != null && class218.field2404.hasNext()) { // L: 5105
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (Integer)class218.field2404.next(); // L: 5106
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 5109
				}

				return 1; // L: 5111
			}
		} else {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5083
			var4 = class4.method13(var3); // L: 5084
			var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5085
			var6 = class53.method1052(var5); // L: 5086
			if (var6 == null) { // L: 5087
				throw new RuntimeException(); // L: 5088
			} else {
				var7 = class280.method5603(var5); // L: 5090
				class158.field1737 = var6.method8803(var4, var7); // L: 5091
				if (class158.field1737 != null) { // L: 5092
					Client.field606 = class152.method3196(var5); // L: 5093
					class218.field2404 = class158.field1737.iterator(); // L: 5094
					if (var0 == 7500) { // L: 5095
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class158.field1737.size();
					}
				} else {
					Client.field606 = -1; // L: 5098
					class218.field2404 = null; // L: 5099
					if (var0 == 7500) { // L: 5100
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1; // L: 5102
			}
		}
	}
}
