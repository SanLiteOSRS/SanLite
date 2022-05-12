import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
@Implements("ObjectComposition")
public class ObjectComposition extends DualNode {
	@ObfuscatedName("o")
	@Export("ObjectDefinition_isLowDetail")
	static boolean ObjectDefinition_isLowDetail;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("ObjectDefinition_archive")
	static AbstractArchive ObjectDefinition_archive;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("ObjectDefinition_modelsArchive")
	static AbstractArchive ObjectDefinition_modelsArchive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("ObjectDefinition_cached")
	public static EvictingDualNodeHashTable ObjectDefinition_cached;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("ObjectDefinition_cachedModelData")
	public static EvictingDualNodeHashTable ObjectDefinition_cachedModelData;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("ObjectDefinition_cachedEntities")
	public static EvictingDualNodeHashTable ObjectDefinition_cachedEntities;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("ObjectDefinition_cachedModels")
	public static EvictingDualNodeHashTable ObjectDefinition_cachedModels;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "[Lgs;"
	)
	static ModelData[] field2085;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 429332721
	)
	@Export("id")
	public int id;
	@ObfuscatedName("v")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("y")
	@Export("models")
	int[] models;
	@ObfuscatedName("c")
	@Export("name")
	public String name;
	@ObfuscatedName("w")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("b")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("t")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("g")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 183520013
	)
	@Export("sizeX")
	public int sizeX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -5146313
	)
	@Export("sizeY")
	public int sizeY;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1008016331
	)
	@Export("interactType")
	public int interactType;
	@ObfuscatedName("h")
	@Export("boolean1")
	public boolean boolean1;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -300793899
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 414217251
	)
	@Export("clipType")
	int clipType;
	@ObfuscatedName("j")
	@Export("nonFlatShading")
	boolean nonFlatShading;
	@ObfuscatedName("z")
	@Export("modelClipped")
	public boolean modelClipped;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 900942841
	)
	@Export("animationId")
	public int animationId;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -495384223
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1077699639
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1494486919
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("am")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1927190147
	)
	@Export("mapIconId")
	public int mapIconId;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1184310053
	)
	@Export("mapSceneId")
	public int mapSceneId;
	@ObfuscatedName("aj")
	@Export("isRotated")
	boolean isRotated;
	@ObfuscatedName("ae")
	@Export("clipped")
	public boolean clipped;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1447845467
	)
	@Export("modelSizeX")
	int modelSizeX;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -561351305
	)
	@Export("modelHeight")
	int modelHeight;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1485595305
	)
	@Export("modelSizeY")
	int modelSizeY;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 562270847
	)
	@Export("offsetX")
	int offsetX;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1875918697
	)
	@Export("offsetHeight")
	int offsetHeight;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1644689347
	)
	@Export("offsetY")
	int offsetY;
	@ObfuscatedName("al")
	@Export("boolean2")
	public boolean boolean2;
	@ObfuscatedName("aq")
	@Export("isSolid")
	boolean isSolid;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1954919343
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("an")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1903420193
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 735656301
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -358109515
	)
	@Export("ambientSoundId")
	public int ambientSoundId;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -938201117
	)
	@Export("int7")
	public int int7;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -2049921577
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1600091331
	)
	@Export("int6")
	public int int6;
	@ObfuscatedName("aa")
	@Export("soundEffectIds")
	public int[] soundEffectIds;
	@ObfuscatedName("ax")
	@Export("boolean3")
	public boolean boolean3;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		ObjectDefinition_isLowDetail = false; // L: 17
		ObjectDefinition_cached = new EvictingDualNodeHashTable(4096); // L: 20
		ObjectDefinition_cachedModelData = new EvictingDualNodeHashTable(500); // L: 21
		ObjectDefinition_cachedEntities = new EvictingDualNodeHashTable(30); // L: 22
		ObjectDefinition_cachedModels = new EvictingDualNodeHashTable(30); // L: 23
		field2085 = new ModelData[4]; // L: 24
	}

	ObjectComposition() {
		this.name = "null"; // L: 28
		this.sizeX = 1; // L: 33
		this.sizeY = 1; // L: 34
		this.interactType = 2; // L: 35
		this.boolean1 = true; // L: 36
		this.int1 = -1; // L: 37
		this.clipType = -1; // L: 38
		this.nonFlatShading = false; // L: 39
		this.modelClipped = false; // L: 40
		this.animationId = -1; // L: 41
		this.int2 = 16; // L: 42
		this.ambient = 0; // L: 43
		this.contrast = 0; // L: 44
		this.actions = new String[5]; // L: 45
		this.mapIconId = -1; // L: 46
		this.mapSceneId = -1; // L: 47
		this.isRotated = false; // L: 48
		this.clipped = true; // L: 49
		this.modelSizeX = 128; // L: 50
		this.modelHeight = 128; // L: 51
		this.modelSizeY = 128; // L: 52
		this.offsetX = 0; // L: 53
		this.offsetHeight = 0; // L: 54
		this.offsetY = 0; // L: 55
		this.boolean2 = false; // L: 56
		this.isSolid = false; // L: 57
		this.int3 = -1; // L: 58
		this.transformVarbit = -1; // L: 60
		this.transformVarp = -1; // L: 61
		this.ambientSoundId = -1; // L: 62
		this.int7 = 0; // L: 63
		this.int5 = 0; // L: 64
		this.int6 = 0; // L: 65
		this.boolean3 = true; // L: 67
	} // L: 70

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-23"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.int1 == -1) { // L: 95
			this.int1 = 0; // L: 96
			if (this.modelIds != null && (this.models == null || this.models[0] == 10)) { // L: 97
				this.int1 = 1;
			}

			for (int var1 = 0; var1 < 5; ++var1) { // L: 98
				if (this.actions[var1] != null) {
					this.int1 = 1;
				}
			}
		}

		if (this.int3 == -1) { // L: 100
			this.int3 = this.interactType != 0 ? 1 : 0;
		}

	} // L: 101

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "805835073"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 105
			if (var2 == 0) { // L: 106
				return; // L: 109
			}

			this.decodeNext(var1, var2); // L: 107
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lpx;II)V",
		garbageValue = "-1407305271"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) { // L: 112
			var3 = var1.readUnsignedByte(); // L: 113
			if (var3 > 0) { // L: 114
				if (this.modelIds != null && !ObjectDefinition_isLowDetail) { // L: 115
					var1.offset += 3 * var3; // L: 123
				} else {
					this.models = new int[var3]; // L: 116
					this.modelIds = new int[var3]; // L: 117

					for (var4 = 0; var4 < var3; ++var4) { // L: 118
						this.modelIds[var4] = var1.readUnsignedShort(); // L: 119
						this.models[var4] = var1.readUnsignedByte(); // L: 120
					}
				}
			}
		} else if (var2 == 2) { // L: 126
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 5) { // L: 127
			var3 = var1.readUnsignedByte(); // L: 128
			if (var3 > 0) { // L: 129
				if (this.modelIds != null && !ObjectDefinition_isLowDetail) { // L: 130
					var1.offset += var3 * 2; // L: 135
				} else {
					this.models = null; // L: 131
					this.modelIds = new int[var3]; // L: 132

					for (var4 = 0; var4 < var3; ++var4) { // L: 133
						this.modelIds[var4] = var1.readUnsignedShort();
					}
				}
			}
		} else if (var2 == 14) { // L: 138
			this.sizeX = var1.readUnsignedByte();
		} else if (var2 == 15) { // L: 139
			this.sizeY = var1.readUnsignedByte();
		} else if (var2 == 17) { // L: 140
			this.interactType = 0; // L: 141
			this.boolean1 = false; // L: 142
		} else if (var2 == 18) { // L: 144
			this.boolean1 = false;
		} else if (var2 == 19) { // L: 145
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 21) { // L: 146
			this.clipType = 0;
		} else if (var2 == 22) { // L: 147
			this.nonFlatShading = true;
		} else if (var2 == 23) { // L: 148
			this.modelClipped = true;
		} else if (var2 == 24) { // L: 149
			this.animationId = var1.readUnsignedShort(); // L: 150
			if (this.animationId == 65535) { // L: 151
				this.animationId = -1;
			}
		} else if (var2 == 27) { // L: 153
			this.interactType = 1;
		} else if (var2 == 28) { // L: 154
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 29) { // L: 155
			this.ambient = var1.readByte();
		} else if (var2 == 39) { // L: 156
			this.contrast = var1.readByte() * 25;
		} else if (var2 >= 30 && var2 < 35) { // L: 157
			this.actions[var2 - 30] = var1.readStringCp1252NullTerminated(); // L: 158
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) { // L: 159
				this.actions[var2 - 30] = null;
			}
		} else if (var2 == 40) { // L: 161
			var3 = var1.readUnsignedByte(); // L: 162
			this.recolorFrom = new short[var3]; // L: 163
			this.recolorTo = new short[var3]; // L: 164

			for (var4 = 0; var4 < var3; ++var4) { // L: 165
				this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 166
				this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 167
			}
		} else if (var2 == 41) { // L: 170
			var3 = var1.readUnsignedByte(); // L: 171
			this.retextureFrom = new short[var3]; // L: 172
			this.retextureTo = new short[var3]; // L: 173

			for (var4 = 0; var4 < var3; ++var4) { // L: 174
				this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 175
				this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 176
			}
		} else if (var2 == 61) { // L: 179
			var1.readUnsignedShort(); // L: 180
		} else if (var2 == 62) { // L: 182
			this.isRotated = true;
		} else if (var2 == 64) { // L: 183
			this.clipped = false;
		} else if (var2 == 65) { // L: 184
			this.modelSizeX = var1.readUnsignedShort();
		} else if (var2 == 66) { // L: 185
			this.modelHeight = var1.readUnsignedShort();
		} else if (var2 == 67) { // L: 186
			this.modelSizeY = var1.readUnsignedShort();
		} else if (var2 == 68) { // L: 187
			this.mapSceneId = var1.readUnsignedShort();
		} else if (var2 == 69) { // L: 188
			var1.readUnsignedByte(); // L: 189
		} else if (var2 == 70) { // L: 191
			this.offsetX = var1.readShort();
		} else if (var2 == 71) { // L: 192
			this.offsetHeight = var1.readShort();
		} else if (var2 == 72) {
			this.offsetY = var1.readShort(); // L: 193
		} else if (var2 == 73) { // L: 194
			this.boolean2 = true;
		} else if (var2 == 74) { // L: 195
			this.isSolid = true;
		} else if (var2 == 75) { // L: 196
			this.int3 = var1.readUnsignedByte();
		} else if (var2 != 77 && var2 != 92) { // L: 197
			if (var2 == 78) { // L: 215
				this.ambientSoundId = var1.readUnsignedShort(); // L: 216
				this.int7 = var1.readUnsignedByte(); // L: 217
			} else if (var2 == 79) { // L: 219
				this.int5 = var1.readUnsignedShort(); // L: 220
				this.int6 = var1.readUnsignedShort(); // L: 221
				this.int7 = var1.readUnsignedByte(); // L: 222
				var3 = var1.readUnsignedByte(); // L: 223
				this.soundEffectIds = new int[var3]; // L: 224

				for (var4 = 0; var4 < var3; ++var4) { // L: 225
					this.soundEffectIds[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 81) { // L: 227
				this.clipType = var1.readUnsignedByte() * 256;
			} else if (var2 == 82) { // L: 228
				this.mapIconId = var1.readUnsignedShort();
			} else if (var2 == 89) { // L: 229
				this.boolean3 = false;
			} else if (var2 == 249) { // L: 230
				this.params = JagexCache.readStringIntParameters(var1, this.params);
			}
		} else {
			this.transformVarbit = var1.readUnsignedShort(); // L: 198
			if (this.transformVarbit == 65535) { // L: 199
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort(); // L: 200
			if (this.transformVarp == 65535) { // L: 201
				this.transformVarp = -1;
			}

			var3 = -1; // L: 202
			if (var2 == 92) { // L: 203
				var3 = var1.readUnsignedShort(); // L: 204
				if (var3 == 65535) { // L: 205
					var3 = -1;
				}
			}

			var4 = var1.readUnsignedByte(); // L: 207
			this.transforms = new int[var4 + 2]; // L: 208

			for (int var5 = 0; var5 <= var4; ++var5) { // L: 209
				this.transforms[var5] = var1.readUnsignedShort(); // L: 210
				if (this.transforms[var5] == 65535) { // L: 211
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3; // L: 213
		}

	} // L: 232

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "14"
	)
	public final boolean method3589(int var1) {
		if (this.models != null) { // L: 235
			for (int var4 = 0; var4 < this.models.length; ++var4) { // L: 245
				if (this.models[var4] == var1) { // L: 246
					return ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var4] & 65535, 0);
				}
			}

			return true; // L: 248
		} else if (this.modelIds == null) { // L: 236
			return true;
		} else if (var1 != 10) { // L: 237
			return true;
		} else {
			boolean var2 = true; // L: 238

			for (int var3 = 0; var3 < this.modelIds.length; ++var3) { // L: 239
				var2 &= ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var3] & 65535, 0); // L: 240
			}

			return var2; // L: 242
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	@Export("needsModelFiles")
	public final boolean needsModelFiles() {
		if (this.modelIds == null) { // L: 253
			return true;
		} else {
			boolean var1 = true; // L: 254

			for (int var2 = 0; var2 < this.modelIds.length; ++var2) { // L: 255
				var1 &= ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var2] & 65535, 0); // L: 256
			}

			return var1; // L: 258
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIII)Lgx;",
		garbageValue = "-491315765"
	)
	@Export("getEntity")
	public final Renderable getEntity(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.models == null) { // L: 263
			var7 = (long)(var2 + (this.id << 10));
		} else {
			var7 = (long)(var2 + (var1 << 3) + (this.id << 10)); // L: 264
		}

		Object var9 = (Renderable)ObjectDefinition_cachedEntities.get(var7); // L: 265
		if (var9 == null) { // L: 266
			ModelData var10 = this.getModelData(var1, var2); // L: 267
			if (var10 == null) { // L: 268
				return null;
			}

			if (!this.nonFlatShading) { // L: 269
				var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			} else {
				var10.ambient = (short)(this.ambient + 64); // L: 271
				var10.contrast = (short)(this.contrast + 768); // L: 272
				var10.calculateVertexNormals(); // L: 273
				var9 = var10; // L: 274
			}

			ObjectDefinition_cachedEntities.put((DualNode)var9, var7); // L: 276
		}

		if (this.nonFlatShading) { // L: 278
			var9 = ((ModelData)var9).shallowCopy(); // L: 279
		}

		if (this.clipType * 65536 >= 0) { // L: 281
			if (var9 instanceof Model) { // L: 282
				var9 = ((Model)var9).contourGround(var3, var4, var5, var6, true, this.clipType * 65536);
			} else if (var9 instanceof ModelData) {
				var9 = ((ModelData)var9).method3847(var3, var4, var5, var6, true, this.clipType * 65536); // L: 283
			}
		}

		return (Renderable)var9; // L: 285
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIII)Lhv;",
		garbageValue = "1913626278"
	)
	@Export("getModel")
	public final Model getModel(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.models == null) { // L: 290
			var7 = (long)(var2 + (this.id << 10));
		} else {
			var7 = (long)(var2 + (var1 << 3) + (this.id << 10)); // L: 291
		}

		Model var9 = (Model)ObjectDefinition_cachedModels.get(var7); // L: 292
		if (var9 == null) { // L: 293
			ModelData var10 = this.getModelData(var1, var2); // L: 294
			if (var10 == null) { // L: 295
				return null;
			}

			var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50); // L: 296
			ObjectDefinition_cachedModels.put(var9, var7); // L: 297
		}

		if (this.clipType * 65536 >= 0) {
			var9 = var9.contourGround(var3, var4, var5, var6, true, this.clipType * 65536); // L: 299
		}

		return var9; // L: 300
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIILgq;IB)Lhv;",
		garbageValue = "2"
	)
	@Export("getModelDynamic")
	public final Model getModelDynamic(int var1, int var2, int[][] var3, int var4, int var5, int var6, SequenceDefinition var7, int var8) {
		long var9;
		if (this.models == null) { // L: 305
			var9 = (long)(var2 + (this.id << 10));
		} else {
			var9 = (long)(var2 + (var1 << 3) + (this.id << 10)); // L: 306
		}

		Model var11 = (Model)ObjectDefinition_cachedModels.get(var9); // L: 307
		if (var11 == null) { // L: 308
			ModelData var12 = this.getModelData(var1, var2); // L: 309
			if (var12 == null) { // L: 310
				return null;
			}

			var11 = var12.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50); // L: 311
			ObjectDefinition_cachedModels.put(var11, var9); // L: 312
		}

		if (var7 == null && this.clipType * 65536 == -1) { // L: 314
			return var11;
		} else {
			if (var7 != null) { // L: 315
				var11 = var7.transformObjectModel(var11, var8, var2); // L: 316
			} else {
				var11 = var11.toSharedSequenceModel(true); // L: 318
			}

			if (this.clipType * 65536 >= 0) { // L: 319
				var11 = var11.contourGround(var3, var4, var5, var6, false, this.clipType * 65536);
			}

			return var11; // L: 320
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(III)Lgs;",
		garbageValue = "732231403"
	)
	@Export("getModelData")
	final ModelData getModelData(int var1, int var2) {
		ModelData var3 = null; // L: 324
		boolean var4;
		int var5;
		int var7;
		if (this.models == null) { // L: 325
			if (var1 != 10) { // L: 326
				return null;
			}

			if (this.modelIds == null) { // L: 327
				return null;
			}

			var4 = this.isRotated; // L: 328
			if (var1 == 2 && var2 > 3) { // L: 329
				var4 = !var4;
			}

			var5 = this.modelIds.length; // L: 330

			for (int var6 = 0; var6 < var5; ++var6) { // L: 331
				var7 = this.modelIds[var6]; // L: 332
				if (var4) { // L: 333
					var7 += 65536;
				}

				var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var7); // L: 334
				if (var3 == null) { // L: 335
					var3 = ModelData.ModelData_get(ObjectDefinition_modelsArchive, var7 & 65535, 0); // L: 336
					if (var3 == null) { // L: 337
						return null;
					}

					if (var4) { // L: 338
						var3.method3841();
					}

					ObjectDefinition_cachedModelData.put(var3, (long)var7); // L: 339
				}

				if (var5 > 1) { // L: 341
					field2085[var6] = var3;
				}
			}

			if (var5 > 1) { // L: 343
				var3 = new ModelData(field2085, var5);
			}
		} else {
			int var9 = -1; // L: 346

			for (var5 = 0; var5 < this.models.length; ++var5) { // L: 347
				if (this.models[var5] == var1) { // L: 348
					var9 = var5; // L: 349
					break;
				}
			}

			if (var9 == -1) { // L: 353
				return null;
			}

			var5 = this.modelIds[var9]; // L: 354
			boolean var10 = this.isRotated ^ var2 > 3; // L: 355
			if (var10) { // L: 356
				var5 += 65536;
			}

			var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var5); // L: 357
			if (var3 == null) { // L: 358
				var3 = ModelData.ModelData_get(ObjectDefinition_modelsArchive, var5 & 65535, 0); // L: 359
				if (var3 == null) { // L: 360
					return null;
				}

				if (var10) { // L: 361
					var3.method3841();
				}

				ObjectDefinition_cachedModelData.put(var3, (long)var5); // L: 362
			}
		}

		if (this.modelSizeX == 128 && this.modelHeight == 128 && this.modelSizeY == 128) { // L: 366
			var4 = false; // L: 367
		} else {
			var4 = true;
		}

		boolean var11;
		if (this.offsetX == 0 && this.offsetHeight == 0 && this.offsetY == 0) { // L: 369
			var11 = false; // L: 370
		} else {
			var11 = true;
		}

		ModelData var8 = new ModelData(var3, var2 == 0 && !var4 && !var11, null == this.recolorFrom, this.retextureFrom == null, true); // L: 371
		if (var1 == 4 && var2 > 3) { // L: 372
			var8.method3823(256); // L: 373
			var8.changeOffset(45, 0, -45); // L: 374
		}

		var2 &= 3; // L: 376
		if (var2 == 1) { // L: 377
			var8.method3820();
		} else if (var2 == 2) { // L: 378
			var8.method3854();
		} else if (var2 == 3) { // L: 379
			var8.method3822();
		}

		if (this.recolorFrom != null) { // L: 380
			for (var7 = 0; var7 < this.recolorFrom.length; ++var7) { // L: 381
				var8.recolor(this.recolorFrom[var7], this.recolorTo[var7]); // L: 382
			}
		}

		if (this.retextureFrom != null) { // L: 385
			for (var7 = 0; var7 < this.retextureFrom.length; ++var7) { // L: 386
				var8.retexture(this.retextureFrom[var7], this.retextureTo[var7]); // L: 387
			}
		}

		if (var4) { // L: 390
			var8.resize(this.modelSizeX, this.modelHeight, this.modelSizeY);
		}

		if (var11) { // L: 391
			var8.changeOffset(this.offsetX, this.offsetHeight, this.offsetY);
		}

		return var8; // L: 392
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Lgy;",
		garbageValue = "-6"
	)
	@Export("transform")
	public final ObjectComposition transform() {
		int var1 = -1; // L: 396
		if (this.transformVarbit != -1) { // L: 397
			var1 = class18.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 398
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 400
			var2 = this.transforms[var1]; // L: 401
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class82.getObjectDefinition(var2) : null; // L: 402 403
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1202873066"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class154.method3061(this.params, var1, var2); // L: 407
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1010860947"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return AttackOption.method2393(this.params, var1, var2); // L: 411
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1092849853"
	)
	@Export("hasSound")
	public boolean hasSound() {
		if (this.transforms == null) { // L: 415
			return this.ambientSoundId != -1 || this.soundEffectIds != null;
		} else {
			for (int var1 = 0; var1 < this.transforms.length; ++var1) { // L: 416
				if (this.transforms[var1] != -1) { // L: 417
					ObjectComposition var2 = class82.getObjectDefinition(this.transforms[var1]); // L: 418
					if (var2.ambientSoundId != -1 || var2.soundEffectIds != null) { // L: 419
						return true;
					}
				}
			}

			return false; // L: 422
		}
	}
}
