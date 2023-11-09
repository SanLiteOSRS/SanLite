import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("ItemComposition_modelArchive")
	public static AbstractArchive ItemComposition_modelArchive;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("ItemComposition_cached")
	static EvictingDualNodeHashTable ItemComposition_cached;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("ItemComposition_cachedModels")
	static EvictingDualNodeHashTable ItemComposition_cachedModels;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("ItemComposition_cachedSprites")
	static EvictingDualNodeHashTable ItemComposition_cachedSprites;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 381730175
	)
	@Export("id")
	public int id;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1188919195
	)
	@Export("model")
	int model;
	@ObfuscatedName("u")
	@Export("name")
	public String name;
	@ObfuscatedName("z")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("t")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("w")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("m")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -2004867373
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -564400895
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -2128917587
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -995800025
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -456223811
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1793293383
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 428914865
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1320342185
	)
	@Export("price")
	public int price;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -773000153
	)
	@Export("maleModel")
	public int maleModel;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 194955029
	)
	@Export("maleModel1")
	public int maleModel1;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -266815461
	)
	@Export("maleModel2")
	public int maleModel2;
	@ObfuscatedName("af")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("ad")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("av")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -70088537
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -2038600421
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 823298551
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1120978515
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 112283885
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 649793769
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -390425433
	)
	int field2168;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1338550989
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 144005275
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -622951905
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1939630815
	)
	int field2153;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -602955611
	)
	int field2192;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1691397067
	)
	int field2139;
	@ObfuscatedName("ar")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("ay")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1929572159
	)
	@Export("note")
	public int note;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -397288151
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1290906973
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -2118741535
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1588043511
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1118646827
	)
	public int field2171;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1161130279
	)
	public int field2183;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1393165911
	)
	@Export("team")
	public int team;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 84908239
	)
	public int field2182;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("bq")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1339342755
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1854658659
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -2092854765
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 93497133
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
		this.maleModel = -1; // L: 47
		this.maleModel1 = -1; // L: 48
		this.maleModel2 = -1; // L: 49
		this.isMembersOnly = false; // L: 50
		this.groundActions = new String[]{null, null, "Take", null, null}; // L: 51
		this.inventoryActions = new String[]{null, null, null, null, "Drop"}; // L: 52
		this.shiftClickIndex = -2; // L: 54
		this.femaleModel = -1; // L: 55
		this.femaleModel1 = -1; // L: 56
		this.femaleOffset = 0; // L: 57
		this.maleHeadModel = -1; // L: 58
		this.maleHeadModel2 = -1; // L: 59
		this.field2168 = 0; // L: 60
		this.femaleModel2 = -1; // L: 61
		this.femaleHeadModel = -1; // L: 62
		this.femaleHeadModel2 = -1; // L: 63
		this.field2153 = -1; // L: 64
		this.field2192 = -1; // L: 65
		this.field2139 = -1; // L: 66
		this.note = -1; // L: 69
		this.noteTemplate = -1; // L: 70
		this.resizeX = 128; // L: 71
		this.resizeY = 128; // L: 72
		this.resizeZ = 128; // L: 73
		this.field2171 = 0; // L: 74
		this.field2183 = 0; // L: 75
		this.team = 0; // L: 76
		this.field2182 = 0; // L: 77
		this.isTradable = false; // L: 79
		this.unnotedId = -1; // L: 80
		this.notedId = -1; // L: 81
		this.placeholder = -1; // L: 82
		this.placeholderTemplate = -1; // L: 83
	} // L: 85

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "104"
	)
	@Export("post")
	void post() {
		if (this.isStackable == 1) { // L: 126
			this.field2182 = 0;
		}

	} // L: 127

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-715052679"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 131
			if (var2 == 0) { // L: 132
				return; // L: 135
			}

			this.decodeNext(var1, var2); // L: 133
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lqr;II)V",
		garbageValue = "-238124530"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 138
			this.model = var1.readUnsignedShort();
		} else if (var2 == 2) { // L: 139
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 140
			this.zoom2d = var1.readUnsignedShort();
		} else if (var2 == 5) { // L: 141
			this.xan2d = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 142
			this.yan2d = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 143
			this.offsetX2d = var1.readUnsignedShort(); // L: 144
			if (this.offsetX2d > 32767) { // L: 145
				this.offsetX2d -= 65536;
			}
		} else if (var2 == 8) { // L: 147
			this.offsetY2d = var1.readUnsignedShort(); // L: 148
			if (this.offsetY2d > 32767) { // L: 149
				this.offsetY2d -= 65536;
			}
		} else if (var2 == 9) { // L: 151
			var1.readStringCp1252NullTerminated(); // L: 152
		} else if (var2 == 11) { // L: 154
			this.isStackable = 1;
		} else if (var2 == 12) { // L: 155
			this.price = var1.readInt();
		} else if (var2 == 13) { // L: 156
			this.maleModel = var1.readUnsignedByte();
		} else if (var2 == 14) { // L: 157
			this.maleModel1 = var1.readUnsignedByte();
		} else if (var2 == 16) { // L: 158
			this.isMembersOnly = true;
		} else if (var2 == 23) { // L: 159
			this.femaleModel = var1.readUnsignedShort(); // L: 160
			this.femaleOffset = var1.readUnsignedByte(); // L: 161
		} else if (var2 == 24) { // L: 163
			this.femaleModel1 = var1.readUnsignedShort();
		} else if (var2 == 25) { // L: 164
			this.maleHeadModel = var1.readUnsignedShort(); // L: 165
			this.field2168 = var1.readUnsignedByte(); // L: 166
		} else if (var2 == 26) { // L: 168
			this.maleHeadModel2 = var1.readUnsignedShort();
		} else if (var2 == 27) { // L: 169
			this.maleModel2 = var1.readUnsignedByte();
		} else if (var2 >= 30 && var2 < 35) { // L: 170
			this.groundActions[var2 - 30] = var1.readStringCp1252NullTerminated(); // L: 171
			if (this.groundActions[var2 - 30].equalsIgnoreCase("Hidden")) { // L: 172
				this.groundActions[var2 - 30] = null;
			}
		} else if (var2 >= 35 && var2 < 40) { // L: 174
			this.inventoryActions[var2 - 35] = var1.readStringCp1252NullTerminated();
		} else {
			int var3;
			int var4;
			if (var2 == 40) { // L: 175
				var3 = var1.readUnsignedByte(); // L: 176
				this.recolorFrom = new short[var3]; // L: 177
				this.recolorTo = new short[var3]; // L: 178

				for (var4 = 0; var4 < var3; ++var4) { // L: 179
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 180
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 181
				}
			} else if (var2 == 41) { // L: 184
				var3 = var1.readUnsignedByte(); // L: 185
				this.retextureFrom = new short[var3]; // L: 186
				this.retextureTo = new short[var3]; // L: 187

				for (var4 = 0; var4 < var3; ++var4) { // L: 188
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 189
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 190
				}
			} else if (var2 == 42) { // L: 193
				this.shiftClickIndex = var1.readByte(); // L: 194
			} else if (var2 == 65) { // L: 196
				this.isTradable = true;
			} else if (var2 == 75) { // L: 197
				this.field2182 = var1.readShort();
			} else if (var2 == 78) { // L: 198
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) { // L: 199
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 90) { // L: 200
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 91) {
				this.field2192 = var1.readUnsignedShort(); // L: 201
			} else if (var2 == 92) { // L: 202
				this.field2153 = var1.readUnsignedShort();
			} else if (var2 == 93) { // L: 203
				this.field2139 = var1.readUnsignedShort();
			} else if (var2 == 94) { // L: 204
				var1.readUnsignedShort(); // L: 205
			} else if (var2 == 95) { // L: 207
				this.zan2d = var1.readUnsignedShort();
			} else if (var2 == 97) { // L: 208
				this.note = var1.readUnsignedShort();
			} else if (var2 == 98) { // L: 209
				this.noteTemplate = var1.readUnsignedShort();
			} else if (var2 >= 100 && var2 < 110) { // L: 210
				if (this.countobj == null) { // L: 211
					this.countobj = new int[10]; // L: 212
					this.countco = new int[10]; // L: 213
				}

				this.countobj[var2 - 100] = var1.readUnsignedShort(); // L: 215
				this.countco[var2 - 100] = var1.readUnsignedShort(); // L: 216
			} else if (var2 == 110) { // L: 218
				this.resizeX = var1.readUnsignedShort();
			} else if (var2 == 111) { // L: 219
				this.resizeY = var1.readUnsignedShort();
			} else if (var2 == 112) { // L: 220
				this.resizeZ = var1.readUnsignedShort();
			} else if (var2 == 113) { // L: 221
				this.field2171 = var1.readByte();
			} else if (var2 == 114) { // L: 222
				this.field2183 = var1.readByte() * 5;
			} else if (var2 == 115) { // L: 223
				this.team = var1.readUnsignedByte();
			} else if (var2 == 139) { // L: 224
				this.unnotedId = var1.readUnsignedShort();
			} else if (var2 == 140) { // L: 225
				this.notedId = var1.readUnsignedShort();
			} else if (var2 == 148) { // L: 226
				this.placeholder = var1.readUnsignedShort();
			} else if (var2 == 149) { // L: 227
				this.placeholderTemplate = var1.readUnsignedShort();
			} else if (var2 == 249) { // L: 228
				this.params = FaceNormal.readStringIntParameters(var1, this.params);
			}
		}

	} // L: 230

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lgp;Lgp;I)V",
		garbageValue = "127293411"
	)
	@Export("genCert")
	void genCert(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 233
		this.zoom2d = var1.zoom2d; // L: 234
		this.xan2d = var1.xan2d; // L: 235
		this.yan2d = var1.yan2d; // L: 236
		this.zan2d = var1.zan2d; // L: 237
		this.offsetX2d = var1.offsetX2d; // L: 238
		this.offsetY2d = var1.offsetY2d; // L: 239
		this.recolorFrom = var1.recolorFrom; // L: 240
		this.recolorTo = var1.recolorTo; // L: 241
		this.retextureFrom = var1.retextureFrom; // L: 242
		this.retextureTo = var1.retextureTo; // L: 243
		this.name = var2.name; // L: 244
		this.isMembersOnly = var2.isMembersOnly; // L: 245
		this.price = var2.price; // L: 246
		this.isStackable = 1; // L: 247
	} // L: 248

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lgp;Lgp;I)V",
		garbageValue = "-62096237"
	)
	@Export("genBought")
	void genBought(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 251
		this.zoom2d = var1.zoom2d; // L: 252
		this.xan2d = var1.xan2d; // L: 253
		this.yan2d = var1.yan2d; // L: 254
		this.zan2d = var1.zan2d; // L: 255
		this.offsetX2d = var1.offsetX2d; // L: 256
		this.offsetY2d = var1.offsetY2d; // L: 257
		this.recolorFrom = var2.recolorFrom; // L: 258
		this.recolorTo = var2.recolorTo; // L: 259
		this.retextureFrom = var2.retextureFrom; // L: 260
		this.retextureTo = var2.retextureTo; // L: 261
		this.name = var2.name; // L: 262
		this.isMembersOnly = var2.isMembersOnly; // L: 263
		this.isStackable = var2.isStackable; // L: 264
		this.maleModel = var2.maleModel; // L: 265
		this.maleModel1 = var2.maleModel1; // L: 266
		this.maleModel2 = var2.maleModel2; // L: 267
		this.femaleModel = var2.femaleModel; // L: 268
		this.femaleModel1 = var2.femaleModel1; // L: 269
		this.femaleModel2 = var2.femaleModel2; // L: 270
		this.maleHeadModel = var2.maleHeadModel; // L: 271
		this.maleHeadModel2 = var2.maleHeadModel2; // L: 272
		this.femaleHeadModel = var2.femaleHeadModel; // L: 273
		this.femaleHeadModel2 = var2.femaleHeadModel2; // L: 274
		this.field2153 = var2.field2153; // L: 275
		this.field2192 = var2.field2192; // L: 276
		this.field2139 = var2.field2139; // L: 277
		this.team = var2.team; // L: 278
		this.groundActions = var2.groundActions; // L: 279
		this.field2182 = var2.field2182; // L: 280
		this.inventoryActions = new String[5]; // L: 281
		if (var2.inventoryActions != null) {
			for (int var3 = 0; var3 < 4; ++var3) { // L: 282
				this.inventoryActions[var3] = var2.inventoryActions[var3];
			}
		}

		this.inventoryActions[4] = "Discard"; // L: 283
		this.price = 0; // L: 284
	} // L: 285

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lgp;Lgp;B)V",
		garbageValue = "2"
	)
	@Export("genPlaceholder")
	void genPlaceholder(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 288
		this.zoom2d = var1.zoom2d; // L: 289
		this.xan2d = var1.xan2d; // L: 290
		this.yan2d = var1.yan2d; // L: 291
		this.zan2d = var1.zan2d; // L: 292
		this.offsetX2d = var1.offsetX2d; // L: 293
		this.offsetY2d = var1.offsetY2d; // L: 294
		this.recolorFrom = var1.recolorFrom; // L: 295
		this.recolorTo = var1.recolorTo; // L: 296
		this.retextureFrom = var1.retextureFrom; // L: 297
		this.retextureTo = var1.retextureTo; // L: 298
		this.isStackable = var1.isStackable; // L: 299
		this.name = var2.name; // L: 300
		this.price = 0; // L: 301
		this.isMembersOnly = false; // L: 302
		this.isTradable = false; // L: 303
	} // L: 304

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(II)Lgs;",
		garbageValue = "1620686713"
	)
	@Export("getModelData")
	public final ModelData getModelData(int var1) {
		int var3;
		if (this.countobj != null && var1 > 1) { // L: 307
			int var2 = -1; // L: 308

			for (var3 = 0; var3 < 10; ++var3) { // L: 309
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 310
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 312
				return MidiPcmStream.ItemComposition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(ItemComposition_modelArchive, this.model, 0); // L: 314
		if (var4 == null) { // L: 315
			return null;
		} else {
			if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) { // L: 316
				var4.resize(this.resizeX, this.resizeY, this.resizeZ);
			}

			if (this.recolorFrom != null) { // L: 317
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) { // L: 318
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]); // L: 319
				}
			}

			if (this.retextureFrom != null) { // L: 322
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) { // L: 323
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]); // L: 324
				}
			}

			return var4; // L: 327
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)Lha;",
		garbageValue = "76"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 331
			int var2 = -1; // L: 332

			for (int var3 = 0; var3 < 10; ++var3) { // L: 333
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 334
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 336
				return MidiPcmStream.ItemComposition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemComposition_cachedModels.get((long)this.id); // L: 338
		if (var5 != null) { // L: 339
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(ItemComposition_modelArchive, this.model, 0); // L: 340
			if (var6 == null) { // L: 341
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) { // L: 342
					var6.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				int var4;
				if (this.recolorFrom != null) { // L: 343
					for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 344
						var6.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 345
					}
				}

				if (this.retextureFrom != null) { // L: 348
					for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 349
						var6.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 350
					}
				}

				var5 = var6.toModel(this.field2171 + 64, this.field2183 + 768, -50, -10, -50); // L: 353
				var5.isSingleTile = true; // L: 354
				ItemComposition_cachedModels.put(var5, (long)this.id); // L: 355
				return var5; // L: 356
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(II)Lgp;",
		garbageValue = "-179106479"
	)
	@Export("getCountObj")
	public ItemComposition getCountObj(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 360
			int var2 = -1; // L: 361

			for (int var3 = 0; var3 < 10; ++var3) { // L: 362
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 363
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 365
				return MidiPcmStream.ItemComposition_get(var2);
			}
		}

		return this; // L: 367
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1180805546"
	)
	public final boolean method3826(int var1) {
		int var2 = this.femaleModel; // L: 452
		int var3 = this.femaleModel1; // L: 453
		int var4 = this.femaleModel2; // L: 454
		if (var1 == 1) { // L: 455
			var2 = this.maleHeadModel; // L: 456
			var3 = this.maleHeadModel2; // L: 457
			var4 = this.femaleHeadModel; // L: 458
		}

		if (var2 == -1) { // L: 460
			return true;
		} else {
			boolean var5 = true; // L: 461
			if (!ItemComposition_modelArchive.tryLoadFile(var2, 0)) { // L: 462
				var5 = false;
			}

			if (var3 != -1 && !ItemComposition_modelArchive.tryLoadFile(var3, 0)) { // L: 463
				var5 = false;
			}

			if (var4 != -1 && !ItemComposition_modelArchive.tryLoadFile(var4, 0)) { // L: 464
				var5 = false;
			}

			return var5; // L: 465
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)Lgs;",
		garbageValue = "-2057126376"
	)
	public final ModelData method3779(int var1) {
		int var2 = this.femaleModel; // L: 469
		int var3 = this.femaleModel1; // L: 470
		int var4 = this.femaleModel2; // L: 471
		if (var1 == 1) { // L: 472
			var2 = this.maleHeadModel; // L: 473
			var3 = this.maleHeadModel2; // L: 474
			var4 = this.femaleHeadModel; // L: 475
		}

		if (var2 == -1) { // L: 477
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(ItemComposition_modelArchive, var2, 0); // L: 478
			if (var3 != -1) { // L: 479
				ModelData var6 = ModelData.ModelData_get(ItemComposition_modelArchive, var3, 0); // L: 480
				if (var4 != -1) { // L: 481
					ModelData var7 = ModelData.ModelData_get(ItemComposition_modelArchive, var4, 0); // L: 482
					ModelData[] var8 = new ModelData[]{var5, var6, var7}; // L: 483
					var5 = new ModelData(var8, 3); // L: 484
				} else {
					ModelData[] var10 = new ModelData[]{var5, var6}; // L: 487
					var5 = new ModelData(var10, 2); // L: 488
				}
			}

			if (var1 == 0 && this.femaleOffset != 0) { // L: 491
				var5.changeOffset(0, this.femaleOffset, 0);
			}

			if (var1 == 1 && this.field2168 != 0) { // L: 492
				var5.changeOffset(0, this.field2168, 0);
			}

			int var9;
			if (this.recolorFrom != null) { // L: 493
				for (var9 = 0; var9 < this.recolorFrom.length; ++var9) { // L: 494
					var5.recolor(this.recolorFrom[var9], this.recolorTo[var9]); // L: 495
				}
			}

			if (this.retextureFrom != null) { // L: 498
				for (var9 = 0; var9 < this.retextureFrom.length; ++var9) { // L: 499
					var5.retexture(this.retextureFrom[var9], this.retextureTo[var9]); // L: 500
				}
			}

			return var5; // L: 503
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "693449098"
	)
	public final boolean method3824(int var1) {
		int var2 = this.femaleHeadModel2; // L: 507
		int var3 = this.field2153; // L: 508
		if (var1 == 1) { // L: 509
			var2 = this.field2192; // L: 510
			var3 = this.field2139; // L: 511
		}

		if (var2 == -1) { // L: 513
			return true;
		} else {
			boolean var4 = true; // L: 514
			if (!ItemComposition_modelArchive.tryLoadFile(var2, 0)) { // L: 515
				var4 = false;
			}

			if (var3 != -1 && !ItemComposition_modelArchive.tryLoadFile(var3, 0)) { // L: 516
				var4 = false;
			}

			return var4; // L: 517
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgs;",
		garbageValue = "58"
	)
	public final ModelData method3787(int var1) {
		int var2 = this.femaleHeadModel2; // L: 521
		int var3 = this.field2153; // L: 522
		if (var1 == 1) { // L: 523
			var2 = this.field2192; // L: 524
			var3 = this.field2139; // L: 525
		}

		if (var2 == -1) { // L: 527
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(ItemComposition_modelArchive, var2, 0); // L: 528
			if (var3 != -1) { // L: 529
				ModelData var5 = ModelData.ModelData_get(ItemComposition_modelArchive, var3, 0); // L: 530
				ModelData[] var6 = new ModelData[]{var4, var5}; // L: 531
				var4 = new ModelData(var6, 2); // L: 532
			}

			int var7;
			if (this.recolorFrom != null) { // L: 534
				for (var7 = 0; var7 < this.recolorFrom.length; ++var7) { // L: 535
					var4.recolor(this.recolorFrom[var7], this.recolorTo[var7]); // L: 536
				}
			}

			if (this.retextureFrom != null) { // L: 539
				for (var7 = 0; var7 < this.retextureFrom.length; ++var7) { // L: 540
					var4.retexture(this.retextureFrom[var7], this.retextureTo[var7]); // L: 541
				}
			}

			return var4; // L: 544
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-213462779"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return Language.method6584(this.params, var1, var2); // L: 548
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1778906702"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return FriendLoginUpdate.method7304(this.params, var1, var2); // L: 552
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2011527799"
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1847249504"
	)
	boolean method3785() {
		return this.recolorTo != null; // L: 579
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-8699"
	)
	boolean method3821() {
		return this.retextureTo != null; // L: 583
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILkn;IIIII[FB)Lkn;",
		garbageValue = "45"
	)
	static Widget method3845(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget(); // L: 913
		var8.type = var0; // L: 914
		var8.parentId = var1.id; // L: 915
		var8.childIndex = var2; // L: 916
		var8.isIf3 = true; // L: 917
		var8.xAlignment = var3; // L: 918
		var8.yAlignment = var4; // L: 919
		var8.widthAlignment = var5; // L: 920
		var8.heightAlignment = var6; // L: 921
		var8.rawX = (int)(var7[0] * (float)var1.width); // L: 922
		var8.rawY = (int)((float)var1.height * var7[1]); // L: 923
		var8.rawWidth = (int)((float)var1.width * var7[2]); // L: 924
		var8.rawHeight = (int)((float)var1.height * var7[3]); // L: 925
		return var8; // L: 926
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "47"
	)
	static void method3786() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) { // L: 12058
			int var1 = var0.group; // L: 12059
			if (WorldMapManager.loadInterface(var1)) { // L: 12060
				boolean var2 = true; // L: 12061
				Widget[] var3 = Widget.Widget_interfaceComponents[var1]; // L: 12062

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) { // L: 12063
					if (var3[var4] != null) { // L: 12064
						var2 = var3[var4].isIf3; // L: 12065
						break;
					}
				}

				if (!var2) { // L: 12069
					var4 = (int)var0.key; // L: 12070
					Widget var5 = class281.getWidget(var4); // L: 12071
					if (var5 != null) { // L: 12072
						class143.invalidateWidget(var5);
					}
				}
			}
		}

	} // L: 12076
}
