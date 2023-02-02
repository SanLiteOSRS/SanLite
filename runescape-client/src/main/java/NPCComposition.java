import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gz")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("tq")
	@ObfuscatedGetter(
		intValue = 1158456013
	)
	static int field2067;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("NpcDefinition_archive")
	static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 646794717
	)
	static int field2022;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("NpcDefinition_cached")
	static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("NpcDefinition_cachedModels")
	static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -109388973
	)
	@Export("id")
	public int id;
	@ObfuscatedName("u")
	@Export("name")
	public String name;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1021399127
	)
	@Export("size")
	public int size;
	@ObfuscatedName("j")
	@Export("models")
	int[] models;
	@ObfuscatedName("g")
	int[] field2026;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -499537861
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 274326889
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -634834111
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1587887915
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1430199505
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1601988001
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1871825673
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -2080788827
	)
	public int field2035;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 752796561
	)
	public int field2038;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1054411661
	)
	public int field2039;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 875795671
	)
	public int field2040;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 903143861
	)
	public int field2041;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1152150225
	)
	public int field2042;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1129939695
	)
	public int field2043;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2023873033
	)
	public int field2044;
	@ObfuscatedName("ad")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("ao")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("am")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("av")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("au")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("ar")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -917269397
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -124469981
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1404076757
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("ab")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 408004249
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -182569543
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -478636009
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("ak")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1750524771
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -2035410821
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("ax")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("ah")
	@Export("isClickable")
	public boolean isClickable;
	@ObfuscatedName("aw")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("aj")
	int[] field2065;
	@ObfuscatedName("aq")
	short[] field2021;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		NpcDefinition_cached = new EvictingDualNodeHashTable(64); // L: 21
		NpcDefinition_cachedModels = new EvictingDualNodeHashTable(50); // L: 22
	}

	NPCComposition() {
		this.name = "null"; // L: 24
		this.size = 1; // L: 25
		this.idleSequence = -1; // L: 28
		this.turnLeftSequence = -1; // L: 29
		this.turnRightSequence = -1; // L: 30
		this.walkSequence = -1; // L: 31
		this.walkBackSequence = -1; // L: 32
		this.walkLeftSequence = -1; // L: 33
		this.walkRightSequence = -1; // L: 34
		this.field2035 = -1; // L: 35
		this.field2038 = -1; // L: 36
		this.field2039 = -1; // L: 37
		this.field2040 = -1; // L: 38
		this.field2041 = -1; // L: 39
		this.field2042 = -1; // L: 40
		this.field2043 = -1; // L: 41
		this.field2044 = -1; // L: 42
		this.actions = new String[5]; // L: 47
		this.drawMapDot = true; // L: 48
		this.combatLevel = -1; // L: 49
		this.widthScale = 128; // L: 50
		this.heightScale = 128; // L: 51
		this.isVisible = false; // L: 52
		this.ambient = 0; // L: 53
		this.contrast = 0; // L: 54
		this.rotation = 32; // L: 55
		this.transformVarbit = -1; // L: 57
		this.transformVarp = -1; // L: 58
		this.isInteractable = true; // L: 59
		this.isClickable = true; // L: 60
		this.isFollower = false; // L: 61
		this.field2065 = null; // L: 62
		this.field2021 = null; // L: 63
	} // L: 66

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-60"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 87

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lqy;B)V",
		garbageValue = "0"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 91
			if (var2 == 0) { // L: 92
				return; // L: 95
			}

			this.decodeNext(var1, var2); // L: 93
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lqy;II)V",
		garbageValue = "-1000073156"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.readUnsignedByte();
			this.models = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.models[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 2) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 12) {
			this.size = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.idleSequence = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.walkSequence = var1.readUnsignedShort();
		} else if (var2 == 15) {
			this.turnLeftSequence = var1.readUnsignedShort();
		} else if (var2 == 16) {
			this.turnRightSequence = var1.readUnsignedShort();
		} else if (var2 == 17) {
			this.walkSequence = var1.readUnsignedShort();
			this.walkBackSequence = var1.readUnsignedShort(); // L: 111
			this.walkLeftSequence = var1.readUnsignedShort();
			this.walkRightSequence = var1.readUnsignedShort();
		} else if (var2 == 18) { // L: 115
			var1.readUnsignedShort(); // L: 116
		} else if (var2 >= 30 && var2 < 35) {
			this.actions[var2 - 30] = var1.readStringCp1252NullTerminated();
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) {
				this.actions[var2 - 30] = null;
			}
		} else if (var2 == 40) {
			var3 = var1.readUnsignedByte();
			this.recolorFrom = new short[var3];
			this.recolorTo = new short[var3]; // L: 125

			for (var4 = 0; var4 < var3; ++var4) {
				this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 127
				this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 128
			}
		} else if (var2 == 41) { // L: 131
			var3 = var1.readUnsignedByte(); // L: 132
			this.retextureFrom = new short[var3]; // L: 133
			this.retextureTo = new short[var3]; // L: 134

			for (var4 = 0; var4 < var3; ++var4) { // L: 135
				this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 136
				this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 137
			}
		} else if (var2 == 60) { // L: 140
			var3 = var1.readUnsignedByte(); // L: 141
			this.field2026 = new int[var3]; // L: 142

			for (var4 = 0; var4 < var3; ++var4) { // L: 143
				this.field2026[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 93) { // L: 145
			this.drawMapDot = false;
		} else if (var2 == 95) { // L: 146
			this.combatLevel = var1.readUnsignedShort();
		} else if (var2 == 97) { // L: 147
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 98) { // L: 148
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 99) { // L: 149
			this.isVisible = true;
		} else if (var2 == 100) { // L: 150
			this.ambient = var1.readByte();
		} else if (var2 == 101) { // L: 151
			this.contrast = var1.readByte() * 5;
		} else {
			int var5;
			if (var2 == 102) { // L: 152
				if (GrandExchangeOfferUnitPriceComparator.field4275) { // L: 153
					this.field2065 = new int[1]; // L: 154
					this.field2021 = new short[1]; // L: 155
					this.field2065[0] = field2022; // L: 156
					this.field2021[0] = (short)var1.readUnsignedShort(); // L: 157
				} else {
					var3 = var1.readUnsignedByte(); // L: 160
					var4 = 0; // L: 161

					for (var5 = var3; var5 != 0; var5 >>= 1) { // L: 162 163 165
						++var4; // L: 164
					}

					this.field2065 = new int[var4]; // L: 167
					this.field2021 = new short[var4]; // L: 168

					for (int var6 = 0; var6 < var4; ++var6) { // L: 169
						if ((var3 & 1 << var6) == 0) { // L: 170
							this.field2065[var6] = -1; // L: 171
							this.field2021[var6] = -1; // L: 172
						} else {
							this.field2065[var6] = var1.method8568(); // L: 175
							this.field2021[var6] = (short)var1.method8781(); // L: 176
						}
					}
				}
			} else if (var2 == 103) { // L: 181
				this.rotation = var1.readUnsignedShort();
			} else if (var2 != 106 && var2 != 118) { // L: 182
				if (var2 == 107) { // L: 200
					this.isInteractable = false;
				} else if (var2 == 109) { // L: 201
					this.isClickable = false;
				} else if (var2 == 111) { // L: 202
					this.isFollower = true;
				} else if (var2 == 114) { // L: 203
					this.field2035 = var1.readUnsignedShort();
				} else if (var2 == 115) { // L: 204
					this.field2035 = var1.readUnsignedShort(); // L: 205
					this.field2038 = var1.readUnsignedShort(); // L: 206
					this.field2039 = var1.readUnsignedShort(); // L: 207
					this.field2040 = var1.readUnsignedShort(); // L: 208
				} else if (var2 == 116) { // L: 210
					this.field2041 = var1.readUnsignedShort();
				} else if (var2 == 117) { // L: 211
					this.field2041 = var1.readUnsignedShort(); // L: 212
					this.field2042 = var1.readUnsignedShort(); // L: 213
					this.field2043 = var1.readUnsignedShort(); // L: 214
					this.field2044 = var1.readUnsignedShort(); // L: 215
				} else if (var2 == 249) {
					this.params = DynamicObject.readStringIntParameters(var1, this.params); // L: 217
				}
			} else {
				this.transformVarbit = var1.readUnsignedShort(); // L: 183
				if (this.transformVarbit == 65535) { // L: 184
					this.transformVarbit = -1;
				}

				this.transformVarp = var1.readUnsignedShort(); // L: 185
				if (this.transformVarp == 65535) { // L: 186
					this.transformVarp = -1;
				}

				var3 = -1; // L: 187
				if (var2 == 118) { // L: 188
					var3 = var1.readUnsignedShort(); // L: 189
					if (var3 == 65535) { // L: 190
						var3 = -1;
					}
				}

				var4 = var1.readUnsignedByte(); // L: 192
				this.transforms = new int[var4 + 2]; // L: 193

				for (var5 = 0; var5 <= var4; ++var5) { // L: 194
					this.transforms[var5] = var1.readUnsignedShort(); // L: 195
					if (this.transforms[var5] == 65535) { // L: 196
						this.transforms[var5] = -1;
					}
				}

				this.transforms[var4 + 1] = var3; // L: 198
			}
		}

	} // L: 219

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lga;ILga;ILgp;B)Lhh;",
		garbageValue = "115"
	)
	public final Model method3723(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, class185 var5) {
		if (this.transforms != null) { // L: 222
			NPCComposition var10 = this.transform(); // L: 223
			return var10 == null ? null : var10.method3723(var1, var2, var3, var4, var5); // L: 224 225 227
		} else {
			long var6 = (long)this.id; // L: 229
			if (var5 != null) { // L: 230
				var6 |= var5.field2018 << 16; // L: 231
			}

			Model var8 = (Model)NpcDefinition_cachedModels.get(var6); // L: 233
			if (var8 == null) { // L: 234
				ModelData var9 = this.method3669(this.models, var5); // L: 235
				if (var9 == null) { // L: 236
					return null; // L: 237
				}

				var8 = var9.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30); // L: 239
				NpcDefinition_cachedModels.put(var8, var6); // L: 240
			}

			Model var11;
			if (var1 != null && var3 != null) {
				var11 = var1.applyTransformations(var8, var2, var3, var4); // L: 243
			} else if (var1 != null) { // L: 244
				var11 = var1.transformActorModel(var8, var2);
			} else if (var3 != null) { // L: 245
				var11 = var3.transformActorModel(var8, var4);
			} else {
				var11 = var8.toSharedSequenceModel(true); // L: 246
			}

			if (this.widthScale != 128 || this.heightScale != 128) { // L: 247
				var11.scale(this.widthScale, this.heightScale, this.widthScale);
			}

			return var11; // L: 248
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lgp;I)Lgi;",
		garbageValue = "1744013797"
	)
	public final ModelData method3666(class185 var1) {
		if (this.transforms != null) { // L: 252
			NPCComposition var2 = this.transform(); // L: 253
			return var2 == null ? null : var2.method3666(var1); // L: 254 255 257
		} else {
			return this.method3669(this.field2026, var1); // L: 259
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "([ILgp;I)Lgi;",
		garbageValue = "951395147"
	)
	ModelData method3669(int[] var1, class185 var2) {
		int[] var3 = var1; // L: 263
		if (var2 != null && var2.field2013 != null) { // L: 264
			var3 = var2.field2013; // L: 265
		}

		if (var3 == null) { // L: 267
			return null; // L: 268
		} else {
			boolean var4 = false; // L: 270

			for (int var5 = 0; var5 < var3.length; ++var5) { // L: 271
				if (var3[var5] != -1 && !class363.field4361.tryLoadFile(var3[var5], 0)) { // L: 272
					var4 = true; // L: 273
				}
			}

			if (var4) { // L: 276
				return null; // L: 277
			} else {
				ModelData[] var9 = new ModelData[var3.length]; // L: 279

				for (int var6 = 0; var6 < var3.length; ++var6) { // L: 280
					var9[var6] = ModelData.ModelData_get(class363.field4361, var3[var6], 0); // L: 281
				}

				ModelData var10;
				if (var9.length == 1) { // L: 284
					var10 = var9[0]; // L: 285
					if (var10 == null) { // L: 286
						var10 = new ModelData(var9, var9.length); // L: 287
					}
				} else {
					var10 = new ModelData(var9, var9.length); // L: 291
				}

				short[] var7;
				int var8;
				if (this.recolorFrom != null) { // L: 293
					var7 = this.recolorTo; // L: 294
					if (var2 != null && var2.field2015 != null) { // L: 295
						var7 = var2.field2015; // L: 296
					}

					for (var8 = 0; var8 < this.recolorFrom.length; ++var8) { // L: 298
						var10.recolor(this.recolorFrom[var8], var7[var8]); // L: 299
					}
				}

				if (this.retextureFrom != null) { // L: 302
					var7 = this.retextureTo; // L: 303
					if (var2 != null && var2.field2016 != null) { // L: 304
						var7 = var2.field2016; // L: 305
					}

					for (var8 = 0; var8 < this.retextureFrom.length; ++var8) { // L: 307
						var10.retexture(this.retextureFrom[var8], var7[var8]); // L: 308
					}
				}

				return var10; // L: 311
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Lgz;",
		garbageValue = "-549841481"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1; // L: 315
		if (this.transformVarbit != -1) { // L: 316
			var1 = class175.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 317
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 319
			var2 = this.transforms[var1]; // L: 320
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class129.getNpcDefinition(var2) : null; // L: 321 322
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2130957543"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) { // L: 326
			return true;
		} else {
			int var1 = -1; // L: 327
			if (this.transformVarbit != -1) { // L: 328
				var1 = class175.getVarbit(this.transformVarbit);
			} else if (this.transformVarp != -1) { // L: 329
				var1 = Varps.Varps_main[this.transformVarp];
			}

			if (var1 >= 0 && var1 < this.transforms.length) { // L: 330
				return this.transforms[var1] != -1; // L: 331
			} else {
				return this.transforms[this.transforms.length - 1] != -1;
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1577076717"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return UserComparator8.method2819(this.params, var1, var2); // L: 335
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "100"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params; // L: 340
		String var3;
		if (var4 == null) { // L: 342
			var3 = var2; // L: 343
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1); // L: 346
			if (var5 == null) { // L: 347
				var3 = var2; // L: 348
			} else {
				var3 = (String)var5.obj; // L: 351
			}
		}

		return var3; // L: 353
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-700368633"
	)
	public boolean method3672() {
		return this.field2065 != null && this.field2021 != null; // L: 362
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1876307033"
	)
	public int[] method3678() {
		return this.field2065; // L: 366
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "803471346"
	)
	public int method3663(int var1) {
		return this.field2065 != null && var1 < this.field2065.length ? this.field2065[var1] : -1; // L: 370 371 373
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "-44005875"
	)
	public short[] method3715() {
		return this.field2021; // L: 377
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)S",
		garbageValue = "257867612"
	)
	public short method3673(int var1) {
		return this.field2021 != null && var1 < this.field2021.length ? this.field2021[var1] : -1; // L: 381 382 384
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)Lgr;",
		garbageValue = "-664337463"
	)
	@Export("ItemComposition_get")
	public static ItemComposition ItemComposition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemComposition_cached.get((long)var0); // L: 96
		if (var1 != null) { // L: 97
			return var1;
		} else {
			byte[] var2 = ItemComposition.ItemComposition_archive.takeFile(10, var0); // L: 98
			var1 = new ItemComposition(); // L: 99
			var1.id = var0; // L: 100
			if (var2 != null) { // L: 101
				var1.decode(new Buffer(var2));
			}

			var1.post(); // L: 102
			if (var1.noteTemplate != -1) { // L: 103
				var1.genCert(ItemComposition_get(var1.noteTemplate), ItemComposition_get(var1.note));
			}

			if (var1.notedId != -1) { // L: 104
				var1.genBought(ItemComposition_get(var1.notedId), ItemComposition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) { // L: 105
				var1.genPlaceholder(ItemComposition_get(var1.placeholderTemplate), ItemComposition_get(var1.placeholder));
			}

			if (!Clock.ItemComposition_inMembersWorld && var1.isMembersOnly) { // L: 106
				var1.name = "Members object"; // L: 107
				var1.isTradable = false; // L: 108

				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) { // L: 109
					var1.groundActions[var3] = null; // L: 110
				}

				for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) { // L: 112
					if (var3 != 4) { // L: 113
						var1.inventoryActions[var3] = null; // L: 114
					}
				}

				var1.shiftClickIndex = -2; // L: 117
				var1.team = 0; // L: 118
				if (var1.params != null) { // L: 119
					boolean var6 = false; // L: 120

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) { // L: 121
						ParamComposition var5 = class149.getParamDefinition((int)var4.key); // L: 122
						if (var5.autoDisable) { // L: 123
							var4.remove();
						} else {
							var6 = true; // L: 124
						}
					}

					if (!var6) { // L: 126
						var1.params = null;
					}
				}
			}

			ItemComposition.ItemComposition_cached.put(var1, (long)var0); // L: 129
			return var1; // L: 130
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZI)I",
		garbageValue = "-771473401"
	)
	static int method3725(int var0, Script var1, boolean var2) {
		String var3;
		int var10;
		if (var0 == ScriptOpcodes.APPEND_NUM) { // L: 3638
			var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3639
			var10 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3640
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + var10; // L: 3641
			return 1; // L: 3642
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) { // L: 3644
				Interpreter.Interpreter_stringStackSize -= 2; // L: 3645
				var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 3646
				var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 3647
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + var4; // L: 3648
				return 1; // L: 3649
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) { // L: 3651
				var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3652
				var10 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3653
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + Huffman.intToString(var10, true); // L: 3654
				return 1; // L: 3655
			} else if (var0 == ScriptOpcodes.LOWERCASE) { // L: 3657
				var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3658
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.toLowerCase(); // L: 3659
				return 1; // L: 3660
			} else {
				int var6;
				int var11;
				if (var0 == ScriptOpcodes.FROMDATE) { // L: 3662
					var11 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3663
					long var14 = ((long)var11 + 11745L) * 86400000L; // L: 3664
					Interpreter.Interpreter_calendar.setTime(new Date(var14)); // L: 3665
					var6 = Interpreter.Interpreter_calendar.get(5); // L: 3666
					int var17 = Interpreter.Interpreter_calendar.get(2); // L: 3667
					int var8 = Interpreter.Interpreter_calendar.get(1); // L: 3668
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8; // L: 3669
					return 1; // L: 3670
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) { // L: 3672
					if (var0 == ScriptOpcodes.TOSTRING) { // L: 3684
						var11 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3685
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Integer.toString(var11); // L: 3686
						return 1; // L: 3687
					} else if (var0 == ScriptOpcodes.COMPARE) { // L: 3689
						Interpreter.Interpreter_stringStackSize -= 2; // L: 3690
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class145.method3149(DecorativeObject.compareStrings(Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1], class173.clientLanguage)); // L: 3691
						return 1; // L: 3692
					} else {
						int var9;
						byte[] var12;
						Font var13;
						if (var0 == ScriptOpcodes.PARAHEIGHT) { // L: 3694
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3695
							class87.Interpreter_intStackSize -= 2; // L: 3696
							var10 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 3697
							var9 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 3698
							var12 = class358.archive13.takeFile(var9, 0); // L: 3699
							var13 = new Font(var12); // L: 3700
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var13.lineCount(var3, var10); // L: 3701
							return 1; // L: 3702
						} else if (var0 == ScriptOpcodes.PARAWIDTH) { // L: 3704
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3705
							class87.Interpreter_intStackSize -= 2; // L: 3706
							var10 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 3707
							var9 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 3708
							var12 = class358.archive13.takeFile(var9, 0); // L: 3709
							var13 = new Font(var12); // L: 3710
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var13.lineWidth(var3, var10); // L: 3711
							return 1; // L: 3712
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) { // L: 3714
							Interpreter.Interpreter_stringStackSize -= 2; // L: 3715
							var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 3716
							var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 3717
							if (Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1) { // L: 3718
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4; // L: 3719
							}

							return 1; // L: 3720
						} else if (var0 == ScriptOpcodes.ESCAPE) { // L: 3722
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3723
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3); // L: 3724
							return 1; // L: 3725
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) { // L: 3727
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3728
							var10 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3729
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + (char)var10; // L: 3730
							return 1; // L: 3731
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) { // L: 3733
							var11 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3734
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class148.isCharPrintable((char)var11) ? 1 : 0; // L: 3735
							return 1; // L: 3736
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) { // L: 3738
							var11 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3739
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = ObjectComposition.isAlphaNumeric((char)var11) ? 1 : 0; // L: 3740
							return 1; // L: 3741
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) { // L: 3743
							var11 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3744
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = ViewportMouse.isCharAlphabetic((char)var11) ? 1 : 0; // L: 3745
							return 1; // L: 3746
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) { // L: 3748
							var11 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3749
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = WorldMapLabelSize.isDigit((char)var11) ? 1 : 0; // L: 3750
							return 1; // L: 3751
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) { // L: 3753
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3754
							if (var3 != null) { // L: 3755
								Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 3756
							}

							return 1; // L: 3757
						} else if (var0 == ScriptOpcodes.SUBSTRING) { // L: 3759
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3760
							class87.Interpreter_intStackSize -= 2; // L: 3761
							var10 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 3762
							var9 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 3763
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.substring(var10, var9); // L: 3764
							return 1; // L: 3765
						} else if (var0 == ScriptOpcodes.REMOVETAGS) { // L: 3767
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3768
							StringBuilder var16 = new StringBuilder(var3.length()); // L: 3769
							boolean var18 = false; // L: 3770

							for (var6 = 0; var6 < var3.length(); ++var6) { // L: 3771
								char var7 = var3.charAt(var6); // L: 3772
								if (var7 == '<') { // L: 3773
									var18 = true;
								} else if (var7 == '>') { // L: 3774
									var18 = false;
								} else if (!var18) { // L: 3775
									var16.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var16.toString(); // L: 3777
							return 1; // L: 3778
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) { // L: 3780
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3781
							var10 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3782
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.indexOf(var10); // L: 3783
							return 1; // L: 3784
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) { // L: 3786
							Interpreter.Interpreter_stringStackSize -= 2; // L: 3787
							var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 3788
							var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 3789
							var9 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3790
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.indexOf(var4, var9); // L: 3791
							return 1; // L: 3792
						} else if (var0 == 4122) { // L: 3794
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3795
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.toUpperCase(); // L: 3796
							return 1; // L: 3797
						} else if (var0 == 4123) { // L: 3799
							Interpreter.Interpreter_stringStackSize -= 3; // L: 3800
							var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 3801
							var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 3802
							String var5 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 2]; // L: 3803
							if (class155.localPlayer.appearance == null) { // L: 3804
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5; // L: 3805
								return 1; // L: 3806
							} else {
								switch(class155.localPlayer.appearance.field3476) { // L: 3808
								case 0:
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3; // L: 3810
									break;
								case 1:
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4; // L: 3813
									break; // L: 3814
								case 2:
								default:
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5; // L: 3817
								}

								return 1; // L: 3820
							}
						} else {
							return 2; // L: 3822
						}
					}
				} else {
					Interpreter.Interpreter_stringStackSize -= 2; // L: 3673
					var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 3674
					var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 3675
					if (class155.localPlayer.appearance != null && class155.localPlayer.appearance.field3474 != 0) { // L: 3676
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4; // L: 3680
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3; // L: 3677
					}

					return 1; // L: 3682
				}
			}
		}
	}
}
