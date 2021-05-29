import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 251127981
	)
	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("ItemDefinition_cached")
	static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("ItemDefinition_cachedModels")
	static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("ItemDefinition_cachedSprites")
	static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 644081785
	)
	public static int field1859;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -882422617
	)
	@Export("id")
	public int id;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1212146295
	)
	@Export("model")
	int model;
	@ObfuscatedName("g")
	@Export("name")
	public String name;
	@ObfuscatedName("a")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("k")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("m")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("x")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1180916267
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 143465415
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 10451221
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1707042663
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -538415603
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1515805085
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1049731853
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -407851249
	)
	@Export("price")
	public int price;
	@ObfuscatedName("ab")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("al")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("ad")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1244064173
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 461761185
	)
	@Export("maleModel")
	int maleModel;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -2090621981
	)
	@Export("maleModel1")
	int maleModel1;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 2017655331
	)
	@Export("maleOffset")
	int maleOffset;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1881995837
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 264233001
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 237060879
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1265781663
	)
	@Export("maleModel2")
	int maleModel2;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -459952191
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2115221939
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1899720535
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1556168093
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 586976285
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("aw")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("af")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1027633359
	)
	@Export("note")
	public int note;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 168192755
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1366362761
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1651193245
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -867000627
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -333382647
	)
	@Export("ambient")
	public int ambient;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -512843981
	)
	@Export("contrast")
	public int contrast;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1898498591
	)
	@Export("team")
	public int team;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("bl")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1249308017
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1893254845
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1563500305
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1689317723
	)
	@Export("placeholderTemplate")
	public int placeholderTemplate;

	static {
		ItemDefinition_cached = new EvictingDualNodeHashTable(64);
		ItemDefinition_cachedModels = new EvictingDualNodeHashTable(50);
		ItemDefinition_cachedSprites = new EvictingDualNodeHashTable(200);
	}

	ItemComposition() {
		this.name = "null";
		this.zoom2d = 2000;
		this.xan2d = 0;
		this.yan2d = 0;
		this.zan2d = 0;
		this.offsetX2d = 0;
		this.offsetY2d = 0;
		this.isStackable = 0;
		this.price = 1;
		this.isMembersOnly = false;
		this.groundActions = new String[]{null, null, "Take", null, null};
		this.inventoryActions = new String[]{null, null, null, null, "Drop"};
		this.shiftClickIndex = -2;
		this.maleModel = -1;
		this.maleModel1 = -1;
		this.maleOffset = 0;
		this.femaleModel = -1;
		this.femaleModel1 = -1;
		this.femaleOffset = 0;
		this.maleModel2 = -1;
		this.femaleModel2 = -1;
		this.maleHeadModel = -1;
		this.maleHeadModel2 = -1;
		this.femaleHeadModel = -1;
		this.femaleHeadModel2 = -1;
		this.note = -1;
		this.noteTemplate = -1;
		this.resizeX = 128;
		this.resizeY = 128;
		this.resizeZ = 128;
		this.ambient = 0;
		this.contrast = 0;
		this.team = 0;
		this.isTradable = false;
		this.unnotedId = -1;
		this.notedId = -1;
		this.placeholder = -1;
		this.placeholderTemplate = -1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1352174221"
	)
	@Export("post")
	void post() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "2116753290"
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
		garbageValue = "-610453643"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.model = var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.zoom2d = var1.readUnsignedShort();
		} else if (var2 == 5) {
			this.xan2d = var1.readUnsignedShort();
		} else if (var2 == 6) {
			this.yan2d = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.offsetX2d = var1.readUnsignedShort();
			if (this.offsetX2d > 32767) {
				this.offsetX2d -= 65536;
			}
		} else if (var2 == 8) {
			this.offsetY2d = var1.readUnsignedShort();
			if (this.offsetY2d > 32767) {
				this.offsetY2d -= 65536;
			}
		} else if (var2 == 11) {
			this.isStackable = 1;
		} else if (var2 == 12) {
			this.price = var1.readInt();
		} else if (var2 == 16) {
			this.isMembersOnly = true;
		} else if (var2 == 23) {
			this.maleModel = var1.readUnsignedShort();
			this.maleOffset = var1.readUnsignedByte();
		} else if (var2 == 24) {
			this.maleModel1 = var1.readUnsignedShort();
		} else if (var2 == 25) {
			this.femaleModel = var1.readUnsignedShort();
			this.femaleOffset = var1.readUnsignedByte();
		} else if (var2 == 26) {
			this.femaleModel1 = var1.readUnsignedShort();
		} else if (var2 >= 30 && var2 < 35) {
			this.groundActions[var2 - 30] = var1.readStringCp1252NullTerminated();
			if (this.groundActions[var2 - 30].equalsIgnoreCase("Hidden")) {
				this.groundActions[var2 - 30] = null;
			}
		} else if (var2 >= 35 && var2 < 40) {
			this.inventoryActions[var2 - 35] = var1.readStringCp1252NullTerminated();
		} else {
			int var3;
			int var4;
			if (var2 == 40) {
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
			} else if (var2 == 42) {
				this.shiftClickIndex = var1.readByte();
			} else if (var2 == 65) {
				this.isTradable = true;
			} else if (var2 == 78) {
				this.maleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) {
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 90) {
				this.maleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 91) {
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 92) {
				this.maleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 93) {
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 95) {
				this.zan2d = var1.readUnsignedShort();
			} else if (var2 == 97) {
				this.note = var1.readUnsignedShort();
			} else if (var2 == 98) {
				this.noteTemplate = var1.readUnsignedShort();
			} else if (var2 >= 100 && var2 < 110) {
				if (this.countobj == null) {
					this.countobj = new int[10];
					this.countco = new int[10];
				}

				this.countobj[var2 - 100] = var1.readUnsignedShort();
				this.countco[var2 - 100] = var1.readUnsignedShort();
			} else if (var2 == 110) {
				this.resizeX = var1.readUnsignedShort();
			} else if (var2 == 111) {
				this.resizeY = var1.readUnsignedShort();
			} else if (var2 == 112) {
				this.resizeZ = var1.readUnsignedShort();
			} else if (var2 == 113) {
				this.ambient = var1.readByte();
			} else if (var2 == 114) {
				this.contrast = var1.readByte() * 5;
			} else if (var2 == 115) {
				this.team = var1.readUnsignedByte();
			} else if (var2 == 139) {
				this.unnotedId = var1.readUnsignedShort();
			} else if (var2 == 140) {
				this.notedId = var1.readUnsignedShort();
			} else if (var2 == 148) {
				this.placeholder = var1.readUnsignedShort();
			} else if (var2 == 149) {
				this.placeholderTemplate = var1.readUnsignedShort();
			} else if (var2 == 249) {
				this.params = ModeWhere.readStringIntParameters(var1, this.params);
			}
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Leq;Leq;B)V",
		garbageValue = "107"
	)
	@Export("genCert")
	void genCert(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model;
		this.zoom2d = var1.zoom2d;
		this.xan2d = var1.xan2d;
		this.yan2d = var1.yan2d;
		this.zan2d = var1.zan2d;
		this.offsetX2d = var1.offsetX2d;
		this.offsetY2d = var1.offsetY2d;
		this.recolorFrom = var1.recolorFrom;
		this.recolorTo = var1.recolorTo;
		this.retextureFrom = var1.retextureFrom;
		this.retextureTo = var1.retextureTo;
		this.name = var2.name;
		this.isMembersOnly = var2.isMembersOnly;
		this.price = var2.price;
		this.isStackable = 1;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Leq;Leq;I)V",
		garbageValue = "2093027907"
	)
	@Export("genBought")
	void genBought(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model;
		this.zoom2d = var1.zoom2d;
		this.xan2d = var1.xan2d;
		this.yan2d = var1.yan2d;
		this.zan2d = var1.zan2d;
		this.offsetX2d = var1.offsetX2d;
		this.offsetY2d = var1.offsetY2d;
		this.recolorFrom = var2.recolorFrom;
		this.recolorTo = var2.recolorTo;
		this.retextureFrom = var2.retextureFrom;
		this.retextureTo = var2.retextureTo;
		this.name = var2.name;
		this.isMembersOnly = var2.isMembersOnly;
		this.isStackable = var2.isStackable;
		this.maleModel = var2.maleModel;
		this.maleModel1 = var2.maleModel1;
		this.maleModel2 = var2.maleModel2;
		this.femaleModel = var2.femaleModel;
		this.femaleModel1 = var2.femaleModel1;
		this.femaleModel2 = var2.femaleModel2;
		this.maleHeadModel = var2.maleHeadModel;
		this.maleHeadModel2 = var2.maleHeadModel2;
		this.femaleHeadModel = var2.femaleHeadModel;
		this.femaleHeadModel2 = var2.femaleHeadModel2;
		this.team = var2.team;
		this.groundActions = var2.groundActions;
		this.inventoryActions = new String[5];
		if (var2.inventoryActions != null) {
			for (int var3 = 0; var3 < 4; ++var3) {
				this.inventoryActions[var3] = var2.inventoryActions[var3];
			}
		}

		this.inventoryActions[4] = "Discard";
		this.price = 0;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Leq;Leq;I)V",
		garbageValue = "555956610"
	)
	@Export("genPlaceholder")
	void genPlaceholder(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model;
		this.zoom2d = var1.zoom2d;
		this.xan2d = var1.xan2d;
		this.yan2d = var1.yan2d;
		this.zan2d = var1.zan2d;
		this.offsetX2d = var1.offsetX2d;
		this.offsetY2d = var1.offsetY2d;
		this.recolorFrom = var1.recolorFrom;
		this.recolorTo = var1.recolorTo;
		this.retextureFrom = var1.retextureFrom;
		this.retextureTo = var1.retextureTo;
		this.isStackable = var1.isStackable;
		this.name = var2.name;
		this.price = 0;
		this.isMembersOnly = false;
		this.isTradable = false;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)Lgm;",
		garbageValue = "594500425"
	)
	@Export("getModelData")
	public final ModelData getModelData(int var1) {
		int var3;
		if (this.countobj != null && var1 > 1) {
			int var2 = -1;

			for (var3 = 0; var3 < 10; ++var3) {
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) {
				return class260.ItemDefinition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(class311.ItemDefinition_modelArchive, this.model, 0);
		if (var4 == null) {
			return null;
		} else {
			if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
				var4.resize(this.resizeX, this.resizeY, this.resizeZ);
			}

			if (this.recolorFrom != null) {
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) {
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]);
				}
			}

			if (this.retextureFrom != null) {
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) {
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(II)Lgr;",
		garbageValue = "-1748661120"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		if (this.countobj != null && var1 > 1) {
			int var2 = -1;

			for (int var3 = 0; var3 < 10; ++var3) {
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) {
				return class260.ItemDefinition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemDefinition_cachedModels.get((long)this.id);
		if (var5 != null) {
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(class311.ItemDefinition_modelArchive, this.model, 0);
			if (var6 == null) {
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
					var6.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				int var4;
				if (this.recolorFrom != null) {
					for (var4 = 0; var4 < this.recolorFrom.length; ++var4) {
						var6.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
					}
				}

				if (this.retextureFrom != null) {
					for (var4 = 0; var4 < this.retextureFrom.length; ++var4) {
						var6.retexture(this.retextureFrom[var4], this.retextureTo[var4]);
					}
				}

				var5 = var6.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
				var5.isSingleTile = true;
				ItemDefinition_cachedModels.put(var5, (long)this.id);
				return var5;
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IS)Leq;",
		garbageValue = "312"
	)
	@Export("getCountObj")
	public ItemComposition getCountObj(int var1) {
		if (this.countobj != null && var1 > 1) {
			int var2 = -1;

			for (int var3 = 0; var3 < 10; ++var3) {
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) {
				return class260.ItemDefinition_get(var2);
			}
		}

		return this;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "-46"
	)
	@Export("hasNoValidModel")
	public final boolean hasNoValidModel(boolean var1) {
		int var2 = this.maleModel;
		int var3 = this.maleModel1;
		int var4 = this.maleModel2;
		if (var1) {
			var2 = this.femaleModel;
			var3 = this.femaleModel1;
			var4 = this.femaleModel2;
		}

		if (var2 == -1) {
			return true;
		} else {
			boolean var5 = true;
			if (!class311.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
				var5 = false;
			}

			if (var3 != -1 && !class311.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var5 = false;
			}

			if (var4 != -1 && !class311.ItemDefinition_modelArchive.tryLoadFile(var4, 0)) {
				var5 = false;
			}

			return var5;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lgm;",
		garbageValue = "-1178156518"
	)
	public final ModelData method3018(boolean var1) {
		int var2 = this.maleModel;
		int var3 = this.maleModel1;
		int var4 = this.maleModel2;
		if (var1) {
			var2 = this.femaleModel;
			var3 = this.femaleModel1;
			var4 = this.femaleModel2;
		}

		if (var2 == -1) {
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(class311.ItemDefinition_modelArchive, var2, 0);
			if (var3 != -1) {
				ModelData var6 = ModelData.ModelData_get(class311.ItemDefinition_modelArchive, var3, 0);
				if (var4 != -1) {
					ModelData var7 = ModelData.ModelData_get(class311.ItemDefinition_modelArchive, var4, 0);
					ModelData[] var8 = new ModelData[]{var5, var6, var7};
					var5 = new ModelData(var8, 3);
				} else {
					ModelData[] var10 = new ModelData[]{var5, var6};
					var5 = new ModelData(var10, 2);
				}
			}

			if (!var1 && this.maleOffset != 0) {
				var5.changeOffset(0, this.maleOffset, 0);
			}

			if (var1 && this.femaleOffset != 0) {
				var5.changeOffset(0, this.femaleOffset, 0);
			}

			int var9;
			if (this.recolorFrom != null) {
				for (var9 = 0; var9 < this.recolorFrom.length; ++var9) {
					var5.recolor(this.recolorFrom[var9], this.recolorTo[var9]);
				}
			}

			if (this.retextureFrom != null) {
				for (var9 = 0; var9 < this.retextureFrom.length; ++var9) {
					var5.retexture(this.retextureFrom[var9], this.retextureTo[var9]);
				}
			}

			return var5;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "673638768"
	)
	public final boolean method3019(boolean var1) {
		int var2 = this.maleHeadModel;
		int var3 = this.maleHeadModel2;
		if (var1) {
			var2 = this.femaleHeadModel;
			var3 = this.femaleHeadModel2;
		}

		if (var2 == -1) {
			return true;
		} else {
			boolean var4 = true;
			if (!class311.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
				var4 = false;
			}

			if (var3 != -1 && !class311.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var4 = false;
			}

			return var4;
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lgm;",
		garbageValue = "10"
	)
	public final ModelData method3020(boolean var1) {
		int var2 = this.maleHeadModel;
		int var3 = this.maleHeadModel2;
		if (var1) {
			var2 = this.femaleHeadModel;
			var3 = this.femaleHeadModel2;
		}

		if (var2 == -1) {
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(class311.ItemDefinition_modelArchive, var2, 0);
			if (var3 != -1) {
				ModelData var5 = ModelData.ModelData_get(class311.ItemDefinition_modelArchive, var3, 0);
				ModelData[] var6 = new ModelData[]{var4, var5};
				var4 = new ModelData(var6, 2);
			}

			int var7;
			if (this.recolorFrom != null) {
				for (var7 = 0; var7 < this.recolorFrom.length; ++var7) {
					var4.recolor(this.recolorFrom[var7], this.recolorTo[var7]);
				}
			}

			if (this.retextureFrom != null) {
				for (var7 = 0; var7 < this.retextureFrom.length; ++var7) {
					var4.retexture(this.retextureFrom[var7], this.retextureTo[var7]);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "117"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return SecureRandomFuture.method1977(this.params, var1, var2);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;S)Ljava/lang/String;",
		garbageValue = "239"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return FriendsList.method5650(this.params, var1, var2);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1596135449"
	)
	@Export("getShiftClickIndex")
	public int getShiftClickIndex() {
		if (this.shiftClickIndex != -1 && this.inventoryActions != null) {
			if (this.shiftClickIndex >= 0) {
				return this.inventoryActions[this.shiftClickIndex] != null ? this.shiftClickIndex : -1;
			} else {
				return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1;
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-14386"
	)
	boolean method3024() {
		return this.recolorTo != null;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "604113686"
	)
	boolean method3025() {
		return this.retextureTo != null;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-378975040"
	)
	public static int method3084() {
		return ViewportMouse.ViewportMouse_entityCount;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljv;III)[Loh;",
		garbageValue = "-1264314377"
	)
	public static SpritePixels[] method3087(AbstractArchive var0, int var1, int var2) {
		return !class339.method6015(var0, var1, var2) ? null : class142.method2739();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-919320059"
	)
	static final void method3085(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) {
			for (int var5 = var0; var5 <= var0 + var2; ++var5) {
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
					class372.field4123[0][var5][var4] = 127;
					if (var0 == var5 && var5 > 0) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var0 + var2 == var5 && var5 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var4 == var3 + var1 && var4 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnb;IB)V",
		garbageValue = "100"
	)
	@Export("readPlayerUpdate")
	static void readPlayerUpdate(PacketBuffer var0, int var1) {
		boolean var2 = var0.readBits(1) == 1;
		if (var2) {
			Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
		}

		int var3 = var0.readBits(2);
		Player var4 = Client.players[var1];
		if (var3 == 0) {
			if (var2) {
				var4.field1218 = false;
			} else if (Client.localPlayerIndex == var1) {
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = (var4.plane << 28) + (VertexNormal.baseX * 64 + var4.pathX[0] >> 13 << 14) + (SoundSystem.baseY * 64 + var4.pathY[0] >> 13);
				if (var4.field1264 != -1) {
					Players.Players_orientations[var1] = var4.field1264;
				} else {
					Players.Players_orientations[var1] = var4.orientation;
				}

				Players.Players_targetIndices[var1] = var4.targetIndex;
				Client.players[var1] = null;
				if (var0.readBits(1) != 0) {
					ParamComposition.updateExternalPlayer(var0, var1);
				}

			}
		} else {
			int var5;
			int var6;
			int var7;
			if (var3 == 1) {
				var5 = var0.readBits(3);
				var6 = var4.pathX[0];
				var7 = var4.pathY[0];
				if (var5 == 0) {
					--var6;
					--var7;
				} else if (var5 == 1) {
					--var7;
				} else if (var5 == 2) {
					++var6;
					--var7;
				} else if (var5 == 3) {
					--var6;
				} else if (var5 == 4) {
					++var6;
				} else if (var5 == 5) {
					--var6;
					++var7;
				} else if (var5 == 6) {
					++var7;
				} else if (var5 == 7) {
					++var6;
					++var7;
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
					var4.resetPath(var6, var7);
					var4.field1218 = false;
				} else if (var2) {
					var4.field1218 = true;
					var4.tileX = var6;
					var4.tileY = var7;
				} else {
					var4.field1218 = false;
					var4.method2129(var6, var7, Players.field1373[var1]);
				}

			} else if (var3 == 2) {
				var5 = var0.readBits(4);
				var6 = var4.pathX[0];
				var7 = var4.pathY[0];
				if (var5 == 0) {
					var6 -= 2;
					var7 -= 2;
				} else if (var5 == 1) {
					--var6;
					var7 -= 2;
				} else if (var5 == 2) {
					var7 -= 2;
				} else if (var5 == 3) {
					++var6;
					var7 -= 2;
				} else if (var5 == 4) {
					var6 += 2;
					var7 -= 2;
				} else if (var5 == 5) {
					var6 -= 2;
					--var7;
				} else if (var5 == 6) {
					var6 += 2;
					--var7;
				} else if (var5 == 7) {
					var6 -= 2;
				} else if (var5 == 8) {
					var6 += 2;
				} else if (var5 == 9) {
					var6 -= 2;
					++var7;
				} else if (var5 == 10) {
					var6 += 2;
					++var7;
				} else if (var5 == 11) {
					var6 -= 2;
					var7 += 2;
				} else if (var5 == 12) {
					--var6;
					var7 += 2;
				} else if (var5 == 13) {
					var7 += 2;
				} else if (var5 == 14) {
					++var6;
					var7 += 2;
				} else if (var5 == 15) {
					var6 += 2;
					var7 += 2;
				}

				if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) {
					if (var2) {
						var4.field1218 = true;
						var4.tileX = var6;
						var4.tileY = var7;
					} else {
						var4.field1218 = false;
						var4.method2129(var6, var7, Players.field1373[var1]);
					}
				} else {
					var4.resetPath(var6, var7);
					var4.field1218 = false;
				}

			} else {
				var5 = var0.readBits(1);
				int var8;
				int var9;
				int var10;
				int var11;
				if (var5 == 0) {
					var6 = var0.readBits(12);
					var7 = var6 >> 10;
					var8 = var6 >> 5 & 31;
					if (var8 > 15) {
						var8 -= 32;
					}

					var9 = var6 & 31;
					if (var9 > 15) {
						var9 -= 32;
					}

					var10 = var8 + var4.pathX[0];
					var11 = var9 + var4.pathY[0];
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
						var4.resetPath(var10, var11);
						var4.field1218 = false;
					} else if (var2) {
						var4.field1218 = true;
						var4.tileX = var10;
						var4.tileY = var11;
					} else {
						var4.field1218 = false;
						var4.method2129(var10, var11, Players.field1373[var1]);
					}

					var4.plane = (byte)(var7 + var4.plane & 3);
					if (Client.localPlayerIndex == var1) {
						class22.Client_plane = var4.plane;
					}

				} else {
					var6 = var0.readBits(30);
					var7 = var6 >> 28;
					var8 = var6 >> 14 & 16383;
					var9 = var6 & 16383;
					var10 = (VertexNormal.baseX * 64 + var8 + var4.pathX[0] & 16383) - VertexNormal.baseX * 64;
					var11 = (SoundSystem.baseY * 64 + var9 + var4.pathY[0] & 16383) - SoundSystem.baseY * 64;
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
						var4.resetPath(var10, var11);
						var4.field1218 = false;
					} else if (var2) {
						var4.field1218 = true;
						var4.tileX = var10;
						var4.tileY = var11;
					} else {
						var4.field1218 = false;
						var4.method2129(var10, var11, Players.field1373[var1]);
					}

					var4.plane = (byte)(var7 + var4.plane & 3);
					if (Client.localPlayerIndex == var1) {
						class22.Client_plane = var4.plane;
					}

				}
			}
		}
	}
}
