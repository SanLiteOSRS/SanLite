import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
@Implements("ObjectComposition")
public class ObjectComposition extends DualNode {
	@ObfuscatedName("c")
	@Export("ObjectDefinition_isLowDetail")
	static boolean ObjectDefinition_isLowDetail;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("ObjectDefinition_modelsArchive")
	static AbstractArchive ObjectDefinition_modelsArchive;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("ObjectDefinition_cached")
	static EvictingDualNodeHashTable ObjectDefinition_cached;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("ObjectDefinition_cachedModelData")
	public static EvictingDualNodeHashTable ObjectDefinition_cachedModelData;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("ObjectDefinition_cachedEntities")
	static EvictingDualNodeHashTable ObjectDefinition_cachedEntities;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("ObjectDefinition_cachedModels")
	static EvictingDualNodeHashTable ObjectDefinition_cachedModels;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lgw;"
	)
	static ModelData[] field2046;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1742000735
	)
	@Export("id")
	public int id;
	@ObfuscatedName("i")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("s")
	@Export("models")
	int[] models;
	@ObfuscatedName("t")
	@Export("name")
	public String name;
	@ObfuscatedName("z")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("r")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("u")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("k")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1037896673
	)
	@Export("sizeX")
	public int sizeX;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -309599979
	)
	@Export("sizeY")
	public int sizeY;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1585435431
	)
	@Export("interactType")
	public int interactType;
	@ObfuscatedName("a")
	@Export("boolean1")
	public boolean boolean1;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 2124439429
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 300128547
	)
	@Export("clipType")
	int clipType;
	@ObfuscatedName("n")
	@Export("nonFlatShading")
	boolean nonFlatShading;
	@ObfuscatedName("o")
	@Export("modelClipped")
	public boolean modelClipped;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -618063313
	)
	@Export("animationId")
	public int animationId;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 695291791
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -376621693
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1901487179
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("al")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1508458181
	)
	@Export("mapIconId")
	public int mapIconId;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -367744149
	)
	@Export("mapSceneId")
	public int mapSceneId;
	@ObfuscatedName("ap")
	@Export("isRotated")
	boolean isRotated;
	@ObfuscatedName("ac")
	@Export("clipped")
	public boolean clipped;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -345999905
	)
	@Export("modelSizeX")
	int modelSizeX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 461344115
	)
	@Export("modelHeight")
	int modelHeight;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -810719341
	)
	@Export("modelSizeY")
	int modelSizeY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1329633289
	)
	@Export("offsetX")
	int offsetX;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -128908105
	)
	@Export("offsetHeight")
	int offsetHeight;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -938812699
	)
	@Export("offsetY")
	int offsetY;
	@ObfuscatedName("ar")
	@Export("boolean2")
	public boolean boolean2;
	@ObfuscatedName("at")
	@Export("isSolid")
	boolean isSolid;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 2035670131
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("aq")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1220162285
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 769818309
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 437630537
	)
	@Export("ambientSoundId")
	public int ambientSoundId;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -173069521
	)
	@Export("int7")
	public int int7;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1931671447
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -658821357
	)
	@Export("int6")
	public int int6;
	@ObfuscatedName("aa")
	@Export("soundEffectIds")
	public int[] soundEffectIds;
	@ObfuscatedName("ay")
	@Export("boolean3")
	public boolean boolean3;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		ObjectDefinition_isLowDetail = false; // L: 17
		ObjectDefinition_cached = new EvictingDualNodeHashTable(4096); // L: 20
		ObjectDefinition_cachedModelData = new EvictingDualNodeHashTable(500); // L: 21
		ObjectDefinition_cachedEntities = new EvictingDualNodeHashTable(30); // L: 22
		ObjectDefinition_cachedModels = new EvictingDualNodeHashTable(30); // L: 23
		field2046 = new ModelData[4]; // L: 24
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqt;B)V",
		garbageValue = "54"
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lqt;II)V",
		garbageValue = "-514347442"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) { // L: 112
			var3 = var1.readUnsignedByte(); // L: 113
			if (var3 > 0) { // L: 114
				if (this.modelIds != null && !ObjectDefinition_isLowDetail) { // L: 115
					var1.offset += var3 * 3; // L: 123
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
		} else if (var2 == 40) {
			var3 = var1.readUnsignedByte();
			this.recolorFrom = new short[var3];
			this.recolorTo = new short[var3];

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
				this.params = LoginScreenAnimation.readStringIntParameters(var1, this.params);
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "2"
	)
	public final boolean method3658(int var1) {
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1902282651"
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIII)Lgj;",
		garbageValue = "-1277673655"
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
				var9 = ((ModelData)var9).method3921(var3, var4, var5, var6, true, this.clipType * 65536); // L: 283
			}
		}

		return (Renderable)var9; // L: 285
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIII)Lhy;",
		garbageValue = "1709740208"
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
			var9 = var9.contourGround(var3, var4, var5, var6, true, this.clipType * 65536);
		}

		return var9;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIILgc;II)Lhy;",
		garbageValue = "1963934887"
	)
	@Export("getModelDynamic")
	public final Model getModelDynamic(int var1, int var2, int[][] var3, int var4, int var5, int var6, SequenceDefinition var7, int var8) {
		long var9;
		if (this.models == null) {
			var9 = (long)(var2 + (this.id << 10));
		} else {
			var9 = (long)(var2 + (var1 << 3) + (this.id << 10)); // L: 306
		}

		Model var11 = (Model)ObjectDefinition_cachedModels.get(var9); // L: 307
		if (var11 == null) {
			ModelData var12 = this.getModelData(var1, var2);
			if (var12 == null) {
				return null;
			}

			var11 = var12.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50); // L: 311
			ObjectDefinition_cachedModels.put(var11, var9); // L: 312
		}

		if (var7 == null && this.clipType * 65536 == -1) { // L: 314
			return var11;
		} else {
			if (var7 != null) {
				var11 = var7.transformObjectModel(var11, var8, var2);
			} else {
				var11 = var11.toSharedSequenceModel(true);
			}

			if (this.clipType * 65536 >= 0) { // L: 319
				var11 = var11.contourGround(var3, var4, var5, var6, false, this.clipType * 65536);
			}

			return var11; // L: 320
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)Lgw;",
		garbageValue = "2066734728"
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
						var3.method3973();
					}

					ObjectDefinition_cachedModelData.put(var3, (long)var7); // L: 339
				}

				if (var5 > 1) { // L: 341
					field2046[var6] = var3;
				}
			}

			if (var5 > 1) { // L: 343
				var3 = new ModelData(field2046, var5);
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
					var3.method3973();
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
			var8.method3935(256); // L: 373
			var8.changeOffset(45, 0, -45); // L: 374
		}

		var2 &= 3; // L: 376
		if (var2 == 1) { // L: 377
			var8.method3932();
		} else if (var2 == 2) { // L: 378
			var8.method3933();
		} else if (var2 == 3) { // L: 379
			var8.method3942();
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Lgk;",
		garbageValue = "-2142713479"
	)
	@Export("transform")
	public final ObjectComposition transform() {
		int var1 = -1; // L: 396
		if (this.transformVarbit != -1) { // L: 397
			var1 = class388.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 398
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 400
			var2 = this.transforms[var1]; // L: 401
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class162.getObjectDefinition(var2) : null; // L: 402 403
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-31"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class124.method2818(this.params, var1, var2); // L: 407
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;S)Ljava/lang/String;",
		garbageValue = "-1891"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params; // L: 412
		String var3;
		if (var4 == null) { // L: 414
			var3 = var2; // L: 415
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1); // L: 418
			if (var5 == null) { // L: 419
				var3 = var2; // L: 420
			} else {
				var3 = (String)var5.obj; // L: 423
			}
		}

		return var3; // L: 425
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "143735341"
	)
	@Export("hasSound")
	public boolean hasSound() {
		if (this.transforms == null) { // L: 436
			return this.ambientSoundId != -1 || this.soundEffectIds != null;
		} else {
			for (int var1 = 0; var1 < this.transforms.length; ++var1) { // L: 437
				if (this.transforms[var1] != -1) { // L: 438
					ObjectComposition var2 = class162.getObjectDefinition(this.transforms[var1]); // L: 439
					if (var2.ambientSoundId != -1 || var2.soundEffectIds != null) { // L: 440
						return true;
					}
				}
			}

			return false; // L: 443
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-903432716"
	)
	static void method3709(Component var0) {
		var0.removeKeyListener(KeyHandler.KeyHandler_instance); // L: 161
		var0.removeFocusListener(KeyHandler.KeyHandler_instance); // L: 162
		KeyHandler.field140 = -1; // L: 163
	} // L: 164

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Float;Ljava/lang/Float;I)V",
		garbageValue = "-1410664147"
	)
	static void method3690(Float var0, Float var1) {
		if (var0 + class114.field1429 < 1.3333334F) { // L: 299
			float var2 = var0 - 2.0F; // L: 300
			float var3 = var0 - 1.0F; // L: 301
			float var4 = (float)Math.sqrt((double)(var2 * var2 - var3 * 4.0F * var3)); // L: 302
			float var5 = (-var2 + var4) * 0.5F; // L: 303
			if (var1 + class114.field1429 > var5) { // L: 304
				var1 = var5 - class114.field1429; // L: 305
			} else {
				var5 = (-var2 - var4) * 0.5F; // L: 308
				if (var1 < class114.field1429 + var5) { // L: 309
					var1 = class114.field1429 + var5; // L: 310
				}
			}
		} else {
			var0 = 1.3333334F - class114.field1429; // L: 315
			var1 = 0.33333334F - class114.field1429; // L: 316
		}

	} // L: 318
}
