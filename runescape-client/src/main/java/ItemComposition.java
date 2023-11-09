import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("ItemComposition_archive")
	static AbstractArchive ItemComposition_archive;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("ItemComposition_modelArchive")
	static AbstractArchive ItemComposition_modelArchive;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("ItemComposition_cached")
	static EvictingDualNodeHashTable ItemComposition_cached;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("ItemComposition_cachedModels")
	static EvictingDualNodeHashTable ItemComposition_cachedModels;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("ItemComposition_cachedSprites")
	static EvictingDualNodeHashTable ItemComposition_cachedSprites;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1571483579
	)
	@Export("id")
	public int id;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -2132444491
	)
	@Export("model")
	int model;
	@ObfuscatedName("z")
	@Export("name")
	public String name;
	@ObfuscatedName("r")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("y")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("p")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("e")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1237058049
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1096273037
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 715428215
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -662140483
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1479969367
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -344320311
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1525840713
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1888546333
	)
	@Export("price")
	public int price;
	@ObfuscatedName("av")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("aj")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("ax")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1273767007
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1239974355
	)
	@Export("maleModel")
	int maleModel;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 2099267221
	)
	@Export("maleModel1")
	int maleModel1;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2127367783
	)
	@Export("maleOffset")
	int maleOffset;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1056814943
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -405190763
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -455247843
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1117315057
	)
	@Export("maleModel2")
	int maleModel2;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1599359987
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1247125843
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -774158281
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1975856385
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -340088809
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("ah")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("aa")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -123389315
	)
	@Export("note")
	public int note;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 128305431
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1040780799
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -724567899
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1700156139
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1043464283
	)
	@Export("ambient")
	public int ambient;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1543605489
	)
	@Export("contrast")
	public int contrast;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 92660005
	)
	@Export("team")
	public int team;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("bu")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -2021253043
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1585697687
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 825777631
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -362144601
	)
	@Export("placeholderTemplate")
	public int placeholderTemplate;

	static {
		ItemComposition_cached = new EvictingDualNodeHashTable(64); // L: 28
		ItemComposition_cachedModels = new EvictingDualNodeHashTable(50); // L: 29
		ItemComposition_cachedSprites = new EvictingDualNodeHashTable(200); // L: 30
	}

	ItemComposition() {
		this.name = "null"; // L: 34
		this.zoom2d = 2000; // L: 39
		this.xan2d = 0; // L: 40
		this.yan2d = 0; // L: 41
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
		this.resizeY = 128; // L: 69
		this.resizeZ = 128; // L: 70
		this.ambient = 0; // L: 71
		this.contrast = 0; // L: 72
		this.team = 0; // L: 73
		this.isTradable = false; // L: 75
		this.unnotedId = -1; // L: 76
		this.notedId = -1; // L: 77
		this.placeholder = -1; // L: 78
		this.placeholderTemplate = -1; // L: 79
	} // L: 81

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-39"
	)
	@Export("post")
	void post() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqr;S)V",
		garbageValue = "128"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 133
			if (var2 == 0) {
				return; // L: 137
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqr;II)V",
		garbageValue = "-1426643614"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 140
			this.model = var1.readUnsignedShort();
		} else if (var2 == 2) { // L: 141
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.zoom2d = var1.readUnsignedShort();
		} else if (var2 == 5) { // L: 143
			this.xan2d = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 144
			this.yan2d = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 145
			this.offsetX2d = var1.readUnsignedShort();
			if (this.offsetX2d > 32767) { // L: 147
				this.offsetX2d -= 65536;
			}
		} else if (var2 == 8) {
			this.offsetY2d = var1.readUnsignedShort();
			if (this.offsetY2d > 32767) { // L: 151
				this.offsetY2d -= 65536;
			}
		} else if (var2 == 9) {
			var1.readStringCp1252NullTerminated();
		} else if (var2 == 11) { // L: 156
			this.isStackable = 1;
		} else if (var2 == 12) { // L: 157
			this.price = var1.readInt();
		} else if (var2 == 16) {
			this.isMembersOnly = true;
		} else if (var2 == 23) {
			this.maleModel = var1.readUnsignedShort(); // L: 160
			this.maleOffset = var1.readUnsignedByte(); // L: 161
		} else if (var2 == 24) {
			this.maleModel1 = var1.readUnsignedShort();
		} else if (var2 == 25) { // L: 164
			this.femaleModel = var1.readUnsignedShort(); // L: 165
			this.femaleOffset = var1.readUnsignedByte();
		} else if (var2 == 26) {
			this.femaleModel1 = var1.readUnsignedShort();
		} else if (var2 >= 30 && var2 < 35) { // L: 169
			this.groundActions[var2 - 30] = var1.readStringCp1252NullTerminated();
			if (this.groundActions[var2 - 30].equalsIgnoreCase("Hidden")) { // L: 171
				this.groundActions[var2 - 30] = null;
			}
		} else if (var2 >= 35 && var2 < 40) { // L: 173
			this.inventoryActions[var2 - 35] = var1.readStringCp1252NullTerminated();
		} else {
			int var3;
			int var4;
			if (var2 == 40) {
				var3 = var1.readUnsignedByte(); // L: 175
				this.recolorFrom = new short[var3]; // L: 176
				this.recolorTo = new short[var3]; // L: 177

				for (var4 = 0; var4 < var3; ++var4) { // L: 178
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 179
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 180
				}
			} else if (var2 == 41) { // L: 183
				var3 = var1.readUnsignedByte(); // L: 184
				this.retextureFrom = new short[var3]; // L: 185
				this.retextureTo = new short[var3]; // L: 186

				for (var4 = 0; var4 < var3; ++var4) { // L: 187
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 188
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 189
				}
			} else if (var2 == 42) { // L: 192
				this.shiftClickIndex = var1.readByte(); // L: 193
			} else if (var2 == 65) { // L: 195
				this.isTradable = true;
			} else if (var2 == 78) { // L: 196
				this.maleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) { // L: 197
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 90) { // L: 198
				this.maleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 91) { // L: 199
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 92) { // L: 200
				this.maleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 93) { // L: 201
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 94) { // L: 202
				var1.readUnsignedShort(); // L: 203
			} else if (var2 == 95) { // L: 205
				this.zan2d = var1.readUnsignedShort();
			} else if (var2 == 97) { // L: 206
				this.note = var1.readUnsignedShort();
			} else if (var2 == 98) { // L: 207
				this.noteTemplate = var1.readUnsignedShort();
			} else if (var2 >= 100 && var2 < 110) { // L: 208
				if (this.countobj == null) { // L: 209
					this.countobj = new int[10]; // L: 210
					this.countco = new int[10]; // L: 211
				}

				this.countobj[var2 - 100] = var1.readUnsignedShort(); // L: 213
				this.countco[var2 - 100] = var1.readUnsignedShort(); // L: 214
			} else if (var2 == 110) { // L: 216
				this.resizeX = var1.readUnsignedShort();
			} else if (var2 == 111) { // L: 217
				this.resizeY = var1.readUnsignedShort();
			} else if (var2 == 112) { // L: 218
				this.resizeZ = var1.readUnsignedShort();
			} else if (var2 == 113) { // L: 219
				this.ambient = var1.readByte();
			} else if (var2 == 114) { // L: 220
				this.contrast = var1.readByte() * 5;
			} else if (var2 == 115) { // L: 221
				this.team = var1.readUnsignedByte();
			} else if (var2 == 139) { // L: 222
				this.unnotedId = var1.readUnsignedShort();
			} else if (var2 == 140) { // L: 223
				this.notedId = var1.readUnsignedShort();
			} else if (var2 == 148) { // L: 224
				this.placeholder = var1.readUnsignedShort();
			} else if (var2 == 149) { // L: 225
				this.placeholderTemplate = var1.readUnsignedShort();
			} else if (var2 == 249) { // L: 226
				this.params = World.readStringIntParameters(var1, this.params);
			}
		}

	} // L: 228

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lgb;Lgb;B)V",
		garbageValue = "84"
	)
	@Export("genCert")
	void genCert(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 231
		this.zoom2d = var1.zoom2d; // L: 232
		this.xan2d = var1.xan2d; // L: 233
		this.yan2d = var1.yan2d; // L: 234
		this.zan2d = var1.zan2d; // L: 235
		this.offsetX2d = var1.offsetX2d; // L: 236
		this.offsetY2d = var1.offsetY2d; // L: 237
		this.recolorFrom = var1.recolorFrom; // L: 238
		this.recolorTo = var1.recolorTo; // L: 239
		this.retextureFrom = var1.retextureFrom; // L: 240
		this.retextureTo = var1.retextureTo; // L: 241
		this.name = var2.name; // L: 242
		this.isMembersOnly = var2.isMembersOnly; // L: 243
		this.price = var2.price; // L: 244
		this.isStackable = 1; // L: 245
	} // L: 246

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lgb;Lgb;I)V",
		garbageValue = "-2067873900"
	)
	@Export("genBought")
	void genBought(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 249
		this.zoom2d = var1.zoom2d; // L: 250
		this.xan2d = var1.xan2d; // L: 251
		this.yan2d = var1.yan2d; // L: 252
		this.zan2d = var1.zan2d; // L: 253
		this.offsetX2d = var1.offsetX2d; // L: 254
		this.offsetY2d = var1.offsetY2d; // L: 255
		this.recolorFrom = var2.recolorFrom; // L: 256
		this.recolorTo = var2.recolorTo; // L: 257
		this.retextureFrom = var2.retextureFrom; // L: 258
		this.retextureTo = var2.retextureTo; // L: 259
		this.name = var2.name; // L: 260
		this.isMembersOnly = var2.isMembersOnly; // L: 261
		this.isStackable = var2.isStackable; // L: 262
		this.maleModel = var2.maleModel; // L: 263
		this.maleModel1 = var2.maleModel1; // L: 264
		this.maleModel2 = var2.maleModel2; // L: 265
		this.femaleModel = var2.femaleModel; // L: 266
		this.femaleModel1 = var2.femaleModel1; // L: 267
		this.femaleModel2 = var2.femaleModel2; // L: 268
		this.maleHeadModel = var2.maleHeadModel; // L: 269
		this.maleHeadModel2 = var2.maleHeadModel2; // L: 270
		this.femaleHeadModel = var2.femaleHeadModel; // L: 271
		this.femaleHeadModel2 = var2.femaleHeadModel2; // L: 272
		this.team = var2.team; // L: 273
		this.groundActions = var2.groundActions; // L: 274
		this.inventoryActions = new String[5]; // L: 275
		if (var2.inventoryActions != null) { // L: 276
			for (int var3 = 0; var3 < 4; ++var3) {
				this.inventoryActions[var3] = var2.inventoryActions[var3];
			}
		}

		this.inventoryActions[4] = "Discard"; // L: 277
		this.price = 0; // L: 278
	} // L: 279

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lgb;Lgb;B)V",
		garbageValue = "8"
	)
	@Export("genPlaceholder")
	void genPlaceholder(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 282
		this.zoom2d = var1.zoom2d; // L: 283
		this.xan2d = var1.xan2d; // L: 284
		this.yan2d = var1.yan2d; // L: 285
		this.zan2d = var1.zan2d; // L: 286
		this.offsetX2d = var1.offsetX2d; // L: 287
		this.offsetY2d = var1.offsetY2d; // L: 288
		this.recolorFrom = var1.recolorFrom; // L: 289
		this.recolorTo = var1.recolorTo; // L: 290
		this.retextureFrom = var1.retextureFrom; // L: 291
		this.retextureTo = var1.retextureTo; // L: 292
		this.isStackable = var1.isStackable; // L: 293
		this.name = var2.name; // L: 294
		this.price = 0; // L: 295
		this.isMembersOnly = false; // L: 296
		this.isTradable = false; // L: 297
	} // L: 298

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Lgp;",
		garbageValue = "-2116528809"
	)
	@Export("getModelData")
	public final ModelData getModelData(int var1) {
		int var3;
		if (this.countobj != null && var1 > 1) { // L: 301
			int var2 = -1; // L: 302

			for (var3 = 0; var3 < 10; ++var3) { // L: 303
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 304
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 306
				return AttackOption.ItemComposition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(ItemComposition_modelArchive, this.model, 0); // L: 308
		if (var4 == null) { // L: 309
			return null;
		} else {
			if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) { // L: 310
				var4.resize(this.resizeX, this.resizeY, this.resizeZ);
			}

			if (this.recolorFrom != null) { // L: 311
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) { // L: 312
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]); // L: 313
				}
			}

			if (this.retextureFrom != null) { // L: 316
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) { // L: 317
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]); // L: 318
				}
			}

			return var4; // L: 321
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhp;",
		garbageValue = "0"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 325
			int var2 = -1; // L: 326

			for (int var3 = 0; var3 < 10; ++var3) { // L: 327
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 328
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 330
				return AttackOption.ItemComposition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemComposition_cachedModels.get((long)this.id); // L: 332
		if (var5 != null) { // L: 333
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(ItemComposition_modelArchive, this.model, 0); // L: 334
			if (var6 == null) { // L: 335
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) { // L: 336
					var6.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				int var4;
				if (this.recolorFrom != null) { // L: 337
					for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 338
						var6.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 339
					}
				}

				if (this.retextureFrom != null) { // L: 342
					for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 343
						var6.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 344
					}
				}

				var5 = var6.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50); // L: 347
				var5.isSingleTile = true; // L: 348
				ItemComposition_cachedModels.put(var5, (long)this.id); // L: 349
				return var5; // L: 350
			}
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(II)Lgb;",
		garbageValue = "411603096"
	)
	@Export("getCountObj")
	public ItemComposition getCountObj(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 354
			int var2 = -1; // L: 355

			for (int var3 = 0; var3 < 10; ++var3) { // L: 356
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3]; // L: 357
				}
			}

			if (var2 != -1) { // L: 359
				return AttackOption.ItemComposition_get(var2);
			}
		}

		return this; // L: 361
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "1314835382"
	)
	@Export("hasNoValidModel")
	public final boolean hasNoValidModel(boolean var1) {
		int var2 = this.maleModel; // L: 446
		int var3 = this.maleModel1; // L: 447
		int var4 = this.maleModel2; // L: 448
		if (var1) { // L: 449
			var2 = this.femaleModel; // L: 450
			var3 = this.femaleModel1; // L: 451
			var4 = this.femaleModel2; // L: 452
		}

		if (var2 == -1) { // L: 454
			return true;
		} else {
			boolean var5 = true; // L: 455
			if (!ItemComposition_modelArchive.tryLoadFile(var2, 0)) { // L: 456
				var5 = false;
			}

			if (var3 != -1 && !ItemComposition_modelArchive.tryLoadFile(var3, 0)) { // L: 457
				var5 = false;
			}

			if (var4 != -1 && !ItemComposition_modelArchive.tryLoadFile(var4, 0)) { // L: 458
				var5 = false;
			}

			return var5; // L: 459
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lgp;",
		garbageValue = "980966539"
	)
	public final ModelData method3635(boolean var1) {
		int var2 = this.maleModel; // L: 463
		int var3 = this.maleModel1; // L: 464
		int var4 = this.maleModel2; // L: 465
		if (var1) { // L: 466
			var2 = this.femaleModel; // L: 467
			var3 = this.femaleModel1; // L: 468
			var4 = this.femaleModel2; // L: 469
		}

		if (var2 == -1) { // L: 471
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(ItemComposition_modelArchive, var2, 0); // L: 472
			if (var3 != -1) { // L: 473
				ModelData var6 = ModelData.ModelData_get(ItemComposition_modelArchive, var3, 0); // L: 474
				if (var4 != -1) { // L: 475
					ModelData var7 = ModelData.ModelData_get(ItemComposition_modelArchive, var4, 0); // L: 476
					ModelData[] var8 = new ModelData[]{var5, var6, var7}; // L: 477
					var5 = new ModelData(var8, 3); // L: 478
				} else {
					ModelData[] var10 = new ModelData[]{var5, var6}; // L: 481
					var5 = new ModelData(var10, 2); // L: 482
				}
			}

			if (!var1 && this.maleOffset != 0) { // L: 485
				var5.changeOffset(0, this.maleOffset, 0);
			}

			if (var1 && this.femaleOffset != 0) { // L: 486
				var5.changeOffset(0, this.femaleOffset, 0);
			}

			int var9;
			if (this.recolorFrom != null) { // L: 487
				for (var9 = 0; var9 < this.recolorFrom.length; ++var9) { // L: 488
					var5.recolor(this.recolorFrom[var9], this.recolorTo[var9]); // L: 489
				}
			}

			if (this.retextureFrom != null) { // L: 492
				for (var9 = 0; var9 < this.retextureFrom.length; ++var9) { // L: 493
					var5.retexture(this.retextureFrom[var9], this.retextureTo[var9]); // L: 494
				}
			}

			return var5; // L: 497
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-326599837"
	)
	public final boolean method3630(boolean var1) {
		int var2 = this.maleHeadModel; // L: 501
		int var3 = this.maleHeadModel2; // L: 502
		if (var1) { // L: 503
			var2 = this.femaleHeadModel; // L: 504
			var3 = this.femaleHeadModel2; // L: 505
		}

		if (var2 == -1) { // L: 507
			return true;
		} else {
			boolean var4 = true; // L: 508
			if (!ItemComposition_modelArchive.tryLoadFile(var2, 0)) { // L: 509
				var4 = false;
			}

			if (var3 != -1 && !ItemComposition_modelArchive.tryLoadFile(var3, 0)) { // L: 510
				var4 = false;
			}

			return var4; // L: 511
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lgp;",
		garbageValue = "-1810129399"
	)
	public final ModelData method3637(boolean var1) {
		int var2 = this.maleHeadModel; // L: 515
		int var3 = this.maleHeadModel2; // L: 516
		if (var1) { // L: 517
			var2 = this.femaleHeadModel; // L: 518
			var3 = this.femaleHeadModel2; // L: 519
		}

		if (var2 == -1) { // L: 521
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(ItemComposition_modelArchive, var2, 0); // L: 522
			if (var3 != -1) { // L: 523
				ModelData var5 = ModelData.ModelData_get(ItemComposition_modelArchive, var3, 0); // L: 524
				ModelData[] var6 = new ModelData[]{var4, var5}; // L: 525
				var4 = new ModelData(var6, 2); // L: 526
			}

			int var7;
			if (this.recolorFrom != null) { // L: 528
				for (var7 = 0; var7 < this.recolorFrom.length; ++var7) { // L: 529
					var4.recolor(this.recolorFrom[var7], this.recolorTo[var7]); // L: 530
				}
			}

			if (this.retextureFrom != null) { // L: 533
				for (var7 = 0; var7 < this.retextureFrom.length; ++var7) { // L: 534
					var4.retexture(this.retextureFrom[var7], this.retextureTo[var7]); // L: 535
				}
			}

			return var4; // L: 538
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1675263044"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return ScriptFrame.method1035(this.params, var1, var2); // L: 542
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-2122627788"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class132.method2837(this.params, var1, var2); // L: 546
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1547353394"
	)
	@Export("getShiftClickIndex")
	public int getShiftClickIndex() {
		if (this.shiftClickIndex != -1 && this.inventoryActions != null) { // L: 550
			if (this.shiftClickIndex >= 0) { // L: 551
				return this.inventoryActions[this.shiftClickIndex] != null ? this.shiftClickIndex : -1;
			} else {
				return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1; // L: 552
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1344415370"
	)
	boolean method3641() {
		return this.recolorTo != null; // L: 566
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-854425566"
	)
	boolean method3642() {
		return this.retextureTo != null; // L: 570
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIII[Lgl;I)V",
		garbageValue = "2060906941"
	)
	static final void method3657(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, CollisionMap[] var8) {
		int var10;
		for (int var9 = 0; var9 < 8; ++var9) { // L: 111
			for (var10 = 0; var10 < 8; ++var10) { // L: 112
				if (var9 + var2 > 0 && var9 + var2 < 103 && var3 + var10 > 0 && var3 + var10 < 103) { // L: 113
					int[] var10000 = var8[var1].flags[var9 + var2];
					var10000[var10 + var3] &= -16777217;
				}
			}
		}

		Buffer var28 = new Buffer(var0); // L: 116

		for (var10 = 0; var10 < 4; ++var10) { // L: 117
			for (int var11 = 0; var11 < 64; ++var11) { // L: 118
				for (int var12 = 0; var12 < 64; ++var12) { // L: 119
					if (var10 == var4 && var11 >= var5 && var11 < var5 + 8 && var12 >= var6 && var12 < var6 + 8) { // L: 120
						int var17 = var11 & 7; // L: 125
						int var18 = var12 & 7; // L: 126
						int var19 = var7 & 3; // L: 129
						int var16;
						if (var19 == 0) { // L: 130
							var16 = var17; // L: 131
						} else if (var19 == 1) { // L: 134
							var16 = var18; // L: 135
						} else if (var19 == 2) { // L: 138
							var16 = 7 - var17; // L: 139
						} else {
							var16 = 7 - var18; // L: 142
						}

						int var22 = var2 + var16; // L: 146
						int var25 = var11 & 7; // L: 149
						int var26 = var12 & 7; // L: 150
						int var27 = var7 & 3; // L: 153
						int var24;
						if (var27 == 0) { // L: 154
							var24 = var26; // L: 155
						} else if (var27 == 1) { // L: 158
							var24 = 7 - var25; // L: 159
						} else if (var27 == 2) { // L: 162
							var24 = 7 - var26; // L: 163
						} else {
							var24 = var25; // L: 166
						}

						class92.loadTerrain(var28, var1, var22, var3 + var24, 0, 0, var7); // L: 168
					} else {
						class92.loadTerrain(var28, 0, -1, -1, 0, 0, 0); // L: 170
					}
				}
			}
		}

	} // L: 174

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "-32"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0; // L: 1707
		Login.Login_response2 = var1; // L: 1708
		Login.Login_response3 = var2; // L: 1709
	} // L: 1710
}
