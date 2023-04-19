import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hq")
@Implements("ObjectComposition")
public class ObjectComposition extends DualNode {
	@ObfuscatedName("af")
	@Export("ObjectDefinition_isLowDetail")
	static boolean ObjectDefinition_isLowDetail;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("ObjectDefinition_archive")
	static AbstractArchive ObjectDefinition_archive;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("ObjectDefinition_cached")
	static EvictingDualNodeHashTable ObjectDefinition_cached;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("ObjectDefinition_cachedModelData")
	public static EvictingDualNodeHashTable ObjectDefinition_cachedModelData;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("ObjectDefinition_cachedEntities")
	static EvictingDualNodeHashTable ObjectDefinition_cachedEntities;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("ObjectDefinition_cachedModels")
	static EvictingDualNodeHashTable ObjectDefinition_cachedModels;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Liz;"
	)
	static ModelData[] field2162;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1529817365
	)
	@Export("id")
	public int id;
	@ObfuscatedName("aa")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("ay")
	@Export("models")
	int[] models;
	@ObfuscatedName("ao")
	@Export("name")
	public String name;
	@ObfuscatedName("ax")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("ai")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("ag")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("ah")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1339930361
	)
	@Export("sizeX")
	public int sizeX;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1659393955
	)
	@Export("sizeY")
	public int sizeY;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -973955889
	)
	@Export("interactType")
	public int interactType;
	@ObfuscatedName("as")
	@Export("boolean1")
	public boolean boolean1;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 415653149
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1437543955
	)
	@Export("clipType")
	int clipType;
	@ObfuscatedName("az")
	@Export("nonFlatShading")
	boolean nonFlatShading;
	@ObfuscatedName("ad")
	@Export("modelClipped")
	public boolean modelClipped;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1292954189
	)
	@Export("animationId")
	public int animationId;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -89408815
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1284125631
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -18088891
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("bi")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1270945427
	)
	@Export("mapIconId")
	public int mapIconId;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 771086195
	)
	@Export("mapSceneId")
	public int mapSceneId;
	@ObfuscatedName("bx")
	@Export("isRotated")
	boolean isRotated;
	@ObfuscatedName("bo")
	@Export("clipped")
	public boolean clipped;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -60584503
	)
	@Export("modelSizeX")
	int modelSizeX;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -950870759
	)
	@Export("modelHeight")
	int modelHeight;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1734306655
	)
	@Export("modelSizeY")
	int modelSizeY;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 105607279
	)
	@Export("offsetX")
	int offsetX;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1068622067
	)
	@Export("offsetHeight")
	int offsetHeight;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 629285153
	)
	@Export("offsetY")
	int offsetY;
	@ObfuscatedName("bs")
	@Export("boolean2")
	public boolean boolean2;
	@ObfuscatedName("br")
	@Export("isSolid")
	boolean isSolid;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1850643527
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("bu")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1411927451
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1685173773
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1970571505
	)
	@Export("ambientSoundId")
	public int ambientSoundId;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1548061831
	)
	@Export("int7")
	public int int7;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 2043119067
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1060997983
	)
	@Export("int6")
	public int int6;
	@ObfuscatedName("bc")
	@Export("soundEffectIds")
	public int[] soundEffectIds;
	@ObfuscatedName("bh")
	@Export("boolean3")
	public boolean boolean3;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		ObjectDefinition_isLowDetail = false; // L: 17
		ObjectDefinition_cached = new EvictingDualNodeHashTable(4096); // L: 20
		ObjectDefinition_cachedModelData = new EvictingDualNodeHashTable(500); // L: 21
		ObjectDefinition_cachedEntities = new EvictingDualNodeHashTable(30); // L: 22
		ObjectDefinition_cachedModels = new EvictingDualNodeHashTable(30); // L: 23
		field2162 = new ModelData[4]; // L: 24
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "97"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.int1 == -1) {
			this.int1 = 0;
			if (this.modelIds != null && (this.models == null || this.models[0] == 10)) { // L: 97
				this.int1 = 1;
			}

			for (int var1 = 0; var1 < 5; ++var1) {
				if (this.actions[var1] != null) {
					this.int1 = 1;
				}
			}
		}

		if (this.int3 == -1) {
			this.int3 = this.interactType != 0 ? 1 : 0;
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)V",
		garbageValue = "1333765973"
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lsg;IB)V",
		garbageValue = "16"
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
				this.params = ChatChannel.readStringIntParameters(var1, this.params);
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1491101758"
	)
	public final boolean method3982(int var1) {
		if (this.models != null) { // L: 235
			for (int var4 = 0; var4 < this.models.length; ++var4) { // L: 245
				if (this.models[var4] == var1) { // L: 246
					return class157.ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var4] & 65535, 0);
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
				var2 &= class157.ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var3] & 65535, 0); // L: 240
			}

			return var2; // L: 242
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-681431683"
	)
	@Export("needsModelFiles")
	public final boolean needsModelFiles() {
		if (this.modelIds == null) { // L: 253
			return true;
		} else {
			boolean var1 = true; // L: 254

			for (int var2 = 0; var2 < this.modelIds.length; ++var2) { // L: 255
				var1 &= class157.ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var2] & 65535, 0); // L: 256
			}

			return var1; // L: 258
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIIB)Liv;",
		garbageValue = "-73"
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
				var9 = ((ModelData)var9).method4316(var3, var4, var5, var6, true, this.clipType * 65536); // L: 283
			}
		}

		return (Renderable)var9; // L: 285
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIIB)Lit;",
		garbageValue = "-58"
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIILha;II)Lit;",
		garbageValue = "-1613097024"
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)Liz;",
		garbageValue = "-512287449"
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
					var3 = ModelData.ModelData_get(class157.ObjectDefinition_modelsArchive, var7 & 65535, 0); // L: 336
					if (var3 == null) { // L: 337
						return null;
					}

					if (var4) { // L: 338
						var3.method4325();
					}

					ObjectDefinition_cachedModelData.put(var3, (long)var7); // L: 339
				}

				if (var5 > 1) { // L: 341
					field2162[var6] = var3;
				}
			}

			if (var5 > 1) { // L: 343
				var3 = new ModelData(field2162, var5);
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
				var3 = ModelData.ModelData_get(class157.ObjectDefinition_modelsArchive, var5 & 65535, 0); // L: 359
				if (var3 == null) { // L: 360
					return null;
				}

				if (var10) { // L: 361
					var3.method4325();
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

		ModelData var8 = new ModelData(var3, var2 == 0 && !var4 && !var11, this.recolorFrom == null, this.retextureFrom == null, true); // L: 371
		if (var1 == 4 && var2 > 3) { // L: 372
			var8.method4387(256); // L: 373
			var8.changeOffset(45, 0, -45); // L: 374
		}

		var2 &= 3; // L: 376
		if (var2 == 1) { // L: 377
			var8.method4318();
		} else if (var2 == 2) { // L: 378
			var8.method4321();
		} else if (var2 == 3) { // L: 379
			var8.method4320();
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Lhq;",
		garbageValue = "45"
	)
	@Export("transform")
	public final ObjectComposition transform() {
		int var1 = -1; // L: 396
		if (this.transformVarbit != -1) { // L: 397
			var1 = class252.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 398
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 400
			var2 = this.transforms[var1]; // L: 401
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class144.getObjectDefinition(var2) : null; // L: 402 403
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1848862363"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params; // L: 408
		int var3;
		if (var4 == null) { // L: 410
			var3 = var2; // L: 411
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1); // L: 414
			if (var5 == null) { // L: 415
				var3 = var2; // L: 416
			} else {
				var3 = var5.integer; // L: 419
			}
		}

		return var3; // L: 421
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1804170179"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return EnumComposition.method3750(this.params, var1, var2); // L: 425
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1940318911"
	)
	@Export("hasSound")
	public boolean hasSound() {
		if (this.transforms == null) { // L: 436
			return this.ambientSoundId != -1 || this.soundEffectIds != null;
		} else {
			for (int var1 = 0; var1 < this.transforms.length; ++var1) { // L: 437
				if (this.transforms[var1] != -1) { // L: 438
					ObjectComposition var2 = class144.getObjectDefinition(this.transforms[var1]); // L: 439
					if (var2.ambientSoundId != -1 || var2.soundEffectIds != null) { // L: 440
						return true;
					}
				}
			}

			return false; // L: 443
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lch;",
		garbageValue = "-114"
	)
	static Script method4026(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16)); // L: 84
		if (var2 != null) { // L: 85
			return var2; // L: 86
		} else {
			String var3 = String.valueOf(var0); // L: 88
			int var4 = class126.archive12.getGroupId(var3); // L: 89
			if (var4 == -1) { // L: 90
				return null; // L: 91
			} else {
				byte[] var5 = class126.archive12.takeFileFlat(var4); // L: 93
				if (var5 != null) { // L: 94
					if (var5.length <= 1) { // L: 95
						return null; // L: 96
					}

					var2 = class33.newScript(var5); // L: 98
					if (var2 != null) { // L: 99
						Script.Script_cached.put(var2, (long)(var0 << 16)); // L: 100
						return var2; // L: 101
					}
				}

				return null; // L: 104
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1105978425"
	)
	public static boolean method4028(int var0) {
		return (var0 >> 22 & 1) != 0; // L: 25
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZB)I",
		garbageValue = "6"
	)
	static int method3999(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) { // L: 2280
			Interpreter.Interpreter_intStackSize -= 3; // L: 2281
			class133.queueSoundEffect(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]); // L: 2282
			return 1; // L: 2283
		} else if (var0 == ScriptOpcodes.SOUND_SONG) { // L: 2285
			class1.playSong(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 2286
			return 1; // L: 2287
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) { // L: 2289
			Interpreter.Interpreter_intStackSize -= 2; // L: 2290
			CollisionMap.method4272(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 2291
			return 1; // L: 2292
		} else {
			class86 var3;
			class85 var4;
			int var5;
			int var6;
			String var12;
			if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) { // L: 2294
				boolean var13;
				if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) { // L: 2406
					if (var0 == 3211) { // L: 2515
						return 1; // L: 2516
					} else {
						int var9;
						int var10;
						if (var0 == 3216) { // L: 2518
							var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2519
							var10 = 0; // L: 2520
							class86 var16 = (class86)StructComposition.findEnumerated(ArchiveDiskAction.method6617(), var9); // L: 2521
							if (var16 != null) { // L: 2522
								var10 = var16 != class86.field1080 ? 1 : 0; // L: 2523
							}

							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var10; // L: 2525
							return 1; // L: 2526
						} else if (var0 == 3218) { // L: 2528
							var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2529
							var10 = 0; // L: 2530
							class85 var11 = (class85)StructComposition.findEnumerated(class121.method2991(), var9); // L: 2531
							if (var11 != null) { // L: 2532
								var10 = var11 != class85.field1065 ? 1 : 0; // L: 2533
							}

							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var10; // L: 2535
							return 1; // L: 2536
						} else if (var0 != 3217 && var0 != 3219) { // L: 2538
							return 2; // L: 2613
						} else {
							var3 = class86.field1080; // L: 2539
							var4 = class85.field1065; // L: 2540
							var13 = true; // L: 2541
							boolean var14 = true; // L: 2542
							int var7;
							if (var0 == 3217) { // L: 2543
								var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2544
								var3 = (class86)StructComposition.findEnumerated(ArchiveDiskAction.method6617(), var7); // L: 2545
								if (var3 == null) { // L: 2546
									throw new RuntimeException(String.format("Unrecognized device option %d", var7)); // L: 2547
								}
							}

							if (var0 == 3219) { // L: 2550
								var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2551
								var4 = (class85)StructComposition.findEnumerated(class121.method2991(), var7); // L: 2552
								if (var4 == null) { // L: 2553
									throw new RuntimeException(String.format("Unrecognized game option %d", var7)); // L: 2554
								}
							}

							String var8;
							byte var15;
							if (var4 == class85.field1065) { // L: 2557
								switch(var3.field1081) { // L: 2558
								case 1:
								case 2:
								case 3:
									var15 = 0; // L: 2580
									var6 = 1; // L: 2581
									break; // L: 2582
								case 4:
									var15 = 0; // L: 2566
									var6 = Integer.MAX_VALUE; // L: 2567
									break;
								case 5:
									var15 = 0; // L: 2572
									var6 = 100; // L: 2573
									break; // L: 2574
								default:
									var8 = String.format("Unkown device option: %s.", var3.toString()); // L: 2561
									throw new RuntimeException(var8); // L: 2562
								}
							} else {
								switch(var4.field1066) { // L: 2587
								case 1:
									var15 = 0; // L: 2598
									var6 = 1; // L: 2599
									break; // L: 2600
								case 2:
								case 3:
								case 4:
									var15 = 0; // L: 2592
									var6 = 100; // L: 2593
									break; // L: 2594
								default:
									var8 = String.format("Unkown game option: %s.", var4.toString()); // L: 2604
									throw new RuntimeException(var8); // L: 2605
								}
							}

							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var15; // L: 2609
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6; // L: 2610
							return 1; // L: 2611
						}
					}
				} else {
					var3 = class86.field1080; // L: 2407
					var4 = class85.field1065; // L: 2408
					var13 = false; // L: 2409
					if (var0 == 3214) { // L: 2410
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2411
						var3 = (class86)StructComposition.findEnumerated(ArchiveDiskAction.method6617(), var6); // L: 2412
						if (var3 == null) { // L: 2413
							throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2414
						}
					}

					if (var0 == 3215) { // L: 2417
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2418
						var4 = (class85)StructComposition.findEnumerated(class121.method2991(), var6); // L: 2419
						if (var4 == null) { // L: 2420
							throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2421
						}
					}

					if (var0 == 3210) { // L: 2424
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2425
						var3 = (class86)StructComposition.findEnumerated(ArchiveDiskAction.method6617(), var6); // L: 2426
						if (var3 == null) { // L: 2427
							var4 = (class85)StructComposition.findEnumerated(class121.method2991(), var6); // L: 2428
							if (var4 == null) { // L: 2429
								throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2430
							}
						}
					} else if (var0 == 3182) { // L: 2434
						var3 = class86.field1078; // L: 2435
					} else if (var0 == 3204) { // L: 2437
						var4 = class85.field1070; // L: 2438
					} else if (var0 == 3206) { // L: 2440
						var4 = class85.field1064; // L: 2441
					} else if (var0 == 3208) { // L: 2443
						var4 = class85.field1067; // L: 2444
					}

					if (var4 == class85.field1065) { // L: 2446
						switch(var3.field1081) { // L: 2447
						case 1:
							var5 = class20.clientPreferences.method2450() ? 1 : 0; // L: 2465
							break; // L: 2466
						case 2:
							var5 = class20.clientPreferences.method2534() ? 1 : 0; // L: 2470
							break; // L: 2471
						case 3:
							var5 = class20.clientPreferences.method2455() ? 1 : 0; // L: 2450
							break;
						case 4:
							var5 = class20.clientPreferences.method2467(); // L: 2455
							break; // L: 2456
						case 5:
							var5 = class103.method2714(); // L: 2460
							break; // L: 2461
						default:
							var12 = String.format("Unkown device option: %s.", var3.toString()); // L: 2475
							throw new RuntimeException(var12); // L: 2476
						}
					} else {
						switch(var4.field1066) { // L: 2481
						case 1:
							var5 = class20.clientPreferences.method2513() ? 1 : 0; // L: 2495
							break; // L: 2496
						case 2:
							var6 = class20.clientPreferences.method2461(); // L: 2506
							var5 = Math.round((float)(var6 * 100) / 255.0F); // L: 2507
							break; // L: 2508
						case 3:
							var6 = class20.clientPreferences.method2463(); // L: 2500
							var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2501
							break; // L: 2502
						case 4:
							var6 = class20.clientPreferences.method2465(); // L: 2484
							var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2485
							break; // L: 2486
						default:
							var12 = String.format("Unkown game option: %s.", var4.toString()); // L: 2490
							throw new RuntimeException(var12); // L: 2491
						}
					}

					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5; // L: 2512
					return 1; // L: 2513
				}
			} else {
				var3 = class86.field1080; // L: 2295
				var4 = class85.field1065; // L: 2296
				var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2297
				if (var0 == 3212) { // L: 2298
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2299
					var3 = (class86)StructComposition.findEnumerated(ArchiveDiskAction.method6617(), var6); // L: 2300
					if (var3 == null) { // L: 2301
						throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2302
					}
				}

				if (var0 == 3213) { // L: 2305
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2306
					var4 = (class85)StructComposition.findEnumerated(class121.method2991(), var6); // L: 2307
					if (var4 == null) { // L: 2308
						throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2309
					}
				}

				if (var0 == 3209) { // L: 2312
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2313
					var3 = (class86)StructComposition.findEnumerated(ArchiveDiskAction.method6617(), var6); // L: 2314
					if (var3 == null) { // L: 2315
						var4 = (class85)StructComposition.findEnumerated(class121.method2991(), var6); // L: 2316
						if (var4 == null) { // L: 2317
							throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2318
						}
					}
				} else if (var0 == 3181) { // L: 2322
					var3 = class86.field1078; // L: 2323
				} else if (var0 == 3203) { // L: 2325
					var4 = class85.field1070; // L: 2326
				} else if (var0 == 3205) { // L: 2328
					var4 = class85.field1064; // L: 2329
				} else if (var0 == 3207) { // L: 2331
					var4 = class85.field1067; // L: 2332
				}

				if (var4 == class85.field1065) { // L: 2334
					switch(var3.field1081) { // L: 2335
					case 1:
						class20.clientPreferences.method2449(var5 == 1); // L: 2354
						break; // L: 2355
					case 2:
						class20.clientPreferences.method2531(var5 == 1); // L: 2338
						break;
					case 3:
						class20.clientPreferences.method2483(var5 == 1); // L: 2364
						break; // L: 2365
					case 4:
						if (var5 < 0) { // L: 2343
							var5 = 0;
						}

						class20.clientPreferences.method2540(var5); // L: 2344
						break; // L: 2345
					case 5:
						ApproximateRouteStrategy.method1205(var5); // L: 2359
						break; // L: 2360
					default:
						var12 = String.format("Unkown device option: %s.", var3.toString()); // L: 2349
						throw new RuntimeException(var12); // L: 2350
					}
				} else {
					switch(var4.field1066) { // L: 2370
					case 1:
						class20.clientPreferences.method2448(var5 == 1); // L: 2399
						break;
					case 2:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 2392
						var6 = Math.round((float)(var5 * 255) / 100.0F); // L: 2393
						class86.method2286(var6); // L: 2394
						break; // L: 2395
					case 3:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 2378
						var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 2379
						class130.method3125(var6); // L: 2380
						break; // L: 2381
					case 4:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 2385
						var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 2386
						class135.method3182(var6); // L: 2387
						break; // L: 2388
					default:
						var12 = String.format("Unkown game option: %s.", var4.toString()); // L: 2373
						throw new RuntimeException(var12); // L: 2374
					}
				}

				return 1; // L: 2404
			}
		}
	}
}
