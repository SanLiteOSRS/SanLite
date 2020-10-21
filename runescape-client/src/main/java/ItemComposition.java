import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jq")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("ItemDefinition_modelArchive")
	static AbstractArchive ItemDefinition_modelArchive;
	@ObfuscatedName("w")
	@Export("ItemDefinition_inMembersWorld")
	static boolean ItemDefinition_inMembersWorld;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lel;"
	)
	@Export("ItemDefinition_cached")
	static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lel;"
	)
	@Export("ItemDefinition_cachedModels")
	static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Lel;"
	)
	@Export("ItemDefinition_cachedSprites")
	public static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		signature = "Lkr;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -2127308741
	)
	@Export("id")
	public int id;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1602793113
	)
	@Export("model")
	int model;
	@ObfuscatedName("c")
	@Export("name")
	public String name;
	@ObfuscatedName("f")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("y")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("v")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("j")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1758314265
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1530794933
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 86096515
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1159522461
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1451755111
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 685841117
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -85010485
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1232545811
	)
	@Export("price")
	public int price;
	@ObfuscatedName("ao")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("ae")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("an")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1175273971
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1901023651
	)
	@Export("maleModel")
	int maleModel;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 50964429
	)
	@Export("maleModel1")
	int maleModel1;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 2010056683
	)
	@Export("maleOffset")
	int maleOffset;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 711077729
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -806873799
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 404192005
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -312638611
	)
	@Export("maleModel2")
	int maleModel2;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -440294405
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -2008584399
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2121233033
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1514421507
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1568432281
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("ai")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("ay")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1332734959
	)
	@Export("note")
	public int note;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1348741783
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 645309775
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -96685405
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -948017029
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1509364621
	)
	@Export("ambient")
	public int ambient;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 178466347
	)
	@Export("contrast")
	public int contrast;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 165771595
	)
	@Export("team")
	public int team;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		signature = "Llq;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("bh")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1906961775
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 612376009
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -956191485
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -2061792563
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1532230322"
	)
	@Export("post")
	void post() {
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(Lkf;I)V",
		garbageValue = "-1512040719"
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(Lkf;II)V",
		garbageValue = "-2035131194"
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
				this.params = PacketWriter.readStringIntParameters(var1, this.params);
			}
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Ljq;Ljq;I)V",
		garbageValue = "2102368712"
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(Ljq;Ljq;I)V",
		garbageValue = "1918043668"
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(Ljq;Ljq;B)V",
		garbageValue = "0"
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(II)Lee;",
		garbageValue = "361581400"
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
				return GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(ItemDefinition_modelArchive, this.model, 0);
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(II)Ler;",
		garbageValue = "1340452049"
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
				return GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemDefinition_cachedModels.get((long)this.id);
		if (var5 != null) {
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(ItemDefinition_modelArchive, this.model, 0);
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(II)Ljq;",
		garbageValue = "-1034116663"
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
				return GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var2);
			}
		}

		return this;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(ZI)Z",
		garbageValue = "-627527711"
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
			if (!ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
				var5 = false;
			}

			if (var3 != -1 && !ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var5 = false;
			}

			if (var4 != -1 && !ItemDefinition_modelArchive.tryLoadFile(var4, 0)) {
				var5 = false;
			}

			return var5;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(ZI)Lee;",
		garbageValue = "887428237"
	)
	public final ModelData method4760(boolean var1) {
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
			ModelData var5 = ModelData.ModelData_get(ItemDefinition_modelArchive, var2, 0);
			if (var3 != -1) {
				ModelData var6 = ModelData.ModelData_get(ItemDefinition_modelArchive, var3, 0);
				if (var4 != -1) {
					ModelData var7 = ModelData.ModelData_get(ItemDefinition_modelArchive, var4, 0);
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
		signature = "(ZI)Z",
		garbageValue = "936958354"
	)
	public final boolean method4805(boolean var1) {
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
			if (!ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
				var4 = false;
			}

			if (var3 != -1 && !ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var4 = false;
			}

			return var4;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(ZB)Lee;",
		garbageValue = "0"
	)
	public final ModelData method4762(boolean var1) {
		int var2 = this.maleHeadModel;
		int var3 = this.maleHeadModel2;
		if (var1) {
			var2 = this.femaleHeadModel;
			var3 = this.femaleHeadModel2;
		}

		if (var2 == -1) {
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(ItemDefinition_modelArchive, var2, 0);
			if (var3 != -1) {
				ModelData var5 = ModelData.ModelData_get(ItemDefinition_modelArchive, var3, 0);
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

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "678325185"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return Username.method5309(this.params, var1, var2);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "6"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params;
		String var3;
		if (var4 == null) {
			var3 = var2;
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1);
			if (var5 == null) {
				var3 = var2;
			} else {
				var3 = (String)var5.obj;
			}
		}

		return var3;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "-17"
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(Lkr;Lkr;I)V",
		garbageValue = "-2013337959"
	)
	static void method4823(Font var0, Font var1) {
		Archive var3;
		int var4;
		int var5;
		if (MidiPcmStream.worldSelectBackSprites == null) {
			var3 = Huffman.archive8;
			var4 = var3.getGroupId("sl_back");
			var5 = var3.getFileId(var4, "");
			SpritePixels[] var2 = GameBuild.method4214(var3, var4, var5);
			MidiPcmStream.worldSelectBackSprites = var2;
		}

		IndexedSprite[] var25;
		if (AbstractWorldMapIcon.worldSelectFlagSprites == null) {
			var3 = Huffman.archive8;
			var4 = var3.getGroupId("sl_flags");
			var5 = var3.getFileId(var4, "");
			var25 = UserComparator5.method3515(var3, var4, var5);
			AbstractWorldMapIcon.worldSelectFlagSprites = var25;
		}

		if (MusicPatchNode.worldSelectArrows == null) {
			var3 = Huffman.archive8;
			var4 = var3.getGroupId("sl_arrows");
			var5 = var3.getFileId(var4, "");
			var25 = UserComparator5.method3515(var3, var4, var5);
			MusicPatchNode.worldSelectArrows = var25;
		}

		if (Login.worldSelectStars == null) {
			var3 = Huffman.archive8;
			var4 = var3.getGroupId("sl_stars");
			var5 = var3.getFileId(var4, "");
			var25 = UserComparator5.method3515(var3, var4, var5);
			Login.worldSelectStars = var25;
		}

		if (WorldMapIcon_0.worldSelectLeftSprite == null) {
			WorldMapIcon_0.worldSelectLeftSprite = class234.SpriteBuffer_getIndexedSpriteByName(Huffman.archive8, "leftarrow", "");
		}

		if (ArchiveDiskActionHandler.worldSelectRightSprite == null) {
			ArchiveDiskActionHandler.worldSelectRightSprite = class234.SpriteBuffer_getIndexedSpriteByName(Huffman.archive8, "rightarrow", "");
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
		var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
		if (Login.worldSelectStars != null) {
			Login.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
			var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
			Login.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
			var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
		}

		if (MusicPatchNode.worldSelectArrows != null) {
			int var22 = Login.xPadding + 280;
			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
				MusicPatchNode.worldSelectArrows[2].drawAt(var22, 4);
			} else {
				MusicPatchNode.worldSelectArrows[0].drawAt(var22, 4);
			}

			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
				MusicPatchNode.worldSelectArrows[3].drawAt(var22 + 15, 4);
			} else {
				MusicPatchNode.worldSelectArrows[1].drawAt(var22 + 15, 4);
			}

			var0.draw("World", var22 + 32, 17, 16777215, -1);
			int var23 = Login.xPadding + 390;
			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
				MusicPatchNode.worldSelectArrows[2].drawAt(var23, 4);
			} else {
				MusicPatchNode.worldSelectArrows[0].drawAt(var23, 4);
			}

			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
				MusicPatchNode.worldSelectArrows[3].drawAt(var23 + 15, 4);
			} else {
				MusicPatchNode.worldSelectArrows[1].drawAt(var23 + 15, 4);
			}

			var0.draw("Players", var23 + 32, 17, 16777215, -1);
			var4 = Login.xPadding + 500;
			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
				MusicPatchNode.worldSelectArrows[2].drawAt(var4, 4);
			} else {
				MusicPatchNode.worldSelectArrows[0].drawAt(var4, 4);
			}

			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
				MusicPatchNode.worldSelectArrows[3].drawAt(var4 + 15, 4);
			} else {
				MusicPatchNode.worldSelectArrows[1].drawAt(var4 + 15, 4);
			}

			var0.draw("Location", var4 + 32, 17, 16777215, -1);
			var5 = Login.xPadding + 610;
			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
				MusicPatchNode.worldSelectArrows[2].drawAt(var5, 4);
			} else {
				MusicPatchNode.worldSelectArrows[0].drawAt(var5, 4);
			}

			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
				MusicPatchNode.worldSelectArrows[3].drawAt(var5 + 15, 4);
			} else {
				MusicPatchNode.worldSelectArrows[1].drawAt(var5 + 15, 4);
			}

			var0.draw("Type", var5 + 32, 17, 16777215, -1);
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
		var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
		Login.hoveredWorldIndex = -1;
		if (MidiPcmStream.worldSelectBackSprites != null) {
			byte var27 = 88;
			byte var28 = 19;
			var4 = 765 / (var27 + 1) - 1;
			var5 = 480 / (var28 + 1);

			int var6;
			int var7;
			do {
				var6 = var5;
				var7 = var4;
				if (var5 * (var4 - 1) >= World.World_count) {
					--var4;
				}

				if (var4 * (var5 - 1) >= World.World_count) {
					--var5;
				}

				if (var4 * (var5 - 1) >= World.World_count) {
					--var5;
				}
			} while(var5 != var6 || var4 != var7);

			var6 = (765 - var27 * var4) / (var4 + 1);
			if (var6 > 5) {
				var6 = 5;
			}

			var7 = (480 - var28 * var5) / (var5 + 1);
			if (var7 > 5) {
				var7 = 5;
			}

			int var8 = (765 - var27 * var4 - var6 * (var4 - 1)) / 2;
			int var9 = (480 - var5 * var28 - var7 * (var5 - 1)) / 2;
			int var10 = (var5 + World.World_count - 1) / var5;
			Login.worldSelectPagesCount = var10 - var4;
			if (WorldMapIcon_0.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
				WorldMapIcon_0.worldSelectLeftSprite.drawAt(8, GameEngine.canvasHeight / 2 - WorldMapIcon_0.worldSelectLeftSprite.subHeight / 2);
			}

			if (ArchiveDiskActionHandler.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
				ArchiveDiskActionHandler.worldSelectRightSprite.drawAt(FloorDecoration.canvasWidth - ArchiveDiskActionHandler.worldSelectRightSprite.subWidth - 8, GameEngine.canvasHeight / 2 - ArchiveDiskActionHandler.worldSelectRightSprite.subHeight / 2);
			}

			int var11 = var9 + 23;
			int var12 = var8 + Login.xPadding;
			int var13 = 0;
			boolean var14 = false;
			int var15 = Login.worldSelectPage;

			int var16;
			for (var16 = var5 * var15; var16 < World.World_count && var15 - Login.worldSelectPage < var4; ++var16) {
				World var24 = AbstractByteArrayCopier.World_worlds[var16];
				boolean var18 = true;
				String var19 = Integer.toString(var24.population);
				if (var24.population == -1) {
					var19 = "OFF";
					var18 = false;
				} else if (var24.population > 1980) {
					var19 = "FULL";
					var18 = false;
				}

				int var21 = 0;
				byte var20;
				if (var24.isBeta()) {
					if (var24.isMembersOnly()) {
						var20 = 7;
					} else {
						var20 = 6;
					}
				} else if (var24.isDeadman()) {
					var21 = 16711680;
					if (var24.isMembersOnly()) {
						var20 = 5;
					} else {
						var20 = 4;
					}
				} else if (var24.method1826()) {
					if (var24.isMembersOnly()) {
						var20 = 9;
					} else {
						var20 = 8;
					}
				} else if (var24.isPvp()) {
					if (var24.isMembersOnly()) {
						var20 = 3;
					} else {
						var20 = 2;
					}
				} else if (var24.isMembersOnly()) {
					var20 = 1;
				} else {
					var20 = 0;
				}

				if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var11 && MouseHandler.MouseHandler_x < var12 + var27 && MouseHandler.MouseHandler_y < var11 + var28 && var18) {
					Login.hoveredWorldIndex = var16;
					MidiPcmStream.worldSelectBackSprites[var20].drawTransOverlayAt(var12, var11, 128, 16777215);
					var14 = true;
				} else {
					MidiPcmStream.worldSelectBackSprites[var20].drawAt(var12, var11);
				}

				if (AbstractWorldMapIcon.worldSelectFlagSprites != null) {
					AbstractWorldMapIcon.worldSelectFlagSprites[(var24.isMembersOnly() ? 8 : 0) + var24.location].drawAt(var12 + 29, var11);
				}

				var0.drawCentered(Integer.toString(var24.id), var12 + 15, var28 / 2 + var11 + 5, var21, -1);
				var1.drawCentered(var19, var12 + 60, var28 / 2 + var11 + 5, 268435455, -1);
				var11 = var11 + var7 + var28;
				++var13;
				if (var13 >= var5) {
					var11 = var9 + 23;
					var12 = var12 + var6 + var27;
					var13 = 0;
					++var15;
				}
			}

			if (var14) {
				var16 = var1.stringWidth(AbstractByteArrayCopier.World_worlds[Login.hoveredWorldIndex].activity) + 6;
				int var17 = var1.ascent + 8;
				int var26 = MouseHandler.MouseHandler_y + 25;
				if (var17 + var26 > 480) {
					var26 = MouseHandler.MouseHandler_y - 25 - var17;
				}

				Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var16 / 2, var26, var16, var17, 16777120);
				Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var16 / 2, var26, var16, var17, 0);
				var1.drawCentered(AbstractByteArrayCopier.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var26 + var1.ascent + 4, 0, -1);
			}
		}

		WorldMapSprite.rasterProvider.drawFull(0, 0);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		signature = "(ILcy;ZI)I",
		garbageValue = "137776557"
	)
	static int method4793(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ScriptFrame.loadWorlds() ? 1 : 0;
			return 1;
		} else {
			World var3;
			if (var0 == ScriptOpcodes.WORLDLIST_START) {
				var3 = Decimator.worldListStart();
				if (var3 != null) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.id;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.properties;
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var3.activity;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.location;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.population;
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var3.host;
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
				var3 = WorldMapEvent.getNextWorldListWorld();
				if (var3 != null) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.id;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.properties;
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var3.activity;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.location;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.population;
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var3.host;
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else {
				World var4;
				int var5;
				int var7;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
					var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					var4 = null;

					for (var5 = 0; var5 < World.World_count; ++var5) {
						if (var7 == AbstractByteArrayCopier.World_worlds[var5].id) {
							var4 = AbstractByteArrayCopier.World_worlds[var5];
							break;
						}
					}

					if (var4 != null) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.id;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.properties;
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var4.activity;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.location;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.population;
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var4.host;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
					Interpreter.Interpreter_intStackSize -= 4;
					var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					boolean var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1;
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
					boolean var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3] == 1;
					SceneTilePaint.sortWorldList(var7, var10, var5, var6);
					return 1;
				} else if (var0 != ScriptOpcodes.GETWORLDINFO) {
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else {
						int var8;
						ParamDefinition var9;
						if (var0 == ScriptOpcodes.NC_PARAM) {
							Interpreter.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var9 = PlayerComposition.getParamDefinition(var8);
							if (var9.isString()) {
								Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = Skeleton.getNpcDefinition(var7).getStringParam(var8, var9.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Skeleton.getNpcDefinition(var7).getIntParam(var8, var9.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.LC_PARAM) {
							Interpreter.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var9 = PlayerComposition.getParamDefinition(var8);
							if (var9.isString()) {
								Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = MidiPcmStream.getObjectDefinition(var7).getStringParam(var8, var9.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = MidiPcmStream.getObjectDefinition(var7).getIntParam(var8, var9.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.OC_PARAM) {
							Interpreter.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var9 = PlayerComposition.getParamDefinition(var8);
							if (var9.isString()) {
								Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var7).getStringParam(var8, var9.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var7).getIntParam(var8, var9.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
							Interpreter.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var9 = PlayerComposition.getParamDefinition(var8);
							if (var9.isString()) {
								Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = NetSocket.StructDefinition_getStructDefinition(var7).getStringParam(var8, var9.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = NetSocket.StructDefinition_getStructDefinition(var7).getIntParam(var8, var9.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ON_MOBILE) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.clientType & 3;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
							return 1;
						} else if (var0 == 6522) {
							--Varps.Interpreter_stringStackSize;
							--Interpreter.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 6523) {
							--Varps.Interpreter_stringStackSize;
							--Interpreter.Interpreter_intStackSize;
							return 1;
						} else if (var0 == ScriptOpcodes.BATTERYLEVEL) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else if (var0 == ScriptOpcodes.BATTERYCHARGING) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == ScriptOpcodes.WIFIAVAILABLE) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (var7 >= 0 && var7 < World.World_count) {
						var4 = AbstractByteArrayCopier.World_worlds[var7];
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.id;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.properties;
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var4.activity;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.location;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.population;
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var4.host;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				}
			}
		}
	}
}
