import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("eg")
@Implements("ObjectComposition")
public class ObjectComposition extends DualNode {
	@ObfuscatedName("sf")
	@ObfuscatedSignature(
		descriptor = "Lcl;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("v")
	@Export("ObjectDefinition_isLowDetail")
	public static boolean ObjectDefinition_isLowDetail;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("ObjectDefinition_archive")
	public static AbstractArchive ObjectDefinition_archive;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("ObjectDefinition_cached")
	static EvictingDualNodeHashTable ObjectDefinition_cached;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("ObjectDefinition_cachedModelData")
	public static EvictingDualNodeHashTable ObjectDefinition_cachedModelData;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("ObjectDefinition_cachedEntities")
	static EvictingDualNodeHashTable ObjectDefinition_cachedEntities;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("ObjectDefinition_cachedModels")
	static EvictingDualNodeHashTable ObjectDefinition_cachedModels;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "[Lgm;"
	)
	static ModelData[] field1758;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1257920551
	)
	@Export("id")
	public int id;
	@ObfuscatedName("s")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("u")
	@Export("models")
	int[] models;
	@ObfuscatedName("l")
	@Export("name")
	public String name;
	@ObfuscatedName("o")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("c")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("e")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("g")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -288612135
	)
	@Export("sizeX")
	public int sizeX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1812944985
	)
	@Export("sizeY")
	public int sizeY;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1384594797
	)
	@Export("interactType")
	public int interactType;
	@ObfuscatedName("x")
	@Export("boolean1")
	public boolean boolean1;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1747290425
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1982259081
	)
	@Export("clipType")
	int clipType;
	@ObfuscatedName("t")
	@Export("nonFlatShading")
	boolean nonFlatShading;
	@ObfuscatedName("h")
	@Export("modelClipped")
	public boolean modelClipped;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 91732693
	)
	@Export("animationId")
	public int animationId;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -2141564523
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 737098019
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1951915357
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("ab")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 715137677
	)
	@Export("mapIconId")
	public int mapIconId;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1953806269
	)
	@Export("mapSceneId")
	public int mapSceneId;
	@ObfuscatedName("ai")
	@Export("isRotated")
	boolean isRotated;
	@ObfuscatedName("ar")
	@Export("clipped")
	public boolean clipped;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 2023882183
	)
	@Export("modelSizeX")
	int modelSizeX;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -128734905
	)
	@Export("modelHeight")
	int modelHeight;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1793446173
	)
	@Export("modelSizeY")
	int modelSizeY;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1494268527
	)
	@Export("offsetX")
	int offsetX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -743874879
	)
	@Export("offsetHeight")
	int offsetHeight;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -227509265
	)
	@Export("offsetY")
	int offsetY;
	@ObfuscatedName("av")
	@Export("boolean2")
	public boolean boolean2;
	@ObfuscatedName("ac")
	@Export("isSolid")
	boolean isSolid;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1364896901
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("ah")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -240174169
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 758936167
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 805251355
	)
	@Export("ambientSoundId")
	public int ambientSoundId;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -342258981
	)
	@Export("int4")
	public int int4;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 777161755
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1832840413
	)
	@Export("int6")
	public int int6;
	@ObfuscatedName("aa")
	@Export("soundEffectIds")
	public int[] soundEffectIds;
	@ObfuscatedName("au")
	public boolean field1801;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		ObjectDefinition_isLowDetail = false;
		ObjectDefinition_cached = new EvictingDualNodeHashTable(4096);
		ObjectDefinition_cachedModelData = new EvictingDualNodeHashTable(500);
		ObjectDefinition_cachedEntities = new EvictingDualNodeHashTable(30);
		ObjectDefinition_cachedModels = new EvictingDualNodeHashTable(30);
		field1758 = new ModelData[4];
	}

	ObjectComposition() {
		this.name = "null";
		this.sizeX = 1;
		this.sizeY = 1;
		this.interactType = 2;
		this.boolean1 = true;
		this.int1 = -1;
		this.clipType = -1;
		this.nonFlatShading = false;
		this.modelClipped = false;
		this.animationId = -1;
		this.int2 = 16;
		this.ambient = 0;
		this.contrast = 0;
		this.actions = new String[5];
		this.mapIconId = -1;
		this.mapSceneId = -1;
		this.isRotated = false;
		this.clipped = true;
		this.modelSizeX = 128;
		this.modelHeight = 128;
		this.modelSizeY = 128;
		this.offsetX = 0;
		this.offsetHeight = 0;
		this.offsetY = 0;
		this.boolean2 = false;
		this.isSolid = false;
		this.int3 = -1;
		this.transformVarbit = -1;
		this.transformVarp = -1;
		this.ambientSoundId = -1;
		this.int4 = 0;
		this.int5 = 0;
		this.int6 = 0;
		this.field1801 = true;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.int1 == -1) {
			this.int1 = 0;
			if (this.modelIds != null && (this.models == null || this.models[0] == 10)) {
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnd;B)V",
		garbageValue = "1"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnd;II)V",
		garbageValue = "-1041207607"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.readUnsignedByte();
			if (var3 > 0) {
				if (this.modelIds != null && !ObjectDefinition_isLowDetail) {
					var1.offset += 3 * var3;
				} else {
					this.models = new int[var3];
					this.modelIds = new int[var3];

					for (var4 = 0; var4 < var3; ++var4) {
						this.modelIds[var4] = var1.readUnsignedShort();
						this.models[var4] = var1.readUnsignedByte();
					}
				}
			}
		} else if (var2 == 2) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 5) {
			var3 = var1.readUnsignedByte();
			if (var3 > 0) {
				if (this.modelIds != null && !ObjectDefinition_isLowDetail) {
					var1.offset += 2 * var3;
				} else {
					this.models = null;
					this.modelIds = new int[var3];

					for (var4 = 0; var4 < var3; ++var4) {
						this.modelIds[var4] = var1.readUnsignedShort();
					}
				}
			}
		} else if (var2 == 14) {
			this.sizeX = var1.readUnsignedByte();
		} else if (var2 == 15) {
			this.sizeY = var1.readUnsignedByte();
		} else if (var2 == 17) {
			this.interactType = 0;
			this.boolean1 = false;
		} else if (var2 == 18) {
			this.boolean1 = false;
		} else if (var2 == 19) {
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 21) {
			this.clipType = 0;
		} else if (var2 == 22) {
			this.nonFlatShading = true;
		} else if (var2 == 23) {
			this.modelClipped = true;
		} else if (var2 == 24) {
			this.animationId = var1.readUnsignedShort();
			if (this.animationId == 65535) {
				this.animationId = -1;
			}
		} else if (var2 == 27) {
			this.interactType = 1;
		} else if (var2 == 28) {
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 29) {
			this.ambient = var1.readByte();
		} else if (var2 == 39) {
			this.contrast = var1.readByte() * 25;
		} else if (var2 >= 30 && var2 < 35) {
			this.actions[var2 - 30] = var1.readStringCp1252NullTerminated();
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) {
				this.actions[var2 - 30] = null;
			}
		} else if (var2 == 40) {
			var3 = var1.readUnsignedByte();
			this.recolorFrom = new short[var3];
			this.recolorTo = new short[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.recolorFrom[var4] = (short)var1.readUnsignedShort();
				this.recolorTo[var4] = (short)var1.readUnsignedShort();
			}
		} else if (var2 == 41) {
			var3 = var1.readUnsignedByte();
			this.retextureFrom = new short[var3];
			this.retextureTo = new short[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.retextureFrom[var4] = (short)var1.readUnsignedShort();
				this.retextureTo[var4] = (short)var1.readUnsignedShort();
			}
		} else if (var2 == 62) {
			this.isRotated = true;
		} else if (var2 == 64) {
			this.clipped = false;
		} else if (var2 == 65) {
			this.modelSizeX = var1.readUnsignedShort();
		} else if (var2 == 66) {
			this.modelHeight = var1.readUnsignedShort();
		} else if (var2 == 67) {
			this.modelSizeY = var1.readUnsignedShort();
		} else if (var2 == 68) {
			this.mapSceneId = var1.readUnsignedShort();
		} else if (var2 == 69) {
			var1.readUnsignedByte();
		} else if (var2 == 70) {
			this.offsetX = var1.readShort();
		} else if (var2 == 71) {
			this.offsetHeight = var1.readShort();
		} else if (var2 == 72) {
			this.offsetY = var1.readShort();
		} else if (var2 == 73) {
			this.boolean2 = true;
		} else if (var2 == 74) {
			this.isSolid = true;
		} else if (var2 == 75) {
			this.int3 = var1.readUnsignedByte();
		} else if (var2 != 77 && var2 != 92) {
			if (var2 == 78) {
				this.ambientSoundId = var1.readUnsignedShort();
				this.int4 = var1.readUnsignedByte();
			} else if (var2 == 79) {
				this.int5 = var1.readUnsignedShort();
				this.int6 = var1.readUnsignedShort();
				this.int4 = var1.readUnsignedByte();
				var3 = var1.readUnsignedByte();
				this.soundEffectIds = new int[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.soundEffectIds[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 81) {
				this.clipType = var1.readUnsignedByte() * 256;
			} else if (var2 == 82) {
				this.mapIconId = var1.readUnsignedShort();
			} else if (var2 == 89) {
				this.field1801 = false;
			} else if (var2 == 249) {
				this.params = ModeWhere.readStringIntParameters(var1, this.params);
			}
		} else {
			this.transformVarbit = var1.readUnsignedShort();
			if (this.transformVarbit == 65535) {
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort();
			if (this.transformVarp == 65535) {
				this.transformVarp = -1;
			}

			var3 = -1;
			if (var2 == 92) {
				var3 = var1.readUnsignedShort();
				if (var3 == 65535) {
					var3 = -1;
				}
			}

			var4 = var1.readUnsignedByte();
			this.transforms = new int[var4 + 2];

			for (int var5 = 0; var5 <= var4; ++var5) {
				this.transforms[var5] = var1.readUnsignedShort();
				if (this.transforms[var5] == 65535) {
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3;
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1378932606"
	)
	public final boolean method2956(int var1) {
		if (this.models != null) {
			for (int var4 = 0; var4 < this.models.length; ++var4) {
				if (this.models[var4] == var1) {
					return class310.ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var4] & 65535, 0);
				}
			}

			return true;
		} else if (this.modelIds == null) {
			return true;
		} else if (var1 != 10) {
			return true;
		} else {
			boolean var2 = true;

			for (int var3 = 0; var3 < this.modelIds.length; ++var3) {
				var2 &= class310.ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var3] & 65535, 0);
			}

			return var2;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-205337927"
	)
	@Export("needsModelFiles")
	public final boolean needsModelFiles() {
		if (this.modelIds == null) {
			return true;
		} else {
			boolean var1 = true;

			for (int var2 = 0; var2 < this.modelIds.length; ++var2) {
				var1 &= class310.ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var2] & 65535, 0);
			}

			return var1;
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIIB)Lgl;",
		garbageValue = "109"
	)
	@Export("getEntity")
	public final Renderable getEntity(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.models == null) {
			var7 = (long)(var2 + (this.id << 10));
		} else {
			var7 = (long)(var2 + (var1 << 3) + (this.id << 10));
		}

		Object var9 = (Renderable)ObjectDefinition_cachedEntities.get(var7);
		if (var9 == null) {
			ModelData var10 = this.getModelData(var1, var2);
			if (var10 == null) {
				return null;
			}

			if (!this.nonFlatShading) {
				var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			} else {
				var10.ambient = (short)(this.ambient + 64);
				var10.contrast = (short)(this.contrast + 768);
				var10.calculateVertexNormals();
				var9 = var10;
			}

			ObjectDefinition_cachedEntities.put((DualNode)var9, var7);
		}

		if (this.nonFlatShading) {
			var9 = ((ModelData)var9).method3760();
		}

		if (this.clipType * 65536 >= 0) {
			if (var9 instanceof Model) {
				var9 = ((Model)var9).contourGround(var3, var4, var5, var6, true, this.clipType * 65536);
			} else if (var9 instanceof ModelData) {
				var9 = ((ModelData)var9).method3761(var3, var4, var5, var6, true, this.clipType * 65536);
			}
		}

		return (Renderable)var9;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIII)Lgr;",
		garbageValue = "-925676771"
	)
	@Export("getModel")
	public final Model getModel(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.models == null) {
			var7 = (long)(var2 + (this.id << 10));
		} else {
			var7 = (long)(var2 + (var1 << 3) + (this.id << 10));
		}

		Model var9 = (Model)ObjectDefinition_cachedModels.get(var7);
		if (var9 == null) {
			ModelData var10 = this.getModelData(var1, var2);
			if (var10 == null) {
				return null;
			}

			var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			ObjectDefinition_cachedModels.put(var9, var7);
		}

		if (this.clipType * 65536 >= 0) {
			var9 = var9.contourGround(var3, var4, var5, var6, true, this.clipType * 65536);
		}

		return var9;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIILfl;II)Lgr;",
		garbageValue = "1200809976"
	)
	@Export("getModelDynamic")
	public final Model getModelDynamic(int var1, int var2, int[][] var3, int var4, int var5, int var6, SequenceDefinition var7, int var8) {
		long var9;
		if (this.models == null) {
			var9 = (long)(var2 + (this.id << 10));
		} else {
			var9 = (long)(var2 + (var1 << 3) + (this.id << 10));
		}

		Model var11 = (Model)ObjectDefinition_cachedModels.get(var9);
		if (var11 == null) {
			ModelData var12 = this.getModelData(var1, var2);
			if (var12 == null) {
				return null;
			}

			var11 = var12.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			ObjectDefinition_cachedModels.put(var11, var9);
		}

		if (var7 == null && this.clipType * 65536 == -1) {
			return var11;
		} else {
			if (var7 != null) {
				var11 = var7.transformObjectModel(var11, var8, var2);
			} else {
				var11 = var11.toSharedSequenceModel(true);
			}

			if (this.clipType * 65536 >= 0) {
				var11 = var11.contourGround(var3, var4, var5, var6, false, this.clipType * 65536);
			}

			return var11;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)Lgm;",
		garbageValue = "1581886638"
	)
	@Export("getModelData")
	final ModelData getModelData(int var1, int var2) {
		ModelData var3 = null;
		boolean var4;
		int var5;
		int var7;
		if (this.models == null) {
			if (var1 != 10) {
				return null;
			}

			if (this.modelIds == null) {
				return null;
			}

			var4 = this.isRotated;
			if (var1 == 2 && var2 > 3) {
				var4 = !var4;
			}

			var5 = this.modelIds.length;

			for (int var6 = 0; var6 < var5; ++var6) {
				var7 = this.modelIds[var6];
				if (var4) {
					var7 += 65536;
				}

				var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var7);
				if (var3 == null) {
					var3 = ModelData.ModelData_get(class310.ObjectDefinition_modelsArchive, var7 & 65535, 0);
					if (var3 == null) {
						return null;
					}

					if (var4) {
						var3.method3769();
					}

					ObjectDefinition_cachedModelData.put(var3, (long)var7);
				}

				if (var5 > 1) {
					field1758[var6] = var3;
				}
			}

			if (var5 > 1) {
				var3 = new ModelData(field1758, var5);
			}
		} else {
			int var9 = -1;

			for (var5 = 0; var5 < this.models.length; ++var5) {
				if (this.models[var5] == var1) {
					var9 = var5;
					break;
				}
			}

			if (var9 == -1) {
				return null;
			}

			var5 = this.modelIds[var9];
			boolean var10 = this.isRotated ^ var2 > 3;
			if (var10) {
				var5 += 65536;
			}

			var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var5);
			if (var3 == null) {
				var3 = ModelData.ModelData_get(class310.ObjectDefinition_modelsArchive, var5 & 65535, 0);
				if (var3 == null) {
					return null;
				}

				if (var10) {
					var3.method3769();
				}

				ObjectDefinition_cachedModelData.put(var3, (long)var5);
			}
		}

		if (this.modelSizeX == 128 && this.modelHeight == 128 && this.modelSizeY == 128) {
			var4 = false;
		} else {
			var4 = true;
		}

		boolean var11;
		if (this.offsetX == 0 && this.offsetHeight == 0 && this.offsetY == 0) {
			var11 = false;
		} else {
			var11 = true;
		}

		ModelData var8 = new ModelData(var3, var2 == 0 && !var4 && !var11, this.recolorFrom == null, null == this.retextureFrom, true);
		if (var1 == 4 && var2 > 3) {
			var8.method3776(256);
			var8.changeOffset(45, 0, -45);
		}

		var2 &= 3;
		if (var2 == 1) {
			var8.method3763();
		} else if (var2 == 2) {
			var8.method3829();
		} else if (var2 == 3) {
			var8.method3765();
		}

		if (this.recolorFrom != null) {
			for (var7 = 0; var7 < this.recolorFrom.length; ++var7) {
				var8.recolor(this.recolorFrom[var7], this.recolorTo[var7]);
			}
		}

		if (this.retextureFrom != null) {
			for (var7 = 0; var7 < this.retextureFrom.length; ++var7) {
				var8.retexture(this.retextureFrom[var7], this.retextureTo[var7]);
			}
		}

		if (var4) {
			var8.resize(this.modelSizeX, this.modelHeight, this.modelSizeY);
		}

		if (var11) {
			var8.changeOffset(this.offsetX, this.offsetHeight, this.offsetY);
		}

		return var8;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Leg;",
		garbageValue = "1894862325"
	)
	@Export("transform")
	public final ObjectComposition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = Skeleton.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class23.getObjectDefinition(var2) : null;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1270474150"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return SecureRandomFuture.method1977(this.params, var1, var2);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "110294181"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return FriendsList.method5650(this.params, var1, var2);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "16"
	)
	@Export("hasSound")
	public boolean hasSound() {
		if (this.transforms == null) {
			return this.ambientSoundId != -1 || this.soundEffectIds != null;
		} else {
			for (int var1 = 0; var1 < this.transforms.length; ++var1) {
				if (this.transforms[var1] != -1) {
					ObjectComposition var2 = class23.getObjectDefinition(this.transforms[var1]);
					if (var2.ambientSoundId != -1 || var2.soundEffectIds != null) {
						return true;
					}
				}
			}

			return false;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "1"
	)
	@Export("currentTimeMillis")
	public static final synchronized long currentTimeMillis() {
		long var0 = System.currentTimeMillis();
		if (var0 < class379.field4146) {
			class379.field4147 += class379.field4146 - var0;
		}

		class379.field4146 = var0;
		return class379.field4147 + var0;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "2009331321"
	)
	static int method2964(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) {
			class44.Interpreter_intStackSize -= 3;
			BufferedSource.queueSoundEffect(Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 2]);
			return 1;
		} else if (var0 == ScriptOpcodes.SOUND_SONG) {
			class27.playSong(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]);
			return 1;
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
			class44.Interpreter_intStackSize -= 2;
			GrandExchangeOfferNameComparator.method5059(Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]);
			return 1;
		} else {
			int var3;
			if (var0 == 3203) {
				var3 = Math.min(Math.max(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize], 0), 100);
				PacketWriter.method2402(Math.round((float)var3 * 2.55F));
				return 1;
			} else if (var0 == 3204) {
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Math.round((float)clientPreferences.musicVolume / 2.55F);
				return 1;
			} else if (var0 == 3205) {
				var3 = Math.min(Math.max(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize], 0), 100);
				WorldMapLabelSize.updateSoundEffectVolume(Math.round(1.27F * (float)var3));
				return 1;
			} else if (var0 == 3206) {
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Math.round((float)clientPreferences.soundEffectsVolume / 1.27F);
				return 1;
			} else if (var0 == 3207) {
				var3 = Math.min(Math.max(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize], 0), 100);
				LoginPacket.method4373(Math.round((float)var3 * 1.27F));
				return 1;
			} else if (var0 == 3208) {
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Math.round((float)clientPreferences.areaSoundEffectsVolume / 1.27F);
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(IIIILoh;Lit;I)V",
		garbageValue = "-1287867325"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) {
			int var6 = Client.camAngleY & 2047;
			int var7 = var3 * var3 + var2 * var2;
			if (var7 <= 6400) {
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6];
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6];
				int var10 = var3 * var8 + var9 * var2 >> 16;
				int var11 = var3 * var9 - var8 * var2 >> 16;
				if (var7 > 2500) {
					var4.method6989(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths);
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2);
				}

			}
		}
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "42"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var2 = new short[16];
		int var3 = 0;

		for (int var4 = 0; var4 < ItemComposition.ItemDefinition_fileCount; ++var4) {
			ItemComposition var9 = class260.ItemDefinition_get(var4);
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) {
				if (var3 >= 250) {
					class11.foundItemIdCount = -1;
					Clock.foundItemIds = null;
					return;
				}

				if (var3 >= var2.length) {
					short[] var6 = new short[var2.length * 2];

					for (int var7 = 0; var7 < var3; ++var7) {
						var6[var7] = var2[var7];
					}

					var2 = var6;
				}

				var2[var3++] = (short)var4;
			}
		}

		Clock.foundItemIds = var2;
		Canvas.foundItemIndex = 0;
		class11.foundItemIdCount = var3;
		String[] var8 = new String[class11.foundItemIdCount];

		for (int var5 = 0; var5 < class11.foundItemIdCount; ++var5) {
			var8[var5] = class260.ItemDefinition_get(var2[var5]).name;
		}

		short[] var10 = Clock.foundItemIds;
		PacketBufferNode.sortItemsByName(var8, var10, 0, var8.length - 1);
	}
}
