import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("ItemDefinition_archive")
	public static AbstractArchive ItemDefinition_archive;
	@ObfuscatedName("r")
	@Export("ItemDefinition_inMembersWorld")
	public static boolean ItemDefinition_inMembersWorld;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 852203709
	)
	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("ItemDefinition_cached")
	static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("ItemDefinition_cachedModels")
	static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("ItemDefinition_cachedSprites")
	public static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	@Export("ItemDefinition_fontPlain11")
	public static Font ItemDefinition_fontPlain11;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 864003523
	)
	@Export("id")
	public int id;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -82092197
	)
	@Export("model")
	int model;
	@ObfuscatedName("t")
	@Export("name")
	public String name;
	@ObfuscatedName("x")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("u")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("q")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("s")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1197095781
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1477199059
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1947804351
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 963136523
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1965704601
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1159411923
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -950532785
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1201231959
	)
	@Export("price")
	public int price;
	@ObfuscatedName("ad")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("at")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("ah")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1740445573
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -637515031
	)
	@Export("maleModel")
	int maleModel;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1731429003
	)
	@Export("maleModel1")
	int maleModel1;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1393379957
	)
	@Export("maleOffset")
	int maleOffset;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 666917083
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1064602939
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 164223345
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 508356555
	)
	@Export("maleModel2")
	int maleModel2;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1276393651
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -388318419
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1136192221
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1993766353
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -592852933
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("am")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("aa")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1686572351
	)
	@Export("note")
	public int note;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -2019053745
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1896796711
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -55547161
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1335073571
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1227258885
	)
	public int field1855;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -991965775
	)
	public int field1856;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -319582403
	)
	@Export("team")
	public int team;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("bb")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -688029981
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -162075829
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1046778855
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -411820485
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
		this.field1855 = 0;
		this.field1856 = 0;
		this.team = 0;
		this.isTradable = false;
		this.unnotedId = -1;
		this.notedId = -1;
		this.placeholder = -1;
		this.placeholderTemplate = -1;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1428524327"
	)
	@Export("post")
	void post() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-139066670"
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
		descriptor = "(Lnt;II)V",
		garbageValue = "127788107"
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
		} else if (var2 == 9) {
			var1.readStringCp1252NullTerminated();
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
			} else if (var2 == 94) {
				var1.readUnsignedShort();
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
				this.field1855 = var1.readByte();
			} else if (var2 == 114) {
				this.field1856 = var1.readByte() * 5;
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
				this.params = class19.readStringIntParameters(var1, this.params);
			}
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lef;Lef;I)V",
		garbageValue = "-368534972"
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lef;Lef;I)V",
		garbageValue = "-1437013277"
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lef;Lef;I)V",
		garbageValue = "-825669250"
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

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IB)Lga;",
		garbageValue = "-76"
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
				return class250.ItemDefinition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(SoundCache.ItemDefinition_modelArchive, this.model, 0);
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgd;",
		garbageValue = "12"
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
				return class250.ItemDefinition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemDefinition_cachedModels.get((long)this.id);
		if (var5 != null) {
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(SoundCache.ItemDefinition_modelArchive, this.model, 0);
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

				var5 = var6.toModel(this.field1855 + 64, this.field1856 + 768, -50, -10, -50);
				var5.isSingleTile = true;
				ItemDefinition_cachedModels.put(var5, (long)this.id);
				return var5;
			}
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(II)Lef;",
		garbageValue = "1042392759"
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
				return class250.ItemDefinition_get(var2);
			}
		}

		return this;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "1790528710"
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
			if (!SoundCache.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
				var5 = false;
			}

			if (var3 != -1 && !SoundCache.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var5 = false;
			}

			if (var4 != -1 && !SoundCache.ItemDefinition_modelArchive.tryLoadFile(var4, 0)) {
				var5 = false;
			}

			return var5;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lga;",
		garbageValue = "-1389763858"
	)
	public final ModelData method3070(boolean var1) {
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
			ModelData var5 = ModelData.ModelData_get(SoundCache.ItemDefinition_modelArchive, var2, 0);
			if (var3 != -1) {
				ModelData var6 = ModelData.ModelData_get(SoundCache.ItemDefinition_modelArchive, var3, 0);
				if (var4 != -1) {
					ModelData var7 = ModelData.ModelData_get(SoundCache.ItemDefinition_modelArchive, var4, 0);
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "2105188267"
	)
	public final boolean method3102(boolean var1) {
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
			if (!SoundCache.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
				var4 = false;
			}

			if (var3 != -1 && !SoundCache.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var4 = false;
			}

			return var4;
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lga;",
		garbageValue = "-838789106"
	)
	public final ModelData method3082(boolean var1) {
		int var2 = this.maleHeadModel;
		int var3 = this.maleHeadModel2;
		if (var1) {
			var2 = this.femaleHeadModel;
			var3 = this.femaleHeadModel2;
		}

		if (var2 == -1) {
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(SoundCache.ItemDefinition_modelArchive, var2, 0);
			if (var3 != -1) {
				ModelData var5 = ModelData.ModelData_get(SoundCache.ItemDefinition_modelArchive, var3, 0);
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-201410584"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params;
		int var3;
		if (var4 == null) {
			var3 = var2;
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1);
			if (var5 == null) {
				var3 = var2;
			} else {
				var3 = var5.integer;
			}
		}

		return var3;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1584498919"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return WorldMapElement.method2742(this.params, var1, var2);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "138320975"
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1120346347"
	)
	boolean method3086() {
		return this.recolorTo != null;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-30"
	)
	boolean method3139() {
		return this.retextureTo != null;
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-604596177"
	)
	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = class17.getWidgetChild(var0, var1);
		if (var4 != null && var4.onTargetEnter != null) {
			ScriptEvent var5 = new ScriptEvent();
			var5.widget = var4;
			var5.args = var4.onTargetEnter;
			WorldMapSection1.runScriptEvent(var5);
		}

		Client.field634 = var3;
		Client.isSpellSelected = true;
		class15.selectedSpellWidget = var0;
		Client.selectedSpellChildIndex = var1;
		LoginPacket.selectedSpellFlags = var2;
		Script.invalidateWidget(var4);
	}
}
