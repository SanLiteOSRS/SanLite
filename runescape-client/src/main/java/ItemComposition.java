import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("ItemComposition_archive")
	public static AbstractArchive ItemComposition_archive;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("ItemComposition_modelArchive")
	public static AbstractArchive ItemComposition_modelArchive;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1500320745
	)
	@Export("ItemComposition_fileCount")
	public static int ItemComposition_fileCount;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("ItemComposition_cached")
	static EvictingDualNodeHashTable ItemComposition_cached;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("ItemComposition_cachedModels")
	static EvictingDualNodeHashTable ItemComposition_cachedModels;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("ItemComposition_cachedSprites")
	public static EvictingDualNodeHashTable ItemComposition_cachedSprites;
	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "Lvd;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -876252989
	)
	@Export("id")
	int id;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -847246863
	)
	@Export("model")
	int model;
	@ObfuscatedName("an")
	@Export("name")
	public String name;
	@ObfuscatedName("ag")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("am")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("ad")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("at")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -775466263
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 40436899
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 483784047
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 785940763
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -26525799
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -520279693
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -60390481
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -298887493
	)
	@Export("price")
	public int price;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1693268231
	)
	@Export("maleModel")
	public int maleModel;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1655367387
	)
	@Export("maleModel1")
	public int maleModel1;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1148030715
	)
	@Export("maleModel2")
	public int maleModel2;
	@ObfuscatedName("bk")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("bm")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("bw")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1983492725
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -790148783
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -312064325
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 737668257
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 187802307
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1766625017
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1813164291
	)
	int field2207;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -327362371
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 268790487
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -567805451
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -542608861
	)
	@Export("team")
	int team;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 672776983
	)
	int field2184;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1412114359
	)
	int field2213;
	@ObfuscatedName("bl")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("bx")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1367031461
	)
	@Export("note")
	public int note;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -2106311777
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -1238507101
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 755226693
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -1096033909
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1466678955
	)
	public int field2221;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 467701485
	)
	public int field2224;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -1960907663
	)
	public int field2223;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 676254673
	)
	public int field2210;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lta;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("cx")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 683109337
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -1072524133
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -1159704961
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -1165913593
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
		this.isStackable = 0; // L: 47
		this.price = 1; // L: 48
		this.maleModel = -1; // L: 49
		this.maleModel1 = -1; // L: 50
		this.maleModel2 = -1; // L: 51
		this.isMembersOnly = false; // L: 52
		this.groundActions = new String[]{null, null, "Take", null, null}; // L: 53
		this.inventoryActions = new String[]{null, null, null, null, "Drop"}; // L: 54
		this.shiftClickIndex = -2; // L: 56
		this.femaleModel = -1; // L: 57
		this.femaleModel1 = -1; // L: 58
		this.femaleOffset = 0; // L: 59
		this.maleHeadModel = -1; // L: 60
		this.maleHeadModel2 = -1; // L: 61
		this.field2207 = 0; // L: 62
		this.femaleModel2 = -1; // L: 63
		this.femaleHeadModel = -1; // L: 64
		this.femaleHeadModel2 = -1; // L: 65
		this.team = -1; // L: 66
		this.field2184 = -1; // L: 67
		this.field2213 = -1; // L: 68
		this.note = -1; // L: 71
		this.noteTemplate = -1; // L: 72
		this.resizeX = 128; // L: 73
		this.resizeY = 128; // L: 74
		this.resizeZ = 128; // L: 75
		this.field2221 = 0; // L: 76
		this.field2224 = 0; // L: 77
		this.field2223 = 0; // L: 78
		this.field2210 = 0; // L: 79
		this.isTradable = false; // L: 81
		this.unnotedId = -1; // L: 82
		this.notedId = -1; // L: 83
		this.placeholder = -1; // L: 84
		this.placeholderTemplate = -1; // L: 85
	} // L: 87

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-649799587"
	)
	@Export("post")
	void post() {
		if (this.isStackable == 1) { // L: 130
			this.field2210 = 0;
		}

	} // L: 131

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "1893249645"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 135
			if (var2 == 0) { // L: 136
				return; // L: 139
			}

			this.decodeNext(var1, var2); // L: 137
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Luq;II)V",
		garbageValue = "1652121078"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 142
			this.model = var1.readUnsignedShort();
		} else if (var2 == 2) { // L: 143
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 144
			this.zoom2d = var1.readUnsignedShort();
		} else if (var2 == 5) { // L: 145
			this.xan2d = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 146
			this.yan2d = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 147
			this.offsetX2d = var1.readUnsignedShort(); // L: 148
			if (this.offsetX2d > 32767) { // L: 149
				this.offsetX2d -= 65536;
			}
		} else if (var2 == 8) { // L: 151
			this.offsetY2d = var1.readUnsignedShort(); // L: 152
			if (this.offsetY2d > 32767) { // L: 153
				this.offsetY2d -= 65536;
			}
		} else if (var2 == 9) { // L: 155
			var1.readStringCp1252NullTerminated(); // L: 156
		} else if (var2 == 11) { // L: 158
			this.isStackable = 1;
		} else if (var2 == 12) { // L: 159
			this.price = var1.readInt();
		} else if (var2 == 13) { // L: 160
			this.maleModel = var1.readUnsignedByte();
		} else if (var2 == 14) { // L: 161
			this.maleModel1 = var1.readUnsignedByte();
		} else if (var2 == 16) { // L: 162
			this.isMembersOnly = true;
		} else if (var2 == 23) { // L: 163
			this.femaleModel = var1.readUnsignedShort(); // L: 164
			this.femaleOffset = var1.readUnsignedByte(); // L: 165
		} else if (var2 == 24) { // L: 167
			this.femaleModel1 = var1.readUnsignedShort();
		} else if (var2 == 25) { // L: 168
			this.maleHeadModel = var1.readUnsignedShort(); // L: 169
			this.field2207 = var1.readUnsignedByte(); // L: 170
		} else if (var2 == 26) { // L: 172
			this.maleHeadModel2 = var1.readUnsignedShort();
		} else if (var2 == 27) { // L: 173
			this.maleModel2 = var1.readUnsignedByte();
		} else if (var2 >= 30 && var2 < 35) { // L: 174
			this.groundActions[var2 - 30] = var1.readStringCp1252NullTerminated(); // L: 175
			if (this.groundActions[var2 - 30].equalsIgnoreCase("Hidden")) { // L: 176
				this.groundActions[var2 - 30] = null;
			}
		} else if (var2 >= 35 && var2 < 40) { // L: 178
			this.inventoryActions[var2 - 35] = var1.readStringCp1252NullTerminated();
		} else {
			int var3;
			int var4;
			if (var2 == 40) { // L: 179
				var3 = var1.readUnsignedByte(); // L: 180
				this.recolorFrom = new short[var3]; // L: 181
				this.recolorTo = new short[var3]; // L: 182

				for (var4 = 0; var4 < var3; ++var4) { // L: 183
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 184
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 185
				}
			} else if (var2 == 41) { // L: 188
				var3 = var1.readUnsignedByte(); // L: 189
				this.retextureFrom = new short[var3]; // L: 190
				this.retextureTo = new short[var3]; // L: 191

				for (var4 = 0; var4 < var3; ++var4) { // L: 192
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 193
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 194
				}
			} else if (var2 == 42) { // L: 197
				this.shiftClickIndex = var1.readByte(); // L: 198
			} else if (var2 == 65) { // L: 200
				this.isTradable = true; // L: 201
			} else if (var2 == 75) { // L: 203
				this.field2210 = var1.readShort();
			} else if (var2 == 78) { // L: 204
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) { // L: 205
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 90) { // L: 206
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 91) { // L: 207
				this.field2184 = var1.readUnsignedShort();
			} else if (var2 == 92) { // L: 208
				this.team = var1.readUnsignedShort();
			} else if (var2 == 93) { // L: 209
				this.field2213 = var1.readUnsignedShort();
			} else if (var2 == 94) { // L: 210
				var1.readUnsignedShort(); // L: 211
			} else if (var2 == 95) { // L: 213
				this.zan2d = var1.readUnsignedShort();
			} else if (var2 == 97) { // L: 214
				this.note = var1.readUnsignedShort();
			} else if (var2 == 98) { // L: 215
				this.noteTemplate = var1.readUnsignedShort();
			} else if (var2 >= 100 && var2 < 110) { // L: 216
				if (this.countobj == null) { // L: 217
					this.countobj = new int[10]; // L: 218
					this.countco = new int[10]; // L: 219
				}

				this.countobj[var2 - 100] = var1.readUnsignedShort(); // L: 221
				this.countco[var2 - 100] = var1.readUnsignedShort(); // L: 222
			} else if (var2 == 110) { // L: 224
				this.resizeX = var1.readUnsignedShort();
			} else if (var2 == 111) { // L: 225
				this.resizeY = var1.readUnsignedShort();
			} else if (var2 == 112) { // L: 226
				this.resizeZ = var1.readUnsignedShort();
			} else if (var2 == 113) { // L: 227
				this.field2221 = var1.readByte();
			} else if (var2 == 114) { // L: 228
				this.field2224 = var1.readByte() * 5;
			} else if (var2 == 115) { // L: 229
				this.field2223 = var1.readUnsignedByte();
			} else if (var2 == 139) { // L: 230
				this.unnotedId = var1.readUnsignedShort();
			} else if (var2 == 140) { // L: 231
				this.notedId = var1.readUnsignedShort();
			} else if (var2 == 148) { // L: 232
				this.placeholder = var1.readUnsignedShort();
			} else if (var2 == 149) { // L: 233
				this.placeholderTemplate = var1.readUnsignedShort();
			} else if (var2 == 249) { // L: 234
				this.params = class324.readStringIntParameters(var1, this.params);
			}
		}

	} // L: 236

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lhb;Lhb;I)V",
		garbageValue = "-46950701"
	)
	@Export("genCert")
	void genCert(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 239
		this.zoom2d = var1.zoom2d; // L: 240
		this.xan2d = var1.xan2d; // L: 241
		this.yan2d = var1.yan2d; // L: 242
		this.zan2d = var1.zan2d; // L: 243
		this.offsetX2d = var1.offsetX2d; // L: 244
		this.offsetY2d = var1.offsetY2d; // L: 245
		this.recolorFrom = var1.recolorFrom; // L: 246
		this.recolorTo = var1.recolorTo; // L: 247
		this.retextureFrom = var1.retextureFrom; // L: 248
		this.retextureTo = var1.retextureTo; // L: 249
		this.name = var2.name; // L: 250
		this.isMembersOnly = var2.isMembersOnly; // L: 251
		this.price = var2.price; // L: 252
		this.isStackable = 1; // L: 253
	} // L: 254

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lhb;Lhb;B)V",
		garbageValue = "-37"
	)
	@Export("genBought")
	void genBought(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 257
		this.zoom2d = var1.zoom2d; // L: 258
		this.xan2d = var1.xan2d; // L: 259
		this.yan2d = var1.yan2d; // L: 260
		this.zan2d = var1.zan2d; // L: 261
		this.offsetX2d = var1.offsetX2d; // L: 262
		this.offsetY2d = var1.offsetY2d; // L: 263
		this.recolorFrom = var2.recolorFrom; // L: 264
		this.recolorTo = var2.recolorTo; // L: 265
		this.retextureFrom = var2.retextureFrom; // L: 266
		this.retextureTo = var2.retextureTo; // L: 267
		this.name = var2.name; // L: 268
		this.isMembersOnly = var2.isMembersOnly; // L: 269
		this.isStackable = var2.isStackable; // L: 270
		this.maleModel = var2.maleModel; // L: 271
		this.maleModel1 = var2.maleModel1; // L: 272
		this.maleModel2 = var2.maleModel2; // L: 273
		this.femaleModel = var2.femaleModel; // L: 274
		this.femaleModel1 = var2.femaleModel1; // L: 275
		this.femaleModel2 = var2.femaleModel2; // L: 276
		this.maleHeadModel = var2.maleHeadModel; // L: 277
		this.maleHeadModel2 = var2.maleHeadModel2; // L: 278
		this.femaleHeadModel = var2.femaleHeadModel; // L: 279
		this.femaleHeadModel2 = var2.femaleHeadModel2; // L: 280
		this.team = var2.team; // L: 281
		this.field2184 = var2.field2184; // L: 282
		this.field2213 = var2.field2213; // L: 283
		this.field2223 = var2.field2223; // L: 284
		this.groundActions = var2.groundActions; // L: 285
		this.field2210 = var2.field2210; // L: 286
		this.inventoryActions = new String[5]; // L: 287
		if (var2.inventoryActions != null) {
			for (int var3 = 0; var3 < 4; ++var3) { // L: 288
				this.inventoryActions[var3] = var2.inventoryActions[var3];
			}
		}

		this.inventoryActions[4] = "Discard"; // L: 289
		this.price = 0; // L: 290
	} // L: 291

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lhb;Lhb;I)V",
		garbageValue = "-1911210382"
	)
	@Export("genPlaceholder")
	void genPlaceholder(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 294
		this.zoom2d = var1.zoom2d; // L: 295
		this.xan2d = var1.xan2d; // L: 296
		this.yan2d = var1.yan2d; // L: 297
		this.zan2d = var1.zan2d; // L: 298
		this.offsetX2d = var1.offsetX2d; // L: 299
		this.offsetY2d = var1.offsetY2d; // L: 300
		this.recolorFrom = var1.recolorFrom; // L: 301
		this.recolorTo = var1.recolorTo; // L: 302
		this.retextureFrom = var1.retextureFrom; // L: 303
		this.retextureTo = var1.retextureTo; // L: 304
		this.isStackable = var1.isStackable; // L: 305
		this.name = var2.name; // L: 306
		this.price = 0; // L: 307
		this.isMembersOnly = false; // L: 308
		this.isTradable = false; // L: 309
	} // L: 310

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Lkf;",
		garbageValue = "-294923025"
	)
	@Export("getModelData")
	public final ModelData getModelData(int var1) {
		int var3;
		if (this.countobj != null && var1 > 1) { // L: 313
			int var2 = -1; // L: 314

			for (var3 = 0; var3 < 10; ++var3) { // L: 315
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 316
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 318
				return ArchiveDiskActionHandler.ItemComposition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(ItemComposition_modelArchive, this.model, 0); // L: 320
		if (var4 == null) { // L: 321
			return null;
		} else {
			if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) { // L: 322
				var4.resize(this.resizeX, this.resizeY, this.resizeZ);
			}

			if (this.recolorFrom != null) { // L: 323
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) { // L: 324
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]); // L: 325
				}
			}

			if (this.retextureFrom != null) { // L: 328
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) { // L: 329
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]); // L: 330
				}
			}

			return var4; // L: 333
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Lkz;",
		garbageValue = "-2054922799"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 337
			int var2 = -1; // L: 338

			for (int var3 = 0; var3 < 10; ++var3) { // L: 339
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 340
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 342
				return ArchiveDiskActionHandler.ItemComposition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemComposition_cachedModels.get((long)this.id); // L: 344
		if (var5 != null) { // L: 345
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(ItemComposition_modelArchive, this.model, 0); // L: 346
			if (var6 == null) { // L: 347
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) { // L: 348
					var6.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				int var4;
				if (this.recolorFrom != null) { // L: 349
					for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 350
						var6.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 351
					}
				}

				if (this.retextureFrom != null) { // L: 354
					for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 355
						var6.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 356
					}
				}

				var5 = var6.toModel(this.field2221 + 64, this.field2224 + 768, -50, -10, -50); // L: 359
				var5.isSingleTile = true; // L: 360
				ItemComposition_cachedModels.put(var5, (long)this.id); // L: 361
				return var5;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Lhb;",
		garbageValue = "1398519870"
	)
	@Export("getCountObj")
	public ItemComposition getCountObj(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 366
			int var2 = -1;

			for (int var3 = 0; var3 < 10; ++var3) {
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 369
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) {
				return ArchiveDiskActionHandler.ItemComposition_get(var2);
			}
		}

		return this;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "227209011"
	)
	public final boolean method3976(int var1) {
		int var2 = this.femaleModel;
		int var3 = this.femaleModel1;
		int var4 = this.femaleModel2;
		if (var1 == 1) { // L: 455
			var2 = this.maleHeadModel;
			var3 = this.maleHeadModel2; // L: 457
			var4 = this.femaleHeadModel;
		}

		if (var2 == -1) {
			return true;
		} else {
			boolean var5 = true;
			if (!ItemComposition_modelArchive.tryLoadFile(var2, 0)) { // L: 462
				var5 = false;
			}

			if (var3 != -1 && !ItemComposition_modelArchive.tryLoadFile(var3, 0)) {
				var5 = false;
			}

			if (var4 != -1 && !ItemComposition_modelArchive.tryLoadFile(var4, 0)) { // L: 464
				var5 = false;
			}

			return var5;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Lkf;",
		garbageValue = "-2134659808"
	)
	public final ModelData method3977(int var1) {
		int var2 = this.femaleModel; // L: 469
		int var3 = this.femaleModel1;
		int var4 = this.femaleModel2; // L: 471
		if (var1 == 1) {
			var2 = this.maleHeadModel;
			var3 = this.maleHeadModel2;
			var4 = this.femaleHeadModel;
		}

		if (var2 == -1) {
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(ItemComposition_modelArchive, var2, 0); // L: 478
			if (var3 != -1) {
				ModelData var6 = ModelData.ModelData_get(ItemComposition_modelArchive, var3, 0);
				if (var4 != -1) {
					ModelData var7 = ModelData.ModelData_get(ItemComposition_modelArchive, var4, 0); // L: 482
					ModelData[] var8 = new ModelData[]{var5, var6, var7};
					var5 = new ModelData(var8, 3); // L: 484
				} else {
					ModelData[] var10 = new ModelData[]{var5, var6};
					var5 = new ModelData(var10, 2);
				}
			}

			if (var1 == 0 && this.femaleOffset != 0) {
				var5.changeOffset(0, this.femaleOffset, 0);
			}

			if (var1 == 1 && this.field2207 != 0) {
				var5.changeOffset(0, this.field2207, 0);
			}

			int var9;
			if (this.recolorFrom != null) { // L: 493
				for (var9 = 0; var9 < this.recolorFrom.length; ++var9) {
					var5.recolor(this.recolorFrom[var9], this.recolorTo[var9]);
				}
			}

			if (this.retextureFrom != null) {
				for (var9 = 0; var9 < this.retextureFrom.length; ++var9) { // L: 499
					var5.retexture(this.retextureFrom[var9], this.retextureTo[var9]); // L: 500
				}
			}

			return var5;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-939245100"
	)
	public final boolean method3978(int var1) {
		int var2 = this.femaleHeadModel2;
		int var3 = this.team; // L: 508
		if (var1 == 1) {
			var2 = this.field2184;
			var3 = this.field2213;
		}

		if (var2 == -1) {
			return true;
		} else {
			boolean var4 = true; // L: 514
			if (!ItemComposition_modelArchive.tryLoadFile(var2, 0)) {
				var4 = false;
			}

			if (var3 != -1 && !ItemComposition_modelArchive.tryLoadFile(var3, 0)) {
				var4 = false;
			}

			return var4;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lkf;",
		garbageValue = "1217792188"
	)
	public final ModelData method4023(int var1) {
		int var2 = this.femaleHeadModel2;
		int var3 = this.team; // L: 522
		if (var1 == 1) {
			var2 = this.field2184;
			var3 = this.field2213;
		}

		if (var2 == -1) { // L: 527
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(ItemComposition_modelArchive, var2, 0);
			if (var3 != -1) {
				ModelData var5 = ModelData.ModelData_get(ItemComposition_modelArchive, var3, 0);
				ModelData[] var6 = new ModelData[]{var4, var5}; // L: 531
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1575903710"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params;
		int var3;
		if (var4 == null) {
			var3 = var2;
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1);
			if (var5 == null) { // L: 556
				var3 = var2;
			} else {
				var3 = var5.integer;
			}
		}

		return var3;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-528685286"
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "11"
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "14"
	)
	boolean method3983() {
		return this.recolorTo != null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "649898718"
	)
	boolean method3984() {
		return this.retextureTo != null; // L: 600
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lof;I)V",
		garbageValue = "1190985814"
	)
	public static void method4029(AbstractArchive var0) {
		FloorOverlayDefinition.FloorOverlayDefinition_archive = var0; // L: 24
	} // L: 25

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILkq;Liz;I)V",
		garbageValue = "255747182"
	)
	@Export("addObjects")
	static final void addObjects(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) { // L: 362 363 364
			if (var0 < Tiles.Tiles_minPlane) { // L: 367
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = class127.getObjectDefinition(var3); // L: 368
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) { // L: 371
				var9 = var8.sizeX; // L: 376
				var10 = var8.sizeY; // L: 377
			} else {
				var9 = var8.sizeY; // L: 372
				var10 = var8.sizeX; // L: 373
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) { // L: 383
				var11 = (var9 >> 1) + var1; // L: 384
				var12 = (var9 + 1 >> 1) + var1; // L: 385
			} else {
				var11 = var1; // L: 388
				var12 = var1 + 1; // L: 389
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) { // L: 391
				var13 = (var10 >> 1) + var2; // L: 392
				var14 = var2 + (var10 + 1 >> 1); // L: 393
			} else {
				var13 = var2; // L: 396
				var14 = var2 + 1; // L: 397
			}

			int[][] var15 = Tiles.Tiles_heights[var0]; // L: 399
			int var16 = var15[var11][var14] + var15[var11][var13] + var15[var12][var13] + var15[var12][var14] >> 2; // L: 400
			int var17 = (var1 << 7) + (var9 << 6); // L: 401
			int var18 = (var2 << 7) + (var10 << 6); // L: 402
			long var19 = class18.calculateTag(var1, var2, 2, var8.int1 == 0, var3); // L: 403
			int var21 = var5 + (var4 << 6); // L: 404
			if (var8.int3 == 1) { // L: 405
				var21 += 256;
			}

			if (var8.hasSound()) { // L: 406
				WorldMapScaleHandler.method5153(var0, var1, var2, var8, var4);
			}

			Object var29;
			if (var5 == 22) { // L: 407
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) { // L: 408
					if (var8.animationId == -1 && var8.transforms == null) { // L: 410
						var29 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 411
					}

					var6.newGroundObject(var0, var1, var2, var16, (Renderable)var29, var19, var21); // L: 412
					if (var8.interactType == 1 && var7 != null) { // L: 413
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else {
				int var28;
				if (var5 != 10 && var5 != 11) { // L: 416
					int[] var10000;
					if (var5 >= 12) { // L: 437
						if (var8.animationId == -1 && var8.transforms == null) { // L: 439
							var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 440
						}

						var6.method5430(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 441
						if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) { // L: 442
							var10000 = Tiles.field1050[var0][var1];
							var10000[var2] |= 2340;
						}

						if (var8.interactType != 0 && var7 != null) { // L: 443
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

					} else if (var5 == 0) { // L: 446
						if (var8.animationId == -1 && var8.transforms == null) { // L: 448
							var29 = var8.getEntity(0, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 449
						}

						var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1060[var4], 0, var19, var21); // L: 450
						if (var4 == 0) { // L: 451
							if (var8.clipped) { // L: 452
								class151.field1708[var0][var1][var2] = 50; // L: 453
								class151.field1708[var0][var1][var2 + 1] = 50; // L: 454
							}

							if (var8.modelClipped) { // L: 456
								var10000 = Tiles.field1050[var0][var1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 1) { // L: 458
							if (var8.clipped) { // L: 459
								class151.field1708[var0][var1][var2 + 1] = 50; // L: 460
								class151.field1708[var0][var1 + 1][var2 + 1] = 50; // L: 461
							}

							if (var8.modelClipped) { // L: 463
								var10000 = Tiles.field1050[var0][var1];
								var10000[1 + var2] |= 1170;
							}
						} else if (var4 == 2) { // L: 465
							if (var8.clipped) { // L: 466
								class151.field1708[var0][var1 + 1][var2] = 50; // L: 467
								class151.field1708[var0][var1 + 1][var2 + 1] = 50; // L: 468
							}

							if (var8.modelClipped) { // L: 470
								var10000 = Tiles.field1050[var0][var1 + 1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 3) { // L: 472
							if (var8.clipped) { // L: 473
								class151.field1708[var0][var1][var2] = 50; // L: 474
								class151.field1708[var0][var1 + 1][var2] = 50; // L: 475
							}

							if (var8.modelClipped) { // L: 477
								var10000 = Tiles.field1050[var0][var1];
								var10000[var2] |= 1170;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 479
							var7.method4504(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 480
							var6.method5436(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 1) { // L: 483
						if (var8.animationId == -1 && var8.transforms == null) { // L: 485
							var29 = var8.getEntity(1, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 486
						}

						var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1056[var4], 0, var19, var21); // L: 487
						if (var8.clipped) { // L: 488
							if (var4 == 0) { // L: 489
								class151.field1708[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) { // L: 490
								class151.field1708[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) { // L: 491
								class151.field1708[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) { // L: 492
								class151.field1708[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 494
							var7.method4504(var1, var2, var5, var4, var8.boolean1);
						}

					} else {
						int var22;
						if (var5 == 2) { // L: 497
							var22 = var4 + 1 & 3; // L: 498
							Object var24;
							Object var30;
							if (var8.animationId == -1 && var8.transforms == null) { // L: 501
								var30 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18); // L: 502
								var24 = var8.getEntity(2, var22, var15, var17, var16, var18); // L: 503
							} else {
								var30 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 506
								var24 = new DynamicObject(var3, 2, var22, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 507
							}

							var6.newWallObject(var0, var1, var2, var16, (Renderable)var30, (Renderable)var24, Tiles.field1060[var4], Tiles.field1060[var22], var19, var21); // L: 509
							if (var8.modelClipped) { // L: 510
								if (var4 == 0) { // L: 511
									var10000 = Tiles.field1050[var0][var1]; // L: 512
									var10000[var2] |= 585;
									var10000 = Tiles.field1050[var0][var1]; // L: 513
									var10000[1 + var2] |= 1170;
								} else if (var4 == 1) { // L: 515
									var10000 = Tiles.field1050[var0][var1]; // L: 516
									var10000[1 + var2] |= 1170;
									var10000 = Tiles.field1050[var0][var1 + 1]; // L: 517
									var10000[var2] |= 585;
								} else if (var4 == 2) { // L: 519
									var10000 = Tiles.field1050[var0][var1 + 1]; // L: 520
									var10000[var2] |= 585;
									var10000 = Tiles.field1050[var0][var1]; // L: 521
									var10000[var2] |= 1170;
								} else if (var4 == 3) { // L: 523
									var10000 = Tiles.field1050[var0][var1]; // L: 524
									var10000[var2] |= 1170;
									var10000 = Tiles.field1050[var0][var1]; // L: 525
									var10000[var2] |= 585;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 528
								var7.method4504(var1, var2, var5, var4, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 529
								var6.method5436(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 3) { // L: 532
							if (var8.animationId == -1 && var8.transforms == null) { // L: 534
								var29 = var8.getEntity(3, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 535
							}

							var6.newWallObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1056[var4], 0, var19, var21); // L: 536
							if (var8.clipped) { // L: 537
								if (var4 == 0) { // L: 538
									class151.field1708[var0][var1][var2 + 1] = 50;
								} else if (var4 == 1) { // L: 539
									class151.field1708[var0][var1 + 1][var2 + 1] = 50;
								} else if (var4 == 2) { // L: 540
									class151.field1708[var0][var1 + 1][var2] = 50;
								} else if (var4 == 3) { // L: 541
									class151.field1708[var0][var1][var2] = 50;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 543
								var7.method4504(var1, var2, var5, var4, var8.boolean1);
							}

						} else if (var5 == 9) { // L: 546
							if (var8.animationId == -1 && var8.transforms == null) { // L: 548
								var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 549
							}

							var6.method5430(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 550
							if (var8.interactType != 0 && var7 != null) { // L: 551
								var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 552
								var6.method5436(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 4) { // L: 555
							if (var8.animationId == -1 && var8.transforms == null) { // L: 557
								var29 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 558
							}

							var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1060[var4], 0, 0, 0, var19, var21); // L: 559
						} else {
							long var23;
							Object var25;
							if (var5 == 5) { // L: 562
								var22 = 16; // L: 563
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 564
								if (0L != var23) { // L: 565
									var22 = class127.getObjectDefinition(Message.Entity_unpackID(var23)).int2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 567
									var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 568
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field1060[var4], 0, var22 * Tiles.field1053[var4], var22 * Tiles.field1054[var4], var19, var21); // L: 569
							} else if (var5 == 6) { // L: 572
								var22 = 8; // L: 573
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 574
								if (var23 != 0L) { // L: 575
									var22 = class127.getObjectDefinition(Message.Entity_unpackID(var23)).int2 / 2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 577
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 578
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var22 * Tiles.field1055[var4], var22 * Tiles.field1046[var4], var19, var21); // L: 579
							} else if (var5 == 7) { // L: 582
								var28 = var4 + 2 & 3; // L: 584
								if (var8.animationId == -1 && var8.transforms == null) { // L: 585
									var29 = var8.getEntity(4, var28 + 4, var15, var17, var16, var18);
								} else {
									var29 = new DynamicObject(var3, 4, var28 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 586
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, 256, var28, 0, 0, var19, var21); // L: 587
							} else if (var5 == 8) { // L: 590
								var22 = 8; // L: 591
								var23 = var6.getWallObjectTag(var0, var1, var2); // L: 592
								if (var23 != 0L) { // L: 593
									var22 = class127.getObjectDefinition(Message.Entity_unpackID(var23)).int2 / 2;
								}

								int var27 = var4 + 2 & 3; // L: 596
								Object var26;
								if (var8.animationId == -1 && var8.transforms == null) { // L: 597
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18); // L: 598
									var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18); // L: 599
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 602
									var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 603
								}

								var6.newDecorativeObject(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var22 * Tiles.field1055[var4], var22 * Tiles.field1046[var4], var19, var21); // L: 605
							}
						}
					}
				} else {
					if (var8.animationId == -1 && var8.transforms == null) { // L: 418
						var29 = var8.getEntity(10, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 419
					}

					if (var29 != null && var6.method5430(var0, var1, var2, var16, var9, var10, (Renderable)var29, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) { // L: 420 421
						var28 = 15; // L: 422
						if (var29 instanceof Model) { // L: 423
							var28 = ((Model)var29).method5710() / 4; // L: 424
							if (var28 > 30) { // L: 425
								var28 = 30;
							}
						}

						for (int var31 = 0; var31 <= var9; ++var31) { // L: 427
							for (int var32 = 0; var32 <= var10; ++var32) { // L: 428
								if (var28 > class151.field1708[var0][var31 + var1][var32 + var2]) { // L: 429
									class151.field1708[var0][var31 + var1][var32 + var2] = (byte)var28;
								}
							}
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 434
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				}
			}
		}
	} // L: 414 435 444 481 495 530 544 553 560 570 580 588 606 608
}
