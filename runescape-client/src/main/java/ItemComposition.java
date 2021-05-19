import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("ItemDefinition_archive")
	static AbstractArchive ItemDefinition_archive;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("ItemDefinition_cached")
	public static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("ItemDefinition_cachedModels")
	public static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("ItemDefinition_cachedSprites")
	public static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 547633189
	)
	@Export("id")
	public int id;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1266178465
	)
	@Export("model")
	int model;
	@ObfuscatedName("a")
	@Export("name")
	public String name;
	@ObfuscatedName("e")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("d")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("u")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("m")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 483565977
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1616193781
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 50079583
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 309959763
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -341173427
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -565964941
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -619330899
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 279752497
	)
	@Export("price")
	public int price;
	@ObfuscatedName("ao")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("aj")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("aw")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1461867551
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 2021927303
	)
	@Export("maleModel")
	int maleModel;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 906728493
	)
	@Export("maleModel1")
	int maleModel1;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -116866817
	)
	@Export("maleOffset")
	int maleOffset;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 326211461
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -2000061499
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 85695415
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -10248853
	)
	@Export("maleModel2")
	int maleModel2;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1127357827
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1899931167
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -291882105
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 80586719
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -935374551
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("az")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("aq")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1859432357
	)
	@Export("note")
	public int note;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 328279449
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1093690633
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -52556217
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1405177909
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -173880273
	)
	@Export("ambient")
	public int ambient;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1352036525
	)
	@Export("contrast")
	public int contrast;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 2087677201
	)
	@Export("team")
	public int team;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("bb")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -646463005
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -569756661
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 93657053
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1039838991
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-478531714"
	)
	@Export("post")
	void post() {
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lnk;B)V",
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lnk;II)V",
		garbageValue = "-1644464908"
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
				this.params = HealthBar.readStringIntParameters(var1, this.params);
			}
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lez;Lez;I)V",
		garbageValue = "-132004885"
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lez;Lez;I)V",
		garbageValue = "1563324491"
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lez;Lez;I)V",
		garbageValue = "86533098"
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
		descriptor = "(II)Lgk;",
		garbageValue = "-1124224184"
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
				return Strings.ItemDefinition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(FloorDecoration.ItemDefinition_modelArchive, this.model, 0);
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Lgj;",
		garbageValue = "1922187853"
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
				return Strings.ItemDefinition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemDefinition_cachedModels.get((long)this.id);
		if (var5 != null) {
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(FloorDecoration.ItemDefinition_modelArchive, this.model, 0);
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)Lez;",
		garbageValue = "-1165831963"
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
				return Strings.ItemDefinition_get(var2);
			}
		}

		return this;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-1362289585"
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
			if (!FloorDecoration.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
				var5 = false;
			}

			if (var3 != -1 && !FloorDecoration.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var5 = false;
			}

			if (var4 != -1 && !FloorDecoration.ItemDefinition_modelArchive.tryLoadFile(var4, 0)) {
				var5 = false;
			}

			return var5;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lgk;",
		garbageValue = "-68"
	)
	public final ModelData method3026(boolean var1) {
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
			ModelData var5 = ModelData.ModelData_get(FloorDecoration.ItemDefinition_modelArchive, var2, 0);
			if (var3 != -1) {
				ModelData var6 = ModelData.ModelData_get(FloorDecoration.ItemDefinition_modelArchive, var3, 0);
				if (var4 != -1) {
					ModelData var7 = ModelData.ModelData_get(FloorDecoration.ItemDefinition_modelArchive, var4, 0);
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "-3"
	)
	public final boolean method2959(boolean var1) {
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
			if (!FloorDecoration.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
				var4 = false;
			}

			if (var3 != -1 && !FloorDecoration.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var4 = false;
			}

			return var4;
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lgk;",
		garbageValue = "-1602050368"
	)
	public final ModelData method2950(boolean var1) {
		int var2 = this.maleHeadModel;
		int var3 = this.maleHeadModel2;
		if (var1) {
			var2 = this.femaleHeadModel;
			var3 = this.femaleHeadModel2;
		}

		if (var2 == -1) {
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(FloorDecoration.ItemDefinition_modelArchive, var2, 0);
			if (var3 != -1) {
				ModelData var5 = ModelData.ModelData_get(FloorDecoration.ItemDefinition_modelArchive, var3, 0);
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

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1395652903"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return GraphicsObject.method1937(this.params, var1, var2);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-18910024"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return Varcs.method2326(this.params, var1, var2);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "71"
	)
	boolean method2964() {
		return this.recolorTo != null;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "102"
	)
	boolean method2965() {
		return this.retextureTo != null;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Lci;",
		garbageValue = "2018073249"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class22.archive12.takeFile(var0, 0);
			if (var2 == null) {
				return null;
			} else {
				var1 = class25.newScript(var2);
				Script.Script_cached.put(var1, (long)var0);
				return var1;
			}
		}
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-509097744"
	)
	static final void method3006() {
		int var0 = Players.Players_count;
		int[] var1 = Players.Players_indices;

		for (int var2 = 0; var2 < var0; ++var2) {
			Player var3 = Client.players[var1[var2]];
			if (var3 != null) {
				class35.updateActorSequence(var3, 1);
			}
		}

	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-2102409671"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = class5.scene.getBoundaryObjectTag(var0, var1, var2);
		int var7;
		int var8;
		int var9;
		int var10;
		int var13;
		int var14;
		if (var5 != 0L) {
			var7 = class5.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = var3;
			boolean var11 = 0L != var5 && !WorldMapEvent.method3714(var5);
			if (var11) {
				var10 = var4;
			}

			int[] var12 = UserComparator8.sceneMinimapSprite.pixels;
			var13 = var1 * 4 + (103 - var2) * 2048 + 24624;
			var14 = class6.Entity_unpackID(var5);
			ObjectComposition var15 = AttackOption.getObjectDefinition(var14);
			if (var15.mapSceneId != -1) {
				IndexedSprite var16 = class23.mapSceneSprites[var15.mapSceneId];
				if (var16 != null) {
					int var17 = (var15.sizeX * 4 - var16.subWidth) / 2;
					int var18 = (var15.sizeY * 4 - var16.subHeight) / 2;
					var16.drawAt(var17 + var1 * 4 + 48, (104 - var2 - var15.sizeY) * 4 + var18 + 48);
				}
			} else {
				if (var9 == 0 || var9 == 2) {
					if (var8 == 0) {
						var12[var13] = var10;
						var12[var13 + 512] = var10;
						var12[var13 + 1024] = var10;
						var12[var13 + 1536] = var10;
					} else if (var8 == 1) {
						var12[var13] = var10;
						var12[var13 + 1] = var10;
						var12[var13 + 2] = var10;
						var12[var13 + 3] = var10;
					} else if (var8 == 2) {
						var12[var13 + 3] = var10;
						var12[var13 + 512 + 3] = var10;
						var12[var13 + 1024 + 3] = var10;
						var12[var13 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var12[var13 + 1536] = var10;
						var12[var13 + 1536 + 1] = var10;
						var12[var13 + 1536 + 2] = var10;
						var12[var13 + 1536 + 3] = var10;
					}
				}

				if (var9 == 3) {
					if (var8 == 0) {
						var12[var13] = var10;
					} else if (var8 == 1) {
						var12[var13 + 3] = var10;
					} else if (var8 == 2) {
						var12[var13 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var12[var13 + 1536] = var10;
					}
				}

				if (var9 == 2) {
					if (var8 == 3) {
						var12[var13] = var10;
						var12[var13 + 512] = var10;
						var12[var13 + 1024] = var10;
						var12[var13 + 1536] = var10;
					} else if (var8 == 0) {
						var12[var13] = var10;
						var12[var13 + 1] = var10;
						var12[var13 + 2] = var10;
						var12[var13 + 3] = var10;
					} else if (var8 == 1) {
						var12[var13 + 3] = var10;
						var12[var13 + 512 + 3] = var10;
						var12[var13 + 1024 + 3] = var10;
						var12[var13 + 1536 + 3] = var10;
					} else if (var8 == 2) {
						var12[var13 + 1536] = var10;
						var12[var13 + 1536 + 1] = var10;
						var12[var13 + 1536 + 2] = var10;
						var12[var13 + 1536 + 3] = var10;
					}
				}
			}
		}

		var5 = class5.scene.getGameObjectTag(var0, var1, var2);
		if (0L != var5) {
			var7 = class5.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = class6.Entity_unpackID(var5);
			ObjectComposition var19 = AttackOption.getObjectDefinition(var10);
			if (var19.mapSceneId != -1) {
				IndexedSprite var26 = class23.mapSceneSprites[var19.mapSceneId];
				if (var26 != null) {
					var13 = (var19.sizeX * 4 - var26.subWidth) / 2;
					var14 = (var19.sizeY * 4 - var26.subHeight) / 2;
					var26.drawAt(var1 * 4 + var13 + 48, var14 + (104 - var2 - var19.sizeY) * 4 + 48);
				}
			} else if (var9 == 9) {
				int var20 = 15658734;
				boolean var27 = 0L != var5 && !WorldMapEvent.method3714(var5);
				if (var27) {
					var20 = 15597568;
				}

				int[] var21 = UserComparator8.sceneMinimapSprite.pixels;
				int var22 = var1 * 4 + (103 - var2) * 2048 + 24624;
				if (var8 != 0 && var8 != 2) {
					var21[var22] = var20;
					var21[var22 + 1 + 512] = var20;
					var21[var22 + 1024 + 2] = var20;
					var21[var22 + 1536 + 3] = var20;
				} else {
					var21[var22 + 1536] = var20;
					var21[var22 + 1 + 1024] = var20;
					var21[var22 + 512 + 2] = var20;
					var21[var22 + 3] = var20;
				}
			}
		}

		var5 = class5.scene.getFloorDecorationTag(var0, var1, var2);
		if (var5 != 0L) {
			var7 = class6.Entity_unpackID(var5);
			ObjectComposition var23 = AttackOption.getObjectDefinition(var7);
			if (var23.mapSceneId != -1) {
				IndexedSprite var24 = class23.mapSceneSprites[var23.mapSceneId];
				if (var24 != null) {
					var10 = (var23.sizeX * 4 - var24.subWidth) / 2;
					int var25 = (var23.sizeY * 4 - var24.subHeight) / 2;
					var24.drawAt(var1 * 4 + var10 + 48, var25 + (104 - var2 - var23.sizeY) * 4 + 48);
				}
			}
		}

	}
}
