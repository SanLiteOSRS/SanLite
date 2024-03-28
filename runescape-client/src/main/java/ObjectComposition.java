import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
@Implements("ObjectComposition")
public class ObjectComposition extends DualNode {
	@ObfuscatedName("az")
	@Export("ObjectDefinition_isLowDetail")
	static boolean ObjectDefinition_isLowDetail;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("ObjectDefinition_archive")
	static AbstractArchive ObjectDefinition_archive;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("ObjectDefinition_modelsArchive")
	static AbstractArchive ObjectDefinition_modelsArchive;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("ObjectDefinition_cached")
	static EvictingDualNodeHashTable ObjectDefinition_cached;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("ObjectDefinition_cachedModelData")
	public static EvictingDualNodeHashTable ObjectDefinition_cachedModelData;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("ObjectDefinition_cachedEntities")
	static EvictingDualNodeHashTable ObjectDefinition_cachedEntities;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("ObjectDefinition_cachedModels")
	static EvictingDualNodeHashTable ObjectDefinition_cachedModels;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Ljj;"
	)
	static ModelData[] field2245;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 107387489
	)
	@Export("id")
	public int id;
	@ObfuscatedName("al")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("as")
	@Export("models")
	int[] models;
	@ObfuscatedName("ag")
	@Export("name")
	public String name;
	@ObfuscatedName("ai")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("ax")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("ar")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("aj")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1982522955
	)
	@Export("sizeX")
	public int sizeX;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1688733667
	)
	@Export("sizeY")
	public int sizeY;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 944222055
	)
	@Export("interactType")
	public int interactType;
	@ObfuscatedName("av")
	@Export("boolean1")
	public boolean boolean1;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1633724723
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -658559047
	)
	@Export("clipType")
	int clipType;
	@ObfuscatedName("am")
	@Export("nonFlatShading")
	boolean nonFlatShading;
	@ObfuscatedName("ac")
	@Export("modelClipped")
	public boolean modelClipped;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1992329689
	)
	@Export("animationId")
	public int animationId;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1065789327
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1088175045
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -2125942205
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("bc")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1619759931
	)
	@Export("mapIconId")
	public int mapIconId;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 687689859
	)
	@Export("mapSceneId")
	public int mapSceneId;
	@ObfuscatedName("bn")
	@Export("isRotated")
	boolean isRotated;
	@ObfuscatedName("bd")
	@Export("clipped")
	public boolean clipped;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1526194899
	)
	@Export("modelSizeX")
	int modelSizeX;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1599189223
	)
	@Export("modelHeight")
	int modelHeight;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -324985375
	)
	@Export("modelSizeY")
	int modelSizeY;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1024852899
	)
	@Export("offsetX")
	int offsetX;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 317042121
	)
	@Export("offsetHeight")
	int offsetHeight;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1784527037
	)
	@Export("offsetY")
	int offsetY;
	@ObfuscatedName("bu")
	@Export("boolean2")
	public boolean boolean2;
	@ObfuscatedName("br")
	@Export("isSolid")
	boolean isSolid;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -2071322713
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("by")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -141915639
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -454295663
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1952667691
	)
	@Export("ambientSoundId")
	public int ambientSoundId;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1168264064
	)
	@Export("int7")
	public int int7;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 285270400
	)
	public int field2296;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -2132531631
	)
	@Export("int6")
	public int int6;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 319150315
	)
	public int field2294;
	@ObfuscatedName("bv")
	@Export("soundEffectIds")
	public int[] soundEffectIds;
	@ObfuscatedName("bg")
	@Export("boolean3")
	public boolean boolean3;
	@ObfuscatedName("cb")
	public boolean field2297;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lto;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		ObjectDefinition_isLowDetail = false; // L: 17
		ObjectDefinition_cached = new EvictingDualNodeHashTable(4096); // L: 20
		ObjectDefinition_cachedModelData = new EvictingDualNodeHashTable(500); // L: 21
		ObjectDefinition_cachedEntities = new EvictingDualNodeHashTable(30); // L: 22
		ObjectDefinition_cachedModels = new EvictingDualNodeHashTable(30); // L: 23
		field2245 = new ModelData[4]; // L: 24
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
		this.field2296 = 0; // L: 64
		this.int6 = 0; // L: 65
		this.field2294 = 0; // L: 66
		this.boolean3 = true; // L: 68
		this.field2297 = false; // L: 69
	} // L: 72

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2140757204"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.int1 == -1) { // L: 97
			this.int1 = 0; // L: 98
			if (this.modelIds != null && (this.models == null || this.models[0] == 10)) { // L: 99
				this.int1 = 1;
			}

			for (int var1 = 0; var1 < 5; ++var1) { // L: 100
				if (this.actions[var1] != null) {
					this.int1 = 1;
				}
			}
		}

		if (this.int3 == -1) { // L: 102
			this.int3 = this.interactType != 0 ? 1 : 0;
		}

	} // L: 103

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "2138743474"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 107
			if (var2 == 0) { // L: 108
				return; // L: 111
			}

			this.decodeNext(var1, var2); // L: 109
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lur;IB)V",
		garbageValue = "101"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) { // L: 114
			var3 = var1.readUnsignedByte(); // L: 115
			if (var3 > 0) { // L: 116
				if (this.modelIds != null && !ObjectDefinition_isLowDetail) { // L: 117
					var1.offset += var3 * 3; // L: 125
				} else {
					this.models = new int[var3]; // L: 118
					this.modelIds = new int[var3]; // L: 119

					for (var4 = 0; var4 < var3; ++var4) { // L: 120
						this.modelIds[var4] = var1.readUnsignedShort(); // L: 121
						this.models[var4] = var1.readUnsignedByte(); // L: 122
					}
				}
			}
		} else if (var2 == 2) { // L: 128
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 5) { // L: 129
			var3 = var1.readUnsignedByte(); // L: 130
			if (var3 > 0) { // L: 131
				if (this.modelIds != null && !ObjectDefinition_isLowDetail) { // L: 132
					var1.offset += var3 * 2; // L: 137
				} else {
					this.models = null; // L: 133
					this.modelIds = new int[var3]; // L: 134

					for (var4 = 0; var4 < var3; ++var4) { // L: 135
						this.modelIds[var4] = var1.readUnsignedShort();
					}
				}
			}
		} else if (var2 == 14) { // L: 140
			this.sizeX = var1.readUnsignedByte();
		} else if (var2 == 15) { // L: 141
			this.sizeY = var1.readUnsignedByte();
		} else if (var2 == 17) { // L: 142
			this.interactType = 0; // L: 143
			this.boolean1 = false; // L: 144
		} else if (var2 == 18) { // L: 146
			this.boolean1 = false;
		} else if (var2 == 19) { // L: 147
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 21) { // L: 148
			this.clipType = 0;
		} else if (var2 == 22) { // L: 149
			this.nonFlatShading = true;
		} else if (var2 == 23) { // L: 150
			this.modelClipped = true;
		} else if (var2 == 24) { // L: 151
			this.animationId = var1.readUnsignedShort(); // L: 152
			if (this.animationId == 65535) { // L: 153
				this.animationId = -1;
			}
		} else if (var2 == 27) { // L: 155
			this.interactType = 1;
		} else if (var2 == 28) { // L: 156
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 29) { // L: 157
			this.ambient = var1.readByte();
		} else if (var2 == 39) { // L: 158
			this.contrast = var1.readByte() * 25;
		} else if (var2 >= 30 && var2 < 35) { // L: 159
			this.actions[var2 - 30] = var1.readStringCp1252NullTerminated(); // L: 160
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) { // L: 161
				this.actions[var2 - 30] = null;
			}
		} else if (var2 == 40) { // L: 163
			var3 = var1.readUnsignedByte(); // L: 164
			this.recolorFrom = new short[var3]; // L: 165
			this.recolorTo = new short[var3]; // L: 166

			for (var4 = 0; var4 < var3; ++var4) { // L: 167
				this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 168
				this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 169
			}
		} else if (var2 == 41) { // L: 172
			var3 = var1.readUnsignedByte(); // L: 173
			this.retextureFrom = new short[var3]; // L: 174
			this.retextureTo = new short[var3]; // L: 175

			for (var4 = 0; var4 < var3; ++var4) { // L: 176
				this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 177
				this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 178
			}
		} else if (var2 == 61) { // L: 181
			var1.readUnsignedShort(); // L: 182
		} else if (var2 == 62) { // L: 184
			this.isRotated = true;
		} else if (var2 == 64) { // L: 185
			this.clipped = false;
		} else if (var2 == 65) { // L: 186
			this.modelSizeX = var1.readUnsignedShort();
		} else if (var2 == 66) { // L: 187
			this.modelHeight = var1.readUnsignedShort();
		} else if (var2 == 67) { // L: 188
			this.modelSizeY = var1.readUnsignedShort();
		} else if (var2 == 68) { // L: 189
			this.mapSceneId = var1.readUnsignedShort();
		} else if (var2 == 69) { // L: 190
			var1.readUnsignedByte(); // L: 191
		} else if (var2 == 70) { // L: 193
			this.offsetX = var1.readShort();
		} else if (var2 == 71) { // L: 194
			this.offsetHeight = var1.readShort();
		} else if (var2 == 72) {
			this.offsetY = var1.readShort(); // L: 195
		} else if (var2 == 73) { // L: 196
			this.boolean2 = true;
		} else if (var2 == 74) { // L: 197
			this.isSolid = true;
		} else if (var2 == 75) { // L: 198
			this.int3 = var1.readUnsignedByte();
		} else if (var2 != 77 && var2 != 92) { // L: 199
			if (var2 == 78) { // L: 217
				this.ambientSoundId = var1.readUnsignedShort(); // L: 218
				this.int7 = var1.readUnsignedByte() * 128; // L: 219
				this.field2296 = var1.readUnsignedByte() * 128; // L: 220
			} else if (var2 == 79) { // L: 222
				this.int6 = var1.readUnsignedShort(); // L: 223
				this.field2294 = var1.readUnsignedShort(); // L: 224
				this.int7 = var1.readUnsignedByte() * 128; // L: 225
				this.field2296 = var1.readUnsignedByte() * 128; // L: 226
				var3 = var1.readUnsignedByte(); // L: 227
				this.soundEffectIds = new int[var3]; // L: 228

				for (var4 = 0; var4 < var3; ++var4) { // L: 229
					this.soundEffectIds[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 81) { // L: 231
				var1.readUnsignedByte();
			} else if (var2 == 82) { // L: 232
				this.mapIconId = var1.readUnsignedShort();
			} else if (var2 == 89) { // L: 233
				this.boolean3 = false;
			} else if (var2 == 90) { // L: 234
				this.field2297 = true;
			} else if (var2 == 249) { // L: 235
				this.params = SecureRandomFuture.readStringIntParameters(var1, this.params);
			}
		} else {
			this.transformVarbit = var1.readUnsignedShort(); // L: 200
			if (this.transformVarbit == 65535) { // L: 201
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort(); // L: 202
			if (this.transformVarp == 65535) { // L: 203
				this.transformVarp = -1;
			}

			var3 = -1; // L: 204
			if (var2 == 92) { // L: 205
				var3 = var1.readUnsignedShort(); // L: 206
				if (var3 == 65535) { // L: 207
					var3 = -1;
				}
			}

			var4 = var1.readUnsignedByte(); // L: 209
			this.transforms = new int[var4 + 2]; // L: 210

			for (int var5 = 0; var5 <= var4; ++var5) { // L: 211
				this.transforms[var5] = var1.readUnsignedShort(); // L: 212
				if (this.transforms[var5] == 65535) { // L: 213
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3; // L: 215
		}

	} // L: 237

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-669843534"
	)
	public final boolean method4098(int var1) {
		if (this.models != null) { // L: 240
			for (int var4 = 0; var4 < this.models.length; ++var4) { // L: 250
				if (this.models[var4] == var1) { // L: 251
					return ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var4] & 65535, 0);
				}
			}

			return true; // L: 253
		} else if (this.modelIds == null) { // L: 241
			return true;
		} else if (var1 != 10) { // L: 242
			return true;
		} else {
			boolean var2 = true; // L: 243

			for (int var3 = 0; var3 < this.modelIds.length; ++var3) { // L: 244
				var2 &= ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var3] & 65535, 0); // L: 245
			}

			return var2; // L: 247
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-669361866"
	)
	@Export("needsModelFiles")
	public final boolean needsModelFiles() {
		if (this.modelIds == null) { // L: 258
			return true;
		} else {
			boolean var1 = true; // L: 259

			for (int var2 = 0; var2 < this.modelIds.length; ++var2) { // L: 260
				var1 &= ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var2] & 65535, 0); // L: 261
			}

			return var1; // L: 263
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIII)Ljd;",
		garbageValue = "108075600"
	)
	@Export("getEntity")
	public final Renderable getEntity(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.models == null) { // L: 268
			var7 = (long)(var2 + (this.id << 10));
		} else {
			var7 = (long)(var2 + (var1 << 3) + (this.id << 10)); // L: 269
		}

		Object var9 = (Renderable)ObjectDefinition_cachedEntities.get(var7); // L: 270
		if (var9 == null) { // L: 271
			ModelData var10 = this.getModelData(var1, var2); // L: 272
			if (var10 == null) { // L: 273
				return null;
			}

			if (!this.nonFlatShading) { // L: 274
				var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			} else {
				var10.ambient = (short)(this.ambient + 64); // L: 276
				var10.contrast = (short)(this.contrast + 768); // L: 277
				var10.calculateVertexNormals(); // L: 278
				var9 = var10; // L: 279
			}

			ObjectDefinition_cachedEntities.put((DualNode)var9, var7); // L: 281
		}

		if (this.nonFlatShading) { // L: 283
			var9 = ((ModelData)var9).shallowCopy(); // L: 284
		}

		if (this.clipType >= 0) { // L: 286
			if (var9 instanceof Model) { // L: 287
				var9 = ((Model)var9).contourGround(var3, var4, var5, var6, true, this.clipType);
			} else if (var9 instanceof ModelData) {
				var9 = ((ModelData)var9).method4486(var3, var4, var5, var6, true, this.clipType); // L: 288
			}
		}

		return (Renderable)var9; // L: 290
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIIS)Ljn;",
		garbageValue = "-13668"
	)
	@Export("getModel")
	public final Model getModel(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.models == null) { // L: 295
			var7 = (long)(var2 + (this.id << 10));
		} else {
			var7 = (long)(var2 + (var1 << 3) + (this.id << 10)); // L: 296
		}

		Model var9 = (Model)ObjectDefinition_cachedModels.get(var7); // L: 297
		if (var9 == null) { // L: 298
			ModelData var10 = this.getModelData(var1, var2); // L: 299
			if (var10 == null) { // L: 300
				return null;
			}

			var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50); // L: 301
			ObjectDefinition_cachedModels.put(var9, var7); // L: 302
		}

		if (this.clipType >= 0) {
			var9 = var9.contourGround(var3, var4, var5, var6, true, this.clipType); // L: 304
		}

		return var9; // L: 305
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIILig;IB)Ljn;",
		garbageValue = "52"
	)
	@Export("getModelDynamic")
	public final Model getModelDynamic(int var1, int var2, int[][] var3, int var4, int var5, int var6, SequenceDefinition var7, int var8) {
		long var9;
		if (this.models == null) { // L: 310
			var9 = (long)(var2 + (this.id << 10));
		} else {
			var9 = (long)(var2 + (var1 << 3) + (this.id << 10)); // L: 311
		}

		Model var11 = (Model)ObjectDefinition_cachedModels.get(var9); // L: 312
		if (var11 == null) { // L: 313
			ModelData var12 = this.getModelData(var1, var2); // L: 314
			if (var12 == null) { // L: 315
				return null;
			}

			var11 = var12.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50); // L: 316
			ObjectDefinition_cachedModels.put(var11, var9); // L: 317
		}

		if (var7 == null && this.clipType == -1) { // L: 319
			return var11;
		} else {
			if (var7 != null) { // L: 320
				var11 = var7.transformObjectModel(var11, var8, var2); // L: 321
			} else {
				var11 = var11.toSharedSequenceModel(true); // L: 323
			}

			if (this.clipType >= 0) { // L: 324
				var11 = var11.contourGround(var3, var4, var5, var6, false, this.clipType);
			}

			return var11; // L: 325
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIS)Ljj;",
		garbageValue = "22966"
	)
	@Export("getModelData")
	final ModelData getModelData(int var1, int var2) {
		ModelData var3 = null; // L: 329
		boolean var4;
		int var5;
		int var7;
		if (this.models == null) { // L: 330
			if (var1 != 10) { // L: 331
				return null;
			}

			if (this.modelIds == null) { // L: 332
				return null;
			}

			var4 = this.isRotated; // L: 333
			if (var1 == 2 && var2 > 3) { // L: 334
				var4 = !var4;
			}

			var5 = this.modelIds.length; // L: 335

			for (int var6 = 0; var6 < var5; ++var6) { // L: 336
				var7 = this.modelIds[var6]; // L: 337
				if (var4) { // L: 338
					var7 += 65536;
				}

				var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var7); // L: 339
				if (var3 == null) { // L: 340
					var3 = ModelData.ModelData_get(ObjectDefinition_modelsArchive, var7 & 65535, 0); // L: 341
					if (var3 == null) { // L: 342
						return null;
					}

					if (var4) { // L: 343
						var3.method4494();
					}

					ObjectDefinition_cachedModelData.put(var3, (long)var7); // L: 344
				}

				if (var5 > 1) { // L: 346
					field2245[var6] = var3;
				}
			}

			if (var5 > 1) { // L: 348
				var3 = new ModelData(field2245, var5);
			}
		} else {
			int var9 = -1; // L: 351

			for (var5 = 0; var5 < this.models.length; ++var5) { // L: 352
				if (this.models[var5] == var1) { // L: 353
					var9 = var5; // L: 354
					break;
				}
			}

			if (var9 == -1) { // L: 358
				return null;
			}

			var5 = this.modelIds[var9]; // L: 359
			boolean var10 = this.isRotated ^ var2 > 3; // L: 360
			if (var10) { // L: 361
				var5 += 65536;
			}

			var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var5); // L: 362
			if (var3 == null) { // L: 363
				var3 = ModelData.ModelData_get(ObjectDefinition_modelsArchive, var5 & 65535, 0); // L: 364
				if (var3 == null) { // L: 365
					return null;
				}

				if (var10) { // L: 366
					var3.method4494();
				}

				ObjectDefinition_cachedModelData.put(var3, (long)var5); // L: 367
			}
		}

		if (this.modelSizeX == 128 && this.modelHeight == 128 && this.modelSizeY == 128) { // L: 371
			var4 = false; // L: 372
		} else {
			var4 = true;
		}

		boolean var11;
		if (this.offsetX == 0 && this.offsetHeight == 0 && this.offsetY == 0) { // L: 374
			var11 = false; // L: 375
		} else {
			var11 = true;
		}

		ModelData var8 = new ModelData(var3, var2 == 0 && !var4 && !var11, this.recolorFrom == null, null == this.retextureFrom, true); // L: 376
		if (var1 == 4 && var2 > 3) { // L: 377
			var8.method4491(256); // L: 378
			var8.changeOffset(45, 0, -45); // L: 379
		}

		var2 &= 3; // L: 381
		if (var2 == 1) { // L: 382
			var8.method4488();
		} else if (var2 == 2) { // L: 383
			var8.method4484();
		} else if (var2 == 3) { // L: 384
			var8.method4537();
		}

		if (this.recolorFrom != null) { // L: 385
			for (var7 = 0; var7 < this.recolorFrom.length; ++var7) { // L: 386
				var8.recolor(this.recolorFrom[var7], this.recolorTo[var7]); // L: 387
			}
		}

		if (this.retextureFrom != null) { // L: 390
			for (var7 = 0; var7 < this.retextureFrom.length; ++var7) { // L: 391
				var8.retexture(this.retextureFrom[var7], this.retextureTo[var7]); // L: 392
			}
		}

		if (var4) { // L: 395
			var8.resize(this.modelSizeX, this.modelHeight, this.modelSizeY);
		}

		if (var11) { // L: 396
			var8.changeOffset(this.offsetX, this.offsetHeight, this.offsetY);
		}

		return var8; // L: 397
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lis;",
		garbageValue = "629651101"
	)
	@Export("transform")
	public final ObjectComposition transform() {
		int var1 = -1; // L: 401
		if (this.transformVarbit != -1) { // L: 402
			var1 = SpotAnimationDefinition.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 403
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 405
			var2 = this.transforms[var1]; // L: 406
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? MouseRecorder.getObjectDefinition(var2) : null; // L: 407 408
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1423636026"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class220.method4074(this.params, var1, var2); // L: 412
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1774947499"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class27.method400(this.params, var1, var2); // L: 416
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "99"
	)
	@Export("hasSound")
	public boolean hasSound() {
		if (this.transforms == null) { // L: 427
			return this.ambientSoundId != -1 || this.soundEffectIds != null;
		} else {
			for (int var1 = 0; var1 < this.transforms.length; ++var1) { // L: 428
				if (this.transforms[var1] != -1) { // L: 429
					ObjectComposition var2 = MouseRecorder.getObjectDefinition(this.transforms[var1]); // L: 430
					if (var2.ambientSoundId != -1 || var2.soundEffectIds != null) { // L: 431
						return true;
					}
				}
			}

			return false; // L: 434
		}
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-30"
	)
	static final int method4130() {
		if (NPC.clientPreferences.method2459()) { // L: 5095
			return class172.Client_plane;
		} else {
			int var0 = 3; // L: 5096
			if (UserComparator10.cameraPitch < 310) { // L: 5097
				int var1;
				int var2;
				if (Client.oculusOrbState == 1) { // L: 5100
					var1 = class185.oculusOrbFocalPointX >> 7; // L: 5101
					var2 = Skeleton.oculusOrbFocalPointY >> 7; // L: 5102
				} else {
					var1 = class133.localPlayer.x >> 7; // L: 5105
					var2 = class133.localPlayer.y >> 7; // L: 5106
				}

				int var3 = WorldMapLabelSize.cameraX >> 7; // L: 5108
				int var4 = class193.cameraZ >> 7; // L: 5109
				if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) { // L: 5110
					return class172.Client_plane;
				}

				if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) { // L: 5111
					return class172.Client_plane;
				}

				if ((Tiles.Tiles_renderFlags[class172.Client_plane][var3][var4] & 4) != 0) { // L: 5112
					var0 = class172.Client_plane;
				}

				int var5;
				if (var1 > var3) { // L: 5114
					var5 = var1 - var3;
				} else {
					var5 = var3 - var1; // L: 5115
				}

				int var6;
				if (var2 > var4) { // L: 5117
					var6 = var2 - var4;
				} else {
					var6 = var4 - var2; // L: 5118
				}

				int var7;
				int var8;
				if (var5 > var6) { // L: 5119
					var7 = var6 * 65536 / var5; // L: 5120
					var8 = 32768; // L: 5121

					while (var3 != var1) { // L: 5122
						if (var3 < var1) { // L: 5123
							++var3;
						} else if (var3 > var1) { // L: 5124
							--var3;
						}

						if ((Tiles.Tiles_renderFlags[class172.Client_plane][var3][var4] & 4) != 0) { // L: 5125
							var0 = class172.Client_plane;
						}

						var8 += var7; // L: 5126
						if (var8 >= 65536) { // L: 5127
							var8 -= 65536; // L: 5128
							if (var4 < var2) { // L: 5129
								++var4;
							} else if (var4 > var2) { // L: 5130
								--var4;
							}

							if ((Tiles.Tiles_renderFlags[class172.Client_plane][var3][var4] & 4) != 0) { // L: 5131
								var0 = class172.Client_plane;
							}
						}
					}
				} else if (var6 > 0) { // L: 5135
					var7 = var5 * 65536 / var6; // L: 5136
					var8 = 32768; // L: 5137

					while (var2 != var4) { // L: 5138
						if (var4 < var2) { // L: 5139
							++var4;
						} else if (var4 > var2) { // L: 5140
							--var4;
						}

						if ((Tiles.Tiles_renderFlags[class172.Client_plane][var3][var4] & 4) != 0) { // L: 5141
							var0 = class172.Client_plane;
						}

						var8 += var7; // L: 5142
						if (var8 >= 65536) { // L: 5143
							var8 -= 65536; // L: 5144
							if (var3 < var1) { // L: 5145
								++var3;
							} else if (var3 > var1) { // L: 5146
								--var3;
							}

							if ((Tiles.Tiles_renderFlags[class172.Client_plane][var3][var4] & 4) != 0) { // L: 5147
								var0 = class172.Client_plane;
							}
						}
					}
				}
			}

			if (class133.localPlayer.x >= 0 && class133.localPlayer.y >= 0 && class133.localPlayer.x < 13312 && class133.localPlayer.y < 13312) { // L: 5152
				if ((Tiles.Tiles_renderFlags[class172.Client_plane][class133.localPlayer.x >> 7][class133.localPlayer.y >> 7] & 4) != 0) { // L: 5153
					var0 = class172.Client_plane;
				}

				return var0;
			} else {
				return class172.Client_plane; // L: 5154
			}
		}
	}
}
