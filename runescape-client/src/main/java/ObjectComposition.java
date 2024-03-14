import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("he")
@Implements("ObjectComposition")
public class ObjectComposition extends DualNode {
	@ObfuscatedName("aq")
	@Export("ObjectDefinition_isLowDetail")
	public static boolean ObjectDefinition_isLowDetail;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("ObjectDefinition_archive")
	public static AbstractArchive ObjectDefinition_archive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("ObjectDefinition_modelsArchive")
	public static AbstractArchive ObjectDefinition_modelsArchive;
	@ObfuscatedName("ai")
	public static boolean field2118;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("ObjectDefinition_cached")
	static EvictingDualNodeHashTable ObjectDefinition_cached;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("ObjectDefinition_cachedModelData")
	public static EvictingDualNodeHashTable ObjectDefinition_cachedModelData;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("ObjectDefinition_cachedEntities")
	static EvictingDualNodeHashTable ObjectDefinition_cachedEntities;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("ObjectDefinition_cachedModels")
	static EvictingDualNodeHashTable ObjectDefinition_cachedModels;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lkf;"
	)
	static ModelData[] field2163;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -741461527
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ak")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("ah")
	@Export("models")
	int[] models;
	@ObfuscatedName("aj")
	@Export("name")
	public String name;
	@ObfuscatedName("af")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("ax")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("an")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("ag")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -268458779
	)
	@Export("sizeX")
	public int sizeX;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 500074863
	)
	@Export("sizeY")
	public int sizeY;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 937195717
	)
	@Export("interactType")
	public int interactType;
	@ObfuscatedName("ay")
	@Export("boolean1")
	public boolean boolean1;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1089834539
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1378373733
	)
	@Export("clipType")
	int clipType;
	@ObfuscatedName("ab")
	@Export("nonFlatShading")
	boolean nonFlatShading;
	@ObfuscatedName("av")
	@Export("modelClipped")
	public boolean modelClipped;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1635606557
	)
	@Export("animationId")
	public int animationId;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -2045658089
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1344279479
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1245071989
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("bi")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1058156917
	)
	@Export("mapIconId")
	public int mapIconId;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -859238543
	)
	@Export("mapSceneId")
	public int mapSceneId;
	@ObfuscatedName("bt")
	@Export("isRotated")
	boolean isRotated;
	@ObfuscatedName("bk")
	@Export("clipped")
	public boolean clipped;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 149883361
	)
	@Export("modelSizeX")
	int modelSizeX;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -766936121
	)
	@Export("modelHeight")
	int modelHeight;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 106296047
	)
	@Export("modelSizeY")
	int modelSizeY;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1194549815
	)
	@Export("offsetX")
	int offsetX;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 160074193
	)
	@Export("offsetHeight")
	int offsetHeight;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1266365157
	)
	@Export("offsetY")
	int offsetY;
	@ObfuscatedName("br")
	@Export("boolean2")
	public boolean boolean2;
	@ObfuscatedName("bp")
	@Export("isSolid")
	boolean isSolid;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 407817173
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("bg")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 738400603
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -873573755
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 363387855
	)
	@Export("ambientSoundId")
	public int ambientSoundId;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1109311488
	)
	@Export("int7")
	public int int7;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -969427840
	)
	public int field2130;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -826106219
	)
	@Export("int6")
	public int int6;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1359996533
	)
	public int field2155;
	@ObfuscatedName("bx")
	@Export("soundEffectIds")
	public int[] soundEffectIds;
	@ObfuscatedName("cs")
	@Export("boolean3")
	public boolean boolean3;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lta;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		ObjectDefinition_isLowDetail = false; // L: 17
		field2118 = false; // L: 20
		ObjectDefinition_cached = new EvictingDualNodeHashTable(4096); // L: 21
		ObjectDefinition_cachedModelData = new EvictingDualNodeHashTable(500); // L: 22
		ObjectDefinition_cachedEntities = new EvictingDualNodeHashTable(30); // L: 23
		ObjectDefinition_cachedModels = new EvictingDualNodeHashTable(30); // L: 24
		field2163 = new ModelData[4]; // L: 25
	}

	ObjectComposition() {
		this.name = "null"; // L: 29
		this.sizeX = 1; // L: 34
		this.sizeY = 1; // L: 35
		this.interactType = 2; // L: 36
		this.boolean1 = true; // L: 37
		this.int1 = -1; // L: 38
		this.clipType = -1; // L: 39
		this.nonFlatShading = false; // L: 40
		this.modelClipped = false; // L: 41
		this.animationId = -1; // L: 42
		this.int2 = 16; // L: 43
		this.ambient = 0; // L: 44
		this.contrast = 0; // L: 45
		this.actions = new String[5]; // L: 46
		this.mapIconId = -1; // L: 47
		this.mapSceneId = -1; // L: 48
		this.isRotated = false; // L: 49
		this.clipped = true; // L: 50
		this.modelSizeX = 128; // L: 51
		this.modelHeight = 128; // L: 52
		this.modelSizeY = 128; // L: 53
		this.offsetX = 0; // L: 54
		this.offsetHeight = 0; // L: 55
		this.offsetY = 0; // L: 56
		this.boolean2 = false; // L: 57
		this.isSolid = false; // L: 58
		this.int3 = -1; // L: 59
		this.transformVarbit = -1; // L: 61
		this.transformVarp = -1; // L: 62
		this.ambientSoundId = -1; // L: 63
		this.int7 = 0; // L: 64
		this.field2130 = 0; // L: 65
		this.int6 = 0; // L: 66
		this.field2155 = 0; // L: 67
		this.boolean3 = true; // L: 69
	} // L: 72

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.int1 == -1) { // L: 91
			this.int1 = 0; // L: 92
			if (this.modelIds != null && (this.models == null || this.models[0] == 10)) { // L: 93
				this.int1 = 1;
			}

			for (int var1 = 0; var1 < 5; ++var1) { // L: 94
				if (this.actions[var1] != null) {
					this.int1 = 1;
				}
			}
		}

		if (this.int3 == -1) { // L: 96
			this.int3 = this.interactType != 0 ? 1 : 0;
		}

	} // L: 97

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luq;B)V",
		garbageValue = "16"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 101
			if (var2 == 0) { // L: 102
				return; // L: 105
			}

			this.decodeNext(var1, var2); // L: 103
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Luq;II)V",
		garbageValue = "-1457313281"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) { // L: 108
			var3 = var1.readUnsignedByte(); // L: 109
			if (var3 > 0) { // L: 110
				if (this.modelIds != null && !ObjectDefinition_isLowDetail) { // L: 111
					var1.offset += 3 * var3; // L: 119
				} else {
					this.models = new int[var3]; // L: 112
					this.modelIds = new int[var3]; // L: 113

					for (var4 = 0; var4 < var3; ++var4) { // L: 114
						this.modelIds[var4] = var1.readUnsignedShort(); // L: 115
						this.models[var4] = var1.readUnsignedByte(); // L: 116
					}
				}
			}
		} else if (var2 == 2) { // L: 122
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 5) { // L: 123
			var3 = var1.readUnsignedByte(); // L: 124
			if (var3 > 0) { // L: 125
				if (this.modelIds != null && !ObjectDefinition_isLowDetail) { // L: 126
					var1.offset += 2 * var3; // L: 131
				} else {
					this.models = null; // L: 127
					this.modelIds = new int[var3]; // L: 128

					for (var4 = 0; var4 < var3; ++var4) { // L: 129
						this.modelIds[var4] = var1.readUnsignedShort();
					}
				}
			}
		} else if (var2 == 14) { // L: 134
			this.sizeX = var1.readUnsignedByte();
		} else if (var2 == 15) { // L: 135
			this.sizeY = var1.readUnsignedByte();
		} else if (var2 == 17) { // L: 136
			this.interactType = 0; // L: 137
			this.boolean1 = false; // L: 138
		} else if (var2 == 18) { // L: 140
			this.boolean1 = false;
		} else if (var2 == 19) { // L: 141
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 21) { // L: 142
			this.clipType = 0;
		} else if (var2 == 22) { // L: 143
			this.nonFlatShading = true;
		} else if (var2 == 23) { // L: 144
			this.modelClipped = true;
		} else if (var2 == 24) { // L: 145
			this.animationId = var1.readUnsignedShort(); // L: 146
			if (this.animationId == 65535) { // L: 147
				this.animationId = -1;
			}
		} else if (var2 == 27) { // L: 149
			this.interactType = 1;
		} else if (var2 == 28) { // L: 150
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 29) { // L: 151
			this.ambient = var1.readByte();
		} else if (var2 == 39) { // L: 152
			this.contrast = var1.readByte() * 25;
		} else if (var2 >= 30 && var2 < 35) { // L: 153
			this.actions[var2 - 30] = var1.readStringCp1252NullTerminated(); // L: 154
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) { // L: 155
				this.actions[var2 - 30] = null;
			}
		} else if (var2 == 40) { // L: 157
			var3 = var1.readUnsignedByte(); // L: 158
			this.recolorFrom = new short[var3]; // L: 159
			this.recolorTo = new short[var3]; // L: 160

			for (var4 = 0; var4 < var3; ++var4) { // L: 161
				this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 162
				this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 163
			}
		} else if (var2 == 41) { // L: 166
			var3 = var1.readUnsignedByte(); // L: 167
			this.retextureFrom = new short[var3]; // L: 168
			this.retextureTo = new short[var3]; // L: 169

			for (var4 = 0; var4 < var3; ++var4) { // L: 170
				this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 171
				this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 172
			}
		} else if (var2 == 61) { // L: 175
			var1.readUnsignedShort(); // L: 176
		} else if (var2 == 62) { // L: 178
			this.isRotated = true;
		} else if (var2 == 64) { // L: 179
			this.clipped = false;
		} else if (var2 == 65) { // L: 180
			this.modelSizeX = var1.readUnsignedShort();
		} else if (var2 == 66) { // L: 181
			this.modelHeight = var1.readUnsignedShort();
		} else if (var2 == 67) { // L: 182
			this.modelSizeY = var1.readUnsignedShort();
		} else if (var2 == 68) { // L: 183
			this.mapSceneId = var1.readUnsignedShort();
		} else if (var2 == 69) { // L: 184
			var1.readUnsignedByte(); // L: 185
		} else if (var2 == 70) { // L: 187
			this.offsetX = var1.readShort();
		} else if (var2 == 71) { // L: 188
			this.offsetHeight = var1.readShort();
		} else if (var2 == 72) {
			this.offsetY = var1.readShort(); // L: 189
		} else if (var2 == 73) { // L: 190
			this.boolean2 = true;
		} else if (var2 == 74) { // L: 191
			this.isSolid = true;
		} else if (var2 == 75) { // L: 192
			this.int3 = var1.readUnsignedByte();
		} else if (var2 != 77 && var2 != 92) { // L: 193
			if (var2 == 78) { // L: 211
				this.ambientSoundId = var1.readUnsignedShort(); // L: 212
				this.int7 = var1.readUnsignedByte() * 16384; // L: 213
				this.field2130 = (field2118 ? var1.readUnsignedByte() : 0) * 128; // L: 214
			} else if (var2 == 79) { // L: 216
				this.int6 = var1.readUnsignedShort(); // L: 217
				this.field2155 = var1.readUnsignedShort(); // L: 218
				this.int7 = var1.readUnsignedByte() * 16384; // L: 219
				this.field2130 = (field2118 ? var1.readUnsignedByte() : 0) * 128; // L: 220
				var3 = var1.readUnsignedByte(); // L: 221
				this.soundEffectIds = new int[var3]; // L: 222

				for (var4 = 0; var4 < var3; ++var4) { // L: 223
					this.soundEffectIds[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 81) { // L: 225
				this.clipType = var1.readUnsignedByte() * 256;
			} else if (var2 == 82) { // L: 226
				this.mapIconId = var1.readUnsignedShort();
			} else if (var2 == 89) { // L: 227
				this.boolean3 = false;
			} else if (var2 == 249) { // L: 228
				this.params = class324.readStringIntParameters(var1, this.params);
			}
		} else {
			this.transformVarbit = var1.readUnsignedShort(); // L: 194
			if (this.transformVarbit == 65535) { // L: 195
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort(); // L: 196
			if (this.transformVarp == 65535) { // L: 197
				this.transformVarp = -1;
			}

			var3 = -1; // L: 198
			if (var2 == 92) { // L: 199
				var3 = var1.readUnsignedShort(); // L: 200
				if (var3 == 65535) { // L: 201
					var3 = -1;
				}
			}

			var4 = var1.readUnsignedByte(); // L: 203
			this.transforms = new int[var4 + 2]; // L: 204

			for (int var5 = 0; var5 <= var4; ++var5) { // L: 205
				this.transforms[var5] = var1.readUnsignedShort(); // L: 206
				if (this.transforms[var5] == 65535) { // L: 207
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3; // L: 209
		}

	} // L: 230

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-623242503"
	)
	public final boolean method3925(int var1) {
		if (this.models != null) { // L: 233
			for (int var4 = 0; var4 < this.models.length; ++var4) { // L: 243
				if (this.models[var4] == var1) { // L: 244
					return ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var4] & 65535, 0);
				}
			}

			return true; // L: 246
		} else if (this.modelIds == null) { // L: 234
			return true;
		} else if (var1 != 10) { // L: 235
			return true;
		} else {
			boolean var2 = true; // L: 236

			for (int var3 = 0; var3 < this.modelIds.length; ++var3) { // L: 237
				var2 &= ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var3] & 65535, 0); // L: 238
			}

			return var2; // L: 240
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "28"
	)
	@Export("needsModelFiles")
	public final boolean needsModelFiles() {
		if (this.modelIds == null) { // L: 251
			return true;
		} else {
			boolean var1 = true; // L: 252

			for (int var2 = 0; var2 < this.modelIds.length; ++var2) { // L: 253
				var1 &= ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var2] & 65535, 0); // L: 254
			}

			return var1; // L: 256
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIII)Lky;",
		garbageValue = "1924118332"
	)
	@Export("getEntity")
	public final Renderable getEntity(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.models == null) { // L: 261
			var7 = (long)(var2 + (this.id << 10));
		} else {
			var7 = (long)(var2 + (var1 << 3) + (this.id << 10)); // L: 262
		}

		Object var9 = (Renderable)ObjectDefinition_cachedEntities.get(var7); // L: 263
		if (var9 == null) { // L: 264
			ModelData var10 = this.getModelData(var1, var2); // L: 265
			if (var10 == null) { // L: 266
				return null;
			}

			if (!this.nonFlatShading) { // L: 267
				var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			} else {
				var10.ambient = (short)(this.ambient + 64); // L: 269
				var10.contrast = (short)(this.contrast + 768); // L: 270
				var10.calculateVertexNormals(); // L: 271
				var9 = var10; // L: 272
			}

			ObjectDefinition_cachedEntities.put((DualNode)var9, var7); // L: 274
		}

		if (this.nonFlatShading) { // L: 276
			var9 = ((ModelData)var9).shallowCopy(); // L: 277
		}

		if (this.clipType * 65536 >= 0) { // L: 279
			if (var9 instanceof Model) { // L: 280
				var9 = ((Model)var9).contourGround(var3, var4, var5, var6, true, this.clipType * 65536);
			} else if (var9 instanceof ModelData) {
				var9 = ((ModelData)var9).method5182(var3, var4, var5, var6, true, this.clipType * 65536); // L: 281
			}
		}

		return (Renderable)var9; // L: 283
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIII)Lkz;",
		garbageValue = "-1898420221"
	)
	@Export("getModel")
	public final Model getModel(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.models == null) { // L: 288
			var7 = (long)(var2 + (this.id << 10));
		} else {
			var7 = (long)(var2 + (var1 << 3) + (this.id << 10)); // L: 289
		}

		Model var9 = (Model)ObjectDefinition_cachedModels.get(var7); // L: 290
		if (var9 == null) { // L: 291
			ModelData var10 = this.getModelData(var1, var2); // L: 292
			if (var10 == null) { // L: 293
				return null;
			}

			var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50); // L: 294
			ObjectDefinition_cachedModels.put(var9, var7); // L: 295
		}

		if (this.clipType * 65536 >= 0) {
			var9 = var9.contourGround(var3, var4, var5, var6, true, this.clipType * 65536); // L: 297
		}

		return var9; // L: 298
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIILhs;IB)Lkz;",
		garbageValue = "-113"
	)
	@Export("getModelDynamic")
	public final Model getModelDynamic(int var1, int var2, int[][] var3, int var4, int var5, int var6, SequenceDefinition var7, int var8) {
		long var9;
		if (this.models == null) { // L: 303
			var9 = (long)(var2 + (this.id << 10));
		} else {
			var9 = (long)(var2 + (var1 << 3) + (this.id << 10)); // L: 304
		}

		Model var11 = (Model)ObjectDefinition_cachedModels.get(var9); // L: 305
		if (var11 == null) { // L: 306
			ModelData var12 = this.getModelData(var1, var2); // L: 307
			if (var12 == null) { // L: 308
				return null;
			}

			var11 = var12.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50); // L: 309
			ObjectDefinition_cachedModels.put(var11, var9); // L: 310
		}

		if (var7 == null && this.clipType * 65536 == -1) { // L: 312
			return var11;
		} else {
			if (var7 != null) { // L: 313
				var11 = var7.transformObjectModel(var11, var8, var2); // L: 314
			} else {
				var11 = var11.toSharedSequenceModel(true); // L: 316
			}

			if (this.clipType * 65536 >= 0) { // L: 317
				var11 = var11.contourGround(var3, var4, var5, var6, false, this.clipType * 65536);
			}

			return var11; // L: 318
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)Lkf;",
		garbageValue = "-1547269588"
	)
	@Export("getModelData")
	final ModelData getModelData(int var1, int var2) {
		ModelData var3 = null; // L: 322
		boolean var4;
		int var5;
		int var7;
		if (this.models == null) { // L: 323
			if (var1 != 10) { // L: 324
				return null;
			}

			if (this.modelIds == null) { // L: 325
				return null;
			}

			var4 = this.isRotated; // L: 326
			if (var1 == 2 && var2 > 3) { // L: 327
				var4 = !var4;
			}

			var5 = this.modelIds.length; // L: 328

			for (int var6 = 0; var6 < var5; ++var6) { // L: 329
				var7 = this.modelIds[var6]; // L: 330
				if (var4) { // L: 331
					var7 += 65536;
				}

				var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var7); // L: 332
				if (var3 == null) { // L: 333
					var3 = ModelData.ModelData_get(ObjectDefinition_modelsArchive, var7 & 65535, 0); // L: 334
					if (var3 == null) { // L: 335
						return null;
					}

					if (var4) { // L: 336
						var3.method5256();
					}

					ObjectDefinition_cachedModelData.put(var3, (long)var7); // L: 337
				}

				if (var5 > 1) { // L: 339
					field2163[var6] = var3;
				}
			}

			if (var5 > 1) { // L: 341
				var3 = new ModelData(field2163, var5);
			}
		} else {
			int var9 = -1; // L: 344

			for (var5 = 0; var5 < this.models.length; ++var5) { // L: 345
				if (this.models[var5] == var1) { // L: 346
					var9 = var5; // L: 347
					break;
				}
			}

			if (var9 == -1) { // L: 351
				return null;
			}

			var5 = this.modelIds[var9]; // L: 352
			boolean var10 = this.isRotated ^ var2 > 3; // L: 353
			if (var10) { // L: 354
				var5 += 65536;
			}

			var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var5); // L: 355
			if (var3 == null) { // L: 356
				var3 = ModelData.ModelData_get(ObjectDefinition_modelsArchive, var5 & 65535, 0); // L: 357
				if (var3 == null) { // L: 358
					return null;
				}

				if (var10) { // L: 359
					var3.method5256();
				}

				ObjectDefinition_cachedModelData.put(var3, (long)var5); // L: 360
			}
		}

		if (this.modelSizeX == 128 && this.modelHeight == 128 && this.modelSizeY == 128) { // L: 364
			var4 = false; // L: 365
		} else {
			var4 = true;
		}

		boolean var11;
		if (this.offsetX == 0 && this.offsetHeight == 0 && this.offsetY == 0) { // L: 367
			var11 = false; // L: 368
		} else {
			var11 = true;
		}

		ModelData var8 = new ModelData(var3, var2 == 0 && !var4 && !var11, null == this.recolorFrom, this.retextureFrom == null, true); // L: 369
		if (var1 == 4 && var2 > 3) { // L: 370
			var8.method5187(256); // L: 371
			var8.changeOffset(45, 0, -45); // L: 372
		}

		var2 &= 3; // L: 374
		if (var2 == 1) { // L: 375
			var8.method5184();
		} else if (var2 == 2) { // L: 376
			var8.method5177();
		} else if (var2 == 3) { // L: 377
			var8.method5186();
		}

		if (this.recolorFrom != null) { // L: 378
			for (var7 = 0; var7 < this.recolorFrom.length; ++var7) { // L: 379
				var8.recolor(this.recolorFrom[var7], this.recolorTo[var7]); // L: 380
			}
		}

		if (this.retextureFrom != null) { // L: 383
			for (var7 = 0; var7 < this.retextureFrom.length; ++var7) { // L: 384
				var8.retexture(this.retextureFrom[var7], this.retextureTo[var7]); // L: 385
			}
		}

		if (var4) { // L: 388
			var8.resize(this.modelSizeX, this.modelHeight, this.modelSizeY);
		}

		if (var11) { // L: 389
			var8.changeOffset(this.offsetX, this.offsetHeight, this.offsetY);
		}

		return var8; // L: 390
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lhe;",
		garbageValue = "-1174034912"
	)
	@Export("transform")
	public final ObjectComposition transform() {
		int var1 = -1; // L: 394
		if (this.transformVarbit != -1) { // L: 395
			var1 = class332.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 396
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 398
			var2 = this.transforms[var1]; // L: 399
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class127.getObjectDefinition(var2) : null; // L: 400 401
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "699962041"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params; // L: 406
		int var3;
		if (var4 == null) { // L: 408
			var3 = var2; // L: 409
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1); // L: 412
			if (var5 == null) { // L: 413
				var3 = var2; // L: 414
			} else {
				var3 = var5.integer; // L: 417
			}
		}

		return var3; // L: 419
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "2"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params; // L: 424
		String var3;
		if (var4 == null) { // L: 426
			var3 = var2; // L: 427
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1); // L: 430
			if (var5 == null) { // L: 431
				var3 = var2; // L: 432
			} else {
				var3 = (String)var5.obj; // L: 435
			}
		}

		return var3; // L: 437
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1958511328"
	)
	@Export("hasSound")
	public boolean hasSound() {
		if (this.transforms == null) { // L: 448
			return this.ambientSoundId != -1 || this.soundEffectIds != null;
		} else {
			for (int var1 = 0; var1 < this.transforms.length; ++var1) { // L: 449
				if (this.transforms[var1] != -1) { // L: 450
					ObjectComposition var2 = class127.getObjectDefinition(this.transforms[var1]); // L: 451
					if (var2.ambientSoundId != -1 || var2.soundEffectIds != null) { // L: 452
						return true;
					}
				}
			}

			return false; // L: 455
		}
	}
}
