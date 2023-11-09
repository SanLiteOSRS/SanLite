import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ho")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("NpcDefinition_archive")
	static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("NpcDefinition_cached")
	public static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("NpcDefinition_cachedModels")
	public static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1901456423
	)
	@Export("id")
	public int id;
	@ObfuscatedName("al")
	@Export("name")
	public String name;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1821133507
	)
	@Export("size")
	public int size;
	@ObfuscatedName("ac")
	@Export("models")
	int[] models;
	@ObfuscatedName("ag")
	int[] field2013;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 552267121
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 617330439
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 800077397
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -999364521
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1873794583
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -940864767
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1706128729
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1381166863
	)
	public int field2021;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1130657387
	)
	public int field2024;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 690650555
	)
	public int field2010;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1583752929
	)
	public int field2030;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1295658603
	)
	public int field2025;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -129786135
	)
	public int field2026;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 313770985
	)
	public int field2027;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1968706117
	)
	public int field2043;
	@ObfuscatedName("ai")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("bp")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("bw")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("bq")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("bi")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("bg")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1641210053
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1809060011
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1765314605
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("be")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1177249571
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1130879781
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 133198613
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("bt")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1205123301
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1778048217
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("bf")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("bu")
	@Export("isClickable")
	public boolean isClickable;
	@ObfuscatedName("bk")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("bb")
	int[] field2005;
	@ObfuscatedName("bx")
	short[] field2049;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lsc;"
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
		this.field2021 = -1; // L: 33
		this.field2024 = -1; // L: 34
		this.field2010 = -1; // L: 35
		this.field2030 = -1; // L: 36
		this.field2025 = -1; // L: 37
		this.field2026 = -1; // L: 38
		this.field2027 = -1; // L: 39
		this.field2043 = -1; // L: 40
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
		this.field2005 = null; // L: 60
		this.field2049 = null; // L: 61
	} // L: 64

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1973671350"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 83

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ltc;I)V",
		garbageValue = "-2019062220"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltc;IB)V",
		garbageValue = "20"
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
			this.field2013 = new int[var3]; // L: 138

			for (var4 = 0; var4 < var3; ++var4) { // L: 139
				this.field2013[var4] = var1.readUnsignedShort();
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

				this.field2005 = new int[var4]; // L: 156
				this.field2049 = new short[var4]; // L: 157

				for (int var6 = 0; var6 < var4; ++var6) { // L: 158
					if ((var3 & 1 << var6) == 0) { // L: 159
						this.field2005[var6] = -1; // L: 160
						this.field2049[var6] = -1; // L: 161
					} else {
						this.field2005[var6] = var1.method9095(); // L: 164
						this.field2049[var6] = (short)var1.method8980(); // L: 165
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
					this.field2021 = var1.readUnsignedShort();
				} else if (var2 == 115) { // L: 192
					this.field2021 = var1.readUnsignedShort(); // L: 193
					this.field2024 = var1.readUnsignedShort(); // L: 194
					this.field2010 = var1.readUnsignedShort(); // L: 195
					this.field2030 = var1.readUnsignedShort(); // L: 196
				} else if (var2 == 116) { // L: 198
					this.field2025 = var1.readUnsignedShort();
				} else if (var2 == 117) { // L: 199
					this.field2025 = var1.readUnsignedShort(); // L: 200
					this.field2026 = var1.readUnsignedShort(); // L: 201
					this.field2027 = var1.readUnsignedShort(); // L: 202
					this.field2043 = var1.readUnsignedShort(); // L: 203
				} else if (var2 == 249) { // L: 205
					this.params = WorldMapRegion.readStringIntParameters(var1, this.params);
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lhg;ILhg;ILht;I)Ljh;",
		garbageValue = "524883871"
	)
	public final Model method3707(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, class193 var5) {
		if (this.transforms != null) { // L: 210
			NPCComposition var10 = this.transform(); // L: 211
			return var10 == null ? null : var10.method3707(var1, var2, var3, var4, var5); // L: 212 213 215
		} else {
			long var6 = (long)this.id; // L: 217
			if (var5 != null) { // L: 218
				var6 |= var5.field2000 << 16; // L: 219
			}

			Model var8 = (Model)NpcDefinition_cachedModels.get(var6); // L: 221
			if (var8 == null) { // L: 222
				ModelData var9 = this.method3681(this.models, var5); // L: 223
				if (var9 == null) { // L: 224
					return null; // L: 225
				}

				var8 = var9.toModel(this.ambient + 64, this.contrast * 5 + 850, -30, -50, -30); // L: 227
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lht;B)Lis;",
		garbageValue = "20"
	)
	public final ModelData method3709(class193 var1) {
		if (this.transforms != null) { // L: 240
			NPCComposition var2 = this.transform(); // L: 241
			return var2 == null ? null : var2.method3709(var1); // L: 242 243 245
		} else {
			return this.method3681(this.field2013, var1); // L: 247
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([ILht;B)Lis;",
		garbageValue = "-12"
	)
	ModelData method3681(int[] var1, class193 var2) {
		int[] var3 = var1; // L: 251
		if (var2 != null && var2.field1997 != null) { // L: 252
			var3 = var2.field1997; // L: 253
		}

		if (var3 == null) { // L: 255
			return null; // L: 256
		} else {
			boolean var4 = false; // L: 258

			for (int var5 = 0; var5 < var3.length; ++var5) { // L: 259
				if (var3[var5] != -1 && !UserComparator3.NpcDefinition_modelArchive.tryLoadFile(var3[var5], 0)) { // L: 260
					var4 = true; // L: 261
				}
			}

			if (var4) { // L: 264
				return null; // L: 265
			} else {
				ModelData[] var9 = new ModelData[var3.length]; // L: 267

				for (int var6 = 0; var6 < var3.length; ++var6) { // L: 268
					var9[var6] = ModelData.ModelData_get(UserComparator3.NpcDefinition_modelArchive, var3[var6], 0); // L: 269
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
					if (var2 != null && var2.field1998 != null) { // L: 283
						var7 = var2.field1998; // L: 284
					}

					for (var8 = 0; var8 < this.recolorFrom.length; ++var8) { // L: 286
						var10.recolor(this.recolorFrom[var8], var7[var8]); // L: 287
					}
				}

				if (this.retextureFrom != null) { // L: 290
					var7 = this.retextureTo; // L: 291
					if (var2 != null && var2.field1999 != null) { // L: 292
						var7 = var2.field1999; // L: 293
					}

					for (var8 = 0; var8 < this.retextureFrom.length; ++var8) { // L: 295
						var10.retexture(this.retextureFrom[var8], var7[var8]); // L: 296
					}
				}

				return var10; // L: 299
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Lho;",
		garbageValue = "-2025833521"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1; // L: 303
		if (this.transformVarbit != -1) { // L: 304
			var1 = class327.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 305
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 307
			var2 = this.transforms[var1]; // L: 308
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class407.getNpcDefinition(var2) : null; // L: 309 310
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-429453964"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) { // L: 314
			return true;
		} else {
			int var1 = -1; // L: 315
			if (this.transformVarbit != -1) { // L: 316
				var1 = class327.getVarbit(this.transformVarbit);
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "0"
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "15"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params; // L: 342
		String var3;
		if (var4 == null) { // L: 344
			var3 = var2; // L: 345
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1); // L: 348
			if (var5 == null) { // L: 349
				var3 = var2; // L: 350
			} else {
				var3 = (String)var5.obj; // L: 353
			}
		}

		return var3; // L: 355
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "21006515"
	)
	public boolean method3678() {
		return this.field2005 != null && this.field2049 != null; // L: 359
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "605878116"
	)
	public int[] method3679() {
		return this.field2005; // L: 363
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1031014590"
	)
	public int method3680(int var1) {
		return this.field2005 != null && var1 < this.field2005.length ? this.field2005[var1] : -1; // L: 367 368 370
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)[S",
		garbageValue = "0"
	)
	public short[] method3683() {
		return this.field2049; // L: 374
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)S",
		garbageValue = "1939469577"
	)
	public short method3682(int var1) {
		return this.field2049 != null && var1 < this.field2049.length ? this.field2049[var1] : -1; // L: 378 379 381
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZS)I",
		garbageValue = "52"
	)
	static int method3720(int var0, Script var1, boolean var2) {
		boolean var3 = true; // L: 1071
		Widget var4;
		if (var0 >= 2000) { // L: 1073
			var0 -= 1000; // L: 1074
			var4 = ArchiveDiskActionHandler.getWidget(Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]); // L: 1075
			var3 = false; // L: 1076
		} else {
			var4 = var2 ? Interpreter.scriptDotWidget : HealthBarUpdate.field1223; // L: 1078
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) { // L: 1079
			var11 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] - 1; // L: 1080
			if (var11 >= 0 && var11 <= 9) { // L: 1081
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]); // L: 1085
				return 1; // L: 1086
			} else {
				--class156.Interpreter_stringStackSize; // L: 1082
				return 1; // L: 1083
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) { // L: 1088
				class336.Interpreter_intStackSize -= 2; // L: 1089
				var11 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 1090
				var6 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 1091
				var4.parent = ModelData0.getWidgetChild(var11, var6); // L: 1092
				return 1; // L: 1093
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) { // L: 1095
				var4.isScrollBar = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 1096
				return 1; // L: 1097
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) { // L: 1099
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 1100
				return 1; // L: 1101
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) { // L: 1103
				var4.dragThreshold = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 1104
				return 1; // L: 1105
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) { // L: 1107
				var4.dataText = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 1108
				return 1; // L: 1109
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) { // L: 1111
				var4.spellActionName = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 1112
				return 1; // L: 1113
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) { // L: 1115
				var4.actions = null; // L: 1116
				return 1; // L: 1117
			} else if (var0 == 1308) { // L: 1119
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 1120
				return 1; // L: 1121
			} else if (var0 == 1309) { // L: 1123
				--class336.Interpreter_intStackSize; // L: 1124
				return 1; // L: 1125
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) { // L: 1127
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) { // L: 1157
						class336.Interpreter_intStackSize -= 2; // L: 1158
						var5 = 10; // L: 1159
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]}; // L: 1160
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]}; // L: 1161
						AbstractRasterProvider.Widget_setKey(var4, var5, var8, var9); // L: 1162
						return 1; // L: 1163
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) { // L: 1165
						class336.Interpreter_intStackSize -= 3; // L: 1166
						var11 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize] - 1; // L: 1167
						var6 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 1168
						var7 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 2]; // L: 1169
						if (var11 >= 0 && var11 <= 9) { // L: 1170
							NPC.Widget_setKeyRate(var4, var11, var6, var7); // L: 1173
							return 1; // L: 1174
						} else {
							throw new RuntimeException(); // L: 1171
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) { // L: 1176
						var5 = 10; // L: 1177
						var6 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 1178
						var7 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 1179
						NPC.Widget_setKeyRate(var4, var5, var6, var7); // L: 1180
						return 1; // L: 1181
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) { // L: 1183
						--class336.Interpreter_intStackSize; // L: 1184
						var11 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize] - 1; // L: 1185
						if (var11 >= 0 && var11 <= 9) { // L: 1186
							class18.Widget_setKeyIgnoreHeld(var4, var11); // L: 1189
							return 1; // L: 1190
						} else {
							throw new RuntimeException(); // L: 1187
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) { // L: 1192
						var5 = 10; // L: 1193
						class18.Widget_setKeyIgnoreHeld(var4, var5); // L: 1194
						return 1; // L: 1195
					} else {
						return 2; // L: 1197
					}
				} else {
					byte[] var10 = null; // L: 1128
					var8 = null; // L: 1129
					if (var3) { // L: 1130
						class336.Interpreter_intStackSize -= 10; // L: 1131

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + class336.Interpreter_intStackSize] >= 0; var7 += 2) { // L: 1133 1134
						}

						if (var7 > 0) { // L: 1136
							var10 = new byte[var7 / 2]; // L: 1137
							var8 = new byte[var7 / 2]; // L: 1138

							for (var7 -= 2; var7 >= 0; var7 -= 2) { // L: 1139
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class336.Interpreter_intStackSize]; // L: 1140
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class336.Interpreter_intStackSize + 1]; // L: 1141
							}
						}
					} else {
						class336.Interpreter_intStackSize -= 2; // L: 1146
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]}; // L: 1147
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]}; // L: 1148
					}

					var7 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] - 1; // L: 1150
					if (var7 >= 0 && var7 <= 9) { // L: 1151
						AbstractRasterProvider.Widget_setKey(var4, var7, var10, var8); // L: 1154
						return 1; // L: 1155
					} else {
						throw new RuntimeException(); // L: 1152
					}
				}
			}
		}
	}
}
