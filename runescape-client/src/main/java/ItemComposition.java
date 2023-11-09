import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("ItemComposition_archive")
	public static AbstractArchive ItemComposition_archive;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("ItemComposition_modelArchive")
	public static AbstractArchive ItemComposition_modelArchive;
	@ObfuscatedName("j")
	@Export("ItemComposition_inMembersWorld")
	public static boolean ItemComposition_inMembersWorld;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("ItemComposition_cached")
	public static EvictingDualNodeHashTable ItemComposition_cached;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("ItemComposition_cachedModels")
	public static EvictingDualNodeHashTable ItemComposition_cachedModels;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("ItemComposition_cachedSprites")
	public static EvictingDualNodeHashTable ItemComposition_cachedSprites;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1697092487
	)
	@Export("id")
	public int id;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1585601327
	)
	@Export("model")
	int model;
	@ObfuscatedName("b")
	@Export("name")
	public String name;
	@ObfuscatedName("l")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("y")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("k")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("v")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1167053717
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1928391639
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 721462877
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -493009947
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 21870283
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 382722603
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 544675235
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1299695001
	)
	@Export("price")
	public int price;
	@ObfuscatedName("aj")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("au")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("af")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 903327239
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1008080273
	)
	@Export("maleModel")
	int maleModel;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1024154051
	)
	@Export("maleModel1")
	int maleModel1;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 477344961
	)
	@Export("maleOffset")
	int maleOffset;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -994201417
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2040594585
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1763818617
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 967603315
	)
	@Export("maleModel2")
	int maleModel2;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -334042993
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 440054617
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1477745815
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1569608343
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -2082564961
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("ae")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("ay")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -292764057
	)
	@Export("note")
	public int note;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -457985755
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 357614883
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1371277655
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -687076507
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1182739607
	)
	@Export("ambient")
	public int ambient;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1596389833
	)
	@Export("contrast")
	public int contrast;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1420581219
	)
	@Export("team")
	public int team;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("ba")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -477287585
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1893346121
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 2068394453
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -832411553
	)
	@Export("placeholderTemplate")
	public int placeholderTemplate;

	static {
		ItemComposition_cached = new EvictingDualNodeHashTable(64); // L: 28
		ItemComposition_cachedModels = new EvictingDualNodeHashTable(50); // L: 29
		ItemComposition_cachedSprites = new EvictingDualNodeHashTable(200);
	}

	ItemComposition() {
		this.name = "null"; // L: 34
		this.zoom2d = 2000; // L: 39
		this.xan2d = 0;
		this.yan2d = 0;
		this.zan2d = 0; // L: 42
		this.offsetX2d = 0; // L: 43
		this.offsetY2d = 0; // L: 44
		this.isStackable = 0; // L: 45
		this.price = 1; // L: 46
		this.isMembersOnly = false; // L: 47
		this.groundActions = new String[]{null, null, "Take", null, null}; // L: 48
		this.inventoryActions = new String[]{null, null, null, null, "Drop"}; // L: 49
		this.shiftClickIndex = -2; // L: 51
		this.maleModel = -1; // L: 52
		this.maleModel1 = -1; // L: 53
		this.maleOffset = 0; // L: 54
		this.femaleModel = -1; // L: 55
		this.femaleModel1 = -1; // L: 56
		this.femaleOffset = 0; // L: 57
		this.maleModel2 = -1; // L: 58
		this.femaleModel2 = -1; // L: 59
		this.maleHeadModel = -1; // L: 60
		this.maleHeadModel2 = -1; // L: 61
		this.femaleHeadModel = -1; // L: 62
		this.femaleHeadModel2 = -1; // L: 63
		this.note = -1; // L: 66
		this.noteTemplate = -1; // L: 67
		this.resizeX = 128; // L: 68
		this.resizeY = 128;
		this.resizeZ = 128; // L: 70
		this.ambient = 0;
		this.contrast = 0; // L: 72
		this.team = 0;
		this.isTradable = false; // L: 75
		this.unnotedId = -1; // L: 76
		this.notedId = -1; // L: 77
		this.placeholder = -1; // L: 78
		this.placeholderTemplate = -1; // L: 79
	} // L: 81

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "607205058"
	)
	@Export("post")
	void post() {
	} // L: 121

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqw;S)V",
		garbageValue = "-4398"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 125
			if (var2 == 0) { // L: 126
				return; // L: 129
			}

			this.decodeNext(var1, var2); // L: 127
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lqw;IB)V",
		garbageValue = "-50"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 132
			this.model = var1.readUnsignedShort();
		} else if (var2 == 2) { // L: 133
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 134
			this.zoom2d = var1.readUnsignedShort();
		} else if (var2 == 5) { // L: 135
			this.xan2d = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 136
			this.yan2d = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 137
			this.offsetX2d = var1.readUnsignedShort(); // L: 138
			if (this.offsetX2d > 32767) { // L: 139
				this.offsetX2d -= 65536;
			}
		} else if (var2 == 8) { // L: 141
			this.offsetY2d = var1.readUnsignedShort(); // L: 142
			if (this.offsetY2d > 32767) { // L: 143
				this.offsetY2d -= 65536;
			}
		} else if (var2 == 9) { // L: 145
			var1.readStringCp1252NullTerminated(); // L: 146
		} else if (var2 == 11) { // L: 148
			this.isStackable = 1;
		} else if (var2 == 12) { // L: 149
			this.price = var1.readInt();
		} else if (var2 == 16) { // L: 150
			this.isMembersOnly = true;
		} else if (var2 == 23) { // L: 151
			this.maleModel = var1.readUnsignedShort(); // L: 152
			this.maleOffset = var1.readUnsignedByte(); // L: 153
		} else if (var2 == 24) { // L: 155
			this.maleModel1 = var1.readUnsignedShort();
		} else if (var2 == 25) { // L: 156
			this.femaleModel = var1.readUnsignedShort(); // L: 157
			this.femaleOffset = var1.readUnsignedByte(); // L: 158
		} else if (var2 == 26) { // L: 160
			this.femaleModel1 = var1.readUnsignedShort();
		} else if (var2 >= 30 && var2 < 35) { // L: 161
			this.groundActions[var2 - 30] = var1.readStringCp1252NullTerminated(); // L: 162
			if (this.groundActions[var2 - 30].equalsIgnoreCase("Hidden")) { // L: 163
				this.groundActions[var2 - 30] = null;
			}
		} else if (var2 >= 35 && var2 < 40) { // L: 165
			this.inventoryActions[var2 - 35] = var1.readStringCp1252NullTerminated();
		} else {
			int var3;
			int var4;
			if (var2 == 40) { // L: 166
				var3 = var1.readUnsignedByte(); // L: 167
				this.recolorFrom = new short[var3]; // L: 168
				this.recolorTo = new short[var3]; // L: 169

				for (var4 = 0; var4 < var3; ++var4) { // L: 170
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 171
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 172
				}
			} else if (var2 == 41) { // L: 175
				var3 = var1.readUnsignedByte(); // L: 176
				this.retextureFrom = new short[var3]; // L: 177
				this.retextureTo = new short[var3]; // L: 178

				for (var4 = 0; var4 < var3; ++var4) { // L: 179
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 180
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 181
				}
			} else if (var2 == 42) { // L: 184
				this.shiftClickIndex = var1.readByte(); // L: 185
			} else if (var2 == 65) { // L: 187
				this.isTradable = true;
			} else if (var2 == 78) { // L: 188
				this.maleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) { // L: 189
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 90) { // L: 190
				this.maleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 91) { // L: 191
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 92) { // L: 192
				this.maleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 93) { // L: 193
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 94) { // L: 194
				var1.readUnsignedShort(); // L: 195
			} else if (var2 == 95) { // L: 197
				this.zan2d = var1.readUnsignedShort();
			} else if (var2 == 97) {
				this.note = var1.readUnsignedShort();
			} else if (var2 == 98) {
				this.noteTemplate = var1.readUnsignedShort();
			} else if (var2 >= 100 && var2 < 110) {
				if (this.countobj == null) {
					this.countobj = new int[10]; // L: 202
					this.countco = new int[10]; // L: 203
				}

				this.countobj[var2 - 100] = var1.readUnsignedShort(); // L: 205
				this.countco[var2 - 100] = var1.readUnsignedShort(); // L: 206
			} else if (var2 == 110) { // L: 208
				this.resizeX = var1.readUnsignedShort();
			} else if (var2 == 111) { // L: 209
				this.resizeY = var1.readUnsignedShort();
			} else if (var2 == 112) { // L: 210
				this.resizeZ = var1.readUnsignedShort();
			} else if (var2 == 113) { // L: 211
				this.ambient = var1.readByte();
			} else if (var2 == 114) { // L: 212
				this.contrast = var1.readByte() * 5;
			} else if (var2 == 115) { // L: 213
				this.team = var1.readUnsignedByte();
			} else if (var2 == 139) { // L: 214
				this.unnotedId = var1.readUnsignedShort();
			} else if (var2 == 140) { // L: 215
				this.notedId = var1.readUnsignedShort();
			} else if (var2 == 148) { // L: 216
				this.placeholder = var1.readUnsignedShort();
			} else if (var2 == 149) { // L: 217
				this.placeholderTemplate = var1.readUnsignedShort();
			} else if (var2 == 249) { // L: 218
				this.params = class125.readStringIntParameters(var1, this.params);
			}
		}

	} // L: 220

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lge;Lge;I)V",
		garbageValue = "-1402873766"
	)
	@Export("genCert")
	void genCert(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 223
		this.zoom2d = var1.zoom2d; // L: 224
		this.xan2d = var1.xan2d; // L: 225
		this.yan2d = var1.yan2d; // L: 226
		this.zan2d = var1.zan2d; // L: 227
		this.offsetX2d = var1.offsetX2d; // L: 228
		this.offsetY2d = var1.offsetY2d; // L: 229
		this.recolorFrom = var1.recolorFrom; // L: 230
		this.recolorTo = var1.recolorTo; // L: 231
		this.retextureFrom = var1.retextureFrom; // L: 232
		this.retextureTo = var1.retextureTo; // L: 233
		this.name = var2.name; // L: 234
		this.isMembersOnly = var2.isMembersOnly; // L: 235
		this.price = var2.price; // L: 236
		this.isStackable = 1; // L: 237
	} // L: 238

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lge;Lge;I)V",
		garbageValue = "1300542943"
	)
	@Export("genBought")
	void genBought(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 241
		this.zoom2d = var1.zoom2d; // L: 242
		this.xan2d = var1.xan2d; // L: 243
		this.yan2d = var1.yan2d; // L: 244
		this.zan2d = var1.zan2d; // L: 245
		this.offsetX2d = var1.offsetX2d; // L: 246
		this.offsetY2d = var1.offsetY2d; // L: 247
		this.recolorFrom = var2.recolorFrom; // L: 248
		this.recolorTo = var2.recolorTo; // L: 249
		this.retextureFrom = var2.retextureFrom; // L: 250
		this.retextureTo = var2.retextureTo; // L: 251
		this.name = var2.name; // L: 252
		this.isMembersOnly = var2.isMembersOnly; // L: 253
		this.isStackable = var2.isStackable; // L: 254
		this.maleModel = var2.maleModel; // L: 255
		this.maleModel1 = var2.maleModel1; // L: 256
		this.maleModel2 = var2.maleModel2; // L: 257
		this.femaleModel = var2.femaleModel; // L: 258
		this.femaleModel1 = var2.femaleModel1; // L: 259
		this.femaleModel2 = var2.femaleModel2; // L: 260
		this.maleHeadModel = var2.maleHeadModel; // L: 261
		this.maleHeadModel2 = var2.maleHeadModel2; // L: 262
		this.femaleHeadModel = var2.femaleHeadModel; // L: 263
		this.femaleHeadModel2 = var2.femaleHeadModel2; // L: 264
		this.team = var2.team; // L: 265
		this.groundActions = var2.groundActions; // L: 266
		this.inventoryActions = new String[5]; // L: 267
		if (var2.inventoryActions != null) { // L: 268
			for (int var3 = 0; var3 < 4; ++var3) {
				this.inventoryActions[var3] = var2.inventoryActions[var3];
			}
		}

		this.inventoryActions[4] = "Discard"; // L: 269
		this.price = 0; // L: 270
	} // L: 271

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lge;Lge;I)V",
		garbageValue = "-474283631"
	)
	@Export("genPlaceholder")
	void genPlaceholder(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 274
		this.zoom2d = var1.zoom2d; // L: 275
		this.xan2d = var1.xan2d; // L: 276
		this.yan2d = var1.yan2d; // L: 277
		this.zan2d = var1.zan2d; // L: 278
		this.offsetX2d = var1.offsetX2d; // L: 279
		this.offsetY2d = var1.offsetY2d; // L: 280
		this.recolorFrom = var1.recolorFrom; // L: 281
		this.recolorTo = var1.recolorTo; // L: 282
		this.retextureFrom = var1.retextureFrom; // L: 283
		this.retextureTo = var1.retextureTo; // L: 284
		this.isStackable = var1.isStackable; // L: 285
		this.name = var2.name; // L: 286
		this.price = 0; // L: 287
		this.isMembersOnly = false; // L: 288
		this.isTradable = false; // L: 289
	} // L: 290

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)Lgw;",
		garbageValue = "1809583243"
	)
	@Export("getModelData")
	public final ModelData getModelData(int var1) {
		int var3;
		if (this.countobj != null && var1 > 1) { // L: 293
			int var2 = -1; // L: 294

			for (var3 = 0; var3 < 10; ++var3) { // L: 295
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 296
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 298
				return class258.ItemComposition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(ItemComposition_modelArchive, this.model, 0); // L: 300
		if (var4 == null) { // L: 301
			return null;
		} else {
			if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) { // L: 302
				var4.resize(this.resizeX, this.resizeY, this.resizeZ);
			}

			if (this.recolorFrom != null) { // L: 303
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) { // L: 304
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]); // L: 305
				}
			}

			if (this.retextureFrom != null) { // L: 308
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) { // L: 309
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]); // L: 310
				}
			}

			return var4; // L: 313
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhd;",
		garbageValue = "-123"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 317
			int var2 = -1; // L: 318

			for (int var3 = 0; var3 < 10; ++var3) { // L: 319
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 320
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 322
				return class258.ItemComposition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemComposition_cachedModels.get((long)this.id); // L: 324
		if (var5 != null) { // L: 325
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(ItemComposition_modelArchive, this.model, 0); // L: 326
			if (var6 == null) { // L: 327
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) { // L: 328
					var6.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				int var4;
				if (this.recolorFrom != null) { // L: 329
					for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 330
						var6.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 331
					}
				}

				if (this.retextureFrom != null) { // L: 334
					for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 335
						var6.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 336
					}
				}

				var5 = var6.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50); // L: 339
				var5.isSingleTile = true; // L: 340
				ItemComposition_cachedModels.put(var5, (long)this.id); // L: 341
				return var5; // L: 342
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)Lge;",
		garbageValue = "296063352"
	)
	@Export("getCountObj")
	public ItemComposition getCountObj(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 346
			int var2 = -1; // L: 347

			for (int var3 = 0; var3 < 10; ++var3) { // L: 348
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3]; // L: 349
				}
			}

			if (var2 != -1) { // L: 351
				return class258.ItemComposition_get(var2);
			}
		}

		return this; // L: 353
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-1980519580"
	)
	@Export("hasNoValidModel")
	public final boolean hasNoValidModel(boolean var1) {
		int var2 = this.maleModel; // L: 438
		int var3 = this.maleModel1; // L: 439
		int var4 = this.maleModel2; // L: 440
		if (var1) { // L: 441
			var2 = this.femaleModel; // L: 442
			var3 = this.femaleModel1; // L: 443
			var4 = this.femaleModel2; // L: 444
		}

		if (var2 == -1) { // L: 446
			return true;
		} else {
			boolean var5 = true; // L: 447
			if (!ItemComposition_modelArchive.tryLoadFile(var2, 0)) { // L: 448
				var5 = false;
			}

			if (var3 != -1 && !ItemComposition_modelArchive.tryLoadFile(var3, 0)) { // L: 449
				var5 = false;
			}

			if (var4 != -1 && !ItemComposition_modelArchive.tryLoadFile(var4, 0)) { // L: 450
				var5 = false;
			}

			return var5; // L: 451
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lgw;",
		garbageValue = "-394692090"
	)
	public final ModelData method3710(boolean var1) {
		int var2 = this.maleModel; // L: 455
		int var3 = this.maleModel1; // L: 456
		int var4 = this.maleModel2; // L: 457
		if (var1) { // L: 458
			var2 = this.femaleModel; // L: 459
			var3 = this.femaleModel1; // L: 460
			var4 = this.femaleModel2; // L: 461
		}

		if (var2 == -1) { // L: 463
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(ItemComposition_modelArchive, var2, 0); // L: 464
			if (var3 != -1) { // L: 465
				ModelData var6 = ModelData.ModelData_get(ItemComposition_modelArchive, var3, 0); // L: 466
				if (var4 != -1) { // L: 467
					ModelData var7 = ModelData.ModelData_get(ItemComposition_modelArchive, var4, 0); // L: 468
					ModelData[] var8 = new ModelData[]{var5, var6, var7}; // L: 469
					var5 = new ModelData(var8, 3); // L: 470
				} else {
					ModelData[] var10 = new ModelData[]{var5, var6}; // L: 473
					var5 = new ModelData(var10, 2); // L: 474
				}
			}

			if (!var1 && this.maleOffset != 0) { // L: 477
				var5.changeOffset(0, this.maleOffset, 0);
			}

			if (var1 && this.femaleOffset != 0) { // L: 478
				var5.changeOffset(0, this.femaleOffset, 0);
			}

			int var9;
			if (this.recolorFrom != null) { // L: 479
				for (var9 = 0; var9 < this.recolorFrom.length; ++var9) { // L: 480
					var5.recolor(this.recolorFrom[var9], this.recolorTo[var9]); // L: 481
				}
			}

			if (this.retextureFrom != null) { // L: 484
				for (var9 = 0; var9 < this.retextureFrom.length; ++var9) { // L: 485
					var5.retexture(this.retextureFrom[var9], this.retextureTo[var9]); // L: 486
				}
			}

			return var5; // L: 489
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "41"
	)
	public final boolean method3711(boolean var1) {
		int var2 = this.maleHeadModel; // L: 493
		int var3 = this.maleHeadModel2; // L: 494
		if (var1) { // L: 495
			var2 = this.femaleHeadModel; // L: 496
			var3 = this.femaleHeadModel2; // L: 497
		}

		if (var2 == -1) { // L: 499
			return true;
		} else {
			boolean var4 = true; // L: 500
			if (!ItemComposition_modelArchive.tryLoadFile(var2, 0)) { // L: 501
				var4 = false;
			}

			if (var3 != -1 && !ItemComposition_modelArchive.tryLoadFile(var3, 0)) { // L: 502
				var4 = false;
			}

			return var4; // L: 503
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lgw;",
		garbageValue = "-63"
	)
	public final ModelData method3717(boolean var1) {
		int var2 = this.maleHeadModel; // L: 507
		int var3 = this.maleHeadModel2; // L: 508
		if (var1) { // L: 509
			var2 = this.femaleHeadModel; // L: 510
			var3 = this.femaleHeadModel2; // L: 511
		}

		if (var2 == -1) { // L: 513
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(ItemComposition_modelArchive, var2, 0); // L: 514
			if (var3 != -1) { // L: 515
				ModelData var5 = ModelData.ModelData_get(ItemComposition_modelArchive, var3, 0); // L: 516
				ModelData[] var6 = new ModelData[]{var4, var5}; // L: 517
				var4 = new ModelData(var6, 2); // L: 518
			}

			int var7;
			if (this.recolorFrom != null) { // L: 520
				for (var7 = 0; var7 < this.recolorFrom.length; ++var7) { // L: 521
					var4.recolor(this.recolorFrom[var7], this.recolorTo[var7]); // L: 522
				}
			}

			if (this.retextureFrom != null) { // L: 525
				for (var7 = 0; var7 < this.retextureFrom.length; ++var7) { // L: 526
					var4.retexture(this.retextureFrom[var7], this.retextureTo[var7]); // L: 527
				}
			}

			return var4; // L: 530
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1455842920"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params; // L: 535
		int var3;
		if (var4 == null) { // L: 537
			var3 = var2; // L: 538
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1); // L: 541
			if (var5 == null) { // L: 542
				var3 = var2; // L: 543
			} else {
				var3 = var5.integer; // L: 546
			}
		}

		return var3; // L: 548
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1195722147"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return Messages.method2575(this.params, var1, var2); // L: 552
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2129241972"
	)
	@Export("getShiftClickIndex")
	public int getShiftClickIndex() {
		if (this.shiftClickIndex != -1 && this.inventoryActions != null) { // L: 556
			if (this.shiftClickIndex >= 0) { // L: 557
				return this.inventoryActions[this.shiftClickIndex] != null ? this.shiftClickIndex : -1;
			} else {
				return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1; // L: 558
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "5901"
	)
	boolean method3716() {
		return this.recolorTo != null; // L: 562
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-773272356"
	)
	boolean method3731() {
		return this.retextureTo != null; // L: 566
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-187084750"
	)
	static void method3703() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 30
			if (var0.stream1 != null) { // L: 31
				StructComposition.pcmStreamMixer.removeSubStream(var0.stream1); // L: 32
				var0.stream1 = null; // L: 33
			}

			if (var0.stream2 != null) { // L: 35
				StructComposition.pcmStreamMixer.removeSubStream(var0.stream2); // L: 36
				var0.stream2 = null; // L: 37
			}
		}

		ObjectSound.objectSounds.clear(); // L: 40
	} // L: 41

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1960768573"
	)
	public static int method3764(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0]; // L: 69
		int var1 = (int)(var2 >>> 0 & 127L); // L: 71
		return var1; // L: 73
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2074950429"
	)
	public static void method3782() {
		HitSplatDefinition.HitSplatDefinition_cached.clear(); // L: 198
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear(); // L: 199
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear(); // L: 200
	} // L: 201

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	static void method3712() {
		Client.menuOptionsCount = 0; // L: 8317
		Client.isMenuOpen = false; // L: 8318
	} // L: 8319
}
