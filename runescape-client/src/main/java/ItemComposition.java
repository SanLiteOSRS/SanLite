import java.util.Collections;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("ItemDefinition_cached")
	static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("ItemDefinition_cachedModels")
	static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("ItemDefinition_cachedSprites")
	public static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("hb")
	@ObfuscatedGetter(
		intValue = -1826630813
	)
	static int field1931;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1753723685
	)
	@Export("id")
	public int id;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1325108261
	)
	@Export("model")
	int model;
	@ObfuscatedName("u")
	@Export("name")
	public String name;
	@ObfuscatedName("n")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("z")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("q")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("d")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1547329069
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -644956173
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -212256273
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1823149965
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 494142303
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1457656139
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 912207585
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1708222131
	)
	@Export("price")
	public int price;
	@ObfuscatedName("aq")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("al")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("am")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 185222303
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 612677957
	)
	@Export("maleModel")
	int maleModel;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1733428819
	)
	@Export("maleModel1")
	int maleModel1;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1445773573
	)
	@Export("maleOffset")
	int maleOffset;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2098654815
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 535363813
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1120928283
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1786291667
	)
	@Export("maleModel2")
	int maleModel2;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1983865871
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1571654147
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1283309971
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 185358531
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1890466531
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("au")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("aj")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 777424459
	)
	@Export("note")
	public int note;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1728558393
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 394985009
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1569909587
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1225424617
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1533148773
	)
	@Export("ambient")
	public int ambient;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1071420345
	)
	@Export("contrast")
	public int contrast;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 693327587
	)
	@Export("team")
	public int team;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("bt")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -404111403
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1171307527
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -593718331
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -120370631
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2124402734"
	)
	@Export("post")
	void post() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-894637983"
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lop;II)V",
		garbageValue = "257539679"
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
				this.ambient = var1.readByte();
			} else if (var2 == 114) {
				this.contrast = var1.readByte();
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
				this.params = class13.readStringIntParameters(var1, this.params);
			}
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lff;Lff;B)V",
		garbageValue = "-19"
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lff;Lff;I)V",
		garbageValue = "-2034384868"
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lff;Lff;I)V",
		garbageValue = "1014802643"
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)Lgk;",
		garbageValue = "1329833901"
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
				return TaskHandler.ItemDefinition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(HealthBarDefinition.ItemDefinition_modelArchive, this.model, 0);
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IS)Lhl;",
		garbageValue = "-15441"
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
				return TaskHandler.ItemDefinition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemDefinition_cachedModels.get((long)this.id);
		if (var5 != null) {
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(HealthBarDefinition.ItemDefinition_modelArchive, this.model, 0);
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

				var5 = var6.toModel(this.ambient + 64, this.contrast * 5 + 768, -50, -10, -50);
				var5.isSingleTile = true;
				ItemDefinition_cachedModels.put(var5, (long)this.id);
				return var5;
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)Lff;",
		garbageValue = "573530430"
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
				return TaskHandler.ItemDefinition_get(var2);
			}
		}

		return this;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-1361856849"
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
			if (!HealthBarDefinition.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
				var5 = false;
			}

			if (var3 != -1 && !HealthBarDefinition.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var5 = false;
			}

			if (var4 != -1 && !HealthBarDefinition.ItemDefinition_modelArchive.tryLoadFile(var4, 0)) {
				var5 = false;
			}

			return var5;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lgk;",
		garbageValue = "114"
	)
	public final ModelData method3397(boolean var1) {
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
			ModelData var5 = ModelData.ModelData_get(HealthBarDefinition.ItemDefinition_modelArchive, var2, 0);
			if (var3 != -1) {
				ModelData var6 = ModelData.ModelData_get(HealthBarDefinition.ItemDefinition_modelArchive, var3, 0);
				if (var4 != -1) {
					ModelData var7 = ModelData.ModelData_get(HealthBarDefinition.ItemDefinition_modelArchive, var4, 0);
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-1905200886"
	)
	public final boolean method3342(boolean var1) {
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
			if (!HealthBarDefinition.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
				var4 = false;
			}

			if (var3 != -1 && !HealthBarDefinition.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var4 = false;
			}

			return var4;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lgk;",
		garbageValue = "92"
	)
	public final ModelData method3409(boolean var1) {
		int var2 = this.maleHeadModel;
		int var3 = this.maleHeadModel2;
		if (var1) {
			var2 = this.femaleHeadModel;
			var3 = this.femaleHeadModel2;
		}

		if (var2 == -1) {
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(HealthBarDefinition.ItemDefinition_modelArchive, var2, 0);
			if (var3 != -1) {
				ModelData var5 = ModelData.ModelData_get(HealthBarDefinition.ItemDefinition_modelArchive, var3, 0);
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "722910624"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return NPC.method2251(this.params, var1, var2);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1720337072"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return VarbitComposition.method3205(this.params, var1, var2);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-668917541"
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

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "87"
	)
	boolean method3368() {
		return this.recolorTo != null;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "983299957"
	)
	boolean method3347() {
		return this.retextureTo != null;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)Len;",
		garbageValue = "1216305288"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "([I[II)V",
		garbageValue = "1539024101"
	)
	public static void method3408(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) {
			class176.ByteArrayPool_alternativeSizes = var0;
			ByteArrayPool.ByteArrayPool_altSizeArrayCounts = new int[var0.length];
			class260.ByteArrayPool_arrays = new byte[var0.length][][];

			for (int var2 = 0; var2 < class176.ByteArrayPool_alternativeSizes.length; ++var2) {
				class260.ByteArrayPool_arrays[var2] = new byte[var1[var2]][];
				ByteArrayPool.field3890.add(var0[var2]);
			}

			Collections.sort(ByteArrayPool.field3890);
		} else {
			class176.ByteArrayPool_alternativeSizes = null;
			ByteArrayPool.ByteArrayPool_altSizeArrayCounts = null;
			class260.ByteArrayPool_arrays = null;
			class301.method5508();
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II)I",
		garbageValue = "-1491033434"
	)
	public static int method3407(CharSequence var0, int var1) {
		return AttackOption.method2304(var0, var1, true);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-76865797"
	)
	public static boolean method3403(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.field119[var0] : false;
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1755655123"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (class174.loadInterface(var0)) {
			class150.runComponentCloseListeners(WorldMapSection1.Widget_interfaceComponents[var0], var1);
		}
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1815140573"
	)
	static void method3406() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) {
			int var1 = var0.group;
			if (class174.loadInterface(var1)) {
				boolean var2 = true;
				Widget[] var3 = WorldMapSection1.Widget_interfaceComponents[var1];

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) {
					if (var3[var4] != null) {
						var2 = var3[var4].isIf3;
						break;
					}
				}

				if (!var2) {
					var4 = (int)var0.key;
					Widget var5 = UserComparator9.getWidget(var4);
					if (var5 != null) {
						class184.invalidateWidget(var5);
					}
				}
			}
		}

	}
}
